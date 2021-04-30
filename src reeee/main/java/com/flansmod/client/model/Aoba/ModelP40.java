//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CAP40
// Model Creator: 
// Created on: 18.12.2016 - 21:06:09
// Last changed on: 18.12.2016 - 21:06:09

package com.flansmod.client.model.Aoba; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelP40 extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelP40() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[189];
		turretModel = new ModelRendererTurbo[15];
		barrelModel = new ModelRendererTurbo[8];
		leftTrackWheelModels = new ModelRendererTurbo[30];
		rightTrackWheelModels = new ModelRendererTurbo[30];
		leftTrackModel = new ModelRendererTurbo[10];
		rightTrackModel = new ModelRendererTurbo[10];

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
		bodyModel[1] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Import Box0
		bodyModel[2] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Import Box1
		bodyModel[3] = new ModelRendererTurbo(this, 793, 81, textureX, textureY); // Import Box3
		bodyModel[4] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Import Box4
		bodyModel[5] = new ModelRendererTurbo(this, 449, 105, textureX, textureY); // Import Box6
		bodyModel[6] = new ModelRendererTurbo(this, 561, 105, textureX, textureY); // Import Box7
		bodyModel[7] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Import Box8
		bodyModel[8] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import Box9
		bodyModel[9] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box10
		bodyModel[10] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import Box11
		bodyModel[11] = new ModelRendererTurbo(this, 649, 105, textureX, textureY); // Import Box12
		bodyModel[12] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Import Box13
		bodyModel[13] = new ModelRendererTurbo(this, 561, 129, textureX, textureY); // Import Box14
		bodyModel[14] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Import Box15
		bodyModel[15] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Import Box16
		bodyModel[16] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Box17
		bodyModel[17] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Import Box18
		bodyModel[18] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Import Box19
		bodyModel[19] = new ModelRendererTurbo(this, 825, 177, textureX, textureY); // Import Box20
		bodyModel[20] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Import Box21
		bodyModel[21] = new ModelRendererTurbo(this, 785, 25, textureX, textureY); // Import Box22
		bodyModel[22] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Import Box23
		bodyModel[23] = new ModelRendererTurbo(this, 913, 81, textureX, textureY); // Import Box25
		bodyModel[24] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Import Box26
		bodyModel[25] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Import Box27
		bodyModel[26] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Import Box28
		bodyModel[27] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Import Box29
		bodyModel[28] = new ModelRendererTurbo(this, 873, 25, textureX, textureY); // Import Box30
		bodyModel[29] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Import Box31
		bodyModel[30] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Import Box32
		bodyModel[31] = new ModelRendererTurbo(this, 961, 25, textureX, textureY); // Import Box33
		bodyModel[32] = new ModelRendererTurbo(this, 985, 25, textureX, textureY); // Import Box34
		bodyModel[33] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Import Box35
		bodyModel[34] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import Box36
		bodyModel[35] = new ModelRendererTurbo(this, 1001, 33, textureX, textureY); // Import Box37
		bodyModel[36] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Import Box38
		bodyModel[37] = new ModelRendererTurbo(this, 961, 41, textureX, textureY); // Import Box39
		bodyModel[38] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Import Box40
		bodyModel[39] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Import Box44
		bodyModel[40] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Import Box45
		bodyModel[41] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Import Box46
		bodyModel[42] = new ModelRendererTurbo(this, 785, 25, textureX, textureY); // Import Box47
		bodyModel[43] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Import Box48
		bodyModel[44] = new ModelRendererTurbo(this, 785, 49, textureX, textureY); // Import Box50
		bodyModel[45] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Import Box51
		bodyModel[46] = new ModelRendererTurbo(this, 817, 49, textureX, textureY); // Import Box52
		bodyModel[47] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Import Box53
		bodyModel[48] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Import Box54
		bodyModel[49] = new ModelRendererTurbo(this, 785, 57, textureX, textureY); // Import Box55
		bodyModel[50] = new ModelRendererTurbo(this, 817, 57, textureX, textureY); // Import Box56
		bodyModel[51] = new ModelRendererTurbo(this, 1009, 49, textureX, textureY); // Import Box57
		bodyModel[52] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import Box58
		bodyModel[53] = new ModelRendererTurbo(this, 1009, 65, textureX, textureY); // Import Box59
		bodyModel[54] = new ModelRendererTurbo(this, 889, 41, textureX, textureY); // Import Box61
		bodyModel[55] = new ModelRendererTurbo(this, 561, 193, textureX, textureY); // Import Box208
		bodyModel[56] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Import Box20
		bodyModel[57] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Import Box21
		bodyModel[58] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Import Box22
		bodyModel[59] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Import Box23
		bodyModel[60] = new ModelRendererTurbo(this, 985, 81, textureX, textureY); // Import Box24
		bodyModel[61] = new ModelRendererTurbo(this, 785, 65, textureX, textureY); // Import Box25
		bodyModel[62] = new ModelRendererTurbo(this, 801, 65, textureX, textureY); // Import Box26
		bodyModel[63] = new ModelRendererTurbo(this, 833, 65, textureX, textureY); // Import Box27
		bodyModel[64] = new ModelRendererTurbo(this, 913, 121, textureX, textureY); // Import Box28
		bodyModel[65] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Import Box29
		bodyModel[66] = new ModelRendererTurbo(this, 945, 121, textureX, textureY); // Import Box30
		bodyModel[67] = new ModelRendererTurbo(this, 913, 81, textureX, textureY); // Import Box31
		bodyModel[68] = new ModelRendererTurbo(this, 409, 161, textureX, textureY); // Import Box32
		bodyModel[69] = new ModelRendererTurbo(this, 769, 169, textureX, textureY); // Import Box33
		bodyModel[70] = new ModelRendererTurbo(this, 745, 193, textureX, textureY); // Import Box34
		bodyModel[71] = new ModelRendererTurbo(this, 1009, 97, textureX, textureY); // Import Box35
		bodyModel[72] = new ModelRendererTurbo(this, 769, 145, textureX, textureY); // Import Box36
		bodyModel[73] = new ModelRendererTurbo(this, 265, 153, textureX, textureY); // Import Box42
		bodyModel[74] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Import Box44
		bodyModel[75] = new ModelRendererTurbo(this, 809, 169, textureX, textureY); // Import Box45
		bodyModel[76] = new ModelRendererTurbo(this, 841, 169, textureX, textureY); // Import Box49
		bodyModel[77] = new ModelRendererTurbo(this, 873, 169, textureX, textureY); // Import Box50
		bodyModel[78] = new ModelRendererTurbo(this, 969, 121, textureX, textureY); // Import Box51
		bodyModel[79] = new ModelRendererTurbo(this, 465, 129, textureX, textureY); // Import Box52
		bodyModel[80] = new ModelRendererTurbo(this, 249, 201, textureX, textureY); // Import Box53
		bodyModel[81] = new ModelRendererTurbo(this, 1009, 145, textureX, textureY); // Import Box54
		bodyModel[82] = new ModelRendererTurbo(this, 905, 169, textureX, textureY); // Import Box55
		bodyModel[83] = new ModelRendererTurbo(this, 513, 129, textureX, textureY); // Import Box56
		bodyModel[84] = new ModelRendererTurbo(this, 937, 169, textureX, textureY); // Import Box57
		bodyModel[85] = new ModelRendererTurbo(this, 737, 321, textureX, textureY); // Import Box67
		bodyModel[86] = new ModelRendererTurbo(this, 1, 345, textureX, textureY); // Import Box68
		bodyModel[87] = new ModelRendererTurbo(this, 745, 209, textureX, textureY); // Import Box69
		bodyModel[88] = new ModelRendererTurbo(this, 217, 153, textureX, textureY); // Import Box70
		bodyModel[89] = new ModelRendererTurbo(this, 505, 153, textureX, textureY); // Import Box71
		bodyModel[90] = new ModelRendererTurbo(this, 561, 153, textureX, textureY); // Import Box72
		bodyModel[91] = new ModelRendererTurbo(this, 689, 217, textureX, textureY); // Import Box73
		bodyModel[92] = new ModelRendererTurbo(this, 673, 153, textureX, textureY); // Import Box74
		bodyModel[93] = new ModelRendererTurbo(this, 769, 217, textureX, textureY); // Import Box75
		bodyModel[94] = new ModelRendererTurbo(this, 217, 177, textureX, textureY); // Import Box76
		bodyModel[95] = new ModelRendererTurbo(this, 281, 201, textureX, textureY); // Import Box77
		bodyModel[96] = new ModelRendererTurbo(this, 409, 201, textureX, textureY); // Import Box78
		bodyModel[97] = new ModelRendererTurbo(this, 49, 225, textureX, textureY); // Import Box79
		bodyModel[98] = new ModelRendererTurbo(this, 617, 201, textureX, textureY); // Import Box80
		bodyModel[99] = new ModelRendererTurbo(this, 305, 153, textureX, textureY); // Import Box81
		bodyModel[100] = new ModelRendererTurbo(this, 993, 201, textureX, textureY); // Import Box82
		bodyModel[101] = new ModelRendererTurbo(this, 377, 225, textureX, textureY); // Import Box83
		bodyModel[102] = new ModelRendererTurbo(this, 441, 225, textureX, textureY); // Import Box84
		bodyModel[103] = new ModelRendererTurbo(this, 593, 225, textureX, textureY); // Import Box85
		bodyModel[104] = new ModelRendererTurbo(this, 897, 225, textureX, textureY); // Import Box86
		bodyModel[105] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Import Box87
		bodyModel[106] = new ModelRendererTurbo(this, 185, 161, textureX, textureY); // Import Box88
		bodyModel[107] = new ModelRendererTurbo(this, 481, 225, textureX, textureY); // Import Box89
		bodyModel[108] = new ModelRendererTurbo(this, 369, 161, textureX, textureY); // Import Box90
		bodyModel[109] = new ModelRendererTurbo(this, 545, 225, textureX, textureY); // Import Box91
		bodyModel[110] = new ModelRendererTurbo(this, 817, 225, textureX, textureY); // Import Box92
		bodyModel[111] = new ModelRendererTurbo(this, 1009, 169, textureX, textureY); // Import Box93
		bodyModel[112] = new ModelRendererTurbo(this, 377, 233, textureX, textureY); // Import Box94
		bodyModel[113] = new ModelRendererTurbo(this, 473, 233, textureX, textureY); // Import Box95
		bodyModel[114] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Import Box96
		bodyModel[115] = new ModelRendererTurbo(this, 545, 233, textureX, textureY); // Import Box97
		bodyModel[116] = new ModelRendererTurbo(this, 185, 185, textureX, textureY); // Import Box98
		bodyModel[117] = new ModelRendererTurbo(this, 1001, 209, textureX, textureY); // Import Box99
		bodyModel[118] = new ModelRendererTurbo(this, 673, 345, textureX, textureY); // Import Box7
		bodyModel[119] = new ModelRendererTurbo(this, 673, 369, textureX, textureY); // Import Box8
		bodyModel[120] = new ModelRendererTurbo(this, 473, 345, textureX, textureY); // Import Box9
		bodyModel[121] = new ModelRendererTurbo(this, 857, 369, textureX, textureY); // Import Box10
		bodyModel[122] = new ModelRendererTurbo(this, 985, 281, textureX, textureY); // Import Box11
		bodyModel[123] = new ModelRendererTurbo(this, 561, 345, textureX, textureY); // Import Box13
		bodyModel[124] = new ModelRendererTurbo(this, 121, 393, textureX, textureY); // Import Box14
		bodyModel[125] = new ModelRendererTurbo(this, 289, 393, textureX, textureY); // Import Box15
		bodyModel[126] = new ModelRendererTurbo(this, 937, 369, textureX, textureY); // Import Box16
		bodyModel[127] = new ModelRendererTurbo(this, 1, 393, textureX, textureY); // Import Box17
		bodyModel[128] = new ModelRendererTurbo(this, 457, 393, textureX, textureY); // Import Box18
		bodyModel[129] = new ModelRendererTurbo(this, 569, 393, textureX, textureY); // Import Box19
		bodyModel[130] = new ModelRendererTurbo(this, 121, 417, textureX, textureY); // Import Box20
		bodyModel[131] = new ModelRendererTurbo(this, 769, 393, textureX, textureY); // Import Box21
		bodyModel[132] = new ModelRendererTurbo(this, 857, 393, textureX, textureY); // Import Box22
		bodyModel[133] = new ModelRendererTurbo(this, 321, 417, textureX, textureY); // Import Box23
		bodyModel[134] = new ModelRendererTurbo(this, 1, 417, textureX, textureY); // Import Box25
		bodyModel[135] = new ModelRendererTurbo(this, 377, 241, textureX, textureY); // Import Box69
		bodyModel[136] = new ModelRendererTurbo(this, 441, 201, textureX, textureY); // Import Box70
		bodyModel[137] = new ModelRendererTurbo(this, 537, 201, textureX, textureY); // Import Box71
		bodyModel[138] = new ModelRendererTurbo(this, 409, 217, textureX, textureY); // Import Box72
		bodyModel[139] = new ModelRendererTurbo(this, 441, 241, textureX, textureY); // Import Box73
		bodyModel[140] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Import Box74
		bodyModel[141] = new ModelRendererTurbo(this, 825, 257, textureX, textureY); // Import Box75
		bodyModel[142] = new ModelRendererTurbo(this, 409, 233, textureX, textureY); // Import Box76
		bodyModel[143] = new ModelRendererTurbo(this, 833, 233, textureX, textureY); // Import Box77
		bodyModel[144] = new ModelRendererTurbo(this, 473, 241, textureX, textureY); // Import Box78
		bodyModel[145] = new ModelRendererTurbo(this, 897, 265, textureX, textureY); // Import Box79
		bodyModel[146] = new ModelRendererTurbo(this, 513, 273, textureX, textureY); // Import Box80
		bodyModel[147] = new ModelRendererTurbo(this, 97, 225, textureX, textureY); // Import Box81
		bodyModel[148] = new ModelRendererTurbo(this, 689, 257, textureX, textureY); // Import Box82
		bodyModel[149] = new ModelRendererTurbo(this, 721, 257, textureX, textureY); // Import Box83
		bodyModel[150] = new ModelRendererTurbo(this, 377, 273, textureX, textureY); // Import Box84
		bodyModel[151] = new ModelRendererTurbo(this, 417, 273, textureX, textureY); // Import Box85
		bodyModel[152] = new ModelRendererTurbo(this, 113, 305, textureX, textureY); // Import Box86
		bodyModel[153] = new ModelRendererTurbo(this, 753, 257, textureX, textureY); // Import Box87
		bodyModel[154] = new ModelRendererTurbo(this, 721, 193, textureX, textureY); // Import Box88
		bodyModel[155] = new ModelRendererTurbo(this, 161, 281, textureX, textureY); // Import Box89
		bodyModel[156] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Import Box90
		bodyModel[157] = new ModelRendererTurbo(this, 561, 305, textureX, textureY); // Import Box91
		bodyModel[158] = new ModelRendererTurbo(this, 593, 305, textureX, textureY); // Import Box92
		bodyModel[159] = new ModelRendererTurbo(this, 465, 273, textureX, textureY); // Import Box93
		bodyModel[160] = new ModelRendererTurbo(this, 625, 305, textureX, textureY); // Import Box94
		bodyModel[161] = new ModelRendererTurbo(this, 657, 305, textureX, textureY); // Import Box95
		bodyModel[162] = new ModelRendererTurbo(this, 537, 273, textureX, textureY); // Import Box96
		bodyModel[163] = new ModelRendererTurbo(this, 689, 305, textureX, textureY); // Import Box97
		bodyModel[164] = new ModelRendererTurbo(this, 721, 209, textureX, textureY); // Import Box98
		bodyModel[165] = new ModelRendererTurbo(this, 833, 273, textureX, textureY); // Import Box99
		bodyModel[166] = new ModelRendererTurbo(this, 265, 441, textureX, textureY); // Import Box6
		bodyModel[167] = new ModelRendererTurbo(this, 497, 441, textureX, textureY); // Import Box6
		bodyModel[168] = new ModelRendererTurbo(this, 553, 441, textureX, textureY); // Import Box18
		bodyModel[169] = new ModelRendererTurbo(this, 721, 441, textureX, textureY); // Import Box18
		bodyModel[170] = new ModelRendererTurbo(this, 721, 305, textureX, textureY); // Import Box18
		bodyModel[171] = new ModelRendererTurbo(this, 969, 353, textureX, textureY); // Import Box18
		bodyModel[172] = new ModelRendererTurbo(this, 89, 417, textureX, textureY); // Import Box18
		bodyModel[173] = new ModelRendererTurbo(this, 745, 305, textureX, textureY); // Import Box18
		bodyModel[174] = new ModelRendererTurbo(this, 809, 393, textureX, textureY); // Import Box18
		bodyModel[175] = new ModelRendererTurbo(this, 1001, 417, textureX, textureY); // Import Box18
		bodyModel[176] = new ModelRendererTurbo(this, 817, 441, textureX, textureY); // Import Box1
		bodyModel[177] = new ModelRendererTurbo(this, 625, 441, textureX, textureY); // Import Box2
		bodyModel[178] = new ModelRendererTurbo(this, 889, 441, textureX, textureY); // Import Box18
		bodyModel[179] = new ModelRendererTurbo(this, 321, 457, textureX, textureY); // Import Box1
		bodyModel[180] = new ModelRendererTurbo(this, 393, 457, textureX, textureY); // Import Box2
		bodyModel[181] = new ModelRendererTurbo(this, 625, 457, textureX, textureY); // Import Box18
		bodyModel[182] = new ModelRendererTurbo(this, 945, 449, textureX, textureY); // Import Box18
		bodyModel[183] = new ModelRendererTurbo(this, 433, 457, textureX, textureY); // Import Box18
		bodyModel[184] = new ModelRendererTurbo(this, 1, 465, textureX, textureY); // Import Box1
		bodyModel[185] = new ModelRendererTurbo(this, 809, 465, textureX, textureY); // Import Box3
		bodyModel[186] = new ModelRendererTurbo(this, 209, 481, textureX, textureY); // Import Box1
		bodyModel[187] = new ModelRendererTurbo(this, 513, 489, textureX, textureY); // Import Box1
		bodyModel[188] = new ModelRendererTurbo(this, 873, 473, textureX, textureY); // Import Box3

		bodyModel[0].addBox(-2F, -2F, 0F, 80, 32, 77, 0F); // Import Box0
		bodyModel[0].setRotationPoint(-31F, -45F, -39F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 190, 23, 77, 0F,21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		bodyModel[1].setRotationPoint(-109F, -15F, -39F);

		bodyModel[2].addBox(-2F, -2F, 0F, 22, 25, 52, 0F); // Import Box1
		bodyModel[2].setRotationPoint(-72F, -44F, -26F);
		bodyModel[2].rotateAngleZ = 0.10471976F;

		bodyModel[3].addShapeBox(-2F, -2F, 0F, 24, 17, 67, 0F,0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F); // Import Box3
		bodyModel[3].setRotationPoint(-122F, -30F, -34F);

		bodyModel[4].addShapeBox(-2F, -2F, 0F, 25, 15, 77, 0F,0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Import Box4
		bodyModel[4].setRotationPoint(74F, -28F, -39F);

		bodyModel[5].addShapeBox(-2F, -2F, 0F, 17, 16, 77, 0F,0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F); // Import Box6
		bodyModel[5].setRotationPoint(83F, -6F, -39F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 80, 19, 2, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -5F, -4F, 0F, -5F, -4F, 0F, 0F, 0F, 0F); // Import Box7
		bodyModel[6].setRotationPoint(15F, -32F, -60F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 80, 19, 2, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Import Box8
		bodyModel[7].setRotationPoint(-65F, -28F, -60F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 38, 19, 2, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -4F, 0F); // Import Box9
		bodyModel[8].setRotationPoint(-103F, -21F, -60F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 34, 17, 2, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, -11F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -11F, -7F, 0F); // Import Box10
		bodyModel[9].setRotationPoint(-137F, -16F, -60F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 14, 15, 2, 0F,-5F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F); // Import Box11
		bodyModel[10].setRotationPoint(90F, -32F, -60F);

		bodyModel[11].addShapeBox(-2F, -2F, 0F, 19, 7, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Import Box12
		bodyModel[11].setRotationPoint(83F, -13F, -39F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 14, 15, 2, 0F,-5F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F); // Import Box13
		bodyModel[12].setRotationPoint(90F, -32F, -41F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 80, 19, 2, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -5F, -4F, 0F, -5F, -4F, 0F, 0F, 0F, 0F); // Import Box14
		bodyModel[13].setRotationPoint(15F, -32F, -41F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 80, 19, 2, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Import Box15
		bodyModel[14].setRotationPoint(-65F, -28F, -41F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 38, 19, 2, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -4F, 0F); // Import Box16
		bodyModel[15].setRotationPoint(-103F, -21F, -41F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 34, 17, 2, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, -11F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -11F, -7F, 0F); // Import Box17
		bodyModel[16].setRotationPoint(-137F, -16F, -41F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 38, 6, 17, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -4F, 0F); // Import Box18
		bodyModel[17].setRotationPoint(-103F, -21F, -58F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 80, 6, 17, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Import Box19
		bodyModel[18].setRotationPoint(-65F, -28F, -58F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 80, 6, 17, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -5F, -4F, 0F, -5F, -4F, 0F, 0F, 0F, 0F); // Import Box20
		bodyModel[19].setRotationPoint(15F, -32F, -58F);

		bodyModel[20].addBox(0F, 0F, 0F, 11, 2, 17, 0F); // Import Box21
		bodyModel[20].setRotationPoint(95F, -32F, -58F);
		bodyModel[20].rotateAngleZ = -0.57595865F;

		bodyModel[21].addShapeBox(0F, 0F, 0F, 34, 6, 17, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, -11F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -11F, -7F, 0F); // Import Box22
		bodyModel[21].setRotationPoint(-137F, -16F, -58F);

		bodyModel[22].addShapeBox(-2F, -2F, 0F, 80, 16, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 5F, 0F); // Import Box23
		bodyModel[22].setRotationPoint(-31F, -45F, 38F);

		bodyModel[23].addShapeBox(-2F, -2F, 0F, 24, 16, 16, 0F,0F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, -12F, 0F, 0F, -12F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import Box25
		bodyModel[23].setRotationPoint(49F, -45F, 38F);

		bodyModel[24].addBox(0F, 0F, 0F, 10, 9, 2, 0F); // Import Box26
		bodyModel[24].setRotationPoint(-63F, -1F, -45F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box27
		bodyModel[25].setRotationPoint(-53F, -1F, -45F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box28
		bodyModel[26].setRotationPoint(-68F, -1F, -45F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box29
		bodyModel[27].setRotationPoint(-68F, -1F, -54F);

		bodyModel[28].addBox(0F, 0F, 0F, 10, 9, 2, 0F); // Import Box30
		bodyModel[28].setRotationPoint(-63F, -1F, -54F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box31
		bodyModel[29].setRotationPoint(-53F, -1F, -54F);

		bodyModel[30].addBox(0F, 0F, 0F, 5, 7, 7, 0F); // Import Box32
		bodyModel[30].setRotationPoint(-70F, 0F, -52F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 7, 7, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box33
		bodyModel[31].setRotationPoint(-65F, 0F, -52F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 5, 7, 0F,0F, 0F, 0F, 7F, 7F, 0F, 7F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, -5F, 0F, 7F, -5F, 0F, 0F, 0F, 0F); // Import Box34
		bodyModel[32].setRotationPoint(-79F, 7F, -52F);

		bodyModel[33].addShapeBox(24F, 0F, 0F, 2, 5, 7, 0F,7F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 7F, 0F, 7F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, -5F, 0F); // Import Box35
		bodyModel[33].setRotationPoint(-63F, 7F, -52F);

		bodyModel[34].addBox(0F, 0F, 0F, 5, 7, 7, 0F); // Import Box36
		bodyModel[34].setRotationPoint(-51F, 0F, -52F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 7, 7, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box37
		bodyModel[35].setRotationPoint(-54F, 0F, -52F);

		bodyModel[36].addBox(0F, 0F, 0F, 3, 9, 3, 0F); // Import Box38
		bodyModel[36].setRotationPoint(-39F, 8F, -55F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box39
		bodyModel[37].setRotationPoint(-36F, 13F, -55F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box40
		bodyModel[38].setRotationPoint(-49F, 13F, -55F);

		bodyModel[39].addBox(0F, 0F, 0F, 13, 6, 4, 0F); // Import Box44
		bodyModel[39].setRotationPoint(-65F, -8F, -50F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 18, 6, 4, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box45
		bodyModel[40].setRotationPoint(-52F, -8F, -50F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 18, 6, 4, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box46
		bodyModel[41].setRotationPoint(-83F, -8F, -50F);

		bodyModel[42].addBox(0F, 0F, 0F, 4, 7, 4, 0F); // Import Box47
		bodyModel[42].setRotationPoint(-37F, 1F, -50F);

		bodyModel[43].addBox(0F, 0F, 0F, 2, 12, 2, 0F); // Import Box48
		bodyModel[43].setRotationPoint(-36F, -2F, -49F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box50
		bodyModel[44].setRotationPoint(-36F, 13F, -46F);

		bodyModel[45].addBox(0F, 0F, 0F, 3, 9, 3, 0F); // Import Box51
		bodyModel[45].setRotationPoint(-39F, 8F, -46F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box52
		bodyModel[46].setRotationPoint(-49F, 13F, -46F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box53
		bodyModel[47].setRotationPoint(-77F, 13F, -46F);

		bodyModel[48].addBox(0F, 0F, 0F, 3, 9, 3, 0F); // Import Box54
		bodyModel[48].setRotationPoint(-80F, 8F, -46F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box55
		bodyModel[49].setRotationPoint(-90F, 13F, -46F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box56
		bodyModel[50].setRotationPoint(-77F, 13F, -55F);

		bodyModel[51].addBox(0F, 0F, 0F, 3, 9, 3, 0F); // Import Box57
		bodyModel[51].setRotationPoint(-80F, 8F, -55F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box58
		bodyModel[52].setRotationPoint(-90F, 13F, -55F);

		bodyModel[53].addBox(0F, 0F, 0F, 2, 12, 2, 0F); // Import Box59
		bodyModel[53].setRotationPoint(-83F, -2F, -49F);

		bodyModel[54].addBox(0F, 0F, 0F, 4, 7, 4, 0F); // Import Box61
		bodyModel[54].setRotationPoint(-84F, 1F, -50F);

		bodyModel[55].addShapeBox(-2F, -2F, 0F, 25, 32, 77, 0F,0F, 0F, 0F, 0F, -17F, 0F, 0F, -17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box208
		bodyModel[55].setRotationPoint(49F, -45F, -39F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box20
		bodyModel[56].setRotationPoint(-5F, 13F, -55F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box21
		bodyModel[57].setRotationPoint(8F, 13F, -55F);

		bodyModel[58].addBox(0F, 0F, 0F, 3, 9, 3, 0F); // Import Box22
		bodyModel[58].setRotationPoint(5F, 8F, -55F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 5, 7, 0F,0F, 0F, 0F, 7F, 7F, 0F, 7F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, -5F, 0F, 7F, -5F, 0F, 0F, 0F, 0F); // Import Box23
		bodyModel[59].setRotationPoint(6F, 7F, -52F);

		bodyModel[60].addBox(0F, 0F, 0F, 5, 7, 7, 0F); // Import Box24
		bodyModel[60].setRotationPoint(15F, 0F, -52F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box25
		bodyModel[61].setRotationPoint(17F, -1F, -54F);

		bodyModel[62].addBox(0F, 0F, 0F, 10, 9, 2, 0F); // Import Box26
		bodyModel[62].setRotationPoint(22F, -1F, -54F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box27
		bodyModel[63].setRotationPoint(32F, -1F, -54F);

		bodyModel[64].addBox(0F, 0F, 0F, 5, 7, 7, 0F); // Import Box28
		bodyModel[64].setRotationPoint(34F, 0F, -52F);

		bodyModel[65].addShapeBox(24F, 0F, 0F, 2, 5, 7, 0F,7F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 7F, 0F, 7F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, -5F, 0F); // Import Box29
		bodyModel[65].setRotationPoint(22F, 7F, -52F);

		bodyModel[66].addBox(0F, 0F, 0F, 4, 7, 4, 0F); // Import Box30
		bodyModel[66].setRotationPoint(48F, 1F, -50F);

		bodyModel[67].addBox(0F, 0F, 0F, 2, 12, 2, 0F); // Import Box31
		bodyModel[67].setRotationPoint(49F, -2F, -49F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 18, 6, 4, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box32
		bodyModel[68].setRotationPoint(33F, -8F, -50F);

		bodyModel[69].addBox(0F, 0F, 0F, 13, 6, 4, 0F); // Import Box33
		bodyModel[69].setRotationPoint(20F, -8F, -50F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 18, 6, 4, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box34
		bodyModel[70].setRotationPoint(2F, -8F, -50F);

		bodyModel[71].addBox(0F, 0F, 0F, 2, 12, 2, 0F); // Import Box35
		bodyModel[71].setRotationPoint(2F, -2F, -49F);

		bodyModel[72].addBox(0F, 0F, 0F, 4, 7, 4, 0F); // Import Box36
		bodyModel[72].setRotationPoint(1F, 1F, -50F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box42
		bodyModel[73].setRotationPoint(36F, 13F, -55F);

		bodyModel[74].addBox(0F, 0F, 0F, 3, 9, 3, 0F); // Import Box44
		bodyModel[74].setRotationPoint(46F, 8F, -55F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box45
		bodyModel[75].setRotationPoint(49F, 13F, -55F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box49
		bodyModel[76].setRotationPoint(49F, 13F, -46F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box50
		bodyModel[77].setRotationPoint(36F, 13F, -46F);

		bodyModel[78].addBox(0F, 0F, 0F, 3, 9, 3, 0F); // Import Box51
		bodyModel[78].setRotationPoint(46F, 8F, -46F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box52
		bodyModel[79].setRotationPoint(32F, -1F, -45F);

		bodyModel[80].addBox(0F, 0F, 0F, 10, 9, 2, 0F); // Import Box53
		bodyModel[80].setRotationPoint(22F, -1F, -45F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box54
		bodyModel[81].setRotationPoint(17F, -1F, -45F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box55
		bodyModel[82].setRotationPoint(8F, 13F, -46F);

		bodyModel[83].addBox(0F, 0F, 0F, 3, 9, 3, 0F); // Import Box56
		bodyModel[83].setRotationPoint(5F, 8F, -46F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box57
		bodyModel[84].setRotationPoint(-5F, 13F, -46F);

		bodyModel[85].addBox(0F, 0F, 0F, 4, 4, 109, 0F); // Import Box67
		bodyModel[85].setRotationPoint(25F, 2F, -55F);

		bodyModel[86].addBox(0F, 0F, 0F, 4, 4, 109, 0F); // Import Box68
		bodyModel[86].setRotationPoint(-60F, 2F, -55F);

		bodyModel[87].addBox(0F, 0F, 0F, 10, 9, 2, 0F); // Import Box69
		bodyModel[87].setRotationPoint(-63F, -1F, 42F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box70
		bodyModel[88].setRotationPoint(-53F, -1F, 42F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box71
		bodyModel[89].setRotationPoint(-68F, -1F, 42F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box72
		bodyModel[90].setRotationPoint(-68F, -1F, 51F);

		bodyModel[91].addBox(0F, 0F, 0F, 10, 9, 2, 0F); // Import Box73
		bodyModel[91].setRotationPoint(-63F, -1F, 51F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box74
		bodyModel[92].setRotationPoint(-53F, -1F, 51F);

		bodyModel[93].addBox(0F, 0F, 0F, 5, 7, 7, 0F); // Import Box75
		bodyModel[93].setRotationPoint(-70F, 0F, 44F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 3, 7, 7, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box76
		bodyModel[94].setRotationPoint(-65F, 0F, 44F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 5, 7, 0F,0F, 0F, 0F, 7F, 7F, 0F, 7F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, -5F, 0F, 7F, -5F, 0F, 0F, 0F, 0F); // Import Box77
		bodyModel[95].setRotationPoint(-79F, 7F, 44F);

		bodyModel[96].addShapeBox(24F, 0F, 0F, 2, 5, 7, 0F,7F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 7F, 0F, 7F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, -5F, 0F); // Import Box78
		bodyModel[96].setRotationPoint(-63F, 7F, 44F);

		bodyModel[97].addBox(0F, 0F, 0F, 5, 7, 7, 0F); // Import Box79
		bodyModel[97].setRotationPoint(-51F, 0F, 44F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 3, 7, 7, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box80
		bodyModel[98].setRotationPoint(-54F, 0F, 44F);

		bodyModel[99].addBox(0F, 0F, 0F, 3, 9, 3, 0F); // Import Box81
		bodyModel[99].setRotationPoint(-39F, 8F, 51F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box82
		bodyModel[100].setRotationPoint(-36F, 13F, 51F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box83
		bodyModel[101].setRotationPoint(-49F, 13F, 51F);

		bodyModel[102].addBox(0F, 0F, 0F, 13, 6, 4, 0F); // Import Box84
		bodyModel[102].setRotationPoint(-65F, -8F, 45F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 18, 6, 4, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box85
		bodyModel[103].setRotationPoint(-52F, -8F, 45F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 18, 6, 4, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box86
		bodyModel[104].setRotationPoint(-83F, -8F, 45F);

		bodyModel[105].addBox(0F, 0F, 0F, 4, 7, 4, 0F); // Import Box87
		bodyModel[105].setRotationPoint(-37F, 1F, 45F);

		bodyModel[106].addBox(0F, 0F, 0F, 2, 12, 2, 0F); // Import Box88
		bodyModel[106].setRotationPoint(-36F, -2F, 46F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box89
		bodyModel[107].setRotationPoint(-36F, 13F, 42F);

		bodyModel[108].addBox(0F, 0F, 0F, 3, 9, 3, 0F); // Import Box90
		bodyModel[108].setRotationPoint(-39F, 8F, 42F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box91
		bodyModel[109].setRotationPoint(-49F, 13F, 42F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box92
		bodyModel[110].setRotationPoint(-77F, 13F, 42F);

		bodyModel[111].addBox(0F, 0F, 0F, 3, 9, 3, 0F); // Import Box93
		bodyModel[111].setRotationPoint(-80F, 8F, 42F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box94
		bodyModel[112].setRotationPoint(-90F, 13F, 42F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box95
		bodyModel[113].setRotationPoint(-77F, 13F, 51F);

		bodyModel[114].addBox(0F, 0F, 0F, 3, 9, 3, 0F); // Import Box96
		bodyModel[114].setRotationPoint(-80F, 8F, 51F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box97
		bodyModel[115].setRotationPoint(-90F, 13F, 51F);

		bodyModel[116].addBox(0F, 0F, 0F, 2, 12, 2, 0F); // Import Box98
		bodyModel[116].setRotationPoint(-83F, -2F, 46F);

		bodyModel[117].addBox(0F, 0F, 0F, 4, 7, 4, 0F); // Import Box99
		bodyModel[117].setRotationPoint(-84F, 1F, 45F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 80, 19, 2, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -5F, -4F, 0F, -5F, -4F, 0F, 0F, 0F, 0F); // Import Box7
		bodyModel[118].setRotationPoint(15F, -32F, 38F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 80, 19, 2, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Import Box8
		bodyModel[119].setRotationPoint(-65F, -28F, 38F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 38, 19, 2, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -4F, 0F); // Import Box9
		bodyModel[120].setRotationPoint(-103F, -21F, 38F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 34, 17, 2, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, -11F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -11F, -7F, 0F); // Import Box10
		bodyModel[121].setRotationPoint(-137F, -16F, 38F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 14, 15, 2, 0F,-5F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F); // Import Box11
		bodyModel[122].setRotationPoint(90F, -32F, 38F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 14, 15, 2, 0F,-5F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F); // Import Box13
		bodyModel[123].setRotationPoint(90F, -32F, 57F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 80, 19, 2, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -5F, -4F, 0F, -5F, -4F, 0F, 0F, 0F, 0F); // Import Box14
		bodyModel[124].setRotationPoint(15F, -32F, 57F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 80, 19, 2, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Import Box15
		bodyModel[125].setRotationPoint(-65F, -28F, 57F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 38, 19, 2, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -4F, 0F); // Import Box16
		bodyModel[126].setRotationPoint(-103F, -21F, 57F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 34, 17, 2, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, -11F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -11F, -7F, 0F); // Import Box17
		bodyModel[127].setRotationPoint(-137F, -16F, 57F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 38, 6, 17, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -4F, 0F); // Import Box18
		bodyModel[128].setRotationPoint(-103F, -21F, 40F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 80, 6, 17, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Import Box19
		bodyModel[129].setRotationPoint(-65F, -28F, 40F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 80, 6, 17, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -5F, -4F, 0F, -5F, -4F, 0F, 0F, 0F, 0F); // Import Box20
		bodyModel[130].setRotationPoint(15F, -32F, 40F);

		bodyModel[131].addBox(0F, 0F, 0F, 11, 2, 17, 0F); // Import Box21
		bodyModel[131].setRotationPoint(95F, -32F, 40F);
		bodyModel[131].rotateAngleZ = -0.57595865F;

		bodyModel[132].addShapeBox(0F, 0F, 0F, 34, 6, 17, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, -11F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -11F, -7F, 0F); // Import Box22
		bodyModel[132].setRotationPoint(-137F, -16F, 40F);

		bodyModel[133].addShapeBox(-2F, -2F, 0F, 80, 16, 16, 0F,0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 5F, 0F); // Import Box23
		bodyModel[133].setRotationPoint(-31F, -45F, -55F);

		bodyModel[134].addShapeBox(-2F, -2F, 0F, 24, 16, 16, 0F,0F, 0F, -12F, -24F, 0F, -12F, -24F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import Box25
		bodyModel[134].setRotationPoint(49F, -45F, -55F);

		bodyModel[135].addBox(0F, 0F, 0F, 10, 9, 2, 0F); // Import Box69
		bodyModel[135].setRotationPoint(22F, -1F, 42F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box70
		bodyModel[136].setRotationPoint(32F, -1F, 42F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box71
		bodyModel[137].setRotationPoint(17F, -1F, 43F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box72
		bodyModel[138].setRotationPoint(17F, -1F, 51F);

		bodyModel[139].addBox(0F, 0F, 0F, 10, 9, 2, 0F); // Import Box73
		bodyModel[139].setRotationPoint(22F, -1F, 51F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box74
		bodyModel[140].setRotationPoint(32F, -1F, 51F);

		bodyModel[141].addBox(0F, 0F, 0F, 5, 7, 7, 0F); // Import Box75
		bodyModel[141].setRotationPoint(15F, 0F, 44F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 3, 7, 7, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box76
		bodyModel[142].setRotationPoint(20F, 0F, 44F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 2, 5, 7, 0F,0F, 0F, 0F, 7F, 7F, 0F, 7F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, -5F, 0F, 7F, -5F, 0F, 0F, 0F, 0F); // Import Box77
		bodyModel[143].setRotationPoint(6F, 7F, 44F);

		bodyModel[144].addShapeBox(24F, 0F, 0F, 2, 5, 7, 0F,7F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 7F, 0F, 7F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, -5F, 0F); // Import Box78
		bodyModel[144].setRotationPoint(22F, 7F, 44F);

		bodyModel[145].addBox(0F, 0F, 0F, 5, 7, 7, 0F); // Import Box79
		bodyModel[145].setRotationPoint(34F, 0F, 44F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 3, 7, 7, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box80
		bodyModel[146].setRotationPoint(31F, 0F, 44F);

		bodyModel[147].addBox(0F, 0F, 0F, 3, 9, 3, 0F); // Import Box81
		bodyModel[147].setRotationPoint(46F, 8F, 51F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box82
		bodyModel[148].setRotationPoint(49F, 13F, 51F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box83
		bodyModel[149].setRotationPoint(36F, 13F, 51F);

		bodyModel[150].addBox(0F, 0F, 0F, 13, 6, 4, 0F); // Import Box84
		bodyModel[150].setRotationPoint(20F, -8F, 45F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 18, 6, 4, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box85
		bodyModel[151].setRotationPoint(33F, -8F, 45F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 18, 6, 4, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box86
		bodyModel[152].setRotationPoint(2F, -8F, 45F);

		bodyModel[153].addBox(0F, 0F, 0F, 4, 7, 4, 0F); // Import Box87
		bodyModel[153].setRotationPoint(48F, 1F, 45F);

		bodyModel[154].addBox(0F, 0F, 0F, 2, 12, 2, 0F); // Import Box88
		bodyModel[154].setRotationPoint(49F, -2F, 46F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box89
		bodyModel[155].setRotationPoint(49F, 13F, 42F);

		bodyModel[156].addBox(0F, 0F, 0F, 3, 9, 3, 0F); // Import Box90
		bodyModel[156].setRotationPoint(46F, 8F, 42F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box91
		bodyModel[157].setRotationPoint(36F, 13F, 42F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box92
		bodyModel[158].setRotationPoint(8F, 13F, 42F);

		bodyModel[159].addBox(0F, 0F, 0F, 3, 9, 3, 0F); // Import Box93
		bodyModel[159].setRotationPoint(5F, 8F, 42F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box94
		bodyModel[160].setRotationPoint(-5F, 13F, 42F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box95
		bodyModel[161].setRotationPoint(8F, 13F, 51F);

		bodyModel[162].addBox(0F, 0F, 0F, 3, 9, 3, 0F); // Import Box96
		bodyModel[162].setRotationPoint(5F, 8F, 51F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box97
		bodyModel[163].setRotationPoint(-5F, 13F, 51F);

		bodyModel[164].addBox(0F, 0F, 0F, 2, 12, 2, 0F); // Import Box98
		bodyModel[164].setRotationPoint(2F, -2F, 46F);

		bodyModel[165].addBox(0F, 0F, 0F, 4, 7, 4, 0F); // Import Box99
		bodyModel[165].setRotationPoint(1F, 1F, 45F);

		bodyModel[166].addBox(-2F, -6F, -20.5F, 3, 11, 21, 0F); // Import Box6
		bodyModel[166].setRotationPoint(59F, -39F, 32.5F);
		bodyModel[166].rotateAngleZ = 0.9424778F;

		bodyModel[167].addShapeBox(-2F, 5F, -20.5F, 3, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import Box6
		bodyModel[167].setRotationPoint(59F, -39F, 32.5F);
		bodyModel[167].rotateAngleZ = 0.9424778F;

		bodyModel[168].addBox(0F, 0F, 0F, 27, 10, 17, 0F); // Import Box18
		bodyModel[168].setRotationPoint(-60F, -34F, -56F);

		bodyModel[169].addBox(0F, 0F, 0F, 27, 10, 17, 0F); // Import Box18
		bodyModel[169].setRotationPoint(-60F, -34F, 38F);

		bodyModel[170].addBox(0F, 0F, 0F, 5, 8, 5, 0F); // Import Box18
		bodyModel[170].setRotationPoint(-49F, -42F, 43F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 13, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F); // Import Box18
		bodyModel[171].setRotationPoint(-62F, -42F, 40F);

		bodyModel[172].addBox(0F, 0F, 0F, 5, 19, 5, 0F); // Import Box18
		bodyModel[172].setRotationPoint(-67F, -42F, 40F);

		bodyModel[173].addBox(0F, 0F, 0F, 5, 8, 5, 0F); // Import Box18
		bodyModel[173].setRotationPoint(-49F, -42F, -49F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 13, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F); // Import Box18
		bodyModel[174].setRotationPoint(-62F, -42F, -46F);

		bodyModel[175].addBox(0F, 0F, 0F, 5, 19, 5, 0F); // Import Box18
		bodyModel[175].setRotationPoint(-67F, -42F, -46F);

		bodyModel[176].addBox(-6F, -2F, -3.5F, 23, 7, 11, 0F); // Import Box1
		bodyModel[176].setRotationPoint(-86F, -26F, -48.5F);

		bodyModel[177].addShapeBox(-6F, -4F, -3.5F, 23, 3, 11, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box2
		bodyModel[177].setRotationPoint(-86F, -27F, -48.5F);

		bodyModel[178].addBox(0F, 0F, 0F, 22, 12, 17, 0F); // Import Box18
		bodyModel[178].setRotationPoint(-122F, -29F, -56F);
		bodyModel[178].rotateAngleZ = 0.17453293F;

		bodyModel[179].addBox(-6F, -2F, -3.5F, 23, 7, 11, 0F); // Import Box1
		bodyModel[179].setRotationPoint(-86F, -26F, 43.5F);

		bodyModel[180].addShapeBox(-6F, -4F, -3.5F, 23, 3, 11, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box2
		bodyModel[180].setRotationPoint(-86F, -27F, 43.5F);

		bodyModel[181].addBox(0F, 0F, 0F, 22, 12, 17, 0F); // Import Box18
		bodyModel[181].setRotationPoint(-122F, -29F, 38F);
		bodyModel[181].rotateAngleZ = 0.17453293F;

		bodyModel[182].addBox(0F, 0F, 0F, 9, 12, 26, 0F); // Import Box18
		bodyModel[182].setRotationPoint(-133F, -32F, 9F);
		bodyModel[182].rotateAngleZ = -0.33161256F;

		bodyModel[183].addBox(0F, 0F, 0F, 9, 12, 30, 0F); // Import Box18
		bodyModel[183].setRotationPoint(-133F, -32F, -37F);
		bodyModel[183].rotateAngleZ = -0.33161256F;

		bodyModel[184].addShapeBox(-2F, -2F, 0F, 67, 25, 67, 0F,0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		bodyModel[184].setRotationPoint(-98F, -38F, -34F);

		bodyModel[185].addShapeBox(-2F, -2F, 0F, 24, 17, 5, 0F,0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F); // Import Box3
		bodyModel[185].setRotationPoint(-122F, -30F, 33F);

		bodyModel[186].addShapeBox(-2F, -2F, 0F, 67, 25, 5, 0F,0F, 0F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		bodyModel[186].setRotationPoint(-98F, -38F, 33F);

		bodyModel[187].addShapeBox(-2F, -2F, 0F, 67, 25, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		bodyModel[187].setRotationPoint(-98F, -38F, -39F);

		bodyModel[188].addShapeBox(-2F, -2F, 0F, 24, 17, 5, 0F,0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F); // Import Box3
		bodyModel[188].setRotationPoint(-122F, -30F, -39F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 113, 137, textureX, textureY); // Import Box0
		turretModel[1] = new ModelRendererTurbo(this, 217, 201, textureX, textureY); // Import Box1
		turretModel[2] = new ModelRendererTurbo(this, 769, 201, textureX, textureY); // Import Box5
		turretModel[3] = new ModelRendererTurbo(this, 689, 193, textureX, textureY); // Import Box6
		turretModel[4] = new ModelRendererTurbo(this, 985, 105, textureX, textureY); // Import Box7
		turretModel[5] = new ModelRendererTurbo(this, 377, 201, textureX, textureY); // Import Box0
		turretModel[6] = new ModelRendererTurbo(this, 1, 465, textureX, textureY); // Import Box0
		turretModel[7] = new ModelRendererTurbo(this, 681, 457, textureX, textureY); // Import Box0
		turretModel[8] = new ModelRendererTurbo(this, 705, 473, textureX, textureY); // Import Box5
		turretModel[9] = new ModelRendererTurbo(this, 345, 473, textureX, textureY); // Import Box5
		turretModel[10] = new ModelRendererTurbo(this, 889, 473, textureX, textureY); // Import Box5
		turretModel[11] = new ModelRendererTurbo(this, 161, 313, textureX, textureY); // Import Box5
		turretModel[12] = new ModelRendererTurbo(this, 513, 313, textureX, textureY); // Import Box5
		turretModel[13] = new ModelRendererTurbo(this, 401, 489, textureX, textureY); // Import Box7
		turretModel[14] = new ModelRendererTurbo(this, 449, 505, textureX, textureY); // Import Box7

		turretModel[0].addShapeBox(-2F, -2F, 0F, 8, 29, 85, 0F,0F, 0F, -24F, 4F, 0F, -16F, 4F, 0F, -16F, 0F, 0F, -24F, 7F, 0F, -16F, 3F, 0F, 0F, 3F, 0F, 0F, 7F, 0F, -16F); // Import Box0
		turretModel[0].setRotationPoint(-24F, -74F, -43F);

		turretModel[1].addShapeBox(-2F, -2F, 0F, 37, 31, 85, 0F,3F, -2F, -16F, -6F, -5F, -21F, -6F, -5F, -21F, 3F, -2F, -16F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F); // Import Box1
		turretModel[1].setRotationPoint(12F, -76F, -43F);

		turretModel[2].addShapeBox(-2F, -2F, 0F, 21, 29, 85, 0F,0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, -16F, 1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F); // Import Box5
		turretModel[2].setRotationPoint(-12F, -74F, -43F);

		turretModel[3].addBox(-2F, -9F, -20.5F, 5, 18, 41, 0F); // Import Box6
		turretModel[3].setRotationPoint(43F, -60F, -0.5F);

		turretModel[4].addShapeBox(3F, -9F, -20.5F, 6, 18, 11, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box7
		turretModel[4].setRotationPoint(43F, -60F, -0.5F);

		turretModel[5].addShapeBox(-2F, -2F, 0F, 3, 13, 53, 0F,5F, -4F, -18F, 6F, 0F, -4F, 6F, 0F, -4F, 5F, -4F, -18F, 7F, 0F, -16F, 3F, 0F, 0F, 3F, 0F, 0F, 7F, 0F, -16F); // Import Box0
		turretModel[5].setRotationPoint(-37F, -58F, -27F);

		turretModel[6].addShapeBox(-2F, -2F, 0F, 2, 7, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -3F, 0F); // Import Box0
		turretModel[6].setRotationPoint(-29F, -71F, -14F);

		turretModel[7].addBox(-2F, -2F, 0F, 3, 9, 30, 0F); // Import Box0
		turretModel[7].setRotationPoint(-27F, -72F, -15F);

		turretModel[8].addBox(0F, 0F, 0F, 21, 5, 46, 0F); // Import Box5
		turretModel[8].setRotationPoint(-15F, -77F, -23F);

		turretModel[9].addBox(0F, 0F, 0F, 2, 5, 46, 0F); // Import Box5
		turretModel[9].setRotationPoint(-17F, -78F, -23F);

		turretModel[10].addBox(0F, 0F, 0F, 2, 5, 46, 0F); // Import Box5
		turretModel[10].setRotationPoint(6F, -78F, -23F);

		turretModel[11].addBox(0F, 0F, 0F, 21, 5, 2, 0F); // Import Box5
		turretModel[11].setRotationPoint(-15F, -78F, -25F);

		turretModel[12].addBox(0F, 0F, 0F, 21, 5, 2, 0F); // Import Box5
		turretModel[12].setRotationPoint(-15F, -78F, 23F);

		turretModel[13].addShapeBox(3F, -9F, -20.5F, 6, 18, 11, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box7
		turretModel[13].setRotationPoint(43F, -60F, 29.5F);

		turretModel[14].addShapeBox(3F, -8F, -20.5F, 5, 16, 19, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box7
		turretModel[14].setRotationPoint(43F, -60F, 10.5F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Import Box1
		barrelModel[1] = new ModelRendererTurbo(this, 369, 129, textureX, textureY); // Import Box2
		barrelModel[2] = new ModelRendererTurbo(this, 769, 129, textureX, textureY); // Import Box3
		barrelModel[3] = new ModelRendererTurbo(this, 217, 137, textureX, textureY); // Import Box4
		barrelModel[4] = new ModelRendererTurbo(this, 913, 137, textureX, textureY); // Import Box5
		barrelModel[5] = new ModelRendererTurbo(this, 369, 145, textureX, textureY); // Import Box6
		barrelModel[6] = new ModelRendererTurbo(this, 713, 417, textureX, textureY); // Import Box1
		barrelModel[7] = new ModelRendererTurbo(this, 857, 417, textureX, textureY); // Import Box2

		barrelModel[0].addBox(4F, -2F, -3.5F, 37, 4, 8, 0F); // Import Box1
		barrelModel[0].setRotationPoint(43F, -60F, -0.5F);

		barrelModel[1].addShapeBox(4F, -4F, -3.5F, 37, 2, 8, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box2
		barrelModel[1].setRotationPoint(43F, -60F, -0.5F);

		barrelModel[2].addShapeBox(4F, 2F, -3.5F, 37, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box3
		barrelModel[2].setRotationPoint(43F, -60F, -0.5F);

		barrelModel[3].addBox(41F, -1F, -3.5F, 42, 2, 6, 0F); // Import Box4
		barrelModel[3].setRotationPoint(43F, -60F, 0.5F);

		barrelModel[4].addShapeBox(41F, 1F, -2.5F, 42, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box5
		barrelModel[4].setRotationPoint(43F, -60F, -0.5F);

		barrelModel[5].addShapeBox(41F, -3F, -2.5F, 42, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box6
		barrelModel[5].setRotationPoint(43F, -60F, -0.5F);

		barrelModel[6].addBox(4F, -2F, -3.5F, 37, 4, 8, 0F); // Import Box1
		barrelModel[6].setRotationPoint(43F, -60F, -0.5F);

		barrelModel[7].addShapeBox(4F, -4F, -3.5F, 37, 2, 8, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box2
		barrelModel[7].setRotationPoint(43F, -60F, -0.5F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 937, 233, textureX, textureY); // Import Box100
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 609, 241, textureX, textureY); // Import Box101
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 897, 241, textureX, textureY); // Import Box102
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 113, 257, textureX, textureY); // Import Box103
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 145, 257, textureX, textureY); // Import Box104
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 177, 257, textureX, textureY); // Import Box105
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 209, 257, textureX, textureY); // Import Box106
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 241, 257, textureX, textureY); // Import Box107
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 273, 257, textureX, textureY); // Import Box108
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 929, 257, textureX, textureY); // Import Box109
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 961, 257, textureX, textureY); // Import Box110
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 993, 257, textureX, textureY); // Import Box111
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 969, 305, textureX, textureY); // Import Box122
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 857, 321, textureX, textureY); // Import Box123
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 921, 321, textureX, textureY); // Import Box124
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 1, 345, textureX, textureY); // Import Box125
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 609, 345, textureX, textureY); // Import Box126
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 49, 345, textureX, textureY); // Import Box127
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 81, 393, textureX, textureY); // Import Box100
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 961, 393, textureX, textureY); // Import Box101
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 993, 393, textureX, textureY); // Import Box102
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 521, 417, textureX, textureY); // Import Box103
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 553, 417, textureX, textureY); // Import Box104
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 585, 417, textureX, textureY); // Import Box105
		leftTrackWheelModels[24] = new ModelRendererTurbo(this, 617, 417, textureX, textureY); // Import Box106
		leftTrackWheelModels[25] = new ModelRendererTurbo(this, 649, 417, textureX, textureY); // Import Box107
		leftTrackWheelModels[26] = new ModelRendererTurbo(this, 681, 417, textureX, textureY); // Import Box108
		leftTrackWheelModels[27] = new ModelRendererTurbo(this, 969, 417, textureX, textureY); // Import Box109
		leftTrackWheelModels[28] = new ModelRendererTurbo(this, 713, 433, textureX, textureY); // Import Box110
		leftTrackWheelModels[29] = new ModelRendererTurbo(this, 233, 441, textureX, textureY); // Import Box111

		leftTrackWheelModels[0].addBox(-3F, -8.5F, 0F, 6, 17, 6, 0F); // Import Box100
		leftTrackWheelModels[0].setRotationPoint(-49F, 15.5F, 45F);

		leftTrackWheelModels[1].addShapeBox(-9F, -8.5F, 0F, 6, 17, 6, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import Box101
		leftTrackWheelModels[1].setRotationPoint(-49F, 15.5F, 45F);

		leftTrackWheelModels[2].addShapeBox(3F, -8.5F, 0F, 6, 17, 6, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box102
		leftTrackWheelModels[2].setRotationPoint(-49F, 15.5F, 45F);

		leftTrackWheelModels[3].addShapeBox(3F, -8.5F, 0F, 6, 17, 6, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box103
		leftTrackWheelModels[3].setRotationPoint(-27F, 15.5F, 45F);

		leftTrackWheelModels[4].addBox(-3F, -8.5F, 0F, 6, 17, 6, 0F); // Import Box104
		leftTrackWheelModels[4].setRotationPoint(-27F, 15.5F, 45F);

		leftTrackWheelModels[5].addShapeBox(-9F, -8.5F, 0F, 6, 17, 6, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import Box105
		leftTrackWheelModels[5].setRotationPoint(-27F, 15.5F, 45F);

		leftTrackWheelModels[6].addShapeBox(3F, -8.5F, 0F, 6, 17, 6, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box106
		leftTrackWheelModels[6].setRotationPoint(-68F, 15.5F, 45F);

		leftTrackWheelModels[7].addBox(-3F, -8.5F, 0F, 6, 17, 6, 0F); // Import Box107
		leftTrackWheelModels[7].setRotationPoint(-68F, 15.5F, 45F);

		leftTrackWheelModels[8].addShapeBox(-9F, -8.5F, 0F, 6, 17, 6, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import Box108
		leftTrackWheelModels[8].setRotationPoint(-68F, 15.5F, 45F);

		leftTrackWheelModels[9].addShapeBox(-9F, -8.5F, 0F, 6, 17, 6, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import Box109
		leftTrackWheelModels[9].setRotationPoint(-90F, 15.5F, 45F);

		leftTrackWheelModels[10].addBox(-3F, -8.5F, 0F, 6, 17, 6, 0F); // Import Box110
		leftTrackWheelModels[10].setRotationPoint(-90F, 15.5F, 45F);

		leftTrackWheelModels[11].addShapeBox(3F, -8.5F, 0F, 6, 17, 6, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box111
		leftTrackWheelModels[11].setRotationPoint(-90F, 15.5F, 45F);

		leftTrackWheelModels[12].addShapeBox(-13F, -13F, 0F, 6, 26, 17, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import Box122
		leftTrackWheelModels[12].setRotationPoint(96F, -8.5F, 38F);

		leftTrackWheelModels[13].addBox(-7F, -13F, 0F, 14, 26, 17, 0F); // Import Box123
		leftTrackWheelModels[13].setRotationPoint(96F, -8.5F, 38F);

		leftTrackWheelModels[14].addShapeBox(7F, -13F, 0F, 6, 26, 17, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box124
		leftTrackWheelModels[14].setRotationPoint(96F, -8.5F, 38F);

		leftTrackWheelModels[15].addShapeBox(7F, -13F, 0F, 6, 26, 17, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box125
		leftTrackWheelModels[15].setRotationPoint(-120F, 1.5F, 38F);

		leftTrackWheelModels[16].addBox(-7F, -13F, 0F, 14, 26, 17, 0F); // Import Box126
		leftTrackWheelModels[16].setRotationPoint(-120F, 1.5F, 38F);

		leftTrackWheelModels[17].addShapeBox(-13F, -13F, 0F, 6, 26, 17, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import Box127
		leftTrackWheelModels[17].setRotationPoint(-120F, 1.5F, 38F);

		leftTrackWheelModels[18].addBox(-3F, -8.5F, 0F, 6, 17, 6, 0F); // Import Box100
		leftTrackWheelModels[18].setRotationPoint(36F, 15.5F, 45F);

		leftTrackWheelModels[19].addShapeBox(-9F, -8.5F, 0F, 6, 17, 6, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import Box101
		leftTrackWheelModels[19].setRotationPoint(36F, 15.5F, 45F);

		leftTrackWheelModels[20].addShapeBox(3F, -8.5F, 0F, 6, 17, 6, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box102
		leftTrackWheelModels[20].setRotationPoint(36F, 15.5F, 45F);

		leftTrackWheelModels[21].addShapeBox(3F, -8.5F, 0F, 6, 17, 6, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box103
		leftTrackWheelModels[21].setRotationPoint(58F, 15.5F, 45F);

		leftTrackWheelModels[22].addBox(-3F, -8.5F, 0F, 6, 17, 6, 0F); // Import Box104
		leftTrackWheelModels[22].setRotationPoint(58F, 15.5F, 45F);

		leftTrackWheelModels[23].addShapeBox(-9F, -8.5F, 0F, 6, 17, 6, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import Box105
		leftTrackWheelModels[23].setRotationPoint(58F, 15.5F, 45F);

		leftTrackWheelModels[24].addShapeBox(3F, -8.5F, 0F, 6, 17, 6, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box106
		leftTrackWheelModels[24].setRotationPoint(17F, 15.5F, 45F);

		leftTrackWheelModels[25].addBox(-3F, -8.5F, 0F, 6, 17, 6, 0F); // Import Box107
		leftTrackWheelModels[25].setRotationPoint(17F, 15.5F, 45F);

		leftTrackWheelModels[26].addShapeBox(-9F, -8.5F, 0F, 6, 17, 6, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import Box108
		leftTrackWheelModels[26].setRotationPoint(17F, 15.5F, 45F);

		leftTrackWheelModels[27].addShapeBox(-9F, -8.5F, 0F, 6, 17, 6, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import Box109
		leftTrackWheelModels[27].setRotationPoint(-5F, 15.5F, 45F);

		leftTrackWheelModels[28].addBox(-3F, -8.5F, 0F, 6, 17, 6, 0F); // Import Box110
		leftTrackWheelModels[28].setRotationPoint(-5F, 15.5F, 45F);

		leftTrackWheelModels[29].addShapeBox(3F, -8.5F, 0F, 6, 17, 6, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box111
		leftTrackWheelModels[29].setRotationPoint(-5F, 15.5F, 45F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // Import Box62
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Import Box64
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Import Box65
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Import Box66
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Import Box67
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 769, 105, textureX, textureY); // Import Box68
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 801, 105, textureX, textureY); // Import Box69
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 833, 105, textureX, textureY); // Import Box70
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Import Box71
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Import Box72
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Import Box73
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Import Box74
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Import Box17
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 689, 153, textureX, textureY); // Import Box18
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 217, 193, textureX, textureY); // Import Box19
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 689, 193, textureX, textureY); // Import Box37
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 793, 193, textureX, textureY); // Import Box38
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 377, 201, textureX, textureY); // Import Box39
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 553, 201, textureX, textureY); // Import Box40
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 585, 201, textureX, textureY); // Import Box41
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 825, 201, textureX, textureY); // Import Box43
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 897, 201, textureX, textureY); // Import Box46
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 929, 201, textureX, textureY); // Import Box47
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 961, 201, textureX, textureY); // Import Box48
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 969, 209, textureX, textureY); // Import Box61
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Import Box62
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 785, 217, textureX, textureY); // Import Box63
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 65, 225, textureX, textureY); // Import Box64
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 497, 225, textureX, textureY); // Import Box65
		rightTrackWheelModels[29] = new ModelRendererTurbo(this, 561, 225, textureX, textureY); // Import Box66

		rightTrackWheelModels[0].addBox(-3F, -8.5F, 0F, 6, 17, 6, 0F); // Import Box62
		rightTrackWheelModels[0].setRotationPoint(-49F, 15.5F, -52F);

		rightTrackWheelModels[1].addShapeBox(-9F, -8.5F, 0F, 6, 17, 6, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import Box64
		rightTrackWheelModels[1].setRotationPoint(-49F, 15.5F, -52F);

		rightTrackWheelModels[2].addShapeBox(3F, -8.5F, 0F, 6, 17, 6, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box65
		rightTrackWheelModels[2].setRotationPoint(-49F, 15.5F, -52F);

		rightTrackWheelModels[3].addShapeBox(3F, -8.5F, 0F, 6, 17, 6, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box66
		rightTrackWheelModels[3].setRotationPoint(-27F, 15.5F, -52F);

		rightTrackWheelModels[4].addBox(-3F, -8.5F, 0F, 6, 17, 6, 0F); // Import Box67
		rightTrackWheelModels[4].setRotationPoint(-27F, 15.5F, -52F);

		rightTrackWheelModels[5].addShapeBox(-9F, -8.5F, 0F, 6, 17, 6, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import Box68
		rightTrackWheelModels[5].setRotationPoint(-27F, 15.5F, -52F);

		rightTrackWheelModels[6].addShapeBox(3F, -8.5F, 0F, 6, 17, 6, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box69
		rightTrackWheelModels[6].setRotationPoint(-68F, 15.5F, -52F);

		rightTrackWheelModels[7].addBox(-3F, -8.5F, 0F, 6, 17, 6, 0F); // Import Box70
		rightTrackWheelModels[7].setRotationPoint(-68F, 15.5F, -52F);

		rightTrackWheelModels[8].addShapeBox(-9F, -8.5F, 0F, 6, 17, 6, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import Box71
		rightTrackWheelModels[8].setRotationPoint(-68F, 15.5F, -52F);

		rightTrackWheelModels[9].addShapeBox(-9F, -8.5F, 0F, 6, 17, 6, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import Box72
		rightTrackWheelModels[9].setRotationPoint(-90F, 15.5F, -52F);

		rightTrackWheelModels[10].addBox(-3F, -8.5F, 0F, 6, 17, 6, 0F); // Import Box73
		rightTrackWheelModels[10].setRotationPoint(-90F, 15.5F, -52F);

		rightTrackWheelModels[11].addShapeBox(3F, -8.5F, 0F, 6, 17, 6, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box74
		rightTrackWheelModels[11].setRotationPoint(-90F, 15.5F, -52F);

		rightTrackWheelModels[12].addShapeBox(-9F, -8.5F, 0F, 6, 17, 6, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import Box17
		rightTrackWheelModels[12].setRotationPoint(-5F, 15.5F, -52F);

		rightTrackWheelModels[13].addBox(-3F, -8.5F, 0F, 6, 17, 6, 0F); // Import Box18
		rightTrackWheelModels[13].setRotationPoint(-5F, 15.5F, -52F);

		rightTrackWheelModels[14].addShapeBox(3F, -8.5F, 0F, 6, 17, 6, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box19
		rightTrackWheelModels[14].setRotationPoint(-5F, 15.5F, -52F);

		rightTrackWheelModels[15].addShapeBox(3F, -8.5F, 0F, 6, 17, 6, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box37
		rightTrackWheelModels[15].setRotationPoint(17F, 15.5F, -52F);

		rightTrackWheelModels[16].addBox(-3F, -8.5F, 0F, 6, 17, 6, 0F); // Import Box38
		rightTrackWheelModels[16].setRotationPoint(17F, 15.5F, -52F);

		rightTrackWheelModels[17].addShapeBox(-9F, -8.5F, 0F, 6, 17, 6, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import Box39
		rightTrackWheelModels[17].setRotationPoint(17F, 15.5F, -52F);

		rightTrackWheelModels[18].addShapeBox(-9F, -8.5F, 0F, 6, 17, 6, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import Box40
		rightTrackWheelModels[18].setRotationPoint(36F, 15.5F, -52F);

		rightTrackWheelModels[19].addBox(-3F, -8.5F, 0F, 6, 17, 6, 0F); // Import Box41
		rightTrackWheelModels[19].setRotationPoint(36F, 15.5F, -52F);

		rightTrackWheelModels[20].addShapeBox(3F, -8.5F, 0F, 6, 17, 6, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box43
		rightTrackWheelModels[20].setRotationPoint(36F, 15.5F, -52F);

		rightTrackWheelModels[21].addShapeBox(-9F, -8.5F, 0F, 6, 17, 6, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import Box46
		rightTrackWheelModels[21].setRotationPoint(58F, 15.5F, -52F);

		rightTrackWheelModels[22].addBox(-3F, -8.5F, 0F, 6, 17, 6, 0F); // Import Box47
		rightTrackWheelModels[22].setRotationPoint(58F, 15.5F, -52F);

		rightTrackWheelModels[23].addShapeBox(3F, -8.5F, 0F, 6, 17, 6, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box48
		rightTrackWheelModels[23].setRotationPoint(58F, 15.5F, -52F);

		rightTrackWheelModels[24].addShapeBox(-13F, -13F, 0F, 6, 26, 17, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import Box61
		rightTrackWheelModels[24].setRotationPoint(96F, -8.5F, -56F);

		rightTrackWheelModels[25].addBox(-7F, -13F, 0F, 14, 26, 17, 0F); // Import Box62
		rightTrackWheelModels[25].setRotationPoint(96F, -8.5F, -56F);

		rightTrackWheelModels[26].addShapeBox(7F, -13F, 0F, 6, 26, 17, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box63
		rightTrackWheelModels[26].setRotationPoint(96F, -8.5F, -56F);

		rightTrackWheelModels[27].addShapeBox(7F, -13F, 0F, 6, 26, 17, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box64
		rightTrackWheelModels[27].setRotationPoint(-120F, 1.5F, -56F);

		rightTrackWheelModels[28].addBox(-7F, -13F, 0F, 14, 26, 17, 0F); // Import Box65
		rightTrackWheelModels[28].setRotationPoint(-120F, 1.5F, -56F);

		rightTrackWheelModels[29].addShapeBox(-13F, -13F, 0F, 6, 26, 17, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import Box66
		rightTrackWheelModels[29].setRotationPoint(-120F, 1.5F, -56F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 121, 345, textureX, textureY); // Import Box112
		leftTrackModel[1] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Import Box113
		leftTrackModel[2] = new ModelRendererTurbo(this, 769, 265, textureX, textureY); // Import Box114
		leftTrackModel[3] = new ModelRendererTurbo(this, 465, 273, textureX, textureY); // Import Box115
		leftTrackModel[4] = new ModelRendererTurbo(this, 113, 281, textureX, textureY); // Import Box116
		leftTrackModel[5] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Import Box117
		leftTrackModel[6] = new ModelRendererTurbo(this, 161, 289, textureX, textureY); // Import Box118
		leftTrackModel[7] = new ModelRendererTurbo(this, 513, 289, textureX, textureY); // Import Box119
		leftTrackModel[8] = new ModelRendererTurbo(this, 465, 297, textureX, textureY); // Import Box120
		leftTrackModel[9] = new ModelRendererTurbo(this, 121, 369, textureX, textureY); // Import Box121

		leftTrackModel[0].addBox(0F, 0F, 0F, 160, 1, 15, 0F); // Import Box112
		leftTrackModel[0].setRotationPoint(-96F, 24F, 40F);

		leftTrackModel[1].addBox(0F, 0F, 0F, 45, 1, 15, 0F); // Import Box113
		leftTrackModel[1].setRotationPoint(64F, 24F, 40F);
		leftTrackModel[1].rotateAngleZ = 0.41887902F;

		leftTrackModel[2].addBox(0F, 0F, 0F, 15, 1, 15, 0F); // Import Box114
		leftTrackModel[2].setRotationPoint(105F, 6F, 40F);
		leftTrackModel[2].rotateAngleZ = 1.09955743F;

		leftTrackModel[3].addBox(0F, 0F, 0F, 13, 1, 15, 0F); // Import Box115
		leftTrackModel[3].setRotationPoint(112F, -7F, 40F);
		leftTrackModel[3].rotateAngleZ = 1.93731547F;

		leftTrackModel[4].addBox(0F, 0F, 0F, 15, 1, 15, 0F); // Import Box116
		leftTrackModel[4].setRotationPoint(96F, -28F, 40F);
		leftTrackModel[4].rotateAngleZ = -0.61086524F;

		leftTrackModel[5].addBox(0F, -1F, 0F, 37, 1, 15, 0F); // Import Box117
		leftTrackModel[5].setRotationPoint(-96F, 24F, 40F);
		leftTrackModel[5].rotateAngleZ = 2.82743339F;

		leftTrackModel[6].addBox(0F, -1F, 0F, 9, 1, 15, 0F); // Import Box118
		leftTrackModel[6].setRotationPoint(-131F, 13F, 40F);
		leftTrackModel[6].rotateAngleZ = 1.97222205F;

		leftTrackModel[7].addBox(0F, -1F, 0F, 9, 1, 15, 0F); // Import Box119
		leftTrackModel[7].setRotationPoint(-135F, 5F, 40F);
		leftTrackModel[7].rotateAngleZ = 1.48352986F;

		leftTrackModel[8].addBox(0F, -1F, 0F, 9, 1, 15, 0F); // Import Box120
		leftTrackModel[8].setRotationPoint(-134F, -3F, 40F);
		leftTrackModel[8].rotateAngleZ = 1.01229097F;

		leftTrackModel[9].addBox(0F, -1F, 0F, 228, 1, 15, 0F); // Import Box121
		leftTrackModel[9].setRotationPoint(-130F, -10F, 40F);
		leftTrackModel[9].rotateAngleZ = 0.06981317F;
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Import Box7
		rightTrackModel[1] = new ModelRendererTurbo(this, 561, 153, textureX, textureY); // Import Box8
		rightTrackModel[2] = new ModelRendererTurbo(this, 465, 129, textureX, textureY); // Import Box9
		rightTrackModel[3] = new ModelRendererTurbo(this, 217, 153, textureX, textureY); // Import Box10
		rightTrackModel[4] = new ModelRendererTurbo(this, 457, 153, textureX, textureY); // Import Box11
		rightTrackModel[5] = new ModelRendererTurbo(this, 441, 201, textureX, textureY); // Import Box12
		rightTrackModel[6] = new ModelRendererTurbo(this, 961, 153, textureX, textureY); // Import Box13
		rightTrackModel[7] = new ModelRendererTurbo(this, 265, 161, textureX, textureY); // Import Box14
		rightTrackModel[8] = new ModelRendererTurbo(this, 369, 161, textureX, textureY); // Import Box15
		rightTrackModel[9] = new ModelRendererTurbo(this, 353, 321, textureX, textureY); // Import Box16

		rightTrackModel[0].addBox(0F, 0F, 0F, 160, 1, 15, 0F); // Import Box7
		rightTrackModel[0].setRotationPoint(-96F, 24F, -56F);

		rightTrackModel[1].addBox(0F, 0F, 0F, 45, 1, 15, 0F); // Import Box8
		rightTrackModel[1].setRotationPoint(64F, 24F, -56F);
		rightTrackModel[1].rotateAngleZ = 0.41887902F;

		rightTrackModel[2].addBox(0F, 0F, 0F, 15, 1, 15, 0F); // Import Box9
		rightTrackModel[2].setRotationPoint(105F, 6F, -56F);
		rightTrackModel[2].rotateAngleZ = 1.09955743F;

		rightTrackModel[3].addBox(0F, 0F, 0F, 13, 1, 15, 0F); // Import Box10
		rightTrackModel[3].setRotationPoint(112F, -7F, -56F);
		rightTrackModel[3].rotateAngleZ = 1.93731547F;

		rightTrackModel[4].addBox(0F, 0F, 0F, 15, 1, 15, 0F); // Import Box11
		rightTrackModel[4].setRotationPoint(96F, -28F, -56F);
		rightTrackModel[4].rotateAngleZ = -0.61086524F;

		rightTrackModel[5].addBox(0F, -1F, 0F, 37, 1, 15, 0F); // Import Box12
		rightTrackModel[5].setRotationPoint(-96F, 24F, -56F);
		rightTrackModel[5].rotateAngleZ = 2.82743339F;

		rightTrackModel[6].addBox(0F, -1F, 0F, 9, 1, 15, 0F); // Import Box13
		rightTrackModel[6].setRotationPoint(-131F, 13F, -56F);
		rightTrackModel[6].rotateAngleZ = 1.97222205F;

		rightTrackModel[7].addBox(0F, -1F, 0F, 9, 1, 15, 0F); // Import Box14
		rightTrackModel[7].setRotationPoint(-135F, 5F, -56F);
		rightTrackModel[7].rotateAngleZ = 1.48352986F;

		rightTrackModel[8].addBox(0F, -1F, 0F, 9, 1, 15, 0F); // Import Box15
		rightTrackModel[8].setRotationPoint(-134F, -3F, -56F);
		rightTrackModel[8].rotateAngleZ = 1.01229097F;

		rightTrackModel[9].addBox(0F, -1F, 0F, 228, 1, 15, 0F); // Import Box16
		rightTrackModel[9].setRotationPoint(-130F, -10F, -56F);
		rightTrackModel[9].rotateAngleZ = 0.06981317F;
	}
}