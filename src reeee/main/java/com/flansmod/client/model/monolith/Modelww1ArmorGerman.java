//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 22.02.2016 - 19:45:05
// Last changed on: 22.02.2016 - 19:45:05

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class Modelww1ArmorGerman extends ModelCustomArmour //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public Modelww1ArmorGerman() //Same as Filename
	{
		headModel = new ModelRendererTurbo[14];
		bodyModel = new ModelRendererTurbo[47];
		leftArmModel = new ModelRendererTurbo[2];
		rightArmModel = new ModelRendererTurbo[2];
		leftLegModel = new ModelRendererTurbo[3];
		rightLegModel = new ModelRendererTurbo[3];
		skirtFrontModel = new ModelRendererTurbo[2];
		skirtRearModel = new ModelRendererTurbo[3];

		initheadModel_1();
		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
		initskirtFrontModel_1();
		initskirtRearModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 88
		headModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 88
		headModel[2] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 88
		headModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 88
		headModel[4] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 88
		headModel[5] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 88
		headModel[6] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 88
		headModel[7] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 88
		headModel[8] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 88
		headModel[9] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 88
		headModel[10] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 88
		headModel[11] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 88
		headModel[12] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 88
		headModel[13] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 88

		headModel[0].addShapeBox(-9F, 5F, -9F, 18, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 88
		headModel[0].setRotationPoint(0F, -28F, 0F);

		headModel[1].addShapeBox(-9F, 0F, -9F, 18, 5, 18, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		headModel[1].setRotationPoint(0F, -28F, 0F);

		headModel[2].addShapeBox(-8F, -2F, -8F, 16, 2, 16, 0F,-2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		headModel[2].setRotationPoint(0F, -28F, 0F);

		headModel[3].addShapeBox(-9F, 7F, -8F, 1, 1, 7, 0F,0F, 1F, 1F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 4F, 0F, 1F, 4F, 0F); // Box 88
		headModel[3].setRotationPoint(0F, -28F, 0F);

		headModel[4].addShapeBox(-9F, 7F, -10F, 18, 1, 2, 0F,0F, 1F, -1F, 0F, 1F, -1F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 88
		headModel[4].setRotationPoint(0F, -28F, 0F);

		headModel[5].addShapeBox(-9F, 5F, -1F, 18, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 88
		headModel[5].setRotationPoint(0F, -28F, 0F);

		headModel[6].addShapeBox(-9F, 8F, -1F, 1, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 1F, 2F, 0F, 0F, 2F, 0F, 0F, 3F, -1F, 1F, 3F, 1F); // Box 88
		headModel[6].setRotationPoint(0F, -28F, 0F);

		headModel[7].addShapeBox(8F, 8F, -1F, 1, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 2F, 0F, 1F, 2F, 0F, 1F, 3F, 1F, 0F, 3F, -1F); // Box 88
		headModel[7].setRotationPoint(0F, -28F, 0F);

		headModel[8].addShapeBox(8F, 7F, -8F, 1, 1, 7, 0F,0F, 1F, 0F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 1F, 4F, 0F, 0F, 4F, 0F); // Box 88
		headModel[8].setRotationPoint(0F, -28F, 0F);

		headModel[9].addShapeBox(-8F, 9F, 8F, 16, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 1F, 2F, 0F, 1F); // Box 88
		headModel[9].setRotationPoint(0F, -28F, 0F);

		headModel[10].addShapeBox(8F, 11F, -3F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 88
		headModel[10].setRotationPoint(0F, -28F, 0F);

		headModel[11].addShapeBox(-9F, 16F, -6F, 18, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 88
		headModel[11].setRotationPoint(0F, -28F, 0F);

		headModel[12].addShapeBox(-9F, 11F, -3F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 88
		headModel[12].setRotationPoint(0F, -28F, 0F);

		headModel[13].addShapeBox(-9.5F, 4F, -1F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		headModel[13].setRotationPoint(0F, -28F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 67
		bodyModel[1] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 68
		bodyModel[2] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 69
		bodyModel[3] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 70
		bodyModel[4] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 71
		bodyModel[5] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 72
		bodyModel[6] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 73
		bodyModel[7] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 74
		bodyModel[8] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 75
		bodyModel[9] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 87
		bodyModel[10] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 88
		bodyModel[11] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 89
		bodyModel[12] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 90
		bodyModel[13] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 91
		bodyModel[14] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 92
		bodyModel[15] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 93
		bodyModel[16] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 94
		bodyModel[17] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 95
		bodyModel[18] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 96
		bodyModel[19] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 97
		bodyModel[20] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 98
		bodyModel[21] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 99
		bodyModel[22] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 104
		bodyModel[23] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 104
		bodyModel[24] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 104
		bodyModel[25] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 104
		bodyModel[26] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 104
		bodyModel[27] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 105
		bodyModel[28] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 106
		bodyModel[29] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 107
		bodyModel[30] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 108
		bodyModel[31] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 109
		bodyModel[32] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 113
		bodyModel[33] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 114
		bodyModel[34] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 115
		bodyModel[35] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 116
		bodyModel[36] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 117
		bodyModel[37] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 118
		bodyModel[38] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 119
		bodyModel[39] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 120
		bodyModel[40] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 121
		bodyModel[41] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 122
		bodyModel[42] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 123
		bodyModel[43] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 124
		bodyModel[44] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 125
		bodyModel[45] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 126
		bodyModel[46] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 127

		bodyModel[0].addShapeBox(-8.5F, -12.5F, -4.5F, 17, 25, 9, 0F,-0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-3.5F, -12.5F, -5.5F, 12, 25, 1, 0F,0F, -2F, -0.5F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-0.5F, -10.5F, -5F, 1, 1, 1, 0F,0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box 69
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-0.5F, -7.5F, -5F, 1, 1, 1, 0F,0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box 70
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-0.5F, -4.5F, -5F, 1, 1, 1, 0F,0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box 71
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-0.5F, -1.5F, -5F, 1, 1, 1, 0F,0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box 72
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-0.5F, 1.5F, -5F, 1, 1, 1, 0F,0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box 73
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-0.5F, 4.5F, -5F, 1, 1, 1, 0F,0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box 74
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-0.5F, 7.5F, -5F, 1, 1, 1, 0F,0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box 75
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-9F, 4.5F, -5.25F, 18, 2, 10, 0F,-0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-7F, -12.5F, -5.25F, 2, 17, 10, 0F,-0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(5F, -12.5F, -5.25F, 2, 17, 10, 0F,-0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(5F, -13.5F, -5.25F, 2, 1, 10, 0F,-0.01F, -0.5F, -0.51F, -0.01F, -0.5F, -0.51F, -0.01F, -0.5F, -0.51F, -0.01F, -0.5F, -0.51F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-7F, -13.5F, -5.25F, 2, 1, 10, 0F,-0.01F, -0.5F, -0.51F, -0.01F, -0.5F, -0.51F, -0.01F, -0.5F, -0.51F, -0.01F, -0.5F, -0.51F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-8F, 3.5F, -6.25F, 6, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-8F, 2.5F, -6.25F, 6, 2, 2, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 93
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-7F, 4.5F, -6.25F, 1, 1, 2, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-4F, 4.5F, -6.25F, 1, 1, 2, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(2F, 3.5F, -6.25F, 6, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(3F, 4.5F, -6.25F, 1, 1, 2, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(6F, 4.5F, -6.25F, 1, 1, 2, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(2F, 2.5F, -6.25F, 6, 2, 2, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 99
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-9F, -8.5F, 4.5F, 18, 13, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-9F, -11.5F, 4.5F, 18, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 104
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-9F, -11.5F, 8.5F, 18, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0.5F, -1.5F, -1.5F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F); // Box 104
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-9F, -8.5F, 8.5F, 18, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 104
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-9F, -8.5F, 8.5F, 18, 8, 3, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1F, 0F, -2F, -1F, 0F, -2F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 104
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-5F, -0.5F, 10F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(3F, -0.5F, 10F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(7F, 4.5F, 4.5F, 2, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(9F, 4.5F, 4.5F, 1, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 108
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(6F, 4.5F, 4.5F, 1, 5, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 109
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(7.5F, 9.5F, 5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(6.5F, 9.5F, 5F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 114
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(8.5F, 9.5F, 5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 115
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(7F, 10.5F, 5.5F, 2, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(1F, 4.5F, 4.5F, 1, 5, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 117
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(2F, 4.5F, 4.5F, 2, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(4F, 4.5F, 4.5F, 1, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 119
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(3.5F, 9.5F, 5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 120
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(2.5F, 9.5F, 5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(1.5F, 9.5F, 5F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 122
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(2F, 10.5F, 5.5F, 2, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(-8F, 5F, 4.75F, 8, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 124
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(-8F, 6F, 4.75F, 8, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(-7F, 7F, 4.75F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 126
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(-2F, 7F, 4.75F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 127
		bodyModel[46].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 64
		leftArmModel[1] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 64

		leftArmModel[0].addShapeBox(2.5F, 8.5F, -4.5F, 9, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 64
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(3F, -14F, -4F, 8, 23, 8, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 1F, 0.1F, 1F, 1F, 0.1F, 1F, 1F, 0.1F, 1F, 1F, 0.1F, 1F); // Box 64
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 64
		rightArmModel[1] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 64

		rightArmModel[0].addShapeBox(-11F, -14F, -4F, 8, 23, 8, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 1F, 0.1F, 1F, 1F, 0.1F, 1F, 1F, 0.1F, 1F, 1F, 0.1F, 1F); // Box 64
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-11.5F, 8.5F, -4.5F, 9, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 64
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 78
		leftLegModel[1] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 128
		leftLegModel[2] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 129

		leftLegModel[0].addShapeBox(-2F, 0.5F, -4F, 8, 18, 8, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 78
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 20F, -4F, 8, 4, 8, 0F,0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 128
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 18.5F, -4F, 8, 1, 8, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 129
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 77
		rightLegModel[1] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 130
		rightLegModel[2] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 135

		rightLegModel[0].addShapeBox(-6F, 0.5F, -4F, 8, 18, 8, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 77
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-6F, 18.5F, -4F, 8, 1, 8, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 130
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-6F, 20F, -4F, 8, 4, 8, 0F,0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 135
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtFrontModel_1()
	{
		skirtFrontModel[0] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 83
		skirtFrontModel[1] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 84

		skirtFrontModel[0].addShapeBox(-8.5F, 0.5F, -4.5F, 10, 13, 1, 0F,-0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, -1.01F, 0F, -0.01F, 2F, 0F, 2F, 0F, -8F, 0F, 0F, -8F, 0F, 1F, 0F, -2F); // Box 83
		skirtFrontModel[0].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[1].addShapeBox(-3.5F, 0.5F, -5F, 12, 13, 1, 0F,-0.01F, 0F, -0.01F, -0.01F, 0F, -0.41F, -1.01F, 0F, 0.49F, -0.01F, 0F, -0.01F, 0F, -10F, 0F, 2F, 0F, 1.5F, 1F, 0F, -1.5F, 0F, -10F, 0F); // Box 84
		skirtFrontModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtRearModel_1()
	{
		skirtRearModel[0] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 79
		skirtRearModel[1] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 85
		skirtRearModel[2] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 86

		skirtRearModel[0].addShapeBox(-8.5F, 0.5F, 3.5F, 17, 13, 1, 0F,-1.01F, 0F, -0.01F, -1.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, 1F, 0F, -2F, 1F, 0F, -2F, 2F, 0F, 2F, 2F, 0F, 2F); // Box 79
		skirtRearModel[0].setRotationPoint(0F, 0F, 0F);

		skirtRearModel[1].addShapeBox(-8.5F, 0.5F, -4.5F, 1, 13, 9, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 2F, -2F, 0F, 1F, -2F, 0F, 1F, 2F, 0F, 2F); // Box 85
		skirtRearModel[1].setRotationPoint(0F, 0F, 0F);

		skirtRearModel[2].addShapeBox(7.5F, 0.5F, -4.5F, 1, 13, 9, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 1F, 2F, 0F, 2F, 2F, 0F, 2F, -2F, 0F, 1F); // Box 86
		skirtRearModel[2].setRotationPoint(0F, 0F, 0F);
	}
}