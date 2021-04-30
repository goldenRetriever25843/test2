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

public class ModelModernFrench extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelModernFrench() //Same as Filename
	{
		headModel = new ModelRendererTurbo[20];
		bodyModel = new ModelRendererTurbo[52];
		leftArmModel = new ModelRendererTurbo[6];
		rightArmModel = new ModelRendererTurbo[6];
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
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 13
		headModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 14
		headModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 0
		headModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 3
		headModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 111
		headModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 10
		headModel[6] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 11
		headModel[7] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 113
		headModel[8] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 115
		headModel[9] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 128
		headModel[10] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 131
		headModel[11] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 132
		headModel[12] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 133
		headModel[13] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 134
		headModel[14] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 133
		headModel[15] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 3
		headModel[16] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 4
		headModel[17] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 5
		headModel[18] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 6
		headModel[19] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 76

		headModel[0].addShapeBox(-4.5F, -4F, -4.5F, 9, 4, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -2.5F, -0.4F, 0F, -2.5F); // Box 13
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4.5F, 0F, -4F, 9, 1, 1, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F); // Box 14
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4.5F, -8F, -4.5F, 9, 2, 9, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 0
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -9F, -4F, 8, 1, 8, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4.5F, -6.5F, -4.5F, 9, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 111
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4F, -5F, 3.7F, 4, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.1F, 0F); // Box 10
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(0F, -5F, 3.7F, 4, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.5F, 0F); // Box 11
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-5F, -4.5F, 0F, 1, 2, 5, 0F,-0.3F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0.2F, 0.2F, 0.5F, -0.5F, 0.2F, 0.5F, 0F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F); // Box 113
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-5F, -4.5F, -2.5F, 1, 2, 2, 0F,-0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0F, -1.4F, 0F, -0.3F, -1.4F, 0F, -0.5F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 115
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-5F, -6.1F, -5.05F, 10, 1, 10, 0F,-0.42F, -0.25F, -0.45F, -0.42F, -0.25F, -0.45F, -0.38F, -0.5F, -0.38F, -0.38F, -0.5F, -0.38F, -0.38F, -0.25F, -0.42F, -0.38F, -0.25F, -0.42F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 128
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-5F, -4.5F, -4.5F, 1, 1, 2, 0F,-0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, 0F, 0F, -1F, 0F, -0.3F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 131
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(4F, -4.5F, -4.5F, 1, 1, 2, 0F,0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.3F, -1F, 0F, 0F, -0.4F, 0F, -0.3F, -0.4F, 0F); // Box 132
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(4F, -4.5F, -2.5F, 1, 2, 2, 0F,0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.3F, -1.4F, 0F, 0F, -1.4F, 0F, 0.2F, 0.2F, 0F, -0.5F, 0.2F, 0F); // Box 133
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(4F, -4.5F, 0F, 1, 2, 5, 0F,0F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, -0.3F, -0.6F, -0.3F, 0F, -0.6F, -0.3F); // Box 134
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-4.5F, -5.5F, -5.6F, 9, 1, 1, 0F,0.16F, -0.55F, -1F, 0.16F, -0.55F, -1F, 0.16F, -0.55F, 0F, 0.16F, -0.55F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 133
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-5F, -7.2F, -5F, 10, 1, 10, 0F,-0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.6F, -0.2F, -0.65F, -0.6F, -0.2F, -0.65F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.3F, 0.2F, -0.5F, -0.3F, 0.2F, -0.5F); // Box 3
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(1F, -7.6F, -5.35F, 3, 2, 1, 0F,0F, 0.3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F); // Box 4
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-4F, -7.6F, -5.35F, 3, 2, 1, 0F,0F, 0F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F); // Box 5
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-1F, -7.6F, -5.35F, 2, 2, 1, 0F,0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 6
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-4.5F, -8.1F, -4.5F, 9, 1, 9, 0F,-0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.3F, -0.5F, -0.35F, -0.3F, -0.5F, -0.35F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.15F, 0F, -0.23F, -0.15F, 0F, -0.23F); // Box 76
		headModel[19].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 33
		bodyModel[1] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 11
		bodyModel[3] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 12
		bodyModel[4] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 34
		bodyModel[5] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 11
		bodyModel[6] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 62
		bodyModel[7] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 64
		bodyModel[8] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 0
		bodyModel[9] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 1
		bodyModel[10] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 41
		bodyModel[11] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 1
		bodyModel[12] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 2
		bodyModel[13] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 11
		bodyModel[14] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 12
		bodyModel[15] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 13
		bodyModel[16] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 14
		bodyModel[17] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 15
		bodyModel[18] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 16
		bodyModel[19] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 17
		bodyModel[20] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 10
		bodyModel[21] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 11
		bodyModel[22] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 12
		bodyModel[23] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 16
		bodyModel[24] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 17
		bodyModel[25] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 18
		bodyModel[26] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 19
		bodyModel[27] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 20
		bodyModel[28] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 21
		bodyModel[29] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 22
		bodyModel[30] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 0
		bodyModel[31] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 1
		bodyModel[32] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 10
		bodyModel[33] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 10
		bodyModel[34] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 9
		bodyModel[35] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 0
		bodyModel[36] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 69
		bodyModel[37] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 70
		bodyModel[38] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 32
		bodyModel[39] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 33
		bodyModel[40] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 34
		bodyModel[41] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 35
		bodyModel[42] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 36
		bodyModel[43] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 37
		bodyModel[44] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 40
		bodyModel[45] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 41
		bodyModel[46] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 42
		bodyModel[47] = new ModelRendererTurbo(this, 9, 105, textureX, textureY); // Box 43
		bodyModel[48] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 5
		bodyModel[49] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 3
		bodyModel[50] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 96
		bodyModel[51] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 99

		bodyModel[0].addShapeBox(-4F, 1.9F, -2F, 8, 10, 4, 0F,0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 33
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, -0.1F, -2F, 4, 2, 4, 0F,0.1F, 0F, 0.1F, -1F, 0F, 0.1F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F); // Box 1
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-0.5F, -0.1F, -2.15F, 2, 2, 1, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-1.5F, -0.1F, -2.12F, 2, 2, 1, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 12
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(0F, -0.1F, -2F, 4, 2, 4, 0F,-1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0F, -0.5F, 0.1F); // Box 34
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-2.5F, 11.2F, -2.3F, 5, 1, 1, 0F,0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, -0.8F, 0.3F, 0.2F, -0.8F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.8F, 0.3F, 0F, -0.8F); // Box 11
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4F, 7F, -2F, 8, 4, 4, 0F,0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 62
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-4F, 2.8F, -2F, 8, 4, 4, 0F,-0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 64
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-4F, -0.2F, -2F, 4, 3, 4, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.3F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.3F, 0F, 0.3F); // Box 0
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(0F, -0.2F, -2F, 4, 3, 4, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 1
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(1.2F, 6F, -3.4F, 2, 4, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 41
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-1F, 6F, -3.4F, 2, 4, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 1
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-3.2F, 6F, -3.4F, 2, 4, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 2
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-3.5F, 1F, 1.5F, 7, 9, 1, 0F,0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-3.5F, 4.3F, 1.6F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 12
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-3.5F, 2.7F, 1.6F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 13
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-3.5F, 1.1F, 1.6F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 14
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-3.5F, 5.9F, 1.6F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 15
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-3.5F, 7.5F, 1.6F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 16
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-3.5F, 9.1F, 1.6F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 17
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-3.2F, 5.9F, -3.6F, 2, 2, 1, 0F,0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, -0.5F, 0.3F, 0.05F, -0.5F, 0.3F, 0.05F, -0.5F, 0.3F, 0.05F, -0.5F, 0.3F); // Box 10
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-1F, 5.9F, -3.6F, 2, 2, 1, 0F,0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, -0.5F, 0.3F, 0.05F, -0.5F, 0.3F, 0.05F, -0.5F, 0.3F, 0.05F, -0.5F, 0.3F); // Box 11
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(1.2F, 5.9F, -3.6F, 2, 2, 1, 0F,0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, -0.5F, 0.3F, 0.05F, -0.5F, 0.3F, 0.05F, -0.5F, 0.3F, 0.05F, -0.5F, 0.3F); // Box 12
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-2F, 1F, 2.3F, 4, 9, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 16
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-1.5F, 7.5F, 2.35F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 17
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-1.5F, 5.9F, 2.35F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 18
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-1.5F, 4.3F, 2.35F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 19
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-1.5F, 2.7F, 2.35F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 20
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-1.5F, 1.25F, 2.35F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 21
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-1.5F, 8.95F, 2.35F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 22
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(1.3F, 2F, -2.8F, 1, 3, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 0
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(-2F, 3F, -2.75F, 3, 2, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 1
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(1.3F, 1.9F, -2.9F, 1, 1, 1, 0F,0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F); // Box 10
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(-3.5F, 9.1F, -2.7F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 10
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-3.5F, 7.5F, -2.7F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 9
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(-4.25F, -0.2F, -2.5F, 2, 5, 1, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 0
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(2.25F, -0.2F, -2.5F, 2, 5, 1, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 69
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-4F, 6.8F, -2.6F, 8, 4, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 70
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-4.25F, 0.5F, -2.6F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 32
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(2.25F, 0.5F, -2.6F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 33
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(-4.25F, 5.8F, -2.5F, 2, 1, 1, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 34
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(2.25F, 5.8F, -2.5F, 2, 1, 1, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 35
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(-3.75F, 4.8F, -2.4F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(2.75F, 4.8F, -2.4F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(-3.75F, 0.5F, -2.55F, 1, 4, 2, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 40
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(2.75F, 0.5F, -2.55F, 1, 4, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 41
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(-3.75F, 4.8F, -2.45F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 42
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(2.75F, 4.8F, -2.45F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 43
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(-3.5F, 3.3F, -2.35F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 5
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(-3.5F, 1.7F, -2.35F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 3
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(-3.5F, 0.1F, -2.35F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 96
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(-3.5F, 4.9F, -2.35F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 99
		bodyModel[51].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 3
		leftArmModel[1] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 1
		leftArmModel[2] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 59
		leftArmModel[3] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 60
		leftArmModel[4] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 115
		leftArmModel[5] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 111

		leftArmModel[0].addShapeBox(-1F, 6.5F, -2F, 4, 2, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F); // Box 3
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, -2.1F, -2F, 4, 9, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 1
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(2.05F, 2F, -1.5F, 1, 2, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F, 0.1F); // Box 59
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(2.1F, 1F, -1.5F, 1, 1, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 60
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(2.17F, 2F, -1.5F, 1, 2, 3, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F); // Box 115
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(2.11F, -0.75F, -1.4F, 1, 2, 3, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 111
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 2
		rightArmModel[1] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 2
		rightArmModel[2] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 61
		rightArmModel[3] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 62
		rightArmModel[4] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 114
		rightArmModel[5] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Box 112

		rightArmModel[0].addShapeBox(-3F, 6.5F, -2F, 4, 2, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F); // Box 2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, -2.1F, -2F, 4, 9, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 2
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3.1F, 1F, -1.5F, 1, 1, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 61
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3.05F, 2F, -1.5F, 1, 2, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F, 0.1F); // Box 62
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-3.17F, 2F, -1.5F, 1, 2, 3, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F); // Box 114
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-3.11F, -0.75F, -1.4F, 1, 2, 3, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 112
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 0
		leftLegModel[1] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 24
		leftLegModel[2] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 63
		leftLegModel[3] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 64

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
		rightLegModel[0] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 5
		rightLegModel[1] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 25
		rightLegModel[2] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 67
		rightLegModel[3] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 68

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