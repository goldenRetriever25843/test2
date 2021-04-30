//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelChaika extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelChaika() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[189];
		bodyModel[0] = new ModelRendererTurbo(this, 17, 353, textureX, textureY); // Core1
		bodyModel[1] = new ModelRendererTurbo(this, 207, 176, textureX, textureY); // Core10
		bodyModel[2] = new ModelRendererTurbo(this, 319, 4, textureX, textureY); // Core100
		bodyModel[3] = new ModelRendererTurbo(this, 201, 245, textureX, textureY); // Core101
		bodyModel[4] = new ModelRendererTurbo(this, 6, 376, textureX, textureY); // Core102
		bodyModel[5] = new ModelRendererTurbo(this, 379, 4, textureX, textureY); // Core103
		bodyModel[6] = new ModelRendererTurbo(this, 342, 209, textureX, textureY); // Core104
		bodyModel[7] = new ModelRendererTurbo(this, 478, 5, textureX, textureY); // Core105
		bodyModel[8] = new ModelRendererTurbo(this, 268, 270, textureX, textureY); // Core106
		bodyModel[9] = new ModelRendererTurbo(this, 301, 25, textureX, textureY); // Core107
		bodyModel[10] = new ModelRendererTurbo(this, 395, 219, textureX, textureY); // Core108
		bodyModel[11] = new ModelRendererTurbo(this, 197, 5, textureX, textureY); // Core109
		bodyModel[12] = new ModelRendererTurbo(this, 6, 376, textureX, textureY); // Core11
		bodyModel[13] = new ModelRendererTurbo(this, 301, 25, textureX, textureY); // Core110
		bodyModel[14] = new ModelRendererTurbo(this, 301, 25, textureX, textureY); // Core111
		bodyModel[15] = new ModelRendererTurbo(this, 197, 5, textureX, textureY); // Core112
		bodyModel[16] = new ModelRendererTurbo(this, 301, 25, textureX, textureY); // Core113
		bodyModel[17] = new ModelRendererTurbo(this, 197, 5, textureX, textureY); // Core114
		bodyModel[18] = new ModelRendererTurbo(this, 455, 29, textureX, textureY); // Core115
		bodyModel[19] = new ModelRendererTurbo(this, 197, 5, textureX, textureY); // Core116
		bodyModel[20] = new ModelRendererTurbo(this, 197, 5, textureX, textureY); // Core117
		bodyModel[21] = new ModelRendererTurbo(this, 438, 45, textureX, textureY); // Core118
		bodyModel[22] = new ModelRendererTurbo(this, 455, 42, textureX, textureY); // Core119
		bodyModel[23] = new ModelRendererTurbo(this, 278, 148, textureX, textureY); // Core12
		bodyModel[24] = new ModelRendererTurbo(this, 197, 5, textureX, textureY); // Core120
		bodyModel[25] = new ModelRendererTurbo(this, 203, 295, textureX, textureY); // Core121
		bodyModel[26] = new ModelRendererTurbo(this, 109, 375, textureX, textureY); // Core122
		bodyModel[27] = new ModelRendererTurbo(this, 197, 5, textureX, textureY); // Core123
		bodyModel[28] = new ModelRendererTurbo(this, 438, 52, textureX, textureY); // Core124
		bodyModel[29] = new ModelRendererTurbo(this, 438, 45, textureX, textureY); // Core125
		bodyModel[30] = new ModelRendererTurbo(this, 203, 55, textureX, textureY); // Core126
		bodyModel[31] = new ModelRendererTurbo(this, 214, 55, textureX, textureY); // Core127
		bodyModel[32] = new ModelRendererTurbo(this, 203, 55, textureX, textureY); // Core128
		bodyModel[33] = new ModelRendererTurbo(this, 214, 55, textureX, textureY); // Core129
		bodyModel[34] = new ModelRendererTurbo(this, 109, 375, textureX, textureY); // Core13
		bodyModel[35] = new ModelRendererTurbo(this, 214, 55, textureX, textureY); // Core130
		bodyModel[36] = new ModelRendererTurbo(this, 203, 55, textureX, textureY); // Core131
		bodyModel[37] = new ModelRendererTurbo(this, 203, 55, textureX, textureY); // Core132
		bodyModel[38] = new ModelRendererTurbo(this, 214, 55, textureX, textureY); // Core133
		bodyModel[39] = new ModelRendererTurbo(this, 205, 318, textureX, textureY); // Core134
		bodyModel[40] = new ModelRendererTurbo(this, 214, 55, textureX, textureY); // Core135
		bodyModel[41] = new ModelRendererTurbo(this, 203, 55, textureX, textureY); // Core136
		bodyModel[42] = new ModelRendererTurbo(this, 203, 55, textureX, textureY); // Core137
		bodyModel[43] = new ModelRendererTurbo(this, 214, 55, textureX, textureY); // Core138
		bodyModel[44] = new ModelRendererTurbo(this, 6, 401, textureX, textureY); // Core139
		bodyModel[45] = new ModelRendererTurbo(this, 199, 148, textureX, textureY); // Core14
		bodyModel[46] = new ModelRendererTurbo(this, 342, 209, textureX, textureY); // Core140
		bodyModel[47] = new ModelRendererTurbo(this, 329, 127, textureX, textureY); // Core141
		bodyModel[48] = new ModelRendererTurbo(this, 329, 127, textureX, textureY); // Core142
		bodyModel[49] = new ModelRendererTurbo(this, 335, 128, textureX, textureY); // Core143
		bodyModel[50] = new ModelRendererTurbo(this, 310, 179, textureX, textureY); // Core144
		bodyModel[51] = new ModelRendererTurbo(this, 203, 270, textureX, textureY); // Core145
		bodyModel[52] = new ModelRendererTurbo(this, 191, 353, textureX, textureY); // Core146
		bodyModel[53] = new ModelRendererTurbo(this, 329, 127, textureX, textureY); // Core147
		bodyModel[54] = new ModelRendererTurbo(this, 310, 179, textureX, textureY); // Core149
		bodyModel[55] = new ModelRendererTurbo(this, 335, 233, textureX, textureY); // Core15
		bodyModel[56] = new ModelRendererTurbo(this, 310, 179, textureX, textureY); // Core150
		bodyModel[57] = new ModelRendererTurbo(this, 32, 91, textureX, textureY); // Core151
		bodyModel[58] = new ModelRendererTurbo(this, 53, 91, textureX, textureY); // Core152
		bodyModel[59] = new ModelRendererTurbo(this, 3, 84, textureX, textureY); // Core153
		bodyModel[60] = new ModelRendererTurbo(this, 14, 84, textureX, textureY); // Core154
		bodyModel[61] = new ModelRendererTurbo(this, 23, 84, textureX, textureY); // Core155
		bodyModel[62] = new ModelRendererTurbo(this, 62, 84, textureX, textureY); // Core156
		bodyModel[63] = new ModelRendererTurbo(this, 81, 84, textureX, textureY); // Core157
		bodyModel[64] = new ModelRendererTurbo(this, 47, 84, textureX, textureY); // Core158
		bodyModel[65] = new ModelRendererTurbo(this, 31, 84, textureX, textureY); // Core159
		bodyModel[66] = new ModelRendererTurbo(this, 395, 127, textureX, textureY); // Core16
		bodyModel[67] = new ModelRendererTurbo(this, 76, 82, textureX, textureY); // Core160
		bodyModel[68] = new ModelRendererTurbo(this, 36, 109, textureX, textureY); // Core161
		bodyModel[69] = new ModelRendererTurbo(this, 80, 109, textureX, textureY); // Core162
		bodyModel[70] = new ModelRendererTurbo(this, 5, 109, textureX, textureY); // Core163
		bodyModel[71] = new ModelRendererTurbo(this, 36, 109, textureX, textureY); // Core164
		bodyModel[72] = new ModelRendererTurbo(this, 3, 91, textureX, textureY); // Core165
		bodyModel[73] = new ModelRendererTurbo(this, 80, 95, textureX, textureY); // Core166
		bodyModel[74] = new ModelRendererTurbo(this, 80, 95, textureX, textureY); // Core167
		bodyModel[75] = new ModelRendererTurbo(this, 82, 102, textureX, textureY); // Core168
		bodyModel[76] = new ModelRendererTurbo(this, 68, 95, textureX, textureY); // Core169
		bodyModel[77] = new ModelRendererTurbo(this, 395, 150, textureX, textureY); // Core17
		bodyModel[78] = new ModelRendererTurbo(this, 68, 95, textureX, textureY); // Core170
		bodyModel[79] = new ModelRendererTurbo(this, 80, 95, textureX, textureY); // Core171
		bodyModel[80] = new ModelRendererTurbo(this, 80, 95, textureX, textureY); // Core172
		bodyModel[81] = new ModelRendererTurbo(this, 82, 102, textureX, textureY); // Core173
		bodyModel[82] = new ModelRendererTurbo(this, 7, 47, textureX, textureY); // Core174
		bodyModel[83] = new ModelRendererTurbo(this, 95, 71, textureX, textureY); // Core175
		bodyModel[84] = new ModelRendererTurbo(this, 95, 79, textureX, textureY); // Core176
		bodyModel[85] = new ModelRendererTurbo(this, 102, 79, textureX, textureY); // Core177
		bodyModel[86] = new ModelRendererTurbo(this, 111, 83, textureX, textureY); // Core178
		bodyModel[87] = new ModelRendererTurbo(this, 112, 72, textureX, textureY); // Core179
		bodyModel[88] = new ModelRendererTurbo(this, 336, 274, textureX, textureY); // Core18
		bodyModel[89] = new ModelRendererTurbo(this, 111, 78, textureX, textureY); // Core180
		bodyModel[90] = new ModelRendererTurbo(this, 118, 78, textureX, textureY); // Core181
		bodyModel[91] = new ModelRendererTurbo(this, 102, 87, textureX, textureY); // Core182
		bodyModel[92] = new ModelRendererTurbo(this, 109, 71, textureX, textureY); // Core183
		bodyModel[93] = new ModelRendererTurbo(this, 125, 73, textureX, textureY); // Core184
		bodyModel[94] = new ModelRendererTurbo(this, 35, 91, textureX, textureY); // Core185
		bodyModel[95] = new ModelRendererTurbo(this, 119, 33, textureX, textureY); // Core186
		bodyModel[96] = new ModelRendererTurbo(this, 336, 315, textureX, textureY); // Core19
		bodyModel[97] = new ModelRendererTurbo(this, 332, 155, textureX, textureY); // Core2
		bodyModel[98] = new ModelRendererTurbo(this, 395, 173, textureX, textureY); // Core20
		bodyModel[99] = new ModelRendererTurbo(this, 395, 196, textureX, textureY); // Core21
		bodyModel[100] = new ModelRendererTurbo(this, 336, 358, textureX, textureY); // Core22
		bodyModel[101] = new ModelRendererTurbo(this, 395, 219, textureX, textureY); // Core23
		bodyModel[102] = new ModelRendererTurbo(this, 472, 292, textureX, textureY); // Core24
		bodyModel[103] = new ModelRendererTurbo(this, 109, 93, textureX, textureY); // Core25
		bodyModel[104] = new ModelRendererTurbo(this, 89, 219, textureX, textureY); // Core26
		bodyModel[105] = new ModelRendererTurbo(this, 472, 239, textureX, textureY); // Core27
		bodyModel[106] = new ModelRendererTurbo(this, 199, 125, textureX, textureY); // Core28
		bodyModel[107] = new ModelRendererTurbo(this, 263, 13, textureX, textureY); // Core29
		bodyModel[108] = new ModelRendererTurbo(this, 263, 5, textureX, textureY); // Core3
		bodyModel[109] = new ModelRendererTurbo(this, 150, 93, textureX, textureY); // Core30
		bodyModel[110] = new ModelRendererTurbo(this, 89, 164, textureX, textureY); // Core31
		bodyModel[111] = new ModelRendererTurbo(this, 472, 258, textureX, textureY); // Core32
		bodyModel[112] = new ModelRendererTurbo(this, 191, 93, textureX, textureY); // Core33
		bodyModel[113] = new ModelRendererTurbo(this, 472, 275, textureX, textureY); // Core34
		bodyModel[114] = new ModelRendererTurbo(this, 89, 133, textureX, textureY); // Core35
		bodyModel[115] = new ModelRendererTurbo(this, 5, 36, textureX, textureY); // Core36
		bodyModel[116] = new ModelRendererTurbo(this, 13, 473, textureX, textureY); // Core37
		bodyModel[117] = new ModelRendererTurbo(this, 89, 265, textureX, textureY); // Core38
		bodyModel[118] = new ModelRendererTurbo(this, 47, 36, textureX, textureY); // Core39
		bodyModel[119] = new ModelRendererTurbo(this, 353, 155, textureX, textureY); // Core4
		bodyModel[120] = new ModelRendererTurbo(this, 431, 292, textureX, textureY); // Core40
		bodyModel[121] = new ModelRendererTurbo(this, 89, 309, textureX, textureY); // Core41
		bodyModel[122] = new ModelRendererTurbo(this, 431, 275, textureX, textureY); // Core42
		bodyModel[123] = new ModelRendererTurbo(this, 270, 125, textureX, textureY); // Core43
		bodyModel[124] = new ModelRendererTurbo(this, 431, 258, textureX, textureY); // Core44
		bodyModel[125] = new ModelRendererTurbo(this, 207, 199, textureX, textureY); // Core45
		bodyModel[126] = new ModelRendererTurbo(this, 431, 239, textureX, textureY); // Core46
		bodyModel[127] = new ModelRendererTurbo(this, 28, 71, textureX, textureY); // Core47
		bodyModel[128] = new ModelRendererTurbo(this, 3, 71, textureX, textureY); // Core48
		bodyModel[129] = new ModelRendererTurbo(this, 13, 473, textureX, textureY); // Core49
		bodyModel[130] = new ModelRendererTurbo(this, 266, 216, textureX, textureY); // Core5
		bodyModel[131] = new ModelRendererTurbo(this, 303, 456, textureX, textureY); // Core50
		bodyModel[132] = new ModelRendererTurbo(this, 53, 71, textureX, textureY); // Core51
		bodyModel[133] = new ModelRendererTurbo(this, 241, 5, textureX, textureY); // Core52
		bodyModel[134] = new ModelRendererTurbo(this, 80, 70, textureX, textureY); // Core53
		bodyModel[135] = new ModelRendererTurbo(this, 303, 456, textureX, textureY); // Core54
		bodyModel[136] = new ModelRendererTurbo(this, 239, 455, textureX, textureY); // Core55
		bodyModel[137] = new ModelRendererTurbo(this, 80, 70, textureX, textureY); // Core56
		bodyModel[138] = new ModelRendererTurbo(this, 11, 134, textureX, textureY); // Core57
		bodyModel[139] = new ModelRendererTurbo(this, 239, 455, textureX, textureY); // Core58
		bodyModel[140] = new ModelRendererTurbo(this, 11, 165, textureX, textureY); // Core59
		bodyModel[141] = new ModelRendererTurbo(this, 6, 401, textureX, textureY); // Core6
		bodyModel[142] = new ModelRendererTurbo(this, 239, 455, textureX, textureY); // Core60
		bodyModel[143] = new ModelRendererTurbo(this, 239, 455, textureX, textureY); // Core61
		bodyModel[144] = new ModelRendererTurbo(this, 11, 210, textureX, textureY); // Core62
		bodyModel[145] = new ModelRendererTurbo(this, 11, 258, textureX, textureY); // Core63
		bodyModel[146] = new ModelRendererTurbo(this, 239, 455, textureX, textureY); // Core64
		bodyModel[147] = new ModelRendererTurbo(this, 395, 127, textureX, textureY); // Core65
		bodyModel[148] = new ModelRendererTurbo(this, 11, 305, textureX, textureY); // Core66
		bodyModel[149] = new ModelRendererTurbo(this, 239, 455, textureX, textureY); // Core67
		bodyModel[150] = new ModelRendererTurbo(this, 395, 150, textureX, textureY); // Core68
		bodyModel[151] = new ModelRendererTurbo(this, 310, 179, textureX, textureY); // Core7
		bodyModel[152] = new ModelRendererTurbo(this, 197, 5, textureX, textureY); // Core70
		bodyModel[153] = new ModelRendererTurbo(this, 395, 173, textureX, textureY); // Core71
		bodyModel[154] = new ModelRendererTurbo(this, 260, 176, textureX, textureY); // Core72
		bodyModel[155] = new ModelRendererTurbo(this, 197, 5, textureX, textureY); // Core73
		bodyModel[156] = new ModelRendererTurbo(this, 108, 353, textureX, textureY); // Core74
		bodyModel[157] = new ModelRendererTurbo(this, 197, 5, textureX, textureY); // Core75
		bodyModel[158] = new ModelRendererTurbo(this, 278, 148, textureX, textureY); // Core76
		bodyModel[159] = new ModelRendererTurbo(this, 199, 148, textureX, textureY); // Core77
		bodyModel[160] = new ModelRendererTurbo(this, 197, 5, textureX, textureY); // Core78
		bodyModel[161] = new ModelRendererTurbo(this, 199, 125, textureX, textureY); // Core79
		bodyModel[162] = new ModelRendererTurbo(this, 310, 179, textureX, textureY); // Core8
		bodyModel[163] = new ModelRendererTurbo(this, 197, 5, textureX, textureY); // Core80
		bodyModel[164] = new ModelRendererTurbo(this, 270, 125, textureX, textureY); // Core81
		bodyModel[165] = new ModelRendererTurbo(this, 269, 29, textureX, textureY); // Core82
		bodyModel[166] = new ModelRendererTurbo(this, 197, 5, textureX, textureY); // Core83
		bodyModel[167] = new ModelRendererTurbo(this, 254, 199, textureX, textureY); // Core84
		bodyModel[168] = new ModelRendererTurbo(this, 197, 5, textureX, textureY); // Core85
		bodyModel[169] = new ModelRendererTurbo(this, 269, 23, textureX, textureY); // Core86
		bodyModel[170] = new ModelRendererTurbo(this, 268, 245, textureX, textureY); // Core87
		bodyModel[171] = new ModelRendererTurbo(this, 269, 23, textureX, textureY); // Core88
		bodyModel[172] = new ModelRendererTurbo(this, 269, 29, textureX, textureY); // Core89
		bodyModel[173] = new ModelRendererTurbo(this, 310, 179, textureX, textureY); // Core9
		bodyModel[174] = new ModelRendererTurbo(this, 201, 216, textureX, textureY); // Core90
		bodyModel[175] = new ModelRendererTurbo(this, 197, 5, textureX, textureY); // Core91
		bodyModel[176] = new ModelRendererTurbo(this, 365, 4, textureX, textureY); // Core92
		bodyModel[177] = new ModelRendererTurbo(this, 197, 5, textureX, textureY); // Core93
		bodyModel[178] = new ModelRendererTurbo(this, 395, 196, textureX, textureY); // Core94
		bodyModel[179] = new ModelRendererTurbo(this, 258, 295, textureX, textureY); // Core95
		bodyModel[180] = new ModelRendererTurbo(this, 197, 5, textureX, textureY); // Core96
		bodyModel[181] = new ModelRendererTurbo(this, 342, 4, textureX, textureY); // Core97
		bodyModel[182] = new ModelRendererTurbo(this, 197, 5, textureX, textureY); // Core98
		bodyModel[183] = new ModelRendererTurbo(this, 240, 318, textureX, textureY); // Core99
		bodyModel[184] = new ModelRendererTurbo(this, 379, 57, textureX, textureY); // Decal1
		bodyModel[185] = new ModelRendererTurbo(this, 269, 23, textureX, textureY); // Core192
		bodyModel[186] = new ModelRendererTurbo(this, 269, 29, textureX, textureY); // Core193
		bodyModel[187] = new ModelRendererTurbo(this, 269, 23, textureX, textureY); // Core190
		bodyModel[188] = new ModelRendererTurbo(this, 269, 29, textureX, textureY); // Core191

		bodyModel[0].addShapeBox(-46F, -31F, -4F, 30, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Core1
		bodyModel[0].setRotationPoint(0F, -19F, 0F);

		bodyModel[1].addShapeBox(-6F, -20F, 9F, 14, 12, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Core10
		bodyModel[1].setRotationPoint(0F, -19F, 0F);

		bodyModel[2].addShapeBox(41F, -35F, -1F, 6, 8, 2, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core100
		bodyModel[2].setRotationPoint(0F, -19F, 0F);

		bodyModel[3].addShapeBox(8F, -29F, 4F, 20, 9, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -4F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Core101
		bodyModel[3].setRotationPoint(0F, -19F, 0F);

		bodyModel[4].addShapeBox(-46F, -38F, -31F, 30, 3, 18, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core102
		bodyModel[4].setRotationPoint(0F, -19F, 0F);

		bodyModel[5].addShapeBox(56F, -52F, -1F, 3, 40, 2, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core103
		bodyModel[5].setRotationPoint(0F, -19F, 0F);

		bodyModel[6].addShapeBox(46F, -20F, -6F, 9, 12, 2, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, 0F, -3F, 2F, 0F, 0F, 0F); // Core104
		bodyModel[6].setRotationPoint(0F, -19F, 0F);

		bodyModel[7].addShapeBox(46F, -29F, -28F, 12, 3, 56, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Core105
		bodyModel[7].setRotationPoint(0F, -19F, 0F);

		bodyModel[8].addShapeBox(28F, -20F, -10F, 18, 12, 6, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Core106
		bodyModel[8].setRotationPoint(0F, -19F, 0F);

		bodyModel[9].addShapeBox(51F, -15F, -28F, 2, 2, 28, 0F, 4F, 12F, -4F, -4F, 12F, -4F, 0F, -3F, 0F, 0F, -3F, 0F, 4F, -14F, -1F, -4F, -14F, -1F, 0F, 3F, 0F, 0F, 3F, 0F); // Core107
		bodyModel[9].setRotationPoint(0F, -19F, 0F);

		bodyModel[10].addShapeBox(28F, -8F, -10F, 18, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -2F, 0F, -3F, -4F, 0F, -3F, 0F, 0F, 0F, 0F); // Core108
		bodyModel[10].setRotationPoint(0F, -19F, 0F);

		bodyModel[11].addBox(0.9F, -10.8F, -2F, 1, 1, 4, 0F); // Core109
		bodyModel[11].setRotationPoint(-64F, -33F, 0F);
		bodyModel[11].rotateAngleX = 3.14159265F;

		bodyModel[12].addShapeBox(-46F, -38F, 13F, 30, 3, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Core11
		bodyModel[12].setRotationPoint(0F, -19F, 0F);

		bodyModel[13].addShapeBox(51F, -15F, -28F, 2, 2, 28, 0F, -4F, 12F, -4F, 4F, 12F, -4F, 0F, -3F, 0F, 0F, -3F, 0F, -4F, -14F, -1F, 4F, -14F, -1F, 0F, 3F, 0F, 0F, 3F, 0F); // Core110
		bodyModel[13].setRotationPoint(0F, -19F, 0F);

		bodyModel[14].addShapeBox(51F, -15F, 1F, 2, 2, 28, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 4F, 12F, -4F, -4F, 12F, -4F, 0F, 3F, 0F, 0F, 3F, 0F, 4F, -14F, -1F, -4F, -14F, -1F); // Core111
		bodyModel[14].setRotationPoint(0F, -19F, 0F);

		bodyModel[15].addBox(0.9F, -10.8F, -2F, 1, 1, 4, 0F); // Core112
		bodyModel[15].setRotationPoint(-64F, -33F, 0F);
		bodyModel[15].rotateAngleX = -0.52359878F;

		bodyModel[16].addShapeBox(51F, -15F, 1F, 2, 2, 28, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -4F, 12F, -4F, 4F, 12F, -4F, 0F, 3F, 0F, 0F, 3F, 0F, -4F, -14F, -1F, 4F, -14F, -1F); // Core113
		bodyModel[16].setRotationPoint(0F, -19F, 0F);

		bodyModel[17].addBox(0.9F, -10.8F, -2F, 1, 1, 4, 0F); // Core114
		bodyModel[17].setRotationPoint(-64F, -33F, 0F);
		bodyModel[17].rotateAngleX = -1.57079633F;

		bodyModel[18].addShapeBox(44.2F, 24F, -2F, 4, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F); // Core115
		bodyModel[18].setRotationPoint(0F, -16F, 0F);
		bodyModel[18].rotateAngleZ = 0.76794487F;

		bodyModel[19].addBox(0.9F, -10.8F, -2F, 1, 1, 4, 0F); // Core116
		bodyModel[19].setRotationPoint(-64F, -33F, 0F);
		bodyModel[19].rotateAngleX = 1.57079633F;

		bodyModel[20].addBox(0.9F, -10.8F, -2F, 1, 1, 4, 0F); // Core117
		bodyModel[20].setRotationPoint(-64F, -33F, 0F);
		bodyModel[20].rotateAngleX = 2.61799388F;

		bodyModel[21].addShapeBox(56F, -9.5F, -1F, 4, 1, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core118
		bodyModel[21].setRotationPoint(0F, -16F, 0F);

		bodyModel[22].addShapeBox(40.8F, 33F, -2F, 3, 8, 4, 0F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F); // Core119
		bodyModel[22].setRotationPoint(0F, -16F, 0F);
		bodyModel[22].rotateAngleZ = 0.89011792F;

		bodyModel[23].addShapeBox(-20F, -20F, 9F, 14, 12, 6, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Core12
		bodyModel[23].setRotationPoint(0F, -19F, 0F);

		bodyModel[24].addBox(0.9F, -10.8F, -2F, 1, 1, 4, 0F); // Core120
		bodyModel[24].setRotationPoint(-64F, -33F, 0F);
		bodyModel[24].rotateAngleX = -2.61799388F;

		bodyModel[25].addShapeBox(28F, -28F, 4F, 18, 8, 6, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -4F, -4.5F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Core121
		bodyModel[25].setRotationPoint(0F, -19F, 0F);

		bodyModel[26].addShapeBox(-46F, -40F, -70F, 25, 3, 39, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core122
		bodyModel[26].setRotationPoint(0F, -19F, 0F);

		bodyModel[27].addBox(0.9F, -10.8F, -2F, 1, 1, 4, 0F); // Core123
		bodyModel[27].setRotationPoint(-64F, -33F, 0F);
		bodyModel[27].rotateAngleX = 0.52359878F;

		bodyModel[28].addShapeBox(56F, -8.5F, -1F, 4, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core124
		bodyModel[28].setRotationPoint(0F, -16F, 0F);

		bodyModel[29].addShapeBox(56F, -6.5F, -1F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Core125
		bodyModel[29].setRotationPoint(0F, -16F, 0F);

		bodyModel[30].addShapeBox(10F, -1F, -18F, 2, 2, 2, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Core126
		bodyModel[30].setRotationPoint(-64F, -33F, 0F);

		bodyModel[31].addShapeBox(12F, -1F, -18F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Core127
		bodyModel[31].setRotationPoint(-64F, -33F, 0F);

		bodyModel[32].addShapeBox(10F, -1F, 16F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F); // Core128
		bodyModel[32].setRotationPoint(-64F, -33F, 0F);

		bodyModel[33].addShapeBox(12F, -1F, 16F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Core129
		bodyModel[33].setRotationPoint(-64F, -33F, 0F);

		bodyModel[34].addShapeBox(-46F, -40F, 31F, 25, 3, 39, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Core13
		bodyModel[34].setRotationPoint(0F, -19F, 0F);

		bodyModel[35].addShapeBox(12F, -1F, -18F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Core130
		bodyModel[35].setRotationPoint(-64F, -33F, 0F);
		bodyModel[35].rotateAngleX = -0.59341195F;

		bodyModel[36].addShapeBox(10F, -1F, -18F, 2, 2, 2, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Core131
		bodyModel[36].setRotationPoint(-64F, -33F, 0F);
		bodyModel[36].rotateAngleX = -0.59341195F;

		bodyModel[37].addShapeBox(10F, -1F, 16F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F); // Core132
		bodyModel[37].setRotationPoint(-64F, -33F, 0F);
		bodyModel[37].rotateAngleX = -0.59341195F;

		bodyModel[38].addShapeBox(12F, -1F, 16F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Core133
		bodyModel[38].setRotationPoint(-64F, -33F, 0F);
		bodyModel[38].rotateAngleX = -0.59341195F;

		bodyModel[39].addShapeBox(46F, -28F, 4F, 9, 8, 2, 0F, 0F, -1F, 0F, 0F, -4F, 2F, 0F, -4F, -4F, 0F, -4F, -.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -4F, 0F, 0F, 0F); // Core134
		bodyModel[39].setRotationPoint(0F, -19F, 0F);

		bodyModel[40].addShapeBox(12F, -1F, -18F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Core135
		bodyModel[40].setRotationPoint(-64F, -33F, 0F);
		bodyModel[40].rotateAngleX = 0.59341195F;

		bodyModel[41].addShapeBox(10F, -1F, -18F, 2, 2, 2, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Core136
		bodyModel[41].setRotationPoint(-64F, -33F, 0F);
		bodyModel[41].rotateAngleX = 0.59341195F;

		bodyModel[42].addShapeBox(10F, -1F, 16F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F); // Core137
		bodyModel[42].setRotationPoint(-64F, -33F, 0F);
		bodyModel[42].rotateAngleX = 0.59341195F;

		bodyModel[43].addShapeBox(12F, -1F, 16F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Core138
		bodyModel[43].setRotationPoint(-64F, -33F, 0F);
		bodyModel[43].rotateAngleX = 0.59341195F;

		bodyModel[44].addShapeBox(-16F, -38F, -31F, 4, 3, 18, 0F, 0F, 2F, 0F, 0F, 1.5F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F, 0F, -1F, -4F, 0F, 0F, 0F); // Core139
		bodyModel[44].setRotationPoint(0F, -19F, 0F);

		bodyModel[45].addShapeBox(-44F, -20F, 4F, 24, 12, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core14
		bodyModel[45].setRotationPoint(0F, -19F, 0F);

		bodyModel[46].addShapeBox(46F, -20F, 4F, 9, 12, 2, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, -4F, 0F, 0F, 0F); // Core140
		bodyModel[46].setRotationPoint(0F, -19F, 0F);

		bodyModel[47].addShapeBox(8F, -29F, -4F, 20, 9, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core141
		bodyModel[47].setRotationPoint(0F, -19F, 0F);

		bodyModel[48].addShapeBox(28F, -28F, -4F, 18, 8, 8, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core142
		bodyModel[48].setRotationPoint(0F, -19F, 0F);

		bodyModel[49].addShapeBox(46F, -28F, -4F, 9, 8, 8, 0F, 0F, -1F, 0F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Core143
		bodyModel[49].setRotationPoint(0F, -19F, 0F);

		bodyModel[50].addShapeBox(46F, -20F, -4F, 9, 12, 8, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 0F, 0F); // Core144
		bodyModel[50].setRotationPoint(0F, -19F, 0F);

		bodyModel[51].addShapeBox(28F, -20F, 4F, 18, 12, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Core145
		bodyModel[51].setRotationPoint(0F, -19F, 0F);

		bodyModel[52].addShapeBox(-46F, -31F, 4F, 30, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -7F, 0F, 0F, -7F, 0F); // Core146
		bodyModel[52].setRotationPoint(0F, -19F, 0F);

		bodyModel[53].addShapeBox(-20F, -30F, -4F, 14, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Core147
		bodyModel[53].setRotationPoint(0F, -19F, 0F);

		bodyModel[54].addShapeBox(-44F, -8F, -4F, 24, 10, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core149
		bodyModel[54].setRotationPoint(0F, -19F, 0F);

		bodyModel[55].addShapeBox(-36F, -8.5F, -15F, 8, 8, 30, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Core15
		bodyModel[55].setRotationPoint(0F, -19F, 0F);

		bodyModel[56].addShapeBox(-20F, -8F, -4F, 14, 10, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Core150
		bodyModel[56].setRotationPoint(0F, -19F, 0F);

		bodyModel[57].addShapeBox(-14F, -25F, -8F, 2, 5, 3, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core151
		bodyModel[57].setRotationPoint(0F, -19F, 0F);

		bodyModel[58].addShapeBox(-14F, -25F, 5F, 2, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Core152
		bodyModel[58].setRotationPoint(0F, -19F, 0F);

		bodyModel[59].addShapeBox(-7.5F, -35F, -1.5F, 1, 3, 3, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F); // Core153
		bodyModel[59].setRotationPoint(0F, -19F, 0F);

		bodyModel[60].addShapeBox(-7.5F, -32F, -2F, 1, 1, 2, 0F, .1F, .3F, 0F, .1F, .3F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F); // Core154
		bodyModel[60].setRotationPoint(0F, -19F, 0F);

		bodyModel[61].addShapeBox(-7.5F, -32F, 0F, 1, 1, 2, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, .3F, 0F, .1F, .3F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F); // Core155
		bodyModel[61].setRotationPoint(0F, -19F, 0F);

		bodyModel[62].addBox(-10F, -31F, -2F, 4, 1, 4, 0F); // Core156
		bodyModel[62].setRotationPoint(1F, -19F, 0F);

		bodyModel[63].addBox(-6F, -31.5F, -1F, 1, 2, 2, 0F); // Core157
		bodyModel[63].setRotationPoint(1F, -19F, 0F);

		bodyModel[64].addBox(-8.5F, -31.5F, -1.5F, 3, 1, 3, 0F); // Core158
		bodyModel[64].setRotationPoint(0F, -19F, 0F);

		bodyModel[65].addShapeBox(-8.5F, -32.5F, -1.5F, 3, 1, 3, 0F, -.5F, -.7F, -.5F, -.5F, -.7F, -.5F, -.5F, -.7F, -.5F, -.5F, -.7F, -.5F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Core159
		bodyModel[65].setRotationPoint(0F, -19F, 0F);

		bodyModel[66].addShapeBox(-44F, -8F, 4F, 24, 10, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, -1F); // Core16
		bodyModel[66].setRotationPoint(0F, -19F, 0F);

		bodyModel[67].addShapeBox(-6.5F, -33.5F, -0.5F, 1, 2, 1, 0F, -.8F, 0F, -.45F, 0F, 0F, -.45F, 0F, 0F, -.45F, -.8F, 0F, -.45F, -.8F, 0F, -.45F, 0F, 0F, -.45F, 0F, 0F, -.45F, -.8F, 0F, -.45F); // Core160
		bodyModel[67].setRotationPoint(0F, -19F, 0F);

		bodyModel[68].addShapeBox(5F, -30F, -5F, 3, 5, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core161
		bodyModel[68].setRotationPoint(0F, -19F, 0F);

		bodyModel[69].addShapeBox(5F, -35F, -2.5F, 3, 5, 5, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core162
		bodyModel[69].setRotationPoint(0F, -19F, 0F);

		bodyModel[70].addShapeBox(5F, -25F, -5F, 3, 11, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core163
		bodyModel[70].setRotationPoint(0F, -19F, 0F);

		bodyModel[71].addShapeBox(-5F, -17F, -5F, 10, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core164
		bodyModel[71].setRotationPoint(0F, -19F, 0F);

		bodyModel[72].addShapeBox(-6F, -30F, -6F, 1, 2, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core165
		bodyModel[72].setRotationPoint(0F, -19F, 0F);

		bodyModel[73].addShapeBox(-10F, -15F, -4F, 4, 3, 1, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core166
		bodyModel[73].setRotationPoint(0F, -19F, 0F);

		bodyModel[74].addShapeBox(-10F, -15F, -7F, 4, 3, 1, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core167
		bodyModel[74].setRotationPoint(0F, -19F, 0F);

		bodyModel[75].addBox(-10F, -12F, -7F, 4, 1, 4, 0F); // Core168
		bodyModel[75].setRotationPoint(0F, -19F, 0F);

		bodyModel[76].addBox(-11F, -15F, -7F, 1, 4, 4, 0F); // Core169
		bodyModel[76].setRotationPoint(0F, -19F, 0F);

		bodyModel[77].addShapeBox(-20F, -8F, 4F, 14, 10, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -4.5F, -1.5F, 0F, -4F, -1F); // Core17
		bodyModel[77].setRotationPoint(0F, -19F, 0F);

		bodyModel[78].addBox(-11F, -15F, 3F, 1, 4, 4, 0F); // Core170
		bodyModel[78].setRotationPoint(0F, -19F, 0F);

		bodyModel[79].addShapeBox(-10F, -15F, 3F, 4, 3, 1, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core171
		bodyModel[79].setRotationPoint(0F, -19F, 0F);

		bodyModel[80].addShapeBox(-10F, -15F, 6F, 4, 3, 1, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core172
		bodyModel[80].setRotationPoint(0F, -19F, 0F);

		bodyModel[81].addBox(-10F, -12F, 3F, 4, 1, 4, 0F); // Core173
		bodyModel[81].setRotationPoint(0F, -19F, 0F);

		bodyModel[82].addShapeBox(-27F, -11F, -9F, 35, 1, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core174
		bodyModel[82].setRotationPoint(0F, -19F, 0F);

		bodyModel[83].addShapeBox(-11F, -13F, -1.5F, 3, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core175
		bodyModel[83].setRotationPoint(0F, -19F, 0F);

		bodyModel[84].addShapeBox(-10F, -19F, -0.5F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core176
		bodyModel[84].setRotationPoint(0F, -19F, 0F);

		bodyModel[85].addShapeBox(-10.5F, -22F, -1F, 1, 3, 2, 0F, 0F, -.5F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, -.5F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F); // Core177
		bodyModel[85].setRotationPoint(0F, -19F, 0F);

		bodyModel[86].addShapeBox(-10F, -22F, -1.5F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F); // Core178
		bodyModel[86].setRotationPoint(0F, -19F, 0F);

		bodyModel[87].addShapeBox(-10F, -25F, -1.5F, 1, 1, 3, 0F, 0F, -.5F, -.6F, 0F, -.5F, -.6F, 0F, -.5F, -.6F, 0F, -.5F, -.6F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F); // Core179
		bodyModel[87].setRotationPoint(0F, -19F, 0F);

		bodyModel[88].addShapeBox(-28F, -9F, -15F, 13, 9, 30, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F); // Core18
		bodyModel[88].setRotationPoint(0F, -19F, 0F);

		bodyModel[89].addShapeBox(-10F, -24F, -1.5F, 1, 2, 1, 0F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, 0F, -.4F); // Core180
		bodyModel[89].setRotationPoint(0F, -19F, 0F);

		bodyModel[90].addShapeBox(-10F, -24F, 0.5F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Core181
		bodyModel[90].setRotationPoint(0F, -19F, 0F);

		bodyModel[91].addShapeBox(-9.5F, -22F, -1F, 1, 3, 2, 0F, 0F, 0F, -.2F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F); // Core182
		bodyModel[91].setRotationPoint(0F, -19F, 0F);

		bodyModel[92].addShapeBox(-10F, -24.75F, -0.5F, 1, 1, 1, 0F, .1F, -.2F, -.2F, .1F, -.2F, -.2F, .1F, -.2F, -.2F, .1F, -.2F, -.2F, .1F, -.2F, -.2F, .1F, -.2F, -.2F, .1F, -.2F, -.2F, .1F, -.2F, -.2F); // Core183
		bodyModel[92].setRotationPoint(0F, -19F, 0F);

		bodyModel[93].addShapeBox(-10F, -23F, -0.5F, 1, 1, 1, 0F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Core184
		bodyModel[93].setRotationPoint(0F, -19F, 0F);

		bodyModel[94].addShapeBox(-14F, -26F, -5F, 2, 6, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core185
		bodyModel[94].setRotationPoint(0F, -19F, 0F);

		bodyModel[95].addShapeBox(-15F, -26F, -10F, 1, 15, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core186
		bodyModel[95].setRotationPoint(0F, -19F, 0F);

		bodyModel[96].addShapeBox(-15F, -9F, -15F, 13, 9, 30, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Core19
		bodyModel[96].setRotationPoint(0F, -19F, 0F);

		bodyModel[97].addShapeBox(55F, -24F, -2F, 3, 4, 4, 0F, 0F, 0F, 0F, -.5F, -2.5F, -1.8F, -.5F, -2.5F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, 0F); // Core2
		bodyModel[97].setRotationPoint(0F, -19F, 0F);

		bodyModel[98].addShapeBox(-6F, -8F, 4F, 14, 8, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, .5F, 0F, 0F, -1.5F, 0F, 0F, -3.5F, -2F, 0F, -2.5F, -1.5F); // Core20
		bodyModel[98].setRotationPoint(0F, -19F, 0F);

		bodyModel[99].addShapeBox(8F, -8F, 4F, 20, 6, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -3F, 0F, 0F, -3.5F, -5F, 0F, -1.5F, -3F); // Core21
		bodyModel[99].setRotationPoint(0F, -19F, 0F);

		bodyModel[100].addShapeBox(-2F, -8F, -15F, 9, 7, 30, 0F, 0F, -.5F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, 0F); // Core22
		bodyModel[100].setRotationPoint(0F, -19F, 0F);

		bodyModel[101].addShapeBox(28F, -8F, 4F, 18, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -4F, 0F, -.5F, -2F); // Core23
		bodyModel[101].setRotationPoint(0F, -19F, 0F);

		bodyModel[102].addShapeBox(-2F, -8F, -19F, 9, 7, 4, 0F, 0F, -2F, 0F, -8F, -2F, 0F, 0F, -2F, 3F, 0F, -.5F, 0F, 0F, -2F, 0F, -8F, -2F, 0F, 0F, -2F, 3F, 0F, 0F, 0F); // Core24
		bodyModel[102].setRotationPoint(0F, -19F, 0F);

		bodyModel[103].addShapeBox(8F, -36F, -4F, 8, 7, 8, 0F, 0F, 0F, -2F, 0F, -1F, -2.5F, 0F, -1F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core25
		bodyModel[103].setRotationPoint(0F, -19F, 0F);

		bodyModel[104].addShapeBox(-60F, -18.5F, -16.5F, 16, 9, 33, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core26
		bodyModel[104].setRotationPoint(0F, -19F, 0F);

		bodyModel[105].addShapeBox(-36F, -8.5F, -19F, 8, 8, 4, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Core27
		bodyModel[105].setRotationPoint(0F, -19F, 0F);

		bodyModel[106].addShapeBox(-44F, -30F, 4F, 24, 10, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F); // Core28
		bodyModel[106].setRotationPoint(0F, -19F, 0F);

		bodyModel[107].addShapeBox(-62F, -30F, -2F, 13, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Core29
		bodyModel[107].setRotationPoint(0F, -19F, 0F);

		bodyModel[108].addShapeBox(-62F, -31F, -2F, 13, 1, 4, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core3
		bodyModel[108].setRotationPoint(0F, -19F, 0F);

		bodyModel[109].addShapeBox(16F, -34F, -4F, 8, 5, 8, 0F, 0F, 1F, -2.5F, 0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 1F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core30
		bodyModel[109].setRotationPoint(0F, -19F, 0F);

		bodyModel[110].addShapeBox(-60F, -26.5F, -16.5F, 16, 8, 33, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core31
		bodyModel[110].setRotationPoint(0F, -19F, 0F);

		bodyModel[111].addShapeBox(-28F, -9F, -19F, 13, 9, 4, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F); // Core32
		bodyModel[111].setRotationPoint(0F, -19F, 0F);

		bodyModel[112].addShapeBox(24F, -32F, -4F, 12, 4, 8, 0F, 0F, .5F, -3F, 0F, -4F, -3.5F, 0F, -4F, -3.5F, 0F, .5F, -3F, 0F, -1F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, -1F, 0F); // Core33
		bodyModel[112].setRotationPoint(0F, -19F, 0F);

		bodyModel[113].addShapeBox(-15F, -9F, -19F, 13, 9, 4, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Core34
		bodyModel[113].setRotationPoint(0F, -19F, 0F);

		bodyModel[114].addShapeBox(-60F, -30.5F, -11.5F, 16, 4, 23, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core35
		bodyModel[114].setRotationPoint(0F, -19F, 0F);

		bodyModel[115].addShapeBox(-6F, -29F, -11F, 14, 4, 5, 0F, 0F, -3.3F, -.5F, 0F, -4F, -.5F, 0F, -1.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Core36
		bodyModel[115].setRotationPoint(0F, -19F, 0F);

		bodyModel[116].addShapeBox(-36F, -6F, -62F, 35, 3, 43, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core37
		bodyModel[116].setRotationPoint(0F, -19F, 0F);

		bodyModel[117].addShapeBox(-60F, -9.5F, -16.5F, 16, 8, 33, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Core38
		bodyModel[117].setRotationPoint(0F, -19F, 0F);

		bodyModel[118].addShapeBox(-6F, -29F, 6F, 14, 4, 5, 0F, 0F, -.5F, 0F, 0F, -1.5F, 0F, 0F, -4F, -.5F, 0F, -3.3F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F); // Core39
		bodyModel[118].setRotationPoint(0F, -19F, 0F);

		bodyModel[119].addShapeBox(55F, -20F, -2F, 3, 9, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, -1.8F, -1F, -3F, -1.8F, 0F, 0F, 0F); // Core4
		bodyModel[119].setRotationPoint(0F, -19F, 0F);

		bodyModel[120].addShapeBox(-2F, -8F, 15F, 9, 7, 4, 0F, 0F, -.5F, 0F, 0F, -2F, 3F, -8F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 3F, -8F, -2F, 0F, 0F, -2F, 0F); // Core40
		bodyModel[120].setRotationPoint(0F, -19F, 0F);

		bodyModel[121].addShapeBox(-60F, -1.5F, -11.5F, 16, 4, 23, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F); // Core41
		bodyModel[121].setRotationPoint(0F, -19F, 0F);

		bodyModel[122].addShapeBox(-15F, -9F, 15F, 13, 9, 4, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Core42
		bodyModel[122].setRotationPoint(0F, -19F, 0F);

		bodyModel[123].addShapeBox(-20F, -30F, 4F, 14, 10, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1.5F, 0F, -4F, -1F, 0F, -7F, -2F, 0F, -7F, -2F, 0F, 0F, 2F, 0F, 0F, 3F); // Core43
		bodyModel[123].setRotationPoint(0F, -19F, 0F);

		bodyModel[124].addShapeBox(-28F, -9F, 15F, 13, 9, 4, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Core44
		bodyModel[124].setRotationPoint(0F, -19F, 0F);

		bodyModel[125].addShapeBox(-6F, -25F, 4F, 14, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F); // Core45
		bodyModel[125].setRotationPoint(0F, -19F, 5F);

		bodyModel[126].addShapeBox(-36F, -8.5F, 15F, 8, 8, 4, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F); // Core46
		bodyModel[126].setRotationPoint(0F, -19F, 0F);

		bodyModel[127].addShapeBox(-13F, -36F, -2F, 7, 6, 4, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core47
		bodyModel[127].setRotationPoint(0F, -19F, 0F);

		bodyModel[128].addShapeBox(-13F, -36F, -6F, 7, 6, 4, 0F, 0F, -6F, -4F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core48
		bodyModel[128].setRotationPoint(0F, -19F, 0F);

		bodyModel[129].addShapeBox(-36F, -6F, 19F, 35, 3, 43, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core49
		bodyModel[129].setRotationPoint(0F, -19F, 0F);

		bodyModel[130].addShapeBox(8F, -20F, 4F, 20, 12, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Core5
		bodyModel[130].setRotationPoint(0F, -19F, 0F);

		bodyModel[131].addShapeBox(-28F, -40F, -61F, 6, 34, 2, 0F, 2F, 0F, 7F, -2F, 0F, 7F, -2F, 0F, -7F, 2F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core50
		bodyModel[131].setRotationPoint(0F, -19F, 0F);

		bodyModel[132].addShapeBox(-13F, -36F, 2F, 7, 6, 4, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Core51
		bodyModel[132].setRotationPoint(0F, -19F, 0F);

		bodyModel[133].addShapeBox(-49F, -31F, -3F, 3, 1, 6, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Core52
		bodyModel[133].setRotationPoint(0F, -19F, 0F);

		bodyModel[134].addShapeBox(-10F, -30F, -6F, 4, 2, 2, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core53
		bodyModel[134].setRotationPoint(0F, -19F, 0F);

		bodyModel[135].addShapeBox(-28F, -40F, 59F, 6, 34, 2, 0F, 2F, 0F, -7F, -2F, 0F, -7F, -2F, 0F, 7F, 2F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core54
		bodyModel[135].setRotationPoint(0F, -19F, 0F);

		bodyModel[136].addShapeBox(-25F, -10F, -61F, 1, 1, 45, 0F, 0F, 30F, 0F, 0F, 30F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core55
		bodyModel[136].setRotationPoint(0F, -19F, 0F);

		bodyModel[137].addShapeBox(-10F, -30F, 4F, 4, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Core56
		bodyModel[137].setRotationPoint(0F, -19F, 0F);

		bodyModel[138].addShapeBox(-63F, -30.5F, -11.5F, 3, 4, 23, 0F, 0F, -4F, -7F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -4F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Core57
		bodyModel[138].setRotationPoint(0F, -19F, 0F);

		bodyModel[139].addShapeBox(-25F, -19F, -61F, 1, 1, 45, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core58
		bodyModel[139].setRotationPoint(0F, -19F, 0F);

		bodyModel[140].addShapeBox(-63F, -26.5F, -16.5F, 3, 8, 33, 0F, 0F, 0F, -12F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -12F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Core59
		bodyModel[140].setRotationPoint(0F, -19F, 0F);

		bodyModel[141].addShapeBox(-16F, -38F, 13F, 4, 3, 18, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 1.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -2.5F, 0F, 0F, -2F, 0F); // Core6
		bodyModel[141].setRotationPoint(0F, -19F, 0F);

		bodyModel[142].addShapeBox(-43F, -6F, -65F, 1, 1, 52, 0F, 0F, 35F, 0F, 0F, 35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -35F, 0F, 0F, -35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core60
		bodyModel[142].setRotationPoint(0F, -19F, 0F);

		bodyModel[143].addShapeBox(-25F, -10F, 15F, 1, 1, 45, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 30F, 0F, 0F, 30F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -30F, 0F, 0F, -30F, 0F); // Core61
		bodyModel[143].setRotationPoint(0F, -19F, 0F);

		bodyModel[144].addShapeBox(-63F, -18.5F, -16.5F, 3, 9, 33, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Core62
		bodyModel[144].setRotationPoint(0F, -19F, 0F);

		bodyModel[145].addShapeBox(-63F, -9.5F, -16.5F, 3, 8, 33, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -12F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -12F); // Core63
		bodyModel[145].setRotationPoint(0F, -19F, 0F);

		bodyModel[146].addShapeBox(-25F, -19F, 15F, 1, 1, 45, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 14F, 0F, 0F, 14F, 0F); // Core64
		bodyModel[146].setRotationPoint(0F, -19F, 0F);

		bodyModel[147].addShapeBox(-44F, -8F, -12F, 24, 10, 8, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Core65
		bodyModel[147].setRotationPoint(0F, -19F, 0F);

		bodyModel[148].addShapeBox(-63F, -1.5F, -11.5F, 3, 4, 23, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -4F, -7F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -4F, -7F); // Core66
		bodyModel[148].setRotationPoint(0F, -19F, 0F);

		bodyModel[149].addShapeBox(-43F, -6F, 12F, 1, 1, 52, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 35F, 0F, 0F, 35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -35F, 0F, 0F, -35F, 0F); // Core67
		bodyModel[149].setRotationPoint(0F, -19F, 0F);

		bodyModel[150].addShapeBox(-20F, -8F, -12F, 14, 10, 8, 0F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -4.5F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Core68
		bodyModel[150].setRotationPoint(0F, -19F, 0F);

		bodyModel[151].addShapeBox(-6F, -8F, -4F, 14, 8, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, .5F, 0F); // Core7
		bodyModel[151].setRotationPoint(0F, -19F, 0F);

		bodyModel[152].addShapeBox(0.9F, -11F, -1F, 1, 22, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core70
		bodyModel[152].setRotationPoint(-64F, -33F, 0F);
		bodyModel[152].rotateAngleX = 0.26179939F;

		bodyModel[153].addShapeBox(-6F, -8F, -12F, 14, 8, 8, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -1.5F, 0F, -3.5F, -2F, 0F, -1.5F, 0F, 0F, .5F, 0F); // Core71
		bodyModel[153].setRotationPoint(0F, -19F, 0F);

		bodyModel[154].addShapeBox(-6F, -20F, -14F, 14, 12, 5, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Core72
		bodyModel[154].setRotationPoint(0F, -19F, 0F);

		bodyModel[155].addShapeBox(0.9F, -11F, -1F, 1, 22, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core73
		bodyModel[155].setRotationPoint(-64F, -33F, 0F);
		bodyModel[155].rotateAngleX = -1.30899694F;

		bodyModel[156].addShapeBox(-46F, -31F, -13F, 30, 3, 9, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Core74
		bodyModel[156].setRotationPoint(0F, -19F, 0F);

		bodyModel[157].addShapeBox(0.9F, -11F, -1F, 1, 22, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core75
		bodyModel[157].setRotationPoint(-64F, -33F, 0F);
		bodyModel[157].rotateAngleX = -0.78539816F;

		bodyModel[158].addShapeBox(-20F, -20F, -15F, 14, 12, 6, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Core76
		bodyModel[158].setRotationPoint(0F, -19F, 0F);

		bodyModel[159].addShapeBox(-44F, -20F, -15F, 24, 12, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core77
		bodyModel[159].setRotationPoint(0F, -19F, 0F);

		bodyModel[160].addShapeBox(0.9F, -11F, -1F, 1, 22, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core78
		bodyModel[160].setRotationPoint(-64F, -33F, 0F);
		bodyModel[160].rotateAngleX = 0.78539816F;

		bodyModel[161].addShapeBox(-44F, -30F, -12F, 24, 10, 8, 0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F); // Core79
		bodyModel[161].setRotationPoint(0F, -19F, 0F);

		bodyModel[162].addShapeBox(8F, -8F, -4F, 20, 6, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, .5F, 0F); // Core8
		bodyModel[162].setRotationPoint(0F, -19F, 0F);

		bodyModel[163].addShapeBox(0.9F, -11F, -1F, 1, 22, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core80
		bodyModel[163].setRotationPoint(-64F, -33F, 0F);
		bodyModel[163].rotateAngleX = 1.30899694F;

		bodyModel[164].addShapeBox(-20F, -30F, -12F, 14, 10, 8, 0F, 0F, -4F, -1F, 0F, -4F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, -7F, -2F, 0F, -7F, -2F); // Core81
		bodyModel[164].setRotationPoint(0F, -19F, 0F);

		bodyModel[165].addShapeBox(-63.1F, -27.5F, -6.5F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F); // Core82
		bodyModel[165].setRotationPoint(0F, -19F, 0F);

		bodyModel[166].addShapeBox(0.9F, -11F, -1F, 1, 22, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core83
		bodyModel[166].setRotationPoint(-64F, -33F, 0F);
		bodyModel[166].rotateAngleX = -0.26179939F;

		bodyModel[167].addShapeBox(-6F, -25F, -12F, 14, 5, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Core84
		bodyModel[167].setRotationPoint(0F, -19F, 0F);

		bodyModel[168].addShapeBox(0.9F, -10.8F, -2F, 1, 7, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Core85
		bodyModel[168].setRotationPoint(-64F, -33F, 0F);

		bodyModel[169].addShapeBox(-63.1F, -28.5F, -6.5F, 4, 1, 2, 0F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core86
		bodyModel[169].setRotationPoint(0F, -19F, 0F);

		bodyModel[170].addShapeBox(8F, -29F, -13F, 20, 9, 9, 0F, 0F, -4F, -2.5F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Core87
		bodyModel[170].setRotationPoint(0F, -19F, 0F);

		bodyModel[171].addShapeBox(-63.1F, -28.5F, 4.5F, 4, 1, 2, 0F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core88
		bodyModel[171].setRotationPoint(0F, -19F, 0F);

		bodyModel[172].addShapeBox(-63.1F, -27.5F, 4.5F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F); // Core89
		bodyModel[172].setRotationPoint(0F, -19F, 0F);

		bodyModel[173].addShapeBox(28F, -8F, -4F, 18, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Core9
		bodyModel[173].setRotationPoint(0F, -19F, 0F);

		bodyModel[174].addShapeBox(8F, -20F, -13F, 20, 12, 9, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Core90
		bodyModel[174].setRotationPoint(0F, -19F, 0F);

		bodyModel[175].addShapeBox(0.9F, -10.8F, -2F, 1, 7, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Core91
		bodyModel[175].setRotationPoint(-64F, -33F, 0F);
		bodyModel[175].rotateAngleX = -1.04719755F;

		bodyModel[176].addShapeBox(53F, -52F, -1F, 3, 40, 2, 0F, 0F, -7F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core92
		bodyModel[176].setRotationPoint(0F, -19F, 0F);

		bodyModel[177].addShapeBox(0.9F, -10.8F, -2F, 1, 7, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Core93
		bodyModel[177].setRotationPoint(-64F, -33F, 0F);
		bodyModel[177].rotateAngleX = 1.04719755F;

		bodyModel[178].addShapeBox(8F, -8F, -13F, 20, 6, 9, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -3F, 0F, -3.5F, -5F, 0F, -3F, 0F, 0F, .5F, 0F); // Core94
		bodyModel[178].setRotationPoint(0F, -19F, 0F);

		bodyModel[179].addShapeBox(28F, -28F, -10F, 18, 8, 6, 0F, 0F, -3F, -1F, 0F, -4F, -4.5F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Core95
		bodyModel[179].setRotationPoint(0F, -19F, 0F);

		bodyModel[180].addBox(0.9F, -10.8F, -2F, 1, 1, 4, 0F); // Core96
		bodyModel[180].setRotationPoint(-64F, -33F, 0F);
		bodyModel[180].rotateAngleX = 2.0943951F;

		bodyModel[181].addShapeBox(47F, -45F, -1F, 6, 20, 2, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core97
		bodyModel[181].setRotationPoint(0F, -19F, 0F);

		bodyModel[182].addBox(0.9F, -10.8F, -2F, 1, 1, 4, 0F); // Core98
		bodyModel[182].setRotationPoint(-64F, -33F, 0F);
		bodyModel[182].rotateAngleX = -2.0943951F;

		bodyModel[183].addShapeBox(46F, -28F, -6F, 9, 8, 2, 0F, 0F, -4F, -.5F, 0F, -4F, -4F, 0F, -4F, 2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 0F); // Core99
		bodyModel[183].setRotationPoint(0F, -19F, 0F);

		bodyModel[184].addShapeBox(46F, -50F, -1F, 15, 20, 2, 0F, -2F, -2F, .1F, -2F, -2F, .1F, -2F, -2F, .1F, -2F, -2F, .1F, -2F, -2F, .1F, -2F, -2F, .1F, -2F, -2F, .1F, -2F, -2F, .1F); // Decal1
		bodyModel[184].setRotationPoint(0F, -19F, 0F);

		bodyModel[185].addShapeBox(-63.2F, -11.5F, -11.5F, 4, 1, 2, 0F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core192
		bodyModel[185].setRotationPoint(0F, -19F, 0F);

		bodyModel[186].addShapeBox(-63.2F, -10.5F, -11.5F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F); // Core193
		bodyModel[186].setRotationPoint(0F, -19F, 0F);

		bodyModel[187].addShapeBox(-63.2F, -11.5F, 9.5F, 4, 1, 2, 0F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core190
		bodyModel[187].setRotationPoint(0F, -19F, 0F);

		bodyModel[188].addShapeBox(-63.2F, -10.5F, 9.5F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F); // Core191
		bodyModel[188].setRotationPoint(0F, -19F, 0F);


		noseModel = new ModelRendererTurbo[5];
		noseModel[0] = new ModelRendererTurbo(this, 212, 5, textureX, textureY); // Nose1
		noseModel[1] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Nose2
		noseModel[2] = new ModelRendererTurbo(this, 234, 17, textureX, textureY); // Nose3
		noseModel[3] = new ModelRendererTurbo(this, 197, 35, textureX, textureY); // Nose4
		noseModel[4] = new ModelRendererTurbo(this, 216, 35, textureX, textureY); // Nose5

		noseModel[0].addShapeBox(-1F, -2F, -2F, 2, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Nose1
		noseModel[0].setRotationPoint(-64F, -33F, 0F);

		noseModel[1].addShapeBox(-5F, -3F, -3F, 4, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Nose2
		noseModel[1].setRotationPoint(-64F, -33F, 0F);

		noseModel[2].addShapeBox(-7F, -3F, -3F, 2, 6, 6, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F); // Nose3
		noseModel[2].setRotationPoint(-64F, -33F, 0F);

		noseModel[3].addShapeBox(-4.5F, -4F, -1.5F, 3, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Nose4
		noseModel[3].setRotationPoint(-64F, -33F, 0F);

		noseModel[4].addShapeBox(-4.5F, -1.5F, -4F, 3, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Nose5
		noseModel[4].setRotationPoint(-64F, -33F, 0F);


		tailModel = new ModelRendererTurbo[6];
		tailModel[0] = new ModelRendererTurbo(this, 478, 31, textureX, textureY); // Tail1
		tailModel[1] = new ModelRendererTurbo(this, 478, 20, textureX, textureY); // Tail2
		tailModel[2] = new ModelRendererTurbo(this, 478, 6, textureX, textureY); // Tail3
		tailModel[3] = new ModelRendererTurbo(this, 478, 6, textureX, textureY); // Tail4
		tailModel[4] = new ModelRendererTurbo(this, 478, 20, textureX, textureY); // Tail5
		tailModel[5] = new ModelRendererTurbo(this, 478, 31, textureX, textureY); // Tail6

		tailModel[0].addShapeBox(49F, -29F, -42F, 9, 3, 3, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Tail1
		tailModel[0].setRotationPoint(0F, -19F, 0F);

		tailModel[1].addShapeBox(46F, -29F, -39F, 12, 3, 4, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Tail2
		tailModel[1].setRotationPoint(0F, -19F, 0F);

		tailModel[2].addShapeBox(46F, -29F, -35F, 12, 3, 7, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Tail3
		tailModel[2].setRotationPoint(0F, -19F, 0F);

		tailModel[3].addShapeBox(46F, -29F, 28F, 12, 3, 7, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Tail4
		tailModel[3].setRotationPoint(0F, -19F, 0F);

		tailModel[4].addShapeBox(46F, -29F, 35F, 12, 3, 4, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F); // Tail5
		tailModel[4].setRotationPoint(0F, -19F, 0F);

		tailModel[5].addShapeBox(49F, -29F, 39F, 9, 3, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1F, 0F); // Tail6
		tailModel[5].setRotationPoint(0F, -19F, 0F);


		leftWingModel = new ModelRendererTurbo[42];
		leftWingModel[0] = new ModelRendererTurbo(this, 138, 490, textureX, textureY); // LeftWing1
		leftWingModel[1] = new ModelRendererTurbo(this, 138, 473, textureX, textureY); // LeftWing2
		leftWingModel[2] = new ModelRendererTurbo(this, 138, 503, textureX, textureY); // LeftWing3
		leftWingModel[3] = new ModelRendererTurbo(this, 210, 376, textureX, textureY); // LeftWing4
		leftWingModel[4] = new ModelRendererTurbo(this, 340, 409, textureX, textureY); // LeftWing5
		leftWingModel[5] = new ModelRendererTurbo(this, 340, 422, textureX, textureY); // LeftWing6
		leftWingModel[6] = new ModelRendererTurbo(this, 119, 2, textureX, textureY); // LeftRocket1
		leftWingModel[7] = new ModelRendererTurbo(this, 119, 8, textureX, textureY); // LeftRocket8
		leftWingModel[8] = new ModelRendererTurbo(this, 159, 24, textureX, textureY); // LeftRocket20
		leftWingModel[9] = new ModelRendererTurbo(this, 159, 24, textureX, textureY); // LeftRocket21
		leftWingModel[10] = new ModelRendererTurbo(this, 119, 16, textureX, textureY); // LeftRocket16
		leftWingModel[11] = new ModelRendererTurbo(this, 119, 24, textureX, textureY); // LeftRocket12
		leftWingModel[12] = new ModelRendererTurbo(this, 134, 24, textureX, textureY); // LeftRocket25
		leftWingModel[13] = new ModelRendererTurbo(this, 166, 16, textureX, textureY); // LeftRocket30
		leftWingModel[14] = new ModelRendererTurbo(this, 166, 16, textureX, textureY); // LeftRocket29
		leftWingModel[15] = new ModelRendererTurbo(this, 119, 8, textureX, textureY); // LeftRocket7
		leftWingModel[16] = new ModelRendererTurbo(this, 119, 2, textureX, textureY); // LeftRocket2
		leftWingModel[17] = new ModelRendererTurbo(this, 159, 24, textureX, textureY); // LeftRocket19
		leftWingModel[18] = new ModelRendererTurbo(this, 119, 24, textureX, textureY); // LeftRocket11
		leftWingModel[19] = new ModelRendererTurbo(this, 159, 24, textureX, textureY); // LeftRocket22
		leftWingModel[20] = new ModelRendererTurbo(this, 134, 24, textureX, textureY); // LeftRocket26
		leftWingModel[21] = new ModelRendererTurbo(this, 119, 16, textureX, textureY); // LeftRocket15
		leftWingModel[22] = new ModelRendererTurbo(this, 166, 16, textureX, textureY); // LeftRocket31
		leftWingModel[23] = new ModelRendererTurbo(this, 166, 16, textureX, textureY); // LeftRocket32
		leftWingModel[24] = new ModelRendererTurbo(this, 119, 8, textureX, textureY); // LeftRocket6
		leftWingModel[25] = new ModelRendererTurbo(this, 119, 2, textureX, textureY); // LeftRocket3
		leftWingModel[26] = new ModelRendererTurbo(this, 159, 24, textureX, textureY); // LeftRocket18
		leftWingModel[27] = new ModelRendererTurbo(this, 119, 24, textureX, textureY); // LeftRocket10
		leftWingModel[28] = new ModelRendererTurbo(this, 159, 24, textureX, textureY); // LeftRocket23
		leftWingModel[29] = new ModelRendererTurbo(this, 134, 24, textureX, textureY); // LeftRocket27
		leftWingModel[30] = new ModelRendererTurbo(this, 119, 16, textureX, textureY); // LeftRocket14
		leftWingModel[31] = new ModelRendererTurbo(this, 166, 16, textureX, textureY); // LeftRocket34
		leftWingModel[32] = new ModelRendererTurbo(this, 166, 16, textureX, textureY); // LeftRocket33
		leftWingModel[33] = new ModelRendererTurbo(this, 119, 8, textureX, textureY); // LeftRocket5
		leftWingModel[34] = new ModelRendererTurbo(this, 119, 2, textureX, textureY); // LeftRocket4
		leftWingModel[35] = new ModelRendererTurbo(this, 159, 24, textureX, textureY); // LeftRocket17
		leftWingModel[36] = new ModelRendererTurbo(this, 119, 24, textureX, textureY); // LeftRocket9
		leftWingModel[37] = new ModelRendererTurbo(this, 159, 24, textureX, textureY); // LeftRocket24
		leftWingModel[38] = new ModelRendererTurbo(this, 134, 24, textureX, textureY); // LeftRocket28
		leftWingModel[39] = new ModelRendererTurbo(this, 119, 16, textureX, textureY); // LeftRocket13
		leftWingModel[40] = new ModelRendererTurbo(this, 166, 16, textureX, textureY); // LeftRocket35
		leftWingModel[41] = new ModelRendererTurbo(this, 166, 16, textureX, textureY); // LeftRocket36

		leftWingModel[0].addShapeBox(-36F, -6F, -80F, 35, 3, 6, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWing1
		leftWingModel[0].setRotationPoint(0F, -19F, 0F);

		leftWingModel[1].addShapeBox(-36F, -6F, -74F, 35, 3, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWing2
		leftWingModel[1].setRotationPoint(0F, -19F, 0F);

		leftWingModel[2].addShapeBox(-33F, -6F, -85F, 28, 3, 5, 0F, -7F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWing3
		leftWingModel[2].setRotationPoint(0F, -19F, 0F);

		leftWingModel[3].addShapeBox(-46F, -42F, -100F, 25, 3, 30, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWing4
		leftWingModel[3].setRotationPoint(0F, -19F, 0F);

		leftWingModel[4].addShapeBox(-46F, -44F, -105F, 25, 3, 5, 0F, -3F, .3F, 0F, -3F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -.3F, 0F, -3F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWing5
		leftWingModel[4].setRotationPoint(0F, -19F, 0F);

		leftWingModel[5].addShapeBox(-43F, -44.3F, -109F, 19, 3, 4, 0F, -5F, .3F, 0F, -9F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -.3F, 0F, -9F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWing6
		leftWingModel[5].setRotationPoint(0F, -19F, 0F);

		leftWingModel[6].addShapeBox(-33F, -3F, -61F, 28, 2, 2, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftRocket1
		leftWingModel[6].setRotationPoint(0F, -19F, 0F);

		leftWingModel[7].addShapeBox(-33F, -3F, -61.5F, 28, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftRocket8
		leftWingModel[7].setRotationPoint(0F, -19F, 0F);

		leftWingModel[8].addShapeBox(-22F, -1F, -61.5F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftRocket20
		leftWingModel[8].setRotationPoint(0F, -19F, 0F);

		leftWingModel[9].addShapeBox(-12F, -1F, -61.5F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftRocket21
		leftWingModel[9].setRotationPoint(0F, -19F, 0F);

		leftWingModel[10].addShapeBox(-24F, -1F, -61.5F, 16, 3, 3, 0F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // LeftRocket16
		leftWingModel[10].setRotationPoint(0F, -19F, 0F);

		leftWingModel[11].addShapeBox(-27F, -1F, -61.5F, 3, 3, 3, 0F, 0F, -1.5F, -1.5F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -1.5F, -1.5F); // LeftRocket12
		leftWingModel[11].setRotationPoint(0F, -19F, 0F);

		leftWingModel[12].addShapeBox(-8F, -1F, -61.5F, 5, 3, 3, 0F, 0F, -.2F, -.2F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -.2F, -.2F); // LeftRocket25
		leftWingModel[12].setRotationPoint(0F, -19F, 0F);

		leftWingModel[13].addShapeBox(-9F, -2F, -62F, 4, 1, 4, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, -.5F, 0F, 3.5F, -.5F); // LeftRocket30
		leftWingModel[13].setRotationPoint(0F, -19F, 0F);

		leftWingModel[14].addShapeBox(-9F, -2F, -62F, 4, 1, 4, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 3.5F, -.5F, 0F, 3.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftRocket29
		leftWingModel[14].setRotationPoint(0F, -19F, 0F);

		leftWingModel[15].addShapeBox(-33F, -3F, -57.5F, 28, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftRocket7
		leftWingModel[15].setRotationPoint(0F, -19F, 0F);

		leftWingModel[16].addShapeBox(-33F, -3F, -57F, 28, 2, 2, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftRocket2
		leftWingModel[16].setRotationPoint(0F, -19F, 0F);

		leftWingModel[17].addShapeBox(-22F, -1F, -57.5F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftRocket19
		leftWingModel[17].setRotationPoint(0F, -19F, 0F);

		leftWingModel[18].addShapeBox(-27F, -1F, -57.5F, 3, 3, 3, 0F, 0F, -1.5F, -1.5F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -1.5F, -1.5F); // LeftRocket11
		leftWingModel[18].setRotationPoint(0F, -19F, 0F);

		leftWingModel[19].addShapeBox(-12F, -1F, -57.5F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftRocket22
		leftWingModel[19].setRotationPoint(0F, -19F, 0F);

		leftWingModel[20].addShapeBox(-8F, -1F, -57.5F, 5, 3, 3, 0F, 0F, -.2F, -.2F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -.2F, -.2F); // LeftRocket26
		leftWingModel[20].setRotationPoint(0F, -19F, 0F);

		leftWingModel[21].addShapeBox(-24F, -1F, -57.5F, 16, 3, 3, 0F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // LeftRocket15
		leftWingModel[21].setRotationPoint(0F, -19F, 0F);

		leftWingModel[22].addShapeBox(-9F, -2F, -58F, 4, 1, 4, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, -.5F, 0F, 3.5F, -.5F); // LeftRocket31
		leftWingModel[22].setRotationPoint(0F, -19F, 0F);

		leftWingModel[23].addShapeBox(-9F, -2F, -58F, 4, 1, 4, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 3.5F, -.5F, 0F, 3.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftRocket32
		leftWingModel[23].setRotationPoint(0F, -19F, 0F);

		leftWingModel[24].addShapeBox(-33F, -3F, -53.5F, 28, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftRocket6
		leftWingModel[24].setRotationPoint(0F, -19F, 0F);

		leftWingModel[25].addShapeBox(-33F, -3F, -53F, 28, 2, 2, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftRocket3
		leftWingModel[25].setRotationPoint(0F, -19F, 0F);

		leftWingModel[26].addShapeBox(-22F, -1F, -53.5F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftRocket18
		leftWingModel[26].setRotationPoint(0F, -19F, 0F);

		leftWingModel[27].addShapeBox(-27F, -1F, -53.5F, 3, 3, 3, 0F, 0F, -1.5F, -1.5F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -1.5F, -1.5F); // LeftRocket10
		leftWingModel[27].setRotationPoint(0F, -19F, 0F);

		leftWingModel[28].addShapeBox(-12F, -1F, -53.5F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftRocket23
		leftWingModel[28].setRotationPoint(0F, -19F, 0F);

		leftWingModel[29].addShapeBox(-8F, -1F, -53.5F, 5, 3, 3, 0F, 0F, -.2F, -.2F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -.2F, -.2F); // LeftRocket27
		leftWingModel[29].setRotationPoint(0F, -19F, 0F);

		leftWingModel[30].addShapeBox(-24F, -1F, -53.5F, 16, 3, 3, 0F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // LeftRocket14
		leftWingModel[30].setRotationPoint(0F, -19F, 0F);

		leftWingModel[31].addShapeBox(-9F, -2F, -54F, 4, 1, 4, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, -.5F, 0F, 3.5F, -.5F); // LeftRocket34
		leftWingModel[31].setRotationPoint(0F, -19F, 0F);

		leftWingModel[32].addShapeBox(-9F, -2F, -54F, 4, 1, 4, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 3.5F, -.5F, 0F, 3.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftRocket33
		leftWingModel[32].setRotationPoint(0F, -19F, 0F);

		leftWingModel[33].addShapeBox(-33F, -3F, -49.5F, 28, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftRocket5
		leftWingModel[33].setRotationPoint(0F, -19F, 0F);

		leftWingModel[34].addShapeBox(-33F, -3F, -49F, 28, 2, 2, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftRocket4
		leftWingModel[34].setRotationPoint(0F, -19F, 0F);

		leftWingModel[35].addShapeBox(-22F, -1F, -49.5F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftRocket17
		leftWingModel[35].setRotationPoint(0F, -19F, 0F);

		leftWingModel[36].addShapeBox(-27F, -1F, -49.5F, 3, 3, 3, 0F, 0F, -1.5F, -1.5F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -1.5F, -1.5F); // LeftRocket9
		leftWingModel[36].setRotationPoint(0F, -19F, 0F);

		leftWingModel[37].addShapeBox(-12F, -1F, -49.5F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftRocket24
		leftWingModel[37].setRotationPoint(0F, -19F, 0F);

		leftWingModel[38].addShapeBox(-8F, -1F, -49.5F, 5, 3, 3, 0F, 0F, -.2F, -.2F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -.2F, -.2F); // LeftRocket28
		leftWingModel[38].setRotationPoint(0F, -19F, 0F);

		leftWingModel[39].addShapeBox(-24F, -1F, -49.5F, 16, 3, 3, 0F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // LeftRocket13
		leftWingModel[39].setRotationPoint(0F, -19F, 0F);

		leftWingModel[40].addShapeBox(-9F, -2F, -50F, 4, 1, 4, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, -.5F, 0F, 3.5F, -.5F); // LeftRocket35
		leftWingModel[40].setRotationPoint(0F, -19F, 0F);

		leftWingModel[41].addShapeBox(-9F, -2F, -50F, 4, 1, 4, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 3.5F, -.5F, 0F, 3.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftRocket36
		leftWingModel[41].setRotationPoint(0F, -19F, 0F);


		rightWingModel = new ModelRendererTurbo[42];
		rightWingModel[0] = new ModelRendererTurbo(this, 210, 376, textureX, textureY); // RightWing1
		rightWingModel[1] = new ModelRendererTurbo(this, 340, 409, textureX, textureY); // RightWing2
		rightWingModel[2] = new ModelRendererTurbo(this, 340, 422, textureX, textureY); // RightWing3
		rightWingModel[3] = new ModelRendererTurbo(this, 138, 473, textureX, textureY); // RightWing4
		rightWingModel[4] = new ModelRendererTurbo(this, 138, 503, textureX, textureY); // RightWing5
		rightWingModel[5] = new ModelRendererTurbo(this, 138, 490, textureX, textureY); // RightWing6
		rightWingModel[6] = new ModelRendererTurbo(this, 119, 2, textureX, textureY); // RightRocket1
		rightWingModel[7] = new ModelRendererTurbo(this, 119, 8, textureX, textureY); // RightRocket5
		rightWingModel[8] = new ModelRendererTurbo(this, 119, 2, textureX, textureY); // RightRocket2
		rightWingModel[9] = new ModelRendererTurbo(this, 119, 8, textureX, textureY); // RightRocket6
		rightWingModel[10] = new ModelRendererTurbo(this, 119, 8, textureX, textureY); // RightRocket7
		rightWingModel[11] = new ModelRendererTurbo(this, 119, 2, textureX, textureY); // RightRocket3
		rightWingModel[12] = new ModelRendererTurbo(this, 119, 8, textureX, textureY); // RightRocket8
		rightWingModel[13] = new ModelRendererTurbo(this, 119, 2, textureX, textureY); // RightRocket4
		rightWingModel[14] = new ModelRendererTurbo(this, 119, 24, textureX, textureY); // RightRocket9
		rightWingModel[15] = new ModelRendererTurbo(this, 119, 16, textureX, textureY); // RightRocket13
		rightWingModel[16] = new ModelRendererTurbo(this, 119, 24, textureX, textureY); // RightRocket10
		rightWingModel[17] = new ModelRendererTurbo(this, 119, 16, textureX, textureY); // RightRocket14
		rightWingModel[18] = new ModelRendererTurbo(this, 119, 24, textureX, textureY); // RightRocket11
		rightWingModel[19] = new ModelRendererTurbo(this, 119, 16, textureX, textureY); // RightRocket15
		rightWingModel[20] = new ModelRendererTurbo(this, 119, 24, textureX, textureY); // RightRocket12
		rightWingModel[21] = new ModelRendererTurbo(this, 119, 16, textureX, textureY); // RightRocket16
		rightWingModel[22] = new ModelRendererTurbo(this, 159, 24, textureX, textureY); // RightRocket20
		rightWingModel[23] = new ModelRendererTurbo(this, 159, 24, textureX, textureY); // RightRocket19
		rightWingModel[24] = new ModelRendererTurbo(this, 159, 24, textureX, textureY); // RightRocket18
		rightWingModel[25] = new ModelRendererTurbo(this, 159, 24, textureX, textureY); // RightRocket17
		rightWingModel[26] = new ModelRendererTurbo(this, 159, 24, textureX, textureY); // RightRocket21
		rightWingModel[27] = new ModelRendererTurbo(this, 159, 24, textureX, textureY); // RightRocket22
		rightWingModel[28] = new ModelRendererTurbo(this, 159, 24, textureX, textureY); // RightRocket23
		rightWingModel[29] = new ModelRendererTurbo(this, 159, 24, textureX, textureY); // RightRocket24
		rightWingModel[30] = new ModelRendererTurbo(this, 166, 16, textureX, textureY); // RightRocket30
		rightWingModel[31] = new ModelRendererTurbo(this, 166, 16, textureX, textureY); // RightRocket29
		rightWingModel[32] = new ModelRendererTurbo(this, 166, 16, textureX, textureY); // RightRocket32
		rightWingModel[33] = new ModelRendererTurbo(this, 166, 16, textureX, textureY); // RightRocket31
		rightWingModel[34] = new ModelRendererTurbo(this, 166, 16, textureX, textureY); // RightRocket34
		rightWingModel[35] = new ModelRendererTurbo(this, 166, 16, textureX, textureY); // RightRocket33
		rightWingModel[36] = new ModelRendererTurbo(this, 166, 16, textureX, textureY); // RightRocket36
		rightWingModel[37] = new ModelRendererTurbo(this, 166, 16, textureX, textureY); // RightRocket35
		rightWingModel[38] = new ModelRendererTurbo(this, 134, 24, textureX, textureY); // RightRocket25
		rightWingModel[39] = new ModelRendererTurbo(this, 134, 24, textureX, textureY); // RightRocket26
		rightWingModel[40] = new ModelRendererTurbo(this, 134, 24, textureX, textureY); // RightRocket27
		rightWingModel[41] = new ModelRendererTurbo(this, 134, 24, textureX, textureY); // RightRocket28

		rightWingModel[0].addShapeBox(-46F, -42F, 70F, 25, 3, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // RightWing1
		rightWingModel[0].setRotationPoint(0F, -19F, 0F);

		rightWingModel[1].addShapeBox(-46F, -44F, 100F, 25, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, .3F, 0F, -3F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -.3F, 0F, -3F, -.3F, 0F); // RightWing2
		rightWingModel[1].setRotationPoint(0F, -19F, 0F);

		rightWingModel[2].addShapeBox(-43F, -44.3F, 105F, 19, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, .3F, 0F, -5F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -.3F, 0F, -5F, -.3F, 0F); // RightWing3
		rightWingModel[2].setRotationPoint(0F, -19F, 0F);

		rightWingModel[3].addShapeBox(-36F, -6F, 62F, 35, 3, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWing4
		rightWingModel[3].setRotationPoint(0F, -19F, 0F);

		rightWingModel[4].addShapeBox(-33F, -6F, 80F, 28, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -7F, 0F, 0F); // RightWing5
		rightWingModel[4].setRotationPoint(0F, -19F, 0F);

		rightWingModel[5].addShapeBox(-36F, -6F, 74F, 35, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F); // RightWing6
		rightWingModel[5].setRotationPoint(0F, -19F, 0F);

		rightWingModel[6].addShapeBox(-33F, -3F, 59F, 28, 2, 2, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightRocket1
		rightWingModel[6].setRotationPoint(0F, -19F, 0F);

		rightWingModel[7].addShapeBox(-33F, -3F, 58.5F, 28, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightRocket5
		rightWingModel[7].setRotationPoint(0F, -19F, 0F);

		rightWingModel[8].addShapeBox(-33F, -3F, 55F, 28, 2, 2, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightRocket2
		rightWingModel[8].setRotationPoint(0F, -19F, 0F);

		rightWingModel[9].addShapeBox(-33F, -3F, 54.5F, 28, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightRocket6
		rightWingModel[9].setRotationPoint(0F, -19F, 0F);

		rightWingModel[10].addShapeBox(-33F, -3F, 50.5F, 28, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightRocket7
		rightWingModel[10].setRotationPoint(0F, -19F, 0F);

		rightWingModel[11].addShapeBox(-33F, -3F, 51F, 28, 2, 2, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightRocket3
		rightWingModel[11].setRotationPoint(0F, -19F, 0F);

		rightWingModel[12].addShapeBox(-33F, -3F, 46.5F, 28, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightRocket8
		rightWingModel[12].setRotationPoint(0F, -19F, 0F);

		rightWingModel[13].addShapeBox(-33F, -3F, 47F, 28, 2, 2, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightRocket4
		rightWingModel[13].setRotationPoint(0F, -19F, 0F);

		rightWingModel[14].addShapeBox(-27F, -1F, 58.5F, 3, 3, 3, 0F, 0F, -1.5F, -1.5F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -1.5F, -1.5F); // RightRocket9
		rightWingModel[14].setRotationPoint(0F, -19F, 0F);

		rightWingModel[15].addShapeBox(-24F, -1F, 58.5F, 16, 3, 3, 0F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // RightRocket13
		rightWingModel[15].setRotationPoint(0F, -19F, 0F);

		rightWingModel[16].addShapeBox(-27F, -1F, 54.5F, 3, 3, 3, 0F, 0F, -1.5F, -1.5F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -1.5F, -1.5F); // RightRocket10
		rightWingModel[16].setRotationPoint(0F, -19F, 0F);

		rightWingModel[17].addShapeBox(-24F, -1F, 54.5F, 16, 3, 3, 0F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // RightRocket14
		rightWingModel[17].setRotationPoint(0F, -19F, 0F);

		rightWingModel[18].addShapeBox(-27F, -1F, 50.5F, 3, 3, 3, 0F, 0F, -1.5F, -1.5F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -1.5F, -1.5F); // RightRocket11
		rightWingModel[18].setRotationPoint(0F, -19F, 0F);

		rightWingModel[19].addShapeBox(-24F, -1F, 50.5F, 16, 3, 3, 0F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // RightRocket15
		rightWingModel[19].setRotationPoint(0F, -19F, 0F);

		rightWingModel[20].addShapeBox(-27F, -1F, 46.5F, 3, 3, 3, 0F, 0F, -1.5F, -1.5F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -1.5F, -1.5F); // RightRocket12
		rightWingModel[20].setRotationPoint(0F, -19F, 0F);

		rightWingModel[21].addShapeBox(-24F, -1F, 46.5F, 16, 3, 3, 0F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // RightRocket16
		rightWingModel[21].setRotationPoint(0F, -19F, 0F);

		rightWingModel[22].addShapeBox(-22F, -1F, 46.5F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightRocket20
		rightWingModel[22].setRotationPoint(0F, -19F, 0F);

		rightWingModel[23].addShapeBox(-22F, -1F, 50.5F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightRocket19
		rightWingModel[23].setRotationPoint(0F, -19F, 0F);

		rightWingModel[24].addShapeBox(-22F, -1F, 54.5F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightRocket18
		rightWingModel[24].setRotationPoint(0F, -19F, 0F);

		rightWingModel[25].addShapeBox(-22F, -1F, 58.5F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightRocket17
		rightWingModel[25].setRotationPoint(0F, -19F, 0F);

		rightWingModel[26].addShapeBox(-12F, -1F, 58.5F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightRocket21
		rightWingModel[26].setRotationPoint(0F, -19F, 0F);

		rightWingModel[27].addShapeBox(-12F, -1F, 54.5F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightRocket22
		rightWingModel[27].setRotationPoint(0F, -19F, 0F);

		rightWingModel[28].addShapeBox(-12F, -1F, 50.5F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightRocket23
		rightWingModel[28].setRotationPoint(0F, -19F, 0F);

		rightWingModel[29].addShapeBox(-12F, -1F, 46.5F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightRocket24
		rightWingModel[29].setRotationPoint(0F, -19F, 0F);

		rightWingModel[30].addShapeBox(-9F, -2F, 46F, 4, 1, 4, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 3.5F, -.5F, 0F, 3.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // RightRocket30
		rightWingModel[30].setRotationPoint(0F, -19F, 0F);

		rightWingModel[31].addShapeBox(-9F, -2F, 46F, 4, 1, 4, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, -.5F, 0F, 3.5F, -.5F); // RightRocket29
		rightWingModel[31].setRotationPoint(0F, -19F, 0F);

		rightWingModel[32].addShapeBox(-9F, -2F, 50F, 4, 1, 4, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 3.5F, -.5F, 0F, 3.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // RightRocket32
		rightWingModel[32].setRotationPoint(0F, -19F, 0F);

		rightWingModel[33].addShapeBox(-9F, -2F, 50F, 4, 1, 4, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, -.5F, 0F, 3.5F, -.5F); // RightRocket31
		rightWingModel[33].setRotationPoint(0F, -19F, 0F);

		rightWingModel[34].addShapeBox(-9F, -2F, 54F, 4, 1, 4, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 3.5F, -.5F, 0F, 3.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // RightRocket34
		rightWingModel[34].setRotationPoint(0F, -19F, 0F);

		rightWingModel[35].addShapeBox(-9F, -2F, 54F, 4, 1, 4, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, -.5F, 0F, 3.5F, -.5F); // RightRocket33
		rightWingModel[35].setRotationPoint(0F, -19F, 0F);

		rightWingModel[36].addShapeBox(-9F, -2F, 58F, 4, 1, 4, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 3.5F, -.5F, 0F, 3.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // RightRocket36
		rightWingModel[36].setRotationPoint(0F, -19F, 0F);

		rightWingModel[37].addShapeBox(-9F, -2F, 58F, 4, 1, 4, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, -.5F, 0F, 3.5F, -.5F); // RightRocket35
		rightWingModel[37].setRotationPoint(0F, -19F, 0F);

		rightWingModel[38].addShapeBox(-8F, -1F, 58.5F, 5, 3, 3, 0F, 0F, -.2F, -.2F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -.2F, -.2F); // RightRocket25
		rightWingModel[38].setRotationPoint(0F, -19F, 0F);

		rightWingModel[39].addShapeBox(-8F, -1F, 54.5F, 5, 3, 3, 0F, 0F, -.2F, -.2F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -.2F, -.2F); // RightRocket26
		rightWingModel[39].setRotationPoint(0F, -19F, 0F);

		rightWingModel[40].addShapeBox(-8F, -1F, 50.5F, 5, 3, 3, 0F, 0F, -.2F, -.2F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -.2F, -.2F); // RightRocket27
		rightWingModel[40].setRotationPoint(0F, -19F, 0F);

		rightWingModel[41].addShapeBox(-8F, -1F, 46.5F, 5, 3, 3, 0F, 0F, -.2F, -.2F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -.2F, -.2F); // RightRocket28
		rightWingModel[41].setRotationPoint(0F, -19F, 0F);


		yawFlapModel = new ModelRendererTurbo[5];
		yawFlapModel[0] = new ModelRendererTurbo(this, 396, 4, textureX, textureY); // FlapsYaw1
		yawFlapModel[1] = new ModelRendererTurbo(this, 413, 3, textureX, textureY); // FlapsYaw2
		yawFlapModel[2] = new ModelRendererTurbo(this, 431, 3, textureX, textureY); // FlapsYaw3
		yawFlapModel[3] = new ModelRendererTurbo(this, 445, 3, textureX, textureY); // FlapsYaw4
		yawFlapModel[4] = new ModelRendererTurbo(this, 379, 86, textureX, textureY); // Decal2

		yawFlapModel[0].addShapeBox(0F, -24F, -1F, 5, 40, 2, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F); // FlapsYaw1
		yawFlapModel[0].setRotationPoint(59F, -47F, 0F);

		yawFlapModel[1].addShapeBox(5F, -24F, -1F, 5, 40, 2, 0F, 0F, 0F, -.2F, 0F, -6F, -.3F, 0F, -6F, -.3F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, -2F, -.3F, 0F, -2F, -.3F, 0F, 0F, -.2F); // FlapsYaw2
		yawFlapModel[1].setRotationPoint(59F, -47F, 0F);

		yawFlapModel[2].addShapeBox(10F, -18F, -1F, 3, 32, 2, 0F, 0F, 0F, -.3F, 0F, -7F, -.4F, 0F, -7F, -.4F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, -3F, -.4F, 0F, -3F, -.4F, 0F, 0F, -.3F); // FlapsYaw3
		yawFlapModel[2].setRotationPoint(59F, -47F, 0F);

		yawFlapModel[3].addShapeBox(13F, -11F, -1F, 2, 22, 2, 0F, 0F, 0F, -.4F, 0F, -9F, -.5F, 0F, -9F, -.5F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, -4F, -.5F, 0F, -4F, -.5F, 0F, 0F, -.4F); // FlapsYaw4
		yawFlapModel[3].setRotationPoint(59F, -47F, 0F);

		yawFlapModel[4].addShapeBox(-2F, -22F, -1F, 15, 20, 2, 0F, -2F, -2F, .1F, -2F, -2F, .1F, -2F, -2F, .1F, -2F, -2F, .1F, -2F, -2F, .1F, -2F, -2F, .1F, -2F, -2F, .1F, -2F, -2F, .1F); // Decal2
		yawFlapModel[4].setRotationPoint(59F, -47F, 0F);


		pitchFlapLeftModel = new ModelRendererTurbo[3];
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 566, 31, textureX, textureY); // PitchLeft1
		pitchFlapLeftModel[1] = new ModelRendererTurbo(this, 566, 16, textureX, textureY); // PitchLeft2
		pitchFlapLeftModel[2] = new ModelRendererTurbo(this, 587, 28, textureX, textureY); // PitchLeft3

		pitchFlapLeftModel[0].addShapeBox(0F, -1F, -25F, 9, 2, 7, 0F, 0F, 0F, 0F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // PitchLeft1
		pitchFlapLeftModel[0].setRotationPoint(58F, -46.5F, -17F);

		pitchFlapLeftModel[1].addShapeBox(0F, -1F, -18F, 12, 2, 7, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // PitchLeft2
		pitchFlapLeftModel[1].setRotationPoint(58F, -46.5F, -17F);

		pitchFlapLeftModel[2].addShapeBox(0F, -1F, -11F, 12, 2, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F); // PitchLeft3
		pitchFlapLeftModel[2].setRotationPoint(58F, -46.5F, -17F);


		pitchFlapRightModel = new ModelRendererTurbo[3];
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 587, 28, textureX, textureY); // PitchRight1
		pitchFlapRightModel[1] = new ModelRendererTurbo(this, 566, 16, textureX, textureY); // PitchRight2
		pitchFlapRightModel[2] = new ModelRendererTurbo(this, 566, 31, textureX, textureY); // PitchRight3

		pitchFlapRightModel[0].addShapeBox(0F, -1F, -15F, 12, 2, 26, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // PitchRight1
		pitchFlapRightModel[0].setRotationPoint(58F, -46.5F, 17F);

		pitchFlapRightModel[1].addShapeBox(0F, -1F, 11F, 12, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // PitchRight2
		pitchFlapRightModel[1].setRotationPoint(58F, -46.5F, 17F);

		pitchFlapRightModel[2].addShapeBox(0F, -1F, 18F, 9, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, 0F, 0F, 0F); // PitchRight3
		pitchFlapRightModel[2].setRotationPoint(58F, -46.5F, 17F);


		pitchFlapLeftWingModel = new ModelRendererTurbo[2];
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 245, 415, textureX, textureY); // LeftWingPitch1
		pitchFlapLeftWingModel[1] = new ModelRendererTurbo(this, 109, 422, textureX, textureY); // LeftWingPitch2

		pitchFlapLeftWingModel[0].addShapeBox(0F, 0.5F, -11F, 9, 2, 30, 0F, 0F, 2F, 0F, 0F, .5F, -22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -.5F, -22F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWingPitch1
		pitchFlapLeftWingModel[0].setRotationPoint(-21F, -61F, -89F);

		pitchFlapLeftWingModel[1].addShapeBox(0F, 0.5F, -20F, 9, 2, 39, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWingPitch2
		pitchFlapLeftWingModel[1].setRotationPoint(-21F, -59F, -50F);


		pitchFlapRightWingModel = new ModelRendererTurbo[2];
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 109, 422, textureX, textureY); // RightWingPitch1
		pitchFlapRightWingModel[1] = new ModelRendererTurbo(this, 245, 415, textureX, textureY); // RightWingPitch2

		pitchFlapRightWingModel[0].addShapeBox(0F, 0.5F, -19F, 9, 2, 39, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // RightWingPitch1
		pitchFlapRightWingModel[0].setRotationPoint(-21F, -59F, 50F);

		pitchFlapRightWingModel[1].addShapeBox(0F, 0.5F, -19F, 9, 2, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -22F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -22F, 0F, -2F, 0F); // RightWingPitch2
		pitchFlapRightWingModel[1].setRotationPoint(-21F, -61F, 89F);


		bodyWheelModel = new ModelRendererTurbo[20];
		bodyWheelModel[0] = new ModelRendererTurbo(this, 311, 87, textureX, textureY); // WheelCore1
		bodyWheelModel[1] = new ModelRendererTurbo(this, 247, 67, textureX, textureY); // WheelCore10
		bodyWheelModel[2] = new ModelRendererTurbo(this, 247, 49, textureX, textureY); // WheelCore11
		bodyWheelModel[3] = new ModelRendererTurbo(this, 247, 58, textureX, textureY); // WheelCore12
		bodyWheelModel[4] = new ModelRendererTurbo(this, 247, 67, textureX, textureY); // WheelCore13
		bodyWheelModel[5] = new ModelRendererTurbo(this, 277, 73, textureX, textureY); // WheelCore14
		bodyWheelModel[6] = new ModelRendererTurbo(this, 264, 73, textureX, textureY); // WheelCore15
		bodyWheelModel[7] = new ModelRendererTurbo(this, 247, 73, textureX, textureY); // WheelCore16
		bodyWheelModel[8] = new ModelRendererTurbo(this, 291, 73, textureX, textureY); // WheelCore17
		bodyWheelModel[9] = new ModelRendererTurbo(this, 311, 60, textureX, textureY); // WheelCore18
		bodyWheelModel[10] = new ModelRendererTurbo(this, 311, 74, textureX, textureY); // WheelCore19
		bodyWheelModel[11] = new ModelRendererTurbo(this, 311, 74, textureX, textureY); // WheelCore2
		bodyWheelModel[12] = new ModelRendererTurbo(this, 311, 87, textureX, textureY); // WheelCore20
		bodyWheelModel[13] = new ModelRendererTurbo(this, 311, 60, textureX, textureY); // WheelCore3
		bodyWheelModel[14] = new ModelRendererTurbo(this, 291, 73, textureX, textureY); // WheelCore4
		bodyWheelModel[15] = new ModelRendererTurbo(this, 247, 73, textureX, textureY); // WheelCore5
		bodyWheelModel[16] = new ModelRendererTurbo(this, 277, 73, textureX, textureY); // WheelCore6
		bodyWheelModel[17] = new ModelRendererTurbo(this, 264, 73, textureX, textureY); // WheelCore7
		bodyWheelModel[18] = new ModelRendererTurbo(this, 247, 49, textureX, textureY); // WheelCore8
		bodyWheelModel[19] = new ModelRendererTurbo(this, 247, 58, textureX, textureY); // WheelCore9

		bodyWheelModel[0].addShapeBox(-52F, 23F, -18F, 18, 6, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // WheelCore1
		bodyWheelModel[0].setRotationPoint(0F, -19F, 0F);

		bodyWheelModel[1].addShapeBox(-39F, 8F, -4.7F, 11, 1, 2, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, -.2F, 0F, 0F, -.2F); // WheelCore10
		bodyWheelModel[1].setRotationPoint(0F, -19F, 1F);

		bodyWheelModel[2].addShapeBox(-40F, 0F, 6.66133814775094E-16F, 14, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 1F, 1F, 0F, 1F); // WheelCore11
		bodyWheelModel[2].setRotationPoint(0F, -19F, 0F);

		bodyWheelModel[3].addShapeBox(-40F, 5F, 1F, 14, 3, 2, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -.7F, 0F, 0F, -.7F, 0F, 0F, .7F, 0F, 0F, .7F); // WheelCore12
		bodyWheelModel[3].setRotationPoint(0F, -19F, 0F);

		bodyWheelModel[4].addShapeBox(-39F, 8F, 1.7F, 11, 1, 2, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, .2F, 0F, 0F, .2F); // WheelCore13
		bodyWheelModel[4].setRotationPoint(0F, -19F, 0F);

		bodyWheelModel[5].addShapeBox(-44F, 0F, 11F, 2, 19, 2, 0F, -10F, 0F, 10F, 10F, 0F, 10F, 10F, 0F, -10F, -10F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore14
		bodyWheelModel[5].setRotationPoint(0F, -19F, 0F);

		bodyWheelModel[6].addShapeBox(-44F, 0F, 11F, 2, 19, 2, 0F, -3F, 0F, 10F, 3F, 0F, 10F, 3F, 0F, -10F, -3F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore15
		bodyWheelModel[6].setRotationPoint(0F, -19F, 0F);

		bodyWheelModel[7].addShapeBox(-44.5F, -5F, 11F, 3, 24, 3, 0F, -3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore16
		bodyWheelModel[7].setRotationPoint(0F, -19F, 0F);

		bodyWheelModel[8].addShapeBox(-44.5F, 19F, 11F, 3, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore17
		bodyWheelModel[8].setRotationPoint(0F, -19F, 0F);

		bodyWheelModel[9].addShapeBox(-52F, 11F, 15F, 18, 6, 3, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore18
		bodyWheelModel[9].setRotationPoint(0F, -19F, 0F);

		bodyWheelModel[10].addShapeBox(-52F, 17F, 15F, 18, 6, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore19
		bodyWheelModel[10].setRotationPoint(0F, -19F, 0F);

		bodyWheelModel[11].addShapeBox(-52F, 17F, -18F, 18, 6, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore2
		bodyWheelModel[11].setRotationPoint(0F, -19F, 0F);

		bodyWheelModel[12].addShapeBox(-52F, 23F, 15F, 18, 6, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // WheelCore20
		bodyWheelModel[12].setRotationPoint(0F, -19F, 0F);

		bodyWheelModel[13].addShapeBox(-52F, 11F, -18F, 18, 6, 3, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore3
		bodyWheelModel[13].setRotationPoint(0F, -19F, 0F);

		bodyWheelModel[14].addShapeBox(-44.5F, 19F, -15F, 3, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F); // WheelCore4
		bodyWheelModel[14].setRotationPoint(0F, -19F, 0F);

		bodyWheelModel[15].addShapeBox(-44.5F, -5F, -14F, 3, 24, 3, 0F, -3F, 0F, -3F, 3F, 0F, -3F, 3F, 0F, 3F, -3F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore5
		bodyWheelModel[15].setRotationPoint(0F, -19F, 0F);

		bodyWheelModel[16].addShapeBox(-44F, 0F, -13F, 2, 19, 2, 0F, -10F, 0F, -10F, 10F, 0F, -10F, 10F, 0F, 10F, -10F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore6
		bodyWheelModel[16].setRotationPoint(0F, -19F, 0F);

		bodyWheelModel[17].addShapeBox(-44F, 0F, -13F, 2, 19, 2, 0F, -3F, 0F, -10F, 3F, 0F, -10F, 3F, 0F, 10F, -3F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore7
		bodyWheelModel[17].setRotationPoint(0F, -19F, 0F);

		bodyWheelModel[18].addShapeBox(-40F, 0F, -2F, 14, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, -1F, 1F, 0F, -1F); // WheelCore8
		bodyWheelModel[18].setRotationPoint(0F, -19F, 0F);

		bodyWheelModel[19].addShapeBox(-40F, 5F, -3F, 14, 3, 2, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, .7F, 0F, 0F, .7F, 0F, 0F, -.7F, 0F, 0F, -.7F); // WheelCore9
		bodyWheelModel[19].setRotationPoint(0F, -19F, 0F);



		propellerModels = new ModelRendererTurbo[1][2];
		propellerModels[0] = makeProp1(-67F, -33F, 0F);


		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[2];
		prop[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		prop[0].addBox(-0.5F, -26F, -2F, 1, 26, 4, 0.0F);
		prop[1].addBox(-0.5F, -26F, -2F, 1, 26, 4, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		return prop;
	}
}