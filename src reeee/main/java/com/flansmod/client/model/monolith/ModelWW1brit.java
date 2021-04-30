//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelWW1brit extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelWW1brit() //Same as Filename
	{
		headModel = new ModelRendererTurbo[6];
		bodyModel = new ModelRendererTurbo[79];
		leftArmModel = new ModelRendererTurbo[2];
		rightArmModel = new ModelRendererTurbo[2];
		leftLegModel = new ModelRendererTurbo[5];
		rightLegModel = new ModelRendererTurbo[5];

		initheadModel_1();
		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 7, 87, textureX, textureY); // Import Box3
		headModel[1] = new ModelRendererTurbo(this, 2, 84, textureX, textureY); // Import Box3
		headModel[2] = new ModelRendererTurbo(this, 4, 84, textureX, textureY); // Import Box3
		headModel[3] = new ModelRendererTurbo(this, 2, 85, textureX, textureY); // Import Box3
		headModel[4] = new ModelRendererTurbo(this, 5, 87, textureX, textureY); // Import Box3
		headModel[5] = new ModelRendererTurbo(this, 23, 6, textureX, textureY); // Import Box5

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 2, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.4F, 0.2F, 0.8F, 0.4F, 0.2F, 0.8F, 1F, 0.4F, 0.1F, 1F, 0.4F, 0.1F); // Import Box3
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -9F, -4F, 8, 1, 8, 0F,-0.9F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F, 0F, -0.9F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F); // Import Box3
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -8F, 0.2F, 8, 2, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 1F, 0.4F, 0.1F, 1F, 0.4F, 0.1F, 0.1F, 0.5F, 0.9F, 0.1F, 0.5F, 0.9F); // Import Box3
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -5.5F, 0.4F, 8, 1, 4, 0F,0.4F, 0.6F, 0.3F, 0.4F, 0.6F, 0.3F, 0.1F, 0.5F, 0.2F, 0.1F, 0.5F, 0.2F, 2.5F, -0.9F, 0.3F, 2.5F, -0.9F, 0.3F, 1F, -0.7F, 2.5F, 1F, -0.7F, 2.5F); // Import Box3
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -5.5F, -4.2F, 8, 1, 4, 0F,0F, 0.8F, 0.4F, 0F, 0.8F, 0.4F, 0.4F, 0.6F, 0.3F, 0.4F, 0.6F, 0.3F, 1F, -1.3F, 2.5F, 1F, -1.3F, 2.5F, 2.5F, -0.9F, 0.3F, 2.5F, -0.9F, 0.3F); // Import Box3
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4.5F, -5.7F, -0.5F, 9, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 3.8F, 2.8F, -0.4F, 3.8F, 2.8F, -0.4F, 3.8F, -3.2F, -0.4F, 3.8F, -3.2F); // Import Box5
		headModel[5].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 99, 9, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 85, 32, textureX, textureY); // Box 11
		bodyModel[2] = new ModelRendererTurbo(this, 81, 37, textureX, textureY); // Box 12
		bodyModel[3] = new ModelRendererTurbo(this, 101, 7, textureX, textureY); // Box 34
		bodyModel[4] = new ModelRendererTurbo(this, 67, 65, textureX, textureY); // Box 28
		bodyModel[5] = new ModelRendererTurbo(this, 60, 56, textureX, textureY); // Box 29
		bodyModel[6] = new ModelRendererTurbo(this, 44, 59, textureX, textureY); // Box 0
		bodyModel[7] = new ModelRendererTurbo(this, 40, 59, textureX, textureY); // Box 1
		bodyModel[8] = new ModelRendererTurbo(this, 100, 81, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 70, 58, textureX, textureY); // Box 12
		bodyModel[10] = new ModelRendererTurbo(this, 119, 50, textureX, textureY); // Box 18
		bodyModel[11] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 50
		bodyModel[12] = new ModelRendererTurbo(this, 96, 56, textureX, textureY); // Box 51
		bodyModel[13] = new ModelRendererTurbo(this, 71, 30, textureX, textureY); // Box 52
		bodyModel[14] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 53
		bodyModel[15] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 39
		bodyModel[16] = new ModelRendererTurbo(this, 93, 17, textureX, textureY); // Box 33
		bodyModel[17] = new ModelRendererTurbo(this, 92, 45, textureX, textureY); // Box 26
		bodyModel[18] = new ModelRendererTurbo(this, 92, 45, textureX, textureY); // Box 102
		bodyModel[19] = new ModelRendererTurbo(this, 47, 46, textureX, textureY); // Box 129
		bodyModel[20] = new ModelRendererTurbo(this, 32, 53, textureX, textureY); // Box 130
		bodyModel[21] = new ModelRendererTurbo(this, 114, 57, textureX, textureY); // Box 131
		bodyModel[22] = new ModelRendererTurbo(this, 119, 53, textureX, textureY); // Box 132
		bodyModel[23] = new ModelRendererTurbo(this, 38, 54, textureX, textureY); // Box 133
		bodyModel[24] = new ModelRendererTurbo(this, 25, 55, textureX, textureY); // Box 134
		bodyModel[25] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 158
		bodyModel[26] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 160
		bodyModel[27] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 161
		bodyModel[28] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 162
		bodyModel[29] = new ModelRendererTurbo(this, 100, 72, textureX, textureY); // Box 23
		bodyModel[30] = new ModelRendererTurbo(this, 62, 51, textureX, textureY); // Box 24
		bodyModel[31] = new ModelRendererTurbo(this, 111, 73, textureX, textureY); // Box 115
		bodyModel[32] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 116
		bodyModel[33] = new ModelRendererTurbo(this, 34, 51, textureX, textureY); // Box 117
		bodyModel[34] = new ModelRendererTurbo(this, 98, 75, textureX, textureY); // Box 118
		bodyModel[35] = new ModelRendererTurbo(this, 97, 61, textureX, textureY); // Box 119
		bodyModel[36] = new ModelRendererTurbo(this, 105, 55, textureX, textureY); // Box 120
		bodyModel[37] = new ModelRendererTurbo(this, 99, 65, textureX, textureY); // Box 121
		bodyModel[38] = new ModelRendererTurbo(this, 100, 64, textureX, textureY); // Box 123
		bodyModel[39] = new ModelRendererTurbo(this, 97, 61, textureX, textureY); // Box 124
		bodyModel[40] = new ModelRendererTurbo(this, 104, 66, textureX, textureY); // Box 125
		bodyModel[41] = new ModelRendererTurbo(this, 119, 79, textureX, textureY); // Box 156
		bodyModel[42] = new ModelRendererTurbo(this, 62, 50, textureX, textureY); // Box 158
		bodyModel[43] = new ModelRendererTurbo(this, 61, 36, textureX, textureY); // Box 92
		bodyModel[44] = new ModelRendererTurbo(this, 119, 51, textureX, textureY); // Box 93
		bodyModel[45] = new ModelRendererTurbo(this, 93, 82, textureX, textureY); // Box 101
		bodyModel[46] = new ModelRendererTurbo(this, 73, 36, textureX, textureY); // Box 102
		bodyModel[47] = new ModelRendererTurbo(this, 67, 54, textureX, textureY); // Box 105
		bodyModel[48] = new ModelRendererTurbo(this, 118, 48, textureX, textureY); // Box 106
		bodyModel[49] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 107
		bodyModel[50] = new ModelRendererTurbo(this, 3, 22, textureX, textureY); // Box 175
		bodyModel[51] = new ModelRendererTurbo(this, 2, 18, textureX, textureY); // Box 177
		bodyModel[52] = new ModelRendererTurbo(this, 4, 25, textureX, textureY); // Box 176
		bodyModel[53] = new ModelRendererTurbo(this, 6, 29, textureX, textureY); // Box 179
		bodyModel[54] = new ModelRendererTurbo(this, 3, 29, textureX, textureY); // Box 178
		bodyModel[55] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 180
		bodyModel[56] = new ModelRendererTurbo(this, 101, 78, textureX, textureY); // Box 181
		bodyModel[57] = new ModelRendererTurbo(this, 96, 59, textureX, textureY); // Box 185
		bodyModel[58] = new ModelRendererTurbo(this, 95, 57, textureX, textureY); // Box 186
		bodyModel[59] = new ModelRendererTurbo(this, 104, 55, textureX, textureY); // Box 105
		bodyModel[60] = new ModelRendererTurbo(this, 94, 73, textureX, textureY); // Box 99
		bodyModel[61] = new ModelRendererTurbo(this, 116, 51, textureX, textureY); // Box 83
		bodyModel[62] = new ModelRendererTurbo(this, 116, 50, textureX, textureY); // Box 171
		bodyModel[63] = new ModelRendererTurbo(this, 116, 50, textureX, textureY); // Box 82
		bodyModel[64] = new ModelRendererTurbo(this, 116, 54, textureX, textureY); // Box 127
		bodyModel[65] = new ModelRendererTurbo(this, 116, 54, textureX, textureY); // Box 128
		bodyModel[66] = new ModelRendererTurbo(this, 116, 54, textureX, textureY); // Box 129
		bodyModel[67] = new ModelRendererTurbo(this, 115, 56, textureX, textureY); // Box 130
		bodyModel[68] = new ModelRendererTurbo(this, 115, 57, textureX, textureY); // Box 131
		bodyModel[69] = new ModelRendererTurbo(this, 115, 57, textureX, textureY); // Box 132
		bodyModel[70] = new ModelRendererTurbo(this, 116, 52, textureX, textureY); // Box 133
		bodyModel[71] = new ModelRendererTurbo(this, 118, 49, textureX, textureY); // Box 134
		bodyModel[72] = new ModelRendererTurbo(this, 117, 51, textureX, textureY); // Box 135
		bodyModel[73] = new ModelRendererTurbo(this, 104, 58, textureX, textureY); // Box 204
		bodyModel[74] = new ModelRendererTurbo(this, 99, 57, textureX, textureY); // Box 205
		bodyModel[75] = new ModelRendererTurbo(this, 97, 63, textureX, textureY); // Box 207
		bodyModel[76] = new ModelRendererTurbo(this, 96, 56, textureX, textureY); // Box 139
		bodyModel[77] = new ModelRendererTurbo(this, 99, 61, textureX, textureY); // Box 140
		bodyModel[78] = new ModelRendererTurbo(this, 95, 64, textureX, textureY); // Box 141

		bodyModel[0].addShapeBox(-4F, -0.1F, -2F, 4, 2, 4, 0F,0.1F, 0F, 0.1F, -1F, 0F, 0.1F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F); // Box 1
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-0.5F, -0.1F, -2.15F, 2, 2, 1, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-1.5F, -0.1F, -2.12F, 2, 2, 1, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 12
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(0F, -0.1F, -2F, 4, 2, 4, 0F,-1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0F, -0.5F, 0.1F); // Box 34
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-3.5F, 2.88657986402541E-15F, -2.3F, 1, 7, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 28
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(2.5F, 2.88657986402541E-15F, -2.3F, 1, 7, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 29
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-3.5F, 0.3F, -2.27F, 1, 4, 1, 0F,0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F); // Box 0
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(2.5F, 0.3F, -2.27F, 1, 4, 1, 0F,0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F); // Box 1
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(1.5F, 8.2F, -3.8F, 2, 3, 2, 0F,-0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F); // Box 9
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(1.5F, 7.65F, -3.8F, 2, 1, 2, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.4F, -0.2F, 0F, 0.4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 12
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(2F, 8.5F, -4.05F, 1, 1, 1, 0F,-0.3F, 0.1F, -0.4F, -0.3F, 0.1F, -0.4F, -0.3F, 0.1F, -0.4F, -0.3F, 0.1F, -0.4F, -0.2F, -0.5F, -0.4F, -0.2F, -0.5F, -0.4F, -0.2F, -0.5F, -0.4F, -0.2F, -0.5F, -0.4F); // Box 18
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addBox(0.9F, 2.5F, -2.2F, 3, 1, 1, 0F); // Box 50
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-3.9F, 2.5F, -2.2F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addBox(-3.9F, 3.5F, -2.15F, 3, 2, 1, 0F); // Box 52
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addBox(0.9F, 3.5F, -2.15F, 3, 2, 1, 0F); // Box 53
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-0.5F, 1.3F, -2.15F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 39
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-4F, 1.9F, -2F, 8, 10, 4, 0F,0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 33
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-4F, 9.5F, -2.5F, 4, 1, 5, 0F,0.2F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F); // Box 26
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(0.2F, 9.5F, -2.5F, 4, 1, 5, 0F,0.2F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F); // Box 102
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-3.5F, 7F, -2.3F, 1, 2, 1, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 129
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(2.5F, 7F, -2.3F, 1, 2, 1, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 130
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-3.5F, 6.6F, -2.35F, 1, 1, 1, 0F,-0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F); // Box 131
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(2.5F, 6.6F, -2.35F, 1, 1, 1, 0F,-0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F); // Box 132
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-3.5F, -0.2F, -1.3F, 1, 1, 4, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, -1F, 0.4F, 0F, 1.5F, 0.4F, 0F, 1.5F, 0.4F, -0.45F, -1F, 0.4F, -0.45F); // Box 133
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(2.5F, -0.2F, -1.3F, 1, 1, 4, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 1.5F, 0.4F, 0F, -1F, 0.4F, 0F, -1F, 0.4F, -0.45F, 1.5F, 0.4F, -0.45F); // Box 134
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-2F, 1.2F, 1.25F, 4, 1, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0.2F, 0F, -1F, 0.2F, 0F, -1F, 0.2F, 0F, -1F, 0.2F, 0F); // Box 158
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-0.5F, 2.6F, 1.25F, 1, 3, 1, 0F,-0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 160
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(0F, 5.6F, 1.25F, 2, 3, 1, 0F,0F, 0F, 0F, -1.6F, 0F, 0F, -1.6F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -1F, 0F, 0F); // Box 161
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-2F, 5.6F, 1.25F, 2, 3, 1, 0F,-1.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.6F, 0F, 0F, -0.6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.6F, 0F, 0F); // Box 162
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(2.55F, 9F, 2F, 1, 1, 1, 0F,0.5F, 0.6F, 0.2F, 0.5F, 0.6F, 0.2F, 0.5F, 0.6F, 0.2F, 0.5F, 0.6F, 0.2F, 0.5F, 0.6F, 0.2F, 0.5F, 0.6F, 0.2F, 0.5F, 0.6F, 0.2F, 0.5F, 0.6F, 0.2F); // Box 23
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(2.55F, 7.75F, 2F, 1, 1, 1, 0F,0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.5F, -0.3F, 0.2F, 0.5F, -0.3F, 0.2F, 0.5F, -0.3F, 0.2F, 0.5F, -0.3F, 0.2F); // Box 24
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(-2F, 9.5F, 2F, 4, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 115
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-2F, 7.7F, 2.1F, 4, 1, 2, 0F,0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F); // Box 116
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(-2F, 8.7F, 2.1F, 4, 1, 2, 0F,0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 117
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-2F, 10.5F, 2F, 4, 1, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, -0.25F, -0.5F, -0.3F, -0.25F, -0.5F, -0.3F, -0.25F, -0.5F, -0.3F, -0.25F); // Box 118
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(0.5F, 9F, 3.15F, 1, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 119
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-1.5F, 9F, 3.15F, 1, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 120
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(0.5F, 8F, 2.15F, 1, 1, 2, 0F,-0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, -0.25F, -0.2F, 0.35F, -0.25F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 121
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-1.5F, 8F, 2.15F, 1, 1, 2, 0F,-0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, -0.25F, -0.2F, 0.35F, -0.25F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 123
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(0.5F, 10.8F, 3.15F, 1, 1, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.55F, 0F, -0.2F, -0.55F, 0F, -0.2F, -0.55F, -0.3F, -0.2F, -0.55F, -0.3F); // Box 124
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(-1.5F, 10.8F, 3.15F, 1, 1, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.55F, 0F, -0.2F, -0.55F, 0F, -0.2F, -0.55F, -0.3F, -0.2F, -0.55F, -0.3F); // Box 125
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(-3.55F, 9F, 2F, 1, 1, 1, 0F,0.5F, 0.6F, 0.2F, 0.5F, 0.6F, 0.2F, 0.5F, 0.6F, 0.2F, 0.5F, 0.6F, 0.2F, 0.5F, 0.6F, 0.2F, 0.5F, 0.6F, 0.2F, 0.5F, 0.6F, 0.2F, 0.5F, 0.6F, 0.2F); // Box 156
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(-3.55F, 7.75F, 2F, 1, 1, 1, 0F,0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.5F, -0.3F, 0.2F, 0.5F, -0.3F, 0.2F, 0.5F, -0.3F, 0.2F, 0.5F, -0.3F, 0.2F); // Box 158
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(1.5F, 7.9F, -3.85F, 2, 3, 2, 0F,-0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F); // Box 92
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(2F, 8.5F, -4.05F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.4F, -0.2F, -0.5F, -0.4F, -0.2F, -0.5F, -0.4F, -0.2F, -0.5F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F); // Box 93
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(-3.5F, 8.2F, -3.8F, 2, 3, 2, 0F,-0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F); // Box 101
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(-3.5F, 7.9F, -3.85F, 2, 3, 2, 0F,-0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F); // Box 102
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(-3.5F, 7.65F, -3.8F, 2, 1, 2, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.4F, -0.2F, 0F, 0.4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 105
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(-3F, 8.5F, -4.05F, 1, 1, 1, 0F,-0.3F, 0.1F, -0.4F, -0.3F, 0.1F, -0.4F, -0.3F, 0.1F, -0.4F, -0.3F, 0.1F, -0.4F, -0.2F, -0.5F, -0.4F, -0.2F, -0.5F, -0.4F, -0.2F, -0.5F, -0.4F, -0.2F, -0.5F, -0.4F); // Box 106
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(-3F, 8.5F, -4.05F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.4F, -0.2F, -0.5F, -0.4F, -0.2F, -0.5F, -0.4F, -0.2F, -0.5F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F); // Box 107
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(-3.5F, 0.99F, 2.6F, 7, 3, 3, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 175
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(-3.5F, 1F, 5.6F, 7, 3, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -1.4F, -0.4F, -0.2F, -1.4F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -1.4F, -0.4F, -0.2F, -1.4F, -0.4F); // Box 177
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(-3.5F, -0.01F, 2.6F, 7, 1, 3, 0F,-0.2F, -0.4F, -1.4F, -0.2F, -0.4F, -1.4F, -0.2F, -0.4F, -1.4F, -0.2F, -0.4F, -1.4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 176
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(-3.5F, 1F, 1.6F, 7, 3, 1, 0F,-0.2F, -1.4F, -0.4F, -0.2F, -1.4F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -1.4F, -0.4F, -0.2F, -1.4F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 179
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(-3.5F, 3.99F, 2.6F, 7, 1, 3, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.4F, -1.4F, -0.2F, -0.4F, -1.4F, -0.2F, -0.4F, -1.4F, -0.2F, -0.4F, -1.4F); // Box 178
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(-3.5F, 4.3F, 2.1F, 7, 3, 3, 0F,-0.8F, 0.4F, -0.2F, -0.8F, 0.4F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, -1.4F, -0.2F, -0.8F, -1.4F, -0.2F, -0.8F, -1.2F, 0F, -0.8F, -1.2F, 0F); // Box 180
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addShapeBox(-3.5F, 4.8F, 2F, 7, 5, 3, 0F,-1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, -1.2F, -0.2F, -1F, -1.2F, -0.2F, -1F, -1.2F, -0.2F, -1F, -1.2F, -0.2F); // Box 181
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addShapeBox(-3F, 6.01F, 2.2F, 3, 4, 3, 0F,-1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, -1.2F, -0.2F, -1F, -1.2F, -0.2F, -1F, -1.2F, -0.2F, -1F, -1.2F, -0.2F); // Box 185
		bodyModel[57].setRotationPoint(0F, 0F, 0F);

		bodyModel[58].addShapeBox(0F, 6.01F, 2.2F, 3, 4, 3, 0F,-1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, -1.2F, -0.2F, -1F, -1.2F, -0.2F, -1F, -1.2F, -0.2F, -1F, -1.2F, -0.2F); // Box 186
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addShapeBox(-3F, 1F, -2.6F, 1, 9, 1, 0F,-5.3F, 0.95F, -0.4F, 5.4F, 0.95F, -0.33F, 5.4F, 0.95F, 0F, -5.4F, 0.95F, 0F, 1F, 0F, -0.35F, -1.1F, 0F, -0.35F, -1.1F, 0F, 0F, 1.2F, 0F, 0F); // Box 105
		bodyModel[59].setRotationPoint(0F, 0F, 0F);

		bodyModel[60].addShapeBox(1F, 1F, -2.6F, 1, 8, 1, 0F,3.8F, 0.95F, -0.2F, -4.3F, 0.95F, -0.2F, -4.3F, 0.95F, 0F, 3.8F, 0.95F, 0F, -1.7F, 0F, -0.35F, 1.2F, 0F, -0.35F, 1.2F, 0F, 0F, -1.7F, 0F, 0F); // Box 99
		bodyModel[60].setRotationPoint(0F, 0F, 0F);

		bodyModel[61].addShapeBox(-0.5F, 2.03F, -2.2F, 1, 1, 1, 0F,-0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 83
		bodyModel[61].setRotationPoint(0F, 0F, 0F);

		bodyModel[62].addShapeBox(-0.5F, 2.2F, -2.2F, 1, 1, 1, 0F,-0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 171
		bodyModel[62].setRotationPoint(0F, 0F, 0F);

		bodyModel[63].addShapeBox(-0.5F, 1.55F, -2.2F, 1, 1, 1, 0F,-0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Box 82
		bodyModel[63].setRotationPoint(0F, 0F, 0F);

		bodyModel[64].addShapeBox(-0.5F, 4.03F, -2.2F, 1, 1, 1, 0F,-0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 127
		bodyModel[64].setRotationPoint(0F, 0F, 0F);

		bodyModel[65].addShapeBox(-0.5F, 4.2F, -2.2F, 1, 1, 1, 0F,-0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 128
		bodyModel[65].setRotationPoint(0F, 0F, 0F);

		bodyModel[66].addShapeBox(-0.5F, 3.55F, -2.2F, 1, 1, 1, 0F,-0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Box 129
		bodyModel[66].setRotationPoint(0F, 0F, 0F);

		bodyModel[67].addShapeBox(-0.5F, 6.03F, -2.2F, 1, 1, 1, 0F,-0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 130
		bodyModel[67].setRotationPoint(0F, 0F, 0F);

		bodyModel[68].addShapeBox(-0.5F, 6.2F, -2.2F, 1, 1, 1, 0F,-0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 131
		bodyModel[68].setRotationPoint(0F, 0F, 0F);

		bodyModel[69].addShapeBox(-0.5F, 5.55F, -2.2F, 1, 1, 1, 0F,-0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Box 132
		bodyModel[69].setRotationPoint(0F, 0F, 0F);

		bodyModel[70].addShapeBox(-0.5F, 8.03F, -2.2F, 1, 1, 1, 0F,-0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 133
		bodyModel[70].setRotationPoint(0F, 0F, 0F);

		bodyModel[71].addShapeBox(-0.5F, 8.2F, -2.2F, 1, 1, 1, 0F,-0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 134
		bodyModel[71].setRotationPoint(0F, 0F, 0F);

		bodyModel[72].addShapeBox(-0.5F, 7.55F, -2.2F, 1, 1, 1, 0F,-0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Box 135
		bodyModel[72].setRotationPoint(0F, 0F, 0F);

		bodyModel[73].addShapeBox(-2.5F, 1F, 5.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -1.4F, -0.2F, -0.2F, -1.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -1.4F, -0.2F, -0.2F, -1.4F, -0.2F); // Box 204
		bodyModel[73].setRotationPoint(0F, 0F, 0F);

		bodyModel[74].addShapeBox(-2.5F, 0.2F, 2.7F, 1, 1, 3, 0F,-0.2F, -0.15F, -1F, -0.2F, -0.15F, -1F, -0.2F, -0.15F, -1.4F, -0.2F, -0.15F, -1.4F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 205
		bodyModel[74].setRotationPoint(0F, 0F, 0F);

		bodyModel[75].addShapeBox(-2.5F, 3.8F, 2.7F, 1, 1, 3, 0F,-0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.15F, -1F, -0.2F, -0.15F, -1F, -0.2F, -0.15F, -1.4F, -0.2F, -0.15F, -1.4F); // Box 207
		bodyModel[75].setRotationPoint(0F, 0F, 0F);

		bodyModel[76].addShapeBox(1.5F, 0.2F, 2.7F, 1, 1, 3, 0F,-0.2F, -0.15F, -1F, -0.2F, -0.15F, -1F, -0.2F, -0.15F, -1.4F, -0.2F, -0.15F, -1.4F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 139
		bodyModel[76].setRotationPoint(0F, 0F, 0F);

		bodyModel[77].addShapeBox(1.5F, 1F, 5.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -1.4F, -0.2F, -0.2F, -1.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -1.4F, -0.2F, -0.2F, -1.4F, -0.2F); // Box 140
		bodyModel[77].setRotationPoint(0F, 0F, 0F);

		bodyModel[78].addShapeBox(1.5F, 3.8F, 2.7F, 1, 1, 3, 0F,-0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.15F, -1F, -0.2F, -0.15F, -1F, -0.2F, -0.15F, -1.4F, -0.2F, -0.15F, -1.4F); // Box 141
		bodyModel[78].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 58, 22, textureX, textureY); // Box 3
		leftArmModel[1] = new ModelRendererTurbo(this, 104, 15, textureX, textureY); // Box 1

		leftArmModel[0].addShapeBox(-1F, 5.5F, -2F, 4, 3, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F); // Box 3
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, -2.1F, -2F, 4, 9, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 1
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 72, 2, textureX, textureY); // Box 2
		rightArmModel[1] = new ModelRendererTurbo(this, 99, 16, textureX, textureY); // Box 2

		rightArmModel[0].addShapeBox(-3F, 5.5F, -2F, 4, 3, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F); // Box 2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, -2.1F, -2F, 4, 9, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 2
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 56, 2, textureX, textureY); // Box 0
		leftLegModel[1] = new ModelRendererTurbo(this, 93, 56, textureX, textureY); // Box 110
		leftLegModel[2] = new ModelRendererTurbo(this, 95, 63, textureX, textureY); // Box 151
		leftLegModel[3] = new ModelRendererTurbo(this, 95, 60, textureX, textureY); // Box 152
		leftLegModel[4] = new ModelRendererTurbo(this, 7, 7, textureX, textureY); // Box 102

		leftLegModel[0].addShapeBox(-2F, -0.0999999999999996F, -2F, 4, 5, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.1F, 0F, 0.1F); // Box 0
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 8F, -2F, 4, 4, 4, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F); // Box 110
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 9F, -3F, 4, 1, 1, 0F,-0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, 0.15F, 0F, 0.75F, 0.15F, 0F, 0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F); // Box 151
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 9F, -3F, 4, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F); // Box 152
		leftLegModel[3].setRotationPoint(0F, 1F, 0F);

		leftLegModel[4].addShapeBox(-2F, 4.9F, -2F, 4, 6, 4, 0F,0.1F, 0F, 0.1F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 102
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 61, 12, textureX, textureY); // Box 5
		rightLegModel[1] = new ModelRendererTurbo(this, 93, 57, textureX, textureY); // Box 115
		rightLegModel[2] = new ModelRendererTurbo(this, 95, 61, textureX, textureY); // Box 76
		rightLegModel[3] = new ModelRendererTurbo(this, 97, 62, textureX, textureY); // Box 150
		rightLegModel[4] = new ModelRendererTurbo(this, 23, 10, textureX, textureY); // Box 101

		rightLegModel[0].addShapeBox(-2F, -0.0999999999999996F, -2F, 4, 5, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.15F, 0F, 0.15F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.15F, 0F, 0.15F); // Box 5
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 8F, -2F, 4, 4, 4, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F); // Box 115
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 9F, -3F, 4, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F); // Box 76
		rightLegModel[2].setRotationPoint(0F, 1F, 0F);

		rightLegModel[3].addShapeBox(-2F, 9F, -3F, 4, 1, 1, 0F,-0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, 0.15F, 0F, 0.75F, 0.15F, 0F, 0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F); // Box 150
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2F, 4.9F, -2F, 4, 5, 4, 0F,0.15F, 0F, 0.15F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.15F, 0F, 0.15F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 101
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);
	}
}