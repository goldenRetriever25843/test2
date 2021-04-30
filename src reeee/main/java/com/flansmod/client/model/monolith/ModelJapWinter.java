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

public class ModelJapWinter extends ModelCustomArmour //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelJapWinter() //Same as Filename
	{
		headModel = new ModelRendererTurbo[40];
		bodyModel = new ModelRendererTurbo[113];
		leftArmModel = new ModelRendererTurbo[4];
		rightArmModel = new ModelRendererTurbo[4];
		leftLegModel = new ModelRendererTurbo[17];
		rightLegModel = new ModelRendererTurbo[17];

		initheadModel_1();
		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 138
		headModel[1] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 139
		headModel[2] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 140
		headModel[3] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 141
		headModel[4] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 142
		headModel[5] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 143
		headModel[6] = new ModelRendererTurbo(this, 411, 202, textureX, textureY); // Box 200
		headModel[7] = new ModelRendererTurbo(this, 414, 234, textureX, textureY); // Box 203
		headModel[8] = new ModelRendererTurbo(this, 319, 126, textureX, textureY); // Box 179
		headModel[9] = new ModelRendererTurbo(this, 321, 139, textureX, textureY); // Box 184
		headModel[10] = new ModelRendererTurbo(this, 321, 139, textureX, textureY); // Box 185
		headModel[11] = new ModelRendererTurbo(this, 321, 139, textureX, textureY); // Box 186
		headModel[12] = new ModelRendererTurbo(this, 321, 139, textureX, textureY); // Box 187
		headModel[13] = new ModelRendererTurbo(this, 181, 315, textureX, textureY); // Box 192
		headModel[14] = new ModelRendererTurbo(this, 83, 318, textureX, textureY); // Box 193
		headModel[15] = new ModelRendererTurbo(this, 321, 139, textureX, textureY); // Box 194
		headModel[16] = new ModelRendererTurbo(this, 153, 310, textureX, textureY); // Box 195
		headModel[17] = new ModelRendererTurbo(this, 119, 308, textureX, textureY); // Box 196
		headModel[18] = new ModelRendererTurbo(this, 156, 285, textureX, textureY); // Box 205
		headModel[19] = new ModelRendererTurbo(this, 179, 297, textureX, textureY); // Box 206
		headModel[20] = new ModelRendererTurbo(this, 321, 139, textureX, textureY); // Box 207
		headModel[21] = new ModelRendererTurbo(this, 245, 114, textureX, textureY); // Box 208
		headModel[22] = new ModelRendererTurbo(this, 140, 300, textureX, textureY); // Box 209
		headModel[23] = new ModelRendererTurbo(this, 167, 323, textureX, textureY); // Box 210
		headModel[24] = new ModelRendererTurbo(this, 321, 139, textureX, textureY); // Box 211
		headModel[25] = new ModelRendererTurbo(this, 321, 139, textureX, textureY); // Box 230
		headModel[26] = new ModelRendererTurbo(this, 321, 139, textureX, textureY); // Box 231
		headModel[27] = new ModelRendererTurbo(this, 321, 139, textureX, textureY); // Box 232
		headModel[28] = new ModelRendererTurbo(this, 321, 139, textureX, textureY); // Box 233
		headModel[29] = new ModelRendererTurbo(this, 474, 430, textureX, textureY); // Box 176
		headModel[30] = new ModelRendererTurbo(this, 426, 433, textureX, textureY); // Box 177
		headModel[31] = new ModelRendererTurbo(this, 463, 424, textureX, textureY); // Box 179
		headModel[32] = new ModelRendererTurbo(this, 460, 429, textureX, textureY); // Box 180
		headModel[33] = new ModelRendererTurbo(this, 474, 430, textureX, textureY); // Box 182
		headModel[34] = new ModelRendererTurbo(this, 435, 429, textureX, textureY); // Box 183
		headModel[35] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 185
		headModel[36] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 186
		headModel[37] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 187
		headModel[38] = new ModelRendererTurbo(this, 435, 429, textureX, textureY); // Box 200
		headModel[39] = new ModelRendererTurbo(this, 265, 428, textureX, textureY); // Import Box11

		headModel[0].addShapeBox(-4.7F, -4.87F, -1.75F, 1, 1, 1, 0F,0.05F, -0.05F, -0.22F, 0F, -0.05F, -0.22F, 0F, -0.05F, -0.22F, 0.05F, -0.05F, -0.22F, 0.05F, -0.82F, -0.22F, 0F, -0.82F, -0.22F, 0F, -0.82F, -0.22F, 0.05F, -0.82F, -0.22F); // Box 138
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4.7F, -4.99F, -1.75F, 1, 1, 1, 0F,0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0.05F, -0.82F, -0.22F, 0F, -0.82F, -0.22F, 0F, -0.8F, -0.22F, 0.05F, -0.82F, -0.22F); // Box 139
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4.7F, -5.51F, -1.75F, 1, 1, 1, 0F,0.05F, -0.82F, -0.22F, 0F, -0.82F, -0.22F, 0F, -0.8F, -0.22F, 0.05F, -0.82F, -0.22F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F); // Box 140
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(3.25F, -5.97F, -0.85F, 1, 1, 1, 0F,0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0.05F, -0.82F, -0.22F, 0F, -0.82F, -0.22F, 0F, -0.8F, -0.22F, 0.05F, -0.82F, -0.22F); // Box 141
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(3.25F, -6.8F, -0.85F, 1, 1, 1, 0F,0.05F, 0F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, 0.05F, 0F, -0.22F, 0.05F, -0.82F, -0.22F, 0F, -0.82F, -0.22F, 0F, -0.8F, -0.22F, 0.05F, -0.82F, -0.22F); // Box 142
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(3.25F, -6.45F, -0.85F, 1, 1, 1, 0F,0.05F, -0.82F, -0.22F, 0F, -0.82F, -0.22F, 0F, -0.8F, -0.22F, 0.05F, -0.82F, -0.22F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F); // Box 143
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4F, -5F, -1.6F, 4, 5, 1, 0F,0.05F, 0F, -0.4F, 0.05F, 0F, -0.4F, 0.05F, 0F, -0.2F, 0.05F, 0F, -0.2F, 0.05F, 0.05F, 2.2F, 0F, 0.2F, 2.2F, 0F, 0.2F, -2.8F, 0.05F, 0.05F, -2.8F); // Box 200
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(0F, -5F, -1.6F, 4, 5, 1, 0F,0.05F, 0F, -0.4F, 0.05F, 0F, -0.4F, 0.05F, 0F, -0.2F, 0.05F, 0F, -0.2F, 0F, 0.2F, 2.2F, 0.05F, 0.05F, 2.2F, 0.05F, 0.05F, -2.8F, 0F, 0.2F, -2.8F); // Box 203
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-4F, -8F, -4F, 8, 1, 8, 0F,0.2F, 0.02F, 0.4F, 0.2F, 0.02F, 0.4F, 0.2F, 0.02F, 0F, 0.2F, 0.02F, 0F, 0.2F, -0.6F, 0.4F, 0.2F, -0.6F, 0.4F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F); // Box 179
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-4F, -8F, -6F, 8, 1, 2, 0F,-2.4F, 0F, -1.4F, -2.4F, 0F, -1.4F, 0F, 0F, 0F, 0F, 0F, 0F, -2.4F, -0.25F, -1.4F, -2.4F, -0.25F, -1.4F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 184
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-4F, -8F, 4F, 8, 1, 2, 0F,0F, 0.02F, 0F, 0F, 0.02F, 0F, -2.4F, 0.02F, -1.4F, -2.4F, 0.02F, -1.4F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -2.4F, -0.25F, -1.4F, -2.4F, -0.25F, -1.4F); // Box 185
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-6F, -8F, -4F, 2, 1, 8, 0F,-1.4F, 0F, -2.4F, 0F, 0F, 0F, 0F, 0F, 0F, -1.4F, 0F, -2.4F, -1.4F, -0.25F, -2.4F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.4F, -0.25F, -2.4F); // Box 186
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(4F, -8F, -4F, 2, 1, 8, 0F,0F, 0.02F, 0F, -1.4F, 0.02F, -2.4F, -1.4F, 0.02F, -2.4F, 0F, 0.02F, 0F, 0F, -0.25F, 0F, -1.4F, -0.25F, -2.4F, -1.4F, -0.25F, -2.4F, 0F, -0.25F, 0F); // Box 187
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-4F, -7.25F, -6F, 8, 1, 2, 0F,-2.4F, 0F, -1.4F, -2.4F, 0F, -1.4F, 0F, 0F, 0F, 0F, 0F, 0F, -2.4F, -0.25F, -1.4F, -2.4F, -0.25F, -1.4F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 192
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-4F, -6.5F, -6F, 8, 1, 2, 0F,-2.4F, 0F, -1.4F, -2.4F, 0F, -1.4F, 0F, 0F, 0F, 0F, 0F, 0F, -2.4F, -0.25F, -1.4F, -2.4F, -0.25F, -1.4F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 193
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-4F, -5.75F, -6F, 8, 1, 2, 0F,-2.4F, 0F, -1.4F, -2.4F, 0F, -1.4F, 0F, 0F, 0F, 0F, 0F, 0F, -2.4F, -0.25F, -1.4F, -2.4F, -0.25F, -1.4F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 194
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-6F, -7.25F, -4F, 2, 1, 8, 0F,-1.4F, 0F, -2.4F, 0F, 0F, 0F, 0F, 0F, 0F, -1.4F, 0F, -2.4F, -1.4F, -0.25F, -2.4F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.4F, -0.25F, -2.4F); // Box 195
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-6F, -6.5F, -4F, 2, 1, 8, 0F,-1.4F, 0F, -2.4F, 0F, 0F, 0F, 0F, 0F, 0F, -1.4F, 0F, -2.4F, -1.4F, -0.25F, -2.4F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.4F, -0.25F, -2.4F); // Box 196
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(4F, -7.25F, -4F, 2, 1, 8, 0F,0F, 0F, 0F, -1.4F, 0F, -2.4F, -1.4F, 0F, -2.4F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1.4F, -0.25F, -2.4F, -1.4F, -0.25F, -2.4F, 0F, -0.25F, 0F); // Box 205
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(4F, -6.5F, -4F, 2, 1, 8, 0F,0F, 0F, 0F, -1.4F, 0F, -2.4F, -1.4F, 0F, -2.4F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1.4F, -0.25F, -2.4F, -1.4F, -0.25F, -2.4F, 0F, -0.25F, 0F); // Box 206
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(4F, -5.75F, -4F, 2, 1, 8, 0F,0F, 0F, 0F, -1.4F, 0F, -2.4F, -1.4F, 0F, -2.4F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1.4F, -0.25F, -2.4F, -1.4F, -0.25F, -2.4F, 0F, -0.25F, 0F); // Box 207
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(-6F, -5.75F, -4F, 2, 1, 8, 0F,-1.4F, 0F, -2.4F, 0F, 0F, 0F, 0F, 0F, 0F, -1.4F, 0F, -2.4F, -1.4F, -0.25F, -2.4F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.4F, -0.25F, -2.4F); // Box 208
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(-4F, -7.25F, 4F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2.4F, 0F, -1.4F, -2.4F, 0F, -1.4F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -2.4F, -0.25F, -1.4F, -2.4F, -0.25F, -1.4F); // Box 209
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(-4F, -6.5F, 4F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2.4F, 0F, -1.4F, -2.4F, 0F, -1.4F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -2.4F, -0.25F, -1.4F, -2.4F, -0.25F, -1.4F); // Box 210
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(-4F, -5.75F, 4F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2.4F, 0F, -1.4F, -2.4F, 0F, -1.4F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -2.4F, -0.25F, -1.4F, -2.4F, -0.25F, -1.4F); // Box 211
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(-4F, -8F, -6.4F, 8, 1, 2, 0F,-2.2F, 0.02F, -1.5F, -2.2F, 0.02F, -1.5F, 0.2F, 0.02F, 0F, 0.2F, 0.02F, 0F, -2.2F, -0.55F, -1.5F, -2.2F, -0.55F, -1.5F, 0.2F, -0.55F, 0F, 0.2F, -0.55F, 0F); // Box 230
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(-6.2F, -8F, -4.2F, 2, 1, 8, 0F,-1.2F, 0.02F, -2.2F, 0F, 0.02F, 0.2F, 0F, 0.02F, 0.2F, -1.2F, 0.02F, -2.2F, -1.2F, -0.55F, -2.2F, 0F, -0.55F, 0.2F, 0F, -0.55F, 0.2F, -1.2F, -0.55F, -2.2F); // Box 231
		headModel[26].setRotationPoint(0F, 0F, 0F);

		headModel[27].addShapeBox(-4F, -8F, 4F, 8, 1, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, -2.2F, 0F, -1.2F, -2.2F, 0F, -1.2F, 0.2F, -0.55F, 0F, 0.2F, -0.55F, 0F, -2.2F, -0.55F, -1.2F, -2.2F, -0.55F, -1.2F); // Box 232
		headModel[27].setRotationPoint(0F, 0F, 0F);

		headModel[28].addShapeBox(4.2F, -8F, -4.2F, 2, 1, 8, 0F,0F, 0F, 0.2F, -1.2F, 0F, -2.2F, -1.2F, 0F, -2.2F, 0F, 0F, 0.2F, 0F, -0.55F, 0.2F, -1.2F, -0.55F, -2.2F, -1.2F, -0.55F, -2.2F, 0F, -0.55F, 0.2F); // Box 233
		headModel[28].setRotationPoint(0F, 0F, 0F);

		headModel[29].addShapeBox(-6.2F, -5F, -4.2F, 2, 1, 8, 0F,-1.5F, 0F, -2.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -1.5F, 0F, -2.2F, -1.5F, -0.5F, -2.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, -1.5F, -0.5F, -2.2F); // Box 176
		headModel[29].setRotationPoint(0F, 0F, 0F);

		headModel[30].addShapeBox(-4F, -5F, 4F, 8, 1, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, -2.2F, 0F, -1.4F, -2.2F, 0F, -1.4F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, -2.2F, -0.5F, -1.4F, -2.2F, -0.5F, -1.4F); // Box 177
		headModel[30].setRotationPoint(0F, 0F, 0F);

		headModel[31].addShapeBox(-4F, -5F, -6.4F, 8, 1, 2, 0F,-2.2F, 0F, -1.2F, -2.2F, 0F, -1.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -2.2F, -0.5F, -1.2F, -2.2F, -0.5F, -1.2F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F); // Box 179
		headModel[31].setRotationPoint(0F, 0F, 0F);

		headModel[32].addShapeBox(-4F, -5F, -4F, 8, 1, 8, 0F,0.2F, 0F, 0.4F, 0.2F, 0F, 0.4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.55F, 0.4F, 0.2F, -0.55F, 0.4F, 0.2F, -0.55F, 0F, 0.2F, -0.55F, 0F); // Box 180
		headModel[32].setRotationPoint(0F, 0F, 0F);

		headModel[33].addShapeBox(4.2F, -5F, -4.2F, 2, 1, 8, 0F,0F, 0F, 0.2F, -1.5F, 0F, -2.2F, -1.5F, 0F, -2.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, -1.5F, -0.5F, -2.2F, -1.5F, -0.5F, -2.2F, 0F, -0.5F, 0.2F); // Box 182
		headModel[33].setRotationPoint(0F, 0F, 0F);

		headModel[34].addShapeBox(-4F, -5.2F, -6F, 4, 1, 2, 0F,-0.45F, -0.4F, -0.7F, 0F, -0.4F, -0.1F, 0F, -0.2F, -1.2F, 0.2F, -0.2F, -0.4F, -0.45F, -0.3F, -0.5F, 0F, -0.2F, 0.2F, 0F, -0.3F, 0F, 0.25F, -0.4F, -0.45F); // Box 183
		headModel[34].setRotationPoint(0F, 0F, 0F);

		headModel[35].addShapeBox(3.7F, -4.99F, -1.75F, 1, 1, 1, 0F,0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, -0.82F, -0.22F, 0.05F, -0.82F, -0.22F, 0.05F, -0.82F, -0.22F, 0F, -0.82F, -0.22F); // Box 185
		headModel[35].setRotationPoint(0F, 0F, 0F);

		headModel[36].addShapeBox(3.7F, -4.87F, -1.75F, 1, 1, 1, 0F,0F, -0.05F, -0.22F, 0.05F, -0.05F, -0.22F, 0.05F, -0.05F, -0.22F, 0F, -0.05F, -0.22F, 0F, -0.82F, -0.22F, 0.05F, -0.82F, -0.22F, 0.05F, -0.82F, -0.22F, 0F, -0.82F, -0.22F); // Box 186
		headModel[36].setRotationPoint(0F, 0F, 0F);

		headModel[37].addShapeBox(3.7F, -5.51F, -1.75F, 1, 1, 1, 0F,0F, -0.82F, -0.22F, 0.05F, -0.82F, -0.22F, 0.05F, -0.82F, -0.22F, 0F, -0.8F, -0.22F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F); // Box 187
		headModel[37].setRotationPoint(0F, 0F, 0F);

		headModel[38].addShapeBox(0F, -5.2F, -6F, 4, 1, 2, 0F,0F, -0.4F, -0.1F, -0.45F, -0.4F, -0.7F, 0.2F, -0.2F, -0.4F, 0F, -0.2F, -1.2F, 0F, -0.2F, 0.2F, -0.45F, -0.3F, -0.5F, 0.25F, -0.4F, -0.45F, 0F, -0.3F, 0F); // Box 200
		headModel[38].setRotationPoint(0F, 0F, 0F);

		headModel[39].addShapeBox(-22.5F, -28F, -4.96F, 45, 43, 1, 0F,-23.2F, -20.8F, -0.3F, -23.2F, -20.8F, -0.3F, -23.2F, -20.8F, 0F, -23.2F, -20.8F, 0F, -23.2F, -20.8F, -0.3F, -23.2F, -20.8F, -0.3F, -23.2F, -20.8F, 0F, -23.2F, -20.8F, 0F); // Import Box11
		headModel[39].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 253, 193, textureX, textureY); // Box 105
		bodyModel[1] = new ModelRendererTurbo(this, 426, 132, textureX, textureY); // Box 111
		bodyModel[2] = new ModelRendererTurbo(this, 282, 382, textureX, textureY); // Box 112
		bodyModel[3] = new ModelRendererTurbo(this, 418, 102, textureX, textureY); // Box 112
		bodyModel[4] = new ModelRendererTurbo(this, 287, 380, textureX, textureY); // Box 113
		bodyModel[5] = new ModelRendererTurbo(this, 496, 7, textureX, textureY); // Box 114
		bodyModel[6] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 116
		bodyModel[7] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 118
		bodyModel[8] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 118
		bodyModel[9] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 119
		bodyModel[10] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 120
		bodyModel[11] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 120
		bodyModel[12] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 121
		bodyModel[13] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 122
		bodyModel[14] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 123
		bodyModel[15] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 125
		bodyModel[16] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 126
		bodyModel[17] = new ModelRendererTurbo(this, 308, 387, textureX, textureY); // Box 129
		bodyModel[18] = new ModelRendererTurbo(this, 333, 389, textureX, textureY); // Box 130
		bodyModel[19] = new ModelRendererTurbo(this, 345, 387, textureX, textureY); // Box 131
		bodyModel[20] = new ModelRendererTurbo(this, 339, 16, textureX, textureY); // Box 138
		bodyModel[21] = new ModelRendererTurbo(this, 58, 294, textureX, textureY); // Box 140
		bodyModel[22] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 154
		bodyModel[23] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 155
		bodyModel[24] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 156
		bodyModel[25] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 159
		bodyModel[26] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 165
		bodyModel[27] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 166
		bodyModel[28] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 167
		bodyModel[29] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 168
		bodyModel[30] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 169
		bodyModel[31] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 172
		bodyModel[32] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 173
		bodyModel[33] = new ModelRendererTurbo(this, 320, 388, textureX, textureY); // Box 176
		bodyModel[34] = new ModelRendererTurbo(this, 314, 396, textureX, textureY); // Box 177
		bodyModel[35] = new ModelRendererTurbo(this, 331, 396, textureX, textureY); // Box 178
		bodyModel[36] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 71
		bodyModel[37] = new ModelRendererTurbo(this, 106, 113, textureX, textureY); // Box 72
		bodyModel[38] = new ModelRendererTurbo(this, 281, 387, textureX, textureY); // Box 78
		bodyModel[39] = new ModelRendererTurbo(this, 291, 388, textureX, textureY); // Box 79
		bodyModel[40] = new ModelRendererTurbo(this, 328, 1, textureX, textureY); // Box 80
		bodyModel[41] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 81
		bodyModel[42] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 82
		bodyModel[43] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 83
		bodyModel[44] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 84
		bodyModel[45] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 85
		bodyModel[46] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 86
		bodyModel[47] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 87
		bodyModel[48] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 88
		bodyModel[49] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 90
		bodyModel[50] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 91
		bodyModel[51] = new ModelRendererTurbo(this, 437, 396, textureX, textureY); // Box 91
		bodyModel[52] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 92
		bodyModel[53] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 93
		bodyModel[54] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 94
		bodyModel[55] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 95
		bodyModel[56] = new ModelRendererTurbo(this, 450, 479, textureX, textureY); // Box 97
		bodyModel[57] = new ModelRendererTurbo(this, 465, 486, textureX, textureY); // Box 98
		bodyModel[58] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 133
		bodyModel[59] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 135
		bodyModel[60] = new ModelRendererTurbo(this, 339, 16, textureX, textureY); // Box 136
		bodyModel[61] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 142
		bodyModel[62] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 143
		bodyModel[63] = new ModelRendererTurbo(this, 506, 1, textureX, textureY); // Box 144
		bodyModel[64] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 145
		bodyModel[65] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 146
		bodyModel[66] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 147
		bodyModel[67] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 148
		bodyModel[68] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 149
		bodyModel[69] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 150
		bodyModel[70] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 151
		bodyModel[71] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 152
		bodyModel[72] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 153
		bodyModel[73] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 154
		bodyModel[74] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 155
		bodyModel[75] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 156
		bodyModel[76] = new ModelRendererTurbo(this, 426, 218, textureX, textureY); // Box 160
		bodyModel[77] = new ModelRendererTurbo(this, 412, 214, textureX, textureY); // Box 162
		bodyModel[78] = new ModelRendererTurbo(this, 303, 205, textureX, textureY); // Box 164
		bodyModel[79] = new ModelRendererTurbo(this, 281, 201, textureX, textureY); // Box 165
		bodyModel[80] = new ModelRendererTurbo(this, 429, 487, textureX, textureY); // Box 168
		bodyModel[81] = new ModelRendererTurbo(this, 97, 116, textureX, textureY); // Box 169
		bodyModel[82] = new ModelRendererTurbo(this, 135, 80, textureX, textureY); // Box 170
		bodyModel[83] = new ModelRendererTurbo(this, 124, 297, textureX, textureY); // Box 171
		bodyModel[84] = new ModelRendererTurbo(this, 392, 296, textureX, textureY); // Box 175
		bodyModel[85] = new ModelRendererTurbo(this, 418, 290, textureX, textureY); // Box 176
		bodyModel[86] = new ModelRendererTurbo(this, 390, 312, textureX, textureY); // Box 177
		bodyModel[87] = new ModelRendererTurbo(this, 412, 319, textureX, textureY); // Box 178
		bodyModel[88] = new ModelRendererTurbo(this, 438, 328, textureX, textureY); // Box 179
		bodyModel[89] = new ModelRendererTurbo(this, 473, 466, textureX, textureY); // Box 180
		bodyModel[90] = new ModelRendererTurbo(this, 373, 331, textureX, textureY); // Box 181
		bodyModel[91] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 182
		bodyModel[92] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 183
		bodyModel[93] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 184
		bodyModel[94] = new ModelRendererTurbo(this, 424, 462, textureX, textureY); // Box 185
		bodyModel[95] = new ModelRendererTurbo(this, 420, 477, textureX, textureY); // Box 186
		bodyModel[96] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 188
		bodyModel[97] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 192
		bodyModel[98] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 193
		bodyModel[99] = new ModelRendererTurbo(this, 467, 208, textureX, textureY); // Box 204
		bodyModel[100] = new ModelRendererTurbo(this, 437, 219, textureX, textureY); // Box 205
		bodyModel[101] = new ModelRendererTurbo(this, 457, 201, textureX, textureY); // Box 207
		bodyModel[102] = new ModelRendererTurbo(this, 423, 213, textureX, textureY); // Box 208
		bodyModel[103] = new ModelRendererTurbo(this, 445, 227, textureX, textureY); // Box 209
		bodyModel[104] = new ModelRendererTurbo(this, 462, 240, textureX, textureY); // Box 210
		bodyModel[105] = new ModelRendererTurbo(this, 436, 335, textureX, textureY); // Box 211
		bodyModel[106] = new ModelRendererTurbo(this, 376, 230, textureX, textureY); // Box 212
		bodyModel[107] = new ModelRendererTurbo(this, 208, 102, textureX, textureY); // Box 175
		bodyModel[108] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 177
		bodyModel[109] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 178
		bodyModel[110] = new ModelRendererTurbo(this, 206, 330, textureX, textureY); // Box 157
		bodyModel[111] = new ModelRendererTurbo(this, 206, 330, textureX, textureY); // Box 189
		bodyModel[112] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 190

		bodyModel[0].addShapeBox(-3F, 1F, -3.07F, 1, 8, 1, 0F,-5.3F, 0.95F, -0.4F, 5.4F, 0.95F, -0.33F, 5.4F, 0.95F, 0F, -5.4F, 0.95F, 0F, 1F, 0F, -0.35F, -1.1F, 0F, -0.35F, -1.1F, 0F, 0F, 1.2F, 0F, 0F); // Box 105
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 8.3F, -3F, 3, 1, 2, 0F,0.05F, 0F, -0.2F, -0.15F, 0F, 0.05F, -0.2F, 0F, 0F, 0F, 0F, -0.3F, 0.05F, 0F, -0.15F, -0.15F, 0F, 0.15F, -0.2F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 111
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4.5F, 8.03F, 2.2F, 2, 1, 2, 0F,-0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[2].setRotationPoint(0F, 0F, 0F);
		bodyModel[2].rotateAngleX = -0.01745329F;

		bodyModel[3].addShapeBox(1F, 8.3F, -3F, 3, 1, 2, 0F,-0.15F, 0F, 0.05F, 0.05F, 0F, -0.2F, 0F, 0F, -0.3F, -0.2F, 0F, 0F, -0.15F, 0F, 0.15F, 0.05F, 0F, -0.15F, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F); // Box 112
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4.5F, 11.03F, 2.2F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F); // Box 113
		bodyModel[4].setRotationPoint(0F, 0F, 0F);
		bodyModel[4].rotateAngleX = -0.01745329F;

		bodyModel[5].addShapeBox(-4F, 7.5F, 2.7F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[5].setRotationPoint(0F, 0F, 0F);
		bodyModel[5].rotateAngleX = -0.01745329F;

		bodyModel[6].addShapeBox(-4F, 2F, -2.65F, 2, 7, 1, 0F,0F, 0F, -0.45F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.25F, 0F, 0F, -0.15F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 116
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-2F, 2F, -2.65F, 2, 9, 1, 0F,0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 118
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-3.5F, 10.03F, 3.15F, 1, 1, 1, 0F,-0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 118
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-3.5F, 10.2F, 3.15F, 1, 1, 1, 0F,-0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 119
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-3.5F, 9.55F, 3.15F, 1, 1, 1, 0F,-0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Box 120
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(0F, 2F, -2.65F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 120
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(2F, 2F, -2.65F, 2, 7, 1, 0F,0F, 0F, -0.15F, 0F, 0F, -0.45F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.25F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 121
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-4F, 1F, -2.65F, 2, 1, 1, 0F,0F, 1F, -0.45F, 0F, 0.9F, -0.15F, 0F, 0.9F, 0F, 0F, 1F, -0.3F, 0F, 0F, -0.45F, 0F, 0F, -0.15F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 122
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(2F, 1F, -2.65F, 2, 1, 1, 0F,0F, 0.9F, -0.15F, 0F, 1F, -0.45F, 0F, 1F, -0.3F, 0F, 0.9F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.45F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 123
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-2F, 1F, -2.65F, 2, 1, 1, 0F,0F, 0.9F, -0.15F, 0F, -0.1F, 0F, 0F, -0.1F, -0.3F, 0F, 0.9F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 125
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(0F, 1F, -2.65F, 2, 1, 1, 0F,0F, -0.1F, -0.05F, 0F, 0.9F, -0.15F, 0F, 0.9F, 0F, 0F, -0.1F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 126
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-2F, 8.9F, 1.53F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0.2F, 0.05F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.2F, 0.05F, 0F, 0.05F); // Box 129
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(0F, 8.8F, -2.65F, 2, 1, 1, 0F,0F, 0F, 0.2F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0.2F, 0.05F, 0F, 0.05F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 130
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(2F, 8.8F, -2.67F, 2, 1, 5, 0F,0.05F, 0F, 0F, 0.2F, 0F, -0.15F, 0.2F, 0F, -0.1F, 0F, 0F, 0F, 0.05F, 0F, 0.05F, 0.25F, 0F, -0.15F, 0.25F, 0F, -0.1F, 0F, 0F, -0.3F); // Box 131
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-4F, 9F, -2.63F, 2, 5, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.15F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.75F, 2F, -0.05F, 0F, 0.8F, -0.15F, 0F, 0.8F, -0.3F, 0.75F, 2.05F, -0.7F); // Box 138
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-2F, 1F, -2.75F, 2, 1, 1, 0F,-1F, 1F, -0.15F, 0F, 0.3F, 0F, 0F, -0.1F, -0.3F, -0.4F, 1F, 0F, 0.2F, -2F, -0.15F, 0F, -0.6F, 0F, 0F, 0F, -0.3F, 0.2F, -2F, -0.15F); // Box 140
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addBox(-3F, -0.01F, -2F, 1, 1, 4, 0F); // Box 154
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addBox(2F, -0.01F, -2F, 1, 1, 4, 0F); // Box 155
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addBox(-2F, 0.99F, -1F, 4, 1, 3, 0F); // Box 156
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-2.5F, 2.2F, -2.65F, 1, 1, 1, 0F,-0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 159
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-4F, 1F, 1.5F, 2, 1, 1, 0F,0F, 1F, -0.3F, 0F, 0.8F, 0F, 0F, 0.8F, -0.15F, 0F, 1F, -0.45F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.15F, 0F, 0F, -0.45F); // Box 165
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(2F, 1F, 1.5F, 2, 1, 1, 0F,0F, 0.8F, 0F, 0F, 1F, -0.3F, 0F, 1F, -0.45F, 0F, 0.8F, -0.15F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.45F, 0F, 0F, -0.15F); // Box 166
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(0F, 1F, 1.5F, 2, 1, 1, 0F,0F, 0.7F, -0.3F, 0F, 0.8F, 0F, 0F, 0.8F, -0.15F, 0F, 0.7F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.15F, 0F, 0F, 0F); // Box 167
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-2F, 1F, 1.5F, 2, 1, 1, 0F,0F, 0.8F, 0F, 0F, 0.7F, -0.3F, 0F, 0.7F, 0F, 0F, 0.8F, -0.15F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.15F); // Box 168
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(-4F, 2F, 1.5F, 2, 7, 1, 0F,0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.45F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.15F, 0F, 0F, -0.25F); // Box 169
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(2F, 2F, 1.5F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.45F, 0F, 0F, -0.15F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.25F, 0F, 0F, -0.15F); // Box 172
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-4F, 9F, 1.5F, 2, 9, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.15F, 0F, 0F, -0.25F, 0.4F, -1.5F, -0.6F, 0F, 0.05F, -0.6F, 0F, 0.5F, 0.25F, 0.7F, -1.1F, 0.25F); // Box 173
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(-2F, 8.8F, -2.65F, 2, 1, 1, 0F,0.05F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0.05F, 0F, 0.05F, 0F, 0F, 0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 176
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(2.1F, 8.8F, 1.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.3F, 0.15F, 0F, -0.15F, 0.05F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.15F, 0F, -0.15F, 0.05F, 0F, 0.05F); // Box 177
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(0F, 8.9F, 1.53F, 2, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.05F, 0F, 0.05F, 0F, 0F, 0.2F); // Box 178
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addBox(-3.5F, 1.4F, -2F, 7, 1, 3, 0F); // Box 71
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-4F, 8.99F, -2F, 1, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, -1F, 0.4F, 0F, -1.8F, 0F, 0F, -1.8F, 0.4F, 0.7F, -0.15F, 0.7F); // Box 72
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-4F, 8.8F, 1.53F, 2, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.15F, 0F, -0.15F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.05F, 0F, 0.05F, 0.15F, 0F, -0.15F); // Box 78
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(-4F, 8.8F, -2.65F, 2, 1, 5, 0F,0.2F, 0F, -0.15F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, -0.1F, 0.25F, 0F, -0.15F, 0.05F, 0F, 0.05F, 0F, 0F, -0.3F, 0.25F, 0F, -0.1F); // Box 79
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(-2F, 11F, -2.63F, 2, 3, 1, 0F,0F, 0F, -0.15F, -0.9F, 0F, 0F, -0.9F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.8F, -0.15F, -0.55F, 0.1F, 0F, -0.55F, 0.1F, -0.3F, 0F, 0.8F, 0F); // Box 80
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(0.1F, 10F, -2.75F, 2, 4, 1, 0F,0.3F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.59F, 0F, 0F, 0F, 0.8F, -0.15F, 0F, 0.8F, 0F, 0.59F, 0F, -0.3F); // Box 81
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(-2.5F, 1.55F, -2.65F, 1, 1, 1, 0F,-0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Box 82
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(-2.5F, 2.03F, -2.65F, 1, 1, 1, 0F,-0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 83
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(-2.5F, 3.53F, -2.65F, 1, 1, 1, 0F,-0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 84
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(-2.5F, 5.03F, -2.65F, 1, 1, 1, 0F,-0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 85
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(-2.5F, 6.53F, -2.65F, 1, 1, 1, 0F,-0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 86
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(-2.5F, 8.03F, -2.65F, 1, 1, 1, 0F,-0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 87
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(-2.5F, 3.7F, -2.65F, 1, 1, 1, 0F,-0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 88
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(-2.5F, 5.2F, -2.65F, 1, 1, 1, 0F,-0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 90
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(-2.5F, 8.2F, -2.65F, 1, 1, 1, 0F,-0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 91
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addBox(-4.5F, 9.03F, 2.2F, 2, 2, 2, 0F); // Box 91
		bodyModel[51].setRotationPoint(0F, 0F, 0F);
		bodyModel[51].rotateAngleX = -0.01745329F;

		bodyModel[52].addShapeBox(-2.5F, 4.55F, -2.65F, 1, 1, 1, 0F,-0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Box 92
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(-2.5F, 7.55F, -2.65F, 1, 1, 1, 0F,-0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Box 93
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(-2.5F, 3.05F, -2.65F, 1, 1, 1, 0F,-0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Box 94
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(-2.5F, 6.05F, -2.65F, 1, 1, 1, 0F,-0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Box 95
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addShapeBox(-3.6F, 8.8F, -2.85F, 2, 2, 1, 0F,0.3F, 0F, -0.1F, 0.3F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0.3F, 0F, -0.15F, 0.3F, 0F, 0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 97
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addShapeBox(1.6F, 8.8F, -2.8F, 2, 2, 1, 0F,0.3F, 0F, 0.2F, 0.3F, 0F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0.3F, 0F, 0.2F, 0.3F, 0F, -0.15F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 98
		bodyModel[57].setRotationPoint(0F, 0F, 0F);

		bodyModel[58].addShapeBox(-2.5F, 6.7F, -2.65F, 1, 1, 1, 0F,-0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 133
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addShapeBox(-2F, 2F, 1.5F, 2, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, -0.05F, -0.55F, 0F, -0.4F, -0.6F, 0F, -0.4F, 0F, 0F, 0.55F, 0.25F); // Box 135
		bodyModel[59].setRotationPoint(0F, 0F, 0F);

		bodyModel[60].addShapeBox(2.1F, 9F, -2.75F, 2, 5, 1, 0F,0F, 0F, -0.15F, 0F, 0F, -0.25F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.8F, -0.15F, 0.75F, 2F, -0.05F, 0.75F, 2.05F, -0.6F, 0F, 0.8F, -0.2F); // Box 136
		bodyModel[60].setRotationPoint(0F, 0F, 0F);

		bodyModel[61].addShapeBox(1.5F, 2.03F, -2.65F, 1, 1, 1, 0F,-0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 142
		bodyModel[61].setRotationPoint(0F, 0F, 0F);

		bodyModel[62].addShapeBox(1.5F, 2.2F, -2.65F, 1, 1, 1, 0F,-0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 143
		bodyModel[62].setRotationPoint(0F, 0F, 0F);

		bodyModel[63].addShapeBox(1.5F, 1.55F, -2.65F, 1, 1, 1, 0F,-0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Box 144
		bodyModel[63].setRotationPoint(0F, 0F, 0F);

		bodyModel[64].addShapeBox(1.5F, 3.53F, -2.65F, 1, 1, 1, 0F,-0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 145
		bodyModel[64].setRotationPoint(0F, 0F, 0F);

		bodyModel[65].addShapeBox(1.5F, 3.05F, -2.65F, 1, 1, 1, 0F,-0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Box 146
		bodyModel[65].setRotationPoint(0F, 0F, 0F);

		bodyModel[66].addShapeBox(1.5F, 3.7F, -2.65F, 1, 1, 1, 0F,-0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 147
		bodyModel[66].setRotationPoint(0F, 0F, 0F);

		bodyModel[67].addShapeBox(1.5F, 5.03F, -2.65F, 1, 1, 1, 0F,-0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 148
		bodyModel[67].setRotationPoint(0F, 0F, 0F);

		bodyModel[68].addShapeBox(1.5F, 5.2F, -2.65F, 1, 1, 1, 0F,-0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 149
		bodyModel[68].setRotationPoint(0F, 0F, 0F);

		bodyModel[69].addShapeBox(1.5F, 4.55F, -2.65F, 1, 1, 1, 0F,-0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Box 150
		bodyModel[69].setRotationPoint(0F, 0F, 0F);

		bodyModel[70].addShapeBox(1.5F, 6.53F, -2.65F, 1, 1, 1, 0F,-0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 151
		bodyModel[70].setRotationPoint(0F, 0F, 0F);

		bodyModel[71].addShapeBox(1.5F, 6.7F, -2.65F, 1, 1, 1, 0F,-0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 152
		bodyModel[71].setRotationPoint(0F, 0F, 0F);

		bodyModel[72].addShapeBox(1.5F, 8.03F, -2.65F, 1, 1, 1, 0F,-0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 153
		bodyModel[72].setRotationPoint(0F, 0F, 0F);

		bodyModel[73].addShapeBox(1.5F, 8.2F, -2.65F, 1, 1, 1, 0F,-0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 154
		bodyModel[73].setRotationPoint(0F, 0F, 0F);

		bodyModel[74].addShapeBox(1.5F, 7.55F, -2.65F, 1, 1, 1, 0F,-0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Box 155
		bodyModel[74].setRotationPoint(0F, 0F, 0F);

		bodyModel[75].addShapeBox(1.5F, 6.05F, -2.65F, 1, 1, 1, 0F,-0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Box 156
		bodyModel[75].setRotationPoint(0F, 0F, 0F);

		bodyModel[76].addShapeBox(2.5F, 1F, -3F, 1, 8, 1, 0F,-0.1F, 0.95F, -0.2F, -0.1F, 0.95F, -0.2F, -0.1F, 0.95F, -0.2F, -0.1F, 0.95F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 160
		bodyModel[76].setRotationPoint(0F, 0F, 0F);

		bodyModel[77].addShapeBox(-3.5F, 1F, -3F, 1, 8, 1, 0F,-0.1F, 0.95F, -0.2F, -0.1F, 0.95F, -0.2F, -0.1F, 0.95F, -0.2F, -0.1F, 0.95F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 162
		bodyModel[77].setRotationPoint(0F, 0F, 0F);

		bodyModel[78].addShapeBox(-3.5F, 1F, 1.6F, 1, 8, 1, 0F,-0.1F, 0.95F, -0.2F, -0.1F, 0.95F, -0.2F, -0.1F, 0.95F, -0.2F, -0.1F, 0.95F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 164
		bodyModel[78].setRotationPoint(0F, 0F, 0F);

		bodyModel[79].addShapeBox(2.5F, 1F, 1.6F, 1, 8, 1, 0F,-0.1F, 0.95F, -0.2F, -0.1F, 0.95F, -0.2F, -0.1F, 0.95F, -0.2F, -0.1F, 0.95F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 165
		bodyModel[79].setRotationPoint(0F, 0F, 0F);

		bodyModel[80].addShapeBox(-3F, 0.99F, 1.56F, 1, 8, 1, 0F,-5.3F, 0.95F, -0.4F, 5.4F, 0.95F, -0.4F, 5.4F, 0.95F, 0F, -5.4F, 0.95F, 0F, 0.75F, 0F, -0.35F, -0.7F, 0F, -0.35F, -0.7F, 0F, 0F, 0.75F, 0F, 0F); // Box 168
		bodyModel[80].setRotationPoint(0F, 0F, 0F);

		bodyModel[81].addShapeBox(3F, -0.01F, -2F, 1, 13, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0.4F, 0F, -0.15F, 0.4F, 0F, 0F, 0.4F); // Box 169
		bodyModel[81].setRotationPoint(0F, 0F, 0F);

		bodyModel[82].addShapeBox(-4F, -0.01F, -2F, 1, 13, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0.4F, 0F, -0.15F, 0.4F, 0F, 0F, 0.4F); // Box 170
		bodyModel[82].setRotationPoint(0F, 0F, 0F);

		bodyModel[83].addShapeBox(0F, 1F, -2.75F, 2, 1, 1, 0F,0F, 0.3F, 0F, -1F, 1F, -0.15F, -0.4F, 1F, 0F, 0F, -0.1F, -0.3F, 0F, -0.6F, 0F, 0.2F, -2F, -0.15F, 0.2F, -2F, -0.15F, 0F, 0F, -0.3F); // Box 171
		bodyModel[83].setRotationPoint(0F, 0F, 0F);

		bodyModel[84].addShapeBox(-3.5F, 0.99F, 2.6F, 7, 3, 3, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 175
		bodyModel[84].setRotationPoint(0F, 0F, 0F);

		bodyModel[85].addShapeBox(-3.5F, -0.01F, 2.6F, 7, 1, 3, 0F,-0.2F, -0.4F, -1.4F, -0.2F, -0.4F, -1.4F, -0.2F, -0.4F, -1.4F, -0.2F, -0.4F, -1.4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 176
		bodyModel[85].setRotationPoint(0F, 0F, 0F);

		bodyModel[86].addShapeBox(-3.5F, 1F, 5.6F, 7, 3, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -1.4F, -0.4F, -0.2F, -1.4F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -1.4F, -0.4F, -0.2F, -1.4F, -0.4F); // Box 177
		bodyModel[86].setRotationPoint(0F, 0F, 0F);

		bodyModel[87].addShapeBox(-3.5F, 3.99F, 2.6F, 7, 1, 3, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.4F, -1.4F, -0.2F, -0.4F, -1.4F, -0.2F, -0.4F, -1.4F, -0.2F, -0.4F, -1.4F); // Box 178
		bodyModel[87].setRotationPoint(0F, 0F, 0F);

		bodyModel[88].addShapeBox(-3.5F, 1F, 1.6F, 7, 3, 1, 0F,-0.2F, -1.4F, -0.4F, -0.2F, -1.4F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -1.4F, -0.4F, -0.2F, -1.4F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 179
		bodyModel[88].setRotationPoint(0F, 0F, 0F);

		bodyModel[89].addShapeBox(-3.5F, 4.3F, 2.1F, 7, 3, 3, 0F,-0.8F, 0.4F, -0.2F, -0.8F, 0.4F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, -1.4F, -0.2F, -0.8F, -1.4F, -0.2F, -0.8F, -1.2F, 0F, -0.8F, -1.2F, 0F); // Box 180
		bodyModel[89].setRotationPoint(0F, 0F, 0F);

		bodyModel[90].addShapeBox(-3.5F, 5.8F, 2F, 7, 5, 3, 0F,-1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, -1.2F, -0.2F, -1F, -1.2F, -0.2F, -1F, -1.2F, -0.2F, -1F, -1.2F, -0.2F); // Box 181
		bodyModel[90].setRotationPoint(0F, 0F, 0F);

		bodyModel[91].addShapeBox(-0.5F, 5.9F, 4.15F, 1, 1, 1, 0F,-0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 182
		bodyModel[91].setRotationPoint(0F, 0F, 0F);

		bodyModel[92].addShapeBox(-0.5F, 6.09F, 4.15F, 1, 1, 1, 0F,-0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 183
		bodyModel[92].setRotationPoint(0F, 0F, 0F);

		bodyModel[93].addShapeBox(-0.5F, 5.46F, 4.15F, 1, 1, 1, 0F,-0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Box 184
		bodyModel[93].setRotationPoint(0F, 0F, 0F);

		bodyModel[94].addShapeBox(-3F, 6.01F, 2.2F, 3, 5, 3, 0F,-1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, -1.2F, -0.2F, -1F, -1.2F, -0.2F, -1F, -1.2F, -0.2F, -1F, -1.2F, -0.2F); // Box 185
		bodyModel[94].setRotationPoint(0F, 0F, 0F);

		bodyModel[95].addShapeBox(0F, 6.01F, 2.2F, 3, 5, 3, 0F,-1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, -1.2F, -0.2F, -1F, -1.2F, -0.2F, -1F, -1.2F, -0.2F, -1F, -1.2F, -0.2F); // Box 186
		bodyModel[95].setRotationPoint(0F, 0F, 0F);

		bodyModel[96].addShapeBox(-4.5F, 10.2F, 3.15F, 1, 1, 1, 0F,-0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 188
		bodyModel[96].setRotationPoint(0F, 0F, 0F);

		bodyModel[97].addShapeBox(-4.5F, 9.55F, 3.15F, 1, 1, 1, 0F,-0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Box 192
		bodyModel[97].setRotationPoint(0F, 0F, 0F);

		bodyModel[98].addShapeBox(-4.5F, 10.03F, 3.15F, 1, 1, 1, 0F,-0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 193
		bodyModel[98].setRotationPoint(0F, 0F, 0F);

		bodyModel[99].addShapeBox(-2.5F, 1F, 5.6F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -1.4F, -0.2F, -0.2F, -1.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -1.4F, -0.2F, -0.2F, -1.4F, -0.2F); // Box 204
		bodyModel[99].setRotationPoint(0F, 0F, 0F);

		bodyModel[100].addShapeBox(-2.5F, 0.2F, 2.8F, 1, 1, 3, 0F,-0.2F, -0.15F, -1F, -0.2F, -0.15F, -1F, -0.2F, -0.15F, -1.4F, -0.2F, -0.15F, -1.4F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 205
		bodyModel[100].setRotationPoint(0F, 0F, 0F);

		bodyModel[101].addShapeBox(-2.5F, 3.8F, 2.8F, 1, 1, 3, 0F,-0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.15F, -1F, -0.2F, -0.15F, -1F, -0.2F, -0.15F, -1.4F, -0.2F, -0.15F, -1.4F); // Box 207
		bodyModel[101].setRotationPoint(0F, 0F, 0F);

		bodyModel[102].addShapeBox(1.5F, 0.2F, 2.8F, 1, 1, 3, 0F,-0.2F, -0.15F, -1F, -0.2F, -0.15F, -1F, -0.2F, -0.15F, -1.4F, -0.2F, -0.15F, -1.4F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 208
		bodyModel[102].setRotationPoint(0F, 0F, 0F);

		bodyModel[103].addShapeBox(1.5F, 1F, 5.6F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -1.4F, -0.2F, -0.2F, -1.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -1.4F, -0.2F, -0.2F, -1.4F, -0.2F); // Box 209
		bodyModel[103].setRotationPoint(0F, 0F, 0F);

		bodyModel[104].addShapeBox(1.5F, 3.8F, 2.8F, 1, 1, 3, 0F,-0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.15F, -1F, -0.2F, -0.15F, -1F, -0.2F, -0.15F, -1.4F, -0.2F, -0.15F, -1.4F); // Box 210
		bodyModel[104].setRotationPoint(0F, 0F, 0F);

		bodyModel[105].addShapeBox(-2.5F, 0.99F, 2.6F, 1, 3, 3, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F); // Box 211
		bodyModel[105].setRotationPoint(0F, 0F, 0F);

		bodyModel[106].addShapeBox(1.5F, 0.99F, 2.6F, 1, 3, 3, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F); // Box 212
		bodyModel[106].setRotationPoint(0F, 0F, 0F);

		bodyModel[107].addShapeBox(3F, 8.99F, -2F, 1, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.8F, 0F, 0.75F, -1F, 0.4F, 0.7F, -0.15F, 0.7F, 0F, -1.8F, 0.4F); // Box 175
		bodyModel[107].setRotationPoint(0F, 0F, 0F);

		bodyModel[108].addShapeBox(2F, 9F, 1.5F, 2, 9, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.25F, 0F, 0F, -0.15F, 0F, 0.05F, -0.6F, 0.4F, -1.5F, -0.6F, 0.7F, -1.1F, 0.25F, 0F, 0.5F, 0.25F); // Box 177
		bodyModel[108].setRotationPoint(0F, 0F, 0F);

		bodyModel[109].addShapeBox(0F, 2F, 1.5F, 2, 16, 1, 0F,0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, -0.4F, -0.6F, 0F, -0.05F, -0.55F, 0F, 0.55F, 0.25F, 0F, -0.4F, 0F); // Box 178
		bodyModel[109].setRotationPoint(0F, 0F, 0F);

		bodyModel[110].addShapeBox(-1.8F, 0.52F, -2.65F, 1, 9, 1, 0F,-0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F); // Box 157
		bodyModel[110].setRotationPoint(0F, 0F, 0F);

		bodyModel[111].addShapeBox(-0.8F, 9.26F, -2.65F, 1, 5, 1, 0F,0.35F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.15F, 0F, 0F, -0.25F, -0.2F, 0F, -0.65F, -0.2F, 0F, -0.65F, -0.2F, 0F, -0.25F, -0.2F, 0F); // Box 189
		bodyModel[111].setRotationPoint(0F, 0F, 0F);

		bodyModel[112].addShapeBox(-2.3F, 10F, -2.7F, 2, 1, 1, 0F,-1F, 0F, -0.15F, 0.3F, 0F, 0F, 0.3F, 0F, -0.3F, -1F, 0F, -0.3F, -1.6F, 1.7F, -0.15F, -0.15F, 3F, 0F, -0.15F, 3F, -0.3F, -1.6F, 1.7F, 0F); // Box 190
		bodyModel[112].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 381, 322, textureX, textureY); // Box 101
		leftArmModel[1] = new ModelRendererTurbo(this, -231, 120, textureX, textureY); // Box 69
		leftArmModel[2] = new ModelRendererTurbo(this, 129, 5, textureX, textureY); // Box 95
		leftArmModel[3] = new ModelRendererTurbo(this, -320, 233, textureX, textureY); // Box 198

		leftArmModel[0].addShapeBox(-1F, 5.6F, -2F, 4, 4, 4, 0F,0.07F, 0F, 0.15F, 0.07F, 0F, 0.15F, 0.07F, 0F, 0.15F, 0.07F, 0F, 0.15F, 0.07F, -0.5F, 0.15F, 0.07F, -0.5F, 0.15F, 0.07F, -0.5F, 0.15F, 0.07F, -0.5F, 0.15F); // Box 101
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, -2.01F, -2F, 4, 5, 4, 0F,0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F); // Box 69
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, 2.99F, -2F, 4, 5, 4, 0F,0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F); // Box 95
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addBox(-1.2F, -2.1F, -0.5F, 4, 1, 1, 0F); // Box 198
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 309, 100, textureX, textureY); // Box 151
		rightArmModel[1] = new ModelRendererTurbo(this, 18, 13, textureX, textureY); // Box 152
		rightArmModel[2] = new ModelRendererTurbo(this, 377, 301, textureX, textureY); // Box 153
		rightArmModel[3] = new ModelRendererTurbo(this, -318, 172, textureX, textureY); // Box 199

		rightArmModel[0].addShapeBox(-3F, -2.01F, -2F, 4, 5, 4, 0F,0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F); // Box 151
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 2.99F, -2F, 4, 5, 4, 0F,0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F); // Box 152
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, 5.6F, -2F, 4, 4, 4, 0F,0.07F, 0F, 0.15F, 0.07F, 0F, 0.15F, 0.07F, 0F, 0.15F, 0.07F, 0F, 0.15F, 0.07F, -0.5F, 0.15F, 0.07F, -0.5F, 0.15F, 0.07F, -0.5F, 0.15F, 0.07F, -0.5F, 0.15F); // Box 153
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addBox(-2.8F, -2.1F, -0.5F, 4, 1, 1, 0F); // Box 199
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 464, 433, textureX, textureY); // Box 107
		leftLegModel[1] = new ModelRendererTurbo(this, 440, 205, textureX, textureY); // Box 114
		leftLegModel[2] = new ModelRendererTurbo(this, 451, 456, textureX, textureY); // Box 78
		leftLegModel[3] = new ModelRendererTurbo(this, 386, 231, textureX, textureY); // Box 88
		leftLegModel[4] = new ModelRendererTurbo(this, 458, 219, textureX, textureY); // Box 176
		leftLegModel[5] = new ModelRendererTurbo(this, 468, 322, textureX, textureY); // Box 109
		leftLegModel[6] = new ModelRendererTurbo(this, 466, 333, textureX, textureY); // Box 204
		leftLegModel[7] = new ModelRendererTurbo(this, 473, 446, textureX, textureY); // Box 212
		leftLegModel[8] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 191
		leftLegModel[9] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 192
		leftLegModel[10] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 193
		leftLegModel[11] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 194
		leftLegModel[12] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 195
		leftLegModel[13] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 196
		leftLegModel[14] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 197
		leftLegModel[15] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 198
		leftLegModel[16] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 199

		leftLegModel[0].addShapeBox(-2F, 9F, -2.75F, 4, 1, 1, 0F,-0.5F, -0.5F, -0.55F, -0.5F, -0.5F, -0.55F, -0.5F, -0.4F, 1F, -0.5F, -0.4F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, -0.05F, 0F, -0.25F); // Box 107
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 6F, -2F, 4, 6, 4, 0F,0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F); // Box 114
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 10F, -2.75F, 4, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, -0.05F, 0F, -0.25F); // Box 78
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 6F, -2F, 4, 1, 4, 0F,0.08F, 0F, 0.08F, 0.08F, 0F, 0.08F, 0.08F, 0F, 0.08F, 0.08F, 0F, 0.08F, 0.08F, 0F, 0.08F, 0.08F, 0F, 0.08F, 0.08F, 0F, 0.08F, 0.08F, 0F, 0.08F); // Box 88
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addBox(-2F, -2F, -2F, 4, 8, 4, 0F); // Box 176
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-2F, -1F, -2F, 4, 5, 4, 0F,0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.45F, 0.5F, 0F, 0.55F, 0.5F, 0F, 0.55F, 0F, 0F, 0.15F); // Box 109
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);

		leftLegModel[6].addShapeBox(-2F, 4F, -2F, 4, 2, 4, 0F,0F, 0F, 0.45F, 0.5F, 0F, 0.55F, 0.5F, 0F, 0.55F, 0F, 0F, 0.15F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		leftLegModel[6].setRotationPoint(0F, 0F, 0F);

		leftLegModel[7].addShapeBox(-2F, 9.95F, 0.3F, 4, 2, 2, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 212
		leftLegModel[7].setRotationPoint(0F, 0F, 0F);

		leftLegModel[8].addShapeBox(1.25F, 8.82F, -0.85F, 1, 1, 1, 0F,0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, -0.82F, -0.22F, 0.05F, -0.82F, -0.22F, 0.05F, -0.82F, -0.22F, 0F, -0.82F, -0.22F); // Box 191
		leftLegModel[8].setRotationPoint(0F, 0F, 0F);

		leftLegModel[9].addShapeBox(1.25F, 9F, -0.85F, 1, 1, 1, 0F,0F, 0F, -0.22F, 0.05F, 0F, -0.22F, 0.05F, 0F, -0.22F, 0F, 0F, -0.22F, 0F, -0.82F, -0.22F, 0.05F, -0.82F, -0.22F, 0.05F, -0.82F, -0.22F, 0F, -0.8F, -0.22F); // Box 192
		leftLegModel[9].setRotationPoint(0F, 0F, 0F);

		leftLegModel[10].addShapeBox(1.25F, 8.35F, -0.85F, 1, 1, 1, 0F,0F, -0.82F, -0.22F, 0.05F, -0.82F, -0.22F, 0.05F, -0.82F, -0.22F, 0F, -0.8F, -0.22F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F); // Box 193
		leftLegModel[10].setRotationPoint(0F, 0F, 0F);

		leftLegModel[11].addShapeBox(1.25F, 9.82F, -0.85F, 1, 1, 1, 0F,0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, -0.82F, -0.22F, 0.05F, -0.82F, -0.22F, 0.05F, -0.82F, -0.22F, 0F, -0.82F, -0.22F); // Box 194
		leftLegModel[11].setRotationPoint(0F, 0F, 0F);

		leftLegModel[12].addShapeBox(1.25F, 10.82F, -0.85F, 1, 1, 1, 0F,0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, -0.82F, -0.22F, 0.05F, -0.82F, -0.22F, 0.05F, -0.82F, -0.22F, 0F, -0.82F, -0.22F); // Box 195
		leftLegModel[12].setRotationPoint(0F, 0F, 0F);

		leftLegModel[13].addShapeBox(1.25F, 10F, -0.85F, 1, 1, 1, 0F,0F, 0F, -0.22F, 0.05F, 0F, -0.22F, 0.05F, 0F, -0.22F, 0F, 0F, -0.22F, 0F, -0.82F, -0.22F, 0.05F, -0.82F, -0.22F, 0.05F, -0.82F, -0.22F, 0F, -0.8F, -0.22F); // Box 196
		leftLegModel[13].setRotationPoint(0F, 0F, 0F);

		leftLegModel[14].addShapeBox(1.25F, 11F, -0.85F, 1, 1, 1, 0F,0F, 0F, -0.22F, 0.05F, 0F, -0.22F, 0.05F, 0F, -0.22F, 0F, 0F, -0.22F, 0F, -0.82F, -0.22F, 0.05F, -0.82F, -0.22F, 0.05F, -0.82F, -0.22F, 0F, -0.8F, -0.22F); // Box 197
		leftLegModel[14].setRotationPoint(0F, 0F, 0F);

		leftLegModel[15].addShapeBox(1.25F, 9.35F, -0.85F, 1, 1, 1, 0F,0F, -0.82F, -0.22F, 0.05F, -0.82F, -0.22F, 0.05F, -0.82F, -0.22F, 0F, -0.8F, -0.22F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F); // Box 198
		leftLegModel[15].setRotationPoint(0F, 0F, 0F);

		leftLegModel[16].addShapeBox(1.25F, 10.35F, -0.85F, 1, 1, 1, 0F,0F, -0.82F, -0.22F, 0.05F, -0.82F, -0.22F, 0.05F, -0.82F, -0.22F, 0F, -0.8F, -0.22F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F); // Box 199
		leftLegModel[16].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 371, 199, textureX, textureY); // Box 112
		rightLegModel[1] = new ModelRendererTurbo(this, 384, 212, textureX, textureY); // Box 115
		rightLegModel[2] = new ModelRendererTurbo(this, 448, 454, textureX, textureY); // Box 76
		rightLegModel[3] = new ModelRendererTurbo(this, 440, 442, textureX, textureY); // Box 79
		rightLegModel[4] = new ModelRendererTurbo(this, 431, 238, textureX, textureY); // Box 87
		rightLegModel[5] = new ModelRendererTurbo(this, 465, 313, textureX, textureY); // Box 202
		rightLegModel[6] = new ModelRendererTurbo(this, 452, 337, textureX, textureY); // Box 203
		rightLegModel[7] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 215
		rightLegModel[8] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 216
		rightLegModel[9] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 217
		rightLegModel[10] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 218
		rightLegModel[11] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 219
		rightLegModel[12] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 220
		rightLegModel[13] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 221
		rightLegModel[14] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 222
		rightLegModel[15] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 223
		rightLegModel[16] = new ModelRendererTurbo(this, 474, 446, textureX, textureY); // Box 195

		rightLegModel[0].addBox(-2F, -2F, -2F, 4, 8, 4, 0F); // Box 112
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 6F, -2F, 4, 6, 4, 0F,0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F); // Box 115
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 10F, -2.75F, 4, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, -0.05F, 0F, -0.25F); // Box 76
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 9F, -2.75F, 4, 1, 1, 0F,-0.5F, -0.5F, -0.55F, -0.5F, -0.5F, -0.55F, -0.5F, -0.4F, 1F, -0.5F, -0.4F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, -0.05F, 0F, -0.25F); // Box 79
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2F, 6F, -2F, 4, 1, 4, 0F,0.08F, 0F, 0.08F, 0.08F, 0F, 0.08F, 0.08F, 0F, 0.08F, 0.08F, 0F, 0.08F, 0.08F, 0F, 0.08F, 0.08F, 0F, 0.08F, 0.08F, 0F, 0.08F, 0.08F, 0F, 0.08F); // Box 87
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-2F, -1F, -2F, 4, 5, 4, 0F,0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.55F, 0F, 0F, 0.45F, 0F, 0F, 0.15F, 0.5F, 0F, 0.55F); // Box 202
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);

		rightLegModel[6].addShapeBox(-2F, 4F, -2F, 4, 2, 4, 0F,0.5F, 0F, 0.55F, 0F, 0F, 0.45F, 0F, 0F, 0.15F, 0.5F, 0F, 0.55F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		rightLegModel[6].setRotationPoint(0F, 0F, 0F);

		rightLegModel[7].addShapeBox(-2.25F, 8.82F, -0.85F, 1, 1, 1, 0F,0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0.05F, -0.82F, -0.22F, 0F, -0.82F, -0.22F, 0F, -0.8F, -0.22F, 0.05F, -0.82F, -0.22F); // Box 215
		rightLegModel[7].setRotationPoint(0F, 0F, 0F);

		rightLegModel[8].addShapeBox(-2.25F, 9F, -0.85F, 1, 1, 1, 0F,0.05F, 0F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, 0.05F, 0F, -0.22F, 0.05F, -0.82F, -0.22F, 0F, -0.82F, -0.22F, 0F, -0.8F, -0.22F, 0.05F, -0.82F, -0.22F); // Box 216
		rightLegModel[8].setRotationPoint(0F, 0F, 0F);

		rightLegModel[9].addShapeBox(-2.25F, 8.35F, -0.85F, 1, 1, 1, 0F,0.05F, -0.82F, -0.22F, 0F, -0.82F, -0.22F, 0F, -0.8F, -0.22F, 0.05F, -0.82F, -0.22F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F); // Box 217
		rightLegModel[9].setRotationPoint(0F, 0F, 0F);

		rightLegModel[10].addShapeBox(-2.25F, 9.82F, -0.85F, 1, 1, 1, 0F,0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0.05F, -0.82F, -0.22F, 0F, -0.82F, -0.22F, 0F, -0.8F, -0.22F, 0.05F, -0.82F, -0.22F); // Box 218
		rightLegModel[10].setRotationPoint(0F, 0F, 0F);

		rightLegModel[11].addShapeBox(-2.25F, 10F, -0.85F, 1, 1, 1, 0F,0.05F, 0F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, 0.05F, 0F, -0.22F, 0.05F, -0.82F, -0.22F, 0F, -0.82F, -0.22F, 0F, -0.8F, -0.22F, 0.05F, -0.82F, -0.22F); // Box 219
		rightLegModel[11].setRotationPoint(0F, 0F, 0F);

		rightLegModel[12].addShapeBox(-2.25F, 9.35F, -0.85F, 1, 1, 1, 0F,0.05F, -0.82F, -0.22F, 0F, -0.82F, -0.22F, 0F, -0.8F, -0.22F, 0.05F, -0.82F, -0.22F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F); // Box 220
		rightLegModel[12].setRotationPoint(0F, 0F, 0F);

		rightLegModel[13].addShapeBox(-2.25F, 10.82F, -0.85F, 1, 1, 1, 0F,0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0.05F, -0.82F, -0.22F, 0F, -0.82F, -0.22F, 0F, -0.8F, -0.22F, 0.05F, -0.82F, -0.22F); // Box 221
		rightLegModel[13].setRotationPoint(0F, 0F, 0F);

		rightLegModel[14].addShapeBox(-2.25F, 11F, -0.85F, 1, 1, 1, 0F,0.05F, 0F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, 0.05F, 0F, -0.22F, 0.05F, -0.82F, -0.22F, 0F, -0.82F, -0.22F, 0F, -0.8F, -0.22F, 0.05F, -0.82F, -0.22F); // Box 222
		rightLegModel[14].setRotationPoint(0F, 0F, 0F);

		rightLegModel[15].addShapeBox(-2.25F, 10.35F, -0.85F, 1, 1, 1, 0F,0.05F, -0.82F, -0.22F, 0F, -0.82F, -0.22F, 0F, -0.8F, -0.22F, 0.05F, -0.82F, -0.22F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F); // Box 223
		rightLegModel[15].setRotationPoint(0F, 0F, 0F);

		rightLegModel[16].addShapeBox(-2F, 9.95F, 0.3F, 4, 2, 2, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 195
		rightLegModel[16].setRotationPoint(0F, 0F, 0F);
	}
}