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

public class ModelChinaMarines extends ModelCustomArmour //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelChinaMarines() //Same as Filename
	{
		headModel = new ModelRendererTurbo[35];
		bodyModel = new ModelRendererTurbo[63];
		leftArmModel = new ModelRendererTurbo[2];
		rightArmModel = new ModelRendererTurbo[1];
		leftLegModel = new ModelRendererTurbo[9];
		rightLegModel = new ModelRendererTurbo[13];

		initheadModel_1();
		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 210, 64, textureX, textureY); // Box 13
		headModel[1] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 14
		headModel[2] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 0
		headModel[3] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 3
		headModel[4] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 4
		headModel[5] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 5
		headModel[6] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 6
		headModel[7] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 15
		headModel[8] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 6
		headModel[9] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 7
		headModel[10] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 8
		headModel[11] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 9
		headModel[12] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 10
		headModel[13] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 11
		headModel[14] = new ModelRendererTurbo(this, 338, 69, textureX, textureY); // Box 118
		headModel[15] = new ModelRendererTurbo(this, 346, 68, textureX, textureY); // Box 119
		headModel[16] = new ModelRendererTurbo(this, 299, 56, textureX, textureY); // Box 104
		headModel[17] = new ModelRendererTurbo(this, 307, 58, textureX, textureY); // Box 106
		headModel[18] = new ModelRendererTurbo(this, 304, 61, textureX, textureY); // Box 107
		headModel[19] = new ModelRendererTurbo(this, 309, 52, textureX, textureY); // Box 108
		headModel[20] = new ModelRendererTurbo(this, 307, 53, textureX, textureY); // Box 109
		headModel[21] = new ModelRendererTurbo(this, 310, 54, textureX, textureY); // Box 110
		headModel[22] = new ModelRendererTurbo(this, 311, 49, textureX, textureY); // Box 111
		headModel[23] = new ModelRendererTurbo(this, 306, 50, textureX, textureY); // Box 112
		headModel[24] = new ModelRendererTurbo(this, 296, 49, textureX, textureY); // Box 113
		headModel[25] = new ModelRendererTurbo(this, 308, 54, textureX, textureY); // Box 114
		headModel[26] = new ModelRendererTurbo(this, 306, 60, textureX, textureY); // Box 115
		headModel[27] = new ModelRendererTurbo(this, 298, 66, textureX, textureY); // Box 117
		headModel[28] = new ModelRendererTurbo(this, 306, 59, textureX, textureY); // Box 118
		headModel[29] = new ModelRendererTurbo(this, 303, 61, textureX, textureY); // Box 119
		headModel[30] = new ModelRendererTurbo(this, 309, 52, textureX, textureY); // Box 120
		headModel[31] = new ModelRendererTurbo(this, 309, 52, textureX, textureY); // Box 121
		headModel[32] = new ModelRendererTurbo(this, 303, 61, textureX, textureY); // Box 122
		headModel[33] = new ModelRendererTurbo(this, 288, 98, textureX, textureY); // Box 123
		headModel[34] = new ModelRendererTurbo(this, 200, 55, textureX, textureY); // Box 124

		headModel[0].addShapeBox(-4.5F, -4F, -4.5F, 9, 4, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -2.5F, -0.4F, 0F, -2.5F); // Box 13
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4.5F, 0F, -4F, 9, 1, 1, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F); // Box 14
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-5F, -7F, -5F, 10, 3, 10, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-5F, -9F, -5F, 10, 2, 10, 0F,-1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 3
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-5F, -4.5F, -4F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.3F, -2F, -0.25F, -0.3F, -2F, -0.25F, -0.3F, 0F, 0.25F, -0.3F, 0F); // Box 4
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-5.5F, -4.5F, -2F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -1.3F, 0F, 0.25F, -1.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 5
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-5F, -4.5F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 6
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-5F, -5.5F, -5.6F, 10, 1, 1, 0F,-0.1F, -0.5F, -1.02F, -0.1F, -0.5F, -1.02F, -0.1F, -0.5F, 0.02F, -0.1F, -0.5F, 0.02F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(4F, -4.5F, -4F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.3F, -2F, 0.25F, -0.3F, -2F, 0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F); // Box 6
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(3.5F, -4.5F, -2F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, -1.3F, 0F, 0.75F, -1.3F, 0F, 1F, 0.3F, 0F, -1F, 0.3F, 0F); // Box 7
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(4F, -4.5F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 8
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-4F, -4.5F, 4F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-4F, -3.5F, 4F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.3F, 0F); // Box 10
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(0F, -3.5F, 4F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.7F, 0F); // Box 11
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-4.5F, 12.2F, -0.8F, 1, 1, 1, 0F,0F, -0.45F, -0.4F, 0F, -0.45F, -0.4F, 0F, -0.45F, 0.4F, 0F, -0.45F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.85F, 0F, 0F, 0.85F); // Box 118
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-4.4F, 12.2F, -0.5F, 1, 1, 1, 0F,0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F, -0.15F, 1F, 0F, -0.15F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0.75F, 0F, -0.55F, 0.75F); // Box 119
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-4.5F, -8F, -5.2F, 9, 1, 2, 0F,-2F, 0F, -0.3F, -2F, 0F, -0.3F, -2F, 0F, -0.3F, -2F, 0F, -0.3F, -2F, -0.4F, -0.3F, -2F, -0.4F, -0.3F, -2F, -0.4F, -0.3F, -2F, -0.4F, -0.3F); // Box 104
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-3F, -5.5F, -5.2F, 9, 1, 1, 0F,-4F, 0F, -0.3F, -3.5F, 0F, -0.3F, -3.5F, 0F, -0.3F, -4F, 0F, -0.3F, -4F, -0.4F, -0.3F, -3.5F, -0.4F, -0.3F, -3.5F, -0.4F, -0.3F, -4F, -0.4F, -0.3F); // Box 106
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-6F, -5.5F, -5.2F, 9, 1, 1, 0F,-3.5F, 0F, -0.3F, -4F, 0F, -0.3F, -4F, 0F, -0.3F, -3.5F, 0F, -0.3F, -3.5F, -0.4F, -0.3F, -4F, -0.4F, -0.3F, -4F, -0.4F, -0.3F, -3.5F, -0.4F, -0.3F); // Box 107
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-5F, -5.5F, -5.2F, 10, 1, 1, 0F,-4F, 0F, -0.3F, -5F, 0F, -0.3F, -5F, 0F, -0.3F, -4F, 0F, -0.3F, -4F, -0.4F, -0.3F, -5.9F, -0.4F, -0.3F, -5.9F, -0.4F, -0.3F, -4F, -0.4F, -0.3F); // Box 108
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(-5F, -5.5F, -5.2F, 10, 1, 1, 0F,-5F, 0F, -0.3F, -4F, 0F, -0.3F, -4F, 0F, -0.3F, -5F, 0F, -0.3F, -5.9F, -0.4F, -0.3F, -4F, -0.4F, -0.3F, -4F, -0.4F, -0.3F, -5.9F, -0.4F, -0.3F); // Box 109
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(-8.5F, -5.5F, -5.2F, 10, 1, 1, 0F,-5F, 0F, -0.3F, -4F, 0F, -0.3F, -4F, 0F, -0.3F, -5F, 0F, -0.3F, -5.9F, -0.4F, -0.3F, -4F, -0.4F, -0.3F, -4F, -0.4F, -0.3F, -5.9F, -0.4F, -0.3F); // Box 110
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(-1.5F, -5.5F, -5.2F, 10, 1, 1, 0F,-4F, 0F, -0.3F, -5F, 0F, -0.3F, -5F, 0F, -0.3F, -4F, 0F, -0.3F, -4F, -0.4F, -0.3F, -5.9F, -0.4F, -0.3F, -5.9F, -0.4F, -0.3F, -4F, -0.4F, -0.3F); // Box 111
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(-1.5F, -8F, -5.2F, 10, 1, 2, 0F,-4F, 0F, -0.3F, -5.9F, 0F, -0.3F, -5.9F, 0F, -0.3F, -4F, 0F, -0.3F, -4F, -0.4F, -0.3F, -5F, -0.4F, -0.3F, -5F, -0.4F, -0.3F, -4F, -0.4F, -0.3F); // Box 112
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(-8.5F, -8F, -5.2F, 10, 1, 2, 0F,-5.9F, 0F, -0.3F, -4F, 0F, -0.3F, -4F, 0F, -0.3F, -5.9F, 0F, -0.3F, -5F, -0.4F, -0.3F, -4F, -0.4F, -0.3F, -4F, -0.4F, -0.3F, -5F, -0.4F, -0.3F); // Box 113
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(-8.5F, -7.4F, -5.2F, 10, 1, 1, 0F,-5F, 0F, -0.3F, -4.5F, 0F, -0.3F, -4.5F, 0F, -0.3F, -5F, 0F, -0.3F, -5F, 0.9F, -0.3F, -4.5F, 0.9F, -0.3F, -4.5F, 0.9F, -0.3F, -5F, 0.9F, -0.3F); // Box 114
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(-2.5F, -7.4F, -5.2F, 10, 1, 1, 0F,-5.5F, 0F, -0.3F, -4F, 0F, -0.3F, -4F, 0F, -0.3F, -5.5F, 0F, -0.3F, -5.5F, 0.9F, -0.3F, -4F, 0.9F, -0.3F, -4F, 0.9F, -0.3F, -5.5F, 0.9F, -0.3F); // Box 115
		headModel[26].setRotationPoint(0F, 0F, 0F);

		headModel[27].addShapeBox(-7F, -6.5F, -5.2F, 10, 1, 1, 0F,-4F, -0.4F, -0.3F, -5.98F, -0.4F, -0.3F, -5.98F, -0.4F, -0.3F, -4F, -0.4F, -0.3F, -4F, 0F, -0.3F, -5.2F, 0F, -0.3F, -5.2F, 0F, -0.3F, -4F, 0F, -0.3F); // Box 117
		headModel[27].setRotationPoint(0F, 0F, 0F);

		headModel[28].addShapeBox(-3F, -6.5F, -5.2F, 10, 1, 1, 0F,-5.98F, -0.4F, -0.3F, -4F, -0.4F, -0.3F, -4F, -0.4F, -0.3F, -5.98F, -0.4F, -0.3F, -5.2F, 0F, -0.3F, -4F, 0F, -0.3F, -4F, 0F, -0.3F, -5.2F, 0F, -0.3F); // Box 118
		headModel[28].setRotationPoint(0F, 0F, 0F);

		headModel[29].addShapeBox(-3F, -7.4F, -5.2F, 10, 1, 1, 0F,-5.2F, 0F, -0.3F, -4F, 0F, -0.3F, -4F, 0F, -0.3F, -5.2F, 0F, -0.3F, -5.98F, -0.4F, -0.3F, -4F, -0.4F, -0.3F, -4F, -0.4F, -0.3F, -5.98F, -0.4F, -0.3F); // Box 119
		headModel[29].setRotationPoint(0F, 0F, 0F);

		headModel[30].addShapeBox(-4F, -6.5F, -5.2F, 10, 1, 1, 0F,-4F, -0.4F, -0.3F, -5.9F, -0.4F, -0.3F, -5.9F, -0.4F, -0.3F, -4F, -0.4F, -0.3F, -4F, 0F, -0.3F, -5F, 0F, -0.3F, -5F, 0F, -0.3F, -4F, 0F, -0.3F); // Box 120
		headModel[30].setRotationPoint(0F, 0F, 0F);

		headModel[31].addShapeBox(-6F, -6.5F, -5.2F, 10, 1, 1, 0F,-5.9F, -0.4F, -0.3F, -4F, -0.4F, -0.3F, -4F, -0.4F, -0.3F, -5.9F, -0.4F, -0.3F, -5F, 0F, -0.3F, -4F, 0F, -0.3F, -4F, 0F, -0.3F, -5F, 0F, -0.3F); // Box 121
		headModel[31].setRotationPoint(0F, 0F, 0F);

		headModel[32].addShapeBox(-7F, -7.4F, -5.2F, 10, 1, 1, 0F,-4F, 0F, -0.3F, -5.2F, 0F, -0.3F, -5.2F, 0F, -0.3F, -4F, 0F, -0.3F, -4F, -0.4F, -0.3F, -5.98F, -0.4F, -0.3F, -5.98F, -0.4F, -0.3F, -4F, -0.4F, -0.3F); // Box 122
		headModel[32].setRotationPoint(0F, 0F, 0F);

		headModel[33].addShapeBox(-8F, -7.4F, -5.2F, 15, 1, 1, 0F,-5F, 0F, -0.35F, -4F, 0F, -0.35F, -4F, 0F, -0.35F, -5F, 0F, -0.35F, -5F, 0.9F, -0.35F, -4F, 0.9F, -0.35F, -4F, 0.9F, -0.35F, -5F, 0.9F, -0.35F); // Box 123
		headModel[33].setRotationPoint(0F, 0F, 0F);

		headModel[34].addShapeBox(-9.5F, -7.4F, -5F, 18, 1, 10, 0F,-5F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, -0.55F, -5F, 0F, -0.55F, -4.6F, 0.9F, -0.35F, -3.6F, 0.9F, -0.35F, -3.6F, 0.9F, -0.15F, -4.6F, 0.9F, -0.15F); // Box 124
		headModel[34].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 143, 49, textureX, textureY); // Box 62
		bodyModel[2] = new ModelRendererTurbo(this, 134, 54, textureX, textureY); // Box 64
		bodyModel[3] = new ModelRendererTurbo(this, 153, 62, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 167, 52, textureX, textureY); // Box 1
		bodyModel[5] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 12
		bodyModel[6] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 13
		bodyModel[7] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 15
		bodyModel[8] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 16
		bodyModel[9] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 17
		bodyModel[10] = new ModelRendererTurbo(this, 103, 51, textureX, textureY); // Box 0
		bodyModel[11] = new ModelRendererTurbo(this, 99, 71, textureX, textureY); // Box 7
		bodyModel[12] = new ModelRendererTurbo(this, 98, 55, textureX, textureY); // Box 8
		bodyModel[13] = new ModelRendererTurbo(this, 74, 47, textureX, textureY); // Box 9
		bodyModel[14] = new ModelRendererTurbo(this, 134, 59, textureX, textureY); // Box 10
		bodyModel[15] = new ModelRendererTurbo(this, 172, 55, textureX, textureY); // Box 12
		bodyModel[16] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 14
		bodyModel[17] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 1
		bodyModel[24] = new ModelRendererTurbo(this, 285, 46, textureX, textureY); // Box 2
		bodyModel[25] = new ModelRendererTurbo(this, 285, 51, textureX, textureY); // Box 3
		bodyModel[26] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 4
		bodyModel[27] = new ModelRendererTurbo(this, 137, 52, textureX, textureY); // Box 5
		bodyModel[28] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 7
		bodyModel[29] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 9
		bodyModel[30] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 10
		bodyModel[31] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 11
		bodyModel[32] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 12
		bodyModel[33] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 13
		bodyModel[34] = new ModelRendererTurbo(this, 111, 58, textureX, textureY); // Box 2
		bodyModel[35] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 10
		bodyModel[36] = new ModelRendererTurbo(this, 96, 67, textureX, textureY); // Box 17
		bodyModel[37] = new ModelRendererTurbo(this, 86, 47, textureX, textureY); // Box 25
		bodyModel[38] = new ModelRendererTurbo(this, 73, 67, textureX, textureY); // Box 30
		bodyModel[39] = new ModelRendererTurbo(this, 80, 48, textureX, textureY); // Box 31
		bodyModel[40] = new ModelRendererTurbo(this, 69, 58, textureX, textureY); // Box 32
		bodyModel[41] = new ModelRendererTurbo(this, 81, 56, textureX, textureY); // Box 33
		bodyModel[42] = new ModelRendererTurbo(this, 87, 48, textureX, textureY); // Box 29
		bodyModel[43] = new ModelRendererTurbo(this, 96, 61, textureX, textureY); // Box 30
		bodyModel[44] = new ModelRendererTurbo(this, 138, 55, textureX, textureY); // Box 31
		bodyModel[45] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 41
		bodyModel[46] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 42
		bodyModel[47] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 43
		bodyModel[48] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 44
		bodyModel[49] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 45
		bodyModel[50] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 46
		bodyModel[51] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 47
		bodyModel[52] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 11
		bodyModel[53] = new ModelRendererTurbo(this, 309, 59, textureX, textureY); // Box 4
		bodyModel[54] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 5
		bodyModel[55] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 6
		bodyModel[56] = new ModelRendererTurbo(this, 151, 63, textureX, textureY); // Box 97
		bodyModel[57] = new ModelRendererTurbo(this, 98, 52, textureX, textureY); // Box 98
		bodyModel[58] = new ModelRendererTurbo(this, 155, 62, textureX, textureY); // Box 99
		bodyModel[59] = new ModelRendererTurbo(this, 144, 51, textureX, textureY); // Box 100
		bodyModel[60] = new ModelRendererTurbo(this, 79, 67, textureX, textureY); // Box 101
		bodyModel[61] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 102
		bodyModel[62] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 103

		bodyModel[0].addShapeBox(-4.1F, 0F, -2.1F, 16, 24, 8, 0F,0F, 0.1F, 0F, -7.8F, 0.1F, 0F, -7.8F, 0.1F, -3.8F, 0F, 0.1F, -3.8F, 0F, -12F, 0F, -7.8F, -12F, 0F, -7.8F, -12F, -3.8F, 0F, -12F, -3.8F); // Box 1
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 7F, -2F, 8, 4, 4, 0F,0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 62
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 2.8F, -2F, 8, 4, 4, 0F,-0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 64
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, -0.2F, -2F, 4, 3, 4, 0F,0F, 0F, 0.3F, 0F, -0.7F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.3F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.3F, 0F, 0.3F); // Box 0
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(0F, -0.2F, -2F, 4, 3, 4, 0F,0F, -0.7F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 1
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-3.5F, 4.6F, -2.45F, 3, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 12
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-3.5F, 3F, -2.45F, 3, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 13
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-3.5F, 6.2F, -2.45F, 3, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 15
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-3.5F, 7.8F, -2.45F, 3, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 16
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-3.5F, 9.4F, -2.45F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 17
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-4F, 0F, -2.4F, 4, 3, 1, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(0F, 0F, -2.4F, 4, 3, 1, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F); // Box 7
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-3.5F, 3F, -2.4F, 3, 8, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(0.25F, 3F, -2.4F, 3, 8, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-4.5F, 6F, -2.4F, 1, 5, 1, 0F,-0.2F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 10
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(3.5F, 6F, -2.4F, 1, 5, 1, 0F,0F, 0F, 0F, -0.2F, 0F, -0.1F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.1F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-3.75F, 1.4F, -2.45F, 3, 1, 1, 0F,0F, 0F, 0F, -0.18F, 0F, 0F, -0.18F, 0F, 0F, 0F, 0F, 0F, -0.15F, -0.2F, 0F, 0.15F, -0.2F, 0F, 0.15F, -0.2F, 0F, -0.15F, -0.2F, 0F); // Box 14
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(0.5F, 9.4F, -2.45F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 18
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(0.5F, 7.8F, -2.45F, 3, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.25F, -0.2F, 0F); // Box 19
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-0.5F, 6.2F, -2.45F, 4, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.25F, -0.2F, 0F); // Box 20
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(0.5F, 4.6F, -2.45F, 3, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.25F, -0.2F, 0F); // Box 21
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-0.5F, 3F, -2.45F, 4, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.25F, -0.2F, 0F); // Box 22
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(0.75F, 1.4F, -2.45F, 3, 1, 1, 0F,-0.18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.18F, 0F, 0F, 0.15F, -0.2F, 0F, -0.15F, -0.2F, 0F, -0.15F, -0.2F, 0F, 0.15F, -0.2F, 0F); // Box 23
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-0.5F, 8.8F, -2.45F, 1, 2, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 1
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-4F, 0F, 1.4F, 4, 3, 1, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 2
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(0F, 0F, 1.4F, 4, 3, 1, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 3
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-3F, 3F, 1.4F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F); // Box 4
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-2F, 6F, 1.4F, 4, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-2F, 6.2F, 1.46F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 7
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-2F, 7.6F, 1.46F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 9
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(-2F, 9.2F, 1.46F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 10
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(-2F, 3.6F, 1.46F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 11
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(1F, 4F, 1.45F, 1, 7, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.05F, 0F, -0.1F, 0.05F, 0F, -0.1F, 0.05F, 0F, -0.1F, 0.05F, 0F); // Box 12
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(-2F, 4F, 1.45F, 1, 7, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.05F, 0F, -0.1F, 0.05F, 0F, -0.1F, 0.05F, 0F, -0.1F, 0.05F, 0F); // Box 13
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-4F, 8F, -3.3F, 2, 4, 1, 0F,-0.25F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.25F, 0F, 0F); // Box 2
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(-5.3F, 7.9F, -1.5F, 2, 2, 3, 0F,-0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F); // Box 10
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-2.1F, 8F, -3.3F, 2, 4, 1, 0F,-0.15F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.15F, 0F, 0F); // Box 17
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-2.15F, 7.9F, -3.35F, 2, 2, 2, 0F,-0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F); // Box 25
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(2F, 8F, -3.3F, 2, 4, 1, 0F,-0.15F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.15F, 0F, 0F); // Box 30
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(1.95F, 7.9F, -3.35F, 2, 2, 2, 0F,-0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F); // Box 31
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(0.1F, 8F, -3.3F, 2, 4, 1, 0F,-0.25F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.25F, 0F, 0F); // Box 32
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(0.15F, 7.9F, -3.35F, 2, 2, 2, 0F,-0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F); // Box 33
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(-2.5F, 1F, 1.9F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 29
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(-2.5F, 2.5F, 1.9F, 5, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 30
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(-3.5F, 1.9F, 1.5F, 7, 4, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 31
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(-2F, 2.8F, 3.95F, 1, 3, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 4.05F, 0F, -0.1F, 4.05F, 0F, -0.1F, 4.05F, 0F, -0.1F, 4.05F, 0F); // Box 41
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(-2F, 8F, 3.96F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 42
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(1F, 2.8F, 3.95F, 1, 3, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 4.05F, 0F, -0.1F, 4.05F, 0F, -0.1F, 4.05F, 0F, -0.1F, 4.05F, 0F); // Box 43
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(-2F, 3.4F, 3.96F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 44
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(-2F, 2F, 4.25F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 45
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(1F, 0.95F, 3.95F, 1, 1, 1, 0F,-0.1F, 0.05F, 0F, -0.1F, 0.05F, 0F, -0.1F, 0.05F, -0.3F, -0.1F, 0.05F, -0.3F, -0.1F, 0.05F, 0F, -0.1F, 0.05F, 0F, -0.1F, 0.05F, 0F, -0.1F, 0.05F, 0F); // Box 46
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(-2F, 0.95F, 3.95F, 1, 1, 1, 0F,-0.1F, 0.05F, 0F, -0.1F, 0.05F, 0F, -0.1F, 0.05F, -0.3F, -0.1F, 0.05F, -0.3F, -0.1F, 0.05F, 0F, -0.1F, 0.05F, 0F, -0.1F, 0.05F, 0F, -0.1F, 0.05F, 0F); // Box 47
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(-2.5F, 11.2F, -2.3F, 5, 1, 1, 0F,0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, -0.8F, 0.3F, 0.2F, -0.8F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.8F, 0.3F, 0F, -0.8F); // Box 11
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(1.6F, 2F, -3.3F, 2, 3, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F); // Box 4
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(2.6F, -0.6F, -3.5F, 1, 2, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 5
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(2.6F, 1.4F, -3.5F, 1, 1, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 6
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addShapeBox(-5F, 9F, -1.5F, 1, 3, 3, 0F,0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 97
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addShapeBox(-3.95F, 7.9F, -3.35F, 2, 2, 2, 0F,-0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F); // Box 98
		bodyModel[57].setRotationPoint(0F, 0F, 0F);

		bodyModel[58].addShapeBox(3.3F, 7.9F, -1.5F, 2, 2, 3, 0F,-0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F); // Box 99
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addShapeBox(4F, 9F, -1.5F, 1, 3, 3, 0F,0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 100
		bodyModel[59].setRotationPoint(0F, 0F, 0F);

		bodyModel[60].addShapeBox(-2.5F, 5.5F, 1.9F, 5, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 101
		bodyModel[60].setRotationPoint(0F, 0F, 0F);

		bodyModel[61].addShapeBox(-2F, 5.3F, 3.96F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 102
		bodyModel[61].setRotationPoint(0F, 0F, 0F);

		bodyModel[62].addShapeBox(-2F, 6.8F, 3.96F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 103
		bodyModel[62].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 4
		leftArmModel[1] = new ModelRendererTurbo(this, 3, 37, textureX, textureY); // Box 27

		leftArmModel[0].addShapeBox(-1.1F, -2F, -2.1F, 8, 24, 8, 0F,0F, 0.1F, 0F, -3.8F, 0.1F, 0F, -3.8F, 0.1F, -3.8F, 0F, 0.1F, -3.8F, 0F, -12F, 0F, -3.8F, -12F, 0F, -3.8F, -12F, -3.8F, 0F, -12F, -3.8F); // Box 4
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addBox(3.15F, -1F, -1.5F, 0, 2, 3, 0F); // Box 27
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 2

		rightArmModel[0].addShapeBox(-3.1F, -2F, -2.1F, 8, 24, 8, 0F,0F, 0.1F, 0F, -3.8F, 0.1F, 0F, -3.8F, 0.1F, -3.8F, 0F, 0.1F, -3.8F, 0F, -12F, 0F, -3.8F, -12F, 0F, -3.8F, -12F, -3.8F, 0F, -12F, -3.8F); // Box 2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 6
		leftLegModel[1] = new ModelRendererTurbo(this, 385, 50, textureX, textureY); // Box 93
		leftLegModel[2] = new ModelRendererTurbo(this, 385, 50, textureX, textureY); // Box 95
		leftLegModel[3] = new ModelRendererTurbo(this, 385, 50, textureX, textureY); // Box 97
		leftLegModel[4] = new ModelRendererTurbo(this, 269, 49, textureX, textureY); // Box 102
		leftLegModel[5] = new ModelRendererTurbo(this, 269, 49, textureX, textureY); // Box 106
		leftLegModel[6] = new ModelRendererTurbo(this, 313, 55, textureX, textureY); // Box 107
		leftLegModel[7] = new ModelRendererTurbo(this, 307, 57, textureX, textureY); // Box 108
		leftLegModel[8] = new ModelRendererTurbo(this, 310, 56, textureX, textureY); // Box 109

		leftLegModel[0].addShapeBox(-2.1F, 0F, -2.1F, 8, 24, 8, 0F,0F, 0.1F, 0F, -3.8F, 0.1F, 0F, -3.8F, 0.1F, -3.8F, 0F, 0.1F, -3.8F, 0F, -12F, 0F, -3.8F, -12F, 0F, -3.8F, -12F, -3.8F, 0F, -12F, -3.8F); // Box 6
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 7F, -2.3F, 4, 5, 5, 0F,0.125F, -0.55F, 0F, 0.125F, -0.55F, 0F, 0.125F, -0.55F, -0.475F, 0.125F, -0.55F, -0.475F, 0.125F, 0.05F, 0F, 0.125F, 0.05F, 0F, 0.125F, 0.05F, -0.475F, 0.125F, 0.05F, -0.475F); // Box 93
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 9F, -3.82F, 4, 3, 2, 0F,-0.275F, -0.8F, -0.75F, -0.275F, -0.8F, -0.75F, 0.125F, -0.8F, -0.475F, 0.125F, -0.8F, -0.475F, -0.275F, 0.05F, -0.75F, -0.275F, 0.05F, -0.75F, 0.125F, 0.05F, -0.475F, 0.125F, 0.05F, -0.475F); // Box 95
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 7.8F, -3.82F, 4, 2, 2, 0F,-0.275F, -1.6F, -1.15F, -0.275F, -1.6F, -1.15F, -0.175F, -1.6F, -0.475F, -0.175F, -1.6F, -0.475F, -0.275F, 0.05F, -0.75F, -0.275F, 0.05F, -0.75F, 0.125F, 0.05F, -0.475F, 0.125F, 0.05F, -0.475F); // Box 97
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-1.95F, 4.16F, -2F, 4, 1, 4, 0F,0.06F, -0.3F, 0.15F, 0.06F, -0.3F, 0.15F, 0.06F, -0.3F, 0.15F, 0.06F, -0.3F, 0.15F, 0.06F, -0.3F, 0.15F, 0.06F, -0.3F, 0.15F, 0.06F, -0.3F, 0.15F, 0.06F, -0.3F, 0.15F); // Box 102
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-1.95F, 3.5F, -2F, 4, 1, 4, 0F,0.06F, -0.3F, 0.15F, 0.06F, -0.3F, 0.15F, 0.06F, -0.3F, 0.15F, 0.06F, -0.3F, 0.15F, 0.06F, -0.3F, 0.15F, 0.06F, -0.3F, 0.15F, 0.06F, -0.3F, 0.15F, 0.06F, -0.3F, 0.15F); // Box 106
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);

		leftLegModel[6].addShapeBox(-1F, 2.5F, -2.4F, 2, 1, 1, 0F,-0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F); // Box 107
		leftLegModel[6].setRotationPoint(0F, 0F, 0F);

		leftLegModel[7].addShapeBox(-1F, 3.5F, -2.4F, 2, 2, 1, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F); // Box 108
		leftLegModel[7].setRotationPoint(0F, 0F, 0F);

		leftLegModel[8].addShapeBox(-1F, 5.5F, -2.4F, 2, 1, 1, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F); // Box 109
		leftLegModel[8].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 5
		rightLegModel[1] = new ModelRendererTurbo(this, 385, 50, textureX, textureY); // Box 25
		rightLegModel[2] = new ModelRendererTurbo(this, 337, 69, textureX, textureY); // Box 117
		rightLegModel[3] = new ModelRendererTurbo(this, 337, 69, textureX, textureY); // Box 116
		rightLegModel[4] = new ModelRendererTurbo(this, 269, 52, textureX, textureY); // Box 84
		rightLegModel[5] = new ModelRendererTurbo(this, 268, 60, textureX, textureY); // Box 91
		rightLegModel[6] = new ModelRendererTurbo(this, 307, 57, textureX, textureY); // Box 67
		rightLegModel[7] = new ModelRendererTurbo(this, 268, 55, textureX, textureY); // Box 90
		rightLegModel[8] = new ModelRendererTurbo(this, 269, 49, textureX, textureY); // Box 91
		rightLegModel[9] = new ModelRendererTurbo(this, 385, 50, textureX, textureY); // Box 94
		rightLegModel[10] = new ModelRendererTurbo(this, 385, 50, textureX, textureY); // Box 96
		rightLegModel[11] = new ModelRendererTurbo(this, 310, 56, textureX, textureY); // Box 99
		rightLegModel[12] = new ModelRendererTurbo(this, 313, 55, textureX, textureY); // Box 100

		rightLegModel[0].addShapeBox(-2.1F, 0F, -2.1F, 8, 24, 8, 0F,0F, 0.1F, 0F, -3.8F, 0.1F, 0F, -3.8F, 0.1F, -3.8F, 0F, 0.1F, -3.8F, 0F, -12F, 0F, -3.8F, -12F, 0F, -3.8F, -12F, -3.8F, 0F, -12F, -3.8F); // Box 5
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 7F, -2.3F, 4, 5, 5, 0F,0.125F, -0.55F, 0F, 0.125F, -0.55F, 0F, 0.125F, -0.55F, -0.475F, 0.125F, -0.55F, -0.475F, 0.125F, 0.05F, 0F, 0.125F, 0.05F, 0F, 0.125F, 0.05F, -0.475F, 0.125F, 0.05F, -0.475F); // Box 25
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2.5F, 1.2F, 0.2F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.9F, 0F, 0.3F, -0.9F); // Box 117
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2.5F, 1.2F, -0.8F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 116
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2F, 1.5F, -2F, 4, 1, 4, 0F,0.18F, -0.3F, 0.18F, -0.02F, -0.3F, 0.18F, -0.02F, -0.3F, 0.18F, 0.18F, -0.3F, 0.18F, 0.18F, -0.3F, 0.18F, -0.02F, -0.3F, 0.18F, -0.02F, -0.3F, 0.18F, 0.18F, -0.3F, 0.18F); // Box 84
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-2.05F, 4.16F, -2F, 4, 1, 4, 0F,0.06F, -0.3F, 0.15F, 0.06F, -0.3F, 0.15F, 0.06F, -0.3F, 0.15F, 0.06F, -0.3F, 0.15F, 0.06F, -0.3F, 0.15F, 0.06F, -0.3F, 0.15F, 0.06F, -0.3F, 0.15F, 0.06F, -0.3F, 0.15F); // Box 91
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);

		rightLegModel[6].addShapeBox(-1F, 3.5F, -2.4F, 2, 2, 1, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F); // Box 67
		rightLegModel[6].setRotationPoint(0F, 0F, 0F);

		rightLegModel[7].addShapeBox(-2F, 0.6F, -2F, 4, 1, 4, 0F,0.18F, -0.3F, 0.18F, -0.02F, -0.3F, 0.18F, -0.02F, -0.3F, 0.18F, 0.18F, -0.3F, 0.18F, 0.18F, -0.3F, 0.18F, -0.02F, -0.3F, 0.18F, -0.02F, -0.3F, 0.18F, 0.18F, -0.3F, 0.18F); // Box 90
		rightLegModel[7].setRotationPoint(0F, 0F, 0F);

		rightLegModel[8].addShapeBox(-2.05F, 3.5F, -2F, 4, 1, 4, 0F,0.06F, -0.3F, 0.15F, 0.06F, -0.3F, 0.15F, 0.06F, -0.3F, 0.15F, 0.06F, -0.3F, 0.15F, 0.06F, -0.3F, 0.15F, 0.06F, -0.3F, 0.15F, 0.06F, -0.3F, 0.15F, 0.06F, -0.3F, 0.15F); // Box 91
		rightLegModel[8].setRotationPoint(0F, 0F, 0F);

		rightLegModel[9].addShapeBox(-2F, 9F, -3.82F, 4, 3, 2, 0F,-0.275F, -0.8F, -0.75F, -0.275F, -0.8F, -0.75F, 0.125F, -0.8F, -0.475F, 0.125F, -0.8F, -0.475F, -0.275F, 0.05F, -0.75F, -0.275F, 0.05F, -0.75F, 0.125F, 0.05F, -0.475F, 0.125F, 0.05F, -0.475F); // Box 94
		rightLegModel[9].setRotationPoint(0F, 0F, 0F);

		rightLegModel[10].addShapeBox(-2F, 7.8F, -3.82F, 4, 2, 2, 0F,-0.275F, -1.6F, -1.15F, -0.275F, -1.6F, -1.15F, -0.175F, -1.6F, -0.475F, -0.175F, -1.6F, -0.475F, -0.275F, 0.05F, -0.75F, -0.275F, 0.05F, -0.75F, 0.125F, 0.05F, -0.475F, 0.125F, 0.05F, -0.475F); // Box 96
		rightLegModel[10].setRotationPoint(0F, 0F, 0F);

		rightLegModel[11].addShapeBox(-1F, 5.5F, -2.4F, 2, 1, 1, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F); // Box 99
		rightLegModel[11].setRotationPoint(0F, 0F, 0F);

		rightLegModel[12].addShapeBox(-1F, 2.5F, -2.4F, 2, 1, 1, 0F,-0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F); // Box 100
		rightLegModel[12].setRotationPoint(0F, 0F, 0F);
	}
}