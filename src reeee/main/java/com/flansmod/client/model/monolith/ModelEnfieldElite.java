//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: -
// Last changed on: -

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelEnfieldElite extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelEnfieldElite() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[115];
		ammoModel = new ModelRendererTurbo[76];
		pumpModel = new ModelRendererTurbo[7];

		initgunModel_1();
		initammoModel_1();
		initpumpModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 0
		gunModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 1
		gunModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 2
		gunModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 3
		gunModel[5] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 6
		gunModel[7] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 7
		gunModel[8] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 8
		gunModel[9] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 9
		gunModel[10] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 10
		gunModel[11] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 11
		gunModel[12] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 12
		gunModel[13] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 13
		gunModel[14] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 14
		gunModel[15] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 15
		gunModel[16] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 16
		gunModel[17] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 17
		gunModel[18] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 19
		gunModel[19] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 20
		gunModel[20] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 21
		gunModel[21] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 22
		gunModel[22] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 23
		gunModel[23] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 24
		gunModel[24] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 25
		gunModel[25] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 26
		gunModel[26] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 27
		gunModel[27] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 28
		gunModel[28] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 29
		gunModel[29] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 30
		gunModel[30] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 47
		gunModel[31] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 48
		gunModel[32] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 49
		gunModel[33] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 50
		gunModel[34] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 51
		gunModel[35] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 52
		gunModel[36] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 53
		gunModel[37] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 54
		gunModel[38] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 55
		gunModel[39] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 56
		gunModel[40] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 57
		gunModel[41] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 58
		gunModel[42] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 59
		gunModel[43] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 60
		gunModel[44] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 61
		gunModel[45] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 63
		gunModel[46] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 64
		gunModel[47] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 65
		gunModel[48] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 66
		gunModel[49] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 67
		gunModel[50] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 69
		gunModel[51] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 70
		gunModel[52] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 71
		gunModel[53] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 72
		gunModel[54] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 73
		gunModel[55] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 75
		gunModel[56] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 76
		gunModel[57] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 78
		gunModel[58] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 79
		gunModel[59] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 80
		gunModel[60] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 81
		gunModel[61] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 82
		gunModel[62] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 83
		gunModel[63] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 84
		gunModel[64] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 85
		gunModel[65] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 86
		gunModel[66] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 87
		gunModel[67] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 88
		gunModel[68] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 89
		gunModel[69] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 90
		gunModel[70] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 91
		gunModel[71] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 92
		gunModel[72] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 93
		gunModel[73] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 94
		gunModel[74] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 95
		gunModel[75] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 96
		gunModel[76] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 97
		gunModel[77] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 98
		gunModel[78] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 99
		gunModel[79] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 100
		gunModel[80] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 101
		gunModel[81] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 102
		gunModel[82] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 103
		gunModel[83] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 104
		gunModel[84] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 105
		gunModel[85] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 106
		gunModel[86] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 107
		gunModel[87] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 108
		gunModel[88] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 109
		gunModel[89] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 110
		gunModel[90] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 111
		gunModel[91] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 112
		gunModel[92] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 113
		gunModel[93] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 114
		gunModel[94] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 115
		gunModel[95] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 116
		gunModel[96] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 119
		gunModel[97] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 124
		gunModel[98] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 125
		gunModel[99] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 127
		gunModel[100] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 128
		gunModel[101] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 129
		gunModel[102] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 130
		gunModel[103] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 131
		gunModel[104] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 132
		gunModel[105] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 133
		gunModel[106] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 134
		gunModel[107] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 135
		gunModel[108] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 136
		gunModel[109] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 137
		gunModel[110] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 138
		gunModel[111] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 139
		gunModel[112] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 231
		gunModel[113] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 233
		gunModel[114] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 234

		gunModel[0].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, 0.8F, 0.1F, 0F, 0.2F, -0.15F, 0F, 0.2F, -0.15F, 0F, 0.8F, 0.1F); // Box 0
		gunModel[0].setRotationPoint(10.4F, -2.25F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F); // Box 0
		gunModel[1].setRotationPoint(9.4F, -2.25F, -0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.8F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0.8F, -0.5F, 0.1F, 0.8F, -0.1F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0.8F, -0.1F, 0.1F); // Box 1
		gunModel[2].setRotationPoint(8.4F, -2.25F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.4F, 0.1F); // Box 2
		gunModel[3].setRotationPoint(6.6F, -1.9F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,1.1F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 1.1F, -0.2F, 0.1F, 0.7F, -0.1F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0.7F, -0.1F, 0.1F); // Box 3
		gunModel[4].setRotationPoint(5.6F, -2.1F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.1F, -0.15F, 0F, -0.1F, -0.15F, 0F, -0.1F, -0.15F, 0F, -0.1F, -0.15F); // Box 5
		gunModel[5].setRotationPoint(32.8F, -2.25F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 6
		gunModel[6].setRotationPoint(22.8F, -3.25F, -0.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.1F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F, 0.1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 7
		gunModel[7].setRotationPoint(18.4F, -3.25F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.45F, -0.1F, 0F, -0.45F, -0.1F, 0F, -0.45F, -0.1F, 0F, -0.45F, -0.1F); // Box 8
		gunModel[8].setRotationPoint(22.8F, -3.3F, -0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.2F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, 0.1F, -0.45F, -0.1F, 0F, -0.45F, -0.1F, 0F, -0.45F, -0.1F, 0.1F, -0.45F, -0.1F); // Box 9
		gunModel[9].setRotationPoint(18.4F, -3.3F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.2F, -0.5F, -0.1F, 0.7F, -0.5F, -0.1F, 0.7F, -0.5F, -0.1F, -0.2F, -0.5F, -0.1F, -0.2F, 0F, 0.1F, 0.7F, 0F, 0.1F, 0.7F, 0F, 0.1F, -0.2F, 0F, 0.1F); // Box 10
		gunModel[10].setRotationPoint(10.45F, -3.25F, -0.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.2F, -0.4F, -0.3F, 0.7F, -0.4F, -0.3F, 0.7F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.45F, -0.1F, 0.7F, -0.45F, -0.1F, 0.7F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F); // Box 11
		gunModel[11].setRotationPoint(10.45F, -3.3F, -0.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,1F, -0.5F, 0.05F, -1.1F, -0.2F, 0.05F, -1.1F, -0.2F, 0.05F, 1F, -0.5F, 0.05F, 0.6F, -0.05F, 0.05F, -0.7F, -0.1F, 0.05F, -0.7F, -0.1F, 0.05F, 0.6F, -0.05F, 0.05F); // Box 12
		gunModel[12].setRotationPoint(4.6F, -2.1F, -0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,1F, -1.3F, 0.1F, -1.1F, -0.4F, 0.1F, -1.1F, -0.4F, 0.1F, 1F, -1.3F, 0.1F, 0.6F, 0.93F, 0.1F, -0.7F, -0.1F, 0.1F, -0.7F, -0.1F, 0.1F, 0.6F, 0.93F, 0.1F); // Box 13
		gunModel[13].setRotationPoint(1.7F, -2.03F, -0.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,1F, -1.35F, 0.1F, -1.1F, -1.25F, 0.1F, -1.1F, -1.25F, 0.1F, 1F, -1.35F, 0.1F, 1F, 0.95F, 0.1F, -0.7F, 0.9F, 0.1F, -0.7F, 0.9F, 0.1F, 1F, 0.9F, 0.1F); // Box 14
		gunModel[14].setRotationPoint(-1.2F, -2F, -0.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1.25F, -1.8F, 0.1F, -1.4F, -1.35F, 0.1F, -1.4F, -1.35F, 0.1F, 1.25F, -1.8F, 0.1F, 1F, 0.95F, 0.1F, -1.4F, 0.9F, 0.1F, -1.4F, 0.9F, 0.1F, 1F, 0.9F, 0.1F); // Box 15
		gunModel[15].setRotationPoint(-6.8F, -2F, -0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, -1.7F, 0.1F, -1.4F, -1.7F, 0.1F, -1.4F, -1.7F, 0.1F, 1F, -1.7F, 0.1F, 0.7F, 3F, 0.1F, -1.4F, 0.9F, 0.1F, -1.4F, 0.9F, 0.1F, 0.7F, 3F, 0.1F); // Box 16
		gunModel[16].setRotationPoint(-6.8F, -0.8F, -0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0.4F, -1.7F, 0.1F, -1.1F, -1.7F, 0.1F, -1.1F, -1.7F, 0.1F, 0.4F, -1.7F, 0.1F, 0.4F, 0.9F, 0.1F, -1.4F, 0.3F, 0.1F, -1.4F, 0.3F, 0.1F, 0.4F, 0.9F, 0.1F); // Box 17
		gunModel[17].setRotationPoint(-1.8F, -0.8F, -0.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F); // Box 19
		gunModel[18].setRotationPoint(22.1F, -3.3F, -0.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F); // Box 20
		gunModel[19].setRotationPoint(22.1F, -3.25F, -0.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.5F, 0.1F, -0.3F, -0.5F, 0.1F, -0.3F, -0.5F, 0.1F, -0.3F, -0.5F, 0.1F, -0.3F, 0.2F, -0.15F, -0.3F, 0.2F, -0.15F, -0.3F, 0.2F, -0.15F, -0.3F, 0.2F, -0.15F); // Box 21
		gunModel[20].setRotationPoint(22.1F, -2.25F, -0.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 22
		gunModel[21].setRotationPoint(22.8F, -2.75F, -0.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.5F, 0.1F, -0.3F, -0.5F, 0.1F, -0.3F, -0.5F, 0.1F, -0.3F, -0.5F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F); // Box 23
		gunModel[22].setRotationPoint(22.1F, -2.75F, -0.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 24
		gunModel[23].setRotationPoint(10.4F, -2.75F, -0.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1.1F, -0.9F, -0.15F, -0.1F, -0.5F, -0.15F, -0.1F, -0.5F, -0.15F, -1.1F, -0.9F, -0.15F, -1.1F, 0F, -0.15F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.15F, -1.1F, 0F, -0.15F); // Box 25
		gunModel[24].setRotationPoint(14.4F, -3.5F, -0.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.1F, -0.7F, -0.03F, -0.05F, -0.7F, -0.03F, -0.05F, -0.7F, -0.03F, -0.1F, -0.7F, -0.03F, -0.1F, 0F, 0.1F, -0.05F, 0F, 0.1F, -0.05F, 0F, 0.1F, -0.1F, 0F, 0.1F); // Box 26
		gunModel[25].setRotationPoint(14.35F, -3.25F, -0.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F); // Box 27
		gunModel[26].setRotationPoint(31.5F, -3.25F, -0.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F); // Box 28
		gunModel[27].setRotationPoint(31.5F, -3.3F, -0.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,1.1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1.1F, -0.5F, 0F, 1.1F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 1.1F, -0.1F, 0F); // Box 29
		gunModel[28].setRotationPoint(7.45F, -1.7F, -0.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,1.1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1.1F, -0.4F, 0F, 1.1F, 0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, 1.1F, 0.45F, 0F); // Box 30
		gunModel[29].setRotationPoint(7.45F, -0.2F, -0.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, -0.5F, -0.45F, -0.2F, -0.5F, -0.45F, -0.2F, -0.5F, -0.45F, -0.2F, -0.5F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F); // Box 47
		gunModel[30].setRotationPoint(14.3F, -3.7F, -1.1F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, -0.5F, -0.45F, -0.2F, -0.5F, -0.45F, -0.2F, -0.5F, -0.45F, -0.2F, -0.5F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F); // Box 48
		gunModel[31].setRotationPoint(17.5F, -3.5F, -0.2F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -1.1F, -0.4F, -0.2F, -1.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -1.1F, -0.4F, -0.2F); // Box 49
		gunModel[32].setRotationPoint(13.4F, -3.45F, -0.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F); // Box 50
		gunModel[33].setRotationPoint(14.3F, -3.8F, -1.1F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F); // Box 51
		gunModel[34].setRotationPoint(14.3F, -3.8F, 0.1F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F); // Box 52
		gunModel[35].setRotationPoint(17.5F, -3.6F, -0.8F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F); // Box 53
		gunModel[36].setRotationPoint(17.5F, -3.6F, -0.2F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, -0.5F, -0.45F, -0.2F, -0.5F, -0.45F, -0.2F, -0.5F, -0.45F, -0.2F, -0.5F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F); // Box 54
		gunModel[37].setRotationPoint(14.3F, -3.7F, 0.1F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, -0.5F, -0.45F, -0.2F, -0.5F, -0.45F, -0.2F, -0.5F, -0.45F, -0.2F, -0.5F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F); // Box 55
		gunModel[38].setRotationPoint(17.5F, -3.5F, -0.8F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1.15F, -0.35F, -0.35F, -0.15F, -0.35F, -0.35F, -0.15F, -0.35F, -0.35F, -1.15F, -0.35F, -0.35F, -1.15F, -0.35F, -0.35F, -0.15F, -0.35F, -0.35F, -0.15F, -0.35F, -0.35F, -1.15F, -0.35F, -0.35F); // Box 56
		gunModel[39].setRotationPoint(14.4F, -3.45F, -0.2F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1.15F, -0.35F, -0.35F, -0.15F, -0.35F, -0.35F, -0.15F, -0.35F, -0.35F, -1.15F, -0.35F, -0.35F, -1.15F, -0.35F, -0.35F, -0.15F, -0.35F, -0.35F, -0.15F, -0.35F, -0.35F, -1.15F, -0.35F, -0.35F); // Box 57
		gunModel[40].setRotationPoint(14.4F, -3.45F, -0.8F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1.3F, -0.38F, -0.33F, -0.3F, -0.38F, -0.33F, -0.3F, -0.38F, -0.33F, -1.3F, -0.38F, -0.33F, -1.3F, -0.38F, -0.33F, -0.3F, -0.38F, -0.33F, -0.3F, -0.38F, -0.33F, -1.3F, -0.38F, -0.33F); // Box 58
		gunModel[41].setRotationPoint(14.4F, -3.45F, -0.47F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.4F, -0.38F, -0.45F, -0.4F, -0.38F, -0.45F, -0.4F, -0.38F, -0.45F, -0.4F, -0.38F, -0.45F, -0.4F, -0.38F, -0.45F, -0.4F, -0.38F, -0.45F, -0.4F, -0.38F, -0.45F, -0.4F, -0.38F); // Box 59
		gunModel[42].setRotationPoint(14.05F, -3.65F, -0.7F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.4F, -0.38F, -0.45F, -0.4F, -0.38F, -0.45F, -0.4F, -0.38F, -0.45F, -0.4F, -0.38F, -0.45F, -0.4F, -0.38F, -0.45F, -0.4F, -0.38F, -0.45F, -0.4F, -0.38F, -0.45F, -0.4F, -0.38F); // Box 60
		gunModel[43].setRotationPoint(14.05F, -3.65F, -0.3F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.1F, -0.2F, -0.5F, -0.1F, -0.2F, -0.5F, -0.1F, -0.2F, -0.5F, -0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F); // Box 61
		gunModel[44].setRotationPoint(32F, -3.25F, -0.5F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F); // Box 63
		gunModel[45].setRotationPoint(32.5F, -3.25F, -0.5F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.5F, 0.2F, -0.3F, -0.5F, 0.2F, -0.3F, -0.5F, 0.2F, -0.3F, -0.5F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F); // Box 64
		gunModel[46].setRotationPoint(32.5F, -2.75F, -0.5F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.5F, 0.2F, -0.3F, -0.5F, 0.2F, -0.3F, -0.5F, 0.2F, -0.3F, -0.5F, 0.2F, -0.3F, -0.05F, -0.05F, -0.3F, -0.05F, -0.05F, -0.3F, -0.05F, -0.05F, -0.3F, -0.05F, -0.05F); // Box 65
		gunModel[47].setRotationPoint(32.5F, -2.25F, -0.5F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.5F, 0.15F, -0.4F, -0.5F, 0.15F, -0.4F, -0.5F, 0.15F, -0.4F, -0.5F, 0.15F, -0.4F, -0.05F, -0.05F, -0.4F, -0.05F, -0.05F, -0.4F, -0.05F, -0.05F, -0.4F, -0.05F, -0.05F); // Box 66
		gunModel[48].setRotationPoint(33.2F, -2.25F, -0.5F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.5F, 0.15F, -0.4F, -0.5F, 0.15F, -0.4F, -0.5F, 0.15F, -0.4F, -0.5F, 0.15F, -0.4F, 0F, 0.15F, -0.4F, 0F, 0.15F, -0.4F, 0F, 0.15F, -0.4F, 0F, 0.15F); // Box 67
		gunModel[49].setRotationPoint(33.2F, -2.75F, -0.5F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.5F, 0F, -0.4F, -0.5F, -0.1F, -0.4F, -0.5F, -0.1F, -0.4F, -0.5F, -0.05F, -0.4F, 0F, 0.15F, -0.4F, 0F, 0.15F, -0.4F, 0F, 0.15F, -0.4F, 0F, 0.15F); // Box 69
		gunModel[50].setRotationPoint(33.2F, -3.25F, -0.5F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.65F, 0.1F, -0.3F, -0.65F, 0.1F, -0.3F, -0.65F, 0.1F, -0.3F, -0.65F, 0.1F, -0.3F, -0.05F, -0.05F, -0.3F, -0.05F, -0.05F, -0.3F, -0.05F, -0.05F, -0.3F, -0.05F, -0.05F); // Box 70
		gunModel[51].setRotationPoint(32.9F, -2.25F, -0.5F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.5F, 0.1F, -0.35F, -0.5F, 0.1F, -0.35F, -0.5F, 0.1F, -0.35F, -0.5F, 0.1F, -0.35F, 0F, 0.1F, -0.35F, 0F, 0.1F, -0.35F, 0F, 0.1F, -0.35F, 0F, 0.1F); // Box 71
		gunModel[52].setRotationPoint(33.45F, -2.75F, -0.5F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.5F, 0.1F, -0.35F, -0.5F, 0.1F, -0.35F, -0.5F, 0.1F, -0.35F, -0.5F, 0.1F, -0.35F, -0.05F, -0.15F, -0.35F, -0.05F, -0.15F, -0.35F, -0.05F, -0.15F, -0.35F, -0.05F, -0.15F); // Box 72
		gunModel[53].setRotationPoint(33.45F, -2.25F, -0.5F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.05F, -0.15F, -0.35F, -0.05F, -0.15F, -0.35F, -0.05F, -0.15F, -0.35F, -0.05F, -0.15F, -0.35F, -0.5F, 0.1F, -0.35F, -0.5F, 0.1F, -0.35F, -0.5F, 0.1F, -0.35F, -0.5F, 0.1F); // Box 73
		gunModel[54].setRotationPoint(33.45F, -2.75F, -0.5F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, 0.2F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0.2F, -0.15F); // Box 75
		gunModel[55].setRotationPoint(22.8F, -2.25F, -0.5F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, 0F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, 0F, -0.2F); // Box 76
		gunModel[56].setRotationPoint(29.8F, -2.25F, -0.5F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.1F, -0.15F, 0F, -0.1F, -0.15F, 0F, -0.1F, -0.15F, 0F, -0.1F, -0.15F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F); // Box 78
		gunModel[57].setRotationPoint(32.8F, -2.75F, -0.5F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F); // Box 79
		gunModel[58].setRotationPoint(32.9F, -3.2F, -0.5F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F); // Box 80
		gunModel[59].setRotationPoint(33.8F, -1.95F, -0.5F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F); // Box 81
		gunModel[60].setRotationPoint(33.8F, -2.15F, -0.5F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F); // Box 82
		gunModel[61].setRotationPoint(33.8F, -2.05F, -0.5F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.35F, -0.5F, -0.1F, -0.35F, -0.5F, -0.1F, -0.35F, -0.4F, -0.1F, -0.35F, -0.4F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F); // Box 83
		gunModel[62].setRotationPoint(32.9F, -3.35F, -0.2F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.35F, -0.4F, -0.1F, -0.35F, -0.4F, -0.1F, -0.35F, -0.5F, -0.1F, -0.35F, -0.5F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F); // Box 84
		gunModel[63].setRotationPoint(32.9F, -3.35F, -0.8F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.35F, -0.45F, -0.1F, -0.35F, -0.45F, -0.1F, -0.35F, -0.45F, -0.1F, -0.35F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F); // Box 85
		gunModel[64].setRotationPoint(32.9F, -3.6F, -0.85F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.35F, -0.45F, -0.1F, -0.35F, -0.45F, -0.1F, -0.35F, -0.45F, -0.1F, -0.35F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F); // Box 86
		gunModel[65].setRotationPoint(32.9F, -3.6F, -0.15F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.4F, -0.3F, -0.35F, -0.4F, -0.3F, -0.35F, -0.5F, -0.3F, -0.35F, -0.5F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F); // Box 87
		gunModel[66].setRotationPoint(32.9F, -3.85F, -0.15F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.5F, -0.3F, -0.35F, -0.5F, -0.3F, -0.35F, -0.4F, -0.3F, -0.35F, -0.4F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F); // Box 88
		gunModel[67].setRotationPoint(32.9F, -3.85F, -0.85F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 89
		gunModel[68].setRotationPoint(33F, -3.55F, -0.5F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.5F, -0.42F, -0.4F, -0.5F, -0.42F, -0.4F, -0.5F, -0.42F, -0.4F, -0.5F, -0.42F, -0.4F, 0F, -0.42F, -0.4F, 0F, -0.42F, -0.4F, 0F, -0.42F, -0.4F, 0F, -0.42F); // Box 90
		gunModel[69].setRotationPoint(33F, -3.8F, -0.5F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,2.7F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.5F, -0.2F, -0.3F, -0.5F, -0.2F, -0.3F, -0.5F, -0.2F, -0.3F, -0.5F, -0.2F); // Box 91
		gunModel[70].setRotationPoint(33.45F, -2.9F, -0.5F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F); // Box 92
		gunModel[71].setRotationPoint(33.45F, -2.8F, -0.5F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.5F, -0.2F, -0.3F, -0.5F, -0.2F, -0.3F, -0.5F, -0.2F, -0.3F, -0.5F, -0.2F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F); // Box 93
		gunModel[72].setRotationPoint(33.45F, -2.7F, -0.5F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F); // Box 94
		gunModel[73].setRotationPoint(30.15F, -1.85F, -0.5F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.4F, -0.2F, -0.5F, -0.4F, -0.2F, -0.5F, -0.4F, -0.2F, -0.5F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F); // Box 95
		gunModel[74].setRotationPoint(30.15F, -1.65F, -0.5F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.45F, -0.28F, -0.2F, -0.45F, -0.28F, -0.2F, -0.45F, -0.28F, -0.2F, -0.45F, -0.28F, -0.2F, -0.45F, -0.28F, -0.2F, -0.45F, -0.28F, -0.2F, -0.45F, -0.28F, -0.2F, -0.45F, -0.28F); // Box 96
		gunModel[75].setRotationPoint(30.15F, -1.35F, -0.5F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 97
		gunModel[76].setRotationPoint(29.15F, -1.65F, -0.5F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.5F, -0.2F, -0.1F, -0.5F, -0.2F, -0.1F, -0.5F, -0.2F, -0.1F, -0.5F, -0.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 98
		gunModel[77].setRotationPoint(9.8F, -3.25F, -0.5F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 99
		gunModel[78].setRotationPoint(9.8F, -2.75F, -0.5F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.2F, -0.1F, -0.45F, -0.2F, -0.1F, -0.45F, -0.2F, -0.1F, -0.45F, -0.2F); // Box 100
		gunModel[79].setRotationPoint(9.8F, -3.3F, -0.5F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.4F, -0.5F, -0.4F, 0.6F, -0.5F, -0.4F, 0.6F, -0.5F, -0.2F, 0.4F, -0.5F, -0.2F, 0.4F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.2F, 0.4F, -0.2F, -0.2F); // Box 101
		gunModel[80].setRotationPoint(6.4F, -2.55F, -0.2F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 102
		gunModel[81].setRotationPoint(6.6F, -2.1F, -0.1F);

		gunModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, -0.45F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.25F, 0.5F, -0.45F, -0.25F, 0.5F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.25F, 0.5F, -0.35F, -0.25F); // Box 103
		gunModel[82].setRotationPoint(5F, -2.55F, -0.2F);

		gunModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.15F, -0.3F, -0.4F, -0.15F, -0.3F, -0.25F, -0.4F, -0.3F, -0.35F, -0.4F, -0.3F, -0.35F, -0.15F, -0.3F, -0.25F, -0.15F); // Box 104
		gunModel[83].setRotationPoint(3.8F, -2.55F, -0.2F);

		gunModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.55F, -0.2F, -0.4F, -0.25F, -0.2F, -0.4F, -0.25F, -0.2F, -0.2F, -0.55F, -0.2F, -0.2F); // Box 105
		gunModel[84].setRotationPoint(3.8F, -2.1F, -0.18F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.35F, -0.1F, -0.5F, -0.35F, 0.3F, 0.2F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.35F, 0.3F, 0.2F, -0.35F); // Box 106
		gunModel[85].setRotationPoint(4.05F, -2.75F, -0.2F);

		gunModel[86].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.2F, -0.6F, -0.7F, -0.1F, -0.6F, -0.7F, -0.1F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.1F, 0F, -0.85F, -0.1F, 0F, -0.85F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 107
		gunModel[86].setRotationPoint(4.05F, -3.25F, -0.55F);

		gunModel[87].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.3F, -0.6F, -0.7F, -0.1F, -0.6F, -0.7F, -0.1F, -0.6F, -0.15F, -0.3F, -0.6F, -0.15F, 0F, 0F, -0.85F, -0.1F, 0F, -0.85F, -0.1F, 0F, 0F, 0F, 0F, 0F); // Box 108
		gunModel[87].setRotationPoint(8.05F, -3.25F, -0.55F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.6F, -0.7F, -0.3F, -0.6F, -0.7F, -0.3F, -0.6F, -0.15F, -0.1F, -0.6F, -0.15F, -0.1F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, 0F, -0.1F, 0F, 0F); // Box 109
		gunModel[88].setRotationPoint(6.6F, -3.25F, -0.55F);

		gunModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.8F, -0.8F, -0.1F, -0.8F, -0.8F, -0.1F, -0.8F, -0.08F, -0.1F, -0.8F, -0.08F, 0F, 0F, -0.85F, -0.1F, 0F, -0.85F, -0.1F, 0F, 0F, 0F, 0F, 0F); // Box 110
		gunModel[89].setRotationPoint(7.3F, -3.25F, -0.55F);

		gunModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.15F, -0.65F, -0.7F, -0.3F, -0.65F, -0.7F, -0.3F, -0.65F, -0.15F, -0.15F, -0.65F, -0.15F, 0.1F, -0.05F, -0.85F, -0.15F, -0.05F, -0.85F, -0.15F, -0.05F, 0F, 0.1F, -0.05F, 0F); // Box 111
		gunModel[90].setRotationPoint(6.45F, -3.6F, -0.7F);

		gunModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F); // Box 112
		gunModel[91].setRotationPoint(3.95F, -1.65F, -0.05F);

		gunModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, -0.5F, 0.2F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.35F, -0.5F, 0.2F, -0.35F); // Box 113
		gunModel[92].setRotationPoint(4F, -2.75F, -1F);

		gunModel[93].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, -0.6F, -0.15F, -0.1F, -0.6F, -0.15F, -0.1F, -0.6F, -0.7F, -0.5F, -0.6F, -0.7F, -0.5F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.85F, -0.5F, 0F, -0.85F); // Box 114
		gunModel[93].setRotationPoint(4F, -3.25F, -0.5F);

		gunModel[94].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.4F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.35F, -0.4F, -0.5F, -0.35F, -0.4F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.35F, -0.4F, -0.1F, -0.35F); // Box 115
		gunModel[94].setRotationPoint(9F, -2.85F, -1.05F);

		gunModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, -0.85F, -0.3F, -0.8F, -0.85F, -0.3F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, -0.95F, -0.3F, 0F, -0.95F); // Box 116
		gunModel[95].setRotationPoint(9F, -3.35F, -0.45F);

		gunModel[96].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 119
		gunModel[96].setRotationPoint(5.1F, -2.4F, -0.6F);

		gunModel[97].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.7F, -0.4F, -0.25F, -0.7F, -0.4F, -0.25F, -0.53F, -0.4F, -0.25F, -0.53F, -0.4F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.6F, -0.25F, -0.5F, -0.6F); // Box 124
		gunModel[97].setRotationPoint(6.4F, -3.48F, -0.8F);

		gunModel[98].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.7F, -0.2F, -0.25F, -0.7F, -0.2F, -0.25F, -0.7F, -0.5F, -0.25F, -0.7F, -0.5F, -0.25F, -0.5F, -0.2F, -0.25F, -0.5F, -0.2F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F); // Box 125
		gunModel[98].setRotationPoint(6.4F, -2.7F, -0.75F);

		gunModel[99].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.4F, -0.7F, -0.2F, -0.25F, -0.7F, -0.2F, -0.25F, -0.7F, -0.5F, -0.4F, -0.7F, -0.5F, -0.4F, -0.5F, -0.2F, -0.25F, -0.5F, -0.2F, -0.25F, -0.5F, -0.5F, -0.4F, -0.5F, -0.5F); // Box 127
		gunModel[99].setRotationPoint(6.75F, -2.5F, -0.75F);

		gunModel[100].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.4F, -0.5F, -0.15F, -0.4F, -0.5F, -0.15F, -0.4F, -0.5F, -0.15F, -0.4F, -0.5F, -0.15F, -0.4F, -0.1F, -0.15F, -0.4F, -0.1F, -0.15F, -0.4F, -0.1F, -0.15F, -0.4F, -0.1F, -0.15F); // Box 128
		gunModel[100].setRotationPoint(5.7F, -1.3F, -0.5F);

		gunModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.5F, -0.15F, -0.4F, -0.5F, -0.15F, -0.4F, -0.5F, -0.15F, -0.4F, -0.5F, -0.15F, -0.4F, -0.1F, -0.15F, -0.4F, -0.1F, -0.15F, -0.4F, -0.1F, -0.15F, -0.4F, -0.1F, -0.15F); // Box 129
		gunModel[101].setRotationPoint(3.65F, -0.3F, -0.5F);

		gunModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, -0.5F, -0.5F, -0.15F, -0.4F, -0.1F, -0.15F, -0.4F, -0.1F, -0.15F, -0.4F, -0.1F, -0.15F, -0.4F, -0.1F, -0.15F); // Box 130
		gunModel[102].setRotationPoint(3.65F, -0.7F, -0.5F);

		gunModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.5F, -0.15F, -0.4F, -0.5F, -0.15F, -0.4F, -0.5F, -0.15F, -0.4F, -0.5F, -0.15F, -0.6F, -0.1F, -0.15F, -0.2F, -0.1F, -0.15F, -0.2F, -0.1F, -0.15F, -0.6F, -0.1F, -0.15F); // Box 131
		gunModel[103].setRotationPoint(3.65F, 0.1F, -0.5F);

		gunModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.5F, -0.15F, -0.4F, -0.5F, -0.15F, -0.4F, -0.5F, -0.15F, -0.4F, -0.5F, -0.15F, -0.9F, -0.2F, -0.15F, 0.4F, -0.2F, -0.15F, 0.4F, -0.2F, -0.15F, -0.9F, -0.2F, -0.15F); // Box 132
		gunModel[104].setRotationPoint(3.85F, 0.5F, -0.5F);

		gunModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.5F, -0.15F, -0.4F, -0.5F, -0.15F, -0.4F, -0.5F, -0.15F, -0.4F, -0.5F, -0.15F, 0.4F, -0.2F, -0.15F, -0.9F, -0.2F, -0.15F, -0.9F, -0.2F, -0.15F, 0.4F, -0.2F, -0.15F); // Box 133
		gunModel[105].setRotationPoint(5.5F, 0.5F, -0.5F);

		gunModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.5F, -0.15F, -0.4F, -0.5F, -0.15F, -0.4F, -0.5F, -0.15F, -0.4F, -0.5F, -0.15F, -0.2F, -0.1F, -0.15F, -0.6F, -0.1F, -0.15F, -0.6F, -0.1F, -0.15F, -0.2F, -0.1F, -0.15F); // Box 134
		gunModel[106].setRotationPoint(5.7F, 0.1F, -0.5F);

		gunModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.15F, -0.42F, -0.15F, -0.15F, -0.42F, -0.15F, -0.15F, -0.42F, -0.15F, -0.15F, -0.42F, -0.15F, -0.15F, -0.42F, -0.15F, -0.15F, -0.42F, -0.15F, -0.15F, -0.42F, -0.15F, -0.15F, -0.42F, -0.15F); // Box 135
		gunModel[107].setRotationPoint(4.7F, 0.75F, -0.5F);

		gunModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.5F, -0.15F, -0.4F, -0.5F, -0.15F, -0.4F, -0.5F, -0.15F, -0.3F, -0.5F, -0.15F, -0.6F, -0.1F, -0.15F, -0.4F, -0.1F, -0.15F, -0.4F, -0.1F, -0.15F, -0.6F, -0.1F, -0.15F); // Box 136
		gunModel[108].setRotationPoint(5.5F, -0.9F, -0.5F);

		gunModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.5F, -0.2F, 0.1F, -0.45F, -0.2F, 0.1F, -0.45F, -0.2F, -0.35F, -0.5F, -0.2F, -0.3F, -0.1F, -0.2F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F); // Box 137
		gunModel[109].setRotationPoint(4.4F, -0.75F, -0.5F);

		gunModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.42F, -0.5F, -0.2F, -0.3F, -0.5F, -0.2F, -0.3F, -0.5F, -0.2F, -0.42F, -0.5F, -0.2F, -0.2F, -0.05F, -0.2F, -0.6F, -0.05F, -0.2F, -0.6F, -0.05F, -0.2F, -0.2F, -0.05F, -0.2F); // Box 138
		gunModel[110].setRotationPoint(4.3F, -0.35F, -0.5F);

		gunModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.5F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, -0.5F, -0.2F, -0.55F, -0.2F, -0.2F, -0.3F, -0.05F, -0.2F, -0.3F, -0.05F, -0.2F, -0.55F, -0.2F, -0.2F); // Box 139
		gunModel[111].setRotationPoint(4.1F, 0.1F, -0.5F);

		gunModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,1.3F, -2F, 0.1F, -2.05F, -1.8F, 0.1F, -2.05F, -1.8F, 0.1F, 1.3F, -2F, 0.1F, 1F, 0.95F, 0.1F, -1.8F, 0.9F, 0.1F, -1.8F, 0.9F, 0.1F, 1F, 0.9F, 0.1F); // Box 231
		gunModel[112].setRotationPoint(-7F, -2F, -0.5F);

		gunModel[113].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,1.3F, -2F, 0.1F, -2.1F, -2F, 0.1F, -2.1F, -2F, 0.1F, 1.3F, -2F, 0.1F, 1F, 1.1F, 0.1F, -1.8F, 1.3F, 0.1F, -1.8F, 1.3F, 0.1F, 1F, 1.1F, 0.1F); // Box 233
		gunModel[113].setRotationPoint(-6.7F, -1.1F, -0.5F);

		gunModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.3F, -0.15F, -0.35F, -0.3F, -0.15F, -0.35F, -0.3F, -0.15F, -0.35F, -0.3F, -0.15F, -0.35F, -0.3F, -0.15F, -0.35F, -0.3F, -0.15F, -0.35F, -0.3F, -0.15F, -0.35F, -0.3F, -0.15F); // Box 234
		gunModel[114].setRotationPoint(9.25F, -0.8F, -0.5F);
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 107
		ammoModel[1] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 107
		ammoModel[2] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 107
		ammoModel[3] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 107
		ammoModel[4] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 107
		ammoModel[5] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 107
		ammoModel[6] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 107
		ammoModel[7] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 107
		ammoModel[8] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 107
		ammoModel[9] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 107
		ammoModel[10] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 107
		ammoModel[11] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 107
		ammoModel[12] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 107
		ammoModel[13] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 107
		ammoModel[14] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 107
		ammoModel[15] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 107
		ammoModel[16] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 107
		ammoModel[17] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 107
		ammoModel[18] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 107
		ammoModel[19] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 107
		ammoModel[20] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 107
		ammoModel[21] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 107
		ammoModel[22] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 107
		ammoModel[23] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 107
		ammoModel[24] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 107
		ammoModel[25] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 107
		ammoModel[26] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 107
		ammoModel[27] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 107
		ammoModel[28] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 107
		ammoModel[29] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 107
		ammoModel[30] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 170
		ammoModel[31] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 171
		ammoModel[32] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 172
		ammoModel[33] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 173
		ammoModel[34] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 174
		ammoModel[35] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 175
		ammoModel[36] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 176
		ammoModel[37] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 177
		ammoModel[38] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 178
		ammoModel[39] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 179
		ammoModel[40] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 180
		ammoModel[41] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 181
		ammoModel[42] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 182
		ammoModel[43] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 183
		ammoModel[44] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 184
		ammoModel[45] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 185
		ammoModel[46] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 186
		ammoModel[47] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 187
		ammoModel[48] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 188
		ammoModel[49] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 189
		ammoModel[50] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 190
		ammoModel[51] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 191
		ammoModel[52] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 192
		ammoModel[53] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 193
		ammoModel[54] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 194
		ammoModel[55] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 195
		ammoModel[56] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 196
		ammoModel[57] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 197
		ammoModel[58] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 198
		ammoModel[59] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 199
		ammoModel[60] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 107
		ammoModel[61] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 107
		ammoModel[62] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 107
		ammoModel[63] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 107
		ammoModel[64] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 107
		ammoModel[65] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 107
		ammoModel[66] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 107
		ammoModel[67] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 107
		ammoModel[68] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 107
		ammoModel[69] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 107
		ammoModel[70] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 107
		ammoModel[71] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 107
		ammoModel[72] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 107
		ammoModel[73] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 107
		ammoModel[74] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 107
		ammoModel[75] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 230

		ammoModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 107
		ammoModel[0].setRotationPoint(7.1F, -2.45F, -0.5F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 107
		ammoModel[1].setRotationPoint(7.1F, -2.55F, -0.5F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.45F, -0.45F, -0.52F, -0.45F, -0.4F, -0.49F, -0.44F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 107
		ammoModel[2].setRotationPoint(7.92F, -2.55F, -0.5F);

		ammoModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 107
		ammoModel[3].setRotationPoint(7.92F, -2.45F, -0.5F);

		ammoModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 107
		ammoModel[4].setRotationPoint(8.05F, -2.55F, -0.5F);

		ammoModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F); // Box 107
		ammoModel[5].setRotationPoint(8.05F, -2.35F, -0.5F);

		ammoModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 107
		ammoModel[6].setRotationPoint(8.05F, -2.45F, -0.5F);

		ammoModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F); // Box 107
		ammoModel[7].setRotationPoint(8.25F, -2.5F, -0.5F);

		ammoModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F); // Box 107
		ammoModel[8].setRotationPoint(8.25F, -2.4F, -0.5F);

		ammoModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F, -0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F); // Box 107
		ammoModel[9].setRotationPoint(8.5F, -2.5F, -0.5F);

		ammoModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F, -0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F); // Box 107
		ammoModel[10].setRotationPoint(8.5F, -2.4F, -0.5F);

		ammoModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F); // Box 107
		ammoModel[11].setRotationPoint(7.1F, -2.35F, -0.5F);

		ammoModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.46F, -0.45F, -0.52F, -0.46F, -0.4F, -0.49F, -0.44F); // Box 107
		ammoModel[12].setRotationPoint(7.92F, -2.35F, -0.5F);

		ammoModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F); // Box 107
		ammoModel[13].setRotationPoint(8.25F, -2.45F, -0.5F);

		ammoModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F, -0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F); // Box 107
		ammoModel[14].setRotationPoint(8.5F, -2.45F, -0.5F);

		ammoModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 107
		ammoModel[15].setRotationPoint(7.1F, -2.2F, -0.5F);

		ammoModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 107
		ammoModel[16].setRotationPoint(7.1F, -2.3F, -0.5F);

		ammoModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.45F, -0.45F, -0.52F, -0.45F, -0.4F, -0.49F, -0.44F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 107
		ammoModel[17].setRotationPoint(7.92F, -2.3F, -0.5F);

		ammoModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 107
		ammoModel[18].setRotationPoint(7.92F, -2.2F, -0.5F);

		ammoModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 107
		ammoModel[19].setRotationPoint(8.05F, -2.3F, -0.5F);

		ammoModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F); // Box 107
		ammoModel[20].setRotationPoint(8.05F, -2.1F, -0.5F);

		ammoModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 107
		ammoModel[21].setRotationPoint(8.05F, -2.2F, -0.5F);

		ammoModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F); // Box 107
		ammoModel[22].setRotationPoint(8.25F, -2.25F, -0.5F);

		ammoModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F); // Box 107
		ammoModel[23].setRotationPoint(8.25F, -2.15F, -0.5F);

		ammoModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F, -0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F); // Box 107
		ammoModel[24].setRotationPoint(8.5F, -2.25F, -0.5F);

		ammoModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F, -0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F); // Box 107
		ammoModel[25].setRotationPoint(8.5F, -2.15F, -0.5F);

		ammoModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F); // Box 107
		ammoModel[26].setRotationPoint(7.1F, -2.1F, -0.5F);

		ammoModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.46F, -0.45F, -0.52F, -0.46F, -0.4F, -0.49F, -0.44F); // Box 107
		ammoModel[27].setRotationPoint(7.92F, -2.1F, -0.5F);

		ammoModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F); // Box 107
		ammoModel[28].setRotationPoint(8.25F, -2.2F, -0.5F);

		ammoModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F, -0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F); // Box 107
		ammoModel[29].setRotationPoint(8.5F, -2.2F, -0.5F);

		ammoModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 170
		ammoModel[30].setRotationPoint(7.1F, -1.95F, -0.5F);

		ammoModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 171
		ammoModel[31].setRotationPoint(7.1F, -2.05F, -0.5F);

		ammoModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.45F, -0.45F, -0.52F, -0.45F, -0.4F, -0.49F, -0.44F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 172
		ammoModel[32].setRotationPoint(7.92F, -2.05F, -0.5F);

		ammoModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 173
		ammoModel[33].setRotationPoint(7.92F, -1.95F, -0.5F);

		ammoModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 174
		ammoModel[34].setRotationPoint(8.05F, -2.05F, -0.5F);

		ammoModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F); // Box 175
		ammoModel[35].setRotationPoint(8.05F, -1.85F, -0.5F);

		ammoModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 176
		ammoModel[36].setRotationPoint(8.05F, -1.95F, -0.5F);

		ammoModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F); // Box 177
		ammoModel[37].setRotationPoint(8.25F, -2F, -0.5F);

		ammoModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F); // Box 178
		ammoModel[38].setRotationPoint(8.25F, -1.9F, -0.5F);

		ammoModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F, -0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F); // Box 179
		ammoModel[39].setRotationPoint(8.5F, -2F, -0.5F);

		ammoModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F, -0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F); // Box 180
		ammoModel[40].setRotationPoint(8.5F, -1.9F, -0.5F);

		ammoModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F); // Box 181
		ammoModel[41].setRotationPoint(7.1F, -1.85F, -0.5F);

		ammoModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.46F, -0.45F, -0.52F, -0.46F, -0.4F, -0.49F, -0.44F); // Box 182
		ammoModel[42].setRotationPoint(7.92F, -1.85F, -0.5F);

		ammoModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F); // Box 183
		ammoModel[43].setRotationPoint(8.25F, -1.95F, -0.5F);

		ammoModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F, -0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F); // Box 184
		ammoModel[44].setRotationPoint(8.5F, -1.95F, -0.5F);

		ammoModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 185
		ammoModel[45].setRotationPoint(7.1F, -1.7F, -0.5F);

		ammoModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 186
		ammoModel[46].setRotationPoint(7.1F, -1.8F, -0.5F);

		ammoModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.45F, -0.45F, -0.52F, -0.45F, -0.4F, -0.49F, -0.44F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 187
		ammoModel[47].setRotationPoint(7.92F, -1.8F, -0.5F);

		ammoModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 188
		ammoModel[48].setRotationPoint(7.92F, -1.7F, -0.5F);

		ammoModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 189
		ammoModel[49].setRotationPoint(8.05F, -1.8F, -0.5F);

		ammoModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F); // Box 190
		ammoModel[50].setRotationPoint(8.05F, -1.6F, -0.5F);

		ammoModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 191
		ammoModel[51].setRotationPoint(8.05F, -1.7F, -0.5F);

		ammoModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F); // Box 192
		ammoModel[52].setRotationPoint(8.25F, -1.75F, -0.5F);

		ammoModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F); // Box 193
		ammoModel[53].setRotationPoint(8.25F, -1.65F, -0.5F);

		ammoModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F, -0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F); // Box 194
		ammoModel[54].setRotationPoint(8.5F, -1.75F, -0.5F);

		ammoModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F, -0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F); // Box 195
		ammoModel[55].setRotationPoint(8.5F, -1.65F, -0.5F);

		ammoModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F); // Box 196
		ammoModel[56].setRotationPoint(7.1F, -1.6F, -0.5F);

		ammoModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.46F, -0.45F, -0.52F, -0.46F, -0.4F, -0.49F, -0.44F); // Box 197
		ammoModel[57].setRotationPoint(7.92F, -1.6F, -0.5F);

		ammoModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F); // Box 198
		ammoModel[58].setRotationPoint(8.25F, -1.7F, -0.5F);

		ammoModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F, -0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F); // Box 199
		ammoModel[59].setRotationPoint(8.5F, -1.7F, -0.5F);

		ammoModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 107
		ammoModel[60].setRotationPoint(7.1F, -1.45F, -0.5F);

		ammoModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 107
		ammoModel[61].setRotationPoint(7.1F, -1.55F, -0.5F);

		ammoModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.45F, -0.45F, -0.52F, -0.45F, -0.4F, -0.49F, -0.44F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 107
		ammoModel[62].setRotationPoint(7.92F, -1.55F, -0.5F);

		ammoModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 107
		ammoModel[63].setRotationPoint(7.92F, -1.45F, -0.5F);

		ammoModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 107
		ammoModel[64].setRotationPoint(8.05F, -1.55F, -0.5F);

		ammoModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F); // Box 107
		ammoModel[65].setRotationPoint(8.05F, -1.35F, -0.5F);

		ammoModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 107
		ammoModel[66].setRotationPoint(8.05F, -1.45F, -0.5F);

		ammoModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F); // Box 107
		ammoModel[67].setRotationPoint(8.25F, -1.5F, -0.5F);

		ammoModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F); // Box 107
		ammoModel[68].setRotationPoint(8.25F, -1.4F, -0.5F);

		ammoModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F, -0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F); // Box 107
		ammoModel[69].setRotationPoint(8.5F, -1.5F, -0.5F);

		ammoModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F, -0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F); // Box 107
		ammoModel[70].setRotationPoint(8.5F, -1.4F, -0.5F);

		ammoModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F); // Box 107
		ammoModel[71].setRotationPoint(7.1F, -1.35F, -0.5F);

		ammoModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.46F, -0.45F, -0.52F, -0.46F, -0.4F, -0.49F, -0.44F); // Box 107
		ammoModel[72].setRotationPoint(7.92F, -1.35F, -0.5F);

		ammoModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F); // Box 107
		ammoModel[73].setRotationPoint(8.25F, -1.45F, -0.5F);

		ammoModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F, -0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F); // Box 107
		ammoModel[74].setRotationPoint(8.5F, -1.45F, -0.5F);

		ammoModel[75].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F); // Box 230
		ammoModel[75].setRotationPoint(6.6F, -2.45F, -0.5F);
	}

	private void initpumpModel_1()
	{
		pumpModel[0] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 117
		pumpModel[1] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 118
		pumpModel[2] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 120
		pumpModel[3] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 121
		pumpModel[4] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 122
		pumpModel[5] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 123
		pumpModel[6] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 126

		pumpModel[0].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 117
		pumpModel[0].setRotationPoint(4.1F, -2.65F, -0.5F);

		pumpModel[1].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 118
		pumpModel[1].setRotationPoint(4.1F, -2.9F, -0.5F);

		pumpModel[2].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 120
		pumpModel[2].setRotationPoint(4.1F, -2.45F, -0.5F);

		pumpModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.15F, -0.13F, -0.3F, -0.15F, -0.13F, -0.3F, -0.15F, -0.13F, -0.3F, -0.15F, -0.13F, -0.3F, -0.15F, -0.05F, -0.3F, -0.15F, -0.25F, -0.3F, -0.15F, -0.25F, -0.3F, -0.15F, -0.05F, -0.3F); // Box 121
		pumpModel[3].setRotationPoint(3.25F, -2.65F, -0.5F);

		pumpModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.35F, -0.7F, -0.5F, -0.35F, -0.7F, -0.5F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, -0.7F, -0.35F, -0.4F, -0.7F); // Box 122
		pumpModel[4].setRotationPoint(3.85F, -2.9F, -1.1F);

		pumpModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 123
		pumpModel[5].setRotationPoint(3.85F, -1.55F, -1.5F);

		pumpModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.33F, -0.25F, -0.4F, -0.33F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.35F); // Box 126
		pumpModel[6].setRotationPoint(6.4F, -3.35F, -0.55F);
		
		gunSlideDistance = 0.5F;
		pumpDelayAfterReload = 65;
		pumpDelay = 11;
		pumpTime = 9;
		animationType = EnumAnimationType.RIFLE_TOP;
		
		numBulletsInReloadAnimation = 1;
		tiltGunTime = 0.25F;
		unloadClipTime = 0.0F;
		loadClipTime = 0.35F;
		untiltGunTime = 0.4F;

		translateAll(0F, -3F, 0F);
	}
}