//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.NewAge; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSADF extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelSADF() //Same as Filename
	{
		headModel = new ModelRendererTurbo[20];
		bodyModel = new ModelRendererTurbo[75];
		leftArmModel = new ModelRendererTurbo[3];
		rightArmModel = new ModelRendererTurbo[3];
		leftLegModel = new ModelRendererTurbo[4];
		rightLegModel = new ModelRendererTurbo[4];

		initheadModel_1();
		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		headModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 3
		headModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 8
		headModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 9
		headModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 10
		headModel[5] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 11
		headModel[6] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 13
		headModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 57
		headModel[8] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 14
		headModel[9] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 35
		headModel[10] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 36
		headModel[11] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 111
		headModel[12] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 113
		headModel[13] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 114
		headModel[14] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 115
		headModel[15] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 116
		headModel[16] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 179
		headModel[17] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 180
		headModel[18] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 181
		headModel[19] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 182

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 0
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -9F, -4F, 8, 1, 8, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(4F, -4.5F, 0.75F, 1, 2, 4, 0F,0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.8F, -0.05F, 0F, -0.8F, -0.05F); // Box 8
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -4.5F, 3.7F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 9
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -4F, 3.7F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.3F, 0F); // Box 10
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(0F, -4F, 3.7F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.7F, 0F); // Box 11
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4.5F, -4F, -4.5F, 9, 4, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -2.5F, -0.4F, 0F, -2.5F); // Box 13
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(4F, -4.5F, -4.85F, 1, 1, 2, 0F,0F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, -0.3F, -1F, -0.25F, -0.3F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 57
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-4.5F, 0F, -4F, 9, 1, 1, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F); // Box 14
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(4F, -4.5F, -2.25F, 1, 2, 1, 0F,0F, 0F, 0.6F, -0.3F, 0F, 0.6F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.6F, -0.3F, -1.5F, 0.6F, -0.3F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 35
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(4F, -4.5F, -1.25F, 1, 2, 2, 0F,0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 36
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-4F, -6F, -4F, 8, 1, 8, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.7F, 0.5F, 0.7F, 0.7F, 0.5F, 0.7F, 0.7F, 0.5F, 0.7F, 0.7F, 0.5F, 0.7F); // Box 111
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-5F, -4.5F, 0.75F, 1, 2, 4, 0F,-0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, -0.3F, 0F, -0.05F, -0.3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.8F, -0.05F, -0.3F, -0.8F, -0.05F); // Box 113
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-5F, -4.5F, -1.25F, 1, 2, 2, 0F,-0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 114
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-5F, -4.5F, -2.25F, 1, 2, 1, 0F,-0.3F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1.5F, 0.6F, 0F, -1.5F, 0.6F, 0F, -0.5F, 0F, -0.3F, -0.5F, 0F); // Box 115
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-5F, -4.5F, -4.85F, 1, 1, 2, 0F,-0.3F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -0.5F, 0F, -0.3F, -0.5F, 0F); // Box 116
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-4F, -5.5F, -5.6F, 8, 1, 1, 0F,0.64F, -0.95F, -0.6F, 0.64F, -0.95F, -0.6F, 0.64F, -0.6F, 0F, 0.64F, -0.6F, 0F, 0.7F, 0F, -0.6F, 0.7F, 0F, -0.6F, 0.7F, 0F, 0F, 0.7F, 0F, 0F); // Box 179
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-4.5F, -6F, -5.15F, 9, 1, 1, 0F,-0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F); // Box 180
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-4F, -8F, -5.15F, 8, 2, 1, 0F,-1F, -0.5F, -0.8F, -1F, -0.5F, -0.8F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 181
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-4.5F, -7F, -4.5F, 9, 2, 9, 0F,-0.1F, -0.2F, -0.15F, -0.1F, -0.2F, -0.15F, 0.1F, -1.2F, 0.075F, 0.1F, -1.2F, 0.075F, 0F, -1.2F, 0.025F, 0F, -1.2F, 0.025F, 0.15F, -0.2F, 0.175F, 0.15F, -0.2F, 0.175F); // Box 182
		headModel[19].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 11
		bodyModel[2] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 12
		bodyModel[3] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 34
		bodyModel[4] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 50
		bodyModel[5] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 51
		bodyModel[6] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 52
		bodyModel[7] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 53
		bodyModel[8] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 32
		bodyModel[9] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 34
		bodyModel[10] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 35
		bodyModel[11] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 37
		bodyModel[12] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 39
		bodyModel[13] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 33
		bodyModel[14] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 8
		bodyModel[15] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 2
		bodyModel[16] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 10
		bodyModel[17] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 25
		bodyModel[19] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 30
		bodyModel[20] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 31
		bodyModel[21] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 32
		bodyModel[22] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 33
		bodyModel[23] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 207
		bodyModel[24] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 208
		bodyModel[25] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 209
		bodyModel[26] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 210
		bodyModel[27] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 211
		bodyModel[28] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 212
		bodyModel[29] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 213
		bodyModel[30] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 214
		bodyModel[31] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 216
		bodyModel[32] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 217
		bodyModel[33] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 218
		bodyModel[34] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 219
		bodyModel[35] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 16
		bodyModel[36] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 221
		bodyModel[37] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 225
		bodyModel[38] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 75
		bodyModel[39] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 76
		bodyModel[40] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 78
		bodyModel[41] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box 79
		bodyModel[42] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 80
		bodyModel[43] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 81
		bodyModel[44] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 82
		bodyModel[45] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 83
		bodyModel[46] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 84
		bodyModel[47] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 85
		bodyModel[48] = new ModelRendererTurbo(this, 9, 97, textureX, textureY); // Box 86
		bodyModel[49] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 87
		bodyModel[50] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 88
		bodyModel[51] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 89
		bodyModel[52] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 90
		bodyModel[53] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 91
		bodyModel[54] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 92
		bodyModel[55] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 93
		bodyModel[56] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 94
		bodyModel[57] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 95
		bodyModel[58] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 96
		bodyModel[59] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 97
		bodyModel[60] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 98
		bodyModel[61] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 99
		bodyModel[62] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 100
		bodyModel[63] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 101
		bodyModel[64] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 102
		bodyModel[65] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 103
		bodyModel[66] = new ModelRendererTurbo(this, 9, 105, textureX, textureY); // Box 104
		bodyModel[67] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 105
		bodyModel[68] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 106
		bodyModel[69] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 107
		bodyModel[70] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 108
		bodyModel[71] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 109
		bodyModel[72] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 110
		bodyModel[73] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Box 111
		bodyModel[74] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 108

		bodyModel[0].addShapeBox(-4F, -0.1F, -2F, 4, 2, 4, 0F,0.1F, 0F, 0.1F, -1F, 0F, 0.1F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F); // Box 1
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-0.5F, -0.1F, -2.15F, 2, 2, 1, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-1.5F, -0.1F, -2.12F, 2, 2, 1, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 12
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(0F, -0.1F, -2F, 4, 2, 4, 0F,-1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0F, -0.5F, 0.1F); // Box 34
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addBox(0.9F, 2.5F, -2.2F, 3, 1, 1, 0F); // Box 50
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-3.9F, 2.5F, -2.2F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addBox(-3.9F, 3.5F, -2.15F, 3, 2, 1, 0F); // Box 52
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addBox(0.9F, 3.5F, -2.15F, 3, 2, 1, 0F); // Box 53
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-3.9F, 7.5F, -2.2F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addBox(-3.9F, 8.5F, -2.15F, 3, 2, 1, 0F); // Box 34
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addBox(0.9F, 7.5F, -2.2F, 3, 1, 1, 0F); // Box 35
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addBox(0.9F, 8.5F, -2.15F, 3, 2, 1, 0F); // Box 37
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-0.5F, 1.4F, -2.15F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 39
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-4F, 1.9F, -2F, 8, 10, 4, 0F,0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 33
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-3.5F, 6F, -2.3F, 3, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F); // Box 8
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-4F, 6.5F, -3.17F, 2, 4, 1, 0F,-0.25F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.25F, 0F, 0F); // Box 2
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-3.95F, 6.4F, -3.3F, 2, 2, 2, 0F,-0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F); // Box 10
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-2.1F, 6.1F, -3.2F, 2, 4, 1, 0F,-0.15F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.15F, 0F, 0F); // Box 17
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-2.15F, 6F, -3.3F, 2, 2, 2, 0F,-0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F); // Box 25
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(2F, 6.5F, -3.17F, 2, 4, 1, 0F,-0.15F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.15F, 0F, 0F); // Box 30
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(1.95F, 6.4F, -3.3F, 2, 2, 2, 0F,-0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F); // Box 31
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(0.1F, 6.1F, -3.2F, 2, 4, 1, 0F,-0.25F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.25F, 0F, 0F); // Box 32
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(0.15F, 6F, -3.3F, 2, 2, 2, 0F,-0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F); // Box 33
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-2.5F, 2.7F, -3F, 2, 3, 1, 0F,-0.15F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.15F, 0F, 0F); // Box 207
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-2.55F, 2.2F, -3.1F, 2, 2, 2, 0F,-0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F); // Box 208
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(0.5F, 2.7F, -3F, 2, 3, 1, 0F,-0.25F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.25F, 0F, 0F); // Box 209
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(0.55F, 2.2F, -3.1F, 2, 2, 2, 0F,-0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F); // Box 210
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-3.5F, 3F, -2.3F, 3, 3, 1, 0F,-0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(0.25F, 3F, -2.3F, 3, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-2.5F, 0F, -2.3F, 2, 3, 1, 0F,0F, 0.15F, 0F, 0.25F, 0.15F, 0F, 0.25F, 0.15F, 0F, 0F, 0.15F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 213
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(0.25F, 0F, -2.3F, 2, 3, 1, 0F,0F, 0.15F, 0F, 0.25F, 0.15F, 0F, 0.25F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(0.25F, 7F, -2.3F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F); // Box 216
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-4.25F, 7F, -2.3F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F); // Box 217
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(0.5F, 6F, -2.3F, 3, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.25F, 0F, 0F); // Box 218
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-2.5F, 2.8F, -2.35F, 5, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 219
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(-2F, 1.25F, 2.6F, 4, 6, 1, 0F,-0.15F, -0.15F, 0.5F, -0.15F, -0.15F, 0.5F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.15F, -0.15F, 0.5F, -0.15F, -0.15F, 0.5F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F); // Box 16
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-2F, 6.85F, 2.6F, 4, 4, 1, 0F,-0.15F, 0F, 0.5F, -0.15F, 0F, 0.5F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.15F, 0F, 0.5F, -0.15F, 0F, 0.5F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F); // Box 221
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-2.5F, -0.15F, -1.3F, 2, 2, 4, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, -0.45F, -0.5F, 0F, -0.45F); // Box 225
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-2F, 6.26F, 2.6F, 4, 1, 1, 0F,-0.15F, 0F, 0.5F, -0.15F, 0F, 0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.15F, 0.5F, 0F, -0.15F, 0.5F, -0.15F, -0.4F, 0.25F, -0.15F, -0.4F, 0.25F); // Box 75
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(-2F, 1.26F, 2.6F, 4, 1, 1, 0F,-0.15F, 0F, 0.5F, -0.15F, 0F, 0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.15F, 0.5F, 0F, -0.15F, 0.5F, -0.15F, -0.4F, 0.25F, -0.15F, -0.4F, 0.25F); // Box 76
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(0.5F, -0.15F, -1.3F, 2, 2, 4, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, -0.5F, 0F, -0.45F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.45F, 0.5F, 0F, -0.45F); // Box 78
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(2F, 7.7F, 1.93F, 2, 3, 1, 0F,-0.25F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.25F, 0F, 0F); // Box 79
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(2.05F, 7.2F, 1.05F, 2, 2, 2, 0F,-0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F); // Box 80
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(-4F, 7.7F, 1.93F, 2, 3, 1, 0F,-0.25F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.25F, 0F, 0F); // Box 81
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(-3.95F, 7.2F, 1.05F, 2, 2, 2, 0F,-0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F); // Box 82
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(-2F, 1.85F, 0.649999999999999F, 4, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F); // Box 83
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(2.05F, 7.75F, 1.98F, 2, 3, 1, 0F,-0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Box 84
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(-3.95F, 7.75F, 1.98F, 2, 3, 1, 0F,-0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Box 85
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(1.95F, 7.56F, -3.22F, 2, 3, 1, 0F,-0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Box 86
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(-3.95F, 7.56F, -3.22F, 2, 3, 1, 0F,-0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Box 87
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(-2.15F, 7.16F, -3.22F, 2, 3, 1, 0F,-0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Box 88
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(0.15F, 7.16F, -3.22F, 2, 3, 1, 0F,-0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Box 89
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(-2.55F, 2.75F, -3.05F, 2, 3, 1, 0F,-0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Box 90
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(0.55F, 2.75F, -3.05F, 2, 3, 1, 0F,-0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Box 91
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(-3.95F, 7F, -3.25F, 2, 2, 1, 0F,-0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F); // Box 92
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(1.95F, 7F, -3.25F, 2, 2, 1, 0F,-0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F); // Box 93
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addShapeBox(-2.15F, 6.5F, -3.25F, 2, 2, 1, 0F,-0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F); // Box 94
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addShapeBox(0.15F, 6.5F, -3.25F, 2, 2, 1, 0F,-0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F); // Box 95
		bodyModel[57].setRotationPoint(0F, 0F, 0F);

		bodyModel[58].addShapeBox(0.55F, 2.75F, -3.07F, 2, 2, 1, 0F,-0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F); // Box 96
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addShapeBox(-2.55F, 2.75F, -3.07F, 2, 2, 1, 0F,-0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F); // Box 97
		bodyModel[59].setRotationPoint(0F, 0F, 0F);

		bodyModel[60].addShapeBox(-3.95F, 7.75F, 2.03F, 2, 2, 1, 0F,-0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F); // Box 98
		bodyModel[60].setRotationPoint(0F, 0F, 0F);

		bodyModel[61].addShapeBox(2.05F, 7.75F, 2.03F, 2, 2, 1, 0F,-0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F); // Box 99
		bodyModel[61].setRotationPoint(0F, 0F, 0F);

		bodyModel[62].addShapeBox(-1.75F, 2.25F, 2.65F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 100
		bodyModel[62].setRotationPoint(0F, 0F, 0F);

		bodyModel[63].addShapeBox(-1.75F, 4.25F, 2.65F, 1, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 101
		bodyModel[63].setRotationPoint(0F, 0F, 0F);

		bodyModel[64].addShapeBox(0.75F, 4.25F, 2.65F, 1, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 102
		bodyModel[64].setRotationPoint(0F, 0F, 0F);

		bodyModel[65].addShapeBox(0.75F, 2.25F, 2.65F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 103
		bodyModel[65].setRotationPoint(0F, 0F, 0F);

		bodyModel[66].addShapeBox(-1.75F, 8F, 2.65F, 1, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 104
		bodyModel[66].setRotationPoint(0F, 0F, 0F);

		bodyModel[67].addShapeBox(0.75F, 8F, 2.65F, 1, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 105
		bodyModel[67].setRotationPoint(0F, 0F, 0F);

		bodyModel[68].addShapeBox(-4.5F, 7.8F, -2.65F, 9, 1, 5, 0F,-0.175F, -0.25F, -0.3F, -0.175F, -0.25F, -0.3F, -0.175F, -0.25F, 0F, -0.175F, -0.25F, 0F, -0.175F, -0.25F, -0.3F, -0.175F, -0.25F, -0.3F, -0.175F, -0.25F, 0F, -0.175F, -0.25F, 0F); // Box 106
		bodyModel[68].setRotationPoint(0F, 0F, 0F);

		bodyModel[69].addShapeBox(-4.5F, 9.8F, -2.65F, 9, 1, 5, 0F,-0.175F, -0.25F, -0.3F, -0.175F, -0.25F, -0.3F, -0.175F, -0.25F, 0F, -0.175F, -0.25F, 0F, -0.175F, -0.25F, -0.3F, -0.175F, -0.25F, -0.3F, -0.175F, -0.25F, 0F, -0.175F, -0.25F, 0F); // Box 107
		bodyModel[69].setRotationPoint(0F, 0F, 0F);

		bodyModel[70].addShapeBox(0.5F, 0.05F, -2.35F, 1, 3, 1, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F); // Box 108
		bodyModel[70].setRotationPoint(0F, 0F, 0F);

		bodyModel[71].addShapeBox(1.5F, 0.05F, -2.35F, 1, 3, 1, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F); // Box 109
		bodyModel[71].setRotationPoint(0F, 0F, 0F);

		bodyModel[72].addShapeBox(-1.5F, 0.05F, -2.35F, 1, 3, 1, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[72].setRotationPoint(0F, 0F, 0F);

		bodyModel[73].addShapeBox(-2.5F, 0.05F, -2.35F, 1, 3, 1, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[73].setRotationPoint(0F, 0F, 0F);

		bodyModel[74].addBox(-1.5F, -0.09F, -2.05F, 3, 2, 1, 0F); // Box 108
		bodyModel[74].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 3
		leftArmModel[1] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 1
		leftArmModel[2] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 49

		leftArmModel[0].addShapeBox(-1F, 3.5F, -2F, 4, 2, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F); // Box 3
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, -2.1F, -2F, 4, 6, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 1
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-0.95F, -2.3F, -1F, 4, 1, 2, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 49
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 2
		rightArmModel[1] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 2
		rightArmModel[2] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 48

		rightArmModel[0].addShapeBox(-3F, 3.5F, -2F, 4, 2, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F); // Box 2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, -2.1F, -2F, 4, 6, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 2
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3.05F, -2.3F, -1F, 4, 1, 2, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 48
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 0
		leftLegModel[1] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 24
		leftLegModel[2] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 63
		leftLegModel[3] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 64

		leftLegModel[0].addShapeBox(-2F, -0.0999999999999996F, -2F, 4, 12, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 0
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 7.1F, -2.4F, 4, 5, 5, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Box 24
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(1.1F, 1F, -1.5F, 1, 1, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 63
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(1.05F, 2F, -1.5F, 1, 3, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 64
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 5
		rightLegModel[1] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 25
		rightLegModel[2] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 67
		rightLegModel[3] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 68

		rightLegModel[0].addShapeBox(-2F, -0.0999999999999996F, -2F, 4, 12, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 5
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 7.1F, -2.4F, 4, 5, 5, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Box 25
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2.1F, 1F, -1.5F, 1, 1, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 67
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2.05F, 2F, -1.5F, 1, 3, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 68
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);
	}
}