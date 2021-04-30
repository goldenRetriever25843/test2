//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 10.06.2017 - 17:27:27
// Last changed on: 10.06.2017 - 17:27:27

package com.flansmod.client.model.Lizard; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelM14E2 extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelM14E2() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[145];
		ammoModel = new ModelRendererTurbo[14];
		slideModel = new ModelRendererTurbo[6];

		initgunModel_1();
		initammoModel_1();
		initslideModel_1();

		translateAll(0F, -1.6F, 0F);
		
		gunSlideDistance = 0.1F;
		animationType = EnumAnimationType.BULLPUP;


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 12
		gunModel[6] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 13
		gunModel[7] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 14
		gunModel[8] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 18
		gunModel[9] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 19
		gunModel[10] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 20
		gunModel[11] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 21
		gunModel[12] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 22
		gunModel[13] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 23
		gunModel[14] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 24
		gunModel[15] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 25
		gunModel[16] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 32
		gunModel[17] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 33
		gunModel[18] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 34
		gunModel[19] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 35
		gunModel[20] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 36
		gunModel[21] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 37
		gunModel[22] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 38
		gunModel[23] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 39
		gunModel[24] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 40
		gunModel[25] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 41
		gunModel[26] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 42
		gunModel[27] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 43
		gunModel[28] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 44
		gunModel[29] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 45
		gunModel[30] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 46
		gunModel[31] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 47
		gunModel[32] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 48
		gunModel[33] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 49
		gunModel[34] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 50
		gunModel[35] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 51
		gunModel[36] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 53
		gunModel[37] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 54
		gunModel[38] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 55
		gunModel[39] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 56
		gunModel[40] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 58
		gunModel[41] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 59
		gunModel[42] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 60
		gunModel[43] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 61
		gunModel[44] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 62
		gunModel[45] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 65
		gunModel[46] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 66
		gunModel[47] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 67
		gunModel[48] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 68
		gunModel[49] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 69
		gunModel[50] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 70
		gunModel[51] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 71
		gunModel[52] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 72
		gunModel[53] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 73
		gunModel[54] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 74
		gunModel[55] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 75
		gunModel[56] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 76
		gunModel[57] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 77
		gunModel[58] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 78
		gunModel[59] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 79
		gunModel[60] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 73
		gunModel[61] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 74
		gunModel[62] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 75
		gunModel[63] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 76
		gunModel[64] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 77
		gunModel[65] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 78
		gunModel[66] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 79
		gunModel[67] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 80
		gunModel[68] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 81
		gunModel[69] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 91
		gunModel[70] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 92
		gunModel[71] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 93
		gunModel[72] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 94
		gunModel[73] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 95
		gunModel[74] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 96
		gunModel[75] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 97
		gunModel[76] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 98
		gunModel[77] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 99
		gunModel[78] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 100
		gunModel[79] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 101
		gunModel[80] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 102
		gunModel[81] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 103
		gunModel[82] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 106
		gunModel[83] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 107
		gunModel[84] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 108
		gunModel[85] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 109
		gunModel[86] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 110
		gunModel[87] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 80
		gunModel[88] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 81
		gunModel[89] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 82
		gunModel[90] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 114
		gunModel[91] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 115
		gunModel[92] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 116
		gunModel[93] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 101
		gunModel[94] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 102
		gunModel[95] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 103
		gunModel[96] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 120
		gunModel[97] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 121
		gunModel[98] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 122
		gunModel[99] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 123
		gunModel[100] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 124
		gunModel[101] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 126
		gunModel[102] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 127
		gunModel[103] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 128
		gunModel[104] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 129
		gunModel[105] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 130
		gunModel[106] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 131
		gunModel[107] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 132
		gunModel[108] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 133
		gunModel[109] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 32
		gunModel[110] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 80
		gunModel[111] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 81
		gunModel[112] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 137
		gunModel[113] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 138
		gunModel[114] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 100
		gunModel[115] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 144
		gunModel[116] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 145
		gunModel[117] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 146
		gunModel[118] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 147
		gunModel[119] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 153
		gunModel[120] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 154
		gunModel[121] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 155
		gunModel[122] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 59
		gunModel[123] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 60
		gunModel[124] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 61
		gunModel[125] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 62
		gunModel[126] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 169
		gunModel[127] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 154
		gunModel[128] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 155
		gunModel[129] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 156
		gunModel[130] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 157
		gunModel[131] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 158
		gunModel[132] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 159
		gunModel[133] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 160
		gunModel[134] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 161
		gunModel[135] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 162
		gunModel[136] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 116
		gunModel[137] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 117
		gunModel[138] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 118
		gunModel[139] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 119
		gunModel[140] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 94
		gunModel[141] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 232
		gunModel[142] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 233
		gunModel[143] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 234
		gunModel[144] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 235

		gunModel[0].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.2F, 0.05F, 0.15F, 0F, 0.05F, 0.2F, 0F, 0.05F, 0.2F, 0.2F, 0.05F, 0.15F, -0.2F, 0.35F, 0.15F, 0F, 0.35F, 0.15F, 0F, 0.35F, 0.15F, -0.2F, 0.35F, 0.15F); // Box 0
		gunModel[0].setRotationPoint(1.8F, -3.4F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, 0.05F, 0.2F, 0.2F, 0.05F, 0.2F, 0.2F, 0.05F, 0.2F, 0.2F, 0.05F, 0.2F, 0.2F, 0.35F, 0.15F, 0.2F, 0.1F, 0.15F, 0.2F, 0.1F, 0.15F, 0.2F, 0.35F, 0.15F); // Box 1
		gunModel[1].setRotationPoint(6F, -3.4F, -0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.25F, 0.15F, -0.5F, -0.25F, 0.15F, -0.5F, -0.25F, 0.15F, 0F, -0.25F, 0.15F); // Box 2
		gunModel[2].setRotationPoint(7.2F, -3.4F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.05F, 0.1F, 0F, 0.05F, 0.15F, 0F, 0.05F, 0.15F, -0.5F, 0.05F, 0.1F, -0.5F, 0.5F, 0.1F, 0.4F, 0.35F, 0.15F, 0.4F, 0.35F, 0.15F, -0.5F, 0.5F, 0.1F); // Box 3
		gunModel[3].setRotationPoint(0.6F, -3.4F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.1F, 0.05F, 0F, 0.05F, 0.1F, 0F, 0.05F, 0.1F, 0F, -0.1F, 0.05F, -0.2F, 0.4F, 0.05F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, -0.2F, 0.4F, 0.05F); // Box 4
		gunModel[4].setRotationPoint(0.1F, -3.4F, -0.5F);

		gunModel[5].addShapeBox(0F, -2F, 0F, 9, 1, 1, 0F,0F, 0.2F, 0.2F, -0.15F, 0.2F, 0.2F, -0.15F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.25F, 0.15F, -0.15F, -0.75F, 0.1F, -0.15F, -0.75F, 0.1F, 0F, -0.25F, 0.15F); // Box 12
		gunModel[5].setRotationPoint(7.7F, -1.4F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0.15F, -0.15F, 0.5F, 0.1F, -0.15F, 0.5F, 0.1F, 0F, 0F, 0.15F, 0F, -0.7F, -0.05F, -0.15F, -1.2F, -0.2F, -0.15F, -1.2F, -0.2F, 0F, -0.7F, -0.05F); // Box 13
		gunModel[6].setRotationPoint(7.7F, -2.65F, -0.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.7F, 0.15F, -0.5F, -0.7F, 0.15F, -0.5F, -0.7F, 0.15F, 0F, -0.7F, 0.15F, 0F, 0.05F, 0.15F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.05F, 0F, 0.05F, 0.15F); // Box 14
		gunModel[7].setRotationPoint(7.2F, -3.35F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0.5F, -0.3F, 0.05F, -0.15F, -0.3F, 0.05F, -0.15F, -0.3F, 0.05F, 0.5F, -0.3F, 0.05F, 0.5F, -0.5F, 0.1F, -0.15F, -0.5F, 0.1F, -0.15F, -0.4F, 0.1F, 0.5F, -0.4F, 0.1F); // Box 18
		gunModel[8].setRotationPoint(7.7F, -4.35F, -0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0.5F, -0.3F, -0.2F, -0.15F, -0.35F, -0.2F, -0.15F, -0.35F, -0.2F, 0.5F, -0.3F, -0.2F, 0.5F, -0.4F, 0.05F, -0.15F, -0.4F, 0.05F, -0.15F, -0.4F, 0.05F, 0.5F, -0.4F, 0.05F); // Box 19
		gunModel[9].setRotationPoint(7.7F, -4.65F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0.5F, -0.5F, -0.4F, -0.15F, -0.54F, -0.4F, -0.15F, -0.54F, -0.4F, 0.5F, -0.5F, -0.4F, 0.5F, -0.45F, -0.2F, -0.15F, -0.4F, -0.2F, -0.15F, -0.4F, -0.2F, 0.5F, -0.45F, -0.2F); // Box 20
		gunModel[10].setRotationPoint(7.7F, -4.9F, -0.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.35F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.35F, -0.25F, -0.45F, -0.35F, -0.25F, -0.45F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.45F, -0.4F, 0F); // Box 21
		gunModel[11].setRotationPoint(16.1F, -4.65F, -0.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.4F, 0.05F, -0.4F, -0.4F, 0.05F, -0.4F, -0.4F, 0.05F, -0.45F, -0.4F, 0.05F); // Box 22
		gunModel[12].setRotationPoint(16.1F, -4.35F, -0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.5F, -0.45F, -0.4F, -0.5F, -0.45F, -0.4F, -0.5F, -0.45F, -0.45F, -0.5F, -0.45F, -0.45F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.45F, -0.45F, -0.25F); // Box 23
		gunModel[13].setRotationPoint(16.1F, -4.85F, -0.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.4F, 0.05F, -0.4F, -0.4F, 0.05F, -0.4F, -0.4F, 0.05F, -0.45F, -0.4F, 0.05F, -0.45F, -0.1F, 0.05F, -0.4F, -0.1F, 0.05F, -0.4F, -0.1F, 0.05F, -0.45F, -0.1F, 0.05F); // Box 24
		gunModel[14].setRotationPoint(16.1F, -4.15F, -0.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.4F, 0.05F, -0.4F, -0.4F, 0.05F, -0.4F, -0.4F, 0.05F, -0.45F, -0.4F, 0.05F, -0.45F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.45F, -0.3F, -0.2F); // Box 25
		gunModel[15].setRotationPoint(16.1F, -3.65F, -0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.5F, -0.45F, -0.35F, -1.25F, -0.45F, -0.35F, -1.25F, -0.45F, -0.35F, 0.5F, -0.45F, -0.35F, 0.5F, -0.45F, -0.15F, -1.25F, -0.45F, -0.15F, -1.25F, -0.45F, -0.15F, 0.5F, -0.45F, -0.15F); // Box 32
		gunModel[16].setRotationPoint(8.6F, -4.9F, -0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.5F, -0.3F, -0.15F, -1.25F, -0.3F, -0.15F, -1.25F, -0.3F, -0.15F, 0.5F, -0.3F, -0.15F, 0.5F, -0.4F, 0.08F, -1.25F, -0.4F, 0.08F, -1.25F, -0.4F, 0.08F, 0.5F, -0.4F, 0.08F); // Box 33
		gunModel[17].setRotationPoint(8.6F, -4.65F, -0.5F);

		gunModel[18].addShapeBox(0F, -2F, 0F, 1, 1, 1, 0F,0.5F, -0.3F, 0.08F, -1F, -0.3F, 0.08F, -1F, -0.3F, 0.08F, 0.5F, -0.3F, 0.08F, 0.5F, -0.5F, 0.12F, -1F, -0.5F, 0.12F, -1F, -0.4F, 0.12F, 0.5F, -0.4F, 0.12F); // Box 34
		gunModel[18].setRotationPoint(8.6F, -2.35F, -0.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.5F, -0.3F, -0.15F, -1.25F, -0.3F, -0.15F, -1.25F, -0.3F, -0.15F, 0.5F, -0.3F, -0.15F, 0.5F, -0.4F, 0.08F, -1.25F, -0.4F, 0.08F, -1.25F, -0.4F, 0.08F, 0.5F, -0.4F, 0.08F); // Box 35
		gunModel[19].setRotationPoint(10F, -4.65F, -0.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.5F, -0.45F, -0.35F, -1.25F, -0.45F, -0.35F, -1.25F, -0.45F, -0.35F, 0.5F, -0.45F, -0.35F, 0.5F, -0.45F, -0.15F, -1.25F, -0.45F, -0.15F, -1.25F, -0.45F, -0.15F, 0.5F, -0.45F, -0.15F); // Box 36
		gunModel[20].setRotationPoint(10F, -4.9F, -0.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.5F, -0.3F, -0.15F, -1.25F, -0.3F, -0.15F, -1.25F, -0.3F, -0.15F, 0.5F, -0.3F, -0.15F, 0.5F, -0.4F, 0.08F, -1.25F, -0.4F, 0.08F, -1.25F, -0.4F, 0.08F, 0.5F, -0.4F, 0.08F); // Box 37
		gunModel[21].setRotationPoint(11.4F, -4.65F, -0.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.5F, -0.45F, -0.35F, -1.25F, -0.45F, -0.35F, -1.25F, -0.45F, -0.35F, 0.5F, -0.45F, -0.35F, 0.5F, -0.45F, -0.15F, -1.25F, -0.45F, -0.15F, -1.25F, -0.45F, -0.15F, 0.5F, -0.45F, -0.15F); // Box 38
		gunModel[22].setRotationPoint(11.4F, -4.9F, -0.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.5F, -0.45F, -0.35F, -1.25F, -0.45F, -0.35F, -1.25F, -0.45F, -0.35F, 0.5F, -0.45F, -0.35F, 0.5F, -0.45F, -0.15F, -1.25F, -0.45F, -0.15F, -1.25F, -0.45F, -0.15F, 0.5F, -0.45F, -0.15F); // Box 39
		gunModel[23].setRotationPoint(12.8F, -4.9F, -0.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.5F, -0.3F, -0.15F, -1.25F, -0.3F, -0.15F, -1.25F, -0.3F, -0.15F, 0.5F, -0.3F, -0.15F, 0.5F, -0.4F, 0.08F, -1.25F, -0.4F, 0.08F, -1.25F, -0.4F, 0.08F, 0.5F, -0.4F, 0.08F); // Box 40
		gunModel[24].setRotationPoint(12.8F, -4.65F, -0.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.5F, -0.45F, -0.35F, -1.25F, -0.45F, -0.35F, -1.25F, -0.45F, -0.35F, 0.5F, -0.45F, -0.35F, 0.5F, -0.45F, -0.15F, -1.25F, -0.45F, -0.15F, -1.25F, -0.45F, -0.15F, 0.5F, -0.45F, -0.15F); // Box 41
		gunModel[25].setRotationPoint(14.2F, -4.9F, -0.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.5F, -0.3F, -0.15F, -1.25F, -0.3F, -0.15F, -1.25F, -0.3F, -0.15F, 0.5F, -0.3F, -0.15F, 0.5F, -0.4F, 0.08F, -1.25F, -0.4F, 0.08F, -1.25F, -0.4F, 0.08F, 0.5F, -0.4F, 0.08F); // Box 42
		gunModel[26].setRotationPoint(14.2F, -4.65F, -0.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.5F, -0.45F, -0.35F, -1.05F, -0.52F, -0.35F, -1.05F, -0.52F, -0.35F, 0.5F, -0.45F, -0.35F, 0.5F, -0.45F, -0.15F, -1.05F, -0.4F, -0.15F, -1.05F, -0.4F, -0.15F, 0.5F, -0.45F, -0.15F); // Box 43
		gunModel[27].setRotationPoint(15.6F, -4.9F, -0.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.5F, -0.3F, -0.15F, -1.05F, -0.35F, -0.15F, -1.05F, -0.35F, -0.15F, 0.5F, -0.3F, -0.15F, 0.5F, -0.4F, 0.08F, -1.05F, -0.4F, 0.08F, -1.05F, -0.4F, 0.08F, 0.5F, -0.4F, 0.08F); // Box 44
		gunModel[28].setRotationPoint(15.6F, -4.65F, -0.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, -0.3F, 0.08F, -1F, -0.3F, 0.08F, -1F, -0.3F, 0.08F, 0.5F, -0.3F, 0.08F, 0.5F, -0.4F, 0.12F, -1F, -0.4F, 0.12F, -1F, -0.4F, 0.12F, 0.5F, -0.4F, 0.12F); // Box 45
		gunModel[29].setRotationPoint(16.55F, -4.35F, -0.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,-1.55F, -0.4F, 0.09F, -1F, -0.4F, 0.09F, -1F, -0.4F, 0.09F, 0.45F, -0.4F, 0.09F, -1.55F, -0.4F, 0.12F, -1F, -0.4F, 0.12F, -1F, -0.4F, 0.12F, 0.45F, -0.4F, 0.12F); // Box 46
		gunModel[30].setRotationPoint(9.05F, -4.35F, -0.5F);

		gunModel[31].addShapeBox(-1F, 0F, 0F, 4, 1, 1, 0F,0.2F, -0.3F, 0.1F, -1F, -0.3F, 0.1F, -1F, -0.3F, -0.5F, 0.2F, -0.3F, -0.5F, 0.2F, -0.4F, 0.1F, -1F, -0.4F, 0.1F, -1F, -0.4F, -0.5F, 0.2F, -0.4F, -0.5F); // Box 47
		gunModel[31].setRotationPoint(8.55F, -4.15F, -0.7F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, -0.3F, -0.15F, -1F, -0.3F, -0.15F, -1F, -0.3F, -0.15F, 0.5F, -0.3F, -0.15F, 0.5F, -0.4F, 0.08F, -1F, -0.4F, 0.08F, -1F, -0.4F, 0.08F, 0.5F, -0.4F, 0.08F); // Box 48
		gunModel[32].setRotationPoint(7.7F, -4.65F, -0.5F);

		gunModel[33].addShapeBox(-2F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0.1F, -0.05F, -0.25F, 0.1F, -0.05F, -0.25F, 0.1F, -0.15F, -0.25F, 0.1F, 0F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.15F, -0.25F, 0F, 0F); // Box 49
		gunModel[33].setRotationPoint(8.45F, -4.15F, -0.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, -0.45F, -0.35F, -1F, -0.45F, -0.35F, -1F, -0.45F, -0.35F, 0.5F, -0.45F, -0.35F, 0.5F, -0.45F, -0.15F, -1F, -0.45F, -0.15F, -1F, -0.45F, -0.15F, 0.5F, -0.45F, -0.15F); // Box 50
		gunModel[34].setRotationPoint(7.7F, -4.9F, -0.5F);

		gunModel[35].addShapeBox(0F, -2F, 0F, 3, 1, 1, 0F,0.5F, -0.4F, 0.08F, -1.5F, -0.4F, 0.08F, -1.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.5F, 0.1F, -1.5F, -0.5F, 0.08F, -1.5F, -0.4F, 0F, 0.5F, -0.4F, 0F); // Box 51
		gunModel[35].setRotationPoint(9.1F, -2.35F, -0.52F);

		gunModel[36].addShapeBox(0F, -2F, 0F, 6, 1, 1, 0F,0.1F, -0.45F, 0.2F, -0.15F, -0.45F, 0.2F, -0.15F, -0.45F, 0.2F, 1.1F, -0.45F, 0.2F, 0.1F, -0.4F, 0.2F, -0.15F, -0.4F, 0.2F, -0.15F, -0.4F, 0.2F, 1.1F, -0.4F, 0.2F); // Box 53
		gunModel[36].setRotationPoint(10.7F, -2.2F, -0.5F);

		gunModel[37].addShapeBox(0F, -2F, 0F, 3, 1, 1, 0F,0.1F, -0.35F, 0.1F, -0.2F, -0.35F, 0.1F, -1.2F, -0.45F, 0.2F, 0.1F, -0.45F, 0.2F, 0.1F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -1.2F, -0.4F, 0.2F, 0.1F, -0.4F, 0.2F); // Box 54
		gunModel[37].setRotationPoint(7.8F, -2.2F, -0.5F);

		gunModel[38].addShapeBox(0F, -2F, 0F, 1, 1, 1, 0F,0.1F, -0.45F, 0.2F, -0.6F, -0.45F, 0.2F, -0.6F, -0.45F, 0.2F, 0.1F, -0.45F, 0.2F, 0.1F, -0.4F, 0.2F, -0.6F, -0.4F, 0.2F, -0.6F, -0.4F, 0.2F, 0.1F, -0.4F, 0.2F); // Box 55
		gunModel[38].setRotationPoint(7.3F, -2.2F, -0.5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, -0.3F, 0.08F, -1F, -0.3F, 0.08F, -1F, -0.3F, 0.08F, 0.5F, -0.3F, 0.08F, 0.5F, -0.4F, 0.12F, -1F, -0.4F, 0.12F, -1F, -0.4F, 0.12F, 0.5F, -0.4F, 0.12F); // Box 56
		gunModel[39].setRotationPoint(7.7F, -4.35F, -0.5F);

		gunModel[40].addShapeBox(-2F, 0F, 0F, 1, 1, 1, 0F,-0.1F, 0.1F, -0.4F, -0.25F, 0.1F, -0.4F, -0.25F, 0.1F, -0.4F, -0.1F, 0.1F, -0.4F, -0.1F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.1F, 0F, -0.4F); // Box 58
		gunModel[40].setRotationPoint(7.95F, -4.15F, -0.1F);

		gunModel[41].addShapeBox(-2F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.4F, -0.3F, 0.1F, -0.4F, -0.3F, 0.1F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.25F, 0F, -0.4F); // Box 59
		gunModel[41].setRotationPoint(7.35F, -4.15F, -0.1F);

		gunModel[42].addShapeBox(-2F, 0F, 0F, 2, 1, 1, 0F,-0.1F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.1F, 0F, -0.4F); // Box 60
		gunModel[42].setRotationPoint(5.9F, -4.15F, -0.1F);

		gunModel[43].addShapeBox(-2F, 0F, 0F, 1, 1, 1, 0F,-0.1F, 0.35F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.1F, 0.35F, -0.4F, -0.1F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.1F, 0F, -0.4F); // Box 61
		gunModel[43].setRotationPoint(5.3F, -4F, -0.1F);

		gunModel[44].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,-0.1F, 0.1F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.4F, -0.1F, 0.1F, -0.4F, -0.1F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.4F, -0.1F, 0F, -0.4F); // Box 62
		gunModel[44].setRotationPoint(4.7F, -4F, -1.1F);

		gunModel[45].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,-0.4F, 0.1F, -0.6F, -0.4F, 0.1F, -0.6F, -0.4F, 0.1F, -0.4F, -0.4F, 0.1F, -0.4F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 65
		gunModel[45].setRotationPoint(4.2F, -4F, -1.1F);

		gunModel[46].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.05F, -0.6F, -0.4F, 0.1F, -0.6F, -0.4F, 0.1F, -0.9F, -0.3F, 0.05F, -0.9F, -0.3F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F); // Box 66
		gunModel[46].setRotationPoint(4F, -4F, -1.1F);

		gunModel[47].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,-0.3F, 0.05F, -0.9F, -0.4F, 0.1F, -0.9F, -0.4F, 0.1F, -0.6F, -0.3F, -0.05F, -0.6F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.6F, -0.3F, 0F, -0.6F); // Box 67
		gunModel[47].setRotationPoint(4F, -4F, -0.9F);

		gunModel[48].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0.25F, -0.05F, -0.9F, -0.4F, 0.05F, -0.9F, -0.4F, -0.05F, -0.6F, 0.15F, -0.1F, -0.6F, 0.55F, -0.2F, -0.9F, -0.4F, -0.2F, -0.9F, -0.4F, -0.2F, -0.6F, 0.4F, -0.2F, -0.6F); // Box 68
		gunModel[48].setRotationPoint(3.7F, -4F, -0.9F);

		gunModel[49].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0.1F, -0.1F, -0.6F, -0.4F, -0.05F, -0.6F, -0.4F, 0.05F, -0.9F, 0.25F, -0.05F, -0.9F, 0.4F, -0.2F, -0.6F, -0.4F, -0.2F, -0.6F, -0.4F, -0.2F, -0.9F, 0.55F, -0.2F, -0.9F); // Box 69
		gunModel[49].setRotationPoint(3.7F, -4F, -1.1F);

		gunModel[50].addShapeBox(-2F, -2F, 0F, 5, 1, 1, 0F,-0.1F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.1F, 0F, -0.4F); // Box 70
		gunModel[50].setRotationPoint(5.3F, -1.85F, -0.9F);

		gunModel[51].addShapeBox(-2F, -2F, 0F, 6, 1, 1, 0F,-0.1F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.1F, -0.2F, -0.4F); // Box 71
		gunModel[51].setRotationPoint(4.3F, -1.75F, -1F);

		gunModel[52].addShapeBox(-1F, 0F, 0F, 1, 1, 1, 0F,0.2F, 0.1F, 0.1F, -0.6F, 0.1F, 0.1F, -0.6F, 0.1F, -0.8F, 0.2F, 0.1F, -0.8F, 0.2F, -0.4F, 0.1F, -0.6F, -0.4F, 0.1F, -0.6F, -0.4F, -0.8F, 0.2F, -0.4F, -0.8F); // Box 72
		gunModel[52].setRotationPoint(7.95F, -4.15F, -0.7F);

		gunModel[53].addShapeBox(-2F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.2F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, -0.8F, -0.4F, -0.2F, -0.8F, -0.4F, -0.4F, 0.1F, -0.4F, -0.4F, 0.1F, -0.4F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F); // Box 73
		gunModel[53].setRotationPoint(8.15F, -4.15F, -0.7F);

		gunModel[54].addShapeBox(-2F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.25F, 0.1F, -0.4F, -0.2F, 0.1F, -0.4F, -0.2F, -0.8F, -0.4F, -0.25F, -0.8F, -0.4F, -0.4F, 0.1F, -0.4F, -0.4F, 0.1F, -0.4F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F); // Box 74
		gunModel[54].setRotationPoint(7.95F, -4.15F, -0.7F);

		gunModel[55].addShapeBox(-2F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.25F, 0.1F, -0.4F, -0.25F, 0.1F, -0.4F, -0.25F, -0.8F, -0.2F, -0.25F, -0.8F, -0.2F, -0.4F, 0.1F, -0.4F, -0.4F, 0.1F, -0.4F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F); // Box 75
		gunModel[55].setRotationPoint(7.75F, -4.15F, -0.7F);

		gunModel[56].addShapeBox(-2F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, 0.1F, -0.55F, -0.45F, 0.1F, -0.55F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.45F, -0.45F, 0.1F, -0.4F, -0.45F, 0.1F, -0.4F, -0.45F, -0.8F, -0.45F, -0.45F, -0.8F); // Box 76
		gunModel[56].setRotationPoint(8.9F, -4.4F, -0.7F);

		gunModel[57].addShapeBox(-2F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.25F, 0.05F, -0.45F, -0.25F, 0.05F, -0.45F, -0.25F, -0.8F, -0.45F, -0.25F, -0.8F, -0.45F, -0.4F, 0.05F, -0.45F, -0.4F, 0.05F, -0.45F, -0.4F, -0.8F, -0.45F, -0.4F, -0.8F); // Box 77
		gunModel[57].setRotationPoint(7.5F, -4.15F, -1F);

		gunModel[58].addShapeBox(-2F, 0F, 0F, 1, 1, 1, 0F,-0.6F, -0.25F, 0.05F, -0.3F, -0.25F, 0.05F, -0.45F, -0.25F, -0.8F, -0.45F, -0.25F, -0.8F, -0.6F, -0.4F, 0.05F, -0.3F, -0.4F, 0.05F, -0.45F, -0.4F, -0.8F, -0.45F, -0.4F, -0.8F); // Box 78
		gunModel[58].setRotationPoint(7.5F, -4.15F, -1.25F);

		gunModel[59].addShapeBox(-2F, -2F, 0F, 5, 1, 1, 0F,-0.1F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F); // Box 79
		gunModel[59].setRotationPoint(4.3F, -2.25F, -0.95F);

		gunModel[60].addShapeBox(-2F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0.05F, 0F, -0.05F, 0.05F, 0F, -0.05F, 0.05F, 0F, -0.25F, 0.05F, 0F, -0.25F, -0.8F, 0F, -0.05F, -0.7F, 0F, -0.05F, -0.7F, 0F, -0.25F, -0.8F, 0F); // Box 73
		gunModel[60].setRotationPoint(4.45F, -4.3F, -0.5F);

		gunModel[61].addShapeBox(-2F, 0F, 0F, 1, 1, 1, 0F,-0.55F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.55F, 0F, 0F, -0.35F, -0.85F, 0F, -0.3F, -0.85F, 0F, -0.3F, -0.85F, 0F, -0.35F, -0.85F, 0F); // Box 74
		gunModel[61].setRotationPoint(4.35F, -4.5F, -0.5F);

		gunModel[62].addShapeBox(-2F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.85F, 0F, -0.35F, -0.85F, 0F, -0.35F, -0.85F, 0F, -0.3F, -0.85F, 0F); // Box 75
		gunModel[62].setRotationPoint(4.75F, -4.5F, -0.5F);

		gunModel[63].addShapeBox(-2F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0.05F, -0.45F, -0.5F, 0F, -0.45F, -0.5F, 0F, -0.45F, -0.3F, 0.05F, -0.45F, -0.3F, -0.7F, -0.45F, -0.35F, -0.7F, -0.45F, -0.35F, -0.7F, -0.45F, -0.3F, -0.7F, -0.45F); // Box 76
		gunModel[63].setRotationPoint(4.65F, -4.65F, -0.85F);

		gunModel[64].addShapeBox(-2F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.45F, -0.3F, 0.05F, -0.45F, -0.3F, 0.05F, -0.45F, -0.5F, 0F, -0.45F, -0.35F, -0.7F, -0.45F, -0.3F, -0.7F, -0.45F, -0.3F, -0.7F, -0.45F, -0.35F, -0.7F, -0.45F); // Box 77
		gunModel[64].setRotationPoint(4.25F, -4.65F, -0.85F);

		gunModel[65].addShapeBox(-2F, 0F, 0F, 1, 1, 1, 0F,-0.35F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, -0.7F, -0.45F, -0.3F, -0.7F, -0.45F, -0.3F, -0.7F, -0.45F, -0.35F, -0.7F, -0.45F); // Box 78
		gunModel[65].setRotationPoint(4.25F, -4.35F, -0.85F);

		gunModel[66].addShapeBox(-2F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0.05F, -0.45F, -0.5F, 0F, -0.45F, -0.5F, 0F, -0.45F, -0.3F, 0.05F, -0.45F, -0.3F, -0.7F, -0.45F, -0.35F, -0.7F, -0.45F, -0.35F, -0.7F, -0.45F, -0.3F, -0.7F, -0.45F); // Box 79
		gunModel[66].setRotationPoint(4.65F, -4.65F, -0.15F);

		gunModel[67].addShapeBox(-2F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.45F, -0.3F, 0.05F, -0.45F, -0.3F, 0.05F, -0.45F, -0.5F, 0F, -0.45F, -0.35F, -0.7F, -0.45F, -0.3F, -0.7F, -0.45F, -0.3F, -0.7F, -0.45F, -0.35F, -0.7F, -0.45F); // Box 80
		gunModel[67].setRotationPoint(4.25F, -4.65F, -0.15F);

		gunModel[68].addShapeBox(-2F, 0F, 0F, 1, 1, 1, 0F,-0.35F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, -0.7F, -0.45F, -0.3F, -0.7F, -0.45F, -0.3F, -0.7F, -0.45F, -0.35F, -0.7F, -0.45F); // Box 81
		gunModel[68].setRotationPoint(4.25F, -4.35F, -0.15F);

		gunModel[69].addShapeBox(-2F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.4F, -0.55F, -0.45F, -0.4F, -0.55F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 91
		gunModel[69].setRotationPoint(5.6F, -4.75F, -0.1F);

		gunModel[70].addShapeBox(-2F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.35F, -0.55F, -0.45F, -0.35F, -0.55F, -0.45F, 0.1F, -0.4F, -0.45F, 0.1F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, 0.1F, -0.4F, -0.4F, 0.1F); // Box 92
		gunModel[70].setRotationPoint(5.6F, -4.75F, -0.8F);

		gunModel[71].addShapeBox(-2F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.4F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, 0.1F, -0.1F, -0.4F, 0.1F, -0.1F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F); // Box 93
		gunModel[71].setRotationPoint(5.3F, -4.75F, -0.8F);

		gunModel[72].addShapeBox(-2F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, 0.1F, -0.5F, -0.45F, 0.1F, -0.5F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, 0.1F, -0.5F, -0.4F, 0.1F); // Box 94
		gunModel[72].setRotationPoint(5.5F, -4.9F, -0.7F);

		gunModel[73].addShapeBox(-2F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, 0.1F, -0.45F, -0.45F, 0.1F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, 0.1F, -0.45F, -0.45F, 0.1F); // Box 95
		gunModel[73].setRotationPoint(5.5F, -4.95F, -0.7F);

		gunModel[74].addShapeBox(-2F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.4F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, 0.05F, -0.45F, -0.4F, 0.05F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, 0.05F, -0.45F, -0.45F, 0.05F); // Box 96
		gunModel[74].setRotationPoint(5.7F, -4.65F, -0.7F);

		gunModel[75].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F); // Box 97
		gunModel[75].setRotationPoint(4.5F, -4.75F, -0.9F);

		gunModel[76].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,-0.4F, -0.43F, -0.45F, -0.4F, -0.43F, -0.45F, -0.4F, -0.43F, -0.45F, -0.4F, -0.43F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F); // Box 98
		gunModel[76].setRotationPoint(4.5F, -4.9F, -0.9F);

		gunModel[77].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.4F, -0.43F, -0.45F, -0.4F, -0.43F, -0.45F, -0.4F, -0.43F, -0.45F, -0.4F, -0.43F, -0.45F); // Box 99
		gunModel[77].setRotationPoint(4.5F, -4.65F, -0.9F);

		gunModel[78].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,-0.4F, -0.43F, -0.45F, -0.4F, -0.43F, -0.45F, -0.4F, -0.43F, -0.45F, -0.4F, -0.43F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F); // Box 100
		gunModel[78].setRotationPoint(4.5F, -4.9F, -1.1F);

		gunModel[79].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F); // Box 101
		gunModel[79].setRotationPoint(4.5F, -4.75F, -1.1F);

		gunModel[80].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.4F, -0.43F, -0.45F, -0.4F, -0.43F, -0.45F, -0.4F, -0.43F, -0.45F, -0.4F, -0.43F, -0.45F); // Box 102
		gunModel[80].setRotationPoint(4.5F, -4.65F, -1.1F);

		gunModel[81].addShapeBox(-2F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F); // Box 103
		gunModel[81].setRotationPoint(4.5F, -4.77F, 0.13F);

		gunModel[82].addShapeBox(-2F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.25F, -0.45F, -0.45F, -0.25F, -0.45F, -0.45F, -0.25F, -0.45F, -0.45F, -0.25F, -0.45F, -0.45F); // Box 106
		gunModel[82].setRotationPoint(4.5F, -4.92F, 0.13F);

		gunModel[83].addShapeBox(-2F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.45F, -0.45F, -0.25F, -0.45F, -0.45F, -0.25F, -0.45F, -0.45F, -0.25F, -0.45F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F); // Box 107
		gunModel[83].setRotationPoint(4.5F, -4.62F, 0.13F);

		gunModel[84].addShapeBox(-2F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.45F, -0.45F, -0.25F, -0.45F, -0.45F, -0.25F, -0.45F, -0.45F, -0.25F, -0.45F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F); // Box 108
		gunModel[84].setRotationPoint(4.5F, -4.62F, -1.16F);

		gunModel[85].addShapeBox(-2F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F); // Box 109
		gunModel[85].setRotationPoint(4.5F, -4.77F, -1.16F);

		gunModel[86].addShapeBox(-2F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.25F, -0.45F, -0.45F, -0.25F, -0.45F, -0.45F, -0.25F, -0.45F, -0.45F, -0.25F, -0.45F, -0.45F); // Box 110
		gunModel[86].setRotationPoint(4.5F, -4.92F, -1.16F);

		gunModel[87].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.42F, -0.25F, 0F, -0.42F, -0.25F, 0F, -0.42F, -0.25F, 0F, -0.42F, -0.25F, 0F, -0.42F, -0.25F, 0F, -0.42F, -0.25F, 0F, -0.42F, -0.25F, 0F, -0.42F, -0.25F); // Box 80
		gunModel[87].setRotationPoint(16.2F, -4.42F, -0.5F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F); // Box 81
		gunModel[88].setRotationPoint(16.2F, -4.6F, -0.5F);

		gunModel[89].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F); // Box 82
		gunModel[89].setRotationPoint(16.2F, -4.24F, -0.5F);

		gunModel[90].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F); // Box 114
		gunModel[90].setRotationPoint(16.4F, -3.95F, -0.5F);

		gunModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.42F, -0.25F, 0F, -0.42F, -0.25F, 0F, -0.42F, -0.25F, 0F, -0.42F, -0.25F, 0F, -0.42F, -0.25F, 0F, -0.42F, -0.25F, 0F, -0.42F, -0.25F, 0F, -0.42F, -0.25F); // Box 115
		gunModel[91].setRotationPoint(16.4F, -3.77F, -0.5F);

		gunModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F); // Box 116
		gunModel[92].setRotationPoint(16.4F, -3.59F, -0.5F);

		gunModel[93].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.45F, -0.42F, -0.25F, -0.45F, -0.42F, -0.25F, -0.45F, -0.42F, 0F, -0.45F, -0.42F, 0F, -0.35F, -0.2F, -0.25F, -0.35F, -0.2F, -0.25F, -0.35F, -0.2F, 0F, -0.35F, -0.2F); // Box 101
		gunModel[93].setRotationPoint(22.2F, -4.67F, -0.5F);

		gunModel[94].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.35F, -0.2F, -0.25F, -0.35F, -0.2F, -0.25F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.45F, -0.42F, -0.25F, -0.45F, -0.42F, -0.25F, -0.45F, -0.42F, 0F, -0.45F, -0.42F); // Box 102
		gunModel[94].setRotationPoint(22.2F, -4.2F, -0.5F);

		gunModel[95].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.43F, -0.2F, -0.25F, -0.43F, -0.2F, -0.25F, -0.43F, -0.2F, 0F, -0.43F, -0.2F, 0F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 103
		gunModel[95].setRotationPoint(22.2F, -4.45F, -0.5F);

		gunModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.42F, -0.35F, -0.45F, -0.42F, -0.35F, -0.45F, -0.42F, 0F, -0.45F, -0.42F, 0F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, 0F, -0.35F, -0.2F); // Box 120
		gunModel[96].setRotationPoint(17.8F, -4.67F, -0.5F);

		gunModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.43F, -0.2F, -0.35F, -0.43F, -0.2F, -0.35F, -0.43F, -0.2F, 0F, -0.43F, -0.2F, 0F, -0.4F, -0.2F, -0.35F, -0.4F, -0.2F, -0.355F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 121
		gunModel[97].setRotationPoint(17.8F, -4.45F, -0.5F);

		gunModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.42F, -0.42F, -0.35F, -0.42F, -0.42F, -0.35F, -0.42F, -0.42F, 0F, -0.42F, -0.42F); // Box 122
		gunModel[98].setRotationPoint(17.8F, -4.2F, -0.5F);

		gunModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.42F, -0.42F, -0.35F, -0.42F, -0.42F, -0.35F, -0.42F, -0.42F, 0F, -0.42F, -0.42F); // Box 123
		gunModel[99].setRotationPoint(16.4F, -4.2F, -0.5F);

		gunModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.42F, -0.35F, -0.45F, -0.42F, -0.35F, -0.45F, -0.42F, 0F, -0.45F, -0.42F, 0F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, 0F, -0.35F, -0.2F); // Box 124
		gunModel[100].setRotationPoint(16.4F, -4.67F, -0.5F);

		gunModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.42F, -0.35F, -0.45F, -0.42F, -0.35F, -0.45F, -0.42F, 0F, -0.45F, -0.42F, 0F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, 0F, -0.35F, -0.2F); // Box 126
		gunModel[101].setRotationPoint(17.8F, -4F, -0.5F);

		gunModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.43F, -0.2F, -0.35F, -0.43F, -0.2F, -0.35F, -0.43F, -0.2F, 0F, -0.43F, -0.2F, 0F, -0.4F, -0.2F, -0.35F, -0.4F, -0.2F, -0.355F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 127
		gunModel[102].setRotationPoint(17.8F, -3.78F, -0.5F);

		gunModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.42F, -0.42F, -0.35F, -0.42F, -0.42F, -0.35F, -0.42F, -0.42F, 0F, -0.42F, -0.42F); // Box 128
		gunModel[103].setRotationPoint(17.8F, -3.53F, -0.5F);

		gunModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.42F, -0.42F, -0.35F, -0.42F, -0.42F, -0.35F, -0.42F, -0.42F, 0F, -0.42F, -0.42F); // Box 129
		gunModel[104].setRotationPoint(16.4F, -3.53F, -0.5F);

		gunModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.42F, -0.35F, -0.45F, -0.42F, -0.35F, -0.45F, -0.42F, 0F, -0.45F, -0.42F, 0F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, 0F, -0.35F, -0.2F); // Box 130
		gunModel[105].setRotationPoint(16.4F, -4F, -0.5F);

		gunModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.43F, -0.2F, -0.35F, -0.43F, -0.2F, -0.35F, -0.43F, -0.2F, 0F, -0.43F, -0.2F, 0F, -0.4F, -0.2F, -0.35F, -0.4F, -0.2F, -0.355F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 131
		gunModel[106].setRotationPoint(16.4F, -3.78F, -0.5F);

		gunModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, 0F, -0.2F, -0.3F); // Box 132
		gunModel[107].setRotationPoint(16.4F, -4F, -0.5F);

		gunModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, 0F, -0.2F, -0.3F); // Box 133
		gunModel[108].setRotationPoint(17.8F, -4F, -0.5F);

		gunModel[109].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.43F, -0.3F, 0F, -0.43F, -0.3F, 0F, -0.43F, -0.3F, 0F, -0.43F, -0.3F, 0F, -0.44F, -0.43F, 0F, -0.44F, -0.43F, 0F, -0.44F, -0.43F, 0F, -0.44F, -0.43F); // Box 32
		gunModel[109].setRotationPoint(16.9F, -3.63F, -0.5F);

		gunModel[110].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.43F, -0.3F, 0F, -0.43F, -0.3F, 0F, -0.43F, -0.3F, 0F, -0.43F, -0.3F, 0F, -0.43F, -0.3F, 0F, -0.43F, -0.3F, 0F, -0.43F, -0.3F, 0F, -0.43F, -0.3F); // Box 80
		gunModel[110].setRotationPoint(16.9F, -3.77F, -0.5F);

		gunModel[111].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.43F, -0.43F, 0F, -0.43F, -0.43F, 0F, -0.43F, -0.43F, 0F, -0.43F, -0.43F, 0F, -0.44F, -0.3F, 0F, -0.44F, -0.3F, 0F, -0.44F, -0.3F, 0F, -0.44F, -0.3F); // Box 81
		gunModel[111].setRotationPoint(16.9F, -3.9F, -0.5F);

		gunModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, 0F, -0.2F, -0.3F); // Box 137
		gunModel[112].setRotationPoint(22.15F, -4.45F, -0.5F);

		gunModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.2F, -0.32F, -0.3F, -0.2F, -0.32F, -0.3F, -0.2F, -0.32F, -0.3F, -0.2F, -0.32F, -0.3F, -0.2F, -0.32F, -0.3F, -0.2F, -0.32F, -0.3F, -0.2F, -0.32F, -0.3F, -0.2F, -0.32F); // Box 138
		gunModel[113].setRotationPoint(22F, -4.75F, -0.5F);

		gunModel[114].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.92F, -0.1F, -0.48F, -0.92F, -0.1F, -0.48F, -0.92F, -0.1F, -0.48F, -0.92F, -0.1F, -0.48F, -0.92F, -0.5F, -0.48F, -0.92F, -0.5F, -0.48F, -0.92F, -0.5F, -0.48F, -0.92F, -0.5F, -0.48F); // Box 100
		gunModel[114].setRotationPoint(21.5F, -4.85F, -0.49F);

		gunModel[115].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.9F, -0.4F, -0.47F, -0.9F, -0.4F, -0.47F, -0.9F, -0.4F, -0.47F, -0.9F, -0.4F, -0.47F, -0.9F, -0.45F, -0.47F, -0.9F, -0.45F, -0.47F, -0.9F, -0.45F, -0.47F, -0.9F, -0.45F, -0.47F); // Box 144
		gunModel[115].setRotationPoint(21.5F, -5.1F, -0.35F);

		gunModel[116].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.9F, -0.45F, -0.52F, -0.9F, -0.45F, -0.52F, -0.9F, -0.45F, -0.4F, -0.9F, -0.45F, -0.4F, -0.9F, -0.45F, -0.47F, -0.9F, -0.45F, -0.47F, -0.9F, -0.45F, -0.47F, -0.9F, -0.45F, -0.47F); // Box 145
		gunModel[116].setRotationPoint(21.5F, -5.25F, -0.35F);

		gunModel[117].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.9F, -0.45F, -0.4F, -0.9F, -0.45F, -0.4F, -0.9F, -0.45F, -0.52F, -0.9F, -0.45F, -0.52F, -0.9F, -0.45F, -0.47F, -0.9F, -0.45F, -0.47F, -0.9F, -0.45F, -0.47F, -0.9F, -0.45F, -0.47F); // Box 146
		gunModel[117].setRotationPoint(21.5F, -5.25F, -0.64F);

		gunModel[118].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.9F, -0.4F, -0.47F, -0.9F, -0.4F, -0.47F, -0.9F, -0.4F, -0.47F, -0.9F, -0.4F, -0.47F, -0.9F, -0.45F, -0.47F, -0.9F, -0.45F, -0.47F, -0.9F, -0.45F, -0.47F, -0.9F, -0.45F, -0.47F); // Box 147
		gunModel[118].setRotationPoint(21.5F, -5.1F, -0.64F);

		gunModel[119].addShapeBox(-2F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F); // Box 153
		gunModel[119].setRotationPoint(5.9F, -4.15F, 0F);

		gunModel[120].addShapeBox(-2F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F); // Box 154
		gunModel[120].setRotationPoint(7.65F, -4.2F, 0F);

		gunModel[121].addShapeBox(-2F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.7F, -0.4F, -0.3F, -0.7F, -0.4F, -0.3F, -0.7F, -0.4F, -0.3F, -0.7F, -0.4F); // Box 155
		gunModel[121].setRotationPoint(5.9F, -4.15F, 0.05F);

		gunModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.45F, -0.5F, -0.45F, -0.45F, -0.5F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.35F, -0.5F, -0.45F, -0.35F, -0.5F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F); // Box 59
		gunModel[122].setRotationPoint(2.4F, -5.23F, -0.43F);

		gunModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.5F, -0.45F, -0.45F, -0.5F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.5F, -0.45F, -0.35F, -0.5F); // Box 60
		gunModel[123].setRotationPoint(2.4F, -5.23F, -0.57F);

		gunModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F); // Box 61
		gunModel[124].setRotationPoint(2.4F, -5.3F, -0.5F);

		gunModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.4F); // Box 62
		gunModel[125].setRotationPoint(2.4F, -5.13F, -0.5F);

		gunModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.43F, -0.2F, -0.35F, -0.43F, -0.2F, -0.35F, -0.43F, -0.2F, 0F, -0.43F, -0.2F, 0F, -0.4F, -0.2F, -0.35F, -0.4F, -0.2F, -0.355F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 169
		gunModel[126].setRotationPoint(16.4F, -4.45F, -0.5F);

		gunModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.1F, 0.05F, 0F, -0.1F, 0.05F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0.2F, 0.4F, 0.05F, 0.2F, 0.4F, 0.05F, 0F, 0.5F, 0F); // Box 154
		gunModel[127].setRotationPoint(-0.9F, -3.4F, -0.5F);

		gunModel[128].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.15F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.15F, 0F, 0F, 1.2F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 1.2F, 0F); // Box 155
		gunModel[128].setRotationPoint(-2.9F, -3.25F, -0.5F);

		gunModel[129].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0.15F, 0F, 0F, 1F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 1F, 0F); // Box 156
		gunModel[129].setRotationPoint(-4.9F, -3.25F, -0.5F);

		gunModel[130].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.1F, 0.25F, 0F, 0.1F, 0.15F, 0F, 0.1F, 0.15F, 0F, 0.1F, 0.25F, 0F, 0.1F, 1.2F, 0F, 0.1F, 1F, 0F, 0.1F, 1F, 0F, 0.1F, 1.2F, 0F); // Box 157
		gunModel[130].setRotationPoint(-6F, -3.25F, -0.5F);

		gunModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0.7F, -0.05F, -0.1F, 1.25F, -0.05F, -0.1F, 1.25F, -0.05F, -0.2F, 0.7F, -0.05F, -0.2F, 1F, -0.05F, -0.1F, 1.2F, -0.05F, -0.1F, 1.2F, -0.05F, -0.2F, 1F, -0.05F); // Box 158
		gunModel[131].setRotationPoint(-7F, -2.25F, -0.5F);

		gunModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0F, 0.4F, 0F, 0.05F, 0.4F, 0F, 0.05F, 0.3F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0.2F, 0F, 0F); // Box 159
		gunModel[132].setRotationPoint(0.5F, -2.6F, -0.5F);

		gunModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0.2F, 0F, 0F, 0.9F, 0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, 0.05F, 0.9F, 0F, 0.05F); // Box 160
		gunModel[133].setRotationPoint(0.5F, -1.6F, -0.5F);

		gunModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.05F, 0.45F, 0F, 0.05F, 0.45F, 0F, 0.05F, 0F, 0F, 0.05F, 0.4F, -0.15F, 0.05F, 0.05F, -0.15F, 0.05F, 0.05F, -0.15F, 0.05F, 0.4F, -0.15F, 0.05F); // Box 161
		gunModel[134].setRotationPoint(-0.4F, -0.6F, -0.5F);

		gunModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.4F, -0.35F, 0.05F, 0.05F, -0.35F, 0.05F, 0.05F, -0.35F, 0.05F, 0.4F, -0.35F, 0.05F, 0.25F, -0.35F, 0.05F, -0.15F, -0.35F, 0.05F, -0.15F, -0.35F, 0.05F, 0.25F, -0.35F, 0.05F); // Box 162
		gunModel[135].setRotationPoint(-0.4F, -0.1F, -0.5F);

		gunModel[136].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.55F, -0.2F, -0.25F, -0.55F, -0.2F, -0.25F, -0.4F, -0.2F); // Box 116
		gunModel[136].setRotationPoint(10.4F, -2.8F, -0.5F);

		gunModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.1F, -0.25F, -0.3F, -0.1F, -0.25F, -0.3F, -0.1F, -0.25F, -0.3F, -0.1F, -0.25F, -0.3F, -0.1F, -0.25F, -0.3F, -0.1F, -0.25F, -0.3F, -0.1F, -0.25F, -0.3F, -0.1F, -0.25F); // Box 117
		gunModel[137].setRotationPoint(11.4F, -2.5F, -0.5F);

		gunModel[138].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.6F, -0.1F, -0.4F, -0.6F, -0.1F, -0.4F, -0.6F, -0.1F, 0F, -0.6F, -0.1F); // Box 118
		gunModel[138].setRotationPoint(11.4F, -2F, -0.5F);

		gunModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, -0.1F, -0.4F, -0.6F, -0.1F, -0.4F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, -0.3F, -0.1F, -0.1F, -0.35F, -0.1F, -0.1F, -0.35F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F); // Box 119
		gunModel[139].setRotationPoint(11.4F, -0.2F, -0.5F);

		gunModel[140].addShapeBox(-9F, 0F, 0F, 9, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 94
		gunModel[140].setRotationPoint(16.9F, -3.35F, 0F);
		gunModel[140].rotateAngleY = -0.05235988F;
		gunModel[140].rotateAngleZ = 0.08726646F;

		gunModel[141].addShapeBox(-9F, 0F, 0F, 9, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 232
		gunModel[141].setRotationPoint(16.9F, -3.35F, -1F);
		gunModel[141].rotateAngleY = 0.05235988F;
		gunModel[141].rotateAngleZ = 0.08726646F;

		gunModel[142].addShapeBox(-9.5F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F); // Box 233
		gunModel[142].setRotationPoint(16.9F, -3.35F, -1F);
		gunModel[142].rotateAngleY = 0.05235988F;
		gunModel[142].rotateAngleZ = 0.08726646F;

		gunModel[143].addShapeBox(-9.5F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F); // Box 234
		gunModel[143].setRotationPoint(16.9F, -3.35F, 0F);
		gunModel[143].rotateAngleY = -0.05235988F;
		gunModel[143].rotateAngleZ = 0.08726646F;

		gunModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F); // Box 235
		gunModel[144].setRotationPoint(16.3F, -3.35F, -0.5F);
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 148
		ammoModel[1] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 149
		ammoModel[2] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 150
		ammoModel[3] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 151
		ammoModel[4] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 152
		ammoModel[5] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 156
		ammoModel[6] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 157
		ammoModel[7] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 158
		ammoModel[8] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 159
		ammoModel[9] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 160
		ammoModel[10] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 161
		ammoModel[11] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 162
		ammoModel[12] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 163
		ammoModel[13] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 164

		ammoModel[0].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, -0.2F, 0F, -0.2F); // Box 148
		ammoModel[0].setRotationPoint(4.7F, -2.4F, -0.5F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0F, 0F, -0.1F, -0.2F, 0F, -0.1F, 0.5F, -0.15F, -0.1F, 0.5F, -0.15F, -0.1F, -0.2F, 0F, -0.1F); // Box 149
		ammoModel[1].setRotationPoint(4.7F, -2.4F, -0.5F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.4F, -0.15F, -0.1F, 0F, -0.225F, -0.1F, 0F, -0.225F, -0.1F, -0.4F, -0.15F, -0.1F); // Box 150
		ammoModel[2].setRotationPoint(5.9F, -2.4F, -0.5F);

		ammoModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.15F, 0F, -0.25F, -0.15F, 0F, -0.25F, -0.15F, 0F, -0.25F, -0.15F, 0F, -0.25F, -0.15F, 0F, -0.25F, -0.15F, 0F, -0.25F, -0.15F, 0F, -0.25F, -0.15F, 0F, -0.25F); // Box 151
		ammoModel[3].setRotationPoint(3.8F, -2.95F, -0.5F);

		ammoModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, 0F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.3F); // Box 152
		ammoModel[4].setRotationPoint(3.9F, -2.55F, -0.5F);

		ammoModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, 0F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.3F); // Box 156
		ammoModel[5].setRotationPoint(2.6F, -2.55F, -0.5F);

		ammoModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, 0F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0.1F, -0.3F, -0.45F, 0.1F, -0.3F, -0.45F, 0.1F, -0.3F, -0.45F, 0.1F, -0.3F); // Box 157
		ammoModel[6].setRotationPoint(1.3F, -2.65F, -0.5F);

		ammoModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.85F, -0.3F, -0.3F, -0.85F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F); // Box 158
		ammoModel[7].setRotationPoint(2.6F, -1.85F, -0.5F);

		ammoModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.85F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.85F, -0.3F, -0.3F); // Box 159
		ammoModel[8].setRotationPoint(1.3F, -1.85F, -0.5F);

		ammoModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.45F, -0.3F, -0.2F, -0.45F, -0.3F, -0.2F, -0.45F, -0.3F, -0.2F, -0.45F, -0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.45F, -0.3F); // Box 160
		ammoModel[9].setRotationPoint(1.95F, -1.7F, -0.5F);

		ammoModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F); // Box 161
		ammoModel[10].setRotationPoint(1.8F, -2.25F, -0.5F);

		ammoModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F); // Box 162
		ammoModel[11].setRotationPoint(1.8F, -2.45F, -0.5F);

		ammoModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.55F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.55F, -0.35F, -0.35F); // Box 163
		ammoModel[12].setRotationPoint(1.8F, -2.05F, -0.5F);

		ammoModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.1F, -0.1F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.4F, -0.1F, -0.1F, -0.4F); // Box 164
		ammoModel[13].setRotationPoint(2.6F, -2.55F, -0.5F);
	}

	private void initslideModel_1()
	{
		slideModel[0] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 80
		slideModel[1] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 81
		slideModel[2] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 82
		slideModel[3] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 83
		slideModel[4] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 84
		slideModel[5] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 85

		slideModel[0].addShapeBox(-2F, -2F, 0F, 4, 1, 1, 0F,-0.1F, 0.05F, -0.4F, -0.6F, 0.05F, -0.4F, -0.6F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.4F, -1.6F, 0F, -0.4F, -0.6F, 0F, -0.35F, -0.1F, 0F, -0.35F); // Box 80
		slideModel[0].setRotationPoint(5.3F, -1.94F, -0.3F);

		slideModel[1].addShapeBox(-2F, -2F, 0F, 4, 1, 1, 0F,-0.1F, 0F, -0.35F, -0.6F, 0F, -0.35F, -0.6F, 0.05F, -0.4F, -0.1F, 0.05F, -0.4F, -0.1F, 0F, -0.35F, -0.6F, 0F, -0.35F, -0.6F, 0F, -0.4F, -0.1F, 0F, -0.4F); // Box 81
		slideModel[1].setRotationPoint(5.3F, -1.94F, -0.7F);

		slideModel[2].addShapeBox(-2F, -2F, 0F, 4, 1, 1, 0F,-0.1F, 0.05F, -0.4F, -0.6F, 0.05F, -0.4F, -0.6F, 0.05F, -0.4F, -0.1F, 0.05F, -0.4F, -0.1F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.1F, 0F, -0.4F); // Box 82
		slideModel[2].setRotationPoint(5.3F, -1.94F, -0.5F);

		slideModel[3].addShapeBox(-2F, -2F, 0F, 1, 1, 1, 0F,0F, -0.05F, -0.3F, -0.6F, -0.05F, -0.3F, -0.6F, 0.05F, -0.4F, 0F, 0.05F, -0.4F, 0F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 83
		slideModel[3].setRotationPoint(8.3F, -2.05F, -0.7F);

		slideModel[4].addShapeBox(-2F, -2F, 0F, 1, 1, 1, 0F,0F, 0.05F, -0.4F, -0.6F, 0.05F, -0.4F, -0.6F, 0.05F, -0.4F, 0F, 0.05F, -0.4F, 0F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 84
		slideModel[4].setRotationPoint(8.3F, -2.05F, -0.5F);

		slideModel[5].addShapeBox(-2F, -2F, 0F, 1, 1, 1, 0F,0F, 0.05F, -0.4F, -0.6F, 0.05F, -0.4F, -0.6F, -0.05F, -0.3F, 0F, -0.05F, -0.3F, 0F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 85
		slideModel[5].setRotationPoint(8.3F, -2.05F, -0.3F);
	}
}