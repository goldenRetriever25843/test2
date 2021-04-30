//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 26.06.2016 - 22:27:08
// Last changed on: 26.06.2016 - 22:27:08

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelT60 extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelT60() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[101];
		turretModel = new ModelRendererTurbo[18];
		barrelModel = new ModelRendererTurbo[10];
		leftTrackWheelModels = new ModelRendererTurbo[18];
		rightTrackWheelModels = new ModelRendererTurbo[18];
		leftTrackModel = new ModelRendererTurbo[11];
		rightTrackModel = new ModelRendererTurbo[11];

		initbodyModel_1();
		initturretModel_1();
		initbarrelModel_1();
		initleftTrackWheelModels_1();
		initrightTrackWheelModels_1();
		initleftTrackModel_1();
		initrightTrackModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 3
		bodyModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bodyModel[6] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 5
		bodyModel[7] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 6
		bodyModel[8] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 7
		bodyModel[9] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 8
		bodyModel[10] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 9
		bodyModel[11] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 10
		bodyModel[12] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 11
		bodyModel[13] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 12
		bodyModel[14] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 13
		bodyModel[15] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 14
		bodyModel[16] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 15
		bodyModel[17] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 16
		bodyModel[18] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 17
		bodyModel[19] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 18
		bodyModel[20] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 19
		bodyModel[21] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 23
		bodyModel[24] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 24
		bodyModel[25] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 25
		bodyModel[26] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 26
		bodyModel[27] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 28
		bodyModel[28] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 29
		bodyModel[29] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 30
		bodyModel[30] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 31
		bodyModel[31] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 32
		bodyModel[32] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 33
		bodyModel[33] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 34
		bodyModel[34] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 35
		bodyModel[35] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 36
		bodyModel[36] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 37
		bodyModel[37] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 38
		bodyModel[38] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 39
		bodyModel[39] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 40
		bodyModel[40] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 41
		bodyModel[41] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 42
		bodyModel[42] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 43
		bodyModel[43] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 44
		bodyModel[44] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 45
		bodyModel[45] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 46
		bodyModel[46] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 47
		bodyModel[47] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 48
		bodyModel[48] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 49
		bodyModel[49] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 50
		bodyModel[50] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 51
		bodyModel[51] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 52
		bodyModel[52] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 54
		bodyModel[53] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 55
		bodyModel[54] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 56
		bodyModel[55] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 57
		bodyModel[56] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 58
		bodyModel[57] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 59
		bodyModel[58] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 60
		bodyModel[59] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 61
		bodyModel[60] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 62
		bodyModel[61] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 63
		bodyModel[62] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 64
		bodyModel[63] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 65
		bodyModel[64] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 66
		bodyModel[65] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 67
		bodyModel[66] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 68
		bodyModel[67] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 69
		bodyModel[68] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 70
		bodyModel[69] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 72
		bodyModel[70] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 73
		bodyModel[71] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 74
		bodyModel[72] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 75
		bodyModel[73] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 76
		bodyModel[74] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 0
		bodyModel[75] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 1
		bodyModel[76] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 2
		bodyModel[77] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 3
		bodyModel[78] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 33
		bodyModel[79] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 97
		bodyModel[80] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 98
		bodyModel[81] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 99
		bodyModel[82] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 100
		bodyModel[83] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 101
		bodyModel[84] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 102
		bodyModel[85] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 103
		bodyModel[86] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 104
		bodyModel[87] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 105
		bodyModel[88] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 106
		bodyModel[89] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 107
		bodyModel[90] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 108
		bodyModel[91] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 109
		bodyModel[92] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 110
		bodyModel[93] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 111
		bodyModel[94] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 112
		bodyModel[95] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 113
		bodyModel[96] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 114
		bodyModel[97] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 115
		bodyModel[98] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 116
		bodyModel[99] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 117
		bodyModel[100] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 118

		bodyModel[0].addShapeBox(0F, 0F, 0F, 26, 1, 5, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 0
		bodyModel[0].setRotationPoint(3F, -5F, 8F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 12, 14, 25, 0F,0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -3.5F, 0.5F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -5.5F, 0F, 0.5F); // Box 0
		bodyModel[1].setRotationPoint(-25.5F, -8F, -17F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 22, 14, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 1
		bodyModel[2].setRotationPoint(-13.5F, -8F, -17F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 15, 14, 25, 0F,0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 2
		bodyModel[3].setRotationPoint(8.5F, -8F, -17F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 7, 14, 25, 0F,0F, -4.5F, 0F, 0F, -6.7F, 0F, 0F, -6.7F, 0.5F, 0F, -4.5F, 0.5F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0.5F, 0F, 0F, 0.5F); // Box 3
		bodyModel[4].setRotationPoint(23.5F, -8F, -17F);

		bodyModel[5].addShapeBox(1F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 4
		bodyModel[5].setRotationPoint(-11.35F, -5.8F, 7.8F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 27, 1, 5, 0F,0F, -1.7F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -1.7F, 0F, 0F, 1.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, 1.2F, 0F); // Box 5
		bodyModel[6].setRotationPoint(-24F, -5F, 8F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 27, 1, 5, 0F,0F, -1.7F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -1.7F, 0F, 0F, 1.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, 1.2F, 0F); // Box 6
		bodyModel[7].setRotationPoint(-24F, -5F, -22F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 26, 1, 5, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 7
		bodyModel[8].setRotationPoint(3F, -5F, -22F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 8
		bodyModel[9].setRotationPoint(29F, -5F, 8F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.2F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.2F, 0F); // Box 9
		bodyModel[10].setRotationPoint(30F, -5F, 8F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.2F, -0.5F, 0F, -0.8F, -0.5F, 0F, -0.8F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, 0.4F, -0.5F, 0F, 0.4F, 0F, 0F, -0.2F, 0F); // Box 10
		bodyModel[11].setRotationPoint(31F, -4.8F, 8F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.2F, -0.5F, 0F, -1.3F, -0.5F, 0F, -1.3F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, -0.4F, 0.6F, -0.5F, -0.4F, 0.6F, 0F, 0F, -0.2F, 0F); // Box 11
		bodyModel[12].setRotationPoint(32F, -4.2F, 8F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 12
		bodyModel[13].setRotationPoint(29F, -5F, -22F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.2F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.2F, 0F); // Box 13
		bodyModel[14].setRotationPoint(30F, -5F, -22F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.2F, -0.45F, 0F, -0.8F, -0.45F, 0F, -0.8F, -0.45F, 0F, -0.2F, -0.45F, 1F, -0.2F, -0.45F, -2F, 0.4F, -0.45F, -2F, 0.4F, -0.45F, 1F, -0.2F, -0.45F); // Box 14
		bodyModel[15].setRotationPoint(31F, -4.75F, -17.55F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.2F, -0.5F, 0F, -1.3F, -0.5F, 0F, -1.3F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, -0.4F, 0.6F, -0.5F, -0.4F, 0.6F, 0F, 0F, -0.2F, 0F); // Box 15
		bodyModel[16].setRotationPoint(32F, -4.2F, -22F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, 2.2F, -0.45F, 0F, 2.2F, -0.45F, 0F, -0.2F, -0.45F); // Box 16
		bodyModel[17].setRotationPoint(19F, -4.95F, -17.55F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, 2.2F, -0.45F, 0F, 2.2F, -0.45F, 0F, -0.2F, -0.45F); // Box 17
		bodyModel[18].setRotationPoint(19F, -4.95F, 8.05F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.8F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.8F, -0.45F); // Box 18
		bodyModel[19].setRotationPoint(29F, -4.95F, -17.55F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.2F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, -1F, 0F, -0.45F, -1F, 0F, -0.45F, 0F, -0.2F, -0.45F); // Box 19
		bodyModel[20].setRotationPoint(30F, -4.95F, -17.55F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.2F, -0.5F, 0F, -0.8F, -0.5F, 0F, -0.8F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, 0.4F, -0.5F, 0F, 0.4F, 0F, 0F, -0.2F, 0F); // Box 21
		bodyModel[21].setRotationPoint(31F, -4.8F, -22F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.2F, -0.45F, 0F, -1.3F, -0.45F, 0F, -1.3F, -0.45F, 0F, -0.2F, -0.45F, 2F, -0.2F, -0.45F, -1F, -1.4F, -0.45F, -1F, -1.4F, -0.45F, 2F, -0.2F, -0.45F); // Box 22
		bodyModel[22].setRotationPoint(32F, -4.15F, -17.55F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.2F, -0.45F, 0F, -1.3F, -0.45F, 0F, -1.3F, -0.45F, 0F, -0.2F, -0.45F, 2F, -0.2F, -0.45F, -1F, -1.4F, -0.45F, -1F, -1.4F, -0.45F, 2F, -0.2F, -0.45F); // Box 23
		bodyModel[23].setRotationPoint(32F, -4.15F, 8.05F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.8F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.8F, -0.45F); // Box 24
		bodyModel[24].setRotationPoint(29F, -4.95F, 8.05F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.2F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, -1F, 0F, -0.45F, -1F, 0F, -0.45F, 0F, -0.2F, -0.45F); // Box 25
		bodyModel[25].setRotationPoint(30F, -4.95F, 8.05F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.2F, -0.45F, 0F, -0.8F, -0.45F, 0F, -0.8F, -0.45F, 0F, -0.2F, -0.45F, 1F, -0.2F, -0.45F, -2F, 0.4F, -0.45F, -2F, 0.4F, -0.45F, 1F, -0.2F, -0.45F); // Box 26
		bodyModel[26].setRotationPoint(31F, -4.75F, 8.05F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -0.4F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[27].setRotationPoint(-26F, -3.5F, -22F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.8F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.8F, 0F, 0F, 0.4F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, 0.4F, 0F); // Box 29
		bodyModel[28].setRotationPoint(-27F, -3.3F, -22F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1.3F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -1.3F, 0F, -0.4F, 0.6F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, -0.4F, 0.6F, 0F); // Box 30
		bodyModel[29].setRotationPoint(-28F, -2.7F, -22F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -0.4F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[30].setRotationPoint(-26F, -3.5F, 8F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.8F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.8F, 0F, 0F, 0.4F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, 0.4F, 0F); // Box 32
		bodyModel[31].setRotationPoint(-27F, -3.3F, 8F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1.3F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -1.3F, 0F, -0.4F, 0.6F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, -0.4F, 0.6F, 0F); // Box 33
		bodyModel[32].setRotationPoint(-28F, -2.7F, 8F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 8, 10, 9, 0F,0F, -4.2F, 0F, 0F, -6.7F, 0F, 0F, -6.7F, 0.5F, 0F, -4.2F, 0.5F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -5F, 0.5F); // Box 34
		bodyModel[33].setRotationPoint(22F, -8.4F, -16.5F);

		bodyModel[34].addShapeBox(1F, 0F, 0F, 1, 1, 5, 0F,-0.2F, -0.45F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.35F, 0F); // Box 35
		bodyModel[34].setRotationPoint(-11.35F, -4.7F, 7.8F);

		bodyModel[35].addShapeBox(1F, 0F, 0F, 1, 1, 4, 0F,-0.2F, 1.1F, 0F, -0.2F, 1.1F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -1.95F, 0F, -0.2F, -1.95F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F); // Box 36
		bodyModel[35].setRotationPoint(-11.35F, -4.7F, 8.8F);

		bodyModel[36].addShapeBox(1F, 0F, 0F, 1, 1, 4, 0F,-0.2F, 1.1F, 0F, -0.2F, 1.1F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -1.95F, 0F, -0.2F, -1.95F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F); // Box 37
		bodyModel[36].setRotationPoint(9F, -5.5F, 8.8F);

		bodyModel[37].addShapeBox(1F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 38
		bodyModel[37].setRotationPoint(9F, -6.6F, 7.8F);

		bodyModel[38].addShapeBox(1F, 0F, 0F, 1, 1, 5, 0F,-0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.35F, 0F); // Box 39
		bodyModel[38].setRotationPoint(9F, -5.4F, 7.8F);

		bodyModel[39].addShapeBox(1F, 0F, 0F, 1, 1, 4, 0F,-0.2F, 1.1F, 0F, -0.2F, 1.1F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -1.95F, 0F, -0.2F, -1.95F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F); // Box 40
		bodyModel[39].setRotationPoint(-24.35F, -4F, 8.8F);

		bodyModel[40].addShapeBox(1F, 0F, 0F, 1, 1, 5, 0F,-0.2F, -0.45F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.35F, 0F); // Box 41
		bodyModel[40].setRotationPoint(-24.35F, -3.95F, 7.8F);

		bodyModel[41].addShapeBox(1F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 42
		bodyModel[41].setRotationPoint(-24.35F, -5.1F, 7.8F);

		bodyModel[42].addShapeBox(1F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 1.1F, 0F, -0.2F, 1.1F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -1.95F, 0F, -0.2F, -1.95F, 0F); // Box 43
		bodyModel[42].setRotationPoint(-24.35F, -4F, -21.2F);

		bodyModel[43].addShapeBox(1F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 44
		bodyModel[43].setRotationPoint(-24.35F, -5.1F, -17.2F);

		bodyModel[44].addShapeBox(1F, 0F, 0F, 1, 1, 5, 0F,-0.2F, -0.45F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.35F, 0F); // Box 45
		bodyModel[44].setRotationPoint(-24.35F, -3.95F, -21.2F);

		bodyModel[45].addShapeBox(1F, 0F, 0F, 1, 1, 5, 0F,-0.2F, -0.45F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.35F, 0F); // Box 46
		bodyModel[45].setRotationPoint(-11.35F, -4.7F, -21.2F);

		bodyModel[46].addShapeBox(1F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 1.1F, 0F, -0.2F, 1.1F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -1.95F, 0F, -0.2F, -1.95F, 0F); // Box 47
		bodyModel[46].setRotationPoint(-11.35F, -4.7F, -21.2F);

		bodyModel[47].addShapeBox(1F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 48
		bodyModel[47].setRotationPoint(-11.35F, -5.8F, -17.2F);

		bodyModel[48].addShapeBox(1F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 1.1F, 0F, -0.2F, 1.1F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -1.95F, 0F, -0.2F, -1.95F, 0F); // Box 49
		bodyModel[48].setRotationPoint(9F, -5.5F, -21.2F);

		bodyModel[49].addShapeBox(1F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 50
		bodyModel[49].setRotationPoint(9F, -6.6F, -17.2F);

		bodyModel[50].addShapeBox(1F, 0F, 0F, 1, 1, 5, 0F,-0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.35F, 0F); // Box 51
		bodyModel[50].setRotationPoint(9F, -5.4F, -21.2F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 9, 4, 13, 0F,0F, 0F, -1.5F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F); // Box 52
		bodyModel[51].setRotationPoint(8.5F, -8.3F, -10.6F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 9, 4, 6, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[52].setRotationPoint(8.7F, -8F, -6F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.1F, -0.35F, -0.25F, -0.1F, -0.35F, -0.25F, -0.1F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.1F, -0.35F); // Box 55
		bodyModel[53].setRotationPoint(16.9F, -8.3F, -6.7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.1F, -0.35F, -0.25F, -0.1F, -0.35F, -0.25F, -0.1F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.1F, -0.35F); // Box 56
		bodyModel[54].setRotationPoint(16.9F, -8.3F, -0.3F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.1F, -0.35F, -0.25F, -0.1F, -0.35F, -0.25F, -0.1F, -0.35F, 0F, -0.1F, -0.35F, 0F, 0.1F, -0.35F, 0.05F, 0.1F, -0.35F, 0.05F, 0.1F, -0.35F, 0F, 0.1F, -0.35F); // Box 57
		bodyModel[55].setRotationPoint(16.9F, -8.3F, -0.7F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.1F, -0.35F, -0.25F, -0.1F, -0.35F, -0.25F, -0.1F, -0.35F, 0F, -0.1F, -0.35F, 0F, 0.1F, -0.35F, 0.05F, 0.1F, -0.35F, 0.05F, 0.1F, -0.35F, 0F, 0.1F, -0.35F); // Box 58
		bodyModel[56].setRotationPoint(16.9F, -8.3F, -6.3F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.3F, -0.35F, -0.1F, -0.3F, -0.35F, -0.1F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0.05F, -0.3F, -0.35F, 0.05F, -0.3F, -0.35F, 0F, -0.3F, -0.35F); // Box 59
		bodyModel[57].setRotationPoint(16.8F, -8F, -4F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F); // Box 60
		bodyModel[58].setRotationPoint(16.2F, -7.8F, -4F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0.05F, -0.3F, -0.4F, 0.05F, -0.3F, -0.4F, 0F, -0.3F, -0.4F); // Box 61
		bodyModel[59].setRotationPoint(16.85F, -7.6F, -4F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 9, 1, 11, 0F,0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 62
		bodyModel[60].setRotationPoint(9.7F, -5.7F, -9.6F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 9, 1, 11, 0F,0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.6F, -0.2F, 0F, 0.6F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 63
		bodyModel[61].setRotationPoint(9.8F, -5.35F, -9.6F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[62].setRotationPoint(-9F, -7.95F, -18.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F); // Box 65
		bodyModel[63].setRotationPoint(-22F, -6.7F, -19.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 66
		bodyModel[64].setRotationPoint(-22F, -4.7F, -20.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F); // Box 67
		bodyModel[65].setRotationPoint(-22F, -4.6F, -20.6F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F); // Box 68
		bodyModel[66].setRotationPoint(-15F, -5F, -20.6F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F); // Box 69
		bodyModel[67].setRotationPoint(-18.8F, -4.7F, -20.6F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0.5F, 1F); // Box 70
		bodyModel[68].setRotationPoint(-22F, -6.7F, 8F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 72
		bodyModel[69].setRotationPoint(-22F, -4.7F, 8F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F); // Box 73
		bodyModel[70].setRotationPoint(-22F, -4.6F, 11.1F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F); // Box 74
		bodyModel[71].setRotationPoint(-18.8F, -4.7F, 11.1F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F); // Box 75
		bodyModel[72].setRotationPoint(-15F, -5F, 11.1F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 10, 4, 13, 0F,-2F, -1.5F, -2.5F, -2F, -1.5F, -2.5F, -2F, -1.5F, -2.5F, -2F, -1.5F, -2.5F, -2F, -1.5F, -2.5F, -2F, -1.5F, -2.5F, -2F, -1.5F, -2.5F, -2F, -1.5F, -2.5F); // Box 76
		bodyModel[73].setRotationPoint(7.5F, -10.3F, -10.6F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 5, 4, 13, 0F,-2F, -1.5F, -2.5F, -2F, -1.5F, -3.5F, -2F, -1.5F, -3.5F, -2F, -1.5F, -2.5F, -2F, -1.5F, -2.5F, -2F, -1.5F, -3.5F, -2F, -1.5F, -3.5F, -2F, -1.5F, -2.5F); // Box 0
		bodyModel[74].setRotationPoint(13.5F, -10.3F, -10.6F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 24, 10, 11, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -7F, 0F, 0F, -7F, 0F, -8F, 0F, -8F, -8F, 0F, -8F, -8F, -7F, 0F, -8F, -7F); // Box 1
		bodyModel[75].setRotationPoint(-8F, -8.95F, -15.2F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 10, 3, 12, 0F,0F, -3.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -3.5F, 0.5F, 0F, 1F, 0F, 4F, 0F, 0F, 4F, 0F, 0.5F, 0F, 1F, 0.5F); // Box 2
		bodyModel[76].setRotationPoint(-23.5F, -9F, -16.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,-0.2F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, -0.2F, -4F, 0.5F, -0.2F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, -0.2F, 1F, 0.5F); // Box 3
		bodyModel[77].setRotationPoint(-24.5F, -8.5F, -16.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 33
		bodyModel[78].setRotationPoint(15.6F, -6.6F, 3F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F); // Box 97
		bodyModel[79].setRotationPoint(14.5F, -1.5F, 8.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.7F, -0.05F, 0F, -0.7F, -0.05F, 0F, -0.7F, -0.05F, 0F, -0.7F, -0.05F, 0F, 0.3F, -0.05F, 0F, 0.3F, -0.05F, 0F, 0.3F, -0.05F, 0F, 0.3F, -0.05F, 0F); // Box 98
		bodyModel[80].setRotationPoint(14.5F, -2.3F, 8.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0.3F, -0.05F, 0F, 0.3F, -0.05F, 0F, 0.3F, -0.05F, 0F, 0.3F, -0.05F, 0F, -0.7F, -0.05F, 0F, -0.7F, -0.05F, 0F, -0.7F, -0.05F, 0F, -0.7F, -0.05F, 0F); // Box 99
		bodyModel[81].setRotationPoint(14.5F, -0.7F, 8.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.7F, -0.05F, 0F, -0.7F, -0.05F, 0F, -0.7F, -0.05F, 0F, -0.7F, -0.05F, 0F, 0.3F, -0.05F, 0F, 0.3F, -0.05F, 0F, 0.3F, -0.05F, 0F, 0.3F, -0.05F, 0F); // Box 100
		bodyModel[82].setRotationPoint(2F, -2F, 8.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F); // Box 101
		bodyModel[83].setRotationPoint(2F, -1.2F, 8.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0.3F, -0.05F, 0F, 0.3F, -0.05F, 0F, 0.3F, -0.05F, 0F, 0.3F, -0.05F, 0F, -0.7F, -0.05F, 0F, -0.7F, -0.05F, 0F, -0.7F, -0.05F, 0F, -0.7F, -0.05F, 0F); // Box 102
		bodyModel[84].setRotationPoint(2F, -0.4F, 8.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.7F, -0.05F, 0F, -0.7F, -0.05F, 0F, -0.7F, -0.05F, 0F, -0.7F, -0.05F, 0F, 0.3F, -0.05F, 0F, 0.3F, -0.05F, 0F, 0.3F, -0.05F, 0F, 0.3F, -0.05F, 0F); // Box 103
		bodyModel[85].setRotationPoint(-10F, -1.5F, 8.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F); // Box 104
		bodyModel[86].setRotationPoint(-10F, -0.7F, 8.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0.3F, -0.05F, 0F, 0.3F, -0.05F, 0F, 0.3F, -0.05F, 0F, 0.3F, -0.05F, 0F, -0.7F, -0.05F, 0F, -0.7F, -0.05F, 0F, -0.7F, -0.05F, 0F, -0.7F, -0.05F, 0F); // Box 105
		bodyModel[87].setRotationPoint(-10F, 0.1F, 8.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0.3F, -0.05F, 0F, 0.3F, -0.05F, 0F, 0.3F, -0.05F, 0F, 0.3F, -0.05F, 0F, -0.7F, -0.05F, 0F, -0.7F, -0.05F, 0F, -0.7F, -0.05F, 0F, -0.7F, -0.05F, 0F); // Box 106
		bodyModel[88].setRotationPoint(2F, -0.4F, -20.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0.3F, -0.05F, 0F, 0.3F, -0.05F, 0F, 0.3F, -0.05F, 0F, 0.3F, -0.05F, 0F, -0.7F, -0.05F, 0F, -0.7F, -0.05F, 0F, -0.7F, -0.05F, 0F, -0.7F, -0.05F, 0F); // Box 107
		bodyModel[89].setRotationPoint(14.5F, -0.7F, -20.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F); // Box 108
		bodyModel[90].setRotationPoint(14.5F, -1.5F, -20.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.7F, -0.05F, 0F, -0.7F, -0.05F, 0F, -0.7F, -0.05F, 0F, -0.7F, -0.05F, 0F, 0.3F, -0.05F, 0F, 0.3F, -0.05F, 0F, 0.3F, -0.05F, 0F, 0.3F, -0.05F, 0F); // Box 109
		bodyModel[91].setRotationPoint(14.5F, -2.3F, -20.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F); // Box 110
		bodyModel[92].setRotationPoint(2F, -1.2F, -20.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.7F, -0.05F, 0F, -0.7F, -0.05F, 0F, -0.7F, -0.05F, 0F, -0.7F, -0.05F, 0F, 0.3F, -0.05F, 0F, 0.3F, -0.05F, 0F, 0.3F, -0.05F, 0F, 0.3F, -0.05F, 0F); // Box 111
		bodyModel[93].setRotationPoint(2F, -2F, -20.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0.3F, -0.05F, 0F, 0.3F, -0.05F, 0F, 0.3F, -0.05F, 0F, 0.3F, -0.05F, 0F, -0.7F, -0.05F, 0F, -0.7F, -0.05F, 0F, -0.7F, -0.05F, 0F, -0.7F, -0.05F, 0F); // Box 112
		bodyModel[94].setRotationPoint(-10F, 0.1F, -20.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F); // Box 113
		bodyModel[95].setRotationPoint(-10F, -0.7F, -20.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.7F, -0.05F, 0F, -0.7F, -0.05F, 0F, -0.7F, -0.05F, 0F, -0.7F, -0.05F, 0F, 0.3F, -0.05F, 0F, 0.3F, -0.05F, 0F, 0.3F, -0.05F, 0F, 0.3F, -0.05F, 0F); // Box 114
		bodyModel[96].setRotationPoint(-10F, -1.5F, -20.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, -0.2F, 0F, 3F, -0.2F, 0F, 3F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, 0F, 0F, -0.2F); // Box 115
		bodyModel[97].setRotationPoint(-25F, 1F, 6.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, -0.2F, 0F, 3F, -0.2F, 0F, 3F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, 0F, 0F, -0.2F); // Box 116
		bodyModel[98].setRotationPoint(-25F, 1F, -17.3F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 117
		bodyModel[99].setRotationPoint(-24.5F, -2F, 3.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 118
		bodyModel[100].setRotationPoint(-24.5F, -2F, -14F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 4
		turretModel[1] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 5
		turretModel[2] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 6
		turretModel[3] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 7
		turretModel[4] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 8
		turretModel[5] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 9
		turretModel[6] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 10
		turretModel[7] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 11
		turretModel[8] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 13
		turretModel[9] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 16
		turretModel[10] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 18
		turretModel[11] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 19
		turretModel[12] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 20
		turretModel[13] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 26
		turretModel[14] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 27
		turretModel[15] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 28
		turretModel[16] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 31
		turretModel[17] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 32

		turretModel[0].addShapeBox(-5.6F, 0F, -1.5F, 4, 6, 11, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 1.4F, 0F, 3.5F, 1.4F, 0F, 3.5F, 1.4F, 0F, 3.5F, 1.4F, 0F, 3.5F); // Box 4
		turretModel[0].setRotationPoint(3F, -14F, -4F);

		turretModel[1].addShapeBox(-10.6F, 0F, -1.5F, 4, 6, 1, 0F,-1.8F, 0F, -4F, 0.8F, 0F, 0F, 0.8F, 0F, 3F, -1.8F, 0F, 3F, 1.7F, 0F, -2F, -0.4F, 0F, 3.5F, -0.4F, 0F, 2F, 1.7F, 0F, 1.2F); // Box 5
		turretModel[1].setRotationPoint(3F, -14F, -4F);

		turretModel[2].addShapeBox(-10.6F, 0F, 8.5F, 4, 6, 1, 0F,-1.8F, 0F, 3F, 0.8F, 0F, 3F, 0.8F, 0F, 0F, -1.8F, 0F, -4F, 1.7F, 0F, 1.2F, -0.4F, 0F, 2F, -0.4F, 0F, 3.5F, 1.7F, 0F, -2F); // Box 6
		turretModel[2].setRotationPoint(3F, -14F, -4F);

		turretModel[3].addShapeBox(-0.6F, 0F, 8.5F, 4, 6, 1, 0F,0.8F, 0F, 3F, -0.8F, 0F, 2F, -0.8F, 0F, -3F, 0.8F, 0F, 0F, -0.4F, 0F, 2F, 1.7F, 0F, 2.2F, 1.7F, 0F, -1F, -0.4F, 0F, 3.5F); // Box 7
		turretModel[3].setRotationPoint(3F, -14F, -4F);

		turretModel[4].addShapeBox(-0.6F, 0F, -1.5F, 4, 6, 1, 0F,0.8F, 0F, 0F, -0.8F, 0F, -3F, -0.8F, 0F, 2F, 0.8F, 0F, 3F, -0.4F, 0F, 3.5F, 1.7F, 0F, -1F, 1.7F, 0F, 2.2F, -0.4F, 0F, 2F); // Box 8
		turretModel[4].setRotationPoint(3F, -14F, -4F);

		turretModel[5].addShapeBox(-8.8F, 0F, 2.5F, 7, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 1.8F, 3.5F, 0F, 1.8F, 3.5F, 0F, 1.8F, 3.5F, 0F, 1.8F); // Box 9
		turretModel[5].setRotationPoint(3F, -14F, -4F);

		turretModel[6].addShapeBox(-1.6F, 0F, 0F, 7, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		turretModel[6].setRotationPoint(3F, -14F, -4F);

		turretModel[7].addShapeBox(-5.6F, 0F, -1.5F, 6, 6, 5, 0F,0F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 11
		turretModel[7].setRotationPoint(6.7F, -14F, -1F);

		turretModel[8].addShapeBox(5.4F, 0F, 0F, 1, 3, 8, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 13
		turretModel[8].setRotationPoint(3F, -13F, -4F);

		turretModel[9].addShapeBox(6F, 0F, 1F, 1, 2, 2, 0F,-0.3F, 0.15F, 0.4F, -0.3F, 0.15F, 0.4F, -0.3F, 0.15F, 0.4F, -0.3F, 0.15F, 0.4F, -0.3F, -0.4F, 0.4F, -0.3F, -0.4F, 0.4F, -0.3F, -0.4F, 0.4F, -0.3F, -0.4F, 0.4F); // Box 16
		turretModel[9].setRotationPoint(3F, -12F, -4F);

		turretModel[10].addShapeBox(5.7F, 0F, 5.8F, 1, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 18
		turretModel[10].setRotationPoint(3F, -12.3F, -4F);

		turretModel[11].addShapeBox(5.7F, 0F, 5.8F, 1, 1, 1, 0F,0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 19
		turretModel[11].setRotationPoint(3F, -12.9F, -4F);

		turretModel[12].addShapeBox(5.7F, 0F, 5.8F, 1, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F); // Box 20
		turretModel[12].setRotationPoint(3F, -11.7F, -4F);

		turretModel[13].addShapeBox(-0.9F, 0F, 8F, 4, 6, 1, 0F,0.8F, 0F, 9F, -0.8F, 0F, 6F, -0.8F, 0F, -3F, 0.8F, 0F, 0F, -0.4F, 0F, 9F, -0.3F, 0F, 6.2F, -0.3F, 0F, -3F, -0.4F, 0F, 0.5F); // Box 26
		turretModel[13].setRotationPoint(3F, -14.5F, -4F);

		turretModel[14].addShapeBox(-3.9F, 0F, 8F, 3, 6, 1, 0F,0.8F, 0F, 9F, -0.8F, 0F, 9F, -0.8F, 0F, 0F, 0.8F, 0F, 0F, -0.4F, 0F, 9F, -0.3F, 0F, 9.2F, -0.3F, 0F, 0F, -0.4F, 0F, 0.5F); // Box 27
		turretModel[14].setRotationPoint(3F, -14.5F, -4F);

		turretModel[15].addShapeBox(-5.9F, 0F, 8F, 2, 6, 1, 0F,1F, 0F, 7F, -0.8F, 0F, 9F, -0.8F, 0F, 0F, 1F, 0F, -2F, -0.4F, 0F, 8F, -0.3F, 0F, 9.2F, -0.3F, 0F, 0F, -0.4F, 0F, -1.5F); // Box 28
		turretModel[15].setRotationPoint(3F, -14.5F, -4F);

		turretModel[16].addShapeBox(-4.9F, 0F, 9.9F, 3, 1, 1, 0F,-0.4F, -0.15F, 3F, -0.4F, -0.15F, 3F, -0.4F, -0.15F, -0.5F, -0.4F, -0.15F, -0.5F, -0.4F, -0.15F, 4F, -0.4F, -0.15F, 2.2F, -0.4F, -0.15F, -0.1F, -0.4F, -0.15F, -0.1F); // Box 31
		turretModel[16].setRotationPoint(3F, -12.8F, -4F);

		turretModel[17].addShapeBox(3F, 0F, 5.85F, 3, 1, 1, 0F,-0.4F, -0.15F, 3F, -0.4F, -0.15F, 3F, -0.4F, -0.15F, -0.5F, -0.4F, -0.15F, -0.5F, -0.4F, -0.15F, 4F, -0.4F, -0.15F, 2.2F, -0.4F, -0.15F, -0.1F, -0.4F, -0.15F, -0.1F); // Box 32
		turretModel[17].setRotationPoint(3F, -12.8F, -4F);
		turretModel[17].rotateAngleY = 2.21656815F;
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 12
		barrelModel[1] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 15
		barrelModel[2] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 17
		barrelModel[3] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 21
		barrelModel[4] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 22
		barrelModel[5] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 23
		barrelModel[6] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 24
		barrelModel[7] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 25
		barrelModel[8] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 29
		barrelModel[9] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 30

		barrelModel[0].addShapeBox(5.4F, 0F, 1F, 7, 2, 2, 0F,0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 12
		barrelModel[0].setRotationPoint(3F, -12.5F, -4F);

		barrelModel[1].addShapeBox(11.8F, 0F, 1F, 1, 2, 2, 0F,-0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F); // Box 15
		barrelModel[1].setRotationPoint(3F, -12.5F, -4F);

		barrelModel[2].addShapeBox(12.4F, 0F, 1.5F, 14, 1, 1, 0F,0F, -0.35F, -0.05F, 0F, -0.35F, -0.05F, 0F, -0.35F, -0.05F, 0F, -0.35F, -0.05F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F); // Box 17
		barrelModel[2].setRotationPoint(3F, -12F, -4F);

		barrelModel[3].addShapeBox(0.4F, 0F, 5.8F, 4, 1, 1, 0F,0F, -0.38F, -0.38F, 0F, -0.38F, -0.38F, 0F, -0.38F, -0.38F, 0F, -0.38F, -0.38F, 0F, -0.38F, -0.38F, 0F, -0.38F, -0.38F, 0F, -0.38F, -0.38F, 0F, -0.38F, -0.38F); // Box 21
		barrelModel[3].setRotationPoint(8F, -12.6F, -4F);

		barrelModel[4].addShapeBox(-0.7F, 0F, 5.8F, 4, 1, 1, 0F,0F, -0.38F, -0.38F, 0F, -0.38F, -0.38F, 0F, -0.38F, -0.38F, 0F, -0.38F, -0.38F, 0F, -0.38F, -0.38F, 0F, -0.38F, -0.38F, 0F, -0.38F, -0.38F, 0F, -0.38F, -0.38F); // Box 22
		barrelModel[4].setRotationPoint(8F, -12.1F, -4F);

		barrelModel[5].addShapeBox(2F, 0F, 5.8F, 1, 1, 1, 0F,-0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F); // Box 23
		barrelModel[5].setRotationPoint(8F, -12.35F, -4F);

		barrelModel[6].addShapeBox(2F, 0F, 5.8F, 1, 1, 1, 0F,-0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F); // Box 24
		barrelModel[6].setRotationPoint(8F, -12.6F, -4F);

		barrelModel[7].addShapeBox(2F, 0F, 5.8F, 1, 1, 1, 0F,-0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F); // Box 25
		barrelModel[7].setRotationPoint(8F, -12.1F, -4F);

		barrelModel[8].addShapeBox(12.4F, 0F, 1.5F, 14, 1, 1, 0F,0F, -0.4F, -0.3F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.35F, -0.05F, 0F, -0.35F, -0.05F, 0F, -0.35F, -0.05F, 0F, -0.35F, -0.05F); // Box 29
		barrelModel[8].setRotationPoint(3F, -12.3F, -4F);

		barrelModel[9].addShapeBox(12.4F, 0F, 1.5F, 14, 1, 1, 0F,0F, -0.35F, -0.05F, 0F, -0.35F, -0.05F, 0F, -0.35F, -0.05F, 0F, -0.35F, -0.05F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F); // Box 30
		barrelModel[9].setRotationPoint(3F, -11.6F, -4F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 60
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 61
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 62
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 63
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 64
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 65
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 66
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 67
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 68
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 69
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 70
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 71
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 72
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 73
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 74
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 75
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 76
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 77

		leftTrackWheelModels[0].addShapeBox(-4F, -1F, 0F, 8, 2, 4, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 60
		leftTrackWheelModels[0].setRotationPoint(8F, 5.5F, 8.5F);

		leftTrackWheelModels[1].addShapeBox(-4F, -4F, 0F, 8, 3, 4, 0F,-2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 61
		leftTrackWheelModels[1].setRotationPoint(8F, 5.5F, 8.5F);

		leftTrackWheelModels[2].addShapeBox(-4F, 0.5F, 0F, 8, 3, 4, 0F,-0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 62
		leftTrackWheelModels[2].setRotationPoint(8F, 5.5F, 8.5F);

		leftTrackWheelModels[3].addShapeBox(-4F, -1F, 0F, 8, 2, 4, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 63
		leftTrackWheelModels[3].setRotationPoint(-4F, 5.5F, 8.5F);

		leftTrackWheelModels[4].addShapeBox(-4F, 0.5F, 0F, 8, 3, 4, 0F,0F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 64
		leftTrackWheelModels[4].setRotationPoint(-4F, 5.5F, 8.5F);

		leftTrackWheelModels[5].addShapeBox(-4F, -4F, 0F, 8, 3, 4, 0F,-2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 65
		leftTrackWheelModels[5].setRotationPoint(-4F, 5.5F, 8.5F);

		leftTrackWheelModels[6].addShapeBox(-4F, -1F, 0F, 8, 2, 4, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 66
		leftTrackWheelModels[6].setRotationPoint(-14F, 5.5F, 8.5F);

		leftTrackWheelModels[7].addShapeBox(-4F, 0.5F, 0F, 8, 3, 4, 0F,0F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 67
		leftTrackWheelModels[7].setRotationPoint(-14F, 5.5F, 8.5F);

		leftTrackWheelModels[8].addShapeBox(-4F, -4F, 0F, 8, 3, 4, 0F,-2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 68
		leftTrackWheelModels[8].setRotationPoint(-14F, 5.5F, 8.5F);

		leftTrackWheelModels[9].addShapeBox(-4F, -1F, 0F, 8, 2, 4, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 69
		leftTrackWheelModels[9].setRotationPoint(-23F, 2.2F, 8.5F);

		leftTrackWheelModels[10].addShapeBox(-4F, 0.5F, 0F, 8, 3, 4, 0F,0F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 70
		leftTrackWheelModels[10].setRotationPoint(-23F, 2.2F, 8.5F);

		leftTrackWheelModels[11].addShapeBox(-4F, -4F, 0F, 8, 3, 4, 0F,-2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 71
		leftTrackWheelModels[11].setRotationPoint(-23F, 2.2F, 8.5F);

		leftTrackWheelModels[12].addShapeBox(-4F, -1F, 0F, 8, 2, 4, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 72
		leftTrackWheelModels[12].setRotationPoint(19F, 5.5F, 8.5F);

		leftTrackWheelModels[13].addShapeBox(-4F, 0.5F, 0F, 8, 3, 4, 0F,0F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 73
		leftTrackWheelModels[13].setRotationPoint(19F, 5.5F, 8.5F);

		leftTrackWheelModels[14].addShapeBox(-4F, -4F, 0F, 8, 3, 4, 0F,-2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 74
		leftTrackWheelModels[14].setRotationPoint(19F, 5.5F, 8.5F);

		leftTrackWheelModels[15].addShapeBox(-4F, -4F, 0F, 8, 3, 4, 0F,-2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 75
		leftTrackWheelModels[15].setRotationPoint(28F, 0.5F, 8.55F);

		leftTrackWheelModels[16].addShapeBox(-4F, -1F, 0F, 8, 2, 4, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 76
		leftTrackWheelModels[16].setRotationPoint(28F, 0.5F, 8.55F);

		leftTrackWheelModels[17].addShapeBox(-4F, 0.5F, 0F, 8, 3, 4, 0F,0F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 77
		leftTrackWheelModels[17].setRotationPoint(28F, 0.5F, 8.55F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 78
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 79
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 80
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 81
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 82
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 83
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 84
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 85
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 86
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 87
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 88
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 89
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 90
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 91
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 92
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 93
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 94
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 95

		rightTrackWheelModels[0].addShapeBox(-4F, 0.5F, 0F, 8, 3, 4, 0F,0F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 78
		rightTrackWheelModels[0].setRotationPoint(28F, 0.5F, -21.2F);

		rightTrackWheelModels[1].addShapeBox(-4F, -1F, 0F, 8, 2, 4, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 79
		rightTrackWheelModels[1].setRotationPoint(28F, 0.5F, -21.2F);

		rightTrackWheelModels[2].addShapeBox(-4F, -4F, 0F, 8, 3, 4, 0F,-2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 80
		rightTrackWheelModels[2].setRotationPoint(28F, 0.5F, -21.2F);

		rightTrackWheelModels[3].addShapeBox(-4F, -4F, 0F, 8, 3, 4, 0F,-2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 81
		rightTrackWheelModels[3].setRotationPoint(19F, 5.5F, -21.2F);

		rightTrackWheelModels[4].addShapeBox(-4F, -1F, 0F, 8, 2, 4, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 82
		rightTrackWheelModels[4].setRotationPoint(19F, 5.5F, -21.2F);

		rightTrackWheelModels[5].addShapeBox(-4F, 0.5F, 0F, 8, 3, 4, 0F,0F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 83
		rightTrackWheelModels[5].setRotationPoint(19F, 5.5F, -21.2F);

		rightTrackWheelModels[6].addShapeBox(-4F, 0.5F, 0F, 8, 3, 4, 0F,-0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 84
		rightTrackWheelModels[6].setRotationPoint(8F, 5.5F, -21.2F);

		rightTrackWheelModels[7].addShapeBox(-4F, -1F, 0F, 8, 2, 4, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 85
		rightTrackWheelModels[7].setRotationPoint(8F, 5.5F, -21.2F);

		rightTrackWheelModels[8].addShapeBox(-4F, -4F, 0F, 8, 3, 4, 0F,-2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 86
		rightTrackWheelModels[8].setRotationPoint(8F, 5.5F, -21.2F);

		rightTrackWheelModels[9].addShapeBox(-4F, 0.5F, 0F, 8, 3, 4, 0F,0F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 87
		rightTrackWheelModels[9].setRotationPoint(-4F, 5.5F, -21.2F);

		rightTrackWheelModels[10].addShapeBox(-4F, -1F, 0F, 8, 2, 4, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 88
		rightTrackWheelModels[10].setRotationPoint(-4F, 5.5F, -21.2F);

		rightTrackWheelModels[11].addShapeBox(-4F, -4F, 0F, 8, 3, 4, 0F,-2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 89
		rightTrackWheelModels[11].setRotationPoint(-4F, 5.5F, -21.2F);

		rightTrackWheelModels[12].addShapeBox(-4F, 0.5F, 0F, 8, 3, 4, 0F,0F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 90
		rightTrackWheelModels[12].setRotationPoint(-14F, 5.5F, -21.2F);

		rightTrackWheelModels[13].addShapeBox(-4F, -1F, 0F, 8, 2, 4, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 91
		rightTrackWheelModels[13].setRotationPoint(-14F, 5.5F, -21.2F);

		rightTrackWheelModels[14].addShapeBox(-4F, -4F, 0F, 8, 3, 4, 0F,-2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 92
		rightTrackWheelModels[14].setRotationPoint(-14F, 5.5F, -21.2F);

		rightTrackWheelModels[15].addShapeBox(-4F, 0.5F, 0F, 8, 3, 4, 0F,0F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 93
		rightTrackWheelModels[15].setRotationPoint(-23F, 2.2F, -21.2F);

		rightTrackWheelModels[16].addShapeBox(-4F, -1F, 0F, 8, 2, 4, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 94
		rightTrackWheelModels[16].setRotationPoint(-23F, 2.2F, -21.2F);

		rightTrackWheelModels[17].addShapeBox(-4F, -4F, 0F, 8, 3, 4, 0F,-2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 95
		rightTrackWheelModels[17].setRotationPoint(-23F, 2.2F, -21.2F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 34
		leftTrackModel[1] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 35
		leftTrackModel[2] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 36
		leftTrackModel[3] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 40
		leftTrackModel[4] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 43
		leftTrackModel[5] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 45
		leftTrackModel[6] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 46
		leftTrackModel[7] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 47
		leftTrackModel[8] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 48
		leftTrackModel[9] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 56
		leftTrackModel[10] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 57

		leftTrackModel[0].addBox(0F, 0F, 0F, 35, 1, 4, 0F); // Box 34
		leftTrackModel[0].setRotationPoint(-15F, 9F, 9F);

		leftTrackModel[1].addBox(0F, 0F, 0F, 32, 1, 4, 0F); // Box 35
		leftTrackModel[1].setRotationPoint(-2F, -3F, 9F);
		leftTrackModel[1].rotateAngleZ = 0.01745329F;

		leftTrackModel[2].addBox(0F, 0F, 0F, 22, 1, 4, 0F); // Box 36
		leftTrackModel[2].setRotationPoint(-24F, -2F, 9F);
		leftTrackModel[2].rotateAngleZ = 0.04363323F;

		leftTrackModel[3].addBox(0F, 0F, 0F, 14, 1, 4, 0F); // Box 40
		leftTrackModel[3].setRotationPoint(19.5F, 9.2F, 9F);
		leftTrackModel[3].rotateAngleZ = 0.52359878F;

		leftTrackModel[4].addBox(0F, 0F, 0F, 11, 1, 4, 0F); // Box 43
		leftTrackModel[4].setRotationPoint(-24.5F, 5F, 9F);
		leftTrackModel[4].rotateAngleZ = -0.38397244F;

		leftTrackModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0.03F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.03F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		leftTrackModel[5].setRotationPoint(-25.7F, 3.85F, 9F);
		leftTrackModel[5].rotateAngleZ = -0.73303829F;

		leftTrackModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F); // Box 46
		leftTrackModel[6].setRotationPoint(-26.68F, 2.1F, 9F);
		leftTrackModel[6].rotateAngleZ = -1.04719755F;

		leftTrackModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.05F, 0F, 0.5F, -0.05F, 0F, 0F, 0F, 0F); // Box 47
		leftTrackModel[7].setRotationPoint(-25.8F, 0.58F, 9F);
		leftTrackModel[7].rotateAngleZ = -1.91986218F;

		leftTrackModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0.5F, 0.4F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.5F, 0.4F, 0F, 0.75F, -0.35F, 0F, 0.8F, -0.1F, 0F, 0.8F, -0.1F, 0F, 0.75F, -0.35F, 0F); // Box 48
		leftTrackModel[8].setRotationPoint(-24.1F, -1F, 9F);
		leftTrackModel[8].rotateAngleZ = -2.39110108F;

		leftTrackModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0.5F, 0F, 0F, 1.65F, -0.48F, 0F, 1.65F, -0.48F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.2F, 0.4F, 0F, 1.2F, 0.4F, 0F, 0.5F, 0F, 0F); // Box 56
		leftTrackModel[9].setRotationPoint(32.6F, -0.6F, 9F);
		leftTrackModel[9].rotateAngleZ = -1.57079633F;

		leftTrackModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0.5F, 0.2F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.5F, 0.2F, 0F, 0.65F, -0.2F, 0F, 0.95F, -0.2F, 0F, 0.95F, -0.2F, 0F, 0.65F, -0.2F, 0F); // Box 57
		leftTrackModel[10].setRotationPoint(31.6F, -0.95F, 9F);
		leftTrackModel[10].rotateAngleZ = 2.39110108F;
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 37
		rightTrackModel[1] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 38
		rightTrackModel[2] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 39
		rightTrackModel[3] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 42
		rightTrackModel[4] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 44
		rightTrackModel[5] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 49
		rightTrackModel[6] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 50
		rightTrackModel[7] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 51
		rightTrackModel[8] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 52
		rightTrackModel[9] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 58
		rightTrackModel[10] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 59

		rightTrackModel[0].addBox(0F, 0F, 0F, 35, 1, 4, 0F); // Box 37
		rightTrackModel[0].setRotationPoint(-15F, 9F, -21.2F);

		rightTrackModel[1].addBox(0F, 0F, 0F, 22, 1, 4, 0F); // Box 38
		rightTrackModel[1].setRotationPoint(-24F, -2F, -21.2F);
		rightTrackModel[1].rotateAngleZ = 0.04363323F;

		rightTrackModel[2].addBox(0F, 0F, 0F, 32, 1, 4, 0F); // Box 39
		rightTrackModel[2].setRotationPoint(-2F, -3F, -21.2F);
		rightTrackModel[2].rotateAngleZ = 0.01745329F;

		rightTrackModel[3].addBox(0F, 0F, 0F, 14, 1, 4, 0F); // Box 42
		rightTrackModel[3].setRotationPoint(19.5F, 9.2F, -21.2F);
		rightTrackModel[3].rotateAngleZ = 0.52359878F;

		rightTrackModel[4].addBox(0F, 0F, 0F, 11, 1, 4, 0F); // Box 44
		rightTrackModel[4].setRotationPoint(-24.5F, 5.05F, -21.2F);
		rightTrackModel[4].rotateAngleZ = -0.38397244F;

		rightTrackModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0.03F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.03F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		rightTrackModel[5].setRotationPoint(-25.7F, 3.85F, -21.2F);
		rightTrackModel[5].rotateAngleZ = -0.73303829F;

		rightTrackModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F); // Box 50
		rightTrackModel[6].setRotationPoint(-26.68F, 2.1F, -21.2F);
		rightTrackModel[6].rotateAngleZ = -1.04719755F;

		rightTrackModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.05F, 0F, 0.5F, -0.05F, 0F, 0F, 0F, 0F); // Box 51
		rightTrackModel[7].setRotationPoint(-25.8F, 0.58F, -21.2F);
		rightTrackModel[7].rotateAngleZ = -1.91986218F;

		rightTrackModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0.5F, 0.4F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.5F, 0.4F, 0F, 0.75F, -0.35F, 0F, 0.8F, -0.1F, 0F, 0.8F, -0.1F, 0F, 0.75F, -0.35F, 0F); // Box 52
		rightTrackModel[8].setRotationPoint(-24.1F, -1F, -21.2F);
		rightTrackModel[8].rotateAngleZ = -2.39110108F;

		rightTrackModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0.5F, 0F, 0F, 1.65F, -0.48F, 0F, 1.65F, -0.48F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.2F, 0.4F, 0F, 1.2F, 0.4F, 0F, 0.5F, 0F, 0F); // Box 58
		rightTrackModel[9].setRotationPoint(32.6F, -0.6F, -21.2F);
		rightTrackModel[9].rotateAngleZ = -1.57079633F;

		rightTrackModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0.5F, 0.2F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.5F, 0.2F, 0F, 0.65F, -0.2F, 0F, 0.95F, -0.2F, 0F, 0.95F, -0.2F, 0F, 0.65F, -0.2F, 0F); // Box 59
		rightTrackModel[10].setRotationPoint(31.6F, -0.95F, -21.2F);
		rightTrackModel[10].rotateAngleZ = 2.39110108F;
	}
}