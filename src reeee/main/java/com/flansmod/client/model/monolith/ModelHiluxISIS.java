//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Hilux
// Model Creator: 
// Created on: 14.06.2016 - 16:56:11
// Last changed on: 14.06.2016 - 16:56:11

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelHiluxISIS extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelHiluxISIS() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[162];
		bodyDoorOpenModel = new ModelRendererTurbo[2];
		bodyDoorCloseModel = new ModelRendererTurbo[2];
		barrelModel = new ModelRendererTurbo[13];
		leftFrontWheelModel = new ModelRendererTurbo[3];
		rightFrontWheelModel = new ModelRendererTurbo[3];
		leftBackWheelModel = new ModelRendererTurbo[3];
		rightBackWheelModel = new ModelRendererTurbo[3];
		steeringWheelModel = new ModelRendererTurbo[4];

		initbodyModel_1();
		initbodyDoorOpenModel_1();
		initbodyDoorCloseModel_1();
		initbarrelModel_1();
		initleftFrontWheelModel_1();
		initrightFrontWheelModel_1();
		initleftBackWheelModel_1();
		initrightBackWheelModel_1();
		initsteeringWheelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 28
		bodyModel[24] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 29
		bodyModel[25] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 30
		bodyModel[26] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 31
		bodyModel[27] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 32
		bodyModel[28] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 33
		bodyModel[29] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 34
		bodyModel[30] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 35
		bodyModel[31] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 36
		bodyModel[32] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 37
		bodyModel[33] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 38
		bodyModel[34] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 39
		bodyModel[35] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 40
		bodyModel[36] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 41
		bodyModel[37] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 42
		bodyModel[38] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 43
		bodyModel[39] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 44
		bodyModel[40] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 45
		bodyModel[41] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 46
		bodyModel[42] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 47
		bodyModel[43] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 48
		bodyModel[44] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 49
		bodyModel[45] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 50
		bodyModel[46] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 51
		bodyModel[47] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 52
		bodyModel[48] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 53
		bodyModel[49] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 54
		bodyModel[50] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 55
		bodyModel[51] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 56
		bodyModel[52] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 57
		bodyModel[53] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 58
		bodyModel[54] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 59
		bodyModel[55] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 60
		bodyModel[56] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 61
		bodyModel[57] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 62
		bodyModel[58] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 63
		bodyModel[59] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 64
		bodyModel[60] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 65
		bodyModel[61] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 66
		bodyModel[62] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 67
		bodyModel[63] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 68
		bodyModel[64] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 69
		bodyModel[65] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 70
		bodyModel[66] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 71
		bodyModel[67] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 72
		bodyModel[68] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 73
		bodyModel[69] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 74
		bodyModel[70] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 75
		bodyModel[71] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 76
		bodyModel[72] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 77
		bodyModel[73] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 78
		bodyModel[74] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 79
		bodyModel[75] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 80
		bodyModel[76] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 82
		bodyModel[77] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 83
		bodyModel[78] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 84
		bodyModel[79] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 85
		bodyModel[80] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 87
		bodyModel[81] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 88
		bodyModel[82] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 89
		bodyModel[83] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 90
		bodyModel[84] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 91
		bodyModel[85] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 92
		bodyModel[86] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 93
		bodyModel[87] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 94
		bodyModel[88] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 95
		bodyModel[89] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 96
		bodyModel[90] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 97
		bodyModel[91] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 98
		bodyModel[92] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 99
		bodyModel[93] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 100
		bodyModel[94] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 101
		bodyModel[95] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 103
		bodyModel[96] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 104
		bodyModel[97] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 105
		bodyModel[98] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 106
		bodyModel[99] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 107
		bodyModel[100] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 108
		bodyModel[101] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 109
		bodyModel[102] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 110
		bodyModel[103] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 111
		bodyModel[104] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 112
		bodyModel[105] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 114
		bodyModel[106] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 115
		bodyModel[107] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 116
		bodyModel[108] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 117
		bodyModel[109] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 119
		bodyModel[110] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 120
		bodyModel[111] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 121
		bodyModel[112] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 122
		bodyModel[113] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 123
		bodyModel[114] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 125
		bodyModel[115] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 126
		bodyModel[116] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 127
		bodyModel[117] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 128
		bodyModel[118] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 129
		bodyModel[119] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 130
		bodyModel[120] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 131
		bodyModel[121] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 132
		bodyModel[122] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 133
		bodyModel[123] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 134
		bodyModel[124] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 135
		bodyModel[125] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 136
		bodyModel[126] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Box 139
		bodyModel[127] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 140
		bodyModel[128] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 141
		bodyModel[129] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 142
		bodyModel[130] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 143
		bodyModel[131] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 144
		bodyModel[132] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 145
		bodyModel[133] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 146
		bodyModel[134] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 147
		bodyModel[135] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 148
		bodyModel[136] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 149
		bodyModel[137] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 150
		bodyModel[138] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 151
		bodyModel[139] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 152
		bodyModel[140] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 153
		bodyModel[141] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 154
		bodyModel[142] = new ModelRendererTurbo(this, 409, 97, textureX, textureY); // Box 155
		bodyModel[143] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 156
		bodyModel[144] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 157
		bodyModel[145] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 158
		bodyModel[146] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 159
		bodyModel[147] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Box 160
		bodyModel[148] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 161
		bodyModel[149] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 162
		bodyModel[150] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 163
		bodyModel[151] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 164
		bodyModel[152] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 165
		bodyModel[153] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 166
		bodyModel[154] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 184
		bodyModel[155] = new ModelRendererTurbo(this, 385, 137, textureX, textureY); // Box 185
		bodyModel[156] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 186
		bodyModel[157] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 187
		bodyModel[158] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 188
		bodyModel[159] = new ModelRendererTurbo(this, 297, 129, textureX, textureY); // Box 189
		bodyModel[160] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 190
		bodyModel[161] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 205

		bodyModel[0].addShapeBox(0F, 0F, 0F, 35, 1, 28, 0F,0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[0].setRotationPoint(17.5F, 2.5F, -14F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 35, 5, 1, 0F,1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 2
		bodyModel[1].setRotationPoint(17.5F, -2.5F, -15.8F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 38, 9, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 3
		bodyModel[2].setRotationPoint(16.5F, -11.5F, -15F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0.8F, 0F, 1.5F, 0.8F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 4
		bodyModel[3].setRotationPoint(32.5F, -15.5F, -13.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F); // Box 5
		bodyModel[4].setRotationPoint(32.5F, -19F, -12F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 6
		bodyModel[5].setRotationPoint(19F, -9.3F, -15.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 7
		bodyModel[6].setRotationPoint(35.3F, -9.2F, -15.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,-0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 1.5F, 0.5F, 0F, 1.5F, 0.5F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 8
		bodyModel[7].setRotationPoint(16F, -15.5F, -13.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-0.8F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.8F, 0F, 0F, -0.2F, 0.5F, 1.5F, 0.5F, 0.5F, 1.5F, 0.5F, 0.5F, -1.5F, -0.2F, 0.5F, -1.5F); // Box 9
		bodyModel[8].setRotationPoint(16F, -19F, -12F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,2.3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2.3F, 0F, 0F, 0F, 0F, 1.5F, 0.8F, 0F, 1.5F, 2.8F, 0F, -0.5F, 0F, 0F, -1.5F); // Box 10
		bodyModel[9].setRotationPoint(50.2F, -15.5F, -13.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0.2F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.2F, 0F, 0F, -7.8F, 0.5F, 1.5F, 7F, 0.5F, 1.5F, 7F, 0.5F, -1.5F, -7.8F, 0.5F, -1.5F); // Box 11
		bodyModel[10].setRotationPoint(40.2F, -19F, -12F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,15F, 0F, -1F, 0F, 0F, -1F, 0F, 0.3F, 0.8F, 15F, 0.3F, 0.8F, 15.7F, 0.5F, 0F, 9.2F, 0.5F, 0F, 9.2F, 0.5F, 0F, 15.7F, 0.5F, 0F); // Box 12
		bodyModel[11].setRotationPoint(32.5F, -20.5F, -12F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 18, 1, 10, 0F,0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 1F, 9.2F, 0.5F, 1F, 9.2F, 0.5F, 0F, 0.5F, 0F, 0F); // Box 12
		bodyModel[12].setRotationPoint(17.5F, -20.5F, -10F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 18, 1, 10, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0.5F, 0F, 0F, 9.2F, 0.5F, 0F, 9.2F, 0.5F, 1F, 0.5F, 0F, 1F); // Box 14
		bodyModel[13].setRotationPoint(17.5F, -20.5F, 0F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 8, 5, 28, 0F,0F, 0F, 0F, -0.75F, 0.2F, 0F, -0.75F, 0.2F, 0F, 0F, 0F, 0F, 1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1.5F, 0F); // Box 15
		bodyModel[14].setRotationPoint(48F, -9F, -14F);
		bodyModel[14].rotateAngleZ = 0.34906585F;

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 16, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F); // Box 16
		bodyModel[15].setRotationPoint(33.5F, -13F, -12.5F);
		bodyModel[15].rotateAngleZ = 0.10471976F;

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 16, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F); // Box 17
		bodyModel[16].setRotationPoint(33.5F, -13F, 3.5F);
		bodyModel[16].rotateAngleZ = 0.10471976F;

		bodyModel[17].addShapeBox(0F, 0F, 0F, 9, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[17].setRotationPoint(36.5F, -2F, -13F);
		bodyModel[17].rotateAngleZ = 0.03490659F;

		bodyModel[18].addShapeBox(0F, 0F, 0F, 9, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[18].setRotationPoint(36.5F, -2F, 3F);
		bodyModel[18].rotateAngleZ = 0.03490659F;

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,-0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[19].setRotationPoint(33.5F, -16F, -11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,-0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[20].setRotationPoint(33.5F, -16F, 5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 9, 5, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[21].setRotationPoint(19.5F, -2F, -14.5F);
		bodyModel[21].rotateAngleZ = 0.03490659F;

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 15, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F); // Box 23
		bodyModel[22].setRotationPoint(16.5F, -13F, -14F);
		bodyModel[22].rotateAngleZ = 0.10471976F;

		bodyModel[23].addShapeBox(0F, 0F, -0.5F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 28
		bodyModel[23].setRotationPoint(44F, -19.18F, 0F);
		bodyModel[23].rotateAngleZ = -0.29670597F;

		bodyModel[24].addShapeBox(0F, 0.3F, -1.5F, 1, 2, 3, 0F,-0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Box 29
		bodyModel[24].setRotationPoint(42.9F, -18.1F, 0F);
		bodyModel[24].rotateAngleZ = 0.34906585F;

		bodyModel[25].addShapeBox(0F, 0F, 0F, 10, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[25].setRotationPoint(42.5F, -1.8F, -2F);
		bodyModel[25].rotateAngleZ = 0.10471976F;

		bodyModel[26].addShapeBox(0F, 0F, 0F, 8, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[26].setRotationPoint(34.5F, -5F, -2.5F);
		bodyModel[26].rotateAngleZ = -0.03490659F;

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 5, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[27].setRotationPoint(48.5F, -6.8F, -2F);
		bodyModel[27].rotateAngleZ = -0.08726646F;

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[28].setRotationPoint(45.5F, -4.8F, 0F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 5, 4, 10, 0F,0F, 0F, -2F, -0.5F, 0.2F, -2F, -0.5F, 0.2F, -2F, 0F, 0F, -2F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F); // Box 34
		bodyModel[29].setRotationPoint(50.5F, -12F, 3F);
		bodyModel[29].rotateAngleZ = -0.19198622F;

		bodyModel[30].addShapeBox(0F, 0F, 0F, 35, 5, 1, 0F,1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 35
		bodyModel[30].setRotationPoint(17.5F, -2.5F, 14.8F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 38, 9, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F); // Box 36
		bodyModel[31].setRotationPoint(16.5F, -11.5F, 14F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.8F, 0F, -1.5F, 0.8F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 37
		bodyModel[32].setRotationPoint(32.5F, -15.5F, 12.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F); // Box 38
		bodyModel[33].setRotationPoint(32.5F, -19F, 11F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 39
		bodyModel[34].setRotationPoint(19F, -9.3F, 14.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 40
		bodyModel[35].setRotationPoint(35.3F, -9.2F, 14.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,-0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 41
		bodyModel[36].setRotationPoint(16F, -15.5F, 12.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-0.8F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.8F, 0F, 0F, -0.2F, 0.5F, -1.5F, 0.5F, 0.5F, -1.5F, 0.5F, 0.5F, 1.5F, -0.2F, 0.5F, 1.5F); // Box 42
		bodyModel[37].setRotationPoint(16F, -19F, 11F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,2.3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2.3F, 0F, 0F, 0F, 0F, -1.5F, 2.8F, 0F, -0.5F, 0.8F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 43
		bodyModel[38].setRotationPoint(50.2F, -15.5F, 12.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0.2F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.2F, 0F, 0F, -7.8F, 0.5F, -1.5F, 7F, 0.5F, -1.5F, 7F, 0.5F, 1.5F, -7.8F, 0.5F, 1.5F); // Box 44
		bodyModel[39].setRotationPoint(40.2F, -19F, 11F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,15F, 0.3F, 0.8F, 0F, 0.3F, 0.8F, 0F, 0F, -1F, 15F, 0F, -1F, 15.7F, 0.5F, 0F, 9.2F, 0.5F, 0F, 9.2F, 0.5F, 0F, 15.7F, 0.5F, 0F); // Box 45
		bodyModel[40].setRotationPoint(32.5F, -20.5F, 11F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -2F); // Box 46
		bodyModel[41].setRotationPoint(-4F, 0F, 10F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 47
		bodyModel[42].setRotationPoint(-2.5F, -3F, 10F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F,-0.6F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.6F, 0F, 0F, 1.2F, -0.3F, 0F, -4.8F, -0.3F, 0F, -4.8F, -0.3F, 0F, 1.2F, -0.3F, 0F); // Box 48
		bodyModel[43].setRotationPoint(-1.5F, -4.7F, 10F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F,-0.8F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, 0F, 0F, -4.8F, -0.3F, 0F, 1.2F, -0.3F, 0F, 1.2F, -0.3F, 0F, -4.8F, -0.3F, 0F); // Box 49
		bodyModel[44].setRotationPoint(7.8F, -4.7F, 10F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -1.5F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, 0F, -1.5F, 0F, 0F); // Box 50
		bodyModel[45].setRotationPoint(12.8F, -3F, 10F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.3F, 0F, 0.5F, 0.6F, 0F, 0.5F, 0.6F, -2F, -0.5F, 0.3F, -1F); // Box 51
		bodyModel[46].setRotationPoint(14.3F, 0F, 10F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 15, 2, 6, 0F,-5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[47].setRotationPoint(-0.899999999999999F, -6.7F, 10F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[48].setRotationPoint(-4F, 0F, -16F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 54
		bodyModel[49].setRotationPoint(-2.5F, -3F, -16F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F,-0.6F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.6F, 0F, 0F, 1.2F, -0.3F, 0F, -4.8F, -0.3F, 0F, -4.8F, -0.3F, 0F, 1.2F, -0.3F, 0F); // Box 55
		bodyModel[50].setRotationPoint(-1.5F, -4.7F, -16F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F,-0.8F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, 0F, 0F, -4.8F, -0.3F, 0F, 1.2F, -0.3F, 0F, 1.2F, -0.3F, 0F, -4.8F, -0.3F, 0F); // Box 56
		bodyModel[51].setRotationPoint(7.8F, -4.7F, -16F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -1.5F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, 0F, -1.5F, 0F, 0F); // Box 57
		bodyModel[52].setRotationPoint(12.8F, -3F, -16F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.3F, -1F, 0.5F, 0.6F, -2F, 0.5F, 0.6F, 0F, -0.5F, 0.3F, 0F); // Box 58
		bodyModel[53].setRotationPoint(14.3F, 0F, -16F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 15, 2, 6, 0F,-5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[54].setRotationPoint(-0.899999999999999F, -6.7F, -16F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2F, -0.3F, -0.2F, -1F, -0.3F, -0.2F, 0F, 0.5F, 0F, 0F); // Box 60
		bodyModel[55].setRotationPoint(53F, 0F, -16F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,0.2F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.2F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.5F, 0F, 0F); // Box 61
		bodyModel[56].setRotationPoint(54.5F, -3F, -16F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,-0.6F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.6F, 0F, 0F, 1.2F, -0.3F, 0F, -4.3F, -0.3F, 0F, -4.3F, -0.3F, 0F, 1.2F, -0.3F, 0F); // Box 62
		bodyModel[57].setRotationPoint(55.5F, -4.7F, -16F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,-0.8F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, 0F, 0F, -3.8F, -0.3F, 0F, 1.2F, -0.3F, 0F, 1.2F, -0.3F, 0F, -3.8F, -0.3F, 0F); // Box 63
		bodyModel[58].setRotationPoint(64.8F, -4.7F, -16F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -1.5F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, 0F, -1.5F, 0F, 0F); // Box 64
		bodyModel[59].setRotationPoint(68.8F, -3F, -16F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.3F, -1F, 0.5F, 0.6F, -2F, 0.5F, 0.6F, 0F, -0.5F, 0.3F, 0F); // Box 65
		bodyModel[60].setRotationPoint(70.3F, 0F, -16F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,-4F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[61].setRotationPoint(56.1F, -6.7F, -16F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, -1F, 0.5F, 0F, -2F); // Box 67
		bodyModel[62].setRotationPoint(53F, 0F, 10F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,0.2F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.2F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.5F, 0F, 0F); // Box 68
		bodyModel[63].setRotationPoint(54.5F, -3F, 10F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,-0.6F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.6F, 0F, 0F, 1.2F, -0.3F, 0F, -4.3F, -0.3F, 0F, -4.3F, -0.3F, 0F, 1.2F, -0.3F, 0F); // Box 69
		bodyModel[64].setRotationPoint(55.5F, -4.7F, 10F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,-0.8F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, 0F, 0F, -3.8F, -0.3F, 0F, 1.2F, -0.3F, 0F, 1.2F, -0.3F, 0F, -3.8F, -0.3F, 0F); // Box 70
		bodyModel[65].setRotationPoint(64.8F, -4.7F, 10F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -1.5F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, 0F, -1.5F, 0F, 0F); // Box 71
		bodyModel[66].setRotationPoint(68.8F, -3F, 10F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.3F, 0F, 0.5F, 0.6F, 0F, 0.5F, 0.6F, -2F, -0.5F, 0.3F, -1F); // Box 72
		bodyModel[67].setRotationPoint(70.3F, 0F, 10F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,-4F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[68].setRotationPoint(56.1F, -6.7F, 10F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, -0.2F, 0F, -1F, -0.2F, 0F, 0.3F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, -0.5F, 0F, -1F, -0.3F, 0F, 0.3F, 0F, 0F, -1F, 0F, 0F); // Box 74
		bodyModel[69].setRotationPoint(50.2F, -14F, -19F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,-1F, 0F, -0.3F, 0.3F, 0F, -0.3F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, 0F, 0F, 0.3F, 0F, 0F, -1F, -0.3F, 0F, 0F, -0.5F, 0F); // Box 75
		bodyModel[70].setRotationPoint(50.2F, -14F, 15F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 12, 2, 26, 0F,0.2F, 0F, 0F, 0F, -0.8F, -2.8F, 0F, -0.8F, -2.8F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, -2.8F, 0F, 0.8F, -2.8F, 0F, 0F, 0F); // Box 76
		bodyModel[71].setRotationPoint(55F, -12F, -13F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 9, 2, 20, 0F,0F, 0F, 0.2F, 0F, -2.2F, -2.8F, 0F, -2.2F, -2.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.3F, 0.8F, -2.8F, 0.3F, 0.8F, -2.8F, 0F, 0F, 0.2F); // Box 77
		bodyModel[72].setRotationPoint(67F, -11.2F, -10F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0.2F, -0.8F, -3F, -0.4F, 0F, -2.2F, 1.8F, 0F, 0F, -1.2F, 0F, 0F, 0.2F, 0.2F, 1.8F, -0.8F, 0.3F, 0.8F, 1.8F, 0F, 0F, -1.2F); // Box 78
		bodyModel[73].setRotationPoint(67F, -11.2F, -10F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, -1.2F, 0F, -2.2F, 1.8F, -0.8F, -3F, -0.4F, 0F, 0F, 0.2F, 0F, 0F, -1.2F, 0.3F, 0.8F, 1.8F, 0.2F, 1.8F, -0.8F, 0F, 0F, 0.2F); // Box 79
		bodyModel[74].setRotationPoint(67F, -11.2F, 9F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 14, 2, 4, 0F,0F, 0F, -0.5F, -1F, -1F, -1F, -1F, -0.5F, 0.8F, -1F, 0.4F, -2F, 0F, 0F, 0.2F, -1F, 0F, -0.3F, -1F, 0.1F, 0.8F, 0F, 0F, 0F); // Box 80
		bodyModel[75].setRotationPoint(54F, -11.5F, -15F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 14, 2, 4, 0F,-1F, 0.4F, -2F, -1F, -0.5F, 0.8F, -1F, -1F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0.1F, 0.8F, -1F, 0F, -0.3F, 0F, 0F, 0.2F); // Box 82
		bodyModel[76].setRotationPoint(54F, -11.5F, 11F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,-1F, -0.5F, 0.8F, 3.3F, -3.29F, 1.5F, -2.5F, -2F, -1.5F, -1F, -1F, -1F, -1F, 0.1F, 0.8F, 3.3F, 1.3F, 1.5F, -2F, 1F, -0.8F, -1F, 0F, -0.3F); // Box 83
		bodyModel[77].setRotationPoint(66F, -11.5F, 11F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,-1F, -1F, -1F, -2.5F, -2F, -1.5F, 3.3F, -3.29F, 1.5F, -1F, -0.5F, 0.8F, -1F, 0F, -0.3F, -2F, 1F, -0.8F, 3.3F, 1.3F, 1.5F, -1F, 0.1F, 0.8F); // Box 84
		bodyModel[78].setRotationPoint(66F, -11.5F, -15F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, -1F, 0.5F, -0.8F, 1.2F, 0.5F, -0.9F, 1.5F, 0.5F, 0.8F, -1F, 0F, 0.8F); // Box 85
		bodyModel[79].setRotationPoint(75.2F, -7.4F, -9.2F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.2F, 0.5F, 1F, 0.5F, 0.5F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0.2F, 0.5F, 1F, 0.2F, 0.5F); // Box 87
		bodyModel[80].setRotationPoint(77.2F, -4.8F, 0F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,1F, 0.5F, 0.5F, -0.5F, 0.2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0.8F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[81].setRotationPoint(77.2F, -4.8F, -8F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 7, 7, 1, 0F,0.5F, 0F, 0.2F, -0.5F, 0F, -0.07F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.8F, 0F, -3.5F, 0.8F, 0F, -3.5F, -0.8F, 0F, 0F, -0.8F); // Box 89
		bodyModel[82].setRotationPoint(54.5F, -9.5F, -15F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,0.5F, 0F, -0.07F, 0.5F, 0F, -0.3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -3.5F, 0.8F, 0.5F, -2F, 0.8F, 0.5F, -2F, -0.8F, 0F, -3.5F, -0.8F); // Box 90
		bodyModel[83].setRotationPoint(61.5F, -9.5F, -15F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 10, 28, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, 0.5F, 0F, 0F); // Box 91
		bodyModel[84].setRotationPoint(52F, -7F, -14F);

		bodyModel[85].addShapeBox(0F, -0.5F, 0F, 1, 1, 16, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 92
		bodyModel[85].setRotationPoint(76.2F, -5.8F, -8F);
		bodyModel[85].rotateAngleZ = -0.13962634F;

		bodyModel[86].addShapeBox(0F, -0.5F, 0F, 1, 1, 16, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 93
		bodyModel[86].setRotationPoint(75.8F, -6.7F, -8F);
		bodyModel[86].rotateAngleZ = -0.13962634F;

		bodyModel[87].addShapeBox(0F, -0.5F, 0F, 1, 1, 16, 0F,-0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F); // Box 94
		bodyModel[87].setRotationPoint(75.4F, -7.5F, -8F);
		bodyModel[87].rotateAngleZ = -0.13962634F;

		bodyModel[88].addShapeBox(0F, -2F, 0F, 1, 5, 17, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 95
		bodyModel[88].setRotationPoint(74.8F, -6.7F, -8.5F);
		bodyModel[88].rotateAngleZ = 0.29670597F;

		bodyModel[89].addShapeBox(0.3F, 2F, 0F, 1, 1, 17, 0F,1.2F, -0.3F, -0.1F, 1.2F, -0.3F, -0.1F, 1.2F, -0.3F, -0.1F, 1.2F, -0.3F, -0.1F, 1.2F, -0.3F, -0.1F, 1.2F, -0.3F, -0.1F, 1.2F, -0.3F, -0.1F, 1.2F, -0.3F, -0.1F); // Box 96
		bodyModel[89].setRotationPoint(74.8F, -6.7F, -8.5F);
		bodyModel[89].rotateAngleZ = 0.12217305F;

		bodyModel[90].addShapeBox(0F, -2F, 0F, 1, 5, 1, 0F,0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F); // Box 97
		bodyModel[90].setRotationPoint(74.8F, -6.5F, -8.5F);
		bodyModel[90].rotateAngleZ = 0.29670597F;

		bodyModel[91].addShapeBox(0F, -2F, 0F, 1, 5, 1, 0F,0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F); // Box 98
		bodyModel[91].setRotationPoint(74.8F, -6.5F, 7.5F);
		bodyModel[91].rotateAngleZ = 0.29670597F;

		bodyModel[92].addShapeBox(0F, 0F, 0F, 7, 7, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.07F, 0.5F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, -3.5F, -0.8F, 0F, -3.5F, 0.8F, 0F, 0F, 0.8F); // Box 99
		bodyModel[92].setRotationPoint(54.5F, -9.5F, 14F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.07F, 0F, -3.5F, -0.8F, 0.5F, -2F, -0.8F, 0.5F, -2F, 0.8F, 0F, -3.5F, 0.8F); // Box 100
		bodyModel[93].setRotationPoint(61.5F, -9.5F, 14F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 3, 7, 2, 0F,0F, 0F, -0.3F, 0F, -1F, -0.8F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, -2F, 0.8F, 3F, -3F, -0.2F, 4F, -3F, 0F, 0F, -2F, -0.8F); // Box 101
		bodyModel[94].setRotationPoint(67F, -9.5F, -15F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 3, 7, 2, 0F,0F, 0F, 0F, 1F, -1F, 0F, 0F, -1F, -0.8F, 0F, 0F, -0.3F, 0F, -2F, -0.8F, 4F, -3F, 0F, 3F, -3F, -0.2F, 0F, -2F, 0.8F); // Box 103
		bodyModel[95].setRotationPoint(67F, -9.5F, 13F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,-6F, 0F, -1F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -1F, 0.8F, -1.2F, 0.5F, 0.8F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[96].setRotationPoint(67F, -5.5F, -15.8F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,-6F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, -6F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0.8F, 0F, -1F, 0.8F, -1.2F, 0F, 0F, 0F); // Box 105
		bodyModel[97].setRotationPoint(67F, -5.5F, 12.8F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1.7F, -0.5F, 0.3F, -1F, -0.5F, 0.5F, 0F, -0.3F, 0F, 0.5F, -0.2F, 0F, 2.2F, -0.1F, 0.3F, -1.2F, -0.1F, 0.3F); // Box 106
		bodyModel[98].setRotationPoint(75F, -5.5F, -12.8F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-1F, -0.5F, 0.5F, 1.7F, -0.5F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, -0.1F, 0.3F, 2.2F, -0.1F, 0.3F, 0.5F, -0.2F, 0F, 0F, -0.3F, 0F); // Box 107
		bodyModel[99].setRotationPoint(75F, -5.5F, 8.8F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,-1F, 0F, 0F, -0.5F, -0.8F, -0.5F, 0.5F, -0.5F, 0F, -1F, 1F, 0F, -3F, 0F, 1.5F, 0F, 1F, 0.5F, 2F, 0.5F, 0.8F, -4F, 0F, 0F); // Box 108
		bodyModel[100].setRotationPoint(69F, -8.5F, -13F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0.8F, 1.5F, 0.5F, 0.8F, 1.2F, 0.5F, -0.9F, -1F, 0.5F, -0.8F); // Box 109
		bodyModel[101].setRotationPoint(75.2F, -7.4F, 8.2F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,-1F, 1F, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.8F, -0.5F, -1F, 0F, 0F, -4F, 0F, 0F, 2F, 0.5F, 0.8F, 0F, 1F, 0.5F, -3F, 0F, 1.5F); // Box 110
		bodyModel[102].setRotationPoint(69F, -8.5F, 9F);

		bodyModel[103].addShapeBox(0F, -0.5F, 0F, 1, 2, 3, 0F,0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 111
		bodyModel[103].setRotationPoint(76F, -7.7F, -1.5F);
		bodyModel[103].rotateAngleZ = 0.2443461F;

		bodyModel[104].addShapeBox(0F, 0F, 0F, 9, 2, 3, 0F,-3F, 1.5F, -0.42F, -1F, 0.8F, -1.2F, 0.5F, 0.8F, 0F, -2F, 0F, 0F, -5F, -0.3F, -0.5F, -0.5F, -0.3F, -1F, 1F, -0.3F, 0F, -6F, -0.3F, 0F); // Box 112
		bodyModel[104].setRotationPoint(67F, -3F, -15.8F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 9, 2, 3, 0F,-2F, 0F, 0F, 0.5F, 0.8F, 0F, -1F, 0.8F, -1.2F, -3F, 1.5F, -0.42F, -6F, -0.3F, 0F, 1F, -0.3F, 0F, -0.5F, -0.3F, -1F, -5F, -0.3F, -0.5F); // Box 114
		bodyModel[105].setRotationPoint(67F, -3F, 12.8F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-1.2F, -0.1F, 0.3F, 2.2F, -0.1F, 0.3F, 0.5F, 0F, 0F, 0F, -0.3F, 0F, 3F, 0F, 0.5F, 1.7F, 0F, 0.3F, 1F, 0.4F, 0F, 3F, 0.4F, 0F); // Box 115
		bodyModel[106].setRotationPoint(75F, -3.7F, 8.8F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,1F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0.8F, 0.4F, 0F, 0F, 0F, 0F, 1F, 0.7F, 0.5F, -0.2F, 0.7F, 0.5F, 0.8F, 0.7F, 0F, 0F, 0.7F, 0F); // Box 116
		bodyModel[107].setRotationPoint(77.2F, -3.4F, -8F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0.8F, 0.4F, 0F, 0F, 0.2F, 0.5F, 1F, 0.2F, 0.5F, 0F, 0.7F, 0F, 0.8F, 0.7F, 0F, -0.2F, 0.7F, 0.5F, 1F, 0.7F, 0.5F); // Box 117
		bodyModel[108].setRotationPoint(77.2F, -3.4F, 0F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,6F, 0F, 0F, 0.15F, 0F, 0F, -0.25F, 0F, 0F, 6F, 0F, 4F, 6F, 0.2F, 0.5F, -1F, 0F, 0.5F, -1.5F, 0F, 1.5F, 6F, 0.2F, 4.5F); // Box 119
		bodyModel[109].setRotationPoint(77F, -1.7F, 7.4F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 1.45F, 0F, 0.65F, 0F, 0F, 0F, 0.2F, 0F, 1.2F, -0.3F, 0.1F, 1F, 1F, -0.2F, 0.1F, -0.5F, 0F, -0.5F, -0.3F, 0.1F, 0F); // Box 120
		bodyModel[110].setRotationPoint(73.5F, 1.5F, 11F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.3F, 0F, 0.5F, 0F, 0F, 2.2F, -0.1F, 0.3F, -1.2F, -0.1F, 0.3F, 3F, 0.4F, 0F, 1F, 0.4F, 0F, 1.7F, 0F, 0.3F, 3F, 0F, 0.5F); // Box 121
		bodyModel[111].setRotationPoint(75F, -3.7F, -12.8F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,6F, 0F, 4F, -0.25F, 0F, 0F, 0.15F, 0F, 0F, 6F, 0F, 0F, 6F, 0.2F, 4.5F, -1.5F, 0F, 1.5F, -1F, 0F, 0.5F, 6F, 0.2F, 0.5F); // Box 122
		bodyModel[112].setRotationPoint(77F, -1.7F, -9.4F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0.2F, 0F, 1.2F, 0F, 0F, 0F, 1.45F, 0F, 0.65F, 0F, 0F, 0F, -0.3F, 0.1F, 0F, -0.5F, 0F, -0.5F, 1F, -0.2F, 0.1F, -0.3F, 0.1F, 1F); // Box 123
		bodyModel[113].setRotationPoint(73.5F, 1.5F, -14F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 9, 2, 3, 0F,-5F, -0.2F, -0.4F, -0.5F, -0.2F, -1F, 1F, -0.2F, 0F, -3F, 0.7F, 1F, -6.35F, 1F, -0.61F, -0.6F, 1F, -1.8F, -0.1F, 1F, 0F, -4F, 1F, 1F); // Box 125
		bodyModel[114].setRotationPoint(67F, -1.5F, -15.8F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 9, 2, 3, 0F,-3F, 0.7F, 1F, 1F, -0.2F, 0F, -0.5F, -0.2F, -1F, -5F, -0.2F, -0.4F, -4F, 1F, 1F, -0.1F, 1F, 0F, -0.6F, 1F, -1.8F, -6.35F, 1F, -0.61F); // Box 126
		bodyModel[115].setRotationPoint(67F, -1.5F, 12.8F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 7, 2, 15, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 127
		bodyModel[116].setRotationPoint(70.4F, 1.3F, -7.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 5, 3, 15, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 128
		bodyModel[117].setRotationPoint(72.4F, -1.7F, -7.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 19, 9, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[118].setRotationPoint(52.5F, -5.5F, -10F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[119].setRotationPoint(-12.5F, -7.5F, -15.8F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,10F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0.5F, 2F, -0.5F, 0.5F, 2F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[120].setRotationPoint(14.5F, -7.5F, -15.8F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[121].setRotationPoint(-12.5F, -7.5F, 14.8F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,10F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0.5F, 2F, 0F, 0.5F, 2F, -0.5F, 0F, 0F, 0F); // Box 133
		bodyModel[122].setRotationPoint(14.5F, -7.5F, 14.8F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F,-5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[123].setRotationPoint(-0.899999999999999F, -6.7F, 9.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F,-0.6F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.6F, 0F, 0F, 1.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 1.2F, -0.3F, 0F); // Box 135
		bodyModel[124].setRotationPoint(-1.5F, -4.7F, 9.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,-0.8F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, 0F, 0F, -4.8F, -0.3F, 0F, 1.2F, -0.3F, 0F, 1.2F, -0.3F, 0F, -4.8F, -0.3F, 0F); // Box 136
		bodyModel[125].setRotationPoint(7.8F, -4.7F, 9.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 21, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[126].setRotationPoint(-4F, 0F, 9.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 19, 3, 1, 0F,0.2F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, 0.2F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 140
		bodyModel[127].setRotationPoint(-2.5F, -3F, 9.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -1.5F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, 0F, -1.5F, 0F, 0F); // Box 141
		bodyModel[128].setRotationPoint(14.8F, -3F, 9.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.3F, 0F, 0.5F, 0.6F, 0F, 0.5F, 0.6F, 0F, -0.5F, 0.3F, 0F); // Box 142
		bodyModel[129].setRotationPoint(14.3F, 0F, 9.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F,-5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[130].setRotationPoint(-0.899999999999999F, -6.7F, -10.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F,-0.6F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.6F, 0F, 0F, 1.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 1.2F, -0.3F, 0F); // Box 144
		bodyModel[131].setRotationPoint(-1.5F, -4.7F, -10.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,-0.8F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, 0F, 0F, -4.8F, -0.3F, 0F, 1.2F, -0.3F, 0F, 1.2F, -0.3F, 0F, -4.8F, -0.3F, 0F); // Box 145
		bodyModel[132].setRotationPoint(7.8F, -4.7F, -10.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 21, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[133].setRotationPoint(-4F, 0F, -10.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 19, 3, 1, 0F,0.2F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, 0.2F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 147
		bodyModel[134].setRotationPoint(-2.5F, -3F, -10.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -1.5F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, 0F, -1.5F, 0F, 0F); // Box 148
		bodyModel[135].setRotationPoint(12.8F, -3F, -10.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.3F, 0F, 0.5F, 0.6F, 0F, 0.5F, 0.6F, 0F, -0.5F, 0.3F, 0F); // Box 149
		bodyModel[136].setRotationPoint(14.3F, 0F, -10.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 150
		bodyModel[137].setRotationPoint(-13.5F, -2.5F, 14.8F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 151
		bodyModel[138].setRotationPoint(-13.5F, -2.5F, -15.8F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 10, 2, 16, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 152
		bodyModel[139].setRotationPoint(-12.5F, 0.5F, -14.8F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 10, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 153
		bodyModel[140].setRotationPoint(-12.5F, 0.5F, -1.2F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 5, 3, 15, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0.5F, -1F, 0.7F, 0.5F); // Box 154
		bodyModel[141].setRotationPoint(-15.5F, -0.5F, -15.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 5, 3, 15, 0F,0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0.7F, 0.5F, 0F, 0.7F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 155
		bodyModel[142].setRotationPoint(-15.5F, -0.5F, 0.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[143].setRotationPoint(-15.5F, 1F, -2.5F);
		bodyModel[143].rotateAngleZ = 0.26179939F;

		bodyModel[144].addShapeBox(0F, 0F, 0F, 21, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, -0.5F); // Box 157
		bodyModel[144].setRotationPoint(-3.5F, 0.5F, -10F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 2, 1, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[145].setRotationPoint(-14.5F, -1.5F, -15F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 29, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[146].setRotationPoint(-12.5F, -11.4F, -14.8F);
		bodyModel[146].rotateAngleX = -0.2443461F;

		bodyModel[147].addShapeBox(0F, 0F, -1F, 29, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[147].setRotationPoint(-12.5F, -11.4F, 14.8F);
		bodyModel[147].rotateAngleX = 0.2443461F;

		bodyModel[148].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F,-0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[148].setRotationPoint(-14.5F, -7.5F, -15.8F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F); // Box 162
		bodyModel[149].setRotationPoint(-14.5F, -7.5F, 12.8F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,-1F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[150].setRotationPoint(-14.5F, -11.5F, -15.8F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F); // Box 164
		bodyModel[151].setRotationPoint(-14.5F, -11.5F, 12.8F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[152].setRotationPoint(-14.5F, -2.5F, -15.8F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.5F, 0F, -1F); // Box 166
		bodyModel[153].setRotationPoint(-14.5F, -2.5F, 12.8F);

		bodyModel[154].addShapeBox(0F, 0F, -1F, 3, 3, 1, 0F,0F, 0F, 28F, -1F, 0F, 28F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 28F, -1F, 10F, 28F, -1F, 10F, 0F, 0F, 10F, 0F); // Box 184
		bodyModel[154].setRotationPoint(14.8F, -11.5F, 14.5F);

		bodyModel[155].addBox(0F, 0F, 0F, 27, 1, 1, 0F); // Box 185
		bodyModel[155].setRotationPoint(-11F, -12.5F, 14F);

		bodyModel[156].addBox(0F, 0F, 0F, 27, 1, 1, 0F); // Box 186
		bodyModel[156].setRotationPoint(-11F, -12.5F, -15F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[157].setRotationPoint(15F, -23.5F, -15F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[158].setRotationPoint(15F, -23.5F, 14F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[159].setRotationPoint(15F, -23.5F, -9F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 25, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[160].setRotationPoint(-0.5F, -24.5F, -0.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 108, 2, 114, 0F,0F, 0F, 0F, -100F, 0F, 0F, -100F, 0F, -100F, 0F, 0F, -100F, 0F, 0F, 0F, -100F, 0F, 0F, -100F, 0F, -100F, 0F, 0F, -100F); // Box 205
		bodyModel[161].setRotationPoint(66F, -11.5F, -7F);
		bodyModel[161].rotateAngleZ = -0.2443461F;
	}

	private void initbodyDoorOpenModel_1()
	{
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 169
		bodyDoorOpenModel[1] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 170

		bodyDoorOpenModel[0].addShapeBox(-2.5F, -10F, 0F, 2, 4, 26, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyDoorOpenModel[0].setRotationPoint(-14.5F, -1.5F, -13F);
		bodyDoorOpenModel[0].rotateAngleZ = 1.57079633F;

		bodyDoorOpenModel[1].addShapeBox(-2.5F, -6F, 0F, 2, 6, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyDoorOpenModel[1].setRotationPoint(-14.5F, -1.5F, -13F);
		bodyDoorOpenModel[1].rotateAngleZ = 1.57079633F;
	}

	private void initbodyDoorCloseModel_1()
	{
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 167
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 168

		bodyDoorCloseModel[0].addShapeBox(0F, -6F, 0F, 2, 6, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyDoorCloseModel[0].setRotationPoint(-14.5F, -1.5F, -13F);

		bodyDoorCloseModel[1].addShapeBox(0F, -10F, 0F, 2, 4, 26, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyDoorCloseModel[1].setRotationPoint(-14.5F, -1.5F, -13F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 191
		barrelModel[1] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 192
		barrelModel[2] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 193
		barrelModel[3] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 195
		barrelModel[4] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 196
		barrelModel[5] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 197
		barrelModel[6] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 198
		barrelModel[7] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 199
		barrelModel[8] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 200
		barrelModel[9] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 201
		barrelModel[10] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 202
		barrelModel[11] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 203
		barrelModel[12] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 204

		barrelModel[0].addShapeBox(-8F, -1F, -1F, 7, 3, 2, 0F,0.3F, -0.4F, 0.1F, 0.3F, -0.4F, 0.1F, 0.3F, -0.4F, 0.1F, 0.3F, -0.4F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 191
		barrelModel[0].setRotationPoint(0F, -25.5F, 0F);

		barrelModel[1].addShapeBox(-1F, -1F, -0.5F, 7, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 192
		barrelModel[1].setRotationPoint(0F, -24.5F, 0F);

		barrelModel[2].addShapeBox(-1F, 0F, -0.5F, 3, 1, 1, 0F,0.3F, -0.2F, 0.55F, 0.3F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.3F, -0.2F, 0.55F, 0.3F, -0.2F, 0.55F, 0.3F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.3F, -0.2F, 0.55F); // Box 193
		barrelModel[2].setRotationPoint(0F, -24.8F, 0F);

		barrelModel[3].addShapeBox(6F, -1F, -0.5F, 8, 1, 1, 0F,0.3F, -0.1F, -0.1F, 0.3F, -0.1F, -0.1F, 0.3F, -0.1F, -0.1F, 0.3F, -0.1F, -0.1F, 0.3F, -0.1F, -0.1F, 0.3F, -0.1F, -0.1F, 0.3F, -0.1F, -0.1F, 0.3F, -0.1F, -0.1F); // Box 195
		barrelModel[3].setRotationPoint(0F, -24.5F, 0F);

		barrelModel[4].addShapeBox(14.5F, -1F, -0.5F, 2, 1, 1, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 196
		barrelModel[4].setRotationPoint(0F, -24.5F, 0F);

		barrelModel[5].addShapeBox(11.5F, -2.7F, -0.5F, 1, 2, 1, 0F,-0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F); // Box 197
		barrelModel[5].setRotationPoint(0F, -24.5F, 0F);

		barrelModel[6].addShapeBox(-7F, -1F, -1F, 3, 1, 2, 0F,0.3F, -0.4F, 0F, 0.3F, -0.4F, 0F, 0.3F, -0.4F, 0F, 0.3F, -0.4F, 0F, 0.3F, 0F, 0F, 1.3F, 0F, 0F, 1.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 198
		barrelModel[6].setRotationPoint(0F, -25.9F, 0F);

		barrelModel[7].addShapeBox(-15F, 0F, -0.5F, 8, 1, 1, 0F,0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F); // Box 199
		barrelModel[7].setRotationPoint(0F, -24.5F, 0F);

		barrelModel[8].addShapeBox(-15F, -1F, -0.5F, 2, 2, 1, 0F,0.4F, -0.1F, -0.1F, 0.4F, -0.1F, -0.1F, 0.4F, -0.1F, -0.1F, 0.4F, -0.1F, -0.1F, 0.4F, -0.1F, -0.1F, 0.4F, -0.1F, -0.1F, 0.4F, -0.1F, -0.1F, 0.4F, -0.1F, -0.1F); // Box 200
		barrelModel[8].setRotationPoint(0F, -24.5F, 0F);

		barrelModel[9].addShapeBox(-9F, 0F, -0.5F, 1, 2, 1, 0F,0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0.5F, 0.2F, -0.1F, -0.5F, 0.2F, -0.1F, -0.5F, 0.2F, -0.1F, 0.5F, 0.2F, -0.1F); // Box 201
		barrelModel[9].setRotationPoint(0F, -24F, 0F);

		barrelModel[10].addShapeBox(-6.5F, 1F, -5.5F, 2, 3, 4, 0F,0.3F, -0.4F, 0.1F, 0.3F, -0.4F, 0.1F, 0.3F, -0.4F, 0.1F, 0.3F, -0.4F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 202
		barrelModel[10].setRotationPoint(0F, -25.5F, 0F);

		barrelModel[11].addShapeBox(5.5F, -2.5F, -0.5F, 1, 2, 1, 0F,-0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F); // Box 203
		barrelModel[11].setRotationPoint(0F, -24.5F, 0F);

		barrelModel[12].addShapeBox(-6F, 1F, -2.5F, 1, 1, 2, 0F,0.3F, -0.4F, 0.1F, 0.3F, -0.4F, 0.1F, 0.3F, 1.8F, -0.4F, 0.3F, 1.8F, -0.4F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, -2F, -0.4F, 0.3F, -2F, -0.4F); // Box 204
		barrelModel[12].setRotationPoint(0F, -25.5F, 0F);
	}

	private void initleftFrontWheelModel_1()
	{
		leftFrontWheelModel[0] = new ModelRendererTurbo(this, 105, 129, textureX, textureY); // Box 181
		leftFrontWheelModel[1] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // Box 182
		leftFrontWheelModel[2] = new ModelRendererTurbo(this, 185, 129, textureX, textureY); // Box 183

		leftFrontWheelModel[0].addShapeBox(-6F, -6.5F, -2.5F, 12, 4, 5, 0F,-3.5F, 0.5F, 0F, -3.5F, 0.5F, 0F, -3.5F, 0.5F, 0F, -3.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 181
		leftFrontWheelModel[0].setRotationPoint(63F, 3.5F, 13.5F);

		leftFrontWheelModel[1].addShapeBox(-6F, 2.5F, -2.5F, 12, 4, 5, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -3.5F, 0.5F, 0F, -3.5F, 0.5F, 0F, -3.5F, 0.5F, 0F, -3.5F, 0.5F, 0F); // Box 182
		leftFrontWheelModel[1].setRotationPoint(63F, 3.5F, 13.5F);

		leftFrontWheelModel[2].addShapeBox(-6F, -2F, -2.5F, 12, 4, 5, 0F,0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 183
		leftFrontWheelModel[2].setRotationPoint(63F, 3.5F, 13.5F);
	}

	private void initrightFrontWheelModel_1()
	{
		rightFrontWheelModel[0] = new ModelRendererTurbo(this, 385, 121, textureX, textureY); // Box 178
		rightFrontWheelModel[1] = new ModelRendererTurbo(this, 457, 121, textureX, textureY); // Box 179
		rightFrontWheelModel[2] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Box 180

		rightFrontWheelModel[0].addShapeBox(-6F, -6.5F, -2.5F, 12, 4, 5, 0F,-3.5F, 0.5F, 0F, -3.5F, 0.5F, 0F, -3.5F, 0.5F, 0F, -3.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 178
		rightFrontWheelModel[0].setRotationPoint(63F, 3.5F, -13F);

		rightFrontWheelModel[1].addShapeBox(-6F, 2.5F, -2.5F, 12, 4, 5, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -3.5F, 0.5F, 0F, -3.5F, 0.5F, 0F, -3.5F, 0.5F, 0F, -3.5F, 0.5F, 0F); // Box 179
		rightFrontWheelModel[1].setRotationPoint(63F, 3.5F, -13F);

		rightFrontWheelModel[2].addShapeBox(-6F, -2F, -2.5F, 12, 4, 5, 0F,0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 180
		rightFrontWheelModel[2].setRotationPoint(63F, 3.5F, -13F);
	}

	private void initleftBackWheelModel_1()
	{
		leftBackWheelModel[0] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 171
		leftBackWheelModel[1] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Box 172
		leftBackWheelModel[2] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Box 174

		leftBackWheelModel[0].addShapeBox(-6F, -2F, -2.5F, 12, 4, 5, 0F,0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 171
		leftBackWheelModel[0].setRotationPoint(6.5F, 3.5F, 13.5F);

		leftBackWheelModel[1].addShapeBox(-6F, -6.5F, -2.5F, 12, 4, 5, 0F,-3.5F, 0.5F, 0F, -3.5F, 0.5F, 0F, -3.5F, 0.5F, 0F, -3.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 172
		leftBackWheelModel[1].setRotationPoint(6.5F, 3.5F, 13.5F);

		leftBackWheelModel[2].addShapeBox(-6F, 2.5F, -2.5F, 12, 4, 5, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -3.5F, 0.5F, 0F, -3.5F, 0.5F, 0F, -3.5F, 0.5F, 0F, -3.5F, 0.5F, 0F); // Box 174
		leftBackWheelModel[2].setRotationPoint(6.5F, 3.5F, 13.5F);
	}

	private void initrightBackWheelModel_1()
	{
		rightBackWheelModel[0] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // Box 175
		rightBackWheelModel[1] = new ModelRendererTurbo(this, 233, 121, textureX, textureY); // Box 176
		rightBackWheelModel[2] = new ModelRendererTurbo(this, 273, 121, textureX, textureY); // Box 177

		rightBackWheelModel[0].addShapeBox(-6F, -2F, -2.5F, 12, 4, 5, 0F,0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 175
		rightBackWheelModel[0].setRotationPoint(6.5F, 3.5F, -13F);

		rightBackWheelModel[1].addShapeBox(-6F, -6.5F, -2.5F, 12, 4, 5, 0F,-3.5F, 0.5F, 0F, -3.5F, 0.5F, 0F, -3.5F, 0.5F, 0F, -3.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 176
		rightBackWheelModel[1].setRotationPoint(6.5F, 3.5F, -13F);

		rightBackWheelModel[2].addShapeBox(-6F, 2.5F, -2.5F, 12, 4, 5, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -3.5F, 0.5F, 0F, -3.5F, 0.5F, 0F, -3.5F, 0.5F, 0F, -3.5F, 0.5F, 0F); // Box 177
		rightBackWheelModel[2].setRotationPoint(6.5F, 3.5F, -13F);
	}

	private void initsteeringWheelModel_1()
	{
		steeringWheelModel[0] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 24
		steeringWheelModel[1] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 25
		steeringWheelModel[2] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 26
		steeringWheelModel[3] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 27

		steeringWheelModel[0].addShapeBox(-2F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		steeringWheelModel[0].setRotationPoint(48.5F, -8F, 8F);
		steeringWheelModel[0].rotateAngleY = 0.03490659F;
		steeringWheelModel[0].rotateAngleZ = -0.13962634F;

		steeringWheelModel[1].addShapeBox(-2.5F, -1F, -3F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		steeringWheelModel[1].setRotationPoint(48.5F, -8F, 8F);
		steeringWheelModel[1].rotateAngleY = 0.03490659F;
		steeringWheelModel[1].rotateAngleZ = -0.13962634F;

		steeringWheelModel[2].addShapeBox(-2.5F, -3F, -3F, 1, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		steeringWheelModel[2].setRotationPoint(48.5F, -8F, 8F);
		steeringWheelModel[2].rotateAngleY = 0.03490659F;
		steeringWheelModel[2].rotateAngleZ = -0.13962634F;

		steeringWheelModel[3].addShapeBox(-2.5F, 1F, -3F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 27
		steeringWheelModel[3].setRotationPoint(48.5F, -8F, 8F);
		steeringWheelModel[3].rotateAngleY = 0.03490659F;
		steeringWheelModel[3].rotateAngleZ = -0.13962634F;
	}
}