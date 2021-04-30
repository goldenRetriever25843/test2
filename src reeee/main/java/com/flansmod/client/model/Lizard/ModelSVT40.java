//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 27.03.2018 - 11:22:56
// Last changed on: 27.03.2018 - 11:22:56

package com.flansmod.client.model.Lizard; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSVT40 extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSVT40() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[126];
		ammoModel = new ModelRendererTurbo[4];
		slideModel = new ModelRendererTurbo[7];

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
		gunModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 6
		gunModel[7] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 7
		gunModel[8] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 8
		gunModel[9] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 9
		gunModel[10] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 10
		gunModel[11] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 11
		gunModel[12] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 13
		gunModel[13] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 14
		gunModel[14] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 15
		gunModel[15] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 16
		gunModel[16] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 17
		gunModel[17] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 18
		gunModel[18] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 19
		gunModel[19] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 20
		gunModel[20] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 21
		gunModel[21] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 22
		gunModel[22] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 23
		gunModel[23] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 25
		gunModel[24] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 26
		gunModel[25] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 27
		gunModel[26] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 28
		gunModel[27] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 29
		gunModel[28] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 30
		gunModel[29] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 31
		gunModel[30] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 32
		gunModel[31] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 33
		gunModel[32] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 34
		gunModel[33] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 35
		gunModel[34] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 36
		gunModel[35] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 37
		gunModel[36] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 38
		gunModel[37] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 40
		gunModel[38] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 41
		gunModel[39] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 42
		gunModel[40] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 43
		gunModel[41] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 44
		gunModel[42] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 45
		gunModel[43] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 46
		gunModel[44] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 47
		gunModel[45] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 48
		gunModel[46] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 49
		gunModel[47] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 50
		gunModel[48] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 51
		gunModel[49] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 52
		gunModel[50] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 53
		gunModel[51] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 55
		gunModel[52] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 57
		gunModel[53] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 58
		gunModel[54] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 59
		gunModel[55] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 60
		gunModel[56] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 61
		gunModel[57] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 62
		gunModel[58] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 63
		gunModel[59] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 64
		gunModel[60] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 65
		gunModel[61] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 66
		gunModel[62] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 67
		gunModel[63] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 68
		gunModel[64] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 69
		gunModel[65] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 70
		gunModel[66] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 71
		gunModel[67] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 73
		gunModel[68] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 74
		gunModel[69] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 75
		gunModel[70] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 76
		gunModel[71] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 79
		gunModel[72] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 80
		gunModel[73] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 81
		gunModel[74] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 90
		gunModel[75] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 91
		gunModel[76] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 92
		gunModel[77] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 93
		gunModel[78] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 94
		gunModel[79] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 95
		gunModel[80] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 96
		gunModel[81] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 97
		gunModel[82] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 98
		gunModel[83] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 99
		gunModel[84] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 100
		gunModel[85] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 78
		gunModel[86] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 79
		gunModel[87] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 80
		gunModel[88] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 75
		gunModel[89] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 76
		gunModel[90] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 77
		gunModel[91] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 107
		gunModel[92] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 108
		gunModel[93] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 109
		gunModel[94] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 110
		gunModel[95] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 111
		gunModel[96] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 112
		gunModel[97] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 113
		gunModel[98] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 114
		gunModel[99] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 115
		gunModel[100] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 116
		gunModel[101] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 54
		gunModel[102] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 55
		gunModel[103] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 56
		gunModel[104] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 120
		gunModel[105] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 121
		gunModel[106] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 107
		gunModel[107] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 108
		gunModel[108] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 109
		gunModel[109] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 125
		gunModel[110] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 61
		gunModel[111] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 63
		gunModel[112] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 64
		gunModel[113] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 65
		gunModel[114] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 66
		gunModel[115] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 67
		gunModel[116] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 132
		gunModel[117] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 133
		gunModel[118] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 37
		gunModel[119] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 38
		gunModel[120] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 141
		gunModel[121] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 142
		gunModel[122] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 143
		gunModel[123] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 144
		gunModel[124] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 146
		gunModel[125] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 147

		gunModel[0].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.2F, -0.1F, 0.2F, -0.2F, -0.1F, 0.2F, -0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.4F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, 0.4F, 0F, 0.2F); // Box 0
		gunModel[0].setRotationPoint(0.8F, -3.6F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, -0.45F, 0.2F, 0.25F, -0.45F, 0.1F, 0.25F, -0.45F, 0.1F, 0.25F, -0.45F, 0.2F, 0.25F, -0.45F, 0.2F, 0.25F, -0.45F, 0.2F, 0.25F, -0.45F, 0.2F, 0.25F, -0.45F, 0.2F); // Box 1
		gunModel[1].setRotationPoint(0.85F, -4.05F, -0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.25F, -0.1F, 0.2F, 0.25F, -0.1F, 0.2F, 0.25F, -0.1F, 0.2F, 0.25F, -0.1F, 0.2F, 0.25F, 0F, 0.2F, 0.25F, -0.2F, 0.2F, 0.25F, -0.2F, 0.2F, 0.25F, 0F, 0.2F); // Box 2
		gunModel[2].setRotationPoint(3.85F, -3.6F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.15F, 0.2F, -0.35F, -0.05F, 0.2F, -0.35F, -0.05F, 0.2F, -0.35F, -0.15F, 0.2F, -0.35F, -0.15F, 0.2F, -0.35F, -0.15F, 0.2F, -0.35F, -0.15F, 0.2F, -0.35F, -0.15F, 0.2F); // Box 3
		gunModel[3].setRotationPoint(6.75F, -3.65F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.4F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, 0.4F, -0.2F, 0.2F, 0.4F, -0.25F, -0.1F, -0.2F, -0.25F, -0.1F, -0.2F, -0.25F, -0.1F, 0.4F, -0.25F, -0.1F); // Box 4
		gunModel[4].setRotationPoint(0.8F, -2.8F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.25F, -0.2F, 0.2F, 0.25F, 0F, 0.2F, 0.25F, 0F, 0.2F, 0.25F, -0.2F, 0.2F, 0.25F, -0.25F, -0.1F, 0.25F, -0.4F, -0.1F, 0.25F, -0.4F, -0.1F, 0.25F, -0.25F, -0.1F); // Box 5
		gunModel[5].setRotationPoint(3.85F, -2.8F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.2F, 0.2F, -0.35F, -0.2F, 0.2F, -0.35F, -0.2F, 0.2F, -0.35F, -0.2F, 0.2F, -0.35F, -0.2F, -0.1F, -0.35F, -0.25F, -0.1F, -0.35F, -0.25F, -0.1F, -0.35F, -0.2F, -0.1F); // Box 6
		gunModel[6].setRotationPoint(6.75F, -3F, -0.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.15F, 0.1F, -0.35F, -0.05F, 0.1F, -0.35F, -0.05F, 0.1F, -0.35F, -0.15F, 0.1F, -0.35F, -0.75F, 0.2F, -0.35F, -0.85F, 0.2F, -0.35F, -0.85F, 0.2F, -0.35F, -0.75F, 0.2F); // Box 7
		gunModel[7].setRotationPoint(6.75F, -3.75F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.25F, -0.45F, 0.1F, 0.5F, -0.45F, 0.1F, 0.5F, -0.45F, 0.1F, 0.25F, -0.45F, 0.1F, 0.25F, -0.45F, 0.2F, 0.5F, -0.45F, 0.2F, 0.5F, -0.45F, 0.2F, 0.25F, -0.45F, 0.2F); // Box 8
		gunModel[8].setRotationPoint(7.65F, -4.15F, -0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.35F, -0.2F, 0.2F, -0.6F, -0.05F, 0.2F, -0.6F, -0.05F, 0.2F, -0.35F, -0.2F, 0.2F, -0.35F, -0.25F, -0.1F, -0.6F, -0.6F, -0.1F, -0.6F, -0.6F, -0.1F, -0.35F, -0.25F, -0.1F); // Box 9
		gunModel[9].setRotationPoint(7.05F, -3F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.35F, -0.35F, 0.2F, -0.9F, -0.35F, 0.2F, -0.9F, -0.35F, 0.2F, -0.35F, -0.35F, 0.2F, -0.35F, -0.35F, 0.2F, -0.6F, -0.5F, 0.2F, -0.6F, -0.5F, 0.2F, -0.35F, -0.35F, 0.2F); // Box 10
		gunModel[10].setRotationPoint(7.05F, -3.45F, -0.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.25F, -0.45F, 0.2F, 0.5F, -0.45F, 0.2F, 0.5F, -0.45F, 0.2F, 0.25F, -0.45F, 0.2F, 0.25F, -0.45F, 0.2F, 0.5F, -0.45F, 0.2F, 0.5F, -0.45F, 0.2F, 0.25F, -0.45F, 0.2F); // Box 11
		gunModel[11].setRotationPoint(7.65F, -4.05F, -0.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.4F, 0.2F, -0.35F, -0.4F, 0.2F, -0.35F, -0.4F, 0.2F, -0.35F, -0.4F, 0.2F, -0.35F, -0.4F, 0.2F, -0.45F, -0.4F, 0.2F, -0.45F, -0.4F, 0.2F, -0.35F, -0.4F, 0.2F); // Box 13
		gunModel[12].setRotationPoint(7.05F, -3.9F, -0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.4F, 0.2F, -0.45F, -0.4F, 0.2F, -0.45F, -0.4F, 0.2F, -0.35F, -0.4F, 0.2F, -0.35F, -0.4F, 0.2F, -0.35F, -0.4F, 0.2F, -0.35F, -0.4F, 0.2F, -0.35F, -0.4F, 0.2F); // Box 14
		gunModel[13].setRotationPoint(7.05F, -3.7F, -0.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.35F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.35F, 0.2F, -0.3F, -0.5F, 0.2F, 0F, -0.6F, 0.2F, 0F, -0.6F, 0.2F, -0.3F, -0.5F, 0.2F); // Box 15
		gunModel[14].setRotationPoint(10.15F, -3.45F, -0.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.3F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.35F, -0.1F, 0F, -0.45F, -0.1F, 0F, -0.45F, -0.1F, -0.3F, -0.35F, -0.1F); // Box 16
		gunModel[15].setRotationPoint(10.15F, -3.25F, -0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0.05F, 0F, -0.25F, 0.05F, 0F, -0.25F, 0.05F, 0F, -0.25F, 0.05F, 0F, -0.25F, 0.05F, 0F, -0.25F, 0.05F, 0F, -0.25F, 0.05F, 0F, -0.25F, 0.05F); // Box 17
		gunModel[16].setRotationPoint(7.15F, -3.8F, -0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.35F, -0.2F, 0.2F, -0.35F, -0.2F, 0.1F, -0.35F, -0.2F, 0.1F, -0.35F, -0.2F, 0.2F, -0.35F, -0.25F, 0.2F, -0.35F, -0.5F, 0.1F, -0.35F, -0.5F, 0.1F, -0.35F, -0.25F, 0.2F); // Box 18
		gunModel[17].setRotationPoint(10.8F, -3.8F, -0.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.15F, -0.45F, 0.1F, 0.15F, -0.45F, 0.05F, 0.15F, -0.45F, 0.05F, 0.15F, -0.45F, 0.1F, 0.15F, -0.45F, 0.2F, 0.15F, -0.45F, 0.1F, 0.15F, -0.45F, 0.1F, 0.15F, -0.45F, 0.2F); // Box 19
		gunModel[18].setRotationPoint(11.3F, -4.15F, -0.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.35F, -0.45F, 0.2F, -0.35F, -0.2F, 0.1F, -0.35F, -0.2F, 0.1F, -0.35F, -0.45F, 0.2F, -0.35F, -0.2F, -0.1F, -0.35F, -0.35F, -0.1F, -0.35F, -0.35F, -0.1F, -0.35F, -0.2F, -0.1F); // Box 20
		gunModel[19].setRotationPoint(10.8F, -3.5F, -0.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, 0.05F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0.05F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.05F, 0F, -0.45F, 0.05F, 0F, -0.45F, 0.1F); // Box 21
		gunModel[20].setRotationPoint(13.45F, -4.15F, -0.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.2F, 0.1F, 0F, -0.2F, 0.05F, 0F, -0.2F, 0.05F, 0F, -0.2F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.1F); // Box 22
		gunModel[21].setRotationPoint(13.45F, -3.8F, -0.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0.1F, 0F, -0.25F, 0.05F, 0F, -0.25F, 0.05F, 0F, -0.25F, 0.1F, 0F, -0.3F, -0.1F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.3F, -0.1F); // Box 23
		gunModel[22].setRotationPoint(13.45F, -3.55F, -0.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, 0.2F, -0.4F, -0.45F, 0.2F, -0.4F, -0.45F, 0.2F, -0.4F, -0.45F, 0.2F, -0.5F, -0.43F, 0.2F, -0.4F, -0.43F, 0.2F, -0.4F, -0.43F, 0.2F, -0.5F, -0.43F, 0.2F); // Box 25
		gunModel[23].setRotationPoint(10.55F, -3.95F, -0.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.42F, 0.2F, -0.4F, -0.42F, 0.2F, -0.4F, -0.42F, 0.2F, -0.5F, -0.42F, 0.2F, -0.4F, -0.4F, 0.2F, -0.4F, -0.45F, 0.2F, -0.4F, -0.45F, 0.2F, -0.4F, -0.4F, 0.2F); // Box 26
		gunModel[24].setRotationPoint(10.55F, -3.8F, -0.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, -0.5F, 0.1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0.2F, -0.5F, 0.1F, 0.2F, 0F, -0.2F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0.2F, 0F, -0.2F); // Box 27
		gunModel[25].setRotationPoint(-0.6F, -2.8F, -0.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, -0.6F, 0.1F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, -0.6F, 0.1F, 0.2F, 0.05F, 0.1F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0.2F, 0.05F, 0.1F); // Box 28
		gunModel[26].setRotationPoint(-0.6F, -3.35F, -0.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, -0.3F, -0.15F, 0.2F, 0.15F, 0.2F, 0.2F, 0.15F, 0.2F, 0.2F, -0.3F, -0.15F, 0.2F, -0.3F, 0.1F, 0.2F, -1F, 0.2F, 0.2F, -1F, 0.2F, 0.2F, -0.3F, 0.1F); // Box 29
		gunModel[27].setRotationPoint(-0.6F, -3.45F, -0.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.25F, -0.45F, 0.1F, 0.25F, -0.45F, 0.1F, 0.25F, -0.45F, 0.1F, -0.25F, -0.45F, 0.1F, -0.25F, -0.45F, 0.2F, 0.25F, -0.45F, 0.2F, 0.25F, -0.45F, 0.2F, -0.25F, -0.45F, 0.2F); // Box 30
		gunModel[28].setRotationPoint(1.85F, -4.05F, -0.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, -0.7F, 0.05F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0.2F, -0.7F, 0.05F, 0.2F, 0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0.2F, 0.3F, -0.2F); // Box 31
		gunModel[29].setRotationPoint(-1.8F, -2.5F, -0.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.55F, 0F, -0.2F, -0.1F, 0.05F, -0.2F, -0.1F, 0.05F, -0.2F, -0.55F, 0F, -0.2F, 0.2F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, 0.2F, -0.2F); // Box 32
		gunModel[30].setRotationPoint(-2.8F, -1.9F, -0.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.55F, 0F, -0.35F, -0.55F, 0F, -0.35F, -0.55F, 0F, -0.35F, -0.55F, 0F, -0.35F, 0.2F, -0.2F, -0.35F, 0.2F, -0.2F, -0.35F, 0.2F, -0.2F, -0.35F, 0.2F, -0.2F); // Box 33
		gunModel[31].setRotationPoint(-3.25F, -1.9F, -0.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, -0.7F, 0.05F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0.2F, -0.7F, 0.05F, 0.2F, 0.15F, 0.05F, 0F, -0.35F, 0.1F, 0F, -0.35F, 0.1F, 0.2F, 0.15F, 0.05F); // Box 34
		gunModel[32].setRotationPoint(-1.8F, -2.95F, -0.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.1F, 0F, -0.2F, -0.1F, 0.05F, -0.2F, -0.1F, 0.05F, -0.2F, -0.1F, 0F, -0.2F, 0F, 0F, -0.2F, -0.45F, 0.05F, -0.2F, -0.45F, 0.05F, -0.2F, 0F, 0F); // Box 35
		gunModel[33].setRotationPoint(-2.8F, -2.35F, -0.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.55F, 0F, -0.35F, -0.55F, 0F, -0.35F, -0.55F, 0F, -0.2F, -0.55F, 0F, -0.35F, 0.45F, 0F, -0.35F, 0.45F, 0F, -0.35F, 0.45F, 0F, -0.35F, 0.45F, 0F); // Box 36
		gunModel[34].setRotationPoint(-3.25F, -2.8F, -0.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.3F, -0.25F, -0.2F, -0.3F, -0.25F, -0.2F, -0.3F, -0.25F, -0.2F, -0.3F, -0.25F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0.05F, -0.2F, -0.3F, 0.05F, -0.2F, -0.3F, 0F); // Box 37
		gunModel[35].setRotationPoint(-2.8F, -2.95F, -0.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, -0.7F, -0.25F, 0F, -0.2F, -0.15F, 0F, -0.2F, -0.15F, 0.2F, -0.7F, -0.25F, 0.2F, 0.1F, 0.05F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0.2F, 0.1F, 0.05F); // Box 38
		gunModel[36].setRotationPoint(-1.8F, -3.35F, -0.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.15F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.25F, -0.3F, 0F); // Box 40
		gunModel[37].setRotationPoint(-3.3F, -2.95F, -0.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, 0.45F, 0F, -0.35F, 0.45F, 0F, -0.35F, 0.45F, 0F, -0.1F, 0.45F, 0F, -0.1F, -0.55F, 0F, -0.2F, -0.55F, 0F, -0.2F, -0.55F, 0F, -0.1F, -0.55F, 0F); // Box 41
		gunModel[38].setRotationPoint(-3.7F, -1.8F, -0.5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.25F, 0.45F, 0.1F, 0.25F, 0.45F, 0F, 0.25F, 0.45F, 0F, 0.25F, 0.45F, 0.1F, 0F, 0.15F, 0.1F, 0.25F, -0.55F, 0F, 0.25F, -0.55F, 0F, 0F, 0.15F, 0.1F); // Box 42
		gunModel[39].setRotationPoint(-6.85F, -1.8F, -0.5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.25F, -0.05F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.05F, -0.25F, 0.25F, -0.35F, 0.1F, 0.25F, -0.35F, 0F, 0.25F, -0.35F, 0F, 0.25F, -0.35F, 0.1F); // Box 43
		gunModel[40].setRotationPoint(-6.85F, -2.9F, -0.5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.25F, -0.35F, 0.1F, -0.25F, -0.35F, 0.1F, -0.25F, -0.1F, 0.2F, -0.25F, -0.1F, -0.55F, 0F, -0.35F, -0.55F, 0F, -0.35F, -0.55F, 0F, -0.1F, -0.55F, 0F); // Box 44
		gunModel[41].setRotationPoint(-3.7F, -2.7F, -0.5F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.55F, 0F, -0.2F, -0.55F, 0F, -0.2F, -0.55F, 0F, -0.1F, -0.55F, 0F, -0.1F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.1F, 0.2F, -0.2F); // Box 45
		gunModel[42].setRotationPoint(-3.7F, -1.9F, -0.5F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0.1F, 0.25F, 0.2F, 0F, 0.25F, 0.2F, 0F, 0F, -0.5F, 0.1F, 0F, 0.4F, -0.2F, 0.25F, -0.55F, -0.2F, 0.25F, -0.55F, -0.2F, 0F, 0.4F, -0.2F); // Box 46
		gunModel[43].setRotationPoint(-6.85F, -1.15F, -0.5F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.1F, 0.25F, 0.05F, 0.1F, 0.25F, 0.05F, 0.1F, 0.3F, 0F, 0.1F, 0.1F, 0.75F, 0.1F, 0.5F, 0.55F, 0.1F, 0.5F, 0.55F, 0.1F, 0.1F, 0.75F, 0.1F); // Box 47
		gunModel[44].setRotationPoint(-8.35F, -2.2F, -0.5F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.2F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, 0.1F, -0.2F, 0.5F, -0.1F, -0.2F, 0.5F, -0.1F, -0.2F, 0.1F, 0.1F, -0.2F); // Box 48
		gunModel[45].setRotationPoint(-8.35F, -0.65F, -0.5F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.15F, -0.25F, -0.25F, 0.5F, -0.15F, -0.25F, 0.5F, -0.15F, -0.25F, 0.15F, -0.25F, -0.25F, 0.05F, -0.2F, 0.1F, 0.5F, -0.25F, 0.1F, 0.5F, -0.25F, 0.1F, 0.05F, -0.2F, 0.1F); // Box 49
		gunModel[46].setRotationPoint(-8.6F, -3F, -0.5F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.25F, -0.3F, 0.05F, 0F, -0.3F, 0.05F, 0F, -0.3F, 0.05F, 0.25F, -0.3F, 0.05F, 0.25F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0.25F, -0.3F, 0.1F); // Box 50
		gunModel[47].setRotationPoint(8.15F, -4.4F, -0.5F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.3F, 0.05F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, 0F, -0.3F, 0.05F, 0F, -0.3F, 0.1F, -0.1F, -0.3F, 0.05F, -0.1F, -0.3F, 0.05F, 0F, -0.3F, 0.1F); // Box 51
		gunModel[48].setRotationPoint(11.15F, -4.4F, -0.5F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.25F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0.25F, -0.4F, -0.3F, 0.25F, -0.3F, 0.05F, 0F, -0.3F, 0.05F, 0F, -0.3F, 0.05F, 0.25F, -0.3F, 0.05F); // Box 52
		gunModel[49].setRotationPoint(8.15F, -4.8F, -0.5F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.3F, 0.05F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, 0F, -0.3F, 0.05F); // Box 53
		gunModel[50].setRotationPoint(11.15F, -4.8F, -0.5F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.5F, -0.3F, 0.02F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.5F, -0.3F, 0.02F, -0.5F, -0.35F, 0.05F, -0.1F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.5F, -0.35F, 0.05F); // Box 55
		gunModel[51].setRotationPoint(12.55F, -4.3F, -0.5F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.45F, -0.5F, 0F, -0.4F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.4F, -0.4F, 0F); // Box 57
		gunModel[52].setRotationPoint(13.2F, -4.6F, -0.5F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.05F, -0.1F, -0.4F, -0.05F, -0.1F, -0.4F, -0.05F, -0.4F, -0.4F, -0.05F, -0.45F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.45F, -0.5F, 0F); // Box 58
		gunModel[53].setRotationPoint(13.2F, -4.6F, -0.5F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.05F, -0.1F, -0.4F, -0.05F, -0.1F, -0.4F, -0.05F, -0.4F, -0.4F, -0.05F, -0.45F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.45F, -0.5F, 0F); // Box 59
		gunModel[54].setRotationPoint(14.25F, -4.6F, -0.5F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.45F, -0.5F, 0F, -0.4F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.4F, -0.4F, 0F); // Box 60
		gunModel[55].setRotationPoint(14.25F, -4.6F, -0.5F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.05F, -0.1F, -0.4F, -0.05F, -0.1F, -0.4F, -0.05F, -0.4F, -0.4F, -0.05F, -0.45F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.45F, -0.5F, 0F); // Box 61
		gunModel[56].setRotationPoint(15.25F, -4.6F, -0.5F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.45F, -0.5F, 0F, -0.4F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.4F, -0.4F, 0F); // Box 62
		gunModel[57].setRotationPoint(15.25F, -4.6F, -0.5F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.05F, 0.2F, -0.4F, -0.05F, 0.2F, -0.4F, -0.05F, -0.4F, -0.4F, -0.05F, -0.45F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, -0.45F, -0.5F, 0F); // Box 63
		gunModel[58].setRotationPoint(16.25F, -4.6F, -0.5F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, -0.45F, -0.5F, 0F, -0.4F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, -0.4F, -0.4F, 0F); // Box 64
		gunModel[59].setRotationPoint(16.25F, -4.6F, -0.5F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.15F, -0.4F, -0.3F, 0.25F, -0.4F, -0.3F, 0.25F, -0.4F, -0.3F, 0.15F, -0.4F, -0.3F, 0.15F, -0.4F, 0F, 0.25F, -0.4F, -0.05F, 0.25F, -0.4F, -0.05F, 0.15F, -0.4F, 0F); // Box 65
		gunModel[60].setRotationPoint(13.2F, -4.8F, -0.5F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.65F, -0.3F, 0F, 0.75F, -0.3F, 0F, 0.75F, -0.3F, 0F, 0.65F, -0.3F, 0F, 0.65F, -0.3F, 0F, 0.75F, -0.3F, 0F, 0.75F, -0.3F, 0F, 0.65F, -0.3F, 0F); // Box 66
		gunModel[61].setRotationPoint(0.85F, -4.1F, -0.5F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 67
		gunModel[62].setRotationPoint(2.85F, -3.95F, -0.5F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.35F, -0.35F, 0.1F, -0.35F, -0.35F, 0.1F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.4F, -0.35F, 0.1F, -0.4F, -0.35F, 0.1F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 68
		gunModel[63].setRotationPoint(3.6F, -4.4F, -0.5F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.65F, -0.4F, -0.3F, 0.85F, -0.4F, -0.3F, 0.85F, -0.4F, -0.3F, 0.65F, -0.4F, -0.3F, 0.65F, -0.4F, -0.3F, 0.85F, -0.4F, -0.3F, 0.85F, -0.4F, -0.3F, 0.65F, -0.4F, -0.3F); // Box 69
		gunModel[64].setRotationPoint(0.85F, -4.6F, -0.5F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.75F, -0.4F, -0.4F, 0.85F, -0.4F, -0.4F, 0.85F, -0.4F, -0.4F, 0.75F, -0.4F, -0.4F, 0.9F, -0.45F, -0.3F, 0.85F, -0.45F, -0.3F, 0.85F, -0.45F, -0.3F, 0.9F, -0.45F, -0.3F); // Box 70
		gunModel[65].setRotationPoint(0.85F, -4.75F, -0.5F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.65F, -0.35F, -0.3F, 0.75F, -0.35F, -0.3F, 0.75F, -0.35F, -0.3F, 0.65F, -0.35F, -0.3F, 0.65F, -0.4F, 0F, 0.75F, -0.4F, 0F, 0.75F, -0.4F, 0F, 0.65F, -0.4F, 0F); // Box 71
		gunModel[66].setRotationPoint(0.85F, -4.4F, -0.5F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.05F, -0.3F, -0.3F, 0.05F, -0.3F, -0.3F, 0.05F, -0.3F, 0F, 0.05F, -0.3F, 0F, 0.05F, -0.3F, -0.3F, 0.05F, -0.3F, -0.3F, 0.05F, -0.3F, 0F, 0.05F, -0.3F, 0F); // Box 73
		gunModel[67].setRotationPoint(3.65F, -4.1F, -0.5F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F); // Box 74
		gunModel[68].setRotationPoint(-0.4F, -4.2F, -0.5F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.5F, -0.15F, -0.2F, -0.5F, -0.25F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.5F, -0.15F, -0.2F, -0.5F); // Box 75
		gunModel[69].setRotationPoint(3.9F, -4.6F, -0.5F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.15F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.15F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F); // Box 76
		gunModel[70].setRotationPoint(3.9F, -4.6F, -0.5F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.65F, -0.4F, -0.3F, 0.85F, -0.4F, -0.3F, 0.85F, -0.4F, -0.3F, 0.65F, -0.4F, -0.3F, 0.65F, -0.35F, -0.3F, 0.85F, -0.35F, -0.3F, 0.85F, -0.35F, -0.3F, 0.65F, -0.35F, -0.3F); // Box 79
		gunModel[71].setRotationPoint(7.75F, -4.7F, -0.5F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 80
		gunModel[72].setRotationPoint(7.1F, -4.4F, -0.5F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 81
		gunModel[73].setRotationPoint(7.1F, -4.1F, -0.5F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.65F, -0.35F, -0.27F, 0.85F, -0.35F, -0.27F, 0.85F, -0.35F, -0.27F, 0.65F, -0.35F, -0.27F, 0.65F, -0.35F, -0.27F, 0.85F, -0.35F, -0.27F, 0.85F, -0.35F, -0.27F, 0.65F, -0.35F, -0.27F); // Box 90
		gunModel[74].setRotationPoint(8.25F, -4.7F, -0.5F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.15F, -0.05F, -0.2F, -0.15F, -0.05F, -0.2F, -0.15F, -0.05F, -0.2F, -0.15F, -0.05F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F); // Box 91
		gunModel[75].setRotationPoint(16.85F, -4.3F, -0.5F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, -0.25F, -0.2F, -0.3F, -0.25F, -0.2F, -0.3F, -0.25F, -0.2F, -0.3F, -0.25F); // Box 92
		gunModel[76].setRotationPoint(16.85F, -3.7F, -0.5F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.05F, -0.2F, -0.4F, -0.05F, -0.2F, -0.4F, -0.05F, -0.2F, -0.4F, -0.05F); // Box 93
		gunModel[77].setRotationPoint(16.85F, -4.75F, -0.5F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.15F, -0.1F, -0.2F, -0.15F, -0.1F, -0.2F, -0.15F, -0.1F, -0.2F, -0.15F, -0.1F, -0.2F, -0.15F, -0.05F, -0.2F, -0.15F, -0.05F, -0.2F, -0.15F, -0.05F, -0.2F, -0.15F, -0.05F); // Box 94
		gunModel[78].setRotationPoint(17.15F, -4.25F, -0.5F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F); // Box 95
		gunModel[79].setRotationPoint(17.15F, -4.7F, -0.5F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.35F, -0.05F, -0.2F, -0.35F, -0.05F, -0.2F, -0.35F, -0.05F, -0.2F, -0.35F, -0.05F, -0.2F, -0.3F, -0.25F, -0.2F, -0.3F, -0.25F, -0.2F, -0.3F, -0.25F, -0.2F, -0.3F, -0.25F); // Box 96
		gunModel[80].setRotationPoint(17.15F, -3.75F, -0.5F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F); // Box 97
		gunModel[81].setRotationPoint(17.55F, -4.5F, -0.5F);

		gunModel[82].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.4F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.25F, -0.2F, -0.4F, -0.25F, -0.2F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F); // Box 98
		gunModel[82].setRotationPoint(17.55F, -4.85F, -0.5F);

		gunModel[83].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.2F, -0.25F, -0.3F, -0.2F, -0.25F, -0.3F, -0.2F, -0.25F, -0.3F, -0.2F, -0.25F, -0.3F, -0.2F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, -0.2F, -0.4F, -0.25F); // Box 99
		gunModel[83].setRotationPoint(18F, -4.4F, -0.5F);

		gunModel[84].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.4F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F); // Box 100
		gunModel[84].setRotationPoint(18F, -4.75F, -0.5F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,-0.1F, -0.44F, -0.28F, -0.1F, -0.44F, -0.28F, -0.1F, -0.44F, -0.28F, -0.1F, -0.44F, -0.28F, -0.1F, -0.44F, -0.28F, -0.1F, -0.44F, -0.28F, -0.1F, -0.44F, -0.28F, -0.1F, -0.44F, -0.28F); // Box 78
		gunModel[85].setRotationPoint(16.6F, -4.2F, -0.5F);

		gunModel[86].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,-0.1F, -0.42F, -0.4F, -0.1F, -0.42F, -0.4F, -0.1F, -0.42F, -0.4F, -0.1F, -0.42F, -0.4F, -0.1F, -0.44F, -0.28F, -0.1F, -0.44F, -0.28F, -0.1F, -0.44F, -0.28F, -0.1F, -0.44F, -0.28F); // Box 79
		gunModel[86].setRotationPoint(16.6F, -4.32F, -0.5F);

		gunModel[87].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,-0.1F, -0.44F, -0.28F, -0.1F, -0.44F, -0.28F, -0.1F, -0.44F, -0.28F, -0.1F, -0.44F, -0.28F, -0.1F, -0.42F, -0.4F, -0.1F, -0.42F, -0.4F, -0.1F, -0.42F, -0.4F, -0.1F, -0.42F, -0.4F); // Box 80
		gunModel[87].setRotationPoint(16.6F, -4.08F, -0.5F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F); // Box 75
		gunModel[88].setRotationPoint(25.5F, -4.4F, -0.5F);

		gunModel[89].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F); // Box 76
		gunModel[89].setRotationPoint(25.5F, -4.2F, -0.5F);

		gunModel[90].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F); // Box 77
		gunModel[90].setRotationPoint(25.5F, -4F, -0.5F);

		gunModel[91].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.2F, -0.25F, -0.1F, -0.2F, -0.25F, -0.1F, -0.2F, -0.25F, -0.1F, -0.2F, -0.25F, -0.1F, -0.2F, -0.3F, -0.25F, -0.2F, -0.3F, -0.25F, -0.2F, -0.3F, -0.25F, -0.2F, -0.3F, -0.25F); // Box 107
		gunModel[91].setRotationPoint(17.3F, -4F, -0.5F);

		gunModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.25F, -0.15F, -0.2F, -0.25F, -0.15F, -0.2F, -0.25F, -0.15F, -0.2F, -0.25F, -0.15F, -0.2F, -0.35F, -0.3F, -0.2F, -0.35F, -0.3F, -0.2F, -0.35F, -0.3F, -0.2F, -0.35F, -0.3F); // Box 108
		gunModel[92].setRotationPoint(21.5F, -4F, -0.5F);

		gunModel[93].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F); // Box 109
		gunModel[93].setRotationPoint(21.6F, -4.4F, -0.5F);

		gunModel[94].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F); // Box 110
		gunModel[94].setRotationPoint(21.6F, -4.2F, -0.5F);

		gunModel[95].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F); // Box 111
		gunModel[95].setRotationPoint(21.6F, -4F, -0.5F);

		gunModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.2F, -0.35F, -0.25F, -0.2F, -0.35F, -0.25F, -0.2F, -0.35F, -0.25F, -0.2F, -0.35F, -0.25F, -0.2F, -0.35F, -0.25F, -0.2F, -0.35F, -0.25F, -0.2F, -0.35F, -0.25F, -0.2F, -0.35F); // Box 112
		gunModel[96].setRotationPoint(24.15F, -3.95F, -0.5F);

		gunModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F); // Box 113
		gunModel[97].setRotationPoint(24.15F, -3.6F, -0.5F);

		gunModel[98].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,-0.25F, -0.45F, -0.45F, -0.25F, -0.45F, -0.45F, -0.25F, -0.45F, -0.45F, -0.25F, -0.45F, -0.45F, -0.25F, -0.45F, -0.45F, -0.25F, -0.45F, -0.45F, -0.25F, -0.45F, -0.45F, -0.25F, -0.45F, -0.45F); // Box 114
		gunModel[98].setRotationPoint(17F, -3.8F, -0.5F);

		gunModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F); // Box 115
		gunModel[99].setRotationPoint(26F, -3.8F, -0.5F);

		gunModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.2F, -0.35F, -0.3F, -0.2F, -0.35F, -0.3F, -0.2F, -0.35F, -0.3F, -0.2F, -0.35F, -0.3F, -0.2F, -0.35F, -0.3F, -0.2F, -0.35F, -0.3F, -0.2F, -0.35F, -0.3F, -0.2F, -0.35F); // Box 116
		gunModel[100].setRotationPoint(24.7F, -4.6F, -0.5F);

		gunModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F, -0.4F, -0.3F, -0.35F, -0.4F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F); // Box 54
		gunModel[101].setRotationPoint(24.7F, -5F, -0.7F);

		gunModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.4F, -0.3F, -0.35F, -0.4F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F); // Box 55
		gunModel[102].setRotationPoint(24.7F, -5F, -0.3F);

		gunModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.25F); // Box 56
		gunModel[103].setRotationPoint(24.7F, -5.2F, -0.5F);

		gunModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.35F, -0.47F, -0.35F, -0.35F, -0.47F, -0.35F, -0.35F, -0.47F, -0.35F, -0.35F, -0.47F, -0.35F, -0.35F, -0.47F, -0.35F, -0.35F, -0.47F, -0.35F, -0.35F, -0.47F, -0.35F, -0.35F, -0.47F); // Box 120
		gunModel[104].setRotationPoint(24.7F, -4.92F, -0.5F);

		gunModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 121
		gunModel[105].setRotationPoint(21.9F, -4.75F, -0.5F);

		gunModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F); // Box 107
		gunModel[106].setRotationPoint(17.1F, -4.25F, 0.25F);

		gunModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, -0.35F, -0.4F, -0.45F, -0.35F); // Box 108
		gunModel[107].setRotationPoint(17.1F, -4.7F, 0.15F);

		gunModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, -0.35F, -0.4F, -0.45F, -0.35F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F); // Box 109
		gunModel[108].setRotationPoint(17.1F, -3.8F, 0.15F);

		gunModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F); // Box 125
		gunModel[109].setRotationPoint(17.1F, -4.25F, -0.05F);

		gunModel[110].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F); // Box 61
		gunModel[110].setRotationPoint(7.9F, -4.9F, -0.5F);

		gunModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F); // Box 63
		gunModel[111].setRotationPoint(7.7F, -4.95F, -0.25F);

		gunModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F); // Box 64
		gunModel[112].setRotationPoint(7.7F, -4.95F, -0.75F);

		gunModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.5F, -0.2F); // Box 65
		gunModel[113].setRotationPoint(7.5F, -4.94F, -0.5F);

		gunModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.4F, -0.5F, -0.45F, -0.4F, -0.5F, -0.45F, -0.35F, -0.4F, -0.45F, -0.35F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.5F, -0.45F, -0.35F, -0.4F, -0.45F, -0.35F); // Box 66
		gunModel[114].setRotationPoint(7.5F, -5.09F, -0.7F);

		gunModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.35F, -0.5F, -0.45F, -0.35F, -0.5F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.35F, -0.5F, -0.45F, -0.35F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F); // Box 67
		gunModel[115].setRotationPoint(7.5F, -5.09F, -0.3F);

		gunModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.35F, -0.4F, -0.25F, -0.35F, -0.4F, -0.25F, -0.35F, -0.4F, -0.25F, -0.35F, -0.4F, -0.25F); // Box 132
		gunModel[116].setRotationPoint(9.15F, -5F, -0.5F);

		gunModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.4F, -0.25F, -0.35F, -0.4F, -0.25F, -0.35F, -0.4F, -0.25F, -0.35F, -0.4F, -0.25F, -0.35F, -0.4F, -0.25F, -0.35F, -0.4F, -0.25F, -0.35F, -0.4F, -0.25F, -0.35F, -0.4F, -0.25F); // Box 133
		gunModel[117].setRotationPoint(9.15F, -4.8F, -0.5F);

		gunModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.5F, -0.25F, -0.4F, -0.5F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F); // Box 37
		gunModel[118].setRotationPoint(0.7F, -2.4F, -0.5F);

		gunModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.7F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.7F, -0.3F, -0.4F); // Box 38
		gunModel[119].setRotationPoint(0.6F, -1.95F, -0.5F);

		gunModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.45F, -0.25F, -0.3F, -0.35F, -0.15F, -0.3F, -0.5F, -0.15F, -0.3F, -0.5F, -0.15F, -0.3F, -0.35F, -0.15F, -0.3F); // Box 141
		gunModel[120].setRotationPoint(0F, -2.4F, -0.5F);

		gunModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.7F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.7F, -0.3F, -0.3F); // Box 142
		gunModel[121].setRotationPoint(-0.0999999999999999F, -1.85F, -0.5F);

		gunModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.5F, -0.15F, -0.3F, -0.35F, -0.15F, -0.3F, -0.35F, -0.15F, -0.3F, -0.5F, -0.15F, -0.3F); // Box 143
		gunModel[122].setRotationPoint(1.45F, -2.5F, -0.5F);

		gunModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.7F, -0.3F, -0.3F, -0.7F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 144
		gunModel[123].setRotationPoint(1.55F, -1.95F, -0.5F);

		gunModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.3F, -0.2F, -0.6F, -0.3F, -0.2F, -0.6F, -0.3F, -0.2F, -0.5F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.4F, -0.3F); // Box 146
		gunModel[124].setRotationPoint(0.4F, -1.75F, -0.5F);

		gunModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.6F, -0.3F, -0.15F, -0.5F, -0.3F, -0.15F, -0.5F, -0.3F, -0.2F, -0.6F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 147
		gunModel[125].setRotationPoint(1F, -1.75F, -0.5F);
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 134
		ammoModel[1] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 135
		ammoModel[2] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 136
		ammoModel[3] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 138

		ammoModel[0].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.2F, 0F, -0.15F, 0.2F, 0F, -0.15F, 0.2F, 0F, -0.15F, 0.2F, 0F, -0.15F, 0.2F, 0.2F, -0.15F, 0.2F, 0F, -0.15F, 0.2F, 0F, -0.15F, 0.2F, 0.2F, -0.15F); // Box 134
		ammoModel[0].setRotationPoint(4.4F, -2.9F, -0.5F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.2F, -0.2F, -0.15F, 0.2F, 0F, -0.15F, 0.2F, 0F, -0.15F, 0.2F, -0.2F, -0.15F, 0.15F, 0F, -0.1F, 0.25F, -0.2F, -0.15F, 0.25F, -0.2F, -0.15F, 0.15F, 0F, -0.1F); // Box 135
		ammoModel[1].setRotationPoint(4.4F, -1.9F, -0.5F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.2F, -0.2F, -0.1F, 0.2F, 0F, -0.15F, 0.2F, 0F, -0.15F, 0.2F, -0.2F, -0.1F, 0.1F, 0.1F, -0.1F, 0.3F, -0.25F, -0.15F, 0.3F, -0.25F, -0.15F, 0.1F, 0.1F, -0.1F); // Box 136
		ammoModel[2].setRotationPoint(4.45F, -1.1F, -0.5F);

		ammoModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0.05F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0.05F, -0.25F); // Box 138
		ammoModel[3].setRotationPoint(3.2F, -3F, -0.5F);
	}

	private void initslideModel_1()
	{
		slideModel[0] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 82
		slideModel[1] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 83
		slideModel[2] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 84
		slideModel[3] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 85
		slideModel[4] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 86
		slideModel[5] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 88
		slideModel[6] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 89

		slideModel[0].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.4F, -0.3F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, -0.1F, 0.4F, -0.3F, -0.1F, 0.4F, -0.3F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, -0.1F, 0.4F, -0.3F, -0.1F); // Box 82
		slideModel[0].setRotationPoint(3.9F, -4.1F, -0.5F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.4F, -0.4F, -0.35F, 0.2F, -0.4F, -0.35F, 0.2F, -0.4F, -0.35F, 0.4F, -0.4F, -0.35F, 0.4F, -0.4F, -0.1F, 0.2F, -0.4F, -0.1F, 0.2F, -0.4F, -0.1F, 0.4F, -0.4F, -0.1F); // Box 83
		slideModel[1].setRotationPoint(3.9F, -4.4F, -0.5F);

		slideModel[2].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.4F, -0.4F, -0.35F, 0.2F, -0.4F, -0.35F, 0.2F, -0.4F, -0.35F, 0.4F, -0.4F, -0.35F, 0.4F, -0.4F, -0.35F, 0.2F, -0.4F, -0.35F, 0.2F, -0.4F, -0.35F, 0.4F, -0.4F, -0.35F); // Box 84
		slideModel[2].setRotationPoint(3.9F, -4.57F, -0.5F);

		slideModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.4F, -0.45F, -0.4F, 0.2F, -0.45F, -0.4F, 0.2F, -0.45F, -0.4F, 0.4F, -0.45F, -0.4F, 0.4F, -0.45F, -0.35F, 0.2F, -0.45F, -0.35F, 0.2F, -0.45F, -0.35F, 0.4F, -0.45F, -0.35F); // Box 85
		slideModel[3].setRotationPoint(3.9F, -4.72F, -0.5F);

		slideModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.4F, -0.05F, -0.35F, -0.4F, -0.05F, -0.25F, -0.4F, -0.05F, -0.3F, -0.4F, -0.05F, -0.35F, -0.4F, -0.05F, -0.35F, -0.4F, -0.05F, -0.25F, -0.4F, -0.05F, -0.3F, -0.4F, -0.05F); // Box 86
		slideModel[4].setRotationPoint(6.35F, -4.25F, -1.05F);

		slideModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F); // Box 88
		slideModel[5].setRotationPoint(6.35F, -4.25F, -1.8F);

		slideModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F); // Box 89
		slideModel[6].setRotationPoint(6.35F, -4.25F, -1.6F);
	}
}