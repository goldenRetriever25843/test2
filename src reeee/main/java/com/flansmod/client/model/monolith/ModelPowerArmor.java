//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: MarauderPowerArmor
// Model Creator: 
// Created on: 10.04.2016 - 09:28:27
// Last changed on: 10.04.2016 - 09:28:27

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelMecha;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPowerArmor extends ModelMecha //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPowerArmor() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[266];
		hipsModel = new ModelRendererTurbo[9];
		leftArmModel = new ModelRendererTurbo[32];
		rightArmModel = new ModelRendererTurbo[32];
		leftLegModel = new ModelRendererTurbo[22];
		rightLegModel = new ModelRendererTurbo[22];
		leftFootModel = new ModelRendererTurbo[6];
		rightFootModel = new ModelRendererTurbo[6];

		initbodyModel_1();
		inithipsModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
		initleftFootModel_1();
		initrightFootModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 83, 221, textureX, textureY); // Core1
		bodyModel[1] = new ModelRendererTurbo(this, 123, 14, textureX, textureY); // Core10
		bodyModel[2] = new ModelRendererTurbo(this, 197, 53, textureX, textureY); // Core100
		bodyModel[3] = new ModelRendererTurbo(this, 125, 65, textureX, textureY); // Core101
		bodyModel[4] = new ModelRendererTurbo(this, 125, 65, textureX, textureY); // Core102
		bodyModel[5] = new ModelRendererTurbo(this, 47, 222, textureX, textureY); // Core103
		bodyModel[6] = new ModelRendererTurbo(this, 137, 63, textureX, textureY); // Core104
		bodyModel[7] = new ModelRendererTurbo(this, 184, 54, textureX, textureY); // Core105
		bodyModel[8] = new ModelRendererTurbo(this, 137, 63, textureX, textureY); // Core106
		bodyModel[9] = new ModelRendererTurbo(this, 218, 53, textureX, textureY); // Core107
		bodyModel[10] = new ModelRendererTurbo(this, 184, 5, textureX, textureY); // Core108
		bodyModel[11] = new ModelRendererTurbo(this, 67, 98, textureX, textureY); // Core109
		bodyModel[12] = new ModelRendererTurbo(this, 85, 221, textureX, textureY); // Core110
		bodyModel[13] = new ModelRendererTurbo(this, 48, 232, textureX, textureY); // Core111
		bodyModel[14] = new ModelRendererTurbo(this, 131, 175, textureX, textureY); // Core112
		bodyModel[15] = new ModelRendererTurbo(this, 179, 41, textureX, textureY); // Core113
		bodyModel[16] = new ModelRendererTurbo(this, 138, 200, textureX, textureY); // Core114
		bodyModel[17] = new ModelRendererTurbo(this, 158, 184, textureX, textureY); // Core115
		bodyModel[18] = new ModelRendererTurbo(this, 179, 41, textureX, textureY); // Core116
		bodyModel[19] = new ModelRendererTurbo(this, 158, 184, textureX, textureY); // Core117
		bodyModel[20] = new ModelRendererTurbo(this, 179, 41, textureX, textureY); // Core118
		bodyModel[21] = new ModelRendererTurbo(this, 127, 85, textureX, textureY); // Core119
		bodyModel[22] = new ModelRendererTurbo(this, 209, 151, textureX, textureY); // Core12
		bodyModel[23] = new ModelRendererTurbo(this, 107, 209, textureX, textureY); // Core120
		bodyModel[24] = new ModelRendererTurbo(this, 216, 229, textureX, textureY); // Core121
		bodyModel[25] = new ModelRendererTurbo(this, 127, 85, textureX, textureY); // Core122
		bodyModel[26] = new ModelRendererTurbo(this, 139, 83, textureX, textureY); // Core123
		bodyModel[27] = new ModelRendererTurbo(this, 187, 229, textureX, textureY); // Core124
		bodyModel[28] = new ModelRendererTurbo(this, 83, 221, textureX, textureY); // Core125
		bodyModel[29] = new ModelRendererTurbo(this, 127, 85, textureX, textureY); // Core126
		bodyModel[30] = new ModelRendererTurbo(this, 127, 85, textureX, textureY); // Core127
		bodyModel[31] = new ModelRendererTurbo(this, 157, 55, textureX, textureY); // Core128
		bodyModel[32] = new ModelRendererTurbo(this, 3, 104, textureX, textureY); // Core129
		bodyModel[33] = new ModelRendererTurbo(this, 216, 171, textureX, textureY); // Core13
		bodyModel[34] = new ModelRendererTurbo(this, 167, 5, textureX, textureY); // Core130
		bodyModel[35] = new ModelRendererTurbo(this, 85, 221, textureX, textureY); // Core131
		bodyModel[36] = new ModelRendererTurbo(this, 157, 87, textureX, textureY); // Core132
		bodyModel[37] = new ModelRendererTurbo(this, 157, 72, textureX, textureY); // Core133
		bodyModel[38] = new ModelRendererTurbo(this, 218, 53, textureX, textureY); // Core134
		bodyModel[39] = new ModelRendererTurbo(this, 29, 232, textureX, textureY); // Core135
		bodyModel[40] = new ModelRendererTurbo(this, 197, 53, textureX, textureY); // Core136
		bodyModel[41] = new ModelRendererTurbo(this, 184, 54, textureX, textureY); // Core137
		bodyModel[42] = new ModelRendererTurbo(this, 30, 222, textureX, textureY); // Core138
		bodyModel[43] = new ModelRendererTurbo(this, 179, 41, textureX, textureY); // Core139
		bodyModel[44] = new ModelRendererTurbo(this, 123, 5, textureX, textureY); // Core14
		bodyModel[45] = new ModelRendererTurbo(this, 179, 41, textureX, textureY); // Core140
		bodyModel[46] = new ModelRendererTurbo(this, 179, 41, textureX, textureY); // Core141
		bodyModel[47] = new ModelRendererTurbo(this, 167, 5, textureX, textureY); // Core142
		bodyModel[48] = new ModelRendererTurbo(this, 85, 221, textureX, textureY); // Core143
		bodyModel[49] = new ModelRendererTurbo(this, 17, 104, textureX, textureY); // Core144
		bodyModel[50] = new ModelRendererTurbo(this, 85, 211, textureX, textureY); // Core145
		bodyModel[51] = new ModelRendererTurbo(this, 20, 113, textureX, textureY); // Core146
		bodyModel[52] = new ModelRendererTurbo(this, 167, 5, textureX, textureY); // Core147
		bodyModel[53] = new ModelRendererTurbo(this, 85, 211, textureX, textureY); // Core148
		bodyModel[54] = new ModelRendererTurbo(this, 20, 113, textureX, textureY); // Core149
		bodyModel[55] = new ModelRendererTurbo(this, 82, 24, textureX, textureY); // Core15
		bodyModel[56] = new ModelRendererTurbo(this, 216, 211, textureX, textureY); // Core16
		bodyModel[57] = new ModelRendererTurbo(this, 106, 24, textureX, textureY); // Core17
		bodyModel[58] = new ModelRendererTurbo(this, 132, 174, textureX, textureY); // Core18
		bodyModel[59] = new ModelRendererTurbo(this, 123, 5, textureX, textureY); // Core19
		bodyModel[60] = new ModelRendererTurbo(this, 101, 4, textureX, textureY); // Core2
		bodyModel[61] = new ModelRendererTurbo(this, 79, 116, textureX, textureY); // Core20
		bodyModel[62] = new ModelRendererTurbo(this, 216, 188, textureX, textureY); // Core21
		bodyModel[63] = new ModelRendererTurbo(this, 123, 14, textureX, textureY); // Core22
		bodyModel[64] = new ModelRendererTurbo(this, 132, 174, textureX, textureY); // Core23
		bodyModel[65] = new ModelRendererTurbo(this, 59, 116, textureX, textureY); // Core24
		bodyModel[66] = new ModelRendererTurbo(this, 186, 210, textureX, textureY); // Core25
		bodyModel[67] = new ModelRendererTurbo(this, 184, 5, textureX, textureY); // Core26
		bodyModel[68] = new ModelRendererTurbo(this, 186, 174, textureX, textureY); // Core27
		bodyModel[69] = new ModelRendererTurbo(this, 173, 11, textureX, textureY); // Core28
		bodyModel[70] = new ModelRendererTurbo(this, 5, 84, textureX, textureY); // Core29
		bodyModel[71] = new ModelRendererTurbo(this, 83, 221, textureX, textureY); // Core3
		bodyModel[72] = new ModelRendererTurbo(this, 42, 85, textureX, textureY); // Core30
		bodyModel[73] = new ModelRendererTurbo(this, 85, 221, textureX, textureY); // Core31
		bodyModel[74] = new ModelRendererTurbo(this, 137, 15, textureX, textureY); // Core32
		bodyModel[75] = new ModelRendererTurbo(this, 3, 71, textureX, textureY); // Core33
		bodyModel[76] = new ModelRendererTurbo(this, 186, 191, textureX, textureY); // Core34
		bodyModel[77] = new ModelRendererTurbo(this, 184, 12, textureX, textureY); // Core35
		bodyModel[78] = new ModelRendererTurbo(this, 209, 151, textureX, textureY); // Core36
		bodyModel[79] = new ModelRendererTurbo(this, 167, 5, textureX, textureY); // Core37
		bodyModel[80] = new ModelRendererTurbo(this, 32, 71, textureX, textureY); // Core38
		bodyModel[81] = new ModelRendererTurbo(this, 209, 151, textureX, textureY); // Core39
		bodyModel[82] = new ModelRendererTurbo(this, 137, 3, textureX, textureY); // Core4
		bodyModel[83] = new ModelRendererTurbo(this, 35, 52, textureX, textureY); // Core40
		bodyModel[84] = new ModelRendererTurbo(this, 167, 5, textureX, textureY); // Core41
		bodyModel[85] = new ModelRendererTurbo(this, 209, 151, textureX, textureY); // Core42
		bodyModel[86] = new ModelRendererTurbo(this, 119, 53, textureX, textureY); // Core43
		bodyModel[87] = new ModelRendererTurbo(this, 167, 5, textureX, textureY); // Core44
		bodyModel[88] = new ModelRendererTurbo(this, 43, 113, textureX, textureY); // Core45
		bodyModel[89] = new ModelRendererTurbo(this, 55, 71, textureX, textureY); // Core46
		bodyModel[90] = new ModelRendererTurbo(this, 8, 196, textureX, textureY); // Core47
		bodyModel[91] = new ModelRendererTurbo(this, 7, 55, textureX, textureY); // Core48
		bodyModel[92] = new ModelRendererTurbo(this, 43, 113, textureX, textureY); // Core49
		bodyModel[93] = new ModelRendererTurbo(this, 78, 5, textureX, textureY); // Core5
		bodyModel[94] = new ModelRendererTurbo(this, 48, 199, textureX, textureY); // Core50
		bodyModel[95] = new ModelRendererTurbo(this, 11, 233, textureX, textureY); // Core51
		bodyModel[96] = new ModelRendererTurbo(this, 71, 60, textureX, textureY); // Core52
		bodyModel[97] = new ModelRendererTurbo(this, 90, 61, textureX, textureY); // Core53
		bodyModel[98] = new ModelRendererTurbo(this, 103, 83, textureX, textureY); // Core54
		bodyModel[99] = new ModelRendererTurbo(this, 37, 200, textureX, textureY); // Core55
		bodyModel[100] = new ModelRendererTurbo(this, 71, 53, textureX, textureY); // Core56
		bodyModel[101] = new ModelRendererTurbo(this, 103, 83, textureX, textureY); // Core57
		bodyModel[102] = new ModelRendererTurbo(this, 66, 200, textureX, textureY); // Core58
		bodyModel[103] = new ModelRendererTurbo(this, 112, 191, textureX, textureY); // Core59
		bodyModel[104] = new ModelRendererTurbo(this, 184, 12, textureX, textureY); // Core6
		bodyModel[105] = new ModelRendererTurbo(this, 125, 75, textureX, textureY); // Core60
		bodyModel[106] = new ModelRendererTurbo(this, 85, 221, textureX, textureY); // Core61
		bodyModel[107] = new ModelRendererTurbo(this, 173, 11, textureX, textureY); // Core62
		bodyModel[108] = new ModelRendererTurbo(this, 95, 191, textureX, textureY); // Core63
		bodyModel[109] = new ModelRendererTurbo(this, 103, 83, textureX, textureY); // Core64
		bodyModel[110] = new ModelRendererTurbo(this, 125, 75, textureX, textureY); // Core65
		bodyModel[111] = new ModelRendererTurbo(this, 103, 83, textureX, textureY); // Core66
		bodyModel[112] = new ModelRendererTurbo(this, 84, 191, textureX, textureY); // Core67
		bodyModel[113] = new ModelRendererTurbo(this, 112, 191, textureX, textureY); // Core68
		bodyModel[114] = new ModelRendererTurbo(this, 103, 83, textureX, textureY); // Core69
		bodyModel[115] = new ModelRendererTurbo(this, 209, 151, textureX, textureY); // Core7
		bodyModel[116] = new ModelRendererTurbo(this, 119, 53, textureX, textureY); // Core70
		bodyModel[117] = new ModelRendererTurbo(this, 95, 191, textureX, textureY); // Core71
		bodyModel[118] = new ModelRendererTurbo(this, 119, 53, textureX, textureY); // Core72
		bodyModel[119] = new ModelRendererTurbo(this, 103, 83, textureX, textureY); // Core73
		bodyModel[120] = new ModelRendererTurbo(this, 11, 224, textureX, textureY); // Core74
		bodyModel[121] = new ModelRendererTurbo(this, 119, 53, textureX, textureY); // Core75
		bodyModel[122] = new ModelRendererTurbo(this, 84, 191, textureX, textureY); // Core76
		bodyModel[123] = new ModelRendererTurbo(this, 101, 4, textureX, textureY); // Core77
		bodyModel[124] = new ModelRendererTurbo(this, 66, 187, textureX, textureY); // Core78
		bodyModel[125] = new ModelRendererTurbo(this, 48, 186, textureX, textureY); // Core79
		bodyModel[126] = new ModelRendererTurbo(this, 209, 151, textureX, textureY); // Core8
		bodyModel[127] = new ModelRendererTurbo(this, 37, 187, textureX, textureY); // Core80
		bodyModel[128] = new ModelRendererTurbo(this, 127, 85, textureX, textureY); // Core81
		bodyModel[129] = new ModelRendererTurbo(this, 103, 59, textureX, textureY); // Core82
		bodyModel[130] = new ModelRendererTurbo(this, 103, 50, textureX, textureY); // Core83
		bodyModel[131] = new ModelRendererTurbo(this, 127, 85, textureX, textureY); // Core84
		bodyModel[132] = new ModelRendererTurbo(this, 137, 3, textureX, textureY); // Core85
		bodyModel[133] = new ModelRendererTurbo(this, 67, 83, textureX, textureY); // Core86
		bodyModel[134] = new ModelRendererTurbo(this, 85, 221, textureX, textureY); // Core87
		bodyModel[135] = new ModelRendererTurbo(this, 127, 85, textureX, textureY); // Core88
		bodyModel[136] = new ModelRendererTurbo(this, 92, 53, textureX, textureY); // Core89
		bodyModel[137] = new ModelRendererTurbo(this, 4, 111, textureX, textureY); // Core9
		bodyModel[138] = new ModelRendererTurbo(this, 127, 85, textureX, textureY); // Core90
		bodyModel[139] = new ModelRendererTurbo(this, 103, 59, textureX, textureY); // Core91
		bodyModel[140] = new ModelRendererTurbo(this, 103, 50, textureX, textureY); // Core92
		bodyModel[141] = new ModelRendererTurbo(this, 139, 83, textureX, textureY); // Core93
		bodyModel[142] = new ModelRendererTurbo(this, 157, 55, textureX, textureY); // Core94
		bodyModel[143] = new ModelRendererTurbo(this, 92, 53, textureX, textureY); // Core95
		bodyModel[144] = new ModelRendererTurbo(this, 125, 65, textureX, textureY); // Core96
		bodyModel[145] = new ModelRendererTurbo(this, 157, 87, textureX, textureY); // Core97
		bodyModel[146] = new ModelRendererTurbo(this, 125, 65, textureX, textureY); // Core98
		bodyModel[147] = new ModelRendererTurbo(this, 157, 72, textureX, textureY); // Core99
		bodyModel[148] = new ModelRendererTurbo(this, 11, 339, textureX, textureY); // CoreDecal1
		bodyModel[149] = new ModelRendererTurbo(this, 11, 253, textureX, textureY); // CoreDecal2
		bodyModel[150] = new ModelRendererTurbo(this, 285, 31, textureX, textureY); // Box 3
		bodyModel[151] = new ModelRendererTurbo(this, 285, 41, textureX, textureY); // Box 4
		bodyModel[152] = new ModelRendererTurbo(this, 285, 3, textureX, textureY); // Box 5
		bodyModel[153] = new ModelRendererTurbo(this, 284, 20, textureX, textureY); // Box 6
		bodyModel[154] = new ModelRendererTurbo(this, 285, 41, textureX, textureY); // Box 7
		bodyModel[155] = new ModelRendererTurbo(this, 285, 31, textureX, textureY); // Box 8
		bodyModel[156] = new ModelRendererTurbo(this, 263, 23, textureX, textureY); // Box 9
		bodyModel[157] = new ModelRendererTurbo(this, 263, 12, textureX, textureY); // Box 39
		bodyModel[158] = new ModelRendererTurbo(this, 302, 4, textureX, textureY); // Box 40
		bodyModel[159] = new ModelRendererTurbo(this, 302, 16, textureX, textureY); // Box 41
		bodyModel[160] = new ModelRendererTurbo(this, 302, 16, textureX, textureY); // Box 42
		bodyModel[161] = new ModelRendererTurbo(this, 302, 16, textureX, textureY); // Box 43
		bodyModel[162] = new ModelRendererTurbo(this, 302, 27, textureX, textureY); // Box 44
		bodyModel[163] = new ModelRendererTurbo(this, 302, 27, textureX, textureY); // Box 45
		bodyModel[164] = new ModelRendererTurbo(this, 302, 27, textureX, textureY); // Box 46
		bodyModel[165] = new ModelRendererTurbo(this, 302, 32, textureX, textureY); // Box 47
		bodyModel[166] = new ModelRendererTurbo(this, 302, 32, textureX, textureY); // Box 48
		bodyModel[167] = new ModelRendererTurbo(this, 302, 32, textureX, textureY); // Box 49
		bodyModel[168] = new ModelRendererTurbo(this, 302, 37, textureX, textureY); // Box 50
		bodyModel[169] = new ModelRendererTurbo(this, 302, 42, textureX, textureY); // Box 51
		bodyModel[170] = new ModelRendererTurbo(this, 302, 42, textureX, textureY); // Box 52
		bodyModel[171] = new ModelRendererTurbo(this, 302, 42, textureX, textureY); // Box 53
		bodyModel[172] = new ModelRendererTurbo(this, 302, 46, textureX, textureY); // Box 54
		bodyModel[173] = new ModelRendererTurbo(this, 302, 46, textureX, textureY); // Box 55
		bodyModel[174] = new ModelRendererTurbo(this, 302, 46, textureX, textureY); // Box 56
		bodyModel[175] = new ModelRendererTurbo(this, 302, 56, textureX, textureY); // Box 57
		bodyModel[176] = new ModelRendererTurbo(this, 302, 56, textureX, textureY); // Box 58
		bodyModel[177] = new ModelRendererTurbo(this, 302, 56, textureX, textureY); // Box 59
		bodyModel[178] = new ModelRendererTurbo(this, 302, 51, textureX, textureY); // Box 60
		bodyModel[179] = new ModelRendererTurbo(this, 302, 51, textureX, textureY); // Box 61
		bodyModel[180] = new ModelRendererTurbo(this, 302, 51, textureX, textureY); // Box 62
		bodyModel[181] = new ModelRendererTurbo(this, 302, 11, textureX, textureY); // Box 63
		bodyModel[182] = new ModelRendererTurbo(this, 302, 11, textureX, textureY); // Box 64
		bodyModel[183] = new ModelRendererTurbo(this, 302, 11, textureX, textureY); // Box 65
		bodyModel[184] = new ModelRendererTurbo(this, 263, 43, textureX, textureY); // Box 117
		bodyModel[185] = new ModelRendererTurbo(this, 264, 55, textureX, textureY); // Box 118
		bodyModel[186] = new ModelRendererTurbo(this, 263, 43, textureX, textureY); // Box 119
		bodyModel[187] = new ModelRendererTurbo(this, 264, 55, textureX, textureY); // Box 120
		bodyModel[188] = new ModelRendererTurbo(this, 265, 4, textureX, textureY); // Box 121
		bodyModel[189] = new ModelRendererTurbo(this, 265, 4, textureX, textureY); // Box 122
		bodyModel[190] = new ModelRendererTurbo(this, 302, 16, textureX, textureY); // Box 135
		bodyModel[191] = new ModelRendererTurbo(this, 302, 16, textureX, textureY); // Box 136
		bodyModel[192] = new ModelRendererTurbo(this, 302, 16, textureX, textureY); // Box 137
		bodyModel[193] = new ModelRendererTurbo(this, 302, 27, textureX, textureY); // Box 138
		bodyModel[194] = new ModelRendererTurbo(this, 302, 27, textureX, textureY); // Box 139
		bodyModel[195] = new ModelRendererTurbo(this, 302, 27, textureX, textureY); // Box 140
		bodyModel[196] = new ModelRendererTurbo(this, 302, 32, textureX, textureY); // Box 141
		bodyModel[197] = new ModelRendererTurbo(this, 302, 32, textureX, textureY); // Box 142
		bodyModel[198] = new ModelRendererTurbo(this, 302, 32, textureX, textureY); // Box 143
		bodyModel[199] = new ModelRendererTurbo(this, 302, 37, textureX, textureY); // Box 144
		bodyModel[200] = new ModelRendererTurbo(this, 302, 42, textureX, textureY); // Box 145
		bodyModel[201] = new ModelRendererTurbo(this, 302, 42, textureX, textureY); // Box 146
		bodyModel[202] = new ModelRendererTurbo(this, 302, 42, textureX, textureY); // Box 147
		bodyModel[203] = new ModelRendererTurbo(this, 302, 46, textureX, textureY); // Box 148
		bodyModel[204] = new ModelRendererTurbo(this, 302, 46, textureX, textureY); // Box 149
		bodyModel[205] = new ModelRendererTurbo(this, 302, 46, textureX, textureY); // Box 150
		bodyModel[206] = new ModelRendererTurbo(this, 302, 51, textureX, textureY); // Box 151
		bodyModel[207] = new ModelRendererTurbo(this, 302, 51, textureX, textureY); // Box 152
		bodyModel[208] = new ModelRendererTurbo(this, 302, 51, textureX, textureY); // Box 153
		bodyModel[209] = new ModelRendererTurbo(this, 302, 56, textureX, textureY); // Box 154
		bodyModel[210] = new ModelRendererTurbo(this, 302, 56, textureX, textureY); // Box 155
		bodyModel[211] = new ModelRendererTurbo(this, 302, 56, textureX, textureY); // Box 156
		bodyModel[212] = new ModelRendererTurbo(this, 302, 11, textureX, textureY); // Box 157
		bodyModel[213] = new ModelRendererTurbo(this, 302, 11, textureX, textureY); // Box 158
		bodyModel[214] = new ModelRendererTurbo(this, 302, 11, textureX, textureY); // Box 159
		bodyModel[215] = new ModelRendererTurbo(this, 302, 16, textureX, textureY); // Box 160
		bodyModel[216] = new ModelRendererTurbo(this, 302, 16, textureX, textureY); // Box 161
		bodyModel[217] = new ModelRendererTurbo(this, 302, 16, textureX, textureY); // Box 162
		bodyModel[218] = new ModelRendererTurbo(this, 302, 27, textureX, textureY); // Box 163
		bodyModel[219] = new ModelRendererTurbo(this, 302, 27, textureX, textureY); // Box 164
		bodyModel[220] = new ModelRendererTurbo(this, 302, 27, textureX, textureY); // Box 165
		bodyModel[221] = new ModelRendererTurbo(this, 302, 32, textureX, textureY); // Box 166
		bodyModel[222] = new ModelRendererTurbo(this, 302, 32, textureX, textureY); // Box 167
		bodyModel[223] = new ModelRendererTurbo(this, 302, 32, textureX, textureY); // Box 168
		bodyModel[224] = new ModelRendererTurbo(this, 302, 37, textureX, textureY); // Box 169
		bodyModel[225] = new ModelRendererTurbo(this, 302, 42, textureX, textureY); // Box 170
		bodyModel[226] = new ModelRendererTurbo(this, 302, 42, textureX, textureY); // Box 171
		bodyModel[227] = new ModelRendererTurbo(this, 302, 42, textureX, textureY); // Box 172
		bodyModel[228] = new ModelRendererTurbo(this, 302, 46, textureX, textureY); // Box 173
		bodyModel[229] = new ModelRendererTurbo(this, 302, 46, textureX, textureY); // Box 174
		bodyModel[230] = new ModelRendererTurbo(this, 302, 46, textureX, textureY); // Box 175
		bodyModel[231] = new ModelRendererTurbo(this, 302, 51, textureX, textureY); // Box 176
		bodyModel[232] = new ModelRendererTurbo(this, 302, 51, textureX, textureY); // Box 177
		bodyModel[233] = new ModelRendererTurbo(this, 302, 51, textureX, textureY); // Box 178
		bodyModel[234] = new ModelRendererTurbo(this, 302, 56, textureX, textureY); // Box 179
		bodyModel[235] = new ModelRendererTurbo(this, 302, 56, textureX, textureY); // Box 180
		bodyModel[236] = new ModelRendererTurbo(this, 302, 56, textureX, textureY); // Box 181
		bodyModel[237] = new ModelRendererTurbo(this, 302, 11, textureX, textureY); // Box 182
		bodyModel[238] = new ModelRendererTurbo(this, 302, 11, textureX, textureY); // Box 183
		bodyModel[239] = new ModelRendererTurbo(this, 302, 11, textureX, textureY); // Box 184
		bodyModel[240] = new ModelRendererTurbo(this, 302, 4, textureX, textureY); // Box 185
		bodyModel[241] = new ModelRendererTurbo(this, 302, 16, textureX, textureY); // Box 186
		bodyModel[242] = new ModelRendererTurbo(this, 302, 16, textureX, textureY); // Box 187
		bodyModel[243] = new ModelRendererTurbo(this, 302, 16, textureX, textureY); // Box 188
		bodyModel[244] = new ModelRendererTurbo(this, 302, 27, textureX, textureY); // Box 189
		bodyModel[245] = new ModelRendererTurbo(this, 302, 27, textureX, textureY); // Box 190
		bodyModel[246] = new ModelRendererTurbo(this, 302, 27, textureX, textureY); // Box 191
		bodyModel[247] = new ModelRendererTurbo(this, 302, 32, textureX, textureY); // Box 192
		bodyModel[248] = new ModelRendererTurbo(this, 302, 32, textureX, textureY); // Box 193
		bodyModel[249] = new ModelRendererTurbo(this, 302, 32, textureX, textureY); // Box 194
		bodyModel[250] = new ModelRendererTurbo(this, 302, 37, textureX, textureY); // Box 195
		bodyModel[251] = new ModelRendererTurbo(this, 302, 42, textureX, textureY); // Box 196
		bodyModel[252] = new ModelRendererTurbo(this, 302, 42, textureX, textureY); // Box 197
		bodyModel[253] = new ModelRendererTurbo(this, 302, 42, textureX, textureY); // Box 198
		bodyModel[254] = new ModelRendererTurbo(this, 302, 46, textureX, textureY); // Box 199
		bodyModel[255] = new ModelRendererTurbo(this, 302, 46, textureX, textureY); // Box 200
		bodyModel[256] = new ModelRendererTurbo(this, 302, 46, textureX, textureY); // Box 201
		bodyModel[257] = new ModelRendererTurbo(this, 302, 51, textureX, textureY); // Box 202
		bodyModel[258] = new ModelRendererTurbo(this, 302, 51, textureX, textureY); // Box 203
		bodyModel[259] = new ModelRendererTurbo(this, 302, 51, textureX, textureY); // Box 204
		bodyModel[260] = new ModelRendererTurbo(this, 302, 56, textureX, textureY); // Box 205
		bodyModel[261] = new ModelRendererTurbo(this, 302, 56, textureX, textureY); // Box 206
		bodyModel[262] = new ModelRendererTurbo(this, 302, 56, textureX, textureY); // Box 207
		bodyModel[263] = new ModelRendererTurbo(this, 302, 11, textureX, textureY); // Box 208
		bodyModel[264] = new ModelRendererTurbo(this, 302, 11, textureX, textureY); // Box 209
		bodyModel[265] = new ModelRendererTurbo(this, 302, 11, textureX, textureY); // Box 210

		bodyModel[0].addShapeBox(-19.5F, -10F, -7F, 1, 4, 14, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Core1
		bodyModel[0].setRotationPoint(0F, -24F, 0F);
		bodyModel[0].rotateAngleZ = -0.43633231F;

		bodyModel[1].addShapeBox(-4.5F, -11F, 3F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core10
		bodyModel[1].setRotationPoint(0F, -24F, 0F);

		bodyModel[2].addShapeBox(-2.5F, -10F, 23.5F, 5, 29, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core100
		bodyModel[2].setRotationPoint(0F, -24F, 0F);
		bodyModel[2].rotateAngleX = 0.52359878F;

		bodyModel[3].addShapeBox(2.5F, -17F, -7.5F, 2, 1, 2, 0F,0F, 0F, -.5F, -1F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core101
		bodyModel[3].setRotationPoint(0F, -24F, 0F);

		bodyModel[4].addShapeBox(2.5F, -16F, -7.5F, 2, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, -.5F); // Core102
		bodyModel[4].setRotationPoint(0F, -24F, 0F);

		bodyModel[5].addShapeBox(2.5F, -12F, 23.5F, 2, 2, 2, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, 0F); // Core103
		bodyModel[5].setRotationPoint(0F, -24F, 0F);
		bodyModel[5].rotateAngleX = 0.52359878F;

		bodyModel[6].addShapeBox(-0.5F, -20.5F, 5.5F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core104
		bodyModel[6].setRotationPoint(0F, -24F, 0F);

		bodyModel[7].addShapeBox(2.5F, -10F, 23.5F, 2, 29, 2, 0F,0F, 0F, 0F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, -.4F, -.4F, -.4F, -.4F, -.4F, 0F, 0F, 0F); // Core105
		bodyModel[7].setRotationPoint(0F, -24F, 0F);
		bodyModel[7].rotateAngleX = 0.52359878F;

		bodyModel[8].addShapeBox(-0.5F, -20.5F, -7.5F, 2, 1, 2, 0F,0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core106
		bodyModel[8].setRotationPoint(0F, -24F, 0F);

		bodyModel[9].addShapeBox(-4.5F, -12F, 23.5F, 2, 31, 2, 0F,0F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, -.4F, -.4F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, -.4F, -.4F); // Core107
		bodyModel[9].setRotationPoint(0F, -24F, 0F);
		bodyModel[9].rotateAngleX = 0.52359878F;

		bodyModel[10].addShapeBox(-3.5F, -7F, 4F, 2, 2, 1, 0F,0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F); // Core108
		bodyModel[10].setRotationPoint(0F, -24F, 0F);

		bodyModel[11].addShapeBox(4.5F, -8F, -4.5F, 5, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -3F, -2F, 0F, -3F, 0F, 0F, -1F); // Core109
		bodyModel[11].setRotationPoint(0F, -24F, 0F);

		bodyModel[12].addShapeBox(-16.5F, -10F, 7F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Core110
		bodyModel[12].setRotationPoint(0F, -24F, 0F);
		bodyModel[12].rotateAngleZ = -0.43633231F;

		bodyModel[13].addShapeBox(-2.5F, -12F, 23.5F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core111
		bodyModel[13].setRotationPoint(0F, -24F, 0F);
		bodyModel[13].rotateAngleX = 0.52359878F;

		bodyModel[14].addShapeBox(-20F, -20F, -4F, 6, 3, 8, 0F,0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core112
		bodyModel[14].setRotationPoint(0F, -24F, 0F);
		bodyModel[14].rotateAngleZ = -0.43633231F;

		bodyModel[15].addShapeBox(-1.5F, -14F, 24F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core113
		bodyModel[15].setRotationPoint(0F, -24F, 0F);
		bodyModel[15].rotateAngleX = 0.52359878F;

		bodyModel[16].addShapeBox(-19F, -17F, -4F, 4, 12, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core114
		bodyModel[16].setRotationPoint(0F, -24F, 0F);
		bodyModel[16].rotateAngleZ = -0.43633231F;

		bodyModel[17].addShapeBox(-20F, -17F, -4F, 1, 12, 8, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Core115
		bodyModel[17].setRotationPoint(0F, -24F, 0F);
		bodyModel[17].rotateAngleZ = -0.43633231F;

		bodyModel[18].addShapeBox(2.5F, -14F, 24F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core116
		bodyModel[18].setRotationPoint(0F, -24F, 0F);
		bodyModel[18].rotateAngleX = 0.52359878F;

		bodyModel[19].addShapeBox(-20F, -5F, -4F, 1, 6, 8, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -2.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1F, -2.5F); // Core117
		bodyModel[19].setRotationPoint(0F, -24F, 0F);
		bodyModel[19].rotateAngleZ = -0.43633231F;

		bodyModel[20].addShapeBox(-2.5F, -14F, 24F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core118
		bodyModel[20].setRotationPoint(0F, -24F, 0F);
		bodyModel[20].rotateAngleX = 0.52359878F;

		bodyModel[21].addShapeBox(0.5F, -8F, -21.5F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Core119
		bodyModel[21].setRotationPoint(0F, -24F, 0F);
		bodyModel[21].rotateAngleX = -0.52359878F;

		bodyModel[22].addShapeBox(-20F, -22F, -14F, 7, 3, 10, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core12
		bodyModel[22].setRotationPoint(0F, -24F, 0F);
		bodyModel[22].rotateAngleZ = -0.43633231F;

		bodyModel[23].addShapeBox(-19F, -5F, -5F, 4, 9, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core120
		bodyModel[23].setRotationPoint(0F, -24F, 0F);
		bodyModel[23].rotateAngleZ = -0.43633231F;

		bodyModel[24].addShapeBox(-19F, 4F, -5F, 4, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core121
		bodyModel[24].setRotationPoint(0F, -24F, 0F);
		bodyModel[24].rotateAngleZ = -0.43633231F;

		bodyModel[25].addShapeBox(-1.5F, -8F, -21.5F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Core122
		bodyModel[25].setRotationPoint(0F, -24F, 0F);
		bodyModel[25].rotateAngleX = -0.52359878F;

		bodyModel[26].addShapeBox(-0.5F, -16F, -14.5F, 1, 1, 3, 0F,0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F); // Core123
		bodyModel[26].setRotationPoint(0F, -24F, 0F);

		bodyModel[27].addShapeBox(-19F, 4F, 0F, 4, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Core124
		bodyModel[27].setRotationPoint(0F, -24F, 0F);
		bodyModel[27].rotateAngleZ = -0.43633231F;

		bodyModel[28].addShapeBox(-18.5F, -10F, -7F, 2, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core125
		bodyModel[28].setRotationPoint(0F, -24F, 0F);
		bodyModel[28].rotateAngleZ = -0.43633231F;

		bodyModel[29].addShapeBox(0.5F, -17F, -12.5F, 1, 3, 2, 0F,0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core126
		bodyModel[29].setRotationPoint(0F, -24F, 0F);

		bodyModel[30].addShapeBox(-1.5F, -17F, -12.5F, 1, 3, 2, 0F,0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core127
		bodyModel[30].setRotationPoint(0F, -24F, 0F);

		bodyModel[31].addShapeBox(-1.5F, -9F, -26.5F, 3, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core128
		bodyModel[31].setRotationPoint(0F, -24F, 0F);
		bodyModel[31].rotateAngleX = -0.52359878F;

		bodyModel[32].addShapeBox(4.5F, -6F, -1.5F, 3, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F); // Core129
		bodyModel[32].setRotationPoint(0F, -24F, 0F);

		bodyModel[33].addShapeBox(-22F, -22F, -14F, 2, 3, 10, 0F,0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Core13
		bodyModel[33].setRotationPoint(0F, -24F, 0F);
		bodyModel[33].rotateAngleZ = -0.43633231F;

		bodyModel[34].addShapeBox(-5F, -7F, 4F, 2, 1, 1, 0F,0F, -.4F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core130
		bodyModel[34].setRotationPoint(0F, -24F, 0F);

		bodyModel[35].addShapeBox(-19.5F, -10F, 7F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Core131
		bodyModel[35].setRotationPoint(0F, -24F, 0F);
		bodyModel[35].rotateAngleZ = -0.43633231F;

		bodyModel[36].addShapeBox(1.5F, -9F, -26.5F, 1, 5, 5, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Core132
		bodyModel[36].setRotationPoint(0F, -24F, 0F);
		bodyModel[36].rotateAngleX = -0.52359878F;

		bodyModel[37].addShapeBox(-2.5F, -9F, -26.5F, 1, 5, 5, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Core133
		bodyModel[37].setRotationPoint(0F, -24F, 0F);
		bodyModel[37].rotateAngleX = -0.52359878F;

		bodyModel[38].addShapeBox(-4.5F, -12F, -25.5F, 2, 31, 2, 0F,0F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, -.4F, -.4F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, -.4F, -.4F); // Core134
		bodyModel[38].setRotationPoint(0F, -24F, 0F);
		bodyModel[38].rotateAngleX = -0.52359878F;

		bodyModel[39].addShapeBox(-2.5F, -12F, -25.5F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core135
		bodyModel[39].setRotationPoint(0F, -24F, 0F);
		bodyModel[39].rotateAngleX = -0.52359878F;

		bodyModel[40].addShapeBox(-2.5F, -10F, -25.5F, 5, 29, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core136
		bodyModel[40].setRotationPoint(0F, -24F, 0F);
		bodyModel[40].rotateAngleX = -0.52359878F;

		bodyModel[41].addShapeBox(2.5F, -10F, -25.5F, 2, 29, 2, 0F,0F, 0F, 0F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, -.4F, -.4F, -.4F, -.4F, -.4F, 0F, 0F, 0F); // Core137
		bodyModel[41].setRotationPoint(0F, -24F, 0F);
		bodyModel[41].rotateAngleX = -0.52359878F;

		bodyModel[42].addShapeBox(2.5F, -12F, -25.5F, 2, 2, 2, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, 0F); // Core138
		bodyModel[42].setRotationPoint(0F, -24F, 0F);
		bodyModel[42].rotateAngleX = -0.52359878F;

		bodyModel[43].addShapeBox(2.5F, -14F, -25F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core139
		bodyModel[43].setRotationPoint(0F, -24F, 0F);
		bodyModel[43].rotateAngleX = -0.52359878F;

		bodyModel[44].addShapeBox(-5.5F, -11F, 3F, 1, 4, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Core14
		bodyModel[44].setRotationPoint(0F, -24F, 0F);

		bodyModel[45].addShapeBox(-1.5F, -14F, -25F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core140
		bodyModel[45].setRotationPoint(0F, -24F, 0F);
		bodyModel[45].rotateAngleX = -0.52359878F;

		bodyModel[46].addShapeBox(-2.5F, -14F, -25F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core141
		bodyModel[46].setRotationPoint(0F, -24F, 0F);
		bodyModel[46].rotateAngleX = -0.52359878F;

		bodyModel[47].addShapeBox(-5F, -6F, 4F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core142
		bodyModel[47].setRotationPoint(0F, -24F, 0F);

		bodyModel[48].addShapeBox(-18.5F, -10F, 7F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Core143
		bodyModel[48].setRotationPoint(0F, -24F, 0F);
		bodyModel[48].rotateAngleZ = -0.43633231F;

		bodyModel[49].addShapeBox(4.5F, -4F, -1.5F, 3, 2, 3, 0F,0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Core144
		bodyModel[49].setRotationPoint(0F, -24F, 0F);

		bodyModel[50].addShapeBox(-9.5F, -19.5F, -6.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core145
		bodyModel[50].setRotationPoint(0F, -24F, 0F);
		bodyModel[50].rotateAngleZ = 0.36651914F;

		bodyModel[51].addShapeBox(4.5F, -5F, -3F, 2, 1, 6, 0F,0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core146
		bodyModel[51].setRotationPoint(0F, -24F, 0F);

		bodyModel[52].addShapeBox(-5F, -3F, 4F, 3, 1, 1, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Core147
		bodyModel[52].setRotationPoint(0F, -24F, 0F);

		bodyModel[53].addShapeBox(-9.5F, -19.5F, 5.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core148
		bodyModel[53].setRotationPoint(0F, -24F, 0F);
		bodyModel[53].rotateAngleZ = 0.36651914F;

		bodyModel[54].addShapeBox(4.5F, -4F, -3F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F); // Core149
		bodyModel[54].setRotationPoint(0F, -24F, 0F);

		bodyModel[55].addShapeBox(-6F, -12F, -3F, 3, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core15
		bodyModel[55].setRotationPoint(0F, -24F, 0F);

		bodyModel[56].addShapeBox(-22F, -15F, -14F, 2, 3, 10, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, -3F); // Core16
		bodyModel[56].setRotationPoint(0F, -24F, 0F);
		bodyModel[56].rotateAngleZ = -0.43633231F;

		bodyModel[57].addShapeBox(-7F, -12F, -3F, 1, 5, 6, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Core17
		bodyModel[57].setRotationPoint(0F, -24F, 0F);

		bodyModel[58].addShapeBox(-19F, -20F, -6F, 4, 7, 6, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core18
		bodyModel[58].setRotationPoint(0F, -24F, 0F);
		bodyModel[58].rotateAngleZ = -0.43633231F;

		bodyModel[59].addShapeBox(-5.5F, -11F, -5F, 1, 4, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Core19
		bodyModel[59].setRotationPoint(0F, -24F, 0F);

		bodyModel[60].addShapeBox(-6.5F, -17.2F, -4.5F, 5, 6, 2, 0F,4F, 0F, 0F, -4F, 4F, 0F, -4F, 4F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core2
		bodyModel[60].setRotationPoint(0F, -24F, 0F);

		bodyModel[61].addShapeBox(3.8F, -8F, 4F, 4, 10, 4, 0F,1.1F, .1F, 1.1F, 1.1F, .1F, 1.1F, 1.1F, .1F, 1.1F, 1.1F, .1F, 1.1F, 1.1F, .1F, 1.1F, 1.1F, .1F, 1.1F, 1.1F, .1F, 1.1F, 1.1F, .1F, 1.1F); // Core20
		bodyModel[61].setRotationPoint(0F, -24F, 0F);
		bodyModel[61].rotateAngleZ = 0.61086524F;

		bodyModel[62].addShapeBox(-22F, -19F, -14F, 2, 4, 10, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Core21
		bodyModel[62].setRotationPoint(0F, -24F, 0F);
		bodyModel[62].rotateAngleZ = -0.43633231F;

		bodyModel[63].addShapeBox(-4.5F, -11F, -5F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core22
		bodyModel[63].setRotationPoint(0F, -24F, 0F);

		bodyModel[64].addShapeBox(-19F, -20F, 0F, 4, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Core23
		bodyModel[64].setRotationPoint(0F, -24F, 0F);
		bodyModel[64].rotateAngleZ = -0.43633231F;

		bodyModel[65].addShapeBox(3.8F, -8F, -8F, 4, 10, 4, 0F,1.1F, .1F, 1.1F, 1.1F, .1F, 1.1F, 1.1F, .1F, 1.1F, 1.1F, .1F, 1.1F, 1.1F, .1F, 1.1F, 1.1F, .1F, 1.1F, 1.1F, .1F, 1.1F, 1.1F, .1F, 1.1F); // Core24
		bodyModel[65].setRotationPoint(0F, -24F, 0F);
		bodyModel[65].rotateAngleZ = 0.61086524F;

		bodyModel[66].addShapeBox(-22F, -15F, 4F, 2, 3, 10, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, -3F); // Core25
		bodyModel[66].setRotationPoint(0F, -24F, 0F);
		bodyModel[66].rotateAngleZ = -0.43633231F;

		bodyModel[67].addShapeBox(-3.5F, -7F, -5F, 2, 2, 1, 0F,0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F); // Core26
		bodyModel[67].setRotationPoint(0F, -24F, 0F);

		bodyModel[68].addShapeBox(-22F, -22F, 4F, 2, 3, 10, 0F,0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Core27
		bodyModel[68].setRotationPoint(0F, -24F, 0F);
		bodyModel[68].rotateAngleZ = -0.43633231F;

		bodyModel[69].addShapeBox(-2F, -6.5F, -5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core28
		bodyModel[69].setRotationPoint(0F, -24F, 0F);

		bodyModel[70].addBox(-4.5F, -20F, -4.5F, 8, 8, 9, 0F); // Core29
		bodyModel[70].setRotationPoint(0F, -24F, 0F);

		bodyModel[71].addShapeBox(-16.5F, -10F, -7F, 1, 4, 14, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Core3
		bodyModel[71].setRotationPoint(0F, -24F, 0F);
		bodyModel[71].rotateAngleZ = -0.43633231F;

		bodyModel[72].addShapeBox(2.5F, -12F, -4.5F, 2, 10, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core30
		bodyModel[72].setRotationPoint(0F, -24F, 0F);

		bodyModel[73].addShapeBox(-19.5F, -10F, -8F, 1, 4, 1, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Core31
		bodyModel[73].setRotationPoint(0F, -24F, 0F);
		bodyModel[73].rotateAngleZ = -0.43633231F;

		bodyModel[74].addBox(-3F, -2F, -4.5F, 2, 1, 9, 0F); // Core32
		bodyModel[74].setRotationPoint(0F, -24F, 0F);

		bodyModel[75].addShapeBox(4.5F, -14F, -4.5F, 3, 2, 9, 0F,0F, .5F, -.5F, -.5F, -.5F, -3F, -.5F, -.5F, -3F, 0F, .5F, -.5F, 0F, 0F, 0F, .5F, -.2F, -3F, .5F, -.2F, -3F, 0F, 0F, 0F); // Core33
		bodyModel[75].setRotationPoint(0F, -24F, 0F);

		bodyModel[76].addShapeBox(-22F, -19F, 4F, 2, 4, 10, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Core34
		bodyModel[76].setRotationPoint(0F, -24F, 0F);
		bodyModel[76].rotateAngleZ = -0.43633231F;

		bodyModel[77].addShapeBox(-3F, -3F, -5F, 1, 1, 1, 0F,.1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F); // Core35
		bodyModel[77].setRotationPoint(0F, -24F, 0F);

		bodyModel[78].addShapeBox(-20F, -22F, 4F, 7, 3, 10, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core36
		bodyModel[78].setRotationPoint(0F, -24F, 0F);
		bodyModel[78].rotateAngleZ = -0.43633231F;

		bodyModel[79].addShapeBox(-5F, -3F, -5F, 3, 1, 1, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Core37
		bodyModel[79].setRotationPoint(0F, -24F, 0F);

		bodyModel[80].addShapeBox(3.5F, -15F, -4.5F, 1, 3, 9, 0F,0F, 0F, .1F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, .1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core38
		bodyModel[80].setRotationPoint(0F, -24F, 0F);

		bodyModel[81].addShapeBox(-20F, -19F, 4F, 7, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core39
		bodyModel[81].setRotationPoint(0F, -24F, 0F);
		bodyModel[81].rotateAngleZ = -0.43633231F;

		bodyModel[82].addShapeBox(-5F, -11F, -1F, 3, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Core4
		bodyModel[82].setRotationPoint(0F, -24F, 0F);

		bodyModel[83].addShapeBox(3.5F, -21F, -5F, 6, 4, 10, 0F,0F, 0F, -.5F, -3.5F, -.5F, -3F, -3.5F, -.5F, -3F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, .5F, -3F, 0F, .5F, -3F, 0F, 0F, 0F); // Core40
		bodyModel[83].setRotationPoint(0F, -24F, 0F);

		bodyModel[84].addShapeBox(-5F, -6F, -5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core41
		bodyModel[84].setRotationPoint(0F, -24F, 0F);

		bodyModel[85].addShapeBox(-20F, -15F, 4F, 7, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Core42
		bodyModel[85].setRotationPoint(0F, -24F, 0F);
		bodyModel[85].rotateAngleZ = -0.43633231F;

		bodyModel[86].addShapeBox(-4.5F, -17F, 4.5F, 8, 2, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Core43
		bodyModel[86].setRotationPoint(0F, -24F, 0F);

		bodyModel[87].addShapeBox(-5F, -7F, -5F, 2, 1, 1, 0F,0F, -.4F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core44
		bodyModel[87].setRotationPoint(0F, -24F, 0F);

		bodyModel[88].addShapeBox(-2.5F, -10F, 3.5F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core45
		bodyModel[88].setRotationPoint(0F, -24F, 0F);

		bodyModel[89].addShapeBox(-4.5F, -21F, -4.5F, 8, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F); // Core46
		bodyModel[89].setRotationPoint(0F, -24F, 0F);

		bodyModel[90].addShapeBox(-6.5F, -24F, -1.5F, 5, 3, 3, 0F,0F, .2F, 0F, -1F, .2F, 0F, -1F, .2F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core47
		bodyModel[90].setRotationPoint(0F, -24F, 0F);

		bodyModel[91].addShapeBox(3.5F, -17F, -4.5F, 3, 3, 9, 0F,0F, 0F, 0F, 2F, 0F, -2.5F, 2F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -3F, 0F, .5F, -3F, 0F, 0F, 0F); // Core48
		bodyModel[91].setRotationPoint(0F, -24F, 0F);

		bodyModel[92].addShapeBox(-2.5F, -10F, -4.5F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core49
		bodyModel[92].setRotationPoint(0F, -24F, 0F);

		bodyModel[93].addShapeBox(-6F, -16F, -4.5F, 3, 5, 9, 0F,0F, -1F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, -1F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F); // Core5
		bodyModel[93].setRotationPoint(0F, -24F, 0F);

		bodyModel[94].addShapeBox(-3.5F, -26F, 4.5F, 2, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Core50
		bodyModel[94].setRotationPoint(0F, -24F, 0F);

		bodyModel[95].addShapeBox(-2.5F, -16F, 4.5F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core51
		bodyModel[95].setRotationPoint(0F, -24F, 0F);

		bodyModel[96].addShapeBox(3.5F, -21F, -1F, 5, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core52
		bodyModel[96].setRotationPoint(0F, -24F, 0F);

		bodyModel[97].addShapeBox(1.5F, -23F, -1F, 2, 2, 2, 0F,-2F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -2F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core53
		bodyModel[97].setRotationPoint(0F, -24F, 0F);

		bodyModel[98].addShapeBox(-2.5F, -16F, 5.5F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core54
		bodyModel[98].setRotationPoint(0F, -24F, 0F);

		bodyModel[99].addShapeBox(-3.5F, -26F, 2.5F, 2, 5, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core55
		bodyModel[99].setRotationPoint(0F, -24F, 0F);

		bodyModel[100].addShapeBox(3.5F, -23F, -1F, 5, 2, 2, 0F,0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core56
		bodyModel[100].setRotationPoint(0F, -24F, 0F);

		bodyModel[101].addShapeBox(-3.5F, -16F, 4.5F, 1, 5, 6, 0F,-.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -.5F, -1F, 0F); // Core57
		bodyModel[101].setRotationPoint(0F, -24F, 0F);

		bodyModel[102].addShapeBox(-3.5F, -25F, 9.5F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Core58
		bodyModel[102].setRotationPoint(0F, -24F, 0F);

		bodyModel[103].addShapeBox(-1.5F, -25F, 9.5F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Core59
		bodyModel[103].setRotationPoint(0F, -24F, 0F);

		bodyModel[104].addShapeBox(-3F, -3F, 4F, 1, 1, 1, 0F,.1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F); // Core6
		bodyModel[104].setRotationPoint(0F, -24F, 0F);

		bodyModel[105].addShapeBox(-2.5F, -17F, 8.5F, 5, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core60
		bodyModel[105].setRotationPoint(0F, -24F, 0F);

		bodyModel[106].addShapeBox(-16.5F, -10F, -8F, 1, 4, 1, 0F,0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Core61
		bodyModel[106].setRotationPoint(0F, -24F, 0F);
		bodyModel[106].rotateAngleZ = -0.43633231F;

		bodyModel[107].addShapeBox(-2F, -6.5F, 4F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core62
		bodyModel[107].setRotationPoint(0F, -24F, 0F);

		bodyModel[108].addShapeBox(-1.5F, -26F, 4.5F, 1, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Core63
		bodyModel[108].setRotationPoint(0F, -24F, 0F);

		bodyModel[109].addShapeBox(2.5F, -16F, 4.5F, 1, 5, 6, 0F,0F, 0F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, -1F, 0F, 0F, -1F, 0F); // Core64
		bodyModel[109].setRotationPoint(0F, -24F, 0F);

		bodyModel[110].addShapeBox(-2.5F, -17F, -10.5F, 5, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core65
		bodyModel[110].setRotationPoint(0F, -24F, 0F);

		bodyModel[111].addShapeBox(-3.5F, -16F, -10.5F, 1, 5, 6, 0F,-.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F); // Core66
		bodyModel[111].setRotationPoint(0F, -24F, 0F);

		bodyModel[112].addShapeBox(-1.5F, -26F, 2.5F, 1, 5, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core67
		bodyModel[112].setRotationPoint(0F, -24F, 0F);

		bodyModel[113].addShapeBox(-1.5F, -25F, -11.5F, 1, 5, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core68
		bodyModel[113].setRotationPoint(0F, -24F, 0F);

		bodyModel[114].addShapeBox(-2.5F, -16F, -10.5F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core69
		bodyModel[114].setRotationPoint(0F, -24F, 0F);

		bodyModel[115].addShapeBox(-20F, -19F, -14F, 7, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core7
		bodyModel[115].setRotationPoint(0F, -24F, 0F);
		bodyModel[115].rotateAngleZ = -0.43633231F;

		bodyModel[116].addShapeBox(-4.5F, -20F, 4.5F, 8, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, -.5F, -.5F, -1F, -.5F, -.5F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Core70
		bodyModel[116].setRotationPoint(0F, -24F, 0F);

		bodyModel[117].addShapeBox(-1.5F, -26F, -9.5F, 1, 5, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core71
		bodyModel[117].setRotationPoint(0F, -24F, 0F);

		bodyModel[118].addShapeBox(-4.5F, -20F, -8.5F, 8, 3, 4, 0F,-1F, -.5F, -.5F, -2F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Core72
		bodyModel[118].setRotationPoint(0F, -24F, 0F);

		bodyModel[119].addShapeBox(2.5F, -16F, -10.5F, 1, 5, 6, 0F,0F, 0F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F); // Core73
		bodyModel[119].setRotationPoint(0F, -24F, 0F);

		bodyModel[120].addShapeBox(-2.5F, -16F, -5.5F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core74
		bodyModel[120].setRotationPoint(0F, -24F, 0F);

		bodyModel[121].addShapeBox(-4.5F, -17F, -8.5F, 8, 2, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core75
		bodyModel[121].setRotationPoint(0F, -24F, 0F);

		bodyModel[122].addShapeBox(-1.5F, -26F, -4.5F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Core76
		bodyModel[122].setRotationPoint(0F, -24F, 0F);

		bodyModel[123].addShapeBox(-6.5F, -17.2F, 2.5F, 5, 6, 2, 0F,4F, 0F, 0F, -4F, 4F, 0F, -4F, 4F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core77
		bodyModel[123].setRotationPoint(0F, -24F, 0F);

		bodyModel[124].addShapeBox(-3.5F, -25F, -11.5F, 2, 5, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core78
		bodyModel[124].setRotationPoint(0F, -24F, 0F);

		bodyModel[125].addShapeBox(-3.5F, -26F, -9.5F, 2, 5, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core79
		bodyModel[125].setRotationPoint(0F, -24F, 0F);

		bodyModel[126].addShapeBox(-20F, -15F, -14F, 7, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Core8
		bodyModel[126].setRotationPoint(0F, -24F, 0F);
		bodyModel[126].rotateAngleZ = -0.43633231F;

		bodyModel[127].addShapeBox(-3.5F, -26F, -4.5F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Core80
		bodyModel[127].setRotationPoint(0F, -24F, 0F);

		bodyModel[128].addShapeBox(0.5F, -17F, 10.5F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Core81
		bodyModel[128].setRotationPoint(0F, -24F, 0F);

		bodyModel[129].addShapeBox(-2.5F, -13F, 3.5F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Core82
		bodyModel[129].setRotationPoint(0F, -24F, 0F);
		bodyModel[129].rotateAngleZ = -0.52359878F;

		bodyModel[130].addShapeBox(-2.5F, -14F, 3.5F, 2, 1, 2, 0F,-.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Core83
		bodyModel[130].setRotationPoint(0F, -24F, 0F);
		bodyModel[130].rotateAngleZ = -0.52359878F;

		bodyModel[131].addShapeBox(-1.5F, -17F, 10.5F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Core84
		bodyModel[131].setRotationPoint(0F, -24F, 0F);

		bodyModel[132].addShapeBox(-5F, -6F, -1F, 3, 6, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F); // Core85
		bodyModel[132].setRotationPoint(0F, -24F, 0F);

		bodyModel[133].addShapeBox(4.5F, -12F, -4.5F, 5, 4, 9, 0F,0F, 0F, 0F, -1.5F, 0F, -3F, -1.5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Core86
		bodyModel[133].setRotationPoint(0F, -24F, 0F);

		bodyModel[134].addShapeBox(-18.5F, -10F, -8F, 2, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core87
		bodyModel[134].setRotationPoint(0F, -24F, 0F);
		bodyModel[134].rotateAngleZ = -0.43633231F;

		bodyModel[135].addShapeBox(0.5F, -8F, 19.5F, 1, 3, 2, 0F,0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core88
		bodyModel[135].setRotationPoint(0F, -24F, 0F);
		bodyModel[135].rotateAngleX = 0.52359878F;

		bodyModel[136].addShapeBox(-2.5F, -14.1F, 3.5F, 2, 1, 2, 0F,-.7F, 0F, -.7F, -.7F, 0F, -.7F, -.7F, 0F, -.7F, -.7F, 0F, -.7F, -.7F, 0F, -.7F, -.7F, 0F, -.7F, -.7F, 0F, -.7F, -.7F, 0F, -.7F); // Core89
		bodyModel[136].setRotationPoint(0F, -24F, 0F);
		bodyModel[136].rotateAngleZ = -0.52359878F;

		bodyModel[137].addShapeBox(4.5F, -6F, -2.5F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F); // Core9
		bodyModel[137].setRotationPoint(0F, -24F, 0F);

		bodyModel[138].addShapeBox(-1.5F, -8F, 19.5F, 1, 3, 2, 0F,0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core90
		bodyModel[138].setRotationPoint(0F, -24F, 0F);
		bodyModel[138].rotateAngleX = 0.52359878F;

		bodyModel[139].addShapeBox(-2.5F, -13F, -5.5F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Core91
		bodyModel[139].setRotationPoint(0F, -24F, 0F);
		bodyModel[139].rotateAngleZ = -0.52359878F;

		bodyModel[140].addShapeBox(-2.5F, -14F, -5.5F, 2, 1, 2, 0F,-.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Core92
		bodyModel[140].setRotationPoint(0F, -24F, 0F);
		bodyModel[140].rotateAngleZ = -0.52359878F;

		bodyModel[141].addShapeBox(-0.5F, -16F, 11.5F, 1, 1, 3, 0F,0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F); // Core93
		bodyModel[141].setRotationPoint(0F, -24F, 0F);

		bodyModel[142].addShapeBox(-1.5F, -9F, 21.5F, 3, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core94
		bodyModel[142].setRotationPoint(0F, -24F, 0F);
		bodyModel[142].rotateAngleX = 0.52359878F;

		bodyModel[143].addShapeBox(-2.5F, -14.1F, -5.5F, 2, 1, 2, 0F,-.7F, 0F, -.7F, -.7F, 0F, -.7F, -.7F, 0F, -.7F, -.7F, 0F, -.7F, -.7F, 0F, -.7F, -.7F, 0F, -.7F, -.7F, 0F, -.7F, -.7F, 0F, -.7F); // Core95
		bodyModel[143].setRotationPoint(0F, -24F, 0F);
		bodyModel[143].rotateAngleZ = -0.52359878F;

		bodyModel[144].addShapeBox(2.5F, -17F, 5.5F, 2, 1, 2, 0F,0F, 0F, -.5F, -.5F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Core96
		bodyModel[144].setRotationPoint(0F, -24F, 0F);

		bodyModel[145].addShapeBox(1.5F, -9F, 21.5F, 1, 5, 5, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Core97
		bodyModel[145].setRotationPoint(0F, -24F, 0F);
		bodyModel[145].rotateAngleX = 0.52359878F;

		bodyModel[146].addShapeBox(2.5F, -16F, 5.5F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, -.5F); // Core98
		bodyModel[146].setRotationPoint(0F, -24F, 0F);

		bodyModel[147].addShapeBox(-2.5F, -9F, 21.5F, 1, 5, 5, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Core99
		bodyModel[147].setRotationPoint(0F, -24F, 0F);
		bodyModel[147].rotateAngleX = 0.52359878F;

		bodyModel[148].addShapeBox(-40F, -40F, 25.52F, 80, 80, 0, 0F,-43F, -43F, 0F, -43F, -43F, 0F, -43F, -43F, 0F, -43F, -43F, 0F, -43F, -43F, 0F, -43F, -43F, 0F, -43F, -43F, 0F, -43F, -43F, 0F); // CoreDecal1
		bodyModel[148].setRotationPoint(0F, -24F, 0F);
		bodyModel[148].rotateAngleX = 0.52359878F;

		bodyModel[149].addShapeBox(-40F, -40F, -25.52F, 80, 80, 0, 0F,-43F, -43F, 0F, -43F, -43F, 0F, -43F, -43F, 0F, -43F, -43F, 0F, -43F, -43F, 0F, -43F, -43F, 0F, -43F, -43F, 0F, -43F, -43F, 0F); // CoreDecal2
		bodyModel[149].setRotationPoint(0F, -24F, 0F);
		bodyModel[149].rotateAngleX = -0.52359878F;

		bodyModel[150].addShapeBox(-15F, -4F, 2F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[150].setRotationPoint(0F, -24F, 0F);
		bodyModel[150].rotateAngleZ = -0.43633231F;

		bodyModel[151].addShapeBox(-15F, -3F, 5F, 2, 2, 2, 0F,-.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F); // Box 4
		bodyModel[151].setRotationPoint(0F, -24F, 0F);
		bodyModel[151].rotateAngleZ = -0.43633231F;

		bodyModel[152].addShapeBox(-15F, -9F, -2F, 2, 11, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[152].setRotationPoint(0F, -24F, 0F);
		bodyModel[152].rotateAngleZ = -0.43633231F;

		bodyModel[153].addShapeBox(-15F, 2F, -2F, 2, 1, 4, 0F,0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -.6F, 0F, -1F, -.6F, 0F, -1F, 0F, 0F, -1F); // Box 6
		bodyModel[153].setRotationPoint(0F, -24F, 0F);
		bodyModel[153].rotateAngleZ = -0.43633231F;

		bodyModel[154].addShapeBox(-15F, -3F, -7F, 2, 2, 2, 0F,-.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F); // Box 7
		bodyModel[154].setRotationPoint(0F, -24F, 0F);
		bodyModel[154].rotateAngleZ = -0.43633231F;

		bodyModel[155].addShapeBox(-15F, -4F, -5F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[155].setRotationPoint(0F, -24F, 0F);
		bodyModel[155].rotateAngleZ = -0.43633231F;

		bodyModel[156].addShapeBox(-22F, -17F, -2F, 2, 11, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 9
		bodyModel[156].setRotationPoint(0F, -24F, 0F);
		bodyModel[156].rotateAngleZ = -0.43633231F;

		bodyModel[157].addShapeBox(-22F, -19F, -2F, 2, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[157].setRotationPoint(0F, -24F, 0F);
		bodyModel[157].rotateAngleZ = -0.43633231F;

		bodyModel[158].addShapeBox(-15.5F, -3F, 6.5F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[158].setRotationPoint(0F, -24F, 0F);
		bodyModel[158].rotateAngleZ = -0.43633231F;

		bodyModel[159].addShapeBox(-13.5F, -4F, 8F, 3, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 41
		bodyModel[159].setRotationPoint(0F, -24F, 0F);
		bodyModel[159].rotateAngleZ = -0.43633231F;

		bodyModel[160].addShapeBox(-13.5F, -4F, 7F, 3, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[160].setRotationPoint(0F, -24F, 0F);
		bodyModel[160].rotateAngleZ = -0.43633231F;

		bodyModel[161].addShapeBox(-13.5F, -4F, 6F, 3, 8, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[161].setRotationPoint(0F, -24F, 0F);
		bodyModel[161].rotateAngleZ = -0.43633231F;

		bodyModel[162].addShapeBox(-13.5F, 4F, 6F, 3, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[162].setRotationPoint(0F, -24F, 0F);
		bodyModel[162].rotateAngleZ = -0.43633231F;

		bodyModel[163].addShapeBox(-13.5F, 4F, 7F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[163].setRotationPoint(0F, -24F, 0F);
		bodyModel[163].rotateAngleZ = -0.43633231F;

		bodyModel[164].addShapeBox(-13.5F, 4F, 8F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 46
		bodyModel[164].setRotationPoint(0F, -24F, 0F);
		bodyModel[164].rotateAngleZ = -0.43633231F;

		bodyModel[165].addShapeBox(-13.5F, 6F, 8F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -1F, -.5F, -.5F, -1F, -.5F, -.5F); // Box 47
		bodyModel[165].setRotationPoint(0F, -24F, 0F);
		bodyModel[165].rotateAngleZ = -0.43633231F;

		bodyModel[166].addShapeBox(-13.5F, 6F, 7F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F); // Box 48
		bodyModel[166].setRotationPoint(0F, -24F, 0F);
		bodyModel[166].rotateAngleZ = -0.43633231F;

		bodyModel[167].addShapeBox(-13.5F, 6F, 6F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -.5F, -.5F, -1F, -.5F, -.5F, -.5F, -.5F, 0F, -.5F, -.5F, 0F); // Box 49
		bodyModel[167].setRotationPoint(0F, -24F, 0F);
		bodyModel[167].rotateAngleZ = -0.43633231F;

		bodyModel[168].addShapeBox(-13F, 6F, 6.5F, 2, 1, 2, 0F,-.25F, 0F, -.25F, -.25F, 0F, -.25F, -.25F, 0F, -.25F, -.25F, 0F, -.25F, -.25F, 0F, -.25F, -.25F, 0F, -.25F, -.25F, 0F, -.25F, -.25F, 0F, -.25F); // Box 50
		bodyModel[168].setRotationPoint(0F, -24F, 0F);
		bodyModel[168].rotateAngleZ = -0.43633231F;

		bodyModel[169].addShapeBox(-13.5F, 6.3F, 8F, 3, 1, 1, 0F,-.5F, -.5F, 0F, -.5F, -.5F, 0F, -1F, -.5F, -.5F, -1F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 51
		bodyModel[169].setRotationPoint(0F, -24F, 0F);
		bodyModel[169].rotateAngleZ = -0.43633231F;

		bodyModel[170].addShapeBox(-13.5F, 6.3F, 7F, 3, 1, 1, 0F,-.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[170].setRotationPoint(0F, -24F, 0F);
		bodyModel[170].rotateAngleZ = -0.43633231F;

		bodyModel[171].addShapeBox(-13.5F, 6.3F, 6F, 3, 1, 1, 0F,-1F, -.5F, -.5F, -1F, -.5F, -.5F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[171].setRotationPoint(0F, -24F, 0F);
		bodyModel[171].rotateAngleZ = -0.43633231F;

		bodyModel[172].addShapeBox(-13.5F, 7.3F, 6F, 3, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[172].setRotationPoint(0F, -24F, 0F);
		bodyModel[172].rotateAngleZ = -0.43633231F;

		bodyModel[173].addShapeBox(-13.5F, 7.3F, 7F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[173].setRotationPoint(0F, -24F, 0F);
		bodyModel[173].rotateAngleZ = -0.43633231F;

		bodyModel[174].addShapeBox(-13.5F, 7.3F, 8F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 56
		bodyModel[174].setRotationPoint(0F, -24F, 0F);
		bodyModel[174].rotateAngleZ = -0.43633231F;

		bodyModel[175].addShapeBox(-13.5F, 9.7F, 8F, 3, 2, 1, 0F,-.5F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 57
		bodyModel[175].setRotationPoint(0F, -24F, 0F);
		bodyModel[175].rotateAngleZ = -0.43633231F;

		bodyModel[176].addShapeBox(-13.5F, 9.7F, 7F, 3, 2, 1, 0F,-.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[176].setRotationPoint(0F, -24F, 0F);
		bodyModel[176].rotateAngleZ = -0.43633231F;

		bodyModel[177].addShapeBox(-13.5F, 9.7F, 6F, 3, 2, 1, 0F,-1F, 0F, -.5F, -1F, 0F, -.5F, -.5F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[177].setRotationPoint(0F, -24F, 0F);
		bodyModel[177].rotateAngleZ = -0.43633231F;

		bodyModel[178].addShapeBox(-13.5F, 9.3F, 6F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -.5F, -.5F, -1F, -.5F, -.5F, -.5F, -.5F, 0F, -.5F, -.5F, 0F); // Box 60
		bodyModel[178].setRotationPoint(0F, -24F, 0F);
		bodyModel[178].rotateAngleZ = -0.43633231F;

		bodyModel[179].addShapeBox(-13.5F, 9.3F, 7F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F); // Box 61
		bodyModel[179].setRotationPoint(0F, -24F, 0F);
		bodyModel[179].rotateAngleZ = -0.43633231F;

		bodyModel[180].addShapeBox(-13.5F, 9.3F, 8F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -1F, -.5F, -.5F, -1F, -.5F, -.5F); // Box 62
		bodyModel[180].setRotationPoint(0F, -24F, 0F);
		bodyModel[180].rotateAngleZ = -0.43633231F;

		bodyModel[181].addShapeBox(-13.5F, -5F, 6F, 3, 1, 1, 0F,-1F, -.5F, -.5F, -1F, -.5F, -.5F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[181].setRotationPoint(0F, -24F, 0F);
		bodyModel[181].rotateAngleZ = -0.43633231F;

		bodyModel[182].addShapeBox(-13.5F, -5F, 7F, 3, 1, 1, 0F,-.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[182].setRotationPoint(0F, -24F, 0F);
		bodyModel[182].rotateAngleZ = -0.43633231F;

		bodyModel[183].addShapeBox(-13.5F, -5F, 8F, 3, 1, 1, 0F,-.5F, -.5F, 0F, -.5F, -.5F, 0F, -1F, -.5F, -.5F, -1F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 65
		bodyModel[183].setRotationPoint(0F, -24F, 0F);
		bodyModel[183].rotateAngleZ = -0.43633231F;

		bodyModel[184].addShapeBox(-22F, -17F, 2F, 2, 7, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[184].setRotationPoint(0F, -24F, 0F);
		bodyModel[184].rotateAngleZ = -0.43633231F;

		bodyModel[185].addShapeBox(-23F, -16F, 2F, 1, 3, 1, 0F,0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[185].setRotationPoint(0F, -24F, 0F);
		bodyModel[185].rotateAngleZ = -0.43633231F;

		bodyModel[186].addShapeBox(-22F, -17F, -3F, 2, 7, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[186].setRotationPoint(0F, -24F, 0F);
		bodyModel[186].rotateAngleZ = -0.43633231F;

		bodyModel[187].addShapeBox(-23F, -16F, -3F, 1, 3, 1, 0F,0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[187].setRotationPoint(0F, -24F, 0F);
		bodyModel[187].rotateAngleZ = -0.43633231F;

		bodyModel[188].addShapeBox(1F, -19F, 5F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[188].setRotationPoint(0F, -24F, 0F);

		bodyModel[189].addShapeBox(1F, -19F, -8F, 3, 1, 3, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[189].setRotationPoint(0F, -24F, 0F);

		bodyModel[190].addShapeBox(-17.5F, -4F, 8F, 3, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 135
		bodyModel[190].setRotationPoint(0F, -24F, 0F);
		bodyModel[190].rotateAngleZ = -0.43633231F;

		bodyModel[191].addShapeBox(-17.5F, -4F, 7F, 3, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[191].setRotationPoint(0F, -24F, 0F);
		bodyModel[191].rotateAngleZ = -0.43633231F;

		bodyModel[192].addShapeBox(-17.5F, -4F, 6F, 3, 8, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[192].setRotationPoint(0F, -24F, 0F);
		bodyModel[192].rotateAngleZ = -0.43633231F;

		bodyModel[193].addShapeBox(-17.5F, 4F, 6F, 3, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[193].setRotationPoint(0F, -24F, 0F);
		bodyModel[193].rotateAngleZ = -0.43633231F;

		bodyModel[194].addShapeBox(-17.5F, 4F, 7F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[194].setRotationPoint(0F, -24F, 0F);
		bodyModel[194].rotateAngleZ = -0.43633231F;

		bodyModel[195].addShapeBox(-17.5F, 4F, 8F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 140
		bodyModel[195].setRotationPoint(0F, -24F, 0F);
		bodyModel[195].rotateAngleZ = -0.43633231F;

		bodyModel[196].addShapeBox(-17.5F, 6F, 8F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -1F, -.5F, -.5F, -1F, -.5F, -.5F); // Box 141
		bodyModel[196].setRotationPoint(0F, -24F, 0F);
		bodyModel[196].rotateAngleZ = -0.43633231F;

		bodyModel[197].addShapeBox(-17.5F, 6F, 7F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F); // Box 142
		bodyModel[197].setRotationPoint(0F, -24F, 0F);
		bodyModel[197].rotateAngleZ = -0.43633231F;

		bodyModel[198].addShapeBox(-17.5F, 6F, 6F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -.5F, -.5F, -1F, -.5F, -.5F, -.5F, -.5F, 0F, -.5F, -.5F, 0F); // Box 143
		bodyModel[198].setRotationPoint(0F, -24F, 0F);
		bodyModel[198].rotateAngleZ = -0.43633231F;

		bodyModel[199].addShapeBox(-17F, 6F, 6.5F, 2, 1, 2, 0F,-.25F, 0F, -.25F, -.25F, 0F, -.25F, -.25F, 0F, -.25F, -.25F, 0F, -.25F, -.25F, 0F, -.25F, -.25F, 0F, -.25F, -.25F, 0F, -.25F, -.25F, 0F, -.25F); // Box 144
		bodyModel[199].setRotationPoint(0F, -24F, 0F);
		bodyModel[199].rotateAngleZ = -0.43633231F;

		bodyModel[200].addShapeBox(-17.5F, 6.3F, 6F, 3, 1, 1, 0F,-1F, -.5F, -.5F, -1F, -.5F, -.5F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[200].setRotationPoint(0F, -24F, 0F);
		bodyModel[200].rotateAngleZ = -0.43633231F;

		bodyModel[201].addShapeBox(-17.5F, 6.3F, 7F, 3, 1, 1, 0F,-.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[201].setRotationPoint(0F, -24F, 0F);
		bodyModel[201].rotateAngleZ = -0.43633231F;

		bodyModel[202].addShapeBox(-17.5F, 6.3F, 8F, 3, 1, 1, 0F,-.5F, -.5F, 0F, -.5F, -.5F, 0F, -1F, -.5F, -.5F, -1F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 147
		bodyModel[202].setRotationPoint(0F, -24F, 0F);
		bodyModel[202].rotateAngleZ = -0.43633231F;

		bodyModel[203].addShapeBox(-17.5F, 7.3F, 8F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 148
		bodyModel[203].setRotationPoint(0F, -24F, 0F);
		bodyModel[203].rotateAngleZ = -0.43633231F;

		bodyModel[204].addShapeBox(-17.5F, 7.3F, 7F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[204].setRotationPoint(0F, -24F, 0F);
		bodyModel[204].rotateAngleZ = -0.43633231F;

		bodyModel[205].addShapeBox(-17.5F, 7.3F, 6F, 3, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[205].setRotationPoint(0F, -24F, 0F);
		bodyModel[205].rotateAngleZ = -0.43633231F;

		bodyModel[206].addShapeBox(-17.5F, 9.3F, 6F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -.5F, -.5F, -1F, -.5F, -.5F, -.5F, -.5F, 0F, -.5F, -.5F, 0F); // Box 151
		bodyModel[206].setRotationPoint(0F, -24F, 0F);
		bodyModel[206].rotateAngleZ = -0.43633231F;

		bodyModel[207].addShapeBox(-17.5F, 9.3F, 7F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F); // Box 152
		bodyModel[207].setRotationPoint(0F, -24F, 0F);
		bodyModel[207].rotateAngleZ = -0.43633231F;

		bodyModel[208].addShapeBox(-17.5F, 9.3F, 8F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -1F, -.5F, -.5F, -1F, -.5F, -.5F); // Box 153
		bodyModel[208].setRotationPoint(0F, -24F, 0F);
		bodyModel[208].rotateAngleZ = -0.43633231F;

		bodyModel[209].addShapeBox(-17.5F, 9.7F, 8F, 3, 2, 1, 0F,-.5F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 154
		bodyModel[209].setRotationPoint(0F, -24F, 0F);
		bodyModel[209].rotateAngleZ = -0.43633231F;

		bodyModel[210].addShapeBox(-17.5F, 9.7F, 7F, 3, 2, 1, 0F,-.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[210].setRotationPoint(0F, -24F, 0F);
		bodyModel[210].rotateAngleZ = -0.43633231F;

		bodyModel[211].addShapeBox(-17.5F, 9.7F, 6F, 3, 2, 1, 0F,-1F, 0F, -.5F, -1F, 0F, -.5F, -.5F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[211].setRotationPoint(0F, -24F, 0F);
		bodyModel[211].rotateAngleZ = -0.43633231F;

		bodyModel[212].addShapeBox(-17.5F, -5F, 6F, 3, 1, 1, 0F,-1F, -.5F, -.5F, -1F, -.5F, -.5F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[212].setRotationPoint(0F, -24F, 0F);
		bodyModel[212].rotateAngleZ = -0.43633231F;

		bodyModel[213].addShapeBox(-17.5F, -5F, 7F, 3, 1, 1, 0F,-.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[213].setRotationPoint(0F, -24F, 0F);
		bodyModel[213].rotateAngleZ = -0.43633231F;

		bodyModel[214].addShapeBox(-17.5F, -5F, 8F, 3, 1, 1, 0F,-.5F, -.5F, 0F, -.5F, -.5F, 0F, -1F, -.5F, -.5F, -1F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 159
		bodyModel[214].setRotationPoint(0F, -24F, 0F);
		bodyModel[214].rotateAngleZ = -0.43633231F;

		bodyModel[215].addShapeBox(-17.5F, -4F, -7F, 3, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 160
		bodyModel[215].setRotationPoint(0F, -24F, 0F);
		bodyModel[215].rotateAngleZ = -0.43633231F;

		bodyModel[216].addShapeBox(-17.5F, -4F, -8F, 3, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[216].setRotationPoint(0F, -24F, 0F);
		bodyModel[216].rotateAngleZ = -0.43633231F;

		bodyModel[217].addShapeBox(-17.5F, -4F, -9F, 3, 8, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[217].setRotationPoint(0F, -24F, 0F);
		bodyModel[217].rotateAngleZ = -0.43633231F;

		bodyModel[218].addShapeBox(-17.5F, 4F, -9F, 3, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[218].setRotationPoint(0F, -24F, 0F);
		bodyModel[218].rotateAngleZ = -0.43633231F;

		bodyModel[219].addShapeBox(-17.5F, 4F, -8F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[219].setRotationPoint(0F, -24F, 0F);
		bodyModel[219].rotateAngleZ = -0.43633231F;

		bodyModel[220].addShapeBox(-17.5F, 4F, -7F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 165
		bodyModel[220].setRotationPoint(0F, -24F, 0F);
		bodyModel[220].rotateAngleZ = -0.43633231F;

		bodyModel[221].addShapeBox(-17.5F, 6F, -7F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -1F, -.5F, -.5F, -1F, -.5F, -.5F); // Box 166
		bodyModel[221].setRotationPoint(0F, -24F, 0F);
		bodyModel[221].rotateAngleZ = -0.43633231F;

		bodyModel[222].addShapeBox(-17.5F, 6F, -8F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F); // Box 167
		bodyModel[222].setRotationPoint(0F, -24F, 0F);
		bodyModel[222].rotateAngleZ = -0.43633231F;

		bodyModel[223].addShapeBox(-17.5F, 6F, -9F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -.5F, -.5F, -1F, -.5F, -.5F, -.5F, -.5F, 0F, -.5F, -.5F, 0F); // Box 168
		bodyModel[223].setRotationPoint(0F, -24F, 0F);
		bodyModel[223].rotateAngleZ = -0.43633231F;

		bodyModel[224].addShapeBox(-17F, 6F, -8.5F, 2, 1, 2, 0F,-.25F, 0F, -.25F, -.25F, 0F, -.25F, -.25F, 0F, -.25F, -.25F, 0F, -.25F, -.25F, 0F, -.25F, -.25F, 0F, -.25F, -.25F, 0F, -.25F, -.25F, 0F, -.25F); // Box 169
		bodyModel[224].setRotationPoint(0F, -24F, 0F);
		bodyModel[224].rotateAngleZ = -0.43633231F;

		bodyModel[225].addShapeBox(-17.5F, 6.3F, -9F, 3, 1, 1, 0F,-1F, -.5F, -.5F, -1F, -.5F, -.5F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[225].setRotationPoint(0F, -24F, 0F);
		bodyModel[225].rotateAngleZ = -0.43633231F;

		bodyModel[226].addShapeBox(-17.5F, 6.3F, -8F, 3, 1, 1, 0F,-.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[226].setRotationPoint(0F, -24F, 0F);
		bodyModel[226].rotateAngleZ = -0.43633231F;

		bodyModel[227].addShapeBox(-17.5F, 6.3F, -7F, 3, 1, 1, 0F,-.5F, -.5F, 0F, -.5F, -.5F, 0F, -1F, -.5F, -.5F, -1F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 172
		bodyModel[227].setRotationPoint(0F, -24F, 0F);
		bodyModel[227].rotateAngleZ = -0.43633231F;

		bodyModel[228].addShapeBox(-17.5F, 7.3F, -7F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 173
		bodyModel[228].setRotationPoint(0F, -24F, 0F);
		bodyModel[228].rotateAngleZ = -0.43633231F;

		bodyModel[229].addShapeBox(-17.5F, 7.3F, -8F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[229].setRotationPoint(0F, -24F, 0F);
		bodyModel[229].rotateAngleZ = -0.43633231F;

		bodyModel[230].addShapeBox(-17.5F, 7.3F, -9F, 3, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[230].setRotationPoint(0F, -24F, 0F);
		bodyModel[230].rotateAngleZ = -0.43633231F;

		bodyModel[231].addShapeBox(-17.5F, 9.3F, -9F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -.5F, -.5F, -1F, -.5F, -.5F, -.5F, -.5F, 0F, -.5F, -.5F, 0F); // Box 176
		bodyModel[231].setRotationPoint(0F, -24F, 0F);
		bodyModel[231].rotateAngleZ = -0.43633231F;

		bodyModel[232].addShapeBox(-17.5F, 9.3F, -8F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F); // Box 177
		bodyModel[232].setRotationPoint(0F, -24F, 0F);
		bodyModel[232].rotateAngleZ = -0.43633231F;

		bodyModel[233].addShapeBox(-17.5F, 9.3F, -7F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -1F, -.5F, -.5F, -1F, -.5F, -.5F); // Box 178
		bodyModel[233].setRotationPoint(0F, -24F, 0F);
		bodyModel[233].rotateAngleZ = -0.43633231F;

		bodyModel[234].addShapeBox(-17.5F, 9.7F, -7F, 3, 2, 1, 0F,-.5F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 179
		bodyModel[234].setRotationPoint(0F, -24F, 0F);
		bodyModel[234].rotateAngleZ = -0.43633231F;

		bodyModel[235].addShapeBox(-17.5F, 9.7F, -8F, 3, 2, 1, 0F,-.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[235].setRotationPoint(0F, -24F, 0F);
		bodyModel[235].rotateAngleZ = -0.43633231F;

		bodyModel[236].addShapeBox(-17.5F, 9.7F, -9F, 3, 2, 1, 0F,-1F, 0F, -.5F, -1F, 0F, -.5F, -.5F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[236].setRotationPoint(0F, -24F, 0F);
		bodyModel[236].rotateAngleZ = -0.43633231F;

		bodyModel[237].addShapeBox(-17.5F, -5F, -9F, 3, 1, 1, 0F,-1F, -.5F, -.5F, -1F, -.5F, -.5F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[237].setRotationPoint(0F, -24F, 0F);
		bodyModel[237].rotateAngleZ = -0.43633231F;

		bodyModel[238].addShapeBox(-17.5F, -5F, -8F, 3, 1, 1, 0F,-.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[238].setRotationPoint(0F, -24F, 0F);
		bodyModel[238].rotateAngleZ = -0.43633231F;

		bodyModel[239].addShapeBox(-17.5F, -5F, -7F, 3, 1, 1, 0F,-.5F, -.5F, 0F, -.5F, -.5F, 0F, -1F, -.5F, -.5F, -1F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 184
		bodyModel[239].setRotationPoint(0F, -24F, 0F);
		bodyModel[239].rotateAngleZ = -0.43633231F;

		bodyModel[240].addShapeBox(-15.5F, -3F, -8.5F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[240].setRotationPoint(0F, -24F, 0F);
		bodyModel[240].rotateAngleZ = -0.43633231F;

		bodyModel[241].addShapeBox(-13.5F, -4F, -7F, 3, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 186
		bodyModel[241].setRotationPoint(0F, -24F, 0F);
		bodyModel[241].rotateAngleZ = -0.43633231F;

		bodyModel[242].addShapeBox(-13.5F, -4F, -8F, 3, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[242].setRotationPoint(0F, -24F, 0F);
		bodyModel[242].rotateAngleZ = -0.43633231F;

		bodyModel[243].addShapeBox(-13.5F, -4F, -9F, 3, 8, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[243].setRotationPoint(0F, -24F, 0F);
		bodyModel[243].rotateAngleZ = -0.43633231F;

		bodyModel[244].addShapeBox(-13.5F, 4F, -9F, 3, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[244].setRotationPoint(0F, -24F, 0F);
		bodyModel[244].rotateAngleZ = -0.43633231F;

		bodyModel[245].addShapeBox(-13.5F, 4F, -8F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[245].setRotationPoint(0F, -24F, 0F);
		bodyModel[245].rotateAngleZ = -0.43633231F;

		bodyModel[246].addShapeBox(-13.5F, 4F, -7F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 191
		bodyModel[246].setRotationPoint(0F, -24F, 0F);
		bodyModel[246].rotateAngleZ = -0.43633231F;

		bodyModel[247].addShapeBox(-13.5F, 6F, -7F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -1F, -.5F, -.5F, -1F, -.5F, -.5F); // Box 192
		bodyModel[247].setRotationPoint(0F, -24F, 0F);
		bodyModel[247].rotateAngleZ = -0.43633231F;

		bodyModel[248].addShapeBox(-13.5F, 6F, -8F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F); // Box 193
		bodyModel[248].setRotationPoint(0F, -24F, 0F);
		bodyModel[248].rotateAngleZ = -0.43633231F;

		bodyModel[249].addShapeBox(-13.5F, 6F, -9F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -.5F, -.5F, -1F, -.5F, -.5F, -.5F, -.5F, 0F, -.5F, -.5F, 0F); // Box 194
		bodyModel[249].setRotationPoint(0F, -24F, 0F);
		bodyModel[249].rotateAngleZ = -0.43633231F;

		bodyModel[250].addShapeBox(-13F, 6F, -8.5F, 2, 1, 2, 0F,-.25F, 0F, -.25F, -.25F, 0F, -.25F, -.25F, 0F, -.25F, -.25F, 0F, -.25F, -.25F, 0F, -.25F, -.25F, 0F, -.25F, -.25F, 0F, -.25F, -.25F, 0F, -.25F); // Box 195
		bodyModel[250].setRotationPoint(0F, -24F, 0F);
		bodyModel[250].rotateAngleZ = -0.43633231F;

		bodyModel[251].addShapeBox(-13.5F, 6.3F, -9F, 3, 1, 1, 0F,-1F, -.5F, -.5F, -1F, -.5F, -.5F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[251].setRotationPoint(0F, -24F, 0F);
		bodyModel[251].rotateAngleZ = -0.43633231F;

		bodyModel[252].addShapeBox(-13.5F, 6.3F, -8F, 3, 1, 1, 0F,-.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[252].setRotationPoint(0F, -24F, 0F);
		bodyModel[252].rotateAngleZ = -0.43633231F;

		bodyModel[253].addShapeBox(-13.5F, 6.3F, -7F, 3, 1, 1, 0F,-.5F, -.5F, 0F, -.5F, -.5F, 0F, -1F, -.5F, -.5F, -1F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 198
		bodyModel[253].setRotationPoint(0F, -24F, 0F);
		bodyModel[253].rotateAngleZ = -0.43633231F;

		bodyModel[254].addShapeBox(-13.5F, 7.3F, -7F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 199
		bodyModel[254].setRotationPoint(0F, -24F, 0F);
		bodyModel[254].rotateAngleZ = -0.43633231F;

		bodyModel[255].addShapeBox(-13.5F, 7.3F, -8F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[255].setRotationPoint(0F, -24F, 0F);
		bodyModel[255].rotateAngleZ = -0.43633231F;

		bodyModel[256].addShapeBox(-13.5F, 7.3F, -9F, 3, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[256].setRotationPoint(0F, -24F, 0F);
		bodyModel[256].rotateAngleZ = -0.43633231F;

		bodyModel[257].addShapeBox(-13.5F, 9.3F, -9F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -.5F, -.5F, -1F, -.5F, -.5F, -.5F, -.5F, 0F, -.5F, -.5F, 0F); // Box 202
		bodyModel[257].setRotationPoint(0F, -24F, 0F);
		bodyModel[257].rotateAngleZ = -0.43633231F;

		bodyModel[258].addShapeBox(-13.5F, 9.3F, -8F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F); // Box 203
		bodyModel[258].setRotationPoint(0F, -24F, 0F);
		bodyModel[258].rotateAngleZ = -0.43633231F;

		bodyModel[259].addShapeBox(-13.5F, 9.3F, -7F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -1F, -.5F, -.5F, -1F, -.5F, -.5F); // Box 204
		bodyModel[259].setRotationPoint(0F, -24F, 0F);
		bodyModel[259].rotateAngleZ = -0.43633231F;

		bodyModel[260].addShapeBox(-13.5F, 9.7F, -7F, 3, 2, 1, 0F,-.5F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 205
		bodyModel[260].setRotationPoint(0F, -24F, 0F);
		bodyModel[260].rotateAngleZ = -0.43633231F;

		bodyModel[261].addShapeBox(-13.5F, 9.7F, -8F, 3, 2, 1, 0F,-.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[261].setRotationPoint(0F, -24F, 0F);
		bodyModel[261].rotateAngleZ = -0.43633231F;

		bodyModel[262].addShapeBox(-13.5F, 9.7F, -9F, 3, 2, 1, 0F,-1F, 0F, -.5F, -1F, 0F, -.5F, -.5F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[262].setRotationPoint(0F, -24F, 0F);
		bodyModel[262].rotateAngleZ = -0.43633231F;

		bodyModel[263].addShapeBox(-13.5F, -5F, -9F, 3, 1, 1, 0F,-1F, -.5F, -.5F, -1F, -.5F, -.5F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[263].setRotationPoint(0F, -24F, 0F);
		bodyModel[263].rotateAngleZ = -0.43633231F;

		bodyModel[264].addShapeBox(-13.5F, -5F, -8F, 3, 1, 1, 0F,-.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[264].setRotationPoint(0F, -24F, 0F);
		bodyModel[264].rotateAngleZ = -0.43633231F;

		bodyModel[265].addShapeBox(-13.5F, -5F, -7F, 3, 1, 1, 0F,-.5F, -.5F, 0F, -.5F, -.5F, 0F, -1F, -.5F, -.5F, -1F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 210
		bodyModel[265].setRotationPoint(0F, -24F, 0F);
		bodyModel[265].rotateAngleZ = -0.43633231F;
	}

	private void inithipsModel_1()
	{
		hipsModel[0] = new ModelRendererTurbo(this, 137, 15, textureX, textureY); // Hip1
		hipsModel[1] = new ModelRendererTurbo(this, 203, 17, textureX, textureY); // Hip2
		hipsModel[2] = new ModelRendererTurbo(this, 203, 17, textureX, textureY); // Hip3
		hipsModel[3] = new ModelRendererTurbo(this, 35, 125, textureX, textureY); // Hip4
		hipsModel[4] = new ModelRendererTurbo(this, 3, 129, textureX, textureY); // Hip5
		hipsModel[5] = new ModelRendererTurbo(this, 36, 145, textureX, textureY); // Hip6
		hipsModel[6] = new ModelRendererTurbo(this, 5, 145, textureX, textureY); // Hip7
		hipsModel[7] = new ModelRendererTurbo(this, 197, 4, textureX, textureY); // Hip8
		hipsModel[8] = new ModelRendererTurbo(this, 197, 4, textureX, textureY); // Hip9

		hipsModel[0].addBox(-3F, -1F, -4.5F, 2, 1, 9, 0F); // Hip1
		hipsModel[0].setRotationPoint(0F, -24F, 0F);

		hipsModel[1].addShapeBox(-2.5F, -2F, 4F, 2, 2, 1, 0F,.2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F); // Hip2
		hipsModel[1].setRotationPoint(0F, -24F, 0F);

		hipsModel[2].addShapeBox(-2.5F, -2F, -5F, 2, 2, 1, 0F,.2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F); // Hip3
		hipsModel[2].setRotationPoint(0F, -24F, 0F);

		hipsModel[3].addShapeBox(4.5F, -2F, -2.5F, 3, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -5F, 0F, -.5F, 4F, 0F, -1.5F, 4F, 0F, -1.5F, -5F, 0F, -.5F); // Hip4
		hipsModel[3].setRotationPoint(0F, -24F, 0F);

		hipsModel[4].addShapeBox(3F, -2F, -4.5F, 3, 2, 9, 0F,0F, 0F, 0F, 0F, -.5F, -3F, 0F, -.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Hip5
		hipsModel[4].setRotationPoint(0F, -24F, 0F);

		hipsModel[5].addShapeBox(4F, -1F, 1.5F, 7, 5, 5, 0F,0F, 1F, 0F, 2F, 0F, -1F, .5F, 0F, 1F, 0F, 1F, -1F, 0F, 1F, 0F, .4F, 2F, -1F, -.9F, 2F, 1F, 0F, 1F, -1F); // Hip6
		hipsModel[5].setRotationPoint(0F, -24F, 0F);

		hipsModel[6].addShapeBox(4F, -1F, -6.5F, 7, 5, 5, 0F,0F, 1F, -1F, .5F, 0F, 1F, 2F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, -1F, -.9F, 2F, 1F, .4F, 2F, -1F, 0F, 1F, 0F); // Hip7
		hipsModel[6].setRotationPoint(0F, -24F, 0F);

		hipsModel[7].addBox(-1.5F, -3F, 4F, 4, 4, 2, 0F); // Hip8
		hipsModel[7].setRotationPoint(0F, -24F, 0F);

		hipsModel[8].addBox(-1.5F, -3F, -6F, 4, 4, 2, 0F); // Hip9
		hipsModel[8].setRotationPoint(0F, -24F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 213, 127, textureX, textureY); // LeftArm1
		leftArmModel[1] = new ModelRendererTurbo(this, 133, 107, textureX, textureY); // LeftArm10
		leftArmModel[2] = new ModelRendererTurbo(this, 133, 107, textureX, textureY); // LeftArm11
		leftArmModel[3] = new ModelRendererTurbo(this, 133, 121, textureX, textureY); // LeftArm12
		leftArmModel[4] = new ModelRendererTurbo(this, 133, 121, textureX, textureY); // LeftArm13
		leftArmModel[5] = new ModelRendererTurbo(this, 158, 103, textureX, textureY); // LeftArm14
		leftArmModel[6] = new ModelRendererTurbo(this, 158, 103, textureX, textureY); // LeftArm15
		leftArmModel[7] = new ModelRendererTurbo(this, 189, 104, textureX, textureY); // LeftArm16
		leftArmModel[8] = new ModelRendererTurbo(this, 158, 103, textureX, textureY); // LeftArm17
		leftArmModel[9] = new ModelRendererTurbo(this, 221, 116, textureX, textureY); // LeftArm18
		leftArmModel[10] = new ModelRendererTurbo(this, 221, 103, textureX, textureY); // LeftArm19
		leftArmModel[11] = new ModelRendererTurbo(this, 213, 127, textureX, textureY); // LeftArm2
		leftArmModel[12] = new ModelRendererTurbo(this, 221, 91, textureX, textureY); // LeftArm20
		leftArmModel[13] = new ModelRendererTurbo(this, 158, 103, textureX, textureY); // LeftArm21
		leftArmModel[14] = new ModelRendererTurbo(this, 158, 103, textureX, textureY); // LeftArm22
		leftArmModel[15] = new ModelRendererTurbo(this, 178, 101, textureX, textureY); // LeftArm23
		leftArmModel[16] = new ModelRendererTurbo(this, 158, 103, textureX, textureY); // LeftArm24
		leftArmModel[17] = new ModelRendererTurbo(this, 158, 103, textureX, textureY); // LeftArm25
		leftArmModel[18] = new ModelRendererTurbo(this, 203, 121, textureX, textureY); // LeftArm26
		leftArmModel[19] = new ModelRendererTurbo(this, 183, 122, textureX, textureY); // LeftArm27
		leftArmModel[20] = new ModelRendererTurbo(this, 185, 131, textureX, textureY); // LeftArm28
		leftArmModel[21] = new ModelRendererTurbo(this, 201, 129, textureX, textureY); // LeftArm29
		leftArmModel[22] = new ModelRendererTurbo(this, 213, 127, textureX, textureY); // LeftArm3
		leftArmModel[23] = new ModelRendererTurbo(this, 213, 127, textureX, textureY); // LeftArm30
		leftArmModel[24] = new ModelRendererTurbo(this, 213, 127, textureX, textureY); // LeftArm31
		leftArmModel[25] = new ModelRendererTurbo(this, 213, 127, textureX, textureY); // LeftArm32
		leftArmModel[26] = new ModelRendererTurbo(this, 213, 127, textureX, textureY); // LeftArm4
		leftArmModel[27] = new ModelRendererTurbo(this, 213, 127, textureX, textureY); // LeftArm5
		leftArmModel[28] = new ModelRendererTurbo(this, 213, 127, textureX, textureY); // LeftArm6
		leftArmModel[29] = new ModelRendererTurbo(this, 213, 127, textureX, textureY); // LeftArm7
		leftArmModel[30] = new ModelRendererTurbo(this, 107, 104, textureX, textureY); // LeftArm8
		leftArmModel[31] = new ModelRendererTurbo(this, 107, 119, textureX, textureY); // LeftArm9

		leftArmModel[0].addBox(3F, 20.2F, 0.5F, 1, 2, 1, 0F); // LeftArm1
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-2.5F, -2.5F, -5F, 5, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftArm10
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);
		leftArmModel[1].rotateAngleZ = -0.34906585F;

		leftArmModel[2].addShapeBox(-2.5F, -2.5F, -1F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // LeftArm11
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);
		leftArmModel[2].rotateAngleZ = -0.34906585F;

		leftArmModel[3].addShapeBox(-2F, 5F, -2F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -.5F, 0F, 0F, -1.5F, 0F, -1F, 0F, 0F, -3F, 0F); // LeftArm12
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);
		leftArmModel[3].rotateAngleZ = -0.34906585F;

		leftArmModel[4].addShapeBox(0F, 5F, -2F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1F, 0F, 0F, -1F, 0F); // LeftArm13
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);
		leftArmModel[4].rotateAngleZ = -0.34906585F;

		leftArmModel[5].addBox(-6F, 5F, -3.5F, 3, 10, 7, 0F); // LeftArm14
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);
		leftArmModel[5].rotateAngleZ = 0.34906585F;

		leftArmModel[6].addShapeBox(-8F, 7F, -3.5F, 2, 8, 7, 0F,0F, 0F, -.2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F); // LeftArm15
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);
		leftArmModel[6].rotateAngleZ = 0.34906585F;

		leftArmModel[7].addShapeBox(-8F, 3F, -3.5F, 2, 4, 7, 0F,0F, -1F, -2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, -1F, -2F, -1F, 0F, -2F, 0F, 0F, -.5F, 0F, 0F, -.5F, -1F, 0F, -2F); // LeftArm16
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);
		leftArmModel[7].rotateAngleZ = 0.34906585F;

		leftArmModel[8].addShapeBox(-3F, 7F, -3.5F, 2, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // LeftArm17
		leftArmModel[8].setRotationPoint(0F, 0F, 0F);
		leftArmModel[8].rotateAngleZ = 0.34906585F;

		leftArmModel[9].addShapeBox(-8F, 15F, -3.5F, 2, 2, 7, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F); // LeftArm18
		leftArmModel[9].setRotationPoint(0F, 0F, 0F);
		leftArmModel[9].rotateAngleZ = 0.34906585F;

		leftArmModel[10].addShapeBox(-6F, 15F, -3.5F, 3, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // LeftArm19
		leftArmModel[10].setRotationPoint(0F, 0F, 0F);
		leftArmModel[10].rotateAngleZ = 0.34906585F;

		leftArmModel[11].addBox(3F, 20F, -1.5F, 1, 1, 1, 0F); // LeftArm2
		leftArmModel[11].setRotationPoint(0F, 0F, 0F);

		leftArmModel[12].addShapeBox(-3F, 15F, -3.5F, 2, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, -2F); // LeftArm20
		leftArmModel[12].setRotationPoint(0F, 0F, 0F);
		leftArmModel[12].rotateAngleZ = 0.34906585F;

		leftArmModel[13].addShapeBox(-3F, 3F, 1.5F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // LeftArm21
		leftArmModel[13].setRotationPoint(0F, 0F, 0F);
		leftArmModel[13].rotateAngleZ = 0.34906585F;

		leftArmModel[14].addShapeBox(-3F, 3F, -3.5F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftArm22
		leftArmModel[14].setRotationPoint(0F, 0F, 0F);
		leftArmModel[14].rotateAngleZ = 0.34906585F;

		leftArmModel[15].addShapeBox(-1F, 7F, -1.5F, 1, 3, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // LeftArm23
		leftArmModel[15].setRotationPoint(0F, 0F, 0F);
		leftArmModel[15].rotateAngleZ = 0.34906585F;

		leftArmModel[16].addBox(-6F, 3F, -3.5F, 3, 2, 1, 0F); // LeftArm24
		leftArmModel[16].setRotationPoint(0F, 0F, 0F);
		leftArmModel[16].rotateAngleZ = 0.34906585F;

		leftArmModel[17].addBox(-6F, 3F, 2.5F, 3, 2, 1, 0F); // LeftArm25
		leftArmModel[17].setRotationPoint(0F, 0F, 0F);
		leftArmModel[17].rotateAngleZ = 0.34906585F;

		leftArmModel[18].addBox(1F, 17F, -1F, 2, 1, 2, 0F); // LeftArm26
		leftArmModel[18].setRotationPoint(0F, 0F, 0F);

		leftArmModel[19].addShapeBox(0F, 18F, -1.5F, 4, 1, 3, 0F,-.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftArm27
		leftArmModel[19].setRotationPoint(0F, 0F, 0F);

		leftArmModel[20].addShapeBox(0F, 19F, 0.5F, 4, 2, 1, 0F,.1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F); // LeftArm28
		leftArmModel[20].setRotationPoint(0F, 0F, 0F);

		leftArmModel[21].addShapeBox(2F, 19F, -1.5F, 2, 1, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // LeftArm29
		leftArmModel[21].setRotationPoint(0F, 0F, 0F);

		leftArmModel[22].addShapeBox(3F, 22.2F, -0.5F, 1, 1, 2, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F); // LeftArm3
		leftArmModel[22].setRotationPoint(0F, 0F, 0F);

		leftArmModel[23].addBox(0F, 19.5F, 0.5F, 1, 2, 1, 0F); // LeftArm30
		leftArmModel[23].setRotationPoint(0F, 0F, 0F);

		leftArmModel[24].addBox(1F, 20.1F, 0.5F, 1, 2, 1, 0F); // LeftArm31
		leftArmModel[24].setRotationPoint(0F, 0F, 0F);

		leftArmModel[25].addBox(2F, 20.5F, 0.5F, 1, 2, 1, 0F); // LeftArm32
		leftArmModel[25].setRotationPoint(0F, 0F, 0F);

		leftArmModel[26].addShapeBox(2F, 22.5F, -0.5F, 1, 1, 2, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F); // LeftArm4
		leftArmModel[26].setRotationPoint(0F, 0F, 0F);

		leftArmModel[27].addShapeBox(1F, 22.1F, -0.5F, 1, 1, 2, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F); // LeftArm5
		leftArmModel[27].setRotationPoint(0F, 0F, 0F);

		leftArmModel[28].addShapeBox(0F, 21.5F, -0.5F, 1, 1, 2, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F); // LeftArm6
		leftArmModel[28].setRotationPoint(0F, 0F, 0F);

		leftArmModel[29].addShapeBox(2F, 21F, -1.5F, 2, 1, 1, 0F,-.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, -.5F, 0F); // LeftArm7
		leftArmModel[29].setRotationPoint(0F, 0F, 0F);

		leftArmModel[30].addBox(-2F, -2F, -9F, 4, 4, 6, 0F); // LeftArm8
		leftArmModel[30].setRotationPoint(0F, 0F, 0F);
		leftArmModel[30].rotateAngleZ = -0.34906585F;

		leftArmModel[31].addShapeBox(-2F, -2F, -5F, 4, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // LeftArm9
		leftArmModel[31].setRotationPoint(0F, 0F, 0F);
		leftArmModel[31].rotateAngleZ = -0.34906585F;
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 107, 104, textureX, textureY); // RightArm1
		rightArmModel[1] = new ModelRendererTurbo(this, 158, 103, textureX, textureY); // RightArm10
		rightArmModel[2] = new ModelRendererTurbo(this, 158, 103, textureX, textureY); // RightArm11
		rightArmModel[3] = new ModelRendererTurbo(this, 189, 104, textureX, textureY); // RightArm12
		rightArmModel[4] = new ModelRendererTurbo(this, 158, 103, textureX, textureY); // RightArm13
		rightArmModel[5] = new ModelRendererTurbo(this, 158, 103, textureX, textureY); // RightArm14
		rightArmModel[6] = new ModelRendererTurbo(this, 133, 121, textureX, textureY); // RightArm15
		rightArmModel[7] = new ModelRendererTurbo(this, 133, 121, textureX, textureY); // RightArm16
		rightArmModel[8] = new ModelRendererTurbo(this, 221, 116, textureX, textureY); // RightArm17
		rightArmModel[9] = new ModelRendererTurbo(this, 221, 103, textureX, textureY); // RightArm18
		rightArmModel[10] = new ModelRendererTurbo(this, 221, 91, textureX, textureY); // RightArm19
		rightArmModel[11] = new ModelRendererTurbo(this, 107, 119, textureX, textureY); // RightArm2
		rightArmModel[12] = new ModelRendererTurbo(this, 203, 121, textureX, textureY); // RightArm20
		rightArmModel[13] = new ModelRendererTurbo(this, 183, 122, textureX, textureY); // RightArm21
		rightArmModel[14] = new ModelRendererTurbo(this, 201, 129, textureX, textureY); // RightArm22
		rightArmModel[15] = new ModelRendererTurbo(this, 213, 127, textureX, textureY); // RightArm23
		rightArmModel[16] = new ModelRendererTurbo(this, 213, 127, textureX, textureY); // RightArm24
		rightArmModel[17] = new ModelRendererTurbo(this, 185, 131, textureX, textureY); // RightArm25
		rightArmModel[18] = new ModelRendererTurbo(this, 213, 127, textureX, textureY); // RightArm26
		rightArmModel[19] = new ModelRendererTurbo(this, 213, 127, textureX, textureY); // RightArm27
		rightArmModel[20] = new ModelRendererTurbo(this, 213, 127, textureX, textureY); // RightArm28
		rightArmModel[21] = new ModelRendererTurbo(this, 213, 127, textureX, textureY); // RightArm29
		rightArmModel[22] = new ModelRendererTurbo(this, 133, 107, textureX, textureY); // RightArm3
		rightArmModel[23] = new ModelRendererTurbo(this, 213, 127, textureX, textureY); // RightArm30
		rightArmModel[24] = new ModelRendererTurbo(this, 213, 127, textureX, textureY); // RightArm31
		rightArmModel[25] = new ModelRendererTurbo(this, 213, 127, textureX, textureY); // RightArm32
		rightArmModel[26] = new ModelRendererTurbo(this, 133, 107, textureX, textureY); // RightArm4
		rightArmModel[27] = new ModelRendererTurbo(this, 213, 127, textureX, textureY); // RightArm5
		rightArmModel[28] = new ModelRendererTurbo(this, 158, 103, textureX, textureY); // RightArm6
		rightArmModel[29] = new ModelRendererTurbo(this, 158, 103, textureX, textureY); // RightArm7
		rightArmModel[30] = new ModelRendererTurbo(this, 158, 103, textureX, textureY); // RightArm8
		rightArmModel[31] = new ModelRendererTurbo(this, 178, 101, textureX, textureY); // RightArm9

		rightArmModel[0].addBox(-2F, -2F, 4F, 4, 4, 6, 0F); // RightArm1
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);
		rightArmModel[0].rotateAngleZ = -0.34906585F;

		rightArmModel[1].addShapeBox(-8F, 7F, -2.5F, 2, 8, 7, 0F,0F, 0F, -.2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F); // RightArm10
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);
		rightArmModel[1].rotateAngleZ = 0.34906585F;

		rightArmModel[2].addBox(-6F, 5F, -2.5F, 3, 10, 7, 0F); // RightArm11
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);
		rightArmModel[2].rotateAngleZ = 0.34906585F;

		rightArmModel[3].addShapeBox(-8F, 3F, -2.5F, 2, 4, 7, 0F,0F, -1F, -2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, -1F, -2F, -1F, 0F, -2F, 0F, 0F, -.5F, 0F, 0F, -.5F, -1F, 0F, -2F); // RightArm12
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);
		rightArmModel[3].rotateAngleZ = 0.34906585F;

		rightArmModel[4].addBox(-6F, 3F, 3.5F, 3, 2, 1, 0F); // RightArm13
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);
		rightArmModel[4].rotateAngleZ = 0.34906585F;

		rightArmModel[5].addBox(-6F, 3F, -2.5F, 3, 2, 1, 0F); // RightArm14
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);
		rightArmModel[5].rotateAngleZ = 0.34906585F;

		rightArmModel[6].addShapeBox(-2F, 5F, -1F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, -1.5F, 0F, -2F, -.5F); // RightArm15
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);
		rightArmModel[6].rotateAngleZ = -0.34906585F;

		rightArmModel[7].addShapeBox(0F, 5F, -1F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // RightArm16
		rightArmModel[7].setRotationPoint(0F, 0F, 0F);
		rightArmModel[7].rotateAngleZ = -0.34906585F;

		rightArmModel[8].addShapeBox(-8F, 15F, -2.5F, 2, 2, 7, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F); // RightArm17
		rightArmModel[8].setRotationPoint(0F, 0F, 0F);
		rightArmModel[8].rotateAngleZ = 0.34906585F;

		rightArmModel[9].addShapeBox(-6F, 15F, -2.5F, 3, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // RightArm18
		rightArmModel[9].setRotationPoint(0F, 0F, 0F);
		rightArmModel[9].rotateAngleZ = 0.34906585F;

		rightArmModel[10].addShapeBox(-3F, 15F, -2.5F, 2, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, -2F); // RightArm19
		rightArmModel[10].setRotationPoint(0F, 0F, 0F);
		rightArmModel[10].rotateAngleZ = 0.34906585F;

		rightArmModel[11].addShapeBox(-2F, -2F, 2F, 4, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // RightArm2
		rightArmModel[11].setRotationPoint(0F, 0F, 0F);
		rightArmModel[11].rotateAngleZ = -0.34906585F;

		rightArmModel[12].addBox(1F, 17F, 0F, 2, 1, 2, 0F); // RightArm20
		rightArmModel[12].setRotationPoint(0F, 0F, 0F);

		rightArmModel[13].addShapeBox(0F, 18F, -0.5F, 4, 1, 3, 0F,-.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm21
		rightArmModel[13].setRotationPoint(0F, 0F, 0F);

		rightArmModel[14].addShapeBox(2F, 19F, 0.5F, 2, 1, 2, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm22
		rightArmModel[14].setRotationPoint(0F, 0F, 0F);

		rightArmModel[15].addBox(3F, 20F, 1.5F, 1, 1, 1, 0F); // RightArm23
		rightArmModel[15].setRotationPoint(0F, 0F, 0F);

		rightArmModel[16].addShapeBox(2F, 21F, 1.5F, 2, 1, 1, 0F,-.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, -.5F, 0F); // RightArm24
		rightArmModel[16].setRotationPoint(0F, 0F, 0F);

		rightArmModel[17].addShapeBox(0F, 19F, -0.5F, 4, 2, 1, 0F,.1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F); // RightArm25
		rightArmModel[17].setRotationPoint(0F, 0F, 0F);

		rightArmModel[18].addShapeBox(3F, 22.2F, -0.5F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, -.5F, 0F); // RightArm26
		rightArmModel[18].setRotationPoint(0F, 0F, 0F);

		rightArmModel[19].addBox(3F, 20.2F, -0.5F, 1, 2, 1, 0F); // RightArm27
		rightArmModel[19].setRotationPoint(0F, 0F, 0F);

		rightArmModel[20].addShapeBox(2F, 22.5F, -0.5F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, -.5F, 0F); // RightArm28
		rightArmModel[20].setRotationPoint(0F, 0F, 0F);

		rightArmModel[21].addBox(2F, 20.5F, -0.5F, 1, 2, 1, 0F); // RightArm29
		rightArmModel[21].setRotationPoint(0F, 0F, 0F);

		rightArmModel[22].addShapeBox(-2.5F, -2.5F, 2F, 5, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm3
		rightArmModel[22].setRotationPoint(0F, 0F, 0F);
		rightArmModel[22].rotateAngleZ = -0.34906585F;

		rightArmModel[23].addShapeBox(1F, 22.1F, -0.5F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, -.5F, 0F); // RightArm30
		rightArmModel[23].setRotationPoint(0F, 0F, 0F);

		rightArmModel[24].addBox(1F, 20.1F, -0.5F, 1, 2, 1, 0F); // RightArm31
		rightArmModel[24].setRotationPoint(0F, 0F, 0F);

		rightArmModel[25].addShapeBox(0F, 21.5F, -0.5F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, -.5F, 0F); // RightArm32
		rightArmModel[25].setRotationPoint(0F, 0F, 0F);

		rightArmModel[26].addShapeBox(-2.5F, -2.5F, 1F, 5, 4, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm4
		rightArmModel[26].setRotationPoint(0F, 0F, 0F);
		rightArmModel[26].rotateAngleZ = -0.34906585F;

		rightArmModel[27].addBox(0F, 19.5F, -0.5F, 1, 2, 1, 0F); // RightArm5
		rightArmModel[27].setRotationPoint(0F, 0F, 0F);

		rightArmModel[28].addShapeBox(-3F, 3F, -2.5F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm6
		rightArmModel[28].setRotationPoint(0F, 0F, 0F);
		rightArmModel[28].rotateAngleZ = 0.34906585F;

		rightArmModel[29].addShapeBox(-3F, 3F, 2.5F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // RightArm7
		rightArmModel[29].setRotationPoint(0F, 0F, 0F);
		rightArmModel[29].rotateAngleZ = 0.34906585F;

		rightArmModel[30].addShapeBox(-3F, 7F, -2.5F, 2, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // RightArm8
		rightArmModel[30].setRotationPoint(0F, 0F, 0F);
		rightArmModel[30].rotateAngleZ = 0.34906585F;

		rightArmModel[31].addShapeBox(-1F, 7F, -0.5F, 1, 3, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // RightArm9
		rightArmModel[31].setRotationPoint(0F, 0F, 0F);
		rightArmModel[31].rotateAngleZ = 0.34906585F;
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 25, 161, textureX, textureY); // Box 193
		leftLegModel[1] = new ModelRendererTurbo(this, 95, 140, textureX, textureY); // LeftLeg1
		leftLegModel[2] = new ModelRendererTurbo(this, 149, 143, textureX, textureY); // LeftLeg11
		leftLegModel[3] = new ModelRendererTurbo(this, 149, 143, textureX, textureY); // LeftLeg12
		leftLegModel[4] = new ModelRendererTurbo(this, 149, 143, textureX, textureY); // LeftLeg13
		leftLegModel[5] = new ModelRendererTurbo(this, 95, 173, textureX, textureY); // LeftLeg16
		leftLegModel[6] = new ModelRendererTurbo(this, 35, 163, textureX, textureY); // LeftLeg17
		leftLegModel[7] = new ModelRendererTurbo(this, 7, 167, textureX, textureY); // LeftLeg18
		leftLegModel[8] = new ModelRendererTurbo(this, 64, 161, textureX, textureY); // LeftLeg19
		leftLegModel[9] = new ModelRendererTurbo(this, 70, 140, textureX, textureY); // LeftLeg2
		leftLegModel[10] = new ModelRendererTurbo(this, 125, 141, textureX, textureY); // LeftLeg20
		leftLegModel[11] = new ModelRendererTurbo(this, 125, 141, textureX, textureY); // LeftLeg21
		leftLegModel[12] = new ModelRendererTurbo(this, 89, 157, textureX, textureY); // LeftLeg22
		leftLegModel[13] = new ModelRendererTurbo(this, 89, 157, textureX, textureY); // LeftLeg23
		leftLegModel[14] = new ModelRendererTurbo(this, 113, 157, textureX, textureY); // LeftLeg24
		leftLegModel[15] = new ModelRendererTurbo(this, 113, 157, textureX, textureY); // LeftLeg25
		leftLegModel[16] = new ModelRendererTurbo(this, 89, 157, textureX, textureY); // LeftLeg26
		leftLegModel[17] = new ModelRendererTurbo(this, 113, 157, textureX, textureY); // LeftLeg27
		leftLegModel[18] = new ModelRendererTurbo(this, 127, 133, textureX, textureY); // LeftLeg3
		leftLegModel[19] = new ModelRendererTurbo(this, 127, 133, textureX, textureY); // LeftLeg4
		leftLegModel[20] = new ModelRendererTurbo(this, 127, 133, textureX, textureY); // LeftLeg5
		leftLegModel[21] = new ModelRendererTurbo(this, 127, 133, textureX, textureY); // LeftLeg6

		leftLegModel[0].addShapeBox(-10.5F, 13F, 4.5F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // Box 193
		leftLegModel[0].setRotationPoint(0F, -25F, 6F);
		leftLegModel[0].rotateAngleZ = 0.34906585F;

		leftLegModel[1].addShapeBox(-4F, 0F, -2F, 7, 7, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // LeftLeg1
		leftLegModel[1].setRotationPoint(0F, -25F, 6F);
		leftLegModel[1].rotateAngleZ = 0.61086524F;

		leftLegModel[2].addShapeBox(-3F, 21.5F, -2F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg11
		leftLegModel[2].setRotationPoint(0F, -25F, 6F);

		leftLegModel[3].addShapeBox(-3F, 20.5F, -2F, 3, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg12
		leftLegModel[3].setRotationPoint(0F, -25F, 6F);

		leftLegModel[4].addShapeBox(-3F, 22.5F, -2F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // LeftLeg13
		leftLegModel[4].setRotationPoint(0F, -25F, 6F);

		leftLegModel[5].addShapeBox(-3F, 18F, 0F, 3, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg16
		leftLegModel[5].setRotationPoint(0F, -25F, 6F);

		leftLegModel[6].addShapeBox(8F, 6F, -2.5F, 4, 13, 8, 0F,0F, 0F, 0F, 0F, -2F, -1.5F, 0F, -2F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1.5F, 0F, -2F, -1.5F, 0F, 0F, 0F); // LeftLeg17
		leftLegModel[6].setRotationPoint(0F, -25F, 6F);
		leftLegModel[6].rotateAngleZ = -0.52359878F;

		leftLegModel[7].addShapeBox(4F, 6F, -1.5F, 4, 13, 6, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // LeftLeg18
		leftLegModel[7].setRotationPoint(0F, -25F, 6F);
		leftLegModel[7].rotateAngleZ = -0.52359878F;

		leftLegModel[8].addShapeBox(9F, 7F, -0.5F, 4, 11, 6, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F); // LeftLeg19
		leftLegModel[8].setRotationPoint(0F, -25F, 6F);
		leftLegModel[8].rotateAngleZ = -0.52359878F;

		leftLegModel[9].addShapeBox(-3F, -1F, -3F, 5, 9, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, 3F); // LeftLeg2
		leftLegModel[9].setRotationPoint(0F, -25F, 6F);
		leftLegModel[9].rotateAngleZ = 0.61086524F;

		leftLegModel[10].addShapeBox(5F, 4F, -0.5F, 5, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg20
		leftLegModel[10].setRotationPoint(0F, -25F, 6F);
		leftLegModel[10].rotateAngleZ = -0.52359878F;

		leftLegModel[11].addShapeBox(5F, 3F, -0.5F, 5, 1, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg21
		leftLegModel[11].setRotationPoint(0F, -25F, 6F);
		leftLegModel[11].rotateAngleZ = -0.52359878F;

		leftLegModel[12].addShapeBox(8F, 4.5F, -1.5F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg22
		leftLegModel[12].setRotationPoint(0F, -25F, 6F);
		leftLegModel[12].rotateAngleZ = -0.34906585F;

		leftLegModel[13].addShapeBox(8F, 2.5F, -1.5F, 2, 2, 6, 0F,0F, -1F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg23
		leftLegModel[13].setRotationPoint(0F, -25F, 6F);
		leftLegModel[13].rotateAngleZ = -0.34906585F;

		leftLegModel[14].addShapeBox(10F, 2.5F, -1.5F, 2, 2, 6, 0F,0F, 0F, -.5F, -1F, .5F, -1.5F, -1F, .5F, -1.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // LeftLeg24
		leftLegModel[14].setRotationPoint(0F, -25F, 6F);
		leftLegModel[14].rotateAngleZ = -0.34906585F;

		leftLegModel[15].addShapeBox(10F, 4.5F, -1.5F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // LeftLeg25
		leftLegModel[15].setRotationPoint(0F, -25F, 6F);
		leftLegModel[15].rotateAngleZ = -0.34906585F;

		leftLegModel[16].addShapeBox(8F, 6.5F, -1.5F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -1F, -.5F); // LeftLeg26
		leftLegModel[16].setRotationPoint(0F, -25F, 6F);
		leftLegModel[16].rotateAngleZ = -0.34906585F;

		leftLegModel[17].addShapeBox(10F, 6.5F, -1.5F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -.5F, -1F, .5F, -1.5F, -1F, .5F, -1.5F, 0F, 0F, -.5F); // LeftLeg27
		leftLegModel[17].setRotationPoint(0F, -25F, 6F);
		leftLegModel[17].rotateAngleZ = -0.34906585F;

		leftLegModel[18].addShapeBox(-3F, 8F, 3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg3
		leftLegModel[18].setRotationPoint(0F, -25F, 6F);
		leftLegModel[18].rotateAngleZ = 0.61086524F;

		leftLegModel[19].addShapeBox(-3F, 10F, 3F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // LeftLeg4
		leftLegModel[19].setRotationPoint(0F, -25F, 6F);
		leftLegModel[19].rotateAngleZ = 0.61086524F;

		leftLegModel[20].addShapeBox(-3F, 8F, -1F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg5
		leftLegModel[20].setRotationPoint(0F, -25F, 6F);
		leftLegModel[20].rotateAngleZ = 0.61086524F;

		leftLegModel[21].addShapeBox(-3F, 10F, -1F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // LeftLeg6
		leftLegModel[21].setRotationPoint(0F, -25F, 6F);
		leftLegModel[21].rotateAngleZ = 0.61086524F;
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 125, 141, textureX, textureY); // RightLeg1
		rightLegModel[1] = new ModelRendererTurbo(this, 7, 167, textureX, textureY); // RightLeg10
		rightLegModel[2] = new ModelRendererTurbo(this, 64, 161, textureX, textureY); // RightLeg11
		rightLegModel[3] = new ModelRendererTurbo(this, 95, 173, textureX, textureY); // RightLeg12
		rightLegModel[4] = new ModelRendererTurbo(this, 149, 143, textureX, textureY); // RightLeg16
		rightLegModel[5] = new ModelRendererTurbo(this, 149, 143, textureX, textureY); // RightLeg17
		rightLegModel[6] = new ModelRendererTurbo(this, 149, 143, textureX, textureY); // RightLeg18
		rightLegModel[7] = new ModelRendererTurbo(this, 125, 141, textureX, textureY); // RightLeg2
		rightLegModel[8] = new ModelRendererTurbo(this, 113, 157, textureX, textureY); // RightLeg22
		rightLegModel[9] = new ModelRendererTurbo(this, 113, 157, textureX, textureY); // RightLeg23
		rightLegModel[10] = new ModelRendererTurbo(this, 113, 157, textureX, textureY); // RightLeg24
		rightLegModel[11] = new ModelRendererTurbo(this, 89, 157, textureX, textureY); // RightLeg25
		rightLegModel[12] = new ModelRendererTurbo(this, 89, 157, textureX, textureY); // RightLeg26
		rightLegModel[13] = new ModelRendererTurbo(this, 89, 157, textureX, textureY); // RightLeg27
		rightLegModel[14] = new ModelRendererTurbo(this, 127, 133, textureX, textureY); // RightLeg3
		rightLegModel[15] = new ModelRendererTurbo(this, 127, 133, textureX, textureY); // RightLeg4
		rightLegModel[16] = new ModelRendererTurbo(this, 127, 133, textureX, textureY); // RightLeg5
		rightLegModel[17] = new ModelRendererTurbo(this, 127, 133, textureX, textureY); // RightLeg6
		rightLegModel[18] = new ModelRendererTurbo(this, 70, 140, textureX, textureY); // RightLeg7
		rightLegModel[19] = new ModelRendererTurbo(this, 95, 140, textureX, textureY); // RightLeg8
		rightLegModel[20] = new ModelRendererTurbo(this, 35, 163, textureX, textureY); // LegLeft28
		rightLegModel[21] = new ModelRendererTurbo(this, 25, 161, textureX, textureY); // RightLeg28

		rightLegModel[0].addShapeBox(5F, 3F, -3.5F, 5, 1, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg1
		rightLegModel[0].setRotationPoint(0F, -25F, -6F);
		rightLegModel[0].rotateAngleZ = -0.52359878F;

		rightLegModel[1].addShapeBox(4F, 6F, -4.5F, 4, 13, 6, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // RightLeg10
		rightLegModel[1].setRotationPoint(0F, -25F, -6F);
		rightLegModel[1].rotateAngleZ = -0.52359878F;

		rightLegModel[2].addShapeBox(9F, 7F, -5.5F, 4, 11, 6, 0F,0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F); // RightLeg11
		rightLegModel[2].setRotationPoint(0F, -25F, -6F);
		rightLegModel[2].rotateAngleZ = -0.52359878F;

		rightLegModel[3].addShapeBox(-3F, 18F, -3F, 3, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg12
		rightLegModel[3].setRotationPoint(0F, -25F, -6F);

		rightLegModel[4].addShapeBox(-3F, 20.5F, -5F, 3, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg16
		rightLegModel[4].setRotationPoint(0F, -25F, -6F);

		rightLegModel[5].addShapeBox(-3F, 21.5F, -5F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg17
		rightLegModel[5].setRotationPoint(0F, -25F, -6F);

		rightLegModel[6].addShapeBox(-3F, 22.5F, -5F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // RightLeg18
		rightLegModel[6].setRotationPoint(0F, -25F, -6F);

		rightLegModel[7].addShapeBox(5F, 4F, -3.5F, 5, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg2
		rightLegModel[7].setRotationPoint(0F, -25F, -6F);
		rightLegModel[7].rotateAngleZ = -0.52359878F;

		rightLegModel[8].addShapeBox(10F, 6.5F, -4.5F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -.5F, -1F, .5F, -1.5F, -1F, .5F, -1.5F, 0F, 0F, -.5F); // RightLeg22
		rightLegModel[8].setRotationPoint(0F, -25F, -6F);
		rightLegModel[8].rotateAngleZ = -0.34906585F;

		rightLegModel[9].addShapeBox(10F, 4.5F, -4.5F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // RightLeg23
		rightLegModel[9].setRotationPoint(0F, -25F, -6F);
		rightLegModel[9].rotateAngleZ = -0.34906585F;

		rightLegModel[10].addShapeBox(10F, 2.5F, -4.5F, 2, 2, 6, 0F,0F, 0F, -.5F, -1F, .5F, -1.5F, -1F, .5F, -1.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // RightLeg24
		rightLegModel[10].setRotationPoint(0F, -25F, -6F);
		rightLegModel[10].rotateAngleZ = -0.34906585F;

		rightLegModel[11].addShapeBox(8F, 2.5F, -4.5F, 2, 2, 6, 0F,0F, -1F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg25
		rightLegModel[11].setRotationPoint(0F, -25F, -6F);
		rightLegModel[11].rotateAngleZ = -0.34906585F;

		rightLegModel[12].addShapeBox(8F, 4.5F, -4.5F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg26
		rightLegModel[12].setRotationPoint(0F, -25F, -6F);
		rightLegModel[12].rotateAngleZ = -0.34906585F;

		rightLegModel[13].addShapeBox(8F, 6.5F, -4.5F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -1F, -.5F); // RightLeg27
		rightLegModel[13].setRotationPoint(0F, -25F, -6F);
		rightLegModel[13].rotateAngleZ = -0.34906585F;

		rightLegModel[14].addShapeBox(-3F, 10F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // RightLeg3
		rightLegModel[14].setRotationPoint(0F, -25F, -6F);
		rightLegModel[14].rotateAngleZ = 0.61086524F;

		rightLegModel[15].addShapeBox(-3F, 8F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg4
		rightLegModel[15].setRotationPoint(0F, -25F, -6F);
		rightLegModel[15].rotateAngleZ = 0.61086524F;

		rightLegModel[16].addShapeBox(-3F, 10F, -4F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // RightLeg5
		rightLegModel[16].setRotationPoint(0F, -25F, -6F);
		rightLegModel[16].rotateAngleZ = 0.61086524F;

		rightLegModel[17].addShapeBox(-3F, 8F, -4F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg6
		rightLegModel[17].setRotationPoint(0F, -25F, -6F);
		rightLegModel[17].rotateAngleZ = 0.61086524F;

		rightLegModel[18].addShapeBox(-3F, -1F, -1F, 5, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, -2F); // RightLeg7
		rightLegModel[18].setRotationPoint(0F, -25F, -6F);
		rightLegModel[18].rotateAngleZ = 0.61086524F;

		rightLegModel[19].addShapeBox(-4F, 0F, -2F, 7, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // RightLeg8
		rightLegModel[19].setRotationPoint(0F, -25F, -6F);
		rightLegModel[19].rotateAngleZ = 0.61086524F;

		rightLegModel[20].addShapeBox(8F, 6F, -5.5F, 4, 13, 8, 0F,0F, 0F, 0F, 0F, -2F, -1.5F, 0F, -2F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1.5F, 0F, -2F, -1.5F, 0F, 0F, 0F); // LegLeft28
		rightLegModel[20].setRotationPoint(0F, -25F, -6F);
		rightLegModel[20].rotateAngleZ = -0.52359878F;

		rightLegModel[21].addShapeBox(-10.5F, 13F, -5.5F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // RightLeg28
		rightLegModel[21].setRotationPoint(0F, -25F, -6F);
		rightLegModel[21].rotateAngleZ = 0.34906585F;
	}

	private void initleftFootModel_1()
	{
		leftFootModel[0] = new ModelRendererTurbo(this, 161, 161, textureX, textureY); // LeftLeg10
		leftFootModel[1] = new ModelRendererTurbo(this, 179, 161, textureX, textureY); // LeftLeg14
		leftFootModel[2] = new ModelRendererTurbo(this, 115, 173, textureX, textureY); // LeftLeg15
		leftFootModel[3] = new ModelRendererTurbo(this, 134, 157, textureX, textureY); // LeftLeg7
		leftFootModel[4] = new ModelRendererTurbo(this, 179, 141, textureX, textureY); // LeftLeg8
		leftFootModel[5] = new ModelRendererTurbo(this, 161, 161, textureX, textureY); // LeftLeg9

		leftFootModel[0].addShapeBox(5F, 24F, 2F, 3, 1, 4, 0F,-3F, -.5F, -1.5F, .6F, -.5F, -1.8F, -.5F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, -1F, 1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg10
		leftFootModel[0].setRotationPoint(0F, -25F, 0F);

		leftFootModel[1].addShapeBox(-8F, 22F, -1.5F, 4, 3, 6, 0F,-.5F, -1F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, -.5F, -1F, -1.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F); // LeftLeg14
		leftFootModel[1].setRotationPoint(0F, -25F, 6F);

		leftFootModel[2].addShapeBox(-7F, 21F, 0.5F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg15
		leftFootModel[2].setRotationPoint(0F, -25F, 6F);

		leftFootModel[3].addShapeBox(-4F, 21.5F, -0.5F, 5, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg7
		leftFootModel[3].setRotationPoint(0F, -25F, 6F);

		leftFootModel[4].addShapeBox(1F, 21F, -2F, 8, 4, 7, 0F,0F, 0F, -1F, .5F, -2.5F, -2.5F, .5F, -2.5F, -2.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2.F, 0F, 0F, 0F); // LeftLeg8
		leftFootModel[4].setRotationPoint(0F, -25F, 6F);

		leftFootModel[5].addShapeBox(5F, 24F, 3F, 3, 1, 4, 0F,-1F, 0F, 0F, -.5F, 0F, 0F, .6F, -.5F, -1.8F, -3F, -.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1.5F, -3F, 0F, -1F); // LeftLeg9
		leftFootModel[5].setRotationPoint(0F, -25F, 6F);
	}

	private void initrightFootModel_1()
	{
		rightFootModel[0] = new ModelRendererTurbo(this, 134, 157, textureX, textureY); // RightLeg13
		rightFootModel[1] = new ModelRendererTurbo(this, 115, 173, textureX, textureY); // RightLeg14
		rightFootModel[2] = new ModelRendererTurbo(this, 179, 161, textureX, textureY); // RightLeg15
		rightFootModel[3] = new ModelRendererTurbo(this, 179, 141, textureX, textureY); // RightLeg19
		rightFootModel[4] = new ModelRendererTurbo(this, 161, 161, textureX, textureY); // RightLeg20
		rightFootModel[5] = new ModelRendererTurbo(this, 161, 161, textureX, textureY); // RightLeg21

		rightFootModel[0].addShapeBox(-4F, 21.5F, -3.5F, 5, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg13
		rightFootModel[0].setRotationPoint(0F, -25F, -6F);

		rightFootModel[1].addShapeBox(-7F, 21F, -2.5F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg14
		rightFootModel[1].setRotationPoint(0F, -25F, -6F);

		rightFootModel[2].addShapeBox(-8F, 22F, -4.5F, 4, 3, 6, 0F,-.5F, -1F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, -.5F, -1F, -1.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F); // RightLeg15
		rightFootModel[2].setRotationPoint(0F, -25F, -6F);

		rightFootModel[3].addShapeBox(1F, 21F, -5F, 8, 4, 7, 0F,0F, 0F, -1F, .5F, -2.5F, -2.5F, .5F, -2.5F, -2.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2.F, 0F, 0F, -2F, 0F, 0F, 0F); // RightLeg19
		rightFootModel[3].setRotationPoint(0F, -25F, -6F);

		rightFootModel[4].addShapeBox(5F, 24F, -7F, 3, 1, 4, 0F,-3F, -.5F, -1.5F, .6F, -.5F, -1.8F, -.5F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, -1F, 1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg20
		rightFootModel[4].setRotationPoint(0F, -25F, -6F);

		rightFootModel[5].addShapeBox(5F, 24F, 0F, 3, 1, 4, 0F,-1F, 0F, 0F, -.5F, 0F, 0F, .6F, -.5F, -1.8F, -3F, -.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1.5F, -3F, 0F, -1F); // RightLeg21
		rightFootModel[5].setRotationPoint(0F, -25F, -6F);
	}
}