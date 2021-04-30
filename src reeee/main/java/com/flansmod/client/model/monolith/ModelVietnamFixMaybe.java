//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
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

public class ModelVietnamFixMaybe extends ModelCustomArmour //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelVietnamFixMaybe() //Same as Filename
	{
		headModel = new ModelRendererTurbo[7];
		bodyModel = new ModelRendererTurbo[55];
		leftArmModel = new ModelRendererTurbo[3];
		rightArmModel = new ModelRendererTurbo[2];
		leftLegModel = new ModelRendererTurbo[2];
		rightLegModel = new ModelRendererTurbo[2];

		initheadModel_1();
		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Import Box3
		headModel[1] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Import Box3
		headModel[2] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Import Box3
		headModel[3] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Import Box3
		headModel[4] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Import Box3
		headModel[5] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 81
		headModel[6] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 82

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

		headModel[5].addShapeBox(-5F, -6F, -5F, 10, 1, 5, 0F,-0.65F, 0F, -0.45F, -0.65F, 0F, -0.45F, -0.65F, -0.6F, 0F, -0.65F, -0.6F, 0F, -0.6F, -0.6F, -0.45F, -0.6F, -0.6F, -0.45F, -0.6F, 0F, 0F, -0.6F, 0F, 0F); // Box 81
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-5F, -5.4F, 0F, 10, 1, 5, 0F,-0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, -0.4F, -0.65F, 0F, -0.4F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, -0.4F, -0.6F, -0.6F, -0.4F); // Box 82
		headModel[6].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 50
		bodyModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 51
		bodyModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 52
		bodyModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 53
		bodyModel[5] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 11
		bodyModel[6] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 12
		bodyModel[7] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 26
		bodyModel[8] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 28
		bodyModel[9] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 29
		bodyModel[10] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 37
		bodyModel[11] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 0
		bodyModel[12] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 2
		bodyModel[13] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 0
		bodyModel[14] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 1
		bodyModel[15] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 3
		bodyModel[16] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 4
		bodyModel[17] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 6
		bodyModel[18] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 5
		bodyModel[19] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 6
		bodyModel[20] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 7
		bodyModel[21] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 33
		bodyModel[22] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 34
		bodyModel[23] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 30
		bodyModel[24] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 32
		bodyModel[25] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 33
		bodyModel[26] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 16
		bodyModel[27] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 17
		bodyModel[28] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 18
		bodyModel[29] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 19
		bodyModel[30] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 20
		bodyModel[31] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 0
		bodyModel[32] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 44
		bodyModel[33] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 46
		bodyModel[34] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 47
		bodyModel[35] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 48
		bodyModel[36] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 29
		bodyModel[37] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 30
		bodyModel[38] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 51
		bodyModel[39] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 52
		bodyModel[40] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 53
		bodyModel[41] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 54
		bodyModel[42] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 10
		bodyModel[43] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 11
		bodyModel[44] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 12
		bodyModel[45] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 26
		bodyModel[46] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 27
		bodyModel[47] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 28
		bodyModel[48] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 66
		bodyModel[49] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 67
		bodyModel[50] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 68
		bodyModel[51] = new ModelRendererTurbo(this, 417, 157, textureX, textureY); // Box 88
		bodyModel[52] = new ModelRendererTurbo(this, 417, 135, textureX, textureY); // Box 89
		bodyModel[53] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 90
		bodyModel[54] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 91

		bodyModel[0].addShapeBox(-4F, -0.1F, -2F, 4, 2, 4, 0F,0F, 0F, 0.1F, -1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F); // Box 1
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addBox(0.9F, 2.5F, -2.2F, 3, 1, 1, 0F); // Box 50
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addBox(-3.9F, 2.5F, -2.2F, 3, 1, 1, 0F); // Box 51
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addBox(-3.9F, 3.5F, -2.15F, 3, 2, 1, 0F); // Box 52
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addBox(0.9F, 3.5F, -2.15F, 3, 2, 1, 0F); // Box 53
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-0.5F, -0.1F, -2.15F, 2, 2, 1, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-1.5F, -0.1F, -2.12F, 2, 2, 1, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 12
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-4F, 8.7F, -2F, 4, 1, 4, 0F,0.2F, 0.3F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.3F, 0.25F, 0.2F, 0.3F, 0.25F, 0.2F, 0.3F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.3F, 0.25F, 0.2F, 0.3F, 0.25F); // Box 26
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-3.5F, -0.2F, -2.25F, 1, 9, 1, 0F,-0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F); // Box 28
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(2.5F, -0.2F, -2.25F, 1, 9, 1, 0F,-0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F); // Box 29
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-1F, 8.7F, -2.3F, 1, 1, 1, 0F,-0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F); // Box 37
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-3.5F, 3.8F, -2.3F, 1, 1, 1, 0F,-0.15F, -0.2F, 0F, -0.15F, -0.2F, 0F, -0.15F, -0.2F, 0F, -0.15F, -0.2F, 0F, -0.15F, -0.2F, 0F, -0.15F, -0.2F, 0F, -0.15F, -0.2F, 0F, -0.15F, -0.2F, 0F); // Box 0
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(2.5F, 3.8F, -2.3F, 1, 1, 1, 0F,-0.15F, -0.2F, 0F, -0.15F, -0.2F, 0F, -0.15F, -0.2F, 0F, -0.15F, -0.2F, 0F, -0.15F, -0.2F, 0F, -0.15F, -0.2F, 0F, -0.15F, -0.2F, 0F, -0.15F, -0.2F, 0F); // Box 2
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-3.5F, 0.0999999999999972F, -2.3F, 1, 2, 1, 0F,0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F); // Box 0
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(2.5F, 0.0999999999999972F, -2.3F, 1, 2, 1, 0F,0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F); // Box 1
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(0F, 8.7F, -2.3F, 1, 1, 1, 0F,-0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F); // Box 3
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(0F, 8.7F, -2F, 4, 1, 4, 0F,0F, 0.3F, 0.25F, 0.2F, 0.3F, 0.25F, 0.2F, 0.3F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.3F, 0.25F, 0.2F, 0.3F, 0.25F, 0.2F, 0.3F, 0.25F, 0F, 0.3F, 0.25F); // Box 4
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-0.5F, 8.7F, -2.75F, 1, 1, 1, 0F,-0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F); // Box 6
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-0.5F, 1.5F, -2.44F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 5
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-0.5F, 4F, -2.44F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 6
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-0.5F, 6.5F, -2.44F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 7
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-4F, 1.9F, -2F, 8, 10, 4, 0F,0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 33
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(0F, -0.1F, -2F, 4, 2, 4, 0F,-1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F); // Box 34
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-3.8F, 7.4F, -3F, 2, 3, 1, 0F,0.25F, 0F, 0.2F, 0.25F, 0F, 0.2F, 0.25F, 0F, 0.2F, 0.25F, 0F, 0.2F, 0.25F, 0.2F, 0.2F, 0.25F, 0.2F, 0.2F, 0.25F, 0.2F, 0.2F, 0.25F, 0.2F, 0.2F); // Box 30
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(1.8F, 7.4F, -3F, 2, 3, 1, 0F,0.25F, 0F, 0.2F, 0.25F, 0F, 0.2F, 0.25F, 0F, 0.2F, 0.25F, 0F, 0.2F, 0.25F, 0.2F, 0.2F, 0.25F, 0.2F, 0.2F, 0.25F, 0.2F, 0.2F, 0.25F, 0.2F, 0.2F); // Box 32
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-3.8F, 7.3F, -3.2F, 2, 1, 2, 0F,0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F); // Box 33
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-3.8F, 8.3F, -3.2F, 2, 1, 2, 0F,0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0F, -0.8F, 0.2F, 0F, -0.8F, 0.2F, 0F, -0.8F, 0.2F, 0F, -0.8F, 0.2F); // Box 16
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(1.8F, 8.3F, -3.2F, 2, 1, 2, 0F,0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0F, -0.8F, 0.2F, 0F, -0.8F, 0.2F, 0F, -0.8F, 0.2F, 0F, -0.8F, 0.2F); // Box 17
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(1.8F, 7.3F, -3.2F, 2, 1, 2, 0F,0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F); // Box 18
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-3.3F, 7.4F, -3.45F, 1, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 19
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(2.3F, 7.4F, -3.45F, 1, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 20
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(-3.5F, -0.2F, 0.3F, 2, 1, 2, 0F,0.3F, 0F, 0F, -0.7F, 0F, 0F, -0.5F, 0F, 0F, 0.3F, 0F, 0F, -0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(1.5F, -0.2F, 0.3F, 2, 1, 2, 0F,-0.7F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.5F, 0F, 0F, 0.3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.3F, 0F, 0F); // Box 44
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(-3F, 0.8F, 0.3F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F); // Box 46
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-2F, 1.3F, 1.2F, 1, 5, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 47
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(1F, 1.3F, 1.2F, 1, 5, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 48
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-2F, 7F, 1.5F, 4, 1, 3, 0F,0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, -0.5F, 0.35F, 0F, -0.5F, 0.35F, 0.5F, 0F, 0.35F, 0.5F, 0F, 0.35F, 0.5F, 0F, 0.35F, 0.5F, 0F); // Box 29
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-2F, 8.5F, 1.5F, 4, 3, 3, 0F,0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, -0.5F, 0F, 0.35F, -0.5F, 0F, 0.35F, -0.5F, 0F, 0.35F, -0.5F, 0F); // Box 30
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(1F, 6.75F, 1.2F, 1, 1, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 51
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(-2F, 6.75F, 1.2F, 1, 1, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 52
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(1F, 6F, 1.18F, 1, 1, 1, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 53
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(-2F, 6F, 1.18F, 1, 1, 1, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 54
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(-3.5F, 12F, 2F, 7, 1, 2, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 10
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(-3.5F, 11F, 2F, 7, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 11
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(-3.5F, 11.65F, 2F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 12
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(-3.3F, 7.6F, 2.9F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 26
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(-3.1F, 7.95F, 2.8F, 1, 1, 1, 0F,0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.5F, 0.2F, -0.3F, 0.5F, 0.2F, -0.3F, 0.5F, 0.2F, -0.3F, 0.5F); // Box 27
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(-3.1F, 9.2F, 2.8F, 1, 1, 1, 0F,0.2F, 0.6F, 0.5F, 0.2F, 0.6F, 0.5F, 0.2F, 0.6F, 0.5F, 0.2F, 0.6F, 0.5F, 0.2F, 0.6F, 0.5F, 0.2F, 0.6F, 0.5F, 0.2F, 0.6F, 0.5F, 0.2F, 0.6F, 0.5F); // Box 28
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(2.3F, 7.6F, 2.9F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 66
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(2.1F, 7.95F, 2.8F, 1, 1, 1, 0F,0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.5F, 0.2F, -0.3F, 0.5F, 0.2F, -0.3F, 0.5F, 0.2F, -0.3F, 0.5F); // Box 67
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(2.1F, 9.2F, 2.8F, 1, 1, 1, 0F,0.2F, 0.6F, 0.5F, 0.2F, 0.6F, 0.5F, 0.2F, 0.6F, 0.5F, 0.2F, 0.6F, 0.5F, 0.2F, 0.6F, 0.5F, 0.2F, 0.6F, 0.5F, 0.2F, 0.6F, 0.5F, 0.2F, 0.6F, 0.5F); // Box 68
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(1F, 1.6F, -2.11F, 80, 20, 1, 0F,0F, 0F, 0F, -77.25F, 0F, 0F, -77.25F, 0F, 0F, 0F, 0F, 0F, 0F, -19.25F, 0F, -77.25F, -19.25F, 0F, -77.25F, -19.25F, 0F, 0F, -19.25F, 0F); // Box 88
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(-3.75F, 1.6F, -2.11F, 80, 20, 1, 0F,0F, 0F, 0F, -77.25F, 0F, 0F, -77.25F, 0F, 0F, 0F, 0F, 0F, 0F, -19.25F, 0F, -77.25F, -19.25F, 0F, -77.25F, -19.25F, 0F, 0F, -19.25F, 0F); // Box 89
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(-2.9F, 3F, -2.55F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 90
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(1.9F, 3F, -2.55F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 91
		bodyModel[54].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 1
		leftArmModel[1] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 3
		leftArmModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 86

		leftArmModel[0].addShapeBox(-1F, -2.1F, -2F, 4, 6, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 1
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 3.9F, -2F, 4, 2, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F); // Box 3
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(2.11F, -1.75F, -1.25F, 1, 297, 201, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -198.5F, 0F, 0F, -198.5F, 0F, -294F, 0F, 0F, -294F, 0F, 0F, -294F, -198.5F, 0F, -294F, -198.5F); // Box 86
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 2
		rightArmModel[1] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 2

		rightArmModel[0].addShapeBox(-3F, -2.1F, -2F, 4, 6, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 3.9F, -2F, 4, 2, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F); // Box 2
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 0
		leftLegModel[1] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 24

		leftLegModel[0].addShapeBox(-2F, -0.0999999999999996F, -2F, 4, 12, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 0
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 7F, -2.4F, 4, 5, 5, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Box 24
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 5
		rightLegModel[1] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 25

		rightLegModel[0].addShapeBox(-2F, -0.0999999999999996F, -2F, 4, 12, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 5
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 7F, -2.4F, 4, 5, 5, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Box 25
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);
	}
}