//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 23.03.2018 - 14:41:27
// Last changed on: 23.03.2018 - 14:41:27

package com.flansmod.client.model.Lizard; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelBM59Para extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelBM59Para() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[128];
		ammoModel = new ModelRendererTurbo[2];
		slideModel = new ModelRendererTurbo[7];

		initgunModel_1();
		initammoModel_1();
		initslideModel_1();

		translateAll(0F, -1.9F, 0.05F);
		
		gunSlideDistance = 0.1F;
		animationType = EnumAnimationType.BULLPUP;


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 6
		gunModel[7] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 7
		gunModel[8] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 8
		gunModel[9] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 10
		gunModel[10] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 11
		gunModel[11] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 12
		gunModel[12] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 13
		gunModel[13] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 14
		gunModel[14] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 15
		gunModel[15] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 16
		gunModel[16] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 17
		gunModel[17] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 18
		gunModel[18] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 19
		gunModel[19] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 30
		gunModel[20] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 33
		gunModel[21] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 34
		gunModel[22] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 35
		gunModel[23] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 50
		gunModel[24] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 51
		gunModel[25] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 52
		gunModel[26] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 53
		gunModel[27] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 54
		gunModel[28] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 57
		gunModel[29] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 58
		gunModel[30] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 59
		gunModel[31] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 60
		gunModel[32] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 61
		gunModel[33] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 62
		gunModel[34] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 63
		gunModel[35] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 64
		gunModel[36] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 65
		gunModel[37] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 66
		gunModel[38] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 67
		gunModel[39] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 68
		gunModel[40] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 66
		gunModel[41] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 67
		gunModel[42] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 68
		gunModel[43] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 69
		gunModel[44] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 70
		gunModel[45] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 71
		gunModel[46] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 102
		gunModel[47] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 103
		gunModel[48] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 104
		gunModel[49] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 78
		gunModel[50] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 79
		gunModel[51] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 80
		gunModel[52] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 81
		gunModel[53] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 82
		gunModel[54] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 83
		gunModel[55] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 88
		gunModel[56] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 89
		gunModel[57] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 90
		gunModel[58] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 91
		gunModel[59] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 97
		gunModel[60] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 98
		gunModel[61] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 99
		gunModel[62] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 100
		gunModel[63] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 101
		gunModel[64] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 102
		gunModel[65] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 103
		gunModel[66] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 104
		gunModel[67] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 105
		gunModel[68] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 106
		gunModel[69] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 107
		gunModel[70] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 108
		gunModel[71] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 109
		gunModel[72] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 110
		gunModel[73] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 111
		gunModel[74] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 112
		gunModel[75] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 113
		gunModel[76] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 114
		gunModel[77] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 115
		gunModel[78] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 116
		gunModel[79] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 119
		gunModel[80] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 120
		gunModel[81] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 161
		gunModel[82] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 162
		gunModel[83] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 163
		gunModel[84] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 131
		gunModel[85] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 132
		gunModel[86] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 133
		gunModel[87] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 134
		gunModel[88] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 135
		gunModel[89] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 136
		gunModel[90] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 137
		gunModel[91] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 138
		gunModel[92] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 189
		gunModel[93] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 190
		gunModel[94] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 191
		gunModel[95] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 192
		gunModel[96] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 193
		gunModel[97] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 194
		gunModel[98] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 195
		gunModel[99] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 196
		gunModel[100] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 197
		gunModel[101] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 198
		gunModel[102] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 199
		gunModel[103] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 200
		gunModel[104] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 201
		gunModel[105] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 202
		gunModel[106] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 9
		gunModel[107] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 94
		gunModel[108] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 232
		gunModel[109] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 233
		gunModel[110] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 234
		gunModel[111] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 235
		gunModel[112] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 236
		gunModel[113] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 237
		gunModel[114] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 238
		gunModel[115] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 19
		gunModel[116] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 20
		gunModel[117] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 21
		gunModel[118] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 22
		gunModel[119] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 23
		gunModel[120] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 24
		gunModel[121] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 254
		gunModel[122] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 255
		gunModel[123] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 256
		gunModel[124] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 257
		gunModel[125] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 259
		gunModel[126] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 260
		gunModel[127] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 261

		gunModel[0].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0.2F, -0.35F, 0F, 0.2F, -0.35F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.1F, 0.2F, -0.35F, 0.1F, 0.2F, -0.35F, 0.1F, 0.2F, 0F, 0.1F, 0.2F); // Box 0
		gunModel[0].setRotationPoint(0.75F, -3.15F, -0.65F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0.1F, -0.25F, -0.5F, 0.1F, -0.25F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.3F, -0.2F, -0.35F, -0.3F, -0.2F, -0.35F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 1
		gunModel[1].setRotationPoint(0.75F, -2.35F, -0.65F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.5F, 0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0.1F, -0.35F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, -0.35F, -0.3F, -0.2F); // Box 2
		gunModel[2].setRotationPoint(5.4F, -2.35F, -0.65F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.5F, 0.2F, -0.1F, -0.5F, 0.2F, -0.1F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.3F, 0.1F, -0.1F, -0.3F, 0.1F, -0.1F, -0.3F, 0.1F, 0F, -0.3F, 0.1F); // Box 3
		gunModel[3].setRotationPoint(0.75F, -2.55F, -0.65F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.05F, 0.3F, 0.2F, -0.05F, 0.3F, 0.2F, -0.05F, 0.3F, 0.2F, -0.05F, 0.3F, 0.2F, -0.05F, 0.1F, 0.2F, -0.05F, 0F, 0.2F, -0.05F, 0F, 0.2F, -0.05F, 0.1F, 0.2F); // Box 4
		gunModel[4].setRotationPoint(6.35F, -3.15F, -0.65F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-0.05F, 0.3F, 0.2F, 0.15F, 0.3F, 0.15F, 0.15F, 0.3F, 0.15F, -0.05F, 0.3F, 0.2F, -0.05F, 0F, 0.2F, 0.15F, -0.6F, 0.15F, 0.15F, -0.6F, 0.15F, -0.05F, 0F, 0.2F); // Box 5
		gunModel[5].setRotationPoint(7.25F, -3.15F, -0.65F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.05F, -0.25F, 0.2F, -0.05F, -0.15F, 0.2F, -0.05F, -0.15F, 0.2F, -0.05F, -0.25F, 0.2F, -0.05F, -0.35F, -0.2F, -0.05F, -0.6F, -0.2F, -0.05F, -0.6F, -0.2F, -0.05F, -0.35F, -0.2F); // Box 6
		gunModel[6].setRotationPoint(6.35F, -2.3F, -0.65F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.15F, -0.5F, 0.2F, -0.1F, -0.5F, 0.2F, -0.1F, -0.5F, 0.2F, -0.15F, -0.5F, 0.2F, -0.15F, -0.3F, 0.1F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.15F, -0.3F, 0.1F); // Box 7
		gunModel[7].setRotationPoint(5.5F, -2.55F, -0.65F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-0.05F, -0.75F, 0.2F, 0.15F, -0.15F, 0.15F, 0.15F, -0.15F, 0.15F, -0.05F, -0.75F, 0.2F, -0.05F, 0F, -0.2F, 0.15F, -0.65F, -0.2F, 0.15F, -0.65F, -0.2F, -0.05F, 0F, -0.2F); // Box 8
		gunModel[8].setRotationPoint(7.25F, -2.9F, -0.65F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, -0.3F, 0.05F, 0F, -0.3F, 0.05F, 0F, -0.3F, 0.05F, 0.2F, -0.3F, 0.05F, 0.2F, -0.55F, 0.1F, 0F, -0.55F, 0.1F, 0F, -0.3F, 0.15F, 0.2F, -0.3F, 0.15F); // Box 10
		gunModel[9].setRotationPoint(7.25F, -4.15F, -0.65F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0.2F, -0.35F, -0.3F, 0.2F, -0.3F, 0.05F, 0F, -0.3F, 0.05F, 0F, -0.3F, 0.05F, 0.2F, -0.3F, 0.05F); // Box 11
		gunModel[10].setRotationPoint(7.25F, -4.55F, -0.65F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.3F, 0.05F, -0.35F, -0.3F, 0.02F, -0.35F, -0.3F, 0.02F, 0F, -0.3F, 0.05F, 0F, -0.55F, 0.1F, -0.35F, -0.55F, 0.05F, -0.35F, -0.3F, 0.1F, 0F, -0.3F, 0.15F); // Box 12
		gunModel[11].setRotationPoint(8.55F, -4.15F, -0.65F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.35F, -0.3F, -0.35F, -0.4F, -0.3F, -0.35F, -0.4F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.3F, 0.05F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, 0F, -0.3F, 0.05F); // Box 13
		gunModel[12].setRotationPoint(8.55F, -4.55F, -0.65F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.3F, 0.1F, 0.2F, -0.3F, 0.1F); // Box 14
		gunModel[13].setRotationPoint(8.25F, -4.15F, -0.65F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0.2F, -0.4F, -0.35F, 0.2F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.2F, -0.3F, 0F); // Box 15
		gunModel[14].setRotationPoint(8.25F, -4.55F, -0.65F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, 0.2F, -0.45F, -0.4F, 0.2F, -0.3F, -0.05F, 0F, -0.3F, -0.05F, 0F, -0.3F, -0.05F, 0.2F, -0.3F, -0.05F); // Box 16
		gunModel[15].setRotationPoint(13.55F, -4.55F, -0.65F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, -0.3F, -0.05F, 0F, -0.3F, -0.05F, 0F, -0.3F, -0.05F, 0.2F, -0.3F, -0.05F, 0.2F, -0.3F, 0.05F, 0F, -0.3F, 0.05F, 0F, -0.3F, 0.05F, 0.2F, -0.3F, 0.05F); // Box 17
		gunModel[16].setRotationPoint(13.55F, -4.15F, -0.65F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, -0.3F, 0.05F, 0F, -0.3F, 0.05F, 0F, -0.3F, 0.05F, 0.2F, -0.3F, 0.05F, 0.2F, -0.1F, 0.05F, 0F, -0.1F, 0.05F, 0F, -0.1F, 0.05F, 0.2F, -0.1F, 0.05F); // Box 18
		gunModel[17].setRotationPoint(13.55F, -3.75F, -0.65F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, -0.4F, 0.05F, 0F, -0.4F, 0.05F, 0F, -0.4F, 0.05F, 0.2F, -0.4F, 0.05F, 0.2F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F); // Box 19
		gunModel[18].setRotationPoint(13.55F, -3.25F, -0.65F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.4F, 0.15F, -0.35F, -0.2F, 0.2F, -0.35F, -0.2F, 0.2F, -0.25F, -0.4F, 0.15F, -0.25F, 0.1F, 0.15F, -0.35F, 0.1F, 0.2F, -0.35F, 0.1F, 0.2F, -0.25F, 0.1F, 0.15F); // Box 30
		gunModel[19].setRotationPoint(-0.9F, -3.15F, -0.65F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.35F, -0.55F, -0.1F, -0.35F, -0.35F, 0.2F, -0.35F, -0.35F, 0.2F, -0.35F, -0.55F, -0.1F, -0.25F, -0.25F, 0.15F, -0.35F, -0.45F, 0.2F, -0.35F, -0.45F, 0.2F, -0.25F, -0.25F, 0.15F); // Box 33
		gunModel[20].setRotationPoint(-0.9F, -3.5F, -0.65F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.3F, -0.5F, 0.15F, -0.3F, -0.5F, 0.2F, -0.3F, -0.5F, 0.2F, -0.3F, -0.5F, 0.15F, -0.4F, -0.3F, 0F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.4F, -0.3F, 0F); // Box 34
		gunModel[21].setRotationPoint(-0.95F, -2.55F, -0.65F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.4F, -0.5F, 0F, -0.3F, -0.5F, 0.1F, -0.3F, -0.5F, 0.1F, -0.4F, -0.5F, 0F, -0.5F, -0.3F, -0.15F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.5F, -0.3F, -0.15F); // Box 35
		gunModel[22].setRotationPoint(-0.95F, -2.35F, -0.65F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, -0.05F, -0.25F, -0.2F, 0.1F, -0.25F, -0.1F, -0.05F, -0.25F, 0F, -0.15F, -0.25F, 0.3F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.1F, -0.2F, -0.25F, 0.1F, -0.2F, -0.25F); // Box 50
		gunModel[23].setRotationPoint(0.75F, -3.75F, -0.35F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.15F, -0.25F, -0.1F, -0.05F, -0.25F, -0.2F, 0.1F, -0.25F, 0.2F, -0.05F, -0.25F, 0.1F, -0.2F, -0.25F, -0.1F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, 0.3F, -0.2F, -0.25F); // Box 51
		gunModel[24].setRotationPoint(0.75F, -3.75F, -0.85F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0.1F, -0.25F, -0.35F, 0.2F, -0.25F, -0.35F, 0.2F, -0.25F, -0.35F, -0.05F, -0.25F, -0.25F, -0.2F, -0.25F, -0.35F, -0.2F, -0.25F, -0.35F, -0.2F, -0.25F, -0.35F, -0.2F, -0.25F); // Box 52
		gunModel[25].setRotationPoint(1.3F, -3.75F, -0.35F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.05F, -0.25F, -0.35F, 0.2F, -0.25F, -0.35F, 0.2F, -0.25F, -0.25F, 0.1F, -0.25F, -0.35F, -0.2F, -0.25F, -0.35F, -0.2F, -0.25F, -0.35F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F); // Box 53
		gunModel[26].setRotationPoint(1.3F, -3.75F, -0.85F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.2F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 54
		gunModel[27].setRotationPoint(2.55F, -3.95F, -0.6F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 57
		gunModel[28].setRotationPoint(1.75F, -3.95F, -0.6F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F); // Box 58
		gunModel[29].setRotationPoint(2.75F, -4.3F, -0.3F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.3F, -0.3F, -0.35F, -0.5F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 59
		gunModel[30].setRotationPoint(3.45F, -4.3F, -0.3F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.35F, -0.5F, -0.1F, -0.35F, -0.5F, -0.1F, -0.35F, -0.35F, -0.1F, -0.35F, -0.35F, -0.1F, -0.35F, -0.45F, -0.1F, -0.35F, -0.45F, -0.1F, -0.35F, -0.3F, -0.1F, -0.35F, -0.3F); // Box 60
		gunModel[31].setRotationPoint(4.05F, -4.3F, -0.3F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, -0.35F, -0.5F, -0.5F, -0.15F, -0.5F, -0.5F, -0.15F, -0.35F, -0.5F, -0.35F, -0.35F, -0.5F, -0.35F, -0.45F, -0.5F, -0.35F, -0.45F, -0.5F, -0.35F, -0.3F, -0.5F, -0.35F, -0.3F); // Box 61
		gunModel[32].setRotationPoint(4.45F, -4.3F, -0.3F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.15F, -0.5F, 0.3F, -0.15F, -0.5F, 0.1F, -0.15F, -0.35F, -0.2F, -0.15F, -0.35F, -0.2F, -0.35F, -0.45F, 0.3F, -0.35F, -0.45F, 0.2F, -0.35F, -0.3F, -0.2F, -0.35F, -0.3F); // Box 62
		gunModel[33].setRotationPoint(5.75F, -4.3F, -0.3F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.15F, -0.1F, -0.2F, -0.15F, -0.1F, -0.2F, -0.15F, -0.1F, -0.3F, -0.15F, -0.1F, -0.2F, -0.35F, -0.1F, -0.2F, -0.35F, -0.1F, -0.2F, -0.35F, -0.1F, -0.2F, -0.35F, -0.1F); // Box 63
		gunModel[34].setRotationPoint(6.25F, -4.3F, -0.7F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.3F, -0.5F, 0.1F, -0.3F, -0.5F, 0F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.2F, -0.2F, -0.5F, 0.1F, -0.2F, -0.5F, 0F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 64
		gunModel[35].setRotationPoint(5.75F, -4.45F, -0.15F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.35F, -0.3F, -0.2F, -0.35F, -0.3F, -0.2F, -0.35F, -0.3F, -0.2F, -0.35F, -0.3F, -0.2F, -0.05F, -0.3F, -0.2F, -0.05F, -0.3F, -0.2F, -0.05F, -0.3F, -0.2F, -0.05F, -0.3F); // Box 65
		gunModel[36].setRotationPoint(3.55F, -4.05F, -0.2F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.35F, -0.3F, -0.25F, -0.35F, -0.3F, -0.25F, -0.35F, -0.2F, -0.25F, -0.35F, -0.2F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F); // Box 66
		gunModel[37].setRotationPoint(3.55F, -3.95F, -0.15F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, 0F, -0.45F, 0F, 0F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.1F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 67
		gunModel[38].setRotationPoint(2.75F, -4.6F, -0.6F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.3F, 0F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.4F, -0.35F, 0F); // Box 68
		gunModel[39].setRotationPoint(2.05F, -4.6F, -0.6F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.3F, -0.4F, 0F, -0.2F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.2F, -0.35F, 0F); // Box 66
		gunModel[40].setRotationPoint(1.75F, -4.6F, -0.6F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F); // Box 67
		gunModel[41].setRotationPoint(1.85F, -4.6F, -0.6F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F); // Box 68
		gunModel[42].setRotationPoint(1.75F, -4.6F, -0.2F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F); // Box 69
		gunModel[43].setRotationPoint(1.75F, -4.9F, -0.2F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F); // Box 70
		gunModel[44].setRotationPoint(1.75F, -4.9F, -0.95F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F); // Box 71
		gunModel[45].setRotationPoint(1.75F, -4.6F, -0.95F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.1F, -0.4F, -0.27F, -0.1F, -0.4F, -0.27F, -0.1F, -0.4F, -0.27F, -0.1F, -0.4F, -0.27F, -0.1F, -0.4F, -0.27F, -0.1F, -0.4F, -0.27F, -0.1F, -0.4F, -0.27F, -0.1F, -0.4F, -0.27F); // Box 102
		gunModel[46].setRotationPoint(12.6F, -3.6F, -0.65F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.1F, -0.47F, -0.42F, -0.1F, -0.47F, -0.42F, -0.1F, -0.47F, -0.42F, -0.1F, -0.47F, -0.42F, -0.1F, -0.4F, -0.27F, -0.1F, -0.4F, -0.27F, -0.1F, -0.4F, -0.27F, -0.1F, -0.4F, -0.27F); // Box 103
		gunModel[47].setRotationPoint(12.6F, -3.8F, -0.65F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.1F, -0.4F, -0.27F, -0.1F, -0.4F, -0.27F, -0.1F, -0.4F, -0.27F, -0.1F, -0.4F, -0.27F, -0.1F, -0.47F, -0.4F, -0.1F, -0.47F, -0.4F, -0.1F, -0.47F, -0.4F, -0.1F, -0.47F, -0.4F); // Box 104
		gunModel[48].setRotationPoint(12.6F, -3.4F, -0.65F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,-0.1F, -0.44F, -0.28F, -0.1F, -0.44F, -0.28F, -0.1F, -0.44F, -0.28F, -0.1F, -0.44F, -0.28F, -0.1F, -0.44F, -0.28F, -0.1F, -0.44F, -0.28F, -0.1F, -0.44F, -0.28F, -0.1F, -0.44F, -0.28F); // Box 78
		gunModel[49].setRotationPoint(14.1F, -4.2F, -0.65F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,-0.1F, -0.42F, -0.4F, -0.1F, -0.42F, -0.4F, -0.1F, -0.42F, -0.4F, -0.1F, -0.42F, -0.4F, -0.1F, -0.44F, -0.28F, -0.1F, -0.44F, -0.28F, -0.1F, -0.44F, -0.28F, -0.1F, -0.44F, -0.28F); // Box 79
		gunModel[50].setRotationPoint(14.1F, -4.32F, -0.65F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,-0.1F, -0.44F, -0.28F, -0.1F, -0.44F, -0.28F, -0.1F, -0.44F, -0.28F, -0.1F, -0.44F, -0.28F, -0.1F, -0.42F, -0.4F, -0.1F, -0.42F, -0.4F, -0.1F, -0.42F, -0.4F, -0.1F, -0.42F, -0.4F); // Box 80
		gunModel[51].setRotationPoint(14.1F, -4.08F, -0.65F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F); // Box 81
		gunModel[52].setRotationPoint(19.75F, -4.4F, -0.65F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F); // Box 82
		gunModel[53].setRotationPoint(19.75F, -4F, -0.65F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F); // Box 83
		gunModel[54].setRotationPoint(19.75F, -4.2F, -0.65F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.1F, -0.44F, -0.3F, -0.1F, -0.44F, -0.3F, -0.1F, -0.44F, -0.3F, -0.1F, -0.44F, -0.3F, -0.1F, -0.44F, -0.3F, -0.1F, -0.44F, -0.3F, -0.1F, -0.44F, -0.3F, -0.1F, -0.44F, -0.3F); // Box 88
		gunModel[55].setRotationPoint(14.7F, -3.6F, -0.65F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.1F, -0.44F, -0.42F, -0.1F, -0.44F, -0.42F, -0.1F, -0.44F, -0.42F, -0.1F, -0.44F, -0.42F, -0.1F, -0.44F, -0.3F, -0.1F, -0.44F, -0.3F, -0.1F, -0.44F, -0.3F, -0.1F, -0.44F, -0.3F); // Box 89
		gunModel[56].setRotationPoint(14.7F, -3.72F, -0.65F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.1F, -0.44F, -0.3F, -0.1F, -0.44F, -0.3F, -0.1F, -0.44F, -0.3F, -0.1F, -0.44F, -0.3F, -0.1F, -0.44F, -0.42F, -0.1F, -0.44F, -0.42F, -0.1F, -0.44F, -0.42F, -0.1F, -0.44F, -0.42F); // Box 90
		gunModel[57].setRotationPoint(14.7F, -3.48F, -0.65F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0.25F, -0.2F, -0.25F, 0.25F, -0.2F, -0.25F, 0.25F, -0.2F, -0.25F, 0.25F, -0.2F); // Box 91
		gunModel[58].setRotationPoint(19.1F, -4.3F, -0.65F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.4F, -0.457F, -0.35F, -0.4F, -0.457F, -0.35F, -0.4F, -0.457F, -0.35F, -0.4F, -0.457F, -0.35F, -0.4F, -0.457F, -0.35F, -0.4F, -0.457F, -0.35F, -0.4F, -0.457F, -0.35F, -0.4F, -0.457F); // Box 97
		gunModel[59].setRotationPoint(19.1F, -4.9F, -0.65F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.42F, -0.25F, -0.4F, -0.42F, -0.25F, -0.4F, -0.42F, -0.25F, -0.4F, -0.42F, -0.25F, -0.28F, -0.44F, -0.25F, -0.28F, -0.44F, -0.25F, -0.28F, -0.44F, -0.25F, -0.28F, -0.44F, -0.25F); // Box 98
		gunModel[60].setRotationPoint(1.8F, -4.72F, -0.05F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.28F, -0.44F, -0.25F, -0.28F, -0.44F, -0.25F, -0.28F, -0.44F, -0.25F, -0.28F, -0.44F, -0.25F, -0.28F, -0.44F, -0.25F, -0.28F, -0.44F, -0.25F, -0.28F, -0.44F, -0.25F, -0.28F, -0.44F, -0.25F); // Box 99
		gunModel[61].setRotationPoint(1.8F, -4.6F, -0.05F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.28F, -0.44F, -0.25F, -0.28F, -0.44F, -0.25F, -0.28F, -0.44F, -0.25F, -0.28F, -0.44F, -0.25F, -0.4F, -0.42F, -0.25F, -0.4F, -0.42F, -0.25F, -0.4F, -0.42F, -0.25F, -0.4F, -0.42F, -0.25F); // Box 100
		gunModel[62].setRotationPoint(1.8F, -4.48F, -0.05F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F); // Box 101
		gunModel[63].setRotationPoint(1.8F, -4.8F, 0.1F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F); // Box 102
		gunModel[64].setRotationPoint(1.8F, -4.6F, 0.1F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F); // Box 103
		gunModel[65].setRotationPoint(1.8F, -4.4F, 0.1F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F); // Box 104
		gunModel[66].setRotationPoint(1.8F, -4.6F, -1.35F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F); // Box 105
		gunModel[67].setRotationPoint(1.8F, -4.8F, -1.35F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F); // Box 106
		gunModel[68].setRotationPoint(1.8F, -4.4F, -1.35F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.42F, -0.25F, -0.4F, -0.42F, -0.25F, -0.4F, -0.42F, -0.25F, -0.4F, -0.42F, -0.25F, -0.28F, -0.44F, -0.25F, -0.28F, -0.44F, -0.25F, -0.28F, -0.44F, -0.25F, -0.28F, -0.44F, -0.25F); // Box 107
		gunModel[69].setRotationPoint(1.8F, -4.72F, -1.2F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.28F, -0.44F, -0.25F, -0.28F, -0.44F, -0.25F, -0.28F, -0.44F, -0.25F, -0.28F, -0.44F, -0.25F, -0.28F, -0.44F, -0.25F, -0.28F, -0.44F, -0.25F, -0.28F, -0.44F, -0.25F, -0.28F, -0.44F, -0.25F); // Box 108
		gunModel[70].setRotationPoint(1.8F, -4.6F, -1.2F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.28F, -0.44F, -0.25F, -0.28F, -0.44F, -0.25F, -0.28F, -0.44F, -0.25F, -0.28F, -0.44F, -0.25F, -0.4F, -0.42F, -0.25F, -0.4F, -0.42F, -0.25F, -0.4F, -0.42F, -0.25F, -0.4F, -0.42F, -0.25F); // Box 109
		gunModel[71].setRotationPoint(1.8F, -4.48F, -1.2F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F); // Box 110
		gunModel[72].setRotationPoint(1.75F, -4.8F, -0.35F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 111
		gunModel[73].setRotationPoint(1.75F, -4.8F, -0.85F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F); // Box 112
		gunModel[74].setRotationPoint(1.85F, -4.75F, -0.6F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.5F, -0.35F, -0.45F, -0.5F, -0.35F, -0.45F, -0.5F, -0.35F, -0.45F, -0.5F, -0.35F, -0.45F, -0.43F, -0.42F, -0.45F, -0.43F, -0.42F, -0.45F, -0.43F, -0.42F, -0.45F, -0.43F, -0.42F); // Box 113
		gunModel[75].setRotationPoint(1.85F, -4.9F, -0.6F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.43F, -0.42F, -0.45F, -0.43F, -0.42F, -0.45F, -0.43F, -0.42F, -0.45F, -0.43F, -0.42F, -0.45F, -0.5F, -0.35F, -0.45F, -0.5F, -0.35F, -0.45F, -0.5F, -0.35F, -0.45F, -0.5F, -0.35F); // Box 114
		gunModel[76].setRotationPoint(1.85F, -5.05F, -0.6F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.47F, -0.45F, -0.4F, -0.47F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.47F, -0.45F, -0.45F, -0.47F); // Box 115
		gunModel[77].setRotationPoint(1.85F, -4.95F, -0.7F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.47F, -0.45F, -0.4F, -0.47F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.47F, -0.45F, -0.45F, -0.47F); // Box 116
		gunModel[78].setRotationPoint(1.85F, -4.95F, -0.48F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.35F, -0.3F, 0.02F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, 0.35F, -0.3F, 0.02F, 0.35F, -0.3F, 0.1F, -0.35F, -0.3F, 0.1F, -0.35F, -0.3F, 0.1F, 0.35F, -0.3F, 0.1F); // Box 119
		gunModel[79].setRotationPoint(11.55F, -4.15F, -0.65F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.35F, -0.3F, -0.2F, -0.35F, -0.3F, -0.2F, -0.35F, -0.3F, -0.2F, 0.35F, -0.3F, -0.2F, 0.35F, -0.3F, -0.2F, -0.35F, -0.3F, -0.2F, -0.35F, -0.3F, -0.2F, 0.35F, -0.3F, -0.2F); // Box 120
		gunModel[80].setRotationPoint(7.55F, -4.15F, -0.65F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F); // Box 161
		gunModel[81].setRotationPoint(1.1F, -1.85F, -0.65F);

		gunModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F); // Box 162
		gunModel[82].setRotationPoint(1.1F, -2.05F, -0.65F);

		gunModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.55F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.55F, -0.35F, -0.35F); // Box 163
		gunModel[83].setRotationPoint(1.1F, -1.65F, -0.65F);

		gunModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.3F, -0.25F); // Box 131
		gunModel[84].setRotationPoint(0.55F, -2.05F, -0.65F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.75F, -0.3F, -0.25F, -0.1F, -0.3F, -0.25F, -0.1F, -0.3F, -0.25F, -0.75F, -0.3F, -0.25F); // Box 132
		gunModel[85].setRotationPoint(0.65F, -1.6F, -0.65F);

		gunModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.1F, -0.3F, -0.25F, -0.75F, -0.3F, -0.25F, -0.75F, -0.3F, -0.25F, -0.1F, -0.3F, -0.25F); // Box 133
		gunModel[86].setRotationPoint(1.9F, -1.6F, -0.65F);

		gunModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.15F, -0.4F, -0.25F, -0.2F, -0.4F, -0.25F, -0.2F, -0.4F, -0.25F, -0.15F, -0.4F, -0.25F, -0.15F, -0.45F, -0.25F, -0.2F, -0.45F, -0.25F, -0.2F, -0.45F, -0.25F, -0.15F, -0.45F, -0.25F); // Box 134
		gunModel[87].setRotationPoint(1.3F, -1.45F, -0.65F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F); // Box 135
		gunModel[88].setRotationPoint(1.85F, -2.05F, -0.65F);

		gunModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.25F, -0.35F, -0.3F, -0.25F, -0.35F, -0.3F, -0.25F, -0.35F, -0.3F, -0.25F, -0.35F, -0.3F, -0.25F, -0.35F, -0.3F, -0.25F, -0.35F, -0.3F, -0.25F, -0.35F, -0.3F, -0.25F, -0.35F); // Box 136
		gunModel[89].setRotationPoint(2.1F, -1.95F, -0.65F);

		gunModel[90].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F); // Box 137
		gunModel[90].setRotationPoint(1.75F, -3.75F, -0.8F);

		gunModel[91].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -0.2F, -0.45F, 0F); // Box 138
		gunModel[91].setRotationPoint(1.75F, -3.95F, -0.7F);

		gunModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F); // Box 189
		gunModel[92].setRotationPoint(22.6F, -4.4F, -0.65F);

		gunModel[93].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F); // Box 190
		gunModel[93].setRotationPoint(22.6F, -4.2F, -0.65F);

		gunModel[94].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F); // Box 191
		gunModel[94].setRotationPoint(22.6F, -4F, -0.65F);

		gunModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F); // Box 192
		gunModel[95].setRotationPoint(21.6F, -4.4F, -0.65F);

		gunModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F); // Box 193
		gunModel[96].setRotationPoint(21.6F, -4.2F, -0.65F);

		gunModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F); // Box 194
		gunModel[97].setRotationPoint(21.6F, -4F, -0.65F);

		gunModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.47F, -0.42F, -0.1F, -0.47F, -0.42F, -0.1F, -0.47F, -0.42F, -0.1F, -0.47F, -0.42F, -0.1F, -0.4F, -0.27F, -0.1F, -0.4F, -0.27F, -0.1F, -0.4F, -0.27F, -0.1F, -0.4F, -0.27F); // Box 195
		gunModel[98].setRotationPoint(18.6F, -3.8F, -0.65F);

		gunModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.4F, -0.27F, -0.1F, -0.4F, -0.27F, -0.1F, -0.4F, -0.27F, -0.1F, -0.4F, -0.27F, -0.1F, -0.4F, -0.27F, -0.1F, -0.4F, -0.27F, -0.1F, -0.4F, -0.27F, -0.1F, -0.4F, -0.27F); // Box 196
		gunModel[99].setRotationPoint(18.6F, -3.6F, -0.65F);

		gunModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.4F, -0.27F, -0.1F, -0.4F, -0.27F, -0.1F, -0.4F, -0.27F, -0.1F, -0.4F, -0.27F, -0.1F, -0.47F, -0.4F, -0.1F, -0.47F, -0.4F, -0.1F, -0.47F, -0.4F, -0.1F, -0.47F, -0.4F); // Box 197
		gunModel[100].setRotationPoint(18.6F, -3.4F, -0.65F);

		gunModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F); // Box 198
		gunModel[101].setRotationPoint(19.1F, -3.45F, -0.65F);

		gunModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.35F, -0.45F, -0.25F, -0.35F, -0.45F, -0.25F, -0.35F, -0.45F, -0.25F, -0.35F, -0.45F, -0.25F, -0.35F, -0.45F, -0.25F, -0.35F, -0.45F, -0.25F, -0.35F, -0.45F, -0.25F, -0.35F, -0.45F); // Box 199
		gunModel[102].setRotationPoint(19.1F, -4.95F, -0.4F);

		gunModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.35F, -0.45F, -0.25F, -0.35F, -0.45F, -0.25F, -0.35F, -0.45F, -0.25F, -0.35F, -0.45F, -0.25F, -0.35F, -0.45F, -0.25F, -0.35F, -0.45F, -0.25F, -0.35F, -0.45F, -0.25F, -0.35F, -0.45F); // Box 200
		gunModel[103].setRotationPoint(19.1F, -4.95F, -0.9F);

		gunModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F); // Box 201
		gunModel[104].setRotationPoint(19.1F, -5.2F, -0.9F);

		gunModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F); // Box 202
		gunModel[105].setRotationPoint(19.1F, -5.2F, -0.4F);

		gunModel[106].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.35F, -0.15F, 0.2F, -0.35F, -0.15F, 0.2F, -0.35F, -0.15F, 0.2F, -0.35F, -0.15F); // Box 9
		gunModel[106].setRotationPoint(3.55F, -2.35F, -0.65F);

		gunModel[107].addShapeBox(-9F, 0F, 0F, 9, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 94
		gunModel[107].setRotationPoint(17.9F, -3.35F, -0.2F);
		gunModel[107].rotateAngleY = -0.05235988F;
		gunModel[107].rotateAngleZ = 0.08726646F;

		gunModel[108].addShapeBox(-9F, 0F, 0F, 9, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 232
		gunModel[108].setRotationPoint(17.9F, -3.35F, -1.2F);
		gunModel[108].rotateAngleY = 0.05235988F;
		gunModel[108].rotateAngleZ = 0.08726646F;

		gunModel[109].addShapeBox(-9.5F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F); // Box 233
		gunModel[109].setRotationPoint(17.9F, -3.35F, -1.2F);
		gunModel[109].rotateAngleY = 0.05235988F;
		gunModel[109].rotateAngleZ = 0.08726646F;

		gunModel[110].addShapeBox(-9.5F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F); // Box 234
		gunModel[110].setRotationPoint(17.9F, -3.35F, -0.2F);
		gunModel[110].rotateAngleY = -0.05235988F;
		gunModel[110].rotateAngleZ = 0.08726646F;

		gunModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F); // Box 235
		gunModel[111].setRotationPoint(17.3F, -3.35F, -0.65F);

		gunModel[112].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.1F, -0.47F, -0.42F, -0.1F, -0.47F, -0.42F, -0.1F, -0.47F, -0.42F, -0.1F, -0.47F, -0.42F, -0.1F, -0.4F, -0.27F, -0.1F, -0.4F, -0.27F, -0.1F, -0.4F, -0.27F, -0.1F, -0.4F, -0.27F); // Box 236
		gunModel[112].setRotationPoint(12.6F, -4.4F, -0.65F);

		gunModel[113].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.1F, -0.4F, -0.27F, -0.1F, -0.4F, -0.27F, -0.1F, -0.4F, -0.27F, -0.1F, -0.4F, -0.27F, -0.1F, -0.47F, -0.4F, -0.1F, -0.47F, -0.4F, -0.1F, -0.47F, -0.4F, -0.1F, -0.47F, -0.4F); // Box 237
		gunModel[113].setRotationPoint(12.6F, -4F, -0.65F);

		gunModel[114].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.1F, -0.4F, -0.27F, -0.1F, -0.4F, -0.27F, -0.1F, -0.4F, -0.27F, -0.1F, -0.4F, -0.27F, -0.1F, -0.4F, -0.27F, -0.1F, -0.4F, -0.27F, -0.1F, -0.4F, -0.27F, -0.1F, -0.4F, -0.27F); // Box 238
		gunModel[114].setRotationPoint(12.6F, -4.2F, -0.65F);

		gunModel[115].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.2F, -0.2F, -0.05F, -0.55F, -0.2F, -0.05F, -0.55F, -0.2F, -0.05F, -0.2F, -0.2F, -0.05F, -0.2F, -0.1F, -0.05F, -0.4F, -0.1F, -0.05F, -0.4F, -0.1F, -0.05F, -0.2F, -0.1F, -0.05F); // Box 19
		gunModel[115].setRotationPoint(-0.5F, -1.85F, -0.65F);

		gunModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.55F, -0.25F, -0.2F, -0.2F, -0.25F, -0.05F, -0.2F, -0.25F, -0.05F, -0.55F, -0.25F, -0.2F, -0.75F, -0.25F, -0.05F, -0.2F, -0.25F, -0.05F, -0.2F, -0.25F, -0.05F, -0.75F, -0.25F, -0.05F); // Box 20
		gunModel[116].setRotationPoint(-1.1F, -1.9F, -0.65F);

		gunModel[117].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.2F, -0.2F, -0.05F, -0.4F, -0.2F, -0.05F, -0.4F, -0.2F, -0.05F, -0.2F, -0.2F, -0.05F, 0.2F, -0.1F, -0.05F, -0.85F, -0.1F, -0.05F, -0.85F, -0.1F, -0.05F, 0.2F, -0.1F, -0.05F); // Box 21
		gunModel[117].setRotationPoint(-0.5F, -1.15F, -0.65F);

		gunModel[118].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.2F, -0.2F, -0.05F, -0.45F, -0.2F, -0.05F, -0.45F, -0.2F, -0.05F, -0.2F, -0.2F, -0.05F, 0.1F, -0.1F, -0.05F, -0.7F, -0.1F, -0.05F, -0.7F, -0.1F, -0.05F, 0.1F, -0.1F, -0.05F); // Box 22
		gunModel[118].setRotationPoint(-0.9F, -0.45F, -0.65F);

		gunModel[119].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.2F, -0.2F, -0.05F, -0.4F, -0.2F, -0.05F, -0.4F, -0.2F, -0.05F, -0.2F, -0.2F, -0.05F, -0.15F, -0.3F, -0.05F, -0.4F, -0.3F, -0.05F, -0.4F, -0.3F, -0.05F, -0.15F, -0.3F, -0.05F); // Box 23
		gunModel[119].setRotationPoint(-1.2F, 0.26F, -0.65F);

		gunModel[120].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.15F, -0.45F, -0.05F, -0.4F, -0.45F, -0.05F, -0.4F, -0.45F, -0.05F, -0.15F, -0.45F, -0.05F, -0.25F, -0.45F, -0.05F, -0.5F, -0.45F, -0.05F, -0.5F, -0.45F, -0.05F, -0.25F, -0.45F, -0.05F); // Box 24
		gunModel[120].setRotationPoint(-1.2F, 0.52F, -0.65F);

		gunModel[121].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 254
		gunModel[121].setRotationPoint(-7.9F, -3F, -0.65F);

		gunModel[122].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 255
		gunModel[122].setRotationPoint(-7.75F, -1F, -0.65F);
		gunModel[122].rotateAngleZ = 0.27925268F;

		gunModel[123].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F); // Box 256
		gunModel[123].setRotationPoint(-7.9F, -1.8F, -0.65F);

		gunModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, -0.2F, -0.1F, -0.7F, -0.2F, -0.1F, -0.7F, -0.2F, -0.1F, 0.1F, -0.2F, -0.1F); // Box 257
		gunModel[124].setRotationPoint(-7.9F, -0.3F, -0.65F);

		gunModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.5F, 0F, -0.1F, 0.1F, -0.5F, -0.1F, -0.2F, -0.5F, -0.1F, -0.2F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F); // Box 259
		gunModel[125].setRotationPoint(-7.9F, -3.3F, -0.65F);

		gunModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 260
		gunModel[126].setRotationPoint(-7.9F, -2.8F, -0.65F);

		gunModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 261
		gunModel[127].setRotationPoint(-0.9F, -3F, -0.65F);
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 9
		ammoModel[1] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 203

		ammoModel[0].addShapeBox(0F, 0.25F, 0F, 2, 3, 1, 0F,0F, 0.25F, -0.05F, 0F, 0.25F, -0.05F, 0F, 0.25F, -0.05F, 0F, 0.25F, -0.05F, 0F, 0.25F, -0.05F, 0F, 0.25F, -0.05F, 0F, 0.25F, -0.05F, 0F, 0.25F, -0.05F); // Box 9
		ammoModel[0].setRotationPoint(4F, -2.25F, -0.65F);
		ammoModel[0].rotateAngleZ = 0.12217305F;

		ammoModel[1].addShapeBox(0.45F, 0.25F, 0F, 2, 3, 1, 0F,0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F); // Box 203
		ammoModel[1].setRotationPoint(4.1F, -2.25F, -0.65F);
		ammoModel[1].rotateAngleZ = 0.12217305F;
	}

	private void initslideModel_1()
	{
		slideModel[0] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 117
		slideModel[1] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 121
		slideModel[2] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 122
		slideModel[3] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 124
		slideModel[4] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 125
		slideModel[5] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 126
		slideModel[6] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 127

		slideModel[0].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0.2F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F, 0.2F, -0.4F, -0.1F); // Box 117
		slideModel[0].setRotationPoint(3.5F, -4.25F, -0.65F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.3F, -0.05F, -0.2F, -0.3F, -0.05F, -0.2F, -0.3F, -0.45F, 0.1F, -0.3F, -0.45F, 0.1F, -0.3F, -0.05F, -0.2F, -0.3F, -0.05F, -0.2F, -0.3F, -0.45F, 0.1F, -0.3F, -0.45F); // Box 121
		slideModel[1].setRotationPoint(5.75F, -4.15F, -1F);

		slideModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F); // Box 122
		slideModel[2].setRotationPoint(5.25F, -4.15F, -1.55F);

		slideModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.55F, -0.3F, -0.35F, -0.3F, -0.3F, -0.35F, -0.4F, -0.3F, -0.35F, -0.4F, -0.3F, -0.35F, -0.55F, -0.3F, -0.35F, -0.3F, -0.3F, -0.35F, -0.4F, -0.3F, -0.35F, -0.4F, -0.3F, -0.35F); // Box 124
		slideModel[3].setRotationPoint(5.25F, -4.15F, -1.8F);

		slideModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.1F, -0.45F, -0.25F, -0.2F, -0.45F, -0.25F, -0.2F, -0.45F, -0.2F, -0.1F, -0.45F, -0.2F); // Box 125
		slideModel[4].setRotationPoint(5.75F, -4.4F, -0.6F);

		slideModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.2F, -0.05F, -0.25F, -0.2F, -0.05F, -0.25F, -0.2F, -0.5F, -0.25F, -0.2F, -0.5F, -0.25F, -0.3F, -0.05F, -0.2F, -0.3F, -0.05F, -0.2F, -0.3F, -0.5F, -0.25F, -0.3F, -0.5F); // Box 126
		slideModel[5].setRotationPoint(6.25F, -4.15F, -1F);

		slideModel[6].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.1F, 0F, -0.45F, -0.15F, 0F, -0.45F, -0.5F, 0F, -0.45F, -0.5F, 0F, -0.3F, -0.05F, 0.3F, -0.3F, -0.05F, 0.3F, -0.3F, -0.5F, 0F, -0.3F, -0.5F); // Box 127
		slideModel[6].setRotationPoint(7F, -4.15F, -1F);
	}
}