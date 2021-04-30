//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 02.03.2016 - 12:51:31
// Last changed on: 02.03.2016 - 12:51:31

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMG08 extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelMG08() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[21];
		bodyDoorOpenModel = new ModelRendererTurbo[154];
		turretModel = new ModelRendererTurbo[9];
		barrelModel = new ModelRendererTurbo[55];

		initbodyModel_1();
		initbodyDoorOpenModel_1();
		initturretModel_1();
		initbarrelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 12
		bodyModel[1] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 13
		bodyModel[2] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 14
		bodyModel[3] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 26
		bodyModel[4] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 27
		bodyModel[5] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 28
		bodyModel[6] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 29
		bodyModel[7] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 30
		bodyModel[8] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 31
		bodyModel[9] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 32
		bodyModel[10] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 33
		bodyModel[11] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 34
		bodyModel[12] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 35
		bodyModel[13] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 36
		bodyModel[14] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 37
		bodyModel[15] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 38
		bodyModel[16] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 39
		bodyModel[17] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 40
		bodyModel[18] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 41
		bodyModel[19] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 42
		bodyModel[20] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 43

		bodyModel[0].addShapeBox(-1.5F, 2F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[0].setRotationPoint(0F, 0.5F, 0F);

		bodyModel[1].addShapeBox(-1.5F, 2F, -1.5F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[1].setRotationPoint(0F, 0.5F, 0F);

		bodyModel[2].addShapeBox(-1.5F, 2F, 0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 14
		bodyModel[2].setRotationPoint(0F, 0.5F, 0F);

		bodyModel[3].addShapeBox(-11.5F, -0.5F, -0.5F, 11, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 26
		bodyModel[3].setRotationPoint(-1.5F, 3.3F, 0F);
		bodyModel[3].rotateAngleZ = 0.66322512F;

		bodyModel[4].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[4].setRotationPoint(-1.5F, 3.3F, 0F);
		bodyModel[4].rotateAngleZ = 0.66322512F;

		bodyModel[5].addShapeBox(-11F, 9F, -1.5F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[5].setRotationPoint(0F, 0.5F, 0F);

		bodyModel[6].addShapeBox(-11F, 9F, 0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 29
		bodyModel[6].setRotationPoint(0F, 0.5F, 0F);

		bodyModel[7].addShapeBox(-11F, 9F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[7].setRotationPoint(0F, 0.5F, 0F);

		bodyModel[8].addShapeBox(0.5F, -0.5F, -0.5F, 11, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 31
		bodyModel[8].setRotationPoint(1F, 3.3F, -1F);
		bodyModel[8].rotateAngleY = -0.78539816F;
		bodyModel[8].rotateAngleZ = -0.66322512F;

		bodyModel[9].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[9].setRotationPoint(1F, 3.3F, -1F);
		bodyModel[9].rotateAngleY = -0.78539816F;
		bodyModel[9].rotateAngleZ = -0.66322512F;

		bodyModel[10].addShapeBox(0.5F, -0.5F, -0.5F, 11, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 33
		bodyModel[10].setRotationPoint(1F, 3.3F, 1F);
		bodyModel[10].rotateAngleY = 0.78539816F;
		bodyModel[10].rotateAngleZ = -0.66322512F;

		bodyModel[11].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[11].setRotationPoint(1F, 3.3F, 1F);
		bodyModel[11].rotateAngleY = 0.78539816F;
		bodyModel[11].rotateAngleZ = -0.66322512F;

		bodyModel[12].addShapeBox(4F, 9F, -7.5F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[12].setRotationPoint(1F, 0.5F, -1F);

		bodyModel[13].addShapeBox(4F, 9F, -6.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[13].setRotationPoint(1F, 0.5F, -1F);

		bodyModel[14].addShapeBox(4F, 9F, -5.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 37
		bodyModel[14].setRotationPoint(1F, 0.5F, -1F);

		bodyModel[15].addShapeBox(4F, 9F, 8.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[15].setRotationPoint(1F, 0.5F, -1F);

		bodyModel[16].addShapeBox(4F, 9F, 7.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[16].setRotationPoint(1F, 0.5F, -1F);

		bodyModel[17].addShapeBox(4F, 9F, 6.5F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[17].setRotationPoint(1F, 0.5F, -1F);

		bodyModel[18].addShapeBox(3.5F, -0.5F, -0.5F, 2, 1, 1, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 41
		bodyModel[18].setRotationPoint(1F, 3.3F, 1F);
		bodyModel[18].rotateAngleY = 0.78539816F;
		bodyModel[18].rotateAngleZ = -0.66322512F;

		bodyModel[19].addShapeBox(3.5F, -0.5F, -0.5F, 2, 1, 1, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 42
		bodyModel[19].setRotationPoint(1F, 3.3F, -1F);
		bodyModel[19].rotateAngleY = -0.78539816F;
		bodyModel[19].rotateAngleZ = -0.66322512F;

		bodyModel[20].addShapeBox(3.5F, 0F, -3.5F, 1, 1, 7, 0F,-0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F); // Box 43
		bodyModel[20].setRotationPoint(1F, 3.3F, 0F);
		bodyModel[20].rotateAngleZ = -0.66322512F;
	}

	private void initbodyDoorOpenModel_1()
	{
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 44
		bodyDoorOpenModel[1] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 47
		bodyDoorOpenModel[2] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 47
		bodyDoorOpenModel[3] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 48
		bodyDoorOpenModel[4] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 49
		bodyDoorOpenModel[5] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 50
		bodyDoorOpenModel[6] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 51
		bodyDoorOpenModel[7] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 52
		bodyDoorOpenModel[8] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 53
		bodyDoorOpenModel[9] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 54
		bodyDoorOpenModel[10] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 55
		bodyDoorOpenModel[11] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 56
		bodyDoorOpenModel[12] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 57
		bodyDoorOpenModel[13] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 62
		bodyDoorOpenModel[14] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 62
		bodyDoorOpenModel[15] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 62
		bodyDoorOpenModel[16] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 62
		bodyDoorOpenModel[17] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 62
		bodyDoorOpenModel[18] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 63
		bodyDoorOpenModel[19] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 64
		bodyDoorOpenModel[20] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 65
		bodyDoorOpenModel[21] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 66
		bodyDoorOpenModel[22] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 67
		bodyDoorOpenModel[23] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 68
		bodyDoorOpenModel[24] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 69
		bodyDoorOpenModel[25] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 70
		bodyDoorOpenModel[26] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 71
		bodyDoorOpenModel[27] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 72
		bodyDoorOpenModel[28] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 73
		bodyDoorOpenModel[29] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 74
		bodyDoorOpenModel[30] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 75
		bodyDoorOpenModel[31] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 76
		bodyDoorOpenModel[32] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 77
		bodyDoorOpenModel[33] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 78
		bodyDoorOpenModel[34] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 79
		bodyDoorOpenModel[35] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 80
		bodyDoorOpenModel[36] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 81
		bodyDoorOpenModel[37] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 82
		bodyDoorOpenModel[38] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 83
		bodyDoorOpenModel[39] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 84
		bodyDoorOpenModel[40] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 85
		bodyDoorOpenModel[41] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 86
		bodyDoorOpenModel[42] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 87
		bodyDoorOpenModel[43] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 88
		bodyDoorOpenModel[44] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 89
		bodyDoorOpenModel[45] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 90
		bodyDoorOpenModel[46] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 91
		bodyDoorOpenModel[47] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 92
		bodyDoorOpenModel[48] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 93
		bodyDoorOpenModel[49] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 94
		bodyDoorOpenModel[50] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 95
		bodyDoorOpenModel[51] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 96
		bodyDoorOpenModel[52] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 97
		bodyDoorOpenModel[53] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 98
		bodyDoorOpenModel[54] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 99
		bodyDoorOpenModel[55] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 100
		bodyDoorOpenModel[56] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 101
		bodyDoorOpenModel[57] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 102
		bodyDoorOpenModel[58] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 103
		bodyDoorOpenModel[59] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 104
		bodyDoorOpenModel[60] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 105
		bodyDoorOpenModel[61] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 106
		bodyDoorOpenModel[62] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 107
		bodyDoorOpenModel[63] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 108
		bodyDoorOpenModel[64] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 109
		bodyDoorOpenModel[65] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 110
		bodyDoorOpenModel[66] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 111
		bodyDoorOpenModel[67] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 112
		bodyDoorOpenModel[68] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 113
		bodyDoorOpenModel[69] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 114
		bodyDoorOpenModel[70] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 115
		bodyDoorOpenModel[71] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 116
		bodyDoorOpenModel[72] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 117
		bodyDoorOpenModel[73] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 118
		bodyDoorOpenModel[74] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 119
		bodyDoorOpenModel[75] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 120
		bodyDoorOpenModel[76] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 121
		bodyDoorOpenModel[77] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 122
		bodyDoorOpenModel[78] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 123
		bodyDoorOpenModel[79] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 124
		bodyDoorOpenModel[80] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 125
		bodyDoorOpenModel[81] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 126
		bodyDoorOpenModel[82] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 127
		bodyDoorOpenModel[83] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 128
		bodyDoorOpenModel[84] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 129
		bodyDoorOpenModel[85] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 130
		bodyDoorOpenModel[86] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 131
		bodyDoorOpenModel[87] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 132
		bodyDoorOpenModel[88] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 133
		bodyDoorOpenModel[89] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 134
		bodyDoorOpenModel[90] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 135
		bodyDoorOpenModel[91] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 136
		bodyDoorOpenModel[92] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 137
		bodyDoorOpenModel[93] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 138
		bodyDoorOpenModel[94] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 139
		bodyDoorOpenModel[95] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 140
		bodyDoorOpenModel[96] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 141
		bodyDoorOpenModel[97] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 142
		bodyDoorOpenModel[98] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 143
		bodyDoorOpenModel[99] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 144
		bodyDoorOpenModel[100] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 145
		bodyDoorOpenModel[101] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 146
		bodyDoorOpenModel[102] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 147
		bodyDoorOpenModel[103] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 148
		bodyDoorOpenModel[104] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 149
		bodyDoorOpenModel[105] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 150
		bodyDoorOpenModel[106] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 151
		bodyDoorOpenModel[107] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 152
		bodyDoorOpenModel[108] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 153
		bodyDoorOpenModel[109] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 154
		bodyDoorOpenModel[110] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 155
		bodyDoorOpenModel[111] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 159
		bodyDoorOpenModel[112] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 160
		bodyDoorOpenModel[113] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 161
		bodyDoorOpenModel[114] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 162
		bodyDoorOpenModel[115] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 163
		bodyDoorOpenModel[116] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 164
		bodyDoorOpenModel[117] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 165
		bodyDoorOpenModel[118] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 166
		bodyDoorOpenModel[119] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 167
		bodyDoorOpenModel[120] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 168
		bodyDoorOpenModel[121] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 169
		bodyDoorOpenModel[122] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 170
		bodyDoorOpenModel[123] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 171
		bodyDoorOpenModel[124] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 172
		bodyDoorOpenModel[125] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 173
		bodyDoorOpenModel[126] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 174
		bodyDoorOpenModel[127] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 175
		bodyDoorOpenModel[128] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 176
		bodyDoorOpenModel[129] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 177
		bodyDoorOpenModel[130] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 178
		bodyDoorOpenModel[131] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 179
		bodyDoorOpenModel[132] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 180
		bodyDoorOpenModel[133] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 181
		bodyDoorOpenModel[134] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 182
		bodyDoorOpenModel[135] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 183
		bodyDoorOpenModel[136] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 184
		bodyDoorOpenModel[137] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 185
		bodyDoorOpenModel[138] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 186
		bodyDoorOpenModel[139] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 187
		bodyDoorOpenModel[140] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 188
		bodyDoorOpenModel[141] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 189
		bodyDoorOpenModel[142] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 190
		bodyDoorOpenModel[143] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 191
		bodyDoorOpenModel[144] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 192
		bodyDoorOpenModel[145] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 193
		bodyDoorOpenModel[146] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 194
		bodyDoorOpenModel[147] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 195
		bodyDoorOpenModel[148] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 196
		bodyDoorOpenModel[149] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 197
		bodyDoorOpenModel[150] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 198
		bodyDoorOpenModel[151] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 199
		bodyDoorOpenModel[152] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 200
		bodyDoorOpenModel[153] = new ModelRendererTurbo(this, 25, 26, textureX, textureY); // Box 201

		bodyDoorOpenModel[0].addShapeBox(0.5F, 0F, -7.5F, 2, 1, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyDoorOpenModel[0].setRotationPoint(-4.25F, 9F, -6F);

		bodyDoorOpenModel[1].addShapeBox(0.5F, -1.2F, -1F, 2, 1, 9, 0F,-0.5F, -0.25F, 0.2F, -0.5F, -0.25F, 0.2F, -0.5F, -0.17F, 0.22F, -0.5F, -0.17F, 0.22F, -0.5F, -0.25F, 0.2F, -0.5F, -0.25F, 0.2F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 47
		bodyDoorOpenModel[1].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[1].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[2].addShapeBox(0.5F, -7.2F, 4F, 2, 1, 2, 0F,-0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.3F, -0.5F, -0.25F, 0.3F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.3F, -0.5F, -0.25F, 0.3F); // Box 47
		bodyDoorOpenModel[2].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[3].addShapeBox(1.55F, -7.2F, 5.5F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 48
		bodyDoorOpenModel[3].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[4].addShapeBox(0.55F, -7.2F, 5.5F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 49
		bodyDoorOpenModel[4].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[5].addShapeBox(1.55F, -7.2F, 5.5F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F); // Box 50
		bodyDoorOpenModel[5].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[6].addShapeBox(1.55F, 0F, -1.5F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 51
		bodyDoorOpenModel[6].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[7].addShapeBox(1.55F, 0F, -1.5F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F); // Box 52
		bodyDoorOpenModel[7].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[8].addShapeBox(0.55F, 0F, -1.5F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 53
		bodyDoorOpenModel[8].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[9].addShapeBox(0F, -3F, -8F, 1, 4, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyDoorOpenModel[9].setRotationPoint(-4.25F, 9F, -6F);

		bodyDoorOpenModel[10].addShapeBox(2F, -3F, -8F, 1, 4, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 55
		bodyDoorOpenModel[10].setRotationPoint(-4.25F, 9F, -6F);

		bodyDoorOpenModel[11].addShapeBox(0.5F, -3F, -8F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 56
		bodyDoorOpenModel[11].setRotationPoint(-4.25F, 9F, -6F);

		bodyDoorOpenModel[12].addShapeBox(0.5F, -3F, -1F, 2, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyDoorOpenModel[12].setRotationPoint(-4.25F, 9F, -6F);

		bodyDoorOpenModel[13].addShapeBox(0.5F, -4F, -9.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 62
		bodyDoorOpenModel[13].setRotationPoint(-4.25F, 9F, -6F);

		bodyDoorOpenModel[14].addShapeBox(0F, -4F, -9.5F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyDoorOpenModel[14].setRotationPoint(-4.25F, 9F, -6F);

		bodyDoorOpenModel[15].addShapeBox(2F, -4F, -9.5F, 1, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 62
		bodyDoorOpenModel[15].setRotationPoint(-4.25F, 9F, -6F);

		bodyDoorOpenModel[16].addShapeBox(0.5F, -4F, -2.5F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyDoorOpenModel[16].setRotationPoint(-4.25F, 9F, -6F);

		bodyDoorOpenModel[17].addShapeBox(0.5F, -4F, -9F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 62
		bodyDoorOpenModel[17].setRotationPoint(-4.25F, 9F, -6F);

		bodyDoorOpenModel[18].addShapeBox(0.55F, -7.2F, 5F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 63
		bodyDoorOpenModel[18].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[19].addShapeBox(1.55F, -7.2F, 5F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F); // Box 64
		bodyDoorOpenModel[19].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[20].addShapeBox(1.55F, -7.2F, 5F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 65
		bodyDoorOpenModel[20].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[21].addShapeBox(0.55F, -1.2F, 7F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 66
		bodyDoorOpenModel[21].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[21].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[22].addShapeBox(1.55F, -1.2F, 7F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F); // Box 67
		bodyDoorOpenModel[22].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[22].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[23].addShapeBox(1.55F, -1.2F, 7F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 68
		bodyDoorOpenModel[23].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[23].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[24].addShapeBox(1.55F, -1.2F, 7.5F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 69
		bodyDoorOpenModel[24].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[24].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[25].addShapeBox(1.55F, -1.2F, 7.5F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F); // Box 70
		bodyDoorOpenModel[25].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[25].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[26].addShapeBox(0.55F, -1.2F, 7.5F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 71
		bodyDoorOpenModel[26].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[26].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[27].addShapeBox(1.55F, -7.2F, 4.5F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 72
		bodyDoorOpenModel[27].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[28].addShapeBox(1.55F, -7.2F, 4.5F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F); // Box 73
		bodyDoorOpenModel[28].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[29].addShapeBox(0.55F, -7.2F, 4.5F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 74
		bodyDoorOpenModel[29].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[30].addShapeBox(0.55F, -1.2F, 6.5F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 75
		bodyDoorOpenModel[30].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[30].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[31].addShapeBox(1.55F, -1.2F, 6.5F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 76
		bodyDoorOpenModel[31].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[31].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[32].addShapeBox(1.55F, -1.2F, 6.5F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F); // Box 77
		bodyDoorOpenModel[32].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[32].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[33].addShapeBox(1.55F, -1.2F, 6F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 78
		bodyDoorOpenModel[33].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[33].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[34].addShapeBox(1.55F, -1.2F, 6F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F); // Box 79
		bodyDoorOpenModel[34].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[34].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[35].addShapeBox(0.55F, -1.2F, 6F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 80
		bodyDoorOpenModel[35].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[35].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[36].addShapeBox(0.55F, -1.2F, 5.5F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 81
		bodyDoorOpenModel[36].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[36].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[37].addShapeBox(1.55F, -1.2F, 5.5F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 82
		bodyDoorOpenModel[37].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[37].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[38].addShapeBox(1.55F, -1.2F, 5.5F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F); // Box 83
		bodyDoorOpenModel[38].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[38].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[39].addShapeBox(1.55F, -1.2F, 5F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 84
		bodyDoorOpenModel[39].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[39].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[40].addShapeBox(1.55F, -1.2F, 5F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F); // Box 85
		bodyDoorOpenModel[40].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[40].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[41].addShapeBox(0.55F, -1.2F, 5F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 86
		bodyDoorOpenModel[41].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[41].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[42].addShapeBox(0.55F, -1.2F, 4.5F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 87
		bodyDoorOpenModel[42].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[42].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[43].addShapeBox(1.55F, -1.2F, 4.5F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 88
		bodyDoorOpenModel[43].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[43].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[44].addShapeBox(1.55F, -1.2F, 4.5F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F); // Box 89
		bodyDoorOpenModel[44].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[44].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[45].addShapeBox(1.55F, -1.2F, 4F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 90
		bodyDoorOpenModel[45].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[45].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[46].addShapeBox(1.55F, -1.2F, 4F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F); // Box 91
		bodyDoorOpenModel[46].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[46].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[47].addShapeBox(0.55F, -1.2F, 4F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 92
		bodyDoorOpenModel[47].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[47].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[48].addShapeBox(0.55F, -1.2F, 3.5F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 93
		bodyDoorOpenModel[48].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[48].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[49].addShapeBox(1.55F, -1.2F, 3.5F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 94
		bodyDoorOpenModel[49].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[49].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[50].addShapeBox(1.55F, -1.2F, 3.5F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F); // Box 95
		bodyDoorOpenModel[50].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[50].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[51].addShapeBox(1.55F, -1.2F, 3F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 96
		bodyDoorOpenModel[51].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[51].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[52].addShapeBox(1.55F, -1.2F, 3F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F); // Box 97
		bodyDoorOpenModel[52].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[52].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[53].addShapeBox(0.55F, -1.2F, 3F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 98
		bodyDoorOpenModel[53].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[53].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[54].addShapeBox(0.55F, -1.2F, 2.5F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 99
		bodyDoorOpenModel[54].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[54].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[55].addShapeBox(1.55F, -1.2F, 2.5F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 100
		bodyDoorOpenModel[55].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[55].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[56].addShapeBox(1.55F, -1.2F, 2.5F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F); // Box 101
		bodyDoorOpenModel[56].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[56].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[57].addShapeBox(1.55F, -1.2F, 2F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 102
		bodyDoorOpenModel[57].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[57].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[58].addShapeBox(1.55F, -1.2F, 2F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F); // Box 103
		bodyDoorOpenModel[58].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[58].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[59].addShapeBox(0.55F, -1.2F, 2F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 104
		bodyDoorOpenModel[59].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[59].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[60].addShapeBox(0.55F, -1.2F, 1.5F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 105
		bodyDoorOpenModel[60].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[60].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[61].addShapeBox(1.55F, -1.2F, 1.5F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 106
		bodyDoorOpenModel[61].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[61].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[62].addShapeBox(1.55F, -1.2F, 1.5F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F); // Box 107
		bodyDoorOpenModel[62].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[62].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[63].addShapeBox(1.55F, -1.2F, 1F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 108
		bodyDoorOpenModel[63].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[63].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[64].addShapeBox(1.55F, -1.2F, 1F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F); // Box 109
		bodyDoorOpenModel[64].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[64].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[65].addShapeBox(0.55F, -1.2F, 1F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 110
		bodyDoorOpenModel[65].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[65].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[66].addShapeBox(0.55F, -1.2F, 0.5F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 111
		bodyDoorOpenModel[66].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[66].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[67].addShapeBox(1.55F, -1.2F, 0.5F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 112
		bodyDoorOpenModel[67].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[67].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[68].addShapeBox(1.55F, -1.2F, 0.5F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F); // Box 113
		bodyDoorOpenModel[68].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[68].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[69].addShapeBox(1.55F, -1.2F, 0F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 114
		bodyDoorOpenModel[69].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[69].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[70].addShapeBox(1.55F, -1.2F, 0F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F); // Box 115
		bodyDoorOpenModel[70].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[70].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[71].addShapeBox(0.55F, -1.2F, 0F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 116
		bodyDoorOpenModel[71].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[71].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[72].addShapeBox(0.55F, -1.2F, -0.5F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 117
		bodyDoorOpenModel[72].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[72].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[73].addShapeBox(1.55F, -1.2F, -0.5F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 118
		bodyDoorOpenModel[73].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[73].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[74].addShapeBox(1.55F, -1.2F, -0.5F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F); // Box 119
		bodyDoorOpenModel[74].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[74].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[75].addShapeBox(1.55F, -1.2F, -1F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 120
		bodyDoorOpenModel[75].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[75].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[76].addShapeBox(1.55F, -1.2F, -1F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F); // Box 121
		bodyDoorOpenModel[76].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[76].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[77].addShapeBox(0.55F, -1.2F, -1F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 122
		bodyDoorOpenModel[77].setRotationPoint(-4.25F, 6F, -6F);
		bodyDoorOpenModel[77].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[78].addShapeBox(0.55F, 0F, -2F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 123
		bodyDoorOpenModel[78].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[79].addShapeBox(1.55F, 0F, -2F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F); // Box 124
		bodyDoorOpenModel[79].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[80].addShapeBox(1.55F, 0F, -2F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 125
		bodyDoorOpenModel[80].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[81].addShapeBox(0.55F, 0F, -3F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 126
		bodyDoorOpenModel[81].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[82].addShapeBox(1.55F, 0F, -3F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F); // Box 127
		bodyDoorOpenModel[82].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[83].addShapeBox(1.55F, 0F, -3F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 128
		bodyDoorOpenModel[83].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[84].addShapeBox(0.55F, 0F, -2.5F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 129
		bodyDoorOpenModel[84].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[85].addShapeBox(1.55F, 0F, -2.5F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F); // Box 130
		bodyDoorOpenModel[85].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[86].addShapeBox(1.55F, 0F, -2.5F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 131
		bodyDoorOpenModel[86].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[87].addShapeBox(0.55F, 0F, -4F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 132
		bodyDoorOpenModel[87].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[88].addShapeBox(1.55F, 0F, -4F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F); // Box 133
		bodyDoorOpenModel[88].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[89].addShapeBox(1.55F, 0F, -4F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 134
		bodyDoorOpenModel[89].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[90].addShapeBox(0.55F, 0F, -3.5F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 135
		bodyDoorOpenModel[90].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[91].addShapeBox(1.55F, 0F, -3.5F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F); // Box 136
		bodyDoorOpenModel[91].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[92].addShapeBox(1.55F, 0F, -3.5F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 137
		bodyDoorOpenModel[92].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[93].addShapeBox(0.55F, 0F, -5F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 138
		bodyDoorOpenModel[93].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[94].addShapeBox(1.55F, 0F, -5F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F); // Box 139
		bodyDoorOpenModel[94].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[95].addShapeBox(1.55F, 0F, -5F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 140
		bodyDoorOpenModel[95].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[96].addShapeBox(0.55F, 0F, -4.5F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 141
		bodyDoorOpenModel[96].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[97].addShapeBox(1.55F, 0F, -4.5F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F); // Box 142
		bodyDoorOpenModel[97].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[98].addShapeBox(1.55F, 0F, -4.5F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 143
		bodyDoorOpenModel[98].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[99].addShapeBox(0.55F, 0F, -6F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 144
		bodyDoorOpenModel[99].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[100].addShapeBox(1.55F, 0F, -6F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F); // Box 145
		bodyDoorOpenModel[100].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[101].addShapeBox(1.55F, 0F, -6F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 146
		bodyDoorOpenModel[101].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[102].addShapeBox(0.55F, 0F, -5.5F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 147
		bodyDoorOpenModel[102].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[103].addShapeBox(1.55F, 0F, -5.5F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F); // Box 148
		bodyDoorOpenModel[103].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[104].addShapeBox(1.55F, 0F, -5.5F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 149
		bodyDoorOpenModel[104].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[105].addShapeBox(0.55F, 0F, -7F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 150
		bodyDoorOpenModel[105].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[106].addShapeBox(1.55F, 0F, -7F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F); // Box 151
		bodyDoorOpenModel[106].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[107].addShapeBox(1.55F, 0F, -7F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 152
		bodyDoorOpenModel[107].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[108].addShapeBox(0.55F, 0F, -6.5F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 153
		bodyDoorOpenModel[108].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[109].addShapeBox(1.55F, 0F, -6.5F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F); // Box 154
		bodyDoorOpenModel[109].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[110].addShapeBox(1.55F, 0F, -6.5F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 155
		bodyDoorOpenModel[110].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[111].addShapeBox(0.55F, 0F, -7.5F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 159
		bodyDoorOpenModel[111].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[112].addShapeBox(1.55F, 0F, -7.5F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F); // Box 160
		bodyDoorOpenModel[112].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[113].addShapeBox(1.55F, 0F, -7.5F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 161
		bodyDoorOpenModel[113].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[114].addShapeBox(0.55F, 0.5F, -7.8F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 162
		bodyDoorOpenModel[114].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[115].addShapeBox(1.55F, 0.5F, -7.8F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F); // Box 163
		bodyDoorOpenModel[115].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[116].addShapeBox(1.55F, 0.5F, -7.8F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 164
		bodyDoorOpenModel[116].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[117].addShapeBox(0.55F, 0.5F, -7.3F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 165
		bodyDoorOpenModel[117].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[118].addShapeBox(1.55F, 0.5F, -7.3F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F); // Box 166
		bodyDoorOpenModel[118].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[119].addShapeBox(1.55F, 0.5F, -7.3F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 167
		bodyDoorOpenModel[119].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[120].addShapeBox(0.55F, 0.5F, -6.8F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 168
		bodyDoorOpenModel[120].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[121].addShapeBox(1.55F, 0.5F, -6.8F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F); // Box 169
		bodyDoorOpenModel[121].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[122].addShapeBox(1.55F, 0.5F, -6.8F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 170
		bodyDoorOpenModel[122].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[123].addShapeBox(0.55F, 0.5F, -6.3F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 171
		bodyDoorOpenModel[123].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[124].addShapeBox(1.55F, 0.5F, -6.3F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F); // Box 172
		bodyDoorOpenModel[124].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[125].addShapeBox(1.55F, 0.5F, -6.3F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 173
		bodyDoorOpenModel[125].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[126].addShapeBox(0.55F, 0.5F, -5.8F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 174
		bodyDoorOpenModel[126].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[127].addShapeBox(1.55F, 0.5F, -5.8F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 175
		bodyDoorOpenModel[127].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[128].addShapeBox(1.55F, 0.5F, -5.8F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F); // Box 176
		bodyDoorOpenModel[128].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[129].addShapeBox(0.55F, 0.5F, -5.3F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 177
		bodyDoorOpenModel[129].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[130].addShapeBox(1.55F, 0.5F, -5.3F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F); // Box 178
		bodyDoorOpenModel[130].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[131].addShapeBox(1.55F, 0.5F, -5.3F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 179
		bodyDoorOpenModel[131].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[132].addShapeBox(0.55F, 0.5F, -4.8F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 180
		bodyDoorOpenModel[132].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[133].addShapeBox(1.55F, 0.5F, -4.8F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 181
		bodyDoorOpenModel[133].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[134].addShapeBox(1.55F, 0.5F, -4.8F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F); // Box 182
		bodyDoorOpenModel[134].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[135].addShapeBox(0.55F, 0.5F, -4.3F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 183
		bodyDoorOpenModel[135].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[136].addShapeBox(1.55F, 0.5F, -4.3F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F); // Box 184
		bodyDoorOpenModel[136].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[137].addShapeBox(1.55F, 0.5F, -4.3F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 185
		bodyDoorOpenModel[137].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[138].addShapeBox(1.55F, 0.5F, -3.8F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 186
		bodyDoorOpenModel[138].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[139].addShapeBox(1.55F, 0.5F, -3.8F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F); // Box 187
		bodyDoorOpenModel[139].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[140].addShapeBox(0.55F, 0.5F, -3.8F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 188
		bodyDoorOpenModel[140].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[141].addShapeBox(0.55F, 0.5F, -3.3F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 189
		bodyDoorOpenModel[141].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[142].addShapeBox(1.55F, 0.5F, -3.3F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 190
		bodyDoorOpenModel[142].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[143].addShapeBox(1.55F, 0.5F, -3.3F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F); // Box 191
		bodyDoorOpenModel[143].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[144].addShapeBox(0.55F, 0.5F, -2.8F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 192
		bodyDoorOpenModel[144].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[145].addShapeBox(1.55F, 0.5F, -2.8F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F); // Box 193
		bodyDoorOpenModel[145].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[146].addShapeBox(1.55F, 0.5F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 194
		bodyDoorOpenModel[146].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[147].addShapeBox(0.55F, 0.5F, -2.3F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 195
		bodyDoorOpenModel[147].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[148].addShapeBox(1.55F, 0.5F, -2.3F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F); // Box 196
		bodyDoorOpenModel[148].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[149].addShapeBox(1.55F, 0.5F, -2.3F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 197
		bodyDoorOpenModel[149].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[150].addShapeBox(0.55F, 0.5F, -1.8F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 198
		bodyDoorOpenModel[150].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[151].addShapeBox(1.55F, 0.5F, -1.8F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.3F, -0.3F); // Box 199
		bodyDoorOpenModel[151].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[152].addShapeBox(1.55F, 0.5F, -1.8F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 200
		bodyDoorOpenModel[152].setRotationPoint(-4.25F, 6F, -6F);

		bodyDoorOpenModel[153].addShapeBox(0.5F, 0F, -8F, 2, 1, 7, 0F,-0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.3F, -0.5F, -0.25F, 0.3F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.3F, -0.5F, -0.25F, 0.3F); // Box 201
		bodyDoorOpenModel[153].setRotationPoint(-4.25F, 6F, -6F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 3
		turretModel[1] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 4
		turretModel[2] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 5
		turretModel[3] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 6
		turretModel[4] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 7
		turretModel[5] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 8
		turretModel[6] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 9
		turretModel[7] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 10
		turretModel[8] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 24

		turretModel[0].addShapeBox(-0.5F, -2F, -2.5F, 1, 1, 5, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 3
		turretModel[0].setRotationPoint(0F, 0.5F, 0F);

		turretModel[1].addShapeBox(-0.5F, -2F, -3F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		turretModel[1].setRotationPoint(0F, 0.5F, 0F);

		turretModel[2].addShapeBox(-0.5F, -2F, 2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		turretModel[2].setRotationPoint(0F, 0.5F, 0F);

		turretModel[3].addShapeBox(-0.5F, -1F, 2F, 1, 2, 1, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 6
		turretModel[3].setRotationPoint(0F, 0.5F, 0F);

		turretModel[4].addShapeBox(-0.5F, -1F, -3F, 1, 2, 1, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 7
		turretModel[4].setRotationPoint(0F, 0.5F, 0F);

		turretModel[5].addShapeBox(-0.5F, 1F, -3F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		turretModel[5].setRotationPoint(0F, 0.5F, 0F);

		turretModel[6].addShapeBox(-0.5F, 1F, 2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		turretModel[6].setRotationPoint(0F, 0.5F, 0F);

		turretModel[7].addShapeBox(-0.5F, 1F, -2F, 1, 1, 4, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 10
		turretModel[7].setRotationPoint(0F, 0.5F, 0F);

		turretModel[8].addShapeBox(-0.5F, 1F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		turretModel[8].setRotationPoint(0F, 0.5F, 0F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		barrelModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 0
		barrelModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 0
		barrelModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 0
		barrelModel[4] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 0
		barrelModel[5] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 0
		barrelModel[6] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 0
		barrelModel[7] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 0
		barrelModel[8] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 0
		barrelModel[9] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 0
		barrelModel[10] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 0
		barrelModel[11] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 0
		barrelModel[12] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 0
		barrelModel[13] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 0
		barrelModel[14] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 0
		barrelModel[15] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 0
		barrelModel[16] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 0
		barrelModel[17] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 0
		barrelModel[18] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 0
		barrelModel[19] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 0
		barrelModel[20] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 0
		barrelModel[21] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 0
		barrelModel[22] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 0
		barrelModel[23] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 0
		barrelModel[24] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 0
		barrelModel[25] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 0
		barrelModel[26] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 0
		barrelModel[27] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 0
		barrelModel[28] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 0
		barrelModel[29] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 0
		barrelModel[30] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 0
		barrelModel[31] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 0
		barrelModel[32] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 0
		barrelModel[33] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 0
		barrelModel[34] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 0
		barrelModel[35] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 0
		barrelModel[36] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 0
		barrelModel[37] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 0
		barrelModel[38] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 0
		barrelModel[39] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 0
		barrelModel[40] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 0
		barrelModel[41] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 0
		barrelModel[42] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 0
		barrelModel[43] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 0
		barrelModel[44] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 0
		barrelModel[45] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 0
		barrelModel[46] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 0
		barrelModel[47] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 0
		barrelModel[48] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 0
		barrelModel[49] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 0
		barrelModel[50] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 0
		barrelModel[51] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 0
		barrelModel[52] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		barrelModel[53] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		barrelModel[54] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2

		barrelModel[0].addShapeBox(-0.5F, -1F, -1.5F, 11, 1, 3, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 0
		barrelModel[0].setRotationPoint(0F, -0.5F, 0F);

		barrelModel[1].addShapeBox(-0.5F, -2F, -1.5F, 11, 1, 3, 0F,0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 0
		barrelModel[1].setRotationPoint(0F, -0.5F, 0F);

		barrelModel[2].addShapeBox(-0.5F, 0F, -1.5F, 11, 1, 3, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, -1F); // Box 0
		barrelModel[2].setRotationPoint(0F, -0.5F, 0F);

		barrelModel[3].addShapeBox(10.5F, -0.2F, -0.5F, 1, 1, 1, 0F,0F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.6F, -0.2F, 0.5F, -0.6F, -0.2F, 0.5F, -0.6F, -0.2F, 0F, -0.6F, -0.2F); // Box 0
		barrelModel[3].setRotationPoint(0F, -0.5F, 0F);

		barrelModel[4].addShapeBox(10.5F, -0.2F, -0.5F, 1, 1, 1, 0F,0F, -0.6F, -0.2F, 0.5F, -0.6F, -0.2F, 0.5F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 0
		barrelModel[4].setRotationPoint(0F, -0.5F, 0F);

		barrelModel[5].addShapeBox(10.5F, -0.2F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 0
		barrelModel[5].setRotationPoint(0F, -0.5F, 0F);

		barrelModel[6].addShapeBox(12F, -0.2F, -0.5F, 2, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.4F, -0.2F); // Box 0
		barrelModel[6].setRotationPoint(0F, -0.5F, 0F);

		barrelModel[7].addShapeBox(12F, -0.2F, -0.5F, 2, 1, 1, 0F,0F, -0.2F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.4F, 0F, -0.6F, -0.2F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.6F, -0.2F); // Box 0
		barrelModel[7].setRotationPoint(0F, -0.5F, 0F);

		barrelModel[8].addShapeBox(12F, -0.2F, -0.5F, 2, 1, 1, 0F,0F, -0.6F, -0.2F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.6F, -0.2F, 0F, -0.2F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.4F); // Box 0
		barrelModel[8].setRotationPoint(0F, -0.5F, 0F);

		barrelModel[9].addShapeBox(9F, 1F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.6F, -0.2F); // Box 0
		barrelModel[9].setRotationPoint(0F, -0.5F, 0F);

		barrelModel[10].addShapeBox(9F, -3F, -0.5F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 0
		barrelModel[10].setRotationPoint(0F, -0.5F, 0F);

		barrelModel[11].addShapeBox(9F, 1.2F, -0.5F, 1, 1, 1, 0F,-0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F); // Box 0
		barrelModel[11].setRotationPoint(0F, -4.5F, 0F);

		barrelModel[12].addShapeBox(9F, 0.7F, -0.5F, 1, 1, 1, 0F,-0.4F, -0.6F, -0.2F, -0.4F, -0.6F, -0.2F, -0.4F, -0.6F, -0.2F, -0.4F, -0.6F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F); // Box 0
		barrelModel[12].setRotationPoint(0F, -4.5F, 0F);

		barrelModel[13].addShapeBox(9F, -0.499999999999999F, -0.5F, 1, 1, 1, 0F,-0.4F, -0.6F, -0.2F, -0.4F, -0.6F, -0.2F, -0.4F, -0.6F, -0.2F, -0.4F, -0.6F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F); // Box 0
		barrelModel[13].setRotationPoint(0F, -4.5F, 0F);

		barrelModel[14].addShapeBox(9F, 0.300000000000001F, -0.1F, 1, 1, 1, 0F,-0.4F, -0.2F, -0.6F, -0.4F, -0.2F, -0.6F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.6F, -0.4F, -0.2F, -0.6F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F); // Box 0
		barrelModel[14].setRotationPoint(0F, -4.5F, 0F);

		barrelModel[15].addShapeBox(9F, -0.299999999999999F, -0.1F, 1, 1, 1, 0F,-0.4F, -0.6F, -0.4F, -0.4F, -0.6F, -0.4F, -0.4F, -0.4F, -0.6F, -0.4F, -0.4F, -0.6F, -0.4F, -0.2F, -0.6F, -0.4F, -0.2F, -0.6F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F); // Box 0
		barrelModel[15].setRotationPoint(0F, -4.5F, 0F);

		barrelModel[16].addShapeBox(9F, 0.899999999999999F, -0.1F, 1, 1, 1, 0F,-0.4F, -0.2F, -0.6F, -0.4F, -0.2F, -0.6F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.6F, -0.4F, -0.4F, -0.6F, -0.4F, -0.4F, -0.4F, -0.6F, -0.4F, -0.4F, -0.6F); // Box 0
		barrelModel[16].setRotationPoint(0F, -4.5F, 0F);

		barrelModel[17].addShapeBox(9F, 0.899999999999999F, -0.9F, 1, 1, 1, 0F,-0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.6F, -0.4F, -0.2F, -0.6F, -0.4F, -0.4F, -0.6F, -0.4F, -0.4F, -0.6F, -0.4F, -0.6F, -0.4F, -0.4F, -0.6F, -0.4F); // Box 0
		barrelModel[17].setRotationPoint(0F, -4.5F, 0F);

		barrelModel[18].addShapeBox(9F, 0.300000000000001F, -0.9F, 1, 1, 1, 0F,-0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.6F, -0.4F, -0.2F, -0.6F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.6F, -0.4F, -0.2F, -0.6F); // Box 0
		barrelModel[18].setRotationPoint(0F, -4.5F, 0F);

		barrelModel[19].addShapeBox(9F, -0.299999999999999F, -0.9F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.6F, -0.4F, -0.4F, -0.6F, -0.4F, -0.6F, -0.4F, -0.4F, -0.6F, -0.4F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.6F, -0.4F, -0.2F, -0.6F); // Box 0
		barrelModel[19].setRotationPoint(0F, -4.5F, 0F);

		barrelModel[20].addShapeBox(9F, 0.300000000000001F, -0.7F, 1, 1, 1, 0F,-0.4F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Box 0
		barrelModel[20].setRotationPoint(0F, -4.5F, 0F);

		barrelModel[21].addShapeBox(9F, 0.100000000000001F, -0.5F, 1, 1, 1, 0F,-0.4F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F); // Box 0
		barrelModel[21].setRotationPoint(0F, -4.5F, 0F);

		barrelModel[22].addShapeBox(-2F, -1.5F, -1F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 0
		barrelModel[22].setRotationPoint(0F, -0.5F, 0F);

		barrelModel[23].addShapeBox(-9.5F, -1.5F, -1F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 0
		barrelModel[23].setRotationPoint(0F, -0.5F, 0F);

		barrelModel[24].addShapeBox(-3F, -1.5F, -1F, 1, 1, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 0
		barrelModel[24].setRotationPoint(0F, -0.5F, 0F);

		barrelModel[25].addShapeBox(-3F, 0F, -1F, 1, 2, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 0
		barrelModel[25].setRotationPoint(0F, -0.5F, 0F);

		barrelModel[26].addShapeBox(-7.5F, 0.8F, -1.2F, 6, 1, 1, 0F,-0.6F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, -0.8F, -0.6F, 0.4F, -0.8F, -0.6F, -0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, -0.6F, -0.2F, -0.8F); // Box 0
		barrelModel[26].setRotationPoint(0F, -0.5F, 0F);

		barrelModel[27].addShapeBox(-7.9F, 0.4F, -1.2F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.8F, -0.5F, 0.2F, -0.8F); // Box 0
		barrelModel[27].setRotationPoint(0F, -0.5F, 0F);

		barrelModel[28].addShapeBox(-7.9F, 0.4F, -1.2F, 1, 1, 1, 0F,0F, -0.35F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.8F, 0F, -0.35F, -0.8F, 0F, -0.15F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, -0.8F, 0F, -0.15F, -0.8F); // Box 0
		barrelModel[28].setRotationPoint(0F, -0.5F, 0F);

		barrelModel[29].addShapeBox(10F, -0.2F, 0F, 1, 1, 2, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 0
		barrelModel[29].setRotationPoint(0F, -0.5F, -1F);

		barrelModel[30].addShapeBox(10F, -1.2F, 0F, 1, 1, 2, 0F,-0.8F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 0
		barrelModel[30].setRotationPoint(0F, -0.5F, -1F);

		barrelModel[31].addShapeBox(10F, 0.8F, 0F, 1, 1, 2, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F); // Box 0
		barrelModel[31].setRotationPoint(0F, -0.5F, -1F);

		barrelModel[32].addShapeBox(-7.5F, -2F, -0.5F, 2, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.9F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.9F, 0F); // Box 0
		barrelModel[32].setRotationPoint(0F, -0.5F, 0F);

		barrelModel[33].addShapeBox(-7F, -2F, -0.1F, 2, 1, 1, 0F,-0.7F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0F, -0.7F, 0F, 0F, -0.5F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 0
		barrelModel[33].setRotationPoint(0F, -0.5F, 0F);

		barrelModel[34].addShapeBox(-7F, -2F, -0.9F, 2, 1, 1, 0F,-0.7F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.6F, -0.7F, 0F, -0.6F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.6F, -0.5F, -0.5F, -0.6F); // Box 0
		barrelModel[34].setRotationPoint(0F, -0.5F, 0F);

		barrelModel[35].addShapeBox(-8.5F, -2.2F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 0
		barrelModel[35].setRotationPoint(0F, -0.5F, 0F);

		barrelModel[36].addShapeBox(-8.5F, -2.5F, -0.5F, 1, 1, 1, 0F,-0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, -0.8F, -0.25F, 0.1F, -0.8F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F); // Box 0
		barrelModel[36].setRotationPoint(0F, -0.5F, 0F);

		barrelModel[37].addShapeBox(-8.5F, -2.5F, -0.5F, 1, 1, 1, 0F,-0.25F, 0.1F, -0.8F, -0.25F, 0.1F, -0.8F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 0
		barrelModel[37].setRotationPoint(0F, -0.5F, 0F);

		barrelModel[38].addShapeBox(-11.5F, -1.25F, 1F, 1, 3, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 0
		barrelModel[38].setRotationPoint(0F, -0.5F, 0F);

		barrelModel[39].addShapeBox(-11.5F, -1.25F, 1F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 0
		barrelModel[39].setRotationPoint(0F, -0.5F, 0F);

		barrelModel[40].addShapeBox(-11.5F, 0.75F, 1F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		barrelModel[40].setRotationPoint(0F, -0.5F, 0F);

		barrelModel[41].addShapeBox(-10.5F, -1.25F, 1F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 0
		barrelModel[41].setRotationPoint(0F, -0.5F, 0F);

		barrelModel[42].addShapeBox(-10.5F, 0.75F, 1F, 2, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 0
		barrelModel[42].setRotationPoint(0F, -0.5F, 0F);

		barrelModel[43].addShapeBox(-10.5F, 0.75F, -2F, 2, 1, 1, 0F,0F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		barrelModel[43].setRotationPoint(0F, -0.5F, 0F);

		barrelModel[44].addShapeBox(-10.5F, -1.25F, -2F, 2, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 0
		barrelModel[44].setRotationPoint(0F, -0.5F, 0F);

		barrelModel[45].addShapeBox(-10.5F, -1F, -0.5F, 1, 1, 1, 0F,0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F); // Box 0
		barrelModel[45].setRotationPoint(0F, -0.5F, 0F);

		barrelModel[46].addShapeBox(-7.5F, 0.8F, 0.2F, 6, 1, 1, 0F,-0.6F, 0.4F, -0.8F, 0F, 0.4F, -0.8F, 0F, 0.4F, 0F, -0.6F, 0.4F, 0F, -0.6F, -0.2F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, -0.6F, -0.2F, 0F); // Box 0
		barrelModel[46].setRotationPoint(0F, -0.5F, 0F);

		barrelModel[47].addShapeBox(-7.9F, 0.4F, 0.2F, 1, 1, 1, 0F,0F, -0.35F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.15F, -0.8F, -0.5F, 0.2F, -0.8F, -0.5F, 0.2F, 0F, 0F, -0.15F, 0F); // Box 0
		barrelModel[47].setRotationPoint(0F, -0.5F, 0F);

		barrelModel[48].addShapeBox(-7.9F, 0.4F, 0.2F, 1, 1, 1, 0F,-0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F); // Box 0
		barrelModel[48].setRotationPoint(0F, -0.5F, 0F);

		barrelModel[49].addShapeBox(-11.5F, -1.25F, -2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 0
		barrelModel[49].setRotationPoint(0F, -0.5F, 0F);

		barrelModel[50].addShapeBox(-11.5F, -1.25F, -2F, 1, 3, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 0
		barrelModel[50].setRotationPoint(0F, -0.5F, 0F);

		barrelModel[51].addShapeBox(-11.5F, 0.75F, -2F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		barrelModel[51].setRotationPoint(0F, -0.5F, 0F);

		barrelModel[52].addShapeBox(-0.5F, -1F, -1.5F, 11, 1, 3, 0F,0.4F, 0.1F, 0.1F, -9.6F, 0.1F, 0.1F, -9.6F, 0.1F, 0.1F, 0.4F, 0.1F, 0.1F, 0.4F, 0.1F, 0.1F, -9.6F, 0.1F, 0.1F, -9.6F, 0.1F, 0.1F, 0.4F, 0.1F, 0.1F); // Box 0
		barrelModel[52].setRotationPoint(0F, -0.5F, 0F);

		barrelModel[53].addShapeBox(-0.5F, -2F, -1.5F, 11, 1, 3, 0F,0.4F, 0.2F, -0.9F, -9.6F, 0.2F, -0.9F, -9.6F, 0.2F, -0.9F, 0.4F, 0.2F, -0.9F, 0.4F, -0.1F, 0.1F, -9.6F, -0.1F, 0.1F, -9.6F, -0.1F, 0.1F, 0.4F, -0.1F, 0.1F); // Box 1
		barrelModel[53].setRotationPoint(0F, -0.5F, 0F);

		barrelModel[54].addShapeBox(-0.5F, 0F, -1.5F, 11, 1, 3, 0F,0.4F, -0.1F, 0.1F, -9.6F, -0.1F, 0.1F, -9.6F, -0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F, 0.2F, -0.9F, -9.6F, 0.2F, -0.9F, -9.6F, 0.2F, -0.9F, 0.4F, 0.2F, -0.9F); // Box 2
		barrelModel[54].setRotationPoint(0F, -0.5F, 0F);
	}
}