//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 27.03.2018 - 16:05:32
// Last changed on: 27.03.2018 - 16:05:32

package com.flansmod.client.model.Lizard; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelG43 extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelG43() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[92];
		ammoModel = new ModelRendererTurbo[5];
		slideModel = new ModelRendererTurbo[9];

		initgunModel_1();
		initammoModel_1();
		initslideModel_1();

		translateAll(0F, -1.75F, 0.2F);
		
		gunSlideDistance = 0.1F;
		animationType = EnumAnimationType.BULLPUP;


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2
		gunModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 3
		gunModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 4
		gunModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 5
		gunModel[5] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 6
		gunModel[6] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 7
		gunModel[7] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 9
		gunModel[8] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 10
		gunModel[9] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 11
		gunModel[10] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 12
		gunModel[11] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 13
		gunModel[12] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 14
		gunModel[13] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 15
		gunModel[14] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 16
		gunModel[15] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 18
		gunModel[16] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 19
		gunModel[17] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 20
		gunModel[18] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 21
		gunModel[19] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 22
		gunModel[20] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 23
		gunModel[21] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 24
		gunModel[22] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 25
		gunModel[23] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 26
		gunModel[24] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 27
		gunModel[25] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 28
		gunModel[26] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 29
		gunModel[27] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 30
		gunModel[28] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 31
		gunModel[29] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 32
		gunModel[30] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 33
		gunModel[31] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 34
		gunModel[32] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 35
		gunModel[33] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 36
		gunModel[34] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 37
		gunModel[35] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 38
		gunModel[36] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 39
		gunModel[37] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 40
		gunModel[38] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 41
		gunModel[39] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 42
		gunModel[40] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 43
		gunModel[41] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 44
		gunModel[42] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 45
		gunModel[43] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 46
		gunModel[44] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 47
		gunModel[45] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 48
		gunModel[46] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 49
		gunModel[47] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 50
		gunModel[48] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 51
		gunModel[49] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 52
		gunModel[50] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 53
		gunModel[51] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 68
		gunModel[52] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 69
		gunModel[53] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 71
		gunModel[54] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 72
		gunModel[55] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 73
		gunModel[56] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 74
		gunModel[57] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 75
		gunModel[58] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 76
		gunModel[59] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 77
		gunModel[60] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 78
		gunModel[61] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 132
		gunModel[62] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 133
		gunModel[63] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 134
		gunModel[64] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 135
		gunModel[65] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 87
		gunModel[66] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 37
		gunModel[67] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 38
		gunModel[68] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 90
		gunModel[69] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 91
		gunModel[70] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 92
		gunModel[71] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 93
		gunModel[72] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 94
		gunModel[73] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 78
		gunModel[74] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 79
		gunModel[75] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 80
		gunModel[76] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 75
		gunModel[77] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 76
		gunModel[78] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 77
		gunModel[79] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 101
		gunModel[80] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 102
		gunModel[81] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 103
		gunModel[82] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 104
		gunModel[83] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 54
		gunModel[84] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 55
		gunModel[85] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 56
		gunModel[86] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 120
		gunModel[87] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 110
		gunModel[88] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 111
		gunModel[89] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 112
		gunModel[90] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 113
		gunModel[91] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 114

		gunModel[0].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0.2F, -0.3F, -0.2F, 0.2F, -0.3F, -0.2F, 0.2F, -0.3F, -0.2F, 0.2F, -0.3F); // Box 1
		gunModel[0].setRotationPoint(-0.1F, -3.6F, -0.35F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, 0.2F, -0.3F, -0.2F, 0.2F, -0.3F, -0.2F, 0.2F, -0.3F, -0.2F, 0.2F, -0.3F); // Box 2
		gunModel[1].setRotationPoint(-0.1F, -3.6F, -1.15F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 3
		gunModel[2].setRotationPoint(-0.1F, -3.4F, -0.75F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, -0.15F, 0.1F, -0.1F, -0.15F, 0.1F, -0.1F, 0.2F, 0.1F); // Box 4
		gunModel[3].setRotationPoint(4.6F, -3.6F, -0.75F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.1F, 0F, 0.1F, -0.6F, 0F, 0.1F, -0.6F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, -0.15F, 0.1F, -0.6F, -0.15F, 0.1F, -0.6F, -0.15F, 0.1F, -0.1F, -0.15F, 0.1F); // Box 5
		gunModel[4].setRotationPoint(5.4F, -3.6F, -0.75F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.1F, 0F, 0.1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.1F, 0F, 0.1F, -0.1F, -0.15F, 0.1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.1F, -0.15F, 0.1F); // Box 6
		gunModel[5].setRotationPoint(7.7F, -3.6F, -0.75F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,-0.1F, 0F, 0F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.1F, -0.1F, 0F, 0F, -0.1F, -0.25F, 0F, 0.5F, -0.7F, -0.1F, 0.5F, -0.7F, -0.1F, -0.1F, -0.25F, 0F); // Box 7
		gunModel[6].setRotationPoint(10.35F, -3.6F, -0.75F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,-0.1F, -0.45F, 0F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.1F, -0.1F, -0.45F, 0F, -0.1F, -0.25F, -0.3F, 0.5F, -0.7F, -0.3F, 0.5F, -0.7F, -0.3F, -0.1F, -0.25F, -0.3F); // Box 9
		gunModel[7].setRotationPoint(10.35F, -3.3F, -0.75F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.1F, -0.55F, 0.1F, -0.25F, -0.45F, 0F, -0.25F, -0.45F, 0F, -0.1F, -0.55F, 0.1F, -0.1F, -0.15F, -0.1F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.1F, -0.15F, -0.1F); // Box 10
		gunModel[8].setRotationPoint(7.7F, -3.3F, -0.75F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.1F, -0.35F, 0.1F, -0.6F, -0.35F, 0.1F, -0.6F, -0.35F, 0.1F, -0.1F, -0.35F, 0.1F, -0.1F, -0.35F, -0.1F, -0.6F, -0.35F, -0.1F, -0.6F, -0.35F, -0.1F, -0.1F, -0.35F, -0.1F); // Box 11
		gunModel[9].setRotationPoint(5.4F, -3.1F, -0.75F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.9F, 0.1F, -0.1F, -0.55F, 0.1F, -0.1F, -0.55F, 0.1F, -0.1F, -0.9F, 0.1F, -0.1F, 0.35F, -0.1F, -0.1F, -0.15F, -0.1F, -0.1F, -0.15F, -0.1F, -0.1F, 0.35F, -0.1F); // Box 12
		gunModel[10].setRotationPoint(4.6F, -3.3F, -0.75F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.2F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, -0.2F, -0.3F, 0.1F, -0.2F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, -0.2F, -0.25F, -0.1F); // Box 13
		gunModel[11].setRotationPoint(0.7F, -2.7F, -0.75F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F, 0.2F, -0.3F, -0.4F, 0.2F, -0.3F, -0.4F, 0.2F, -0.3F, -0.4F, 0.2F, -0.3F); // Box 14
		gunModel[12].setRotationPoint(-0.5F, -3.6F, -0.35F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.5F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, 0.2F, -0.3F, -0.4F, 0.2F, -0.3F, -0.4F, 0.2F, -0.3F, -0.4F, 0.2F, -0.3F); // Box 15
		gunModel[13].setRotationPoint(-0.5F, -3.6F, -1.15F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -1F, 0.1F, 0F, 1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 1F, -0.1F); // Box 16
		gunModel[14].setRotationPoint(-1.1F, -2.7F, -0.75F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -1.2F, 0.1F, -0.2F, -1F, 0.1F, -0.2F, -1F, 0.1F, -0.2F, -1.2F, 0.1F, -0.2F, 1.1F, -0.1F, -0.2F, 1F, -0.1F, -0.2F, 1F, -0.1F, -0.2F, 1.1F, -0.1F); // Box 18
		gunModel[15].setRotationPoint(-1.9F, -2.7F, -0.75F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -1F, 0.1F, -0.2F, -1.2F, 0.1F, -0.2F, -1.2F, 0.1F, -0.2F, -1F, 0.1F, -0.2F, 0.9F, -0.1F, -0.2F, 1.1F, -0.1F, -0.2F, 1.1F, -0.1F, -0.2F, 0.9F, -0.1F); // Box 19
		gunModel[16].setRotationPoint(-2.5F, -2.7F, -0.75F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -1F, 0.1F, -0.25F, -1F, 0.1F, -0.25F, -1F, 0.1F, -0.25F, -1F, 0.1F, -0.25F, 0.9F, -0.2F, -0.25F, 0.9F, -0.1F, -0.25F, 0.9F, -0.1F, -0.25F, 0.9F, -0.2F); // Box 20
		gunModel[17].setRotationPoint(-3.05F, -2.7F, -0.75F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -2.5F, 0.1F, 0.25F, -1F, 0.1F, 0.25F, -1F, 0.1F, 0F, -2.5F, 0.1F, 0F, 2.6F, -0.2F, 0.25F, 0.9F, -0.2F, 0.25F, 0.9F, -0.2F, 0F, 2.6F, -0.2F); // Box 21
		gunModel[18].setRotationPoint(-7.05F, -2.7F, -0.75F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1.7F, 0F, 0.25F, -1.25F, 0F, 0.25F, -1.25F, 0F, 0F, -1.7F, 0F, 0F, 2.6F, 0.1F, 0.25F, 1.1F, 0.1F, 0.25F, 1.1F, 0.1F, 0F, 2.6F, 0.1F); // Box 22
		gunModel[19].setRotationPoint(-7.05F, -3.8F, -0.75F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0.1F, -0.1F); // Box 23
		gunModel[20].setRotationPoint(-7.95F, -0.1F, -0.75F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.45F, 0.25F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, 0.45F, 0.25F, 0F, 0.1F, 0.5F, 0.1F, -0.1F, 0.5F, 0.1F, -0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F); // Box 24
		gunModel[21].setRotationPoint(-7.95F, -1.7F, -0.75F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0.85F, 0F, -0.25F, 0.85F, -0.1F, -0.25F, 0.85F, -0.1F, -0.25F, 0.85F, 0F, -0.25F, -1F, 0.1F, -0.25F, -1F, 0.1F, -0.25F, -1F, 0.1F, -0.25F, -1F, 0.1F); // Box 25
		gunModel[22].setRotationPoint(-3.05F, -1.7F, -0.75F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1F, -0.3F, 0.25F, -0.5F, -0.3F, 0.25F, -0.5F, -0.3F, 0F, -1F, -0.3F, 0F, 0.45F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.45F, 0F); // Box 26
		gunModel[23].setRotationPoint(-7.05F, -3.55F, -0.75F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.55F, 0.2F, -0.3F, -0.1F, 0.4F, -0.3F, -0.1F, 0.4F, -0.3F, 0.55F, 0.2F, -0.3F, 0.45F, -0.8F, 0F, -0.1F, -0.95F, 0F, -0.1F, -0.95F, 0F, 0.45F, -0.8F, 0F); // Box 27
		gunModel[24].setRotationPoint(-7.95F, -2.15F, -0.75F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, 0F); // Box 28
		gunModel[25].setRotationPoint(-3.05F, -3.3F, -0.75F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -1.05F, -0.1F, -0.2F, -1.2F, -0.1F, -0.2F, -1.2F, -0.1F, -0.2F, -1.05F, -0.1F, -0.2F, 0.9F, 0.1F, -0.2F, 1.1F, 0.1F, -0.2F, 1.1F, 0.1F, -0.2F, 0.9F, 0.1F); // Box 29
		gunModel[26].setRotationPoint(-2.5F, -3.6F, -0.75F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -1.2F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.1F, -0.1F, -0.2F, -1.2F, -0.1F, -0.2F, 1.1F, 0.1F, -0.2F, 0.9F, 0.1F, -0.2F, 0.9F, 0.1F, -0.2F, 1.1F, 0.1F); // Box 30
		gunModel[27].setRotationPoint(-1.9F, -3.6F, -0.75F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.1F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.1F, -0.1F); // Box 31
		gunModel[28].setRotationPoint(-0.1F, -2.7F, -0.75F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.8F, -0.1F, 0F, 0.6F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.6F, 0.1F); // Box 32
		gunModel[29].setRotationPoint(-1.1F, -3.3F, -0.75F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.25F, -0.2F, -0.3F, -0.25F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.1F, -0.2F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F, -0.2F, -0.3F, -0.1F); // Box 33
		gunModel[30].setRotationPoint(-1.9F, -3.1F, -0.75F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.05F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.05F, -0.3F, -0.2F, -0.45F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.45F, -0.1F); // Box 34
		gunModel[31].setRotationPoint(-2.5F, -3.1F, -0.75F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.8F, -0.3F, 0F, 0.6F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, 0.6F, -0.3F); // Box 35
		gunModel[32].setRotationPoint(-1.1F, -3.6F, -0.75F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.8F, -0.65F, 0F, 0.1F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, 0.1F, -0.5F); // Box 36
		gunModel[33].setRotationPoint(-1.1F, -3.6F, -0.35F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.65F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.8F, -0.3F, 0F, 0.1F, -0.5F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, 0.1F, -0.3F); // Box 37
		gunModel[34].setRotationPoint(-1.1F, -3.6F, -1.15F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.45F, 0.25F, -0.1F, -0.1F, 0.4F, -0.1F, -0.1F, 0.4F, -0.1F, 0.45F, 0.25F, -0.1F, 0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, 0.1F, 0.4F, 0F); // Box 38
		gunModel[35].setRotationPoint(-8.6F, -1.6F, -0.75F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.3F, -0.3F, -0.1F, -0.15F, -0.3F, -0.1F, -0.15F, -0.3F, 0.1F, -0.3F, -0.3F, 0.45F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, 0.45F, -0.3F, -0.1F); // Box 39
		gunModel[36].setRotationPoint(-8.6F, -2.55F, -0.75F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.1F, 0.3F, -0.15F, -0.1F, 0.13F, -0.15F, -0.1F, 0.13F, -0.15F, -0.1F, 0.3F, -0.15F); // Box 40
		gunModel[37].setRotationPoint(-8.6F, -0.2F, -0.75F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.1F, 0F, -0.1F, 0.25F, 0F, -0.1F, 0.25F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.25F, -0.1F, 0.25F, -0.25F, -0.1F, 0.25F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F); // Box 41
		gunModel[38].setRotationPoint(10.35F, -4.1F, -0.75F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.05F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, -0.65F, -0.1F, 0.3F, -0.65F, -0.1F, 0.3F, -0.65F, -0.1F, -0.05F, -0.65F, -0.1F); // Box 42
		gunModel[39].setRotationPoint(16.55F, -4.1F, -0.75F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.45F, -0.1F, 0F, -0.45F, -0.1F, 0F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F, -0.3F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F); // Box 43
		gunModel[40].setRotationPoint(17.85F, -4.2F, -0.75F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F, 0F, -0.45F, -0.1F, 0F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, 0F, -0.4F, -0.1F); // Box 44
		gunModel[41].setRotationPoint(15.95F, -4.2F, -0.75F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F, -0.1F, -0.45F, -0.1F, -0.2F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F); // Box 45
		gunModel[42].setRotationPoint(16.95F, -4.2F, -0.75F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,-0.1F, -0.3F, -0.25F, 0.5F, -0.4F, -0.35F, 0.5F, -0.4F, -0.35F, -0.1F, -0.3F, -0.25F, -0.1F, -0.35F, -0.1F, 0.5F, -0.35F, -0.1F, 0.5F, -0.35F, -0.1F, -0.1F, -0.35F, -0.1F); // Box 46
		gunModel[43].setRotationPoint(10.35F, -4.75F, -0.75F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.2F, 0F, -0.05F, -0.15F, 0F, -0.05F, -0.15F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.15F, 0F, -0.05F, -0.15F, 0F, -0.05F, -0.2F, 0F, -0.05F); // Box 47
		gunModel[44].setRotationPoint(0F, -3.75F, -0.75F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.2F, -0.35F, -0.3F, -0.15F, -0.35F, -0.3F, -0.15F, -0.35F, -0.3F, -0.2F, -0.35F, -0.3F, -0.2F, -0.35F, -0.05F, -0.15F, -0.35F, -0.05F, -0.15F, -0.35F, -0.05F, -0.2F, -0.35F, -0.05F); // Box 48
		gunModel[45].setRotationPoint(0F, -4.4F, -0.75F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.2F, 0F, -0.1F, -0.15F, 0F, -0.1F, -0.15F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, -0.5F, -0.1F, -0.15F, -0.5F, -0.1F, -0.15F, -0.5F, -0.1F, -0.2F, -0.5F, -0.1F); // Box 49
		gunModel[46].setRotationPoint(7.6F, -3.75F, -0.75F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F, -0.2F, -0.4F, -0.15F, -0.2F, -0.25F, -0.1F, -0.15F, -0.25F, -0.1F, -0.15F, -0.25F, -0.1F, -0.2F, -0.25F, -0.1F); // Box 50
		gunModel[47].setRotationPoint(9.6F, -4.5F, -0.75F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.4F, -0.15F, -0.5F, -0.4F, -0.15F, -0.5F, -0.4F, -0.2F, -0.5F, -0.4F, -0.2F, -0.3F, -0.15F, -0.15F, -0.3F, -0.15F, -0.15F, -0.3F, -0.15F, -0.2F, -0.3F, -0.15F); // Box 51
		gunModel[48].setRotationPoint(9.6F, -4.8F, -0.75F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.2F, -0.4F, -0.2F, -0.15F, -0.4F, -0.2F, -0.15F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.25F, -0.2F, -0.15F, -0.25F, -0.15F, -0.15F, -0.25F, -0.15F, -0.2F, -0.25F, -0.15F); // Box 52
		gunModel[49].setRotationPoint(7.6F, -4.5F, -0.75F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.2F, -0.55F, -0.4F, -0.15F, -0.55F, -0.4F, -0.15F, -0.55F, -0.4F, -0.2F, -0.55F, -0.4F, -0.2F, -0.3F, -0.2F, -0.15F, -0.3F, -0.2F, -0.15F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F); // Box 53
		gunModel[50].setRotationPoint(7.6F, -4.8F, -0.75F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.05F, -0.2F, -0.2F, -0.05F, -0.2F, -0.2F, -0.05F, -0.2F, -0.2F, -0.05F, -0.2F, -0.2F, -0.05F, -0.2F, -0.2F, -0.05F, -0.2F, -0.2F, -0.05F, -0.2F, -0.2F, -0.05F); // Box 68
		gunModel[51].setRotationPoint(9.65F, -4.4F, -0.75F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.2F, -0.3F, -0.45F, -0.2F, -0.3F, -0.45F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F); // Box 69
		gunModel[52].setRotationPoint(9.65F, -4.9F, -0.4F);

		gunModel[53].addShapeBox(0F, 0F, -1F, 1, 1, 1, 0F,-0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.2F, -0.3F, -0.45F, -0.2F, -0.3F, -0.45F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F); // Box 71
		gunModel[53].setRotationPoint(9.65F, -4.9F, -0.15F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F); // Box 72
		gunModel[54].setRotationPoint(7.65F, -4.8F, -0.75F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.1F, -0.45F, -0.3F, -0.1F, -0.65F, -0.3F, -0.1F, -0.65F, -0.3F, -0.1F, -0.45F, -0.3F, -0.1F, -0.45F, -0.3F, -0.1F, -0.25F, -0.3F, -0.1F, -0.25F, -0.3F, -0.1F, -0.45F, -0.3F); // Box 73
		gunModel[55].setRotationPoint(7.95F, -5.1F, -0.75F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F); // Box 74
		gunModel[56].setRotationPoint(7.5F, -5.1F, -0.52F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F); // Box 75
		gunModel[57].setRotationPoint(7.5F, -5.1F, -0.98F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.45F, -0.35F, -0.4F, -0.45F, -0.35F, -0.4F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F); // Box 76
		gunModel[58].setRotationPoint(7.5F, -5.1F, -0.75F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.35F, -0.1F, -0.35F, -0.35F, -0.1F, -0.35F, -0.35F, -0.1F, -0.35F, -0.35F, -0.1F, -0.35F, -0.35F, -0.1F, -0.35F, -0.35F, -0.1F, -0.35F, -0.35F, -0.1F, -0.35F, -0.35F, -0.1F); // Box 77
		gunModel[59].setRotationPoint(8F, -5F, -0.75F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, 0.15F, -0.4F, -0.4F, 0.15F, -0.4F, -0.4F, 0.15F, -0.4F, -0.4F, 0.15F, -0.4F, -0.4F, 0.15F, -0.4F, -0.4F, 0.15F, -0.4F, -0.4F, 0.15F, -0.4F, -0.4F, 0.15F); // Box 78
		gunModel[60].setRotationPoint(8.1F, -3.6F, -0.75F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.75F, -0.3F, -0.25F, -0.1F, -0.3F, -0.25F, -0.1F, -0.3F, -0.25F, -0.75F, -0.3F, -0.25F); // Box 132
		gunModel[61].setRotationPoint(0.5F, -1.55F, -0.75F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.1F, -0.3F, -0.25F, -0.75F, -0.3F, -0.25F, -0.75F, -0.3F, -0.25F, -0.1F, -0.3F, -0.25F); // Box 133
		gunModel[62].setRotationPoint(2.4F, -1.55F, -0.75F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.35F, -0.4F, -0.25F, -0.35F, -0.4F, -0.25F, -0.35F, -0.4F, -0.25F, -0.35F, -0.4F, -0.25F, -0.35F, -0.45F, -0.25F, -0.35F, -0.45F, -0.25F, -0.35F, -0.45F, -0.25F, -0.35F, -0.45F, -0.25F); // Box 134
		gunModel[63].setRotationPoint(0.95F, -1.4F, -0.75F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.45F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F); // Box 135
		gunModel[64].setRotationPoint(2.35F, -3F, -0.75F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.45F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F); // Box 87
		gunModel[65].setRotationPoint(0.5F, -3F, -0.75F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.5F, -0.25F, -0.4F, -0.5F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F); // Box 37
		gunModel[66].setRotationPoint(1.1F, -2.2F, -0.75F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.7F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.7F, -0.3F, -0.4F); // Box 38
		gunModel[67].setRotationPoint(1F, -1.75F, -0.75F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.1F, -0.15F, -0.3F, -0.1F, -0.15F, -0.3F, -0.1F, -0.15F, -0.3F, -0.1F, -0.15F, -0.3F, -0.1F, -0.15F, -0.3F, -0.1F, -0.15F, -0.3F, -0.1F, -0.15F, -0.3F, -0.1F, -0.15F); // Box 90
		gunModel[68].setRotationPoint(18.35F, -4.15F, -0.75F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.15F, -0.3F, -0.4F, -0.15F, -0.3F, -0.4F, -0.15F, -0.3F, -0.4F, -0.15F); // Box 91
		gunModel[69].setRotationPoint(18.35F, -4.65F, -0.75F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.15F, -0.2F, 0F, -0.15F, -0.2F, 0F, -0.15F, -0.2F, 0F, -0.15F, -0.2F, 0F, -0.15F, -0.2F, 0F, -0.15F, -0.2F, 0F, -0.15F, -0.2F, 0F, -0.15F, -0.2F); // Box 92
		gunModel[70].setRotationPoint(18.6F, -4.1F, -0.75F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F); // Box 93
		gunModel[71].setRotationPoint(18.6F, -3.65F, -0.75F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 94
		gunModel[72].setRotationPoint(18.6F, -4.55F, -0.75F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,-0.1F, -0.44F, -0.28F, -0.1F, -0.44F, -0.28F, -0.1F, -0.44F, -0.28F, -0.1F, -0.44F, -0.28F, -0.1F, -0.44F, -0.28F, -0.1F, -0.44F, -0.28F, -0.1F, -0.44F, -0.28F, -0.1F, -0.44F, -0.28F); // Box 78
		gunModel[73].setRotationPoint(15F, -4.28F, -0.75F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,-0.1F, -0.42F, -0.4F, -0.1F, -0.42F, -0.4F, -0.1F, -0.42F, -0.4F, -0.1F, -0.42F, -0.4F, -0.1F, -0.44F, -0.28F, -0.1F, -0.44F, -0.28F, -0.1F, -0.44F, -0.28F, -0.1F, -0.44F, -0.28F); // Box 79
		gunModel[74].setRotationPoint(15F, -4.4F, -0.75F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,-0.1F, -0.44F, -0.28F, -0.1F, -0.44F, -0.28F, -0.1F, -0.44F, -0.28F, -0.1F, -0.44F, -0.28F, -0.1F, -0.42F, -0.4F, -0.1F, -0.42F, -0.4F, -0.1F, -0.42F, -0.4F, -0.1F, -0.42F, -0.4F); // Box 80
		gunModel[75].setRotationPoint(15F, -4.16F, -0.75F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.2F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F); // Box 75
		gunModel[76].setRotationPoint(23.75F, -4.75F, -0.75F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F); // Box 76
		gunModel[77].setRotationPoint(23.75F, -4.3F, -0.75F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F); // Box 77
		gunModel[78].setRotationPoint(23.75F, -4.1F, -0.75F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F); // Box 101
		gunModel[79].setRotationPoint(19F, -4.1F, -0.75F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F); // Box 102
		gunModel[80].setRotationPoint(19F, -4.5F, -0.75F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F); // Box 103
		gunModel[81].setRotationPoint(19F, -4.3F, -0.75F);

		gunModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F); // Box 104
		gunModel[82].setRotationPoint(23.75F, -4.5F, -0.75F);

		gunModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.45F, -0.25F, -0.35F, -0.45F, -0.25F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F, -0.25F, -0.35F, -0.45F, -0.25F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F); // Box 54
		gunModel[83].setRotationPoint(23.9F, -5.15F, -0.9F);

		gunModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.45F, -0.25F, -0.35F, -0.45F, -0.25F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.25F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F); // Box 55
		gunModel[84].setRotationPoint(23.9F, -5.15F, -0.6F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.45F, -0.4F, -0.25F, -0.45F, -0.4F, -0.25F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F); // Box 56
		gunModel[85].setRotationPoint(23.9F, -5.35F, -0.75F);

		gunModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.35F, -0.47F, -0.35F, -0.35F, -0.47F, -0.35F, -0.35F, -0.47F, -0.35F, -0.35F, -0.47F, -0.35F, -0.35F, -0.47F, -0.35F, -0.35F, -0.47F, -0.35F, -0.35F, -0.47F, -0.35F, -0.35F, -0.47F); // Box 120
		gunModel[86].setRotationPoint(23.9F, -5.05F, -0.75F);

		gunModel[87].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 110
		gunModel[87].setRotationPoint(18.8F, -3.85F, -0.75F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.37F, -0.37F, -0.2F, -0.37F, -0.37F, -0.2F, -0.37F, -0.37F, -0.2F, -0.37F, -0.37F, -0.2F, -0.37F, -0.37F, -0.2F, -0.37F, -0.37F, -0.2F, -0.37F, -0.37F, -0.2F, -0.37F, -0.37F); // Box 111
		gunModel[88].setRotationPoint(20.6F, -3.85F, -0.75F);

		gunModel[89].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 112
		gunModel[89].setRotationPoint(0.05F, -3.95F, -0.75F);

		gunModel[90].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 113
		gunModel[90].setRotationPoint(0.05F, -4.25F, -0.75F);

		gunModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.45F, -0.05F, -0.2F, -0.45F, -0.05F, -0.2F, -0.45F, -0.05F, -0.2F, -0.45F, -0.05F, -0.2F, -0.45F, -0.05F, -0.2F, -0.45F, -0.05F, -0.2F, -0.45F, -0.05F, -0.2F, -0.45F, -0.05F); // Box 114
		gunModel[91].setRotationPoint(18.05F, -3.95F, -0.75F);
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 63
		ammoModel[1] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 64
		ammoModel[2] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 65
		ammoModel[3] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 66
		ammoModel[4] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 67

		ammoModel[0].addShapeBox(0F, -0.45F, 0F, 2, 2, 1, 0F,-0.2F, 0F, -0.15F, -0.2F, 0F, -0.15F, -0.2F, 0F, -0.15F, -0.2F, 0F, -0.15F, -0.2F, 0F, -0.15F, -0.2F, 0F, -0.15F, -0.2F, 0F, -0.15F, -0.2F, 0F, -0.15F); // Box 63
		ammoModel[0].setRotationPoint(5F, -2.1F, -0.75F);
		ammoModel[0].rotateAngleZ = 0.12217305F;

		ammoModel[1].addShapeBox(0.8F, -0.45F, 0F, 2, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 64
		ammoModel[1].setRotationPoint(5F, -2.1F, -0.75F);
		ammoModel[1].rotateAngleZ = 0.12217305F;

		ammoModel[2].addShapeBox(2.2F, -0.45F, 0F, 1, 2, 1, 0F,-0.4F, 0F, -0.2F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.2F); // Box 65
		ammoModel[2].setRotationPoint(5F, -2.1F, -0.75F);
		ammoModel[2].rotateAngleZ = 0.12217305F;

		ammoModel[3].addShapeBox(-0.4F, -0.45F, 0F, 1, 2, 1, 0F,-0.4F, 0F, -0.3F, -0.4F, 0F, -0.15F, -0.4F, 0F, -0.15F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.15F, -0.4F, 0F, -0.15F, -0.4F, 0F, -0.3F); // Box 66
		ammoModel[3].setRotationPoint(5F, -2.1F, -0.75F);
		ammoModel[3].rotateAngleZ = 0.12217305F;

		ammoModel[4].addShapeBox(0.2F, 1F, 0F, 2, 1, 1, 0F,0F, -0.45F, -0.1F, 0F, -0.45F, -0.1F, 0F, -0.45F, -0.1F, 0F, -0.45F, -0.1F, 0F, -0.45F, -0.1F, 0F, -0.45F, -0.1F, 0F, -0.45F, -0.1F, 0F, -0.45F, -0.1F); // Box 67
		ammoModel[4].setRotationPoint(5F, -2.1F, -0.75F);
		ammoModel[4].rotateAngleZ = 0.12217305F;
	}

	private void initslideModel_1()
	{
		slideModel[0] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 54
		slideModel[1] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 55
		slideModel[2] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 56
		slideModel[3] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 57
		slideModel[4] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 58
		slideModel[5] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 59
		slideModel[6] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 60
		slideModel[7] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 61
		slideModel[8] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 62

		slideModel[0].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.1F, -0.35F, -0.1F, -0.6F, -0.35F, -0.1F, -0.6F, -0.35F, -0.1F, -0.1F, -0.35F, -0.1F, -0.1F, -0.3F, -0.05F, -0.6F, -0.3F, -0.05F, -0.6F, -0.3F, -0.05F, -0.1F, -0.3F, -0.05F); // Box 54
		slideModel[0].setRotationPoint(5.1F, -4.3F, -0.75F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.1F, -0.35F, -0.3F, -0.1F, -0.35F, -0.3F, -0.1F, -0.35F, -0.3F, -0.1F, -0.35F, -0.3F, -0.1F, -0.35F, -0.1F, -0.1F, -0.35F, -0.1F, -0.1F, -0.35F, -0.1F, -0.1F, -0.35F, -0.1F); // Box 55
		slideModel[1].setRotationPoint(5.1F, -4.6F, -0.75F);

		slideModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.3F, -0.2F, -0.25F, -0.3F, -0.2F, -0.25F, -0.3F, -0.3F, -0.35F, -0.3F, -0.3F, -0.35F, -0.1F, -0.2F, -0.35F, -0.1F, -0.2F, -0.35F, -0.1F, -0.3F, -0.35F, -0.1F); // Box 56
		slideModel[2].setRotationPoint(6.7F, -4.6F, -0.75F);

		slideModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.35F, -0.05F, -0.35F, -0.35F, -0.05F, -0.35F, -0.35F, -0.05F, -0.35F, -0.35F, -0.05F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F); // Box 57
		slideModel[3].setRotationPoint(7.15F, -4.3F, -0.75F);

		slideModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.35F, -0.2F, -0.25F, -0.35F, -0.35F, -0.05F, -0.35F, -0.35F, -0.05F, -0.35F, -0.35F, -0.05F, -0.35F, -0.35F, -0.05F); // Box 58
		slideModel[4].setRotationPoint(7.15F, -4.6F, -0.75F);

		slideModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 59
		slideModel[5].setRotationPoint(4.5F, -4.3F, -0.75F);

		slideModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F); // Box 60
		slideModel[6].setRotationPoint(4.5F, -4.65F, -0.75F);

		slideModel[7].addShapeBox(0F, -0.05F, 0.1F, 1, 1, 1, 0F,-0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F); // Box 61
		slideModel[7].setRotationPoint(4.5F, -4.75F, -0.25F);
		slideModel[7].rotateAngleX = -0.61086524F;

		slideModel[8].addShapeBox(0F, -0.5F, 0.1F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 62
		slideModel[8].setRotationPoint(4.5F, -4.75F, -0.25F);
		slideModel[8].rotateAngleX = -0.61086524F;
	}
}