//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 09.01.2016 - 23:59:13
// Last changed on: 09.01.2016 - 23:59:13

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelFamasVini extends ModelGun //Same as Filename
{
	int textureX = 32;
	int textureY = 32;

	public ModelFamasVini() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[118];
		gunModel[0] = new ModelRendererTurbo(this, 0, 13, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 6
		gunModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 7
		gunModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 8
		gunModel[9] = new ModelRendererTurbo(this, 0, 16, textureX, textureY); // Box 9
		gunModel[10] = new ModelRendererTurbo(this, 0, 16, textureX, textureY); // Box 10
		gunModel[11] = new ModelRendererTurbo(this, 0, 16, textureX, textureY); // Box 11
		gunModel[12] = new ModelRendererTurbo(this, 0, 16, textureX, textureY); // Box 12
		gunModel[13] = new ModelRendererTurbo(this, 0, 16, textureX, textureY); // Box 13
		gunModel[14] = new ModelRendererTurbo(this, 0, 16, textureX, textureY); // Box 14
		gunModel[15] = new ModelRendererTurbo(this, 0, 16, textureX, textureY); // Box 15
		gunModel[16] = new ModelRendererTurbo(this, 0, 16, textureX, textureY); // Box 16
		gunModel[17] = new ModelRendererTurbo(this, 0, 16, textureX, textureY); // Box 17
		gunModel[18] = new ModelRendererTurbo(this, 0, 19, textureX, textureY); // Box 18
		gunModel[19] = new ModelRendererTurbo(this, 0, 19, textureX, textureY); // Box 19
		gunModel[20] = new ModelRendererTurbo(this, 0, 19, textureX, textureY); // Box 20
		gunModel[21] = new ModelRendererTurbo(this, 0, 19, textureX, textureY); // Box 21
		gunModel[22] = new ModelRendererTurbo(this, 0, 19, textureX, textureY); // Box 22
		gunModel[23] = new ModelRendererTurbo(this, 0, 19, textureX, textureY); // Box 23
		gunModel[24] = new ModelRendererTurbo(this, 0, 19, textureX, textureY); // Box 24
		gunModel[25] = new ModelRendererTurbo(this, 0, 19, textureX, textureY); // Box 25
		gunModel[26] = new ModelRendererTurbo(this, 0, 19, textureX, textureY); // Box 26
		gunModel[27] = new ModelRendererTurbo(this, 0, 19, textureX, textureY); // Box 27
		gunModel[28] = new ModelRendererTurbo(this, 0, 19, textureX, textureY); // Box 28
		gunModel[29] = new ModelRendererTurbo(this, 0, 19, textureX, textureY); // Box 29
		gunModel[30] = new ModelRendererTurbo(this, 0, 19, textureX, textureY); // Box 30
		gunModel[31] = new ModelRendererTurbo(this, 0, 19, textureX, textureY); // Box 31
		gunModel[32] = new ModelRendererTurbo(this, 0, 19, textureX, textureY); // Box 32
		gunModel[33] = new ModelRendererTurbo(this, 0, 19, textureX, textureY); // Box 33
		gunModel[34] = new ModelRendererTurbo(this, 0, 19, textureX, textureY); // Box 34
		gunModel[35] = new ModelRendererTurbo(this, 0, 19, textureX, textureY); // Box 35
		gunModel[36] = new ModelRendererTurbo(this, 0, 19, textureX, textureY); // Box 36
		gunModel[37] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 37
		gunModel[38] = new ModelRendererTurbo(this, 0, 19, textureX, textureY); // Box 38
		gunModel[39] = new ModelRendererTurbo(this, 0, 19, textureX, textureY); // Box 39
		gunModel[40] = new ModelRendererTurbo(this, 0, 19, textureX, textureY); // Box 40
		gunModel[41] = new ModelRendererTurbo(this, 0, 19, textureX, textureY); // Box 41
		gunModel[42] = new ModelRendererTurbo(this, 0, 19, textureX, textureY); // Box 42
		gunModel[43] = new ModelRendererTurbo(this, 0, 19, textureX, textureY); // Box 43
		gunModel[44] = new ModelRendererTurbo(this, 0, 19, textureX, textureY); // Box 44
		gunModel[45] = new ModelRendererTurbo(this, 0, 19, textureX, textureY); // Box 45
		gunModel[46] = new ModelRendererTurbo(this, 0, 19, textureX, textureY); // Box 46
		gunModel[47] = new ModelRendererTurbo(this, 0, 19, textureX, textureY); // Box 47
		gunModel[48] = new ModelRendererTurbo(this, 0, 19, textureX, textureY); // Box 48
		gunModel[49] = new ModelRendererTurbo(this, 0, 4, textureX, textureY); // Box 49
		gunModel[50] = new ModelRendererTurbo(this, 9, 4, textureX, textureY); // Box 53
		gunModel[51] = new ModelRendererTurbo(this, 9, 4, textureX, textureY); // Box 54
		gunModel[52] = new ModelRendererTurbo(this, 0, 13, textureX, textureY); // Box 55
		gunModel[53] = new ModelRendererTurbo(this, 0, 13, textureX, textureY); // Box 56
		gunModel[54] = new ModelRendererTurbo(this, 0, 13, textureX, textureY); // Box 57
		gunModel[55] = new ModelRendererTurbo(this, 0, 13, textureX, textureY); // Box 58
		gunModel[56] = new ModelRendererTurbo(this, 0, 13, textureX, textureY); // Box 59
		gunModel[57] = new ModelRendererTurbo(this, 0, 13, textureX, textureY); // Box 60
		gunModel[58] = new ModelRendererTurbo(this, 0, 13, textureX, textureY); // Box 61
		gunModel[59] = new ModelRendererTurbo(this, 0, 13, textureX, textureY); // Box 62
		gunModel[60] = new ModelRendererTurbo(this, 0, 13, textureX, textureY); // Box 63
		gunModel[61] = new ModelRendererTurbo(this, 0, 13, textureX, textureY); // Box 64
		gunModel[62] = new ModelRendererTurbo(this, 0, 13, textureX, textureY); // Box 65
		gunModel[63] = new ModelRendererTurbo(this, 0, 13, textureX, textureY); // Box 67
		gunModel[64] = new ModelRendererTurbo(this, 0, 13, textureX, textureY); // Box 68
		gunModel[65] = new ModelRendererTurbo(this, 0, 13, textureX, textureY); // Box 69
		gunModel[66] = new ModelRendererTurbo(this, 0, 13, textureX, textureY); // Box 70
		gunModel[67] = new ModelRendererTurbo(this, 0, 13, textureX, textureY); // Box 71
		gunModel[68] = new ModelRendererTurbo(this, 0, 13, textureX, textureY); // Box 72
		gunModel[69] = new ModelRendererTurbo(this, 0, 13, textureX, textureY); // Box 73
		gunModel[70] = new ModelRendererTurbo(this, 0, 13, textureX, textureY); // Box 74
		gunModel[71] = new ModelRendererTurbo(this, 0, 13, textureX, textureY); // Box 75
		gunModel[72] = new ModelRendererTurbo(this, 0, 28, textureX, textureY); // Box 75
		gunModel[73] = new ModelRendererTurbo(this, 0, 22, textureX, textureY); // Box 76
		gunModel[74] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 78
		gunModel[75] = new ModelRendererTurbo(this, 0, 22, textureX, textureY); // Box 79
		gunModel[76] = new ModelRendererTurbo(this, 0, 25, textureX, textureY); // Box 80
		gunModel[77] = new ModelRendererTurbo(this, 0, 25, textureX, textureY); // Box 81
		gunModel[78] = new ModelRendererTurbo(this, 0, 28, textureX, textureY); // Box 82
		gunModel[79] = new ModelRendererTurbo(this, 0, 28, textureX, textureY); // Box 83
		gunModel[80] = new ModelRendererTurbo(this, 0, 28, textureX, textureY); // Box 84
		gunModel[81] = new ModelRendererTurbo(this, 0, 22, textureX, textureY); // Box 85
		gunModel[82] = new ModelRendererTurbo(this, 5, 28, textureX, textureY); // Box 86
		gunModel[83] = new ModelRendererTurbo(this, 0, 22, textureX, textureY); // Box 87
		gunModel[84] = new ModelRendererTurbo(this, 0, 22, textureX, textureY); // Box 88
		gunModel[85] = new ModelRendererTurbo(this, 0, 25, textureX, textureY); // Box 89
		gunModel[86] = new ModelRendererTurbo(this, 0, 25, textureX, textureY); // Box 90
		gunModel[87] = new ModelRendererTurbo(this, 0, 25, textureX, textureY); // Box 91
		gunModel[88] = new ModelRendererTurbo(this, 0, 7, textureX, textureY); // Box 94
		gunModel[89] = new ModelRendererTurbo(this, 0, 7, textureX, textureY); // Box 95
		gunModel[90] = new ModelRendererTurbo(this, 0, 7, textureX, textureY); // Box 96
		gunModel[91] = new ModelRendererTurbo(this, 0, 7, textureX, textureY); // Box 97
		gunModel[92] = new ModelRendererTurbo(this, 0, 7, textureX, textureY); // Box 98
		gunModel[93] = new ModelRendererTurbo(this, 5, 7, textureX, textureY); // Box 99
		gunModel[94] = new ModelRendererTurbo(this, 5, 7, textureX, textureY); // Box 100
		gunModel[95] = new ModelRendererTurbo(this, 5, 7, textureX, textureY); // Box 101
		gunModel[96] = new ModelRendererTurbo(this, 5, 7, textureX, textureY); // Box 102
		gunModel[97] = new ModelRendererTurbo(this, 16, 10, textureX, textureY); // Box 103
		gunModel[98] = new ModelRendererTurbo(this, 16, 10, textureX, textureY); // Box 104
		gunModel[99] = new ModelRendererTurbo(this, 16, 10, textureX, textureY); // Box 105
		gunModel[100] = new ModelRendererTurbo(this, 17, 7, textureX, textureY); // Box 112
		gunModel[101] = new ModelRendererTurbo(this, 17, 7, textureX, textureY); // Box 113
		gunModel[102] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // Box 114
		gunModel[103] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // Box 115
		gunModel[104] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // Box 116
		gunModel[105] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // Box 117
		gunModel[106] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // Box 118
		gunModel[107] = new ModelRendererTurbo(this, 12, 7, textureX, textureY); // Box 119
		gunModel[108] = new ModelRendererTurbo(this, 12, 7, textureX, textureY); // Box 120
		gunModel[109] = new ModelRendererTurbo(this, 12, 7, textureX, textureY); // Box 121
		gunModel[110] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // Box 122
		gunModel[111] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // Box 123
		gunModel[112] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // Box 124
		gunModel[113] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // Box 125
		gunModel[114] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // Box 126
		gunModel[115] = new ModelRendererTurbo(this, 12, 7, textureX, textureY); // Box 127
		gunModel[116] = new ModelRendererTurbo(this, 12, 7, textureX, textureY); // Box 128
		gunModel[117] = new ModelRendererTurbo(this, 12, 7, textureX, textureY); // Box 129

		gunModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 0
		gunModel[0].setRotationPoint(-0.8F, -4F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0.15F, 0.2F, 0F, 0.15F, 0.2F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0.2F, 0F, 0.15F, 0.2F, 0F, 0.15F, 0F, 0F, 0.15F); // Box 1
		gunModel[1].setRotationPoint(1.9F, -2.4F, -0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, 0F, -0.05F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0.1F, 0F, -0.05F, 0.1F, -0.3F, -0.05F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0.1F, -0.3F, -0.05F); // Box 2
		gunModel[2].setRotationPoint(0.9F, -2.4F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.3F, -0.05F, 0F, -0.3F, -0.05F, 0F, -0.3F, -0.05F, 0F, -0.3F, -0.05F); // Box 3
		gunModel[3].setRotationPoint(-0.2F, -2.4F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.4F, 0F, -0.05F, -0.4F, 0.1F, -0.05F, 0F, -0.3F, -0.05F, 0F, -0.3F, -0.05F, -0.4F, 0.1F, -0.05F); // Box 4
		gunModel[4].setRotationPoint(-1.2F, -2.4F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.4F, 0F, -0.05F, -0.4F, 1F, -0.05F, 0F, 0.1F, -0.05F, 0F, 0.1F, -0.05F, -0.4F, 1F, -0.05F); // Box 5
		gunModel[5].setRotationPoint(-1.8F, -2.4F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.3F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.3F, 0F, -0.05F, -0.3F, 0.1F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.3F, 0.1F, -0.05F); // Box 6
		gunModel[6].setRotationPoint(-2.4F, -2.4F, -0.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.4F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.4F, -0.6F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0.4F, -0.6F, -0.1F); // Box 7
		gunModel[7].setRotationPoint(-3.1F, -2.4F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.1F, -0.6F, -0.1F, -0.1F, -0.6F, -0.1F, 0F, 0F, -0.1F); // Box 8
		gunModel[8].setRotationPoint(-6.4F, -2.4F, -0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, 0F, 0F, -0.2F, 0F, -0.6F, -0.2F, -0.6F, -1F, -0.2F, -0.6F, -1F, -0.2F, 0F, -0.6F, -0.2F); // Box 9
		gunModel[9].setRotationPoint(-0.8F, -3.2F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.8F, -0.2F, -0.4F, -0.7F, -0.2F, -0.4F, -0.7F, -0.2F, 0F, -0.8F, -0.2F, 0F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 10
		gunModel[10].setRotationPoint(-0.8F, -3.6F, -0.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.7F, -0.2F, 0.1F, -0.65F, -0.2F, 0.1F, -0.65F, -0.2F, 0F, -0.7F, -0.2F, 0F, 0F, -0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0F, 0F, -0.1F); // Box 11
		gunModel[11].setRotationPoint(0.8F, -3.6F, -0.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, -0.65F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, 0F, -0.65F, -0.2F, 0F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 12
		gunModel[12].setRotationPoint(1.9F, -3.6F, -0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, -0.2F, -0.05F, -0.3F, -0.2F, -0.05F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 13
		gunModel[13].setRotationPoint(8.8F, -3.6F, -0.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.8F, 0.1F, -0.4F, -0.8F, 0.1F, -0.4F, -0.8F, 0.1F, 0F, -0.8F, 0.1F, 0F, 0F, 0.1F, -0.8F, 0.2F, 0.1F, -0.8F, 0.2F, 0.1F, 0F, 0F, 0.1F); // Box 14
		gunModel[14].setRotationPoint(4.1F, -3.4F, -0.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.8F, 0.1F, 0.2F, -0.8F, 0.1F, 0.2F, -0.8F, 0.1F, 0F, -0.8F, 0.1F, 0F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 15
		gunModel[15].setRotationPoint(1.9F, -3.4F, -0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.8F, -0.1F, 0.1F, -0.8F, 0.1F, 0.1F, -0.8F, 0.1F, 0F, -0.8F, -0.1F, 0F, 0F, -0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0F, 0F, -0.1F); // Box 16
		gunModel[16].setRotationPoint(0.8F, -3.4F, -0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.8F, -0.1F, 0.6F, -0.8F, -0.1F, 0.6F, -0.8F, -0.1F, 0F, -0.8F, -0.1F, 0F, 0F, -0.1F, 0.6F, 0F, -0.1F, 0.6F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 17
		gunModel[17].setRotationPoint(-0.8F, -3.4F, -0.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0.15F, 0.45F, -0.2F, 0.15F, 0.45F, -0.2F, 0.15F, 0F, 0F, 0.15F, 0F, -0.4F, 0.15F, 0.35F, -0.4F, 0.15F, 0.35F, -0.4F, 0.15F, 0F, -0.4F, 0.15F); // Box 18
		gunModel[18].setRotationPoint(4.1F, -2.4F, -0.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.7F, 0F, 0.3F, -0.7F, 0F, 0.3F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F); // Box 19
		gunModel[19].setRotationPoint(4.1F, -2.4F, -0.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.7F, -1F, -0.6F, -0.7F, -1F, -0.7F, -0.7F, 0.15F, 0F, -0.7F, 0.15F, 0F, 0F, -1F, -0.6F, 0F, -1F, -1F, 0F, 0.15F, 0F, 0F, 0.15F); // Box 20
		gunModel[20].setRotationPoint(4.1F, -2.4F, -0.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.6F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, 0.15F, -0.7F, -0.7F, 0.15F, -0.6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.15F, -1F, 0F, 0.15F); // Box 21
		gunModel[21].setRotationPoint(3.9F, -2.4F, -0.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.6F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, 0.15F, -0.7F, -0.7F, 0.15F, -0.6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.15F, -1F, 0F, 0.15F); // Box 22
		gunModel[22].setRotationPoint(4.9F, -2.4F, -0.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.7F, -1F, -0.6F, -0.7F, -1F, -0.7F, -0.7F, 0.15F, 0F, -0.7F, 0.15F, 0F, 0F, -1F, -0.6F, 0F, -1F, -1F, 0F, 0.15F, 0F, 0F, 0.15F); // Box 23
		gunModel[23].setRotationPoint(5.1F, -2.4F, -0.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.6F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, 0.15F, -0.7F, -0.7F, 0.15F, -0.6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.15F, -1F, 0F, 0.15F); // Box 24
		gunModel[24].setRotationPoint(5.9F, -2.4F, -0.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.7F, -1F, -0.6F, -0.7F, -1F, -0.7F, -0.7F, 0.15F, 0F, -0.7F, 0.15F, 0F, 0F, -1F, -0.6F, 0F, -1F, -1F, 0F, 0.15F, 0F, 0F, 0.15F); // Box 25
		gunModel[25].setRotationPoint(6.1F, -2.4F, -0.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.6F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, 0.15F, -0.7F, -0.7F, 0.15F, -0.6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.15F, -1F, 0F, 0.15F); // Box 26
		gunModel[26].setRotationPoint(6.9F, -2.4F, -0.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.7F, -1F, -0.6F, -0.7F, -1F, -0.7F, -0.7F, 0.15F, 0F, -0.7F, 0.15F, 0F, 0F, -1F, -0.6F, 0F, -1F, -1F, 0F, 0.15F, 0F, 0F, 0.15F); // Box 27
		gunModel[27].setRotationPoint(7.1F, -2.4F, -0.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.6F, -0.7F, -1F, 0.5F, -0.7F, -1F, 0.5F, -0.7F, 0.15F, -0.7F, -0.7F, 0.15F, -0.6F, 0F, -1F, 0.3F, 0F, -1F, 0.3F, 0F, 0.15F, -1F, 0F, 0.15F); // Box 28
		gunModel[28].setRotationPoint(7.9F, -2.4F, -0.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.7F, -1F, -0.6F, -0.7F, -1F, -0.7F, -0.7F, 0.15F, 0F, -0.7F, 0.15F, 0F, 0F, -1F, -0.6F, 0F, -1F, -1F, 0F, 0.15F, 0F, 0F, 0.15F); // Box 29
		gunModel[29].setRotationPoint(8.1F, -2.4F, -0.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.9F, 0.15F, 0.35F, -0.9F, 0.15F, 0.35F, -0.9F, 0.15F, 0F, -0.9F, 0.15F, 0F, 0F, 0.15F, 0.3F, 0F, 0.15F, 0.3F, 0F, 0.15F, 0F, 0F, 0.15F); // Box 30
		gunModel[30].setRotationPoint(4.1F, -2.7F, -0.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.7F, -1F, -0.4F, -0.7F, -1F, -0.4F, -0.7F, 0.15F, -0.4F, -0.7F, 0.15F, -0.4F, 0F, -1F, -0.4F, 0F, -1F, -0.4F, 0F, 0.15F, -0.4F, 0F, 0.15F); // Box 31
		gunModel[31].setRotationPoint(4.5F, -2.4F, -0.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.7F, -1F, -0.4F, -0.7F, -1F, -0.4F, -0.7F, 0.15F, -0.4F, -0.7F, 0.15F, -0.4F, 0F, -1F, -0.4F, 0F, -1F, -0.4F, 0F, 0.15F, -0.4F, 0F, 0.15F); // Box 32
		gunModel[32].setRotationPoint(5.5F, -2.4F, -0.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.7F, -1F, -0.4F, -0.7F, -1F, -0.4F, -0.7F, 0.15F, -0.4F, -0.7F, 0.15F, -0.4F, 0F, -1F, -0.4F, 0F, -1F, -0.4F, 0F, 0.15F, -0.4F, 0F, 0.15F); // Box 33
		gunModel[33].setRotationPoint(6.5F, -2.4F, -0.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.7F, -1F, -0.4F, -0.7F, -1F, -0.4F, -0.7F, 0.15F, -0.4F, -0.7F, 0.15F, -0.4F, 0F, -1F, -0.4F, 0F, -1F, -0.4F, 0F, 0.15F, -0.4F, 0F, 0.15F); // Box 34
		gunModel[34].setRotationPoint(7.5F, -2.4F, -0.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.7F, 0.15F, -0.7F, -0.7F, 0.15F, -0.6F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, 0F, 0.15F, -1F, 0F, 0.15F, -0.6F, 0F, -1F, 0F, 0F, -1F); // Box 35
		gunModel[35].setRotationPoint(4.1F, -2.4F, -0.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.7F, -0.7F, 0.15F, 0F, -0.7F, 0.15F, 0F, -0.7F, -1F, -0.6F, -0.7F, -1F, -1F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, -1F, -0.6F, 0F, -1F); // Box 36
		gunModel[36].setRotationPoint(3.9F, -2.4F, -0.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.7F, -0.7F, 0.15F, 0F, -0.7F, 0.15F, 0F, -0.7F, -1F, -0.6F, -0.7F, -1F, -1F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, -1F, -0.6F, 0F, -1F); // Box 37
		gunModel[37].setRotationPoint(4.9F, -2.4F, -0.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.7F, 0.15F, -0.7F, -0.7F, 0.15F, -0.6F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, 0F, 0.15F, -1F, 0F, 0.15F, -0.6F, 0F, -1F, 0F, 0F, -1F); // Box 38
		gunModel[38].setRotationPoint(5.1F, -2.4F, -0.5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.7F, -0.7F, 0.15F, 0F, -0.7F, 0.15F, 0F, -0.7F, -1F, -0.6F, -0.7F, -1F, -1F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, -1F, -0.6F, 0F, -1F); // Box 39
		gunModel[39].setRotationPoint(5.9F, -2.4F, -0.5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.7F, 0.15F, -0.7F, -0.7F, 0.15F, -0.6F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, 0F, 0.15F, -1F, 0F, 0.15F, -0.6F, 0F, -1F, 0F, 0F, -1F); // Box 40
		gunModel[40].setRotationPoint(6.1F, -2.4F, -0.5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.7F, -0.7F, 0.15F, 0F, -0.7F, 0.15F, 0F, -0.7F, -1F, -0.6F, -0.7F, -1F, -1F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, -1F, -0.6F, 0F, -1F); // Box 41
		gunModel[41].setRotationPoint(6.9F, -2.4F, -0.5F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.7F, 0.15F, -0.7F, -0.7F, 0.15F, -0.6F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, 0F, 0.15F, -1F, 0F, 0.15F, -0.6F, 0F, -1F, 0F, 0F, -1F); // Box 42
		gunModel[42].setRotationPoint(7.1F, -2.4F, -0.5F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.7F, -0.7F, 0.15F, 0.5F, -0.7F, 0.15F, 0.5F, -0.7F, -1F, -0.6F, -0.7F, -1F, -1F, 0F, 0.15F, 0.3F, 0F, 0.15F, 0.3F, 0F, -1F, -0.6F, 0F, -1F); // Box 43
		gunModel[43].setRotationPoint(7.9F, -2.4F, -0.5F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.7F, 0.15F, -0.7F, -0.7F, 0.15F, -0.6F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, 0F, 0.15F, -1F, 0F, 0.15F, -0.6F, 0F, -1F, 0F, 0F, -1F); // Box 44
		gunModel[44].setRotationPoint(8.1F, -2.4F, -0.5F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.7F, 0.15F, -0.4F, -0.7F, 0.15F, -0.4F, -0.7F, -1F, -0.4F, -0.7F, -1F, -0.4F, 0F, 0.15F, -0.4F, 0F, 0.15F, -0.4F, 0F, -1F, -0.4F, 0F, -1F); // Box 45
		gunModel[45].setRotationPoint(4.5F, -2.4F, -0.5F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.7F, 0.15F, -0.4F, -0.7F, 0.15F, -0.4F, -0.7F, -1F, -0.4F, -0.7F, -1F, -0.4F, 0F, 0.15F, -0.4F, 0F, 0.15F, -0.4F, 0F, -1F, -0.4F, 0F, -1F); // Box 46
		gunModel[46].setRotationPoint(5.5F, -2.4F, -0.5F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.7F, 0.15F, -0.4F, -0.7F, 0.15F, -0.4F, -0.7F, -1F, -0.4F, -0.7F, -1F, -0.4F, 0F, 0.15F, -0.4F, 0F, 0.15F, -0.4F, 0F, -1F, -0.4F, 0F, -1F); // Box 47
		gunModel[47].setRotationPoint(6.5F, -2.4F, -0.5F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.7F, 0.15F, -0.4F, -0.7F, 0.15F, -0.4F, -0.7F, -1F, -0.4F, -0.7F, -1F, -0.4F, 0F, 0.15F, -0.4F, 0F, 0.15F, -0.4F, 0F, -1F, -0.4F, 0F, -1F); // Box 48
		gunModel[48].setRotationPoint(7.5F, -2.4F, -0.5F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 49
		gunModel[49].setRotationPoint(10F, -3F, -0.5F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 53
		gunModel[50].setRotationPoint(8.9F, -3F, -0.5F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.1F, -0.1F, -0.7F, -0.1F, -0.1F, -0.7F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.7F, -0.1F, -0.1F, -0.7F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 54
		gunModel[51].setRotationPoint(9.6F, -3F, -0.5F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.2F, -0.9F, 0F, -0.2F, -0.9F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, -0.9F, -0.2F, -0.2F, -0.9F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 55
		gunModel[52].setRotationPoint(8.75F, -4.1F, -0.5F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, 0F, -0.7F, 0F, 0.4F, -0.7F, 0F, 0.4F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F); // Box 56
		gunModel[53].setRotationPoint(8.75F, -4.1F, -0.5F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, 0F, -0.2F, 0F, 0.4F, -0.2F, 0F, 0.4F, -0.7F, -0.1F, 0F, -0.7F, -0.1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.7F, -0.1F, -0.2F, -0.7F); // Box 57
		gunModel[54].setRotationPoint(8.75F, -4.1F, -0.5F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, -0.2F, 0.4F, 0.1F, -0.2F, 0.4F, 0.1F, -0.2F, 0F, 0F, -0.2F, 0F, -0.9F, -0.2F, 0.4F, -1F, -0.2F, 0.4F, -1F, -0.2F, 0F, -0.9F, -0.2F); // Box 58
		gunModel[55].setRotationPoint(0.8F, -4.55F, -0.5F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.55F, -0.15F, -0.2F, -1.55F, -0.05F, -0.2F, -1.55F, -0.05F, -0.2F, 0.55F, -0.15F, -0.2F, 0.1F, -0.7F, -0.2F, -1F, -0.7F, -0.2F, -1F, -0.7F, -0.2F, 0.1F, -0.7F, -0.2F); // Box 59
		gunModel[56].setRotationPoint(8.75F, -4.7F, -0.5F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0F, -0.7F, -0.2F, -0.9F, -0.7F, -0.2F, -0.9F, -0.7F, -0.2F, 0F, -0.7F, -0.2F); // Box 60
		gunModel[57].setRotationPoint(8.75F, -4.4F, -0.5F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1.55F, -0.05F, -0.2F, 0.55F, -0.15F, -0.2F, 0.55F, -0.15F, -0.2F, -1.55F, -0.05F, -0.2F, -1F, -0.7F, -0.2F, 0.1F, -0.7F, -0.2F, 0.1F, -0.7F, -0.2F, -1F, -0.7F, -0.2F); // Box 61
		gunModel[58].setRotationPoint(-0.75F, -4.6F, -0.5F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1.05F, 0F, -0.2F, 0.15F, 0F, -0.2F, 0.15F, 0F, -0.2F, -1.05F, 0F, -0.2F, -0.9F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, -0.9F, -0.7F, -0.2F); // Box 62
		gunModel[59].setRotationPoint(-0.8F, -4.3F, -0.5F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, -0.7F, 0.4F, -0.1F, -0.7F, 0.4F, -0.1F, -0.2F, 0F, 0F, -0.2F, 0F, -0.45F, -0.7F, 0.4F, -0.55F, -0.7F, 0.4F, -0.55F, -0.2F, 0F, -0.45F, -0.2F); // Box 63
		gunModel[60].setRotationPoint(0.8F, -5.1F, -0.5F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, -0.2F, 0.4F, -0.1F, -0.2F, 0.4F, -0.1F, -0.7F, 0F, 0F, -0.7F, 0F, -0.45F, -0.2F, 0.4F, -0.55F, -0.2F, 0.4F, -0.55F, -0.7F, 0F, -0.45F, -0.7F); // Box 64
		gunModel[61].setRotationPoint(0.8F, -5.1F, -0.5F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.7F, -0.1F, -0.7F, -0.7F, -0.1F, -0.7F, -0.2F, 0F, 0F, -0.2F, 0F, -0.3F, -0.7F, -0.1F, -0.3F, -0.7F, -0.1F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 65
		gunModel[62].setRotationPoint(-0.8F, -4.7F, -0.5F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, 0.4F, -0.7F, 0.05F, -0.4F, -0.7F, 0.05F, -0.4F, -0.2F, -0.3F, 0.4F, -0.2F, 0F, -1F, -0.7F, -0.1F, -0.3F, -0.7F, -0.1F, -0.3F, -0.2F, 0F, -1F, -0.2F); // Box 67
		gunModel[63].setRotationPoint(-0.8F, -4.7F, -0.5F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.2F, -0.1F, -0.7F, -0.2F, -0.1F, -0.7F, -0.7F, 0F, 0F, -0.7F, 0F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.7F, 0F, -0.3F, -0.7F); // Box 68
		gunModel[64].setRotationPoint(-0.8F, -4.7F, -0.5F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, 0.4F, -0.2F, 0.05F, -0.4F, -0.2F, 0.05F, -0.4F, -0.7F, -0.3F, 0.4F, -0.7F, 0F, -1F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.7F, 0F, -1F, -0.7F); // Box 69
		gunModel[65].setRotationPoint(-0.8F, -4.7F, -0.5F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.3F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.45F, -0.2F, -0.7F, 0F, -0.45F, -0.7F, 0F, -0.45F, -0.2F, -0.45F, -0.2F, -0.2F); // Box 70
		gunModel[66].setRotationPoint(-0.2F, -5.1F, -0.5F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.3F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.7F, 0.3F, 0F, -0.7F, -0.45F, -0.2F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.7F, -0.45F, -0.2F, -0.7F); // Box 71
		gunModel[67].setRotationPoint(-0.2F, -5.1F, -0.5F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.05F, -0.4F, -0.7F, -0.5F, 0.15F, -0.7F, -0.5F, 0.15F, -0.2F, 0.05F, -0.4F, -0.2F, -0.05F, -0.3F, -0.7F, -0.05F, -0.7F, -0.7F, -0.05F, -0.7F, -0.2F, -0.05F, -0.3F, -0.2F); // Box 72
		gunModel[68].setRotationPoint(8.8F, -4.8F, -0.5F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.7F, 0.1F, -0.25F, -0.7F, 0.1F, -0.25F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.45F, -0.7F, -0.45F, -0.2F, -0.7F, -0.45F, -0.2F, -0.2F, 0F, -0.45F, -0.2F); // Box 73
		gunModel[69].setRotationPoint(8.2F, -5.2F, -0.5F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0.1F, -0.25F, -0.2F, 0.1F, -0.25F, -0.7F, 0F, -0.2F, -0.7F, 0F, -0.45F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.7F, 0F, -0.45F, -0.7F); // Box 74
		gunModel[70].setRotationPoint(8.2F, -5.2F, -0.5F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.05F, -0.4F, -0.2F, -0.5F, 0.15F, -0.2F, -0.5F, 0.15F, -0.7F, 0.05F, -0.4F, -0.7F, -0.05F, -0.3F, -0.2F, -0.05F, -0.7F, -0.2F, -0.05F, -0.7F, -0.7F, -0.05F, -0.3F, -0.7F); // Box 75
		gunModel[71].setRotationPoint(8.8F, -4.8F, -0.5F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.6F, 0F, 0.1F, -0.6F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 75
		gunModel[72].setRotationPoint(-1.1F, -3.4F, -0.5F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		gunModel[73].setRotationPoint(-7.8F, -2F, -0.5F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 78
		gunModel[74].setRotationPoint(-7.8F, -3.2F, -0.5F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0.3F, 0F, 1F, 0.3F, 0F, 1F, 0.3F, 0F, 0.1F, 0.3F, 0F); // Box 79
		gunModel[75].setRotationPoint(-7.8F, -3.7F, -0.5F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.05F, 0.4F, 0F, -0.05F, 0.4F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.7F, -0.02F, 0.4F, -0.7F, -0.02F, 0.4F, -0.7F, -0.02F, 0F, -0.7F, -0.02F); // Box 80
		gunModel[76].setRotationPoint(-4.5F, -3.4F, -0.5F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0.05F, 0.4F, 0F, 0.05F, 0.4F, 0F, 0.05F, 0F, 0F, 0.05F, -1.2F, -0.5F, 0.05F, -0.8F, -0.5F, 0.05F, -0.8F, -0.5F, 0.05F, -1.2F, -0.5F, 0.05F); // Box 81
		gunModel[77].setRotationPoint(-4.5F, -2.4F, -0.5F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.1F, -0.6F, 0F, 0.1F, -0.6F, 0F, 0.1F, 0F, 0F, 0.1F, 1.1F, -0.5F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 1.1F, -0.5F, 0.1F); // Box 82
		gunModel[78].setRotationPoint(-1.1F, -2.4F, -0.5F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, -1.1F, 0.1F, -0.3F, -0.8F, 0.1F, -0.3F, -0.8F, 0.1F, 0.1F, -1.1F, 0.1F); // Box 83
		gunModel[79].setRotationPoint(-2.1F, -1.4F, -0.5F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, -0.6F, 0.1F, 0F, -0.6F, 0.1F, 0F, -0.6F, 0.1F, 0.2F, -0.6F, 0.1F, 0.2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.2F, 0F, 0.1F); // Box 84
		gunModel[80].setRotationPoint(-3.2F, -2.5F, -0.5F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, -0.6F, 0.2F, 0F, -0.6F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, 0F, 0F, 0F); // Box 85
		gunModel[81].setRotationPoint(-3.8F, -2F, -0.5F);

		gunModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, 0.15F, 0F, -0.4F, 0.15F, 0F, -0.4F, 0.15F, 0F, -0.4F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F); // Box 86
		gunModel[82].setRotationPoint(-3.3F, -2.4F, -0.5F);

		gunModel[83].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.8F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		gunModel[83].setRotationPoint(-7.8F, -3.2F, -0.5F);

		gunModel[84].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, 0F, -0.2F, 0F); // Box 88
		gunModel[84].setRotationPoint(-7.8F, -1F, -0.5F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, -0.02F, 0F, -0.3F, -0.02F, 0F, -0.3F, -0.02F, 0F, -0.3F, -0.02F, 0F, 0F, 0.05F, -0.5F, 0F, 0.05F, -0.5F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 89
		gunModel[85].setRotationPoint(-4.5F, -3.4F, -0.5F);

		gunModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, -0.02F, -0.5F, -0.3F, -0.02F, -0.5F, -0.3F, -0.02F, 0F, -0.3F, -0.02F, 0F, 0F, 0.05F, -0.5F, 0F, 0.05F, -0.5F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 90
		gunModel[86].setRotationPoint(-1.5F, -3.4F, -0.5F);

		gunModel[87].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.3F, -0.8F, 0.5F, -0.3F, -0.8F, 0.5F, -0.3F, -0.02F, 0F, -0.3F, -0.02F, 0F, 0F, -0.8F, 0.5F, 0F, -0.8F, 0.5F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 91
		gunModel[87].setRotationPoint(-4F, -3.4F, -0.5F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.4F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0F, 0F, -0.1F, 0.1F, 0.3F, -0.1F, 0.1F, 0.3F, -0.1F, 0F, 0F, -0.1F); // Box 94
		gunModel[88].setRotationPoint(1F, -2F, -0.5F);

		gunModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.1F, 0.1F, -0.3F, -0.1F, 0.1F, -0.3F, -0.1F, 0F, 0F, -0.1F, 0.8F, 0.2F, -0.1F, -0.3F, 0.2F, -0.1F, -0.3F, 0.2F, -0.1F, 0.8F, 0.2F, -0.1F); // Box 95
		gunModel[89].setRotationPoint(1F, -1F, -0.5F);

		gunModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.8F, 0.2F, -0.1F, -0.3F, 0.2F, -0.1F, -0.3F, 0.2F, -0.1F, 0.8F, 0.2F, -0.1F, 0.7F, -0.1F, -0.1F, -0.6F, 0.2F, -0.1F, -0.6F, 0.2F, -0.1F, 0.7F, -0.1F, -0.1F); // Box 96
		gunModel[90].setRotationPoint(1F, 0.4F, -0.5F);

		gunModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.1F, -0.9F, 0.2F, -0.1F, -0.9F, 0.2F, -0.1F, 0F, 0F, -0.1F, 0F, -0.3F, -0.1F, -0.8F, -0.1F, -0.1F, -0.8F, -0.1F, -0.1F, 0F, -0.3F, -0.1F); // Box 97
		gunModel[91].setRotationPoint(0.1F, 0.4F, -0.5F);

		gunModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.3F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.5F, -0.3F, -0.1F, -0.2F, -0.2F, -0.1F, -0.9F, 0.2F, -0.1F, -0.9F, 0.2F, -0.1F, -0.2F, -0.2F, -0.1F); // Box 98
		gunModel[92].setRotationPoint(0.1F, -1F, -0.5F);

		gunModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.2F, -0.9F, 0F, -0.2F, -0.9F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.9F, 0F, -0.2F, -0.9F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 99
		gunModel[93].setRotationPoint(2.1F, -1.7F, -0.5F);

		gunModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.3F, 0F, -0.2F, -1.2F, 0F, -0.2F, -1.2F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0F, 0F, -0.2F, -0.9F, 0F, -0.2F, -0.9F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 100
		gunModel[94].setRotationPoint(4F, -1.7F, -0.5F);

		gunModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.2F, -0.9F, 0F, -0.2F, -0.9F, 0F, -0.2F, 0F, 0F, -0.2F, 0.3F, -0.7F, -0.2F, -1.2F, -0.7F, -0.2F, -1.2F, -0.7F, -0.2F, 0.3F, -0.7F, -0.2F); // Box 101
		gunModel[95].setRotationPoint(4F, -0.7F, -0.5F);

		gunModel[96].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.87F, -0.2F, -0.3F, -1.2F, -0.2F, -0.3F, -1.2F, -0.2F, 0F, -0.87F, -0.2F, 0F, 0F, -0.2F, -0.4F, 0.3F, -0.2F, -0.4F, 0.3F, -0.2F, 0F, 0F, -0.2F); // Box 102
		gunModel[96].setRotationPoint(2.1F, -1.6F, -0.5F);

		gunModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.7F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.7F, 0F, 0F, -0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, -0.5F, -0.2F, 0.1F); // Box 103
		gunModel[97].setRotationPoint(-8.8F, -3.7F, -0.5F);

		gunModel[98].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.6F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, -0.6F, -0.2F, 0.1F); // Box 104
		gunModel[98].setRotationPoint(-8.8F, -2.9F, -0.5F);

		gunModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.7F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.7F, 0F, 0F); // Box 105
		gunModel[99].setRotationPoint(-8.7F, -1.1F, -0.5F);

		gunModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.35F, -0.7F, -0.5F, -0.35F, -0.7F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, 0F, -0.35F, -0.7F, 0F, -0.35F, -0.7F, 0F, -0.35F, 0F, 0F, -0.35F); // Box 112
		gunModel[100].setRotationPoint(6.3F, -4.2F, -0.5F);

		gunModel[101].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.9F, -0.35F, 0F, -0.9F, -0.35F, 0F, -0.9F, -0.35F, 0F, -0.9F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F); // Box 113
		gunModel[101].setRotationPoint(6.3F, -4.7F, -0.5F);

		gunModel[102].addShapeBox(-0.5F, -0.5F, -0.8F, 1, 1, 1, 0F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 114
		gunModel[102].setRotationPoint(8.6F, -3F, 0.6F);
		gunModel[102].rotateAngleX = 0.43633231F;
		gunModel[102].rotateAngleY = -0.01745329F;
		gunModel[102].rotateAngleZ = 0.05235988F;

		gunModel[103].addShapeBox(-1F, -0.5F, -0.8F, 1, 1, 1, 0F, -0.2F, -0.4F, -0.8F, -0.3F, -0.2F, -0.8F, -0.3F, -0.2F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, -0.8F, -0.3F, -0.2F, -0.8F, -0.3F, -0.2F, 0F, -0.2F, -0.4F, 0F); // Box 115
		gunModel[103].setRotationPoint(8.6F, -3F, 0.6F);
		gunModel[103].rotateAngleX = 0.43633231F;
		gunModel[103].rotateAngleY = -0.01745329F;
		gunModel[103].rotateAngleZ = 0.05235988F;

		gunModel[104].addShapeBox(-1.5F, -0.5F, -0.8F, 1, 1, 1, 0F, -0.3F, -0.25F, -0.8F, -0.3F, -0.25F, -0.8F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, -0.8F, -0.3F, -0.25F, -0.8F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F); // Box 116
		gunModel[104].setRotationPoint(8.6F, -3F, 0.6F);
		gunModel[104].rotateAngleX = 0.43633231F;
		gunModel[104].rotateAngleY = -0.01745329F;
		gunModel[104].rotateAngleZ = 0.05235988F;

		gunModel[105].addShapeBox(-6.2F, -0.5F, -0.8F, 5, 1, 1, 0F, 0.5F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0.5F, -0.4F, 0F); // Box 117
		gunModel[105].setRotationPoint(8.6F, -3F, 0.6F);
		gunModel[105].rotateAngleX = 0.43633231F;
		gunModel[105].rotateAngleY = -0.01745329F;
		gunModel[105].rotateAngleZ = 0.05235988F;

		gunModel[106].addShapeBox(-7.5F, -0.5F, -0.8F, 1, 1, 1, 0F, -0.3F, -0.3F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, 0F, -0.3F, -0.3F, 0F); // Box 118
		gunModel[106].setRotationPoint(8.6F, -3F, 0.6F);
		gunModel[106].rotateAngleX = 0.43633231F;
		gunModel[106].rotateAngleY = -0.01745329F;
		gunModel[106].rotateAngleZ = 0.05235988F;

		gunModel[107].addShapeBox(-7.3F, -0.5F, -0.7F, 1, 1, 1, 0F, 0F, -0.1F, -0.6F, -0.9F, -0.1F, -0.6F, -0.9F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.6F, -0.9F, -0.1F, -0.6F, -0.9F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 119
		gunModel[107].setRotationPoint(8.6F, -3F, 0.6F);
		gunModel[107].rotateAngleX = 0.43633231F;
		gunModel[107].rotateAngleY = -0.01745329F;
		gunModel[107].rotateAngleZ = 0.05235988F;

		gunModel[108].addShapeBox(-7.6F, -0.5F, -1F, 1, 1, 1, 0F, 0F, -0.1F, -0.9F, -0.7F, -0.1F, -0.9F, -0.7F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.9F, -0.7F, -0.1F, -0.9F, -0.7F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 120
		gunModel[108].setRotationPoint(8.6F, -3F, 0.6F);
		gunModel[108].rotateAngleX = 0.43633231F;
		gunModel[108].rotateAngleY = -0.01745329F;
		gunModel[108].rotateAngleZ = 0.05235988F;

		gunModel[109].addShapeBox(-0.5F, -0.5F, -0.7F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F); // Box 121
		gunModel[109].setRotationPoint(8.6F, -3F, 0.6F);
		gunModel[109].rotateAngleX = 0.43633231F;
		gunModel[109].rotateAngleY = -0.01745329F;
		gunModel[109].rotateAngleZ = 0.05235988F;

		gunModel[110].addShapeBox(-0.5F, -0.5F, -0.2F, 1, 1, 1, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F); // Box 122
		gunModel[110].setRotationPoint(8.6F, -3F, -0.6F);
		gunModel[110].rotateAngleX = -0.43633231F;
		gunModel[110].rotateAngleY = 0.01745329F;
		gunModel[110].rotateAngleZ = 0.05235988F;

		gunModel[111].addShapeBox(-1F, -0.5F, -0.2F, 1, 1, 1, 0F, -0.2F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, -0.8F, -0.2F, -0.4F, -0.8F); // Box 123
		gunModel[111].setRotationPoint(8.6F, -3F, -0.6F);
		gunModel[111].rotateAngleX = -0.43633231F;
		gunModel[111].rotateAngleY = 0.01745329F;
		gunModel[111].rotateAngleZ = 0.05235988F;

		gunModel[112].addShapeBox(-1.5F, -0.5F, -0.2F, 1, 1, 1, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, -0.8F, -0.3F, -0.25F, -0.8F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, -0.8F, -0.3F, -0.25F, -0.8F); // Box 124
		gunModel[112].setRotationPoint(8.6F, -3F, -0.6F);
		gunModel[112].rotateAngleX = -0.43633231F;
		gunModel[112].rotateAngleY = 0.01745329F;
		gunModel[112].rotateAngleZ = 0.05235988F;

		gunModel[113].addShapeBox(-6.2F, -0.5F, -0.2F, 5, 1, 1, 0F, 0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.8F, 0.5F, -0.4F, -0.8F, 0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.8F, 0.5F, -0.4F, -0.8F); // Box 125
		gunModel[113].setRotationPoint(8.6F, -3F, -0.6F);
		gunModel[113].rotateAngleX = -0.43633231F;
		gunModel[113].rotateAngleY = 0.01745329F;
		gunModel[113].rotateAngleZ = 0.05235988F;

		gunModel[114].addShapeBox(-7.5F, -0.5F, -0.2F, 1, 1, 1, 0F, -0.3F, -0.3F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, -0.8F, -0.3F, -0.3F, -0.8F, -0.3F, -0.3F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, -0.8F, -0.3F, -0.3F, -0.8F); // Box 126
		gunModel[114].setRotationPoint(8.6F, -3F, -0.6F);
		gunModel[114].rotateAngleX = -0.43633231F;
		gunModel[114].rotateAngleY = 0.01745329F;
		gunModel[114].rotateAngleZ = 0.05235988F;

		gunModel[115].addShapeBox(-7.3F, -0.5F, -0.3F, 1, 1, 1, 0F, 0F, -0.1F, 0F, -0.9F, -0.1F, 0F, -0.9F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, 0F, -0.9F, -0.1F, 0F, -0.9F, -0.1F, -0.6F, 0F, -0.1F, -0.6F); // Box 127
		gunModel[115].setRotationPoint(8.6F, -3F, -0.6F);
		gunModel[115].rotateAngleX = -0.43633231F;
		gunModel[115].rotateAngleY = 0.01745329F;
		gunModel[115].rotateAngleZ = 0.05235988F;

		gunModel[116].addShapeBox(-7.6F, -0.5F, -2.77555756156289E-17F, 1, 1, 1, 0F, 0F, -0.1F, 0F, -0.7F, -0.1F, 0F, -0.7F, -0.1F, -0.9F, 0F, -0.1F, -0.9F, 0F, -0.1F, 0F, -0.7F, -0.1F, 0F, -0.7F, -0.1F, -0.9F, 0F, -0.1F, -0.9F); // Box 128
		gunModel[116].setRotationPoint(8.6F, -3F, -0.6F);
		gunModel[116].rotateAngleX = -0.43633231F;
		gunModel[116].rotateAngleY = 0.01745329F;
		gunModel[116].rotateAngleZ = 0.05235988F;

		gunModel[117].addShapeBox(-0.5F, -0.5F, -0.3F, 1, 1, 1, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F); // Box 129
		gunModel[117].setRotationPoint(8.6F, -3F, -0.6F);
		gunModel[117].rotateAngleX = -0.43633231F;
		gunModel[117].rotateAngleY = 0.01745329F;
		gunModel[117].rotateAngleZ = 0.05235988F;


		defaultBarrelModel = new ModelRendererTurbo[3];
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 9, 4, textureX, textureY); // Box 50
		defaultBarrelModel[1] = new ModelRendererTurbo(this, 9, 4, textureX, textureY); // Box 51
		defaultBarrelModel[2] = new ModelRendererTurbo(this, 9, 4, textureX, textureY); // Box 52

		defaultBarrelModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F); // Box 50
		defaultBarrelModel[0].setRotationPoint(12.9F, -3F, -0.5F);

		defaultBarrelModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.9F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.9F, -0.2F, -0.2F, -0.9F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.9F, -0.2F, -0.2F); // Box 51
		defaultBarrelModel[1].setRotationPoint(11.7F, -3F, -0.5F);

		defaultBarrelModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.9F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.9F, -0.2F, -0.2F, -0.9F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.9F, -0.2F, -0.2F); // Box 52
		defaultBarrelModel[2].setRotationPoint(11.5F, -3F, -0.5F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 14, 0, textureX, textureY); // Box 93

		ammoModel[0].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.15F, -0.1F, 0.4F, -0.15F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.15F, -0.1F, 0.4F, -0.15F); // Box 93
		ammoModel[0].setRotationPoint(-3.9F, -2F, -0.5F);


		slideModel = new ModelRendererTurbo[7];
		slideModel[0] = new ModelRendererTurbo(this, 13, 19, textureX, textureY); // Box 92
		slideModel[1] = new ModelRendererTurbo(this, 9, 0, textureX, textureY); // Box 106
		slideModel[2] = new ModelRendererTurbo(this, 17, 7, textureX, textureY); // Box 107
		slideModel[3] = new ModelRendererTurbo(this, 17, 7, textureX, textureY); // Box 108
		slideModel[4] = new ModelRendererTurbo(this, 17, 7, textureX, textureY); // Box 109
		slideModel[5] = new ModelRendererTurbo(this, 17, 7, textureX, textureY); // Box 110
		slideModel[6] = new ModelRendererTurbo(this, 9, 0, textureX, textureY); // Box 111

		slideModel[0].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.3F, -0.12F, 0.5F, -0.3F, -0.12F, 0.5F, -0.3F, -0.12F, 0F, -0.3F, -0.12F, 0F, 0F, -0.02F, 0.5F, 0F, -0.02F, 0.5F, 0F, -0.02F, 0F, 0F, -0.02F); // Box 92
		slideModel[0].setRotationPoint(-4F, -3.4F, -0.5F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.6F, -0.35F, 0.2F, -0.8F, -0.35F, 0.2F, -0.8F, -0.35F, 0F, -0.6F, -0.35F, 0F, 0F, -0.35F, 0.2F, 0F, -0.35F, 0.2F, 0F, -0.35F, 0F, 0F, -0.35F); // Box 106
		slideModel[1].setRotationPoint(4F, -4.2F, -0.5F);

		slideModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, -0.6F, -0.3F, -0.6F, -0.6F, -0.3F, -0.6F, -0.6F, -0.3F, 0.1F, -0.6F, -0.3F, 0F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 107
		slideModel[2].setRotationPoint(4F, -4.3F, -0.5F);

		slideModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.3F, -0.85F, 0F, -0.3F, -0.85F, 0F, -0.3F, 0F, 0F, -0.3F, 0.1F, -0.6F, -0.3F, -0.9F, -0.6F, -0.3F, -0.9F, -0.6F, -0.3F, 0.1F, -0.6F, -0.3F); // Box 108
		slideModel[3].setRotationPoint(4F, -4.3F, -0.5F);

		slideModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, -0.8F, -0.3F, -0.9F, -0.8F, -0.3F, -0.9F, -0.8F, -0.3F, 0.1F, -0.8F, -0.3F, 0.1F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, 0.1F, 0F, -0.3F); // Box 109
		slideModel[4].setRotationPoint(4F, -4.7F, -0.5F);

		slideModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.05F, 0F, -0.3F, -0.85F, 0F, -0.3F, -0.85F, 0F, -0.3F, -0.05F, 0F, -0.3F, 0.1F, -0.85F, -0.3F, -0.95F, -0.85F, -0.3F, -0.95F, -0.85F, -0.3F, 0.1F, -0.85F, -0.3F); // Box 110
		slideModel[5].setRotationPoint(4.1F, -4.45F, -0.5F);

		slideModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.45F, -0.25F, -0.45F, -0.45F, -0.25F, -0.45F, -0.45F, -0.25F, -0.45F, -0.45F, -0.25F, -0.45F, -0.45F, -0.25F, -0.45F, -0.45F, -0.25F, -0.45F, -0.45F, -0.25F, -0.45F, -0.45F, -0.25F); // Box 111
		slideModel[6].setRotationPoint(3.7F, -3.9F, -0.5F);



		translateAll(0F, 0F, 0F);
		animationType = EnumAnimationType.BOTTOM_CLIP;

		flipAll();
	}
}