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

public class ModelPolish extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelPolish() //Same as Filename
	{
		headModel = new ModelRendererTurbo[56];
		bodyModel = new ModelRendererTurbo[88];
		leftArmModel = new ModelRendererTurbo[6];
		rightArmModel = new ModelRendererTurbo[6];
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
		headModel[0] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 13
		headModel[1] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 14
		headModel[2] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Import Box3
		headModel[3] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import Box3
		headModel[4] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Import Box3
		headModel[5] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Import Box3
		headModel[6] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Import Box3
		headModel[7] = new ModelRendererTurbo(this, 59, 110, textureX, textureY); // Box 136
		headModel[8] = new ModelRendererTurbo(this, 96, 108, textureX, textureY); // Box 138
		headModel[9] = new ModelRendererTurbo(this, 99, 123, textureX, textureY); // Box 161
		headModel[10] = new ModelRendererTurbo(this, 99, 123, textureX, textureY); // Box 164
		headModel[11] = new ModelRendererTurbo(this, 99, 123, textureX, textureY); // Box 167
		headModel[12] = new ModelRendererTurbo(this, 99, 123, textureX, textureY); // Box 169
		headModel[13] = new ModelRendererTurbo(this, 99, 123, textureX, textureY); // Box 170
		headModel[14] = new ModelRendererTurbo(this, 105, 102, textureX, textureY); // Box 173
		headModel[15] = new ModelRendererTurbo(this, 105, 102, textureX, textureY); // Box 174
		headModel[16] = new ModelRendererTurbo(this, 69, 110, textureX, textureY); // Box 176
		headModel[17] = new ModelRendererTurbo(this, 69, 110, textureX, textureY); // Box 180
		headModel[18] = new ModelRendererTurbo(this, 69, 110, textureX, textureY); // Box 182
		headModel[19] = new ModelRendererTurbo(this, 58, 118, textureX, textureY); // Box 183
		headModel[20] = new ModelRendererTurbo(this, 66, 119, textureX, textureY); // Box 198
		headModel[21] = new ModelRendererTurbo(this, 80, 103, textureX, textureY); // Box 200
		headModel[22] = new ModelRendererTurbo(this, 66, 119, textureX, textureY); // Box 201
		headModel[23] = new ModelRendererTurbo(this, 80, 103, textureX, textureY); // Box 205
		headModel[24] = new ModelRendererTurbo(this, 66, 119, textureX, textureY); // Box 207
		headModel[25] = new ModelRendererTurbo(this, 66, 119, textureX, textureY); // Box 209
		headModel[26] = new ModelRendererTurbo(this, 66, 119, textureX, textureY); // Box 201
		headModel[27] = new ModelRendererTurbo(this, 66, 119, textureX, textureY); // Box 202
		headModel[28] = new ModelRendererTurbo(this, 105, 102, textureX, textureY); // Box 203
		headModel[29] = new ModelRendererTurbo(this, 99, 123, textureX, textureY); // Box 204
		headModel[30] = new ModelRendererTurbo(this, 69, 110, textureX, textureY); // Box 205
		headModel[31] = new ModelRendererTurbo(this, 99, 123, textureX, textureY); // Box 206
		headModel[32] = new ModelRendererTurbo(this, 69, 110, textureX, textureY); // Box 207
		headModel[33] = new ModelRendererTurbo(this, 99, 123, textureX, textureY); // Box 208
		headModel[34] = new ModelRendererTurbo(this, 96, 108, textureX, textureY); // Box 201
		headModel[35] = new ModelRendererTurbo(this, 96, 108, textureX, textureY); // Box 202
		headModel[36] = new ModelRendererTurbo(this, 96, 108, textureX, textureY); // Box 203
		headModel[37] = new ModelRendererTurbo(this, 96, 108, textureX, textureY); // Box 204
		headModel[38] = new ModelRendererTurbo(this, 96, 108, textureX, textureY); // Box 205
		headModel[39] = new ModelRendererTurbo(this, 96, 108, textureX, textureY); // Box 206
		headModel[40] = new ModelRendererTurbo(this, 59, 110, textureX, textureY); // Box 207
		headModel[41] = new ModelRendererTurbo(this, 59, 110, textureX, textureY); // Box 208
		headModel[42] = new ModelRendererTurbo(this, 59, 110, textureX, textureY); // Box 209
		headModel[43] = new ModelRendererTurbo(this, 59, 110, textureX, textureY); // Box 210
		headModel[44] = new ModelRendererTurbo(this, 59, 110, textureX, textureY); // Box 211
		headModel[45] = new ModelRendererTurbo(this, 59, 110, textureX, textureY); // Box 212
		headModel[46] = new ModelRendererTurbo(this, 58, 118, textureX, textureY); // Box 213
		headModel[47] = new ModelRendererTurbo(this, 58, 118, textureX, textureY); // Box 214
		headModel[48] = new ModelRendererTurbo(this, 58, 118, textureX, textureY); // Box 215
		headModel[49] = new ModelRendererTurbo(this, 58, 118, textureX, textureY); // Box 216
		headModel[50] = new ModelRendererTurbo(this, 58, 118, textureX, textureY); // Box 217
		headModel[51] = new ModelRendererTurbo(this, 58, 118, textureX, textureY); // Box 218
		headModel[52] = new ModelRendererTurbo(this, 66, 119, textureX, textureY); // Box 219
		headModel[53] = new ModelRendererTurbo(this, 69, 122, textureX, textureY); // Box 221
		headModel[54] = new ModelRendererTurbo(this, 105, 102, textureX, textureY); // Box 164
		headModel[55] = new ModelRendererTurbo(this, 7, 114, textureX, textureY); // Box 165

		headModel[0].addShapeBox(-4.5F, -4F, -4.5F, 9, 4, 4, 0F,0F, -0.2F, -3F, 0F, -0.2F, -3F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -2.5F, -0.4F, 0F, -2.5F); // Box 13
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4.5F, 0F, -4F, 9, 1, 1, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F); // Box 14
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -10F, -4F, 8, 2, 8, 0F,-0.9F, -0.6F, -1.5F, -0.9F, -0.6F, -1.5F, -0.9F, -0.7F, -1.25F, -0.9F, -0.7F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Import Box3
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -8F, -5F, 8, 3, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.5F, 1F, 0.1F, 0.5F, 1F, 0.1F); // Import Box3
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -8F, 0.2F, 8, 3, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.5F, 1F, 0.1F, 0.5F, 1F, 0.1F, 0.1F, 1.6F, 0.6F, 0.1F, 1.6F, 0.6F); // Import Box3
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4F, -4F, 0.4F, 8, 1, 4, 0F,0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.1F, -0.6F, 0.4F, 0.1F, -0.6F, 0.4F, 1F, -0.2F, 0.3F, 1F, -0.2F, 0.3F, 0.3F, 0.1F, 0.6F, 0.3F, 0.1F, 0.6F); // Import Box3
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4F, -4F, -4.2F, 8, 1, 4, 0F,0F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.2F, -1.3F, 1.2F, 0.2F, -1.3F, 1.2F, 1F, -0.2F, 0.3F, 1F, -0.2F, 0.3F); // Import Box3
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-3.5F, -8F, -4.7F, 1, 3, 1, 0F,-0.45F, 0F, -0.6F, -0.45F, 0F, -0.6F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0.4F, 0.3F, -0.45F, 0.4F, 0.3F, -0.45F, 0F, 0F, -0.45F, 0F, 0F); // Box 136
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-3.5F, -9.4F, -4.2F, 1, 2, 9, 0F,-0.45F, 0.05F, -1.65F, -0.45F, 0.05F, -1.65F, -0.45F, 0F, -2F, -0.45F, 0F, -2F, -0.45F, -0.6F, -0.1F, -0.45F, -0.6F, -0.1F, -0.45F, -0.6F, -0.4F, -0.45F, -0.6F, -0.4F); // Box 138
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-4F, -9F, -3.5F, 8, 1, 1, 0F,-0.6F, -0.02F, -0.45F, -0.6F, -0.02F, -0.45F, -0.6F, 0.06F, -0.45F, -0.6F, 0.06F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F); // Box 161
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-4F, -9F, -0.5F, 8, 1, 1, 0F,-0.9F, 0.4F, -0.45F, -0.9F, 0.4F, -0.45F, -0.9F, 0.4F, -0.45F, -0.9F, 0.4F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F); // Box 164
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-4F, -9F, 2.5F, 8, 1, 1, 0F,-0.7F, 0.2F, -0.45F, -0.7F, 0.2F, -0.45F, -0.6F, 0.1F, -0.45F, -0.6F, 0.1F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F); // Box 167
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-4F, -9F, 1.5F, 8, 1, 1, 0F,-0.9F, 0.35F, -0.45F, -0.9F, 0.35F, -0.45F, -0.9F, 0.35F, -0.45F, -0.9F, 0.35F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F); // Box 169
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-4F, -9F, -1.5F, 8, 1, 1, 0F,-0.9F, 0.4F, -0.45F, -0.9F, 0.4F, -0.45F, -0.9F, 0.4F, -0.45F, -0.9F, 0.4F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F); // Box 170
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-4F, -8F, -3.5F, 8, 3, 1, 0F,0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.25F, 0.8F, -0.45F, 0.25F, 0.8F, -0.45F, 0.25F, 0.8F, -0.45F, 0.25F, 0.8F, -0.45F); // Box 173
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-4F, -8F, -1.5F, 8, 3, 1, 0F,0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.5F, 1.2F, -0.45F, 0.5F, 1.2F, -0.45F, 0.5F, 1.2F, -0.45F, 0.5F, 1.2F, -0.45F); // Box 174
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-4F, -8F, -0.5F, 8, 4, 1, 0F,0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.6F, 0.2F, -0.45F, 0.6F, 0.2F, -0.45F, 0.6F, 0.2F, -0.45F, 0.6F, 0.2F, -0.45F); // Box 176
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-4F, -8F, 1.5F, 8, 4, 1, 0F,0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.4F, 0.5F, -0.45F, 0.47F, 0.5F, -0.45F, 0.47F, 0.5F, -0.45F, 0.4F, 0.5F, -0.45F); // Box 180
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-4F, -8F, 2.5F, 8, 4, 1, 0F,0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.3F, 0.5F, -0.45F, 0.33F, 0.5F, -0.45F, 0.33F, 0.5F, -0.45F, 0.3F, 0.5F, -0.45F); // Box 182
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(2.5F, -8F, 3.4F, 1, 4, 2, 0F,-0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -1F, -0.45F, 0F, -1F, -0.45F, 0.6F, 0F, -0.45F, 0.6F, 0F, -0.45F, 0.7F, -0.55F, -0.45F, 0.7F, -0.55F); // Box 183
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(-4.5F, -7.5F, -4.8F, 9, 1, 5, 0F,-0.45F, -0.45F, -0.5F, -0.45F, -0.45F, -0.5F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F); // Box 198
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(-4F, -8.5F, -3.9F, 8, 1, 4, 0F,0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0.1F, -0.45F, 0F, 0.1F, -0.45F, 0F, 0.05F, -0.45F, 0.15F, 0.05F, -0.45F, 0.15F, 0.15F, -0.45F, 0F, 0.15F, -0.45F, 0F); // Box 200
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(-4.5F, -5.5F, -4.9F, 9, 1, 5, 0F,-0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -0.45F, -0.45F, 0.05F, -0.45F, -0.45F, 0.05F, 0F, -0.45F, 0F, 0F, -0.45F, 0F); // Box 201
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(-4F, -8.5F, 0.1F, 8, 1, 4, 0F,0.1F, -0.45F, 0F, 0.1F, -0.45F, 0F, 0F, -0.45F, 0.2F, 0F, -0.45F, 0.2F, 0.15F, -0.45F, 0F, 0.15F, -0.45F, 0F, 0.1F, -0.45F, 0.3F, 0.1F, -0.45F, 0.3F); // Box 205
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(-4.5F, -7.5F, 0F, 9, 1, 5, 0F,-0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.4F, -0.45F, -0.55F, -0.4F, -0.45F, -0.55F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.375F, -0.45F, -0.52F, -0.375F, -0.45F, -0.52F); // Box 207
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(-4.5F, -5.5F, 0.0999999999999995F, 9, 1, 5, 0F,0F, -0.45F, 0F, 0F, -0.45F, 0F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -0.35F, -0.45F, -0.44F, -0.35F, -0.45F, -0.44F); // Box 209
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(-4.5F, -6.5F, -5F, 9, 1, 5, 0F,-0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.1F, -0.45F, 0F, -0.1F, -0.45F, 0F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.1F, -0.45F, 0F, -0.1F, -0.45F, 0F); // Box 201
		headModel[26].setRotationPoint(0F, 0F, 0F);

		headModel[27].addShapeBox(-4.5F, -6.5F, -1.38777878078145E-16F, 9, 1, 5, 0F,-0.1F, -0.45F, 0F, -0.1F, -0.45F, 0F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.1F, -0.45F, 0F, -0.1F, -0.45F, 0F, -0.374F, -0.45F, -0.4F, -0.374F, -0.45F, -0.4F); // Box 202
		headModel[27].setRotationPoint(0F, 0F, 0F);

		headModel[28].addShapeBox(-4F, -8F, -2.5F, 8, 3, 1, 0F,0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.4F, 1F, -0.45F, 0.4F, 1F, -0.45F, 0.4F, 1F, -0.45F, 0.4F, 1F, -0.45F); // Box 203
		headModel[28].setRotationPoint(0F, 0F, 0F);

		headModel[29].addShapeBox(-4F, -9F, -2.5F, 8, 1, 1, 0F,-0.9F, 0.4F, -0.45F, -0.9F, 0.4F, -0.45F, -0.9F, 0.4F, -0.45F, -0.9F, 0.4F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F); // Box 204
		headModel[29].setRotationPoint(0F, 0F, 0F);

		headModel[30].addShapeBox(-4F, -8F, 0.5F, 8, 4, 1, 0F,0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.5F, 0.3F, -0.45F, 0.55F, 0.3F, -0.45F, 0.55F, 0.3F, -0.45F, 0.5F, 0.3F, -0.45F); // Box 205
		headModel[30].setRotationPoint(0F, 0F, 0F);

		headModel[31].addShapeBox(-4F, -9F, 0.5F, 8, 1, 1, 0F,-0.9F, 0.35F, -0.45F, -0.85F, 0.35F, -0.45F, -0.85F, 0.35F, -0.44F, -0.9F, 0.35F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F); // Box 206
		headModel[31].setRotationPoint(0F, 0F, 0F);

		headModel[32].addShapeBox(-4F, -8F, 3.5F, 8, 4, 1, 0F,0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.2F, 0.7F, -0.45F, 0.2F, 0.7F, -0.45F, 0.2F, 0.7F, -0.45F, 0.2F, 0.7F, -0.45F); // Box 207
		headModel[32].setRotationPoint(0F, 0F, 0F);

		headModel[33].addShapeBox(-4F, -9F, 3.5F, 8, 1, 1, 0F,-0.3F, -0.6F, -0.45F, -0.3F, -0.6F, -0.45F, -0.2F, -0.7F, -0.45F, -0.2F, -0.7F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F); // Box 208
		headModel[33].setRotationPoint(0F, 0F, 0F);

		headModel[34].addShapeBox(-2.5F, -9.4F, -4.2F, 1, 2, 9, 0F,-0.45F, 0.05F, -1.65F, -0.45F, 0.05F, -1.65F, -0.45F, 0F, -2F, -0.45F, 0F, -2F, -0.45F, -0.6F, -0.1F, -0.45F, -0.6F, -0.1F, -0.45F, -0.6F, -0.4F, -0.45F, -0.6F, -0.4F); // Box 201
		headModel[34].setRotationPoint(0F, 0F, 0F);

		headModel[35].addShapeBox(-1.5F, -9.4F, -4.2F, 1, 2, 9, 0F,-0.45F, 0.05F, -1.65F, -0.45F, 0.05F, -1.65F, -0.45F, 0F, -2F, -0.45F, 0F, -2F, -0.45F, -0.6F, -0.1F, -0.45F, -0.6F, -0.1F, -0.45F, -0.6F, -0.4F, -0.45F, -0.6F, -0.4F); // Box 202
		headModel[35].setRotationPoint(0F, 0F, 0F);

		headModel[36].addShapeBox(-0.5F, -9.4F, -4.2F, 1, 2, 9, 0F,-0.45F, 0.05F, -1.65F, -0.45F, 0.05F, -1.65F, -0.45F, 0F, -2F, -0.45F, 0F, -2F, -0.45F, -0.6F, -0.1F, -0.45F, -0.6F, -0.1F, -0.45F, -0.6F, -0.4F, -0.45F, -0.6F, -0.4F); // Box 203
		headModel[36].setRotationPoint(0F, 0F, 0F);

		headModel[37].addShapeBox(0.5F, -9.4F, -4.2F, 1, 2, 9, 0F,-0.45F, 0.05F, -1.65F, -0.45F, 0.05F, -1.65F, -0.45F, 0F, -2F, -0.45F, 0F, -2F, -0.45F, -0.6F, -0.1F, -0.45F, -0.6F, -0.1F, -0.45F, -0.6F, -0.4F, -0.45F, -0.6F, -0.4F); // Box 204
		headModel[37].setRotationPoint(0F, 0F, 0F);

		headModel[38].addShapeBox(1.5F, -9.4F, -4.2F, 1, 2, 9, 0F,-0.45F, 0.05F, -1.65F, -0.45F, 0.05F, -1.65F, -0.45F, 0F, -2F, -0.45F, 0F, -2F, -0.45F, -0.6F, -0.1F, -0.45F, -0.6F, -0.1F, -0.45F, -0.6F, -0.4F, -0.45F, -0.6F, -0.4F); // Box 205
		headModel[38].setRotationPoint(0F, 0F, 0F);

		headModel[39].addShapeBox(2.5F, -9.4F, -4.2F, 1, 2, 9, 0F,-0.45F, 0.05F, -1.65F, -0.45F, 0.05F, -1.65F, -0.45F, 0F, -2F, -0.45F, 0F, -2F, -0.45F, -0.6F, -0.1F, -0.45F, -0.6F, -0.1F, -0.45F, -0.6F, -0.4F, -0.45F, -0.6F, -0.4F); // Box 206
		headModel[39].setRotationPoint(0F, 0F, 0F);

		headModel[40].addShapeBox(-2.5F, -8F, -4.7F, 1, 3, 1, 0F,-0.45F, 0F, -0.6F, -0.45F, 0F, -0.6F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0.4F, 0.3F, -0.45F, 0.4F, 0.3F, -0.45F, 0F, 0F, -0.45F, 0F, 0F); // Box 207
		headModel[40].setRotationPoint(0F, 0F, 0F);

		headModel[41].addShapeBox(-1.5F, -8F, -4.7F, 1, 3, 1, 0F,-0.45F, 0F, -0.6F, -0.45F, 0F, -0.6F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0.4F, 0.3F, -0.45F, 0.4F, 0.3F, -0.45F, 0F, 0F, -0.45F, 0F, 0F); // Box 208
		headModel[41].setRotationPoint(0F, 0F, 0F);

		headModel[42].addShapeBox(-0.5F, -8F, -4.7F, 1, 3, 1, 0F,-0.45F, 0F, -0.6F, -0.45F, 0F, -0.6F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0.4F, 0.3F, -0.45F, 0.4F, 0.3F, -0.45F, 0F, 0F, -0.45F, 0F, 0F); // Box 209
		headModel[42].setRotationPoint(0F, 0F, 0F);

		headModel[43].addShapeBox(0.5F, -8F, -4.7F, 1, 3, 1, 0F,-0.45F, 0F, -0.6F, -0.45F, 0F, -0.6F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0.4F, 0.3F, -0.45F, 0.4F, 0.3F, -0.45F, 0F, 0F, -0.45F, 0F, 0F); // Box 210
		headModel[43].setRotationPoint(0F, 0F, 0F);

		headModel[44].addShapeBox(1.5F, -8F, -4.7F, 1, 3, 1, 0F,-0.45F, 0F, -0.6F, -0.45F, 0F, -0.6F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0.4F, 0.3F, -0.45F, 0.4F, 0.3F, -0.45F, 0F, 0F, -0.45F, 0F, 0F); // Box 211
		headModel[44].setRotationPoint(0F, 0F, 0F);

		headModel[45].addShapeBox(2.5F, -8F, -4.7F, 1, 3, 1, 0F,-0.45F, 0F, -0.6F, -0.45F, 0F, -0.6F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0.4F, 0.3F, -0.45F, 0.4F, 0.3F, -0.45F, 0F, 0F, -0.45F, 0F, 0F); // Box 212
		headModel[45].setRotationPoint(0F, 0F, 0F);

		headModel[46].addShapeBox(1.5F, -8F, 3.4F, 1, 4, 2, 0F,-0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -1F, -0.45F, 0F, -1F, -0.45F, 0.6F, 0F, -0.45F, 0.6F, 0F, -0.45F, 0.7F, -0.55F, -0.45F, 0.7F, -0.55F); // Box 213
		headModel[46].setRotationPoint(0F, 0F, 0F);

		headModel[47].addShapeBox(0.5F, -8F, 3.4F, 1, 4, 2, 0F,-0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -1F, -0.45F, 0F, -1F, -0.45F, 0.6F, 0F, -0.45F, 0.6F, 0F, -0.45F, 0.7F, -0.55F, -0.45F, 0.7F, -0.55F); // Box 214
		headModel[47].setRotationPoint(0F, 0F, 0F);

		headModel[48].addShapeBox(-0.5F, -8F, 3.4F, 1, 4, 2, 0F,-0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -1F, -0.45F, 0F, -1F, -0.45F, 0.6F, 0F, -0.45F, 0.6F, 0F, -0.45F, 0.7F, -0.55F, -0.45F, 0.7F, -0.55F); // Box 215
		headModel[48].setRotationPoint(0F, 0F, 0F);

		headModel[49].addShapeBox(-1.5F, -8F, 3.4F, 1, 4, 2, 0F,-0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -1F, -0.45F, 0F, -1F, -0.45F, 0.6F, 0F, -0.45F, 0.6F, 0F, -0.45F, 0.7F, -0.55F, -0.45F, 0.7F, -0.55F); // Box 216
		headModel[49].setRotationPoint(0F, 0F, 0F);

		headModel[50].addShapeBox(-2.5F, -8F, 3.4F, 1, 4, 2, 0F,-0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -1F, -0.45F, 0F, -1F, -0.45F, 0.6F, 0F, -0.45F, 0.6F, 0F, -0.45F, 0.7F, -0.55F, -0.45F, 0.7F, -0.55F); // Box 217
		headModel[50].setRotationPoint(0F, 0F, 0F);

		headModel[51].addShapeBox(-3.5F, -8F, 3.4F, 1, 4, 2, 0F,-0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -1F, -0.45F, 0F, -1F, -0.45F, 0.6F, 0F, -0.45F, 0.6F, 0F, -0.45F, 0.7F, -0.55F, -0.45F, 0.7F, -0.55F); // Box 218
		headModel[51].setRotationPoint(0F, 0F, 0F);

		headModel[52].addShapeBox(-4.5F, -4.5F, 0.0999999999999995F, 9, 1, 5, 0F,0.07F, -0.45F, 0.1F, 0.07F, -0.45F, 0.1F, -0.35F, -0.45F, -0.32F, -0.35F, -0.45F, -0.32F, 0.07F, -0.45F, 0.1F, 0.07F, -0.45F, 0.1F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F); // Box 219
		headModel[52].setRotationPoint(0F, 0F, 0F);

		headModel[53].addShapeBox(-4.5F, -4.5F, -2F, 9, 1, 2, 0F,-0.1F, -0.45F, 0F, -0.1F, -0.45F, 0F, 0.07F, -0.45F, 0F, 0.07F, -0.45F, 0F, -0.1F, -0.45F, 0F, -0.1F, -0.45F, 0F, 0.07F, -0.45F, 0F, 0.07F, -0.45F, 0F); // Box 221
		headModel[53].setRotationPoint(0F, 0F, 0F);

		headModel[54].addShapeBox(-4F, -8F, -4.47F, 8, 3, 1, 0F,0.05F, -0.05F, -0.45F, 0.05F, -0.05F, -0.45F, 0.05F, -0.05F, -0.45F, 0.05F, -0.05F, -0.45F, 0.15F, 0.8F, -0.45F, 0.15F, 0.8F, -0.45F, 0.15F, 0.8F, -0.45F, 0.15F, 0.8F, -0.45F); // Box 164
		headModel[54].setRotationPoint(0F, 0F, 0F);

		headModel[55].addShapeBox(-3F, -8F, -4.77F, 6, 8, 1, 0F,-2F, 0F, -0.76F, -2F, 0F, -0.76F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -5.4F, 0F, -2F, -5.4F, 0F, -2F, -5.4F, 0F, -2F, -5.4F, 0F); // Box 165
		headModel[55].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 101, 12, textureX, textureY); // Box 50
		bodyModel[1] = new ModelRendererTurbo(this, 101, 12, textureX, textureY); // Box 51
		bodyModel[2] = new ModelRendererTurbo(this, 101, 11, textureX, textureY); // Box 52
		bodyModel[3] = new ModelRendererTurbo(this, 101, 11, textureX, textureY); // Box 53
		bodyModel[4] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 33
		bodyModel[5] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 39
		bodyModel[6] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 1
		bodyModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 11
		bodyModel[8] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 12
		bodyModel[9] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 34
		bodyModel[10] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 27
		bodyModel[11] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 111
		bodyModel[12] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 55
		bodyModel[13] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 57
		bodyModel[14] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 58
		bodyModel[15] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 59
		bodyModel[16] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 60
		bodyModel[17] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 61
		bodyModel[18] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 62
		bodyModel[19] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 63
		bodyModel[20] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 64
		bodyModel[21] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 65
		bodyModel[22] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 66
		bodyModel[23] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 67
		bodyModel[24] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 68
		bodyModel[25] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 69
		bodyModel[26] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 70
		bodyModel[27] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 20
		bodyModel[28] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 21
		bodyModel[29] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 22
		bodyModel[30] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 23
		bodyModel[31] = new ModelRendererTurbo(this, 101, 11, textureX, textureY); // Box 79
		bodyModel[32] = new ModelRendererTurbo(this, 101, 4, textureX, textureY); // Box 80
		bodyModel[33] = new ModelRendererTurbo(this, 101, 3, textureX, textureY); // Box 81
		bodyModel[34] = new ModelRendererTurbo(this, 101, 12, textureX, textureY); // Box 82
		bodyModel[35] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 108
		bodyModel[36] = new ModelRendererTurbo(this, 103, 11, textureX, textureY); // Box 90
		bodyModel[37] = new ModelRendererTurbo(this, 103, 11, textureX, textureY); // Box 91
		bodyModel[38] = new ModelRendererTurbo(this, 103, 11, textureX, textureY); // Box 92
		bodyModel[39] = new ModelRendererTurbo(this, 103, 10, textureX, textureY); // Box 93
		bodyModel[40] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 12
		bodyModel[41] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 13
		bodyModel[42] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 32
		bodyModel[43] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 34
		bodyModel[44] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 35
		bodyModel[45] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 36
		bodyModel[46] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 37
		bodyModel[47] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 38
		bodyModel[48] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 47
		bodyModel[49] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 48
		bodyModel[50] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 121
		bodyModel[51] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 122
		bodyModel[52] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 126
		bodyModel[53] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 127
		bodyModel[54] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 103
		bodyModel[55] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 104
		bodyModel[56] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 105
		bodyModel[57] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Box 104
		bodyModel[58] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 107
		bodyModel[59] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 14
		bodyModel[60] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 15
		bodyModel[61] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 16
		bodyModel[62] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 17
		bodyModel[63] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 18
		bodyModel[64] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 123
		bodyModel[65] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 124
		bodyModel[66] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 125
		bodyModel[67] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 126
		bodyModel[68] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 127
		bodyModel[69] = new ModelRendererTurbo(this, 9, 89, textureX, textureY); // Box 129
		bodyModel[70] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 130
		bodyModel[71] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 132
		bodyModel[72] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 134
		bodyModel[73] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 35
		bodyModel[74] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box 87
		bodyModel[75] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 88
		bodyModel[76] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 141
		bodyModel[77] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 142
		bodyModel[78] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 143
		bodyModel[79] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 144
		bodyModel[80] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 7
		bodyModel[81] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 9
		bodyModel[82] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 10
		bodyModel[83] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 11
		bodyModel[84] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 150
		bodyModel[85] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 151
		bodyModel[86] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 152
		bodyModel[87] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 153

		bodyModel[0].addBox(0.9F, 2.5F, -2.25F, 3, 1, 1, 0F); // Box 50
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-3.9F, 2.5F, -2.25F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addBox(-3.9F, 3.5F, -2.15F, 3, 2, 1, 0F); // Box 52
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addBox(0.9F, 3.5F, -2.15F, 3, 2, 1, 0F); // Box 53
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 1.9F, -2F, 8, 10, 4, 0F,0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 33
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-0.5F, 1.4F, -2.15F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 39
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4F, -0.1F, -2F, 4, 2, 4, 0F,0.1F, 0F, 0.1F, -1F, 0F, 0.1F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F); // Box 1
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-0.5F, -0.1F, -2.15F, 2, 2, 1, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-1.5F, -0.1F, -2.12F, 2, 2, 1, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 12
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(0F, -0.1F, -2F, 4, 2, 4, 0F,-1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0F, -0.5F, 0.1F); // Box 34
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-2.5F, 3F, -2.52F, 5, 1, 1, 0F,0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F); // Box 27
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(2F, 3F, -2.4F, 1, 1, 1, 0F,-0.3F, -0.05F, 0F, -0.3F, -0.05F, 0F, -0.3F, -0.05F, 0F, -0.3F, -0.05F, 0F, -0.3F, -0.05F, 0F, -0.3F, -0.05F, 0F, -0.3F, -0.05F, 0F, -0.3F, -0.05F, 0F); // Box 111
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-3.75F, 7.2F, 0.949999999999996F, 3, 2, 2, 0F,-0.25F, 0.35F, -0.2F, -0.25F, 0.35F, -0.2F, -0.25F, 0.35F, -0.2F, -0.25F, 0.35F, -0.2F, -0.25F, 0.35F, -0.2F, -0.25F, 0.35F, -0.2F, -0.25F, 0.35F, -0.2F, -0.25F, 0.35F, -0.2F); // Box 55
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-3.75F, 6.7F, 1F, 3, 1, 2, 0F,-0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F); // Box 57
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-2.75F, 7.4F, 2.05F, 1, 1, 1, 0F,-0.32F, 0.2F, -0.2F, -0.32F, 0.2F, -0.2F, -0.32F, 0.2F, -0.2F, -0.32F, 0.2F, -0.2F, -0.32F, 0.2F, -0.2F, -0.32F, 0.2F, -0.2F, -0.32F, 0.2F, -0.2F, -0.32F, 0.2F, -0.2F); // Box 58
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-2.75F, 7.6F, 2.1F, 1, 1, 1, 0F,-0.28F, -0.32F, -0.2F, -0.28F, -0.32F, -0.2F, -0.28F, -0.32F, -0.2F, -0.28F, -0.32F, -0.2F, -0.28F, -0.32F, -0.2F, -0.28F, -0.32F, -0.2F, -0.28F, -0.32F, -0.2F, -0.28F, -0.32F, -0.2F); // Box 59
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-2.75F, 9.4F, 1.9F, 1, 1, 1, 0F,-0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.1F, 0.35F, -0.2F, -0.1F, 0.35F, -0.2F, -0.1F, 0.35F, -0.2F, -0.1F, 0.35F, -0.2F); // Box 60
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-2.75F, 11.55F, 1.9F, 1, 1, 1, 0F,-0.18F, 0.8F, -0.2F, -0.18F, 0.8F, -0.2F, -0.18F, 0.8F, -0.2F, -0.18F, 0.8F, -0.2F, -0.22F, 0.8F, -0.2F, -0.22F, 0.8F, -0.2F, -0.22F, 0.8F, -0.2F, -0.22F, 0.8F, -0.2F); // Box 61
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-2.75F, 13.55F, 1.9F, 1, 1, 1, 0F,-0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.15F, -0.8F, -0.2F, -0.15F, -0.8F, -0.2F, -0.15F, -0.8F, -0.2F, -0.15F, -0.8F, -0.2F); // Box 62
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-2.75F, 13.95F, 1.9F, 1, 1, 1, 0F,-0.15F, 0.2F, -0.2F, -0.15F, 0.2F, -0.2F, -0.15F, 0.2F, -0.2F, -0.15F, 0.2F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F); // Box 63
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(0.8F, 8.85F, 1.9F, 2, 1, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 64
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(0.8F, 7.95F, 1.9F, 2, 1, 1, 0F,-0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(0.8F, 7.7F, 1.9F, 2, 1, 1, 0F,-0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 66
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(0.8F, 9.3F, 1.9F, 2, 1, 1, 0F,0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 67
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(0.8F, 10F, 1.9F, 2, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F); // Box 68
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(0.8F, 7.4F, 2.1F, 2, 1, 1, 0F,-0.75F, -0.35F, -0.3F, -0.75F, -0.35F, -0.3F, -0.75F, -0.35F, -0.3F, -0.75F, -0.35F, -0.3F, -0.75F, -0.35F, -0.3F, -0.75F, -0.35F, -0.3F, -0.75F, -0.35F, -0.3F, -0.75F, -0.35F, -0.3F); // Box 69
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(0.8F, 7.15F, 2.1F, 2, 1, 1, 0F,-0.7F, -0.3F, -0.25F, -0.7F, -0.3F, -0.25F, -0.7F, -0.3F, -0.25F, -0.7F, -0.3F, -0.25F, -0.7F, -0.3F, -0.25F, -0.7F, -0.3F, -0.25F, -0.7F, -0.3F, -0.25F, -0.7F, -0.3F, -0.25F); // Box 70
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-3.3F, 5.5F, -2.6F, 1, 1, 2, 0F,-0.05F, -0.2F, -0.2F, -0.05F, -0.2F, -0.2F, -0.05F, -0.2F, -0.2F, -0.05F, -0.2F, -0.2F, -0.05F, -0.2F, -0.2F, -0.05F, -0.2F, -0.2F, -0.05F, -0.2F, -0.2F, -0.05F, -0.2F, -0.2F); // Box 20
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(2.3F, 5.5F, -2.6F, 1, 1, 2, 0F,-0.05F, -0.2F, -0.2F, -0.05F, -0.2F, -0.2F, -0.05F, -0.2F, -0.2F, -0.05F, -0.2F, -0.2F, -0.05F, -0.2F, -0.2F, -0.05F, -0.2F, -0.2F, -0.05F, -0.2F, -0.2F, -0.05F, -0.2F, -0.2F); // Box 21
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(2.3F, 5.5F, -2.7F, 1, 1, 1, 0F,-0.2F, -0.3F, -0.25F, -0.2F, -0.3F, -0.25F, -0.2F, -0.3F, -0.25F, -0.2F, -0.3F, -0.25F, -0.2F, -0.3F, -0.25F, -0.2F, -0.3F, -0.25F, -0.2F, -0.3F, -0.25F, -0.2F, -0.3F, -0.25F); // Box 22
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(-3.3F, 5.5F, -2.7F, 1, 1, 1, 0F,-0.2F, -0.3F, -0.25F, -0.2F, -0.3F, -0.25F, -0.2F, -0.3F, -0.25F, -0.2F, -0.3F, -0.25F, -0.2F, -0.3F, -0.25F, -0.2F, -0.3F, -0.25F, -0.2F, -0.3F, -0.25F, -0.2F, -0.3F, -0.25F); // Box 23
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addBox(-3.9F, 9.5F, -2.15F, 3, 2, 1, 0F); // Box 79
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-3.9F, 8.5F, -2.25F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addBox(0.9F, 9.5F, -2.15F, 3, 2, 1, 0F); // Box 81
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addBox(0.9F, 8.5F, -2.25F, 3, 1, 1, 0F); // Box 82
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addBox(-1.5F, -0.09F, -2.05F, 3, 2, 1, 0F); // Box 108
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-2.9F, 3.5F, -2.2F, 1, 2, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.05F, 0F, -0.1F, 0.05F, 0F, -0.1F, 0.05F, 0F, -0.1F, 0.05F, 0F); // Box 90
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(1.9F, 3.5F, -2.2F, 1, 2, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.05F, 0F, -0.1F, 0.05F, 0F, -0.1F, 0.05F, 0F, -0.1F, 0.05F, 0F); // Box 91
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(1.9F, 9.5F, -2.2F, 1, 2, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.05F, 0F, -0.1F, 0.05F, 0F, -0.1F, 0.05F, 0F, -0.1F, 0.05F, 0F); // Box 92
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(-2.9F, 9.5F, -2.2F, 1, 2, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.05F, 0F, -0.1F, 0.05F, 0F, -0.1F, 0.05F, 0F, -0.1F, 0.05F, 0F); // Box 93
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(-4.3F, 8.05F, -2.55F, 9, 1, 5, 0F,-0.1F, 0.1F, -0.2F, -0.5F, 0.1F, -0.2F, -0.5F, 0.1F, -0.2F, -0.1F, 0.1F, -0.2F, -0.1F, 0.1F, -0.2F, -0.5F, 0.1F, -0.2F, -0.5F, 0.1F, -0.2F, -0.1F, 0.1F, -0.2F); // Box 12
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(-0.95F, 8.05F, -2.6F, 2, 1, 3, 0F,-0.25F, 0.11F, -0.2F, -0.25F, 0.11F, -0.2F, -0.25F, 0.11F, -0.2F, -0.25F, 0.11F, -0.2F, -0.25F, 0.11F, -0.2F, -0.25F, 0.11F, -0.2F, -0.25F, 0.11F, -0.2F, -0.25F, 0.11F, -0.2F); // Box 13
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(-3.7F, 7.6F, -3.3F, 3, 4, 1, 0F,0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 32
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(-2.7F, 7.55F, -3.4F, 1, 1, 1, 0F,-0.1F, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0.1F, 0.2F, -0.1F, 0.1F, 0.2F, -0.1F, 0.1F, 0.2F, -0.1F, 0.1F, 0.2F); // Box 34
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(-1.9F, 7.55F, -3.4F, 1, 1, 1, 0F,-0.1F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0.1F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.1F, 0.1F, 0.2F); // Box 35
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(-3.4F, 7.55F, -3.4F, 1, 1, 1, 0F,-0.1F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, -0.2F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.1F, -0.2F, 0.2F); // Box 36
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(-4.1F, 7.55F, -3.4F, 1, 1, 1, 0F,-0.25F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, -0.65F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.25F, -0.65F, 0.2F); // Box 37
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(-1.35F, 7.55F, -3.4F, 1, 1, 1, 0F,-0.25F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, -0.2F, 0.2F, -0.2F, -0.65F, 0.2F, -0.2F, -0.65F, 0.2F, -0.25F, -0.2F, 0.2F); // Box 38
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(-2.7F, 8.55F, -3.45F, 1, 1, 1, 0F,-0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F); // Box 47
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(-2.7F, 9.35F, -3.45F, 1, 1, 1, 0F,-0.3F, -0.4F, 0.2F, -0.3F, -0.4F, 0.2F, -0.3F, -0.4F, 0.2F, -0.3F, -0.4F, 0.2F, -0.4F, -0.4F, 0.2F, -0.4F, -0.4F, 0.2F, -0.4F, -0.4F, 0.2F, -0.4F, -0.4F, 0.2F); // Box 48
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(-3F, 0F, -2.54F, 7, 10, 5, 0F,0F, 0.2F, -0.25F, -5.75F, 0.2F, -0.25F, -5.75F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, -7F, 0F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.3F, -7F, 0F, -0.3F); // Box 121
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(3.8F, 9.5F, -2F, 2, 4, 4, 0F,-0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F); // Box 122
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(3.65F, 9F, -2F, 2, 1, 4, 0F,-0.35F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, -0.35F, 0.5F, 0.3F, -0.35F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.35F, 0F, 0.3F); // Box 126
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(3.65F, 10F, -2F, 2, 1, 4, 0F,-0.35F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.35F, 0F, 0.3F, -0.35F, -0.9F, 0.3F, 0F, -0.6F, 0.3F, 0F, -0.6F, 0.3F, -0.35F, -0.9F, 0.3F); // Box 127
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(3.85F, 9.6F, -1.5F, 2, 4, 3, 0F,-0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F); // Box 103
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(3.7F, 10F, -0.5F, 2, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 104
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addShapeBox(3.75F, 10.5F, -0.5F, 2, 1, 1, 0F,0F, -0.25F, -0.23F, 0F, -0.25F, -0.23F, 0F, -0.25F, -0.23F, 0F, -0.25F, -0.23F, 0F, -0.25F, -0.23F, 0F, -0.25F, -0.23F, 0F, -0.25F, -0.23F, 0F, -0.25F, -0.23F); // Box 105
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addShapeBox(-1F, 1.95F, -2.32F, 1, 1, 1, 0F,0F, -0.8F, 0F, -0.17F, -0.2F, 0F, -0.17F, -0.2F, 0F, 0F, -0.8F, 0F, -0.15F, 0F, 0F, -0.04F, -0.6F, 0F, -0.04F, -0.6F, 0F, -0.15F, 0F, 0F); // Box 104
		bodyModel[57].setRotationPoint(0F, 0F, 0F);

		bodyModel[58].addShapeBox(1F, 4.88F, -2.32F, 1, 1, 1, 0F,0F, -0.8F, 0F, -0.225F, -0.2F, 0F, -0.225F, -0.2F, 0F, 0F, -0.8F, 0F, -0.15F, 0F, 0F, -0.09F, -0.6F, 0F, -0.09F, -0.6F, 0F, -0.15F, 0F, 0F); // Box 107
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addShapeBox(2.3F, 7.9F, -2.6F, 1, 1, 1, 0F,-0.1F, 0.5F, -0.2F, -0.1F, 0.5F, -0.2F, -0.1F, 0.5F, -0.2F, -0.1F, 0.5F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F); // Box 14
		bodyModel[59].setRotationPoint(0F, 0F, 0F);

		bodyModel[60].addShapeBox(-3.3F, 7.9F, -2.6F, 1, 1, 1, 0F,-0.1F, 0.5F, -0.2F, -0.1F, 0.5F, -0.2F, -0.1F, 0.5F, -0.2F, -0.1F, 0.5F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F); // Box 15
		bodyModel[60].setRotationPoint(0F, 0F, 0F);

		bodyModel[61].addShapeBox(-3.3F, 0.100000000000002F, -2.55F, 1, 7, 4, 0F,-0.1F, 0.5F, -0.2F, -0.1F, 0.5F, -0.2F, -0.1F, 0.5F, -0.2F, -0.1F, 0.5F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F); // Box 16
		bodyModel[61].setRotationPoint(0F, 0F, 0F);

		bodyModel[62].addShapeBox(2.3F, 0.100000000000002F, -2.55F, 1, 7, 4, 0F,-0.1F, 0.5F, -0.2F, -0.1F, 0.5F, -0.2F, -0.1F, 0.5F, -0.2F, -0.1F, 0.5F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F); // Box 17
		bodyModel[62].setRotationPoint(0F, 0F, 0F);

		bodyModel[63].addShapeBox(-3.3F, -0.3F, -2.31F, 1, 3, 4, 0F,0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, -0.25F, 0F, 0.15F, -0.25F, 0F, 0.15F, -0.25F, 0F, 0.15F, -0.25F, 0F); // Box 18
		bodyModel[63].setRotationPoint(0F, 0F, 0F);

		bodyModel[64].addShapeBox(-3.3F, 2.45F, -2.31F, 1, 1, 1, 0F,0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 123
		bodyModel[64].setRotationPoint(0F, 0F, 0F);

		bodyModel[65].addShapeBox(2.3F, -0.3F, -2.31F, 1, 3, 4, 0F,0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, -0.25F, 0F, 0.15F, -0.25F, 0F, 0.15F, -0.25F, 0F, 0.15F, -0.25F, 0F); // Box 124
		bodyModel[65].setRotationPoint(0F, 0F, 0F);

		bodyModel[66].addShapeBox(2.3F, 2.45F, -2.31F, 1, 1, 1, 0F,0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 125
		bodyModel[66].setRotationPoint(0F, 0F, 0F);

		bodyModel[67].addShapeBox(1.5F, 3F, -2.57F, 1, 1, 1, 0F,0F, -0.32F, -0.2F, 0F, -0.32F, -0.2F, 0F, -0.32F, -0.2F, 0F, -0.32F, -0.2F, 0F, -0.32F, -0.2F, 0F, -0.32F, -0.2F, 0F, -0.32F, -0.2F, 0F, -0.32F, -0.2F); // Box 126
		bodyModel[67].setRotationPoint(0F, 0F, 0F);

		bodyModel[68].addShapeBox(1.25F, 3F, -2.4F, 1, 1, 1, 0F,-0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F); // Box 127
		bodyModel[68].setRotationPoint(0F, 0F, 0F);

		bodyModel[69].addShapeBox(2F, 3F, -2.42F, 1, 1, 1, 0F,-0.37F, -0.2F, 0F, -0.37F, -0.2F, 0F, -0.37F, -0.2F, 0F, -0.37F, -0.2F, 0F, -0.37F, -0.2F, 0F, -0.37F, -0.2F, 0F, -0.37F, -0.2F, 0F, -0.37F, -0.2F, 0F); // Box 129
		bodyModel[69].setRotationPoint(0F, 0F, 0F);

		bodyModel[70].addShapeBox(-3.3F, 1.25F, -2.6F, 1, 1, 2, 0F,-0.05F, -0.3F, -0.2F, -0.05F, -0.3F, -0.2F, -0.05F, -0.3F, -0.2F, -0.05F, -0.3F, -0.2F, -0.05F, -0.3F, -0.2F, -0.05F, -0.3F, -0.2F, -0.05F, -0.3F, -0.2F, -0.05F, -0.3F, -0.2F); // Box 130
		bodyModel[70].setRotationPoint(0F, 0F, 0F);

		bodyModel[71].addShapeBox(2.3F, 1.25F, -2.6F, 1, 1, 2, 0F,-0.05F, -0.3F, -0.2F, -0.05F, -0.3F, -0.2F, -0.05F, -0.3F, -0.2F, -0.05F, -0.3F, -0.2F, -0.05F, -0.3F, -0.2F, -0.05F, -0.3F, -0.2F, -0.05F, -0.3F, -0.2F, -0.05F, -0.3F, -0.2F); // Box 132
		bodyModel[71].setRotationPoint(0F, 0F, 0F);

		bodyModel[72].addShapeBox(-3.7F, 8.45F, -3.35F, 3, 3, 1, 0F,-0.3F, 0.4F, 0.2F, -0.3F, 0.4F, 0.2F, -0.3F, 0.4F, 0.2F, -0.3F, 0.4F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F); // Box 134
		bodyModel[72].setRotationPoint(0F, 0F, 0F);

		bodyModel[73].addShapeBox(-0.5F, 3F, 1.2F, 1, 5, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 35
		bodyModel[73].setRotationPoint(0F, 0F, 0F);

		bodyModel[74].addShapeBox(0.2F, -0.4F, 1.2F, 3, 3, 1, 0F,-2.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.2F, 0F, 0F, 0.6F, 0.4F, 0F, -2.8F, 0.4F, 0F, -2.8F, 0.4F, 0F, 0.6F, 0.4F, 0F); // Box 87
		bodyModel[74].setRotationPoint(0F, 0F, 0F);

		bodyModel[75].addShapeBox(-3.2F, -0.4F, 1.2F, 3, 3, 1, 0F,0F, 0F, 0F, -2.2F, 0F, 0F, -2.2F, 0F, 0F, 0F, 0F, 0F, -2.8F, 0.4F, 0F, 0.6F, 0.4F, 0F, 0.6F, 0.4F, 0F, -2.8F, 0.4F, 0F); // Box 88
		bodyModel[75].setRotationPoint(0F, 0F, 0F);

		bodyModel[76].addShapeBox(0.45F, -0.3F, 1.69F, 3, 2, 1, 0F,-1.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.52F, -1.7F, 0F, -0.52F, -0.2F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, -0.52F, -0.2F, -0.25F, -0.52F); // Box 141
		bodyModel[76].setRotationPoint(0F, 0F, 0F);

		bodyModel[77].addShapeBox(-3.45F, -0.3F, 1.69F, 3, 2, 1, 0F,0F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, -0.52F, 0F, 0F, -0.52F, -1.5F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, -0.52F, -1.5F, -0.25F, -0.52F); // Box 142
		bodyModel[77].setRotationPoint(0F, 0F, 0F);

		bodyModel[78].addShapeBox(-0.5F, 2.75F, 1.55F, 1, 1, 1, 0F,-0.2F, -0.3F, -0.25F, -0.2F, -0.3F, -0.25F, -0.2F, -0.3F, -0.25F, -0.2F, -0.3F, -0.25F, -0.2F, -0.3F, -0.25F, -0.2F, -0.3F, -0.25F, -0.2F, -0.3F, -0.25F, -0.2F, -0.3F, -0.25F); // Box 143
		bodyModel[78].setRotationPoint(0F, 0F, 0F);

		bodyModel[79].addShapeBox(-0.5F, 2.75F, 0.449999999999999F, 1, 1, 2, 0F,-0.05F, -0.2F, -0.2F, -0.05F, -0.2F, -0.2F, -0.05F, -0.2F, -0.2F, -0.05F, -0.2F, -0.2F, -0.05F, -0.2F, -0.2F, -0.05F, -0.2F, -0.2F, -0.05F, -0.2F, -0.2F, -0.05F, -0.2F, -0.2F); // Box 144
		bodyModel[79].setRotationPoint(0F, 0F, 0F);

		bodyModel[80].addShapeBox(1.3F, 7.9F, -2.85F, 1, 2, 2, 0F,-0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 7
		bodyModel[80].setRotationPoint(0F, 0F, 0F);

		bodyModel[81].addShapeBox(1.3F, 10.05F, -3.05F, 1, 3, 1, 0F,-0.1F, 0F, -0.15F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.15F); // Box 9
		bodyModel[81].setRotationPoint(0F, 0F, 0F);

		bodyModel[82].addShapeBox(1.3F, 12.65F, -3.05F, 1, 1, 1, 0F,-0.1F, -0.4F, -0.15F, -0.1F, -0.4F, -0.15F, -0.1F, -0.4F, -0.15F, -0.1F, -0.4F, -0.15F, -0.5F, 0F, -0.15F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.15F, -0.5F, 0F, -0.15F); // Box 10
		bodyModel[82].setRotationPoint(0F, 0F, 0F);

		bodyModel[83].addShapeBox(1.3F, 8F, -2.9F, 1, 2, 1, 0F,-0.15F, -0.2F, 0F, -0.15F, -0.2F, 0F, -0.15F, -0.2F, 0F, -0.15F, -0.2F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F); // Box 11
		bodyModel[83].setRotationPoint(0F, 0F, 0F);

		bodyModel[84].addShapeBox(1.3F, 9.1F, -3F, 1, 1, 1, 0F,-0.05F, -0.9F, -0.05F, -0.05F, -0.9F, -0.05F, -0.05F, -0.9F, -0.05F, -0.05F, -0.9F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F); // Box 150
		bodyModel[84].setRotationPoint(0F, 0F, 0F);

		bodyModel[85].addShapeBox(1.3F, 10.55F, -3F, 1, 1, 1, 0F,-0.05F, -0.9F, -0.05F, -0.05F, -0.9F, -0.05F, -0.05F, -0.9F, -0.05F, -0.05F, -0.9F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F); // Box 151
		bodyModel[85].setRotationPoint(0F, 0F, 0F);

		bodyModel[86].addShapeBox(1.3F, 7.95F, -2.92F, 1, 1, 1, 0F,-0.12F, -0.2F, 0F, -0.12F, -0.2F, 0F, -0.12F, -0.2F, 0F, -0.12F, -0.2F, 0F, -0.12F, -0.4F, 0F, -0.12F, -0.4F, 0F, -0.12F, -0.4F, 0F, -0.12F, -0.4F, 0F); // Box 152
		bodyModel[86].setRotationPoint(0F, 0F, 0F);

		bodyModel[87].addShapeBox(1.3F, 9.4F, -2.92F, 1, 1, 1, 0F,-0.12F, -0.4F, 0F, -0.12F, -0.4F, 0F, -0.12F, -0.4F, 0F, -0.12F, -0.4F, 0F, -0.12F, -0.4F, 0F, -0.12F, -0.4F, 0F, -0.12F, -0.4F, 0F, -0.12F, -0.4F, 0F); // Box 153
		bodyModel[87].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 1
		leftArmModel[1] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 3
		leftArmModel[2] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 49
		leftArmModel[3] = new ModelRendererTurbo(this, 101, 9, textureX, textureY); // Box 59
		leftArmModel[4] = new ModelRendererTurbo(this, 101, 10, textureX, textureY); // Box 60
		leftArmModel[5] = new ModelRendererTurbo(this, 103, 11, textureX, textureY); // Box 95

		leftArmModel[0].addShapeBox(-1F, -2.1F, -2F, 4, 9, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 1
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 6.5F, -2F, 4, 2, 4, 0F,0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F); // Box 3
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-0.95F, -2.3F, -1F, 4, 1, 2, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 49
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(2.05F, 1.5F, -1.5F, 1, 2, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 59
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(2.15F, 0.5F, -1.5F, 1, 1, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 60
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(2.1F, 1.5F, -0.5F, 1, 2, 1, 0F,0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.05F, 0F, 0.1F, 0.05F, 0F, 0.1F, 0.05F, 0F, 0.1F, 0.05F, 0F); // Box 95
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 2
		rightArmModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 2
		rightArmModel[2] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 48
		rightArmModel[3] = new ModelRendererTurbo(this, 101, 2, textureX, textureY); // Box 61
		rightArmModel[4] = new ModelRendererTurbo(this, 101, 9, textureX, textureY); // Box 62
		rightArmModel[5] = new ModelRendererTurbo(this, 103, 10, textureX, textureY); // Box 94

		rightArmModel[0].addShapeBox(-3F, -2.1F, -2F, 4, 9, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 6.5F, -2F, 4, 2, 4, 0F,0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F); // Box 2
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3.05F, -2.3F, -1F, 4, 1, 2, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 48
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3.15F, 0.5F, -1.5F, 1, 1, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 61
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-3.05F, 1.5F, -1.5F, 1, 2, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 62
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-3.1F, 1.5F, -0.5F, 1, 2, 1, 0F,0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.05F, 0F, 0.1F, 0.05F, 0F, 0.1F, 0.05F, 0F, 0.1F, 0.05F, 0F); // Box 94
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 0
		leftLegModel[1] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 24
		leftLegModel[2] = new ModelRendererTurbo(this, 101, 2, textureX, textureY); // Box 63
		leftLegModel[3] = new ModelRendererTurbo(this, 102, 9, textureX, textureY); // Box 64
		leftLegModel[4] = new ModelRendererTurbo(this, 103, 10, textureX, textureY); // Box 97

		leftLegModel[0].addShapeBox(-2F, -0.0999999999999996F, -2F, 4, 12, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 0
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 6.1F, -2.3F, 4, 6, 5, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Box 24
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(1.15F, 1F, -1.5F, 1, 1, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 63
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(1.05F, 2F, -1.5F, 1, 3, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 64
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(1.1F, 2F, -0.5F, 1, 3, 1, 0F,0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.05F, 0F, 0.1F, 0.05F, 0F, 0.1F, 0.05F, 0F, 0.1F, 0.05F, 0F); // Box 97
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 5
		rightLegModel[1] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 25
		rightLegModel[2] = new ModelRendererTurbo(this, 100, 2, textureX, textureY); // Box 67
		rightLegModel[3] = new ModelRendererTurbo(this, 101, 9, textureX, textureY); // Box 68
		rightLegModel[4] = new ModelRendererTurbo(this, 103, 10, textureX, textureY); // Box 96

		rightLegModel[0].addShapeBox(-2F, -0.0999999999999996F, -2F, 4, 12, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 5
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 6.1F, -2.3F, 4, 6, 5, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Box 25
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2.15F, 1F, -1.5F, 1, 1, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 67
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2.05F, 2F, -1.5F, 1, 3, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 68
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2.1F, 2F, -0.5F, 1, 3, 1, 0F,0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.05F, 0F, 0.1F, 0.05F, 0F, 0.1F, 0.05F, 0F, 0.1F, 0.05F, 0F); // Box 96
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);
	}
}