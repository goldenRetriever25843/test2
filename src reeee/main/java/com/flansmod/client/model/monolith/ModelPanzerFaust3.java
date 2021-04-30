//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 30.04.2016 - 23:15:45
// Last changed on: 30.04.2016 - 23:15:45

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPanzerFaust3 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 512;

	public ModelPanzerFaust3() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[129];
		ammoModel = new ModelRendererTurbo[41];

		initgunModel_1();
		initammoModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 6
		gunModel[7] = new ModelRendererTurbo(this, 745, 17, textureX, textureY); // Box 7
		gunModel[8] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 8
		gunModel[9] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 9
		gunModel[10] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 10
		gunModel[11] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 11
		gunModel[12] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 12
		gunModel[13] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 13
		gunModel[14] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 15
		gunModel[15] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 17
		gunModel[16] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 18
		gunModel[17] = new ModelRendererTurbo(this, 537, 33, textureX, textureY); // Box 19
		gunModel[18] = new ModelRendererTurbo(this, 577, 33, textureX, textureY); // Box 20
		gunModel[19] = new ModelRendererTurbo(this, 617, 33, textureX, textureY); // Box 21
		gunModel[20] = new ModelRendererTurbo(this, 641, 33, textureX, textureY); // Box 22
		gunModel[21] = new ModelRendererTurbo(this, 665, 33, textureX, textureY); // Box 24
		gunModel[22] = new ModelRendererTurbo(this, 697, 33, textureX, textureY); // Box 25
		gunModel[23] = new ModelRendererTurbo(this, 729, 33, textureX, textureY); // Box 26
		gunModel[24] = new ModelRendererTurbo(this, 761, 33, textureX, textureY); // Box 27
		gunModel[25] = new ModelRendererTurbo(this, 793, 33, textureX, textureY); // Box 28
		gunModel[26] = new ModelRendererTurbo(this, 785, 49, textureX, textureY); // Box 29
		gunModel[27] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 30
		gunModel[28] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 31
		gunModel[29] = new ModelRendererTurbo(this, 641, 65, textureX, textureY); // Box 32
		gunModel[30] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 33
		gunModel[31] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 34
		gunModel[32] = new ModelRendererTurbo(this, 593, 89, textureX, textureY); // Box 35
		gunModel[33] = new ModelRendererTurbo(this, 865, 65, textureX, textureY); // Box 37
		gunModel[34] = new ModelRendererTurbo(this, 913, 65, textureX, textureY); // Box 38
		gunModel[35] = new ModelRendererTurbo(this, 961, 65, textureX, textureY); // Box 39
		gunModel[36] = new ModelRendererTurbo(this, 993, 65, textureX, textureY); // Box 40
		gunModel[37] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 41
		gunModel[38] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 42
		gunModel[39] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 43
		gunModel[40] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 44
		gunModel[41] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 45
		gunModel[42] = new ModelRendererTurbo(this, 433, 113, textureX, textureY); // Box 46
		gunModel[43] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 47
		gunModel[44] = new ModelRendererTurbo(this, 425, 129, textureX, textureY); // Box 48
		gunModel[45] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 49
		gunModel[46] = new ModelRendererTurbo(this, 433, 145, textureX, textureY); // Box 50
		gunModel[47] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 51
		gunModel[48] = new ModelRendererTurbo(this, 433, 161, textureX, textureY); // Box 52
		gunModel[49] = new ModelRendererTurbo(this, 865, 89, textureX, textureY); // Box 54
		gunModel[50] = new ModelRendererTurbo(this, 921, 89, textureX, textureY); // Box 55
		gunModel[51] = new ModelRendererTurbo(this, 961, 113, textureX, textureY); // Box 56
		gunModel[52] = new ModelRendererTurbo(this, 865, 121, textureX, textureY); // Box 57
		gunModel[53] = new ModelRendererTurbo(this, 921, 129, textureX, textureY); // Box 58
		gunModel[54] = new ModelRendererTurbo(this, 961, 153, textureX, textureY); // Box 59
		gunModel[55] = new ModelRendererTurbo(this, 841, 161, textureX, textureY); // Box 60
		gunModel[56] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 61
		gunModel[57] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 75
		gunModel[58] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 76
		gunModel[59] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 77
		gunModel[60] = new ModelRendererTurbo(this, 169, 177, textureX, textureY); // Box 78
		gunModel[61] = new ModelRendererTurbo(this, 585, 177, textureX, textureY); // Box 79
		gunModel[62] = new ModelRendererTurbo(this, 641, 177, textureX, textureY); // Box 80
		gunModel[63] = new ModelRendererTurbo(this, 697, 177, textureX, textureY); // Box 81
		gunModel[64] = new ModelRendererTurbo(this, 753, 177, textureX, textureY); // Box 82
		gunModel[65] = new ModelRendererTurbo(this, 457, 249, textureX, textureY); // Box 105
		gunModel[66] = new ModelRendererTurbo(this, 889, 313, textureX, textureY); // Box 106
		gunModel[67] = new ModelRendererTurbo(this, 105, 289, textureX, textureY); // Box 107
		gunModel[68] = new ModelRendererTurbo(this, 257, 177, textureX, textureY); // Box 108
		gunModel[69] = new ModelRendererTurbo(this, 793, 177, textureX, textureY); // Box 109
		gunModel[70] = new ModelRendererTurbo(this, 977, 305, textureX, textureY); // Box 110
		gunModel[71] = new ModelRendererTurbo(this, 697, 329, textureX, textureY); // Box 111
		gunModel[72] = new ModelRendererTurbo(this, 369, 337, textureX, textureY); // Box 112
		gunModel[73] = new ModelRendererTurbo(this, 1, 337, textureX, textureY); // Box 113
		gunModel[74] = new ModelRendererTurbo(this, 833, 329, textureX, textureY); // Box 114
		gunModel[75] = new ModelRendererTurbo(this, 977, 329, textureX, textureY); // Box 115
		gunModel[76] = new ModelRendererTurbo(this, 89, 337, textureX, textureY); // Box 116
		gunModel[77] = new ModelRendererTurbo(this, 1009, 329, textureX, textureY); // Box 117
		gunModel[78] = new ModelRendererTurbo(this, 121, 337, textureX, textureY); // Box 118
		gunModel[79] = new ModelRendererTurbo(this, 137, 337, textureX, textureY); // Box 119
		gunModel[80] = new ModelRendererTurbo(this, 153, 337, textureX, textureY); // Box 120
		gunModel[81] = new ModelRendererTurbo(this, 169, 345, textureX, textureY); // Box 121
		gunModel[82] = new ModelRendererTurbo(this, 297, 345, textureX, textureY); // Box 122
		gunModel[83] = new ModelRendererTurbo(this, 329, 345, textureX, textureY); // Box 123
		gunModel[84] = new ModelRendererTurbo(this, 345, 345, textureX, textureY); // Box 124
		gunModel[85] = new ModelRendererTurbo(this, 689, 353, textureX, textureY); // Box 125
		gunModel[86] = new ModelRendererTurbo(this, 705, 353, textureX, textureY); // Box 126
		gunModel[87] = new ModelRendererTurbo(this, 721, 353, textureX, textureY); // Box 127
		gunModel[88] = new ModelRendererTurbo(this, 737, 353, textureX, textureY); // Box 128
		gunModel[89] = new ModelRendererTurbo(this, 649, 57, textureX, textureY); // Box 129
		gunModel[90] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 130
		gunModel[91] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 131
		gunModel[92] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 132
		gunModel[93] = new ModelRendererTurbo(this, 713, 57, textureX, textureY); // Box 133
		gunModel[94] = new ModelRendererTurbo(this, 1001, 17, textureX, textureY); // Box 134
		gunModel[95] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 135
		gunModel[96] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 136
		gunModel[97] = new ModelRendererTurbo(this, 609, 73, textureX, textureY); // Box 137
		gunModel[98] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 138
		gunModel[99] = new ModelRendererTurbo(this, 1001, 25, textureX, textureY); // Box 139
		gunModel[100] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 140
		gunModel[101] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Box 141
		gunModel[102] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Box 142
		gunModel[103] = new ModelRendererTurbo(this, 753, 353, textureX, textureY); // Box 143
		gunModel[104] = new ModelRendererTurbo(this, 1, 361, textureX, textureY); // Box 145
		gunModel[105] = new ModelRendererTurbo(this, 873, 361, textureX, textureY); // Box 146
		gunModel[106] = new ModelRendererTurbo(this, 361, 369, textureX, textureY); // Box 147
		gunModel[107] = new ModelRendererTurbo(this, 449, 369, textureX, textureY); // Box 148
		gunModel[108] = new ModelRendererTurbo(this, 529, 369, textureX, textureY); // Box 149
		gunModel[109] = new ModelRendererTurbo(this, 161, 377, textureX, textureY); // Box 150
		gunModel[110] = new ModelRendererTurbo(this, 49, 385, textureX, textureY); // Box 151
		gunModel[111] = new ModelRendererTurbo(this, 361, 385, textureX, textureY); // Box 152
		gunModel[112] = new ModelRendererTurbo(this, 513, 385, textureX, textureY); // Box 153
		gunModel[113] = new ModelRendererTurbo(this, 609, 369, textureX, textureY); // Box 154
		gunModel[114] = new ModelRendererTurbo(this, 993, 193, textureX, textureY); // Box 154
		gunModel[115] = new ModelRendererTurbo(this, 761, 273, textureX, textureY); // Box 155
		gunModel[116] = new ModelRendererTurbo(this, 241, 377, textureX, textureY); // Box 156
		gunModel[117] = new ModelRendererTurbo(this, 553, 97, textureX, textureY); // Box 157
		gunModel[118] = new ModelRendererTurbo(this, 905, 121, textureX, textureY); // Box 158
		gunModel[119] = new ModelRendererTurbo(this, 345, 177, textureX, textureY); // Box 160
		gunModel[120] = new ModelRendererTurbo(this, 217, 217, textureX, textureY); // Box 161
		gunModel[121] = new ModelRendererTurbo(this, 817, 377, textureX, textureY); // Box 162
		gunModel[122] = new ModelRendererTurbo(this, 753, 385, textureX, textureY); // Box 163
		gunModel[123] = new ModelRendererTurbo(this, 369, 313, textureX, textureY); // Box 164
		gunModel[124] = new ModelRendererTurbo(this, 49, 361, textureX, textureY); // Box 165
		gunModel[125] = new ModelRendererTurbo(this, 977, 281, textureX, textureY); // Box 166
		gunModel[126] = new ModelRendererTurbo(this, 153, 289, textureX, textureY); // Box 167
		gunModel[127] = new ModelRendererTurbo(this, 977, 377, textureX, textureY); // Box 168
		gunModel[128] = new ModelRendererTurbo(this, 889, 385, textureX, textureY); // Box 169

		gunModel[0].addBox(0F, 0F, 0F, 120, 1, 14, 0F); // Box 0
		gunModel[0].setRotationPoint(-337F, -122F, 1F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 120, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		gunModel[1].setRotationPoint(-337F, -122F, 15F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 120, 6, 6, 0F,0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		gunModel[2].setRotationPoint(-337F, -122F, -5F);

		gunModel[3].addBox(0F, 0F, 0F, 120, 14, 1, 0F); // Box 3
		gunModel[3].setRotationPoint(-337F, -116F, -5F);

		gunModel[4].addBox(0F, 0F, 0F, 120, 14, 1, 0F); // Box 4
		gunModel[4].setRotationPoint(-337F, -116F, 20F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 120, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 5
		gunModel[5].setRotationPoint(-337F, -102F, 15F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 120, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		gunModel[6].setRotationPoint(-337F, -102F, -5F);

		gunModel[7].addBox(0F, 0F, 0F, 120, 1, 14, 0F); // Box 7
		gunModel[7].setRotationPoint(-337F, -97F, 1F);

		gunModel[8].addBox(0F, 0F, 0F, 14, 33, 14, 0F); // Box 8
		gunModel[8].setRotationPoint(-351F, -130F, 1F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 14, 10, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		gunModel[9].setRotationPoint(-351F, -97F, 1F);

		gunModel[10].addBox(0F, 0F, 0F, 14, 17, 15, 0F); // Box 10
		gunModel[10].setRotationPoint(-351F, -117F, 15F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 14, 15, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 11
		gunModel[11].setRotationPoint(-351F, -117F, -14F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 14, 13, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		gunModel[12].setRotationPoint(-351F, -130F, 15F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 14, 13, 15, 0F,0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		gunModel[13].setRotationPoint(-351F, -130F, -14F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 14, 13, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F); // Box 15
		gunModel[14].setRotationPoint(-351F, -100F, 15F);

		gunModel[15].addBox(0F, 0F, 0F, 5, 1, 14, 0F); // Box 17
		gunModel[15].setRotationPoint(-337F, -122F, 1F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 14, 15, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 18
		gunModel[16].setRotationPoint(-351F, -101F, -14F);
		gunModel[16].rotateAngleX = 0.59341195F;

		gunModel[17].addShapeBox(0F, 0F, 0F, 5, 6, 14, 0F,0F, -6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		gunModel[17].setRotationPoint(-217F, -128F, 1F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 5, 7, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 20
		gunModel[18].setRotationPoint(-217F, -97F, 1F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 5, 14, 5, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		gunModel[19].setRotationPoint(-217F, -116F, -9F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 5, 14, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 22
		gunModel[20].setRotationPoint(-217F, -116F, 20F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 5, 12, 10, 0F,0F, -12F, -4F, 0F, -12F, 0F, 0F, -1F, 0F, 0F, -6F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		gunModel[21].setRotationPoint(-217F, -128F, -9F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 5, 12, 10, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 25
		gunModel[22].setRotationPoint(-217F, -102F, -9F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 5, 12, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, -4F); // Box 26
		gunModel[23].setRotationPoint(-217F, -102F, 15F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 5, 12, 10, 0F,0F, -6F, 0F, 0F, -1F, 0F, 0F, -12F, 0F, 0F, -12F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 27
		gunModel[24].setRotationPoint(-217F, -128F, 15F);

		gunModel[25].addBox(0F, 0F, 0F, 98, 1, 14, 0F); // Box 28
		gunModel[25].setRotationPoint(-212F, -127F, 1F);

		gunModel[26].addBox(0F, 0F, 0F, 98, 1, 14, 0F); // Box 29
		gunModel[26].setRotationPoint(-212F, -91F, 1F);

		gunModel[27].addBox(0F, 0F, 0F, 98, 14, 1, 0F); // Box 30
		gunModel[27].setRotationPoint(-212F, -116F, 24F);

		gunModel[28].addBox(0F, 0F, 0F, 98, 14, 1, 0F); // Box 31
		gunModel[28].setRotationPoint(-212F, -116F, -9F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 98, 12, 10, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		gunModel[29].setRotationPoint(-212F, -128F, 15F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 98, 12, 10, 0F,0F, -12F, 0F, 0F, -12F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		gunModel[30].setRotationPoint(-212F, -128F, -9F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 98, 12, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		gunModel[31].setRotationPoint(-212F, -102F, -9F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 98, 12, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F); // Box 35
		gunModel[32].setRotationPoint(-212F, -102F, 15F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 6, 9, 14, 0F,0F, -1F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		gunModel[33].setRotationPoint(-114F, -128F, 1F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 6, 9, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 38
		gunModel[34].setRotationPoint(-114F, -99F, 1F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 6, 14, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 39
		gunModel[35].setRotationPoint(-114F, -116F, 16F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 6, 14, 9, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		gunModel[36].setRotationPoint(-114F, -116F, -9F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 6, 12, 10, 0F,0F, -1F, 0F, 0F, -6F, 0F, 0F, -12F, -6F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 41
		gunModel[37].setRotationPoint(-114F, -128F, 15F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 6, 12, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -12F, -6F, 0F, -12F, 0F); // Box 42
		gunModel[38].setRotationPoint(-114F, -102F, 15F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 6, 12, 10, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -6F, -10F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 43
		gunModel[39].setRotationPoint(-114F, -102F, -9F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 6, 12, 10, 0F,0F, -12F, 0F, 0F, -12F, -6F, 0F, -6F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		gunModel[40].setRotationPoint(-114F, -128F, -9F);

		gunModel[41].addBox(0F, 0F, 0F, 208, 1, 14, 0F); // Box 45
		gunModel[41].setRotationPoint(-108F, -122F, 1F);

		gunModel[42].addBox(0F, 0F, 0F, 208, 1, 14, 0F); // Box 46
		gunModel[42].setRotationPoint(-108F, -97F, 1F);

		gunModel[43].addBox(0F, 0F, 0F, 208, 14, 1, 0F); // Box 47
		gunModel[43].setRotationPoint(-108F, -116F, -3F);

		gunModel[44].addBox(0F, 0F, 0F, 208, 14, 1, 0F); // Box 48
		gunModel[44].setRotationPoint(-108F, -116F, 18F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 208, 6, 4, 0F,0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		gunModel[45].setRotationPoint(-108F, -122F, -3F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 208, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		gunModel[46].setRotationPoint(-108F, -122F, 15F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 208, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 51
		gunModel[47].setRotationPoint(-108F, -102F, 15F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 208, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		gunModel[48].setRotationPoint(-108F, -102F, -3F);

		gunModel[49].addBox(0F, 0F, 0F, 10, 17, 14, 0F); // Box 54
		gunModel[49].setRotationPoint(100F, -138F, 1F);

		gunModel[50].addBox(0F, 0F, 0F, 10, 17, 14, 0F); // Box 55
		gunModel[50].setRotationPoint(100F, -97F, 1F);

		gunModel[51].addBox(0F, 0F, 0F, 10, 18, 15, 0F); // Box 56
		gunModel[51].setRotationPoint(100F, -118F, 18F);

		gunModel[52].addBox(0F, 0F, 0F, 10, 18, 15, 0F); // Box 57
		gunModel[52].setRotationPoint(100F, -118F, -17F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 10, 20, 18, 0F,0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		gunModel[53].setRotationPoint(100F, -138F, -17F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 10, 20, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		gunModel[54].setRotationPoint(100F, -138F, 15F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 10, 20, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F); // Box 60
		gunModel[55].setRotationPoint(100F, -100F, 15F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 10, 20, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		gunModel[56].setRotationPoint(100F, -100F, -17F);

		gunModel[57].addBox(0F, 0F, 0F, 20, 1, 14, 0F); // Box 75
		gunModel[57].setRotationPoint(-102F, -123F, 1F);

		gunModel[58].addBox(0F, 0F, 0F, 20, 1, 14, 0F); // Box 76
		gunModel[58].setRotationPoint(-102F, -96F, 1F);

		gunModel[59].addBox(0F, 0F, 0F, 20, 14, 1, 0F); // Box 77
		gunModel[59].setRotationPoint(-102F, -116F, -4F);

		gunModel[60].addBox(0F, 0F, 0F, 20, 14, 1, 0F); // Box 78
		gunModel[60].setRotationPoint(-102F, -116F, 19F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 20, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		gunModel[61].setRotationPoint(-102F, -123F, 15F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 20, 7, 5, 0F,0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		gunModel[62].setRotationPoint(-102F, -123F, -4F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 20, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		gunModel[63].setRotationPoint(-102F, -102F, -4F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 20, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F); // Box 82
		gunModel[64].setRotationPoint(-102F, -102F, 15F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 29, 6, 14, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 105
		gunModel[65].setRotationPoint(-191F, -90F, 1F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 26, 28, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 106
		gunModel[66].setRotationPoint(-191F, -84F, 1F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 14, 12, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F); // Box 107
		gunModel[67].setRotationPoint(-185F, -56F, 1F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 2, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 108
		gunModel[68].setRotationPoint(-181F, -44F, 1F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 2, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 109
		gunModel[69].setRotationPoint(-174F, -44F, 1F);

		gunModel[70].addBox(0F, 0F, 0F, 5, 3, 14, 0F); // Box 110
		gunModel[70].setRotationPoint(-179F, -44F, 1F);

		gunModel[71].addBox(0F, 0F, 0F, 51, 9, 14, 0F); // Box 111
		gunModel[71].setRotationPoint(-166F, -90F, 1F);

		gunModel[72].addBox(0F, 0F, 0F, 142, 16, 14, 0F); // Box 112
		gunModel[72].setRotationPoint(-120F, -97F, 1F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 27, 8, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F); // Box 113
		gunModel[73].setRotationPoint(-99F, -81F, 1F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 17, 38, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		gunModel[74].setRotationPoint(-51F, -81F, 4F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 13, 38, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		gunModel[75].setRotationPoint(-49F, -81F, 12F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 13, 38, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		gunModel[76].setRotationPoint(-49F, -81F, 2F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 2, 38, 2, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		gunModel[77].setRotationPoint(-36F, -81F, 2F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 2, 38, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 118
		gunModel[78].setRotationPoint(-36F, -81F, 12F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 2, 38, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 119
		gunModel[79].setRotationPoint(-51F, -81F, 12F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 2, 38, 2, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		gunModel[80].setRotationPoint(-51F, -81F, 2F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 48, 17, 14, 0F,0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		gunModel[81].setRotationPoint(22F, -98F, 1F);

		gunModel[82].addBox(0F, 0F, 0F, 4, 50, 10, 0F); // Box 122
		gunModel[82].setRotationPoint(60F, -81F, 3F);

		gunModel[83].addBox(0F, 0F, 0F, 3, 50, 4, 0F); // Box 123
		gunModel[83].setRotationPoint(64F, -81F, 6F);

		gunModel[84].addBox(0F, 0F, 0F, 3, 50, 4, 0F); // Box 124
		gunModel[84].setRotationPoint(57F, -81F, 6F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 3, 50, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 125
		gunModel[85].setRotationPoint(64F, -81F, 10F);

		gunModel[86].addShapeBox(0F, 0F, 0F, 3, 50, 3, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		gunModel[86].setRotationPoint(64F, -81F, 3F);

		gunModel[87].addShapeBox(0F, 0F, 0F, 3, 50, 3, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		gunModel[87].setRotationPoint(57F, -81F, 3F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 3, 50, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 128
		gunModel[88].setRotationPoint(57F, -81F, 10F);

		gunModel[89].addShapeBox(0F, 0F, 0F, 24, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		gunModel[89].setRotationPoint(-43F, -70F, 6F);

		gunModel[90].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 130
		gunModel[90].setRotationPoint(-19F, -71F, 6F);

		gunModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 131
		gunModel[91].setRotationPoint(-17F, -71F, 6F);

		gunModel[92].addShapeBox(0F, 0F, 0F, 1, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		gunModel[92].setRotationPoint(-17F, -81F, 6F);

		gunModel[93].addShapeBox(0F, 0F, 0F, 20, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		gunModel[93].setRotationPoint(-35F, -81F, 6F);

		gunModel[94].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 134
		gunModel[94].setRotationPoint(-19F, -80F, 6F);

		gunModel[95].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		gunModel[95].setRotationPoint(-29F, -80F, 6F);

		gunModel[96].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 136
		gunModel[96].setRotationPoint(-32F, -80F, 6F);

		gunModel[97].addShapeBox(0F, 0F, 0F, 2, 11, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		gunModel[97].setRotationPoint(-34F, -80F, 6F);

		gunModel[98].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		gunModel[98].setRotationPoint(-32F, -72F, 6F);

		gunModel[99].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		gunModel[99].setRotationPoint(-29F, -71F, 6F);

		gunModel[100].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		gunModel[100].setRotationPoint(-29F, -79F, 7.5F);

		gunModel[101].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 141
		gunModel[101].setRotationPoint(-29F, -76F, 7.5F);

		gunModel[102].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F); // Box 142
		gunModel[102].setRotationPoint(-28F, -73F, 7.5F);

		gunModel[103].addBox(0F, 0F, 0F, 18, 4, 20, 0F); // Box 143
		gunModel[103].setRotationPoint(-23F, -85F, 13F);

		gunModel[104].addShapeBox(0F, 0F, 0F, 18, 33, 4, 0F,10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, 10F, 10F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		gunModel[104].setRotationPoint(-23F, -118F, 29F);

		gunModel[105].addBox(0F, 0F, 0F, 36, 2, 16, 0F); // Box 146
		gunModel[105].setRotationPoint(-51F, -120F, 33F);

		gunModel[106].addShapeBox(0F, 0F, 0F, 36, 5, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		gunModel[106].setRotationPoint(-51F, -123F, 27F);

		gunModel[107].addShapeBox(0F, 0F, 0F, 36, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		gunModel[107].setRotationPoint(-51F, -137F, 27F);

		gunModel[108].addShapeBox(0F, 0F, 0F, 36, 5, 6, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 149
		gunModel[108].setRotationPoint(-51F, -123F, 49F);

		gunModel[109].addShapeBox(0F, 0F, 0F, 36, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		gunModel[109].setRotationPoint(-51F, -137F, 53F);

		gunModel[110].addShapeBox(0F, 0F, 0F, 36, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 151
		gunModel[110].setRotationPoint(-51F, -142F, 49F);

		gunModel[111].addShapeBox(0F, 0F, 0F, 36, 5, 6, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 152
		gunModel[111].setRotationPoint(-51F, -142F, 27F);

		gunModel[112].addBox(0F, 0F, 0F, 36, 2, 16, 0F); // Box 153
		gunModel[112].setRotationPoint(-51F, -142F, 33F);

		gunModel[113].addShapeBox(0F, 0F, 0F, 10, 2, 16, 0F,0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, 0F, 0F); // Box 154
		gunModel[113].setRotationPoint(-15F, -142F, 33F);

		gunModel[114].addShapeBox(0F, 0F, 0F, 10, 14, 2, 0F,0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 154
		gunModel[114].setRotationPoint(-15F, -137F, 53F);

		gunModel[115].addShapeBox(0F, 0F, 0F, 10, 14, 2, 0F,0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 2F, 0F, 0F, 0F); // Box 155
		gunModel[115].setRotationPoint(-15F, -137F, 27F);

		gunModel[116].addShapeBox(0F, 0F, 0F, 10, 2, 16, 0F,0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 156
		gunModel[116].setRotationPoint(-15F, -120F, 33F);

		gunModel[117].addShapeBox(0F, 0F, 0F, 10, 5, 6, 0F,0F, -5F, 0F, 0F, -7F, -2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 2F, -4F, 0F, -1F, 2F, 0F, -3F, 0F); // Box 157
		gunModel[117].setRotationPoint(-15F, -142F, 27F);

		gunModel[118].addShapeBox(0F, 0F, 0F, 10, 5, 6, 0F,0F, 0F, 0F, 0F, -2F, 2F, 0F, -7F, -2F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, -1F, 2F, 0F, 2F, -4F, 0F, 0F, -2F); // Box 158
		gunModel[118].setRotationPoint(-15F, -142F, 49F);

		gunModel[119].addShapeBox(0F, 0F, 0F, 10, 5, 6, 0F,0F, -3F, 0F, 0F, -1F, 2F, 0F, 2F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -7F, -2F, 0F, -5F, 0F); // Box 160
		gunModel[119].setRotationPoint(-15F, -123F, 49F);

		gunModel[120].addShapeBox(0F, 0F, 0F, 10, 5, 6, 0F,0F, 0F, -2F, 0F, 2F, -4F, 0F, -1F, 2F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -7F, -2F, 0F, -2F, 2F, 0F, 0F, 0F); // Box 161
		gunModel[120].setRotationPoint(-15F, -123F, 27F);

		gunModel[121].addShapeBox(0F, 0F, 0F, 16, 2, 16, 0F,0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F); // Box 162
		gunModel[121].setRotationPoint(-67F, -142F, 33F);

		gunModel[122].addShapeBox(0F, 0F, 0F, 16, 2, 16, 0F,0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F); // Box 163
		gunModel[122].setRotationPoint(-67F, -120F, 33F);

		gunModel[123].addShapeBox(0F, 0F, 0F, 16, 14, 2, 0F,0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F); // Box 164
		gunModel[123].setRotationPoint(-67F, -137F, 53F);

		gunModel[124].addShapeBox(0F, 0F, 0F, 16, 14, 2, 0F,0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F); // Box 165
		gunModel[124].setRotationPoint(-67F, -137F, 27F);

		gunModel[125].addShapeBox(0F, 0F, 0F, 16, 5, 6, 0F,0F, -2F, 2F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -7F, -2F, 0F, -1F, 2F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, 2F, -4F); // Box 166
		gunModel[125].setRotationPoint(-67F, -142F, 49F);

		gunModel[126].addShapeBox(0F, 0F, 0F, 16, 5, 6, 0F,0F, -1F, 2F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, 2F, -4F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -7F, -2F); // Box 167
		gunModel[126].setRotationPoint(-67F, -123F, 49F);

		gunModel[127].addShapeBox(0F, 0F, 0F, 16, 5, 6, 0F,0F, 2F, -4F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, -1F, 2F, 0F, -7F, -2F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 2F); // Box 168
		gunModel[127].setRotationPoint(-67F, -123F, 27F);

		gunModel[128].addShapeBox(0F, 0F, 0F, 16, 5, 6, 0F,0F, -7F, -2F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, 2F, -4F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, -1F, 2F); // Box 169
		gunModel[128].setRotationPoint(-67F, -142F, 27F);
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 65, 177, textureX, textureY); // Box 62
		ammoModel[1] = new ModelRendererTurbo(this, 129, 177, textureX, textureY); // Box 63
		ammoModel[2] = new ModelRendererTurbo(this, 817, 89, textureX, textureY); // Box 64
		ammoModel[3] = new ModelRendererTurbo(this, 977, 89, textureX, textureY); // Box 65
		ammoModel[4] = new ModelRendererTurbo(this, 881, 161, textureX, textureY); // Box 66
		ammoModel[5] = new ModelRendererTurbo(this, 913, 169, textureX, textureY); // Box 67
		ammoModel[6] = new ModelRendererTurbo(this, 41, 177, textureX, textureY); // Box 68
		ammoModel[7] = new ModelRendererTurbo(this, 105, 177, textureX, textureY); // Box 69
		ammoModel[8] = new ModelRendererTurbo(this, 193, 177, textureX, textureY); // Box 70
		ammoModel[9] = new ModelRendererTurbo(this, 281, 177, textureX, textureY); // Box 71
		ammoModel[10] = new ModelRendererTurbo(this, 369, 177, textureX, textureY); // Box 72
		ammoModel[11] = new ModelRendererTurbo(this, 441, 177, textureX, textureY); // Box 73
		ammoModel[12] = new ModelRendererTurbo(this, 513, 177, textureX, textureY); // Box 74
		ammoModel[13] = new ModelRendererTurbo(this, 585, 193, textureX, textureY); // Box 84
		ammoModel[14] = new ModelRendererTurbo(this, 657, 193, textureX, textureY); // Box 85
		ammoModel[15] = new ModelRendererTurbo(this, 729, 193, textureX, textureY); // Box 80
		ammoModel[16] = new ModelRendererTurbo(this, 345, 209, textureX, textureY); // Box 81
		ammoModel[17] = new ModelRendererTurbo(this, 777, 209, textureX, textureY); // Box 82
		ammoModel[18] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 83
		ammoModel[19] = new ModelRendererTurbo(this, 561, 233, textureX, textureY); // Box 84
		ammoModel[20] = new ModelRendererTurbo(this, 233, 249, textureX, textureY); // Box 85
		ammoModel[21] = new ModelRendererTurbo(this, 801, 249, textureX, textureY); // Box 86
		ammoModel[22] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 87
		ammoModel[23] = new ModelRendererTurbo(this, 441, 273, textureX, textureY); // Box 88
		ammoModel[24] = new ModelRendererTurbo(this, 665, 273, textureX, textureY); // Box 89
		ammoModel[25] = new ModelRendererTurbo(this, 201, 281, textureX, textureY); // Box 90
		ammoModel[26] = new ModelRendererTurbo(this, 241, 217, textureX, textureY); // Box 91
		ammoModel[27] = new ModelRendererTurbo(this, 321, 281, textureX, textureY); // Box 92
		ammoModel[28] = new ModelRendererTurbo(this, 785, 281, textureX, textureY); // Box 93
		ammoModel[29] = new ModelRendererTurbo(this, 889, 281, textureX, textureY); // Box 94
		ammoModel[30] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Box 95
		ammoModel[31] = new ModelRendererTurbo(this, 409, 305, textureX, textureY); // Box 96
		ammoModel[32] = new ModelRendererTurbo(this, 513, 313, textureX, textureY); // Box 97
		ammoModel[33] = new ModelRendererTurbo(this, 705, 313, textureX, textureY); // Box 98
		ammoModel[34] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Box 99
		ammoModel[35] = new ModelRendererTurbo(this, 177, 321, textureX, textureY); // Box 100
		ammoModel[36] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 101
		ammoModel[37] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Box 102
		ammoModel[38] = new ModelRendererTurbo(this, 801, 201, textureX, textureY); // Box 103
		ammoModel[39] = new ModelRendererTurbo(this, 585, 225, textureX, textureY); // Box 104
		ammoModel[40] = new ModelRendererTurbo(this, 513, 313, textureX, textureY); // Box 169

		ammoModel[0].addShapeBox(0F, 0F, 0F, 8, 8, 20, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		ammoModel[0].setRotationPoint(110F, -126F, -2F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 8, 8, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 63
		ammoModel[1].setRotationPoint(110F, -100F, -2F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 8, 16, 7, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		ammoModel[2].setRotationPoint(110F, -117F, -9F);

		ammoModel[3].addShapeBox(0F, 0F, 0F, 8, 16, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 65
		ammoModel[3].setRotationPoint(110F, -117F, 18F);

		ammoModel[4].addShapeBox(0F, 0F, 0F, 8, 9, 7, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -9F, -3F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 66
		ammoModel[4].setRotationPoint(110F, -126F, 18F);

		ammoModel[5].addShapeBox(0F, 0F, 0F, 8, 9, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -7F, 0F, 0F, -7F); // Box 67
		ammoModel[5].setRotationPoint(110F, -101F, 18F);

		ammoModel[6].addShapeBox(0F, 0F, 0F, 8, 9, 7, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, -3F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 68
		ammoModel[6].setRotationPoint(110F, -101F, -9F);

		ammoModel[7].addShapeBox(0F, 0F, 0F, 8, 9, 7, 0F,0F, -9F, 0F, 0F, -9F, -3F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		ammoModel[7].setRotationPoint(110F, -126F, -9F);

		ammoModel[8].addShapeBox(0F, 0F, 0F, 20, 16, 20, 0F,0F, -12F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		ammoModel[8].setRotationPoint(118F, -134F, -2F);

		ammoModel[9].addShapeBox(0F, 0F, 0F, 20, 16, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F); // Box 71
		ammoModel[9].setRotationPoint(118F, -100F, -2F);

		ammoModel[10].addShapeBox(0F, 0F, 0F, 20, 14, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 72
		ammoModel[10].setRotationPoint(118F, -116F, 18F);

		ammoModel[11].addShapeBox(0F, 0F, 0F, 20, 14, 12, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		ammoModel[11].setRotationPoint(118F, -116F, -14F);

		ammoModel[12].addShapeBox(0F, 0F, 0F, 20, 16, 12, 0F,0F, -15F, -8F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		ammoModel[12].setRotationPoint(118F, -132F, -14F);

		ammoModel[13].addShapeBox(0F, 0F, 0F, 20, 16, 12, 0F,0F, -10F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -15F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 84
		ammoModel[13].setRotationPoint(118F, -132F, 18F);

		ammoModel[14].addShapeBox(0F, 0F, 0F, 20, 18, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, -17F, -8F); // Box 85
		ammoModel[14].setRotationPoint(118F, -102F, 18F);

		ammoModel[15].addShapeBox(0F, 0F, 0F, 20, 18, 12, 0F,0F, -1F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, -12F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, -12F, 0F); // Box 80
		ammoModel[15].setRotationPoint(118F, -102F, -14F);

		ammoModel[16].addShapeBox(0F, 0F, 0F, 96, 16, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		ammoModel[16].setRotationPoint(138F, -132F, -2F);

		ammoModel[17].addShapeBox(0F, 0F, 0F, 96, 18, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		ammoModel[17].setRotationPoint(138F, -102F, -2F);

		ammoModel[18].addShapeBox(0F, 0F, 0F, 96, 14, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		ammoModel[18].setRotationPoint(138F, -116F, 8F);

		ammoModel[19].addShapeBox(0F, 0F, 0F, 96, 14, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		ammoModel[19].setRotationPoint(138F, -116F, -14F);

		ammoModel[20].addShapeBox(0F, 0F, 0F, 96, 16, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		ammoModel[20].setRotationPoint(138F, -132F, 18F);

		ammoModel[21].addShapeBox(0F, 0F, 0F, 96, 18, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, -4F); // Box 86
		ammoModel[21].setRotationPoint(138F, -102F, 18F);

		ammoModel[22].addShapeBox(0F, 0F, 0F, 96, 18, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, -4F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		ammoModel[22].setRotationPoint(138F, -102F, -14F);

		ammoModel[23].addShapeBox(0F, 0F, 0F, 96, 16, 12, 0F,0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		ammoModel[23].setRotationPoint(138F, -132F, -14F);

		ammoModel[24].addShapeBox(0F, 0F, 0F, 37, 18, 20, 0F,0F, 0F, 0F, 0F, -17F, -7F, 0F, -17F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 89
		ammoModel[24].setRotationPoint(234F, -132F, -2F);

		ammoModel[25].addShapeBox(0F, 0F, 0F, 37, 18, 20, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, -7F, 0F, -18F, -7F, 0F, 0F, 0F); // Box 90
		ammoModel[25].setRotationPoint(234F, -102F, -2F);

		ammoModel[26].addShapeBox(0F, 0F, 0F, 37, 13, 12, 0F,0F, 0F, 0F, 0F, -3F, 5F, 0F, -3F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 5F, 0F, -3F, -16F, 0F, 0F, 0F); // Box 91
		ammoModel[26].setRotationPoint(234F, -115F, 18F);

		ammoModel[27].addShapeBox(0F, 0F, 0F, 37, 13, 12, 0F,0F, 0F, 0F, 0F, -3F, -16F, 0F, -3F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -16F, 0F, -3F, 5F, 0F, 0F, 0F); // Box 92
		ammoModel[27].setRotationPoint(234F, -115F, -14F);

		ammoModel[28].addShapeBox(0F, 0F, 0F, 37, 17, 12, 0F,0F, -12F, 0F, 0F, -17F, -19F, 0F, -17F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -16F, 0F, 3F, 4F, 0F, 0F, 0F); // Box 93
		ammoModel[28].setRotationPoint(234F, -132F, -14F);

		ammoModel[29].addShapeBox(0F, 0F, 0F, 37, 18, 12, 0F,0F, 0F, 0F, 0F, 3F, -16F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -18F, -19F, 0F, -18F, 7F, 0F, 0F, 0F); // Box 94
		ammoModel[29].setRotationPoint(234F, -102F, -14F);

		ammoModel[30].addShapeBox(0F, 0F, 0F, 37, 18, 12, 0F,0F, 0F, 0F, 0F, 0F, 7F, 0F, 3F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 7F, 0F, -21F, -16F, 0F, -12F, 0F); // Box 95
		ammoModel[30].setRotationPoint(234F, -102F, 18F);

		ammoModel[31].addShapeBox(0F, 0F, 0F, 37, 17, 12, 0F,0F, 0F, 0F, 0F, -17F, 7F, 0F, -17F, -19F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 3F, -16F, 0F, 0F, 0F); // Box 96
		ammoModel[31].setRotationPoint(234F, -132F, 18F);

		ammoModel[32].addBox(0F, 0F, 0F, 89, 11, 6, 0F); // Box 97
		ammoModel[32].setRotationPoint(271F, -115F, 5F);

		ammoModel[33].addBox(0F, 0F, 0F, 89, 2, 6, 0F); // Box 98
		ammoModel[33].setRotationPoint(271F, -104F, 5F);

		ammoModel[34].addBox(0F, 0F, 0F, 89, 7, 1, 0F); // Box 99
		ammoModel[34].setRotationPoint(271F, -112F, 13F);

		ammoModel[35].addBox(0F, 0F, 0F, 89, 7, 11, 0F); // Box 100
		ammoModel[35].setRotationPoint(271F, -112F, 2F);

		ammoModel[36].addShapeBox(0F, 0F, 0F, 89, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		ammoModel[36].setRotationPoint(271F, -115F, 11F);

		ammoModel[37].addShapeBox(0F, 0F, 0F, 89, 3, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		ammoModel[37].setRotationPoint(271F, -115F, 2F);

		ammoModel[38].addShapeBox(0F, 0F, 0F, 89, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		ammoModel[38].setRotationPoint(271F, -105F, 2F);

		ammoModel[39].addShapeBox(0F, 0F, 0F, 89, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 104
		ammoModel[39].setRotationPoint(271F, -105F, 11F);

		ammoModel[40].addShapeBox(0F, 0F, 0F, 89, 11, 6, 0F,120F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 120F, 0F, 3F, 120F, 2F, 3F, 0F, 2F, 3F, 0F, 2F, 3F, 120F, 2F, 3F); // Box 169
		ammoModel[40].setRotationPoint(25F, -115F, 5F);
		

		translateAll(-30F, 25F, -40F);
		
		animationType = EnumAnimationType.END_LOADED;
	}
}