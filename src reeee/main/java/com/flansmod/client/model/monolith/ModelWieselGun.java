//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelWieselGun extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelWieselGun() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[203];
		bodyModel[0] = new ModelRendererTurbo(this, 9, 195, textureX, textureY); // Core1
		bodyModel[1] = new ModelRendererTurbo(this, 3, 199, textureX, textureY); // Core10
		bodyModel[2] = new ModelRendererTurbo(this, 111, 171, textureX, textureY); // Core100
		bodyModel[3] = new ModelRendererTurbo(this, 76, 144, textureX, textureY); // Core101
		bodyModel[4] = new ModelRendererTurbo(this, 88, 141, textureX, textureY); // Core102
		bodyModel[5] = new ModelRendererTurbo(this, 113, 165, textureX, textureY); // Core103
		bodyModel[6] = new ModelRendererTurbo(this, 113, 165, textureX, textureY); // Core104
		bodyModel[7] = new ModelRendererTurbo(this, 88, 141, textureX, textureY); // Core105
		bodyModel[8] = new ModelRendererTurbo(this, 88, 141, textureX, textureY); // Core106
		bodyModel[9] = new ModelRendererTurbo(this, 113, 165, textureX, textureY); // Core107
		bodyModel[10] = new ModelRendererTurbo(this, 111, 171, textureX, textureY); // Core108
		bodyModel[11] = new ModelRendererTurbo(this, 127, 165, textureX, textureY); // Core109
		bodyModel[12] = new ModelRendererTurbo(this, 3, 199, textureX, textureY); // Core11
		bodyModel[13] = new ModelRendererTurbo(this, 113, 165, textureX, textureY); // Core110
		bodyModel[14] = new ModelRendererTurbo(this, 127, 173, textureX, textureY); // Core111
		bodyModel[15] = new ModelRendererTurbo(this, 7, 154, textureX, textureY); // Core112
		bodyModel[16] = new ModelRendererTurbo(this, 127, 158, textureX, textureY); // Core113
		bodyModel[17] = new ModelRendererTurbo(this, 140, 173, textureX, textureY); // Core114
		bodyModel[18] = new ModelRendererTurbo(this, 7, 172, textureX, textureY); // Core115
		bodyModel[19] = new ModelRendererTurbo(this, 7, 164, textureX, textureY); // Core116
		bodyModel[20] = new ModelRendererTurbo(this, 140, 173, textureX, textureY); // Core117
		bodyModel[21] = new ModelRendererTurbo(this, 11, 197, textureX, textureY); // Core118
		bodyModel[22] = new ModelRendererTurbo(this, 122, 148, textureX, textureY); // Core119
		bodyModel[23] = new ModelRendererTurbo(this, 11, 197, textureX, textureY); // Core12
		bodyModel[24] = new ModelRendererTurbo(this, 140, 173, textureX, textureY); // Core120
		bodyModel[25] = new ModelRendererTurbo(this, 90, 183, textureX, textureY); // Core121
		bodyModel[26] = new ModelRendererTurbo(this, 137, 166, textureX, textureY); // Core122
		bodyModel[27] = new ModelRendererTurbo(this, 97, 183, textureX, textureY); // Core123
		bodyModel[28] = new ModelRendererTurbo(this, 137, 166, textureX, textureY); // Core124
		bodyModel[29] = new ModelRendererTurbo(this, 97, 183, textureX, textureY); // Core125
		bodyModel[30] = new ModelRendererTurbo(this, 144, 157, textureX, textureY); // Core126
		bodyModel[31] = new ModelRendererTurbo(this, 144, 157, textureX, textureY); // Core127
		bodyModel[32] = new ModelRendererTurbo(this, 97, 183, textureX, textureY); // Core128
		bodyModel[33] = new ModelRendererTurbo(this, 137, 166, textureX, textureY); // Core129
		bodyModel[34] = new ModelRendererTurbo(this, 3, 118, textureX, textureY); // Core13
		bodyModel[35] = new ModelRendererTurbo(this, 35, 144, textureX, textureY); // Core130
		bodyModel[36] = new ModelRendererTurbo(this, 35, 144, textureX, textureY); // Core131
		bodyModel[37] = new ModelRendererTurbo(this, 137, 166, textureX, textureY); // Core132
		bodyModel[38] = new ModelRendererTurbo(this, 35, 144, textureX, textureY); // Core133
		bodyModel[39] = new ModelRendererTurbo(this, 127, 158, textureX, textureY); // Core134
		bodyModel[40] = new ModelRendererTurbo(this, 38, 140, textureX, textureY); // Core135
		bodyModel[41] = new ModelRendererTurbo(this, 127, 165, textureX, textureY); // Core136
		bodyModel[42] = new ModelRendererTurbo(this, 127, 173, textureX, textureY); // Core137
		bodyModel[43] = new ModelRendererTurbo(this, 38, 140, textureX, textureY); // Core138
		bodyModel[44] = new ModelRendererTurbo(this, 181, 172, textureX, textureY); // Core139
		bodyModel[45] = new ModelRendererTurbo(this, 11, 197, textureX, textureY); // Core14
		bodyModel[46] = new ModelRendererTurbo(this, 113, 137, textureX, textureY); // Core140
		bodyModel[47] = new ModelRendererTurbo(this, 3, 118, textureX, textureY); // Core141
		bodyModel[48] = new ModelRendererTurbo(this, 140, 173, textureX, textureY); // Core142
		bodyModel[49] = new ModelRendererTurbo(this, 140, 173, textureX, textureY); // Core143
		bodyModel[50] = new ModelRendererTurbo(this, 140, 173, textureX, textureY); // Core144
		bodyModel[51] = new ModelRendererTurbo(this, 170, 138, textureX, textureY); // Core145
		bodyModel[52] = new ModelRendererTurbo(this, 181, 138, textureX, textureY); // Core146
		bodyModel[53] = new ModelRendererTurbo(this, 145, 171, textureX, textureY); // Core147
		bodyModel[54] = new ModelRendererTurbo(this, 161, 189, textureX, textureY); // Core148
		bodyModel[55] = new ModelRendererTurbo(this, 159, 174, textureX, textureY); // Core149
		bodyModel[56] = new ModelRendererTurbo(this, 23, 209, textureX, textureY); // Core15
		bodyModel[57] = new ModelRendererTurbo(this, 168, 167, textureX, textureY); // Core150
		bodyModel[58] = new ModelRendererTurbo(this, 175, 189, textureX, textureY); // Core151
		bodyModel[59] = new ModelRendererTurbo(this, 168, 160, textureX, textureY); // Core152
		bodyModel[60] = new ModelRendererTurbo(this, 171, 189, textureX, textureY); // Core153
		bodyModel[61] = new ModelRendererTurbo(this, 178, 189, textureX, textureY); // Core154
		bodyModel[62] = new ModelRendererTurbo(this, 168, 177, textureX, textureY); // Core155
		bodyModel[63] = new ModelRendererTurbo(this, 178, 189, textureX, textureY); // Core156
		bodyModel[64] = new ModelRendererTurbo(this, 171, 189, textureX, textureY); // Core157
		bodyModel[65] = new ModelRendererTurbo(this, 113, 148, textureX, textureY); // Core158
		bodyModel[66] = new ModelRendererTurbo(this, 181, 166, textureX, textureY); // Core159
		bodyModel[67] = new ModelRendererTurbo(this, 11, 197, textureX, textureY); // Core16
		bodyModel[68] = new ModelRendererTurbo(this, 23, 203, textureX, textureY); // Core160
		bodyModel[69] = new ModelRendererTurbo(this, 3, 128, textureX, textureY); // Core161
		bodyModel[70] = new ModelRendererTurbo(this, 181, 161, textureX, textureY); // Core162
		bodyModel[71] = new ModelRendererTurbo(this, 23, 203, textureX, textureY); // Core163
		bodyModel[72] = new ModelRendererTurbo(this, 181, 166, textureX, textureY); // Core164
		bodyModel[73] = new ModelRendererTurbo(this, 25, 125, textureX, textureY); // Core165
		bodyModel[74] = new ModelRendererTurbo(this, 145, 149, textureX, textureY); // Core166
		bodyModel[75] = new ModelRendererTurbo(this, 135, 149, textureX, textureY); // Core167
		bodyModel[76] = new ModelRendererTurbo(this, 170, 149, textureX, textureY); // Core168
		bodyModel[77] = new ModelRendererTurbo(this, 145, 149, textureX, textureY); // Core169
		bodyModel[78] = new ModelRendererTurbo(this, 11, 197, textureX, textureY); // Core17
		bodyModel[79] = new ModelRendererTurbo(this, 135, 149, textureX, textureY); // Core170
		bodyModel[80] = new ModelRendererTurbo(this, 170, 149, textureX, textureY); // Core171
		bodyModel[81] = new ModelRendererTurbo(this, 23, 209, textureX, textureY); // Core172
		bodyModel[82] = new ModelRendererTurbo(this, 145, 131, textureX, textureY); // Core173
		bodyModel[83] = new ModelRendererTurbo(this, 154, 137, textureX, textureY); // Core174
		bodyModel[84] = new ModelRendererTurbo(this, 5, 99, textureX, textureY); // Core175
		bodyModel[85] = new ModelRendererTurbo(this, 5, 99, textureX, textureY); // Core176
		bodyModel[86] = new ModelRendererTurbo(this, 5, 99, textureX, textureY); // Core177
		bodyModel[87] = new ModelRendererTurbo(this, 5, 99, textureX, textureY); // Core178
		bodyModel[88] = new ModelRendererTurbo(this, 5, 99, textureX, textureY); // Core178
		bodyModel[89] = new ModelRendererTurbo(this, 111, 171, textureX, textureY); // Core179
		bodyModel[90] = new ModelRendererTurbo(this, 11, 197, textureX, textureY); // Core18
		bodyModel[91] = new ModelRendererTurbo(this, 5, 99, textureX, textureY); // Core180
		bodyModel[92] = new ModelRendererTurbo(this, 3, 80, textureX, textureY); // Core181
		bodyModel[93] = new ModelRendererTurbo(this, 3, 80, textureX, textureY); // Core182
		bodyModel[94] = new ModelRendererTurbo(this, 3, 80, textureX, textureY); // Core183
		bodyModel[95] = new ModelRendererTurbo(this, 3, 80, textureX, textureY); // Core184
		bodyModel[96] = new ModelRendererTurbo(this, 5, 99, textureX, textureY); // Core185
		bodyModel[97] = new ModelRendererTurbo(this, 19, 106, textureX, textureY); // Core186
		bodyModel[98] = new ModelRendererTurbo(this, 5, 99, textureX, textureY); // Core187
		bodyModel[99] = new ModelRendererTurbo(this, 19, 106, textureX, textureY); // Core188
		bodyModel[100] = new ModelRendererTurbo(this, 5, 99, textureX, textureY); // Core189
		bodyModel[101] = new ModelRendererTurbo(this, 11, 197, textureX, textureY); // Core19
		bodyModel[102] = new ModelRendererTurbo(this, 19, 106, textureX, textureY); // Core190
		bodyModel[103] = new ModelRendererTurbo(this, 5, 99, textureX, textureY); // Core191
		bodyModel[104] = new ModelRendererTurbo(this, 19, 106, textureX, textureY); // Core192
		bodyModel[105] = new ModelRendererTurbo(this, 19, 106, textureX, textureY); // Core193
		bodyModel[106] = new ModelRendererTurbo(this, 5, 99, textureX, textureY); // Core195
		bodyModel[107] = new ModelRendererTurbo(this, 5, 99, textureX, textureY); // Core196
		bodyModel[108] = new ModelRendererTurbo(this, 19, 106, textureX, textureY); // Core197
		bodyModel[109] = new ModelRendererTurbo(this, 137, 71, textureX, textureY); // Core198
		bodyModel[110] = new ModelRendererTurbo(this, 137, 71, textureX, textureY); // Core199
		bodyModel[111] = new ModelRendererTurbo(this, 9, 201, textureX, textureY); // Core2
		bodyModel[112] = new ModelRendererTurbo(this, 11, 197, textureX, textureY); // Core20
		bodyModel[113] = new ModelRendererTurbo(this, 137, 64, textureX, textureY); // Core200
		bodyModel[114] = new ModelRendererTurbo(this, 136, 59, textureX, textureY); // Core201
		bodyModel[115] = new ModelRendererTurbo(this, 149, 65, textureX, textureY); // Core203
		bodyModel[116] = new ModelRendererTurbo(this, 137, 64, textureX, textureY); // Core204
		bodyModel[117] = new ModelRendererTurbo(this, 136, 59, textureX, textureY); // Core205
		bodyModel[118] = new ModelRendererTurbo(this, 149, 65, textureX, textureY); // Core206
		bodyModel[119] = new ModelRendererTurbo(this, 23, 209, textureX, textureY); // Core21
		bodyModel[120] = new ModelRendererTurbo(this, 3, 128, textureX, textureY); // Core22
		bodyModel[121] = new ModelRendererTurbo(this, 145, 171, textureX, textureY); // Core23
		bodyModel[122] = new ModelRendererTurbo(this, 25, 125, textureX, textureY); // Core24
		bodyModel[123] = new ModelRendererTurbo(this, 168, 160, textureX, textureY); // Core25
		bodyModel[124] = new ModelRendererTurbo(this, 181, 166, textureX, textureY); // Core26
		bodyModel[125] = new ModelRendererTurbo(this, 23, 203, textureX, textureY); // Core27
		bodyModel[126] = new ModelRendererTurbo(this, 18, 182, textureX, textureY); // Core28
		bodyModel[127] = new ModelRendererTurbo(this, 11, 197, textureX, textureY); // Core29
		bodyModel[128] = new ModelRendererTurbo(this, 9, 201, textureX, textureY); // Core3
		bodyModel[129] = new ModelRendererTurbo(this, 18, 182, textureX, textureY); // Core30
		bodyModel[130] = new ModelRendererTurbo(this, 181, 177, textureX, textureY); // Core31
		bodyModel[131] = new ModelRendererTurbo(this, 181, 177, textureX, textureY); // Core32
		bodyModel[132] = new ModelRendererTurbo(this, 11, 197, textureX, textureY); // Core33
		bodyModel[133] = new ModelRendererTurbo(this, 75, 172, textureX, textureY); // Core34
		bodyModel[134] = new ModelRendererTurbo(this, 181, 172, textureX, textureY); // Core35
		bodyModel[135] = new ModelRendererTurbo(this, 75, 162, textureX, textureY); // Core36
		bodyModel[136] = new ModelRendererTurbo(this, 11, 197, textureX, textureY); // Core37
		bodyModel[137] = new ModelRendererTurbo(this, 113, 165, textureX, textureY); // Core38
		bodyModel[138] = new ModelRendererTurbo(this, 11, 197, textureX, textureY); // Core39
		bodyModel[139] = new ModelRendererTurbo(this, 3, 199, textureX, textureY); // Core4
		bodyModel[140] = new ModelRendererTurbo(this, 181, 166, textureX, textureY); // Core40
		bodyModel[141] = new ModelRendererTurbo(this, 111, 171, textureX, textureY); // Core41
		bodyModel[142] = new ModelRendererTurbo(this, 181, 166, textureX, textureY); // Core42
		bodyModel[143] = new ModelRendererTurbo(this, 113, 165, textureX, textureY); // Core43
		bodyModel[144] = new ModelRendererTurbo(this, 181, 166, textureX, textureY); // Core44
		bodyModel[145] = new ModelRendererTurbo(this, 181, 161, textureX, textureY); // Core45
		bodyModel[146] = new ModelRendererTurbo(this, 113, 165, textureX, textureY); // Core46
		bodyModel[147] = new ModelRendererTurbo(this, 113, 165, textureX, textureY); // Core47
		bodyModel[148] = new ModelRendererTurbo(this, 3, 142, textureX, textureY); // Core48
		bodyModel[149] = new ModelRendererTurbo(this, 111, 171, textureX, textureY); // Core49
		bodyModel[150] = new ModelRendererTurbo(this, 3, 199, textureX, textureY); // Core5
		bodyModel[151] = new ModelRendererTurbo(this, 3, 142, textureX, textureY); // Core50
		bodyModel[152] = new ModelRendererTurbo(this, 159, 174, textureX, textureY); // Core51
		bodyModel[153] = new ModelRendererTurbo(this, 113, 137, textureX, textureY); // Core52
		bodyModel[154] = new ModelRendererTurbo(this, 3, 142, textureX, textureY); // Core53
		bodyModel[155] = new ModelRendererTurbo(this, 115, 160, textureX, textureY); // Core54
		bodyModel[156] = new ModelRendererTurbo(this, 27, 142, textureX, textureY); // Core55
		bodyModel[157] = new ModelRendererTurbo(this, 115, 160, textureX, textureY); // Core56
		bodyModel[158] = new ModelRendererTurbo(this, 27, 142, textureX, textureY); // Core57
		bodyModel[159] = new ModelRendererTurbo(this, 115, 160, textureX, textureY); // Core58
		bodyModel[160] = new ModelRendererTurbo(this, 115, 160, textureX, textureY); // Core59
		bodyModel[161] = new ModelRendererTurbo(this, 3, 199, textureX, textureY); // Core6
		bodyModel[162] = new ModelRendererTurbo(this, 27, 142, textureX, textureY); // Core60
		bodyModel[163] = new ModelRendererTurbo(this, 115, 160, textureX, textureY); // Core61
		bodyModel[164] = new ModelRendererTurbo(this, 44, 181, textureX, textureY); // Core62
		bodyModel[165] = new ModelRendererTurbo(this, 115, 160, textureX, textureY); // Core63
		bodyModel[166] = new ModelRendererTurbo(this, 55, 181, textureX, textureY); // Core64
		bodyModel[167] = new ModelRendererTurbo(this, 109, 187, textureX, textureY); // Core65
		bodyModel[168] = new ModelRendererTurbo(this, 115, 160, textureX, textureY); // Core66
		bodyModel[169] = new ModelRendererTurbo(this, 109, 180, textureX, textureY); // Core67
		bodyModel[170] = new ModelRendererTurbo(this, 115, 160, textureX, textureY); // Core68
		bodyModel[171] = new ModelRendererTurbo(this, 109, 187, textureX, textureY); // Core69
		bodyModel[172] = new ModelRendererTurbo(this, 3, 199, textureX, textureY); // Core7
		bodyModel[173] = new ModelRendererTurbo(this, 115, 160, textureX, textureY); // Core70
		bodyModel[174] = new ModelRendererTurbo(this, 115, 160, textureX, textureY); // Core71
		bodyModel[175] = new ModelRendererTurbo(this, 109, 180, textureX, textureY); // Core72
		bodyModel[176] = new ModelRendererTurbo(this, 113, 148, textureX, textureY); // Core73
		bodyModel[177] = new ModelRendererTurbo(this, 168, 177, textureX, textureY); // Core74
		bodyModel[178] = new ModelRendererTurbo(this, 109, 180, textureX, textureY); // Core75
		bodyModel[179] = new ModelRendererTurbo(this, 113, 165, textureX, textureY); // Core76
		bodyModel[180] = new ModelRendererTurbo(this, 111, 171, textureX, textureY); // Core77
		bodyModel[181] = new ModelRendererTurbo(this, 109, 180, textureX, textureY); // Core78
		bodyModel[182] = new ModelRendererTurbo(this, 113, 165, textureX, textureY); // Core79
		bodyModel[183] = new ModelRendererTurbo(this, 109, 180, textureX, textureY); // Core80
		bodyModel[184] = new ModelRendererTurbo(this, 109, 180, textureX, textureY); // Core81
		bodyModel[185] = new ModelRendererTurbo(this, 64, 139, textureX, textureY); // Core82
		bodyModel[186] = new ModelRendererTurbo(this, 64, 139, textureX, textureY); // Core83
		bodyModel[187] = new ModelRendererTurbo(this, 109, 180, textureX, textureY); // Core84
		bodyModel[188] = new ModelRendererTurbo(this, 109, 180, textureX, textureY); // Core85
		bodyModel[189] = new ModelRendererTurbo(this, 64, 139, textureX, textureY); // Core86
		bodyModel[190] = new ModelRendererTurbo(this, 109, 180, textureX, textureY); // Core87
		bodyModel[191] = new ModelRendererTurbo(this, 76, 144, textureX, textureY); // Core88
		bodyModel[192] = new ModelRendererTurbo(this, 62, 140, textureX, textureY); // Core89
		bodyModel[193] = new ModelRendererTurbo(this, 3, 199, textureX, textureY); // Core9
		bodyModel[194] = new ModelRendererTurbo(this, 109, 180, textureX, textureY); // Core90
		bodyModel[195] = new ModelRendererTurbo(this, 113, 165, textureX, textureY); // Core91
		bodyModel[196] = new ModelRendererTurbo(this, 62, 140, textureX, textureY); // Core92
		bodyModel[197] = new ModelRendererTurbo(this, 113, 165, textureX, textureY); // Core93
		bodyModel[198] = new ModelRendererTurbo(this, 76, 144, textureX, textureY); // Core94
		bodyModel[199] = new ModelRendererTurbo(this, 11, 197, textureX, textureY); // Core95
		bodyModel[200] = new ModelRendererTurbo(this, 122, 148, textureX, textureY); // Core96
		bodyModel[201] = new ModelRendererTurbo(this, 168, 167, textureX, textureY); // Core97
		bodyModel[202] = new ModelRendererTurbo(this, 62, 140, textureX, textureY); // Core99

		bodyModel[0].addShapeBox(-6F, 0F, -15F, 50, 2, 30, 0F, 2F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core1
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-12F, -16F, -15F, 37, 8, 30, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core10
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(25.2F, -16F, 19F, 3, 3, 1, 0F, -.8F, -.8F, -.3F, -.8F, -.8F, -.3F, -.8F, -.8F, -.3F, -.8F, -.8F, -.3F, -.8F, -.8F, -.3F, -.8F, -.8F, -.3F, -.8F, -.8F, -.3F, -.8F, -.8F, -.3F); // Core100
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addBox(18F, -21.5F, -22.5F, 1, 1, 4, 0F); // Core101
		bodyModel[3].setRotationPoint(0F, 0F, 0F);
		bodyModel[3].rotateAngleY = 0.78539816F;

		bodyModel[4].addBox(11F, -21.7F, -15.5F, 1, 2, 3, 0F); // Core102
		bodyModel[4].setRotationPoint(0F, 0F, 0F);
		bodyModel[4].rotateAngleY = 0.78539816F;

		bodyModel[5].addShapeBox(27.1F, -15.5F, 18F, 1, 1, 2, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F); // Core103
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(25.3F, -15.5F, 18F, 1, 1, 2, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F); // Core104
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addBox(13F, -21.7F, -15.5F, 1, 2, 3, 0F); // Core105
		bodyModel[7].setRotationPoint(0F, 0F, 0F);
		bodyModel[7].rotateAngleY = 0.78539816F;

		bodyModel[8].addBox(12F, -22F, -14F, 1, 2, 2, 0F); // Core106
		bodyModel[8].setRotationPoint(0F, 0F, 0F);
		bodyModel[8].rotateAngleY = 0.78539816F;

		bodyModel[9].addShapeBox(-8.9F, -15.5F, 18F, 1, 1, 2, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F); // Core107
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-10.8F, -16F, 19F, 3, 3, 1, 0F, -.8F, -.8F, -.3F, -.8F, -.8F, -.3F, -.8F, -.8F, -.3F, -.8F, -.8F, -.3F, -.8F, -.8F, -.3F, -.8F, -.8F, -.3F, -.8F, -.8F, -.3F, -.8F, -.8F, -.3F); // Core108
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(48F, -14F, -16.5F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F); // Core109
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-12F, -18F, -15F, 27, 2, 30, 0F, 0F, 0F, 3F, .5F, 0F, 3F, .5F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F); // Core11
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-10.7F, -15.5F, 18F, 1, 1, 2, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F); // Core110
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(48F, -13F, -16.5F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -.2F, -1F, 0F, -.2F, -1F, 0F, 0F, -1F); // Core111
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(16F, -13F, 16F, 18, 2, 5, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core112
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(48F, -15F, -16.5F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, -.2F, -1F, 0F, -.2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F); // Core113
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(46F, -15F, -16.5F, 2, 1, 3, 0F, 0F, -.3F, -1.3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -.3F, -1.3F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F); // Core114
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addBox(-12F, -13F, 16F, 28, 2, 5, 0F); // Core115
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-12F, -14F, 16F, 28, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core116
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(46F, -14F, -16.5F, 2, 1, 3, 0F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F); // Core117
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addBox(-11F, -10F, -20F, 1, 4, 5, 0F); // Core118
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addBox(-11.5F, -7.3F, -16.5F, 1, 1, 1, 0F); // Core119
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addBox(-12F, -11F, 15F, 64, 1, 6, 0F); // Core12
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(46F, -13F, -16.5F, 2, 1, 3, 0F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, -.3F, -1.3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -.3F, -1.3F); // Core120
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(47.5F, -12.5F, 18F, 1, 2, 1, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F); // Core121
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(47F, -15.7F, -16F, 1, 1, 2, 0F, 0F, -.1F, -.2F, 0F, -.1F, -.2F, 0F, -.1F, -.2F, 0F, -.1F, -.2F, 0F, -.1F, -.2F, 0F, -.1F, -.2F, 0F, -.1F, -.2F, 0F, -.1F, -.2F); // Core122
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(47.7F, -12.8F, 17.5F, 1, 1, 2, 0F, -.4F, -.2F, -.3F, -.4F, -.2F, -.3F, -.4F, -.2F, -.3F, -.4F, -.2F, -.3F, -.4F, -.2F, -.3F, -.4F, -.2F, -.3F, -.4F, -.2F, -.3F, -.4F, -.2F, -.3F); // Core123
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(48F, -15.7F, -16F, 1, 1, 2, 0F, 0F, -.1F, -.2F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, -.1F, -.2F, 0F, -.1F, -.2F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, -.1F, -.2F); // Core124
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(47.7F, -13.3F, 17.5F, 1, 1, 2, 0F, -.4F, -.3F, -.7F, -.4F, -.3F, -.7F, -.4F, -.3F, -.7F, -.4F, -.3F, -.7F, -.4F, -.3F, -.3F, -.4F, -.3F, -.3F, -.4F, -.3F, -.3F, -.4F, -.3F, -.3F); // Core125
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addBox(42F, -24F, -15F, 1, 5, 1, 0F); // Core126
		bodyModel[30].setRotationPoint(0F, 0F, 0F);
		bodyModel[30].rotateAngleZ = -0.19198622F;

		bodyModel[31].addBox(42F, -24F, 14F, 1, 5, 1, 0F); // Core127
		bodyModel[31].setRotationPoint(0F, 0F, 0F);
		bodyModel[31].rotateAngleZ = -0.19198622F;

		bodyModel[32].addShapeBox(47.7F, -12.3F, 17.5F, 1, 1, 2, 0F, -.4F, -.3F, -.3F, -.4F, -.3F, -.3F, -.4F, -.3F, -.3F, -.4F, -.3F, -.3F, -.4F, -.3F, -.7F, -.4F, -.3F, -.7F, -.4F, -.3F, -.7F, -.4F, -.3F, -.7F); // Core128
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(47F, -15.7F, 14F, 1, 1, 2, 0F, 0F, -.1F, -.2F, 0F, -.1F, -.2F, 0F, -.1F, -.2F, 0F, -.1F, -.2F, 0F, -.1F, -.2F, 0F, -.1F, -.2F, 0F, -.1F, -.2F, 0F, -.1F, -.2F); // Core129
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addBox(-10F, -10F, 15F, 62, 3, 1, 0F); // Core13
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addBox(28F, -30.4F, -5F, 2, 1, 4, 0F); // Core130
		bodyModel[35].setRotationPoint(0F, 0F, 0F);
		bodyModel[35].rotateAngleX = -0.50614548F;
		bodyModel[35].rotateAngleZ = -0.34906585F;

		bodyModel[36].addShapeBox(27F, -30.4F, -5F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Core131
		bodyModel[36].setRotationPoint(0F, 0F, 0F);
		bodyModel[36].rotateAngleX = -0.50614548F;
		bodyModel[36].rotateAngleZ = -0.34906585F;

		bodyModel[37].addShapeBox(48F, -15.7F, 14F, 1, 1, 2, 0F, 0F, -.1F, -.2F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, -.1F, -.2F, 0F, -.1F, -.2F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, -.1F, -.2F); // Core132
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(30F, -30.4F, -5F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Core133
		bodyModel[38].setRotationPoint(0F, 0F, 0F);
		bodyModel[38].rotateAngleX = -0.50614548F;
		bodyModel[38].rotateAngleZ = -0.34906585F;

		bodyModel[39].addShapeBox(48F, -15F, 13.5F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, -.2F, -1F, 0F, -.2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F); // Core134
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(26F, -30.5F, -4.4F, 2, 1, 1, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F); // Core135
		bodyModel[40].setRotationPoint(0F, 0F, 0F);
		bodyModel[40].rotateAngleX = -0.50614548F;
		bodyModel[40].rotateAngleZ = -0.34906585F;

		bodyModel[41].addShapeBox(48F, -14F, 13.5F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F); // Core136
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(48F, -13F, 13.5F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -.2F, -1F, 0F, -.2F, -1F, 0F, 0F, -1F); // Core137
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(26F, -30.5F, -2.7F, 2, 1, 1, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F); // Core138
		bodyModel[43].setRotationPoint(0F, 0F, 0F);
		bodyModel[43].rotateAngleX = -0.50614548F;
		bodyModel[43].rotateAngleZ = -0.34906585F;

		bodyModel[44].addBox(49.5F, -12F, -20F, 1, 1, 1, 0F); // Core139
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(29F, -44.55F, 15F, 3, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core14
		bodyModel[45].setRotationPoint(0F, 0F, 0F);
		bodyModel[45].rotateAngleZ = -0.78539816F;

		bodyModel[46].addBox(-12F, -9.7F, -19.5F, 1, 2, 4, 0F); // Core140
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addBox(-10F, -10F, -16F, 62, 3, 1, 0F); // Core141
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(46F, -15F, 13.5F, 2, 1, 3, 0F, 0F, -.3F, -1.3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -.3F, -1.3F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F); // Core142
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(46F, -14F, 13.5F, 2, 1, 3, 0F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F); // Core143
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(46F, -13F, 13.5F, 2, 1, 3, 0F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, -.3F, -1.3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -.3F, -1.3F); // Core144
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addBox(-7F, -17F, 1F, 2, 2, 2, 0F); // Core145
		bodyModel[51].setRotationPoint(0F, 0F, 0F);
		bodyModel[51].rotateAngleZ = 0.66322512F;

		bodyModel[52].addShapeBox(-7F, -17F, -1.5F, 2, 2, 2, 0F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F); // Core146
		bodyModel[52].setRotationPoint(0F, 0F, 0F);
		bodyModel[52].rotateAngleZ = 0.66322512F;

		bodyModel[53].addShapeBox(48F, -15.5F, -7F, 1, 1, 9, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F); // Core147
		bodyModel[53].setRotationPoint(0F, 0F, 0F);
		bodyModel[53].rotateAngleY = -0.34906585F;

		bodyModel[54].addShapeBox(-5F, -20F, -9.5F, 1, 1, 2, 0F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F); // Core148
		bodyModel[54].setRotationPoint(0F, 0F, 0F);
		bodyModel[54].rotateAngleZ = 0.66322512F;

		bodyModel[55].addBox(47.8F, -16F, -7F, 1, 2, 1, 0F); // Core149
		bodyModel[55].setRotationPoint(0F, 0F, 0F);
		bodyModel[55].rotateAngleY = -0.34906585F;

		bodyModel[56].addShapeBox(52F, -10F, 15F, 0, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -1.5F, 0F, 1.5F, -1.5F, 0F, 0F, 0F, 0F); // Core15
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addBox(46.8F, -16.5F, -8F, 1, 3, 3, 0F); // Core150
		bodyModel[57].setRotationPoint(0F, 0F, 0F);
		bodyModel[57].rotateAngleY = -0.34906585F;

		bodyModel[58].addShapeBox(-16.5F, -12.5F, -13.5F, 1, 2, 10, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Core151
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addShapeBox(46.8F, -17.5F, -8F, 1, 1, 3, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core152
		bodyModel[59].setRotationPoint(0F, 0F, 0F);
		bodyModel[59].rotateAngleY = -0.34906585F;

		bodyModel[60].addShapeBox(-16.2F, -11.5F, -11.5F, 1, 2, 1, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Core153
		bodyModel[60].setRotationPoint(0F, 0F, 0F);

		bodyModel[61].addShapeBox(-16.6F, -10.5F, -11.5F, 1, 1, 1, 0F, -.3F, -.2F, -.2F, -.3F, -.2F, -.2F, -.3F, -.2F, -.2F, -.3F, -.2F, -.2F, -.3F, -.2F, -.2F, -.3F, -.2F, -.2F, -.3F, -.2F, -.2F, -.3F, -.2F, -.2F); // Core154
		bodyModel[61].setRotationPoint(0F, 0F, 0F);

		bodyModel[62].addShapeBox(46.8F, -13.5F, -8F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Core155
		bodyModel[62].setRotationPoint(0F, 0F, 0F);
		bodyModel[62].rotateAngleY = -0.34906585F;

		bodyModel[63].addShapeBox(-16.6F, -10.5F, -6.5F, 1, 1, 1, 0F, -.3F, -.2F, -.2F, -.3F, -.2F, -.2F, -.3F, -.2F, -.2F, -.3F, -.2F, -.2F, -.3F, -.2F, -.2F, -.3F, -.2F, -.2F, -.3F, -.2F, -.2F, -.3F, -.2F, -.2F); // Core156
		bodyModel[63].setRotationPoint(0F, 0F, 0F);

		bodyModel[64].addShapeBox(-16.2F, -11.5F, -6.5F, 1, 2, 1, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Core157
		bodyModel[64].setRotationPoint(0F, 0F, 0F);

		bodyModel[65].addShapeBox(-11.5F, -7.7F, -19.5F, 1, 2, 2, 0F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F); // Core158
		bodyModel[65].setRotationPoint(0F, 0F, 0F);

		bodyModel[66].addShapeBox(49F, -12.5F, -20.5F, 2, 1, 2, 0F, -.3F, -.4F, -.3F, -.3F, -.4F, -.3F, -.3F, -.4F, -.3F, -.3F, -.4F, -.3F, -.3F, -.4F, -.3F, -.3F, -.4F, -.3F, -.3F, -.4F, -.3F, -.3F, -.4F, -.3F); // Core159
		bodyModel[66].setRotationPoint(0F, 0F, 0F);

		bodyModel[67].addBox(-11F, -10F, 15F, 1, 4, 5, 0F); // Core16
		bodyModel[67].setRotationPoint(0F, 0F, 0F);

		bodyModel[68].addShapeBox(-16F, -8F, -13F, 9, 9, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Core160
		bodyModel[68].setRotationPoint(0F, 0F, 0F);

		bodyModel[69].addShapeBox(19.2F, -51.3F, -21F, 3, 1, 6, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F); // Core161
		bodyModel[69].setRotationPoint(0F, 0F, 0F);
		bodyModel[69].rotateAngleZ = -1.04719755F;

		bodyModel[70].addShapeBox(49.5F, -13F, -20F, 1, 1, 1, 0F, -.1F, -.2F, -.1F, -.1F, -.2F, -.1F, -.1F, -.2F, -.1F, -.1F, -.2F, -.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core162
		bodyModel[70].setRotationPoint(0F, 0F, 0F);

		bodyModel[71].addShapeBox(-16F, -14F, 4F, 4, 6, 9, 0F, 0F, -2.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core163
		bodyModel[71].setRotationPoint(0F, 0F, 0F);

		bodyModel[72].addShapeBox(49.5F, -12F, -20F, 1, 1, 1, 0F, -.3F, 0F, .1F, -.3F, 0F, .1F, -.3F, 0F, .1F, -.3F, 0F, .1F, -.3F, 0F, .1F, -.3F, 0F, .1F, -.3F, 0F, .1F, -.3F, 0F, .1F); // Core164
		bodyModel[72].setRotationPoint(0F, 0F, 0F);

		bodyModel[73].addShapeBox(-11F, -6F, -20F, 1, 5, 5, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Core165
		bodyModel[73].setRotationPoint(0F, 0F, 0F);

		bodyModel[74].addShapeBox(-14F, -2F, -15F, 8, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core166
		bodyModel[74].setRotationPoint(0F, 0F, 0F);
		bodyModel[74].rotateAngleZ = -0.19198622F;

		bodyModel[75].addShapeBox(-15F, -2F, -15F, 1, 2, 2, 0F, -.5F, -.6F, -.6F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.6F, -.6F, -.5F, -.6F, -.6F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.6F, -.6F); // Core167
		bodyModel[75].setRotationPoint(0F, 0F, 0F);
		bodyModel[75].rotateAngleZ = -0.19198622F;

		bodyModel[76].addShapeBox(-14.9F, -1.5F, -14.5F, 1, 1, 1, 0F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F); // Core168
		bodyModel[76].setRotationPoint(0F, 0F, 0F);
		bodyModel[76].rotateAngleZ = -0.19198622F;

		bodyModel[77].addShapeBox(-14F, -2F, 13F, 8, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core169
		bodyModel[77].setRotationPoint(0F, 0F, 0F);
		bodyModel[77].rotateAngleZ = -0.19198622F;

		bodyModel[78].addShapeBox(-14F, -16F, -15F, 2, 2, 30, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 2F, 0F, 3.7F, 0F, 0F, 3.7F, 0F, 0F, 3.7F, 2F, 0F, 3.7F); // Core17
		bodyModel[78].setRotationPoint(0F, 0F, 0F);

		bodyModel[79].addShapeBox(-15F, -2F, 13F, 1, 2, 2, 0F, -.5F, -.6F, -.6F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.6F, -.6F, -.5F, -.6F, -.6F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.6F, -.6F); // Core170
		bodyModel[79].setRotationPoint(0F, 0F, 0F);
		bodyModel[79].rotateAngleZ = -0.19198622F;

		bodyModel[80].addShapeBox(-14.9F, -1.5F, 13.5F, 1, 1, 1, 0F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F); // Core171
		bodyModel[80].setRotationPoint(0F, 0F, 0F);
		bodyModel[80].rotateAngleZ = -0.19198622F;

		bodyModel[81].addShapeBox(-12F, -6F, -1F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core172
		bodyModel[81].setRotationPoint(0F, 0F, 0F);
		bodyModel[81].rotateAngleZ = 0.34906585F;

		bodyModel[82].addShapeBox(-13F, -7F, -2F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core173
		bodyModel[82].setRotationPoint(0F, 0F, 0F);
		bodyModel[82].rotateAngleZ = 0.34906585F;

		bodyModel[83].addShapeBox(-13F, -4F, -2F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Core174
		bodyModel[83].setRotationPoint(0F, 0F, 0F);
		bodyModel[83].rotateAngleZ = 0.34906585F;

		bodyModel[84].addShapeBox(24F, 29.5F, 15F, 8, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core175
		bodyModel[84].setRotationPoint(0F, 0F, 0F);
		bodyModel[84].rotateAngleZ = 0.78539816F;

		bodyModel[85].addShapeBox(14F, 19.5F, 15F, 8, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core176
		bodyModel[85].setRotationPoint(0F, 0F, 0F);
		bodyModel[85].rotateAngleZ = 0.78539816F;

		bodyModel[86].addShapeBox(4F, 9.5F, 15F, 8, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core177
		bodyModel[86].setRotationPoint(0F, 0F, 0F);
		bodyModel[86].rotateAngleZ = 0.78539816F;

		bodyModel[87].addShapeBox(14F, 19.5F, -16F, 8, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core178
		bodyModel[87].setRotationPoint(0F, 0F, 0F);
		bodyModel[87].rotateAngleZ = 0.78539816F;

		bodyModel[88].addShapeBox(4F, 9.5F, -16F, 8, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core178
		bodyModel[88].setRotationPoint(0F, 0F, 0F);
		bodyModel[88].rotateAngleZ = 0.78539816F;

		bodyModel[89].addShapeBox(1.2F, -16F, 19F, 3, 3, 1, 0F, -.8F, -.8F, -.3F, -.8F, -.8F, -.3F, -.8F, -.8F, -.3F, -.8F, -.8F, -.3F, -.8F, -.8F, -.3F, -.8F, -.8F, -.3F, -.8F, -.8F, -.3F, -.8F, -.8F, -.3F); // Core179
		bodyModel[89].setRotationPoint(0F, 0F, 0F);

		bodyModel[90].addShapeBox(-15F, -18F, -15F, 2, 2, 30, 0F, -2F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, -2F, 0F, 3F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F); // Core18
		bodyModel[90].setRotationPoint(1F, 0F, 0F);

		bodyModel[91].addShapeBox(24F, 29.5F, -16F, 8, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core180
		bodyModel[91].setRotationPoint(0F, 0F, 0F);
		bodyModel[91].rotateAngleZ = 0.78539816F;

		bodyModel[92].addShapeBox(48F, -5F, -17F, 2, 1, 34, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core181
		bodyModel[92].setRotationPoint(0F, 0F, 0F);

		bodyModel[93].addShapeBox(48F, -4F, -17F, 2, 1, 34, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Core182
		bodyModel[93].setRotationPoint(0F, 0F, 0F);

		bodyModel[94].addShapeBox(-4F, 1F, -17F, 2, 1, 34, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core183
		bodyModel[94].setRotationPoint(0F, 0F, 0F);

		bodyModel[95].addShapeBox(-4F, 2F, -17F, 2, 1, 34, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Core184
		bodyModel[95].setRotationPoint(0F, 0F, 0F);

		bodyModel[96].addShapeBox(28F, 10.5F, -16F, 2, 11, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core185
		bodyModel[96].setRotationPoint(0F, 0F, 0F);
		bodyModel[96].rotateAngleZ = 0.64577182F;

		bodyModel[97].addShapeBox(29.5F, 21.5F, -15.5F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core186
		bodyModel[97].setRotationPoint(-1F, 0F, 0F);
		bodyModel[97].rotateAngleZ = 0.64577182F;

		bodyModel[98].addShapeBox(22F, -18.5F, -16F, 2, 7, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core187
		bodyModel[98].setRotationPoint(0F, 0F, 0F);
		bodyModel[98].rotateAngleZ = -0.43633231F;

		bodyModel[99].addShapeBox(22.5F, -11.5F, -15.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core188
		bodyModel[99].setRotationPoint(0F, 0F, 0F);
		bodyModel[99].rotateAngleZ = -0.43633231F;

		bodyModel[100].addShapeBox(9F, -8.5F, -16F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core189
		bodyModel[100].setRotationPoint(0F, 0F, 0F);
		bodyModel[100].rotateAngleZ = -0.43633231F;

		bodyModel[101].addShapeBox(-16F, -14F, -19F, 4, 6, 38, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -4F, 0F, -4F); // Core19
		bodyModel[101].setRotationPoint(0F, 0F, 0F);

		bodyModel[102].addShapeBox(9.5F, -5.5F, -15.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core190
		bodyModel[102].setRotationPoint(0F, 0F, 0F);
		bodyModel[102].rotateAngleZ = -0.43633231F;

		bodyModel[103].addShapeBox(9F, -8.5F, 14F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core191
		bodyModel[103].setRotationPoint(0F, 0F, 0F);
		bodyModel[103].rotateAngleZ = -0.43633231F;

		bodyModel[104].addShapeBox(9.5F, -5.5F, 14.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core192
		bodyModel[104].setRotationPoint(0F, 0F, 0F);
		bodyModel[104].rotateAngleZ = -0.43633231F;

		bodyModel[105].addShapeBox(22.5F, -11.5F, 14.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core193
		bodyModel[105].setRotationPoint(0F, 0F, 0F);
		bodyModel[105].rotateAngleZ = -0.43633231F;

		bodyModel[106].addShapeBox(22F, -18.5F, 14F, 2, 7, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core195
		bodyModel[106].setRotationPoint(0F, 0F, 0F);
		bodyModel[106].rotateAngleZ = -0.43633231F;

		bodyModel[107].addShapeBox(28F, 10.5F, 14F, 2, 11, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core196
		bodyModel[107].setRotationPoint(0F, 0F, 0F);
		bodyModel[107].rotateAngleZ = 0.64577182F;

		bodyModel[108].addShapeBox(29.5F, 21.5F, 14.5F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core197
		bodyModel[108].setRotationPoint(-1F, 0F, 0F);
		bodyModel[108].rotateAngleZ = 0.64577182F;

		bodyModel[109].addBox(-15F, -18.5F, 13F, 2, 1, 2, 0F); // Core198
		bodyModel[109].setRotationPoint(0F, 0F, 0F);

		bodyModel[110].addShapeBox(-15F, -17.5F, 13F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.8F, 0F, 0F); // Core199
		bodyModel[110].setRotationPoint(0F, 0F, 0F);

		bodyModel[111].addShapeBox(-11F, -8F, -15F, 65, 4, 30, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Core2
		bodyModel[111].setRotationPoint(0F, 0F, 0F);

		bodyModel[112].addShapeBox(29F, -44.55F, -21F, 3, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core20
		bodyModel[112].setRotationPoint(0F, 0F, 0F);
		bodyModel[112].rotateAngleZ = -0.78539816F;

		bodyModel[113].addShapeBox(-15F, -20.5F, 13F, 2, 2, 2, 0F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Core200
		bodyModel[113].setRotationPoint(0F, 0F, 0F);

		bodyModel[114].addShapeBox(-15F, -21.5F, 13F, 2, 1, 2, 0F, -.7F, -.2F, -.7F, -.7F, -.2F, -.7F, -.7F, -.2F, -.7F, -.7F, -.2F, -.7F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Core201
		bodyModel[114].setRotationPoint(0F, 0F, 0F);

		bodyModel[115].addShapeBox(-14.5F, -26F, 13.5F, 1, 5, 1, 0F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Core203
		bodyModel[115].setRotationPoint(0F, 0F, 0F);

		bodyModel[116].addShapeBox(-9F, -20F, -17.5F, 2, 2, 2, 0F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Core204
		bodyModel[116].setRotationPoint(0F, 0F, 0F);

		bodyModel[117].addShapeBox(-9F, -21F, -17.5F, 2, 1, 2, 0F, -.7F, -.2F, -.7F, -.7F, -.2F, -.7F, -.7F, -.2F, -.7F, -.7F, -.2F, -.7F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Core205
		bodyModel[117].setRotationPoint(0F, 0F, 0F);

		bodyModel[118].addShapeBox(-8.5F, -27.5F, -17F, 1, 7, 1, 0F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Core206
		bodyModel[118].setRotationPoint(0F, 0F, 0F);

		bodyModel[119].addShapeBox(52F, -10F, -16F, 0, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -1.5F, 0F, 1.5F, -1.5F, 0F, 0F, 0F, 0F); // Core21
		bodyModel[119].setRotationPoint(0F, 0F, 0F);

		bodyModel[120].addShapeBox(19.2F, -51.3F, 15F, 3, 1, 6, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F); // Core22
		bodyModel[120].setRotationPoint(0F, 0F, 0F);
		bodyModel[120].rotateAngleZ = -1.04719755F;

		bodyModel[121].addShapeBox(48F, -15.5F, -2F, 1, 1, 9, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F); // Core23
		bodyModel[121].setRotationPoint(0F, 0F, 0F);
		bodyModel[121].rotateAngleY = 0.34906585F;

		bodyModel[122].addShapeBox(-11F, -6F, 15F, 1, 5, 5, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Core24
		bodyModel[122].setRotationPoint(0F, 0F, 0F);

		bodyModel[123].addShapeBox(46.8F, -17.5F, 5F, 1, 1, 3, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core25
		bodyModel[123].setRotationPoint(0F, 0F, 0F);
		bodyModel[123].rotateAngleY = 0.34906585F;

		bodyModel[124].addShapeBox(49.5F, -12F, -20F, 1, 1, 1, 0F, .1F, 0F, -.3F, .1F, 0F, -.3F, .1F, 0F, -.3F, .1F, 0F, -.3F, .1F, 0F, -.3F, .1F, 0F, -.3F, .1F, 0F, -.3F, .1F, 0F, -.3F); // Core26
		bodyModel[124].setRotationPoint(0F, 0F, 0F);

		bodyModel[125].addShapeBox(-16F, -10F, -13F, 4, 2, 18, 0F, 0F, -2F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core27
		bodyModel[125].setRotationPoint(0F, 0F, 0F);

		bodyModel[126].addBox(-12F, -13F, -21F, 1, 2, 5, 0F); // Core28
		bodyModel[126].setRotationPoint(0F, 0F, 0F);

		bodyModel[127].addBox(-12F, -10F, 20F, 4, 1, 1, 0F); // Core29
		bodyModel[127].setRotationPoint(0F, 0F, 0F);

		bodyModel[128].addShapeBox(-10F, -4F, -15F, 59, 4, 30, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Core3
		bodyModel[128].setRotationPoint(0F, 0F, 0F);

		bodyModel[129].addShapeBox(-12F, -15F, -21F, 1, 2, 5, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core30
		bodyModel[129].setRotationPoint(0F, 0F, 0F);

		bodyModel[130].addShapeBox(49F, -11.5F, -20.5F, 2, 1, 2, 0F, -.3F, -.4F, -.3F, -.3F, -.4F, -.3F, -.3F, -.4F, -.3F, -.3F, -.4F, -.3F, -.3F, -.4F, -.3F, -.3F, -.4F, -.3F, -.3F, -.4F, -.3F, -.3F, -.4F, -.3F); // Core31
		bodyModel[130].setRotationPoint(0F, 0F, 0F);

		bodyModel[131].addShapeBox(49F, -11.5F, 18.5F, 2, 1, 2, 0F, -.3F, -.4F, -.3F, -.3F, -.4F, -.3F, -.3F, -.4F, -.3F, -.3F, -.4F, -.3F, -.3F, -.4F, -.3F, -.3F, -.4F, -.3F, -.3F, -.4F, -.3F, -.3F, -.4F, -.3F); // Core32
		bodyModel[131].setRotationPoint(0F, 0F, 0F);

		bodyModel[132].addShapeBox(-12F, -9F, 20F, 4, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, -1F, 0F, 0F); // Core33
		bodyModel[132].setRotationPoint(0F, 0F, 0F);

		bodyModel[133].addBox(15F, -14F, -21F, 10, 3, 4, 0F); // Core34
		bodyModel[133].setRotationPoint(0F, 0F, 0F);

		bodyModel[134].addBox(49.5F, -12F, 19F, 1, 1, 1, 0F); // Core35
		bodyModel[134].setRotationPoint(0F, 0F, 0F);

		bodyModel[135].addShapeBox(15F, -15F, -21F, 10, 1, 4, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core36
		bodyModel[135].setRotationPoint(0F, 0F, 0F);

		bodyModel[136].addShapeBox(-12F, -9F, -27F, 4, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, -1F, 0F, 0F); // Core37
		bodyModel[136].setRotationPoint(0F, 0F, 6F);

		bodyModel[137].addShapeBox(1.3F, -15.5F, -20F, 1, 1, 2, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F); // Core38
		bodyModel[137].setRotationPoint(0F, 0F, 0F);

		bodyModel[138].addBox(-12F, -10F, -21F, 4, 1, 1, 0F); // Core39
		bodyModel[138].setRotationPoint(0F, 0F, 0F);

		bodyModel[139].addShapeBox(31F, -21F, -15F, 23, 13, 30, 0F, 0F, 0F, -7F, -23F, 0F, -7F, -23F, 0F, -7F, 0F, 0F, -7F, 0F, -6.5F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 4F); // Core4
		bodyModel[139].setRotationPoint(0F, 0F, 0F);

		bodyModel[140].addShapeBox(49.5F, -12F, 19F, 1, 1, 1, 0F, .1F, 0F, -.3F, .1F, 0F, -.3F, .1F, 0F, -.3F, .1F, 0F, -.3F, .1F, 0F, -.3F, .1F, 0F, -.3F, .1F, 0F, -.3F, .1F, 0F, -.3F); // Core40
		bodyModel[140].setRotationPoint(0F, 0F, 0F);

		bodyModel[141].addShapeBox(1.2F, -16F, -20F, 3, 3, 1, 0F, -.8F, -.8F, -.3F, -.8F, -.8F, -.3F, -.8F, -.8F, -.3F, -.8F, -.8F, -.3F, -.8F, -.8F, -.3F, -.8F, -.8F, -.3F, -.8F, -.8F, -.3F, -.8F, -.8F, -.3F); // Core41
		bodyModel[141].setRotationPoint(0F, 0F, 0F);

		bodyModel[142].addShapeBox(49.5F, -12F, 19F, 1, 1, 1, 0F, -.3F, 0F, .1F, -.3F, 0F, .1F, -.3F, 0F, .1F, -.3F, 0F, .1F, -.3F, 0F, .1F, -.3F, 0F, .1F, -.3F, 0F, .1F, -.3F, 0F, .1F); // Core42
		bodyModel[142].setRotationPoint(0F, 0F, 0F);

		bodyModel[143].addShapeBox(3.1F, -15.5F, -20F, 1, 1, 2, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F); // Core43
		bodyModel[143].setRotationPoint(0F, 0F, 0F);

		bodyModel[144].addShapeBox(49F, -12.5F, 18.5F, 2, 1, 2, 0F, -.3F, -.4F, -.3F, -.3F, -.4F, -.3F, -.3F, -.4F, -.3F, -.3F, -.4F, -.3F, -.3F, -.4F, -.3F, -.3F, -.4F, -.3F, -.3F, -.4F, -.3F, -.3F, -.4F, -.3F); // Core44
		bodyModel[144].setRotationPoint(0F, 0F, 0F);

		bodyModel[145].addShapeBox(49.5F, -13F, 19F, 1, 1, 1, 0F, -.1F, -.2F, -.1F, -.1F, -.2F, -.1F, -.1F, -.2F, -.1F, -.1F, -.2F, -.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core45
		bodyModel[145].setRotationPoint(0F, 0F, 0F);

		bodyModel[146].addShapeBox(27.1F, -15.5F, -20F, 1, 1, 2, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F); // Core46
		bodyModel[146].setRotationPoint(0F, 0F, 0F);

		bodyModel[147].addShapeBox(25.3F, -15.5F, -20F, 1, 1, 2, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F); // Core47
		bodyModel[147].setRotationPoint(0F, 0F, 0F);

		bodyModel[148].addShapeBox(33F, -33.3F, -12F, 6, 1, 7, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F); // Core48
		bodyModel[148].setRotationPoint(0F, 0F, 0F);
		bodyModel[148].rotateAngleZ = -0.50614548F;

		bodyModel[149].addShapeBox(25.2F, -16F, -20F, 3, 3, 1, 0F, -.8F, -.8F, -.3F, -.8F, -.8F, -.3F, -.8F, -.8F, -.3F, -.8F, -.8F, -.3F, -.8F, -.8F, -.3F, -.8F, -.8F, -.3F, -.8F, -.8F, -.3F, -.8F, -.8F, -.3F); // Core49
		bodyModel[149].setRotationPoint(0F, 0F, 0F);

		bodyModel[150].addShapeBox(23F, -21F, -15F, 8, 7, 30, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, -2F, -2F, 5F, 0F, -.5F, 4F, 0F, -.5F, 4F, -2F, -2F, 5F); // Core5
		bodyModel[150].setRotationPoint(0F, 0F, 0F);

		bodyModel[151].addShapeBox(39F, -33.3F, -12F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Core50
		bodyModel[151].setRotationPoint(0F, 0F, 0F);
		bodyModel[151].rotateAngleZ = -0.50614548F;

		bodyModel[152].addBox(47.8F, -16F, 6F, 1, 2, 1, 0F); // Core51
		bodyModel[152].setRotationPoint(0F, 0F, 0F);
		bodyModel[152].rotateAngleY = 0.34906585F;

		bodyModel[153].addBox(-12F, -9.7F, 15.5F, 1, 2, 4, 0F); // Core52
		bodyModel[153].setRotationPoint(0F, 0F, 0F);

		bodyModel[154].addShapeBox(32F, -33.3F, -10F, 1, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F); // Core53
		bodyModel[154].setRotationPoint(0F, 0F, 0F);
		bodyModel[154].rotateAngleZ = -0.50614548F;

		bodyModel[155].addShapeBox(-2F, -14.6F, -20.5F, 1, 2, 1, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core54
		bodyModel[155].setRotationPoint(0F, 0F, 0F);

		bodyModel[156].addBox(34F, -33.5F, -6F, 1, 1, 2, 0F); // Core55
		bodyModel[156].setRotationPoint(0F, 0F, 0F);
		bodyModel[156].rotateAngleZ = -0.50614548F;

		bodyModel[157].addShapeBox(-2F, -12.6F, -20.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, -.5F, -.1F, 0F, -.5F); // Core56
		bodyModel[157].setRotationPoint(0F, 0F, 0F);

		bodyModel[158].addBox(36F, -33.5F, -6F, 1, 1, 2, 0F); // Core57
		bodyModel[158].setRotationPoint(0F, 0F, 0F);
		bodyModel[158].rotateAngleZ = -0.50614548F;

		bodyModel[159].addShapeBox(-2F, -11.6F, -20.5F, 1, 1, 1, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, -.5F, -.1F, 0F, -.5F, -.3F, -.5F, -.5F, -.3F, -.5F, -.5F, -.3F, -.5F, 0F, -.3F, -.5F, 0F); // Core58
		bodyModel[159].setRotationPoint(0F, 0F, 0F);

		bodyModel[160].addShapeBox(-2F, -13.6F, -19.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Core59
		bodyModel[160].setRotationPoint(0F, 0F, 0F);

		bodyModel[161].addShapeBox(16F, -21F, -15F, 7, 5, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 5F, 2F, 0F, 5F, 2F, 0F, 5F, 1F, 0F, 5F); // Core6
		bodyModel[161].setRotationPoint(0F, 0F, 0F);

		bodyModel[162].addBox(35F, -33.5F, -6F, 1, 1, 1, 0F); // Core60
		bodyModel[162].setRotationPoint(0F, 0F, 0F);
		bodyModel[162].rotateAngleZ = -0.50614548F;

		bodyModel[163].addShapeBox(-2F, -12.6F, -19.5F, 1, 1, 1, 0F, -.2F, 0F, -1F, -.2F, 0F, -1F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F); // Core61
		bodyModel[163].setRotationPoint(0F, 0F, 0F);

		bodyModel[164].addBox(26F, -34F, -4F, 1, 2, 3, 0F); // Core62
		bodyModel[164].setRotationPoint(0F, 0F, 0F);
		bodyModel[164].rotateAngleZ = -0.50614548F;

		bodyModel[165].addShapeBox(6F, -12.6F, -19.5F, 1, 1, 1, 0F, -.2F, 0F, -1F, -.2F, 0F, -1F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F); // Core63
		bodyModel[165].setRotationPoint(0F, 0F, 0F);

		bodyModel[166].addBox(39F, -34.3F, 5F, 1, 2, 6, 0F); // Core64
		bodyModel[166].setRotationPoint(0F, 0F, 0F);
		bodyModel[166].rotateAngleZ = -0.50614548F;

		bodyModel[167].addShapeBox(53F, -9F, -15F, 2, 1, 1, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F); // Core65
		bodyModel[167].setRotationPoint(0F, 0F, 0F);

		bodyModel[168].addShapeBox(6F, -13.6F, -19.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Core66
		bodyModel[168].setRotationPoint(0F, 0F, 0F);

		bodyModel[169].addShapeBox(54F, -9F, -15F, 1, 1, 3, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F); // Core67
		bodyModel[169].setRotationPoint(0F, 0F, 0F);

		bodyModel[170].addShapeBox(6F, -14.6F, -20.5F, 1, 2, 1, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core68
		bodyModel[170].setRotationPoint(0F, 0F, 0F);

		bodyModel[171].addShapeBox(53F, -9F, -13F, 2, 1, 1, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F); // Core69
		bodyModel[171].setRotationPoint(0F, 0F, 0F);

		bodyModel[172].addShapeBox(31F, -15F, -15F, 23, 7, 30, 0F, 0F, -.5F, 4F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -.5F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core7
		bodyModel[172].setRotationPoint(0F, 0F, 0F);

		bodyModel[173].addShapeBox(6F, -12.6F, -20.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, -.5F, -.1F, 0F, -.5F); // Core70
		bodyModel[173].setRotationPoint(0F, 0F, 0F);

		bodyModel[174].addShapeBox(6F, -11.6F, -20.5F, 1, 1, 1, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, -.5F, -.1F, 0F, -.5F, -.3F, -.5F, -.5F, -.3F, -.5F, -.5F, -.3F, -.5F, 0F, -.3F, -.5F, 0F); // Core71
		bodyModel[174].setRotationPoint(0F, 0F, 0F);

		bodyModel[175].addShapeBox(54F, -8F, -14F, 1, 1, 1, 0F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F); // Core72
		bodyModel[175].setRotationPoint(0F, 0F, 0F);

		bodyModel[176].addShapeBox(-11.5F, -7.7F, 17.5F, 1, 2, 2, 0F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F); // Core73
		bodyModel[176].setRotationPoint(0F, 0F, 0F);

		bodyModel[177].addShapeBox(46.8F, -13.5F, 5F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Core74
		bodyModel[177].setRotationPoint(0F, 0F, 0F);
		bodyModel[177].rotateAngleY = 0.34906585F;

		bodyModel[178].addShapeBox(54F, -8.3F, -14.4F, 1, 1, 1, 0F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, -.5F, -.3F, -.3F, -.5F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Core75
		bodyModel[178].setRotationPoint(0F, 0F, 0F);

		bodyModel[179].addShapeBox(-8.9F, -15.5F, -20F, 1, 1, 2, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F); // Core76
		bodyModel[179].setRotationPoint(0F, 0F, 0F);

		bodyModel[180].addShapeBox(-10.8F, -16F, -20F, 3, 3, 1, 0F, -.8F, -.8F, -.3F, -.8F, -.8F, -.3F, -.8F, -.8F, -.3F, -.8F, -.8F, -.3F, -.8F, -.8F, -.3F, -.8F, -.8F, -.3F, -.8F, -.8F, -.3F, -.8F, -.8F, -.3F); // Core77
		bodyModel[180].setRotationPoint(0F, 0F, 0F);

		bodyModel[181].addShapeBox(54F, -8.3F, -13.6F, 1, 1, 1, 0F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, -.5F, -.3F, -.3F, -.5F, -.3F); // Core78
		bodyModel[181].setRotationPoint(0F, 0F, 0F);

		bodyModel[182].addShapeBox(-10.7F, -15.5F, -20F, 1, 1, 2, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F); // Core79
		bodyModel[182].setRotationPoint(0F, 0F, 0F);

		bodyModel[183].addShapeBox(53F, -9F, 12F, 2, 1, 1, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F); // Core80
		bodyModel[183].setRotationPoint(0F, 0F, 0F);

		bodyModel[184].addShapeBox(54F, -9F, 12F, 1, 1, 3, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F); // Core81
		bodyModel[184].setRotationPoint(0F, 0F, 0F);

		bodyModel[185].addBox(21F, -21.3F, -12F, 4, 1, 12, 0F); // Core82
		bodyModel[185].setRotationPoint(0F, 0F, 0F);

		bodyModel[186].addShapeBox(25F, -21.3F, -12F, 4, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Core83
		bodyModel[186].setRotationPoint(0F, 0F, 0F);

		bodyModel[187].addShapeBox(53F, -9F, 14F, 2, 1, 1, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F); // Core84
		bodyModel[187].setRotationPoint(0F, 0F, 0F);

		bodyModel[188].addShapeBox(54F, -8.3F, 13.4F, 1, 1, 1, 0F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, -.5F, -.3F, -.3F, -.5F, -.3F); // Core85
		bodyModel[188].setRotationPoint(0F, 0F, 0F);

		bodyModel[189].addShapeBox(17F, -21.3F, -12F, 4, 1, 12, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Core86
		bodyModel[189].setRotationPoint(0F, 0F, 0F);

		bodyModel[190].addShapeBox(54F, -8.3F, 12.6F, 1, 1, 1, 0F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, -.5F, -.3F, -.3F, -.5F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Core87
		bodyModel[190].setRotationPoint(0F, 0F, 0F);

		bodyModel[191].addBox(29.5F, -21.5F, -8F, 1, 1, 4, 0F); // Core88
		bodyModel[191].setRotationPoint(0F, 0F, 0F);

		bodyModel[192].addShapeBox(29.5F, -22.5F, -8F, 1, 1, 4, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core89
		bodyModel[192].setRotationPoint(0F, 0F, 0F);

		bodyModel[193].addShapeBox(25F, -14F, -15F, 6, 6, 30, 0F, 0F, 2F, 5F, 0F, .5F, 4F, 0F, .5F, 4F, 0F, 2F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core9
		bodyModel[193].setRotationPoint(0F, 0F, 0F);

		bodyModel[194].addShapeBox(54F, -8F, 13F, 1, 1, 1, 0F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F); // Core90
		bodyModel[194].setRotationPoint(0F, 0F, 0F);

		bodyModel[195].addShapeBox(3.1F, -15.5F, 18F, 1, 1, 2, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F); // Core91
		bodyModel[195].setRotationPoint(0F, 0F, 0F);

		bodyModel[196].addShapeBox(26.5F, -22.5F, 10F, 1, 1, 4, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core92
		bodyModel[196].setRotationPoint(0F, 0F, 0F);
		bodyModel[196].rotateAngleY = -0.78539816F;

		bodyModel[197].addShapeBox(1.3F, -15.5F, 18F, 1, 1, 2, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F); // Core93
		bodyModel[197].setRotationPoint(0F, 0F, 0F);

		bodyModel[198].addBox(26.5F, -21.5F, 10F, 1, 1, 4, 0F); // Core94
		bodyModel[198].setRotationPoint(0F, 0F, 0F);
		bodyModel[198].rotateAngleY = -0.78539816F;

		bodyModel[199].addBox(-12F, -11F, -21F, 64, 1, 6, 0F); // Core95
		bodyModel[199].setRotationPoint(0F, 0F, 0F);

		bodyModel[200].addBox(-11.5F, -7.3F, 15.5F, 1, 1, 1, 0F); // Core96
		bodyModel[200].setRotationPoint(0F, 0F, 0F);

		bodyModel[201].addBox(46.8F, -16.5F, 5F, 1, 3, 3, 0F); // Core97
		bodyModel[201].setRotationPoint(0F, 0F, 0F);
		bodyModel[201].rotateAngleY = 0.34906585F;

		bodyModel[202].addShapeBox(18F, -22.5F, -22.5F, 1, 1, 4, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core99
		bodyModel[202].setRotationPoint(0F, 0F, 0F);
		bodyModel[202].rotateAngleY = 0.78539816F;


		turretModel = new ModelRendererTurbo[61];
		turretModel[0] = new ModelRendererTurbo(this, 194, 4, textureX, textureY); // Turret1
		turretModel[1] = new ModelRendererTurbo(this, 140, 29, textureX, textureY); // Turret10
		turretModel[2] = new ModelRendererTurbo(this, 188, 30, textureX, textureY); // Turret11
		turretModel[3] = new ModelRendererTurbo(this, 159, 30, textureX, textureY); // Turret12
		turretModel[4] = new ModelRendererTurbo(this, 218, 30, textureX, textureY); // Turret13
		turretModel[5] = new ModelRendererTurbo(this, 71, 202, textureX, textureY); // Turret13
		turretModel[6] = new ModelRendererTurbo(this, 141, 3, textureX, textureY); // Turret14
		turretModel[7] = new ModelRendererTurbo(this, 71, 202, textureX, textureY); // Turret15
		turretModel[8] = new ModelRendererTurbo(this, 71, 202, textureX, textureY); // Turret16
		turretModel[9] = new ModelRendererTurbo(this, 215, 59, textureX, textureY); // Turret17
		turretModel[10] = new ModelRendererTurbo(this, 215, 59, textureX, textureY); // Turret18
		turretModel[11] = new ModelRendererTurbo(this, 215, 59, textureX, textureY); // Turret19
		turretModel[12] = new ModelRendererTurbo(this, 160, 1, textureX, textureY); // Turret2
		turretModel[13] = new ModelRendererTurbo(this, 215, 59, textureX, textureY); // Turret20
		turretModel[14] = new ModelRendererTurbo(this, 215, 59, textureX, textureY); // Turret21
		turretModel[15] = new ModelRendererTurbo(this, 215, 59, textureX, textureY); // Turret23
		turretModel[16] = new ModelRendererTurbo(this, 215, 59, textureX, textureY); // Turret24
		turretModel[17] = new ModelRendererTurbo(this, 215, 59, textureX, textureY); // Turret25
		turretModel[18] = new ModelRendererTurbo(this, 142, 3, textureX, textureY); // Turret26
		turretModel[19] = new ModelRendererTurbo(this, 66, 208, textureX, textureY); // Turret27
		turretModel[20] = new ModelRendererTurbo(this, 66, 208, textureX, textureY); // Turret28
		turretModel[21] = new ModelRendererTurbo(this, 210, 45, textureX, textureY); // Turret29
		turretModel[22] = new ModelRendererTurbo(this, 160, 1, textureX, textureY); // Turret3
		turretModel[23] = new ModelRendererTurbo(this, 210, 45, textureX, textureY); // Turret30
		turretModel[24] = new ModelRendererTurbo(this, 227, 46, textureX, textureY); // Turret31
		turretModel[25] = new ModelRendererTurbo(this, 227, 46, textureX, textureY); // Turret32
		turretModel[26] = new ModelRendererTurbo(this, 116, 5, textureX, textureY); // Turret33
		turretModel[27] = new ModelRendererTurbo(this, 116, 4, textureX, textureY); // Turret34
		turretModel[28] = new ModelRendererTurbo(this, 116, 4, textureX, textureY); // Turret35
		turretModel[29] = new ModelRendererTurbo(this, 116, 3, textureX, textureY); // Turret36
		turretModel[30] = new ModelRendererTurbo(this, 155, 32, textureX, textureY); // Turret37
		turretModel[31] = new ModelRendererTurbo(this, 117, 19, textureX, textureY); // Turret38
		turretModel[32] = new ModelRendererTurbo(this, 117, 19, textureX, textureY); // Turret39
		turretModel[33] = new ModelRendererTurbo(this, 155, 32, textureX, textureY); // Turret4
		turretModel[34] = new ModelRendererTurbo(this, 117, 19, textureX, textureY); // Turret40
		turretModel[35] = new ModelRendererTurbo(this, 117, 19, textureX, textureY); // Turret41
		turretModel[36] = new ModelRendererTurbo(this, 138, 51, textureX, textureY); // Turret42
		turretModel[37] = new ModelRendererTurbo(this, 138, 51, textureX, textureY); // Turret43
		turretModel[38] = new ModelRendererTurbo(this, 138, 51, textureX, textureY); // Turret44
		turretModel[39] = new ModelRendererTurbo(this, 138, 51, textureX, textureY); // Turret45
		turretModel[40] = new ModelRendererTurbo(this, 117, 63, textureX, textureY); // Turret46
		turretModel[41] = new ModelRendererTurbo(this, 148, 27, textureX, textureY); // Turret47
		turretModel[42] = new ModelRendererTurbo(this, 117, 57, textureX, textureY); // Turret48
		turretModel[43] = new ModelRendererTurbo(this, 117, 47, textureX, textureY); // Turret49
		turretModel[44] = new ModelRendererTurbo(this, 194, 4, textureX, textureY); // Turret5
		turretModel[45] = new ModelRendererTurbo(this, 117, 52, textureX, textureY); // Turret50
		turretModel[46] = new ModelRendererTurbo(this, 118, 42, textureX, textureY); // Turret51
		turretModel[47] = new ModelRendererTurbo(this, 148, 22, textureX, textureY); // Turret52
		turretModel[48] = new ModelRendererTurbo(this, 192, 49, textureX, textureY); // Turret53
		turretModel[49] = new ModelRendererTurbo(this, 172, 46, textureX, textureY); // Turret54
		turretModel[50] = new ModelRendererTurbo(this, 155, 32, textureX, textureY); // Turret55
		turretModel[51] = new ModelRendererTurbo(this, 145, 36, textureX, textureY); // Turret6
		turretModel[52] = new ModelRendererTurbo(this, 194, 4, textureX, textureY); // Turret7
		turretModel[53] = new ModelRendererTurbo(this, 145, 36, textureX, textureY); // Turret8
		turretModel[54] = new ModelRendererTurbo(this, 142, 41, textureX, textureY); // Turret9
		turretModel[55] = new ModelRendererTurbo(this, 155, 46, textureX, textureY); // Turret59
		turretModel[56] = new ModelRendererTurbo(this, 155, 51, textureX, textureY); // Turret60
		turretModel[57] = new ModelRendererTurbo(this, 155, 46, textureX, textureY); // Turret61
		turretModel[58] = new ModelRendererTurbo(this, 155, 46, textureX, textureY); // Turret56
		turretModel[59] = new ModelRendererTurbo(this, 155, 51, textureX, textureY); // Turret57
		turretModel[60] = new ModelRendererTurbo(this, 155, 46, textureX, textureY); // Turret58

		turretModel[0].addShapeBox(-4F, -1F, -11F, 8, 1, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret1
		turretModel[0].setRotationPoint(0F, -18F, 0F);

		turretModel[1].addShapeBox(2F, -7F, 0F, 1, 2, 1, 0F, 0F, -2F, .1F, 0F, 0F, .1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret10
		turretModel[1].setRotationPoint(0F, -18F, 0F);

		turretModel[2].addShapeBox(-6F, -5.1F, -5F, 4, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret11
		turretModel[2].setRotationPoint(0F, -18F, 0F);

		turretModel[3].addShapeBox(-2F, -5.1F, -5F, 3, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Turret12
		turretModel[3].setRotationPoint(0F, -18F, 0F);

		turretModel[4].addShapeBox(-9F, -5.1F, -5F, 3, 1, 10, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Turret13
		turretModel[4].setRotationPoint(0F, -18F, 0F);

		turretModel[5].addShapeBox(8.5F, -8F, -5F, 3, 1, 10, 0F, -.5F, 0F, -3F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Turret13
		turretModel[5].setRotationPoint(0F, -18F, 0F);
		turretModel[5].rotateAngleZ = 1.91986218F;

		turretModel[6].addShapeBox(3F, -5F, -9F, 8, 4, 9, 0F, 0F, 0F, -1F, -4F, 0F, -5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret14
		turretModel[6].setRotationPoint(0F, -18F, 0F);

		turretModel[7].addShapeBox(11.5F, -8F, -5F, 4, 1, 10, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret15
		turretModel[7].setRotationPoint(0F, -18F, 0F);
		turretModel[7].rotateAngleZ = 1.91986218F;

		turretModel[8].addShapeBox(15.5F, -8F, -5F, 3, 1, 10, 0F, 0F, 0F, -.5F, -.5F, 0F, -3F, -.5F, 0F, -3F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Turret16
		turretModel[8].setRotationPoint(0F, -18F, 0F);
		turretModel[8].rotateAngleZ = 1.91986218F;

		turretModel[9].addShapeBox(-6F, -6.1F, -5F, 4, 1, 1, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret17
		turretModel[9].setRotationPoint(0F, -18F, 0F);

		turretModel[10].addShapeBox(-6F, -6.1F, 4F, 4, 1, 1, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret18
		turretModel[10].setRotationPoint(0F, -18F, 0F);

		turretModel[11].addShapeBox(0F, -6.1F, -2F, 1, 1, 4, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret19
		turretModel[11].setRotationPoint(0F, -18F, 0F);

		turretModel[12].addShapeBox(-5F, -5F, -9F, 8, 4, 18, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret2
		turretModel[12].setRotationPoint(0F, -18F, 0F);

		turretModel[13].addShapeBox(-9F, -6.1F, -2F, 1, 1, 4, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret20
		turretModel[13].setRotationPoint(0F, -18F, 0F);

		turretModel[14].addShapeBox(-9F, -6.1F, -5F, 3, 1, 7, 0F, 0F, -.8F, -3F, 0F, -.8F, 0F, 0F, -.8F, -6F, 0F, -.8F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -3F); // Turret21
		turretModel[14].setRotationPoint(0F, -18F, 0F);

		turretModel[15].addShapeBox(-9F, -6.1F, -2F, 3, 1, 7, 0F, 0F, -.8F, -3F, 0F, -.8F, -6F, 0F, -.8F, 0F, 0F, -.8F, -3F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -3F); // Turret23
		turretModel[15].setRotationPoint(0F, -18F, 0F);

		turretModel[16].addShapeBox(-2F, -6.1F, -5F, 3, 1, 7, 0F, 0F, -.8F, 0F, 0F, -.8F, -3F, 0F, -.8F, -3F, 0F, -.8F, -6F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -6F); // Turret24
		turretModel[16].setRotationPoint(0F, -18F, 0F);

		turretModel[17].addShapeBox(-2F, -6.1F, -2F, 3, 1, 7, 0F, 0F, -.8F, -6F, 0F, -.8F, -3F, 0F, -.8F, -3F, 0F, -.8F, 0F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Turret25
		turretModel[17].setRotationPoint(0F, -18F, 0F);

		turretModel[18].addShapeBox(3F, -5F, 0F, 2, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Turret26
		turretModel[18].setRotationPoint(0F, -18F, 0F);

		turretModel[19].addBox(7.5F, -8.1F, 1F, 2, 1, 1, 0F); // Turret27
		turretModel[19].setRotationPoint(0F, -18F, 0F);
		turretModel[19].rotateAngleZ = 1.91986218F;

		turretModel[20].addBox(7.5F, -8.1F, -2F, 2, 1, 1, 0F); // Turret28
		turretModel[20].setRotationPoint(0F, -18F, 0F);
		turretModel[20].rotateAngleZ = 1.91986218F;

		turretModel[21].addShapeBox(1F, -7F, -14F, 1, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret29
		turretModel[21].setRotationPoint(0F, -18F, 0F);

		turretModel[22].addShapeBox(-11F, -5F, -9F, 6, 4, 18, 0F, -1F, 0F, -6F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Turret3
		turretModel[22].setRotationPoint(0F, -18F, 0F);

		turretModel[23].addShapeBox(-3F, -7F, -12.8F, 1, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret30
		turretModel[23].setRotationPoint(0F, -18F, 0F);
		turretModel[23].rotateAngleY = 0.71558499F;

		turretModel[24].addShapeBox(-2F, -5F, 8F, 1, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F); // Turret31
		turretModel[24].setRotationPoint(0F, -18F, 0F);
		turretModel[24].rotateAngleY = -0.19198622F;

		turretModel[25].addShapeBox(0F, -5F, 8F, 1, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F); // Turret32
		turretModel[25].setRotationPoint(0F, -18F, 0F);
		turretModel[25].rotateAngleY = -0.19198622F;

		turretModel[26].addShapeBox(-2F, -9.5F, -15F, 5, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret33
		turretModel[26].setRotationPoint(0F, -18F, 0F);

		turretModel[27].addShapeBox(3F, -9.5F, -15F, 3, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F, 0F, 1F, 0F, 0F, 0F); // Turret34
		turretModel[27].setRotationPoint(0F, -18F, 0F);

		turretModel[28].addShapeBox(6F, -9.5F, -13F, 3, 5, 5, 0F, 0F, 0F, .5F, 0F, 0F, -3F, -3F, 0F, .5F, 1F, 0F, -1F, 0F, 0F, .5F, 0F, 0F, -3F, -3F, 0F, .5F, 1F, 0F, -1F); // Turret35
		turretModel[28].setRotationPoint(0F, -18F, 0F);

		turretModel[29].addShapeBox(6F, -9.5F, -10F, 3, 5, 4, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret36
		turretModel[29].setRotationPoint(0F, -18F, 0F);

		turretModel[30].addBox(3F, -6F, 0F, 4, 5, 1, 0F); // Turret37
		turretModel[30].setRotationPoint(0F, -18F, 0F);

		turretModel[31].addShapeBox(-1F, -9F, 13F, 4, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret38
		turretModel[31].setRotationPoint(0F, -18F, 0F);

		turretModel[32].addShapeBox(3F, -9F, 13F, 3, 4, 5, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Turret39
		turretModel[32].setRotationPoint(0F, -18F, 0F);

		turretModel[33].addShapeBox(2F, -8F, 5F, 4, 3, 1, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret4
		turretModel[33].setRotationPoint(0F, -18F, 0F);

		turretModel[34].addShapeBox(6F, -9F, 11F, 3, 4, 5, 0F, 1F, 0F, -1F, -3F, 0F, .5F, 0F, 0F, -3F, 0F, 0F, .5F, 1F, 0F, -1F, -3F, 0F, .5F, 0F, 0F, -3F, 0F, 0F, .5F); // Turret40
		turretModel[34].setRotationPoint(0F, -18F, 0F);

		turretModel[35].addShapeBox(6F, -9F, 9F, 3, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F); // Turret41
		turretModel[35].setRotationPoint(0F, -18F, 0F);

		turretModel[36].addBox(6F, -10.5F, -7F, 3, 1, 2, 0F); // Turret42
		turretModel[36].setRotationPoint(0F, -18F, 0F);

		turretModel[37].addShapeBox(6F, -10.5F, -8F, 3, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret43
		turretModel[37].setRotationPoint(0F, -18F, 0F);

		turretModel[38].addShapeBox(6F, -10F, 10.5F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret44
		turretModel[38].setRotationPoint(0F, -18F, 0F);

		turretModel[39].addBox(6F, -10F, 8.5F, 3, 1, 2, 0F); // Turret45
		turretModel[39].setRotationPoint(0F, -18F, 0F);

		turretModel[40].addShapeBox(6F, -9.9F, -6.5F, 3, 1, 2, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F); // Turret46
		turretModel[40].setRotationPoint(0F, -18F, 0F);
		turretModel[40].rotateAngleX = -0.10471976F;

		turretModel[41].addShapeBox(3F, -8F, 0F, 4, 2, 1, 0F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret47
		turretModel[41].setRotationPoint(0F, -18F, 0F);

		turretModel[42].addShapeBox(6F, -10.3F, -3.45F, 3, 1, 2, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F); // Turret48
		turretModel[42].setRotationPoint(0F, -18F, 0F);

		turretModel[43].addShapeBox(6F, -9.2F, 7.5F, 3, 1, 2, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F); // Turret49
		turretModel[43].setRotationPoint(0F, -18F, 0F);
		turretModel[43].rotateAngleX = 0.08726646F;

		turretModel[44].addShapeBox(-11F, -1F, -11F, 7, 1, 22, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Turret5
		turretModel[44].setRotationPoint(0F, -18F, 0F);

		turretModel[45].addShapeBox(6F, -10.3F, 1.55F, 3, 1, 2, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F); // Turret50
		turretModel[45].setRotationPoint(0F, -18F, 0F);
		turretModel[45].rotateAngleX = 0.31415927F;

		turretModel[46].addShapeBox(6F, -12F, -0.4F, 3, 1, 2, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F); // Turret51
		turretModel[46].setRotationPoint(0F, -18F, 0F);
		turretModel[46].rotateAngleX = -0.50614548F;

		turretModel[47].addShapeBox(3F, -9F, 0F, 4, 1, 1, 0F, -1F, 0F, .1F, -1F, 0F, .1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret52
		turretModel[47].setRotationPoint(0F, -18F, 0F);

		turretModel[48].addBox(3F, -5.5F, -4.1F, 3, 1, 4, 0F); // Turret53
		turretModel[48].setRotationPoint(0F, -18F, 0F);

		turretModel[49].addShapeBox(3F, -7F, -4.6F, 3, 2, 5, 0F, -.5F, -.3F, -.7F, -.8F, 0F, -.7F, -.8F, 0F, -.7F, -.5F, -.3F, -.7F, -.5F, -.3F, -.7F, -.5F, -.3F, -.7F, -.5F, -.3F, -.7F, -.5F, -.3F, -.7F); // Turret54
		turretModel[49].setRotationPoint(0F, -18F, 0F);

		turretModel[50].addBox(2F, -5F, 5F, 4, 4, 1, 0F); // Turret55
		turretModel[50].setRotationPoint(0F, -18F, 0F);

		turretModel[51].addShapeBox(5F, -9F, 5F, 2, 1, 1, 0F, -1F, 0F, .1F, -1F, 0F, .1F, -1F, 0F, .1F, -1F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F); // Turret6
		turretModel[51].setRotationPoint(0F, -18F, 0F);

		turretModel[52].addShapeBox(4F, -1F, -11F, 7, 1, 22, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Turret7
		turretModel[52].setRotationPoint(0F, -18F, 0F);

		turretModel[53].addShapeBox(5F, -8F, 5F, 2, 1, 1, 0F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, -1F, 0F, .1F, -1F, 0F, .1F, -1F, 0F, .1F, -1F, 0F, .1F); // Turret8
		turretModel[53].setRotationPoint(0F, -18F, 0F);

		turretModel[54].addShapeBox(5.5F, -8.5F, 1F, 1, 1, 4, 0F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret9
		turretModel[54].setRotationPoint(0F, -18F, 0F);

		turretModel[55].addShapeBox(4F, -10.5F, -6F, 2, 1, 1, 0F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F); // Turret59
		turretModel[55].setRotationPoint(0F, -18F, 0F);

		turretModel[56].addShapeBox(3.3F, -10.5F, -6F, 1, 2, 1, 0F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F); // Turret60
		turretModel[56].setRotationPoint(0F, -18F, 0F);

		turretModel[57].addShapeBox(1.6F, -9.5F, -6F, 2, 1, 1, 0F, -.5F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, -.5F, -.2F, -.2F, -.5F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, -.5F, -.2F, -.2F); // Turret61
		turretModel[57].setRotationPoint(0F, -18F, 0F);

		turretModel[58].addShapeBox(4F, -10F, 8.5F, 2, 1, 1, 0F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F); // Turret56
		turretModel[58].setRotationPoint(0F, -18F, 0F);

		turretModel[59].addShapeBox(3.3F, -10F, 8.5F, 1, 2, 1, 0F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F); // Turret57
		turretModel[59].setRotationPoint(0F, -18F, 0F);

		turretModel[60].addShapeBox(1.6F, -9F, 8.5F, 2, 1, 1, 0F, -.5F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, -.5F, -.2F, -.2F, -.5F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, -.5F, -.2F, -.2F); // Turret58
		turretModel[60].setRotationPoint(0F, -18F, 0F);


		barrelModel = new ModelRendererTurbo[30];
		barrelModel[0] = new ModelRendererTurbo(this, 0, 65, textureX, textureY); // Barrel1
		barrelModel[1] = new ModelRendererTurbo(this, 55, 47, textureX, textureY); // Barrel10
		barrelModel[2] = new ModelRendererTurbo(this, 13, 65, textureX, textureY); // Barrel11
		barrelModel[3] = new ModelRendererTurbo(this, 22, 65, textureX, textureY); // Barrel12
		barrelModel[4] = new ModelRendererTurbo(this, 44, 53, textureX, textureY); // Barrel13
		barrelModel[5] = new ModelRendererTurbo(this, 1, 44, textureX, textureY); // Barrel14
		barrelModel[6] = new ModelRendererTurbo(this, 75, 59, textureX, textureY); // Barrel15
		barrelModel[7] = new ModelRendererTurbo(this, 114, 32, textureX, textureY); // Barrel16
		barrelModel[8] = new ModelRendererTurbo(this, 3, 53, textureX, textureY); // Barrel17
		barrelModel[9] = new ModelRendererTurbo(this, 34, 65, textureX, textureY); // Barrel18
		barrelModel[10] = new ModelRendererTurbo(this, 34, 65, textureX, textureY); // Barrel19
		barrelModel[11] = new ModelRendererTurbo(this, 43, 54, textureX, textureY); // Barrel2
		barrelModel[12] = new ModelRendererTurbo(this, 0, 71, textureX, textureY); // Barrel20
		barrelModel[13] = new ModelRendererTurbo(this, 0, 65, textureX, textureY); // Barrel3
		barrelModel[14] = new ModelRendererTurbo(this, 1, 44, textureX, textureY); // Barrel4
		barrelModel[15] = new ModelRendererTurbo(this, 1, 44, textureX, textureY); // Barrel5
		barrelModel[16] = new ModelRendererTurbo(this, 91, 53, textureX, textureY); // Barrel6
		barrelModel[17] = new ModelRendererTurbo(this, 47, 55, textureX, textureY); // Barrel7
		barrelModel[18] = new ModelRendererTurbo(this, 55, 47, textureX, textureY); // Barrel8
		barrelModel[19] = new ModelRendererTurbo(this, 47, 55, textureX, textureY); // Barrel9
		barrelModel[20] = new ModelRendererTurbo(this, 0, 71, textureX, textureY); // Barrel21
		barrelModel[21] = new ModelRendererTurbo(this, 42, 53, textureX, textureY); // Barrel22
		barrelModel[22] = new ModelRendererTurbo(this, 34, 65, textureX, textureY); // Barrel23
		barrelModel[23] = new ModelRendererTurbo(this, 34, 65, textureX, textureY); // Barrel24
		barrelModel[24] = new ModelRendererTurbo(this, 1, 44, textureX, textureY); // Barrel25
		barrelModel[25] = new ModelRendererTurbo(this, 34, 65, textureX, textureY); // Barrel26
		barrelModel[26] = new ModelRendererTurbo(this, 0, 65, textureX, textureY); // Barrel27
		barrelModel[27] = new ModelRendererTurbo(this, 0, 65, textureX, textureY); // Barrel28
		barrelModel[28] = new ModelRendererTurbo(this, 1, 44, textureX, textureY); // Barrel29
		barrelModel[29] = new ModelRendererTurbo(this, 1, 44, textureX, textureY); // Barrel30

		barrelModel[0].addShapeBox(51F, -2F, -1F, 2, 1, 2, 0F, 0F, 0F, -.5F, 0F, -.3F, -.6F, 0F, -.3F, -.6F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, 0F); // Barrel1
		barrelModel[0].setRotationPoint(6F, -26F, 3F);

		barrelModel[1].addShapeBox(-9.5F, 4.8F, -2.5F, 7, 1, 1, 0F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // Barrel10
		barrelModel[1].setRotationPoint(6F, -26F, 3F);
		barrelModel[1].rotateAngleZ = 0.6981317F;

		barrelModel[2].addShapeBox(53F, -2F, -1F, 2, 1, 2, 0F, 0F, -.3F, -.6F, 0F, -.1F, -.6F, 0F, -.1F, -.6F, 0F, -.3F, -.6F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F); // Barrel11
		barrelModel[2].setRotationPoint(6F, -26F, 3F);

		barrelModel[3].addShapeBox(53F, -1F, -1F, 2, 1, 2, 0F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, -.3F, -.6F, 0F, -.1F, -.6F, 0F, -.1F, -.6F, 0F, -.3F, -.6F); // Barrel12
		barrelModel[3].setRotationPoint(6F, -26F, 3F);

		barrelModel[4].addShapeBox(10F, -2F, -1.5F, 1, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Barrel13
		barrelModel[4].setRotationPoint(6F, -26F, 3F);

		barrelModel[5].addShapeBox(1F, -4F, -2.5F, 7, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Barrel14
		barrelModel[5].setRotationPoint(6F, -26F, 3F);

		barrelModel[6].addShapeBox(0F, -3F, -2F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Barrel15
		barrelModel[6].setRotationPoint(6F, -26F, 3F);

		barrelModel[7].addShapeBox(0F, -3F, -3.2F, 3, 1, 6, 0F, -.1F, -.1F, -.4F, -.1F, -.1F, -.4F, -.1F, -.1F, -.4F, -.1F, -.1F, -.4F, -.1F, -.1F, -.4F, -.1F, -.1F, -.4F, -.1F, -.1F, -.4F, -.1F, -.1F, -.4F); // Barrel16
		barrelModel[7].setRotationPoint(6F, -26F, 3F);

		barrelModel[8].addShapeBox(-5F, -2F, -1.5F, 15, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Barrel17
		barrelModel[8].setRotationPoint(6F, -26F, 3F);

		barrelModel[9].addShapeBox(17F, -2F, -1F, 2, 1, 2, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Barrel18
		barrelModel[9].setRotationPoint(6F, -26F, 3F);

		barrelModel[10].addShapeBox(17F, -1F, -1F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Barrel19
		barrelModel[10].setRotationPoint(6F, -26F, 3F);

		barrelModel[11].addShapeBox(-5F, -3F, -1.5F, 14, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Barrel2
		barrelModel[11].setRotationPoint(6F, -26F, 3F);

		barrelModel[12].addShapeBox(13F, -1F, -1F, 35, 1, 2, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, -.2F, -.6F, 0F, -.2F, -.6F, 0F, -.2F, -.6F, 0F, -.2F, -.6F); // Barrel20
		barrelModel[12].setRotationPoint(6F, -26F, 3F);

		barrelModel[13].addShapeBox(51F, -1F, -1F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.3F, -.6F, 0F, -.3F, -.6F, 0F, 0F, -.5F); // Barrel3
		barrelModel[13].setRotationPoint(6F, -26F, 3F);

		barrelModel[14].addShapeBox(-5F, -4F, -2F, 1, 1, 4, 0F, .1F, -1F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, .1F, -1F, -.3F, .1F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, .1F, 0F, -.3F); // Barrel4
		barrelModel[14].setRotationPoint(6F, -26F, 3F);

		barrelModel[15].addShapeBox(-5F, -3F, -2F, 1, 1, 4, 0F, .1F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, .1F, 0F, -.3F, .1F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, .1F, 0F, -.3F); // Barrel5
		barrelModel[15].setRotationPoint(6F, -26F, 3F);

		barrelModel[16].addShapeBox(9.5F, -2F, -2.5F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Barrel6
		barrelModel[16].setRotationPoint(6F, -26F, 3F);

		barrelModel[17].addShapeBox(-2.5F, 4.8F, 1.5F, 11, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Barrel7
		barrelModel[17].setRotationPoint(6F, -26F, 3F);
		barrelModel[17].rotateAngleZ = 0.6981317F;

		barrelModel[18].addShapeBox(-9.5F, 4.8F, 1.5F, 7, 1, 1, 0F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // Barrel8
		barrelModel[18].setRotationPoint(6F, -26F, 3F);
		barrelModel[18].rotateAngleZ = 0.6981317F;

		barrelModel[19].addShapeBox(-2.5F, 4.8F, -2.5F, 11, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Barrel9
		barrelModel[19].setRotationPoint(6F, -26F, 3F);
		barrelModel[19].rotateAngleZ = 0.6981317F;

		barrelModel[20].addShapeBox(13F, -2F, -1F, 35, 1, 2, 0F, 0F, -.2F, -.6F, 0F, -.2F, -.6F, 0F, -.2F, -.6F, 0F, -.2F, -.6F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F); // Barrel21
		barrelModel[20].setRotationPoint(6F, -26F, 3F);

		barrelModel[21].addShapeBox(9F, -3F, -1.5F, 2, 1, 3, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Barrel22
		barrelModel[21].setRotationPoint(6F, -26F, 3F);

		barrelModel[22].addShapeBox(11F, -1F, -1F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Barrel23
		barrelModel[22].setRotationPoint(6F, -26F, 3F);

		barrelModel[23].addShapeBox(11F, -2F, -1F, 2, 1, 2, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Barrel24
		barrelModel[23].setRotationPoint(6F, -26F, 3F);

		barrelModel[24].addShapeBox(8F, -4F, -2.5F, 2, 1, 5, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, .5F, 0F, -.2F, .5F, 0F, 0F, 0F, 0F); // Barrel25
		barrelModel[24].setRotationPoint(6F, -26F, 3F);

		barrelModel[25].addShapeBox(11F, 0.4F, -0.5F, 8, 1, 1, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F); // Barrel26
		barrelModel[25].setRotationPoint(6F, -27F, 3F);

		barrelModel[26].addShapeBox(48F, -2F, -1F, 3, 1, 2, 0F, 0F, -.2F, -.6F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.2F, -.6F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F); // Barrel27
		barrelModel[26].setRotationPoint(6F, -26F, 3F);

		barrelModel[27].addShapeBox(48F, -1F, -1F, 3, 1, 2, 0F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, -.2F, -.6F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.2F, -.6F); // Barrel28
		barrelModel[27].setRotationPoint(6F, -26F, 3F);

		barrelModel[28].addShapeBox(-1F, -4F, -2.5F, 2, 1, 5, 0F, 0F, 0F, -.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.8F, 0F, 1F, -.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -.8F); // Barrel29
		barrelModel[28].setRotationPoint(6F, -26F, 3F);

		barrelModel[29].addShapeBox(-4F, -4F, -2F, 3, 2, 4, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F); // Barrel30
		barrelModel[29].setRotationPoint(6F, -26F, 3F);


		leftTrackWheelModels = new ModelRendererTurbo[64];
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 189, 114, textureX, textureY); // TWheelL1
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 189, 114, textureX, textureY); // TWheelL10
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 189, 114, textureX, textureY); // TWheelL11
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 187, 98, textureX, textureY); // TWheelL12
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 187, 98, textureX, textureY); // TWheelL13
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 187, 98, textureX, textureY); // TWheelL14
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 187, 98, textureX, textureY); // TWheelL16
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 187, 98, textureX, textureY); // TWheelL17
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 187, 98, textureX, textureY); // TWheelL18
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 187, 98, textureX, textureY); // TWheelL19
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 189, 114, textureX, textureY); // TWheelL2
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 187, 98, textureX, textureY); // TWheelL20
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 207, 98, textureX, textureY); // TWheelL21
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 205, 111, textureX, textureY); // TWheelL22
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 205, 111, textureX, textureY); // TWheelL23
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 205, 111, textureX, textureY); // TWheelL24
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 214, 128, textureX, textureY); // TWheelL25
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 191, 83, textureX, textureY); // TWheelL26
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 191, 83, textureX, textureY); // TWheelL27
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 191, 83, textureX, textureY); // TWheelL28
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 179, 81, textureX, textureY); // TWheelL29
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 189, 114, textureX, textureY); // TWheelL3
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 193, 125, textureX, textureY); // TWheelL30
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 193, 125, textureX, textureY); // TWheelL31
		leftTrackWheelModels[24] = new ModelRendererTurbo(this, 193, 125, textureX, textureY); // TWheelL32
		leftTrackWheelModels[25] = new ModelRendererTurbo(this, 187, 107, textureX, textureY); // TWheelL33
		leftTrackWheelModels[26] = new ModelRendererTurbo(this, 187, 107, textureX, textureY); // TWheelL34
		leftTrackWheelModels[27] = new ModelRendererTurbo(this, 187, 107, textureX, textureY); // TWheelL35
		leftTrackWheelModels[28] = new ModelRendererTurbo(this, 187, 107, textureX, textureY); // TWheelL36
		leftTrackWheelModels[29] = new ModelRendererTurbo(this, 187, 107, textureX, textureY); // TWheelL37
		leftTrackWheelModels[30] = new ModelRendererTurbo(this, 187, 107, textureX, textureY); // TWheelL38
		leftTrackWheelModels[31] = new ModelRendererTurbo(this, 187, 107, textureX, textureY); // TWheelL39
		leftTrackWheelModels[32] = new ModelRendererTurbo(this, 189, 114, textureX, textureY); // TWheelL4
		leftTrackWheelModels[33] = new ModelRendererTurbo(this, 187, 107, textureX, textureY); // TWheelL40
		leftTrackWheelModels[34] = new ModelRendererTurbo(this, 187, 107, textureX, textureY); // TWheelL41
		leftTrackWheelModels[35] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // TWheelL42
		leftTrackWheelModels[36] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // TWheelL43
		leftTrackWheelModels[37] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // TWheelL44
		leftTrackWheelModels[38] = new ModelRendererTurbo(this, 199, 134, textureX, textureY); // TWheelL45
		leftTrackWheelModels[39] = new ModelRendererTurbo(this, 199, 134, textureX, textureY); // TWheelL46
		leftTrackWheelModels[40] = new ModelRendererTurbo(this, 199, 134, textureX, textureY); // TWheelL47
		leftTrackWheelModels[41] = new ModelRendererTurbo(this, 199, 134, textureX, textureY); // TWheelL48
		leftTrackWheelModels[42] = new ModelRendererTurbo(this, 199, 134, textureX, textureY); // TWheelL49
		leftTrackWheelModels[43] = new ModelRendererTurbo(this, 189, 114, textureX, textureY); // TWheelL5
		leftTrackWheelModels[44] = new ModelRendererTurbo(this, 199, 134, textureX, textureY); // TWheelL50
		leftTrackWheelModels[45] = new ModelRendererTurbo(this, 199, 134, textureX, textureY); // TWheelL51
		leftTrackWheelModels[46] = new ModelRendererTurbo(this, 199, 134, textureX, textureY); // TWheelL52
		leftTrackWheelModels[47] = new ModelRendererTurbo(this, 189, 114, textureX, textureY); // TWheelL53
		leftTrackWheelModels[48] = new ModelRendererTurbo(this, 189, 114, textureX, textureY); // TWheelL54
		leftTrackWheelModels[49] = new ModelRendererTurbo(this, 189, 114, textureX, textureY); // TWheelL55
		leftTrackWheelModels[50] = new ModelRendererTurbo(this, 189, 114, textureX, textureY); // TWheelL56
		leftTrackWheelModels[51] = new ModelRendererTurbo(this, 189, 114, textureX, textureY); // TWheelL57
		leftTrackWheelModels[52] = new ModelRendererTurbo(this, 189, 114, textureX, textureY); // TWheelL58
		leftTrackWheelModels[53] = new ModelRendererTurbo(this, 189, 114, textureX, textureY); // TWheelL59
		leftTrackWheelModels[54] = new ModelRendererTurbo(this, 189, 114, textureX, textureY); // TWheelL6
		leftTrackWheelModels[55] = new ModelRendererTurbo(this, 189, 114, textureX, textureY); // TWheelL60
		leftTrackWheelModels[56] = new ModelRendererTurbo(this, 189, 114, textureX, textureY); // TWheelL61
		leftTrackWheelModels[57] = new ModelRendererTurbo(this, 189, 114, textureX, textureY); // TWheelL62
		leftTrackWheelModels[58] = new ModelRendererTurbo(this, 189, 114, textureX, textureY); // TWheelL63
		leftTrackWheelModels[59] = new ModelRendererTurbo(this, 189, 114, textureX, textureY); // TWheelL64
		leftTrackWheelModels[60] = new ModelRendererTurbo(this, 189, 114, textureX, textureY); // TWheelL65
		leftTrackWheelModels[61] = new ModelRendererTurbo(this, 189, 114, textureX, textureY); // TWheelL7
		leftTrackWheelModels[62] = new ModelRendererTurbo(this, 189, 114, textureX, textureY); // TWheelL8
		leftTrackWheelModels[63] = new ModelRendererTurbo(this, 189, 114, textureX, textureY); // TWheelL9

		leftTrackWheelModels[0].addShapeBox(-3.5F, 1.5F, 2F, 5, 2, 1, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // TWheelL1
		leftTrackWheelModels[0].setRotationPoint(25F, 4F, 17F);

		leftTrackWheelModels[1].addBox(2.5F, -1.5F, 2F, 1, 3, 1, 0F); // TWheelL10
		leftTrackWheelModels[1].setRotationPoint(11F, 4F, 17F);

		leftTrackWheelModels[2].addShapeBox(-1.5F, -3.5F, 2F, 5, 2, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // TWheelL11
		leftTrackWheelModels[2].setRotationPoint(11F, 4F, 17F);

		leftTrackWheelModels[3].addBox(-2F, -5F, 2F, 4, 1, 1, 0F); // TWheelL12
		leftTrackWheelModels[3].setRotationPoint(-3F, 2F, 17F);

		leftTrackWheelModels[4].addShapeBox(-5F, -5F, 2F, 7, 3, 1, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // TWheelL13
		leftTrackWheelModels[4].setRotationPoint(-3F, 2F, 17F);

		leftTrackWheelModels[5].addBox(-5F, -2F, 2F, 1, 4, 1, 0F); // TWheelL14
		leftTrackWheelModels[5].setRotationPoint(-3F, 2F, 17F);

		leftTrackWheelModels[6].addShapeBox(-5F, 2F, 2F, 7, 3, 1, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // TWheelL16
		leftTrackWheelModels[6].setRotationPoint(-3F, 2F, 17F);

		leftTrackWheelModels[7].addBox(-2F, 4F, 2F, 4, 1, 1, 0F); // TWheelL17
		leftTrackWheelModels[7].setRotationPoint(-3F, 2F, 17F);

		leftTrackWheelModels[8].addShapeBox(-2F, 2F, 2F, 7, 3, 1, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // TWheelL18
		leftTrackWheelModels[8].setRotationPoint(-3F, 2F, 17F);

		leftTrackWheelModels[9].addBox(4F, -2F, 2F, 1, 4, 1, 0F); // TWheelL19
		leftTrackWheelModels[9].setRotationPoint(-3F, 2F, 17F);

		leftTrackWheelModels[10].addBox(-1.5F, 2.5F, 2F, 3, 1, 1, 0F); // TWheelL2
		leftTrackWheelModels[10].setRotationPoint(25F, 4F, 17F);

		leftTrackWheelModels[11].addShapeBox(-2F, -5F, 2F, 7, 3, 1, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // TWheelL20
		leftTrackWheelModels[11].setRotationPoint(-3F, 2F, 17F);

		leftTrackWheelModels[12].addBox(-0.5F, -0.5F, 1.5F, 1, 1, 1, 0F); // TWheelL21
		leftTrackWheelModels[12].setRotationPoint(-3F, 2F, 17F);

		leftTrackWheelModels[13].addBox(-0.5F, -0.5F, -1.5F, 1, 1, 4, 0F); // TWheelL22
		leftTrackWheelModels[13].setRotationPoint(11F, 4F, 17F);

		leftTrackWheelModels[14].addBox(-0.5F, -0.5F, -1.5F, 1, 1, 4, 0F); // TWheelL23
		leftTrackWheelModels[14].setRotationPoint(25F, 4F, 17F);

		leftTrackWheelModels[15].addBox(-0.5F, -0.5F, -1.5F, 1, 1, 4, 0F); // TWheelL24
		leftTrackWheelModels[15].setRotationPoint(39F, 4F, 17F);

		leftTrackWheelModels[16].addBox(-1.5F, -1.5F, 1.5F, 3, 3, 1, 0F); // TWheelL25
		leftTrackWheelModels[16].setRotationPoint(49F, -4F, 17F);

		leftTrackWheelModels[17].addShapeBox(-1.5F, 0.5F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // TWheelL26
		leftTrackWheelModels[17].setRotationPoint(29F, -7F, 17F);

		leftTrackWheelModels[18].addBox(-1.5F, -0.5F, 0F, 3, 1, 1, 0F); // TWheelL27
		leftTrackWheelModels[18].setRotationPoint(29F, -7F, 17F);

		leftTrackWheelModels[19].addShapeBox(-1.5F, -1.5F, 0F, 3, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // TWheelL28
		leftTrackWheelModels[19].setRotationPoint(29F, -7F, 17F);

		leftTrackWheelModels[20].addBox(-0.5F, -0.5F, -1.5F, 1, 1, 3, 0F); // TWheelL29
		leftTrackWheelModels[20].setRotationPoint(29F, -7F, 17F);

		leftTrackWheelModels[21].addShapeBox(-1.5F, 1.5F, 2F, 5, 2, 1, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // TWheelL3
		leftTrackWheelModels[21].setRotationPoint(25F, 4F, 17F);

		leftTrackWheelModels[22].addShapeBox(-3.5F, -3.5F, 0F, 7, 2, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // TWheelL30
		leftTrackWheelModels[22].setRotationPoint(49F, -4F, 17F);

		leftTrackWheelModels[23].addBox(-3.5F, -1.5F, 0F, 7, 3, 2, 0F); // TWheelL31
		leftTrackWheelModels[23].setRotationPoint(49F, -4F, 17F);

		leftTrackWheelModels[24].addShapeBox(-3.5F, 1.5F, 0F, 7, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // TWheelL32
		leftTrackWheelModels[24].setRotationPoint(49F, -4F, 17F);

		leftTrackWheelModels[25].addShapeBox(-3.5F, -3.5F, 0F, 7, 2, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // TWheelL33
		leftTrackWheelModels[25].setRotationPoint(39F, 4F, 17F);

		leftTrackWheelModels[26].addBox(-3.5F, -1.5F, 0F, 7, 3, 2, 0F); // TWheelL34
		leftTrackWheelModels[26].setRotationPoint(39F, 4F, 17F);

		leftTrackWheelModels[27].addShapeBox(-3.5F, 1.5F, 0F, 7, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // TWheelL35
		leftTrackWheelModels[27].setRotationPoint(39F, 4F, 17F);

		leftTrackWheelModels[28].addShapeBox(-3.5F, -3.5F, 0F, 7, 2, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // TWheelL36
		leftTrackWheelModels[28].setRotationPoint(25F, 4F, 17F);

		leftTrackWheelModels[29].addBox(-3.5F, -1.5F, 0F, 7, 3, 2, 0F); // TWheelL37
		leftTrackWheelModels[29].setRotationPoint(25F, 4F, 17F);

		leftTrackWheelModels[30].addShapeBox(-3.5F, 1.5F, 0F, 7, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // TWheelL38
		leftTrackWheelModels[30].setRotationPoint(25F, 4F, 17F);

		leftTrackWheelModels[31].addShapeBox(-3.5F, -3.5F, 0F, 7, 2, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // TWheelL39
		leftTrackWheelModels[31].setRotationPoint(11F, 4F, 17F);

		leftTrackWheelModels[32].addBox(-1.5F, -3.5F, 2F, 3, 1, 1, 0F); // TWheelL4
		leftTrackWheelModels[32].setRotationPoint(11F, 4F, 17F);

		leftTrackWheelModels[33].addBox(-3.5F, -1.5F, 0F, 7, 3, 2, 0F); // TWheelL40
		leftTrackWheelModels[33].setRotationPoint(11F, 4F, 17F);

		leftTrackWheelModels[34].addShapeBox(-3.5F, 1.5F, 0F, 7, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // TWheelL41
		leftTrackWheelModels[34].setRotationPoint(11F, 4F, 17F);

		leftTrackWheelModels[35].addShapeBox(-5F, -5F, 0F, 10, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // TWheelL42
		leftTrackWheelModels[35].setRotationPoint(-3F, 2F, 17F);

		leftTrackWheelModels[36].addBox(-5F, -2F, 0F, 10, 4, 2, 0F); // TWheelL43
		leftTrackWheelModels[36].setRotationPoint(-3F, 2F, 17F);

		leftTrackWheelModels[37].addShapeBox(-5F, 2F, 0F, 10, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // TWheelL44
		leftTrackWheelModels[37].setRotationPoint(-3F, 2F, 17F);

		leftTrackWheelModels[38].addBox(-1.5F, -3.5F, 2F, 3, 1, 1, 0F); // TWheelL45
		leftTrackWheelModels[38].setRotationPoint(49F, -4F, 17F);

		leftTrackWheelModels[39].addShapeBox(-1.5F, -3.5F, 2F, 5, 2, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // TWheelL46
		leftTrackWheelModels[39].setRotationPoint(49F, -4F, 17F);

		leftTrackWheelModels[40].addBox(2.5F, -1.5F, 2F, 1, 3, 1, 0F); // TWheelL47
		leftTrackWheelModels[40].setRotationPoint(49F, -4F, 17F);

		leftTrackWheelModels[41].addShapeBox(-1.5F, 1.5F, 2F, 5, 2, 1, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // TWheelL48
		leftTrackWheelModels[41].setRotationPoint(49F, -4F, 17F);

		leftTrackWheelModels[42].addBox(-1.5F, 2.5F, 2F, 3, 1, 1, 0F); // TWheelL49
		leftTrackWheelModels[42].setRotationPoint(49F, -4F, 17F);

		leftTrackWheelModels[43].addShapeBox(-3.5F, -3.5F, 2F, 5, 2, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // TWheelL5
		leftTrackWheelModels[43].setRotationPoint(11F, 4F, 17F);

		leftTrackWheelModels[44].addShapeBox(-3.5F, 1.5F, 2F, 5, 2, 1, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // TWheelL50
		leftTrackWheelModels[44].setRotationPoint(49F, -4F, 17F);

		leftTrackWheelModels[45].addBox(-3.5F, -1.5F, 2F, 1, 3, 1, 0F); // TWheelL51
		leftTrackWheelModels[45].setRotationPoint(49F, -4F, 17F);

		leftTrackWheelModels[46].addShapeBox(-3.5F, -3.5F, 2F, 5, 2, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // TWheelL52
		leftTrackWheelModels[46].setRotationPoint(49F, -4F, 17F);

		leftTrackWheelModels[47].addBox(-1.5F, -3.5F, 2F, 3, 1, 1, 0F); // TWheelL53
		leftTrackWheelModels[47].setRotationPoint(39F, 4F, 17F);

		leftTrackWheelModels[48].addShapeBox(-1.5F, -3.5F, 2F, 5, 2, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // TWheelL54
		leftTrackWheelModels[48].setRotationPoint(39F, 4F, 17F);

		leftTrackWheelModels[49].addBox(2.5F, -1.5F, 2F, 1, 3, 1, 0F); // TWheelL55
		leftTrackWheelModels[49].setRotationPoint(39F, 4F, 17F);

		leftTrackWheelModels[50].addShapeBox(-1.5F, 1.5F, 2F, 5, 2, 1, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // TWheelL56
		leftTrackWheelModels[50].setRotationPoint(39F, 4F, 17F);

		leftTrackWheelModels[51].addShapeBox(-3.5F, -3.5F, 2F, 5, 2, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // TWheelL57
		leftTrackWheelModels[51].setRotationPoint(39F, 4F, 17F);

		leftTrackWheelModels[52].addBox(-3.5F, -1.5F, 2F, 1, 3, 1, 0F); // TWheelL58
		leftTrackWheelModels[52].setRotationPoint(39F, 4F, 17F);

		leftTrackWheelModels[53].addShapeBox(-3.5F, 1.5F, 2F, 5, 2, 1, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // TWheelL59
		leftTrackWheelModels[53].setRotationPoint(39F, 4F, 17F);

		leftTrackWheelModels[54].addBox(-3.5F, -1.5F, 2F, 1, 3, 1, 0F); // TWheelL6
		leftTrackWheelModels[54].setRotationPoint(11F, 4F, 17F);

		leftTrackWheelModels[55].addBox(-1.5F, 2.5F, 2F, 3, 1, 1, 0F); // TWheelL60
		leftTrackWheelModels[55].setRotationPoint(39F, 4F, 17F);

		leftTrackWheelModels[56].addBox(2.5F, -1.5F, 2F, 1, 3, 1, 0F); // TWheelL61
		leftTrackWheelModels[56].setRotationPoint(25F, 4F, 17F);

		leftTrackWheelModels[57].addShapeBox(-1.5F, -3.5F, 2F, 5, 2, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // TWheelL62
		leftTrackWheelModels[57].setRotationPoint(25F, 4F, 17F);

		leftTrackWheelModels[58].addBox(-1.5F, -3.5F, 2F, 3, 1, 1, 0F); // TWheelL63
		leftTrackWheelModels[58].setRotationPoint(25F, 4F, 17F);

		leftTrackWheelModels[59].addShapeBox(-3.5F, -3.5F, 2F, 5, 2, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // TWheelL64
		leftTrackWheelModels[59].setRotationPoint(25F, 4F, 17F);

		leftTrackWheelModels[60].addBox(-3.5F, -1.5F, 2F, 1, 3, 1, 0F); // TWheelL65
		leftTrackWheelModels[60].setRotationPoint(25F, 4F, 17F);

		leftTrackWheelModels[61].addShapeBox(-3.5F, 1.5F, 2F, 5, 2, 1, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // TWheelL7
		leftTrackWheelModels[61].setRotationPoint(11F, 4F, 17F);

		leftTrackWheelModels[62].addBox(-1.5F, 2.5F, 2F, 3, 1, 1, 0F); // TWheelL8
		leftTrackWheelModels[62].setRotationPoint(11F, 4F, 17F);

		leftTrackWheelModels[63].addShapeBox(-1.5F, 1.5F, 2F, 5, 2, 1, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // TWheelL9
		leftTrackWheelModels[63].setRotationPoint(11F, 4F, 17F);


		rightTrackWheelModels = new ModelRendererTurbo[64];
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 187, 98, textureX, textureY); // TWheelR1
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 199, 134, textureX, textureY); // TWheelR10
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 199, 134, textureX, textureY); // TWheelR11
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 199, 134, textureX, textureY); // TWheelR12
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 187, 98, textureX, textureY); // TWheelR13
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 199, 134, textureX, textureY); // TWheelR14
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 199, 134, textureX, textureY); // TWheelR15
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 199, 134, textureX, textureY); // TWheelR16
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 199, 134, textureX, textureY); // TWheelR17
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 199, 134, textureX, textureY); // TWheelR18
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 193, 125, textureX, textureY); // TWheelR19
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 187, 98, textureX, textureY); // TWheelR2
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 193, 125, textureX, textureY); // TWheelR20
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 187, 107, textureX, textureY); // TWheelR21
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 187, 107, textureX, textureY); // TWheelR23
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 187, 107, textureX, textureY); // TWheelR24
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 189, 114, textureX, textureY); // TWheelR25
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 189, 114, textureX, textureY); // TWheelR26
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 189, 114, textureX, textureY); // TWheelR27
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 189, 114, textureX, textureY); // TWheelR28
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 189, 114, textureX, textureY); // TWheelR29
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // TWheelR3
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 189, 114, textureX, textureY); // TWheelR30
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 189, 114, textureX, textureY); // TWheelR31
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 189, 114, textureX, textureY); // TWheelR32
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 205, 111, textureX, textureY); // TWheelR33
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 207, 98, textureX, textureY); // TWheelR34
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 205, 111, textureX, textureY); // TWheelR35
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 187, 107, textureX, textureY); // TWheelR36
		rightTrackWheelModels[29] = new ModelRendererTurbo(this, 187, 107, textureX, textureY); // TWheelR37
		rightTrackWheelModels[30] = new ModelRendererTurbo(this, 187, 98, textureX, textureY); // TWheelR38
		rightTrackWheelModels[31] = new ModelRendererTurbo(this, 187, 107, textureX, textureY); // TWheelR39
		rightTrackWheelModels[32] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // TWheelR4
		rightTrackWheelModels[33] = new ModelRendererTurbo(this, 189, 114, textureX, textureY); // TWheelR40
		rightTrackWheelModels[34] = new ModelRendererTurbo(this, 189, 114, textureX, textureY); // TWheelR41
		rightTrackWheelModels[35] = new ModelRendererTurbo(this, 189, 114, textureX, textureY); // TWheelR42
		rightTrackWheelModels[36] = new ModelRendererTurbo(this, 189, 114, textureX, textureY); // TWheelR43
		rightTrackWheelModels[37] = new ModelRendererTurbo(this, 189, 114, textureX, textureY); // TWheelR44
		rightTrackWheelModels[38] = new ModelRendererTurbo(this, 189, 114, textureX, textureY); // TWheelR45
		rightTrackWheelModels[39] = new ModelRendererTurbo(this, 189, 114, textureX, textureY); // TWheelR46
		rightTrackWheelModels[40] = new ModelRendererTurbo(this, 189, 114, textureX, textureY); // TWheelR47
		rightTrackWheelModels[41] = new ModelRendererTurbo(this, 205, 111, textureX, textureY); // TWheelR48
		rightTrackWheelModels[42] = new ModelRendererTurbo(this, 187, 98, textureX, textureY); // TWheelR49
		rightTrackWheelModels[43] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // TWheelR5
		rightTrackWheelModels[44] = new ModelRendererTurbo(this, 187, 107, textureX, textureY); // TWheelR50
		rightTrackWheelModels[45] = new ModelRendererTurbo(this, 187, 107, textureX, textureY); // TWheelR51
		rightTrackWheelModels[46] = new ModelRendererTurbo(this, 187, 107, textureX, textureY); // TWheelR52
		rightTrackWheelModels[47] = new ModelRendererTurbo(this, 189, 114, textureX, textureY); // TWheelR53
		rightTrackWheelModels[48] = new ModelRendererTurbo(this, 189, 114, textureX, textureY); // TWheelR54
		rightTrackWheelModels[49] = new ModelRendererTurbo(this, 189, 114, textureX, textureY); // TWheelR55
		rightTrackWheelModels[50] = new ModelRendererTurbo(this, 189, 114, textureX, textureY); // TWheelR56
		rightTrackWheelModels[51] = new ModelRendererTurbo(this, 189, 114, textureX, textureY); // TWheelR57
		rightTrackWheelModels[52] = new ModelRendererTurbo(this, 189, 114, textureX, textureY); // TWheelR58
		rightTrackWheelModels[53] = new ModelRendererTurbo(this, 189, 114, textureX, textureY); // TWheelR59
		rightTrackWheelModels[54] = new ModelRendererTurbo(this, 187, 98, textureX, textureY); // TWheelR6
		rightTrackWheelModels[55] = new ModelRendererTurbo(this, 189, 114, textureX, textureY); // TWheelR60
		rightTrackWheelModels[56] = new ModelRendererTurbo(this, 193, 125, textureX, textureY); // TWheelR61
		rightTrackWheelModels[57] = new ModelRendererTurbo(this, 191, 83, textureX, textureY); // TWheelR62
		rightTrackWheelModels[58] = new ModelRendererTurbo(this, 191, 83, textureX, textureY); // TWheelR63
		rightTrackWheelModels[59] = new ModelRendererTurbo(this, 191, 83, textureX, textureY); // TWheelR64
		rightTrackWheelModels[60] = new ModelRendererTurbo(this, 179, 81, textureX, textureY); // TWheelR65
		rightTrackWheelModels[61] = new ModelRendererTurbo(this, 187, 98, textureX, textureY); // TWheelR7
		rightTrackWheelModels[62] = new ModelRendererTurbo(this, 187, 98, textureX, textureY); // TWheelR8
		rightTrackWheelModels[63] = new ModelRendererTurbo(this, 214, 128, textureX, textureY); // TWheelR9

		rightTrackWheelModels[0].addBox(-2F, -5F, -3F, 4, 1, 1, 0F); // TWheelR1
		rightTrackWheelModels[0].setRotationPoint(-3F, 2F, -17F);

		rightTrackWheelModels[1].addShapeBox(-3.5F, -3.5F, -3F, 5, 2, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // TWheelR10
		rightTrackWheelModels[1].setRotationPoint(49F, -4F, -17F);

		rightTrackWheelModels[2].addBox(-3.5F, -1.5F, -3F, 1, 3, 1, 0F); // TWheelR11
		rightTrackWheelModels[2].setRotationPoint(49F, -4F, -17F);

		rightTrackWheelModels[3].addShapeBox(-3.5F, 1.5F, -3F, 5, 2, 1, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // TWheelR12
		rightTrackWheelModels[3].setRotationPoint(49F, -4F, -17F);

		rightTrackWheelModels[4].addBox(-2F, 4F, -3F, 4, 1, 1, 0F); // TWheelR13
		rightTrackWheelModels[4].setRotationPoint(-3F, 2F, -17F);

		rightTrackWheelModels[5].addBox(-1.5F, 2.5F, -3F, 3, 1, 1, 0F); // TWheelR14
		rightTrackWheelModels[5].setRotationPoint(49F, -4F, -17F);

		rightTrackWheelModels[6].addShapeBox(-1.5F, 1.5F, -3F, 5, 2, 1, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // TWheelR15
		rightTrackWheelModels[6].setRotationPoint(49F, -4F, -17F);

		rightTrackWheelModels[7].addBox(2.5F, -1.5F, -3F, 1, 3, 1, 0F); // TWheelR16
		rightTrackWheelModels[7].setRotationPoint(49F, -4F, -17F);

		rightTrackWheelModels[8].addShapeBox(-1.5F, -3.5F, -3F, 5, 2, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // TWheelR17
		rightTrackWheelModels[8].setRotationPoint(49F, -4F, -17F);

		rightTrackWheelModels[9].addBox(-1.5F, -3.5F, -3F, 3, 1, 1, 0F); // TWheelR18
		rightTrackWheelModels[9].setRotationPoint(49F, -4F, -17F);

		rightTrackWheelModels[10].addShapeBox(-3.5F, 1.5F, -2F, 7, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // TWheelR19
		rightTrackWheelModels[10].setRotationPoint(49F, -4F, -17F);

		rightTrackWheelModels[11].addShapeBox(-2F, 2F, -3F, 7, 3, 1, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // TWheelR2
		rightTrackWheelModels[11].setRotationPoint(-3F, 2F, -17F);

		rightTrackWheelModels[12].addBox(-3.5F, -1.5F, -2F, 7, 3, 2, 0F); // TWheelR20
		rightTrackWheelModels[12].setRotationPoint(49F, -4F, -17F);

		rightTrackWheelModels[13].addBox(-3.5F, -1.5F, -2F, 7, 3, 2, 0F); // TWheelR21
		rightTrackWheelModels[13].setRotationPoint(11F, 4F, -17F);

		rightTrackWheelModels[14].addShapeBox(-3.5F, 1.5F, -2F, 7, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // TWheelR23
		rightTrackWheelModels[14].setRotationPoint(11F, 4F, -17F);

		rightTrackWheelModels[15].addShapeBox(-3.5F, -3.5F, -2F, 7, 2, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // TWheelR24
		rightTrackWheelModels[15].setRotationPoint(11F, 4F, -17F);

		rightTrackWheelModels[16].addBox(-3.5F, -1.5F, -3F, 1, 3, 1, 0F); // TWheelR25
		rightTrackWheelModels[16].setRotationPoint(11F, 4F, -17F);

		rightTrackWheelModels[17].addBox(2.5F, -1.5F, -3F, 1, 3, 1, 0F); // TWheelR26
		rightTrackWheelModels[17].setRotationPoint(11F, 4F, -17F);

		rightTrackWheelModels[18].addBox(-1.5F, -3.5F, -3F, 3, 1, 1, 0F); // TWheelR27
		rightTrackWheelModels[18].setRotationPoint(11F, 4F, -17F);

		rightTrackWheelModels[19].addBox(-1.5F, 2.5F, -3F, 3, 1, 1, 0F); // TWheelR28
		rightTrackWheelModels[19].setRotationPoint(11F, 4F, -17F);

		rightTrackWheelModels[20].addShapeBox(-3.5F, -3.5F, -3F, 5, 2, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // TWheelR29
		rightTrackWheelModels[20].setRotationPoint(11F, 4F, -17F);

		rightTrackWheelModels[21].addShapeBox(-5F, 2F, -2F, 10, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // TWheelR3
		rightTrackWheelModels[21].setRotationPoint(-3F, 2F, -17F);

		rightTrackWheelModels[22].addShapeBox(-1.5F, -3.5F, -3F, 5, 2, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // TWheelR30
		rightTrackWheelModels[22].setRotationPoint(11F, 4F, -17F);

		rightTrackWheelModels[23].addShapeBox(-3.5F, 1.5F, -3F, 5, 2, 1, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // TWheelR31
		rightTrackWheelModels[23].setRotationPoint(11F, 4F, -17F);

		rightTrackWheelModels[24].addShapeBox(-1.5F, 1.5F, -3F, 5, 2, 1, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // TWheelR32
		rightTrackWheelModels[24].setRotationPoint(11F, 4F, -17F);

		rightTrackWheelModels[25].addBox(-0.5F, -0.5F, -2.5F, 1, 1, 4, 0F); // TWheelR33
		rightTrackWheelModels[25].setRotationPoint(11F, 4F, -17F);

		rightTrackWheelModels[26].addBox(-0.5F, -0.5F, -2.5F, 1, 1, 1, 0F); // TWheelR34
		rightTrackWheelModels[26].setRotationPoint(-3F, 2F, -17F);

		rightTrackWheelModels[27].addBox(-0.5F, -0.5F, -2.5F, 1, 1, 4, 0F); // TWheelR35
		rightTrackWheelModels[27].setRotationPoint(25F, 4F, -17F);

		rightTrackWheelModels[28].addBox(-3.5F, -1.5F, -2F, 7, 3, 2, 0F); // TWheelR36
		rightTrackWheelModels[28].setRotationPoint(25F, 4F, -17F);

		rightTrackWheelModels[29].addShapeBox(-3.5F, -3.5F, -2F, 7, 2, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // TWheelR37
		rightTrackWheelModels[29].setRotationPoint(25F, 4F, -17F);

		rightTrackWheelModels[30].addBox(-5F, -2F, -3F, 1, 4, 1, 0F); // TWheelR38
		rightTrackWheelModels[30].setRotationPoint(-3F, 2F, -17F);

		rightTrackWheelModels[31].addShapeBox(-3.5F, 1.5F, -2F, 7, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // TWheelR39
		rightTrackWheelModels[31].setRotationPoint(25F, 4F, -17F);

		rightTrackWheelModels[32].addShapeBox(-5F, -5F, -2F, 10, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // TWheelR4
		rightTrackWheelModels[32].setRotationPoint(-3F, 2F, -17F);

		rightTrackWheelModels[33].addBox(-1.5F, 2.5F, -3F, 3, 1, 1, 0F); // TWheelR40
		rightTrackWheelModels[33].setRotationPoint(25F, 4F, -17F);

		rightTrackWheelModels[34].addBox(-1.5F, -3.5F, -3F, 3, 1, 1, 0F); // TWheelR41
		rightTrackWheelModels[34].setRotationPoint(25F, 4F, -17F);

		rightTrackWheelModels[35].addShapeBox(-1.5F, -3.5F, -3F, 5, 2, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // TWheelR42
		rightTrackWheelModels[35].setRotationPoint(25F, 4F, -17F);

		rightTrackWheelModels[36].addBox(2.5F, -1.5F, -3F, 1, 3, 1, 0F); // TWheelR43
		rightTrackWheelModels[36].setRotationPoint(25F, 4F, -17F);

		rightTrackWheelModels[37].addShapeBox(-1.5F, 1.5F, -3F, 5, 2, 1, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // TWheelR44
		rightTrackWheelModels[37].setRotationPoint(25F, 4F, -17F);

		rightTrackWheelModels[38].addShapeBox(-3.5F, 1.5F, -3F, 5, 2, 1, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // TWheelR45
		rightTrackWheelModels[38].setRotationPoint(25F, 4F, -17F);

		rightTrackWheelModels[39].addBox(-3.5F, -1.5F, -3F, 1, 3, 1, 0F); // TWheelR46
		rightTrackWheelModels[39].setRotationPoint(25F, 4F, -17F);

		rightTrackWheelModels[40].addShapeBox(-3.5F, -3.5F, -3F, 5, 2, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // TWheelR47
		rightTrackWheelModels[40].setRotationPoint(25F, 4F, -17F);

		rightTrackWheelModels[41].addBox(-0.5F, -0.5F, -2.5F, 1, 1, 4, 0F); // TWheelR48
		rightTrackWheelModels[41].setRotationPoint(39F, 4F, -17F);

		rightTrackWheelModels[42].addBox(4F, -2F, -3F, 1, 4, 1, 0F); // TWheelR49
		rightTrackWheelModels[42].setRotationPoint(-3F, 2F, -17F);

		rightTrackWheelModels[43].addBox(-5F, -2F, -2F, 10, 4, 2, 0F); // TWheelR5
		rightTrackWheelModels[43].setRotationPoint(-3F, 2F, -17F);

		rightTrackWheelModels[44].addBox(-3.5F, -1.5F, -2F, 7, 3, 2, 0F); // TWheelR50
		rightTrackWheelModels[44].setRotationPoint(39F, 4F, -17F);

		rightTrackWheelModels[45].addShapeBox(-3.5F, -3.5F, -2F, 7, 2, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // TWheelR51
		rightTrackWheelModels[45].setRotationPoint(39F, 4F, -17F);

		rightTrackWheelModels[46].addShapeBox(-3.5F, 1.5F, -2F, 7, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // TWheelR52
		rightTrackWheelModels[46].setRotationPoint(39F, 4F, -17F);

		rightTrackWheelModels[47].addBox(-1.5F, 2.5F, -3F, 3, 1, 1, 0F); // TWheelR53
		rightTrackWheelModels[47].setRotationPoint(39F, 4F, -17F);

		rightTrackWheelModels[48].addBox(-1.5F, -3.5F, -3F, 3, 1, 1, 0F); // TWheelR54
		rightTrackWheelModels[48].setRotationPoint(39F, 4F, -17F);

		rightTrackWheelModels[49].addShapeBox(-1.5F, -3.5F, -3F, 5, 2, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // TWheelR55
		rightTrackWheelModels[49].setRotationPoint(39F, 4F, -17F);

		rightTrackWheelModels[50].addBox(2.5F, -1.5F, -3F, 1, 3, 1, 0F); // TWheelR56
		rightTrackWheelModels[50].setRotationPoint(39F, 4F, -17F);

		rightTrackWheelModels[51].addShapeBox(-1.5F, 1.5F, -3F, 5, 2, 1, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // TWheelR57
		rightTrackWheelModels[51].setRotationPoint(39F, 4F, -17F);

		rightTrackWheelModels[52].addShapeBox(-3.5F, 1.5F, -3F, 5, 2, 1, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // TWheelR58
		rightTrackWheelModels[52].setRotationPoint(39F, 4F, -17F);

		rightTrackWheelModels[53].addBox(-3.5F, -1.5F, -3F, 1, 3, 1, 0F); // TWheelR59
		rightTrackWheelModels[53].setRotationPoint(39F, 4F, -17F);

		rightTrackWheelModels[54].addShapeBox(-5F, 2F, -3F, 7, 3, 1, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // TWheelR6
		rightTrackWheelModels[54].setRotationPoint(-3F, 2F, -17F);

		rightTrackWheelModels[55].addShapeBox(-3.5F, -3.5F, -3F, 5, 2, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // TWheelR60
		rightTrackWheelModels[55].setRotationPoint(39F, 4F, -17F);

		rightTrackWheelModels[56].addShapeBox(-3.5F, -3.5F, -2F, 7, 2, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // TWheelR61
		rightTrackWheelModels[56].setRotationPoint(49F, -4F, -17F);

		rightTrackWheelModels[57].addShapeBox(-1.5F, -1.5F, -1F, 3, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // TWheelR62
		rightTrackWheelModels[57].setRotationPoint(29F, -7F, -17F);

		rightTrackWheelModels[58].addBox(-1.5F, -0.5F, -1F, 3, 1, 1, 0F); // TWheelR63
		rightTrackWheelModels[58].setRotationPoint(29F, -7F, -17F);

		rightTrackWheelModels[59].addShapeBox(-1.5F, 0.5F, -1F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // TWheelR64
		rightTrackWheelModels[59].setRotationPoint(29F, -7F, -17F);

		rightTrackWheelModels[60].addBox(-0.5F, -0.5F, -1.5F, 1, 1, 3, 0F); // TWheelR65
		rightTrackWheelModels[60].setRotationPoint(29F, -7F, -17F);

		rightTrackWheelModels[61].addShapeBox(-2F, -5F, -3F, 7, 3, 1, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // TWheelR7
		rightTrackWheelModels[61].setRotationPoint(-3F, 2F, -17F);

		rightTrackWheelModels[62].addShapeBox(-5F, -5F, -3F, 7, 3, 1, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // TWheelR8
		rightTrackWheelModels[62].setRotationPoint(-3F, 2F, -17F);

		rightTrackWheelModels[63].addBox(-1.5F, -1.5F, -2.5F, 3, 3, 1, 0F); // TWheelR9
		rightTrackWheelModels[63].setRotationPoint(49F, -4F, -17F);


		leftTrackModel = new ModelRendererTurbo[9];
		leftTrackModel[0] = new ModelRendererTurbo(this, 106, 86, textureX, textureY); // TrackLeft1
		leftTrackModel[1] = new ModelRendererTurbo(this, 103, 96, textureX, textureY); // TrackLeft10
		leftTrackModel[2] = new ModelRendererTurbo(this, 43, 80, textureX, textureY); // TrackLeft2
		leftTrackModel[3] = new ModelRendererTurbo(this, 45, 88, textureX, textureY); // TrackLeft3
		leftTrackModel[4] = new ModelRendererTurbo(this, 62, 79, textureX, textureY); // TrackLeft4
		leftTrackModel[5] = new ModelRendererTurbo(this, 45, 104, textureX, textureY); // TrackLeft5
		leftTrackModel[6] = new ModelRendererTurbo(this, 79, 94, textureX, textureY); // TrackLeft6
		leftTrackModel[7] = new ModelRendererTurbo(this, 79, 83, textureX, textureY); // TrackLeft8
		leftTrackModel[8] = new ModelRendererTurbo(this, 79, 75, textureX, textureY); // TrackLeft9

		leftTrackModel[0].addBox(27F, -9.5F, 16F, 24, 1, 5, 0F); // TrackLeft1
		leftTrackModel[0].setRotationPoint(0F, 0F, 0F);
		leftTrackModel[0].rotateAngleZ = -0.01745329F;

		leftTrackModel[1].addBox(-4.76F, -4.66F, 16F, 33, 1, 5, 0F); // TrackLeft10
		leftTrackModel[1].setRotationPoint(0F, 0F, 0F);
		leftTrackModel[1].rotateAngleZ = 0.15707963F;

		leftTrackModel[2].addBox(29.35F, -42.8F, 16F, 3, 1, 5, 0F); // TrackLeft2
		leftTrackModel[2].setRotationPoint(0F, 0F, 0F);
		leftTrackModel[2].rotateAngleZ = -0.80285146F;

		leftTrackModel[3].addBox(52.25F, -6.46F, 16F, 1, 4, 5, 0F); // TrackLeft3
		leftTrackModel[3].setRotationPoint(0F, 0F, 0F);

		leftTrackModel[4].addBox(32.8F, -41.23F, 16F, 1, 16, 5, 0F); // TrackLeft4
		leftTrackModel[4].setRotationPoint(0F, 0F, 0F);
		leftTrackModel[4].rotateAngleZ = -0.83775804F;

		leftTrackModel[5].addBox(-4.65F, 7.25F, 16F, 46, 1, 5, 0F); // TrackLeft5
		leftTrackModel[5].setRotationPoint(0F, 0F, 0F);

		leftTrackModel[6].addBox(-3.44F, 8.12F, 16F, 6, 1, 5, 0F); // TrackLeft6
		leftTrackModel[6].setRotationPoint(0F, 0F, 0F);
		leftTrackModel[6].rotateAngleZ = -0.78539816F;

		leftTrackModel[7].addShapeBox(-3.52F, -9F, 16F, 4, 1, 5, 0F, .4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .4F, 0F, 0F, .4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .4F, 0F, 0F); // TrackLeft8
		leftTrackModel[7].setRotationPoint(0F, 0F, 0F);
		leftTrackModel[7].rotateAngleZ = 1.58824962F;

		leftTrackModel[8].addBox(-6.11F, -6.56F, 16F, 5, 1, 5, 0F); // TrackLeft9
		leftTrackModel[8].setRotationPoint(0F, 0F, 0F);
		leftTrackModel[8].rotateAngleZ = 0.78539816F;


		rightTrackModel = new ModelRendererTurbo[9];
		rightTrackModel[0] = new ModelRendererTurbo(this, 106, 86, textureX, textureY); // TrackRight1
		rightTrackModel[1] = new ModelRendererTurbo(this, 103, 96, textureX, textureY); // TrackRight10
		rightTrackModel[2] = new ModelRendererTurbo(this, 43, 80, textureX, textureY); // TrackRight2
		rightTrackModel[3] = new ModelRendererTurbo(this, 45, 88, textureX, textureY); // TrackRight3
		rightTrackModel[4] = new ModelRendererTurbo(this, 62, 79, textureX, textureY); // TrackRight4
		rightTrackModel[5] = new ModelRendererTurbo(this, 45, 104, textureX, textureY); // TrackRight5
		rightTrackModel[6] = new ModelRendererTurbo(this, 79, 94, textureX, textureY); // TrackRight6
		rightTrackModel[7] = new ModelRendererTurbo(this, 79, 83, textureX, textureY); // TrackRight8
		rightTrackModel[8] = new ModelRendererTurbo(this, 79, 75, textureX, textureY); // TrackRight9

		rightTrackModel[0].addBox(27F, -9.5F, -21F, 24, 1, 5, 0F); // TrackRight1
		rightTrackModel[0].setRotationPoint(0F, 0F, 0F);
		rightTrackModel[0].rotateAngleZ = -0.01745329F;

		rightTrackModel[1].addBox(-4.76F, -4.66F, -21F, 33, 1, 5, 0F); // TrackRight10
		rightTrackModel[1].setRotationPoint(0F, 0F, 0F);
		rightTrackModel[1].rotateAngleZ = 0.15707963F;

		rightTrackModel[2].addBox(29.35F, -42.8F, -21F, 3, 1, 5, 0F); // TrackRight2
		rightTrackModel[2].setRotationPoint(0F, 0F, 0F);
		rightTrackModel[2].rotateAngleZ = -0.80285146F;

		rightTrackModel[3].addBox(52.25F, -6.46F, -21F, 1, 4, 5, 0F); // TrackRight3
		rightTrackModel[3].setRotationPoint(0F, 0F, 0F);

		rightTrackModel[4].addBox(32.8F, -41.23F, -21F, 1, 16, 5, 0F); // TrackRight4
		rightTrackModel[4].setRotationPoint(0F, 0F, 0F);
		rightTrackModel[4].rotateAngleZ = -0.83775804F;

		rightTrackModel[5].addBox(-4.65F, 7.25F, -21F, 46, 1, 5, 0F); // TrackRight5
		rightTrackModel[5].setRotationPoint(0F, 0F, 0F);

		rightTrackModel[6].addBox(-3.44F, 8.12F, -21F, 6, 1, 5, 0F); // TrackRight6
		rightTrackModel[6].setRotationPoint(0F, 0F, 0F);
		rightTrackModel[6].rotateAngleZ = -0.78539816F;

		rightTrackModel[7].addShapeBox(-3.52F, -9F, -21F, 4, 1, 5, 0F, .4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .4F, 0F, 0F, .4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .4F, 0F, 0F); // TrackRight8
		rightTrackModel[7].setRotationPoint(0F, 0F, 0F);
		rightTrackModel[7].rotateAngleZ = 1.58824962F;

		rightTrackModel[8].addBox(-6.11F, -6.56F, -21F, 5, 1, 5, 0F); // TrackRight9
		rightTrackModel[8].setRotationPoint(0F, 0F, 0F);
		rightTrackModel[8].rotateAngleZ = 0.78539816F;



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}