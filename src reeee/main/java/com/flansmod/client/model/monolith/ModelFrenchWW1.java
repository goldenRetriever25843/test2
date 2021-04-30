//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 06.03.2016 - 22:22:54
// Last changed on: 06.03.2016 - 22:22:54

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelFrenchWW1 extends ModelCustomArmour //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelFrenchWW1() //Same as Filename
	{
		headModel = new ModelRendererTurbo[16];
		bodyModel = new ModelRendererTurbo[136];
		leftArmModel = new ModelRendererTurbo[3];
		rightArmModel = new ModelRendererTurbo[3];
		leftLegModel = new ModelRendererTurbo[6];
		rightLegModel = new ModelRendererTurbo[6];

		initheadModel_1();
		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 321, 139, textureX, textureY); // Import Box4
		headModel[1] = new ModelRendererTurbo(this, 435, 429, textureX, textureY); // Import Box6
		headModel[2] = new ModelRendererTurbo(this, 458, 423, textureX, textureY); // Import Box7
		headModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		headModel[4] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 138
		headModel[5] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 139
		headModel[6] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 140
		headModel[7] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 141
		headModel[8] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 142
		headModel[9] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 143
		headModel[10] = new ModelRendererTurbo(this, 314, 136, textureX, textureY); // Box 144
		headModel[11] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 199
		headModel[12] = new ModelRendererTurbo(this, 427, 433, textureX, textureY); // Box 200
		headModel[13] = new ModelRendererTurbo(this, 417, 437, textureX, textureY); // Box 203
		headModel[14] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 213
		headModel[15] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 214

		headModel[0].addShapeBox(-4F, -6.2F, -5F, 4, 1, 5, 0F,0.2F, -0.2F, -0.55F, 0F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, -0.55F, 0F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Import Box4
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -5.25F, -6F, 4, 1, 2, 0F,0.2F, -0.4F, -0.7F, 0F, -0.4F, 0.5F, 0F, -0.2F, 0F, 0.2F, -0.2F, 1F, 0.2F, -0.3F, 0F, 0F, -0.2F, 0.7F, 0F, -0.4F, 0F, 0.2F, -0.6F, 0.5F); // Import Box6
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(0F, -5.25F, -6F, 4, 1, 2, 0F,0F, -0.4F, 0.5F, 0.2F, -0.4F, -0.7F, 0.2F, -0.2F, 1F, 0F, -0.2F, 0F, 0F, -0.2F, 0.7F, 0.2F, -0.3F, 0F, 0.2F, -0.6F, 0.5F, 0F, -0.4F, 0F); // Import Box7
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -8F, -4F, 4, 3, 4, 0F,-0.15F, 0.6F, 0F, 0F, 0.7F, 0.2F, 0F, 0.8F, 0F, 0F, 0.6F, 0F, 0.2F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Import Box0
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4.25F, -5.8F, -0.85F, 1, 1, 1, 0F,0.05F, 0F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, 0.05F, 0F, -0.22F, 0.05F, -0.82F, -0.22F, 0F, -0.82F, -0.22F, 0F, -0.8F, -0.22F, 0.05F, -0.82F, -0.22F); // Box 138
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4.25F, -5.97F, -0.85F, 1, 1, 1, 0F,0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0.05F, -0.82F, -0.22F, 0F, -0.82F, -0.22F, 0F, -0.8F, -0.22F, 0.05F, -0.82F, -0.22F); // Box 139
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4.25F, -6.45F, -0.85F, 1, 1, 1, 0F,0.05F, -0.82F, -0.22F, 0F, -0.82F, -0.22F, 0F, -0.8F, -0.22F, 0.05F, -0.82F, -0.22F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F); // Box 140
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(3.25F, -5.97F, -0.85F, 1, 1, 1, 0F,0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0.05F, -0.82F, -0.22F, 0F, -0.82F, -0.22F, 0F, -0.8F, -0.22F, 0.05F, -0.82F, -0.22F); // Box 141
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(3.25F, -5.8F, -0.85F, 1, 1, 1, 0F,0.05F, 0F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, 0.05F, 0F, -0.22F, 0.05F, -0.82F, -0.22F, 0F, -0.82F, -0.22F, 0F, -0.8F, -0.22F, 0.05F, -0.82F, -0.22F); // Box 142
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(3.25F, -6.45F, -0.85F, 1, 1, 1, 0F,0.05F, -0.82F, -0.22F, 0F, -0.82F, -0.22F, 0F, -0.8F, -0.22F, 0.05F, -0.82F, -0.22F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F); // Box 143
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(0F, -6.2F, -5F, 4, 1, 5, 0F,0F, -0.2F, 0F, 0.2F, -0.2F, -0.55F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0.2F, -0.2F, -0.55F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 144
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(0F, -8F, -4F, 4, 3, 4, 0F,0F, 0.7F, 0.2F, -0.15F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.8F, 0F, 0F, 0F, 1F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 199
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-4F, -5F, -1.6F, 4, 5, 1, 0F,0.05F, 0F, -0.4F, 0.05F, 0F, -0.4F, 0.05F, 0F, -0.2F, 0.05F, 0F, -0.2F, 0.05F, 0.05F, 2.2F, 0F, 0.2F, 2.2F, 0F, 0.2F, -2.8F, 0.05F, 0.05F, -2.8F); // Box 200
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(0F, -5F, -1.6F, 4, 5, 1, 0F,0.05F, 0F, -0.4F, 0.05F, 0F, -0.4F, 0.05F, 0F, -0.2F, 0.05F, 0F, -0.2F, 0F, 0.2F, 2.2F, 0.05F, 0.05F, 2.2F, 0.05F, 0.05F, -2.8F, 0F, 0.2F, -2.8F); // Box 203
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(0F, -8F, 0F, 4, 3, 4, 0F,0F, 0.8F, 0F, 0F, 0.6F, 0F, 0F, 0.2F, -0.1F, 0F, 0.6F, -0.15F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.1F, 0F, 0.2F, 0.4F); // Box 213
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-4F, -8F, 0F, 4, 3, 4, 0F,0F, 0.6F, 0F, 0F, 0.8F, 0F, 0F, 0.6F, -0.15F, 0F, 0.2F, -0.1F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.4F, 0.2F, 0F, 0.1F); // Box 214
		headModel[15].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 431, 486, textureX, textureY); // Box 105
		bodyModel[1] = new ModelRendererTurbo(this, 463, 469, textureX, textureY); // Box 111
		bodyModel[2] = new ModelRendererTurbo(this, 282, 382, textureX, textureY); // Box 112
		bodyModel[3] = new ModelRendererTurbo(this, 440, 483, textureX, textureY); // Box 112
		bodyModel[4] = new ModelRendererTurbo(this, 453, 294, textureX, textureY); // Box 113
		bodyModel[5] = new ModelRendererTurbo(this, 405, 177, textureX, textureY); // Box 114
		bodyModel[6] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 115
		bodyModel[7] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 116
		bodyModel[8] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 116
		bodyModel[9] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 117
		bodyModel[10] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 118
		bodyModel[11] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 118
		bodyModel[12] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 119
		bodyModel[13] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 120
		bodyModel[14] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 120
		bodyModel[15] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 121
		bodyModel[16] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 121
		bodyModel[17] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 122
		bodyModel[18] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 122
		bodyModel[19] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 123
		bodyModel[20] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 123
		bodyModel[21] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 125
		bodyModel[22] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 126
		bodyModel[23] = new ModelRendererTurbo(this, 420, 143, textureX, textureY); // Box 127
		bodyModel[24] = new ModelRendererTurbo(this, 308, 387, textureX, textureY); // Box 129
		bodyModel[25] = new ModelRendererTurbo(this, 333, 389, textureX, textureY); // Box 130
		bodyModel[26] = new ModelRendererTurbo(this, 345, 387, textureX, textureY); // Box 131
		bodyModel[27] = new ModelRendererTurbo(this, 339, 16, textureX, textureY); // Box 138
		bodyModel[28] = new ModelRendererTurbo(this, 392, 234, textureX, textureY); // Box 140
		bodyModel[29] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 154
		bodyModel[30] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 155
		bodyModel[31] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 156
		bodyModel[32] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 157
		bodyModel[33] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 159
		bodyModel[34] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 165
		bodyModel[35] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 166
		bodyModel[36] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 167
		bodyModel[37] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 168
		bodyModel[38] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 169
		bodyModel[39] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 172
		bodyModel[40] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 173
		bodyModel[41] = new ModelRendererTurbo(this, 320, 388, textureX, textureY); // Box 176
		bodyModel[42] = new ModelRendererTurbo(this, 314, 396, textureX, textureY); // Box 177
		bodyModel[43] = new ModelRendererTurbo(this, 331, 396, textureX, textureY); // Box 178
		bodyModel[44] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 71
		bodyModel[45] = new ModelRendererTurbo(this, 106, 113, textureX, textureY); // Box 72
		bodyModel[46] = new ModelRendererTurbo(this, 281, 387, textureX, textureY); // Box 78
		bodyModel[47] = new ModelRendererTurbo(this, 291, 388, textureX, textureY); // Box 79
		bodyModel[48] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 80
		bodyModel[49] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 81
		bodyModel[50] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 82
		bodyModel[51] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 83
		bodyModel[52] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 84
		bodyModel[53] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 85
		bodyModel[54] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 86
		bodyModel[55] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 87
		bodyModel[56] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 88
		bodyModel[57] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 90
		bodyModel[58] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 91
		bodyModel[59] = new ModelRendererTurbo(this, 417, 307, textureX, textureY); // Box 91
		bodyModel[60] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 92
		bodyModel[61] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 93
		bodyModel[62] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 94
		bodyModel[63] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 95
		bodyModel[64] = new ModelRendererTurbo(this, 374, 96, textureX, textureY); // Box 97
		bodyModel[65] = new ModelRendererTurbo(this, 366, 106, textureX, textureY); // Box 98
		bodyModel[66] = new ModelRendererTurbo(this, 454, 391, textureX, textureY); // Box 99
		bodyModel[67] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 145
		bodyModel[68] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 146
		bodyModel[69] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 133
		bodyModel[70] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 133
		bodyModel[71] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 135
		bodyModel[72] = new ModelRendererTurbo(this, 339, 16, textureX, textureY); // Box 136
		bodyModel[73] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 138
		bodyModel[74] = new ModelRendererTurbo(this, 106, 113, textureX, textureY); // Box 139
		bodyModel[75] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 140
		bodyModel[76] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 141
		bodyModel[77] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 142
		bodyModel[78] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 143
		bodyModel[79] = new ModelRendererTurbo(this, 506, 1, textureX, textureY); // Box 144
		bodyModel[80] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 145
		bodyModel[81] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 146
		bodyModel[82] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 147
		bodyModel[83] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 148
		bodyModel[84] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 149
		bodyModel[85] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 150
		bodyModel[86] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 151
		bodyModel[87] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 152
		bodyModel[88] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 153
		bodyModel[89] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 154
		bodyModel[90] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 155
		bodyModel[91] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 156
		bodyModel[92] = new ModelRendererTurbo(this, 454, 391, textureX, textureY); // Box 160
		bodyModel[93] = new ModelRendererTurbo(this, 403, 208, textureX, textureY); // Box 161
		bodyModel[94] = new ModelRendererTurbo(this, 454, 391, textureX, textureY); // Box 162
		bodyModel[95] = new ModelRendererTurbo(this, 420, 220, textureX, textureY); // Box 163
		bodyModel[96] = new ModelRendererTurbo(this, 454, 391, textureX, textureY); // Box 164
		bodyModel[97] = new ModelRendererTurbo(this, 454, 391, textureX, textureY); // Box 165
		bodyModel[98] = new ModelRendererTurbo(this, 446, 404, textureX, textureY); // Box 166
		bodyModel[99] = new ModelRendererTurbo(this, 423, 393, textureX, textureY); // Box 167
		bodyModel[100] = new ModelRendererTurbo(this, 429, 487, textureX, textureY); // Box 168
		bodyModel[101] = new ModelRendererTurbo(this, 106, 113, textureX, textureY); // Box 169
		bodyModel[102] = new ModelRendererTurbo(this, 106, 113, textureX, textureY); // Box 170
		bodyModel[103] = new ModelRendererTurbo(this, 392, 234, textureX, textureY); // Box 171
		bodyModel[104] = new ModelRendererTurbo(this, 440, 483, textureX, textureY); // Box 172
		bodyModel[105] = new ModelRendererTurbo(this, 366, 106, textureX, textureY); // Box 173
		bodyModel[106] = new ModelRendererTurbo(this, 435, 395, textureX, textureY); // Box 174
		bodyModel[107] = new ModelRendererTurbo(this, 392, 296, textureX, textureY); // Box 175
		bodyModel[108] = new ModelRendererTurbo(this, 418, 290, textureX, textureY); // Box 176
		bodyModel[109] = new ModelRendererTurbo(this, 390, 312, textureX, textureY); // Box 177
		bodyModel[110] = new ModelRendererTurbo(this, 412, 319, textureX, textureY); // Box 178
		bodyModel[111] = new ModelRendererTurbo(this, 438, 328, textureX, textureY); // Box 179
		bodyModel[112] = new ModelRendererTurbo(this, 473, 466, textureX, textureY); // Box 180
		bodyModel[113] = new ModelRendererTurbo(this, 428, 92, textureX, textureY); // Box 181
		bodyModel[114] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 182
		bodyModel[115] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 183
		bodyModel[116] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 184
		bodyModel[117] = new ModelRendererTurbo(this, 424, 462, textureX, textureY); // Box 185
		bodyModel[118] = new ModelRendererTurbo(this, 420, 477, textureX, textureY); // Box 186
		bodyModel[119] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 187
		bodyModel[120] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 188
		bodyModel[121] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 189
		bodyModel[122] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 190
		bodyModel[123] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 191
		bodyModel[124] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 192
		bodyModel[125] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 193
		bodyModel[126] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 194
		bodyModel[127] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 195
		bodyModel[128] = new ModelRendererTurbo(this, 425, 408, textureX, textureY); // Box 204
		bodyModel[129] = new ModelRendererTurbo(this, 425, 408, textureX, textureY); // Box 205
		bodyModel[130] = new ModelRendererTurbo(this, 425, 408, textureX, textureY); // Box 207
		bodyModel[131] = new ModelRendererTurbo(this, 425, 408, textureX, textureY); // Box 208
		bodyModel[132] = new ModelRendererTurbo(this, 425, 408, textureX, textureY); // Box 209
		bodyModel[133] = new ModelRendererTurbo(this, 425, 408, textureX, textureY); // Box 210
		bodyModel[134] = new ModelRendererTurbo(this, 436, 406, textureX, textureY); // Box 211
		bodyModel[135] = new ModelRendererTurbo(this, 436, 406, textureX, textureY); // Box 212

		bodyModel[0].addShapeBox(2F, 1F, -3.07F, 1, 8, 1, 0F,5.4F, 0.95F, -0.33F, -5.3F, 0.95F, -0.4F, -5.4F, 0.95F, 0F, 5.4F, 0.95F, 0F, -1.1F, 0F, -0.35F, 1F, 0F, -0.35F, 1.2F, 0F, 0F, -1.1F, 0F, 0F); // Box 105
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 8.3F, -3.26F, 3, 1, 2, 0F,0.05F, 0F, -0.2F, -0.15F, 0F, 0.05F, -0.2F, 0F, 0F, 0F, 0F, -0.3F, 0.05F, 0F, -0.15F, -0.15F, 0F, 0.15F, -0.2F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 111
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4.5F, 8.03F, 2.2F, 2, 1, 2, 0F,-0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[2].setRotationPoint(0F, 0F, 0F);
		bodyModel[2].rotateAngleX = -0.01745329F;

		bodyModel[3].addShapeBox(1F, 8.3F, -3.26F, 3, 1, 2, 0F,-0.15F, 0F, 0.05F, 0.05F, 0F, -0.2F, 0F, 0F, -0.3F, -0.2F, 0F, 0F, -0.15F, 0F, 0.15F, 0.05F, 0F, -0.15F, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F); // Box 112
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4.5F, 11.03F, 2.2F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F); // Box 113
		bodyModel[4].setRotationPoint(0F, 0F, 0F);
		bodyModel[4].rotateAngleX = -0.01745329F;

		bodyModel[5].addShapeBox(-4F, 7.5F, 2.7F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[5].setRotationPoint(0F, 0F, 0F);
		bodyModel[5].rotateAngleX = -0.01745329F;

		bodyModel[6].addShapeBox(-3.5F, 11.03F, 3.15F, 1, 1, 1, 0F,-0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 115
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-4F, 2F, -2.65F, 2, 7, 1, 0F,0F, 0F, -0.45F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.25F, 0F, 0F, -0.15F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 116
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-3.5F, 11.2F, 3.15F, 1, 1, 1, 0F,-0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 116
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-3.5F, 10.55F, 3.15F, 1, 1, 1, 0F,-0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Box 117
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-2F, 2F, -2.65F, 2, 9, 1, 0F,0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 118
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-3.5F, 10.03F, 3.15F, 1, 1, 1, 0F,-0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 118
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-3.5F, 10.2F, 3.15F, 1, 1, 1, 0F,-0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 119
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-3.5F, 9.55F, 3.15F, 1, 1, 1, 0F,-0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Box 120
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(0F, 2F, -2.65F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 120
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-3.5F, 9.03F, 3.15F, 1, 1, 1, 0F,-0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 121
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(2F, 2F, -2.65F, 2, 7, 1, 0F,0F, 0F, -0.15F, 0F, 0F, -0.45F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.25F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 121
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-3.5F, 9.2F, 3.15F, 1, 1, 1, 0F,-0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 122
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-4F, 1F, -2.65F, 2, 1, 1, 0F,0F, 1F, -0.45F, 0F, 0.9F, -0.15F, 0F, 0.9F, 0F, 0F, 1F, -0.3F, 0F, 0F, -0.45F, 0F, 0F, -0.15F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 122
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-3.5F, 8.55F, 3.15F, 1, 1, 1, 0F,-0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Box 123
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(2F, 1F, -2.65F, 2, 1, 1, 0F,0F, 0.9F, -0.15F, 0F, 1F, -0.45F, 0F, 1F, -0.3F, 0F, 0.9F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.45F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 123
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-2F, 1F, -2.65F, 2, 1, 1, 0F,0F, 0.9F, -0.15F, 0F, -0.1F, 0F, 0F, -0.1F, -0.3F, 0F, 0.9F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 125
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(0F, 1F, -2.65F, 2, 1, 1, 0F,0F, -0.1F, -0.05F, 0F, 0.9F, -0.15F, 0F, 0.9F, 0F, 0F, -0.1F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 126
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(3.6F, 9.7F, -2.45F, 1, 4, 5, 0F,0F, 0F, -0.35F, 0F, 0F, -0.35F, 0.2F, 0F, -0.35F, 0F, 0F, -0.35F, -0.9F, 0.2F, -0.35F, 0.7F, -0.1F, -0.35F, 0.7F, -0.1F, -0.25F, -0.9F, 0.2F, -0.25F); // Box 127
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-2F, 8.9F, 1.53F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0.2F, 0.05F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.2F, 0.05F, 0F, 0.05F); // Box 129
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(0F, 8.8F, -2.65F, 2, 1, 1, 0F,0F, 0F, 0.2F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0.2F, 0.05F, 0F, 0.05F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 130
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(2F, 8.8F, -2.67F, 2, 1, 5, 0F,0.05F, 0F, 0F, 0.2F, 0F, -0.15F, 0.2F, 0F, -0.1F, 0F, 0F, 0F, 0.05F, 0F, 0.05F, 0.25F, 0F, -0.15F, 0.25F, 0F, -0.1F, 0F, 0F, -0.3F); // Box 131
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-4F, 9F, -2.63F, 2, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.15F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.75F, 2F, -0.05F, 0F, 0.8F, -0.15F, 0F, 0.8F, -0.3F, 0.75F, 2.05F, -0.7F); // Box 138
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-2F, 1F, -2.68F, 2, 1, 1, 0F,-1F, 1F, -0.15F, 0F, 0.3F, 0F, 0F, -0.1F, -0.3F, -0.4F, 1F, 0F, 0.2F, -2F, -0.15F, 0F, -0.6F, 0F, 0F, 0F, -0.3F, 0.2F, -2F, -0.15F); // Box 140
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addBox(-3F, -0.01F, -2F, 1, 1, 4, 0F); // Box 154
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addBox(2F, -0.01F, -2F, 1, 1, 4, 0F); // Box 155
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addBox(-2F, 0.99F, -1F, 4, 1, 3, 0F); // Box 156
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-0.8F, 1.85F, -2.66F, 1, 9, 1, 0F,-0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, 0F, -0.45F, 0F, 0F); // Box 157
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(-2.5F, 2.2F, -2.65F, 1, 1, 1, 0F,-0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 159
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-4F, 1F, 1.5F, 2, 1, 1, 0F,0F, 1F, -0.3F, 0F, 0.8F, 0F, 0F, 0.8F, -0.15F, 0F, 1F, -0.45F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.15F, 0F, 0F, -0.45F); // Box 165
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(2F, 1F, 1.5F, 2, 1, 1, 0F,0F, 0.8F, 0F, 0F, 1F, -0.3F, 0F, 1F, -0.45F, 0F, 0.8F, -0.15F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.45F, 0F, 0F, -0.15F); // Box 166
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(0F, 1F, 1.5F, 2, 1, 1, 0F,0F, 0.7F, -0.3F, 0F, 0.8F, 0F, 0F, 0.8F, -0.15F, 0F, 0.7F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.15F, 0F, 0F, 0F); // Box 167
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-2F, 1F, 1.5F, 2, 1, 1, 0F,0F, 0.8F, 0F, 0F, 0.7F, -0.3F, 0F, 0.7F, 0F, 0F, 0.8F, -0.15F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.15F); // Box 168
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-4F, 2F, 1.5F, 2, 7, 1, 0F,0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.45F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.15F, 0F, 0F, -0.25F); // Box 169
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(2F, 2F, 1.5F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.45F, 0F, 0F, -0.15F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.25F, 0F, 0F, -0.15F); // Box 172
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(-4F, 9F, 1.5F, 2, 7, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.15F, 0F, 0F, -0.25F, 0.4F, -1.5F, -0.2F, 0F, 0.05F, -0.3F, 0F, 0.5F, 0.25F, 0.7F, -1.1F, 0.25F); // Box 173
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(-2F, 8.8F, -2.65F, 2, 1, 1, 0F,0.05F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0.05F, 0F, 0.05F, 0F, 0F, 0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 176
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(2.1F, 8.8F, 1.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.3F, 0.15F, 0F, -0.15F, 0.05F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.15F, 0F, -0.15F, 0.05F, 0F, 0.05F); // Box 177
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(0F, 8.9F, 1.53F, 2, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.05F, 0F, 0.05F, 0F, 0F, 0.2F); // Box 178
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addBox(-3.5F, 1.4F, -2F, 7, 1, 3, 0F); // Box 71
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(-4F, 8.99F, -2F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, -1F, 0.4F, 0F, -1F, 0F, 0F, 0F, 0.4F, 0.75F, -0.15F, 0.7F); // Box 72
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(-4F, 8.8F, 1.53F, 2, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.15F, 0F, -0.15F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.05F, 0F, 0.05F, 0.15F, 0F, -0.15F); // Box 78
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(-4F, 8.8F, -2.65F, 2, 1, 5, 0F,0.2F, 0F, -0.15F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, -0.1F, 0.25F, 0F, -0.15F, 0.05F, 0F, 0.05F, 0F, 0F, -0.3F, 0.25F, 0F, -0.1F); // Box 79
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(-2F, 11F, -2.63F, 2, 1, 1, 0F,0F, 0F, -0.15F, -0.2F, 0F, 0F, -0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.8F, -0.15F, -0.35F, 0F, 0F, -0.35F, 0F, -0.3F, 0F, 0.8F, 0F); // Box 80
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(0.1F, 11F, -2.75F, 2, 1, 1, 0F,0.2F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.3F, 0.2F, 0F, -0.3F, -0.05F, 0F, 0F, 0F, 0.8F, -0.15F, 0F, 0.8F, 0F, -0.05F, 0F, -0.3F); // Box 81
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(-2.5F, 1.55F, -2.65F, 1, 1, 1, 0F,-0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Box 82
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(-2.5F, 2.03F, -2.65F, 1, 1, 1, 0F,-0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 83
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(-2.5F, 3.53F, -2.65F, 1, 1, 1, 0F,-0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 84
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(-2.5F, 5.03F, -2.65F, 1, 1, 1, 0F,-0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 85
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(-2.5F, 6.53F, -2.65F, 1, 1, 1, 0F,-0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 86
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(-2.5F, 8.03F, -2.65F, 1, 1, 1, 0F,-0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 87
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addShapeBox(-2.5F, 3.7F, -2.65F, 1, 1, 1, 0F,-0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 88
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addShapeBox(-2.5F, 5.2F, -2.65F, 1, 1, 1, 0F,-0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 90
		bodyModel[57].setRotationPoint(0F, 0F, 0F);

		bodyModel[58].addShapeBox(-2.5F, 8.2F, -2.65F, 1, 1, 1, 0F,-0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 91
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addBox(-4.5F, 9.03F, 2.2F, 2, 2, 2, 0F); // Box 91
		bodyModel[59].setRotationPoint(0F, 0F, 0F);
		bodyModel[59].rotateAngleX = -0.01745329F;

		bodyModel[60].addShapeBox(-2.5F, 4.55F, -2.65F, 1, 1, 1, 0F,-0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Box 92
		bodyModel[60].setRotationPoint(0F, 0F, 0F);

		bodyModel[61].addShapeBox(-2.5F, 7.55F, -2.65F, 1, 1, 1, 0F,-0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Box 93
		bodyModel[61].setRotationPoint(0F, 0F, 0F);

		bodyModel[62].addShapeBox(-2.5F, 3.05F, -2.65F, 1, 1, 1, 0F,-0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Box 94
		bodyModel[62].setRotationPoint(0F, 0F, 0F);

		bodyModel[63].addShapeBox(-2.5F, 6.05F, -2.65F, 1, 1, 1, 0F,-0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Box 95
		bodyModel[63].setRotationPoint(0F, 0F, 0F);

		bodyModel[64].addShapeBox(-3.6F, 8.8F, -2.85F, 2, 2, 1, 0F,0.3F, 0F, -0.1F, 0.3F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0.3F, 0F, -0.15F, 0.3F, 0F, 0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 97
		bodyModel[64].setRotationPoint(0F, 0F, 0F);

		bodyModel[65].addShapeBox(1.6F, 8.8F, -2.8F, 2, 2, 1, 0F,0.3F, 0F, 0.2F, 0.3F, 0F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0.3F, 0F, 0.2F, 0.3F, 0F, -0.15F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 98
		bodyModel[65].setRotationPoint(0F, 0F, 0F);

		bodyModel[66].addShapeBox(-2F, 1F, -3.04F, 1, 8, 1, 0F,-4.3F, 0.95F, -0.2F, 3.8F, 0.95F, -0.2F, 3.8F, 0.95F, 0F, -4.3F, 0.95F, 0F, 1.2F, 0F, -0.35F, -1.7F, 0F, -0.35F, -1.7F, 0F, 0F, 1.2F, 0F, 0F); // Box 99
		bodyModel[66].setRotationPoint(0F, 0F, 0F);

		bodyModel[67].addShapeBox(4.05F, 9.13F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, -0.8F, -0.22F, 0.05F, -0.82F, -0.22F, 0.05F, -0.82F, -0.22F, 0F, -0.82F, -0.22F); // Box 145
		bodyModel[67].setRotationPoint(0F, 0F, 0F);

		bodyModel[68].addShapeBox(4.05F, 9.3F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.22F, 0.05F, 0F, -0.22F, 0.05F, 0F, -0.22F, 0F, 0F, -0.22F, 0F, -0.8F, -0.22F, 0.05F, -0.82F, -0.22F, 0.05F, -0.82F, -0.22F, 0F, -0.82F, -0.22F); // Box 146
		bodyModel[68].setRotationPoint(0F, 0F, 0F);

		bodyModel[69].addShapeBox(-2.5F, 6.7F, -2.65F, 1, 1, 1, 0F,-0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 133
		bodyModel[69].setRotationPoint(0F, 0F, 0F);

		bodyModel[70].addShapeBox(0F, 2F, 1.5F, 2, 14, 1, 0F,0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0.25F, 0F, 0.55F, 0.25F, 0F, -0.4F, 0F); // Box 133
		bodyModel[70].setRotationPoint(0F, 0F, 0F);

		bodyModel[71].addShapeBox(-2F, 2F, 1.5F, 2, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, -0.5F, 0.25F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.55F, 0.25F); // Box 135
		bodyModel[71].setRotationPoint(0F, 0F, 0F);

		bodyModel[72].addShapeBox(2.1F, 9F, -2.75F, 2, 3, 1, 0F,0F, 0F, -0.15F, 0F, 0F, -0.25F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.8F, -0.15F, 0.75F, 2F, -0.05F, 0.75F, 2.05F, -0.6F, 0F, 0.8F, -0.2F); // Box 136
		bodyModel[72].setRotationPoint(0F, 0F, 0F);

		bodyModel[73].addShapeBox(2F, 9F, 1.5F, 2, 7, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.25F, 0F, 0F, -0.15F, 0F, 0.05F, -0.3F, 0.4F, -1.5F, -0.2F, 0.7F, -1.1F, 0.25F, 0F, 0.5F, 0.25F); // Box 138
		bodyModel[73].setRotationPoint(0F, 0F, 0F);

		bodyModel[74].addShapeBox(3F, 8.99F, -2F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.75F, -1F, 0.4F, 0.75F, -0.15F, 0.7F, 0F, 0F, 0.4F); // Box 139
		bodyModel[74].setRotationPoint(0F, 0F, 0F);

		bodyModel[75].addShapeBox(-0.2F, 9F, -2.75F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 140
		bodyModel[75].setRotationPoint(0F, 0F, 0F);

		bodyModel[76].addShapeBox(4.05F, 8.65F, -0.5F, 1, 1, 1, 0F,0F, -0.8F, -0.22F, 0.05F, -0.82F, -0.22F, 0.05F, -0.82F, -0.22F, 0F, -0.82F, -0.22F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F); // Box 141
		bodyModel[76].setRotationPoint(0F, 0F, 0F);

		bodyModel[77].addShapeBox(1.5F, 2.03F, -2.65F, 1, 1, 1, 0F,-0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 142
		bodyModel[77].setRotationPoint(0F, 0F, 0F);

		bodyModel[78].addShapeBox(1.5F, 2.2F, -2.65F, 1, 1, 1, 0F,-0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 143
		bodyModel[78].setRotationPoint(0F, 0F, 0F);

		bodyModel[79].addShapeBox(1.5F, 1.55F, -2.65F, 1, 1, 1, 0F,-0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Box 144
		bodyModel[79].setRotationPoint(0F, 0F, 0F);

		bodyModel[80].addShapeBox(1.5F, 3.53F, -2.65F, 1, 1, 1, 0F,-0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 145
		bodyModel[80].setRotationPoint(0F, 0F, 0F);

		bodyModel[81].addShapeBox(1.5F, 3.05F, -2.65F, 1, 1, 1, 0F,-0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Box 146
		bodyModel[81].setRotationPoint(0F, 0F, 0F);

		bodyModel[82].addShapeBox(1.5F, 3.7F, -2.65F, 1, 1, 1, 0F,-0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 147
		bodyModel[82].setRotationPoint(0F, 0F, 0F);

		bodyModel[83].addShapeBox(1.5F, 5.03F, -2.65F, 1, 1, 1, 0F,-0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 148
		bodyModel[83].setRotationPoint(0F, 0F, 0F);

		bodyModel[84].addShapeBox(1.5F, 5.2F, -2.65F, 1, 1, 1, 0F,-0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 149
		bodyModel[84].setRotationPoint(0F, 0F, 0F);

		bodyModel[85].addShapeBox(1.5F, 4.55F, -2.65F, 1, 1, 1, 0F,-0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Box 150
		bodyModel[85].setRotationPoint(0F, 0F, 0F);

		bodyModel[86].addShapeBox(1.5F, 6.53F, -2.65F, 1, 1, 1, 0F,-0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 151
		bodyModel[86].setRotationPoint(0F, 0F, 0F);

		bodyModel[87].addShapeBox(1.5F, 6.7F, -2.65F, 1, 1, 1, 0F,-0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 152
		bodyModel[87].setRotationPoint(0F, 0F, 0F);

		bodyModel[88].addShapeBox(1.5F, 8.03F, -2.65F, 1, 1, 1, 0F,-0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 153
		bodyModel[88].setRotationPoint(0F, 0F, 0F);

		bodyModel[89].addShapeBox(1.5F, 8.2F, -2.65F, 1, 1, 1, 0F,-0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 154
		bodyModel[89].setRotationPoint(0F, 0F, 0F);

		bodyModel[90].addShapeBox(1.5F, 7.55F, -2.65F, 1, 1, 1, 0F,-0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Box 155
		bodyModel[90].setRotationPoint(0F, 0F, 0F);

		bodyModel[91].addShapeBox(1.5F, 6.05F, -2.65F, 1, 1, 1, 0F,-0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Box 156
		bodyModel[91].setRotationPoint(0F, 0F, 0F);

		bodyModel[92].addShapeBox(2.5F, 1F, -3F, 1, 8, 1, 0F,-0.1F, 0.95F, -0.2F, -0.1F, 0.95F, -0.2F, -0.1F, 0.95F, -0.2F, -0.1F, 0.95F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 160
		bodyModel[92].setRotationPoint(0F, 0F, 0F);

		bodyModel[93].addShapeBox(2.5F, 1.05F, -3.2F, 1, 8, 1, 0F,-0.3F, 0.95F, -0.2F, -0.3F, 0.95F, -0.2F, -0.3F, 0.95F, -0.2F, -0.3F, 0.95F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 161
		bodyModel[93].setRotationPoint(0F, 0F, 0F);

		bodyModel[94].addShapeBox(-3.5F, 1F, -3F, 1, 8, 1, 0F,-0.1F, 0.95F, -0.2F, -0.1F, 0.95F, -0.2F, -0.1F, 0.95F, -0.2F, -0.1F, 0.95F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 162
		bodyModel[94].setRotationPoint(0F, 0F, 0F);

		bodyModel[95].addShapeBox(-3.5F, 1.05F, -3.2F, 1, 8, 1, 0F,-0.3F, 0.95F, -0.2F, -0.3F, 0.95F, -0.2F, -0.3F, 0.95F, -0.2F, -0.3F, 0.95F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 163
		bodyModel[95].setRotationPoint(0F, 0F, 0F);

		bodyModel[96].addShapeBox(-3.5F, 1F, 1.6F, 1, 8, 1, 0F,-0.1F, 0.95F, -0.2F, -0.1F, 0.95F, -0.2F, -0.1F, 0.95F, -0.2F, -0.1F, 0.95F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 164
		bodyModel[96].setRotationPoint(0F, 0F, 0F);

		bodyModel[97].addShapeBox(2.5F, 1F, 1.6F, 1, 8, 1, 0F,-0.1F, 0.95F, -0.2F, -0.1F, 0.95F, -0.2F, -0.1F, 0.95F, -0.2F, -0.1F, 0.95F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 165
		bodyModel[97].setRotationPoint(0F, 0F, 0F);

		bodyModel[98].addShapeBox(2.5F, 1.05F, 1.8F, 1, 8, 1, 0F,-0.3F, 0.95F, -0.2F, -0.3F, 0.95F, -0.2F, -0.3F, 0.95F, -0.2F, -0.3F, 0.95F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 166
		bodyModel[98].setRotationPoint(0F, 0F, 0F);

		bodyModel[99].addShapeBox(-3.5F, 1.05F, 1.8F, 1, 8, 1, 0F,-0.3F, 0.95F, -0.2F, -0.3F, 0.95F, -0.2F, -0.3F, 0.95F, -0.2F, -0.3F, 0.95F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 167
		bodyModel[99].setRotationPoint(0F, 0F, 0F);

		bodyModel[100].addShapeBox(2F, 1F, 1.56F, 1, 8, 1, 0F,5.4F, 0.95F, -0.4F, -5.3F, 0.95F, -0.4F, -5.4F, 0.95F, 0F, 5.4F, 0.95F, 0F, -0.7F, 0F, -0.35F, 0.75F, 0F, -0.35F, 0.75F, 0F, 0F, -0.7F, 0F, 0F); // Box 168
		bodyModel[100].setRotationPoint(0F, 0F, 0F);

		bodyModel[101].addShapeBox(3F, -0.01F, -2F, 1, 13, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0.4F, 0F, -0.15F, 0.4F, 0F, 0F, 0.4F); // Box 169
		bodyModel[101].setRotationPoint(0F, 0F, 0F);

		bodyModel[102].addShapeBox(-4F, -0.01F, -2F, 1, 13, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0.4F, 0F, -0.15F, 0.4F, 0F, 0F, 0.4F); // Box 170
		bodyModel[102].setRotationPoint(0F, 0F, 0F);

		bodyModel[103].addShapeBox(0F, 1F, -2.68F, 2, 1, 1, 0F,0F, 0.3F, 0F, -1F, 1F, -0.15F, -0.4F, 1F, 0F, 0F, -0.1F, -0.3F, 0F, -0.6F, 0F, 0.2F, -2F, -0.15F, 0.2F, -2F, -0.15F, 0F, 0F, -0.3F); // Box 171
		bodyModel[103].setRotationPoint(0F, 0F, 0F);

		bodyModel[104].addShapeBox(0.75F, 8.3F, 1.2F, 3, 1, 2, 0F,-0.2F, 0F, 0F, 0F, 0F, -0.3F, 0.05F, 0F, -0.2F, -0.15F, 0F, 0.05F, -0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0.05F, 0F, -0.15F, -0.15F, 0F, 0.15F); // Box 172
		bodyModel[104].setRotationPoint(0F, 0F, 0F);

		bodyModel[105].addShapeBox(1.6F, 8.8F, 2.2F, 2, 3, 1, 0F,0.6F, 0F, -0.1F, 0.3F, 0F, 0.2F, 0F, 0F, -0.3F, 0.6F, 0F, -0.1F, 0.6F, 0F, -0.15F, 0.3F, 0F, 0.2F, 0F, 0F, -0.3F, 0.6F, 0F, -0.1F); // Box 173
		bodyModel[105].setRotationPoint(0F, 0F, 0F);

		bodyModel[106].addShapeBox(-2F, 1F, 1.59F, 1, 8, 1, 0F,-4.3F, 0.95F, -0.2F, 3.8F, 0.95F, -0.2F, 3.8F, 0.95F, 0F, -4.3F, 0.95F, 0F, 1.2F, 0F, -0.35F, -1.7F, 0F, -0.35F, -1.7F, 0F, 0F, 1.2F, 0F, 0F); // Box 174
		bodyModel[106].setRotationPoint(0F, 0F, 0F);

		bodyModel[107].addShapeBox(-3.5F, 0.99F, 2.6F, 7, 3, 3, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 175
		bodyModel[107].setRotationPoint(0F, 0F, 0F);

		bodyModel[108].addShapeBox(-3.5F, -0.01F, 2.6F, 7, 1, 3, 0F,-0.2F, -0.4F, -1.4F, -0.2F, -0.4F, -1.4F, -0.2F, -0.4F, -1.4F, -0.2F, -0.4F, -1.4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 176
		bodyModel[108].setRotationPoint(0F, 0F, 0F);

		bodyModel[109].addShapeBox(-3.5F, 1F, 5.6F, 7, 3, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -1.4F, -0.4F, -0.2F, -1.4F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -1.4F, -0.4F, -0.2F, -1.4F, -0.4F); // Box 177
		bodyModel[109].setRotationPoint(0F, 0F, 0F);

		bodyModel[110].addShapeBox(-3.5F, 3.99F, 2.6F, 7, 1, 3, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.4F, -1.4F, -0.2F, -0.4F, -1.4F, -0.2F, -0.4F, -1.4F, -0.2F, -0.4F, -1.4F); // Box 178
		bodyModel[110].setRotationPoint(0F, 0F, 0F);

		bodyModel[111].addShapeBox(-3.5F, 1F, 1.6F, 7, 3, 1, 0F,-0.2F, -1.4F, -0.4F, -0.2F, -1.4F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -1.4F, -0.4F, -0.2F, -1.4F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 179
		bodyModel[111].setRotationPoint(0F, 0F, 0F);

		bodyModel[112].addShapeBox(-3.5F, 4.3F, 2.1F, 7, 3, 3, 0F,-0.8F, 0.4F, -0.2F, -0.8F, 0.4F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, -1.4F, -0.2F, -0.8F, -1.4F, -0.2F, -0.8F, -1.2F, 0F, -0.8F, -1.2F, 0F); // Box 180
		bodyModel[112].setRotationPoint(0F, 0F, 0F);

		bodyModel[113].addShapeBox(-3.5F, 5.8F, 2F, 7, 5, 3, 0F,-1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, -1.2F, -0.2F, -1F, -1.2F, -0.2F, -1F, -1.2F, -0.2F, -1F, -1.2F, -0.2F); // Box 181
		bodyModel[113].setRotationPoint(0F, 0F, 0F);

		bodyModel[114].addShapeBox(-0.5F, 5.9F, 4.15F, 1, 1, 1, 0F,-0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 182
		bodyModel[114].setRotationPoint(0F, 0F, 0F);

		bodyModel[115].addShapeBox(-0.5F, 6.09F, 4.15F, 1, 1, 1, 0F,-0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 183
		bodyModel[115].setRotationPoint(0F, 0F, 0F);

		bodyModel[116].addShapeBox(-0.5F, 5.46F, 4.15F, 1, 1, 1, 0F,-0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Box 184
		bodyModel[116].setRotationPoint(0F, 0F, 0F);

		bodyModel[117].addShapeBox(-3F, 6.01F, 2.2F, 3, 5, 3, 0F,-1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, -1.2F, -0.2F, -1F, -1.2F, -0.2F, -1F, -1.2F, -0.2F, -1F, -1.2F, -0.2F); // Box 185
		bodyModel[117].setRotationPoint(0F, 0F, 0F);

		bodyModel[118].addShapeBox(0F, 6.01F, 2.2F, 3, 5, 3, 0F,-1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, -1.2F, -0.2F, -1F, -1.2F, -0.2F, -1F, -1.2F, -0.2F, -1F, -1.2F, -0.2F); // Box 186
		bodyModel[118].setRotationPoint(0F, 0F, 0F);

		bodyModel[119].addShapeBox(-4.5F, 9.2F, 3.15F, 1, 1, 1, 0F,-0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 187
		bodyModel[119].setRotationPoint(0F, 0F, 0F);

		bodyModel[120].addShapeBox(-4.5F, 10.2F, 3.15F, 1, 1, 1, 0F,-0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 188
		bodyModel[120].setRotationPoint(0F, 0F, 0F);

		bodyModel[121].addShapeBox(-4.5F, 11.2F, 3.15F, 1, 1, 1, 0F,-0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 189
		bodyModel[121].setRotationPoint(0F, 0F, 0F);

		bodyModel[122].addShapeBox(-4.5F, 11.03F, 3.15F, 1, 1, 1, 0F,-0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 190
		bodyModel[122].setRotationPoint(0F, 0F, 0F);

		bodyModel[123].addShapeBox(-4.5F, 10.55F, 3.15F, 1, 1, 1, 0F,-0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Box 191
		bodyModel[123].setRotationPoint(0F, 0F, 0F);

		bodyModel[124].addShapeBox(-4.5F, 9.55F, 3.15F, 1, 1, 1, 0F,-0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Box 192
		bodyModel[124].setRotationPoint(0F, 0F, 0F);

		bodyModel[125].addShapeBox(-4.5F, 10.03F, 3.15F, 1, 1, 1, 0F,-0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 193
		bodyModel[125].setRotationPoint(0F, 0F, 0F);

		bodyModel[126].addShapeBox(-4.5F, 9.03F, 3.15F, 1, 1, 1, 0F,-0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 194
		bodyModel[126].setRotationPoint(0F, 0F, 0F);

		bodyModel[127].addShapeBox(-4.5F, 8.55F, 3.15F, 1, 1, 1, 0F,-0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Box 195
		bodyModel[127].setRotationPoint(0F, 0F, 0F);

		bodyModel[128].addShapeBox(-2.5F, 1F, 5.6F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -1.4F, -0.2F, -0.2F, -1.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -1.4F, -0.2F, -0.2F, -1.4F, -0.2F); // Box 204
		bodyModel[128].setRotationPoint(0F, 0F, 0F);

		bodyModel[129].addShapeBox(-2.5F, 0.2F, 2.8F, 1, 1, 3, 0F,-0.2F, -0.15F, -1F, -0.2F, -0.15F, -1F, -0.2F, -0.15F, -1.4F, -0.2F, -0.15F, -1.4F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 205
		bodyModel[129].setRotationPoint(0F, 0F, 0F);

		bodyModel[130].addShapeBox(-2.5F, 3.8F, 2.8F, 1, 1, 3, 0F,-0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.15F, -1F, -0.2F, -0.15F, -1F, -0.2F, -0.15F, -1.4F, -0.2F, -0.15F, -1.4F); // Box 207
		bodyModel[130].setRotationPoint(0F, 0F, 0F);

		bodyModel[131].addShapeBox(1.5F, 0.2F, 2.8F, 1, 1, 3, 0F,-0.2F, -0.15F, -1F, -0.2F, -0.15F, -1F, -0.2F, -0.15F, -1.4F, -0.2F, -0.15F, -1.4F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 208
		bodyModel[131].setRotationPoint(0F, 0F, 0F);

		bodyModel[132].addShapeBox(1.5F, 1F, 5.6F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -1.4F, -0.2F, -0.2F, -1.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -1.4F, -0.2F, -0.2F, -1.4F, -0.2F); // Box 209
		bodyModel[132].setRotationPoint(0F, 0F, 0F);

		bodyModel[133].addShapeBox(1.5F, 3.8F, 2.8F, 1, 1, 3, 0F,-0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.15F, -1F, -0.2F, -0.15F, -1F, -0.2F, -0.15F, -1.4F, -0.2F, -0.15F, -1.4F); // Box 210
		bodyModel[133].setRotationPoint(0F, 0F, 0F);

		bodyModel[134].addShapeBox(-2.5F, 0.99F, 2.6F, 1, 3, 3, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F); // Box 211
		bodyModel[134].setRotationPoint(0F, 0F, 0F);

		bodyModel[135].addShapeBox(1.5F, 0.99F, 2.6F, 1, 3, 3, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F); // Box 212
		bodyModel[135].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 333, 129, textureX, textureY); // Box 101
		leftArmModel[1] = new ModelRendererTurbo(this, -254, 19, textureX, textureY); // Box 69
		leftArmModel[2] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 95

		leftArmModel[0].addShapeBox(-1F, 5.99F, -2F, 4, 3, 4, 0F,0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F); // Box 101
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, -2.01F, -2F, 4, 5, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 69
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, 2.99F, -2F, 4, 5, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 95
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 311, 86, textureX, textureY); // Box 151
		rightArmModel[1] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 152
		rightArmModel[2] = new ModelRendererTurbo(this, 310, 155, textureX, textureY); // Box 153

		rightArmModel[0].addShapeBox(-3F, -2.01F, -2F, 4, 5, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 151
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 2.99F, -2F, 4, 5, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 152
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, 5.99F, -2F, 4, 3, 4, 0F,0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F); // Box 153
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 464, 433, textureX, textureY); // Box 107
		leftLegModel[1] = new ModelRendererTurbo(this, 187, 293, textureX, textureY); // Box 109
		leftLegModel[2] = new ModelRendererTurbo(this, 207, 300, textureX, textureY); // Box 110
		leftLegModel[3] = new ModelRendererTurbo(this, 437, 442, textureX, textureY); // Box 114
		leftLegModel[4] = new ModelRendererTurbo(this, 451, 456, textureX, textureY); // Box 78
		leftLegModel[5] = new ModelRendererTurbo(this, 468, 445, textureX, textureY); // Box 88

		leftLegModel[0].addShapeBox(-2F, 9F, -2.75F, 4, 1, 1, 0F,-0.5F, -0.5F, -0.55F, -0.5F, -0.5F, -0.55F, -0.5F, -0.4F, 1F, -0.5F, -0.4F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, -0.05F, 0F, -0.25F); // Box 107
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, -2F, -2F, 4, 7, 4, 0F,0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.45F, 0.5F, 0F, 0.55F, 0.5F, 0F, 0.55F, 0F, 0F, 0.15F); // Box 109
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 5F, -2F, 4, 1, 4, 0F,0F, 0F, 0.45F, 0.5F, 0F, 0.55F, 0.5F, 0F, 0.55F, 0F, 0F, 0.45F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 110
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 6F, -2F, 4, 6, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 114
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-2F, 10F, -2.75F, 4, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, -0.05F, 0F, -0.25F); // Box 78
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-2F, 6F, -2F, 4, 1, 4, 0F,0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F); // Box 88
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 273, 302, textureX, textureY); // Box 112
		rightLegModel[1] = new ModelRendererTurbo(this, 267, 295, textureX, textureY); // Box 113
		rightLegModel[2] = new ModelRendererTurbo(this, 422, 443, textureX, textureY); // Box 115
		rightLegModel[3] = new ModelRendererTurbo(this, 448, 454, textureX, textureY); // Box 76
		rightLegModel[4] = new ModelRendererTurbo(this, 440, 442, textureX, textureY); // Box 79
		rightLegModel[5] = new ModelRendererTurbo(this, 470, 450, textureX, textureY); // Box 87

		rightLegModel[0].addShapeBox(-2F, -2F, -2F, 4, 7, 4, 0F,0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.55F, 0F, 0F, 0.45F, 0F, 0F, 0.15F, 0.5F, 0F, 0.55F); // Box 112
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 5F, -2F, 4, 1, 4, 0F,0.5F, 0F, 0.55F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0.5F, 0F, 0.55F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.05F, 0F, 0.1F); // Box 113
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 6F, -2F, 4, 6, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 115
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 10F, -2.75F, 4, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, -0.05F, 0F, -0.25F); // Box 76
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2F, 9F, -2.75F, 4, 1, 1, 0F,-0.5F, -0.5F, -0.55F, -0.5F, -0.5F, -0.55F, -0.5F, -0.4F, 1F, -0.5F, -0.4F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, -0.05F, 0F, -0.25F); // Box 79
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-2F, 6F, -2F, 4, 1, 4, 0F,0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F); // Box 87
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);
	}
}