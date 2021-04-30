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

public class ModelSerbianPolice extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelSerbianPolice() //Same as Filename
	{
		headModel = new ModelRendererTurbo[15];
		headModel[0] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 0
		headModel[1] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 3
		headModel[2] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 15
		headModel[3] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 6
		headModel[4] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 7
		headModel[5] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 8
		headModel[6] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 12
		headModel[7] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 13
		headModel[8] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 14
		headModel[9] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 4
		headModel[10] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 5
		headModel[11] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 6
		headModel[12] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 9
		headModel[13] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 10
		headModel[14] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 11

		headModel[0].addShapeBox(-5F, -7F, -5F, 10, 3, 10, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-5F, -9F, -5F, 10, 2, 10, 0F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 3
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-5F, -5.5F, -5.6F, 10, 1, 1, 0F, -0.1F, -0.5F, -1.02F, -0.1F, -0.5F, -1.02F, -0.1F, -0.5F, 0.02F, -0.1F, -0.5F, 0.02F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(4F, -4.5F, -4F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.3F, -2F, 0.25F, -0.3F, -2F, 0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F); // Box 6
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(3.5F, -4.5F, -2F, 1, 2, 2, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, -1.3F, 0F, 0.75F, -1.3F, 0F, 1F, 0.3F, 0F, -1F, 0.3F, 0F); // Box 7
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(4F, -4.5F, 0F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 8
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-5F, -6.2F, -5F, 10, 1, 10, 0F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.5F, -0.4F, -0.2F, -0.5F, -0.4F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F); // Box 12
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-4.5F, -4F, -4.5F, 9, 4, 4, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -2.5F, -0.4F, 0F, -2.5F); // Box 13
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-4.5F, 0F, -4F, 9, 1, 1, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F); // Box 14
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-5F, -4.5F, -4F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.3F, -2F, -0.25F, -0.3F, -2F, -0.25F, -0.3F, 0F, 0.25F, -0.3F, 0F); // Box 4
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-5.5F, -4.5F, -2F, 1, 2, 2, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -1.3F, 0F, 0.25F, -1.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 5
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-5F, -4.5F, 0F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 6
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-4F, -4.5F, 4F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-4F, -3.5F, 4F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.3F, 0F); // Box 10
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(0F, -3.5F, 4F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.7F, 0F); // Box 11
		headModel[14].setRotationPoint(0F, 0F, 0F);


		bodyModel = new ModelRendererTurbo[43];
		bodyModel[0] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 50
		bodyModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 51
		bodyModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 52
		bodyModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 53
		bodyModel[4] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 33
		bodyModel[5] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 32
		bodyModel[6] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 34
		bodyModel[7] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 35
		bodyModel[8] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 37
		bodyModel[9] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 39
		bodyModel[10] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 1
		bodyModel[11] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 34
		bodyModel[14] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 62
		bodyModel[15] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 64
		bodyModel[16] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 0
		bodyModel[17] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 1
		bodyModel[18] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 11
		bodyModel[19] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 0
		bodyModel[20] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 7
		bodyModel[21] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 8
		bodyModel[22] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 9
		bodyModel[23] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 10
		bodyModel[24] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 12
		bodyModel[25] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 2
		bodyModel[26] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 3
		bodyModel[27] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 4
		bodyModel[28] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 7
		bodyModel[29] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 11
		bodyModel[30] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 12
		bodyModel[31] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 13
		bodyModel[32] = new ModelRendererTurbo(this, 9, 73, textureX, textureY); // Box 17
		bodyModel[33] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 23
		bodyModel[34] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 24
		bodyModel[35] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 25
		bodyModel[36] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 29
		bodyModel[37] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 30
		bodyModel[38] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 31
		bodyModel[39] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 82
		bodyModel[40] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 83
		bodyModel[41] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 84
		bodyModel[42] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Box 85

		bodyModel[0].addBox(0.9F, 2.5F, -2.2F, 3, 1, 1, 0F); // Box 50
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-3.9F, 2.5F, -2.2F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addBox(-3.9F, 3.5F, -2.15F, 3, 2, 1, 0F); // Box 52
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addBox(0.9F, 3.5F, -2.15F, 3, 2, 1, 0F); // Box 53
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 1.9F, -2F, 8, 10, 4, 0F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 33
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-3.9F, 8.5F, -2.2F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addBox(-3.9F, 9.5F, -2.15F, 3, 2, 1, 0F); // Box 34
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addBox(0.9F, 8.5F, -2.2F, 3, 1, 1, 0F); // Box 35
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addBox(0.9F, 9.5F, -2.15F, 3, 2, 1, 0F); // Box 37
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-0.5F, 1.4F, -2.15F, 1, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 39
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-4F, -0.1F, -2F, 4, 2, 4, 0F, 0F, 0F, 0.1F, -1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F); // Box 1
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-0.5F, -0.1F, -2.15F, 2, 2, 1, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-1.5F, -0.1F, -2.12F, 2, 2, 1, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 12
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(0F, -0.1F, -2F, 4, 2, 4, 0F, -1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F); // Box 34
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-4F, 7F, -2F, 8, 4, 4, 0F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 62
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-4F, 2.8F, -2F, 8, 4, 4, 0F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 64
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-4F, -0.199999999999999F, -2F, 4, 3, 4, 0F, 0F, 0F, 0.3F, 0F, -0.7F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.3F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.3F, 0F, 0.3F); // Box 0
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(0F, -0.199999999999999F, -2F, 4, 3, 4, 0F, 0F, -0.7F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 1
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-3.5F, 11F, -2.3F, 7, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 11
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-4F, 0F, -2.4F, 4, 3, 1, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(0F, 0F, -2.4F, 4, 3, 1, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F); // Box 7
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-3.5F, 3F, -2.4F, 3, 6, 1, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(0.25F, 3F, -2.4F, 3, 6, 1, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-4.5F, 6F, -2.4F, 1, 3, 1, 0F, -0.2F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 10
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(3.5F, 6F, -2.4F, 1, 3, 1, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.1F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.1F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-4F, 0F, 1.4F, 4, 3, 1, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 2
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(0F, 0F, 1.4F, 4, 3, 1, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 3
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-3F, 3F, 1.4F, 6, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F); // Box 4
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-2F, 6.2F, 1.46F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 7
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-2F, 3.6F, 1.46F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 11
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(1F, 4F, 1.45F, 1, 7, 1, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 12
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(-2F, 4F, 1.45F, 1, 7, 1, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 13
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-3.2F, 4.5F, -3.3F, 3, 4, 1, 0F, -0.15F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.15F, 0F, 0F); // Box 17
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(-3.3F, 2F, -2.7F, 2, 2, 1, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 23
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-3.3F, 1.9F, -2.78F, 2, 1, 1, 0F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F); // Box 24
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(-3.25F, 4.4F, -3.35F, 3, 2, 2, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F); // Box 25
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-2.5F, 6.5F, 1.9F, 5, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 29
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-2.5F, 8F, 1.9F, 5, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-3.5F, 6.9F, 1.5F, 7, 4, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(1.3F, 2F, -2.7F, 2, 2, 1, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 82
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(1.3F, 1.9F, -2.78F, 2, 1, 1, 0F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F); // Box 83
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(0.3F, 4.5F, -3.3F, 3, 4, 1, 0F, -0.15F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.15F, 0F, 0F); // Box 84
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(0.25F, 4.4F, -3.35F, 3, 2, 2, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F); // Box 85
		bodyModel[42].setRotationPoint(0F, 0F, 0F);


		leftArmModel = new ModelRendererTurbo[2];
		leftArmModel[0] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 1
		leftArmModel[1] = new ModelRendererTurbo(this, 68, 78, textureX, textureY); // Box 68

		leftArmModel[0].addShapeBox(-1F, -2.1F, -2F, 4, 10, 4, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 1
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(2.15F, -1.1F, -1.5F, 1, 7, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, -7F, 0F, -5F, -7F); // Box 68
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);


		rightArmModel = new ModelRendererTurbo[1];
		rightArmModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2

		rightArmModel[0].addShapeBox(-3F, -2.1F, -2F, 4, 10, 4, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);


		leftLegModel = new ModelRendererTurbo[4];
		leftLegModel[0] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 0
		leftLegModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 24
		leftLegModel[2] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 63
		leftLegModel[3] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 64

		leftLegModel[0].addShapeBox(-2F, -0.0999999999999996F, -2F, 4, 8, 4, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 0
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 7F, -2.4F, 4, 5, 5, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Box 24
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(1.1F, 1F, -1.5F, 1, 1, 3, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 63
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(1.05F, 2F, -1.5F, 1, 3, 3, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 64
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);


		rightLegModel = new ModelRendererTurbo[4];
		rightLegModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 5
		rightLegModel[1] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 25
		rightLegModel[2] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 67
		rightLegModel[3] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 68

		rightLegModel[0].addShapeBox(-2F, -0.0999999999999996F, -2F, 4, 8, 4, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 5
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 7F, -2.4F, 4, 5, 5, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Box 25
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2.1F, 1F, -1.5F, 1, 1, 3, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 67
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2.05F, 2F, -1.5F, 1, 3, 3, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 68
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);


	}
}