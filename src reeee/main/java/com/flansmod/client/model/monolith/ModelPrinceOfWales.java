//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: PrinceOfWales
// Model Creator: 
// Created on: 31.05.2016 - 20:04:38
// Last changed on: 31.05.2016 - 20:04:38

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPrinceOfWales extends ModelVehicle //Same as Filename
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelPrinceOfWales() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[195];
		barrelModel = new ModelRendererTurbo[1];
		leftFrontWheelModel = new ModelRendererTurbo[1];

		initbodyModel_1();
		initbarrelModel_1();
		initleftFrontWheelModel_1();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 7
		bodyModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 8
		bodyModel[7] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Box 9
		bodyModel[8] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Box 10
		bodyModel[9] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 11
		bodyModel[10] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 186
		bodyModel[11] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 187
		bodyModel[12] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 188
		bodyModel[13] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 189
		bodyModel[14] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 190
		bodyModel[15] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 191
		bodyModel[16] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 192
		bodyModel[17] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 193
		bodyModel[18] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Box 194
		bodyModel[19] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 195
		bodyModel[20] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 196
		bodyModel[21] = new ModelRendererTurbo(this, 1217, 1, textureX, textureY); // Box 659
		bodyModel[22] = new ModelRendererTurbo(this, 1417, 1, textureX, textureY); // Box 660
		bodyModel[23] = new ModelRendererTurbo(this, 1625, 1, textureX, textureY); // Box 661
		bodyModel[24] = new ModelRendererTurbo(this, 1745, 1, textureX, textureY); // Box 662
		bodyModel[25] = new ModelRendererTurbo(this, 1369, 1, textureX, textureY); // Box 665
		bodyModel[26] = new ModelRendererTurbo(this, 1833, 1, textureX, textureY); // Box 666
		bodyModel[27] = new ModelRendererTurbo(this, 1897, 1, textureX, textureY); // Box 667
		bodyModel[28] = new ModelRendererTurbo(this, 1937, 1, textureX, textureY); // Box 668
		bodyModel[29] = new ModelRendererTurbo(this, 1833, 33, textureX, textureY); // Box 669
		bodyModel[30] = new ModelRendererTurbo(this, 625, 41, textureX, textureY); // Box 670
		bodyModel[31] = new ModelRendererTurbo(this, 1625, 41, textureX, textureY); // Box 671
		bodyModel[32] = new ModelRendererTurbo(this, 1057, 49, textureX, textureY); // Box 672
		bodyModel[33] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 673
		bodyModel[34] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 674
		bodyModel[35] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 675
		bodyModel[36] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 676
		bodyModel[37] = new ModelRendererTurbo(this, 689, 65, textureX, textureY); // Box 677
		bodyModel[38] = new ModelRendererTurbo(this, 897, 65, textureX, textureY); // Box 678
		bodyModel[39] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 678
		bodyModel[40] = new ModelRendererTurbo(this, 689, 1, textureX, textureY); // Box 680
		bodyModel[41] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 683
		bodyModel[42] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 689
		bodyModel[43] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 690
		bodyModel[44] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 691
		bodyModel[45] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Box 676
		bodyModel[46] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Box 678
		bodyModel[47] = new ModelRendererTurbo(this, 1065, 1, textureX, textureY); // Box 689
		bodyModel[48] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Box 52
		bodyModel[49] = new ModelRendererTurbo(this, 1369, 1, textureX, textureY); // Box 53
		bodyModel[50] = new ModelRendererTurbo(this, 1425, 1, textureX, textureY); // Box 54
		bodyModel[51] = new ModelRendererTurbo(this, 1449, 1, textureX, textureY); // Box 55
		bodyModel[52] = new ModelRendererTurbo(this, 1625, 1, textureX, textureY); // Box 56
		bodyModel[53] = new ModelRendererTurbo(this, 1713, 1, textureX, textureY); // Box 57
		bodyModel[54] = new ModelRendererTurbo(this, 1729, 1, textureX, textureY); // Box 58
		bodyModel[55] = new ModelRendererTurbo(this, 1745, 1, textureX, textureY); // Box 59
		bodyModel[56] = new ModelRendererTurbo(this, 1833, 1, textureX, textureY); // Box 60
		bodyModel[57] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Box 61
		bodyModel[58] = new ModelRendererTurbo(this, 1993, 1, textureX, textureY); // Box 62
		bodyModel[59] = new ModelRendererTurbo(this, 689, 9, textureX, textureY); // Box 63
		bodyModel[60] = new ModelRendererTurbo(this, 937, 17, textureX, textureY); // Box 64
		bodyModel[61] = new ModelRendererTurbo(this, 1065, 17, textureX, textureY); // Box 65
		bodyModel[62] = new ModelRendererTurbo(this, 2009, 17, textureX, textureY); // Box 66
		bodyModel[63] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 67
		bodyModel[64] = new ModelRendererTurbo(this, 1433, 25, textureX, textureY); // Box 68
		bodyModel[65] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 69
		bodyModel[66] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 70
		bodyModel[67] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 71
		bodyModel[68] = new ModelRendererTurbo(this, 1481, 65, textureX, textureY); // Box 105
		bodyModel[69] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 106
		bodyModel[70] = new ModelRendererTurbo(this, 609, 73, textureX, textureY); // Box 107
		bodyModel[71] = new ModelRendererTurbo(this, 1257, 73, textureX, textureY); // Box 108
		bodyModel[72] = new ModelRendererTurbo(this, 1857, 73, textureX, textureY); // Box 109
		bodyModel[73] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 110
		bodyModel[74] = new ModelRendererTurbo(this, 849, 73, textureX, textureY); // Box 111
		bodyModel[75] = new ModelRendererTurbo(this, 905, 65, textureX, textureY); // Box 112
		bodyModel[76] = new ModelRendererTurbo(this, 1537, 65, textureX, textureY); // Box 113
		bodyModel[77] = new ModelRendererTurbo(this, 2017, 57, textureX, textureY); // Box 114
		bodyModel[78] = new ModelRendererTurbo(this, 1585, 65, textureX, textureY); // Box 115
		bodyModel[79] = new ModelRendererTurbo(this, 1625, 65, textureX, textureY); // Box 116
		bodyModel[80] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 117
		bodyModel[81] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 118
		bodyModel[82] = new ModelRendererTurbo(this, 1369, 73, textureX, textureY); // Box 119
		bodyModel[83] = new ModelRendererTurbo(this, 609, 73, textureX, textureY); // Box 120
		bodyModel[84] = new ModelRendererTurbo(this, 1881, 1, textureX, textureY); // Box 121
		bodyModel[85] = new ModelRendererTurbo(this, 2017, 33, textureX, textureY); // Box 122
		bodyModel[86] = new ModelRendererTurbo(this, 745, 49, textureX, textureY); // Box 123
		bodyModel[87] = new ModelRendererTurbo(this, 665, 73, textureX, textureY); // Box 124
		bodyModel[88] = new ModelRendererTurbo(this, 697, 73, textureX, textureY); // Box 125
		bodyModel[89] = new ModelRendererTurbo(this, 1553, 89, textureX, textureY); // Box 126
		bodyModel[90] = new ModelRendererTurbo(this, 1993, 81, textureX, textureY); // Box 127
		bodyModel[91] = new ModelRendererTurbo(this, 1017, 73, textureX, textureY); // Box 128
		bodyModel[92] = new ModelRendererTurbo(this, 1209, 73, textureX, textureY); // Box 129
		bodyModel[93] = new ModelRendererTurbo(this, 1057, 73, textureX, textureY); // Box 130
		bodyModel[94] = new ModelRendererTurbo(this, 601, 9, textureX, textureY); // Box 131
		bodyModel[95] = new ModelRendererTurbo(this, 2025, 1, textureX, textureY); // Box 132
		bodyModel[96] = new ModelRendererTurbo(this, 1337, 73, textureX, textureY); // Box 133
		bodyModel[97] = new ModelRendererTurbo(this, 1417, 73, textureX, textureY); // Box 134
		bodyModel[98] = new ModelRendererTurbo(this, 1833, 73, textureX, textureY); // Box 135
		bodyModel[99] = new ModelRendererTurbo(this, 1057, 81, textureX, textureY); // Box 136
		bodyModel[100] = new ModelRendererTurbo(this, 1441, 9, textureX, textureY); // Box 137
		bodyModel[101] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 138
		bodyModel[102] = new ModelRendererTurbo(this, 1625, 9, textureX, textureY); // Box 139
		bodyModel[103] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 140
		bodyModel[104] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 141
		bodyModel[105] = new ModelRendererTurbo(this, 729, 73, textureX, textureY); // Box 142
		bodyModel[106] = new ModelRendererTurbo(this, 1617, 81, textureX, textureY); // Box 143
		bodyModel[107] = new ModelRendererTurbo(this, 1761, 1, textureX, textureY); // Box 144
		bodyModel[108] = new ModelRendererTurbo(this, 1577, 81, textureX, textureY); // Box 145
		bodyModel[109] = new ModelRendererTurbo(this, 801, 17, textureX, textureY); // Box 146
		bodyModel[110] = new ModelRendererTurbo(this, 1729, 25, textureX, textureY); // Box 147
		bodyModel[111] = new ModelRendererTurbo(this, 1241, 73, textureX, textureY); // Box 148
		bodyModel[112] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 149
		bodyModel[113] = new ModelRendererTurbo(this, 1417, 97, textureX, textureY); // Box 150
		bodyModel[114] = new ModelRendererTurbo(this, 1609, 105, textureX, textureY); // Box 151
		bodyModel[115] = new ModelRendererTurbo(this, 1649, 105, textureX, textureY); // Box 152
		bodyModel[116] = new ModelRendererTurbo(this, 1969, 81, textureX, textureY); // Box 153
		bodyModel[117] = new ModelRendererTurbo(this, 1705, 105, textureX, textureY); // Box 154
		bodyModel[118] = new ModelRendererTurbo(this, 713, 41, textureX, textureY); // Box 155
		bodyModel[119] = new ModelRendererTurbo(this, 1833, 41, textureX, textureY); // Box 156
		bodyModel[120] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 157
		bodyModel[121] = new ModelRendererTurbo(this, 849, 73, textureX, textureY); // Box 158
		bodyModel[122] = new ModelRendererTurbo(this, 1369, 73, textureX, textureY); // Box 159
		bodyModel[123] = new ModelRendererTurbo(this, 1081, 81, textureX, textureY); // Box 160
		bodyModel[124] = new ModelRendererTurbo(this, 1265, 73, textureX, textureY); // Box 161
		bodyModel[125] = new ModelRendererTurbo(this, 2025, 81, textureX, textureY); // Box 162
		bodyModel[126] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 163
		bodyModel[127] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 164
		bodyModel[128] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Box 165
		bodyModel[129] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 166
		bodyModel[130] = new ModelRendererTurbo(this, 1761, 105, textureX, textureY); // Box 167
		bodyModel[131] = new ModelRendererTurbo(this, 1801, 105, textureX, textureY); // Box 168
		bodyModel[132] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 169
		bodyModel[133] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Box 170
		bodyModel[134] = new ModelRendererTurbo(this, 1049, 113, textureX, textureY); // Box 171
		bodyModel[135] = new ModelRendererTurbo(this, 697, 89, textureX, textureY); // Box 172
		bodyModel[136] = new ModelRendererTurbo(this, 849, 89, textureX, textureY); // Box 173
		bodyModel[137] = new ModelRendererTurbo(this, 905, 89, textureX, textureY); // Box 174
		bodyModel[138] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 175
		bodyModel[139] = new ModelRendererTurbo(this, 1833, 105, textureX, textureY); // Box 176
		bodyModel[140] = new ModelRendererTurbo(this, 441, 113, textureX, textureY); // Box 177
		bodyModel[141] = new ModelRendererTurbo(this, 1081, 113, textureX, textureY); // Box 178
		bodyModel[142] = new ModelRendererTurbo(this, 1105, 113, textureX, textureY); // Box 179
		bodyModel[143] = new ModelRendererTurbo(this, 1129, 113, textureX, textureY); // Box 180
		bodyModel[144] = new ModelRendererTurbo(this, 1153, 113, textureX, textureY); // Box 181
		bodyModel[145] = new ModelRendererTurbo(this, 1177, 113, textureX, textureY); // Box 182
		bodyModel[146] = new ModelRendererTurbo(this, 1201, 113, textureX, textureY); // Box 183
		bodyModel[147] = new ModelRendererTurbo(this, 1225, 113, textureX, textureY); // Box 184
		bodyModel[148] = new ModelRendererTurbo(this, 1857, 73, textureX, textureY); // Box 185
		bodyModel[149] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 186
		bodyModel[150] = new ModelRendererTurbo(this, 721, 9, textureX, textureY); // Box 187
		bodyModel[151] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 188
		bodyModel[152] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 189
		bodyModel[153] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 190
		bodyModel[154] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Box 191
		bodyModel[155] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Box 192
		bodyModel[156] = new ModelRendererTurbo(this, 1961, 33, textureX, textureY); // Box 193
		bodyModel[157] = new ModelRendererTurbo(this, 1505, 65, textureX, textureY); // Box 194
		bodyModel[158] = new ModelRendererTurbo(this, 1473, 89, textureX, textureY); // Box 195
		bodyModel[159] = new ModelRendererTurbo(this, 2041, 97, textureX, textureY); // Box 196
		bodyModel[160] = new ModelRendererTurbo(this, 1017, 73, textureX, textureY); // Box 197
		bodyModel[161] = new ModelRendererTurbo(this, 1945, 1, textureX, textureY); // Box 198
		bodyModel[162] = new ModelRendererTurbo(this, 1353, 113, textureX, textureY); // Box 199
		bodyModel[163] = new ModelRendererTurbo(this, 1393, 33, textureX, textureY); // Box 200
		bodyModel[164] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Box 201
		bodyModel[165] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 202
		bodyModel[166] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Box 203
		bodyModel[167] = new ModelRendererTurbo(this, 809, 41, textureX, textureY); // Box 204
		bodyModel[168] = new ModelRendererTurbo(this, 1369, 113, textureX, textureY); // Box 205
		bodyModel[169] = new ModelRendererTurbo(this, 1017, 105, textureX, textureY); // Box 206
		bodyModel[170] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Box 207
		bodyModel[171] = new ModelRendererTurbo(this, 1449, 113, textureX, textureY); // Box 208
		bodyModel[172] = new ModelRendererTurbo(this, 1209, 49, textureX, textureY); // Box 209
		bodyModel[173] = new ModelRendererTurbo(this, 465, 113, textureX, textureY); // Box 210
		bodyModel[174] = new ModelRendererTurbo(this, 1249, 113, textureX, textureY); // Box 211
		bodyModel[175] = new ModelRendererTurbo(this, 1545, 113, textureX, textureY); // Box 212
		bodyModel[176] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 213
		bodyModel[177] = new ModelRendererTurbo(this, 1857, 113, textureX, textureY); // Box 214
		bodyModel[178] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 215
		bodyModel[179] = new ModelRendererTurbo(this, 1065, 1, textureX, textureY); // Box 216
		bodyModel[180] = new ModelRendererTurbo(this, 1097, 1, textureX, textureY); // Box 217
		bodyModel[181] = new ModelRendererTurbo(this, 1369, 1, textureX, textureY); // Box 218
		bodyModel[182] = new ModelRendererTurbo(this, 1425, 1, textureX, textureY); // Box 219
		bodyModel[183] = new ModelRendererTurbo(this, 1945, 113, textureX, textureY); // Box 220
		bodyModel[184] = new ModelRendererTurbo(this, 1217, 49, textureX, textureY); // Box 221
		bodyModel[185] = new ModelRendererTurbo(this, 1441, 1, textureX, textureY); // Box 222
		bodyModel[186] = new ModelRendererTurbo(this, 1641, 1, textureX, textureY); // Box 223
		bodyModel[187] = new ModelRendererTurbo(this, 1881, 1, textureX, textureY); // Box 224
		bodyModel[188] = new ModelRendererTurbo(this, 1905, 1, textureX, textureY); // Box 225
		bodyModel[189] = new ModelRendererTurbo(this, 1257, 121, textureX, textureY); // Box 226
		bodyModel[190] = new ModelRendererTurbo(this, 1369, 49, textureX, textureY); // Box 227
		bodyModel[191] = new ModelRendererTurbo(this, 1993, 1, textureX, textureY); // Box 228
		bodyModel[192] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 229
		bodyModel[193] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 230
		bodyModel[194] = new ModelRendererTurbo(this, 601, 9, textureX, textureY); // Box 231

		bodyModel[0].addShapeBox(0F, 0F, 0F, 47, 9, 52, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 1
		bodyModel[0].setRotationPoint(-45F, 3.5F, -26F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 40, 9, 52, 0F,0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F); // Box 2
		bodyModel[1].setRotationPoint(-85.02F, 3.5F, -26F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 78, 9, 50, 0F,0F, 0F, 1F, 0F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 1F); // Box 3
		bodyModel[2].setRotationPoint(2F, 3.52F, -25F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 30, 11, 24, 0F,0F, 0F, 7F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 7F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F); // Box 4
		bodyModel[3].setRotationPoint(110F, 1.5F, -12F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 30, 9, 26, 0F,0F, 0.5F, 9F, 0F, 2F, 6F, 0F, 2F, 6F, 0F, 0.5F, 9F, 0F, 0F, 8F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 8F); // Box 5
		bodyModel[4].setRotationPoint(79.99F, 3.5F, -13F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 16, 13, 19, 0F,0F, -1F, 2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1F, 2F, 0F, 0F, -1.5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -1.5F); // Box 7
		bodyModel[5].setRotationPoint(140F, -0.52F, -9.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 9, 13, 14, 0F,0F, -1.5F, 1F, 4F, -0.2F, -6F, 4F, -0.2F, -6F, 0F, -1.5F, 1F, 0F, 1.49F, -2.5F, 1.5F, 1F, -6F, 1.5F, 1F, -6F, 0F, 1.49F, -2.5F); // Box 8
		bodyModel[6].setRotationPoint(156F, -2F, -7F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 52, 9, 50, 0F,0F, 0F, -7F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -7F, 0F, 0F, -11F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -11F); // Box 9
		bodyModel[7].setRotationPoint(-137F, 3.5F, -25F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 43, 9, 40, 0F,0F, 0F, -13F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -13F, 0F, 0F, -16F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -16F); // Box 10
		bodyModel[8].setRotationPoint(-180.01F, 3.5F, -20F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 10, 9, 14, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 2F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, -3F, 2F, 0F, -6F); // Box 11
		bodyModel[9].setRotationPoint(-190.01F, 3.5F, -7F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, -1.2F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1.2F, -0.4F, -1.2F); // Box 186
		bodyModel[10].setRotationPoint(17.9F, -30.3F, 0F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,-0.5F, 0F, 0F, 0F, -1.3F, -0.3F, 0F, -1.3F, -0.3F, -0.5F, 0F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, -0.5F, -0.4F, 0F); // Box 187
		bodyModel[11].setRotationPoint(21.4F, -30.3F, -3F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,0.2F, -1.3F, -0.3F, 0F, -1.3F, -0.3F, 0F, -1.3F, -0.3F, 0.2F, -1.3F, -0.3F, 0.2F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0.2F, -0.4F, -0.3F); // Box 188
		bodyModel[12].setRotationPoint(23.4F, -30.3F, -3F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0.2F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0.2F, -0.1F, -0.3F, 0.2F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0.2F, -0.1F, -0.3F); // Box 189
		bodyModel[13].setRotationPoint(23.25F, -28.85F, -4.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.2F, 0F, -1.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.2F, 0F, -1.2F); // Box 190
		bodyModel[14].setRotationPoint(18.9F, -27.7F, 0F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1.2F, 0F, -1.2F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.2F, 0F, -1.2F, 0F, 0F, -0.5F); // Box 191
		bodyModel[15].setRotationPoint(21.9F, -27.7F, 0F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, -0.5F, -1.2F, 0F, -1.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.2F, 0F, -1.2F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[16].setRotationPoint(21.89F, -27.7F, -3F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,-1.2F, 0F, -1.2F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.2F, 0F, -1.2F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 193
		bodyModel[17].setRotationPoint(18.9F, -27.7F, -3.01F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,-1.2F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.2F, -0.4F, -1.2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F); // Box 194
		bodyModel[18].setRotationPoint(17.89F, -30.3F, -3F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[19].setRotationPoint(18.89F, -31.5F, -2.01F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 196
		bodyModel[20].setRotationPoint(18.89F, -31.5F, 0F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 47, 7, 52, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 659
		bodyModel[21].setRotationPoint(-45F, 12.5F, -26F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 78, 7, 50, 0F,0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, -6F, 0F, 0.5F, -6F, 0F, 0F, 1F); // Box 660
		bodyModel[22].setRotationPoint(2F, 12.52F, -25F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 30, 7, 26, 0F,0F, 0F, 8F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 8F, 0F, 0.5F, 6F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0.5F, 6F); // Box 661
		bodyModel[23].setRotationPoint(80F, 12.5F, -13F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 30, 7, 26, 0F,0F, 0F, 2F, 0F, 0F, -5.01F, 0F, 0F, -5.01F, 0F, 0F, 2F, 0F, 2F, -1F, 0F, 1.5F, -6F, 0F, 1.5F, -6F, 0F, 2F, -1F); // Box 662
		bodyModel[24].setRotationPoint(110.01F, 12.5F, -13F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 16, 10, 19, 0F,0F, -2F, -1.4F, 0F, -1.5F, -5F, 0F, -1.5F, -5F, 0F, -2F, -1.4F, 0F, 0.5F, -2.5F, 0F, 1F, -6.5F, 0F, 1F, -6.5F, 0F, 0.5F, -2.5F); // Box 665
		bodyModel[25].setRotationPoint(140.01F, 10.51F, -9.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 15, 11, 14, 0F,0F, -2F, -2.5F, -4.5F, -2F, -6F, -4.5F, -2F, -6F, 0F, -2F, -2.5F, 0F, 0.49F, -4F, -6.5F, 1F, -6F, -6.5F, 1F, -6F, 0F, 0.49F, -4F); // Box 666
		bodyModel[26].setRotationPoint(156.01F, 10F, -7.01F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 15, 4, 14, 0F,0F, 1.49F, -4F, -6.5F, 1F, -6F, -6.5F, 1F, -6F, 0F, 1.49F, -4F, 0F, 2F, -6F, -5F, 1.8F, -6.5F, -5F, 1.8F, -6.5F, 0F, 2F, -6F); // Box 667
		bodyModel[27].setRotationPoint(156.01F, 23F, -7.01F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 16, 6, 19, 0F,0F, 1.5F, -2.5F, 0F, 1F, -6.5F, 0F, 1F, -6.5F, 0F, 1.5F, -2.5F, 0F, 0F, -7.4F, 0F, 0.5F, -8.5F, 0F, 0.5F, -8.5F, 0F, 0F, -7.4F); // Box 668
		bodyModel[28].setRotationPoint(140.01F, 22.51F, -9.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 30, 8, 26, 0F,0F, 2F, -1F, 0F, 2.5F, -6F, 0F, 2.5F, -6F, 0F, 2F, -1F, 0F, -3F, -9F, 0F, -3F, -11.01F, 0F, -3F, -11.01F, 0F, -3F, -9F); // Box 669
		bodyModel[29].setRotationPoint(110.01F, 23.5F, -13F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 30, 5, 26, 0F,0F, 3.5F, 6F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 3.5F, 6F, 0F, 0F, -2F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -2F); // Box 670
		bodyModel[30].setRotationPoint(80F, 23.5F, -13F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 78, 8, 50, 0F,0F, 1F, 1F, 0F, 0.5F, -6F, 0F, 0.5F, -6F, 0F, 1F, 1F, 0F, 0F, -3F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, -3F); // Box 671
		bodyModel[31].setRotationPoint(2F, 20.52F, -25F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 47, 9, 52, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -6F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -6F); // Box 672
		bodyModel[32].setRotationPoint(-45F, 19.5F, -26F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 40, 7, 52, 0F,0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -6F); // Box 673
		bodyModel[33].setRotationPoint(-85.02F, 12.5F, -26F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 52, 7, 50, 0F,0F, 0F, -11F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -11F, 0F, 0F, -17F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -17F); // Box 674
		bodyModel[34].setRotationPoint(-137.01F, 12.5F, -25F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 43, 7, 40, 0F,12F, 0F, -19F, 0F, 0F, -6F, 0F, 0F, -6F, 12F, 0F, -19F, -6F, 0F, -19F, 0F, 0F, -12F, 0F, 0F, -12F, -6F, 0F, -19F); // Box 675
		bodyModel[35].setRotationPoint(-180.01F, 12.5F, -20.01F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 40, 9, 52, 0F,0F, 0F, -6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -6F, 0F, 0F, -15F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -15F); // Box 676
		bodyModel[36].setRotationPoint(-85.02F, 19.5F, -26F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 52, 9, 50, 0F,0F, 0F, -17F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -17F, 0F, 0F, -23F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, -23F); // Box 677
		bodyModel[37].setRotationPoint(-137F, 19.51F, -25F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 31, 9, 50, 0F,6F, 0F, -24F, 0F, 0F, -17F, 0F, 0F, -17F, 6F, 0F, -24F, -12F, 0F, -24F, 0F, 0F, -23F, 0F, 0F, -23F, -12F, 0F, -24F); // Box 678
		bodyModel[38].setRotationPoint(-168F, 19.52F, -25F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 38, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 678
		bodyModel[39].setRotationPoint(-135F, 21.52F, -12.7F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 680
		bodyModel[40].setRotationPoint(-151F, 22F, -12.2F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 2F, -3F, 0F, 2F, -3F, 0F, 2F, 3F, 0F, 2F, 3F, 0F, 3F, 0.81F, 0F, 3F, 0.8F, 0F, 3F, -1.2F, 0F, 3F, -1.2F); // Box 683
		bodyModel[41].setRotationPoint(-147F, 18F, -11.2F);

		bodyModel[42].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 689
		bodyModel[42].setRotationPoint(-150F, 22.5F, -11.7F);

		bodyModel[43].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 690
		bodyModel[43].setRotationPoint(-150F, 22.5F, -11.7F);
		bodyModel[43].rotateAngleX = 2.0943951F;

		bodyModel[44].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 691
		bodyModel[44].setRotationPoint(-150F, 22.5F, -11.7F);
		bodyModel[44].rotateAngleX = 4.1887902F;

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 676
		bodyModel[45].setRotationPoint(-87.11F, -14F, -2.01F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 9, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F); // Box 678
		bodyModel[46].setRotationPoint(65.5F, -0.5F, 0F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 9, 5, 9, 0F,0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 689
		bodyModel[47].setRotationPoint(65.5F, -0.5F, -9F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0.2F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0.2F, -0.1F, -0.3F, 0.2F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0.2F, -0.1F, -0.3F); // Box 52
		bodyModel[48].setRotationPoint(-89.75F, -11.3F, -4.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0.2F, -1.3F, -0.3F, 0F, -1.3F, -0.3F, 0F, -1.3F, -0.3F, 0.2F, -1.3F, -0.3F, 0.2F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0.2F, -0.4F, -0.3F); // Box 53
		bodyModel[49].setRotationPoint(-90.6F, -12.75F, -3F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,0F, -1.3F, -0.3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.3F, -0.3F, 0F, -0.4F, -0.3F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, -0.3F); // Box 54
		bodyModel[50].setRotationPoint(-89.6F, -12.75F, -3F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, -1.2F, 0F, -1.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -1.2F, -0.4F, -1.2F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 55
		bodyModel[51].setRotationPoint(-88.11F, -12.75F, -3F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1.2F, 0F, -1.2F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -1.2F, -0.4F, -1.2F, 0F, -0.4F, 0F); // Box 56
		bodyModel[52].setRotationPoint(-88.1F, -12.75F, 0F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1.2F, 0F, -1.2F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.2F, 0F, -1.2F, 0F, 0F, -0.5F); // Box 57
		bodyModel[53].setRotationPoint(-88.1F, -10.15F, 0F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.2F, 0F, -1.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.2F, 0F, -1.2F); // Box 58
		bodyModel[54].setRotationPoint(-91.1F, -10.15F, 0F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,-1.2F, 0F, -1.2F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.2F, 0F, -1.2F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 59
		bodyModel[55].setRotationPoint(-91.1F, -10.15F, -3.01F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, -0.5F, -1.2F, 0F, -1.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.2F, 0F, -1.2F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[56].setRotationPoint(-88.11F, -10.15F, -3F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 61
		bodyModel[57].setRotationPoint(-87.11F, -14F, 0.00999999999999979F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 9, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F); // Box 62
		bodyModel[58].setRotationPoint(56.5F, -0.5F, 0F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 9, 5, 9, 0F,-3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[59].setRotationPoint(56.5F, -0.5F, -9F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 9, 5, 9, 0F,-3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[60].setRotationPoint(-112.5F, 0.5F, -9F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 9, 5, 9, 0F,0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[61].setRotationPoint(-103.5F, 0.5F, -9F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 9, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F); // Box 66
		bodyModel[62].setRotationPoint(-103.5F, 0.5F, 0F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 9, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F); // Box 67
		bodyModel[63].setRotationPoint(-112.5F, 0.5F, 0F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 7, 9, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F); // Box 68
		bodyModel[64].setRotationPoint(43.5F, -4.5F, 0F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 7, 9, 7, 0F,0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[65].setRotationPoint(43.5F, -4.5F, -7F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 7, 9, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F); // Box 70
		bodyModel[66].setRotationPoint(36.5F, -4.5F, 0F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 7, 9, 7, 0F,-1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[67].setRotationPoint(36.5F, -4.5F, -7F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 11, 11, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[68].setRotationPoint(10.5F, -7.2F, -15F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 4, 11, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[69].setRotationPoint(6.5F, -7.2F, -13F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 10, 11, 30, 0F,0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F); // Box 107
		bodyModel[70].setRotationPoint(21.5F, -7.2F, -15F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 22, 12, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[71].setRotationPoint(-16.5F, -8.2F, -15F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 39, 9, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[72].setRotationPoint(-79.5F, -5.5F, -14F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 5, 4, 12, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[73].setRotationPoint(-43.5F, -0.5F, -6F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 12, 9, 28, 0F,0F, 0F, -12F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -11F); // Box 111
		bodyModel[74].setRotationPoint(-91F, -5.5F, -14F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 6, 9, 14, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 112
		bodyModel[75].setRotationPoint(-83F, -13.5F, -7F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 9, 7, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[76].setRotationPoint(-11.5F, -1.7F, -21F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 3, 7, 12, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[77].setRotationPoint(-2.5F, -1.7F, -21F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 9, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[78].setRotationPoint(-14.5F, -1.7F, -23F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 9, 7, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[79].setRotationPoint(-11.5F, -1.7F, 9F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 3, 7, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 117
		bodyModel[80].setRotationPoint(-2.5F, -1.7F, 9F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 9, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[81].setRotationPoint(-14.5F, -1.7F, 16F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 7, 12, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[82].setRotationPoint(-14.5F, -13.2F, -13F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 9, 16, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[83].setRotationPoint(-14.5F, -26.2F, -2.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 9, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 121
		bodyModel[84].setRotationPoint(-14.5F, -10.2F, -2.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 9, 1, 5, 0F,0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F); // Box 122
		bodyModel[85].setRotationPoint(-14.5F, -27.2F, -2.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 9, 1, 5, 0F,0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F); // Box 123
		bodyModel[86].setRotationPoint(-52F, -27.2F, -2.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 9, 18, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[87].setRotationPoint(-52F, -26.2F, -2.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 9, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 125
		bodyModel[88].setRotationPoint(-52F, -8.2F, -2.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 13, 11, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[89].setRotationPoint(10F, -14.2F, -9F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 11, 18, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 127
		bodyModel[90].setRotationPoint(7F, -14.2F, -9F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 8, 7, 18, 0F,0F, 0F, 0F, 0.4F, 0F, -6F, 0.4F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, -6F, 0.4F, 0F, -6F, 0F, 0F, 0F); // Box 128
		bodyModel[91].setRotationPoint(23F, -14.2F, -9F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 20, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[92].setRotationPoint(8.5F, -21.2F, -3F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 18, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[93].setRotationPoint(8.5F, -22.2F, -3F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 3, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[94].setRotationPoint(8.5F, -30.2F, -3F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[95].setRotationPoint(11.5F, -26.2F, -2F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 3, 4, 18, 0F,0F, 0F, -3.6F, 0.4F, 0F, -6F, 0.4F, 0F, -6F, 0F, 0F, -3.6F, 0F, 0F, -3.6F, 0.4F, 0F, -6F, 0.4F, 0F, -6F, 0F, 0F, -3.6F); // Box 133
		bodyModel[96].setRotationPoint(28F, -18.2F, -9F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 5, 4, 18, 0F,0F, 0F, -3.6F, 1F, 0F, -6F, 1F, 0F, -6F, 0F, 0F, -3.6F, 0F, 0.5F, -3.6F, 1F, 0.5F, -6F, 1F, 0.5F, -6F, 0F, 0.5F, -3.6F); // Box 134
		bodyModel[97].setRotationPoint(28.5F, -21.7F, -9F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 6, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 135
		bodyModel[98].setRotationPoint(28F, -23F, -4F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F,0F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 136
		bodyModel[99].setRotationPoint(28F, -26F, -4F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 5, 8, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[100].setRotationPoint(26F, -26F, -4F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 6, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[101].setRotationPoint(27.5F, -25.4F, -3.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 7, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[102].setRotationPoint(25.2F, -26.6F, -2.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-0.1F, 0F, 6F, -0.1F, 0F, 6F, -0.1F, 0F, 6F, -0.1F, 0F, 6F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 140
		bodyModel[103].setRotationPoint(8.5F, -30.2F, -3F);

		bodyModel[104].addShapeBox(-0.5F, 0F, -0.5F, 1, 33, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[104].setRotationPoint(3F, -39.2F, 0F);

		bodyModel[105].addShapeBox(-0.5F, 0F, -0.5F, 1, 33, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 142
		bodyModel[105].setRotationPoint(3F, -33.2F, 0F);
		bodyModel[105].rotateAngleX = 0.2268928F;
		bodyModel[105].rotateAngleZ = -0.31415927F;

		bodyModel[106].addShapeBox(-0.5F, 0F, -0.5F, 1, 33, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 143
		bodyModel[106].setRotationPoint(3F, -33.2F, 0F);
		bodyModel[106].rotateAngleX = -0.2268928F;
		bodyModel[106].rotateAngleZ = -0.31415927F;

		bodyModel[107].addShapeBox(-0.5F, 0F, -0.5F, 1, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[107].setRotationPoint(1F, -56.2F, 0F);

		bodyModel[108].addShapeBox(-0.5F, 0F, -0.5F, 8, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[108].setRotationPoint(0F, -39.2F, -2.5F);

		bodyModel[109].addShapeBox(-0.5F, 0F, -0.5F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[109].setRotationPoint(0F, -35.2F, -1.5F);

		bodyModel[110].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 11, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 147
		bodyModel[110].setRotationPoint(1F, -51.2F, -5F);

		bodyModel[111].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 21, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 148
		bodyModel[111].setRotationPoint(1F, -46.2F, -10F);

		bodyModel[112].addShapeBox(-0.5F, 0F, -0.5F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[112].setRotationPoint(0F, -66.2F, 0F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 13, 1, 22, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 150
		bodyModel[113].setRotationPoint(9F, -15.2F, -11F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 7, 1, 20, 0F,0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F); // Box 151
		bodyModel[114].setRotationPoint(2F, -15.2F, -10F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 17, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[115].setRotationPoint(7F, -18.5F, -7F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 5, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 153
		bodyModel[116].setRotationPoint(24F, -18.5F, -7F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 17, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[117].setRotationPoint(11F, -22.8F, -5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[118].setRotationPoint(-12.5F, -6.7F, 17F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 156
		bodyModel[119].setRotationPoint(-11.5F, -5.7F, 20F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 157
		bodyModel[120].setRotationPoint(-9.5F, -5.7F, 20F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[121].setRotationPoint(-12.5F, -6.7F, -22F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 159
		bodyModel[122].setRotationPoint(-11.5F, -5.7F, -30F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 160
		bodyModel[123].setRotationPoint(-9.5F, -5.7F, -30F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 5, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[124].setRotationPoint(4.5F, -1.7F, -22F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 162
		bodyModel[125].setRotationPoint(5.5F, -0.7F, -30F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 163
		bodyModel[126].setRotationPoint(7.5F, -0.7F, -30F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 5, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[127].setRotationPoint(4.5F, -1.7F, 17F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 165
		bodyModel[128].setRotationPoint(5.5F, -0.7F, 20F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 166
		bodyModel[129].setRotationPoint(7.5F, -0.7F, 20F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 9, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[130].setRotationPoint(-51.5F, -1.7F, 16F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 9, 7, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[131].setRotationPoint(-55.5F, -1.7F, 9F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 3, 7, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 169
		bodyModel[132].setRotationPoint(-58.5F, -1.7F, 9F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 9, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[133].setRotationPoint(-51.5F, -1.7F, -23F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 9, 7, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[134].setRotationPoint(-55.5F, -1.7F, -21F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 3, 7, 12, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[135].setRotationPoint(-58.5F, -1.7F, -21F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[136].setRotationPoint(-50.5F, -6.7F, 17F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 174
		bodyModel[137].setRotationPoint(-49.5F, -5.7F, 20F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 175
		bodyModel[138].setRotationPoint(-47.5F, -5.7F, 20F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 5, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[139].setRotationPoint(-68.5F, -1.7F, 17F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 177
		bodyModel[140].setRotationPoint(-67.5F, -0.7F, 20F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 178
		bodyModel[141].setRotationPoint(-65.5F, -0.7F, 20F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 5, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[142].setRotationPoint(-68.5F, -1.7F, -22F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 180
		bodyModel[143].setRotationPoint(-67.5F, -0.7F, -30F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 181
		bodyModel[144].setRotationPoint(-65.5F, -0.7F, -30F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 5, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[145].setRotationPoint(-49.5F, -6.7F, -22F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 183
		bodyModel[146].setRotationPoint(-48.5F, -5.7F, -30F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 184
		bodyModel[147].setRotationPoint(-46.5F, -5.7F, -30F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 4, 12, 0F,-0.1F, -1.1F, -0.3F, -0.1F, -1.1F, -0.3F, -0.1F, -1.1F, -0.3F, -0.1F, -1.1F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F); // Box 185
		bodyModel[148].setRotationPoint(20.1F, -34.6F, -6F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,-0.1F, -1.1F, -0.3F, -0.1F, -1.1F, -0.3F, -0.1F, -1.1F, -0.3F, -0.1F, -1.1F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F); // Box 186
		bodyModel[149].setRotationPoint(25.1F, -30.4F, -4F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 187
		bodyModel[150].setRotationPoint(8.5F, -34.2F, -1.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 188
		bodyModel[151].setRotationPoint(8.5F, -32.2F, -1.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 189
		bodyModel[152].setRotationPoint(8.5F, -33.2F, -7.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 190
		bodyModel[153].setRotationPoint(8.5F, -33.2F, 4.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[154].setRotationPoint(9.5F, -32.2F, 5.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[155].setRotationPoint(9.5F, -32.2F, -6.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[156].setRotationPoint(-84F, -16.5F, -2F);

		bodyModel[157].addShapeBox(-0.5F, 0F, -0.5F, 1, 19, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[157].setRotationPoint(-78F, -32.5F, 0F);

		bodyModel[158].addShapeBox(-0.5F, 0F, -0.5F, 1, 28, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[158].setRotationPoint(-78F, -30.5F, 0F);
		bodyModel[158].rotateAngleX = 0.2443461F;
		bodyModel[158].rotateAngleZ = 0.27925268F;

		bodyModel[159].addShapeBox(-0.5F, 0F, -0.5F, 1, 28, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[159].setRotationPoint(-78F, -30.5F, 0F);
		bodyModel[159].rotateAngleX = -0.2443461F;
		bodyModel[159].rotateAngleZ = 0.27925268F;

		bodyModel[160].addShapeBox(-0.5F, 0F, -0.5F, 1, 15, 1, 0F,-0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F); // Box 197
		bodyModel[160].setRotationPoint(-78F, -47.5F, 0F);

		bodyModel[161].addShapeBox(-0.5F, 0F, -0.5F, 1, 11, 1, 0F,-0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F); // Box 198
		bodyModel[161].setRotationPoint(-78.7F, -57.5F, 0F);

		bodyModel[162].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 9, 0F,-0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F); // Box 199
		bodyModel[162].setRotationPoint(-78F, -39.5F, -4F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[163].setRotationPoint(-49.5F, -9.5F, -13F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 18, 4, 2, 0F,0F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[164].setRotationPoint(-45.5F, -11.5F, -12F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F); // Box 202
		bodyModel[165].setRotationPoint(-27.5F, -12.5F, -12F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 203
		bodyModel[166].setRotationPoint(-20.5F, -10.5F, -11.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[167].setRotationPoint(-49.5F, -9.5F, 9F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 18, 4, 2, 0F,0F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[168].setRotationPoint(-45.5F, -11.5F, 10F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F); // Box 206
		bodyModel[169].setRotationPoint(-27.5F, -12.5F, 10F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 207
		bodyModel[170].setRotationPoint(-20.5F, -10.5F, 10.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 3, 2, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[171].setRotationPoint(-32F, 3F, -22F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 209
		bodyModel[172].setRotationPoint(169F, -11F, -0.5F);
		bodyModel[172].rotateAngleZ = -0.15707963F;

		bodyModel[173].addShapeBox(-0.5F, 0F, -0.5F, 1, 174, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 210
		bodyModel[173].setRotationPoint(1F, -56F, 0F);
		bodyModel[173].rotateAngleZ = 1.30899694F;

		bodyModel[174].addShapeBox(-0.5F, 0F, -0.5F, 1, 79, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 211
		bodyModel[174].setRotationPoint(0F, -66F, 0F);
		bodyModel[174].rotateAngleZ = -1.44862328F;

		bodyModel[175].addShapeBox(-0.5F, 0F, -0.5F, 1, 118, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 212
		bodyModel[175].setRotationPoint(-78F, -47F, 0F);
		bodyModel[175].rotateAngleZ = -1.25140107F;

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 213
		bodyModel[176].setRotationPoint(-191F, -10F, -0.5F);
		bodyModel[176].rotateAngleZ = 0.15707963F;

		bodyModel[177].addShapeBox(0F, 0F, 0F, 38, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[177].setRotationPoint(-152F, 22.52F, -5.7F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		bodyModel[178].setRotationPoint(-168F, 23F, -5.2F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 2F, -3F, 0F, 2F, -3F, 0F, 2F, 3F, 0F, 2F, 3F, 0F, 3F, 0.81F, 0F, 3F, 0.8F, 0F, 3F, -1.2F, 0F, 3F, -1.2F); // Box 216
		bodyModel[179].setRotationPoint(-164F, 19F, -4.2F);

		bodyModel[180].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[180].setRotationPoint(-167F, 23.5F, -4.7F);
		bodyModel[180].rotateAngleX = 4.1887902F;

		bodyModel[181].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[181].setRotationPoint(-167F, 23.5F, -4.7F);
		bodyModel[181].rotateAngleX = 2.0943951F;

		bodyModel[182].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[182].setRotationPoint(-167F, 23.5F, -4.7F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 38, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[183].setRotationPoint(-135F, 21.52F, 10.7F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[184].setRotationPoint(-151F, 22F, 11.2F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 2F, 3F, 0F, 2F, 3F, 0F, 2F, -3F, 0F, 2F, -3F, 0F, 3F, -1.2F, 0F, 3F, -1.2F, 0F, 3F, 0.8F, 0F, 3F, 0.81F); // Box 222
		bodyModel[185].setRotationPoint(-147F, 18F, 10.2F);

		bodyModel[186].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[186].setRotationPoint(-150F, 22.5F, 11.7F);

		bodyModel[187].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[187].setRotationPoint(-150F, 22.5F, 11.7F);
		bodyModel[187].rotateAngleX = 2.0943951F;

		bodyModel[188].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[188].setRotationPoint(-150F, 22.5F, 11.7F);
		bodyModel[188].rotateAngleX = 4.1887902F;

		bodyModel[189].addShapeBox(0F, 0F, 0F, 38, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[189].setRotationPoint(-152F, 22.52F, 3.7F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		bodyModel[190].setRotationPoint(-168F, 23F, 4.2F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 2F, 3F, 0F, 2F, 3F, 0F, 2F, -3F, 0F, 2F, -3F, 0F, 3F, -1.2F, 0F, 3F, -1.2F, 0F, 3F, 0.8F, 0F, 3F, 0.81F); // Box 228
		bodyModel[191].setRotationPoint(-164F, 19F, 3.2F);

		bodyModel[192].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[192].setRotationPoint(-167F, 23.5F, 4.7F);
		bodyModel[192].rotateAngleX = 4.1887902F;

		bodyModel[193].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[193].setRotationPoint(-167F, 23.5F, 4.7F);
		bodyModel[193].rotateAngleX = 2.0943951F;

		bodyModel[194].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[194].setRotationPoint(-167F, 23.5F, 4.7F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 232

		barrelModel[0].addShapeBox(-5F, 0F, -1F, 8, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		barrelModel[0].setRotationPoint(-170F, 19.52F, 0F);
	}

	private void initleftFrontWheelModel_1()
	{
		leftFrontWheelModel[0] = new ModelRendererTurbo(this, 1105, 1, textureX, textureY); // Flag

		leftFrontWheelModel[0].addShapeBox(-17.5F, 0F, -0.5F, 78, 39, 1, 0F,-1F, -1F, -0.49F, -60.5F, 0F, -0.49F, -60.5F, 0F, -0.49F, -1F, -1F, -0.49F, 1F, -29F, -0.49F, -63F, -30F, -0.49F, -63F, -30F, -0.49F, 1F, -29F, -0.49F); // Flag
		leftFrontWheelModel[0].setRotationPoint(0F, -63F, 0F);
		leftFrontWheelModel[0].rotateAngleZ = 0.13962634F;
	}

	private void initGuns() {
	}
	{

		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[3];
		gun_1_Model[0][0] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 98
		gun_1_Model[0][1] = new ModelRendererTurbo(this, 1457, 65, textureX, textureY); // Box 103
		gun_1_Model[0][2] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 104

		gun_1_Model[0][0].addShapeBox(0F, -2.5F, -6F, 5, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1.5F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 1.5F); // Box 98

		gun_1_Model[0][1].addShapeBox(-11F, -2.5F, -6F, 11, 5, 12, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -1F, 0F, 0F); // Box 103

		gun_1_Model[0][2].addShapeBox(-9F, -2.2F, -8F, 3, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[0])
		{
			gunPart.setRotationPoint(43.5F, -7F, 0F);
		}


		gun_1_Model[1] = new ModelRendererTurbo[4];
		gun_1_Model[1][0] = new ModelRendererTurbo(this, 985, 57, textureX, textureY); // Box 99
		gun_1_Model[1][1] = new ModelRendererTurbo(this, 1337, 65, textureX, textureY); // Box 100
		gun_1_Model[1][2] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 101
		gun_1_Model[1][3] = new ModelRendererTurbo(this, 1401, 65, textureX, textureY); // Box 102

		gun_1_Model[1][0].addShapeBox(-2F, -1F, 2F, 15, 2, 2, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 99

		gun_1_Model[1][1].addShapeBox(-4.5F, -1F, 2F, 29, 2, 2, 0F,0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F); // Box 100

		gun_1_Model[1][2].addShapeBox(-2F, -1F, -3.5F, 15, 2, 2, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 101

		gun_1_Model[1][3].addShapeBox(-4.5F, -1F, -3.5F, 29, 2, 2, 0F,0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F); // Box 102

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[1])
		{
			gunPart.setRotationPoint(43.5F, -7F, 0F);
		}


		gun_1_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun1", gun_1_Model);

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[5];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 72
		gun_2_Model[0][1] = new ModelRendererTurbo(this, 1369, 33, textureX, textureY); // Box 73
		gun_2_Model[0][2] = new ModelRendererTurbo(this, 1921, 33, textureX, textureY); // Box 74
		gun_2_Model[0][3] = new ModelRendererTurbo(this, 1977, 33, textureX, textureY); // Box 75
		gun_2_Model[0][4] = new ModelRendererTurbo(this, 713, 41, textureX, textureY); // Box 76

		gun_2_Model[0][0].addShapeBox(3F, -2.5F, 0F, 6, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0.5F, 0F, 0F, 1.5F); // Box 72

		gun_2_Model[0][1].addShapeBox(3F, -2.5F, -9F, 6, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 2.5F, 0F, 0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F); // Box 73

		gun_2_Model[0][2].addShapeBox(-12F, -2.5F, 0F, 15, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -2F, 0F, 0.5F); // Box 74

		gun_2_Model[0][3].addShapeBox(-12F, -2.5F, -9F, 15, 5, 9, 0F,-1.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75

		gun_2_Model[0][4].addShapeBox(-8.5F, -2.2F, -11F, 3, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(65.5F, -3F, 0F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[8];
		gun_2_Model[1][0] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 77
		gun_2_Model[1][1] = new ModelRendererTurbo(this, 1713, 17, textureX, textureY); // Box 78
		gun_2_Model[1][2] = new ModelRendererTurbo(this, 1897, 25, textureX, textureY); // Box 79
		gun_2_Model[1][3] = new ModelRendererTurbo(this, 937, 33, textureX, textureY); // Box 80
		gun_2_Model[1][4] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 81
		gun_2_Model[1][5] = new ModelRendererTurbo(this, 745, 41, textureX, textureY); // Box 82
		gun_2_Model[1][6] = new ModelRendererTurbo(this, 1921, 49, textureX, textureY); // Box 83
		gun_2_Model[1][7] = new ModelRendererTurbo(this, 1985, 49, textureX, textureY); // Box 84

		gun_2_Model[1][0].addShapeBox(2.5F, -1.2F, 5F, 15, 2, 2, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 77

		gun_2_Model[1][1].addShapeBox(2.5F, -1.2F, 1F, 15, 2, 2, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 78

		gun_2_Model[1][2].addShapeBox(2.5F, -1.2F, -7F, 15, 2, 2, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 79

		gun_2_Model[1][3].addShapeBox(2.5F, -1.2F, -3F, 15, 2, 2, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 80

		gun_2_Model[1][4].addShapeBox(0F, -1.2F, 5F, 29, 2, 2, 0F,0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F); // Box 81

		gun_2_Model[1][5].addShapeBox(0F, -1.2F, 1F, 29, 2, 2, 0F,0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F); // Box 82

		gun_2_Model[1][6].addShapeBox(0F, -1.2F, -3F, 29, 2, 2, 0F,0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F); // Box 83

		gun_2_Model[1][7].addShapeBox(0F, -1.2F, -7F, 29, 2, 2, 0F,0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F); // Box 84

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[1])
		{
			gunPart.setRotationPoint(65.5F, -3F, 0F);
		}


		gun_2_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun2", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[5];
		gun_3_Model[0][0] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 72
		gun_3_Model[0][1] = new ModelRendererTurbo(this, 1369, 33, textureX, textureY); // Box 73
		gun_3_Model[0][2] = new ModelRendererTurbo(this, 1921, 33, textureX, textureY); // Box 74
		gun_3_Model[0][3] = new ModelRendererTurbo(this, 1977, 33, textureX, textureY); // Box 75
		gun_3_Model[0][4] = new ModelRendererTurbo(this, 713, 41, textureX, textureY); // Box 76

		gun_3_Model[0][0].addShapeBox(3F, -2.5F, 0F, 6, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0.5F, 0F, 0F, 1.5F); // Box 72

		gun_3_Model[0][1].addShapeBox(3F, -2.5F, -9F, 6, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 2.5F, 0F, 0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F); // Box 73

		gun_3_Model[0][2].addShapeBox(-12F, -2.5F, 0F, 15, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -2F, 0F, 0.5F); // Box 74

		gun_3_Model[0][3].addShapeBox(-12F, -2.5F, -9F, 15, 5, 9, 0F,-1.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75

		gun_3_Model[0][4].addShapeBox(-8.5F, -2.2F, -11F, 3, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[0])
		{
			gunPart.setRotationPoint(-104F, -2F, 0F);
		}


		gun_3_Model[1] = new ModelRendererTurbo[8];
		gun_3_Model[1][0] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 77
		gun_3_Model[1][1] = new ModelRendererTurbo(this, 1713, 17, textureX, textureY); // Box 78
		gun_3_Model[1][2] = new ModelRendererTurbo(this, 1897, 25, textureX, textureY); // Box 79
		gun_3_Model[1][3] = new ModelRendererTurbo(this, 937, 33, textureX, textureY); // Box 80
		gun_3_Model[1][4] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 81
		gun_3_Model[1][5] = new ModelRendererTurbo(this, 745, 41, textureX, textureY); // Box 82
		gun_3_Model[1][6] = new ModelRendererTurbo(this, 1921, 49, textureX, textureY); // Box 83
		gun_3_Model[1][7] = new ModelRendererTurbo(this, 1985, 49, textureX, textureY); // Box 84

		gun_3_Model[1][0].addShapeBox(2.5F, -1.2F, 5F, 15, 2, 2, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 77

		gun_3_Model[1][1].addShapeBox(2.5F, -1.2F, 1F, 15, 2, 2, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 78

		gun_3_Model[1][2].addShapeBox(2.5F, -1.2F, -7F, 15, 2, 2, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 79

		gun_3_Model[1][3].addShapeBox(2.5F, -1.2F, -3F, 15, 2, 2, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 80

		gun_3_Model[1][4].addShapeBox(0F, -1.2F, 5F, 29, 2, 2, 0F,0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F); // Box 81

		gun_3_Model[1][5].addShapeBox(0F, -1.2F, 1F, 29, 2, 2, 0F,0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F); // Box 82

		gun_3_Model[1][6].addShapeBox(0F, -1.2F, -3F, 29, 2, 2, 0F,0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F); // Box 83

		gun_3_Model[1][7].addShapeBox(0F, -1.2F, -7F, 29, 2, 2, 0F,0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F); // Box 84

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[1])
		{
			gunPart.setRotationPoint(-104F, -2F, 0F);
		}


		gun_3_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun3", gun_3_Model);
	}
}