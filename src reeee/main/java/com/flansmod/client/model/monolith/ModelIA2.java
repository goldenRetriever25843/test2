//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 19.07.2016 - 15:38:30
// Last changed on: 19.07.2016 - 15:38:30

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelIA2 extends ModelGun //Same as Filename
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelIA2() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[102];
		defaultBarrelModel = new ModelRendererTurbo[24];
		defaultScopeModel = new ModelRendererTurbo[34];
		defaultStockModel = new ModelRendererTurbo[25];
		defaultGripModel = new ModelRendererTurbo[17];
		ammoModel = new ModelRendererTurbo[36];

		initgunModel_1();
		initdefaultBarrelModel_1();
		initdefaultScopeModel_1();
		initdefaultStockModel_1();
		initdefaultGripModel_1();
		initammoModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 101, 1049, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 85, 1105, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 57, 1017, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 57, 1017, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 57, 1017, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 57, 1017, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 57, 1017, textureX, textureY); // Box 6
		gunModel[7] = new ModelRendererTurbo(this, 133, 985, textureX, textureY); // Box 7
		gunModel[8] = new ModelRendererTurbo(this, 133, 985, textureX, textureY); // Box 8
		gunModel[9] = new ModelRendererTurbo(this, 133, 985, textureX, textureY); // Box 9
		gunModel[10] = new ModelRendererTurbo(this, 133, 985, textureX, textureY); // Box 10
		gunModel[11] = new ModelRendererTurbo(this, 133, 985, textureX, textureY); // Box 11
		gunModel[12] = new ModelRendererTurbo(this, 133, 985, textureX, textureY); // Box 12
		gunModel[13] = new ModelRendererTurbo(this, 133, 985, textureX, textureY); // Box 13
		gunModel[14] = new ModelRendererTurbo(this, 133, 985, textureX, textureY); // Box 14
		gunModel[15] = new ModelRendererTurbo(this, 133, 985, textureX, textureY); // Box 15
		gunModel[16] = new ModelRendererTurbo(this, 41, 1085, textureX, textureY); // Box 16
		gunModel[17] = new ModelRendererTurbo(this, 101, 1049, textureX, textureY); // Box 17
		gunModel[18] = new ModelRendererTurbo(this, 149, 1157, textureX, textureY); // Box 18
		gunModel[19] = new ModelRendererTurbo(this, 149, 1157, textureX, textureY); // Box 19
		gunModel[20] = new ModelRendererTurbo(this, 57, 1017, textureX, textureY); // Box 22
		gunModel[21] = new ModelRendererTurbo(this, 321, 1037, textureX, textureY); // Box 25
		gunModel[22] = new ModelRendererTurbo(this, 321, 1037, textureX, textureY); // Box 26
		gunModel[23] = new ModelRendererTurbo(this, 149, 1157, textureX, textureY); // Box 27
		gunModel[24] = new ModelRendererTurbo(this, 57, 1017, textureX, textureY); // Box 28
		gunModel[25] = new ModelRendererTurbo(this, 57, 1017, textureX, textureY); // Box 29
		gunModel[26] = new ModelRendererTurbo(this, 57, 1017, textureX, textureY); // Box 30
		gunModel[27] = new ModelRendererTurbo(this, 57, 1017, textureX, textureY); // Box 31
		gunModel[28] = new ModelRendererTurbo(this, 149, 1157, textureX, textureY); // Box 32
		gunModel[29] = new ModelRendererTurbo(this, 149, 1157, textureX, textureY); // Box 33
		gunModel[30] = new ModelRendererTurbo(this, 149, 1157, textureX, textureY); // Box 34
		gunModel[31] = new ModelRendererTurbo(this, 149, 1157, textureX, textureY); // Box 35
		gunModel[32] = new ModelRendererTurbo(this, 149, 1157, textureX, textureY); // Box 36
		gunModel[33] = new ModelRendererTurbo(this, 149, 1157, textureX, textureY); // Box 37
		gunModel[34] = new ModelRendererTurbo(this, 149, 1157, textureX, textureY); // Box 38
		gunModel[35] = new ModelRendererTurbo(this, 149, 1157, textureX, textureY); // Box 39
		gunModel[36] = new ModelRendererTurbo(this, 149, 1157, textureX, textureY); // Box 40
		gunModel[37] = new ModelRendererTurbo(this, 149, 1157, textureX, textureY); // Box 41
		gunModel[38] = new ModelRendererTurbo(this, 149, 1157, textureX, textureY); // Box 42
		gunModel[39] = new ModelRendererTurbo(this, 149, 1157, textureX, textureY); // Box 43
		gunModel[40] = new ModelRendererTurbo(this, 149, 1157, textureX, textureY); // Box 44
		gunModel[41] = new ModelRendererTurbo(this, 149, 1157, textureX, textureY); // Box 45
		gunModel[42] = new ModelRendererTurbo(this, 149, 1157, textureX, textureY); // Box 46
		gunModel[43] = new ModelRendererTurbo(this, 149, 1157, textureX, textureY); // Box 47
		gunModel[44] = new ModelRendererTurbo(this, 149, 1157, textureX, textureY); // Box 48
		gunModel[45] = new ModelRendererTurbo(this, 149, 1157, textureX, textureY); // Box 49
		gunModel[46] = new ModelRendererTurbo(this, 149, 1157, textureX, textureY); // Box 50
		gunModel[47] = new ModelRendererTurbo(this, 149, 1157, textureX, textureY); // Box 51
		gunModel[48] = new ModelRendererTurbo(this, 149, 1157, textureX, textureY); // Box 52
		gunModel[49] = new ModelRendererTurbo(this, 149, 1157, textureX, textureY); // Box 53
		gunModel[50] = new ModelRendererTurbo(this, 149, 1157, textureX, textureY); // Box 54
		gunModel[51] = new ModelRendererTurbo(this, 321, 1037, textureX, textureY); // Box 55
		gunModel[52] = new ModelRendererTurbo(this, 321, 1037, textureX, textureY); // Box 56
		gunModel[53] = new ModelRendererTurbo(this, 321, 1037, textureX, textureY); // Box 57
		gunModel[54] = new ModelRendererTurbo(this, 321, 1037, textureX, textureY); // Box 58
		gunModel[55] = new ModelRendererTurbo(this, 321, 1037, textureX, textureY); // Box 59
		gunModel[56] = new ModelRendererTurbo(this, 321, 1037, textureX, textureY); // Box 60
		gunModel[57] = new ModelRendererTurbo(this, 321, 1037, textureX, textureY); // Box 61
		gunModel[58] = new ModelRendererTurbo(this, 321, 1037, textureX, textureY); // Box 62
		gunModel[59] = new ModelRendererTurbo(this, 321, 1037, textureX, textureY); // Box 63
		gunModel[60] = new ModelRendererTurbo(this, 321, 1037, textureX, textureY); // Box 64
		gunModel[61] = new ModelRendererTurbo(this, 321, 1037, textureX, textureY); // Box 65
		gunModel[62] = new ModelRendererTurbo(this, 321, 1037, textureX, textureY); // Box 66
		gunModel[63] = new ModelRendererTurbo(this, 321, 1037, textureX, textureY); // Box 67
		gunModel[64] = new ModelRendererTurbo(this, 321, 1037, textureX, textureY); // Box 68
		gunModel[65] = new ModelRendererTurbo(this, 321, 1037, textureX, textureY); // Box 69
		gunModel[66] = new ModelRendererTurbo(this, 321, 1037, textureX, textureY); // Box 70
		gunModel[67] = new ModelRendererTurbo(this, 321, 1037, textureX, textureY); // Box 71
		gunModel[68] = new ModelRendererTurbo(this, 1045, 353, textureX, textureY); // Box 94
		gunModel[69] = new ModelRendererTurbo(this, 1045, 353, textureX, textureY); // Box 95
		gunModel[70] = new ModelRendererTurbo(this, 1045, 353, textureX, textureY); // Box 96
		gunModel[71] = new ModelRendererTurbo(this, 1045, 353, textureX, textureY); // Box 97
		gunModel[72] = new ModelRendererTurbo(this, 1045, 353, textureX, textureY); // Box 98
		gunModel[73] = new ModelRendererTurbo(this, 1045, 353, textureX, textureY); // Box 99
		gunModel[74] = new ModelRendererTurbo(this, 1033, 369, textureX, textureY); // Box 100
		gunModel[75] = new ModelRendererTurbo(this, 1045, 353, textureX, textureY); // Box 101
		gunModel[76] = new ModelRendererTurbo(this, 1045, 353, textureX, textureY); // Box 102
		gunModel[77] = new ModelRendererTurbo(this, 1045, 353, textureX, textureY); // Box 103
		gunModel[78] = new ModelRendererTurbo(this, 1045, 353, textureX, textureY); // Box 104
		gunModel[79] = new ModelRendererTurbo(this, 1045, 353, textureX, textureY); // Box 105
		gunModel[80] = new ModelRendererTurbo(this, 1045, 353, textureX, textureY); // Box 107
		gunModel[81] = new ModelRendererTurbo(this, 621, 521, textureX, textureY); // Box 110
		gunModel[82] = new ModelRendererTurbo(this, 621, 521, textureX, textureY); // Box 111
		gunModel[83] = new ModelRendererTurbo(this, 621, 521, textureX, textureY); // Box 112
		gunModel[84] = new ModelRendererTurbo(this, 621, 521, textureX, textureY); // Box 113
		gunModel[85] = new ModelRendererTurbo(this, 621, 521, textureX, textureY); // Box 114
		gunModel[86] = new ModelRendererTurbo(this, 57, 1017, textureX, textureY); // Box 134
		gunModel[87] = new ModelRendererTurbo(this, 57, 1017, textureX, textureY); // Box 135
		gunModel[88] = new ModelRendererTurbo(this, 57, 1017, textureX, textureY); // Box 136
		gunModel[89] = new ModelRendererTurbo(this, 1097, 397, textureX, textureY); // Box 139
		gunModel[90] = new ModelRendererTurbo(this, 1097, 397, textureX, textureY); // Box 156
		gunModel[91] = new ModelRendererTurbo(this, 1097, 397, textureX, textureY); // Box 157
		gunModel[92] = new ModelRendererTurbo(this, 1097, 397, textureX, textureY); // Box 148
		gunModel[93] = new ModelRendererTurbo(this, 621, 521, textureX, textureY); // Box 170
		gunModel[94] = new ModelRendererTurbo(this, 621, 521, textureX, textureY); // Box 171
		gunModel[95] = new ModelRendererTurbo(this, 621, 521, textureX, textureY); // Box 172
		gunModel[96] = new ModelRendererTurbo(this, 621, 521, textureX, textureY); // Box 173
		gunModel[97] = new ModelRendererTurbo(this, 241, 1105, textureX, textureY); // Box 189
		gunModel[98] = new ModelRendererTurbo(this, 701, 517, textureX, textureY); // Box 198
		gunModel[99] = new ModelRendererTurbo(this, 621, 521, textureX, textureY); // Box 210
		gunModel[100] = new ModelRendererTurbo(this, 1045, 353, textureX, textureY); // Box 211
		gunModel[101] = new ModelRendererTurbo(this, 1045, 353, textureX, textureY); // Box 212

		gunModel[0].addBox(0F, 0F, 0F, 77, 6, 10, 0F); // Box 0
		gunModel[0].setRotationPoint(-73F, -61F, 0F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 77, 3, 10, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		gunModel[1].setRotationPoint(-73F, -64F, 0F);

		gunModel[2].addBox(0F, 0F, 0F, 101, 6, 10, 0F); // Box 2
		gunModel[2].setRotationPoint(4F, -61F, 0F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 3, 6, 10, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 3
		gunModel[3].setRotationPoint(105F, -61F, 0F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 2, 5, 10, 0F,0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F); // Box 4
		gunModel[4].setRotationPoint(109F, -61F, 0F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F); // Box 5
		gunModel[5].setRotationPoint(112F, -60F, 0F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,3F, 0F, -2F, 1F, -0.5F, -2F, 1F, -0.5F, -2F, 3F, 0F, -2F, 0F, -1F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, 0F, -1F, 0F); // Box 6
		gunModel[6].setRotationPoint(102F, -64F, 0F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,3F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, -2F, 3F, 0F, -2F, 0F, -1F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, 0F, -1F, 0F); // Box 7
		gunModel[7].setRotationPoint(90F, -64F, 0F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,3F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, -2F, 3F, 0F, -2F, 0F, -1F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, -1F, 0F); // Box 8
		gunModel[8].setRotationPoint(80F, -64F, 0F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,3F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, -2F, 3F, 0F, -2F, 0F, -1F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, -1F, 0F); // Box 9
		gunModel[9].setRotationPoint(71F, -64F, 0F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,3F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, -2F, 3F, 0F, -2F, 0F, -1F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, -1F, 0F); // Box 10
		gunModel[10].setRotationPoint(62F, -64F, 0F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,3F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, -2F, 3F, 0F, -2F, 0F, -1F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, -1F, 0F); // Box 11
		gunModel[11].setRotationPoint(53F, -64F, 0F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,3F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, -2F, 3F, 0F, -2F, 0F, -1F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, -1F, 0F); // Box 12
		gunModel[12].setRotationPoint(43F, -64F, 0F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,3F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, -2F, 3F, 0F, -2F, 0F, -1F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, -1F, 0F); // Box 13
		gunModel[13].setRotationPoint(34F, -64F, 0F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,3F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, -2F, 3F, 0F, -2F, 0F, -1F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, -1F, 0F); // Box 14
		gunModel[14].setRotationPoint(24F, -64F, 0F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,3F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, -2F, 3F, 0F, -2F, 0F, -1F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, -1F, 0F); // Box 15
		gunModel[15].setRotationPoint(14F, -64F, 0F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, -1F, 0F); // Box 16
		gunModel[16].setRotationPoint(4F, -64F, 0F);

		gunModel[17].addBox(0F, 0F, 0F, 77, 2, 6, 0F); // Box 17
		gunModel[17].setRotationPoint(-73F, -66F, 2F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 88, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		gunModel[18].setRotationPoint(4F, -66F, 2F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 12, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0F, 0F); // Box 19
		gunModel[19].setRotationPoint(92F, -66F, 2F);

		gunModel[20].addBox(0F, 0F, 0F, 113, 11, 10, 0F); // Box 22
		gunModel[20].setRotationPoint(4F, -55F, 0F);

		gunModel[21].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 25
		gunModel[21].setRotationPoint(-2F, -67F, 2F);

		gunModel[22].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 26
		gunModel[22].setRotationPoint(2F, -67F, 2F);

		gunModel[23].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 27
		gunModel[23].setRotationPoint(6F, -67F, 2F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 97, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 28
		gunModel[24].setRotationPoint(18F, -44F, 0F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 12, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 2F, -1F); // Box 29
		gunModel[25].setRotationPoint(6F, -44F, 0F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 2, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 2F, -1F); // Box 30
		gunModel[26].setRotationPoint(4F, -44F, 0F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Box 31
		gunModel[27].setRotationPoint(115F, -44F, 0F);

		gunModel[28].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 32
		gunModel[28].setRotationPoint(11F, -67F, 2F);

		gunModel[29].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 33
		gunModel[29].setRotationPoint(15F, -67F, 2F);

		gunModel[30].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 34
		gunModel[30].setRotationPoint(19F, -67F, 2F);

		gunModel[31].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 35
		gunModel[31].setRotationPoint(22F, -67F, 2F);

		gunModel[32].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 36
		gunModel[32].setRotationPoint(26F, -67F, 2F);

		gunModel[33].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 37
		gunModel[33].setRotationPoint(30F, -67F, 2F);

		gunModel[34].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 38
		gunModel[34].setRotationPoint(34F, -67F, 2F);

		gunModel[35].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 39
		gunModel[35].setRotationPoint(38F, -67F, 2F);

		gunModel[36].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 40
		gunModel[36].setRotationPoint(42F, -67F, 2F);

		gunModel[37].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 41
		gunModel[37].setRotationPoint(46F, -67F, 2F);

		gunModel[38].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 42
		gunModel[38].setRotationPoint(50F, -67F, 2F);

		gunModel[39].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 43
		gunModel[39].setRotationPoint(54F, -67F, 2F);

		gunModel[40].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 44
		gunModel[40].setRotationPoint(59F, -67F, 2F);

		gunModel[41].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 45
		gunModel[41].setRotationPoint(64F, -67F, 2F);

		gunModel[42].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 46
		gunModel[42].setRotationPoint(68F, -67F, 2F);

		gunModel[43].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 47
		gunModel[43].setRotationPoint(72F, -67F, 2F);

		gunModel[44].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 48
		gunModel[44].setRotationPoint(76F, -67F, 2F);

		gunModel[45].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 49
		gunModel[45].setRotationPoint(80F, -67F, 2F);

		gunModel[46].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 50
		gunModel[46].setRotationPoint(84F, -67F, 2F);

		gunModel[47].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 51
		gunModel[47].setRotationPoint(88F, -67F, 2F);

		gunModel[48].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 52
		gunModel[48].setRotationPoint(92F, -67F, 2F);

		gunModel[49].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 53
		gunModel[49].setRotationPoint(96F, -67F, 2F);

		gunModel[50].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 54
		gunModel[50].setRotationPoint(100F, -67F, 2F);

		gunModel[51].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 55
		gunModel[51].setRotationPoint(-6F, -67F, 2F);

		gunModel[52].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 56
		gunModel[52].setRotationPoint(-10F, -67F, 2F);

		gunModel[53].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 57
		gunModel[53].setRotationPoint(-14F, -67F, 2F);

		gunModel[54].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 58
		gunModel[54].setRotationPoint(-18F, -67F, 2F);

		gunModel[55].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 59
		gunModel[55].setRotationPoint(-22F, -67F, 2F);

		gunModel[56].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 60
		gunModel[56].setRotationPoint(-26F, -67F, 2F);

		gunModel[57].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 61
		gunModel[57].setRotationPoint(-30F, -67F, 2F);

		gunModel[58].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 62
		gunModel[58].setRotationPoint(-34F, -67F, 2F);

		gunModel[59].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 63
		gunModel[59].setRotationPoint(-38F, -67F, 2F);

		gunModel[60].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 64
		gunModel[60].setRotationPoint(-42F, -67F, 2F);

		gunModel[61].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 65
		gunModel[61].setRotationPoint(-46F, -67F, 2F);

		gunModel[62].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 66
		gunModel[62].setRotationPoint(-50F, -67F, 2F);

		gunModel[63].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 67
		gunModel[63].setRotationPoint(-54F, -67F, 2F);

		gunModel[64].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 68
		gunModel[64].setRotationPoint(-58F, -67F, 2F);

		gunModel[65].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 69
		gunModel[65].setRotationPoint(-62F, -67F, 2F);

		gunModel[66].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 70
		gunModel[66].setRotationPoint(-66F, -67F, 2F);

		gunModel[67].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 71
		gunModel[67].setRotationPoint(-70F, -67F, 2F);

		gunModel[68].addBox(0F, 0F, 0F, 77, 10, 10, 0F); // Box 94
		gunModel[68].setRotationPoint(-73F, -55F, 0F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 3, 3, 10, 0F,2F, 0F, 0F, 22F, 0F, 0F, 22F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		gunModel[69].setRotationPoint(-27F, -45F, 0F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,2F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 6F, 1F, 0F, 6F, 1F, 0F, 0F, 0F, 0F); // Box 96
		gunModel[70].setRotationPoint(-36F, -45F, 0F);

		gunModel[71].addBox(0F, 0F, 0F, 11, 10, 8, 0F); // Box 97
		gunModel[71].setRotationPoint(-84F, -55F, 1F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 11, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 4F, 0F, 42F, 4F, 0F, 0F, 0F, 0F); // Box 98
		gunModel[72].setRotationPoint(-84F, -45F, 1F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 11, 7, 8, 0F,26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 26F, 0F, 0F, 0F, 0F, 0F, 0F, 2.7F, 0F, 0F, 2.7F, 0F, 0F, 0F, 0F); // Box 99
		gunModel[73].setRotationPoint(-47F, -45F, 1F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 11, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		gunModel[74].setRotationPoint(-7F, -45F, 1F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 29, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		gunModel[75].setRotationPoint(-36F, -45F, 1F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 5, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0.5F, 0F); // Box 102
		gunModel[76].setRotationPoint(-36F, -39F, 1F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 5, 10, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F); // Box 103
		gunModel[77].setRotationPoint(-2F, -39F, 1F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 5, 11, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F); // Box 104
		gunModel[78].setRotationPoint(-14F, -39F, 1F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 7, 10, 8, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F); // Box 105
		gunModel[79].setRotationPoint(-9F, -38.5F, 1F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 5, 11, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F); // Box 107
		gunModel[80].setRotationPoint(-19F, -39F, 1F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 110
		gunModel[81].setRotationPoint(-33F, -34F, 3.5F);

		gunModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 111
		gunModel[82].setRotationPoint(-34F, -30F, 3.5F);

		gunModel[83].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 112
		gunModel[83].setRotationPoint(-35F, -26F, 3.5F);

		gunModel[84].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 2F, 0F); // Box 113
		gunModel[84].setRotationPoint(-36F, -23F, 3.5F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 10, 0, 4, 0F,-1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 0F, 2F, 0F); // Box 114
		gunModel[85].setRotationPoint(-47F, -23F, 3.5F);

		gunModel[86].addShapeBox(0F, 0F, 0F, 4, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 134
		gunModel[86].setRotationPoint(117F, -44F, 2F);

		gunModel[87].addShapeBox(0F, 0F, 0F, 4, 2, 7, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		gunModel[87].setRotationPoint(117F, -56F, 2F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 4, 10, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		gunModel[88].setRotationPoint(117F, -54F, 2F);

		gunModel[89].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		gunModel[89].setRotationPoint(121F, -55F, 3.5F);

		gunModel[90].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 156
		gunModel[90].setRotationPoint(121F, -48F, 3.5F);

		gunModel[91].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		gunModel[91].setRotationPoint(121F, -54F, 3.5F);

		gunModel[92].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		gunModel[92].setRotationPoint(162F, -53F, 3.5F);

		gunModel[93].addShapeBox(0F, 0F, 0F, 5, 0, 4, 0F,-1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 0F, 0.5F, 0F); // Box 170
		gunModel[93].setRotationPoint(-53F, -23F, 3.5F);

		gunModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3.5F, 0F); // Box 171
		gunModel[94].setRotationPoint(-53F, -27F, 3.5F);

		gunModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 172
		gunModel[95].setRotationPoint(-52F, -31F, 3.5F);

		gunModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, -1F, 1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 173
		gunModel[96].setRotationPoint(-51F, -35F, 3.5F);

		gunModel[97].addShapeBox(0F, 0F, 0F, 5, 29, 8, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F); // Box 189
		gunModel[97].setRotationPoint(-150F, -38F, 1F);

		gunModel[98].addShapeBox(0F, 0F, 0F, 5, 12, 4, 0F,0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 198
		gunModel[98].setRotationPoint(-55F, -35F, 3.5F);

		gunModel[99].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, -1F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -1F, 3F, 0F); // Box 210
		gunModel[99].setRotationPoint(-46F, -35.5F, 5F);

		gunModel[100].addShapeBox(0F, 0F, 0F, 6, 12, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F); // Box 211
		gunModel[100].setRotationPoint(-25F, -39F, 1F);

		gunModel[101].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 212
		gunModel[101].setRotationPoint(-31F, -39F, 1F);
	}

	private void initdefaultBarrelModel_1()
	{
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 1097, 397, textureX, textureY); // Box 137
		defaultBarrelModel[1] = new ModelRendererTurbo(this, 1097, 397, textureX, textureY); // Box 138
		defaultBarrelModel[2] = new ModelRendererTurbo(this, 1097, 397, textureX, textureY); // Box 140
		defaultBarrelModel[3] = new ModelRendererTurbo(this, 1097, 397, textureX, textureY); // Box 141
		defaultBarrelModel[4] = new ModelRendererTurbo(this, 1097, 397, textureX, textureY); // Box 142
		defaultBarrelModel[5] = new ModelRendererTurbo(this, 1097, 397, textureX, textureY); // Box 143
		defaultBarrelModel[6] = new ModelRendererTurbo(this, 1097, 397, textureX, textureY); // Box 144
		defaultBarrelModel[7] = new ModelRendererTurbo(this, 1097, 397, textureX, textureY); // Box 145
		defaultBarrelModel[8] = new ModelRendererTurbo(this, 1097, 397, textureX, textureY); // Box 146
		defaultBarrelModel[9] = new ModelRendererTurbo(this, 1097, 397, textureX, textureY); // Box 147
		defaultBarrelModel[10] = new ModelRendererTurbo(this, 1097, 397, textureX, textureY); // Box 148
		defaultBarrelModel[11] = new ModelRendererTurbo(this, 1097, 397, textureX, textureY); // Box 149
		defaultBarrelModel[12] = new ModelRendererTurbo(this, 1097, 397, textureX, textureY); // Box 150
		defaultBarrelModel[13] = new ModelRendererTurbo(this, 1097, 397, textureX, textureY); // Box 151
		defaultBarrelModel[14] = new ModelRendererTurbo(this, 1097, 397, textureX, textureY); // Box 152
		defaultBarrelModel[15] = new ModelRendererTurbo(this, 1097, 397, textureX, textureY); // Box 153
		defaultBarrelModel[16] = new ModelRendererTurbo(this, 1097, 397, textureX, textureY); // Box 154
		defaultBarrelModel[17] = new ModelRendererTurbo(this, 1097, 397, textureX, textureY); // Box 155
		defaultBarrelModel[18] = new ModelRendererTurbo(this, 1097, 397, textureX, textureY); // Box 145
		defaultBarrelModel[19] = new ModelRendererTurbo(this, 1097, 397, textureX, textureY); // Box 146
		defaultBarrelModel[20] = new ModelRendererTurbo(this, 1097, 397, textureX, textureY); // Box 147
		defaultBarrelModel[21] = new ModelRendererTurbo(this, 1097, 397, textureX, textureY); // Box 149
		defaultBarrelModel[22] = new ModelRendererTurbo(this, 1097, 397, textureX, textureY); // Box 150
		defaultBarrelModel[23] = new ModelRendererTurbo(this, 1097, 397, textureX, textureY); // Box 151

		defaultBarrelModel[0].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		defaultBarrelModel[0].setRotationPoint(129F, -54F, 3.5F);

		defaultBarrelModel[1].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		defaultBarrelModel[1].setRotationPoint(123F, -54F, 3.5F);

		defaultBarrelModel[2].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		defaultBarrelModel[2].setRotationPoint(126F, -53F, 3.5F);

		defaultBarrelModel[3].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		defaultBarrelModel[3].setRotationPoint(133F, -53F, 3.5F);

		defaultBarrelModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		defaultBarrelModel[4].setRotationPoint(142F, -54F, 3.5F);

		defaultBarrelModel[5].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		defaultBarrelModel[5].setRotationPoint(144F, -53F, 3.5F);

		defaultBarrelModel[6].addShapeBox(0F, 0F, 0F, 9, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		defaultBarrelModel[6].setRotationPoint(144F, -52F, 3.5F);

		defaultBarrelModel[7].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 145
		defaultBarrelModel[7].setRotationPoint(144F, -50F, 3.5F);

		defaultBarrelModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 146
		defaultBarrelModel[8].setRotationPoint(142F, -49F, 3.5F);

		defaultBarrelModel[9].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 147
		defaultBarrelModel[9].setRotationPoint(133F, -50F, 3.5F);

		defaultBarrelModel[10].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 148
		defaultBarrelModel[10].setRotationPoint(129F, -49F, 3.5F);

		defaultBarrelModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 149
		defaultBarrelModel[11].setRotationPoint(126F, -50F, 3.5F);

		defaultBarrelModel[12].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 150
		defaultBarrelModel[12].setRotationPoint(123F, -49F, 3.5F);

		defaultBarrelModel[13].addShapeBox(0F, 0F, 0F, 9, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		defaultBarrelModel[13].setRotationPoint(133F, -52F, 3.5F);

		defaultBarrelModel[14].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		defaultBarrelModel[14].setRotationPoint(126F, -52F, 3.5F);

		defaultBarrelModel[15].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		defaultBarrelModel[15].setRotationPoint(129F, -53F, 3.5F);

		defaultBarrelModel[16].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		defaultBarrelModel[16].setRotationPoint(142F, -53F, 3.5F);

		defaultBarrelModel[17].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		defaultBarrelModel[17].setRotationPoint(123F, -53F, 3.5F);

		defaultBarrelModel[18].addShapeBox(0F, 0F, 0F, 16, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		defaultBarrelModel[18].setRotationPoint(153F, -54F, 3.5F);

		defaultBarrelModel[19].addShapeBox(0F, 0F, 0F, 16, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 146
		defaultBarrelModel[19].setRotationPoint(153F, -49F, 3.5F);

		defaultBarrelModel[20].addShapeBox(0F, 0F, 0F, 9, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		defaultBarrelModel[20].setRotationPoint(153F, -53F, 3.5F);

		defaultBarrelModel[21].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		defaultBarrelModel[21].setRotationPoint(162F, -50F, 3.5F);

		defaultBarrelModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		defaultBarrelModel[22].setRotationPoint(168F, -52F, 3.5F);

		defaultBarrelModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		defaultBarrelModel[23].setRotationPoint(168F, -52F, 6.5F);
	}

	private void initdefaultScopeModel_1()
	{
		defaultScopeModel[0] = new ModelRendererTurbo(this, 967, 341, textureX, textureY); // Box 72
		defaultScopeModel[1] = new ModelRendererTurbo(this, 967, 341, textureX, textureY); // Box 73
		defaultScopeModel[2] = new ModelRendererTurbo(this, 967, 341, textureX, textureY); // Box 74
		defaultScopeModel[3] = new ModelRendererTurbo(this, 957, 323, textureX, textureY); // Box 75
		defaultScopeModel[4] = new ModelRendererTurbo(this, 967, 341, textureX, textureY); // Box 76
		defaultScopeModel[5] = new ModelRendererTurbo(this, 947, 357, textureX, textureY); // Box 77
		defaultScopeModel[6] = new ModelRendererTurbo(this, 947, 357, textureX, textureY); // Box 78
		defaultScopeModel[7] = new ModelRendererTurbo(this, 947, 357, textureX, textureY); // Box 79
		defaultScopeModel[8] = new ModelRendererTurbo(this, 921, 379, textureX, textureY); // Box 81
		defaultScopeModel[9] = new ModelRendererTurbo(this, 933, 341, textureX, textureY); // Box 82
		defaultScopeModel[10] = new ModelRendererTurbo(this, 933, 399, textureX, textureY); // Box 84
		defaultScopeModel[11] = new ModelRendererTurbo(this, 997, 387, textureX, textureY); // Box 85
		defaultScopeModel[12] = new ModelRendererTurbo(this, 965, 361, textureX, textureY); // Box 86
		defaultScopeModel[13] = new ModelRendererTurbo(this, 991, 329, textureX, textureY); // Box 87
		defaultScopeModel[14] = new ModelRendererTurbo(this, 963, 393, textureX, textureY); // Box 88
		defaultScopeModel[15] = new ModelRendererTurbo(this, 913, 329, textureX, textureY); // Box 89
		defaultScopeModel[16] = new ModelRendererTurbo(this, 987, 365, textureX, textureY); // Box 90
		defaultScopeModel[17] = new ModelRendererTurbo(this, 941, 375, textureX, textureY); // Box 91
		defaultScopeModel[18] = new ModelRendererTurbo(this, 921, 353, textureX, textureY); // Box 92
		defaultScopeModel[19] = new ModelRendererTurbo(this, 947, 333, textureX, textureY); // Box 93
		defaultScopeModel[20] = new ModelRendererTurbo(this, 1063, 357, textureX, textureY); // Box 154
		defaultScopeModel[21] = new ModelRendererTurbo(this, 999, 365, textureX, textureY); // Box 155
		defaultScopeModel[22] = new ModelRendererTurbo(this, 999, 365, textureX, textureY); // Box 156
		defaultScopeModel[23] = new ModelRendererTurbo(this, 999, 365, textureX, textureY); // Box 157
		defaultScopeModel[24] = new ModelRendererTurbo(this, 999, 365, textureX, textureY); // Box 158
		defaultScopeModel[25] = new ModelRendererTurbo(this, 1169, 357, textureX, textureY); // Box 159
		defaultScopeModel[26] = new ModelRendererTurbo(this, 713, 369, textureX, textureY); // Box 160
		defaultScopeModel[27] = new ModelRendererTurbo(this, 1169, 357, textureX, textureY); // Box 163
		defaultScopeModel[28] = new ModelRendererTurbo(this, 1169, 357, textureX, textureY); // Box 164
		defaultScopeModel[29] = new ModelRendererTurbo(this, 1169, 357, textureX, textureY); // Box 165
		defaultScopeModel[30] = new ModelRendererTurbo(this, 1169, 357, textureX, textureY); // Box 166
		defaultScopeModel[31] = new ModelRendererTurbo(this, 1169, 357, textureX, textureY); // Box 167
		defaultScopeModel[32] = new ModelRendererTurbo(this, 1169, 357, textureX, textureY); // Box 168
		defaultScopeModel[33] = new ModelRendererTurbo(this, 1169, 357, textureX, textureY); // Box 169

		defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		defaultScopeModel[0].setRotationPoint(-84F, -67F, 1F);

		defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 1, 13, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		defaultScopeModel[1].setRotationPoint(-83F, -68F, 1F);

		defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 1, 14, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		defaultScopeModel[2].setRotationPoint(-82F, -69F, 1F);

		defaultScopeModel[3].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		defaultScopeModel[3].setRotationPoint(-81F, -70F, 1F);

		defaultScopeModel[4].addShapeBox(0F, 0F, 0F, 2, 15, 2, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		defaultScopeModel[4].setRotationPoint(-80F, -70F, 1F);

		defaultScopeModel[5].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		defaultScopeModel[5].setRotationPoint(-78F, -70F, 1F);

		defaultScopeModel[6].addShapeBox(0F, 0F, 0F, 1, 14, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		defaultScopeModel[6].setRotationPoint(-77F, -69F, 1F);

		defaultScopeModel[7].addShapeBox(0F, 0F, 0F, 1, 13, 2, 0F,0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		defaultScopeModel[7].setRotationPoint(-76F, -68F, 1F);

		defaultScopeModel[8].addShapeBox(0F, 0F, 0F, 1, 13, 2, 0F,0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 81
		defaultScopeModel[8].setRotationPoint(-75F, -67.5F, 1F);

		defaultScopeModel[9].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		defaultScopeModel[9].setRotationPoint(-74F, -67F, 1F);

		defaultScopeModel[10].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		defaultScopeModel[10].setRotationPoint(-74F, -67F, 7F);

		defaultScopeModel[11].addShapeBox(0F, 0F, 0F, 1, 13, 2, 0F,0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 85
		defaultScopeModel[11].setRotationPoint(-75F, -67.5F, 7F);

		defaultScopeModel[12].addShapeBox(0F, 0F, 0F, 1, 13, 2, 0F,0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		defaultScopeModel[12].setRotationPoint(-76F, -68F, 7F);

		defaultScopeModel[13].addShapeBox(0F, 0F, 0F, 1, 14, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		defaultScopeModel[13].setRotationPoint(-77F, -69F, 7F);

		defaultScopeModel[14].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		defaultScopeModel[14].setRotationPoint(-78F, -70F, 7F);

		defaultScopeModel[15].addShapeBox(0F, 0F, 0F, 2, 15, 2, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		defaultScopeModel[15].setRotationPoint(-80F, -70F, 7F);

		defaultScopeModel[16].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		defaultScopeModel[16].setRotationPoint(-81F, -70F, 7F);

		defaultScopeModel[17].addShapeBox(0F, 0F, 0F, 1, 14, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		defaultScopeModel[17].setRotationPoint(-82F, -69F, 7F);

		defaultScopeModel[18].addShapeBox(0F, 0F, 0F, 1, 13, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		defaultScopeModel[18].setRotationPoint(-83F, -68F, 7F);

		defaultScopeModel[19].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		defaultScopeModel[19].setRotationPoint(-84F, -67F, 7F);

		defaultScopeModel[20].addBox(0F, 0F, 0F, 11, 10, 4, 0F); // Box 154
		defaultScopeModel[20].setRotationPoint(-84F, -66F, 3F);

		defaultScopeModel[21].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 155
		defaultScopeModel[21].setRotationPoint(-81F, -68F, 4F);

		defaultScopeModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		defaultScopeModel[22].setRotationPoint(-81F, -70F, 4F);

		defaultScopeModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 157
		defaultScopeModel[23].setRotationPoint(-81F, -69F, 4F);

		defaultScopeModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 158
		defaultScopeModel[24].setRotationPoint(-81F, -69F, 5.5F);

		defaultScopeModel[25].addShapeBox(0F, 0F, 0F, 10, 1, 6, 0F,0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 159
		defaultScopeModel[25].setRotationPoint(107F, -62F, 2F);

		defaultScopeModel[26].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 160
		defaultScopeModel[26].setRotationPoint(113F, -71F, 4.5F);

		defaultScopeModel[27].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 163
		defaultScopeModel[27].setRotationPoint(107F, -70F, 8F);

		defaultScopeModel[28].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		defaultScopeModel[28].setRotationPoint(107F, -72F, 8F);

		defaultScopeModel[29].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 165
		defaultScopeModel[29].setRotationPoint(107F, -70F, 1F);

		defaultScopeModel[30].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		defaultScopeModel[30].setRotationPoint(107F, -72F, 1F);

		defaultScopeModel[31].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		defaultScopeModel[31].setRotationPoint(107F, -74F, 8F);

		defaultScopeModel[32].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		defaultScopeModel[32].setRotationPoint(107F, -74F, 1F);

		defaultScopeModel[33].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 169
		defaultScopeModel[33].setRotationPoint(107F, -75F, 3F);
	}

	private void initdefaultStockModel_1()
	{
		defaultStockModel[0] = new ModelRendererTurbo(this, 317, 1061, textureX, textureY); // Box 120
		defaultStockModel[1] = new ModelRendererTurbo(this, 241, 1105, textureX, textureY); // Box 121
		defaultStockModel[2] = new ModelRendererTurbo(this, 241, 1105, textureX, textureY); // Box 122
		defaultStockModel[3] = new ModelRendererTurbo(this, 241, 1105, textureX, textureY); // Box 123
		defaultStockModel[4] = new ModelRendererTurbo(this, 241, 1105, textureX, textureY); // Box 124
		defaultStockModel[5] = new ModelRendererTurbo(this, 241, 1105, textureX, textureY); // Box 125
		defaultStockModel[6] = new ModelRendererTurbo(this, 241, 1105, textureX, textureY); // Box 126
		defaultStockModel[7] = new ModelRendererTurbo(this, 241, 1105, textureX, textureY); // Box 152
		defaultStockModel[8] = new ModelRendererTurbo(this, 241, 1105, textureX, textureY); // Box 153
		defaultStockModel[9] = new ModelRendererTurbo(this, 241, 1105, textureX, textureY); // Box 177
		defaultStockModel[10] = new ModelRendererTurbo(this, 241, 1105, textureX, textureY); // Box 181
		defaultStockModel[11] = new ModelRendererTurbo(this, 241, 1105, textureX, textureY); // Box 183
		defaultStockModel[12] = new ModelRendererTurbo(this, 241, 1105, textureX, textureY); // Box 185
		defaultStockModel[13] = new ModelRendererTurbo(this, 241, 1105, textureX, textureY); // Box 188
		defaultStockModel[14] = new ModelRendererTurbo(this, 241, 1105, textureX, textureY); // Box 190
		defaultStockModel[15] = new ModelRendererTurbo(this, 241, 1105, textureX, textureY); // Box 200
		defaultStockModel[16] = new ModelRendererTurbo(this, 241, 1105, textureX, textureY); // Box 203
		defaultStockModel[17] = new ModelRendererTurbo(this, 633, 737, textureX, textureY); // Box 204
		defaultStockModel[18] = new ModelRendererTurbo(this, 573, 721, textureX, textureY); // Box 205
		defaultStockModel[19] = new ModelRendererTurbo(this, 633, 737, textureX, textureY); // Box 206
		defaultStockModel[20] = new ModelRendererTurbo(this, 241, 1105, textureX, textureY); // Box 207
		defaultStockModel[21] = new ModelRendererTurbo(this, 241, 1105, textureX, textureY); // Box 194
		defaultStockModel[22] = new ModelRendererTurbo(this, 241, 1105, textureX, textureY); // Box 195
		defaultStockModel[23] = new ModelRendererTurbo(this, 241, 1105, textureX, textureY); // Box 196
		defaultStockModel[24] = new ModelRendererTurbo(this, 241, 1105, textureX, textureY); // Box 197

		defaultStockModel[0].addShapeBox(0F, 0F, 0F, 14, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		defaultStockModel[0].setRotationPoint(-98F, -41F, 0F);

		defaultStockModel[1].addShapeBox(0F, 0F, 0F, 14, 14, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		defaultStockModel[1].setRotationPoint(-98F, -55F, 0F);

		defaultStockModel[2].addShapeBox(0F, 0F, 0F, 14, 3, 8, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		defaultStockModel[2].setRotationPoint(-98F, -58F, 1F);

		defaultStockModel[3].addShapeBox(0F, 0F, 0F, 6, 3, 8, 0F,0F, -1F, -1F, 0F, 1.5F, -1F, 0F, 1.5F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		defaultStockModel[3].setRotationPoint(-90F, -61F, 1F);

		defaultStockModel[4].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F,0F, -1F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 124
		defaultStockModel[4].setRotationPoint(-98F, -59F, 1F);

		defaultStockModel[5].addShapeBox(0F, 0F, 0F, 14, 9, 8, 0F,0F, -5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 125
		defaultStockModel[5].setRotationPoint(-112F, -58F, 1F);

		defaultStockModel[6].addShapeBox(0F, 0F, 0F, 42, 9, 8, 0F,0F, -5F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		defaultStockModel[6].setRotationPoint(-154F, -58F, 1F);

		defaultStockModel[7].addShapeBox(0F, 0F, 0F, 42, 9, 8, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 152
		defaultStockModel[7].setRotationPoint(-154F, -54F, 1F);

		defaultStockModel[8].addShapeBox(0F, 0F, 0F, 14, 9, 8, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		defaultStockModel[8].setRotationPoint(-112F, -54F, 1F);

		defaultStockModel[9].addShapeBox(0F, 0F, 0F, 14, 7, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 177
		defaultStockModel[9].setRotationPoint(-112F, -45F, 0F);

		defaultStockModel[10].addShapeBox(0F, 0F, 0F, 41, 9, 8, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 181
		defaultStockModel[10].setRotationPoint(-153F, -50F, 1F);

		defaultStockModel[11].addShapeBox(0F, 0F, 0F, 40, 9, 8, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 183
		defaultStockModel[11].setRotationPoint(-152F, -46F, 1F);

		defaultStockModel[12].addShapeBox(0F, 0F, 0F, 16, 13, 8, 0F,-1F, -5F, 0F, 1F, -5F, 0F, 1F, -5F, 0F, -1F, -5F, 0F, 2F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, 2F, 0F, 0F); // Box 185
		defaultStockModel[12].setRotationPoint(-129F, -42F, 1F);

		defaultStockModel[13].addShapeBox(0F, 0F, 0F, 5, 9, 8, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 188
		defaultStockModel[13].setRotationPoint(-151F, -42F, 1F);

		defaultStockModel[14].addShapeBox(0F, 0F, 0F, 23, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 190
		defaultStockModel[14].setRotationPoint(-145F, -9F, 0F);

		defaultStockModel[15].addShapeBox(0F, 0F, 0F, 5, 25, 8, 0F,-1F, -5F, 0F, 1F, -5F, 0F, 1F, -5F, 0F, -1F, -5F, 0F, 8F, 0F, 0F, -6.8F, 0F, 0F, -6.8F, 0F, 0F, 8F, 0F, 0F); // Box 200
		defaultStockModel[15].setRotationPoint(-132F, -34F, 1F);

		defaultStockModel[16].addShapeBox(0F, 0F, 0F, 14, 28, 6, 0F,2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -4F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -4F, 0F, 0F); // Box 203
		defaultStockModel[16].setRotationPoint(-144F, -37F, 2F);

		defaultStockModel[17].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		defaultStockModel[17].setRotationPoint(-124F, -29F, 4F);

		defaultStockModel[18].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		defaultStockModel[18].setRotationPoint(-124F, -29F, 5F);

		defaultStockModel[19].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 206
		defaultStockModel[19].setRotationPoint(-124F, -29F, 6F);

		defaultStockModel[20].addShapeBox(0F, 0F, 0F, 4, 10, 6, 0F,0F, -5F, 0F, 1F, -5F, 0F, 1F, -5F, 0F, 0F, -5F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 207
		defaultStockModel[20].setRotationPoint(-132F, -19F, 2F);

		defaultStockModel[21].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		defaultStockModel[21].setRotationPoint(-128F, -10F, 0F);

		defaultStockModel[22].addShapeBox(0F, 0F, 0F, 6, 4, 9, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 195
		defaultStockModel[22].setRotationPoint(-128F, -14F, 0F);

		defaultStockModel[23].addShapeBox(0F, 0F, 0F, 11, 2, 9, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 196
		defaultStockModel[23].setRotationPoint(-132F, -16F, 0F);

		defaultStockModel[24].addShapeBox(0F, 0F, 0F, 2, 14, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 1F, -4F, 0F, 1F, -4F, 0F, 1F, 4F, 0F, 1F); // Box 197
		defaultStockModel[24].setRotationPoint(-118.5F, -29F, 4F);
	}

	private void initdefaultGripModel_1()
	{
		defaultGripModel[0] = new ModelRendererTurbo(this, 621, 545, textureX, textureY); // Box 199
		defaultGripModel[1] = new ModelRendererTurbo(this, 701, 517, textureX, textureY); // Box 200
		defaultGripModel[2] = new ModelRendererTurbo(this, 701, 517, textureX, textureY); // Box 201
		defaultGripModel[3] = new ModelRendererTurbo(this, 701, 517, textureX, textureY); // Box 202
		defaultGripModel[4] = new ModelRendererTurbo(this, 701, 517, textureX, textureY); // Box 203
		defaultGripModel[5] = new ModelRendererTurbo(this, 701, 517, textureX, textureY); // Box 205
		defaultGripModel[6] = new ModelRendererTurbo(this, 701, 517, textureX, textureY); // Box 206
		defaultGripModel[7] = new ModelRendererTurbo(this, 701, 517, textureX, textureY); // Box 207
		defaultGripModel[8] = new ModelRendererTurbo(this, 701, 517, textureX, textureY); // Box 208
		defaultGripModel[9] = new ModelRendererTurbo(this, 701, 517, textureX, textureY); // Box 209
		defaultGripModel[10] = new ModelRendererTurbo(this, 701, 517, textureX, textureY); // Box 210
		defaultGripModel[11] = new ModelRendererTurbo(this, 701, 517, textureX, textureY); // Box 214
		defaultGripModel[12] = new ModelRendererTurbo(this, 701, 517, textureX, textureY); // Box 242
		defaultGripModel[13] = new ModelRendererTurbo(this, 701, 517, textureX, textureY); // Box 243
		defaultGripModel[14] = new ModelRendererTurbo(this, 701, 517, textureX, textureY); // Box 244
		defaultGripModel[15] = new ModelRendererTurbo(this, 701, 517, textureX, textureY); // Box 246
		defaultGripModel[16] = new ModelRendererTurbo(this, 701, 517, textureX, textureY); // Box 247

		defaultGripModel[0].addShapeBox(0F, 0F, 0F, 4, 12, 4, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, 1F, 0F, 3F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 3F, -1F, 0F); // Box 199
		defaultGripModel[0].setRotationPoint(-59F, -35F, 5.5F);

		defaultGripModel[1].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F,0F, 1F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 3F, -1F, 1F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -1F, 0F); // Box 200
		defaultGripModel[1].setRotationPoint(-59F, -35F, 3.5F);

		defaultGripModel[2].addShapeBox(0F, 0F, 0F, 8, 12, 7, 0F,0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 3F, -1F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 3F, -1F, 0F); // Box 201
		defaultGripModel[2].setRotationPoint(-67F, -35F, 2.5F);

		defaultGripModel[3].addShapeBox(0F, 0F, 0F, 2, 12, 2, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, -2F, 3F, -1F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 3F, -1F, -2F); // Box 202
		defaultGripModel[3].setRotationPoint(-69F, -35F, 7.5F);

		defaultGripModel[4].addShapeBox(0F, 0F, 0F, 2, 12, 5, 0F,0F, 2F, -2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 4F, -1F, -2F, -4F, -1F, 0F, -4F, -1F, 0F, 4F, -1F, 0F); // Box 203
		defaultGripModel[4].setRotationPoint(-72F, -22F, 2.5F);

		defaultGripModel[5].addShapeBox(0F, 0F, 0F, 7, 12, 7, 0F,0F, 2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 0F, 2F, 0F, 4F, -1F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 4F, -1F, 0F); // Box 205
		defaultGripModel[5].setRotationPoint(-70F, -22F, 2.5F);

		defaultGripModel[6].addShapeBox(0F, 0F, 0F, 2, 12, 2, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, -2F, 4F, -1F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 4F, -1F, -2F); // Box 206
		defaultGripModel[6].setRotationPoint(-72F, -22F, 7.5F);

		defaultGripModel[7].addShapeBox(0F, 0F, 0F, 7, 10, 7, 0F,0F, 2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 0F, 2F, 0F, 4F, -1F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 4F, -1F, 0F); // Box 207
		defaultGripModel[7].setRotationPoint(-74F, -9F, 2.5F);

		defaultGripModel[8].addShapeBox(0F, 0F, 0F, 2, 12, 5, 0F,0F, 2F, -2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 3F, -1F, -2F, -3F, -1F, 0F, -3F, -1F, 0F, 3F, -1F, 0F); // Box 208
		defaultGripModel[8].setRotationPoint(-69F, -35F, 2.5F);

		defaultGripModel[9].addShapeBox(0F, 0F, 0F, 2, 10, 2, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, -2F, 4F, -3F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 4F, -3F, -2F); // Box 209
		defaultGripModel[9].setRotationPoint(-76F, -9F, 7.5F);

		defaultGripModel[10].addShapeBox(0F, 0F, 0F, 2, 10, 5, 0F,0F, 2F, -2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 4F, -3F, -2F, -4F, -1F, 0F, -4F, -1F, 0F, 4F, -3F, 0F); // Box 210
		defaultGripModel[10].setRotationPoint(-76F, -9F, 2.5F);

		defaultGripModel[11].addShapeBox(0F, 0F, 0F, 4, 11, 2, 0F,0F, 1F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 4F, -1F, 1F, -4F, -1F, 0F, -4F, -1F, 0F, 4F, -1F, 0F); // Box 214
		defaultGripModel[11].setRotationPoint(-60F, -10F, 3.5F);

		defaultGripModel[12].addShapeBox(0F, 0F, 0F, 4, 13, 2, 0F,0F, 1F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 4F, -1F, 0.75F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, -1F, 0F); // Box 242
		defaultGripModel[12].setRotationPoint(-56F, -23F, 3.5F);

		defaultGripModel[13].addShapeBox(0F, 0F, 0F, 5, 12, 7, 0F,0F, 2F, 0F, 1F, 2F, -1.25F, 1F, 2F, -2.25F, 0F, 2F, 0F, 4F, -1F, 0F, -3F, -1F, -0.25F, -3F, -1F, -1.25F, 4F, -1F, 0F); // Box 243
		defaultGripModel[13].setRotationPoint(-62F, -22F, 2.5F);

		defaultGripModel[14].addShapeBox(0F, 0F, 0F, 4, 13, 2, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 4F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, -1F, 0.75F); // Box 244
		defaultGripModel[14].setRotationPoint(-56F, -23F, 5.5F);

		defaultGripModel[15].addShapeBox(0F, 0F, 0F, 4, 11, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 4F, -1F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 4F, -1F, 1F); // Box 246
		defaultGripModel[15].setRotationPoint(-60F, -10F, 5.5F);

		defaultGripModel[16].addShapeBox(0F, 0F, 0F, 5, 10, 7, 0F,0F, 2F, 0F, 1F, 2F, -0.25F, 1F, 2F, -1F, 0F, 2F, 0F, 4F, -1F, 0F, -3F, -1F, 0F, -3F, -1F, -1F, 4F, -1F, 0F); // Box 247
		defaultGripModel[16].setRotationPoint(-66F, -9F, 2.5F);
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 1069, 529, textureX, textureY); // Box 215
		ammoModel[1] = new ModelRendererTurbo(this, 1069, 529, textureX, textureY); // Box 216
		ammoModel[2] = new ModelRendererTurbo(this, 1037, 401, textureX, textureY); // Box 201
		ammoModel[3] = new ModelRendererTurbo(this, 1037, 401, textureX, textureY); // Box 203
		ammoModel[4] = new ModelRendererTurbo(this, 1037, 401, textureX, textureY); // Box 204
		ammoModel[5] = new ModelRendererTurbo(this, 1029, 405, textureX, textureY); // Box 205
		ammoModel[6] = new ModelRendererTurbo(this, 1037, 401, textureX, textureY); // Box 205
		ammoModel[7] = new ModelRendererTurbo(this, 1037, 401, textureX, textureY); // Box 207
		ammoModel[8] = new ModelRendererTurbo(this, 1029, 405, textureX, textureY); // Box 213
		ammoModel[9] = new ModelRendererTurbo(this, 1037, 401, textureX, textureY); // Box 214
		ammoModel[10] = new ModelRendererTurbo(this, 1037, 401, textureX, textureY); // Box 217
		ammoModel[11] = new ModelRendererTurbo(this, 1037, 401, textureX, textureY); // Box 218
		ammoModel[12] = new ModelRendererTurbo(this, 1069, 529, textureX, textureY); // Box 213
		ammoModel[13] = new ModelRendererTurbo(this, 1069, 529, textureX, textureY); // Box 214
		ammoModel[14] = new ModelRendererTurbo(this, 1069, 529, textureX, textureY); // Box 215
		ammoModel[15] = new ModelRendererTurbo(this, 1069, 529, textureX, textureY); // Box 216
		ammoModel[16] = new ModelRendererTurbo(this, 1069, 529, textureX, textureY); // Box 217
		ammoModel[17] = new ModelRendererTurbo(this, 1069, 529, textureX, textureY); // Box 218
		ammoModel[18] = new ModelRendererTurbo(this, 1069, 529, textureX, textureY); // Box 219
		ammoModel[19] = new ModelRendererTurbo(this, 1069, 529, textureX, textureY); // Box 223
		ammoModel[20] = new ModelRendererTurbo(this, 1069, 529, textureX, textureY); // Box 224
		ammoModel[21] = new ModelRendererTurbo(this, 1069, 529, textureX, textureY); // Box 225
		ammoModel[22] = new ModelRendererTurbo(this, 1069, 529, textureX, textureY); // Box 226
		ammoModel[23] = new ModelRendererTurbo(this, 1069, 529, textureX, textureY); // Box 227
		ammoModel[24] = new ModelRendererTurbo(this, 1069, 529, textureX, textureY); // Box 228
		ammoModel[25] = new ModelRendererTurbo(this, 1069, 529, textureX, textureY); // Box 229
		ammoModel[26] = new ModelRendererTurbo(this, 1069, 529, textureX, textureY); // Box 230
		ammoModel[27] = new ModelRendererTurbo(this, 1069, 529, textureX, textureY); // Box 231
		ammoModel[28] = new ModelRendererTurbo(this, 1069, 529, textureX, textureY); // Box 232
		ammoModel[29] = new ModelRendererTurbo(this, 1049, 325, textureX, textureY); // Box 233
		ammoModel[30] = new ModelRendererTurbo(this, 1049, 325, textureX, textureY); // Box 234
		ammoModel[31] = new ModelRendererTurbo(this, 1049, 325, textureX, textureY); // Box 235
		ammoModel[32] = new ModelRendererTurbo(this, 1069, 529, textureX, textureY); // Box 236
		ammoModel[33] = new ModelRendererTurbo(this, 1069, 529, textureX, textureY); // Box 237
		ammoModel[34] = new ModelRendererTurbo(this, 1069, 529, textureX, textureY); // Box 238
		ammoModel[35] = new ModelRendererTurbo(this, 1069, 529, textureX, textureY); // Box 217

		ammoModel[0].addShapeBox(0F, 0F, 0F, 3, 8, 4, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 1F, 1F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, -1F, 1F, 1F); // Box 215
		ammoModel[0].setRotationPoint(-1.5F, -29F, 3F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 3, 20, 4, 0F,0F, 0F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 1F, -4F, 1F, 1F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 1F, 1F); // Box 216
		ammoModel[1].setRotationPoint(-0.5F, -20F, 3F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 5, 11, 2, 0F,0F, 0F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 0F, 0F, 1F, -4F, 2F, 1F, 5F, 0F, 1F, 5F, 0F, 1F, -4F, 2F, 1F); // Box 201
		ammoModel[2].setRotationPoint(-2.5F, 2F, 4F);

		ammoModel[3].addShapeBox(0F, 0F, 0F, 5, 11, 2, 0F,0F, 0F, 1F, 1.5F, 1F, 1F, 1.5F, 1F, 1F, 0F, 0F, 1F, -3F, 2F, 1F, 4F, 1F, 1F, 4F, 1F, 1F, -3F, 2F, 1F); // Box 203
		ammoModel[3].setRotationPoint(-5.5F, -11F, 4F);

		ammoModel[4].addShapeBox(0F, 0F, 0F, 5, 11, 2, 0F,-1F, 0F, 1F, 2.5F, 1F, 1F, 2.5F, 1F, 1F, -1F, 0F, 1F, -3F, 2F, 1F, 4.5F, 1F, 1F, 4.5F, 1F, 1F, -3F, 2F, 1F); // Box 204
		ammoModel[4].setRotationPoint(-8.5F, -24F, 4F);

		ammoModel[5].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,-1F, 0.7F, 1F, 2.1F, 1.2F, 1F, 2.1F, 1.2F, 1F, -1F, 0.7F, 1F, -1F, 2F, 1F, 2.5F, 1F, 1F, 2.5F, 1F, 1F, -1F, 2F, 1F); // Box 205
		ammoModel[5].setRotationPoint(-8.5F, -27F, 4F);

		ammoModel[6].addShapeBox(0F, 0F, 0F, 5, 11, 2, 0F,0F, 0F, 1F, 1.3F, 1F, 1F, 1.3F, 1F, 1F, 0F, 0F, 1F, -4F, 2F, 1F, 5F, 0F, 1F, 5F, 0F, 1F, -4F, 2F, 1F); // Box 205
		ammoModel[6].setRotationPoint(-8.5F, 4F, 4F);

		ammoModel[7].addShapeBox(0F, 0F, 0F, 4, 11, 2, 0F,0F, 0F, 1F, 1.3F, 1F, 1F, 1.3F, 1F, 1F, 0F, 0F, 1F, -4F, 2F, 1F, 5F, 0F, 1F, 5F, 0F, 1F, -4F, 2F, 1F); // Box 207
		ammoModel[7].setRotationPoint(-13.5F, 6F, 4F);

		ammoModel[8].addShapeBox(0F, 0F, 0F, 4, 11, 2, 0F,0F, 0F, 1F, 1.3F, 1F, 1F, 1.3F, 1F, 1F, 0F, 0F, 1F, -4F, 3F, 1F, 5.4F, 2F, 1F, 5.4F, 2F, 1F, -4F, 3F, 1F); // Box 213
		ammoModel[8].setRotationPoint(-17.5F, -8F, 4F);

		ammoModel[9].addShapeBox(0F, 0F, 0F, 5, 11, 2, 0F,0F, 0F, 1F, 2F, 1F, 1F, 2F, 1F, 1F, 0F, 0F, 1F, -4F, 3F, 1F, 5.4F, 2F, 1F, 5.4F, 2F, 1F, -4F, 3F, 1F); // Box 214
		ammoModel[9].setRotationPoint(-12.5F, -10F, 4F);

		ammoModel[10].addShapeBox(0F, 0F, 0F, 4, 16, 2, 0F,-3F, 0F, 1F, 4F, 0.5F, 1F, 4F, 0.5F, 1F, -3F, 0F, 1F, -5F, 3F, 1F, 6.5F, 2F, 1F, 6.5F, 2F, 1F, -5F, 3F, 1F); // Box 217
		ammoModel[10].setRotationPoint(-22.5F, -26.6F, 4F);

		ammoModel[11].addShapeBox(0F, 0F, 0F, 5, 14, 2, 0F,-3F, 1F, 1F, 5F, 1F, 1F, 5F, 1F, 1F, -3F, 1F, 1F, -5F, 3F, 1F, 7F, 2F, 1F, 7F, 2F, 1F, -5F, 3F, 1F); // Box 218
		ammoModel[11].setRotationPoint(-17.5F, -26.6F, 4F);

		ammoModel[12].addShapeBox(0F, 0F, 0F, 3, 16, 1, 0F,-3F, 0F, 0F, 4F, 0.5F, 0F, 4F, 0.5F, 0F, -3F, 0F, 0F, -5F, 3F, 0F, 6.5F, 2F, 0F, 6.5F, 2F, 0F, -5F, 3F, 0F); // Box 213
		ammoModel[12].setRotationPoint(-23.5F, -26.6F, 2F);

		ammoModel[13].addShapeBox(0F, 0F, 0F, 3, 14, 1, 0F,-3F, 1F, 0F, 5F, 1F, 0F, 5F, 1F, 0F, -3F, 1F, 0F, -5F, 3F, 0F, 7F, 2F, 0F, 7F, 2F, 0F, -5F, 3F, 0F); // Box 214
		ammoModel[13].setRotationPoint(-17.5F, -26.6F, 2F);

		ammoModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0.7F, 0F, 2.1F, 1.2F, 0F, 2.1F, 1.2F, 0F, -1F, 0.7F, 0F, -1F, 2F, 0F, 2.5F, 1F, 0F, 2.5F, 1F, 0F, -1F, 2F, 0F); // Box 215
		ammoModel[14].setRotationPoint(-8.5F, -27F, 2F);

		ammoModel[15].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,-1F, 0F, 0F, 2.5F, 1F, 0F, 2.5F, 1F, 0F, -1F, 0F, 0F, -3F, 2F, 0F, 4.5F, 1F, 0F, 4.5F, 1F, 0F, -3F, 2F, 0F); // Box 216
		ammoModel[15].setRotationPoint(-8.5F, -24F, 2F);

		ammoModel[16].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 1.5F, 1F, 0F, 1.5F, 1F, 0F, 0F, 0F, 0F, -3F, 2F, 0F, 4F, 1F, 0F, 4F, 1F, 0F, -3F, 2F, 0F); // Box 217
		ammoModel[16].setRotationPoint(-5.5F, -11F, 2F);

		ammoModel[17].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, -4F, 3F, 0F, 5.4F, 2F, 0F, 5.4F, 2F, 0F, -4F, 3F, 0F); // Box 218
		ammoModel[17].setRotationPoint(-12.5F, -10F, 2F);

		ammoModel[18].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 1.3F, 1F, 0F, 1.3F, 1F, 0F, 0F, 0F, 0F, -4F, 3F, 0F, 5.4F, 2F, 0F, 5.4F, 2F, 0F, -4F, 3F, 0F); // Box 219
		ammoModel[18].setRotationPoint(-18.5F, -8F, 2F);

		ammoModel[19].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0.7F, 0F, 2.1F, 1.2F, 0F, 2.1F, 1.2F, 0F, -1F, 0.7F, 0F, -1F, 2F, 0F, 2.5F, 1F, 0F, 2.5F, 1F, 0F, -1F, 2F, 0F); // Box 223
		ammoModel[19].setRotationPoint(-8.5F, -27F, 7F);

		ammoModel[20].addShapeBox(0F, 0F, 0F, 3, 14, 1, 0F,-3F, 1F, 0F, 5F, 1F, 0F, 5F, 1F, 0F, -3F, 1F, 0F, -5F, 3F, 0F, 7F, 2F, 0F, 7F, 2F, 0F, -5F, 3F, 0F); // Box 224
		ammoModel[20].setRotationPoint(-17.5F, -26.6F, 7F);

		ammoModel[21].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,-1F, 0F, 0F, 2.5F, 1F, 0F, 2.5F, 1F, 0F, -1F, 0F, 0F, -3F, 2F, 0F, 4.5F, 1F, 0F, 4.5F, 1F, 0F, -3F, 2F, 0F); // Box 225
		ammoModel[21].setRotationPoint(-8.5F, -24F, 7F);

		ammoModel[22].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 1.5F, 1F, 0F, 1.5F, 1F, 0F, 0F, 0F, 0F, -3F, 2F, 0F, 4F, 1F, 0F, 4F, 1F, 0F, -3F, 2F, 0F); // Box 226
		ammoModel[22].setRotationPoint(-5.5F, -11F, 7F);

		ammoModel[23].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, -4F, 3F, 0F, 5.4F, 2F, 0F, 5.4F, 2F, 0F, -4F, 3F, 0F); // Box 227
		ammoModel[23].setRotationPoint(-12.5F, -10F, 7F);

		ammoModel[24].addShapeBox(0F, 0F, 0F, 3, 16, 1, 0F,-3F, 0F, 0F, 4F, 0.5F, 0F, 4F, 0.5F, 0F, -3F, 0F, 0F, -5F, 3F, 0F, 6.5F, 2F, 0F, 6.5F, 2F, 0F, -5F, 3F, 0F); // Box 228
		ammoModel[24].setRotationPoint(-23.5F, -26.6F, 7F);

		ammoModel[25].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 1.3F, 1F, 0F, 1.3F, 1F, 0F, 0F, 0F, 0F, -4F, 3F, 0F, 5.4F, 2F, 0F, 5.4F, 2F, 0F, -4F, 3F, 0F); // Box 229
		ammoModel[25].setRotationPoint(-18.5F, -8F, 7F);

		ammoModel[26].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 1.3F, 1F, 0F, 1.3F, 1F, 0F, 0F, 0F, 0F, -4F, 2.375F, 0F, 5F, 0.75F, 0F, 5F, 0.625F, 0F, -4F, 2.375F, 0F); // Box 230
		ammoModel[26].setRotationPoint(-14.5F, 6F, 7F);

		ammoModel[27].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 1.3F, 1F, 0F, 1.3F, 1F, 0F, 0F, 0F, 0F, -4F, 2F, 0F, 5F, 0.625F, 0F, 5F, 0.625F, 0F, -4F, 2F, 0F); // Box 231
		ammoModel[27].setRotationPoint(-8.5F, 4F, 7F);

		ammoModel[28].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -4F, 2F, 0F, 5F, 0.625F, 0F, 5F, 0.625F, 0F, -4F, 2F, 0F); // Box 232
		ammoModel[28].setRotationPoint(-2.5F, 2F, 7F);

		ammoModel[29].addShapeBox(0F, 0F, 0F, 0, 16, 4, 0F,-3F, 0F, 0F, 4F, 0.5F, 0F, 4F, 0.5F, 0F, -3F, 0F, 0F, -5F, 3F, 0F, 6.5F, 2F, 0F, 6.5F, 2F, 0F, -5F, 3F, 0F); // Box 233
		ammoModel[29].setRotationPoint(-23.5F, -26.6F, 3F);

		ammoModel[30].addShapeBox(0F, 0F, 0F, 1, 11, 4, 0F,0F, 0F, 0F, 1.3F, 1F, 0F, 1.3F, 1F, 0F, 0F, 0F, 0F, -4F, 3F, 0F, 5.4F, 2F, 0F, 5.4F, 2F, 0F, -4F, 3F, 0F); // Box 234
		ammoModel[30].setRotationPoint(-18.5F, -8F, 3F);

		ammoModel[31].addShapeBox(0F, 0F, 0F, 1, 11, 4, 0F,0F, 0F, 0F, 1.3F, 1F, 0F, 1.3F, 1F, 0F, 0F, 0F, 0F, -4F, 2.375F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -4F, 2.375F, 0F); // Box 235
		ammoModel[31].setRotationPoint(-14.5F, 6F, 3F);

		ammoModel[32].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -4F, 2F, 0F, 5F, 0.625F, 0F, 5F, 0.625F, 0F, -4F, 2F, 0F); // Box 236
		ammoModel[32].setRotationPoint(-2.5F, 2F, 2F);

		ammoModel[33].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 1.3F, 1F, 0F, 1.3F, 1F, 0F, 0F, 0F, 0F, -4F, 2F, 0F, 5F, 0.625F, 0F, 5F, 0.625F, 0F, -4F, 2F, 0F); // Box 237
		ammoModel[33].setRotationPoint(-8.5F, 4F, 2F);

		ammoModel[34].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 1.3F, 1F, 0F, 1.3F, 1F, 0F, 0F, 0F, 0F, -4F, 2.375F, 0F, 5F, 0.75F, 0F, 5F, 0.625F, 0F, -4F, 2.375F, 0F); // Box 238
		ammoModel[34].setRotationPoint(-14.5F, 6F, 2F);

		ammoModel[35].addShapeBox(0F, 0F, 0F, 3, 11, 4, 0F,0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, -4F, 1F, 1F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 1F, 1F); // Box 217
		ammoModel[35].setRotationPoint(3.5F, 1F, 3F);
		
		gunSlideDistance = 0.35F;
		animationType = EnumAnimationType.BULLPUP;
		translateAll(55F, -3F, -5F);

		
	}
}