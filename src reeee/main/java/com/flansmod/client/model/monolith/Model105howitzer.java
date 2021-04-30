//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 105howitzer
// Model Creator: 
// Created on: 28.02.2016 - 15:44:55
// Last changed on: 28.02.2016 - 15:44:55

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class Model105howitzer extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public Model105howitzer() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[99];
		turretModel = new ModelRendererTurbo[25];
		barrelModel = new ModelRendererTurbo[31];

		initbodyModel_1();
		initturretModel_1();
		initbarrelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 7
		bodyModel[6] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 8
		bodyModel[7] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 9
		bodyModel[8] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 10
		bodyModel[9] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 11
		bodyModel[10] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 12
		bodyModel[11] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 15
		bodyModel[13] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 16
		bodyModel[14] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 0
		bodyModel[15] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 1
		bodyModel[16] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 2
		bodyModel[17] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 3
		bodyModel[18] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 4
		bodyModel[19] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 5
		bodyModel[20] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 6
		bodyModel[21] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 7
		bodyModel[22] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 8
		bodyModel[23] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 9
		bodyModel[24] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 10
		bodyModel[25] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 11
		bodyModel[26] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 12
		bodyModel[27] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 13
		bodyModel[28] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 14
		bodyModel[29] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 15
		bodyModel[30] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 39
		bodyModel[31] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 40
		bodyModel[32] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 41
		bodyModel[33] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 42
		bodyModel[34] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 46
		bodyModel[35] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 47
		bodyModel[36] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 48
		bodyModel[37] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 49
		bodyModel[38] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 50
		bodyModel[39] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 51
		bodyModel[40] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 52
		bodyModel[41] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 53
		bodyModel[42] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 54
		bodyModel[43] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 55
		bodyModel[44] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 56
		bodyModel[45] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 57
		bodyModel[46] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 58
		bodyModel[47] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 59
		bodyModel[48] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 60
		bodyModel[49] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 61
		bodyModel[50] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 62
		bodyModel[51] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 63
		bodyModel[52] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 64
		bodyModel[53] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 65
		bodyModel[54] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 66
		bodyModel[55] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 67
		bodyModel[56] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 68
		bodyModel[57] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 69
		bodyModel[58] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 70
		bodyModel[59] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 71
		bodyModel[60] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 72
		bodyModel[61] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 73
		bodyModel[62] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 74
		bodyModel[63] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 75
		bodyModel[64] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 76
		bodyModel[65] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 77
		bodyModel[66] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 78
		bodyModel[67] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 79
		bodyModel[68] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 80
		bodyModel[69] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 81
		bodyModel[70] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 99
		bodyModel[71] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 100
		bodyModel[72] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 101
		bodyModel[73] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 102
		bodyModel[74] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 103
		bodyModel[75] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 106
		bodyModel[76] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 107
		bodyModel[77] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 108
		bodyModel[78] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 109
		bodyModel[79] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 110
		bodyModel[80] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 111
		bodyModel[81] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 112
		bodyModel[82] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 113
		bodyModel[83] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 114
		bodyModel[84] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 115
		bodyModel[85] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 116
		bodyModel[86] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 117
		bodyModel[87] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 118
		bodyModel[88] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 119
		bodyModel[89] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Box 120
		bodyModel[90] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 121
		bodyModel[91] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 122
		bodyModel[92] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 123
		bodyModel[93] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 124
		bodyModel[94] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 125
		bodyModel[95] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 126
		bodyModel[96] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 127
		bodyModel[97] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 128
		bodyModel[98] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 129

		bodyModel[0].addShapeBox(-4.5F, -4.5F, -1F, 9, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-7F, -9.5F, 24F);

		bodyModel[1].addBox(-19.5F, -7.5F, -1F, 3, 15, 3, 0F); // Box 1
		bodyModel[1].setRotationPoint(-7F, -9.5F, 24F);

		bodyModel[2].addBox(16.5F, -7.5F, -1F, 3, 15, 3, 0F); // Box 2
		bodyModel[2].setRotationPoint(-7F, -9.5F, 24F);

		bodyModel[3].addBox(-7.5F, -19.5F, -1F, 15, 3, 3, 0F); // Box 3
		bodyModel[3].setRotationPoint(-7F, -9.5F, 24F);

		bodyModel[4].addShapeBox(16.5F, -19.5F, -1F, 3, 12, 3, 0F,9F, -3F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 9F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[4].setRotationPoint(-7F, -9.5F, 24F);

		bodyModel[5].addShapeBox(-19.5F, -19.5F, -1F, 3, 12, 3, 0F,-12F, 0F, 0F, 9F, -3F, 0F, 9F, -3F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[5].setRotationPoint(-7F, -9.5F, 24F);

		bodyModel[6].addShapeBox(-19.5F, 7.5F, -1F, 3, 12, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 9F, -3F, 0F, 9F, -3F, 0F, -12F, 0F, 0F); // Box 8
		bodyModel[6].setRotationPoint(-7F, -9.5F, 24F);

		bodyModel[7].addShapeBox(16.5F, 7.5F, -1F, 3, 12, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, -3F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 9F, -3F, 0F); // Box 9
		bodyModel[7].setRotationPoint(-7F, -9.5F, 24F);

		bodyModel[8].addBox(-7.5F, 16.5F, -1F, 15, 3, 3, 0F); // Box 10
		bodyModel[8].setRotationPoint(-7F, -9.5F, 24F);

		bodyModel[9].addShapeBox(-4.5F, 1.5F, -1F, 9, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 11
		bodyModel[9].setRotationPoint(-7F, -9.5F, 24F);

		bodyModel[10].addShapeBox(-4.5F, -1.5F, -1F, 9, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[10].setRotationPoint(-7F, -9.5F, 24F);

		bodyModel[11].addShapeBox(-1F, -17.5F, -0.5F, 2, 35, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[11].setRotationPoint(-7F, -9.5F, 24F);

		bodyModel[12].addShapeBox(-1F, -17.5F, -0.5F, 2, 35, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[12].setRotationPoint(-7F, -9.5F, 24F);
		bodyModel[12].rotateAngleZ = 0.78539816F;

		bodyModel[13].addShapeBox(-17.5F, -1F, -0.5F, 35, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[13].setRotationPoint(-7F, -9.5F, 24F);

		bodyModel[14].addShapeBox(-1F, -17.5F, -0.5F, 2, 35, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[14].setRotationPoint(-7F, -9.5F, 24F);
		bodyModel[14].rotateAngleZ = -0.78539816F;

		bodyModel[15].addBox(0F, -26F, -6F, 1, 6, 12, 0F); // Box 1
		bodyModel[15].setRotationPoint(6F, -15F, 0F);
		bodyModel[15].rotateAngleZ = 0.40142573F;

		bodyModel[16].addBox(0F, -15F, -22F, 1, 15, 17, 0F); // Box 2
		bodyModel[16].setRotationPoint(6F, -15F, 0F);
		bodyModel[16].rotateAngleZ = 0.40142573F;

		bodyModel[17].addBox(0F, -15F, 5F, 1, 15, 17, 0F); // Box 3
		bodyModel[17].setRotationPoint(6F, -15F, 0F);
		bodyModel[17].rotateAngleZ = 0.40142573F;

		bodyModel[18].addShapeBox(0F, -31F, -27F, 1, 1, 54, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[18].setRotationPoint(6F, -15F, 0F);
		bodyModel[18].rotateAngleZ = 0.40142573F;

		bodyModel[19].addBox(0F, -26F, 15F, 1, 9, 12, 0F); // Box 5
		bodyModel[19].setRotationPoint(6F, -15F, 0F);
		bodyModel[19].rotateAngleZ = 0.40142573F;

		bodyModel[20].addBox(0F, -26F, -27F, 1, 9, 21, 0F); // Box 6
		bodyModel[20].setRotationPoint(6F, -15F, 0F);
		bodyModel[20].rotateAngleZ = 0.40142573F;

		bodyModel[21].addShapeBox(0F, -20F, -6F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 7
		bodyModel[21].setRotationPoint(6F, -15F, 0F);
		bodyModel[21].rotateAngleZ = 0.40142573F;

		bodyModel[22].addShapeBox(0F, -20F, 2F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[22].setRotationPoint(6F, -15F, 0F);
		bodyModel[22].rotateAngleZ = 0.40142573F;

		bodyModel[23].addShapeBox(0F, -17F, -26F, 1, 1, 21, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[23].setRotationPoint(6F, -15F, 0F);
		bodyModel[23].rotateAngleZ = 0.40142573F;

		bodyModel[24].addShapeBox(0F, -16F, -22F, 1, 1, 17, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[24].setRotationPoint(6F, -15F, 0F);
		bodyModel[24].rotateAngleZ = 0.40142573F;

		bodyModel[25].addShapeBox(0F, -16F, 5F, 1, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[25].setRotationPoint(6F, -15F, 0F);
		bodyModel[25].rotateAngleZ = 0.40142573F;

		bodyModel[26].addShapeBox(0F, -17F, 5F, 1, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[26].setRotationPoint(6F, -15F, 0F);
		bodyModel[26].rotateAngleZ = 0.40142573F;

		bodyModel[27].addBox(0F, -26F, 6F, 1, 9, 3, 0F); // Box 13
		bodyModel[27].setRotationPoint(6F, -15F, 0F);
		bodyModel[27].rotateAngleZ = 0.40142573F;

		bodyModel[28].addBox(0F, -26F, 9F, 1, 3, 6, 0F); // Box 14
		bodyModel[28].setRotationPoint(6F, -15F, 0F);
		bodyModel[28].rotateAngleZ = 0.40142573F;

		bodyModel[29].addShapeBox(0F, -30F, -27F, 1, 4, 54, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[29].setRotationPoint(6F, -15F, 0F);
		bodyModel[29].rotateAngleZ = 0.40142573F;

		bodyModel[30].addShapeBox(0F, -3F, -7F, 20, 8, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 2F, 0F); // Box 39
		bodyModel[30].setRotationPoint(-13F, -8F, 0F);

		bodyModel[31].addShapeBox(-6F, -1F, -7F, 6, 8, 14, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[31].setRotationPoint(-13F, -8F, 0F);

		bodyModel[32].addShapeBox(-4F, -1F, -7F, 29, 8, 2, 0F,0F, -8F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -3F, 0F, 5F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -3F); // Box 41
		bodyModel[32].setRotationPoint(-44F, -8F, 0F);

		bodyModel[33].addShapeBox(-4F, -1F, 5F, 29, 8, 2, 0F,0F, -8F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 3F, 0F, 5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 3F); // Box 42
		bodyModel[33].setRotationPoint(-44F, -8F, 0F);

		bodyModel[34].addShapeBox(-3F, -1F, -5F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[34].setRotationPoint(-7F, -9.5F, 24F);

		bodyModel[35].addShapeBox(-3F, -3F, -5F, 6, 2, 4, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[35].setRotationPoint(-7F, -9.5F, 24F);

		bodyModel[36].addShapeBox(-3F, 1F, -5F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 48
		bodyModel[36].setRotationPoint(-7F, -9.5F, 24F);

		bodyModel[37].addShapeBox(-3F, 1F, 2F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 49
		bodyModel[37].setRotationPoint(-7F, -9.5F, 24F);

		bodyModel[38].addShapeBox(-3F, -1F, 2F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[38].setRotationPoint(-7F, -9.5F, 24F);

		bodyModel[39].addShapeBox(-3F, -3F, 2F, 6, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[39].setRotationPoint(-7F, -9.5F, 24F);

		bodyModel[40].addShapeBox(-1.5F, -0.5F, -17F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[40].setRotationPoint(-7F, -9.5F, 24F);

		bodyModel[41].addShapeBox(-1.5F, -1.5F, -17F, 3, 1, 12, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[41].setRotationPoint(-7F, -9.5F, 24F);

		bodyModel[42].addShapeBox(-1.5F, 0.5F, -17F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 54
		bodyModel[42].setRotationPoint(-7F, -9.5F, 24F);

		bodyModel[43].addShapeBox(-6F, -1F, -10F, 2, 5, 20, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 55
		bodyModel[43].setRotationPoint(-44F, 0F, 0F);

		bodyModel[44].addShapeBox(0F, 0F, 5F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[44].setRotationPoint(6F, -15F, 0F);
		bodyModel[44].rotateAngleZ = 0.40142573F;

		bodyModel[45].addShapeBox(0F, 0F, -21F, 1, 1, 16, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 57
		bodyModel[45].setRotationPoint(6F, -15F, 0F);
		bodyModel[45].rotateAngleZ = 0.40142573F;

		bodyModel[46].addShapeBox(-32F, 0F, -10F, 26, 5, 2, 0F,0F, -6F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 5F, 0F, 5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 5F); // Box 58
		bodyModel[46].setRotationPoint(-44F, 0F, 0F);

		bodyModel[47].addShapeBox(-32F, 0F, 8F, 26, 5, 2, 0F,0F, -6F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -5F, 0F, 5F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -5F); // Box 59
		bodyModel[47].setRotationPoint(-44F, 0F, 0F);

		bodyModel[48].addShapeBox(-39F, 6F, -5F, 7, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[48].setRotationPoint(-44F, 0F, 0F);

		bodyModel[49].addShapeBox(-39F, 6F, -12F, 7, 4, 7, 0F,-2F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[49].setRotationPoint(-44F, 0F, 0F);

		bodyModel[50].addShapeBox(-39F, 6F, 5F, 7, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 62
		bodyModel[50].setRotationPoint(-44F, 0F, 0F);

		bodyModel[51].addShapeBox(-39F, 10F, -2F, 7, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, -1F, -1F, 0F, -1F); // Box 63
		bodyModel[51].setRotationPoint(-44F, 0F, 0F);

		bodyModel[52].addShapeBox(-41F, 6F, -3F, 2, 4, 4, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 64
		bodyModel[52].setRotationPoint(-44F, 0F, 0F);

		bodyModel[53].addShapeBox(-43F, 7F, -3F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[53].setRotationPoint(-44F, 0F, 0F);

		bodyModel[54].addShapeBox(-47F, 7F, -3F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[54].setRotationPoint(-44F, 0F, 0F);

		bodyModel[55].addShapeBox(-47F, 7F, -5F, 6, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[55].setRotationPoint(-44F, 0F, 0F);

		bodyModel[56].addShapeBox(-47F, 7F, 1F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 68
		bodyModel[56].setRotationPoint(-44F, 0F, 0F);

		bodyModel[57].addShapeBox(-37F, 4F, -3F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[57].setRotationPoint(-44F, 0F, 0F);

		bodyModel[58].addShapeBox(-37F, 2F, -3F, 4, 2, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[58].setRotationPoint(-44F, 0F, 0F);

		bodyModel[59].addShapeBox(-37F, 2F, 1F, 4, 2, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[59].setRotationPoint(-44F, 0F, 0F);

		bodyModel[60].addShapeBox(-37F, 4F, 1F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[60].setRotationPoint(-44F, 0F, 0F);

		bodyModel[61].addShapeBox(-36F, 3F, -4F, 2, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[61].setRotationPoint(-44F, 0F, 0F);

		bodyModel[62].addShapeBox(-1F, -18F, -1F, 2, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[62].setRotationPoint(-79F, 4F, 0F);
		bodyModel[62].rotateAngleZ = 0.73303829F;

		bodyModel[63].addShapeBox(-2F, -2F, -1F, 4, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[63].setRotationPoint(-79F, 4F, 0F);
		bodyModel[63].rotateAngleZ = 0.73303829F;

		bodyModel[64].addShapeBox(-1F, -27F, -1F, 2, 9, 2, 0F,6F, 0F, 0F, -7F, 1F, 0F, -7F, 1F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[64].setRotationPoint(-79F, 4F, 0F);
		bodyModel[64].rotateAngleZ = 0.73303829F;

		bodyModel[65].addShapeBox(-5F, 1F, -10F, 2, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[65].setRotationPoint(-13F, -8F, 0F);

		bodyModel[66].addShapeBox(-4F, 1F, -12F, 19, 2, 2, 0F,0F, 0F, 0F, -1F, 20F, 8F, -1F, 20F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 8F, 0F, -21F, -8F, 0F, 0F, 0F); // Box 78
		bodyModel[66].setRotationPoint(-13F, -8F, 0F);

		bodyModel[67].addShapeBox(-6F, 0F, -13F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[67].setRotationPoint(-13F, -8F, 0F);

		bodyModel[68].addShapeBox(-4F, 1F, 10F, 19, 2, 2, 0F,0F, 0F, 0F, -1F, 20F, -8F, -1F, 20F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, -8F, 0F, -21F, 8F, 0F, 0F, 0F); // Box 80
		bodyModel[68].setRotationPoint(-13F, -8F, 0F);

		bodyModel[69].addShapeBox(-6F, 0F, 9F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[69].setRotationPoint(-13F, -8F, 0F);

		bodyModel[70].addShapeBox(-11F, 1F, 7F, 2, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[70].setRotationPoint(-13F, -8F, 0F);

		bodyModel[71].addShapeBox(-11F, -5F, 13F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[71].setRotationPoint(-13F, -8F, 0F);

		bodyModel[72].addShapeBox(-12F, -7F, 10F, 4, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[72].setRotationPoint(-13F, -8F, 0F);

		bodyModel[73].addShapeBox(-15F, -7F, 10F, 3, 2, 8, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 102
		bodyModel[73].setRotationPoint(-13F, -8F, 0F);

		bodyModel[74].addShapeBox(-8F, -7F, 10F, 3, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 103
		bodyModel[74].setRotationPoint(-13F, -8F, 0F);

		bodyModel[75].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[75].setRotationPoint(-7F, -9.5F, -26F);

		bodyModel[76].addBox(-19.5F, -7.5F, 0F, 3, 15, 3, 0F); // Box 107
		bodyModel[76].setRotationPoint(-7F, -9.5F, -26F);

		bodyModel[77].addBox(16.5F, -7.5F, 0F, 3, 15, 3, 0F); // Box 108
		bodyModel[77].setRotationPoint(-7F, -9.5F, -26F);

		bodyModel[78].addBox(-7.5F, -19.5F, 0F, 15, 3, 3, 0F); // Box 109
		bodyModel[78].setRotationPoint(-7F, -9.5F, -26F);

		bodyModel[79].addShapeBox(16.5F, -19.5F, 0F, 3, 12, 3, 0F,9F, -3F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 9F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[79].setRotationPoint(-7F, -9.5F, -26F);

		bodyModel[80].addShapeBox(-19.5F, -19.5F, 0F, 3, 12, 3, 0F,-12F, 0F, 0F, 9F, -3F, 0F, 9F, -3F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[80].setRotationPoint(-7F, -9.5F, -26F);

		bodyModel[81].addShapeBox(-19.5F, 7.5F, 0F, 3, 12, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 9F, -3F, 0F, 9F, -3F, 0F, -12F, 0F, 0F); // Box 112
		bodyModel[81].setRotationPoint(-7F, -9.5F, -26F);

		bodyModel[82].addShapeBox(16.5F, 7.5F, 0F, 3, 12, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, -3F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 9F, -3F, 0F); // Box 113
		bodyModel[82].setRotationPoint(-7F, -9.5F, -26F);

		bodyModel[83].addBox(-7.5F, 16.5F, 0F, 15, 3, 3, 0F); // Box 114
		bodyModel[83].setRotationPoint(-7F, -9.5F, -26F);

		bodyModel[84].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 115
		bodyModel[84].setRotationPoint(-7F, -9.5F, -26F);

		bodyModel[85].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[85].setRotationPoint(-7F, -9.5F, -26F);

		bodyModel[86].addShapeBox(-1F, -17.5F, 0.5F, 2, 35, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[86].setRotationPoint(-7F, -9.5F, -26F);

		bodyModel[87].addShapeBox(-1F, -17.5F, 0.5F, 2, 35, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[87].setRotationPoint(-7F, -9.5F, -26F);
		bodyModel[87].rotateAngleZ = 0.78539816F;

		bodyModel[88].addShapeBox(-17.5F, -1F, 0.5F, 35, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[88].setRotationPoint(-7F, -9.5F, -26F);

		bodyModel[89].addShapeBox(-1F, -17.5F, 0.5F, 2, 35, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[89].setRotationPoint(-7F, -9.5F, -26F);
		bodyModel[89].rotateAngleZ = -0.78539816F;

		bodyModel[90].addShapeBox(-3F, -1F, 3F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[90].setRotationPoint(-7F, -9.5F, -26F);

		bodyModel[91].addShapeBox(-3F, -3F, 3F, 6, 2, 4, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[91].setRotationPoint(-7F, -9.5F, -26F);

		bodyModel[92].addShapeBox(-3F, 1F, 3F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 123
		bodyModel[92].setRotationPoint(-7F, -9.5F, -26F);

		bodyModel[93].addShapeBox(-3F, 1F, -1F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 124
		bodyModel[93].setRotationPoint(-7F, -9.5F, -26F);

		bodyModel[94].addShapeBox(-3F, -1F, -1F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[94].setRotationPoint(-7F, -9.5F, -26F);

		bodyModel[95].addShapeBox(-3F, -3F, -1F, 6, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[95].setRotationPoint(-7F, -9.5F, -26F);

		bodyModel[96].addShapeBox(-1.5F, -0.5F, 7F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[96].setRotationPoint(-7F, -9.5F, -26F);

		bodyModel[97].addShapeBox(-1.5F, -1.5F, 7F, 3, 1, 12, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[97].setRotationPoint(-7F, -9.5F, -26F);

		bodyModel[98].addShapeBox(-1.5F, 0.5F, 7F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 129
		bodyModel[98].setRotationPoint(-7F, -9.5F, -26F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 25
		turretModel[1] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 26
		turretModel[2] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 27
		turretModel[3] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 28
		turretModel[4] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 29
		turretModel[5] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 30
		turretModel[6] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 31
		turretModel[7] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 32
		turretModel[8] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 33
		turretModel[9] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 34
		turretModel[10] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 35
		turretModel[11] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 82
		turretModel[12] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 83
		turretModel[13] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 84
		turretModel[14] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 85
		turretModel[15] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 86
		turretModel[16] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 87
		turretModel[17] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 88
		turretModel[18] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 89
		turretModel[19] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 90
		turretModel[20] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 94
		turretModel[21] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 95
		turretModel[22] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 96
		turretModel[23] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 97
		turretModel[24] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 98

		turretModel[0].addShapeBox(-1.5F, -1F, -6F, 3, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		turretModel[0].setRotationPoint(0F, -15F, 0F);

		turretModel[1].addShapeBox(-5.5F, 0F, -6F, 13, 3, 2, 0F,-4F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		turretModel[1].setRotationPoint(0F, -15F, 0F);

		turretModel[2].addShapeBox(-5.5F, 0F, 4F, 13, 3, 2, 0F,-4F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		turretModel[2].setRotationPoint(0F, -15F, 0F);

		turretModel[3].addShapeBox(-1.5F, -1F, 4F, 3, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		turretModel[3].setRotationPoint(0F, -15F, 0F);

		turretModel[4].addShapeBox(-7F, 3F, -7.5F, 2, 1, 15, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 29
		turretModel[4].setRotationPoint(0F, -15F, 0F);

		turretModel[5].addShapeBox(7F, 3F, -7.5F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 30
		turretModel[5].setRotationPoint(0F, -15F, 0F);

		turretModel[6].addShapeBox(-5F, 3F, -7.5F, 12, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		turretModel[6].setRotationPoint(0F, -15F, 0F);

		turretModel[7].addShapeBox(9F, 3F, -2.5F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		turretModel[7].setRotationPoint(0F, -15F, 0F);

		turretModel[8].addShapeBox(9F, 3F, 0.5F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		turretModel[8].setRotationPoint(0F, -15F, 0F);

		turretModel[9].addShapeBox(15F, 3F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		turretModel[9].setRotationPoint(0F, -15F, 0F);

		turretModel[10].addShapeBox(9F, 3F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		turretModel[10].setRotationPoint(0F, -15F, 0F);

		turretModel[11].addShapeBox(11F, 2.5F, 0.5F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		turretModel[11].setRotationPoint(0F, -15F, 0F);

		turretModel[12].addShapeBox(11F, 1.5F, 0.5F, 3, 1, 6, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		turretModel[12].setRotationPoint(0F, -15F, 0F);

		turretModel[13].addShapeBox(11F, 3.5F, 0.5F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 84
		turretModel[13].setRotationPoint(0F, -15F, 0F);

		turretModel[14].addShapeBox(-7F, 1.5F, 6.5F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		turretModel[14].setRotationPoint(0F, -15F, 0F);

		turretModel[15].addShapeBox(-8F, 1.5F, 5.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		turretModel[15].setRotationPoint(0F, -15F, 0F);

		turretModel[16].addShapeBox(-8F, 0.5F, 5.5F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		turretModel[16].setRotationPoint(0F, -15F, 0F);

		turretModel[17].addShapeBox(-8F, 2.5F, 5.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 88
		turretModel[17].setRotationPoint(0F, -15F, 0F);

		turretModel[18].addShapeBox(-3F, 1F, 6F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		turretModel[18].setRotationPoint(0F, -15F, 0F);

		turretModel[19].addShapeBox(2F, 1F, 6F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		turretModel[19].setRotationPoint(0F, -15F, 0F);

		turretModel[20].addShapeBox(-4F, 0.5F, 4.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		turretModel[20].setRotationPoint(0F, -15F, 0F);

		turretModel[21].addShapeBox(-4F, 0.5F, 5.5F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		turretModel[21].setRotationPoint(0F, -15F, 0F);

		turretModel[22].addShapeBox(-5F, 0.5F, 9.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		turretModel[22].setRotationPoint(0F, -15F, 0F);

		turretModel[23].addShapeBox(-5F, -0.5F, 9.5F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		turretModel[23].setRotationPoint(0F, -15F, 0F);

		turretModel[24].addShapeBox(-5F, 1.5F, 9.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 98
		turretModel[24].setRotationPoint(0F, -15F, 0F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 17
		barrelModel[1] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 18
		barrelModel[2] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 19
		barrelModel[3] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 20
		barrelModel[4] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 23
		barrelModel[5] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 25
		barrelModel[6] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 26
		barrelModel[7] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 27
		barrelModel[8] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 31
		barrelModel[9] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 32
		barrelModel[10] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 35
		barrelModel[11] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 37
		barrelModel[12] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 40
		barrelModel[13] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 41
		barrelModel[14] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 42
		barrelModel[15] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 43
		barrelModel[16] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 44
		barrelModel[17] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 45
		barrelModel[18] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 46
		barrelModel[19] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 47
		barrelModel[20] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 16
		barrelModel[21] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 17
		barrelModel[22] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 18
		barrelModel[23] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 21
		barrelModel[24] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 22
		barrelModel[25] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 23
		barrelModel[26] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 36
		barrelModel[27] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 37
		barrelModel[28] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 38
		barrelModel[29] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 104
		barrelModel[30] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 105

		barrelModel[0].addShapeBox(13F, -11F, -1F, 14, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 17
		barrelModel[0].setRotationPoint(0F, -15F, 0F);

		barrelModel[1].addShapeBox(13F, -9F, -3F, 14, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 18
		barrelModel[1].setRotationPoint(0F, -15F, 0F);

		barrelModel[2].addShapeBox(13F, -9F, 2F, 14, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		barrelModel[2].setRotationPoint(0F, -15F, 0F);

		barrelModel[3].addShapeBox(13F, -11F, 2F, 14, 2, 1, 0F,0F, -1.5F, 1F, 0F, -1.5F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		barrelModel[3].setRotationPoint(0F, -15F, 0F);

		barrelModel[4].addShapeBox(13F, -6F, -1F, 14, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		barrelModel[4].setRotationPoint(0F, -15F, 0F);

		barrelModel[5].addShapeBox(13F, -7F, 2F, 14, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 1F, 0F, -1.5F, 1F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 25
		barrelModel[5].setRotationPoint(0F, -15F, 0F);

		barrelModel[6].addShapeBox(13F, -7F, -3F, 14, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1.5F, 1F, 0F, -1.5F, 1F); // Box 26
		barrelModel[6].setRotationPoint(0F, -15F, 0F);

		barrelModel[7].addShapeBox(13F, -11F, -3F, 14, 2, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, -1.5F, 1F, 0F, -1.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 27
		barrelModel[7].setRotationPoint(0F, -15F, 0F);

		barrelModel[8].addShapeBox(-11F, -10F, -4F, 9, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		barrelModel[8].setRotationPoint(0F, -15F, 0F);

		barrelModel[9].addShapeBox(-2F, -11.5F, -3.5F, 15, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 32
		barrelModel[9].setRotationPoint(0F, -15F, 0F);

		barrelModel[10].addShapeBox(-2F, -11.5F, -1.5F, 15, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 35
		barrelModel[10].setRotationPoint(0F, -15F, 0F);

		barrelModel[11].addShapeBox(-2F, -9.5F, -3.5F, 15, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 37
		barrelModel[11].setRotationPoint(0F, -15F, 0F);

		barrelModel[12].addShapeBox(-2F, -6.5F, -3.5F, 15, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 1F, 0F, -2F, 1F); // Box 40
		barrelModel[12].setRotationPoint(0F, -15F, 0F);

		barrelModel[13].addShapeBox(-2F, -6.5F, 1.5F, 15, 2, 2, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 41
		barrelModel[13].setRotationPoint(0F, -15F, 0F);

		barrelModel[14].addShapeBox(-2F, -9.5F, 1.5F, 15, 3, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		barrelModel[14].setRotationPoint(0F, -15F, 0F);

		barrelModel[15].addShapeBox(-2F, -11.5F, 1.5F, 15, 2, 2, 0F,0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		barrelModel[15].setRotationPoint(0F, -15F, 0F);

		barrelModel[16].addShapeBox(-2F, -6.5F, -1.5F, 15, 2, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		barrelModel[16].setRotationPoint(0F, -15F, 0F);

		barrelModel[17].addShapeBox(-11F, -12F, -4F, 9, 2, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		barrelModel[17].setRotationPoint(0F, -15F, 0F);

		barrelModel[18].addShapeBox(-11F, -6F, -4F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 46
		barrelModel[18].setRotationPoint(0F, -15F, 0F);

		barrelModel[19].addShapeBox(-5F, -10F, 2F, 3, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		barrelModel[19].setRotationPoint(0F, -15F, 0F);

		barrelModel[20].addShapeBox(-1F, -4.5F, -4F, 40, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		barrelModel[20].setRotationPoint(0F, -15F, 0F);

		barrelModel[21].addShapeBox(39F, -4.5F, -4F, 2, 5, 8, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 17
		barrelModel[21].setRotationPoint(0F, -15F, 0F);

		barrelModel[22].addShapeBox(-7F, -5.5F, -4F, 46, 1, 8, 0F,0F, 0F, -2F, -10F, 0F, -2F, -10F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		barrelModel[22].setRotationPoint(0F, -15F, 0F);

		barrelModel[23].addShapeBox(-7F, -4.5F, -4F, 6, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 21
		barrelModel[23].setRotationPoint(0F, -15F, 0F);

		barrelModel[24].addShapeBox(-4F, -10F, -2F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		barrelModel[24].setRotationPoint(0F, -15F, 0F);

		barrelModel[25].addShapeBox(-1F, -0.5F, -7F, 2, 2, 14, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 23
		barrelModel[25].setRotationPoint(0F, -15F, 0F);

		barrelModel[26].addShapeBox(10.5F, 0.5F, -0.5F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		barrelModel[26].setRotationPoint(0F, -15F, 0F);

		barrelModel[27].addShapeBox(10.5F, 5.5F, -0.5F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 37
		barrelModel[27].setRotationPoint(0F, -15F, 0F);

		barrelModel[28].addShapeBox(7.5F, 10.5F, -0.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 4F, 0F, 0F); // Box 38
		barrelModel[28].setRotationPoint(0F, -15F, 0F);

		barrelModel[29].addShapeBox(-4F, -8F, 4F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		barrelModel[29].setRotationPoint(0F, -15F, 0F);

		barrelModel[30].addShapeBox(-20F, -7.5F, 5.5F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		barrelModel[30].setRotationPoint(0F, -15F, 0F);
	}
}