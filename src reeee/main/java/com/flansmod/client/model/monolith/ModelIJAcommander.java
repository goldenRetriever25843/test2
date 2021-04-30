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

public class ModelIJAcommander extends ModelCustomArmour //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelIJAcommander() //Same as Filename
	{
		headModel = new ModelRendererTurbo[15];
		bodyModel = new ModelRendererTurbo[91];
		leftArmModel = new ModelRendererTurbo[7];
		rightArmModel = new ModelRendererTurbo[7];
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
		headModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box1
		headModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box3
		headModel[2] = new ModelRendererTurbo(this, 305, 261, textureX, textureY); // Import Box4
		headModel[3] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import Box6
		headModel[4] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import Box7
		headModel[5] = new ModelRendererTurbo(this, 265, 428, textureX, textureY); // Import Box11
		headModel[6] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import Box2
		headModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		headModel[8] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 138
		headModel[9] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 139
		headModel[10] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 140
		headModel[11] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 141
		headModel[12] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 142
		headModel[13] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 143
		headModel[14] = new ModelRendererTurbo(this, 330, 261, textureX, textureY); // Box 144

		headModel[0].addShapeBox(0F, -8F, -4F, 4, 3, 4, 0F,0F, 1F, 0.2F, 0F, 0.8F, 0F, 0F, 0.6F, 0F, 0F, 0.8F, 0F, 0F, 0F, 1F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(0F, -8F, 0F, 4, 3, 4, 0F,0F, 0.8F, 0F, 0F, 0.6F, 0F, 0F, 0.2F, 0F, 0F, 0.6F, 0.2F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 1F, 0.5F, 0F, 1.5F, 1F); // Import Box3
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -6.2F, -5F, 4, 1, 5, 0F,0.2F, -0.2F, -0.55F, 0F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, -0.55F, 0F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Import Box4
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -5.25F, -6F, 4, 1, 2, 0F,0.2F, -0.4F, -0.7F, 0F, -0.4F, 0.5F, 0F, -0.2F, 0F, 0.2F, -0.2F, 1F, 0.2F, -0.3F, 0F, 0F, -0.2F, 0.7F, 0F, -0.4F, 0F, 0.2F, -0.6F, 0.5F); // Import Box6
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(0F, -5.25F, -6F, 4, 1, 2, 0F,0F, -0.4F, 0.5F, 0.2F, -0.4F, -0.7F, 0.2F, -0.2F, 1F, 0F, -0.2F, 0F, 0F, -0.2F, 0.7F, 0.2F, -0.3F, 0F, 0.2F, -0.6F, 0.5F, 0F, -0.4F, 0F); // Import Box7
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-22.5F, -28.5F, -5F, 45, 43, 1, 0F,-23.2F, -20.8F, -0.5F, -23.2F, -20.8F, -0.5F, -23.2F, -20.8F, 0F, -23.2F, -20.8F, 0F, -23.2F, -20.8F, -0.2F, -23.2F, -20.8F, -0.2F, -23.2F, -20.8F, 0F, -23.2F, -20.8F, 0F); // Import Box11
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4F, -8F, 0F, 4, 3, 4, 0F,0F, 0.6F, 0F, 0F, 0.8F, 0F, 0F, 0.6F, 0.2F, 0F, 0.2F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 1F, 0.2F, 1F, 0.5F); // Import Box2
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-4F, -8F, -4F, 4, 3, 4, 0F,0F, 0.8F, 0F, 0F, 1F, 0.2F, 0F, 0.8F, 0F, 0F, 0.6F, 0F, 0.2F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Import Box0
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-4.25F, -5.8F, -0.85F, 1, 1, 1, 0F,0.05F, 0F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, 0.05F, 0F, -0.22F, 0.05F, -0.82F, -0.22F, 0F, -0.82F, -0.22F, 0F, -0.8F, -0.22F, 0.05F, -0.82F, -0.22F); // Box 138
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-4.25F, -5.97F, -0.85F, 1, 1, 1, 0F,0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0.05F, -0.82F, -0.22F, 0F, -0.82F, -0.22F, 0F, -0.8F, -0.22F, 0.05F, -0.82F, -0.22F); // Box 139
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-4.25F, -6.45F, -0.85F, 1, 1, 1, 0F,0.05F, -0.82F, -0.22F, 0F, -0.82F, -0.22F, 0F, -0.8F, -0.22F, 0.05F, -0.82F, -0.22F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F); // Box 140
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(3.25F, -5.97F, -0.85F, 1, 1, 1, 0F,0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0.05F, -0.82F, -0.22F, 0F, -0.82F, -0.22F, 0F, -0.8F, -0.22F, 0.05F, -0.82F, -0.22F); // Box 141
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(3.25F, -5.8F, -0.85F, 1, 1, 1, 0F,0.05F, 0F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, 0.05F, 0F, -0.22F, 0.05F, -0.82F, -0.22F, 0F, -0.82F, -0.22F, 0F, -0.8F, -0.22F, 0.05F, -0.82F, -0.22F); // Box 142
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(3.25F, -6.45F, -0.85F, 1, 1, 1, 0F,0.05F, -0.82F, -0.22F, 0F, -0.82F, -0.22F, 0F, -0.8F, -0.22F, 0.05F, -0.82F, -0.22F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F); // Box 143
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(0F, -6.2F, -5F, 4, 1, 5, 0F,0F, -0.2F, 0F, 0.2F, -0.2F, -0.55F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0.2F, -0.2F, -0.55F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 144
		headModel[14].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 465, 395, textureX, textureY); // Box 105
		bodyModel[1] = new ModelRendererTurbo(this, 478, 398, textureX, textureY); // Box 106
		bodyModel[2] = new ModelRendererTurbo(this, 447, 395, textureX, textureY); // Box 108
		bodyModel[3] = new ModelRendererTurbo(this, 342, 123, textureX, textureY); // Box 109
		bodyModel[4] = new ModelRendererTurbo(this, 400, 133, textureX, textureY); // Box 110
		bodyModel[5] = new ModelRendererTurbo(this, 450, 464, textureX, textureY); // Box 111
		bodyModel[6] = new ModelRendererTurbo(this, 463, 469, textureX, textureY); // Box 111
		bodyModel[7] = new ModelRendererTurbo(this, 282, 382, textureX, textureY); // Box 112
		bodyModel[8] = new ModelRendererTurbo(this, 439, 483, textureX, textureY); // Box 112
		bodyModel[9] = new ModelRendererTurbo(this, 453, 294, textureX, textureY); // Box 113
		bodyModel[10] = new ModelRendererTurbo(this, 115, 168, textureX, textureY); // Box 114
		bodyModel[11] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 115
		bodyModel[12] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 116
		bodyModel[13] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 116
		bodyModel[14] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 117
		bodyModel[15] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 118
		bodyModel[16] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 118
		bodyModel[17] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 119
		bodyModel[18] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 120
		bodyModel[19] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 120
		bodyModel[20] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 121
		bodyModel[21] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 121
		bodyModel[22] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 122
		bodyModel[23] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 122
		bodyModel[24] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 123
		bodyModel[25] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 123
		bodyModel[26] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 125
		bodyModel[27] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 126
		bodyModel[28] = new ModelRendererTurbo(this, 420, 143, textureX, textureY); // Box 127
		bodyModel[29] = new ModelRendererTurbo(this, 308, 387, textureX, textureY); // Box 129
		bodyModel[30] = new ModelRendererTurbo(this, 333, 389, textureX, textureY); // Box 130
		bodyModel[31] = new ModelRendererTurbo(this, 345, 387, textureX, textureY); // Box 131
		bodyModel[32] = new ModelRendererTurbo(this, 336, 127, textureX, textureY); // Box 133
		bodyModel[33] = new ModelRendererTurbo(this, 380, 124, textureX, textureY); // Box 134
		bodyModel[34] = new ModelRendererTurbo(this, 339, 16, textureX, textureY); // Box 138
		bodyModel[35] = new ModelRendererTurbo(this, 308, 38, textureX, textureY); // Box 139
		bodyModel[36] = new ModelRendererTurbo(this, 392, 234, textureX, textureY); // Box 140
		bodyModel[37] = new ModelRendererTurbo(this, 432, 199, textureX, textureY); // Box 148
		bodyModel[38] = new ModelRendererTurbo(this, 447, 236, textureX, textureY); // Box 149
		bodyModel[39] = new ModelRendererTurbo(this, 452, 202, textureX, textureY); // Box 150
		bodyModel[40] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 154
		bodyModel[41] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 155
		bodyModel[42] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 156
		bodyModel[43] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 157
		bodyModel[44] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 159
		bodyModel[45] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 165
		bodyModel[46] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 166
		bodyModel[47] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 167
		bodyModel[48] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 168
		bodyModel[49] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 169
		bodyModel[50] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 170
		bodyModel[51] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 171
		bodyModel[52] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 172
		bodyModel[53] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 173
		bodyModel[54] = new ModelRendererTurbo(this, 349, 10, textureX, textureY); // Box 174
		bodyModel[55] = new ModelRendererTurbo(this, 320, 388, textureX, textureY); // Box 176
		bodyModel[56] = new ModelRendererTurbo(this, 314, 396, textureX, textureY); // Box 177
		bodyModel[57] = new ModelRendererTurbo(this, 331, 396, textureX, textureY); // Box 178
		bodyModel[58] = new ModelRendererTurbo(this, 3, 131, textureX, textureY); // Box 68
		bodyModel[59] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 71
		bodyModel[60] = new ModelRendererTurbo(this, 106, 113, textureX, textureY); // Box 72
		bodyModel[61] = new ModelRendererTurbo(this, 427, 394, textureX, textureY); // Box 74
		bodyModel[62] = new ModelRendererTurbo(this, 428, 406, textureX, textureY); // Box 75
		bodyModel[63] = new ModelRendererTurbo(this, 418, 398, textureX, textureY); // Box 76
		bodyModel[64] = new ModelRendererTurbo(this, 281, 387, textureX, textureY); // Box 78
		bodyModel[65] = new ModelRendererTurbo(this, 291, 388, textureX, textureY); // Box 79
		bodyModel[66] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 80
		bodyModel[67] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 81
		bodyModel[68] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 82
		bodyModel[69] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 83
		bodyModel[70] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 84
		bodyModel[71] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 85
		bodyModel[72] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 86
		bodyModel[73] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 87
		bodyModel[74] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 88
		bodyModel[75] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 90
		bodyModel[76] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 91
		bodyModel[77] = new ModelRendererTurbo(this, 417, 307, textureX, textureY); // Box 91
		bodyModel[78] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 92
		bodyModel[79] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 93
		bodyModel[80] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 94
		bodyModel[81] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 95
		bodyModel[82] = new ModelRendererTurbo(this, 439, 409, textureX, textureY); // Box 96
		bodyModel[83] = new ModelRendererTurbo(this, 374, 96, textureX, textureY); // Box 97
		bodyModel[84] = new ModelRendererTurbo(this, 366, 106, textureX, textureY); // Box 98
		bodyModel[85] = new ModelRendererTurbo(this, 454, 391, textureX, textureY); // Box 99
		bodyModel[86] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 145
		bodyModel[87] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 146
		bodyModel[88] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 147
		bodyModel[89] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 133
		bodyModel[90] = new ModelRendererTurbo(this, 251, 435, textureX, textureY); // Box 77

		bodyModel[0].addShapeBox(2F, 1F, -3F, 1, 8, 1, 0F,4.8F, 0.95F, -0.2F, -5.3F, 0.95F, -0.2F, -5.4F, 0.95F, 0F, 4.8F, 0.95F, 0F, -1.7F, 0F, -0.35F, 1.2F, 0F, -0.35F, 1.2F, 0F, 0F, -1.7F, 0F, 0F); // Box 105
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(2F, 1F, 1.8F, 1, 8, 1, 0F,4.8F, 1F, 0F, -5.4F, 1F, 0F, -5.3F, 1F, -0.2F, 4.8F, 1F, -0.2F, -1.7F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, -0.45F, -1.7F, 0F, -0.4F); // Box 106
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-3F, 1F, 1.8F, 1, 8, 1, 0F,-5.4F, 1F, 0F, 4.8F, 1F, 0F, 4.8F, 1F, -0.2F, -5.3F, 1F, -0.2F, 1.2F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, -0.4F, 1.2F, 0F, -0.45F); // Box 108
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(1F, 3.8F, -2.65F, 2, 2, 1, 0F,0.3F, 0F, 0F, 0.3F, 0F, -0.2F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.15F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 109
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-3.5F, 2.8F, -2.65F, 3, 1, 1, 0F,0.05F, 0F, -0.2F, 0.05F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0.05F, 0F, -0.15F, 0.05F, 0F, 0.15F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 110
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-0.4F, 8.6F, 1.55F, 5, 1, 1, 0F,-0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.3F, -0.25F, 0.2F, 0.1F, -0.25F, 0.2F, 0.1F, -0.25F, 0.2F, 0.1F, -0.25F, 0.2F, 0.3F); // Box 111
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4F, 7.8F, -3F, 3, 1, 1, 0F,0.05F, 0F, -0.2F, -0.15F, 0F, 0.05F, -0.2F, 0F, 0F, 0F, 0F, -0.3F, 0.05F, 0F, -0.15F, -0.15F, 0F, 0.15F, -0.2F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 111
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-4F, 8.03F, 2.2F, 2, 1, 2, 0F,-0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[7].setRotationPoint(0F, 0F, 0F);
		bodyModel[7].rotateAngleX = -0.01745329F;

		bodyModel[8].addShapeBox(1F, 7.8F, -3F, 3, 1, 1, 0F,-0.15F, 0F, 0.05F, 0.05F, 0F, -0.2F, 0F, 0F, -0.3F, -0.2F, 0F, 0F, -0.15F, 0F, 0.15F, 0.05F, 0F, -0.15F, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F); // Box 112
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-4F, 11.03F, 2.2F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F); // Box 113
		bodyModel[9].setRotationPoint(0F, 0F, 0F);
		bodyModel[9].rotateAngleX = -0.01745329F;

		bodyModel[10].addShapeBox(-3.5F, 7.5F, 2.7F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[10].setRotationPoint(0F, 0F, 0F);
		bodyModel[10].rotateAngleX = -0.01745329F;

		bodyModel[11].addShapeBox(-3.5F, 11.03F, 3.15F, 1, 1, 1, 0F,-0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 115
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-4F, 2F, -2.65F, 2, 7, 1, 0F,0F, 0F, -0.45F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.25F, 0F, 0F, -0.15F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 116
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-3.5F, 11.2F, 3.15F, 1, 1, 1, 0F,-0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 116
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-3.5F, 10.55F, 3.15F, 1, 1, 1, 0F,-0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Box 117
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-2F, 2F, -2.65F, 2, 9, 1, 0F,0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 118
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-3.5F, 10.03F, 3.15F, 1, 1, 1, 0F,-0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 118
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-3.5F, 10.2F, 3.15F, 1, 1, 1, 0F,-0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 119
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-3.5F, 9.55F, 3.15F, 1, 1, 1, 0F,-0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Box 120
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(0F, 2F, -2.65F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 120
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-3.5F, 9.03F, 3.15F, 1, 1, 1, 0F,-0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 121
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(2F, 2F, -2.65F, 2, 7, 1, 0F,0F, 0F, -0.15F, 0F, 0F, -0.45F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.25F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 121
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-3.5F, 9.2F, 3.15F, 1, 1, 1, 0F,-0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 122
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-4F, 1F, -2.65F, 2, 1, 1, 0F,0F, 1F, -0.45F, 0F, 0.8F, -0.15F, 0F, 0.8F, 0F, 0F, 1F, -0.3F, 0F, 0F, -0.45F, 0F, 0F, -0.15F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 122
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-3.5F, 8.55F, 3.15F, 1, 1, 1, 0F,-0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Box 123
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(2F, 1F, -2.65F, 2, 1, 1, 0F,0F, 0.8F, -0.15F, 0F, 1F, -0.45F, 0F, 1F, -0.3F, 0F, 0.8F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.45F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 123
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-2F, 1F, -2.65F, 2, 1, 1, 0F,0F, 0.8F, -0.15F, 0F, -0.1F, 0F, 0F, -0.1F, -0.3F, 0F, 0.8F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 125
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(0F, 1F, -2.65F, 2, 1, 1, 0F,0F, -0.1F, -0.05F, 0F, 0.8F, -0.15F, 0F, 0.8F, 0F, 0F, -0.1F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 126
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-0.4F, 9.7F, 1.55F, 5, 4, 1, 0F,-0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0.2F, -0.25F, 0.2F, -0.9F, -0.35F, 0.2F, -0.9F, -0.35F, 0.2F, 0.7F, -0.25F, 0.2F, 0.7F); // Box 127
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-2F, 8.8F, 1.53F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0.2F, 0.05F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.2F, 0.05F, 0F, 0.05F); // Box 129
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(0F, 8.8F, -2.65F, 2, 1, 1, 0F,0F, 0F, 0.2F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0.2F, 0.05F, 0F, 0.05F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 130
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(2F, 8.8F, -2.65F, 2, 1, 5, 0F,0.05F, 0F, 0F, 0.2F, 0F, -0.15F, 0.2F, 0F, -0.1F, 0F, 0F, 0F, 0.05F, 0F, 0.05F, 0.25F, 0F, -0.15F, 0.25F, 0F, -0.1F, 0F, 0F, -0.3F); // Box 131
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-3F, 3.8F, -2.65F, 2, 2, 1, 0F,0.3F, 0F, -0.2F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0.3F, 0F, -0.15F, 0.3F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 133
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(0.5F, 2.8F, -2.65F, 3, 1, 1, 0F,0.05F, 0F, 0.05F, 0.05F, 0F, -0.2F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0.05F, 0F, 0.15F, 0.05F, 0F, -0.15F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 134
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-4F, 9F, -2.65F, 2, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.15F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.15F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.3F, 0.15F, 0F, -0.2F); // Box 138
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(2F, 9F, -2.65F, 2, 3, 1, 0F,0F, 0F, -0.15F, 0F, 0F, -0.25F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.15F, 0.15F, 0F, -0.15F, 0.15F, 0F, -0.2F, 0F, 0F, -0.3F); // Box 139
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-2F, 1F, -2.68F, 2, 1, 1, 0F,-0.4F, 1F, -0.15F, 0F, -0.1F, 0F, 0F, -0.1F, -0.3F, -0.4F, 1F, 0F, 1.6F, -2F, -0.15F, 0F, 0F, 0F, 0F, 0F, -0.3F, 1F, -2F, -0.15F); // Box 140
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-2F, 1F, -2.65F, 2, 1, 1, 0F,0.3F, 0.3F, -0.1F, -1.65F, -0.05F, -0.1F, -1.65F, -0.05F, 0F, 0.3F, 0.3F, 0F, 1F, -0.8F, -0.2F, 0F, -0.075F, 0.05F, 0F, -0.075F, -0.3F, 1F, -0.8F, -0.15F); // Box 148
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(0F, 1F, -2.65F, 2, 1, 1, 0F,0F, -0.1F, 0F, -0.4F, 1F, -0.15F, -0.4F, 1F, 0F, 0F, -0.1F, -0.3F, 0F, 0F, 0F, 1.6F, -2F, -0.15F, 1F, -2F, -0.15F, 0F, 0F, -0.3F); // Box 149
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(0F, 1F, -2.65F, 2, 1, 1, 0F,-1.65F, -0.05F, -0.1F, 0.3F, 0.3F, -0.1F, 0.3F, 0.3F, 0F, -1.65F, -0.05F, 0F, 0F, -0.075F, 0.05F, 1F, -0.8F, -0.2F, 1F, -0.8F, -0.15F, 0F, -0.075F, -0.3F); // Box 150
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addBox(-3F, -0.01F, -2F, 1, 1, 4, 0F); // Box 154
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addBox(2F, -0.01F, -2F, 1, 1, 4, 0F); // Box 155
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addBox(-2F, 0.99F, -1F, 4, 1, 3, 0F); // Box 156
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(-0.8F, 1.85F, -2.66F, 1, 9, 1, 0F,-0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, 0F, -0.45F, 0F, 0F); // Box 157
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(-0.5F, 2.2F, -2.65F, 1, 1, 1, 0F,-0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 159
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(-4F, 1F, 1.5F, 2, 1, 1, 0F,0F, 1F, -0.3F, 0F, 0.8F, 0F, 0F, 0.8F, -0.15F, 0F, 1F, -0.45F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.15F, 0F, 0F, -0.45F); // Box 165
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(2F, 1F, 1.5F, 2, 1, 1, 0F,0F, 0.8F, 0F, 0F, 1F, -0.3F, 0F, 1F, -0.45F, 0F, 0.8F, -0.15F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.45F, 0F, 0F, -0.15F); // Box 166
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(0F, 1F, 1.5F, 2, 1, 1, 0F,0F, 0.7F, -0.3F, 0F, 0.8F, 0F, 0F, 0.8F, -0.15F, 0F, 0.7F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.15F, 0F, 0F, 0F); // Box 167
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(-2F, 1F, 1.5F, 2, 1, 1, 0F,0F, 0.8F, 0F, 0F, 0.7F, -0.3F, 0F, 0.7F, 0F, 0F, 0.8F, -0.15F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.15F); // Box 168
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(-4F, 2F, 1.5F, 2, 7, 1, 0F,0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.45F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.15F, 0F, 0F, -0.25F); // Box 169
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(-2F, 2F, 1.5F, 2, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.15F); // Box 170
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(0F, 2F, 1.5F, 2, 10, 1, 0F,0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.15F, 0F, 0F, 0F); // Box 171
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(2F, 2F, 1.5F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.45F, 0F, 0F, -0.15F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.25F, 0F, 0F, -0.15F); // Box 172
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(-4F, 0F, 1.5F, 2, 3, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.15F, 0F, 0F, -0.25F, 0.15F, 0F, -0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.15F, 0.15F, 0F, -0.15F); // Box 173
		bodyModel[53].setRotationPoint(0F, 9F, 0F);

		bodyModel[54].addShapeBox(2F, 9F, 1.5F, 2, 3, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.25F, 0F, 0F, -0.15F, 0F, 0F, -0.3F, 0.15F, 0F, -0.2F, 0.15F, 0F, -0.15F, 0F, 0F, -0.15F); // Box 174
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(-2F, 8.8F, -2.65F, 2, 1, 1, 0F,0.05F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0.05F, 0F, 0.05F, 0F, 0F, 0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 176
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addShapeBox(2F, 8.8F, 1.53F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.3F, 0.15F, 0F, -0.15F, 0.05F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.15F, 0F, -0.15F, 0.05F, 0F, 0.05F); // Box 177
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addShapeBox(0F, 8.8F, 1.53F, 2, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.05F, 0F, 0.05F, 0F, 0F, 0.2F); // Box 178
		bodyModel[57].setRotationPoint(0F, 0F, 0F);

		bodyModel[58].addShapeBox(3F, -0.01F, -2F, 1, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.4F, 0.25F, 0F, 0.3F, 0F, 0F, 0F); // Box 68
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addBox(-3.5F, 1.4F, -2F, 7, 1, 3, 0F); // Box 71
		bodyModel[59].setRotationPoint(0F, 0F, 0F);

		bodyModel[60].addShapeBox(-4F, -0.01F, -2F, 1, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.3F); // Box 72
		bodyModel[60].setRotationPoint(0F, 0F, 0F);

		bodyModel[61].addShapeBox(2.6F, 8.83F, -1.1F, 2, 3, 2, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F); // Box 74
		bodyModel[61].setRotationPoint(0F, 0F, 0F);

		bodyModel[62].addShapeBox(2.6F, 11.42F, -1.1F, 2, 3, 2, 0F,0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 75
		bodyModel[62].setRotationPoint(0F, 0F, 0F);

		bodyModel[63].addShapeBox(2.6F, 14.4F, -0.45F, 2, 3, 2, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0.3F, -0.15F, 0F, 0.3F, -0.15F); // Box 76
		bodyModel[63].setRotationPoint(0F, 0F, 0F);

		bodyModel[64].addShapeBox(-4F, 8.8F, 1.53F, 2, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.15F, 0F, -0.15F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.05F, 0F, 0.05F, 0.15F, 0F, -0.15F); // Box 78
		bodyModel[64].setRotationPoint(0F, 0F, 0F);

		bodyModel[65].addShapeBox(-4F, 8.8F, -2.65F, 2, 1, 5, 0F,0.2F, 0F, -0.15F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, -0.1F, 0.25F, 0F, -0.15F, 0.05F, 0F, 0.05F, 0F, 0F, -0.3F, 0.25F, 0F, -0.1F); // Box 79
		bodyModel[65].setRotationPoint(0F, 0F, 0F);

		bodyModel[66].addShapeBox(-2F, 11F, -2.65F, 2, 1, 1, 0F,0F, 0F, -0.15F, -0.2F, 0F, 0F, -0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.15F, -0.35F, 0F, 0F, -0.35F, 0F, -0.3F, 0F, 0F, 0F); // Box 80
		bodyModel[66].setRotationPoint(0F, 0F, 0F);

		bodyModel[67].addShapeBox(0F, 11F, -2.65F, 2, 1, 1, 0F,0.2F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.3F, 0.2F, 0F, -0.3F, -0.05F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0F, -0.05F, 0F, -0.3F); // Box 81
		bodyModel[67].setRotationPoint(0F, 0F, 0F);

		bodyModel[68].addShapeBox(-0.5F, 1.55F, -2.65F, 1, 1, 1, 0F,-0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Box 82
		bodyModel[68].setRotationPoint(0F, 0F, 0F);

		bodyModel[69].addShapeBox(-0.5F, 2.03F, -2.65F, 1, 1, 1, 0F,-0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 83
		bodyModel[69].setRotationPoint(0F, 0F, 0F);

		bodyModel[70].addShapeBox(-0.5F, 3.53F, -2.65F, 1, 1, 1, 0F,-0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 84
		bodyModel[70].setRotationPoint(0F, 0F, 0F);

		bodyModel[71].addShapeBox(-0.5F, 5.03F, -2.65F, 1, 1, 1, 0F,-0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 85
		bodyModel[71].setRotationPoint(0F, 0F, 0F);

		bodyModel[72].addShapeBox(-0.5F, 6.53F, -2.65F, 1, 1, 1, 0F,-0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 86
		bodyModel[72].setRotationPoint(0F, 0F, 0F);

		bodyModel[73].addShapeBox(-0.5F, 8.03F, -2.65F, 1, 1, 1, 0F,-0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 87
		bodyModel[73].setRotationPoint(0F, 0F, 0F);

		bodyModel[74].addShapeBox(-0.5F, 3.7F, -2.65F, 1, 1, 1, 0F,-0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 88
		bodyModel[74].setRotationPoint(0F, 0F, 0F);

		bodyModel[75].addShapeBox(-0.5F, 5.2F, -2.65F, 1, 1, 1, 0F,-0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 90
		bodyModel[75].setRotationPoint(0F, 0F, 0F);

		bodyModel[76].addShapeBox(-0.5F, 8.2F, -2.65F, 1, 1, 1, 0F,-0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 91
		bodyModel[76].setRotationPoint(0F, 0F, 0F);

		bodyModel[77].addBox(-4F, 9.03F, 2.2F, 2, 2, 2, 0F); // Box 91
		bodyModel[77].setRotationPoint(0F, 0F, 0F);
		bodyModel[77].rotateAngleX = -0.01745329F;

		bodyModel[78].addShapeBox(-0.5F, 4.55F, -2.65F, 1, 1, 1, 0F,-0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Box 92
		bodyModel[78].setRotationPoint(0F, 0F, 0F);

		bodyModel[79].addShapeBox(-0.5F, 7.55F, -2.65F, 1, 1, 1, 0F,-0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Box 93
		bodyModel[79].setRotationPoint(0F, 0F, 0F);

		bodyModel[80].addShapeBox(-0.5F, 3.05F, -2.65F, 1, 1, 1, 0F,-0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Box 94
		bodyModel[80].setRotationPoint(0F, 0F, 0F);

		bodyModel[81].addShapeBox(-0.5F, 6.05F, -2.65F, 1, 1, 1, 0F,-0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Box 95
		bodyModel[81].setRotationPoint(0F, 0F, 0F);

		bodyModel[82].addShapeBox(2.6F, 17.7F, -0.25F, 2, 3, 2, 0F,0F, 0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F); // Box 96
		bodyModel[82].setRotationPoint(0F, 0F, 0F);

		bodyModel[83].addShapeBox(-3.6F, 8.5F, -2.85F, 2, 2, 1, 0F,0.3F, 0F, -0.1F, 0.3F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0.3F, 0F, -0.15F, 0.3F, 0F, 0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 97
		bodyModel[83].setRotationPoint(0F, 0F, 0F);

		bodyModel[84].addShapeBox(1.6F, 8.5F, -2.8F, 2, 2, 1, 0F,0.3F, 0F, 0.2F, 0.3F, 0F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0.3F, 0F, 0.2F, 0.3F, 0F, -0.15F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 98
		bodyModel[84].setRotationPoint(0F, 0F, 0F);

		bodyModel[85].addShapeBox(-3F, 1F, -3F, 1, 8, 1, 0F,-5.3F, 0.95F, -0.2F, 4.8F, 0.95F, -0.2F, 4.8F, 0.95F, 0F, -5.4F, 0.95F, 0F, 1.2F, 0F, -0.35F, -1.7F, 0F, -0.35F, -1.7F, 0F, 0F, 1.2F, 0F, 0F); // Box 99
		bodyModel[85].setRotationPoint(0F, 0F, 0F);

		bodyModel[86].addShapeBox(1.5F, 9.43F, 1.9F, 1, 1, 1, 0F,-0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 145
		bodyModel[86].setRotationPoint(0F, 0F, 0F);

		bodyModel[87].addShapeBox(1.5F, 9.6F, 1.9F, 1, 1, 1, 0F,-0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 146
		bodyModel[87].setRotationPoint(0F, 0F, 0F);

		bodyModel[88].addShapeBox(1.5F, 8.95F, 1.9F, 1, 1, 1, 0F,-0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Box 147
		bodyModel[88].setRotationPoint(0F, 0F, 0F);

		bodyModel[89].addShapeBox(-0.5F, 6.7F, -2.65F, 1, 1, 1, 0F,-0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 133
		bodyModel[89].setRotationPoint(0F, 0F, 0F);

		bodyModel[90].addShapeBox(2.6F, 5.83F, -1.25F, 2, 3, 2, 0F,-0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F); // Box 77
		bodyModel[90].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 101
		leftArmModel[1] = new ModelRendererTurbo(this, 241, 432, textureX, textureY); // Box 124
		leftArmModel[2] = new ModelRendererTurbo(this, 3, 124, textureX, textureY); // Box 125
		leftArmModel[3] = new ModelRendererTurbo(this, 5, 91, textureX, textureY); // Box 126
		leftArmModel[4] = new ModelRendererTurbo(this, -254, 19, textureX, textureY); // Box 69
		leftArmModel[5] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 95
		leftArmModel[6] = new ModelRendererTurbo(this, 408, 220, textureX, textureY); // Box 149

		leftArmModel[0].addShapeBox(-1F, 7.99F, -2F, 4, 1, 4, 0F,0.02F, 0F, 0.1F, 0.02F, 0F, 0.1F, 0.02F, 0F, 0.1F, 0.02F, 0F, 0.1F, 0.02F, -0.5F, 0.1F, 0.02F, -0.5F, 0.1F, 0.02F, -0.5F, 0.1F, 0.02F, -0.5F, 0.1F); // Box 101
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, -2.2F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F); // Box 124
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(1.85F, -2.1F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F); // Box 125
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(-0.98F, -2.1F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F); // Box 126
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(-1F, -2.01F, -2F, 4, 5, 4, 0F,0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F); // Box 69
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(-1F, 2.99F, -2F, 4, 5, 4, 0F,0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F); // Box 95
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addBox(-1F, 7.99F, -2F, 4, 1, 4, 0F); // Box 149
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 241, 430, textureX, textureY); // Box 130
		rightArmModel[1] = new ModelRendererTurbo(this, 5, 91, textureX, textureY); // Box 131
		rightArmModel[2] = new ModelRendererTurbo(this, 5, 91, textureX, textureY); // Box 132
		rightArmModel[3] = new ModelRendererTurbo(this, 311, 86, textureX, textureY); // Box 151
		rightArmModel[4] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 152
		rightArmModel[5] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 153
		rightArmModel[6] = new ModelRendererTurbo(this, 391, 208, textureX, textureY); // Box 148

		rightArmModel[0].addShapeBox(-2F, -2.2F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F); // Box 130
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(0.8F, -2.1F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F); // Box 131
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-1.98F, -2.1F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F); // Box 132
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3F, -2.01F, -2F, 4, 5, 4, 0F,0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F); // Box 151
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-3F, 2.99F, -2F, 4, 5, 4, 0F,0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F); // Box 152
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-3F, 7.99F, -2F, 4, 1, 4, 0F,0.02F, 0F, 0.1F, 0.02F, 0F, 0.1F, 0.02F, 0F, 0.1F, 0.02F, 0F, 0.1F, 0.02F, -0.5F, 0.1F, 0.02F, -0.5F, 0.1F, 0.02F, -0.5F, 0.1F, 0.02F, -0.5F, 0.1F); // Box 153
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);

		rightArmModel[6].addBox(-3F, 7.99F, -2F, 4, 1, 4, 0F); // Box 148
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 464, 433, textureX, textureY); // Box 107
		leftLegModel[1] = new ModelRendererTurbo(this, 187, 293, textureX, textureY); // Box 109
		leftLegModel[2] = new ModelRendererTurbo(this, 207, 300, textureX, textureY); // Box 110
		leftLegModel[3] = new ModelRendererTurbo(this, 437, 442, textureX, textureY); // Box 114
		leftLegModel[4] = new ModelRendererTurbo(this, 451, 456, textureX, textureY); // Box 78
		leftLegModel[5] = new ModelRendererTurbo(this, 444, 471, textureX, textureY); // Box 88

		leftLegModel[0].addShapeBox(-2F, 9F, -2.75F, 4, 1, 1, 0F,-0.5F, -0.5F, -0.55F, -0.5F, -0.5F, -0.55F, -0.5F, -0.4F, 1F, -0.5F, -0.4F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, -0.05F, 0F, -0.25F); // Box 107
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, -2F, -2F, 4, 4, 4, 0F,0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.45F, 0.5F, 0F, 0.55F, 0.5F, 0F, 0.55F, 0F, 0F, 0.15F); // Box 109
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 2F, -2F, 4, 3, 4, 0F,0F, 0F, 0.45F, 0.5F, 0F, 0.55F, 0.5F, 0F, 0.55F, 0F, 0F, 0.45F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 110
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 5F, -2F, 4, 7, 4, 0F,0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F); // Box 114
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-2F, 10F, -2.75F, 4, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, -0.05F, 0F, -0.25F); // Box 78
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-2F, 5F, -2F, 4, 1, 4, 0F,0.08F, 0F, 0.08F, 0.08F, 0F, 0.08F, 0.08F, 0F, 0.08F, 0.08F, 0F, 0.08F, 0.08F, 0F, 0.08F, 0.08F, 0F, 0.08F, 0.08F, 0F, 0.08F, 0.08F, 0F, 0.08F); // Box 88
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 273, 302, textureX, textureY); // Box 112
		rightLegModel[1] = new ModelRendererTurbo(this, 267, 295, textureX, textureY); // Box 113
		rightLegModel[2] = new ModelRendererTurbo(this, 422, 443, textureX, textureY); // Box 115
		rightLegModel[3] = new ModelRendererTurbo(this, 448, 454, textureX, textureY); // Box 76
		rightLegModel[4] = new ModelRendererTurbo(this, 440, 442, textureX, textureY); // Box 79
		rightLegModel[5] = new ModelRendererTurbo(this, 470, 473, textureX, textureY); // Box 87

		rightLegModel[0].addShapeBox(-2F, -2F, -2F, 4, 4, 4, 0F,0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.55F, 0F, 0F, 0.45F, 0F, 0F, 0.15F, 0.5F, 0F, 0.55F); // Box 112
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 2F, -2F, 4, 3, 4, 0F,0.5F, 0F, 0.55F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0.5F, 0F, 0.55F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.05F, 0F, 0.1F); // Box 113
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 5F, -2F, 4, 7, 4, 0F,0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F); // Box 115
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 10F, -2.75F, 4, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, -0.05F, 0F, -0.25F); // Box 76
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2F, 9F, -2.75F, 4, 1, 1, 0F,-0.5F, -0.5F, -0.55F, -0.5F, -0.5F, -0.55F, -0.5F, -0.4F, 1F, -0.5F, -0.4F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, -0.05F, 0F, -0.25F); // Box 79
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-2F, 5F, -2F, 4, 1, 4, 0F,0.08F, 0F, 0.08F, 0.08F, 0F, 0.08F, 0.08F, 0F, 0.08F, 0.08F, 0F, 0.08F, 0.08F, 0F, 0.08F, 0.08F, 0F, 0.08F, 0.08F, 0F, 0.08F, 0.08F, 0F, 0.08F); // Box 87
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);
	}
}