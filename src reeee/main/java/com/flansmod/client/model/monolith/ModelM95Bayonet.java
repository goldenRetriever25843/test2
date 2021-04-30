//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 11.10.2017 - 18:59:21
// Last changed on: 11.10.2017 - 18:59:21

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelM95Bayonet extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelM95Bayonet() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[124];

		initgunModel_1();

		translateAll(0F, -2F, -0.5F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 7
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 8
		gunModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 9
		gunModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 10
		gunModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 11
		gunModel[5] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 12
		gunModel[6] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 13
		gunModel[7] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 13
		gunModel[8] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 13
		gunModel[9] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 13
		gunModel[10] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 13
		gunModel[11] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 13
		gunModel[12] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 19
		gunModel[13] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 20
		gunModel[14] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 21
		gunModel[15] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 22
		gunModel[16] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 0
		gunModel[17] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 1
		gunModel[18] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 2
		gunModel[19] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 3
		gunModel[20] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 4
		gunModel[21] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 5
		gunModel[22] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 6
		gunModel[23] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 7
		gunModel[24] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 0
		gunModel[25] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 1
		gunModel[26] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 2
		gunModel[27] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 4
		gunModel[28] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 5
		gunModel[29] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 6
		gunModel[30] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 7
		gunModel[31] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 8
		gunModel[32] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 10
		gunModel[33] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 11
		gunModel[34] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 12
		gunModel[35] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 0
		gunModel[36] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 2
		gunModel[37] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 3
		gunModel[38] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 4
		gunModel[39] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 5
		gunModel[40] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 6
		gunModel[41] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 9
		gunModel[42] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 0
		gunModel[43] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 2
		gunModel[44] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 3
		gunModel[45] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 4
		gunModel[46] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 5
		gunModel[47] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 6
		gunModel[48] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 6
		gunModel[49] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 6
		gunModel[50] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 6
		gunModel[51] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 6
		gunModel[52] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 6
		gunModel[53] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 12
		gunModel[54] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 13
		gunModel[55] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 15
		gunModel[56] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 16
		gunModel[57] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 17
		gunModel[58] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 18
		gunModel[59] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 19
		gunModel[60] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 20
		gunModel[61] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 21
		gunModel[62] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 22
		gunModel[63] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 24
		gunModel[64] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 25
		gunModel[65] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 26
		gunModel[66] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 27
		gunModel[67] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 28
		gunModel[68] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 29
		gunModel[69] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 30
		gunModel[70] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 31
		gunModel[71] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 32
		gunModel[72] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 33
		gunModel[73] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 33
		gunModel[74] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 33
		gunModel[75] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 33
		gunModel[76] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 33
		gunModel[77] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 33
		gunModel[78] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 33
		gunModel[79] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 41
		gunModel[80] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 43
		gunModel[81] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 44
		gunModel[82] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 45
		gunModel[83] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 46
		gunModel[84] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 47
		gunModel[85] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 48
		gunModel[86] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 49
		gunModel[87] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 50
		gunModel[88] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 1
		gunModel[89] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 2
		gunModel[90] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 3
		gunModel[91] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 4
		gunModel[92] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 5
		gunModel[93] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 6
		gunModel[94] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 7
		gunModel[95] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 8
		gunModel[96] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 9
		gunModel[97] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 10
		gunModel[98] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 11
		gunModel[99] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 12
		gunModel[100] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 13
		gunModel[101] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 15
		gunModel[102] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 16
		gunModel[103] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 17
		gunModel[104] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 14
		gunModel[105] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 20
		gunModel[106] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 20
		gunModel[107] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 20
		gunModel[108] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 20
		gunModel[109] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 26
		gunModel[110] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 27
		gunModel[111] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 28
		gunModel[112] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 29
		gunModel[113] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 13
		gunModel[114] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 31
		gunModel[115] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 32
		gunModel[116] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 33
		gunModel[117] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 0
		gunModel[118] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 1
		gunModel[119] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 1
		gunModel[120] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 3
		gunModel[121] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 19
		gunModel[122] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 2
		gunModel[123] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 5

		gunModel[0].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,-0.25F, -1.25F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F, -0.8F, 0F, -0.25F, -1.25F, 0F, -0.3F, 0F, -0.5F, -0.5F, -0.7F, -0.5F, -0.5F, -0.9F, -0.15F, -0.3F, -0.25F, -0.1F); // Box 7
		gunModel[0].setRotationPoint(-5F, -2.5F, 0F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.125F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.1F, -0.1F, -0.125F, -0.1F, -0.1F, -0.175F, -0.55F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, 0F, -0.175F, -0.55F, 0F); // Box 8
		gunModel[1].setRotationPoint(-5F, -2.5F, 0F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,-0.175F, -0.45F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.175F, -0.45F, 0F, -0.25F, -0.75F, -0.5F, -0.5F, -1.2F, -0.5F, -0.5F, -1.2F, 0F, -0.25F, -0.75F, 0F); // Box 9
		gunModel[2].setRotationPoint(-5F, -2.5F, 0F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.8F, -0.5F, 0.1F, -0.85F, -0.5F, 0.05F, -0.75F, -0.125F, -0.5F, -0.8F, 0F, -0.5F, -0.7F, -0.5F, -0.2F, -0.75F, -0.5F, -0.2F, -0.85F, -0.225F, -0.5F, -0.9F, -0.15F); // Box 10
		gunModel[3].setRotationPoint(0F, -2.5F, 0F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.25F, -0.5F, 0.575F, -0.25F, -0.5F, 0.275F, -0.25F, -0.125F, -0.5F, -0.25F, 0F, -0.5F, -1.2F, -0.5F, 0.1F, -1.15F, -0.5F, 0.05F, -1.25F, -0.125F, -0.5F, -1.2F, 0F); // Box 11
		gunModel[4].setRotationPoint(0F, -2.5F, 0F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0.15F, -0.5F, 0F, 0.05F, -0.125F, -0.5F, -0.1F, -0.1F, -0.5F, -0.75F, -0.5F, 0.575F, -0.75F, -0.5F, 0.275F, -0.75F, -0.125F, -0.5F, -0.75F, 0F); // Box 12
		gunModel[5].setRotationPoint(0F, -2.5F, 0F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,-0.25F, -1.25F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, -0.5F, -0.25F, -1.25F, -0.5F, -0.3F, -0.25F, -0.1F, -0.5F, -0.9F, -0.15F, -0.5F, -0.7F, -0.5F, -0.3F, 0F, -0.5F); // Box 13
		gunModel[6].setRotationPoint(-5F, -2.5F, 0F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.125F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.175F, -0.55F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.5F, -0.175F, -0.55F, -0.5F); // Box 13
		gunModel[7].setRotationPoint(-5F, -2.5F, 0F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,-0.175F, -0.45F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.175F, -0.45F, -0.5F, -0.25F, -0.75F, 0F, -0.5F, -1.2F, 0F, -0.5F, -1.2F, -0.5F, -0.25F, -0.75F, -0.5F); // Box 13
		gunModel[8].setRotationPoint(-5F, -2.5F, 0F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.8F, 0F, 0.05F, -0.75F, -0.125F, 0.1F, -0.85F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F, -0.9F, -0.15F, -0.2F, -0.85F, -0.225F, -0.2F, -0.75F, -0.5F, -0.5F, -0.7F, -0.5F); // Box 13
		gunModel[9].setRotationPoint(0F, -2.5F, 0F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.25F, 0F, 0.275F, -0.25F, -0.125F, 0.575F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -1.2F, 0F, 0.05F, -1.25F, -0.125F, 0.1F, -1.15F, -0.5F, -0.5F, -1.2F, -0.5F); // Box 13
		gunModel[10].setRotationPoint(0F, -2.5F, 0F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.1F, -0.1F, 0F, 0.05F, -0.1F, 0F, 0.15F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, 0F, 0.275F, -0.75F, -0.125F, 0.575F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F); // Box 13
		gunModel[11].setRotationPoint(0F, -2.5F, 0F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.05F, -0.5F, -0.7F, -0.05F); // Box 19
		gunModel[12].setRotationPoint(4F, -3F, 0F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.15F, -0.5F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, 0F, 0F, 0.05F, -0.125F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.725F, -0.125F, 0F, -0.725F, -0.125F); // Box 20
		gunModel[13].setRotationPoint(1F, -2.5F, 0F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, -0.5F, -0.3F, -0.5F, -0.5F, -0.225F, -0.125F, 0F, -0.225F, -0.125F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 21
		gunModel[14].setRotationPoint(1F, -3F, 0F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.2F, -0.5F, -0.5F, 0.2F, -0.5F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -0.5F, -0.5F, -0.7F, -0.5F); // Box 22
		gunModel[15].setRotationPoint(4F, -3F, 0F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.15F, 0F, -0.3F, 0F, 0F, 0F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.425F, -0.275F, 0F, -0.225F, -0.125F); // Box 0
		gunModel[16].setRotationPoint(5F, -3F, 0F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.15F, 0F, -0.2F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.525F, -0.275F, 0F, -0.425F, -0.275F); // Box 1
		gunModel[17].setRotationPoint(13F, -3F, 0F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0.075F, -0.5F, 0F, -0.025F, -0.5F, 0F, -0.175F, -0.275F, -0.25F, -0.125F, -0.225F, -0.25F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.225F, -0.25F, -0.7F, -0.125F); // Box 2
		gunModel[18].setRotationPoint(5F, -3F, 0F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, -0.08F, -0.28F, 0F, -0.08F, -0.28F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.15F); // Box 3
		gunModel[19].setRotationPoint(13F, -3F, 0F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -1F, 0.2F, -0.25F, -1F, 0.2F, -0.5F, 0.25F, -0.8F, 0F, 0.25F, -0.8F, 0F, 0.25F, 0.2F, -0.5F, 0.25F, 0.2F); // Box 4
		gunModel[20].setRotationPoint(1.5F, -2.5F, -0.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0.05F, -0.5F, 0F, 0.1F, -0.5F, 0F, -0.08F, -0.28F, 0F, -0.08F, -0.2F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.15F, 0F, -0.7F, -0.02F); // Box 5
		gunModel[21].setRotationPoint(6F, -3F, 0F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.225F, -0.125F, -0.5F, -0.225F, -0.125F); // Box 6
		gunModel[22].setRotationPoint(1F, -3F, 0F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.05F, -0.125F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, -0.5F, 0F, 0.15F, -0.5F, 0F, -0.725F, -0.125F, -0.5F, -0.725F, -0.125F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 7
		gunModel[23].setRotationPoint(1F, -2.5F, 0F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.8F, -0.75F, 0F, -0.8F, -0.75F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.25F, -0.8F, -0.75F, -0.25F, -0.8F, -0.75F, -0.25F, 0.2F, 0F, -0.25F, 0.2F); // Box 0
		gunModel[24].setRotationPoint(1.5F, -2.5F, -0.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, -0.8F, -0.75F, -0.75F, -0.8F, -0.75F, -0.75F, 0.2F, 0F, -0.75F, 0.2F, -0.25F, 0F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0F, 0.2F, -0.25F, 0F, 0.2F); // Box 1
		gunModel[25].setRotationPoint(1.5F, -2.5F, -0.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, -0.75F, -0.8F, 0F, -0.75F, -0.8F, 0F, -0.75F, 0.2F, -0.75F, -0.75F, 0.2F, -0.5F, 0F, -0.8F, -0.25F, 0F, -0.8F, -0.25F, 0F, 0.2F, -0.5F, 0F, 0.2F); // Box 2
		gunModel[26].setRotationPoint(1.75F, -2.5F, -0.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.25F, -0.9F, -0.9F, -0.15F, -0.9F, -0.9F, -0.15F, 0.1F, 0F, -0.25F, 0.1F); // Box 4
		gunModel[27].setRotationPoint(2F, -2.5F, -0.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.375F, -0.675F, 0F, 0.5F, -0.675F, 0F, 0.5F, 0.325F, 0F, 0.375F, 0.325F, 0F, -0.75F, -0.675F, -0.25F, -0.875F, -0.675F, -0.25F, -0.875F, 0.325F, 0F, -0.75F, 0.325F); // Box 5
		gunModel[28].setRotationPoint(3.5F, -1.5F, -0.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.675F, 0F, 0F, -0.675F, 0F, 0F, 0.325F, 0F, 0F, 0.325F, 0F, -1.25F, -0.675F, 0F, -1.5F, -0.675F, 0F, -1.5F, 0.325F, 0F, -1.25F, 0.325F); // Box 6
		gunModel[29].setRotationPoint(2.5F, -2.5F, -0.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, -0.675F, 0F, 0.375F, -0.675F, 0F, 0.375F, 0.325F, 0F, 0.25F, 0.325F, 0F, -0.875F, -0.675F, -0.75F, -0.75F, -0.675F, -0.75F, -0.75F, 0.325F, 0F, -0.875F, 0.325F); // Box 7
		gunModel[30].setRotationPoint(2.5F, -1.5F, -0.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, -0.675F, 0F, 0.375F, -0.675F, 0F, 0.375F, 0.325F, 0F, 0.25F, 0.325F, -0.25F, -0.75F, -0.675F, 0F, -0.75F, -0.675F, 0F, -0.75F, 0.325F, -0.25F, -0.75F, 0.325F); // Box 8
		gunModel[31].setRotationPoint(2.5F, -1.5F, -0.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.075F, -0.325F, -0.5F, -0.075F, -0.325F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F); // Box 10
		gunModel[32].setRotationPoint(1F, -3.15F, 0F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, -0.075F, -0.325F, -0.5F, -0.075F, -0.325F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F); // Box 11
		gunModel[33].setRotationPoint(1F, -3.15F, 0F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.075F, -0.325F, -0.5F, -0.075F, -0.325F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 12
		gunModel[34].setRotationPoint(1F, -3.65F, 0F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.075F, -0.325F, -0.5F, -0.075F, -0.325F); // Box 0
		gunModel[35].setRotationPoint(1F, -3.65F, 0F);

		gunModel[36].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,-0.125F, -0.125F, 0F, -0.75F, -0.075F, 0F, -0.75F, -0.075F, 0F, -0.125F, -0.125F, 0F, -0.075F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.075F, -0.75F, 0F); // Box 2
		gunModel[36].setRotationPoint(1.5F, -3.15F, 0F);

		gunModel[37].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,-0.075F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.075F, -0.75F, 0F, -0.125F, -0.125F, 0F, -0.75F, -0.075F, 0F, -0.75F, -0.075F, 0F, -0.125F, -0.125F, 0F); // Box 3
		gunModel[37].setRotationPoint(1.5F, -3.65F, 0F);

		gunModel[38].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,-0.75F, -0.75F, 0F, -0.075F, -0.75F, 0F, -0.075F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.075F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.75F, -0.075F, 0F); // Box 4
		gunModel[38].setRotationPoint(1F, -3.65F, 0F);

		gunModel[39].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,-0.75F, -0.075F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.75F, -0.075F, 0F, -0.75F, -0.75F, 0F, -0.075F, -0.75F, 0F, -0.075F, -0.75F, 0F, -0.75F, -0.75F, 0F); // Box 5
		gunModel[39].setRotationPoint(1F, -3.15F, 0F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.05F, 0F, -0.7F, -0.05F); // Box 6
		gunModel[40].setRotationPoint(2F, -3F, 0F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 9
		gunModel[41].setRotationPoint(2F, -3.65F, 0F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.15F, -0.5F, -0.75F, 0.15F, -0.5F, -0.75F, -0.05F, -0.15F, 0F, -0.05F, -0.15F, 0F, -0.7F, -0.5F, -0.75F, -0.7F, -0.5F, -0.75F, -0.7F, -0.05F, 0F, -0.7F, -0.05F); // Box 0
		gunModel[42].setRotationPoint(5F, -3F, 0F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.375F, 0.04F, -0.5F, -0.125F, 0.04F, -0.5F, -0.125F, 0F, -0.46F, 0.375F, 0F, -0.46F, 0.375F, -0.9F, -0.5F, -0.125F, -0.9F, -0.5F, -0.125F, -0.9F, -0.45F, 0.375F, -0.9F, -0.45F); // Box 2
		gunModel[43].setRotationPoint(19F, -2.2F, 0F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.875F, -0.9F, -0.5F, 0F, -0.9F, -0.5F, 0F, -0.9F, -0.445F, -0.875F, -0.9F, -0.445F, -0.875F, 0.045F, -0.5F, 0F, 0.045F, -0.5F, 0F, 0.005F, -0.455F, -0.875F, 0.005F, -0.455F); // Box 3
		gunModel[44].setRotationPoint(19F, -3F, 0F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.825F, -0.325F, 0F, -0.825F, -0.325F, 0F, -0.825F, -0.5F, 0F, -0.825F, -0.5F, 0F, -0.05F, -0.375F, 0F, -0.05F, -0.375F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 4
		gunModel[45].setRotationPoint(19F, -3.64F, 0F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.05F, -0.49F, 1.5F, -0.05F, -0.49F, 1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.9F, -0.49F, 2F, -0.9F, -0.49F, 2F, -0.9F, -0.5F, 0F, -0.9F, -0.5F); // Box 5
		gunModel[46].setRotationPoint(19F, -2.2F, 0F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.225F, -0.125F, 0F, -0.425F, -0.275F, 0F, -0.2F, -0.5F, 0F, 0F, -0.5F); // Box 6
		gunModel[47].setRotationPoint(5F, -3F, 0F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.3F, -0.15F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.425F, -0.275F, 0F, -0.525F, -0.275F, 0F, -0.3F, -0.5F, 0F, -0.2F, -0.5F); // Box 6
		gunModel[48].setRotationPoint(13F, -3F, 0F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.125F, -0.225F, 0F, -0.175F, -0.275F, 0F, -0.025F, -0.5F, -0.25F, 0.075F, -0.5F, -0.25F, -0.7F, -0.125F, 0F, -0.7F, -0.225F, 0F, -0.7F, -0.5F, -0.25F, -0.7F, -0.5F); // Box 6
		gunModel[49].setRotationPoint(5F, -3F, 0F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.08F, -0.28F, 0F, -0.08F, -0.28F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, -0.7F, -0.15F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F); // Box 6
		gunModel[50].setRotationPoint(13F, -3F, 0F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.08F, -0.2F, 0F, -0.08F, -0.28F, 0F, 0.1F, -0.5F, 0F, 0.05F, -0.5F, 0F, -0.7F, -0.02F, 0F, -0.7F, -0.15F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F); // Box 6
		gunModel[51].setRotationPoint(6F, -3F, 0F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.05F, -0.15F, -0.75F, -0.05F, -0.15F, -0.75F, 0.15F, -0.5F, 0F, 0.15F, -0.5F, 0F, -0.7F, -0.05F, -0.75F, -0.7F, -0.05F, -0.75F, -0.7F, -0.5F, 0F, -0.7F, -0.5F); // Box 6
		gunModel[52].setRotationPoint(5F, -3F, 0F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0.13F, -0.5F, -0.3F, 0.13F, -0.5F, -0.3F, -0.05F, -0.25F, -0.3F, -0.05F, -0.25F, -0.3F, -0.7F, -0.5F, -0.3F, -0.7F, -0.5F, -0.3F, -0.7F, -0.15F, -0.3F, -0.7F, -0.12F); // Box 12
		gunModel[53].setRotationPoint(12.5F, -3F, 0F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.05F, -0.25F, -0.3F, -0.05F, -0.25F, -0.3F, 0.13F, -0.5F, -0.3F, 0.13F, -0.5F, -0.3F, -0.7F, -0.12F, -0.3F, -0.7F, -0.15F, -0.3F, -0.7F, -0.5F, -0.3F, -0.7F, -0.5F); // Box 13
		gunModel[54].setRotationPoint(12.5F, -3F, 0F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.12F, -0.3F, -0.17F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, -0.435F, -0.255F, -0.3F, -0.395F, -0.245F); // Box 15
		gunModel[55].setRotationPoint(12.5F, -3F, 0F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.12F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.395F, -0.245F, -0.3F, -0.435F, -0.255F, -0.3F, -0.2F, -0.5F, -0.3F, -0.17F, -0.5F); // Box 16
		gunModel[56].setRotationPoint(12.5F, -3F, 0F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0.13F, -0.5F, -0.3F, 0.13F, -0.5F, -0.3F, -0.05F, -0.28F, -0.3F, -0.05F, -0.28F, -0.3F, -0.7F, -0.5F, -0.3F, -0.7F, -0.5F, -0.3F, -0.7F, -0.17F, -0.3F, -0.7F, -0.15F); // Box 17
		gunModel[57].setRotationPoint(18F, -3F, 0F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.05F, -0.28F, -0.3F, -0.05F, -0.28F, -0.3F, 0.13F, -0.5F, -0.3F, 0.13F, -0.5F, -0.3F, -0.7F, -0.15F, -0.3F, -0.7F, -0.17F, -0.3F, -0.7F, -0.5F, -0.3F, -0.7F, -0.5F); // Box 18
		gunModel[58].setRotationPoint(18F, -3F, 0F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.3F, -0.49F, -0.525F, -0.3F, -0.49F, -0.525F, -0.3F, -0.49F, -0.4F, -0.3F, -0.49F, -0.4F, -0.22F, -0.49F, -0.525F, -0.22F, -0.49F, -0.525F, -0.22F, -0.49F, -0.4F, -0.22F, -0.49F); // Box 19
		gunModel[59].setRotationPoint(18F, -3F, 0F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.17F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.475F, -0.245F, -0.3F, -0.495F, -0.245F, -0.3F, -0.27F, -0.5F, -0.3F, -0.28F, -0.5F); // Box 20
		gunModel[60].setRotationPoint(18F, -3F, 0F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.875F, -0.375F, -0.5F, -0.875F, -0.375F, -0.5F, -0.875F, -0.5F, 0F, -0.875F, -0.5F, 0F, 0.05F, -0.375F, -0.625F, 0.05F, -0.375F, -0.625F, 0.1F, -0.5F, 0F, 0.1F, -0.5F); // Box 21
		gunModel[61].setRotationPoint(19F, -3.64F, 0F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.875F, -0.5F, -0.5F, -0.875F, -0.5F, -0.5F, -0.875F, -0.375F, 0F, -0.875F, -0.375F, 0F, 0.1F, -0.5F, -0.625F, 0.1F, -0.5F, -0.625F, 0.05F, -0.375F, 0F, 0.05F, -0.375F); // Box 22
		gunModel[62].setRotationPoint(19F, -3.64F, 0F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.125F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.625F, -0.125F, -0.75F, -0.625F, -0.125F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.625F, -0.125F, 0F, -0.625F); // Box 24
		gunModel[63].setRotationPoint(6F, -3.85F, 0F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.875F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.5F, -0.875F, -0.75F, -0.5F, -0.875F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.875F, 0F, -0.5F); // Box 25
		gunModel[64].setRotationPoint(7F, -3.85F, 0F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.6F, -0.225F, -0.75F, -0.6F, -0.225F, -0.75F, -0.6F, -0.6F, -0.125F, -0.6F, -0.6F, -0.125F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, -0.3F, -0.5F, -0.125F, -0.3F, -0.5F); // Box 26
		gunModel[65].setRotationPoint(6F, -3.85F, 0F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.05F, -0.875F, -0.125F, -0.75F, -0.875F, -0.125F, -0.75F, -0.75F, -0.5F, 0.05F, -0.75F, -0.5F, 0.05F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.5F, 0.05F, 0.125F, -0.5F); // Box 27
		gunModel[66].setRotationPoint(6F, -3.85F, 0F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.05F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.875F, -0.125F, 0.05F, -0.875F, -0.125F, 0.05F, 0.125F, -0.5F, -0.75F, 0.125F, -0.5F, -0.75F, 0.125F, 0F, 0.05F, 0.125F, 0F); // Box 28
		gunModel[67].setRotationPoint(6F, -3.85F, 0F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.7F, -0.25F, -0.375F, -0.7F, -0.25F, -0.375F, -0.7F, -0.6F, -0.25F, -0.7F, -0.6F, -0.25F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.6F, -0.25F, 0F, -0.6F); // Box 29
		gunModel[68].setRotationPoint(6F, -3.85F, 0F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.7F, -0.225F, -0.75F, -0.7F, -0.225F, -0.75F, -0.7F, -0.5F, -0.125F, -0.7F, -0.5F, -0.125F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F); // Box 30
		gunModel[69].setRotationPoint(6F, -3.85F, 0F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.7F, -0.65F, -0.5F, -0.7F, -0.65F, -0.375F, -0.7F, -0.25F, -0.25F, -0.7F, -0.25F, -0.375F, 0F, -0.65F, -0.5F, 0F, -0.65F, -0.375F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 31
		gunModel[70].setRotationPoint(6F, -3.85F, -0.5F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.7F, -0.4F, -0.475F, -0.7F, -0.4F, -0.525F, -0.7F, -0.5F, -0.25F, -0.7F, -0.5F, -0.25F, 0F, -0.4F, -0.475F, 0F, -0.4F, -0.525F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 32
		gunModel[71].setRotationPoint(6F, -3.85F, 0F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.125F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.25F, -0.125F, -0.75F, -0.25F, -0.125F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.25F, -0.125F, 0F, -0.25F); // Box 33
		gunModel[72].setRotationPoint(6F, -3.85F, 0F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.875F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.25F, -0.875F, -0.75F, -0.25F, -0.875F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.875F, 0F, -0.25F); // Box 33
		gunModel[73].setRotationPoint(7F, -3.85F, 0F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.6F, -0.6F, -0.75F, -0.6F, -0.6F, -0.75F, -0.6F, -0.225F, -0.125F, -0.6F, -0.225F, -0.125F, -0.3F, -0.5F, -0.75F, -0.3F, -0.5F, -0.75F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 33
		gunModel[74].setRotationPoint(6F, -3.85F, 0F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.7F, -0.6F, -0.375F, -0.7F, -0.6F, -0.375F, -0.7F, -0.25F, -0.25F, -0.7F, -0.25F, -0.25F, 0F, -0.6F, -0.375F, 0F, -0.6F, -0.375F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 33
		gunModel[75].setRotationPoint(6F, -3.85F, 0F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.7F, -0.5F, -0.75F, -0.7F, -0.5F, -0.75F, -0.7F, -0.225F, -0.125F, -0.7F, -0.225F, -0.125F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 33
		gunModel[76].setRotationPoint(6F, -3.85F, 0F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.7F, -0.25F, -0.375F, -0.7F, -0.25F, -0.5F, -0.7F, -0.65F, -0.375F, -0.7F, -0.65F, -0.25F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.5F, 0F, -0.65F, -0.375F, 0F, -0.65F); // Box 33
		gunModel[77].setRotationPoint(6F, -3.85F, 0.5F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.7F, -0.5F, -0.525F, -0.7F, -0.5F, -0.475F, -0.7F, -0.4F, -0.25F, -0.7F, -0.4F, -0.25F, 0F, -0.5F, -0.525F, 0F, -0.5F, -0.475F, 0F, -0.4F, -0.25F, 0F, -0.4F); // Box 33
		gunModel[78].setRotationPoint(6F, -3.85F, 0F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, 0.15F, -0.45F, -0.75F, 0.15F, -0.45F, -0.75F, 0.15F, -0.45F, -0.125F, 0.15F, -0.45F, -0.125F, -0.825F, -0.45F, -0.75F, -0.825F, -0.45F, -0.75F, -0.825F, -0.45F, -0.125F, -0.825F, -0.45F); // Box 41
		gunModel[79].setRotationPoint(19.25F, -3F, 0F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.65F, -0.55F, -0.75F, -0.65F, -0.55F, -0.75F, -0.65F, -0.35F, -0.125F, -0.65F, -0.35F, -0.125F, -0.2F, -0.6F, -0.75F, -0.2F, -0.6F, -0.75F, -0.2F, -0.3F, -0.125F, -0.2F, -0.3F); // Box 43
		gunModel[80].setRotationPoint(19.25F, -4.05F, 0F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.6F, -0.5F, -0.75F, -0.6F, -0.5F, -0.75F, -0.65F, -0.35F, -0.125F, -0.65F, -0.35F, -0.125F, -0.3F, -0.5F, -0.75F, -0.3F, -0.5F, -0.75F, -0.25F, -0.35F, -0.125F, -0.25F, -0.35F); // Box 44
		gunModel[81].setRotationPoint(19.25F, -4.05F, 0F);

		gunModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.3F, -0.5F, -0.75F, -0.3F, -0.5F, -0.75F, -0.25F, -0.35F, -0.125F, -0.25F, -0.35F, -0.125F, -0.6F, -0.5F, -0.75F, -0.6F, -0.5F, -0.75F, -0.65F, -0.35F, -0.125F, -0.65F, -0.35F); // Box 45
		gunModel[82].setRotationPoint(19.25F, -3.45F, 0F);

		gunModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, -0.35F, -0.75F, -0.25F, -0.35F, -0.75F, -0.3F, -0.5F, -0.125F, -0.3F, -0.5F, -0.125F, -0.65F, -0.35F, -0.75F, -0.65F, -0.35F, -0.75F, -0.6F, -0.5F, -0.125F, -0.6F, -0.5F); // Box 46
		gunModel[83].setRotationPoint(19.25F, -3.45F, 0F);

		gunModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.2F, -0.6F, -0.75F, -0.2F, -0.6F, -0.75F, -0.2F, -0.3F, -0.125F, -0.2F, -0.3F, -0.125F, -0.65F, -0.55F, -0.75F, -0.65F, -0.55F, -0.75F, -0.65F, -0.35F, -0.125F, -0.65F, -0.35F); // Box 47
		gunModel[84].setRotationPoint(19.25F, -3.45F, 0F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.2F, -0.3F, -0.75F, -0.2F, -0.3F, -0.75F, -0.2F, -0.6F, -0.125F, -0.2F, -0.6F, -0.125F, -0.65F, -0.35F, -0.75F, -0.65F, -0.35F, -0.75F, -0.65F, -0.55F, -0.125F, -0.65F, -0.55F); // Box 48
		gunModel[85].setRotationPoint(19.25F, -3.45F, 0F);

		gunModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.65F, -0.35F, -0.75F, -0.65F, -0.35F, -0.75F, -0.65F, -0.55F, -0.125F, -0.65F, -0.55F, -0.125F, -0.2F, -0.3F, -0.75F, -0.2F, -0.3F, -0.75F, -0.2F, -0.6F, -0.125F, -0.2F, -0.6F); // Box 49
		gunModel[86].setRotationPoint(19.25F, -4.05F, 0F);

		gunModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.65F, -0.35F, -0.75F, -0.65F, -0.35F, -0.75F, -0.6F, -0.5F, -0.125F, -0.6F, -0.5F, -0.125F, -0.25F, -0.35F, -0.75F, -0.25F, -0.35F, -0.75F, -0.3F, -0.5F, -0.125F, -0.3F, -0.5F); // Box 50
		gunModel[87].setRotationPoint(19.25F, -4.05F, 0F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.05F, -0.375F, 0F, -0.05F, -0.375F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.825F, -0.325F, 0F, -0.825F, -0.325F, 0F, -0.825F, -0.5F, 0F, -0.825F, -0.5F); // Box 1
		gunModel[88].setRotationPoint(19F, -3F, 0F);

		gunModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.05F, -0.375F, 0F, -0.05F, -0.375F, 0F, -0.825F, -0.5F, 0F, -0.825F, -0.5F, 0F, -0.825F, -0.325F, 0F, -0.825F, -0.325F); // Box 2
		gunModel[89].setRotationPoint(19F, -3F, 0F);

		gunModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.825F, -0.5F, 0F, -0.825F, -0.5F, 0F, -0.825F, -0.325F, 0F, -0.825F, -0.325F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.05F, -0.375F, 0F, -0.05F, -0.375F); // Box 3
		gunModel[90].setRotationPoint(19F, -3.64F, 0F);

		gunModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, -0.05F, -0.49F, 0F, -0.05F, -0.49F, 0F, -0.9F, -0.5F, 2F, -0.9F, -0.5F, 2F, -0.9F, -0.49F, 0F, -0.9F, -0.49F); // Box 4
		gunModel[91].setRotationPoint(19F, -2.2F, 0F);

		gunModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.9F, -0.49F, 2F, -0.9F, -0.49F, 2F, -0.9F, -0.5F, 0F, -0.9F, -0.5F, 0F, -0.05F, -0.49F, 1.4F, -0.05F, -0.49F, 1.4F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		gunModel[92].setRotationPoint(19F, -3F, 0F);

		gunModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.9F, -0.5F, 2F, -0.9F, -0.5F, 2F, -0.9F, -0.49F, 0F, -0.9F, -0.49F, 0F, 0F, -0.5F, 1.4F, 0F, -0.5F, 1.4F, -0.05F, -0.49F, 0F, -0.05F, -0.49F); // Box 6
		gunModel[93].setRotationPoint(19F, -3F, 0F);

		gunModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0.02F, -0.48F, 0.25F, 0F, -0.48F, 0.25F, 0F, -0.48F, -1F, 0.02F, -0.48F, -1F, -0.9F, -0.49F, 0.25F, -0.9F, -0.49F, 0.25F, -0.9F, -0.49F, -1F, -0.9F, -0.49F); // Box 7
		gunModel[94].setRotationPoint(19F, -2.2F, 0F);

		gunModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.375F, 0F, -0.46F, -0.125F, 0F, -0.46F, -0.125F, 0.04F, -0.5F, 0.375F, 0.04F, -0.5F, 0.375F, -0.9F, -0.45F, -0.125F, -0.9F, -0.45F, -0.125F, -0.9F, -0.5F, 0.375F, -0.9F, -0.5F); // Box 8
		gunModel[95].setRotationPoint(19F, -2.2F, 0F);

		gunModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.375F, -0.9F, -0.45F, -0.125F, -0.9F, -0.45F, -0.125F, -0.9F, -0.5F, 0.375F, -0.9F, -0.5F, 0.375F, 0F, -0.46F, -0.125F, 0F, -0.46F, -0.125F, 0.04F, -0.5F, 0.375F, 0.04F, -0.5F); // Box 9
		gunModel[96].setRotationPoint(19F, -3F, 0F);

		gunModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.375F, -0.9F, -0.5F, -0.125F, -0.9F, -0.5F, -0.125F, -0.9F, -0.45F, 0.375F, -0.9F, -0.45F, 0.375F, 0.04F, -0.5F, -0.125F, 0.04F, -0.5F, -0.125F, 0F, -0.46F, 0.375F, 0F, -0.46F); // Box 10
		gunModel[97].setRotationPoint(19F, -3F, 0F);

		gunModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.875F, -0.9F, -0.445F, 0F, -0.9F, -0.445F, 0F, -0.9F, -0.5F, -0.875F, -0.9F, -0.5F, -0.875F, 0.005F, -0.455F, 0F, 0.005F, -0.455F, 0F, 0.045F, -0.5F, -0.875F, 0.045F, -0.5F); // Box 11
		gunModel[98].setRotationPoint(19F, -3F, 0F);

		gunModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.875F, 0.005F, -0.455F, 0F, 0.005F, -0.455F, 0F, 0.045F, -0.5F, -0.875F, 0.045F, -0.5F, -0.875F, -0.9F, -0.445F, 0F, -0.9F, -0.445F, 0F, -0.9F, -0.5F, -0.875F, -0.9F, -0.5F); // Box 12
		gunModel[99].setRotationPoint(19F, -2.2F, 0F);

		gunModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.875F, 0.5F, -0.47F, -0.02F, 0.5F, -0.47F, -0.02F, 0.5F, -0.47F, -0.875F, 0.5F, -0.47F, -0.875F, -1.25F, -0.485F, -0.02F, -1.25F, -0.485F, -0.02F, -1.25F, -0.485F, -0.875F, -1.25F, -0.485F); // Box 13
		gunModel[100].setRotationPoint(19F, -2.2F, 0F);

		gunModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, -0.9F, -0.5F, -0.125F, -0.9F, -0.5F, -0.125F, -0.9F, -0.445F, -0.75F, -0.9F, -0.445F, -0.75F, 0.045F, -0.5F, -0.125F, 0.045F, -0.5F, -0.125F, 0.005F, -0.455F, -0.75F, 0.005F, -0.455F); // Box 15
		gunModel[101].setRotationPoint(17.75F, -3F, 0F);

		gunModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, -0.9F, -0.445F, -0.125F, -0.9F, -0.445F, -0.125F, -0.9F, -0.5F, -0.75F, -0.9F, -0.5F, -0.75F, 0.005F, -0.455F, -0.125F, 0.005F, -0.455F, -0.125F, 0.045F, -0.5F, -0.75F, 0.045F, -0.5F); // Box 16
		gunModel[102].setRotationPoint(17.75F, -3F, 0F);

		gunModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, 0.005F, -0.455F, -0.125F, 0.005F, -0.455F, -0.125F, 0.045F, -0.5F, -0.75F, 0.045F, -0.5F, -0.75F, -0.9F, -0.445F, -0.125F, -0.9F, -0.445F, -0.125F, -0.9F, -0.5F, -0.75F, -0.9F, -0.5F); // Box 17
		gunModel[103].setRotationPoint(17.75F, -2.2F, 0F);

		gunModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, 0.045F, -0.5F, -0.125F, 0.045F, -0.5F, -0.125F, 0.005F, -0.455F, -0.75F, 0.005F, -0.455F, -0.75F, -0.9F, -0.5F, -0.125F, -0.9F, -0.5F, -0.125F, -0.9F, -0.445F, -0.75F, -0.9F, -0.445F); // Box 14
		gunModel[104].setRotationPoint(17.75F, -2.2F, 0F);

		gunModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.665F, -0.065F, -0.45F, -0.3F, -0.05F, -0.45F, -0.3F, -0.05F, -0.45F, -0.665F, -0.065F, -0.45F, -0.65F, -0.9F, -0.45F, -0.3F, -0.9F, -0.45F, -0.3F, -0.9F, -0.45F, -0.65F, -0.9F, -0.45F); // Box 20
		gunModel[105].setRotationPoint(18.9F, -2.2F, 0F);

		gunModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.9F, -0.45F, -0.65F, -0.9F, -0.45F, -0.65F, -0.9F, -0.45F, -0.3F, -0.9F, -0.45F, -0.3F, -0.05F, -0.45F, -0.665F, -0.065F, -0.45F, -0.665F, -0.065F, -0.45F, -0.3F, -0.05F, -0.45F); // Box 20
		gunModel[106].setRotationPoint(19.3F, -3F, 0F);

		gunModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.65F, -0.9F, -0.45F, -0.3F, -0.9F, -0.45F, -0.3F, -0.9F, -0.45F, -0.65F, -0.9F, -0.45F, -0.665F, -0.065F, -0.45F, -0.3F, -0.05F, -0.45F, -0.3F, -0.05F, -0.45F, -0.665F, -0.065F, -0.45F); // Box 20
		gunModel[107].setRotationPoint(18.9F, -3F, 0F);

		gunModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.05F, -0.45F, -0.665F, -0.065F, -0.45F, -0.665F, -0.065F, -0.45F, -0.3F, -0.05F, -0.45F, -0.3F, -0.9F, -0.45F, -0.65F, -0.9F, -0.45F, -0.65F, -0.9F, -0.45F, -0.3F, -0.9F, -0.45F); // Box 20
		gunModel[108].setRotationPoint(19.3F, -2.2F, 0F);

		gunModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.665F, -0.065F, -0.45F, -0.3F, -0.05F, -0.45F, -0.3F, -0.05F, -0.45F, -0.665F, -0.065F, -0.45F, -0.65F, -0.9F, -0.45F, -0.3F, -0.9F, -0.45F, -0.3F, -0.9F, -0.45F, -0.65F, -0.9F, -0.45F); // Box 26
		gunModel[109].setRotationPoint(18.2F, -2.2F, 0F);

		gunModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.9F, -0.45F, -0.65F, -0.9F, -0.45F, -0.65F, -0.9F, -0.45F, -0.3F, -0.9F, -0.45F, -0.3F, -0.05F, -0.45F, -0.665F, -0.065F, -0.45F, -0.665F, -0.065F, -0.45F, -0.3F, -0.05F, -0.45F); // Box 27
		gunModel[110].setRotationPoint(18.6F, -3F, 0F);

		gunModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.65F, -0.9F, -0.45F, -0.3F, -0.9F, -0.45F, -0.3F, -0.9F, -0.45F, -0.65F, -0.9F, -0.45F, -0.665F, -0.065F, -0.45F, -0.3F, -0.05F, -0.45F, -0.3F, -0.05F, -0.45F, -0.665F, -0.065F, -0.45F); // Box 28
		gunModel[111].setRotationPoint(18.2F, -3F, 0F);

		gunModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.05F, -0.45F, -0.665F, -0.065F, -0.45F, -0.665F, -0.065F, -0.45F, -0.3F, -0.05F, -0.45F, -0.3F, -0.9F, -0.45F, -0.65F, -0.9F, -0.45F, -0.65F, -0.9F, -0.45F, -0.3F, -0.9F, -0.45F); // Box 29
		gunModel[112].setRotationPoint(18.6F, -2.2F, 0F);

		gunModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.885F, 0.025F, -0.5F, -0.01F, 0.025F, -0.5F, -0.01F, -0.025F, -0.35F, -0.885F, -0.025F, -0.35F, -0.885F, -0.825F, -0.5F, -0.01F, -0.825F, -0.5F, -0.01F, -0.825F, -0.3F, -0.885F, -0.825F, -0.3F); // Box 13
		gunModel[113].setRotationPoint(19F, -3F, 0F);

		gunModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.885F, -0.025F, -0.35F, -0.01F, -0.025F, -0.35F, -0.01F, 0.025F, -0.5F, -0.885F, 0.025F, -0.5F, -0.885F, -0.825F, -0.3F, -0.01F, -0.825F, -0.3F, -0.01F, -0.825F, -0.5F, -0.885F, -0.825F, -0.5F); // Box 31
		gunModel[114].setRotationPoint(19F, -3F, 0F);

		gunModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.885F, -0.825F, -0.5F, -0.01F, -0.825F, -0.5F, -0.01F, -0.825F, -0.3F, -0.885F, -0.825F, -0.3F, -0.885F, 0.025F, -0.5F, -0.01F, 0.025F, -0.5F, -0.01F, -0.025F, -0.35F, -0.885F, -0.025F, -0.35F); // Box 32
		gunModel[115].setRotationPoint(19F, -3.64F, 0F);

		gunModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.885F, -0.825F, -0.3F, -0.01F, -0.825F, -0.3F, -0.01F, -0.825F, -0.5F, -0.885F, -0.825F, -0.5F, -0.885F, -0.025F, -0.35F, -0.01F, -0.025F, -0.35F, -0.01F, 0.025F, -0.5F, -0.885F, 0.025F, -0.5F); // Box 33
		gunModel[116].setRotationPoint(19F, -3.64F, 0F);

		gunModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.875F, 0.045F, -0.5F, 0F, 0.045F, -0.5F, 0F, 0.005F, -0.455F, -0.875F, 0.005F, -0.455F, -0.875F, -0.9F, -0.5F, 0F, -0.9F, -0.5F, 0F, -0.9F, -0.445F, -0.875F, -0.9F, -0.445F); // Box 0
		gunModel[117].setRotationPoint(19F, -2.2F, 0F);

		gunModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.875F, -0.9F, -0.47F, -0.02F, -0.9F, -0.47F, -0.02F, -0.9F, -0.47F, -0.875F, -0.9F, -0.47F, -0.875F, 0.15F, -0.485F, -0.02F, 0.15F, -0.485F, -0.02F, 0.15F, -0.485F, -0.875F, 0.15F, -0.485F); // Box 1
		gunModel[118].setRotationPoint(19F, -3F, 0F);

		gunModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.875F, 0.25F, -0.485F, -0.02F, 0.25F, -0.485F, -0.02F, 0.25F, -0.485F, -0.875F, 0.25F, -0.485F, -0.875F, -0.9F, -0.47F, -0.02F, -0.9F, -0.47F, -0.02F, -0.9F, -0.47F, -0.875F, -0.9F, -0.47F); // Box 1
		gunModel[119].setRotationPoint(19F, -2.2F, 0F);

		gunModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.875F, 0.25F, -0.485F, -0.02F, 0.25F, -0.485F, -0.02F, 0.25F, -0.485F, -0.875F, 0.25F, -0.485F, -0.875F, -0.9F, -0.47F, -0.02F, -0.9F, -0.47F, -0.02F, -0.9F, -0.47F, -0.875F, -0.9F, -0.47F); // Box 3
		gunModel[120].setRotationPoint(17.63F, -2.2F, 0F);

		gunModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.17F, -0.3F, -0.3F, -0.15F, -0.3F, -0.28F, -0.5F, -0.3F, -0.27F, -0.5F, -0.3F, -0.495F, -0.245F, -0.3F, -0.475F, -0.245F); // Box 19
		gunModel[121].setRotationPoint(18F, -3F, 0F);

		gunModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.5F, -0.5F, 0.2F, -0.5F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.7F, -0.5F, -0.5F, -0.7F, -0.5F, -0.5F, -0.7F, -0.05F, 0F, -0.7F, -0.05F); // Box 2
		gunModel[122].setRotationPoint(2F, -3F, 0F);

		gunModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, -0.7F, -0.05F, -0.5F, -0.7F, -0.05F, -0.5F, -0.7F, -0.5F, 0F, -0.7F, -0.5F); // Box 5
		gunModel[123].setRotationPoint(2F, -3F, 0F);
	}
}