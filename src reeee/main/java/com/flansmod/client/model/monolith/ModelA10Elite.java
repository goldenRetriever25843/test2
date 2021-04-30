//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 07.06.2016 - 13:45:47
// Last changed on: 07.06.2016 - 13:45:47

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelA10Elite extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelA10Elite() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[211];
		noseModel = new ModelRendererTurbo[87];
		tailModel = new ModelRendererTurbo[9];
		leftWingModel = new ModelRendererTurbo[221];
		rightWingModel = new ModelRendererTurbo[220];
		topWingModel = new ModelRendererTurbo[26];
		yawFlapModel = new ModelRendererTurbo[6];
		pitchFlapLeftModel = new ModelRendererTurbo[1];
		pitchFlapRightModel = new ModelRendererTurbo[1];
		pitchFlapLeftWingModel = new ModelRendererTurbo[1];
		pitchFlapRightWingModel = new ModelRendererTurbo[1];
		bodyWheelModel = new ModelRendererTurbo[30];
		tailWheelModel = new ModelRendererTurbo[2];
		leftWingWheelModel = new ModelRendererTurbo[24];
		rightWingWheelModel = new ModelRendererTurbo[24];
		bodyDoorOpenModel = new ModelRendererTurbo[8];
		bodyDoorCloseModel = new ModelRendererTurbo[1];
		hudModel = new ModelRendererTurbo[1];

		initbodyModel_1();
		initnoseModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inittopWingModel_1();
		inityawFlapModel_1();
		initpitchFlapLeftModel_1();
		initpitchFlapRightModel_1();
		initpitchFlapLeftWingModel_1();
		initpitchFlapRightWingModel_1();
		initbodyWheelModel_1();
		inittailWheelModel_1();
		initleftWingWheelModel_1();
		initrightWingWheelModel_1();
		initbodyDoorOpenModel_1();
		initbodyDoorCloseModel_1();
		inithudModel_1();

		initPropeller();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 625, 33, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 681, 49, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 825, 49, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 11
		bodyModel[5] = new ModelRendererTurbo(this, 500, 10, textureX, textureY); // engine
		bodyModel[6] = new ModelRendererTurbo(this, 500, 0, textureX, textureY); // Box 20
		bodyModel[7] = new ModelRendererTurbo(this, 500, 20, textureX, textureY); // Box 21
		bodyModel[8] = new ModelRendererTurbo(this, 500, 40, textureX, textureY); // engine
		bodyModel[9] = new ModelRendererTurbo(this, 500, 40, textureX, textureY); // engine
		bodyModel[10] = new ModelRendererTurbo(this, 500, 40, textureX, textureY); // Box 26
		bodyModel[11] = new ModelRendererTurbo(this, 500, 40, textureX, textureY); // Box 27
		bodyModel[12] = new ModelRendererTurbo(this, 500, 40, textureX, textureY); // Box 28
		bodyModel[13] = new ModelRendererTurbo(this, 500, 40, textureX, textureY); // Box 29
		bodyModel[14] = new ModelRendererTurbo(this, 500, 40, textureX, textureY); // Box 30
		bodyModel[15] = new ModelRendererTurbo(this, 500, 40, textureX, textureY); // Box 31
		bodyModel[16] = new ModelRendererTurbo(this, 500, 40, textureX, textureY); // Box 32
		bodyModel[17] = new ModelRendererTurbo(this, 500, 40, textureX, textureY); // Box 33
		bodyModel[18] = new ModelRendererTurbo(this, 500, 40, textureX, textureY); // Box 34
		bodyModel[19] = new ModelRendererTurbo(this, 500, 40, textureX, textureY); // Box 35
		bodyModel[20] = new ModelRendererTurbo(this, 500, 40, textureX, textureY); // Box 36
		bodyModel[21] = new ModelRendererTurbo(this, 500, 40, textureX, textureY); // Box 37
		bodyModel[22] = new ModelRendererTurbo(this, 500, 40, textureX, textureY); // Box 38
		bodyModel[23] = new ModelRendererTurbo(this, 500, 40, textureX, textureY); // Box 39
		bodyModel[24] = new ModelRendererTurbo(this, 500, 70, textureX, textureY); // Box 40
		bodyModel[25] = new ModelRendererTurbo(this, 500, 70, textureX, textureY); // Box 41
		bodyModel[26] = new ModelRendererTurbo(this, 500, 70, textureX, textureY); // Box 42
		bodyModel[27] = new ModelRendererTurbo(this, 500, 70, textureX, textureY); // Box 43
		bodyModel[28] = new ModelRendererTurbo(this, 500, 70, textureX, textureY); // Box 44
		bodyModel[29] = new ModelRendererTurbo(this, 500, 70, textureX, textureY); // Box 45
		bodyModel[30] = new ModelRendererTurbo(this, 500, 70, textureX, textureY); // Box 46
		bodyModel[31] = new ModelRendererTurbo(this, 500, 70, textureX, textureY); // Box 47
		bodyModel[32] = new ModelRendererTurbo(this, 500, 70, textureX, textureY); // Box 48
		bodyModel[33] = new ModelRendererTurbo(this, 500, 70, textureX, textureY); // Box 49
		bodyModel[34] = new ModelRendererTurbo(this, 500, 70, textureX, textureY); // Box 50
		bodyModel[35] = new ModelRendererTurbo(this, 500, 70, textureX, textureY); // Box 51
		bodyModel[36] = new ModelRendererTurbo(this, 500, 70, textureX, textureY); // Box 52
		bodyModel[37] = new ModelRendererTurbo(this, 500, 70, textureX, textureY); // Box 53
		bodyModel[38] = new ModelRendererTurbo(this, 500, 70, textureX, textureY); // Box 54
		bodyModel[39] = new ModelRendererTurbo(this, 500, 70, textureX, textureY); // Box 55
		bodyModel[40] = new ModelRendererTurbo(this, 500, 90, textureX, textureY); // Box 56
		bodyModel[41] = new ModelRendererTurbo(this, 500, 90, textureX, textureY); // Box 57
		bodyModel[42] = new ModelRendererTurbo(this, 500, 90, textureX, textureY); // Box 58
		bodyModel[43] = new ModelRendererTurbo(this, 500, 90, textureX, textureY); // Box 59
		bodyModel[44] = new ModelRendererTurbo(this, 500, 90, textureX, textureY); // Box 60
		bodyModel[45] = new ModelRendererTurbo(this, 500, 90, textureX, textureY); // Box 61
		bodyModel[46] = new ModelRendererTurbo(this, 500, 90, textureX, textureY); // Box 62
		bodyModel[47] = new ModelRendererTurbo(this, 500, 90, textureX, textureY); // Box 63
		bodyModel[48] = new ModelRendererTurbo(this, 500, 90, textureX, textureY); // Box 64
		bodyModel[49] = new ModelRendererTurbo(this, 500, 90, textureX, textureY); // Box 65
		bodyModel[50] = new ModelRendererTurbo(this, 500, 90, textureX, textureY); // Box 66
		bodyModel[51] = new ModelRendererTurbo(this, 500, 90, textureX, textureY); // Box 67
		bodyModel[52] = new ModelRendererTurbo(this, 500, 90, textureX, textureY); // Box 68
		bodyModel[53] = new ModelRendererTurbo(this, 500, 90, textureX, textureY); // Box 69
		bodyModel[54] = new ModelRendererTurbo(this, 500, 90, textureX, textureY); // Box 70
		bodyModel[55] = new ModelRendererTurbo(this, 500, 90, textureX, textureY); // Box 71
		bodyModel[56] = new ModelRendererTurbo(this, 500, 110, textureX, textureY); // Box 73
		bodyModel[57] = new ModelRendererTurbo(this, 500, 120, textureX, textureY); // Box 74
		bodyModel[58] = new ModelRendererTurbo(this, 500, 130, textureX, textureY); // Box 75
		bodyModel[59] = new ModelRendererTurbo(this, 500, 140, textureX, textureY); // Box 76
		bodyModel[60] = new ModelRendererTurbo(this, 500, 140, textureX, textureY); // Box 77
		bodyModel[61] = new ModelRendererTurbo(this, 500, 140, textureX, textureY); // Box 81
		bodyModel[62] = new ModelRendererTurbo(this, 500, 140, textureX, textureY); // Box 82
		bodyModel[63] = new ModelRendererTurbo(this, 500, 140, textureX, textureY); // Box 83
		bodyModel[64] = new ModelRendererTurbo(this, 500, 140, textureX, textureY); // Box 84
		bodyModel[65] = new ModelRendererTurbo(this, 500, 140, textureX, textureY); // Box 85
		bodyModel[66] = new ModelRendererTurbo(this, 500, 140, textureX, textureY); // Box 86
		bodyModel[67] = new ModelRendererTurbo(this, 500, 140, textureX, textureY); // Box 87
		bodyModel[68] = new ModelRendererTurbo(this, 500, 140, textureX, textureY); // Box 88
		bodyModel[69] = new ModelRendererTurbo(this, 500, 140, textureX, textureY); // Box 89
		bodyModel[70] = new ModelRendererTurbo(this, 500, 140, textureX, textureY); // Box 90
		bodyModel[71] = new ModelRendererTurbo(this, 500, 140, textureX, textureY); // Box 91
		bodyModel[72] = new ModelRendererTurbo(this, 500, 140, textureX, textureY); // Box 92
		bodyModel[73] = new ModelRendererTurbo(this, 500, 140, textureX, textureY); // Box 93
		bodyModel[74] = new ModelRendererTurbo(this, 500, 140, textureX, textureY); // Box 94
		bodyModel[75] = new ModelRendererTurbo(this, 500, 150, textureX, textureY); // Box 95
		bodyModel[76] = new ModelRendererTurbo(this, 500, 180, textureX, textureY); // Box 96
		bodyModel[77] = new ModelRendererTurbo(this, 508, 224, textureX, textureY); // Box 97
		bodyModel[78] = new ModelRendererTurbo(this, 509, 236, textureX, textureY); // Box 98
		bodyModel[79] = new ModelRendererTurbo(this, 500, 210, textureX, textureY); // Box 99
		bodyModel[80] = new ModelRendererTurbo(this, 500, 230, textureX, textureY); // Box 100
		bodyModel[81] = new ModelRendererTurbo(this, 500, 250, textureX, textureY); // Box 101
		bodyModel[82] = new ModelRendererTurbo(this, 500, 210, textureX, textureY); // Box 102
		bodyModel[83] = new ModelRendererTurbo(this, 500, 230, textureX, textureY); // Box 103
		bodyModel[84] = new ModelRendererTurbo(this, 500, 250, textureX, textureY); // Box 104
		bodyModel[85] = new ModelRendererTurbo(this, 508, 224, textureX, textureY); // Box 105
		bodyModel[86] = new ModelRendererTurbo(this, 500, 40, textureX, textureY); // Box 106
		bodyModel[87] = new ModelRendererTurbo(this, 500, 40, textureX, textureY); // Box 107
		bodyModel[88] = new ModelRendererTurbo(this, 500, 40, textureX, textureY); // Box 108
		bodyModel[89] = new ModelRendererTurbo(this, 500, 40, textureX, textureY); // Box 109
		bodyModel[90] = new ModelRendererTurbo(this, 500, 40, textureX, textureY); // Box 110
		bodyModel[91] = new ModelRendererTurbo(this, 500, 40, textureX, textureY); // Box 111
		bodyModel[92] = new ModelRendererTurbo(this, 500, 320, textureX, textureY); // houden
		bodyModel[93] = new ModelRendererTurbo(this, 500, 40, textureX, textureY); // Box 0
		bodyModel[94] = new ModelRendererTurbo(this, 500, 40, textureX, textureY); // Box 1
		bodyModel[95] = new ModelRendererTurbo(this, 500, 40, textureX, textureY); // Box 2
		bodyModel[96] = new ModelRendererTurbo(this, 500, 40, textureX, textureY); // Box 3
		bodyModel[97] = new ModelRendererTurbo(this, 500, 40, textureX, textureY); // Box 4
		bodyModel[98] = new ModelRendererTurbo(this, 500, 40, textureX, textureY); // Box 5
		bodyModel[99] = new ModelRendererTurbo(this, 500, 40, textureX, textureY); // Box 6
		bodyModel[100] = new ModelRendererTurbo(this, 500, 40, textureX, textureY); // Box 7
		bodyModel[101] = new ModelRendererTurbo(this, 500, 40, textureX, textureY); // Box 8
		bodyModel[102] = new ModelRendererTurbo(this, 500, 90, textureX, textureY); // Box 9
		bodyModel[103] = new ModelRendererTurbo(this, 500, 90, textureX, textureY); // Box 10
		bodyModel[104] = new ModelRendererTurbo(this, 500, 90, textureX, textureY); // Box 11
		bodyModel[105] = new ModelRendererTurbo(this, 500, 90, textureX, textureY); // Box 12
		bodyModel[106] = new ModelRendererTurbo(this, 500, 90, textureX, textureY); // Box 13
		bodyModel[107] = new ModelRendererTurbo(this, 500, 90, textureX, textureY); // Box 14
		bodyModel[108] = new ModelRendererTurbo(this, 500, 90, textureX, textureY); // Box 15
		bodyModel[109] = new ModelRendererTurbo(this, 500, 90, textureX, textureY); // Box 16
		bodyModel[110] = new ModelRendererTurbo(this, 500, 90, textureX, textureY); // Box 17
		bodyModel[111] = new ModelRendererTurbo(this, 500, 90, textureX, textureY); // Box 18
		bodyModel[112] = new ModelRendererTurbo(this, 500, 90, textureX, textureY); // Box 19
		bodyModel[113] = new ModelRendererTurbo(this, 500, 90, textureX, textureY); // Box 20
		bodyModel[114] = new ModelRendererTurbo(this, 500, 90, textureX, textureY); // Box 21
		bodyModel[115] = new ModelRendererTurbo(this, 500, 90, textureX, textureY); // Box 22
		bodyModel[116] = new ModelRendererTurbo(this, 500, 90, textureX, textureY); // Box 23
		bodyModel[117] = new ModelRendererTurbo(this, 500, 90, textureX, textureY); // Box 24
		bodyModel[118] = new ModelRendererTurbo(this, 500, 40, textureX, textureY); // Box 25
		bodyModel[119] = new ModelRendererTurbo(this, 500, 40, textureX, textureY); // Box 26
		bodyModel[120] = new ModelRendererTurbo(this, 500, 40, textureX, textureY); // Box 27
		bodyModel[121] = new ModelRendererTurbo(this, 500, 40, textureX, textureY); // Box 28
		bodyModel[122] = new ModelRendererTurbo(this, 500, 40, textureX, textureY); // Box 29
		bodyModel[123] = new ModelRendererTurbo(this, 500, 40, textureX, textureY); // Box 30
		bodyModel[124] = new ModelRendererTurbo(this, 500, 40, textureX, textureY); // Box 31
		bodyModel[125] = new ModelRendererTurbo(this, 500, 40, textureX, textureY); // Box 32
		bodyModel[126] = new ModelRendererTurbo(this, 500, 40, textureX, textureY); // Box 33
		bodyModel[127] = new ModelRendererTurbo(this, 500, 90, textureX, textureY); // Box 34
		bodyModel[128] = new ModelRendererTurbo(this, 500, 90, textureX, textureY); // Box 35
		bodyModel[129] = new ModelRendererTurbo(this, 500, 90, textureX, textureY); // Box 36
		bodyModel[130] = new ModelRendererTurbo(this, 500, 90, textureX, textureY); // Box 37
		bodyModel[131] = new ModelRendererTurbo(this, 500, 90, textureX, textureY); // Box 38
		bodyModel[132] = new ModelRendererTurbo(this, 500, 90, textureX, textureY); // Box 39
		bodyModel[133] = new ModelRendererTurbo(this, 500, 90, textureX, textureY); // Box 40
		bodyModel[134] = new ModelRendererTurbo(this, 500, 90, textureX, textureY); // Box 41
		bodyModel[135] = new ModelRendererTurbo(this, 500, 90, textureX, textureY); // Box 42
		bodyModel[136] = new ModelRendererTurbo(this, 500, 90, textureX, textureY); // Box 43
		bodyModel[137] = new ModelRendererTurbo(this, 500, 90, textureX, textureY); // Box 44
		bodyModel[138] = new ModelRendererTurbo(this, 500, 90, textureX, textureY); // Box 45
		bodyModel[139] = new ModelRendererTurbo(this, 500, 90, textureX, textureY); // Box 46
		bodyModel[140] = new ModelRendererTurbo(this, 500, 90, textureX, textureY); // Box 47
		bodyModel[141] = new ModelRendererTurbo(this, 500, 90, textureX, textureY); // Box 48
		bodyModel[142] = new ModelRendererTurbo(this, 500, 90, textureX, textureY); // Box 49
		bodyModel[143] = new ModelRendererTurbo(this, 500, 40, textureX, textureY); // Box 50
		bodyModel[144] = new ModelRendererTurbo(this, 500, 70, textureX, textureY); // Box 51
		bodyModel[145] = new ModelRendererTurbo(this, 500, 70, textureX, textureY); // Box 52
		bodyModel[146] = new ModelRendererTurbo(this, 500, 70, textureX, textureY); // Box 53
		bodyModel[147] = new ModelRendererTurbo(this, 500, 70, textureX, textureY); // Box 54
		bodyModel[148] = new ModelRendererTurbo(this, 500, 70, textureX, textureY); // Box 55
		bodyModel[149] = new ModelRendererTurbo(this, 500, 70, textureX, textureY); // Box 56
		bodyModel[150] = new ModelRendererTurbo(this, 500, 70, textureX, textureY); // Box 57
		bodyModel[151] = new ModelRendererTurbo(this, 500, 70, textureX, textureY); // Box 58
		bodyModel[152] = new ModelRendererTurbo(this, 500, 70, textureX, textureY); // Box 59
		bodyModel[153] = new ModelRendererTurbo(this, 500, 70, textureX, textureY); // Box 60
		bodyModel[154] = new ModelRendererTurbo(this, 500, 70, textureX, textureY); // Box 61
		bodyModel[155] = new ModelRendererTurbo(this, 500, 70, textureX, textureY); // Box 62
		bodyModel[156] = new ModelRendererTurbo(this, 500, 70, textureX, textureY); // Box 63
		bodyModel[157] = new ModelRendererTurbo(this, 500, 70, textureX, textureY); // Box 64
		bodyModel[158] = new ModelRendererTurbo(this, 500, 70, textureX, textureY); // Box 65
		bodyModel[159] = new ModelRendererTurbo(this, 500, 70, textureX, textureY); // Box 66
		bodyModel[160] = new ModelRendererTurbo(this, 500, 20, textureX, textureY); // Box 67
		bodyModel[161] = new ModelRendererTurbo(this, 500, 10, textureX, textureY); // Box 68
		bodyModel[162] = new ModelRendererTurbo(this, 500, 0, textureX, textureY); // Box 69
		bodyModel[163] = new ModelRendererTurbo(this, 509, 213, textureX, textureY); // Box 70
		bodyModel[164] = new ModelRendererTurbo(this, 509, 213, textureX, textureY); // Box 71
		bodyModel[165] = new ModelRendererTurbo(this, 509, 236, textureX, textureY); // Box 72
		bodyModel[166] = new ModelRendererTurbo(this, 500, 120, textureX, textureY); // Box 73
		bodyModel[167] = new ModelRendererTurbo(this, 500, 110, textureX, textureY); // Box 74
		bodyModel[168] = new ModelRendererTurbo(this, 500, 130, textureX, textureY); // Box 75
		bodyModel[169] = new ModelRendererTurbo(this, 500, 230, textureX, textureY); // Box 77
		bodyModel[170] = new ModelRendererTurbo(this, 500, 210, textureX, textureY); // Box 78
		bodyModel[171] = new ModelRendererTurbo(this, 500, 150, textureX, textureY); // Box 79
		bodyModel[172] = new ModelRendererTurbo(this, 500, 210, textureX, textureY); // Box 80
		bodyModel[173] = new ModelRendererTurbo(this, 500, 230, textureX, textureY); // Box 81
		bodyModel[174] = new ModelRendererTurbo(this, 500, 250, textureX, textureY); // Box 82
		bodyModel[175] = new ModelRendererTurbo(this, 500, 140, textureX, textureY); // Box 83
		bodyModel[176] = new ModelRendererTurbo(this, 500, 140, textureX, textureY); // Box 84
		bodyModel[177] = new ModelRendererTurbo(this, 500, 140, textureX, textureY); // Box 85
		bodyModel[178] = new ModelRendererTurbo(this, 500, 140, textureX, textureY); // Box 86
		bodyModel[179] = new ModelRendererTurbo(this, 500, 140, textureX, textureY); // Box 87
		bodyModel[180] = new ModelRendererTurbo(this, 500, 140, textureX, textureY); // Box 88
		bodyModel[181] = new ModelRendererTurbo(this, 500, 140, textureX, textureY); // Box 89
		bodyModel[182] = new ModelRendererTurbo(this, 500, 140, textureX, textureY); // Box 90
		bodyModel[183] = new ModelRendererTurbo(this, 500, 140, textureX, textureY); // Box 91
		bodyModel[184] = new ModelRendererTurbo(this, 500, 140, textureX, textureY); // Box 92
		bodyModel[185] = new ModelRendererTurbo(this, 500, 140, textureX, textureY); // Box 93
		bodyModel[186] = new ModelRendererTurbo(this, 500, 140, textureX, textureY); // Box 94
		bodyModel[187] = new ModelRendererTurbo(this, 500, 140, textureX, textureY); // Box 95
		bodyModel[188] = new ModelRendererTurbo(this, 500, 140, textureX, textureY); // Box 96
		bodyModel[189] = new ModelRendererTurbo(this, 500, 140, textureX, textureY); // Box 97
		bodyModel[190] = new ModelRendererTurbo(this, 500, 140, textureX, textureY); // Box 98
		bodyModel[191] = new ModelRendererTurbo(this, 500, 250, textureX, textureY); // Box 99
		bodyModel[192] = new ModelRendererTurbo(this, 500, 320, textureX, textureY); // Box 101
		bodyModel[193] = new ModelRendererTurbo(this, 500, 320, textureX, textureY); // Box 103
		bodyModel[194] = new ModelRendererTurbo(this, 500, 320, textureX, textureY); // Box 104
		bodyModel[195] = new ModelRendererTurbo(this, 145, 313, textureX, textureY); // Box 41
		bodyModel[196] = new ModelRendererTurbo(this, 801, 233, textureX, textureY); // Box 43
		bodyModel[197] = new ModelRendererTurbo(this, 585, 201, textureX, textureY); // Box 44
		bodyModel[198] = new ModelRendererTurbo(this, 617, 201, textureX, textureY); // Box 45
		bodyModel[199] = new ModelRendererTurbo(this, 937, 249, textureX, textureY); // Box 0
		bodyModel[200] = new ModelRendererTurbo(this, 825, 281, textureX, textureY); // Box 1
		bodyModel[201] = new ModelRendererTurbo(this, 993, 201, textureX, textureY); // Box 2
		bodyModel[202] = new ModelRendererTurbo(this, 1017, 25, textureX, textureY); // Box 871
		bodyModel[203] = new ModelRendererTurbo(this, 553, 25, textureX, textureY); // Box 872
		bodyModel[204] = new ModelRendererTurbo(this, 793, 9, textureX, textureY); // Box 873
		bodyModel[205] = new ModelRendererTurbo(this, 49, 217, textureX, textureY); // Box 874
		bodyModel[206] = new ModelRendererTurbo(this, 521, 17, textureX, textureY); // Box 875
		bodyModel[207] = new ModelRendererTurbo(this, 513, 33, textureX, textureY); // Box 876
		bodyModel[208] = new ModelRendererTurbo(this, 881, 33, textureX, textureY); // Box 877
		bodyModel[209] = new ModelRendererTurbo(this, 89, 265, textureX, textureY); // Box 877
		bodyModel[210] = new ModelRendererTurbo(this, 465, 297, textureX, textureY); // Box 882

		bodyModel[0].addShapeBox(0F, -17F, -10.5F, 20, 28, 4, 0F,0F, -6.5F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -3.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F); // Box 1
		bodyModel[0].setRotationPoint(-67F, -28F, 0F);

		bodyModel[1].addShapeBox(0F, -17F, 6.5F, 20, 28, 4, 0F,0F, -3.5F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, -6.5F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 2
		bodyModel[1].setRotationPoint(-67F, -28F, 0F);

		bodyModel[2].addShapeBox(0F, -17F, -10.5F, 64, 27, 4, 0F,0F, -1.5F, 0F, 0F, -5.F, 0F, 0F, -2.5F, 0F, 0F, 1.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F); // Box 4
		bodyModel[2].setRotationPoint(-47F, -27F, 0F);

		bodyModel[3].addShapeBox(0F, -17F, 6.5F, 64, 27, 4, 0F,0F, 1.5F, 0F, 0F, -2.5F, 0F, 0F, -5F, 0F, 0F, -1.5F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 5
		bodyModel[3].setRotationPoint(-47F, -27F, 0F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[4].setRotationPoint(-21F, -48F, -0.5F);
		bodyModel[4].rotateAngleZ = -0.10471976F;

		bodyModel[5].addShapeBox(0F, -1F, -3F, 3, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // engine
		bodyModel[5].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[5].rotateAngleZ = -0.05235988F;

		bodyModel[6].addShapeBox(0F, -3F, -3F, 3, 2, 6, 0F,0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 20
		bodyModel[6].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[6].rotateAngleZ = -0.05235988F;

		bodyModel[7].addShapeBox(0F, 1F, -3F, 3, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F); // Box 21
		bodyModel[7].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[7].rotateAngleZ = -0.05235988F;

		bodyModel[8].addShapeBox(-1F, -12F, -2F, 34, 3, 4, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // engine
		bodyModel[8].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[8].rotateAngleZ = -0.05235988F;

		bodyModel[9].addShapeBox(-1F, -12F, -2F, 34, 3, 4, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // engine
		bodyModel[9].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[9].rotateAngleX = 0.39269908F;
		bodyModel[9].rotateAngleZ = -0.05235988F;

		bodyModel[10].addShapeBox(-1F, -12F, -2F, 34, 3, 4, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[10].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[10].rotateAngleX = 0.78539816F;
		bodyModel[10].rotateAngleZ = -0.05235988F;

		bodyModel[11].addShapeBox(-1F, -12F, -2F, 34, 3, 4, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[11].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[11].rotateAngleX = 1.57079633F;
		bodyModel[11].rotateAngleZ = -0.05235988F;

		bodyModel[12].addShapeBox(-1F, -12F, -2F, 34, 3, 4, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[12].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[12].rotateAngleX = 1.96349541F;
		bodyModel[12].rotateAngleZ = -0.05235988F;

		bodyModel[13].addShapeBox(-1F, -12F, -2F, 34, 3, 4, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[13].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[13].rotateAngleX = 1.17809725F;
		bodyModel[13].rotateAngleZ = -0.05235988F;

		bodyModel[14].addShapeBox(-1F, -12F, -2F, 34, 3, 4, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[14].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[14].rotateAngleX = 2.35619449F;
		bodyModel[14].rotateAngleZ = -0.05235988F;

		bodyModel[15].addShapeBox(-1F, -12F, -2F, 34, 3, 4, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[15].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[15].rotateAngleX = 2.74889357F;
		bodyModel[15].rotateAngleZ = -0.05235988F;

		bodyModel[16].addShapeBox(-1F, -12F, -2F, 34, 3, 4, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[16].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[16].rotateAngleX = 3.14159265F;
		bodyModel[16].rotateAngleZ = -0.05235988F;

		bodyModel[17].addShapeBox(-1F, -12F, -2F, 34, 3, 4, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[17].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[17].rotateAngleX = 3.53429174F;
		bodyModel[17].rotateAngleZ = -0.05235988F;

		bodyModel[18].addShapeBox(-1F, -12F, -2F, 34, 3, 4, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[18].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[18].rotateAngleX = 3.92699082F;
		bodyModel[18].rotateAngleZ = -0.05235988F;

		bodyModel[19].addShapeBox(-1F, -12F, -2F, 34, 3, 4, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[19].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[19].rotateAngleX = 4.3196899F;
		bodyModel[19].rotateAngleZ = -0.05235988F;

		bodyModel[20].addShapeBox(-1F, -12F, -2F, 34, 3, 4, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[20].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[20].rotateAngleX = 4.71238898F;
		bodyModel[20].rotateAngleZ = -0.05235988F;

		bodyModel[21].addShapeBox(-1F, -12F, -2F, 34, 3, 4, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[21].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[21].rotateAngleX = 5.10508806F;
		bodyModel[21].rotateAngleZ = -0.05235988F;

		bodyModel[22].addShapeBox(-1F, -12F, -2F, 34, 3, 4, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[22].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[22].rotateAngleX = 5.49778714F;
		bodyModel[22].rotateAngleZ = -0.05235988F;

		bodyModel[23].addShapeBox(-1F, -12F, -2F, 34, 3, 4, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[23].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[23].rotateAngleX = 5.89048623F;
		bodyModel[23].rotateAngleZ = -0.05235988F;

		bodyModel[24].addShapeBox(-8F, -12F, -2F, 7, 5, 4, 0F,0F, -2F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[24].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[24].rotateAngleZ = -0.05235988F;

		bodyModel[25].addShapeBox(-8F, -12F, -2F, 7, 5, 4, 0F,0F, -2F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[25].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[25].rotateAngleX = 0.39269908F;
		bodyModel[25].rotateAngleZ = -0.05235988F;

		bodyModel[26].addShapeBox(-8F, -12F, -2F, 7, 5, 4, 0F,0F, -2F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[26].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[26].rotateAngleX = 0.78539816F;
		bodyModel[26].rotateAngleZ = -0.05235988F;

		bodyModel[27].addShapeBox(-8F, -12F, -2F, 7, 5, 4, 0F,0F, -2F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[27].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[27].rotateAngleX = 1.17809725F;
		bodyModel[27].rotateAngleZ = -0.05235988F;

		bodyModel[28].addShapeBox(-8F, -12F, -2F, 7, 5, 4, 0F,0F, -2F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[28].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[28].rotateAngleX = 1.57079633F;
		bodyModel[28].rotateAngleZ = -0.05235988F;

		bodyModel[29].addShapeBox(-8F, -12F, -2F, 7, 5, 4, 0F,0F, -2F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[29].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[29].rotateAngleX = 3.14159265F;
		bodyModel[29].rotateAngleZ = -0.05235988F;

		bodyModel[30].addShapeBox(-8F, -12F, -2F, 7, 5, 4, 0F,0F, -2F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[30].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[30].rotateAngleX = 4.71238898F;
		bodyModel[30].rotateAngleZ = -0.05235988F;

		bodyModel[31].addShapeBox(-8F, -12F, -2F, 7, 5, 4, 0F,0F, -2F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[31].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[31].rotateAngleX = 1.96349541F;
		bodyModel[31].rotateAngleZ = -0.05235988F;

		bodyModel[32].addShapeBox(-8F, -12F, -2F, 7, 5, 4, 0F,0F, -2F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[32].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[32].rotateAngleX = 2.35619449F;
		bodyModel[32].rotateAngleZ = -0.05235988F;

		bodyModel[33].addShapeBox(-8F, -12F, -2F, 7, 5, 4, 0F,0F, -2F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[33].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[33].rotateAngleX = 2.74889357F;
		bodyModel[33].rotateAngleZ = -0.05235988F;

		bodyModel[34].addShapeBox(-8F, -12F, -2F, 7, 5, 4, 0F,0F, -2F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[34].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[34].rotateAngleX = 5.89048623F;
		bodyModel[34].rotateAngleZ = -0.05235988F;

		bodyModel[35].addShapeBox(-8F, -12F, -2F, 7, 5, 4, 0F,0F, -2F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[35].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[35].rotateAngleX = 5.49778714F;
		bodyModel[35].rotateAngleZ = -0.05235988F;

		bodyModel[36].addShapeBox(-8F, -12F, -2F, 7, 5, 4, 0F,0F, -2F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[36].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[36].rotateAngleX = 5.10508806F;
		bodyModel[36].rotateAngleZ = -0.05235988F;

		bodyModel[37].addShapeBox(-8F, -12F, -2F, 7, 5, 4, 0F,0F, -2F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[37].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[37].rotateAngleX = 4.3196899F;
		bodyModel[37].rotateAngleZ = -0.05235988F;

		bodyModel[38].addShapeBox(-8F, -12F, -2F, 7, 5, 4, 0F,0F, -2F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[38].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[38].rotateAngleX = 3.92699082F;
		bodyModel[38].rotateAngleZ = -0.05235988F;

		bodyModel[39].addShapeBox(-8F, -12F, -2F, 7, 5, 4, 0F,0F, -2F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[39].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[39].rotateAngleX = 3.53429174F;
		bodyModel[39].rotateAngleZ = -0.05235988F;

		bodyModel[40].addShapeBox(33F, -12F, -2F, 11, 3, 4, 0F,0F, 0F, 0.4F, 0F, -4F, -0.4F, 0F, -4F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F); // Box 56
		bodyModel[40].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[40].rotateAngleZ = -0.05235988F;

		bodyModel[41].addShapeBox(33F, -12F, -2F, 11, 3, 4, 0F,0F, 0F, 0.4F, 0F, -4F, -0.4F, 0F, -4F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F); // Box 57
		bodyModel[41].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[41].rotateAngleX = 0.39269908F;
		bodyModel[41].rotateAngleZ = -0.05235988F;

		bodyModel[42].addShapeBox(33F, -12F, -2F, 11, 3, 4, 0F,0F, 0F, 0.4F, 0F, -4F, -0.4F, 0F, -4F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F); // Box 58
		bodyModel[42].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[42].rotateAngleX = 0.78539816F;
		bodyModel[42].rotateAngleZ = -0.05235988F;

		bodyModel[43].addShapeBox(33F, -12F, -2F, 11, 3, 4, 0F,0F, 0F, 0.4F, 0F, -4F, -0.4F, 0F, -4F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F); // Box 59
		bodyModel[43].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[43].rotateAngleX = 1.17809725F;
		bodyModel[43].rotateAngleZ = -0.05235988F;

		bodyModel[44].addShapeBox(33F, -12F, -2F, 11, 3, 4, 0F,0F, 0F, 0.4F, 0F, -4F, -0.4F, 0F, -4F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F); // Box 60
		bodyModel[44].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[44].rotateAngleX = 1.57079633F;
		bodyModel[44].rotateAngleZ = -0.05235988F;

		bodyModel[45].addShapeBox(33F, -12F, -2F, 11, 3, 4, 0F,0F, 0F, 0.4F, 0F, -4F, -0.4F, 0F, -4F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F); // Box 61
		bodyModel[45].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[45].rotateAngleX = 1.96349541F;
		bodyModel[45].rotateAngleZ = -0.05235988F;

		bodyModel[46].addShapeBox(33F, -12F, -2F, 11, 3, 4, 0F,0F, 0F, 0.4F, 0F, -4F, -0.4F, 0F, -4F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F); // Box 62
		bodyModel[46].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[46].rotateAngleX = 2.35619449F;
		bodyModel[46].rotateAngleZ = -0.05235988F;

		bodyModel[47].addShapeBox(33F, -12F, -2F, 11, 3, 4, 0F,0F, 0F, 0.4F, 0F, -4F, -0.4F, 0F, -4F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F); // Box 63
		bodyModel[47].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[47].rotateAngleX = 3.14159265F;
		bodyModel[47].rotateAngleZ = -0.05235988F;

		bodyModel[48].addShapeBox(33F, -12F, -2F, 11, 3, 4, 0F,0F, 0F, 0.4F, 0F, -4F, -0.4F, 0F, -4F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F); // Box 64
		bodyModel[48].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[48].rotateAngleX = 2.74889357F;
		bodyModel[48].rotateAngleZ = -0.05235988F;

		bodyModel[49].addShapeBox(33F, -12F, -2F, 11, 3, 4, 0F,0F, 0F, 0.4F, 0F, -4F, -0.4F, 0F, -4F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F); // Box 65
		bodyModel[49].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[49].rotateAngleX = 3.53429174F;
		bodyModel[49].rotateAngleZ = -0.05235988F;

		bodyModel[50].addShapeBox(33F, -12F, -2F, 11, 3, 4, 0F,0F, 0F, 0.4F, 0F, -4F, -0.4F, 0F, -4F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F); // Box 66
		bodyModel[50].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[50].rotateAngleX = 3.92699082F;
		bodyModel[50].rotateAngleZ = -0.05235988F;

		bodyModel[51].addShapeBox(33F, -12F, -2F, 11, 3, 4, 0F,0F, 0F, 0.4F, 0F, -4F, -0.4F, 0F, -4F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F); // Box 67
		bodyModel[51].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[51].rotateAngleX = 4.3196899F;
		bodyModel[51].rotateAngleZ = -0.05235988F;

		bodyModel[52].addShapeBox(33F, -12F, -2F, 11, 3, 4, 0F,0F, 0F, 0.4F, 0F, -4F, -0.4F, 0F, -4F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F); // Box 68
		bodyModel[52].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[52].rotateAngleX = 5.10508806F;
		bodyModel[52].rotateAngleZ = -0.05235988F;

		bodyModel[53].addShapeBox(33F, -12F, -2F, 11, 3, 4, 0F,0F, 0F, 0.4F, 0F, -4F, -0.4F, 0F, -4F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F); // Box 69
		bodyModel[53].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[53].rotateAngleX = 5.49778714F;
		bodyModel[53].rotateAngleZ = -0.05235988F;

		bodyModel[54].addShapeBox(33F, -12F, -2F, 11, 3, 4, 0F,0F, 0F, 0.4F, 0F, -4F, -0.4F, 0F, -4F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F); // Box 70
		bodyModel[54].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[54].rotateAngleX = 4.71238898F;
		bodyModel[54].rotateAngleZ = -0.05235988F;

		bodyModel[55].addShapeBox(33F, -12F, -2F, 11, 3, 4, 0F,0F, 0F, 0.4F, 0F, -4F, -0.4F, 0F, -4F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F); // Box 71
		bodyModel[55].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[55].rotateAngleX = 5.89048623F;
		bodyModel[55].rotateAngleZ = -0.05235988F;

		bodyModel[56].addShapeBox(41F, -1F, -3F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 73
		bodyModel[56].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[56].rotateAngleZ = -0.05235988F;

		bodyModel[57].addShapeBox(41F, -3F, -3F, 3, 2, 6, 0F,0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 74
		bodyModel[57].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[57].rotateAngleZ = -0.05235988F;

		bodyModel[58].addShapeBox(41F, 1F, -3F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F); // Box 75
		bodyModel[58].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[58].rotateAngleZ = -0.05235988F;

		bodyModel[59].addShapeBox(36F, -7F, -1F, 11, 3, 2, 0F,0F, 0F, 0.4F, 0F, -2.5F, -0.1F, 0F, -2.5F, -0.1F, 0F, 0F, 0.4F, 0F, -2F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.4F); // Box 76
		bodyModel[59].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[59].rotateAngleZ = -0.05235988F;

		bodyModel[60].addShapeBox(36F, -7F, -1F, 11, 3, 2, 0F,0F, 0F, 0.4F, 0F, -2.5F, -0.1F, 0F, -2.5F, -0.1F, 0F, 0F, 0.4F, 0F, -2F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.4F); // Box 77
		bodyModel[60].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[60].rotateAngleX = 0.39269908F;
		bodyModel[60].rotateAngleZ = -0.05235988F;

		bodyModel[61].addShapeBox(36F, -7F, -1F, 11, 3, 2, 0F,0F, 0F, 0.4F, 0F, -2.5F, -0.1F, 0F, -2.5F, -0.1F, 0F, 0F, 0.4F, 0F, -2F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.4F); // Box 81
		bodyModel[61].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[61].rotateAngleX = 1.57079633F;
		bodyModel[61].rotateAngleZ = -0.05235988F;

		bodyModel[62].addShapeBox(36F, -7F, -1F, 11, 3, 2, 0F,0F, 0F, 0.4F, 0F, -2.5F, -0.1F, 0F, -2.5F, -0.1F, 0F, 0F, 0.4F, 0F, -2F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.4F); // Box 82
		bodyModel[62].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[62].rotateAngleX = 3.14159265F;
		bodyModel[62].rotateAngleZ = -0.05235988F;

		bodyModel[63].addShapeBox(36F, -7F, -1F, 11, 3, 2, 0F,0F, 0F, 0.4F, 0F, -2.5F, -0.1F, 0F, -2.5F, -0.1F, 0F, 0F, 0.4F, 0F, -2F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.4F); // Box 83
		bodyModel[63].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[63].rotateAngleX = 4.71238898F;
		bodyModel[63].rotateAngleZ = -0.05235988F;

		bodyModel[64].addShapeBox(36F, -7F, -1F, 11, 3, 2, 0F,0F, 0F, 0.4F, 0F, -2.5F, -0.1F, 0F, -2.5F, -0.1F, 0F, 0F, 0.4F, 0F, -2F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.4F); // Box 84
		bodyModel[64].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[64].rotateAngleX = 0.78539816F;
		bodyModel[64].rotateAngleZ = -0.05235988F;

		bodyModel[65].addShapeBox(36F, -7F, -1F, 11, 3, 2, 0F,0F, 0F, 0.4F, 0F, -2.5F, -0.1F, 0F, -2.5F, -0.1F, 0F, 0F, 0.4F, 0F, -2F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.4F); // Box 85
		bodyModel[65].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[65].rotateAngleX = 1.17809725F;
		bodyModel[65].rotateAngleZ = -0.05235988F;

		bodyModel[66].addShapeBox(36F, -7F, -1F, 11, 3, 2, 0F,0F, 0F, 0.4F, 0F, -2.5F, -0.1F, 0F, -2.5F, -0.1F, 0F, 0F, 0.4F, 0F, -2F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.4F); // Box 86
		bodyModel[66].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[66].rotateAngleX = 1.96349541F;
		bodyModel[66].rotateAngleZ = -0.05235988F;

		bodyModel[67].addShapeBox(36F, -7F, -1F, 11, 3, 2, 0F,0F, 0F, 0.4F, 0F, -2.5F, -0.1F, 0F, -2.5F, -0.1F, 0F, 0F, 0.4F, 0F, -2F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.4F); // Box 87
		bodyModel[67].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[67].rotateAngleX = 2.35619449F;
		bodyModel[67].rotateAngleZ = -0.05235988F;

		bodyModel[68].addShapeBox(36F, -7F, -1F, 11, 3, 2, 0F,0F, 0F, 0.4F, 0F, -2.5F, -0.1F, 0F, -2.5F, -0.1F, 0F, 0F, 0.4F, 0F, -2F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.4F); // Box 88
		bodyModel[68].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[68].rotateAngleX = 2.74889357F;
		bodyModel[68].rotateAngleZ = -0.05235988F;

		bodyModel[69].addShapeBox(36F, -7F, -1F, 11, 3, 2, 0F,0F, 0F, 0.4F, 0F, -2.5F, -0.1F, 0F, -2.5F, -0.1F, 0F, 0F, 0.4F, 0F, -2F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.4F); // Box 89
		bodyModel[69].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[69].rotateAngleX = 3.53429174F;
		bodyModel[69].rotateAngleZ = -0.05235988F;

		bodyModel[70].addShapeBox(36F, -7F, -1F, 11, 3, 2, 0F,0F, 0F, 0.4F, 0F, -2.5F, -0.1F, 0F, -2.5F, -0.1F, 0F, 0F, 0.4F, 0F, -2F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.4F); // Box 90
		bodyModel[70].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[70].rotateAngleX = 3.92699082F;
		bodyModel[70].rotateAngleZ = -0.05235988F;

		bodyModel[71].addShapeBox(36F, -7F, -1F, 11, 3, 2, 0F,0F, 0F, 0.4F, 0F, -2.5F, -0.1F, 0F, -2.5F, -0.1F, 0F, 0F, 0.4F, 0F, -2F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.4F); // Box 91
		bodyModel[71].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[71].rotateAngleX = 4.3196899F;
		bodyModel[71].rotateAngleZ = -0.05235988F;

		bodyModel[72].addShapeBox(36F, -7F, -1F, 11, 3, 2, 0F,0F, 0F, 0.4F, 0F, -2.5F, -0.1F, 0F, -2.5F, -0.1F, 0F, 0F, 0.4F, 0F, -2F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.4F); // Box 92
		bodyModel[72].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[72].rotateAngleX = 5.10508806F;
		bodyModel[72].rotateAngleZ = -0.05235988F;

		bodyModel[73].addShapeBox(36F, -7F, -1F, 11, 3, 2, 0F,0F, 0F, 0.4F, 0F, -2.5F, -0.1F, 0F, -2.5F, -0.1F, 0F, 0F, 0.4F, 0F, -2F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.4F); // Box 93
		bodyModel[73].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[73].rotateAngleX = 5.49778714F;
		bodyModel[73].rotateAngleZ = -0.05235988F;

		bodyModel[74].addShapeBox(36F, -7F, -1F, 11, 3, 2, 0F,0F, 0F, 0.4F, 0F, -2.5F, -0.1F, 0F, -2.5F, -0.1F, 0F, 0F, 0.4F, 0F, -2F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.4F); // Box 94
		bodyModel[74].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[74].rotateAngleX = 5.89048623F;
		bodyModel[74].rotateAngleZ = -0.05235988F;

		bodyModel[75].addShapeBox(36F, -9F, -4F, 1, 18, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[75].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[75].rotateAngleZ = -0.05235988F;

		bodyModel[76].addShapeBox(35F, -1F, -3F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[76].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[76].rotateAngleZ = -0.05235988F;

		bodyModel[77].addShapeBox(3F, -3F, -3F, 38, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[77].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[77].rotateAngleZ = -0.05235988F;

		bodyModel[78].addShapeBox(3F, 1F, -3F, 38, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 98
		bodyModel[78].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[78].rotateAngleZ = -0.05235988F;

		bodyModel[79].addShapeBox(36F, -8F, -6F, 1, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[79].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[79].rotateAngleZ = -0.05235988F;

		bodyModel[80].addShapeBox(36F, -6F, -8F, 1, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[80].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[80].rotateAngleZ = -0.05235988F;

		bodyModel[81].addShapeBox(36F, -5F, -9F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[81].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[81].rotateAngleZ = -0.05235988F;

		bodyModel[82].addShapeBox(36F, -8F, 4F, 1, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[82].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[82].rotateAngleZ = -0.05235988F;

		bodyModel[83].addShapeBox(36F, -6F, 6F, 1, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[83].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[83].rotateAngleZ = -0.05235988F;

		bodyModel[84].addShapeBox(36F, -5F, 8F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[84].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[84].rotateAngleZ = -0.05235988F;

		bodyModel[85].addShapeBox(3F, -1F, -3F, 38, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[85].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[85].rotateAngleZ = -0.05235988F;

		bodyModel[86].addShapeBox(-1F, -12F, -2F, 34, 3, 4, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[86].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[86].rotateAngleZ = -0.05235988F;

		bodyModel[87].addShapeBox(-1F, -12F, -2F, 34, 3, 4, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[87].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[87].rotateAngleX = 5.89048623F;
		bodyModel[87].rotateAngleZ = -0.05235988F;

		bodyModel[88].addShapeBox(-1F, -12F, -2F, 34, 3, 4, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[88].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[88].rotateAngleX = 5.49778714F;
		bodyModel[88].rotateAngleZ = -0.05235988F;

		bodyModel[89].addShapeBox(-1F, -12F, -2F, 34, 3, 4, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[89].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[89].rotateAngleX = 5.10508806F;
		bodyModel[89].rotateAngleZ = -0.05235988F;

		bodyModel[90].addShapeBox(-1F, -12F, -2F, 34, 3, 4, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[90].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[90].rotateAngleX = 4.71238898F;
		bodyModel[90].rotateAngleZ = -0.05235988F;

		bodyModel[91].addShapeBox(-1F, -12F, -2F, 34, 3, 4, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[91].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[91].rotateAngleX = 0.39269908F;
		bodyModel[91].rotateAngleZ = -0.05235988F;

		bodyModel[92].addShapeBox(-3F, -6F, -18F, 5, 5, 23, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // houden
		bodyModel[92].setRotationPoint(79F, -28F, -8F);
		bodyModel[92].rotateAngleX = -0.43633231F;
		bodyModel[92].rotateAngleY = -1.01229097F;
		bodyModel[92].rotateAngleZ = -0.08726646F;

		bodyModel[93].addShapeBox(-1F, -12F, -2F, 34, 3, 4, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[93].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[93].rotateAngleX = 1.57079633F;
		bodyModel[93].rotateAngleZ = -0.05235988F;

		bodyModel[94].addShapeBox(-1F, -12F, -2F, 34, 3, 4, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[94].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[94].rotateAngleX = 1.17809725F;
		bodyModel[94].rotateAngleZ = -0.05235988F;

		bodyModel[95].addShapeBox(-1F, -12F, -2F, 34, 3, 4, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[95].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[95].rotateAngleX = 0.78539816F;
		bodyModel[95].rotateAngleZ = -0.05235988F;

		bodyModel[96].addShapeBox(-1F, -12F, -2F, 34, 3, 4, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[96].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[96].rotateAngleX = 1.96349541F;
		bodyModel[96].rotateAngleZ = -0.05235988F;

		bodyModel[97].addShapeBox(-1F, -12F, -2F, 34, 3, 4, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[97].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[97].rotateAngleX = 2.35619449F;
		bodyModel[97].rotateAngleZ = -0.05235988F;

		bodyModel[98].addShapeBox(-1F, -12F, -2F, 34, 3, 4, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[98].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[98].rotateAngleX = 2.74889357F;
		bodyModel[98].rotateAngleZ = -0.05235988F;

		bodyModel[99].addShapeBox(-1F, -12F, -2F, 34, 3, 4, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[99].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[99].rotateAngleX = 3.14159265F;
		bodyModel[99].rotateAngleZ = -0.05235988F;

		bodyModel[100].addShapeBox(-1F, -12F, -2F, 34, 3, 4, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[100].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[100].rotateAngleX = 3.53429174F;
		bodyModel[100].rotateAngleZ = -0.05235988F;

		bodyModel[101].addShapeBox(-1F, -12F, -2F, 34, 3, 4, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[101].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[101].rotateAngleX = 3.92699082F;
		bodyModel[101].rotateAngleZ = -0.05235988F;

		bodyModel[102].addShapeBox(33F, -12F, -2F, 11, 3, 4, 0F,0F, 0F, 0.4F, 0F, -4F, -0.4F, 0F, -4F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F); // Box 9
		bodyModel[102].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[102].rotateAngleX = 4.3196899F;
		bodyModel[102].rotateAngleZ = -0.05235988F;

		bodyModel[103].addShapeBox(33F, -12F, -2F, 11, 3, 4, 0F,0F, 0F, 0.4F, 0F, -4F, -0.4F, 0F, -4F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F); // Box 10
		bodyModel[103].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[103].rotateAngleX = 4.71238898F;
		bodyModel[103].rotateAngleZ = -0.05235988F;

		bodyModel[104].addShapeBox(33F, -12F, -2F, 11, 3, 4, 0F,0F, 0F, 0.4F, 0F, -4F, -0.4F, 0F, -4F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F); // Box 11
		bodyModel[104].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[104].rotateAngleX = 5.10508806F;
		bodyModel[104].rotateAngleZ = -0.05235988F;

		bodyModel[105].addShapeBox(33F, -12F, -2F, 11, 3, 4, 0F,0F, 0F, 0.4F, 0F, -4F, -0.4F, 0F, -4F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F); // Box 12
		bodyModel[105].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[105].rotateAngleX = 5.49778714F;
		bodyModel[105].rotateAngleZ = -0.05235988F;

		bodyModel[106].addShapeBox(33F, -12F, -2F, 11, 3, 4, 0F,0F, 0F, 0.4F, 0F, -4F, -0.4F, 0F, -4F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F); // Box 13
		bodyModel[106].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[106].rotateAngleX = 5.89048623F;
		bodyModel[106].rotateAngleZ = -0.05235988F;

		bodyModel[107].addShapeBox(33F, -12F, -2F, 11, 3, 4, 0F,0F, 0F, 0.4F, 0F, -4F, -0.4F, 0F, -4F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F); // Box 14
		bodyModel[107].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[107].rotateAngleZ = -0.05235988F;

		bodyModel[108].addShapeBox(33F, -12F, -2F, 11, 3, 4, 0F,0F, 0F, 0.4F, 0F, -4F, -0.4F, 0F, -4F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F); // Box 15
		bodyModel[108].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[108].rotateAngleX = 0.39269908F;
		bodyModel[108].rotateAngleZ = -0.05235988F;

		bodyModel[109].addShapeBox(33F, -12F, -2F, 11, 3, 4, 0F,0F, 0F, 0.4F, 0F, -4F, -0.4F, 0F, -4F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F); // Box 16
		bodyModel[109].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[109].rotateAngleX = 0.78539816F;
		bodyModel[109].rotateAngleZ = -0.05235988F;

		bodyModel[110].addShapeBox(33F, -12F, -2F, 11, 3, 4, 0F,0F, 0F, 0.4F, 0F, -4F, -0.4F, 0F, -4F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F); // Box 17
		bodyModel[110].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[110].rotateAngleX = 1.17809725F;
		bodyModel[110].rotateAngleZ = -0.05235988F;

		bodyModel[111].addShapeBox(33F, -12F, -2F, 11, 3, 4, 0F,0F, 0F, 0.4F, 0F, -4F, -0.4F, 0F, -4F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F); // Box 18
		bodyModel[111].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[111].rotateAngleX = 1.57079633F;
		bodyModel[111].rotateAngleZ = -0.05235988F;

		bodyModel[112].addShapeBox(33F, -12F, -2F, 11, 3, 4, 0F,0F, 0F, 0.4F, 0F, -4F, -0.4F, 0F, -4F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F); // Box 19
		bodyModel[112].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[112].rotateAngleX = 1.96349541F;
		bodyModel[112].rotateAngleZ = -0.05235988F;

		bodyModel[113].addShapeBox(33F, -12F, -2F, 11, 3, 4, 0F,0F, 0F, 0.4F, 0F, -4F, -0.4F, 0F, -4F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F); // Box 20
		bodyModel[113].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[113].rotateAngleX = 2.74889357F;
		bodyModel[113].rotateAngleZ = -0.05235988F;

		bodyModel[114].addShapeBox(33F, -12F, -2F, 11, 3, 4, 0F,0F, 0F, 0.4F, 0F, -4F, -0.4F, 0F, -4F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F); // Box 21
		bodyModel[114].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[114].rotateAngleX = 2.35619449F;
		bodyModel[114].rotateAngleZ = -0.05235988F;

		bodyModel[115].addShapeBox(33F, -12F, -2F, 11, 3, 4, 0F,0F, 0F, 0.4F, 0F, -4F, -0.4F, 0F, -4F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F); // Box 22
		bodyModel[115].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[115].rotateAngleX = 3.14159265F;
		bodyModel[115].rotateAngleZ = -0.05235988F;

		bodyModel[116].addShapeBox(33F, -12F, -2F, 11, 3, 4, 0F,0F, 0F, 0.4F, 0F, -4F, -0.4F, 0F, -4F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F); // Box 23
		bodyModel[116].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[116].rotateAngleX = 3.53429174F;
		bodyModel[116].rotateAngleZ = -0.05235988F;

		bodyModel[117].addShapeBox(33F, -12F, -2F, 11, 3, 4, 0F,0F, 0F, 0.4F, 0F, -4F, -0.4F, 0F, -4F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F); // Box 24
		bodyModel[117].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[117].rotateAngleX = 3.92699082F;
		bodyModel[117].rotateAngleZ = -0.05235988F;

		bodyModel[118].addShapeBox(-1F, -12F, -2F, 34, 3, 4, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[118].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[118].rotateAngleX = 1.57079633F;
		bodyModel[118].rotateAngleZ = -0.05235988F;

		bodyModel[119].addShapeBox(-1F, -12F, -2F, 34, 3, 4, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[119].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[119].rotateAngleX = 1.17809725F;
		bodyModel[119].rotateAngleZ = -0.05235988F;

		bodyModel[120].addShapeBox(-1F, -12F, -2F, 34, 3, 4, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[120].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[120].rotateAngleX = 0.78539816F;
		bodyModel[120].rotateAngleZ = -0.05235988F;

		bodyModel[121].addShapeBox(-1F, -12F, -2F, 34, 3, 4, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[121].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[121].rotateAngleX = 1.96349541F;
		bodyModel[121].rotateAngleZ = -0.05235988F;

		bodyModel[122].addShapeBox(-1F, -12F, -2F, 34, 3, 4, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[122].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[122].rotateAngleX = 2.35619449F;
		bodyModel[122].rotateAngleZ = -0.05235988F;

		bodyModel[123].addShapeBox(-1F, -12F, -2F, 34, 3, 4, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[123].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[123].rotateAngleX = 2.74889357F;
		bodyModel[123].rotateAngleZ = -0.05235988F;

		bodyModel[124].addShapeBox(-1F, -12F, -2F, 34, 3, 4, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[124].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[124].rotateAngleX = 3.14159265F;
		bodyModel[124].rotateAngleZ = -0.05235988F;

		bodyModel[125].addShapeBox(-1F, -12F, -2F, 34, 3, 4, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[125].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[125].rotateAngleX = 3.53429174F;
		bodyModel[125].rotateAngleZ = -0.05235988F;

		bodyModel[126].addShapeBox(-1F, -12F, -2F, 34, 3, 4, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[126].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[126].rotateAngleX = 3.92699082F;
		bodyModel[126].rotateAngleZ = -0.05235988F;

		bodyModel[127].addShapeBox(33F, -12F, -2F, 11, 3, 4, 0F,0F, 0F, 0.4F, 0F, -4F, -0.4F, 0F, -4F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F); // Box 34
		bodyModel[127].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[127].rotateAngleX = 4.3196899F;
		bodyModel[127].rotateAngleZ = -0.05235988F;

		bodyModel[128].addShapeBox(33F, -12F, -2F, 11, 3, 4, 0F,0F, 0F, 0.4F, 0F, -4F, -0.4F, 0F, -4F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F); // Box 35
		bodyModel[128].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[128].rotateAngleX = 4.71238898F;
		bodyModel[128].rotateAngleZ = -0.05235988F;

		bodyModel[129].addShapeBox(33F, -12F, -2F, 11, 3, 4, 0F,0F, 0F, 0.4F, 0F, -4F, -0.4F, 0F, -4F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F); // Box 36
		bodyModel[129].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[129].rotateAngleX = 5.10508806F;
		bodyModel[129].rotateAngleZ = -0.05235988F;

		bodyModel[130].addShapeBox(33F, -12F, -2F, 11, 3, 4, 0F,0F, 0F, 0.4F, 0F, -4F, -0.4F, 0F, -4F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F); // Box 37
		bodyModel[130].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[130].rotateAngleX = 5.49778714F;
		bodyModel[130].rotateAngleZ = -0.05235988F;

		bodyModel[131].addShapeBox(33F, -12F, -2F, 11, 3, 4, 0F,0F, 0F, 0.4F, 0F, -4F, -0.4F, 0F, -4F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F); // Box 38
		bodyModel[131].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[131].rotateAngleX = 5.89048623F;
		bodyModel[131].rotateAngleZ = -0.05235988F;

		bodyModel[132].addShapeBox(33F, -12F, -2F, 11, 3, 4, 0F,0F, 0F, 0.4F, 0F, -4F, -0.4F, 0F, -4F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F); // Box 39
		bodyModel[132].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[132].rotateAngleZ = -0.05235988F;

		bodyModel[133].addShapeBox(33F, -12F, -2F, 11, 3, 4, 0F,0F, 0F, 0.4F, 0F, -4F, -0.4F, 0F, -4F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F); // Box 40
		bodyModel[133].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[133].rotateAngleX = 0.39269908F;
		bodyModel[133].rotateAngleZ = -0.05235988F;

		bodyModel[134].addShapeBox(33F, -12F, -2F, 11, 3, 4, 0F,0F, 0F, 0.4F, 0F, -4F, -0.4F, 0F, -4F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F); // Box 41
		bodyModel[134].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[134].rotateAngleX = 0.78539816F;
		bodyModel[134].rotateAngleZ = -0.05235988F;

		bodyModel[135].addShapeBox(33F, -12F, -2F, 11, 3, 4, 0F,0F, 0F, 0.4F, 0F, -4F, -0.4F, 0F, -4F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F); // Box 42
		bodyModel[135].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[135].rotateAngleX = 1.17809725F;
		bodyModel[135].rotateAngleZ = -0.05235988F;

		bodyModel[136].addShapeBox(33F, -12F, -2F, 11, 3, 4, 0F,0F, 0F, 0.4F, 0F, -4F, -0.4F, 0F, -4F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F); // Box 43
		bodyModel[136].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[136].rotateAngleX = 1.57079633F;
		bodyModel[136].rotateAngleZ = -0.05235988F;

		bodyModel[137].addShapeBox(33F, -12F, -2F, 11, 3, 4, 0F,0F, 0F, 0.4F, 0F, -4F, -0.4F, 0F, -4F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F); // Box 44
		bodyModel[137].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[137].rotateAngleX = 1.96349541F;
		bodyModel[137].rotateAngleZ = -0.05235988F;

		bodyModel[138].addShapeBox(33F, -12F, -2F, 11, 3, 4, 0F,0F, 0F, 0.4F, 0F, -4F, -0.4F, 0F, -4F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F); // Box 45
		bodyModel[138].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[138].rotateAngleX = 2.74889357F;
		bodyModel[138].rotateAngleZ = -0.05235988F;

		bodyModel[139].addShapeBox(33F, -12F, -2F, 11, 3, 4, 0F,0F, 0F, 0.4F, 0F, -4F, -0.4F, 0F, -4F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F); // Box 46
		bodyModel[139].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[139].rotateAngleX = 2.35619449F;
		bodyModel[139].rotateAngleZ = -0.05235988F;

		bodyModel[140].addShapeBox(33F, -12F, -2F, 11, 3, 4, 0F,0F, 0F, 0.4F, 0F, -4F, -0.4F, 0F, -4F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F); // Box 47
		bodyModel[140].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[140].rotateAngleX = 3.14159265F;
		bodyModel[140].rotateAngleZ = -0.05235988F;

		bodyModel[141].addShapeBox(33F, -12F, -2F, 11, 3, 4, 0F,0F, 0F, 0.4F, 0F, -4F, -0.4F, 0F, -4F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F); // Box 48
		bodyModel[141].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[141].rotateAngleX = 3.53429174F;
		bodyModel[141].rotateAngleZ = -0.05235988F;

		bodyModel[142].addShapeBox(33F, -12F, -2F, 11, 3, 4, 0F,0F, 0F, 0.4F, 0F, -4F, -0.4F, 0F, -4F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F); // Box 49
		bodyModel[142].setRotationPoint(35F, -42.5F, -24F);
		bodyModel[142].rotateAngleX = 3.92699082F;
		bodyModel[142].rotateAngleZ = -0.05235988F;

		bodyModel[143].addShapeBox(-1F, -12F, -2F, 34, 3, 4, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[143].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[143].rotateAngleX = 4.3196899F;
		bodyModel[143].rotateAngleZ = -0.05235988F;

		bodyModel[144].addShapeBox(-8F, -12F, -2F, 7, 5, 4, 0F,0F, -2F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[144].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[144].rotateAngleZ = -0.05235988F;

		bodyModel[145].addShapeBox(-8F, -12F, -2F, 7, 5, 4, 0F,0F, -2F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[145].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[145].rotateAngleX = 5.89048623F;
		bodyModel[145].rotateAngleZ = -0.05235988F;

		bodyModel[146].addShapeBox(-8F, -12F, -2F, 7, 5, 4, 0F,0F, -2F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[146].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[146].rotateAngleX = 0.39269908F;
		bodyModel[146].rotateAngleZ = -0.05235988F;

		bodyModel[147].addShapeBox(-8F, -12F, -2F, 7, 5, 4, 0F,0F, -2F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[147].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[147].rotateAngleX = 0.78539816F;
		bodyModel[147].rotateAngleZ = -0.05235988F;

		bodyModel[148].addShapeBox(-8F, -12F, -2F, 7, 5, 4, 0F,0F, -2F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[148].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[148].rotateAngleX = 1.17809725F;
		bodyModel[148].rotateAngleZ = -0.05235988F;

		bodyModel[149].addShapeBox(-8F, -12F, -2F, 7, 5, 4, 0F,0F, -2F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[149].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[149].rotateAngleX = 1.57079633F;
		bodyModel[149].rotateAngleZ = -0.05235988F;

		bodyModel[150].addShapeBox(-8F, -12F, -2F, 7, 5, 4, 0F,0F, -2F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[150].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[150].rotateAngleX = 1.96349541F;
		bodyModel[150].rotateAngleZ = -0.05235988F;

		bodyModel[151].addShapeBox(-8F, -12F, -2F, 7, 5, 4, 0F,0F, -2F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[151].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[151].rotateAngleX = 2.35619449F;
		bodyModel[151].rotateAngleZ = -0.05235988F;

		bodyModel[152].addShapeBox(-8F, -12F, -2F, 7, 5, 4, 0F,0F, -2F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[152].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[152].rotateAngleX = 2.74889357F;
		bodyModel[152].rotateAngleZ = -0.05235988F;

		bodyModel[153].addShapeBox(-8F, -12F, -2F, 7, 5, 4, 0F,0F, -2F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[153].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[153].rotateAngleX = 3.14159265F;
		bodyModel[153].rotateAngleZ = -0.05235988F;

		bodyModel[154].addShapeBox(-8F, -12F, -2F, 7, 5, 4, 0F,0F, -2F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[154].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[154].rotateAngleX = 3.53429174F;
		bodyModel[154].rotateAngleZ = -0.05235988F;

		bodyModel[155].addShapeBox(-8F, -12F, -2F, 7, 5, 4, 0F,0F, -2F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[155].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[155].rotateAngleX = 3.92699082F;
		bodyModel[155].rotateAngleZ = -0.05235988F;

		bodyModel[156].addShapeBox(-8F, -12F, -2F, 7, 5, 4, 0F,0F, -2F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[156].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[156].rotateAngleX = 4.3196899F;
		bodyModel[156].rotateAngleZ = -0.05235988F;

		bodyModel[157].addShapeBox(-8F, -12F, -2F, 7, 5, 4, 0F,0F, -2F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[157].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[157].rotateAngleX = 4.71238898F;
		bodyModel[157].rotateAngleZ = -0.05235988F;

		bodyModel[158].addShapeBox(-8F, -12F, -2F, 7, 5, 4, 0F,0F, -2F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[158].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[158].rotateAngleX = 5.49778714F;
		bodyModel[158].rotateAngleZ = -0.05235988F;

		bodyModel[159].addShapeBox(-8F, -12F, -2F, 7, 5, 4, 0F,0F, -2F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[159].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[159].rotateAngleX = 5.10508806F;
		bodyModel[159].rotateAngleZ = -0.05235988F;

		bodyModel[160].addShapeBox(0F, 1F, -3F, 3, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F); // Box 67
		bodyModel[160].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[160].rotateAngleZ = -0.05235988F;

		bodyModel[161].addShapeBox(0F, -1F, -3F, 3, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 68
		bodyModel[161].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[161].rotateAngleZ = -0.05235988F;

		bodyModel[162].addShapeBox(0F, -3F, -3F, 3, 2, 6, 0F,0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 69
		bodyModel[162].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[162].rotateAngleZ = -0.05235988F;

		bodyModel[163].addShapeBox(3F, -1F, -3F, 38, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[163].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[163].rotateAngleZ = -0.05235988F;

		bodyModel[164].addShapeBox(3F, -3F, -3F, 38, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[164].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[164].rotateAngleZ = -0.05235988F;

		bodyModel[165].addShapeBox(3F, 1F, -3F, 38, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 72
		bodyModel[165].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[165].rotateAngleZ = -0.05235988F;

		bodyModel[166].addShapeBox(41F, -3F, -3F, 3, 2, 6, 0F,0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 73
		bodyModel[166].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[166].rotateAngleZ = -0.05235988F;

		bodyModel[167].addShapeBox(41F, -1F, -3F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 74
		bodyModel[167].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[167].rotateAngleZ = -0.05235988F;

		bodyModel[168].addShapeBox(41F, 1F, -3F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F); // Box 75
		bodyModel[168].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[168].rotateAngleZ = -0.05235988F;

		bodyModel[169].addShapeBox(36F, -2F, -8F, 1, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[169].setRotationPoint(35F, -46.5F, 24F);
		bodyModel[169].rotateAngleZ = -0.05235988F;

		bodyModel[170].addShapeBox(36F, -8F, -6F, 1, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[170].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[170].rotateAngleZ = -0.05235988F;

		bodyModel[171].addShapeBox(36F, -9F, -4F, 1, 18, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[171].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[171].rotateAngleZ = -0.05235988F;

		bodyModel[172].addShapeBox(36F, -8F, 4F, 1, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[172].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[172].rotateAngleZ = -0.05235988F;

		bodyModel[173].addShapeBox(36F, -6F, 6F, 1, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[173].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[173].rotateAngleZ = -0.05235988F;

		bodyModel[174].addShapeBox(36F, -5F, 8F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[174].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[174].rotateAngleZ = -0.05235988F;

		bodyModel[175].addShapeBox(36F, -7F, -1F, 11, 3, 2, 0F,0F, 0F, 0.4F, 0F, -2.5F, -0.1F, 0F, -2.5F, -0.1F, 0F, 0F, 0.4F, 0F, -2F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.4F); // Box 83
		bodyModel[175].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[175].rotateAngleX = 0.78539816F;
		bodyModel[175].rotateAngleZ = -0.05235988F;

		bodyModel[176].addShapeBox(36F, -7F, -1F, 11, 3, 2, 0F,0F, 0F, 0.4F, 0F, -2.5F, -0.1F, 0F, -2.5F, -0.1F, 0F, 0F, 0.4F, 0F, -2F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.4F); // Box 84
		bodyModel[176].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[176].rotateAngleX = 0.39269908F;
		bodyModel[176].rotateAngleZ = -0.05235988F;

		bodyModel[177].addShapeBox(36F, -7F, -1F, 11, 3, 2, 0F,0F, 0F, 0.4F, 0F, -2.5F, -0.1F, 0F, -2.5F, -0.1F, 0F, 0F, 0.4F, 0F, -2F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.4F); // Box 85
		bodyModel[177].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[177].rotateAngleZ = -0.05235988F;

		bodyModel[178].addShapeBox(36F, -7F, -1F, 11, 3, 2, 0F,0F, 0F, 0.4F, 0F, -2.5F, -0.1F, 0F, -2.5F, -0.1F, 0F, 0F, 0.4F, 0F, -2F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.4F); // Box 86
		bodyModel[178].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[178].rotateAngleX = 5.89048623F;
		bodyModel[178].rotateAngleZ = -0.05235988F;

		bodyModel[179].addShapeBox(36F, -7F, -1F, 11, 3, 2, 0F,0F, 0F, 0.4F, 0F, -2.5F, -0.1F, 0F, -2.5F, -0.1F, 0F, 0F, 0.4F, 0F, -2F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.4F); // Box 87
		bodyModel[179].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[179].rotateAngleX = 5.49778714F;
		bodyModel[179].rotateAngleZ = -0.05235988F;

		bodyModel[180].addShapeBox(36F, -7F, -1F, 11, 3, 2, 0F,0F, 0F, 0.4F, 0F, -2.5F, -0.1F, 0F, -2.5F, -0.1F, 0F, 0F, 0.4F, 0F, -2F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.4F); // Box 88
		bodyModel[180].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[180].rotateAngleX = 5.10508806F;
		bodyModel[180].rotateAngleZ = -0.05235988F;

		bodyModel[181].addShapeBox(36F, -7F, -1F, 11, 3, 2, 0F,0F, 0F, 0.4F, 0F, -2.5F, -0.1F, 0F, -2.5F, -0.1F, 0F, 0F, 0.4F, 0F, -2F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.4F); // Box 89
		bodyModel[181].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[181].rotateAngleX = 4.71238898F;
		bodyModel[181].rotateAngleZ = -0.05235988F;

		bodyModel[182].addShapeBox(36F, -7F, -1F, 11, 3, 2, 0F,0F, 0F, 0.4F, 0F, -2.5F, -0.1F, 0F, -2.5F, -0.1F, 0F, 0F, 0.4F, 0F, -2F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.4F); // Box 90
		bodyModel[182].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[182].rotateAngleX = 4.3196899F;
		bodyModel[182].rotateAngleZ = -0.05235988F;

		bodyModel[183].addShapeBox(36F, -7F, -1F, 11, 3, 2, 0F,0F, 0F, 0.4F, 0F, -2.5F, -0.1F, 0F, -2.5F, -0.1F, 0F, 0F, 0.4F, 0F, -2F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.4F); // Box 91
		bodyModel[183].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[183].rotateAngleX = 3.92699082F;
		bodyModel[183].rotateAngleZ = -0.05235988F;

		bodyModel[184].addShapeBox(36F, -7F, -1F, 11, 3, 2, 0F,0F, 0F, 0.4F, 0F, -2.5F, -0.1F, 0F, -2.5F, -0.1F, 0F, 0F, 0.4F, 0F, -2F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.4F); // Box 92
		bodyModel[184].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[184].rotateAngleX = 3.53429174F;
		bodyModel[184].rotateAngleZ = -0.05235988F;

		bodyModel[185].addShapeBox(36F, -7F, -1F, 11, 3, 2, 0F,0F, 0F, 0.4F, 0F, -2.5F, -0.1F, 0F, -2.5F, -0.1F, 0F, 0F, 0.4F, 0F, -2F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.4F); // Box 93
		bodyModel[185].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[185].rotateAngleX = 3.14159265F;
		bodyModel[185].rotateAngleZ = -0.05235988F;

		bodyModel[186].addShapeBox(36F, -7F, -1F, 11, 3, 2, 0F,0F, 0F, 0.4F, 0F, -2.5F, -0.1F, 0F, -2.5F, -0.1F, 0F, 0F, 0.4F, 0F, -2F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.4F); // Box 94
		bodyModel[186].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[186].rotateAngleX = 2.74889357F;
		bodyModel[186].rotateAngleZ = -0.05235988F;

		bodyModel[187].addShapeBox(36F, -7F, -1F, 11, 3, 2, 0F,0F, 0F, 0.4F, 0F, -2.5F, -0.1F, 0F, -2.5F, -0.1F, 0F, 0F, 0.4F, 0F, -2F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.4F); // Box 95
		bodyModel[187].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[187].rotateAngleX = 2.35619449F;
		bodyModel[187].rotateAngleZ = -0.05235988F;

		bodyModel[188].addShapeBox(36F, -7F, -1F, 11, 3, 2, 0F,0F, 0F, 0.4F, 0F, -2.5F, -0.1F, 0F, -2.5F, -0.1F, 0F, 0F, 0.4F, 0F, -2F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.4F); // Box 96
		bodyModel[188].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[188].rotateAngleX = 1.96349541F;
		bodyModel[188].rotateAngleZ = -0.05235988F;

		bodyModel[189].addShapeBox(36F, -7F, -1F, 11, 3, 2, 0F,0F, 0F, 0.4F, 0F, -2.5F, -0.1F, 0F, -2.5F, -0.1F, 0F, 0F, 0.4F, 0F, -2F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.4F); // Box 97
		bodyModel[189].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[189].rotateAngleX = 1.57079633F;
		bodyModel[189].rotateAngleZ = -0.05235988F;

		bodyModel[190].addShapeBox(36F, -7F, -1F, 11, 3, 2, 0F,0F, 0F, 0.4F, 0F, -2.5F, -0.1F, 0F, -2.5F, -0.1F, 0F, 0F, 0.4F, 0F, -2F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.4F); // Box 98
		bodyModel[190].setRotationPoint(35F, -42.5F, 24F);
		bodyModel[190].rotateAngleX = 1.17809725F;
		bodyModel[190].rotateAngleZ = -0.05235988F;

		bodyModel[191].addShapeBox(36F, -5F, -12F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[191].setRotationPoint(35F, -42.5F, 27F);
		bodyModel[191].rotateAngleZ = -0.05235988F;

		bodyModel[192].addShapeBox(-8F, -6F, -24F, 5, 5, 23, 0F,10F, -10F, 15F, 0F, 0F, 0F, 0F, 0F, 0F, 20F, -10F, -12F, 10F, 10F, 15F, 0F, 0F, 0F, 0F, 0F, 0F, 20F, 10F, -12F); // Box 101
		bodyModel[192].setRotationPoint(79F, -28F, -8F);
		bodyModel[192].rotateAngleX = -0.43633231F;
		bodyModel[192].rotateAngleY = -1.01229097F;
		bodyModel[192].rotateAngleZ = -0.08726646F;

		bodyModel[193].addShapeBox(-8F, -6F, 2F, 5, 5, 23, 0F,20F, -10F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, -10F, 15F, 20F, 10F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 10F, 15F); // Box 103
		bodyModel[193].setRotationPoint(81F, -28F, 8F);
		bodyModel[193].rotateAngleX = 0.43633231F;
		bodyModel[193].rotateAngleY = 1.01229097F;
		bodyModel[193].rotateAngleZ = -0.08726646F;

		bodyModel[194].addShapeBox(-3F, -6F, -5F, 5, 5, 23, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[194].setRotationPoint(81F, -28F, 8F);
		bodyModel[194].rotateAngleX = 0.43633231F;
		bodyModel[194].rotateAngleY = 1.01229097F;
		bodyModel[194].rotateAngleZ = -0.08726646F;

		bodyModel[195].addShapeBox(0F, -17F, -6.5F, 64, 27, 13, 0F,0F, 1.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 1.5F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F); // Box 41
		bodyModel[195].setRotationPoint(-47F, -27F, 0F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 35, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[196].setRotationPoint(34F, -44F, -2F);
		bodyModel[196].rotateAngleZ = -0.10471976F;

		bodyModel[197].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 44
		bodyModel[197].setRotationPoint(69F, -20F, -0.5F);
		bodyModel[197].rotateAngleZ = -0.08726646F;

		bodyModel[198].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 45
		bodyModel[198].setRotationPoint(80F, -20F, -0.5F);
		bodyModel[198].rotateAngleZ = 0.57595865F;

		bodyModel[199].addShapeBox(0F, -17F, -6.5F, 20, 27, 5, 0F,0F, -3.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -3.5F, -4F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, -4F); // Box 0
		bodyModel[199].setRotationPoint(-67F, -28F, 0F);

		bodyModel[200].addShapeBox(0F, -17F, 1.5F, 20, 27, 5, 0F,0F, -3.5F, -4F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -3.5F, 0F, 0F, 1.1F, -4F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F); // Box 1
		bodyModel[200].setRotationPoint(-67F, -28F, 0F);

		bodyModel[201].addShapeBox(0F, -17F, -1.5F, 7, 27, 3, 0F,0F, -0.9F, 1.4F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.9F, 1.4F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F); // Box 2
		bodyModel[201].setRotationPoint(-54F, -28F, 0F);

		bodyModel[202].addShapeBox(-35F, 1F, -7.5F, 1, 7, 1, 0F,3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 871
		bodyModel[202].setRotationPoint(-50F, -45F, 0F);

		bodyModel[203].addShapeBox(-38F, -3F, -7.5F, 1, 4, 1, 0F,2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 2F, 2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 872
		bodyModel[203].setRotationPoint(-50F, -45F, 0F);

		bodyModel[204].addShapeBox(-40F, -5F, -5.5F, 1, 2, 1, 0F,1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 2F, 1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 873
		bodyModel[204].setRotationPoint(-50F, -45F, 0F);

		bodyModel[205].addShapeBox(-41F, -6F, -3.5F, 1, 1, 7, 0F,0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 874
		bodyModel[205].setRotationPoint(-50F, -45F, 0F);

		bodyModel[206].addShapeBox(-40F, -5F, 4.5F, 1, 2, 1, 0F,1F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, -2F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 875
		bodyModel[206].setRotationPoint(-50F, -45F, 0F);

		bodyModel[207].addShapeBox(-38F, -3F, 6.5F, 1, 4, 1, 0F,2F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, -2F, 2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 876
		bodyModel[207].setRotationPoint(-50F, -45F, 0F);

		bodyModel[208].addShapeBox(-35F, 1F, 6.5F, 1, 7, 1, 0F,3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 877
		bodyModel[208].setRotationPoint(-50F, -45F, 0F);

		bodyModel[209].addShapeBox(0F, -17F, -10.55F, 30, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 877
		bodyModel[209].setRotationPoint(-60F, -20F, 0F);

		bodyModel[210].addShapeBox(0F, -17F, 9.55F, 30, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 882
		bodyModel[210].setRotationPoint(-60F, -20F, 0F);
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 10, 0, textureX, textureY); // gunmodel
		noseModel[1] = new ModelRendererTurbo(this, 10, 0, textureX, textureY); // gunmodel
		noseModel[2] = new ModelRendererTurbo(this, 10, 0, textureX, textureY); // gunmodel
		noseModel[3] = new ModelRendererTurbo(this, 10, 0, textureX, textureY); // gunmodel
		noseModel[4] = new ModelRendererTurbo(this, 10, 0, textureX, textureY); // gunmodel
		noseModel[5] = new ModelRendererTurbo(this, 10, 0, textureX, textureY); // gunmodel
		noseModel[6] = new ModelRendererTurbo(this, 10, 0, textureX, textureY); // gunmodel
		noseModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // gunmodel
		noseModel[8] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // gunmodel
		noseModel[9] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // gunmodel
		noseModel[10] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // gunmodel
		noseModel[11] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // gunmodel
		noseModel[12] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // gunmodel
		noseModel[13] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // gunmodel
		noseModel[14] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // gunmodel
		noseModel[15] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // gunboxmodel
		noseModel[16] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // gunboxmodel
		noseModel[17] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // gunboxmodel
		noseModel[18] = new ModelRendererTurbo(this, 444, 500, textureX, textureY); // gunboxmodel
		noseModel[19] = new ModelRendererTurbo(this, 492, 500, textureX, textureY); // gunboxmodel
		noseModel[20] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // gunboxmodel
		noseModel[21] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // gunboxmodel
		noseModel[22] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // nose
		noseModel[23] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // nose2
		noseModel[24] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // nose4
		noseModel[25] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // nose3
		noseModel[26] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // nose5
		noseModel[27] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // nose6
		noseModel[28] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // nose7
		noseModel[29] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // nose9
		noseModel[30] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // nose10
		noseModel[31] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // nose11
		noseModel[32] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // nose12
		noseModel[33] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // nose13
		noseModel[34] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 17
		noseModel[35] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 18
		noseModel[36] = new ModelRendererTurbo(this, 513, 9, textureX, textureY); // Box 0
		noseModel[37] = new ModelRendererTurbo(this, 673, 9, textureX, textureY); // Box 1
		noseModel[38] = new ModelRendererTurbo(this, 553, 9, textureX, textureY); // Box 2
		noseModel[39] = new ModelRendererTurbo(this, 729, 9, textureX, textureY); // Box 3
		noseModel[40] = new ModelRendererTurbo(this, 761, 9, textureX, textureY); // Box 4
		noseModel[41] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 0
		noseModel[42] = new ModelRendererTurbo(this, 577, 17, textureX, textureY); // Box 2
		noseModel[43] = new ModelRendererTurbo(this, 673, 17, textureX, textureY); // Box 3
		noseModel[44] = new ModelRendererTurbo(this, 697, 17, textureX, textureY); // Box 4
		noseModel[45] = new ModelRendererTurbo(this, 1009, 9, textureX, textureY); // Box 5
		noseModel[46] = new ModelRendererTurbo(this, 721, 17, textureX, textureY); // Box 15
		noseModel[47] = new ModelRendererTurbo(this, 801, 17, textureX, textureY); // Box 16
		noseModel[48] = new ModelRendererTurbo(this, 857, 17, textureX, textureY); // Box 17
		noseModel[49] = new ModelRendererTurbo(this, 873, 33, textureX, textureY); // Box 0
		noseModel[50] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 143
		noseModel[51] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 144
		noseModel[52] = new ModelRendererTurbo(this, 969, 201, textureX, textureY); // Box 46
		noseModel[53] = new ModelRendererTurbo(this, 601, 145, textureX, textureY); // Box 48
		noseModel[54] = new ModelRendererTurbo(this, 633, 145, textureX, textureY); // Box 49
		noseModel[55] = new ModelRendererTurbo(this, 665, 145, textureX, textureY); // Box 50
		noseModel[56] = new ModelRendererTurbo(this, 993, 41, textureX, textureY); // Box 51
		noseModel[57] = new ModelRendererTurbo(this, 593, 81, textureX, textureY); // Box 52
		noseModel[58] = new ModelRendererTurbo(this, 513, 121, textureX, textureY); // Box 53
		noseModel[59] = new ModelRendererTurbo(this, 889, 209, textureX, textureY); // Box 3
		noseModel[60] = new ModelRendererTurbo(this, 553, 249, textureX, textureY); // Box 4
		noseModel[61] = new ModelRendererTurbo(this, 113, 209, textureX, textureY); // Box 5
		noseModel[62] = new ModelRendererTurbo(this, 993, 249, textureX, textureY); // Box 6
		noseModel[63] = new ModelRendererTurbo(this, 465, 257, textureX, textureY); // Box 7
		noseModel[64] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 8
		noseModel[65] = new ModelRendererTurbo(this, 665, 257, textureX, textureY); // Box 9
		noseModel[66] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 863
		noseModel[67] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 864
		noseModel[68] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 866
		noseModel[69] = new ModelRendererTurbo(this, 713, 25, textureX, textureY); // Box 867
		noseModel[70] = new ModelRendererTurbo(this, 601, 9, textureX, textureY); // Box 868
		noseModel[71] = new ModelRendererTurbo(this, 673, 9, textureX, textureY); // Box 869
		noseModel[72] = new ModelRendererTurbo(this, 25, 217, textureX, textureY); // Box 870
		noseModel[73] = new ModelRendererTurbo(this, 553, 17, textureX, textureY); // Box 862
		noseModel[74] = new ModelRendererTurbo(this, 753, 17, textureX, textureY); // Box 863
		noseModel[75] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 864
		noseModel[76] = new ModelRendererTurbo(this, 1017, 49, textureX, textureY); // Box 865
		noseModel[77] = new ModelRendererTurbo(this, 697, 225, textureX, textureY); // Box 866
		noseModel[78] = new ModelRendererTurbo(this, 681, 273, textureX, textureY); // Box 867
		noseModel[79] = new ModelRendererTurbo(this, 969, 225, textureX, textureY); // Box 868
		noseModel[80] = new ModelRendererTurbo(this, 465, 185, textureX, textureY); // Box 869
		noseModel[81] = new ModelRendererTurbo(this, 993, 233, textureX, textureY); // Box 870
		noseModel[82] = new ModelRendererTurbo(this, 65, 289, textureX, textureY); // Box 871
		noseModel[83] = new ModelRendererTurbo(this, 937, 289, textureX, textureY); // Box 872
		noseModel[84] = new ModelRendererTurbo(this, 993, 33, textureX, textureY); // Box 873
		noseModel[85] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 874
		noseModel[86] = new ModelRendererTurbo(this, 713, 41, textureX, textureY); // Box 875

		noseModel[0].addShapeBox(0F, -2F, -0.5F, 5, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // gunmodel
		noseModel[0].setRotationPoint(-133.5F, -19F, -2.5F);

		noseModel[1].addShapeBox(0F, -2F, -0.5F, 5, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // gunmodel
		noseModel[1].setRotationPoint(-133.5F, -19F, -2.5F);
		noseModel[1].rotateAngleX = 0.89709924F;

		noseModel[2].addShapeBox(0F, -2F, -0.5F, 5, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // gunmodel
		noseModel[2].setRotationPoint(-133.5F, -19F, -2.5F);
		noseModel[2].rotateAngleX = 1.79419847F;

		noseModel[3].addShapeBox(0F, -2F, -0.5F, 5, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // gunmodel
		noseModel[3].setRotationPoint(-133.5F, -19F, -2.5F);
		noseModel[3].rotateAngleX = 2.69129771F;

		noseModel[4].addShapeBox(0F, -2F, -0.5F, 5, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // gunmodel
		noseModel[4].setRotationPoint(-133.5F, -19F, -2.5F);
		noseModel[4].rotateAngleX = 3.58839694F;

		noseModel[5].addShapeBox(0F, -2F, -0.5F, 5, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // gunmodel
		noseModel[5].setRotationPoint(-133.5F, -19F, -2.5F);
		noseModel[5].rotateAngleX = 4.48549618F;

		noseModel[6].addShapeBox(0F, -2F, -0.5F, 5, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // gunmodel
		noseModel[6].setRotationPoint(-133.5F, -19F, -2.5F);
		noseModel[6].rotateAngleX = 5.38259541F;

		noseModel[7].addShapeBox(0F, -2F, -1F, 4, 2, 2, 0F,0F, -0.04F, 0F, 0F, -0.04F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // gunmodel
		noseModel[7].setRotationPoint(-132.5F, -19F, -2.5F);
		noseModel[7].rotateAngleX = 5.38259541F;

		noseModel[8].addShapeBox(0F, -2F, -1F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // gunmodel
		noseModel[8].setRotationPoint(-132.5F, -19F, -2.5F);

		noseModel[9].addShapeBox(0F, -2F, -1F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.04F, -0.05F, 0F, 0.04F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // gunmodel
		noseModel[9].setRotationPoint(-132.5F, -19F, -2.5F);
		noseModel[9].rotateAngleX = 0.90408055F;

		noseModel[10].addShapeBox(0F, -2F, -1F, 4, 2, 2, 0F,0F, -0.04F, 0F, 0F, -0.04F, 0F, 0F, 0.04F, -0.1F, 0F, 0.04F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // gunmodel
		noseModel[10].setRotationPoint(-132.5F, -19F, -2.5F);
		noseModel[10].rotateAngleX = 1.79419847F;

		noseModel[11].addShapeBox(0F, -2F, -1F, 4, 2, 2, 0F,0F, -0.04F, 0F, 0F, -0.04F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // gunmodel
		noseModel[11].setRotationPoint(-132.5F, -19F, -2.5F);
		noseModel[11].rotateAngleX = 2.69129771F;

		noseModel[12].addShapeBox(0F, -2F, -1F, 4, 2, 2, 0F,0F, -0.04F, 0F, 0F, -0.04F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // gunmodel
		noseModel[12].setRotationPoint(-132.5F, -19F, -2.5F);
		noseModel[12].rotateAngleX = 3.58839694F;

		noseModel[13].addShapeBox(0F, -2F, -1F, 4, 2, 2, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // gunmodel
		noseModel[13].setRotationPoint(-132.5F, -19F, -2.5F);
		noseModel[13].rotateAngleX = 4.48549618F;

		noseModel[14].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // gunmodel
		noseModel[14].setRotationPoint(-133F, -19F, -2.5F);

		noseModel[15].addShapeBox(3F, -2.5F, -1F, 21, 1, 2, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // gunboxmodel
		noseModel[15].setRotationPoint(-132.5F, -19F, -2.5F);

		noseModel[16].addShapeBox(3F, -2.5F, -1F, 21, 1, 2, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // gunboxmodel
		noseModel[16].setRotationPoint(-132.5F, -19F, -2.5F);
		noseModel[16].rotateAngleX = 0.90408055F;

		noseModel[17].addShapeBox(3F, -2.5F, -1F, 21, 1, 2, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // gunboxmodel
		noseModel[17].setRotationPoint(-132.5F, -19F, -2.5F);
		noseModel[17].rotateAngleX = 5.38259541F;

		noseModel[18].addShapeBox(3F, -2.5F, -1F, 21, 1, 2, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // gunboxmodel
		noseModel[18].setRotationPoint(-132.5F, -19F, -2.5F);
		noseModel[18].rotateAngleX = 1.79419847F;

		noseModel[19].addShapeBox(3F, -2.5F, -1F, 21, 1, 2, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // gunboxmodel
		noseModel[19].setRotationPoint(-132.5F, -19F, -2.5F);
		noseModel[19].rotateAngleX = 2.69129771F;

		noseModel[20].addShapeBox(3F, -2.5F, -1F, 21, 1, 2, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // gunboxmodel
		noseModel[20].setRotationPoint(-132.5F, -19F, -2.5F);
		noseModel[20].rotateAngleX = 3.58839694F;

		noseModel[21].addShapeBox(3F, -2.5F, -1F, 21, 1, 2, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // gunboxmodel
		noseModel[21].setRotationPoint(-132.5F, -19F, -2.5F);
		noseModel[21].rotateAngleX = 4.48549618F;

		noseModel[22].addShapeBox(-7F, -6F, -1.5F, 7, 11, 3, 0F,0F, -5F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -3F, 0F); // nose
		noseModel[22].setRotationPoint(-125F, -24F, 0F);

		noseModel[23].addShapeBox(-7F, -6F, -5.5F, 7, 11, 4, 0F,0F, -5F, -4F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, -5F, 0F, 0F, -3F, -4F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, -3F, 0F); // nose2
		noseModel[23].setRotationPoint(-125F, -24F, 0F);

		noseModel[24].addShapeBox(0F, -8F, -3.5F, 7, 15, 7, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -2F, 0F); // nose4
		noseModel[24].setRotationPoint(-125F, -24F, 0F);

		noseModel[25].addShapeBox(-7F, -6F, 1.5F, 7, 11, 4, 0F,0F, -5F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -5F, -4F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -3F, -4F); // nose3
		noseModel[25].setRotationPoint(-125F, -24F, 0F);

		noseModel[26].addShapeBox(-7F, -8F, 3.5F, 7, 15, 4, 0F,0F, -2F, 0F, 0F, 0.5F, -1F, 0F, -2F, 0F, 0F, -4F, -2F, 0F, -2F, 0F, 0F, -0.5F, -1F, 0F, -3F, 0F, 0F, -4F, -2F); // nose5
		noseModel[26].setRotationPoint(-118F, -24F, 0F);

		noseModel[27].addShapeBox(-7F, -8F, -7.5F, 7, 15, 4, 0F,0F, -4F, -2F, 0F, -2F, 0F, 0F, 0.5F, -1F, 0F, -2F, 0F, 0F, -4F, -2F, 0F, -3F, 0F, 0F, -0.5F, -1F, 0F, -2F, 0F); // nose6
		noseModel[27].setRotationPoint(-118F, -24F, 0F);

		noseModel[28].addShapeBox(0F, -12F, -4.5F, 10, 19, 9, 0F,0F, -3.5F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -3.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 2F, 0F, 0.5F, 2F, 0F, -0.5F, 0F); // nose7
		noseModel[28].setRotationPoint(-118F, -24F, 0F);

		noseModel[29].addShapeBox(0F, -12F, 3.5F, 10, 19, 6, 0F,0F, -3.5F, -1F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, -6F, -2F, 0F, -0.5F, -1F, 0F, 0.5F, -3F, 0F, -3F, 0F, 0F, -3F, -2F); // nose9
		noseModel[29].setRotationPoint(-118F, -24F, 0F);

		noseModel[30].addShapeBox(0F, -12F, -9.5F, 10, 19, 6, 0F,0F, -6F, -2F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, -3.5F, -1F, 0F, -3F, -2F, 0F, -3F, 0F, 0F, 0.5F, -3F, 0F, -0.5F, -1F); // nose10
		noseModel[30].setRotationPoint(-118F, -24F, 0F);

		noseModel[31].addShapeBox(0F, -8F, -3.5F, 7, 7, 1, 0F,0F, -5F, 0F, 0F, -2.5F, 1F, 0F, -2.5F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, -2F, 0F); // nose11
		noseModel[31].setRotationPoint(-125F, -27F, 0F);

		noseModel[32].addShapeBox(0F, -8F, 2.5F, 7, 7, 1, 0F,0F, -5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 1F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -2F, 0F); // nose12
		noseModel[32].setRotationPoint(-125F, -27F, 0F);

		noseModel[33].addShapeBox(0F, -8F, -2.5F, 4, 1, 3, 0F,-2F, -0.93F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, -0.93F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // nose13
		noseModel[33].setRotationPoint(-122F, -24F, 1F);

		noseModel[34].addShapeBox(0F, -12F, -10.5F, 10, 19, 4, 0F,0F, -3F, -1F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, 1.1F, 0F, 0F, 0.5F, 0F); // Box 17
		noseModel[34].setRotationPoint(-108F, -24F, 0F);

		noseModel[35].addShapeBox(0F, -12F, 6.5F, 10, 19, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -3F, -1F, 0F, 0.5F, 0F, 0F, 1.1F, 0F, 0F, -3F, 0F, 0F, -3F, -1F); // Box 18
		noseModel[35].setRotationPoint(-108F, -24F, 0F);

		noseModel[36].addShapeBox(0F, 6F, -6.5F, 10, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.5F, 0F); // Box 0
		noseModel[36].setRotationPoint(-108F, -24F, 0F);

		noseModel[37].addShapeBox(0F, 0F, -3F, 21, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1
		noseModel[37].setRotationPoint(-119.5F, -17F, -2.5F);

		noseModel[38].addShapeBox(0F, 0F, -3F, 15, 2, 1, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		noseModel[38].setRotationPoint(-119.5F, -19F, -2.5F);

		noseModel[39].addShapeBox(0F, 0F, 2F, 15, 2, 1, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		noseModel[39].setRotationPoint(-119.5F, -19F, -2.5F);

		noseModel[40].addShapeBox(0F, -12F, -10.5F, 12, 21, 4, 0F,0F, -4F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F); // Box 4
		noseModel[40].setRotationPoint(-98F, -26F, 0F);

		noseModel[41].addShapeBox(0F, -12F, 6.5F, 12, 21, 4, 0F,0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, -4F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 0
		noseModel[41].setRotationPoint(-98F, -26F, 0F);

		noseModel[42].addShapeBox(0F, -13F, -10.5F, 6, 22, 4, 0F,0F, -3.5F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F); // Box 2
		noseModel[42].setRotationPoint(-86F, -26F, 0F);

		noseModel[43].addShapeBox(0F, -13F, -10.5F, 6, 8, 4, 0F,0F, -3.5F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		noseModel[43].setRotationPoint(-80F, -27F, 0F);

		noseModel[44].addShapeBox(0F, -13F, -10.5F, 6, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F); // Box 4
		noseModel[44].setRotationPoint(-80F, -7F, 0F);

		noseModel[45].addShapeBox(0F, -13F, -11.5F, 6, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		noseModel[45].setRotationPoint(-80F, -19F, 4F);

		noseModel[46].addShapeBox(0F, -14F, 6.5F, 12, 23, 4, 0F,0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, -4.5F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 15
		noseModel[46].setRotationPoint(-86F, -26F, 0F);

		noseModel[47].addShapeBox(0F, -13F, -10.5F, 7, 24, 4, 0F,0F, -3.5F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F); // Box 16
		noseModel[47].setRotationPoint(-74F, -28F, 0F);

		noseModel[48].addShapeBox(0F, -13F, 10.5F, 7, 24, 4, 0F,0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, -3.5F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 17
		noseModel[48].setRotationPoint(-74F, -28F, -4F);

		noseModel[49].addShapeBox(0F, 6F, -6.5F, 51, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 0
		noseModel[49].setRotationPoint(-98F, -24F, 0F);

		noseModel[50].addShapeBox(0F, -8F, -3.5F, 4, 1, 1, 0F,0F, -0.93F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, -0.93F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 143
		noseModel[50].setRotationPoint(-122F, -24F, 1F);

		noseModel[51].addShapeBox(0F, -8F, 0.5F, 4, 1, 1, 0F,-2F, -0.93F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.93F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		noseModel[51].setRotationPoint(-122F, -24F, 1F);

		noseModel[52].addShapeBox(0F, -13F, 10.5F, 9, 21, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 46
		noseModel[52].setRotationPoint(-95F, -16F, 0F);

		noseModel[53].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 48
		noseModel[53].setRotationPoint(-96F, -9F, 9.5F);

		noseModel[54].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 49
		noseModel[54].setRotationPoint(-96F, -8F, 9.5F);

		noseModel[55].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Box 50
		noseModel[55].setRotationPoint(-96F, -7F, 9.5F);

		noseModel[56].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 51
		noseModel[56].setRotationPoint(-98F, -8F, 9.5F);

		noseModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 52
		noseModel[57].setRotationPoint(-98F, -9F, 9.5F);

		noseModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Box 53
		noseModel[58].setRotationPoint(-98F, -7F, 9.5F);

		noseModel[59].addShapeBox(0F, -13F, -6.5F, 7, 23, 1, 0F,0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -1F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, -1F); // Box 3
		noseModel[59].setRotationPoint(-74F, -28F, 0F);

		noseModel[60].addShapeBox(0F, -13F, 5.5F, 7, 23, 1, 0F,0F, -0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.1F, -1F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F); // Box 4
		noseModel[60].setRotationPoint(-74F, -28F, 0F);

		noseModel[61].addShapeBox(0F, -12F, -6.5F, 10, 18, 3, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, -2F, 0F, 1.1F, 0F); // Box 5
		noseModel[61].setRotationPoint(-108F, -24F, 0F);

		noseModel[62].addShapeBox(0F, -12F, 3.5F, 10, 18, 3, 0F,0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, -2F, 0F, 1.1F, 0F, 0F, 1.1F, 0F); // Box 6
		noseModel[62].setRotationPoint(-108F, -24F, 0F);

		noseModel[63].addShapeBox(0F, -12F, -3.5F, 5, 18, 7, 0F,0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 1F, 0F, 1.1F, 1F, 0F, 1.1F, 0F); // Box 7
		noseModel[63].setRotationPoint(-108F, -24F, 0F);

		noseModel[64].addShapeBox(0F, -12F, -6.5F, 12, 20, 1, 0F,0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1.1F, -1F, 0F, 1.1F, 0F); // Box 8
		noseModel[64].setRotationPoint(-98F, -26F, 0F);

		noseModel[65].addShapeBox(0F, -12F, 5.5F, 12, 20, 1, 0F,0F, -1F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, -1F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 9
		noseModel[65].setRotationPoint(-98F, -26F, 0F);

		noseModel[66].addShapeBox(0F, -17F, -7.5F, 1, 7, 1, 0F,3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 863
		noseModel[66].setRotationPoint(-86F, -27F, 0F);

		noseModel[67].addShapeBox(0F, -14F, -7.5F, 1, 4, 1, 0F,2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 2F, 2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 864
		noseModel[67].setRotationPoint(-89F, -34F, 0F);

		noseModel[68].addShapeBox(0F, -16F, -5.5F, 1, 2, 1, 0F,1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 2F, 1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 866
		noseModel[68].setRotationPoint(-91F, -34F, 0F);

		noseModel[69].addShapeBox(0F, -17F, -14.5F, 1, 7, 1, 0F,3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 867
		noseModel[69].setRotationPoint(-86F, -27F, 21F);

		noseModel[70].addShapeBox(0F, -14F, -14.5F, 1, 4, 1, 0F,2F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, -2F, 2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 868
		noseModel[70].setRotationPoint(-89F, -34F, 21F);

		noseModel[71].addShapeBox(0F, -16F, -12.5F, 1, 2, 1, 0F,1F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, -2F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 869
		noseModel[71].setRotationPoint(-91F, -34F, 17F);

		noseModel[72].addShapeBox(0F, -17F, -20.5F, 1, 1, 7, 0F,0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 870
		noseModel[72].setRotationPoint(-92F, -34F, 17F);

		noseModel[73].addShapeBox(-43F, -6F, -1.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 2F, 2F, -4F, 2F, 2F, -4F, 2F, -2F, 4F, 2F, -2F); // Box 862
		noseModel[73].setRotationPoint(-50F, -45F, 0F);

		noseModel[74].addShapeBox(-43F, -6F, 0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 2F, -2F, -4F, 2F, -2F, -4F, 2F, 2F, 4F, 2F, 2F); // Box 863
		noseModel[74].setRotationPoint(-50F, -45F, 0F);

		noseModel[75].addShapeBox(-44F, -4F, -3.5F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 10F, 0F, 0F); // Box 864
		noseModel[75].setRotationPoint(-53F, -43F, 0F);

		noseModel[76].addShapeBox(-44F, -4F, 2.5F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 10F, 0F, 0F); // Box 865
		noseModel[76].setRotationPoint(-53F, -43F, 0F);

		noseModel[77].addShapeBox(0F, 6F, -6F, 15, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 866
		noseModel[77].setRotationPoint(-93F, -29F, 0F);

		noseModel[78].addShapeBox(0F, -7F, -6F, 2, 13, 12, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 867
		noseModel[78].setRotationPoint(-80F, -29F, 0F);

		noseModel[79].addShapeBox(0F, -14F, -3F, 2, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 868
		noseModel[79].setRotationPoint(-77F, -29F, 0F);

		noseModel[80].addShapeBox(-11F, 1F, -6F, 10, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 869
		noseModel[80].setRotationPoint(-77F, -29F, 0F);

		noseModel[81].addShapeBox(-11F, 1F, 4F, 10, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 870
		noseModel[81].setRotationPoint(-77F, -29F, 0F);

		noseModel[82].addShapeBox(0F, 0F, -6F, 14, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 871
		noseModel[82].setRotationPoint(-103F, -34F, 0F);

		noseModel[83].addShapeBox(0F, -5F, -5F, 11, 5, 10, 0F,0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 872
		noseModel[83].setRotationPoint(-103F, -34F, 0F);

		noseModel[84].addShapeBox(9.5F, -10F, -3F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 873
		noseModel[84].setRotationPoint(-103F, -34F, 0F);

		noseModel[85].addShapeBox(9.5F, -10F, 2F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 874
		noseModel[85].setRotationPoint(-103F, -34F, 0F);

		noseModel[86].addShapeBox(9.5F, -10F, -2F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 875
		noseModel[86].setRotationPoint(-103F, -34F, 0F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 649, 81, textureX, textureY); // Box 6
		tailModel[1] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 8
		tailModel[2] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 9
		tailModel[3] = new ModelRendererTurbo(this, 809, 81, textureX, textureY); // Box 10
		tailModel[4] = new ModelRendererTurbo(this, 697, 113, textureX, textureY); // Box 12
		tailModel[5] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 13
		tailModel[6] = new ModelRendererTurbo(this, 521, 25, textureX, textureY); // Box 14
		tailModel[7] = new ModelRendererTurbo(this, 825, 25, textureX, textureY); // Box 15
		tailModel[8] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 17

		tailModel[0].addShapeBox(0F, -13F, -10.5F, 75, 23, 4, 0F,0F, -1F, 0F, 0F, -5.F, -4F, 0F, -3F, 4F, 0F, 1.5F, 0F, 0F, -3F, 0F, 0F, -6.5F, -4F, 0F, -3.5F, 4F, 0F, 1.1F, 0F); // Box 6
		tailModel[0].setRotationPoint(17F, -27F, 0F);

		tailModel[1].addShapeBox(0F, -9F, -6.5F, 32, 15, 4, 0F,0F, -1F, 0F, 0F, -5.F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, -2.5F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, 0.6F, 0F); // Box 8
		tailModel[1].setRotationPoint(92F, -27F, 0F);

		tailModel[2].addShapeBox(0F, -9F, 2.5F, 32, 15, 4, 0F,0F, 1F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, 0.6F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, -2.5F, 0F); // Box 9
		tailModel[2].setRotationPoint(92F, -27F, 0F);

		tailModel[3].addShapeBox(0F, -13F, 6.5F, 75, 23, 4, 0F,0F, 1.5F, 0F, 0F, -3F, 4F, 0F, -5F, -4F, 0F, -1F, 0F, 0F, 1.1F, 0F, 0F, -3.5F, 4F, 0F, -6.5F, -4F, 0F, -3F, 0F); // Box 10
		tailModel[3].setRotationPoint(17F, -27F, 0F);

		tailModel[4].addShapeBox(0F, -13F, -6.5F, 75, 23, 13, 0F,0F, 1.5F, 0F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, 1.5F, 0F, 0F, 1.1F, 0F, 0F, -3.5F, -4F, 0F, -3.5F, -4F, 0F, 1.1F, 0F); // Box 12
		tailModel[4].setRotationPoint(17F, -27F, 0F);

		tailModel[5].addShapeBox(0F, -9F, -2.5F, 32, 15, 5, 0F,0F, 1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 0.6F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0.6F, 0F); // Box 13
		tailModel[5].setRotationPoint(92F, -27F, 0F);

		tailModel[6].addShapeBox(0F, -9F, -2.5F, 10, 9, 5, 0F,0F, 0F, 0F, 0F, -3.5F, -1F, 0F, -3.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -1F, 0F, -2.5F, -1F, 0F, 0F, 0F); // Box 14
		tailModel[6].setRotationPoint(124F, -24F, 0F);

		tailModel[7].addShapeBox(0F, -9F, -6.5F, 10, 9, 4, 0F,0F, -2F, 0F, 0F, -3.5F, -5F, 0F, -3.5F, 1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2.5F, -5F, 0F, -2.5F, 1F, 0F, 0F, 0F); // Box 15
		tailModel[7].setRotationPoint(124F, -24F, 0F);

		tailModel[8].addShapeBox(0F, -9F, 2.5F, 10, 9, 4, 0F,0F, 0F, 0F, 0F, -3.5F, 1F, 0F, -3.5F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 1F, 0F, -2.5F, -5F, 0F, -3F, 0F); // Box 17
		tailModel[8].setRotationPoint(124F, -24F, 0F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 513, 65, textureX, textureY); // wingback
		leftWingModel[1] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // wingback
		leftWingModel[2] = new ModelRendererTurbo(this, 665, 153, textureX, textureY); // Box 137
		leftWingModel[3] = new ModelRendererTurbo(this, 617, 73, textureX, textureY); // Box 138
		leftWingModel[4] = new ModelRendererTurbo(this, 521, 113, textureX, textureY); // Box 139
		leftWingModel[5] = new ModelRendererTurbo(this, 657, 113, textureX, textureY); // Box 140
		leftWingModel[6] = new ModelRendererTurbo(this, 921, 129, textureX, textureY); // Box 141
		leftWingModel[7] = new ModelRendererTurbo(this, 34, 397, textureX, textureY); // Box 142
		leftWingModel[8] = new ModelRendererTurbo(this, 553, 33, textureX, textureY); // Box 145
		leftWingModel[9] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 146
		leftWingModel[10] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 147
		leftWingModel[11] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 148
		leftWingModel[12] = new ModelRendererTurbo(this, 801, 161, textureX, textureY); // Box 149
		leftWingModel[13] = new ModelRendererTurbo(this, 529, 129, textureX, textureY); // Box 151
		leftWingModel[14] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 152
		leftWingModel[15] = new ModelRendererTurbo(this, 609, 89, textureX, textureY); // Box 153
		leftWingModel[16] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 154
		leftWingModel[17] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 155
		leftWingModel[18] = new ModelRendererTurbo(this, 465, 113, textureX, textureY); // Box 156
		leftWingModel[19] = new ModelRendererTurbo(this, 921, 177, textureX, textureY); // Box 157
		leftWingModel[20] = new ModelRendererTurbo(this, 697, 177, textureX, textureY); // Box 158
		leftWingModel[21] = new ModelRendererTurbo(this, 977, 121, textureX, textureY); // Box 159
		leftWingModel[22] = new ModelRendererTurbo(this, 121, 129, textureX, textureY); // Box 160
		leftWingModel[23] = new ModelRendererTurbo(this, 537, 89, textureX, textureY); // Box 0
		leftWingModel[24] = new ModelRendererTurbo(this, 585, 113, textureX, textureY); // Box 1
		leftWingModel[25] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 2
		leftWingModel[26] = new ModelRendererTurbo(this, 465, 193, textureX, textureY); // Box 3
		leftWingModel[27] = new ModelRendererTurbo(this, 600, 500, textureX, textureY); // Box 50
		leftWingModel[28] = new ModelRendererTurbo(this, 600, 500, textureX, textureY); // Box 51
		leftWingModel[29] = new ModelRendererTurbo(this, 600, 500, textureX, textureY); // Box 52
		leftWingModel[30] = new ModelRendererTurbo(this, 600, 500, textureX, textureY); // Box 53
		leftWingModel[31] = new ModelRendererTurbo(this, 600, 500, textureX, textureY); // Box 54
		leftWingModel[32] = new ModelRendererTurbo(this, 600, 500, textureX, textureY); // Box 55
		leftWingModel[33] = new ModelRendererTurbo(this, 600, 500, textureX, textureY); // Box 56
		leftWingModel[34] = new ModelRendererTurbo(this, 600, 500, textureX, textureY); // Box 57
		leftWingModel[35] = new ModelRendererTurbo(this, 600, 500, textureX, textureY); // Box 58
		leftWingModel[36] = new ModelRendererTurbo(this, 600, 500, textureX, textureY); // Box 59
		leftWingModel[37] = new ModelRendererTurbo(this, 600, 600, textureX, textureY); // Box 60
		leftWingModel[38] = new ModelRendererTurbo(this, 600, 580, textureX, textureY); // Box 61
		leftWingModel[39] = new ModelRendererTurbo(this, 600, 580, textureX, textureY); // Box 62
		leftWingModel[40] = new ModelRendererTurbo(this, 600, 590, textureX, textureY); // Box 63
		leftWingModel[41] = new ModelRendererTurbo(this, 600, 550, textureX, textureY); // Box 64
		leftWingModel[42] = new ModelRendererTurbo(this, 600, 520, textureX, textureY); // Box 65
		leftWingModel[43] = new ModelRendererTurbo(this, 600, 580, textureX, textureY); // Box 67
		leftWingModel[44] = new ModelRendererTurbo(this, 600, 590, textureX, textureY); // Box 68
		leftWingModel[45] = new ModelRendererTurbo(this, 600, 580, textureX, textureY); // Box 69
		leftWingModel[46] = new ModelRendererTurbo(this, 0, 580, textureX, textureY); // Box 70
		leftWingModel[47] = new ModelRendererTurbo(this, 600, 590, textureX, textureY); // Box 71
		leftWingModel[48] = new ModelRendererTurbo(this, 600, 580, textureX, textureY); // Box 72
		leftWingModel[49] = new ModelRendererTurbo(this, 600, 510, textureX, textureY); // Box 73
		leftWingModel[50] = new ModelRendererTurbo(this, 600, 510, textureX, textureY); // Box 74
		leftWingModel[51] = new ModelRendererTurbo(this, 600, 510, textureX, textureY); // Box 75
		leftWingModel[52] = new ModelRendererTurbo(this, 600, 520, textureX, textureY); // Box 76
		leftWingModel[53] = new ModelRendererTurbo(this, 600, 510, textureX, textureY); // Box 77
		leftWingModel[54] = new ModelRendererTurbo(this, 600, 540, textureX, textureY); // Box 78
		leftWingModel[55] = new ModelRendererTurbo(this, 600, 540, textureX, textureY); // Box 79
		leftWingModel[56] = new ModelRendererTurbo(this, 600, 20, textureX, textureY); // Box 80
		leftWingModel[57] = new ModelRendererTurbo(this, 600, 10, textureX, textureY); // Box 81
		leftWingModel[58] = new ModelRendererTurbo(this, 600, 0, textureX, textureY); // Box 82
		leftWingModel[59] = new ModelRendererTurbo(this, 600, 30, textureX, textureY); // Box 83
		leftWingModel[60] = new ModelRendererTurbo(this, 600, 50, textureX, textureY); // Box 84
		leftWingModel[61] = new ModelRendererTurbo(this, 600, 40, textureX, textureY); // Box 85
		leftWingModel[62] = new ModelRendererTurbo(this, 600, 70, textureX, textureY); // Box 86
		leftWingModel[63] = new ModelRendererTurbo(this, 600, 60, textureX, textureY); // Box 87
		leftWingModel[64] = new ModelRendererTurbo(this, 600, 80, textureX, textureY); // Box 88
		leftWingModel[65] = new ModelRendererTurbo(this, 600, 90, textureX, textureY); // Box 89
		leftWingModel[66] = new ModelRendererTurbo(this, 600, 90, textureX, textureY); // Box 91
		leftWingModel[67] = new ModelRendererTurbo(this, 600, 90, textureX, textureY); // Box 92
		leftWingModel[68] = new ModelRendererTurbo(this, 600, 90, textureX, textureY); // Box 93
		leftWingModel[69] = new ModelRendererTurbo(this, 600, 100, textureX, textureY); // Box 94
		leftWingModel[70] = new ModelRendererTurbo(this, 600, 100, textureX, textureY); // Box 95
		leftWingModel[71] = new ModelRendererTurbo(this, 600, 100, textureX, textureY); // Box 96
		leftWingModel[72] = new ModelRendererTurbo(this, 600, 100, textureX, textureY); // Box 97
		leftWingModel[73] = new ModelRendererTurbo(this, 600, 80, textureX, textureY); // Box 115
		leftWingModel[74] = new ModelRendererTurbo(this, 600, 70, textureX, textureY); // Box 116
		leftWingModel[75] = new ModelRendererTurbo(this, 600, 60, textureX, textureY); // Box 117
		leftWingModel[76] = new ModelRendererTurbo(this, 600, 30, textureX, textureY); // Box 118
		leftWingModel[77] = new ModelRendererTurbo(this, 600, 40, textureX, textureY); // Box 119
		leftWingModel[78] = new ModelRendererTurbo(this, 600, 50, textureX, textureY); // Box 120
		leftWingModel[79] = new ModelRendererTurbo(this, 600, 20, textureX, textureY); // Box 121
		leftWingModel[80] = new ModelRendererTurbo(this, 600, 10, textureX, textureY); // Box 122
		leftWingModel[81] = new ModelRendererTurbo(this, 600, 0, textureX, textureY); // Box 123
		leftWingModel[82] = new ModelRendererTurbo(this, 600, 100, textureX, textureY); // Box 124
		leftWingModel[83] = new ModelRendererTurbo(this, 600, 100, textureX, textureY); // Box 125
		leftWingModel[84] = new ModelRendererTurbo(this, 600, 90, textureX, textureY); // Box 126
		leftWingModel[85] = new ModelRendererTurbo(this, 600, 90, textureX, textureY); // Box 127
		leftWingModel[86] = new ModelRendererTurbo(this, 600, 90, textureX, textureY); // Box 128
		leftWingModel[87] = new ModelRendererTurbo(this, 600, 100, textureX, textureY); // Box 129
		leftWingModel[88] = new ModelRendererTurbo(this, 600, 90, textureX, textureY); // Box 130
		leftWingModel[89] = new ModelRendererTurbo(this, 600, 100, textureX, textureY); // Box 131
		leftWingModel[90] = new ModelRendererTurbo(this, 600, 80, textureX, textureY); // Box 132
		leftWingModel[91] = new ModelRendererTurbo(this, 600, 70, textureX, textureY); // Box 133
		leftWingModel[92] = new ModelRendererTurbo(this, 600, 60, textureX, textureY); // Box 134
		leftWingModel[93] = new ModelRendererTurbo(this, 600, 30, textureX, textureY); // Box 135
		leftWingModel[94] = new ModelRendererTurbo(this, 600, 40, textureX, textureY); // Box 136
		leftWingModel[95] = new ModelRendererTurbo(this, 600, 50, textureX, textureY); // Box 137
		leftWingModel[96] = new ModelRendererTurbo(this, 600, 20, textureX, textureY); // Box 138
		leftWingModel[97] = new ModelRendererTurbo(this, 600, 10, textureX, textureY); // Box 139
		leftWingModel[98] = new ModelRendererTurbo(this, 600, 0, textureX, textureY); // Box 140
		leftWingModel[99] = new ModelRendererTurbo(this, 600, 100, textureX, textureY); // Box 141
		leftWingModel[100] = new ModelRendererTurbo(this, 600, 100, textureX, textureY); // Box 142
		leftWingModel[101] = new ModelRendererTurbo(this, 600, 90, textureX, textureY); // Box 143
		leftWingModel[102] = new ModelRendererTurbo(this, 600, 90, textureX, textureY); // Box 144
		leftWingModel[103] = new ModelRendererTurbo(this, 600, 90, textureX, textureY); // Box 145
		leftWingModel[104] = new ModelRendererTurbo(this, 600, 100, textureX, textureY); // Box 146
		leftWingModel[105] = new ModelRendererTurbo(this, 600, 90, textureX, textureY); // Box 147
		leftWingModel[106] = new ModelRendererTurbo(this, 600, 100, textureX, textureY); // Box 148
		leftWingModel[107] = new ModelRendererTurbo(this, 600, 120, textureX, textureY); // Box 149
		leftWingModel[108] = new ModelRendererTurbo(this, 600, 130, textureX, textureY); // Box 150
		leftWingModel[109] = new ModelRendererTurbo(this, 600, 130, textureX, textureY); // Box 151
		leftWingModel[110] = new ModelRendererTurbo(this, 600, 140, textureX, textureY); // Box 152
		leftWingModel[111] = new ModelRendererTurbo(this, 600, 150, textureX, textureY); // Box 153
		leftWingModel[112] = new ModelRendererTurbo(this, 600, 160, textureX, textureY); // Box 154
		leftWingModel[113] = new ModelRendererTurbo(this, 600, 170, textureX, textureY); // Box 155
		leftWingModel[114] = new ModelRendererTurbo(this, 600, 180, textureX, textureY); // Box 156
		leftWingModel[115] = new ModelRendererTurbo(this, 600, 170, textureX, textureY); // Box 157
		leftWingModel[116] = new ModelRendererTurbo(this, 600, 230, textureX, textureY); // Box 158
		leftWingModel[117] = new ModelRendererTurbo(this, 600, 190, textureX, textureY); // Box 159
		leftWingModel[118] = new ModelRendererTurbo(this, 600, 210, textureX, textureY); // Box 160
		leftWingModel[119] = new ModelRendererTurbo(this, 600, 200, textureX, textureY); // Box 161
		leftWingModel[120] = new ModelRendererTurbo(this, 600, 200, textureX, textureY); // Box 162
		leftWingModel[121] = new ModelRendererTurbo(this, 600, 200, textureX, textureY); // Box 163
		leftWingModel[122] = new ModelRendererTurbo(this, 600, 210, textureX, textureY); // Box 164
		leftWingModel[123] = new ModelRendererTurbo(this, 600, 210, textureX, textureY); // Box 165
		leftWingModel[124] = new ModelRendererTurbo(this, 600, 210, textureX, textureY); // Box 166
		leftWingModel[125] = new ModelRendererTurbo(this, 600, 210, textureX, textureY); // Box 167
		leftWingModel[126] = new ModelRendererTurbo(this, 600, 210, textureX, textureY); // Box 168
		leftWingModel[127] = new ModelRendererTurbo(this, 600, 210, textureX, textureY); // Box 169
		leftWingModel[128] = new ModelRendererTurbo(this, 600, 210, textureX, textureY); // Box 170
		leftWingModel[129] = new ModelRendererTurbo(this, 600, 230, textureX, textureY); // Box 171
		leftWingModel[130] = new ModelRendererTurbo(this, 600, 170, textureX, textureY); // Box 172
		leftWingModel[131] = new ModelRendererTurbo(this, 600, 180, textureX, textureY); // Box 173
		leftWingModel[132] = new ModelRendererTurbo(this, 600, 170, textureX, textureY); // Box 174
		leftWingModel[133] = new ModelRendererTurbo(this, 600, 210, textureX, textureY); // Box 175
		leftWingModel[134] = new ModelRendererTurbo(this, 600, 150, textureX, textureY); // Box 176
		leftWingModel[135] = new ModelRendererTurbo(this, 600, 140, textureX, textureY); // Box 177
		leftWingModel[136] = new ModelRendererTurbo(this, 600, 210, textureX, textureY); // Box 178
		leftWingModel[137] = new ModelRendererTurbo(this, 600, 210, textureX, textureY); // Box 179
		leftWingModel[138] = new ModelRendererTurbo(this, 600, 160, textureX, textureY); // Box 180
		leftWingModel[139] = new ModelRendererTurbo(this, 600, 210, textureX, textureY); // Box 181
		leftWingModel[140] = new ModelRendererTurbo(this, 600, 210, textureX, textureY); // Box 182
		leftWingModel[141] = new ModelRendererTurbo(this, 600, 190, textureX, textureY); // Box 183
		leftWingModel[142] = new ModelRendererTurbo(this, 600, 200, textureX, textureY); // Box 184
		leftWingModel[143] = new ModelRendererTurbo(this, 600, 210, textureX, textureY); // Box 185
		leftWingModel[144] = new ModelRendererTurbo(this, 600, 200, textureX, textureY); // Box 186
		leftWingModel[145] = new ModelRendererTurbo(this, 600, 210, textureX, textureY); // Box 187
		leftWingModel[146] = new ModelRendererTurbo(this, 600, 200, textureX, textureY); // Box 188
		leftWingModel[147] = new ModelRendererTurbo(this, 600, 210, textureX, textureY); // Box 189
		leftWingModel[148] = new ModelRendererTurbo(this, 600, 270, textureX, textureY); // Box 190
		leftWingModel[149] = new ModelRendererTurbo(this, 600, 250, textureX, textureY); // Box 191
		leftWingModel[150] = new ModelRendererTurbo(this, 600, 250, textureX, textureY); // Box 192
		leftWingModel[151] = new ModelRendererTurbo(this, 600, 250, textureX, textureY); // Box 193
		leftWingModel[152] = new ModelRendererTurbo(this, 600, 250, textureX, textureY); // Box 194
		leftWingModel[153] = new ModelRendererTurbo(this, 600, 250, textureX, textureY); // Box 195
		leftWingModel[154] = new ModelRendererTurbo(this, 600, 250, textureX, textureY); // Box 196
		leftWingModel[155] = new ModelRendererTurbo(this, 600, 250, textureX, textureY); // Box 197
		leftWingModel[156] = new ModelRendererTurbo(this, 600, 250, textureX, textureY); // Box 198
		leftWingModel[157] = new ModelRendererTurbo(this, 600, 250, textureX, textureY); // Box 199
		leftWingModel[158] = new ModelRendererTurbo(this, 600, 250, textureX, textureY); // Box 200
		leftWingModel[159] = new ModelRendererTurbo(this, 600, 250, textureX, textureY); // Box 201
		leftWingModel[160] = new ModelRendererTurbo(this, 600, 250, textureX, textureY); // Box 202
		leftWingModel[161] = new ModelRendererTurbo(this, 600, 250, textureX, textureY); // Box 203
		leftWingModel[162] = new ModelRendererTurbo(this, 600, 250, textureX, textureY); // Box 204
		leftWingModel[163] = new ModelRendererTurbo(this, 600, 250, textureX, textureY); // Box 205
		leftWingModel[164] = new ModelRendererTurbo(this, 600, 250, textureX, textureY); // Box 206
		leftWingModel[165] = new ModelRendererTurbo(this, 600, 260, textureX, textureY); // Box 207
		leftWingModel[166] = new ModelRendererTurbo(this, 600, 260, textureX, textureY); // Box 208
		leftWingModel[167] = new ModelRendererTurbo(this, 600, 260, textureX, textureY); // Box 209
		leftWingModel[168] = new ModelRendererTurbo(this, 600, 260, textureX, textureY); // Box 210
		leftWingModel[169] = new ModelRendererTurbo(this, 600, 260, textureX, textureY); // Box 211
		leftWingModel[170] = new ModelRendererTurbo(this, 600, 260, textureX, textureY); // Box 212
		leftWingModel[171] = new ModelRendererTurbo(this, 600, 260, textureX, textureY); // Box 213
		leftWingModel[172] = new ModelRendererTurbo(this, 600, 270, textureX, textureY); // Box 214
		leftWingModel[173] = new ModelRendererTurbo(this, 600, 270, textureX, textureY); // Box 215
		leftWingModel[174] = new ModelRendererTurbo(this, 600, 270, textureX, textureY); // Box 216
		leftWingModel[175] = new ModelRendererTurbo(this, 600, 270, textureX, textureY); // Box 217
		leftWingModel[176] = new ModelRendererTurbo(this, 600, 270, textureX, textureY); // Box 218
		leftWingModel[177] = new ModelRendererTurbo(this, 600, 270, textureX, textureY); // Box 219
		leftWingModel[178] = new ModelRendererTurbo(this, 600, 280, textureX, textureY); // Box 220
		leftWingModel[179] = new ModelRendererTurbo(this, 600, 280, textureX, textureY); // Box 221
		leftWingModel[180] = new ModelRendererTurbo(this, 600, 280, textureX, textureY); // Box 222
		leftWingModel[181] = new ModelRendererTurbo(this, 600, 280, textureX, textureY); // Box 223
		leftWingModel[182] = new ModelRendererTurbo(this, 600, 290, textureX, textureY); // Box 224
		leftWingModel[183] = new ModelRendererTurbo(this, 600, 290, textureX, textureY); // Box 225
		leftWingModel[184] = new ModelRendererTurbo(this, 600, 290, textureX, textureY); // Box 226
		leftWingModel[185] = new ModelRendererTurbo(this, 600, 290, textureX, textureY); // Box 227
		leftWingModel[186] = new ModelRendererTurbo(this, 600, 300, textureX, textureY); // Box 228
		leftWingModel[187] = new ModelRendererTurbo(this, 600, 300, textureX, textureY); // Box 229
		leftWingModel[188] = new ModelRendererTurbo(this, 600, 300, textureX, textureY); // Box 230
		leftWingModel[189] = new ModelRendererTurbo(this, 600, 300, textureX, textureY); // Box 231
		leftWingModel[190] = new ModelRendererTurbo(this, 600, 310, textureX, textureY); // Box 232
		leftWingModel[191] = new ModelRendererTurbo(this, 600, 310, textureX, textureY); // Box 233
		leftWingModel[192] = new ModelRendererTurbo(this, 600, 350, textureX, textureY); // Box 234
		leftWingModel[193] = new ModelRendererTurbo(this, 600, 360, textureX, textureY); // Box 235
		leftWingModel[194] = new ModelRendererTurbo(this, 600, 370, textureX, textureY); // Box 236
		leftWingModel[195] = new ModelRendererTurbo(this, 600, 380, textureX, textureY); // Box 237
		leftWingModel[196] = new ModelRendererTurbo(this, 600, 420, textureX, textureY); // Box 238
		leftWingModel[197] = new ModelRendererTurbo(this, 600, 410, textureX, textureY); // Box 239
		leftWingModel[198] = new ModelRendererTurbo(this, 600, 390, textureX, textureY); // Box 0
		leftWingModel[199] = new ModelRendererTurbo(this, 600, 400, textureX, textureY); // Box 1
		leftWingModel[200] = new ModelRendererTurbo(this, 600, 430, textureX, textureY); // Box 2
		leftWingModel[201] = new ModelRendererTurbo(this, 600, 440, textureX, textureY); // Box 3
		leftWingModel[202] = new ModelRendererTurbo(this, 600, 450, textureX, textureY); // Box 4
		leftWingModel[203] = new ModelRendererTurbo(this, 600, 450, textureX, textureY); // Box 5
		leftWingModel[204] = new ModelRendererTurbo(this, 600, 460, textureX, textureY); // Box 6
		leftWingModel[205] = new ModelRendererTurbo(this, 600, 460, textureX, textureY); // Box 7
		leftWingModel[206] = new ModelRendererTurbo(this, 600, 450, textureX, textureY); // Box 8
		leftWingModel[207] = new ModelRendererTurbo(this, 600, 440, textureX, textureY); // Box 9
		leftWingModel[208] = new ModelRendererTurbo(this, 600, 460, textureX, textureY); // Box 10
		leftWingModel[209] = new ModelRendererTurbo(this, 600, 450, textureX, textureY); // Box 11
		leftWingModel[210] = new ModelRendererTurbo(this, 600, 430, textureX, textureY); // Box 12
		leftWingModel[211] = new ModelRendererTurbo(this, 600, 420, textureX, textureY); // Box 13
		leftWingModel[212] = new ModelRendererTurbo(this, 600, 350, textureX, textureY); // Box 14
		leftWingModel[213] = new ModelRendererTurbo(this, 600, 360, textureX, textureY); // Box 15
		leftWingModel[214] = new ModelRendererTurbo(this, 600, 370, textureX, textureY); // Box 16
		leftWingModel[215] = new ModelRendererTurbo(this, 600, 380, textureX, textureY); // Box 17
		leftWingModel[216] = new ModelRendererTurbo(this, 600, 390, textureX, textureY); // Box 18
		leftWingModel[217] = new ModelRendererTurbo(this, 600, 400, textureX, textureY); // Box 19
		leftWingModel[218] = new ModelRendererTurbo(this, 600, 410, textureX, textureY); // Box 20
		leftWingModel[219] = new ModelRendererTurbo(this, 600, 460, textureX, textureY); // Box 21
		leftWingModel[220] = new ModelRendererTurbo(this, 761, 257, textureX, textureY); // Box 51

		leftWingModel[0].addShapeBox(2F, 0F, 0F, 15, 2, 43, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // wingback
		leftWingModel[0].setRotationPoint(102F, -28F, -47F);
		leftWingModel[0].rotateAngleZ = -0.06981317F;

		leftWingModel[1].addShapeBox(-2F, 0F, 0F, 4, 2, 43, 0F,0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F); // wingback
		leftWingModel[1].setRotationPoint(102F, -28F, -47F);
		leftWingModel[1].rotateAngleZ = -0.06981317F;

		leftWingModel[2].addShapeBox(0F, -8F, -90F, 20, 8, 90, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		leftWingModel[2].setRotationPoint(-10F, -18F, -47F);
		leftWingModel[2].rotateAngleX = -0.10471976F;

		leftWingModel[3].addShapeBox(0F, -15.4F, -90.9F, 20, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		leftWingModel[3].setRotationPoint(-10F, -18F, -47F);

		leftWingModel[4].addShapeBox(0F, 0F, -4F, 20, 4, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		leftWingModel[4].setRotationPoint(-10F, -33.4F, -138F);
		leftWingModel[4].rotateAngleX = 0.40142573F;

		leftWingModel[5].addShapeBox(0F, -0.55F, -8.1F, 20, 3, 4, 0F,0F, -1.5F, 0F, 0F, -1.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		leftWingModel[5].setRotationPoint(-10F, -33.4F, -138F);
		leftWingModel[5].rotateAngleX = 0.78539816F;

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 8, 8, 39, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 141
		leftWingModel[6].setRotationPoint(-18F, -26F, -47F);

		leftWingModel[7].addShapeBox(0F, -8F, -90F, 8, 8, 90, 0F,-2F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 142
		leftWingModel[7].setRotationPoint(-18F, -18F, -47F);
		leftWingModel[7].rotateAngleX = -0.10471976F;

		leftWingModel[8].addShapeBox(0F, -15.4F, -90.9F, 8, 4, 2, 0F,-2.1F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2.1F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.95F, 0F); // Box 145
		leftWingModel[8].setRotationPoint(-18F, -18F, -47F);

		leftWingModel[9].addShapeBox(0F, 0F, -4F, 8, 4, 4, 0F,-2.7F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2.1F, -1.1F, -0.4F, -2.7F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.1F, -1.4F, -1F); // Box 146
		leftWingModel[9].setRotationPoint(-18F, -33.4F, -138F);
		leftWingModel[9].rotateAngleX = 0.40142573F;

		leftWingModel[10].addShapeBox(0F, -0.55F, -8.1F, 5, 3, 4, 0F,-1.5F, -1.5F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0.3F, -0.4F, -0.2F, -1.5F, -1F, -1.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0.3F, -1.65F, -0.6F); // Box 147
		leftWingModel[10].setRotationPoint(-15F, -33.4F, -138F);
		leftWingModel[10].rotateAngleX = 0.78539816F;

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 23, 8, 39, 0F,0F, 0F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 148
		leftWingModel[11].setRotationPoint(10F, -26F, -47F);

		leftWingModel[12].addShapeBox(0F, -8F, -35F, 21, 8, 35, 0F,0F, -0.8F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 149
		leftWingModel[12].setRotationPoint(10F, -18F, -47F);
		leftWingModel[12].rotateAngleX = -0.10471976F;

		leftWingModel[13].addShapeBox(0F, -8F, -90F, 21, 8, 8, 0F,0F, -2F, 0F, -8F, -3F, 0F, -7F, -3F, 0F, 0F, -1.8F, 0F, 0F, -2F, 0F, -8F, -3F, 0F, -7F, -3F, 0F, 0F, -1.8F, 0F); // Box 151
		leftWingModel[13].setRotationPoint(10F, -18F, -47F);
		leftWingModel[13].rotateAngleX = -0.10471976F;

		leftWingModel[14].addShapeBox(0F, -15.4F, -90.9F, 15, 4, 2, 0F,0F, 0F, 0F, -2.1F, -1.2F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.1F, -1.2F, 0F, -2F, -0.95F, 0F, 0F, 0F, 0F); // Box 152
		leftWingModel[14].setRotationPoint(10F, -18F, -47F);

		leftWingModel[15].addShapeBox(0F, 0F, -4F, 15, 4, 4, 0F,0F, -1F, 0F, -2.7F, -1.5F, 0F, -2.1F, -1.1F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, -2.7F, -1.5F, 0F, -2.1F, -1.4F, -1F, 0F, 0F, 0F); // Box 153
		leftWingModel[15].setRotationPoint(10F, -33.4F, -138F);
		leftWingModel[15].rotateAngleX = 0.40142573F;

		leftWingModel[16].addShapeBox(0F, -0.55F, -8.1F, 12, 3, 4, 0F,0F, -1.5F, 1.5F, -1.5F, -1.5F, -1.5F, 0.3F, -0.4F, -0.2F, 0F, 0F, 0F, 0F, -1F, 1.5F, -1.5F, -1F, -1.5F, 0.3F, -1.65F, -0.6F, 0F, 0F, 0F); // Box 154
		leftWingModel[16].setRotationPoint(10F, -33.4F, -138F);
		leftWingModel[16].rotateAngleX = 0.78539816F;

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 13, 14, 7, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 155
		leftWingModel[17].setRotationPoint(-30F, -24F, -45F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 5, 14, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		leftWingModel[18].setRotationPoint(-17F, -24F, -45F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 38, 14, 7, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 157
		leftWingModel[19].setRotationPoint(-12F, -24F, -45F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 6, 14, 7, 0F,0F, -8F, -2F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -8F, -2F, 0F, -4F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, -2F); // Box 158
		leftWingModel[20].setRotationPoint(-36F, -24F, -45F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 13, 14, 2, 0F,0F, -5F, -2F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 159
		leftWingModel[21].setRotationPoint(-30F, -24F, -47F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 13, 14, 2, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F); // Box 160
		leftWingModel[22].setRotationPoint(-30F, -24F, -38F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 5, 14, 2, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftWingModel[23].setRotationPoint(-17F, -24F, -47F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 5, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 1
		leftWingModel[24].setRotationPoint(-17F, -24F, -38F);

		leftWingModel[25].addShapeBox(0F, 0F, 0F, 38, 14, 2, 0F,0F, -5F, 0F, 0F, -4F, -1.5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -9F, -1.5F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 2
		leftWingModel[25].setRotationPoint(-12F, -24F, -47F);

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 38, 14, 2, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, -1.5F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -9F, -1.5F, 0F, -1F, 0F); // Box 3
		leftWingModel[26].setRotationPoint(-12F, -24F, -38F);

		leftWingModel[27].addShapeBox(0F, 0F, 0F, 26, 6, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 50
		leftWingModel[27].setRotationPoint(-19F, -26F, -96F);

		leftWingModel[28].addShapeBox(0F, 0F, 0F, 26, 6, 1, 0F,-5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		leftWingModel[28].setRotationPoint(-19F, -26F, -97F);

		leftWingModel[29].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 52
		leftWingModel[29].setRotationPoint(-19F, -24F, -78F);

		leftWingModel[30].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		leftWingModel[30].setRotationPoint(-19F, -24F, -79F);

		leftWingModel[31].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 54
		leftWingModel[31].setRotationPoint(-19F, -22F, -60F);

		leftWingModel[32].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		leftWingModel[32].setRotationPoint(-19F, -22F, -61F);

		leftWingModel[33].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 56
		leftWingModel[33].setRotationPoint(-19F, -20F, -28.5F);

		leftWingModel[34].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		leftWingModel[34].setRotationPoint(-19F, -20F, -29.5F);

		leftWingModel[35].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		leftWingModel[35].setRotationPoint(-19F, -20F, -11.5F);

		leftWingModel[36].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 59
		leftWingModel[36].setRotationPoint(-19F, -20F, -10.5F);

		leftWingModel[37].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		leftWingModel[37].setRotationPoint(-17F, -15F, -60.5F);

		leftWingModel[38].addShapeBox(0F, 0F, -2F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		leftWingModel[38].setRotationPoint(-17F, -15F, -60.5F);
		leftWingModel[38].rotateAngleX = 0.20943951F;

		leftWingModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		leftWingModel[39].setRotationPoint(-17F, -15F, -59.5F);
		leftWingModel[39].rotateAngleX = -0.20943951F;

		leftWingModel[40].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		leftWingModel[40].setRotationPoint(-17F, -14F, -60.5F);

		leftWingModel[41].addShapeBox(-3F, 0F, -0.5F, 24, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		leftWingModel[41].setRotationPoint(-15F, -11F, -60.5F);

		leftWingModel[42].addShapeBox(-4F, 0F, -0.5F, 24, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 65
		leftWingModel[42].setRotationPoint(-15F, -15F, -62.5F);

		leftWingModel[43].addShapeBox(21F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		leftWingModel[43].setRotationPoint(-17F, -15F, -59.5F);
		leftWingModel[43].rotateAngleX = -0.20943951F;

		leftWingModel[44].addShapeBox(21F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		leftWingModel[44].setRotationPoint(-17F, -14F, -60.5F);

		leftWingModel[45].addShapeBox(21F, 0F, -2F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		leftWingModel[45].setRotationPoint(-17F, -15F, -60.5F);
		leftWingModel[45].rotateAngleX = 0.20943951F;

		leftWingModel[46].addShapeBox(10.5F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		leftWingModel[46].setRotationPoint(-17F, -15F, -59.5F);
		leftWingModel[46].rotateAngleX = -0.20943951F;

		leftWingModel[47].addShapeBox(10.5F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		leftWingModel[47].setRotationPoint(-17F, -14F, -60.5F);

		leftWingModel[48].addShapeBox(10.5F, 0F, -2F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		leftWingModel[48].setRotationPoint(-17F, -15F, -60.5F);
		leftWingModel[48].rotateAngleX = 0.20943951F;

		leftWingModel[49].addShapeBox(-7F, 0F, -0.5F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 73
		leftWingModel[49].setRotationPoint(-15F, -15F, -62.5F);

		leftWingModel[50].addShapeBox(20F, 0F, -0.5F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 74
		leftWingModel[50].setRotationPoint(-15F, -15F, -62.5F);

		leftWingModel[51].addShapeBox(-7F, 0F, -0.5F, 3, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		leftWingModel[51].setRotationPoint(-15F, -15F, -57.5F);

		leftWingModel[52].addShapeBox(-4F, 0F, -0.5F, 24, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		leftWingModel[52].setRotationPoint(-15F, -15F, -57.5F);

		leftWingModel[53].addShapeBox(20F, 0F, -0.5F, 3, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		leftWingModel[53].setRotationPoint(-15F, -15F, -57.5F);

		leftWingModel[54].addShapeBox(-3F, 0F, -0.5F, 3, 1, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		leftWingModel[54].setRotationPoint(-18F, -11F, -60.5F);

		leftWingModel[55].addShapeBox(-3F, 0F, -0.5F, 3, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		leftWingModel[55].setRotationPoint(9F, -11F, -60.5F);

		leftWingModel[56].addShapeBox(-3F, 0F, -2.5F, 30, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		leftWingModel[56].setRotationPoint(-17F, -10F, -60.5F);

		leftWingModel[57].addShapeBox(-3F, 0F, -2.5F, 30, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		leftWingModel[57].setRotationPoint(-17F, -8F, -60.5F);

		leftWingModel[58].addShapeBox(-3F, 0F, -2.5F, 30, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 82
		leftWingModel[58].setRotationPoint(-17F, -6F, -60.5F);

		leftWingModel[59].addShapeBox(-3F, 0F, -2.5F, 6, 2, 6, 0F,0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 83
		leftWingModel[59].setRotationPoint(-23F, -10F, -60.5F);

		leftWingModel[60].addShapeBox(-3F, 0F, -2.5F, 6, 2, 6, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -2F); // Box 84
		leftWingModel[60].setRotationPoint(-23F, -6F, -60.5F);

		leftWingModel[61].addShapeBox(-3F, -2F, -2.5F, 6, 2, 6, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 85
		leftWingModel[61].setRotationPoint(-23F, -6F, -60.5F);

		leftWingModel[62].addShapeBox(-3F, -2F, -2.5F, 2, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F); // Box 86
		leftWingModel[62].setRotationPoint(-25F, -6F, -60.5F);

		leftWingModel[63].addShapeBox(-3F, -4F, -2.5F, 2, 2, 6, 0F,0F, -2F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F); // Box 87
		leftWingModel[63].setRotationPoint(-25F, -6F, -60.5F);

		leftWingModel[64].addShapeBox(-3F, -4F, -2.5F, 2, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -2F, -2F); // Box 88
		leftWingModel[64].setRotationPoint(-25F, -2F, -60.5F);

		leftWingModel[65].addShapeBox(35F, 0F, 3F, 2, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		leftWingModel[65].setRotationPoint(-28F, -7F, -60F);
		leftWingModel[65].rotateAngleX = 0.78539816F;

		leftWingModel[66].addShapeBox(35F, 0F, 3F, 2, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		leftWingModel[66].setRotationPoint(-28F, -7F, -60F);
		leftWingModel[66].rotateAngleX = -0.78539816F;

		leftWingModel[67].addShapeBox(35F, 0F, 3F, 2, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		leftWingModel[67].setRotationPoint(-28F, -7F, -60F);
		leftWingModel[67].rotateAngleX = 2.35619449F;

		leftWingModel[68].addShapeBox(35F, 0F, 3F, 2, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		leftWingModel[68].setRotationPoint(-28F, -7F, -60F);
		leftWingModel[68].rotateAngleX = -2.35619449F;

		leftWingModel[69].addShapeBox(12F, 0F, 3F, 21, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 94
		leftWingModel[69].setRotationPoint(-28F, -7F, -60F);
		leftWingModel[69].rotateAngleX = 2.35619449F;

		leftWingModel[70].addShapeBox(12F, 0F, 3F, 21, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 95
		leftWingModel[70].setRotationPoint(-28F, -7F, -60F);
		leftWingModel[70].rotateAngleX = -2.35619449F;

		leftWingModel[71].addShapeBox(12F, 0F, 3F, 21, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 96
		leftWingModel[71].setRotationPoint(-28F, -7F, -60F);
		leftWingModel[71].rotateAngleX = 0.78539816F;

		leftWingModel[72].addShapeBox(12F, 0F, 3F, 21, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 97
		leftWingModel[72].setRotationPoint(-28F, -7F, -60F);
		leftWingModel[72].rotateAngleX = -0.78539816F;

		leftWingModel[73].addShapeBox(-3F, -4F, -2.5F, 2, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -2F, -2F); // Box 115
		leftWingModel[73].setRotationPoint(-25F, -9F, -66.5F);

		leftWingModel[74].addShapeBox(-3F, -2F, -2.5F, 2, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F); // Box 116
		leftWingModel[74].setRotationPoint(-25F, -13F, -66.5F);

		leftWingModel[75].addShapeBox(-3F, -4F, -2.5F, 2, 2, 6, 0F,0F, -2F, -1.99F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -2F, -1.99F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F); // Box 117
		leftWingModel[75].setRotationPoint(-25F, -13F, -66.5F);

		leftWingModel[76].addShapeBox(-3F, 0F, -2.5F, 6, 2, 6, 0F,0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 118
		leftWingModel[76].setRotationPoint(-23F, -17F, -66.5F);

		leftWingModel[77].addShapeBox(-3F, -2F, -2.5F, 6, 2, 6, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 119
		leftWingModel[77].setRotationPoint(-23F, -13F, -66.5F);

		leftWingModel[78].addShapeBox(-3F, 0F, -2.5F, 6, 2, 6, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -2F); // Box 120
		leftWingModel[78].setRotationPoint(-23F, -13F, -66.5F);

		leftWingModel[79].addShapeBox(-3F, 0F, -2.5F, 30, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		leftWingModel[79].setRotationPoint(-17F, -17F, -66.5F);

		leftWingModel[80].addShapeBox(-3F, 0F, -2.5F, 30, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		leftWingModel[80].setRotationPoint(-17F, -15F, -66.5F);

		leftWingModel[81].addShapeBox(-3F, 0F, -2.5F, 30, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 123
		leftWingModel[81].setRotationPoint(-17F, -13F, -66.5F);

		leftWingModel[82].addShapeBox(12F, 0F, 3F, 21, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 124
		leftWingModel[82].setRotationPoint(-28F, -14F, -66F);
		leftWingModel[82].rotateAngleX = -2.35619449F;

		leftWingModel[83].addShapeBox(12F, 0F, 3F, 21, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 125
		leftWingModel[83].setRotationPoint(-28F, -14F, -66F);
		leftWingModel[83].rotateAngleX = 2.35619449F;

		leftWingModel[84].addShapeBox(35F, 0F, 3F, 2, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		leftWingModel[84].setRotationPoint(-28F, -14F, -66F);
		leftWingModel[84].rotateAngleX = 2.35619449F;

		leftWingModel[85].addShapeBox(35F, 0F, 3F, 2, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		leftWingModel[85].setRotationPoint(-28F, -14F, -66F);
		leftWingModel[85].rotateAngleX = -2.35619449F;

		leftWingModel[86].addShapeBox(35F, 0F, 3F, 2, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		leftWingModel[86].setRotationPoint(-28F, -14F, -66F);
		leftWingModel[86].rotateAngleX = -0.78539816F;

		leftWingModel[87].addShapeBox(12F, 0F, 3F, 21, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 129
		leftWingModel[87].setRotationPoint(-28F, -14F, -66F);
		leftWingModel[87].rotateAngleX = -0.78539816F;

		leftWingModel[88].addShapeBox(35F, 0F, 3F, 2, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		leftWingModel[88].setRotationPoint(-28F, -14F, -66F);
		leftWingModel[88].rotateAngleX = 0.78539816F;

		leftWingModel[89].addShapeBox(12F, 0F, 3F, 21, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 131
		leftWingModel[89].setRotationPoint(-28F, -14F, -66F);
		leftWingModel[89].rotateAngleX = 0.78539816F;

		leftWingModel[90].addShapeBox(-3F, -4F, -2.5F, 2, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -2F, -2F); // Box 132
		leftWingModel[90].setRotationPoint(-25F, -9F, -54.5F);

		leftWingModel[91].addShapeBox(-3F, -2F, -2.5F, 2, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F); // Box 133
		leftWingModel[91].setRotationPoint(-25F, -13F, -54.5F);

		leftWingModel[92].addShapeBox(-3F, -4F, -2.5F, 2, 2, 6, 0F,0F, -2F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F); // Box 134
		leftWingModel[92].setRotationPoint(-25F, -13F, -54.5F);

		leftWingModel[93].addShapeBox(-3F, 0F, -2.5F, 6, 2, 6, 0F,0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 135
		leftWingModel[93].setRotationPoint(-23F, -17F, -54.5F);

		leftWingModel[94].addShapeBox(-3F, -2F, -2.5F, 6, 2, 6, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 136
		leftWingModel[94].setRotationPoint(-23F, -13F, -54.5F);

		leftWingModel[95].addShapeBox(-3F, 0F, -2.5F, 6, 2, 6, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -2F); // Box 137
		leftWingModel[95].setRotationPoint(-23F, -13F, -54.5F);

		leftWingModel[96].addShapeBox(-3F, 0F, -2.5F, 30, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		leftWingModel[96].setRotationPoint(-17F, -17F, -54.5F);

		leftWingModel[97].addShapeBox(-3F, 0F, -2.5F, 30, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		leftWingModel[97].setRotationPoint(-17F, -15F, -54.5F);

		leftWingModel[98].addShapeBox(-3F, 0F, -2.5F, 30, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 140
		leftWingModel[98].setRotationPoint(-17F, -13F, -54.5F);

		leftWingModel[99].addShapeBox(12F, 0F, 3F, 21, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 141
		leftWingModel[99].setRotationPoint(-28F, -14F, -54F);
		leftWingModel[99].rotateAngleX = -2.35619449F;

		leftWingModel[100].addShapeBox(12F, 0F, 3F, 21, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 142
		leftWingModel[100].setRotationPoint(-28F, -14F, -54F);
		leftWingModel[100].rotateAngleX = 2.35619449F;

		leftWingModel[101].addShapeBox(35F, 0F, 3F, 2, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		leftWingModel[101].setRotationPoint(-28F, -14F, -54F);
		leftWingModel[101].rotateAngleX = 2.35619449F;

		leftWingModel[102].addShapeBox(35F, 0F, 3F, 2, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		leftWingModel[102].setRotationPoint(-28F, -14F, -54F);
		leftWingModel[102].rotateAngleX = -2.35619449F;

		leftWingModel[103].addShapeBox(35F, 0F, 3F, 2, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		leftWingModel[103].setRotationPoint(-28F, -14F, -54F);
		leftWingModel[103].rotateAngleX = -0.78539816F;

		leftWingModel[104].addShapeBox(12F, 0F, 3F, 21, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 146
		leftWingModel[104].setRotationPoint(-28F, -14F, -54F);
		leftWingModel[104].rotateAngleX = -0.78539816F;

		leftWingModel[105].addShapeBox(35F, 0F, 3F, 2, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		leftWingModel[105].setRotationPoint(-28F, -14F, -54F);
		leftWingModel[105].rotateAngleX = 0.78539816F;

		leftWingModel[106].addShapeBox(12F, 0F, 3F, 21, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 148
		leftWingModel[106].setRotationPoint(-28F, -14F, -54F);
		leftWingModel[106].rotateAngleX = 0.78539816F;

		leftWingModel[107].addShapeBox(0F, 0F, 0F, 25, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		leftWingModel[107].setRotationPoint(-19F, -20F, -98.5F);

		leftWingModel[108].addShapeBox(0F, 0F, 0F, 33, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		leftWingModel[108].setRotationPoint(-24F, -20F, -99.5F);

		leftWingModel[109].addShapeBox(0F, 0F, 0F, 33, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		leftWingModel[109].setRotationPoint(-24F, -20F, -93.5F);

		leftWingModel[110].addShapeBox(0F, 0F, 0F, 43, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		leftWingModel[110].setRotationPoint(-33F, -21F, -102.5F);

		leftWingModel[111].addShapeBox(0F, 0F, 0F, 43, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		leftWingModel[111].setRotationPoint(-33F, -20F, -102.5F);

		leftWingModel[112].addShapeBox(0F, 0F, 0F, 43, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 154
		leftWingModel[112].setRotationPoint(-33F, -19F, -102.5F);

		leftWingModel[113].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 155
		leftWingModel[113].setRotationPoint(-37F, -21F, -102.5F);

		leftWingModel[114].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 156
		leftWingModel[114].setRotationPoint(-37F, -20F, -102.5F);

		leftWingModel[115].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Box 157
		leftWingModel[115].setRotationPoint(-37F, -19F, -102.5F);

		leftWingModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 158
		leftWingModel[116].setRotationPoint(-38F, -20F, -101.5F);

		leftWingModel[117].addShapeBox(40F, -5F, 0F, 7, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		leftWingModel[117].setRotationPoint(-38F, -19.5F, -101F);
		leftWingModel[117].rotateAngleX = 0.78539816F;

		leftWingModel[118].addShapeBox(36F, -5F, 0F, 4, 4, 0, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		leftWingModel[118].setRotationPoint(-38F, -19.5F, -101F);
		leftWingModel[118].rotateAngleX = 0.78539816F;

		leftWingModel[119].addShapeBox(40F, -5F, 0F, 7, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		leftWingModel[119].setRotationPoint(-38F, -19.5F, -101F);
		leftWingModel[119].rotateAngleX = 2.35619449F;

		leftWingModel[120].addShapeBox(40F, -5F, 0F, 7, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		leftWingModel[120].setRotationPoint(-38F, -19.5F, -101F);
		leftWingModel[120].rotateAngleX = -0.78539816F;

		leftWingModel[121].addShapeBox(40F, -5F, 0F, 7, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		leftWingModel[121].setRotationPoint(-38F, -19.5F, -101F);
		leftWingModel[121].rotateAngleX = -2.35619449F;

		leftWingModel[122].addShapeBox(36F, -5F, 0F, 4, 4, 0, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		leftWingModel[122].setRotationPoint(-38F, -19.5F, -101F);
		leftWingModel[122].rotateAngleX = -0.78539816F;

		leftWingModel[123].addShapeBox(36F, -5F, 0F, 4, 4, 0, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		leftWingModel[123].setRotationPoint(-38F, -19.5F, -101F);
		leftWingModel[123].rotateAngleX = 2.35619449F;

		leftWingModel[124].addShapeBox(36F, -5F, 0F, 4, 4, 0, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		leftWingModel[124].setRotationPoint(-38F, -19.5F, -101F);
		leftWingModel[124].rotateAngleX = -2.35619449F;

		leftWingModel[125].addShapeBox(5F, -5F, 0F, 4, 4, 0, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		leftWingModel[125].setRotationPoint(-38F, -19.5F, -101F);
		leftWingModel[125].rotateAngleX = 0.78539816F;

		leftWingModel[126].addShapeBox(5F, -5F, 0F, 4, 4, 0, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		leftWingModel[126].setRotationPoint(-38F, -19.5F, -101F);
		leftWingModel[126].rotateAngleX = 2.35619449F;

		leftWingModel[127].addShapeBox(22F, -5F, 0F, 4, 4, 0, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		leftWingModel[127].setRotationPoint(-55F, -19.5F, -101F);
		leftWingModel[127].rotateAngleX = -2.35619449F;

		leftWingModel[128].addShapeBox(5F, -5F, 0F, 4, 4, 0, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		leftWingModel[128].setRotationPoint(-38F, -19.5F, -101F);
		leftWingModel[128].rotateAngleX = -0.78539816F;

		leftWingModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 171
		leftWingModel[129].setRotationPoint(-38F, -20F, -91.5F);

		leftWingModel[130].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 172
		leftWingModel[130].setRotationPoint(-37F, -21F, -92.5F);

		leftWingModel[131].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 173
		leftWingModel[131].setRotationPoint(-37F, -20F, -92.5F);

		leftWingModel[132].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Box 174
		leftWingModel[132].setRotationPoint(-37F, -19F, -92.5F);

		leftWingModel[133].addShapeBox(5F, -5F, 0F, 4, 4, 0, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		leftWingModel[133].setRotationPoint(-38F, -19.5F, -91F);
		leftWingModel[133].rotateAngleX = 2.35619449F;

		leftWingModel[134].addShapeBox(0F, 0F, 0F, 43, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		leftWingModel[134].setRotationPoint(-33F, -20F, -92.5F);

		leftWingModel[135].addShapeBox(0F, 0F, 0F, 43, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		leftWingModel[135].setRotationPoint(-33F, -21F, -92.5F);

		leftWingModel[136].addShapeBox(5F, -5F, 0F, 4, 4, 0, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		leftWingModel[136].setRotationPoint(-38F, -19.5F, -91F);
		leftWingModel[136].rotateAngleX = 0.78539816F;

		leftWingModel[137].addShapeBox(5F, -5F, 0F, 4, 4, 0, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		leftWingModel[137].setRotationPoint(-38F, -19.5F, -91F);
		leftWingModel[137].rotateAngleX = -0.78539816F;

		leftWingModel[138].addShapeBox(0F, 0F, 0F, 43, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 180
		leftWingModel[138].setRotationPoint(-33F, -19F, -92.5F);

		leftWingModel[139].addShapeBox(22F, -5F, 0F, 4, 4, 0, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		leftWingModel[139].setRotationPoint(-55F, -19.5F, -91F);
		leftWingModel[139].rotateAngleX = -2.35619449F;

		leftWingModel[140].addShapeBox(36F, -5F, 0F, 4, 4, 0, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		leftWingModel[140].setRotationPoint(-38F, -19.5F, -91F);
		leftWingModel[140].rotateAngleX = 0.78539816F;

		leftWingModel[141].addShapeBox(40F, -5F, 0F, 7, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		leftWingModel[141].setRotationPoint(-38F, -19.5F, -91F);
		leftWingModel[141].rotateAngleX = 0.78539816F;

		leftWingModel[142].addShapeBox(40F, -5F, 0F, 7, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		leftWingModel[142].setRotationPoint(-38F, -19.5F, -91F);
		leftWingModel[142].rotateAngleX = 2.35619449F;

		leftWingModel[143].addShapeBox(36F, -5F, 0F, 4, 4, 0, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		leftWingModel[143].setRotationPoint(-38F, -19.5F, -91F);
		leftWingModel[143].rotateAngleX = 2.35619449F;

		leftWingModel[144].addShapeBox(40F, -5F, 0F, 7, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		leftWingModel[144].setRotationPoint(-38F, -19.5F, -91F);
		leftWingModel[144].rotateAngleX = -2.35619449F;

		leftWingModel[145].addShapeBox(36F, -5F, 0F, 4, 4, 0, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		leftWingModel[145].setRotationPoint(-38F, -19.5F, -91F);
		leftWingModel[145].rotateAngleX = -2.35619449F;

		leftWingModel[146].addShapeBox(40F, -5F, 0F, 7, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		leftWingModel[146].setRotationPoint(-38F, -19.5F, -91F);
		leftWingModel[146].rotateAngleX = -0.78539816F;

		leftWingModel[147].addShapeBox(36F, -5F, 0F, 4, 4, 0, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		leftWingModel[147].setRotationPoint(-38F, -19.5F, -91F);
		leftWingModel[147].rotateAngleX = -0.78539816F;

		leftWingModel[148].addShapeBox(0F, -0.5F, -0.5F, 28, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		leftWingModel[148].setRotationPoint(-22F, -14F, -78F);

		leftWingModel[149].addShapeBox(-5F, -3F, -0.5F, 30, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		leftWingModel[149].setRotationPoint(-18F, -14F, -78F);

		leftWingModel[150].addShapeBox(-5F, -3F, -0.5F, 30, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		leftWingModel[150].setRotationPoint(-18F, -14F, -78F);
		leftWingModel[150].rotateAngleX = 0.39269908F;

		leftWingModel[151].addShapeBox(-5F, -3F, -0.5F, 30, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		leftWingModel[151].setRotationPoint(-18F, -14F, -78F);
		leftWingModel[151].rotateAngleX = -0.39269908F;

		leftWingModel[152].addShapeBox(-5F, -3F, -0.5F, 30, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		leftWingModel[152].setRotationPoint(-18F, -14F, -78F);
		leftWingModel[152].rotateAngleX = 0.78539816F;

		leftWingModel[153].addShapeBox(-5F, -3F, -0.5F, 30, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		leftWingModel[153].setRotationPoint(-18F, -14F, -78F);
		leftWingModel[153].rotateAngleX = -0.78539816F;

		leftWingModel[154].addShapeBox(-5F, -3F, -0.5F, 30, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		leftWingModel[154].setRotationPoint(-18F, -14F, -78F);
		leftWingModel[154].rotateAngleX = 1.57079633F;

		leftWingModel[155].addShapeBox(-5F, -3F, -0.5F, 30, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		leftWingModel[155].setRotationPoint(-18F, -14F, -78F);
		leftWingModel[155].rotateAngleX = -1.57079633F;

		leftWingModel[156].addShapeBox(-5F, -3F, -0.5F, 30, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		leftWingModel[156].setRotationPoint(-18F, -14F, -78F);
		leftWingModel[156].rotateAngleX = -1.17809725F;

		leftWingModel[157].addShapeBox(-5F, -3F, -0.5F, 30, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		leftWingModel[157].setRotationPoint(-18F, -14F, -78F);
		leftWingModel[157].rotateAngleX = 1.17809725F;

		leftWingModel[158].addShapeBox(-5F, -3F, -0.5F, 30, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		leftWingModel[158].setRotationPoint(-18F, -14F, -78F);
		leftWingModel[158].rotateAngleX = 3.14159265F;

		leftWingModel[159].addShapeBox(-5F, -3F, -0.5F, 30, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		leftWingModel[159].setRotationPoint(-18F, -14F, -78F);
		leftWingModel[159].rotateAngleX = 2.74889357F;

		leftWingModel[160].addShapeBox(-5F, -3F, -0.5F, 30, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		leftWingModel[160].setRotationPoint(-18F, -14F, -78F);
		leftWingModel[160].rotateAngleX = -2.74889357F;

		leftWingModel[161].addShapeBox(-5F, -3F, -0.5F, 30, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		leftWingModel[161].setRotationPoint(-18F, -14F, -78F);
		leftWingModel[161].rotateAngleX = 1.96349541F;

		leftWingModel[162].addShapeBox(-5F, -3F, -0.5F, 30, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		leftWingModel[162].setRotationPoint(-18F, -14F, -78F);
		leftWingModel[162].rotateAngleX = -1.96349541F;

		leftWingModel[163].addShapeBox(-5F, -3F, -0.5F, 30, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		leftWingModel[163].setRotationPoint(-18F, -14F, -78F);
		leftWingModel[163].rotateAngleX = 2.35619449F;

		leftWingModel[164].addShapeBox(-5F, -3F, -0.5F, 30, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		leftWingModel[164].setRotationPoint(-18F, -14F, -78F);
		leftWingModel[164].rotateAngleX = -2.35619449F;

		leftWingModel[165].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 207
		leftWingModel[165].setRotationPoint(-23F, -14F, -78F);

		leftWingModel[166].addShapeBox(0F, -1.75F, 0.1F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 208
		leftWingModel[166].setRotationPoint(-23F, -14F, -78F);

		leftWingModel[167].addShapeBox(0F, -1.75F, -1.1F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 209
		leftWingModel[167].setRotationPoint(-23F, -14F, -78F);

		leftWingModel[168].addShapeBox(0F, -0.5F, -1.75F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 210
		leftWingModel[168].setRotationPoint(-23F, -14F, -78F);

		leftWingModel[169].addShapeBox(0F, -0.5F, 0.75F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 211
		leftWingModel[169].setRotationPoint(-23F, -14F, -78F);

		leftWingModel[170].addShapeBox(0F, 0.75F, -1.1F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 212
		leftWingModel[170].setRotationPoint(-23F, -14F, -78F);

		leftWingModel[171].addShapeBox(0F, 0.75F, 0.1F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 213
		leftWingModel[171].setRotationPoint(-23F, -14F, -78F);

		leftWingModel[172].addShapeBox(0F, -0.5F, 0.75F, 28, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		leftWingModel[172].setRotationPoint(-22F, -14F, -78F);

		leftWingModel[173].addShapeBox(0F, -0.5F, -1.75F, 28, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		leftWingModel[173].setRotationPoint(-22F, -14F, -78F);

		leftWingModel[174].addShapeBox(0F, 0.75F, 0.1F, 28, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		leftWingModel[174].setRotationPoint(-22F, -14F, -78F);

		leftWingModel[175].addShapeBox(0F, -1.75F, 0.1F, 28, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		leftWingModel[175].setRotationPoint(-22F, -14F, -78F);

		leftWingModel[176].addShapeBox(0F, -1.75F, -1.1F, 28, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		leftWingModel[176].setRotationPoint(-22F, -14F, -78F);

		leftWingModel[177].addShapeBox(0F, 0.75F, -1.1F, 28, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		leftWingModel[177].setRotationPoint(-22F, -14F, -78F);

		leftWingModel[178].addShapeBox(0.5F, -1.5F, 1.75F, 29, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 220
		leftWingModel[178].setRotationPoint(-23F, -14F, -78F);

		leftWingModel[179].addShapeBox(0.5F, -1.5F, -2.75F, 29, 3, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		leftWingModel[179].setRotationPoint(-23F, -14F, -78F);

		leftWingModel[180].addShapeBox(0.5F, -1.5F, 1.75F, 29, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 222
		leftWingModel[180].setRotationPoint(-23F, -14F, -78F);
		leftWingModel[180].rotateAngleX = 1.57079633F;

		leftWingModel[181].addShapeBox(0.5F, -1.5F, 1.75F, 29, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 223
		leftWingModel[181].setRotationPoint(-23F, -14F, -78F);
		leftWingModel[181].rotateAngleX = -1.57079633F;

		leftWingModel[182].addShapeBox(0.5F, -1.75F, 1.1F, 29, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		leftWingModel[182].setRotationPoint(-23F, -14F, -78F);

		leftWingModel[183].addShapeBox(0.5F, 0.75F, 1.1F, 29, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		leftWingModel[183].setRotationPoint(-23F, -14F, -78F);

		leftWingModel[184].addShapeBox(0.5F, -1.75F, -2.1F, 29, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		leftWingModel[184].setRotationPoint(-23F, -14F, -78F);

		leftWingModel[185].addShapeBox(0.5F, 0.75F, -2.1F, 29, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		leftWingModel[185].setRotationPoint(-23F, -14F, -78F);

		leftWingModel[186].addShapeBox(0.5F, -1.75F, -0.5F, 29, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 228
		leftWingModel[186].setRotationPoint(-23F, -14F, -78F);

		leftWingModel[187].addShapeBox(0.5F, 0.75F, -0.5F, 29, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 229
		leftWingModel[187].setRotationPoint(-23F, -14F, -78F);

		leftWingModel[188].addShapeBox(0.5F, -0.5F, 0.05F, 29, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.45F, 0F, 0F, -0.45F); // Box 230
		leftWingModel[188].setRotationPoint(-23F, -14F, -78F);

		leftWingModel[189].addShapeBox(0.5F, -0.5F, -1.05F, 29, 1, 1, 0F,0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 231
		leftWingModel[189].setRotationPoint(-23F, -14F, -78F);

		leftWingModel[190].addShapeBox(0.5F, 0.15F, -2F, 29, 1, 4, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 232
		leftWingModel[190].setRotationPoint(-23F, -14F, -78F);

		leftWingModel[191].addShapeBox(0.5F, -1.15F, -2F, 29, 1, 4, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 233
		leftWingModel[191].setRotationPoint(-23F, -14F, -78F);

		leftWingModel[192].addShapeBox(0F, 0F, 0F, 20, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		leftWingModel[192].setRotationPoint(-18F, -13F, -31.5F);

		leftWingModel[193].addShapeBox(0F, 0F, 0F, 20, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		leftWingModel[193].setRotationPoint(-18F, -11F, -31.5F);

		leftWingModel[194].addShapeBox(0F, 0F, 0F, 20, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 236
		leftWingModel[194].setRotationPoint(-18F, -9F, -31.5F);

		leftWingModel[195].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 237
		leftWingModel[195].setRotationPoint(-24F, -13F, -31.5F);

		leftWingModel[196].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, -2F, 0F, -2.5F, -2.5F, 0F, -2.5F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0F, 0F); // Box 238
		leftWingModel[196].setRotationPoint(2F, -13F, -31.5F);

		leftWingModel[197].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 239
		leftWingModel[197].setRotationPoint(-26F, -11F, -29.5F);

		leftWingModel[198].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 0
		leftWingModel[198].setRotationPoint(-24F, -11F, -31.5F);

		leftWingModel[199].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F); // Box 1
		leftWingModel[199].setRotationPoint(-24F, -9F, -31.5F);

		leftWingModel[200].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, 0F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, 0F); // Box 2
		leftWingModel[200].setRotationPoint(2F, -11F, -31.5F);

		leftWingModel[201].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, 0F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2.5F, -2.5F, 0F, -2.5F, -2.5F, 0F, 0F, -2F); // Box 3
		leftWingModel[201].setRotationPoint(2F, -9F, -31.5F);

		leftWingModel[202].addShapeBox(35F, -3F, 0F, 2, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		leftWingModel[202].setRotationPoint(-26F, -10F, -28.5F);
		leftWingModel[202].rotateAngleX = 0.78539816F;

		leftWingModel[203].addShapeBox(35F, -3F, 0F, 2, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		leftWingModel[203].setRotationPoint(-26F, -10F, -28.5F);
		leftWingModel[203].rotateAngleX = -0.78539816F;

		leftWingModel[204].addShapeBox(32F, -3F, 0F, 3, 6, 0, 0F,0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F); // Box 6
		leftWingModel[204].setRotationPoint(-26F, -10F, -28.5F);
		leftWingModel[204].rotateAngleX = -0.78539816F;

		leftWingModel[205].addShapeBox(32F, -3F, 0F, 3, 6, 0, 0F,0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F); // Box 7
		leftWingModel[205].setRotationPoint(-26F, -10F, -28.5F);
		leftWingModel[205].rotateAngleX = 0.78539816F;

		leftWingModel[206].addShapeBox(35F, -3F, 0F, 2, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		leftWingModel[206].setRotationPoint(-26F, -10F, -10.5F);
		leftWingModel[206].rotateAngleX = 0.78539816F;

		leftWingModel[207].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, 0F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2.5F, -2.5F, 0F, -2.5F, -2.5F, 0F, 0F, -2F); // Box 9
		leftWingModel[207].setRotationPoint(2F, -9F, -13.5F);

		leftWingModel[208].addShapeBox(32F, -3F, 0F, 3, 6, 0, 0F,0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F); // Box 10
		leftWingModel[208].setRotationPoint(-26F, -10F, -10.5F);
		leftWingModel[208].rotateAngleX = -0.78539816F;

		leftWingModel[209].addShapeBox(35F, -3F, 0F, 2, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		leftWingModel[209].setRotationPoint(-26F, -10F, -10.5F);
		leftWingModel[209].rotateAngleX = -0.78539816F;

		leftWingModel[210].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, 0F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, 0F); // Box 12
		leftWingModel[210].setRotationPoint(2F, -11F, -13.5F);

		leftWingModel[211].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, -2F, 0F, -2.5F, -2.5F, 0F, -2.5F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0F, 0F); // Box 13
		leftWingModel[211].setRotationPoint(2F, -13F, -13.5F);

		leftWingModel[212].addShapeBox(0F, 0F, 0F, 20, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		leftWingModel[212].setRotationPoint(-18F, -13F, -13.5F);

		leftWingModel[213].addShapeBox(0F, 0F, 0F, 20, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		leftWingModel[213].setRotationPoint(-18F, -11F, -13.5F);

		leftWingModel[214].addShapeBox(0F, 0F, 0F, 20, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 16
		leftWingModel[214].setRotationPoint(-18F, -9F, -13.5F);

		leftWingModel[215].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 17
		leftWingModel[215].setRotationPoint(-24F, -13F, -13.5F);

		leftWingModel[216].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 18
		leftWingModel[216].setRotationPoint(-24F, -11F, -13.5F);

		leftWingModel[217].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F); // Box 19
		leftWingModel[217].setRotationPoint(-24F, -9F, -13.5F);

		leftWingModel[218].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 20
		leftWingModel[218].setRotationPoint(-26F, -11F, -11.5F);

		leftWingModel[219].addShapeBox(32F, -3F, 0F, 3, 6, 0, 0F,0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F); // Box 21
		leftWingModel[219].setRotationPoint(-26F, -10F, -10.5F);
		leftWingModel[219].rotateAngleX = 0.78539816F;

		leftWingModel[220].addShapeBox(0F, 0F, 0F, 38, 14, 7, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 51
		leftWingModel[220].setRotationPoint(-12F, -24F, 38F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // wingback
		rightWingModel[1] = new ModelRendererTurbo(this, 929, 73, textureX, textureY); // wing back
		rightWingModel[2] = new ModelRendererTurbo(this, 841, 113, textureX, textureY); // Box 136
		rightWingModel[3] = new ModelRendererTurbo(this, 49, 193, textureX, textureY); // Box 22
		rightWingModel[4] = new ModelRendererTurbo(this, 889, 201, textureX, textureY); // Box 23
		rightWingModel[5] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 24
		rightWingModel[6] = new ModelRendererTurbo(this, 473, 249, textureX, textureY); // Box 25
		rightWingModel[7] = new ModelRendererTurbo(this, 801, 249, textureX, textureY); // Box 26
		rightWingModel[8] = new ModelRendererTurbo(this, 36, 292, textureX, textureY); // Box 27
		rightWingModel[9] = new ModelRendererTurbo(this, 921, 145, textureX, textureY); // Box 30
		rightWingModel[10] = new ModelRendererTurbo(this, 89, 153, textureX, textureY); // Box 31
		rightWingModel[11] = new ModelRendererTurbo(this, 521, 153, textureX, textureY); // Box 32
		rightWingModel[12] = new ModelRendererTurbo(this, 697, 153, textureX, textureY); // Box 33
		rightWingModel[13] = new ModelRendererTurbo(this, 601, 113, textureX, textureY); // Box 34
		rightWingModel[14] = new ModelRendererTurbo(this, 129, 153, textureX, textureY); // Box 35
		rightWingModel[15] = new ModelRendererTurbo(this, 465, 153, textureX, textureY); // Box 36
		rightWingModel[16] = new ModelRendererTurbo(this, 521, 161, textureX, textureY); // Box 37
		rightWingModel[17] = new ModelRendererTurbo(this, 569, 153, textureX, textureY); // Box 38
		rightWingModel[18] = new ModelRendererTurbo(this, 600, 500, textureX, textureY); // Box 39
		rightWingModel[19] = new ModelRendererTurbo(this, 600, 500, textureX, textureY); // Box 40
		rightWingModel[20] = new ModelRendererTurbo(this, 600, 500, textureX, textureY); // Box 41
		rightWingModel[21] = new ModelRendererTurbo(this, 600, 500, textureX, textureY); // Box 42
		rightWingModel[22] = new ModelRendererTurbo(this, 600, 500, textureX, textureY); // Box 43
		rightWingModel[23] = new ModelRendererTurbo(this, 529, 169, textureX, textureY); // Box 44
		rightWingModel[24] = new ModelRendererTurbo(this, 801, 209, textureX, textureY); // Box 45
		rightWingModel[25] = new ModelRendererTurbo(this, 600, 500, textureX, textureY); // Box 46
		rightWingModel[26] = new ModelRendererTurbo(this, 600, 500, textureX, textureY); // Box 47
		rightWingModel[27] = new ModelRendererTurbo(this, 600, 500, textureX, textureY); // Box 48
		rightWingModel[28] = new ModelRendererTurbo(this, 600, 500, textureX, textureY); // Box 49
		rightWingModel[29] = new ModelRendererTurbo(this, 600, 500, textureX, textureY); // Box 50
		rightWingModel[30] = new ModelRendererTurbo(this, 609, 225, textureX, textureY); // Box 52
		rightWingModel[31] = new ModelRendererTurbo(this, 801, 153, textureX, textureY); // Box 53
		rightWingModel[32] = new ModelRendererTurbo(this, 697, 177, textureX, textureY); // Box 77
		rightWingModel[33] = new ModelRendererTurbo(this, 801, 177, textureX, textureY); // Box 78
		rightWingModel[34] = new ModelRendererTurbo(this, 89, 241, textureX, textureY); // Box 89
		rightWingModel[35] = new ModelRendererTurbo(this, 729, 177, textureX, textureY); // Box 91
		rightWingModel[36] = new ModelRendererTurbo(this, 881, 177, textureX, textureY); // Box 92
		rightWingModel[37] = new ModelRendererTurbo(this, 897, 177, textureX, textureY); // Box 93
		rightWingModel[38] = new ModelRendererTurbo(this, 600, 230, textureX, textureY); // Box 1
		rightWingModel[39] = new ModelRendererTurbo(this, 600, 170, textureX, textureY); // Box 2
		rightWingModel[40] = new ModelRendererTurbo(this, 600, 180, textureX, textureY); // Box 3
		rightWingModel[41] = new ModelRendererTurbo(this, 600, 170, textureX, textureY); // Box 4
		rightWingModel[42] = new ModelRendererTurbo(this, 600, 140, textureX, textureY); // Box 5
		rightWingModel[43] = new ModelRendererTurbo(this, 600, 150, textureX, textureY); // Box 6
		rightWingModel[44] = new ModelRendererTurbo(this, 600, 160, textureX, textureY); // Box 7
		rightWingModel[45] = new ModelRendererTurbo(this, 600, 210, textureX, textureY); // Box 8
		rightWingModel[46] = new ModelRendererTurbo(this, 600, 210, textureX, textureY); // Box 9
		rightWingModel[47] = new ModelRendererTurbo(this, 600, 210, textureX, textureY); // Box 10
		rightWingModel[48] = new ModelRendererTurbo(this, 600, 200, textureX, textureY); // Box 11
		rightWingModel[49] = new ModelRendererTurbo(this, 600, 210, textureX, textureY); // Box 12
		rightWingModel[50] = new ModelRendererTurbo(this, 600, 190, textureX, textureY); // Box 13
		rightWingModel[51] = new ModelRendererTurbo(this, 600, 210, textureX, textureY); // Box 14
		rightWingModel[52] = new ModelRendererTurbo(this, 600, 200, textureX, textureY); // Box 15
		rightWingModel[53] = new ModelRendererTurbo(this, 600, 210, textureX, textureY); // Box 16
		rightWingModel[54] = new ModelRendererTurbo(this, 600, 200, textureX, textureY); // Box 17
		rightWingModel[55] = new ModelRendererTurbo(this, 600, 210, textureX, textureY); // Box 18
		rightWingModel[56] = new ModelRendererTurbo(this, 600, 210, textureX, textureY); // Box 19
		rightWingModel[57] = new ModelRendererTurbo(this, 600, 130, textureX, textureY); // Box 20
		rightWingModel[58] = new ModelRendererTurbo(this, 600, 120, textureX, textureY); // Box 21
		rightWingModel[59] = new ModelRendererTurbo(this, 600, 130, textureX, textureY); // Box 22
		rightWingModel[60] = new ModelRendererTurbo(this, 600, 140, textureX, textureY); // Box 23
		rightWingModel[61] = new ModelRendererTurbo(this, 600, 150, textureX, textureY); // Box 24
		rightWingModel[62] = new ModelRendererTurbo(this, 600, 160, textureX, textureY); // Box 25
		rightWingModel[63] = new ModelRendererTurbo(this, 600, 200, textureX, textureY); // Box 26
		rightWingModel[64] = new ModelRendererTurbo(this, 600, 210, textureX, textureY); // Box 27
		rightWingModel[65] = new ModelRendererTurbo(this, 600, 200, textureX, textureY); // Box 28
		rightWingModel[66] = new ModelRendererTurbo(this, 600, 170, textureX, textureY); // Box 29
		rightWingModel[67] = new ModelRendererTurbo(this, 600, 180, textureX, textureY); // Box 30
		rightWingModel[68] = new ModelRendererTurbo(this, 600, 230, textureX, textureY); // Box 31
		rightWingModel[69] = new ModelRendererTurbo(this, 600, 210, textureX, textureY); // Box 32
		rightWingModel[70] = new ModelRendererTurbo(this, 600, 210, textureX, textureY); // Box 33
		rightWingModel[71] = new ModelRendererTurbo(this, 600, 210, textureX, textureY); // Box 34
		rightWingModel[72] = new ModelRendererTurbo(this, 600, 210, textureX, textureY); // Box 35
		rightWingModel[73] = new ModelRendererTurbo(this, 600, 200, textureX, textureY); // Box 36
		rightWingModel[74] = new ModelRendererTurbo(this, 600, 210, textureX, textureY); // Box 37
		rightWingModel[75] = new ModelRendererTurbo(this, 600, 210, textureX, textureY); // Box 38
		rightWingModel[76] = new ModelRendererTurbo(this, 600, 190, textureX, textureY); // Box 39
		rightWingModel[77] = new ModelRendererTurbo(this, 600, 210, textureX, textureY); // Box 40
		rightWingModel[78] = new ModelRendererTurbo(this, 600, 260, textureX, textureY); // Box 41
		rightWingModel[79] = new ModelRendererTurbo(this, 600, 260, textureX, textureY); // Box 42
		rightWingModel[80] = new ModelRendererTurbo(this, 600, 260, textureX, textureY); // Box 43
		rightWingModel[81] = new ModelRendererTurbo(this, 600, 260, textureX, textureY); // Box 44
		rightWingModel[82] = new ModelRendererTurbo(this, 600, 260, textureX, textureY); // Box 45
		rightWingModel[83] = new ModelRendererTurbo(this, 600, 280, textureX, textureY); // Box 46
		rightWingModel[84] = new ModelRendererTurbo(this, 600, 250, textureX, textureY); // Box 47
		rightWingModel[85] = new ModelRendererTurbo(this, 600, 300, textureX, textureY); // Box 48
		rightWingModel[86] = new ModelRendererTurbo(this, 600, 310, textureX, textureY); // Box 49
		rightWingModel[87] = new ModelRendererTurbo(this, 600, 300, textureX, textureY); // Box 50
		rightWingModel[88] = new ModelRendererTurbo(this, 600, 300, textureX, textureY); // Box 51
		rightWingModel[89] = new ModelRendererTurbo(this, 600, 310, textureX, textureY); // Box 52
		rightWingModel[90] = new ModelRendererTurbo(this, 600, 260, textureX, textureY); // Box 53
		rightWingModel[91] = new ModelRendererTurbo(this, 600, 300, textureX, textureY); // Box 54
		rightWingModel[92] = new ModelRendererTurbo(this, 600, 290, textureX, textureY); // Box 55
		rightWingModel[93] = new ModelRendererTurbo(this, 600, 280, textureX, textureY); // Box 56
		rightWingModel[94] = new ModelRendererTurbo(this, 600, 260, textureX, textureY); // Box 57
		rightWingModel[95] = new ModelRendererTurbo(this, 600, 290, textureX, textureY); // Box 58
		rightWingModel[96] = new ModelRendererTurbo(this, 600, 290, textureX, textureY); // Box 59
		rightWingModel[97] = new ModelRendererTurbo(this, 600, 250, textureX, textureY); // Box 60
		rightWingModel[98] = new ModelRendererTurbo(this, 600, 280, textureX, textureY); // Box 61
		rightWingModel[99] = new ModelRendererTurbo(this, 600, 290, textureX, textureY); // Box 62
		rightWingModel[100] = new ModelRendererTurbo(this, 600, 250, textureX, textureY); // Box 63
		rightWingModel[101] = new ModelRendererTurbo(this, 600, 250, textureX, textureY); // Box 64
		rightWingModel[102] = new ModelRendererTurbo(this, 600, 250, textureX, textureY); // Box 65
		rightWingModel[103] = new ModelRendererTurbo(this, 600, 250, textureX, textureY); // Box 66
		rightWingModel[104] = new ModelRendererTurbo(this, 600, 250, textureX, textureY); // Box 67
		rightWingModel[105] = new ModelRendererTurbo(this, 600, 250, textureX, textureY); // Box 68
		rightWingModel[106] = new ModelRendererTurbo(this, 600, 250, textureX, textureY); // Box 69
		rightWingModel[107] = new ModelRendererTurbo(this, 600, 250, textureX, textureY); // Box 70
		rightWingModel[108] = new ModelRendererTurbo(this, 600, 250, textureX, textureY); // Box 71
		rightWingModel[109] = new ModelRendererTurbo(this, 600, 250, textureX, textureY); // Box 72
		rightWingModel[110] = new ModelRendererTurbo(this, 600, 250, textureX, textureY); // Box 73
		rightWingModel[111] = new ModelRendererTurbo(this, 600, 250, textureX, textureY); // Box 74
		rightWingModel[112] = new ModelRendererTurbo(this, 600, 250, textureX, textureY); // Box 75
		rightWingModel[113] = new ModelRendererTurbo(this, 600, 250, textureX, textureY); // Box 76
		rightWingModel[114] = new ModelRendererTurbo(this, 600, 270, textureX, textureY); // Box 77
		rightWingModel[115] = new ModelRendererTurbo(this, 600, 270, textureX, textureY); // Box 78
		rightWingModel[116] = new ModelRendererTurbo(this, 600, 270, textureX, textureY); // Box 79
		rightWingModel[117] = new ModelRendererTurbo(this, 600, 270, textureX, textureY); // Box 80
		rightWingModel[118] = new ModelRendererTurbo(this, 600, 270, textureX, textureY); // Box 81
		rightWingModel[119] = new ModelRendererTurbo(this, 600, 270, textureX, textureY); // Box 82
		rightWingModel[120] = new ModelRendererTurbo(this, 600, 270, textureX, textureY); // Box 83
		rightWingModel[121] = new ModelRendererTurbo(this, 600, 280, textureX, textureY); // Box 84
		rightWingModel[122] = new ModelRendererTurbo(this, 600, 510, textureX, textureY); // Box 0
		rightWingModel[123] = new ModelRendererTurbo(this, 600, 520, textureX, textureY); // Box 1
		rightWingModel[124] = new ModelRendererTurbo(this, 600, 580, textureX, textureY); // Box 2
		rightWingModel[125] = new ModelRendererTurbo(this, 600, 600, textureX, textureY); // Box 3
		rightWingModel[126] = new ModelRendererTurbo(this, 600, 590, textureX, textureY); // Box 4
		rightWingModel[127] = new ModelRendererTurbo(this, 600, 550, textureX, textureY); // Box 5
		rightWingModel[128] = new ModelRendererTurbo(this, 600, 540, textureX, textureY); // Box 6
		rightWingModel[129] = new ModelRendererTurbo(this, 600, 580, textureX, textureY); // Box 7
		rightWingModel[130] = new ModelRendererTurbo(this, 600, 520, textureX, textureY); // Box 8
		rightWingModel[131] = new ModelRendererTurbo(this, 600, 510, textureX, textureY); // Box 9
		rightWingModel[132] = new ModelRendererTurbo(this, 600, 580, textureX, textureY); // Box 10
		rightWingModel[133] = new ModelRendererTurbo(this, 600, 580, textureX, textureY); // Box 11
		rightWingModel[134] = new ModelRendererTurbo(this, 0, 580, textureX, textureY); // Box 12
		rightWingModel[135] = new ModelRendererTurbo(this, 600, 580, textureX, textureY); // Box 13
		rightWingModel[136] = new ModelRendererTurbo(this, 600, 510, textureX, textureY); // Box 14
		rightWingModel[137] = new ModelRendererTurbo(this, 600, 540, textureX, textureY); // Box 15
		rightWingModel[138] = new ModelRendererTurbo(this, 600, 590, textureX, textureY); // Box 16
		rightWingModel[139] = new ModelRendererTurbo(this, 600, 510, textureX, textureY); // Box 17
		rightWingModel[140] = new ModelRendererTurbo(this, 600, 590, textureX, textureY); // Box 18
		rightWingModel[141] = new ModelRendererTurbo(this, 600, 70, textureX, textureY); // Box 19
		rightWingModel[142] = new ModelRendererTurbo(this, 600, 80, textureX, textureY); // Box 20
		rightWingModel[143] = new ModelRendererTurbo(this, 600, 60, textureX, textureY); // Box 21
		rightWingModel[144] = new ModelRendererTurbo(this, 600, 30, textureX, textureY); // Box 22
		rightWingModel[145] = new ModelRendererTurbo(this, 600, 40, textureX, textureY); // Box 23
		rightWingModel[146] = new ModelRendererTurbo(this, 600, 50, textureX, textureY); // Box 24
		rightWingModel[147] = new ModelRendererTurbo(this, 600, 20, textureX, textureY); // Box 25
		rightWingModel[148] = new ModelRendererTurbo(this, 600, 10, textureX, textureY); // Box 26
		rightWingModel[149] = new ModelRendererTurbo(this, 600, 0, textureX, textureY); // Box 27
		rightWingModel[150] = new ModelRendererTurbo(this, 600, 100, textureX, textureY); // Box 28
		rightWingModel[151] = new ModelRendererTurbo(this, 600, 100, textureX, textureY); // Box 29
		rightWingModel[152] = new ModelRendererTurbo(this, 600, 90, textureX, textureY); // Box 30
		rightWingModel[153] = new ModelRendererTurbo(this, 600, 90, textureX, textureY); // Box 31
		rightWingModel[154] = new ModelRendererTurbo(this, 600, 100, textureX, textureY); // Box 32
		rightWingModel[155] = new ModelRendererTurbo(this, 600, 90, textureX, textureY); // Box 33
		rightWingModel[156] = new ModelRendererTurbo(this, 600, 100, textureX, textureY); // Box 34
		rightWingModel[157] = new ModelRendererTurbo(this, 600, 90, textureX, textureY); // Box 35
		rightWingModel[158] = new ModelRendererTurbo(this, 600, 90, textureX, textureY); // Box 36
		rightWingModel[159] = new ModelRendererTurbo(this, 600, 100, textureX, textureY); // Box 37
		rightWingModel[160] = new ModelRendererTurbo(this, 600, 20, textureX, textureY); // Box 38
		rightWingModel[161] = new ModelRendererTurbo(this, 600, 10, textureX, textureY); // Box 39
		rightWingModel[162] = new ModelRendererTurbo(this, 600, 90, textureX, textureY); // Box 40
		rightWingModel[163] = new ModelRendererTurbo(this, 600, 100, textureX, textureY); // Box 41
		rightWingModel[164] = new ModelRendererTurbo(this, 600, 0, textureX, textureY); // Box 42
		rightWingModel[165] = new ModelRendererTurbo(this, 600, 30, textureX, textureY); // Box 43
		rightWingModel[166] = new ModelRendererTurbo(this, 600, 40, textureX, textureY); // Box 44
		rightWingModel[167] = new ModelRendererTurbo(this, 600, 50, textureX, textureY); // Box 45
		rightWingModel[168] = new ModelRendererTurbo(this, 600, 60, textureX, textureY); // Box 46
		rightWingModel[169] = new ModelRendererTurbo(this, 600, 70, textureX, textureY); // Box 47
		rightWingModel[170] = new ModelRendererTurbo(this, 600, 80, textureX, textureY); // Box 48
		rightWingModel[171] = new ModelRendererTurbo(this, 600, 90, textureX, textureY); // Box 49
		rightWingModel[172] = new ModelRendererTurbo(this, 600, 100, textureX, textureY); // Box 50
		rightWingModel[173] = new ModelRendererTurbo(this, 600, 90, textureX, textureY); // Box 51
		rightWingModel[174] = new ModelRendererTurbo(this, 600, 100, textureX, textureY); // Box 52
		rightWingModel[175] = new ModelRendererTurbo(this, 600, 90, textureX, textureY); // Box 53
		rightWingModel[176] = new ModelRendererTurbo(this, 600, 100, textureX, textureY); // Box 54
		rightWingModel[177] = new ModelRendererTurbo(this, 600, 20, textureX, textureY); // Box 55
		rightWingModel[178] = new ModelRendererTurbo(this, 600, 10, textureX, textureY); // Box 56
		rightWingModel[179] = new ModelRendererTurbo(this, 600, 90, textureX, textureY); // Box 57
		rightWingModel[180] = new ModelRendererTurbo(this, 600, 100, textureX, textureY); // Box 58
		rightWingModel[181] = new ModelRendererTurbo(this, 600, 0, textureX, textureY); // Box 59
		rightWingModel[182] = new ModelRendererTurbo(this, 600, 30, textureX, textureY); // Box 60
		rightWingModel[183] = new ModelRendererTurbo(this, 600, 40, textureX, textureY); // Box 61
		rightWingModel[184] = new ModelRendererTurbo(this, 600, 50, textureX, textureY); // Box 62
		rightWingModel[185] = new ModelRendererTurbo(this, 600, 60, textureX, textureY); // Box 63
		rightWingModel[186] = new ModelRendererTurbo(this, 600, 70, textureX, textureY); // Box 64
		rightWingModel[187] = new ModelRendererTurbo(this, 600, 80, textureX, textureY); // Box 65
		rightWingModel[188] = new ModelRendererTurbo(this, 600, 90, textureX, textureY); // Box 66
		rightWingModel[189] = new ModelRendererTurbo(this, 600, 100, textureX, textureY); // Box 67
		rightWingModel[190] = new ModelRendererTurbo(this, 600, 90, textureX, textureY); // Box 68
		rightWingModel[191] = new ModelRendererTurbo(this, 600, 100, textureX, textureY); // Box 69
		rightWingModel[192] = new ModelRendererTurbo(this, 600, 410, textureX, textureY); // Box 70
		rightWingModel[193] = new ModelRendererTurbo(this, 600, 380, textureX, textureY); // Box 71
		rightWingModel[194] = new ModelRendererTurbo(this, 600, 390, textureX, textureY); // Box 72
		rightWingModel[195] = new ModelRendererTurbo(this, 600, 400, textureX, textureY); // Box 73
		rightWingModel[196] = new ModelRendererTurbo(this, 600, 350, textureX, textureY); // Box 74
		rightWingModel[197] = new ModelRendererTurbo(this, 600, 360, textureX, textureY); // Box 75
		rightWingModel[198] = new ModelRendererTurbo(this, 600, 370, textureX, textureY); // Box 76
		rightWingModel[199] = new ModelRendererTurbo(this, 600, 450, textureX, textureY); // Box 77
		rightWingModel[200] = new ModelRendererTurbo(this, 600, 450, textureX, textureY); // Box 78
		rightWingModel[201] = new ModelRendererTurbo(this, 600, 460, textureX, textureY); // Box 79
		rightWingModel[202] = new ModelRendererTurbo(this, 600, 460, textureX, textureY); // Box 80
		rightWingModel[203] = new ModelRendererTurbo(this, 600, 430, textureX, textureY); // Box 81
		rightWingModel[204] = new ModelRendererTurbo(this, 600, 420, textureX, textureY); // Box 82
		rightWingModel[205] = new ModelRendererTurbo(this, 600, 440, textureX, textureY); // Box 83
		rightWingModel[206] = new ModelRendererTurbo(this, 600, 410, textureX, textureY); // Box 84
		rightWingModel[207] = new ModelRendererTurbo(this, 600, 380, textureX, textureY); // Box 85
		rightWingModel[208] = new ModelRendererTurbo(this, 600, 390, textureX, textureY); // Box 86
		rightWingModel[209] = new ModelRendererTurbo(this, 600, 400, textureX, textureY); // Box 87
		rightWingModel[210] = new ModelRendererTurbo(this, 600, 350, textureX, textureY); // Box 88
		rightWingModel[211] = new ModelRendererTurbo(this, 600, 360, textureX, textureY); // Box 89
		rightWingModel[212] = new ModelRendererTurbo(this, 600, 370, textureX, textureY); // Box 90
		rightWingModel[213] = new ModelRendererTurbo(this, 600, 440, textureX, textureY); // Box 91
		rightWingModel[214] = new ModelRendererTurbo(this, 600, 430, textureX, textureY); // Box 92
		rightWingModel[215] = new ModelRendererTurbo(this, 600, 450, textureX, textureY); // Box 93
		rightWingModel[216] = new ModelRendererTurbo(this, 600, 460, textureX, textureY); // Box 94
		rightWingModel[217] = new ModelRendererTurbo(this, 600, 460, textureX, textureY); // Box 95
		rightWingModel[218] = new ModelRendererTurbo(this, 600, 450, textureX, textureY); // Box 96
		rightWingModel[219] = new ModelRendererTurbo(this, 600, 420, textureX, textureY); // Box 97

		rightWingModel[0].addShapeBox(2F, 0F, 0F, 15, 2, 43, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // wingback
		rightWingModel[0].setRotationPoint(102F, -28F, 4F);
		rightWingModel[0].rotateAngleZ = -0.06981317F;

		rightWingModel[1].addShapeBox(-2F, 0F, 0F, 4, 2, 43, 0F,0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F); // wing back
		rightWingModel[1].setRotationPoint(102F, -28F, 4F);
		rightWingModel[1].rotateAngleZ = -0.06981317F;

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 20, 8, 39, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		rightWingModel[2].setRotationPoint(-10F, -26F, -47F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 8, 8, 39, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 22
		rightWingModel[3].setRotationPoint(-18F, -26F, 8F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 20, 8, 39, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		rightWingModel[4].setRotationPoint(-10F, -26F, 8F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 23, 8, 39, 0F,0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F); // Box 24
		rightWingModel[5].setRotationPoint(10F, -26F, 8F);

		rightWingModel[6].addShapeBox(0F, -4.3F, 35F, 21, 8, 35, 0F,0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, -0.8F, 0F); // Box 25
		rightWingModel[6].setRotationPoint(10F, -18F, 12F);
		rightWingModel[6].rotateAngleX = 0.10471976F;

		rightWingModel[7].addShapeBox(0F, 1.5F, 90F, 20, 8, 90, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 26
		rightWingModel[7].setRotationPoint(-10F, -18F, -43F);
		rightWingModel[7].rotateAngleX = 0.10471976F;

		rightWingModel[8].addShapeBox(0F, 1.5F, 90F, 8, 8, 90, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -3F, 0F); // Box 27
		rightWingModel[8].setRotationPoint(-18F, -18F, -43F);
		rightWingModel[8].rotateAngleX = 0.10471976F;

		rightWingModel[9].addShapeBox(20F, -15.4F, 91.1F, 15, 4, 2, 0F,0F, 0F, 0F, -2F, -1F, 0F, -2.1F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.95F, 0F, -2.1F, -1.2F, 0F, 0F, 0F, 0F); // Box 30
		rightWingModel[9].setRotationPoint(-10F, -18F, 45F);

		rightWingModel[10].addShapeBox(0F, 1F, 5F, 15, 4, 4, 0F,0F, 0F, 0F, -2.1F, -1.1F, -0.4F, -2.7F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2.1F, -1.4F, -1F, -2.7F, -1.5F, 0F, 0F, 0F, 0F); // Box 31
		rightWingModel[10].setRotationPoint(10F, -36.3F, 134F);
		rightWingModel[10].rotateAngleX = -0.40142573F;

		rightWingModel[11].addShapeBox(0F, -15.4F, 91.1F, 20, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		rightWingModel[11].setRotationPoint(-10F, -18F, 45F);

		rightWingModel[12].addShapeBox(0F, 1F, 5F, 20, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		rightWingModel[12].setRotationPoint(-10F, -36.3F, 134F);
		rightWingModel[12].rotateAngleX = -0.40142573F;

		rightWingModel[13].addShapeBox(0F, -15.4F, 91.1F, 8, 4, 2, 0F,-2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.1F, -1.2F, 0F, -2F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.1F, -1.2F, 0F); // Box 34
		rightWingModel[13].setRotationPoint(-18F, -18F, 45F);

		rightWingModel[14].addShapeBox(0F, 1F, 5F, 8, 4, 4, 0F,-2.1F, -1.1F, -0.4F, 0F, 0F, 0F, 0F, -1F, 0F, -2.7F, -1.5F, 0F, -2.1F, -1.4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2.7F, -1.5F, 0F); // Box 35
		rightWingModel[14].setRotationPoint(-18F, -36.3F, 134F);
		rightWingModel[14].rotateAngleX = -0.40142573F;

		rightWingModel[15].addShapeBox(0F, 2.45F, -8.1F, 5, 3, 4, 0F,0.3F, -0.4F, -0.2F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, -1.5F, -1.5F, 0.3F, -1.65F, -0.6F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -1F, -1.5F); // Box 36
		rightWingModel[15].setRotationPoint(-15F, -26.9F, 149F);
		rightWingModel[15].rotateAngleX = -0.78539816F;

		rightWingModel[16].addShapeBox(0F, 2.45F, -8.1F, 20, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1.5F, 0F, -1F, 0F); // Box 37
		rightWingModel[16].setRotationPoint(-10F, -26.9F, 149F);
		rightWingModel[16].rotateAngleX = -0.78539816F;

		rightWingModel[17].addShapeBox(0F, 2.45F, -8.1F, 12, 3, 4, 0F,0F, 0F, 0F, 0.3F, -0.4F, -0.2F, -1.5F, -1.5F, -1.5F, 0F, -1.5F, 1.5F, 0F, 0F, 0F, 0.3F, -1.65F, -0.6F, -1.5F, -1F, -1.5F, 0F, -1F, 1.5F); // Box 38
		rightWingModel[17].setRotationPoint(10F, -26.9F, 149F);
		rightWingModel[17].rotateAngleX = -0.78539816F;

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 26, 6, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 39
		rightWingModel[18].setRotationPoint(-19F, -26F, 96F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 40
		rightWingModel[19].setRotationPoint(-19F, -24F, 78F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 41
		rightWingModel[20].setRotationPoint(-19F, -22F, 60F);

		rightWingModel[21].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 42
		rightWingModel[21].setRotationPoint(-19F, -20F, 10.5F);

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 43
		rightWingModel[22].setRotationPoint(-19F, -20F, 28.5F);

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 13, 14, 7, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 44
		rightWingModel[23].setRotationPoint(-30F, -24F, 38F);

		rightWingModel[24].addShapeBox(0F, 0F, 0F, 38, 14, 2, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, -1.5F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -9F, -1.5F, 0F, -1F, 0F); // Box 45
		rightWingModel[24].setRotationPoint(-12F, -24F, 45F);

		rightWingModel[25].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		rightWingModel[25].setRotationPoint(-19F, -24F, 77F);

		rightWingModel[26].addShapeBox(0F, 0F, 0F, 26, 6, 1, 0F,-5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		rightWingModel[26].setRotationPoint(-19F, -26F, 95F);

		rightWingModel[27].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		rightWingModel[27].setRotationPoint(-19F, -22F, 59F);

		rightWingModel[28].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		rightWingModel[28].setRotationPoint(-19F, -20F, 27.5F);

		rightWingModel[29].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F,-5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		rightWingModel[29].setRotationPoint(-19F, -20F, 9.5F);

		rightWingModel[30].addShapeBox(0F, 0F, 0F, 38, 14, 2, 0F,0F, -5F, 0F, 0F, -4F, -1.5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -9F, -1.5F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 52
		rightWingModel[30].setRotationPoint(-12F, -24F, 36F);

		rightWingModel[31].addShapeBox(0F, 0F, 0F, 13, 14, 2, 0F,0F, -5F, -2F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 53
		rightWingModel[31].setRotationPoint(-30F, -24F, 36F);

		rightWingModel[32].addShapeBox(0F, 0F, 0F, 6, 14, 7, 0F,0F, -8F, -2F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -8F, -2F, 0F, -4F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, -2F); // Box 77
		rightWingModel[32].setRotationPoint(-36F, -24F, 38F);

		rightWingModel[33].addShapeBox(0F, 0F, 0F, 13, 14, 2, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F); // Box 78
		rightWingModel[33].setRotationPoint(-30F, -24F, 45F);

		rightWingModel[34].addShapeBox(0F, -7.1F, 90F, 21, 8, 8, 0F,0F, -1.8F, 0F, -7F, -3F, 0F, -8F, -3F, 0F, 0F, -2F, 0F, 0F, -1.8F, 0F, -7F, -3F, 0F, -8F, -3F, 0F, 0F, -2F, 0F); // Box 89
		rightWingModel[34].setRotationPoint(10F, -18F, 39F);
		rightWingModel[34].rotateAngleX = 0.10471976F;

		rightWingModel[35].addShapeBox(0F, 0F, 0F, 5, 14, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		rightWingModel[35].setRotationPoint(-17F, -24F, 38F);

		rightWingModel[36].addShapeBox(0F, 0F, 0F, 5, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 92
		rightWingModel[36].setRotationPoint(-17F, -24F, 45F);

		rightWingModel[37].addShapeBox(0F, 0F, 0F, 5, 14, 2, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		rightWingModel[37].setRotationPoint(-17F, -24F, 36F);

		rightWingModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 1
		rightWingModel[38].setRotationPoint(-38F, -20F, 100.5F);

		rightWingModel[39].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 2
		rightWingModel[39].setRotationPoint(-37F, -21F, 99.5F);

		rightWingModel[40].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 3
		rightWingModel[40].setRotationPoint(-37F, -20F, 99.5F);

		rightWingModel[41].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Box 4
		rightWingModel[41].setRotationPoint(-37F, -19F, 99.5F);

		rightWingModel[42].addShapeBox(0F, 0F, 0F, 43, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		rightWingModel[42].setRotationPoint(-33F, -21F, 99.5F);

		rightWingModel[43].addShapeBox(0F, 0F, 0F, 43, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightWingModel[43].setRotationPoint(-33F, -20F, 99.5F);

		rightWingModel[44].addShapeBox(0F, 0F, 0F, 43, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 7
		rightWingModel[44].setRotationPoint(-33F, -19F, 99.5F);

		rightWingModel[45].addShapeBox(5F, -5F, 0F, 4, 4, 0, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		rightWingModel[45].setRotationPoint(-38F, -19.5F, 101F);
		rightWingModel[45].rotateAngleX = 2.35619449F;

		rightWingModel[46].addShapeBox(5F, -5F, 0F, 4, 4, 0, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		rightWingModel[46].setRotationPoint(-38F, -19.5F, 101F);
		rightWingModel[46].rotateAngleX = 0.78539816F;

		rightWingModel[47].addShapeBox(5F, -5F, 0F, 4, 4, 0, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		rightWingModel[47].setRotationPoint(-38F, -19.5F, 101F);
		rightWingModel[47].rotateAngleX = -0.78539816F;

		rightWingModel[48].addShapeBox(40F, -5F, 0F, 7, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		rightWingModel[48].setRotationPoint(-38F, -19.5F, 101F);
		rightWingModel[48].rotateAngleX = -0.78539816F;

		rightWingModel[49].addShapeBox(36F, -5F, 0F, 4, 4, 0, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		rightWingModel[49].setRotationPoint(-38F, -19.5F, 101F);
		rightWingModel[49].rotateAngleX = -0.78539816F;

		rightWingModel[50].addShapeBox(40F, -5F, 0F, 7, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightWingModel[50].setRotationPoint(-38F, -19.5F, 101F);
		rightWingModel[50].rotateAngleX = 0.78539816F;

		rightWingModel[51].addShapeBox(36F, -5F, 0F, 4, 4, 0, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightWingModel[51].setRotationPoint(-38F, -19.5F, 101F);
		rightWingModel[51].rotateAngleX = 0.78539816F;

		rightWingModel[52].addShapeBox(40F, -5F, 0F, 7, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		rightWingModel[52].setRotationPoint(-38F, -19.5F, 101F);
		rightWingModel[52].rotateAngleX = 2.35619449F;

		rightWingModel[53].addShapeBox(36F, -5F, 0F, 4, 4, 0, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		rightWingModel[53].setRotationPoint(-38F, -19.5F, 101F);
		rightWingModel[53].rotateAngleX = 2.35619449F;

		rightWingModel[54].addShapeBox(40F, -5F, 0F, 7, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		rightWingModel[54].setRotationPoint(-38F, -19.5F, 101F);
		rightWingModel[54].rotateAngleX = -2.35619449F;

		rightWingModel[55].addShapeBox(36F, -5F, 0F, 4, 4, 0, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		rightWingModel[55].setRotationPoint(-38F, -19.5F, 101F);
		rightWingModel[55].rotateAngleX = -2.35619449F;

		rightWingModel[56].addShapeBox(22F, -5F, 0F, 4, 4, 0, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		rightWingModel[56].setRotationPoint(-55F, -19.5F, 101F);
		rightWingModel[56].rotateAngleX = -2.35619449F;

		rightWingModel[57].addShapeBox(0F, 0F, 0F, 33, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		rightWingModel[57].setRotationPoint(-24F, -20F, 98.5F);

		rightWingModel[58].addShapeBox(0F, 0F, 0F, 25, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		rightWingModel[58].setRotationPoint(-19F, -20F, 93.5F);

		rightWingModel[59].addShapeBox(0F, 0F, 0F, 33, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		rightWingModel[59].setRotationPoint(-24F, -20F, 92.5F);

		rightWingModel[60].addShapeBox(0F, 0F, 0F, 43, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		rightWingModel[60].setRotationPoint(-33F, -21F, 89.5F);

		rightWingModel[61].addShapeBox(0F, 0F, 0F, 43, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		rightWingModel[61].setRotationPoint(-33F, -20F, 89.5F);

		rightWingModel[62].addShapeBox(0F, 0F, 0F, 43, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 25
		rightWingModel[62].setRotationPoint(-33F, -19F, 89.5F);

		rightWingModel[63].addShapeBox(40F, -5F, 0F, 7, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		rightWingModel[63].setRotationPoint(-38F, -19.5F, 91F);
		rightWingModel[63].rotateAngleX = -0.78539816F;

		rightWingModel[64].addShapeBox(36F, -5F, 0F, 4, 4, 0, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		rightWingModel[64].setRotationPoint(-38F, -19.5F, 91F);
		rightWingModel[64].rotateAngleX = -0.78539816F;

		rightWingModel[65].addShapeBox(40F, -5F, 0F, 7, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		rightWingModel[65].setRotationPoint(-38F, -19.5F, 91F);
		rightWingModel[65].rotateAngleX = 2.35619449F;

		rightWingModel[66].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 29
		rightWingModel[66].setRotationPoint(-37F, -21F, 89.5F);

		rightWingModel[67].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 30
		rightWingModel[67].setRotationPoint(-37F, -20F, 89.5F);

		rightWingModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 31
		rightWingModel[68].setRotationPoint(-38F, -20F, 90.5F);

		rightWingModel[69].addShapeBox(5F, -5F, 0F, 4, 4, 0, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		rightWingModel[69].setRotationPoint(-38F, -19.5F, 91F);
		rightWingModel[69].rotateAngleX = -0.78539816F;

		rightWingModel[70].addShapeBox(5F, -5F, 0F, 4, 4, 0, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		rightWingModel[70].setRotationPoint(-38F, -19.5F, 91F);
		rightWingModel[70].rotateAngleX = 2.35619449F;

		rightWingModel[71].addShapeBox(22F, -5F, 0F, 4, 4, 0, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightWingModel[71].setRotationPoint(-55F, -19.5F, 91F);
		rightWingModel[71].rotateAngleX = -2.35619449F;

		rightWingModel[72].addShapeBox(5F, -5F, 0F, 4, 4, 0, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		rightWingModel[72].setRotationPoint(-38F, -19.5F, 91F);
		rightWingModel[72].rotateAngleX = 0.78539816F;

		rightWingModel[73].addShapeBox(40F, -5F, 0F, 7, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		rightWingModel[73].setRotationPoint(-38F, -19.5F, 91F);
		rightWingModel[73].rotateAngleX = -2.35619449F;

		rightWingModel[74].addShapeBox(36F, -5F, 0F, 4, 4, 0, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		rightWingModel[74].setRotationPoint(-38F, -19.5F, 91F);
		rightWingModel[74].rotateAngleX = -2.35619449F;

		rightWingModel[75].addShapeBox(36F, -5F, 0F, 4, 4, 0, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		rightWingModel[75].setRotationPoint(-38F, -19.5F, 91F);
		rightWingModel[75].rotateAngleX = 0.78539816F;

		rightWingModel[76].addShapeBox(40F, -5F, 0F, 7, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		rightWingModel[76].setRotationPoint(-38F, -19.5F, 91F);
		rightWingModel[76].rotateAngleX = 0.78539816F;

		rightWingModel[77].addShapeBox(36F, -5F, 0F, 4, 4, 0, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		rightWingModel[77].setRotationPoint(-38F, -19.5F, 91F);
		rightWingModel[77].rotateAngleX = 2.35619449F;

		rightWingModel[78].addShapeBox(0F, -1.75F, 0.1F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 41
		rightWingModel[78].setRotationPoint(-23F, -14F, 78F);

		rightWingModel[79].addShapeBox(0F, -1.75F, -1.1F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 42
		rightWingModel[79].setRotationPoint(-23F, -14F, 78F);

		rightWingModel[80].addShapeBox(0F, -0.5F, -1.75F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 43
		rightWingModel[80].setRotationPoint(-23F, -14F, 78F);

		rightWingModel[81].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 44
		rightWingModel[81].setRotationPoint(-23F, -14F, 78F);

		rightWingModel[82].addShapeBox(0F, -0.5F, 0.75F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 45
		rightWingModel[82].setRotationPoint(-23F, -14F, 78F);

		rightWingModel[83].addShapeBox(0.5F, -1.5F, 1.75F, 29, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 46
		rightWingModel[83].setRotationPoint(-23F, -14F, 78F);

		rightWingModel[84].addShapeBox(-5F, -3F, -0.5F, 30, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		rightWingModel[84].setRotationPoint(-18F, -14F, 78F);

		rightWingModel[85].addShapeBox(0.5F, -1.75F, -0.5F, 29, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 48
		rightWingModel[85].setRotationPoint(-23F, -14F, 78F);

		rightWingModel[86].addShapeBox(0.5F, -1.15F, 1F, 29, 1, 4, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 49
		rightWingModel[86].setRotationPoint(-23F, -14F, 75F);

		rightWingModel[87].addShapeBox(0.5F, -0.5F, -1.05F, 29, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.45F, 0F, 0F, -0.45F); // Box 50
		rightWingModel[87].setRotationPoint(-23F, -14F, 78F);

		rightWingModel[88].addShapeBox(0.5F, -0.5F, 0.05F, 29, 1, 1, 0F,0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 51
		rightWingModel[88].setRotationPoint(-23F, -14F, 78F);

		rightWingModel[89].addShapeBox(0.5F, 0.15F, 1F, 29, 1, 4, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 52
		rightWingModel[89].setRotationPoint(-23F, -14F, 75F);

		rightWingModel[90].addShapeBox(0F, 0.75F, -1.1F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 53
		rightWingModel[90].setRotationPoint(-23F, -14F, 78F);

		rightWingModel[91].addShapeBox(0.5F, 0.75F, -0.5F, 29, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 54
		rightWingModel[91].setRotationPoint(-23F, -14F, 78F);

		rightWingModel[92].addShapeBox(0.5F, 0.75F, 1.1F, 29, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		rightWingModel[92].setRotationPoint(-23F, -14F, 78F);

		rightWingModel[93].addShapeBox(0.5F, -1.5F, 1.75F, 29, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 56
		rightWingModel[93].setRotationPoint(-23F, -14F, 78F);
		rightWingModel[93].rotateAngleX = -1.57079633F;

		rightWingModel[94].addShapeBox(0F, 0.75F, 0.1F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 57
		rightWingModel[94].setRotationPoint(-23F, -14F, 78F);

		rightWingModel[95].addShapeBox(0.5F, 0.75F, -2.1F, 29, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		rightWingModel[95].setRotationPoint(-23F, -14F, 78F);

		rightWingModel[96].addShapeBox(0.5F, -1.75F, -2.1F, 29, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		rightWingModel[96].setRotationPoint(-23F, -14F, 78F);

		rightWingModel[97].addShapeBox(-5F, -3F, -0.5F, 30, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		rightWingModel[97].setRotationPoint(-18F, -14F, 78F);
		rightWingModel[97].rotateAngleX = 0.39269908F;

		rightWingModel[98].addShapeBox(0.5F, -1.5F, 1.75F, 29, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 61
		rightWingModel[98].setRotationPoint(-23F, -14F, 78F);
		rightWingModel[98].rotateAngleX = 1.57079633F;

		rightWingModel[99].addShapeBox(0.5F, -1.75F, 1.1F, 29, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		rightWingModel[99].setRotationPoint(-23F, -14F, 78F);

		rightWingModel[100].addShapeBox(-5F, -3F, -0.5F, 30, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		rightWingModel[100].setRotationPoint(-18F, -14F, 78F);
		rightWingModel[100].rotateAngleX = -0.39269908F;

		rightWingModel[101].addShapeBox(-5F, -3F, -0.5F, 30, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		rightWingModel[101].setRotationPoint(-18F, -14F, 78F);
		rightWingModel[101].rotateAngleX = -1.17809725F;

		rightWingModel[102].addShapeBox(-5F, -3F, -0.5F, 30, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		rightWingModel[102].setRotationPoint(-18F, -14F, 78F);
		rightWingModel[102].rotateAngleX = -0.78539816F;

		rightWingModel[103].addShapeBox(-5F, -3F, -0.5F, 30, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		rightWingModel[103].setRotationPoint(-18F, -14F, 78F);
		rightWingModel[103].rotateAngleX = -1.57079633F;

		rightWingModel[104].addShapeBox(-5F, -3F, -0.5F, 30, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		rightWingModel[104].setRotationPoint(-18F, -14F, 78F);
		rightWingModel[104].rotateAngleX = -1.96349541F;

		rightWingModel[105].addShapeBox(-5F, -3F, -0.5F, 30, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		rightWingModel[105].setRotationPoint(-18F, -14F, 78F);
		rightWingModel[105].rotateAngleX = -2.35619449F;

		rightWingModel[106].addShapeBox(-5F, -3F, -0.5F, 30, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		rightWingModel[106].setRotationPoint(-18F, -14F, 78F);
		rightWingModel[106].rotateAngleX = -2.74889357F;

		rightWingModel[107].addShapeBox(-5F, -3F, -0.5F, 30, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		rightWingModel[107].setRotationPoint(-18F, -14F, 78F);
		rightWingModel[107].rotateAngleX = 3.14159265F;

		rightWingModel[108].addShapeBox(-5F, -3F, -0.5F, 30, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		rightWingModel[108].setRotationPoint(-18F, -14F, 78F);
		rightWingModel[108].rotateAngleX = 2.74889357F;

		rightWingModel[109].addShapeBox(-5F, -3F, -0.5F, 30, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		rightWingModel[109].setRotationPoint(-18F, -14F, 78F);
		rightWingModel[109].rotateAngleX = 2.35619449F;

		rightWingModel[110].addShapeBox(-5F, -3F, -0.5F, 30, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		rightWingModel[110].setRotationPoint(-18F, -14F, 78F);
		rightWingModel[110].rotateAngleX = 1.96349541F;

		rightWingModel[111].addShapeBox(-5F, -3F, -0.5F, 30, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		rightWingModel[111].setRotationPoint(-18F, -14F, 78F);
		rightWingModel[111].rotateAngleX = 1.57079633F;

		rightWingModel[112].addShapeBox(-5F, -3F, -0.5F, 30, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		rightWingModel[112].setRotationPoint(-18F, -14F, 78F);
		rightWingModel[112].rotateAngleX = 1.17809725F;

		rightWingModel[113].addShapeBox(-5F, -3F, -0.5F, 30, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		rightWingModel[113].setRotationPoint(-18F, -14F, 78F);
		rightWingModel[113].rotateAngleX = 0.78539816F;

		rightWingModel[114].addShapeBox(0F, -1.75F, -1.1F, 28, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		rightWingModel[114].setRotationPoint(-22F, -14F, 78F);

		rightWingModel[115].addShapeBox(0F, -1.75F, 0.1F, 28, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		rightWingModel[115].setRotationPoint(-22F, -14F, 78F);

		rightWingModel[116].addShapeBox(0F, -0.5F, 0.75F, 28, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		rightWingModel[116].setRotationPoint(-22F, -14F, 78F);

		rightWingModel[117].addShapeBox(0F, -0.5F, -0.5F, 28, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		rightWingModel[117].setRotationPoint(-22F, -14F, 78F);

		rightWingModel[118].addShapeBox(0F, -0.5F, -1.75F, 28, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		rightWingModel[118].setRotationPoint(-22F, -14F, 78F);

		rightWingModel[119].addShapeBox(0F, 0.75F, -1.1F, 28, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		rightWingModel[119].setRotationPoint(-22F, -14F, 78F);

		rightWingModel[120].addShapeBox(0F, 0.75F, 0.1F, 28, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		rightWingModel[120].setRotationPoint(-22F, -14F, 78F);

		rightWingModel[121].addShapeBox(0.5F, -1.5F, -2.75F, 29, 3, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		rightWingModel[121].setRotationPoint(-23F, -14F, 78F);

		rightWingModel[122].addShapeBox(-7F, 0F, -0.5F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 0
		rightWingModel[122].setRotationPoint(-15F, -15F, 57.5F);

		rightWingModel[123].addShapeBox(-4F, 0F, -0.5F, 24, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 1
		rightWingModel[123].setRotationPoint(-15F, -15F, 57.5F);

		rightWingModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		rightWingModel[124].setRotationPoint(-17F, -15F, 60.5F);
		rightWingModel[124].rotateAngleX = -0.20943951F;

		rightWingModel[125].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		rightWingModel[125].setRotationPoint(-17F, -15F, 59.5F);

		rightWingModel[126].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		rightWingModel[126].setRotationPoint(-17F, -14F, 59.5F);

		rightWingModel[127].addShapeBox(-3F, 0F, 0.5F, 24, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		rightWingModel[127].setRotationPoint(-15F, -11F, 58.5F);

		rightWingModel[128].addShapeBox(-3F, 0F, 0.5F, 3, 1, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightWingModel[128].setRotationPoint(-18F, -11F, 58.5F);

		rightWingModel[129].addShapeBox(0F, 0F, -2F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		rightWingModel[129].setRotationPoint(-17F, -15F, 59.5F);
		rightWingModel[129].rotateAngleX = 0.20943951F;

		rightWingModel[130].addShapeBox(-4F, 0F, 0.5F, 24, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		rightWingModel[130].setRotationPoint(-15F, -15F, 61.5F);

		rightWingModel[131].addShapeBox(-7F, 0F, 0.5F, 3, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		rightWingModel[131].setRotationPoint(-15F, -15F, 61.5F);

		rightWingModel[132].addShapeBox(10.5F, 0F, -2F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		rightWingModel[132].setRotationPoint(-17F, -15F, 59.5F);
		rightWingModel[132].rotateAngleX = 0.20943951F;

		rightWingModel[133].addShapeBox(21F, 0F, -2F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		rightWingModel[133].setRotationPoint(-17F, -15F, 59.5F);
		rightWingModel[133].rotateAngleX = 0.20943951F;

		rightWingModel[134].addShapeBox(10.5F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		rightWingModel[134].setRotationPoint(-17F, -15F, 60.5F);
		rightWingModel[134].rotateAngleX = -0.20943951F;

		rightWingModel[135].addShapeBox(21F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightWingModel[135].setRotationPoint(-17F, -15F, 60.5F);
		rightWingModel[135].rotateAngleX = -0.20943951F;

		rightWingModel[136].addShapeBox(20F, 0F, -0.5F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 14
		rightWingModel[136].setRotationPoint(-15F, -15F, 57.5F);

		rightWingModel[137].addShapeBox(-3F, 0F, 0.5F, 3, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		rightWingModel[137].setRotationPoint(9F, -11F, 58.5F);

		rightWingModel[138].addShapeBox(21F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		rightWingModel[138].setRotationPoint(-17F, -14F, 59.5F);

		rightWingModel[139].addShapeBox(20F, 0F, 0.5F, 3, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		rightWingModel[139].setRotationPoint(-15F, -15F, 61.5F);

		rightWingModel[140].addShapeBox(10.5F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		rightWingModel[140].setRotationPoint(-17F, -14F, 59.5F);

		rightWingModel[141].addShapeBox(-3F, -2F, -10.5F, 2, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F); // Box 19
		rightWingModel[141].setRotationPoint(-25F, -6F, 67.5F);

		rightWingModel[142].addShapeBox(-3F, -4F, -10.5F, 2, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -2F, -2F); // Box 20
		rightWingModel[142].setRotationPoint(-25F, -2F, 67.5F);

		rightWingModel[143].addShapeBox(-3F, -4F, -10.5F, 2, 2, 6, 0F,0F, -2F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F); // Box 21
		rightWingModel[143].setRotationPoint(-25F, -6F, 67.5F);

		rightWingModel[144].addShapeBox(-3F, 0F, -10.5F, 6, 2, 6, 0F,0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 22
		rightWingModel[144].setRotationPoint(-23F, -10F, 67.5F);

		rightWingModel[145].addShapeBox(-3F, -2F, -10.5F, 6, 2, 6, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 23
		rightWingModel[145].setRotationPoint(-23F, -6F, 67.5F);

		rightWingModel[146].addShapeBox(-3F, 0F, -10.5F, 6, 2, 6, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -2F); // Box 24
		rightWingModel[146].setRotationPoint(-23F, -6F, 67.5F);

		rightWingModel[147].addShapeBox(-3F, 0F, -10.5F, 30, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		rightWingModel[147].setRotationPoint(-17F, -10F, 67.5F);

		rightWingModel[148].addShapeBox(-3F, 0F, -10.5F, 30, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		rightWingModel[148].setRotationPoint(-17F, -8F, 67.5F);

		rightWingModel[149].addShapeBox(-3F, 0F, -10.5F, 30, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 27
		rightWingModel[149].setRotationPoint(-17F, -6F, 67.5F);

		rightWingModel[150].addShapeBox(12F, 0F, -6F, 21, 0, 3, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		rightWingModel[150].setRotationPoint(-28F, -7F, 60F);
		rightWingModel[150].rotateAngleX = -2.35619449F;

		rightWingModel[151].addShapeBox(12F, 0F, -6F, 21, 0, 3, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		rightWingModel[151].setRotationPoint(-28F, -7F, 60F);
		rightWingModel[151].rotateAngleX = 2.35619449F;

		rightWingModel[152].addShapeBox(35F, 0F, -6F, 2, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		rightWingModel[152].setRotationPoint(-28F, -7F, 60F);
		rightWingModel[152].rotateAngleX = 2.35619449F;

		rightWingModel[153].addShapeBox(35F, 0F, -6F, 2, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		rightWingModel[153].setRotationPoint(-28F, -7F, 60F);
		rightWingModel[153].rotateAngleX = -2.35619449F;

		rightWingModel[154].addShapeBox(12F, 0F, -6F, 21, 0, 3, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		rightWingModel[154].setRotationPoint(-28F, -7F, 60F);
		rightWingModel[154].rotateAngleX = 0.78539816F;

		rightWingModel[155].addShapeBox(35F, 0F, -6F, 2, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		rightWingModel[155].setRotationPoint(-28F, -7F, 60F);
		rightWingModel[155].rotateAngleX = 0.78539816F;

		rightWingModel[156].addShapeBox(12F, 0F, -6F, 21, 0, 3, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightWingModel[156].setRotationPoint(-28F, -7F, 60F);
		rightWingModel[156].rotateAngleX = -0.78539816F;

		rightWingModel[157].addShapeBox(35F, 0F, -6F, 2, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		rightWingModel[157].setRotationPoint(-28F, -7F, 60F);
		rightWingModel[157].rotateAngleX = -0.78539816F;

		rightWingModel[158].addShapeBox(35F, 0F, -6F, 2, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		rightWingModel[158].setRotationPoint(-28F, -14F, 54F);
		rightWingModel[158].rotateAngleX = -2.35619449F;

		rightWingModel[159].addShapeBox(12F, 0F, -6F, 21, 0, 3, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		rightWingModel[159].setRotationPoint(-28F, -14F, 54F);
		rightWingModel[159].rotateAngleX = -2.35619449F;

		rightWingModel[160].addShapeBox(-3F, 0F, -10.5F, 30, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		rightWingModel[160].setRotationPoint(-17F, -17F, 61.5F);

		rightWingModel[161].addShapeBox(-3F, 0F, -10.5F, 30, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		rightWingModel[161].setRotationPoint(-17F, -15F, 61.5F);

		rightWingModel[162].addShapeBox(35F, 0F, -6F, 2, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		rightWingModel[162].setRotationPoint(-28F, -14F, 54F);
		rightWingModel[162].rotateAngleX = 2.35619449F;

		rightWingModel[163].addShapeBox(12F, 0F, -6F, 21, 0, 3, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		rightWingModel[163].setRotationPoint(-28F, -14F, 54F);
		rightWingModel[163].rotateAngleX = 2.35619449F;

		rightWingModel[164].addShapeBox(-3F, 0F, -10.5F, 30, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 42
		rightWingModel[164].setRotationPoint(-17F, -13F, 61.5F);

		rightWingModel[165].addShapeBox(-3F, 0F, -10.5F, 6, 2, 6, 0F,0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 43
		rightWingModel[165].setRotationPoint(-23F, -17F, 61.5F);

		rightWingModel[166].addShapeBox(-3F, -2F, -10.5F, 6, 2, 6, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 44
		rightWingModel[166].setRotationPoint(-23F, -13F, 61.5F);

		rightWingModel[167].addShapeBox(-3F, 0F, -10.5F, 6, 2, 6, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -2F); // Box 45
		rightWingModel[167].setRotationPoint(-23F, -13F, 61.5F);

		rightWingModel[168].addShapeBox(-3F, -4F, -10.5F, 2, 2, 6, 0F,0F, -2F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F); // Box 46
		rightWingModel[168].setRotationPoint(-25F, -13F, 61.5F);

		rightWingModel[169].addShapeBox(-3F, -2F, -10.5F, 2, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F); // Box 47
		rightWingModel[169].setRotationPoint(-25F, -13F, 61.5F);

		rightWingModel[170].addShapeBox(-3F, -4F, -10.5F, 2, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -2F, -2F); // Box 48
		rightWingModel[170].setRotationPoint(-25F, -9F, 61.5F);

		rightWingModel[171].addShapeBox(35F, 0F, -6F, 2, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		rightWingModel[171].setRotationPoint(-28F, -14F, 54F);
		rightWingModel[171].rotateAngleX = 0.78539816F;

		rightWingModel[172].addShapeBox(12F, 0F, -6F, 21, 0, 3, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		rightWingModel[172].setRotationPoint(-28F, -14F, 54F);
		rightWingModel[172].rotateAngleX = 0.78539816F;

		rightWingModel[173].addShapeBox(35F, 0F, -6F, 2, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		rightWingModel[173].setRotationPoint(-28F, -14F, 54F);
		rightWingModel[173].rotateAngleX = -0.78539816F;

		rightWingModel[174].addShapeBox(12F, 0F, -6F, 21, 0, 3, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		rightWingModel[174].setRotationPoint(-28F, -14F, 54F);
		rightWingModel[174].rotateAngleX = -0.78539816F;

		rightWingModel[175].addShapeBox(35F, 0F, -6F, 2, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		rightWingModel[175].setRotationPoint(-28F, -14F, 66F);
		rightWingModel[175].rotateAngleX = -2.35619449F;

		rightWingModel[176].addShapeBox(12F, 0F, -6F, 21, 0, 3, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		rightWingModel[176].setRotationPoint(-28F, -14F, 66F);
		rightWingModel[176].rotateAngleX = -2.35619449F;

		rightWingModel[177].addShapeBox(-3F, 0F, -10.5F, 30, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		rightWingModel[177].setRotationPoint(-17F, -17F, 73.5F);

		rightWingModel[178].addShapeBox(-3F, 0F, -10.5F, 30, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		rightWingModel[178].setRotationPoint(-17F, -15F, 73.5F);

		rightWingModel[179].addShapeBox(35F, 0F, -6F, 2, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		rightWingModel[179].setRotationPoint(-28F, -14F, 66F);
		rightWingModel[179].rotateAngleX = 2.35619449F;

		rightWingModel[180].addShapeBox(12F, 0F, -6F, 21, 0, 3, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		rightWingModel[180].setRotationPoint(-28F, -14F, 66F);
		rightWingModel[180].rotateAngleX = 2.35619449F;

		rightWingModel[181].addShapeBox(-3F, 0F, -10.5F, 30, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 59
		rightWingModel[181].setRotationPoint(-17F, -13F, 73.5F);

		rightWingModel[182].addShapeBox(-3F, 0F, -10.5F, 6, 2, 6, 0F,0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 60
		rightWingModel[182].setRotationPoint(-23F, -17F, 73.5F);

		rightWingModel[183].addShapeBox(-3F, -2F, -10.5F, 6, 2, 6, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 61
		rightWingModel[183].setRotationPoint(-23F, -13F, 73.5F);

		rightWingModel[184].addShapeBox(-3F, 0F, -10.5F, 6, 2, 6, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -2F); // Box 62
		rightWingModel[184].setRotationPoint(-23F, -13F, 73.5F);

		rightWingModel[185].addShapeBox(-3F, -4F, -10.5F, 2, 2, 6, 0F,0F, -2F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F); // Box 63
		rightWingModel[185].setRotationPoint(-25F, -13F, 73.5F);

		rightWingModel[186].addShapeBox(-3F, -2F, -10.5F, 2, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F); // Box 64
		rightWingModel[186].setRotationPoint(-25F, -13F, 73.5F);

		rightWingModel[187].addShapeBox(-3F, -4F, -10.5F, 2, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -2F, -2F); // Box 65
		rightWingModel[187].setRotationPoint(-25F, -9F, 73.5F);

		rightWingModel[188].addShapeBox(35F, 0F, -6F, 2, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		rightWingModel[188].setRotationPoint(-28F, -14F, 66F);
		rightWingModel[188].rotateAngleX = 0.78539816F;

		rightWingModel[189].addShapeBox(12F, 0F, -6F, 21, 0, 3, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		rightWingModel[189].setRotationPoint(-28F, -14F, 66F);
		rightWingModel[189].rotateAngleX = 0.78539816F;

		rightWingModel[190].addShapeBox(35F, 0F, -6F, 2, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		rightWingModel[190].setRotationPoint(-28F, -14F, 66F);
		rightWingModel[190].rotateAngleX = -0.78539816F;

		rightWingModel[191].addShapeBox(12F, 0F, -6F, 21, 0, 3, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		rightWingModel[191].setRotationPoint(-28F, -14F, 66F);
		rightWingModel[191].rotateAngleX = -0.78539816F;

		rightWingModel[192].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 70
		rightWingModel[192].setRotationPoint(-26F, -11F, 27.5F);

		rightWingModel[193].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 71
		rightWingModel[193].setRotationPoint(-24F, -13F, 25.5F);

		rightWingModel[194].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 72
		rightWingModel[194].setRotationPoint(-24F, -11F, 25.5F);

		rightWingModel[195].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F); // Box 73
		rightWingModel[195].setRotationPoint(-24F, -9F, 25.5F);

		rightWingModel[196].addShapeBox(0F, 0F, 0F, 20, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		rightWingModel[196].setRotationPoint(-18F, -13F, 25.5F);

		rightWingModel[197].addShapeBox(0F, 0F, 0F, 20, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		rightWingModel[197].setRotationPoint(-18F, -11F, 25.5F);

		rightWingModel[198].addShapeBox(0F, 0F, 0F, 20, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 76
		rightWingModel[198].setRotationPoint(-18F, -9F, 25.5F);

		rightWingModel[199].addShapeBox(35F, -3F, 0F, 2, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		rightWingModel[199].setRotationPoint(-26F, -10F, 28.5F);
		rightWingModel[199].rotateAngleX = -0.78539816F;

		rightWingModel[200].addShapeBox(35F, -3F, 0F, 2, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		rightWingModel[200].setRotationPoint(-26F, -10F, 28.5F);
		rightWingModel[200].rotateAngleX = 0.78539816F;

		rightWingModel[201].addShapeBox(32F, -3F, 0F, 3, 6, 0, 0F,0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F); // Box 79
		rightWingModel[201].setRotationPoint(-26F, -10F, 28.5F);
		rightWingModel[201].rotateAngleX = 0.78539816F;

		rightWingModel[202].addShapeBox(32F, -3F, 0F, 3, 6, 0, 0F,0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F); // Box 80
		rightWingModel[202].setRotationPoint(-26F, -10F, 28.5F);
		rightWingModel[202].rotateAngleX = -0.78539816F;

		rightWingModel[203].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, 0F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, 0F); // Box 81
		rightWingModel[203].setRotationPoint(2F, -11F, 25.5F);

		rightWingModel[204].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, -2F, 0F, -2.5F, -2.5F, 0F, -2.5F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0F, 0F); // Box 82
		rightWingModel[204].setRotationPoint(2F, -13F, 25.5F);

		rightWingModel[205].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, 0F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2.5F, -2.5F, 0F, -2.5F, -2.5F, 0F, 0F, -2F); // Box 83
		rightWingModel[205].setRotationPoint(2F, -9F, 25.5F);

		rightWingModel[206].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 84
		rightWingModel[206].setRotationPoint(-26F, -11F, 9.5F);

		rightWingModel[207].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 85
		rightWingModel[207].setRotationPoint(-24F, -13F, 7.5F);

		rightWingModel[208].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 86
		rightWingModel[208].setRotationPoint(-24F, -11F, 7.5F);

		rightWingModel[209].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F); // Box 87
		rightWingModel[209].setRotationPoint(-24F, -9F, 7.5F);

		rightWingModel[210].addShapeBox(0F, 0F, 0F, 20, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		rightWingModel[210].setRotationPoint(-18F, -13F, 7.5F);

		rightWingModel[211].addShapeBox(0F, 0F, 0F, 20, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		rightWingModel[211].setRotationPoint(-18F, -11F, 7.5F);

		rightWingModel[212].addShapeBox(0F, 0F, 0F, 20, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 90
		rightWingModel[212].setRotationPoint(-18F, -9F, 7.5F);

		rightWingModel[213].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, 0F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2.5F, -2.5F, 0F, -2.5F, -2.5F, 0F, 0F, -2F); // Box 91
		rightWingModel[213].setRotationPoint(2F, -9F, 7.5F);

		rightWingModel[214].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, 0F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, 0F); // Box 92
		rightWingModel[214].setRotationPoint(2F, -11F, 7.5F);

		rightWingModel[215].addShapeBox(35F, -3F, 0F, 2, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		rightWingModel[215].setRotationPoint(-26F, -10F, 10.5F);
		rightWingModel[215].rotateAngleX = -0.78539816F;

		rightWingModel[216].addShapeBox(32F, -3F, 0F, 3, 6, 0, 0F,0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F); // Box 94
		rightWingModel[216].setRotationPoint(-26F, -10F, 10.5F);
		rightWingModel[216].rotateAngleX = -0.78539816F;

		rightWingModel[217].addShapeBox(32F, -3F, 0F, 3, 6, 0, 0F,0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F); // Box 95
		rightWingModel[217].setRotationPoint(-26F, -10F, 10.5F);
		rightWingModel[217].rotateAngleX = 0.78539816F;

		rightWingModel[218].addShapeBox(35F, -3F, 0F, 2, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		rightWingModel[218].setRotationPoint(-26F, -10F, 10.5F);
		rightWingModel[218].rotateAngleX = 0.78539816F;

		rightWingModel[219].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, -2F, 0F, -2.5F, -2.5F, 0F, -2.5F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0F, 0F); // Box 97
		rightWingModel[219].setRotationPoint(2F, -13F, 7.5F);
	}

	private void inittopWingModel_1()
	{
		topWingModel[0] = new ModelRendererTurbo(this, 985, 49, textureX, textureY); // wingtop left
		topWingModel[1] = new ModelRendererTurbo(this, 545, 49, textureX, textureY); // wing top left
		topWingModel[2] = new ModelRendererTurbo(this, 697, 25, textureX, textureY); // wing top left
		topWingModel[3] = new ModelRendererTurbo(this, 1001, 25, textureX, textureY); // wing top back
		topWingModel[4] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // wing top left
		topWingModel[5] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 117
		topWingModel[6] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 118
		topWingModel[7] = new ModelRendererTurbo(this, 881, 25, textureX, textureY); // Box 119
		topWingModel[8] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 120
		topWingModel[9] = new ModelRendererTurbo(this, 761, 41, textureX, textureY); // Box 121
		topWingModel[10] = new ModelRendererTurbo(this, 561, 49, textureX, textureY); // Box 122
		topWingModel[11] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 123
		topWingModel[12] = new ModelRendererTurbo(this, 985, 89, textureX, textureY); // Box 124
		topWingModel[13] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 125
		topWingModel[14] = new ModelRendererTurbo(this, 913, 25, textureX, textureY); // Box 126
		topWingModel[15] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 127
		topWingModel[16] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 128
		topWingModel[17] = new ModelRendererTurbo(this, 969, 49, textureX, textureY); // Box 129
		topWingModel[18] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 130
		topWingModel[19] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 131
		topWingModel[20] = new ModelRendererTurbo(this, 825, 41, textureX, textureY); // Box 132
		topWingModel[21] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 133
		topWingModel[22] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 134
		topWingModel[23] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 135
		topWingModel[24] = new ModelRendererTurbo(this, 993, 273, textureX, textureY); // Box 879
		topWingModel[25] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Box 880

		topWingModel[0].addShapeBox(0F, 0F, 0F, 10, 35, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // wingtop left
		topWingModel[0].setRotationPoint(108F, -62F, -49F);

		topWingModel[1].addShapeBox(0F, 0F, 0F, 2, 36, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // wing top left
		topWingModel[1].setRotationPoint(108F, -62F, -49F);
		topWingModel[1].rotateAngleZ = -0.12217305F;

		topWingModel[2].addShapeBox(1F, 16F, 0F, 2, 20, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // wing top left
		topWingModel[2].setRotationPoint(108F, -62F, -49F);
		topWingModel[2].rotateAngleZ = -0.12217305F;

		topWingModel[3].addShapeBox(2F, 23F, 0F, 2, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // wing top back
		topWingModel[3].setRotationPoint(108F, -62F, -49F);
		topWingModel[3].rotateAngleZ = -0.12217305F;

		topWingModel[4].addShapeBox(3F, 30F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // wing top left
		topWingModel[4].setRotationPoint(108F, -61F, -49F);
		topWingModel[4].rotateAngleZ = -0.12217305F;

		topWingModel[5].addShapeBox(-5F, 0F, 0F, 5, 37, 2, 0F,0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 3F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -0.7F); // Box 117
		topWingModel[5].setRotationPoint(108F, -62F, -49F);
		topWingModel[5].rotateAngleZ = -0.12217305F;

		topWingModel[6].addShapeBox(-5F, -4F, 0F, 5, 4, 2, 0F,-1.5F, -1.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -1.5F, -1.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F); // Box 118
		topWingModel[6].setRotationPoint(108F, -62F, -49F);
		topWingModel[6].rotateAngleZ = -0.12217305F;

		topWingModel[7].addShapeBox(0F, -4F, 0F, 10, 4, 2, 0F,-0.5F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -0.5F, 0F, -0.7F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 119
		topWingModel[7].setRotationPoint(108F, -62F, -49F);

		topWingModel[8].addShapeBox(-8F, 37F, 0F, 8, 11, 2, 0F,0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, -3F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -0F, -3F, -0.7F); // Box 120
		topWingModel[8].setRotationPoint(108F, -62F, -49F);
		topWingModel[8].rotateAngleZ = -0.12217305F;

		topWingModel[9].addShapeBox(-4F, 35F, 0F, 14, 2, 2, 0F,0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.2F, 0F); // Box 121
		topWingModel[9].setRotationPoint(108F, -62F, -49F);

		topWingModel[10].addShapeBox(-5F, 37F, 0F, 17, 10, 2, 0F,-0.5F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.2F, 0F, 0.85F, 0.65F, -0.7F, 0.3F, -3F, -0.7F, 0.3F, -3F, -0.7F, 0.85F, 0.65F, -0.7F); // Box 122
		topWingModel[10].setRotationPoint(108F, -62F, -49F);

		topWingModel[11].addShapeBox(0F, 0F, 0F, 2, 37, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0F, 0F, 0F); // Box 123
		topWingModel[11].setRotationPoint(116F, -62F, -49F);
		topWingModel[11].rotateAngleZ = 0.05235988F;

		topWingModel[12].addShapeBox(-5F, 37F, 0F, 17, 10, 2, 0F,-0.5F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.2F, 0F, 0.85F, 0.65F, -0.7F, 0.3F, -3F, -0.7F, 0.3F, -3F, -0.7F, 0.85F, 0.65F, -0.7F); // Box 124
		topWingModel[12].setRotationPoint(108F, -62F, 47F);

		topWingModel[13].addShapeBox(-4F, 35F, 0F, 14, 2, 2, 0F,0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.2F, 0F); // Box 125
		topWingModel[13].setRotationPoint(108F, -62F, 47F);

		topWingModel[14].addShapeBox(3F, 30F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		topWingModel[14].setRotationPoint(108F, -61F, 47F);
		topWingModel[14].rotateAngleZ = -0.12217305F;

		topWingModel[15].addShapeBox(0F, 0F, 0F, 2, 36, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		topWingModel[15].setRotationPoint(108F, -62F, 47F);
		topWingModel[15].rotateAngleZ = -0.12217305F;

		topWingModel[16].addShapeBox(2F, 23F, 0F, 2, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		topWingModel[16].setRotationPoint(108F, -62F, 47F);
		topWingModel[16].rotateAngleZ = -0.12217305F;

		topWingModel[17].addShapeBox(1F, 16F, 0F, 2, 20, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		topWingModel[17].setRotationPoint(108F, -62F, 47F);
		topWingModel[17].rotateAngleZ = -0.12217305F;

		topWingModel[18].addShapeBox(0F, 0F, 0F, 10, 35, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		topWingModel[18].setRotationPoint(108F, -62F, 47F);

		topWingModel[19].addShapeBox(0F, 0F, 0F, 2, 37, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0F, 0F, 0F); // Box 131
		topWingModel[19].setRotationPoint(116F, -62F, 47F);
		topWingModel[19].rotateAngleZ = 0.05235988F;

		topWingModel[20].addShapeBox(0F, -4F, 0F, 10, 4, 2, 0F,-0.5F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -0.5F, 0F, -0.7F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 132
		topWingModel[20].setRotationPoint(108F, -62F, 47F);

		topWingModel[21].addShapeBox(-5F, -4F, 0F, 5, 4, 2, 0F,-1.5F, -1.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -1.5F, -1.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F); // Box 133
		topWingModel[21].setRotationPoint(108F, -62F, 47F);
		topWingModel[21].rotateAngleZ = -0.12217305F;

		topWingModel[22].addShapeBox(-5F, 0F, 0F, 5, 37, 2, 0F,0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 3F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -0.7F); // Box 134
		topWingModel[22].setRotationPoint(108F, -62F, 47F);
		topWingModel[22].rotateAngleZ = -0.12217305F;

		topWingModel[23].addShapeBox(-8F, 37F, 0F, 8, 11, 2, 0F,0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -0F, -3F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -3F, -0.7F); // Box 135
		topWingModel[23].setRotationPoint(108F, -62F, 47F);
		topWingModel[23].rotateAngleZ = -0.12217305F;

		topWingModel[24].addShapeBox(0F, 0F, 0F, 10, 35, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 879
		topWingModel[24].setRotationPoint(108F, -62F, -49.05F);

		topWingModel[25].addShapeBox(0F, 0F, 0F, 10, 35, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 880
		topWingModel[25].setRotationPoint(108F, -62F, 47.05F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 98
		yawFlapModel[1] = new ModelRendererTurbo(this, 913, 161, textureX, textureY); // Box 99
		yawFlapModel[2] = new ModelRendererTurbo(this, 617, 185, textureX, textureY); // Box 101
		yawFlapModel[3] = new ModelRendererTurbo(this, 465, 217, textureX, textureY); // Box 102
		yawFlapModel[4] = new ModelRendererTurbo(this, 937, 161, textureX, textureY); // Box 103
		yawFlapModel[5] = new ModelRendererTurbo(this, 553, 193, textureX, textureY); // Box 104

		yawFlapModel[0].addShapeBox(0F, 0F, -1F, 8, 37, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 2.2F, 0.2F, -0.7F, 2.2F, 0.2F, -0.7F, 0F, 0F, 0F); // Box 98
		yawFlapModel[0].setRotationPoint(118F, -62F, -48F);
		yawFlapModel[0].rotateAngleZ = 0.05235988F;

		yawFlapModel[1].addShapeBox(0F, 0F, -1F, 8, 4, 2, 0F,0F, 0F, -0.7F, -2F, -1F, -0.7F, -2F, -1F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0.2F, -0.7F, 0F, 0.2F, -0.7F, 0F, 0F, 0F); // Box 99
		yawFlapModel[1].setRotationPoint(118F, -66F, -48F);
		yawFlapModel[1].rotateAngleZ = 0.05235988F;

		yawFlapModel[2].addShapeBox(0F, 37F, -1F, 10, 7, 2, 0F,0F, 0F, 0F, 0.2F, -0.1F, -0.7F, 0.2F, -0.1F, -0.7F, 0F, 0F, 0F, 0F, 0F, -0.7F, -2F, -1F, -0.7F, -2F, -1F, -0.7F, 0F, 0F, -0.7F); // Box 101
		yawFlapModel[2].setRotationPoint(118F, -62F, -48F);
		yawFlapModel[2].rotateAngleZ = 0.05235988F;

		yawFlapModel[3].addShapeBox(0F, 0F, -1F, 8, 37, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 2.2F, 0.2F, -0.7F, 2.2F, 0.2F, -0.7F, 0F, 0F, 0F); // Box 102
		yawFlapModel[3].setRotationPoint(118F, -62F, 48F);
		yawFlapModel[3].rotateAngleZ = 0.05235988F;

		yawFlapModel[4].addShapeBox(0F, 0F, -1F, 8, 4, 2, 0F,0F, 0F, -0.7F, -2F, -1F, -0.7F, -2F, -1F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0.2F, -0.7F, 0F, 0.2F, -0.7F, 0F, 0F, 0F); // Box 103
		yawFlapModel[4].setRotationPoint(118F, -66F, 48F);
		yawFlapModel[4].rotateAngleZ = 0.05235988F;

		yawFlapModel[5].addShapeBox(0F, 37F, -1F, 10, 7, 2, 0F,0F, 0F, 0F, 0.2F, -0.1F, -0.7F, 0.2F, -0.1F, -0.7F, 0F, 0F, 0F, 0F, 0F, -0.7F, -2F, -1F, -0.7F, -2F, -1F, -0.7F, 0F, 0F, -0.7F); // Box 104
		yawFlapModel[5].setRotationPoint(118F, -62F, 48F);
		yawFlapModel[5].rotateAngleZ = 0.05235988F;
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 761, 281, textureX, textureY); // Box 105

		pitchFlapLeftModel[0].addShapeBox(0F, -0.8F, 0F, 10, 2, 41, 0F,0F, 0F, 0F, 0F, -0.7F, -3F, 0F, -0.7F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -3F, 0F, -0.7F, -3F, 0F, 0F, 0F); // Box 105
		pitchFlapLeftModel[0].setRotationPoint(119F, -26F, -47F);
		pitchFlapLeftModel[0].rotateAngleZ = -0.06981317F;
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Box 106

		pitchFlapRightModel[0].addShapeBox(0F, -0.8F, 0F, 10, 2, 41, 0F,0F, 0F, 0F, 0F, -0.7F, -3F, 0F, -0.7F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -3F, 0F, -0.7F, -3F, 0F, 0F, 0F); // Box 106
		pitchFlapRightModel[0].setRotationPoint(119F, -26F, 6F);
		pitchFlapRightModel[0].rotateAngleZ = -0.06981317F;
	}

	private void initpitchFlapLeftWingModel_1()
	{
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 601, 169, textureX, textureY); // Box 150

		pitchFlapLeftWingModel[0].addShapeBox(0F, -8F, -82F, 21, 8, 47, 0F,0F, -1.8F, 0F, -7F, -3F, 0F, -2F, -3F, 0F, 0F, -0.8F, 0F, 0F, -1.8F, 0F, -7F, -3F, 0F, -2F, -3F, 0F, 0F, -0.8F, 0F); // Box 150
		pitchFlapLeftWingModel[0].setRotationPoint(10F, -18F, -47F);
		pitchFlapLeftWingModel[0].rotateAngleX = -0.10471976F;
	}

	private void initpitchFlapRightWingModel_1()
	{
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 665, 257, textureX, textureY); // Box 28

		pitchFlapRightWingModel[0].addShapeBox(0F, -3F, 82F, 21, 8, 47, 0F,0F, -0.8F, 0F, -2F, -3F, 0F, -7F, -3F, 0F, 0F, -1.8F, 0F, 0F, -0.8F, 0F, -2F, -3F, 0F, -7F, -3F, 0F, 0F, -1.8F, 0F); // Box 28
		pitchFlapRightWingModel[0].setRotationPoint(10F, -18F, 0F);
		pitchFlapRightWingModel[0].rotateAngleX = 0.10471976F;
	}

	private void initbodyWheelModel_1()
	{
		bodyWheelModel[0] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 34
		bodyWheelModel[1] = new ModelRendererTurbo(this, 17, 145, textureX, textureY); // Box 35
		bodyWheelModel[2] = new ModelRendererTurbo(this, 89, 145, textureX, textureY); // Box 36
		bodyWheelModel[3] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Box 37
		bodyWheelModel[4] = new ModelRendererTurbo(this, 585, 145, textureX, textureY); // Box 38
		bodyWheelModel[5] = new ModelRendererTurbo(this, 977, 145, textureX, textureY); // Box 39
		bodyWheelModel[6] = new ModelRendererTurbo(this, 993, 145, textureX, textureY); // Box 40
		bodyWheelModel[7] = new ModelRendererTurbo(this, 577, 185, textureX, textureY); // Box 16
		bodyWheelModel[8] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 17
		bodyWheelModel[9] = new ModelRendererTurbo(this, 513, 9, textureX, textureY); // Box 18
		bodyWheelModel[10] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 19
		bodyWheelModel[11] = new ModelRendererTurbo(this, 617, 65, textureX, textureY); // Box 20
		bodyWheelModel[12] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Box 21
		bodyWheelModel[13] = new ModelRendererTurbo(this, 625, 113, textureX, textureY); // Box 22
		bodyWheelModel[14] = new ModelRendererTurbo(this, 489, 153, textureX, textureY); // Box 23
		bodyWheelModel[15] = new ModelRendererTurbo(this, 481, 161, textureX, textureY); // Box 24
		bodyWheelModel[16] = new ModelRendererTurbo(this, 993, 161, textureX, textureY); // Box 25
		bodyWheelModel[17] = new ModelRendererTurbo(this, 1009, 161, textureX, textureY); // Box 26
		bodyWheelModel[18] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Box 27
		bodyWheelModel[19] = new ModelRendererTurbo(this, 521, 169, textureX, textureY); // Box 28
		bodyWheelModel[20] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 29
		bodyWheelModel[21] = new ModelRendererTurbo(this, 17, 177, textureX, textureY); // Box 30
		bodyWheelModel[22] = new ModelRendererTurbo(this, 89, 177, textureX, textureY); // Box 31
		bodyWheelModel[23] = new ModelRendererTurbo(this, 105, 177, textureX, textureY); // Box 32
		bodyWheelModel[24] = new ModelRendererTurbo(this, 145, 177, textureX, textureY); // Box 33
		bodyWheelModel[25] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 35
		bodyWheelModel[26] = new ModelRendererTurbo(this, 913, 177, textureX, textureY); // Box 36
		bodyWheelModel[27] = new ModelRendererTurbo(this, 105, 193, textureX, textureY); // Box 37
		bodyWheelModel[28] = new ModelRendererTurbo(this, 745, 161, textureX, textureY); // Box 38
		bodyWheelModel[29] = new ModelRendererTurbo(this, 1009, 177, textureX, textureY); // Box 40

		bodyWheelModel[0].addShapeBox(-1F, -7F, -3F, 2, 3, 4, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyWheelModel[0].setRotationPoint(-11F, -12F, -43F);
		bodyWheelModel[0].rotateAngleZ = 1.23045712F;

		bodyWheelModel[1].addShapeBox(-1F, -7F, -3F, 2, 3, 4, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyWheelModel[1].setRotationPoint(-11F, -12F, -43F);
		bodyWheelModel[1].rotateAngleZ = 0.83775804F;

		bodyWheelModel[2].addShapeBox(-1F, -7F, -3F, 2, 3, 4, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyWheelModel[2].setRotationPoint(-11F, -12F, -43F);
		bodyWheelModel[2].rotateAngleZ = 0.44505896F;

		bodyWheelModel[3].addShapeBox(-1F, -7F, -3F, 2, 3, 4, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyWheelModel[3].setRotationPoint(-11F, -12F, -43F);
		bodyWheelModel[3].rotateAngleZ = 0.05235988F;

		bodyWheelModel[4].addShapeBox(-1F, -7F, -3F, 2, 3, 4, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyWheelModel[4].setRotationPoint(-11F, -12F, -43F);
		bodyWheelModel[4].rotateAngleZ = -0.3403392F;

		bodyWheelModel[5].addShapeBox(-1F, -7F, -3F, 2, 3, 4, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyWheelModel[5].setRotationPoint(-11F, -12F, -43F);
		bodyWheelModel[5].rotateAngleZ = 5.55014702F;

		bodyWheelModel[6].addShapeBox(-1F, -7F, -3F, 2, 3, 4, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyWheelModel[6].setRotationPoint(-11F, -12F, -43F);
		bodyWheelModel[6].rotateAngleZ = -1.12573737F;

		bodyWheelModel[7].addShapeBox(-5F, -3F, -2F, 6, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyWheelModel[7].setRotationPoint(-78F, 5F, 6F);

		bodyWheelModel[8].addShapeBox(-1F, -1F, -2.5F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyWheelModel[8].setRotationPoint(-80F, 5F, 6F);

		bodyWheelModel[9].addShapeBox(-1F, -5F, 0.5F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyWheelModel[9].setRotationPoint(-80F, 5F, 3F);

		bodyWheelModel[10].addShapeBox(-1F, -5F, 0.5F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyWheelModel[10].setRotationPoint(-80F, 5F, 3F);
		bodyWheelModel[10].rotateAngleZ = 0.39269908F;

		bodyWheelModel[11].addShapeBox(-1F, -5F, 0.5F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyWheelModel[11].setRotationPoint(-80F, 5F, 3F);
		bodyWheelModel[11].rotateAngleZ = -0.39269908F;

		bodyWheelModel[12].addShapeBox(-1F, -5F, 0.5F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyWheelModel[12].setRotationPoint(-80F, 5F, 3F);
		bodyWheelModel[12].rotateAngleZ = 0.78539816F;

		bodyWheelModel[13].addShapeBox(-1F, -5F, 0.5F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyWheelModel[13].setRotationPoint(-80F, 5F, 3F);
		bodyWheelModel[13].rotateAngleZ = -0.78539816F;

		bodyWheelModel[14].addShapeBox(-1F, -5F, 0.5F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyWheelModel[14].setRotationPoint(-80F, 5F, 3F);
		bodyWheelModel[14].rotateAngleZ = 1.17809725F;

		bodyWheelModel[15].addShapeBox(-1F, -5F, 0.5F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyWheelModel[15].setRotationPoint(-80F, 5F, 3F);
		bodyWheelModel[15].rotateAngleZ = -1.17809725F;

		bodyWheelModel[16].addShapeBox(-1F, -5F, 0.5F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyWheelModel[16].setRotationPoint(-80F, 5F, 3F);
		bodyWheelModel[16].rotateAngleZ = 1.57079633F;

		bodyWheelModel[17].addShapeBox(-1F, -5F, 0.5F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyWheelModel[17].setRotationPoint(-80F, 5F, 3F);
		bodyWheelModel[17].rotateAngleZ = -1.57079633F;

		bodyWheelModel[18].addShapeBox(-1F, -5F, 0.5F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyWheelModel[18].setRotationPoint(-80F, 5F, 3F);
		bodyWheelModel[18].rotateAngleZ = -1.96349541F;

		bodyWheelModel[19].addShapeBox(-1F, -5F, 0.5F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyWheelModel[19].setRotationPoint(-80F, 5F, 3F);
		bodyWheelModel[19].rotateAngleZ = 1.96349541F;

		bodyWheelModel[20].addShapeBox(-1F, -5F, 0.5F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyWheelModel[20].setRotationPoint(-80F, 5F, 3F);
		bodyWheelModel[20].rotateAngleZ = -2.35619449F;

		bodyWheelModel[21].addShapeBox(-1F, -5F, 0.5F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyWheelModel[21].setRotationPoint(-80F, 5F, 3F);
		bodyWheelModel[21].rotateAngleZ = 2.35619449F;

		bodyWheelModel[22].addShapeBox(-1F, -5F, 0.5F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyWheelModel[22].setRotationPoint(-80F, 5F, 3F);
		bodyWheelModel[22].rotateAngleZ = -2.74889357F;

		bodyWheelModel[23].addShapeBox(-1F, -5F, 0.5F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyWheelModel[23].setRotationPoint(-80F, 5F, 3F);
		bodyWheelModel[23].rotateAngleZ = 2.74889357F;

		bodyWheelModel[24].addShapeBox(-1F, -5F, 0.5F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyWheelModel[24].setRotationPoint(-80F, 5F, 3F);
		bodyWheelModel[24].rotateAngleZ = 3.14159265F;

		bodyWheelModel[25].addShapeBox(-1F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyWheelModel[25].setRotationPoint(-80F, -3F, 7F);

		bodyWheelModel[26].addShapeBox(-1F, -1F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyWheelModel[26].setRotationPoint(-80F, -2F, 4F);

		bodyWheelModel[27].addShapeBox(-1F, -15F, 0F, 2, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyWheelModel[27].setRotationPoint(-80F, -2F, 4F);

		bodyWheelModel[28].addShapeBox(-1F, -10F, 0F, 2, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyWheelModel[28].setRotationPoint(-80F, -7F, 4F);
		bodyWheelModel[28].rotateAngleZ = 0.43633231F;

		bodyWheelModel[29].addShapeBox(-2.5F, -8F, -0.5F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyWheelModel[29].setRotationPoint(-80F, -2F, 4F);
	}

	private void inittailWheelModel_1()
	{
		tailWheelModel[0] = new ModelRendererTurbo(this, 721, 177, textureX, textureY); // Box 34
		tailWheelModel[1] = new ModelRendererTurbo(this, 697, 201, textureX, textureY); // Box 39

		tailWheelModel[0].addShapeBox(-1F, -1F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		tailWheelModel[0].setRotationPoint(-80F, 5F, 6F);

		tailWheelModel[1].addShapeBox(-25F, 0F, 0F, 25, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -4F, 0F); // Box 39
		tailWheelModel[1].setRotationPoint(-90F, -20F, 9F);
		tailWheelModel[1].rotateAngleY = 0.08726646F;
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 1009, 121, textureX, textureY); // Box 4
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 633, 105, textureX, textureY); // Box 5
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 681, 33, textureX, textureY); // Box 6
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Box 7
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 585, 9, textureX, textureY); // Box 8
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 9
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 529, 73, textureX, textureY); // Box 10
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 665, 73, textureX, textureY); // Box 11
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 617, 81, textureX, textureY); // Box 12
		leftWingWheelModel[9] = new ModelRendererTurbo(this, 633, 81, textureX, textureY); // Box 13
		leftWingWheelModel[10] = new ModelRendererTurbo(this, 985, 105, textureX, textureY); // Box 14
		leftWingWheelModel[11] = new ModelRendererTurbo(this, 1001, 105, textureX, textureY); // Box 15
		leftWingWheelModel[12] = new ModelRendererTurbo(this, 865, 113, textureX, textureY); // Box 16
		leftWingWheelModel[13] = new ModelRendererTurbo(this, 569, 121, textureX, textureY); // Box 17
		leftWingWheelModel[14] = new ModelRendererTurbo(this, 665, 121, textureX, textureY); // Box 18
		leftWingWheelModel[15] = new ModelRendererTurbo(this, 681, 121, textureX, textureY); // Box 19
		leftWingWheelModel[16] = new ModelRendererTurbo(this, 953, 121, textureX, textureY); // Box 20
		leftWingWheelModel[17] = new ModelRendererTurbo(this, 521, 129, textureX, textureY); // Box 21
		leftWingWheelModel[18] = new ModelRendererTurbo(this, 665, 129, textureX, textureY); // Box 22
		leftWingWheelModel[19] = new ModelRendererTurbo(this, 681, 129, textureX, textureY); // Box 23
		leftWingWheelModel[20] = new ModelRendererTurbo(this, 881, 161, textureX, textureY); // Box 24
		leftWingWheelModel[21] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Box 25
		leftWingWheelModel[22] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 48
		leftWingWheelModel[23] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 49

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 2, 20, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		leftWingWheelModel[0].setRotationPoint(10F, -16F, -41F);

		leftWingWheelModel[1].addShapeBox(-0.5F, 6F, -0.5F, 3, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		leftWingWheelModel[1].setRotationPoint(10F, -15F, -43F);

		leftWingWheelModel[2].addShapeBox(0F, -2F, -0.5F, 2, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftWingWheelModel[2].setRotationPoint(10F, -15F, -43F);
		leftWingWheelModel[2].rotateAngleX = 0.06981317F;

		leftWingWheelModel[3].addShapeBox(0F, 18F, -2F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		leftWingWheelModel[3].setRotationPoint(10F, -16F, -41F);

		leftWingWheelModel[4].addShapeBox(-1F, -7F, -3F, 2, 3, 4, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		leftWingWheelModel[4].setRotationPoint(11F, 3F, -43F);

		leftWingWheelModel[5].addShapeBox(-1F, -7F, -3F, 2, 3, 4, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		leftWingWheelModel[5].setRotationPoint(11F, 3F, -43F);
		leftWingWheelModel[5].rotateAngleZ = 0.39269908F;

		leftWingWheelModel[6].addShapeBox(-1F, -7F, -3F, 2, 3, 4, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		leftWingWheelModel[6].setRotationPoint(11F, 3F, -43F);
		leftWingWheelModel[6].rotateAngleZ = 0.78539816F;

		leftWingWheelModel[7].addShapeBox(-1F, -7F, -3F, 2, 3, 4, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		leftWingWheelModel[7].setRotationPoint(11F, 3F, -43F);
		leftWingWheelModel[7].rotateAngleZ = 1.57079633F;

		leftWingWheelModel[8].addShapeBox(-1F, -7F, -3F, 2, 3, 4, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		leftWingWheelModel[8].setRotationPoint(11F, 3F, -43F);
		leftWingWheelModel[8].rotateAngleZ = 3.14159265F;

		leftWingWheelModel[9].addShapeBox(-1F, -7F, -3F, 2, 3, 4, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftWingWheelModel[9].setRotationPoint(11F, 3F, -43F);
		leftWingWheelModel[9].rotateAngleZ = 4.71238898F;

		leftWingWheelModel[10].addShapeBox(-1F, -7F, -3F, 2, 3, 4, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		leftWingWheelModel[10].setRotationPoint(11F, 3F, -43F);
		leftWingWheelModel[10].rotateAngleZ = -0.39269908F;

		leftWingWheelModel[11].addShapeBox(-1F, -7F, -3F, 2, 3, 4, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		leftWingWheelModel[11].setRotationPoint(11F, 3F, -43F);
		leftWingWheelModel[11].rotateAngleZ = -0.78539816F;

		leftWingWheelModel[12].addShapeBox(-1F, -7F, -3F, 2, 3, 4, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		leftWingWheelModel[12].setRotationPoint(11F, 3F, -43F);
		leftWingWheelModel[12].rotateAngleZ = 1.17809725F;

		leftWingWheelModel[13].addShapeBox(-1F, -7F, -3F, 2, 3, 4, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		leftWingWheelModel[13].setRotationPoint(11F, 3F, -43F);
		leftWingWheelModel[13].rotateAngleZ = -1.17809725F;

		leftWingWheelModel[14].addShapeBox(-1F, -7F, -3F, 2, 3, 4, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		leftWingWheelModel[14].setRotationPoint(11F, 3F, -43F);
		leftWingWheelModel[14].rotateAngleZ = 1.96349541F;

		leftWingWheelModel[15].addShapeBox(-1F, -7F, -3F, 2, 3, 4, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		leftWingWheelModel[15].setRotationPoint(11F, 3F, -43F);
		leftWingWheelModel[15].rotateAngleZ = 2.35619449F;

		leftWingWheelModel[16].addShapeBox(-1F, -7F, -3F, 2, 3, 4, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		leftWingWheelModel[16].setRotationPoint(11F, 3F, -43F);
		leftWingWheelModel[16].rotateAngleZ = 2.74889357F;

		leftWingWheelModel[17].addShapeBox(-1F, -7F, -3F, 2, 3, 4, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		leftWingWheelModel[17].setRotationPoint(11F, 3F, -43F);
		leftWingWheelModel[17].rotateAngleZ = -1.96349541F;

		leftWingWheelModel[18].addShapeBox(-1F, -7F, -3F, 2, 3, 4, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		leftWingWheelModel[18].setRotationPoint(11F, 3F, -43F);
		leftWingWheelModel[18].rotateAngleZ = -2.35619449F;

		leftWingWheelModel[19].addShapeBox(-1F, -7F, -3F, 2, 3, 4, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		leftWingWheelModel[19].setRotationPoint(11F, 3F, -43F);
		leftWingWheelModel[19].rotateAngleZ = -2.74889357F;

		leftWingWheelModel[20].addShapeBox(-4.5F, -5F, -2.5F, 9, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		leftWingWheelModel[20].setRotationPoint(11F, 3F, -43F);

		leftWingWheelModel[21].addShapeBox(-1F, -1F, -3F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		leftWingWheelModel[21].setRotationPoint(11F, 3F, -43F);

		leftWingWheelModel[22].addShapeBox(0F, 0F, 0F, 1, 13, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		leftWingWheelModel[22].setRotationPoint(13F, -18F, -45F);
		leftWingWheelModel[22].rotateAngleZ = 0.08726646F;

		leftWingWheelModel[23].addShapeBox(0F, 13F, 4F, 1, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		leftWingWheelModel[23].setRotationPoint(13F, -18F, -45F);
		leftWingWheelModel[23].rotateAngleZ = 0.08726646F;
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 465, 161, textureX, textureY); // Box 54
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 593, 89, textureX, textureY); // Box 55
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 633, 105, textureX, textureY); // Box 56
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 681, 33, textureX, textureY); // Box 57
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 1009, 121, textureX, textureY); // Box 58
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Box 59
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 881, 161, textureX, textureY); // Box 60
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 665, 73, textureX, textureY); // Box 61
		rightWingWheelModel[8] = new ModelRendererTurbo(this, 665, 73, textureX, textureY); // Box 62
		rightWingWheelModel[9] = new ModelRendererTurbo(this, 665, 73, textureX, textureY); // Box 63
		rightWingWheelModel[10] = new ModelRendererTurbo(this, 665, 73, textureX, textureY); // Box 64
		rightWingWheelModel[11] = new ModelRendererTurbo(this, 665, 73, textureX, textureY); // Box 65
		rightWingWheelModel[12] = new ModelRendererTurbo(this, 665, 73, textureX, textureY); // Box 66
		rightWingWheelModel[13] = new ModelRendererTurbo(this, 665, 73, textureX, textureY); // Box 67
		rightWingWheelModel[14] = new ModelRendererTurbo(this, 665, 73, textureX, textureY); // Box 68
		rightWingWheelModel[15] = new ModelRendererTurbo(this, 665, 73, textureX, textureY); // Box 69
		rightWingWheelModel[16] = new ModelRendererTurbo(this, 665, 73, textureX, textureY); // Box 70
		rightWingWheelModel[17] = new ModelRendererTurbo(this, 665, 73, textureX, textureY); // Box 71
		rightWingWheelModel[18] = new ModelRendererTurbo(this, 665, 73, textureX, textureY); // Box 72
		rightWingWheelModel[19] = new ModelRendererTurbo(this, 665, 73, textureX, textureY); // Box 73
		rightWingWheelModel[20] = new ModelRendererTurbo(this, 665, 73, textureX, textureY); // Box 74
		rightWingWheelModel[21] = new ModelRendererTurbo(this, 665, 73, textureX, textureY); // Box 75
		rightWingWheelModel[22] = new ModelRendererTurbo(this, 665, 73, textureX, textureY); // Box 76
		rightWingWheelModel[23] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Box 90

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 1, 13, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 54
		rightWingWheelModel[0].setRotationPoint(13F, -18F, 38F);
		rightWingWheelModel[0].rotateAngleZ = 0.08726646F;

		rightWingWheelModel[1].addShapeBox(0F, 13F, -4F, 1, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		rightWingWheelModel[1].setRotationPoint(13F, -18F, 42F);
		rightWingWheelModel[1].rotateAngleZ = 0.08726646F;

		rightWingWheelModel[2].addShapeBox(-0.5F, 6F, 0.5F, 3, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		rightWingWheelModel[2].setRotationPoint(10F, -15F, 38F);

		rightWingWheelModel[3].addShapeBox(0F, -2F, 0.5F, 2, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		rightWingWheelModel[3].setRotationPoint(10F, -15F, 41F);
		rightWingWheelModel[3].rotateAngleX = -0.06981317F;

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 2, 20, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		rightWingWheelModel[4].setRotationPoint(10F, -16F, 39F);

		rightWingWheelModel[5].addShapeBox(-1F, -1F, 3F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		rightWingWheelModel[5].setRotationPoint(11F, 3F, 42F);

		rightWingWheelModel[6].addShapeBox(-4.5F, -5F, 2.5F, 9, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		rightWingWheelModel[6].setRotationPoint(11F, 3F, 40F);

		rightWingWheelModel[7].addShapeBox(-1F, -7F, 3F, 2, 3, 4, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		rightWingWheelModel[7].setRotationPoint(11F, 3F, 39F);

		rightWingWheelModel[8].addShapeBox(-1F, -7F, 3F, 2, 3, 4, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		rightWingWheelModel[8].setRotationPoint(11F, 3F, 39F);
		rightWingWheelModel[8].rotateAngleZ = -0.39269908F;

		rightWingWheelModel[9].addShapeBox(-1F, -7F, 3F, 2, 3, 4, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		rightWingWheelModel[9].setRotationPoint(11F, 3F, 39F);
		rightWingWheelModel[9].rotateAngleZ = -0.78539816F;

		rightWingWheelModel[10].addShapeBox(-1F, -7F, 3F, 2, 3, 4, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		rightWingWheelModel[10].setRotationPoint(11F, 3F, 39F);
		rightWingWheelModel[10].rotateAngleZ = -1.17809725F;

		rightWingWheelModel[11].addShapeBox(-1F, -7F, 3F, 2, 3, 4, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		rightWingWheelModel[11].setRotationPoint(11F, 3F, 39F);
		rightWingWheelModel[11].rotateAngleZ = 4.71238898F;

		rightWingWheelModel[12].addShapeBox(-1F, -7F, 3F, 2, 3, 4, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		rightWingWheelModel[12].setRotationPoint(11F, 3F, 39F);
		rightWingWheelModel[12].rotateAngleZ = -1.96349541F;

		rightWingWheelModel[13].addShapeBox(-1F, -7F, 3F, 2, 3, 4, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		rightWingWheelModel[13].setRotationPoint(11F, 3F, 39F);
		rightWingWheelModel[13].rotateAngleZ = -2.35619449F;

		rightWingWheelModel[14].addShapeBox(-1F, -7F, 3F, 2, 3, 4, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		rightWingWheelModel[14].setRotationPoint(11F, 3F, 39F);
		rightWingWheelModel[14].rotateAngleZ = -2.74889357F;

		rightWingWheelModel[15].addShapeBox(-1F, -7F, 3F, 2, 3, 4, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		rightWingWheelModel[15].setRotationPoint(11F, 3F, 39F);
		rightWingWheelModel[15].rotateAngleZ = 3.14159265F;

		rightWingWheelModel[16].addShapeBox(-1F, -7F, 3F, 2, 3, 4, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		rightWingWheelModel[16].setRotationPoint(11F, 3F, 39F);
		rightWingWheelModel[16].rotateAngleZ = 2.74889357F;

		rightWingWheelModel[17].addShapeBox(-1F, -7F, 3F, 2, 3, 4, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		rightWingWheelModel[17].setRotationPoint(11F, 3F, 39F);
		rightWingWheelModel[17].rotateAngleZ = 2.35619449F;

		rightWingWheelModel[18].addShapeBox(-1F, -7F, 3F, 2, 3, 4, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		rightWingWheelModel[18].setRotationPoint(11F, 3F, 39F);
		rightWingWheelModel[18].rotateAngleZ = 1.96349541F;

		rightWingWheelModel[19].addShapeBox(-1F, -7F, 3F, 2, 3, 4, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		rightWingWheelModel[19].setRotationPoint(11F, 3F, 39F);
		rightWingWheelModel[19].rotateAngleZ = 1.57079633F;

		rightWingWheelModel[20].addShapeBox(-1F, -7F, 3F, 2, 3, 4, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		rightWingWheelModel[20].setRotationPoint(11F, 3F, 39F);
		rightWingWheelModel[20].rotateAngleZ = 1.17809725F;

		rightWingWheelModel[21].addShapeBox(-1F, -7F, 3F, 2, 3, 4, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		rightWingWheelModel[21].setRotationPoint(11F, 3F, 39F);
		rightWingWheelModel[21].rotateAngleZ = 0.78539816F;

		rightWingWheelModel[22].addShapeBox(-1F, -7F, 3F, 2, 3, 4, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		rightWingWheelModel[22].setRotationPoint(11F, 3F, 39F);
		rightWingWheelModel[22].rotateAngleZ = 0.39269908F;

		rightWingWheelModel[23].addShapeBox(0F, 18F, 2F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		rightWingWheelModel[23].setRotationPoint(10F, -16F, 39F);
	}

	private void initbodyDoorOpenModel_1()
	{
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 156, 4, textureX, textureY); // Box 6
		bodyDoorOpenModel[1] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 8
		bodyDoorOpenModel[2] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 9
		bodyDoorOpenModel[3] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 10
		bodyDoorOpenModel[4] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 11
		bodyDoorOpenModel[5] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 12
		bodyDoorOpenModel[6] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 13
		bodyDoorOpenModel[7] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 14

		bodyDoorOpenModel[0].addShapeBox(0F, 0F, 0F, 150, 300, 1, 0F,0F, 0F, 0F, -144F, 0F, 0F, -144F, 0F, 0F, 0F, 0F, 0F, 0F, -288F, 0F, -144F, -288F, 0F, -144F, -288F, 0F, 0F, -288F, 0F); // Box 6
		bodyDoorOpenModel[0].setRotationPoint(-80F, -32F, -9.75F);
		bodyDoorOpenModel[0].rotateAngleY = -3.14159265F;

		bodyDoorOpenModel[1].addShapeBox(-1F, 0F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyDoorOpenModel[1].setRotationPoint(-77F, -32F, -7.5F);
		bodyDoorOpenModel[1].rotateAngleX = -0.29670597F;

		bodyDoorOpenModel[2].addShapeBox(-0.5F, 2F, -0.5F, 1, 27, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyDoorOpenModel[2].setRotationPoint(-77F, -32F, -7.5F);
		bodyDoorOpenModel[2].rotateAngleX = -0.29670597F;

		bodyDoorOpenModel[3].addShapeBox(-2.5F, 8F, -1F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyDoorOpenModel[3].setRotationPoint(-77F, -30F, -7.5F);
		bodyDoorOpenModel[3].rotateAngleX = -0.29670597F;

		bodyDoorOpenModel[4].addShapeBox(-2.5F, 2F, -1F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyDoorOpenModel[4].setRotationPoint(-77F, -30F, -7.5F);
		bodyDoorOpenModel[4].rotateAngleX = -0.29670597F;

		bodyDoorOpenModel[5].addShapeBox(-2.5F, 14F, -1F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyDoorOpenModel[5].setRotationPoint(-77F, -30F, -7.5F);
		bodyDoorOpenModel[5].rotateAngleX = -0.29670597F;

		bodyDoorOpenModel[6].addShapeBox(0.5F, 20F, -1F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyDoorOpenModel[6].setRotationPoint(-77F, -30F, -7.5F);
		bodyDoorOpenModel[6].rotateAngleX = -0.29670597F;

		bodyDoorOpenModel[7].addShapeBox(-2.5F, 26F, -1F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyDoorOpenModel[7].setRotationPoint(-77F, -30F, -7.5F);
		bodyDoorOpenModel[7].rotateAngleX = -0.29670597F;
	}

	private void initbodyDoorCloseModel_1()
	{
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 561, 17, textureX, textureY); // Box 7

		bodyDoorCloseModel[0].addShapeBox(0F, 0F, 0F, 6, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyDoorCloseModel[0].setRotationPoint(-80F, -32F, -10.5F);
	}

	private void inithudModel_1()
	{
		hudModel[0] = new ModelRendererTurbo(this, 441, 289, textureX, textureY); // Box 876

		hudModel[0].addShapeBox(0F, -2F, -2F, 0, 25, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, -20F, -16F, 0F, -20F, -16F); // Box 876
		hudModel[0].setRotationPoint(-93F, -41F, 0F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[2][30];
		propellerModels[0] = makeProp1(37F, -42.5F, -24F);
		propellerModels[1] = makeProp2(37F, -42.5F, 24F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[30];
		prop[0] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[4] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[5] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[6] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[7] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[8] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[9] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[10] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[11] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[12] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[13] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[14] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[15] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[16] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[17] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[18] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[19] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[20] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[21] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[22] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[23] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[24] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[25] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[26] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[27] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[28] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[29] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[0].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[1].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[2].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[3].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[4].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[5].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[6].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[7].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[8].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[9].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[10].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[11].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[12].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[13].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[14].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[15].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[16].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[17].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[18].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[19].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[20].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[21].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[22].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[23].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[24].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[25].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[26].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[27].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[28].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[29].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[3].setRotationPoint(i, j, k);
		prop[4].setRotationPoint(i, j, k);
		prop[5].setRotationPoint(i, j, k);
		prop[6].setRotationPoint(i, j, k);
		prop[7].setRotationPoint(i, j, k);
		prop[8].setRotationPoint(i, j, k);
		prop[9].setRotationPoint(i, j, k);
		prop[10].setRotationPoint(i, j, k);
		prop[11].setRotationPoint(i, j, k);
		prop[12].setRotationPoint(i, j, k);
		prop[13].setRotationPoint(i, j, k);
		prop[14].setRotationPoint(i, j, k);
		prop[15].setRotationPoint(i, j, k);
		prop[16].setRotationPoint(i, j, k);
		prop[17].setRotationPoint(i, j, k);
		prop[18].setRotationPoint(i, j, k);
		prop[19].setRotationPoint(i, j, k);
		prop[20].setRotationPoint(i, j, k);
		prop[21].setRotationPoint(i, j, k);
		prop[22].setRotationPoint(i, j, k);
		prop[23].setRotationPoint(i, j, k);
		prop[24].setRotationPoint(i, j, k);
		prop[25].setRotationPoint(i, j, k);
		prop[26].setRotationPoint(i, j, k);
		prop[27].setRotationPoint(i, j, k);
		prop[28].setRotationPoint(i, j, k);
		prop[29].setRotationPoint(i, j, k);
		prop[0].rotateAngleY = 0.05235988F;
		prop[1].rotateAngleY = 0.05235988F;
		prop[2].rotateAngleY = 0.05235988F;
		prop[3].rotateAngleY = 0.05235988F;
		prop[4].rotateAngleY = 0.05235988F;
		prop[5].rotateAngleY = 0.05235988F;
		prop[6].rotateAngleY = 0.05235988F;
		prop[7].rotateAngleY = 0.05235988F;
		prop[8].rotateAngleY = 0.05235988F;
		prop[9].rotateAngleY = 0.05235988F;
		prop[10].rotateAngleY = 0.05235988F;
		prop[11].rotateAngleY = 0.05235988F;
		prop[12].rotateAngleY = 0.05235988F;
		prop[13].rotateAngleY = 0.05235988F;
		prop[14].rotateAngleY = 0.05235988F;
		prop[15].rotateAngleY = 0.05235988F;
		prop[16].rotateAngleY = 0.05235988F;
		prop[17].rotateAngleY = 0.05235988F;
		prop[18].rotateAngleY = 0.05235988F;
		prop[19].rotateAngleY = 0.05235988F;
		prop[20].rotateAngleY = 0.05235988F;
		prop[21].rotateAngleY = 0.05235988F;
		prop[22].rotateAngleY = 0.05235988F;
		prop[23].rotateAngleY = 0.05235988F;
		prop[24].rotateAngleY = 0.05235988F;
		prop[25].rotateAngleY = 0.05235988F;
		prop[26].rotateAngleY = 0.05235988F;
		prop[27].rotateAngleY = 0.05235988F;
		prop[28].rotateAngleY = 0.05235988F;
		prop[29].rotateAngleY = 0.05235988F;
		return prop;
	}

	private ModelRendererTurbo[] makeProp2(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[30];
		prop[0] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[4] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[5] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[6] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[7] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[8] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[9] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[10] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[11] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[12] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[13] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[14] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[15] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[16] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[17] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[18] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[19] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[20] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[21] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[22] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[23] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[24] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[25] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[26] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[27] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[28] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[29] = new ModelRendererTurbo(this, 28, 400, textureX, textureY);
		prop[0].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[1].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[2].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[3].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[4].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[5].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[6].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[7].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[8].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[9].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[10].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[11].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[12].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[13].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[14].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[15].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[16].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[17].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[18].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[19].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[20].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[21].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[22].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[23].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[24].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[25].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[26].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[27].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[28].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[29].addBox(-0.5F, -10F, -0.5F, 1, 10, 1, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[3].setRotationPoint(i, j, k);
		prop[4].setRotationPoint(i, j, k);
		prop[5].setRotationPoint(i, j, k);
		prop[6].setRotationPoint(i, j, k);
		prop[7].setRotationPoint(i, j, k);
		prop[8].setRotationPoint(i, j, k);
		prop[9].setRotationPoint(i, j, k);
		prop[10].setRotationPoint(i, j, k);
		prop[11].setRotationPoint(i, j, k);
		prop[12].setRotationPoint(i, j, k);
		prop[13].setRotationPoint(i, j, k);
		prop[14].setRotationPoint(i, j, k);
		prop[15].setRotationPoint(i, j, k);
		prop[16].setRotationPoint(i, j, k);
		prop[17].setRotationPoint(i, j, k);
		prop[18].setRotationPoint(i, j, k);
		prop[19].setRotationPoint(i, j, k);
		prop[20].setRotationPoint(i, j, k);
		prop[21].setRotationPoint(i, j, k);
		prop[22].setRotationPoint(i, j, k);
		prop[23].setRotationPoint(i, j, k);
		prop[24].setRotationPoint(i, j, k);
		prop[25].setRotationPoint(i, j, k);
		prop[26].setRotationPoint(i, j, k);
		prop[27].setRotationPoint(i, j, k);
		prop[28].setRotationPoint(i, j, k);
		prop[29].setRotationPoint(i, j, k);
		prop[0].rotateAngleY = 0.05235988F;
		prop[1].rotateAngleY = 0.05235988F;
		prop[2].rotateAngleY = 0.05235988F;
		prop[3].rotateAngleY = 0.05235988F;
		prop[4].rotateAngleY = 0.05235988F;
		prop[5].rotateAngleY = 0.05235988F;
		prop[6].rotateAngleY = 0.05235988F;
		prop[7].rotateAngleY = 0.05235988F;
		prop[8].rotateAngleY = 0.05235988F;
		prop[9].rotateAngleY = 0.05235988F;
		prop[10].rotateAngleY = 0.05235988F;
		prop[11].rotateAngleY = 0.05235988F;
		prop[12].rotateAngleY = 0.05235988F;
		prop[13].rotateAngleY = 0.05235988F;
		prop[14].rotateAngleY = 0.05235988F;
		prop[15].rotateAngleY = 0.05235988F;
		prop[16].rotateAngleY = 0.05235988F;
		prop[17].rotateAngleY = 0.05235988F;
		prop[18].rotateAngleY = 0.05235988F;
		prop[19].rotateAngleY = 0.05235988F;
		prop[20].rotateAngleY = 0.05235988F;
		prop[21].rotateAngleY = 0.05235988F;
		prop[22].rotateAngleY = 0.05235988F;
		prop[23].rotateAngleY = 0.05235988F;
		prop[24].rotateAngleY = 0.05235988F;
		prop[25].rotateAngleY = 0.05235988F;
		prop[26].rotateAngleY = 0.05235988F;
		prop[27].rotateAngleY = 0.05235988F;
		prop[28].rotateAngleY = 0.05235988F;
		prop[29].rotateAngleY = 0.05235988F;
		return prop;
	}
}