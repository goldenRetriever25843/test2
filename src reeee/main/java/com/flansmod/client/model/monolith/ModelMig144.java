//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Mig144FlapJack
// Model Creator: 
// Created on: 02.07.2016 - 22:22:11
// Last changed on: 02.07.2016 - 22:22:11

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMig144 extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelMig144() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[273];
		leftWingModel = new ModelRendererTurbo[24];
		rightWingModel = new ModelRendererTurbo[24];
		pitchFlapLeftModel = new ModelRendererTurbo[18];
		pitchFlapRightModel = new ModelRendererTurbo[18];
		pitchFlapLeftWingModel = new ModelRendererTurbo[4];
		pitchFlapRightWingModel = new ModelRendererTurbo[4];
		bodyWheelModel = new ModelRendererTurbo[70];
		bodyDoorOpenModel = new ModelRendererTurbo[2];
		bodyDoorCloseModel = new ModelRendererTurbo[12];

		initbodyModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		initpitchFlapLeftModel_1();
		initpitchFlapRightModel_1();
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
		bodyModel[0] = new ModelRendererTurbo(this, 163, 349, textureX, textureY); // Box 12
		bodyModel[1] = new ModelRendererTurbo(this, 11, 455, textureX, textureY); // Box 18
		bodyModel[2] = new ModelRendererTurbo(this, 127, 271, textureX, textureY); // Box 19
		bodyModel[3] = new ModelRendererTurbo(this, 310, 557, textureX, textureY); // Box 20
		bodyModel[4] = new ModelRendererTurbo(this, 311, 487, textureX, textureY); // Box 21
		bodyModel[5] = new ModelRendererTurbo(this, 311, 531, textureX, textureY); // Box 22
		bodyModel[6] = new ModelRendererTurbo(this, 191, 419, textureX, textureY); // Box 0
		bodyModel[7] = new ModelRendererTurbo(this, 127, 395, textureX, textureY); // Box 1
		bodyModel[8] = new ModelRendererTurbo(this, 5, 148, textureX, textureY); // Box 2
		bodyModel[9] = new ModelRendererTurbo(this, 5, 208, textureX, textureY); // Box 4
		bodyModel[10] = new ModelRendererTurbo(this, 5, 173, textureX, textureY); // Box 5
		bodyModel[11] = new ModelRendererTurbo(this, 5, 119, textureX, textureY); // Box 6
		bodyModel[12] = new ModelRendererTurbo(this, 5, 237, textureX, textureY); // Box 8
		bodyModel[13] = new ModelRendererTurbo(this, 5, 119, textureX, textureY); // Box 9
		bodyModel[14] = new ModelRendererTurbo(this, 5, 237, textureX, textureY); // Box 10
		bodyModel[15] = new ModelRendererTurbo(this, 5, 148, textureX, textureY); // Box 11
		bodyModel[16] = new ModelRendererTurbo(this, 5, 173, textureX, textureY); // Box 12
		bodyModel[17] = new ModelRendererTurbo(this, 5, 208, textureX, textureY); // Box 13
		bodyModel[18] = new ModelRendererTurbo(this, 127, 453, textureX, textureY); // Box 16
		bodyModel[19] = new ModelRendererTurbo(this, 191, 419, textureX, textureY); // Box 17
		bodyModel[20] = new ModelRendererTurbo(this, 11, 401, textureX, textureY); // Box 18
		bodyModel[21] = new ModelRendererTurbo(this, 11, 431, textureX, textureY); // Box 19
		bodyModel[22] = new ModelRendererTurbo(this, 168, 453, textureX, textureY); // Box 20
		bodyModel[23] = new ModelRendererTurbo(this, 256, 419, textureX, textureY); // Box 21
		bodyModel[24] = new ModelRendererTurbo(this, 167, 389, textureX, textureY); // Box 22
		bodyModel[25] = new ModelRendererTurbo(this, 127, 424, textureX, textureY); // Box 23
		bodyModel[26] = new ModelRendererTurbo(this, 257, 335, textureX, textureY); // Box 24
		bodyModel[27] = new ModelRendererTurbo(this, 167, 389, textureX, textureY); // Box 25
		bodyModel[28] = new ModelRendererTurbo(this, 257, 335, textureX, textureY); // Box 26
		bodyModel[29] = new ModelRendererTurbo(this, 127, 424, textureX, textureY); // Box 27
		bodyModel[30] = new ModelRendererTurbo(this, 11, 455, textureX, textureY); // Box 28
		bodyModel[31] = new ModelRendererTurbo(this, 11, 431, textureX, textureY); // Box 29
		bodyModel[32] = new ModelRendererTurbo(this, 11, 401, textureX, textureY); // Box 30
		bodyModel[33] = new ModelRendererTurbo(this, 163, 349, textureX, textureY); // Box 31
		bodyModel[34] = new ModelRendererTurbo(this, 127, 453, textureX, textureY); // Box 32
		bodyModel[35] = new ModelRendererTurbo(this, 191, 419, textureX, textureY); // Box 33
		bodyModel[36] = new ModelRendererTurbo(this, 168, 453, textureX, textureY); // Box 34
		bodyModel[37] = new ModelRendererTurbo(this, 256, 419, textureX, textureY); // Box 35
		bodyModel[38] = new ModelRendererTurbo(this, 325, 407, textureX, textureY); // Box 53
		bodyModel[39] = new ModelRendererTurbo(this, 446, 296, textureX, textureY); // Box 54
		bodyModel[40] = new ModelRendererTurbo(this, 446, 286, textureX, textureY); // Box 55
		bodyModel[41] = new ModelRendererTurbo(this, 5, 298, textureX, textureY); // Box 59
		bodyModel[42] = new ModelRendererTurbo(this, 11, 510, textureX, textureY); // Box 62
		bodyModel[43] = new ModelRendererTurbo(this, 101, 502, textureX, textureY); // Box 63
		bodyModel[44] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 64
		bodyModel[45] = new ModelRendererTurbo(this, 11, 608, textureX, textureY); // Box 65
		bodyModel[46] = new ModelRendererTurbo(this, 101, 585, textureX, textureY); // Box 66
		bodyModel[47] = new ModelRendererTurbo(this, 178, 485, textureX, textureY); // Box 67
		bodyModel[48] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 68
		bodyModel[49] = new ModelRendererTurbo(this, 178, 571, textureX, textureY); // Box 69
		bodyModel[50] = new ModelRendererTurbo(this, 257, 549, textureX, textureY); // Box 70
		bodyModel[51] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 71
		bodyModel[52] = new ModelRendererTurbo(this, 257, 485, textureX, textureY); // Box 72
		bodyModel[53] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 73
		bodyModel[54] = new ModelRendererTurbo(this, 5, 275, textureX, textureY); // Box 74
		bodyModel[55] = new ModelRendererTurbo(this, 5, 344, textureX, textureY); // Box 1
		bodyModel[56] = new ModelRendererTurbo(this, 5, 367, textureX, textureY); // Box 2
		bodyModel[57] = new ModelRendererTurbo(this, 100, 367, textureX, textureY); // Box 6
		bodyModel[58] = new ModelRendererTurbo(this, 11, 562, textureX, textureY); // Box 1
		bodyModel[59] = new ModelRendererTurbo(this, 11, 585, textureX, textureY); // Box 2
		bodyModel[60] = new ModelRendererTurbo(this, 101, 519, textureX, textureY); // Box 3
		bodyModel[61] = new ModelRendererTurbo(this, 101, 542, textureX, textureY); // Box 4
		bodyModel[62] = new ModelRendererTurbo(this, 101, 562, textureX, textureY); // Box 5
		bodyModel[63] = new ModelRendererTurbo(this, 178, 508, textureX, textureY); // Box 6
		bodyModel[64] = new ModelRendererTurbo(this, 178, 531, textureX, textureY); // Box 7
		bodyModel[65] = new ModelRendererTurbo(this, 178, 548, textureX, textureY); // Box 8
		bodyModel[66] = new ModelRendererTurbo(this, 257, 532, textureX, textureY); // Box 9
		bodyModel[67] = new ModelRendererTurbo(this, 257, 519, textureX, textureY); // Box 10
		bodyModel[68] = new ModelRendererTurbo(this, 257, 502, textureX, textureY); // Box 11
		bodyModel[69] = new ModelRendererTurbo(this, 311, 520, textureX, textureY); // Box 12
		bodyModel[70] = new ModelRendererTurbo(this, 311, 498, textureX, textureY); // Box 13
		bodyModel[71] = new ModelRendererTurbo(this, 311, 509, textureX, textureY); // Box 14
		bodyModel[72] = new ModelRendererTurbo(this, 101, 604, textureX, textureY); // Box 15
		bodyModel[73] = new ModelRendererTurbo(this, 5, 275, textureX, textureY); // Box 17
		bodyModel[74] = new ModelRendererTurbo(this, 11, 608, textureX, textureY); // Box 18
		bodyModel[75] = new ModelRendererTurbo(this, 101, 604, textureX, textureY); // Box 19
		bodyModel[76] = new ModelRendererTurbo(this, 178, 571, textureX, textureY); // Box 20
		bodyModel[77] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 21
		bodyModel[78] = new ModelRendererTurbo(this, 178, 485, textureX, textureY); // Box 22
		bodyModel[79] = new ModelRendererTurbo(this, 257, 485, textureX, textureY); // Box 23
		bodyModel[80] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 24
		bodyModel[81] = new ModelRendererTurbo(this, 257, 549, textureX, textureY); // Box 25
		bodyModel[82] = new ModelRendererTurbo(this, 311, 531, textureX, textureY); // Box 26
		bodyModel[83] = new ModelRendererTurbo(this, 310, 557, textureX, textureY); // Box 27
		bodyModel[84] = new ModelRendererTurbo(this, 311, 487, textureX, textureY); // Box 28
		bodyModel[85] = new ModelRendererTurbo(this, 11, 585, textureX, textureY); // Box 29
		bodyModel[86] = new ModelRendererTurbo(this, 11, 562, textureX, textureY); // Box 30
		bodyModel[87] = new ModelRendererTurbo(this, 101, 542, textureX, textureY); // Box 33
		bodyModel[88] = new ModelRendererTurbo(this, 101, 562, textureX, textureY); // Box 34
		bodyModel[89] = new ModelRendererTurbo(this, 178, 548, textureX, textureY); // Box 35
		bodyModel[90] = new ModelRendererTurbo(this, 178, 531, textureX, textureY); // Box 36
		bodyModel[91] = new ModelRendererTurbo(this, 178, 508, textureX, textureY); // Box 37
		bodyModel[92] = new ModelRendererTurbo(this, 257, 502, textureX, textureY); // Box 38
		bodyModel[93] = new ModelRendererTurbo(this, 257, 519, textureX, textureY); // Box 39
		bodyModel[94] = new ModelRendererTurbo(this, 257, 532, textureX, textureY); // Box 40
		bodyModel[95] = new ModelRendererTurbo(this, 311, 520, textureX, textureY); // Box 41
		bodyModel[96] = new ModelRendererTurbo(this, 311, 509, textureX, textureY); // Box 42
		bodyModel[97] = new ModelRendererTurbo(this, 311, 498, textureX, textureY); // Box 43
		bodyModel[98] = new ModelRendererTurbo(this, 5, 367, textureX, textureY); // Box 45
		bodyModel[99] = new ModelRendererTurbo(this, 5, 344, textureX, textureY); // Box 46
		bodyModel[100] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 49
		bodyModel[101] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 50
		bodyModel[102] = new ModelRendererTurbo(this, 101, 502, textureX, textureY); // Box 51
		bodyModel[103] = new ModelRendererTurbo(this, 100, 367, textureX, textureY); // Box 53
		bodyModel[104] = new ModelRendererTurbo(this, 101, 585, textureX, textureY); // Box 54
		bodyModel[105] = new ModelRendererTurbo(this, 446, 407, textureX, textureY); // Box 56
		bodyModel[106] = new ModelRendererTurbo(this, 325, 385, textureX, textureY); // Box 57
		bodyModel[107] = new ModelRendererTurbo(this, 325, 428, textureX, textureY); // Box 0
		bodyModel[108] = new ModelRendererTurbo(this, 403, 428, textureX, textureY); // Box 1
		bodyModel[109] = new ModelRendererTurbo(this, 325, 396, textureX, textureY); // Box 2
		bodyModel[110] = new ModelRendererTurbo(this, 360, 428, textureX, textureY); // Box 3
		bodyModel[111] = new ModelRendererTurbo(this, 403, 428, textureX, textureY); // Box 5
		bodyModel[112] = new ModelRendererTurbo(this, 325, 428, textureX, textureY); // Box 6
		bodyModel[113] = new ModelRendererTurbo(this, 325, 385, textureX, textureY); // Box 7
		bodyModel[114] = new ModelRendererTurbo(this, 325, 407, textureX, textureY); // Box 8
		bodyModel[115] = new ModelRendererTurbo(this, 325, 396, textureX, textureY); // Box 10
		bodyModel[116] = new ModelRendererTurbo(this, 360, 428, textureX, textureY); // Box 11
		bodyModel[117] = new ModelRendererTurbo(this, 11, 491, textureX, textureY); // Box 1
		bodyModel[118] = new ModelRendererTurbo(this, 11, 491, textureX, textureY); // Box 3
		bodyModel[119] = new ModelRendererTurbo(this, 101, 485, textureX, textureY); // Box 4
		bodyModel[120] = new ModelRendererTurbo(this, 377, 319, textureX, textureY); // Box 5
		bodyModel[121] = new ModelRendererTurbo(this, 377, 319, textureX, textureY); // Box 6
		bodyModel[122] = new ModelRendererTurbo(this, 101, 485, textureX, textureY); // Box 0
		bodyModel[123] = new ModelRendererTurbo(this, 379, 269, textureX, textureY); // Box 1
		bodyModel[124] = new ModelRendererTurbo(this, 379, 296, textureX, textureY); // Box 3
		bodyModel[125] = new ModelRendererTurbo(this, 446, 407, textureX, textureY); // Box 4
		bodyModel[126] = new ModelRendererTurbo(this, 379, 286, textureX, textureY); // Box 0
		bodyModel[127] = new ModelRendererTurbo(this, 379, 307, textureX, textureY); // Box 1
		bodyModel[128] = new ModelRendererTurbo(this, 408, 306, textureX, textureY); // Box 2
		bodyModel[129] = new ModelRendererTurbo(this, 451, 359, textureX, textureY); // Box 6
		bodyModel[130] = new ModelRendererTurbo(this, 464, 359, textureX, textureY); // Box 7
		bodyModel[131] = new ModelRendererTurbo(this, 481, 359, textureX, textureY); // Box 10
		bodyModel[132] = new ModelRendererTurbo(this, 451, 359, textureX, textureY); // Box 15
		bodyModel[133] = new ModelRendererTurbo(this, 464, 359, textureX, textureY); // Box 16
		bodyModel[134] = new ModelRendererTurbo(this, 481, 359, textureX, textureY); // Box 17
		bodyModel[135] = new ModelRendererTurbo(this, 504, 359, textureX, textureY); // Box 18
		bodyModel[136] = new ModelRendererTurbo(this, 437, 306, textureX, textureY); // Box 20
		bodyModel[137] = new ModelRendererTurbo(this, 408, 306, textureX, textureY); // Box 22
		bodyModel[138] = new ModelRendererTurbo(this, 379, 307, textureX, textureY); // Box 23
		bodyModel[139] = new ModelRendererTurbo(this, 359, 445, textureX, textureY); // Box 21
		bodyModel[140] = new ModelRendererTurbo(this, 359, 474, textureX, textureY); // Box 22
		bodyModel[141] = new ModelRendererTurbo(this, 359, 509, textureX, textureY); // Box 23
		bodyModel[142] = new ModelRendererTurbo(this, 359, 540, textureX, textureY); // Box 24
		bodyModel[143] = new ModelRendererTurbo(this, 359, 633, textureX, textureY); // Box 25
		bodyModel[144] = new ModelRendererTurbo(this, 359, 604, textureX, textureY); // Box 26
		bodyModel[145] = new ModelRendererTurbo(this, 359, 575, textureX, textureY); // Box 27
		bodyModel[146] = new ModelRendererTurbo(this, 101, 519, textureX, textureY); // Box 29
		bodyModel[147] = new ModelRendererTurbo(this, 11, 533, textureX, textureY); // Box 31
		bodyModel[148] = new ModelRendererTurbo(this, 5, 321, textureX, textureY); // Box 32
		bodyModel[149] = new ModelRendererTurbo(this, 5, 321, textureX, textureY); // Box 0
		bodyModel[150] = new ModelRendererTurbo(this, 5, 298, textureX, textureY); // Box 1
		bodyModel[151] = new ModelRendererTurbo(this, 11, 510, textureX, textureY); // Box 2
		bodyModel[152] = new ModelRendererTurbo(this, 11, 533, textureX, textureY); // Box 3
		bodyModel[153] = new ModelRendererTurbo(this, 407, 155, textureX, textureY); // Box 0
		bodyModel[154] = new ModelRendererTurbo(this, 347, 109, textureX, textureY); // Box 2
		bodyModel[155] = new ModelRendererTurbo(this, 347, 138, textureX, textureY); // Box 3
		bodyModel[156] = new ModelRendererTurbo(this, 347, 161, textureX, textureY); // Box 4
		bodyModel[157] = new ModelRendererTurbo(this, 394, 207, textureX, textureY); // Box 9
		bodyModel[158] = new ModelRendererTurbo(this, 347, 230, textureX, textureY); // Box 10
		bodyModel[159] = new ModelRendererTurbo(this, 616, 564, textureX, textureY); // Box 44
		bodyModel[160] = new ModelRendererTurbo(this, 616, 527, textureX, textureY); // Box 45
		bodyModel[161] = new ModelRendererTurbo(this, 616, 486, textureX, textureY); // Box 46
		bodyModel[162] = new ModelRendererTurbo(this, 616, 451, textureX, textureY); // Box 47
		bodyModel[163] = new ModelRendererTurbo(this, 616, 422, textureX, textureY); // Box 48
		bodyModel[164] = new ModelRendererTurbo(this, 699, 420, textureX, textureY); // Box 0
		bodyModel[165] = new ModelRendererTurbo(this, 699, 478, textureX, textureY); // Box 1
		bodyModel[166] = new ModelRendererTurbo(this, 699, 501, textureX, textureY); // Box 2
		bodyModel[167] = new ModelRendererTurbo(this, 699, 530, textureX, textureY); // Box 3
		bodyModel[168] = new ModelRendererTurbo(this, 699, 449, textureX, textureY); // Box 4
		bodyModel[169] = new ModelRendererTurbo(this, 347, 184, textureX, textureY); // Box 5
		bodyModel[170] = new ModelRendererTurbo(this, 347, 207, textureX, textureY); // Box 6
		bodyModel[171] = new ModelRendererTurbo(this, 347, 109, textureX, textureY); // Box 7
		bodyModel[172] = new ModelRendererTurbo(this, 347, 138, textureX, textureY); // Box 8
		bodyModel[173] = new ModelRendererTurbo(this, 347, 161, textureX, textureY); // Box 9
		bodyModel[174] = new ModelRendererTurbo(this, 347, 184, textureX, textureY); // Box 10
		bodyModel[175] = new ModelRendererTurbo(this, 347, 207, textureX, textureY); // Box 11
		bodyModel[176] = new ModelRendererTurbo(this, 347, 230, textureX, textureY); // Box 12
		bodyModel[177] = new ModelRendererTurbo(this, 407, 155, textureX, textureY); // Box 14
		bodyModel[178] = new ModelRendererTurbo(this, 699, 449, textureX, textureY); // Box 15
		bodyModel[179] = new ModelRendererTurbo(this, 699, 420, textureX, textureY); // Box 19
		bodyModel[180] = new ModelRendererTurbo(this, 616, 564, textureX, textureY); // Box 20
		bodyModel[181] = new ModelRendererTurbo(this, 616, 527, textureX, textureY); // Box 21
		bodyModel[182] = new ModelRendererTurbo(this, 616, 486, textureX, textureY); // Box 22
		bodyModel[183] = new ModelRendererTurbo(this, 616, 451, textureX, textureY); // Box 23
		bodyModel[184] = new ModelRendererTurbo(this, 616, 422, textureX, textureY); // Box 24
		bodyModel[185] = new ModelRendererTurbo(this, 329, 348, textureX, textureY); // Box 0
		bodyModel[186] = new ModelRendererTurbo(this, 329, 337, textureX, textureY); // Box 1
		bodyModel[187] = new ModelRendererTurbo(this, 329, 348, textureX, textureY); // Box 2
		bodyModel[188] = new ModelRendererTurbo(this, 329, 337, textureX, textureY); // Box 3
		bodyModel[189] = new ModelRendererTurbo(this, 377, 342, textureX, textureY); // Box 0
		bodyModel[190] = new ModelRendererTurbo(this, 437, 462, textureX, textureY); // Box 1
		bodyModel[191] = new ModelRendererTurbo(this, 437, 443, textureX, textureY); // Box 2
		bodyModel[192] = new ModelRendererTurbo(this, 478, 464, textureX, textureY); // Box 3
		bodyModel[193] = new ModelRendererTurbo(this, 437, 493, textureX, textureY); // Box 4
		bodyModel[194] = new ModelRendererTurbo(this, 478, 493, textureX, textureY); // Box 5
		bodyModel[195] = new ModelRendererTurbo(this, 478, 446, textureX, textureY); // Box 6
		bodyModel[196] = new ModelRendererTurbo(this, 507, 446, textureX, textureY); // Box 7
		bodyModel[197] = new ModelRendererTurbo(this, 507, 459, textureX, textureY); // Box 8
		bodyModel[198] = new ModelRendererTurbo(this, 507, 446, textureX, textureY); // Box 9
		bodyModel[199] = new ModelRendererTurbo(this, 507, 459, textureX, textureY); // Box 10
		bodyModel[200] = new ModelRendererTurbo(this, 486, 163, textureX, textureY); // Box 1
		bodyModel[201] = new ModelRendererTurbo(this, 486, 186, textureX, textureY); // Box 2
		bodyModel[202] = new ModelRendererTurbo(this, 486, 139, textureX, textureY); // Box 3
		bodyModel[203] = new ModelRendererTurbo(this, 497, 228, textureX, textureY); // Box 4
		bodyModel[204] = new ModelRendererTurbo(this, 497, 241, textureX, textureY); // Box 5
		bodyModel[205] = new ModelRendererTurbo(this, 526, 241, textureX, textureY); // Box 6
		bodyModel[206] = new ModelRendererTurbo(this, 486, 113, textureX, textureY); // Box 8
		bodyModel[207] = new ModelRendererTurbo(this, 497, 217, textureX, textureY); // Box 11
		bodyModel[208] = new ModelRendererTurbo(this, 497, 217, textureX, textureY); // Box 13
		bodyModel[209] = new ModelRendererTurbo(this, 497, 217, textureX, textureY); // Box 15
		bodyModel[210] = new ModelRendererTurbo(this, 532, 212, textureX, textureY); // Box 18
		bodyModel[211] = new ModelRendererTurbo(this, 532, 212, textureX, textureY); // Box 19
		bodyModel[212] = new ModelRendererTurbo(this, 532, 212, textureX, textureY); // Box 20
		bodyModel[213] = new ModelRendererTurbo(this, 497, 217, textureX, textureY); // Box 21
		bodyModel[214] = new ModelRendererTurbo(this, 497, 217, textureX, textureY); // Box 22
		bodyModel[215] = new ModelRendererTurbo(this, 497, 217, textureX, textureY); // Box 23
		bodyModel[216] = new ModelRendererTurbo(this, 359, 445, textureX, textureY); // Box 0
		bodyModel[217] = new ModelRendererTurbo(this, 359, 474, textureX, textureY); // Box 1
		bodyModel[218] = new ModelRendererTurbo(this, 359, 509, textureX, textureY); // Box 2
		bodyModel[219] = new ModelRendererTurbo(this, 359, 540, textureX, textureY); // Box 3
		bodyModel[220] = new ModelRendererTurbo(this, 359, 575, textureX, textureY); // Box 4
		bodyModel[221] = new ModelRendererTurbo(this, 359, 604, textureX, textureY); // Box 5
		bodyModel[222] = new ModelRendererTurbo(this, 359, 633, textureX, textureY); // Box 6
		bodyModel[223] = new ModelRendererTurbo(this, 713, 881, textureX, textureY); // Box 75
		bodyModel[224] = new ModelRendererTurbo(this, 453, 657, textureX, textureY); // Box 79
		bodyModel[225] = new ModelRendererTurbo(this, 453, 657, textureX, textureY); // Box 82
		bodyModel[226] = new ModelRendererTurbo(this, 726, 767, textureX, textureY); // Box 83
		bodyModel[227] = new ModelRendererTurbo(this, 726, 719, textureX, textureY); // Box 84
		bodyModel[228] = new ModelRendererTurbo(this, 726, 742, textureX, textureY); // Box 85
		bodyModel[229] = new ModelRendererTurbo(this, 726, 706, textureX, textureY); // Box 86
		bodyModel[230] = new ModelRendererTurbo(this, 695, 676, textureX, textureY); // Box 87
		bodyModel[231] = new ModelRendererTurbo(this, 695, 611, textureX, textureY); // Box 88
		bodyModel[232] = new ModelRendererTurbo(this, 726, 677, textureX, textureY); // Box 89
		bodyModel[233] = new ModelRendererTurbo(this, 726, 840, textureX, textureY); // Box 91
		bodyModel[234] = new ModelRendererTurbo(this, 726, 815, textureX, textureY); // Box 92
		bodyModel[235] = new ModelRendererTurbo(this, 811, 840, textureX, textureY); // Box 93
		bodyModel[236] = new ModelRendererTurbo(this, 726, 840, textureX, textureY); // Box 94
		bodyModel[237] = new ModelRendererTurbo(this, 811, 840, textureX, textureY); // Box 95
		bodyModel[238] = new ModelRendererTurbo(this, 726, 815, textureX, textureY); // Box 96
		bodyModel[239] = new ModelRendererTurbo(this, 726, 719, textureX, textureY); // Box 97
		bodyModel[240] = new ModelRendererTurbo(this, 726, 742, textureX, textureY); // Box 98
		bodyModel[241] = new ModelRendererTurbo(this, 726, 767, textureX, textureY); // Box 99
		bodyModel[242] = new ModelRendererTurbo(this, 695, 611, textureX, textureY); // Box 0
		bodyModel[243] = new ModelRendererTurbo(this, 695, 676, textureX, textureY); // Box 1
		bodyModel[244] = new ModelRendererTurbo(this, 726, 677, textureX, textureY); // Box 2
		bodyModel[245] = new ModelRendererTurbo(this, 695, 676, textureX, textureY); // Box 5
		bodyModel[246] = new ModelRendererTurbo(this, 695, 611, textureX, textureY); // Box 6
		bodyModel[247] = new ModelRendererTurbo(this, 695, 676, textureX, textureY); // Box 7
		bodyModel[248] = new ModelRendererTurbo(this, 726, 677, textureX, textureY); // Box 8
		bodyModel[249] = new ModelRendererTurbo(this, 726, 677, textureX, textureY); // Box 9
		bodyModel[250] = new ModelRendererTurbo(this, 695, 611, textureX, textureY); // Box 10
		bodyModel[251] = new ModelRendererTurbo(this, 713, 881, textureX, textureY); // Box 11
		bodyModel[252] = new ModelRendererTurbo(this, 726, 706, textureX, textureY); // Box 12
		bodyModel[253] = new ModelRendererTurbo(this, 764, 478, textureX, textureY); // Box 0
		bodyModel[254] = new ModelRendererTurbo(this, 764, 530, textureX, textureY); // Box 1
		bodyModel[255] = new ModelRendererTurbo(this, 764, 501, textureX, textureY); // Box 2
		bodyModel[256] = new ModelRendererTurbo(this, 699, 478, textureX, textureY); // Box 3
		bodyModel[257] = new ModelRendererTurbo(this, 699, 501, textureX, textureY); // Box 4
		bodyModel[258] = new ModelRendererTurbo(this, 699, 530, textureX, textureY); // Box 5
		bodyModel[259] = new ModelRendererTurbo(this, 764, 530, textureX, textureY); // Box 6
		bodyModel[260] = new ModelRendererTurbo(this, 764, 501, textureX, textureY); // Box 7
		bodyModel[261] = new ModelRendererTurbo(this, 764, 478, textureX, textureY); // Box 8
		bodyModel[262] = new ModelRendererTurbo(this, 453, 657, textureX, textureY); // Box 0
		bodyModel[263] = new ModelRendererTurbo(this, 453, 657, textureX, textureY); // Box 1
		bodyModel[264] = new ModelRendererTurbo(this, 563, 107, textureX, textureY); // Box 2
		bodyModel[265] = new ModelRendererTurbo(this, 563, 107, textureX, textureY); // Box 3
		bodyModel[266] = new ModelRendererTurbo(this, 772, 254, textureX, textureY); // Decal3
		bodyModel[267] = new ModelRendererTurbo(this, 772, 313, textureX, textureY); // Decal4
		bodyModel[268] = new ModelRendererTurbo(this, 310, 568, textureX, textureY); // Box 0
		bodyModel[269] = new ModelRendererTurbo(this, 213, 455, textureX, textureY); // Box 0
		bodyModel[270] = new ModelRendererTurbo(this, 280, 456, textureX, textureY); // Box 2
		bodyModel[271] = new ModelRendererTurbo(this, 280, 456, textureX, textureY); // Box 3
		bodyModel[272] = new ModelRendererTurbo(this, 213, 455, textureX, textureY); // Box 4

		bodyModel[0].addShapeBox(-24F, -27F, -18F, 30, 12, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-24F, -15F, -18F, 30, 5, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-54F, -28F, -27F, 60, 1, 54, 0F,0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F); // Box 19
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-140F, -36F, -1F, 13, 3, 1, 0F,0F, -2F, -.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-140F, -38F, -1F, 13, 2, 1, 0F,0F, -4F, -.5F, 0F, 0F, 1F, 0F, .5F, 0F, 0F, -4F, 0F, 0F, 2F, -.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 21
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-140F, -33F, -1F, 13, 2, 1, 0F,0F, 0F, -.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -.5F, 0F, 0F, 1F, 0F, .5F, 0F, 0F, -2F, 0F); // Box 22
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-57F, -27F, -1F, 21, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F); // Box 0
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-36F, -27F, -1F, 12, 17, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 1
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(6F, -44F, -27F, 146, 6, 9, 0F,0F, -3F, -3F, 0F, -5F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(6F, -18F, -27F, 146, 8, 9, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -6F, -4F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(6F, -38F, -27F, 146, 20, 9, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(6F, -46F, -18F, 146, 5, 18, 0F,0F, -2F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(6F, -15F, -18F, 146, 5, 18, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(6F, -46F, 0F, 146, 5, 18, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(6F, -15F, 0F, 146, 5, 18, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(6F, -44F, 18F, 146, 6, 9, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(6F, -38F, 18F, 146, 20, 9, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(6F, -18F, 18F, 146, 8, 9, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -6F, -4F, 0F, -3F, -3F); // Box 13
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-36F, -27F, -22F, 12, 17, 4, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -4F, 0F); // Box 16
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-57F, -27F, -20F, 21, 13, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F); // Box 17
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-24F, -27F, -24F, 30, 12, 6, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-24F, -15F, -24F, 30, 5, 6, 0F,0F, 0F, 0F, 0F, 3F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 19
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-36F, -27F, -24F, 12, 14, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 2F); // Box 20
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-57F, -27F, -22F, 21, 13, 2, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -13F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -13F, 1F); // Box 21
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-57F, -27F, -18F, 34, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 22
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-36F, -15F, -18F, 12, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-38F, -15F, -18F, 2, 1, 17, 0F,0F, .25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F); // Box 24
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-57F, -27F, 1F, 34, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 25
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-38F, -15F, 1F, 2, 1, 17, 0F,0F, .25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F); // Box 26
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-36F, -15F, 1F, 12, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(-24F, -15F, 0F, 30, 5, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 28
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(-24F, -15F, 18F, 30, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -2F); // Box 29
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-24F, -27F, 18F, 30, 12, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 3F, 0F, 0F, 0F); // Box 30
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(-24F, -27F, 0F, 30, 12, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-36F, -27F, 18F, 12, 17, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -4F, -2F); // Box 32
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(-57F, -27F, 18F, 21, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, -1F); // Box 33
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-36F, -27F, 22F, 12, 14, 2, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F); // Box 34
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-57F, -27F, 20F, 21, 13, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -13F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -13F, -3F); // Box 35
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-42F, -54F, -4F, 48, 8, 4, 0F,-2.5F, -2F, 0F, 0F, -7.5F, 0F, 0F, -7F, 0F, -3F, -1F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 53
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(-70F, -50F, -9F, 28, 2, 1, 0F,0F, 0F, -1F, 1.5F, 0F, -1F, 1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(-91F, -50F, -9F, 21, 2, 1, 0F,-1F, -3F, -4F, 0F, 0F, -1F, 0F, 0F, 1F, -1F, -3F, 4F, 0F, 2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 3F); // Box 55
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(-42F, -46F, -18F, 48, 5, 8, 0F,0F, -1F, -2F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(-70F, -48F, -14F, 28, 7, 4, 0F,0F, -2F, 0F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(-93F, -46F, -10F, 23, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 63
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(-93F, -41F, -10F, 23, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 64
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(-70F, -33F, -14F, 28, 5, 14, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(-93F, -33F, -10F, 23, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 66
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(-113F, -46F, -10F, 20, 5, 10, 0F,0F, -4F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 67
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(-113F, -41F, -10F, 20, 8, 10, 0F,0F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(-113F, -33F, -10F, 20, 5, 10, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 69
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(-127F, -33F, -5F, 14, 4, 5, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 70
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(-127F, -39F, -5F, 14, 6, 5, 0F,0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(-127F, -42F, -5F, 14, 3, 5, 0F,0F, -4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 72
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(-70F, -41F, -14F, 28, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(-42F, -46F, -10F, 48, 5, 10, 0F,0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(-42F, -38F, -27F, 48, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addShapeBox(-42F, -33F, -27F, 34, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addShapeBox(-8F, -33F, -27F, 14, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[57].setRotationPoint(0F, 0F, 0F);

		bodyModel[58].addShapeBox(-70F, -38F, -27F, 28, 5, 9, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F); // Box 1
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addShapeBox(-70F, -33F, -27F, 28, 5, 9, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -2F, -6F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 4F); // Box 2
		bodyModel[59].setRotationPoint(0F, 0F, 0F);

		bodyModel[60].addShapeBox(-93F, -45F, -23F, 23, 7, 9, 0F,0F, -2.5F, -8F, 0F, -3F, -3F, 0F, 1F, 0F, 0F, 1F, 4F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F); // Box 3
		bodyModel[60].setRotationPoint(0F, 0F, 0F);

		bodyModel[61].addShapeBox(-93F, -38F, -23F, 23, 5, 9, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F); // Box 4
		bodyModel[61].setRotationPoint(0F, 0F, 0F);

		bodyModel[62].addShapeBox(-93F, -33F, -23F, 23, 5, 9, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -2F, -8F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 4F); // Box 5
		bodyModel[62].setRotationPoint(0F, 0F, 0F);

		bodyModel[63].addShapeBox(-113F, -45F, -17F, 20, 7, 7, 0F,0F, -4.5F, -8.5F, 0F, -2.5F, -2F, 0F, 1F, 0F, 0F, -3F, 5F, 0F, 1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F); // Box 6
		bodyModel[63].setRotationPoint(0F, 0F, 0F);

		bodyModel[64].addShapeBox(-113F, -38F, -17F, 20, 5, 7, 0F,0F, -1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -.5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F); // Box 7
		bodyModel[64].setRotationPoint(0F, 0F, 0F);

		bodyModel[65].addShapeBox(-113F, -33F, -17F, 20, 5, 7, 0F,0F, .5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -3F, -8F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, -1F, 5F); // Box 8
		bodyModel[65].setRotationPoint(0F, 0F, 0F);

		bodyModel[66].addShapeBox(-127F, -33F, -11F, 14, 3, 4, 0F,0F, .5F, -5F, 0F, .5F, 0F, 0F, 0F, 2F, 0F, 0F, 5F, 0F, -2F, -7F, 0F, -1F, -2F, 0F, 1F, 2F, 0F, -1F, 5F); // Box 9
		bodyModel[66].setRotationPoint(0F, 0F, 0F);

		bodyModel[67].addShapeBox(-127F, -36F, -11F, 14, 3, 4, 0F,0F, -.5F, -5F, 0F, 1F, 0F, 0F, 1F, 2F, 0F, 0F, 5F, 0F, -.5F, -5F, 0F, -.5F, 0F, 0F, -1F, 2F, 0F, 0F, 5F); // Box 10
		bodyModel[67].setRotationPoint(0F, 0F, 0F);

		bodyModel[68].addShapeBox(-127F, -41F, -11F, 14, 5, 4, 0F,0F, -3.5F, -7F, 0F, -.5F, -2.5F, 0F, 1F, 2F, 0F, -3F, 5F, 0F, .5F, -5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 5F); // Box 11
		bodyModel[68].setRotationPoint(0F, 0F, 0F);

		bodyModel[69].addShapeBox(-140F, -33F, -3F, 13, 2, 1, 0F,0F, 0F, -2.5F, 0F, .5F, 3F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, -2F, -2.5F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, -2F, 1.5F); // Box 12
		bodyModel[69].setRotationPoint(0F, 0F, 0F);

		bodyModel[70].addShapeBox(-140F, -38F, -3F, 13, 2, 1, 0F,0F, -4F, -2.5F, 0F, -.5F, 1F, 0F, 0F, 0F, 0F, -4F, 1.5F, 0F, 2F, -2.5F, 0F, .5F, 3F, 0F, 0F, 0F, 0F, 2F, 1.5F); // Box 13
		bodyModel[70].setRotationPoint(0F, 0F, 0F);

		bodyModel[71].addShapeBox(-140F, -36F, -3F, 13, 3, 1, 0F,0F, -2F, -2.5F, 0F, -.5F, 3F, 0F, 0F, 0F, 0F, -2F, 1.5F, 0F, 0F, -2.5F, 0F, -.5F, 3F, 0F, 0F, 0F, 0F, 0F, 1.5F); // Box 14
		bodyModel[71].setRotationPoint(0F, 0F, 0F);

		bodyModel[72].addShapeBox(-93F, -33F, -10F, 23, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[72].setRotationPoint(0F, 0F, 0F);

		bodyModel[73].addShapeBox(-42F, -46F, 0F, 48, 5, 10, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[73].setRotationPoint(0F, 0F, 0F);

		bodyModel[74].addShapeBox(-70F, -33F, 0F, 28, 5, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F); // Box 18
		bodyModel[74].setRotationPoint(0F, 0F, 0F);

		bodyModel[75].addShapeBox(-93F, -33F, 0F, 23, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[75].setRotationPoint(0F, 0F, 0F);

		bodyModel[76].addShapeBox(-113F, -33F, 0F, 20, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F); // Box 20
		bodyModel[76].setRotationPoint(0F, 0F, 0F);

		bodyModel[77].addShapeBox(-113F, -41F, 0F, 20, 8, 10, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 21
		bodyModel[77].setRotationPoint(0F, 0F, 0F);

		bodyModel[78].addShapeBox(-113F, -46F, 0F, 20, 5, 10, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -5F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -5F); // Box 22
		bodyModel[78].setRotationPoint(0F, 0F, 0F);

		bodyModel[79].addShapeBox(-127F, -42F, 0F, 14, 3, 5, 0F,0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -3F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -3F); // Box 23
		bodyModel[79].setRotationPoint(0F, 0F, 0F);

		bodyModel[80].addShapeBox(-127F, -39F, 0F, 14, 6, 5, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 24
		bodyModel[80].setRotationPoint(0F, 0F, 0F);

		bodyModel[81].addShapeBox(-127F, -33F, 0F, 14, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F); // Box 25
		bodyModel[81].setRotationPoint(0F, 0F, 0F);

		bodyModel[82].addShapeBox(-140F, -33F, 0F, 13, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -.5F, 0F, -2F, 0F, 0F, .5F, 0F, 0F, 0F, 1F, 0F, -2F, -.5F); // Box 26
		bodyModel[82].setRotationPoint(0F, 0F, 0F);

		bodyModel[83].addShapeBox(-140F, -36F, 0F, 13, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -.5F); // Box 27
		bodyModel[83].setRotationPoint(0F, 0F, 0F);

		bodyModel[84].addShapeBox(-140F, -38F, 0F, 13, 2, 1, 0F,0F, -4F, 0F, 0F, .5F, 0F, 0F, 0F, 1F, 0F, -4F, -.5F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 2F, -.5F); // Box 28
		bodyModel[84].setRotationPoint(0F, 0F, 0F);

		bodyModel[85].addShapeBox(-70F, -33F, 18F, 28, 5, 9, 0F,0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -6F); // Box 29
		bodyModel[85].setRotationPoint(0F, 0F, 0F);

		bodyModel[86].addShapeBox(-70F, -38F, 18F, 28, 5, 9, 0F,0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 30
		bodyModel[86].setRotationPoint(0F, 0F, 0F);

		bodyModel[87].addShapeBox(-93F, -38F, 14F, 23, 5, 9, 0F,0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 33
		bodyModel[87].setRotationPoint(0F, 0F, 0F);

		bodyModel[88].addShapeBox(-93F, -33F, 14F, 23, 5, 9, 0F,0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -8F); // Box 34
		bodyModel[88].setRotationPoint(0F, 0F, 0F);

		bodyModel[89].addShapeBox(-113F, -33F, 10F, 20, 5, 7, 0F,0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -6F, 0F, -1F, 5F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -3F, -8F); // Box 35
		bodyModel[89].setRotationPoint(0F, 0F, 0F);

		bodyModel[90].addShapeBox(-113F, -38F, 10F, 20, 5, 7, 0F,0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -6F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -6F); // Box 36
		bodyModel[90].setRotationPoint(0F, 0F, 0F);

		bodyModel[91].addShapeBox(-113F, -45F, 10F, 20, 7, 7, 0F,0F, -3F, 5F, 0F, 1F, 0F, 0F, -2.5F, -2F, 0F, -4.5F, -8.5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -6F); // Box 37
		bodyModel[91].setRotationPoint(0F, 0F, 0F);

		bodyModel[92].addShapeBox(-127F, -41F, 7F, 14, 5, 4, 0F,0F, -3F, 5F, 0F, 1F, 2F, 0F, -.5F, -2.5F, 0F, -3.5F, -7F, 0F, 0F, 5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, .5F, -5F); // Box 38
		bodyModel[92].setRotationPoint(0F, 0F, 0F);

		bodyModel[93].addShapeBox(-127F, -36F, 7F, 14, 3, 4, 0F,0F, 0F, 5F, 0F, 1F, 2F, 0F, 1F, 0F, 0F, -.5F, -5F, 0F, 0F, 5F, 0F, -1F, 2F, 0F, -.5F, 0F, 0F, -.5F, -5F); // Box 39
		bodyModel[93].setRotationPoint(0F, 0F, 0F);

		bodyModel[94].addShapeBox(-127F, -33F, 7F, 14, 3, 4, 0F,0F, 0F, 5F, 0F, 0F, 2F, 0F, .5F, 0F, 0F, .5F, -5F, 0F, -1F, 5F, 0F, 1F, 2F, 0F, -1F, -2F, 0F, -2F, -7F); // Box 40
		bodyModel[94].setRotationPoint(0F, 0F, 0F);

		bodyModel[95].addShapeBox(-140F, -33F, 2F, 13, 2, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 0F, 0F, .5F, 3F, 0F, 0F, -2.5F, 0F, -2F, 1.5F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -2F, -2.5F); // Box 41
		bodyModel[95].setRotationPoint(0F, 0F, 0F);

		bodyModel[96].addShapeBox(-140F, -36F, 2F, 13, 3, 1, 0F,0F, -2F, 1.5F, 0F, 0F, 0F, 0F, -.5F, 3F, 0F, -2F, -2.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, -.5F, 3F, 0F, 0F, -2.5F); // Box 42
		bodyModel[96].setRotationPoint(0F, 0F, 0F);

		bodyModel[97].addShapeBox(-140F, -38F, 2F, 13, 2, 1, 0F,0F, -4F, 1.5F, 0F, 0F, 0F, 0F, -.5F, 1F, 0F, -4F, -2.5F, 0F, 2F, 1.5F, 0F, 0F, 0F, 0F, .5F, 3F, 0F, 2F, -2.5F); // Box 43
		bodyModel[97].setRotationPoint(0F, 0F, 0F);

		bodyModel[98].addShapeBox(-42F, -33F, 18F, 34, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F); // Box 45
		bodyModel[98].setRotationPoint(0F, 0F, 0F);

		bodyModel[99].addShapeBox(-42F, -38F, 18F, 48, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[99].setRotationPoint(0F, 0F, 0F);

		bodyModel[100].addShapeBox(-70F, -41F, 10F, 28, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F); // Box 49
		bodyModel[100].setRotationPoint(0F, 0F, 0F);

		bodyModel[101].addShapeBox(-93F, -41F, 9F, 23, 8, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F, 0F); // Box 50
		bodyModel[101].setRotationPoint(0F, 0F, 0F);

		bodyModel[102].addShapeBox(-93F, -46F, 9F, 23, 5, 1, 0F,0F, 0F, -1F, 0F, 2F, -1F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F, 0F); // Box 51
		bodyModel[102].setRotationPoint(0F, 0F, 0F);

		bodyModel[103].addShapeBox(-8F, -33F, 18F, 14, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F); // Box 53
		bodyModel[103].setRotationPoint(0F, 0F, 0F);

		bodyModel[104].addShapeBox(-93F, -33F, 9F, 23, 5, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F, 0F); // Box 54
		bodyModel[104].setRotationPoint(0F, 0F, 0F);

		bodyModel[105].addShapeBox(-42F, -54F, -9F, 48, 8, 5, 0F,-1.5F, -4F, -1F, 0F, -8F, -2F, 0F, -7.5F, 0F, -2.5F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, -2F, 0F); // Box 56
		bodyModel[105].setRotationPoint(0F, 0F, 0F);

		bodyModel[106].addShapeBox(6F, -47F, -4F, 135, 2, 4, 0F,0F, -.5F, 0F, 0F, -3.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[106].setRotationPoint(0F, 0F, 0F);

		bodyModel[107].addShapeBox(141F, -45F, -4F, 11, 2, 4, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[107].setRotationPoint(0F, 0F, 0F);

		bodyModel[108].addShapeBox(152F, -45F, -4F, 5, 3, 4, 0F,0F, -1.5F, 0F, -1F, -2F, -3F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -.5F, -3F, 0F, 0F, 0F, 0F, 1.5F, 0F); // Box 1
		bodyModel[108].setRotationPoint(0F, 0F, 0F);

		bodyModel[109].addShapeBox(6F, -46F, -8F, 135, 2, 4, 0F,0F, 0F, -1F, 0F, -3F, -2.5F, 0F, -2.5F, 0F, 0F, .5F, 0F, 0F, -1F, 0F, 0F, 2F, -2F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[109].setRotationPoint(0F, 0F, 0F);

		bodyModel[110].addShapeBox(141F, -44F, -6F, 11, 2, 2, 0F,0F, -1F, -.5F, 0F, -.5F, -2F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[110].setRotationPoint(0F, 0F, 0F);

		bodyModel[111].addShapeBox(152F, -45F, 0F, 5, 3, 4, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -2F, -3F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, -1F, -.5F, -3F, 0F, 0F, 0F); // Box 5
		bodyModel[111].setRotationPoint(0F, 0F, 0F);

		bodyModel[112].addShapeBox(141F, -45F, 0F, 11, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 6
		bodyModel[112].setRotationPoint(0F, 0F, 0F);

		bodyModel[113].addShapeBox(6F, -47F, 0F, 135, 2, 4, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -3.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[113].setRotationPoint(0F, 0F, 0F);

		bodyModel[114].addShapeBox(-42F, -54F, 0F, 48, 8, 4, 0F,-3F, -1F, 0F, 0F, -7F, 0F, 0F, -7.5F, 0F, -2.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F); // Box 8
		bodyModel[114].setRotationPoint(0F, 0F, 0F);

		bodyModel[115].addShapeBox(6F, -46F, 4F, 135, 2, 4, 0F,0F, .5F, 0F, 0F, -2.5F, 0F, 0F, -3F, -2.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -2F, 0F, -1F, 0F); // Box 10
		bodyModel[115].setRotationPoint(0F, 0F, 0F);

		bodyModel[116].addShapeBox(141F, -44F, 4F, 11, 2, 2, 0F,0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, -2F, 0F, -1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 11
		bodyModel[116].setRotationPoint(0F, 0F, 0F);

		bodyModel[117].addShapeBox(-70F, -48F, 8F, 28, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[117].setRotationPoint(0F, 0F, 0F);

		bodyModel[118].addShapeBox(-70F, -48F, -10F, 28, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[118].setRotationPoint(0F, 0F, 0F);

		bodyModel[119].addShapeBox(-93F, -46F, -10F, 23, 5, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F); // Box 4
		bodyModel[119].setRotationPoint(0F, 0F, 0F);

		bodyModel[120].addShapeBox(-93F, -41F, 8F, 51, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[120].setRotationPoint(0F, 0F, 0F);

		bodyModel[121].addShapeBox(-93F, -41F, -10F, 51, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[121].setRotationPoint(0F, 0F, 0F);

		bodyModel[122].addShapeBox(-93F, -46F, 8F, 23, 5, 2, 0F,0F, 0F, 4F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[122].setRotationPoint(0F, 0F, 0F);

		bodyModel[123].addShapeBox(-93F, -47F, -5F, 2, 1, 10, 0F,-2F, .7F, -2F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, .7F, -2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F); // Box 1
		bodyModel[123].setRotationPoint(0F, 0F, 0F);

		bodyModel[124].addShapeBox(-70F, -50F, 8F, 28, 2, 1, 0F,0F, 0F, 1F, 1.5F, 0F, 1F, 1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[124].setRotationPoint(0F, 0F, 0F);

		bodyModel[125].addShapeBox(-42F, -54F, 4F, 48, 8, 5, 0F,-2.5F, -2F, 0F, 0F, -7.5F, 0F, 0F, -8F, -2F, -1.5F, -4F, -1F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, -2F, 0F); // Box 4
		bodyModel[125].setRotationPoint(0F, 0F, 0F);

		bodyModel[126].addShapeBox(-91F, -50F, -9F, 21, 2, 1, 0F,-1F, -3F, 4F, 0F, 0F, 1F, 0F, 0F, -1F, -1F, -3F, -4F, 0F, 2F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -3F); // Box 0
		bodyModel[126].setRotationPoint(0F, 0F, 17F);

		bodyModel[127].addShapeBox(-47F, -52F, -8F, 6, 2, 1, 0F,0F, 1.5F, -3F, 1.5F, 0F, -4F, 1.5F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[127].setRotationPoint(0F, 0F, 0F);

		bodyModel[128].addShapeBox(-47F, -54F, -4F, 7, 2, 1, 0F,0F, 1.5F, -3F, 1F, -1F, -4F, 1F, -2F, 3F, 0F, -2F, 2F, 0F, -1.5F, 1F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, -1F); // Box 2
		bodyModel[128].setRotationPoint(0F, 0F, 0F);

		bodyModel[129].addShapeBox(-73F, -52F, -7.85F, 2, 2, 1, 0F,1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 1F, 1F, 0F, 1F, 0F, .45F, -.3F, 0F, .15F, 0F, 0F, .15F, 0F, 0F, .45F, .3F); // Box 6
		bodyModel[129].setRotationPoint(0F, 0F, 0F);

		bodyModel[130].addShapeBox(-74F, -54F, -6.85F, 2, 2, 1, 0F,.7F, 0F, -2F, -.7F, 0F, -2F, -.7F, 0F, 2F, .7F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[130].setRotationPoint(0F, 0F, 0F);

		bodyModel[131].addShapeBox(-74.7F, -55F, -4.85F, 2, 1, 5, 0F,.3F, 0F, -2F, -.5F, .5F, -2F, -.5F, .5F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 10
		bodyModel[131].setRotationPoint(0F, 0F, 0F);

		bodyModel[132].addShapeBox(-73F, -52F, 6.85F, 2, 2, 1, 0F,1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, 1F, 0F, -1F, 0F, .45F, .3F, 0F, .15F, 0F, 0F, .15F, 0F, 0F, .45F, -.3F); // Box 15
		bodyModel[132].setRotationPoint(0F, 0F, 0F);

		bodyModel[133].addShapeBox(-74F, -54F, 5.85F, 2, 2, 1, 0F,.7F, 0F, 2F, -.7F, 0F, 2F, -.7F, 0F, -2F, .7F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[133].setRotationPoint(0F, 0F, 0F);

		bodyModel[134].addShapeBox(-74.7F, -55F, -0.15F, 2, 1, 5, 0F,.3F, 0F, 0F, -.5F, .5F, 0F, -.5F, .5F, -2F, .3F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[134].setRotationPoint(0F, 0F, 0F);

		bodyModel[135].addShapeBox(-75F, -56F, -3F, 2, 1, 6, 0F,.1F, -.7F, -2F, -.35F, -.2F, -2F, -.35F, -.3F, -2F, .1F, -.7F, -2F, 0F, 0F, -.1F, -.2F, -.5F, -.1F, -.2F, -.5F, -.1F, 0F, 0F, -.1F); // Box 18
		bodyModel[135].setRotationPoint(0F, 0F, 0F);

		bodyModel[136].addShapeBox(-47F, -54F, -1F, 7, 2, 2, 0F,0F, 1.5F, 0F, 1F, -1F, -1F, 1F, -1F, -1F, 0F, 1.5F, 0F, 0F, 0F, 0F, .5F, 0F, -1F, .5F, 0F, -1F, 0F, 0F, 0F); // Box 20
		bodyModel[136].setRotationPoint(0F, 0F, 0F);

		bodyModel[137].addShapeBox(-47F, -54F, 3F, 7, 2, 1, 0F,0F, -2F, 2F, 1F, -2F, 3F, 1F, -1F, -4F, 0F, 1.5F, -3F, 0F, 0F, -1F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, -1.5F, 1F); // Box 22
		bodyModel[137].setRotationPoint(0F, 0F, 0F);

		bodyModel[138].addShapeBox(-47F, -52F, 7F, 6, 2, 1, 0F,0F, 0F, 3F, 1.5F, 0F, 4F, 1.5F, 0F, -4F, 0F, 1.5F, -3F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[138].setRotationPoint(0F, 0F, 0F);

		bodyModel[139].addShapeBox(-66F, -44F, -27F, 10, 10, 13, 0F,-12F, -4F, 0F, 3F, -3.5F, .1F, 0F, 0F, 0F, 2F, -4F, 0F, -12F, -5.5F, 0F, 3F, -5F, .1F, 0F, 0F, 0F, 2F, -5F, 0F); // Box 21
		bodyModel[139].setRotationPoint(0F, 0F, 0F);

		bodyModel[140].addShapeBox(-56F, -44F, -27F, 9, 10, 13, 0F,-3F, -3.5F, .1F, 0F, -2.5F, .1F, 0F, 1.5F, 0F, 0F, 0F, 0F, -3F, -5F, .1F, 0F, -3.5F, .1F, 0F, 3.5F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[140].setRotationPoint(0F, 0F, 0F);

		bodyModel[141].addShapeBox(-47F, -45F, -27F, 13, 12, 13, 0F,0F, -3.5F, .1F, 0F, -3F, .1F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -4.5F, .1F, 0F, -3F, .1F, 0F, 1.5F, 0F, 0F, .5F, 0F); // Box 23
		bodyModel[141].setRotationPoint(0F, 0F, 0F);

		bodyModel[142].addShapeBox(-34F, -44F, -27F, 10, 12, 13, 0F,0F, -2F, .1F, 0F, -2.5F, .1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -4F, .1F, 0F, -3.5F, .1F, 0F, 0F, 0F, 0F, .5F, 0F); // Box 24
		bodyModel[142].setRotationPoint(0F, 0F, 0F);

		bodyModel[143].addShapeBox(-1F, -40F, -27F, 3, 2, 13, 0F,1F, -.3F, .1F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 1.5F, .1F, 1F, 0F, .1F, -2F, -1F, 0F, 0F, -1F, 0F, .5F, 0F, .1F); // Box 25
		bodyModel[143].setRotationPoint(0F, 0F, 0F);

		bodyModel[144].addShapeBox(-9F, -43F, -27F, 8, 7, 13, 0F,0F, -2.5F, .1F, -1F, -3.3F, .1F, 0F, -1.5F, 0F, 0F, -.5F, 0F, 0F, -1F, .1F, -1F, -2F, .1F, 0F, -.5F, 0F, 0F, 1F, 0F); // Box 26
		bodyModel[144].setRotationPoint(0F, 0F, 0F);

		bodyModel[145].addShapeBox(-24F, -44F, -27F, 15, 9, 13, 0F,0F, -2.5F, .1F, 0F, -3.5F, .1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -.5F, .1F, 0F, -2F, .1F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 27
		bodyModel[145].setRotationPoint(0F, 0F, 0F);

		bodyModel[146].addShapeBox(-93F, -45F, 14F, 23, 7, 9, 0F,0F, 1F, 4F, 0F, 1F, 0F, 0F, -3F, -3F, 0F, -2.5F, -8F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 29
		bodyModel[146].setRotationPoint(0F, 0F, 0F);

		bodyModel[147].addShapeBox(-70F, -45F, -27F, 28, 7, 9, 0F,0F, -3F, -7F, 0F, -3F, -5F, 0F, 0F, 2F, 0F, 1F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F); // Box 31
		bodyModel[147].setRotationPoint(0F, 0F, 0F);

		bodyModel[148].addShapeBox(-42F, -45F, -27F, 48, 7, 9, 0F,0F, -3F, -5F, 0F, -4F, -3F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[148].setRotationPoint(0F, 0F, 0F);

		bodyModel[149].addShapeBox(-42F, -45F, 18F, 48, 7, 9, 0F,0F, 0F, 2F, 0F, -1F, 0F, 0F, -4F, -3F, 0F, -3F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[149].setRotationPoint(0F, 0F, 0F);

		bodyModel[150].addShapeBox(-42F, -46F, 10F, 48, 5, 8, 0F,0F, 2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[150].setRotationPoint(0F, 0F, 0F);

		bodyModel[151].addShapeBox(-70F, -48F, 10F, 28, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F); // Box 2
		bodyModel[151].setRotationPoint(0F, 0F, 0F);

		bodyModel[152].addShapeBox(-70F, -45F, 18F, 28, 7, 9, 0F,0F, 1F, 4F, 0F, 0F, 2F, 0F, -3F, -5F, 0F, -3F, -7F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 3
		bodyModel[152].setRotationPoint(0F, 0F, 0F);

		bodyModel[153].addShapeBox(152F, -38F, -18F, 5, 20, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[153].setRotationPoint(0F, 0F, 0F);

		bodyModel[154].addShapeBox(152F, -46F, -18F, 5, 5, 18, 0F,0F, -5F, 0F, 0F, -6.5F, 0F, 0F, -7F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 2
		bodyModel[154].setRotationPoint(0F, 0F, 0F);

		bodyModel[155].addShapeBox(152F, -44F, -27F, 5, 6, 9, 0F,0F, -5F, -3F, 0F, -6F, -5F, 0F, -4.5F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, -2F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 3
		bodyModel[155].setRotationPoint(0F, 0F, 0F);

		bodyModel[156].addShapeBox(152F, -35F, -27F, 5, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[156].setRotationPoint(0F, 0F, 0F);

		bodyModel[157].addShapeBox(152F, -18F, -18F, 5, 5, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[157].setRotationPoint(0F, 0F, 0F);

		bodyModel[158].addShapeBox(152F, -18F, -27F, 5, 8, 9, 0F,0F, 3F, 0F, 0F, 3F, -1F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -6F, -4F, 0F, -7F, -4F, 0F, -4F, 0F, 0F, -3F, 0F); // Box 10
		bodyModel[158].setRotationPoint(0F, 0F, 0F);

		bodyModel[159].addShapeBox(157F, -18F, -23F, 8, 3, 18, 0F,0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 44
		bodyModel[159].setRotationPoint(0F, 0F, 0F);

		bodyModel[160].addShapeBox(157F, -23.5F, -26F, 8, 5, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 45
		bodyModel[160].setRotationPoint(0F, 0F, 0F);

		bodyModel[161].addShapeBox(157F, -30.5F, -26F, 8, 7, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[161].setRotationPoint(0F, 0F, 0F);

		bodyModel[162].addShapeBox(157F, -35.5F, -26F, 8, 5, 24, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[162].setRotationPoint(0F, 0F, 0F);

		bodyModel[163].addShapeBox(157F, -39F, -23F, 8, 3, 18, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F); // Box 48
		bodyModel[163].setRotationPoint(0F, 0F, 0F);

		bodyModel[164].addShapeBox(165F, -39F, -23F, 13, 3, 18, 0F,0F, 0F, -6F, 0F, -3F, -6F, 0F, -3F, -6F, 0F, 0F, -6F, 0F, .5F, 0F, 0F, 2.5F, -1.5F, 0F, 2.5F, -1.5F, 0F, .5F, 0F); // Box 0
		bodyModel[164].setRotationPoint(0F, 0F, 0F);

		bodyModel[165].addShapeBox(165F, -35.5F, -26F, 13, 5, 11, 0F,0F, 0F, -3F, 0F, -2F, -4.5F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -6.5F, 0F, 0F, -7F); // Box 1
		bodyModel[165].setRotationPoint(0F, 0F, 0F);

		bodyModel[166].addShapeBox(165F, -30.5F, -26F, 13, 7, 6, 0F,0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -1.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -1.5F, 0F, 0F, -2F); // Box 2
		bodyModel[166].setRotationPoint(0F, 0F, 0F);

		bodyModel[167].addShapeBox(165F, -23.5F, -26F, 13, 5, 11, 0F,0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -6.5F, 0F, 0F, -7F, 0F, 0F, -3F, 0F, -2F, -4.5F, 0F, -2F, -3F, 0F, 0F, -3F); // Box 3
		bodyModel[167].setRotationPoint(0F, 0F, 0F);

		bodyModel[168].addShapeBox(165F, -18F, -23F, 13, 3, 18, 0F,0F, .5F, 0F, 0F, 2.5F, -1.5F, 0F, 2.5F, -1.5F, 0F, .5F, 0F, 0F, 0F, -6F, 0F, -3F, -6F, 0F, -3F, -6F, 0F, 0F, -6F); // Box 4
		bodyModel[168].setRotationPoint(0F, 0F, 0F);

		bodyModel[169].addShapeBox(152F, -30F, -27F, 5, 6, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[169].setRotationPoint(0F, 0F, 0F);

		bodyModel[170].addShapeBox(152F, -24F, -27F, 5, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[170].setRotationPoint(0F, 0F, 0F);

		bodyModel[171].addShapeBox(152F, -46F, 0F, 5, 5, 18, 0F,0F, -3F, 0F, 0F, -7F, 0F, 0F, -6.5F, 0F, 0F, -5F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 7
		bodyModel[171].setRotationPoint(0F, 0F, 0F);

		bodyModel[172].addShapeBox(152F, -44F, 18F, 5, 6, 9, 0F,0F, -3F, 0F, 0F, -4.5F, 0F, 0F, -6F, -5F, 0F, -5F, -3F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, -2F, 0F, 3F, 0F); // Box 8
		bodyModel[172].setRotationPoint(0F, 0F, 0F);

		bodyModel[173].addShapeBox(152F, -35F, 18F, 5, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[173].setRotationPoint(0F, 0F, 0F);

		bodyModel[174].addShapeBox(152F, -30F, 18F, 5, 6, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[174].setRotationPoint(0F, 0F, 0F);

		bodyModel[175].addShapeBox(152F, -24F, 18F, 5, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 11
		bodyModel[175].setRotationPoint(0F, 0F, 0F);

		bodyModel[176].addShapeBox(152F, -18F, 18F, 5, 8, 9, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, -1F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -7F, -4F, 0F, -6F, -4F); // Box 12
		bodyModel[176].setRotationPoint(0F, 0F, 0F);

		bodyModel[177].addShapeBox(152F, -38F, 0F, 5, 20, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[177].setRotationPoint(0F, 0F, 0F);

		bodyModel[178].addShapeBox(165F, -18F, 5F, 13, 3, 18, 0F,0F, .5F, 0F, 0F, 2.5F, -1.5F, 0F, 2.5F, -1.5F, 0F, .5F, 0F, 0F, 0F, -6F, 0F, -3F, -6F, 0F, -3F, -6F, 0F, 0F, -6F); // Box 15
		bodyModel[178].setRotationPoint(0F, 0F, 0F);

		bodyModel[179].addShapeBox(165F, -39F, 5F, 13, 3, 18, 0F,0F, 0F, -6F, 0F, -3F, -6F, 0F, -3F, -6F, 0F, 0F, -6F, 0F, .5F, 0F, 0F, 2.5F, -1.5F, 0F, 2.5F, -1.5F, 0F, .5F, 0F); // Box 19
		bodyModel[179].setRotationPoint(0F, 0F, 0F);

		bodyModel[180].addShapeBox(157F, -18F, 5F, 8, 3, 18, 0F,0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 20
		bodyModel[180].setRotationPoint(0F, 0F, 0F);

		bodyModel[181].addShapeBox(157F, -23.5F, 2F, 8, 5, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 21
		bodyModel[181].setRotationPoint(0F, 0F, 0F);

		bodyModel[182].addShapeBox(157F, -30.5F, 2F, 8, 7, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[182].setRotationPoint(0F, 0F, 0F);

		bodyModel[183].addShapeBox(157F, -35.5F, 2F, 8, 5, 24, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[183].setRotationPoint(0F, 0F, 0F);

		bodyModel[184].addShapeBox(157F, -39F, 5F, 8, 3, 18, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F); // Box 24
		bodyModel[184].setRotationPoint(0F, 0F, 0F);

		bodyModel[185].addBox(80F, -43.5F, -14F, 6, 2, 4, 0F); // Box 0
		bodyModel[185].setRotationPoint(0F, 0F, 0F);

		bodyModel[186].addShapeBox(77F, -43.5F, -14F, 3, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 1
		bodyModel[186].setRotationPoint(0F, 0F, 0F);

		bodyModel[187].addBox(80F, -43.5F, 9F, 6, 2, 4, 0F); // Box 2
		bodyModel[187].setRotationPoint(0F, 0F, 0F);

		bodyModel[188].addShapeBox(77F, -43.5F, 9F, 3, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 3
		bodyModel[188].setRotationPoint(0F, 0F, 0F);

		bodyModel[189].addBox(-53F, -49F, -8F, 9, 17, 16, 0F); // Box 0
		bodyModel[189].setRotationPoint(0F, 0F, 0F);

		bodyModel[190].addBox(-58F, -47F, -6F, 2, 13, 12, 0F); // Box 1
		bodyModel[190].setRotationPoint(0F, 0F, 0F);

		bodyModel[191].addBox(-70F, -35F, -6F, 12, 2, 12, 0F); // Box 2
		bodyModel[191].setRotationPoint(0F, 0F, 0F);

		bodyModel[192].addShapeBox(-59F, -47.5F, -5F, 1, 13, 10, 0F,-.5F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F); // Box 3
		bodyModel[192].setRotationPoint(0F, 0F, 0F);

		bodyModel[193].addShapeBox(-58F, -48F, -6F, 2, 1, 12, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[193].setRotationPoint(0F, 0F, 0F);

		bodyModel[194].addBox(-58F, -53F, -4.5F, 2, 5, 9, 0F); // Box 5
		bodyModel[194].setRotationPoint(0F, 0F, 0F);

		bodyModel[195].addShapeBox(-59F, -54F, -4.5F, 3, 1, 9, 0F,0F, .4F, -.5F, 0F, .4F, -.5F, 0F, .4F, -.5F, 0F, .4F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[195].setRotationPoint(0F, 0F, 0F);

		bodyModel[196].addBox(-59F, -50F, -5.5F, 3, 1, 1, 0F); // Box 7
		bodyModel[196].setRotationPoint(0F, 0F, 0F);

		bodyModel[197].addShapeBox(-60F, -50F, -5.5F, 1, 1, 1, 0F,0F, -.15F, -.15F, 0F, -.15F, -.15F, 0F, -.15F, -.15F, 0F, -.15F, -.15F, 0F, -.15F, -.15F, 0F, -.15F, -.15F, 0F, -.15F, -.15F, 0F, -.15F, -.15F); // Box 8
		bodyModel[197].setRotationPoint(0F, 0F, 0F);

		bodyModel[198].addBox(-59F, -50F, 4.5F, 3, 1, 1, 0F); // Box 9
		bodyModel[198].setRotationPoint(0F, 0F, 0F);

		bodyModel[199].addShapeBox(-60F, -50F, 4.5F, 1, 1, 1, 0F,0F, -.15F, -.15F, 0F, -.15F, -.15F, 0F, -.15F, -.15F, 0F, -.15F, -.15F, 0F, -.15F, -.15F, 0F, -.15F, -.15F, 0F, -.15F, -.15F, 0F, -.15F, -.15F); // Box 10
		bodyModel[199].setRotationPoint(0F, 0F, 0F);

		bodyModel[200].addShapeBox(-93F, -46F, -4F, 18, 6, 8, 0F,0F, 0F, 0F, 0F, 2F, 3F, 0F, 2F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F); // Box 1
		bodyModel[200].setRotationPoint(0F, 0F, 0F);

		bodyModel[201].addShapeBox(-75F, -47F, -6F, 2, 7, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[201].setRotationPoint(0F, 0F, 0F);

		bodyModel[202].addShapeBox(-77F, -49F, -6F, 4, 2, 12, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[202].setRotationPoint(0F, 0F, 0F);

		bodyModel[203].addShapeBox(-73.6F, -49.5F, -3F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[203].setRotationPoint(0F, 0F, 0F);

		bodyModel[204].addShapeBox(-73.6F, -51.5F, -7F, 1, 10, 10, 0F,0F, -3.2F, -3.2F, 0F, -3.2F, -3.2F, 0F, -3.2F, -3.2F, 0F, -3.2F, -3.2F, 0F, -3.2F, -3.2F, 0F, -3.2F, -3.2F, 0F, -3.2F, -3.2F, 0F, -3.2F, -3.2F); // Box 5
		bodyModel[204].setRotationPoint(0F, 0F, 0F);

		bodyModel[205].addShapeBox(-73.6F, -51.5F, -3F, 1, 10, 10, 0F,0F, -3.2F, -3.2F, 0F, -3.2F, -3.2F, 0F, -3.2F, -3.2F, 0F, -3.2F, -3.2F, 0F, -3.2F, -3.2F, 0F, -3.2F, -3.2F, 0F, -3.2F, -3.2F, 0F, -3.2F, -3.2F); // Box 6
		bodyModel[205].setRotationPoint(0F, 0F, 0F);

		bodyModel[206].addShapeBox(-85F, -49F, -6F, 8, 2, 12, 0F,0F, -1F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -3F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F); // Box 8
		bodyModel[206].setRotationPoint(0F, 0F, 0F);

		bodyModel[207].addShapeBox(-74.6F, -53F, -3F, 1, 4, 1, 0F,-.3F, .4F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, .4F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Box 11
		bodyModel[207].setRotationPoint(0F, 0F, 0F);

		bodyModel[208].addShapeBox(-75F, -53.7F, -3F, 1, 1, 6, 0F,-.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F); // Box 13
		bodyModel[208].setRotationPoint(0F, 0F, 0F);

		bodyModel[209].addShapeBox(-75.4F, -53F, -3F, 1, 4, 1, 0F,-.3F, 0F, -.3F, -.3F, .4F, -.3F, -.3F, .4F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Box 15
		bodyModel[209].setRotationPoint(0F, 0F, 0F);

		bodyModel[210].addShapeBox(-79.6F, -44F, -3F, 1, 7, 1, 0F,-.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F); // Box 18
		bodyModel[210].setRotationPoint(0F, 0F, 0F);
		bodyModel[210].rotateAngleZ = -0.12217305F;

		bodyModel[211].addShapeBox(-79.6F, -44F, 2F, 1, 7, 1, 0F,-.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F); // Box 19
		bodyModel[211].setRotationPoint(0F, 0F, 0F);
		bodyModel[211].rotateAngleZ = -0.12217305F;

		bodyModel[212].addShapeBox(-79.6F, -44.5F, -3F, 1, 1, 6, 0F,-.4F, -.4F, -.4F, -.4F, -.4F, -.4F, -.4F, -.4F, -.4F, -.4F, -.4F, -.4F, -.4F, -.4F, -.4F, -.4F, -.4F, -.4F, -.4F, -.4F, -.4F, -.4F, -.4F, -.4F); // Box 20
		bodyModel[212].setRotationPoint(0F, 0F, 0F);
		bodyModel[212].rotateAngleZ = -0.12217305F;

		bodyModel[213].addShapeBox(-74.6F, -53F, 2F, 1, 4, 1, 0F,-.3F, .4F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, .4F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Box 21
		bodyModel[213].setRotationPoint(0F, 0F, 0F);

		bodyModel[214].addShapeBox(-75.4F, -53F, 2F, 1, 4, 1, 0F,-.3F, 0F, -.3F, -.3F, .4F, -.3F, -.3F, .4F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Box 22
		bodyModel[214].setRotationPoint(0F, 0F, 0F);

		bodyModel[215].addShapeBox(-75F, -54.4F, -3F, 1, 1, 6, 0F,-1.9F, -.3F, -.3F, 1F, -.3F, -.3F, 1F, -.3F, -.3F, -1.9F, -.3F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Box 23
		bodyModel[215].setRotationPoint(0F, 0F, 0F);

		bodyModel[216].addShapeBox(-66F, -44F, 14F, 10, 10, 13, 0F,2F, -4F, 0F, 0F, 0F, 0F, 3F, -3.5F, .1F, -12F, -4F, 0F, 2F, -5F, 0F, 0F, 0F, 0F, 3F, -5F, .1F, -12F, -5.5F, 0F); // Box 0
		bodyModel[216].setRotationPoint(0F, 0F, 0F);

		bodyModel[217].addShapeBox(-56F, -44F, 14F, 9, 10, 13, 0F,0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -2.5F, .1F, -3F, -3.5F, .1F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, -3.5F, .1F, -3F, -5F, .1F); // Box 1
		bodyModel[217].setRotationPoint(0F, 0F, 0F);

		bodyModel[218].addShapeBox(-47F, -45F, 14F, 13, 12, 13, 0F,0F, .5F, 0F, 0F, 0F, 0F, 0F, -3F, .1F, 0F, -3.5F, .1F, 0F, .5F, 0F, 0F, 1.5F, 0F, 0F, -3F, .1F, 0F, -4.5F, .1F); // Box 2
		bodyModel[218].setRotationPoint(0F, 0F, 0F);

		bodyModel[219].addShapeBox(-34F, -44F, 14F, 10, 12, 13, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, -2.5F, .1F, 0F, -2F, .1F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, -3.5F, .1F, 0F, -4F, .1F); // Box 3
		bodyModel[219].setRotationPoint(0F, 0F, 0F);

		bodyModel[220].addShapeBox(-24F, -44F, 14F, 15, 9, 13, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -3.5F, .1F, 0F, -2.5F, .1F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -2F, .1F, 0F, -.5F, .1F); // Box 4
		bodyModel[220].setRotationPoint(0F, 0F, 0F);

		bodyModel[221].addShapeBox(-9F, -43F, 14F, 8, 7, 13, 0F,0F, -.5F, 0F, 0F, -1.5F, 0F, -1F, -3.3F, .1F, 0F, -2.5F, .1F, 0F, 1F, 0F, 0F, -.5F, 0F, -1F, -2F, .1F, 0F, -1F, .1F); // Box 5
		bodyModel[221].setRotationPoint(0F, 0F, 0F);

		bodyModel[222].addShapeBox(-1F, -40F, 14F, 3, 2, 13, 0F,0F, 1.5F, .1F, 0F, -1F, 0F, -2F, -1F, 0F, 1F, -.3F, .1F, .5F, 0F, .1F, 0F, -1F, 0F, -2F, -1F, 0F, 1F, 0F, .1F); // Box 6
		bodyModel[222].setRotationPoint(0F, 0F, 0F);

		bodyModel[223].addShapeBox(0F, -16F, 0F, 9, 31, 1, 0F,0F, 0F, 5.4F, 1F, 0F, 4.3F, 1F, 0F, -5.3F, 0F, 0F, -4.5F, 0F, 0F, -3.4F, 3F, 0F, -4.5F, 3F, 0F, 3.5F, 0F, 0F, 4F); // Box 75
		bodyModel[223].setRotationPoint(171F, -48F, -55F);

		bodyModel[224].addShapeBox(177F, -29F, -34F, 6, 3, 1, 0F,0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -1.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -.5F); // Box 79
		bodyModel[224].setRotationPoint(0F, 0F, 0F);

		bodyModel[225].addShapeBox(183F, -29F, -34F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -.5F, 0F, -1.5F, -.5F, 0F, 0F, 0F); // Box 82
		bodyModel[225].setRotationPoint(0F, 0F, 0F);

		bodyModel[226].addShapeBox(154F, -28F, -51.5F, 18, 19, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -2.5F, -4.5F, 0F, -1.5F, -3.5F, 0F, 0F, .5F, 0F); // Box 83
		bodyModel[226].setRotationPoint(0F, 0F, 0F);

		bodyModel[227].addShapeBox(121F, -28F, -51.5F, 33, 13, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F); // Box 84
		bodyModel[227].setRotationPoint(0F, 0F, 0F);

		bodyModel[228].addShapeBox(132F, -15F, -51.5F, 22, 10, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -1F, 0F, 0F, -4.5F, 0F, 0F, -3.5F, 0F, -8F, 0F, 0F); // Box 85
		bodyModel[228].setRotationPoint(0F, 0F, 0F);

		bodyModel[229].addShapeBox(171F, -33F, -51.5F, 12, 1, 2, 0F,0F, 0F, .3F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F); // Box 86
		bodyModel[229].setRotationPoint(0F, 0F, 0F);

		bodyModel[230].addShapeBox(166F, -80F, -51.5F, 5, 48, 1, 0F,-.5F, -.7F, 13F, 0F, -1.5F, 13F, 0F, -1F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[230].setRotationPoint(0F, 0F, 0F);

		bodyModel[231].addShapeBox(123F, -80F, -51.5F, 43, 48, 1, 0F,-43.5F, -.7F, 13F, .5F, -.7F, 13F, 0F, 0F, -13F, -43F, 0F, -13F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[231].setRotationPoint(0.01F, 0.01F, 0.01F);

		bodyModel[232].addShapeBox(171F, -79F, -60.5F, 9, 15, 1, 0F,0F, -.5F, 4F, -1F, -2.2F, 3.5F, 0F, -1.7F, -4F, 0F, 0F, -4F, 0F, 0F, -.05F, -.5F, 0F, -.5F, 1F, 0F, .2F, 0F, 0F, .2F); // Box 89
		bodyModel[232].setRotationPoint(0F, 0F, 0F);

		bodyModel[233].addShapeBox(121F, -28F, -50.5F, 33, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F); // Box 91
		bodyModel[233].setRotationPoint(0F, 0F, 0F);

		bodyModel[234].addShapeBox(132F, -15F, -50.5F, 22, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -8F, 0F, 0F, 0F, -3.5F, 0F, 0F, -4.5F, 0F, -9F, -1F, 0F); // Box 92
		bodyModel[234].setRotationPoint(0F, 0F, 0F);

		bodyModel[235].addShapeBox(154F, -28F, -50.5F, 18, 19, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, -1.5F, -3.5F, 0F, -2.5F, -4.5F, 0F, 0F, -.5F, 0F); // Box 93
		bodyModel[235].setRotationPoint(0F, 0F, 0F);

		bodyModel[236].addShapeBox(121F, -28F, 49.5F, 33, 13, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F); // Box 94
		bodyModel[236].setRotationPoint(0F, 0F, 0F);

		bodyModel[237].addShapeBox(154F, -28F, 49.5F, 18, 19, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -2.5F, -4.5F, 0F, -1.5F, -3.5F, 0F, 0F, .5F, 0F); // Box 95
		bodyModel[237].setRotationPoint(0F, 0F, 0F);

		bodyModel[238].addShapeBox(132F, -15F, 49.5F, 22, 10, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -1F, 0F, 0F, -4.5F, 0F, 0F, -3.5F, 0F, -8F, 0F, 0F); // Box 96
		bodyModel[238].setRotationPoint(0F, 0F, 0F);

		bodyModel[239].addShapeBox(121F, -28F, 50.5F, 33, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F); // Box 97
		bodyModel[239].setRotationPoint(0F, 0F, 0F);

		bodyModel[240].addShapeBox(132F, -15F, 50.5F, 22, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -8F, 0F, 0F, 0F, -3.5F, 0F, 0F, -4.5F, 0F, -9F, -1F, 0F); // Box 98
		bodyModel[240].setRotationPoint(0F, 0F, 0F);

		bodyModel[241].addShapeBox(154F, -28F, 50.5F, 18, 19, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, -1.5F, -3.5F, 0F, -2.5F, -4.5F, 0F, 0F, -.5F, 0F); // Box 99
		bodyModel[241].setRotationPoint(0F, 0F, 0F);

		bodyModel[242].addShapeBox(123F, -80F, -50.5F, 43, 48, 1, 0F,-43F, 0F, 13F, 0F, 0F, 13F, .5F, 0F, -13F, -43.5F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 0
		bodyModel[242].setRotationPoint(0F, 0F, 0F);

		bodyModel[243].addShapeBox(166F, -80F, -50.5F, 5, 48, 1, 0F,0F, 0F, 13F, 0F, -1F, 13F, 0F, -1F, -13F, -.5F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[243].setRotationPoint(0F, 0F, 0F);

		bodyModel[244].addShapeBox(171F, -79F, -59.5F, 9, 15, 1, 0F,0F, 0F, 4F, 0F, -1.7F, 4F, -1F, -1.9F, -4.5F, 0F, 0F, -4F, 0F, 0F, -.2F, 1F, 0F, -.2F, -.5F, 0F, -.2F, 0F, 0F, .15F); // Box 2
		bodyModel[244].setRotationPoint(0F, 0F, 0F);

		bodyModel[245].addShapeBox(166F, -80F, 49.5F, 5, 48, 1, 0F,-.5F, 0F, -13F, 0F, -1F, -13F, 0F, -1F, 13F, 0F, 0F, 13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[245].setRotationPoint(0F, 0F, 0F);

		bodyModel[246].addShapeBox(123F, -80F, 50.5F, 43, 48, 1, 0F,-43F, 0F, -13F, 0F, 0F, -13F, .5F, -.7F, 13F, -43.5F, -.7F, 13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 6
		bodyModel[246].setRotationPoint(0F, 0F, 0F);

		bodyModel[247].addShapeBox(166F, -80F, 50.5F, 5, 48, 1, 0F,0F, 0F, -13F, 0F, -1F, -13F, 0F, -1.5F, 13F, -.5F, -.7F, 13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[247].setRotationPoint(0F, 0F, 0F);

		bodyModel[248].addShapeBox(171F, -79F, 59.5F, 9, 15, 1, 0F,0F, 0F, -4F, 0F, -1.7F, -4F, -1F, -2.2F, 3.5F, 0F, -.5F, 4F, 0F, 0F, .2F, 1F, 0F, .2F, -.5F, 0F, -.5F, 0F, 0F, -.05F); // Box 8
		bodyModel[248].setRotationPoint(0F, 0F, 0F);

		bodyModel[249].addShapeBox(171F, -79F, 58.5F, 9, 15, 1, 0F,0F, 0F, -4F, -1F, -1.9F, -4.5F, 0F, -1.7F, 4F, 0F, 0F, 4F, 0F, 0F, .15F, -.5F, 0F, -.2F, 1F, 0F, -.2F, 0F, 0F, -.2F); // Box 9
		bodyModel[249].setRotationPoint(0F, 0F, 0F);

		bodyModel[250].addShapeBox(123F, -80F, 49.5F, 43, 48, 1, 0F,-43.5F, 0F, -13F, .5F, 0F, -13F, 0F, 0F, 13F, -43F, 0F, 13F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[250].setRotationPoint(0.01F, 0.01F, 0.01F);

		bodyModel[251].addShapeBox(0F, -16F, -2F, 9, 31, 1, 0F,0F, 0F, -4.5F, 1F, 0F, -5.3F, 1F, 0F, 4.3F, 0F, 0F, 5.4F, 0F, 0F, 4F, 3F, 0F, 3.5F, 3F, 0F, -4.5F, 0F, 0F, -3.4F); // Box 11
		bodyModel[251].setRotationPoint(171F, -48F, 56F);

		bodyModel[252].addShapeBox(171F, -33F, 49.5F, 12, 1, 2, 0F,0F, 0F, -.3F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F); // Box 12
		bodyModel[252].setRotationPoint(0F, 0F, 0F);

		bodyModel[253].addShapeBox(165F, -35.5F, -13F, 13, 5, 11, 0F,0F, 0F, -3F, 0F, -2F, -3F, 0F, -2F, -4.5F, 0F, 0F, -3F, 0F, 0F, -7F, 0F, 1F, -6.5F, 0F, 1F, -2F, 0F, 0F, 0F); // Box 0
		bodyModel[253].setRotationPoint(0F, 0F, 0F);

		bodyModel[254].addShapeBox(165F, -23.5F, -13F, 13, 5, 11, 0F,0F, 0F, -7F, 0F, 1F, -6.5F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -2F, -4.5F, 0F, 0F, -3F); // Box 1
		bodyModel[254].setRotationPoint(0F, 0F, 0F);

		bodyModel[255].addShapeBox(165F, -30.5F, -8F, 13, 7, 6, 0F,0F, 0F, -2F, 0F, -1F, -1.5F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -1.5F, 0F, -1F, -2F, 0F, 0F, 0F); // Box 2
		bodyModel[255].setRotationPoint(0F, 0F, 0F);

		bodyModel[256].addShapeBox(165F, -35.5F, 2F, 13, 5, 11, 0F,0F, 0F, -3F, 0F, -2F, -4.5F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -6.5F, 0F, 0F, -7F); // Box 3
		bodyModel[256].setRotationPoint(0F, 0F, 0F);

		bodyModel[257].addShapeBox(165F, -30.5F, 2F, 13, 7, 6, 0F,0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -1.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -1.5F, 0F, 0F, -2F); // Box 4
		bodyModel[257].setRotationPoint(0F, 0F, 0F);

		bodyModel[258].addShapeBox(165F, -23.5F, 2F, 13, 5, 11, 0F,0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -6.5F, 0F, 0F, -7F, 0F, 0F, -3F, 0F, -2F, -4.5F, 0F, -2F, -3F, 0F, 0F, -3F); // Box 5
		bodyModel[258].setRotationPoint(0F, 0F, 0F);

		bodyModel[259].addShapeBox(165F, -23.5F, 15F, 13, 5, 11, 0F,0F, 0F, -7F, 0F, 1F, -6.5F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -2F, -4.5F, 0F, 0F, -3F); // Box 6
		bodyModel[259].setRotationPoint(0F, 0F, 0F);

		bodyModel[260].addShapeBox(165F, -30.5F, 20F, 13, 7, 6, 0F,0F, 0F, -2F, 0F, -1F, -1.5F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -1.5F, 0F, -1F, -2F, 0F, 0F, 0F); // Box 7
		bodyModel[260].setRotationPoint(0F, 0F, 0F);

		bodyModel[261].addShapeBox(165F, -35.5F, 15F, 13, 5, 11, 0F,0F, 0F, -3F, 0F, -2F, -3F, 0F, -2F, -4.5F, 0F, 0F, -3F, 0F, 0F, -7F, 0F, 1F, -6.5F, 0F, 1F, -2F, 0F, 0F, 0F); // Box 8
		bodyModel[261].setRotationPoint(0F, 0F, 0F);

		bodyModel[262].addShapeBox(177F, -29F, 34F, 6, 3, 1, 0F,0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -1.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -.5F); // Box 0
		bodyModel[262].setRotationPoint(0F, 0F, 0F);

		bodyModel[263].addShapeBox(183F, -29F, 34F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -.5F, 0F, -1.5F, -.5F, 0F, 0F, 0F); // Box 1
		bodyModel[263].setRotationPoint(0F, 0F, 0F);

		bodyModel[264].addShapeBox(-24F, -11F, 0F, 30, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F); // Box 2
		bodyModel[264].setRotationPoint(0F, 0F, 0F);

		bodyModel[265].addShapeBox(-24F, -11F, -6F, 30, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 3
		bodyModel[265].setRotationPoint(0F, 0F, 0F);

		bodyModel[266].addShapeBox(134F, -41F, 43F, 50, 0, 50, 0F,-15F, 0F, -15F, -15F, 0F, -15F, -15F, 0F, -15F, -15F, 0F, -15F, -15F, 0F, -15F, -15F, 0F, -15F, -15F, 0F, -15F, -15F, 0F, -15F); // Decal3
		bodyModel[266].setRotationPoint(0F, 0F, 0F);
		bodyModel[266].rotateAngleX = 1.85004901F;

		bodyModel[267].addShapeBox(134F, -41F, -93F, 50, 0, 50, 0F,-15F, 0F, -15F, -15F, 0F, -15F, -15F, 0F, -15F, -15F, 0F, -15F, -15F, 0F, -15F, -15F, 0F, -15F, -15F, 0F, -15F, -15F, 0F, -15F); // Decal4
		bodyModel[267].setRotationPoint(0F, 0F, 0F);
		bodyModel[267].rotateAngleX = -1.85004901F;

		bodyModel[268].addShapeBox(-141F, -34F, -0.5F, 1, 1, 1, 0F,0F, -.6F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.6F, -.5F, 0F, -.4F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, -.5F); // Box 0
		bodyModel[268].setRotationPoint(0F, 0F, 0F);

		bodyModel[269].addShapeBox(-113F, -46.1F, -8F, 20, 4, 8, 0F,0F, -4F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 2F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 0
		bodyModel[269].setRotationPoint(0F, 0F, 0F);

		bodyModel[270].addShapeBox(-127F, -42.1F, -5F, 14, 2, 5, 0F,0F, -4F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 3F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 2
		bodyModel[270].setRotationPoint(0F, 0F, 0F);

		bodyModel[271].addShapeBox(-127F, -42.1F, 0F, 14, 2, 5, 0F,0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, -3F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 3F, -3F); // Box 3
		bodyModel[271].setRotationPoint(0F, 0F, 0F);

		bodyModel[272].addShapeBox(-113F, -46.1F, 0F, 20, 4, 8, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, -5F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 2F, -5F); // Box 4
		bodyModel[272].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 472, 859, textureX, textureY); // Box 27
		leftWingModel[1] = new ModelRendererTurbo(this, 17, 859, textureX, textureY); // Box 28
		leftWingModel[2] = new ModelRendererTurbo(this, 17, 859, textureX, textureY); // Box 0
		leftWingModel[3] = new ModelRendererTurbo(this, 377, 746, textureX, textureY); // Box 1
		leftWingModel[4] = new ModelRendererTurbo(this, 377, 765, textureX, textureY); // Box 2
		leftWingModel[5] = new ModelRendererTurbo(this, 553, 717, textureX, textureY); // Box 6
		leftWingModel[6] = new ModelRendererTurbo(this, 273, 676, textureX, textureY); // Box 8
		leftWingModel[7] = new ModelRendererTurbo(this, 406, 677, textureX, textureY); // Box 9
		leftWingModel[8] = new ModelRendererTurbo(this, 17, 746, textureX, textureY); // Box 11
		leftWingModel[9] = new ModelRendererTurbo(this, 17, 746, textureX, textureY); // Box 12
		leftWingModel[10] = new ModelRendererTurbo(this, 17, 746, textureX, textureY); // Box 13
		leftWingModel[11] = new ModelRendererTurbo(this, 17, 746, textureX, textureY); // Box 14
		leftWingModel[12] = new ModelRendererTurbo(this, 17, 746, textureX, textureY); // Box 15
		leftWingModel[13] = new ModelRendererTurbo(this, 447, 751, textureX, textureY); // Box 16
		leftWingModel[14] = new ModelRendererTurbo(this, 442, 750, textureX, textureY); // Box 17
		leftWingModel[15] = new ModelRendererTurbo(this, 377, 788, textureX, textureY); // Box 18
		leftWingModel[16] = new ModelRendererTurbo(this, 273, 659, textureX, textureY); // Box 19
		leftWingModel[17] = new ModelRendererTurbo(this, 553, 655, textureX, textureY); // Box 20
		leftWingModel[18] = new ModelRendererTurbo(this, 553, 686, textureX, textureY); // Box 21
		leftWingModel[19] = new ModelRendererTurbo(this, 406, 657, textureX, textureY); // Box 22
		leftWingModel[20] = new ModelRendererTurbo(this, 453, 674, textureX, textureY); // Box 23
		leftWingModel[21] = new ModelRendererTurbo(this, 453, 677, textureX, textureY); // Box 25
		leftWingModel[22] = new ModelRendererTurbo(this, 553, 748, textureX, textureY); // Box 26
		leftWingModel[23] = new ModelRendererTurbo(this, 563, 307, textureX, textureY); // Decal1

		leftWingModel[0].addShapeBox(138F, -30F, -123F, 7, 2, 96, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 27
		leftWingModel[0].setRotationPoint(0F, 0F, 0F);

		leftWingModel[1].addShapeBox(34F, -30F, -123F, 104, 2, 96, 0F,-104F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -104F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 28
		leftWingModel[1].setRotationPoint(0F, 0F, 0F);

		leftWingModel[2].addShapeBox(15F, -30F, -123F, 123, 2, 96, 0F,-110F, 0F, 0F, 0F, 0F, 0F, -104F, 0F, 0F, 0F, 0F, 0F, -110F, -2F, 0F, 0F, 0F, 0F, -104F, 1.5F, 0F, 0F, -2F, 0F); // Box 0
		leftWingModel[2].setRotationPoint(0F, 0F, 0F);

		leftWingModel[3].addShapeBox(125F, -30F, -135F, 13, 2, 12, 0F,-15F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, -2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 1
		leftWingModel[3].setRotationPoint(0F, 0F, 0F);

		leftWingModel[4].addShapeBox(138F, -30F, -135F, 13, 2, 12, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		leftWingModel[4].setRotationPoint(0F, 0F, 0F);

		leftWingModel[5].addShapeBox(145F, -30F, -49F, 39, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F); // Box 6
		leftWingModel[5].setRotationPoint(0F, 0F, 0F);

		leftWingModel[6].addShapeBox(145F, -30F, -58F, 52, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.15F, 0F); // Box 8
		leftWingModel[6].setRotationPoint(0F, 0F, 0F);

		leftWingModel[7].addShapeBox(197F, -30F, -58F, 5, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 9
		leftWingModel[7].setRotationPoint(0F, 0F, 0F);

		leftWingModel[8].addShapeBox(34F, -32F, -123F, 104, 2, 96, 0F,-104F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, -104F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		leftWingModel[8].setRotationPoint(-0.01F, 0.01F, 0.02F);

		leftWingModel[9].addShapeBox(15F, -32F, -123F, 123, 2, 96, 0F,-110F, -2F, 0F, 0F, 0F, 0F, -104F, 1.5F, 0F, 0F, -2F, 0F, -110F, 0F, 0F, 0F, 0F, 0F, -104F, 0F, 0F, 0F, 0F, 0F); // Box 12
		leftWingModel[9].setRotationPoint(0F, 0F, 0F);

		leftWingModel[10].addShapeBox(125F, -32F, -135F, 13, 2, 12, 0F,-15F, -2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -15F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftWingModel[10].setRotationPoint(0F, 0F, 0F);

		leftWingModel[11].addShapeBox(138F, -32F, -135F, 13, 2, 12, 0F,-2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		leftWingModel[11].setRotationPoint(0F, 0F, 0F);

		leftWingModel[12].addShapeBox(138F, -32F, -123F, 7, 2, 96, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		leftWingModel[12].setRotationPoint(0F, 0F, 0F);

		leftWingModel[13].addShapeBox(145F, -32F, -123F, 2, 4, 37, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .55F, 0F); // Box 16
		leftWingModel[13].setRotationPoint(0F, 0F, 0F);

		leftWingModel[14].addShapeBox(147F, -32F, -91F, 10, 4, 5, 0F,0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F); // Box 17
		leftWingModel[14].setRotationPoint(0F, 0F, 0F);

		leftWingModel[15].addShapeBox(151F, -32F, -135F, 5, 2, 12, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 18
		leftWingModel[15].setRotationPoint(0F, 0F, 0F);

		leftWingModel[16].addShapeBox(145F, -32F, -58F, 52, 2, 9, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		leftWingModel[16].setRotationPoint(0F, 0F, 0F);

		leftWingModel[17].addShapeBox(145F, -32F, -49F, 39, 2, 22, 0F,0F, 1.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		leftWingModel[17].setRotationPoint(0F, 0F, 0F);

		leftWingModel[18].addShapeBox(184F, -32F, -49F, 13, 2, 16, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F); // Box 21
		leftWingModel[18].setRotationPoint(0F, 0F, 0F);

		leftWingModel[19].addShapeBox(197F, -32F, -58F, 5, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 22
		leftWingModel[19].setRotationPoint(0F, 0F, 0F);

		leftWingModel[20].addShapeBox(202F, -32F, -57F, 3, 2, 7, 0F,0F, 0F, -.5F, -.5F, 0F, -2F, -.5F, 0F, -2F, 0F, 0F, -.5F, 0F, 0F, 0F, .5F, 0F, -1.5F, .5F, 0F, -1.5F, 0F, 0F, 0F); // Box 23
		leftWingModel[20].setRotationPoint(0F, 0F, 0F);

		leftWingModel[21].addShapeBox(202F, -30F, -57F, 3, 2, 7, 0F,0F, 0F, 0F, .5F, 0F, -1.5F, .5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -2F, -.5F, 0F, -2F, 0F, 0F, -.5F); // Box 25
		leftWingModel[21].setRotationPoint(0F, 0F, 0F);

		leftWingModel[22].addShapeBox(184F, -30F, -49F, 13, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 6F); // Box 26
		leftWingModel[22].setRotationPoint(0F, 0F, 0F);

		leftWingModel[23].addShapeBox(106F, -33F, -123F, 50, 0, 50, 0F,-10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F); // Decal1
		leftWingModel[23].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 17, 859, textureX, textureY); // Box 47
		rightWingModel[1] = new ModelRendererTurbo(this, 17, 746, textureX, textureY); // Box 48
		rightWingModel[2] = new ModelRendererTurbo(this, 17, 746, textureX, textureY); // Box 49
		rightWingModel[3] = new ModelRendererTurbo(this, 17, 859, textureX, textureY); // Box 50
		rightWingModel[4] = new ModelRendererTurbo(this, 17, 746, textureX, textureY); // Box 51
		rightWingModel[5] = new ModelRendererTurbo(this, 472, 859, textureX, textureY); // Box 52
		rightWingModel[6] = new ModelRendererTurbo(this, 377, 788, textureX, textureY); // Box 58
		rightWingModel[7] = new ModelRendererTurbo(this, 447, 751, textureX, textureY); // Box 59
		rightWingModel[8] = new ModelRendererTurbo(this, 442, 750, textureX, textureY); // Box 60
		rightWingModel[9] = new ModelRendererTurbo(this, 553, 655, textureX, textureY); // Box 61
		rightWingModel[10] = new ModelRendererTurbo(this, 553, 686, textureX, textureY); // Box 62
		rightWingModel[11] = new ModelRendererTurbo(this, 553, 717, textureX, textureY); // Box 63
		rightWingModel[12] = new ModelRendererTurbo(this, 553, 748, textureX, textureY); // Box 64
		rightWingModel[13] = new ModelRendererTurbo(this, 273, 659, textureX, textureY); // Box 65
		rightWingModel[14] = new ModelRendererTurbo(this, 273, 676, textureX, textureY); // Box 66
		rightWingModel[15] = new ModelRendererTurbo(this, 406, 677, textureX, textureY); // Box 67
		rightWingModel[16] = new ModelRendererTurbo(this, 406, 657, textureX, textureY); // Box 68
		rightWingModel[17] = new ModelRendererTurbo(this, 453, 674, textureX, textureY); // Box 69
		rightWingModel[18] = new ModelRendererTurbo(this, 453, 677, textureX, textureY); // Box 70
		rightWingModel[19] = new ModelRendererTurbo(this, 17, 746, textureX, textureY); // Box 13
		rightWingModel[20] = new ModelRendererTurbo(this, 17, 746, textureX, textureY); // Box 14
		rightWingModel[21] = new ModelRendererTurbo(this, 377, 765, textureX, textureY); // Box 15
		rightWingModel[22] = new ModelRendererTurbo(this, 377, 746, textureX, textureY); // Box 16
		rightWingModel[23] = new ModelRendererTurbo(this, 563, 307, textureX, textureY); // Decal2

		rightWingModel[0].addShapeBox(15F, -30F, 27F, 123, 2, 96, 0F,0F, 0F, 0F, -104F, 0F, 0F, 0F, 0F, 0F, -110F, 0F, 0F, 0F, -2F, 0F, -104F, 1.5F, 0F, 0F, 0F, 0F, -110F, -2F, 0F); // Box 47
		rightWingModel[0].setRotationPoint(0F, 0F, 0F);

		rightWingModel[1].addShapeBox(15F, -32F, 27F, 123, 2, 96, 0F,0F, -2F, 0F, -104F, 1.5F, 0F, 0F, 0F, 0F, -110F, -2F, 0F, 0F, 0F, 0F, -104F, 0F, 0F, 0F, 0F, 0F, -110F, 0F, 0F); // Box 48
		rightWingModel[1].setRotationPoint(0F, 0F, 0F);

		rightWingModel[2].addShapeBox(34F, -32F, 27F, 104, 2, 96, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, -104F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -104F, 0F, 0F); // Box 49
		rightWingModel[2].setRotationPoint(0.01F, 0.01F, 0.01F);

		rightWingModel[3].addShapeBox(34F, -30F, 27F, 104, 2, 96, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -104F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, -104F, 0F, 0F); // Box 50
		rightWingModel[3].setRotationPoint(0F, 0F, 0F);

		rightWingModel[4].addShapeBox(138F, -32F, 27F, 7, 2, 96, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		rightWingModel[4].setRotationPoint(0F, 0F, 0F);

		rightWingModel[5].addShapeBox(138F, -30F, 27F, 7, 2, 96, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		rightWingModel[5].setRotationPoint(0F, 0F, 0F);

		rightWingModel[6].addShapeBox(151F, -32F, 123F, 5, 2, 12, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		rightWingModel[6].setRotationPoint(0F, 0F, 0F);

		rightWingModel[7].addShapeBox(145F, -32F, 86F, 2, 4, 37, 0F,0F, .55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		rightWingModel[7].setRotationPoint(0F, 0F, 0F);

		rightWingModel[8].addShapeBox(147F, -32F, 86F, 10, 4, 5, 0F,0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F); // Box 60
		rightWingModel[8].setRotationPoint(0F, 0F, 0F);

		rightWingModel[9].addShapeBox(145F, -32F, 27F, 39, 2, 22, 0F,0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		rightWingModel[9].setRotationPoint(0F, 0F, 0F);

		rightWingModel[10].addShapeBox(184F, -32F, 33F, 13, 2, 16, 0F,0F, 0F, 6F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		rightWingModel[10].setRotationPoint(0F, 0F, 0F);

		rightWingModel[11].addShapeBox(145F, -30F, 27F, 39, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.15F, 0F); // Box 63
		rightWingModel[11].setRotationPoint(0F, 0F, 0F);

		rightWingModel[12].addShapeBox(184F, -30F, 33F, 13, 2, 16, 0F,0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 64
		rightWingModel[12].setRotationPoint(0F, 0F, 0F);

		rightWingModel[13].addShapeBox(145F, -32F, 49F, 52, 2, 9, 0F,0F, 1.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		rightWingModel[13].setRotationPoint(0F, 0F, 0F);

		rightWingModel[14].addShapeBox(145F, -30F, 49F, 52, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 66
		rightWingModel[14].setRotationPoint(0F, 0F, 0F);

		rightWingModel[15].addShapeBox(197F, -30F, 49F, 5, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 67
		rightWingModel[15].setRotationPoint(0F, 0F, 0F);

		rightWingModel[16].addShapeBox(197F, -32F, 49F, 5, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 68
		rightWingModel[16].setRotationPoint(0F, 0F, 0F);

		rightWingModel[17].addShapeBox(202F, -32F, 50F, 3, 2, 7, 0F,0F, 0F, -.5F, -.5F, 0F, -2F, -.5F, 0F, -2F, 0F, 0F, -.5F, 0F, 0F, 0F, .5F, 0F, -1.5F, .5F, 0F, -1.5F, 0F, 0F, 0F); // Box 69
		rightWingModel[17].setRotationPoint(0F, 0F, 0F);

		rightWingModel[18].addShapeBox(202F, -30F, 50F, 3, 2, 7, 0F,0F, 0F, 0F, .5F, 0F, -1.5F, .5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -2F, -.5F, 0F, -2F, 0F, 0F, -.5F); // Box 70
		rightWingModel[18].setRotationPoint(0F, 0F, 0F);

		rightWingModel[19].addShapeBox(125F, -32F, 123F, 13, 2, 12, 0F,0F, -2F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, -15F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -15F, 0F, 0F); // Box 13
		rightWingModel[19].setRotationPoint(0F, 0F, 0F);

		rightWingModel[20].addShapeBox(138F, -32F, 123F, 13, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 14
		rightWingModel[20].setRotationPoint(0F, 0F, 0F);

		rightWingModel[21].addShapeBox(138F, -30F, 123F, 13, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F); // Box 15
		rightWingModel[21].setRotationPoint(0F, 0F, 0F);

		rightWingModel[22].addShapeBox(125F, -30F, 123F, 13, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -15F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, -15F, -2F, 0F); // Box 16
		rightWingModel[22].setRotationPoint(0F, 0F, 0F);

		rightWingModel[23].addShapeBox(106F, -33F, 71F, 50, 0, 50, 0F,-10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F); // Decal2
		rightWingModel[23].setRotationPoint(0F, 0F, 0F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 11, 714, textureX, textureY); // Box 0
		pitchFlapLeftModel[1] = new ModelRendererTurbo(this, 11, 714, textureX, textureY); // Box 5
		pitchFlapLeftModel[2] = new ModelRendererTurbo(this, 11, 714, textureX, textureY); // Box 6
		pitchFlapLeftModel[3] = new ModelRendererTurbo(this, 11, 714, textureX, textureY); // Box 7
		pitchFlapLeftModel[4] = new ModelRendererTurbo(this, 118, 671, textureX, textureY); // Box 8
		pitchFlapLeftModel[5] = new ModelRendererTurbo(this, 118, 671, textureX, textureY); // Box 9
		pitchFlapLeftModel[6] = new ModelRendererTurbo(this, 11, 714, textureX, textureY); // Box 13
		pitchFlapLeftModel[7] = new ModelRendererTurbo(this, 11, 714, textureX, textureY); // Box 17
		pitchFlapLeftModel[8] = new ModelRendererTurbo(this, 11, 714, textureX, textureY); // Box 19
		pitchFlapLeftModel[9] = new ModelRendererTurbo(this, 11, 671, textureX, textureY); // Box 0
		pitchFlapLeftModel[10] = new ModelRendererTurbo(this, 11, 671, textureX, textureY); // Box 1
		pitchFlapLeftModel[11] = new ModelRendererTurbo(this, 11, 671, textureX, textureY); // Box 2
		pitchFlapLeftModel[12] = new ModelRendererTurbo(this, 11, 671, textureX, textureY); // Box 3
		pitchFlapLeftModel[13] = new ModelRendererTurbo(this, 11, 671, textureX, textureY); // Box 4
		pitchFlapLeftModel[14] = new ModelRendererTurbo(this, 11, 671, textureX, textureY); // Box 5
		pitchFlapLeftModel[15] = new ModelRendererTurbo(this, 11, 671, textureX, textureY); // Box 6
		pitchFlapLeftModel[16] = new ModelRendererTurbo(this, 11, 714, textureX, textureY); // Box 0
		pitchFlapLeftModel[17] = new ModelRendererTurbo(this, 11, 671, textureX, textureY); // Box 1

		pitchFlapLeftModel[0].addShapeBox(-24F, 0F, -6F, 8, 1, 6, 0F,-8F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 0
		pitchFlapLeftModel[0].setRotationPoint(-30F, -39.5F, -27F);

		pitchFlapLeftModel[1].addShapeBox(-16F, -0.5F, -22F, 18, 1, 16, 0F,0F, .5F, -11F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -11F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		pitchFlapLeftModel[1].setRotationPoint(-30F, -39.5F, -27F);

		pitchFlapLeftModel[2].addShapeBox(2F, -0.5F, -33F, 19, 1, 27, 0F,0F, 1F, -11F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -11F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		pitchFlapLeftModel[2].setRotationPoint(-30F, -39.5F, -27F);

		pitchFlapLeftModel[3].addShapeBox(2F, 0F, -6F, 19, 1, 6, 0F,0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, .5F, 0F); // Box 7
		pitchFlapLeftModel[3].setRotationPoint(-30F, -39.5F, -27F);

		pitchFlapLeftModel[4].addShapeBox(27F, -0.5F, -6F, 3, 1, 6, 0F,0F, .5F, 0F, 0F, 0F, 0F, -1F, -.5F, 0F, 0F, -.3F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, -1F, -.5F, 0F, 0F, 0F, 0F); // Box 8
		pitchFlapLeftModel[4].setRotationPoint(-30F, -39.5F, -27F);

		pitchFlapLeftModel[5].addShapeBox(27F, -1F, -33F, 9, 1, 27, 0F,0F, 1.7F, 0F, 0F, 1.5F, 0F, -6F, -.5F, 0F, 0F, 0F, 0F, 0F, -2.2F, 0F, 0F, -2.5F, 0F, -6F, -.5F, 0F, 0F, 0F, 0F); // Box 9
		pitchFlapLeftModel[5].setRotationPoint(-30F, -39.5F, -27F);

		pitchFlapLeftModel[6].addShapeBox(-24F, -0.5F, -11F, 8, 1, 5, 0F,-8F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 13
		pitchFlapLeftModel[6].setRotationPoint(-30F, -39.5F, -27F);

		pitchFlapLeftModel[7].addShapeBox(21F, -0.5F, -33F, 6, 1, 27, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.7F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // Box 17
		pitchFlapLeftModel[7].setRotationPoint(-30F, -39.5F, -27F);

		pitchFlapLeftModel[8].addShapeBox(-16F, 0F, -6F, 18, 1, 6, 0F,0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F); // Box 19
		pitchFlapLeftModel[8].setRotationPoint(-30F, -39.5F, -27F);

		pitchFlapLeftModel[9].addShapeBox(2F, -1.5F, -33F, 19, 1, 27, 0F,0F, .5F, -11F, 0F, 1.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, -1F, -11F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		pitchFlapLeftModel[9].setRotationPoint(-30F, -39.5F, -27F);

		pitchFlapLeftModel[10].addShapeBox(21F, -1.5F, -33F, 6, 1, 27, 0F,0F, 1.2F, 0F, 0F, 1.2F, 0F, 0F, -.5F, 0F, 0F, -.2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		pitchFlapLeftModel[10].setRotationPoint(-30F, -39.5F, -27F);

		pitchFlapLeftModel[11].addShapeBox(2F, -1F, -6F, 19, 1, 6, 0F,0F, .5F, 0F, 0F, .3F, 0F, 0F, -.1F, 0F, 0F, .4F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		pitchFlapLeftModel[11].setRotationPoint(-30F, -39.5F, -27F);

		pitchFlapLeftModel[12].addShapeBox(-16F, -1F, -6F, 18, 1, 6, 0F,0F, .2F, 0F, 0F, .5F, 0F, 0F, .4F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		pitchFlapLeftModel[12].setRotationPoint(-30F, -39.5F, -27F);

		pitchFlapLeftModel[13].addShapeBox(-16F, -1.5F, -22F, 18, 1, 16, 0F,0F, -.3F, -11F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, -.5F, -11F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		pitchFlapLeftModel[13].setRotationPoint(-30F, -39.5F, -27F);

		pitchFlapLeftModel[14].addShapeBox(-24F, -1.5F, -11F, 8, 1, 5, 0F,-8F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -1F, 0F, -8F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		pitchFlapLeftModel[14].setRotationPoint(-30F, -39.5F, -27F);

		pitchFlapLeftModel[15].addShapeBox(-24F, -1F, -6F, 8, 1, 6, 0F,-8F, .2F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -8F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		pitchFlapLeftModel[15].setRotationPoint(-30F, -39.5F, -27F);

		pitchFlapLeftModel[16].addShapeBox(21F, 0F, -6F, 6, 1, 6, 0F,0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // Box 0
		pitchFlapLeftModel[16].setRotationPoint(-30F, -39.5F, -27F);

		pitchFlapLeftModel[17].addShapeBox(21F, -1F, -6F, 6, 1, 6, 0F,0F, .3F, 0F, 0F, 0F, 0F, 0F, -.8F, 0F, 0F, -.1F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		pitchFlapLeftModel[17].setRotationPoint(-30F, -39.5F, -27F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 11, 671, textureX, textureY); // Box 9
		pitchFlapRightModel[1] = new ModelRendererTurbo(this, 11, 671, textureX, textureY); // Box 10
		pitchFlapRightModel[2] = new ModelRendererTurbo(this, 11, 671, textureX, textureY); // Box 11
		pitchFlapRightModel[3] = new ModelRendererTurbo(this, 11, 671, textureX, textureY); // Box 12
		pitchFlapRightModel[4] = new ModelRendererTurbo(this, 118, 671, textureX, textureY); // Box 13
		pitchFlapRightModel[5] = new ModelRendererTurbo(this, 118, 671, textureX, textureY); // Box 14
		pitchFlapRightModel[6] = new ModelRendererTurbo(this, 11, 671, textureX, textureY); // Box 15
		pitchFlapRightModel[7] = new ModelRendererTurbo(this, 11, 671, textureX, textureY); // Box 16
		pitchFlapRightModel[8] = new ModelRendererTurbo(this, 11, 671, textureX, textureY); // Box 17
		pitchFlapRightModel[9] = new ModelRendererTurbo(this, 11, 671, textureX, textureY); // Box 18
		pitchFlapRightModel[10] = new ModelRendererTurbo(this, 11, 714, textureX, textureY); // Box 19
		pitchFlapRightModel[11] = new ModelRendererTurbo(this, 11, 714, textureX, textureY); // Box 20
		pitchFlapRightModel[12] = new ModelRendererTurbo(this, 11, 714, textureX, textureY); // Box 21
		pitchFlapRightModel[13] = new ModelRendererTurbo(this, 11, 714, textureX, textureY); // Box 22
		pitchFlapRightModel[14] = new ModelRendererTurbo(this, 11, 714, textureX, textureY); // Box 23
		pitchFlapRightModel[15] = new ModelRendererTurbo(this, 11, 714, textureX, textureY); // Box 24
		pitchFlapRightModel[16] = new ModelRendererTurbo(this, 11, 714, textureX, textureY); // Box 25
		pitchFlapRightModel[17] = new ModelRendererTurbo(this, 11, 714, textureX, textureY); // Box 26

		pitchFlapRightModel[0].addShapeBox(-24F, -1F, 0F, 8, 1, 6, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, -8F, .2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -8F, -.5F, 0F); // Box 9
		pitchFlapRightModel[0].setRotationPoint(-30F, -39.5F, 27F);

		pitchFlapRightModel[1].addShapeBox(-16F, -1F, 0F, 18, 1, 6, 0F,0F, 0F, 0F, 0F, .4F, 0F, 0F, .5F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Box 10
		pitchFlapRightModel[1].setRotationPoint(-30F, -39.5F, 27F);

		pitchFlapRightModel[2].addShapeBox(2F, -1F, 0F, 19, 1, 6, 0F,0F, .4F, 0F, 0F, -.1F, 0F, 0F, .3F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Box 11
		pitchFlapRightModel[2].setRotationPoint(-30F, -39.5F, 27F);

		pitchFlapRightModel[3].addShapeBox(21F, -1F, 0F, 6, 1, 6, 0F,0F, -.1F, 0F, 0F, -.8F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Box 12
		pitchFlapRightModel[3].setRotationPoint(-30F, -39.5F, 27F);

		pitchFlapRightModel[4].addShapeBox(27F, -0.5F, 0F, 3, 1, 6, 0F,0F, -.3F, 0F, -1F, -.5F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, -1F, -.5F, 0F, 0F, -1F, 0F, 0F, -.5F, 0F); // Box 13
		pitchFlapRightModel[4].setRotationPoint(-30F, -39.5F, 27F);

		pitchFlapRightModel[5].addShapeBox(27F, -1F, 6F, 9, 1, 27, 0F,0F, 0F, 0F, -6F, -.5F, 0F, 0F, 1.5F, 0F, 0F, 1.7F, 0F, 0F, 0F, 0F, -6F, -.5F, 0F, 0F, -2.5F, 0F, 0F, -2.2F, 0F); // Box 14
		pitchFlapRightModel[5].setRotationPoint(-30F, -39.5F, 27F);

		pitchFlapRightModel[6].addShapeBox(21F, -1.5F, 6F, 6, 1, 27, 0F,0F, -.2F, 0F, 0F, -.5F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 15
		pitchFlapRightModel[6].setRotationPoint(-30F, -39.5F, 27F);

		pitchFlapRightModel[7].addShapeBox(2F, -1.5F, 6F, 19, 1, 27, 0F,0F, 0F, 0F, 0F, -.2F, 0F, 0F, 1.2F, 0F, 0F, .5F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, -11F); // Box 16
		pitchFlapRightModel[7].setRotationPoint(-30F, -39.5F, 27F);

		pitchFlapRightModel[8].addShapeBox(-16F, -1.5F, 6F, 18, 1, 16, 0F,0F, -.3F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -.3F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -.5F, -11F); // Box 17
		pitchFlapRightModel[8].setRotationPoint(-30F, -39.5F, 27F);

		pitchFlapRightModel[9].addShapeBox(-24F, -1.5F, 6F, 8, 1, 5, 0F,0F, -1F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, -8F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -8F, -.5F, 0F); // Box 18
		pitchFlapRightModel[9].setRotationPoint(-30F, -39.5F, 27F);

		pitchFlapRightModel[10].addShapeBox(-24F, 0F, 0F, 8, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, -8F, .5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -8F, -.5F, 0F); // Box 19
		pitchFlapRightModel[10].setRotationPoint(-30F, -39.5F, 27F);

		pitchFlapRightModel[11].addShapeBox(-24F, -0.5F, 6F, 8, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, -8F, .5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -8F, -1F, 0F); // Box 20
		pitchFlapRightModel[11].setRotationPoint(-30F, -39.5F, 27F);

		pitchFlapRightModel[12].addShapeBox(-16F, 0F, 0F, 18, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Box 21
		pitchFlapRightModel[12].setRotationPoint(-30F, -39.5F, 27F);

		pitchFlapRightModel[13].addShapeBox(-16F, -0.5F, 6F, 18, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, .5F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1F, -11F); // Box 22
		pitchFlapRightModel[13].setRotationPoint(-30F, -39.5F, 27F);

		pitchFlapRightModel[14].addShapeBox(2F, -0.5F, 6F, 19, 1, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -1.5F, -11F); // Box 23
		pitchFlapRightModel[14].setRotationPoint(-30F, -39.5F, 27F);

		pitchFlapRightModel[15].addShapeBox(2F, 0F, 0F, 19, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Box 24
		pitchFlapRightModel[15].setRotationPoint(-30F, -39.5F, 27F);

		pitchFlapRightModel[16].addShapeBox(21F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, -.5F, 0F); // Box 25
		pitchFlapRightModel[16].setRotationPoint(-30F, -39.5F, 27F);

		pitchFlapRightModel[17].addShapeBox(21F, -0.5F, 6F, 6, 1, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -2.7F, 0F, 0F, -2.5F, 0F); // Box 26
		pitchFlapRightModel[17].setRotationPoint(-30F, -39.5F, 27F);
	}

	private void initpitchFlapLeftWingModel_1()
	{
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 814, 901, textureX, textureY); // Box 4
		pitchFlapLeftWingModel[1] = new ModelRendererTurbo(this, 725, 905, textureX, textureY); // Box 5
		pitchFlapLeftWingModel[2] = new ModelRendererTurbo(this, 725, 948, textureX, textureY); // Box 6
		pitchFlapLeftWingModel[3] = new ModelRendererTurbo(this, 814, 948, textureX, textureY); // Box 7

		pitchFlapLeftWingModel[0].addShapeBox(0F, -2F, -16F, 4, 4, 32, 0F,0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, .5F, 0F, 0F, 0F); // Box 4
		pitchFlapLeftWingModel[0].setRotationPoint(147F, -30F, -107F);

		pitchFlapLeftWingModel[1].addShapeBox(0F, -2.5F, -14F, 7, 5, 28, 0F,0F, 0F, 0F, 0F, -1.5F, .5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, .5F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 5
		pitchFlapLeftWingModel[1].setRotationPoint(145F, -30F, -72F);

		pitchFlapLeftWingModel[2].addShapeBox(7F, -1F, -14F, 5, 2, 28, 0F,0F, 0F, .5F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 6
		pitchFlapLeftWingModel[2].setRotationPoint(145F, -30F, -72F);

		pitchFlapLeftWingModel[3].addShapeBox(4F, -2F, -16F, 5, 4, 32, 0F,0F, -.5F, 0F, 0F, -2F, 0F, 1F, -2F, 1F, 0F, -.5F, .5F, 0F, -.5F, 0F, 0F, -2F, 0F, 1F, -2F, 1F, 0F, -.5F, .5F); // Box 7
		pitchFlapLeftWingModel[3].setRotationPoint(147F, -30F, -107F);
	}

	private void initpitchFlapRightWingModel_1()
	{
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 725, 905, textureX, textureY); // Box 8
		pitchFlapRightWingModel[1] = new ModelRendererTurbo(this, 725, 948, textureX, textureY); // Box 9
		pitchFlapRightWingModel[2] = new ModelRendererTurbo(this, 814, 901, textureX, textureY); // Box 10
		pitchFlapRightWingModel[3] = new ModelRendererTurbo(this, 814, 948, textureX, textureY); // Box 11

		pitchFlapRightWingModel[0].addShapeBox(0F, -2.5F, -14F, 7, 5, 28, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, .5F, 0F, 0F, 0F); // Box 8
		pitchFlapRightWingModel[0].setRotationPoint(145F, -30F, 72F);

		pitchFlapRightWingModel[1].addShapeBox(7F, -1F, -14F, 5, 2, 28, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, .5F); // Box 9
		pitchFlapRightWingModel[1].setRotationPoint(145F, -30F, 72F);

		pitchFlapRightWingModel[2].addShapeBox(0F, -2F, -16F, 4, 4, 32, 0F,0F, 0F, 0F, 0F, -.5F, .5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, .5F, 0F, -.5F, 0F, 0F, 0F, 0F); // Box 10
		pitchFlapRightWingModel[2].setRotationPoint(147F, -30F, 107F);

		pitchFlapRightWingModel[3].addShapeBox(4F, -2F, -16F, 5, 4, 32, 0F,0F, -.5F, .5F, 1F, -2F, 1F, 0F, -2F, 0F, 0F, -.5F, 0F, 0F, -.5F, .5F, 1F, -2F, 1F, 0F, -2F, 0F, 0F, -.5F, 0F); // Box 11
		pitchFlapRightWingModel[3].setRotationPoint(147F, -30F, 107F);
	}

	private void initbodyWheelModel_1()
	{
		bodyWheelModel[0] = new ModelRendererTurbo(this, 563, 143, textureX, textureY); // Box 0
		bodyWheelModel[1] = new ModelRendererTurbo(this, 563, 143, textureX, textureY); // Box 1
		bodyWheelModel[2] = new ModelRendererTurbo(this, 563, 124, textureX, textureY); // Box 2
		bodyWheelModel[3] = new ModelRendererTurbo(this, 620, 264, textureX, textureY); // Box 3
		bodyWheelModel[4] = new ModelRendererTurbo(this, 600, 258, textureX, textureY); // Box 4
		bodyWheelModel[5] = new ModelRendererTurbo(this, 620, 253, textureX, textureY); // Box 5
		bodyWheelModel[6] = new ModelRendererTurbo(this, 620, 253, textureX, textureY); // Box 6
		bodyWheelModel[7] = new ModelRendererTurbo(this, 620, 253, textureX, textureY); // Box 7
		bodyWheelModel[8] = new ModelRendererTurbo(this, 620, 253, textureX, textureY); // Box 8
		bodyWheelModel[9] = new ModelRendererTurbo(this, 620, 253, textureX, textureY); // Box 9
		bodyWheelModel[10] = new ModelRendererTurbo(this, 620, 253, textureX, textureY); // Box 10
		bodyWheelModel[11] = new ModelRendererTurbo(this, 563, 160, textureX, textureY); // Box 11
		bodyWheelModel[12] = new ModelRendererTurbo(this, 563, 177, textureX, textureY); // Box 12
		bodyWheelModel[13] = new ModelRendererTurbo(this, 586, 179, textureX, textureY); // Box 13
		bodyWheelModel[14] = new ModelRendererTurbo(this, 613, 181, textureX, textureY); // Box 14
		bodyWheelModel[15] = new ModelRendererTurbo(this, 586, 179, textureX, textureY); // Box 15
		bodyWheelModel[16] = new ModelRendererTurbo(this, 613, 159, textureX, textureY); // Box 16
		bodyWheelModel[17] = new ModelRendererTurbo(this, 613, 159, textureX, textureY); // Box 17
		bodyWheelModel[18] = new ModelRendererTurbo(this, 613, 172, textureX, textureY); // Box 18
		bodyWheelModel[19] = new ModelRendererTurbo(this, 613, 200, textureX, textureY); // Box 19
		bodyWheelModel[20] = new ModelRendererTurbo(this, 578, 200, textureX, textureY); // Box 20
		bodyWheelModel[21] = new ModelRendererTurbo(this, 595, 200, textureX, textureY); // Box 21
		bodyWheelModel[22] = new ModelRendererTurbo(this, 613, 159, textureX, textureY); // Box 22
		bodyWheelModel[23] = new ModelRendererTurbo(this, 613, 159, textureX, textureY); // Box 23
		bodyWheelModel[24] = new ModelRendererTurbo(this, 625, 220, textureX, textureY); // Box 24
		bodyWheelModel[25] = new ModelRendererTurbo(this, 592, 160, textureX, textureY); // Box 25
		bodyWheelModel[26] = new ModelRendererTurbo(this, 592, 160, textureX, textureY); // Box 26
		bodyWheelModel[27] = new ModelRendererTurbo(this, 625, 229, textureX, textureY); // Box 27
		bodyWheelModel[28] = new ModelRendererTurbo(this, 625, 229, textureX, textureY); // Box 0
		bodyWheelModel[29] = new ModelRendererTurbo(this, 625, 240, textureX, textureY); // Box 1
		bodyWheelModel[30] = new ModelRendererTurbo(this, 578, 234, textureX, textureY); // Box 0
		bodyWheelModel[31] = new ModelRendererTurbo(this, 578, 221, textureX, textureY); // Box 1
		bodyWheelModel[32] = new ModelRendererTurbo(this, 578, 247, textureX, textureY); // Box 2
		bodyWheelModel[33] = new ModelRendererTurbo(this, 578, 221, textureX, textureY); // Box 0
		bodyWheelModel[34] = new ModelRendererTurbo(this, 578, 234, textureX, textureY); // Box 1
		bodyWheelModel[35] = new ModelRendererTurbo(this, 578, 247, textureX, textureY); // Box 2
		bodyWheelModel[36] = new ModelRendererTurbo(this, 709, 154, textureX, textureY); // Box 3
		bodyWheelModel[37] = new ModelRendererTurbo(this, 709, 154, textureX, textureY); // Box 1
		bodyWheelModel[38] = new ModelRendererTurbo(this, 762, 173, textureX, textureY); // Box 2
		bodyWheelModel[39] = new ModelRendererTurbo(this, 709, 171, textureX, textureY); // Box 3
		bodyWheelModel[40] = new ModelRendererTurbo(this, 709, 171, textureX, textureY); // Box 4
		bodyWheelModel[41] = new ModelRendererTurbo(this, 709, 171, textureX, textureY); // Box 5
		bodyWheelModel[42] = new ModelRendererTurbo(this, 733, 154, textureX, textureY); // Box 6
		bodyWheelModel[43] = new ModelRendererTurbo(this, 750, 154, textureX, textureY); // Box 7
		bodyWheelModel[44] = new ModelRendererTurbo(this, 715, 221, textureX, textureY); // Box 9
		bodyWheelModel[45] = new ModelRendererTurbo(this, 715, 203, textureX, textureY); // Box 11
		bodyWheelModel[46] = new ModelRendererTurbo(this, 715, 190, textureX, textureY); // Box 12
		bodyWheelModel[47] = new ModelRendererTurbo(this, 738, 171, textureX, textureY); // Box 13
		bodyWheelModel[48] = new ModelRendererTurbo(this, 733, 154, textureX, textureY); // Box 14
		bodyWheelModel[49] = new ModelRendererTurbo(this, 709, 154, textureX, textureY); // Box 15
		bodyWheelModel[50] = new ModelRendererTurbo(this, 709, 154, textureX, textureY); // Box 16
		bodyWheelModel[51] = new ModelRendererTurbo(this, 750, 154, textureX, textureY); // Box 17
		bodyWheelModel[52] = new ModelRendererTurbo(this, 709, 171, textureX, textureY); // Box 18
		bodyWheelModel[53] = new ModelRendererTurbo(this, 709, 171, textureX, textureY); // Box 19
		bodyWheelModel[54] = new ModelRendererTurbo(this, 738, 171, textureX, textureY); // Box 20
		bodyWheelModel[55] = new ModelRendererTurbo(this, 709, 171, textureX, textureY); // Box 21
		bodyWheelModel[56] = new ModelRendererTurbo(this, 715, 203, textureX, textureY); // Box 22
		bodyWheelModel[57] = new ModelRendererTurbo(this, 715, 190, textureX, textureY); // Box 23
		bodyWheelModel[58] = new ModelRendererTurbo(this, 715, 221, textureX, textureY); // Box 24
		bodyWheelModel[59] = new ModelRendererTurbo(this, 709, 124, textureX, textureY); // Box 25
		bodyWheelModel[60] = new ModelRendererTurbo(this, 709, 101, textureX, textureY); // Box 26
		bodyWheelModel[61] = new ModelRendererTurbo(this, 709, 124, textureX, textureY); // Box 27
		bodyWheelModel[62] = new ModelRendererTurbo(this, 709, 101, textureX, textureY); // Box 28
		bodyWheelModel[63] = new ModelRendererTurbo(this, 709, 124, textureX, textureY); // Box 29
		bodyWheelModel[64] = new ModelRendererTurbo(this, 709, 101, textureX, textureY); // Box 30
		bodyWheelModel[65] = new ModelRendererTurbo(this, 709, 101, textureX, textureY); // Box 31
		bodyWheelModel[66] = new ModelRendererTurbo(this, 709, 124, textureX, textureY); // Box 32
		bodyWheelModel[67] = new ModelRendererTurbo(this, 762, 173, textureX, textureY); // Box 0
		bodyWheelModel[68] = new ModelRendererTurbo(this, 676, 249, textureX, textureY); // Box 0
		bodyWheelModel[69] = new ModelRendererTurbo(this, 676, 249, textureX, textureY); // Box 1

		bodyWheelModel[0].addShapeBox(-24F, 2F, -11.5F, 30, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 0
		bodyWheelModel[0].setRotationPoint(0F, 0F, 0F);
		bodyWheelModel[0].rotateAngleX = -1.30899694F;

		bodyWheelModel[1].addShapeBox(-24F, 2F, 5.5F, 30, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F); // Box 1
		bodyWheelModel[1].setRotationPoint(0F, 0F, 0F);
		bodyWheelModel[1].rotateAngleX = 1.30899694F;

		bodyWheelModel[2].addShapeBox(-24F, -12F, -4.5F, 30, 3, 9, 0F,-.1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -.1F, 0F, 1F, -.1F, .1F, -.1F, 0F, .1F, -.1F, 0F, .1F, -.1F, -.1F, .1F, -.1F); // Box 2
		bodyWheelModel[2].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[3].addBox(-3F, -11F, -16.5F, 1, 4, 9, 0F); // Box 3
		bodyWheelModel[3].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[4].addBox(-2.5F, -10.5F, -16F, 1, 3, 8, 0F); // Box 4
		bodyWheelModel[4].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[5].addShapeBox(-3.2F, -10.3F, -16F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyWheelModel[5].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[6].addShapeBox(-3.2F, -8.3F, -16F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 6
		bodyWheelModel[6].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[7].addBox(-3.2F, -9.3F, -16F, 1, 1, 3, 0F); // Box 7
		bodyWheelModel[7].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[8].addShapeBox(-3.2F, -8.3F, -11F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 8
		bodyWheelModel[8].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[9].addBox(-3.2F, -9.3F, -11F, 1, 1, 3, 0F); // Box 9
		bodyWheelModel[9].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[10].addShapeBox(-3.2F, -10.3F, -11F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyWheelModel[10].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[11].addBox(-24F, -10F, -1.5F, 4, 7, 3, 0F); // Box 11
		bodyWheelModel[11].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[12].addShapeBox(-22.5F, -3F, -1F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 12
		bodyWheelModel[12].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[13].addShapeBox(-23.5F, -3F, -1.4F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyWheelModel[13].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[14].addShapeBox(-22.5F, 3F, -1F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -4F, 1.5F, 0F, 4F, .5F, 0F, 4F, .5F, 0F, -4F, 1.5F, 0F); // Box 14
		bodyWheelModel[14].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[15].addShapeBox(-23.5F, -3F, 0.4F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyWheelModel[15].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[16].addShapeBox(-24.5F, 0F, -1.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyWheelModel[16].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[17].addShapeBox(-24.5F, -1F, -1.5F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyWheelModel[17].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[18].addShapeBox(-24.2F, 3F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyWheelModel[18].setRotationPoint(0F, 0F, 0F);
		bodyWheelModel[18].rotateAngleZ = -0.10471976F;

		bodyWheelModel[19].addShapeBox(-24.7F, 3F, -0.5F, 1, 1, 1, 0F,.1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F); // Box 19
		bodyWheelModel[19].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[20].addShapeBox(-16.2F, -19F, -0.5F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyWheelModel[20].setRotationPoint(0F, 0F, 0F);
		bodyWheelModel[20].rotateAngleZ = 1.02974426F;

		bodyWheelModel[21].addShapeBox(-16.2F, -14F, -0.5F, 1, 2, 1, 0F,.15F, 0F, .15F, .15F, 0F, .15F, .15F, 0F, .15F, .15F, 0F, .15F, .15F, 0F, .15F, .15F, 0F, .15F, .15F, 0F, .15F, .15F, 0F, .15F); // Box 21
		bodyWheelModel[21].setRotationPoint(0F, 0F, 0F);
		bodyWheelModel[21].rotateAngleZ = 1.02974426F;

		bodyWheelModel[22].addShapeBox(-24.5F, -1F, 0.5F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyWheelModel[22].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[23].addShapeBox(-24.5F, 0F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyWheelModel[23].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[24].addShapeBox(-24.5F, -1.5F, -0.5F, 1, 1, 1, 0F,0F, .1F, .1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .1F, .1F); // Box 24
		bodyWheelModel[24].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[25].addShapeBox(-23F, -9F, -4.5F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -3F, 0F, 2F, -3F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 25
		bodyWheelModel[25].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[26].addShapeBox(-23F, -9F, 2.5F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 2F, -3F, 0F, 2F, -3F); // Box 26
		bodyWheelModel[26].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[27].addShapeBox(-24F, -4.5F, 1.5F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyWheelModel[27].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[28].addShapeBox(-23F, -4.5F, 1.5F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F); // Box 0
		bodyWheelModel[28].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[29].addShapeBox(-25F, -4.5F, 1.5F, 1, 2, 2, 0F,-.9F, -.15F, -.15F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, -.9F, -.15F, -.15F, -.9F, -.15F, -.15F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, -.9F, -.15F, -.15F); // Box 1
		bodyWheelModel[29].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[30].addShapeBox(-23.5F, 3.5F, 1F, 10, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyWheelModel[30].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[31].addShapeBox(-23.5F, 0.5F, 1F, 10, 3, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyWheelModel[31].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[32].addShapeBox(-23.5F, 7.5F, 1F, 10, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 2
		bodyWheelModel[32].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[33].addShapeBox(-23.5F, 0.5F, -3F, 10, 3, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyWheelModel[33].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[34].addShapeBox(-23.5F, 3.5F, -3F, 10, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyWheelModel[34].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[35].addShapeBox(-23.5F, 7.5F, -3F, 10, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 2
		bodyWheelModel[35].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[36].addShapeBox(76F, -17F, -24.5F, 3, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyWheelModel[36].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[37].addShapeBox(76F, -8F, -24.5F, 3, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, .5F, -1F, 0F, .5F, -1F, 0F, .5F, 1F, 0F, .5F); // Box 1
		bodyWheelModel[37].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[38].addShapeBox(75F, -3F, -25F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Box 2
		bodyWheelModel[38].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[39].addShapeBox(76F, -4F, -24.5F, 5, 3, 3, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 3
		bodyWheelModel[39].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[40].addShapeBox(81F, -4F, -24.5F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyWheelModel[40].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[41].addShapeBox(81F, -1F, -24.5F, 3, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F); // Box 5
		bodyWheelModel[41].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[42].addShapeBox(78.5F, -16F, -24F, 2, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -.2F, 0F, 1F, -.2F, 0F, -1F, 0F, 0F); // Box 6
		bodyWheelModel[42].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[43].addShapeBox(79.5F, -8F, -24F, 2, 6, 2, 0F,-.1F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.1F, 0F, -.2F, -.8F, 0F, -.2F, .6F, -.2F, -.2F, .6F, -.2F, -.2F, -.8F, 0F, -.2F); // Box 7
		bodyWheelModel[43].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[44].addShapeBox(77.5F, 7.5F, -29F, 16, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 9
		bodyWheelModel[44].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[45].addShapeBox(77.5F, -0.5F, -29F, 16, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyWheelModel[45].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[46].addShapeBox(77.5F, -4.5F, -29F, 16, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyWheelModel[46].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[47].addBox(84F, 2F, -26.5F, 2, 2, 4, 0F); // Box 13
		bodyWheelModel[47].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[48].addShapeBox(78.5F, -16F, 22F, 2, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -.2F, 0F, 1F, -.2F, 0F, -1F, 0F, 0F); // Box 14
		bodyWheelModel[48].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[49].addShapeBox(76F, -17F, 21.5F, 3, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyWheelModel[49].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[50].addShapeBox(76F, -8F, 21.5F, 3, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, .5F, -1F, 0F, .5F, -1F, 0F, .5F, 1F, 0F, .5F); // Box 16
		bodyWheelModel[50].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[51].addShapeBox(79.5F, -8F, 22F, 2, 6, 2, 0F,-.1F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.1F, 0F, -.2F, -.8F, 0F, -.2F, .6F, -.2F, -.2F, .6F, -.2F, -.2F, -.8F, 0F, -.2F); // Box 17
		bodyWheelModel[51].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[52].addShapeBox(81F, -4F, 21.5F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyWheelModel[52].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[53].addShapeBox(76F, -4F, 21.5F, 5, 3, 3, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 19
		bodyWheelModel[53].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[54].addBox(84F, 2F, 22.5F, 2, 2, 4, 0F); // Box 20
		bodyWheelModel[54].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[55].addShapeBox(81F, -1F, 21.5F, 3, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F); // Box 21
		bodyWheelModel[55].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[56].addShapeBox(77.5F, -0.5F, 25F, 16, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyWheelModel[56].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[57].addShapeBox(77.5F, -4.5F, 25F, 16, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyWheelModel[57].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[58].addShapeBox(77.5F, 7.5F, 25F, 16, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 24
		bodyWheelModel[58].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[59].addShapeBox(34F, 4F, -35F, 28, 8, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -3F, -3F, 0F, -3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyWheelModel[59].setRotationPoint(0F, 0F, 0F);
		bodyWheelModel[59].rotateAngleX = -0.64577182F;

		bodyWheelModel[60].addShapeBox(34F, -4F, -35F, 28, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyWheelModel[60].setRotationPoint(0F, 0F, 0F);
		bodyWheelModel[60].rotateAngleX = -0.64577182F;

		bodyWheelModel[61].addShapeBox(34F, 4F, 26F, 28, 8, 9, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, 0F, -3F, -3F); // Box 27
		bodyWheelModel[61].setRotationPoint(0F, 0F, 0F);
		bodyWheelModel[61].rotateAngleX = 0.64577182F;

		bodyWheelModel[62].addShapeBox(34F, -4F, 33F, 28, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyWheelModel[62].setRotationPoint(0F, 0F, 0F);
		bodyWheelModel[62].rotateAngleX = 0.64577182F;

		bodyWheelModel[63].addShapeBox(62F, 3F, 26F, 19, 8, 9, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, 0F, -3F, -3F); // Box 29
		bodyWheelModel[63].setRotationPoint(0F, 0F, 0F);
		bodyWheelModel[63].rotateAngleX = 0.64577182F;

		bodyWheelModel[64].addShapeBox(62F, -5F, 33F, 19, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyWheelModel[64].setRotationPoint(0F, 0F, 0F);
		bodyWheelModel[64].rotateAngleX = 0.64577182F;

		bodyWheelModel[65].addShapeBox(62F, -5F, -35F, 19, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyWheelModel[65].setRotationPoint(0F, 0F, 0F);
		bodyWheelModel[65].rotateAngleX = -0.64577182F;

		bodyWheelModel[66].addShapeBox(62F, 3F, -35F, 19, 8, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -3F, -3F, 0F, -3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyWheelModel[66].setRotationPoint(0F, 0F, 0F);
		bodyWheelModel[66].rotateAngleX = -0.64577182F;

		bodyWheelModel[67].addShapeBox(75F, -3F, 21F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Box 0
		bodyWheelModel[67].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[68].addShapeBox(34F, -18.7F, -27F, 47, 8, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyWheelModel[68].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[69].addShapeBox(34F, -18.7F, 18F, 47, 8, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, 0F, -3F, -3F); // Box 1
		bodyWheelModel[69].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyDoorOpenModel_1()
	{
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 270, 358, textureX, textureY); // Box 0
		bodyDoorOpenModel[1] = new ModelRendererTurbo(this, 270, 358, textureX, textureY); // Box 0

		bodyDoorOpenModel[0].addShapeBox(-55F, -26F, -18F, 1, 7, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, -14F, 0F, 0F); // Box 0
		bodyDoorOpenModel[0].setRotationPoint(0F, 0F, 0F);

		bodyDoorOpenModel[1].addShapeBox(-55F, -26F, 1F, 1, 7, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, -14F, 0F, 0F); // Box 0
		bodyDoorOpenModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyDoorCloseModel_1()
	{
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 426, 597, textureX, textureY); // Box 24
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 493, 597, textureX, textureY); // Box 0
		bodyDoorCloseModel[2] = new ModelRendererTurbo(this, 546, 597, textureX, textureY); // Box 1
		bodyDoorCloseModel[3] = new ModelRendererTurbo(this, 546, 568, textureX, textureY); // Box 2
		bodyDoorCloseModel[4] = new ModelRendererTurbo(this, 493, 568, textureX, textureY); // Box 3
		bodyDoorCloseModel[5] = new ModelRendererTurbo(this, 426, 568, textureX, textureY); // Box 4
		bodyDoorCloseModel[6] = new ModelRendererTurbo(this, 426, 545, textureX, textureY); // Box 5
		bodyDoorCloseModel[7] = new ModelRendererTurbo(this, 493, 545, textureX, textureY); // Box 6
		bodyDoorCloseModel[8] = new ModelRendererTurbo(this, 546, 545, textureX, textureY); // Box 7
		bodyDoorCloseModel[9] = new ModelRendererTurbo(this, 546, 520, textureX, textureY); // Box 8
		bodyDoorCloseModel[10] = new ModelRendererTurbo(this, 493, 520, textureX, textureY); // Box 9
		bodyDoorCloseModel[11] = new ModelRendererTurbo(this, 426, 520, textureX, textureY); // Box 10

		bodyDoorCloseModel[0].addShapeBox(-64F, -51.7F, -8F, 17, 2, 16, 0F,0F, .5F, -1.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, .5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyDoorCloseModel[0].setRotationPoint(0F, 0F, 0F);

		bodyDoorCloseModel[1].addShapeBox(-64F, -53.7F, -6F, 17, 2, 12, 0F,0F, 1F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -1F, 0F, -.5F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, .5F); // Box 0
		bodyDoorCloseModel[1].setRotationPoint(0F, 0F, 0F);

		bodyDoorCloseModel[2].addShapeBox(-64F, -54.7F, -4F, 17, 1, 8, 0F,0F, 3F, -3F, 0F, .6F, -3F, 0F, .7F, -3F, 0F, 3F, -3F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F); // Box 1
		bodyDoorCloseModel[2].setRotationPoint(0F, 0F, 0F);

		bodyDoorCloseModel[3].addShapeBox(-70F, -56.7F, -4F, 6, 2, 8, 0F,0F, 0F, -3F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 2
		bodyDoorCloseModel[3].setRotationPoint(0F, 0F, 0F);

		bodyDoorCloseModel[4].addShapeBox(-70F, -54.7F, -6F, 6, 3, 12, 0F,0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, .5F, 0F, -.5F, .5F, 0F, -.5F, .5F, 0F, 0F, .5F); // Box 3
		bodyDoorCloseModel[4].setRotationPoint(0F, 0F, 0F);

		bodyDoorCloseModel[5].addShapeBox(-70F, -51.7F, -8F, 6, 2, 16, 0F,0F, 0F, -1.5F, 0F, .5F, -1.5F, 0F, .5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyDoorCloseModel[5].setRotationPoint(0F, 0F, 0F);

		bodyDoorCloseModel[6].addShapeBox(-71F, -51.7F, -8F, 1, 2, 16, 0F,1F, -.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 1F, -.5F, -1.5F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F); // Box 5
		bodyDoorCloseModel[6].setRotationPoint(0F, 0F, 0F);

		bodyDoorCloseModel[7].addShapeBox(-72F, -54.7F, -6F, 2, 3, 12, 0F,1F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 1F, -1F, -2F, 0F, .5F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, .5F, .5F); // Box 6
		bodyDoorCloseModel[7].setRotationPoint(0F, 0F, 0F);

		bodyDoorCloseModel[8].addShapeBox(-73F, -56.7F, -4F, 3, 2, 8, 0F,1F, -1.5F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 1F, -1.5F, -3F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 7
		bodyDoorCloseModel[8].setRotationPoint(0F, 0F, 0F);

		bodyDoorCloseModel[9].addShapeBox(-90F, -54.7F, -4F, 16, 1, 8, 0F,1F, -7.2F, -3F, 0F, .6F, -2F, 0F, .6F, -2F, 1F, -7.2F, -3F, 1F, 6.7F, -1F, 0F, 0F, .8F, 0F, 0F, .8F, 1F, 6.7F, -1F); // Box 8
		bodyDoorCloseModel[9].setRotationPoint(0F, 0F, 0F);

		bodyDoorCloseModel[10].addShapeBox(-90F, -53.7F, -6F, 17, 2, 12, 0F,1F, -6.7F, -3F, -1F, 0F, -1.2F, -1F, 0F, -1.2F, 1F, -6.7F, -3F, 0F, 5F, -1.5F, 0F, 0F, .8F, 0F, 0F, .8F, 0F, 5F, -1.5F); // Box 9
		bodyDoorCloseModel[10].setRotationPoint(0F, 0F, 0F);

		bodyDoorCloseModel[11].addShapeBox(-90F, -51.7F, -7.5F, 17, 2, 15, 0F,0F, -5F, -3F, 0F, 0F, -.7F, 0F, 0F, -.7F, 0F, -5F, -3F, 0F, 3F, -3F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, 3F, -3F); // Box 10
		bodyDoorCloseModel[11].setRotationPoint(0F, 0F, 0F);
	}
}