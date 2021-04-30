//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Ki 200
// Model Creator: 
// Created on: 18.12.2016 - 22:13:41
// Last changed on: 18.12.2016 - 22:13:41

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelJ8M extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelJ8M() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[394];
		tailModel = new ModelRendererTurbo[25];
		leftWingModel = new ModelRendererTurbo[61];
		rightWingModel = new ModelRendererTurbo[49];
		yawFlapModel = new ModelRendererTurbo[4];
		pitchFlapLeftWingModel = new ModelRendererTurbo[9];
		pitchFlapRightWingModel = new ModelRendererTurbo[3];
		bodyWheelModel = new ModelRendererTurbo[19];
		bodyDoorOpenModel = new ModelRendererTurbo[9];
		bodyDoorCloseModel = new ModelRendererTurbo[10];

		initbodyModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inityawFlapModel_1();
		initpitchFlapLeftWingModel_1();
		initpitchFlapRightWingModel_1();
		initbodyWheelModel_1();
		initbodyDoorOpenModel_1();
		initbodyDoorCloseModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 19, 290, textureX, textureY); // Box 12
		bodyModel[1] = new ModelRendererTurbo(this, 56, 290, textureX, textureY); // Box 13
		bodyModel[2] = new ModelRendererTurbo(this, 50, 193, textureX, textureY); // Box 18
		bodyModel[3] = new ModelRendererTurbo(this, 50, 193, textureX, textureY); // Box 19
		bodyModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 20
		bodyModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 21
		bodyModel[6] = new ModelRendererTurbo(this, 333, 377, textureX, textureY); // Box 22
		bodyModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 23
		bodyModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 24
		bodyModel[9] = new ModelRendererTurbo(this, 50, 193, textureX, textureY); // Box 25
		bodyModel[10] = new ModelRendererTurbo(this, 50, 193, textureX, textureY); // Box 26
		bodyModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 37
		bodyModel[12] = new ModelRendererTurbo(this, 323, 344, textureX, textureY); // Box 47
		bodyModel[13] = new ModelRendererTurbo(this, 287, 355, textureX, textureY); // Box 48
		bodyModel[14] = new ModelRendererTurbo(this, 42, 349, textureX, textureY); // Box 55
		bodyModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 57
		bodyModel[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 58
		bodyModel[17] = new ModelRendererTurbo(this, 7, 349, textureX, textureY); // Box 59
		bodyModel[18] = new ModelRendererTurbo(this, 89, 349, textureX, textureY); // Box 60
		bodyModel[19] = new ModelRendererTurbo(this, 173, 352, textureX, textureY); // Box 61
		bodyModel[20] = new ModelRendererTurbo(this, 223, 353, textureX, textureY); // Box 62
		bodyModel[21] = new ModelRendererTurbo(this, 131, 348, textureX, textureY); // Box 2
		bodyModel[22] = new ModelRendererTurbo(this, 11, 289, textureX, textureY); // Box 0
		bodyModel[23] = new ModelRendererTurbo(this, 187, 295, textureX, textureY); // Box 2
		bodyModel[24] = new ModelRendererTurbo(this, 187, 297, textureX, textureY); // Box 3
		bodyModel[25] = new ModelRendererTurbo(this, 187, 295, textureX, textureY); // Box 4
		bodyModel[26] = new ModelRendererTurbo(this, 187, 295, textureX, textureY); // Box 5
		bodyModel[27] = new ModelRendererTurbo(this, 96, 313, textureX, textureY); // Box 6
		bodyModel[28] = new ModelRendererTurbo(this, 115, 313, textureX, textureY); // Box 7
		bodyModel[29] = new ModelRendererTurbo(this, 144, 313, textureX, textureY); // Box 8
		bodyModel[30] = new ModelRendererTurbo(this, 112, 337, textureX, textureY); // Box 9
		bodyModel[31] = new ModelRendererTurbo(this, 131, 337, textureX, textureY); // Box 10
		bodyModel[32] = new ModelRendererTurbo(this, 156, 337, textureX, textureY); // Box 11
		bodyModel[33] = new ModelRendererTurbo(this, 184, 331, textureX, textureY); // Box 12
		bodyModel[34] = new ModelRendererTurbo(this, 10, 419, textureX, textureY); // Box 13
		bodyModel[35] = new ModelRendererTurbo(this, 51, 419, textureX, textureY); // Box 15
		bodyModel[36] = new ModelRendererTurbo(this, 92, 419, textureX, textureY); // Box 16
		bodyModel[37] = new ModelRendererTurbo(this, 135, 419, textureX, textureY); // Box 17
		bodyModel[38] = new ModelRendererTurbo(this, 185, 296, textureX, textureY); // Box 18
		bodyModel[39] = new ModelRendererTurbo(this, 187, 297, textureX, textureY); // Box 19
		bodyModel[40] = new ModelRendererTurbo(this, 185, 296, textureX, textureY); // Box 20
		bodyModel[41] = new ModelRendererTurbo(this, 88, 377, textureX, textureY); // Box 22
		bodyModel[42] = new ModelRendererTurbo(this, 131, 377, textureX, textureY); // Box 23
		bodyModel[43] = new ModelRendererTurbo(this, 166, 377, textureX, textureY); // Box 24
		bodyModel[44] = new ModelRendererTurbo(this, 185, 296, textureX, textureY); // Box 25
		bodyModel[45] = new ModelRendererTurbo(this, 170, 419, textureX, textureY); // Box 26
		bodyModel[46] = new ModelRendererTurbo(this, 219, 419, textureX, textureY); // Box 27
		bodyModel[47] = new ModelRendererTurbo(this, 185, 296, textureX, textureY); // Box 28
		bodyModel[48] = new ModelRendererTurbo(this, 213, 377, textureX, textureY); // Box 29
		bodyModel[49] = new ModelRendererTurbo(this, 279, 419, textureX, textureY); // Box 30
		bodyModel[50] = new ModelRendererTurbo(this, 187, 297, textureX, textureY); // Box 31
		bodyModel[51] = new ModelRendererTurbo(this, 274, 377, textureX, textureY); // Box 32
		bodyModel[52] = new ModelRendererTurbo(this, 333, 377, textureX, textureY); // Box 33
		bodyModel[53] = new ModelRendererTurbo(this, 187, 297, textureX, textureY); // Box 34
		bodyModel[54] = new ModelRendererTurbo(this, 338, 419, textureX, textureY); // Box 35
		bodyModel[55] = new ModelRendererTurbo(this, 8, 305, textureX, textureY); // Box 1
		bodyModel[56] = new ModelRendererTurbo(this, 274, 396, textureX, textureY); // Box 3
		bodyModel[57] = new ModelRendererTurbo(this, 187, 297, textureX, textureY); // Box 4
		bodyModel[58] = new ModelRendererTurbo(this, 279, 419, textureX, textureY); // Box 5
		bodyModel[59] = new ModelRendererTurbo(this, 213, 396, textureX, textureY); // Box 6
		bodyModel[60] = new ModelRendererTurbo(this, 185, 296, textureX, textureY); // Box 7
		bodyModel[61] = new ModelRendererTurbo(this, 219, 419, textureX, textureY); // Box 8
		bodyModel[62] = new ModelRendererTurbo(this, 170, 419, textureX, textureY); // Box 9
		bodyModel[63] = new ModelRendererTurbo(this, 185, 296, textureX, textureY); // Box 10
		bodyModel[64] = new ModelRendererTurbo(this, 166, 396, textureX, textureY); // Box 11
		bodyModel[65] = new ModelRendererTurbo(this, 131, 396, textureX, textureY); // Box 12
		bodyModel[66] = new ModelRendererTurbo(this, 185, 296, textureX, textureY); // Box 13
		bodyModel[67] = new ModelRendererTurbo(this, 135, 419, textureX, textureY); // Box 14
		bodyModel[68] = new ModelRendererTurbo(this, 92, 419, textureX, textureY); // Box 15
		bodyModel[69] = new ModelRendererTurbo(this, 185, 296, textureX, textureY); // Box 16
		bodyModel[70] = new ModelRendererTurbo(this, 88, 396, textureX, textureY); // Box 17
		bodyModel[71] = new ModelRendererTurbo(this, 45, 396, textureX, textureY); // Box 18
		bodyModel[72] = new ModelRendererTurbo(this, 187, 297, textureX, textureY); // Box 19
		bodyModel[73] = new ModelRendererTurbo(this, 51, 419, textureX, textureY); // Box 20
		bodyModel[74] = new ModelRendererTurbo(this, 10, 419, textureX, textureY); // Box 21
		bodyModel[75] = new ModelRendererTurbo(this, 187, 297, textureX, textureY); // Box 22
		bodyModel[76] = new ModelRendererTurbo(this, 5, 396, textureX, textureY); // Box 23
		bodyModel[77] = new ModelRendererTurbo(this, 55, 317, textureX, textureY); // Box 24
		bodyModel[78] = new ModelRendererTurbo(this, 187, 295, textureX, textureY); // Box 25
		bodyModel[79] = new ModelRendererTurbo(this, 82, 330, textureX, textureY); // Box 26
		bodyModel[80] = new ModelRendererTurbo(this, 59, 337, textureX, textureY); // Box 27
		bodyModel[81] = new ModelRendererTurbo(this, 30, 337, textureX, textureY); // Box 28
		bodyModel[82] = new ModelRendererTurbo(this, 187, 295, textureX, textureY); // Box 29
		bodyModel[83] = new ModelRendererTurbo(this, 26, 317, textureX, textureY); // Box 30
		bodyModel[84] = new ModelRendererTurbo(this, 7, 317, textureX, textureY); // Box 31
		bodyModel[85] = new ModelRendererTurbo(this, 187, 295, textureX, textureY); // Box 32
		bodyModel[86] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Box 33
		bodyModel[87] = new ModelRendererTurbo(this, 8, 305, textureX, textureY); // Box 34
		bodyModel[88] = new ModelRendererTurbo(this, 333, 396, textureX, textureY); // Box 35
		bodyModel[89] = new ModelRendererTurbo(this, 187, 297, textureX, textureY); // Box 36
		bodyModel[90] = new ModelRendererTurbo(this, 338, 419, textureX, textureY); // Box 37
		bodyModel[91] = new ModelRendererTurbo(this, 264, 263, textureX, textureY); // Box 38
		bodyModel[92] = new ModelRendererTurbo(this, 264, 263, textureX, textureY); // Box 39
		bodyModel[93] = new ModelRendererTurbo(this, 264, 263, textureX, textureY); // Box 40
		bodyModel[94] = new ModelRendererTurbo(this, 264, 263, textureX, textureY); // Box 42
		bodyModel[95] = new ModelRendererTurbo(this, 264, 263, textureX, textureY); // Box 43
		bodyModel[96] = new ModelRendererTurbo(this, 264, 263, textureX, textureY); // Box 45
		bodyModel[97] = new ModelRendererTurbo(this, 264, 263, textureX, textureY); // Box 46
		bodyModel[98] = new ModelRendererTurbo(this, 264, 263, textureX, textureY); // Box 47
		bodyModel[99] = new ModelRendererTurbo(this, 245, 263, textureX, textureY); // Box 0
		bodyModel[100] = new ModelRendererTurbo(this, 237, 263, textureX, textureY); // Box 1
		bodyModel[101] = new ModelRendererTurbo(this, 255, 263, textureX, textureY); // Box 2
		bodyModel[102] = new ModelRendererTurbo(this, 263, 319, textureX, textureY); // Box 0
		bodyModel[103] = new ModelRendererTurbo(this, 263, 319, textureX, textureY); // Box 2
		bodyModel[104] = new ModelRendererTurbo(this, 263, 319, textureX, textureY); // Box 3
		bodyModel[105] = new ModelRendererTurbo(this, 263, 319, textureX, textureY); // Box 4
		bodyModel[106] = new ModelRendererTurbo(this, 263, 319, textureX, textureY); // Box 5
		bodyModel[107] = new ModelRendererTurbo(this, 263, 319, textureX, textureY); // Box 6
		bodyModel[108] = new ModelRendererTurbo(this, 263, 319, textureX, textureY); // Box 7
		bodyModel[109] = new ModelRendererTurbo(this, 263, 319, textureX, textureY); // Box 8
		bodyModel[110] = new ModelRendererTurbo(this, 263, 319, textureX, textureY); // Box 9
		bodyModel[111] = new ModelRendererTurbo(this, 263, 319, textureX, textureY); // Box 10
		bodyModel[112] = new ModelRendererTurbo(this, 263, 319, textureX, textureY); // Box 11
		bodyModel[113] = new ModelRendererTurbo(this, 263, 319, textureX, textureY); // Box 12
		bodyModel[114] = new ModelRendererTurbo(this, 263, 319, textureX, textureY); // Box 13
		bodyModel[115] = new ModelRendererTurbo(this, 263, 319, textureX, textureY); // Box 14
		bodyModel[116] = new ModelRendererTurbo(this, 263, 319, textureX, textureY); // Box 15
		bodyModel[117] = new ModelRendererTurbo(this, 263, 319, textureX, textureY); // Box 16
		bodyModel[118] = new ModelRendererTurbo(this, 263, 319, textureX, textureY); // Box 17
		bodyModel[119] = new ModelRendererTurbo(this, 263, 319, textureX, textureY); // Box 18
		bodyModel[120] = new ModelRendererTurbo(this, 263, 319, textureX, textureY); // Box 20
		bodyModel[121] = new ModelRendererTurbo(this, 263, 319, textureX, textureY); // Box 21
		bodyModel[122] = new ModelRendererTurbo(this, 263, 319, textureX, textureY); // Box 0
		bodyModel[123] = new ModelRendererTurbo(this, 263, 319, textureX, textureY); // Box 1
		bodyModel[124] = new ModelRendererTurbo(this, 263, 319, textureX, textureY); // Box 2
		bodyModel[125] = new ModelRendererTurbo(this, 263, 319, textureX, textureY); // Box 3
		bodyModel[126] = new ModelRendererTurbo(this, 263, 319, textureX, textureY); // Box 4
		bodyModel[127] = new ModelRendererTurbo(this, 263, 319, textureX, textureY); // Box 5
		bodyModel[128] = new ModelRendererTurbo(this, 263, 319, textureX, textureY); // Box 6
		bodyModel[129] = new ModelRendererTurbo(this, 263, 319, textureX, textureY); // Box 7
		bodyModel[130] = new ModelRendererTurbo(this, 263, 319, textureX, textureY); // Box 8
		bodyModel[131] = new ModelRendererTurbo(this, 263, 319, textureX, textureY); // Box 9
		bodyModel[132] = new ModelRendererTurbo(this, 263, 319, textureX, textureY); // Box 10
		bodyModel[133] = new ModelRendererTurbo(this, 263, 319, textureX, textureY); // Box 11
		bodyModel[134] = new ModelRendererTurbo(this, 263, 319, textureX, textureY); // Box 12
		bodyModel[135] = new ModelRendererTurbo(this, 263, 319, textureX, textureY); // Box 13
		bodyModel[136] = new ModelRendererTurbo(this, 263, 319, textureX, textureY); // Box 14
		bodyModel[137] = new ModelRendererTurbo(this, 263, 319, textureX, textureY); // Box 15
		bodyModel[138] = new ModelRendererTurbo(this, 263, 319, textureX, textureY); // Box 16
		bodyModel[139] = new ModelRendererTurbo(this, 263, 319, textureX, textureY); // Box 17
		bodyModel[140] = new ModelRendererTurbo(this, 263, 319, textureX, textureY); // Box 18
		bodyModel[141] = new ModelRendererTurbo(this, 263, 319, textureX, textureY); // Box 19
		bodyModel[142] = new ModelRendererTurbo(this, 383, 67, textureX, textureY); // Box 20
		bodyModel[143] = new ModelRendererTurbo(this, 383, 67, textureX, textureY); // Box 21
		bodyModel[144] = new ModelRendererTurbo(this, 383, 67, textureX, textureY); // Box 22
		bodyModel[145] = new ModelRendererTurbo(this, 383, 67, textureX, textureY); // Box 23
		bodyModel[146] = new ModelRendererTurbo(this, 383, 67, textureX, textureY); // Box 24
		bodyModel[147] = new ModelRendererTurbo(this, 383, 67, textureX, textureY); // Box 25
		bodyModel[148] = new ModelRendererTurbo(this, 383, 67, textureX, textureY); // Box 26
		bodyModel[149] = new ModelRendererTurbo(this, 389, 239, textureX, textureY); // Box 28
		bodyModel[150] = new ModelRendererTurbo(this, 389, 239, textureX, textureY); // Box 29
		bodyModel[151] = new ModelRendererTurbo(this, 389, 239, textureX, textureY); // Box 30
		bodyModel[152] = new ModelRendererTurbo(this, 389, 239, textureX, textureY); // Box 31
		bodyModel[153] = new ModelRendererTurbo(this, 389, 239, textureX, textureY); // Box 32
		bodyModel[154] = new ModelRendererTurbo(this, 389, 239, textureX, textureY); // Box 33
		bodyModel[155] = new ModelRendererTurbo(this, 389, 239, textureX, textureY); // Box 34
		bodyModel[156] = new ModelRendererTurbo(this, 383, 67, textureX, textureY); // Box 35
		bodyModel[157] = new ModelRendererTurbo(this, 389, 239, textureX, textureY); // Box 36
		bodyModel[158] = new ModelRendererTurbo(this, 383, 67, textureX, textureY); // Box 53
		bodyModel[159] = new ModelRendererTurbo(this, 389, 239, textureX, textureY); // Box 54
		bodyModel[160] = new ModelRendererTurbo(this, 383, 67, textureX, textureY); // Box 55
		bodyModel[161] = new ModelRendererTurbo(this, 389, 239, textureX, textureY); // Box 56
		bodyModel[162] = new ModelRendererTurbo(this, 389, 239, textureX, textureY); // Box 57
		bodyModel[163] = new ModelRendererTurbo(this, 383, 67, textureX, textureY); // Box 58
		bodyModel[164] = new ModelRendererTurbo(this, 383, 67, textureX, textureY); // Box 59
		bodyModel[165] = new ModelRendererTurbo(this, 389, 239, textureX, textureY); // Box 60
		bodyModel[166] = new ModelRendererTurbo(this, 389, 239, textureX, textureY); // Box 61
		bodyModel[167] = new ModelRendererTurbo(this, 383, 67, textureX, textureY); // Box 62
		bodyModel[168] = new ModelRendererTurbo(this, 383, 67, textureX, textureY); // Box 63
		bodyModel[169] = new ModelRendererTurbo(this, 389, 239, textureX, textureY); // Box 64
		bodyModel[170] = new ModelRendererTurbo(this, 389, 239, textureX, textureY); // Box 65
		bodyModel[171] = new ModelRendererTurbo(this, 383, 67, textureX, textureY); // Box 66
		bodyModel[172] = new ModelRendererTurbo(this, 383, 67, textureX, textureY); // Box 67
		bodyModel[173] = new ModelRendererTurbo(this, 389, 239, textureX, textureY); // Box 68
		bodyModel[174] = new ModelRendererTurbo(this, 50, 193, textureX, textureY); // Box 69
		bodyModel[175] = new ModelRendererTurbo(this, 50, 193, textureX, textureY); // Box 70
		bodyModel[176] = new ModelRendererTurbo(this, 152, 206, textureX, textureY); // Box 71
		bodyModel[177] = new ModelRendererTurbo(this, 50, 193, textureX, textureY); // Box 72
		bodyModel[178] = new ModelRendererTurbo(this, 111, 204, textureX, textureY); // Box 73
		bodyModel[179] = new ModelRendererTurbo(this, 111, 237, textureX, textureY); // Box 74
		bodyModel[180] = new ModelRendererTurbo(this, 46, 237, textureX, textureY); // Box 75
		bodyModel[181] = new ModelRendererTurbo(this, 160, 232, textureX, textureY); // Box 76
		bodyModel[182] = new ModelRendererTurbo(this, 160, 222, textureX, textureY); // Box 77
		bodyModel[183] = new ModelRendererTurbo(this, 151, 190, textureX, textureY); // Box 79
		bodyModel[184] = new ModelRendererTurbo(this, 50, 193, textureX, textureY); // Box 82
		bodyModel[185] = new ModelRendererTurbo(this, 46, 221, textureX, textureY); // Box 83
		bodyModel[186] = new ModelRendererTurbo(this, 111, 221, textureX, textureY); // Box 84
		bodyModel[187] = new ModelRendererTurbo(this, 50, 193, textureX, textureY); // Box 85
		bodyModel[188] = new ModelRendererTurbo(this, 50, 193, textureX, textureY); // Box 88
		bodyModel[189] = new ModelRendererTurbo(this, 111, 188, textureX, textureY); // Box 89
		bodyModel[190] = new ModelRendererTurbo(this, 59, 212, textureX, textureY); // Box 0
		bodyModel[191] = new ModelRendererTurbo(this, 49, 212, textureX, textureY); // Box 1
		bodyModel[192] = new ModelRendererTurbo(this, 69, 212, textureX, textureY); // Box 2
		bodyModel[193] = new ModelRendererTurbo(this, 7, 443, textureX, textureY); // Box 0
		bodyModel[194] = new ModelRendererTurbo(this, 7, 443, textureX, textureY); // Box 1
		bodyModel[195] = new ModelRendererTurbo(this, 7, 443, textureX, textureY); // Box 2
		bodyModel[196] = new ModelRendererTurbo(this, 7, 443, textureX, textureY); // Box 3
		bodyModel[197] = new ModelRendererTurbo(this, 7, 443, textureX, textureY); // Box 4
		bodyModel[198] = new ModelRendererTurbo(this, 7, 443, textureX, textureY); // Box 5
		bodyModel[199] = new ModelRendererTurbo(this, 7, 443, textureX, textureY); // Box 6
		bodyModel[200] = new ModelRendererTurbo(this, 7, 443, textureX, textureY); // Box 7
		bodyModel[201] = new ModelRendererTurbo(this, 11, 473, textureX, textureY); // Box 8
		bodyModel[202] = new ModelRendererTurbo(this, 36, 473, textureX, textureY); // Box 10
		bodyModel[203] = new ModelRendererTurbo(this, 124, 439, textureX, textureY); // Box 11
		bodyModel[204] = new ModelRendererTurbo(this, 159, 439, textureX, textureY); // Box 12
		bodyModel[205] = new ModelRendererTurbo(this, 80, 439, textureX, textureY); // Box 13
		bodyModel[206] = new ModelRendererTurbo(this, 93, 439, textureX, textureY); // Box 14
		bodyModel[207] = new ModelRendererTurbo(this, 67, 439, textureX, textureY); // Box 15
		bodyModel[208] = new ModelRendererTurbo(this, 204, 439, textureX, textureY); // Box 16
		bodyModel[209] = new ModelRendererTurbo(this, 218, 439, textureX, textureY); // Box 17
		bodyModel[210] = new ModelRendererTurbo(this, 250, 439, textureX, textureY); // Box 18
		bodyModel[211] = new ModelRendererTurbo(this, 305, 439, textureX, textureY); // Box 19
		bodyModel[212] = new ModelRendererTurbo(this, 67, 458, textureX, textureY); // Box 20
		bodyModel[213] = new ModelRendererTurbo(this, 80, 458, textureX, textureY); // Box 21
		bodyModel[214] = new ModelRendererTurbo(this, 93, 458, textureX, textureY); // Box 22
		bodyModel[215] = new ModelRendererTurbo(this, 124, 458, textureX, textureY); // Box 23
		bodyModel[216] = new ModelRendererTurbo(this, 159, 458, textureX, textureY); // Box 24
		bodyModel[217] = new ModelRendererTurbo(this, 218, 458, textureX, textureY); // Box 25
		bodyModel[218] = new ModelRendererTurbo(this, 250, 458, textureX, textureY); // Box 26
		bodyModel[219] = new ModelRendererTurbo(this, 305, 458, textureX, textureY); // Box 27
		bodyModel[220] = new ModelRendererTurbo(this, 204, 458, textureX, textureY); // Box 28
		bodyModel[221] = new ModelRendererTurbo(this, 103, 290, textureX, textureY); // Box 48
		bodyModel[222] = new ModelRendererTurbo(this, 7, 115, textureX, textureY); // Box 49
		bodyModel[223] = new ModelRendererTurbo(this, 7, 115, textureX, textureY); // Box 50
		bodyModel[224] = new ModelRendererTurbo(this, 5, 210, textureX, textureY); // Box 51
		bodyModel[225] = new ModelRendererTurbo(this, 5, 193, textureX, textureY); // Box 52
		bodyModel[226] = new ModelRendererTurbo(this, 48, 193, textureX, textureY); // Box 53
		bodyModel[227] = new ModelRendererTurbo(this, 48, 193, textureX, textureY); // Box 54
		bodyModel[228] = new ModelRendererTurbo(this, 48, 193, textureX, textureY); // Box 55
		bodyModel[229] = new ModelRendererTurbo(this, 5, 193, textureX, textureY); // Box 58
		bodyModel[230] = new ModelRendererTurbo(this, 5, 193, textureX, textureY); // Box 3
		bodyModel[231] = new ModelRendererTurbo(this, 5, 226, textureX, textureY); // Box 6
		bodyModel[232] = new ModelRendererTurbo(this, 5, 193, textureX, textureY); // Box 7
		bodyModel[233] = new ModelRendererTurbo(this, 7, 115, textureX, textureY); // Box 9
		bodyModel[234] = new ModelRendererTurbo(this, 7, 115, textureX, textureY); // Box 10
		bodyModel[235] = new ModelRendererTurbo(this, 7, 115, textureX, textureY); // Box 11
		bodyModel[236] = new ModelRendererTurbo(this, 7, 115, textureX, textureY); // Box 12
		bodyModel[237] = new ModelRendererTurbo(this, 7, 115, textureX, textureY); // Box 13
		bodyModel[238] = new ModelRendererTurbo(this, 7, 115, textureX, textureY); // Box 0
		bodyModel[239] = new ModelRendererTurbo(this, 7, 115, textureX, textureY); // Box 1
		bodyModel[240] = new ModelRendererTurbo(this, 7, 115, textureX, textureY); // Box 2
		bodyModel[241] = new ModelRendererTurbo(this, 7, 115, textureX, textureY); // Box 4
		bodyModel[242] = new ModelRendererTurbo(this, 7, 115, textureX, textureY); // Box 5
		bodyModel[243] = new ModelRendererTurbo(this, 7, 115, textureX, textureY); // Box 6
		bodyModel[244] = new ModelRendererTurbo(this, 7, 115, textureX, textureY); // Box 7
		bodyModel[245] = new ModelRendererTurbo(this, 7, 115, textureX, textureY); // Box 8
		bodyModel[246] = new ModelRendererTurbo(this, 7, 115, textureX, textureY); // Box 9
		bodyModel[247] = new ModelRendererTurbo(this, 7, 115, textureX, textureY); // Box 10
		bodyModel[248] = new ModelRendererTurbo(this, 7, 115, textureX, textureY); // Box 11
		bodyModel[249] = new ModelRendererTurbo(this, 7, 115, textureX, textureY); // Box 12
		bodyModel[250] = new ModelRendererTurbo(this, 7, 115, textureX, textureY); // Box 13
		bodyModel[251] = new ModelRendererTurbo(this, 7, 115, textureX, textureY); // Box 14
		bodyModel[252] = new ModelRendererTurbo(this, 7, 115, textureX, textureY); // Box 15
		bodyModel[253] = new ModelRendererTurbo(this, 5, 193, textureX, textureY); // Box 16
		bodyModel[254] = new ModelRendererTurbo(this, 7, 193, textureX, textureY); // Box 17
		bodyModel[255] = new ModelRendererTurbo(this, 5, 193, textureX, textureY); // Box 18
		bodyModel[256] = new ModelRendererTurbo(this, 7, 193, textureX, textureY); // Box 19
		bodyModel[257] = new ModelRendererTurbo(this, 7, 115, textureX, textureY); // Box 20
		bodyModel[258] = new ModelRendererTurbo(this, 7, 115, textureX, textureY); // Box 0
		bodyModel[259] = new ModelRendererTurbo(this, 7, 115, textureX, textureY); // Box 4
		bodyModel[260] = new ModelRendererTurbo(this, 7, 115, textureX, textureY); // Box 0
		bodyModel[261] = new ModelRendererTurbo(this, 7, 115, textureX, textureY); // Box 1
		bodyModel[262] = new ModelRendererTurbo(this, 7, 115, textureX, textureY); // Box 2
		bodyModel[263] = new ModelRendererTurbo(this, 7, 115, textureX, textureY); // Box 3
		bodyModel[264] = new ModelRendererTurbo(this, 7, 115, textureX, textureY); // Box 4
		bodyModel[265] = new ModelRendererTurbo(this, 5, 193, textureX, textureY); // Box 5
		bodyModel[266] = new ModelRendererTurbo(this, 5, 243, textureX, textureY); // Box 6
		bodyModel[267] = new ModelRendererTurbo(this, 5, 210, textureX, textureY); // Box 7
		bodyModel[268] = new ModelRendererTurbo(this, 5, 210, textureX, textureY); // Box 8
		bodyModel[269] = new ModelRendererTurbo(this, 35, 96, textureX, textureY); // Box 9
		bodyModel[270] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 10
		bodyModel[271] = new ModelRendererTurbo(this, 146, 85, textureX, textureY); // Box 0
		bodyModel[272] = new ModelRendererTurbo(this, 115, 85, textureX, textureY); // Box 1
		bodyModel[273] = new ModelRendererTurbo(this, 78, 105, textureX, textureY); // Box 2
		bodyModel[274] = new ModelRendererTurbo(this, 41, 85, textureX, textureY); // Box 3
		bodyModel[275] = new ModelRendererTurbo(this, 4, 85, textureX, textureY); // Box 4
		bodyModel[276] = new ModelRendererTurbo(this, 237, 60, textureX, textureY); // Box 0
		bodyModel[277] = new ModelRendererTurbo(this, 120, 59, textureX, textureY); // Box 1
		bodyModel[278] = new ModelRendererTurbo(this, 47, 59, textureX, textureY); // Box 2
		bodyModel[279] = new ModelRendererTurbo(this, 184, 60, textureX, textureY); // Box 6
		bodyModel[280] = new ModelRendererTurbo(this, 149, 60, textureX, textureY); // Box 7
		bodyModel[281] = new ModelRendererTurbo(this, 24, 59, textureX, textureY); // Box 8
		bodyModel[282] = new ModelRendererTurbo(this, 95, 59, textureX, textureY); // Box 9
		bodyModel[283] = new ModelRendererTurbo(this, 70, 59, textureX, textureY); // Box 0
		bodyModel[284] = new ModelRendererTurbo(this, 5, 59, textureX, textureY); // Box 2
		bodyModel[285] = new ModelRendererTurbo(this, 177, 85, textureX, textureY); // Box 3
		bodyModel[286] = new ModelRendererTurbo(this, 146, 85, textureX, textureY); // Box 4
		bodyModel[287] = new ModelRendererTurbo(this, 78, 85, textureX, textureY); // Box 5
		bodyModel[288] = new ModelRendererTurbo(this, 41, 85, textureX, textureY); // Box 6
		bodyModel[289] = new ModelRendererTurbo(this, 150, 8, textureX, textureY); // Box 8
		bodyModel[290] = new ModelRendererTurbo(this, 150, 8, textureX, textureY); // Box 10
		bodyModel[291] = new ModelRendererTurbo(this, 150, 8, textureX, textureY); // Box 13
		bodyModel[292] = new ModelRendererTurbo(this, 60, 171, textureX, textureY); // Box 14
		bodyModel[293] = new ModelRendererTurbo(this, 150, 8, textureX, textureY); // Box 15
		bodyModel[294] = new ModelRendererTurbo(this, 60, 176, textureX, textureY); // Box 16
		bodyModel[295] = new ModelRendererTurbo(this, 60, 176, textureX, textureY); // Box 17
		bodyModel[296] = new ModelRendererTurbo(this, 60, 171, textureX, textureY); // Box 18
		bodyModel[297] = new ModelRendererTurbo(this, 60, 176, textureX, textureY); // Box 19
		bodyModel[298] = new ModelRendererTurbo(this, 60, 171, textureX, textureY); // Box 20
		bodyModel[299] = new ModelRendererTurbo(this, 59, 182, textureX, textureY); // Box 21
		bodyModel[300] = new ModelRendererTurbo(this, 103, 172, textureX, textureY); // Box 22
		bodyModel[301] = new ModelRendererTurbo(this, 103, 172, textureX, textureY); // Box 23
		bodyModel[302] = new ModelRendererTurbo(this, 59, 182, textureX, textureY); // Box 24
		bodyModel[303] = new ModelRendererTurbo(this, 59, 188, textureX, textureY); // Box 25
		bodyModel[304] = new ModelRendererTurbo(this, 199, 147, textureX, textureY); // Box 26
		bodyModel[305] = new ModelRendererTurbo(this, 240, 156, textureX, textureY); // Box 27
		bodyModel[306] = new ModelRendererTurbo(this, 240, 141, textureX, textureY); // Box 28
		bodyModel[307] = new ModelRendererTurbo(this, 240, 127, textureX, textureY); // Box 29
		bodyModel[308] = new ModelRendererTurbo(this, 240, 87, textureX, textureY); // Box 30
		bodyModel[309] = new ModelRendererTurbo(this, 209, 87, textureX, textureY); // Box 31
		bodyModel[310] = new ModelRendererTurbo(this, 244, 104, textureX, textureY); // Box 32
		bodyModel[311] = new ModelRendererTurbo(this, 209, 104, textureX, textureY); // Box 33
		bodyModel[312] = new ModelRendererTurbo(this, 224, 139, textureX, textureY); // Box 34
		bodyModel[313] = new ModelRendererTurbo(this, 209, 130, textureX, textureY); // Box 35
		bodyModel[314] = new ModelRendererTurbo(this, 209, 130, textureX, textureY); // Box 36
		bodyModel[315] = new ModelRendererTurbo(this, 209, 130, textureX, textureY); // Box 37
		bodyModel[316] = new ModelRendererTurbo(this, 209, 130, textureX, textureY); // Box 38
		bodyModel[317] = new ModelRendererTurbo(this, 6, 161, textureX, textureY); // Box 39
		bodyModel[318] = new ModelRendererTurbo(this, 217, 257, textureX, textureY); // Box 40
		bodyModel[319] = new ModelRendererTurbo(this, 28, 160, textureX, textureY); // Box 0
		bodyModel[320] = new ModelRendererTurbo(this, 28, 166, textureX, textureY); // Box 1
		bodyModel[321] = new ModelRendererTurbo(this, 36, 166, textureX, textureY); // Box 2
		bodyModel[322] = new ModelRendererTurbo(this, 36, 160, textureX, textureY); // Box 3
		bodyModel[323] = new ModelRendererTurbo(this, 63, 166, textureX, textureY); // Box 4
		bodyModel[324] = new ModelRendererTurbo(this, 63, 160, textureX, textureY); // Box 5
		bodyModel[325] = new ModelRendererTurbo(this, 45, 166, textureX, textureY); // Box 6
		bodyModel[326] = new ModelRendererTurbo(this, 45, 160, textureX, textureY); // Box 7
		bodyModel[327] = new ModelRendererTurbo(this, 72, 160, textureX, textureY); // Box 8
		bodyModel[328] = new ModelRendererTurbo(this, 72, 166, textureX, textureY); // Box 9
		bodyModel[329] = new ModelRendererTurbo(this, 217, 257, textureX, textureY); // Box 10
		bodyModel[330] = new ModelRendererTurbo(this, 81, 160, textureX, textureY); // Box 11
		bodyModel[331] = new ModelRendererTurbo(this, 81, 166, textureX, textureY); // Box 12
		bodyModel[332] = new ModelRendererTurbo(this, 54, 160, textureX, textureY); // Box 13
		bodyModel[333] = new ModelRendererTurbo(this, 54, 166, textureX, textureY); // Box 14
		bodyModel[334] = new ModelRendererTurbo(this, 18, 253, textureX, textureY); // Box 15
		bodyModel[335] = new ModelRendererTurbo(this, 11, 253, textureX, textureY); // Box 16
		bodyModel[336] = new ModelRendererTurbo(this, 7, 268, textureX, textureY); // Box 17
		bodyModel[337] = new ModelRendererTurbo(this, 11, 253, textureX, textureY); // Box 18
		bodyModel[338] = new ModelRendererTurbo(this, 42, 251, textureX, textureY); // Box 19
		bodyModel[339] = new ModelRendererTurbo(this, 50, 251, textureX, textureY); // Box 0
		bodyModel[340] = new ModelRendererTurbo(this, 57, 251, textureX, textureY); // Box 1
		bodyModel[341] = new ModelRendererTurbo(this, 44, 257, textureX, textureY); // Box 2
		bodyModel[342] = new ModelRendererTurbo(this, 51, 257, textureX, textureY); // Box 3
		bodyModel[343] = new ModelRendererTurbo(this, 66, 252, textureX, textureY); // Box 4
		bodyModel[344] = new ModelRendererTurbo(this, 59, 257, textureX, textureY); // Box 5
		bodyModel[345] = new ModelRendererTurbo(this, 66, 252, textureX, textureY); // Box 6
		bodyModel[346] = new ModelRendererTurbo(this, 66, 252, textureX, textureY); // Box 7
		bodyModel[347] = new ModelRendererTurbo(this, 66, 252, textureX, textureY); // Box 8
		bodyModel[348] = new ModelRendererTurbo(this, 57, 251, textureX, textureY); // Box 9
		bodyModel[349] = new ModelRendererTurbo(this, 45, 377, textureX, textureY); // Box 0
		bodyModel[350] = new ModelRendererTurbo(this, 5, 377, textureX, textureY); // Box 1
		bodyModel[351] = new ModelRendererTurbo(this, 103, 133, textureX, textureY); // Box 0
		bodyModel[352] = new ModelRendererTurbo(this, 122, 133, textureX, textureY); // Box 1
		bodyModel[353] = new ModelRendererTurbo(this, 168, 133, textureX, textureY); // Box 2
		bodyModel[354] = new ModelRendererTurbo(this, 145, 133, textureX, textureY); // Box 3
		bodyModel[355] = new ModelRendererTurbo(this, 103, 133, textureX, textureY); // Box 4
		bodyModel[356] = new ModelRendererTurbo(this, 168, 133, textureX, textureY); // Box 5
		bodyModel[357] = new ModelRendererTurbo(this, 145, 133, textureX, textureY); // Box 6
		bodyModel[358] = new ModelRendererTurbo(this, 122, 133, textureX, textureY); // Box 7
		bodyModel[359] = new ModelRendererTurbo(this, 183, 173, textureX, textureY); // Box 0
		bodyModel[360] = new ModelRendererTurbo(this, 183, 173, textureX, textureY); // Box 1
		bodyModel[361] = new ModelRendererTurbo(this, 193, 173, textureX, textureY); // Box 2
		bodyModel[362] = new ModelRendererTurbo(this, 90, 160, textureX, textureY); // Box 3
		bodyModel[363] = new ModelRendererTurbo(this, 90, 166, textureX, textureY); // Box 4
		bodyModel[364] = new ModelRendererTurbo(this, 42, 174, textureX, textureY); // Box 5
		bodyModel[365] = new ModelRendererTurbo(this, 293, 71, textureX, textureY); // Box 6
		bodyModel[366] = new ModelRendererTurbo(this, 293, 71, textureX, textureY); // Box 7
		bodyModel[367] = new ModelRendererTurbo(this, 151, 152, textureX, textureY); // Box 8
		bodyModel[368] = new ModelRendererTurbo(this, 151, 168, textureX, textureY); // Box 9
		bodyModel[369] = new ModelRendererTurbo(this, 151, 174, textureX, textureY); // Box 10
		bodyModel[370] = new ModelRendererTurbo(this, 151, 157, textureX, textureY); // Box 11
		bodyModel[371] = new ModelRendererTurbo(this, 151, 162, textureX, textureY); // Box 12
		bodyModel[372] = new ModelRendererTurbo(this, 187, 158, textureX, textureY); // Box 13
		bodyModel[373] = new ModelRendererTurbo(this, 187, 164, textureX, textureY); // Box 14
		bodyModel[374] = new ModelRendererTurbo(this, 179, 152, textureX, textureY); // Box 15
		bodyModel[375] = new ModelRendererTurbo(this, 179, 152, textureX, textureY); // Box 17
		bodyModel[376] = new ModelRendererTurbo(this, 176, 167, textureX, textureY); // Box 19
		bodyModel[377] = new ModelRendererTurbo(this, 176, 160, textureX, textureY); // Box 20
		bodyModel[378] = new ModelRendererTurbo(this, 176, 160, textureX, textureY); // Box 21
		bodyModel[379] = new ModelRendererTurbo(this, 187, 164, textureX, textureY); // Box 28
		bodyModel[380] = new ModelRendererTurbo(this, 179, 152, textureX, textureY); // Box 29
		bodyModel[381] = new ModelRendererTurbo(this, 176, 167, textureX, textureY); // Box 30
		bodyModel[382] = new ModelRendererTurbo(this, 176, 160, textureX, textureY); // Box 31
		bodyModel[383] = new ModelRendererTurbo(this, 176, 160, textureX, textureY); // Box 32
		bodyModel[384] = new ModelRendererTurbo(this, 179, 152, textureX, textureY); // Box 34
		bodyModel[385] = new ModelRendererTurbo(this, 187, 151, textureX, textureY); // Box 0
		bodyModel[386] = new ModelRendererTurbo(this, 165, 151, textureX, textureY); // Box 1
		bodyModel[387] = new ModelRendererTurbo(this, 165, 160, textureX, textureY); // Box 2
		bodyModel[388] = new ModelRendererTurbo(this, 165, 167, textureX, textureY); // Box 3
		bodyModel[389] = new ModelRendererTurbo(this, 165, 174, textureX, textureY); // Box 4
		bodyModel[390] = new ModelRendererTurbo(this, 173, 174, textureX, textureY); // Box 5
		bodyModel[391] = new ModelRendererTurbo(this, 124, 96, textureX, textureY); // Box 6
		bodyModel[392] = new ModelRendererTurbo(this, 41, 125, textureX, textureY); // Box 7
		bodyModel[393] = new ModelRendererTurbo(this, 42, 174, textureX, textureY); // Box 0

		bodyModel[0].addShapeBox(-72F, -29F, -4F, 6, 4, 8, 0F,0F, -4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -3F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F); // Box 12
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-66F, -33F, -6F, 8, 6, 12, 0F,0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F); // Box 13
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-10F, -43F, -2F, 8, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-2F, -42F, -2F, 13, 9, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(11F, -33F, -6F, 22, 2, 12, 0F,0F, 1.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F); // Box 20
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(33F, -33F, -4F, 22, 4, 8, 0F,0F, 0F, 0F, 0F, -2F, -2.5F, 0F, -2F, -2.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -1F, 0F); // Box 21
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(55F, -32F, -1F, 17, 2, 2, 0F,0F, 0F, .5F, 0F, -2.8F, -.5F, 0F, -2.8F, -.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 1F, -.5F, 0F, 1F, -.5F, 0F, 0F, .5F); // Box 22
		bodyModel[6].setRotationPoint(0F, 1F, 0F);

		bodyModel[7].addShapeBox(-10F, -35F, -6F, 8, 4, 12, 0F,0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-2F, -35F, -6F, 13, 4, 12, 0F,0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(11F, -39F, -2F, 22, 7, 4, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 25
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(33F, -37F, -2F, 22, 7, 4, 0F,0F, 2F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F); // Box 26
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addBox(55F, -28F, -0.5F, 17, 3, 1, 0F); // Box 37
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(55F, -24F, -1F, 17, 4, 2, 0F,0F, -.5F, .5F, 0F, 1F, -.5F, 0F, 1F, -.5F, 0F, -.5F, .5F, 0F, 0F, .5F, 0F, -4.7F, -.5F, 0F, -4.7F, -.5F, 0F, 0F, .5F); // Box 47
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(33F, -21F, -4F, 22, 4, 8, 0F,0F, 0F, 0F, 0F, 2.5F, -2.5F, 0F, 2.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2.5F, 0F, -3F, -2.5F, 0F, 0F, 0F); // Box 48
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-66F, -19F, -6F, 8, 5, 12, 0F,0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F); // Box 55
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-66F, -27F, -6F, 8, 8, 12, 0F,0F, 0F, -2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -2F); // Box 57
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-72F, -25F, -4F, 6, 4, 8, 0F,0F, 0F, -3F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -3F); // Box 58
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-72F, -21F, -4F, 6, 4, 8, 0F,0F, 0F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -3F); // Box 59
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-58F, -18F, -6F, 5, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-47F, -18F, -6F, 11, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-36F, -18F, -6F, 13, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-53F, -18F, -6F, 6, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-74F, -25F, -1F, 2, 4, 2, 0F,-.5F, -1.6F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1.6F, -1F, -.5F, -1.6F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1.6F, -1F); // Box 0
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-72F, -24.5F, -6F, 6, 3, 1, 0F,0F, 0F, -4F, 0F, 2F, 0F, 0F, 2F, 1F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 2F, 0F, 0F, 2F, 1F, 0F, 0F, 4F); // Box 2
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-47F, -29.5F, -12F, 11, 11, 4, 0F,0F, -1F, 0F, 0F, -.5F, -.2F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-58F, -28.5F, -12F, 11, 10, 6, 0F,0F, -1F, -2.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-66F, -26.5F, -9F, 8, 7, 3, 0F,0F, 0F, -3F, 0F, 1F, .5F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 1F, .5F, 0F, 1F, 0F, 0F, 0F, 2F); // Box 5
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-72F, -29F, -6F, 6, 5, 1, 0F,0F, -4.5F, -4F, 0F, -1F, -.5F, 0F, 0F, 1F, 0F, -4F, 4F, 0F, -.5F, -4F, 0F, -2.5F, 0F, 0F, -2.5F, 1F, 0F, -.5F, 4F); // Box 6
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-66F, -33F, -9F, 8, 7, 3, 0F,0F, -5F, -3.5F, 0F, -2F, -.5F, 0F, 0F, 0F, 0F, -4F, 2F, 0F, -.5F, -3F, 0F, -1.5F, .5F, 0F, -2.5F, 0F, 0F, -.5F, 2F); // Box 7
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-58F, -33F, -12F, 11, 5, 6, 0F,0F, -2F, -3.5F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -2.5F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(-72F, -22F, -6F, 6, 5, 1, 0F,0F, -.5F, -4F, 0F, -2.5F, 0F, 0F, -2.5F, 1F, 0F, -.5F, 4F, 0F, -4.5F, -4F, 0F, -1F, -.5F, 0F, 0F, 1F, 0F, -4F, 4F); // Box 9
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(-66F, -20F, -9F, 8, 6, 3, 0F,0F, -.5F, -3F, 0F, -1.5F, .5F, 0F, -1.5F, 0F, 0F, -.5F, 2F, 0F, -4F, -3.5F, 0F, -2F, -.5F, 0F, 0F, 0F, 0F, -3F, 2F); // Box 10
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-58F, -19F, -10F, 5, 5, 4, 0F,0F, -.5F, -.5F, 0F, -.5F, .64F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -2F, -1.5F, 0F, -1.2F, -.3F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(-53F, -19F, -12F, 6, 6, 6, 0F,0F, -.5F, -1.36F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -2.2F, -2.3F, 0F, -1.8F, -1.7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-47F, -19F, -12F, 11, 6, 6, 0F,0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -1.8F, -1.7F, 0F, -1.5F, -1.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(-36F, -19F, -12F, 13, 6, 6, 0F,0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -1.5F, -1.4F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-23F, -19F, -12F, 13, 6, 6, 0F,0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -1.5F, -1.5F, 0F, -1.7F, -1.5F, 0F, -.5F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-10F, -19F, -12F, 8, 5, 6, 0F,0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.7F, -1.5F, 0F, -1F, -1.6F, 0F, .3F, 0F, 0F, .5F, 0F); // Box 17
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-10F, -29.5F, -12F, 8, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(-36F, -29.5F, -12F, 13, 11, 4, 0F,0F, -.5F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(-23F, -29.5F, -12F, 13, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(-23F, -33F, -12F, 13, 4, 6, 0F,0F, -1F, -2F, 0F, .8F, -2F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(-10F, -35F, -12F, 8, 6, 6, 0F,0F, -1.2F, -2F, 0F, -1.4F, -2F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(-2F, -35F, -12F, 13, 6, 6, 0F,0F, -1.4F, -2F, 0F, -2F, -2.4F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(-2F, -29.5F, -12F, 13, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(-2F, -19F, -12F, 13, 5, 6, 0F,0F, -.5F, 0F, 0F, .5F, -1F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -1F, -1.6F, 0F, -2F, -2F, 0F, -.5F, 0F, 0F, .3F, 0F); // Box 26
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(11F, -20F, -11F, 22, 6, 5, 0F,0F, -.5F, 0F, 0F, 1.5F, -3.5F, 0F, 1.5F, 2.5F, 0F, -.5F, 0F, 0F, -2F, -1F, 0F, -4.5F, -4.5F, 0F, -3F, 2F, 0F, -.5F, 0F); // Box 27
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(11F, -29.5F, -11F, 22, 10, 5, 0F,0F, 0F, 0F, 0F, -.5F, -3.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3.5F, 0F, -2F, 2.5F, 0F, 0F, 0F); // Box 28
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(11F, -33F, -11F, 22, 3, 5, 0F,0F, 0F, -1.4F, 0F, -1.2F, -4.5F, 0F, 0F, 2F, 0F, 1.5F, 0F, 0F, .5F, 0F, 0F, 1F, -3.5F, 0F, 1F, 2.5F, 0F, 1F, 0F); // Box 29
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(33F, -22F, -7.5F, 22, 5, 4, 0F,0F, -.5F, 0F, 0F, 2F, -3F, 0F, 2F, 2F, 0F, -.5F, 0F, 0F, -1.5F, -1F, 0F, -4.5F, -4F, 0F, -3F, 2F, 0F, 0F, -.5F); // Box 30
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(33F, -28.5F, -7.5F, 22, 7, 4, 0F,0F, .5F, 0F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2.5F, -3F, 0F, -2.5F, 2F, 0F, 0F, 0F); // Box 31
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(33F, -33F, -7.5F, 22, 5, 4, 0F,0F, -1.2F, -1F, 0F, -2.8F, -4F, 0F, -2F, 2F, 0F, 0F, -.5F, 0F, -1F, 0F, 0F, -.5F, -3F, 0F, 0F, 2F, 0F, -1F, 0F); // Box 32
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(55F, -31F, -4.5F, 17, 3, 3, 0F,0F, -.8F, -1F, 0F, -3.3F, -3.3F, 0F, -2.8F, 1F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 1F, -3F, 0F, .5F, 1F, 0F, -.5F, 0F); // Box 33
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(55F, -28.5F, -4.5F, 17, 4, 3, 0F,0F, 0F, 0F, 0F, -1.5F, -3F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -1.5F, -3F, 0F, -1F, 1F, 0F, .5F, 0F); // Box 34
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(55F, -25F, -4.5F, 17, 5, 3, 0F,0F, -1F, 0F, 0F, 1F, -3F, 0F, .5F, 1F, 0F, -1F, 0F, 0F, -1.5F, -1F, 0F, -5.2F, -3.3F, 0F, -4.7F, 1F, 0F, 0F, 0F); // Box 35
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(-74F, -25F, -2F, 2, 4, 1, 0F,-1F, -2F, -1.5F, 0F, -.5F, 0F, 0F, 0F, 0F, -.5F, -1.6F, 1F, -1F, -2F, -1.5F, 0F, -.5F, 0F, 0F, 0F, 0F, -.5F, -1.6F, 1F); // Box 1
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addShapeBox(33F, -33F, 3.5F, 22, 5, 4, 0F,0F, 0F, -.5F, 0F, -2F, 2F, 0F, -2.8F, -4F, 0F, -1.2F, -1F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, -.5F, -3F, 0F, -1F, 0F); // Box 3
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addShapeBox(33F, -28.5F, 3.5F, 22, 7, 4, 0F,0F, 1F, 0F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 2F, 0F, -2.5F, -3F, 0F, 0F, 0F); // Box 4
		bodyModel[57].setRotationPoint(0F, 0F, 0F);

		bodyModel[58].addShapeBox(33F, -22F, 3.5F, 22, 5, 4, 0F,0F, -.5F, 0F, 0F, 2F, 2F, 0F, 2F, -3F, 0F, -.5F, 0F, 0F, 0F, -.5F, 0F, -3F, 2F, 0F, -4.5F, -4F, 0F, -1.5F, -1F); // Box 5
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addShapeBox(11F, -33F, 6F, 22, 3, 5, 0F,0F, 1.5F, 0F, 0F, 0F, 2F, 0F, -1.2F, -4.5F, 0F, 0F, -1.4F, 0F, 1F, 0F, 0F, 1F, 2.5F, 0F, 1F, -3.5F, 0F, .5F, 0F); // Box 6
		bodyModel[59].setRotationPoint(0F, 0F, 0F);

		bodyModel[60].addShapeBox(11F, -29.5F, 6F, 22, 10, 5, 0F,0F, 0F, 0F, 0F, 0F, 2.5F, 0F, -.5F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2.5F, 0F, -2F, -3.5F, 0F, 0F, 0F); // Box 7
		bodyModel[60].setRotationPoint(0F, 0F, 0F);

		bodyModel[61].addShapeBox(11F, -20F, 6F, 22, 6, 5, 0F,0F, -.5F, 0F, 0F, 1.5F, 2.5F, 0F, 1.5F, -3.5F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -3F, 2F, 0F, -4.5F, -4.5F, 0F, -2F, -1F); // Box 8
		bodyModel[61].setRotationPoint(0F, 0F, 0F);

		bodyModel[62].addShapeBox(-2F, -19F, 6F, 13, 5, 6, 0F,0F, -.5F, 0F, 0F, .5F, 0F, 0F, .5F, -1F, 0F, -.5F, 0F, 0F, .3F, 0F, 0F, -.5F, 0F, 0F, -2F, -2F, 0F, -1F, -1.6F); // Box 9
		bodyModel[62].setRotationPoint(0F, 0F, 0F);

		bodyModel[63].addShapeBox(-2F, -29.5F, 6F, 13, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 10
		bodyModel[63].setRotationPoint(0F, 0F, 0F);

		bodyModel[64].addShapeBox(-2F, -35F, 6F, 13, 6, 6, 0F,0F, 0F, 0F, 0F, -.5F, 0F, 0F, -2F, -2.4F, 0F, -1.4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1F, 0F, -.5F, 0F); // Box 11
		bodyModel[64].setRotationPoint(0F, 0F, 0F);

		bodyModel[65].addShapeBox(-10F, -35F, 6F, 8, 6, 6, 0F,0F, .5F, 0F, 0F, 0F, 0F, 0F, -1.4F, -2F, 0F, -1.2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Box 12
		bodyModel[65].setRotationPoint(0F, 0F, 0F);

		bodyModel[66].addShapeBox(-10F, -29.5F, 6F, 8, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[66].setRotationPoint(0F, 0F, 0F);

		bodyModel[67].addShapeBox(-10F, -19F, 6F, 8, 5, 6, 0F,0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F, .3F, 0F, 0F, -1F, -1.6F, 0F, -.7F, -1.5F); // Box 14
		bodyModel[67].setRotationPoint(0F, 0F, 0F);

		bodyModel[68].addShapeBox(-23F, -19F, 6F, 13, 6, 6, 0F,0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1.7F, -1.5F, 0F, -1.5F, -1.5F); // Box 15
		bodyModel[68].setRotationPoint(0F, 0F, 0F);

		bodyModel[69].addShapeBox(-23F, -29.5F, 6F, 13, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[69].setRotationPoint(0F, 0F, 0F);

		bodyModel[70].addShapeBox(-23F, -33F, 6F, 13, 4, 6, 0F,0F, 0F, 0F, 0F, 2.5F, 0F, 0F, .8F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Box 17
		bodyModel[70].setRotationPoint(0F, 0F, 0F);

		bodyModel[71].addShapeBox(-36F, -33F, 6F, 13, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -.5F, 0F, 0F, 0F, -.2F); // Box 18
		bodyModel[71].setRotationPoint(0F, 0F, 0F);

		bodyModel[72].addShapeBox(-36F, -29.5F, 8F, 13, 11, 4, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, -.5F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[72].setRotationPoint(0F, 0F, 0F);

		bodyModel[73].addShapeBox(-36F, -19F, 6F, 13, 6, 6, 0F,0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.4F); // Box 20
		bodyModel[73].setRotationPoint(0F, 0F, 0F);

		bodyModel[74].addShapeBox(-47F, -19F, 6F, 11, 6, 6, 0F,0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.4F, 0F, -1.8F, -1.7F); // Box 21
		bodyModel[74].setRotationPoint(0F, 0F, 0F);

		bodyModel[75].addShapeBox(-47F, -29.5F, 8F, 11, 11, 4, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -.5F, -.2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[75].setRotationPoint(0F, 0F, 0F);

		bodyModel[76].addShapeBox(-47F, -33F, 6F, 11, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -.2F, 0F, .5F, 0F); // Box 23
		bodyModel[76].setRotationPoint(0F, 0F, 0F);

		bodyModel[77].addShapeBox(-58F, -33F, 6F, 11, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -2F, -3.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -.5F, 0F, 0F, .5F, -2.5F); // Box 24
		bodyModel[77].setRotationPoint(0F, 0F, 0F);

		bodyModel[78].addShapeBox(-58F, -28.5F, 6F, 11, 10, 6, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F); // Box 25
		bodyModel[78].setRotationPoint(0F, 0F, 0F);

		bodyModel[79].addShapeBox(-53F, -19F, 6F, 6, 6, 6, 0F,0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, -1.36F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.8F, -1.7F, 0F, -2.2F, -2.3F); // Box 26
		bodyModel[79].setRotationPoint(0F, 0F, 0F);

		bodyModel[80].addShapeBox(-58F, -19F, 6F, 5, 5, 4, 0F,0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, .64F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.2F, -.3F, 0F, -2F, -1.5F); // Box 27
		bodyModel[80].setRotationPoint(0F, 0F, 0F);

		bodyModel[81].addShapeBox(-66F, -20F, 6F, 8, 6, 3, 0F,0F, -.5F, 2F, 0F, -1.5F, 0F, 0F, -1.5F, .5F, 0F, -.5F, -3F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, -2F, -.5F, 0F, -4F, -3.5F); // Box 28
		bodyModel[81].setRotationPoint(0F, 0F, 0F);

		bodyModel[82].addShapeBox(-66F, -26.5F, 6F, 8, 7, 3, 0F,0F, 0F, 2F, 0F, 2F, 0F, 0F, 1F, .5F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 1F, 0F, 0F, 1F, .5F, 0F, 0F, -3F); // Box 29
		bodyModel[82].setRotationPoint(0F, 0F, 0F);

		bodyModel[83].addShapeBox(-66F, -33F, 6F, 8, 7, 3, 0F,0F, -4F, 2F, 0F, 0F, 0F, 0F, -2F, -.5F, 0F, -5F, -3.5F, 0F, -.5F, 2F, 0F, -2.5F, 0F, 0F, -1.5F, .5F, 0F, -.5F, -3F); // Box 30
		bodyModel[83].setRotationPoint(0F, 0F, 0F);

		bodyModel[84].addShapeBox(-72F, -29F, 5F, 6, 5, 1, 0F,0F, -4F, 4F, 0F, 0F, 1F, 0F, -1F, -.5F, 0F, -4.5F, -4F, 0F, -.5F, 4F, 0F, -2.5F, 1F, 0F, -2.5F, 0F, 0F, -.5F, -4F); // Box 31
		bodyModel[84].setRotationPoint(0F, 0F, 0F);

		bodyModel[85].addShapeBox(-72F, -24.5F, 5F, 6, 3, 1, 0F,0F, 0F, 4F, 0F, 2F, 1F, 0F, 2F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 2F, 1F, 0F, 2F, 0F, 0F, 0F, -4F); // Box 32
		bodyModel[85].setRotationPoint(0F, 0F, 0F);

		bodyModel[86].addShapeBox(-72F, -22F, 5F, 6, 5, 1, 0F,0F, -.5F, 4F, 0F, -2.5F, 1F, 0F, -2.5F, 0F, 0F, -.5F, -4F, 0F, -4F, 4F, 0F, 0F, 1F, 0F, -1F, -.5F, 0F, -4.5F, -4F); // Box 33
		bodyModel[86].setRotationPoint(0F, 0F, 0F);

		bodyModel[87].addShapeBox(-74F, -25F, 1F, 2, 4, 1, 0F,-.5F, -1.6F, 1F, 0F, 0F, 0F, 0F, -.5F, 0F, -1F, -2F, -1.5F, -.5F, -1.6F, 1F, 0F, 0F, 0F, 0F, -.5F, 0F, -1F, -2F, -1.5F); // Box 34
		bodyModel[87].setRotationPoint(0F, 0F, 0F);

		bodyModel[88].addShapeBox(55F, -31F, 1.5F, 17, 3, 3, 0F,0F, 0F, 0F, 0F, -2.8F, 1F, 0F, -3.3F, -3.3F, 0F, -.8F, -1F, 0F, -.5F, 0F, 0F, .5F, 1F, 0F, 1F, -3F, 0F, -.5F, 0F); // Box 35
		bodyModel[88].setRotationPoint(0F, 0F, 0F);

		bodyModel[89].addShapeBox(55F, -28.5F, 1.5F, 17, 4, 3, 0F,0F, 0F, 0F, 0F, -1F, 1F, 0F, -1.5F, -3F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -1F, 1F, 0F, -1.5F, -3F, 0F, .5F, 0F); // Box 36
		bodyModel[89].setRotationPoint(0F, 0F, 0F);

		bodyModel[90].addShapeBox(55F, -25F, 1.5F, 17, 5, 3, 0F,0F, -1F, 0F, 0F, .5F, 1F, 0F, 1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4.7F, 1F, 0F, -5.2F, -3.2F, 0F, -1.5F, -1F); // Box 37
		bodyModel[90].setRotationPoint(0F, 0F, 0F);

		bodyModel[91].addShapeBox(72F, -28F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, -.9F, 0F, 0F, -.9F, 0F, 0F, 0F, 0F, 0F, 0F, -.65F, 0F, -.9F, -.65F, 0F, -.9F, -.65F, 0F, 0F, -.65F, 0F); // Box 38
		bodyModel[91].setRotationPoint(0F, 0F, 0F);

		bodyModel[92].addShapeBox(72F, -28F, -1.5F, 1, 1, 1, 0F,0F, -.35F, -.5F, -.9F, -.35F, -.5F, -.9F, 0F, 0F, 0F, 0F, 0F, 0F, -.25F, -.5F, -.9F, -.25F, -.5F, -.9F, -.65F, 0F, 0F, -.65F, 0F); // Box 39
		bodyModel[92].setRotationPoint(0F, 0F, 0F);

		bodyModel[93].addShapeBox(72F, -28F, -1.5F, 1, 3, 1, 0F,0F, -1F, -.2F, -.9F, -1F, -.2F, -.9F, -.35F, -.5F, 0F, -.35F, -.5F, 0F, -1F, -.2F, -.9F, -1F, -.2F, -.9F, -.35F, -.5F, 0F, -.35F, -.5F); // Box 40
		bodyModel[93].setRotationPoint(0F, 0F, 0F);

		bodyModel[94].addShapeBox(72F, -26F, -1.5F, 1, 1, 1, 0F,0F, -.25F, -.5F, -.9F, -.25F, -.5F, -.9F, -.65F, 0F, 0F, -.65F, 0F, 0F, -.35F, -.5F, -.9F, -.35F, -.5F, -.9F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[94].setRotationPoint(0F, 0F, 0F);

		bodyModel[95].addShapeBox(72F, -26F, -0.5F, 1, 1, 1, 0F,0F, -.65F, 0F, -.9F, -.65F, 0F, -.9F, -.65F, 0F, 0F, -.65F, 0F, 0F, 0F, 0F, -.9F, 0F, 0F, -.9F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[95].setRotationPoint(0F, 0F, 0F);

		bodyModel[96].addShapeBox(72F, -26F, 0.5F, 1, 1, 1, 0F,0F, -.65F, 0F, -.9F, -.65F, 0F, -.9F, -.25F, -.5F, 0F, -.25F, -.5F, 0F, 0F, 0F, -.9F, 0F, 0F, -.9F, -.35F, -.5F, 0F, -.35F, -.5F); // Box 45
		bodyModel[96].setRotationPoint(0F, 0F, 0F);

		bodyModel[97].addShapeBox(72F, -28F, 0.5F, 1, 1, 1, 0F,0F, 0F, 0F, -.9F, 0F, 0F, -.9F, -.35F, -.5F, 0F, -.35F, -.5F, 0F, -.65F, 0F, -.9F, -.65F, 0F, -.9F, -.25F, -.5F, 0F, -.25F, -.5F); // Box 46
		bodyModel[97].setRotationPoint(0F, 0F, 0F);

		bodyModel[98].addShapeBox(72F, -28F, 0.5F, 1, 3, 1, 0F,0F, -.35F, -.5F, -.9F, -.35F, -.5F, -.9F, -1F, -.2F, 0F, -1F, -.2F, 0F, -.35F, -.5F, -.9F, -.35F, -.5F, -.9F, -1F, -.2F, 0F, -1F, -.2F); // Box 47
		bodyModel[98].setRotationPoint(0F, 0F, 0F);

		bodyModel[99].addShapeBox(72F, -28F, -0.5F, 1, 3, 1, 0F,0F, -.1F, 0F, -.95F, -.1F, 0F, -.95F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, -.95F, -.1F, 0F, -.95F, -.1F, 0F, 0F, -.1F, 0F); // Box 0
		bodyModel[99].setRotationPoint(0F, 0F, 0F);

		bodyModel[100].addShapeBox(72F, -23F, -1.5F, 1, 3, 1, 0F,0F, -.4F, -.5F, -.95F, -.4F, -.5F, -.95F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.4F, -.5F, -.95F, -.4F, -.5F, -.95F, -.1F, 0F, 0F, -.1F, 0F); // Box 1
		bodyModel[100].setRotationPoint(0F, -5F, 0F);

		bodyModel[101].addShapeBox(72F, -23F, 0.5F, 1, 3, 1, 0F,0F, -.1F, 0F, -.95F, -.1F, 0F, -.95F, -.4F, -.5F, 0F, -.4F, -.5F, 0F, -.1F, 0F, -.95F, -.1F, 0F, -.95F, -.4F, -.5F, 0F, -.4F, -.5F); // Box 2
		bodyModel[101].setRotationPoint(0F, -5F, 0F);

		bodyModel[102].addShapeBox(-45F, -29.5F, -13F, 3, 3, 2, 0F,0F, -3F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[102].setRotationPoint(0F, 2F, 0F);

		bodyModel[103].addShapeBox(-39F, -32.5F, -13F, 6, 6, 4, 0F,0F, -1.5F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 1F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[103].setRotationPoint(0F, 2F, 0F);

		bodyModel[104].addShapeBox(-33F, -29.5F, -18F, 10, 7, 9, 0F,0F, -1F, -7F, 0F, .2F, -8F, 0F, .2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[104].setRotationPoint(0F, -2F, 0F);

		bodyModel[105].addShapeBox(-23F, -30.5F, -18F, 10, 8, 8, 0F,0F, -.8F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, -.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[105].setRotationPoint(0F, -2F, 0F);

		bodyModel[106].addShapeBox(-13F, -30.5F, -18F, 24, 8, 8, 0F,0F, 0F, -8F, 0F, -1F, -8F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[106].setRotationPoint(0F, -2F, 0F);

		bodyModel[107].addShapeBox(11F, -28.5F, -18F, 21, 6, 8, 0F,0F, 1F, -8F, 0F, -.5F, -11F, 0F, -.5F, 3F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 6
		bodyModel[107].setRotationPoint(0F, -2F, 0F);

		bodyModel[108].addShapeBox(32F, -26.5F, -10F, 12, 4, 4, 0F,0F, 1.5F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[108].setRotationPoint(0F, -2F, 0F);

		bodyModel[109].addShapeBox(44F, -29.5F, -6F, 8, 3, 3, 0F,0F, 1F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[109].setRotationPoint(0F, 2F, 0F);

		bodyModel[110].addShapeBox(-45F, -26.5F, -13F, 3, 3, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 9
		bodyModel[110].setRotationPoint(0F, 2F, 0F);

		bodyModel[111].addShapeBox(-39F, -26.5F, -13F, 6, 6, 4, 0F,0F, 0F, 1F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 10
		bodyModel[111].setRotationPoint(0F, 2F, 0F);

		bodyModel[112].addShapeBox(-33F, -26.5F, -18F, 10, 7, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -8F, 0F, .2F, -7F, 0F, .2F, 0F, 0F, -1F, 0F); // Box 11
		bodyModel[112].setRotationPoint(0F, 2F, 0F);

		bodyModel[113].addShapeBox(-23F, -26.5F, -18F, 10, 8, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.8F, -7F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, -.8F, 0F); // Box 12
		bodyModel[113].setRotationPoint(0F, 2F, 0F);

		bodyModel[114].addShapeBox(-13F, -26.5F, -18F, 24, 8, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -1F, -8F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[114].setRotationPoint(0F, 2F, 0F);

		bodyModel[115].addShapeBox(11F, -26.5F, -18F, 21, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 1F, -8F, 0F, -.5F, -11F, 0F, -.5F, 3F, 0F, 1F, 0F); // Box 14
		bodyModel[115].setRotationPoint(0F, 2F, 0F);

		bodyModel[116].addShapeBox(32F, -26.5F, -10F, 12, 4, 4, 0F,0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -3F, 0F, 0F, -5F, 0F, 0F, 1F, 0F, 1.5F, 0F); // Box 15
		bodyModel[116].setRotationPoint(0F, 2F, 0F);

		bodyModel[117].addShapeBox(44F, -26.5F, -6F, 8, 3, 3, 0F,0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 16
		bodyModel[117].setRotationPoint(0F, 2F, 0F);

		bodyModel[118].addShapeBox(-42F, -26.5F, -13F, 3, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, -2F, 0F); // Box 17
		bodyModel[118].setRotationPoint(0F, 2F, 0F);

		bodyModel[119].addShapeBox(-42F, -31.5F, -13F, 3, 5, 3, 0F,0F, -2F, -1F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[119].setRotationPoint(0F, 2F, 0F);

		bodyModel[120].addShapeBox(52F, -28.5F, -6F, 2, 2, 3, 0F,0F, 1F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, .5F, 0F, -1.5F, .5F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[120].setRotationPoint(0F, 2F, 0F);

		bodyModel[121].addShapeBox(52F, -26.5F, -6F, 2, 2, 3, 0F,0F, 0F, 0F, .5F, 0F, -1.5F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 21
		bodyModel[121].setRotationPoint(0F, 2F, 0F);

		bodyModel[122].addShapeBox(-45F, -29.5F, 11F, 3, 3, 2, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 0
		bodyModel[122].setRotationPoint(0F, 2F, 0F);

		bodyModel[123].addShapeBox(-45F, -26.5F, 11F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F); // Box 1
		bodyModel[123].setRotationPoint(0F, 2F, 0F);

		bodyModel[124].addShapeBox(-42F, -26.5F, 10F, 3, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -.5F, 0F, 0F, -.5F, -1F, 0F, -2F, -1F); // Box 2
		bodyModel[124].setRotationPoint(0F, 2F, 0F);

		bodyModel[125].addShapeBox(-42F, -31.5F, 10F, 3, 5, 3, 0F,0F, -2F, 0F, 0F, -.5F, 0F, 0F, -.5F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 3
		bodyModel[125].setRotationPoint(0F, 2F, 0F);

		bodyModel[126].addShapeBox(-39F, -32.5F, 9F, 6, 6, 4, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 1F); // Box 4
		bodyModel[126].setRotationPoint(0F, 2F, 0F);

		bodyModel[127].addShapeBox(-39F, -26.5F, 9F, 6, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1.5F, -1F); // Box 5
		bodyModel[127].setRotationPoint(0F, 2F, 0F);

		bodyModel[128].addShapeBox(-33F, -26.5F, 9F, 10, 7, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, .2F, 0F, 0F, .2F, -7F, 0F, -1F, -8F); // Box 6
		bodyModel[128].setRotationPoint(0F, 2F, 0F);

		bodyModel[129].addShapeBox(-33F, -29.5F, 9F, 10, 7, 9, 0F,0F, -1F, 0F, 0F, .2F, 0F, 0F, .2F, -8F, 0F, -1F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[129].setRotationPoint(0F, -2F, 0F);

		bodyModel[130].addShapeBox(-23F, -30.5F, 10F, 10, 8, 8, 0F,0F, -.8F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -.8F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[130].setRotationPoint(0F, -2F, 0F);

		bodyModel[131].addShapeBox(-23F, -26.5F, 10F, 10, 8, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.8F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -.8F, -7F); // Box 9
		bodyModel[131].setRotationPoint(0F, 2F, -1F);

		bodyModel[132].addShapeBox(-13F, -26.5F, 10F, 24, 8, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -8F, 0F, 0F, -8F); // Box 10
		bodyModel[132].setRotationPoint(0F, 2F, -1F);

		bodyModel[133].addShapeBox(-13F, -30.5F, 10F, 24, 8, 8, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[133].setRotationPoint(0F, -2F, 0F);

		bodyModel[134].addShapeBox(11F, -28.5F, 10F, 21, 6, 8, 0F,0F, 1F, 0F, 0F, -.5F, 3F, 0F, -.5F, -11F, 0F, 1F, -8F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[134].setRotationPoint(0F, -2F, 0F);

		bodyModel[135].addShapeBox(11F, -26.5F, 10F, 21, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -.5F, 3F, 0F, -.5F, -11F, 0F, 1F, -8F); // Box 13
		bodyModel[135].setRotationPoint(0F, 2F, 0F);

		bodyModel[136].addShapeBox(32F, -26.5F, 6F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 1.5F, 0F, 0F, 0F, 1F, 0F, 0F, -5F, 0F, 1.5F, -3F); // Box 14
		bodyModel[136].setRotationPoint(0F, 2F, 0F);

		bodyModel[137].addShapeBox(32F, -26.5F, 6F, 12, 4, 4, 0F,0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 1.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F); // Box 15
		bodyModel[137].setRotationPoint(0F, -2F, 0F);

		bodyModel[138].addShapeBox(44F, -29.5F, 3F, 8, 3, 3, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F); // Box 16
		bodyModel[138].setRotationPoint(0F, 2F, 0F);

		bodyModel[139].addShapeBox(44F, -26.5F, 3F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, -1F); // Box 17
		bodyModel[139].setRotationPoint(0F, 2F, 0F);

		bodyModel[140].addShapeBox(52F, -26.5F, 3F, 2, 2, 3, 0F,0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, -2F); // Box 18
		bodyModel[140].setRotationPoint(0F, 2F, 0F);

		bodyModel[141].addShapeBox(52F, -28.5F, 3F, 2, 2, 3, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 1F, -1.5F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, -1.5F, 0F, 0F, 0F); // Box 19
		bodyModel[141].setRotationPoint(0F, 2F, 0F);

		bodyModel[142].addShapeBox(-31F, -28.5F, -21F, 3, 2, 7, 0F,-.8F, -1F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -1F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -3F); // Box 20
		bodyModel[142].setRotationPoint(0F, 2F, 0F);

		bodyModel[143].addShapeBox(-24F, -31.5F, -21F, 7, 5, 15, 0F,0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 21
		bodyModel[143].setRotationPoint(0F, 2F, 0F);

		bodyModel[144].addShapeBox(-17F, -31.5F, -21F, 9, 5, 9, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[144].setRotationPoint(0F, 2F, 0F);

		bodyModel[145].addShapeBox(-8F, -31.5F, -21F, 9, 5, 9, 0F,0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[145].setRotationPoint(0F, 2F, 0F);

		bodyModel[146].addShapeBox(1F, -30.5F, -21F, 9, 4, 9, 0F,0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[146].setRotationPoint(0F, 2F, 0F);

		bodyModel[147].addShapeBox(10F, -29.5F, -21F, 11, 3, 9, 0F,0F, -1F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[147].setRotationPoint(0F, 2F, 0F);

		bodyModel[148].addShapeBox(21F, -28.5F, -21F, 11, 2, 3, 0F,0F, -1F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -.5F, 6F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F); // Box 26
		bodyModel[148].setRotationPoint(0F, 2F, 0F);

		bodyModel[149].addShapeBox(-31F, -26.5F, -21F, 3, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -3F, -.8F, -1F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -1F, -1.5F); // Box 28
		bodyModel[149].setRotationPoint(0F, 2F, 0F);

		bodyModel[150].addShapeBox(-24F, -26.5F, -21F, 7, 4, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, .5F, -6F, 0F, 1F, 0F); // Box 29
		bodyModel[150].setRotationPoint(0F, 2F, 0F);

		bodyModel[151].addShapeBox(-17F, -26.5F, -21F, 9, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, .5F, 0F, 0F, .5F, 0F); // Box 30
		bodyModel[151].setRotationPoint(0F, 2F, 0F);

		bodyModel[152].addShapeBox(-8F, -26.5F, -21F, 9, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, .5F, 0F); // Box 31
		bodyModel[152].setRotationPoint(0F, 2F, 0F);

		bodyModel[153].addShapeBox(1F, -26.5F, -21F, 9, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 1F, 0F); // Box 32
		bodyModel[153].setRotationPoint(0F, 2F, 0F);

		bodyModel[154].addShapeBox(10F, -26.5F, -21F, 11, 3, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -.5F, 0F); // Box 33
		bodyModel[154].setRotationPoint(0F, 2F, 0F);

		bodyModel[155].addShapeBox(21F, -26.5F, -21F, 11, 2, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -.5F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -.5F, 3F); // Box 34
		bodyModel[155].setRotationPoint(0F, 2F, 0F);

		bodyModel[156].addShapeBox(-28F, -30.5F, -21F, 4, 4, 15, 0F,0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.5F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 35
		bodyModel[156].setRotationPoint(0F, 2F, 0F);

		bodyModel[157].addShapeBox(-28F, -26.5F, -21F, 4, 4, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1.5F, -8F); // Box 36
		bodyModel[157].setRotationPoint(0F, 2F, 0F);

		bodyModel[158].addShapeBox(-31F, -28.5F, 14F, 3, 2, 7, 0F,0F, -1F, -1.8F, 0F, .5F, 0F, 0F, 0F, 0F, -.8F, -1F, 0F, 2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[158].setRotationPoint(0F, 2F, 0F);

		bodyModel[159].addShapeBox(-31F, -26.5F, 14F, 3, 2, 7, 0F,2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, .5F, 0F, 0F, 0F, 0F, -.8F, -1F, 0F); // Box 54
		bodyModel[159].setRotationPoint(0F, 2F, 0F);

		bodyModel[160].addShapeBox(-28F, -30.5F, 6F, 4, 4, 15, 0F,0F, -1.5F, -8F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[160].setRotationPoint(0F, 2F, 0F);

		bodyModel[161].addShapeBox(-28F, -26.5F, 6F, 4, 4, 15, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -8F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F); // Box 56
		bodyModel[161].setRotationPoint(0F, 2F, 0F);

		bodyModel[162].addShapeBox(-24F, -26.5F, 6F, 7, 4, 15, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, .5F, -6F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 57
		bodyModel[162].setRotationPoint(0F, 2F, 0F);

		bodyModel[163].addShapeBox(-24F, -31.5F, 6F, 7, 5, 15, 0F,0F, -1F, 0F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[163].setRotationPoint(0F, 2F, 0F);

		bodyModel[164].addShapeBox(-17F, -31.5F, 12F, 9, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[164].setRotationPoint(0F, 2F, 0F);

		bodyModel[165].addShapeBox(-17F, -26.5F, 12F, 9, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 60
		bodyModel[165].setRotationPoint(0F, 2F, 0F);

		bodyModel[166].addShapeBox(-8F, -26.5F, 12F, 9, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 61
		bodyModel[166].setRotationPoint(0F, 2F, 0F);

		bodyModel[167].addShapeBox(1F, -30.5F, 12F, 9, 4, 9, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[167].setRotationPoint(0F, 2F, 0F);

		bodyModel[168].addShapeBox(-8F, -31.5F, 12F, 9, 5, 9, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[168].setRotationPoint(0F, 2F, 0F);

		bodyModel[169].addShapeBox(1F, -26.5F, 12F, 9, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[169].setRotationPoint(0F, 2F, 0F);

		bodyModel[170].addShapeBox(10F, -26.5F, 6F, 11, 3, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -.5F, 0F); // Box 65
		bodyModel[170].setRotationPoint(0F, 2F, 0F);

		bodyModel[171].addShapeBox(10F, -29.5F, 12F, 11, 3, 9, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[171].setRotationPoint(0F, 2F, 0F);

		bodyModel[172].addShapeBox(21F, -28.5F, 18F, 11, 2, 3, 0F,0F, -.5F, 6F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[172].setRotationPoint(0F, 2F, 0F);

		bodyModel[173].addShapeBox(21F, -26.5F, 18F, 11, 2, 3, 0F,0F, 0F, 3F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 3F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, -.5F, 0F); // Box 68
		bodyModel[173].setRotationPoint(0F, 2F, 0F);

		bodyModel[174].addShapeBox(-10F, -42F, 2F, 8, 9, 3, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[174].setRotationPoint(0F, 0F, 0F);

		bodyModel[175].addShapeBox(-2F, -41F, 2F, 13, 8, 3, 0F,0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[175].setRotationPoint(0F, 0F, 0F);

		bodyModel[176].addShapeBox(33F, -36F, 2F, 22, 6, 3, 0F,0F, 3F, 0F, 0F, -1F, 1F, 0F, -2F, -3F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, -2F, 0F); // Box 71
		bodyModel[176].setRotationPoint(0F, 0F, 0F);

		bodyModel[177].addShapeBox(11F, -38F, 2F, 22, 6, 3, 0F,0F, 4F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 72
		bodyModel[177].setRotationPoint(0F, 0F, 0F);

		bodyModel[178].addShapeBox(-10F, -40F, 5F, 8, 6, 3, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, -.8F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .8F, 0F, 0F, 1.2F); // Box 73
		bodyModel[178].setRotationPoint(0F, 0F, 0F);

		bodyModel[179].addShapeBox(-2F, -39F, 5F, 13, 6, 3, 0F,0F, 3F, 0F, 0F, 2F, 0F, 0F, 0F, -.5F, 0F, .2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, .8F); // Box 74
		bodyModel[179].setRotationPoint(0F, 0F, 0F);

		bodyModel[180].addShapeBox(11F, -36F, 5F, 22, 4, 3, 0F,0F, 5F, 0F, 0F, 2F, 0F, 0F, 2F, -3F, 0F, 3F, -.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, 0F); // Box 75
		bodyModel[180].setRotationPoint(0F, 0F, 0F);

		bodyModel[181].addShapeBox(55F, -34F, 1F, 15, 4, 1, 0F,0F, 1F, 0F, 0F, -2F, .5F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, .5F, 0F, 2F, -1F, 0F, 0F, 0F); // Box 76
		bodyModel[181].setRotationPoint(0F, 0F, 0F);

		bodyModel[182].addShapeBox(55F, -34F, -2F, 15, 4, 1, 0F,0F, 0F, 0F, 0F, -3F, -1F, 0F, -2F, .5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, .5F, 0F, 0F, 0F); // Box 77
		bodyModel[182].setRotationPoint(0F, 0F, 0F);

		bodyModel[183].addShapeBox(33F, -36F, -5F, 22, 6, 3, 0F,0F, 2F, 0F, 0F, -2F, -3F, 0F, -1F, 1F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, -2F, 0F); // Box 79
		bodyModel[183].setRotationPoint(0F, 0F, 0F);

		bodyModel[184].addShapeBox(11F, -38F, -5F, 22, 6, 3, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 82
		bodyModel[184].setRotationPoint(0F, 0F, 0F);

		bodyModel[185].addShapeBox(11F, -36F, -8F, 22, 4, 3, 0F,0F, 3F, -.5F, 0F, 2F, -3F, 0F, 2F, 0F, 0F, 5F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 83
		bodyModel[185].setRotationPoint(0F, 0F, 0F);

		bodyModel[186].addShapeBox(-2F, -39F, -8F, 13, 6, 3, 0F,0F, .2F, 0F, 0F, 0F, -.5F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, -1F, .8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 84
		bodyModel[186].setRotationPoint(0F, 0F, 0F);

		bodyModel[187].addShapeBox(-2F, -41F, -5F, 13, 8, 3, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[187].setRotationPoint(0F, 0F, 0F);

		bodyModel[188].addShapeBox(-10F, -42F, -5F, 8, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[188].setRotationPoint(0F, 0F, 0F);

		bodyModel[189].addShapeBox(-10F, -40F, -8F, 8, 6, 3, 0F,0F, -1F, 0F, 0F, -.8F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 1.2F, 0F, 0F, .8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[189].setRotationPoint(0F, 0F, 0F);

		bodyModel[190].addShapeBox(70F, -32F, -0.5F, 2, 4, 1, 0F,0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[190].setRotationPoint(0F, 0F, 0F);

		bodyModel[191].addShapeBox(70F, -32F, -1.5F, 2, 4, 1, 0F,0F, -1F, -.5F, -1F, -1F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[191].setRotationPoint(0F, 0F, 0F);

		bodyModel[192].addShapeBox(70F, -32F, 0.5F, 2, 4, 1, 0F,0F, 0F, 0F, -.5F, 0F, 0F, -1F, -1F, -.5F, 0F, -1F, -.5F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, -.5F, 0F, 0F, -.5F); // Box 2
		bodyModel[192].setRotationPoint(0F, 0F, 0F);

		bodyModel[193].addShapeBox(-53F, -13F, -1F, 6, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, -3F, -1.5F, 0F); // Box 0
		bodyModel[193].setRotationPoint(0F, 0F, 0F);

		bodyModel[194].addShapeBox(-47F, -13F, -1F, 11, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F); // Box 1
		bodyModel[194].setRotationPoint(0F, 0F, 0F);

		bodyModel[195].addShapeBox(-36F, -13F, -3F, 13, 10, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[195].setRotationPoint(0F, 0F, 0F);

		bodyModel[196].addShapeBox(-23F, -14F, -3F, 19, 11, 6, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[196].setRotationPoint(0F, 0F, 0F);

		bodyModel[197].addShapeBox(-4F, -14F, -2F, 3, 11, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[197].setRotationPoint(0F, 0F, 0F);

		bodyModel[198].addShapeBox(-1F, -14F, -2F, 12, 8, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[198].setRotationPoint(0F, 0F, 0F);

		bodyModel[199].addShapeBox(11F, -15F, -2F, 22, 8, 4, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[199].setRotationPoint(0F, 0F, 0F);

		bodyModel[200].addShapeBox(33F, -18F, -1F, 14, 8, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[200].setRotationPoint(0F, 0F, 0F);

		bodyModel[201].addShapeBox(47F, -20F, -1F, 8, 9, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, .5F); // Box 8
		bodyModel[201].setRotationPoint(0F, 0F, 0F);

		bodyModel[202].addShapeBox(55F, -25F, -1F, 16, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[202].setRotationPoint(0F, 0F, 0F);

		bodyModel[203].addShapeBox(-36F, -14F, 3F, 13, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 11
		bodyModel[203].setRotationPoint(0F, 0F, 0F);

		bodyModel[204].addShapeBox(-23F, -15F, 3F, 19, 12, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -1F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 12
		bodyModel[204].setRotationPoint(0F, 0F, 0F);

		bodyModel[205].addShapeBox(-50F, -13F, 1F, 3, 5, 1, 0F,0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 2.5F, 0F, .5F, 1F, 0F, -1.5F, 0F, 0F, .5F, 0F, 0F, .5F, -1F, 0F, -1.5F, -1F); // Box 13
		bodyModel[205].setRotationPoint(0F, 0F, 0F);

		bodyModel[206].addShapeBox(-47F, -13F, 1F, 11, 10, 2, 0F,0F, .5F, 0F, 0F, .5F, 0F, 0F, 1F, 5F, 0F, .5F, 1.5F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -2F); // Box 14
		bodyModel[206].setRotationPoint(0F, 0F, 0F);

		bodyModel[207].addShapeBox(-53F, -13F, 1F, 3, 4, 1, 0F,0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 1F, 0F, .5F, -1F, 0F, -4F, 0F, 0F, -.5F, 0F, 0F, -.5F, -1F, 0F, -4F, -1F); // Box 15
		bodyModel[207].setRotationPoint(0F, 0F, 0F);

		bodyModel[208].addShapeBox(-4F, -15F, 2F, 3, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -1F); // Box 16
		bodyModel[208].setRotationPoint(0F, 0F, 0F);

		bodyModel[209].addShapeBox(-1F, -15F, 2F, 12, 9, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 4F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[209].setRotationPoint(0F, 0F, 0F);

		bodyModel[210].addShapeBox(11F, -16F, 2F, 22, 9, 2, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 1F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -2F, 0F, 0F, 0F); // Box 18
		bodyModel[210].setRotationPoint(0F, 0F, 0F);

		bodyModel[211].addShapeBox(33F, -19F, 2F, 14, 9, 1, 0F,0F, 0F, 0F, 0F, 2F, 1F, 0F, 2F, -1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, -2F, 1F, 0F, -2F, -1.5F, 0F, 0F, -1F); // Box 19
		bodyModel[211].setRotationPoint(0F, 0F, 0F);

		bodyModel[212].addShapeBox(-53F, -13F, -2F, 3, 4, 1, 0F,0F, .5F, -1F, 0F, .5F, 1F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -4F, -1F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, -4F, 0F); // Box 20
		bodyModel[212].setRotationPoint(0F, 0F, 0F);

		bodyModel[213].addShapeBox(-50F, -13F, -2F, 3, 5, 1, 0F,0F, .5F, 1F, 0F, .5F, 2.5F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -1.5F, -1F, 0F, .5F, -1F, 0F, .5F, 0F, 0F, -1.5F, 0F); // Box 21
		bodyModel[213].setRotationPoint(0F, 0F, 0F);

		bodyModel[214].addShapeBox(-47F, -13F, -3F, 11, 10, 2, 0F,0F, .5F, 1.5F, 0F, 1F, 5F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -4.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F); // Box 22
		bodyModel[214].setRotationPoint(0F, 0F, 0F);

		bodyModel[215].addShapeBox(-36F, -14F, -4F, 13, 11, 1, 0F,0F, 0F, 4F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[215].setRotationPoint(0F, 0F, 0F);

		bodyModel[216].addShapeBox(-23F, -15F, -4F, 19, 12, 1, 0F,0F, -1F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[216].setRotationPoint(0F, 0F, 0F);

		bodyModel[217].addShapeBox(-1F, -15F, -4F, 12, 9, 2, 0F,0F, 0F, 5F, 0F, 1F, 4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[217].setRotationPoint(0F, 0F, 0F);

		bodyModel[218].addShapeBox(11F, -16F, -4F, 22, 9, 2, 0F,0F, 0F, 4F, 0F, 3F, 1F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[218].setRotationPoint(0F, 0F, 0F);

		bodyModel[219].addShapeBox(33F, -19F, -3F, 14, 9, 1, 0F,0F, 0F, 2F, 0F, 2F, -1F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1.5F, 0F, -2F, 1F, 0F, 0F, 1F); // Box 27
		bodyModel[219].setRotationPoint(0F, 0F, 0F);

		bodyModel[220].addShapeBox(-4F, -15F, -4F, 3, 12, 2, 0F,0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[220].setRotationPoint(0F, 0F, 0F);

		bodyModel[221].addShapeBox(-58F, -33F, -6F, 11, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[221].setRotationPoint(0F, 0F, 0F);

		bodyModel[222].addShapeBox(-46F, -33F, 8F, 11, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .1F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .6F, 0F, 0F, .2F); // Box 49
		bodyModel[222].setRotationPoint(0F, 0F, 0F);

		bodyModel[223].addShapeBox(-34F, -33F, 8F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F); // Box 50
		bodyModel[223].setRotationPoint(0F, 0F, 0F);

		bodyModel[224].addShapeBox(-27F, -33F, 8F, 17, 2, 1, 0F,0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, -.2F, 0F, 0F, .1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, .6F); // Box 51
		bodyModel[224].setRotationPoint(0F, 0F, 0F);

		bodyModel[225].addShapeBox(-24F, -40F, -8F, 1, 1, 3, 0F,1.5F, -1F, 0F, -1.5F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 52
		bodyModel[225].setRotationPoint(0F, 0F, 0F);

		bodyModel[226].addShapeBox(-24F, -42F, -5F, 14, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 53
		bodyModel[226].setRotationPoint(0F, 0F, 0F);

		bodyModel[227].addShapeBox(-24F, -43F, -2F, 14, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[227].setRotationPoint(0F, 0F, 0F);

		bodyModel[228].addShapeBox(-24F, -42F, 2F, 14, 1, 3, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[228].setRotationPoint(0F, 0F, 0F);

		bodyModel[229].addShapeBox(-25.5F, -40F, -8F, 1, 8, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, .5F, -.3F, -2F, -.5F, -.3F, -2F, 2F, 0F, 1.4F, -2F, 0F, 1.4F, -2F, 0F, -3F, 2F, 0F, -3F); // Box 58
		bodyModel[229].setRotationPoint(0F, 0F, 0F);

		bodyModel[230].addShapeBox(-17F, -39F, -8F, 7, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, .7F, 0F, -1F, .7F, 0F, -1F, -2F, 0F, -2F, 1F, .5F, -2F, 1F, -.5F, -1F, -2.8F, 0F); // Box 3
		bodyModel[230].setRotationPoint(0F, 0F, 0F);

		bodyModel[231].addShapeBox(-23F, -40F, -8F, 13, 1, 3, 0F,-7F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 6
		bodyModel[231].setRotationPoint(0F, 0F, 0F);

		bodyModel[232].addShapeBox(-11F, -40F, -8F, 1, 8, 3, 0F,1F, -4F, .5F, 0F, -1F, 0F, 0F, -1F, -2F, 1F, -4F, -2.5F, 0F, 0F, 1.8F, 0F, 0F, 1.8F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 7
		bodyModel[232].setRotationPoint(0F, 0F, 0F);

		bodyModel[233].addShapeBox(-35F, -40F, -8F, 1, 8, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -.3F, -2F, 0F, -.3F, -2F, 0F, 0F, 1.4F, 0F, 0F, 1.4F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 9
		bodyModel[233].setRotationPoint(0F, 0F, 0F);

		bodyModel[234].addShapeBox(-35F, -40F, -8F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 10
		bodyModel[234].setRotationPoint(0F, 0F, 0F);

		bodyModel[235].addShapeBox(-35F, -42F, -5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 11
		bodyModel[235].setRotationPoint(0F, 0F, 0F);

		bodyModel[236].addShapeBox(-35F, -43F, -2F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[236].setRotationPoint(0F, 0F, 0F);

		bodyModel[237].addShapeBox(-35F, -42F, 2F, 1, 1, 3, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[237].setRotationPoint(0F, 0F, 0F);

		bodyModel[238].addShapeBox(-25F, -42F, 2F, 1, 1, 3, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[238].setRotationPoint(0F, 0F, 0F);

		bodyModel[239].addShapeBox(-25F, -43F, -2F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[239].setRotationPoint(0F, 0F, 0F);

		bodyModel[240].addShapeBox(-25F, -42F, -5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 2
		bodyModel[240].setRotationPoint(0F, 0F, 0F);

		bodyModel[241].addShapeBox(-26.5F, -40F, -8F, 1, 8, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, .5F, -.3F, -2F, -.5F, -.3F, -2F, 2F, 0F, 1.4F, -2F, 0F, 1.4F, -2F, 0F, -3F, 2F, 0F, -3F); // Box 4
		bodyModel[241].setRotationPoint(0F, 0F, 0F);

		bodyModel[242].addShapeBox(-25F, -40F, -8F, 1, 1, 3, 0F,1.5F, -1F, 0F, -1.5F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 5
		bodyModel[242].setRotationPoint(0F, 0F, 0F);

		bodyModel[243].addShapeBox(-34F, -43F, -0.5F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[243].setRotationPoint(0F, 0F, 0F);

		bodyModel[244].addShapeBox(-47F, -41F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[244].setRotationPoint(0F, 0F, 0F);

		bodyModel[245].addShapeBox(-47F, -40F, -4.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 8
		bodyModel[245].setRotationPoint(0F, 0F, 0F);

		bodyModel[246].addShapeBox(-47F, -39F, -7.5F, 1, 1, 3, 0F,0F, -1.6F, -0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 9
		bodyModel[246].setRotationPoint(0F, 0F, 0F);

		bodyModel[247].addShapeBox(-47F, -37F, -7.5F, 1, 5, 1, 0F,0F, .4F, 0F, 0F, .4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 10
		bodyModel[247].setRotationPoint(0F, 0F, 0F);

		bodyModel[248].addShapeBox(-35F, -40F, 5F, 1, 1, 3, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[248].setRotationPoint(0F, 0F, 0F);

		bodyModel[249].addShapeBox(-35F, -40F, 5F, 1, 8, 3, 0F,0F, -.3F, -2F, 0F, -.3F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1.4F, 0F, 0F, 1.4F); // Box 12
		bodyModel[249].setRotationPoint(0F, 0F, 0F);

		bodyModel[250].addShapeBox(-47F, -39F, 4.5F, 1, 1, 3, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F, -1.6F, -0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 13
		bodyModel[250].setRotationPoint(0F, 0F, 0F);

		bodyModel[251].addShapeBox(-47F, -37F, 6.5F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, .4F, 0F, 0F, .4F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 14
		bodyModel[251].setRotationPoint(0F, 0F, 0F);

		bodyModel[252].addShapeBox(-47F, -40F, 1.5F, 1, 1, 3, 0F,0F, 1F, 0F, 0F, 1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[252].setRotationPoint(0F, 0F, 0F);

		bodyModel[253].addShapeBox(-24F, -40F, 5F, 1, 1, 3, 0F,0F, 2F, 0F, 0F, 2F, 0F, -1.5F, -1F, 0F, 1.5F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 16
		bodyModel[253].setRotationPoint(0F, 0F, 0F);

		bodyModel[254].addShapeBox(-25F, -40F, 5F, 1, 1, 3, 0F,0F, 2F, 0F, 0F, 2F, 0F, -1.5F, -1F, 0F, 1.5F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 17
		bodyModel[254].setRotationPoint(0F, 0F, 0F);

		bodyModel[255].addShapeBox(-25.5F, -40F, 5F, 1, 8, 3, 0F,-.5F, -.3F, -2F, .5F, -.3F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 2F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 1.4F, 2F, 0F, 1.4F); // Box 18
		bodyModel[255].setRotationPoint(0F, 0F, 0F);

		bodyModel[256].addShapeBox(-26.5F, -40F, 5F, 1, 8, 3, 0F,-.5F, -.3F, -2F, .5F, -.3F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 2F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 1.4F, 2F, 0F, 1.4F); // Box 19
		bodyModel[256].setRotationPoint(0F, 0F, 0F);

		bodyModel[257].addShapeBox(-46F, -41F, -6.5F, 11, 1, 1, 0F,0F, -3F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -.7F, 0F, 0F, 2F, 0F); // Box 20
		bodyModel[257].setRotationPoint(0F, 0F, 0F);

		bodyModel[258].addShapeBox(-46F, -41F, 5.5F, 11, 1, 1, 0F,0F, -2F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, -.7F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 0
		bodyModel[258].setRotationPoint(0F, 0F, 0F);

		bodyModel[259].addShapeBox(-54F, -33F, 7.5F, 7, 4, 1, 0F,0F, .1F, 4F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, .1F, -4F, 0F, 0F, 4F, 0F, -2F, 0F, 0F, -2F, .9F, 0F, 0F, -4F); // Box 4
		bodyModel[259].setRotationPoint(0F, 0F, 0F);

		bodyModel[260].addShapeBox(-56F, -33F, -4.5F, 2, 4, 9, 0F,0F, .1F, -1.5F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Box 0
		bodyModel[260].setRotationPoint(0F, 0F, 0F);

		bodyModel[261].addShapeBox(-54F, -33F, -8.5F, 7, 4, 1, 0F,0F, .1F, -4F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, .1F, 4F, 0F, 0F, -4F, 0F, -2F, .9F, 0F, -2F, 0F, 0F, 0F, 4F); // Box 1
		bodyModel[261].setRotationPoint(0F, 0F, 0F);

		bodyModel[262].addShapeBox(-58F, -33F, -3F, 2, 4, 6, 0F,0F, .1F, -2.5F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F); // Box 2
		bodyModel[262].setRotationPoint(0F, 0F, 0F);

		bodyModel[263].addShapeBox(-46F, -33F, -9F, 11, 2, 1, 0F,0F, 0F, -.3F, 0F, 0F, .1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, .6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[263].setRotationPoint(0F, 0F, 0F);

		bodyModel[264].addShapeBox(-34F, -33F, -9F, 6, 2, 1, 0F,0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[264].setRotationPoint(0F, 0F, 0F);

		bodyModel[265].addShapeBox(-27F, -33F, -9F, 17, 2, 1, 0F,0F, 0F, .1F, 0F, 2.5F, -.2F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, .6F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[265].setRotationPoint(0F, 0F, 0F);

		bodyModel[266].addShapeBox(-23F, -40F, 5F, 13, 1, 3, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, -7F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -7F, 0F, 0F); // Box 6
		bodyModel[266].setRotationPoint(0F, 0F, 0F);

		bodyModel[267].addShapeBox(-17F, -39F, 7F, 7, 2, 1, 0F,-1F, .7F, 0F, 0F, .7F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2.8F, 0F, -2F, 1F, -.5F, -2F, 1F, .5F, -1F, -2F, 0F); // Box 7
		bodyModel[267].setRotationPoint(0F, 0F, 0F);

		bodyModel[268].addShapeBox(-11F, -40F, 5F, 1, 8, 3, 0F,1F, -4F, -2.5F, 0F, -1F, -2F, 0F, -1F, 0F, 1F, -4F, .5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1.8F, 0F, 0F, 1.8F); // Box 8
		bodyModel[268].setRotationPoint(0F, 0F, 0F);

		bodyModel[269].addShapeBox(-23F, -40.5F, 5F, 13, 8, 3, 0F,0F, 1.4F, 0F, 0F, 1.4F, 0F, 0F, -1.8F, -.2F, 2.5F, -1.8F, -.2F, 4.5F, 1F, -4F, 0F, 0F, -4F, 0F, 0F, 1.2F, 4.5F, 1F, 1.2F); // Box 9
		bodyModel[269].setRotationPoint(0F, 0F, 0F);

		bodyModel[270].addShapeBox(-34F, -40.5F, -8F, 9, 8, 3, 0F,0F, -1.6F, -.5F, 0F, -1.6F, -.5F, 0F, 1.4F, 0F, 0F, 1.4F, 0F, 0F, 0F, 1.1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[270].setRotationPoint(0F, 0F, 0F);

		bodyModel[271].addShapeBox(-34F, -42F, -5F, 9, 1, 3, 0F,0F, -.1F, 0F, 0F, -.1F, 0F, 0F, .9F, 0F, 0F, .9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[271].setRotationPoint(0F, 0F, 0F);

		bodyModel[272].addShapeBox(-34F, -43F, -2F, 9, 1, 4, 0F,0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[272].setRotationPoint(0F, 0F, 0F);

		bodyModel[273].addShapeBox(-46F, -40.5F, -8F, 11, 8, 3, 0F,0F, -3.5F, -.8F, 0F, -1.6F, -.5F, 0F, 1.4F, 0F, 0F, -.7F, .5F, 0F, 0F, .7F, 0F, 0F, 1.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[273].setRotationPoint(0F, 0F, 0F);

		bodyModel[274].addShapeBox(-46F, -42F, -5F, 11, 1, 3, 0F,0F, -2.2F, -.5F, 0F, -.1F, 0F, 0F, .9F, 0F, 0F, -1F, .5F, 0F, 2F, -.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, .5F); // Box 3
		bodyModel[274].setRotationPoint(0F, 0F, 0F);

		bodyModel[275].addShapeBox(-46F, -43F, -2F, 11, 1, 4, 0F,0F, -2F, -.5F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -2F, -.5F, 0F, 2F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -.5F); // Box 4
		bodyModel[275].setRotationPoint(0F, 0F, 0F);

		bodyModel[276].addShapeBox(-54F, -37F, -4.5F, 7, 4, 17, 0F,0F, -1.9F, -4.8F, 0F, .4F, -1.2F, 0F, .4F, -1.2F, 0F, -1.9F, -4.8F, 0F, 0F, -4.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.2F); // Box 0
		bodyModel[276].setRotationPoint(0F, 0F, -4F);

		bodyModel[277].addShapeBox(-56F, -35F, -4.5F, 2, 2, 9, 0F,0F, -1F, -2F, 0F, .1F, -.8F, 0F, .1F, -.8F, 0F, -1F, -2F, 0F, 0F, -1.7F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -1.7F); // Box 1
		bodyModel[277].setRotationPoint(0F, 0F, 0F);

		bodyModel[278].addShapeBox(-58F, -34F, -3F, 2, 1, 6, 0F,-.2F, -1F, -2.6F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.2F, -1F, -2.6F, -.2F, 0F, -2.6F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.2F, 0F, -2.6F); // Box 2
		bodyModel[278].setRotationPoint(0F, 0F, 0F);

		bodyModel[279].addShapeBox(-54F, -40F, -4.5F, 7, 2, 17, 0F,0F, -3.5F, -6F, 0F, 0F, -4.2F, 0F, 0F, -4.2F, 0F, -3.5F, -6F, 0F, 2.9F, -4.8F, 0F, .6F, -1.2F, 0F, .6F, -1.2F, 0F, 2.9F, -4.8F); // Box 6
		bodyModel[279].setRotationPoint(0F, 0F, -4F);

		bodyModel[280].addShapeBox(-54F, -41F, 0.5F, 7, 1, 7, 0F,0F, -4F, -2F, 0F, -.2F, -2F, 0F, -.2F, -2F, 0F, -4F, -2F, 0F, 3.5F, -1F, 0F, 0F, .8F, 0F, 0F, .8F, 0F, 3.5F, -1F); // Box 7
		bodyModel[280].setRotationPoint(0F, 0F, -4F);

		bodyModel[281].addShapeBox(-58F, -35F, -3F, 2, 1, 6, 0F,-.2F, -2F, -2.6F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, -.2F, -2F, -2.6F, -.2F, 1F, -2.6F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.2F, 1F, -2.6F); // Box 8
		bodyModel[281].setRotationPoint(0F, 0F, 0F);

		bodyModel[282].addShapeBox(-56F, -36F, -4.5F, 2, 1, 9, 0F,0F, -1F, -2.8F, 0F, .5F, -2F, 0F, .5F, -2F, 0F, -1F, -2.8F, 0F, 1F, -2F, 0F, -.1F, -.8F, 0F, -.1F, -.8F, 0F, 1F, -2F); // Box 9
		bodyModel[282].setRotationPoint(0F, 0F, 0F);

		bodyModel[283].addShapeBox(-56F, -37F, -4.5F, 2, 1, 9, 0F,0F, -1.6F, -3.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1.6F, -3.5F, 0F, 1F, -2.8F, 0F, -.5F, -2F, 0F, -.5F, -2F, 0F, 1F, -2.8F); // Box 0
		bodyModel[283].setRotationPoint(0F, 0F, 0F);

		bodyModel[284].addShapeBox(-58F, -36F, -3F, 2, 1, 6, 0F,-.2F, -3F, -2.6F, 0F, -.6F, -2F, 0F, -.6F, -2F, -.2F, -3F, -2.6F, -.2F, 2F, -2.6F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, -.2F, 2F, -2.6F); // Box 2
		bodyModel[284].setRotationPoint(0F, 0F, 0F);

		bodyModel[285].addShapeBox(-34F, -40.5F, 5F, 9, 8, 3, 0F,0F, 1.4F, 0F, 0F, 1.4F, 0F, 0F, -1.6F, -.5F, 0F, -1.6F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.0F, 0F, 0F, 1.1F); // Box 3
		bodyModel[285].setRotationPoint(0F, 0F, 0F);

		bodyModel[286].addShapeBox(-34F, -42F, 2F, 9, 1, 3, 0F,0F, .9F, 0F, 0F, .9F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[286].setRotationPoint(0F, 0F, 0F);

		bodyModel[287].addShapeBox(-46F, -40.5F, 5F, 11, 8, 3, 0F,0F, -.7F, .5F, 0F, 1.4F, 0F, 0F, -1.6F, -.5F, 0F, -3.5F, -.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.1F, 0F, 0F, .7F); // Box 5
		bodyModel[287].setRotationPoint(0F, 0F, 0F);

		bodyModel[288].addShapeBox(-46F, -42F, 2F, 11, 1, 3, 0F,0F, -1F, .5F, 0F, .9F, 0F, 0F, -.1F, 0F, 0F, -2.2F, -.5F, 0F, 1F, .5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, -.5F); // Box 6
		bodyModel[288].setRotationPoint(0F, 0F, 0F);

		bodyModel[289].addShapeBox(-23F, -33F, -6F, 13, 15, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[289].setRotationPoint(0F, 0F, 0F);

		bodyModel[290].addShapeBox(-23F, -39F, -5F, 13, 6, 4, 0F,0F, -1.5F, -1F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[290].setRotationPoint(0F, 0F, 0F);

		bodyModel[291].addShapeBox(-23F, -39F, -1F, 13, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[291].setRotationPoint(0F, 0F, 0F);

		bodyModel[292].addShapeBox(-23.5F, -40F, -4F, 15, 1, 2, 0F,0F, -.1F, -.5F, 0F, -.1F, -.5F, 0F, -.1F, -.5F, 0F, -.1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[292].setRotationPoint(0F, 0F, 0F);

		bodyModel[293].addShapeBox(-23F, -39F, 1F, 13, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 15
		bodyModel[293].setRotationPoint(0F, 0F, 0F);

		bodyModel[294].addShapeBox(-23.5F, -39F, -4F, 15, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.1F, -.5F, 0F, -.1F, -.5F, 0F, -.1F, -.5F, 0F, -.1F, -.5F); // Box 16
		bodyModel[294].setRotationPoint(0F, 0F, 0F);

		bodyModel[295].addShapeBox(-23.5F, -37F, -6F, 15, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.1F, -.5F, 0F, -.1F, -.5F, 0F, -.1F, -.5F, 0F, -.1F, -.5F); // Box 17
		bodyModel[295].setRotationPoint(0F, 0F, 0F);

		bodyModel[296].addShapeBox(-23.5F, -38F, -6F, 15, 1, 2, 0F,0F, -.1F, -.5F, 0F, -.1F, -.5F, 0F, -.1F, -.5F, 0F, -.1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[296].setRotationPoint(0F, 0F, 0F);

		bodyModel[297].addShapeBox(-23.5F, -37F, 4F, 15, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.1F, -.5F, 0F, -.1F, -.5F, 0F, -.1F, -.5F, 0F, -.1F, -.5F); // Box 19
		bodyModel[297].setRotationPoint(0F, 0F, 0F);

		bodyModel[298].addShapeBox(-23.5F, -38F, 4F, 15, 1, 2, 0F,0F, -.1F, -.5F, 0F, -.1F, -.5F, 0F, -.1F, -.5F, 0F, -.1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[298].setRotationPoint(0F, 0F, 0F);

		bodyModel[299].addShapeBox(-23F, -41F, 2F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[299].setRotationPoint(0F, 0F, 0F);

		bodyModel[300].addShapeBox(-23.5F, -39.5F, -1.5F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[300].setRotationPoint(0F, 0F, 0F);

		bodyModel[301].addShapeBox(-23.5F, -39.5F, -0.5F, 15, 1, 1, 0F,0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // Box 23
		bodyModel[301].setRotationPoint(0F, 0F, 0F);

		bodyModel[302].addShapeBox(-24F, -41F, 2F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[302].setRotationPoint(0F, 0F, 0F);

		bodyModel[303].addShapeBox(-24F, -39F, 2F, 1, 2, 1, 0F,.2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F); // Box 25
		bodyModel[303].setRotationPoint(0F, 0F, 0F);

		bodyModel[304].addShapeBox(-28F, -33F, -6F, 4, 15, 12, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[304].setRotationPoint(0F, 0F, 0F);

		bodyModel[305].addShapeBox(-26F, -36F, -6F, 2, 3, 12, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[305].setRotationPoint(0F, 0F, 0F);

		bodyModel[306].addShapeBox(-26F, -39F, -4F, 2, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[306].setRotationPoint(0F, 0F, 0F);

		bodyModel[307].addShapeBox(-26F, -40F, -4F, 2, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[307].setRotationPoint(0F, 0F, 0F);

		bodyModel[308].addShapeBox(-36F, -21F, -5F, 9, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[308].setRotationPoint(0F, 0F, 0F);

		bodyModel[309].addShapeBox(-37F, -21F, -5F, 1, 2, 10, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 31
		bodyModel[309].setRotationPoint(0F, 0F, 0F);

		bodyModel[310].addShapeBox(-29F, -31F, -5F, 3, 10, 10, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[310].setRotationPoint(0F, 0F, 0F);

		bodyModel[311].addShapeBox(-27F, -32F, -5F, 1, 1, 10, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[311].setRotationPoint(0F, 0F, 0F);

		bodyModel[312].addShapeBox(-26.5F, -39F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[312].setRotationPoint(0F, 0F, 0F);

		bodyModel[313].addShapeBox(-29.2F, -31.5F, -4F, 3, 11, 2, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[313].setRotationPoint(0F, 0F, 0F);

		bodyModel[314].addShapeBox(-29.2F, -31.5F, 2F, 3, 11, 2, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[314].setRotationPoint(0F, 0F, 0F);

		bodyModel[315].addShapeBox(-37.4F, -21.2F, 2F, 11, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[315].setRotationPoint(0F, 0F, 0F);

		bodyModel[316].addShapeBox(-37.4F, -21.2F, -4F, 11, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[316].setRotationPoint(0F, 0F, 0F);

		bodyModel[317].addShapeBox(-47F, -33F, -6F, 3, 8, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[317].setRotationPoint(0F, 0F, 0F);

		bodyModel[318].addShapeBox(-45.9F, -27.5F, -3F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[318].setRotationPoint(1F, 0F, 0F);

		bodyModel[319].addShapeBox(-45.9F, -31.4F, -1F, 1, 1, 2, 0F,0F, .2F, -.5F, 0F, .2F, -.5F, 0F, .2F, -.5F, 0F, .2F, -.5F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F); // Box 0
		bodyModel[319].setRotationPoint(1F, 0F, 0F);

		bodyModel[320].addShapeBox(-45.9F, -30.4F, -1F, 1, 1, 2, 0F,0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, .2F, -.5F, 0F, .2F, -.5F, 0F, .2F, -.5F, 0F, .2F, -.5F); // Box 1
		bodyModel[320].setRotationPoint(1F, 0F, 0F);

		bodyModel[321].addShapeBox(-45.9F, -31.6F, -3.6F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Box 2
		bodyModel[321].setRotationPoint(1F, 0F, 0F);

		bodyModel[322].addShapeBox(-45.9F, -32.6F, -3.6F, 1, 1, 2, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[322].setRotationPoint(1F, 0F, 0F);

		bodyModel[323].addShapeBox(-45.9F, -29.2F, -3.6F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Box 4
		bodyModel[323].setRotationPoint(1F, 0F, 0F);

		bodyModel[324].addShapeBox(-45.9F, -30.2F, -3.6F, 1, 1, 2, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[324].setRotationPoint(1F, 0F, 0F);

		bodyModel[325].addShapeBox(-45.9F, -31.6F, 1.6F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Box 6
		bodyModel[325].setRotationPoint(1F, 0F, 0F);

		bodyModel[326].addShapeBox(-45.9F, -32.6F, 1.6F, 1, 1, 2, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[326].setRotationPoint(1F, 0F, 0F);

		bodyModel[327].addShapeBox(-45.9F, -30.2F, 1.6F, 1, 1, 2, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[327].setRotationPoint(1F, 0F, 0F);

		bodyModel[328].addShapeBox(-45.9F, -29.2F, 1.6F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Box 9
		bodyModel[328].setRotationPoint(1F, 0F, 0F);

		bodyModel[329].addShapeBox(-45.8F, -27F, 1.7F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[329].setRotationPoint(1F, 0F, 0F);

		bodyModel[330].addShapeBox(-45.9F, -30.2F, 4F, 1, 1, 2, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[330].setRotationPoint(1F, 0F, 0F);

		bodyModel[331].addShapeBox(-45.9F, -29.2F, 4F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Box 12
		bodyModel[331].setRotationPoint(1F, 0F, 0F);

		bodyModel[332].addShapeBox(-45.9F, -30.2F, -6F, 1, 1, 2, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[332].setRotationPoint(1F, 0F, 0F);

		bodyModel[333].addShapeBox(-45.9F, -29.2F, -6F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Box 14
		bodyModel[333].setRotationPoint(1F, 0F, 0F);

		bodyModel[334].addShapeBox(-46F, -33.5F, -5F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[334].setRotationPoint(0F, 0F, 0F);

		bodyModel[335].addShapeBox(-46F, -39F, -5.5F, 1, 6, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[335].setRotationPoint(0F, 0F, 0F);

		bodyModel[336].addShapeBox(-46F, -39F, -3.5F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[336].setRotationPoint(0F, 0F, 0F);

		bodyModel[337].addShapeBox(-46F, -39F, 4.5F, 1, 6, 1, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[337].setRotationPoint(0F, 0F, 0F);

		bodyModel[338].addShapeBox(-45.2F, -34.5F, -0.5F, 1, 1, 1, 0F,0F, .3F, -.1F, 0F, .3F, -.1F, 0F, .3F, -.1F, 0F, .3F, -.1F, 0F, .3F, -.1F, 0F, .3F, -.1F, 0F, .3F, -.1F, 0F, .3F, -.1F); // Box 19
		bodyModel[338].setRotationPoint(0F, 0F, 0F);

		bodyModel[339].addShapeBox(-45.5F, -35F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[339].setRotationPoint(0F, 0F, 0F);

		bodyModel[340].addShapeBox(-45.5F, -35.8F, -1.5F, 1, 1, 1, 0F,0F, -.7F, -.9F, 0F, 0F, -.9F, 0F, 0F, 0F, 0F, -.7F, 0F, 0F, 0F, -.9F, 0F, 0F, -.9F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[340].setRotationPoint(0F, 0F, 0F);

		bodyModel[341].addShapeBox(-45.5F, -36F, -0.5F, 1, 1, 1, 0F,-.1F, -.9F, -.1F, -.1F, -.9F, -.1F, -.1F, -.9F, -.1F, -.1F, -.9F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F); // Box 2
		bodyModel[341].setRotationPoint(0F, 0F, 0F);

		bodyModel[342].addShapeBox(-45.5F, -36F, -0.5F, 1, 1, 1, 0F,-.2F, -.8F, -.2F, -.2F, -.8F, -.2F, -.2F, -.8F, -.2F, -.2F, -.8F, -.2F, -.15F, -.1F, -.15F, -.15F, -.1F, -.15F, -.15F, -.1F, -.15F, -.15F, -.1F, -.15F); // Box 3
		bodyModel[342].setRotationPoint(0F, 0F, 0F);

		bodyModel[343].addShapeBox(-7.2F, -57.3F, -0.5F, 1, 1, 1, 0F,0F, -.45F, 0F, -.3F, -.45F, 0F, -.8F, -.45F, -.5F, 0F, -.45F, -.5F, 0F, -.45F, 0F, -.3F, -.45F, 0F, -.8F, -.45F, -.5F, 0F, -.45F, -.5F); // Box 4
		bodyModel[343].setRotationPoint(0F, 0F, 0F);
		bodyModel[343].rotateAngleZ = 0.78539816F;

		bodyModel[344].addShapeBox(-12F, -57.3F, -6F, 12, 1, 12, 0F,-5F, -.47F, -5.6F, -5F, -.47F, -5.6F, -5F, -.47F, -5.6F, -5F, -.47F, -5.6F, -5F, -.47F, -5.6F, -5F, -.47F, -5.6F, -5F, -.47F, -5.6F, -5F, -.47F, -5.6F); // Box 5
		bodyModel[344].setRotationPoint(0F, 0F, 0F);
		bodyModel[344].rotateAngleZ = 0.78539816F;

		bodyModel[345].addShapeBox(-7.2F, -57.3F, -0.5F, 1, 1, 1, 0F,0F, -.45F, 0F, 0F, -.45F, 0F, 0F, -.45F, -.8F, 0F, -.45F, -.8F, 0F, -.45F, 0F, 0F, -.45F, 0F, 0F, -.45F, -.8F, 0F, -.45F, -.8F); // Box 6
		bodyModel[345].setRotationPoint(0F, 0F, 0F);
		bodyModel[345].rotateAngleZ = 0.78539816F;

		bodyModel[346].addShapeBox(-7.2F, -57.3F, -0.5F, 1, 1, 1, 0F,0F, -.45F, -.8F, 0F, -.45F, -.8F, 0F, -.45F, 0F, 0F, -.45F, 0F, 0F, -.45F, -.8F, 0F, -.45F, -.8F, 0F, -.45F, 0F, 0F, -.45F, 0F); // Box 7
		bodyModel[346].setRotationPoint(0F, 0F, 0F);
		bodyModel[346].rotateAngleZ = 0.78539816F;

		bodyModel[347].addShapeBox(-7.2F, -57.3F, -0.5F, 1, 1, 1, 0F,0F, -.45F, -.5F, -.8F, -.45F, -.5F, -.3F, -.45F, 0F, 0F, -.45F, 0F, 0F, -.45F, -.5F, -.8F, -.45F, -.5F, -.3F, -.45F, 0F, 0F, -.45F, 0F); // Box 8
		bodyModel[347].setRotationPoint(0F, 0F, 0F);
		bodyModel[347].rotateAngleZ = 0.78539816F;

		bodyModel[348].addShapeBox(-45.5F, -35.8F, 0.5F, 1, 1, 1, 0F,0F, -.7F, 0F, 0F, 0F, 0F, 0F, 0F, -.9F, 0F, -.7F, -.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.9F, 0F, 0F, -.9F); // Box 9
		bodyModel[348].setRotationPoint(0F, 0F, 0F);

		bodyModel[349].addShapeBox(-36F, -33F, -12F, 13, 4, 6, 0F,0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, -.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 0
		bodyModel[349].setRotationPoint(0F, 0F, 0F);

		bodyModel[350].addShapeBox(-47F, -33F, -12F, 11, 4, 6, 0F,0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, -.2F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 1
		bodyModel[350].setRotationPoint(0F, 0F, 0F);

		bodyModel[351].addShapeBox(-45F, -27F, -9F, 2, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[351].setRotationPoint(0F, 0F, 0F);

		bodyModel[352].addShapeBox(-43F, -27F, -9F, 4, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[352].setRotationPoint(0F, 0F, 0F);

		bodyModel[353].addShapeBox(-39F, -27F, -9F, 13, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[353].setRotationPoint(0F, 0F, 0F);

		bodyModel[354].addShapeBox(-43F, -25F, -8F, 4, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[354].setRotationPoint(0F, 0F, 0F);

		bodyModel[355].addShapeBox(-45F, -27F, 5F, 2, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[355].setRotationPoint(0F, 0F, 0F);

		bodyModel[356].addShapeBox(-39F, -27F, 5F, 13, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[356].setRotationPoint(0F, 0F, 0F);

		bodyModel[357].addShapeBox(-43F, -25F, 5F, 4, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[357].setRotationPoint(0F, 0F, 0F);

		bodyModel[358].addShapeBox(-43F, -27F, 6F, 4, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[358].setRotationPoint(0F, 0F, 0F);

		bodyModel[359].addShapeBox(-42F, -28F, -6.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.1F, -.5F, 0F, -.1F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.1F, -.5F, 0F, -.1F); // Box 0
		bodyModel[359].setRotationPoint(0F, 0F, 0F);

		bodyModel[360].addShapeBox(-42F, -28F, -7.5F, 2, 1, 1, 0F,-.5F, 0F, -.1F, -.5F, 0F, -.1F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.1F, -.5F, 0F, -.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[360].setRotationPoint(0F, 0F, 0F);

		bodyModel[361].addShapeBox(-41.5F, -28F, -5.7F, 1, 1, 1, 0F,-.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F); // Box 2
		bodyModel[361].setRotationPoint(0F, 0F, 0F);

		bodyModel[362].addShapeBox(-38.9F, -31.2F, -24.5F, 1, 1, 2, 0F,0F, -.2F, -.6F, 0F, -.2F, -.6F, 0F, -.2F, -.6F, 0F, -.2F, -.6F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F); // Box 3
		bodyModel[362].setRotationPoint(1F, 0F, 0F);
		bodyModel[362].rotateAngleY = -0.6981317F;

		bodyModel[363].addShapeBox(-38.9F, -30.2F, -24.5F, 1, 1, 2, 0F,0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, -.2F, -.6F, 0F, -.2F, -.6F, 0F, -.2F, -.6F, 0F, -.2F, -.6F); // Box 4
		bodyModel[363].setRotationPoint(1F, 0F, 0F);
		bodyModel[363].rotateAngleY = -0.6981317F;

		bodyModel[364].addShapeBox(-38.9F, -32.2F, -24.5F, 1, 6, 3, 0F,0F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[364].setRotationPoint(1F, 0F, 0F);
		bodyModel[364].rotateAngleY = -0.6981317F;

		bodyModel[365].addShapeBox(-44F, -32F, -8F, 18, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[365].setRotationPoint(0F, 0F, 0F);

		bodyModel[366].addShapeBox(-44F, -32F, 6F, 18, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[366].setRotationPoint(0F, 0F, 0F);

		bodyModel[367].addShapeBox(-43F, -32F, -6.5F, 2, 1, 1, 0F,.5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[367].setRotationPoint(0F, 0F, 0F);

		bodyModel[368].addShapeBox(-42F, -32.2F, -6.5F, 1, 1, 2, 0F,-.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F); // Box 9
		bodyModel[368].setRotationPoint(0F, 0F, 0F);

		bodyModel[369].addShapeBox(-42F, -32.2F, -4.7F, 1, 1, 1, 0F,-.2F, -.3F, -.2F, -.2F, -.3F, -.2F, -.2F, -.3F, -.2F, -.2F, -.3F, -.2F, -.2F, -.3F, -.2F, -.2F, -.3F, -.2F, -.2F, -.3F, -.2F, -.2F, -.3F, -.2F); // Box 10
		bodyModel[369].setRotationPoint(0F, 0F, 0F);

		bodyModel[370].addShapeBox(-43F, -31.8F, -6.5F, 1, 1, 2, 0F,-.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F); // Box 11
		bodyModel[370].setRotationPoint(0F, 0F, 0F);

		bodyModel[371].addShapeBox(-43F, -31.8F, -4.7F, 1, 1, 2, 0F,-.2F, -.1F, -.1F, -.2F, -.1F, -.1F, -.2F, -.1F, -.1F, -.2F, -.1F, -.1F, -.2F, -.1F, -.1F, -.2F, -.1F, -.1F, -.2F, -.1F, -.1F, -.2F, -.1F, -.1F); // Box 12
		bodyModel[371].setRotationPoint(0F, 0F, 0F);

		bodyModel[372].addShapeBox(-0.5F, -1.1F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[372].setRotationPoint(-44F, -19F, 0F);

		bodyModel[373].addShapeBox(-0.5F, -1F, -2F, 1, 1, 2, 0F,0F, 0F, .8F, 0F, 0F, .8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .8F, 0F, 0F, .8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[373].setRotationPoint(-44F, -19F, 0F);
		bodyModel[373].rotateAngleY = 0.27925268F;

		bodyModel[374].addShapeBox(0F, -2.5F, -4F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Box 15
		bodyModel[374].setRotationPoint(-44F, -19F, 0F);
		bodyModel[374].rotateAngleY = 0.27925268F;

		bodyModel[375].addShapeBox(0F, -2.5F, -3F, 1, 3, 1, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[375].setRotationPoint(-44F, -19F, 0F);
		bodyModel[375].rotateAngleY = 0.27925268F;

		bodyModel[376].addShapeBox(0F, -0.5F, -4F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[376].setRotationPoint(-44F, -19F, 0F);
		bodyModel[376].rotateAngleY = 0.27925268F;

		bodyModel[377].addShapeBox(0F, -2.5F, -4F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Box 20
		bodyModel[377].setRotationPoint(-44F, -19F, 0F);
		bodyModel[377].rotateAngleY = 0.27925268F;

		bodyModel[378].addShapeBox(0F, -1.5F, -4F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Box 21
		bodyModel[378].setRotationPoint(-44F, -19F, 0F);
		bodyModel[378].rotateAngleY = 0.27925268F;

		bodyModel[379].addShapeBox(-0.5F, -1F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .8F, 0F, 0F, .8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .8F, 0F, 0F, .8F); // Box 28
		bodyModel[379].setRotationPoint(-44F, -19F, 0F);
		bodyModel[379].rotateAngleY = -0.27925268F;

		bodyModel[380].addShapeBox(0F, -2.5F, 3F, 1, 3, 1, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[380].setRotationPoint(-44F, -19F, 0F);
		bodyModel[380].rotateAngleY = -0.27925268F;

		bodyModel[381].addShapeBox(0F, -0.5F, 2F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[381].setRotationPoint(-44F, -19F, 0F);
		bodyModel[381].rotateAngleY = -0.27925268F;

		bodyModel[382].addShapeBox(0F, -1.5F, 2F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Box 31
		bodyModel[382].setRotationPoint(-44F, -19F, 0F);
		bodyModel[382].rotateAngleY = -0.27925268F;

		bodyModel[383].addShapeBox(0F, -2.5F, 2F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Box 32
		bodyModel[383].setRotationPoint(-44F, -19F, 0F);
		bodyModel[383].rotateAngleY = -0.27925268F;

		bodyModel[384].addShapeBox(0F, -2.5F, 2F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Box 34
		bodyModel[384].setRotationPoint(-44F, -19F, 0F);
		bodyModel[384].rotateAngleY = -0.27925268F;

		bodyModel[385].addShapeBox(-45F, -18.5F, -1F, 2, 1, 2, 0F,-.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[385].setRotationPoint(0F, 0F, 0F);

		bodyModel[386].addShapeBox(-0.5F, -5F, -0.5F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[386].setRotationPoint(-41F, -18F, 0F);

		bodyModel[387].addShapeBox(-0.5F, -8F, -0.5F, 1, 3, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[387].setRotationPoint(-41F, -18F, 0F);

		bodyModel[388].addShapeBox(0.5F, -10F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[388].setRotationPoint(-41F, -18F, 0F);

		bodyModel[389].addShapeBox(0.5F, -12F, -0.5F, 1, 2, 1, 0F,.1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F); // Box 4
		bodyModel[389].setRotationPoint(-41F, -18F, 0F);

		bodyModel[390].addShapeBox(0.5F, -13F, -0.5F, 1, 1, 1, 0F,0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F); // Box 5
		bodyModel[390].setRotationPoint(-41F, -18F, 0F);

		bodyModel[391].addShapeBox(-23F, -40.5F, 3F, 13, 8, 3, 0F,2.5F, -1.8F, -.2F, 0F, -1.8F, -.2F, 0F, 1.4F, 0F, 0F, 1.4F, 0F, 4.5F, 1F, 1.2F, 0F, 0F, 1.2F, 0F, 0F, -4F, 4.5F, 1F, -4F); // Box 6
		bodyModel[391].setRotationPoint(0F, 0F, -11F);

		bodyModel[392].addShapeBox(-19F, -55F, -1F, 2, 12, 2, 0F,-2F, 0F, -.6F, 1F, -.2F, -.6F, 1F, -.2F, -.6F, -2F, 0F, -.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[392].setRotationPoint(0F, 0F, 0F);

		bodyModel[393].addShapeBox(-37.7F, -32.2F, 23.2F, 1, 6, 3, 0F,0F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[393].setRotationPoint(1F, 0F, -2F);
		bodyModel[393].rotateAngleY = 0.6981317F;
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 249, 188, textureX, textureY); // Box 8
		tailModel[1] = new ModelRendererTurbo(this, 249, 214, textureX, textureY); // Box 0
		tailModel[2] = new ModelRendererTurbo(this, 214, 243, textureX, textureY); // Box 3
		tailModel[3] = new ModelRendererTurbo(this, 224, 218, textureX, textureY); // Box 4
		tailModel[4] = new ModelRendererTurbo(this, 244, 243, textureX, textureY); // Box 5
		tailModel[5] = new ModelRendererTurbo(this, 261, 243, textureX, textureY); // Box 6
		tailModel[6] = new ModelRendererTurbo(this, 261, 243, textureX, textureY); // Box 7
		tailModel[7] = new ModelRendererTurbo(this, 227, 243, textureX, textureY); // Box 8
		tailModel[8] = new ModelRendererTurbo(this, 211, 200, textureX, textureY); // Box 9
		tailModel[9] = new ModelRendererTurbo(this, 249, 201, textureX, textureY); // Box 10
		tailModel[10] = new ModelRendererTurbo(this, 211, 224, textureX, textureY); // Box 11
		tailModel[11] = new ModelRendererTurbo(this, 224, 204, textureX, textureY); // Box 12
		tailModel[12] = new ModelRendererTurbo(this, 249, 201, textureX, textureY); // Box 13
		tailModel[13] = new ModelRendererTurbo(this, 249, 214, textureX, textureY); // Box 14
		tailModel[14] = new ModelRendererTurbo(this, 214, 243, textureX, textureY); // Box 15
		tailModel[15] = new ModelRendererTurbo(this, 227, 243, textureX, textureY); // Box 16
		tailModel[16] = new ModelRendererTurbo(this, 244, 243, textureX, textureY); // Box 17
		tailModel[17] = new ModelRendererTurbo(this, 261, 243, textureX, textureY); // Box 18
		tailModel[18] = new ModelRendererTurbo(this, 261, 243, textureX, textureY); // Box 19
		tailModel[19] = new ModelRendererTurbo(this, 224, 229, textureX, textureY); // Box 20
		tailModel[20] = new ModelRendererTurbo(this, 224, 190, textureX, textureY); // Box 21
		tailModel[21] = new ModelRendererTurbo(this, 211, 211, textureX, textureY); // Box 22
		tailModel[22] = new ModelRendererTurbo(this, 211, 190, textureX, textureY); // Box 23
		tailModel[23] = new ModelRendererTurbo(this, 185, 242, textureX, textureY); // Box 25
		tailModel[24] = new ModelRendererTurbo(this, 115, 251, textureX, textureY); // Decal3

		tailModel[0].addShapeBox(59F, -35F, -1F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F); // Box 8
		tailModel[0].setRotationPoint(0F, 0F, 0F);

		tailModel[1].addShapeBox(38F, -63F, -1F, 17, 21, 1, 0F,-9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		tailModel[1].setRotationPoint(0F, 0F, 0F);

		tailModel[2].addShapeBox(46F, -66F, -1F, 4, 3, 1, 0F,-2.4F, -1.6F, 0F, 0F, -1F, 0F, 0F, -.5F, 0F, -2F, -1.3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		tailModel[2].setRotationPoint(0F, 0F, 0F);

		tailModel[3].addShapeBox(44F, -38F, -1.5F, 7, 4, 1, 0F,0F, 0F, -.2F, 0F, -2.5F, -.5F, 0F, -2F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F); // Box 4
		tailModel[3].setRotationPoint(0F, 0F, 0F);

		tailModel[4].addShapeBox(54F, -66F, -1F, 5, 3, 1, 0F,0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		tailModel[4].setRotationPoint(0F, 0F, 0F);

		tailModel[5].addShapeBox(55F, -63F, -1F, 4, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		tailModel[5].setRotationPoint(0F, 0F, 0F);

		tailModel[6].addShapeBox(55F, -48F, -1F, 4, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		tailModel[6].setRotationPoint(0F, 0F, 0F);

		tailModel[7].addShapeBox(50F, -66F, -1F, 4, 3, 1, 0F,0F, -1F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		tailModel[7].setRotationPoint(0F, 0F, 0F);

		tailModel[8].addShapeBox(33F, -40F, -1.5F, 3, 6, 1, 0F,0F, -1F, -.2F, 0F, -1F, -.2F, 0F, -.5F, .5F, 0F, -1F, .5F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F); // Box 9
		tailModel[8].setRotationPoint(0F, 0F, 0F);

		tailModel[9].addShapeBox(38F, -42F, -1F, 17, 8, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 10
		tailModel[9].setRotationPoint(0F, 0F, 0F);

		tailModel[10].addShapeBox(36F, -42F, -1.5F, 2, 8, 1, 0F,0F, -3F, -.2F, .8F, -1F, -.2F, 0F, 0F, .5F, 0F, -2.5F, .5F, 0F, 0F, .5F, 0F, 0F, 1F, 0F, 0F, .5F, 0F, 0F, .5F); // Box 11
		tailModel[10].setRotationPoint(0F, 0F, 0F);

		tailModel[11].addShapeBox(38F, -42F, -1.5F, 6, 8, 1, 0F,-.8F, -1F, -.2F, 0F, -4F, -.2F, 0F, -4F, .5F, 0F, 0F, .5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F); // Box 12
		tailModel[11].setRotationPoint(0F, 0F, 0F);

		tailModel[12].addShapeBox(38F, -42F, 0F, 17, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 13
		tailModel[12].setRotationPoint(0F, 0F, 0F);

		tailModel[13].addShapeBox(38F, -63F, 0F, 17, 21, 1, 0F,-8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 14
		tailModel[13].setRotationPoint(0F, 0F, 0F);

		tailModel[14].addShapeBox(46F, -66F, 0F, 4, 3, 1, 0F,-2F, -1.3F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, -2.4F, -1.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 15
		tailModel[14].setRotationPoint(0F, 0F, 0F);

		tailModel[15].addShapeBox(50F, -66F, 0F, 4, 3, 1, 0F,0F, -.5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		tailModel[15].setRotationPoint(0F, 0F, 0F);

		tailModel[16].addShapeBox(54F, -66F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		tailModel[16].setRotationPoint(0F, 0F, 0F);

		tailModel[17].addShapeBox(55F, -63F, -0.5F, 4, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		tailModel[17].setRotationPoint(0F, 0F, 0F);

		tailModel[18].addShapeBox(55F, -48F, 0F, 4, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		tailModel[18].setRotationPoint(0F, 0F, 0F);

		tailModel[19].addShapeBox(44F, -38F, 0.5F, 7, 4, 1, 0F,0F, 0F, .5F, 0F, -2F, .5F, 0F, -2.5F, -.5F, 0F, 0F, -.2F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		tailModel[19].setRotationPoint(0F, 0F, 0F);

		tailModel[20].addShapeBox(38F, -42F, 0.5F, 6, 8, 1, 0F,0F, 0F, .5F, 0F, -4F, .5F, 0F, -4F, -.2F, -.8F, -1F, -.2F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 21
		tailModel[20].setRotationPoint(0F, 0F, 0F);

		tailModel[21].addShapeBox(36F, -42F, 0.5F, 2, 8, 1, 0F,0F, -2.5F, .5F, 0F, 0F, .5F, .8F, -1F, -.2F, 0F, -3F, -.2F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 1F, 0F, 0F, .5F); // Box 22
		tailModel[21].setRotationPoint(0F, 0F, 0F);

		tailModel[22].addShapeBox(33F, -40F, 0.5F, 3, 6, 1, 0F,0F, -1F, .5F, 0F, -.5F, .5F, 0F, -1F, -.2F, 0F, -1F, -.2F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F); // Box 23
		tailModel[22].setRotationPoint(0F, 0F, 0F);

		tailModel[23].addShapeBox(0F, -3F, -1F, 1, 5, 2, 0F,0F, 0F, -.5F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.5F); // Box 25
		tailModel[23].setRotationPoint(55F, -50F, 0F);

		tailModel[24].addShapeBox(34F, -65F, -1F, 30, 30, 2, 0F,-9F, -9F, .05F, -9F, -9F, .05F, -9F, -9F, .05F, -9F, -9F, .05F, -9F, -9F, .05F, -9F, -9F, .05F, -9F, -9F, .05F, -9F, -9F, .05F); // Decal3
		tailModel[24].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 383, 67, textureX, textureY); // Box 0
		leftWingModel[1] = new ModelRendererTurbo(this, 383, 67, textureX, textureY); // Box 1
		leftWingModel[2] = new ModelRendererTurbo(this, 383, 67, textureX, textureY); // Box 2
		leftWingModel[3] = new ModelRendererTurbo(this, 383, 67, textureX, textureY); // Box 3
		leftWingModel[4] = new ModelRendererTurbo(this, 383, 67, textureX, textureY); // Box 4
		leftWingModel[5] = new ModelRendererTurbo(this, 383, 67, textureX, textureY); // Box 5
		leftWingModel[6] = new ModelRendererTurbo(this, 383, 67, textureX, textureY); // Box 6
		leftWingModel[7] = new ModelRendererTurbo(this, 383, 67, textureX, textureY); // Box 7
		leftWingModel[8] = new ModelRendererTurbo(this, 384, 67, textureX, textureY); // Box 0
		leftWingModel[9] = new ModelRendererTurbo(this, 384, 67, textureX, textureY); // Box 0
		leftWingModel[10] = new ModelRendererTurbo(this, 384, 67, textureX, textureY); // Box 1
		leftWingModel[11] = new ModelRendererTurbo(this, 384, 67, textureX, textureY); // Box 0
		leftWingModel[12] = new ModelRendererTurbo(this, 384, 67, textureX, textureY); // Box 1
		leftWingModel[13] = new ModelRendererTurbo(this, 384, 67, textureX, textureY); // Box 2
		leftWingModel[14] = new ModelRendererTurbo(this, 384, 67, textureX, textureY); // Box 3
		leftWingModel[15] = new ModelRendererTurbo(this, 383, 67, textureX, textureY); // Box 4
		leftWingModel[16] = new ModelRendererTurbo(this, 383, 67, textureX, textureY); // Box 6
		leftWingModel[17] = new ModelRendererTurbo(this, 384, 67, textureX, textureY); // Box 0
		leftWingModel[18] = new ModelRendererTurbo(this, 384, 67, textureX, textureY); // Box 1
		leftWingModel[19] = new ModelRendererTurbo(this, 384, 67, textureX, textureY); // Box 2
		leftWingModel[20] = new ModelRendererTurbo(this, 383, 67, textureX, textureY); // Box 3
		leftWingModel[21] = new ModelRendererTurbo(this, 383, 67, textureX, textureY); // Box 4
		leftWingModel[22] = new ModelRendererTurbo(this, 384, 67, textureX, textureY); // Box 6
		leftWingModel[23] = new ModelRendererTurbo(this, 384, 67, textureX, textureY); // Box 7
		leftWingModel[24] = new ModelRendererTurbo(this, 389, 239, textureX, textureY); // Box 8
		leftWingModel[25] = new ModelRendererTurbo(this, 389, 239, textureX, textureY); // Box 9
		leftWingModel[26] = new ModelRendererTurbo(this, 390, 239, textureX, textureY); // Box 10
		leftWingModel[27] = new ModelRendererTurbo(this, 390, 239, textureX, textureY); // Box 11
		leftWingModel[28] = new ModelRendererTurbo(this, 390, 239, textureX, textureY); // Box 12
		leftWingModel[29] = new ModelRendererTurbo(this, 390, 239, textureX, textureY); // Box 13
		leftWingModel[30] = new ModelRendererTurbo(this, 390, 239, textureX, textureY); // Box 14
		leftWingModel[31] = new ModelRendererTurbo(this, 389, 239, textureX, textureY); // Box 15
		leftWingModel[32] = new ModelRendererTurbo(this, 389, 239, textureX, textureY); // Box 16
		leftWingModel[33] = new ModelRendererTurbo(this, 390, 239, textureX, textureY); // Box 17
		leftWingModel[34] = new ModelRendererTurbo(this, 390, 239, textureX, textureY); // Box 18
		leftWingModel[35] = new ModelRendererTurbo(this, 390, 239, textureX, textureY); // Box 19
		leftWingModel[36] = new ModelRendererTurbo(this, 390, 239, textureX, textureY); // Box 20
		leftWingModel[37] = new ModelRendererTurbo(this, 390, 239, textureX, textureY); // Box 21
		leftWingModel[38] = new ModelRendererTurbo(this, 390, 239, textureX, textureY); // Box 22
		leftWingModel[39] = new ModelRendererTurbo(this, 390, 239, textureX, textureY); // Box 23
		leftWingModel[40] = new ModelRendererTurbo(this, 389, 239, textureX, textureY); // Box 16
		leftWingModel[41] = new ModelRendererTurbo(this, 389, 239, textureX, textureY); // Box 17
		leftWingModel[42] = new ModelRendererTurbo(this, 389, 239, textureX, textureY); // Box 18
		leftWingModel[43] = new ModelRendererTurbo(this, 389, 239, textureX, textureY); // Box 19
		leftWingModel[44] = new ModelRendererTurbo(this, 389, 239, textureX, textureY); // Box 20
		leftWingModel[45] = new ModelRendererTurbo(this, 389, 239, textureX, textureY); // Box 21
		leftWingModel[46] = new ModelRendererTurbo(this, 389, 239, textureX, textureY); // Box 22
		leftWingModel[47] = new ModelRendererTurbo(this, 389, 239, textureX, textureY); // Box 23
		leftWingModel[48] = new ModelRendererTurbo(this, 89, 497, textureX, textureY); // Box 48
		leftWingModel[49] = new ModelRendererTurbo(this, 89, 497, textureX, textureY); // Box 49
		leftWingModel[50] = new ModelRendererTurbo(this, 124, 497, textureX, textureY); // Box 50
		leftWingModel[51] = new ModelRendererTurbo(this, 124, 497, textureX, textureY); // Box 51
		leftWingModel[52] = new ModelRendererTurbo(this, 147, 497, textureX, textureY); // Box 52
		leftWingModel[53] = new ModelRendererTurbo(this, 147, 497, textureX, textureY); // Box 53
		leftWingModel[54] = new ModelRendererTurbo(this, 147, 497, textureX, textureY); // Box 54
		leftWingModel[55] = new ModelRendererTurbo(this, 147, 497, textureX, textureY); // Box 55
		leftWingModel[56] = new ModelRendererTurbo(this, 124, 497, textureX, textureY); // Box 56
		leftWingModel[57] = new ModelRendererTurbo(this, 124, 497, textureX, textureY); // Box 57
		leftWingModel[58] = new ModelRendererTurbo(this, 89, 497, textureX, textureY); // Box 58
		leftWingModel[59] = new ModelRendererTurbo(this, 89, 497, textureX, textureY); // Box 59
		leftWingModel[60] = new ModelRendererTurbo(this, 294, 17, textureX, textureY); // Decal1

		leftWingModel[0].addShapeBox(-31F, -28.5F, -30F, 3, 2, 9, 0F,-5.5F, -1F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, -.8F, -1F, 0F, -4.5F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftWingModel[0].setRotationPoint(0F, 2F, 0F);

		leftWingModel[1].addShapeBox(-28F, -30.5F, -30F, 4, 4, 9, 0F,-6F, -2F, 0F, 7F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -6F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		leftWingModel[1].setRotationPoint(0F, 2F, 0F);

		leftWingModel[2].addShapeBox(-24F, -31.5F, -30F, 7, 5, 9, 0F,-7F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		leftWingModel[2].setRotationPoint(0F, 2F, 0F);

		leftWingModel[3].addShapeBox(-17F, -31.5F, -30F, 9, 5, 9, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		leftWingModel[3].setRotationPoint(0F, 2F, 0F);

		leftWingModel[4].addShapeBox(-8F, -31.5F, -30F, 9, 5, 9, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		leftWingModel[4].setRotationPoint(0F, 2F, 0F);

		leftWingModel[5].addShapeBox(1F, -30.5F, -30F, 9, 4, 9, 0F,0F, -1F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		leftWingModel[5].setRotationPoint(0F, 2F, 0F);

		leftWingModel[6].addShapeBox(10F, -29.5F, -30F, 11, 3, 9, 0F,1F, -1F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftWingModel[6].setRotationPoint(0F, 2F, 0F);

		leftWingModel[7].addShapeBox(21F, -28.5F, -30F, 9, 2, 9, 0F,3F, -1F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		leftWingModel[7].setRotationPoint(0F, 2F, 0F);

		leftWingModel[8].addShapeBox(-8F, -27.5F, -67F, 9, 1, 37, 0F,-7F, 0F, 0F, 7F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftWingModel[8].setRotationPoint(0F, 2F, 0F);

		leftWingModel[9].addShapeBox(1F, -27.5F, -67F, 8, 1, 37, 0F,-7F, 0F, 0F, 7F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftWingModel[9].setRotationPoint(0F, 2F, 0F);

		leftWingModel[10].addShapeBox(9F, -27.5F, -67F, 9, 1, 37, 0F,-7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		leftWingModel[10].setRotationPoint(0F, 2F, 0F);

		leftWingModel[11].addShapeBox(-17F, -27.5F, -67F, 9, 1, 37, 0F,-16F, 0F, 0F, 7F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -16F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftWingModel[11].setRotationPoint(0F, 2F, 0F);

		leftWingModel[12].addShapeBox(8F, -27.5F, -111F, 8, 1, 44, 0F,-12F, -.3F, 0F, 8F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		leftWingModel[12].setRotationPoint(0F, 2F, 0F);

		leftWingModel[13].addShapeBox(-1F, -27.5F, -111F, 9, 1, 44, 0F,-21F, -.3F, 0F, 12F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		leftWingModel[13].setRotationPoint(0F, 2F, 0F);

		leftWingModel[14].addShapeBox(16F, -27.5F, -111F, 9, 1, 44, 0F,-8F, -.3F, 0F, 8F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		leftWingModel[14].setRotationPoint(0F, 2F, 0F);

		leftWingModel[15].addShapeBox(-22F, -27.5F, -67F, 5, 1, 37, 0F,-18F, 0F, 0F, 16F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, -18F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		leftWingModel[15].setRotationPoint(0F, 2F, 0F);

		leftWingModel[16].addShapeBox(-4F, -27.5F, -111F, 3, 1, 44, 0F,-21F, -.3F, 0F, 21F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, 21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftWingModel[16].setRotationPoint(0F, 2F, 0F);

		leftWingModel[17].addShapeBox(17F, -27.5F, -114F, 16, 1, 3, 0F,0F, -.5F, -.5F, 1F, -.5F, -.5F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, 0F, .5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftWingModel[17].setRotationPoint(0F, 2F, 0F);

		leftWingModel[18].addShapeBox(17F, -27.5F, -115F, 17, 1, 1, 0F,-3F, -.5F, -.5F, -7F, -.5F, -.5F, 0F, -.5F, .5F, 0F, -.5F, .5F, -2F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F); // Box 1
		leftWingModel[18].setRotationPoint(0F, 2F, 0F);

		leftWingModel[19].addShapeBox(14F, -27.5F, -114F, 3, 1, 3, 0F,-2F, -.5F, -1F, 0F, -.5F, -.5F, 0F, -.3F, 0F, -1F, -.3F, 0F, -1F, 0F, -1F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		leftWingModel[19].setRotationPoint(0F, 2F, 0F);

		leftWingModel[20].addShapeBox(-7F, -27.5F, -111F, 3, 1, 44, 0F,-22F, -.3F, 0F, 21F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, 21F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 3
		leftWingModel[20].setRotationPoint(0F, 2F, 0F);

		leftWingModel[21].addShapeBox(-25F, -27.5F, -67F, 5, 1, 37, 0F,-18F, 0F, 0F, 16F, 0F, 0F, -2F, 1F, 0F, .5F, 0F, 0F, -17F, 0F, 0F, 16F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F); // Box 4
		leftWingModel[21].setRotationPoint(0F, 2F, 0F);

		leftWingModel[22].addShapeBox(25F, -27.5F, -72F, 9, 1, 5, 0F,-.9F, -.03F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -.9F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftWingModel[22].setRotationPoint(0F, 2F, 0F);

		leftWingModel[23].addShapeBox(18F, -27.5F, -38F, 9, 1, 8, 0F,-1.5F, 0F, 0F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		leftWingModel[23].setRotationPoint(0F, 2F, 0F);

		leftWingModel[24].addShapeBox(-25F, -26.5F, -67F, 5, 1, 37, 0F,-17F, 0F, 0F, 16F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F, -18F, 0F, 0F, 16F, 0F, 0F, -2F, 1F, 0F, .5F, 0F, 0F); // Box 8
		leftWingModel[24].setRotationPoint(0F, 2F, 0F);

		leftWingModel[25].addShapeBox(-22F, -26.5F, -67F, 5, 1, 37, 0F,-18F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, 16F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F); // Box 9
		leftWingModel[25].setRotationPoint(0F, 2F, 0F);

		leftWingModel[26].addShapeBox(-17F, -26.5F, -67F, 9, 1, 37, 0F,-16F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 7F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 10
		leftWingModel[26].setRotationPoint(0F, 2F, 0F);

		leftWingModel[27].addShapeBox(-8F, -26.5F, -67F, 9, 1, 37, 0F,-7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 11
		leftWingModel[27].setRotationPoint(0F, 2F, 0F);

		leftWingModel[28].addShapeBox(1F, -26.5F, -67F, 8, 1, 37, 0F,-7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F); // Box 12
		leftWingModel[28].setRotationPoint(0F, 2F, 0F);

		leftWingModel[29].addShapeBox(9F, -26.5F, -67F, 9, 1, 37, 0F,-7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 13
		leftWingModel[29].setRotationPoint(0F, 2F, 0F);

		leftWingModel[30].addShapeBox(18F, -26.5F, -38F, 9, 1, 8, 0F,-1.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 14
		leftWingModel[30].setRotationPoint(0F, 2F, 0F);

		leftWingModel[31].addShapeBox(-7F, -26.5F, -111F, 3, 1, 44, 0F,-21F, 0F, 0F, 21F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -22F, -.3F, 0F, 21F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		leftWingModel[31].setRotationPoint(0F, 2F, 0F);

		leftWingModel[32].addShapeBox(-4F, -26.5F, -111F, 3, 1, 44, 0F,-21F, 0F, 0F, 21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, -.3F, 0F, 21F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		leftWingModel[32].setRotationPoint(0F, 2F, 0F);

		leftWingModel[33].addShapeBox(-1F, -26.5F, -111F, 9, 1, 44, 0F,-21F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, -.3F, 0F, 12F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		leftWingModel[33].setRotationPoint(0F, 2F, 0F);

		leftWingModel[34].addShapeBox(8F, -26.5F, -111F, 8, 1, 44, 0F,-12F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, -.3F, 0F, 8F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		leftWingModel[34].setRotationPoint(0F, 2F, 0F);

		leftWingModel[35].addShapeBox(16F, -26.5F, -111F, 9, 1, 44, 0F,-8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -.3F, 0F, 8F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		leftWingModel[35].setRotationPoint(0F, 2F, 0F);

		leftWingModel[36].addShapeBox(25F, -26.5F, -72F, 9, 1, 5, 0F,-.9F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.9F, 0F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 20
		leftWingModel[36].setRotationPoint(0F, 2F, 0F);

		leftWingModel[37].addShapeBox(14F, -26.5F, -114F, 3, 1, 3, 0F,-1F, 0F, -1F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -.5F, -1F, 0F, -.5F, -.5F, 0F, -.3F, 0F, -1F, -.3F, 0F); // Box 21
		leftWingModel[37].setRotationPoint(0F, 2F, 0F);

		leftWingModel[38].addShapeBox(17F, -26.5F, -114F, 16, 1, 3, 0F,0F, 0F, .5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 1F, -.5F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F); // Box 22
		leftWingModel[38].setRotationPoint(0F, 2F, 0F);

		leftWingModel[39].addShapeBox(17F, -26.5F, -115F, 17, 1, 1, 0F,-2F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -2.5F, -.5F, -.5F, -7F, -.5F, -.5F, 0F, -.5F, 0F, 0F, -.5F, .5F); // Box 23
		leftWingModel[39].setRotationPoint(0F, 2F, 0F);

		leftWingModel[40].addShapeBox(-31F, -26.5F, -30F, 3, 2, 9, 0F,-4.5F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, -1F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, -.8F, -1F, 0F); // Box 16
		leftWingModel[40].setRotationPoint(0F, 2F, 0F);

		leftWingModel[41].addShapeBox(-28F, -26.5F, -30F, 4, 4, 9, 0F,-6F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -2F, 0F, 7F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F); // Box 17
		leftWingModel[41].setRotationPoint(0F, 2F, 0F);

		leftWingModel[42].addShapeBox(-17F, -26.5F, -30F, 9, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 18
		leftWingModel[42].setRotationPoint(0F, 2F, 0F);

		leftWingModel[43].addShapeBox(-8F, -26.5F, -30F, 9, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 19
		leftWingModel[43].setRotationPoint(0F, 2F, 0F);

		leftWingModel[44].addShapeBox(1F, -26.5F, -30F, 9, 4, 9, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F); // Box 20
		leftWingModel[44].setRotationPoint(0F, 2F, 0F);

		leftWingModel[45].addShapeBox(10F, -26.5F, -30F, 11, 3, 9, 0F,1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -3F, -2F, 0F, 0F, -1.5F, 0F, 0F, -.5F, 0F); // Box 21
		leftWingModel[45].setRotationPoint(0F, 2F, 0F);

		leftWingModel[46].addShapeBox(21F, -26.5F, -30F, 9, 1, 9, 0F,3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, -1F, 0F, 0F, -1F, 0F, 0F, .5F, 0F); // Box 22
		leftWingModel[46].setRotationPoint(0F, 2F, 0F);

		leftWingModel[47].addShapeBox(-24F, -24.5F, -30F, 7, 3, 9, 0F,-7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 23
		leftWingModel[47].setRotationPoint(0F, 2F, 0F);

		leftWingModel[48].addShapeBox(-42F, -27F, -20F, 12, 1, 1, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Box 48
		leftWingModel[48].setRotationPoint(0F, 2F, 0F);

		leftWingModel[49].addShapeBox(-42F, -27F, -20F, 12, 1, 1, 0F,0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Box 49
		leftWingModel[49].setRotationPoint(0F, 2F, 0F);

		leftWingModel[50].addShapeBox(-45F, -27F, -20F, 3, 1, 1, 0F,0F, .1F, -.2F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, .1F, -.2F, 0F, -.5F, .2F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, .2F); // Box 50
		leftWingModel[50].setRotationPoint(0F, 2F, 0F);

		leftWingModel[51].addShapeBox(-45F, -27F, -20F, 3, 1, 1, 0F,0F, -.5F, .2F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, .2F, 0F, .1F, -.2F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, .1F, -.2F); // Box 51
		leftWingModel[51].setRotationPoint(0F, 2F, 0F);

		leftWingModel[52].addShapeBox(-47F, -27F, -20F, 2, 1, 1, 0F,0F, .1F, -.2F, 0F, .1F, -.2F, 0F, .1F, -.2F, 0F, .1F, -.2F, 0F, -.5F, .2F, 0F, -.5F, .2F, 0F, -.5F, .2F, 0F, -.5F, .2F); // Box 52
		leftWingModel[52].setRotationPoint(0F, 2F, 0F);

		leftWingModel[53].addShapeBox(-47F, -27F, -20F, 2, 1, 1, 0F,0F, -.5F, .2F, 0F, -.5F, .2F, 0F, -.5F, .2F, 0F, -.5F, .2F, 0F, .1F, -.2F, 0F, .1F, -.2F, 0F, .1F, -.2F, 0F, .1F, -.2F); // Box 53
		leftWingModel[53].setRotationPoint(0F, 2F, 0F);

		leftWingModel[54].addShapeBox(-47F, -27F, 19F, 2, 1, 1, 0F,0F, -.5F, .2F, 0F, -.5F, .2F, 0F, -.5F, .2F, 0F, -.5F, .2F, 0F, .1F, -.2F, 0F, .1F, -.2F, 0F, .1F, -.2F, 0F, .1F, -.2F); // Box 54
		leftWingModel[54].setRotationPoint(0F, 2F, 0F);

		leftWingModel[55].addShapeBox(-47F, -27F, 19F, 2, 1, 1, 0F,0F, .1F, -.2F, 0F, .1F, -.2F, 0F, .1F, -.2F, 0F, .1F, -.2F, 0F, -.5F, .2F, 0F, -.5F, .2F, 0F, -.5F, .2F, 0F, -.5F, .2F); // Box 55
		leftWingModel[55].setRotationPoint(0F, 2F, 0F);

		leftWingModel[56].addShapeBox(-45F, -27F, 19F, 3, 1, 1, 0F,0F, -.5F, .2F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, .2F, 0F, .1F, -.2F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, .1F, -.2F); // Box 56
		leftWingModel[56].setRotationPoint(0F, 2F, 0F);

		leftWingModel[57].addShapeBox(-45F, -27F, 19F, 3, 1, 1, 0F,0F, .1F, -.2F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, .1F, -.2F, 0F, -.5F, .2F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, .2F); // Box 57
		leftWingModel[57].setRotationPoint(0F, 2F, 0F);

		leftWingModel[58].addShapeBox(-42F, -27F, 19F, 12, 1, 1, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Box 58
		leftWingModel[58].setRotationPoint(0F, 2F, 0F);

		leftWingModel[59].addShapeBox(-42F, -27F, 19F, 12, 1, 1, 0F,0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Box 59
		leftWingModel[59].setRotationPoint(0F, 2F, 0F);

		leftWingModel[60].addShapeBox(-8F, -25.5F, -67F, 30, 2, 30, 0F,0F, .2F, 0F, 0F, .2F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 1F, 0F, 0F, 2F, 0F); // Decal1
		leftWingModel[60].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 389, 239, textureX, textureY); // Box 0
		rightWingModel[1] = new ModelRendererTurbo(this, 389, 239, textureX, textureY); // Box 1
		rightWingModel[2] = new ModelRendererTurbo(this, 389, 239, textureX, textureY); // Box 2
		rightWingModel[3] = new ModelRendererTurbo(this, 389, 239, textureX, textureY); // Box 3
		rightWingModel[4] = new ModelRendererTurbo(this, 389, 239, textureX, textureY); // Box 4
		rightWingModel[5] = new ModelRendererTurbo(this, 389, 239, textureX, textureY); // Box 5
		rightWingModel[6] = new ModelRendererTurbo(this, 389, 239, textureX, textureY); // Box 6
		rightWingModel[7] = new ModelRendererTurbo(this, 389, 239, textureX, textureY); // Box 7
		rightWingModel[8] = new ModelRendererTurbo(this, 383, 67, textureX, textureY); // Box 8
		rightWingModel[9] = new ModelRendererTurbo(this, 383, 67, textureX, textureY); // Box 9
		rightWingModel[10] = new ModelRendererTurbo(this, 383, 67, textureX, textureY); // Box 10
		rightWingModel[11] = new ModelRendererTurbo(this, 383, 67, textureX, textureY); // Box 11
		rightWingModel[12] = new ModelRendererTurbo(this, 383, 67, textureX, textureY); // Box 12
		rightWingModel[13] = new ModelRendererTurbo(this, 383, 67, textureX, textureY); // Box 13
		rightWingModel[14] = new ModelRendererTurbo(this, 383, 67, textureX, textureY); // Box 14
		rightWingModel[15] = new ModelRendererTurbo(this, 383, 67, textureX, textureY); // Box 15
		rightWingModel[16] = new ModelRendererTurbo(this, 384, 67, textureX, textureY); // Box 16
		rightWingModel[17] = new ModelRendererTurbo(this, 384, 67, textureX, textureY); // Box 17
		rightWingModel[18] = new ModelRendererTurbo(this, 384, 67, textureX, textureY); // Box 18
		rightWingModel[19] = new ModelRendererTurbo(this, 384, 67, textureX, textureY); // Box 19
		rightWingModel[20] = new ModelRendererTurbo(this, 384, 67, textureX, textureY); // Box 20
		rightWingModel[21] = new ModelRendererTurbo(this, 383, 67, textureX, textureY); // Box 21
		rightWingModel[22] = new ModelRendererTurbo(this, 383, 67, textureX, textureY); // Box 22
		rightWingModel[23] = new ModelRendererTurbo(this, 389, 239, textureX, textureY); // Box 23
		rightWingModel[24] = new ModelRendererTurbo(this, 389, 239, textureX, textureY); // Box 24
		rightWingModel[25] = new ModelRendererTurbo(this, 390, 239, textureX, textureY); // Box 25
		rightWingModel[26] = new ModelRendererTurbo(this, 390, 239, textureX, textureY); // Box 26
		rightWingModel[27] = new ModelRendererTurbo(this, 390, 239, textureX, textureY); // Box 27
		rightWingModel[28] = new ModelRendererTurbo(this, 390, 239, textureX, textureY); // Box 28
		rightWingModel[29] = new ModelRendererTurbo(this, 390, 239, textureX, textureY); // Box 29
		rightWingModel[30] = new ModelRendererTurbo(this, 384, 67, textureX, textureY); // Box 30
		rightWingModel[31] = new ModelRendererTurbo(this, 384, 67, textureX, textureY); // Box 31
		rightWingModel[32] = new ModelRendererTurbo(this, 384, 67, textureX, textureY); // Box 32
		rightWingModel[33] = new ModelRendererTurbo(this, 383, 67, textureX, textureY); // Box 33
		rightWingModel[34] = new ModelRendererTurbo(this, 383, 67, textureX, textureY); // Box 34
		rightWingModel[35] = new ModelRendererTurbo(this, 390, 239, textureX, textureY); // Box 35
		rightWingModel[36] = new ModelRendererTurbo(this, 390, 239, textureX, textureY); // Box 36
		rightWingModel[37] = new ModelRendererTurbo(this, 390, 239, textureX, textureY); // Box 37
		rightWingModel[38] = new ModelRendererTurbo(this, 389, 239, textureX, textureY); // Box 38
		rightWingModel[39] = new ModelRendererTurbo(this, 389, 239, textureX, textureY); // Box 39
		rightWingModel[40] = new ModelRendererTurbo(this, 384, 67, textureX, textureY); // Box 40
		rightWingModel[41] = new ModelRendererTurbo(this, 390, 239, textureX, textureY); // Box 41
		rightWingModel[42] = new ModelRendererTurbo(this, 384, 67, textureX, textureY); // Box 42
		rightWingModel[43] = new ModelRendererTurbo(this, 384, 67, textureX, textureY); // Box 43
		rightWingModel[44] = new ModelRendererTurbo(this, 390, 239, textureX, textureY); // Box 44
		rightWingModel[45] = new ModelRendererTurbo(this, 390, 239, textureX, textureY); // Box 45
		rightWingModel[46] = new ModelRendererTurbo(this, 390, 239, textureX, textureY); // Box 46
		rightWingModel[47] = new ModelRendererTurbo(this, 384, 67, textureX, textureY); // Box 47
		rightWingModel[48] = new ModelRendererTurbo(this, 294, 17, textureX, textureY); // Decal2

		rightWingModel[0].addShapeBox(-31F, -26.5F, 21F, 3, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -4.5F, 0F, 0F, -.8F, -1F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -5.5F, -1F, 0F); // Box 0
		rightWingModel[0].setRotationPoint(0F, 2F, 0F);

		rightWingModel[1].addShapeBox(-28F, -26.5F, 21F, 4, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -6F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 7F, -1F, 0F, -6F, -2F, 0F); // Box 1
		rightWingModel[1].setRotationPoint(0F, 2F, 0F);

		rightWingModel[2].addShapeBox(-24F, -24.5F, 21F, 7, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -7F, -2F, 0F); // Box 2
		rightWingModel[2].setRotationPoint(0F, 2F, 0F);

		rightWingModel[3].addShapeBox(-17F, -26.5F, 21F, 9, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 3
		rightWingModel[3].setRotationPoint(0F, 2F, 0F);

		rightWingModel[4].addShapeBox(-8F, -26.5F, 21F, 9, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 4
		rightWingModel[4].setRotationPoint(0F, 2F, 0F);

		rightWingModel[5].addShapeBox(1F, -26.5F, 21F, 9, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, -1F, -2F, 0F, 0F, -1F, 0F); // Box 5
		rightWingModel[5].setRotationPoint(0F, 2F, 0F);

		rightWingModel[6].addShapeBox(10F, -26.5F, 21F, 11, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, -.5F, 0F, 0F, -1.5F, 0F, -3F, -2F, 0F, 1F, -1F, 0F); // Box 6
		rightWingModel[6].setRotationPoint(0F, 2F, 0F);

		rightWingModel[7].addShapeBox(21F, -26.5F, 21F, 9, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, .5F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, 3F, 0F, 0F); // Box 7
		rightWingModel[7].setRotationPoint(0F, 2F, 0F);

		rightWingModel[8].addShapeBox(-31F, -28.5F, 21F, 3, 2, 9, 0F,-.8F, -1F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -5.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -4.5F, 0F, 0F); // Box 8
		rightWingModel[8].setRotationPoint(0F, 2F, 0F);

		rightWingModel[9].addShapeBox(-28F, -30.5F, 21F, 4, 4, 9, 0F,0F, -2F, 0F, 0F, -1F, 0F, 7F, -1F, 0F, -6F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -6F, 0F, 0F); // Box 9
		rightWingModel[9].setRotationPoint(0F, 2F, 0F);

		rightWingModel[10].addShapeBox(-24F, -31.5F, 21F, 7, 5, 9, 0F,0F, -2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -7F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F); // Box 10
		rightWingModel[10].setRotationPoint(0F, 2F, 0F);

		rightWingModel[11].addShapeBox(-17F, -31.5F, 21F, 9, 5, 9, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		rightWingModel[11].setRotationPoint(0F, 2F, 0F);

		rightWingModel[12].addShapeBox(-8F, -31.5F, 21F, 9, 5, 9, 0F,0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		rightWingModel[12].setRotationPoint(0F, 2F, 0F);

		rightWingModel[13].addShapeBox(1F, -30.5F, 21F, 9, 4, 9, 0F,0F, -1F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightWingModel[13].setRotationPoint(0F, 2F, 0F);

		rightWingModel[14].addShapeBox(10F, -29.5F, 21F, 11, 3, 9, 0F,0F, -1F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F); // Box 14
		rightWingModel[14].setRotationPoint(0F, 2F, 0F);

		rightWingModel[15].addShapeBox(21F, -28.5F, 21F, 9, 2, 9, 0F,0F, -1F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 15
		rightWingModel[15].setRotationPoint(0F, 2F, 0F);

		rightWingModel[16].addShapeBox(18F, -27.5F, 30F, 9, 1, 8, 0F,0F, 0F, 0F, 0F, -1F, 0F, 2F, -1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1.5F, 0F, 0F); // Box 16
		rightWingModel[16].setRotationPoint(0F, 2F, 0F);

		rightWingModel[17].addShapeBox(9F, -27.5F, 30F, 9, 1, 37, 0F,0F, 1F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F); // Box 17
		rightWingModel[17].setRotationPoint(0F, 2F, 0F);

		rightWingModel[18].addShapeBox(1F, -27.5F, 30F, 8, 1, 37, 0F,0F, 2F, 0F, 0F, 1F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F); // Box 18
		rightWingModel[18].setRotationPoint(0F, 2F, 0F);

		rightWingModel[19].addShapeBox(-8F, -27.5F, 30F, 9, 1, 37, 0F,0F, 2F, 0F, 0F, 2F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F); // Box 19
		rightWingModel[19].setRotationPoint(0F, 2F, 0F);

		rightWingModel[20].addShapeBox(-17F, -27.5F, 30F, 9, 1, 37, 0F,0F, 2F, 0F, 0F, 2F, 0F, 7F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -16F, 0F, 0F); // Box 20
		rightWingModel[20].setRotationPoint(0F, 2F, 0F);

		rightWingModel[21].addShapeBox(-22F, -27.5F, 30F, 5, 1, 37, 0F,0F, 1F, 0F, 0F, 2F, 0F, 16F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 16F, 0F, 0F, -18F, 0F, 0F); // Box 21
		rightWingModel[21].setRotationPoint(0F, 2F, 0F);

		rightWingModel[22].addShapeBox(-25F, -27.5F, 30F, 5, 1, 37, 0F,.5F, 0F, 0F, -2F, 1F, 0F, 16F, 0F, 0F, -18F, 0F, 0F, 1.5F, 0F, 0F, -2F, 0F, 0F, 16F, 0F, 0F, -17F, 0F, 0F); // Box 22
		rightWingModel[22].setRotationPoint(0F, 2F, 0F);

		rightWingModel[23].addShapeBox(-25F, -26.5F, 30F, 5, 1, 37, 0F,1.5F, 0F, 0F, -2F, 0F, 0F, 16F, 0F, 0F, -17F, 0F, 0F, .5F, 0F, 0F, -2F, 1F, 0F, 16F, 0F, 0F, -18F, 0F, 0F); // Box 23
		rightWingModel[23].setRotationPoint(0F, 2F, 0F);

		rightWingModel[24].addShapeBox(-22F, -26.5F, 30F, 5, 1, 37, 0F,0F, 0F, 0F, 0F, 0F, 0F, 16F, 0F, 0F, -18F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 16F, 0F, 0F, -18F, 0F, 0F); // Box 24
		rightWingModel[24].setRotationPoint(0F, 2F, 0F);

		rightWingModel[25].addShapeBox(-17F, -26.5F, 30F, 9, 1, 37, 0F,0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -16F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 7F, 0F, 0F, -16F, 0F, 0F); // Box 25
		rightWingModel[25].setRotationPoint(0F, 2F, 0F);

		rightWingModel[26].addShapeBox(-8F, -26.5F, 30F, 9, 1, 37, 0F,0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 7F, 0F, 0F, -7F, 0F, 0F); // Box 26
		rightWingModel[26].setRotationPoint(0F, 2F, 0F);

		rightWingModel[27].addShapeBox(1F, -26.5F, 30F, 8, 1, 37, 0F,0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 7F, 0F, 0F, -7F, 0F, 0F); // Box 27
		rightWingModel[27].setRotationPoint(0F, 2F, 0F);

		rightWingModel[28].addShapeBox(9F, -26.5F, 30F, 9, 1, 37, 0F,0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F); // Box 28
		rightWingModel[28].setRotationPoint(0F, 2F, 0F);

		rightWingModel[29].addShapeBox(18F, -26.5F, 30F, 9, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 2F, -1F, 0F, -1.5F, 0F, 0F); // Box 29
		rightWingModel[29].setRotationPoint(0F, 2F, 0F);

		rightWingModel[30].addShapeBox(16F, -27.5F, 67F, 9, 1, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 8F, -.3F, 0F, -8F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F); // Box 30
		rightWingModel[30].setRotationPoint(0F, 2F, 0F);

		rightWingModel[31].addShapeBox(8F, -27.5F, 67F, 8, 1, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 8F, -.3F, 0F, -12F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, -12F, 0F, 0F); // Box 31
		rightWingModel[31].setRotationPoint(0F, 2F, 0F);

		rightWingModel[32].addShapeBox(-1F, -27.5F, 67F, 9, 1, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 12F, -.3F, 0F, -21F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, -21F, 0F, 0F); // Box 32
		rightWingModel[32].setRotationPoint(0F, 2F, 0F);

		rightWingModel[33].addShapeBox(-4F, -27.5F, 67F, 3, 1, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 21F, -.3F, 0F, -21F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 21F, 0F, 0F, -21F, 0F, 0F); // Box 33
		rightWingModel[33].setRotationPoint(0F, 2F, 0F);

		rightWingModel[34].addShapeBox(-7F, -27.5F, 67F, 3, 1, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 21F, -.3F, 0F, -22F, -.3F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 21F, 0F, 0F, -21F, 0F, 0F); // Box 34
		rightWingModel[34].setRotationPoint(0F, 2F, 0F);

		rightWingModel[35].addShapeBox(16F, -26.5F, 67F, 9, 1, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, -.3F, 0F, -8F, -.3F, 0F); // Box 35
		rightWingModel[35].setRotationPoint(0F, 2F, 0F);

		rightWingModel[36].addShapeBox(8F, -26.5F, 67F, 8, 1, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, -.3F, 0F, -12F, -.3F, 0F); // Box 36
		rightWingModel[36].setRotationPoint(0F, 2F, 0F);

		rightWingModel[37].addShapeBox(-1F, -26.5F, 67F, 9, 1, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, -21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, -.3F, 0F, -21F, -.3F, 0F); // Box 37
		rightWingModel[37].setRotationPoint(0F, 2F, 0F);

		rightWingModel[38].addShapeBox(-4F, -26.5F, 67F, 3, 1, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 21F, 0F, 0F, -21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 21F, -.3F, 0F, -21F, -.3F, 0F); // Box 38
		rightWingModel[38].setRotationPoint(0F, 2F, 0F);

		rightWingModel[39].addShapeBox(-7F, -26.5F, 67F, 3, 1, 44, 0F,1F, 0F, 0F, 0F, 0F, 0F, 21F, 0F, 0F, -21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 21F, -.3F, 0F, -22F, -.3F, 0F); // Box 39
		rightWingModel[39].setRotationPoint(0F, 2F, 0F);

		rightWingModel[40].addShapeBox(25F, -27.5F, 67F, 9, 1, 5, 0F,0F, 0F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, -.9F, -.03F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -.9F, 0F, 0F); // Box 40
		rightWingModel[40].setRotationPoint(0F, 2F, 0F);

		rightWingModel[41].addShapeBox(25F, -26.5F, 67F, 9, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -.9F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, -.9F, 0F, 0F); // Box 41
		rightWingModel[41].setRotationPoint(0F, 2F, 0F);

		rightWingModel[42].addShapeBox(14F, -27.5F, 111F, 3, 1, 3, 0F,-1F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.5F, -.5F, -2F, -.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -1F, 0F, -1F); // Box 42
		rightWingModel[42].setRotationPoint(0F, 2F, 0F);

		rightWingModel[43].addShapeBox(17F, -27.5F, 111F, 16, 1, 3, 0F,0F, -.3F, 0F, 0F, -.3F, 0F, 1F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, .5F); // Box 43
		rightWingModel[43].setRotationPoint(0F, 2F, 0F);

		rightWingModel[44].addShapeBox(14F, -26.5F, 111F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -1F, 0F, -1F, -1F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.5F, -.5F, -2F, -.5F, -1F); // Box 44
		rightWingModel[44].setRotationPoint(0F, 2F, 0F);

		rightWingModel[45].addShapeBox(17F, -26.5F, 111F, 16, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, .5F, 0F, -.3F, 0F, 0F, -.3F, 0F, 1F, -.5F, 0F, 0F, -.5F, -.5F); // Box 45
		rightWingModel[45].setRotationPoint(0F, 2F, 0F);

		rightWingModel[46].addShapeBox(17F, -26.5F, 114F, 17, 1, 1, 0F,0F, 0F, -.5F, 0F, 0F, 0F, -6.5F, 0F, 0F, -2F, 0F, 0F, 0F, -.5F, .5F, 0F, -.5F, 0F, -7F, -.5F, -.5F, -2.5F, -.5F, -.5F); // Box 46
		rightWingModel[46].setRotationPoint(0F, 2F, 0F);

		rightWingModel[47].addShapeBox(17F, -27.5F, 114F, 17, 1, 1, 0F,0F, -.5F, .5F, 0F, -.5F, .5F, -7F, -.5F, -.5F, -3F, -.5F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, -6.5F, 0F, 0F, -2F, 0F, 0F); // Box 47
		rightWingModel[47].setRotationPoint(0F, 2F, 0F);

		rightWingModel[48].addShapeBox(-8F, -25.5F, 36F, 30, 2, 30, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, .5F, 0F, 0F, .5F, 0F); // Decal2
		rightWingModel[48].setRotationPoint(0F, 0F, 0F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 185, 242, textureX, textureY); // Box 24
		yawFlapModel[1] = new ModelRendererTurbo(this, 185, 242, textureX, textureY); // Box 26
		yawFlapModel[2] = new ModelRendererTurbo(this, 185, 242, textureX, textureY); // Box 27
		yawFlapModel[3] = new ModelRendererTurbo(this, 187, 242, textureX, textureY); // Box 28

		yawFlapModel[0].addShapeBox(1F, -3F, -1F, 3, 5, 2, 0F,0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F); // Box 24
		yawFlapModel[0].setRotationPoint(55F, -50F, 0F);

		yawFlapModel[1].addShapeBox(4F, -13F, -1F, 10, 28, 2, 0F,0F, 0F, -.1F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.1F, 0F, 0F, -.1F, 3F, 0F, -.5F, 3F, 0F, -.5F, 0F, 0F, -.1F); // Box 26
		yawFlapModel[1].setRotationPoint(55F, -50F, 0F);

		yawFlapModel[2].addShapeBox(4F, -16F, -1F, 7, 3, 2, 0F,0F, 0F, -.7F, 0F, -.5F, -.7F, 0F, -.5F, -.7F, 0F, 0F, -.7F, 0F, 0F, -.1F, 0F, 0F, -.35F, 0F, 0F, -.35F, 0F, 0F, -.1F); // Box 27
		yawFlapModel[2].setRotationPoint(55F, -50F, 0F);

		yawFlapModel[3].addShapeBox(11F, -16F, -1F, 3, 3, 2, 0F,0F, -.5F, -.7F, -1F, -1.5F, -.7F, -1F, -1.5F, -.7F, 0F, -.5F, -.7F, 0F, 0F, -.35F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.35F); // Box 28
		yawFlapModel[3].setRotationPoint(55F, -50F, 0F);
	}

	private void initpitchFlapLeftWingModel_1()
	{
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 505, 427, textureX, textureY); // Box 60
		pitchFlapLeftWingModel[1] = new ModelRendererTurbo(this, 505, 478, textureX, textureY); // Box 61
		pitchFlapLeftWingModel[2] = new ModelRendererTurbo(this, 505, 427, textureX, textureY); // Box 64
		pitchFlapLeftWingModel[3] = new ModelRendererTurbo(this, 392, 427, textureX, textureY); // Box 68
		pitchFlapLeftWingModel[4] = new ModelRendererTurbo(this, 392, 478, textureX, textureY); // Box 69
		pitchFlapLeftWingModel[5] = new ModelRendererTurbo(this, 392, 427, textureX, textureY); // Box 70
		pitchFlapLeftWingModel[6] = new ModelRendererTurbo(this, 392, 427, textureX, textureY); // Box 80
		pitchFlapLeftWingModel[7] = new ModelRendererTurbo(this, 392, 427, textureX, textureY); // Box 81
		pitchFlapLeftWingModel[8] = new ModelRendererTurbo(this, 392, 478, textureX, textureY); // Box 82

		pitchFlapLeftWingModel[0].addShapeBox(1F, -1F, -16F, 9, 1, 29, 0F,0F, 0F, .4F, -1F, -1F, 1.8F, -1F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, .4F, -1F, 0F, 1.8F, -1F, 0F, -1.5F, 0F, 0F, 0F); // Box 60
		pitchFlapLeftWingModel[0].setRotationPoint(22F, -24.5F, -51F);
		pitchFlapLeftWingModel[0].rotateAngleY = 0.17453293F;

		pitchFlapLeftWingModel[1].addShapeBox(1F, 0F, -16F, 9, 1, 29, 0F,0F, 0F, .4F, -1F, 0F, 1.8F, -1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, .4F, -1F, -1F, 1.8F, -1F, -1F, -1.5F, 0F, 0F, 0F); // Box 61
		pitchFlapLeftWingModel[1].setRotationPoint(22F, -24.5F, -51F);
		pitchFlapLeftWingModel[1].rotateAngleY = 0.17453293F;

		pitchFlapLeftWingModel[2].addShapeBox(0F, -1F, -16F, 1, 2, 29, 0F,0F, -.5F, .2F, 0F, 0F, .4F, 0F, 0F, 0F, 0F, -.5F, .5F, 0F, -.5F, .2F, 0F, 0F, .4F, 0F, 0F, 0F, 0F, -.5F, .5F); // Box 64
		pitchFlapLeftWingModel[2].setRotationPoint(22F, -24.5F, -51F);
		pitchFlapLeftWingModel[2].rotateAngleY = 0.17453293F;

		pitchFlapLeftWingModel[3].addShapeBox(0F, -1F, -21F, 1, 2, 41, 0F,0F, -1F, 1F, 0F, -.7F, 1.2F, 0F, 0F, .1F, 0F, -.5F, .5F, 0F, -1F, 1F, 0F, -.7F, 1.2F, 0F, 0F, .1F, 0F, -.5F, .5F); // Box 68
		pitchFlapLeftWingModel[3].setRotationPoint(29F, -24.5F, -92F);
		pitchFlapLeftWingModel[3].rotateAngleY = 0.17453293F;

		pitchFlapLeftWingModel[4].addShapeBox(1F, 0F, -21F, 9, 1, 41, 0F,0F, 0F, 1.2F, .1F, 0F, -2F, -.5F, 0F, -1F, 0F, 0F, 0F, 0F, -.7F, 1.2F, .1F, -1F, -2F, -.5F, -1F, -1F, 0F, 0F, 0F); // Box 69
		pitchFlapLeftWingModel[4].setRotationPoint(29F, -24.5F, -92F);
		pitchFlapLeftWingModel[4].rotateAngleY = 0.17453293F;

		pitchFlapLeftWingModel[5].addShapeBox(1F, -1F, -21F, 9, 1, 41, 0F,0F, -.7F, 1.2F, 0F, -1F, -2F, -.5F, -1F, -1F, 0F, 0F, .1F, 0F, 0F, 1.2F, 0F, 0F, -2F, -.5F, 0F, -1F, 0F, 0F, .1F); // Box 70
		pitchFlapLeftWingModel[5].setRotationPoint(29F, -24.5F, -92F);
		pitchFlapLeftWingModel[5].rotateAngleY = 0.17453293F;

		pitchFlapLeftWingModel[6].addShapeBox(1F, -1F, -21F, 9, 1, 41, 0F,0F, 0F, .1F, -.5F, -1F, -1F, 0F, -1F, -2F, 0F, -.7F, 1.2F, 0F, 0F, .1F, -.5F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 1.2F); // Box 80
		pitchFlapLeftWingModel[6].setRotationPoint(29F, -24.5F, 93F);
		pitchFlapLeftWingModel[6].rotateAngleY = -0.17453293F;

		pitchFlapLeftWingModel[7].addShapeBox(0F, -1F, -21F, 1, 2, 41, 0F,0F, -.5F, .5F, 0F, 0F, .1F, 0F, -.7F, 1.2F, 0F, -1F, 1F, 0F, -.5F, .5F, 0F, 0F, .1F, 0F, -.7F, 1.2F, 0F, -1F, 1F); // Box 81
		pitchFlapLeftWingModel[7].setRotationPoint(29F, -24.5F, 93F);
		pitchFlapLeftWingModel[7].rotateAngleY = -0.17453293F;

		pitchFlapLeftWingModel[8].addShapeBox(1F, 0F, -21F, 9, 1, 41, 0F,0F, 0F, 0F, -.5F, 0F, -1F, .1F, 0F, -2F, 0F, 0F, 1.2F, 0F, 0F, 0F, -.5F, -1F, -1F, .1F, -1F, -2F, 0F, -.7F, 1.2F); // Box 82
		pitchFlapLeftWingModel[8].setRotationPoint(29F, -24.5F, 93F);
		pitchFlapLeftWingModel[8].rotateAngleY = -0.17453293F;
	}

	private void initpitchFlapRightWingModel_1()
	{
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 505, 427, textureX, textureY); // Box 77
		pitchFlapRightWingModel[1] = new ModelRendererTurbo(this, 505, 427, textureX, textureY); // Box 78
		pitchFlapRightWingModel[2] = new ModelRendererTurbo(this, 505, 478, textureX, textureY); // Box 79

		pitchFlapRightWingModel[0].addShapeBox(0F, -1F, -13F, 1, 2, 29, 0F,0F, -.5F, .5F, 0F, 0F, 0F, 0F, 0F, .4F, 0F, -.5F, .2F, 0F, -.5F, .5F, 0F, 0F, 0F, 0F, 0F, .4F, 0F, -.5F, .2F); // Box 77
		pitchFlapRightWingModel[0].setRotationPoint(22F, -24.5F, 51F);
		pitchFlapRightWingModel[0].rotateAngleY = -0.17453293F;

		pitchFlapRightWingModel[1].addShapeBox(1F, -1F, -13F, 9, 1, 29, 0F,0F, 0F, 0F, -1F, -1F, -1.5F, -1F, -1F, 1.8F, 0F, 0F, .4F, 0F, 0F, 0F, -1F, 0F, -1.5F, -1F, 0F, 1.8F, 0F, 0F, .4F); // Box 78
		pitchFlapRightWingModel[1].setRotationPoint(22F, -24.5F, 51F);
		pitchFlapRightWingModel[1].rotateAngleY = -0.17453293F;

		pitchFlapRightWingModel[2].addShapeBox(1F, 0F, -13F, 9, 1, 29, 0F,0F, 0F, 0F, -1F, 0F, -1.5F, -1F, 0F, 1.8F, 0F, 0F, .4F, 0F, 0F, 0F, -1F, -1F, -1.5F, -1F, -1F, 1.8F, 0F, 0F, .4F); // Box 79
		pitchFlapRightWingModel[2].setRotationPoint(22F, -24.5F, 51F);
		pitchFlapRightWingModel[2].rotateAngleY = -0.17453293F;
	}

	private void initbodyWheelModel_1()
	{
		bodyWheelModel[0] = new ModelRendererTurbo(this, 157, 479, textureX, textureY); // Box 29
		bodyWheelModel[1] = new ModelRendererTurbo(this, 222, 479, textureX, textureY); // Box 30
		bodyWheelModel[2] = new ModelRendererTurbo(this, 131, 479, textureX, textureY); // Box 31
		bodyWheelModel[3] = new ModelRendererTurbo(this, 111, 479, textureX, textureY); // Box 32
		bodyWheelModel[4] = new ModelRendererTurbo(this, 102, 479, textureX, textureY); // Box 33
		bodyWheelModel[5] = new ModelRendererTurbo(this, 83, 479, textureX, textureY); // Box 34
		bodyWheelModel[6] = new ModelRendererTurbo(this, 83, 479, textureX, textureY); // Box 35
		bodyWheelModel[7] = new ModelRendererTurbo(this, 91, 479, textureX, textureY); // Box 36
		bodyWheelModel[8] = new ModelRendererTurbo(this, 83, 479, textureX, textureY); // Box 37
		bodyWheelModel[9] = new ModelRendererTurbo(this, 83, 479, textureX, textureY); // Box 38
		bodyWheelModel[10] = new ModelRendererTurbo(this, 91, 479, textureX, textureY); // Box 40
		bodyWheelModel[11] = new ModelRendererTurbo(this, 83, 479, textureX, textureY); // Box 41
		bodyWheelModel[12] = new ModelRendererTurbo(this, 83, 479, textureX, textureY); // Box 42
		bodyWheelModel[13] = new ModelRendererTurbo(this, 91, 479, textureX, textureY); // Box 43
		bodyWheelModel[14] = new ModelRendererTurbo(this, 102, 479, textureX, textureY); // Box 44
		bodyWheelModel[15] = new ModelRendererTurbo(this, 91, 479, textureX, textureY); // Box 45
		bodyWheelModel[16] = new ModelRendererTurbo(this, 83, 479, textureX, textureY); // Box 46
		bodyWheelModel[17] = new ModelRendererTurbo(this, 83, 479, textureX, textureY); // Box 47
		bodyWheelModel[18] = new ModelRendererTurbo(this, 5, 510, textureX, textureY); // Box 33

		bodyWheelModel[0].addShapeBox(-34F, 1F, -1F, 27, 1, 2, 0F,0F, 0F, .7F, 0F, 0F, .7F, 0F, 0F, .7F, 0F, 0F, .7F, 0F, 0F, .7F, 0F, 0F, .7F, 0F, 0F, .7F, 0F, 0F, .7F); // Box 29
		bodyWheelModel[0].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[1].addShapeBox(-7F, 1F, -1F, 3, 1, 2, 0F,0F, 0F, .7F, .2F, .9F, .7F, .2F, .9F, .7F, 0F, 0F, .7F, 0F, 0F, .7F, .6F, -1F, .7F, .6F, -1F, .7F, 0F, 0F, .7F); // Box 30
		bodyWheelModel[1].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[2].addShapeBox(-42F, 1F, -1F, 8, 1, 2, 0F,0F, 2F, .7F, 0F, 0F, .7F, 0F, 0F, .7F, 0F, 2F, .7F, 0F, -2F, .7F, 0F, 0F, .7F, 0F, 0F, .7F, 0F, -2F, .7F); // Box 31
		bodyWheelModel[2].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[3].addShapeBox(-48F, -1F, -1F, 6, 1, 2, 0F,.1F, 2.8F, .7F, 0F, 0F, .7F, 0F, 0F, .7F, .1F, 2.8F, .7F, .5F, -3F, .7F, 0F, 0F, .7F, 0F, 0F, .7F, .5F, -3F, .7F); // Box 32
		bodyWheelModel[3].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[4].addShapeBox(-31F, -3.5F, -0.5F, 1, 5, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyWheelModel[4].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[5].addShapeBox(-31F, 0F, -1.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyWheelModel[5].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[6].addShapeBox(-32F, -3F, -1.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyWheelModel[6].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[7].addShapeBox(-31F, -2F, -1.5F, 1, 2, 1, 0F,.8F, 0F, -.2F, -1.2F, 0F, -.2F, -1.2F, 0F, -.2F, .8F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Box 36
		bodyWheelModel[7].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[8].addShapeBox(-32F, -3F, 0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyWheelModel[8].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[9].addShapeBox(-31F, 0F, 0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyWheelModel[9].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[10].addShapeBox(-31F, -2F, 0.5F, 1, 2, 1, 0F,.8F, 0F, -.2F, -1.2F, 0F, -.2F, -1.2F, 0F, -.2F, .8F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Box 40
		bodyWheelModel[10].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[11].addShapeBox(-7F, 0F, -1.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyWheelModel[11].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[12].addShapeBox(-7F, 0F, 0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyWheelModel[12].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[13].addShapeBox(-7F, -2F, -1.5F, 1, 2, 1, 0F,.8F, 0F, -.2F, -1.2F, 0F, -.2F, -1.2F, 0F, -.2F, .8F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Box 43
		bodyWheelModel[13].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[14].addShapeBox(-7F, -3.5F, -0.5F, 1, 5, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyWheelModel[14].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[15].addShapeBox(-7F, -2F, 0.5F, 1, 2, 1, 0F,.8F, 0F, -.2F, -1.2F, 0F, -.2F, -1.2F, 0F, -.2F, .8F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Box 45
		bodyWheelModel[15].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[16].addShapeBox(-8F, -3F, 0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyWheelModel[16].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[17].addShapeBox(-8F, -3F, -1.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyWheelModel[17].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[18].addShapeBox(56F, -31F, -2F, 5, 2, 1, 0F,-1.5F, -.3F, -.5F, -1.5F, -.2F, -.5F, -1.5F, -.2F, 0F, -1.5F, -.3F, 0F, 0F, .5F, -.5F, 0F, .3F, -.5F, 0F, .3F, 0F, 0F, .5F, 0F); // Box 33
		bodyWheelModel[18].setRotationPoint(0F, 0F, 0F);
		bodyWheelModel[18].rotateAngleZ = -0.38397244F;
	}

	private void initbodyDoorOpenModel_1()
	{
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 5, 493, textureX, textureY); // Box 29
		bodyDoorOpenModel[1] = new ModelRendererTurbo(this, 5, 502, textureX, textureY); // Box 30
		bodyDoorOpenModel[2] = new ModelRendererTurbo(this, 24, 510, textureX, textureY); // Box 35
		bodyDoorOpenModel[3] = new ModelRendererTurbo(this, 24, 510, textureX, textureY); // Box 38
		bodyDoorOpenModel[4] = new ModelRendererTurbo(this, 5, 510, textureX, textureY); // Box 39
		bodyDoorOpenModel[5] = new ModelRendererTurbo(this, 17, 523, textureX, textureY); // Box 42
		bodyDoorOpenModel[6] = new ModelRendererTurbo(this, 17, 531, textureX, textureY); // Box 43
		bodyDoorOpenModel[7] = new ModelRendererTurbo(this, 17, 517, textureX, textureY); // Box 44
		bodyDoorOpenModel[8] = new ModelRendererTurbo(this, 4, 517, textureX, textureY); // Box 45

		bodyDoorOpenModel[0].addShapeBox(47F, -34F, -1F, 16, 3, 2, 0F,0F, 0F, .2F, .05F, 0F, .2F, .05F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, .05F, 0F, .2F, .05F, 0F, .2F, 0F, 0F, .2F); // Box 29
		bodyDoorOpenModel[0].setRotationPoint(0F, 0F, 0F);
		bodyDoorOpenModel[0].rotateAngleZ = -0.38397244F;

		bodyDoorOpenModel[1].addShapeBox(47F, -31F, -1F, 16, 2, 2, 0F,0F, 0F, .2F, .05F, 0F, .2F, .05F, 0F, .2F, 0F, 0F, .2F, -9F, .5F, .2F, -.25F, .2F, .2F, -.25F, .2F, .2F, -9F, .5F, .2F); // Box 30
		bodyDoorOpenModel[1].setRotationPoint(0F, 0F, 0F);
		bodyDoorOpenModel[1].rotateAngleZ = -0.38397244F;

		bodyDoorOpenModel[2].addShapeBox(56F, -31F, -2F, 5, 2, 1, 0F,-1.5F, -1F, 0F, -1.5F, -.9F, 0F, -1.5F, -.2F, -.5F, -1.5F, -.3F, -.5F, -.7F, .5F, 0F, -.7F, .4F, 0F, 0F, .3F, -.5F, 0F, .5F, -.5F); // Box 35
		bodyDoorOpenModel[2].setRotationPoint(0F, 0F, 0F);
		bodyDoorOpenModel[2].rotateAngleZ = -0.38397244F;

		bodyDoorOpenModel[3].addShapeBox(56F, -31F, 1F, 5, 2, 1, 0F,-1.5F, -.3F, -.5F, -1.5F, -.2F, -.5F, -1.5F, -.9F, 0F, -1.5F, -1F, 0F, 0F, .5F, -.5F, 0F, .3F, -.5F, -.7F, .4F, 0F, -.7F, .5F, 0F); // Box 38
		bodyDoorOpenModel[3].setRotationPoint(0F, 0F, 0F);
		bodyDoorOpenModel[3].rotateAngleZ = -0.38397244F;

		bodyDoorOpenModel[4].addShapeBox(56F, -31F, 1F, 5, 2, 1, 0F,-1.5F, -.3F, 0F, -1.5F, -.2F, 0F, -1.5F, -.2F, -.5F, -1.5F, -.3F, -.5F, 0F, .5F, 0F, 0F, .3F, 0F, 0F, .3F, -.5F, 0F, .5F, -.5F); // Box 39
		bodyDoorOpenModel[4].setRotationPoint(0F, 0F, 0F);
		bodyDoorOpenModel[4].rotateAngleZ = -0.38397244F;

		bodyDoorOpenModel[5].addShapeBox(56F, -28F, -1F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyDoorOpenModel[5].setRotationPoint(0F, 0F, 0F);
		bodyDoorOpenModel[5].rotateAngleZ = -0.38397244F;

		bodyDoorOpenModel[6].addShapeBox(56F, -25.5F, -1F, 5, 1, 2, 0F,0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 43
		bodyDoorOpenModel[6].setRotationPoint(0F, 0F, 0F);
		bodyDoorOpenModel[6].rotateAngleZ = -0.38397244F;

		bodyDoorOpenModel[7].addShapeBox(56F, -29.5F, -1F, 5, 1, 2, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F); // Box 44
		bodyDoorOpenModel[7].setRotationPoint(0F, 0F, 0F);
		bodyDoorOpenModel[7].rotateAngleZ = -0.38397244F;

		bodyDoorOpenModel[8].addShapeBox(57.8F, -29F, -1F, 2, 3, 1, 0F,1F, 0F, .3F, -1F, 0F, .3F, -1F, 0F, .3F, 1F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F); // Box 45
		bodyDoorOpenModel[8].setRotationPoint(0F, 0F, 0F);
		bodyDoorOpenModel[8].rotateAngleZ = -0.38397244F;
	}

	private void initbodyDoorCloseModel_1()
	{
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 5, 502, textureX, textureY); // Box 31
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 5, 493, textureX, textureY); // Box 32
		bodyDoorCloseModel[2] = new ModelRendererTurbo(this, 24, 510, textureX, textureY); // Box 36
		bodyDoorCloseModel[3] = new ModelRendererTurbo(this, 5, 510, textureX, textureY); // Box 37
		bodyDoorCloseModel[4] = new ModelRendererTurbo(this, 24, 510, textureX, textureY); // Box 40
		bodyDoorCloseModel[5] = new ModelRendererTurbo(this, 5, 510, textureX, textureY); // Box 41
		bodyDoorCloseModel[6] = new ModelRendererTurbo(this, 4, 517, textureX, textureY); // Box 46
		bodyDoorCloseModel[7] = new ModelRendererTurbo(this, 17, 517, textureX, textureY); // Box 47
		bodyDoorCloseModel[8] = new ModelRendererTurbo(this, 17, 523, textureX, textureY); // Box 48
		bodyDoorCloseModel[9] = new ModelRendererTurbo(this, 17, 531, textureX, textureY); // Box 49

		bodyDoorCloseModel[0].addShapeBox(55F, -11F, -1F, 16, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, .5F, 0F, -.2F, .2F, 0F, -.2F, .2F, 0F, -9F, .5F, 0F); // Box 31
		bodyDoorCloseModel[0].setRotationPoint(0F, 0F, 0F);

		bodyDoorCloseModel[1].addShapeBox(55F, -14F, -1F, 16, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyDoorCloseModel[1].setRotationPoint(0F, 0F, 0F);

		bodyDoorCloseModel[2].addShapeBox(64F, -11F, -2F, 5, 2, 1, 0F,-1.5F, -1F, 0F, -1.5F, -.9F, 0F, -1.5F, -.2F, -.5F, -1.5F, -.3F, -.5F, -.7F, .5F, 0F, -.7F, .4F, 0F, 0F, .3F, -.5F, 0F, .5F, -.5F); // Box 36
		bodyDoorCloseModel[2].setRotationPoint(0F, 0F, 0F);

		bodyDoorCloseModel[3].addShapeBox(64F, -11F, -2F, 5, 2, 1, 0F,-1.5F, -.3F, -.5F, -1.5F, -.2F, -.5F, -1.5F, -.2F, 0F, -1.5F, -.3F, 0F, 0F, .5F, -.5F, 0F, .3F, -.5F, 0F, .3F, 0F, 0F, .5F, 0F); // Box 37
		bodyDoorCloseModel[3].setRotationPoint(0F, 0F, 0F);

		bodyDoorCloseModel[4].addShapeBox(64F, -11F, 1F, 5, 2, 1, 0F,-1.5F, -.3F, -.5F, -1.5F, -.2F, -.5F, -1.5F, -.9F, 0F, -1.5F, -1F, 0F, 0F, .5F, -.5F, 0F, .3F, -.5F, -.7F, .4F, 0F, -.7F, .5F, 0F); // Box 40
		bodyDoorCloseModel[4].setRotationPoint(0F, 0F, 0F);

		bodyDoorCloseModel[5].addShapeBox(64F, -11F, 1F, 5, 2, 1, 0F,-1.5F, -.3F, 0F, -1.5F, -.2F, 0F, -1.5F, -.2F, -.5F, -1.5F, -.3F, -.5F, 0F, .5F, 0F, 0F, .3F, 0F, 0F, .3F, -.5F, 0F, .5F, -.5F); // Box 41
		bodyDoorCloseModel[5].setRotationPoint(0F, 0F, 0F);

		bodyDoorCloseModel[6].addShapeBox(65.8F, -9F, -1F, 2, 3, 1, 0F,1F, 0F, .3F, -1F, 0F, .3F, -1F, 0F, .3F, 1F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F); // Box 46
		bodyDoorCloseModel[6].setRotationPoint(0F, 0F, 0F);

		bodyDoorCloseModel[7].addShapeBox(64F, -9.5F, -1F, 5, 1, 2, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F); // Box 47
		bodyDoorCloseModel[7].setRotationPoint(0F, 0F, 0F);

		bodyDoorCloseModel[8].addShapeBox(64F, -8F, -1F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyDoorCloseModel[8].setRotationPoint(0F, 0F, 0F);

		bodyDoorCloseModel[9].addShapeBox(64F, -5.5F, -1F, 5, 1, 2, 0F,0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 49
		bodyDoorCloseModel[9].setRotationPoint(0F, 0F, 0F);
	}
}