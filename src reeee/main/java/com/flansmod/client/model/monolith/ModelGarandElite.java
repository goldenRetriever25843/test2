//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelGarandElite extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelGarandElite() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[91];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 6
		gunModel[7] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 9
		gunModel[8] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 10
		gunModel[9] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 11
		gunModel[10] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 12
		gunModel[11] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 13
		gunModel[12] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 14
		gunModel[13] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 15
		gunModel[14] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 16
		gunModel[15] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 17
		gunModel[16] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 18
		gunModel[17] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 19
		gunModel[18] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 20
		gunModel[19] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 21
		gunModel[20] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 22
		gunModel[21] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 23
		gunModel[22] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 24
		gunModel[23] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 25
		gunModel[24] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 26
		gunModel[25] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 27
		gunModel[26] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 28
		gunModel[27] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 29
		gunModel[28] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 30
		gunModel[29] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 31
		gunModel[30] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 32
		gunModel[31] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 33
		gunModel[32] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 34
		gunModel[33] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 35
		gunModel[34] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 36
		gunModel[35] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 37
		gunModel[36] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 38
		gunModel[37] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 39
		gunModel[38] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 40
		gunModel[39] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 41
		gunModel[40] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 42
		gunModel[41] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 43
		gunModel[42] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 44
		gunModel[43] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 45
		gunModel[44] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 46
		gunModel[45] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 47
		gunModel[46] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 48
		gunModel[47] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 49
		gunModel[48] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 50
		gunModel[49] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 51
		gunModel[50] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 53
		gunModel[51] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 55
		gunModel[52] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 57
		gunModel[53] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 58
		gunModel[54] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 59
		gunModel[55] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 60
		gunModel[56] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 61
		gunModel[57] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 62
		gunModel[58] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 63
		gunModel[59] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 64
		gunModel[60] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 65
		gunModel[61] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 67
		gunModel[62] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 68
		gunModel[63] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 69
		gunModel[64] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 70
		gunModel[65] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 71
		gunModel[66] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 72
		gunModel[67] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 73
		gunModel[68] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 74
		gunModel[69] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 75
		gunModel[70] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 76
		gunModel[71] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 77
		gunModel[72] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 78
		gunModel[73] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 79
		gunModel[74] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 80
		gunModel[75] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 81
		gunModel[76] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 82
		gunModel[77] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 83
		gunModel[78] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 84
		gunModel[79] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 85
		gunModel[80] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 86
		gunModel[81] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 87
		gunModel[82] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 88
		gunModel[83] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 0
		gunModel[84] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 1
		gunModel[85] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 2
		gunModel[86] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 3
		gunModel[87] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 4
		gunModel[88] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 5
		gunModel[89] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Box 6
		gunModel[90] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 7

		gunModel[0].addBox(0F, 0F, 0F, 21, 13, 12, 0F); // Box 0
		gunModel[0].setRotationPoint(20F, -33F, 0F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 45, 13, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, 0F); // Box 1
		gunModel[1].setRotationPoint(41F, -33F, 0F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 28, 9, 12, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 0F, -1F); // Box 2
		gunModel[2].setRotationPoint(86F, -33F, 0F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 10, 5, 12, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		gunModel[3].setRotationPoint(54F, -42F, 0F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 3, 5, 11, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 4
		gunModel[4].setRotationPoint(64F, -41.5F, 0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 47, 5, 12, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 5
		gunModel[5].setRotationPoint(67F, -42F, 0F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 3, 4, 9, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		gunModel[6].setRotationPoint(114F, -41F, 1.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 28, 2, 12, 0F, 0F, 0F, -0.4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 9
		gunModel[7].setRotationPoint(86F, -37F, 0F);

		gunModel[8].addBox(0F, 0F, 0F, 3, 4, 9, 0F); // Box 10
		gunModel[8].setRotationPoint(114F, -37F, 1.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 3, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 11
		gunModel[9].setRotationPoint(114F, -33F, 1.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 47, 5, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 12
		gunModel[10].setRotationPoint(117F, -33F, 0.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 47, 4, 11, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		gunModel[11].setRotationPoint(117F, -42F, 0.5F);

		gunModel[12].addBox(0F, 0F, 0F, 47, 5, 11, 0F); // Box 14
		gunModel[12].setRotationPoint(117F, -38F, 0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 2, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 15
		gunModel[13].setRotationPoint(164F, -33F, 1.5F);

		gunModel[14].addBox(0F, 0F, 0F, 2, 4, 9, 0F); // Box 16
		gunModel[14].setRotationPoint(164F, -37F, 1.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 2, 4, 9, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		gunModel[15].setRotationPoint(164F, -41F, 1.5F);

		gunModel[16].addBox(0F, 0F, 0F, 36, 5, 5, 0F); // Box 18
		gunModel[16].setRotationPoint(166F, -39F, 3.5F);

		gunModel[17].addBox(0F, 0F, 0F, 34, 3, 3, 0F); // Box 19
		gunModel[17].setRotationPoint(166F, -34F, 4.5F);

		gunModel[18].addBox(0F, 0F, 0F, 4, 3, 3, 0F); // Box 20
		gunModel[18].setRotationPoint(202F, -38.5F, 4.5F);

		gunModel[19].addBox(0F, 0F, 0F, 6, 3, 1, 0F); // Box 21
		gunModel[19].setRotationPoint(193F, -42F, 3.5F);

		gunModel[20].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 22
		gunModel[20].setRotationPoint(193F, -45F, 3.5F);

		gunModel[21].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 23
		gunModel[21].setRotationPoint(197F, -45F, 3.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		gunModel[22].setRotationPoint(193F, -46F, 3.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 25
		gunModel[23].setRotationPoint(195F, -45F, 3.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 26
		gunModel[24].setRotationPoint(196F, -45F, 3.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		gunModel[25].setRotationPoint(196F, -43F, 3.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		gunModel[26].setRotationPoint(195F, -43F, 3.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		gunModel[27].setRotationPoint(193F, -46F, 7.5F);

		gunModel[28].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 30
		gunModel[28].setRotationPoint(193F, -45F, 7.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 31
		gunModel[29].setRotationPoint(195F, -45F, 7.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 32
		gunModel[30].setRotationPoint(196F, -45F, 7.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		gunModel[31].setRotationPoint(196F, -43F, 7.5F);

		gunModel[32].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 34
		gunModel[32].setRotationPoint(197F, -45F, 7.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		gunModel[33].setRotationPoint(195F, -43F, 7.5F);

		gunModel[34].addBox(0F, 0F, 0F, 6, 3, 1, 0F); // Box 36
		gunModel[34].setRotationPoint(193F, -42F, 7.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		gunModel[35].setRotationPoint(193F, -44F, 5.5F);

		gunModel[36].addBox(0F, 0F, 0F, 5, 2, 1, 0F); // Box 38
		gunModel[36].setRotationPoint(178F, -31F, 5.5F);

		gunModel[37].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 39
		gunModel[37].setRotationPoint(166F, -31F, 5.5F);

		gunModel[38].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 40
		gunModel[38].setRotationPoint(114F, -29F, 5.5F);

		gunModel[39].addBox(0F, 0F, 0F, 32, 4, 10, 0F); // Box 41
		gunModel[39].setRotationPoint(54F, -37F, 1F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 28, 2, 12, 0F, 0F, 0F, -0.4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.4F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F); // Box 42
		gunModel[40].setRotationPoint(86F, -34.5F, 0F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 28, 1, 10, 0F, 0F, 0F, -0.4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.4F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F); // Box 43
		gunModel[41].setRotationPoint(86F, -35F, 1F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 2, 5, 12, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 44
		gunModel[42].setRotationPoint(52F, -42F, 0F);

		gunModel[43].addBox(0F, 0F, 0F, 7, 5, 10, 0F); // Box 45
		gunModel[43].setRotationPoint(47F, -38F, 1F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 7, 1, 10, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		gunModel[44].setRotationPoint(47F, -39F, 1F);

		gunModel[45].addBox(0F, 0F, 0F, 7, 7, 10, 0F); // Box 47
		gunModel[45].setRotationPoint(41F, -40F, 1F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 4, 3, 10, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		gunModel[46].setRotationPoint(48F, -42F, 1F);

		gunModel[47].addBox(0F, 0F, 0F, 5, 2, 10, 0F); // Box 49
		gunModel[47].setRotationPoint(43F, -42F, 1F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 5, 2, 8, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		gunModel[48].setRotationPoint(38F, -42F, 2F);

		gunModel[49].addBox(0F, 0F, 0F, 34, 4, 10, 0F); // Box 51
		gunModel[49].setRotationPoint(7F, -37F, 1F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 2, 5, 9, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		gunModel[50].setRotationPoint(21F, -42F, 1.5F);

		gunModel[51].addBox(0F, 0F, 0F, 24, 13, 12, 0F); // Box 55
		gunModel[51].setRotationPoint(-4F, -33F, 0F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 8, 5, 10, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		gunModel[52].setRotationPoint(-3F, -38F, 1F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 14, 22, 12, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F); // Box 58
		gunModel[53].setRotationPoint(-18F, -33F, 0F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 2, 18, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 59
		gunModel[54].setRotationPoint(-20F, -28F, 0F);

		gunModel[55].addBox(0F, 0F, 0F, 5, 18, 12, 0F); // Box 60
		gunModel[55].setRotationPoint(-25F, -28F, 0F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 9, 19, 12, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		gunModel[56].setRotationPoint(-34F, -29F, 0F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 48, 19, 12, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 62
		gunModel[57].setRotationPoint(-82F, -29F, 0F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 47, 15, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, -2F, 0F, 0F); // Box 63
		gunModel[58].setRotationPoint(-81F, -10F, 0F);

		gunModel[59].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 64
		gunModel[59].setRotationPoint(10F, -45F, 3.5F);

		gunModel[60].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 65
		gunModel[60].setRotationPoint(10F, -45F, 7.5F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 67
		gunModel[61].setRotationPoint(10F, -44F, 6.5F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 68
		gunModel[62].setRotationPoint(10F, -46F, 3.5F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		gunModel[63].setRotationPoint(10F, -46F, 6.5F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		gunModel[64].setRotationPoint(10F, -44F, 3.5F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		gunModel[65].setRotationPoint(10F, -47F, 4.5F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 72
		gunModel[66].setRotationPoint(10F, -43F, 4.5F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		gunModel[67].setRotationPoint(8F, -46F, 1.5F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		gunModel[68].setRotationPoint(8F, -44F, 1.5F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		gunModel[69].setRotationPoint(8F, -46F, 9.5F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		gunModel[70].setRotationPoint(8F, -44F, 9.5F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		gunModel[71].setRotationPoint(83F, -35F, 0F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 78
		gunModel[72].setRotationPoint(83F, -37F, 0F);

		gunModel[73].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 79
		gunModel[73].setRotationPoint(0F, -20F, 3F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 10, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 80
		gunModel[74].setRotationPoint(1F, -14F, 3F);

		gunModel[75].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 81
		gunModel[75].setRotationPoint(11F, -20F, 3F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 82
		gunModel[76].setRotationPoint(10F, -16F, 3F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 83
		gunModel[77].setRotationPoint(0F, -16F, 3F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 84
		gunModel[78].setRotationPoint(4F, -20F, 5F);

		gunModel[79].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 85
		gunModel[79].setRotationPoint(4F, -19F, 5F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 86
		gunModel[80].setRotationPoint(4F, -16F, 5F);

		gunModel[81].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 87
		gunModel[81].setRotationPoint(14F, -20F, 4F);

		gunModel[82].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 88
		gunModel[82].setRotationPoint(12F, -18F, 4F);

		gunModel[83].addShapeBox(0F, 0F, 0F, 1, 5, 10, 0F, 0F, -2F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -2F, -1F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F); // Box 0
		gunModel[83].setRotationPoint(-4F, -38F, 1F);

		gunModel[84].addShapeBox(0F, 0F, 0F, 3, 6, 10, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		gunModel[84].setRotationPoint(5F, -39F, 1F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 14, 5, 3, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		gunModel[85].setRotationPoint(7F, -42F, 1.5F);

		gunModel[86].addShapeBox(0F, 0F, 0F, 14, 5, 3, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		gunModel[86].setRotationPoint(7F, -42F, 7.5F);

		gunModel[87].addShapeBox(0F, 0F, 0F, 14, 5, 1, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		gunModel[87].setRotationPoint(7F, -42F, 5.5F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 14, 5, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[88].setRotationPoint(7F, -42F, 4.5F);

		gunModel[89].addShapeBox(0F, 0F, 0F, 14, 5, 1, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		gunModel[89].setRotationPoint(7F, -42F, 6.5F);

		gunModel[90].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 7
		gunModel[90].setRotationPoint(10F, -42F, 5.5F);


		ammoModel = new ModelRendererTurbo[17];
		ammoModel[0] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 9
		ammoModel[1] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 20
		ammoModel[2] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 21
		ammoModel[3] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 22
		ammoModel[4] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Box 23
		ammoModel[5] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 24
		ammoModel[6] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 25
		ammoModel[7] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Box 26
		ammoModel[8] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 27
		ammoModel[9] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 28
		ammoModel[10] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 29
		ammoModel[11] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 30
		ammoModel[12] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 31
		ammoModel[13] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 32
		ammoModel[14] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 33
		ammoModel[15] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 34
		ammoModel[16] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Box 35

		ammoModel[0].addBox(0F, 0F, 0F, 7, 18, 7, 0F); // Box 9
		ammoModel[0].setRotationPoint(23F, -39F, 2.5F);

		ammoModel[1].addBox(0F, 0F, 0F, 9, 3, 3, 0F); // Box 20
		ammoModel[1].setRotationPoint(30F, -38F, 3F);

		ammoModel[2].addBox(0F, 0F, 0F, 9, 3, 3, 0F); // Box 21
		ammoModel[2].setRotationPoint(30F, -37F, 6F);

		ammoModel[3].addBox(0F, 0F, 0F, 9, 3, 3, 0F); // Box 22
		ammoModel[3].setRotationPoint(30F, -34F, 3F);

		ammoModel[4].addBox(0F, 0F, 0F, 9, 3, 3, 0F); // Box 23
		ammoModel[4].setRotationPoint(30F, -30F, 3F);

		ammoModel[5].addBox(0F, 0F, 0F, 9, 3, 3, 0F); // Box 24
		ammoModel[5].setRotationPoint(30F, -26F, 3F);

		ammoModel[6].addBox(0F, 0F, 0F, 9, 3, 3, 0F); // Box 25
		ammoModel[6].setRotationPoint(30F, -33F, 6F);

		ammoModel[7].addBox(0F, 0F, 0F, 9, 3, 3, 0F); // Box 26
		ammoModel[7].setRotationPoint(30F, -29F, 6F);

		ammoModel[8].addBox(0F, 0F, 0F, 9, 3, 3, 0F); // Box 27
		ammoModel[8].setRotationPoint(30F, -25F, 6F);

		ammoModel[9].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F, 0F, -0.1F, -0.1F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -0.1F, -0.1F); // Box 28
		ammoModel[9].setRotationPoint(39F, -37F, 6F);

		ammoModel[10].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F, 0F, -0.1F, -0.1F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -0.1F, -0.1F); // Box 29
		ammoModel[10].setRotationPoint(39F, -38F, 3F);

		ammoModel[11].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F, 0F, -0.1F, -0.1F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -0.1F, -0.1F); // Box 30
		ammoModel[11].setRotationPoint(39F, -34F, 3F);

		ammoModel[12].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F, 0F, -0.1F, -0.1F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -0.1F, -0.1F); // Box 31
		ammoModel[12].setRotationPoint(39F, -30F, 3F);

		ammoModel[13].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F, 0F, -0.1F, -0.1F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -0.1F, -0.1F); // Box 32
		ammoModel[13].setRotationPoint(39F, -26F, 3F);

		ammoModel[14].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F, 0F, -0.1F, -0.1F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -0.1F, -0.1F); // Box 33
		ammoModel[14].setRotationPoint(39F, -33F, 6F);

		ammoModel[15].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F, 0F, -0.1F, -0.1F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -0.1F, -0.1F); // Box 34
		ammoModel[15].setRotationPoint(39F, -29F, 6F);

		ammoModel[16].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F, 0F, -0.1F, -0.1F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -0.1F, -0.1F); // Box 35
		ammoModel[16].setRotationPoint(39F, -25F, 6F);


		slideModel = new ModelRendererTurbo[2];
		slideModel[0] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 54
		slideModel[1] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 8

		slideModel[0].addBox(0F, 0F, 0F, 18, 3, 8, 0F); // Box 54
		slideModel[0].setRotationPoint(23F, -40F, 2F);

		slideModel[1].addBox(0F, 0F, 0F, 1, 2, 8, 0F); // Box 8
		slideModel[1].setRotationPoint(37F, -39.5F, -4F);
		
		animationType = EnumAnimationType.RIFLE_TOP;



		translateAll(0F, -1F, -6F);
		gunSlideDistance = 1F;

		flipAll();
	}
}