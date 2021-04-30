//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 29.08.2016 - 20:20:00
// Last changed on: 29.08.2016 - 20:20:00

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMower extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelMower() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[79];
		leftFrontWheelModel = new ModelRendererTurbo[9];
		rightFrontWheelModel = new ModelRendererTurbo[9];
		leftBackWheelModel = new ModelRendererTurbo[9];
		rightBackWheelModel = new ModelRendererTurbo[9];
		trailerModel = new ModelRendererTurbo[19];

		initbodyModel_1();
		initleftFrontWheelModel_1();
		initrightFrontWheelModel_1();
		initleftBackWheelModel_1();
		initrightBackWheelModel_1();
		inittrailerModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 11
		bodyModel[1] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 12
		bodyModel[2] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 31
		bodyModel[3] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 32
		bodyModel[4] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 35
		bodyModel[5] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 36
		bodyModel[6] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 37
		bodyModel[7] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 38
		bodyModel[8] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 39
		bodyModel[9] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 64
		bodyModel[10] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 65
		bodyModel[11] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 66
		bodyModel[12] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 68
		bodyModel[13] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 70
		bodyModel[14] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 71
		bodyModel[15] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 72
		bodyModel[16] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 73
		bodyModel[17] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 74
		bodyModel[18] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 75
		bodyModel[19] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 76
		bodyModel[20] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 77
		bodyModel[21] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 78
		bodyModel[22] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 79
		bodyModel[23] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 80
		bodyModel[24] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 81
		bodyModel[25] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 82
		bodyModel[26] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 83
		bodyModel[27] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 84
		bodyModel[28] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 85
		bodyModel[29] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 86
		bodyModel[30] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 87
		bodyModel[31] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 88
		bodyModel[32] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 89
		bodyModel[33] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 90
		bodyModel[34] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 91
		bodyModel[35] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 92
		bodyModel[36] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 95
		bodyModel[37] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 96
		bodyModel[38] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 97
		bodyModel[39] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 98
		bodyModel[40] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 95
		bodyModel[41] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 96
		bodyModel[42] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 97
		bodyModel[43] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 98
		bodyModel[44] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 99
		bodyModel[45] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 100
		bodyModel[46] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 101
		bodyModel[47] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 102
		bodyModel[48] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 104
		bodyModel[49] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 105
		bodyModel[50] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 106
		bodyModel[51] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 107
		bodyModel[52] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 108
		bodyModel[53] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 109
		bodyModel[54] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 110
		bodyModel[55] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 111
		bodyModel[56] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 112
		bodyModel[57] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 113
		bodyModel[58] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 114
		bodyModel[59] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 116
		bodyModel[60] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 117
		bodyModel[61] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 118
		bodyModel[62] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 120
		bodyModel[63] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 121
		bodyModel[64] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 122
		bodyModel[65] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 123
		bodyModel[66] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 124
		bodyModel[67] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 125
		bodyModel[68] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 126
		bodyModel[69] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 127
		bodyModel[70] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 128
		bodyModel[71] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 129
		bodyModel[72] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 130
		bodyModel[73] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 131
		bodyModel[74] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 132
		bodyModel[75] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 134
		bodyModel[76] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 135
		bodyModel[77] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 136
		bodyModel[78] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 137

		bodyModel[0].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 11
		bodyModel[0].setRotationPoint(-1F, -2F, -3F);

		bodyModel[1].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 12
		bodyModel[1].setRotationPoint(-1F, -2F, 1F);

		bodyModel[2].addShapeBox(-5F, 0F, -1F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[2].setRotationPoint(5F, -2F, 2.5F);
		bodyModel[2].rotateAngleZ = 0.10471976F;

		bodyModel[3].addShapeBox(-5F, 0F, -1F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[3].setRotationPoint(5F, -2F, -1.5F);
		bodyModel[3].rotateAngleZ = 0.10471976F;

		bodyModel[4].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[4].setRotationPoint(9F, -3F, -3F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 36
		bodyModel[5].setRotationPoint(9.5F, 0.5F, 2F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 37
		bodyModel[6].setRotationPoint(9.5F, 0.5F, -5F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 38
		bodyModel[7].setRotationPoint(9.5F, -2.5F, -3F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 39
		bodyModel[8].setRotationPoint(9.5F, -2.5F, 2F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 64
		bodyModel[9].setRotationPoint(-11F, -1F, -5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[10].setRotationPoint(-12F, -5F, -3F);

		bodyModel[11].addShapeBox(-5F, 0F, -5F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[11].setRotationPoint(3F, -3F, 0F);

		bodyModel[12].addShapeBox(-3F, 0F, -5F, 3, 1, 10, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 68
		bodyModel[12].setRotationPoint(-2F, -3F, 0F);

		bodyModel[13].addShapeBox(-3F, 0F, -5F, 3, 1, 3, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 70
		bodyModel[13].setRotationPoint(-5F, -5F, 7F);

		bodyModel[14].addShapeBox(-3F, 0F, -5F, 3, 1, 3, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 71
		bodyModel[14].setRotationPoint(-5F, -5F, 0F);

		bodyModel[15].addShapeBox(-5F, 0F, -5F, 7, 2, 6, 0F,3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[15].setRotationPoint(3F, -5F, 2F);

		bodyModel[16].addShapeBox(-3F, 0F, -5F, 3, 1, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 73
		bodyModel[16].setRotationPoint(-5F, -4F, 3F);

		bodyModel[17].addShapeBox(-3F, 0F, -5F, 3, 1, 4, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F); // Box 74
		bodyModel[17].setRotationPoint(-2F, -2F, 3F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[18].setRotationPoint(-8F, -6F, 0F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[19].setRotationPoint(-8F, -6F, -1F);

		bodyModel[20].addBox(0F, 0F, 0F, 3, 1, 10, 0F); // Box 77
		bodyModel[20].setRotationPoint(-11F, -6F, -5F);

		bodyModel[21].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 78
		bodyModel[21].setRotationPoint(-8F, -7F, -2F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 79
		bodyModel[22].setRotationPoint(-9F, -10F, -2F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[23].setRotationPoint(-9F, -10F, 1F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 81
		bodyModel[24].setRotationPoint(-9F, -7F, 1F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 82
		bodyModel[25].setRotationPoint(-9F, -7F, -2F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[26].setRotationPoint(-9F, -12F, 1F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[27].setRotationPoint(-9F, -12F, -2F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 85
		bodyModel[28].setRotationPoint(-9F, -12F, -1.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[29].setRotationPoint(-8F, -12F, -2F);

		bodyModel[30].addBox(0F, 0F, 0F, 8, 2, 4, 0F); // Box 87
		bodyModel[30].setRotationPoint(-9F, -2F, -2F);

		bodyModel[31].addShapeBox(-3F, 0F, -5F, 3, 1, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 88
		bodyModel[31].setRotationPoint(5F, -5F, 0F);

		bodyModel[32].addShapeBox(-3F, 0F, -5F, 3, 1, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 89
		bodyModel[32].setRotationPoint(5F, -5F, 7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 90
		bodyModel[33].setRotationPoint(2F, -5F, 1F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[34].setRotationPoint(2F, -5F, -3F);

		bodyModel[35].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 92
		bodyModel[35].setRotationPoint(2F, -7F, -1F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[36].setRotationPoint(-8F, -13F, -2F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 96
		bodyModel[37].setRotationPoint(-8F, -9F, -2F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0.25F, -0.5F, -1F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[38].setRotationPoint(-8F, -7F, -3F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, -0.5F, -1F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F); // Box 98
		bodyModel[39].setRotationPoint(-8F, -7F, 2F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[40].setRotationPoint(1F, -10F, -3F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 96
		bodyModel[41].setRotationPoint(1F, -7F, -3F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[42].setRotationPoint(1F, -12F, -3F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 0F, 0F); // Box 98
		bodyModel[43].setRotationPoint(5F, -12F, -3F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[44].setRotationPoint(5F, -12F, 2F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[45].setRotationPoint(10F, -11F, -2F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[46].setRotationPoint(10F, -11F, -3F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 1F); // Box 102
		bodyModel[47].setRotationPoint(10F, -11F, 2F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,-3F, 0F, -1F, 3F, -1F, -1F, 3F, -1F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[48].setRotationPoint(1F, -12F, -4F);

		bodyModel[49].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 105
		bodyModel[49].setRotationPoint(2F, -10F, -4F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,-1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[50].setRotationPoint(1F, -10F, -4F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 2F, -1F, 0F, 2F, 0F, -1F, 0F, 0F); // Box 107
		bodyModel[51].setRotationPoint(1F, -7F, -4F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,-3F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 0F); // Box 108
		bodyModel[52].setRotationPoint(1F, -12F, 3F);

		bodyModel[53].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 109
		bodyModel[53].setRotationPoint(2F, -10F, 3F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -1F, 0F, 0F); // Box 110
		bodyModel[54].setRotationPoint(1F, -10F, 3F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -1F, -1F, 0F, -1F); // Box 111
		bodyModel[55].setRotationPoint(1F, -7F, 3F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[56].setRotationPoint(7F, -8F, -4F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 2F, -1F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[57].setRotationPoint(7F, -4F, -4F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 1F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 114
		bodyModel[58].setRotationPoint(10F, -10F, -2.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[59].setRotationPoint(7F, -8F, 3F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -1F, 0F, 0F, -1F); // Box 117
		bodyModel[60].setRotationPoint(7F, -4F, 3F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[61].setRotationPoint(12F, -2F, -3F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 2F, 0F, 5F, 2F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[62].setRotationPoint(4F, -10F, 2.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 2F, 0F, 5F, 2F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[63].setRotationPoint(4F, -10F, -3.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F); // Box 122
		bodyModel[64].setRotationPoint(10F, -10F, 1.5F);

		bodyModel[65].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Box 123
		bodyModel[65].setRotationPoint(5F, -12F, -2F);
		bodyModel[65].rotateAngleZ = -0.2443461F;

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,2F, 4.5F, 0F, -2F, 4.5F, -1F, -2F, 4.5F, 0F, 2F, 4.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[66].setRotationPoint(12F, -3F, -4F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,2F, 4.5F, 0F, -2F, 4.5F, 0F, -2F, 4.5F, -1F, 2F, 4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 125
		bodyModel[67].setRotationPoint(12F, -3F, 2F);

		bodyModel[68].addShapeBox(-0.5F, -3F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[68].setRotationPoint(3F, -10F, 0F);
		bodyModel[68].rotateAngleZ = 0.57595865F;

		bodyModel[69].addShapeBox(-1.5F, -4F, -1.5F, 3, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[69].setRotationPoint(3F, -10F, 0F);
		bodyModel[69].rotateAngleZ = 0.57595865F;

		bodyModel[70].addShapeBox(-1.5F, -4F, 0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 128
		bodyModel[70].setRotationPoint(3F, -10F, 0F);
		bodyModel[70].rotateAngleZ = 0.57595865F;

		bodyModel[71].addShapeBox(-1.5F, -4F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[71].setRotationPoint(3F, -10F, 0F);
		bodyModel[71].rotateAngleZ = 0.57595865F;

		bodyModel[72].addShapeBox(0.5F, -4F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[72].setRotationPoint(3F, -10F, 0F);
		bodyModel[72].rotateAngleZ = 0.57595865F;

		bodyModel[73].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 131
		bodyModel[73].setRotationPoint(12F, -9F, -0.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[74].setRotationPoint(11F, -8F, -2F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[75].setRotationPoint(10F, -8F, -3F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 135
		bodyModel[76].setRotationPoint(10F, -8F, 2F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 3F, 0F, 6F, 3F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[77].setRotationPoint(2F, -8F, -3F);

		bodyModel[78].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 137
		bodyModel[78].setRotationPoint(2F, -11F, -3F);
		bodyModel[78].rotateAngleZ = 0.57595865F;
	}

	private void initleftFrontWheelModel_1()
	{
		leftFrontWheelModel[0] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 22
		leftFrontWheelModel[1] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 23
		leftFrontWheelModel[2] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 24
		leftFrontWheelModel[3] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 25
		leftFrontWheelModel[4] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 26
		leftFrontWheelModel[5] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 27
		leftFrontWheelModel[6] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 28
		leftFrontWheelModel[7] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 29
		leftFrontWheelModel[8] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 30

		leftFrontWheelModel[0].addShapeBox(-1F, -3F, -1F, 2, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		leftFrontWheelModel[0].setRotationPoint(10F, 1F, 5.5F);

		leftFrontWheelModel[1].addShapeBox(-3F, -1F, -1F, 2, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 23
		leftFrontWheelModel[1].setRotationPoint(10F, 1F, 5.5F);

		leftFrontWheelModel[2].addShapeBox(-3F, 1F, -1F, 2, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F); // Box 24
		leftFrontWheelModel[2].setRotationPoint(10F, 1F, 5.5F);

		leftFrontWheelModel[3].addShapeBox(-1F, 1F, -1F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 25
		leftFrontWheelModel[3].setRotationPoint(10F, 1F, 5.5F);

		leftFrontWheelModel[4].addShapeBox(1F, 1F, -1F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 26
		leftFrontWheelModel[4].setRotationPoint(10F, 1F, 5.5F);

		leftFrontWheelModel[5].addShapeBox(1F, -1F, -1F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 27
		leftFrontWheelModel[5].setRotationPoint(10F, 1F, 5.5F);

		leftFrontWheelModel[6].addShapeBox(1F, -3F, -1F, 2, 2, 3, 0F,0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 28
		leftFrontWheelModel[6].setRotationPoint(10F, 1F, 5.5F);

		leftFrontWheelModel[7].addShapeBox(-1F, -1F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		leftFrontWheelModel[7].setRotationPoint(10F, 1F, 6F);

		leftFrontWheelModel[8].addShapeBox(-3F, -3F, -1F, 2, 2, 3, 0F,-2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 30
		leftFrontWheelModel[8].setRotationPoint(10F, 1F, 5.5F);
	}

	private void initrightFrontWheelModel_1()
	{
		rightFrontWheelModel[0] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 13
		rightFrontWheelModel[1] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 14
		rightFrontWheelModel[2] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 15
		rightFrontWheelModel[3] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 16
		rightFrontWheelModel[4] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 17
		rightFrontWheelModel[5] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 18
		rightFrontWheelModel[6] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 19
		rightFrontWheelModel[7] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 20
		rightFrontWheelModel[8] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 21

		rightFrontWheelModel[0].addShapeBox(-1F, -1F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightFrontWheelModel[0].setRotationPoint(10F, 1F, -6F);

		rightFrontWheelModel[1].addShapeBox(-3F, -1F, -1F, 2, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 14
		rightFrontWheelModel[1].setRotationPoint(10F, 1F, -6.5F);

		rightFrontWheelModel[2].addShapeBox(1F, -1F, -1F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 15
		rightFrontWheelModel[2].setRotationPoint(10F, 1F, -6.5F);

		rightFrontWheelModel[3].addShapeBox(-1F, -3F, -1F, 2, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		rightFrontWheelModel[3].setRotationPoint(10F, 1F, -6.5F);

		rightFrontWheelModel[4].addShapeBox(-1F, 1F, -1F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 17
		rightFrontWheelModel[4].setRotationPoint(10F, 1F, -6.5F);

		rightFrontWheelModel[5].addShapeBox(-3F, 1F, -1F, 2, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F); // Box 18
		rightFrontWheelModel[5].setRotationPoint(10F, 1F, -6.5F);

		rightFrontWheelModel[6].addShapeBox(-3F, -3F, -1F, 2, 2, 3, 0F,-2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 19
		rightFrontWheelModel[6].setRotationPoint(10F, 1F, -6.5F);

		rightFrontWheelModel[7].addShapeBox(1F, -3F, -1F, 2, 2, 3, 0F,0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 20
		rightFrontWheelModel[7].setRotationPoint(10F, 1F, -6.5F);

		rightFrontWheelModel[8].addShapeBox(1F, 1F, -1F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 21
		rightFrontWheelModel[8].setRotationPoint(10F, 1F, -6.5F);
	}

	private void initleftBackWheelModel_1()
	{
		leftBackWheelModel[0] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 50
		leftBackWheelModel[1] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 51
		leftBackWheelModel[2] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 52
		leftBackWheelModel[3] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 53
		leftBackWheelModel[4] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 54
		leftBackWheelModel[5] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 55
		leftBackWheelModel[6] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 56
		leftBackWheelModel[7] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 57
		leftBackWheelModel[8] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 58

		leftBackWheelModel[0].addShapeBox(1.5F, -4.5F, -1F, 3, 3, 4, 0F,0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 50
		leftBackWheelModel[0].setRotationPoint(-10.5F, -0.5F, 5.5F);

		leftBackWheelModel[1].addShapeBox(-1.5F, -4.5F, -1F, 3, 3, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		leftBackWheelModel[1].setRotationPoint(-10.5F, -0.5F, 5.5F);

		leftBackWheelModel[2].addShapeBox(-4.5F, -4.5F, -1F, 3, 3, 4, 0F,-3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 52
		leftBackWheelModel[2].setRotationPoint(-10.5F, -0.5F, 5.5F);

		leftBackWheelModel[3].addShapeBox(-4.5F, -1.5F, -1F, 3, 3, 4, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 53
		leftBackWheelModel[3].setRotationPoint(-10.5F, -0.5F, 5.5F);

		leftBackWheelModel[4].addShapeBox(-4.5F, 1.5F, -1F, 3, 3, 4, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, -0.5F); // Box 54
		leftBackWheelModel[4].setRotationPoint(-10.5F, -0.5F, 5.5F);

		leftBackWheelModel[5].addShapeBox(-1.5F, 1.5F, -1F, 3, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 55
		leftBackWheelModel[5].setRotationPoint(-10.5F, -0.5F, 5.5F);

		leftBackWheelModel[6].addShapeBox(1.5F, 1.5F, -1F, 3, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 56
		leftBackWheelModel[6].setRotationPoint(-10.5F, -0.5F, 5.5F);

		leftBackWheelModel[7].addShapeBox(1.5F, -1.5F, -1F, 3, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 57
		leftBackWheelModel[7].setRotationPoint(-10.5F, -0.5F, 5.5F);

		leftBackWheelModel[8].addShapeBox(-1.5F, -1.5F, -1F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		leftBackWheelModel[8].setRotationPoint(-10.5F, -0.5F, 6F);
	}

	private void initrightBackWheelModel_1()
	{
		rightBackWheelModel[0] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 41
		rightBackWheelModel[1] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 42
		rightBackWheelModel[2] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 43
		rightBackWheelModel[3] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 44
		rightBackWheelModel[4] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 45
		rightBackWheelModel[5] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 46
		rightBackWheelModel[6] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 47
		rightBackWheelModel[7] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 48
		rightBackWheelModel[8] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 49

		rightBackWheelModel[0].addShapeBox(-4.5F, -4.5F, -1F, 3, 3, 4, 0F,-3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 41
		rightBackWheelModel[0].setRotationPoint(-10.5F, -0.5F, -7.5F);

		rightBackWheelModel[1].addShapeBox(-1.5F, -4.5F, -1F, 3, 3, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		rightBackWheelModel[1].setRotationPoint(-10.5F, -0.5F, -7.5F);

		rightBackWheelModel[2].addShapeBox(1.5F, -4.5F, -1F, 3, 3, 4, 0F,0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 43
		rightBackWheelModel[2].setRotationPoint(-10.5F, -0.5F, -7.5F);

		rightBackWheelModel[3].addShapeBox(1.5F, -1.5F, -1F, 3, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 44
		rightBackWheelModel[3].setRotationPoint(-10.5F, -0.5F, -7.5F);

		rightBackWheelModel[4].addShapeBox(1.5F, 1.5F, -1F, 3, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 45
		rightBackWheelModel[4].setRotationPoint(-10.5F, -0.5F, -7.5F);

		rightBackWheelModel[5].addShapeBox(-1.5F, 1.5F, -1F, 3, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 46
		rightBackWheelModel[5].setRotationPoint(-10.5F, -0.5F, -7.5F);

		rightBackWheelModel[6].addShapeBox(-4.5F, 1.5F, -1F, 3, 3, 4, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, -0.5F); // Box 47
		rightBackWheelModel[6].setRotationPoint(-10.5F, -0.5F, -7.5F);

		rightBackWheelModel[7].addShapeBox(-4.5F, -1.5F, -1F, 3, 3, 4, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 48
		rightBackWheelModel[7].setRotationPoint(-10.5F, -0.5F, -7.5F);

		rightBackWheelModel[8].addShapeBox(-1.5F, -1.5F, -1F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		rightBackWheelModel[8].setRotationPoint(-10.5F, -0.5F, -7F);
	}

	private void inittrailerModel_1()
	{
		trailerModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		trailerModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 1
		trailerModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 3
		trailerModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 4
		trailerModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 5
		trailerModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 6
		trailerModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 8
		trailerModel[7] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 9
		trailerModel[8] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 10
		trailerModel[9] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 40
		trailerModel[10] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 41
		trailerModel[11] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 42
		trailerModel[12] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 43
		trailerModel[13] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 60
		trailerModel[14] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 61
		trailerModel[15] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 62
		trailerModel[16] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 63
		trailerModel[17] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 93
		trailerModel[18] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 94

		trailerModel[0].addShapeBox(-5F, 0F, -5F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		trailerModel[0].setRotationPoint(0F, 0F, 0F);

		trailerModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -3F, 0F, 2F, -3F, 0F, 0F, 0F); // Box 1
		trailerModel[1].setRotationPoint(5F, 0F, -5F);

		trailerModel[2].addShapeBox(-5F, 0F, -5F, 2, 1, 10, 0F,0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, 2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -3F); // Box 3
		trailerModel[2].setRotationPoint(-2F, 0F, 0F);

		trailerModel[3].addShapeBox(-5F, 0F, -5F, 10, 1, 2, 0F,-3F, -2F, 0F, -7F, -2F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -3F, 2F, 0F, -7F, 2F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 4
		trailerModel[3].setRotationPoint(0F, 0F, -2F);

		trailerModel[4].addShapeBox(-5F, 0F, -5F, 10, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F); // Box 5
		trailerModel[4].setRotationPoint(0F, 0F, 10F);

		trailerModel[5].addShapeBox(0F, 0F, -1F, 1, 1, 1, 0F,3F, -2F, 1F, -0.5F, -2F, -0.5F, 1F, -2F, 3F, 0F, 0F, 0F, 3F, 2F, 1F, -0.5F, 2F, -0.5F, 1F, 2F, 3F, 0F, 0F, 0F); // Box 6
		trailerModel[5].setRotationPoint(5F, 0F, -5F);

		trailerModel[6].addShapeBox(0F, 0F, -1F, 1, 1, 1, 0F,3F, -2F, 1F, -0.5F, -2F, -0.5F, 1F, -2F, 3F, 0F, 0F, 0F, 3F, 2F, 1F, -0.5F, 2F, -0.5F, 1F, 2F, 3F, 0F, 0F, 0F); // Box 8
		trailerModel[6].setRotationPoint(-5F, 0F, -5F);
		trailerModel[6].rotateAngleY = -1.57079633F;

		trailerModel[7].addShapeBox(0F, 0F, -1F, 1, 1, 1, 0F,3F, -2F, 1F, -0.5F, -2F, -0.5F, 1F, -2F, 3F, 0F, 0F, 0F, 3F, 2F, 1F, -0.5F, 2F, -0.5F, 1F, 2F, 3F, 0F, 0F, 0F); // Box 9
		trailerModel[7].setRotationPoint(-5F, 0F, 5F);
		trailerModel[7].rotateAngleY = -3.14159265F;

		trailerModel[8].addShapeBox(0F, 0F, -1F, 1, 1, 1, 0F,3F, -2F, 1F, -0.5F, -2F, -0.5F, 1F, -2F, 3F, 0F, 0F, 0F, 3F, 2F, 1F, -0.5F, 2F, -0.5F, 1F, 2F, 3F, 0F, 0F, 0F); // Box 10
		trailerModel[8].setRotationPoint(5F, 0F, 5F);
		trailerModel[8].rotateAngleY = -4.71238898F;

		trailerModel[9].addShapeBox(-5F, 0F, -5F, 10, 1, 2, 0F,-7F, -2F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, -7F, 0F, 0F); // Box 40
		trailerModel[9].setRotationPoint(0F, 0F, -2F);

		trailerModel[10].addShapeBox(-5F, 0F, -5F, 6, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		trailerModel[10].setRotationPoint(2F, 0F, -4F);

		trailerModel[11].addShapeBox(-5F, 0F, -5F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		trailerModel[11].setRotationPoint(2F, 1F, -4F);

		trailerModel[12].addShapeBox(-5F, 0F, -5F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		trailerModel[12].setRotationPoint(7F, 1F, -4F);

		trailerModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		trailerModel[13].setRotationPoint(0F, -1F, -5F);

		trailerModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, -0.5F, 0.6F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.6F); // Box 61
		trailerModel[14].setRotationPoint(0.5F, -1F, -5F);

		trailerModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.6F, 0F, -0.5F, 0.6F, 0F, -0.5F, 0F); // Box 62
		trailerModel[15].setRotationPoint(-0.5F, -1F, -5F);

		trailerModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		trailerModel[16].setRotationPoint(2F, -1F, -5F);

		trailerModel[17].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 93
		trailerModel[17].setRotationPoint(-0.5F, 1F, -0.5F);

		trailerModel[18].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 94
		trailerModel[18].setRotationPoint(-0.5F, 2F, -5F);
	}
}