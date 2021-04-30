//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 14.07.2016 - 17:08:49
// Last changed on: 14.07.2016 - 17:08:49

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelKarl extends ModelVehicle //Same as Filename
{
	int textureX = 2048;
	int textureY = 512;

	public ModelKarl() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[132];
		barrelModel = new ModelRendererTurbo[40];
		leftTrackWheelModels = new ModelRendererTurbo[274];
		rightTrackWheelModels = new ModelRendererTurbo[360];
		leftTrackModel = new ModelRendererTurbo[148];
		rightTrackModel = new ModelRendererTurbo[61];

		initbodyModel_1();
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
		bodyModel[1] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 625, 1, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Box 13
		bodyModel[8] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 14
		bodyModel[9] = new ModelRendererTurbo(this, 1049, 1, textureX, textureY); // Box 15
		bodyModel[10] = new ModelRendererTurbo(this, 1089, 1, textureX, textureY); // Box 16
		bodyModel[11] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 17
		bodyModel[12] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 18
		bodyModel[13] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 19
		bodyModel[14] = new ModelRendererTurbo(this, 1121, 1, textureX, textureY); // Box 20
		bodyModel[15] = new ModelRendererTurbo(this, 1129, 1, textureX, textureY); // Box 21
		bodyModel[16] = new ModelRendererTurbo(this, 1137, 1, textureX, textureY); // Box 22
		bodyModel[17] = new ModelRendererTurbo(this, 1145, 1, textureX, textureY); // Box 23
		bodyModel[18] = new ModelRendererTurbo(this, 1153, 1, textureX, textureY); // Box 24
		bodyModel[19] = new ModelRendererTurbo(this, 1337, 1, textureX, textureY); // Box 25
		bodyModel[20] = new ModelRendererTurbo(this, 1345, 1, textureX, textureY); // Box 26
		bodyModel[21] = new ModelRendererTurbo(this, 1353, 1, textureX, textureY); // Box 27
		bodyModel[22] = new ModelRendererTurbo(this, 1361, 1, textureX, textureY); // Box 28
		bodyModel[23] = new ModelRendererTurbo(this, 1441, 1, textureX, textureY); // Box 29
		bodyModel[24] = new ModelRendererTurbo(this, 1521, 1, textureX, textureY); // Box 31
		bodyModel[25] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 32
		bodyModel[26] = new ModelRendererTurbo(this, 1505, 1, textureX, textureY); // Box 33
		bodyModel[27] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 34
		bodyModel[28] = new ModelRendererTurbo(this, 1585, 1, textureX, textureY); // Box 35
		bodyModel[29] = new ModelRendererTurbo(this, 1601, 1, textureX, textureY); // Box 36
		bodyModel[30] = new ModelRendererTurbo(this, 1617, 1, textureX, textureY); // Box 37
		bodyModel[31] = new ModelRendererTurbo(this, 2033, 1, textureX, textureY); // Box 38
		bodyModel[32] = new ModelRendererTurbo(this, 2041, 1, textureX, textureY); // Box 39
		bodyModel[33] = new ModelRendererTurbo(this, 569, 9, textureX, textureY); // Box 40
		bodyModel[34] = new ModelRendererTurbo(this, 1153, 9, textureX, textureY); // Box 41
		bodyModel[35] = new ModelRendererTurbo(this, 561, 17, textureX, textureY); // Box 42
		bodyModel[36] = new ModelRendererTurbo(this, 841, 17, textureX, textureY); // Box 43
		bodyModel[37] = new ModelRendererTurbo(this, 1033, 9, textureX, textureY); // Box 44
		bodyModel[38] = new ModelRendererTurbo(this, 1233, 9, textureX, textureY); // Box 45
		bodyModel[39] = new ModelRendererTurbo(this, 1073, 9, textureX, textureY); // Box 46
		bodyModel[40] = new ModelRendererTurbo(this, 1273, 9, textureX, textureY); // Box 47
		bodyModel[41] = new ModelRendererTurbo(this, 1281, 9, textureX, textureY); // Box 48
		bodyModel[42] = new ModelRendererTurbo(this, 1289, 9, textureX, textureY); // Box 49
		bodyModel[43] = new ModelRendererTurbo(this, 1297, 9, textureX, textureY); // Box 50
		bodyModel[44] = new ModelRendererTurbo(this, 1305, 9, textureX, textureY); // Box 51
		bodyModel[45] = new ModelRendererTurbo(this, 1313, 9, textureX, textureY); // Box 52
		bodyModel[46] = new ModelRendererTurbo(this, 1321, 9, textureX, textureY); // Box 53
		bodyModel[47] = new ModelRendererTurbo(this, 1361, 17, textureX, textureY); // Box 54
		bodyModel[48] = new ModelRendererTurbo(this, 1329, 9, textureX, textureY); // Box 55
		bodyModel[49] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 56
		bodyModel[50] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 57
		bodyModel[51] = new ModelRendererTurbo(this, 1113, 17, textureX, textureY); // Box 58
		bodyModel[52] = new ModelRendererTurbo(this, 1537, 17, textureX, textureY); // Box 59
		bodyModel[53] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 60
		bodyModel[54] = new ModelRendererTurbo(this, 1033, 1, textureX, textureY); // Box 61
		bodyModel[55] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 62
		bodyModel[56] = new ModelRendererTurbo(this, 1041, 1, textureX, textureY); // Box 63
		bodyModel[57] = new ModelRendererTurbo(this, 2017, 9, textureX, textureY); // Box 64
		bodyModel[58] = new ModelRendererTurbo(this, 1617, 1, textureX, textureY); // Box 65
		bodyModel[59] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 418
		bodyModel[60] = new ModelRendererTurbo(this, 1049, 1, textureX, textureY); // Box 463
		bodyModel[61] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 464
		bodyModel[62] = new ModelRendererTurbo(this, 1073, 1, textureX, textureY); // Box 465
		bodyModel[63] = new ModelRendererTurbo(this, 1225, 105, textureX, textureY); // Box 573
		bodyModel[64] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 574
		bodyModel[65] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Box 575
		bodyModel[66] = new ModelRendererTurbo(this, 729, 209, textureX, textureY); // Box 1119
		bodyModel[67] = new ModelRendererTurbo(this, 177, 209, textureX, textureY); // Box 1123
		bodyModel[68] = new ModelRendererTurbo(this, 937, 209, textureX, textureY); // Box 1124
		bodyModel[69] = new ModelRendererTurbo(this, 1137, 209, textureX, textureY); // Box 1125
		bodyModel[70] = new ModelRendererTurbo(this, 1337, 209, textureX, textureY); // Box 1126
		bodyModel[71] = new ModelRendererTurbo(this, 1945, 201, textureX, textureY); // Box 1127
		bodyModel[72] = new ModelRendererTurbo(this, 329, 209, textureX, textureY); // Box 1129
		bodyModel[73] = new ModelRendererTurbo(this, 449, 201, textureX, textureY); // Box 1132
		bodyModel[74] = new ModelRendererTurbo(this, 1569, 201, textureX, textureY); // Box 1133
		bodyModel[75] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 1134
		bodyModel[76] = new ModelRendererTurbo(this, 825, 249, textureX, textureY); // Box 969
		bodyModel[77] = new ModelRendererTurbo(this, 1033, 249, textureX, textureY); // Box 970
		bodyModel[78] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 971
		bodyModel[79] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 972
		bodyModel[80] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 973
		bodyModel[81] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 974
		bodyModel[82] = new ModelRendererTurbo(this, 1601, 1, textureX, textureY); // Box 975
		bodyModel[83] = new ModelRendererTurbo(this, 2009, 65, textureX, textureY); // Box 976
		bodyModel[84] = new ModelRendererTurbo(this, 553, 25, textureX, textureY); // Box 977
		bodyModel[85] = new ModelRendererTurbo(this, 1409, 97, textureX, textureY); // Box 978
		bodyModel[86] = new ModelRendererTurbo(this, 1609, 1, textureX, textureY); // Box 979
		bodyModel[87] = new ModelRendererTurbo(this, 929, 201, textureX, textureY); // Box 980
		bodyModel[88] = new ModelRendererTurbo(this, 1257, 9, textureX, textureY); // Box 981
		bodyModel[89] = new ModelRendererTurbo(this, 1929, 241, textureX, textureY); // Box 982
		bodyModel[90] = new ModelRendererTurbo(this, 1297, 97, textureX, textureY); // Box 983
		bodyModel[91] = new ModelRendererTurbo(this, 1337, 209, textureX, textureY); // Box 984
		bodyModel[92] = new ModelRendererTurbo(this, 1913, 209, textureX, textureY); // Box 985
		bodyModel[93] = new ModelRendererTurbo(this, 1465, 97, textureX, textureY); // Box 986
		bodyModel[94] = new ModelRendererTurbo(this, 993, 17, textureX, textureY); // Box 987
		bodyModel[95] = new ModelRendererTurbo(this, 561, 153, textureX, textureY); // Box 988
		bodyModel[96] = new ModelRendererTurbo(this, 1385, 25, textureX, textureY); // Box 990
		bodyModel[97] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 991
		bodyModel[98] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 992
		bodyModel[99] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 993
		bodyModel[100] = new ModelRendererTurbo(this, 713, 153, textureX, textureY); // Box 994
		bodyModel[101] = new ModelRendererTurbo(this, 1481, 25, textureX, textureY); // Box 995
		bodyModel[102] = new ModelRendererTurbo(this, 1497, 97, textureX, textureY); // Box 996
		bodyModel[103] = new ModelRendererTurbo(this, 825, 241, textureX, textureY); // Box 997
		bodyModel[104] = new ModelRendererTurbo(this, 81, 249, textureX, textureY); // Box 998
		bodyModel[105] = new ModelRendererTurbo(this, 441, 249, textureX, textureY); // Box 999
		bodyModel[106] = new ModelRendererTurbo(this, 217, 209, textureX, textureY); // Box 1000
		bodyModel[107] = new ModelRendererTurbo(this, 209, 217, textureX, textureY); // Box 1001
		bodyModel[108] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 1002
		bodyModel[109] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 1003
		bodyModel[110] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 1004
		bodyModel[111] = new ModelRendererTurbo(this, 1425, 25, textureX, textureY); // Box 1005
		bodyModel[112] = new ModelRendererTurbo(this, 2033, 233, textureX, textureY); // Box 1006
		bodyModel[113] = new ModelRendererTurbo(this, 2041, 233, textureX, textureY); // Box 1007
		bodyModel[114] = new ModelRendererTurbo(this, 1457, 25, textureX, textureY); // Box 1008
		bodyModel[115] = new ModelRendererTurbo(this, 1065, 65, textureX, textureY); // Box 1009
		bodyModel[116] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 1010
		bodyModel[117] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 1011
		bodyModel[118] = new ModelRendererTurbo(this, 2041, 73, textureX, textureY); // Box 1012
		bodyModel[119] = new ModelRendererTurbo(this, 1241, 25, textureX, textureY); // Box 1013
		bodyModel[120] = new ModelRendererTurbo(this, 1617, 209, textureX, textureY); // Box 1014
		bodyModel[121] = new ModelRendererTurbo(this, 137, 249, textureX, textureY); // Box 1015
		bodyModel[122] = new ModelRendererTurbo(this, 793, 89, textureX, textureY); // Box 1016
		bodyModel[123] = new ModelRendererTurbo(this, 1361, 89, textureX, textureY); // Box 1017
		bodyModel[124] = new ModelRendererTurbo(this, 1817, 89, textureX, textureY); // Box 1018
		bodyModel[125] = new ModelRendererTurbo(this, 1849, 89, textureX, textureY); // Box 1019
		bodyModel[126] = new ModelRendererTurbo(this, 1881, 89, textureX, textureY); // Box 1020
		bodyModel[127] = new ModelRendererTurbo(this, 145, 249, textureX, textureY); // Box 1021
		bodyModel[128] = new ModelRendererTurbo(this, 153, 249, textureX, textureY); // Box 1022
		bodyModel[129] = new ModelRendererTurbo(this, 1913, 89, textureX, textureY); // Box 1023
		bodyModel[130] = new ModelRendererTurbo(this, 1953, 89, textureX, textureY); // Box 1024
		bodyModel[131] = new ModelRendererTurbo(this, 1985, 89, textureX, textureY); // Box 1025

		bodyModel[0].addShapeBox(0F, 0F, 0F, 51, 28, 46, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-99F, -25F, -23F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 190, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(-99F, -14F, 23F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[2].setRotationPoint(68F, -27F, 36F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[3].setRotationPoint(53F, -27F, 36F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[4].setRotationPoint(38F, -27F, 36F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[5].setRotationPoint(29F, -28F, 36F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 130, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[6].setRotationPoint(-99F, -25F, 23F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 56, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[7].setRotationPoint(-28F, -22F, 35F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[8].setRotationPoint(30F, -24F, 23F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 5, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[9].setRotationPoint(30F, -20F, 23F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 6, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[10].setRotationPoint(35F, -20F, 23F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[11].setRotationPoint(28F, -38F, 36F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[12].setRotationPoint(15F, -38F, 36F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[13].setRotationPoint(3F, -38F, 36F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[14].setRotationPoint(-10F, -38F, 36F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[15].setRotationPoint(-26F, -38F, 36F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[16].setRotationPoint(-41F, -38F, 36F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[17].setRotationPoint(-57F, -38F, 36F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 88, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[18].setRotationPoint(-58F, -39F, 36F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[19].setRotationPoint(-50F, -25F, 37F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[20].setRotationPoint(-72F, -25F, 37F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[21].setRotationPoint(-94F, -25F, 37F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 35, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[22].setRotationPoint(-95F, -22F, 26F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 35, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F); // Box 29
		bodyModel[23].setRotationPoint(-95F, -22F, 30F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 35, 8, 3, 0F,0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[24].setRotationPoint(-95F, -22F, 23F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[25].setRotationPoint(78F, -20F, 36F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[26].setRotationPoint(78F, -20F, 23F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[27].setRotationPoint(78F, -19F, 23F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[28].setRotationPoint(78F, -15F, 23F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 36
		bodyModel[29].setRotationPoint(-99F, -24F, 23F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 190, 3, 14, 0F,0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[30].setRotationPoint(-99F, -14F, -37F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[31].setRotationPoint(68F, -27F, -37F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[32].setRotationPoint(53F, -27F, -37F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[33].setRotationPoint(38F, -27F, -37F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[34].setRotationPoint(29F, -28F, -37F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 130, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[35].setRotationPoint(-99F, -25F, -37F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 56, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[36].setRotationPoint(-28F, -22F, -37F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[37].setRotationPoint(30F, -24F, -34F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 5, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[38].setRotationPoint(30F, -20F, -34F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 6, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[39].setRotationPoint(35F, -20F, -34F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[40].setRotationPoint(28F, -38F, -37F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[41].setRotationPoint(15F, -38F, -37F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[42].setRotationPoint(3F, -38F, -37F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[43].setRotationPoint(-10F, -38F, -37F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[44].setRotationPoint(-26F, -38F, -37F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[45].setRotationPoint(-41F, -38F, -37F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[46].setRotationPoint(-57F, -38F, -37F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 88, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[47].setRotationPoint(-58F, -39F, -37F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[48].setRotationPoint(-50F, -25F, -39F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[49].setRotationPoint(-72F, -25F, -39F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[50].setRotationPoint(-94F, -25F, -39F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 35, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[51].setRotationPoint(-95F, -22F, -30F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 35, 8, 3, 0F,0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[52].setRotationPoint(-95F, -22F, -33F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 35, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F); // Box 60
		bodyModel[53].setRotationPoint(-95F, -22F, -26F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[54].setRotationPoint(78F, -20F, -37F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[55].setRotationPoint(78F, -20F, -36F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[56].setRotationPoint(78F, -19F, -24F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[57].setRotationPoint(78F, -15F, -36F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[58].setRotationPoint(-99F, -24F, -28F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
		bodyModel[59].setRotationPoint(-103.5F, 6F, -35F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 463
		bodyModel[60].setRotationPoint(79F, -2F, 23F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 188, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 464
		bodyModel[61].setRotationPoint(-98F, -11F, 23F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 465
		bodyModel[62].setRotationPoint(79F, -2F, -24F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 188, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -29F, 0F, 0F, -29F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, 0F); // Box 573
		bodyModel[63].setRotationPoint(-98F, 0F, 23F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 188, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 574
		bodyModel[64].setRotationPoint(-98F, -11F, -24F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 188, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, 0F, -29F, 0F, 0F, -29F, 0F, 0F); // Box 575
		bodyModel[65].setRotationPoint(-98F, 0F, -24F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 96, 8, 6, 0F,-36F, 0F, 0F, -35F, 0F, 0F, -35F, 0F, 0F, -36F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1119
		bodyModel[66].setRotationPoint(-45F, -36F, -23F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 49, 28, 46, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1123
		bodyModel[67].setRotationPoint(42F, -25F, -23F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 90, 28, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1124
		bodyModel[68].setRotationPoint(-48F, -25F, -23F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 90, 28, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1125
		bodyModel[69].setRotationPoint(-48F, -25F, 17F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 90, 14, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1126
		bodyModel[70].setRotationPoint(-48F, -11F, -17F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 25, 13, 3, 0F,-8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1127
		bodyModel[71].setRotationPoint(-9F, -49F, -20F);

		bodyModel[72].addShapeBox(-13F, -7F, 17F, 25, 13, 3, 0F,-8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1129
		bodyModel[72].setRotationPoint(4F, -42F, 0F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 10, 19, 0F,9F, -7F, 0F, -11F, -5F, 0F, -6F, -6F, 0F, 4F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1132
		bodyModel[73].setRotationPoint(49F, -35F, -19F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 10, 19, 0F,4F, -8F, 0F, -6F, -6F, 0F, -11F, -5F, 0F, 9F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1133
		bodyModel[74].setRotationPoint(49F, -35F, 0F);

		bodyModel[75].addShapeBox(-49F, 6F, 17F, 96, 8, 6, 0F,-36F, 0F, 0F, -35F, 0F, 0F, -35F, 0F, 0F, -36F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1134
		bodyModel[75].setRotationPoint(4F, -42F, 0F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 96, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 969
		bodyModel[76].setRotationPoint(-45F, -28F, -23F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 96, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 970
		bodyModel[77].setRotationPoint(-45F, -28F, 17F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 34, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 971
		bodyModel[78].setRotationPoint(-88F, -35F, -4F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 17, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 972
		bodyModel[79].setRotationPoint(-88F, -33F, -4F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 973
		bodyModel[80].setRotationPoint(-62F, -33F, -4F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 26, 2, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 974
		bodyModel[81].setRotationPoint(-88F, -33F, -4F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 975
		bodyModel[82].setRotationPoint(-65F, -33F, -4F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 17, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 976
		bodyModel[83].setRotationPoint(-88F, -33F, 4F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 977
		bodyModel[84].setRotationPoint(-62F, -33F, 4F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 26, 2, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 978
		bodyModel[85].setRotationPoint(-88F, -33F, 4F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 979
		bodyModel[86].setRotationPoint(-65F, -33F, 4F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 3, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 980
		bodyModel[87].setRotationPoint(-65F, -33F, -1F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 981
		bodyModel[88].setRotationPoint(-81F, -33F, 0F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 11, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 982
		bodyModel[89].setRotationPoint(-89F, -27F, 17F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 11, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 983
		bodyModel[90].setRotationPoint(-89F, -27F, 13F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 4, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 984
		bodyModel[91].setRotationPoint(-93F, -27F, 17F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 4, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 985
		bodyModel[92].setRotationPoint(-78F, -27F, 17F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 11, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 986
		bodyModel[93].setRotationPoint(-89F, -27F, 28F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, -1.75F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 987
		bodyModel[94].setRotationPoint(-78F, -27F, 13F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 988
		bodyModel[95].setRotationPoint(-74F, -27F, 17F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,-4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 990
		bodyModel[96].setRotationPoint(-89F, -27F, 12F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -1.75F, 0F, 0F, 0F); // Box 991
		bodyModel[97].setRotationPoint(-78F, -27F, 28F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -1.75F); // Box 992
		bodyModel[98].setRotationPoint(-93F, -27F, 28F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,-1.75F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 993
		bodyModel[99].setRotationPoint(-93F, -27F, 13F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 994
		bodyModel[100].setRotationPoint(-94F, -27F, 17F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 995
		bodyModel[101].setRotationPoint(-89F, -27F, 32F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 40, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 996
		bodyModel[102].setRotationPoint(-89F, -27F, 6F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 40, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 997
		bodyModel[103].setRotationPoint(-89F, -27F, -6F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 12, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 998
		bodyModel[104].setRotationPoint(-82F, -27F, -24F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 14, 2, 14, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 999
		bodyModel[105].setRotationPoint(-83F, -29F, -25F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 36, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1000
		bodyModel[106].setRotationPoint(91F, -31F, -16F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 36, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1001
		bodyModel[107].setRotationPoint(91F, -31F, -8F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1002
		bodyModel[108].setRotationPoint(91F, -21F, -15F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1003
		bodyModel[109].setRotationPoint(91F, -14F, -15F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1004
		bodyModel[110].setRotationPoint(91F, -7F, -15F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1005
		bodyModel[111].setRotationPoint(91F, 1F, -15F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 36, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1006
		bodyModel[112].setRotationPoint(91F, -31F, 18F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 36, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1007
		bodyModel[113].setRotationPoint(91F, -31F, 10F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1008
		bodyModel[114].setRotationPoint(91F, -21F, 11F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1009
		bodyModel[115].setRotationPoint(91F, -14F, 11F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1010
		bodyModel[116].setRotationPoint(91F, -7F, 11F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1011
		bodyModel[117].setRotationPoint(91F, 1F, 11F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1012
		bodyModel[118].setRotationPoint(91F, -18F, 5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1013
		bodyModel[119].setRotationPoint(91F, -22F, 3.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 31, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1014
		bodyModel[120].setRotationPoint(-100F, -27F, 10F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 31, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1015
		bodyModel[121].setRotationPoint(-100F, -27F, 18F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1016
		bodyModel[122].setRotationPoint(-100F, -21F, 11F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1017
		bodyModel[123].setRotationPoint(-100F, -14F, 11F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1018
		bodyModel[124].setRotationPoint(-100F, -7F, 11F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1019
		bodyModel[125].setRotationPoint(-100F, 1F, 11F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1020
		bodyModel[126].setRotationPoint(-100F, 1F, -15F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 31, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1021
		bodyModel[127].setRotationPoint(-100F, -27F, -8F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 31, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1022
		bodyModel[128].setRotationPoint(-100F, -27F, -16F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1023
		bodyModel[129].setRotationPoint(-100F, -7F, -15F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1024
		bodyModel[130].setRotationPoint(-100F, -14F, -15F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1025
		bodyModel[131].setRotationPoint(-100F, -21F, -15F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 1593, 209, textureX, textureY); // Box 1130
		barrelModel[1] = new ModelRendererTurbo(this, 1769, 209, textureX, textureY); // Box 1131
		barrelModel[2] = new ModelRendererTurbo(this, 2009, 201, textureX, textureY); // Box 1135
		barrelModel[3] = new ModelRendererTurbo(this, 577, 9, textureX, textureY); // Box 1137
		barrelModel[4] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 1139
		barrelModel[5] = new ModelRendererTurbo(this, 601, 9, textureX, textureY); // Box 1140
		barrelModel[6] = new ModelRendererTurbo(this, 529, 25, textureX, textureY); // Box 1141
		barrelModel[7] = new ModelRendererTurbo(this, 1105, 1, textureX, textureY); // Box 1142
		barrelModel[8] = new ModelRendererTurbo(this, 2017, 1, textureX, textureY); // Box 1143
		barrelModel[9] = new ModelRendererTurbo(this, 1289, 25, textureX, textureY); // Box 1144
		barrelModel[10] = new ModelRendererTurbo(this, 1513, 25, textureX, textureY); // Box 1145
		barrelModel[11] = new ModelRendererTurbo(this, 473, 209, textureX, textureY); // Box 1146
		barrelModel[12] = new ModelRendererTurbo(this, 1353, 25, textureX, textureY); // Box 1147
		barrelModel[13] = new ModelRendererTurbo(this, 2017, 25, textureX, textureY); // Box 1148
		barrelModel[14] = new ModelRendererTurbo(this, 1737, 209, textureX, textureY); // Box 1149
		barrelModel[15] = new ModelRendererTurbo(this, 377, 217, textureX, textureY); // Box 1150
		barrelModel[16] = new ModelRendererTurbo(this, 609, 217, textureX, textureY); // Box 939
		barrelModel[17] = new ModelRendererTurbo(this, 657, 217, textureX, textureY); // Box 940
		barrelModel[18] = new ModelRendererTurbo(this, 713, 225, textureX, textureY); // Box 941
		barrelModel[19] = new ModelRendererTurbo(this, 2001, 217, textureX, textureY); // Box 942
		barrelModel[20] = new ModelRendererTurbo(this, 777, 225, textureX, textureY); // Box 943
		barrelModel[21] = new ModelRendererTurbo(this, 841, 225, textureX, textureY); // Box 944
		barrelModel[22] = new ModelRendererTurbo(this, 1913, 225, textureX, textureY); // Box 949
		barrelModel[23] = new ModelRendererTurbo(this, 889, 225, textureX, textureY); // Box 950
		barrelModel[24] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 951
		barrelModel[25] = new ModelRendererTurbo(this, 65, 233, textureX, textureY); // Box 952
		barrelModel[26] = new ModelRendererTurbo(this, 105, 233, textureX, textureY); // Box 953
		barrelModel[27] = new ModelRendererTurbo(this, 329, 233, textureX, textureY); // Box 955
		barrelModel[28] = new ModelRendererTurbo(this, 441, 233, textureX, textureY); // Box 956
		barrelModel[29] = new ModelRendererTurbo(this, 1553, 233, textureX, textureY); // Box 957
		barrelModel[30] = new ModelRendererTurbo(this, 1969, 233, textureX, textureY); // Box 958
		barrelModel[31] = new ModelRendererTurbo(this, 377, 241, textureX, textureY); // Box 959
		barrelModel[32] = new ModelRendererTurbo(this, 489, 241, textureX, textureY); // Box 960
		barrelModel[33] = new ModelRendererTurbo(this, 537, 241, textureX, textureY); // Box 962
		barrelModel[34] = new ModelRendererTurbo(this, 601, 241, textureX, textureY); // Box 963
		barrelModel[35] = new ModelRendererTurbo(this, 649, 241, textureX, textureY); // Box 964
		barrelModel[36] = new ModelRendererTurbo(this, 697, 241, textureX, textureY); // Box 965
		barrelModel[37] = new ModelRendererTurbo(this, 745, 241, textureX, textureY); // Box 966
		barrelModel[38] = new ModelRendererTurbo(this, 769, 241, textureX, textureY); // Box 967
		barrelModel[39] = new ModelRendererTurbo(this, 401, 241, textureX, textureY); // Box 968

		barrelModel[0].addShapeBox(-28F, -17F, -17F, 51, 42, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1130
		barrelModel[0].setRotationPoint(4F, -42F, 0F);

		barrelModel[1].addShapeBox(-28F, -23F, -17F, 51, 6, 34, 0F,0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1131
		barrelModel[1].setRotationPoint(4F, -42F, 0F);

		barrelModel[2].addShapeBox(23F, 16F, -2F, 9, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1135
		barrelModel[2].setRotationPoint(4F, -42F, 0F);

		barrelModel[3].addShapeBox(23F, 16F, 3F, 9, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F); // Box 1137
		barrelModel[3].setRotationPoint(4F, -42F, 0F);

		barrelModel[4].addShapeBox(23F, 21F, -2F, 9, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 1139
		barrelModel[4].setRotationPoint(4F, -42F, 0F);

		barrelModel[5].addShapeBox(23F, 16F, -3F, 9, 5, 1, 0F,0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1140
		barrelModel[5].setRotationPoint(4F, -42F, 0F);

		barrelModel[6].addShapeBox(23F, 15F, -2F, 9, 1, 5, 0F,0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1141
		barrelModel[6].setRotationPoint(4F, -42F, 0F);

		barrelModel[7].addShapeBox(32F, 17F, -1F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1142
		barrelModel[7].setRotationPoint(4F, -42F, 0F);

		barrelModel[8].addShapeBox(32F, -19F, -2F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1143
		barrelModel[8].setRotationPoint(4F, -42F, 0F);

		barrelModel[9].addShapeBox(23F, -20F, 2F, 9, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F); // Box 1144
		barrelModel[9].setRotationPoint(4F, -42F, 0F);

		barrelModel[10].addShapeBox(23F, -21F, -3F, 9, 1, 5, 0F,0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1145
		barrelModel[10].setRotationPoint(4F, -42F, 0F);

		barrelModel[11].addShapeBox(23F, -20F, -3F, 9, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1146
		barrelModel[11].setRotationPoint(4F, -42F, 0F);

		barrelModel[12].addShapeBox(23F, -20F, -4F, 9, 5, 1, 0F,0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1147
		barrelModel[12].setRotationPoint(4F, -42F, 0F);

		barrelModel[13].addShapeBox(23F, -15F, -3F, 9, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 1148
		barrelModel[13].setRotationPoint(4F, -42F, 0F);

		barrelModel[14].addShapeBox(23F, -6F, -6F, 18, 12, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1149
		barrelModel[14].setRotationPoint(4F, -42F, 0F);

		barrelModel[15].addShapeBox(41F, -5F, -5F, 19, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1150
		barrelModel[15].setRotationPoint(4F, -42F, 0F);

		barrelModel[16].addShapeBox(23F, -6F, 6F, 18, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 939
		barrelModel[16].setRotationPoint(4F, -42F, 0F);

		barrelModel[17].addShapeBox(23F, 6F, -6F, 18, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 940
		barrelModel[17].setRotationPoint(4F, -42F, 0F);

		barrelModel[18].addShapeBox(41F, -9F, -5F, 19, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 941
		barrelModel[18].setRotationPoint(4F, -42F, 0F);

		barrelModel[19].addShapeBox(41F, -5F, -9F, 19, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 942
		barrelModel[19].setRotationPoint(4F, -42F, 0F);

		barrelModel[20].addShapeBox(41F, 5F, -5F, 19, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 943
		barrelModel[20].setRotationPoint(4F, -42F, 0F);

		barrelModel[21].addShapeBox(41F, -5F, 5F, 19, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 944
		barrelModel[21].setRotationPoint(4F, -42F, 0F);

		barrelModel[22].addShapeBox(23F, -11F, -6F, 18, 1, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 949
		barrelModel[22].setRotationPoint(4F, -42F, 0F);

		barrelModel[23].addShapeBox(23F, -10F, -10F, 18, 4, 4, 0F,0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 950
		barrelModel[23].setRotationPoint(4F, -42F, 0F);

		barrelModel[24].addShapeBox(23F, 10F, -6F, 18, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 951
		barrelModel[24].setRotationPoint(4F, -42F, 0F);

		barrelModel[25].addShapeBox(23F, -6F, -11F, 18, 12, 1, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 952
		barrelModel[25].setRotationPoint(4F, -42F, 0F);

		barrelModel[26].addShapeBox(23F, -6F, 10F, 18, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 953
		barrelModel[26].setRotationPoint(4F, -42F, 0F);

		barrelModel[27].addShapeBox(23F, -10F, 6F, 18, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 955
		barrelModel[27].setRotationPoint(4F, -42F, 0F);

		barrelModel[28].addShapeBox(23F, 6F, 6F, 18, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F); // Box 956
		barrelModel[28].setRotationPoint(4F, -42F, 0F);

		barrelModel[29].addShapeBox(23F, 6F, -10F, 18, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 957
		barrelModel[29].setRotationPoint(4F, -42F, 0F);

		barrelModel[30].addShapeBox(41F, -10F, -5F, 19, 1, 10, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 958
		barrelModel[30].setRotationPoint(4F, -42F, 0F);

		barrelModel[31].addShapeBox(41F, -9F, -9F, 19, 4, 4, 0F,0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 959
		barrelModel[31].setRotationPoint(4F, -42F, 0F);

		barrelModel[32].addShapeBox(41F, -5F, -10F, 19, 10, 1, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 960
		barrelModel[32].setRotationPoint(4F, -42F, 0F);

		barrelModel[33].addShapeBox(41F, 9F, -5F, 19, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 962
		barrelModel[33].setRotationPoint(4F, -42F, 0F);

		barrelModel[34].addShapeBox(41F, -5F, 9F, 19, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 963
		barrelModel[34].setRotationPoint(4F, -42F, 0F);

		barrelModel[35].addShapeBox(41F, -9F, 5F, 19, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 964
		barrelModel[35].setRotationPoint(4F, -42F, 0F);

		barrelModel[36].addShapeBox(41F, 5F, 5F, 19, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F); // Box 965
		barrelModel[36].setRotationPoint(4F, -42F, 0F);

		barrelModel[37].addShapeBox(41F, 5F, -9F, 19, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 966
		barrelModel[37].setRotationPoint(4F, -42F, 0F);

		barrelModel[38].addShapeBox(-42F, -13F, -13F, 14, 26, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 967
		barrelModel[38].setRotationPoint(4F, -42F, 0F);

		barrelModel[39].addShapeBox(-48F, -13F, -13F, 6, 26, 26, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -17F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -17F, -1F); // Box 968
		barrelModel[39].setRotationPoint(4F, -42F, 0F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 961, 17, textureX, textureY); // Box 66
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 1193, 17, textureX, textureY); // Box 68
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 69
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 1049, 17, textureX, textureY); // Box 70
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 71
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 72
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 73
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 74
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 75
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 1001, 17, textureX, textureY); // Box 76
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 1257, 17, textureX, textureY); // Box 79
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 80
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 81
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 435
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 297, 89, textureX, textureY); // Box 436
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 769, 89, textureX, textureY); // Box 437
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 1193, 89, textureX, textureY); // Box 438
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 1241, 81, textureX, textureY); // Box 439
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 1337, 89, textureX, textureY); // Box 440
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 1369, 89, textureX, textureY); // Box 441
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 1785, 89, textureX, textureY); // Box 442
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 1825, 89, textureX, textureY); // Box 443
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 1857, 89, textureX, textureY); // Box 444
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 1273, 81, textureX, textureY); // Box 445
		leftTrackWheelModels[24] = new ModelRendererTurbo(this, 1889, 89, textureX, textureY); // Box 446
		leftTrackWheelModels[25] = new ModelRendererTurbo(this, 1921, 89, textureX, textureY); // Box 447
		leftTrackWheelModels[26] = new ModelRendererTurbo(this, 1305, 81, textureX, textureY); // Box 480
		leftTrackWheelModels[27] = new ModelRendererTurbo(this, 1961, 89, textureX, textureY); // Box 481
		leftTrackWheelModels[28] = new ModelRendererTurbo(this, 1993, 89, textureX, textureY); // Box 482
		leftTrackWheelModels[29] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 483
		leftTrackWheelModels[30] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 484
		leftTrackWheelModels[31] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 485
		leftTrackWheelModels[32] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 486
		leftTrackWheelModels[33] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Box 487
		leftTrackWheelModels[34] = new ModelRendererTurbo(this, 737, 89, textureX, textureY); // Box 488
		leftTrackWheelModels[35] = new ModelRendererTurbo(this, 801, 89, textureX, textureY); // Box 489
		leftTrackWheelModels[36] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 490
		leftTrackWheelModels[37] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 491
		leftTrackWheelModels[38] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 492
		leftTrackWheelModels[39] = new ModelRendererTurbo(this, 817, 97, textureX, textureY); // Box 571
		leftTrackWheelModels[40] = new ModelRendererTurbo(this, 849, 97, textureX, textureY); // Box 572
		leftTrackWheelModels[41] = new ModelRendererTurbo(this, 881, 97, textureX, textureY); // Box 573
		leftTrackWheelModels[42] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 574
		leftTrackWheelModels[43] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 575
		leftTrackWheelModels[44] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 615
		leftTrackWheelModels[45] = new ModelRendererTurbo(this, 2025, 89, textureX, textureY); // Box 616
		leftTrackWheelModels[46] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 617
		leftTrackWheelModels[47] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 618
		leftTrackWheelModels[48] = new ModelRendererTurbo(this, 905, 97, textureX, textureY); // Box 619
		leftTrackWheelModels[49] = new ModelRendererTurbo(this, 937, 97, textureX, textureY); // Box 620
		leftTrackWheelModels[50] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 621
		leftTrackWheelModels[51] = new ModelRendererTurbo(this, 969, 97, textureX, textureY); // Box 622
		leftTrackWheelModels[52] = new ModelRendererTurbo(this, 721, 97, textureX, textureY); // Box 623
		leftTrackWheelModels[53] = new ModelRendererTurbo(this, 753, 97, textureX, textureY); // Box 624
		leftTrackWheelModels[54] = new ModelRendererTurbo(this, 1001, 97, textureX, textureY); // Box 625
		leftTrackWheelModels[55] = new ModelRendererTurbo(this, 1033, 97, textureX, textureY); // Box 626
		leftTrackWheelModels[56] = new ModelRendererTurbo(this, 1065, 97, textureX, textureY); // Box 627
		leftTrackWheelModels[57] = new ModelRendererTurbo(this, 1097, 97, textureX, textureY); // Box 628
		leftTrackWheelModels[58] = new ModelRendererTurbo(this, 1129, 97, textureX, textureY); // Box 629
		leftTrackWheelModels[59] = new ModelRendererTurbo(this, 1153, 97, textureX, textureY); // Box 630
		leftTrackWheelModels[60] = new ModelRendererTurbo(this, 1609, 97, textureX, textureY); // Box 631
		leftTrackWheelModels[61] = new ModelRendererTurbo(this, 1641, 97, textureX, textureY); // Box 632
		leftTrackWheelModels[62] = new ModelRendererTurbo(this, 1673, 97, textureX, textureY); // Box 633
		leftTrackWheelModels[63] = new ModelRendererTurbo(this, 1705, 97, textureX, textureY); // Box 634
		leftTrackWheelModels[64] = new ModelRendererTurbo(this, 1737, 97, textureX, textureY); // Box 635
		leftTrackWheelModels[65] = new ModelRendererTurbo(this, 1769, 97, textureX, textureY); // Box 636
		leftTrackWheelModels[66] = new ModelRendererTurbo(this, 769, 105, textureX, textureY); // Box 637
		leftTrackWheelModels[67] = new ModelRendererTurbo(this, 801, 105, textureX, textureY); // Box 638
		leftTrackWheelModels[68] = new ModelRendererTurbo(this, 1169, 105, textureX, textureY); // Box 639
		leftTrackWheelModels[69] = new ModelRendererTurbo(this, 1785, 105, textureX, textureY); // Box 640
		leftTrackWheelModels[70] = new ModelRendererTurbo(this, 1017, 105, textureX, textureY); // Box 641
		leftTrackWheelModels[71] = new ModelRendererTurbo(this, 1113, 105, textureX, textureY); // Box 642
		leftTrackWheelModels[72] = new ModelRendererTurbo(this, 1625, 105, textureX, textureY); // Box 643
		leftTrackWheelModels[73] = new ModelRendererTurbo(this, 1721, 105, textureX, textureY); // Box 644
		leftTrackWheelModels[74] = new ModelRendererTurbo(this, 1817, 105, textureX, textureY); // Box 645
		leftTrackWheelModels[75] = new ModelRendererTurbo(this, 1881, 105, textureX, textureY); // Box 646
		leftTrackWheelModels[76] = new ModelRendererTurbo(this, 1953, 105, textureX, textureY); // Box 647
		leftTrackWheelModels[77] = new ModelRendererTurbo(this, 1985, 105, textureX, textureY); // Box 648
		leftTrackWheelModels[78] = new ModelRendererTurbo(this, 2017, 105, textureX, textureY); // Box 649
		leftTrackWheelModels[79] = new ModelRendererTurbo(this, 785, 113, textureX, textureY); // Box 650
		leftTrackWheelModels[80] = new ModelRendererTurbo(this, 817, 113, textureX, textureY); // Box 651
		leftTrackWheelModels[81] = new ModelRendererTurbo(this, 849, 113, textureX, textureY); // Box 652
		leftTrackWheelModels[82] = new ModelRendererTurbo(this, 881, 113, textureX, textureY); // Box 653
		leftTrackWheelModels[83] = new ModelRendererTurbo(this, 913, 113, textureX, textureY); // Box 654
		leftTrackWheelModels[84] = new ModelRendererTurbo(this, 945, 113, textureX, textureY); // Box 655
		leftTrackWheelModels[85] = new ModelRendererTurbo(this, 969, 113, textureX, textureY); // Box 656
		leftTrackWheelModels[86] = new ModelRendererTurbo(this, 1001, 113, textureX, textureY); // Box 657
		leftTrackWheelModels[87] = new ModelRendererTurbo(this, 1033, 113, textureX, textureY); // Box 658
		leftTrackWheelModels[88] = new ModelRendererTurbo(this, 1065, 113, textureX, textureY); // Box 659
		leftTrackWheelModels[89] = new ModelRendererTurbo(this, 1097, 113, textureX, textureY); // Box 660
		leftTrackWheelModels[90] = new ModelRendererTurbo(this, 1129, 113, textureX, textureY); // Box 661
		leftTrackWheelModels[91] = new ModelRendererTurbo(this, 1193, 113, textureX, textureY); // Box 662
		leftTrackWheelModels[92] = new ModelRendererTurbo(this, 1217, 113, textureX, textureY); // Box 663
		leftTrackWheelModels[93] = new ModelRendererTurbo(this, 1249, 113, textureX, textureY); // Box 664
		leftTrackWheelModels[94] = new ModelRendererTurbo(this, 1281, 113, textureX, textureY); // Box 665
		leftTrackWheelModels[95] = new ModelRendererTurbo(this, 1313, 113, textureX, textureY); // Box 666
		leftTrackWheelModels[96] = new ModelRendererTurbo(this, 1345, 113, textureX, textureY); // Box 667
		leftTrackWheelModels[97] = new ModelRendererTurbo(this, 1377, 113, textureX, textureY); // Box 668
		leftTrackWheelModels[98] = new ModelRendererTurbo(this, 1401, 113, textureX, textureY); // Box 669
		leftTrackWheelModels[99] = new ModelRendererTurbo(this, 1433, 113, textureX, textureY); // Box 670
		leftTrackWheelModels[100] = new ModelRendererTurbo(this, 1465, 113, textureX, textureY); // Box 671
		leftTrackWheelModels[101] = new ModelRendererTurbo(this, 1497, 113, textureX, textureY); // Box 672
		leftTrackWheelModels[102] = new ModelRendererTurbo(this, 1529, 113, textureX, textureY); // Box 673
		leftTrackWheelModels[103] = new ModelRendererTurbo(this, 1561, 113, textureX, textureY); // Box 674
		leftTrackWheelModels[104] = new ModelRendererTurbo(this, 1593, 113, textureX, textureY); // Box 675
		leftTrackWheelModels[105] = new ModelRendererTurbo(this, 1641, 113, textureX, textureY); // Box 676
		leftTrackWheelModels[106] = new ModelRendererTurbo(this, 1673, 113, textureX, textureY); // Box 677
		leftTrackWheelModels[107] = new ModelRendererTurbo(this, 1737, 113, textureX, textureY); // Box 678
		leftTrackWheelModels[108] = new ModelRendererTurbo(this, 1841, 113, textureX, textureY); // Box 679
		leftTrackWheelModels[109] = new ModelRendererTurbo(this, 1705, 113, textureX, textureY); // Box 680
		leftTrackWheelModels[110] = new ModelRendererTurbo(this, 1769, 113, textureX, textureY); // Box 681
		leftTrackWheelModels[111] = new ModelRendererTurbo(this, 1905, 113, textureX, textureY); // Box 682
		leftTrackWheelModels[112] = new ModelRendererTurbo(this, 1937, 113, textureX, textureY); // Box 683
		leftTrackWheelModels[113] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Box 684
		leftTrackWheelModels[114] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Box 685
		leftTrackWheelModels[115] = new ModelRendererTurbo(this, 1969, 113, textureX, textureY); // Box 686
		leftTrackWheelModels[116] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 687
		leftTrackWheelModels[117] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Box 688
		leftTrackWheelModels[118] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Box 689
		leftTrackWheelModels[119] = new ModelRendererTurbo(this, 529, 121, textureX, textureY); // Box 690
		leftTrackWheelModels[120] = new ModelRendererTurbo(this, 561, 121, textureX, textureY); // Box 691
		leftTrackWheelModels[121] = new ModelRendererTurbo(this, 593, 121, textureX, textureY); // Box 692
		leftTrackWheelModels[122] = new ModelRendererTurbo(this, 625, 121, textureX, textureY); // Box 693
		leftTrackWheelModels[123] = new ModelRendererTurbo(this, 657, 121, textureX, textureY); // Box 694
		leftTrackWheelModels[124] = new ModelRendererTurbo(this, 681, 121, textureX, textureY); // Box 695
		leftTrackWheelModels[125] = new ModelRendererTurbo(this, 713, 121, textureX, textureY); // Box 696
		leftTrackWheelModels[126] = new ModelRendererTurbo(this, 745, 121, textureX, textureY); // Box 697
		leftTrackWheelModels[127] = new ModelRendererTurbo(this, 1153, 121, textureX, textureY); // Box 698
		leftTrackWheelModels[128] = new ModelRendererTurbo(this, 801, 121, textureX, textureY); // Box 699
		leftTrackWheelModels[129] = new ModelRendererTurbo(this, 1609, 121, textureX, textureY); // Box 700
		leftTrackWheelModels[130] = new ModelRendererTurbo(this, 833, 121, textureX, textureY); // Box 701
		leftTrackWheelModels[131] = new ModelRendererTurbo(this, 929, 121, textureX, textureY); // Box 702
		leftTrackWheelModels[132] = new ModelRendererTurbo(this, 985, 121, textureX, textureY); // Box 703
		leftTrackWheelModels[133] = new ModelRendererTurbo(this, 1785, 121, textureX, textureY); // Box 704
		leftTrackWheelModels[134] = new ModelRendererTurbo(this, 1817, 121, textureX, textureY); // Box 705
		leftTrackWheelModels[135] = new ModelRendererTurbo(this, 1017, 121, textureX, textureY); // Box 706
		leftTrackWheelModels[136] = new ModelRendererTurbo(this, 1113, 121, textureX, textureY); // Box 707
		leftTrackWheelModels[137] = new ModelRendererTurbo(this, 1233, 121, textureX, textureY); // Box 708
		leftTrackWheelModels[138] = new ModelRendererTurbo(this, 1265, 121, textureX, textureY); // Box 709
		leftTrackWheelModels[139] = new ModelRendererTurbo(this, 1865, 121, textureX, textureY); // Box 710
		leftTrackWheelModels[140] = new ModelRendererTurbo(this, 1985, 121, textureX, textureY); // Box 711
		leftTrackWheelModels[141] = new ModelRendererTurbo(this, 1361, 121, textureX, textureY); // Box 712
		leftTrackWheelModels[142] = new ModelRendererTurbo(this, 2017, 121, textureX, textureY); // Box 713
		leftTrackWheelModels[143] = new ModelRendererTurbo(this, 1417, 121, textureX, textureY); // Box 714
		leftTrackWheelModels[144] = new ModelRendererTurbo(this, 1449, 121, textureX, textureY); // Box 715
		leftTrackWheelModels[145] = new ModelRendererTurbo(this, 1545, 121, textureX, textureY); // Box 716
		leftTrackWheelModels[146] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 717
		leftTrackWheelModels[147] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Box 718
		leftTrackWheelModels[148] = new ModelRendererTurbo(this, 1657, 121, textureX, textureY); // Box 719
		leftTrackWheelModels[149] = new ModelRendererTurbo(this, 1689, 121, textureX, textureY); // Box 720
		leftTrackWheelModels[150] = new ModelRendererTurbo(this, 1721, 121, textureX, textureY); // Box 721
		leftTrackWheelModels[151] = new ModelRendererTurbo(this, 1921, 121, textureX, textureY); // Box 722
		leftTrackWheelModels[152] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Box 723
		leftTrackWheelModels[153] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Box 724
		leftTrackWheelModels[154] = new ModelRendererTurbo(this, 1953, 121, textureX, textureY); // Box 725
		leftTrackWheelModels[155] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Box 726
		leftTrackWheelModels[156] = new ModelRendererTurbo(this, 161, 129, textureX, textureY); // Box 727
		leftTrackWheelModels[157] = new ModelRendererTurbo(this, 185, 129, textureX, textureY); // Box 728
		leftTrackWheelModels[158] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Box 729
		leftTrackWheelModels[159] = new ModelRendererTurbo(this, 249, 129, textureX, textureY); // Box 730
		leftTrackWheelModels[160] = new ModelRendererTurbo(this, 281, 129, textureX, textureY); // Box 731
		leftTrackWheelModels[161] = new ModelRendererTurbo(this, 313, 129, textureX, textureY); // Box 732
		leftTrackWheelModels[162] = new ModelRendererTurbo(this, 345, 129, textureX, textureY); // Box 733
		leftTrackWheelModels[163] = new ModelRendererTurbo(this, 513, 129, textureX, textureY); // Box 734
		leftTrackWheelModels[164] = new ModelRendererTurbo(this, 545, 129, textureX, textureY); // Box 735
		leftTrackWheelModels[165] = new ModelRendererTurbo(this, 769, 129, textureX, textureY); // Box 736
		leftTrackWheelModels[166] = new ModelRendererTurbo(this, 849, 129, textureX, textureY); // Box 737
		leftTrackWheelModels[167] = new ModelRendererTurbo(this, 641, 129, textureX, textureY); // Box 738
		leftTrackWheelModels[168] = new ModelRendererTurbo(this, 881, 129, textureX, textureY); // Box 739
		leftTrackWheelModels[169] = new ModelRendererTurbo(this, 697, 129, textureX, textureY); // Box 740
		leftTrackWheelModels[170] = new ModelRendererTurbo(this, 729, 129, textureX, textureY); // Box 741
		leftTrackWheelModels[171] = new ModelRendererTurbo(this, 817, 129, textureX, textureY); // Box 742
		leftTrackWheelModels[172] = new ModelRendererTurbo(this, 945, 129, textureX, textureY); // Box 743
		leftTrackWheelModels[173] = new ModelRendererTurbo(this, 1033, 129, textureX, textureY); // Box 744
		leftTrackWheelModels[174] = new ModelRendererTurbo(this, 913, 129, textureX, textureY); // Box 745
		leftTrackWheelModels[175] = new ModelRendererTurbo(this, 1001, 129, textureX, textureY); // Box 746
		leftTrackWheelModels[176] = new ModelRendererTurbo(this, 1065, 129, textureX, textureY); // Box 747
		leftTrackWheelModels[177] = new ModelRendererTurbo(this, 1097, 129, textureX, textureY); // Box 748
		leftTrackWheelModels[178] = new ModelRendererTurbo(this, 1129, 129, textureX, textureY); // Box 749
		leftTrackWheelModels[179] = new ModelRendererTurbo(this, 1177, 129, textureX, textureY); // Box 750
		leftTrackWheelModels[180] = new ModelRendererTurbo(this, 1209, 129, textureX, textureY); // Box 751
		leftTrackWheelModels[181] = new ModelRendererTurbo(this, 1281, 129, textureX, textureY); // Box 752
		leftTrackWheelModels[182] = new ModelRendererTurbo(this, 1249, 129, textureX, textureY); // Box 753
		leftTrackWheelModels[183] = new ModelRendererTurbo(this, 1313, 129, textureX, textureY); // Box 754
		leftTrackWheelModels[184] = new ModelRendererTurbo(this, 1345, 129, textureX, textureY); // Box 755
		leftTrackWheelModels[185] = new ModelRendererTurbo(this, 1377, 129, textureX, textureY); // Box 756
		leftTrackWheelModels[186] = new ModelRendererTurbo(this, 1465, 129, textureX, textureY); // Box 757
		leftTrackWheelModels[187] = new ModelRendererTurbo(this, 1433, 129, textureX, textureY); // Box 758
		leftTrackWheelModels[188] = new ModelRendererTurbo(this, 1497, 129, textureX, textureY); // Box 759
		leftTrackWheelModels[189] = new ModelRendererTurbo(this, 1521, 129, textureX, textureY); // Box 760
		leftTrackWheelModels[190] = new ModelRendererTurbo(this, 1561, 129, textureX, textureY); // Box 761
		leftTrackWheelModels[191] = new ModelRendererTurbo(this, 1633, 129, textureX, textureY); // Box 762
		leftTrackWheelModels[192] = new ModelRendererTurbo(this, 1737, 129, textureX, textureY); // Box 763
		leftTrackWheelModels[193] = new ModelRendererTurbo(this, 1593, 129, textureX, textureY); // Box 764
		leftTrackWheelModels[194] = new ModelRendererTurbo(this, 1841, 129, textureX, textureY); // Box 765
		leftTrackWheelModels[195] = new ModelRendererTurbo(this, 1673, 129, textureX, textureY); // Box 766
		leftTrackWheelModels[196] = new ModelRendererTurbo(this, 1705, 129, textureX, textureY); // Box 767
		leftTrackWheelModels[197] = new ModelRendererTurbo(this, 1769, 129, textureX, textureY); // Box 768
		leftTrackWheelModels[198] = new ModelRendererTurbo(this, 1889, 129, textureX, textureY); // Box 769
		leftTrackWheelModels[199] = new ModelRendererTurbo(this, 361, 137, textureX, textureY); // Box 770
		leftTrackWheelModels[200] = new ModelRendererTurbo(this, 1937, 129, textureX, textureY); // Box 771
		leftTrackWheelModels[201] = new ModelRendererTurbo(this, 1969, 129, textureX, textureY); // Box 772
		leftTrackWheelModels[202] = new ModelRendererTurbo(this, 201, 137, textureX, textureY); // Box 773
		leftTrackWheelModels[203] = new ModelRendererTurbo(this, 233, 137, textureX, textureY); // Box 774
		leftTrackWheelModels[204] = new ModelRendererTurbo(this, 393, 137, textureX, textureY); // Box 775
		leftTrackWheelModels[205] = new ModelRendererTurbo(this, 425, 137, textureX, textureY); // Box 776
		leftTrackWheelModels[206] = new ModelRendererTurbo(this, 329, 137, textureX, textureY); // Box 777
		leftTrackWheelModels[207] = new ModelRendererTurbo(this, 457, 137, textureX, textureY); // Box 778
		leftTrackWheelModels[208] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 779
		leftTrackWheelModels[209] = new ModelRendererTurbo(this, 529, 137, textureX, textureY); // Box 780
		leftTrackWheelModels[210] = new ModelRendererTurbo(this, 561, 137, textureX, textureY); // Box 781
		leftTrackWheelModels[211] = new ModelRendererTurbo(this, 593, 137, textureX, textureY); // Box 782
		leftTrackWheelModels[212] = new ModelRendererTurbo(this, 657, 137, textureX, textureY); // Box 783
		leftTrackWheelModels[213] = new ModelRendererTurbo(this, 625, 137, textureX, textureY); // Box 784
		leftTrackWheelModels[214] = new ModelRendererTurbo(this, 713, 137, textureX, textureY); // Box 785
		leftTrackWheelModels[215] = new ModelRendererTurbo(this, 745, 137, textureX, textureY); // Box 786
		leftTrackWheelModels[216] = new ModelRendererTurbo(this, 793, 137, textureX, textureY); // Box 787
		leftTrackWheelModels[217] = new ModelRendererTurbo(this, 969, 137, textureX, textureY); // Box 788
		leftTrackWheelModels[218] = new ModelRendererTurbo(this, 1153, 137, textureX, textureY); // Box 789
		leftTrackWheelModels[219] = new ModelRendererTurbo(this, 833, 137, textureX, textureY); // Box 790
		leftTrackWheelModels[220] = new ModelRendererTurbo(this, 1225, 137, textureX, textureY); // Box 791
		leftTrackWheelModels[221] = new ModelRendererTurbo(this, 929, 137, textureX, textureY); // Box 792
		leftTrackWheelModels[222] = new ModelRendererTurbo(this, 1017, 137, textureX, textureY); // Box 793
		leftTrackWheelModels[223] = new ModelRendererTurbo(this, 1081, 137, textureX, textureY); // Box 794
		leftTrackWheelModels[224] = new ModelRendererTurbo(this, 1401, 137, textureX, textureY); // Box 795
		leftTrackWheelModels[225] = new ModelRendererTurbo(this, 1537, 137, textureX, textureY); // Box 796
		leftTrackWheelModels[226] = new ModelRendererTurbo(this, 1113, 137, textureX, textureY); // Box 797
		leftTrackWheelModels[227] = new ModelRendererTurbo(this, 1265, 137, textureX, textureY); // Box 798
		leftTrackWheelModels[228] = new ModelRendererTurbo(this, 1329, 137, textureX, textureY); // Box 799
		leftTrackWheelModels[229] = new ModelRendererTurbo(this, 1361, 137, textureX, textureY); // Box 800
		leftTrackWheelModels[230] = new ModelRendererTurbo(this, 1609, 137, textureX, textureY); // Box 801
		leftTrackWheelModels[231] = new ModelRendererTurbo(this, 1785, 137, textureX, textureY); // Box 802
		leftTrackWheelModels[232] = new ModelRendererTurbo(this, 1449, 137, textureX, textureY); // Box 803
		leftTrackWheelModels[233] = new ModelRendererTurbo(this, 1817, 137, textureX, textureY); // Box 804
		leftTrackWheelModels[234] = new ModelRendererTurbo(this, 1577, 137, textureX, textureY); // Box 805
		leftTrackWheelModels[235] = new ModelRendererTurbo(this, 1657, 137, textureX, textureY); // Box 806
		leftTrackWheelModels[236] = new ModelRendererTurbo(this, 1689, 137, textureX, textureY); // Box 807
		leftTrackWheelModels[237] = new ModelRendererTurbo(this, 1865, 137, textureX, textureY); // Box 808
		leftTrackWheelModels[238] = new ModelRendererTurbo(this, 1913, 137, textureX, textureY); // Box 809
		leftTrackWheelModels[239] = new ModelRendererTurbo(this, 1985, 137, textureX, textureY); // Box 810
		leftTrackWheelModels[240] = new ModelRendererTurbo(this, 681, 137, textureX, textureY); // Box 811
		leftTrackWheelModels[241] = new ModelRendererTurbo(this, 2017, 137, textureX, textureY); // Box 812
		leftTrackWheelModels[242] = new ModelRendererTurbo(this, 1721, 137, textureX, textureY); // Box 813
		leftTrackWheelModels[243] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 814
		leftTrackWheelModels[244] = new ModelRendererTurbo(this, 33, 145, textureX, textureY); // Box 815
		leftTrackWheelModels[245] = new ModelRendererTurbo(this, 1953, 137, textureX, textureY); // Box 816
		leftTrackWheelModels[246] = new ModelRendererTurbo(this, 65, 145, textureX, textureY); // Box 817
		leftTrackWheelModels[247] = new ModelRendererTurbo(this, 97, 145, textureX, textureY); // Box 818
		leftTrackWheelModels[248] = new ModelRendererTurbo(this, 129, 145, textureX, textureY); // Box 819
		leftTrackWheelModels[249] = new ModelRendererTurbo(this, 161, 145, textureX, textureY); // Box 820
		leftTrackWheelModels[250] = new ModelRendererTurbo(this, 217, 145, textureX, textureY); // Box 821
		leftTrackWheelModels[251] = new ModelRendererTurbo(this, 249, 145, textureX, textureY); // Box 822
		leftTrackWheelModels[252] = new ModelRendererTurbo(this, 281, 145, textureX, textureY); // Box 823
		leftTrackWheelModels[253] = new ModelRendererTurbo(this, 505, 145, textureX, textureY); // Box 824
		leftTrackWheelModels[254] = new ModelRendererTurbo(this, 761, 145, textureX, textureY); // Box 825
		leftTrackWheelModels[255] = new ModelRendererTurbo(this, 313, 145, textureX, textureY); // Box 826
		leftTrackWheelModels[256] = new ModelRendererTurbo(this, 809, 145, textureX, textureY); // Box 827
		leftTrackWheelModels[257] = new ModelRendererTurbo(this, 345, 145, textureX, textureY); // Box 828
		leftTrackWheelModels[258] = new ModelRendererTurbo(this, 849, 145, textureX, textureY); // Box 829
		leftTrackWheelModels[259] = new ModelRendererTurbo(this, 881, 145, textureX, textureY); // Box 830
		leftTrackWheelModels[260] = new ModelRendererTurbo(this, 545, 145, textureX, textureY); // Box 831
		leftTrackWheelModels[261] = new ModelRendererTurbo(this, 945, 145, textureX, textureY); // Box 832
		leftTrackWheelModels[262] = new ModelRendererTurbo(this, 577, 145, textureX, textureY); // Box 833
		leftTrackWheelModels[263] = new ModelRendererTurbo(this, 993, 145, textureX, textureY); // Box 834
		leftTrackWheelModels[264] = new ModelRendererTurbo(this, 1033, 145, textureX, textureY); // Box 835
		leftTrackWheelModels[265] = new ModelRendererTurbo(this, 641, 145, textureX, textureY); // Box 836
		leftTrackWheelModels[266] = new ModelRendererTurbo(this, 1129, 145, textureX, textureY); // Box 837
		leftTrackWheelModels[267] = new ModelRendererTurbo(this, 697, 145, textureX, textureY); // Box 838
		leftTrackWheelModels[268] = new ModelRendererTurbo(this, 1177, 145, textureX, textureY); // Box 839
		leftTrackWheelModels[269] = new ModelRendererTurbo(this, 729, 145, textureX, textureY); // Box 840
		leftTrackWheelModels[270] = new ModelRendererTurbo(this, 1281, 145, textureX, textureY); // Box 841
		leftTrackWheelModels[271] = new ModelRendererTurbo(this, 1377, 145, textureX, textureY); // Box 842
		leftTrackWheelModels[272] = new ModelRendererTurbo(this, 913, 145, textureX, textureY); // Box 843
		leftTrackWheelModels[273] = new ModelRendererTurbo(this, 1425, 145, textureX, textureY); // Box 844

		leftTrackWheelModels[0].addShapeBox(0F, 0F, 0F, 8, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		leftTrackWheelModels[0].setRotationPoint(-100F, -4F, 24F);

		leftTrackWheelModels[1].addShapeBox(0F, 0F, 0F, 8, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		leftTrackWheelModels[1].setRotationPoint(-100F, -8F, 24F);

		leftTrackWheelModels[2].addShapeBox(0F, 0F, 0F, 8, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		leftTrackWheelModels[2].setRotationPoint(-100F, 4F, 24F);

		leftTrackWheelModels[3].addShapeBox(0F, 0F, 0F, 4, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		leftTrackWheelModels[3].setRotationPoint(-92F, -4F, 24F);

		leftTrackWheelModels[4].addShapeBox(0F, 0F, 0F, 4, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		leftTrackWheelModels[4].setRotationPoint(-104F, -4F, 24F);

		leftTrackWheelModels[5].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		leftTrackWheelModels[5].setRotationPoint(-92F, -8F, 24F);

		leftTrackWheelModels[6].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,-1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		leftTrackWheelModels[6].setRotationPoint(-104F, -8F, 24F);

		leftTrackWheelModels[7].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F); // Box 74
		leftTrackWheelModels[7].setRotationPoint(-104F, 4F, 24F);

		leftTrackWheelModels[8].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F); // Box 75
		leftTrackWheelModels[8].setRotationPoint(-92F, 4F, 24F);

		leftTrackWheelModels[9].addShapeBox(0F, 0F, 0F, 1, 8, 10, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 76
		leftTrackWheelModels[9].setRotationPoint(-88F, -4F, 24F);

		leftTrackWheelModels[10].addShapeBox(0F, 0F, 0F, 1, 8, 10, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 79
		leftTrackWheelModels[10].setRotationPoint(-105F, -4F, 24F);

		leftTrackWheelModels[11].addShapeBox(0F, 0F, 0F, 8, 1, 10, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		leftTrackWheelModels[11].setRotationPoint(-100F, -9F, 24F);

		leftTrackWheelModels[12].addShapeBox(0F, 0F, 0F, 8, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 81
		leftTrackWheelModels[12].setRotationPoint(-100F, 8F, 24F);

		leftTrackWheelModels[13].addShapeBox(0F, 0F, 0F, 8, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 435
		leftTrackWheelModels[13].setRotationPoint(77F, 8F, 24F);

		leftTrackWheelModels[14].addShapeBox(0F, 0F, 0F, 8, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 436
		leftTrackWheelModels[14].setRotationPoint(77F, 4F, 24F);

		leftTrackWheelModels[15].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F); // Box 437
		leftTrackWheelModels[15].setRotationPoint(85F, 4F, 24F);

		leftTrackWheelModels[16].addShapeBox(0F, 0F, 0F, 4, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 438
		leftTrackWheelModels[16].setRotationPoint(85F, -4F, 24F);

		leftTrackWheelModels[17].addShapeBox(0F, 0F, 0F, 1, 8, 10, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 439
		leftTrackWheelModels[17].setRotationPoint(89F, -4F, 24F);

		leftTrackWheelModels[18].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 440
		leftTrackWheelModels[18].setRotationPoint(85F, -8F, 24F);

		leftTrackWheelModels[19].addShapeBox(0F, 0F, 0F, 8, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 441
		leftTrackWheelModels[19].setRotationPoint(77F, -8F, 24F);

		leftTrackWheelModels[20].addShapeBox(0F, 0F, 0F, 8, 1, 10, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 442
		leftTrackWheelModels[20].setRotationPoint(77F, -9F, 24F);

		leftTrackWheelModels[21].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,-1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 443
		leftTrackWheelModels[21].setRotationPoint(73F, -8F, 24F);

		leftTrackWheelModels[22].addShapeBox(0F, 0F, 0F, 4, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 444
		leftTrackWheelModels[22].setRotationPoint(73F, -4F, 24F);

		leftTrackWheelModels[23].addShapeBox(0F, 0F, 0F, 1, 8, 10, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 445
		leftTrackWheelModels[23].setRotationPoint(72F, -4F, 24F);

		leftTrackWheelModels[24].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F); // Box 446
		leftTrackWheelModels[24].setRotationPoint(73F, 4F, 24F);

		leftTrackWheelModels[25].addShapeBox(0F, 0F, 0F, 8, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447
		leftTrackWheelModels[25].setRotationPoint(77F, -4F, 24F);

		leftTrackWheelModels[26].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,-0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F); // Box 480
		leftTrackWheelModels[26].setRotationPoint(56F, 2.75F, 24F);

		leftTrackWheelModels[27].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F); // Box 481
		leftTrackWheelModels[27].setRotationPoint(59F, 8.75F, 24F);

		leftTrackWheelModels[28].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 482
		leftTrackWheelModels[28].setRotationPoint(59F, 6.75F, 24F);

		leftTrackWheelModels[29].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F); // Box 483
		leftTrackWheelModels[29].setRotationPoint(63F, 6.75F, 24F);

		leftTrackWheelModels[30].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 484
		leftTrackWheelModels[30].setRotationPoint(63F, 2.75F, 24F);

		leftTrackWheelModels[31].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F); // Box 485
		leftTrackWheelModels[31].setRotationPoint(65F, 2.75F, 24F);

		leftTrackWheelModels[32].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 486
		leftTrackWheelModels[32].setRotationPoint(57F, 2.75F, 24F);

		leftTrackWheelModels[33].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F); // Box 487
		leftTrackWheelModels[33].setRotationPoint(57F, 6.75F, 24F);

		leftTrackWheelModels[34].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,-0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 488
		leftTrackWheelModels[34].setRotationPoint(57F, 0.75F, 24F);

		leftTrackWheelModels[35].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 489
		leftTrackWheelModels[35].setRotationPoint(63F, 0.75F, 24F);

		leftTrackWheelModels[36].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,-1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
		leftTrackWheelModels[36].setRotationPoint(59F, -0.25F, 24F);

		leftTrackWheelModels[37].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 491
		leftTrackWheelModels[37].setRotationPoint(59F, 0.75F, 24F);

		leftTrackWheelModels[38].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
		leftTrackWheelModels[38].setRotationPoint(59F, 2.75F, 24F);

		leftTrackWheelModels[39].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 571
		leftTrackWheelModels[39].setRotationPoint(55F, -8F, 24F);

		leftTrackWheelModels[40].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,-1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 572
		leftTrackWheelModels[40].setRotationPoint(55F, -9F, 24F);

		leftTrackWheelModels[41].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 573
		leftTrackWheelModels[41].setRotationPoint(55F, -5F, 24F);

		leftTrackWheelModels[42].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F); // Box 574
		leftTrackWheelModels[42].setRotationPoint(58F, -8F, 24F);

		leftTrackWheelModels[43].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,-0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F); // Box 575
		leftTrackWheelModels[43].setRotationPoint(54F, -8F, 24F);

		leftTrackWheelModels[44].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,-0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 615
		leftTrackWheelModels[44].setRotationPoint(48F, 0.75F, 24F);

		leftTrackWheelModels[45].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,-0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F); // Box 616
		leftTrackWheelModels[45].setRotationPoint(47F, 2.75F, 24F);

		leftTrackWheelModels[46].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 617
		leftTrackWheelModels[46].setRotationPoint(48F, 2.75F, 24F);

		leftTrackWheelModels[47].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F); // Box 618
		leftTrackWheelModels[47].setRotationPoint(48F, 6.75F, 24F);

		leftTrackWheelModels[48].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F); // Box 619
		leftTrackWheelModels[48].setRotationPoint(50F, 8.75F, 24F);

		leftTrackWheelModels[49].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 620
		leftTrackWheelModels[49].setRotationPoint(50F, 6.75F, 24F);

		leftTrackWheelModels[50].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F); // Box 621
		leftTrackWheelModels[50].setRotationPoint(54F, 6.75F, 24F);

		leftTrackWheelModels[51].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 622
		leftTrackWheelModels[51].setRotationPoint(50F, 2.75F, 24F);

		leftTrackWheelModels[52].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F); // Box 623
		leftTrackWheelModels[52].setRotationPoint(56F, 2.75F, 24F);

		leftTrackWheelModels[53].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 624
		leftTrackWheelModels[53].setRotationPoint(54F, 2.75F, 24F);

		leftTrackWheelModels[54].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 625
		leftTrackWheelModels[54].setRotationPoint(54F, 0.75F, 24F);

		leftTrackWheelModels[55].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 626
		leftTrackWheelModels[55].setRotationPoint(50F, 0.75F, 24F);

		leftTrackWheelModels[56].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,-1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 627
		leftTrackWheelModels[56].setRotationPoint(50F, -0.25F, 24F);

		leftTrackWheelModels[57].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,-0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 628
		leftTrackWheelModels[57].setRotationPoint(39F, 0.75F, 24F);

		leftTrackWheelModels[58].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,-0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F); // Box 629
		leftTrackWheelModels[58].setRotationPoint(38F, 2.75F, 24F);

		leftTrackWheelModels[59].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 630
		leftTrackWheelModels[59].setRotationPoint(39F, 2.75F, 24F);

		leftTrackWheelModels[60].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F); // Box 631
		leftTrackWheelModels[60].setRotationPoint(39F, 6.75F, 24F);

		leftTrackWheelModels[61].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F); // Box 632
		leftTrackWheelModels[61].setRotationPoint(41F, 8.75F, 24F);

		leftTrackWheelModels[62].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 633
		leftTrackWheelModels[62].setRotationPoint(41F, 6.75F, 24F);

		leftTrackWheelModels[63].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F); // Box 634
		leftTrackWheelModels[63].setRotationPoint(45F, 6.75F, 24F);

		leftTrackWheelModels[64].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 635
		leftTrackWheelModels[64].setRotationPoint(41F, 2.75F, 24F);

		leftTrackWheelModels[65].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F); // Box 636
		leftTrackWheelModels[65].setRotationPoint(47F, 2.75F, 24F);

		leftTrackWheelModels[66].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 637
		leftTrackWheelModels[66].setRotationPoint(45F, 2.75F, 24F);

		leftTrackWheelModels[67].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 638
		leftTrackWheelModels[67].setRotationPoint(45F, 0.75F, 24F);

		leftTrackWheelModels[68].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 639
		leftTrackWheelModels[68].setRotationPoint(41F, 0.75F, 24F);

		leftTrackWheelModels[69].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,-1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 640
		leftTrackWheelModels[69].setRotationPoint(41F, -0.25F, 24F);

		leftTrackWheelModels[70].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,-0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 641
		leftTrackWheelModels[70].setRotationPoint(30F, 0.75F, 24F);

		leftTrackWheelModels[71].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,-0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F); // Box 642
		leftTrackWheelModels[71].setRotationPoint(29F, 2.75F, 24F);

		leftTrackWheelModels[72].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 643
		leftTrackWheelModels[72].setRotationPoint(30F, 2.75F, 24F);

		leftTrackWheelModels[73].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F); // Box 644
		leftTrackWheelModels[73].setRotationPoint(30F, 6.75F, 24F);

		leftTrackWheelModels[74].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F); // Box 645
		leftTrackWheelModels[74].setRotationPoint(32F, 8.75F, 24F);

		leftTrackWheelModels[75].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 646
		leftTrackWheelModels[75].setRotationPoint(32F, 6.75F, 24F);

		leftTrackWheelModels[76].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F); // Box 647
		leftTrackWheelModels[76].setRotationPoint(36F, 6.75F, 24F);

		leftTrackWheelModels[77].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 648
		leftTrackWheelModels[77].setRotationPoint(32F, 2.75F, 24F);

		leftTrackWheelModels[78].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F); // Box 649
		leftTrackWheelModels[78].setRotationPoint(38F, 2.75F, 24F);

		leftTrackWheelModels[79].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 650
		leftTrackWheelModels[79].setRotationPoint(36F, 2.75F, 24F);

		leftTrackWheelModels[80].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
		leftTrackWheelModels[80].setRotationPoint(36F, 0.75F, 24F);

		leftTrackWheelModels[81].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 652
		leftTrackWheelModels[81].setRotationPoint(32F, 0.75F, 24F);

		leftTrackWheelModels[82].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,-1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 653
		leftTrackWheelModels[82].setRotationPoint(32F, -0.25F, 24F);

		leftTrackWheelModels[83].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,-0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 654
		leftTrackWheelModels[83].setRotationPoint(21F, 0.75F, 24F);

		leftTrackWheelModels[84].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,-0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F); // Box 655
		leftTrackWheelModels[84].setRotationPoint(20F, 2.75F, 24F);

		leftTrackWheelModels[85].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 656
		leftTrackWheelModels[85].setRotationPoint(21F, 2.75F, 24F);

		leftTrackWheelModels[86].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F); // Box 657
		leftTrackWheelModels[86].setRotationPoint(21F, 6.75F, 24F);

		leftTrackWheelModels[87].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F); // Box 658
		leftTrackWheelModels[87].setRotationPoint(23F, 8.75F, 24F);

		leftTrackWheelModels[88].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 659
		leftTrackWheelModels[88].setRotationPoint(23F, 6.75F, 24F);

		leftTrackWheelModels[89].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F); // Box 660
		leftTrackWheelModels[89].setRotationPoint(27F, 6.75F, 24F);

		leftTrackWheelModels[90].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 661
		leftTrackWheelModels[90].setRotationPoint(23F, 2.75F, 24F);

		leftTrackWheelModels[91].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F); // Box 662
		leftTrackWheelModels[91].setRotationPoint(29F, 2.75F, 24F);

		leftTrackWheelModels[92].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 663
		leftTrackWheelModels[92].setRotationPoint(27F, 2.75F, 24F);

		leftTrackWheelModels[93].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 664
		leftTrackWheelModels[93].setRotationPoint(27F, 0.75F, 24F);

		leftTrackWheelModels[94].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 665
		leftTrackWheelModels[94].setRotationPoint(23F, 0.75F, 24F);

		leftTrackWheelModels[95].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,-1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 666
		leftTrackWheelModels[95].setRotationPoint(23F, -0.25F, 24F);

		leftTrackWheelModels[96].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,-0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 667
		leftTrackWheelModels[96].setRotationPoint(12F, 0.75F, 24F);

		leftTrackWheelModels[97].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,-0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F); // Box 668
		leftTrackWheelModels[97].setRotationPoint(11F, 2.75F, 24F);

		leftTrackWheelModels[98].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 669
		leftTrackWheelModels[98].setRotationPoint(12F, 2.75F, 24F);

		leftTrackWheelModels[99].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F); // Box 670
		leftTrackWheelModels[99].setRotationPoint(12F, 6.75F, 24F);

		leftTrackWheelModels[100].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F); // Box 671
		leftTrackWheelModels[100].setRotationPoint(14F, 8.75F, 24F);

		leftTrackWheelModels[101].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 672
		leftTrackWheelModels[101].setRotationPoint(14F, 6.75F, 24F);

		leftTrackWheelModels[102].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F); // Box 673
		leftTrackWheelModels[102].setRotationPoint(18F, 6.75F, 24F);

		leftTrackWheelModels[103].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 674
		leftTrackWheelModels[103].setRotationPoint(14F, 2.75F, 24F);

		leftTrackWheelModels[104].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F); // Box 675
		leftTrackWheelModels[104].setRotationPoint(20F, 2.75F, 24F);

		leftTrackWheelModels[105].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 676
		leftTrackWheelModels[105].setRotationPoint(18F, 2.75F, 24F);

		leftTrackWheelModels[106].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 677
		leftTrackWheelModels[106].setRotationPoint(18F, 0.75F, 24F);

		leftTrackWheelModels[107].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 678
		leftTrackWheelModels[107].setRotationPoint(14F, 0.75F, 24F);

		leftTrackWheelModels[108].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,-1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 679
		leftTrackWheelModels[108].setRotationPoint(14F, -0.25F, 24F);

		leftTrackWheelModels[109].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,-0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 680
		leftTrackWheelModels[109].setRotationPoint(3F, 0.75F, 24F);

		leftTrackWheelModels[110].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,-0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F); // Box 681
		leftTrackWheelModels[110].setRotationPoint(2F, 2.75F, 24F);

		leftTrackWheelModels[111].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 682
		leftTrackWheelModels[111].setRotationPoint(3F, 2.75F, 24F);

		leftTrackWheelModels[112].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F); // Box 683
		leftTrackWheelModels[112].setRotationPoint(3F, 6.75F, 24F);

		leftTrackWheelModels[113].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F); // Box 684
		leftTrackWheelModels[113].setRotationPoint(5F, 8.75F, 24F);

		leftTrackWheelModels[114].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 685
		leftTrackWheelModels[114].setRotationPoint(5F, 6.75F, 24F);

		leftTrackWheelModels[115].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F); // Box 686
		leftTrackWheelModels[115].setRotationPoint(9F, 6.75F, 24F);

		leftTrackWheelModels[116].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 687
		leftTrackWheelModels[116].setRotationPoint(5F, 2.75F, 24F);

		leftTrackWheelModels[117].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F); // Box 688
		leftTrackWheelModels[117].setRotationPoint(11F, 2.75F, 24F);

		leftTrackWheelModels[118].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 689
		leftTrackWheelModels[118].setRotationPoint(9F, 2.75F, 24F);

		leftTrackWheelModels[119].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 690
		leftTrackWheelModels[119].setRotationPoint(9F, 0.75F, 24F);

		leftTrackWheelModels[120].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 691
		leftTrackWheelModels[120].setRotationPoint(5F, 0.75F, 24F);

		leftTrackWheelModels[121].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,-1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 692
		leftTrackWheelModels[121].setRotationPoint(5F, -0.25F, 24F);

		leftTrackWheelModels[122].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,-0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 693
		leftTrackWheelModels[122].setRotationPoint(-6F, 0.75F, 24F);

		leftTrackWheelModels[123].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,-0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F); // Box 694
		leftTrackWheelModels[123].setRotationPoint(-7F, 2.75F, 24F);

		leftTrackWheelModels[124].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 695
		leftTrackWheelModels[124].setRotationPoint(-6F, 2.75F, 24F);

		leftTrackWheelModels[125].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F); // Box 696
		leftTrackWheelModels[125].setRotationPoint(-6F, 6.75F, 24F);

		leftTrackWheelModels[126].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F); // Box 697
		leftTrackWheelModels[126].setRotationPoint(-4F, 8.75F, 24F);

		leftTrackWheelModels[127].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 698
		leftTrackWheelModels[127].setRotationPoint(-4F, 6.75F, 24F);

		leftTrackWheelModels[128].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F); // Box 699
		leftTrackWheelModels[128].setRotationPoint(0F, 6.75F, 24F);

		leftTrackWheelModels[129].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 700
		leftTrackWheelModels[129].setRotationPoint(-4F, 2.75F, 24F);

		leftTrackWheelModels[130].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F); // Box 701
		leftTrackWheelModels[130].setRotationPoint(2F, 2.75F, 24F);

		leftTrackWheelModels[131].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 702
		leftTrackWheelModels[131].setRotationPoint(0F, 2.75F, 24F);

		leftTrackWheelModels[132].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 703
		leftTrackWheelModels[132].setRotationPoint(0F, 0.75F, 24F);

		leftTrackWheelModels[133].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 704
		leftTrackWheelModels[133].setRotationPoint(-4F, 0.75F, 24F);

		leftTrackWheelModels[134].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,-1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 705
		leftTrackWheelModels[134].setRotationPoint(-4F, -0.25F, 24F);

		leftTrackWheelModels[135].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,-0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 706
		leftTrackWheelModels[135].setRotationPoint(-15F, 0.75F, 24F);

		leftTrackWheelModels[136].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,-0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F); // Box 707
		leftTrackWheelModels[136].setRotationPoint(-16F, 2.75F, 24F);

		leftTrackWheelModels[137].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 708
		leftTrackWheelModels[137].setRotationPoint(-15F, 2.75F, 24F);

		leftTrackWheelModels[138].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F); // Box 709
		leftTrackWheelModels[138].setRotationPoint(-15F, 6.75F, 24F);

		leftTrackWheelModels[139].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F); // Box 710
		leftTrackWheelModels[139].setRotationPoint(-13F, 8.75F, 24F);

		leftTrackWheelModels[140].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 711
		leftTrackWheelModels[140].setRotationPoint(-13F, 6.75F, 24F);

		leftTrackWheelModels[141].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F); // Box 712
		leftTrackWheelModels[141].setRotationPoint(-9F, 6.75F, 24F);

		leftTrackWheelModels[142].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 713
		leftTrackWheelModels[142].setRotationPoint(-13F, 2.75F, 24F);

		leftTrackWheelModels[143].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F); // Box 714
		leftTrackWheelModels[143].setRotationPoint(-7F, 2.75F, 24F);

		leftTrackWheelModels[144].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 715
		leftTrackWheelModels[144].setRotationPoint(-9F, 2.75F, 24F);

		leftTrackWheelModels[145].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 716
		leftTrackWheelModels[145].setRotationPoint(-9F, 0.75F, 24F);

		leftTrackWheelModels[146].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 717
		leftTrackWheelModels[146].setRotationPoint(-13F, 0.75F, 24F);

		leftTrackWheelModels[147].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,-1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 718
		leftTrackWheelModels[147].setRotationPoint(-13F, -0.25F, 24F);

		leftTrackWheelModels[148].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,-0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 719
		leftTrackWheelModels[148].setRotationPoint(-24F, 0.75F, 24F);

		leftTrackWheelModels[149].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,-0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F); // Box 720
		leftTrackWheelModels[149].setRotationPoint(-25F, 2.75F, 24F);

		leftTrackWheelModels[150].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 721
		leftTrackWheelModels[150].setRotationPoint(-24F, 2.75F, 24F);

		leftTrackWheelModels[151].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F); // Box 722
		leftTrackWheelModels[151].setRotationPoint(-24F, 6.75F, 24F);

		leftTrackWheelModels[152].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F); // Box 723
		leftTrackWheelModels[152].setRotationPoint(-22F, 8.75F, 24F);

		leftTrackWheelModels[153].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 724
		leftTrackWheelModels[153].setRotationPoint(-22F, 6.75F, 24F);

		leftTrackWheelModels[154].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F); // Box 725
		leftTrackWheelModels[154].setRotationPoint(-18F, 6.75F, 24F);

		leftTrackWheelModels[155].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 726
		leftTrackWheelModels[155].setRotationPoint(-22F, 2.75F, 24F);

		leftTrackWheelModels[156].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F); // Box 727
		leftTrackWheelModels[156].setRotationPoint(-16F, 2.75F, 24F);

		leftTrackWheelModels[157].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 728
		leftTrackWheelModels[157].setRotationPoint(-18F, 2.75F, 24F);

		leftTrackWheelModels[158].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 729
		leftTrackWheelModels[158].setRotationPoint(-18F, 0.75F, 24F);

		leftTrackWheelModels[159].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 730
		leftTrackWheelModels[159].setRotationPoint(-22F, 0.75F, 24F);

		leftTrackWheelModels[160].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,-1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 731
		leftTrackWheelModels[160].setRotationPoint(-22F, -0.25F, 24F);

		leftTrackWheelModels[161].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,-0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 732
		leftTrackWheelModels[161].setRotationPoint(-33F, 0.75F, 24F);

		leftTrackWheelModels[162].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,-0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F); // Box 733
		leftTrackWheelModels[162].setRotationPoint(-34F, 2.75F, 24F);

		leftTrackWheelModels[163].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 734
		leftTrackWheelModels[163].setRotationPoint(-33F, 2.75F, 24F);

		leftTrackWheelModels[164].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F); // Box 735
		leftTrackWheelModels[164].setRotationPoint(-33F, 6.75F, 24F);

		leftTrackWheelModels[165].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F); // Box 736
		leftTrackWheelModels[165].setRotationPoint(-31F, 8.75F, 24F);

		leftTrackWheelModels[166].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 737
		leftTrackWheelModels[166].setRotationPoint(-31F, 6.75F, 24F);

		leftTrackWheelModels[167].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F); // Box 738
		leftTrackWheelModels[167].setRotationPoint(-27F, 6.75F, 24F);

		leftTrackWheelModels[168].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 739
		leftTrackWheelModels[168].setRotationPoint(-31F, 2.75F, 24F);

		leftTrackWheelModels[169].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F); // Box 740
		leftTrackWheelModels[169].setRotationPoint(-25F, 2.75F, 24F);

		leftTrackWheelModels[170].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 741
		leftTrackWheelModels[170].setRotationPoint(-27F, 2.75F, 24F);

		leftTrackWheelModels[171].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 742
		leftTrackWheelModels[171].setRotationPoint(-27F, 0.75F, 24F);

		leftTrackWheelModels[172].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 743
		leftTrackWheelModels[172].setRotationPoint(-31F, 0.75F, 24F);

		leftTrackWheelModels[173].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,-1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 744
		leftTrackWheelModels[173].setRotationPoint(-31F, -0.25F, 24F);

		leftTrackWheelModels[174].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,-0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 745
		leftTrackWheelModels[174].setRotationPoint(-42F, 0.75F, 24F);

		leftTrackWheelModels[175].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,-0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F); // Box 746
		leftTrackWheelModels[175].setRotationPoint(-43F, 2.75F, 24F);

		leftTrackWheelModels[176].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 747
		leftTrackWheelModels[176].setRotationPoint(-42F, 2.75F, 24F);

		leftTrackWheelModels[177].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F); // Box 748
		leftTrackWheelModels[177].setRotationPoint(-42F, 6.75F, 24F);

		leftTrackWheelModels[178].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F); // Box 749
		leftTrackWheelModels[178].setRotationPoint(-40F, 8.75F, 24F);

		leftTrackWheelModels[179].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 750
		leftTrackWheelModels[179].setRotationPoint(-40F, 6.75F, 24F);

		leftTrackWheelModels[180].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F); // Box 751
		leftTrackWheelModels[180].setRotationPoint(-36F, 6.75F, 24F);

		leftTrackWheelModels[181].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 752
		leftTrackWheelModels[181].setRotationPoint(-40F, 2.75F, 24F);

		leftTrackWheelModels[182].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F); // Box 753
		leftTrackWheelModels[182].setRotationPoint(-34F, 2.75F, 24F);

		leftTrackWheelModels[183].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 754
		leftTrackWheelModels[183].setRotationPoint(-36F, 2.75F, 24F);

		leftTrackWheelModels[184].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 755
		leftTrackWheelModels[184].setRotationPoint(-36F, 0.75F, 24F);

		leftTrackWheelModels[185].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 756
		leftTrackWheelModels[185].setRotationPoint(-40F, 0.75F, 24F);

		leftTrackWheelModels[186].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,-1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 757
		leftTrackWheelModels[186].setRotationPoint(-40F, -0.25F, 24F);

		leftTrackWheelModels[187].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,-0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 758
		leftTrackWheelModels[187].setRotationPoint(-51F, 0.75F, 24F);

		leftTrackWheelModels[188].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,-0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F); // Box 759
		leftTrackWheelModels[188].setRotationPoint(-52F, 2.75F, 24F);

		leftTrackWheelModels[189].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 760
		leftTrackWheelModels[189].setRotationPoint(-51F, 2.75F, 24F);

		leftTrackWheelModels[190].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F); // Box 761
		leftTrackWheelModels[190].setRotationPoint(-51F, 6.75F, 24F);

		leftTrackWheelModels[191].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F); // Box 762
		leftTrackWheelModels[191].setRotationPoint(-49F, 8.75F, 24F);

		leftTrackWheelModels[192].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 763
		leftTrackWheelModels[192].setRotationPoint(-49F, 6.75F, 24F);

		leftTrackWheelModels[193].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F); // Box 764
		leftTrackWheelModels[193].setRotationPoint(-45F, 6.75F, 24F);

		leftTrackWheelModels[194].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 765
		leftTrackWheelModels[194].setRotationPoint(-49F, 2.75F, 24F);

		leftTrackWheelModels[195].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F); // Box 766
		leftTrackWheelModels[195].setRotationPoint(-43F, 2.75F, 24F);

		leftTrackWheelModels[196].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 767
		leftTrackWheelModels[196].setRotationPoint(-45F, 2.75F, 24F);

		leftTrackWheelModels[197].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 768
		leftTrackWheelModels[197].setRotationPoint(-45F, 0.75F, 24F);

		leftTrackWheelModels[198].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 769
		leftTrackWheelModels[198].setRotationPoint(-49F, 0.75F, 24F);

		leftTrackWheelModels[199].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,-1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 770
		leftTrackWheelModels[199].setRotationPoint(-49F, -0.25F, 24F);

		leftTrackWheelModels[200].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,-0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 771
		leftTrackWheelModels[200].setRotationPoint(-60F, 0.75F, 24F);

		leftTrackWheelModels[201].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,-0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F); // Box 772
		leftTrackWheelModels[201].setRotationPoint(-61F, 2.75F, 24F);

		leftTrackWheelModels[202].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 773
		leftTrackWheelModels[202].setRotationPoint(-60F, 2.75F, 24F);

		leftTrackWheelModels[203].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F); // Box 774
		leftTrackWheelModels[203].setRotationPoint(-60F, 6.75F, 24F);

		leftTrackWheelModels[204].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F); // Box 775
		leftTrackWheelModels[204].setRotationPoint(-58F, 8.75F, 24F);

		leftTrackWheelModels[205].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 776
		leftTrackWheelModels[205].setRotationPoint(-58F, 6.75F, 24F);

		leftTrackWheelModels[206].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F); // Box 777
		leftTrackWheelModels[206].setRotationPoint(-54F, 6.75F, 24F);

		leftTrackWheelModels[207].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 778
		leftTrackWheelModels[207].setRotationPoint(-58F, 2.75F, 24F);

		leftTrackWheelModels[208].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F); // Box 779
		leftTrackWheelModels[208].setRotationPoint(-52F, 2.75F, 24F);

		leftTrackWheelModels[209].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 780
		leftTrackWheelModels[209].setRotationPoint(-54F, 2.75F, 24F);

		leftTrackWheelModels[210].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 781
		leftTrackWheelModels[210].setRotationPoint(-54F, 0.75F, 24F);

		leftTrackWheelModels[211].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 782
		leftTrackWheelModels[211].setRotationPoint(-58F, 0.75F, 24F);

		leftTrackWheelModels[212].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,-1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 783
		leftTrackWheelModels[212].setRotationPoint(-58F, -0.25F, 24F);

		leftTrackWheelModels[213].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,-0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 784
		leftTrackWheelModels[213].setRotationPoint(-69F, 0.75F, 24F);

		leftTrackWheelModels[214].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,-0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F); // Box 785
		leftTrackWheelModels[214].setRotationPoint(-70F, 2.75F, 24F);

		leftTrackWheelModels[215].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 786
		leftTrackWheelModels[215].setRotationPoint(-69F, 2.75F, 24F);

		leftTrackWheelModels[216].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F); // Box 787
		leftTrackWheelModels[216].setRotationPoint(-69F, 6.75F, 24F);

		leftTrackWheelModels[217].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F); // Box 788
		leftTrackWheelModels[217].setRotationPoint(-67F, 8.75F, 24F);

		leftTrackWheelModels[218].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 789
		leftTrackWheelModels[218].setRotationPoint(-67F, 6.75F, 24F);

		leftTrackWheelModels[219].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F); // Box 790
		leftTrackWheelModels[219].setRotationPoint(-63F, 6.75F, 24F);

		leftTrackWheelModels[220].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 791
		leftTrackWheelModels[220].setRotationPoint(-67F, 2.75F, 24F);

		leftTrackWheelModels[221].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F); // Box 792
		leftTrackWheelModels[221].setRotationPoint(-61F, 2.75F, 24F);

		leftTrackWheelModels[222].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 793
		leftTrackWheelModels[222].setRotationPoint(-63F, 2.75F, 24F);

		leftTrackWheelModels[223].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 794
		leftTrackWheelModels[223].setRotationPoint(-63F, 0.75F, 24F);

		leftTrackWheelModels[224].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 795
		leftTrackWheelModels[224].setRotationPoint(-67F, 0.75F, 24F);

		leftTrackWheelModels[225].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,-1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 796
		leftTrackWheelModels[225].setRotationPoint(-67F, -0.25F, 24F);

		leftTrackWheelModels[226].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,-0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 797
		leftTrackWheelModels[226].setRotationPoint(-78F, 0.75F, 24F);

		leftTrackWheelModels[227].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,-0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F); // Box 798
		leftTrackWheelModels[227].setRotationPoint(-79F, 2.75F, 24F);

		leftTrackWheelModels[228].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 799
		leftTrackWheelModels[228].setRotationPoint(-78F, 2.75F, 24F);

		leftTrackWheelModels[229].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F); // Box 800
		leftTrackWheelModels[229].setRotationPoint(-78F, 6.75F, 24F);

		leftTrackWheelModels[230].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F); // Box 801
		leftTrackWheelModels[230].setRotationPoint(-76F, 8.75F, 24F);

		leftTrackWheelModels[231].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 802
		leftTrackWheelModels[231].setRotationPoint(-76F, 6.75F, 24F);

		leftTrackWheelModels[232].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F); // Box 803
		leftTrackWheelModels[232].setRotationPoint(-72F, 6.75F, 24F);

		leftTrackWheelModels[233].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 804
		leftTrackWheelModels[233].setRotationPoint(-76F, 2.75F, 24F);

		leftTrackWheelModels[234].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F); // Box 805
		leftTrackWheelModels[234].setRotationPoint(-70F, 2.75F, 24F);

		leftTrackWheelModels[235].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 806
		leftTrackWheelModels[235].setRotationPoint(-72F, 2.75F, 24F);

		leftTrackWheelModels[236].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 807
		leftTrackWheelModels[236].setRotationPoint(-72F, 0.75F, 24F);

		leftTrackWheelModels[237].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 808
		leftTrackWheelModels[237].setRotationPoint(-76F, 0.75F, 24F);

		leftTrackWheelModels[238].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,-1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 809
		leftTrackWheelModels[238].setRotationPoint(-76F, -0.25F, 24F);

		leftTrackWheelModels[239].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 810
		leftTrackWheelModels[239].setRotationPoint(37F, -8F, 24F);

		leftTrackWheelModels[240].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F); // Box 811
		leftTrackWheelModels[240].setRotationPoint(40F, -8F, 24F);

		leftTrackWheelModels[241].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,-1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 812
		leftTrackWheelModels[241].setRotationPoint(37F, -9F, 24F);

		leftTrackWheelModels[242].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,-0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F); // Box 813
		leftTrackWheelModels[242].setRotationPoint(36F, -8F, 24F);

		leftTrackWheelModels[243].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 814
		leftTrackWheelModels[243].setRotationPoint(37F, -5F, 24F);

		leftTrackWheelModels[244].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 815
		leftTrackWheelModels[244].setRotationPoint(19F, -8F, 24F);

		leftTrackWheelModels[245].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F); // Box 816
		leftTrackWheelModels[245].setRotationPoint(22F, -8F, 24F);

		leftTrackWheelModels[246].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,-1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 817
		leftTrackWheelModels[246].setRotationPoint(19F, -9F, 24F);

		leftTrackWheelModels[247].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,-0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F); // Box 818
		leftTrackWheelModels[247].setRotationPoint(18F, -8F, 24F);

		leftTrackWheelModels[248].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 819
		leftTrackWheelModels[248].setRotationPoint(19F, -5F, 24F);

		leftTrackWheelModels[249].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 820
		leftTrackWheelModels[249].setRotationPoint(1F, -8F, 24F);

		leftTrackWheelModels[250].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F); // Box 821
		leftTrackWheelModels[250].setRotationPoint(4F, -8F, 24F);

		leftTrackWheelModels[251].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,-1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 822
		leftTrackWheelModels[251].setRotationPoint(1F, -9F, 24F);

		leftTrackWheelModels[252].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,-0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F); // Box 823
		leftTrackWheelModels[252].setRotationPoint(0F, -8F, 24F);

		leftTrackWheelModels[253].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 824
		leftTrackWheelModels[253].setRotationPoint(1F, -5F, 24F);

		leftTrackWheelModels[254].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 825
		leftTrackWheelModels[254].setRotationPoint(-17F, -8F, 24F);

		leftTrackWheelModels[255].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F); // Box 826
		leftTrackWheelModels[255].setRotationPoint(-14F, -8F, 24F);

		leftTrackWheelModels[256].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,-1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 827
		leftTrackWheelModels[256].setRotationPoint(-17F, -9F, 24F);

		leftTrackWheelModels[257].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,-0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F); // Box 828
		leftTrackWheelModels[257].setRotationPoint(-18F, -8F, 24F);

		leftTrackWheelModels[258].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 829
		leftTrackWheelModels[258].setRotationPoint(-17F, -5F, 24F);

		leftTrackWheelModels[259].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 830
		leftTrackWheelModels[259].setRotationPoint(-35F, -8F, 24F);

		leftTrackWheelModels[260].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F); // Box 831
		leftTrackWheelModels[260].setRotationPoint(-32F, -8F, 24F);

		leftTrackWheelModels[261].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,-1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 832
		leftTrackWheelModels[261].setRotationPoint(-35F, -9F, 24F);

		leftTrackWheelModels[262].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,-0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F); // Box 833
		leftTrackWheelModels[262].setRotationPoint(-36F, -8F, 24F);

		leftTrackWheelModels[263].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 834
		leftTrackWheelModels[263].setRotationPoint(-35F, -5F, 24F);

		leftTrackWheelModels[264].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 835
		leftTrackWheelModels[264].setRotationPoint(-53F, -8F, 24F);

		leftTrackWheelModels[265].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F); // Box 836
		leftTrackWheelModels[265].setRotationPoint(-50F, -8F, 24F);

		leftTrackWheelModels[266].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,-1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 837
		leftTrackWheelModels[266].setRotationPoint(-53F, -9F, 24F);

		leftTrackWheelModels[267].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,-0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F); // Box 838
		leftTrackWheelModels[267].setRotationPoint(-54F, -8F, 24F);

		leftTrackWheelModels[268].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 839
		leftTrackWheelModels[268].setRotationPoint(-53F, -5F, 24F);

		leftTrackWheelModels[269].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F); // Box 840
		leftTrackWheelModels[269].setRotationPoint(-68F, -8F, 24F);

		leftTrackWheelModels[270].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 841
		leftTrackWheelModels[270].setRotationPoint(-71F, -5F, 24F);

		leftTrackWheelModels[271].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 842
		leftTrackWheelModels[271].setRotationPoint(-71F, -8F, 24F);

		leftTrackWheelModels[272].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,-0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F); // Box 843
		leftTrackWheelModels[272].setRotationPoint(-72F, -8F, 24F);

		leftTrackWheelModels[273].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,-1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 844
		leftTrackWheelModels[273].setRotationPoint(-71F, -9F, 24F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 270
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 271
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 272
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 513, 57, textureX, textureY); // Box 273
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 545, 57, textureX, textureY); // Box 274
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 577, 57, textureX, textureY); // Box 275
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 609, 57, textureX, textureY); // Box 276
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 641, 57, textureX, textureY); // Box 277
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 673, 57, textureX, textureY); // Box 278
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 705, 57, textureX, textureY); // Box 279
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 737, 57, textureX, textureY); // Box 280
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 769, 57, textureX, textureY); // Box 281
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 801, 57, textureX, textureY); // Box 282
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 833, 57, textureX, textureY); // Box 283
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 865, 57, textureX, textureY); // Box 284
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 905, 57, textureX, textureY); // Box 285
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 937, 57, textureX, textureY); // Box 286
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 969, 57, textureX, textureY); // Box 287
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 1001, 57, textureX, textureY); // Box 288
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 1033, 57, textureX, textureY); // Box 289
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 1081, 57, textureX, textureY); // Box 290
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 1121, 57, textureX, textureY); // Box 291
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 1161, 57, textureX, textureY); // Box 292
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 1193, 57, textureX, textureY); // Box 293
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 1225, 57, textureX, textureY); // Box 294
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 1257, 57, textureX, textureY); // Box 295
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 1289, 57, textureX, textureY); // Box 296
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 1321, 57, textureX, textureY); // Box 297
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 1353, 57, textureX, textureY); // Box 298
		rightTrackWheelModels[29] = new ModelRendererTurbo(this, 1401, 57, textureX, textureY); // Box 299
		rightTrackWheelModels[30] = new ModelRendererTurbo(this, 1433, 57, textureX, textureY); // Box 300
		rightTrackWheelModels[31] = new ModelRendererTurbo(this, 1465, 57, textureX, textureY); // Box 301
		rightTrackWheelModels[32] = new ModelRendererTurbo(this, 1497, 57, textureX, textureY); // Box 302
		rightTrackWheelModels[33] = new ModelRendererTurbo(this, 1529, 57, textureX, textureY); // Box 303
		rightTrackWheelModels[34] = new ModelRendererTurbo(this, 1561, 57, textureX, textureY); // Box 304
		rightTrackWheelModels[35] = new ModelRendererTurbo(this, 1593, 57, textureX, textureY); // Box 305
		rightTrackWheelModels[36] = new ModelRendererTurbo(this, 1625, 57, textureX, textureY); // Box 306
		rightTrackWheelModels[37] = new ModelRendererTurbo(this, 1657, 57, textureX, textureY); // Box 307
		rightTrackWheelModels[38] = new ModelRendererTurbo(this, 1689, 57, textureX, textureY); // Box 308
		rightTrackWheelModels[39] = new ModelRendererTurbo(this, 1721, 57, textureX, textureY); // Box 309
		rightTrackWheelModels[40] = new ModelRendererTurbo(this, 1753, 57, textureX, textureY); // Box 310
		rightTrackWheelModels[41] = new ModelRendererTurbo(this, 1785, 57, textureX, textureY); // Box 311
		rightTrackWheelModels[42] = new ModelRendererTurbo(this, 1817, 57, textureX, textureY); // Box 312
		rightTrackWheelModels[43] = new ModelRendererTurbo(this, 1849, 57, textureX, textureY); // Box 313
		rightTrackWheelModels[44] = new ModelRendererTurbo(this, 1881, 57, textureX, textureY); // Box 314
		rightTrackWheelModels[45] = new ModelRendererTurbo(this, 1913, 57, textureX, textureY); // Box 315
		rightTrackWheelModels[46] = new ModelRendererTurbo(this, 1945, 57, textureX, textureY); // Box 316
		rightTrackWheelModels[47] = new ModelRendererTurbo(this, 1977, 57, textureX, textureY); // Box 317
		rightTrackWheelModels[48] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 318
		rightTrackWheelModels[49] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 319
		rightTrackWheelModels[50] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 320
		rightTrackWheelModels[51] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 321
		rightTrackWheelModels[52] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 322
		rightTrackWheelModels[53] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 323
		rightTrackWheelModels[54] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 324
		rightTrackWheelModels[55] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 325
		rightTrackWheelModels[56] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 326
		rightTrackWheelModels[57] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 327
		rightTrackWheelModels[58] = new ModelRendererTurbo(this, 529, 65, textureX, textureY); // Box 328
		rightTrackWheelModels[59] = new ModelRendererTurbo(this, 561, 65, textureX, textureY); // Box 329
		rightTrackWheelModels[60] = new ModelRendererTurbo(this, 593, 65, textureX, textureY); // Box 330
		rightTrackWheelModels[61] = new ModelRendererTurbo(this, 817, 81, textureX, textureY); // Box 392
		rightTrackWheelModels[62] = new ModelRendererTurbo(this, 1385, 73, textureX, textureY); // Box 393
		rightTrackWheelModels[63] = new ModelRendererTurbo(this, 1409, 81, textureX, textureY); // Box 394
		rightTrackWheelModels[64] = new ModelRendererTurbo(this, 2009, 73, textureX, textureY); // Box 395
		rightTrackWheelModels[65] = new ModelRendererTurbo(this, 1193, 73, textureX, textureY); // Box 396
		rightTrackWheelModels[66] = new ModelRendererTurbo(this, 1225, 73, textureX, textureY); // Box 397
		rightTrackWheelModels[67] = new ModelRendererTurbo(this, 1257, 73, textureX, textureY); // Box 398
		rightTrackWheelModels[68] = new ModelRendererTurbo(this, 1289, 73, textureX, textureY); // Box 399
		rightTrackWheelModels[69] = new ModelRendererTurbo(this, 1321, 73, textureX, textureY); // Box 400
		rightTrackWheelModels[70] = new ModelRendererTurbo(this, 1353, 73, textureX, textureY); // Box 401
		rightTrackWheelModels[71] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 402
		rightTrackWheelModels[72] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 403
		rightTrackWheelModels[73] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 413
		rightTrackWheelModels[74] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 414
		rightTrackWheelModels[75] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 415
		rightTrackWheelModels[76] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 416
		rightTrackWheelModels[77] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 417
		rightTrackWheelModels[78] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 419
		rightTrackWheelModels[79] = new ModelRendererTurbo(this, 561, 81, textureX, textureY); // Box 427
		rightTrackWheelModels[80] = new ModelRendererTurbo(this, 593, 81, textureX, textureY); // Box 428
		rightTrackWheelModels[81] = new ModelRendererTurbo(this, 625, 81, textureX, textureY); // Box 429
		rightTrackWheelModels[82] = new ModelRendererTurbo(this, 657, 81, textureX, textureY); // Box 430
		rightTrackWheelModels[83] = new ModelRendererTurbo(this, 689, 81, textureX, textureY); // Box 431
		rightTrackWheelModels[84] = new ModelRendererTurbo(this, 721, 81, textureX, textureY); // Box 432
		rightTrackWheelModels[85] = new ModelRendererTurbo(this, 753, 81, textureX, textureY); // Box 433
		rightTrackWheelModels[86] = new ModelRendererTurbo(this, 1465, 145, textureX, textureY); // Box 845
		rightTrackWheelModels[87] = new ModelRendererTurbo(this, 1505, 145, textureX, textureY); // Box 846
		rightTrackWheelModels[88] = new ModelRendererTurbo(this, 1745, 145, textureX, textureY); // Box 847
		rightTrackWheelModels[89] = new ModelRendererTurbo(this, 1633, 145, textureX, textureY); // Box 848
		rightTrackWheelModels[90] = new ModelRendererTurbo(this, 1841, 145, textureX, textureY); // Box 849
		rightTrackWheelModels[91] = new ModelRendererTurbo(this, 1889, 145, textureX, textureY); // Box 850
		rightTrackWheelModels[92] = new ModelRendererTurbo(this, 185, 153, textureX, textureY); // Box 851
		rightTrackWheelModels[93] = new ModelRendererTurbo(this, 369, 153, textureX, textureY); // Box 852
		rightTrackWheelModels[94] = new ModelRendererTurbo(this, 401, 153, textureX, textureY); // Box 853
		rightTrackWheelModels[95] = new ModelRendererTurbo(this, 1065, 145, textureX, textureY); // Box 854
		rightTrackWheelModels[96] = new ModelRendererTurbo(this, 1097, 145, textureX, textureY); // Box 855
		rightTrackWheelModels[97] = new ModelRendererTurbo(this, 433, 153, textureX, textureY); // Box 856
		rightTrackWheelModels[98] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Box 857
		rightTrackWheelModels[99] = new ModelRendererTurbo(this, 601, 153, textureX, textureY); // Box 858
		rightTrackWheelModels[100] = new ModelRendererTurbo(this, 665, 153, textureX, textureY); // Box 859
		rightTrackWheelModels[101] = new ModelRendererTurbo(this, 785, 153, textureX, textureY); // Box 860
		rightTrackWheelModels[102] = new ModelRendererTurbo(this, 969, 153, textureX, textureY); // Box 861
		rightTrackWheelModels[103] = new ModelRendererTurbo(this, 1209, 145, textureX, textureY); // Box 862
		rightTrackWheelModels[104] = new ModelRendererTurbo(this, 1153, 153, textureX, textureY); // Box 863
		rightTrackWheelModels[105] = new ModelRendererTurbo(this, 1233, 153, textureX, textureY); // Box 864
		rightTrackWheelModels[106] = new ModelRendererTurbo(this, 1305, 153, textureX, textureY); // Box 865
		rightTrackWheelModels[107] = new ModelRendererTurbo(this, 1345, 153, textureX, textureY); // Box 866
		rightTrackWheelModels[108] = new ModelRendererTurbo(this, 1401, 153, textureX, textureY); // Box 867
		rightTrackWheelModels[109] = new ModelRendererTurbo(this, 1561, 145, textureX, textureY); // Box 868
		rightTrackWheelModels[110] = new ModelRendererTurbo(this, 1585, 153, textureX, textureY); // Box 869
		rightTrackWheelModels[111] = new ModelRendererTurbo(this, 1665, 153, textureX, textureY); // Box 870
		rightTrackWheelModels[112] = new ModelRendererTurbo(this, 1705, 145, textureX, textureY); // Box 871
		rightTrackWheelModels[113] = new ModelRendererTurbo(this, 1721, 153, textureX, textureY); // Box 872
		rightTrackWheelModels[114] = new ModelRendererTurbo(this, 1777, 153, textureX, textureY); // Box 873
		rightTrackWheelModels[115] = new ModelRendererTurbo(this, 1937, 145, textureX, textureY); // Box 874
		rightTrackWheelModels[116] = new ModelRendererTurbo(this, 529, 153, textureX, textureY); // Box 875
		rightTrackWheelModels[117] = new ModelRendererTurbo(this, 833, 153, textureX, textureY); // Box 876
		rightTrackWheelModels[118] = new ModelRendererTurbo(this, 1017, 153, textureX, textureY); // Box 877
		rightTrackWheelModels[119] = new ModelRendererTurbo(this, 1809, 153, textureX, textureY); // Box 878
		rightTrackWheelModels[120] = new ModelRendererTurbo(this, 1873, 153, textureX, textureY); // Box 879
		rightTrackWheelModels[121] = new ModelRendererTurbo(this, 1913, 153, textureX, textureY); // Box 880
		rightTrackWheelModels[122] = new ModelRendererTurbo(this, 1953, 153, textureX, textureY); // Box 881
		rightTrackWheelModels[123] = new ModelRendererTurbo(this, 1985, 153, textureX, textureY); // Box 882
		rightTrackWheelModels[124] = new ModelRendererTurbo(this, 2017, 153, textureX, textureY); // Box 883
		rightTrackWheelModels[125] = new ModelRendererTurbo(this, 1537, 153, textureX, textureY); // Box 884
		rightTrackWheelModels[126] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 885
		rightTrackWheelModels[127] = new ModelRendererTurbo(this, 33, 161, textureX, textureY); // Box 886
		rightTrackWheelModels[128] = new ModelRendererTurbo(this, 113, 153, textureX, textureY); // Box 887
		rightTrackWheelModels[129] = new ModelRendererTurbo(this, 233, 153, textureX, textureY); // Box 888
		rightTrackWheelModels[130] = new ModelRendererTurbo(this, 65, 161, textureX, textureY); // Box 889
		rightTrackWheelModels[131] = new ModelRendererTurbo(this, 97, 161, textureX, textureY); // Box 890
		rightTrackWheelModels[132] = new ModelRendererTurbo(this, 137, 161, textureX, textureY); // Box 891
		rightTrackWheelModels[133] = new ModelRendererTurbo(this, 169, 161, textureX, textureY); // Box 892
		rightTrackWheelModels[134] = new ModelRendererTurbo(this, 209, 161, textureX, textureY); // Box 893
		rightTrackWheelModels[135] = new ModelRendererTurbo(this, 257, 161, textureX, textureY); // Box 894
		rightTrackWheelModels[136] = new ModelRendererTurbo(this, 289, 161, textureX, textureY); // Box 895
		rightTrackWheelModels[137] = new ModelRendererTurbo(this, 321, 161, textureX, textureY); // Box 896
		rightTrackWheelModels[138] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Box 897
		rightTrackWheelModels[139] = new ModelRendererTurbo(this, 505, 161, textureX, textureY); // Box 898
		rightTrackWheelModels[140] = new ModelRendererTurbo(this, 545, 161, textureX, textureY); // Box 899
		rightTrackWheelModels[141] = new ModelRendererTurbo(this, 577, 161, textureX, textureY); // Box 900
		rightTrackWheelModels[142] = new ModelRendererTurbo(this, 633, 161, textureX, textureY); // Box 901
		rightTrackWheelModels[143] = new ModelRendererTurbo(this, 697, 161, textureX, textureY); // Box 902
		rightTrackWheelModels[144] = new ModelRendererTurbo(this, 729, 161, textureX, textureY); // Box 903
		rightTrackWheelModels[145] = new ModelRendererTurbo(this, 753, 161, textureX, textureY); // Box 904
		rightTrackWheelModels[146] = new ModelRendererTurbo(this, 809, 161, textureX, textureY); // Box 905
		rightTrackWheelModels[147] = new ModelRendererTurbo(this, 849, 161, textureX, textureY); // Box 906
		rightTrackWheelModels[148] = new ModelRendererTurbo(this, 881, 161, textureX, textureY); // Box 907
		rightTrackWheelModels[149] = new ModelRendererTurbo(this, 913, 161, textureX, textureY); // Box 908
		rightTrackWheelModels[150] = new ModelRendererTurbo(this, 1033, 161, textureX, textureY); // Box 909
		rightTrackWheelModels[151] = new ModelRendererTurbo(this, 945, 161, textureX, textureY); // Box 910
		rightTrackWheelModels[152] = new ModelRendererTurbo(this, 1001, 161, textureX, textureY); // Box 911
		rightTrackWheelModels[153] = new ModelRendererTurbo(this, 1081, 161, textureX, textureY); // Box 912
		rightTrackWheelModels[154] = new ModelRendererTurbo(this, 1113, 161, textureX, textureY); // Box 913
		rightTrackWheelModels[155] = new ModelRendererTurbo(this, 1177, 161, textureX, textureY); // Box 914
		rightTrackWheelModels[156] = new ModelRendererTurbo(this, 1265, 161, textureX, textureY); // Box 915
		rightTrackWheelModels[157] = new ModelRendererTurbo(this, 1369, 161, textureX, textureY); // Box 916
		rightTrackWheelModels[158] = new ModelRendererTurbo(this, 1433, 161, textureX, textureY); // Box 917
		rightTrackWheelModels[159] = new ModelRendererTurbo(this, 1497, 161, textureX, textureY); // Box 918
		rightTrackWheelModels[160] = new ModelRendererTurbo(this, 1609, 161, textureX, textureY); // Box 919
		rightTrackWheelModels[161] = new ModelRendererTurbo(this, 1745, 161, textureX, textureY); // Box 920
		rightTrackWheelModels[162] = new ModelRendererTurbo(this, 1705, 161, textureX, textureY); // Box 921
		rightTrackWheelModels[163] = new ModelRendererTurbo(this, 1889, 161, textureX, textureY); // Box 922
		rightTrackWheelModels[164] = new ModelRendererTurbo(this, 1825, 161, textureX, textureY); // Box 923
		rightTrackWheelModels[165] = new ModelRendererTurbo(this, 1929, 161, textureX, textureY); // Box 924
		rightTrackWheelModels[166] = new ModelRendererTurbo(this, 81, 169, textureX, textureY); // Box 925
		rightTrackWheelModels[167] = new ModelRendererTurbo(this, 113, 169, textureX, textureY); // Box 926
		rightTrackWheelModels[168] = new ModelRendererTurbo(this, 185, 169, textureX, textureY); // Box 927
		rightTrackWheelModels[169] = new ModelRendererTurbo(this, 153, 169, textureX, textureY); // Box 928
		rightTrackWheelModels[170] = new ModelRendererTurbo(this, 233, 169, textureX, textureY); // Box 929
		rightTrackWheelModels[171] = new ModelRendererTurbo(this, 305, 169, textureX, textureY); // Box 930
		rightTrackWheelModels[172] = new ModelRendererTurbo(this, 369, 169, textureX, textureY); // Box 931
		rightTrackWheelModels[173] = new ModelRendererTurbo(this, 401, 169, textureX, textureY); // Box 932
		rightTrackWheelModels[174] = new ModelRendererTurbo(this, 433, 169, textureX, textureY); // Box 933
		rightTrackWheelModels[175] = new ModelRendererTurbo(this, 465, 169, textureX, textureY); // Box 934
		rightTrackWheelModels[176] = new ModelRendererTurbo(this, 521, 169, textureX, textureY); // Box 935
		rightTrackWheelModels[177] = new ModelRendererTurbo(this, 561, 169, textureX, textureY); // Box 936
		rightTrackWheelModels[178] = new ModelRendererTurbo(this, 601, 169, textureX, textureY); // Box 937
		rightTrackWheelModels[179] = new ModelRendererTurbo(this, 657, 169, textureX, textureY); // Box 938
		rightTrackWheelModels[180] = new ModelRendererTurbo(this, 769, 169, textureX, textureY); // Box 939
		rightTrackWheelModels[181] = new ModelRendererTurbo(this, 825, 169, textureX, textureY); // Box 940
		rightTrackWheelModels[182] = new ModelRendererTurbo(this, 713, 169, textureX, textureY); // Box 941
		rightTrackWheelModels[183] = new ModelRendererTurbo(this, 929, 169, textureX, textureY); // Box 942
		rightTrackWheelModels[184] = new ModelRendererTurbo(this, 1017, 169, textureX, textureY); // Box 943
		rightTrackWheelModels[185] = new ModelRendererTurbo(this, 1057, 169, textureX, textureY); // Box 944
		rightTrackWheelModels[186] = new ModelRendererTurbo(this, 1137, 169, textureX, textureY); // Box 945
		rightTrackWheelModels[187] = new ModelRendererTurbo(this, 1201, 169, textureX, textureY); // Box 946
		rightTrackWheelModels[188] = new ModelRendererTurbo(this, 1097, 169, textureX, textureY); // Box 947
		rightTrackWheelModels[189] = new ModelRendererTurbo(this, 1233, 169, textureX, textureY); // Box 948
		rightTrackWheelModels[190] = new ModelRendererTurbo(this, 1281, 169, textureX, textureY); // Box 949
		rightTrackWheelModels[191] = new ModelRendererTurbo(this, 1305, 169, textureX, textureY); // Box 950
		rightTrackWheelModels[192] = new ModelRendererTurbo(this, 1337, 169, textureX, textureY); // Box 951
		rightTrackWheelModels[193] = new ModelRendererTurbo(this, 1449, 169, textureX, textureY); // Box 952
		rightTrackWheelModels[194] = new ModelRendererTurbo(this, 1513, 169, textureX, textureY); // Box 953
		rightTrackWheelModels[195] = new ModelRendererTurbo(this, 1385, 169, textureX, textureY); // Box 954
		rightTrackWheelModels[196] = new ModelRendererTurbo(this, 1481, 169, textureX, textureY); // Box 955
		rightTrackWheelModels[197] = new ModelRendererTurbo(this, 1545, 169, textureX, textureY); // Box 956
		rightTrackWheelModels[198] = new ModelRendererTurbo(this, 1577, 169, textureX, textureY); // Box 957
		rightTrackWheelModels[199] = new ModelRendererTurbo(this, 1633, 169, textureX, textureY); // Box 958
		rightTrackWheelModels[200] = new ModelRendererTurbo(this, 1721, 169, textureX, textureY); // Box 959
		rightTrackWheelModels[201] = new ModelRendererTurbo(this, 1769, 169, textureX, textureY); // Box 960
		rightTrackWheelModels[202] = new ModelRendererTurbo(this, 1801, 169, textureX, textureY); // Box 961
		rightTrackWheelModels[203] = new ModelRendererTurbo(this, 1841, 169, textureX, textureY); // Box 962
		rightTrackWheelModels[204] = new ModelRendererTurbo(this, 1865, 169, textureX, textureY); // Box 963
		rightTrackWheelModels[205] = new ModelRendererTurbo(this, 1913, 169, textureX, textureY); // Box 964
		rightTrackWheelModels[206] = new ModelRendererTurbo(this, 1945, 169, textureX, textureY); // Box 965
		rightTrackWheelModels[207] = new ModelRendererTurbo(this, 1977, 169, textureX, textureY); // Box 966
		rightTrackWheelModels[208] = new ModelRendererTurbo(this, 2009, 169, textureX, textureY); // Box 967
		rightTrackWheelModels[209] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 968
		rightTrackWheelModels[210] = new ModelRendererTurbo(this, 25, 177, textureX, textureY); // Box 969
		rightTrackWheelModels[211] = new ModelRendererTurbo(this, 57, 177, textureX, textureY); // Box 970
		rightTrackWheelModels[212] = new ModelRendererTurbo(this, 209, 177, textureX, textureY); // Box 971
		rightTrackWheelModels[213] = new ModelRendererTurbo(this, 249, 177, textureX, textureY); // Box 972
		rightTrackWheelModels[214] = new ModelRendererTurbo(this, 97, 177, textureX, textureY); // Box 973
		rightTrackWheelModels[215] = new ModelRendererTurbo(this, 281, 177, textureX, textureY); // Box 974
		rightTrackWheelModels[216] = new ModelRendererTurbo(this, 137, 177, textureX, textureY); // Box 975
		rightTrackWheelModels[217] = new ModelRendererTurbo(this, 169, 177, textureX, textureY); // Box 976
		rightTrackWheelModels[218] = new ModelRendererTurbo(this, 321, 177, textureX, textureY); // Box 977
		rightTrackWheelModels[219] = new ModelRendererTurbo(this, 481, 177, textureX, textureY); // Box 978
		rightTrackWheelModels[220] = new ModelRendererTurbo(this, 577, 177, textureX, textureY); // Box 979
		rightTrackWheelModels[221] = new ModelRendererTurbo(this, 353, 177, textureX, textureY); // Box 980
		rightTrackWheelModels[222] = new ModelRendererTurbo(this, 385, 177, textureX, textureY); // Box 981
		rightTrackWheelModels[223] = new ModelRendererTurbo(this, 545, 177, textureX, textureY); // Box 982
		rightTrackWheelModels[224] = new ModelRendererTurbo(this, 617, 177, textureX, textureY); // Box 983
		rightTrackWheelModels[225] = new ModelRendererTurbo(this, 673, 177, textureX, textureY); // Box 984
		rightTrackWheelModels[226] = new ModelRendererTurbo(this, 729, 177, textureX, textureY); // Box 985
		rightTrackWheelModels[227] = new ModelRendererTurbo(this, 793, 177, textureX, textureY); // Box 986
		rightTrackWheelModels[228] = new ModelRendererTurbo(this, 849, 177, textureX, textureY); // Box 987
		rightTrackWheelModels[229] = new ModelRendererTurbo(this, 881, 177, textureX, textureY); // Box 988
		rightTrackWheelModels[230] = new ModelRendererTurbo(this, 905, 177, textureX, textureY); // Box 989
		rightTrackWheelModels[231] = new ModelRendererTurbo(this, 945, 177, textureX, textureY); // Box 990
		rightTrackWheelModels[232] = new ModelRendererTurbo(this, 977, 177, textureX, textureY); // Box 991
		rightTrackWheelModels[233] = new ModelRendererTurbo(this, 1033, 177, textureX, textureY); // Box 992
		rightTrackWheelModels[234] = new ModelRendererTurbo(this, 1073, 177, textureX, textureY); // Box 993
		rightTrackWheelModels[235] = new ModelRendererTurbo(this, 1113, 177, textureX, textureY); // Box 994
		rightTrackWheelModels[236] = new ModelRendererTurbo(this, 1161, 177, textureX, textureY); // Box 995
		rightTrackWheelModels[237] = new ModelRendererTurbo(this, 1257, 177, textureX, textureY); // Box 996
		rightTrackWheelModels[238] = new ModelRendererTurbo(this, 1353, 177, textureX, textureY); // Box 997
		rightTrackWheelModels[239] = new ModelRendererTurbo(this, 1401, 177, textureX, textureY); // Box 998
		rightTrackWheelModels[240] = new ModelRendererTurbo(this, 1321, 177, textureX, textureY); // Box 999
		rightTrackWheelModels[241] = new ModelRendererTurbo(this, 1593, 177, textureX, textureY); // Box 1000
		rightTrackWheelModels[242] = new ModelRendererTurbo(this, 1433, 177, textureX, textureY); // Box 1001
		rightTrackWheelModels[243] = new ModelRendererTurbo(this, 1497, 177, textureX, textureY); // Box 1002
		rightTrackWheelModels[244] = new ModelRendererTurbo(this, 1561, 177, textureX, textureY); // Box 1003
		rightTrackWheelModels[245] = new ModelRendererTurbo(this, 1657, 177, textureX, textureY); // Box 1004
		rightTrackWheelModels[246] = new ModelRendererTurbo(this, 1689, 177, textureX, textureY); // Box 1005
		rightTrackWheelModels[247] = new ModelRendererTurbo(this, 1745, 177, textureX, textureY); // Box 1006
		rightTrackWheelModels[248] = new ModelRendererTurbo(this, 1785, 177, textureX, textureY); // Box 1007
		rightTrackWheelModels[249] = new ModelRendererTurbo(this, 1825, 177, textureX, textureY); // Box 1008
		rightTrackWheelModels[250] = new ModelRendererTurbo(this, 1881, 177, textureX, textureY); // Box 1009
		rightTrackWheelModels[251] = new ModelRendererTurbo(this, 73, 185, textureX, textureY); // Box 1010
		rightTrackWheelModels[252] = new ModelRendererTurbo(this, 113, 185, textureX, textureY); // Box 1011
		rightTrackWheelModels[253] = new ModelRendererTurbo(this, 1929, 177, textureX, textureY); // Box 1012
		rightTrackWheelModels[254] = new ModelRendererTurbo(this, 185, 185, textureX, textureY); // Box 1013
		rightTrackWheelModels[255] = new ModelRendererTurbo(this, 2025, 177, textureX, textureY); // Box 1014
		rightTrackWheelModels[256] = new ModelRendererTurbo(this, 41, 185, textureX, textureY); // Box 1015
		rightTrackWheelModels[257] = new ModelRendererTurbo(this, 153, 185, textureX, textureY); // Box 1016
		rightTrackWheelModels[258] = new ModelRendererTurbo(this, 401, 185, textureX, textureY); // Box 1017
		rightTrackWheelModels[259] = new ModelRendererTurbo(this, 433, 185, textureX, textureY); // Box 1018
		rightTrackWheelModels[260] = new ModelRendererTurbo(this, 233, 185, textureX, textureY); // Box 1019
		rightTrackWheelModels[261] = new ModelRendererTurbo(this, 305, 185, textureX, textureY); // Box 1020
		rightTrackWheelModels[262] = new ModelRendererTurbo(this, 337, 185, textureX, textureY); // Box 1021
		rightTrackWheelModels[263] = new ModelRendererTurbo(this, 369, 185, textureX, textureY); // Box 1022
		rightTrackWheelModels[264] = new ModelRendererTurbo(this, 505, 185, textureX, textureY); // Box 1023
		rightTrackWheelModels[265] = new ModelRendererTurbo(this, 633, 185, textureX, textureY); // Box 1024
		rightTrackWheelModels[266] = new ModelRendererTurbo(this, 465, 185, textureX, textureY); // Box 1025
		rightTrackWheelModels[267] = new ModelRendererTurbo(this, 697, 185, textureX, textureY); // Box 1026
		rightTrackWheelModels[268] = new ModelRendererTurbo(this, 561, 185, textureX, textureY); // Box 1027
		rightTrackWheelModels[269] = new ModelRendererTurbo(this, 601, 185, textureX, textureY); // Box 1028
		rightTrackWheelModels[270] = new ModelRendererTurbo(this, 753, 185, textureX, textureY); // Box 1029
		rightTrackWheelModels[271] = new ModelRendererTurbo(this, 809, 185, textureX, textureY); // Box 1030
		rightTrackWheelModels[272] = new ModelRendererTurbo(this, 921, 185, textureX, textureY); // Box 1031
		rightTrackWheelModels[273] = new ModelRendererTurbo(this, 961, 185, textureX, textureY); // Box 1032
		rightTrackWheelModels[274] = new ModelRendererTurbo(this, 1001, 185, textureX, textureY); // Box 1033
		rightTrackWheelModels[275] = new ModelRendererTurbo(this, 1057, 185, textureX, textureY); // Box 1034
		rightTrackWheelModels[276] = new ModelRendererTurbo(this, 1089, 185, textureX, textureY); // Box 1035
		rightTrackWheelModels[277] = new ModelRendererTurbo(this, 1129, 185, textureX, textureY); // Box 1036
		rightTrackWheelModels[278] = new ModelRendererTurbo(this, 1177, 185, textureX, textureY); // Box 1037
		rightTrackWheelModels[279] = new ModelRendererTurbo(this, 1209, 185, textureX, textureY); // Box 1038
		rightTrackWheelModels[280] = new ModelRendererTurbo(this, 1273, 185, textureX, textureY); // Box 1039
		rightTrackWheelModels[281] = new ModelRendererTurbo(this, 1241, 185, textureX, textureY); // Box 1040
		rightTrackWheelModels[282] = new ModelRendererTurbo(this, 1305, 185, textureX, textureY); // Box 1041
		rightTrackWheelModels[283] = new ModelRendererTurbo(this, 1337, 185, textureX, textureY); // Box 1042
		rightTrackWheelModels[284] = new ModelRendererTurbo(this, 1377, 185, textureX, textureY); // Box 1043
		rightTrackWheelModels[285] = new ModelRendererTurbo(this, 1449, 185, textureX, textureY); // Box 1044
		rightTrackWheelModels[286] = new ModelRendererTurbo(this, 1481, 185, textureX, textureY); // Box 1045
		rightTrackWheelModels[287] = new ModelRendererTurbo(this, 1513, 185, textureX, textureY); // Box 1046
		rightTrackWheelModels[288] = new ModelRendererTurbo(this, 1537, 185, textureX, textureY); // Box 1047
		rightTrackWheelModels[289] = new ModelRendererTurbo(this, 1577, 185, textureX, textureY); // Box 1048
		rightTrackWheelModels[290] = new ModelRendererTurbo(this, 1617, 185, textureX, textureY); // Box 1049
		rightTrackWheelModels[291] = new ModelRendererTurbo(this, 1713, 185, textureX, textureY); // Box 1050
		rightTrackWheelModels[292] = new ModelRendererTurbo(this, 1761, 185, textureX, textureY); // Box 1051
		rightTrackWheelModels[293] = new ModelRendererTurbo(this, 1801, 185, textureX, textureY); // Box 1052
		rightTrackWheelModels[294] = new ModelRendererTurbo(this, 1841, 185, textureX, textureY); // Box 1053
		rightTrackWheelModels[295] = new ModelRendererTurbo(this, 1865, 185, textureX, textureY); // Box 1054
		rightTrackWheelModels[296] = new ModelRendererTurbo(this, 1897, 185, textureX, textureY); // Box 1055
		rightTrackWheelModels[297] = new ModelRendererTurbo(this, 1945, 185, textureX, textureY); // Box 1056
		rightTrackWheelModels[298] = new ModelRendererTurbo(this, 1977, 185, textureX, textureY); // Box 1057
		rightTrackWheelModels[299] = new ModelRendererTurbo(this, 2009, 185, textureX, textureY); // Box 1058
		rightTrackWheelModels[300] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 1059
		rightTrackWheelModels[301] = new ModelRendererTurbo(this, 25, 193, textureX, textureY); // Box 1060
		rightTrackWheelModels[302] = new ModelRendererTurbo(this, 57, 193, textureX, textureY); // Box 1061
		rightTrackWheelModels[303] = new ModelRendererTurbo(this, 209, 193, textureX, textureY); // Box 1062
		rightTrackWheelModels[304] = new ModelRendererTurbo(this, 249, 193, textureX, textureY); // Box 1063
		rightTrackWheelModels[305] = new ModelRendererTurbo(this, 97, 193, textureX, textureY); // Box 1064
		rightTrackWheelModels[306] = new ModelRendererTurbo(this, 281, 193, textureX, textureY); // Box 1065
		rightTrackWheelModels[307] = new ModelRendererTurbo(this, 137, 193, textureX, textureY); // Box 1066
		rightTrackWheelModels[308] = new ModelRendererTurbo(this, 169, 193, textureX, textureY); // Box 1067
		rightTrackWheelModels[309] = new ModelRendererTurbo(this, 321, 193, textureX, textureY); // Box 1068
		rightTrackWheelModels[310] = new ModelRendererTurbo(this, 481, 193, textureX, textureY); // Box 1069
		rightTrackWheelModels[311] = new ModelRendererTurbo(this, 529, 193, textureX, textureY); // Box 1070
		rightTrackWheelModels[312] = new ModelRendererTurbo(this, 353, 193, textureX, textureY); // Box 1071
		rightTrackWheelModels[313] = new ModelRendererTurbo(this, 385, 193, textureX, textureY); // Box 1072
		rightTrackWheelModels[314] = new ModelRendererTurbo(this, 577, 193, textureX, textureY); // Box 1073
		rightTrackWheelModels[315] = new ModelRendererTurbo(this, 617, 193, textureX, textureY); // Box 1074
		rightTrackWheelModels[316] = new ModelRendererTurbo(this, 657, 193, textureX, textureY); // Box 1075
		rightTrackWheelModels[317] = new ModelRendererTurbo(this, 721, 193, textureX, textureY); // Box 1076
		rightTrackWheelModels[318] = new ModelRendererTurbo(this, 769, 193, textureX, textureY); // Box 1077
		rightTrackWheelModels[319] = new ModelRendererTurbo(this, 833, 193, textureX, textureY); // Box 1078
		rightTrackWheelModels[320] = new ModelRendererTurbo(this, 865, 193, textureX, textureY); // Box 1079
		rightTrackWheelModels[321] = new ModelRendererTurbo(this, 889, 193, textureX, textureY); // Box 1080
		rightTrackWheelModels[322] = new ModelRendererTurbo(this, 945, 193, textureX, textureY); // Box 1081
		rightTrackWheelModels[323] = new ModelRendererTurbo(this, 977, 193, textureX, textureY); // Box 1082
		rightTrackWheelModels[324] = new ModelRendererTurbo(this, 1017, 193, textureX, textureY); // Box 1083
		rightTrackWheelModels[325] = new ModelRendererTurbo(this, 1105, 193, textureX, textureY); // Box 1084
		rightTrackWheelModels[326] = new ModelRendererTurbo(this, 1449, 153, textureX, textureY); // Box 1085
		rightTrackWheelModels[327] = new ModelRendererTurbo(this, 1153, 193, textureX, textureY); // Box 1086
		rightTrackWheelModels[328] = new ModelRendererTurbo(this, 1641, 185, textureX, textureY); // Box 1087
		rightTrackWheelModels[329] = new ModelRendererTurbo(this, 1353, 193, textureX, textureY); // Box 1088
		rightTrackWheelModels[330] = new ModelRendererTurbo(this, 1401, 193, textureX, textureY); // Box 1089
		rightTrackWheelModels[331] = new ModelRendererTurbo(this, 681, 193, textureX, textureY); // Box 1090
		rightTrackWheelModels[332] = new ModelRendererTurbo(this, 1553, 193, textureX, textureY); // Box 1091
		rightTrackWheelModels[333] = new ModelRendererTurbo(this, 1041, 193, textureX, textureY); // Box 1092
		rightTrackWheelModels[334] = new ModelRendererTurbo(this, 1593, 193, textureX, textureY); // Box 1093
		rightTrackWheelModels[335] = new ModelRendererTurbo(this, 1657, 193, textureX, textureY); // Box 1094
		rightTrackWheelModels[336] = new ModelRendererTurbo(this, 1073, 193, textureX, textureY); // Box 1095
		rightTrackWheelModels[337] = new ModelRendererTurbo(this, 1689, 193, textureX, textureY); // Box 1096
		rightTrackWheelModels[338] = new ModelRendererTurbo(this, 1225, 193, textureX, textureY); // Box 1097
		rightTrackWheelModels[339] = new ModelRendererTurbo(this, 1737, 193, textureX, textureY); // Box 1098
		rightTrackWheelModels[340] = new ModelRendererTurbo(this, 1777, 193, textureX, textureY); // Box 1099
		rightTrackWheelModels[341] = new ModelRendererTurbo(this, 1257, 193, textureX, textureY); // Box 1100
		rightTrackWheelModels[342] = new ModelRendererTurbo(this, 1913, 193, textureX, textureY); // Box 1101
		rightTrackWheelModels[343] = new ModelRendererTurbo(this, 1321, 193, textureX, textureY); // Box 1102
		rightTrackWheelModels[344] = new ModelRendererTurbo(this, 73, 201, textureX, textureY); // Box 1103
		rightTrackWheelModels[345] = new ModelRendererTurbo(this, 113, 201, textureX, textureY); // Box 1104
		rightTrackWheelModels[346] = new ModelRendererTurbo(this, 1433, 193, textureX, textureY); // Box 1105
		rightTrackWheelModels[347] = new ModelRendererTurbo(this, 185, 201, textureX, textureY); // Box 1106
		rightTrackWheelModels[348] = new ModelRendererTurbo(this, 1497, 193, textureX, textureY); // Box 1107
		rightTrackWheelModels[349] = new ModelRendererTurbo(this, 401, 201, textureX, textureY); // Box 1108
		rightTrackWheelModels[350] = new ModelRendererTurbo(this, 433, 201, textureX, textureY); // Box 1109
		rightTrackWheelModels[351] = new ModelRendererTurbo(this, 1825, 193, textureX, textureY); // Box 1110
		rightTrackWheelModels[352] = new ModelRendererTurbo(this, 505, 201, textureX, textureY); // Box 1111
		rightTrackWheelModels[353] = new ModelRendererTurbo(this, 1881, 193, textureX, textureY); // Box 1112
		rightTrackWheelModels[354] = new ModelRendererTurbo(this, 553, 201, textureX, textureY); // Box 1113
		rightTrackWheelModels[355] = new ModelRendererTurbo(this, 41, 201, textureX, textureY); // Box 1114
		rightTrackWheelModels[356] = new ModelRendererTurbo(this, 593, 201, textureX, textureY); // Box 1115
		rightTrackWheelModels[357] = new ModelRendererTurbo(this, 633, 201, textureX, textureY); // Box 1116
		rightTrackWheelModels[358] = new ModelRendererTurbo(this, 153, 201, textureX, textureY); // Box 1117
		rightTrackWheelModels[359] = new ModelRendererTurbo(this, 697, 201, textureX, textureY); // Box 1118

		rightTrackWheelModels[0].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		rightTrackWheelModels[0].setRotationPoint(-98F, 10F, -35F);

		rightTrackWheelModels[1].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		rightTrackWheelModels[1].setRotationPoint(-95F, 10F, -35F);

		rightTrackWheelModels[2].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		rightTrackWheelModels[2].setRotationPoint(-92F, 10F, -35F);

		rightTrackWheelModels[3].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		rightTrackWheelModels[3].setRotationPoint(-89F, 10F, -35F);

		rightTrackWheelModels[4].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		rightTrackWheelModels[4].setRotationPoint(-86F, 10F, -35F);

		rightTrackWheelModels[5].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		rightTrackWheelModels[5].setRotationPoint(-83F, 10F, -35F);

		rightTrackWheelModels[6].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		rightTrackWheelModels[6].setRotationPoint(-80F, 10F, -35F);

		rightTrackWheelModels[7].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		rightTrackWheelModels[7].setRotationPoint(-77F, 10F, -35F);

		rightTrackWheelModels[8].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		rightTrackWheelModels[8].setRotationPoint(-74F, 10F, -35F);

		rightTrackWheelModels[9].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		rightTrackWheelModels[9].setRotationPoint(-71F, 10F, -35F);

		rightTrackWheelModels[10].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		rightTrackWheelModels[10].setRotationPoint(-68F, 10F, -35F);

		rightTrackWheelModels[11].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		rightTrackWheelModels[11].setRotationPoint(-65F, 10F, -35F);

		rightTrackWheelModels[12].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		rightTrackWheelModels[12].setRotationPoint(-62F, 10F, -35F);

		rightTrackWheelModels[13].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		rightTrackWheelModels[13].setRotationPoint(-59F, 10F, -35F);

		rightTrackWheelModels[14].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		rightTrackWheelModels[14].setRotationPoint(-56F, 10F, -35F);

		rightTrackWheelModels[15].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		rightTrackWheelModels[15].setRotationPoint(-53F, 10F, -35F);

		rightTrackWheelModels[16].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		rightTrackWheelModels[16].setRotationPoint(-50F, 10F, -35F);

		rightTrackWheelModels[17].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		rightTrackWheelModels[17].setRotationPoint(-47F, 10F, -35F);

		rightTrackWheelModels[18].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		rightTrackWheelModels[18].setRotationPoint(-44F, 10F, -35F);

		rightTrackWheelModels[19].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289
		rightTrackWheelModels[19].setRotationPoint(-41F, 10F, -35F);

		rightTrackWheelModels[20].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		rightTrackWheelModels[20].setRotationPoint(-38F, 10F, -35F);

		rightTrackWheelModels[21].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		rightTrackWheelModels[21].setRotationPoint(-35F, 10F, -35F);

		rightTrackWheelModels[22].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		rightTrackWheelModels[22].setRotationPoint(-32F, 10F, -35F);

		rightTrackWheelModels[23].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		rightTrackWheelModels[23].setRotationPoint(-29F, 10F, -35F);

		rightTrackWheelModels[24].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		rightTrackWheelModels[24].setRotationPoint(-26F, 10F, -35F);

		rightTrackWheelModels[25].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		rightTrackWheelModels[25].setRotationPoint(7F, 10F, -35F);

		rightTrackWheelModels[26].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		rightTrackWheelModels[26].setRotationPoint(-23F, 10F, -35F);

		rightTrackWheelModels[27].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		rightTrackWheelModels[27].setRotationPoint(-20F, 10F, -35F);

		rightTrackWheelModels[28].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		rightTrackWheelModels[28].setRotationPoint(-17F, 10F, -35F);

		rightTrackWheelModels[29].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		rightTrackWheelModels[29].setRotationPoint(-14F, 10F, -35F);

		rightTrackWheelModels[30].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		rightTrackWheelModels[30].setRotationPoint(-11F, 10F, -35F);

		rightTrackWheelModels[31].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		rightTrackWheelModels[31].setRotationPoint(-8F, 10F, -35F);

		rightTrackWheelModels[32].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		rightTrackWheelModels[32].setRotationPoint(-5F, 10F, -35F);

		rightTrackWheelModels[33].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		rightTrackWheelModels[33].setRotationPoint(-2F, 10F, -35F);

		rightTrackWheelModels[34].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		rightTrackWheelModels[34].setRotationPoint(1F, 10F, -35F);

		rightTrackWheelModels[35].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		rightTrackWheelModels[35].setRotationPoint(4F, 10F, -35F);

		rightTrackWheelModels[36].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		rightTrackWheelModels[36].setRotationPoint(40F, 10F, -35F);

		rightTrackWheelModels[37].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		rightTrackWheelModels[37].setRotationPoint(10F, 10F, -35F);

		rightTrackWheelModels[38].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		rightTrackWheelModels[38].setRotationPoint(13F, 10F, -35F);

		rightTrackWheelModels[39].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		rightTrackWheelModels[39].setRotationPoint(16F, 10F, -35F);

		rightTrackWheelModels[40].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		rightTrackWheelModels[40].setRotationPoint(19F, 10F, -35F);

		rightTrackWheelModels[41].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		rightTrackWheelModels[41].setRotationPoint(22F, 10F, -35F);

		rightTrackWheelModels[42].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		rightTrackWheelModels[42].setRotationPoint(25F, 10F, -35F);

		rightTrackWheelModels[43].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		rightTrackWheelModels[43].setRotationPoint(28F, 10F, -35F);

		rightTrackWheelModels[44].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		rightTrackWheelModels[44].setRotationPoint(31F, 10F, -35F);

		rightTrackWheelModels[45].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		rightTrackWheelModels[45].setRotationPoint(34F, 10F, -35F);

		rightTrackWheelModels[46].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		rightTrackWheelModels[46].setRotationPoint(37F, 10F, -35F);

		rightTrackWheelModels[47].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		rightTrackWheelModels[47].setRotationPoint(73F, 10F, -35F);

		rightTrackWheelModels[48].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		rightTrackWheelModels[48].setRotationPoint(43F, 10F, -35F);

		rightTrackWheelModels[49].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319
		rightTrackWheelModels[49].setRotationPoint(46F, 10F, -35F);

		rightTrackWheelModels[50].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
		rightTrackWheelModels[50].setRotationPoint(49F, 10F, -35F);

		rightTrackWheelModels[51].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
		rightTrackWheelModels[51].setRotationPoint(52F, 10F, -35F);

		rightTrackWheelModels[52].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
		rightTrackWheelModels[52].setRotationPoint(55F, 10F, -35F);

		rightTrackWheelModels[53].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323
		rightTrackWheelModels[53].setRotationPoint(58F, 10F, -35F);

		rightTrackWheelModels[54].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		rightTrackWheelModels[54].setRotationPoint(61F, 10F, -35F);

		rightTrackWheelModels[55].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		rightTrackWheelModels[55].setRotationPoint(64F, 10F, -35F);

		rightTrackWheelModels[56].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		rightTrackWheelModels[56].setRotationPoint(67F, 10F, -35F);

		rightTrackWheelModels[57].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 327
		rightTrackWheelModels[57].setRotationPoint(70F, 10F, -35F);

		rightTrackWheelModels[58].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
		rightTrackWheelModels[58].setRotationPoint(76F, 10F, -35F);

		rightTrackWheelModels[59].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		rightTrackWheelModels[59].setRotationPoint(79F, 10F, -35F);

		rightTrackWheelModels[60].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		rightTrackWheelModels[60].setRotationPoint(82F, 10F, -35F);

		rightTrackWheelModels[61].addShapeBox(0F, 0F, 0F, 181, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		rightTrackWheelModels[61].setRotationPoint(-98F, -10F, -35F);

		rightTrackWheelModels[62].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 393
		rightTrackWheelModels[62].setRotationPoint(-102F, -10F, -35F);

		rightTrackWheelModels[63].addShapeBox(0F, 0F, 0F, 181, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		rightTrackWheelModels[63].setRotationPoint(-98F, 9F, -35F);

		rightTrackWheelModels[64].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 395
		rightTrackWheelModels[64].setRotationPoint(-102F, 9F, -35F);

		rightTrackWheelModels[65].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		rightTrackWheelModels[65].setRotationPoint(-106F, -2F, -35F);

		rightTrackWheelModels[66].addShapeBox(0F, 0F, 0F, 1, 5, 11, 0F,-4F, 1F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		rightTrackWheelModels[66].setRotationPoint(-106F, -7F, -35F);

		rightTrackWheelModels[67].addShapeBox(0F, 0F, 0F, 1, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -4F, 1F, 0F); // Box 398
		rightTrackWheelModels[67].setRotationPoint(-106F, 2F, -35F);

		rightTrackWheelModels[68].addShapeBox(0F, 0F, 0F, 1, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, 3F, 0F, 0F); // Box 399
		rightTrackWheelModels[68].setRotationPoint(90F, 2F, -35F);

		rightTrackWheelModels[69].addShapeBox(0F, 0F, 0F, 1, 5, 11, 0F,3F, 0F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 400
		rightTrackWheelModels[69].setRotationPoint(90F, -7F, -35F);

		rightTrackWheelModels[70].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
		rightTrackWheelModels[70].setRotationPoint(90F, -2F, -35F);

		rightTrackWheelModels[71].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 402
		rightTrackWheelModels[71].setRotationPoint(83F, 9F, -35F);

		rightTrackWheelModels[72].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 403
		rightTrackWheelModels[72].setRotationPoint(83F, -10F, -35F);

		rightTrackWheelModels[73].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		rightTrackWheelModels[73].setRotationPoint(-101F, -9.6F, -35F);

		rightTrackWheelModels[74].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 414
		rightTrackWheelModels[74].setRotationPoint(-103.5F, -7F, -35F);

		rightTrackWheelModels[75].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		rightTrackWheelModels[75].setRotationPoint(-105.6F, -4F, -35F);

		rightTrackWheelModels[76].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 416
		rightTrackWheelModels[76].setRotationPoint(-107F, -1F, -35F);

		rightTrackWheelModels[77].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		rightTrackWheelModels[77].setRotationPoint(-105.6F, 3F, -35F);

		rightTrackWheelModels[78].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419
		rightTrackWheelModels[78].setRotationPoint(-101F, 8.4F, -35F);

		rightTrackWheelModels[79].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
		rightTrackWheelModels[79].setRotationPoint(85F, -9.6F, -35F);

		rightTrackWheelModels[80].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		rightTrackWheelModels[80].setRotationPoint(85F, 8.4F, -35F);

		rightTrackWheelModels[81].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 429
		rightTrackWheelModels[81].setRotationPoint(87.5F, -7F, -35F);

		rightTrackWheelModels[82].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 430
		rightTrackWheelModels[82].setRotationPoint(87.5F, 6F, -35F);

		rightTrackWheelModels[83].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 431
		rightTrackWheelModels[83].setRotationPoint(89.6F, -4F, -35F);

		rightTrackWheelModels[84].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 432
		rightTrackWheelModels[84].setRotationPoint(89.6F, 3F, -35F);

		rightTrackWheelModels[85].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 433
		rightTrackWheelModels[85].setRotationPoint(91F, -1F, -35F);

		rightTrackWheelModels[86].addShapeBox(0F, 0F, 0F, 8, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 845
		rightTrackWheelModels[86].setRotationPoint(-100F, -4F, -34F);

		rightTrackWheelModels[87].addShapeBox(0F, 0F, 0F, 8, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 846
		rightTrackWheelModels[87].setRotationPoint(-100F, -8F, -34F);

		rightTrackWheelModels[88].addShapeBox(0F, 0F, 0F, 8, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 847
		rightTrackWheelModels[88].setRotationPoint(-100F, 4F, -34F);

		rightTrackWheelModels[89].addShapeBox(0F, 0F, 0F, 4, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 848
		rightTrackWheelModels[89].setRotationPoint(-92F, -4F, -34F);

		rightTrackWheelModels[90].addShapeBox(0F, 0F, 0F, 4, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 849
		rightTrackWheelModels[90].setRotationPoint(-104F, -4F, -34F);

		rightTrackWheelModels[91].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 850
		rightTrackWheelModels[91].setRotationPoint(-92F, -8F, -34F);

		rightTrackWheelModels[92].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,-1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 851
		rightTrackWheelModels[92].setRotationPoint(-104F, -8F, -34F);

		rightTrackWheelModels[93].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F); // Box 852
		rightTrackWheelModels[93].setRotationPoint(-104F, 4F, -34F);

		rightTrackWheelModels[94].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F); // Box 853
		rightTrackWheelModels[94].setRotationPoint(-92F, 4F, -34F);

		rightTrackWheelModels[95].addShapeBox(0F, 0F, 0F, 1, 8, 10, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 854
		rightTrackWheelModels[95].setRotationPoint(-88F, -4F, -34F);

		rightTrackWheelModels[96].addShapeBox(0F, 0F, 0F, 1, 8, 10, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 855
		rightTrackWheelModels[96].setRotationPoint(-105F, -4F, -34F);

		rightTrackWheelModels[97].addShapeBox(0F, 0F, 0F, 8, 1, 10, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 856
		rightTrackWheelModels[97].setRotationPoint(-100F, -9F, -34F);

		rightTrackWheelModels[98].addShapeBox(0F, 0F, 0F, 8, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 857
		rightTrackWheelModels[98].setRotationPoint(-100F, 8F, -34F);

		rightTrackWheelModels[99].addShapeBox(0F, 0F, 0F, 8, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 858
		rightTrackWheelModels[99].setRotationPoint(77F, 8F, -34F);

		rightTrackWheelModels[100].addShapeBox(0F, 0F, 0F, 8, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 859
		rightTrackWheelModels[100].setRotationPoint(77F, 4F, -34F);

		rightTrackWheelModels[101].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F); // Box 860
		rightTrackWheelModels[101].setRotationPoint(85F, 4F, -34F);

		rightTrackWheelModels[102].addShapeBox(0F, 0F, 0F, 4, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 861
		rightTrackWheelModels[102].setRotationPoint(85F, -4F, -34F);

		rightTrackWheelModels[103].addShapeBox(0F, 0F, 0F, 1, 8, 10, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 862
		rightTrackWheelModels[103].setRotationPoint(89F, -4F, -34F);

		rightTrackWheelModels[104].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 863
		rightTrackWheelModels[104].setRotationPoint(85F, -8F, -34F);

		rightTrackWheelModels[105].addShapeBox(0F, 0F, 0F, 8, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 864
		rightTrackWheelModels[105].setRotationPoint(77F, -8F, -34F);

		rightTrackWheelModels[106].addShapeBox(0F, 0F, 0F, 8, 1, 10, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 865
		rightTrackWheelModels[106].setRotationPoint(77F, -9F, -34F);

		rightTrackWheelModels[107].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,-1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 866
		rightTrackWheelModels[107].setRotationPoint(73F, -8F, -34F);

		rightTrackWheelModels[108].addShapeBox(0F, 0F, 0F, 4, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 867
		rightTrackWheelModels[108].setRotationPoint(73F, -4F, -34F);

		rightTrackWheelModels[109].addShapeBox(0F, 0F, 0F, 1, 8, 10, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 868
		rightTrackWheelModels[109].setRotationPoint(72F, -4F, -34F);

		rightTrackWheelModels[110].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F); // Box 869
		rightTrackWheelModels[110].setRotationPoint(73F, 4F, -34F);

		rightTrackWheelModels[111].addShapeBox(0F, 0F, 0F, 8, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 870
		rightTrackWheelModels[111].setRotationPoint(77F, -4F, -34F);

		rightTrackWheelModels[112].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,-0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F); // Box 871
		rightTrackWheelModels[112].setRotationPoint(56F, 2.75F, -34F);

		rightTrackWheelModels[113].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F); // Box 872
		rightTrackWheelModels[113].setRotationPoint(59F, 8.75F, -34F);

		rightTrackWheelModels[114].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 873
		rightTrackWheelModels[114].setRotationPoint(59F, 6.75F, -34F);

		rightTrackWheelModels[115].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F); // Box 874
		rightTrackWheelModels[115].setRotationPoint(63F, 6.75F, -34F);

		rightTrackWheelModels[116].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 875
		rightTrackWheelModels[116].setRotationPoint(63F, 2.75F, -34F);

		rightTrackWheelModels[117].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F); // Box 876
		rightTrackWheelModels[117].setRotationPoint(65F, 2.75F, -34F);

		rightTrackWheelModels[118].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 877
		rightTrackWheelModels[118].setRotationPoint(57F, 2.75F, -34F);

		rightTrackWheelModels[119].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F); // Box 878
		rightTrackWheelModels[119].setRotationPoint(57F, 6.75F, -34F);

		rightTrackWheelModels[120].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,-0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 879
		rightTrackWheelModels[120].setRotationPoint(57F, 0.75F, -34F);

		rightTrackWheelModels[121].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 880
		rightTrackWheelModels[121].setRotationPoint(63F, 0.75F, -34F);

		rightTrackWheelModels[122].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,-1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 881
		rightTrackWheelModels[122].setRotationPoint(59F, -0.25F, -34F);

		rightTrackWheelModels[123].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 882
		rightTrackWheelModels[123].setRotationPoint(59F, 0.75F, -34F);

		rightTrackWheelModels[124].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 883
		rightTrackWheelModels[124].setRotationPoint(59F, 2.75F, -34F);

		rightTrackWheelModels[125].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 884
		rightTrackWheelModels[125].setRotationPoint(55F, -8F, -36F);

		rightTrackWheelModels[126].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,-1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 885
		rightTrackWheelModels[126].setRotationPoint(55F, -9F, -36F);

		rightTrackWheelModels[127].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 886
		rightTrackWheelModels[127].setRotationPoint(55F, -5F, -36F);

		rightTrackWheelModels[128].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F); // Box 887
		rightTrackWheelModels[128].setRotationPoint(58F, -8F, -36F);

		rightTrackWheelModels[129].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,-0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F); // Box 888
		rightTrackWheelModels[129].setRotationPoint(54F, -8F, -36F);

		rightTrackWheelModels[130].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,-0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 889
		rightTrackWheelModels[130].setRotationPoint(48F, 0.75F, -34F);

		rightTrackWheelModels[131].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,-0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F); // Box 890
		rightTrackWheelModels[131].setRotationPoint(47F, 2.75F, -34F);

		rightTrackWheelModels[132].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 891
		rightTrackWheelModels[132].setRotationPoint(48F, 2.75F, -34F);

		rightTrackWheelModels[133].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F); // Box 892
		rightTrackWheelModels[133].setRotationPoint(48F, 6.75F, -34F);

		rightTrackWheelModels[134].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F); // Box 893
		rightTrackWheelModels[134].setRotationPoint(50F, 8.75F, -34F);

		rightTrackWheelModels[135].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 894
		rightTrackWheelModels[135].setRotationPoint(50F, 6.75F, -34F);

		rightTrackWheelModels[136].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F); // Box 895
		rightTrackWheelModels[136].setRotationPoint(54F, 6.75F, -34F);

		rightTrackWheelModels[137].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 896
		rightTrackWheelModels[137].setRotationPoint(50F, 2.75F, -34F);

		rightTrackWheelModels[138].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F); // Box 897
		rightTrackWheelModels[138].setRotationPoint(56F, 2.75F, -34F);

		rightTrackWheelModels[139].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 898
		rightTrackWheelModels[139].setRotationPoint(54F, 2.75F, -34F);

		rightTrackWheelModels[140].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 899
		rightTrackWheelModels[140].setRotationPoint(54F, 0.75F, -34F);

		rightTrackWheelModels[141].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 900
		rightTrackWheelModels[141].setRotationPoint(50F, 0.75F, -34F);

		rightTrackWheelModels[142].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,-1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 901
		rightTrackWheelModels[142].setRotationPoint(50F, -0.25F, -34F);

		rightTrackWheelModels[143].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,-0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 902
		rightTrackWheelModels[143].setRotationPoint(39F, 0.75F, -34F);

		rightTrackWheelModels[144].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,-0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F); // Box 903
		rightTrackWheelModels[144].setRotationPoint(38F, 2.75F, -34F);

		rightTrackWheelModels[145].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 904
		rightTrackWheelModels[145].setRotationPoint(39F, 2.75F, -34F);

		rightTrackWheelModels[146].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F); // Box 905
		rightTrackWheelModels[146].setRotationPoint(39F, 6.75F, -34F);

		rightTrackWheelModels[147].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F); // Box 906
		rightTrackWheelModels[147].setRotationPoint(41F, 8.75F, -34F);

		rightTrackWheelModels[148].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 907
		rightTrackWheelModels[148].setRotationPoint(41F, 6.75F, -34F);

		rightTrackWheelModels[149].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F); // Box 908
		rightTrackWheelModels[149].setRotationPoint(45F, 6.75F, -34F);

		rightTrackWheelModels[150].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 909
		rightTrackWheelModels[150].setRotationPoint(41F, 2.75F, -34F);

		rightTrackWheelModels[151].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F); // Box 910
		rightTrackWheelModels[151].setRotationPoint(47F, 2.75F, -34F);

		rightTrackWheelModels[152].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 911
		rightTrackWheelModels[152].setRotationPoint(45F, 2.75F, -34F);

		rightTrackWheelModels[153].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 912
		rightTrackWheelModels[153].setRotationPoint(45F, 0.75F, -34F);

		rightTrackWheelModels[154].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 913
		rightTrackWheelModels[154].setRotationPoint(41F, 0.75F, -34F);

		rightTrackWheelModels[155].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,-1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 914
		rightTrackWheelModels[155].setRotationPoint(41F, -0.25F, -34F);

		rightTrackWheelModels[156].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,-0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 915
		rightTrackWheelModels[156].setRotationPoint(30F, 0.75F, -34F);

		rightTrackWheelModels[157].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,-0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F); // Box 916
		rightTrackWheelModels[157].setRotationPoint(29F, 2.75F, -34F);

		rightTrackWheelModels[158].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 917
		rightTrackWheelModels[158].setRotationPoint(30F, 2.75F, -34F);

		rightTrackWheelModels[159].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F); // Box 918
		rightTrackWheelModels[159].setRotationPoint(30F, 6.75F, -34F);

		rightTrackWheelModels[160].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F); // Box 919
		rightTrackWheelModels[160].setRotationPoint(32F, 8.75F, -34F);

		rightTrackWheelModels[161].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 920
		rightTrackWheelModels[161].setRotationPoint(32F, 6.75F, -34F);

		rightTrackWheelModels[162].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F); // Box 921
		rightTrackWheelModels[162].setRotationPoint(36F, 6.75F, -34F);

		rightTrackWheelModels[163].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 922
		rightTrackWheelModels[163].setRotationPoint(32F, 2.75F, -34F);

		rightTrackWheelModels[164].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F); // Box 923
		rightTrackWheelModels[164].setRotationPoint(38F, 2.75F, -34F);

		rightTrackWheelModels[165].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 924
		rightTrackWheelModels[165].setRotationPoint(36F, 2.75F, -34F);

		rightTrackWheelModels[166].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 925
		rightTrackWheelModels[166].setRotationPoint(36F, 0.75F, -34F);

		rightTrackWheelModels[167].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 926
		rightTrackWheelModels[167].setRotationPoint(32F, 0.75F, -34F);

		rightTrackWheelModels[168].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,-1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 927
		rightTrackWheelModels[168].setRotationPoint(32F, -0.25F, -34F);

		rightTrackWheelModels[169].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,-0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 928
		rightTrackWheelModels[169].setRotationPoint(21F, 0.75F, -34F);

		rightTrackWheelModels[170].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,-0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F); // Box 929
		rightTrackWheelModels[170].setRotationPoint(20F, 2.75F, -34F);

		rightTrackWheelModels[171].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 930
		rightTrackWheelModels[171].setRotationPoint(21F, 2.75F, -34F);

		rightTrackWheelModels[172].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F); // Box 931
		rightTrackWheelModels[172].setRotationPoint(21F, 6.75F, -34F);

		rightTrackWheelModels[173].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F); // Box 932
		rightTrackWheelModels[173].setRotationPoint(23F, 8.75F, -34F);

		rightTrackWheelModels[174].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 933
		rightTrackWheelModels[174].setRotationPoint(23F, 6.75F, -34F);

		rightTrackWheelModels[175].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F); // Box 934
		rightTrackWheelModels[175].setRotationPoint(27F, 6.75F, -34F);

		rightTrackWheelModels[176].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 935
		rightTrackWheelModels[176].setRotationPoint(23F, 2.75F, -34F);

		rightTrackWheelModels[177].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F); // Box 936
		rightTrackWheelModels[177].setRotationPoint(29F, 2.75F, -34F);

		rightTrackWheelModels[178].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 937
		rightTrackWheelModels[178].setRotationPoint(27F, 2.75F, -34F);

		rightTrackWheelModels[179].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 938
		rightTrackWheelModels[179].setRotationPoint(27F, 0.75F, -34F);

		rightTrackWheelModels[180].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 939
		rightTrackWheelModels[180].setRotationPoint(23F, 0.75F, -34F);

		rightTrackWheelModels[181].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,-1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 940
		rightTrackWheelModels[181].setRotationPoint(23F, -0.25F, -34F);

		rightTrackWheelModels[182].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,-0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 941
		rightTrackWheelModels[182].setRotationPoint(12F, 0.75F, -34F);

		rightTrackWheelModels[183].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,-0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F); // Box 942
		rightTrackWheelModels[183].setRotationPoint(11F, 2.75F, -34F);

		rightTrackWheelModels[184].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 943
		rightTrackWheelModels[184].setRotationPoint(12F, 2.75F, -34F);

		rightTrackWheelModels[185].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F); // Box 944
		rightTrackWheelModels[185].setRotationPoint(12F, 6.75F, -34F);

		rightTrackWheelModels[186].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F); // Box 945
		rightTrackWheelModels[186].setRotationPoint(14F, 8.75F, -34F);

		rightTrackWheelModels[187].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 946
		rightTrackWheelModels[187].setRotationPoint(14F, 6.75F, -34F);

		rightTrackWheelModels[188].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F); // Box 947
		rightTrackWheelModels[188].setRotationPoint(18F, 6.75F, -34F);

		rightTrackWheelModels[189].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 948
		rightTrackWheelModels[189].setRotationPoint(14F, 2.75F, -34F);

		rightTrackWheelModels[190].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F); // Box 949
		rightTrackWheelModels[190].setRotationPoint(20F, 2.75F, -34F);

		rightTrackWheelModels[191].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 950
		rightTrackWheelModels[191].setRotationPoint(18F, 2.75F, -34F);

		rightTrackWheelModels[192].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 951
		rightTrackWheelModels[192].setRotationPoint(18F, 0.75F, -34F);

		rightTrackWheelModels[193].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 952
		rightTrackWheelModels[193].setRotationPoint(14F, 0.75F, -34F);

		rightTrackWheelModels[194].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,-1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 953
		rightTrackWheelModels[194].setRotationPoint(14F, -0.25F, -34F);

		rightTrackWheelModels[195].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,-0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 954
		rightTrackWheelModels[195].setRotationPoint(3F, 0.75F, -34F);

		rightTrackWheelModels[196].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,-0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F); // Box 955
		rightTrackWheelModels[196].setRotationPoint(2F, 2.75F, -34F);

		rightTrackWheelModels[197].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 956
		rightTrackWheelModels[197].setRotationPoint(3F, 2.75F, -34F);

		rightTrackWheelModels[198].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F); // Box 957
		rightTrackWheelModels[198].setRotationPoint(3F, 6.75F, -34F);

		rightTrackWheelModels[199].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F); // Box 958
		rightTrackWheelModels[199].setRotationPoint(5F, 8.75F, -34F);

		rightTrackWheelModels[200].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 959
		rightTrackWheelModels[200].setRotationPoint(5F, 6.75F, -34F);

		rightTrackWheelModels[201].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F); // Box 960
		rightTrackWheelModels[201].setRotationPoint(9F, 6.75F, -34F);

		rightTrackWheelModels[202].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 961
		rightTrackWheelModels[202].setRotationPoint(5F, 2.75F, -34F);

		rightTrackWheelModels[203].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F); // Box 962
		rightTrackWheelModels[203].setRotationPoint(11F, 2.75F, -34F);

		rightTrackWheelModels[204].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 963
		rightTrackWheelModels[204].setRotationPoint(9F, 2.75F, -34F);

		rightTrackWheelModels[205].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 964
		rightTrackWheelModels[205].setRotationPoint(9F, 0.75F, -34F);

		rightTrackWheelModels[206].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 965
		rightTrackWheelModels[206].setRotationPoint(5F, 0.75F, -34F);

		rightTrackWheelModels[207].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,-1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 966
		rightTrackWheelModels[207].setRotationPoint(5F, -0.25F, -34F);

		rightTrackWheelModels[208].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,-0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 967
		rightTrackWheelModels[208].setRotationPoint(-6F, 0.75F, -34F);

		rightTrackWheelModels[209].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,-0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F); // Box 968
		rightTrackWheelModels[209].setRotationPoint(-7F, 2.75F, -34F);

		rightTrackWheelModels[210].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 969
		rightTrackWheelModels[210].setRotationPoint(-6F, 2.75F, -34F);

		rightTrackWheelModels[211].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F); // Box 970
		rightTrackWheelModels[211].setRotationPoint(-6F, 6.75F, -34F);

		rightTrackWheelModels[212].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F); // Box 971
		rightTrackWheelModels[212].setRotationPoint(-4F, 8.75F, -34F);

		rightTrackWheelModels[213].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 972
		rightTrackWheelModels[213].setRotationPoint(-4F, 6.75F, -34F);

		rightTrackWheelModels[214].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F); // Box 973
		rightTrackWheelModels[214].setRotationPoint(0F, 6.75F, -34F);

		rightTrackWheelModels[215].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 974
		rightTrackWheelModels[215].setRotationPoint(-4F, 2.75F, -34F);

		rightTrackWheelModels[216].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F); // Box 975
		rightTrackWheelModels[216].setRotationPoint(2F, 2.75F, -34F);

		rightTrackWheelModels[217].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 976
		rightTrackWheelModels[217].setRotationPoint(0F, 2.75F, -34F);

		rightTrackWheelModels[218].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 977
		rightTrackWheelModels[218].setRotationPoint(0F, 0.75F, -34F);

		rightTrackWheelModels[219].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 978
		rightTrackWheelModels[219].setRotationPoint(-4F, 0.75F, -34F);

		rightTrackWheelModels[220].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,-1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 979
		rightTrackWheelModels[220].setRotationPoint(-4F, -0.25F, -34F);

		rightTrackWheelModels[221].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,-0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 980
		rightTrackWheelModels[221].setRotationPoint(-15F, 0.75F, -34F);

		rightTrackWheelModels[222].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,-0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F); // Box 981
		rightTrackWheelModels[222].setRotationPoint(-16F, 2.75F, -34F);

		rightTrackWheelModels[223].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 982
		rightTrackWheelModels[223].setRotationPoint(-15F, 2.75F, -34F);

		rightTrackWheelModels[224].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F); // Box 983
		rightTrackWheelModels[224].setRotationPoint(-15F, 6.75F, -34F);

		rightTrackWheelModels[225].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F); // Box 984
		rightTrackWheelModels[225].setRotationPoint(-13F, 8.75F, -34F);

		rightTrackWheelModels[226].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 985
		rightTrackWheelModels[226].setRotationPoint(-13F, 6.75F, -34F);

		rightTrackWheelModels[227].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F); // Box 986
		rightTrackWheelModels[227].setRotationPoint(-9F, 6.75F, -34F);

		rightTrackWheelModels[228].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 987
		rightTrackWheelModels[228].setRotationPoint(-13F, 2.75F, -34F);

		rightTrackWheelModels[229].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F); // Box 988
		rightTrackWheelModels[229].setRotationPoint(-7F, 2.75F, -34F);

		rightTrackWheelModels[230].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 989
		rightTrackWheelModels[230].setRotationPoint(-9F, 2.75F, -34F);

		rightTrackWheelModels[231].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 990
		rightTrackWheelModels[231].setRotationPoint(-9F, 0.75F, -34F);

		rightTrackWheelModels[232].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 991
		rightTrackWheelModels[232].setRotationPoint(-13F, 0.75F, -34F);

		rightTrackWheelModels[233].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,-1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 992
		rightTrackWheelModels[233].setRotationPoint(-13F, -0.25F, -34F);

		rightTrackWheelModels[234].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,-0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 993
		rightTrackWheelModels[234].setRotationPoint(-24F, 0.75F, -34F);

		rightTrackWheelModels[235].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,-0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F); // Box 994
		rightTrackWheelModels[235].setRotationPoint(-25F, 2.75F, -34F);

		rightTrackWheelModels[236].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 995
		rightTrackWheelModels[236].setRotationPoint(-24F, 2.75F, -34F);

		rightTrackWheelModels[237].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F); // Box 996
		rightTrackWheelModels[237].setRotationPoint(-24F, 6.75F, -34F);

		rightTrackWheelModels[238].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F); // Box 997
		rightTrackWheelModels[238].setRotationPoint(-22F, 8.75F, -34F);

		rightTrackWheelModels[239].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 998
		rightTrackWheelModels[239].setRotationPoint(-22F, 6.75F, -34F);

		rightTrackWheelModels[240].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F); // Box 999
		rightTrackWheelModels[240].setRotationPoint(-18F, 6.75F, -34F);

		rightTrackWheelModels[241].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1000
		rightTrackWheelModels[241].setRotationPoint(-22F, 2.75F, -34F);

		rightTrackWheelModels[242].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F); // Box 1001
		rightTrackWheelModels[242].setRotationPoint(-16F, 2.75F, -34F);

		rightTrackWheelModels[243].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1002
		rightTrackWheelModels[243].setRotationPoint(-18F, 2.75F, -34F);

		rightTrackWheelModels[244].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1003
		rightTrackWheelModels[244].setRotationPoint(-18F, 0.75F, -34F);

		rightTrackWheelModels[245].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1004
		rightTrackWheelModels[245].setRotationPoint(-22F, 0.75F, -34F);

		rightTrackWheelModels[246].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,-1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1005
		rightTrackWheelModels[246].setRotationPoint(-22F, -0.25F, -34F);

		rightTrackWheelModels[247].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,-0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1006
		rightTrackWheelModels[247].setRotationPoint(-33F, 0.75F, -34F);

		rightTrackWheelModels[248].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,-0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F); // Box 1007
		rightTrackWheelModels[248].setRotationPoint(-34F, 2.75F, -34F);

		rightTrackWheelModels[249].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1008
		rightTrackWheelModels[249].setRotationPoint(-33F, 2.75F, -34F);

		rightTrackWheelModels[250].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F); // Box 1009
		rightTrackWheelModels[250].setRotationPoint(-33F, 6.75F, -34F);

		rightTrackWheelModels[251].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F); // Box 1010
		rightTrackWheelModels[251].setRotationPoint(-31F, 8.75F, -34F);

		rightTrackWheelModels[252].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1011
		rightTrackWheelModels[252].setRotationPoint(-31F, 6.75F, -34F);

		rightTrackWheelModels[253].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F); // Box 1012
		rightTrackWheelModels[253].setRotationPoint(-27F, 6.75F, -34F);

		rightTrackWheelModels[254].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1013
		rightTrackWheelModels[254].setRotationPoint(-31F, 2.75F, -34F);

		rightTrackWheelModels[255].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F); // Box 1014
		rightTrackWheelModels[255].setRotationPoint(-25F, 2.75F, -34F);

		rightTrackWheelModels[256].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1015
		rightTrackWheelModels[256].setRotationPoint(-27F, 2.75F, -34F);

		rightTrackWheelModels[257].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1016
		rightTrackWheelModels[257].setRotationPoint(-27F, 0.75F, -34F);

		rightTrackWheelModels[258].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1017
		rightTrackWheelModels[258].setRotationPoint(-31F, 0.75F, -34F);

		rightTrackWheelModels[259].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,-1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1018
		rightTrackWheelModels[259].setRotationPoint(-31F, -0.25F, -34F);

		rightTrackWheelModels[260].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,-0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1019
		rightTrackWheelModels[260].setRotationPoint(-42F, 0.75F, -34F);

		rightTrackWheelModels[261].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,-0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F); // Box 1020
		rightTrackWheelModels[261].setRotationPoint(-43F, 2.75F, -34F);

		rightTrackWheelModels[262].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1021
		rightTrackWheelModels[262].setRotationPoint(-42F, 2.75F, -34F);

		rightTrackWheelModels[263].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F); // Box 1022
		rightTrackWheelModels[263].setRotationPoint(-42F, 6.75F, -34F);

		rightTrackWheelModels[264].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F); // Box 1023
		rightTrackWheelModels[264].setRotationPoint(-40F, 8.75F, -34F);

		rightTrackWheelModels[265].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1024
		rightTrackWheelModels[265].setRotationPoint(-40F, 6.75F, -34F);

		rightTrackWheelModels[266].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F); // Box 1025
		rightTrackWheelModels[266].setRotationPoint(-36F, 6.75F, -34F);

		rightTrackWheelModels[267].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1026
		rightTrackWheelModels[267].setRotationPoint(-40F, 2.75F, -34F);

		rightTrackWheelModels[268].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F); // Box 1027
		rightTrackWheelModels[268].setRotationPoint(-34F, 2.75F, -34F);

		rightTrackWheelModels[269].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1028
		rightTrackWheelModels[269].setRotationPoint(-36F, 2.75F, -34F);

		rightTrackWheelModels[270].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1029
		rightTrackWheelModels[270].setRotationPoint(-36F, 0.75F, -34F);

		rightTrackWheelModels[271].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1030
		rightTrackWheelModels[271].setRotationPoint(-40F, 0.75F, -34F);

		rightTrackWheelModels[272].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,-1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1031
		rightTrackWheelModels[272].setRotationPoint(-40F, -0.25F, -34F);

		rightTrackWheelModels[273].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,-0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1032
		rightTrackWheelModels[273].setRotationPoint(-51F, 0.75F, -34F);

		rightTrackWheelModels[274].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,-0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F); // Box 1033
		rightTrackWheelModels[274].setRotationPoint(-52F, 2.75F, -34F);

		rightTrackWheelModels[275].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1034
		rightTrackWheelModels[275].setRotationPoint(-51F, 2.75F, -34F);

		rightTrackWheelModels[276].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F); // Box 1035
		rightTrackWheelModels[276].setRotationPoint(-51F, 6.75F, -34F);

		rightTrackWheelModels[277].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F); // Box 1036
		rightTrackWheelModels[277].setRotationPoint(-49F, 8.75F, -34F);

		rightTrackWheelModels[278].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1037
		rightTrackWheelModels[278].setRotationPoint(-49F, 6.75F, -34F);

		rightTrackWheelModels[279].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F); // Box 1038
		rightTrackWheelModels[279].setRotationPoint(-45F, 6.75F, -34F);

		rightTrackWheelModels[280].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1039
		rightTrackWheelModels[280].setRotationPoint(-49F, 2.75F, -34F);

		rightTrackWheelModels[281].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F); // Box 1040
		rightTrackWheelModels[281].setRotationPoint(-43F, 2.75F, -34F);

		rightTrackWheelModels[282].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1041
		rightTrackWheelModels[282].setRotationPoint(-45F, 2.75F, -34F);

		rightTrackWheelModels[283].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1042
		rightTrackWheelModels[283].setRotationPoint(-45F, 0.75F, -34F);

		rightTrackWheelModels[284].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1043
		rightTrackWheelModels[284].setRotationPoint(-49F, 0.75F, -34F);

		rightTrackWheelModels[285].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,-1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1044
		rightTrackWheelModels[285].setRotationPoint(-49F, -0.25F, -34F);

		rightTrackWheelModels[286].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,-0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1045
		rightTrackWheelModels[286].setRotationPoint(-60F, 0.75F, -34F);

		rightTrackWheelModels[287].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,-0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F); // Box 1046
		rightTrackWheelModels[287].setRotationPoint(-61F, 2.75F, -34F);

		rightTrackWheelModels[288].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1047
		rightTrackWheelModels[288].setRotationPoint(-60F, 2.75F, -34F);

		rightTrackWheelModels[289].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F); // Box 1048
		rightTrackWheelModels[289].setRotationPoint(-60F, 6.75F, -34F);

		rightTrackWheelModels[290].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F); // Box 1049
		rightTrackWheelModels[290].setRotationPoint(-58F, 8.75F, -34F);

		rightTrackWheelModels[291].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1050
		rightTrackWheelModels[291].setRotationPoint(-58F, 6.75F, -34F);

		rightTrackWheelModels[292].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F); // Box 1051
		rightTrackWheelModels[292].setRotationPoint(-54F, 6.75F, -34F);

		rightTrackWheelModels[293].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1052
		rightTrackWheelModels[293].setRotationPoint(-58F, 2.75F, -34F);

		rightTrackWheelModels[294].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F); // Box 1053
		rightTrackWheelModels[294].setRotationPoint(-52F, 2.75F, -34F);

		rightTrackWheelModels[295].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1054
		rightTrackWheelModels[295].setRotationPoint(-54F, 2.75F, -34F);

		rightTrackWheelModels[296].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1055
		rightTrackWheelModels[296].setRotationPoint(-54F, 0.75F, -34F);

		rightTrackWheelModels[297].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1056
		rightTrackWheelModels[297].setRotationPoint(-58F, 0.75F, -34F);

		rightTrackWheelModels[298].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,-1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1057
		rightTrackWheelModels[298].setRotationPoint(-58F, -0.25F, -34F);

		rightTrackWheelModels[299].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,-0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1058
		rightTrackWheelModels[299].setRotationPoint(-69F, 0.75F, -34F);

		rightTrackWheelModels[300].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,-0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F); // Box 1059
		rightTrackWheelModels[300].setRotationPoint(-70F, 2.75F, -34F);

		rightTrackWheelModels[301].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1060
		rightTrackWheelModels[301].setRotationPoint(-69F, 2.75F, -34F);

		rightTrackWheelModels[302].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F); // Box 1061
		rightTrackWheelModels[302].setRotationPoint(-69F, 6.75F, -34F);

		rightTrackWheelModels[303].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F); // Box 1062
		rightTrackWheelModels[303].setRotationPoint(-67F, 8.75F, -34F);

		rightTrackWheelModels[304].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1063
		rightTrackWheelModels[304].setRotationPoint(-67F, 6.75F, -34F);

		rightTrackWheelModels[305].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F); // Box 1064
		rightTrackWheelModels[305].setRotationPoint(-63F, 6.75F, -34F);

		rightTrackWheelModels[306].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1065
		rightTrackWheelModels[306].setRotationPoint(-67F, 2.75F, -34F);

		rightTrackWheelModels[307].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F); // Box 1066
		rightTrackWheelModels[307].setRotationPoint(-61F, 2.75F, -34F);

		rightTrackWheelModels[308].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1067
		rightTrackWheelModels[308].setRotationPoint(-63F, 2.75F, -34F);

		rightTrackWheelModels[309].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1068
		rightTrackWheelModels[309].setRotationPoint(-63F, 0.75F, -34F);

		rightTrackWheelModels[310].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1069
		rightTrackWheelModels[310].setRotationPoint(-67F, 0.75F, -34F);

		rightTrackWheelModels[311].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,-1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1070
		rightTrackWheelModels[311].setRotationPoint(-67F, -0.25F, -34F);

		rightTrackWheelModels[312].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,-0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1071
		rightTrackWheelModels[312].setRotationPoint(-78F, 0.75F, -34F);

		rightTrackWheelModels[313].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,-0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F); // Box 1072
		rightTrackWheelModels[313].setRotationPoint(-79F, 2.75F, -34F);

		rightTrackWheelModels[314].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1073
		rightTrackWheelModels[314].setRotationPoint(-78F, 2.75F, -34F);

		rightTrackWheelModels[315].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F); // Box 1074
		rightTrackWheelModels[315].setRotationPoint(-78F, 6.75F, -34F);

		rightTrackWheelModels[316].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F); // Box 1075
		rightTrackWheelModels[316].setRotationPoint(-76F, 8.75F, -34F);

		rightTrackWheelModels[317].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1076
		rightTrackWheelModels[317].setRotationPoint(-76F, 6.75F, -34F);

		rightTrackWheelModels[318].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F); // Box 1077
		rightTrackWheelModels[318].setRotationPoint(-72F, 6.75F, -34F);

		rightTrackWheelModels[319].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1078
		rightTrackWheelModels[319].setRotationPoint(-76F, 2.75F, -34F);

		rightTrackWheelModels[320].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F); // Box 1079
		rightTrackWheelModels[320].setRotationPoint(-70F, 2.75F, -34F);

		rightTrackWheelModels[321].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1080
		rightTrackWheelModels[321].setRotationPoint(-72F, 2.75F, -34F);

		rightTrackWheelModels[322].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1081
		rightTrackWheelModels[322].setRotationPoint(-72F, 0.75F, -34F);

		rightTrackWheelModels[323].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1082
		rightTrackWheelModels[323].setRotationPoint(-76F, 0.75F, -34F);

		rightTrackWheelModels[324].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,-1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1083
		rightTrackWheelModels[324].setRotationPoint(-76F, -0.25F, -34F);

		rightTrackWheelModels[325].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1084
		rightTrackWheelModels[325].setRotationPoint(37F, -8F, -36F);

		rightTrackWheelModels[326].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F); // Box 1085
		rightTrackWheelModels[326].setRotationPoint(40F, -8F, -36F);

		rightTrackWheelModels[327].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,-1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1086
		rightTrackWheelModels[327].setRotationPoint(37F, -9F, -36F);

		rightTrackWheelModels[328].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,-0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F); // Box 1087
		rightTrackWheelModels[328].setRotationPoint(36F, -8F, -36F);

		rightTrackWheelModels[329].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 1088
		rightTrackWheelModels[329].setRotationPoint(37F, -5F, -36F);

		rightTrackWheelModels[330].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1089
		rightTrackWheelModels[330].setRotationPoint(19F, -8F, -36F);

		rightTrackWheelModels[331].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F); // Box 1090
		rightTrackWheelModels[331].setRotationPoint(22F, -8F, -36F);

		rightTrackWheelModels[332].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,-1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1091
		rightTrackWheelModels[332].setRotationPoint(19F, -9F, -36F);

		rightTrackWheelModels[333].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,-0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F); // Box 1092
		rightTrackWheelModels[333].setRotationPoint(18F, -8F, -36F);

		rightTrackWheelModels[334].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 1093
		rightTrackWheelModels[334].setRotationPoint(19F, -5F, -36F);

		rightTrackWheelModels[335].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1094
		rightTrackWheelModels[335].setRotationPoint(1F, -8F, -36F);

		rightTrackWheelModels[336].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F); // Box 1095
		rightTrackWheelModels[336].setRotationPoint(4F, -8F, -36F);

		rightTrackWheelModels[337].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,-1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1096
		rightTrackWheelModels[337].setRotationPoint(1F, -9F, -36F);

		rightTrackWheelModels[338].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,-0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F); // Box 1097
		rightTrackWheelModels[338].setRotationPoint(0F, -8F, -36F);

		rightTrackWheelModels[339].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 1098
		rightTrackWheelModels[339].setRotationPoint(1F, -5F, -36F);

		rightTrackWheelModels[340].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1099
		rightTrackWheelModels[340].setRotationPoint(-17F, -8F, -36F);

		rightTrackWheelModels[341].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F); // Box 1100
		rightTrackWheelModels[341].setRotationPoint(-14F, -8F, -36F);

		rightTrackWheelModels[342].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,-1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1101
		rightTrackWheelModels[342].setRotationPoint(-17F, -9F, -36F);

		rightTrackWheelModels[343].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,-0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F); // Box 1102
		rightTrackWheelModels[343].setRotationPoint(-18F, -8F, -36F);

		rightTrackWheelModels[344].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 1103
		rightTrackWheelModels[344].setRotationPoint(-17F, -5F, -36F);

		rightTrackWheelModels[345].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1104
		rightTrackWheelModels[345].setRotationPoint(-35F, -8F, -36F);

		rightTrackWheelModels[346].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F); // Box 1105
		rightTrackWheelModels[346].setRotationPoint(-32F, -8F, -36F);

		rightTrackWheelModels[347].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,-1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1106
		rightTrackWheelModels[347].setRotationPoint(-35F, -9F, -36F);

		rightTrackWheelModels[348].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,-0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F); // Box 1107
		rightTrackWheelModels[348].setRotationPoint(-36F, -8F, -36F);

		rightTrackWheelModels[349].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 1108
		rightTrackWheelModels[349].setRotationPoint(-35F, -5F, -36F);

		rightTrackWheelModels[350].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1109
		rightTrackWheelModels[350].setRotationPoint(-53F, -8F, -36F);

		rightTrackWheelModels[351].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F); // Box 1110
		rightTrackWheelModels[351].setRotationPoint(-50F, -8F, -36F);

		rightTrackWheelModels[352].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,-1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1111
		rightTrackWheelModels[352].setRotationPoint(-53F, -9F, -36F);

		rightTrackWheelModels[353].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,-0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F); // Box 1112
		rightTrackWheelModels[353].setRotationPoint(-54F, -8F, -36F);

		rightTrackWheelModels[354].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 1113
		rightTrackWheelModels[354].setRotationPoint(-53F, -5F, -36F);

		rightTrackWheelModels[355].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F); // Box 1114
		rightTrackWheelModels[355].setRotationPoint(-68F, -8F, -36F);

		rightTrackWheelModels[356].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 1115
		rightTrackWheelModels[356].setRotationPoint(-71F, -5F, -36F);

		rightTrackWheelModels[357].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1116
		rightTrackWheelModels[357].setRotationPoint(-71F, -8F, -36F);

		rightTrackWheelModels[358].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,-0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F); // Box 1117
		rightTrackWheelModels[358].setRotationPoint(-72F, -8F, -36F);

		rightTrackWheelModels[359].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,-1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1118
		rightTrackWheelModels[359].setRotationPoint(-71F, -9F, -36F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 1609, 25, textureX, textureY); // Box 134
		leftTrackModel[1] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 135
		leftTrackModel[2] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 138
		leftTrackModel[3] = new ModelRendererTurbo(this, 1089, 25, textureX, textureY); // Box 139
		leftTrackModel[4] = new ModelRendererTurbo(this, 1017, 25, textureX, textureY); // Box 140
		leftTrackModel[5] = new ModelRendererTurbo(this, 1225, 25, textureX, textureY); // Box 141
		leftTrackModel[6] = new ModelRendererTurbo(this, 1273, 25, textureX, textureY); // Box 142
		leftTrackModel[7] = new ModelRendererTurbo(this, 1305, 25, textureX, textureY); // Box 143
		leftTrackModel[8] = new ModelRendererTurbo(this, 1337, 25, textureX, textureY); // Box 144
		leftTrackModel[9] = new ModelRendererTurbo(this, 1369, 25, textureX, textureY); // Box 145
		leftTrackModel[10] = new ModelRendererTurbo(this, 1401, 25, textureX, textureY); // Box 146
		leftTrackModel[11] = new ModelRendererTurbo(this, 1433, 25, textureX, textureY); // Box 147
		leftTrackModel[12] = new ModelRendererTurbo(this, 1465, 25, textureX, textureY); // Box 148
		leftTrackModel[13] = new ModelRendererTurbo(this, 1497, 25, textureX, textureY); // Box 149
		leftTrackModel[14] = new ModelRendererTurbo(this, 2001, 25, textureX, textureY); // Box 150
		leftTrackModel[15] = new ModelRendererTurbo(this, 889, 33, textureX, textureY); // Box 151
		leftTrackModel[16] = new ModelRendererTurbo(this, 921, 33, textureX, textureY); // Box 152
		leftTrackModel[17] = new ModelRendererTurbo(this, 1033, 33, textureX, textureY); // Box 153
		leftTrackModel[18] = new ModelRendererTurbo(this, 1073, 33, textureX, textureY); // Box 154
		leftTrackModel[19] = new ModelRendererTurbo(this, 1113, 33, textureX, textureY); // Box 155
		leftTrackModel[20] = new ModelRendererTurbo(this, 1145, 33, textureX, textureY); // Box 156
		leftTrackModel[21] = new ModelRendererTurbo(this, 1177, 33, textureX, textureY); // Box 157
		leftTrackModel[22] = new ModelRendererTurbo(this, 1209, 33, textureX, textureY); // Box 158
		leftTrackModel[23] = new ModelRendererTurbo(this, 1241, 33, textureX, textureY); // Box 159
		leftTrackModel[24] = new ModelRendererTurbo(this, 1289, 33, textureX, textureY); // Box 160
		leftTrackModel[25] = new ModelRendererTurbo(this, 1321, 33, textureX, textureY); // Box 161
		leftTrackModel[26] = new ModelRendererTurbo(this, 1353, 33, textureX, textureY); // Box 162
		leftTrackModel[27] = new ModelRendererTurbo(this, 1385, 33, textureX, textureY); // Box 163
		leftTrackModel[28] = new ModelRendererTurbo(this, 1481, 33, textureX, textureY); // Box 164
		leftTrackModel[29] = new ModelRendererTurbo(this, 1513, 33, textureX, textureY); // Box 165
		leftTrackModel[30] = new ModelRendererTurbo(this, 1545, 33, textureX, textureY); // Box 166
		leftTrackModel[31] = new ModelRendererTurbo(this, 1577, 33, textureX, textureY); // Box 167
		leftTrackModel[32] = new ModelRendererTurbo(this, 1985, 33, textureX, textureY); // Box 168
		leftTrackModel[33] = new ModelRendererTurbo(this, 2017, 33, textureX, textureY); // Box 169
		leftTrackModel[34] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 170
		leftTrackModel[35] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 171
		leftTrackModel[36] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 172
		leftTrackModel[37] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 173
		leftTrackModel[38] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 174
		leftTrackModel[39] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 175
		leftTrackModel[40] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 176
		leftTrackModel[41] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 177
		leftTrackModel[42] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 178
		leftTrackModel[43] = new ModelRendererTurbo(this, 873, 41, textureX, textureY); // Box 179
		leftTrackModel[44] = new ModelRendererTurbo(this, 905, 41, textureX, textureY); // Box 180
		leftTrackModel[45] = new ModelRendererTurbo(this, 937, 41, textureX, textureY); // Box 181
		leftTrackModel[46] = new ModelRendererTurbo(this, 969, 41, textureX, textureY); // Box 182
		leftTrackModel[47] = new ModelRendererTurbo(this, 1001, 41, textureX, textureY); // Box 183
		leftTrackModel[48] = new ModelRendererTurbo(this, 1049, 41, textureX, textureY); // Box 184
		leftTrackModel[49] = new ModelRendererTurbo(this, 1089, 41, textureX, textureY); // Box 185
		leftTrackModel[50] = new ModelRendererTurbo(this, 1129, 41, textureX, textureY); // Box 186
		leftTrackModel[51] = new ModelRendererTurbo(this, 1161, 41, textureX, textureY); // Box 187
		leftTrackModel[52] = new ModelRendererTurbo(this, 1193, 41, textureX, textureY); // Box 188
		leftTrackModel[53] = new ModelRendererTurbo(this, 1257, 41, textureX, textureY); // Box 189
		leftTrackModel[54] = new ModelRendererTurbo(this, 1369, 41, textureX, textureY); // Box 190
		leftTrackModel[55] = new ModelRendererTurbo(this, 1401, 41, textureX, textureY); // Box 191
		leftTrackModel[56] = new ModelRendererTurbo(this, 1433, 41, textureX, textureY); // Box 192
		leftTrackModel[57] = new ModelRendererTurbo(this, 1465, 41, textureX, textureY); // Box 193
		leftTrackModel[58] = new ModelRendererTurbo(this, 1497, 41, textureX, textureY); // Box 194
		leftTrackModel[59] = new ModelRendererTurbo(this, 1529, 41, textureX, textureY); // Box 195
		leftTrackModel[60] = new ModelRendererTurbo(this, 1561, 41, textureX, textureY); // Box 196
		leftTrackModel[61] = new ModelRendererTurbo(this, 1593, 41, textureX, textureY); // Box 197
		leftTrackModel[62] = new ModelRendererTurbo(this, 1625, 41, textureX, textureY); // Box 198
		leftTrackModel[63] = new ModelRendererTurbo(this, 1657, 41, textureX, textureY); // Box 199
		leftTrackModel[64] = new ModelRendererTurbo(this, 1689, 41, textureX, textureY); // Box 200
		leftTrackModel[65] = new ModelRendererTurbo(this, 1721, 41, textureX, textureY); // Box 201
		leftTrackModel[66] = new ModelRendererTurbo(this, 1753, 41, textureX, textureY); // Box 202
		leftTrackModel[67] = new ModelRendererTurbo(this, 1785, 41, textureX, textureY); // Box 203
		leftTrackModel[68] = new ModelRendererTurbo(this, 1817, 41, textureX, textureY); // Box 204
		leftTrackModel[69] = new ModelRendererTurbo(this, 1849, 41, textureX, textureY); // Box 205
		leftTrackModel[70] = new ModelRendererTurbo(this, 1881, 41, textureX, textureY); // Box 206
		leftTrackModel[71] = new ModelRendererTurbo(this, 1913, 41, textureX, textureY); // Box 207
		leftTrackModel[72] = new ModelRendererTurbo(this, 1945, 41, textureX, textureY); // Box 208
		leftTrackModel[73] = new ModelRendererTurbo(this, 625, 65, textureX, textureY); // Box 331
		leftTrackModel[74] = new ModelRendererTurbo(this, 657, 65, textureX, textureY); // Box 332
		leftTrackModel[75] = new ModelRendererTurbo(this, 689, 65, textureX, textureY); // Box 333
		leftTrackModel[76] = new ModelRendererTurbo(this, 721, 65, textureX, textureY); // Box 334
		leftTrackModel[77] = new ModelRendererTurbo(this, 753, 65, textureX, textureY); // Box 335
		leftTrackModel[78] = new ModelRendererTurbo(this, 785, 65, textureX, textureY); // Box 336
		leftTrackModel[79] = new ModelRendererTurbo(this, 817, 65, textureX, textureY); // Box 337
		leftTrackModel[80] = new ModelRendererTurbo(this, 849, 65, textureX, textureY); // Box 338
		leftTrackModel[81] = new ModelRendererTurbo(this, 881, 65, textureX, textureY); // Box 339
		leftTrackModel[82] = new ModelRendererTurbo(this, 921, 65, textureX, textureY); // Box 340
		leftTrackModel[83] = new ModelRendererTurbo(this, 953, 65, textureX, textureY); // Box 341
		leftTrackModel[84] = new ModelRendererTurbo(this, 985, 65, textureX, textureY); // Box 342
		leftTrackModel[85] = new ModelRendererTurbo(this, 1017, 65, textureX, textureY); // Box 343
		leftTrackModel[86] = new ModelRendererTurbo(this, 1049, 65, textureX, textureY); // Box 344
		leftTrackModel[87] = new ModelRendererTurbo(this, 1097, 65, textureX, textureY); // Box 345
		leftTrackModel[88] = new ModelRendererTurbo(this, 1137, 65, textureX, textureY); // Box 346
		leftTrackModel[89] = new ModelRendererTurbo(this, 1177, 65, textureX, textureY); // Box 347
		leftTrackModel[90] = new ModelRendererTurbo(this, 1209, 65, textureX, textureY); // Box 348
		leftTrackModel[91] = new ModelRendererTurbo(this, 1241, 65, textureX, textureY); // Box 349
		leftTrackModel[92] = new ModelRendererTurbo(this, 1273, 65, textureX, textureY); // Box 350
		leftTrackModel[93] = new ModelRendererTurbo(this, 1305, 65, textureX, textureY); // Box 351
		leftTrackModel[94] = new ModelRendererTurbo(this, 1337, 65, textureX, textureY); // Box 352
		leftTrackModel[95] = new ModelRendererTurbo(this, 1369, 65, textureX, textureY); // Box 353
		leftTrackModel[96] = new ModelRendererTurbo(this, 1417, 65, textureX, textureY); // Box 354
		leftTrackModel[97] = new ModelRendererTurbo(this, 1449, 65, textureX, textureY); // Box 355
		leftTrackModel[98] = new ModelRendererTurbo(this, 1481, 65, textureX, textureY); // Box 356
		leftTrackModel[99] = new ModelRendererTurbo(this, 1513, 65, textureX, textureY); // Box 357
		leftTrackModel[100] = new ModelRendererTurbo(this, 1545, 65, textureX, textureY); // Box 358
		leftTrackModel[101] = new ModelRendererTurbo(this, 1577, 65, textureX, textureY); // Box 359
		leftTrackModel[102] = new ModelRendererTurbo(this, 1609, 65, textureX, textureY); // Box 360
		leftTrackModel[103] = new ModelRendererTurbo(this, 1641, 65, textureX, textureY); // Box 361
		leftTrackModel[104] = new ModelRendererTurbo(this, 1673, 65, textureX, textureY); // Box 362
		leftTrackModel[105] = new ModelRendererTurbo(this, 1705, 65, textureX, textureY); // Box 363
		leftTrackModel[106] = new ModelRendererTurbo(this, 1737, 65, textureX, textureY); // Box 364
		leftTrackModel[107] = new ModelRendererTurbo(this, 1769, 65, textureX, textureY); // Box 365
		leftTrackModel[108] = new ModelRendererTurbo(this, 1801, 65, textureX, textureY); // Box 366
		leftTrackModel[109] = new ModelRendererTurbo(this, 1833, 65, textureX, textureY); // Box 367
		leftTrackModel[110] = new ModelRendererTurbo(this, 1865, 65, textureX, textureY); // Box 368
		leftTrackModel[111] = new ModelRendererTurbo(this, 1897, 65, textureX, textureY); // Box 369
		leftTrackModel[112] = new ModelRendererTurbo(this, 1929, 65, textureX, textureY); // Box 370
		leftTrackModel[113] = new ModelRendererTurbo(this, 1961, 65, textureX, textureY); // Box 371
		leftTrackModel[114] = new ModelRendererTurbo(this, 1993, 65, textureX, textureY); // Box 372
		leftTrackModel[115] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 373
		leftTrackModel[116] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 374
		leftTrackModel[117] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 375
		leftTrackModel[118] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 376
		leftTrackModel[119] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 377
		leftTrackModel[120] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 378
		leftTrackModel[121] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 379
		leftTrackModel[122] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 380
		leftTrackModel[123] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 381
		leftTrackModel[124] = new ModelRendererTurbo(this, 513, 73, textureX, textureY); // Box 382
		leftTrackModel[125] = new ModelRendererTurbo(this, 545, 73, textureX, textureY); // Box 383
		leftTrackModel[126] = new ModelRendererTurbo(this, 577, 73, textureX, textureY); // Box 384
		leftTrackModel[127] = new ModelRendererTurbo(this, 609, 73, textureX, textureY); // Box 385
		leftTrackModel[128] = new ModelRendererTurbo(this, 641, 73, textureX, textureY); // Box 386
		leftTrackModel[129] = new ModelRendererTurbo(this, 673, 73, textureX, textureY); // Box 387
		leftTrackModel[130] = new ModelRendererTurbo(this, 705, 73, textureX, textureY); // Box 388
		leftTrackModel[131] = new ModelRendererTurbo(this, 737, 73, textureX, textureY); // Box 389
		leftTrackModel[132] = new ModelRendererTurbo(this, 769, 73, textureX, textureY); // Box 390
		leftTrackModel[133] = new ModelRendererTurbo(this, 801, 73, textureX, textureY); // Box 391
		leftTrackModel[134] = new ModelRendererTurbo(this, 1785, 73, textureX, textureY); // Box 404
		leftTrackModel[135] = new ModelRendererTurbo(this, 1817, 73, textureX, textureY); // Box 406
		leftTrackModel[136] = new ModelRendererTurbo(this, 1849, 73, textureX, textureY); // Box 408
		leftTrackModel[137] = new ModelRendererTurbo(this, 1881, 73, textureX, textureY); // Box 409
		leftTrackModel[138] = new ModelRendererTurbo(this, 1913, 73, textureX, textureY); // Box 410
		leftTrackModel[139] = new ModelRendererTurbo(this, 1945, 73, textureX, textureY); // Box 411
		leftTrackModel[140] = new ModelRendererTurbo(this, 1977, 73, textureX, textureY); // Box 412
		leftTrackModel[141] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 420
		leftTrackModel[142] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 421
		leftTrackModel[143] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 422
		leftTrackModel[144] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 423
		leftTrackModel[145] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 424
		leftTrackModel[146] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 425
		leftTrackModel[147] = new ModelRendererTurbo(this, 529, 81, textureX, textureY); // Box 426

		leftTrackModel[0].addShapeBox(0F, 0F, 0F, 181, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		leftTrackModel[0].setRotationPoint(-98F, -10F, 24F);

		leftTrackModel[1].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 135
		leftTrackModel[1].setRotationPoint(-102F, -10F, 24F);

		leftTrackModel[2].addShapeBox(0F, 0F, 0F, 181, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		leftTrackModel[2].setRotationPoint(-98F, 9F, 24F);

		leftTrackModel[3].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 139
		leftTrackModel[3].setRotationPoint(-102F, 9F, 24F);

		leftTrackModel[4].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		leftTrackModel[4].setRotationPoint(-106F, -2F, 24F);

		leftTrackModel[5].addShapeBox(0F, 0F, 0F, 1, 5, 11, 0F,-4F, 1F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		leftTrackModel[5].setRotationPoint(-106F, -7F, 24F);

		leftTrackModel[6].addShapeBox(0F, 0F, 0F, 1, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -4F, 1F, 0F); // Box 142
		leftTrackModel[6].setRotationPoint(-106F, 2F, 24F);

		leftTrackModel[7].addShapeBox(0F, 0F, 0F, 1, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, 3F, 0F, 0F); // Box 143
		leftTrackModel[7].setRotationPoint(90F, 2F, 24F);

		leftTrackModel[8].addShapeBox(0F, 0F, 0F, 1, 5, 11, 0F,3F, 0F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		leftTrackModel[8].setRotationPoint(90F, -7F, 24F);

		leftTrackModel[9].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		leftTrackModel[9].setRotationPoint(90F, -2F, 24F);

		leftTrackModel[10].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 146
		leftTrackModel[10].setRotationPoint(83F, 9F, 24F);

		leftTrackModel[11].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 147
		leftTrackModel[11].setRotationPoint(83F, -10F, 24F);

		leftTrackModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		leftTrackModel[12].setRotationPoint(-98F, -11F, 24F);

		leftTrackModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		leftTrackModel[13].setRotationPoint(-95F, -11F, 24F);

		leftTrackModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		leftTrackModel[14].setRotationPoint(-92F, -11F, 24F);

		leftTrackModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		leftTrackModel[15].setRotationPoint(-89F, -11F, 24F);

		leftTrackModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		leftTrackModel[16].setRotationPoint(-86F, -11F, 24F);

		leftTrackModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		leftTrackModel[17].setRotationPoint(-83F, -11F, 24F);

		leftTrackModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		leftTrackModel[18].setRotationPoint(-80F, -11F, 24F);

		leftTrackModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		leftTrackModel[19].setRotationPoint(-77F, -11F, 24F);

		leftTrackModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		leftTrackModel[20].setRotationPoint(-74F, -11F, 24F);

		leftTrackModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		leftTrackModel[21].setRotationPoint(-71F, -11F, 24F);

		leftTrackModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		leftTrackModel[22].setRotationPoint(-68F, -11F, 24F);

		leftTrackModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		leftTrackModel[23].setRotationPoint(-65F, -11F, 24F);

		leftTrackModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		leftTrackModel[24].setRotationPoint(-62F, -11F, 24F);

		leftTrackModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		leftTrackModel[25].setRotationPoint(-59F, -11F, 24F);

		leftTrackModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		leftTrackModel[26].setRotationPoint(-56F, -11F, 24F);

		leftTrackModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		leftTrackModel[27].setRotationPoint(-53F, -11F, 24F);

		leftTrackModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		leftTrackModel[28].setRotationPoint(-50F, -11F, 24F);

		leftTrackModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		leftTrackModel[29].setRotationPoint(-47F, -11F, 24F);

		leftTrackModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		leftTrackModel[30].setRotationPoint(-44F, -11F, 24F);

		leftTrackModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		leftTrackModel[31].setRotationPoint(-41F, -11F, 24F);

		leftTrackModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		leftTrackModel[32].setRotationPoint(-38F, -11F, 24F);

		leftTrackModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		leftTrackModel[33].setRotationPoint(-35F, -11F, 24F);

		leftTrackModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		leftTrackModel[34].setRotationPoint(-32F, -11F, 24F);

		leftTrackModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		leftTrackModel[35].setRotationPoint(-29F, -11F, 24F);

		leftTrackModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		leftTrackModel[36].setRotationPoint(-26F, -11F, 24F);

		leftTrackModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		leftTrackModel[37].setRotationPoint(7F, -11F, 24F);

		leftTrackModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		leftTrackModel[38].setRotationPoint(-23F, -11F, 24F);

		leftTrackModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		leftTrackModel[39].setRotationPoint(-20F, -11F, 24F);

		leftTrackModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		leftTrackModel[40].setRotationPoint(-17F, -11F, 24F);

		leftTrackModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		leftTrackModel[41].setRotationPoint(-14F, -11F, 24F);

		leftTrackModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		leftTrackModel[42].setRotationPoint(-11F, -11F, 24F);

		leftTrackModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		leftTrackModel[43].setRotationPoint(-8F, -11F, 24F);

		leftTrackModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		leftTrackModel[44].setRotationPoint(-5F, -11F, 24F);

		leftTrackModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		leftTrackModel[45].setRotationPoint(-2F, -11F, 24F);

		leftTrackModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		leftTrackModel[46].setRotationPoint(1F, -11F, 24F);

		leftTrackModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		leftTrackModel[47].setRotationPoint(4F, -11F, 24F);

		leftTrackModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		leftTrackModel[48].setRotationPoint(40F, -11F, 24F);

		leftTrackModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		leftTrackModel[49].setRotationPoint(10F, -11F, 24F);

		leftTrackModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		leftTrackModel[50].setRotationPoint(13F, -11F, 24F);

		leftTrackModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		leftTrackModel[51].setRotationPoint(16F, -11F, 24F);

		leftTrackModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		leftTrackModel[52].setRotationPoint(19F, -11F, 24F);

		leftTrackModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		leftTrackModel[53].setRotationPoint(22F, -11F, 24F);

		leftTrackModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		leftTrackModel[54].setRotationPoint(25F, -11F, 24F);

		leftTrackModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		leftTrackModel[55].setRotationPoint(28F, -11F, 24F);

		leftTrackModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		leftTrackModel[56].setRotationPoint(31F, -11F, 24F);

		leftTrackModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		leftTrackModel[57].setRotationPoint(34F, -11F, 24F);

		leftTrackModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		leftTrackModel[58].setRotationPoint(37F, -11F, 24F);

		leftTrackModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		leftTrackModel[59].setRotationPoint(73F, -11F, 24F);

		leftTrackModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		leftTrackModel[60].setRotationPoint(43F, -11F, 24F);

		leftTrackModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		leftTrackModel[61].setRotationPoint(46F, -11F, 24F);

		leftTrackModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		leftTrackModel[62].setRotationPoint(49F, -11F, 24F);

		leftTrackModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		leftTrackModel[63].setRotationPoint(52F, -11F, 24F);

		leftTrackModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		leftTrackModel[64].setRotationPoint(55F, -11F, 24F);

		leftTrackModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		leftTrackModel[65].setRotationPoint(58F, -11F, 24F);

		leftTrackModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		leftTrackModel[66].setRotationPoint(61F, -11F, 24F);

		leftTrackModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		leftTrackModel[67].setRotationPoint(64F, -11F, 24F);

		leftTrackModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		leftTrackModel[68].setRotationPoint(67F, -11F, 24F);

		leftTrackModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		leftTrackModel[69].setRotationPoint(70F, -11F, 24F);

		leftTrackModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		leftTrackModel[70].setRotationPoint(76F, -11F, 24F);

		leftTrackModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		leftTrackModel[71].setRotationPoint(79F, -11F, 24F);

		leftTrackModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		leftTrackModel[72].setRotationPoint(82F, -11F, 24F);

		leftTrackModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		leftTrackModel[73].setRotationPoint(-98F, 10F, 24F);

		leftTrackModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		leftTrackModel[74].setRotationPoint(-95F, 10F, 24F);

		leftTrackModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		leftTrackModel[75].setRotationPoint(-92F, 10F, 24F);

		leftTrackModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		leftTrackModel[76].setRotationPoint(-89F, 10F, 24F);

		leftTrackModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		leftTrackModel[77].setRotationPoint(-86F, 10F, 24F);

		leftTrackModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		leftTrackModel[78].setRotationPoint(-83F, 10F, 24F);

		leftTrackModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		leftTrackModel[79].setRotationPoint(-80F, 10F, 24F);

		leftTrackModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338
		leftTrackModel[80].setRotationPoint(-77F, 10F, 24F);

		leftTrackModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
		leftTrackModel[81].setRotationPoint(-74F, 10F, 24F);

		leftTrackModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		leftTrackModel[82].setRotationPoint(-71F, 10F, 24F);

		leftTrackModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		leftTrackModel[83].setRotationPoint(-68F, 10F, 24F);

		leftTrackModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
		leftTrackModel[84].setRotationPoint(-65F, 10F, 24F);

		leftTrackModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		leftTrackModel[85].setRotationPoint(-62F, 10F, 24F);

		leftTrackModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		leftTrackModel[86].setRotationPoint(-59F, 10F, 24F);

		leftTrackModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		leftTrackModel[87].setRotationPoint(-56F, 10F, 24F);

		leftTrackModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 346
		leftTrackModel[88].setRotationPoint(-53F, 10F, 24F);

		leftTrackModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		leftTrackModel[89].setRotationPoint(-50F, 10F, 24F);

		leftTrackModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		leftTrackModel[90].setRotationPoint(-47F, 10F, 24F);

		leftTrackModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		leftTrackModel[91].setRotationPoint(-44F, 10F, 24F);

		leftTrackModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		leftTrackModel[92].setRotationPoint(-41F, 10F, 24F);

		leftTrackModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		leftTrackModel[93].setRotationPoint(-38F, 10F, 24F);

		leftTrackModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		leftTrackModel[94].setRotationPoint(-35F, 10F, 24F);

		leftTrackModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		leftTrackModel[95].setRotationPoint(-32F, 10F, 24F);

		leftTrackModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		leftTrackModel[96].setRotationPoint(-29F, 10F, 24F);

		leftTrackModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355
		leftTrackModel[97].setRotationPoint(-26F, 10F, 24F);

		leftTrackModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
		leftTrackModel[98].setRotationPoint(7F, 10F, 24F);

		leftTrackModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		leftTrackModel[99].setRotationPoint(-23F, 10F, 24F);

		leftTrackModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		leftTrackModel[100].setRotationPoint(-20F, 10F, 24F);

		leftTrackModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		leftTrackModel[101].setRotationPoint(-17F, 10F, 24F);

		leftTrackModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		leftTrackModel[102].setRotationPoint(-14F, 10F, 24F);

		leftTrackModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		leftTrackModel[103].setRotationPoint(-11F, 10F, 24F);

		leftTrackModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		leftTrackModel[104].setRotationPoint(-8F, 10F, 24F);

		leftTrackModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 363
		leftTrackModel[105].setRotationPoint(-5F, 10F, 24F);

		leftTrackModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		leftTrackModel[106].setRotationPoint(-2F, 10F, 24F);

		leftTrackModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		leftTrackModel[107].setRotationPoint(1F, 10F, 24F);

		leftTrackModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		leftTrackModel[108].setRotationPoint(4F, 10F, 24F);

		leftTrackModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		leftTrackModel[109].setRotationPoint(40F, 10F, 24F);

		leftTrackModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		leftTrackModel[110].setRotationPoint(10F, 10F, 24F);

		leftTrackModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		leftTrackModel[111].setRotationPoint(13F, 10F, 24F);

		leftTrackModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		leftTrackModel[112].setRotationPoint(16F, 10F, 24F);

		leftTrackModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		leftTrackModel[113].setRotationPoint(19F, 10F, 24F);

		leftTrackModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		leftTrackModel[114].setRotationPoint(22F, 10F, 24F);

		leftTrackModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		leftTrackModel[115].setRotationPoint(25F, 10F, 24F);

		leftTrackModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		leftTrackModel[116].setRotationPoint(28F, 10F, 24F);

		leftTrackModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		leftTrackModel[117].setRotationPoint(31F, 10F, 24F);

		leftTrackModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		leftTrackModel[118].setRotationPoint(34F, 10F, 24F);

		leftTrackModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		leftTrackModel[119].setRotationPoint(37F, 10F, 24F);

		leftTrackModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		leftTrackModel[120].setRotationPoint(73F, 10F, 24F);

		leftTrackModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		leftTrackModel[121].setRotationPoint(43F, 10F, 24F);

		leftTrackModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		leftTrackModel[122].setRotationPoint(46F, 10F, 24F);

		leftTrackModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
		leftTrackModel[123].setRotationPoint(49F, 10F, 24F);

		leftTrackModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		leftTrackModel[124].setRotationPoint(52F, 10F, 24F);

		leftTrackModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		leftTrackModel[125].setRotationPoint(55F, 10F, 24F);

		leftTrackModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		leftTrackModel[126].setRotationPoint(58F, 10F, 24F);

		leftTrackModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
		leftTrackModel[127].setRotationPoint(61F, 10F, 24F);

		leftTrackModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386
		leftTrackModel[128].setRotationPoint(64F, 10F, 24F);

		leftTrackModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		leftTrackModel[129].setRotationPoint(67F, 10F, 24F);

		leftTrackModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388
		leftTrackModel[130].setRotationPoint(70F, 10F, 24F);

		leftTrackModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		leftTrackModel[131].setRotationPoint(76F, 10F, 24F);

		leftTrackModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		leftTrackModel[132].setRotationPoint(79F, 10F, 24F);

		leftTrackModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		leftTrackModel[133].setRotationPoint(82F, 10F, 24F);

		leftTrackModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404
		leftTrackModel[134].setRotationPoint(-101F, -9.6F, 24F);

		leftTrackModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 406
		leftTrackModel[135].setRotationPoint(-103.5F, -7F, 24F);

		leftTrackModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		leftTrackModel[136].setRotationPoint(-105.6F, -4F, 24F);

		leftTrackModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
		leftTrackModel[137].setRotationPoint(-107F, -1F, 24F);

		leftTrackModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		leftTrackModel[138].setRotationPoint(-105.6F, 3F, 24F);

		leftTrackModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		leftTrackModel[139].setRotationPoint(-103.5F, 6F, 24F);

		leftTrackModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412
		leftTrackModel[140].setRotationPoint(-101F, 8.4F, 24F);

		leftTrackModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420
		leftTrackModel[141].setRotationPoint(85F, -9.6F, 24F);

		leftTrackModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421
		leftTrackModel[142].setRotationPoint(85F, 8.4F, 24F);

		leftTrackModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 422
		leftTrackModel[143].setRotationPoint(87.5F, -7F, 24F);

		leftTrackModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		leftTrackModel[144].setRotationPoint(87.5F, 6F, 24F);

		leftTrackModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		leftTrackModel[145].setRotationPoint(89.6F, -4F, 24F);

		leftTrackModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		leftTrackModel[146].setRotationPoint(89.6F, 3F, 24F);

		leftTrackModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 426
		leftTrackModel[147].setRotationPoint(91F, -1F, 24F);
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 2001, 41, textureX, textureY); // Box 209
		rightTrackModel[1] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 210
		rightTrackModel[2] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 211
		rightTrackModel[3] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 212
		rightTrackModel[4] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 213
		rightTrackModel[5] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 214
		rightTrackModel[6] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 215
		rightTrackModel[7] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 216
		rightTrackModel[8] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 217
		rightTrackModel[9] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 218
		rightTrackModel[10] = new ModelRendererTurbo(this, 529, 49, textureX, textureY); // Box 219
		rightTrackModel[11] = new ModelRendererTurbo(this, 561, 49, textureX, textureY); // Box 220
		rightTrackModel[12] = new ModelRendererTurbo(this, 593, 49, textureX, textureY); // Box 221
		rightTrackModel[13] = new ModelRendererTurbo(this, 625, 49, textureX, textureY); // Box 222
		rightTrackModel[14] = new ModelRendererTurbo(this, 657, 49, textureX, textureY); // Box 223
		rightTrackModel[15] = new ModelRendererTurbo(this, 689, 49, textureX, textureY); // Box 224
		rightTrackModel[16] = new ModelRendererTurbo(this, 721, 49, textureX, textureY); // Box 225
		rightTrackModel[17] = new ModelRendererTurbo(this, 753, 49, textureX, textureY); // Box 226
		rightTrackModel[18] = new ModelRendererTurbo(this, 785, 49, textureX, textureY); // Box 227
		rightTrackModel[19] = new ModelRendererTurbo(this, 817, 49, textureX, textureY); // Box 228
		rightTrackModel[20] = new ModelRendererTurbo(this, 849, 49, textureX, textureY); // Box 229
		rightTrackModel[21] = new ModelRendererTurbo(this, 889, 49, textureX, textureY); // Box 230
		rightTrackModel[22] = new ModelRendererTurbo(this, 921, 49, textureX, textureY); // Box 231
		rightTrackModel[23] = new ModelRendererTurbo(this, 953, 49, textureX, textureY); // Box 232
		rightTrackModel[24] = new ModelRendererTurbo(this, 985, 49, textureX, textureY); // Box 233
		rightTrackModel[25] = new ModelRendererTurbo(this, 1017, 49, textureX, textureY); // Box 234
		rightTrackModel[26] = new ModelRendererTurbo(this, 1065, 49, textureX, textureY); // Box 235
		rightTrackModel[27] = new ModelRendererTurbo(this, 1105, 49, textureX, textureY); // Box 236
		rightTrackModel[28] = new ModelRendererTurbo(this, 1145, 49, textureX, textureY); // Box 237
		rightTrackModel[29] = new ModelRendererTurbo(this, 1177, 49, textureX, textureY); // Box 238
		rightTrackModel[30] = new ModelRendererTurbo(this, 1209, 49, textureX, textureY); // Box 239
		rightTrackModel[31] = new ModelRendererTurbo(this, 1241, 49, textureX, textureY); // Box 240
		rightTrackModel[32] = new ModelRendererTurbo(this, 1273, 49, textureX, textureY); // Box 241
		rightTrackModel[33] = new ModelRendererTurbo(this, 1305, 49, textureX, textureY); // Box 242
		rightTrackModel[34] = new ModelRendererTurbo(this, 1337, 49, textureX, textureY); // Box 243
		rightTrackModel[35] = new ModelRendererTurbo(this, 1385, 49, textureX, textureY); // Box 244
		rightTrackModel[36] = new ModelRendererTurbo(this, 1417, 49, textureX, textureY); // Box 245
		rightTrackModel[37] = new ModelRendererTurbo(this, 1449, 49, textureX, textureY); // Box 246
		rightTrackModel[38] = new ModelRendererTurbo(this, 1481, 49, textureX, textureY); // Box 247
		rightTrackModel[39] = new ModelRendererTurbo(this, 1513, 49, textureX, textureY); // Box 248
		rightTrackModel[40] = new ModelRendererTurbo(this, 1545, 49, textureX, textureY); // Box 249
		rightTrackModel[41] = new ModelRendererTurbo(this, 1577, 49, textureX, textureY); // Box 250
		rightTrackModel[42] = new ModelRendererTurbo(this, 1609, 49, textureX, textureY); // Box 251
		rightTrackModel[43] = new ModelRendererTurbo(this, 1641, 49, textureX, textureY); // Box 252
		rightTrackModel[44] = new ModelRendererTurbo(this, 1673, 49, textureX, textureY); // Box 253
		rightTrackModel[45] = new ModelRendererTurbo(this, 1705, 49, textureX, textureY); // Box 254
		rightTrackModel[46] = new ModelRendererTurbo(this, 1737, 49, textureX, textureY); // Box 255
		rightTrackModel[47] = new ModelRendererTurbo(this, 1769, 49, textureX, textureY); // Box 256
		rightTrackModel[48] = new ModelRendererTurbo(this, 1801, 49, textureX, textureY); // Box 257
		rightTrackModel[49] = new ModelRendererTurbo(this, 1833, 49, textureX, textureY); // Box 258
		rightTrackModel[50] = new ModelRendererTurbo(this, 1865, 49, textureX, textureY); // Box 259
		rightTrackModel[51] = new ModelRendererTurbo(this, 1897, 49, textureX, textureY); // Box 260
		rightTrackModel[52] = new ModelRendererTurbo(this, 1929, 49, textureX, textureY); // Box 261
		rightTrackModel[53] = new ModelRendererTurbo(this, 1961, 49, textureX, textureY); // Box 262
		rightTrackModel[54] = new ModelRendererTurbo(this, 2017, 49, textureX, textureY); // Box 263
		rightTrackModel[55] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 264
		rightTrackModel[56] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 265
		rightTrackModel[57] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 266
		rightTrackModel[58] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 267
		rightTrackModel[59] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 268
		rightTrackModel[60] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 269

		rightTrackModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		rightTrackModel[0].setRotationPoint(-98F, -11F, -35F);

		rightTrackModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		rightTrackModel[1].setRotationPoint(-95F, -11F, -35F);

		rightTrackModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		rightTrackModel[2].setRotationPoint(-92F, -11F, -35F);

		rightTrackModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		rightTrackModel[3].setRotationPoint(-89F, -11F, -35F);

		rightTrackModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		rightTrackModel[4].setRotationPoint(-86F, -11F, -35F);

		rightTrackModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		rightTrackModel[5].setRotationPoint(-83F, -11F, -35F);

		rightTrackModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		rightTrackModel[6].setRotationPoint(-80F, -11F, -35F);

		rightTrackModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		rightTrackModel[7].setRotationPoint(-77F, -11F, -35F);

		rightTrackModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		rightTrackModel[8].setRotationPoint(-74F, -11F, -35F);

		rightTrackModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		rightTrackModel[9].setRotationPoint(-71F, -11F, -35F);

		rightTrackModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		rightTrackModel[10].setRotationPoint(-68F, -11F, -35F);

		rightTrackModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		rightTrackModel[11].setRotationPoint(-65F, -11F, -35F);

		rightTrackModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		rightTrackModel[12].setRotationPoint(-62F, -11F, -35F);

		rightTrackModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		rightTrackModel[13].setRotationPoint(-59F, -11F, -35F);

		rightTrackModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		rightTrackModel[14].setRotationPoint(-56F, -11F, -35F);

		rightTrackModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		rightTrackModel[15].setRotationPoint(-53F, -11F, -35F);

		rightTrackModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		rightTrackModel[16].setRotationPoint(-50F, -11F, -35F);

		rightTrackModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		rightTrackModel[17].setRotationPoint(-47F, -11F, -35F);

		rightTrackModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		rightTrackModel[18].setRotationPoint(-44F, -11F, -35F);

		rightTrackModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		rightTrackModel[19].setRotationPoint(-41F, -11F, -35F);

		rightTrackModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		rightTrackModel[20].setRotationPoint(-38F, -11F, -35F);

		rightTrackModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		rightTrackModel[21].setRotationPoint(-35F, -11F, -35F);

		rightTrackModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		rightTrackModel[22].setRotationPoint(-32F, -11F, -35F);

		rightTrackModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		rightTrackModel[23].setRotationPoint(-29F, -11F, -35F);

		rightTrackModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		rightTrackModel[24].setRotationPoint(-26F, -11F, -35F);

		rightTrackModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		rightTrackModel[25].setRotationPoint(7F, -11F, -35F);

		rightTrackModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		rightTrackModel[26].setRotationPoint(-23F, -11F, -35F);

		rightTrackModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		rightTrackModel[27].setRotationPoint(-20F, -11F, -35F);

		rightTrackModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		rightTrackModel[28].setRotationPoint(-17F, -11F, -35F);

		rightTrackModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		rightTrackModel[29].setRotationPoint(-14F, -11F, -35F);

		rightTrackModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		rightTrackModel[30].setRotationPoint(-11F, -11F, -35F);

		rightTrackModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		rightTrackModel[31].setRotationPoint(-8F, -11F, -35F);

		rightTrackModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		rightTrackModel[32].setRotationPoint(-5F, -11F, -35F);

		rightTrackModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		rightTrackModel[33].setRotationPoint(-2F, -11F, -35F);

		rightTrackModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		rightTrackModel[34].setRotationPoint(1F, -11F, -35F);

		rightTrackModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		rightTrackModel[35].setRotationPoint(4F, -11F, -35F);

		rightTrackModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		rightTrackModel[36].setRotationPoint(40F, -11F, -35F);

		rightTrackModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		rightTrackModel[37].setRotationPoint(10F, -11F, -35F);

		rightTrackModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		rightTrackModel[38].setRotationPoint(13F, -11F, -35F);

		rightTrackModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		rightTrackModel[39].setRotationPoint(16F, -11F, -35F);

		rightTrackModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		rightTrackModel[40].setRotationPoint(19F, -11F, -35F);

		rightTrackModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		rightTrackModel[41].setRotationPoint(22F, -11F, -35F);

		rightTrackModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		rightTrackModel[42].setRotationPoint(25F, -11F, -35F);

		rightTrackModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		rightTrackModel[43].setRotationPoint(28F, -11F, -35F);

		rightTrackModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		rightTrackModel[44].setRotationPoint(31F, -11F, -35F);

		rightTrackModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		rightTrackModel[45].setRotationPoint(34F, -11F, -35F);

		rightTrackModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		rightTrackModel[46].setRotationPoint(37F, -11F, -35F);

		rightTrackModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		rightTrackModel[47].setRotationPoint(73F, -11F, -35F);

		rightTrackModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		rightTrackModel[48].setRotationPoint(43F, -11F, -35F);

		rightTrackModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		rightTrackModel[49].setRotationPoint(46F, -11F, -35F);

		rightTrackModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		rightTrackModel[50].setRotationPoint(49F, -11F, -35F);

		rightTrackModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		rightTrackModel[51].setRotationPoint(52F, -11F, -35F);

		rightTrackModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		rightTrackModel[52].setRotationPoint(55F, -11F, -35F);

		rightTrackModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		rightTrackModel[53].setRotationPoint(58F, -11F, -35F);

		rightTrackModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		rightTrackModel[54].setRotationPoint(61F, -11F, -35F);

		rightTrackModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		rightTrackModel[55].setRotationPoint(64F, -11F, -35F);

		rightTrackModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		rightTrackModel[56].setRotationPoint(67F, -11F, -35F);

		rightTrackModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		rightTrackModel[57].setRotationPoint(70F, -11F, -35F);

		rightTrackModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		rightTrackModel[58].setRotationPoint(76F, -11F, -35F);

		rightTrackModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		rightTrackModel[59].setRotationPoint(79F, -11F, -35F);

		rightTrackModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		rightTrackModel[60].setRotationPoint(82F, -11F, -35F);
	}
}