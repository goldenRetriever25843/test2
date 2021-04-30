//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 12.06.2016 - 00:43:21
// Last changed on: 12.06.2016 - 00:43:21

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelXM177Elite extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelXM177Elite() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[103];
		ammoModel = new ModelRendererTurbo[3];

		initgunModel_1();
		initammoModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 3
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 4
		gunModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 5
		gunModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 6
		gunModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 7
		gunModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 8
		gunModel[6] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 9
		gunModel[7] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 10
		gunModel[8] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 11
		gunModel[9] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 12
		gunModel[10] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 13
		gunModel[11] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 14
		gunModel[12] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 15
		gunModel[13] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 16
		gunModel[14] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 17
		gunModel[15] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 18
		gunModel[16] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 19
		gunModel[17] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 20
		gunModel[18] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 21
		gunModel[19] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 22
		gunModel[20] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 23
		gunModel[21] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 24
		gunModel[22] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 25
		gunModel[23] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 26
		gunModel[24] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 27
		gunModel[25] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 28
		gunModel[26] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 29
		gunModel[27] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 31
		gunModel[28] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 32
		gunModel[29] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 33
		gunModel[30] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 35
		gunModel[31] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 36
		gunModel[32] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 37
		gunModel[33] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 38
		gunModel[34] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 39
		gunModel[35] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 40
		gunModel[36] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 42
		gunModel[37] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 43
		gunModel[38] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 44
		gunModel[39] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 45
		gunModel[40] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 46
		gunModel[41] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 47
		gunModel[42] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 48
		gunModel[43] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 49
		gunModel[44] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 50
		gunModel[45] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 51
		gunModel[46] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 65
		gunModel[47] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 66
		gunModel[48] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 67
		gunModel[49] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 68
		gunModel[50] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 69
		gunModel[51] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 71
		gunModel[52] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 72
		gunModel[53] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 73
		gunModel[54] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 74
		gunModel[55] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 75
		gunModel[56] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 76
		gunModel[57] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 80
		gunModel[58] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 81
		gunModel[59] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 82
		gunModel[60] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 83
		gunModel[61] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 84
		gunModel[62] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 85
		gunModel[63] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 86
		gunModel[64] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 87
		gunModel[65] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 88
		gunModel[66] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 89
		gunModel[67] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 90
		gunModel[68] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 92
		gunModel[69] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 93
		gunModel[70] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 94
		gunModel[71] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 95
		gunModel[72] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 96
		gunModel[73] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 97
		gunModel[74] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 98
		gunModel[75] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 99
		gunModel[76] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 100
		gunModel[77] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 101
		gunModel[78] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 102
		gunModel[79] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 103
		gunModel[80] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 110
		gunModel[81] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 111
		gunModel[82] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 0
		gunModel[83] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 0
		gunModel[84] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 2
		gunModel[85] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 3
		gunModel[86] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 4
		gunModel[87] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 5
		gunModel[88] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 6
		gunModel[89] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 8
		gunModel[90] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 9
		gunModel[91] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 10
		gunModel[92] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 11
		gunModel[93] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 12
		gunModel[94] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 13
		gunModel[95] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 14
		gunModel[96] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 15
		gunModel[97] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 16
		gunModel[98] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 17
		gunModel[99] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 18
		gunModel[100] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 19
		gunModel[101] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 20
		gunModel[102] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 21

		gunModel[0].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0.3F, -0.3F, -0.2F, 0.35F, -0.3F, -0.2F, 0.35F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, 0.1F, 0.35F, -0.3F, 0.1F, 0.35F, -0.3F, 0.1F, 0.3F, -0.3F, 0.1F); // Box 3
		gunModel[0].setRotationPoint(-0.2F, -3.9F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0.3F, -0.3F, 0.1F, 0.35F, -0.3F, 0.1F, 0.35F, -0.3F, 0.1F, 0.3F, -0.3F, 0.1F, 0.3F, -0.3F, 0.05F, 0.35F, -0.3F, 0.05F, 0.35F, -0.3F, 0.05F, 0.3F, -0.3F, 0.05F); // Box 4
		gunModel[1].setRotationPoint(-0.2F, -3.5F, -0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0.3F, -0.3F, 0.05F, 0.35F, -0.3F, 0.05F, 0.35F, -0.3F, 0.05F, 0.3F, -0.3F, 0.05F, 0.3F, -0.3F, -0.1F, 0.35F, -0.3F, -0.1F, 0.35F, -0.3F, -0.1F, 0.3F, -0.3F, -0.1F); // Box 5
		gunModel[2].setRotationPoint(-0.2F, -3.1F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0.3F, -0.3F, -0.1F, 1.15F, -0.3F, -0.1F, 1.15F, -0.3F, -0.1F, 0.3F, -0.3F, -0.1F, 0.3F, -0.2F, -0.2F, 0.9F, -0.2F, -0.2F, 0.9F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F); // Box 6
		gunModel[3].setRotationPoint(-0.2F, -2.7F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,1.6F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 1.6F, -0.3F, -0.2F, 1.2F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 1.2F, -0.2F, -0.2F); // Box 7
		gunModel[4].setRotationPoint(1.4F, -2.2F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,1F, -1F, -0.05F, 0.3F, -1F, -0.05F, 0.3F, -1F, -0.05F, 1F, -1F, -0.05F, 1F, -0.2F, -0.05F, 0.3F, -0.5F, -0.05F, 0.3F, -0.5F, -0.05F, 1F, -0.2F, -0.05F); // Box 8
		gunModel[5].setRotationPoint(4.4F, -4.2F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,1F, -0.95F, 0F, 0.3F, -0.6F, 0F, 0.3F, -0.6F, 0F, 1F, -0.95F, 0F, 1F, -0.85F, 0F, 0.3F, -1.2F, 0F, 0.3F, -1.2F, 0F, 1F, -0.85F, 0F); // Box 9
		gunModel[6].setRotationPoint(4.4F, -1.45F, -0.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.1F, -0.45F, -0.2F, 0.1F, -0.45F, -0.2F, 0.1F, -0.45F, -0.2F, 0.1F, -0.45F, -0.2F, 0.1F, -0.45F, -0.2F, 0.1F, -0.45F, -0.2F, 0.1F, -0.45F, -0.2F, 0.1F, -0.45F, -0.2F); // Box 10
		gunModel[7].setRotationPoint(0.3F, -1.85F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.1F, -0.45F, -0.2F, 0.7F, -0.45F, -0.2F, 0.7F, -0.45F, -0.2F, -0.1F, -0.45F, -0.2F, 0.65F, -0.45F, -0.2F, 0.05F, -0.45F, -0.2F, 0.05F, -0.45F, -0.2F, 0.65F, -0.45F, -0.2F); // Box 11
		gunModel[8].setRotationPoint(-0.4F, -0.75F, -0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.7F, -0.65F, -0.2F, -0.2F, -0.65F, -0.2F, -0.2F, -0.65F, -0.2F, -0.7F, -0.65F, -0.2F, -0.2F, -0.6F, -0.2F, -0.2F, -0.6F, -0.2F, -0.2F, -0.6F, -0.2F, -0.2F, -0.6F, -0.2F); // Box 12
		gunModel[9].setRotationPoint(-0.5F, -1.7F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.45F, -0.2F, 0.7F, -0.45F, -0.2F, 0.7F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0.4F, -1F, -0.2F, 0.05F, -0.5F, -0.2F, 0.05F, -0.5F, -0.2F, 0.4F, -1F, -0.2F); // Box 13
		gunModel[10].setRotationPoint(-1.05F, 0.35F, -0.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F); // Box 14
		gunModel[11].setRotationPoint(1F, -1.85F, -0.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F); // Box 15
		gunModel[12].setRotationPoint(2.8F, -1.85F, -0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.7F, -0.4F, -0.2F, -0.7F, -0.4F, -0.2F, -0.7F, -0.4F, -0.2F, -0.7F, -0.4F, -0.2F, -0.7F, -0.4F, -0.2F, -0.7F, -0.4F, -0.2F, -0.7F, -0.4F, -0.2F, -0.7F, -0.4F, -0.2F); // Box 16
		gunModel[13].setRotationPoint(0.9F, -0.9F, -0.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.55F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.55F, -0.2F); // Box 17
		gunModel[14].setRotationPoint(2.6F, -1.84F, -0.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.55F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.55F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F); // Box 18
		gunModel[15].setRotationPoint(2.6F, -1.05F, -0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.3F, -0.2F, -0.35F, -0.55F, -0.2F, -0.35F, -0.55F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F); // Box 19
		gunModel[16].setRotationPoint(1.2F, -1.05F, -0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.3F, -0.2F, -0.35F, -0.55F, -0.2F, -0.35F, -0.55F, -0.2F, -0.4F, -0.3F, -0.2F); // Box 20
		gunModel[17].setRotationPoint(1.2F, -1.85F, -0.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,2.1F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 2.1F, -0.3F, -0.2F, 2.1F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 2.1F, -0.2F, -0.2F); // Box 21
		gunModel[18].setRotationPoint(1.85F, -4.4F, -0.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.35F, -0.1F, -0.2F, -2.1F, -0.1F, -0.2F, -2.1F, -0.1F, -0.2F, 1.35F, -0.1F, -0.2F, 1.8F, -0.2F, -0.2F, -2.6F, -0.2F, -0.2F, -2.6F, -0.2F, -0.2F, 1.8F, -0.2F, -0.2F); // Box 22
		gunModel[19].setRotationPoint(1.85F, -4.9F, -0.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.3F, -0.2F, -0.35F, -0.55F, -0.2F, -0.35F, -0.55F, -0.2F, -0.45F, -0.3F, -0.2F, -0.35F, -0.45F, -0.2F, -0.5F, -0.45F, -0.2F, -0.5F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F); // Box 23
		gunModel[20].setRotationPoint(-0.2F, -4.65F, -0.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.4F, -0.4F, -0.2F, -1F, -0.4F, -0.2F, -1F, -0.4F, -0.2F, 1.4F, -0.4F, -0.2F, 1.65F, -0.2F, -0.2F, -1.7F, -0.2F, -0.2F, -1.7F, -0.2F, -0.2F, 1.65F, -0.2F, -0.2F); // Box 24
		gunModel[21].setRotationPoint(2.08F, -5.5F, -0.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, -0.1F, -0.2F, -0.35F, 0.2F, -0.2F, -0.35F, -0.1F, -0.2F, -0.35F, -0.1F, -0.2F, -0.35F, 0.2F, -0.2F, -0.35F); // Box 25
		gunModel[22].setRotationPoint(0.35F, -4.9F, -0.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,1F, -0.4F, -0.2F, -0.6F, -0.4F, -0.2F, -0.6F, -0.4F, -0.2F, 1F, -0.4F, -0.2F, 1F, -0.4F, -0.2F, -0.6F, -0.4F, -0.2F, -0.6F, -0.4F, -0.2F, 1F, -0.4F, -0.2F); // Box 26
		gunModel[23].setRotationPoint(2.08F, -5.5F, -0.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.35F, -0.2F, -0.2F, -0.6F, -0.2F, -0.2F, -0.6F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.4F, -0.2F, -0.12F, -0.3F, -0.2F, -0.12F, -0.3F, -0.2F, -0.2F, -0.4F, -0.2F); // Box 27
		gunModel[24].setRotationPoint(5.28F, -5.5F, -0.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.8F, -0.38F, -0.2F, -1.6F, -0.4F, -0.2F, -1.6F, -0.4F, -0.2F, 0.8F, -0.38F, -0.2F, 0.8F, -0.4F, -0.2F, -1.6F, -0.4F, -0.2F, -1.6F, -0.4F, -0.2F, 0.8F, -0.4F, -0.2F); // Box 28
		gunModel[25].setRotationPoint(6.75F, -5.2F, -0.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.55F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.55F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F); // Box 29
		gunModel[26].setRotationPoint(5.35F, -4.65F, -0.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.55F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.35F, -0.55F, -0.2F); // Box 31
		gunModel[27].setRotationPoint(5.35F, -5.3F, -0.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,1.15F, -0.2F, -0.43F, -0.6F, -0.55F, -0.43F, -0.6F, -0.55F, -0.43F, 1.15F, -0.2F, -0.43F, 1.41F, -0.4F, -0.43F, -0.6F, -0.4F, -0.43F, -0.6F, -0.4F, -0.43F, 1.41F, -0.4F, -0.43F); // Box 32
		gunModel[28].setRotationPoint(2.08F, -5.7F, -0.27F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,1.15F, -0.2F, -0.43F, -0.6F, -0.55F, -0.43F, -0.6F, -0.55F, -0.43F, 1.15F, -0.2F, -0.43F, 1.41F, -0.4F, -0.43F, -0.6F, -0.4F, -0.43F, -0.6F, -0.4F, -0.43F, 1.41F, -0.4F, -0.43F); // Box 33
		gunModel[29].setRotationPoint(2.08F, -5.7F, -0.73F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.35F, 0.2F, -0.3F, -0.35F, 0.2F, -0.3F, -0.35F, 0.2F, -0.3F, -0.35F, 0.2F, -0.3F, -0.35F, 0.2F, -0.3F, -0.35F, 0.2F, -0.3F, -0.35F, 0.2F, -0.3F, -0.35F, 0.2F); // Box 35
		gunModel[30].setRotationPoint(-0.8F, -4.35F, -0.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.05F, -0.4F, -0.3F, -0.05F, -0.4F, -0.3F, -0.15F, -0.5F, -0.05F, -0.15F, -0.5F, -0.05F, -0.05F, -0.5F, -0.3F, -0.05F, -0.5F, -0.3F, -0.15F, -0.5F, -0.05F, -0.15F, -0.5F, -0.05F); // Box 36
		gunModel[31].setRotationPoint(4.4F, -4.25F, -0.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.15F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F, 0.3F, -0.15F, -0.2F, 0.3F, -0.15F, -0.2F, 0.3F, -0.15F, -0.2F, 0.3F); // Box 37
		gunModel[32].setRotationPoint(6F, -4.05F, -0.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.15F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.15F, -0.2F, 0.3F, -0.15F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F); // Box 38
		gunModel[33].setRotationPoint(6F, -2.95F, -0.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.15F, -0.25F, 0.3F, -0.2F, -0.25F, 0.3F, -0.2F, -0.25F, 0.3F, -0.15F, -0.25F, 0.3F, -0.15F, -0.25F, 0.3F, -0.2F, -0.25F, 0.3F, -0.2F, -0.25F, 0.3F, -0.15F, -0.25F, 0.3F); // Box 39
		gunModel[34].setRotationPoint(6F, -3.5F, -0.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.4F, -0.25F, 0.5F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0.05F, 0F, -0.25F, 0F, 0.4F, -0.25F, 0.5F, 0.35F, -0.25F, -0.05F, 0.35F, -0.25F, 0.05F, 0F, -0.25F, 0.05F); // Box 40
		gunModel[35].setRotationPoint(0.4F, -3.5F, -0.55F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.2F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.3F, -0.35F, -0.5F, -0.3F, -0.35F, -0.2F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.3F, -0.35F, -0.5F); // Box 42
		gunModel[36].setRotationPoint(-0.6F, -3.5F, -1.25F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F); // Box 43
		gunModel[37].setRotationPoint(-0.85F, -3.5F, -1.4F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.9F, -0.1F, -0.05F, 0.8F, -0.1F, -0.05F, 0.8F, -0.1F, 0.1F, 0.9F, -0.1F, 0.1F, 0.9F, -0.1F, 0.05F, 0.8F, -0.1F, 0.05F, 0.8F, -0.1F, 0.05F, 0.9F, -0.1F, 0.05F); // Box 44
		gunModel[38].setRotationPoint(3.9F, -3.5F, -0.65F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.5F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F); // Box 45
		gunModel[39].setRotationPoint(3.7F, -2.9F, -0.73F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, -0.5F, -0.05F, -0.45F, -0.5F, -0.05F, -0.45F, -0.5F, -0.05F, -0.2F, -0.5F, -0.05F, -0.2F, -0.5F, -0.05F, -0.45F, -0.5F, -0.05F, -0.45F, -0.5F, -0.05F, -0.2F, -0.5F, -0.05F); // Box 46
		gunModel[40].setRotationPoint(2.85F, -3.2F, -0.5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.44F, -0.2F, -0.2F, -0.44F, -0.2F, -0.2F, -0.44F, -0.2F, -0.2F, -0.44F, -0.2F, -0.2F, -0.44F, -0.2F, -0.2F, -0.44F, -0.2F, -0.2F, -0.44F, -0.2F, -0.2F, -0.44F, -0.2F, -0.2F); // Box 47
		gunModel[41].setRotationPoint(3F, -2.6F, -0.73F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.44F, -0.2F, -0.3F, -0.44F, -0.2F, -0.3F, -0.44F, -0.2F, -0.3F, -0.44F, -0.2F, -0.3F, -0.44F, -0.2F, -0.3F, -0.44F, -0.2F, -0.3F, -0.44F, -0.2F, -0.3F, -0.44F, -0.2F); // Box 48
		gunModel[42].setRotationPoint(2.86F, -2.3F, -0.73F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.39F, -0.35F, -0.2F, -0.39F, -0.35F, -0.2F, -0.39F, -0.35F, -0.2F, -0.39F, -0.35F, -0.2F, -0.39F, -0.35F, -0.2F, -0.39F, -0.35F, -0.2F, -0.39F, -0.35F, -0.2F, -0.39F, -0.35F, -0.2F); // Box 49
		gunModel[43].setRotationPoint(2.76F, -2.58F, -0.8F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, -0.8F, -0.2F, -0.3F, -1F, -0.2F, -0.3F, -1F, -0.2F, -0.3F, -0.8F, -0.2F, -0.3F, -0.8F, -0.2F, -0.5F, -0.8F, -0.2F, -0.5F, -0.8F, -0.2F, -0.3F, -0.8F, -0.2F); // Box 50
		gunModel[44].setRotationPoint(-0.3F, 0.65F, -0.5F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.2F, -0.1F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.3F, 0.3F, 0.1F, -0.3F, 0.3F, 0.1F, -0.3F, 0.3F, -0.2F, -0.3F, 0.3F); // Box 51
		gunModel[45].setRotationPoint(6.6F, -4F, -0.5F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.15F, -0.4F, -0.45F, -0.15F, -0.4F, -0.45F, -0.15F, -0.4F, -0.45F, -0.15F, -0.4F, -0.45F, -0.15F, -0.4F, -0.45F, -0.15F, -0.4F, -0.45F, -0.15F, -0.4F, -0.45F, -0.15F, -0.4F, -0.45F); // Box 65
		gunModel[46].setRotationPoint(0.7F, -5.6F, -0.15F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.15F, -0.4F, -0.45F, -0.15F, -0.4F, -0.45F, -0.15F, -0.4F, -0.45F, -0.15F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F); // Box 66
		gunModel[47].setRotationPoint(0.7F, -5.4F, -0.15F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.15F, -0.4F, -0.45F, -0.15F, -0.4F, -0.45F, -0.15F, -0.4F, -0.45F, -0.15F, -0.4F, -0.45F); // Box 67
		gunModel[48].setRotationPoint(0.7F, -5.8F, -0.15F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.15F, -0.4F, -0.45F, -0.15F, -0.4F, -0.45F, -0.15F, -0.4F, -0.45F, -0.15F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F); // Box 68
		gunModel[49].setRotationPoint(0.7F, -5.4F, -0.85F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.15F, -0.4F, -0.45F, -0.15F, -0.4F, -0.45F, -0.15F, -0.4F, -0.45F, -0.15F, -0.4F, -0.45F); // Box 69
		gunModel[50].setRotationPoint(0.7F, -5.8F, -0.85F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.15F, -0.4F, -0.45F, -0.15F, -0.4F, -0.45F, -0.15F, -0.4F, -0.45F, -0.15F, -0.4F, -0.45F, -0.15F, -0.4F, -0.45F, -0.15F, -0.4F, -0.45F, -0.15F, -0.4F, -0.45F, -0.15F, -0.4F, -0.45F); // Box 71
		gunModel[51].setRotationPoint(0.7F, -5.6F, -0.85F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.49F, -0.2F, -0.4F, -0.49F, -0.2F, -0.4F, -0.49F, -0.2F, -0.4F, -0.49F, -0.2F, -0.4F, -0.49F, -0.2F, -0.4F, -0.49F, -0.2F, -0.4F, -0.49F, -0.2F, -0.4F, -0.49F, -0.2F, -0.4F); // Box 72
		gunModel[52].setRotationPoint(0.35F, -5.5F, -0.5F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.49F, -0.46F, -0.38F, -0.49F, -0.46F, -0.38F, -0.49F, -0.46F, -0.38F, -0.49F, -0.46F, -0.38F, -0.49F, -0.46F, -0.38F, -0.49F, -0.46F, -0.38F, -0.49F, -0.46F, -0.38F, -0.49F, -0.46F, -0.38F); // Box 73
		gunModel[53].setRotationPoint(0.35F, -5.8F, -0.5F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.49F, -0.47F, -0.38F, -0.49F, -0.47F, -0.38F, -0.49F, -0.47F, -0.38F, -0.49F, -0.47F, -0.38F, -0.49F, -0.47F, -0.38F, -0.49F, -0.47F, -0.38F, -0.49F, -0.47F, -0.38F, -0.49F, -0.47F, -0.38F); // Box 74
		gunModel[54].setRotationPoint(0.35F, -6F, -0.5F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.49F, -0.4F, -0.47F, -0.49F, -0.4F, -0.47F, -0.49F, -0.4F, -0.47F, -0.49F, -0.4F, -0.47F, -0.49F, -0.4F, -0.47F, -0.49F, -0.4F, -0.47F, -0.49F, -0.4F, -0.47F, -0.49F, -0.4F, -0.47F); // Box 75
		gunModel[55].setRotationPoint(0.35F, -5.9F, -0.6F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.49F, -0.4F, -0.47F, -0.49F, -0.4F, -0.47F, -0.49F, -0.4F, -0.47F, -0.49F, -0.4F, -0.47F, -0.49F, -0.4F, -0.47F, -0.49F, -0.4F, -0.47F, -0.49F, -0.4F, -0.47F, -0.49F, -0.4F, -0.47F); // Box 76
		gunModel[56].setRotationPoint(0.35F, -5.9F, -0.4F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.42F, -0.25F, 0F, -0.42F, -0.25F, 0F, -0.42F, -0.25F, 0F, -0.42F, -0.25F, 0F, -0.42F, -0.25F, 0F, -0.42F, -0.25F, 0F, -0.42F, -0.25F, 0F, -0.42F, -0.25F); // Box 80
		gunModel[57].setRotationPoint(12.4F, -3.48F, -0.5F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F); // Box 81
		gunModel[58].setRotationPoint(12.4F, -3.66F, -0.5F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F); // Box 82
		gunModel[59].setRotationPoint(12.4F, -3.3F, -0.5F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.4F, -0.15F, -0.2F, -0.4F, -0.15F, -0.2F, -0.4F, -0.15F, -0.2F, -0.4F, -0.15F, -0.2F, -0.4F, -0.55F, -0.2F, -0.4F, -0.55F, -0.2F, -0.4F, -0.55F, -0.2F, -0.4F, -0.55F, -0.2F); // Box 83
		gunModel[60].setRotationPoint(13.9F, -4.95F, -0.5F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.4F, -0.15F, -0.2F, -0.4F, -0.15F, -0.2F, -0.4F, -0.15F, -0.2F, -0.4F, -0.15F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F); // Box 84
		gunModel[61].setRotationPoint(12.53F, -4F, -0.5F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1.2F, -0.6F, -0.2F, 0.4F, -0.6F, -0.2F, 0.4F, -0.6F, -0.2F, -1.2F, -0.6F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F); // Box 85
		gunModel[62].setRotationPoint(12.53F, -5.4F, -0.5F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.4F, -0.15F, -0.35F, -0.4F, -0.15F, -0.35F, -0.4F, -0.15F, -0.35F, -0.4F, -0.15F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F); // Box 86
		gunModel[63].setRotationPoint(12.75F, -3.95F, -0.5F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.55F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.55F, -0.4F); // Box 87
		gunModel[64].setRotationPoint(13.55F, -3.95F, -0.5F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.55F, -0.4F, -0.4F, -0.55F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 88
		gunModel[65].setRotationPoint(12.85F, -3.95F, -0.5F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F); // Box 89
		gunModel[66].setRotationPoint(13.7F, -5.05F, -0.5F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F); // Box 90
		gunModel[67].setRotationPoint(13.8F, -2.88F, -0.5F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F); // Box 92
		gunModel[68].setRotationPoint(12.6F, -3.95F, -0.5F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F); // Box 93
		gunModel[69].setRotationPoint(13.8F, -3.95F, -0.5F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.32F, -0.37F, -0.25F, -0.32F, -0.37F, -0.25F, -0.32F, -0.37F, -0.25F, -0.32F, -0.37F, -0.25F, -0.32F, -0.37F, -0.25F, -0.32F, -0.37F, -0.25F, -0.32F, -0.37F, -0.25F, -0.32F, -0.37F); // Box 94
		gunModel[70].setRotationPoint(14.1F, -2.81F, -0.5F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, -0.15F, -0.42F, -0.4F, -0.15F, -0.42F, -0.4F, -0.15F, -0.46F, -1F, -0.15F, -0.46F, -0.8F, -0.55F, -0.42F, -0.4F, -0.55F, -0.42F, -0.4F, -0.55F, -0.46F, -0.8F, -0.55F, -0.46F); // Box 95
		gunModel[71].setRotationPoint(12.9F, -5.25F, -0.7F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, -0.15F, -0.46F, -0.4F, -0.15F, -0.46F, -0.4F, -0.15F, -0.42F, -1F, -0.15F, -0.42F, -0.8F, -0.55F, -0.46F, -0.4F, -0.55F, -0.46F, -0.4F, -0.55F, -0.42F, -0.8F, -0.55F, -0.42F); // Box 96
		gunModel[72].setRotationPoint(12.9F, -5.25F, -0.3F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.48F, -0.3F, -0.2F, -0.48F, -0.3F, -0.2F, -0.48F, -0.3F, -0.2F, -0.48F, -0.3F, -0.2F, -0.48F, -0.3F, -0.2F, -0.48F, -0.3F, -0.2F, -0.48F, -0.3F, -0.2F, -0.48F, -0.3F); // Box 97
		gunModel[73].setRotationPoint(13.7F, -5.32F, -0.5F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1.15F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, -0.38F, -1.15F, -0.25F, -0.38F, -1F, -0.55F, -0.46F, -0.4F, -0.55F, -0.46F, -0.4F, -0.55F, -0.42F, -1F, -0.55F, -0.42F); // Box 98
		gunModel[74].setRotationPoint(12.9F, -5.55F, -0.3F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1.15F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.48F, -1.15F, -0.25F, -0.48F, -1F, -0.55F, -0.46F, -0.4F, -0.55F, -0.46F, -0.4F, -0.55F, -0.42F, -1F, -0.55F, -0.42F); // Box 99
		gunModel[75].setRotationPoint(12.9F, -5.55F, -0.74F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.92F, -0.1F, -0.45F, -0.92F, -0.1F, -0.45F, -0.92F, -0.1F, -0.45F, -0.92F, -0.1F, -0.45F, -0.92F, -0.5F, -0.45F, -0.92F, -0.5F, -0.45F, -0.92F, -0.5F, -0.45F, -0.92F, -0.5F, -0.45F); // Box 100
		gunModel[76].setRotationPoint(13.2F, -5.3F, -0.5F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.35F, -0.42F, 0.1F, -0.35F, -0.42F, 0.1F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.1F, 0.1F, -0.35F, -0.1F, 0.1F, -0.35F, -0.1F, 0F, -0.35F, -0.1F); // Box 101
		gunModel[77].setRotationPoint(16.4F, -3.72F, -0.5F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.35F, -0.1F, 0.1F, -0.35F, -0.1F, 0.1F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.42F, 0.1F, -0.35F, -0.42F, 0.1F, -0.35F, -0.42F, 0F, -0.35F, -0.42F); // Box 102
		gunModel[78].setRotationPoint(16.4F, -3.2F, -0.5F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.39F, -0.1F, 0.1F, -0.39F, -0.1F, 0.1F, -0.39F, -0.1F, 0F, -0.39F, -0.1F, 0F, -0.39F, -0.1F, 0.1F, -0.39F, -0.1F, 0.1F, -0.39F, -0.1F, 0F, -0.39F, -0.1F); // Box 103
		gunModel[79].setRotationPoint(16.4F, -3.45F, -0.5F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.2F, -0.3F, -0.3F, -0.35F, -0.55F, -0.3F, -0.35F, -0.55F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 110
		gunModel[80].setRotationPoint(1.76F, -1.85F, -0.5F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.25F, -0.3F, -0.35F, -0.1F, -0.3F, -0.35F, -0.1F, -0.3F, -0.4F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F, -0.35F, -0.15F, -0.3F, -0.35F, -0.15F, -0.3F, -0.5F, -0.25F, -0.3F); // Box 111
		gunModel[81].setRotationPoint(1.57F, -1.4F, -0.5F);

		gunModel[82].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.2F, -0.3F, 0.3F, 0.1F, -0.3F, 0.3F, 0.1F, -0.3F, 0.3F, -0.2F, -0.3F, 0.3F, -0.2F, -0.1F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, -0.2F, -0.1F, -0.2F); // Box 0
		gunModel[82].setRotationPoint(6.6F, -3F, -0.5F);

		gunModel[83].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.2F, -0.2F, 0.3F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F); // Box 0
		gunModel[83].setRotationPoint(6.6F, -3.5F, -0.5F);

		gunModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.15F, -0.2F, -0.4F, -0.15F, -0.2F, -0.4F, -0.15F, -0.2F, -0.4F, -0.15F, -0.2F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F); // Box 2
		gunModel[84].setRotationPoint(12.3F, -4F, -0.5F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.15F, -0.2F, -0.4F, -0.15F, -0.2F, -0.4F, -0.15F, -0.2F, -0.4F, -0.15F, -0.2F); // Box 3
		gunModel[85].setRotationPoint(12.3F, -3F, -0.5F);

		gunModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.25F, 0.3F, -0.4F, -0.25F, 0.3F, -0.4F, -0.25F, 0.3F, -0.4F, -0.25F, 0.3F, -0.4F, -0.15F, 0.3F, -0.4F, -0.15F, 0.3F, -0.4F, -0.15F, 0.3F, -0.4F, -0.15F, 0.3F); // Box 4
		gunModel[86].setRotationPoint(12.3F, -3.55F, -0.5F);

		gunModel[87].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0.2F, -0.35F, 0F, 0.2F, -0.35F, 0F, 0.2F, -0.35F, 0F, 0.2F, -0.35F, 0F, 0.2F, -0.35F, 0F, 0.2F, -0.35F, 0F, 0.2F, -0.35F, 0F, 0.2F, -0.35F, 0F); // Box 5
		gunModel[87].setRotationPoint(-5.5F, -3.5F, -0.5F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0.2F, -0.4F, -0.3F, 0.2F, -0.4F, -0.3F, 0.2F, -0.4F, -0.3F, 0.2F, -0.4F, -0.3F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F); // Box 6
		gunModel[88].setRotationPoint(-5.5F, -3.85F, -0.5F);

		gunModel[89].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.45F, -0.3F, 0.2F, -0.45F, -0.3F, 0.2F, -0.45F, -0.3F, 0.2F, -0.45F, -0.3F); // Box 8
		gunModel[89].setRotationPoint(-5.5F, -3.1F, -0.5F);

		gunModel[90].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.7F, -0.3F, -0.2F, 0.2F, -0.3F, -0.2F, 0.2F, -0.3F, -0.2F, 0.7F, -0.3F, -0.2F, 0.7F, -0.3F, 0.1F, 0.2F, -0.3F, 0.1F, 0.2F, -0.3F, 0.1F, 0.7F, -0.3F, 0.1F); // Box 9
		gunModel[90].setRotationPoint(-6.5F, -3.85F, -0.5F);

		gunModel[91].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.7F, -0.3F, 0.1F, 0.2F, -0.3F, 0.1F, 0.2F, -0.3F, 0.1F, 0.7F, -0.3F, 0.1F, 0.7F, -0.3F, -0.2F, 0.2F, -0.3F, -0.2F, 0.2F, -0.3F, -0.2F, 0.7F, -0.3F, -0.2F); // Box 10
		gunModel[91].setRotationPoint(-6.5F, -3.15F, -0.5F);

		gunModel[92].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.7F, -0.35F, 0.1F, 0.2F, -0.35F, 0.1F, 0.2F, -0.35F, 0.1F, 0.7F, -0.35F, 0.1F, 0.7F, -0.35F, 0.1F, 0.2F, -0.35F, 0.1F, 0.2F, -0.35F, 0.1F, 0.7F, -0.35F, 0.1F); // Box 11
		gunModel[92].setRotationPoint(-6.5F, -3.5F, -0.5F);

		gunModel[93].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.7F, -0.3F, -0.2F, 0.2F, -0.3F, -0.2F, 0.2F, -0.3F, -0.2F, 0.7F, -0.3F, -0.2F, 0.7F, -0.3F, -0.2F, 0.2F, -0.3F, -0.2F, 0.2F, -0.3F, -0.2F, 0.7F, -0.3F, -0.2F); // Box 12
		gunModel[93].setRotationPoint(-6.5F, -2.75F, -0.5F);

		gunModel[94].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.7F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.7F, -0.3F, -0.3F, 0.7F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.7F, -0.3F, -0.3F); // Box 13
		gunModel[94].setRotationPoint(-6.5F, -2.35F, -0.5F);

		gunModel[95].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.7F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.7F, -0.3F, -0.3F, 0.7F, 0.9F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.7F, 0.9F, -0.3F); // Box 14
		gunModel[95].setRotationPoint(-6.5F, -2.35F, -0.5F);

		gunModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.6F, -0.25F, -0.1F, 0.2F, -0.25F, -0.1F, 0.2F, -0.25F, -0.1F, 0.6F, -0.25F, -0.1F, 0.6F, -0.25F, -0.1F, 0.2F, -0.25F, -0.1F, 0.2F, -0.25F, -0.1F, 0.6F, -0.25F, -0.1F); // Box 15
		gunModel[96].setRotationPoint(-4.49F, -2.1F, -0.5F);

		gunModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.3F, -0.1F); // Box 16
		gunModel[97].setRotationPoint(-6.09F, -1.57F, -0.5F);
		gunModel[97].rotateAngleZ = 0.52359878F;

		gunModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0.3F, 0.2F, -0.4F, 0.3F, 0.2F, -0.4F, 0.3F, 0.2F, -0.4F, 0.3F, 0.2F, -0.4F, 0.3F, 0.2F, -0.4F, 0.3F, 0.2F, -0.4F, 0.3F, 0.2F, -0.4F, 0.3F, 0.2F); // Box 17
		gunModel[98].setRotationPoint(-7.8F, -2.8F, -0.5F);

		gunModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.65F, -0.2F, -0.4F, -0.65F, -0.2F, -0.4F, -0.65F, -0.2F, -0.4F, -0.65F, -0.2F, -0.4F, 0.3F, 0.2F, -0.4F, 0.3F, 0.2F, -0.4F, 0.3F, 0.2F, -0.4F, 0.3F, 0.2F); // Box 18
		gunModel[99].setRotationPoint(-7.8F, -4.4F, -0.5F);

		gunModel[100].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.4F, 0.3F, 0.2F, -0.4F, 0.3F, 0.2F, -0.4F, 0.3F, 0.2F, -0.4F, 0.3F, 0.2F, -0.4F, -1.05F, -0.2F, -0.4F, -1.05F, -0.2F, -0.4F, -1.05F, -0.2F, -0.4F, -1.05F, -0.2F); // Box 19
		gunModel[100].setRotationPoint(-7.8F, -1.2F, -0.5F);

		gunModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F); // Box 20
		gunModel[101].setRotationPoint(-7.2F, -4.2F, -0.5F);

		gunModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.6F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.6F, -0.4F, -0.3F); // Box 21
		gunModel[102].setRotationPoint(-6.75F, -4.15F, -0.5F);
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 40
		ammoModel[1] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 41
		ammoModel[2] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 42

		ammoModel[0].addShapeBox(0.7F, -1F, 0F, 3, 2, 1, 0F,-0.45F, -0.44F, -0.07F, -0.45F, -0.7F, -0.07F, -0.45F, -0.7F, -0.07F, -0.45F, -0.44F, -0.07F, -0.45F, 0F, -0.07F, -0.45F, 0F, -0.07F, -0.45F, 0F, -0.07F, -0.45F, 0F, -0.07F); // Box 40
		ammoModel[0].setRotationPoint(2.89F, 2.6F, -0.5F);
		ammoModel[0].rotateAngleZ = 0.31415927F;

		ammoModel[1].addShapeBox(0.6F, 0F, 0F, 3, 1, 1, 0F,-0.45F, 0F, -0.07F, -0.45F, 0F, -0.07F, -0.45F, 0F, -0.07F, -0.45F, 0F, -0.07F, -0.45F, 0F, -0.07F, -0.45F, 0F, -0.07F, -0.45F, 0F, -0.07F, -0.45F, 0F, -0.07F); // Box 41
		ammoModel[1].setRotationPoint(2.49F, -1F, -0.5F);

		ammoModel[2].addShapeBox(0.61F, 0F, 0F, 3, 2, 1, 0F,-0.45F, 0F, -0.07F, -0.45F, 0F, -0.07F, -0.45F, 0F, -0.07F, -0.45F, 0F, -0.07F, -0.45F, -0.25F, -0.07F, -0.45F, -0.3F, -0.07F, -0.45F, -0.3F, -0.07F, -0.45F, -0.25F, -0.07F); // Box 42
		ammoModel[2].setRotationPoint(2.49F, 0.15F, -0.5F);
		ammoModel[2].rotateAngleZ = 0.15707963F;
		
		animationType = EnumAnimationType.PISTOL_CLIP;
		translateAll(0F, -0.8F, 0F);

		gunSlideDistance = 0.1F;
	}
}