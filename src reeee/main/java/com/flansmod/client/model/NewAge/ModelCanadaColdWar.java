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

public class ModelCanadaColdWar extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelCanadaColdWar() //Same as Filename
	{
		headModel = new ModelRendererTurbo[29];
		bodyModel = new ModelRendererTurbo[94];
		leftArmModel = new ModelRendererTurbo[4];
		rightArmModel = new ModelRendererTurbo[4];
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
		headModel[0] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Import Box3
		headModel[1] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Import Box3
		headModel[2] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Import Box3
		headModel[3] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Import Box3
		headModel[4] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Import Box3
		headModel[5] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 13
		headModel[6] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 14
		headModel[7] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 130
		headModel[8] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 136
		headModel[9] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 138
		headModel[10] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 144
		headModel[11] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box 161
		headModel[12] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 167
		headModel[13] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 173
		headModel[14] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 182
		headModel[15] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 183
		headModel[16] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 185
		headModel[17] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 186
		headModel[18] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 200
		headModel[19] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 205
		headModel[20] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 199
		headModel[21] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 200
		headModel[22] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 201
		headModel[23] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Box 202
		headModel[24] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 205
		headModel[25] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Box 206
		headModel[26] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 209
		headModel[27] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 81
		headModel[28] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // Box 82

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 3, 4, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.4F, -0.1F, 0.6F, 0.4F, -0.1F, 0.6F, 0.4F, 1.2F, 0.1F, 0.4F, 1.2F, 0.1F); // Import Box3
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -9F, -4F, 8, 1, 8, 0F,-0.9F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F, 0.3F, -1.4F, -0.9F, 0.3F, -1.4F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Import Box3
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -8F, 0.2F, 8, 3, 4, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.4F, 1.2F, 0.1F, 0.4F, 1.2F, 0.1F, 0.4F, 0.8F, 0.4F, 0.4F, 0.8F, 0.4F); // Import Box3
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -4F, 0.4F, 8, 1, 4, 0F,0.4F, -0.2F, 0.3F, 0.4F, -0.2F, 0.3F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.9F, -0.3F, 0.3F, 0.9F, -0.3F, 0.3F, 0.6F, -0.7F, 0.7F, 0.6F, -0.7F, 0.7F); // Import Box3
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -4F, -4.2F, 8, 1, 4, 0F,0.4F, 1.1F, 0.4F, 0.4F, 1.1F, 0.4F, 0.4F, -0.2F, 0.3F, 0.4F, -0.2F, 0.3F, 0.6F, -1.6F, 1.3F, 0.6F, -1.6F, 1.3F, 0.9F, -0.3F, 0.3F, 0.9F, -0.3F, 0.3F); // Import Box3
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4.5F, -4F, -4.5F, 9, 4, 4, 0F,0F, -0.25F, -3F, 0F, -0.25F, -3F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -2.5F, -0.4F, 0F, -2.5F); // Box 13
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4.5F, 0F, -4F, 9, 1, 1, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F); // Box 14
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(2.5F, -8F, -4.7F, 1, 3, 1, 0F,-0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F); // Box 130
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-3.5F, -8F, -4.7F, 1, 3, 1, 0F,-0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F); // Box 136
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-3.5F, -9.4F, -4.2F, 1, 2, 9, 0F,-0.45F, -0.3F, -1.1F, -0.45F, -0.3F, -1.1F, -0.45F, 0F, -2.2F, -0.45F, 0F, -2.2F, -0.45F, -0.6F, 0F, -0.45F, -0.6F, 0F, -0.45F, -0.6F, -0.4F, -0.45F, -0.6F, -0.4F); // Box 138
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(2.5F, -9.4F, -4.2F, 1, 2, 9, 0F,-0.45F, -0.3F, -1.1F, -0.45F, -0.3F, -1.1F, -0.45F, 0F, -2.2F, -0.45F, 0F, -2.2F, -0.45F, -0.6F, 0F, -0.45F, -0.6F, 0F, -0.45F, -0.6F, -0.4F, -0.45F, -0.6F, -0.4F); // Box 144
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-4F, -9F, -3.5F, 8, 1, 1, 0F,-0.9F, 0.1F, -0.45F, -0.9F, 0.1F, -0.45F, -0.9F, 0.1F, -0.45F, -0.9F, 0.1F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F); // Box 161
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-4F, -9F, 2.5F, 8, 1, 1, 0F,-0.7F, 0.1F, -0.45F, -0.7F, 0.1F, -0.45F, -0.6F, 0F, -0.45F, -0.6F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F); // Box 167
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-4F, -8F, -3.5F, 8, 3, 1, 0F,0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.5F, 0.3F, -0.45F, 0.5F, 0.3F, -0.45F, 0.5F, 0.37F, -0.45F, 0.5F, 0.37F, -0.45F); // Box 173
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-4F, -8F, 2.5F, 8, 4, 1, 0F,0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.5F, -0.08F, -0.45F, 0.5F, -0.08F, -0.45F, 0.5F, -0.1F, -0.45F, 0.5F, -0.1F, -0.45F); // Box 182
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(2.5F, -8F, 3.4F, 1, 4, 2, 0F,-0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -1F, -0.45F, 0F, -1F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, -0.7F, -0.45F, -0.2F, -0.7F); // Box 183
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-3.5F, -8F, 3.4F, 1, 4, 2, 0F,-0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -1F, -0.45F, 0F, -1F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, -0.7F, -0.45F, -0.2F, -0.7F); // Box 185
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-1.5F, -8F, 3.4F, 1, 4, 2, 0F,-0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -1F, -0.45F, 0F, -1F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, -0.7F, -0.45F, -0.2F, -0.7F); // Box 186
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-4F, -8.5F, -3.9F, 8, 1, 4, 0F,0F, -0.45F, 0.2F, 0F, -0.45F, 0.2F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0.1F, -0.45F, 0.3F, 0.1F, -0.45F, 0.3F, 0.1F, -0.45F, 0F, 0.1F, -0.45F, 0F); // Box 200
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-4F, -8.5F, 0.1F, 8, 1, 4, 0F,0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0.2F, 0F, -0.45F, 0.2F, 0.1F, -0.45F, 0F, 0.1F, -0.45F, 0F, 0.1F, -0.45F, 0.3F, 0.1F, -0.45F, 0.3F); // Box 205
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(-0.5F, -8F, -4.7F, 1, 3, 1, 0F,-0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F); // Box 199
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(-0.5F, -9.4F, -4.2F, 1, 2, 9, 0F,-0.45F, -0.3F, -1.1F, -0.45F, -0.3F, -1.1F, -0.45F, 0F, -2.2F, -0.45F, 0F, -2.2F, -0.45F, -0.6F, 0F, -0.45F, -0.6F, 0F, -0.45F, -0.6F, -0.4F, -0.45F, -0.6F, -0.4F); // Box 200
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(-4.5F, -6.5F, -5F, 9, 1, 5, 0F,-0.2F, -0.45F, -0.5F, -0.2F, -0.45F, -0.5F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.17F, -0.45F, -0.45F, -0.17F, -0.45F, -0.45F, -0.17F, -0.45F, 0F, -0.17F, -0.45F, 0F); // Box 201
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(-4.5F, -6.5F, -1.38777878078145E-16F, 9, 1, 5, 0F,-0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, -0.5F, -0.2F, -0.45F, -0.5F, -0.17F, -0.45F, 0F, -0.17F, -0.45F, 0F, -0.17F, -0.45F, -0.45F, -0.17F, -0.45F, -0.45F); // Box 202
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(-4F, -8F, -0.5F, 8, 4, 1, 0F,0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.5F, 0.15F, -0.45F, 0.5F, 0.15F, -0.45F, 0.5F, 0.15F, -0.45F, 0.5F, 0.15F, -0.45F); // Box 205
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(-4F, -9F, -0.5F, 8, 1, 1, 0F,-0.9F, 0.25F, -0.45F, -0.85F, 0.25F, -0.45F, -0.85F, 0.25F, -0.44F, -0.9F, 0.25F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F); // Box 206
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(0.5F, -8F, 3.4F, 1, 4, 2, 0F,-0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -1F, -0.45F, 0F, -1F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, -0.7F, -0.45F, -0.2F, -0.7F); // Box 209
		headModel[26].setRotationPoint(0F, 0F, 0F);

		headModel[27].addShapeBox(-5F, -6F, -5F, 10, 1, 5, 0F,-0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.55F, -0.6F, -0.35F, -0.55F, -0.6F, -0.35F, -0.55F, 0F, 0F, -0.55F, 0F, 0F); // Box 81
		headModel[27].setRotationPoint(0F, 0F, 0F);

		headModel[28].addShapeBox(-5F, -5.4F, 0F, 10, 1, 5, 0F,-0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.35F, -0.6F, 0F, -0.35F, -0.55F, -0.6F, 0F, -0.55F, -0.6F, 0F, -0.55F, -0.6F, -0.3F, -0.55F, -0.6F, -0.3F); // Box 82
		headModel[28].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 11
		bodyModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 12
		bodyModel[3] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 26
		bodyModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 37
		bodyModel[5] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 3
		bodyModel[6] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 4
		bodyModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 6
		bodyModel[8] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 33
		bodyModel[9] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 34
		bodyModel[10] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 30
		bodyModel[11] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 33
		bodyModel[12] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 19
		bodyModel[13] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 39
		bodyModel[14] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 51
		bodyModel[15] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 52
		bodyModel[16] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 53
		bodyModel[17] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 0
		bodyModel[18] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 44
		bodyModel[19] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 46
		bodyModel[20] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 47
		bodyModel[21] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 48
		bodyModel[22] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 5
		bodyModel[23] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 6
		bodyModel[24] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 7
		bodyModel[25] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 79
		bodyModel[26] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 80
		bodyModel[27] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 81
		bodyModel[28] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 82
		bodyModel[29] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 84
		bodyModel[30] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 85
		bodyModel[31] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 87
		bodyModel[32] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 88
		bodyModel[33] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 89
		bodyModel[34] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 28
		bodyModel[35] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 29
		bodyModel[36] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 0
		bodyModel[37] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 1
		bodyModel[38] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 131
		bodyModel[39] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 132
		bodyModel[40] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 22
		bodyModel[41] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 23
		bodyModel[42] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 106
		bodyModel[43] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 107
		bodyModel[44] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 108
		bodyModel[45] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 109
		bodyModel[46] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 110
		bodyModel[47] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 111
		bodyModel[48] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 112
		bodyModel[49] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 113
		bodyModel[50] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 114
		bodyModel[51] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 115
		bodyModel[52] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 116
		bodyModel[53] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 117
		bodyModel[54] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 118
		bodyModel[55] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 119
		bodyModel[56] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 120
		bodyModel[57] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 121
		bodyModel[58] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 122
		bodyModel[59] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 123
		bodyModel[60] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 115
		bodyModel[61] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 116
		bodyModel[62] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 118
		bodyModel[63] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 121
		bodyModel[64] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 123
		bodyModel[65] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 134
		bodyModel[66] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 135
		bodyModel[67] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 136
		bodyModel[68] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 137
		bodyModel[69] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 156
		bodyModel[70] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 157
		bodyModel[71] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 158
		bodyModel[72] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 159
		bodyModel[73] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 142
		bodyModel[74] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 143
		bodyModel[75] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 144
		bodyModel[76] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 145
		bodyModel[77] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 108
		bodyModel[78] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 165
		bodyModel[79] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 166
		bodyModel[80] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 48
		bodyModel[81] = new ModelRendererTurbo(this, 9, 97, textureX, textureY); // Box 414
		bodyModel[82] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 415
		bodyModel[83] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 170
		bodyModel[84] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 171
		bodyModel[85] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 131
		bodyModel[86] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 132
		bodyModel[87] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 133
		bodyModel[88] = new ModelRendererTurbo(this, 100, 111, textureX, textureY); // Box 121
		bodyModel[89] = new ModelRendererTurbo(this, 76, 119, textureX, textureY); // Box 122
		bodyModel[90] = new ModelRendererTurbo(this, 104, 90, textureX, textureY); // Box 126
		bodyModel[91] = new ModelRendererTurbo(this, 65, 120, textureX, textureY); // Box 103
		bodyModel[92] = new ModelRendererTurbo(this, 95, 92, textureX, textureY); // Box 104
		bodyModel[93] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 105

		bodyModel[0].addShapeBox(-4F, -0.1F, -2F, 4, 2, 4, 0F,0.1F, 0F, 0.1F, -1F, 0F, 0.1F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F); // Box 1
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-0.5F, -0.1F, -2.15F, 2, 2, 1, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-1.5F, -0.1F, -2.12F, 2, 2, 1, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 12
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, 7.7F, -2F, 4, 1, 4, 0F,0.2F, 0.3F, 0.27F, 0F, 0.3F, 0.27F, 0F, 0.3F, 0.27F, 0.2F, 0.3F, 0.27F, 0.2F, 0.3F, 0.27F, 0F, 0.3F, 0.27F, 0F, 0.3F, 0.27F, 0.2F, 0.3F, 0.27F); // Box 26
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-1F, 7.7F, -2.33F, 1, 1, 1, 0F,-0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F); // Box 37
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(0F, 7.7F, -2.33F, 1, 1, 1, 0F,-0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F); // Box 3
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(0F, 7.7F, -2F, 4, 1, 4, 0F,0F, 0.3F, 0.27F, 0.2F, 0.3F, 0.27F, 0.2F, 0.3F, 0.27F, 0F, 0.3F, 0.27F, 0F, 0.3F, 0.27F, 0.2F, 0.3F, 0.27F, 0.2F, 0.3F, 0.27F, 0F, 0.3F, 0.27F); // Box 4
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-0.5F, 7.7F, -2.78F, 1, 1, 1, 0F,-0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F); // Box 6
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-4F, 1.9F, -2F, 8, 10, 4, 0F,0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 33
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(0F, -0.1F, -2F, 4, 2, 4, 0F,-1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0F, -0.5F, 0.1F); // Box 34
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-3.7F, 7.5F, -3.1F, 2, 3, 1, 0F,0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0.3F, 0.2F, 0.1F, 0.3F, 0.2F, 0.1F, 0.3F, 0.2F, 0.1F, 0.3F, 0.2F); // Box 30
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-3.7F, 6.8F, -3.2F, 2, 1, 2, 0F,0.15F, 0F, 0.2F, 0.15F, 0F, 0.2F, 0.15F, 0F, 0.2F, 0.15F, 0F, 0.2F, 0.15F, 0.5F, 0.2F, 0.15F, 0.5F, 0.2F, 0.15F, 0F, 0.2F, 0.15F, 0F, 0.2F); // Box 33
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-3.2F, 7.4F, -3.45F, 1, 2, 1, 0F,-0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F); // Box 19
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-0.5F, 1.4F, -2.15F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 39
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-3.16F, 2.5F, -2.2F, 3, 1, 1, 0F,-0.35F, 0.05F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.35F, 0.05F, 0F, 0F, 0F, 0F, -0.88F, 0.75F, 0F, -0.88F, 0.75F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-3.8F, 4F, -2.15F, 3, 2, 1, 0F,-1F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 1.5F, 0F, 0F, -0.5F, 0F, -1F, 0.3F, 0F, -1F, 0.3F, 0F, 0F, -0.5F, 0F); // Box 52
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(0.8F, 4F, -2.15F, 3, 2, 1, 0F,0F, 0.5F, 0F, -1F, 1.5F, 0F, -1F, 1.5F, 0F, 0F, 0.5F, 0F, -1F, 0.3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0.3F, 0F); // Box 53
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-3.5F, -0.2F, -1.7F, 2, 1, 4, 0F,0.25F, 0F, -0.425F, -0.75F, 0F, -0.425F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.7F, 0F, -0.425F, -0.75F, 0F, -0.425F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 0
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(1.5F, -0.2F, -1.7F, 2, 1, 4, 0F,-0.75F, 0F, -0.425F, 0.25F, 0F, -0.425F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.425F, -0.7F, 0F, -0.425F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-3F, 0.8F, 0.299999999999997F, 6, 2, 2, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F); // Box 46
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-1.8F, 2.5F, 1.2F, 1, 6, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 47
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(0.8F, 2.5F, 1.2F, 1, 6, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 48
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-0.5F, 1.5F, -2.5F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 5
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-0.5F, 4F, -2.5F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 6
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-0.5F, 6.5F, -2.5F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 7
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addBox(-3.9F, 9.5F, -2.15F, 3, 2, 1, 0F); // Box 79
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addBox(-3.9F, 8.5F, -2.2F, 3, 1, 1, 0F); // Box 80
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addBox(0.9F, 9.5F, -2.15F, 3, 2, 1, 0F); // Box 81
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addBox(0.9F, 8.5F, -2.2F, 3, 1, 1, 0F); // Box 82
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-3.2F, 7.8F, -3.5F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 84
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(-0.5F, 9F, -2.5F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 85
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(0.16F, 2.5F, -2.2F, 3, 1, 1, 0F,-0.5F, -0.7F, 0F, -0.35F, 0.05F, 0F, -0.35F, 0.05F, 0F, -0.5F, -0.7F, 0F, -0.88F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.88F, 0.75F, 0F); // Box 87
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-2.6F, 3.35F, -2.52F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F); // Box 88
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(1.6F, 3.35F, -2.52F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F); // Box 89
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-3.5F, 2.88657986402541E-15F, -2.3F, 1, 7, 1, 0F,-0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F); // Box 28
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(2.5F, 2.88657986402541E-15F, -2.3F, 1, 7, 1, 0F,-0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F); // Box 29
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-3.5F, 0.3F, -2.27F, 1, 3, 1, 0F,0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 0
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(2.5F, 0.3F, -2.27F, 1, 3, 1, 0F,0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 1
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-3.5F, 5.25F, -2.35F, 1, 4, 1, 0F,-0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F); // Box 131
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(2.5F, 5.25F, -2.35F, 1, 4, 1, 0F,-0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F); // Box 132
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(2.5F, 5.25F, -2.65F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F); // Box 22
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(-3.5F, 5.25F, -2.65F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F); // Box 23
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(-3.5F, 3F, -2.35F, 1, 1, 1, 0F,-0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F); // Box 106
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(2.5F, 3F, -2.35F, 1, 1, 1, 0F,-0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F); // Box 107
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(1.7F, 7.5F, -3.1F, 2, 3, 1, 0F,0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0.3F, 0.2F, 0.1F, 0.3F, 0.2F, 0.1F, 0.3F, 0.2F, 0.1F, 0.3F, 0.2F); // Box 108
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(2.2F, 7.4F, -3.45F, 1, 2, 1, 0F,-0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F); // Box 109
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(2.2F, 7.8F, -3.5F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 110
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(1.7F, 6.8F, -3.2F, 2, 1, 2, 0F,0.15F, 0F, 0.2F, 0.15F, 0F, 0.2F, 0.15F, 0F, 0.2F, 0.15F, 0F, 0.2F, 0.15F, 0.5F, 0.2F, 0.15F, 0.5F, 0.2F, 0.15F, 0F, 0.2F, 0.15F, 0F, 0.2F); // Box 111
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(-3.5F, 0.5F, -2.35F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 112
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(-3.5F, 1.45F, -2.35F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 113
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(0F, -0.2F, 1.3F, 2, 1, 1, 0F,0F, -0.8F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(-2F, -0.2F, 1.3F, 2, 1, 1, 0F,-0.25F, -0.25F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 115
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(0.05F, 0.4F, 0.350000000000001F, 2, 2, 2, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 116
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(-2.05F, 0.4F, 0.350000000000001F, 2, 2, 2, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 117
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(0.8F, 2.3F, 1.32F, 1, 1, 1, 0F,-0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F); // Box 118
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(0.8F, 2.3F, 1.28F, 1, 2, 1, 0F,-0.18F, -0.15F, 0F, -0.18F, -0.15F, 0F, -0.18F, -0.15F, 0F, -0.18F, -0.15F, 0F, -0.18F, -0.15F, 0F, -0.18F, -0.15F, 0F, -0.18F, -0.15F, 0F, -0.18F, -0.15F, 0F); // Box 119
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addShapeBox(0.8F, 6.2F, 1.28F, 1, 3, 1, 0F,-0.18F, -0.5F, 0F, -0.18F, -0.5F, 0F, -0.18F, -0.5F, 0F, -0.18F, -0.5F, 0F, -0.18F, -0.15F, 0F, -0.18F, -0.15F, 0F, -0.18F, -0.15F, 0F, -0.18F, -0.15F, 0F); // Box 120
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addShapeBox(-1.8F, 6.2F, 1.28F, 1, 3, 1, 0F,-0.18F, -0.5F, 0F, -0.18F, -0.5F, 0F, -0.18F, -0.5F, 0F, -0.18F, -0.5F, 0F, -0.18F, -0.15F, 0F, -0.18F, -0.15F, 0F, -0.18F, -0.15F, 0F, -0.18F, -0.15F, 0F); // Box 121
		bodyModel[57].setRotationPoint(0F, 0F, 0F);

		bodyModel[58].addShapeBox(-1.8F, 2.3F, 1.28F, 1, 2, 1, 0F,-0.18F, -0.15F, 0F, -0.18F, -0.15F, 0F, -0.18F, -0.15F, 0F, -0.18F, -0.15F, 0F, -0.18F, -0.15F, 0F, -0.18F, -0.15F, 0F, -0.18F, -0.15F, 0F, -0.18F, -0.15F, 0F); // Box 122
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addShapeBox(-1.8F, 2.3F, 1.32F, 1, 1, 1, 0F,-0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F); // Box 123
		bodyModel[59].setRotationPoint(0F, 0F, 0F);

		bodyModel[60].addShapeBox(-2F, 8.3F, 2F, 4, 2, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[60].setRotationPoint(0F, 0F, 0F);

		bodyModel[61].addShapeBox(-2F, 7.2F, 2.03F, 4, 1, 2, 0F,0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F); // Box 116
		bodyModel[61].setRotationPoint(0F, 0F, 0F);

		bodyModel[62].addShapeBox(-2F, 10F, 2F, 4, 1, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, -0.25F, -0.5F, -0.3F, -0.25F, -0.5F, -0.3F, -0.25F, -0.5F, -0.3F, -0.25F); // Box 118
		bodyModel[62].setRotationPoint(0F, 0F, 0F);

		bodyModel[63].addShapeBox(0.5F, 8.2F, 3.05F, 1, 1, 1, 0F,-0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Box 121
		bodyModel[63].setRotationPoint(0F, 0F, 0F);

		bodyModel[64].addShapeBox(-1.5F, 8.2F, 3.05F, 1, 1, 1, 0F,-0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Box 123
		bodyModel[64].setRotationPoint(0F, 0F, 0F);

		bodyModel[65].addShapeBox(0.5F, 8F, 3.08F, 1, 1, 1, 0F,-0.32F, -0.35F, 0F, -0.32F, -0.35F, 0F, -0.32F, -0.35F, 0F, -0.32F, -0.35F, 0F, -0.32F, -0.35F, 0F, -0.32F, -0.35F, 0F, -0.32F, -0.35F, 0F, -0.32F, -0.35F, 0F); // Box 134
		bodyModel[65].setRotationPoint(0F, 0F, 0F);

		bodyModel[66].addShapeBox(-1.5F, 8F, 3.08F, 1, 1, 1, 0F,-0.32F, -0.35F, 0F, -0.32F, -0.35F, 0F, -0.32F, -0.35F, 0F, -0.32F, -0.35F, 0F, -0.32F, -0.35F, 0F, -0.32F, -0.35F, 0F, -0.32F, -0.35F, 0F, -0.32F, -0.35F, 0F); // Box 135
		bodyModel[66].setRotationPoint(0F, 0F, 0F);

		bodyModel[67].addShapeBox(0.8F, 2.3F, 1.37F, 1, 1, 1, 0F,-0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F); // Box 136
		bodyModel[67].setRotationPoint(0F, 0F, 0F);

		bodyModel[68].addShapeBox(-1.8F, 2.3F, 1.37F, 1, 1, 1, 0F,-0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F); // Box 137
		bodyModel[68].setRotationPoint(0F, 0F, 0F);

		bodyModel[69].addShapeBox(-3.55F, 8.5F, 2F, 1, 1, 1, 0F,0.5F, 0.6F, 0.2F, 0.5F, 0.6F, 0.2F, 0.5F, 0.6F, 0.2F, 0.5F, 0.6F, 0.2F, 0.5F, 0.6F, 0.2F, 0.5F, 0.6F, 0.2F, 0.5F, 0.6F, 0.2F, 0.5F, 0.6F, 0.2F); // Box 156
		bodyModel[69].setRotationPoint(0F, 0F, 0F);

		bodyModel[70].addShapeBox(-4.15F, 8.8F, 2.4F, 1, 1, 1, 0F,-0.15F, -0.05F, -0.15F, -0.15F, -0.05F, -0.15F, -0.15F, -0.05F, -0.15F, -0.15F, -0.05F, -0.15F, -0.15F, -0.05F, -0.15F, -0.15F, -0.05F, -0.15F, -0.15F, -0.05F, -0.15F, -0.15F, -0.05F, -0.15F); // Box 157
		bodyModel[70].setRotationPoint(0F, 0F, 0F);

		bodyModel[71].addShapeBox(-3.55F, 7.25F, 2F, 1, 1, 1, 0F,0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.5F, -0.3F, 0.2F, 0.5F, -0.3F, 0.2F, 0.5F, -0.3F, 0.2F, 0.5F, -0.3F, 0.2F); // Box 158
		bodyModel[71].setRotationPoint(0F, 0F, 0F);

		bodyModel[72].addShapeBox(-3.55F, 6.9F, 2.1F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 159
		bodyModel[72].setRotationPoint(0F, 0F, 0F);

		bodyModel[73].addShapeBox(2.1F, 7.5F, 2F, 2, 3, 1, 0F,-0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0.3F, 0.2F, -0.2F, 0.3F, 0.2F, -0.2F, 0.3F, 0.2F, -0.2F, 0.3F, 0.2F); // Box 142
		bodyModel[73].setRotationPoint(0F, 0F, 0F);

		bodyModel[74].addShapeBox(2.1F, 6.8F, 1.1F, 2, 1, 2, 0F,-0.15F, 0F, 0.2F, -0.15F, 0F, 0.2F, -0.15F, 0F, 0.2F, -0.15F, 0F, 0.2F, -0.15F, 0F, 0.2F, -0.15F, 0F, 0.2F, -0.15F, 0.5F, 0.2F, -0.15F, 0.5F, 0.2F); // Box 143
		bodyModel[74].setRotationPoint(0F, 0F, 0F);

		bodyModel[75].addShapeBox(2.6F, 7.4F, 2.35F, 1, 2, 1, 0F,-0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F); // Box 144
		bodyModel[75].setRotationPoint(0F, 0F, 0F);

		bodyModel[76].addShapeBox(2.6F, 7.8F, 2.4F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 145
		bodyModel[76].setRotationPoint(0F, 0F, 0F);

		bodyModel[77].addBox(-1.5F, -0.09F, -2.05F, 3, 2, 1, 0F); // Box 108
		bodyModel[77].setRotationPoint(0F, 0F, 0F);

		bodyModel[78].addShapeBox(2.5F, 1.45F, -2.35F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 165
		bodyModel[78].setRotationPoint(0F, 0F, 0F);

		bodyModel[79].addShapeBox(2.5F, 0.5F, -2.35F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 166
		bodyModel[79].setRotationPoint(0F, 0F, 0F);

		bodyModel[80].addShapeBox(-3.75F, 1.5F, -2.15F, 3, 1, 1, 0F,-0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F); // Box 48
		bodyModel[80].setRotationPoint(0F, 0F, 0F);

		bodyModel[81].addShapeBox(-3.7F, 7F, -3.1F, 2, 4, 1, 0F,-0.1F, 0F, 0.25F, -0.1F, 0F, 0.25F, -0.1F, 0F, 0.25F, -0.1F, 0F, 0.25F, -0.1F, -0.3F, 0.25F, -0.1F, -0.3F, 0.25F, -0.1F, -0.3F, 0.25F, -0.1F, -0.3F, 0.25F); // Box 414
		bodyModel[81].setRotationPoint(0F, 0F, 0F);

		bodyModel[82].addShapeBox(1.7F, 7F, -3.1F, 2, 4, 1, 0F,-0.1F, 0F, 0.25F, -0.1F, 0F, 0.25F, -0.1F, 0F, 0.25F, -0.1F, 0F, 0.25F, -0.1F, -0.3F, 0.25F, -0.1F, -0.3F, 0.25F, -0.1F, -0.3F, 0.25F, -0.1F, -0.3F, 0.25F); // Box 415
		bodyModel[82].setRotationPoint(0F, 0F, 0F);

		bodyModel[83].addShapeBox(-3.5F, 3.3F, -2.27F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 170
		bodyModel[83].setRotationPoint(0F, 0F, 0F);

		bodyModel[84].addShapeBox(2.5F, 3.3F, -2.27F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 171
		bodyModel[84].setRotationPoint(0F, 0F, 0F);

		bodyModel[85].addShapeBox(2.1F, 7F, 2F, 2, 4, 1, 0F,-0.3F, 0F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, -0.3F, 0.25F, -0.3F, -0.3F, 0.25F, -0.3F, -0.3F, 0.25F, -0.3F, -0.3F, 0.25F); // Box 131
		bodyModel[85].setRotationPoint(0F, 0F, 0F);

		bodyModel[86].addShapeBox(-3.5F, 3F, -2.4F, 1, 1, 1, 0F,-0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 132
		bodyModel[86].setRotationPoint(0F, 0F, 0F);

		bodyModel[87].addShapeBox(2.5F, 3F, -2.4F, 1, 1, 1, 0F,-0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 133
		bodyModel[87].setRotationPoint(0F, 0F, 0F);

		bodyModel[88].addShapeBox(-3F, 0F, -2.54F, 7, 10, 5, 0F,0F, 0.15F, -0.3F, -6.25F, 0.15F, -0.3F, -6.25F, 0.15F, -0.3F, 0F, 0.15F, -0.3F, -7F, 0F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, -7F, 0F, -0.3F); // Box 121
		bodyModel[88].setRotationPoint(0F, 0F, 0F);

		bodyModel[89].addShapeBox(3.75F, 10.5F, -2F, 2, 3, 4, 0F,-0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F); // Box 122
		bodyModel[89].setRotationPoint(0F, 0F, 0F);

		bodyModel[90].addShapeBox(3.6F, 9.5F, -2F, 2, 1, 4, 0F,-0.4F, 0.5F, 0.3F, -0.3F, 0.5F, 0.3F, -0.3F, 0.5F, 0.3F, -0.4F, 0.5F, 0.3F, -0.4F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.4F, 0F, 0.3F); // Box 126
		bodyModel[90].setRotationPoint(0F, 0F, 0F);

		bodyModel[91].addShapeBox(3.8F, 10.6F, -1.5F, 2, 3, 3, 0F,-0.25F, 0.2F, 0.2F, -0.25F, 0.2F, 0.2F, -0.25F, 0.2F, 0.2F, -0.25F, 0.2F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F); // Box 103
		bodyModel[91].setRotationPoint(0F, 0F, 0F);

		bodyModel[92].addShapeBox(3.57F, 10.5F, -0.5F, 2, 2, 1, 0F,0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.33F); // Box 104
		bodyModel[92].setRotationPoint(0F, 0F, 0F);

		bodyModel[93].addShapeBox(4.62F, 11F, -0.5F, 1, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 105
		bodyModel[93].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 1
		leftArmModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 3
		leftArmModel[2] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 49
		leftArmModel[3] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 126

		leftArmModel[0].addShapeBox(-1F, -2.1F, -2F, 4, 9, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 1
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 6.5F, -2F, 4, 2, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F); // Box 3
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-0.95F, -2.3F, -1F, 4, 1, 2, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 49
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(2.15F, -2F, -1.5F, 1, 3, 3, 0F,0F, -0.9F, -0.5F, 0F, -0.9F, -0.5F, 0F, -0.9F, -0.5F, 0F, -0.9F, -0.5F, 0F, -0.9F, -0.5F, 0F, -0.9F, -0.5F, 0F, -0.9F, -0.5F, 0F, -0.9F, -0.5F); // Box 126
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 2
		rightArmModel[1] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 2
		rightArmModel[2] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 48
		rightArmModel[3] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 127

		rightArmModel[0].addShapeBox(-3F, -2.1F, -2F, 4, 9, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 6.5F, -2F, 4, 2, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F); // Box 2
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3.05F, -2.3F, -1F, 4, 1, 2, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 48
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3.15F, -2F, -1.5F, 1, 3, 3, 0F,0F, -0.9F, -0.5F, 0F, -0.9F, -0.5F, 0F, -0.9F, -0.5F, 0F, -0.9F, -0.5F, 0F, -0.9F, -0.5F, 0F, -0.9F, -0.5F, 0F, -0.9F, -0.5F, 0F, -0.9F, -0.5F); // Box 127
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 0
		leftLegModel[1] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 24
		leftLegModel[2] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 63
		leftLegModel[3] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 64

		leftLegModel[0].addShapeBox(-2F, -0.0999999999999996F, -2F, 4, 12, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 0
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 7.1F, -2.4F, 4, 5, 5, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Box 24
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(1.1F, 0.5F, -1.5F, 1, 1, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 63
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(1.05F, 1.5F, -1.5F, 1, 3, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 64
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 5
		rightLegModel[1] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 25
		rightLegModel[2] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 67
		rightLegModel[3] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 68

		rightLegModel[0].addShapeBox(-2F, -0.0999999999999996F, -2F, 4, 12, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 5
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 7.1F, -2.4F, 4, 5, 5, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Box 25
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2.1F, 0.5F, -1.5F, 1, 1, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 67
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2.05F, 1.5F, -1.5F, 1, 3, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 68
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);
	}
}