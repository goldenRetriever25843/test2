//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 26.06.2016 - 03:53:34
// Last changed on: 26.06.2016 - 03:53:34

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelM1919Elite extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelM1919Elite() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[100];
		ammoModel = new ModelRendererTurbo[387];

		initgunModel_1();
		initammoModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 0
		gunModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 1
		gunModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 2
		gunModel[4] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 3
		gunModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 4
		gunModel[6] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 5
		gunModel[7] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 6
		gunModel[8] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 7
		gunModel[9] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 8
		gunModel[10] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 9
		gunModel[11] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 11
		gunModel[12] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 12
		gunModel[13] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 13
		gunModel[14] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 14
		gunModel[15] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 15
		gunModel[16] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 16
		gunModel[17] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 17
		gunModel[18] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 18
		gunModel[19] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 19
		gunModel[20] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 20
		gunModel[21] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 21
		gunModel[22] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 22
		gunModel[23] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 23
		gunModel[24] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 24
		gunModel[25] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 25
		gunModel[26] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 26
		gunModel[27] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 27
		gunModel[28] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 28
		gunModel[29] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 29
		gunModel[30] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 30
		gunModel[31] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 31
		gunModel[32] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 32
		gunModel[33] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 33
		gunModel[34] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 34
		gunModel[35] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 35
		gunModel[36] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 37
		gunModel[37] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 38
		gunModel[38] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 39
		gunModel[39] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 40
		gunModel[40] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 41
		gunModel[41] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 42
		gunModel[42] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 43
		gunModel[43] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 44
		gunModel[44] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 45
		gunModel[45] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 46
		gunModel[46] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 47
		gunModel[47] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 48
		gunModel[48] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 50
		gunModel[49] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 51
		gunModel[50] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 52
		gunModel[51] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 53
		gunModel[52] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 54
		gunModel[53] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 55
		gunModel[54] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 56
		gunModel[55] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 57
		gunModel[56] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 58
		gunModel[57] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 59
		gunModel[58] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 60
		gunModel[59] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 61
		gunModel[60] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 62
		gunModel[61] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 64
		gunModel[62] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 65
		gunModel[63] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 66
		gunModel[64] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 67
		gunModel[65] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 68
		gunModel[66] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 69
		gunModel[67] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 70
		gunModel[68] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 71
		gunModel[69] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 72
		gunModel[70] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 73
		gunModel[71] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 74
		gunModel[72] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 75
		gunModel[73] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 76
		gunModel[74] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 77
		gunModel[75] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 78
		gunModel[76] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 79
		gunModel[77] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 80
		gunModel[78] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 81
		gunModel[79] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 82
		gunModel[80] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 84
		gunModel[81] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 85
		gunModel[82] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 86
		gunModel[83] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 87
		gunModel[84] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 88
		gunModel[85] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 89
		gunModel[86] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 90
		gunModel[87] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 91
		gunModel[88] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 93
		gunModel[89] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 94
		gunModel[90] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 95
		gunModel[91] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 96
		gunModel[92] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 98
		gunModel[93] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 99
		gunModel[94] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 101
		gunModel[95] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 102
		gunModel[96] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 103
		gunModel[97] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 104
		gunModel[98] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 105
		gunModel[99] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 106

		gunModel[0].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F,0F, 0F, 0.23F, 0F, 0F, 0.23F, 0F, 0F, 0.23F, 0F, 0F, 0.23F, 0F, 0F, 0.23F, 0F, 0F, 0.23F, 0F, 0F, 0.23F, 0F, 0F, 0.23F); // Box 0
		gunModel[0].setRotationPoint(1.6F, -2.9F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0F, -0.2F, 0.3F); // Box 0
		gunModel[1].setRotationPoint(1.6F, -0.65F, -0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.2F, 0.3F, 0.75F, -0.2F, 0.3F, 0.75F, -0.2F, 0F, 0F, -0.2F, 0F, -0.1F, -0.4F, 0.3F, 0.75F, -0.4F, 0.3F, 0.75F, -0.4F, 0F, -0.1F, -0.4F, 0F); // Box 1
		gunModel[2].setRotationPoint(5.6F, -3.15F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0.4F, -0.1F, -0.2F, 0.25F, -0.2F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0.4F, -0.2F, -0.4F, 0.25F); // Box 2
		gunModel[3].setRotationPoint(9.5F, -3.15F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.2F, -0.7F, 0.3F, -0.2F, -0.7F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, -0.7F, 0.3F, -0.2F, -0.7F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F); // Box 3
		gunModel[4].setRotationPoint(2.6F, -3.15F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, -0.7F, 0.3F, 0F, -0.7F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, -0.3F, -0.1F, -0.7F, -0.3F, -0.1F, -0.7F, -0.3F, -0.1F, 0.3F, -0.3F, -0.1F, 0.3F); // Box 4
		gunModel[5].setRotationPoint(2.6F, -2.3F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.2F, 0.45F, -0.2F, -0.2F, 0.45F, -0.2F, -0.2F, -1.2F, -0.3F, -0.2F, -1.2F, -0.3F, -0.2F, 0.45F, -0.2F, -0.2F, 0.45F, -0.2F, -0.2F, -1.2F, -0.3F, -0.2F, -1.2F); // Box 5
		gunModel[6].setRotationPoint(10.85F, -3.25F, -0.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.2F, 0.45F, -0.35F, -0.3F, 0.45F, -0.35F, -0.3F, -1.2F, -0.35F, -0.2F, -1.2F, -0.35F, -0.2F, 0.45F, -0.35F, -0.3F, 0.45F, -0.35F, -0.3F, -1.2F, -0.35F, -0.2F, -1.2F); // Box 6
		gunModel[7].setRotationPoint(11.3F, -3.25F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.7F, 0.45F, -0.1F, -0.7F, 0.45F, -0.2F, -0.7F, 0.15F, -0.4F, -0.7F, 0.15F, -0.4F, -0.15F, 0.45F, -0.4F, -0.15F, 0.45F, -0.4F, -0.15F, 0.15F, -0.4F, -0.15F, 0.15F); // Box 7
		gunModel[8].setRotationPoint(10.75F, -3.2F, -0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, 0.45F, -0.4F, -0.4F, 0.45F, -0.4F, -0.4F, 0.15F, -0.4F, -0.4F, 0.15F, -0.4F, -0.2F, 0.45F, -0.4F, -0.2F, 0.45F, -0.4F, -0.2F, 0.15F, -0.4F, -0.2F, 0.15F); // Box 8
		gunModel[9].setRotationPoint(10.75F, -3F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.38F, 0.2F, 0.22F, -0.38F, 0.2F, 0.22F, -0.38F, 0.2F, 0F, -0.38F, 0.2F, 0F, -0.38F, 0.2F, 0.22F, -0.38F, 0.2F, 0.22F, -0.38F, 0.2F, 0F, -0.38F, 0.2F); // Box 9
		gunModel[10].setRotationPoint(9.6F, -2.45F, -0.3F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.1F, -0.2F, -0.35F, 0.75F, -0.2F, -0.35F, 0.75F, -0.2F, -0.4F, -0.1F, -0.2F, -0.4F, -0.2F, -0.55F, -0.35F, 0.75F, -0.55F, -0.35F, 0.75F, -0.55F, -0.4F, -0.2F, -0.55F, -0.4F); // Box 11
		gunModel[11].setRotationPoint(5.6F, -3.15F, 0.15F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.2F, 0.4F, -0.2F, -0.2F, 0.4F, -0.2F, -0.2F, 0.25F, -0.35F, -0.2F, 0.4F, -0.35F, -0.4F, 0.4F, -0.2F, -0.4F, 0.4F, -0.2F, -0.4F, 0.25F, -0.35F, -0.4F, 0.4F); // Box 12
		gunModel[12].setRotationPoint(10.7F, -3.15F, -0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.2F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F, -0.55F, -0.4F, -0.1F, -0.55F, -0.4F, -0.1F, -0.55F, -0.65F, -0.1F, -0.55F, -0.65F); // Box 13
		gunModel[13].setRotationPoint(10.15F, -3.15F, 0.3F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.41F, -0.3F, 0.2F, -0.41F, -0.3F, 0.2F, -0.41F, -0.3F, 0.2F, -0.41F, -0.3F, 0.2F, -0.41F, -0.2F, 0.2F, -0.41F, -0.2F, 0.2F, -0.41F, -0.2F, 0.2F, -0.41F, -0.2F, 0.2F); // Box 14
		gunModel[14].setRotationPoint(9.2F, -2.85F, -0.3F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.41F, -0.3F, 0.2F, -0.41F, -0.3F, 0.2F, -0.41F, -0.3F, 0.2F, -0.41F, -0.3F, 0.2F, -0.41F, -0.1F, 0.2F, -0.41F, -0.1F, 0.2F, -0.41F, -0.1F, 0.2F, -0.41F, -0.1F, 0.2F); // Box 15
		gunModel[15].setRotationPoint(11.22F, -2.85F, -0.3F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.35F, 0.2F, -0.35F, -0.35F, 0.2F, -0.35F, -0.35F, 0.2F, -0.35F, -0.35F, 0.2F, -0.35F, -0.35F, 0.2F, -0.35F, -0.35F, 0.2F, -0.35F, -0.35F, 0.2F, -0.35F, -0.35F, 0.2F); // Box 16
		gunModel[16].setRotationPoint(10.93F, -2.75F, -0.35F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, 0.65F, -0.4F, -0.4F, 0.65F, -0.4F, -0.4F, 0.2F, -0.4F, -0.4F, 0.3F, -0.4F, -0.4F, 0.65F, -0.4F, -0.4F, 0.65F, -0.4F, -0.4F, 0.2F, -0.4F, -0.4F, 0.3F); // Box 17
		gunModel[17].setRotationPoint(10.7F, -3.25F, -0.35F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.2F, 0.05F, 0F, -0.2F, 0.05F, 0F, -0.2F, 0.05F, 0F, -0.2F, 0.05F, 0F, -0.2F, 0.05F, 0F, -0.2F, 0.05F, 0F, -0.2F, 0.05F, 0F, -0.2F, 0.05F); // Box 18
		gunModel[18].setRotationPoint(9.7F, -2.75F, -0.3F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.35F, 0.2F, -0.35F, -0.35F, 0.2F, -0.35F, -0.35F, 0.05F, -0.35F, -0.35F, 0.05F, -0.35F, -0.35F, 0.2F, -0.35F, -0.35F, 0.2F, -0.35F, -0.35F, 0.2F, -0.35F, -0.35F, 0.2F); // Box 19
		gunModel[19].setRotationPoint(10.2F, -2.68F, -0.32F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0.2F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.2F, 0.15F); // Box 20
		gunModel[20].setRotationPoint(-3.8F, -2.3F, -0.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.2F, 0.5F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, -0.2F, 0.5F, 0.15F, -0.2F, 0.2F, 0.15F, 0F, 0.2F, 0.15F, 0F, 0.2F, 0.15F, -0.2F, 0.2F, 0.15F); // Box 21
		gunModel[21].setRotationPoint(-8.8F, -2.3F, -0.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0.3F, 0.2F, 0.15F, 0F, 0.2F, 0.15F, 0F, 0.2F, 0.15F, 0.3F, 0.2F, 0.15F, -0.2F, 0.5F, 0.15F, 0F, -1F, 0.15F, 0F, -1F, 0.15F, -0.2F, 0.5F, 0.15F); // Box 22
		gunModel[22].setRotationPoint(-8.3F, -0.9F, -0.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0.15F, 1.2F, 0.2F, 0.15F, 1.2F, 0.2F, 0.15F, 0F, -0.5F, 0.15F, 0F, 0.5F, 0.15F, 0F, 0.5F, 0.15F, 0F, 0.5F, 0.15F, 0F, 0.5F, 0.15F); // Box 23
		gunModel[23].setRotationPoint(-8.1F, 0.1F, -0.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0.2F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, -0.5F, 0.2F, 0.15F, -0.5F, -1.1F, 0.15F, 0F, 0.2F, 0.15F, 0F, 0.2F, 0.15F, -0.5F, -1.1F, 0.15F); // Box 24
		gunModel[24].setRotationPoint(-11.6F, -2.8F, -0.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.8F, -0.4F, 0.15F, -0.5F, -0.4F, 0.15F, -0.5F, -0.4F, 0.15F, -0.8F, -0.4F, 0.15F, -0.9F, -0.4F, 0.15F, -0.2F, -0.4F, 0.15F, -0.2F, -0.4F, 0.15F, -0.9F, -0.4F, 0.15F); // Box 25
		gunModel[25].setRotationPoint(-12.6F, -3.4F, -0.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0.17F, 0.15F, 0F, -0.2F, 0.15F, 0F, -0.2F, 0.15F, -0.25F, 0.17F, 0.15F, -0.4F, -1F, 0.15F, 0F, -0.3F, 0.15F, 0F, -0.3F, 0.15F, -0.4F, -1F, 0.15F); // Box 26
		gunModel[26].setRotationPoint(-9.6F, -1.8F, -0.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, 0.15F, 0.05F, 0.2F, 0.15F, 0.05F, 0.2F, 0.15F, 0F, 0.2F, 0.15F, 0F, -1F, 0.15F, 0.05F, -1.2F, 0.15F, 0.05F, -1.2F, 0.15F, 0F, -1F, 0.15F); // Box 27
		gunModel[27].setRotationPoint(-3.3F, -0.9F, -0.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0.2F, 0.15F, 1F, 0.7F, 0.15F, 1F, 0.7F, 0.15F, -0.4F, 0.2F, 0.15F, 0.8F, 0.5F, 0.15F, -0.2F, -0.75F, 0.15F, -0.2F, -0.75F, 0.15F, 0.8F, 0.5F, 0.15F); // Box 28
		gunModel[28].setRotationPoint(-6.3F, 0.1F, -0.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, 0.25F, -0.2F, -0.5F, 0.25F, -0.2F, -0.5F, 0.25F, -0.2F, -0.5F, 0.25F, -0.2F, 0.5F, 0.25F, -0.2F, 0.5F, 0.25F, -0.2F, 0.5F, 0.25F, -0.2F, 0.5F, 0.25F); // Box 29
		gunModel[29].setRotationPoint(-8.9F, 0.1F, -0.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.3F, -0.8F, 0.25F, -0.7F, -0.8F, 0.25F, -0.7F, -0.8F, 0.25F, 0.3F, -0.8F, 0.25F, -0.2F, 0.5F, 0.25F, -0.2F, 0.5F, 0.25F, -0.2F, 0.5F, 0.25F, -0.2F, 0.5F, 0.25F); // Box 30
		gunModel[30].setRotationPoint(-8.9F, -1.9F, -0.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, -0.65F, 0.25F, -0.85F, -0.65F, 0.25F, -0.85F, -0.65F, 0.25F, 0.5F, -0.65F, 0.25F, -0.2F, 0.5F, 0.25F, -0.2F, 0.5F, 0.25F, -0.2F, 0.5F, 0.25F, -0.2F, 0.5F, 0.25F); // Box 31
		gunModel[31].setRotationPoint(-9.4F, -2.6F, -0.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.5F, -0.65F, 0.25F, -1.8F, -0.65F, 0.25F, -1.8F, -0.65F, 0.25F, 1.5F, -0.65F, 0.25F, -0.15F, 0.5F, 0.25F, -0.2F, 0.5F, 0.25F, -0.2F, 0.5F, 0.25F, -0.15F, 0.5F, 0.25F); // Box 32
		gunModel[32].setRotationPoint(-10.05F, -3.45F, -0.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.05F, -0.25F, 0.25F, -0.4F, -0.25F, 0.25F, -0.4F, -0.25F, 0.25F, 0.05F, -0.25F, 0.25F, -0.15F, -0.3F, 0.25F, 0.15F, -0.3F, 0.25F, 0.15F, -0.3F, 0.25F, -0.15F, -0.3F, 0.25F); // Box 33
		gunModel[33].setRotationPoint(-12.35F, -3.3F, -0.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.4F, 0.25F, -0.3F, -0.4F, 0.25F, -0.3F, -0.4F, 0.25F, 0.3F, -0.4F, 0.25F, -0.15F, -0.45F, 0.25F, 0.1F, -0.4F, 0.25F, 0.1F, -0.4F, 0.25F, -0.15F, -0.45F, 0.25F); // Box 34
		gunModel[34].setRotationPoint(-11.9F, -3F, -0.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 35
		gunModel[35].setRotationPoint(1.2F, -2.32F, -0.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.2F, 0.3F, 0.75F, -0.2F, 0.3F, 0.75F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0.3F, 0.75F, -0.4F, 0.3F, 0.75F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 37
		gunModel[36].setRotationPoint(5.6F, -2.2F, -0.46F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.2F, -0.1F, -0.25F, -0.2F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.4F, -0.5F, -0.1F, -0.4F, -0.5F, -0.1F); // Box 38
		gunModel[37].setRotationPoint(8.5F, -2.2F, -1.45F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 39
		gunModel[38].setRotationPoint(9.65F, -2.75F, -0.46F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 1.1F, -0.5F, 0F, 1.1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.3F, 0F, 1.1F, -0.3F, 0F, 1.1F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 40
		gunModel[39].setRotationPoint(2F, -3.6F, -0.5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.3F, -0.2F, 1.55F, -0.3F, -0.2F, 1.55F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, 0F, 1.75F, -0.3F, 0F, 1.75F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 41
		gunModel[40].setRotationPoint(2F, -3.8F, -0.5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.5F, 0.15F, -0.3F, -0.5F, 0.15F, -0.3F, -0.5F, 0.15F, -0.3F, -0.5F, 0.15F, -0.3F, -0.3F, 0.15F, -0.3F, -0.3F, 0.15F, -0.3F, -0.3F, 0.15F, -0.3F, -0.3F, 0.15F); // Box 42
		gunModel[41].setRotationPoint(5.4F, -3.6F, -0.5F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F); // Box 43
		gunModel[42].setRotationPoint(8.2F, -3.6F, -1F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.6F, -0.45F, 0F, 0.3F, -0.45F, 0F, 0.3F, -0.45F, 0F, 0.6F, -0.45F, 0F, 0.6F, -0.45F, 0F, 0.3F, -0.45F, 0F, 0.3F, -0.45F, 0F, 0.6F, -0.45F, 0F); // Box 44
		gunModel[43].setRotationPoint(2.6F, -4.05F, -0.5F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.6F, -0.25F, -0.45F, 0.3F, -0.25F, -0.45F, 0.3F, -0.25F, -0.45F, 0.6F, -0.25F, -0.45F, 0.6F, -0.25F, -0.45F, 0.3F, -0.25F, -0.45F, 0.3F, -0.25F, -0.45F, 0.6F, -0.25F, -0.45F); // Box 45
		gunModel[44].setRotationPoint(2.6F, -4.3F, -0.05F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.6F, -0.25F, -0.45F, 0.3F, -0.25F, -0.45F, 0.3F, -0.25F, -0.45F, 0.6F, -0.25F, -0.45F, 0.6F, -0.25F, -0.45F, 0.3F, -0.25F, -0.45F, 0.3F, -0.25F, -0.45F, 0.6F, -0.25F, -0.45F); // Box 46
		gunModel[45].setRotationPoint(2.6F, -4.3F, -0.95F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.3F, 1.55F, -0.25F, -0.3F, 1.55F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.3F, -0.3F, 1.75F, -0.3F, -0.3F, 1.75F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 47
		gunModel[46].setRotationPoint(1.8F, -3.6F, -0.5F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, -0.2F, 0.15F, 0F, -0.2F, 0.15F, 0F, -0.2F, 0.15F, 0F, -0.2F, 0.15F, 0F, -0.2F, 0.15F, 0F, -0.2F, 0.15F, 0F, -0.2F, 0.15F, 0F, -0.2F, 0.15F); // Box 48
		gunModel[47].setRotationPoint(12.35F, -1.9F, -0.5F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, -0.2F, 0.15F, 0F, -0.2F, 0.15F, 0F, -0.2F, 0.15F, 0F, -0.2F, 0.15F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F); // Box 50
		gunModel[48].setRotationPoint(12.35F, -1.3F, -0.5F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, -0.15F, -0.25F, 0.2F, -0.15F, -0.25F, 0.2F, -0.15F, -0.25F, 0.2F, -0.15F, -0.25F, 0.2F, -0.35F, 0.25F, 0.2F, -0.35F, 0.25F, 0.2F, -0.35F, 0.25F, 0.2F, -0.35F, 0.25F); // Box 51
		gunModel[49].setRotationPoint(26F, -2.35F, -0.5F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, -0.35F, 0.25F, 0.2F, -0.35F, 0.25F, 0.2F, -0.35F, 0.25F, 0.2F, -0.35F, 0.25F, 0.2F, -0.15F, -0.25F, 0.2F, -0.15F, -0.25F, 0.2F, -0.15F, -0.25F, 0.2F, -0.15F, -0.25F); // Box 52
		gunModel[50].setRotationPoint(26F, -1.45F, -0.5F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, -0.3F, 0.25F, 0.2F, -0.3F, 0.25F, 0.2F, -0.3F, 0.25F, 0.2F, -0.3F, 0.25F, 0.2F, -0.1F, 0.25F, 0.2F, -0.1F, 0.25F, 0.2F, -0.1F, 0.25F, 0.2F, -0.1F, 0.25F); // Box 53
		gunModel[51].setRotationPoint(26F, -2F, -0.5F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.35F, 0.1F, 0F, -0.35F, 0.1F, 0F, -0.35F, 0.1F, 0F, -0.35F, 0.1F); // Box 54
		gunModel[52].setRotationPoint(26.2F, -2.35F, -0.5F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.35F, 0.1F, 0F, -0.35F, 0.1F, 0F, -0.35F, 0.1F, 0F, -0.35F, 0.1F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 55
		gunModel[53].setRotationPoint(26.2F, -1.45F, -0.5F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, -0.3F, 0.1F, 0.2F, -0.3F, 0.1F, 0.2F, -0.3F, 0.1F, 0.2F, -0.3F, 0.1F, 0.2F, -0.1F, 0.1F, 0.2F, -0.1F, 0.1F, 0.2F, -0.1F, 0.1F, 0.2F, -0.1F, 0.1F); // Box 56
		gunModel[54].setRotationPoint(27F, -2F, -0.5F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.15F, -0.25F, -0.45F, -0.15F, -0.25F, -0.45F, -0.15F, -0.25F, -0.45F, -0.15F, -0.25F, -0.45F, -0.35F, 0.25F, -0.45F, -0.35F, 0.25F, -0.45F, -0.35F, 0.25F, -0.45F, -0.35F, 0.25F); // Box 57
		gunModel[55].setRotationPoint(16F, -2.35F, -0.5F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.3F, 0.25F, -0.45F, -0.3F, 0.25F, -0.45F, -0.3F, 0.25F, -0.45F, -0.3F, 0.25F, -0.45F, -0.1F, 0.25F, -0.45F, -0.1F, 0.25F, -0.45F, -0.1F, 0.25F, -0.45F, -0.1F, 0.25F); // Box 58
		gunModel[56].setRotationPoint(16F, -2F, -0.5F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.35F, 0.15F, 0F, -0.35F, 0.15F, 0F, -0.35F, 0.15F, 0F, -0.35F, 0.15F); // Box 59
		gunModel[57].setRotationPoint(12.35F, -2.35F, -0.5F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.35F, 0.25F, -0.45F, -0.35F, 0.25F, -0.45F, -0.35F, 0.25F, -0.45F, -0.35F, 0.25F, -0.45F, -0.15F, -0.25F, -0.45F, -0.15F, -0.25F, -0.45F, -0.15F, -0.25F, -0.45F, -0.15F, -0.25F); // Box 60
		gunModel[58].setRotationPoint(16F, -1.45F, -0.5F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.15F, -0.25F, -0.45F, -0.15F, -0.25F, -0.45F, -0.15F, -0.25F, -0.45F, -0.15F, -0.25F, -0.45F, -0.35F, 0.25F, -0.45F, -0.35F, 0.25F, -0.45F, -0.35F, 0.25F, -0.45F, -0.35F, 0.25F); // Box 61
		gunModel[59].setRotationPoint(12.8F, -2.35F, -0.5F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.3F, 0.25F, -0.45F, -0.3F, 0.25F, -0.45F, -0.3F, 0.25F, -0.45F, -0.3F, 0.25F, -0.45F, -0.1F, 0.25F, -0.45F, -0.1F, 0.25F, -0.45F, -0.1F, 0.25F, -0.45F, -0.1F, 0.25F); // Box 62
		gunModel[60].setRotationPoint(12.8F, -2F, -0.5F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.35F, 0.25F, -0.45F, -0.35F, 0.25F, -0.45F, -0.35F, 0.25F, -0.45F, -0.35F, 0.25F, -0.45F, -0.15F, -0.25F, -0.45F, -0.15F, -0.25F, -0.45F, -0.15F, -0.25F, -0.45F, -0.15F, -0.25F); // Box 64
		gunModel[61].setRotationPoint(12.8F, -1.45F, -0.5F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.45F, -0.3F, 0.25F, -0.45F, -0.3F, 0.25F, -0.45F, -0.5F, 0.25F, -0.45F, -0.5F, 0.25F, -0.45F, -0.1F, 0.25F, -0.45F, -0.1F, 0.25F, -0.45F, -0.3F, 0.25F, -0.45F, -0.3F, 0.25F); // Box 65
		gunModel[62].setRotationPoint(12.8F, -2F, 0.5F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.45F, -0.3F, 0.25F, -0.45F, -0.3F, 0.25F, -0.45F, -0.5F, 0.25F, -0.45F, -0.5F, 0.25F, -0.45F, -0.1F, 0.25F, -0.45F, -0.1F, 0.25F, -0.45F, -0.3F, 0.25F, -0.45F, -0.3F, 0.25F); // Box 66
		gunModel[63].setRotationPoint(16F, -2F, 0.5F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.35F, -0.2F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.2F); // Box 67
		gunModel[64].setRotationPoint(13.35F, -1.9F, 1.9F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.35F, -0.1F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.1F); // Box 68
		gunModel[65].setRotationPoint(15.45F, -1.9F, 1.9F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.05F, -0.35F, -0.1F, 0.05F, -0.35F, -0.1F, 0.05F, -0.35F, -0.1F, 0.05F, -0.35F, -0.1F, 0.05F, -0.35F, -0.1F, 0.05F, -0.35F, -0.1F, 0.05F, -0.35F, -0.1F, 0.05F, -0.35F, -0.1F); // Box 69
		gunModel[66].setRotationPoint(14.4F, -1.9F, 1.9F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.05F, -0.35F, -0.3F, 0.05F, -0.35F, -0.3F, 0.05F, -0.35F, -0.3F, 0.05F, -0.35F, -0.3F, 0.05F, -0.35F, -0.1F, 0.05F, -0.35F, -0.1F, 0.05F, -0.35F, -0.1F, 0.05F, -0.35F, -0.1F); // Box 70
		gunModel[67].setRotationPoint(14.4F, -2.2F, 1.9F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.05F, -0.35F, -0.1F, 0.05F, -0.35F, -0.1F, 0.05F, -0.35F, -0.1F, 0.05F, -0.35F, -0.1F, 0.05F, -0.35F, -0.3F, 0.05F, -0.35F, -0.3F, 0.05F, -0.35F, -0.3F, 0.05F, -0.35F, -0.3F); // Box 71
		gunModel[68].setRotationPoint(14.4F, -1.6F, 1.9F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.35F, -0.3F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.1F); // Box 72
		gunModel[69].setRotationPoint(15.45F, -2.2F, 1.9F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.35F, -0.1F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.3F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.35F, -0.3F); // Box 73
		gunModel[70].setRotationPoint(15.45F, -1.6F, 1.9F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.4F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.5F, -0.4F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.2F); // Box 74
		gunModel[71].setRotationPoint(13.35F, -2.2F, 1.9F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.35F, -0.2F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.2F, 0F, -0.5F, -0.4F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.5F, -0.4F); // Box 75
		gunModel[72].setRotationPoint(13.35F, -1.6F, 1.9F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, 0F, 0.23F, -0.35F, 0F, 0.23F, -0.35F, 0F, 0.23F, -0.35F, 0F, 0.23F, -0.35F, -0.25F, 0.23F, -0.35F, -0.25F, 0.23F, -0.35F, -0.25F, 0.23F, -0.35F, -0.25F, 0.23F); // Box 76
		gunModel[73].setRotationPoint(12.25F, -2.9F, -0.5F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, 0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, -0.15F, -0.25F, -0.35F, -0.15F, -0.25F, -0.35F, -0.15F, -0.25F, -0.35F, -0.15F, -0.25F); // Box 77
		gunModel[74].setRotationPoint(12.25F, -3.75F, -0.5F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.36F, -0.3F, -0.46F, -0.36F, -0.4F, -0.46F, -0.36F, -0.4F, -0.46F, -0.36F, -0.3F, -0.46F, -0.36F, -0.4F, -0.46F, -0.36F, -0.4F, -0.46F, -0.36F, -0.4F, -0.46F, -0.36F, -0.4F, -0.46F); // Box 78
		gunModel[75].setRotationPoint(12.25F, -4.28F, -0.5F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F); // Box 79
		gunModel[76].setRotationPoint(1.9F, -4.3F, 0.05F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F); // Box 80
		gunModel[77].setRotationPoint(1.9F, -4.3F, -1.05F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.3F, -0.2F, -0.45F, -0.3F, -0.2F, -0.45F, -0.3F, -0.2F, -0.45F, -0.3F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F); // Box 81
		gunModel[78].setRotationPoint(1.7F, -4.2F, -0.5F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.55F, -0.2F, -0.45F, -0.55F, -0.2F, -0.45F, -0.55F, -0.2F, -0.45F, -0.55F, -0.2F); // Box 82
		gunModel[79].setRotationPoint(1.7F, -5.4F, -0.5F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F); // Box 84
		gunModel[80].setRotationPoint(1.7F, -5.4F, -0.75F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F); // Box 85
		gunModel[81].setRotationPoint(1.7F, -5.4F, -0.25F);

		gunModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.55F, -0.4F, -0.45F, -0.55F, -0.4F, -0.45F, -0.55F, -0.4F, -0.45F, -0.55F, -0.4F); // Box 86
		gunModel[82].setRotationPoint(1.7F, -4.35F, -0.33F);

		gunModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.55F, -0.4F, -0.45F, -0.55F, -0.4F, -0.45F, -0.55F, -0.4F, -0.45F, -0.55F, -0.4F); // Box 87
		gunModel[83].setRotationPoint(1.7F, -4.35F, -0.68F);

		gunModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.8F, 0.2F, -0.4F, 0.8F, 0.2F, -0.4F, 0.8F, 0.2F, -0.4F, 0.8F, 0.2F); // Box 88
		gunModel[84].setRotationPoint(0.3F, -2.25F, -0.5F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.8F, 0.2F, -0.4F, 0.8F, 0.2F, -0.4F, 0.8F, 0.2F, -0.4F, 0.8F, 0.2F); // Box 89
		gunModel[85].setRotationPoint(-0.3F, -2.25F, -0.5F);

		gunModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.18F, -0.1F, 0F, 0.18F, -0.1F, 0F, 0.18F, 0F, 0F, 0.18F, 0.8F, 0.15F, 0.18F, -0.35F, 0.15F, 0.18F, -0.35F, 0.15F, 0.18F, 0.8F, 0.15F, 0.18F); // Box 90
		gunModel[86].setRotationPoint(-0.8F, -1.15F, -0.5F);

		gunModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.8F, -0.15F, 0.18F, -0.35F, -0.15F, 0.18F, -0.35F, -0.15F, 0.18F, 0.8F, -0.15F, 0.18F, 0.9F, 0.15F, 0.18F, -0.45F, 0.15F, 0.18F, -0.45F, 0.15F, 0.18F, 0.9F, 0.15F, 0.18F); // Box 91
		gunModel[87].setRotationPoint(-0.8F, -0.15F, -0.5F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.9F, -0.4F, 0.18F, -0.45F, -0.4F, 0.18F, -0.45F, -0.4F, 0.18F, 0.9F, -0.4F, 0.18F, 0.7F, -0.1F, 0.18F, -0.6F, -0.1F, 0.18F, -0.6F, -0.1F, 0.18F, 0.7F, -0.1F, 0.18F); // Box 93
		gunModel[88].setRotationPoint(-0.8F, 0.6F, -0.5F);

		gunModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F); // Box 94
		gunModel[89].setRotationPoint(0F, -1.65F, -0.5F);

		gunModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.6F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.6F, -0.4F); // Box 95
		gunModel[90].setRotationPoint(1.1F, -0.7F, -0.5F);

		gunModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.45F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.6F, -0.4F, -0.3F, -0.6F, -0.4F, -0.3F, -0.45F, -0.4F); // Box 96
		gunModel[91].setRotationPoint(0.7F, -0.7F, -0.5F);

		gunModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.45F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.6F, -0.4F, -0.3F, -0.6F, -0.4F, -0.3F, -0.45F, -0.4F); // Box 98
		gunModel[92].setRotationPoint(0.3F, 0.05F, -0.5F);
		gunModel[92].rotateAngleZ = 0.80285146F;

		gunModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.7F, -0.3F, -0.2F, 0.5F, -0.3F, -0.2F, 0.5F, -0.3F, -0.2F, 0.7F, -0.3F, -0.2F, 0.7F, -0.1F, -0.2F, 0.5F, -0.1F, -0.2F, 0.5F, -0.1F, -0.2F, 0.7F, -0.1F, -0.2F); // Box 99
		gunModel[93].setRotationPoint(25F, -1.05F, -0.5F);

		gunModel[94].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0.7F, -0.5F, -0.4F, 0.5F, -0.3F, -0.4F, 0.5F, -0.3F, -0.4F, 0.7F, -0.5F, -0.4F, 0.7F, 0.1F, -0.4F, 0.5F, -0.1F, -0.4F, 0.5F, -0.1F, -0.4F, 0.7F, 0.1F, -0.4F); // Box 101
		gunModel[94].setRotationPoint(19F, -1.05F, -0.1F);

		gunModel[95].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0.7F, -0.5F, -0.4F, 0.5F, -0.3F, -0.4F, 0.5F, -0.3F, -0.4F, 0.7F, -0.5F, -0.4F, 0.7F, 0.1F, -0.4F, 0.5F, -0.1F, -0.4F, 0.5F, -0.1F, -0.4F, 0.7F, 0.1F, -0.4F); // Box 102
		gunModel[95].setRotationPoint(19F, -1.05F, -0.9F);

		gunModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Box 103
		gunModel[96].setRotationPoint(17.8F, -0.6F, -1.1F);

		gunModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Box 104
		gunModel[97].setRotationPoint(17.8F, -0.6F, 0.2F);

		gunModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F); // Box 105
		gunModel[98].setRotationPoint(11.6F, -0.65F, -0.5F);

		gunModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, 0.3F, -0.3F, -0.4F, 0.3F, -0.3F, -0.4F, 0.3F, -0.3F, -0.4F, 0.3F, 0F, -0.25F, 0.3F, 0F, -0.25F, 0.3F, 0F, -0.25F, 0.3F, 0F, -0.25F, 0.3F); // Box 106
		gunModel[99].setRotationPoint(11.6F, -1.2F, -0.5F);
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 129
		ammoModel[1] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 130
		ammoModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 131
		ammoModel[3] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 133
		ammoModel[4] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 134
		ammoModel[5] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 135
		ammoModel[6] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 136
		ammoModel[7] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 137
		ammoModel[8] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 138
		ammoModel[9] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 139
		ammoModel[10] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 140
		ammoModel[11] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 141
		ammoModel[12] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 142
		ammoModel[13] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 143
		ammoModel[14] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 144
		ammoModel[15] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 145
		ammoModel[16] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 146
		ammoModel[17] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 147
		ammoModel[18] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 148
		ammoModel[19] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 149
		ammoModel[20] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 150
		ammoModel[21] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 151
		ammoModel[22] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 152
		ammoModel[23] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 153
		ammoModel[24] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 154
		ammoModel[25] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 155
		ammoModel[26] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 156
		ammoModel[27] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 157
		ammoModel[28] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 158
		ammoModel[29] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 159
		ammoModel[30] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 160
		ammoModel[31] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 161
		ammoModel[32] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 162
		ammoModel[33] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 163
		ammoModel[34] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 164
		ammoModel[35] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 165
		ammoModel[36] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 166
		ammoModel[37] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 167
		ammoModel[38] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 168
		ammoModel[39] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 169
		ammoModel[40] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 170
		ammoModel[41] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 171
		ammoModel[42] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 172
		ammoModel[43] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 173
		ammoModel[44] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 174
		ammoModel[45] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 175
		ammoModel[46] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 176
		ammoModel[47] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 177
		ammoModel[48] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 178
		ammoModel[49] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 179
		ammoModel[50] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 180
		ammoModel[51] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 181
		ammoModel[52] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 182
		ammoModel[53] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 183
		ammoModel[54] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 184
		ammoModel[55] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 185
		ammoModel[56] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 186
		ammoModel[57] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 187
		ammoModel[58] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 188
		ammoModel[59] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 189
		ammoModel[60] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 190
		ammoModel[61] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 191
		ammoModel[62] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 192
		ammoModel[63] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 193
		ammoModel[64] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 194
		ammoModel[65] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 195
		ammoModel[66] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 196
		ammoModel[67] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 197
		ammoModel[68] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 198
		ammoModel[69] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 199
		ammoModel[70] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 200
		ammoModel[71] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 201
		ammoModel[72] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 202
		ammoModel[73] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 203
		ammoModel[74] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 204
		ammoModel[75] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 205
		ammoModel[76] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 206
		ammoModel[77] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 207
		ammoModel[78] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 208
		ammoModel[79] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 209
		ammoModel[80] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 210
		ammoModel[81] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 211
		ammoModel[82] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 212
		ammoModel[83] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 213
		ammoModel[84] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 214
		ammoModel[85] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 215
		ammoModel[86] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 216
		ammoModel[87] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 217
		ammoModel[88] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 218
		ammoModel[89] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 219
		ammoModel[90] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 220
		ammoModel[91] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 221
		ammoModel[92] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 222
		ammoModel[93] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 223
		ammoModel[94] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 224
		ammoModel[95] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 225
		ammoModel[96] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 226
		ammoModel[97] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 227
		ammoModel[98] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 228
		ammoModel[99] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 229
		ammoModel[100] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 230
		ammoModel[101] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 231
		ammoModel[102] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 232
		ammoModel[103] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 233
		ammoModel[104] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 234
		ammoModel[105] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 235
		ammoModel[106] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 236
		ammoModel[107] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 237
		ammoModel[108] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 238
		ammoModel[109] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 239
		ammoModel[110] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 240
		ammoModel[111] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 241
		ammoModel[112] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 242
		ammoModel[113] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 243
		ammoModel[114] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 244
		ammoModel[115] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 245
		ammoModel[116] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 246
		ammoModel[117] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 247
		ammoModel[118] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 248
		ammoModel[119] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 249
		ammoModel[120] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 250
		ammoModel[121] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 251
		ammoModel[122] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 252
		ammoModel[123] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 253
		ammoModel[124] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 254
		ammoModel[125] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 255
		ammoModel[126] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 256
		ammoModel[127] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 257
		ammoModel[128] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 258
		ammoModel[129] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 259
		ammoModel[130] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 260
		ammoModel[131] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 261
		ammoModel[132] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 262
		ammoModel[133] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 263
		ammoModel[134] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 264
		ammoModel[135] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 265
		ammoModel[136] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 266
		ammoModel[137] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 267
		ammoModel[138] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 268
		ammoModel[139] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 269
		ammoModel[140] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 270
		ammoModel[141] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 271
		ammoModel[142] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 272
		ammoModel[143] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 273
		ammoModel[144] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 274
		ammoModel[145] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 275
		ammoModel[146] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 276
		ammoModel[147] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 277
		ammoModel[148] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 278
		ammoModel[149] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 279
		ammoModel[150] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 280
		ammoModel[151] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 281
		ammoModel[152] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 282
		ammoModel[153] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 283
		ammoModel[154] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 284
		ammoModel[155] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 285
		ammoModel[156] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 286
		ammoModel[157] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 287
		ammoModel[158] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 288
		ammoModel[159] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 289
		ammoModel[160] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 290
		ammoModel[161] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 291
		ammoModel[162] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 292
		ammoModel[163] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 293
		ammoModel[164] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 294
		ammoModel[165] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 295
		ammoModel[166] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 296
		ammoModel[167] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 297
		ammoModel[168] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 298
		ammoModel[169] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 299
		ammoModel[170] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 300
		ammoModel[171] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 301
		ammoModel[172] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 302
		ammoModel[173] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 303
		ammoModel[174] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 304
		ammoModel[175] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 305
		ammoModel[176] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 306
		ammoModel[177] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 307
		ammoModel[178] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 308
		ammoModel[179] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 309
		ammoModel[180] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 310
		ammoModel[181] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 311
		ammoModel[182] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 312
		ammoModel[183] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 313
		ammoModel[184] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 314
		ammoModel[185] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 315
		ammoModel[186] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 316
		ammoModel[187] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 317
		ammoModel[188] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 318
		ammoModel[189] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 319
		ammoModel[190] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 320
		ammoModel[191] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 321
		ammoModel[192] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 322
		ammoModel[193] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 323
		ammoModel[194] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 324
		ammoModel[195] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 325
		ammoModel[196] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 326
		ammoModel[197] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 327
		ammoModel[198] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 328
		ammoModel[199] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 329
		ammoModel[200] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 330
		ammoModel[201] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 331
		ammoModel[202] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 332
		ammoModel[203] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 333
		ammoModel[204] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 334
		ammoModel[205] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 335
		ammoModel[206] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 336
		ammoModel[207] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 337
		ammoModel[208] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 338
		ammoModel[209] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 339
		ammoModel[210] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 340
		ammoModel[211] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 341
		ammoModel[212] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 342
		ammoModel[213] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 343
		ammoModel[214] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 344
		ammoModel[215] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 345
		ammoModel[216] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 346
		ammoModel[217] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 347
		ammoModel[218] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 348
		ammoModel[219] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 349
		ammoModel[220] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 350
		ammoModel[221] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 351
		ammoModel[222] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 352
		ammoModel[223] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 353
		ammoModel[224] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 354
		ammoModel[225] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 355
		ammoModel[226] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 356
		ammoModel[227] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 357
		ammoModel[228] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 358
		ammoModel[229] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 359
		ammoModel[230] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 360
		ammoModel[231] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 361
		ammoModel[232] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 362
		ammoModel[233] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 363
		ammoModel[234] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 364
		ammoModel[235] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 365
		ammoModel[236] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 366
		ammoModel[237] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 367
		ammoModel[238] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 368
		ammoModel[239] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 369
		ammoModel[240] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 370
		ammoModel[241] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 371
		ammoModel[242] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 372
		ammoModel[243] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 373
		ammoModel[244] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 374
		ammoModel[245] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 375
		ammoModel[246] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 376
		ammoModel[247] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 377
		ammoModel[248] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 378
		ammoModel[249] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 379
		ammoModel[250] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 380
		ammoModel[251] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 381
		ammoModel[252] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 382
		ammoModel[253] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 383
		ammoModel[254] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 384
		ammoModel[255] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 385
		ammoModel[256] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 386
		ammoModel[257] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 387
		ammoModel[258] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 388
		ammoModel[259] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 389
		ammoModel[260] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 390
		ammoModel[261] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 391
		ammoModel[262] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 392
		ammoModel[263] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 393
		ammoModel[264] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 394
		ammoModel[265] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 395
		ammoModel[266] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 396
		ammoModel[267] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 397
		ammoModel[268] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 398
		ammoModel[269] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 399
		ammoModel[270] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 400
		ammoModel[271] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 401
		ammoModel[272] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 402
		ammoModel[273] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 403
		ammoModel[274] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 404
		ammoModel[275] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 405
		ammoModel[276] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 406
		ammoModel[277] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 407
		ammoModel[278] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 408
		ammoModel[279] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 409
		ammoModel[280] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 410
		ammoModel[281] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 411
		ammoModel[282] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 412
		ammoModel[283] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 413
		ammoModel[284] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 414
		ammoModel[285] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 415
		ammoModel[286] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 416
		ammoModel[287] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 417
		ammoModel[288] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 418
		ammoModel[289] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 419
		ammoModel[290] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 420
		ammoModel[291] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 421
		ammoModel[292] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 422
		ammoModel[293] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 423
		ammoModel[294] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 424
		ammoModel[295] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 425
		ammoModel[296] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 426
		ammoModel[297] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 427
		ammoModel[298] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 428
		ammoModel[299] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 429
		ammoModel[300] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 430
		ammoModel[301] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 431
		ammoModel[302] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 432
		ammoModel[303] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 433
		ammoModel[304] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 434
		ammoModel[305] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 435
		ammoModel[306] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 436
		ammoModel[307] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 437
		ammoModel[308] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 438
		ammoModel[309] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 439
		ammoModel[310] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 440
		ammoModel[311] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 441
		ammoModel[312] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 442
		ammoModel[313] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 443
		ammoModel[314] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 444
		ammoModel[315] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 445
		ammoModel[316] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 446
		ammoModel[317] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 447
		ammoModel[318] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 448
		ammoModel[319] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 449
		ammoModel[320] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 450
		ammoModel[321] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 451
		ammoModel[322] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 452
		ammoModel[323] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 453
		ammoModel[324] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 454
		ammoModel[325] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 455
		ammoModel[326] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 456
		ammoModel[327] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 457
		ammoModel[328] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 458
		ammoModel[329] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 459
		ammoModel[330] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 460
		ammoModel[331] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 461
		ammoModel[332] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 462
		ammoModel[333] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 463
		ammoModel[334] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 464
		ammoModel[335] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 465
		ammoModel[336] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 466
		ammoModel[337] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 467
		ammoModel[338] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 468
		ammoModel[339] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 469
		ammoModel[340] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 470
		ammoModel[341] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 472
		ammoModel[342] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 473
		ammoModel[343] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 474
		ammoModel[344] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 475
		ammoModel[345] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 476
		ammoModel[346] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 477
		ammoModel[347] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 478
		ammoModel[348] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 479
		ammoModel[349] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 480
		ammoModel[350] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 481
		ammoModel[351] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 482
		ammoModel[352] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 483
		ammoModel[353] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 484
		ammoModel[354] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 485
		ammoModel[355] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 486
		ammoModel[356] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 487
		ammoModel[357] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 488
		ammoModel[358] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 489
		ammoModel[359] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 490
		ammoModel[360] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 492
		ammoModel[361] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 493
		ammoModel[362] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 494
		ammoModel[363] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 495
		ammoModel[364] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 496
		ammoModel[365] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 497
		ammoModel[366] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 498
		ammoModel[367] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 499
		ammoModel[368] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 500
		ammoModel[369] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 501
		ammoModel[370] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 502
		ammoModel[371] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 503
		ammoModel[372] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 504
		ammoModel[373] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 505
		ammoModel[374] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 506
		ammoModel[375] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 507
		ammoModel[376] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 508
		ammoModel[377] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 509
		ammoModel[378] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 510
		ammoModel[379] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 511
		ammoModel[380] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 512
		ammoModel[381] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 513
		ammoModel[382] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 514
		ammoModel[383] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 515
		ammoModel[384] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 516
		ammoModel[385] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 517
		ammoModel[386] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 518

		ammoModel[0].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-0.3F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F); // Box 129
		ammoModel[0].setRotationPoint(9.2F, -1F, 0.9F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 130
		ammoModel[1].setRotationPoint(9.05F, -2F, 0.9F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 131
		ammoModel[2].setRotationPoint(11.25F, -2F, 0.9F);

		ammoModel[3].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 133
		ammoModel[3].setRotationPoint(9.7F, -2F, 0.5F);

		ammoModel[4].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 134
		ammoModel[4].setRotationPoint(9.7F, -2F, 6.3F);

		ammoModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,-0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F); // Box 135
		ammoModel[5].setRotationPoint(9.2F, -2.4F, 7.2F);
		ammoModel[5].rotateAngleX = -0.9424778F;

		ammoModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.45F, -0.45F, -0.52F, -0.45F, -0.4F, -0.49F, -0.44F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 136
		ammoModel[6].setRotationPoint(10.42F, -2.7F, 0.5F);

		ammoModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F, -0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F); // Box 137
		ammoModel[7].setRotationPoint(11F, -2.65F, 0.5F);

		ammoModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F, -0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F); // Box 138
		ammoModel[8].setRotationPoint(11F, -2.6F, 0.5F);

		ammoModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F, -0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F); // Box 139
		ammoModel[9].setRotationPoint(11F, -2.55F, 0.5F);

		ammoModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F); // Box 140
		ammoModel[10].setRotationPoint(10.75F, -2.55F, 0.5F);

		ammoModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F); // Box 141
		ammoModel[11].setRotationPoint(10.75F, -2.6F, 0.5F);

		ammoModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F); // Box 142
		ammoModel[12].setRotationPoint(10.75F, -2.65F, 0.5F);

		ammoModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 143
		ammoModel[13].setRotationPoint(10.55F, -2.7F, 0.5F);

		ammoModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 144
		ammoModel[14].setRotationPoint(10.55F, -2.6F, 0.5F);

		ammoModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F); // Box 145
		ammoModel[15].setRotationPoint(10.55F, -2.5F, 0.5F);

		ammoModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.46F, -0.45F, -0.52F, -0.46F, -0.4F, -0.49F, -0.44F); // Box 146
		ammoModel[16].setRotationPoint(10.42F, -2.5F, 0.5F);

		ammoModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 147
		ammoModel[17].setRotationPoint(10.42F, -2.6F, 0.5F);

		ammoModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 148
		ammoModel[18].setRotationPoint(9.6F, -2.7F, 0.5F);

		ammoModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 149
		ammoModel[19].setRotationPoint(9.6F, -2.6F, 0.5F);

		ammoModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F); // Box 150
		ammoModel[20].setRotationPoint(9.6F, -2.5F, 0.5F);

		ammoModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.45F, -0.45F, -0.52F, -0.45F, -0.4F, -0.49F, -0.44F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 151
		ammoModel[21].setRotationPoint(10.42F, -2.55F, 0.7F);

		ammoModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F, -0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F); // Box 152
		ammoModel[22].setRotationPoint(11F, -2.5F, 0.7F);

		ammoModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F, -0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F); // Box 153
		ammoModel[23].setRotationPoint(11F, -2.45F, 0.7F);

		ammoModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F, -0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F); // Box 154
		ammoModel[24].setRotationPoint(11F, -2.4F, 0.7F);

		ammoModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F); // Box 155
		ammoModel[25].setRotationPoint(10.75F, -2.4F, 0.7F);

		ammoModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F); // Box 156
		ammoModel[26].setRotationPoint(10.75F, -2.45F, 0.7F);

		ammoModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F); // Box 157
		ammoModel[27].setRotationPoint(10.75F, -2.5F, 0.7F);

		ammoModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 158
		ammoModel[28].setRotationPoint(10.55F, -2.55F, 0.7F);

		ammoModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 159
		ammoModel[29].setRotationPoint(10.55F, -2.45F, 0.7F);

		ammoModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F); // Box 160
		ammoModel[30].setRotationPoint(10.55F, -2.35F, 0.7F);

		ammoModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.46F, -0.45F, -0.52F, -0.46F, -0.4F, -0.49F, -0.44F); // Box 161
		ammoModel[31].setRotationPoint(10.42F, -2.35F, 0.7F);

		ammoModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 162
		ammoModel[32].setRotationPoint(10.42F, -2.45F, 0.7F);

		ammoModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 163
		ammoModel[33].setRotationPoint(9.6F, -2.55F, 0.7F);

		ammoModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 164
		ammoModel[34].setRotationPoint(9.6F, -2.45F, 0.7F);

		ammoModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F); // Box 165
		ammoModel[35].setRotationPoint(9.6F, -2.35F, 0.7F);

		ammoModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.45F, -0.45F, -0.52F, -0.45F, -0.4F, -0.49F, -0.44F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 166
		ammoModel[36].setRotationPoint(10.42F, -2.55F, 1F);

		ammoModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F, -0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F); // Box 167
		ammoModel[37].setRotationPoint(11F, -2.5F, 1F);

		ammoModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F, -0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F); // Box 168
		ammoModel[38].setRotationPoint(11F, -2.45F, 1F);

		ammoModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F, -0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F); // Box 169
		ammoModel[39].setRotationPoint(11F, -2.4F, 1F);

		ammoModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F); // Box 170
		ammoModel[40].setRotationPoint(10.75F, -2.4F, 1F);

		ammoModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F); // Box 171
		ammoModel[41].setRotationPoint(10.75F, -2.45F, 1F);

		ammoModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F); // Box 172
		ammoModel[42].setRotationPoint(10.75F, -2.5F, 1F);

		ammoModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 173
		ammoModel[43].setRotationPoint(10.55F, -2.55F, 1F);

		ammoModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 174
		ammoModel[44].setRotationPoint(10.55F, -2.45F, 1F);

		ammoModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F); // Box 175
		ammoModel[45].setRotationPoint(10.55F, -2.35F, 1F);

		ammoModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.46F, -0.45F, -0.52F, -0.46F, -0.4F, -0.49F, -0.44F); // Box 176
		ammoModel[46].setRotationPoint(10.42F, -2.35F, 1F);

		ammoModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 177
		ammoModel[47].setRotationPoint(10.42F, -2.45F, 1F);

		ammoModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 178
		ammoModel[48].setRotationPoint(9.6F, -2.55F, 1F);

		ammoModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 179
		ammoModel[49].setRotationPoint(9.6F, -2.45F, 1F);

		ammoModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F); // Box 180
		ammoModel[50].setRotationPoint(9.6F, -2.35F, 1F);

		ammoModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.45F, -0.45F, -0.52F, -0.45F, -0.4F, -0.49F, -0.44F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 181
		ammoModel[51].setRotationPoint(10.42F, -2.4F, 1.25F);

		ammoModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F, -0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F); // Box 182
		ammoModel[52].setRotationPoint(11F, -2.35F, 1.25F);

		ammoModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F, -0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F); // Box 183
		ammoModel[53].setRotationPoint(11F, -2.3F, 1.25F);

		ammoModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F, -0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F); // Box 184
		ammoModel[54].setRotationPoint(11F, -2.25F, 1.25F);

		ammoModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F); // Box 185
		ammoModel[55].setRotationPoint(10.75F, -2.25F, 1.25F);

		ammoModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F); // Box 186
		ammoModel[56].setRotationPoint(10.75F, -2.3F, 1.25F);

		ammoModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F); // Box 187
		ammoModel[57].setRotationPoint(10.75F, -2.35F, 1.25F);

		ammoModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 188
		ammoModel[58].setRotationPoint(10.55F, -2.4F, 1.25F);

		ammoModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 189
		ammoModel[59].setRotationPoint(10.55F, -2.3F, 1.25F);

		ammoModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F); // Box 190
		ammoModel[60].setRotationPoint(10.55F, -2.2F, 1.25F);

		ammoModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.46F, -0.45F, -0.52F, -0.46F, -0.4F, -0.49F, -0.44F); // Box 191
		ammoModel[61].setRotationPoint(10.42F, -2.2F, 1.25F);

		ammoModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 192
		ammoModel[62].setRotationPoint(10.42F, -2.3F, 1.25F);

		ammoModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 193
		ammoModel[63].setRotationPoint(9.6F, -2.4F, 1.25F);

		ammoModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 194
		ammoModel[64].setRotationPoint(9.6F, -2.3F, 1.25F);

		ammoModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F); // Box 195
		ammoModel[65].setRotationPoint(9.6F, -2.2F, 1.25F);

		ammoModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.45F, -0.45F, -0.52F, -0.45F, -0.4F, -0.49F, -0.44F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 196
		ammoModel[66].setRotationPoint(10.42F, -2.3F, 1.5F);

		ammoModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F, -0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F); // Box 197
		ammoModel[67].setRotationPoint(11F, -2.25F, 1.5F);

		ammoModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F, -0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F); // Box 198
		ammoModel[68].setRotationPoint(11F, -2.2F, 1.5F);

		ammoModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F, -0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F); // Box 199
		ammoModel[69].setRotationPoint(11F, -2.15F, 1.5F);

		ammoModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F); // Box 200
		ammoModel[70].setRotationPoint(10.75F, -2.15F, 1.5F);

		ammoModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F); // Box 201
		ammoModel[71].setRotationPoint(10.75F, -2.2F, 1.5F);

		ammoModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F); // Box 202
		ammoModel[72].setRotationPoint(10.75F, -2.25F, 1.5F);

		ammoModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 203
		ammoModel[73].setRotationPoint(10.55F, -2.3F, 1.5F);

		ammoModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 204
		ammoModel[74].setRotationPoint(10.55F, -2.2F, 1.5F);

		ammoModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F); // Box 205
		ammoModel[75].setRotationPoint(10.55F, -2.1F, 1.5F);

		ammoModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.46F, -0.45F, -0.52F, -0.46F, -0.4F, -0.49F, -0.44F); // Box 206
		ammoModel[76].setRotationPoint(10.42F, -2.1F, 1.5F);

		ammoModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 207
		ammoModel[77].setRotationPoint(10.42F, -2.2F, 1.5F);

		ammoModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 208
		ammoModel[78].setRotationPoint(9.6F, -2.3F, 1.5F);

		ammoModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 209
		ammoModel[79].setRotationPoint(9.6F, -2.2F, 1.5F);

		ammoModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F); // Box 210
		ammoModel[80].setRotationPoint(9.6F, -2.1F, 1.5F);

		ammoModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.45F, -0.45F, -0.52F, -0.45F, -0.4F, -0.49F, -0.44F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 211
		ammoModel[81].setRotationPoint(10.42F, -2.3F, 1.8F);

		ammoModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F, -0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F); // Box 212
		ammoModel[82].setRotationPoint(11F, -2.25F, 1.8F);

		ammoModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F, -0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F); // Box 213
		ammoModel[83].setRotationPoint(11F, -2.2F, 1.8F);

		ammoModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F, -0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F); // Box 214
		ammoModel[84].setRotationPoint(11F, -2.15F, 1.8F);

		ammoModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F); // Box 215
		ammoModel[85].setRotationPoint(10.75F, -2.15F, 1.8F);

		ammoModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F); // Box 216
		ammoModel[86].setRotationPoint(10.75F, -2.2F, 1.8F);

		ammoModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F); // Box 217
		ammoModel[87].setRotationPoint(10.75F, -2.25F, 1.8F);

		ammoModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 218
		ammoModel[88].setRotationPoint(10.55F, -2.3F, 1.8F);

		ammoModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 219
		ammoModel[89].setRotationPoint(10.55F, -2.2F, 1.8F);

		ammoModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F); // Box 220
		ammoModel[90].setRotationPoint(10.55F, -2.1F, 1.8F);

		ammoModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.46F, -0.45F, -0.52F, -0.46F, -0.4F, -0.49F, -0.44F); // Box 221
		ammoModel[91].setRotationPoint(10.42F, -2.1F, 1.8F);

		ammoModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 222
		ammoModel[92].setRotationPoint(10.42F, -2.2F, 1.8F);

		ammoModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 223
		ammoModel[93].setRotationPoint(9.6F, -2.3F, 1.8F);

		ammoModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 224
		ammoModel[94].setRotationPoint(9.6F, -2.2F, 1.8F);

		ammoModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F); // Box 225
		ammoModel[95].setRotationPoint(9.6F, -2.1F, 1.8F);

		ammoModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.45F, -0.45F, -0.52F, -0.45F, -0.4F, -0.49F, -0.44F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 226
		ammoModel[96].setRotationPoint(10.42F, -2.3F, 2.1F);

		ammoModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F, -0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F); // Box 227
		ammoModel[97].setRotationPoint(11F, -2.25F, 2.1F);

		ammoModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F, -0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F); // Box 228
		ammoModel[98].setRotationPoint(11F, -2.2F, 2.1F);

		ammoModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F, -0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F); // Box 229
		ammoModel[99].setRotationPoint(11F, -2.15F, 2.1F);

		ammoModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F); // Box 230
		ammoModel[100].setRotationPoint(10.75F, -2.15F, 2.1F);

		ammoModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F); // Box 231
		ammoModel[101].setRotationPoint(10.75F, -2.2F, 2.1F);

		ammoModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F); // Box 232
		ammoModel[102].setRotationPoint(10.75F, -2.25F, 2.1F);

		ammoModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 233
		ammoModel[103].setRotationPoint(10.55F, -2.3F, 2.1F);

		ammoModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 234
		ammoModel[104].setRotationPoint(10.55F, -2.2F, 2.1F);

		ammoModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F); // Box 235
		ammoModel[105].setRotationPoint(10.55F, -2.1F, 2.1F);

		ammoModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.46F, -0.45F, -0.52F, -0.46F, -0.4F, -0.49F, -0.44F); // Box 236
		ammoModel[106].setRotationPoint(10.42F, -2.1F, 2.1F);

		ammoModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 237
		ammoModel[107].setRotationPoint(10.42F, -2.2F, 2.1F);

		ammoModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 238
		ammoModel[108].setRotationPoint(9.6F, -2.3F, 2.1F);

		ammoModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 239
		ammoModel[109].setRotationPoint(9.6F, -2.2F, 2.1F);

		ammoModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F); // Box 240
		ammoModel[110].setRotationPoint(9.6F, -2.1F, 2.1F);

		ammoModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.45F, -0.45F, -0.52F, -0.45F, -0.4F, -0.49F, -0.44F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 241
		ammoModel[111].setRotationPoint(10.42F, -2.3F, 2.4F);

		ammoModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F, -0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F); // Box 242
		ammoModel[112].setRotationPoint(11F, -2.25F, 2.4F);

		ammoModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F, -0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F); // Box 243
		ammoModel[113].setRotationPoint(11F, -2.2F, 2.4F);

		ammoModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F, -0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F); // Box 244
		ammoModel[114].setRotationPoint(11F, -2.15F, 2.4F);

		ammoModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F); // Box 245
		ammoModel[115].setRotationPoint(10.75F, -2.15F, 2.4F);

		ammoModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F); // Box 246
		ammoModel[116].setRotationPoint(10.75F, -2.2F, 2.4F);

		ammoModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F); // Box 247
		ammoModel[117].setRotationPoint(10.75F, -2.25F, 2.4F);

		ammoModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 248
		ammoModel[118].setRotationPoint(10.55F, -2.3F, 2.4F);

		ammoModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 249
		ammoModel[119].setRotationPoint(10.55F, -2.2F, 2.4F);

		ammoModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F); // Box 250
		ammoModel[120].setRotationPoint(10.55F, -2.1F, 2.4F);

		ammoModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.46F, -0.45F, -0.52F, -0.46F, -0.4F, -0.49F, -0.44F); // Box 251
		ammoModel[121].setRotationPoint(10.42F, -2.1F, 2.4F);

		ammoModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 252
		ammoModel[122].setRotationPoint(10.42F, -2.2F, 2.4F);

		ammoModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 253
		ammoModel[123].setRotationPoint(9.6F, -2.3F, 2.4F);

		ammoModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 254
		ammoModel[124].setRotationPoint(9.6F, -2.2F, 2.4F);

		ammoModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F); // Box 255
		ammoModel[125].setRotationPoint(9.6F, -2.1F, 2.4F);

		ammoModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.45F, -0.45F, -0.52F, -0.45F, -0.4F, -0.49F, -0.44F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 256
		ammoModel[126].setRotationPoint(10.42F, -2.3F, 2.7F);

		ammoModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F, -0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F); // Box 257
		ammoModel[127].setRotationPoint(11F, -2.25F, 2.7F);

		ammoModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F, -0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F); // Box 258
		ammoModel[128].setRotationPoint(11F, -2.2F, 2.7F);

		ammoModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F, -0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F); // Box 259
		ammoModel[129].setRotationPoint(11F, -2.15F, 2.7F);

		ammoModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F); // Box 260
		ammoModel[130].setRotationPoint(10.75F, -2.15F, 2.7F);

		ammoModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F); // Box 261
		ammoModel[131].setRotationPoint(10.75F, -2.2F, 2.7F);

		ammoModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F); // Box 262
		ammoModel[132].setRotationPoint(10.75F, -2.25F, 2.7F);

		ammoModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 263
		ammoModel[133].setRotationPoint(10.55F, -2.3F, 2.7F);

		ammoModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 264
		ammoModel[134].setRotationPoint(10.55F, -2.2F, 2.7F);

		ammoModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F); // Box 265
		ammoModel[135].setRotationPoint(10.55F, -2.1F, 2.7F);

		ammoModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.46F, -0.45F, -0.52F, -0.46F, -0.4F, -0.49F, -0.44F); // Box 266
		ammoModel[136].setRotationPoint(10.42F, -2.1F, 2.7F);

		ammoModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 267
		ammoModel[137].setRotationPoint(10.42F, -2.2F, 2.7F);

		ammoModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 268
		ammoModel[138].setRotationPoint(9.6F, -2.3F, 2.7F);

		ammoModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 269
		ammoModel[139].setRotationPoint(9.6F, -2.2F, 2.7F);

		ammoModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F); // Box 270
		ammoModel[140].setRotationPoint(9.6F, -2.1F, 2.7F);

		ammoModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.45F, -0.45F, -0.52F, -0.45F, -0.4F, -0.49F, -0.44F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 271
		ammoModel[141].setRotationPoint(10.42F, -2.3F, 3F);

		ammoModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F, -0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F); // Box 272
		ammoModel[142].setRotationPoint(11F, -2.25F, 3F);

		ammoModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F, -0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F); // Box 273
		ammoModel[143].setRotationPoint(11F, -2.2F, 3F);

		ammoModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F, -0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F); // Box 274
		ammoModel[144].setRotationPoint(11F, -2.15F, 3F);

		ammoModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F); // Box 275
		ammoModel[145].setRotationPoint(10.75F, -2.15F, 3F);

		ammoModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F); // Box 276
		ammoModel[146].setRotationPoint(10.75F, -2.2F, 3F);

		ammoModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F); // Box 277
		ammoModel[147].setRotationPoint(10.75F, -2.25F, 3F);

		ammoModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 278
		ammoModel[148].setRotationPoint(10.55F, -2.3F, 3F);

		ammoModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 279
		ammoModel[149].setRotationPoint(10.55F, -2.2F, 3F);

		ammoModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F); // Box 280
		ammoModel[150].setRotationPoint(10.55F, -2.1F, 3F);

		ammoModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.46F, -0.45F, -0.52F, -0.46F, -0.4F, -0.49F, -0.44F); // Box 281
		ammoModel[151].setRotationPoint(10.42F, -2.1F, 3F);

		ammoModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 282
		ammoModel[152].setRotationPoint(10.42F, -2.2F, 3F);

		ammoModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 283
		ammoModel[153].setRotationPoint(9.6F, -2.3F, 3F);

		ammoModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 284
		ammoModel[154].setRotationPoint(9.6F, -2.2F, 3F);

		ammoModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F); // Box 285
		ammoModel[155].setRotationPoint(9.6F, -2.1F, 3F);

		ammoModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.45F, -0.45F, -0.52F, -0.45F, -0.4F, -0.49F, -0.44F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 286
		ammoModel[156].setRotationPoint(10.42F, -2.3F, 3.3F);

		ammoModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F, -0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F); // Box 287
		ammoModel[157].setRotationPoint(11F, -2.25F, 3.3F);

		ammoModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F, -0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F); // Box 288
		ammoModel[158].setRotationPoint(11F, -2.2F, 3.3F);

		ammoModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F, -0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F); // Box 289
		ammoModel[159].setRotationPoint(11F, -2.15F, 3.3F);

		ammoModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F); // Box 290
		ammoModel[160].setRotationPoint(10.75F, -2.15F, 3.3F);

		ammoModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F); // Box 291
		ammoModel[161].setRotationPoint(10.75F, -2.2F, 3.3F);

		ammoModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F); // Box 292
		ammoModel[162].setRotationPoint(10.75F, -2.25F, 3.3F);

		ammoModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 293
		ammoModel[163].setRotationPoint(10.55F, -2.3F, 3.3F);

		ammoModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 294
		ammoModel[164].setRotationPoint(10.55F, -2.2F, 3.3F);

		ammoModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F); // Box 295
		ammoModel[165].setRotationPoint(10.55F, -2.1F, 3.3F);

		ammoModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.46F, -0.45F, -0.52F, -0.46F, -0.4F, -0.49F, -0.44F); // Box 296
		ammoModel[166].setRotationPoint(10.42F, -2.1F, 3.3F);

		ammoModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 297
		ammoModel[167].setRotationPoint(10.42F, -2.2F, 3.3F);

		ammoModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 298
		ammoModel[168].setRotationPoint(9.6F, -2.3F, 3.3F);

		ammoModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 299
		ammoModel[169].setRotationPoint(9.6F, -2.2F, 3.3F);

		ammoModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F); // Box 300
		ammoModel[170].setRotationPoint(9.6F, -2.1F, 3.3F);

		ammoModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.45F, -0.45F, -0.52F, -0.45F, -0.4F, -0.49F, -0.44F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 301
		ammoModel[171].setRotationPoint(10.42F, -2.3F, 3.6F);

		ammoModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F, -0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F); // Box 302
		ammoModel[172].setRotationPoint(11F, -2.25F, 3.6F);

		ammoModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F, -0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F); // Box 303
		ammoModel[173].setRotationPoint(11F, -2.2F, 3.6F);

		ammoModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F, -0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F); // Box 304
		ammoModel[174].setRotationPoint(11F, -2.15F, 3.6F);

		ammoModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F); // Box 305
		ammoModel[175].setRotationPoint(10.75F, -2.15F, 3.6F);

		ammoModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F); // Box 306
		ammoModel[176].setRotationPoint(10.75F, -2.2F, 3.6F);

		ammoModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F); // Box 307
		ammoModel[177].setRotationPoint(10.75F, -2.25F, 3.6F);

		ammoModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 308
		ammoModel[178].setRotationPoint(10.55F, -2.3F, 3.6F);

		ammoModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 309
		ammoModel[179].setRotationPoint(10.55F, -2.2F, 3.6F);

		ammoModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F); // Box 310
		ammoModel[180].setRotationPoint(10.55F, -2.1F, 3.6F);

		ammoModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.46F, -0.45F, -0.52F, -0.46F, -0.4F, -0.49F, -0.44F); // Box 311
		ammoModel[181].setRotationPoint(10.42F, -2.1F, 3.6F);

		ammoModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 312
		ammoModel[182].setRotationPoint(10.42F, -2.2F, 3.6F);

		ammoModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 313
		ammoModel[183].setRotationPoint(9.6F, -2.3F, 3.6F);

		ammoModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 314
		ammoModel[184].setRotationPoint(9.6F, -2.2F, 3.6F);

		ammoModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F); // Box 315
		ammoModel[185].setRotationPoint(9.6F, -2.1F, 3.6F);

		ammoModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.45F, -0.45F, -0.52F, -0.45F, -0.4F, -0.49F, -0.44F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 316
		ammoModel[186].setRotationPoint(10.42F, -2.3F, 3.9F);

		ammoModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F, -0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F); // Box 317
		ammoModel[187].setRotationPoint(11F, -2.25F, 3.9F);

		ammoModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F, -0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F); // Box 318
		ammoModel[188].setRotationPoint(11F, -2.2F, 3.9F);

		ammoModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F, -0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F); // Box 319
		ammoModel[189].setRotationPoint(11F, -2.15F, 3.9F);

		ammoModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F); // Box 320
		ammoModel[190].setRotationPoint(10.75F, -2.15F, 3.9F);

		ammoModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F); // Box 321
		ammoModel[191].setRotationPoint(10.75F, -2.2F, 3.9F);

		ammoModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F); // Box 322
		ammoModel[192].setRotationPoint(10.75F, -2.25F, 3.9F);

		ammoModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 323
		ammoModel[193].setRotationPoint(10.55F, -2.3F, 3.9F);

		ammoModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 324
		ammoModel[194].setRotationPoint(10.55F, -2.2F, 3.9F);

		ammoModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F); // Box 325
		ammoModel[195].setRotationPoint(10.55F, -2.1F, 3.9F);

		ammoModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.46F, -0.45F, -0.52F, -0.46F, -0.4F, -0.49F, -0.44F); // Box 326
		ammoModel[196].setRotationPoint(10.42F, -2.1F, 3.9F);

		ammoModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 327
		ammoModel[197].setRotationPoint(10.42F, -2.2F, 3.9F);

		ammoModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 328
		ammoModel[198].setRotationPoint(9.6F, -2.3F, 3.9F);

		ammoModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 329
		ammoModel[199].setRotationPoint(9.6F, -2.2F, 3.9F);

		ammoModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F); // Box 330
		ammoModel[200].setRotationPoint(9.6F, -2.1F, 3.9F);

		ammoModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.45F, -0.45F, -0.52F, -0.45F, -0.4F, -0.49F, -0.44F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 331
		ammoModel[201].setRotationPoint(10.42F, -2.3F, 4.2F);

		ammoModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F, -0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F); // Box 332
		ammoModel[202].setRotationPoint(11F, -2.25F, 4.2F);

		ammoModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F, -0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F); // Box 333
		ammoModel[203].setRotationPoint(11F, -2.2F, 4.2F);

		ammoModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F, -0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F); // Box 334
		ammoModel[204].setRotationPoint(11F, -2.15F, 4.2F);

		ammoModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F); // Box 335
		ammoModel[205].setRotationPoint(10.75F, -2.15F, 4.2F);

		ammoModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F); // Box 336
		ammoModel[206].setRotationPoint(10.75F, -2.2F, 4.2F);

		ammoModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F); // Box 337
		ammoModel[207].setRotationPoint(10.75F, -2.25F, 4.2F);

		ammoModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 338
		ammoModel[208].setRotationPoint(10.55F, -2.3F, 4.2F);

		ammoModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 339
		ammoModel[209].setRotationPoint(10.55F, -2.2F, 4.2F);

		ammoModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F); // Box 340
		ammoModel[210].setRotationPoint(10.55F, -2.1F, 4.2F);

		ammoModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.46F, -0.45F, -0.52F, -0.46F, -0.4F, -0.49F, -0.44F); // Box 341
		ammoModel[211].setRotationPoint(10.42F, -2.1F, 4.2F);

		ammoModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 342
		ammoModel[212].setRotationPoint(10.42F, -2.2F, 4.2F);

		ammoModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 343
		ammoModel[213].setRotationPoint(9.6F, -2.3F, 4.2F);

		ammoModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 344
		ammoModel[214].setRotationPoint(9.6F, -2.2F, 4.2F);

		ammoModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F); // Box 345
		ammoModel[215].setRotationPoint(9.6F, -2.1F, 4.2F);

		ammoModel[216].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.45F, -0.45F, -0.52F, -0.45F, -0.4F, -0.49F, -0.44F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 346
		ammoModel[216].setRotationPoint(10.42F, -2.3F, 4.5F);

		ammoModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F, -0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F); // Box 347
		ammoModel[217].setRotationPoint(11F, -2.25F, 4.5F);

		ammoModel[218].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F, -0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F); // Box 348
		ammoModel[218].setRotationPoint(11F, -2.2F, 4.5F);

		ammoModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F, -0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F); // Box 349
		ammoModel[219].setRotationPoint(11F, -2.15F, 4.5F);

		ammoModel[220].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F); // Box 350
		ammoModel[220].setRotationPoint(10.75F, -2.15F, 4.5F);

		ammoModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F); // Box 351
		ammoModel[221].setRotationPoint(10.75F, -2.2F, 4.5F);

		ammoModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F); // Box 352
		ammoModel[222].setRotationPoint(10.75F, -2.25F, 4.5F);

		ammoModel[223].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 353
		ammoModel[223].setRotationPoint(10.55F, -2.3F, 4.5F);

		ammoModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 354
		ammoModel[224].setRotationPoint(10.55F, -2.2F, 4.5F);

		ammoModel[225].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F); // Box 355
		ammoModel[225].setRotationPoint(10.55F, -2.1F, 4.5F);

		ammoModel[226].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.46F, -0.45F, -0.52F, -0.46F, -0.4F, -0.49F, -0.44F); // Box 356
		ammoModel[226].setRotationPoint(10.42F, -2.1F, 4.5F);

		ammoModel[227].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 357
		ammoModel[227].setRotationPoint(10.42F, -2.2F, 4.5F);

		ammoModel[228].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 358
		ammoModel[228].setRotationPoint(9.6F, -2.3F, 4.5F);

		ammoModel[229].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 359
		ammoModel[229].setRotationPoint(9.6F, -2.2F, 4.5F);

		ammoModel[230].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F); // Box 360
		ammoModel[230].setRotationPoint(9.6F, -2.1F, 4.5F);

		ammoModel[231].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.45F, -0.45F, -0.52F, -0.45F, -0.4F, -0.49F, -0.44F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 361
		ammoModel[231].setRotationPoint(10.42F, -2.3F, 4.8F);

		ammoModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F, -0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F); // Box 362
		ammoModel[232].setRotationPoint(11F, -2.25F, 4.8F);

		ammoModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F, -0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F); // Box 363
		ammoModel[233].setRotationPoint(11F, -2.2F, 4.8F);

		ammoModel[234].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F, -0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F); // Box 364
		ammoModel[234].setRotationPoint(11F, -2.15F, 4.8F);

		ammoModel[235].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F); // Box 365
		ammoModel[235].setRotationPoint(10.75F, -2.15F, 4.8F);

		ammoModel[236].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F); // Box 366
		ammoModel[236].setRotationPoint(10.75F, -2.2F, 4.8F);

		ammoModel[237].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F); // Box 367
		ammoModel[237].setRotationPoint(10.75F, -2.25F, 4.8F);

		ammoModel[238].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 368
		ammoModel[238].setRotationPoint(10.55F, -2.3F, 4.8F);

		ammoModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 369
		ammoModel[239].setRotationPoint(10.55F, -2.2F, 4.8F);

		ammoModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F); // Box 370
		ammoModel[240].setRotationPoint(10.55F, -2.1F, 4.8F);

		ammoModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.46F, -0.45F, -0.52F, -0.46F, -0.4F, -0.49F, -0.44F); // Box 371
		ammoModel[241].setRotationPoint(10.42F, -2.1F, 4.8F);

		ammoModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 372
		ammoModel[242].setRotationPoint(10.42F, -2.2F, 4.8F);

		ammoModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 373
		ammoModel[243].setRotationPoint(9.6F, -2.3F, 4.8F);

		ammoModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 374
		ammoModel[244].setRotationPoint(9.6F, -2.2F, 4.8F);

		ammoModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F); // Box 375
		ammoModel[245].setRotationPoint(9.6F, -2.1F, 4.8F);

		ammoModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.45F, -0.45F, -0.52F, -0.45F, -0.4F, -0.49F, -0.44F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 376
		ammoModel[246].setRotationPoint(10.42F, -2.3F, 5.1F);

		ammoModel[247].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F, -0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F); // Box 377
		ammoModel[247].setRotationPoint(11F, -2.25F, 5.1F);

		ammoModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F, -0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F); // Box 378
		ammoModel[248].setRotationPoint(11F, -2.2F, 5.1F);

		ammoModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F, -0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F); // Box 379
		ammoModel[249].setRotationPoint(11F, -2.15F, 5.1F);

		ammoModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F); // Box 380
		ammoModel[250].setRotationPoint(10.75F, -2.15F, 5.1F);

		ammoModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F); // Box 381
		ammoModel[251].setRotationPoint(10.75F, -2.2F, 5.1F);

		ammoModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F); // Box 382
		ammoModel[252].setRotationPoint(10.75F, -2.25F, 5.1F);

		ammoModel[253].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 383
		ammoModel[253].setRotationPoint(10.55F, -2.3F, 5.1F);

		ammoModel[254].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 384
		ammoModel[254].setRotationPoint(10.55F, -2.2F, 5.1F);

		ammoModel[255].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F); // Box 385
		ammoModel[255].setRotationPoint(10.55F, -2.1F, 5.1F);

		ammoModel[256].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.46F, -0.45F, -0.52F, -0.46F, -0.4F, -0.49F, -0.44F); // Box 386
		ammoModel[256].setRotationPoint(10.42F, -2.1F, 5.1F);

		ammoModel[257].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 387
		ammoModel[257].setRotationPoint(10.42F, -2.2F, 5.1F);

		ammoModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 388
		ammoModel[258].setRotationPoint(9.6F, -2.3F, 5.1F);

		ammoModel[259].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 389
		ammoModel[259].setRotationPoint(9.6F, -2.2F, 5.1F);

		ammoModel[260].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F); // Box 390
		ammoModel[260].setRotationPoint(9.6F, -2.1F, 5.1F);

		ammoModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.45F, -0.45F, -0.52F, -0.45F, -0.4F, -0.49F, -0.44F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 391
		ammoModel[261].setRotationPoint(10.42F, -2.3F, 5.4F);

		ammoModel[262].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F, -0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F); // Box 392
		ammoModel[262].setRotationPoint(11F, -2.25F, 5.4F);

		ammoModel[263].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F, -0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F); // Box 393
		ammoModel[263].setRotationPoint(11F, -2.2F, 5.4F);

		ammoModel[264].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F, -0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F); // Box 394
		ammoModel[264].setRotationPoint(11F, -2.15F, 5.4F);

		ammoModel[265].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F); // Box 395
		ammoModel[265].setRotationPoint(10.75F, -2.15F, 5.4F);

		ammoModel[266].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F); // Box 396
		ammoModel[266].setRotationPoint(10.75F, -2.2F, 5.4F);

		ammoModel[267].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F); // Box 397
		ammoModel[267].setRotationPoint(10.75F, -2.25F, 5.4F);

		ammoModel[268].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 398
		ammoModel[268].setRotationPoint(10.55F, -2.3F, 5.4F);

		ammoModel[269].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 399
		ammoModel[269].setRotationPoint(10.55F, -2.2F, 5.4F);

		ammoModel[270].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F); // Box 400
		ammoModel[270].setRotationPoint(10.55F, -2.1F, 5.4F);

		ammoModel[271].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.46F, -0.45F, -0.52F, -0.46F, -0.4F, -0.49F, -0.44F); // Box 401
		ammoModel[271].setRotationPoint(10.42F, -2.1F, 5.4F);

		ammoModel[272].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 402
		ammoModel[272].setRotationPoint(10.42F, -2.2F, 5.4F);

		ammoModel[273].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 403
		ammoModel[273].setRotationPoint(9.6F, -2.3F, 5.4F);

		ammoModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 404
		ammoModel[274].setRotationPoint(9.6F, -2.2F, 5.4F);

		ammoModel[275].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F); // Box 405
		ammoModel[275].setRotationPoint(9.6F, -2.1F, 5.4F);

		ammoModel[276].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.45F, -0.45F, -0.52F, -0.45F, -0.4F, -0.49F, -0.44F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 406
		ammoModel[276].setRotationPoint(10.42F, -2.3F, 5.7F);

		ammoModel[277].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F, -0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F); // Box 407
		ammoModel[277].setRotationPoint(11F, -2.25F, 5.7F);

		ammoModel[278].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F, -0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F); // Box 408
		ammoModel[278].setRotationPoint(11F, -2.2F, 5.7F);

		ammoModel[279].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F, -0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F); // Box 409
		ammoModel[279].setRotationPoint(11F, -2.15F, 5.7F);

		ammoModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F); // Box 410
		ammoModel[280].setRotationPoint(10.75F, -2.15F, 5.7F);

		ammoModel[281].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F); // Box 411
		ammoModel[281].setRotationPoint(10.75F, -2.2F, 5.7F);

		ammoModel[282].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F); // Box 412
		ammoModel[282].setRotationPoint(10.75F, -2.25F, 5.7F);

		ammoModel[283].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 413
		ammoModel[283].setRotationPoint(10.55F, -2.3F, 5.7F);

		ammoModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 414
		ammoModel[284].setRotationPoint(10.55F, -2.2F, 5.7F);

		ammoModel[285].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F); // Box 415
		ammoModel[285].setRotationPoint(10.55F, -2.1F, 5.7F);

		ammoModel[286].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.46F, -0.45F, -0.52F, -0.46F, -0.4F, -0.49F, -0.44F); // Box 416
		ammoModel[286].setRotationPoint(10.42F, -2.1F, 5.7F);

		ammoModel[287].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 417
		ammoModel[287].setRotationPoint(10.42F, -2.2F, 5.7F);

		ammoModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 418
		ammoModel[288].setRotationPoint(9.6F, -2.3F, 5.7F);

		ammoModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 419
		ammoModel[289].setRotationPoint(9.6F, -2.2F, 5.7F);

		ammoModel[290].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F); // Box 420
		ammoModel[290].setRotationPoint(9.6F, -2.1F, 5.7F);

		ammoModel[291].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.45F, -0.45F, -0.52F, -0.45F, -0.4F, -0.49F, -0.44F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 421
		ammoModel[291].setRotationPoint(10.42F, -2.3F, 6F);

		ammoModel[292].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F, -0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F); // Box 422
		ammoModel[292].setRotationPoint(11F, -2.25F, 6F);

		ammoModel[293].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F, -0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F); // Box 423
		ammoModel[293].setRotationPoint(11F, -2.2F, 6F);

		ammoModel[294].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F, -0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F); // Box 424
		ammoModel[294].setRotationPoint(11F, -2.15F, 6F);

		ammoModel[295].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F); // Box 425
		ammoModel[295].setRotationPoint(10.75F, -2.15F, 6F);

		ammoModel[296].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F); // Box 426
		ammoModel[296].setRotationPoint(10.75F, -2.2F, 6F);

		ammoModel[297].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F); // Box 427
		ammoModel[297].setRotationPoint(10.75F, -2.25F, 6F);

		ammoModel[298].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 428
		ammoModel[298].setRotationPoint(10.55F, -2.3F, 6F);

		ammoModel[299].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 429
		ammoModel[299].setRotationPoint(10.55F, -2.2F, 6F);

		ammoModel[300].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F); // Box 430
		ammoModel[300].setRotationPoint(10.55F, -2.1F, 6F);

		ammoModel[301].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.46F, -0.45F, -0.52F, -0.46F, -0.4F, -0.49F, -0.44F); // Box 431
		ammoModel[301].setRotationPoint(10.42F, -2.1F, 6F);

		ammoModel[302].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 432
		ammoModel[302].setRotationPoint(10.42F, -2.2F, 6F);

		ammoModel[303].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 433
		ammoModel[303].setRotationPoint(9.6F, -2.3F, 6F);

		ammoModel[304].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 434
		ammoModel[304].setRotationPoint(9.6F, -2.2F, 6F);

		ammoModel[305].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F); // Box 435
		ammoModel[305].setRotationPoint(9.6F, -2.1F, 6F);

		ammoModel[306].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F); // Box 436
		ammoModel[306].setRotationPoint(9F, -2F, 1.5F);

		ammoModel[307].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F); // Box 437
		ammoModel[307].setRotationPoint(9F, 1F, 1.5F);

		ammoModel[308].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F); // Box 438
		ammoModel[308].setRotationPoint(11.3F, -2F, 1.15F);

		ammoModel[309].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F); // Box 439
		ammoModel[309].setRotationPoint(9F, -2F, 5.85F);

		ammoModel[310].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F); // Box 440
		ammoModel[310].setRotationPoint(9F, -1.5F, 1.6F);

		ammoModel[311].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F); // Box 441
		ammoModel[311].setRotationPoint(9F, -1.5F, 5.4F);

		ammoModel[312].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.4F, -0.35F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.35F, -0.25F); // Box 442
		ammoModel[312].setRotationPoint(9F, -1.5F, 2F);

		ammoModel[313].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.4F, -0.35F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.35F, -0.25F); // Box 443
		ammoModel[313].setRotationPoint(9F, 0.5F, 2F);

		ammoModel[314].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F); // Box 444
		ammoModel[314].setRotationPoint(11.3F, -2F, 1.5F);

		ammoModel[315].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F); // Box 445
		ammoModel[315].setRotationPoint(11.3F, -2F, 5.85F);

		ammoModel[316].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F); // Box 446
		ammoModel[316].setRotationPoint(11.3F, 1F, 1.5F);

		ammoModel[317].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F); // Box 447
		ammoModel[317].setRotationPoint(11.3F, -1.5F, 5.3F);

		ammoModel[318].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F); // Box 448
		ammoModel[318].setRotationPoint(11.3F, -1.5F, 2F);

		ammoModel[319].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F); // Box 449
		ammoModel[319].setRotationPoint(11.3F, -1.5F, 1.7F);

		ammoModel[320].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F); // Box 450
		ammoModel[320].setRotationPoint(11.3F, 0.5F, 2F);

		ammoModel[321].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F); // Box 451
		ammoModel[321].setRotationPoint(9F, -2F, 1.15F);

		ammoModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Box 452
		ammoModel[322].setRotationPoint(9F, -1.02F, 4.95F);

		ammoModel[323].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Box 453
		ammoModel[323].setRotationPoint(9F, -1F, 4.6F);

		ammoModel[324].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Box 454
		ammoModel[324].setRotationPoint(9F, -1F, 4.35F);

		ammoModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Box 455
		ammoModel[325].setRotationPoint(9F, -1.05F, 4.15F);

		ammoModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F); // Box 456
		ammoModel[326].setRotationPoint(9F, -1.15F, 4.8F);

		ammoModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F); // Box 457
		ammoModel[327].setRotationPoint(9F, -0.9F, 4.85F);

		ammoModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F); // Box 458
		ammoModel[328].setRotationPoint(9F, -1.15F, 4.5F);

		ammoModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F); // Box 459
		ammoModel[329].setRotationPoint(9F, -0.9F, 4.05F);

		ammoModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.47F, -0.4F, -0.4F, -0.47F, -0.4F, -0.4F, -0.47F, -0.4F, -0.4F, -0.47F, -0.4F, -0.4F, -0.47F, -0.4F, -0.4F, -0.47F, -0.4F, -0.4F, -0.47F, -0.4F, -0.4F, -0.47F, -0.4F); // Box 460
		ammoModel[330].setRotationPoint(9F, -1F, 4.5F);

		ammoModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F); // Box 461
		ammoModel[331].setRotationPoint(9F, -0.9F, 3.75F);

		ammoModel[332].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F); // Box 462
		ammoModel[332].setRotationPoint(9F, -0.9F, 3.45F);

		ammoModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.47F, -0.4F, -0.4F, -0.47F, -0.4F, -0.4F, -0.47F, -0.4F, -0.4F, -0.47F, -0.4F, -0.4F, -0.47F, -0.4F, -0.4F, -0.47F, -0.4F, -0.4F, -0.47F, -0.4F, -0.4F, -0.47F, -0.4F); // Box 463
		ammoModel[333].setRotationPoint(9F, -1.03F, 3.45F);

		ammoModel[334].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F); // Box 464
		ammoModel[334].setRotationPoint(9F, -1.15F, 3.45F);

		ammoModel[335].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Box 465
		ammoModel[335].setRotationPoint(9F, -1.02F, 3.35F);

		ammoModel[336].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Box 466
		ammoModel[336].setRotationPoint(9F, -1.02F, 3.15F);

		ammoModel[337].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Box 467
		ammoModel[337].setRotationPoint(9F, -1.02F, 2.95F);

		ammoModel[338].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F); // Box 468
		ammoModel[338].setRotationPoint(9F, -1.15F, 3.05F);

		ammoModel[339].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F); // Box 469
		ammoModel[339].setRotationPoint(9F, -0.9F, 3.05F);

		ammoModel[340].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F); // Box 470
		ammoModel[340].setRotationPoint(9F, -1F, 2.7F);

		ammoModel[341].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F); // Box 472
		ammoModel[341].setRotationPoint(9F, -1F, 2.55F);

		ammoModel[342].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F); // Box 473
		ammoModel[342].setRotationPoint(9F, -1F, 2.4F);

		ammoModel[343].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F); // Box 474
		ammoModel[343].setRotationPoint(9F, -1.15F, 2.55F);

		ammoModel[344].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Box 475
		ammoModel[344].setRotationPoint(9F, -1F, 2.1F);

		ammoModel[345].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 476
		ammoModel[345].setRotationPoint(9F, -1.15F, 2.15F);

		ammoModel[346].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Box 477
		ammoModel[346].setRotationPoint(9F, -0.5F, 5.15F);

		ammoModel[347].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Box 478
		ammoModel[347].setRotationPoint(9F, -0.5F, 4.95F);

		ammoModel[348].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.47F, -0.4F, -0.4F, -0.47F, -0.4F, -0.4F, -0.47F, -0.4F, -0.4F, -0.47F, -0.4F, -0.4F, -0.47F, -0.4F, -0.4F, -0.47F, -0.4F, -0.4F, -0.47F, -0.4F, -0.4F, -0.47F, -0.4F); // Box 479
		ammoModel[348].setRotationPoint(9F, -0.5F, 5.05F);

		ammoModel[349].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F); // Box 480
		ammoModel[349].setRotationPoint(9F, -0.65F, 5.05F);

		ammoModel[350].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F); // Box 481
		ammoModel[350].setRotationPoint(9F, -0.5F, 4.8F);

		ammoModel[351].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F); // Box 482
		ammoModel[351].setRotationPoint(9F, -0.5F, 4.65F);

		ammoModel[352].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F); // Box 483
		ammoModel[352].setRotationPoint(9F, -0.5F, 4.5F);

		ammoModel[353].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F); // Box 484
		ammoModel[353].setRotationPoint(9F, -0.65F, 4.65F);

		ammoModel[354].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F); // Box 485
		ammoModel[354].setRotationPoint(9F, -0.5F, 4.4F);

		ammoModel[355].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F); // Box 486
		ammoModel[355].setRotationPoint(9F, -0.5F, 4.25F);

		ammoModel[356].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F); // Box 487
		ammoModel[356].setRotationPoint(9F, -0.5F, 4.1F);

		ammoModel[357].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F); // Box 488
		ammoModel[357].setRotationPoint(9F, -0.65F, 4.25F);

		ammoModel[358].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Box 489
		ammoModel[358].setRotationPoint(9F, -0.53F, 3.77F);

		ammoModel[359].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F); // Box 490
		ammoModel[359].setRotationPoint(9F, -0.4F, 3.84F);

		ammoModel[360].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Box 492
		ammoModel[360].setRotationPoint(9F, -0.53F, 3.95F);

		ammoModel[361].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Box 493
		ammoModel[361].setRotationPoint(9F, -0.51F, 3.6F);

		ammoModel[362].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Box 494
		ammoModel[362].setRotationPoint(9F, -0.51F, 3.4F);

		ammoModel[363].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.6F, -0.4F, -0.35F, -0.6F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Box 495
		ammoModel[363].setRotationPoint(9F, -0.51F, 3.4F);

		ammoModel[364].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Box 496
		ammoModel[364].setRotationPoint(9F, -0.51F, 3.2F);

		ammoModel[365].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Box 497
		ammoModel[365].setRotationPoint(9F, -0.51F, 2.95F);

		ammoModel[366].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F); // Box 498
		ammoModel[366].setRotationPoint(9F, -0.63F, 2.95F);

		ammoModel[367].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Box 499
		ammoModel[367].setRotationPoint(9F, -0.51F, 2.7F);

		ammoModel[368].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Box 500
		ammoModel[368].setRotationPoint(9F, -0.51F, 2.5F);

		ammoModel[369].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F); // Box 501
		ammoModel[369].setRotationPoint(9F, -0.63F, 2.4F);

		ammoModel[370].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F); // Box 502
		ammoModel[370].setRotationPoint(9F, -0.4F, 2.4F);

		ammoModel[371].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Box 503
		ammoModel[371].setRotationPoint(9F, -0.51F, 2.3F);

		ammoModel[372].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Box 504
		ammoModel[372].setRotationPoint(9F, -0.51F, 1.9F);

		ammoModel[373].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.6F, -0.4F, -0.35F, -0.6F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Box 505
		ammoModel[373].setRotationPoint(9F, -0.51F, 1.9F);

		ammoModel[374].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Box 506
		ammoModel[374].setRotationPoint(9F, -0.51F, 2.1F);

		ammoModel[375].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Box 507
		ammoModel[375].setRotationPoint(9F, 0F, 3.65F);

		ammoModel[376].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Box 508
		ammoModel[376].setRotationPoint(9F, 0F, 3.43F);

		ammoModel[377].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F); // Box 509
		ammoModel[377].setRotationPoint(9F, -0.15F, 3.53F);

		ammoModel[378].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F); // Box 510
		ammoModel[378].setRotationPoint(9F, 0.12F, 3.5F);

		ammoModel[379].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Box 511
		ammoModel[379].setRotationPoint(9F, 0F, 4F);

		ammoModel[380].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F); // Box 512
		ammoModel[380].setRotationPoint(9F, -0.15F, 3.95F);

		ammoModel[381].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.4F, -0.4F, -0.48F, -0.4F, -0.4F, -0.48F, -0.4F, -0.4F, -0.48F, -0.4F, -0.4F, -0.48F, -0.4F, -0.4F, -0.48F, -0.4F, -0.4F, -0.48F, -0.4F, -0.4F, -0.48F, -0.4F); // Box 513
		ammoModel[381].setRotationPoint(9F, -0.01F, 3.95F);

		ammoModel[382].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F); // Box 514
		ammoModel[382].setRotationPoint(9F, 0.12F, 3.95F);

		ammoModel[383].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.43F, -0.45F, -0.4F, -0.43F, -0.45F, -0.4F, -0.43F, -0.45F, -0.4F, -0.43F, -0.45F, -0.4F, -0.43F, -0.45F, -0.4F, -0.43F, -0.45F, -0.4F, -0.43F, -0.45F, -0.4F, -0.43F, -0.45F); // Box 515
		ammoModel[383].setRotationPoint(9F, 0.05F, 3.85F);

		ammoModel[384].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.43F, -0.45F, -0.4F, -0.43F, -0.45F, -0.4F, -0.43F, -0.45F, -0.4F, -0.43F, -0.45F, -0.4F, -0.43F, -0.45F, -0.4F, -0.43F, -0.45F, -0.4F, -0.43F, -0.45F, -0.4F, -0.43F, -0.45F); // Box 516
		ammoModel[384].setRotationPoint(9F, -0.1F, 3.85F);

		ammoModel[385].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.33F, -0.6F, -0.4F, -0.33F, -0.6F, -0.4F, -0.33F, -0.3F, -0.4F, -0.33F, -0.3F, -0.4F, -0.33F, -0.45F, -0.4F, -0.33F, -0.45F, -0.4F, -0.33F, -0.45F, -0.4F, -0.33F, -0.45F); // Box 517
		ammoModel[385].setRotationPoint(9F, 0F, 3.1F);

		ammoModel[386].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.33F, -0.3F, -0.4F, -0.33F, -0.3F, -0.4F, -0.33F, -0.6F, -0.4F, -0.33F, -0.6F, -0.4F, -0.33F, -0.45F, -0.4F, -0.33F, -0.45F, -0.4F, -0.33F, -0.45F, -0.4F, -0.33F, -0.45F); // Box 518
		ammoModel[386].setRotationPoint(9F, 0F, 3.25F);
		
		gunSlideDistance = 1F;
		animationType = EnumAnimationType.SIDE_CLIP;

		translateAll(0F, -1.5F, 0F);
		
	}
}