//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 15.11.2016 - 20:00:56
// Last changed on: 15.11.2016 - 20:00:56

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelAustrian extends ModelCustomArmour //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelAustrian() //Same as Filename
	{
		headModel = new ModelRendererTurbo[69];
		bodyModel = new ModelRendererTurbo[143];
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
		headModel[0] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 7
		headModel[1] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 8
		headModel[2] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 9
		headModel[3] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 10
		headModel[4] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 11
		headModel[5] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 12
		headModel[6] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 17
		headModel[7] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 17
		headModel[8] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 17
		headModel[9] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 21
		headModel[10] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 23
		headModel[11] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 24
		headModel[12] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 25
		headModel[13] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 26
		headModel[14] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 27
		headModel[15] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 46
		headModel[16] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 47
		headModel[17] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 48
		headModel[18] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 58
		headModel[19] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 59
		headModel[20] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 60
		headModel[21] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 61
		headModel[22] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 64
		headModel[23] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 65
		headModel[24] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 66
		headModel[25] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 67
		headModel[26] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 68
		headModel[27] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 69
		headModel[28] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 70
		headModel[29] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 71
		headModel[30] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 72
		headModel[31] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 73
		headModel[32] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 74
		headModel[33] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 75
		headModel[34] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 76
		headModel[35] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 77
		headModel[36] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 78
		headModel[37] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 79
		headModel[38] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 141
		headModel[39] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 142
		headModel[40] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 143
		headModel[41] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 144
		headModel[42] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 145
		headModel[43] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 146
		headModel[44] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 147
		headModel[45] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 148
		headModel[46] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 149
		headModel[47] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 150
		headModel[48] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 151
		headModel[49] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 152
		headModel[50] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 153
		headModel[51] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 154
		headModel[52] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 155
		headModel[53] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 160
		headModel[54] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 161
		headModel[55] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 162
		headModel[56] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 163
		headModel[57] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 164
		headModel[58] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 165
		headModel[59] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 166
		headModel[60] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 167
		headModel[61] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 168
		headModel[62] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 169
		headModel[63] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 170
		headModel[64] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 171
		headModel[65] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 172
		headModel[66] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 173
		headModel[67] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 174
		headModel[68] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 175

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 3, 8, 0F,0.01F, 0.385F, 0.01F, 0.01F, 0.385F, 0.01F, 0.01F, 0.135F, 0.01F, 0.01F, 0.135F, 0.01F, 0.01F, 0.2F, 0.01F, 0.01F, 0.2F, 0.01F, 0.01F, 0.4F, 0.01F, 0.01F, 0.4F, 0.01F); // Box 7
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -7F, 0F, 8, 2, 4, 0F,0.05F, 0.26F, 0F, 0.05F, 0.26F, 0F, 0.05F, 0.385F, 0.05F, 0.05F, 0.385F, 0.05F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F); // Box 8
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -7F, -2F, 8, 2, 2, 0F,0.05F, -0.24F, 0F, 0.05F, -0.24F, 0F, 0.05F, 0.26F, 0F, 0.05F, 0.26F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F); // Box 9
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -7F, -4F, 8, 2, 2, 0F,0.05F, -0.375F, 0.05F, 0.05F, -0.375F, 0.05F, 0.05F, -0.24F, 0F, 0.05F, -0.24F, 0F, 0.05F, -0.01F, 0.05F, 0.05F, -0.01F, 0.05F, 0.05F, 0F, 0F, 0.05F, 0F, 0F); // Box 10
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -7F, 0F, 8, 1, 4, 0F,0.03F, 0.01F, 1F, 0.03F, 0.01F, 1F, 0.03F, 0.01F, 0.03F, 0.03F, 0.01F, 0.03F, 0.03F, -0.695F, 0F, 0.03F, -0.695F, 0F, 0.03F, -0.595F, 0.03F, 0.03F, -0.595F, 0.03F); // Box 11
		headModel[4].setRotationPoint(0F, 2F, 0F);

		headModel[5].addShapeBox(0F, -7F, -4F, 4, 2, 2, 0F,0.4F, -0.375F, 0.07F, 0.05F, -0.375F, 0.05F, 0.05F, -0.24F, 0F, 0.05F, -0.24F, 0F, 0.4F, -0.01F, 0.07F, 0.05F, -0.01F, 0.05F, 0.05F, 0F, 0F, 0.05F, 0F, 0F); // Box 12
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-0.5F, -6.7F, -4F, 1, 1, 1, 0F,-0.175F, -0.65F, 0.1F, -0.175F, -0.65F, 0.1F, -0.175F, -0.65F, 0F, -0.175F, -0.65F, 0F, -0.35F, -0.175F, 0.1F, -0.35F, -0.175F, 0.1F, -0.35F, -0.175F, 0F, -0.35F, -0.175F, 0F); // Box 17
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-0.5F, -6.7F, -4F, 1, 1, 1, 0F,-0.175F, -0.4F, 0.1F, -0.175F, -0.4F, 0.1F, -0.175F, -0.4F, 0F, -0.175F, -0.4F, 0F, -0.175F, -0.35F, 0.1F, -0.175F, -0.35F, 0.1F, -0.175F, -0.35F, 0F, -0.175F, -0.35F, 0F); // Box 17
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-0.5F, -6.7F, -4F, 1, 1, 1, 0F,-0.375F, -0.225F, 0.1F, -0.375F, -0.225F, 0.1F, -0.375F, -0.225F, 0F, -0.375F, -0.225F, 0F, -0.175F, -0.6F, 0.1F, -0.175F, -0.6F, 0.1F, -0.175F, -0.6F, 0F, -0.175F, -0.6F, 0F); // Box 17
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-4F, -6F, -6F, 2, 1, 2, 0F,-0.49F, -1.2F, -0.74F, -0.5F, -1.25F, -0.115F, -0.5F, -1F, 0.01F, 0.01F, -1F, 0.01F, -0.49F, 0.4F, -0.74F, -0.5F, 0.45F, -0.115F, -0.5F, 0.2F, 0.01F, 0.01F, 0.2F, 0.01F); // Box 21
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-5F, -6F, -6F, 4, 1, 2, 0F,-2.5F, -1.25F, -0.115F, 0F, -1.25F, 0.135F, 0F, -1F, 0.01F, -2.5F, -1F, 0.01F, -2.5F, 0.45F, -0.115F, 0F, 0.45F, 0.135F, 0F, 0.2F, 0.01F, -2.5F, 0.2F, 0.01F); // Box 23
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(1F, -6F, -6F, 4, 1, 2, 0F,0F, -1.25F, 0.135F, -2.5F, -1.25F, -0.115F, -2.5F, -1F, 0.01F, 0F, -1F, 0.01F, 0F, 0.45F, 0.135F, -2.5F, 0.45F, -0.115F, -2.5F, 0.2F, 0.01F, 0F, 0.2F, 0.01F); // Box 24
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(2F, -6F, -6F, 2, 1, 2, 0F,-0.5F, -1.25F, -0.115F, -0.49F, -1.2F, -0.74F, 0.01F, -1F, 0.01F, -0.5F, -1F, 0.01F, -0.5F, 0.45F, -0.115F, -0.49F, 0.4F, -0.74F, 0.01F, 0.2F, 0.01F, -0.5F, 0.2F, 0.01F); // Box 25
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-4F, -6F, -6F, 4, 1, 2, 0F,-3F, -1.25F, 0.135F, 0F, -1.25F, 0.26F, 0F, -1F, 0.01F, -3F, -1F, 0.01F, -3F, 0.45F, 0.135F, 0F, 0.45F, 0.26F, 0F, 0.2F, 0.01F, -3F, 0.2F, 0.01F); // Box 26
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(0F, -6F, -6F, 4, 1, 2, 0F,0F, -1.25F, 0.26F, -3F, -1.25F, 0.135F, -3F, -1F, 0.01F, 0F, -1F, 0.01F, 0F, 0.45F, 0.26F, -3F, 0.45F, 0.135F, -3F, 0.2F, 0.01F, 0F, 0.2F, 0.01F); // Box 27
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-0.5F, -6F, -4F, 1, 1, 1, 0F,-0.175F, -0.4F, 0.1F, -0.175F, -0.4F, 0.1F, -0.175F, -0.4F, 0F, -0.175F, -0.4F, 0F, -0.175F, -0.35F, 0.1F, -0.175F, -0.35F, 0.1F, -0.175F, -0.35F, 0F, -0.175F, -0.35F, 0F); // Box 46
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-0.5F, -6F, -4F, 1, 1, 1, 0F,-0.375F, -0.225F, 0.1F, -0.375F, -0.225F, 0.1F, -0.375F, -0.225F, 0F, -0.375F, -0.225F, 0F, -0.175F, -0.6F, 0.1F, -0.175F, -0.6F, 0.1F, -0.175F, -0.6F, 0F, -0.175F, -0.6F, 0F); // Box 47
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-0.5F, -6F, -4F, 1, 1, 1, 0F,-0.175F, -0.65F, 0.1F, -0.175F, -0.65F, 0.1F, -0.175F, -0.65F, 0F, -0.175F, -0.65F, 0F, -0.35F, -0.175F, 0.1F, -0.35F, -0.175F, 0.1F, -0.35F, -0.175F, 0F, -0.35F, -0.175F, 0F); // Box 48
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-0.5F, -8F, -4F, 1, 1, 1, 0F,-0.3F, 0F, 0.05F, -0.3F, 0F, 0.05F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.7F, 0.05F, 0F, -0.7F, 0.05F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 58
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-0.5F, -8F, -4F, 1, 1, 1, 0F,0F, -0.3F, 0.05F, 0F, -0.3F, 0.05F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.05F, 0F, -0.3F, 0.05F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 59
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(-0.5F, -8F, -4F, 1, 1, 1, 0F,0F, -0.7F, 0.05F, 0F, -0.7F, 0.05F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.3F, 0F, 0.05F, -0.3F, 0F, 0.05F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 60
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(-0.5F, -8F, -4F, 1, 1, 1, 0F,-0.35F, -0.325F, 0.06F, -0.6F, -0.325F, 0.06F, -0.6F, -0.325F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.65F, 0.06F, -0.55F, -0.65F, 0.06F, -0.55F, -0.65F, 0F, -0.35F, -0.65F, 0F); // Box 61
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(-0.8F, -8F, -4F, 1, 1, 1, 0F,-0.5F, -0.25F, 0.055F, -0.45F, -0.25F, 0.055F, -0.45F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.055F, -0.45F, -0.25F, 0.055F, -0.45F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 64
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(-0.2F, -8F, -4F, 1, 1, 1, 0F,-0.45F, -0.25F, 0.055F, -0.5F, -0.25F, 0.055F, -0.5F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0.055F, -0.5F, -0.25F, 0.055F, -0.5F, -0.25F, 0F, -0.45F, -0.25F, 0F); // Box 65
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(-0.4F, -8F, -4F, 1, 1, 1, 0F,-0.45F, -0.25F, 0.055F, -0.5F, -0.25F, 0.055F, -0.5F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.35F, 0.055F, -0.5F, -0.35F, 0.055F, -0.5F, -0.35F, 0F, -0.45F, -0.35F, 0F); // Box 66
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(-0.8F, -7.95F, -4F, 1, 1, 1, 0F,-0.63F, -0.2F, 0.055F, -0.25F, -0.2F, 0.055F, -0.25F, -0.2F, 0F, -0.63F, -0.2F, 0F, -0.63F, -0.75F, 0.055F, -0.25F, -0.75F, 0.055F, -0.25F, -0.75F, 0F, -0.63F, -0.75F, 0F); // Box 67
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(-0.83F, -7.75F, -4F, 1, 1, 1, 0F,-0.6F, -0.2F, 0.055F, -0.35F, -0.2F, 0.055F, -0.35F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.75F, 0.055F, -0.35F, -0.75F, 0.055F, -0.35F, -0.75F, 0F, -0.6F, -0.75F, 0F); // Box 68
		headModel[26].setRotationPoint(0F, 0F, 0F);

		headModel[27].addShapeBox(-0.4F, -8.05F, -4F, 1, 1, 1, 0F,-0.45F, -0.7F, 0.055F, -0.5F, -0.7F, 0.055F, -0.5F, -0.7F, 0F, -0.45F, -0.7F, 0F, -0.45F, -0.25F, 0.055F, -0.55F, -0.2F, 0.055F, -0.55F, -0.2F, 0F, -0.45F, -0.25F, 0F); // Box 69
		headModel[27].setRotationPoint(0F, 0F, 0F);

		headModel[28].addShapeBox(-0.65F, -8.05F, -4F, 1, 1, 1, 0F,-0.5F, -0.7F, 0.055F, -0.45F, -0.7F, 0.055F, -0.45F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.55F, -0.2F, 0.055F, -0.45F, -0.25F, 0.055F, -0.45F, -0.25F, 0F, -0.55F, -0.2F, 0F); // Box 70
		headModel[28].setRotationPoint(0F, 0F, 0F);

		headModel[29].addShapeBox(-0.65F, -8.05F, -4F, 1, 1, 1, 0F,-0.55F, -0.75F, 0.055F, -0.4F, -0.75F, 0.055F, -0.4F, -0.75F, 0F, -0.55F, -0.75F, 0F, -0.55F, -0.2F, 0.055F, -0.4F, -0.2F, 0.055F, -0.4F, -0.2F, 0F, -0.55F, -0.2F, 0F); // Box 71
		headModel[29].setRotationPoint(0F, 0F, 0F);

		headModel[30].addShapeBox(-0.55F, -8.05F, -4F, 1, 1, 1, 0F,-0.55F, -0.75F, 0.055F, -0.4F, -0.75F, 0.055F, -0.4F, -0.75F, 0F, -0.55F, -0.75F, 0F, -0.55F, -0.2F, 0.055F, -0.4F, -0.2F, 0.055F, -0.4F, -0.2F, 0F, -0.55F, -0.2F, 0F); // Box 72
		headModel[30].setRotationPoint(0F, 0F, 0F);

		headModel[31].addShapeBox(-0.83F, -7.75F, -4F, 1, 1, 1, 0F,-0.62F, -0.2F, 0.055F, -0.35F, -0.13F, 0.055F, -0.35F, -0.13F, 0F, -0.62F, -0.2F, 0F, -0.62F, -0.75F, 0.055F, -0.35F, -0.68F, 0.055F, -0.35F, -0.68F, 0F, -0.62F, -0.75F, 0F); // Box 73
		headModel[31].setRotationPoint(0F, 0F, 0F);

		headModel[32].addShapeBox(-0.8F, -7.95F, -4F, 1, 1, 1, 0F,-0.47F, -0.2F, 0.055F, -0.42F, -0.2F, 0.055F, -0.42F, -0.2F, 0F, -0.47F, -0.2F, 0F, -0.47F, -0.75F, 0.055F, -0.42F, -0.75F, 0.055F, -0.42F, -0.75F, 0F, -0.47F, -0.75F, 0F); // Box 74
		headModel[32].setRotationPoint(0F, 0F, 0F);

		headModel[33].addShapeBox(-0.8F, -7.95F, -4F, 1, 1, 1, 0F,-0.47F, -0.65F, 0.055F, -0.42F, -0.65F, 0.055F, -0.42F, -0.65F, 0F, -0.47F, -0.65F, 0F, -0.47F, -0.3F, 0.055F, -0.42F, -0.3F, 0.055F, -0.42F, -0.3F, 0F, -0.47F, -0.3F, 0F); // Box 75
		headModel[33].setRotationPoint(0F, 0F, 0F);

		headModel[34].addShapeBox(-0.2F, -8F, -4F, 1, 1, 1, 0F,-0.43F, -0.25F, 0.055F, -0.48F, -0.25F, 0.055F, -0.48F, -0.25F, 0F, -0.43F, -0.25F, 0F, -0.43F, -0.7F, 0.055F, -0.48F, -0.7F, 0.055F, -0.48F, -0.7F, 0F, -0.43F, -0.7F, 0F); // Box 76
		headModel[34].setRotationPoint(0F, 0F, 0F);

		headModel[35].addShapeBox(-0.2F, -8F, -4F, 1, 1, 1, 0F,-0.43F, -0.7F, 0.055F, -0.48F, -0.7F, 0.055F, -0.48F, -0.7F, 0F, -0.43F, -0.7F, 0F, -0.43F, -0.25F, 0.055F, -0.48F, -0.25F, 0.055F, -0.48F, -0.25F, 0F, -0.43F, -0.25F, 0F); // Box 77
		headModel[35].setRotationPoint(0F, 0F, 0F);

		headModel[36].addShapeBox(-0.4F, -8F, -4F, 1, 1, 1, 0F,-0.43F, -0.25F, 0.055F, -0.48F, -0.25F, 0.055F, -0.48F, -0.25F, 0F, -0.43F, -0.7F, 0F, -0.43F, -0.7F, 0.055F, -0.48F, -0.7F, 0.055F, -0.48F, -0.7F, 0F, -0.43F, -0.7F, 0F); // Box 78
		headModel[36].setRotationPoint(0F, 0F, 0F);

		headModel[37].addShapeBox(-0.8F, -7.95F, -4F, 1, 1, 1, 0F,-0.68F, -0.2F, 0.055F, -0.25F, -0.2F, 0.055F, -0.25F, -0.2F, 0F, -0.68F, -0.2F, 0F, -0.68F, -0.75F, 0.055F, -0.25F, -0.7F, 0.055F, -0.25F, -0.7F, 0F, -0.68F, -0.75F, 0F); // Box 79
		headModel[37].setRotationPoint(0F, 0F, 0F);

		headModel[38].addShapeBox(-0.5F, -8F, -4F, 1, 1, 1, 0F,-0.25F, -0.325F, 0.06F, -0.73F, -0.325F, 0.06F, -0.73F, -0.325F, 0F, -0.25F, -0.325F, 0F, -0.25F, -0.325F, 0.06F, -0.73F, -0.325F, 0.06F, -0.73F, -0.325F, 0F, -0.25F, -0.325F, 0F); // Box 141
		headModel[38].setRotationPoint(0F, 0F, 0F);

		headModel[39].addShapeBox(-0.5F, -8F, -4F, 1, 1, 1, 0F,-0.05F, -0.325F, 0.06F, -0.8F, -0.325F, 0.06F, -0.8F, -0.325F, 0F, -0.05F, -0.325F, 0F, -0.05F, -0.325F, 0.06F, -0.8F, -0.325F, 0.06F, -0.8F, -0.325F, 0F, -0.05F, -0.325F, 0F); // Box 142
		headModel[39].setRotationPoint(0F, 0F, 0F);

		headModel[40].addShapeBox(-0.5F, -8F, -4F, 1, 1, 1, 0F,-0.8F, -0.325F, 0.06F, -0.05F, -0.325F, 0.06F, -0.05F, -0.325F, 0F, -0.8F, -0.325F, 0F, -0.8F, -0.325F, 0.06F, -0.05F, -0.325F, 0.06F, -0.05F, -0.325F, 0F, -0.8F, -0.325F, 0F); // Box 143
		headModel[40].setRotationPoint(0F, 0F, 0F);

		headModel[41].addShapeBox(-0.5F, -8F, -4F, 1, 1, 1, 0F,-0.325F, -0.05F, 0.06F, -0.325F, -0.05F, 0.06F, -0.325F, -0.05F, 0F, -0.325F, -0.05F, 0F, -0.13F, -0.75F, 0.06F, -0.13F, -0.75F, 0.06F, -0.13F, -0.75F, 0F, -0.13F, -0.75F, 0F); // Box 144
		headModel[41].setRotationPoint(0F, 0F, 0F);

		headModel[42].addShapeBox(-0.5F, -8F, -4F, 1, 1, 1, 0F,-0.13F, -0.75F, 0.06F, -0.13F, -0.75F, 0.06F, -0.13F, -0.75F, 0F, -0.13F, -0.75F, 0F, -0.325F, -0.05F, 0.06F, -0.325F, -0.05F, 0.06F, -0.325F, -0.05F, 0F, -0.325F, -0.05F, 0F); // Box 145
		headModel[42].setRotationPoint(0F, 0F, 0F);

		headModel[43].addShapeBox(-0.5F, -8F, -4F, 1, 1, 1, 0F,-0.6F, -0.325F, 0.06F, -0.25F, -0.325F, 0.06F, -0.25F, -0.325F, 0F, -0.6F, -0.325F, 0F, -0.6F, -0.325F, 0.06F, -0.25F, -0.325F, 0.06F, -0.25F, -0.325F, 0F, -0.6F, -0.325F, 0F); // Box 146
		headModel[43].setRotationPoint(0F, 0F, 0F);

		headModel[44].addShapeBox(-0.5F, -8F, -4F, 1, 1, 1, 0F,-0.45F, -0.3F, 0.06F, -0.45F, -0.3F, 0.06F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0.06F, -0.45F, -0.3F, 0.06F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F); // Box 147
		headModel[44].setRotationPoint(0F, 0F, 0F);

		headModel[45].addShapeBox(-0.5F, -8F, -4F, 1, 1, 1, 0F,-0.45F, -0.7F, 0.06F, -0.5F, -0.7F, 0.06F, -0.5F, -0.7F, 0F, -0.45F, -0.7F, 0F, -0.45F, -0.25F, 0.06F, -0.5F, -0.25F, 0.06F, -0.5F, -0.25F, 0F, -0.45F, -0.25F, 0F); // Box 148
		headModel[45].setRotationPoint(0F, 0F, 0F);

		headModel[46].addShapeBox(-0.5F, -8F, -4F, 1, 1, 1, 0F,-0.4F, -0.35F, 0.06F, -0.55F, -0.35F, 0.06F, -0.55F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.325F, 0.06F, -0.55F, -0.325F, 0.06F, -0.55F, -0.325F, 0F, -0.4F, -0.325F, 0F); // Box 149
		headModel[46].setRotationPoint(0F, 0F, 0F);

		headModel[47].addShapeBox(-0.5F, -8F, -4F, 1, 1, 1, 0F,-0.8F, -0.675F, 0.06F, -0.05F, -0.675F, 0.06F, -0.05F, -0.675F, 0F, -0.8F, -0.675F, 0F, -0.8F, -0.3F, 0.06F, -0.07F, -0.3F, 0.06F, -0.07F, -0.3F, 0F, -0.8F, -0.3F, 0F); // Box 150
		headModel[47].setRotationPoint(0F, 0F, 0F);

		headModel[48].addShapeBox(-0.5F, -8F, -4F, 1, 1, 1, 0F,-0.05F, -0.675F, 0.06F, -0.8F, -0.675F, 0.06F, -0.8F, -0.675F, 0F, -0.05F, -0.675F, 0F, -0.07F, -0.3F, 0.06F, -0.8F, -0.3F, 0.06F, -0.8F, -0.3F, 0F, -0.07F, -0.3F, 0F); // Box 151
		headModel[48].setRotationPoint(0F, 0F, 0F);

		headModel[49].addShapeBox(-0.5F, -8F, -4F, 1, 1, 1, 0F,-0.07F, -0.3F, 0.06F, -0.8F, -0.3F, 0.06F, -0.8F, -0.3F, 0F, -0.07F, -0.3F, 0F, -0.05F, -0.675F, 0.06F, -0.8F, -0.675F, 0.06F, -0.8F, -0.675F, 0F, -0.05F, -0.675F, 0F); // Box 152
		headModel[49].setRotationPoint(0F, 0F, 0F);

		headModel[50].addShapeBox(-0.5F, -8F, -4F, 1, 1, 1, 0F,-0.8F, -0.3F, 0.06F, -0.07F, -0.3F, 0.06F, -0.07F, -0.3F, 0F, -0.8F, -0.3F, 0F, -0.8F, -0.675F, 0.06F, -0.05F, -0.675F, 0.06F, -0.05F, -0.675F, 0F, -0.8F, -0.675F, 0F); // Box 153
		headModel[50].setRotationPoint(0F, 0F, 0F);

		headModel[51].addShapeBox(-0.5F, -8F, -4F, 1, 1, 1, 0F,-0.6F, -0.675F, 0.06F, -0.25F, -0.675F, 0.06F, -0.25F, -0.675F, 0F, -0.6F, -0.675F, 0F, -0.58F, -0.3F, 0.06F, -0.25F, -0.3F, 0.06F, -0.25F, -0.3F, 0F, -0.58F, -0.3F, 0F); // Box 154
		headModel[51].setRotationPoint(0F, 0F, 0F);

		headModel[52].addShapeBox(-0.5F, -8F, -4F, 1, 1, 1, 0F,-0.25F, -0.675F, 0.06F, -0.65F, -0.675F, 0.06F, -0.65F, -0.675F, 0F, -0.25F, -0.675F, 0F, -0.25F, -0.3F, 0.06F, -0.62F, -0.3F, 0.06F, -0.62F, -0.3F, 0F, -0.25F, -0.3F, 0F); // Box 155
		headModel[52].setRotationPoint(0F, 0F, 0F);

		headModel[53].addShapeBox(-0.5F, -8F, -4F, 1, 1, 1, 0F,-0.25F, -0.325F, 0.06F, -0.65F, -0.325F, 0.06F, -0.65F, -0.325F, 0F, -0.25F, -0.325F, 0F, -0.25F, -0.55F, 0.06F, -0.7F, -0.55F, 0.06F, -0.7F, -0.55F, 0F, -0.25F, -0.55F, 0F); // Box 160
		headModel[53].setRotationPoint(0F, 0F, 0F);

		headModel[54].addShapeBox(-0.5F, -8F, -4F, 1, 1, 1, 0F,-0.25F, -0.55F, 0.06F, -0.7F, -0.55F, 0.06F, -0.7F, -0.55F, 0F, -0.25F, -0.55F, 0F, -0.25F, -0.325F, 0.06F, -0.65F, -0.325F, 0.06F, -0.65F, -0.325F, 0F, -0.25F, -0.325F, 0F); // Box 161
		headModel[54].setRotationPoint(0F, 0F, 0F);

		headModel[55].addShapeBox(-0.5F, -8F, -4F, 1, 1, 1, 0F,-0.32F, -0.325F, 0.06F, -0.65F, -0.325F, 0.06F, -0.65F, -0.325F, 0F, -0.32F, -0.325F, 0F, -0.32F, -0.325F, 0.06F, -0.65F, -0.325F, 0.06F, -0.65F, -0.325F, 0F, -0.32F, -0.325F, 0F); // Box 162
		headModel[55].setRotationPoint(0F, 0F, 0F);

		headModel[56].addShapeBox(-0.5F, -8F, -4F, 1, 1, 1, 0F,-0.6F, -0.3F, 0.06F, -0.25F, -0.3F, 0.06F, -0.25F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.675F, 0.06F, -0.25F, -0.675F, 0.06F, -0.25F, -0.675F, 0F, -0.6F, -0.675F, 0F); // Box 163
		headModel[56].setRotationPoint(0F, 0F, 0F);

		headModel[57].addShapeBox(-0.5F, -8F, -4F, 1, 1, 1, 0F,-0.05F, -0.675F, 0.06F, -0.82F, -0.675F, 0.06F, -0.82F, -0.675F, 0F, -0.05F, -0.675F, 0F, -0.125F, -0.25F, 0.06F, -0.82F, -0.25F, 0.06F, -0.82F, -0.25F, 0F, -0.125F, -0.25F, 0F); // Box 164
		headModel[57].setRotationPoint(0F, 0F, 0F);

		headModel[58].addShapeBox(-0.5F, -8F, -4F, 1, 1, 1, 0F,-0.125F, -0.25F, 0.06F, -0.82F, -0.25F, 0.06F, -0.82F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.05F, -0.675F, 0.06F, -0.82F, -0.675F, 0.06F, -0.82F, -0.675F, 0F, -0.05F, -0.675F, 0F); // Box 165
		headModel[58].setRotationPoint(0F, 0F, 0F);

		headModel[59].addShapeBox(-0.5F, -8F, -4F, 1, 1, 1, 0F,-0.82F, -0.25F, 0.06F, -0.125F, -0.25F, 0.06F, -0.125F, -0.25F, 0F, -0.82F, -0.25F, 0F, -0.82F, -0.675F, 0.06F, -0.05F, -0.675F, 0.06F, -0.05F, -0.675F, 0F, -0.82F, -0.675F, 0F); // Box 166
		headModel[59].setRotationPoint(0F, 0F, 0F);

		headModel[60].addShapeBox(-0.5F, -8F, -4F, 1, 1, 1, 0F,-0.82F, -0.675F, 0.06F, -0.05F, -0.675F, 0.06F, -0.05F, -0.675F, 0F, -0.82F, -0.675F, 0F, -0.82F, -0.25F, 0.06F, -0.125F, -0.25F, 0.06F, -0.125F, -0.25F, 0F, -0.82F, -0.25F, 0F); // Box 167
		headModel[60].setRotationPoint(0F, 0F, 0F);

		headModel[61].addShapeBox(-0.5F, -8F, -4F, 1, 1, 1, 0F,-0.45F, -0.7F, 0.06F, -0.5F, -0.7F, 0.06F, -0.5F, -0.7F, 0F, -0.45F, -0.7F, 0F, -0.45F, -0.25F, 0.06F, -0.5F, -0.25F, 0.06F, -0.5F, -0.25F, 0F, -0.45F, -0.25F, 0F); // Box 168
		headModel[61].setRotationPoint(0F, 0F, 0F);

		headModel[62].addShapeBox(-0.5F, -8F, -4F, 1, 1, 1, 0F,-0.27F, -0.7F, 0.06F, -0.62F, -0.7F, 0.06F, -0.62F, -0.7F, 0F, -0.27F, -0.7F, 0F, -0.27F, -0.25F, 0.06F, -0.55F, -0.25F, 0.06F, -0.55F, -0.25F, 0F, -0.27F, -0.25F, 0F); // Box 169
		headModel[62].setRotationPoint(0F, 0F, 0F);

		headModel[63].addShapeBox(-0.5F, -8F, -4F, 1, 1, 1, 0F,-0.58F, -0.7F, 0.06F, -0.27F, -0.7F, 0.06F, -0.27F, -0.7F, 0F, -0.58F, -0.7F, 0F, -0.55F, -0.25F, 0.06F, -0.27F, -0.25F, 0.06F, -0.27F, -0.25F, 0F, -0.55F, -0.25F, 0F); // Box 170
		headModel[63].setRotationPoint(0F, 0F, 0F);

		headModel[64].addShapeBox(-0.5F, -8F, -4F, 1, 1, 1, 0F,-0.35F, -0.35F, 0.06F, -0.55F, -0.35F, 0.06F, -0.55F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0.06F, -0.55F, -0.35F, 0.06F, -0.55F, -0.35F, 0F, -0.35F, -0.35F, 0F); // Box 171
		headModel[64].setRotationPoint(0F, 0F, 0F);

		headModel[65].addShapeBox(-0.5F, -8F, -4F, 1, 1, 1, 0F,-0.27F, -0.25F, 0.06F, -0.67F, -0.25F, 0.06F, -0.67F, -0.25F, 0F, -0.27F, -0.25F, 0F, -0.27F, -0.7F, 0.06F, -0.67F, -0.7F, 0.06F, -0.67F, -0.7F, 0F, -0.27F, -0.7F, 0F); // Box 172
		headModel[65].setRotationPoint(0F, 0F, 0F);

		headModel[66].addShapeBox(-0.3F, -8F, -4F, 1, 1, 1, 0F,-0.25F, -0.25F, 0.06F, -0.67F, -0.25F, 0.06F, -0.67F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.7F, 0.06F, -0.67F, -0.7F, 0.06F, -0.67F, -0.7F, 0F, -0.25F, -0.7F, 0F); // Box 173
		headModel[66].setRotationPoint(0F, 0F, 0F);

		headModel[67].addShapeBox(-0.5F, -8F, -4F, 1, 1, 1, 0F,-0.25F, -0.3F, 0.06F, -0.62F, -0.3F, 0.06F, -0.62F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.675F, 0.06F, -0.65F, -0.675F, 0.06F, -0.65F, -0.675F, 0F, -0.25F, -0.675F, 0F); // Box 174
		headModel[67].setRotationPoint(0F, 0F, 0F);

		headModel[68].addShapeBox(-0.1F, -8F, -4F, 1, 1, 1, 0F,-0.23F, -0.25F, 0.06F, -0.67F, -0.25F, 0.06F, -0.67F, -0.25F, 0F, -0.23F, -0.25F, 0F, -0.23F, -0.7F, 0.06F, -0.67F, -0.7F, 0.06F, -0.67F, -0.7F, 0F, -0.23F, -0.7F, 0F); // Box 175
		headModel[68].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 9
		bodyModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 11
		bodyModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 16
		bodyModel[4] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 19
		bodyModel[5] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 20
		bodyModel[6] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 21
		bodyModel[7] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 22
		bodyModel[8] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 23
		bodyModel[9] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 24
		bodyModel[10] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 25
		bodyModel[11] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 26
		bodyModel[12] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 32
		bodyModel[13] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 32
		bodyModel[14] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 36
		bodyModel[15] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 4
		bodyModel[16] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 4
		bodyModel[17] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 4
		bodyModel[18] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 42
		bodyModel[19] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 43
		bodyModel[20] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 46
		bodyModel[21] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 30
		bodyModel[22] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 31
		bodyModel[23] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 32
		bodyModel[24] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 34
		bodyModel[25] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 35
		bodyModel[26] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 36
		bodyModel[27] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 37
		bodyModel[28] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 38
		bodyModel[29] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 39
		bodyModel[30] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 41
		bodyModel[31] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 42
		bodyModel[32] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 44
		bodyModel[33] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 45
		bodyModel[34] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 49
		bodyModel[35] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 49
		bodyModel[36] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 51
		bodyModel[37] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 51
		bodyModel[38] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 53
		bodyModel[39] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 54
		bodyModel[40] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 55
		bodyModel[41] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 55
		bodyModel[42] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 55
		bodyModel[43] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 80
		bodyModel[44] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 81
		bodyModel[45] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 83
		bodyModel[46] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 84
		bodyModel[47] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 85
		bodyModel[48] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 86
		bodyModel[49] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 90
		bodyModel[50] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 91
		bodyModel[51] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 92
		bodyModel[52] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 94
		bodyModel[53] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 96
		bodyModel[54] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 98
		bodyModel[55] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 99
		bodyModel[56] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 100
		bodyModel[57] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 101
		bodyModel[58] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 102
		bodyModel[59] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 103
		bodyModel[60] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 104
		bodyModel[61] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 105
		bodyModel[62] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 106
		bodyModel[63] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 107
		bodyModel[64] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 107
		bodyModel[65] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 107
		bodyModel[66] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 107
		bodyModel[67] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 111
		bodyModel[68] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 112
		bodyModel[69] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 113
		bodyModel[70] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 113
		bodyModel[71] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 113
		bodyModel[72] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 113
		bodyModel[73] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 117
		bodyModel[74] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 118
		bodyModel[75] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 119
		bodyModel[76] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 120
		bodyModel[77] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 121
		bodyModel[78] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 122
		bodyModel[79] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 122
		bodyModel[80] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 122
		bodyModel[81] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 122
		bodyModel[82] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 122
		bodyModel[83] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 122
		bodyModel[84] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 122
		bodyModel[85] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 122
		bodyModel[86] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 122
		bodyModel[87] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 131
		bodyModel[88] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 108
		bodyModel[89] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 109
		bodyModel[90] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 110
		bodyModel[91] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 121
		bodyModel[92] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 121
		bodyModel[93] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 121
		bodyModel[94] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 138
		bodyModel[95] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 139
		bodyModel[96] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 140
		bodyModel[97] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 156
		bodyModel[98] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 157
		bodyModel[99] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 158
		bodyModel[100] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 159
		bodyModel[101] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 176
		bodyModel[102] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 177
		bodyModel[103] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 178
		bodyModel[104] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 179
		bodyModel[105] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 180
		bodyModel[106] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 180
		bodyModel[107] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 180
		bodyModel[108] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 180
		bodyModel[109] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 185
		bodyModel[110] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 186
		bodyModel[111] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 187
		bodyModel[112] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 188
		bodyModel[113] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 189
		bodyModel[114] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 189
		bodyModel[115] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 189
		bodyModel[116] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 189
		bodyModel[117] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 117
		bodyModel[118] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 117
		bodyModel[119] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 117
		bodyModel[120] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 117
		bodyModel[121] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 1
		bodyModel[122] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 1
		bodyModel[123] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 1
		bodyModel[124] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 114
		bodyModel[125] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 115
		bodyModel[126] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 119
		bodyModel[127] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 114
		bodyModel[128] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 114
		bodyModel[129] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 114
		bodyModel[130] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 119
		bodyModel[131] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 119
		bodyModel[132] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 119
		bodyModel[133] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 115
		bodyModel[134] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 115
		bodyModel[135] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 115
		bodyModel[136] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 80
		bodyModel[137] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 80
		bodyModel[138] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 80
		bodyModel[139] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 80
		bodyModel[140] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 1
		bodyModel[141] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 1
		bodyModel[142] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 1

		bodyModel[0].addShapeBox(-4F, 1F, -2F, 8, 10, 4, 0F,0.01F, 0.5F, 0.01F, 0.01F, 0.5F, 0.01F, 0.01F, 0.5F, 0.01F, 0.01F, 0.5F, 0.01F, 0.01F, 0F, 0.01F, 0.01F, 0F, 0.01F, 0.01F, 0F, 0.01F, 0.01F, 0F, 0.01F); // Box 0
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(0F, 0F, -2F, 1, 2, 4, 0F,-0.99F, 0.05F, 0.05F, 1.51F, 0.05F, 0.05F, 1.01F, 0.05F, 0.01F, -0.99F, 0.05F, 0.01F, 0.01F, -1.5F, 0.05F, -0.24F, -0.5F, 0.05F, 0.01F, 0F, -0.99F, 0.01F, 0F, -0.99F); // Box 9
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-3.5F, 3F, -2F, 2, 3, 1, 0F,0.01F, 0F, 0.1F, 0.01F, 0F, 0.1F, 0.01F, 0F, 0.01F, 0.01F, 0F, 0.01F, 0.01F, 0F, 0.1F, 0.01F, 0F, 0.1F, 0.01F, 0F, 0.01F, 0.01F, 0F, 0.01F); // Box 11
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-3.5F, 7.5F, -2F, 2, 2, 1, 0F,0.01F, 0F, 0.1F, 0.01F, 0F, 0.1F, 0.01F, 0F, 0.01F, 0.01F, 0F, 0.01F, 0.01F, 0F, 0.1F, 0.01F, 0F, 0.1F, 0.01F, 0F, 0.01F, 0.01F, 0F, 0.01F); // Box 16
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 7F, -2F, 8, 1, 4, 0F,0.11F, 0F, 0.11F, 0.11F, 0F, 0.11F, 0.11F, 0F, 0.11F, 0.11F, 0F, 0.11F, 0.11F, 0F, 0.11F, 0.11F, 0F, 0.11F, 0.11F, 0F, 0.11F, 0.11F, 0F, 0.11F); // Box 19
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-1F, 7F, -2F, 1, 1, 1, 0F,0.11F, 0.1F, 0.16F, -0.89F, 0.1F, 0.16F, -0.89F, 0.1F, 0.16F, 0.11F, 0.1F, 0.16F, 0.11F, 0.1F, 0.16F, -0.89F, 0.1F, 0.16F, -0.89F, 0.1F, 0.16F, 0.11F, 0.1F, 0.16F); // Box 20
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(0F, 7F, -2F, 1, 1, 1, 0F,-0.89F, 0.1F, 0.16F, 0.11F, 0.1F, 0.16F, 0.11F, 0.1F, 0.16F, -0.89F, 0.1F, 0.16F, -0.89F, 0.1F, 0.16F, 0.11F, 0.1F, 0.16F, 0.11F, 0.1F, 0.16F, -0.89F, 0.1F, 0.16F); // Box 21
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-1F, 7F, -2F, 3, 1, 1, 0F,0.11F, 0.1F, 0.16F, -0.89F, 0.1F, 0.16F, -0.89F, 0.1F, 0.16F, 0.11F, 0.1F, 0.16F, 0.11F, -1F, 0.16F, -0.89F, -1F, 0.16F, -0.89F, -1F, 0.16F, 0.11F, -1F, 0.16F); // Box 22
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-1F, 7F, -2F, 3, 1, 1, 0F,0.11F, -1F, 0.16F, -0.89F, -1F, 0.16F, -0.89F, -1F, 0.16F, 0.11F, -1F, 0.16F, 0.11F, 0.1F, 0.16F, -0.89F, 0.1F, 0.16F, -0.89F, 0.1F, 0.16F, 0.11F, 0.1F, 0.16F); // Box 23
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-1F, 7F, -2F, 3, 1, 1, 0F,-0.09F, -0.5F, 0.16F, 0.11F, -0.5F, 0.21F, 0.11F, -0.5F, 0.11F, -0.09F, -0.5F, 0.11F, -0.09F, 0F, 0.16F, -0.39F, 0F, 0.21F, -0.39F, 0F, 0.11F, -0.09F, 0F, 0.11F); // Box 24
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-1F, 7F, -2F, 3, 1, 1, 0F,-0.09F, 0F, 0.11F, -0.39F, 0F, 0.21F, -0.39F, 0F, 0.11F, -0.09F, 0F, 0.11F, -0.09F, -0.5F, 0.16F, 0.11F, -0.5F, 0.21F, 0.11F, -0.5F, 0.11F, -0.09F, -0.5F, 0.11F); // Box 25
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-1F, 6.45F, -2F, 3, 1, 1, 0F,0.01F, -1F, 0.26F, -0.89F, -1F, 0.16F, -0.89F, -1F, -1.04F, 0.01F, -1F, -1.19F, 0.01F, 0.1F, 0.26F, -0.89F, 0.1F, 0.16F, -0.89F, 0.1F, -1.04F, 0.01F, 0.1F, -1.19F); // Box 26
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-3.5F, 3F, -2F, 1, 1, 1, 0F,0.01F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.01F, 0.01F, 0F, 0.01F, 0.01F, 0F, 0.15F, -0.5F, -0.375F, 0.15F, -0.5F, -0.375F, 0.01F, 0.01F, 0F, 0.01F); // Box 32
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-3.5F, 3F, -2F, 1, 1, 1, 0F,-0.5F, 0F, 0.1F, 0.01F, 0F, 0.1F, 0.01F, 0F, 0.01F, -0.5F, 0F, 0.01F, -0.5F, -0.375F, 0.15F, 0.01F, 0F, 0.15F, 0.01F, 0F, 0.01F, -0.5F, -0.375F, 0.01F); // Box 32
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-4F, 11F, -2F, 8, 1, 4, 0F,0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F); // Box 36
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-2.75F, 3F, -2F, 1, 1, 1, 0F,0.01F, -0.325F, 0.15F, -0.5F, -0.325F, 0.15F, -0.5F, -0.325F, 0.01F, 0.01F, -0.325F, 0.01F, 0.01F, -0.45F, 0.15F, -0.5F, -0.45F, 0.15F, -0.5F, -0.45F, 0.01F, 0.01F, -0.45F, 0.01F); // Box 4
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-2.75F, 3F, -2F, 1, 1, 1, 0F,-0.115F, -0.175F, 0.15F, -0.625F, -0.175F, 0.15F, -0.625F, -0.175F, 0.01F, -0.115F, -0.175F, 0.01F, 0.01F, -0.675F, 0.15F, -0.5F, -0.675F, 0.15F, -0.5F, -0.675F, 0.01F, 0.01F, -0.675F, 0.01F); // Box 4
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-2.75F, 3F, -2F, 1, 1, 1, 0F,0.01F, -0.55F, 0.15F, -0.5F, -0.55F, 0.15F, -0.5F, -0.55F, 0.01F, 0.01F, -0.55F, 0.01F, -0.115F, -0.3F, 0.15F, -0.625F, -0.3F, 0.15F, -0.625F, -0.3F, 0.01F, -0.115F, -0.3F, 0.01F); // Box 4
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(0F, 1F, -2F, 4, 11, 4, 0F,0.01F, 0.5F, 0.02F, 0.01F, 0.5F, 0.01F, 0.01F, 0.5F, 0.01F, 0.01F, 0.5F, 0.01F, 0.01F, 0F, 0.02F, 0.01F, 0F, 0.01F, 0.01F, 0F, 0.01F, 0.01F, 0F, 0.01F); // Box 42
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(0F, 11F, -2F, 4, 1, 4, 0F,0.05F, 0F, 0.06F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.06F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F); // Box 43
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(0F, 2.75F, -2F, 1, 1, 1, 0F,-0.25F, -0.25F, 0.05F, -0.25F, -0.25F, 0.05F, -0.25F, -0.25F, 0.01F, -0.25F, -0.25F, 0.01F, -0.25F, -0.25F, 0.05F, -0.25F, -0.25F, 0.05F, -0.25F, -0.25F, 0.01F, -0.25F, -0.25F, 0.01F); // Box 46
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-1F, 0F, -2F, 1, 2, 4, 0F,1.51F, 0.05F, 0.05F, -0.99F, 0.05F, 0.05F, -0.99F, 0.05F, 0.01F, 1.01F, 0.05F, 0.01F, -0.24F, -0.5F, 0.05F, 0.01F, -1.5F, 0.05F, 0.01F, 0F, -0.99F, 0.01F, 0F, -0.99F); // Box 30
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-4F, 0F, -2F, 4, 1, 4, 0F,0.01F, 0F, 0.01F, -0.99F, 0F, 0.01F, 0.01F, 0F, 0.01F, 0.01F, 0F, 0.01F, 0.01F, -0.5F, 0.01F, 0.01F, -0.5F, 0.01F, 0.01F, -0.5F, 0.01F, 0.01F, -0.5F, 0.01F); // Box 31
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(0F, 0F, -2F, 4, 1, 4, 0F,-0.99F, 0F, 0.01F, 0.01F, 0F, 0.01F, 0.01F, 0F, 0.01F, 0.01F, 0F, 0.01F, 0.01F, -0.5F, 0.01F, 0.01F, -0.5F, 0.01F, 0.01F, -0.5F, 0.01F, 0.01F, -0.5F, 0.01F); // Box 32
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(0F, 0F, -2F, 1, 2, 4, 0F,-1.24F, 0.05F, 0.06F, 1.36F, 0.05F, 0.06F, 1.36F, 0.05F, 0.01F, -1.24F, 0.05F, 0.01F, -0.19F, -1.45F, 0.06F, -0.24F, -0.7F, 0.06F, -0.24F, -0.7F, -0.99F, -0.19F, -1.45F, -0.99F); // Box 34
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(0F, 0F, -2F, 1, 2, 4, 0F,-0.99F, 0.05F, 0.05F, 1.51F, 0.05F, 0.05F, 1.01F, 0.05F, 0.01F, -0.99F, 0.05F, 0.01F, 0.01F, -1.5F, 0.05F, -0.24F, -0.5F, 0.05F, 0.01F, 0F, -0.99F, 0.01F, 0F, -0.99F); // Box 35
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-1F, 0F, -2F, 1, 2, 4, 0F,1.36F, 0.05F, 0.06F, -1.24F, 0.05F, 0.06F, -1.24F, 0.05F, 0.01F, 1.36F, 0.05F, 0.01F, -0.24F, -0.7F, 0.06F, -0.19F, -1.45F, 0.06F, -0.19F, -1.45F, -0.99F, -0.24F, -0.7F, -0.99F); // Box 36
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(0F, 4F, -2F, 1, 1, 1, 0F,-0.25F, -0.25F, 0.05F, -0.25F, -0.25F, 0.05F, -0.25F, -0.25F, 0.01F, -0.25F, -0.25F, 0.01F, -0.25F, -0.25F, 0.05F, -0.25F, -0.25F, 0.05F, -0.25F, -0.25F, 0.01F, -0.25F, -0.25F, 0.01F); // Box 37
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(0F, 5.25F, -2F, 1, 1, 1, 0F,-0.25F, -0.25F, 0.05F, -0.25F, -0.25F, 0.05F, -0.25F, -0.25F, 0.01F, -0.25F, -0.25F, 0.01F, -0.25F, -0.25F, 0.05F, -0.25F, -0.25F, 0.05F, -0.25F, -0.25F, 0.01F, -0.25F, -0.25F, 0.01F); // Box 38
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(0F, 1.5F, -2F, 1, 1, 1, 0F,-0.25F, -0.25F, 0.05F, -0.25F, -0.25F, 0.05F, -0.25F, -0.25F, 0.01F, -0.25F, -0.25F, 0.01F, -0.25F, -0.25F, 0.05F, -0.25F, -0.25F, 0.05F, -0.25F, -0.25F, 0.01F, -0.25F, -0.25F, 0.01F); // Box 39
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(0F, 6.5F, -2F, 1, 1, 1, 0F,-0.25F, -0.25F, 0.05F, -0.25F, -0.25F, 0.05F, -0.25F, -0.25F, 0.01F, -0.25F, -0.25F, 0.01F, -0.25F, -0.25F, 0.05F, -0.25F, -0.25F, 0.05F, -0.25F, -0.25F, 0.01F, -0.25F, -0.25F, 0.01F); // Box 41
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(0F, 7.75F, -2F, 1, 1, 1, 0F,-0.25F, -0.25F, 0.05F, -0.25F, -0.25F, 0.05F, -0.25F, -0.25F, 0.01F, -0.25F, -0.25F, 0.01F, -0.25F, -0.25F, 0.05F, -0.25F, -0.25F, 0.05F, -0.25F, -0.25F, 0.01F, -0.25F, -0.25F, 0.01F); // Box 42
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(1.5F, 7.5F, -2F, 2, 2, 1, 0F,0.01F, 0F, 0.1F, 0.01F, 0F, 0.1F, 0.01F, 0F, 0.01F, 0.01F, 0F, 0.01F, 0.01F, 0F, 0.1F, 0.01F, 0F, 0.1F, 0.01F, 0F, 0.01F, 0.01F, 0F, 0.01F); // Box 44
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(1.5F, 3F, -2F, 2, 3, 1, 0F,0.01F, 0F, 0.1F, 0.01F, 0F, 0.1F, 0.01F, 0F, 0.01F, 0.01F, 0F, 0.01F, 0.01F, 0F, 0.1F, 0.01F, 0F, 0.1F, 0.01F, 0F, 0.01F, 0.01F, 0F, 0.01F); // Box 45
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-2.5F, 3F, -2F, 1, 1, 1, 0F,0.01F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.01F, 0.01F, 0F, 0.01F, 0.01F, 0F, 0.15F, -0.5F, -0.375F, 0.15F, -0.5F, -0.375F, 0.01F, 0.01F, 0F, 0.01F); // Box 49
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(-2.5F, 3F, -2F, 1, 1, 1, 0F,-0.5F, 0F, 0.1F, 0.01F, 0F, 0.1F, 0.01F, 0F, 0.01F, -0.5F, 0F, 0.01F, -0.5F, -0.375F, 0.15F, 0.01F, 0F, 0.15F, 0.01F, 0F, 0.01F, -0.5F, -0.375F, 0.01F); // Box 49
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(1.5F, 3F, -2F, 1, 1, 1, 0F,0.01F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.01F, 0.01F, 0F, 0.01F, 0.01F, 0F, 0.15F, -0.5F, -0.375F, 0.15F, -0.5F, -0.375F, 0.01F, 0.01F, 0F, 0.01F); // Box 51
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(1.5F, 3F, -2F, 1, 1, 1, 0F,-0.5F, 0F, 0.1F, 0.01F, 0F, 0.1F, 0.01F, 0F, 0.01F, -0.5F, 0F, 0.01F, -0.5F, -0.375F, 0.15F, 0.01F, 0F, 0.15F, 0.01F, 0F, 0.01F, -0.5F, -0.375F, 0.01F); // Box 51
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(2.5F, 3F, -2F, 1, 1, 1, 0F,0.01F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.01F, 0.01F, 0F, 0.01F, 0.01F, 0F, 0.15F, -0.5F, -0.375F, 0.15F, -0.5F, -0.375F, 0.01F, 0.01F, 0F, 0.01F); // Box 53
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(2.5F, 3F, -2F, 1, 1, 1, 0F,-0.5F, 0F, 0.1F, 0.01F, 0F, 0.1F, 0.01F, 0F, 0.01F, -0.5F, 0F, 0.01F, -0.5F, -0.375F, 0.15F, 0.01F, 0F, 0.15F, 0.01F, 0F, 0.01F, -0.5F, -0.375F, 0.01F); // Box 54
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(2.25F, 3F, -2F, 1, 1, 1, 0F,0.01F, -0.325F, 0.15F, -0.5F, -0.325F, 0.15F, -0.5F, -0.325F, 0.01F, 0.01F, -0.325F, 0.01F, 0.01F, -0.45F, 0.15F, -0.5F, -0.45F, 0.15F, -0.5F, -0.45F, 0.01F, 0.01F, -0.45F, 0.01F); // Box 55
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(2.25F, 3F, -2F, 1, 1, 1, 0F,-0.115F, -0.175F, 0.15F, -0.625F, -0.175F, 0.15F, -0.625F, -0.175F, 0.01F, -0.115F, -0.175F, 0.01F, 0.01F, -0.675F, 0.15F, -0.5F, -0.675F, 0.15F, -0.5F, -0.675F, 0.01F, 0.01F, -0.675F, 0.01F); // Box 55
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(2.25F, 3F, -2F, 1, 1, 1, 0F,0.01F, -0.55F, 0.15F, -0.5F, -0.55F, 0.15F, -0.5F, -0.55F, 0.01F, 0.01F, -0.55F, 0.01F, -0.115F, -0.3F, 0.15F, -0.625F, -0.3F, 0.15F, -0.625F, -0.3F, 0.01F, -0.115F, -0.3F, 0.01F); // Box 55
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(-3F, 4.5F, 2F, 6, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 80
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(-4F, 7.5F, 2.5F, 8, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(-4F, 8.5F, 2.5F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(-4F, 8.5F, 3.5F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 84
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(-4F, 7.5F, 3.5F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(-2.5F, 1F, 2.25F, 5, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.3F, -0.425F, 0F, -0.3F, -0.425F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(-2.5F, 0.5F, 2.25F, 5, 1, 1, 0F,0F, -0.3F, -0.425F, 0F, -0.3F, -0.425F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 90
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(-2.5F, 1F, 3.25F, 5, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.425F, 0F, -0.3F, -0.425F); // Box 91
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(-3.5F, 0.5F, 3.25F, 1, 1, 1, 0F,0.5F, -1.5F, 0F, -0.875F, -0.625F, 0F, -0.75F, -0.8F, -0.425F, 0.2F, -1.5F, -0.425F, 0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0.5F, -0.25F); // Box 92
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(-3.5F, 1F, 3.25F, 1, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.425F, -0.8F, -0.2F, -0.425F); // Box 94
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(-3.5F, 1F, 3.25F, 1, 1, 1, 0F,-0.25F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, -0.25F, -1F, -0.25F, -1F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, -0.425F, -0.7F, 0F, -0.425F); // Box 96
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(-3.5F, 2F, 3.25F, 1, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.425F, -0.25F, 0F, -0.25F, 0.25F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.8F, 0.5F, -0.425F, 0.25F, 0.5F, -0.25F); // Box 98
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(-3.5F, 1F, 2.25F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.8F, -0.2F, -0.425F, 0F, -0.3F, -0.425F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 99
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addShapeBox(-3F, 2.5F, 2F, 6, 2, 3, 0F,-0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.4F, -0.75F, -0.5F, 0.4F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 100
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addShapeBox(-3.5F, 2F, 2.25F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.3F, 0F, -0.425F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0.5F, -0.25F, -0.8F, 0.5F, -0.425F, -0.5F, 0.5F, 0F, 0.25F, 0.5F, 0F); // Box 101
		bodyModel[57].setRotationPoint(0F, 0F, 0F);

		bodyModel[58].addShapeBox(-3.5F, 1F, 2.25F, 1, 1, 1, 0F,-0.25F, -1F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, -0.25F, -1F, 0F, -0.7F, 0F, -0.425F, -0.2F, -0.2F, -0.425F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 102
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addShapeBox(-3.5F, 5F, 3.25F, 1, 2, 1, 0F,0.25F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.8F, 0.5F, -0.425F, 0.25F, 0.5F, -0.25F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.8F, 0F, -0.425F, 0.25F, 0F, -0.25F); // Box 103
		bodyModel[59].setRotationPoint(0F, 0F, 0F);

		bodyModel[60].addShapeBox(-3.5F, 5F, 2.25F, 1, 2, 1, 0F,0.25F, 0.5F, -0.25F, -0.8F, 0.5F, -0.425F, -0.5F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, -0.25F, -0.8F, 0F, -0.425F, -0.5F, 0F, 0F, 0.25F, 0F, 0F); // Box 104
		bodyModel[60].setRotationPoint(0F, 0F, 0F);

		bodyModel[61].addShapeBox(-5F, 5F, 2.25F, 1, 2, 1, 0F,-0.8F, 0.5F, -0.425F, 0.25F, 0.5F, -0.25F, 0.25F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.8F, 0F, -0.425F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, -0.5F, 0F, 0F); // Box 105
		bodyModel[61].setRotationPoint(0F, 0F, 0F);

		bodyModel[62].addShapeBox(-5F, 5F, 3.25F, 1, 2, 1, 0F,-0.5F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, -0.25F, -0.8F, 0.5F, -0.425F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, -0.8F, 0F, -0.425F); // Box 106
		bodyModel[62].setRotationPoint(0F, 0F, 0F);

		bodyModel[63].addShapeBox(4F, 5F, 3.25F, 1, 2, 1, 0F,0.25F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.8F, 0.5F, -0.425F, 0.25F, 0.5F, -0.25F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.8F, 0F, -0.425F, 0.25F, 0F, -0.25F); // Box 107
		bodyModel[63].setRotationPoint(0F, 0F, 0F);

		bodyModel[64].addShapeBox(4F, 5F, 2.25F, 1, 2, 1, 0F,0.25F, 0.5F, -0.25F, -0.8F, 0.5F, -0.425F, -0.5F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, -0.25F, -0.8F, 0F, -0.425F, -0.5F, 0F, 0F, 0.25F, 0F, 0F); // Box 107
		bodyModel[64].setRotationPoint(0F, 0F, 0F);

		bodyModel[65].addShapeBox(2.5F, 5F, 2.25F, 1, 2, 1, 0F,-0.8F, 0.5F, -0.425F, 0.25F, 0.5F, -0.25F, 0.25F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.8F, 0F, -0.425F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, -0.5F, 0F, 0F); // Box 107
		bodyModel[65].setRotationPoint(0F, 0F, 0F);

		bodyModel[66].addShapeBox(2.5F, 5F, 3.25F, 1, 2, 1, 0F,-0.5F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, -0.25F, -0.8F, 0.5F, -0.425F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, -0.8F, 0F, -0.425F); // Box 107
		bodyModel[66].setRotationPoint(0F, 0F, 0F);

		bodyModel[67].addShapeBox(-5F, 2F, 3.25F, 1, 2, 1, 0F,-1F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -0.25F, -1.3F, 0F, -0.425F, -0.5F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, -0.25F, -0.8F, 0.5F, -0.425F); // Box 111
		bodyModel[67].setRotationPoint(0F, 0F, 0F);

		bodyModel[68].addShapeBox(-5F, 2F, 2.25F, 1, 2, 1, 0F,-1.3F, 0F, -0.425F, 0.75F, 0F, -0.25F, 0.75F, 0F, 0F, -1F, 0F, 0F, -0.8F, 0.5F, -0.425F, 0.25F, 0.5F, -0.25F, 0.25F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 112
		bodyModel[68].setRotationPoint(0F, 0F, 0F);

		bodyModel[69].addShapeBox(2.5F, 2F, 3.25F, 1, 2, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.3F, 0F, -0.425F, -0.5F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, -0.25F, -0.8F, 0.5F, -0.425F); // Box 113
		bodyModel[69].setRotationPoint(0F, 0F, 0F);

		bodyModel[70].addShapeBox(2.5F, 2F, 2.25F, 1, 2, 1, 0F,-0.3F, 0F, -0.425F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0.5F, -0.425F, 0.25F, 0.5F, -0.25F, 0.25F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 113
		bodyModel[70].setRotationPoint(0F, 0F, 0F);

		bodyModel[71].addShapeBox(4F, 2F, 3.25F, 1, 2, 1, 0F,0.75F, 0F, 0F, -1F, 0F, 0F, -1.3F, 0F, -0.425F, 0.75F, 0F, -0.25F, 0.25F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.8F, 0.5F, -0.425F, 0.25F, 0.5F, -0.25F); // Box 113
		bodyModel[71].setRotationPoint(0F, 0F, 0F);

		bodyModel[72].addShapeBox(4F, 2F, 2.25F, 1, 2, 1, 0F,0.75F, 0F, -0.25F, -1.3F, 0F, -0.425F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0.25F, 0.5F, -0.25F, -0.8F, 0.5F, -0.425F, -0.5F, 0.5F, 0F, 0.25F, 0.5F, 0F); // Box 113
		bodyModel[72].setRotationPoint(0F, 0F, 0F);

		bodyModel[73].addShapeBox(-2.5F, 0.5F, 3.25F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.425F, 0F, -0.3F, -0.425F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 117
		bodyModel[73].setRotationPoint(0F, 0F, 0F);

		bodyModel[74].addShapeBox(-3.5F, 0.5F, 3.25F, 1, 1, 1, 0F,-0.125F, -0.625F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.425F, -0.25F, -0.8F, -0.425F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, -0.5F, 0F, -0.25F); // Box 118
		bodyModel[74].setRotationPoint(0F, 0F, 0F);

		bodyModel[75].addShapeBox(-3.5F, 0.5F, 3.25F, 1, 1, 1, 0F,-0.125F, -0.625F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.425F, -0.25F, -0.8F, -0.425F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, -0.5F, 0F, -0.25F); // Box 119
		bodyModel[75].setRotationPoint(0F, 0F, 0F);

		bodyModel[76].addShapeBox(-3.5F, 0.5F, 2.25F, 1, 1, 1, 0F,0.2F, -1.5F, -0.425F, -0.75F, -0.8F, -0.425F, -0.875F, -0.625F, 0F, 0.5F, -1.5F, 0F, -0.25F, 0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0.5F, 0.5F, 0F); // Box 120
		bodyModel[76].setRotationPoint(0F, 0F, 0F);

		bodyModel[77].addShapeBox(-3.5F, 0.5F, 2.25F, 1, 1, 1, 0F,-0.25F, -0.8F, -0.425F, 0F, -0.3F, -0.425F, 0F, 0F, 0F, -0.125F, -0.625F, 0F, -0.5F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.5F, 0F, 0F); // Box 121
		bodyModel[77].setRotationPoint(0F, 0F, 0F);

		bodyModel[78].addShapeBox(2.5F, 0.5F, 3.25F, 1, 1, 1, 0F,-0.875F, -0.625F, 0F, 0.5F, -1.5F, 0F, 0.2F, -1.5F, -0.425F, -0.75F, -0.8F, -0.425F, -0.5F, 0F, 0F, 0.5F, 0.5F, 0F, -0.25F, 0.5F, -0.25F, -0.5F, 0F, -0.25F); // Box 122
		bodyModel[78].setRotationPoint(0F, 0F, 0F);

		bodyModel[79].addShapeBox(2.5F, 1F, 3.25F, 1, 1, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, -1F, 0F, 0F, -0.8F, -0.2F, -0.425F, 0F, -0.3F, -0.425F); // Box 122
		bodyModel[79].setRotationPoint(0F, 0F, 0F);

		bodyModel[80].addShapeBox(2.5F, 1F, 3.25F, 1, 1, 1, 0F,-0.5F, -0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, 0F, -1F, 0F, 0F, -0.7F, 0F, -0.425F, -0.2F, -0.2F, -0.425F); // Box 122
		bodyModel[80].setRotationPoint(0F, 0F, 0F);

		bodyModel[81].addShapeBox(2.5F, 1F, 2.25F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.3F, -0.425F, -0.8F, -0.2F, -0.425F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[81].setRotationPoint(0F, 0F, 0F);

		bodyModel[82].addShapeBox(2.5F, 1F, 2.25F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, -1F, 0F, -0.5F, -0.5F, 0F, -0.2F, -0.2F, -0.425F, -0.7F, 0F, -0.425F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[82].setRotationPoint(0F, 0F, 0F);

		bodyModel[83].addShapeBox(2.5F, 0.5F, 3.25F, 1, 1, 1, 0F,0F, 0F, 0F, -0.125F, -0.625F, 0F, -0.25F, -0.8F, -0.425F, 0F, -0.3F, -0.425F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.25F, -0.25F); // Box 122
		bodyModel[83].setRotationPoint(0F, 0F, 0F);

		bodyModel[84].addShapeBox(2.5F, 0.5F, 3.25F, 1, 1, 1, 0F,0F, 0F, 0F, -0.125F, -0.625F, 0F, -0.25F, -0.8F, -0.425F, 0F, -0.3F, -0.425F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.25F, -0.25F); // Box 122
		bodyModel[84].setRotationPoint(0F, 0F, 0F);

		bodyModel[85].addShapeBox(2.5F, 0.5F, 2.25F, 1, 1, 1, 0F,-0.75F, -0.8F, -0.425F, 0.2F, -1.5F, -0.425F, 0.5F, -1.5F, 0F, -0.875F, -0.625F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, 0.5F, 0.5F, 0F, -0.5F, 0F, 0F); // Box 122
		bodyModel[85].setRotationPoint(0F, 0F, 0F);

		bodyModel[86].addShapeBox(2.5F, 0.5F, 2.25F, 1, 1, 1, 0F,0F, -0.3F, -0.425F, -0.25F, -0.8F, -0.425F, -0.125F, -0.625F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, -0.25F, 0F); // Box 122
		bodyModel[86].setRotationPoint(0F, 0F, 0F);

		bodyModel[87].addShapeBox(0F, 2.5F, 4F, 3, 2, 1, 0F,-0.1F, 0.4F, -0.25F, -0.5F, 0.4F, -0.25F, -0.5F, 0.4F, -0.7F, -0.1F, 0.4F, -0.7F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 131
		bodyModel[87].setRotationPoint(0F, 0F, 0F);

		bodyModel[88].addShapeBox(-3.5F, 0F, -2F, 1, 3, 4, 0F,0.11F, 0F, 0.11F, 0.11F, 0F, 0.11F, 0.11F, 0F, 0.11F, 0.11F, 0F, 0.11F, 0.11F, 0F, 0.15F, 0.11F, 0F, 0.17F, 0.11F, 0F, 0.11F, 0.11F, 0F, 0.11F); // Box 108
		bodyModel[88].setRotationPoint(0F, 0F, 0F);

		bodyModel[89].addShapeBox(-3.5F, 0F, -2F, 1, 2, 4, 0F,0.11F, 0F, 0.15F, 0.11F, 0F, 0.17F, 0.11F, 0F, 0.11F, 0.11F, 0F, 0.11F, 0.36F, 0F, 0.15F, -0.14F, 0F, 0.17F, -0.14F, 0F, 0.11F, 0.36F, 0F, 0.11F); // Box 109
		bodyModel[89].setRotationPoint(0F, 3F, 0F);

		bodyModel[90].addShapeBox(-4F, 0F, -2F, 1, 2, 4, 0F,-0.14F, 0F, 0.15F, 0.36F, 0F, 0.17F, 0.36F, 0F, 0.11F, -0.14F, 0F, 0.11F, 0.01F, -1F, 0.11F, -1.01F, 0F, 0.11F, -1.01F, 0F, 0.11F, 0.01F, -1F, 0.11F); // Box 110
		bodyModel[90].setRotationPoint(0F, 5F, 0F);

		bodyModel[91].addShapeBox(2.5F, 0F, -2F, 1, 3, 4, 0F,0.11F, 0F, 0.11F, 0.11F, 0F, 0.11F, 0.11F, 0F, 0.11F, 0.11F, 0F, 0.11F, 0.11F, 0F, 0.17F, 0.11F, 0F, 0.15F, 0.11F, 0F, 0.11F, 0.11F, 0F, 0.11F); // Box 121
		bodyModel[91].setRotationPoint(0F, 0F, 0F);

		bodyModel[92].addShapeBox(2.5F, 0F, -2F, 1, 2, 4, 0F,0.11F, 0F, 0.17F, 0.11F, 0F, 0.15F, 0.11F, 0F, 0.11F, 0.11F, 0F, 0.11F, -0.14F, 0F, 0.17F, 0.36F, 0F, 0.15F, 0.36F, 0F, 0.11F, -0.14F, 0F, 0.11F); // Box 121
		bodyModel[92].setRotationPoint(0F, 3F, 0F);

		bodyModel[93].addShapeBox(3F, 0F, -2F, 1, 2, 4, 0F,0.36F, 0F, 0.17F, -0.14F, 0F, 0.15F, -0.14F, 0F, 0.11F, 0.36F, 0F, 0.11F, -1.01F, 0F, 0.11F, 0.01F, -1F, 0.11F, 0.01F, -1F, 0.11F, -1.01F, 0F, 0.11F); // Box 121
		bodyModel[93].setRotationPoint(0F, 5F, 0F);

		bodyModel[94].addShapeBox(-3F, 2.5F, 4F, 3, 2, 1, 0F,-0.5F, 0.4F, -0.25F, -0.1F, 0.4F, -0.25F, -0.1F, 0.4F, -0.7F, -0.5F, 0.4F, -0.7F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 138
		bodyModel[94].setRotationPoint(0F, 0F, 0F);

		bodyModel[95].addShapeBox(-3F, 2.5F, 2F, 3, 1, 3, 0F,-0.5F, 0.55F, 0F, -0.1F, 0.55F, 0F, -0.1F, 0.45F, -0.8F, -0.5F, 0.45F, -0.8F, -0.5F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.4F, -0.7F, -0.5F, -1.4F, -0.7F); // Box 139
		bodyModel[95].setRotationPoint(0F, 0F, 0F);

		bodyModel[96].addShapeBox(0F, 2.5F, 2F, 3, 1, 3, 0F,-0.1F, 0.55F, 0F, -0.5F, 0.55F, 0F, -0.5F, 0.45F, -0.8F, -0.1F, 0.45F, -0.8F, -0.1F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.4F, -0.7F, -0.1F, -1.4F, -0.7F); // Box 140
		bodyModel[96].setRotationPoint(0F, 0F, 0F);

		bodyModel[97].addShapeBox(-3F, 4.5F, 4F, 2, 1, 1, 0F,0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, -0.6F, -0.4F, -0.5F, -0.5F, -0.4F, -0.5F, -0.5F, -0.4F, -0.5F, -0.6F, -0.4F); // Box 156
		bodyModel[97].setRotationPoint(0F, 0F, 0F);

		bodyModel[98].addShapeBox(-2F, 4.5F, 4F, 2, 1, 1, 0F,-0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, -0.5F, -0.4F, -0.5F, -0.6F, -0.4F, -0.5F, -0.6F, -0.4F, -0.5F, -0.5F, -0.4F); // Box 157
		bodyModel[98].setRotationPoint(0F, 0F, 0F);

		bodyModel[99].addShapeBox(1F, 4.5F, 4F, 2, 1, 1, 0F,-0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, -0.5F, -0.4F, -0.5F, -0.6F, -0.4F, -0.5F, -0.6F, -0.4F, -0.5F, -0.5F, -0.4F); // Box 158
		bodyModel[99].setRotationPoint(0F, 0F, 0F);

		bodyModel[100].addShapeBox(0F, 4.5F, 4F, 2, 1, 1, 0F,0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, -0.6F, -0.4F, -0.5F, -0.5F, -0.4F, -0.5F, -0.5F, -0.4F, -0.5F, -0.6F, -0.4F); // Box 159
		bodyModel[100].setRotationPoint(0F, 0F, 0F);

		bodyModel[101].addShapeBox(2.5F, 5.5F, 3.25F, 1, 1, 1, 0F,-0.45F, -0.25F, 0F, -0.2F, -0.25F, -0.615F, 0.25F, -0.25F, -0.2F, -0.8F, -0.25F, -0.375F, -0.45F, -0.25F, 0F, -0.2F, -0.25F, -0.615F, 0.25F, -0.25F, -0.2F, -0.8F, -0.25F, -0.375F); // Box 176
		bodyModel[101].setRotationPoint(0F, 0F, 0F);

		bodyModel[102].addShapeBox(2.5F, 5.5F, 2.25F, 1, 1, 1, 0F,-0.8F, -0.25F, -0.375F, 0.25F, -0.25F, -0.2F, -0.2F, -0.25F, -0.615F, -0.45F, -0.25F, 0F, -0.8F, -0.25F, -0.375F, 0.25F, -0.25F, -0.2F, -0.2F, -0.25F, -0.615F, -0.45F, -0.25F, 0F); // Box 177
		bodyModel[102].setRotationPoint(0F, 0F, 0F);

		bodyModel[103].addShapeBox(4F, 5.5F, 2.25F, 1, 1, 1, 0F,0.25F, -0.25F, -0.2F, -0.8F, -0.25F, -0.375F, -0.45F, -0.25F, 0F, -0.2F, -0.25F, -0.615F, 0.25F, -0.25F, -0.2F, -0.8F, -0.25F, -0.375F, -0.45F, -0.25F, 0F, -0.2F, -0.25F, -0.615F); // Box 178
		bodyModel[103].setRotationPoint(0F, 0F, 0F);

		bodyModel[104].addShapeBox(4F, 5.5F, 3.25F, 1, 1, 1, 0F,-0.2F, -0.25F, -0.615F, -0.45F, -0.25F, 0F, -0.8F, -0.25F, -0.375F, 0.25F, -0.25F, -0.2F, -0.2F, -0.25F, -0.615F, -0.45F, -0.25F, 0F, -0.8F, -0.25F, -0.375F, 0.25F, -0.25F, -0.2F); // Box 179
		bodyModel[104].setRotationPoint(0F, 0F, 0F);

		bodyModel[105].addShapeBox(-5F, 5.5F, 3.25F, 1, 1, 1, 0F,-0.45F, -0.25F, 0F, -0.2F, -0.25F, -0.615F, 0.25F, -0.25F, -0.2F, -0.8F, -0.25F, -0.375F, -0.45F, -0.25F, 0F, -0.2F, -0.25F, -0.615F, 0.25F, -0.25F, -0.2F, -0.8F, -0.25F, -0.375F); // Box 180
		bodyModel[105].setRotationPoint(0F, 0F, 0F);

		bodyModel[106].addShapeBox(-5F, 5.5F, 2.25F, 1, 1, 1, 0F,-0.8F, -0.25F, -0.375F, 0.25F, -0.25F, -0.2F, -0.2F, -0.25F, -0.615F, -0.45F, -0.25F, 0F, -0.8F, -0.25F, -0.375F, 0.25F, -0.25F, -0.2F, -0.2F, -0.25F, -0.615F, -0.45F, -0.25F, 0F); // Box 180
		bodyModel[106].setRotationPoint(0F, 0F, 0F);

		bodyModel[107].addShapeBox(-3.5F, 5.5F, 2.25F, 1, 1, 1, 0F,0.25F, -0.25F, -0.2F, -0.8F, -0.25F, -0.375F, -0.45F, -0.25F, 0F, -0.2F, -0.25F, -0.615F, 0.25F, -0.25F, -0.2F, -0.8F, -0.25F, -0.375F, -0.45F, -0.25F, 0F, -0.2F, -0.25F, -0.615F); // Box 180
		bodyModel[107].setRotationPoint(0F, 0F, 0F);

		bodyModel[108].addShapeBox(-3.5F, 5.5F, 3.25F, 1, 1, 1, 0F,-0.2F, -0.25F, -0.615F, -0.45F, -0.25F, 0F, -0.8F, -0.25F, -0.375F, 0.25F, -0.25F, -0.2F, -0.2F, -0.25F, -0.615F, -0.45F, -0.25F, 0F, -0.8F, -0.25F, -0.375F, 0.25F, -0.25F, -0.2F); // Box 180
		bodyModel[108].setRotationPoint(0F, 0F, 0F);

		bodyModel[109].addShapeBox(-3F, 7.5F, 3.5F, 1, 1, 1, 0F,-0.25F, 0.05F, 0F, -0.25F, 0.05F, 0F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.8F, -0.79F, -0.25F, -0.8F, -0.79F, -0.25F, 0F, 0.05F, -0.25F, 0F, 0.05F); // Box 185
		bodyModel[109].setRotationPoint(0F, 0F, 0F);

		bodyModel[110].addShapeBox(-3F, 8.5F, 3.5F, 1, 1, 1, 0F,-0.25F, -0.8F, -0.79F, -0.25F, -0.8F, -0.79F, -0.25F, 0F, 0.05F, -0.25F, 0F, 0.05F, -0.25F, 0.05F, 0F, -0.25F, 0.05F, 0F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F); // Box 186
		bodyModel[110].setRotationPoint(0F, 0F, 0F);

		bodyModel[111].addShapeBox(-3F, 7.5F, 2.5F, 1, 1, 1, 0F,-0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, 0.05F, 0F, -0.25F, 0.05F, 0F, -0.25F, 0F, 0.05F, -0.25F, 0F, 0.05F, -0.25F, -0.8F, -0.79F, -0.25F, -0.8F, -0.79F); // Box 187
		bodyModel[111].setRotationPoint(0F, 0F, 0F);

		bodyModel[112].addShapeBox(-3F, 8.5F, 2.5F, 1, 1, 1, 0F,-0.25F, 0F, 0.05F, -0.25F, 0F, 0.05F, -0.25F, -0.8F, -0.79F, -0.25F, -0.8F, -0.79F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, 0.05F, 0F, -0.25F, 0.05F, 0F); // Box 188
		bodyModel[112].setRotationPoint(0F, 0F, 0F);

		bodyModel[113].addShapeBox(2F, 7.5F, 3.5F, 1, 1, 1, 0F,-0.25F, 0.05F, 0F, -0.25F, 0.05F, 0F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.8F, -0.79F, -0.25F, -0.8F, -0.79F, -0.25F, 0F, 0.05F, -0.25F, 0F, 0.05F); // Box 189
		bodyModel[113].setRotationPoint(0F, 0F, 0F);

		bodyModel[114].addShapeBox(2F, 8.5F, 3.5F, 1, 1, 1, 0F,-0.25F, -0.8F, -0.79F, -0.25F, -0.8F, -0.79F, -0.25F, 0F, 0.05F, -0.25F, 0F, 0.05F, -0.25F, 0.05F, 0F, -0.25F, 0.05F, 0F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F); // Box 189
		bodyModel[114].setRotationPoint(0F, 0F, 0F);

		bodyModel[115].addShapeBox(2F, 7.5F, 2.5F, 1, 1, 1, 0F,-0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, 0.05F, 0F, -0.25F, 0.05F, 0F, -0.25F, 0F, 0.05F, -0.25F, 0F, 0.05F, -0.25F, -0.8F, -0.79F, -0.25F, -0.8F, -0.79F); // Box 189
		bodyModel[115].setRotationPoint(0F, 0F, 0F);

		bodyModel[116].addShapeBox(2F, 8.5F, 2.5F, 1, 1, 1, 0F,-0.25F, 0F, 0.05F, -0.25F, 0F, 0.05F, -0.25F, -0.8F, -0.79F, -0.25F, -0.8F, -0.79F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, 0.05F, 0F, -0.25F, 0.05F, 0F); // Box 189
		bodyModel[116].setRotationPoint(0F, 0F, 0F);

		bodyModel[117].addShapeBox(-0.5F, 1F, 2.25F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.75F, -0.62F, -0.25F, -0.75F, -0.62F, -0.25F, -0.25F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, 0.05F, 0F, -0.25F, 0.05F, 0F); // Box 117
		bodyModel[117].setRotationPoint(0F, 0F, 0F);

		bodyModel[118].addShapeBox(-0.5F, 0.5F, 2.25F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, 0.05F, 0F, -0.25F, 0.05F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.75F, -0.62F, -0.25F, -0.75F, -0.62F); // Box 117
		bodyModel[118].setRotationPoint(0F, 0F, 0F);

		bodyModel[119].addShapeBox(-0.5F, 1F, 3.25F, 1, 1, 1, 0F,-0.25F, -0.75F, -0.62F, -0.25F, -0.75F, -0.62F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, 0.05F, 0F, -0.25F, 0.05F, 0F, -0.25F, -0.25F, -0.375F, -0.25F, -0.25F, -0.375F); // Box 117
		bodyModel[119].setRotationPoint(0F, 0F, 0F);

		bodyModel[120].addShapeBox(-0.5F, 0.5F, 3.25F, 1, 1, 1, 0F,-0.25F, 0.05F, 0F, -0.25F, 0.05F, 0F, -0.25F, -0.25F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, -0.75F, -0.62F, -0.25F, -0.75F, -0.62F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F); // Box 117
		bodyModel[120].setRotationPoint(0F, 0F, 0F);

		bodyModel[121].addShapeBox(0.5F, 4.25F, 3.5F, 1, 1, 1, 0F,-0.875F, -0.565F, -1F, 0.125F, -0.565F, -1F, 0.125F, -0.565F, 0.15F, -0.875F, -0.565F, 0.15F, -0.955F, -0.375F, -1F, 0.055F, -0.375F, -1F, 0.055F, -0.375F, 0.15F, -0.955F, -0.375F, 0.15F); // Box 1
		bodyModel[121].setRotationPoint(0F, 0F, 0F);

		bodyModel[122].addShapeBox(0.5F, 4.25F, 3.5F, 1, 1, 1, 0F,-0.875F, -0.435F, -1F, 0.125F, -0.435F, -1F, 0.125F, -0.435F, 0.15F, -0.875F, -0.435F, 0.15F, -0.875F, -0.435F, -1F, 0.125F, -0.435F, -1F, 0.125F, -0.435F, 0.15F, -0.875F, -0.435F, 0.15F); // Box 1
		bodyModel[122].setRotationPoint(0F, 0F, 0F);

		bodyModel[123].addShapeBox(0.5F, 4.25F, 3.5F, 1, 1, 1, 0F,-0.955F, -0.375F, -1F, 0.055F, -0.375F, -1F, 0.055F, -0.375F, 0.15F, -0.955F, -0.375F, 0.15F, -0.875F, -0.565F, -1F, 0.125F, -0.565F, -1F, 0.125F, -0.565F, 0.15F, -0.875F, -0.565F, 0.15F); // Box 1
		bodyModel[123].setRotationPoint(0F, 0F, 0F);

		bodyModel[124].addShapeBox(-2.5F, 7F, -2F, 1, 2, 1, 0F,-0.1F, 0.5F, 0.725F, -0.1F, 0.5F, 0.725F, 0.1F, 0.5F, -1.475F, 0.1F, 0.5F, -1.475F, -0.1F, 0F, 0.725F, -0.1F, 0F, 0.725F, 0.1F, 0F, -1.475F, 0.1F, 0F, -1.475F); // Box 114
		bodyModel[124].setRotationPoint(0F, 0F, 0F);

		bodyModel[125].addShapeBox(-2.5F, 7F, -2F, 1, 2, 1, 0F,0.1F, 0.5F, 0.475F, 0.1F, 0.5F, 0.475F, 0.1F, 0.5F, -1.15F, 0.1F, 0.5F, -1.15F, 0.1F, 0F, 0.475F, 0.1F, 0F, 0.475F, 0.1F, 0F, -1.15F, 0.1F, 0F, -1.15F); // Box 115
		bodyModel[125].setRotationPoint(0F, 0F, 0F);

		bodyModel[126].addShapeBox(-2.5F, 7F, -2F, 1, 1, 1, 0F,-0.08F, 0.5F, 0.775F, -0.08F, 0.5F, 0.775F, 0.1F, 0.5F, -1.48F, 0.1F, 0.5F, -1.48F, -0.08F, -0.625F, 0.775F, -0.08F, -0.625F, 0.775F, 0.1F, -0.625F, -1.48F, 0.1F, -0.625F, -1.48F); // Box 119
		bodyModel[126].setRotationPoint(0F, 0F, 0F);

		bodyModel[127].addShapeBox(-4F, 7F, -2F, 1, 2, 1, 0F,-0.1F, 0.5F, 0.725F, -0.1F, 0.5F, 0.725F, 0.1F, 0.5F, -1.475F, 0.1F, 0.5F, -1.475F, -0.1F, 0F, 0.725F, -0.1F, 0F, 0.725F, 0.1F, 0F, -1.475F, 0.1F, 0F, -1.475F); // Box 114
		bodyModel[127].setRotationPoint(0F, 0F, 0F);

		bodyModel[128].addShapeBox(3F, 7F, -2F, 1, 2, 1, 0F,-0.1F, 0.5F, 0.725F, -0.1F, 0.5F, 0.725F, 0.1F, 0.5F, -1.475F, 0.1F, 0.5F, -1.475F, -0.1F, 0F, 0.725F, -0.1F, 0F, 0.725F, 0.1F, 0F, -1.475F, 0.1F, 0F, -1.475F); // Box 114
		bodyModel[128].setRotationPoint(0F, 0F, 0F);

		bodyModel[129].addShapeBox(1.5F, 7F, -2F, 1, 2, 1, 0F,-0.1F, 0.5F, 0.725F, -0.1F, 0.5F, 0.725F, 0.1F, 0.5F, -1.475F, 0.1F, 0.5F, -1.475F, -0.1F, 0F, 0.725F, -0.1F, 0F, 0.725F, 0.1F, 0F, -1.475F, 0.1F, 0F, -1.475F); // Box 114
		bodyModel[129].setRotationPoint(0F, 0F, 0F);

		bodyModel[130].addShapeBox(1.5F, 7F, -2F, 1, 1, 1, 0F,-0.08F, 0.5F, 0.775F, -0.08F, 0.5F, 0.775F, 0.1F, 0.5F, -1.48F, 0.1F, 0.5F, -1.48F, -0.08F, -0.625F, 0.775F, -0.08F, -0.625F, 0.775F, 0.1F, -0.625F, -1.48F, 0.1F, -0.625F, -1.48F); // Box 119
		bodyModel[130].setRotationPoint(0F, 0F, 0F);

		bodyModel[131].addShapeBox(3F, 7F, -2F, 1, 1, 1, 0F,-0.08F, 0.5F, 0.775F, -0.08F, 0.5F, 0.775F, 0.1F, 0.5F, -1.48F, 0.1F, 0.5F, -1.48F, -0.08F, -0.625F, 0.775F, -0.08F, -0.625F, 0.775F, 0.1F, -0.625F, -1.48F, 0.1F, -0.625F, -1.48F); // Box 119
		bodyModel[131].setRotationPoint(0F, 0F, 0F);

		bodyModel[132].addShapeBox(-4F, 7F, -2F, 1, 1, 1, 0F,-0.08F, 0.5F, 0.775F, -0.08F, 0.5F, 0.775F, 0.1F, 0.5F, -1.48F, 0.1F, 0.5F, -1.48F, -0.08F, -0.625F, 0.775F, -0.08F, -0.625F, 0.775F, 0.1F, -0.625F, -1.48F, 0.1F, -0.625F, -1.48F); // Box 119
		bodyModel[132].setRotationPoint(0F, 0F, 0F);

		bodyModel[133].addShapeBox(1.5F, 7F, -2F, 1, 2, 1, 0F,0.1F, 0.5F, 0.475F, 0.1F, 0.5F, 0.475F, 0.1F, 0.5F, -1.15F, 0.1F, 0.5F, -1.15F, 0.1F, 0F, 0.475F, 0.1F, 0F, 0.475F, 0.1F, 0F, -1.15F, 0.1F, 0F, -1.15F); // Box 115
		bodyModel[133].setRotationPoint(0F, 0F, 0F);

		bodyModel[134].addShapeBox(3F, 7F, -2F, 1, 2, 1, 0F,0.1F, 0.5F, 0.475F, 0.1F, 0.5F, 0.475F, 0.1F, 0.5F, -1.15F, 0.1F, 0.5F, -1.15F, 0.1F, 0F, 0.475F, 0.1F, 0F, 0.475F, 0.1F, 0F, -1.15F, 0.1F, 0F, -1.15F); // Box 115
		bodyModel[134].setRotationPoint(0F, 0F, 0F);

		bodyModel[135].addShapeBox(-4F, 7F, -2F, 1, 2, 1, 0F,0.1F, 0.5F, 0.475F, 0.1F, 0.5F, 0.475F, 0.1F, 0.5F, -1.15F, 0.1F, 0.5F, -1.15F, 0.1F, 0F, 0.475F, 0.1F, 0F, 0.475F, 0.1F, 0F, -1.15F, 0.1F, 0F, -1.15F); // Box 115
		bodyModel[135].setRotationPoint(0F, 0F, 0F);

		bodyModel[136].addShapeBox(-2.5F, 7F, -2F, 1, 1, 1, 0F,-0.4F, 0F, 0.875F, -0.4F, 0F, 0.875F, -0.4F, 0F, -1.7F, -0.4F, 0F, -1.7F, -0.4F, -0.375F, 0.775F, -0.4F, -0.375F, 0.775F, -0.4F, -0.375F, -1.7F, -0.4F, -0.375F, -1.7F); // Box 80
		bodyModel[136].setRotationPoint(0F, 0F, 0F);

		bodyModel[137].addShapeBox(1.5F, 7F, -2F, 1, 1, 1, 0F,-0.4F, 0F, 0.875F, -0.4F, 0F, 0.875F, -0.4F, 0F, -1.7F, -0.4F, 0F, -1.7F, -0.4F, -0.375F, 0.775F, -0.4F, -0.375F, 0.775F, -0.4F, -0.375F, -1.7F, -0.4F, -0.375F, -1.7F); // Box 80
		bodyModel[137].setRotationPoint(0F, 0F, 0F);

		bodyModel[138].addShapeBox(-4F, 7F, -2F, 1, 1, 1, 0F,-0.4F, 0F, 0.875F, -0.4F, 0F, 0.875F, -0.4F, 0F, -1.7F, -0.4F, 0F, -1.7F, -0.4F, -0.375F, 0.775F, -0.4F, -0.375F, 0.775F, -0.4F, -0.375F, -1.7F, -0.4F, -0.375F, -1.7F); // Box 80
		bodyModel[138].setRotationPoint(0F, 0F, 0F);

		bodyModel[139].addShapeBox(3F, 7F, -2F, 1, 1, 1, 0F,-0.4F, 0F, 0.875F, -0.4F, 0F, 0.875F, -0.4F, 0F, -1.7F, -0.4F, 0F, -1.7F, -0.4F, -0.375F, 0.775F, -0.4F, -0.375F, 0.775F, -0.4F, -0.375F, -1.7F, -0.4F, -0.375F, -1.7F); // Box 80
		bodyModel[139].setRotationPoint(0F, 0F, 0F);

		bodyModel[140].addShapeBox(-2.5F, 4.25F, 3.5F, 1, 1, 1, 0F,-0.875F, -0.565F, -1F, 0.125F, -0.565F, -1F, 0.125F, -0.565F, 0.15F, -0.875F, -0.565F, 0.15F, -0.955F, -0.375F, -1F, 0.055F, -0.375F, -1F, 0.055F, -0.375F, 0.15F, -0.955F, -0.375F, 0.15F); // Box 1
		bodyModel[140].setRotationPoint(0F, 0F, 0F);

		bodyModel[141].addShapeBox(-2.5F, 4.25F, 3.5F, 1, 1, 1, 0F,-0.875F, -0.435F, -1F, 0.125F, -0.435F, -1F, 0.125F, -0.435F, 0.15F, -0.875F, -0.435F, 0.15F, -0.875F, -0.435F, -1F, 0.125F, -0.435F, -1F, 0.125F, -0.435F, 0.15F, -0.875F, -0.435F, 0.15F); // Box 1
		bodyModel[141].setRotationPoint(0F, 0F, 0F);

		bodyModel[142].addShapeBox(-2.5F, 4.25F, 3.5F, 1, 1, 1, 0F,-0.955F, -0.375F, -1F, 0.055F, -0.375F, -1F, 0.055F, -0.375F, 0.15F, -0.955F, -0.375F, 0.15F, -0.875F, -0.565F, -1F, 0.125F, -0.565F, -1F, 0.125F, -0.565F, 0.15F, -0.875F, -0.565F, 0.15F); // Box 1
		bodyModel[142].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 2
		leftArmModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 5

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 10, 4, 0F,0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0F, 0.01F, 0.01F, 0F, 0.01F, 0.01F, 0F, 0.01F, 0.01F, 0F, 0.01F); // Box 2
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 7F, -2F, 4, 1, 4, 0F,0.05F, 0.05F, 0.05F, 0.05F, 0.05F, 0.05F, 0.05F, 0.05F, 0.05F, 0.05F, 0.05F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F); // Box 5
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 1
		rightArmModel[1] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 6

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 10, 4, 0F,0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0F, 0.01F, 0.01F, 0F, 0.01F, 0.01F, 0F, 0.01F, 0.01F, 0F, 0.01F); // Box 1
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 7F, -2F, 4, 1, 4, 0F,0.05F, 0.05F, 0.05F, 0.05F, 0.05F, 0.05F, 0.05F, 0.05F, 0.05F, 0.05F, 0.05F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F); // Box 6
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 37
		leftLegModel[1] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 40
		leftLegModel[2] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 41
		leftLegModel[3] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 49
		leftLegModel[4] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 0

		leftLegModel[0].addShapeBox(-2F, 8F, -2F, 4, 4, 4, 0F,0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0.01F, 0.05F, 0.05F, 0.01F, 0.05F, 0.05F, 0.01F, 0.05F, 0.05F, 0.05F, 0.05F); // Box 37
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 11F, -4F, 4, 1, 2, 0F,-0.45F, 0F, 0.05F, -0.45F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, -0.45F, 0.01F, 0.05F, -0.45F, 0.01F, 0.05F, 0.05F, 0.01F, 0.05F, 0.05F, 0.05F, 0.05F); // Box 40
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 10F, -4F, 4, 1, 2, 0F,-0.95F, -0.25F, -0.2F, -0.95F, -0.25F, -0.2F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, -0.45F, 0.01F, 0.05F, -0.45F, 0.01F, 0.05F, 0.05F, 0.01F, 0.05F, 0.05F, 0.05F, 0.05F); // Box 41
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 0F, -2F, 4, 8, 4, 0F,0.01F, 0F, 0.01F, 0.01F, 0F, 0.01F, 0.01F, 0F, 0.01F, 0.01F, 0F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.05F, 0.01F); // Box 49
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-2F, 8F, -2F, 4, 6, 4, 0F,0.07F, 0F, 0.07F, 0.07F, 0F, 0.07F, 0.07F, 0F, 0.07F, 0.07F, 0F, 0.07F, 0.07F, -5F, 0.07F, 0.07F, -5F, 0.07F, 0.07F, -5F, 0.07F, 0.07F, -5F, 0.07F); // Box 0
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 38
		rightLegModel[1] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 43
		rightLegModel[2] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 43
		rightLegModel[3] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 50
		rightLegModel[4] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 1

		rightLegModel[0].addShapeBox(-2F, 8F, -2F, 4, 4, 4, 0F,0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0.01F, 0.05F, 0.05F, 0.01F, 0.05F, 0.05F, 0.01F, 0.05F, 0.05F, 0.05F, 0.05F); // Box 38
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 11F, -4F, 4, 1, 2, 0F,-0.45F, 0F, 0.05F, -0.45F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, -0.45F, 0.01F, 0.05F, -0.45F, 0.01F, 0.05F, 0.05F, 0.01F, 0.05F, 0.05F, 0.05F, 0.05F); // Box 43
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 10F, -4F, 4, 1, 2, 0F,-0.95F, -0.25F, -0.2F, -0.95F, -0.25F, -0.2F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, -0.45F, 0.01F, 0.05F, -0.45F, 0.01F, 0.05F, 0.05F, 0.01F, 0.05F, 0.05F, 0.05F, 0.05F); // Box 43
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 0F, -2F, 4, 8, 4, 0F,0.01F, 0F, 0.01F, 0.01F, 0F, 0.01F, 0.01F, 0F, 0.01F, 0.01F, 0F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F); // Box 50
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2F, 8F, -2F, 4, 6, 4, 0F,0.07F, 0F, 0.07F, 0.07F, 0F, 0.07F, 0.07F, 0F, 0.07F, 0.07F, 0F, 0.07F, 0.07F, -5F, 0.07F, 0.07F, -5F, 0.07F, 0.07F, -5F, 0.07F, 0.07F, -5F, 0.07F); // Box 1
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);
	}
}