//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.4.2
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.TaskForce51; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSu27 extends ModelPlane //Same as Filename
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelSu27() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[320];
		bodyModel[0] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 13
		bodyModel[1] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Box 15
		bodyModel[2] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 16
		bodyModel[3] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Box 17
		bodyModel[4] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 1097, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 1185, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 1281, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 1401, 1, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 1521, 1, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 1609, 1, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 1665, 1, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 1721, 1, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 1777, 1, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 1825, 1, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 21
		bodyModel[18] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 22
		bodyModel[19] = new ModelRendererTurbo(this, 1177, 17, textureX, textureY); // Box 23
		bodyModel[20] = new ModelRendererTurbo(this, 1265, 17, textureX, textureY); // Box 24
		bodyModel[21] = new ModelRendererTurbo(this, 1353, 17, textureX, textureY); // Box 25
		bodyModel[22] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 26
		bodyModel[23] = new ModelRendererTurbo(this, 881, 25, textureX, textureY); // Box 27
		bodyModel[24] = new ModelRendererTurbo(this, 1089, 25, textureX, textureY); // Box 28
		bodyModel[25] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 29
		bodyModel[26] = new ModelRendererTurbo(this, 1449, 17, textureX, textureY); // Box 30
		bodyModel[27] = new ModelRendererTurbo(this, 1825, 17, textureX, textureY); // Box 31
		bodyModel[28] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 32
		bodyModel[29] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 33
		bodyModel[30] = new ModelRendererTurbo(this, 697, 25, textureX, textureY); // Box 34
		bodyModel[31] = new ModelRendererTurbo(this, 1505, 25, textureX, textureY); // Box 35
		bodyModel[32] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 36
		bodyModel[33] = new ModelRendererTurbo(this, 1673, 25, textureX, textureY); // Box 41
		bodyModel[34] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 42
		bodyModel[35] = new ModelRendererTurbo(this, 537, 41, textureX, textureY); // Box 43
		bodyModel[36] = new ModelRendererTurbo(this, 761, 41, textureX, textureY); // Box 44
		bodyModel[37] = new ModelRendererTurbo(this, 993, 33, textureX, textureY); // Box 45
		bodyModel[38] = new ModelRendererTurbo(this, 1345, 33, textureX, textureY); // Box 46
		bodyModel[39] = new ModelRendererTurbo(this, 1865, 41, textureX, textureY); // Box 47
		bodyModel[40] = new ModelRendererTurbo(this, 1057, 49, textureX, textureY); // Box 49
		bodyModel[41] = new ModelRendererTurbo(this, 2001, 1, textureX, textureY); // Box 50
		bodyModel[42] = new ModelRendererTurbo(this, 1737, 33, textureX, textureY); // Box 51
		bodyModel[43] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 52
		bodyModel[44] = new ModelRendererTurbo(this, 1257, 41, textureX, textureY); // Box 53
		bodyModel[45] = new ModelRendererTurbo(this, 1409, 41, textureX, textureY); // Box 54
		bodyModel[46] = new ModelRendererTurbo(this, 1497, 65, textureX, textureY); // Box 55
		bodyModel[47] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 57
		bodyModel[48] = new ModelRendererTurbo(this, 1737, 49, textureX, textureY); // Box 58
		bodyModel[49] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 59
		bodyModel[50] = new ModelRendererTurbo(this, 1785, 49, textureX, textureY); // Box 60
		bodyModel[51] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 61
		bodyModel[52] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 63
		bodyModel[53] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 73
		bodyModel[54] = new ModelRendererTurbo(this, 2017, 17, textureX, textureY); // Box 0
		bodyModel[55] = new ModelRendererTurbo(this, 1105, 81, textureX, textureY); // Box 1
		bodyModel[56] = new ModelRendererTurbo(this, 1721, 81, textureX, textureY); // Box 2
		bodyModel[57] = new ModelRendererTurbo(this, 1857, 81, textureX, textureY); // Box 3
		bodyModel[58] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Box 19
		bodyModel[59] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Box 20
		bodyModel[60] = new ModelRendererTurbo(this, 1825, 121, textureX, textureY); // Box 21
		bodyModel[61] = new ModelRendererTurbo(this, 977, 145, textureX, textureY); // Box 34
		bodyModel[62] = new ModelRendererTurbo(this, 1225, 145, textureX, textureY); // Box 35
		bodyModel[63] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 38
		bodyModel[64] = new ModelRendererTurbo(this, 1961, 81, textureX, textureY); // Box 39
		bodyModel[65] = new ModelRendererTurbo(this, 1745, 65, textureX, textureY); // Box 40
		bodyModel[66] = new ModelRendererTurbo(this, 1497, 145, textureX, textureY); // Box 41
		bodyModel[67] = new ModelRendererTurbo(this, 1353, 73, textureX, textureY); // Box 45
		bodyModel[68] = new ModelRendererTurbo(this, 1753, 137, textureX, textureY); // Box 46
		bodyModel[69] = new ModelRendererTurbo(this, 633, 81, textureX, textureY); // Box 47
		bodyModel[70] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Box 48
		bodyModel[71] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 71
		bodyModel[72] = new ModelRendererTurbo(this, 241, 177, textureX, textureY); // Box 78
		bodyModel[73] = new ModelRendererTurbo(this, 1993, 105, textureX, textureY); // Box 80
		bodyModel[74] = new ModelRendererTurbo(this, 1729, 25, textureX, textureY); // Box 81
		bodyModel[75] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 82
		bodyModel[76] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 83
		bodyModel[77] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Box 84
		bodyModel[78] = new ModelRendererTurbo(this, 1873, 1, textureX, textureY); // Box 85
		bodyModel[79] = new ModelRendererTurbo(this, 745, 1, textureX, textureY); // Box 86
		bodyModel[80] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Box 87
		bodyModel[81] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 88
		bodyModel[82] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Box 89
		bodyModel[83] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Box 90
		bodyModel[84] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 91
		bodyModel[85] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Box 92
		bodyModel[86] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Box 93
		bodyModel[87] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Box 94
		bodyModel[88] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 95
		bodyModel[89] = new ModelRendererTurbo(this, 1049, 33, textureX, textureY); // Box 96
		bodyModel[90] = new ModelRendererTurbo(this, 1089, 1, textureX, textureY); // Box 97
		bodyModel[91] = new ModelRendererTurbo(this, 361, 97, textureX, textureY); // Box 98
		bodyModel[92] = new ModelRendererTurbo(this, 1657, 25, textureX, textureY); // Box 99
		bodyModel[93] = new ModelRendererTurbo(this, 961, 41, textureX, textureY); // Box 101
		bodyModel[94] = new ModelRendererTurbo(this, 961, 57, textureX, textureY); // Box 102
		bodyModel[95] = new ModelRendererTurbo(this, 1217, 81, textureX, textureY); // Box 103
		bodyModel[96] = new ModelRendererTurbo(this, 1465, 89, textureX, textureY); // Box 104
		bodyModel[97] = new ModelRendererTurbo(this, 745, 97, textureX, textureY); // Box 105
		bodyModel[98] = new ModelRendererTurbo(this, 1409, 41, textureX, textureY); // Box 106
		bodyModel[99] = new ModelRendererTurbo(this, 1313, 97, textureX, textureY); // Box 107
		bodyModel[100] = new ModelRendererTurbo(this, 905, 97, textureX, textureY); // Box 108
		bodyModel[101] = new ModelRendererTurbo(this, 1553, 105, textureX, textureY); // Box 109
		bodyModel[102] = new ModelRendererTurbo(this, 465, 177, textureX, textureY); // Box 235
		bodyModel[103] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 2
		bodyModel[104] = new ModelRendererTurbo(this, 1825, 97, textureX, textureY); // Box 3
		bodyModel[105] = new ModelRendererTurbo(this, 2025, 49, textureX, textureY); // Box 27
		bodyModel[106] = new ModelRendererTurbo(this, 1729, 89, textureX, textureY); // Box 5
		bodyModel[107] = new ModelRendererTurbo(this, 777, 97, textureX, textureY); // Box 6
		bodyModel[108] = new ModelRendererTurbo(this, 1505, 17, textureX, textureY); // Box 7
		bodyModel[109] = new ModelRendererTurbo(this, 1801, 33, textureX, textureY); // Box 8
		bodyModel[110] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 9
		bodyModel[111] = new ModelRendererTurbo(this, 1177, 1, textureX, textureY); // Box 10
		bodyModel[112] = new ModelRendererTurbo(this, 1281, 1, textureX, textureY); // Box 11
		bodyModel[113] = new ModelRendererTurbo(this, 1321, 41, textureX, textureY); // Box 12
		bodyModel[114] = new ModelRendererTurbo(this, 1393, 1, textureX, textureY); // Box 13
		bodyModel[115] = new ModelRendererTurbo(this, 1401, 1, textureX, textureY); // Box 14
		bodyModel[116] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 15
		bodyModel[117] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 16
		bodyModel[118] = new ModelRendererTurbo(this, 1513, 1, textureX, textureY); // Box 17
		bodyModel[119] = new ModelRendererTurbo(this, 1521, 1, textureX, textureY); // Box 18
		bodyModel[120] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 19
		bodyModel[121] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 20
		bodyModel[122] = new ModelRendererTurbo(this, 1825, 1, textureX, textureY); // Box 22
		bodyModel[123] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 23
		bodyModel[124] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 24
		bodyModel[125] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 25
		bodyModel[126] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Box 27
		bodyModel[127] = new ModelRendererTurbo(this, 1601, 1, textureX, textureY); // Box 28
		bodyModel[128] = new ModelRendererTurbo(this, 1657, 1, textureX, textureY); // Box 29
		bodyModel[129] = new ModelRendererTurbo(this, 1713, 1, textureX, textureY); // Box 30
		bodyModel[130] = new ModelRendererTurbo(this, 1769, 1, textureX, textureY); // Box 31
		bodyModel[131] = new ModelRendererTurbo(this, 1929, 1, textureX, textureY); // Box 32
		bodyModel[132] = new ModelRendererTurbo(this, 1257, 17, textureX, textureY); // Box 33
		bodyModel[133] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 35
		bodyModel[134] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 36
		bodyModel[135] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 37
		bodyModel[136] = new ModelRendererTurbo(this, 1409, 57, textureX, textureY); // Box 38
		bodyModel[137] = new ModelRendererTurbo(this, 793, 73, textureX, textureY); // Box 39
		bodyModel[138] = new ModelRendererTurbo(this, 1553, 121, textureX, textureY); // Box 40
		bodyModel[139] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Box 41
		bodyModel[140] = new ModelRendererTurbo(this, 1097, 1, textureX, textureY); // Box 42
		bodyModel[141] = new ModelRendererTurbo(this, 1953, 1, textureX, textureY); // Box 43
		bodyModel[142] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 44
		bodyModel[143] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 45
		bodyModel[144] = new ModelRendererTurbo(this, 1057, 41, textureX, textureY); // Box 46
		bodyModel[145] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 47
		bodyModel[146] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 48
		bodyModel[147] = new ModelRendererTurbo(this, 1817, 1, textureX, textureY); // Box 49
		bodyModel[148] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Box 50
		bodyModel[149] = new ModelRendererTurbo(this, 1777, 1, textureX, textureY); // Box 51
		bodyModel[150] = new ModelRendererTurbo(this, 1889, 1, textureX, textureY); // Box 52
		bodyModel[151] = new ModelRendererTurbo(this, 1921, 1, textureX, textureY); // Box 53
		bodyModel[152] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 54
		bodyModel[153] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 55
		bodyModel[154] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 56
		bodyModel[155] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 57
		bodyModel[156] = new ModelRendererTurbo(this, 297, 289, textureX, textureY); // Box 214
		bodyModel[157] = new ModelRendererTurbo(this, 1225, 177, textureX, textureY); // Box 165
		bodyModel[158] = new ModelRendererTurbo(this, 793, 305, textureX, textureY); // Box 166
		bodyModel[159] = new ModelRendererTurbo(this, 1249, 49, textureX, textureY); // Box 167
		bodyModel[160] = new ModelRendererTurbo(this, 1345, 17, textureX, textureY); // Box 168
		bodyModel[161] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 169
		bodyModel[162] = new ModelRendererTurbo(this, 1649, 177, textureX, textureY); // Box 170
		bodyModel[163] = new ModelRendererTurbo(this, 1713, 177, textureX, textureY); // Box 172
		bodyModel[164] = new ModelRendererTurbo(this, 617, 185, textureX, textureY); // Box 173
		bodyModel[165] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 174
		bodyModel[166] = new ModelRendererTurbo(this, 1449, 17, textureX, textureY); // Box 175
		bodyModel[167] = new ModelRendererTurbo(this, 1513, 17, textureX, textureY); // Box 176
		bodyModel[168] = new ModelRendererTurbo(this, 825, 305, textureX, textureY); // Import Box165
		bodyModel[169] = new ModelRendererTurbo(this, 1497, 17, textureX, textureY); // Box 178
		bodyModel[170] = new ModelRendererTurbo(this, 2017, 17, textureX, textureY); // Box 179
		bodyModel[171] = new ModelRendererTurbo(this, 993, 25, textureX, textureY); // Box 180
		bodyModel[172] = new ModelRendererTurbo(this, 665, 9, textureX, textureY); // Box 181
		bodyModel[173] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 182
		bodyModel[174] = new ModelRendererTurbo(this, 1097, 9, textureX, textureY); // Box 183
		bodyModel[175] = new ModelRendererTurbo(this, 1793, 33, textureX, textureY); // Box 184
		bodyModel[176] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Box 193
		bodyModel[177] = new ModelRendererTurbo(this, 241, 233, textureX, textureY); // Box 214
		bodyModel[178] = new ModelRendererTurbo(this, 329, 233, textureX, textureY); // Box 215
		bodyModel[179] = new ModelRendererTurbo(this, 417, 233, textureX, textureY); // Box 216
		bodyModel[180] = new ModelRendererTurbo(this, 617, 233, textureX, textureY); // Box 217
		bodyModel[181] = new ModelRendererTurbo(this, 705, 233, textureX, textureY); // Box 218
		bodyModel[182] = new ModelRendererTurbo(this, 809, 233, textureX, textureY); // Box 219
		bodyModel[183] = new ModelRendererTurbo(this, 1841, 241, textureX, textureY); // Box 226
		bodyModel[184] = new ModelRendererTurbo(this, 241, 249, textureX, textureY); // Box 227
		bodyModel[185] = new ModelRendererTurbo(this, 329, 249, textureX, textureY); // Box 1
		bodyModel[186] = new ModelRendererTurbo(this, 617, 249, textureX, textureY); // Box 2
		bodyModel[187] = new ModelRendererTurbo(this, 769, 249, textureX, textureY); // Box 3
		bodyModel[188] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 4
		bodyModel[189] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 5
		bodyModel[190] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 6
		bodyModel[191] = new ModelRendererTurbo(this, 1017, 73, textureX, textureY); // Box 7
		bodyModel[192] = new ModelRendererTurbo(this, 665, 81, textureX, textureY); // Box 8
		bodyModel[193] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 9
		bodyModel[194] = new ModelRendererTurbo(this, 1001, 97, textureX, textureY); // Box 10
		bodyModel[195] = new ModelRendererTurbo(this, 1465, 105, textureX, textureY); // Box 11
		bodyModel[196] = new ModelRendererTurbo(this, 1585, 105, textureX, textureY); // Box 12
		bodyModel[197] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 13
		bodyModel[198] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 14
		bodyModel[199] = new ModelRendererTurbo(this, 905, 113, textureX, textureY); // Box 15
		bodyModel[200] = new ModelRendererTurbo(this, 1849, 49, textureX, textureY); // Box 16
		bodyModel[201] = new ModelRendererTurbo(this, 2025, 81, textureX, textureY); // Box 17
		bodyModel[202] = new ModelRendererTurbo(this, 577, 121, textureX, textureY); // Box 18
		bodyModel[203] = new ModelRendererTurbo(this, 897, 233, textureX, textureY); // Box 19
		bodyModel[204] = new ModelRendererTurbo(this, 1929, 121, textureX, textureY); // Box 20
		bodyModel[205] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 21
		bodyModel[206] = new ModelRendererTurbo(this, 385, 129, textureX, textureY); // Box 22
		bodyModel[207] = new ModelRendererTurbo(this, 89, 241, textureX, textureY); // Box 23
		bodyModel[208] = new ModelRendererTurbo(this, 1369, 177, textureX, textureY); // Box 24
		bodyModel[209] = new ModelRendererTurbo(this, 1217, 97, textureX, textureY); // Box 25
		bodyModel[210] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 26
		bodyModel[211] = new ModelRendererTurbo(this, 921, 249, textureX, textureY); // Box 27
		bodyModel[212] = new ModelRendererTurbo(this, 1529, 177, textureX, textureY); // Box 28
		bodyModel[213] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Box 29
		bodyModel[214] = new ModelRendererTurbo(this, 1825, 137, textureX, textureY); // Box 30
		bodyModel[215] = new ModelRendererTurbo(this, 1225, 249, textureX, textureY); // Box 31
		bodyModel[216] = new ModelRendererTurbo(this, 241, 209, textureX, textureY); // Box 32
		bodyModel[217] = new ModelRendererTurbo(this, 1921, 249, textureX, textureY); // Box 228
		bodyModel[218] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // Box 229
		bodyModel[219] = new ModelRendererTurbo(this, 1929, 137, textureX, textureY); // Box 230
		bodyModel[220] = new ModelRendererTurbo(this, 1201, 145, textureX, textureY); // Box 231
		bodyModel[221] = new ModelRendererTurbo(this, 1385, 81, textureX, textureY); // Box 232
		bodyModel[222] = new ModelRendererTurbo(this, 361, 129, textureX, textureY); // Box 233
		bodyModel[223] = new ModelRendererTurbo(this, 1689, 129, textureX, textureY); // Box 234
		bodyModel[224] = new ModelRendererTurbo(this, 1305, 145, textureX, textureY); // Box 235
		bodyModel[225] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 236
		bodyModel[226] = new ModelRendererTurbo(this, 137, 153, textureX, textureY); // Box 237
		bodyModel[227] = new ModelRendererTurbo(this, 881, 137, textureX, textureY); // Box 238
		bodyModel[228] = new ModelRendererTurbo(this, 1577, 257, textureX, textureY); // Box 239
		bodyModel[229] = new ModelRendererTurbo(this, 905, 137, textureX, textureY); // Box 240
		bodyModel[230] = new ModelRendererTurbo(this, 1729, 257, textureX, textureY); // Box 241
		bodyModel[231] = new ModelRendererTurbo(this, 1017, 137, textureX, textureY); // Box 242
		bodyModel[232] = new ModelRendererTurbo(this, 1753, 153, textureX, textureY); // Box 243
		bodyModel[233] = new ModelRendererTurbo(this, 1713, 209, textureX, textureY); // Box 244
		bodyModel[234] = new ModelRendererTurbo(this, 1745, 209, textureX, textureY); // Box 245
		bodyModel[235] = new ModelRendererTurbo(this, 1977, 249, textureX, textureY); // Box 246
		bodyModel[236] = new ModelRendererTurbo(this, 2017, 225, textureX, textureY); // Box 247
		bodyModel[237] = new ModelRendererTurbo(this, 481, 249, textureX, textureY); // Box 248
		bodyModel[238] = new ModelRendererTurbo(this, 1281, 249, textureX, textureY); // Box 249
		bodyModel[239] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 250
		bodyModel[240] = new ModelRendererTurbo(this, 241, 265, textureX, textureY); // Box 251
		bodyModel[241] = new ModelRendererTurbo(this, 625, 153, textureX, textureY); // Box 252
		bodyModel[242] = new ModelRendererTurbo(this, 1425, 57, textureX, textureY); // Box 253
		bodyModel[243] = new ModelRendererTurbo(this, 1393, 153, textureX, textureY); // Box 254
		bodyModel[244] = new ModelRendererTurbo(this, 1849, 57, textureX, textureY); // Box 255
		bodyModel[245] = new ModelRendererTurbo(this, 57, 257, textureX, textureY); // Box 256
		bodyModel[246] = new ModelRendererTurbo(this, 113, 257, textureX, textureY); // Box 257
		bodyModel[247] = new ModelRendererTurbo(this, 1881, 257, textureX, textureY); // Box 258
		bodyModel[248] = new ModelRendererTurbo(this, 1433, 137, textureX, textureY); // Box 259
		bodyModel[249] = new ModelRendererTurbo(this, 393, 265, textureX, textureY); // Box 260
		bodyModel[250] = new ModelRendererTurbo(this, 809, 193, textureX, textureY); // Box 261
		bodyModel[251] = new ModelRendererTurbo(this, 809, 209, textureX, textureY); // Box 262
		bodyModel[252] = new ModelRendererTurbo(this, 265, 217, textureX, textureY); // Box 263
		bodyModel[253] = new ModelRendererTurbo(this, 1785, 153, textureX, textureY); // Box 264
		bodyModel[254] = new ModelRendererTurbo(this, 1809, 153, textureX, textureY); // Box 265
		bodyModel[255] = new ModelRendererTurbo(this, 321, 161, textureX, textureY); // Box 266
		bodyModel[256] = new ModelRendererTurbo(this, 953, 233, textureX, textureY); // Box 267
		bodyModel[257] = new ModelRendererTurbo(this, 1305, 241, textureX, textureY); // Box 268
		bodyModel[258] = new ModelRendererTurbo(this, 1305, 257, textureX, textureY); // Box 269
		bodyModel[259] = new ModelRendererTurbo(this, 1409, 153, textureX, textureY); // Box 270
		bodyModel[260] = new ModelRendererTurbo(this, 617, 265, textureX, textureY); // Box 271
		bodyModel[261] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 272
		bodyModel[262] = new ModelRendererTurbo(this, 769, 265, textureX, textureY); // Box 273
		bodyModel[263] = new ModelRendererTurbo(this, 465, 169, textureX, textureY); // Box 274
		bodyModel[264] = new ModelRendererTurbo(this, 449, 265, textureX, textureY); // Box 275
		bodyModel[265] = new ModelRendererTurbo(this, 481, 265, textureX, textureY); // Box 276
		bodyModel[266] = new ModelRendererTurbo(this, 921, 265, textureX, textureY); // Box 277
		bodyModel[267] = new ModelRendererTurbo(this, 1225, 265, textureX, textureY); // Box 278
		bodyModel[268] = new ModelRendererTurbo(this, 1281, 265, textureX, textureY); // Box 279
		bodyModel[269] = new ModelRendererTurbo(this, 1905, 265, textureX, textureY); // Box 280
		bodyModel[270] = new ModelRendererTurbo(this, 1937, 265, textureX, textureY); // Box 281
		bodyModel[271] = new ModelRendererTurbo(this, 1969, 265, textureX, textureY); // Box 282
		bodyModel[272] = new ModelRendererTurbo(this, 1577, 273, textureX, textureY); // Box 283
		bodyModel[273] = new ModelRendererTurbo(this, 953, 265, textureX, textureY); // Box 284
		bodyModel[274] = new ModelRendererTurbo(this, 521, 65, textureX, textureY); // Box 285
		bodyModel[275] = new ModelRendererTurbo(this, 2025, 265, textureX, textureY); // Box 286
		bodyModel[276] = new ModelRendererTurbo(this, 1737, 65, textureX, textureY); // Box 287
		bodyModel[277] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 288
		bodyModel[278] = new ModelRendererTurbo(this, 57, 273, textureX, textureY); // Box 289
		bodyModel[279] = new ModelRendererTurbo(this, 89, 273, textureX, textureY); // Box 290
		bodyModel[280] = new ModelRendererTurbo(this, 1473, 169, textureX, textureY); // Box 291
		bodyModel[281] = new ModelRendererTurbo(this, 1729, 273, textureX, textureY); // Box 292
		bodyModel[282] = new ModelRendererTurbo(this, 1881, 281, textureX, textureY); // Box 293
		bodyModel[283] = new ModelRendererTurbo(this, 793, 289, textureX, textureY); // Box 294
		bodyModel[284] = new ModelRendererTurbo(this, 121, 273, textureX, textureY); // Box 295
		bodyModel[285] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Box 296
		bodyModel[286] = new ModelRendererTurbo(this, 369, 161, textureX, textureY); // Box 297
		bodyModel[287] = new ModelRendererTurbo(this, 1049, 169, textureX, textureY); // Box 298
		bodyModel[288] = new ModelRendererTurbo(this, 145, 177, textureX, textureY); // Box 299
		bodyModel[289] = new ModelRendererTurbo(this, 25, 289, textureX, textureY); // Box 300
		bodyModel[290] = new ModelRendererTurbo(this, 945, 289, textureX, textureY); // Box 301
		bodyModel[291] = new ModelRendererTurbo(this, 969, 289, textureX, textureY); // Box 302
		bodyModel[292] = new ModelRendererTurbo(this, 993, 289, textureX, textureY); // Box 303
		bodyModel[293] = new ModelRendererTurbo(this, 1017, 289, textureX, textureY); // Box 304
		bodyModel[294] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Box 305
		bodyModel[295] = new ModelRendererTurbo(this, 1041, 289, textureX, textureY); // Box 306
		bodyModel[296] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 307
		bodyModel[297] = new ModelRendererTurbo(this, 617, 177, textureX, textureY); // Box 308
		bodyModel[298] = new ModelRendererTurbo(this, 1065, 289, textureX, textureY); // Box 309
		bodyModel[299] = new ModelRendererTurbo(this, 1097, 289, textureX, textureY); // Box 310
		bodyModel[300] = new ModelRendererTurbo(this, 1153, 289, textureX, textureY); // Box 311
		bodyModel[301] = new ModelRendererTurbo(this, 1697, 177, textureX, textureY); // Box 312
		bodyModel[302] = new ModelRendererTurbo(this, 1185, 289, textureX, textureY); // Box 313
		bodyModel[303] = new ModelRendererTurbo(this, 1681, 289, textureX, textureY); // Box 314
		bodyModel[304] = new ModelRendererTurbo(this, 1737, 289, textureX, textureY); // Box 315
		bodyModel[305] = new ModelRendererTurbo(this, 1281, 209, textureX, textureY); // Box 316
		bodyModel[306] = new ModelRendererTurbo(this, 1769, 289, textureX, textureY); // Box 317
		bodyModel[307] = new ModelRendererTurbo(this, 1801, 289, textureX, textureY); // Box 318
		bodyModel[308] = new ModelRendererTurbo(this, 1857, 289, textureX, textureY); // Box 319
		bodyModel[309] = new ModelRendererTurbo(this, 1305, 209, textureX, textureY); // Box 320
		bodyModel[310] = new ModelRendererTurbo(this, 41, 297, textureX, textureY); // Box 321
		bodyModel[311] = new ModelRendererTurbo(this, 73, 297, textureX, textureY); // Box 322
		bodyModel[312] = new ModelRendererTurbo(this, 129, 297, textureX, textureY); // Box 323
		bodyModel[313] = new ModelRendererTurbo(this, 1649, 337, textureX, textureY); // Box 478
		bodyModel[314] = new ModelRendererTurbo(this, 1705, 337, textureX, textureY); // Box 479
		bodyModel[315] = new ModelRendererTurbo(this, 1737, 337, textureX, textureY); // Box 480
		bodyModel[316] = new ModelRendererTurbo(this, 1769, 337, textureX, textureY); // Box 481
		bodyModel[317] = new ModelRendererTurbo(this, 1849, 337, textureX, textureY); // Box 482
		bodyModel[318] = new ModelRendererTurbo(this, 1929, 337, textureX, textureY); // Box 483
		bodyModel[319] = new ModelRendererTurbo(this, 1985, 337, textureX, textureY); // Box 484

		bodyModel[0].addShapeBox(0F, 0F, 0F, 17, 15, 5, 0F, 0F, -2F, -1.5F, 0F, 0F, 0F, -8F, -1F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -8F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 13
		bodyModel[0].setRotationPoint(-155.5F, -52F, -5.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 17, 15, 5, 0F, 0F, -2F, 0.5F, -8F, -1F, 0.5F, 0F, 0F, 0F, 0F, -2F, -1.5F, 0F, 0F, 0.5F, -8F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Box 15
		bodyModel[1].setRotationPoint(-155.5F, -52F, 0.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 44, 9, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.5F, 0F, -3F, -9.5F, 0F, -3F, -9.5F, 0F, 0F, -9.5F); // Box 16
		bodyModel[2].setRotationPoint(-124.5F, -37F, -15F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 31, 11, 11, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1.5F); // Box 17
		bodyModel[3].setRotationPoint(-155.5F, -37F, -5.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 17, 11, 9, 0F, 0F, -11F, 0F, 0F, 0F, -7.5F, 0F, 0F, -1.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -11F, -7.5F, 0F, -11F, -1.5F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-155.5F, -52F, -13F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 25, 12, 9, 0F, 0F, -12F, 0F, 0F, 0F, -5F, 0F, 0F, -4F, -17F, -1F, -1.5F, 0F, 0F, 0F, 6F, -4.5F, 2F, 0F, -4.5F, -4F, -17F, 0F, -1.5F); // Box 5
		bodyModel[5].setRotationPoint(-155.5F, -53F, -13F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 31, 19, 10, 0F, 0F, -12F, -2F, 0F, -7.5F, 0F, -6F, -7.5F, -3F, -17F, -11.5F, -0.5F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, -3F, -4F, -17F, 0F, -0.5F); // Box 6
		bodyModel[6].setRotationPoint(-155.5F, -53F, -15F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 31, 11, 11, 0F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, -2F, -9.5F, 0F, -2F, -1.5F, 0F, 0F, 0F); // Box 7
		bodyModel[7].setRotationPoint(-155.5F, -37F, -15F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 44, 14, 1, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 8
		bodyModel[8].setRotationPoint(-124.5F, -51F, -15F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 50, 8, 7, 0F, 0F, 0F, -7F, 0F, -2F, 0F, 0F, -2F, -6F, 0F, 0F, 0F, -6F, -0.5F, 0F, 0F, -6F, 0F, 0F, -6F, -6F, -5F, -0.5F, -6F); // Box 9
		bodyModel[9].setRotationPoint(-130.5F, -53F, -15F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 50, 5, 7, 0F, 0F, -3F, -7F, 0F, -5F, 0F, -33F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, -7F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -2F, 0F); // Box 10
		bodyModel[10].setRotationPoint(-130.5F, -56F, -15F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 33, 7, 10, 0F, 0F, -2F, -7F, 0F, -7F, 0F, -17F, 0F, 0F, 0F, -2F, -3F, 0F, -5F, -7F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, -5F, -3F); // Box 11
		bodyModel[11].setRotationPoint(-113.5F, -58F, -15F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 17, 9, 10, 0F, -17F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[12].setRotationPoint(-97.5F, -60F, -15F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 17, 9, 9, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 14
		bodyModel[13].setRotationPoint(-97.5F, -58F, -14F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 17, 14, 9, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[14].setRotationPoint(-97.5F, -51F, -14F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 17, 23, 5, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 16
		bodyModel[15].setRotationPoint(-97.5F, -60F, -5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 17, 3, 12, 0F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 17
		bodyModel[16].setRotationPoint(-97.5F, -60F, -6F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 17, 11, 9, 0F, 0F, -2F, 0F, 0F, 0F, -1.5F, 0F, 0F, -7.5F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, -11F, -1.5F, 0F, -11F, -7.5F, 0F, 0F, 0F); // Box 21
		bodyModel[17].setRotationPoint(-155.5F, -52F, 4F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 25, 12, 9, 0F, -17F, -1F, -1.5F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, -12F, 0F, -17F, 0F, -1.5F, 0F, -4.5F, -4F, 6F, -4.5F, 2F, 0F, 0F, 0F); // Box 22
		bodyModel[18].setRotationPoint(-155.5F, -53F, 4F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 31, 19, 10, 0F, -17F, -11.5F, -0.5F, -6F, -7.5F, -3F, 0F, -7.5F, 0F, 0F, -12F, -2F, -17F, 0F, -0.5F, 0F, -3F, -4F, 0F, -3F, 0F, 0F, 0F, -2F); // Box 23
		bodyModel[19].setRotationPoint(-155.5F, -53F, 5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 31, 11, 11, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, -2F, -1.5F, 0F, -2F, -9.5F, 0F, 0F, -11F); // Box 24
		bodyModel[20].setRotationPoint(-155.5F, -37F, 4F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 44, 14, 1, 0F, 1F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[21].setRotationPoint(-124.5F, -51F, 14F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 50, 8, 7, 0F, 0F, 0F, 0F, 0F, -2F, -6F, 0F, -2F, 0F, 0F, 0F, -7F, -5F, -0.5F, -6F, 0F, -6F, -6F, 0F, -6F, 0F, -6F, -0.5F, 0F); // Box 26
		bodyModel[22].setRotationPoint(-130.5F, -53F, 8F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 50, 5, 7, 0F, 0F, -3F, 0F, -33F, 0F, 0F, 0F, -5F, 0F, 0F, -3F, -7F, 0F, -2F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -2F, -7F); // Box 27
		bodyModel[23].setRotationPoint(-130.5F, -56F, 8F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 33, 7, 10, 0F, 0F, -2F, -3F, -17F, 0F, 0F, 0F, -7F, 0F, 0F, -2F, -7F, 0F, -5F, -3F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, -5F, -7F); // Box 28
		bodyModel[24].setRotationPoint(-113.5F, -58F, 5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 17, 9, 10, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, -17F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -17F, 0F, 0F); // Box 29
		bodyModel[25].setRotationPoint(-97.5F, -60F, 5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 17, 14, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[26].setRotationPoint(-97.5F, -51F, 5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 17, 23, 5, 0F, 0F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[27].setRotationPoint(-97.5F, -60F, 0F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 17, 22, 5, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 32
		bodyModel[28].setRotationPoint(-97.5F, -59F, 0F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 20, 29, 10, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0.5F); // Box 33
		bodyModel[29].setRotationPoint(-80.5F, -60F, -5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 19, 27, 10, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[30].setRotationPoint(-60.5F, -59.5F, -5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 70, 27, 10, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[31].setRotationPoint(-41.5F, -59F, -5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 90, 20, 10, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 36
		bodyModel[32].setRotationPoint(28.5F, -51F, -5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 20, 29, 10, 0F, 0F, -9F, 0F, 0F, -9.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -5.5F, -1F, 0F, -1.5F, 0F, 0F, 0F, -0.5F); // Box 41
		bodyModel[33].setRotationPoint(-80.5F, -60F, -15F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 19, 27, 9, 0F, 0F, -9F, 0F, 0F, -9.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[34].setRotationPoint(-60.5F, -59.5F, -14F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 70, 27, 9, 0F, 0F, -9F, 0F, 0F, -14F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[35].setRotationPoint(-41.5F, -59F, -14F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 90, 20, 9, 0F, 0F, -6F, 0F, 0F, -12F, -1F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 44
		bodyModel[36].setRotationPoint(28.5F, -51F, -14F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 20, 29, 10, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -9.5F, -1F, 0F, -9F, 0F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -5.5F, -1F, 0F, -6F, 0F); // Box 45
		bodyModel[37].setRotationPoint(-80.5F, -60F, 5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 19, 27, 9, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -9.5F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -4F, 0F); // Box 46
		bodyModel[38].setRotationPoint(-60.5F, -59.5F, 5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 70, 27, 9, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -14F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -3.5F, 0F); // Box 47
		bodyModel[39].setRotationPoint(-41.5F, -59F, 5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 90, 20, 9, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -12F, -1F, 0F, -6F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -7F, 0F); // Box 49
		bodyModel[40].setRotationPoint(28.5F, -51F, 5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 20, 6, 3, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 50
		bodyModel[41].setRotationPoint(-121.5F, -44F, -18F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 22, 8, 7, 0F, 0F, -5F, -4F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, -4F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[42].setRotationPoint(-101.5F, -46F, -22F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 22, 13, 12, 0F, 0F, -9F, -4F, 0F, -10F, 0F, 0F, 1F, 1F, 0F, -4F, -1F, 0F, -4F, -4F, 0F, -3F, 0F, 0F, 0F, 1F, 0F, -1F, -1F); // Box 52
		bodyModel[43].setRotationPoint(-79.5F, -50F, -26F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 22, 14, 17, 0F, 0F, -11F, -4F, 0F, -11F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[44].setRotationPoint(-57.5F, -51F, -30F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 27, 12, 28, 0F, 0F, -9F, -11F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, -11F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[45].setRotationPoint(-35.5F, -49F, -41F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 84, 6, 28, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 55
		bodyModel[46].setRotationPoint(-8.5F, -46F, -41F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 20, 6, 3, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -3F); // Box 57
		bodyModel[47].setRotationPoint(-121.5F, -44F, 15F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 22, 8, 7, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -4F); // Box 58
		bodyModel[48].setRotationPoint(-101.5F, -46F, 15F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 22, 13, 12, 0F, 0F, -4F, -1F, 0F, 1F, 1F, 0F, -10F, 0F, 0F, -9F, -4F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, -3F, 0F, 0F, -4F, -4F); // Box 59
		bodyModel[49].setRotationPoint(-79.5F, -50F, 14F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 22, 14, 17, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -11F, 0F, 0F, -11F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -4F); // Box 60
		bodyModel[50].setRotationPoint(-57.5F, -51F, 13F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 27, 12, 28, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -8F, 0F, 0F, -9F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -11F); // Box 61
		bodyModel[51].setRotationPoint(-35.5F, -49F, 13F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 84, 6, 28, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[52].setRotationPoint(-8.5F, -46F, 13F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 17, 9, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[53].setRotationPoint(-97.5F, -58F, 5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 8, 23, 6, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, -2F, -1F, 0F, -1F, 0F, 0F, -1F, -5F, 0F, -2F, -4F); // Box 0
		bodyModel[54].setRotationPoint(-11.5F, -40F, -34F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 41, 23, 24, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, -4F); // Box 1
		bodyModel[55].setRotationPoint(-3.5F, -40F, -35F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 38, 23, 26, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, -2F); // Box 2
		bodyModel[56].setRotationPoint(37.5F, -40F, -37F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 38, 9, 26, 0F, 0F, -8F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -2F, 0F, -1F, -2F, 0F, 0F, -9F, 0F, 0F, -8F, 0F, 0F, -2F); // Box 3
		bodyModel[57].setRotationPoint(37.5F, -26F, -37F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 41, 23, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, -1F); // Box 19
		bodyModel[58].setRotationPoint(-3.5F, -40F, 11F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 38, 23, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -1F, -2F); // Box 20
		bodyModel[59].setRotationPoint(37.5F, -40F, 11F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 38, 9, 26, 0F, 0F, -9F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -2F, 0F, 0F, -2F, 0F, 0F, -8F, 0F, 0F, -9F, 0F, -1F, -2F); // Box 21
		bodyModel[60].setRotationPoint(37.5F, -26F, 11F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 32, 21, 5, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -18F, 0F); // Box 34
		bodyModel[61].setRotationPoint(-43.5F, -40F, -16F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 31, 21, 6, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -21F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -21F, 0F); // Box 35
		bodyModel[62].setRotationPoint(-42.5F, -40F, -33F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 12, 6, 5, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 38
		bodyModel[63].setRotationPoint(-1.5F, -40F, -39F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 25, 8, 7, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 39
		bodyModel[64].setRotationPoint(10.5F, -40F, -41F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 9, 8, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[65].setRotationPoint(35.5F, -40F, -41F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 31, 8, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[66].setRotationPoint(44.5F, -40F, -41F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 12, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -5F); // Box 45
		bodyModel[67].setRotationPoint(-1.5F, -40F, 34F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 25, 8, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F); // Box 46
		bodyModel[68].setRotationPoint(10.5F, -40F, 34F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 9, 8, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[69].setRotationPoint(35.5F, -40F, 34F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 31, 8, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[70].setRotationPoint(44.5F, -40F, 34F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 71
		bodyModel[71].setRotationPoint(54.5F, -40.5F, -147F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 17, 22, 5, 0F, 0F, -2F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[72].setRotationPoint(-97.5F, -59F, -5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 17, 2, 8, 0F, 0F, 0F, -2F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 80
		bodyModel[73].setRotationPoint(-97.5F, -62F, -4F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 17, 3, 4, 0F, 0F, 0F, -1.5F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 0F, -1.5F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F); // Box 81
		bodyModel[74].setRotationPoint(-97.5F, -63F, -2F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[75].setRotationPoint(-132F, -61F, -2F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F, -1F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 83
		bodyModel[76].setRotationPoint(-132F, -61F, -5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, -1F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, 0F, -3F, 0F); // Box 84
		bodyModel[77].setRotationPoint(-131F, -60F, -7F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, -1F, -1F, 0F, -1F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2.4F, -2F, -1F, -2.3F, -2F); // Box 85
		bodyModel[78].setRotationPoint(-130F, -57F, -10F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 86
		bodyModel[79].setRotationPoint(-132F, -61F, 2F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 87
		bodyModel[80].setRotationPoint(-131F, -60F, 5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F, 0F, -1F, -1F, -1F, -1F, -1F, -1F, 0F, -3F, 0F, 0F, -3F, -1F, -2.3F, -2F, 0F, -2.4F, -2F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 88
		bodyModel[81].setRotationPoint(-130F, -57F, 6F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[82].setRotationPoint(-114F, -65F, -2F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 90
		bodyModel[83].setRotationPoint(-114F, -65F, -5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 91
		bodyModel[84].setRotationPoint(-114F, -63F, -7F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 92
		bodyModel[85].setRotationPoint(-114F, -59F, -9F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[86].setRotationPoint(-114F, -65F, 2F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[87].setRotationPoint(-114F, -63F, 5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[88].setRotationPoint(-114F, -59F, 7F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 13, 2, 4, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[89].setRotationPoint(-154.5F, -52F, 2F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, -0.5F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 97
		bodyModel[90].setRotationPoint(-155.5F, -52F, 2F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 8, 15, 11, 0F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F); // Box 98
		bodyModel[91].setRotationPoint(-146.5F, -52F, -5.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 8, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[92].setRotationPoint(-138.5F, -42F, -2F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 8, 7, 4, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[93].setRotationPoint(-138.5F, -57F, -2F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 8, 4, 6, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[94].setRotationPoint(-138.5F, -54F, -8F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 8, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F); // Box 103
		bodyModel[95].setRotationPoint(-138.5F, -54F, 2F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 8, 3, 6, 0F, 0F, -1F, -4.5F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[96].setRotationPoint(-138.5F, -57F, -8F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 8, 3, 6, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F); // Box 105
		bodyModel[97].setRotationPoint(-138.5F, -57F, 2F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 8, 5, 4, 0F, 0F, -5F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 106
		bodyModel[98].setRotationPoint(-146.5F, -57F, -2F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 8, 2, 11, 0F, 0F, -2F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F); // Box 107
		bodyModel[99].setRotationPoint(-146.5F, -54F, -5.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 8, 5, 6, 0F, 0F, -5F, -5.5F, 0F, -1F, -2F, 0F, -1F, -2.5F, 0F, -5F, -0.5F, 0F, 0F, -5.5F, 0F, -2F, 0F, 0F, -2F, -2.5F, 0F, 0F, -0.5F); // Box 108
		bodyModel[100].setRotationPoint(-146.5F, -57F, -5.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 8, 5, 6, 0F, 0F, -5F, -0.5F, 0F, -1F, -2.5F, 0F, -1F, -2F, 0F, -5F, -5.5F, 0F, 0F, -0.5F, 0F, -2F, -2.5F, 0F, -2F, 0F, 0F, 0F, -5.5F); // Box 109
		bodyModel[101].setRotationPoint(-146.5F, -57F, -0.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 17, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[102].setRotationPoint(-133F, -40F, -4F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 21, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[103].setRotationPoint(-134F, -42F, -5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 21, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[104].setRotationPoint(-134F, -42F, 4F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 3, 21, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[105].setRotationPoint(-116F, -58F, -4F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 7, 16, 1, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[106].setRotationPoint(-120F, -58F, -5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 7, 16, 1, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[107].setRotationPoint(-120F, -58F, 4F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 10, 2, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 7
		bodyModel[108].setRotationPoint(-117F, -56F, -4F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[109].setRotationPoint(-117F, -44F, -4F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 10, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[110].setRotationPoint(-117F, -56F, 2F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[111].setRotationPoint(-117F, -47F, -4F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[112].setRotationPoint(-117F, -47F, 2F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 12, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[113].setRotationPoint(-117F, -56F, -2F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[114].setRotationPoint(-117.5F, -51F, -2.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[115].setRotationPoint(-117.5F, -51F, 1.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[116].setRotationPoint(-117.5F, -52F, 1.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[117].setRotationPoint(-117.5F, -52F, -2.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[118].setRotationPoint(-117.5F, -57F, -2.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[119].setRotationPoint(-117.5F, -57F, 1.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[120].setRotationPoint(-116.5F, -58F, -1.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[121].setRotationPoint(-116.5F, -58F, 0.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 8, 3, 0F, 0F, -7F, 0.5F, 0F, -7F, 0.5F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F); // Box 22
		bodyModel[122].setRotationPoint(-117.5F, -48F, -4.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 8, 3, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -7F, 0.5F, 0F, -7F, 0.5F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[123].setRotationPoint(-117.5F, -48F, 1.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[124].setRotationPoint(-116.5F, -58F, -3.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[125].setRotationPoint(-116.5F, -58F, 2.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 27
		bodyModel[126].setRotationPoint(-117F, -59F, -5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[127].setRotationPoint(-117F, -60F, -5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 29
		bodyModel[128].setRotationPoint(-117F, -59F, 3F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[129].setRotationPoint(-117F, -60F, 3F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[130].setRotationPoint(-114F, -64F, -3F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[131].setRotationPoint(-114F, -64F, 2F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[132].setRotationPoint(-114F, -63F, -2F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[133].setRotationPoint(-114F, -64F, 0.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[134].setRotationPoint(-114F, -64F, -1.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[135].setRotationPoint(-117F, -64F, -3.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[136].setRotationPoint(-117F, -62F, -3.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 39
		bodyModel[137].setRotationPoint(-117F, -60F, -3.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 14, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[138].setRotationPoint(-131F, -41F, -4F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[139].setRotationPoint(-133F, -41F, -4F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[140].setRotationPoint(-133F, -41F, 2F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[141].setRotationPoint(-133F, -42F, -1.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[142].setRotationPoint(-132F, -44F, -3.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 45
		bodyModel[143].setRotationPoint(-132F, -44F, 0.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 14, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[144].setRotationPoint(-134F, -42F, 5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 14, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[145].setRotationPoint(-134F, -42F, -6F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[146].setRotationPoint(-133F, -44F, 4F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[147].setRotationPoint(-133F, -44F, -5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[148].setRotationPoint(-128F, -44F, -6F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[149].setRotationPoint(-126F, -45F, -6F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[150].setRotationPoint(-125F, -44F, -6F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[151].setRotationPoint(-126F, -45F, 5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[152].setRotationPoint(-134F, -40F, -4F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[153].setRotationPoint(-134F, -40F, -1.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[154].setRotationPoint(-134F, -40F, 0.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[155].setRotationPoint(-134F, -40F, 3F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 226, 7, 42, 0F, 0F, 0F, -19F, -209F, 0F, -19F, -209F, 0F, -17F, 0F, 0F, -17F, 0F, 0F, -19F, -209F, 0F, -19F, -209F, 0F, -17F, 0F, 0F, -17F); // Box 214
		bodyModel[156].setRotationPoint(-130F, -44F, -33F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 8, 4, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[157].setRotationPoint(-138.5F, -50F, -8F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 226, 7, 42, 0F, 0F, 0F, -17F, -209F, 0F, -17F, -209F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, -17F, -209F, 0F, -17F, -209F, 0F, -19F, 0F, 0F, -19F); // Box 166
		bodyModel[158].setRotationPoint(-130F, -44F, -9F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, 0F, -1F, -2F, -1F, 1F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[159].setRotationPoint(-130.5F, -48F, -12F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[160].setRotationPoint(-123.5F, -49F, -11F);
		bodyModel[160].rotateAngleZ = -0.71558499F;

		bodyModel[161].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[161].setRotationPoint(-138.5F, -46F, -2F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 15, 21, 16, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 170
		bodyModel[162].setRotationPoint(-112.5F, -58F, -8F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 17, 21, 7, 0F, 0F, -4F, -4F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[163].setRotationPoint(-112.5F, -56F, -14F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 17, 21, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -3F); // Box 173
		bodyModel[164].setRotationPoint(-112.5F, -56F, 7F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[165].setRotationPoint(-131F, -61F, -1.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -1F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 175
		bodyModel[166].setRotationPoint(-131F, -61F, -4.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 176
		bodyModel[167].setRotationPoint(-131F, -61F, 2.5F);

		bodyModel[168].addShapeBox(0F, -256.5F, -256F, 0, 512, 512, 0F, 0F, -255F, -254F, 0F, -255F, -254F, 0F, -255F, -254F, 0F, -255F, -254F, 0F, -254F, -254F, 0F, -254F, -254F, 0F, -254F, -254F, 0F, -254F, -254F); // Import Box165
		bodyModel[168].setRotationPoint(-131.5F, -58.5F, 0F);
		bodyModel[168].rotateAngleZ = -0.06981317F;

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[169].setRotationPoint(-132F, -60F, -3F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[170].setRotationPoint(-132F, -60F, 2F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[171].setRotationPoint(-108F, -56F, -10F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 181
		bodyModel[172].setRotationPoint(-112F, -56F, -10F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[173].setRotationPoint(-108F, -56F, 9F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 183
		bodyModel[174].setRotationPoint(-112F, -56F, 9F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[175].setRotationPoint(-48.5F, -63.5F, -0.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 12, 4, 5, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[176].setRotationPoint(-55.5F, -2F, -5.5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 40, 10, 1, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 214
		bodyModel[177].setRotationPoint(-5F, -20F, -25F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 40, 10, 1, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		bodyModel[178].setRotationPoint(-5F, -20F, -26F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 40, 10, 1, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 216
		bodyModel[179].setRotationPoint(-12F, -33F, 0F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 40, 10, 1, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[180].setRotationPoint(-12F, -33F, -1F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 40, 10, 1, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 218
		bodyModel[181].setRotationPoint(78F, -33F, 0F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 40, 10, 1, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[182].setRotationPoint(78F, -33F, -1F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 40, 10, 1, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[183].setRotationPoint(-5F, -20F, 24F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 40, 10, 1, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 227
		bodyModel[184].setRotationPoint(-5F, -20F, 25F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 69, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[185].setRotationPoint(-12F, -12F, -28F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 69, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[186].setRotationPoint(-12F, -10F, -28F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 69, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 3
		bodyModel[187].setRotationPoint(-12F, -8F, -28F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 4
		bodyModel[188].setRotationPoint(-17F, -10F, -28F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 5
		bodyModel[189].setRotationPoint(-17F, -12F, -28F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Box 6
		bodyModel[190].setRotationPoint(-22F, -10F, -27F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F, 0F, -2F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F); // Box 7
		bodyModel[191].setRotationPoint(-22F, -11F, -27F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -2F); // Box 8
		bodyModel[192].setRotationPoint(-22F, -9F, -27F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F); // Box 9
		bodyModel[193].setRotationPoint(-17F, -8F, -28F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[194].setRotationPoint(-14F, -12F, -28F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[195].setRotationPoint(-14F, -10F, -28F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 12
		bodyModel[196].setRotationPoint(-14F, -8F, -28F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[197].setRotationPoint(57F, -12F, -28F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[198].setRotationPoint(57F, -10F, -28F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 15
		bodyModel[199].setRotationPoint(57F, -8F, -28F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[200].setRotationPoint(57F, -10F, -24F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 17
		bodyModel[201].setRotationPoint(-13F, -13F, -23F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 8, 5, 4, 0F, 0F, -1F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, -3F); // Box 18
		bodyModel[202].setRotationPoint(3F, -15F, -23F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 23, 7, 4, 0F, -2F, -5F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -2F, -5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 19
		bodyModel[203].setRotationPoint(28.95F, -17F, -23F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 8, 7, 5, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 20
		bodyModel[204].setRotationPoint(51.95F, -17F, -23F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[205].setRotationPoint(-13F, -13F, -29F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 8, 5, 4, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -2F, -2F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 22
		bodyModel[206].setRotationPoint(3F, -15F, -31F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 23, 7, 4, 0F, -2F, -5F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, -5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[207].setRotationPoint(28.95F, -17F, -31F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 8, 7, 5, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[208].setRotationPoint(51.95F, -17F, -32F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F); // Box 25
		bodyModel[209].setRotationPoint(-13F, -8F, -29F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 8, 5, 4, 0F, -2F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -2F); // Box 26
		bodyModel[210].setRotationPoint(3F, -8F, -31F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 23, 7, 4, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, -5F, 0F); // Box 27
		bodyModel[211].setRotationPoint(28.95F, -8F, -31F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 8, 7, 5, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F); // Box 28
		bodyModel[212].setRotationPoint(51.95F, -8F, -32F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 29
		bodyModel[213].setRotationPoint(-13F, -8F, -23F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 8, 5, 4, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, -3F, 0F, -1F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 30
		bodyModel[214].setRotationPoint(3F, -8F, -23F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 23, 7, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -2F, -5F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -2F, -5F, -3F); // Box 31
		bodyModel[215].setRotationPoint(28.95F, -10F, -23F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 8, 7, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 32
		bodyModel[216].setRotationPoint(51.95F, -10F, -23F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 23, 7, 4, 0F, -2F, -5F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, -5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		bodyModel[217].setRotationPoint(11.95F, -28F, -6F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[218].setRotationPoint(-31F, -23F, -3F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[219].setRotationPoint(-31F, -21F, -3F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 231
		bodyModel[220].setRotationPoint(-34F, -21F, -3F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -2F); // Box 232
		bodyModel[221].setRotationPoint(-39F, -20F, -2F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Box 233
		bodyModel[222].setRotationPoint(-39F, -21F, -2F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F, 0F, -2F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F); // Box 234
		bodyModel[223].setRotationPoint(-39F, -22F, -2F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 235
		bodyModel[224].setRotationPoint(-34F, -23F, -3F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F); // Box 236
		bodyModel[225].setRotationPoint(-34F, -19F, -3F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 237
		bodyModel[226].setRotationPoint(-31F, -19F, -3F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F); // Box 238
		bodyModel[227].setRotationPoint(-30F, -19F, -4F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 69, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[228].setRotationPoint(-29F, -21F, -3F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[229].setRotationPoint(-30F, -24F, -4F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 69, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[230].setRotationPoint(-29F, -23F, -3F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 242
		bodyModel[231].setRotationPoint(-30F, -24F, 2F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 8, 5, 4, 0F, 0F, -1F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, -3F); // Box 243
		bodyModel[232].setRotationPoint(-14F, -26F, 2F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 8, 5, 4, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -2F, -2F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 244
		bodyModel[233].setRotationPoint(-14F, -26F, -6F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 8, 5, 4, 0F, -2F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -2F); // Box 245
		bodyModel[234].setRotationPoint(-14F, -19F, -6F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 23, 7, 4, 0F, -2F, -5F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -2F, -5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 246
		bodyModel[235].setRotationPoint(11.95F, -28F, 2F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 8, 7, 5, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 247
		bodyModel[236].setRotationPoint(34.95F, -28F, 2F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 8, 7, 5, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[237].setRotationPoint(34.95F, -28F, -7F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 8, 7, 5, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F); // Box 249
		bodyModel[238].setRotationPoint(34.95F, -19F, -7F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 23, 7, 4, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, -5F, 0F); // Box 250
		bodyModel[239].setRotationPoint(11.95F, -19F, -6F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 69, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 251
		bodyModel[240].setRotationPoint(-29F, -19F, -3F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 252
		bodyModel[241].setRotationPoint(40F, -19F, -3F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[242].setRotationPoint(40F, -20F, 0F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[243].setRotationPoint(40F, -23F, -3F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[244].setRotationPoint(40F, -21F, -3F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 23, 7, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -2F, -5F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -2F, -5F, -3F); // Box 256
		bodyModel[245].setRotationPoint(11.95F, -21F, 2F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 8, 7, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 257
		bodyModel[246].setRotationPoint(34.95F, -21F, 2F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 8, 5, 4, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, -3F, 0F, -1F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 258
		bodyModel[247].setRotationPoint(-14F, -19F, 2F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 259
		bodyModel[248].setRotationPoint(-30F, -19F, 2F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 23, 7, 4, 0F, -2F, -5F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, -5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[249].setRotationPoint(97.95F, -28F, -6F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[250].setRotationPoint(55F, -23F, -3F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[251].setRotationPoint(55F, -21F, -3F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 263
		bodyModel[252].setRotationPoint(52F, -21F, -3F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -2F); // Box 264
		bodyModel[253].setRotationPoint(47F, -20F, -2F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Box 265
		bodyModel[254].setRotationPoint(47F, -21F, -2F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F, 0F, -2F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F); // Box 266
		bodyModel[255].setRotationPoint(47F, -22F, -2F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 267
		bodyModel[256].setRotationPoint(52F, -23F, -3F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F); // Box 268
		bodyModel[257].setRotationPoint(52F, -19F, -3F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 269
		bodyModel[258].setRotationPoint(55F, -19F, -3F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F); // Box 270
		bodyModel[259].setRotationPoint(56F, -19F, -4F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 69, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[260].setRotationPoint(57F, -21F, -3F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[261].setRotationPoint(56F, -24F, -4F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 69, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[262].setRotationPoint(57F, -23F, -3F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 274
		bodyModel[263].setRotationPoint(56F, -24F, 2F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 8, 5, 4, 0F, 0F, -1F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, -3F); // Box 275
		bodyModel[264].setRotationPoint(72F, -26F, 2F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 8, 5, 4, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -2F, -2F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 276
		bodyModel[265].setRotationPoint(72F, -26F, -6F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 8, 5, 4, 0F, -2F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -2F); // Box 277
		bodyModel[266].setRotationPoint(72F, -19F, -6F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 23, 7, 4, 0F, -2F, -5F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -2F, -5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 278
		bodyModel[267].setRotationPoint(97.95F, -28F, 2F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 8, 7, 5, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 279
		bodyModel[268].setRotationPoint(120.95F, -28F, 2F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 8, 7, 5, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		bodyModel[269].setRotationPoint(120.95F, -28F, -7F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 8, 7, 5, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F); // Box 281
		bodyModel[270].setRotationPoint(120.95F, -19F, -7F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 23, 7, 4, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, -5F, 0F); // Box 282
		bodyModel[271].setRotationPoint(97.95F, -19F, -6F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 69, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 283
		bodyModel[272].setRotationPoint(57F, -19F, -3F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 284
		bodyModel[273].setRotationPoint(126F, -19F, -3F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[274].setRotationPoint(126F, -21F, 1F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[275].setRotationPoint(126F, -23F, -3F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[276].setRotationPoint(126F, -21F, -3F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 23, 7, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -2F, -5F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -2F, -5F, -3F); // Box 288
		bodyModel[277].setRotationPoint(97.95F, -21F, 2F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 8, 7, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 289
		bodyModel[278].setRotationPoint(120.95F, -21F, 2F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 8, 5, 4, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, -3F, 0F, -1F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 290
		bodyModel[279].setRotationPoint(72F, -19F, 2F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 291
		bodyModel[280].setRotationPoint(56F, -19F, 2F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 69, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[281].setRotationPoint(-12F, -12F, 22F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 69, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[282].setRotationPoint(-12F, -10F, 22F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 69, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 294
		bodyModel[283].setRotationPoint(-12F, -8F, 22F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 295
		bodyModel[284].setRotationPoint(-17F, -10F, 22F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 296
		bodyModel[285].setRotationPoint(-17F, -12F, 22F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Box 297
		bodyModel[286].setRotationPoint(-22F, -10F, 23F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F, 0F, -2F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F); // Box 298
		bodyModel[287].setRotationPoint(-22F, -11F, 23F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -2F); // Box 299
		bodyModel[288].setRotationPoint(-22F, -9F, 23F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F); // Box 300
		bodyModel[289].setRotationPoint(-17F, -8F, 22F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[290].setRotationPoint(-14F, -12F, 22F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[291].setRotationPoint(-14F, -10F, 22F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 303
		bodyModel[292].setRotationPoint(-14F, -8F, 22F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[293].setRotationPoint(57F, -12F, 22F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		bodyModel[294].setRotationPoint(57F, -10F, 26F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 306
		bodyModel[295].setRotationPoint(57F, -8F, 22F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[296].setRotationPoint(57F, -10F, 22F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[297].setRotationPoint(-13F, -13F, 21F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 8, 5, 4, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -2F, -2F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 309
		bodyModel[298].setRotationPoint(3F, -15F, 19F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 23, 7, 4, 0F, -2F, -5F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, -5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyModel[299].setRotationPoint(28.95F, -17F, 19F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 8, 7, 5, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[300].setRotationPoint(51.95F, -17F, 18F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 312
		bodyModel[301].setRotationPoint(-13F, -13F, 27F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 8, 5, 4, 0F, 0F, -1F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, -3F); // Box 313
		bodyModel[302].setRotationPoint(3F, -15F, 27F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 23, 7, 4, 0F, -2F, -5F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -2F, -5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 314
		bodyModel[303].setRotationPoint(28.95F, -17F, 27F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 8, 7, 5, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 315
		bodyModel[304].setRotationPoint(51.95F, -17F, 27F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 316
		bodyModel[305].setRotationPoint(-13F, -8F, 27F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 8, 5, 4, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, -3F, 0F, -1F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 317
		bodyModel[306].setRotationPoint(3F, -8F, 27F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 23, 7, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -2F, -5F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -2F, -5F, -3F); // Box 318
		bodyModel[307].setRotationPoint(28.95F, -8F, 27F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 8, 7, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 319
		bodyModel[308].setRotationPoint(51.95F, -8F, 27F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F); // Box 320
		bodyModel[309].setRotationPoint(-13F, -8F, 21F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 8, 5, 4, 0F, -2F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -2F); // Box 321
		bodyModel[310].setRotationPoint(3F, -8F, 19F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 23, 7, 4, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, -5F, 0F); // Box 322
		bodyModel[311].setRotationPoint(28.95F, -10F, 19F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 8, 7, 5, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F); // Box 323
		bodyModel[312].setRotationPoint(51.95F, -10F, 18F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 8, 2, 19, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F); // Box 478
		bodyModel[313].setRotationPoint(-11.5F, -19F, -34F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 8, 23, 5, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -4F); // Box 479
		bodyModel[314].setRotationPoint(-11.5F, -40F, -16F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 8, 23, 6, 0F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -4F, 0F, -1F, -5F, 0F, -1F, 0F, 0F, -2F, -1F); // Box 480
		bodyModel[315].setRotationPoint(-11.5F, -40F, 28F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 32, 21, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -18F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -20F, -4F); // Box 481
		bodyModel[316].setRotationPoint(-43.5F, -40F, 11F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 31, 21, 6, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -21F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -21F, -5F); // Box 482
		bodyModel[317].setRotationPoint(-42.5F, -40F, 27F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 8, 2, 19, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, -1F); // Box 483
		bodyModel[318].setRotationPoint(-11.5F, -19F, 15F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 8, 23, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 484
		bodyModel[319].setRotationPoint(-11.5F, -40F, 11F);


		noseModel = new ModelRendererTurbo[19];
		noseModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		noseModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 2
		noseModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 3
		noseModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 4
		noseModel[4] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 5
		noseModel[5] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 6
		noseModel[6] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 7
		noseModel[7] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 7
		noseModel[8] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 8
		noseModel[9] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 9
		noseModel[10] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 10
		noseModel[11] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 11
		noseModel[12] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 12
		noseModel[13] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Box 0
		noseModel[14] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Box 2
		noseModel[15] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Box 3
		noseModel[16] = new ModelRendererTurbo(this, 1889, 1, textureX, textureY); // Box 18
		noseModel[17] = new ModelRendererTurbo(this, 1929, 1, textureX, textureY); // Box 19
		noseModel[18] = new ModelRendererTurbo(this, 1961, 1, textureX, textureY); // Box 20

		noseModel[0].addShapeBox(0F, 0F, 0F, 10, 6, 2, 0F, 0F, -6F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 0
		noseModel[0].setRotationPoint(-211.5F, -34.5F, -1F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 10, 6, 3, 0F, 0F, -6F, -3F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, -6F, 0F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 2
		noseModel[1].setRotationPoint(-211.5F, -34.5F, -3F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F); // Box 3
		noseModel[2].setRotationPoint(-211.5F, -28.5F, -1F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -2F, -3F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, -2F, 0F); // Box 4
		noseModel[3].setRotationPoint(-211.5F, -29.5F, -3F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 10, 6, 3, 0F, 0F, -6F, 0F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, -6F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -3F); // Box 5
		noseModel[4].setRotationPoint(-211.5F, -34.5F, 0F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, -2F, -3F); // Box 6
		noseModel[5].setRotationPoint(-211.5F, -29.5F, 0F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F, 0F, -2.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, -0.5F); // Box 7
		noseModel[6].setRotationPoint(-219.5F, -29.5F, -0.5F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 15, 17, 4, 0F, 0F, -6.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, -1F, 0F, -2.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -1F); // Box 7
		noseModel[7].setRotationPoint(-201.5F, -41F, -2F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 15, 17, 6, 0F, 0F, -9.5F, -4F, 0F, -6F, 0F, 0F, 0F, -1F, 0F, -6.5F, 0F, 0F, -5.5F, -4F, 0F, -6F, 0F, 0F, 0F, -1F, 0F, -2.5F, 0F); // Box 8
		noseModel[8].setRotationPoint(-201.5F, -41F, -7F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 15, 17, 6, 0F, 0F, -6.5F, 0F, 0F, 0F, -1F, 0F, -6F, 0F, 0F, -9.5F, -4F, 0F, -2.5F, 0F, 0F, 0F, -1F, 0F, -6F, 0F, 0F, -5.5F, -4F); // Box 9
		noseModel[9].setRotationPoint(-201.5F, -41F, 1F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 10, 20, 6, 0F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 10
		noseModel[10].setRotationPoint(-186.5F, -44F, -3F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 7, 22, 7, 0F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F); // Box 11
		noseModel[11].setRotationPoint(-176.5F, -46F, -3.5F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 14, 25, 8, 0F, 0F, -4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, -0.5F); // Box 12
		noseModel[12].setRotationPoint(-169.5F, -50F, -4F);

		noseModel[13].addShapeBox(0F, 0F, 0F, 10, 20, 7, 0F, 0F, -9F, -2F, 0F, -7F, 0F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, -6F, -2F, 0F, -7F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 0
		noseModel[13].setRotationPoint(-186.5F, -44F, -9F);

		noseModel[14].addShapeBox(0F, 0F, 0F, 7, 22, 8, 0F, 0F, -9F, -1.5F, 0F, -8F, 0F, 0F, 0F, -1F, 0F, -2F, -0.5F, 0F, -7F, -1.5F, 0F, -8F, 0F, 0F, -0.5F, -1F, 0F, 0F, -0.5F); // Box 2
		noseModel[14].setRotationPoint(-176.5F, -46F, -10.5F);

		noseModel[15].addShapeBox(0F, 0F, 0F, 14, 25, 10, 0F, 0F, -12F, -2.5F, 0F, -9F, 0F, 0F, 0F, -1F, 0F, -4F, -0.5F, 0F, -7F, -2.5F, 0F, -9F, 0F, 0F, -1F, -1F, 0F, 0.5F, -0.5F); // Box 3
		noseModel[15].setRotationPoint(-169.5F, -50F, -13F);

		noseModel[16].addShapeBox(0F, 0F, 0F, 10, 20, 7, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, -7F, 0F, 0F, -9F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -7F, 0F, 0F, -6F, -2F); // Box 18
		noseModel[16].setRotationPoint(-186.5F, -44F, 2F);

		noseModel[17].addShapeBox(0F, 0F, 0F, 7, 22, 8, 0F, 0F, -2F, -0.5F, 0F, 0F, -1F, 0F, -8F, 0F, 0F, -9F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -8F, 0F, 0F, -7F, -1.5F); // Box 19
		noseModel[17].setRotationPoint(-176.5F, -46F, 2.5F);

		noseModel[18].addShapeBox(0F, 0F, 0F, 14, 25, 10, 0F, 0F, -4F, -0.5F, 0F, 0F, -1F, 0F, -9F, 0F, 0F, -12F, -2.5F, 0F, 0.5F, -0.5F, 0F, -1F, -1F, 0F, -9F, 0F, 0F, -7F, -2.5F); // Box 20
		noseModel[18].setRotationPoint(-169.5F, -50F, 3F);


		tailModel = new ModelRendererTurbo[49];
		tailModel[0] = new ModelRendererTurbo(this, 689, 73, textureX, textureY); // Box 64
		tailModel[1] = new ModelRendererTurbo(this, 809, 73, textureX, textureY); // Box 65
		tailModel[2] = new ModelRendererTurbo(this, 913, 73, textureX, textureY); // Box 66
		tailModel[3] = new ModelRendererTurbo(this, 1249, 73, textureX, textureY); // Box 67
		tailModel[4] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 68
		tailModel[5] = new ModelRendererTurbo(this, 1697, 65, textureX, textureY); // Box 69
		tailModel[6] = new ModelRendererTurbo(this, 521, 81, textureX, textureY); // Box 70
		tailModel[7] = new ModelRendererTurbo(this, 1025, 81, textureX, textureY); // Box 71
		tailModel[8] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 72
		tailModel[9] = new ModelRendererTurbo(this, 1329, 89, textureX, textureY); // Box 4
		tailModel[10] = new ModelRendererTurbo(this, 609, 97, textureX, textureY); // Box 5
		tailModel[11] = new ModelRendererTurbo(this, 769, 97, textureX, textureY); // Box 6
		tailModel[12] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 9
		tailModel[13] = new ModelRendererTurbo(this, 929, 97, textureX, textureY); // Box 10
		tailModel[14] = new ModelRendererTurbo(this, 1241, 97, textureX, textureY); // Box 11
		tailModel[15] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 12
		tailModel[16] = new ModelRendererTurbo(this, 1017, 105, textureX, textureY); // Box 13
		tailModel[17] = new ModelRendererTurbo(this, 1465, 105, textureX, textureY); // Box 14
		tailModel[18] = new ModelRendererTurbo(this, 1577, 105, textureX, textureY); // Box 15
		tailModel[19] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 16
		tailModel[20] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 17
		tailModel[21] = new ModelRendererTurbo(this, 1065, 129, textureX, textureY); // Box 22
		tailModel[22] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 23
		tailModel[23] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 24
		tailModel[24] = new ModelRendererTurbo(this, 1961, 121, textureX, textureY); // Box 25
		tailModel[25] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Box 26
		tailModel[26] = new ModelRendererTurbo(this, 649, 137, textureX, textureY); // Box 27
		tailModel[27] = new ModelRendererTurbo(this, 737, 137, textureX, textureY); // Box 28
		tailModel[28] = new ModelRendererTurbo(this, 809, 137, textureX, textureY); // Box 29
		tailModel[29] = new ModelRendererTurbo(this, 1305, 137, textureX, textureY); // Box 30
		tailModel[30] = new ModelRendererTurbo(this, 1665, 137, textureX, textureY); // Box 31
		tailModel[31] = new ModelRendererTurbo(this, 881, 145, textureX, textureY); // Box 32
		tailModel[32] = new ModelRendererTurbo(this, 1417, 145, textureX, textureY); // Box 33
		tailModel[33] = new ModelRendererTurbo(this, 1825, 81, textureX, textureY); // Box 42
		tailModel[34] = new ModelRendererTurbo(this, 1577, 145, textureX, textureY); // Box 43
		tailModel[35] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 44
		tailModel[36] = new ModelRendererTurbo(this, 577, 105, textureX, textureY); // Box 49
		tailModel[37] = new ModelRendererTurbo(this, 1505, 161, textureX, textureY); // Box 50
		tailModel[38] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 51
		tailModel[39] = new ModelRendererTurbo(this, 1873, 33, textureX, textureY); // Box 53
		tailModel[40] = new ModelRendererTurbo(this, 1961, 97, textureX, textureY); // Box 55
		tailModel[41] = new ModelRendererTurbo(this, 1913, 161, textureX, textureY); // Box 56
		tailModel[42] = new ModelRendererTurbo(this, 737, 169, textureX, textureY); // Box 57
		tailModel[43] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 58
		tailModel[44] = new ModelRendererTurbo(this, 833, 169, textureX, textureY); // Box 59
		tailModel[45] = new ModelRendererTurbo(this, 1665, 105, textureX, textureY); // Box 60
		tailModel[46] = new ModelRendererTurbo(this, 1873, 17, textureX, textureY); // Box 62
		tailModel[47] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 63
		tailModel[48] = new ModelRendererTurbo(this, 1417, 169, textureX, textureY); // Box 64

		tailModel[0].addShapeBox(0F, 0F, 0F, 46, 13, 10, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 64
		tailModel[0].setRotationPoint(118.5F, -43F, -5F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 41, 12, 10, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 65
		tailModel[1].setRotationPoint(164.5F, -42F, -5F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 46, 13, 8, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 66
		tailModel[2].setRotationPoint(118.5F, -43F, -13F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 41, 12, 10, 0F, 0F, -4F, 0F, 0F, -4F, -6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, -4F, -6F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 67
		tailModel[3].setRotationPoint(164.5F, -42F, -13F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 14, 12, 6, 0F, 0F, 0F, 0F, 0F, -7F, -3F, 0F, -7F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -3F, 0F, -5F, -3F, 0F, 0F, 0F); // Box 68
		tailModel[4].setRotationPoint(205.5F, -42F, -3F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 14, 12, 7, 0F, 0F, -4F, 0F, 0F, -7F, -7F, 0F, -7F, 0F, 0F, 0F, -3F, 0F, -4F, 0F, 0F, -5F, -7F, 0F, -5F, 0F, 0F, 0F, -3F); // Box 69
		tailModel[5].setRotationPoint(205.5F, -42F, -7F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 46, 13, 8, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 70
		tailModel[6].setRotationPoint(118.5F, -43F, 5F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 41, 12, 10, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -4F, -6F, 0F, -4F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -4F, -6F, 0F, -4F, 0F); // Box 71
		tailModel[7].setRotationPoint(164.5F, -42F, 3F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 14, 12, 7, 0F, 0F, 0F, -3F, 0F, -7F, 0F, 0F, -7F, -7F, 0F, -4F, 0F, 0F, 0F, -3F, 0F, -5F, 0F, 0F, -5F, -7F, 0F, -4F, 0F); // Box 72
		tailModel[8].setRotationPoint(205.5F, -42F, 0F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 53, 14, 26, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		tailModel[9].setRotationPoint(75.5F, -40F, -37F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 53, 9, 26, 0F, 0F, -3F, -10F, 0F, 0F, -9F, 0F, 0F, -8F, 0F, -3F, -8F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 5
		tailModel[10].setRotationPoint(75.5F, -45F, -37F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 53, 9, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, -1F, -9F, 0F, -1F, -9F, 0F, 0F, -8F); // Box 6
		tailModel[11].setRotationPoint(75.5F, -26F, -37F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 28, 27, 9, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, -1F); // Box 9
		tailModel[12].setRotationPoint(128.5F, -45F, -28F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 28, 27, 14, 0F, 0F, -9F, 0F, 0F, -3F, -5F, 0F, -1F, -1F, 0F, 0F, -5F, 0F, -8F, 0F, 0F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 10
		tailModel[13].setRotationPoint(128.5F, -45F, -37F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 28, 27, 14, 0F, 0F, 0F, -6F, 0F, -1F, -1F, 0F, -3F, -5F, 0F, -9F, 0F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, -2F, -5F, 0F, -8F, 0F); // Box 11
		tailModel[14].setRotationPoint(128.5F, -45F, -25F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 28, 22, 5, 0F, 0F, -6F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, -6F, -5F, 0F, -6F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, -6F, -5F); // Box 12
		tailModel[15].setRotationPoint(128.5F, -42F, -37F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 28, 22, 5, 0F, 0F, -6F, -5F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -6F, 0F, 0F, -6F, -5F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -6F, 0F); // Box 13
		tailModel[16].setRotationPoint(128.5F, -42F, -16F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 29, 11, 26, 0F, 0F, 0F, -5F, 0F, -2F, -7F, 0F, -2F, -6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 14
		tailModel[17].setRotationPoint(156.5F, -42F, -37F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 29, 11, 26, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -3F, -7F, 0F, -3F, -6F, 0F, 0F, -5F); // Box 15
		tailModel[18].setRotationPoint(156.5F, -31F, -37F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 29, 4, 16, 0F, 0F, 0F, -8F, 0F, -2F, -8F, 0F, -2F, -8F, 0F, 0F, -8F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -2F, 0F); // Box 16
		tailModel[19].setRotationPoint(156.5F, -44F, -32F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 29, 4, 16, 0F, 0F, -2F, 0F, 0F, 1F, -2F, 0F, 1F, -1F, 0F, -2F, 0F, 0F, 0F, -9F, 0F, -3F, -8F, 0F, -3F, -8F, 0F, 0F, -7F); // Box 17
		tailModel[20].setRotationPoint(156.5F, -22F, -32F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 53, 14, 26, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		tailModel[21].setRotationPoint(75.5F, -40F, 11F);

		tailModel[22].addShapeBox(0F, 0F, 0F, 53, 9, 26, 0F, 0F, -3F, -8F, 0F, 0F, -8F, 0F, 0F, -9F, 0F, -3F, -10F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 23
		tailModel[22].setRotationPoint(75.5F, -45F, 11F);

		tailModel[23].addShapeBox(0F, 0F, 0F, 53, 9, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -1F, -9F, 0F, -1F, -9F, 0F, 0F, -9F); // Box 24
		tailModel[23].setRotationPoint(75.5F, -26F, 11F);

		tailModel[24].addShapeBox(0F, 0F, 0F, 28, 27, 9, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 25
		tailModel[24].setRotationPoint(128.5F, -45F, 19F);

		tailModel[25].addShapeBox(0F, 0F, 0F, 28, 27, 14, 0F, 0F, 0F, -5F, 0F, -1F, -1F, 0F, -3F, -5F, 0F, -9F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, -8F, 0F); // Box 26
		tailModel[25].setRotationPoint(128.5F, -45F, 23F);

		tailModel[26].addShapeBox(0F, 0F, 0F, 28, 27, 14, 0F, 0F, -9F, 0F, 0F, -3F, -5F, 0F, -1F, -1F, 0F, 0F, -6F, 0F, -8F, 0F, 0F, -2F, -5F, 0F, 0F, -2F, 0F, 0F, -5F); // Box 27
		tailModel[26].setRotationPoint(128.5F, -45F, 11F);

		tailModel[27].addShapeBox(0F, 0F, 0F, 28, 22, 5, 0F, 0F, -6F, -5F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -6F, 0F, 0F, -6F, -5F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -6F, 0F); // Box 28
		tailModel[27].setRotationPoint(128.5F, -42F, 32F);

		tailModel[28].addShapeBox(0F, 0F, 0F, 28, 22, 5, 0F, 0F, -6F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, -6F, -5F, 0F, -6F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, -6F, -5F); // Box 29
		tailModel[28].setRotationPoint(128.5F, -42F, 11F);

		tailModel[29].addShapeBox(0F, 0F, 0F, 29, 11, 26, 0F, 0F, 0F, -5F, 0F, -2F, -6F, 0F, -2F, -7F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 30
		tailModel[29].setRotationPoint(156.5F, -42F, 11F);

		tailModel[30].addShapeBox(0F, 0F, 0F, 29, 11, 26, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -3F, -6F, 0F, -3F, -7F, 0F, 0F, -5F); // Box 31
		tailModel[30].setRotationPoint(156.5F, -31F, 11F);

		tailModel[31].addShapeBox(0F, 0F, 0F, 29, 4, 16, 0F, 0F, 0F, -8F, 0F, -2F, -8F, 0F, -2F, -8F, 0F, 0F, -8F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -2F, 0F); // Box 32
		tailModel[31].setRotationPoint(156.5F, -44F, 16F);

		tailModel[32].addShapeBox(0F, 0F, 0F, 29, 4, 16, 0F, 0F, -2F, 0F, 0F, 1F, -1F, 0F, 1F, -2F, 0F, -2F, 0F, 0F, 0F, -7F, 0F, -3F, -8F, 0F, -3F, -8F, 0F, 0F, -9F); // Box 33
		tailModel[32].setRotationPoint(156.5F, -22F, 16F);

		tailModel[33].addShapeBox(0F, 0F, 0F, 23, 9, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		tailModel[33].setRotationPoint(75.5F, -42F, -41F);

		tailModel[34].addShapeBox(0F, 0F, 0F, 46, 9, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		tailModel[34].setRotationPoint(98.5F, -42F, -41F);

		tailModel[35].addShapeBox(0F, 0F, 0F, 11, 9, 5, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 44
		tailModel[35].setRotationPoint(144.5F, -42F, -41F);

		tailModel[36].addShapeBox(0F, 0F, 0F, 23, 9, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		tailModel[36].setRotationPoint(75.5F, -42F, 36F);

		tailModel[37].addShapeBox(0F, 0F, 0F, 46, 9, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		tailModel[37].setRotationPoint(98.5F, -42F, 36F);

		tailModel[38].addShapeBox(0F, 0F, 0F, 11, 9, 5, 0F, 0F, 0F, 0F, 0F, -8F, -3F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		tailModel[38].setRotationPoint(144.5F, -42F, 36F);

		tailModel[39].addShapeBox(0F, 0F, 0F, 33, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 53
		tailModel[39].setRotationPoint(145.5F, -34F, -41F);

		tailModel[40].addShapeBox(0F, 0F, 0F, 33, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		tailModel[40].setRotationPoint(145.5F, -34F, 35F);

		tailModel[41].addShapeBox(0F, 0F, 0F, 44, 21, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -13F, 0F, 0F); // Box 56
		tailModel[41].setRotationPoint(94.5F, -33F, -40.5F);

		tailModel[42].addShapeBox(0F, 0F, 0F, 44, 21, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -13F, 0F, 0F); // Box 57
		tailModel[42].setRotationPoint(94.5F, -33F, 39.5F);

		tailModel[43].addShapeBox(0F, 0F, 0F, 5, 10, 2, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		tailModel[43].setRotationPoint(142.5F, -110F, -41F);

		tailModel[44].addShapeBox(0F, 0F, 0F, 68, 58, 2, 0F, -43F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -43F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F); // Box 59
		tailModel[44].setRotationPoint(74.5F, -100F, -41F);

		tailModel[45].addShapeBox(0F, 0F, 0F, 25, 16, 2, 0F, -11.5F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -11.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		tailModel[45].setRotationPoint(117.5F, -116F, -41F);

		tailModel[46].addShapeBox(0F, 0F, 0F, 5, 10, 2, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		tailModel[46].setRotationPoint(142.5F, -110F, 39F);

		tailModel[47].addShapeBox(0F, 0F, 0F, 68, 58, 2, 0F, -43F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -43F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F); // Box 63
		tailModel[47].setRotationPoint(74.5F, -100F, 39F);

		tailModel[48].addShapeBox(0F, 0F, 0F, 25, 16, 2, 0F, -11.5F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -11.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		tailModel[48].setRotationPoint(117.5F, -116F, 39F);


		leftWingModel = new ModelRendererTurbo[112];
		leftWingModel[0] = new ModelRendererTurbo(this, 873, 177, textureX, textureY); // Box 66
		leftWingModel[1] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 68
		leftWingModel[2] = new ModelRendererTurbo(this, 529, 25, textureX, textureY); // Box 69
		leftWingModel[3] = new ModelRendererTurbo(this, 761, 33, textureX, textureY); // Box 70
		leftWingModel[4] = new ModelRendererTurbo(this, 617, 217, textureX, textureY); // Box 0
		leftWingModel[5] = new ModelRendererTurbo(this, 1225, 217, textureX, textureY); // Box 1
		leftWingModel[6] = new ModelRendererTurbo(this, 1577, 225, textureX, textureY); // Box 210
		leftWingModel[7] = new ModelRendererTurbo(this, 1665, 225, textureX, textureY); // Box 211
		leftWingModel[8] = new ModelRendererTurbo(this, 1753, 225, textureX, textureY); // Box 212
		leftWingModel[9] = new ModelRendererTurbo(this, 1841, 225, textureX, textureY); // Box 213
		leftWingModel[10] = new ModelRendererTurbo(this, 241, 281, textureX, textureY); // Box 0
		leftWingModel[11] = new ModelRendererTurbo(this, 713, 281, textureX, textureY); // Box 1
		leftWingModel[12] = new ModelRendererTurbo(this, 161, 297, textureX, textureY); // Box 4
		leftWingModel[13] = new ModelRendererTurbo(this, 1561, 177, textureX, textureY); // Box 5
		leftWingModel[14] = new ModelRendererTurbo(this, 1401, 185, textureX, textureY); // Box 6
		leftWingModel[15] = new ModelRendererTurbo(this, 1265, 17, textureX, textureY); // Box 8
		leftWingModel[16] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 9
		leftWingModel[17] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 10
		leftWingModel[18] = new ModelRendererTurbo(this, 1649, 217, textureX, textureY); // Box 11
		leftWingModel[19] = new ModelRendererTurbo(this, 817, 33, textureX, textureY); // Box 12
		leftWingModel[20] = new ModelRendererTurbo(this, 1825, 17, textureX, textureY); // Box 13
		leftWingModel[21] = new ModelRendererTurbo(this, 1953, 33, textureX, textureY); // Box 14
		leftWingModel[22] = new ModelRendererTurbo(this, 1865, 17, textureX, textureY); // Box 15
		leftWingModel[23] = new ModelRendererTurbo(this, 1673, 217, textureX, textureY); // Box 16
		leftWingModel[24] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 17
		leftWingModel[25] = new ModelRendererTurbo(this, 737, 225, textureX, textureY); // Box 18
		leftWingModel[26] = new ModelRendererTurbo(this, 1241, 97, textureX, textureY); // Box 19
		leftWingModel[27] = new ModelRendererTurbo(this, 1929, 225, textureX, textureY); // Box 20
		leftWingModel[28] = new ModelRendererTurbo(this, 1089, 105, textureX, textureY); // Box 21
		leftWingModel[29] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 22
		leftWingModel[30] = new ModelRendererTurbo(this, 1217, 289, textureX, textureY); // Box 23
		leftWingModel[31] = new ModelRendererTurbo(this, 257, 113, textureX, textureY); // Box 324
		leftWingModel[32] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Box 325
		leftWingModel[33] = new ModelRendererTurbo(this, 905, 73, textureX, textureY); // Box 326
		leftWingModel[34] = new ModelRendererTurbo(this, 233, 137, textureX, textureY); // Box 327
		leftWingModel[35] = new ModelRendererTurbo(this, 721, 137, textureX, textureY); // Box 328
		leftWingModel[36] = new ModelRendererTurbo(this, 1041, 73, textureX, textureY); // Box 329
		leftWingModel[37] = new ModelRendererTurbo(this, 2041, 17, textureX, textureY); // Box 330
		leftWingModel[38] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 331
		leftWingModel[39] = new ModelRendererTurbo(this, 1889, 297, textureX, textureY); // Box 332
		leftWingModel[40] = new ModelRendererTurbo(this, 161, 305, textureX, textureY); // Box 333
		leftWingModel[41] = new ModelRendererTurbo(this, 1289, 305, textureX, textureY); // Box 334
		leftWingModel[42] = new ModelRendererTurbo(this, 1257, 289, textureX, textureY); // Box 335
		leftWingModel[43] = new ModelRendererTurbo(this, 1577, 289, textureX, textureY); // Box 336
		leftWingModel[44] = new ModelRendererTurbo(this, 1617, 289, textureX, textureY); // Box 337
		leftWingModel[45] = new ModelRendererTurbo(this, 1, 305, textureX, textureY); // Box 338
		leftWingModel[46] = new ModelRendererTurbo(this, 241, 225, textureX, textureY); // Box 339
		leftWingModel[47] = new ModelRendererTurbo(this, 697, 225, textureX, textureY); // Box 340
		leftWingModel[48] = new ModelRendererTurbo(this, 809, 225, textureX, textureY); // Box 341
		leftWingModel[49] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 342
		leftWingModel[50] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 343
		leftWingModel[51] = new ModelRendererTurbo(this, 537, 41, textureX, textureY); // Box 344
		leftWingModel[52] = new ModelRendererTurbo(this, 1473, 313, textureX, textureY); // Box 2
		leftWingModel[53] = new ModelRendererTurbo(this, 1593, 313, textureX, textureY); // Box 3
		leftWingModel[54] = new ModelRendererTurbo(this, 1713, 313, textureX, textureY); // Box 4
		leftWingModel[55] = new ModelRendererTurbo(this, 1553, 185, textureX, textureY); // Box 5
		leftWingModel[56] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 6
		leftWingModel[57] = new ModelRendererTurbo(this, 1761, 201, textureX, textureY); // Box 7
		leftWingModel[58] = new ModelRendererTurbo(this, 1305, 273, textureX, textureY); // Box 8
		leftWingModel[59] = new ModelRendererTurbo(this, 809, 73, textureX, textureY); // Box 9
		leftWingModel[60] = new ModelRendererTurbo(this, 1345, 73, textureX, textureY); // Box 10
		leftWingModel[61] = new ModelRendererTurbo(this, 1025, 81, textureX, textureY); // Box 11
		leftWingModel[62] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 12
		leftWingModel[63] = new ModelRendererTurbo(this, 305, 297, textureX, textureY); // Box 13
		leftWingModel[64] = new ModelRendererTurbo(this, 1833, 313, textureX, textureY); // Box 14
		leftWingModel[65] = new ModelRendererTurbo(this, 521, 17, textureX, textureY); // Box 15
		leftWingModel[66] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 16
		leftWingModel[67] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 18
		leftWingModel[68] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 19
		leftWingModel[69] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 20
		leftWingModel[70] = new ModelRendererTurbo(this, 673, 89, textureX, textureY); // Box 21
		leftWingModel[71] = new ModelRendererTurbo(this, 2025, 305, textureX, textureY); // Box 22
		leftWingModel[72] = new ModelRendererTurbo(this, 1873, 313, textureX, textureY); // Box 23
		leftWingModel[73] = new ModelRendererTurbo(this, 2033, 89, textureX, textureY); // Box 24
		leftWingModel[74] = new ModelRendererTurbo(this, 929, 97, textureX, textureY); // Box 25
		leftWingModel[75] = new ModelRendererTurbo(this, 1913, 313, textureX, textureY); // Box 26
		leftWingModel[76] = new ModelRendererTurbo(this, 1937, 313, textureX, textureY); // Box 27
		leftWingModel[77] = new ModelRendererTurbo(this, 1977, 313, textureX, textureY); // Box 28
		leftWingModel[78] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Box 29
		leftWingModel[79] = new ModelRendererTurbo(this, 569, 105, textureX, textureY); // Box 30
		leftWingModel[80] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 31
		leftWingModel[81] = new ModelRendererTurbo(this, 25, 321, textureX, textureY); // Box 387
		leftWingModel[82] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 388
		leftWingModel[83] = new ModelRendererTurbo(this, 537, 33, textureX, textureY); // Box 389
		leftWingModel[84] = new ModelRendererTurbo(this, 1081, 33, textureX, textureY); // Box 390
		leftWingModel[85] = new ModelRendererTurbo(this, 873, 33, textureX, textureY); // Box 391
		leftWingModel[86] = new ModelRendererTurbo(this, 145, 321, textureX, textureY); // Box 392
		leftWingModel[87] = new ModelRendererTurbo(this, 1289, 321, textureX, textureY); // Box 393
		leftWingModel[88] = new ModelRendererTurbo(this, 265, 321, textureX, textureY); // Box 394
		leftWingModel[89] = new ModelRendererTurbo(this, 305, 321, textureX, textureY); // Box 395
		leftWingModel[90] = new ModelRendererTurbo(this, 793, 321, textureX, textureY); // Box 396
		leftWingModel[91] = new ModelRendererTurbo(this, 1409, 321, textureX, textureY); // Box 397
		leftWingModel[92] = new ModelRendererTurbo(this, 1449, 321, textureX, textureY); // Box 398
		leftWingModel[93] = new ModelRendererTurbo(this, 1473, 321, textureX, textureY); // Box 399
		leftWingModel[94] = new ModelRendererTurbo(this, 1081, 105, textureX, textureY); // Box 400
		leftWingModel[95] = new ModelRendererTurbo(this, 1577, 105, textureX, textureY); // Box 401
		leftWingModel[96] = new ModelRendererTurbo(this, 361, 97, textureX, textureY); // Box 402
		leftWingModel[97] = new ModelRendererTurbo(this, 1313, 97, textureX, textureY); // Box 403
		leftWingModel[98] = new ModelRendererTurbo(this, 1345, 97, textureX, textureY); // Box 404
		leftWingModel[99] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 405
		leftWingModel[100] = new ModelRendererTurbo(this, 1089, 121, textureX, textureY); // Box 406
		leftWingModel[101] = new ModelRendererTurbo(this, 1873, 97, textureX, textureY); // Box 407
		leftWingModel[102] = new ModelRendererTurbo(this, 857, 281, textureX, textureY); // Box 408
		leftWingModel[103] = new ModelRendererTurbo(this, 1297, 289, textureX, textureY); // Box 409
		leftWingModel[104] = new ModelRendererTurbo(this, 1657, 289, textureX, textureY); // Box 410
		leftWingModel[105] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 411
		leftWingModel[106] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Box 412
		leftWingModel[107] = new ModelRendererTurbo(this, 337, 105, textureX, textureY); // Box 413
		leftWingModel[108] = new ModelRendererTurbo(this, 1497, 321, textureX, textureY); // Box 414
		leftWingModel[109] = new ModelRendererTurbo(this, 1521, 321, textureX, textureY); // Box 415
		leftWingModel[110] = new ModelRendererTurbo(this, 1545, 321, textureX, textureY); // Box 416
		leftWingModel[111] = new ModelRendererTurbo(this, 1633, 321, textureX, textureY); // Box 417

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 120, 1, 104, 0F, -91F, 0F, 0F, 0F, 0F, 0F, -36F, 0F, 0F, 0F, 0F, 0F, -91F, 0F, 0F, 0F, 0F, 0F, -36F, 0F, 0F, 0F, 0F, 0F); // Box 66
		leftWingModel[0].setRotationPoint(-8.5F, -41F, -145F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 23, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		leftWingModel[1].setRotationPoint(80.5F, -41.5F, -147F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 16, 2, 2, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 69
		leftWingModel[2].setRotationPoint(103.5F, -41.5F, -147F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 25, 2, 2, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		leftWingModel[3].setRotationPoint(55.5F, -41.5F, -147F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 40, 10, 1, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftWingModel[4].setRotationPoint(17F, -40F, -65F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 40, 10, 1, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 1
		leftWingModel[5].setRotationPoint(17F, -40F, -64F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 40, 10, 1, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 210
		leftWingModel[6].setRotationPoint(36F, -40F, -90F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 40, 10, 1, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		leftWingModel[7].setRotationPoint(36F, -40F, -91F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 40, 10, 1, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 212
		leftWingModel[8].setRotationPoint(56F, -40F, -113F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 40, 10, 1, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		leftWingModel[9].setRotationPoint(56F, -40F, -114F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 66, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftWingModel[10].setRotationPoint(-5F, -29F, -66F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 66, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		leftWingModel[11].setRotationPoint(-5F, -30F, -66F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 66, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 4
		leftWingModel[12].setRotationPoint(-5F, -27F, -66F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F); // Box 5
		leftWingModel[13].setRotationPoint(-10F, -28.5F, -66F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, -1F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F); // Box 6
		leftWingModel[14].setRotationPoint(-10F, -30F, -66F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F); // Box 8
		leftWingModel[15].setRotationPoint(-12F, -28.5F, -65F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -1F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F); // Box 9
		leftWingModel[16].setRotationPoint(-12F, -29F, -65F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -1F); // Box 10
		leftWingModel[17].setRotationPoint(-12F, -28F, -65F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, -1F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1.5F); // Box 11
		leftWingModel[18].setRotationPoint(-10F, -27F, -66F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		leftWingModel[19].setRotationPoint(61F, -30F, -66F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftWingModel[20].setRotationPoint(61F, -29F, -66F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 14
		leftWingModel[21].setRotationPoint(61F, -27F, -66F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		leftWingModel[22].setRotationPoint(61F, -29F, -63F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 16
		leftWingModel[23].setRotationPoint(28F, -31F, -63F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 17
		leftWingModel[24].setRotationPoint(59.5F, -34F, -63F);

		leftWingModel[25].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		leftWingModel[25].setRotationPoint(28F, -31F, -67F);

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		leftWingModel[26].setRotationPoint(59.5F, -34F, -70F);

		leftWingModel[27].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F); // Box 20
		leftWingModel[27].setRotationPoint(28F, -27F, -67F);

		leftWingModel[28].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 21
		leftWingModel[28].setRotationPoint(59.5F, -27F, -70F);

		leftWingModel[29].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		leftWingModel[29].setRotationPoint(59.5F, -27F, -63F);

		leftWingModel[30].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 23
		leftWingModel[30].setRotationPoint(28F, -27F, -63F);

		leftWingModel[31].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 324
		leftWingModel[31].setRotationPoint(78.5F, -27F, -96F);

		leftWingModel[32].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		leftWingModel[32].setRotationPoint(78.5F, -34F, -96F);

		leftWingModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		leftWingModel[33].setRotationPoint(80F, -30F, -92F);

		leftWingModel[34].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 327
		leftWingModel[34].setRotationPoint(78.5F, -34F, -89F);

		leftWingModel[35].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
		leftWingModel[35].setRotationPoint(78.5F, -27F, -89F);

		leftWingModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 329
		leftWingModel[36].setRotationPoint(80F, -27F, -92F);

		leftWingModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		leftWingModel[37].setRotationPoint(80F, -29F, -89F);

		leftWingModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		leftWingModel[38].setRotationPoint(80F, -29F, -92F);

		leftWingModel[39].addShapeBox(0F, 0F, 0F, 66, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		leftWingModel[39].setRotationPoint(14F, -30F, -92F);

		leftWingModel[40].addShapeBox(0F, 0F, 0F, 66, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		leftWingModel[40].setRotationPoint(14F, -29F, -92F);

		leftWingModel[41].addShapeBox(0F, 0F, 0F, 66, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 334
		leftWingModel[41].setRotationPoint(14F, -27F, -92F);

		leftWingModel[42].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 335
		leftWingModel[42].setRotationPoint(47F, -31F, -89F);

		leftWingModel[43].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 336
		leftWingModel[43].setRotationPoint(47F, -27F, -89F);

		leftWingModel[44].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		leftWingModel[44].setRotationPoint(47F, -31F, -93F);

		leftWingModel[45].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F); // Box 338
		leftWingModel[45].setRotationPoint(47F, -27F, -93F);

		leftWingModel[46].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, -1F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1.5F); // Box 339
		leftWingModel[46].setRotationPoint(9F, -27F, -92F);

		leftWingModel[47].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F); // Box 340
		leftWingModel[47].setRotationPoint(9F, -28.5F, -92F);

		leftWingModel[48].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, -1F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F); // Box 341
		leftWingModel[48].setRotationPoint(9F, -30F, -92F);

		leftWingModel[49].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -1F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F); // Box 342
		leftWingModel[49].setRotationPoint(7F, -29F, -91F);

		leftWingModel[50].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F); // Box 343
		leftWingModel[50].setRotationPoint(7F, -28.5F, -91F);

		leftWingModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -1F); // Box 344
		leftWingModel[51].setRotationPoint(7F, -28F, -91F);

		leftWingModel[52].addShapeBox(0F, 0F, 0F, 53, 1, 5, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 2
		leftWingModel[52].setRotationPoint(44F, -29.5F, -115.5F);

		leftWingModel[53].addShapeBox(0F, 0F, 0F, 53, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		leftWingModel[53].setRotationPoint(44F, -28F, -115.5F);

		leftWingModel[54].addShapeBox(0F, 0F, 0F, 53, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F); // Box 4
		leftWingModel[54].setRotationPoint(44F, -26F, -115.5F);

		leftWingModel[55].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F); // Box 5
		leftWingModel[55].setRotationPoint(41F, -28F, -115.5F);

		leftWingModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 6
		leftWingModel[56].setRotationPoint(40F, -27.5F, -114.5F);

		leftWingModel[57].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F); // Box 7
		leftWingModel[57].setRotationPoint(41F, -29.5F, -115.5F);

		leftWingModel[58].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F); // Box 8
		leftWingModel[58].setRotationPoint(41F, -26.5F, -115.5F);

		leftWingModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Box 9
		leftWingModel[59].setRotationPoint(40F, -26.5F, -114.5F);

		leftWingModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 10
		leftWingModel[60].setRotationPoint(40F, -28.5F, -114.5F);

		leftWingModel[61].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 11
		leftWingModel[61].setRotationPoint(43F, -30F, -115.5F);

		leftWingModel[62].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 12
		leftWingModel[62].setRotationPoint(45F, -30F, -115.5F);

		leftWingModel[63].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftWingModel[63].setRotationPoint(49F, -32F, -117.5F);

		leftWingModel[64].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		leftWingModel[64].setRotationPoint(83F, -32F, -117.5F);

		leftWingModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F); // Box 15
		leftWingModel[65].setRotationPoint(97F, -29.5F, -115.5F);

		leftWingModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		leftWingModel[66].setRotationPoint(97F, -28F, -115.5F);

		leftWingModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 18
		leftWingModel[67].setRotationPoint(97F, -28F, -111.5F);

		leftWingModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F); // Box 19
		leftWingModel[68].setRotationPoint(97F, -25.5F, -115.5F);

		leftWingModel[69].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 20
		leftWingModel[69].setRotationPoint(43F, -30F, -112.5F);

		leftWingModel[70].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 21
		leftWingModel[70].setRotationPoint(45F, -30F, -112.5F);

		leftWingModel[71].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 22
		leftWingModel[71].setRotationPoint(49F, -32F, -112.5F);

		leftWingModel[72].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 23
		leftWingModel[72].setRotationPoint(83F, -32F, -112.5F);

		leftWingModel[73].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 24
		leftWingModel[73].setRotationPoint(43F, -26F, -112.5F);

		leftWingModel[74].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 25
		leftWingModel[74].setRotationPoint(45F, -26F, -112.5F);

		leftWingModel[75].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 26
		leftWingModel[75].setRotationPoint(49F, -27F, -112.5F);

		leftWingModel[76].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 27
		leftWingModel[76].setRotationPoint(83F, -27F, -112.5F);

		leftWingModel[77].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F); // Box 28
		leftWingModel[77].setRotationPoint(83F, -27F, -117.5F);

		leftWingModel[78].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F); // Box 29
		leftWingModel[78].setRotationPoint(49F, -27F, -117.5F);

		leftWingModel[79].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 30
		leftWingModel[79].setRotationPoint(45F, -26F, -115.5F);

		leftWingModel[80].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 31
		leftWingModel[80].setRotationPoint(43F, -26F, -115.5F);

		leftWingModel[81].addShapeBox(0F, 0F, 0F, 53, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		leftWingModel[81].setRotationPoint(49F, -35F, -148.5F);

		leftWingModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F); // Box 388
		leftWingModel[82].setRotationPoint(102F, -36.5F, -148.5F);

		leftWingModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		leftWingModel[83].setRotationPoint(102F, -35F, -148.5F);

		leftWingModel[84].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 390
		leftWingModel[84].setRotationPoint(102F, -35F, -144.5F);

		leftWingModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F); // Box 391
		leftWingModel[85].setRotationPoint(102F, -32.5F, -148.5F);

		leftWingModel[86].addShapeBox(0F, 0F, 0F, 53, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F); // Box 392
		leftWingModel[86].setRotationPoint(49F, -33F, -148.5F);

		leftWingModel[87].addShapeBox(0F, 0F, 0F, 53, 1, 5, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 393
		leftWingModel[87].setRotationPoint(49F, -36.5F, -148.5F);

		leftWingModel[88].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		leftWingModel[88].setRotationPoint(88F, -39F, -150.5F);

		leftWingModel[89].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 395
		leftWingModel[89].setRotationPoint(88F, -39F, -145.5F);

		leftWingModel[90].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 396
		leftWingModel[90].setRotationPoint(88F, -34F, -145.5F);

		leftWingModel[91].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F); // Box 397
		leftWingModel[91].setRotationPoint(88F, -34F, -150.5F);

		leftWingModel[92].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 398
		leftWingModel[92].setRotationPoint(54F, -39F, -145.5F);

		leftWingModel[93].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 399
		leftWingModel[93].setRotationPoint(54F, -34F, -145.5F);

		leftWingModel[94].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 400
		leftWingModel[94].setRotationPoint(50F, -37F, -145.5F);

		leftWingModel[95].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 401
		leftWingModel[95].setRotationPoint(50F, -33F, -145.5F);

		leftWingModel[96].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 402
		leftWingModel[96].setRotationPoint(48F, -37F, -145.5F);

		leftWingModel[97].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 403
		leftWingModel[97].setRotationPoint(48F, -33F, -145.5F);

		leftWingModel[98].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 404
		leftWingModel[98].setRotationPoint(48F, -33F, -148.5F);

		leftWingModel[99].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 405
		leftWingModel[99].setRotationPoint(50F, -33F, -148.5F);

		leftWingModel[100].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 406
		leftWingModel[100].setRotationPoint(50F, -37F, -148.5F);

		leftWingModel[101].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 407
		leftWingModel[101].setRotationPoint(48F, -37F, -148.5F);

		leftWingModel[102].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F); // Box 408
		leftWingModel[102].setRotationPoint(46F, -36.5F, -148.5F);

		leftWingModel[103].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F); // Box 409
		leftWingModel[103].setRotationPoint(46F, -35F, -148.5F);

		leftWingModel[104].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F); // Box 410
		leftWingModel[104].setRotationPoint(46F, -33.5F, -148.5F);

		leftWingModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Box 411
		leftWingModel[105].setRotationPoint(45F, -33.5F, -147.5F);

		leftWingModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 412
		leftWingModel[106].setRotationPoint(45F, -34.5F, -147.5F);

		leftWingModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 413
		leftWingModel[107].setRotationPoint(45F, -35.5F, -147.5F);

		leftWingModel[108].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F); // Box 414
		leftWingModel[108].setRotationPoint(54F, -34F, -150.5F);

		leftWingModel[109].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		leftWingModel[109].setRotationPoint(54F, -39F, -150.5F);

		leftWingModel[110].addShapeBox(0F, 0F, 0F, 40, 3, 1, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 416
		leftWingModel[110].setRotationPoint(61F, -39.5F, -146F);

		leftWingModel[111].addShapeBox(0F, 0F, 0F, 40, 3, 1, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		leftWingModel[111].setRotationPoint(61F, -39.5F, -147F);


		rightWingModel = new ModelRendererTurbo[113];
		rightWingModel[0] = new ModelRendererTurbo(this, 1225, 193, textureX, textureY); // Box 72
		rightWingModel[1] = new ModelRendererTurbo(this, 1393, 33, textureX, textureY); // Box 74
		rightWingModel[2] = new ModelRendererTurbo(this, 665, 25, textureX, textureY); // Box 75
		rightWingModel[3] = new ModelRendererTurbo(this, 697, 65, textureX, textureY); // Box 76
		rightWingModel[4] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 77
		rightWingModel[5] = new ModelRendererTurbo(this, 1225, 233, textureX, textureY); // Box 220
		rightWingModel[6] = new ModelRendererTurbo(this, 1929, 233, textureX, textureY); // Box 221
		rightWingModel[7] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 222
		rightWingModel[8] = new ModelRendererTurbo(this, 1577, 241, textureX, textureY); // Box 223
		rightWingModel[9] = new ModelRendererTurbo(this, 1665, 241, textureX, textureY); // Box 224
		rightWingModel[10] = new ModelRendererTurbo(this, 1753, 241, textureX, textureY); // Box 225
		rightWingModel[11] = new ModelRendererTurbo(this, 1433, 305, textureX, textureY); // Box 345
		rightWingModel[12] = new ModelRendererTurbo(this, 1577, 305, textureX, textureY); // Box 346
		rightWingModel[13] = new ModelRendererTurbo(this, 1721, 305, textureX, textureY); // Box 347
		rightWingModel[14] = new ModelRendererTurbo(this, 1305, 225, textureX, textureY); // Box 348
		rightWingModel[15] = new ModelRendererTurbo(this, 497, 241, textureX, textureY); // Box 349
		rightWingModel[16] = new ModelRendererTurbo(this, 761, 41, textureX, textureY); // Box 350
		rightWingModel[17] = new ModelRendererTurbo(this, 953, 41, textureX, textureY); // Box 351
		rightWingModel[18] = new ModelRendererTurbo(this, 1265, 41, textureX, textureY); // Box 352
		rightWingModel[19] = new ModelRendererTurbo(this, 785, 241, textureX, textureY); // Box 353
		rightWingModel[20] = new ModelRendererTurbo(this, 1393, 73, textureX, textureY); // Box 354
		rightWingModel[21] = new ModelRendererTurbo(this, 569, 25, textureX, textureY); // Box 355
		rightWingModel[22] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 356
		rightWingModel[23] = new ModelRendererTurbo(this, 881, 25, textureX, textureY); // Box 357
		rightWingModel[24] = new ModelRendererTurbo(this, 793, 305, textureX, textureY); // Box 358
		rightWingModel[25] = new ModelRendererTurbo(this, 881, 145, textureX, textureY); // Box 359
		rightWingModel[26] = new ModelRendererTurbo(this, 1865, 305, textureX, textureY); // Box 360
		rightWingModel[27] = new ModelRendererTurbo(this, 961, 145, textureX, textureY); // Box 361
		rightWingModel[28] = new ModelRendererTurbo(this, 1905, 305, textureX, textureY); // Box 362
		rightWingModel[29] = new ModelRendererTurbo(this, 1649, 161, textureX, textureY); // Box 363
		rightWingModel[30] = new ModelRendererTurbo(this, 1225, 177, textureX, textureY); // Box 364
		rightWingModel[31] = new ModelRendererTurbo(this, 1945, 305, textureX, textureY); // Box 365
		rightWingModel[32] = new ModelRendererTurbo(this, 1265, 177, textureX, textureY); // Box 366
		rightWingModel[33] = new ModelRendererTurbo(this, 1649, 177, textureX, textureY); // Box 367
		rightWingModel[34] = new ModelRendererTurbo(this, 625, 81, textureX, textureY); // Box 368
		rightWingModel[35] = new ModelRendererTurbo(this, 2001, 217, textureX, textureY); // Box 369
		rightWingModel[36] = new ModelRendererTurbo(this, 2033, 241, textureX, textureY); // Box 370
		rightWingModel[37] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 371
		rightWingModel[38] = new ModelRendererTurbo(this, 1169, 25, textureX, textureY); // Box 372
		rightWingModel[39] = new ModelRendererTurbo(this, 1769, 25, textureX, textureY); // Box 373
		rightWingModel[40] = new ModelRendererTurbo(this, 1, 313, textureX, textureY); // Box 374
		rightWingModel[41] = new ModelRendererTurbo(this, 145, 313, textureX, textureY); // Box 375
		rightWingModel[42] = new ModelRendererTurbo(this, 1289, 313, textureX, textureY); // Box 376
		rightWingModel[43] = new ModelRendererTurbo(this, 1985, 305, textureX, textureY); // Box 377
		rightWingModel[44] = new ModelRendererTurbo(this, 289, 313, textureX, textureY); // Box 378
		rightWingModel[45] = new ModelRendererTurbo(this, 793, 313, textureX, textureY); // Box 379
		rightWingModel[46] = new ModelRendererTurbo(this, 1433, 313, textureX, textureY); // Box 380
		rightWingModel[47] = new ModelRendererTurbo(this, 2009, 241, textureX, textureY); // Box 381
		rightWingModel[48] = new ModelRendererTurbo(this, 1881, 273, textureX, textureY); // Box 382
		rightWingModel[49] = new ModelRendererTurbo(this, 385, 281, textureX, textureY); // Box 383
		rightWingModel[50] = new ModelRendererTurbo(this, 1329, 41, textureX, textureY); // Box 384
		rightWingModel[51] = new ModelRendererTurbo(this, 1057, 49, textureX, textureY); // Box 385
		rightWingModel[52] = new ModelRendererTurbo(this, 1793, 49, textureX, textureY); // Box 386
		rightWingModel[53] = new ModelRendererTurbo(this, 1713, 321, textureX, textureY); // Box 418
		rightWingModel[54] = new ModelRendererTurbo(this, 1817, 41, textureX, textureY); // Box 419
		rightWingModel[55] = new ModelRendererTurbo(this, 1737, 33, textureX, textureY); // Box 420
		rightWingModel[56] = new ModelRendererTurbo(this, 1817, 33, textureX, textureY); // Box 421
		rightWingModel[57] = new ModelRendererTurbo(this, 1337, 65, textureX, textureY); // Box 422
		rightWingModel[58] = new ModelRendererTurbo(this, 17, 329, textureX, textureY); // Box 423
		rightWingModel[59] = new ModelRendererTurbo(this, 137, 329, textureX, textureY); // Box 424
		rightWingModel[60] = new ModelRendererTurbo(this, 2009, 321, textureX, textureY); // Box 425
		rightWingModel[61] = new ModelRendererTurbo(this, 1289, 329, textureX, textureY); // Box 426
		rightWingModel[62] = new ModelRendererTurbo(this, 1329, 329, textureX, textureY); // Box 427
		rightWingModel[63] = new ModelRendererTurbo(this, 1369, 329, textureX, textureY); // Box 428
		rightWingModel[64] = new ModelRendererTurbo(this, 1537, 329, textureX, textureY); // Box 429
		rightWingModel[65] = new ModelRendererTurbo(this, 1561, 329, textureX, textureY); // Box 430
		rightWingModel[66] = new ModelRendererTurbo(this, 1953, 121, textureX, textureY); // Box 431
		rightWingModel[67] = new ModelRendererTurbo(this, 2033, 121, textureX, textureY); // Box 432
		rightWingModel[68] = new ModelRendererTurbo(this, 1481, 105, textureX, textureY); // Box 433
		rightWingModel[69] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Box 434
		rightWingModel[70] = new ModelRendererTurbo(this, 401, 121, textureX, textureY); // Box 435
		rightWingModel[71] = new ModelRendererTurbo(this, 729, 137, textureX, textureY); // Box 436
		rightWingModel[72] = new ModelRendererTurbo(this, 801, 137, textureX, textureY); // Box 437
		rightWingModel[73] = new ModelRendererTurbo(this, 1593, 121, textureX, textureY); // Box 438
		rightWingModel[74] = new ModelRendererTurbo(this, 1209, 297, textureX, textureY); // Box 439
		rightWingModel[75] = new ModelRendererTurbo(this, 321, 305, textureX, textureY); // Box 440
		rightWingModel[76] = new ModelRendererTurbo(this, 1585, 329, textureX, textureY); // Box 441
		rightWingModel[77] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 442
		rightWingModel[78] = new ModelRendererTurbo(this, 1713, 129, textureX, textureY); // Box 443
		rightWingModel[79] = new ModelRendererTurbo(this, 1041, 137, textureX, textureY); // Box 444
		rightWingModel[80] = new ModelRendererTurbo(this, 1609, 329, textureX, textureY); // Box 445
		rightWingModel[81] = new ModelRendererTurbo(this, 1633, 329, textureX, textureY); // Box 446
		rightWingModel[82] = new ModelRendererTurbo(this, 1657, 329, textureX, textureY); // Box 447
		rightWingModel[83] = new ModelRendererTurbo(this, 1745, 329, textureX, textureY); // Box 448
		rightWingModel[84] = new ModelRendererTurbo(this, 1825, 329, textureX, textureY); // Box 449
		rightWingModel[85] = new ModelRendererTurbo(this, 1, 337, textureX, textureY); // Box 450
		rightWingModel[86] = new ModelRendererTurbo(this, 121, 337, textureX, textureY); // Box 451
		rightWingModel[87] = new ModelRendererTurbo(this, 1945, 329, textureX, textureY); // Box 452
		rightWingModel[88] = new ModelRendererTurbo(this, 1081, 137, textureX, textureY); // Box 453
		rightWingModel[89] = new ModelRendererTurbo(this, 1969, 329, textureX, textureY); // Box 454
		rightWingModel[90] = new ModelRendererTurbo(this, 1993, 329, textureX, textureY); // Box 455
		rightWingModel[91] = new ModelRendererTurbo(this, 1233, 137, textureX, textureY); // Box 456
		rightWingModel[92] = new ModelRendererTurbo(this, 1945, 137, textureX, textureY); // Box 457
		rightWingModel[93] = new ModelRendererTurbo(this, 969, 145, textureX, textureY); // Box 458
		rightWingModel[94] = new ModelRendererTurbo(this, 1217, 145, textureX, textureY); // Box 459
		rightWingModel[95] = new ModelRendererTurbo(this, 241, 337, textureX, textureY); // Box 460
		rightWingModel[96] = new ModelRendererTurbo(this, 265, 337, textureX, textureY); // Box 461
		rightWingModel[97] = new ModelRendererTurbo(this, 529, 73, textureX, textureY); // Box 462
		rightWingModel[98] = new ModelRendererTurbo(this, 1873, 33, textureX, textureY); // Box 463
		rightWingModel[99] = new ModelRendererTurbo(this, 689, 41, textureX, textureY); // Box 464
		rightWingModel[100] = new ModelRendererTurbo(this, 1489, 97, textureX, textureY); // Box 465
		rightWingModel[101] = new ModelRendererTurbo(this, 1297, 145, textureX, textureY); // Box 466
		rightWingModel[102] = new ModelRendererTurbo(this, 1569, 145, textureX, textureY); // Box 467
		rightWingModel[103] = new ModelRendererTurbo(this, 1401, 337, textureX, textureY); // Box 468
		rightWingModel[104] = new ModelRendererTurbo(this, 1425, 337, textureX, textureY); // Box 469
		rightWingModel[105] = new ModelRendererTurbo(this, 1321, 145, textureX, textureY); // Box 470
		rightWingModel[106] = new ModelRendererTurbo(this, 1361, 177, textureX, textureY); // Box 471
		rightWingModel[107] = new ModelRendererTurbo(this, 1465, 337, textureX, textureY); // Box 472
		rightWingModel[108] = new ModelRendererTurbo(this, 1489, 337, textureX, textureY); // Box 473
		rightWingModel[109] = new ModelRendererTurbo(this, 1577, 337, textureX, textureY); // Box 474
		rightWingModel[110] = new ModelRendererTurbo(this, 1649, 337, textureX, textureY); // Box 475
		rightWingModel[111] = new ModelRendererTurbo(this, 1393, 177, textureX, textureY); // Box 476
		rightWingModel[112] = new ModelRendererTurbo(this, 1681, 145, textureX, textureY); // Box 477

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 120, 1, 104, 0F, 0F, 0F, 0F, -36F, 0F, 0F, 0F, 0F, 0F, -91F, 0F, 0F, 0F, 0F, 0F, -36F, 0F, 0F, 0F, 0F, 0F, -91F, 0F, 0F); // Box 72
		rightWingModel[0].setRotationPoint(-8.5F, -41F, 41F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 23, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		rightWingModel[1].setRotationPoint(80.5F, -41.5F, 145F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 16, 2, 2, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 75
		rightWingModel[2].setRotationPoint(103.5F, -41.5F, 145F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 25, 2, 2, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		rightWingModel[3].setRotationPoint(55.5F, -41.5F, 145F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 77
		rightWingModel[4].setRotationPoint(54.5F, -40.5F, 145F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 40, 10, 1, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 220
		rightWingModel[5].setRotationPoint(17F, -40F, 64F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 40, 10, 1, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		rightWingModel[6].setRotationPoint(17F, -40F, 63F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 40, 10, 1, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		rightWingModel[7].setRotationPoint(36F, -40F, 89F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 40, 10, 1, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 223
		rightWingModel[8].setRotationPoint(36F, -40F, 90F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 40, 10, 1, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		rightWingModel[9].setRotationPoint(56F, -40F, 112F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 40, 10, 1, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 225
		rightWingModel[10].setRotationPoint(56F, -40F, 113F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 66, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		rightWingModel[11].setRotationPoint(-5F, -29F, 62F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 66, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 346
		rightWingModel[12].setRotationPoint(-5F, -30F, 62F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 66, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 347
		rightWingModel[13].setRotationPoint(-5F, -27F, 62F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F); // Box 348
		rightWingModel[14].setRotationPoint(-10F, -28.5F, 62F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, -1F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F); // Box 349
		rightWingModel[15].setRotationPoint(-10F, -30F, 62F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F); // Box 350
		rightWingModel[16].setRotationPoint(-12F, -28.5F, 63F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -1F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F); // Box 351
		rightWingModel[17].setRotationPoint(-12F, -29F, 63F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -1F); // Box 352
		rightWingModel[18].setRotationPoint(-12F, -28F, 63F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, -1F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1.5F); // Box 353
		rightWingModel[19].setRotationPoint(-10F, -27F, 62F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		rightWingModel[20].setRotationPoint(61F, -30F, 62F);

		rightWingModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355
		rightWingModel[21].setRotationPoint(61F, -29F, 65F);

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 356
		rightWingModel[22].setRotationPoint(61F, -27F, 62F);

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		rightWingModel[23].setRotationPoint(61F, -29F, 62F);

		rightWingModel[24].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		rightWingModel[24].setRotationPoint(28F, -31F, 61F);

		rightWingModel[25].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		rightWingModel[25].setRotationPoint(59.5F, -34F, 58F);

		rightWingModel[26].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 360
		rightWingModel[26].setRotationPoint(28F, -31F, 65F);

		rightWingModel[27].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 361
		rightWingModel[27].setRotationPoint(59.5F, -34F, 65F);

		rightWingModel[28].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 362
		rightWingModel[28].setRotationPoint(28F, -27F, 65F);

		rightWingModel[29].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 363
		rightWingModel[29].setRotationPoint(59.5F, -27F, 65F);

		rightWingModel[30].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 364
		rightWingModel[30].setRotationPoint(59.5F, -27F, 58F);

		rightWingModel[31].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F); // Box 365
		rightWingModel[31].setRotationPoint(28F, -27F, 61F);

		rightWingModel[32].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		rightWingModel[32].setRotationPoint(78.5F, -27F, 91F);

		rightWingModel[33].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 367
		rightWingModel[33].setRotationPoint(78.5F, -34F, 91F);

		rightWingModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		rightWingModel[34].setRotationPoint(80F, -30F, 88F);

		rightWingModel[35].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		rightWingModel[35].setRotationPoint(78.5F, -34F, 84F);

		rightWingModel[36].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 370
		rightWingModel[36].setRotationPoint(78.5F, -27F, 84F);

		rightWingModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 371
		rightWingModel[37].setRotationPoint(80F, -27F, 88F);

		rightWingModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		rightWingModel[38].setRotationPoint(80F, -29F, 88F);

		rightWingModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		rightWingModel[39].setRotationPoint(80F, -29F, 91F);

		rightWingModel[40].addShapeBox(0F, 0F, 0F, 66, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		rightWingModel[40].setRotationPoint(14F, -30F, 88F);

		rightWingModel[41].addShapeBox(0F, 0F, 0F, 66, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		rightWingModel[41].setRotationPoint(14F, -29F, 88F);

		rightWingModel[42].addShapeBox(0F, 0F, 0F, 66, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 376
		rightWingModel[42].setRotationPoint(14F, -27F, 88F);

		rightWingModel[43].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		rightWingModel[43].setRotationPoint(47F, -31F, 87F);

		rightWingModel[44].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F); // Box 378
		rightWingModel[44].setRotationPoint(47F, -27F, 87F);

		rightWingModel[45].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 379
		rightWingModel[45].setRotationPoint(47F, -31F, 91F);

		rightWingModel[46].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 380
		rightWingModel[46].setRotationPoint(47F, -27F, 91F);

		rightWingModel[47].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, -1F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1.5F); // Box 381
		rightWingModel[47].setRotationPoint(9F, -27F, 88F);

		rightWingModel[48].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F); // Box 382
		rightWingModel[48].setRotationPoint(9F, -28.5F, 88F);

		rightWingModel[49].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, -1F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F); // Box 383
		rightWingModel[49].setRotationPoint(9F, -30F, 88F);

		rightWingModel[50].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -1F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F); // Box 384
		rightWingModel[50].setRotationPoint(7F, -29F, 89F);

		rightWingModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F); // Box 385
		rightWingModel[51].setRotationPoint(7F, -28.5F, 89F);

		rightWingModel[52].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -1F); // Box 386
		rightWingModel[52].setRotationPoint(7F, -28F, 89F);

		rightWingModel[53].addShapeBox(0F, 0F, 0F, 53, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
		rightWingModel[53].setRotationPoint(49F, -35F, 143.5F);

		rightWingModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F); // Box 419
		rightWingModel[54].setRotationPoint(102F, -36.5F, 143.5F);

		rightWingModel[55].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 420
		rightWingModel[55].setRotationPoint(102F, -35F, 147.5F);

		rightWingModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421
		rightWingModel[56].setRotationPoint(102F, -35F, 143.5F);

		rightWingModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F); // Box 422
		rightWingModel[57].setRotationPoint(102F, -32.5F, 143.5F);

		rightWingModel[58].addShapeBox(0F, 0F, 0F, 53, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F); // Box 423
		rightWingModel[58].setRotationPoint(49F, -33F, 143.5F);

		rightWingModel[59].addShapeBox(0F, 0F, 0F, 53, 1, 5, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 424
		rightWingModel[59].setRotationPoint(49F, -36.5F, 143.5F);

		rightWingModel[60].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 425
		rightWingModel[60].setRotationPoint(88F, -39F, 146.5F);

		rightWingModel[61].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 426
		rightWingModel[61].setRotationPoint(88F, -39F, 141.5F);

		rightWingModel[62].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F); // Box 427
		rightWingModel[62].setRotationPoint(88F, -34F, 141.5F);

		rightWingModel[63].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 428
		rightWingModel[63].setRotationPoint(88F, -34F, 146.5F);

		rightWingModel[64].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 429
		rightWingModel[64].setRotationPoint(54F, -39F, 141.5F);

		rightWingModel[65].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F); // Box 430
		rightWingModel[65].setRotationPoint(54F, -34F, 141.5F);

		rightWingModel[66].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 431
		rightWingModel[66].setRotationPoint(50F, -37F, 143.5F);

		rightWingModel[67].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 432
		rightWingModel[67].setRotationPoint(50F, -33F, 143.5F);

		rightWingModel[68].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 433
		rightWingModel[68].setRotationPoint(48F, -37F, 143.5F);

		rightWingModel[69].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 434
		rightWingModel[69].setRotationPoint(48F, -33F, 143.5F);

		rightWingModel[70].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 435
		rightWingModel[70].setRotationPoint(48F, -33F, 146.5F);

		rightWingModel[71].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 436
		rightWingModel[71].setRotationPoint(50F, -33F, 146.5F);

		rightWingModel[72].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 437
		rightWingModel[72].setRotationPoint(50F, -37F, 146.5F);

		rightWingModel[73].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 438
		rightWingModel[73].setRotationPoint(48F, -37F, 146.5F);

		rightWingModel[74].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F); // Box 439
		rightWingModel[74].setRotationPoint(46F, -36.5F, 143.5F);

		rightWingModel[75].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F); // Box 440
		rightWingModel[75].setRotationPoint(46F, -35F, 143.5F);

		rightWingModel[76].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F); // Box 441
		rightWingModel[76].setRotationPoint(46F, -33.5F, 143.5F);

		rightWingModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Box 442
		rightWingModel[77].setRotationPoint(45F, -33.5F, 144.5F);

		rightWingModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 443
		rightWingModel[78].setRotationPoint(45F, -34.5F, 144.5F);

		rightWingModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 444
		rightWingModel[79].setRotationPoint(45F, -35.5F, 144.5F);

		rightWingModel[80].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 445
		rightWingModel[80].setRotationPoint(54F, -34F, 146.5F);

		rightWingModel[81].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 446
		rightWingModel[81].setRotationPoint(54F, -39F, 146.5F);

		rightWingModel[82].addShapeBox(0F, 0F, 0F, 40, 3, 1, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447
		rightWingModel[82].setRotationPoint(61F, -39.5F, 145F);

		rightWingModel[83].addShapeBox(0F, 0F, 0F, 40, 3, 1, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 448
		rightWingModel[83].setRotationPoint(61F, -39.5F, 146F);

		rightWingModel[84].addShapeBox(0F, 0F, 0F, 53, 1, 5, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 449
		rightWingModel[84].setRotationPoint(44F, -29.5F, 110.5F);

		rightWingModel[85].addShapeBox(0F, 0F, 0F, 53, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		rightWingModel[85].setRotationPoint(44F, -28F, 110.5F);

		rightWingModel[86].addShapeBox(0F, 0F, 0F, 53, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F); // Box 451
		rightWingModel[86].setRotationPoint(44F, -26F, 110.5F);

		rightWingModel[87].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F); // Box 452
		rightWingModel[87].setRotationPoint(41F, -28F, 110.5F);

		rightWingModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 453
		rightWingModel[88].setRotationPoint(40F, -27.5F, 111.5F);

		rightWingModel[89].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F); // Box 454
		rightWingModel[89].setRotationPoint(41F, -29.5F, 110.5F);

		rightWingModel[90].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F); // Box 455
		rightWingModel[90].setRotationPoint(41F, -26.5F, 110.5F);

		rightWingModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Box 456
		rightWingModel[91].setRotationPoint(40F, -26.5F, 111.5F);

		rightWingModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 457
		rightWingModel[92].setRotationPoint(40F, -28.5F, 111.5F);

		rightWingModel[93].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 458
		rightWingModel[93].setRotationPoint(43F, -30F, 113.5F);

		rightWingModel[94].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 459
		rightWingModel[94].setRotationPoint(45F, -30F, 113.5F);

		rightWingModel[95].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 460
		rightWingModel[95].setRotationPoint(49F, -32F, 113.5F);

		rightWingModel[96].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 461
		rightWingModel[96].setRotationPoint(83F, -32F, 113.5F);

		rightWingModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F); // Box 462
		rightWingModel[97].setRotationPoint(97F, -29.5F, 110.5F);

		rightWingModel[98].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 463
		rightWingModel[98].setRotationPoint(97F, -28F, 114.5F);

		rightWingModel[99].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 464
		rightWingModel[99].setRotationPoint(97F, -28F, 110.5F);

		rightWingModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F); // Box 465
		rightWingModel[100].setRotationPoint(97F, -25.5F, 110.5F);

		rightWingModel[101].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 466
		rightWingModel[101].setRotationPoint(43F, -30F, 110.5F);

		rightWingModel[102].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 467
		rightWingModel[102].setRotationPoint(45F, -30F, 110.5F);

		rightWingModel[103].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 468
		rightWingModel[103].setRotationPoint(49F, -32F, 108.5F);

		rightWingModel[104].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 469
		rightWingModel[104].setRotationPoint(83F, -32F, 108.5F);

		rightWingModel[105].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 470
		rightWingModel[105].setRotationPoint(43F, -26F, 110.5F);

		rightWingModel[106].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 471
		rightWingModel[106].setRotationPoint(45F, -26F, 110.5F);

		rightWingModel[107].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F); // Box 472
		rightWingModel[107].setRotationPoint(49F, -27F, 108.5F);

		rightWingModel[108].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F); // Box 473
		rightWingModel[108].setRotationPoint(83F, -27F, 108.5F);

		rightWingModel[109].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 474
		rightWingModel[109].setRotationPoint(83F, -27F, 113.5F);

		rightWingModel[110].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 475
		rightWingModel[110].setRotationPoint(49F, -27F, 113.5F);

		rightWingModel[111].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 476
		rightWingModel[111].setRotationPoint(45F, -26F, 113.5F);

		rightWingModel[112].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 477
		rightWingModel[112].setRotationPoint(43F, -26F, 113.5F);


		yawFlapModel = new ModelRendererTurbo[3];
		yawFlapModel[0] = new ModelRendererTurbo(this, 1609, 161, textureX, textureY); // Box 61
		yawFlapModel[1] = new ModelRendererTurbo(this, 2009, 161, textureX, textureY); // Box 65
		yawFlapModel[2] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 100

		yawFlapModel[0].addShapeBox(0F, 0F, 0F, 16, 58, 2, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 61
		yawFlapModel[0].setRotationPoint(131.5F, -100F, -41F);

		yawFlapModel[1].addShapeBox(0F, 0F, 0F, 16, 58, 2, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 65
		yawFlapModel[1].setRotationPoint(131.5F, -100F, 39F);

		yawFlapModel[2].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		yawFlapModel[2].setRotationPoint(-133.5F, -42F, -0.5F);
		yawFlapModel[2].rotateAngleZ = 0.9424778F;


		pitchFlapLeftModel = new ModelRendererTurbo[1];
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 1721, 161, textureX, textureY); // Box 52

		pitchFlapLeftModel[0].addShapeBox(0F, 0F, 0F, 64, 1, 58, 0F, -47F, 0F, 0F, 0F, 0F, -10F, -2F, 0F, 0F, 0F, 0F, 0F, -47F, 0F, 0F, 0F, 0F, -10F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 52
		pitchFlapLeftModel[0].setRotationPoint(116.5F, -34F, -99F);


		pitchFlapRightModel = new ModelRendererTurbo[1];
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 273, 169, textureX, textureY); // Box 54

		pitchFlapRightModel[0].addShapeBox(0F, 0F, 0F, 64, 1, 58, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -10F, -47F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -10F, -47F, 0F, 0F); // Box 54
		pitchFlapRightModel[0].setRotationPoint(116.5F, -34F, 41F);


		pitchFlapLeftWingModel = new ModelRendererTurbo[1];
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 417, 177, textureX, textureY); // Box 67

		pitchFlapLeftWingModel[0].addShapeBox(0F, 0F, 0F, 20, 1, 104, 0F, 0F, 0F, 0F, -13F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, -13F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 6F); // Box 67
		pitchFlapLeftWingModel[0].setRotationPoint(111.5F, -41F, -145F);
		pitchFlapLeftWingModel[0].rotateAngleY = 0.33161256F;


		pitchFlapRightWingModel = new ModelRendererTurbo[1];
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 41, 185, textureX, textureY); // Box 73

		pitchFlapRightWingModel[0].addShapeBox(0F, 0F, 0F, 20, 1, 104, 0F, 0F, 0F, 6F, 0F, 0F, 0F, -13F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, -13F, 0F, 2F, 0F, 0F, 0F); // Box 73
		pitchFlapRightWingModel[0].setRotationPoint(77.5F, -41F, 46F);
		pitchFlapRightWingModel[0].rotateAngleY = -0.33161256F;


		bodyWheelModel = new ModelRendererTurbo[13];
		bodyWheelModel[0] = new ModelRendererTurbo(this, 289, 177, textureX, textureY); // Box 185
		bodyWheelModel[1] = new ModelRendererTurbo(this, 305, 177, textureX, textureY); // Box 186
		bodyWheelModel[2] = new ModelRendererTurbo(this, 321, 177, textureX, textureY); // Box 187
		bodyWheelModel[3] = new ModelRendererTurbo(this, 1281, 177, textureX, textureY); // Box 188
		bodyWheelModel[4] = new ModelRendererTurbo(this, 673, 185, textureX, textureY); // Box 189
		bodyWheelModel[5] = new ModelRendererTurbo(this, 1913, 185, textureX, textureY); // Box 190
		bodyWheelModel[6] = new ModelRendererTurbo(this, 745, 113, textureX, textureY); // Box 191
		bodyWheelModel[7] = new ModelRendererTurbo(this, 1201, 129, textureX, textureY); // Box 192
		bodyWheelModel[8] = new ModelRendererTurbo(this, 625, 137, textureX, textureY); // Box 194
		bodyWheelModel[9] = new ModelRendererTurbo(this, 1049, 137, textureX, textureY); // Box 195
		bodyWheelModel[10] = new ModelRendererTurbo(this, 1393, 137, textureX, textureY); // Box 196
		bodyWheelModel[11] = new ModelRendererTurbo(this, 1329, 177, textureX, textureY); // Box 197
		bodyWheelModel[12] = new ModelRendererTurbo(this, 1, 345, textureX, textureY); // Box 485

		bodyWheelModel[0].addShapeBox(0F, 0F, 0F, 1, 43, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyWheelModel[0].setRotationPoint(-50.5F, -39.5F, -1.5F);

		bodyWheelModel[1].addShapeBox(0F, 0F, 0F, 1, 43, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 186
		bodyWheelModel[1].setRotationPoint(-51.5F, -39.5F, -1.5F);

		bodyWheelModel[2].addShapeBox(0F, 0F, 0F, 1, 43, 3, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 187
		bodyWheelModel[2].setRotationPoint(-49.5F, -39.5F, -1.5F);

		bodyWheelModel[3].addShapeBox(0F, 0F, 0F, 18, 21, 3, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F); // Box 188
		bodyWheelModel[3].setRotationPoint(-50.5F, -39.5F, -1.5F);

		bodyWheelModel[4].addShapeBox(0F, 0F, 0F, 18, 21, 3, 0F, 0F, -20F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -20F, -1F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F); // Box 189
		bodyWheelModel[4].setRotationPoint(-50.5F, -40.5F, -1.5F);

		bodyWheelModel[5].addShapeBox(0F, 0F, 0F, 18, 21, 3, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, -1F, 0F, -20F, -1F, 0F, -20F, -1F, 0F, 0F, -1F); // Box 190
		bodyWheelModel[5].setRotationPoint(-50.5F, -38.5F, -1.5F);

		bodyWheelModel[6].addShapeBox(0F, 0F, 0F, 12, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyWheelModel[6].setRotationPoint(-55.5F, 2F, -5.5F);

		bodyWheelModel[7].addShapeBox(0F, 0F, 0F, 12, 4, 5, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyWheelModel[7].setRotationPoint(-55.5F, -2F, -5.5F);

		bodyWheelModel[8].addShapeBox(0F, 0F, 0F, 12, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 194
		bodyWheelModel[8].setRotationPoint(-55.5F, 6F, -5.5F);

		bodyWheelModel[9].addShapeBox(0F, 0F, 0F, 12, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyWheelModel[9].setRotationPoint(-55.5F, 2F, 0.5F);

		bodyWheelModel[10].addShapeBox(0F, 0F, 0F, 12, 4, 5, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyWheelModel[10].setRotationPoint(-55.5F, -2F, 0.5F);

		bodyWheelModel[11].addShapeBox(0F, 0F, 0F, 12, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 197
		bodyWheelModel[11].setRotationPoint(-55.5F, 6F, 0.5F);

		bodyWheelModel[12].addShapeBox(0F, 0F, 0F, 40, 11, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 485
		bodyWheelModel[12].setRotationPoint(-61.5F, -35F, 6.5F);


		leftWingWheelModel = new ModelRendererTurbo[6];
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 1577, 177, textureX, textureY); // Box 198
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 1593, 177, textureX, textureY); // Box 199
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 721, 185, textureX, textureY); // Box 200
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 1473, 177, textureX, textureY); // Box 201
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 465, 193, textureX, textureY); // Box 202
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 737, 193, textureX, textureY); // Box 203

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 1, 36, 6, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 198
		leftWingWheelModel[0].setRotationPoint(54.5F, -30.5F, -38.5F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 1, 36, 6, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F); // Box 199
		leftWingWheelModel[1].setRotationPoint(53.5F, -30.5F, -38.5F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 1, 36, 6, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -3F); // Box 200
		leftWingWheelModel[2].setRotationPoint(55.5F, -30.5F, -38.5F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 18, 6, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		leftWingWheelModel[3].setRotationPoint(45.5F, -2F, -45F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 18, 6, 7, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		leftWingWheelModel[4].setRotationPoint(45.5F, -8F, -45F);

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 18, 6, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 203
		leftWingWheelModel[5].setRotationPoint(45.5F, 4F, -45F);


		rightWingWheelModel = new ModelRendererTurbo[6];
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 1969, 185, textureX, textureY); // Box 204
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 1985, 185, textureX, textureY); // Box 205
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 793, 193, textureX, textureY); // Box 206
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 1225, 201, textureX, textureY); // Box 207
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 465, 209, textureX, textureY); // Box 208
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 737, 209, textureX, textureY); // Box 209

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 1, 36, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		rightWingWheelModel[0].setRotationPoint(54.5F, -30.5F, 32.5F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 1, 36, 6, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 205
		rightWingWheelModel[1].setRotationPoint(53.5F, -30.5F, 32.5F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 1, 36, 6, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 206
		rightWingWheelModel[2].setRotationPoint(55.5F, -30.5F, 32.5F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 18, 6, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		rightWingWheelModel[3].setRotationPoint(45.5F, -2F, 38F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 18, 6, 7, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		rightWingWheelModel[4].setRotationPoint(45.5F, -8F, 38F);

		rightWingWheelModel[5].addShapeBox(0F, 0F, 0F, 18, 6, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 209
		rightWingWheelModel[5].setRotationPoint(45.5F, 4F, 38F);


		hudModel = new ModelRendererTurbo[1];
		hudModel[0] = new ModelRendererTurbo(this, 825, 850, textureX, textureY); // Box 645

		hudModel[0].addShapeBox(0F, -256.5F, -256F, 0, 512, 512, 0F, 0F, -255F, -254F, 0F, -255F, -254F, 0F, -255F, -254F, 0F, -255F, -254F, 0F, -254F, -254F, 0F, -254F, -254F, 0F, -254F, -254F, 0F, -254F, -254F); // Box 645
		hudModel[0].setRotationPoint(-131.2F, -58.5F, 0F);
		hudModel[0].rotateAngleZ = -0.06981317F;



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}