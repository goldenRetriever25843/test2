//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SpatiasI
// Model Creator: 
// Created on: 18.12.2016 - 21:53:00
// Last changed on: 18.12.2016 - 21:53:00

package com.flansmod.client.model.Aoba; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelP44 extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelP44() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[231];
		turretModel = new ModelRendererTurbo[15];
		barrelModel = new ModelRendererTurbo[19];
		leftTrackWheelModels = new ModelRendererTurbo[6];
		rightTrackWheelModels = new ModelRendererTurbo[76];
		leftTrackModel = new ModelRendererTurbo[10];
		rightTrackModel = new ModelRendererTurbo[12];

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
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		bodyModel[1] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Import Box0
		bodyModel[2] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Import Box4
		bodyModel[3] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Import Box6
		bodyModel[4] = new ModelRendererTurbo(this, 689, 121, textureX, textureY); // Import Box7
		bodyModel[5] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import Box8
		bodyModel[6] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Import Box9
		bodyModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box10
		bodyModel[8] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Import Box11
		bodyModel[9] = new ModelRendererTurbo(this, 689, 145, textureX, textureY); // Import Box12
		bodyModel[10] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Import Box13
		bodyModel[11] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Import Box14
		bodyModel[12] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Import Box15
		bodyModel[13] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Import Box16
		bodyModel[14] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Import Box17
		bodyModel[15] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Import Box18
		bodyModel[16] = new ModelRendererTurbo(this, 265, 233, textureX, textureY); // Import Box19
		bodyModel[17] = new ModelRendererTurbo(this, 465, 233, textureX, textureY); // Import Box20
		bodyModel[18] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Box21
		bodyModel[19] = new ModelRendererTurbo(this, 849, 25, textureX, textureY); // Import Box22
		bodyModel[20] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Import Box26
		bodyModel[21] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Import Box27
		bodyModel[22] = new ModelRendererTurbo(this, 1009, 17, textureX, textureY); // Import Box28
		bodyModel[23] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Box29
		bodyModel[24] = new ModelRendererTurbo(this, 937, 25, textureX, textureY); // Import Box30
		bodyModel[25] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Import Box31
		bodyModel[26] = new ModelRendererTurbo(this, 969, 25, textureX, textureY); // Import Box32
		bodyModel[27] = new ModelRendererTurbo(this, 993, 33, textureX, textureY); // Import Box33
		bodyModel[28] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Import Box34
		bodyModel[29] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Import Box35
		bodyModel[30] = new ModelRendererTurbo(this, 953, 41, textureX, textureY); // Import Box36
		bodyModel[31] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import Box37
		bodyModel[32] = new ModelRendererTurbo(this, 849, 25, textureX, textureY); // Import Box38
		bodyModel[33] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Import Box39
		bodyModel[34] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Import Box40
		bodyModel[35] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Import Box44
		bodyModel[36] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Import Box45
		bodyModel[37] = new ModelRendererTurbo(this, 849, 49, textureX, textureY); // Import Box46
		bodyModel[38] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Import Box47
		bodyModel[39] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box48
		bodyModel[40] = new ModelRendererTurbo(this, 897, 49, textureX, textureY); // Import Box50
		bodyModel[41] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Import Box51
		bodyModel[42] = new ModelRendererTurbo(this, 985, 49, textureX, textureY); // Import Box52
		bodyModel[43] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Import Box53
		bodyModel[44] = new ModelRendererTurbo(this, 929, 49, textureX, textureY); // Import Box54
		bodyModel[45] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Import Box55
		bodyModel[46] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Import Box56
		bodyModel[47] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Import Box57
		bodyModel[48] = new ModelRendererTurbo(this, 897, 57, textureX, textureY); // Import Box58
		bodyModel[49] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import Box59
		bodyModel[50] = new ModelRendererTurbo(this, 945, 57, textureX, textureY); // Import Box61
		bodyModel[51] = new ModelRendererTurbo(this, 601, 249, textureX, textureY); // Import Box208
		bodyModel[52] = new ModelRendererTurbo(this, 993, 81, textureX, textureY); // Import Box20
		bodyModel[53] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Import Box21
		bodyModel[54] = new ModelRendererTurbo(this, 1001, 57, textureX, textureY); // Import Box22
		bodyModel[55] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Import Box23
		bodyModel[56] = new ModelRendererTurbo(this, 553, 121, textureX, textureY); // Import Box24
		bodyModel[57] = new ModelRendererTurbo(this, 945, 73, textureX, textureY); // Import Box25
		bodyModel[58] = new ModelRendererTurbo(this, 993, 129, textureX, textureY); // Import Box26
		bodyModel[59] = new ModelRendererTurbo(this, 1009, 89, textureX, textureY); // Import Box27
		bodyModel[60] = new ModelRendererTurbo(this, 433, 145, textureX, textureY); // Import Box28
		bodyModel[61] = new ModelRendererTurbo(this, 889, 121, textureX, textureY); // Import Box29
		bodyModel[62] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Import Box30
		bodyModel[63] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Import Box31
		bodyModel[64] = new ModelRendererTurbo(this, 505, 153, textureX, textureY); // Import Box32
		bodyModel[65] = new ModelRendererTurbo(this, 897, 153, textureX, textureY); // Import Box33
		bodyModel[66] = new ModelRendererTurbo(this, 937, 153, textureX, textureY); // Import Box34
		bodyModel[67] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Import Box35
		bodyModel[68] = new ModelRendererTurbo(this, 753, 145, textureX, textureY); // Import Box36
		bodyModel[69] = new ModelRendererTurbo(this, 233, 137, textureX, textureY); // Import Box42
		bodyModel[70] = new ModelRendererTurbo(this, 977, 105, textureX, textureY); // Import Box44
		bodyModel[71] = new ModelRendererTurbo(this, 201, 169, textureX, textureY); // Import Box45
		bodyModel[72] = new ModelRendererTurbo(this, 689, 169, textureX, textureY); // Import Box49
		bodyModel[73] = new ModelRendererTurbo(this, 721, 169, textureX, textureY); // Import Box50
		bodyModel[74] = new ModelRendererTurbo(this, 393, 121, textureX, textureY); // Import Box51
		bodyModel[75] = new ModelRendererTurbo(this, 393, 145, textureX, textureY); // Import Box52
		bodyModel[76] = new ModelRendererTurbo(this, 897, 169, textureX, textureY); // Import Box53
		bodyModel[77] = new ModelRendererTurbo(this, 1009, 145, textureX, textureY); // Import Box54
		bodyModel[78] = new ModelRendererTurbo(this, 929, 169, textureX, textureY); // Import Box55
		bodyModel[79] = new ModelRendererTurbo(this, 961, 169, textureX, textureY); // Import Box56
		bodyModel[80] = new ModelRendererTurbo(this, 201, 177, textureX, textureY); // Import Box57
		bodyModel[81] = new ModelRendererTurbo(this, 713, 297, textureX, textureY); // Import Box67
		bodyModel[82] = new ModelRendererTurbo(this, 1, 305, textureX, textureY); // Import Box68
		bodyModel[83] = new ModelRendererTurbo(this, 529, 177, textureX, textureY); // Import Box6
		bodyModel[84] = new ModelRendererTurbo(this, 689, 177, textureX, textureY); // Import Box6
		bodyModel[85] = new ModelRendererTurbo(this, 265, 305, textureX, textureY); // Import Box1
		bodyModel[86] = new ModelRendererTurbo(this, 849, 297, textureX, textureY); // Import Box3
		bodyModel[87] = new ModelRendererTurbo(this, 1, 305, textureX, textureY); // Import Box6
		bodyModel[88] = new ModelRendererTurbo(this, 457, 193, textureX, textureY); // Import Box293
		bodyModel[89] = new ModelRendererTurbo(this, 561, 177, textureX, textureY); // Import Box294
		bodyModel[90] = new ModelRendererTurbo(this, 497, 193, textureX, textureY); // Import Box295
		bodyModel[91] = new ModelRendererTurbo(this, 689, 177, textureX, textureY); // Import Box296
		bodyModel[92] = new ModelRendererTurbo(this, 753, 193, textureX, textureY); // Import Box297
		bodyModel[93] = new ModelRendererTurbo(this, 1009, 177, textureX, textureY); // Import Box298
		bodyModel[94] = new ModelRendererTurbo(this, 65, 209, textureX, textureY); // Import Box299
		bodyModel[95] = new ModelRendererTurbo(this, 393, 193, textureX, textureY); // Import Box300
		bodyModel[96] = new ModelRendererTurbo(this, 145, 209, textureX, textureY); // Import Box301
		bodyModel[97] = new ModelRendererTurbo(this, 945, 217, textureX, textureY); // Import Box302
		bodyModel[98] = new ModelRendererTurbo(this, 897, 225, textureX, textureY); // Import Box303
		bodyModel[99] = new ModelRendererTurbo(this, 721, 177, textureX, textureY); // Import Box304
		bodyModel[100] = new ModelRendererTurbo(this, 969, 225, textureX, textureY); // Import Box305
		bodyModel[101] = new ModelRendererTurbo(this, 1001, 225, textureX, textureY); // Import Box306
		bodyModel[102] = new ModelRendererTurbo(this, 929, 249, textureX, textureY); // Import Box307
		bodyModel[103] = new ModelRendererTurbo(this, 969, 281, textureX, textureY); // Import Box308
		bodyModel[104] = new ModelRendererTurbo(this, 745, 297, textureX, textureY); // Import Box309
		bodyModel[105] = new ModelRendererTurbo(this, 569, 137, textureX, textureY); // Import Box310
		bodyModel[106] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Import Box311
		bodyModel[107] = new ModelRendererTurbo(this, 257, 145, textureX, textureY); // Import Box318
		bodyModel[108] = new ModelRendererTurbo(this, 449, 233, textureX, textureY); // Import Box319
		bodyModel[109] = new ModelRendererTurbo(this, 513, 201, textureX, textureY); // Import Box320
		bodyModel[110] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Import Box321
		bodyModel[111] = new ModelRendererTurbo(this, 777, 249, textureX, textureY); // Import Box322
		bodyModel[112] = new ModelRendererTurbo(this, 841, 249, textureX, textureY); // Import Box323
		bodyModel[113] = new ModelRendererTurbo(this, 673, 233, textureX, textureY); // Import Box324
		bodyModel[114] = new ModelRendererTurbo(this, 889, 249, textureX, textureY); // Import Box325
		bodyModel[115] = new ModelRendererTurbo(this, 745, 249, textureX, textureY); // Import Box326
		bodyModel[116] = new ModelRendererTurbo(this, 505, 257, textureX, textureY); // Import Box327
		bodyModel[117] = new ModelRendererTurbo(this, 177, 441, textureX, textureY); // Import Box328
		bodyModel[118] = new ModelRendererTurbo(this, 313, 441, textureX, textureY); // Import Box335
		bodyModel[119] = new ModelRendererTurbo(this, 137, 329, textureX, textureY); // Import Box336
		bodyModel[120] = new ModelRendererTurbo(this, 505, 449, textureX, textureY); // Import Box337
		bodyModel[121] = new ModelRendererTurbo(this, 849, 337, textureX, textureY); // Import Box339
		bodyModel[122] = new ModelRendererTurbo(this, 529, 305, textureX, textureY); // Import Box340
		bodyModel[123] = new ModelRendererTurbo(this, 649, 449, textureX, textureY); // Import Box341
		bodyModel[124] = new ModelRendererTurbo(this, 313, 529, textureX, textureY); // Import Box7
		bodyModel[125] = new ModelRendererTurbo(this, 849, 385, textureX, textureY); // Import Box8
		bodyModel[126] = new ModelRendererTurbo(this, 441, 553, textureX, textureY); // Import Box9
		bodyModel[127] = new ModelRendererTurbo(this, 593, 305, textureX, textureY); // Import Box10
		bodyModel[128] = new ModelRendererTurbo(this, 745, 313, textureX, textureY); // Import Box11
		bodyModel[129] = new ModelRendererTurbo(this, 785, 321, textureX, textureY); // Import Box13
		bodyModel[130] = new ModelRendererTurbo(this, 673, 553, textureX, textureY); // Import Box14
		bodyModel[131] = new ModelRendererTurbo(this, 129, 457, textureX, textureY); // Import Box15
		bodyModel[132] = new ModelRendererTurbo(this, 1, 577, textureX, textureY); // Import Box16
		bodyModel[133] = new ModelRendererTurbo(this, 625, 401, textureX, textureY); // Import Box17
		bodyModel[134] = new ModelRendererTurbo(this, 233, 577, textureX, textureY); // Import Box18
		bodyModel[135] = new ModelRendererTurbo(this, 497, 577, textureX, textureY); // Import Box19
		bodyModel[136] = new ModelRendererTurbo(this, 697, 577, textureX, textureY); // Import Box20
		bodyModel[137] = new ModelRendererTurbo(this, 529, 353, textureX, textureY); // Import Box21
		bodyModel[138] = new ModelRendererTurbo(this, 161, 481, textureX, textureY); // Import Box22
		bodyModel[139] = new ModelRendererTurbo(this, 129, 529, textureX, textureY); // Import Box3
		bodyModel[140] = new ModelRendererTurbo(this, 881, 505, textureX, textureY); // Import Box336
		bodyModel[141] = new ModelRendererTurbo(this, 1, 601, textureX, textureY); // Import Box337
		bodyModel[142] = new ModelRendererTurbo(this, 209, 601, textureX, textureY); // Import Box339
		bodyModel[143] = new ModelRendererTurbo(this, 953, 409, textureX, textureY); // Import Box340
		bodyModel[144] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Import Box26
		bodyModel[145] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Import Box27
		bodyModel[146] = new ModelRendererTurbo(this, 1009, 17, textureX, textureY); // Import Box28
		bodyModel[147] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Box29
		bodyModel[148] = new ModelRendererTurbo(this, 937, 25, textureX, textureY); // Import Box30
		bodyModel[149] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Import Box31
		bodyModel[150] = new ModelRendererTurbo(this, 969, 25, textureX, textureY); // Import Box32
		bodyModel[151] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Import Box34
		bodyModel[152] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Import Box35
		bodyModel[153] = new ModelRendererTurbo(this, 953, 41, textureX, textureY); // Import Box36
		bodyModel[154] = new ModelRendererTurbo(this, 849, 25, textureX, textureY); // Import Box38
		bodyModel[155] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Import Box39
		bodyModel[156] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Import Box40
		bodyModel[157] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Import Box44
		bodyModel[158] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Import Box45
		bodyModel[159] = new ModelRendererTurbo(this, 849, 49, textureX, textureY); // Import Box46
		bodyModel[160] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Import Box47
		bodyModel[161] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box48
		bodyModel[162] = new ModelRendererTurbo(this, 897, 49, textureX, textureY); // Import Box50
		bodyModel[163] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Import Box51
		bodyModel[164] = new ModelRendererTurbo(this, 985, 49, textureX, textureY); // Import Box52
		bodyModel[165] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Import Box53
		bodyModel[166] = new ModelRendererTurbo(this, 929, 49, textureX, textureY); // Import Box54
		bodyModel[167] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Import Box55
		bodyModel[168] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Import Box56
		bodyModel[169] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Import Box57
		bodyModel[170] = new ModelRendererTurbo(this, 897, 57, textureX, textureY); // Import Box58
		bodyModel[171] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import Box59
		bodyModel[172] = new ModelRendererTurbo(this, 945, 57, textureX, textureY); // Import Box61
		bodyModel[173] = new ModelRendererTurbo(this, 993, 81, textureX, textureY); // Import Box20
		bodyModel[174] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Import Box21
		bodyModel[175] = new ModelRendererTurbo(this, 1001, 57, textureX, textureY); // Import Box22
		bodyModel[176] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Import Box23
		bodyModel[177] = new ModelRendererTurbo(this, 553, 121, textureX, textureY); // Import Box24
		bodyModel[178] = new ModelRendererTurbo(this, 945, 73, textureX, textureY); // Import Box25
		bodyModel[179] = new ModelRendererTurbo(this, 993, 129, textureX, textureY); // Import Box26
		bodyModel[180] = new ModelRendererTurbo(this, 1009, 89, textureX, textureY); // Import Box27
		bodyModel[181] = new ModelRendererTurbo(this, 433, 145, textureX, textureY); // Import Box28
		bodyModel[182] = new ModelRendererTurbo(this, 889, 121, textureX, textureY); // Import Box29
		bodyModel[183] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Import Box30
		bodyModel[184] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Import Box31
		bodyModel[185] = new ModelRendererTurbo(this, 505, 153, textureX, textureY); // Import Box32
		bodyModel[186] = new ModelRendererTurbo(this, 897, 153, textureX, textureY); // Import Box33
		bodyModel[187] = new ModelRendererTurbo(this, 937, 153, textureX, textureY); // Import Box34
		bodyModel[188] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Import Box35
		bodyModel[189] = new ModelRendererTurbo(this, 753, 145, textureX, textureY); // Import Box36
		bodyModel[190] = new ModelRendererTurbo(this, 233, 137, textureX, textureY); // Import Box42
		bodyModel[191] = new ModelRendererTurbo(this, 977, 105, textureX, textureY); // Import Box44
		bodyModel[192] = new ModelRendererTurbo(this, 201, 169, textureX, textureY); // Import Box45
		bodyModel[193] = new ModelRendererTurbo(this, 689, 169, textureX, textureY); // Import Box49
		bodyModel[194] = new ModelRendererTurbo(this, 721, 169, textureX, textureY); // Import Box50
		bodyModel[195] = new ModelRendererTurbo(this, 393, 121, textureX, textureY); // Import Box51
		bodyModel[196] = new ModelRendererTurbo(this, 393, 145, textureX, textureY); // Import Box52
		bodyModel[197] = new ModelRendererTurbo(this, 897, 169, textureX, textureY); // Import Box53
		bodyModel[198] = new ModelRendererTurbo(this, 1009, 145, textureX, textureY); // Import Box54
		bodyModel[199] = new ModelRendererTurbo(this, 929, 169, textureX, textureY); // Import Box55
		bodyModel[200] = new ModelRendererTurbo(this, 961, 169, textureX, textureY); // Import Box56
		bodyModel[201] = new ModelRendererTurbo(this, 201, 177, textureX, textureY); // Import Box57
		bodyModel[202] = new ModelRendererTurbo(this, 457, 193, textureX, textureY); // Import Box293
		bodyModel[203] = new ModelRendererTurbo(this, 561, 177, textureX, textureY); // Import Box294
		bodyModel[204] = new ModelRendererTurbo(this, 497, 193, textureX, textureY); // Import Box295
		bodyModel[205] = new ModelRendererTurbo(this, 689, 177, textureX, textureY); // Import Box296
		bodyModel[206] = new ModelRendererTurbo(this, 753, 193, textureX, textureY); // Import Box297
		bodyModel[207] = new ModelRendererTurbo(this, 1009, 177, textureX, textureY); // Import Box298
		bodyModel[208] = new ModelRendererTurbo(this, 65, 209, textureX, textureY); // Import Box299
		bodyModel[209] = new ModelRendererTurbo(this, 393, 193, textureX, textureY); // Import Box300
		bodyModel[210] = new ModelRendererTurbo(this, 145, 209, textureX, textureY); // Import Box301
		bodyModel[211] = new ModelRendererTurbo(this, 945, 217, textureX, textureY); // Import Box302
		bodyModel[212] = new ModelRendererTurbo(this, 897, 225, textureX, textureY); // Import Box303
		bodyModel[213] = new ModelRendererTurbo(this, 721, 177, textureX, textureY); // Import Box304
		bodyModel[214] = new ModelRendererTurbo(this, 969, 225, textureX, textureY); // Import Box305
		bodyModel[215] = new ModelRendererTurbo(this, 1001, 225, textureX, textureY); // Import Box306
		bodyModel[216] = new ModelRendererTurbo(this, 929, 249, textureX, textureY); // Import Box307
		bodyModel[217] = new ModelRendererTurbo(this, 969, 281, textureX, textureY); // Import Box308
		bodyModel[218] = new ModelRendererTurbo(this, 745, 297, textureX, textureY); // Import Box309
		bodyModel[219] = new ModelRendererTurbo(this, 569, 137, textureX, textureY); // Import Box310
		bodyModel[220] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Import Box311
		bodyModel[221] = new ModelRendererTurbo(this, 257, 145, textureX, textureY); // Import Box318
		bodyModel[222] = new ModelRendererTurbo(this, 449, 233, textureX, textureY); // Import Box319
		bodyModel[223] = new ModelRendererTurbo(this, 513, 201, textureX, textureY); // Import Box320
		bodyModel[224] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Import Box321
		bodyModel[225] = new ModelRendererTurbo(this, 777, 249, textureX, textureY); // Import Box322
		bodyModel[226] = new ModelRendererTurbo(this, 841, 249, textureX, textureY); // Import Box323
		bodyModel[227] = new ModelRendererTurbo(this, 673, 233, textureX, textureY); // Import Box324
		bodyModel[228] = new ModelRendererTurbo(this, 889, 249, textureX, textureY); // Import Box325
		bodyModel[229] = new ModelRendererTurbo(this, 745, 249, textureX, textureY); // Import Box326
		bodyModel[230] = new ModelRendererTurbo(this, 505, 257, textureX, textureY); // Import Box327

		bodyModel[0].addBox(-2F, -2F, 0F, 39, 36, 92, 0F); // Import Box0
		bodyModel[0].setRotationPoint(45F, -49F, -46F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 244, 23, 92, 0F,21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		bodyModel[1].setRotationPoint(-140F, -15F, -46F);

		bodyModel[2].addShapeBox(-2F, -2F, 0F, 61, 19, 92, 0F,0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Import Box4
		bodyModel[2].setRotationPoint(97F, -32F, -46F);

		bodyModel[3].addShapeBox(-2F, -2F, 0F, 53, 16, 92, 0F,0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F); // Import Box6
		bodyModel[3].setRotationPoint(106F, -6F, -46F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 95, 19, 2, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -5F, -4F, 0F, -5F, -4F, 0F, 0F, 0F, 0F); // Import Box7
		bodyModel[4].setRotationPoint(58F, -32F, -67F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 80, 19, 2, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Import Box8
		bodyModel[5].setRotationPoint(-22F, -28F, -67F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 112, 19, 2, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -4F, 0F); // Import Box9
		bodyModel[6].setRotationPoint(-134F, -21F, -67F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 34, 17, 2, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, -11F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -11F, -7F, 0F); // Import Box10
		bodyModel[7].setRotationPoint(-168F, -16F, -67F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 14, 15, 2, 0F,-5F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F); // Import Box11
		bodyModel[8].setRotationPoint(148F, -32F, -67F);

		bodyModel[9].addShapeBox(-2F, -2F, 0F, 55, 7, 92, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Import Box12
		bodyModel[9].setRotationPoint(106F, -13F, -46F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 14, 15, 2, 0F,-5F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F); // Import Box13
		bodyModel[10].setRotationPoint(148F, -32F, -48F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 95, 19, 2, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -5F, -4F, 0F, -5F, -4F, 0F, 0F, 0F, 0F); // Import Box14
		bodyModel[11].setRotationPoint(58F, -32F, -48F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 80, 19, 2, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Import Box15
		bodyModel[12].setRotationPoint(-22F, -28F, -48F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 112, 19, 2, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -4F, 0F); // Import Box16
		bodyModel[13].setRotationPoint(-134F, -21F, -48F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 34, 17, 2, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, -11F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -11F, -7F, 0F); // Import Box17
		bodyModel[14].setRotationPoint(-168F, -16F, -48F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 112, 6, 17, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -4F, 0F); // Import Box18
		bodyModel[15].setRotationPoint(-134F, -21F, -65F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 80, 6, 17, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Import Box19
		bodyModel[16].setRotationPoint(-22F, -28F, -65F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 95, 6, 17, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -5F, -4F, 0F, -5F, -4F, 0F, 0F, 0F, 0F); // Import Box20
		bodyModel[17].setRotationPoint(58F, -32F, -65F);

		bodyModel[18].addBox(0F, 0F, 0F, 11, 2, 17, 0F); // Import Box21
		bodyModel[18].setRotationPoint(153F, -32F, -65F);
		bodyModel[18].rotateAngleZ = -0.57595865F;

		bodyModel[19].addShapeBox(0F, 0F, 0F, 34, 6, 17, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, -11F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -11F, -7F, 0F); // Import Box22
		bodyModel[19].setRotationPoint(-168F, -16F, -65F);

		bodyModel[20].addBox(0F, 0F, 0F, 10, 9, 2, 0F); // Import Box26
		bodyModel[20].setRotationPoint(-94F, -1F, -52F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box27
		bodyModel[21].setRotationPoint(-84F, -1F, -52F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box28
		bodyModel[22].setRotationPoint(-99F, -1F, -52F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box29
		bodyModel[23].setRotationPoint(-99F, -1F, -61F);

		bodyModel[24].addBox(0F, 0F, 0F, 10, 9, 2, 0F); // Import Box30
		bodyModel[24].setRotationPoint(-94F, -1F, -61F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box31
		bodyModel[25].setRotationPoint(-84F, -1F, -61F);

		bodyModel[26].addBox(0F, 0F, 0F, 5, 7, 7, 0F); // Import Box32
		bodyModel[26].setRotationPoint(-101F, 0F, -59F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 7, 7, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box33
		bodyModel[27].setRotationPoint(-96F, 0F, -59F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 5, 7, 0F,0F, 0F, 0F, 7F, 7F, 0F, 7F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, -5F, 0F, 7F, -5F, 0F, 0F, 0F, 0F); // Import Box34
		bodyModel[28].setRotationPoint(-110F, 7F, -59F);

		bodyModel[29].addShapeBox(24F, 0F, 0F, 2, 5, 7, 0F,7F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 7F, 0F, 7F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, -5F, 0F); // Import Box35
		bodyModel[29].setRotationPoint(-94F, 7F, -59F);

		bodyModel[30].addBox(0F, 0F, 0F, 5, 7, 7, 0F); // Import Box36
		bodyModel[30].setRotationPoint(-82F, 0F, -59F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 7, 7, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box37
		bodyModel[31].setRotationPoint(-85F, 0F, -59F);

		bodyModel[32].addBox(0F, 0F, 0F, 3, 9, 3, 0F); // Import Box38
		bodyModel[32].setRotationPoint(-70F, 8F, -62F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box39
		bodyModel[33].setRotationPoint(-67F, 13F, -62F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box40
		bodyModel[34].setRotationPoint(-80F, 13F, -62F);

		bodyModel[35].addBox(0F, 0F, 0F, 13, 6, 4, 0F); // Import Box44
		bodyModel[35].setRotationPoint(-96F, -8F, -57F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 18, 6, 4, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box45
		bodyModel[36].setRotationPoint(-83F, -8F, -57F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 18, 6, 4, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box46
		bodyModel[37].setRotationPoint(-114F, -8F, -57F);

		bodyModel[38].addBox(0F, 0F, 0F, 4, 7, 4, 0F); // Import Box47
		bodyModel[38].setRotationPoint(-68F, 1F, -57F);

		bodyModel[39].addBox(0F, 0F, 0F, 2, 12, 2, 0F); // Import Box48
		bodyModel[39].setRotationPoint(-67F, -2F, -56F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box50
		bodyModel[40].setRotationPoint(-67F, 13F, -53F);

		bodyModel[41].addBox(0F, 0F, 0F, 3, 9, 3, 0F); // Import Box51
		bodyModel[41].setRotationPoint(-70F, 8F, -53F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box52
		bodyModel[42].setRotationPoint(-80F, 13F, -53F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box53
		bodyModel[43].setRotationPoint(-108F, 13F, -53F);

		bodyModel[44].addBox(0F, 0F, 0F, 3, 9, 3, 0F); // Import Box54
		bodyModel[44].setRotationPoint(-111F, 8F, -53F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box55
		bodyModel[45].setRotationPoint(-121F, 13F, -53F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box56
		bodyModel[46].setRotationPoint(-108F, 13F, -62F);

		bodyModel[47].addBox(0F, 0F, 0F, 3, 9, 3, 0F); // Import Box57
		bodyModel[47].setRotationPoint(-111F, 8F, -62F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box58
		bodyModel[48].setRotationPoint(-121F, 13F, -62F);

		bodyModel[49].addBox(0F, 0F, 0F, 2, 12, 2, 0F); // Import Box59
		bodyModel[49].setRotationPoint(-114F, -2F, -56F);

		bodyModel[50].addBox(0F, 0F, 0F, 4, 7, 4, 0F); // Import Box61
		bodyModel[50].setRotationPoint(-115F, 1F, -57F);

		bodyModel[51].addShapeBox(-2F, -2F, 0F, 25, 36, 92, 0F,-12F, 0F, 0F, 0F, -17F, 0F, 0F, -17F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box208
		bodyModel[51].setRotationPoint(72F, -49F, -46F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box20
		bodyModel[52].setRotationPoint(-36F, 13F, -62F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box21
		bodyModel[53].setRotationPoint(-23F, 13F, -62F);

		bodyModel[54].addBox(0F, 0F, 0F, 3, 9, 3, 0F); // Import Box22
		bodyModel[54].setRotationPoint(-26F, 8F, -62F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 5, 7, 0F,0F, 0F, 0F, 7F, 7F, 0F, 7F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, -5F, 0F, 7F, -5F, 0F, 0F, 0F, 0F); // Import Box23
		bodyModel[55].setRotationPoint(-25F, 7F, -59F);

		bodyModel[56].addBox(0F, 0F, 0F, 5, 7, 7, 0F); // Import Box24
		bodyModel[56].setRotationPoint(-16F, 0F, -59F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box25
		bodyModel[57].setRotationPoint(-14F, -1F, -61F);

		bodyModel[58].addBox(0F, 0F, 0F, 10, 9, 2, 0F); // Import Box26
		bodyModel[58].setRotationPoint(-9F, -1F, -61F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box27
		bodyModel[59].setRotationPoint(1F, -1F, -61F);

		bodyModel[60].addBox(0F, 0F, 0F, 5, 7, 7, 0F); // Import Box28
		bodyModel[60].setRotationPoint(3F, 0F, -59F);

		bodyModel[61].addShapeBox(24F, 0F, 0F, 2, 5, 7, 0F,7F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 7F, 0F, 7F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, -5F, 0F); // Import Box29
		bodyModel[61].setRotationPoint(-9F, 7F, -59F);

		bodyModel[62].addBox(0F, 0F, 0F, 4, 7, 4, 0F); // Import Box30
		bodyModel[62].setRotationPoint(17F, 1F, -57F);

		bodyModel[63].addBox(0F, 0F, 0F, 2, 12, 2, 0F); // Import Box31
		bodyModel[63].setRotationPoint(18F, -2F, -56F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 18, 6, 4, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box32
		bodyModel[64].setRotationPoint(2F, -8F, -57F);

		bodyModel[65].addBox(0F, 0F, 0F, 13, 6, 4, 0F); // Import Box33
		bodyModel[65].setRotationPoint(-11F, -8F, -57F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 18, 6, 4, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box34
		bodyModel[66].setRotationPoint(-29F, -8F, -57F);

		bodyModel[67].addBox(0F, 0F, 0F, 2, 12, 2, 0F); // Import Box35
		bodyModel[67].setRotationPoint(-29F, -2F, -56F);

		bodyModel[68].addBox(0F, 0F, 0F, 4, 7, 4, 0F); // Import Box36
		bodyModel[68].setRotationPoint(-30F, 1F, -57F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box42
		bodyModel[69].setRotationPoint(5F, 13F, -62F);

		bodyModel[70].addBox(0F, 0F, 0F, 3, 9, 3, 0F); // Import Box44
		bodyModel[70].setRotationPoint(15F, 8F, -62F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box45
		bodyModel[71].setRotationPoint(18F, 13F, -62F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box49
		bodyModel[72].setRotationPoint(18F, 13F, -53F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box50
		bodyModel[73].setRotationPoint(5F, 13F, -53F);

		bodyModel[74].addBox(0F, 0F, 0F, 3, 9, 3, 0F); // Import Box51
		bodyModel[74].setRotationPoint(15F, 8F, -53F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box52
		bodyModel[75].setRotationPoint(1F, -1F, -52F);

		bodyModel[76].addBox(0F, 0F, 0F, 10, 9, 2, 0F); // Import Box53
		bodyModel[76].setRotationPoint(-9F, -1F, -52F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box54
		bodyModel[77].setRotationPoint(-14F, -1F, -52F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box55
		bodyModel[78].setRotationPoint(-23F, 13F, -53F);

		bodyModel[79].addBox(0F, 0F, 0F, 3, 9, 3, 0F); // Import Box56
		bodyModel[79].setRotationPoint(-26F, 8F, -53F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box57
		bodyModel[80].setRotationPoint(-36F, 13F, -53F);

		bodyModel[81].addBox(0F, 0F, 0F, 4, 4, 124, 0F); // Import Box67
		bodyModel[81].setRotationPoint(-6F, 2F, -62F);

		bodyModel[82].addBox(0F, 0F, 0F, 4, 4, 124, 0F); // Import Box68
		bodyModel[82].setRotationPoint(-91F, 2F, -62F);

		bodyModel[83].addBox(-2F, -6F, -20.5F, 3, 10, 21, 0F); // Import Box6
		bodyModel[83].setRotationPoint(89F, -44F, 33.5F);
		bodyModel[83].rotateAngleZ = 0.71558499F;

		bodyModel[84].addShapeBox(-1F, 4F, -20.5F, 3, 8, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import Box6
		bodyModel[84].setRotationPoint(88F, -43F, 33.5F);
		bodyModel[84].rotateAngleZ = 0.78539816F;

		bodyModel[85].addBox(-2F, -2F, 0F, 84, 36, 92, 0F); // Import Box1
		bodyModel[85].setRotationPoint(-39F, -49F, -46F);

		bodyModel[86].addShapeBox(-2F, -2F, 0F, 64, 20, 15, 0F,0F, 0F, 0F, 0F, 8F, 0F, 0F, 16F, 0F, 0F, 8F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F); // Import Box3
		bodyModel[86].setRotationPoint(-153F, -33F, -46F);

		bodyModel[87].addBox(-2F, -6F, -20.5F, 3, 31, 35, 0F); // Import Box6
		bodyModel[87].setRotationPoint(53F, -52F, 25.5F);
		bodyModel[87].rotateAngleZ = 1.57079633F;

		bodyModel[88].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box293
		bodyModel[88].setRotationPoint(103F, 13F, -62F);

		bodyModel[89].addBox(0F, 0F, 0F, 3, 9, 3, 0F); // Import Box294
		bodyModel[89].setRotationPoint(100F, 8F, -62F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box295
		bodyModel[90].setRotationPoint(90F, 13F, -62F);

		bodyModel[91].addShapeBox(24F, 0F, 0F, 2, 5, 7, 0F,7F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 7F, 0F, 7F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, -5F, 0F); // Import Box296
		bodyModel[91].setRotationPoint(76F, 7F, -59F);

		bodyModel[92].addBox(0F, 0F, 0F, 5, 7, 7, 0F); // Import Box297
		bodyModel[92].setRotationPoint(88F, 0F, -59F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box298
		bodyModel[93].setRotationPoint(86F, -1F, -61F);

		bodyModel[94].addBox(0F, 0F, 0F, 10, 9, 2, 0F); // Import Box299
		bodyModel[94].setRotationPoint(76F, -1F, -61F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box300
		bodyModel[95].setRotationPoint(71F, -1F, -61F);

		bodyModel[96].addBox(0F, 0F, 0F, 5, 7, 7, 0F); // Import Box301
		bodyModel[96].setRotationPoint(69F, 0F, -59F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 5, 7, 0F,0F, 0F, 0F, 7F, 7F, 0F, 7F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, -5F, 0F, 7F, -5F, 0F, 0F, 0F, 0F); // Import Box302
		bodyModel[97].setRotationPoint(60F, 7F, -59F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box303
		bodyModel[98].setRotationPoint(49F, 13F, -62F);

		bodyModel[99].addBox(0F, 0F, 0F, 3, 9, 3, 0F); // Import Box304
		bodyModel[99].setRotationPoint(59F, 8F, -62F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box305
		bodyModel[100].setRotationPoint(62F, 13F, -62F);

		bodyModel[101].addBox(0F, 0F, 0F, 4, 7, 4, 0F); // Import Box306
		bodyModel[101].setRotationPoint(55F, 1F, -57F);

		bodyModel[102].addBox(0F, 0F, 0F, 13, 6, 4, 0F); // Import Box307
		bodyModel[102].setRotationPoint(74F, -8F, -57F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 18, 6, 4, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box308
		bodyModel[103].setRotationPoint(56F, -8F, -57F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 18, 6, 4, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box309
		bodyModel[104].setRotationPoint(87F, -8F, -57F);

		bodyModel[105].addBox(0F, 0F, 0F, 2, 12, 2, 0F); // Import Box310
		bodyModel[105].setRotationPoint(103F, -2F, -56F);

		bodyModel[106].addBox(0F, 0F, 0F, 4, 7, 4, 0F); // Import Box311
		bodyModel[106].setRotationPoint(102F, 1F, -57F);

		bodyModel[107].addBox(0F, 0F, 0F, 2, 12, 2, 0F); // Import Box318
		bodyModel[107].setRotationPoint(56F, -2F, -56F);

		bodyModel[108].addBox(0F, 0F, 0F, 10, 9, 2, 0F); // Import Box319
		bodyModel[108].setRotationPoint(76F, -1F, -52F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box320
		bodyModel[109].setRotationPoint(86F, -1F, -52F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box321
		bodyModel[110].setRotationPoint(71F, -1F, -52F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box322
		bodyModel[111].setRotationPoint(49F, 13F, -53F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box323
		bodyModel[112].setRotationPoint(62F, 13F, -53F);

		bodyModel[113].addBox(0F, 0F, 0F, 3, 9, 3, 0F); // Import Box324
		bodyModel[113].setRotationPoint(59F, 8F, -53F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box325
		bodyModel[114].setRotationPoint(90F, 13F, -53F);

		bodyModel[115].addBox(0F, 0F, 0F, 3, 9, 3, 0F); // Import Box326
		bodyModel[115].setRotationPoint(100F, 8F, -53F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box327
		bodyModel[116].setRotationPoint(103F, 13F, -53F);

		bodyModel[117].addBox(0F, 0F, 0F, 4, 4, 124, 0F); // Import Box328
		bodyModel[117].setRotationPoint(79F, 2F, -62F);

		bodyModel[118].addShapeBox(-2F, -2F, 0F, 64, 20, 62, 0F,0F, 8F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 8F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F); // Import Box335
		bodyModel[118].setRotationPoint(-153F, -33F, -31F);

		bodyModel[119].addShapeBox(62F, -18F, 0F, 50, 36, 15, 0F,0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box336
		bodyModel[119].setRotationPoint(-153F, -33F, -46F);

		bodyModel[120].addShapeBox(-2F, -2F, 0F, 83, 28, 18, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box337
		bodyModel[120].setRotationPoint(-39F, -49F, -64F);

		bodyModel[121].addShapeBox(-2F, -2F, 0F, 50, 28, 18, 0F,0F, -14F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Import Box339
		bodyModel[121].setRotationPoint(-89F, -49F, -64F);

		bodyModel[122].addShapeBox(-2F, -2F, 0F, 13, 28, 18, 0F,0F, 0F, -6F, 0F, -17F, -10F, 0F, -17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box340
		bodyModel[122].setRotationPoint(44F, -49F, -64F);

		bodyModel[123].addBox(-2F, -2F, 0F, 50, 36, 62, 0F); // Import Box341
		bodyModel[123].setRotationPoint(-89F, -49F, -31F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 95, 19, 2, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -5F, -4F, 0F, -5F, -4F, 0F, 0F, 0F, 0F); // Import Box7
		bodyModel[124].setRotationPoint(58F, -32F, 46F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 80, 19, 2, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Import Box8
		bodyModel[125].setRotationPoint(-22F, -28F, 46F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 112, 19, 2, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -4F, 0F); // Import Box9
		bodyModel[126].setRotationPoint(-134F, -21F, 46F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 34, 17, 2, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, -11F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -11F, -7F, 0F); // Import Box10
		bodyModel[127].setRotationPoint(-168F, -16F, 46F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 14, 15, 2, 0F,-5F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F); // Import Box11
		bodyModel[128].setRotationPoint(148F, -32F, 46F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 14, 15, 2, 0F,-5F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F); // Import Box13
		bodyModel[129].setRotationPoint(148F, -32F, 65F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 95, 19, 2, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -5F, -4F, 0F, -5F, -4F, 0F, 0F, 0F, 0F); // Import Box14
		bodyModel[130].setRotationPoint(58F, -32F, 65F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 80, 19, 2, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Import Box15
		bodyModel[131].setRotationPoint(-22F, -28F, 65F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 112, 19, 2, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -4F, 0F); // Import Box16
		bodyModel[132].setRotationPoint(-134F, -21F, 65F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 34, 17, 2, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, -11F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -11F, -7F, 0F); // Import Box17
		bodyModel[133].setRotationPoint(-168F, -16F, 65F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 112, 6, 17, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -4F, 0F); // Import Box18
		bodyModel[134].setRotationPoint(-134F, -21F, 48F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 80, 6, 17, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Import Box19
		bodyModel[135].setRotationPoint(-22F, -28F, 48F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 95, 6, 17, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -5F, -4F, 0F, -5F, -4F, 0F, 0F, 0F, 0F); // Import Box20
		bodyModel[136].setRotationPoint(58F, -32F, 48F);

		bodyModel[137].addBox(0F, 0F, 0F, 11, 2, 17, 0F); // Import Box21
		bodyModel[137].setRotationPoint(153F, -32F, 48F);
		bodyModel[137].rotateAngleZ = -0.57595865F;

		bodyModel[138].addShapeBox(0F, 0F, 0F, 34, 6, 17, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, -11F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -11F, -7F, 0F); // Import Box22
		bodyModel[138].setRotationPoint(-168F, -16F, 48F);

		bodyModel[139].addShapeBox(-2F, -2F, 0F, 64, 20, 15, 0F,0F, 8F, 0F, 0F, 16F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F); // Import Box3
		bodyModel[139].setRotationPoint(-153F, -33F, 31F);

		bodyModel[140].addShapeBox(62F, -18F, 0F, 50, 36, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box336
		bodyModel[140].setRotationPoint(-153F, -33F, 31F);

		bodyModel[141].addShapeBox(-2F, -2F, 0F, 83, 28, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box337
		bodyModel[141].setRotationPoint(-39F, -49F, 46F);

		bodyModel[142].addShapeBox(-2F, -2F, 0F, 50, 28, 18, 0F,0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -14F, -6F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Import Box339
		bodyModel[142].setRotationPoint(-89F, -49F, 46F);

		bodyModel[143].addShapeBox(-2F, -2F, 0F, 13, 28, 18, 0F,0F, 0F, 0F, 0F, -17F, 0F, 0F, -17F, -10F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F); // Import Box340
		bodyModel[143].setRotationPoint(44F, -49F, 46F);

		bodyModel[144].addBox(0F, 0F, 0F, 10, 9, 2, 0F); // Import Box26
		bodyModel[144].setRotationPoint(-94F, -1F, 59F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box27
		bodyModel[145].setRotationPoint(-84F, -1F, 59F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box28
		bodyModel[146].setRotationPoint(-99F, -1F, 59F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box29
		bodyModel[147].setRotationPoint(-99F, -1F, 50F);

		bodyModel[148].addBox(0F, 0F, 0F, 10, 9, 2, 0F); // Import Box30
		bodyModel[148].setRotationPoint(-94F, -1F, 50F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box31
		bodyModel[149].setRotationPoint(-84F, -1F, 50F);

		bodyModel[150].addBox(0F, 0F, 0F, 5, 7, 7, 0F); // Import Box32
		bodyModel[150].setRotationPoint(-101F, 0F, 52F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 5, 7, 0F,0F, 0F, 0F, 7F, 7F, 0F, 7F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, -5F, 0F, 7F, -5F, 0F, 0F, 0F, 0F); // Import Box34
		bodyModel[151].setRotationPoint(-110F, 7F, 52F);

		bodyModel[152].addShapeBox(24F, 0F, 0F, 2, 5, 7, 0F,7F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 7F, 0F, 7F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, -5F, 0F); // Import Box35
		bodyModel[152].setRotationPoint(-94F, 7F, 52F);

		bodyModel[153].addBox(0F, 0F, 0F, 5, 7, 7, 0F); // Import Box36
		bodyModel[153].setRotationPoint(-82F, 0F, 52F);

		bodyModel[154].addBox(0F, 0F, 0F, 3, 9, 3, 0F); // Import Box38
		bodyModel[154].setRotationPoint(-70F, 8F, 49F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box39
		bodyModel[155].setRotationPoint(-67F, 13F, 49F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box40
		bodyModel[156].setRotationPoint(-80F, 13F, 49F);

		bodyModel[157].addBox(0F, 0F, 0F, 13, 6, 4, 0F); // Import Box44
		bodyModel[157].setRotationPoint(-96F, -8F, 54F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 18, 6, 4, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box45
		bodyModel[158].setRotationPoint(-83F, -8F, 54F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 18, 6, 4, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box46
		bodyModel[159].setRotationPoint(-114F, -8F, 54F);

		bodyModel[160].addBox(0F, 0F, 0F, 4, 7, 4, 0F); // Import Box47
		bodyModel[160].setRotationPoint(-68F, 1F, 54F);

		bodyModel[161].addBox(0F, 0F, 0F, 2, 12, 2, 0F); // Import Box48
		bodyModel[161].setRotationPoint(-67F, -2F, 55F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box50
		bodyModel[162].setRotationPoint(-67F, 13F, 58F);

		bodyModel[163].addBox(0F, 0F, 0F, 3, 9, 3, 0F); // Import Box51
		bodyModel[163].setRotationPoint(-70F, 8F, 58F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box52
		bodyModel[164].setRotationPoint(-80F, 13F, 58F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box53
		bodyModel[165].setRotationPoint(-108F, 13F, 58F);

		bodyModel[166].addBox(0F, 0F, 0F, 3, 9, 3, 0F); // Import Box54
		bodyModel[166].setRotationPoint(-111F, 8F, 58F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box55
		bodyModel[167].setRotationPoint(-121F, 13F, 58F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box56
		bodyModel[168].setRotationPoint(-108F, 13F, 49F);

		bodyModel[169].addBox(0F, 0F, 0F, 3, 9, 3, 0F); // Import Box57
		bodyModel[169].setRotationPoint(-111F, 8F, 49F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box58
		bodyModel[170].setRotationPoint(-121F, 13F, 49F);

		bodyModel[171].addBox(0F, 0F, 0F, 2, 12, 2, 0F); // Import Box59
		bodyModel[171].setRotationPoint(-114F, -2F, 55F);

		bodyModel[172].addBox(0F, 0F, 0F, 4, 7, 4, 0F); // Import Box61
		bodyModel[172].setRotationPoint(-115F, 1F, 54F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box20
		bodyModel[173].setRotationPoint(-36F, 13F, 49F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box21
		bodyModel[174].setRotationPoint(-23F, 13F, 49F);

		bodyModel[175].addBox(0F, 0F, 0F, 3, 9, 3, 0F); // Import Box22
		bodyModel[175].setRotationPoint(-26F, 8F, 49F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 2, 5, 7, 0F,0F, 0F, 0F, 7F, 7F, 0F, 7F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, -5F, 0F, 7F, -5F, 0F, 0F, 0F, 0F); // Import Box23
		bodyModel[176].setRotationPoint(-25F, 7F, 52F);

		bodyModel[177].addBox(0F, 0F, 0F, 5, 7, 7, 0F); // Import Box24
		bodyModel[177].setRotationPoint(-16F, 0F, 52F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box25
		bodyModel[178].setRotationPoint(-14F, -1F, 50F);

		bodyModel[179].addBox(0F, 0F, 0F, 10, 9, 2, 0F); // Import Box26
		bodyModel[179].setRotationPoint(-9F, -1F, 50F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box27
		bodyModel[180].setRotationPoint(1F, -1F, 50F);

		bodyModel[181].addBox(0F, 0F, 0F, 5, 7, 7, 0F); // Import Box28
		bodyModel[181].setRotationPoint(3F, 0F, 52F);

		bodyModel[182].addShapeBox(24F, 0F, 0F, 2, 5, 7, 0F,7F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 7F, 0F, 7F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, -5F, 0F); // Import Box29
		bodyModel[182].setRotationPoint(-9F, 7F, 52F);

		bodyModel[183].addBox(0F, 0F, 0F, 4, 7, 4, 0F); // Import Box30
		bodyModel[183].setRotationPoint(17F, 1F, 54F);

		bodyModel[184].addBox(0F, 0F, 0F, 2, 12, 2, 0F); // Import Box31
		bodyModel[184].setRotationPoint(18F, -2F, 55F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 18, 6, 4, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box32
		bodyModel[185].setRotationPoint(2F, -8F, 54F);

		bodyModel[186].addBox(0F, 0F, 0F, 13, 6, 4, 0F); // Import Box33
		bodyModel[186].setRotationPoint(-11F, -8F, 54F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 18, 6, 4, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box34
		bodyModel[187].setRotationPoint(-29F, -8F, 54F);

		bodyModel[188].addBox(0F, 0F, 0F, 2, 12, 2, 0F); // Import Box35
		bodyModel[188].setRotationPoint(-29F, -2F, 55F);

		bodyModel[189].addBox(0F, 0F, 0F, 4, 7, 4, 0F); // Import Box36
		bodyModel[189].setRotationPoint(-30F, 1F, 54F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box42
		bodyModel[190].setRotationPoint(5F, 13F, 49F);

		bodyModel[191].addBox(0F, 0F, 0F, 3, 9, 3, 0F); // Import Box44
		bodyModel[191].setRotationPoint(15F, 8F, 49F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box45
		bodyModel[192].setRotationPoint(18F, 13F, 49F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box49
		bodyModel[193].setRotationPoint(18F, 13F, 58F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box50
		bodyModel[194].setRotationPoint(5F, 13F, 58F);

		bodyModel[195].addBox(0F, 0F, 0F, 3, 9, 3, 0F); // Import Box51
		bodyModel[195].setRotationPoint(15F, 8F, 58F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box52
		bodyModel[196].setRotationPoint(1F, -1F, 59F);

		bodyModel[197].addBox(0F, 0F, 0F, 10, 9, 2, 0F); // Import Box53
		bodyModel[197].setRotationPoint(-9F, -1F, 59F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box54
		bodyModel[198].setRotationPoint(-14F, -1F, 59F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box55
		bodyModel[199].setRotationPoint(-23F, 13F, 58F);

		bodyModel[200].addBox(0F, 0F, 0F, 3, 9, 3, 0F); // Import Box56
		bodyModel[200].setRotationPoint(-26F, 8F, 58F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box57
		bodyModel[201].setRotationPoint(-36F, 13F, 58F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box293
		bodyModel[202].setRotationPoint(103F, 13F, 49F);

		bodyModel[203].addBox(0F, 0F, 0F, 3, 9, 3, 0F); // Import Box294
		bodyModel[203].setRotationPoint(100F, 8F, 49F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box295
		bodyModel[204].setRotationPoint(90F, 13F, 49F);

		bodyModel[205].addShapeBox(24F, 0F, 0F, 2, 5, 7, 0F,7F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 7F, 0F, 7F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, -5F, 0F); // Import Box296
		bodyModel[205].setRotationPoint(76F, 7F, 52F);

		bodyModel[206].addBox(0F, 0F, 0F, 5, 7, 7, 0F); // Import Box297
		bodyModel[206].setRotationPoint(88F, 0F, 52F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box298
		bodyModel[207].setRotationPoint(86F, -1F, 50F);

		bodyModel[208].addBox(0F, 0F, 0F, 10, 9, 2, 0F); // Import Box299
		bodyModel[208].setRotationPoint(76F, -1F, 50F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box300
		bodyModel[209].setRotationPoint(71F, -1F, 50F);

		bodyModel[210].addBox(0F, 0F, 0F, 5, 7, 7, 0F); // Import Box301
		bodyModel[210].setRotationPoint(69F, 0F, 52F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 2, 5, 7, 0F,0F, 0F, 0F, 7F, 7F, 0F, 7F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, -5F, 0F, 7F, -5F, 0F, 0F, 0F, 0F); // Import Box302
		bodyModel[211].setRotationPoint(60F, 7F, 52F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box303
		bodyModel[212].setRotationPoint(49F, 13F, 49F);

		bodyModel[213].addBox(0F, 0F, 0F, 3, 9, 3, 0F); // Import Box304
		bodyModel[213].setRotationPoint(59F, 8F, 49F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box305
		bodyModel[214].setRotationPoint(62F, 13F, 49F);

		bodyModel[215].addBox(0F, 0F, 0F, 4, 7, 4, 0F); // Import Box306
		bodyModel[215].setRotationPoint(55F, 1F, 54F);

		bodyModel[216].addBox(0F, 0F, 0F, 13, 6, 4, 0F); // Import Box307
		bodyModel[216].setRotationPoint(74F, -8F, 54F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 18, 6, 4, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box308
		bodyModel[217].setRotationPoint(56F, -8F, 54F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 18, 6, 4, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box309
		bodyModel[218].setRotationPoint(87F, -8F, 54F);

		bodyModel[219].addBox(0F, 0F, 0F, 2, 12, 2, 0F); // Import Box310
		bodyModel[219].setRotationPoint(103F, -2F, 55F);

		bodyModel[220].addBox(0F, 0F, 0F, 4, 7, 4, 0F); // Import Box311
		bodyModel[220].setRotationPoint(102F, 1F, 54F);

		bodyModel[221].addBox(0F, 0F, 0F, 2, 12, 2, 0F); // Import Box318
		bodyModel[221].setRotationPoint(56F, -2F, 55F);

		bodyModel[222].addBox(0F, 0F, 0F, 10, 9, 2, 0F); // Import Box319
		bodyModel[222].setRotationPoint(76F, -1F, 59F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box320
		bodyModel[223].setRotationPoint(86F, -1F, 59F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box321
		bodyModel[224].setRotationPoint(71F, -1F, 59F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box322
		bodyModel[225].setRotationPoint(49F, 13F, 58F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box323
		bodyModel[226].setRotationPoint(62F, 13F, 58F);

		bodyModel[227].addBox(0F, 0F, 0F, 3, 9, 3, 0F); // Import Box324
		bodyModel[227].setRotationPoint(59F, 8F, 58F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box325
		bodyModel[228].setRotationPoint(90F, 13F, 58F);

		bodyModel[229].addBox(0F, 0F, 0F, 3, 9, 3, 0F); // Import Box326
		bodyModel[229].setRotationPoint(100F, 8F, 58F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box327
		bodyModel[230].setRotationPoint(103F, 13F, 58F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Import Box347
		turretModel[1] = new ModelRendererTurbo(this, 137, 385, textureX, textureY); // Import Box349
		turretModel[2] = new ModelRendererTurbo(this, 145, 505, textureX, textureY); // Import Box349
		turretModel[3] = new ModelRendererTurbo(this, 513, 529, textureX, textureY); // Import Box349
		turretModel[4] = new ModelRendererTurbo(this, 353, 601, textureX, textureY); // Import Box347
		turretModel[5] = new ModelRendererTurbo(this, 417, 601, textureX, textureY); // Import Box348
		turretModel[6] = new ModelRendererTurbo(this, 577, 601, textureX, textureY); // Import Box349
		turretModel[7] = new ModelRendererTurbo(this, 913, 593, textureX, textureY); // Import Box347
		turretModel[8] = new ModelRendererTurbo(this, 1, 545, textureX, textureY); // Import Box349
		turretModel[9] = new ModelRendererTurbo(this, 905, 561, textureX, textureY); // Import Box349
		turretModel[10] = new ModelRendererTurbo(this, 713, 601, textureX, textureY); // Import Box349
		turretModel[11] = new ModelRendererTurbo(this, 801, 617, textureX, textureY); // Import Box347
		turretModel[12] = new ModelRendererTurbo(this, 577, 633, textureX, textureY); // Import Box349
		turretModel[13] = new ModelRendererTurbo(this, 657, 625, textureX, textureY); // Import Box348
		turretModel[14] = new ModelRendererTurbo(this, 657, 625, textureX, textureY); // Import Box348

		turretModel[0].addShapeBox(-2F, -2F, 0F, 39, 20, 15, 0F,0F, 0F, -7F, 0F, 8F, 0F, 0F, 16F, 0F, 0F, 8F, 0F, 0F, -10F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F); // Import Box347
		turretModel[0].setRotationPoint(-40F, -69F, -46F);

		turretModel[1].addShapeBox(-2F, -2F, 0F, 45, 10, 15, 0F,-8F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, -6F, 0F, -8F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box349
		turretModel[1].setRotationPoint(-46F, -59F, -46F);

		turretModel[2].addShapeBox(-2F, -2F, 0F, 44, 10, 12, 0F,0F, -10F, 0F, 0F, -10F, -12F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box349
		turretModel[2].setRotationPoint(-1F, -59F, -58F);

		turretModel[3].addShapeBox(-2F, -2F, 0F, 37, 10, 12, 0F,0F, -10F, -12F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box349
		turretModel[3].setRotationPoint(-38F, -59F, -58F);

		turretModel[4].addShapeBox(-2F, -2F, 0F, 46, 20, 15, 0F,0F, 8F, 0F, 0F, 0F, -7F, 0F, 8F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F, -10F, -7F, 6F, 0F, 0F, 0F, 0F, 0F); // Import Box347
		turretModel[4].setRotationPoint(-1F, -69F, -46F);

		turretModel[5].addShapeBox(-2F, -2F, 0F, 46, 20, 62, 0F,0F, 16F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F); // Import Box348
		turretModel[5].setRotationPoint(-1F, -69F, -31F);

		turretModel[6].addShapeBox(-2F, -2F, 0F, 52, 10, 15, 0F,0F, 0F, 0F, -8F, -10F, 0F, -6F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box349
		turretModel[6].setRotationPoint(-1F, -59F, -46F);

		turretModel[7].addShapeBox(-2F, -2F, 0F, 39, 20, 15, 0F,0F, 8F, 0F, 0F, 16F, 0F, 0F, 8F, 0F, 0F, 0F, -7F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -7F); // Import Box347
		turretModel[7].setRotationPoint(-40F, -69F, 31F);

		turretModel[8].addShapeBox(-2F, -2F, 0F, 45, 10, 15, 0F,-6F, 0F, -8F, 0F, 0F, -15F, 0F, 0F, 0F, -8F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Import Box349
		turretModel[8].setRotationPoint(-46F, -59F, 31F);

		turretModel[9].addShapeBox(-2F, -2F, 0F, 44, 10, 12, 0F,0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, -12F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F); // Import Box349
		turretModel[9].setRotationPoint(-1F, -59F, 46F);

		turretModel[10].addShapeBox(-2F, -2F, 0F, 37, 10, 12, 0F,0F, -10F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F); // Import Box349
		turretModel[10].setRotationPoint(-38F, -59F, 46F);

		turretModel[11].addShapeBox(-2F, -2F, 0F, 46, 20, 15, 0F,0F, 16F, 0F, 0F, 8F, 0F, 0F, 0F, -7F, 0F, 8F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, -10F, -7F, 0F, 0F, 0F); // Import Box347
		turretModel[11].setRotationPoint(-1F, -69F, 31F);

		turretModel[12].addShapeBox(-2F, -2F, 0F, 52, 10, 15, 0F,0F, 0F, -15F, -6F, 0F, -8F, -8F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F); // Import Box349
		turretModel[12].setRotationPoint(-1F, -59F, 31F);

		turretModel[13].addShapeBox(-2F, -2F, 0F, 39, 20, 62, 0F,0F, 8F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 8F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F); // Import Box348
		turretModel[13].setRotationPoint(-40F, -69F, -31F);

		turretModel[14].addShapeBox(-2F, -2F, 0F, 39, 8, 62, 0F,6F, 15F, -8F, 0F, 18F, 0F, 0F, 18F, 0F, 6F, 15F, -8F, 6F, -9F, -8F, 0F, -3F, 0F, 0F, -3F, 0F, 6F, -9F, -8F); // Import Box348
		turretModel[14].setRotationPoint(-68F, -59F, -31F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Import Box3
		barrelModel[1] = new ModelRendererTurbo(this, 393, 193, textureX, textureY); // Import Box3
		barrelModel[2] = new ModelRendererTurbo(this, 81, 209, textureX, textureY); // Import Box3
		barrelModel[3] = new ModelRendererTurbo(this, 721, 177, textureX, textureY); // Import Box3
		barrelModel[4] = new ModelRendererTurbo(this, 473, 193, textureX, textureY); // Import Box3
		barrelModel[5] = new ModelRendererTurbo(this, 905, 249, textureX, textureY); // Import Box3
		barrelModel[6] = new ModelRendererTurbo(this, 521, 257, textureX, textureY); // Import Box3
		barrelModel[7] = new ModelRendererTurbo(this, 577, 257, textureX, textureY); // Import Box3
		barrelModel[8] = new ModelRendererTurbo(this, 633, 257, textureX, textureY); // Import Box3
		barrelModel[9] = new ModelRendererTurbo(this, 937, 177, textureX, textureY); // Import Box3
		barrelModel[10] = new ModelRendererTurbo(this, 233, 193, textureX, textureY); // Import Box3
		barrelModel[11] = new ModelRendererTurbo(this, 249, 233, textureX, textureY); // Import Box3
		barrelModel[12] = new ModelRendererTurbo(this, 529, 385, textureX, textureY); // Import Box3
		barrelModel[13] = new ModelRendererTurbo(this, 609, 433, textureX, textureY); // Import Box3
		barrelModel[14] = new ModelRendererTurbo(this, 1, 441, textureX, textureY); // Import Box3
		barrelModel[15] = new ModelRendererTurbo(this, 1, 457, textureX, textureY); // Import Box350
		barrelModel[16] = new ModelRendererTurbo(this, 297, 305, textureX, textureY); // Import Box351
		barrelModel[17] = new ModelRendererTurbo(this, 273, 345, textureX, textureY); // Import Box352
		barrelModel[18] = new ModelRendererTurbo(this, 81, 457, textureX, textureY); // Import Box353

		barrelModel[0].addBox(0F, -4F, -8F, 23, 7, 15, 0F); // Import Box3
		barrelModel[0].setRotationPoint(41F, -66F, 0F);

		barrelModel[1].addShapeBox(0F, 3F, -8F, 23, 4, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import Box3
		barrelModel[1].setRotationPoint(41F, -66F, 0F);

		barrelModel[2].addShapeBox(0F, -8F, -8F, 23, 4, 15, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box3
		barrelModel[2].setRotationPoint(41F, -66F, 0F);

		barrelModel[3].addShapeBox(23F, -3F, -7F, 5, 5, 13, 0F,0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F); // Import Box3
		barrelModel[3].setRotationPoint(41F, -66F, 0F);

		barrelModel[4].addShapeBox(23F, 2F, -7F, 5, 4, 13, 0F,0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 1F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 1F, -3F); // Import Box3
		barrelModel[4].setRotationPoint(41F, -66F, 0F);

		barrelModel[5].addShapeBox(23F, -7F, -7F, 5, 4, 13, 0F,0F, 1F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 1F, -3F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F); // Import Box3
		barrelModel[5].setRotationPoint(41F, -66F, 0F);

		barrelModel[6].addBox(28F, -3F, -7F, 13, 5, 13, 0F); // Import Box3
		barrelModel[6].setRotationPoint(41F, -66F, 0F);

		barrelModel[7].addShapeBox(28F, 2F, -7F, 13, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import Box3
		barrelModel[7].setRotationPoint(41F, -66F, 0F);

		barrelModel[8].addShapeBox(28F, -7F, -7F, 13, 4, 13, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box3
		barrelModel[8].setRotationPoint(41F, -66F, 0F);

		barrelModel[9].addShapeBox(41F, -2F, -6F, 5, 3, 11, 0F,0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F); // Import Box3
		barrelModel[9].setRotationPoint(41F, -66F, 0F);

		barrelModel[10].addShapeBox(41F, 1F, -6F, 5, 4, 11, 0F,0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 1F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 1F, -3F); // Import Box3
		barrelModel[10].setRotationPoint(41F, -66F, 0F);

		barrelModel[11].addShapeBox(41F, -6F, -6F, 5, 4, 11, 0F,0F, 1F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 1F, -3F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F); // Import Box3
		barrelModel[11].setRotationPoint(41F, -66F, 0F);

		barrelModel[12].addShapeBox(46F, -1F, -5F, 140, 1, 9, 0F,0F, 1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 1F); // Import Box3
		barrelModel[12].setRotationPoint(41F, -66F, 0F);

		barrelModel[13].addShapeBox(46F, 0F, -5F, 140, 4, 9, 0F,0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, 1F, -3F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 1F, -3F); // Import Box3
		barrelModel[13].setRotationPoint(41F, -66F, 0F);

		barrelModel[14].addShapeBox(46F, -5F, -5F, 140, 4, 9, 0F,0F, 1F, -3F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 1F, -3F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F); // Import Box3
		barrelModel[14].setRotationPoint(41F, -66F, 0F);

		barrelModel[15].addBox(0F, -10F, -32F, 8, 20, 62, 0F); // Import Box350
		barrelModel[15].setRotationPoint(41F, -66F, 0F);

		barrelModel[16].addShapeBox(8F, -10F, -32F, 8, 20, 16, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Import Box351
		barrelModel[16].setRotationPoint(41F, -66F, 0F);

		barrelModel[17].addShapeBox(8F, -10F, 14F, 8, 20, 16, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Import Box352
		barrelModel[17].setRotationPoint(41F, -66F, 0F);

		barrelModel[18].addShapeBox(8F, -9F, -16F, 7, 18, 30, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Import Box353
		barrelModel[18].setRotationPoint(41F, -66F, 0F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 905, 177, textureX, textureY); // Import Box61
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 961, 177, textureX, textureY); // Import Box62
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 969, 233, textureX, textureY); // Import Box63
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 745, 249, textureX, textureY); // Import Box64
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 793, 249, textureX, textureY); // Import Box65
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 857, 249, textureX, textureY); // Import Box66

		leftTrackWheelModels[0].addShapeBox(-13F, -13F, 0F, 6, 26, 17, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import Box61
		leftTrackWheelModels[0].setRotationPoint(145F, -8.5F, 46F);

		leftTrackWheelModels[1].addBox(-7F, -13F, 0F, 14, 26, 17, 0F); // Import Box62
		leftTrackWheelModels[1].setRotationPoint(145F, -8.5F, 46F);

		leftTrackWheelModels[2].addShapeBox(7F, -13F, 0F, 6, 26, 17, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box63
		leftTrackWheelModels[2].setRotationPoint(145F, -8.5F, 46F);

		leftTrackWheelModels[3].addShapeBox(7F, -13F, 0F, 6, 26, 17, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box64
		leftTrackWheelModels[3].setRotationPoint(-151F, 1.5F, 46F);

		leftTrackWheelModels[4].addBox(-7F, -13F, 0F, 14, 26, 17, 0F); // Import Box65
		leftTrackWheelModels[4].setRotationPoint(-151F, 1.5F, 46F);

		leftTrackWheelModels[5].addShapeBox(-13F, -13F, 0F, 6, 26, 17, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import Box66
		leftTrackWheelModels[5].setRotationPoint(-151F, 1.5F, 46F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 969, 57, textureX, textureY); // Import Box62
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Import Box65
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Import Box66
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Import Box67
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Import Box68
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Import Box69
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Import Box70
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Import Box71
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 849, 65, textureX, textureY); // Import Box72
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 881, 65, textureX, textureY); // Import Box73
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 913, 65, textureX, textureY); // Import Box74
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 993, 105, textureX, textureY); // Import Box17
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 689, 145, textureX, textureY); // Import Box18
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 721, 145, textureX, textureY); // Import Box19
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 553, 153, textureX, textureY); // Import Box37
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 985, 153, textureX, textureY); // Import Box38
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 753, 161, textureX, textureY); // Import Box39
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 233, 169, textureX, textureY); // Import Box40
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 393, 169, textureX, textureY); // Import Box41
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 425, 169, textureX, textureY); // Import Box43
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 457, 169, textureX, textureY); // Import Box46
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Import Box47
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 521, 169, textureX, textureY); // Import Box48
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 905, 177, textureX, textureY); // Import Box61
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 961, 177, textureX, textureY); // Import Box62
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 969, 233, textureX, textureY); // Import Box63
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 745, 249, textureX, textureY); // Import Box64
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 793, 249, textureX, textureY); // Import Box65
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 857, 249, textureX, textureY); // Import Box66
		rightTrackWheelModels[29] = new ModelRendererTurbo(this, 937, 265, textureX, textureY); // Import Box290
		rightTrackWheelModels[30] = new ModelRendererTurbo(this, 905, 273, textureX, textureY); // Import Box291
		rightTrackWheelModels[31] = new ModelRendererTurbo(this, 649, 281, textureX, textureY); // Import Box292
		rightTrackWheelModels[32] = new ModelRendererTurbo(this, 793, 297, textureX, textureY); // Import Box312
		rightTrackWheelModels[33] = new ModelRendererTurbo(this, 1, 305, textureX, textureY); // Import Box313
		rightTrackWheelModels[34] = new ModelRendererTurbo(this, 49, 305, textureX, textureY); // Import Box314
		rightTrackWheelModels[35] = new ModelRendererTurbo(this, 81, 305, textureX, textureY); // Import Box315
		rightTrackWheelModels[36] = new ModelRendererTurbo(this, 137, 305, textureX, textureY); // Import Box316
		rightTrackWheelModels[37] = new ModelRendererTurbo(this, 169, 305, textureX, textureY); // Import Box317
		rightTrackWheelModels[38] = new ModelRendererTurbo(this, 201, 305, textureX, textureY); // Import Box329
		rightTrackWheelModels[39] = new ModelRendererTurbo(this, 233, 305, textureX, textureY); // Import Box330
		rightTrackWheelModels[40] = new ModelRendererTurbo(this, 265, 305, textureX, textureY); // Import Box331
		rightTrackWheelModels[41] = new ModelRendererTurbo(this, 969, 57, textureX, textureY); // Import Box62
		rightTrackWheelModels[42] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Import Box65
		rightTrackWheelModels[43] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Import Box66
		rightTrackWheelModels[44] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Import Box67
		rightTrackWheelModels[45] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Import Box68
		rightTrackWheelModels[46] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Import Box69
		rightTrackWheelModels[47] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Import Box70
		rightTrackWheelModels[48] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Import Box71
		rightTrackWheelModels[49] = new ModelRendererTurbo(this, 849, 65, textureX, textureY); // Import Box72
		rightTrackWheelModels[50] = new ModelRendererTurbo(this, 881, 65, textureX, textureY); // Import Box73
		rightTrackWheelModels[51] = new ModelRendererTurbo(this, 913, 65, textureX, textureY); // Import Box74
		rightTrackWheelModels[52] = new ModelRendererTurbo(this, 993, 105, textureX, textureY); // Import Box17
		rightTrackWheelModels[53] = new ModelRendererTurbo(this, 689, 145, textureX, textureY); // Import Box18
		rightTrackWheelModels[54] = new ModelRendererTurbo(this, 721, 145, textureX, textureY); // Import Box19
		rightTrackWheelModels[55] = new ModelRendererTurbo(this, 553, 153, textureX, textureY); // Import Box37
		rightTrackWheelModels[56] = new ModelRendererTurbo(this, 985, 153, textureX, textureY); // Import Box38
		rightTrackWheelModels[57] = new ModelRendererTurbo(this, 753, 161, textureX, textureY); // Import Box39
		rightTrackWheelModels[58] = new ModelRendererTurbo(this, 233, 169, textureX, textureY); // Import Box40
		rightTrackWheelModels[59] = new ModelRendererTurbo(this, 393, 169, textureX, textureY); // Import Box41
		rightTrackWheelModels[60] = new ModelRendererTurbo(this, 425, 169, textureX, textureY); // Import Box43
		rightTrackWheelModels[61] = new ModelRendererTurbo(this, 457, 169, textureX, textureY); // Import Box46
		rightTrackWheelModels[62] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Import Box47
		rightTrackWheelModels[63] = new ModelRendererTurbo(this, 521, 169, textureX, textureY); // Import Box48
		rightTrackWheelModels[64] = new ModelRendererTurbo(this, 937, 265, textureX, textureY); // Import Box290
		rightTrackWheelModels[65] = new ModelRendererTurbo(this, 905, 273, textureX, textureY); // Import Box291
		rightTrackWheelModels[66] = new ModelRendererTurbo(this, 649, 281, textureX, textureY); // Import Box292
		rightTrackWheelModels[67] = new ModelRendererTurbo(this, 793, 297, textureX, textureY); // Import Box312
		rightTrackWheelModels[68] = new ModelRendererTurbo(this, 1, 305, textureX, textureY); // Import Box313
		rightTrackWheelModels[69] = new ModelRendererTurbo(this, 49, 305, textureX, textureY); // Import Box314
		rightTrackWheelModels[70] = new ModelRendererTurbo(this, 81, 305, textureX, textureY); // Import Box315
		rightTrackWheelModels[71] = new ModelRendererTurbo(this, 137, 305, textureX, textureY); // Import Box316
		rightTrackWheelModels[72] = new ModelRendererTurbo(this, 169, 305, textureX, textureY); // Import Box317
		rightTrackWheelModels[73] = new ModelRendererTurbo(this, 201, 305, textureX, textureY); // Import Box329
		rightTrackWheelModels[74] = new ModelRendererTurbo(this, 233, 305, textureX, textureY); // Import Box330
		rightTrackWheelModels[75] = new ModelRendererTurbo(this, 265, 305, textureX, textureY); // Import Box331

		rightTrackWheelModels[0].addBox(-3F, -8.5F, 0F, 6, 17, 6, 0F); // Import Box62
		rightTrackWheelModels[0].setRotationPoint(-80F, 15.5F, -59F);

		rightTrackWheelModels[1].addShapeBox(3F, -8.5F, 0F, 6, 17, 6, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box65
		rightTrackWheelModels[1].setRotationPoint(-80F, 15.5F, -59F);

		rightTrackWheelModels[2].addShapeBox(3F, -8.5F, 0F, 6, 17, 6, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box66
		rightTrackWheelModels[2].setRotationPoint(-58F, 15.5F, -59F);

		rightTrackWheelModels[3].addBox(-3F, -8.5F, 0F, 6, 17, 6, 0F); // Import Box67
		rightTrackWheelModels[3].setRotationPoint(-58F, 15.5F, -59F);

		rightTrackWheelModels[4].addShapeBox(-9F, -8.5F, 0F, 6, 17, 6, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import Box68
		rightTrackWheelModels[4].setRotationPoint(-58F, 15.5F, -59F);

		rightTrackWheelModels[5].addShapeBox(3F, -8.5F, 0F, 6, 17, 6, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box69
		rightTrackWheelModels[5].setRotationPoint(-99F, 15.5F, -59F);

		rightTrackWheelModels[6].addBox(-3F, -8.5F, 0F, 6, 17, 6, 0F); // Import Box70
		rightTrackWheelModels[6].setRotationPoint(-99F, 15.5F, -59F);

		rightTrackWheelModels[7].addShapeBox(-9F, -8.5F, 0F, 6, 17, 6, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import Box71
		rightTrackWheelModels[7].setRotationPoint(-99F, 15.5F, -59F);

		rightTrackWheelModels[8].addShapeBox(-9F, -8.5F, 0F, 6, 17, 6, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import Box72
		rightTrackWheelModels[8].setRotationPoint(-121F, 15.5F, -59F);

		rightTrackWheelModels[9].addBox(-3F, -8.5F, 0F, 6, 17, 6, 0F); // Import Box73
		rightTrackWheelModels[9].setRotationPoint(-121F, 15.5F, -59F);

		rightTrackWheelModels[10].addShapeBox(3F, -8.5F, 0F, 6, 17, 6, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box74
		rightTrackWheelModels[10].setRotationPoint(-121F, 15.5F, -59F);

		rightTrackWheelModels[11].addShapeBox(-9F, -8.5F, 0F, 6, 17, 6, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import Box17
		rightTrackWheelModels[11].setRotationPoint(-36F, 15.5F, -59F);

		rightTrackWheelModels[12].addBox(-3F, -8.5F, 0F, 6, 17, 6, 0F); // Import Box18
		rightTrackWheelModels[12].setRotationPoint(-36F, 15.5F, -59F);

		rightTrackWheelModels[13].addShapeBox(3F, -8.5F, 0F, 6, 17, 6, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box19
		rightTrackWheelModels[13].setRotationPoint(-36F, 15.5F, -59F);

		rightTrackWheelModels[14].addShapeBox(3F, -8.5F, 0F, 6, 17, 6, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box37
		rightTrackWheelModels[14].setRotationPoint(-14F, 15.5F, -59F);

		rightTrackWheelModels[15].addBox(-3F, -8.5F, 0F, 6, 17, 6, 0F); // Import Box38
		rightTrackWheelModels[15].setRotationPoint(-14F, 15.5F, -59F);

		rightTrackWheelModels[16].addShapeBox(-9F, -8.5F, 0F, 6, 17, 6, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import Box39
		rightTrackWheelModels[16].setRotationPoint(-14F, 15.5F, -59F);

		rightTrackWheelModels[17].addShapeBox(-9F, -8.5F, 0F, 6, 17, 6, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import Box40
		rightTrackWheelModels[17].setRotationPoint(5F, 15.5F, -59F);

		rightTrackWheelModels[18].addBox(-3F, -8.5F, 0F, 6, 17, 6, 0F); // Import Box41
		rightTrackWheelModels[18].setRotationPoint(5F, 15.5F, -59F);

		rightTrackWheelModels[19].addShapeBox(3F, -8.5F, 0F, 6, 17, 6, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box43
		rightTrackWheelModels[19].setRotationPoint(5F, 15.5F, -59F);

		rightTrackWheelModels[20].addShapeBox(-9F, -8.5F, 0F, 6, 17, 6, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import Box46
		rightTrackWheelModels[20].setRotationPoint(27F, 15.5F, -59F);

		rightTrackWheelModels[21].addBox(-3F, -8.5F, 0F, 6, 17, 6, 0F); // Import Box47
		rightTrackWheelModels[21].setRotationPoint(27F, 15.5F, -59F);

		rightTrackWheelModels[22].addShapeBox(3F, -8.5F, 0F, 6, 17, 6, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box48
		rightTrackWheelModels[22].setRotationPoint(27F, 15.5F, -59F);

		rightTrackWheelModels[23].addShapeBox(-13F, -13F, 0F, 6, 26, 17, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import Box61
		rightTrackWheelModels[23].setRotationPoint(145F, -8.5F, -63F);

		rightTrackWheelModels[24].addBox(-7F, -13F, 0F, 14, 26, 17, 0F); // Import Box62
		rightTrackWheelModels[24].setRotationPoint(145F, -8.5F, -63F);

		rightTrackWheelModels[25].addShapeBox(7F, -13F, 0F, 6, 26, 17, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box63
		rightTrackWheelModels[25].setRotationPoint(145F, -8.5F, -63F);

		rightTrackWheelModels[26].addShapeBox(7F, -13F, 0F, 6, 26, 17, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box64
		rightTrackWheelModels[26].setRotationPoint(-151F, 1.5F, -63F);

		rightTrackWheelModels[27].addBox(-7F, -13F, 0F, 14, 26, 17, 0F); // Import Box65
		rightTrackWheelModels[27].setRotationPoint(-151F, 1.5F, -63F);

		rightTrackWheelModels[28].addShapeBox(-13F, -13F, 0F, 6, 26, 17, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import Box66
		rightTrackWheelModels[28].setRotationPoint(-151F, 1.5F, -63F);

		rightTrackWheelModels[29].addBox(-3F, -8.5F, 0F, 6, 17, 6, 0F); // Import Box290
		rightTrackWheelModels[29].setRotationPoint(112F, 15.5F, -59F);

		rightTrackWheelModels[30].addShapeBox(3F, -8.5F, 0F, 6, 17, 6, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box291
		rightTrackWheelModels[30].setRotationPoint(112F, 15.5F, -59F);

		rightTrackWheelModels[31].addShapeBox(-9F, -8.5F, 0F, 6, 17, 6, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import Box292
		rightTrackWheelModels[31].setRotationPoint(112F, 15.5F, -59F);

		rightTrackWheelModels[32].addShapeBox(3F, -8.5F, 0F, 6, 17, 6, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box312
		rightTrackWheelModels[32].setRotationPoint(90F, 15.5F, -59F);

		rightTrackWheelModels[33].addBox(-3F, -8.5F, 0F, 6, 17, 6, 0F); // Import Box313
		rightTrackWheelModels[33].setRotationPoint(90F, 15.5F, -59F);

		rightTrackWheelModels[34].addShapeBox(-9F, -8.5F, 0F, 6, 17, 6, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import Box314
		rightTrackWheelModels[34].setRotationPoint(90F, 15.5F, -59F);

		rightTrackWheelModels[35].addShapeBox(3F, -8.5F, 0F, 6, 17, 6, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box315
		rightTrackWheelModels[35].setRotationPoint(71F, 15.5F, -59F);

		rightTrackWheelModels[36].addBox(-3F, -8.5F, 0F, 6, 17, 6, 0F); // Import Box316
		rightTrackWheelModels[36].setRotationPoint(71F, 15.5F, -59F);

		rightTrackWheelModels[37].addShapeBox(-9F, -8.5F, 0F, 6, 17, 6, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import Box317
		rightTrackWheelModels[37].setRotationPoint(71F, 15.5F, -59F);

		rightTrackWheelModels[38].addShapeBox(3F, -8.5F, 0F, 6, 17, 6, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box329
		rightTrackWheelModels[38].setRotationPoint(49F, 15.5F, -59F);

		rightTrackWheelModels[39].addBox(-3F, -8.5F, 0F, 6, 17, 6, 0F); // Import Box330
		rightTrackWheelModels[39].setRotationPoint(49F, 15.5F, -59F);

		rightTrackWheelModels[40].addShapeBox(-9F, -8.5F, 0F, 6, 17, 6, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import Box331
		rightTrackWheelModels[40].setRotationPoint(49F, 15.5F, -59F);

		rightTrackWheelModels[41].addBox(-3F, -8.5F, 0F, 6, 17, 6, 0F); // Import Box62
		rightTrackWheelModels[41].setRotationPoint(-80F, 15.5F, 52F);

		rightTrackWheelModels[42].addShapeBox(3F, -8.5F, 0F, 6, 17, 6, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box65
		rightTrackWheelModels[42].setRotationPoint(-80F, 15.5F, 52F);

		rightTrackWheelModels[43].addShapeBox(3F, -8.5F, 0F, 6, 17, 6, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box66
		rightTrackWheelModels[43].setRotationPoint(-58F, 15.5F, 52F);

		rightTrackWheelModels[44].addBox(-3F, -8.5F, 0F, 6, 17, 6, 0F); // Import Box67
		rightTrackWheelModels[44].setRotationPoint(-58F, 15.5F, 52F);

		rightTrackWheelModels[45].addShapeBox(-9F, -8.5F, 0F, 6, 17, 6, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import Box68
		rightTrackWheelModels[45].setRotationPoint(-58F, 15.5F, 52F);

		rightTrackWheelModels[46].addShapeBox(3F, -8.5F, 0F, 6, 17, 6, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box69
		rightTrackWheelModels[46].setRotationPoint(-99F, 15.5F, 52F);

		rightTrackWheelModels[47].addBox(-3F, -8.5F, 0F, 6, 17, 6, 0F); // Import Box70
		rightTrackWheelModels[47].setRotationPoint(-99F, 15.5F, 52F);

		rightTrackWheelModels[48].addShapeBox(-9F, -8.5F, 0F, 6, 17, 6, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import Box71
		rightTrackWheelModels[48].setRotationPoint(-99F, 15.5F, 52F);

		rightTrackWheelModels[49].addShapeBox(-9F, -8.5F, 0F, 6, 17, 6, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import Box72
		rightTrackWheelModels[49].setRotationPoint(-121F, 15.5F, 52F);

		rightTrackWheelModels[50].addBox(-3F, -8.5F, 0F, 6, 17, 6, 0F); // Import Box73
		rightTrackWheelModels[50].setRotationPoint(-121F, 15.5F, 52F);

		rightTrackWheelModels[51].addShapeBox(3F, -8.5F, 0F, 6, 17, 6, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box74
		rightTrackWheelModels[51].setRotationPoint(-121F, 15.5F, 52F);

		rightTrackWheelModels[52].addShapeBox(-9F, -8.5F, 0F, 6, 17, 6, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import Box17
		rightTrackWheelModels[52].setRotationPoint(-36F, 15.5F, 52F);

		rightTrackWheelModels[53].addBox(-3F, -8.5F, 0F, 6, 17, 6, 0F); // Import Box18
		rightTrackWheelModels[53].setRotationPoint(-36F, 15.5F, 52F);

		rightTrackWheelModels[54].addShapeBox(3F, -8.5F, 0F, 6, 17, 6, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box19
		rightTrackWheelModels[54].setRotationPoint(-36F, 15.5F, 52F);

		rightTrackWheelModels[55].addShapeBox(3F, -8.5F, 0F, 6, 17, 6, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box37
		rightTrackWheelModels[55].setRotationPoint(-14F, 15.5F, 52F);

		rightTrackWheelModels[56].addBox(-3F, -8.5F, 0F, 6, 17, 6, 0F); // Import Box38
		rightTrackWheelModels[56].setRotationPoint(-14F, 15.5F, 52F);

		rightTrackWheelModels[57].addShapeBox(-9F, -8.5F, 0F, 6, 17, 6, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import Box39
		rightTrackWheelModels[57].setRotationPoint(-14F, 15.5F, 52F);

		rightTrackWheelModels[58].addShapeBox(-9F, -8.5F, 0F, 6, 17, 6, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import Box40
		rightTrackWheelModels[58].setRotationPoint(5F, 15.5F, 52F);

		rightTrackWheelModels[59].addBox(-3F, -8.5F, 0F, 6, 17, 6, 0F); // Import Box41
		rightTrackWheelModels[59].setRotationPoint(5F, 15.5F, 52F);

		rightTrackWheelModels[60].addShapeBox(3F, -8.5F, 0F, 6, 17, 6, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box43
		rightTrackWheelModels[60].setRotationPoint(5F, 15.5F, 52F);

		rightTrackWheelModels[61].addShapeBox(-9F, -8.5F, 0F, 6, 17, 6, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import Box46
		rightTrackWheelModels[61].setRotationPoint(27F, 15.5F, 52F);

		rightTrackWheelModels[62].addBox(-3F, -8.5F, 0F, 6, 17, 6, 0F); // Import Box47
		rightTrackWheelModels[62].setRotationPoint(27F, 15.5F, 52F);

		rightTrackWheelModels[63].addShapeBox(3F, -8.5F, 0F, 6, 17, 6, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box48
		rightTrackWheelModels[63].setRotationPoint(27F, 15.5F, 52F);

		rightTrackWheelModels[64].addBox(-3F, -8.5F, 0F, 6, 17, 6, 0F); // Import Box290
		rightTrackWheelModels[64].setRotationPoint(112F, 15.5F, 52F);

		rightTrackWheelModels[65].addShapeBox(3F, -8.5F, 0F, 6, 17, 6, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box291
		rightTrackWheelModels[65].setRotationPoint(112F, 15.5F, 52F);

		rightTrackWheelModels[66].addShapeBox(-9F, -8.5F, 0F, 6, 17, 6, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import Box292
		rightTrackWheelModels[66].setRotationPoint(112F, 15.5F, 52F);

		rightTrackWheelModels[67].addShapeBox(3F, -8.5F, 0F, 6, 17, 6, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box312
		rightTrackWheelModels[67].setRotationPoint(90F, 15.5F, 52F);

		rightTrackWheelModels[68].addBox(-3F, -8.5F, 0F, 6, 17, 6, 0F); // Import Box313
		rightTrackWheelModels[68].setRotationPoint(90F, 15.5F, 52F);

		rightTrackWheelModels[69].addShapeBox(-9F, -8.5F, 0F, 6, 17, 6, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import Box314
		rightTrackWheelModels[69].setRotationPoint(90F, 15.5F, 52F);

		rightTrackWheelModels[70].addShapeBox(3F, -8.5F, 0F, 6, 17, 6, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box315
		rightTrackWheelModels[70].setRotationPoint(71F, 15.5F, 52F);

		rightTrackWheelModels[71].addBox(-3F, -8.5F, 0F, 6, 17, 6, 0F); // Import Box316
		rightTrackWheelModels[71].setRotationPoint(71F, 15.5F, 52F);

		rightTrackWheelModels[72].addShapeBox(-9F, -8.5F, 0F, 6, 17, 6, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import Box317
		rightTrackWheelModels[72].setRotationPoint(71F, 15.5F, 52F);

		rightTrackWheelModels[73].addShapeBox(3F, -8.5F, 0F, 6, 17, 6, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box329
		rightTrackWheelModels[73].setRotationPoint(49F, 15.5F, 52F);

		rightTrackWheelModels[74].addBox(-3F, -8.5F, 0F, 6, 17, 6, 0F); // Import Box330
		rightTrackWheelModels[74].setRotationPoint(49F, 15.5F, 52F);

		rightTrackWheelModels[75].addShapeBox(-9F, -8.5F, 0F, 6, 17, 6, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import Box331
		rightTrackWheelModels[75].setRotationPoint(49F, 15.5F, 52F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Import Box7
		leftTrackModel[1] = new ModelRendererTurbo(this, 393, 121, textureX, textureY); // Import Box8
		leftTrackModel[2] = new ModelRendererTurbo(this, 945, 81, textureX, textureY); // Import Box9
		leftTrackModel[3] = new ModelRendererTurbo(this, 929, 105, textureX, textureY); // Import Box10
		leftTrackModel[4] = new ModelRendererTurbo(this, 505, 129, textureX, textureY); // Import Box11
		leftTrackModel[5] = new ModelRendererTurbo(this, 897, 129, textureX, textureY); // Import Box12
		leftTrackModel[6] = new ModelRendererTurbo(this, 217, 145, textureX, textureY); // Import Box13
		leftTrackModel[7] = new ModelRendererTurbo(this, 393, 145, textureX, textureY); // Import Box14
		leftTrackModel[8] = new ModelRendererTurbo(this, 449, 145, textureX, textureY); // Import Box15
		leftTrackModel[9] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Import Box16

		leftTrackModel[0].addBox(0F, 0F, 0F, 242, 1, 15, 0F); // Import Box7
		leftTrackModel[0].setRotationPoint(-128F, 24F, 48F);

		leftTrackModel[1].addBox(0F, 0F, 0F, 45, 1, 15, 0F); // Import Box8
		leftTrackModel[1].setRotationPoint(113F, 24F, 48F);
		leftTrackModel[1].rotateAngleZ = 0.41887902F;

		leftTrackModel[2].addBox(0F, 0F, 0F, 15, 1, 15, 0F); // Import Box9
		leftTrackModel[2].setRotationPoint(154F, 6F, 48F);
		leftTrackModel[2].rotateAngleZ = 1.09955743F;

		leftTrackModel[3].addBox(0F, 0F, 0F, 13, 1, 15, 0F); // Import Box10
		leftTrackModel[3].setRotationPoint(161F, -7F, 48F);
		leftTrackModel[3].rotateAngleZ = 1.93731547F;

		leftTrackModel[4].addBox(0F, 0F, 0F, 15, 1, 15, 0F); // Import Box11
		leftTrackModel[4].setRotationPoint(145F, -28F, 48F);
		leftTrackModel[4].rotateAngleZ = -0.61086524F;

		leftTrackModel[5].addBox(0F, -1F, 0F, 37, 1, 15, 0F); // Import Box12
		leftTrackModel[5].setRotationPoint(-127F, 24F, 48F);
		leftTrackModel[5].rotateAngleZ = 2.82743339F;

		leftTrackModel[6].addBox(0F, -1F, 0F, 9, 1, 15, 0F); // Import Box13
		leftTrackModel[6].setRotationPoint(-162F, 13F, 48F);
		leftTrackModel[6].rotateAngleZ = 1.97222205F;

		leftTrackModel[7].addBox(0F, -1F, 0F, 9, 1, 15, 0F); // Import Box14
		leftTrackModel[7].setRotationPoint(-166F, 5F, 48F);
		leftTrackModel[7].rotateAngleZ = 1.48352986F;

		leftTrackModel[8].addBox(0F, -1F, 0F, 9, 1, 15, 0F); // Import Box15
		leftTrackModel[8].setRotationPoint(-165F, -3F, 48F);
		leftTrackModel[8].rotateAngleZ = 1.01229097F;

		leftTrackModel[9].addBox(0F, -1F, 0F, 308, 1, 15, 0F); // Import Box16
		leftTrackModel[9].setRotationPoint(-161F, -10F, 48F);
		leftTrackModel[9].rotateAngleZ = 0.0567232F;
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import Box64
		rightTrackModel[1] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Import Box7
		rightTrackModel[2] = new ModelRendererTurbo(this, 393, 121, textureX, textureY); // Import Box8
		rightTrackModel[3] = new ModelRendererTurbo(this, 945, 81, textureX, textureY); // Import Box9
		rightTrackModel[4] = new ModelRendererTurbo(this, 929, 105, textureX, textureY); // Import Box10
		rightTrackModel[5] = new ModelRendererTurbo(this, 505, 129, textureX, textureY); // Import Box11
		rightTrackModel[6] = new ModelRendererTurbo(this, 897, 129, textureX, textureY); // Import Box12
		rightTrackModel[7] = new ModelRendererTurbo(this, 217, 145, textureX, textureY); // Import Box13
		rightTrackModel[8] = new ModelRendererTurbo(this, 393, 145, textureX, textureY); // Import Box14
		rightTrackModel[9] = new ModelRendererTurbo(this, 449, 145, textureX, textureY); // Import Box15
		rightTrackModel[10] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Import Box16
		rightTrackModel[11] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import Box64

		rightTrackModel[0].addShapeBox(-9F, -8.5F, 0F, 6, 17, 6, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import Box64
		rightTrackModel[0].setRotationPoint(-80F, 15.5F, -59F);

		rightTrackModel[1].addBox(0F, 0F, 0F, 242, 1, 15, 0F); // Import Box7
		rightTrackModel[1].setRotationPoint(-128F, 24F, -63F);

		rightTrackModel[2].addBox(0F, 0F, 0F, 45, 1, 15, 0F); // Import Box8
		rightTrackModel[2].setRotationPoint(113F, 24F, -63F);
		rightTrackModel[2].rotateAngleZ = 0.41887902F;

		rightTrackModel[3].addBox(0F, 0F, 0F, 15, 1, 15, 0F); // Import Box9
		rightTrackModel[3].setRotationPoint(154F, 6F, -63F);
		rightTrackModel[3].rotateAngleZ = 1.09955743F;

		rightTrackModel[4].addBox(0F, 0F, 0F, 13, 1, 15, 0F); // Import Box10
		rightTrackModel[4].setRotationPoint(161F, -7F, -63F);
		rightTrackModel[4].rotateAngleZ = 1.93731547F;

		rightTrackModel[5].addBox(0F, 0F, 0F, 15, 1, 15, 0F); // Import Box11
		rightTrackModel[5].setRotationPoint(145F, -28F, -63F);
		rightTrackModel[5].rotateAngleZ = -0.61086524F;

		rightTrackModel[6].addBox(0F, -1F, 0F, 37, 1, 15, 0F); // Import Box12
		rightTrackModel[6].setRotationPoint(-127F, 24F, -63F);
		rightTrackModel[6].rotateAngleZ = 2.82743339F;

		rightTrackModel[7].addBox(0F, -1F, 0F, 9, 1, 15, 0F); // Import Box13
		rightTrackModel[7].setRotationPoint(-162F, 13F, -63F);
		rightTrackModel[7].rotateAngleZ = 1.97222205F;

		rightTrackModel[8].addBox(0F, -1F, 0F, 9, 1, 15, 0F); // Import Box14
		rightTrackModel[8].setRotationPoint(-166F, 5F, -63F);
		rightTrackModel[8].rotateAngleZ = 1.48352986F;

		rightTrackModel[9].addBox(0F, -1F, 0F, 9, 1, 15, 0F); // Import Box15
		rightTrackModel[9].setRotationPoint(-165F, -3F, -63F);
		rightTrackModel[9].rotateAngleZ = 1.01229097F;

		rightTrackModel[10].addBox(0F, -1F, 0F, 308, 1, 15, 0F); // Import Box16
		rightTrackModel[10].setRotationPoint(-161F, -10F, -63F);
		rightTrackModel[10].rotateAngleZ = 0.0567232F;

		rightTrackModel[11].addShapeBox(-9F, -8.5F, 0F, 6, 17, 6, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import Box64
		rightTrackModel[11].setRotationPoint(-80F, 15.5F, 52F);
	}
}