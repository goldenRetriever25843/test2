//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelEliteM21 extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelEliteM21() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[105];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 6
		gunModel[7] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 7
		gunModel[8] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 8
		gunModel[9] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 9
		gunModel[10] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 10
		gunModel[11] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 11
		gunModel[12] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 12
		gunModel[13] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 13
		gunModel[14] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 14
		gunModel[15] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 15
		gunModel[16] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 16
		gunModel[17] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 17
		gunModel[18] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 18
		gunModel[19] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 20
		gunModel[20] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 21
		gunModel[21] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 22
		gunModel[22] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 23
		gunModel[23] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 24
		gunModel[24] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 25
		gunModel[25] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 26
		gunModel[26] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 27
		gunModel[27] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 28
		gunModel[28] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 29
		gunModel[29] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 30
		gunModel[30] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 31
		gunModel[31] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 32
		gunModel[32] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 33
		gunModel[33] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 34
		gunModel[34] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 35
		gunModel[35] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 36
		gunModel[36] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 37
		gunModel[37] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 38
		gunModel[38] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 39
		gunModel[39] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 40
		gunModel[40] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 41
		gunModel[41] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 42
		gunModel[42] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 43
		gunModel[43] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 44
		gunModel[44] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 45
		gunModel[45] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 46
		gunModel[46] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 47
		gunModel[47] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 48
		gunModel[48] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 49
		gunModel[49] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 50
		gunModel[50] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 51
		gunModel[51] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 52
		gunModel[52] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 53
		gunModel[53] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 54
		gunModel[54] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 55
		gunModel[55] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 56
		gunModel[56] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 57
		gunModel[57] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 58
		gunModel[58] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 59
		gunModel[59] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 60
		gunModel[60] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 61
		gunModel[61] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 62
		gunModel[62] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 63
		gunModel[63] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 64
		gunModel[64] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 65
		gunModel[65] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 66
		gunModel[66] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 67
		gunModel[67] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 68
		gunModel[68] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 69
		gunModel[69] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 70
		gunModel[70] = new ModelRendererTurbo(this, 361, 97, textureX, textureY); // Box 71
		gunModel[71] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 72
		gunModel[72] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 73
		gunModel[73] = new ModelRendererTurbo(this, 265, 105, textureX, textureY); // Box 74
		gunModel[74] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 75
		gunModel[75] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Box 76
		gunModel[76] = new ModelRendererTurbo(this, 385, 105, textureX, textureY); // Box 77
		gunModel[77] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 78
		gunModel[78] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Box 79
		gunModel[79] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 80
		gunModel[80] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Box 81
		gunModel[81] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 82
		gunModel[82] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 83
		gunModel[83] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // Box 84
		gunModel[84] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // Box 85
		gunModel[85] = new ModelRendererTurbo(this, 281, 137, textureX, textureY); // Box 86
		gunModel[86] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 87
		gunModel[87] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 88
		gunModel[88] = new ModelRendererTurbo(this, 481, 113, textureX, textureY); // Box 89
		gunModel[89] = new ModelRendererTurbo(this, 281, 121, textureX, textureY); // Box 90
		gunModel[90] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 91
		gunModel[91] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 92
		gunModel[92] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // Box 93
		gunModel[93] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 94
		gunModel[94] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 95
		gunModel[95] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 96
		gunModel[96] = new ModelRendererTurbo(this, 217, 137, textureX, textureY); // Box 97
		gunModel[97] = new ModelRendererTurbo(this, 337, 137, textureX, textureY); // Box 98
		gunModel[98] = new ModelRendererTurbo(this, 393, 137, textureX, textureY); // Box 99
		gunModel[99] = new ModelRendererTurbo(this, 89, 153, textureX, textureY); // Box 100
		gunModel[100] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Box 101
		gunModel[101] = new ModelRendererTurbo(this, 425, 145, textureX, textureY); // Box 102
		gunModel[102] = new ModelRendererTurbo(this, 249, 153, textureX, textureY); // Box 103
		gunModel[103] = new ModelRendererTurbo(this, 329, 153, textureX, textureY); // Box 104
		gunModel[104] = new ModelRendererTurbo(this, 361, 153, textureX, textureY); // Box 105

		gunModel[0].addBox(0F, 0F, 0F, 30, 13, 12, 0F); // Box 0
		gunModel[0].setRotationPoint(-33F, -23F, 0F);

		gunModel[1].addBox(0F, 0F, 0F, 19, 12, 12, 0F); // Box 1
		gunModel[1].setRotationPoint(-3F, -23F, 0F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 2
		gunModel[2].setRotationPoint(-3F, -11F, 0F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 13, 12, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 3
		gunModel[3].setRotationPoint(16F, -23F, 0F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 55, 4, 11, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		gunModel[4].setRotationPoint(-26F, -27F, 0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 17, 2, 11, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[5].setRotationPoint(-18F, -29F, 0.5F);

		gunModel[6].addBox(0F, 0F, 0F, 17, 2, 7, 0F); // Box 6
		gunModel[6].setRotationPoint(-1F, -29F, 2.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 4, 4, 3, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		gunModel[7].setRotationPoint(-11F, -33F, 0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		gunModel[8].setRotationPoint(-12F, -35F, 0.5F);

		gunModel[9].addBox(0F, 0F, 0F, 2, 6, 3, 0F); // Box 9
		gunModel[9].setRotationPoint(-14F, -35F, 0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		gunModel[10].setRotationPoint(-16F, -35F, 0.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		gunModel[11].setRotationPoint(-16F, -35F, 8.5F);

		gunModel[12].addBox(0F, 0F, 0F, 2, 6, 3, 0F); // Box 12
		gunModel[12].setRotationPoint(-14F, -35F, 8.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		gunModel[13].setRotationPoint(-12F, -35F, 8.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 4, 4, 3, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		gunModel[14].setRotationPoint(-11F, -33F, 8.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		gunModel[15].setRotationPoint(-7F, -31F, 8.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		gunModel[16].setRotationPoint(-7F, -31F, 0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 10, 4, 10, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		gunModel[17].setRotationPoint(19F, -31F, 1F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		gunModel[18].setRotationPoint(16F, -29F, 2.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 82, 3, 12, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		gunModel[19].setRotationPoint(29F, -31F, 0F);

		gunModel[20].addBox(0F, 0F, 0F, 42, 8, 13, 0F); // Box 21
		gunModel[20].setRotationPoint(29F, -28F, -0.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 42, 8, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 22
		gunModel[21].setRotationPoint(29F, -20F, -0.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 7, 8, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 23
		gunModel[22].setRotationPoint(71F, -20F, -0.5F);

		gunModel[23].addBox(0F, 0F, 0F, 5, 2, 12, 0F); // Box 24
		gunModel[23].setRotationPoint(71F, -28F, 0F);

		gunModel[24].addBox(0F, 0F, 0F, 4, 2, 12, 0F); // Box 25
		gunModel[24].setRotationPoint(81F, -28F, 0F);

		gunModel[25].addBox(0F, 0F, 0F, 3, 2, 12, 0F); // Box 26
		gunModel[25].setRotationPoint(90F, -28F, 0F);

		gunModel[26].addBox(0F, 0F, 0F, 3, 2, 12, 0F); // Box 27
		gunModel[26].setRotationPoint(98F, -28F, 0F);

		gunModel[27].addBox(0F, 0F, 0F, 5, 2, 12, 0F); // Box 28
		gunModel[27].setRotationPoint(106F, -28F, 0F);

		gunModel[28].addBox(0F, 0F, 0F, 40, 3, 12, 0F); // Box 29
		gunModel[28].setRotationPoint(71F, -26F, 0F);

		gunModel[29].addBox(0F, 0F, 0F, 13, 1, 12, 0F); // Box 30
		gunModel[29].setRotationPoint(71F, -23F, 0F);

		gunModel[30].addBox(0F, 0F, 0F, 14, 1, 12, 0F); // Box 31
		gunModel[30].setRotationPoint(97F, -23F, 0F);

		gunModel[31].addBox(0F, 0F, 0F, 3, 1, 12, 0F); // Box 32
		gunModel[31].setRotationPoint(89F, -23F, 0F);

		gunModel[32].addBox(0F, 0F, 0F, 40, 2, 12, 0F); // Box 33
		gunModel[32].setRotationPoint(71F, -22F, 0F);

		gunModel[33].addBox(0F, 0F, 0F, 33, 1, 12, 0F); // Box 34
		gunModel[33].setRotationPoint(78F, -20F, 0F);

		gunModel[34].addBox(0F, 0F, 0F, 33, 6, 12, 0F); // Box 35
		gunModel[34].setRotationPoint(78F, -18F, 0F);

		gunModel[35].addBox(0F, 0F, 0F, 5, 1, 12, 0F); // Box 36
		gunModel[35].setRotationPoint(81F, -19F, 0F);

		gunModel[36].addBox(0F, 0F, 0F, 5, 1, 12, 0F); // Box 37
		gunModel[36].setRotationPoint(92F, -19F, 0F);

		gunModel[37].addBox(0F, 0F, 0F, 7, 1, 12, 0F); // Box 38
		gunModel[37].setRotationPoint(104F, -19F, 0F);

		gunModel[38].addBox(0F, 0F, 0F, 7, 1, 10, 0F); // Box 39
		gunModel[38].setRotationPoint(97F, -19F, 1F);

		gunModel[39].addBox(0F, 0F, 0F, 40, 1, 12, 0F); // Box 40
		gunModel[39].setRotationPoint(71F, -28F, 0F);

		gunModel[40].addBox(0F, 0F, 0F, 74, 5, 5, 0F); // Box 41
		gunModel[40].setRotationPoint(111F, -28F, 3.5F);

		gunModel[41].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 42
		gunModel[41].setRotationPoint(120F, -28.5F, 3F);

		gunModel[42].addBox(0F, 0F, 0F, 8, 7, 7, 0F); // Box 43
		gunModel[42].setRotationPoint(157F, -29F, 2.5F);

		gunModel[43].addBox(0F, 0F, 0F, 5, 3, 2, 0F); // Box 44
		gunModel[43].setRotationPoint(160F, -32F, 5F);

		gunModel[44].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 45
		gunModel[44].setRotationPoint(160F, -34F, 5F);

		gunModel[45].addBox(0F, 0F, 0F, 21, 4, 4, 0F); // Box 46
		gunModel[45].setRotationPoint(111F, -22F, 4F);

		gunModel[46].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 47
		gunModel[46].setRotationPoint(120F, -22.5F, 5F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		gunModel[47].setRotationPoint(38F, -32F, 1F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		gunModel[48].setRotationPoint(41F, -32F, 1F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		gunModel[49].setRotationPoint(44F, -32F, 1F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		gunModel[50].setRotationPoint(63F, -32F, 1F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		gunModel[51].setRotationPoint(60F, -32F, 1F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		gunModel[52].setRotationPoint(57F, -32F, 1F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		gunModel[53].setRotationPoint(72F, -32F, 1F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		gunModel[54].setRotationPoint(69F, -32F, 1F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		gunModel[55].setRotationPoint(66F, -32F, 1F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		gunModel[56].setRotationPoint(90F, -32F, 1F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		gunModel[57].setRotationPoint(87F, -32F, 1F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		gunModel[58].setRotationPoint(84F, -32F, 1F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		gunModel[59].setRotationPoint(81F, -32F, 1F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		gunModel[60].setRotationPoint(78F, -32F, 1F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		gunModel[61].setRotationPoint(75F, -32F, 1F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		gunModel[62].setRotationPoint(102F, -32F, 1F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		gunModel[63].setRotationPoint(99F, -32F, 1F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		gunModel[64].setRotationPoint(96F, -32F, 1F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		gunModel[65].setRotationPoint(93F, -32F, 1F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		gunModel[66].setRotationPoint(105F, -32F, 1F);

		gunModel[67].addBox(0F, 0F, 0F, 11, 4, 10, 0F); // Box 68
		gunModel[67].setRotationPoint(46F, -35F, 1F);

		gunModel[68].addBox(0F, 0F, 0F, 6, 16, 10, 0F); // Box 69
		gunModel[68].setRotationPoint(51F, -51F, 1F);

		gunModel[69].addBox(0F, 0F, 0F, 18, 8, 8, 0F); // Box 70
		gunModel[69].setRotationPoint(45F, -48F, 2F);

		gunModel[70].addBox(0F, 0F, 0F, 8, 11, 10, 0F); // Box 71
		gunModel[70].setRotationPoint(37F, -49F, 1F);

		gunModel[71].addBox(0F, 0F, 0F, 16, 8, 8, 0F); // Box 72
		gunModel[71].setRotationPoint(21F, -48F, 2F);

		gunModel[72].addBox(0F, 0F, 0F, 6, 16, 10, 0F); // Box 73
		gunModel[72].setRotationPoint(26F, -51F, 1F);

		gunModel[73].addBox(0F, 0F, 0F, 11, 4, 10, 0F); // Box 74
		gunModel[73].setRotationPoint(26F, -35F, 1F);

		gunModel[74].addBox(0F, 0F, 0F, 6, 10, 10, 0F); // Box 75
		gunModel[74].setRotationPoint(15F, -49F, 1F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 16, 14, 14, 0F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F); // Box 76
		gunModel[75].setRotationPoint(63F, -51F, -1F);

		gunModel[76].addBox(0F, 0F, 0F, 10, 14, 14, 0F); // Box 77
		gunModel[76].setRotationPoint(79F, -51F, -1F);

		gunModel[77].addBox(0F, 0F, 0F, 6, 4, 6, 0F); // Box 78
		gunModel[77].setRotationPoint(38F, -53F, 3F);

		gunModel[78].addBox(0F, 0F, 0F, 7, 2, 7, 0F); // Box 79
		gunModel[78].setRotationPoint(37.5F, -55F, 2.5F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 10, 12, 12, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 80
		gunModel[79].setRotationPoint(5F, -50F, 0F);

		gunModel[80].addBox(0F, 0F, 0F, 9, 12, 12, 0F); // Box 81
		gunModel[80].setRotationPoint(-4F, -50F, 0F);

		gunModel[81].addBox(0F, 0F, 0F, 9, 9, 12, 0F); // Box 82
		gunModel[81].setRotationPoint(-33F, -10F, 0F);

		gunModel[82].addShapeBox(0F, 0F, 0F, 9, 13, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F); // Box 83
		gunModel[82].setRotationPoint(-33F, -1F, 0F);

		gunModel[83].addShapeBox(0F, 0F, 0F, 12, 17, 12, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		gunModel[83].setRotationPoint(-45F, -7F, 0F);

		gunModel[84].addShapeBox(0F, 0F, 0F, 13, 2, 12, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		gunModel[84].setRotationPoint(-46F, 10F, 0F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 13, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F); // Box 86
		gunModel[85].setRotationPoint(-46F, 12F, 0F);

		gunModel[86].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Box 87
		gunModel[86].setRotationPoint(-34F, 13F, 0F);
		gunModel[86].rotateAngleZ = -0.15707963F;

		gunModel[87].addBox(0F, 0F, 0F, 1, 4, 7, 0F); // Box 88
		gunModel[87].setRotationPoint(-23F, -10F, 2.5F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 5, 4, 7, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 89
		gunModel[88].setRotationPoint(-23F, -6F, 2.5F);

		gunModel[89].addShapeBox(0F, 0F, 0F, 6, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 90
		gunModel[89].setRotationPoint(-19F, -2F, 2.5F);

		gunModel[90].addShapeBox(0F, 0F, 0F, 4, 4, 7, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 91
		gunModel[90].setRotationPoint(-14F, -6F, 2.5F);

		gunModel[91].addBox(0F, 0F, 0F, 1, 4, 7, 0F); // Box 92
		gunModel[91].setRotationPoint(-11F, -10F, 2.5F);

		gunModel[92].addBox(0F, 0F, 0F, 2, 6, 7, 0F); // Box 93
		gunModel[92].setRotationPoint(0F, -12F, 2.5F);
		gunModel[92].rotateAngleZ = -0.12217305F;

		gunModel[93].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 94
		gunModel[93].setRotationPoint(-18F, -10F, 4.5F);

		gunModel[94].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 95
		gunModel[94].setRotationPoint(-18F, -7F, 4.5F);

		gunModel[95].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 96
		gunModel[95].setRotationPoint(-18F, -5F, 4.5F);
		gunModel[95].rotateAngleZ = 0.31415927F;

		gunModel[96].addBox(0F, 0F, 0F, 8, 9, 9, 0F); // Box 97
		gunModel[96].setRotationPoint(-41F, -22F, 1F);

		gunModel[97].addBox(0F, 0F, 0F, 19, 7, 7, 0F); // Box 98
		gunModel[97].setRotationPoint(-60F, -21F, 2F);

		gunModel[98].addShapeBox(0F, 0F, 0F, 12, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 99
		gunModel[98].setRotationPoint(-60F, -14F, 2F);

		gunModel[99].addShapeBox(0F, 0F, 0F, 41, 21, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 0F, 0F); // Box 100
		gunModel[99].setRotationPoint(-101F, -28F, 0F);

		gunModel[100].addShapeBox(0F, 0F, 0F, 6, 7, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 101
		gunModel[100].setRotationPoint(-60F, -28F, 0F);

		gunModel[101].addBox(0F, 0F, 0F, 5, 7, 7, 0F); // Box 102
		gunModel[101].setRotationPoint(-104F, -22F, 2F);

		gunModel[102].addShapeBox(0F, 0F, 0F, 5, 25, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 103
		gunModel[102].setRotationPoint(-104F, -15F, 2F);

		gunModel[103].addBox(0F, 0F, 0F, 5, 18, 7, 0F); // Box 104
		gunModel[103].setRotationPoint(-99F, -8F, 2F);

		gunModel[104].addBox(0F, 0F, 0F, 5, 30, 7, 0F); // Box 105
		gunModel[104].setRotationPoint(-73F, -14F, 2F);
		gunModel[104].rotateAngleZ = -0.9250245F;


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 19

		ammoModel[0].addShapeBox(0F, 0F, 0F, 19, 26, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 19
		ammoModel[0].setRotationPoint(3F, -11F, 1F);
		ammoModel[0].rotateAngleZ = 0.06981317F;



		translateAll(0F, 0F, 0F);
		
		gunSlideDistance = 0.6F;
		animationType = EnumAnimationType.BOTTOM_CLIP;


		flipAll();
	}
}