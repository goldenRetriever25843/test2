//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 14.02.2017 - 19:00:23
// Last changed on: 14.02.2017 - 19:00:23

package com.flansmod.client.model.NewAge; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelAUGA1 extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelAUGA1() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[175];
		ammoModel = new ModelRendererTurbo[3];
		slideModel = new ModelRendererTurbo[2];

		initgunModel_1();
		initammoModel_1();
		initslideModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 6
		gunModel[7] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 7
		gunModel[8] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 11
		gunModel[9] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 12
		gunModel[10] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 13
		gunModel[11] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 14
		gunModel[12] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 15
		gunModel[13] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 16
		gunModel[14] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 14
		gunModel[15] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 15
		gunModel[16] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 16
		gunModel[17] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 17
		gunModel[18] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 18
		gunModel[19] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 19
		gunModel[20] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 24
		gunModel[21] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 26
		gunModel[22] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 27
		gunModel[23] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 28
		gunModel[24] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 30
		gunModel[25] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 31
		gunModel[26] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 32
		gunModel[27] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 33
		gunModel[28] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Box 34
		gunModel[29] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 35
		gunModel[30] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 36
		gunModel[31] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Box 37
		gunModel[32] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 38
		gunModel[33] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Box 36
		gunModel[34] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Box 37
		gunModel[35] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Box 38
		gunModel[36] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 39
		gunModel[37] = new ModelRendererTurbo(this, 41, 137, textureX, textureY); // Box 40
		gunModel[38] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Box 41
		gunModel[39] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Box 42
		gunModel[40] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 43
		gunModel[41] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 44
		gunModel[42] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 45
		gunModel[43] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 46
		gunModel[44] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 47
		gunModel[45] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 48
		gunModel[46] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Box 49
		gunModel[47] = new ModelRendererTurbo(this, 433, 129, textureX, textureY); // Box 50
		gunModel[48] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Box 52
		gunModel[49] = new ModelRendererTurbo(this, 25, 137, textureX, textureY); // Box 53
		gunModel[50] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Box 54
		gunModel[51] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // Box 55
		gunModel[52] = new ModelRendererTurbo(this, 305, 137, textureX, textureY); // Box 56
		gunModel[53] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 56
		gunModel[54] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 57
		gunModel[55] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 58
		gunModel[56] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 59
		gunModel[57] = new ModelRendererTurbo(this, 329, 137, textureX, textureY); // Box 60
		gunModel[58] = new ModelRendererTurbo(this, 161, 153, textureX, textureY); // Box 61
		gunModel[59] = new ModelRendererTurbo(this, 209, 153, textureX, textureY); // Box 62
		gunModel[60] = new ModelRendererTurbo(this, 249, 153, textureX, textureY); // Box 63
		gunModel[61] = new ModelRendererTurbo(this, 25, 145, textureX, textureY); // Box 64
		gunModel[62] = new ModelRendererTurbo(this, 305, 153, textureX, textureY); // Box 65
		gunModel[63] = new ModelRendererTurbo(this, 385, 153, textureX, textureY); // Box 66
		gunModel[64] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 67
		gunModel[65] = new ModelRendererTurbo(this, 145, 177, textureX, textureY); // Box 69
		gunModel[66] = new ModelRendererTurbo(this, 297, 177, textureX, textureY); // Box 70
		gunModel[67] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 71
		gunModel[68] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 72
		gunModel[69] = new ModelRendererTurbo(this, 137, 193, textureX, textureY); // Box 73
		gunModel[70] = new ModelRendererTurbo(this, 281, 193, textureX, textureY); // Box 74
		gunModel[71] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 75
		gunModel[72] = new ModelRendererTurbo(this, 137, 201, textureX, textureY); // Box 76
		gunModel[73] = new ModelRendererTurbo(this, 425, 153, textureX, textureY); // Box 77
		gunModel[74] = new ModelRendererTurbo(this, 481, 145, textureX, textureY); // Box 78
		gunModel[75] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 79
		gunModel[76] = new ModelRendererTurbo(this, 289, 201, textureX, textureY); // Box 80
		gunModel[77] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Box 81
		gunModel[78] = new ModelRendererTurbo(this, 369, 153, textureX, textureY); // Box 82
		gunModel[79] = new ModelRendererTurbo(this, 193, 161, textureX, textureY); // Box 83
		gunModel[80] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Box 84
		gunModel[81] = new ModelRendererTurbo(this, 465, 193, textureX, textureY); // Box 85
		gunModel[82] = new ModelRendererTurbo(this, 209, 161, textureX, textureY); // Box 86
		gunModel[83] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 88
		gunModel[84] = new ModelRendererTurbo(this, 33, 209, textureX, textureY); // Box 89
		gunModel[85] = new ModelRendererTurbo(this, 65, 209, textureX, textureY); // Box 90
		gunModel[86] = new ModelRendererTurbo(this, 481, 161, textureX, textureY); // Box 91
		gunModel[87] = new ModelRendererTurbo(this, 113, 209, textureX, textureY); // Box 92
		gunModel[88] = new ModelRendererTurbo(this, 145, 209, textureX, textureY); // Box 93
		gunModel[89] = new ModelRendererTurbo(this, 177, 209, textureX, textureY); // Box 94
		gunModel[90] = new ModelRendererTurbo(this, 209, 209, textureX, textureY); // Box 95
		gunModel[91] = new ModelRendererTurbo(this, 241, 209, textureX, textureY); // Box 96
		gunModel[92] = new ModelRendererTurbo(this, 265, 217, textureX, textureY); // Box 97
		gunModel[93] = new ModelRendererTurbo(this, 481, 217, textureX, textureY); // Box 98
		gunModel[94] = new ModelRendererTurbo(this, 65, 145, textureX, textureY); // Box 99
		gunModel[95] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 100
		gunModel[96] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 101
		gunModel[97] = new ModelRendererTurbo(this, 145, 137, textureX, textureY); // Box 102
		gunModel[98] = new ModelRendererTurbo(this, 33, 161, textureX, textureY); // Box 103
		gunModel[99] = new ModelRendererTurbo(this, 417, 193, textureX, textureY); // Box 104
		gunModel[100] = new ModelRendererTurbo(this, 265, 209, textureX, textureY); // Box 105
		gunModel[101] = new ModelRendererTurbo(this, 113, 225, textureX, textureY); // Box 106
		gunModel[102] = new ModelRendererTurbo(this, 145, 225, textureX, textureY); // Box 107
		gunModel[103] = new ModelRendererTurbo(this, 177, 225, textureX, textureY); // Box 108
		gunModel[104] = new ModelRendererTurbo(this, 209, 225, textureX, textureY); // Box 110
		gunModel[105] = new ModelRendererTurbo(this, 297, 225, textureX, textureY); // Box 111
		gunModel[106] = new ModelRendererTurbo(this, 329, 225, textureX, textureY); // Box 112
		gunModel[107] = new ModelRendererTurbo(this, 361, 225, textureX, textureY); // Box 113
		gunModel[108] = new ModelRendererTurbo(this, 393, 225, textureX, textureY); // Box 114
		gunModel[109] = new ModelRendererTurbo(this, 425, 225, textureX, textureY); // Box 115
		gunModel[110] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 116
		gunModel[111] = new ModelRendererTurbo(this, 33, 233, textureX, textureY); // Box 117
		gunModel[112] = new ModelRendererTurbo(this, 57, 233, textureX, textureY); // Box 118
		gunModel[113] = new ModelRendererTurbo(this, 121, 233, textureX, textureY); // Box 121
		gunModel[114] = new ModelRendererTurbo(this, 177, 233, textureX, textureY); // Box 122
		gunModel[115] = new ModelRendererTurbo(this, 297, 233, textureX, textureY); // Box 123
		gunModel[116] = new ModelRendererTurbo(this, 345, 233, textureX, textureY); // Box 124
		gunModel[117] = new ModelRendererTurbo(this, 385, 233, textureX, textureY); // Box 125
		gunModel[118] = new ModelRendererTurbo(this, 441, 233, textureX, textureY); // Box 126
		gunModel[119] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 127
		gunModel[120] = new ModelRendererTurbo(this, 233, 241, textureX, textureY); // Box 128
		gunModel[121] = new ModelRendererTurbo(this, 289, 241, textureX, textureY); // Box 129
		gunModel[122] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 130
		gunModel[123] = new ModelRendererTurbo(this, 57, 249, textureX, textureY); // Box 132
		gunModel[124] = new ModelRendererTurbo(this, 105, 249, textureX, textureY); // Box 133
		gunModel[125] = new ModelRendererTurbo(this, 161, 249, textureX, textureY); // Box 134
		gunModel[126] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 135
		gunModel[127] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 136
		gunModel[128] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 137
		gunModel[129] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 138
		gunModel[130] = new ModelRendererTurbo(this, 329, 241, textureX, textureY); // Box 139
		gunModel[131] = new ModelRendererTurbo(this, 353, 241, textureX, textureY); // Box 140
		gunModel[132] = new ModelRendererTurbo(this, 201, 249, textureX, textureY); // Box 141
		gunModel[133] = new ModelRendererTurbo(this, 233, 249, textureX, textureY); // Box 142
		gunModel[134] = new ModelRendererTurbo(this, 265, 249, textureX, textureY); // Box 143
		gunModel[135] = new ModelRendererTurbo(this, 297, 249, textureX, textureY); // Box 144
		gunModel[136] = new ModelRendererTurbo(this, 369, 249, textureX, textureY); // Box 145
		gunModel[137] = new ModelRendererTurbo(this, 401, 249, textureX, textureY); // Box 146
		gunModel[138] = new ModelRendererTurbo(this, 425, 249, textureX, textureY); // Box 147
		gunModel[139] = new ModelRendererTurbo(this, 449, 249, textureX, textureY); // Box 148
		gunModel[140] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 151
		gunModel[141] = new ModelRendererTurbo(this, 49, 257, textureX, textureY); // Box 152
		gunModel[142] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 153
		gunModel[143] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Box 154
		gunModel[144] = new ModelRendererTurbo(this, 289, 297, textureX, textureY); // Box 155
		gunModel[145] = new ModelRendererTurbo(this, 1, 305, textureX, textureY); // Box 156
		gunModel[146] = new ModelRendererTurbo(this, 145, 313, textureX, textureY); // Box 157
		gunModel[147] = new ModelRendererTurbo(this, 297, 313, textureX, textureY); // Box 158
		gunModel[148] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Box 159
		gunModel[149] = new ModelRendererTurbo(this, 145, 329, textureX, textureY); // Box 160
		gunModel[150] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); // Box 161
		gunModel[151] = new ModelRendererTurbo(this, 305, 145, textureX, textureY); // Box 162
		gunModel[152] = new ModelRendererTurbo(this, 89, 257, textureX, textureY); // Box 163
		gunModel[153] = new ModelRendererTurbo(this, 289, 329, textureX, textureY); // Box 164
		gunModel[154] = new ModelRendererTurbo(this, 289, 337, textureX, textureY); // Box 165
		gunModel[155] = new ModelRendererTurbo(this, 1, 345, textureX, textureY); // Box 166
		gunModel[156] = new ModelRendererTurbo(this, 161, 345, textureX, textureY); // Box 167
		gunModel[157] = new ModelRendererTurbo(this, 321, 345, textureX, textureY); // Box 168
		gunModel[158] = new ModelRendererTurbo(this, 1, 353, textureX, textureY); // Box 169
		gunModel[159] = new ModelRendererTurbo(this, 161, 353, textureX, textureY); // Box 170
		gunModel[160] = new ModelRendererTurbo(this, 321, 353, textureX, textureY); // Box 172
		gunModel[161] = new ModelRendererTurbo(this, 1, 361, textureX, textureY); // Box 173
		gunModel[162] = new ModelRendererTurbo(this, 161, 361, textureX, textureY); // Box 174
		gunModel[163] = new ModelRendererTurbo(this, 321, 361, textureX, textureY); // Box 175
		gunModel[164] = new ModelRendererTurbo(this, 1, 369, textureX, textureY); // Box 176
		gunModel[165] = new ModelRendererTurbo(this, 161, 369, textureX, textureY); // Box 177
		gunModel[166] = new ModelRendererTurbo(this, 321, 369, textureX, textureY); // Box 178
		gunModel[167] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Box 179
		gunModel[168] = new ModelRendererTurbo(this, 153, 377, textureX, textureY); // Box 180
		gunModel[169] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Box 181
		gunModel[170] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Box 182
		gunModel[171] = new ModelRendererTurbo(this, 65, 161, textureX, textureY); // Box 183
		gunModel[172] = new ModelRendererTurbo(this, 121, 257, textureX, textureY); // Box 184
		gunModel[173] = new ModelRendererTurbo(this, 145, 257, textureX, textureY); // Box 185
		gunModel[174] = new ModelRendererTurbo(this, 225, 249, textureX, textureY); // Box 187

		gunModel[0].addBox(0F, 0F, 0F, 173, 2, 22, 0F); // Box 0
		gunModel[0].setRotationPoint(-122F, -42F, -11F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 42, 4, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		gunModel[1].setRotationPoint(-122F, -46F, -11F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 42, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		gunModel[2].setRotationPoint(-122F, -46F, 8F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 40, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		gunModel[3].setRotationPoint(-122F, -48F, -8F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 40, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		gunModel[4].setRotationPoint(-122F, -48F, 5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 1F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[5].setRotationPoint(-82F, -50F, -8F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F,0F, -2F, 0F, 0F, 1F, 1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 6
		gunModel[6].setRotationPoint(-82F, -50F, 5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 42, 2, 3, 0F,0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		gunModel[7].setRotationPoint(-122F, -50F, -5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 30, 4, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		gunModel[8].setRotationPoint(-80F, -46F, -11F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 131, 9, 7, 0F,0F, -5F, -3F, 0F, -5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		gunModel[9].setRotationPoint(-80F, -51F, -11F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 131, 9, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -3F, 0F, -5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		gunModel[10].setRotationPoint(-80F, -51F, 4F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 30, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		gunModel[11].setRotationPoint(-80F, -46F, 8F);

		gunModel[12].addShapeBox(0F, -1F, 0F, 177, 2, 8, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		gunModel[12].setRotationPoint(-126F, -52F, -4F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 42, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		gunModel[13].setRotationPoint(-122F, -50F, 2F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 173, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		gunModel[14].setRotationPoint(-122F, -40F, -11F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 173, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 15
		gunModel[15].setRotationPoint(-122F, -40F, 8F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 81, 6, 2, 0F,1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 16
		gunModel[16].setRotationPoint(-130F, -37F, -9F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 54, 6, 2, 0F,1.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 1.25F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 17
		gunModel[17].setRotationPoint(-129F, -31F, -9F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 54, 4, 2, 0F,0.5F, 0F, -1F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		gunModel[18].setRotationPoint(-129F, -25F, -9F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 20, 4, 2, 0F,1F, 0F, -1.25F, 0F, 0F, -1.4F, 0F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 19
		gunModel[19].setRotationPoint(-128F, -21F, -9F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 19, 8, 2, 0F,1.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		gunModel[20].setRotationPoint(-127F, -17F, -7F);

		gunModel[21].addBox(0F, 0F, 0F, 3, 3, 18, 0F); // Box 26
		gunModel[21].setRotationPoint(-9.5F, -37.5F, -8.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 17, 12, 2, 0F,2F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -0.25F, 0F, -3.25F, 0F, 0F, -3F, 0F, 0F, 2F, -0.25F, 0F, 2F); // Box 27
		gunModel[22].setRotationPoint(-125F, -9F, -6F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 17, 12, 2, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0.25F, -0.25F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -3F, -0.25F, 0F, -3.25F); // Box 28
		gunModel[23].setRotationPoint(-125F, -9F, 4F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 81, 6, 2, 0F,1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1.5F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.25F, 0F, -0.75F); // Box 30
		gunModel[24].setRotationPoint(-130F, -37F, 7F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 19, 8, 2, 0F,1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 1.25F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.75F); // Box 31
		gunModel[25].setRotationPoint(-127F, -17F, 5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 20, 4, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.4F, 1F, 0F, -1.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0.25F, 0F, -1.75F); // Box 32
		gunModel[26].setRotationPoint(-128F, -21F, 7F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 54, 4, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.6F, 0F, 0F, -1.25F); // Box 33
		gunModel[27].setRotationPoint(-129F, -25F, 7F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 54, 6, 2, 0F,1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 1.25F, 0F, -0.75F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0.5F, 0F, -1F); // Box 34
		gunModel[28].setRotationPoint(-129F, -31F, 7F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 35
		gunModel[29].setRotationPoint(-125F, 3F, -3F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F); // Box 36
		gunModel[30].setRotationPoint(-125F, 3F, 1F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 37
		gunModel[31].setRotationPoint(-125F, 3F, -1F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 1, 10, 12, 0F,0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.25F, -1F, 0F, 1F, 1.5F, 0F, 2.5F, 1.5F, 0F, 2.5F, -1F, 0F, 0.75F); // Box 38
		gunModel[32].setRotationPoint(-134F, -47F, -6F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 26, 8, 16, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 3.5F, -0.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 3.5F, -0.75F); // Box 36
		gunModel[33].setRotationPoint(-75F, -31F, -8F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 2, 6, 16, 0F,0F, 0F, -1F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, -1.25F, -1.25F, 0F, -1F, 0.75F, 0F, 0.25F, 0.75F, 0F, 0.25F, -1.25F, 0F, -1.25F); // Box 37
		gunModel[34].setRotationPoint(-133F, -37F, -8F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 2, 6, 16, 0F,-0.25F, 0F, -1F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -1.25F, -1.25F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 0F, -1.25F); // Box 38
		gunModel[35].setRotationPoint(-132F, -31F, -8F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 2, 4, 16, 0F,-0.25F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -1.25F, -0.75F, 0F, -1.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -1.5F); // Box 39
		gunModel[36].setRotationPoint(-131F, -25F, -8F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 2, 4, 16, 0F,0.25F, 0F, -1.5F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -1.5F, -0.75F, 0F, -2F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.75F, 0F, -2F); // Box 40
		gunModel[37].setRotationPoint(-130F, -21F, -8F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 2, 8, 16, 0F,0.25F, 0F, -2F, -1.25F, 0F, -0.75F, -1.25F, 0F, -0.75F, 0.25F, 0F, -2F, -1F, 0F, -3F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, -1F, 0F, -3F); // Box 41
		gunModel[38].setRotationPoint(-129F, -17F, -8F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 2, 10, 14, 0F,0F, 0F, -2F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, 0F, 0F, -2F, -2F, 0.5F, -4.5F, 1F, 0.5F, -3.75F, 1F, 0.5F, -3.75F, -2F, 0.5F, -5F); // Box 42
		gunModel[39].setRotationPoint(-128F, -9F, -7F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, -1F, -0.5F, 0F, -1.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.5F, 0F, -1.5F); // Box 43
		gunModel[40].setRotationPoint(-126F, 2F, -3F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.5F, 0F, -1.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0.75F, -0.5F, 0F, -0.5F, -1.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -1F, -1.5F, 0F, -1F); // Box 44
		gunModel[41].setRotationPoint(-126F, 3F, -3F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F,0.25F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -3.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		gunModel[42].setRotationPoint(-132F, -42F, -11F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.45F); // Box 46
		gunModel[43].setRotationPoint(-132F, -42F, 6F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F,0F, 0F, -0.5F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 47
		gunModel[44].setRotationPoint(-132F, -40F, -8F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 48
		gunModel[45].setRotationPoint(-132F, -40F, 5F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0.875F, 0F, -1.25F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		gunModel[46].setRotationPoint(-132F, -46F, -7F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.875F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0.25F, 0F, 0F); // Box 50
		gunModel[47].setRotationPoint(-132F, -46F, 4F);

		gunModel[48].addShapeBox(0F, -1F, 0F, 8, 2, 8, 0F,0F, -5.75F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -5.75F, -2.5F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 52
		gunModel[48].setRotationPoint(-134F, -52F, -4F);

		gunModel[49].addShapeBox(0F, -1F, 0F, 12, 4, 1, 0F,-8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 0F, 1.5F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, -1.25F); // Box 53
		gunModel[49].setRotationPoint(-134F, -50F, -4F);

		gunModel[50].addShapeBox(0F, -1F, 0F, 12, 4, 1, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, -1F, 1F, -1F, 0F, 1.5F); // Box 54
		gunModel[50].setRotationPoint(-134F, -50F, 3F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, -1F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, -0.2F, 0F, -0.25F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		gunModel[51].setRotationPoint(-133F, -48F, -6F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -0.2F, 0F, -0.25F); // Box 56
		gunModel[52].setRotationPoint(-133F, -48F, 5F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2.5F, 0F, -2F, -2.5F, 0F, 0F, -2F); // Box 56
		gunModel[53].setRotationPoint(-108F, 3F, -3F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 57
		gunModel[54].setRotationPoint(-108F, 1F, -3F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F,0F, 0F, 1.25F, -1.5F, 0F, -1F, -1.5F, 0F, -1F, 0F, 0F, 1.25F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F); // Box 58
		gunModel[55].setRotationPoint(-108F, -2F, -3F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 3, 7, 4, 0F,0F, 0F, 4F, 6.25F, 0F, 0F, 6.25F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 2.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 2.25F); // Box 59
		gunModel[56].setRotationPoint(-108F, -9F, -2F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 11, 8, 4, 0F,0F, 0F, 5.25F, 9.75F, 0F, 0F, 9.75F, 0F, 0F, 0F, 0F, 5.25F, 0F, 0F, 4F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 4F); // Box 60
		gunModel[57].setRotationPoint(-108F, -17F, -2F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 21, 4, 2, 0F,0F, 0F, 0.6F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.25F, 0F, -5F, -0.5F, 0F, 4F, 0F, 0F, 0F); // Box 61
		gunModel[58].setRotationPoint(-108F, -21F, -7F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 21, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.6F, 0F, 0F, 0F, -0.5F, 0F, 4F, -0.25F, 0F, -5F, 0F, 0F, 0.25F); // Box 62
		gunModel[59].setRotationPoint(-108F, -21F, 5F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 13, 4, 14, 0F,0F, 0F, 0.5F, -1F, 0F, 0.4F, -1F, 0F, 0.45F, 0F, 0F, 0.5F, 0.25F, 0F, -5F, -1F, -2.5F, 0.25F, -1F, -2.5F, 0.25F, 0.25F, 0F, -5F); // Box 63
		gunModel[60].setRotationPoint(-87F, -21F, -7F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, -1.4F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -1.4F, 0F, 0F); // Box 64
		gunModel[61].setRotationPoint(-87F, -17F, -2F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 23, 6, 16, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, -1.25F, -5F, 0F, -1.25F, -5F, 0F, 0F, 0.25F); // Box 65
		gunModel[62].setRotationPoint(-49F, -37F, -8F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 9, 7, 16, 0F,0F, 0F, 0.25F, 0F, 0.5F, -1.75F, 0F, 0.5F, -1.75F, 0F, 0F, 0.25F, 0F, 1F, -1.25F, 0F, -7.5F, -1.75F, 0F, -7.5F, -1.75F, 0F, 1F, -1.25F); // Box 66
		gunModel[63].setRotationPoint(-49F, -31F, -8F);

		gunModel[64].addBox(0F, 0F, 0F, 64, 1, 8, 0F); // Box 67
		gunModel[64].setRotationPoint(71F, -46F, -4F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 64, 1, 8, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		gunModel[65].setRotationPoint(71F, -47F, -4F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 64, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 70
		gunModel[66].setRotationPoint(71F, -45F, -4F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 64, 1, 6, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 71
		gunModel[67].setRotationPoint(71F, -48F, -3F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 64, 1, 6, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 72
		gunModel[68].setRotationPoint(71F, -44F, -3F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 64, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 73
		gunModel[69].setRotationPoint(71F, -49F, -2F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 64, 1, 4, 0F,0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 74
		gunModel[70].setRotationPoint(71F, -43F, -2F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 64, 1, 2, 0F,0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 75
		gunModel[71].setRotationPoint(71F, -50F, -1F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 78, 1, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 76
		gunModel[72].setRotationPoint(71F, -42F, -1F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 22, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		gunModel[73].setRotationPoint(-26F, 1F, -5F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 4, 3, 10, 0F,0F, 0F, 0F, -0.5F, 1.75F, 0F, -0.5F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2.5F, 0F, 2F, -2.5F, 0F, 0F, 0F, 0F); // Box 78
		gunModel[74].setRotationPoint(-4F, 1F, -5F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 17, 3, 10, 0F,2.5F, -1.25F, 0F, 5.25F, 30.25F, -2F, 5.25F, 30.25F, -2F, 2.5F, -1.25F, 0F, 0F, 0.5F, 0F, 11F, -33.25F, -2F, 11F, -33.25F, -2F, 0F, 0.5F, 0F); // Box 79
		gunModel[75].setRotationPoint(2F, -2F, -5F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 77, 5, 16, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.25F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.25F, -5F); // Box 80
		gunModel[76].setRotationPoint(-26F, -37F, -8F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,0.25F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0.25F, 0F, 0F, 3.75F, 0F, 0.25F, 0F, -4F, 0F, 0F, -4F, 0F, 3.5F, 0F, 0.25F); // Box 81
		gunModel[77].setRotationPoint(30F, -32F, -3F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 7, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 3.5F, 0.5F); // Box 82
		gunModel[78].setRotationPoint(19F, -33F, -3F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, -3F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -3F, 0F, 0.25F); // Box 83
		gunModel[79].setRotationPoint(16F, -32F, -3F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 10, 12, 10, 0F,-3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		gunModel[80].setRotationPoint(-26F, -11F, -5F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 8, 13, 10, 0F,-7F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -7F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 85
		gunModel[81].setRotationPoint(-23F, -24F, -5F);

		gunModel[82].addShapeBox(0F, 0F, 0F, 3, 3, 10, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F); // Box 86
		gunModel[82].setRotationPoint(-29F, 1F, -5F);

		gunModel[83].addShapeBox(0F, 0F, 0F, 3, 12, 10, 0F,-2.5F, 0F, -3F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, -2.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 88
		gunModel[83].setRotationPoint(-29F, -11F, -5F);

		gunModel[84].addShapeBox(0F, 0F, 0F, 3, 13, 10, 0F,-7F, 0F, -3F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, -3F, 0.5F, -0.05F, -3F, 0.5F, -0.05F, 0F, 0.5F, -0.05F, 0F, 0.5F, -0.05F, -3F); // Box 89
		gunModel[84].setRotationPoint(-26F, -24F, -5F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 13, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		gunModel[85].setRotationPoint(-16F, -34F, -5F);

		gunModel[86].addShapeBox(0F, 0F, 0F, 3, 5, 10, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 91
		gunModel[86].setRotationPoint(-19F, -29F, -5F);

		gunModel[87].addShapeBox(0F, 0F, 0F, 3, 5, 10, 0F,4.5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 4.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 92
		gunModel[87].setRotationPoint(-19F, -34F, -5F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 3, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		gunModel[88].setRotationPoint(-16F, -2F, -5F);

		gunModel[89].addShapeBox(0F, 0F, 0F, 3, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 94
		gunModel[89].setRotationPoint(-16F, -5F, -5F);

		gunModel[90].addShapeBox(0F, 0F, 0F, 3, 3, 10, 0F,0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 95
		gunModel[90].setRotationPoint(-13F, -2F, -5F);

		gunModel[91].addShapeBox(0F, 0F, 0F, 3, 6, 10, 0F,0F, 0F, 0F, 2F, 0F, -3F, 2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 96
		gunModel[91].setRotationPoint(-16F, -11F, -5F);

		gunModel[92].addShapeBox(0F, 0F, 0F, 3, 13, 10, 0F,-4F, 0F, 0F, 6.5F, 0F, -3F, 6.5F, 0F, -3F, -4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 2F, 0F, 0F); // Box 97
		gunModel[92].setRotationPoint(-14F, -24F, -5F);

		gunModel[93].addShapeBox(0F, 0F, 0F, 10, 5, 4, 0F,0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		gunModel[93].setRotationPoint(-6F, -34F, -2F);

		gunModel[94].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 99
		gunModel[94].setRotationPoint(-6F, -27F, -2F);

		gunModel[95].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		gunModel[95].setRotationPoint(-6F, -29F, -2F);

		gunModel[96].addShapeBox(0F, 0F, 0F, 2, 8, 3, 0F,0F, 2.5F, 0F, 0F, 2.5F, -2F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		gunModel[96].setRotationPoint(-3F, -32F, -5F);

		gunModel[97].addShapeBox(0F, 0F, 0F, 2, 8, 3, 0F,0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, -2F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 102
		gunModel[97].setRotationPoint(-3F, -32F, 2F);

		gunModel[98].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		gunModel[98].setRotationPoint(135F, -47F, -4F);

		gunModel[99].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		gunModel[99].setRotationPoint(135F, -45F, -3.5F);

		gunModel[100].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		gunModel[100].setRotationPoint(135F, -48F, -3.5F);

		gunModel[101].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		gunModel[101].setRotationPoint(135F, -44F, -2.75F);

		gunModel[102].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		gunModel[102].setRotationPoint(135F, -44F, 1.75F);

		gunModel[103].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 108
		gunModel[103].setRotationPoint(135F, -45F, 3F);

		gunModel[104].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		gunModel[104].setRotationPoint(135F, -49F, -2.75F);

		gunModel[105].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		gunModel[105].setRotationPoint(135F, -50F, -1.5F);

		gunModel[106].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		gunModel[106].setRotationPoint(135F, -50F, 0.5F);

		gunModel[107].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		gunModel[107].setRotationPoint(135F, -49F, 1.75F);

		gunModel[108].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		gunModel[108].setRotationPoint(135F, -48F, 2.5F);

		gunModel[109].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		gunModel[109].setRotationPoint(135F, -47F, 3F);

		gunModel[110].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 116
		gunModel[110].setRotationPoint(135F, -43F, 1.75F);

		gunModel[111].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F); // Box 117
		gunModel[111].setRotationPoint(135F, -43F, -2.75F);

		gunModel[112].addBox(0F, 0F, 0F, 20, 1, 10, 0F); // Box 118
		gunModel[112].setRotationPoint(51F, -46F, -5F);

		gunModel[113].addShapeBox(0F, 0F, 0F, 20, 1, 10, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		gunModel[113].setRotationPoint(51F, -47F, -5F);

		gunModel[114].addShapeBox(0F, 0F, 0F, 20, 1, 8, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 122
		gunModel[114].setRotationPoint(51F, -48F, -4F);

		gunModel[115].addShapeBox(0F, 0F, 0F, 20, 1, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 123
		gunModel[115].setRotationPoint(51F, -49F, -3F);

		gunModel[116].addShapeBox(0F, 0F, 0F, 20, 1, 4, 0F,0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 124
		gunModel[116].setRotationPoint(51F, -50F, -2F);

		gunModel[117].addShapeBox(0F, 0F, 0F, 20, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 125
		gunModel[117].setRotationPoint(51F, -45F, -5F);

		gunModel[118].addShapeBox(0F, 0F, 0F, 20, 1, 8, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 126
		gunModel[118].setRotationPoint(51F, -44F, -4F);

		gunModel[119].addShapeBox(0F, 0F, 0F, 20, 1, 6, 0F,0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 127
		gunModel[119].setRotationPoint(51F, -43F, -3F);

		gunModel[120].addShapeBox(0F, 0F, 0F, 20, 1, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 128
		gunModel[120].setRotationPoint(51F, -42F, -2F);

		gunModel[121].addShapeBox(0F, -2F, 0F, 22, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		gunModel[121].setRotationPoint(51F, -40F, -9F);

		gunModel[122].addShapeBox(0F, -2F, 0F, 22, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		gunModel[122].setRotationPoint(51F, -41F, -9F);

		gunModel[123].addShapeBox(0F, -2F, 0F, 22, 1, 3, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		gunModel[123].setRotationPoint(51F, -42F, -8F);

		gunModel[124].addShapeBox(0F, -2F, 0F, 22, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 133
		gunModel[124].setRotationPoint(51F, -39F, -9F);

		gunModel[125].addShapeBox(0F, -2F, 0F, 22, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 134
		gunModel[125].setRotationPoint(51F, -38F, -8F);

		gunModel[126].addShapeBox(0F, -2F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 135
		gunModel[126].setRotationPoint(67F, -41F, -5F);

		gunModel[127].addShapeBox(0F, -2F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 136
		gunModel[127].setRotationPoint(55F, -41F, -5F);

		gunModel[128].addShapeBox(0F, -2F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 137
		gunModel[128].setRotationPoint(73F, -40F, -9F);

		gunModel[129].addShapeBox(0F, -2F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		gunModel[129].setRotationPoint(73F, -40F, -6F);

		gunModel[130].addShapeBox(0F, -2F, 0F, 1, 3, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		gunModel[130].setRotationPoint(50F, -38F, -8F);

		gunModel[131].addShapeBox(0F, -2F, 0F, 4, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		gunModel[131].setRotationPoint(54F, -37F, -2F);

		gunModel[132].addShapeBox(0F, -2F, 0F, 2, 36, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		gunModel[132].setRotationPoint(55F, -30F, -6F);

		gunModel[133].addShapeBox(0F, -2F, 0F, 2, 36, 12, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 142
		gunModel[133].setRotationPoint(57F, -30F, -6F);

		gunModel[134].addShapeBox(0F, -2F, 0F, 2, 36, 12, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 143
		gunModel[134].setRotationPoint(53F, -30F, -6F);

		gunModel[135].addShapeBox(0F, -2F, 0F, 2, 36, 10, 0F,0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F); // Box 144
		gunModel[135].setRotationPoint(59F, -30F, -5F);

		gunModel[136].addShapeBox(0F, -2F, 0F, 2, 36, 10, 0F,0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F); // Box 145
		gunModel[136].setRotationPoint(51F, -30F, -5F);

		gunModel[137].addShapeBox(0F, -2F, 0F, 2, 36, 6, 0F,0F, 0F, -0.5F, -1F, 0F, -2.5F, -1F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -2.5F, -1F, 0F, -2.5F, 0F, 0F, -0.5F); // Box 146
		gunModel[137].setRotationPoint(61F, -30F, -3F);

		gunModel[138].addShapeBox(0F, -2F, 0F, 2, 36, 6, 0F,-1F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -2.5F, -1F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -2.5F); // Box 147
		gunModel[138].setRotationPoint(49F, -30F, -3F);

		gunModel[139].addBox(0F, 0F, 0F, 1, 9, 8, 0F); // Box 148
		gunModel[139].setRotationPoint(50F, -51F, -4F);

		gunModel[140].addShapeBox(0F, 0F, 0F, 13, 1, 8, 0F,0F, 5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -5F, 0F); // Box 151
		gunModel[140].setRotationPoint(38F, -54F, -4F);

		gunModel[141].addShapeBox(0F, 0F, 0F, 9, 1, 8, 0F,0F, 6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -6F, 0F); // Box 152
		gunModel[141].setRotationPoint(29F, -61F, -4F);

		gunModel[142].addShapeBox(0F, 0F, 0F, 74, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		gunModel[142].setRotationPoint(-45F, -67F, -4F);

		gunModel[143].addShapeBox(0F, 0F, 0F, 65, 1, 8, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		gunModel[143].setRotationPoint(-39F, -68F, -4F);

		gunModel[144].addShapeBox(0F, 0F, 0F, 65, 1, 10, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 155
		gunModel[144].setRotationPoint(-39F, -69F, -5F);

		gunModel[145].addShapeBox(0F, 0F, 0F, 65, 2, 10, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 156
		gunModel[145].setRotationPoint(-39F, -71F, -5F);

		gunModel[146].addShapeBox(0F, 0F, 0F, 65, 1, 10, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 157
		gunModel[146].setRotationPoint(-39F, -72F, -5F);

		gunModel[147].addShapeBox(0F, 0F, 0F, 65, 1, 10, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 158
		gunModel[147].setRotationPoint(-39F, -73F, -5F);

		gunModel[148].addShapeBox(0F, 0F, 0F, 65, 1, 9, 0F,0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 159
		gunModel[148].setRotationPoint(-39F, -74F, -4.5F);

		gunModel[149].addShapeBox(0F, 0F, 0F, 65, 1, 7, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		gunModel[149].setRotationPoint(-39F, -75F, -3.75F);

		gunModel[150].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, 4.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		gunModel[150].setRotationPoint(38F, -54F, -1F);

		gunModel[151].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 6F, -9F, 0F, 0F, 2.75F, 0F, 0F, 2.75F, 0F, 6.5F, -9F, 0F); // Box 162
		gunModel[151].setRotationPoint(29F, -58F, -1F);

		gunModel[152].addShapeBox(0F, -3F, 0F, 8, 6, 6, 0F,0F, 0F, 0F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 163
		gunModel[152].setRotationPoint(50F, -37F, -3F);

		gunModel[153].addShapeBox(0F, 0F, 0F, 74, 1, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 164
		gunModel[153].setRotationPoint(-45F, -68F, -4F);

		gunModel[154].addShapeBox(0F, 0F, 0F, 74, 1, 1, 0F,0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 165
		gunModel[154].setRotationPoint(-45F, -69F, -4F);

		gunModel[155].addShapeBox(0F, 0F, 0F, 74, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 166
		gunModel[155].setRotationPoint(-45F, -70F, -5F);

		gunModel[156].addShapeBox(0F, 0F, 0F, 74, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 167
		gunModel[156].setRotationPoint(-45F, -71F, -5F);

		gunModel[157].addShapeBox(0F, 0F, 0F, 74, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 168
		gunModel[157].setRotationPoint(-45F, -72F, -5F);

		gunModel[158].addShapeBox(0F, 0F, 0F, 74, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 169
		gunModel[158].setRotationPoint(-45F, -73F, -5F);

		gunModel[159].addShapeBox(0F, 0F, 0F, 74, 1, 2, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.75F); // Box 170
		gunModel[159].setRotationPoint(-45F, -74F, -4F);

		gunModel[160].addShapeBox(0F, 0F, 0F, 74, 1, 2, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F); // Box 172
		gunModel[160].setRotationPoint(-45F, -75F, -3F);

		gunModel[161].addShapeBox(0F, 0F, 0F, 74, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 173
		gunModel[161].setRotationPoint(-45F, -75F, 1F);

		gunModel[162].addShapeBox(0F, 0F, 0F, 74, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 1.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		gunModel[162].setRotationPoint(-45F, -74F, 2F);

		gunModel[163].addShapeBox(0F, 0F, 0F, 74, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 175
		gunModel[163].setRotationPoint(-45F, -73F, 3F);

		gunModel[164].addShapeBox(0F, 0F, 0F, 74, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 176
		gunModel[164].setRotationPoint(-45F, -72F, 3F);

		gunModel[165].addShapeBox(0F, 0F, 0F, 74, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 177
		gunModel[165].setRotationPoint(-45F, -71F, 3F);

		gunModel[166].addShapeBox(0F, 0F, 0F, 74, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 178
		gunModel[166].setRotationPoint(-45F, -70F, 3F);

		gunModel[167].addShapeBox(0F, 0F, 0F, 74, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 179
		gunModel[167].setRotationPoint(-45F, -69F, 3F);

		gunModel[168].addShapeBox(0F, 0F, 0F, 74, 1, 2, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		gunModel[168].setRotationPoint(-45F, -68F, 2F);

		gunModel[169].addShapeBox(0F, 0F, 0F, 4, 6, 2, 0F,1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F); // Box 181
		gunModel[169].setRotationPoint(-2F, -58F, -1F);

		gunModel[170].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,6F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 6F, 0F, 0F, 0.25F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 0.25F, 0F, 0F); // Box 182
		gunModel[170].setRotationPoint(-3F, -64F, -1F);

		gunModel[171].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 183
		gunModel[171].setRotationPoint(-9F, -66F, -1F);

		gunModel[172].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1.25F, 0F, 0F); // Box 184
		gunModel[172].setRotationPoint(-4F, -58F, -4F);

		gunModel[173].addShapeBox(0F, 0F, 0F, 1, 6, 8, 0F,3.75F, 0F, 0F, -3.75F, 0F, 0F, -3.75F, 0F, 0F, 3.5F, 0F, 0F, -2F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, -2F, 0F, 0F); // Box 185
		gunModel[173].setRotationPoint(-6F, -64F, -4F);

		gunModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0.25F, 1F, 0F, -2.25F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, -2.5F, 0F, 0F); // Box 187
		gunModel[174].setRotationPoint(-12F, -65F, -4F);
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 33
		ammoModel[1] = new ModelRendererTurbo(this, 233, 121, textureX, textureY); // Box 34
		ammoModel[2] = new ModelRendererTurbo(this, 305, 121, textureX, textureY); // Box 35

		ammoModel[0].addShapeBox(0F, 0F, 0F, 25, 15, 10, 0F,0F, -0.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, -0.5F, 0F, -3.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -3.5F, 0F, 0F); // Box 33
		ammoModel[0].setRotationPoint(-74F, -20F, -5F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 25, 15, 10, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4F, 0F, 0F, 3.75F, 0F, 0F, 3.75F, 0F, 0F, -4F, 0F, 0F); // Box 34
		ammoModel[1].setRotationPoint(-71F, -5F, -5F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 25, 3, 10, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -3.5F, 7F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, -3.5F, 7F, -1F); // Box 35
		ammoModel[2].setRotationPoint(-67F, 10F, -5F);
	}

	private void initslideModel_1()
	{
		slideModel[0] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Box 149
		slideModel[1] = new ModelRendererTurbo(this, 473, 249, textureX, textureY); // Box 150

		slideModel[0].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, -0.25F, -1F, 0F, 0F, -1F, 0F, -2.25F, -0.25F, 0F, -2.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1.75F, 0F, 3F, -1.75F); // Box 149
		slideModel[0].setRotationPoint(38F, -47F, 8F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 9, 9, 3, 0F,0F, -1.5F, -5.5F, 0F, -1.5F, -5.25F, 0F, -3.25F, 3.75F, 0F, -3.5F, 3.75F, 0F, -0.75F, 0F, 0F, -0.25F, 0.75F, 0F, 1.25F, -1.25F, 0F, 1.25F, -1.5F); // Box 150
		slideModel[1].setRotationPoint(38F, -55F, 9F);
		
		gunSlideDistance = 2F;
		animationType = EnumAnimationType.BULLPUP;
	}
}