//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Khalid
// Model Creator: 
// Created on: 28.03.2016 - 20:04:07
// Last changed on: 28.03.2016 - 20:04:07

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelKhalid extends ModelVehicle //Same as Filename
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelKhalid() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[205];
		turretModel = new ModelRendererTurbo[132];
		barrelModel = new ModelRendererTurbo[24];
		leftTrackModel = new ModelRendererTurbo[73];
		rightTrackModel = new ModelRendererTurbo[73];

		initbodyModel_1();
		initturretModel_1();
		initbarrelModel_1();
		initleftTrackModel_1();
		initrightTrackModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 0, 136, textureX, textureY); // Import ImportBox0
		bodyModel[1] = new ModelRendererTurbo(this, 0, 164, textureX, textureY); // Import ImportBox2
		bodyModel[2] = new ModelRendererTurbo(this, 0, 136, textureX, textureY); // Import ImportBox4
		bodyModel[3] = new ModelRendererTurbo(this, 0, 164, textureX, textureY); // Import ImportBox5
		bodyModel[4] = new ModelRendererTurbo(this, 0, 189, textureX, textureY); // Import ImportBox6
		bodyModel[5] = new ModelRendererTurbo(this, 0, 189, textureX, textureY); // Import ImportBox7
		bodyModel[6] = new ModelRendererTurbo(this, 0, 221, textureX, textureY); // Import ImportBox8
		bodyModel[7] = new ModelRendererTurbo(this, 0, 221, textureX, textureY); // Import ImportBox10
		bodyModel[8] = new ModelRendererTurbo(this, 0, 252, textureX, textureY); // Import ImportBox11
		bodyModel[9] = new ModelRendererTurbo(this, 0, 283, textureX, textureY); // Import ImportBox12
		bodyModel[10] = new ModelRendererTurbo(this, 0, 305, textureX, textureY); // Import ImportBox13
		bodyModel[11] = new ModelRendererTurbo(this, 0, 283, textureX, textureY); // Import ImportBox14
		bodyModel[12] = new ModelRendererTurbo(this, 0, 305, textureX, textureY); // Import ImportBox15
		bodyModel[13] = new ModelRendererTurbo(this, 0, 330, textureX, textureY); // Import ImportBox16
		bodyModel[14] = new ModelRendererTurbo(this, 0, 362, textureX, textureY); // Import ImportBox17
		bodyModel[15] = new ModelRendererTurbo(this, 0, 362, textureX, textureY); // Import ImportBox18
		bodyModel[16] = new ModelRendererTurbo(this, 0, 379, textureX, textureY); // Import ImportBox19
		bodyModel[17] = new ModelRendererTurbo(this, 0, 390, textureX, textureY); // Import ImportBox20
		bodyModel[18] = new ModelRendererTurbo(this, 0, 379, textureX, textureY); // Import ImportBox21
		bodyModel[19] = new ModelRendererTurbo(this, 0, 390, textureX, textureY); // Import ImportBox22
		bodyModel[20] = new ModelRendererTurbo(this, 0, 410, textureX, textureY); // Import ImportBox23
		bodyModel[21] = new ModelRendererTurbo(this, 0, 426, textureX, textureY); // Import ImportBox24
		bodyModel[22] = new ModelRendererTurbo(this, 0, 410, textureX, textureY); // Import ImportBox25
		bodyModel[23] = new ModelRendererTurbo(this, 0, 426, textureX, textureY); // Import ImportBox26
		bodyModel[24] = new ModelRendererTurbo(this, 0, 444, textureX, textureY); // Import ImportBox27
		bodyModel[25] = new ModelRendererTurbo(this, 0, 469, textureX, textureY); // Import ImportBox28
		bodyModel[26] = new ModelRendererTurbo(this, 0, 495, textureX, textureY); // Import ImportBox29
		bodyModel[27] = new ModelRendererTurbo(this, 0, 518, textureX, textureY); // Import ImportBox30
		bodyModel[28] = new ModelRendererTurbo(this, 0, 518, textureX, textureY); // Import ImportBox31
		bodyModel[29] = new ModelRendererTurbo(this, 0, 518, textureX, textureY); // Import ImportBox32
		bodyModel[30] = new ModelRendererTurbo(this, 0, 520, textureX, textureY); // Import ImportBox33
		bodyModel[31] = new ModelRendererTurbo(this, 0, 543, textureX, textureY); // Import ImportBox34
		bodyModel[32] = new ModelRendererTurbo(this, 0, 561, textureX, textureY); // Import ImportBox35
		bodyModel[33] = new ModelRendererTurbo(this, 0, 574, textureX, textureY); // Import ImportBox36
		bodyModel[34] = new ModelRendererTurbo(this, 0, 592, textureX, textureY); // Import ImportBox37
		bodyModel[35] = new ModelRendererTurbo(this, 0, 608, textureX, textureY); // Import ImportBox38
		bodyModel[36] = new ModelRendererTurbo(this, 0, 608, textureX, textureY); // Import ImportBox39
		bodyModel[37] = new ModelRendererTurbo(this, 0, 608, textureX, textureY); // Import ImportBox40
		bodyModel[38] = new ModelRendererTurbo(this, 0, 608, textureX, textureY); // Import ImportBox41
		bodyModel[39] = new ModelRendererTurbo(this, 0, 613, textureX, textureY); // Import ImportBox42
		bodyModel[40] = new ModelRendererTurbo(this, 0, 632, textureX, textureY); // Import ImportBox43
		bodyModel[41] = new ModelRendererTurbo(this, 0, 444, textureX, textureY); // Import ImportBox44
		bodyModel[42] = new ModelRendererTurbo(this, 0, 469, textureX, textureY); // Import ImportBox45
		bodyModel[43] = new ModelRendererTurbo(this, 0, 495, textureX, textureY); // Import ImportBox46
		bodyModel[44] = new ModelRendererTurbo(this, 0, 518, textureX, textureY); // Import ImportBox47
		bodyModel[45] = new ModelRendererTurbo(this, 0, 518, textureX, textureY); // Import ImportBox48
		bodyModel[46] = new ModelRendererTurbo(this, 0, 518, textureX, textureY); // Import ImportBox49
		bodyModel[47] = new ModelRendererTurbo(this, 0, 520, textureX, textureY); // Import ImportBox50
		bodyModel[48] = new ModelRendererTurbo(this, 0, 543, textureX, textureY); // Import ImportBox51
		bodyModel[49] = new ModelRendererTurbo(this, 0, 561, textureX, textureY); // Import ImportBox52
		bodyModel[50] = new ModelRendererTurbo(this, 0, 574, textureX, textureY); // Import ImportBox53
		bodyModel[51] = new ModelRendererTurbo(this, 0, 592, textureX, textureY); // Import ImportBox54
		bodyModel[52] = new ModelRendererTurbo(this, 0, 608, textureX, textureY); // Import ImportBox55
		bodyModel[53] = new ModelRendererTurbo(this, 0, 608, textureX, textureY); // Import ImportBox56
		bodyModel[54] = new ModelRendererTurbo(this, 0, 608, textureX, textureY); // Import ImportBox57
		bodyModel[55] = new ModelRendererTurbo(this, 0, 608, textureX, textureY); // Import ImportBox58
		bodyModel[56] = new ModelRendererTurbo(this, 0, 613, textureX, textureY); // Import ImportBox59
		bodyModel[57] = new ModelRendererTurbo(this, 0, 632, textureX, textureY); // Import ImportBox60
		bodyModel[58] = new ModelRendererTurbo(this, 0, 640, textureX, textureY); // Import ImportBox61
		bodyModel[59] = new ModelRendererTurbo(this, 0, 665, textureX, textureY); // Import ImportBox62
		bodyModel[60] = new ModelRendererTurbo(this, 0, 668, textureX, textureY); // Import ImportBox63
		bodyModel[61] = new ModelRendererTurbo(this, 0, 668, textureX, textureY); // Import ImportBox64
		bodyModel[62] = new ModelRendererTurbo(this, 0, 668, textureX, textureY); // Import ImportBox65
		bodyModel[63] = new ModelRendererTurbo(this, 0, 668, textureX, textureY); // Import ImportBox66
		bodyModel[64] = new ModelRendererTurbo(this, 0, 668, textureX, textureY); // Import ImportBox67
		bodyModel[65] = new ModelRendererTurbo(this, 0, 681, textureX, textureY); // Import ImportBox68
		bodyModel[66] = new ModelRendererTurbo(this, 0, 681, textureX, textureY); // Import ImportBox69
		bodyModel[67] = new ModelRendererTurbo(this, 0, 685, textureX, textureY); // Import ImportBox70
		bodyModel[68] = new ModelRendererTurbo(this, 0, 693, textureX, textureY); // Import ImportBox71
		bodyModel[69] = new ModelRendererTurbo(this, 0, 693, textureX, textureY); // Import ImportBox72
		bodyModel[70] = new ModelRendererTurbo(this, 0, 693, textureX, textureY); // Import ImportBox73
		bodyModel[71] = new ModelRendererTurbo(this, 0, 693, textureX, textureY); // Import ImportBox74
		bodyModel[72] = new ModelRendererTurbo(this, 0, 693, textureX, textureY); // Import ImportBox75
		bodyModel[73] = new ModelRendererTurbo(this, 0, 693, textureX, textureY); // Import ImportBox76
		bodyModel[74] = new ModelRendererTurbo(this, 0, 668, textureX, textureY); // Import ImportBox77
		bodyModel[75] = new ModelRendererTurbo(this, 0, 668, textureX, textureY); // Import ImportBox78
		bodyModel[76] = new ModelRendererTurbo(this, 0, 665, textureX, textureY); // Import ImportBox79
		bodyModel[77] = new ModelRendererTurbo(this, 0, 668, textureX, textureY); // Import ImportBox80
		bodyModel[78] = new ModelRendererTurbo(this, 0, 668, textureX, textureY); // Import ImportBox81
		bodyModel[79] = new ModelRendererTurbo(this, 0, 668, textureX, textureY); // Import ImportBox82
		bodyModel[80] = new ModelRendererTurbo(this, 0, 668, textureX, textureY); // Import ImportBox83
		bodyModel[81] = new ModelRendererTurbo(this, 0, 668, textureX, textureY); // Import ImportBox84
		bodyModel[82] = new ModelRendererTurbo(this, 0, 681, textureX, textureY); // Import ImportBox85
		bodyModel[83] = new ModelRendererTurbo(this, 0, 681, textureX, textureY); // Import ImportBox86
		bodyModel[84] = new ModelRendererTurbo(this, 0, 685, textureX, textureY); // Import ImportBox87
		bodyModel[85] = new ModelRendererTurbo(this, 0, 693, textureX, textureY); // Import ImportBox88
		bodyModel[86] = new ModelRendererTurbo(this, 0, 693, textureX, textureY); // Import ImportBox89
		bodyModel[87] = new ModelRendererTurbo(this, 0, 693, textureX, textureY); // Import ImportBox90
		bodyModel[88] = new ModelRendererTurbo(this, 0, 693, textureX, textureY); // Import ImportBox91
		bodyModel[89] = new ModelRendererTurbo(this, 0, 693, textureX, textureY); // Import ImportBox92
		bodyModel[90] = new ModelRendererTurbo(this, 0, 693, textureX, textureY); // Import ImportBox93
		bodyModel[91] = new ModelRendererTurbo(this, 0, 668, textureX, textureY); // Import ImportBox94
		bodyModel[92] = new ModelRendererTurbo(this, 0, 668, textureX, textureY); // Import ImportBox95
		bodyModel[93] = new ModelRendererTurbo(this, 0, 700, textureX, textureY); // Import ImportBox96
		bodyModel[94] = new ModelRendererTurbo(this, 0, 700, textureX, textureY); // Import ImportBox98
		bodyModel[95] = new ModelRendererTurbo(this, 0, 700, textureX, textureY); // Import ImportBox99
		bodyModel[96] = new ModelRendererTurbo(this, 0, 707, textureX, textureY); // Import ImportBox100
		bodyModel[97] = new ModelRendererTurbo(this, 0, 737, textureX, textureY); // Import ImportBox101
		bodyModel[98] = new ModelRendererTurbo(this, 0, 787, textureX, textureY); // Import ImportBox102
		bodyModel[99] = new ModelRendererTurbo(this, 0, 853, textureX, textureY); // Import ImportBox103
		bodyModel[100] = new ModelRendererTurbo(this, 0, 870, textureX, textureY); // Import ImportBox104
		bodyModel[101] = new ModelRendererTurbo(this, 0, 882, textureX, textureY); // Import ImportBox105
		bodyModel[102] = new ModelRendererTurbo(this, 0, 890, textureX, textureY); // Import ImportBox106
		bodyModel[103] = new ModelRendererTurbo(this, 0, 853, textureX, textureY); // Import ImportBox107
		bodyModel[104] = new ModelRendererTurbo(this, 0, 870, textureX, textureY); // Import ImportBox108
		bodyModel[105] = new ModelRendererTurbo(this, 0, 882, textureX, textureY); // Import ImportBox109
		bodyModel[106] = new ModelRendererTurbo(this, 0, 956, textureX, textureY); // Import ImportBox110
		bodyModel[107] = new ModelRendererTurbo(this, 0, 956, textureX, textureY); // Import ImportBox111
		bodyModel[108] = new ModelRendererTurbo(this, 0, 956, textureX, textureY); // Import ImportBox112
		bodyModel[109] = new ModelRendererTurbo(this, 0, 956, textureX, textureY); // Import ImportBox113
		bodyModel[110] = new ModelRendererTurbo(this, 0, 956, textureX, textureY); // Import ImportBox114
		bodyModel[111] = new ModelRendererTurbo(this, 0, 956, textureX, textureY); // Import ImportBox115
		bodyModel[112] = new ModelRendererTurbo(this, 0, 956, textureX, textureY); // Import ImportBox116
		bodyModel[113] = new ModelRendererTurbo(this, 0, 956, textureX, textureY); // Import ImportBox117
		bodyModel[114] = new ModelRendererTurbo(this, 0, 960, textureX, textureY); // Import ImportBox118
		bodyModel[115] = new ModelRendererTurbo(this, 0, 980, textureX, textureY); // Import ImportBox119
		bodyModel[116] = new ModelRendererTurbo(this, 0, 1003, textureX, textureY); // Import ImportBox120
		bodyModel[117] = new ModelRendererTurbo(this, 0, 1019, textureX, textureY); // Import ImportBox121
		bodyModel[118] = new ModelRendererTurbo(this, 0, 1036, textureX, textureY); // Import ImportBox122
		bodyModel[119] = new ModelRendererTurbo(this, 0, 608, textureX, textureY); // Import ImportBox123
		bodyModel[120] = new ModelRendererTurbo(this, 0, 608, textureX, textureY); // Import ImportBox124
		bodyModel[121] = new ModelRendererTurbo(this, 0, 608, textureX, textureY); // Import ImportBox125
		bodyModel[122] = new ModelRendererTurbo(this, 0, 608, textureX, textureY); // Import ImportBox126
		bodyModel[123] = new ModelRendererTurbo(this, 0, 960, textureX, textureY); // Import ImportBox127
		bodyModel[124] = new ModelRendererTurbo(this, 0, 980, textureX, textureY); // Import ImportBox128
		bodyModel[125] = new ModelRendererTurbo(this, 0, 1003, textureX, textureY); // Import ImportBox129
		bodyModel[126] = new ModelRendererTurbo(this, 0, 1019, textureX, textureY); // Import ImportBox130
		bodyModel[127] = new ModelRendererTurbo(this, 0, 1036, textureX, textureY); // Import ImportBox131
		bodyModel[128] = new ModelRendererTurbo(this, 0, 608, textureX, textureY); // Import ImportBox132
		bodyModel[129] = new ModelRendererTurbo(this, 0, 608, textureX, textureY); // Import ImportBox133
		bodyModel[130] = new ModelRendererTurbo(this, 0, 608, textureX, textureY); // Import ImportBox134
		bodyModel[131] = new ModelRendererTurbo(this, 0, 608, textureX, textureY); // Import ImportBox135
		bodyModel[132] = new ModelRendererTurbo(this, 0, 1053, textureX, textureY); // Import ImportBox136
		bodyModel[133] = new ModelRendererTurbo(this, 0, 1053, textureX, textureY); // Import ImportBox137
		bodyModel[134] = new ModelRendererTurbo(this, 0, 1083, textureX, textureY); // Import ImportBox138
		bodyModel[135] = new ModelRendererTurbo(this, 0, 1135, textureX, textureY); // Import ImportBox139
		bodyModel[136] = new ModelRendererTurbo(this, 0, 1140, textureX, textureY); // Import ImportBox140
		bodyModel[137] = new ModelRendererTurbo(this, 0, 1150, textureX, textureY); // Import ImportBox141
		bodyModel[138] = new ModelRendererTurbo(this, 0, 1140, textureX, textureY); // Import ImportBox142
		bodyModel[139] = new ModelRendererTurbo(this, 0, 1191, textureX, textureY); // Import ImportBox143
		bodyModel[140] = new ModelRendererTurbo(this, 0, 1192, textureX, textureY); // Import ImportBox144
		bodyModel[141] = new ModelRendererTurbo(this, 0, 1191, textureX, textureY); // Import ImportBox145
		bodyModel[142] = new ModelRendererTurbo(this, 0, 1135, textureX, textureY); // Import ImportBox146
		bodyModel[143] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Import ImportBox147
		bodyModel[144] = new ModelRendererTurbo(this, 0, 1281, textureX, textureY); // Import ImportBox148
		bodyModel[145] = new ModelRendererTurbo(this, 0, 1281, textureX, textureY); // Import ImportBox149
		bodyModel[146] = new ModelRendererTurbo(this, 0, 1314, textureX, textureY); // Import ImportBox150
		bodyModel[147] = new ModelRendererTurbo(this, 0, 1331, textureX, textureY); // Import ImportBox151
		bodyModel[148] = new ModelRendererTurbo(this, 0, 1343, textureX, textureY); // Import ImportBox152
		bodyModel[149] = new ModelRendererTurbo(this, 0, 1343, textureX, textureY); // Import ImportBox153
		bodyModel[150] = new ModelRendererTurbo(this, 0, 1347, textureX, textureY); // Import ImportBox154
		bodyModel[151] = new ModelRendererTurbo(this, 0, 1347, textureX, textureY); // Import ImportBox155
		bodyModel[152] = new ModelRendererTurbo(this, 0, 1314, textureX, textureY); // Import ImportBox156
		bodyModel[153] = new ModelRendererTurbo(this, 0, 1331, textureX, textureY); // Import ImportBox157
		bodyModel[154] = new ModelRendererTurbo(this, 0, 1343, textureX, textureY); // Import ImportBox158
		bodyModel[155] = new ModelRendererTurbo(this, 0, 1343, textureX, textureY); // Import ImportBox159
		bodyModel[156] = new ModelRendererTurbo(this, 0, 1347, textureX, textureY); // Import ImportBox160
		bodyModel[157] = new ModelRendererTurbo(this, 0, 1347, textureX, textureY); // Import ImportBox161
		bodyModel[158] = new ModelRendererTurbo(this, 0, 1347, textureX, textureY); // Import ImportBox162
		bodyModel[159] = new ModelRendererTurbo(this, 0, 1392, textureX, textureY); // Import ImportBox163
		bodyModel[160] = new ModelRendererTurbo(this, 0, 1423, textureX, textureY); // Import ImportBox164
		bodyModel[161] = new ModelRendererTurbo(this, 0, 1423, textureX, textureY); // Import ImportBox165
		bodyModel[162] = new ModelRendererTurbo(this, 0, 1427, textureX, textureY); // Import ImportBox166
		bodyModel[163] = new ModelRendererTurbo(this, 0, 1445, textureX, textureY); // Import ImportBox167
		bodyModel[164] = new ModelRendererTurbo(this, 0, 1452, textureX, textureY); // Import ImportBox168
		bodyModel[165] = new ModelRendererTurbo(this, 0, 1452, textureX, textureY); // Import ImportBox171
		bodyModel[166] = new ModelRendererTurbo(this, 0, 1445, textureX, textureY); // Import ImportBox172
		bodyModel[167] = new ModelRendererTurbo(this, 0, 1457, textureX, textureY); // Import ImportBox173
		bodyModel[168] = new ModelRendererTurbo(this, 0, 1464, textureX, textureY); // Import ImportBox174
		bodyModel[169] = new ModelRendererTurbo(this, 0, 1464, textureX, textureY); // Import ImportBox175
		bodyModel[170] = new ModelRendererTurbo(this, 0, 1474, textureX, textureY); // Import ImportBox176
		bodyModel[171] = new ModelRendererTurbo(this, 0, 1480, textureX, textureY); // Import ImportBox177
		bodyModel[172] = new ModelRendererTurbo(this, 0, 1480, textureX, textureY); // Import ImportBox178
		bodyModel[173] = new ModelRendererTurbo(this, 0, 1474, textureX, textureY); // Import ImportBox179
		bodyModel[174] = new ModelRendererTurbo(this, 0, 1484, textureX, textureY); // Import ImportBox180
		bodyModel[175] = new ModelRendererTurbo(this, 0, 1490, textureX, textureY); // Import ImportBox181
		bodyModel[176] = new ModelRendererTurbo(this, 0, 1495, textureX, textureY); // Import ImportBox182
		bodyModel[177] = new ModelRendererTurbo(this, 0, 1500, textureX, textureY); // Import ImportBox183
		bodyModel[178] = new ModelRendererTurbo(this, 0, 1500, textureX, textureY); // Import ImportBox184
		bodyModel[179] = new ModelRendererTurbo(this, 0, 1505, textureX, textureY); // Import ImportBox185
		bodyModel[180] = new ModelRendererTurbo(this, 300, 1851, textureX, textureY); // Import ImportBox578
		bodyModel[181] = new ModelRendererTurbo(this, 300, 1857, textureX, textureY); // Import ImportBox579
		bodyModel[182] = new ModelRendererTurbo(this, 300, 1860, textureX, textureY); // Import ImportBox580
		bodyModel[183] = new ModelRendererTurbo(this, 300, 1865, textureX, textureY); // Import ImportBox581
		bodyModel[184] = new ModelRendererTurbo(this, 300, 1870, textureX, textureY); // Import ImportBox582
		bodyModel[185] = new ModelRendererTurbo(this, 300, 1873, textureX, textureY); // Import ImportBox583
		bodyModel[186] = new ModelRendererTurbo(this, 300, 1880, textureX, textureY); // Import ImportBox584
		bodyModel[187] = new ModelRendererTurbo(this, 300, 1890, textureX, textureY); // Import ImportBox585
		bodyModel[188] = new ModelRendererTurbo(this, 300, 1896, textureX, textureY); // Import ImportBox586
		bodyModel[189] = new ModelRendererTurbo(this, 300, 1900, textureX, textureY); // Import ImportBox587
		bodyModel[190] = new ModelRendererTurbo(this, 300, 1900, textureX, textureY); // Import ImportBox588
		bodyModel[191] = new ModelRendererTurbo(this, 300, 1905, textureX, textureY); // Import ImportBox589
		bodyModel[192] = new ModelRendererTurbo(this, 300, 1905, textureX, textureY); // Import ImportBox590
		bodyModel[193] = new ModelRendererTurbo(this, 300, 1910, textureX, textureY); // Import ImportBox591
		bodyModel[194] = new ModelRendererTurbo(this, 300, 1916, textureX, textureY); // Import ImportBox592
		bodyModel[195] = new ModelRendererTurbo(this, 300, 1910, textureX, textureY); // Import ImportBox593
		bodyModel[196] = new ModelRendererTurbo(this, 300, 1924, textureX, textureY); // Import ImportBox594
		bodyModel[197] = new ModelRendererTurbo(this, 300, 1929, textureX, textureY); // Import ImportBox595
		bodyModel[198] = new ModelRendererTurbo(this, 300, 1933, textureX, textureY); // Import ImportBox596
		bodyModel[199] = new ModelRendererTurbo(this, 300, 1937, textureX, textureY); // Import ImportBox597
		bodyModel[200] = new ModelRendererTurbo(this, 300, 1940, textureX, textureY); // Import ImportBox598
		bodyModel[201] = new ModelRendererTurbo(this, 300, 1943, textureX, textureY); // Import ImportBox599
		bodyModel[202] = new ModelRendererTurbo(this, 300, 1947, textureX, textureY); // Import ImportBox600
		bodyModel[203] = new ModelRendererTurbo(this, 300, 1950, textureX, textureY); // Import ImportBox601
		bodyModel[204] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import ImportBox602

		bodyModel[0].addShapeBox(0F, 0F, 0F, 6, 6, 19, 0F,0F, 0F, 0F, 0F, -3F, -0.4285F, 1F, -3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.8571F, 1F, 0F, 0.5F, 0F, 0F, 0.5F); // Import ImportBox0
		bodyModel[0].setRotationPoint(60F, -16F, -19.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 2, 3, 19, 0F,0F, 0F, -0.4285F, 0F, -2F, -0.7142F, 1F, -2F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, -0.8571F, 0F, 0F, -0.8571F, 1F, 0F, 0.5F, -1F, 0F, 0.5F); // Import ImportBox2
		bodyModel[1].setRotationPoint(66F, -13F, -19.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 6, 6, 19, 0F,0F, 0F, 0.5F, 1F, -3F, 0.5F, 0F, -3F, -0.4285F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, -0.8571F, 0F, 0F, 0F); // Import ImportBox4
		bodyModel[2].setRotationPoint(60F, -16F, 0.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 3, 19, 0F,-1F, 0F, 0.5F, 1F, -2F, 0.5F, 0F, -2F, -0.7142F, 0F, 0F, -0.4285F, -1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, -0.8571F, 0F, 0F, -0.8571F); // Import ImportBox5
		bodyModel[3].setRotationPoint(66F, -13F, 0.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 9, 9, 19, 0F,0F, 0F, 0F, -1F, 0F, -0.8571F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.5F, -3F, -8.9F, -1.5F, -3F, -8.9F, 0F, 0.5F, 0F, 0F, 0.5F); // Import ImportBox6
		bodyModel[4].setRotationPoint(60F, -10F, -19.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 9, 9, 19, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, -0.8571F, 0F, 0F, 0F, 0F, 0F, 0.5F, -8.9F, 0F, 0.5F, -8.9F, -1.5F, -3F, 0F, -1.5F, -3F); // Import ImportBox7
		bodyModel[5].setRotationPoint(60F, -10F, 0.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 24, 9, 19, 0F,0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import ImportBox8
		bodyModel[6].setRotationPoint(36F, -10F, -19.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 24, 9, 19, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.5F, -3F, 0F, -1.5F, -3F); // Import ImportBox10
		bodyModel[7].setRotationPoint(36F, -10F, 0.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 7, 6, 22, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox11
		bodyModel[8].setRotationPoint(53F, -19F, -11F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 7, 9, 9, 0F,0F, -1.5F, 0F, 0F, -3F, -0.5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox12
		bodyModel[9].setRotationPoint(53F, -19F, -20F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 17, 12, 9, 0F,0F, -3F, 1F, 0F, -4.5F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox13
		bodyModel[10].setRotationPoint(36F, -22F, -20F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 7, 9, 9, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Import ImportBox14
		bodyModel[11].setRotationPoint(53F, -19F, 11F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 17, 12, 9, 0F,0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -4.5F, 0F, 0F, -3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox15
		bodyModel[12].setRotationPoint(36F, -22F, 11F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 17, 7, 22, 0F,0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox16
		bodyModel[13].setRotationPoint(36F, -22F, -11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox17
		bodyModel[14].setRotationPoint(32F, -24.5F, -5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 8, 5, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		bodyModel[15].setRotationPoint(32F, -24.5F, 0F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox19
		bodyModel[16].setRotationPoint(32F, -24.5F, -11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 11, 6, 10, 0F,0F, 0F, 0F, -9F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Import ImportBox20
		bodyModel[17].setRotationPoint(25F, -24.5F, -21F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox21
		bodyModel[18].setRotationPoint(32F, -24.5F, 5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 11, 6, 10, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox22
		bodyModel[19].setRotationPoint(25F, -24.5F, 11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 13, 6, 7, 0F,0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox23
		bodyModel[20].setRotationPoint(14F, -24.5F, -28F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 18, 9, 6, 0F,0F, 0F, -5F, -8F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -8F, 0F, 0F, 11F, -3F, 0F, 0F, 0F, 0F); // Import ImportBox24
		bodyModel[21].setRotationPoint(-2F, -24.5F, -34F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 13, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox25
		bodyModel[22].setRotationPoint(14F, -24.5F, 21F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 18, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 11F, -3F, 0F, -8F, 0F, 0F, 0F, -1F, 0F); // Import ImportBox26
		bodyModel[23].setRotationPoint(-2F, -24.5F, 28F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 9, 6, 15, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1.5F, 0F, 2F, -1.5F, 0F, 0F, 0F, 2F); // Import ImportBox27
		bodyModel[24].setRotationPoint(63F, -17.5F, -35.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 106, 6, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 4F); // Import ImportBox28
		bodyModel[25].setRotationPoint(-43F, -17.5F, -35.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 28, 6, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F); // Import ImportBox29
		bodyModel[26].setRotationPoint(7F, -23.5F, -35.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox30
		bodyModel[27].setRotationPoint(12F, -22.5F, -36F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox31
		bodyModel[28].setRotationPoint(20F, -22.5F, -36F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox32
		bodyModel[29].setRotationPoint(28F, -22.5F, -36F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 15, 6, 13, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox33
		bodyModel[30].setRotationPoint(36.5F, -23.5F, -35F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 11, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F); // Import ImportBox34
		bodyModel[31].setRotationPoint(57F, -16.5F, -36F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 101, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox35
		bodyModel[32].setRotationPoint(-43F, -11.5F, -35.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 18, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox36
		bodyModel[33].setRotationPoint(38.5F, -16.5F, -36F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 40, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox37
		bodyModel[34].setRotationPoint(-2F, -16.5F, -36F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox38
		bodyModel[35].setRotationPoint(59F, -18.5F, -36F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox39
		bodyModel[36].setRotationPoint(38.5F, -18.5F, -36F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox40
		bodyModel[37].setRotationPoint(32F, -18.5F, -36F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox41
		bodyModel[38].setRotationPoint(0.5F, -18.5F, -36F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox42
		bodyModel[39].setRotationPoint(59.5F, -18F, -35F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox43
		bodyModel[40].setRotationPoint(59.5F, -18F, -19F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 9, 6, 15, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 2F, -1.5F, 0F, 2F, -1.5F, 0F, 0F, 0F, 0F); // Import ImportBox44
		bodyModel[41].setRotationPoint(63F, -17.5F, 20.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 106, 6, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox45
		bodyModel[42].setRotationPoint(-43F, -17.5F, 20.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 28, 6, 15, 0F,0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox46
		bodyModel[43].setRotationPoint(7F, -23.5F, 20.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox47
		bodyModel[44].setRotationPoint(12F, -22.5F, 35F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox48
		bodyModel[45].setRotationPoint(20F, -22.5F, 35F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox49
		bodyModel[46].setRotationPoint(28F, -22.5F, 35F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 15, 6, 13, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox50
		bodyModel[47].setRotationPoint(36.5F, -23.5F, 22F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 11, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F); // Import ImportBox51
		bodyModel[48].setRotationPoint(57F, -16.5F, 35F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 101, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox52
		bodyModel[49].setRotationPoint(-43F, -11.5F, 34.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 18, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox53
		bodyModel[50].setRotationPoint(38.5F, -16.5F, 35F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 40, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox54
		bodyModel[51].setRotationPoint(-2F, -16.5F, 35F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox55
		bodyModel[52].setRotationPoint(59F, -18.5F, 35F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox56
		bodyModel[53].setRotationPoint(38.5F, -18.5F, 35F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox57
		bodyModel[54].setRotationPoint(32F, -18.5F, 35F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox58
		bodyModel[55].setRotationPoint(0.5F, -18.5F, 35F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox59
		bodyModel[56].setRotationPoint(59.5F, -18F, 19F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox60
		bodyModel[57].setRotationPoint(59.5F, -18F, 16F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 3, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Import ImportBox61
		bodyModel[58].setRotationPoint(68F, -15F, -10F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox62
		bodyModel[59].setRotationPoint(65F, -15F, -9.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox63
		bodyModel[60].setRotationPoint(64F, -18F, -9.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox64
		bodyModel[61].setRotationPoint(64F, -18F, -14F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox65
		bodyModel[62].setRotationPoint(64F, -18F, -18.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox66
		bodyModel[63].setRotationPoint(64F, -19F, -18.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox67
		bodyModel[64].setRotationPoint(61F, -19F, -18.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox68
		bodyModel[65].setRotationPoint(62F, -19F, -18.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox69
		bodyModel[66].setRotationPoint(62F, -19F, -9.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox70
		bodyModel[67].setRotationPoint(64F, -15F, -13F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox71
		bodyModel[68].setRotationPoint(61F, -18F, -12.75F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox72
		bodyModel[69].setRotationPoint(61F, -17F, -12.75F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportBox73
		bodyModel[70].setRotationPoint(61F, -16F, -12.75F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportBox74
		bodyModel[71].setRotationPoint(61F, -16F, -17.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox75
		bodyModel[72].setRotationPoint(61F, -18F, -17.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox76
		bodyModel[73].setRotationPoint(61F, -17F, -17.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox77
		bodyModel[74].setRotationPoint(61F, -18F, -9.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox78
		bodyModel[75].setRotationPoint(61F, -18F, -18.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox79
		bodyModel[76].setRotationPoint(65F, -15F, 8.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox80
		bodyModel[77].setRotationPoint(64F, -18F, 8.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox81
		bodyModel[78].setRotationPoint(64F, -18F, 13F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox82
		bodyModel[79].setRotationPoint(64F, -18F, 17.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox83
		bodyModel[80].setRotationPoint(64F, -19F, 8.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox84
		bodyModel[81].setRotationPoint(61F, -19F, 8.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox85
		bodyModel[82].setRotationPoint(62F, -19F, 17.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox86
		bodyModel[83].setRotationPoint(62F, -19F, 8.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox87
		bodyModel[84].setRotationPoint(64F, -15F, 9F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox88
		bodyModel[85].setRotationPoint(61F, -18F, 9.75F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox89
		bodyModel[86].setRotationPoint(61F, -17F, 9.75F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportBox90
		bodyModel[87].setRotationPoint(61F, -16F, 9.75F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportBox91
		bodyModel[88].setRotationPoint(61F, -16F, 14.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox92
		bodyModel[89].setRotationPoint(61F, -18F, 14.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox93
		bodyModel[90].setRotationPoint(61F, -17F, 14.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox94
		bodyModel[91].setRotationPoint(61F, -18F, 8.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox95
		bodyModel[92].setRotationPoint(61F, -18F, 17.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import ImportBox96
		bodyModel[93].setRotationPoint(62F, -7F, -0.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import ImportBox98
		bodyModel[94].setRotationPoint(62F, -9F, -13.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import ImportBox99
		bodyModel[95].setRotationPoint(62F, -9F, 12.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 7, 6, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox100
		bodyModel[96].setRotationPoint(25F, -24.5F, -11F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 11, 6, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox101
		bodyModel[97].setRotationPoint(14F, -24.5F, -21F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 16, 7, 56, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox102
		bodyModel[98].setRotationPoint(-2F, -24.5F, -28F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 72, 8, 6, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox103
		bodyModel[99].setRotationPoint(-74F, -24.5F, -34F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 49, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox104
		bodyModel[100].setRotationPoint(-72F, -23.5F, -34F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 49, 2, 4, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox105
		bodyModel[101].setRotationPoint(-72F, -25.5F, -34F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 72, 8, 56, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox106
		bodyModel[102].setRotationPoint(-74F, -24.5F, -28F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 72, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox107
		bodyModel[103].setRotationPoint(-74F, -24.5F, 28F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 49, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox108
		bodyModel[104].setRotationPoint(-72F, -23.5F, 30F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 49, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox109
		bodyModel[105].setRotationPoint(-72F, -25.5F, 30F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox110
		bodyModel[106].setRotationPoint(-68F, -24.5F, -34.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox111
		bodyModel[107].setRotationPoint(-56F, -24.5F, -34.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox112
		bodyModel[108].setRotationPoint(-42F, -24.5F, -34.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox113
		bodyModel[109].setRotationPoint(-30F, -24.5F, -34.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox114
		bodyModel[110].setRotationPoint(-68F, -24.5F, 33.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox115
		bodyModel[111].setRotationPoint(-56F, -24.5F, 33.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox116
		bodyModel[112].setRotationPoint(-42F, -24.5F, 33.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox117
		bodyModel[113].setRotationPoint(-30F, -24.5F, 33.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 28, 3, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 4F); // Import ImportBox118
		bodyModel[114].setRotationPoint(-71F, -17.5F, -35.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 9, 6, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import ImportBox119
		bodyModel[115].setRotationPoint(-80F, -17.5F, -35.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 39, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox120
		bodyModel[116].setRotationPoint(-41.5F, -16.5F, -36F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox121
		bodyModel[117].setRotationPoint(-44.5F, -16.5F, -36F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 27, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F); // Import ImportBox122
		bodyModel[118].setRotationPoint(-71.5F, -16.5F, -36F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox123
		bodyModel[119].setRotationPoint(-9.5F, -18.5F, -36F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox124
		bodyModel[120].setRotationPoint(-36.5F, -18.5F, -36F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox125
		bodyModel[121].setRotationPoint(-46.5F, -18.5F, -36F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox126
		bodyModel[122].setRotationPoint(-68.5F, -18.5F, -36F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 28, 3, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox127
		bodyModel[123].setRotationPoint(-71F, -17.5F, 20.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 9, 6, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import ImportBox128
		bodyModel[124].setRotationPoint(-80F, -17.5F, 20.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 39, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox129
		bodyModel[125].setRotationPoint(-41.5F, -16.5F, 35F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox130
		bodyModel[126].setRotationPoint(-44.5F, -16.5F, 35F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 27, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F); // Import ImportBox131
		bodyModel[127].setRotationPoint(-71.5F, -16.5F, 35F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox132
		bodyModel[128].setRotationPoint(-9.5F, -18.5F, 35F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox133
		bodyModel[129].setRotationPoint(-36.5F, -18.5F, 35F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox134
		bodyModel[130].setRotationPoint(-46.5F, -18.5F, 35F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox135
		bodyModel[131].setRotationPoint(-68.5F, -18.5F, 35F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 104, 9, 19, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.5F, -3F, 0F, -1.5F, -3F); // Import ImportBox136
		bodyModel[132].setRotationPoint(-68F, -10F, 0.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 104, 9, 19, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import ImportBox137
		bodyModel[133].setRotationPoint(-68F, -10F, -19.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 104, 7, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox138
		bodyModel[134].setRotationPoint(-68F, -17F, -21F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 41, 2, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox139
		bodyModel[135].setRotationPoint(-54F, -26.5F, -29F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 67, 1, 7, 0F,0F, -1F, 0F, -9F, -1F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox140
		bodyModel[136].setRotationPoint(-72F, -25.5F, -26F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 67, 1, 38, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox141
		bodyModel[137].setRotationPoint(-72F, -25.5F, -19F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 67, 1, 7, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Import ImportBox142
		bodyModel[138].setRotationPoint(-72F, -25.5F, 19F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox143
		bodyModel[139].setRotationPoint(-54F, -26.5F, -27F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox144
		bodyModel[140].setRotationPoint(-54F, -26.5F, -17F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox145
		bodyModel[141].setRotationPoint(-54F, -26.5F, 19F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 41, 2, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox146
		bodyModel[142].setRotationPoint(-54F, -26.5F, 28F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 6, 7, 42, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox147
		bodyModel[143].setRotationPoint(-74F, -17F, -21F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 6, 9, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4.5F, 0F, -1.5F, -4.5F, 0F, 0F, 0F, 0F, -2F, 0F); // Import ImportBox148
		bodyModel[144].setRotationPoint(-74F, -10F, -21F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 6, 9, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1.5F, -4.5F, 0F, -2F, -4.5F); // Import ImportBox149
		bodyModel[145].setRotationPoint(-74F, -10F, 0F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 5, 6, 9, 0F,0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportBox150
		bodyModel[146].setRotationPoint(-79F, -23.5F, -30F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 5, 1, 9, 0F,1F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 1F, 0F, 0.5F); // Import ImportBox151
		bodyModel[147].setRotationPoint(-79F, -24.5F, -30F);
		bodyModel[147].rotateAngleZ = 0.19739499F;

		bodyModel[148].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox152
		bodyModel[148].setRotationPoint(-80F, -23.5F, -29F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox153
		bodyModel[149].setRotationPoint(-80F, -23.5F, -23F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox154
		bodyModel[150].setRotationPoint(-79F, -18.5F, -34F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox155
		bodyModel[151].setRotationPoint(-79F, -19.5F, -34F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 5, 6, 9, 0F,0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportBox156
		bodyModel[152].setRotationPoint(-79F, -23.5F, 21F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 5, 1, 9, 0F,1F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 1F, 0F, 0.5F); // Import ImportBox157
		bodyModel[153].setRotationPoint(-79F, -24.5F, 21F);
		bodyModel[153].rotateAngleZ = 0.19739499F;

		bodyModel[154].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox158
		bodyModel[154].setRotationPoint(-80F, -23.5F, 28F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox159
		bodyModel[155].setRotationPoint(-80F, -23.5F, 22F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox160
		bodyModel[156].setRotationPoint(-79F, -18.5F, 31F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox161
		bodyModel[157].setRotationPoint(-79F, -19.5F, 31F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 5, 11, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox162
		bodyModel[158].setRotationPoint(-79F, -24.5F, -15F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 3, 1, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox163
		bodyModel[159].setRotationPoint(-78F, -25.5F, -13F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox164
		bodyModel[160].setRotationPoint(-78F, -25.5F, -14F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox165
		bodyModel[161].setRotationPoint(-78F, -25.5F, 14F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 5, 9, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox166
		bodyModel[162].setRotationPoint(-81F, -22.5F, -13F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox167
		bodyModel[163].setRotationPoint(-81F, -24.5F, -5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox168
		bodyModel[164].setRotationPoint(-81F, -20.5F, -5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox171
		bodyModel[165].setRotationPoint(-81F, -20.5F, 0F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox172
		bodyModel[166].setRotationPoint(-81F, -24.5F, 0F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox173
		bodyModel[167].setRotationPoint(-80F, -24.5F, -4F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox174
		bodyModel[168].setRotationPoint(-80F, -22.5F, -4F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox175
		bodyModel[169].setRotationPoint(-80F, -22.5F, -1F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox176
		bodyModel[170].setRotationPoint(-80F, -21.5F, 3.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox177
		bodyModel[171].setRotationPoint(-80F, -19.5F, 5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox178
		bodyModel[172].setRotationPoint(-80F, -22.5F, 7F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox179
		bodyModel[173].setRotationPoint(-80F, -21.5F, 11.5F);

		bodyModel[174].addShapeBox(-3F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox180
		bodyModel[174].setRotationPoint(-78F, -23.5F, 16F);
		bodyModel[174].rotateAngleZ = 0.64577182F;

		bodyModel[175].addShapeBox(-1F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox181
		bodyModel[175].setRotationPoint(-78F, -18.5F, 16F);
		bodyModel[175].rotateAngleZ = 0.64577182F;

		bodyModel[176].addShapeBox(-3F, 0F, 1F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox182
		bodyModel[176].setRotationPoint(-78F, -18.5F, 16F);
		bodyModel[176].rotateAngleZ = 0.64577182F;

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox183
		bodyModel[177].setRotationPoint(-75F, -11.5F, -6F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox184
		bodyModel[178].setRotationPoint(-75F, -11.5F, 4F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox185
		bodyModel[179].setRotationPoint(-75F, -8.5F, -1F);

		bodyModel[180].addShapeBox(-1F, 0F, -2F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox578
		bodyModel[180].setRotationPoint(0F, 0F, 0F);

		bodyModel[181].addShapeBox(-1F, -4F, -2F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox579
		bodyModel[181].setRotationPoint(0F, 0F, 0F);

		bodyModel[182].addShapeBox(-1F, -3F, -2F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox580
		bodyModel[182].setRotationPoint(0F, 0F, 0F);

		bodyModel[183].addShapeBox(-1F, -3F, 1F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox581
		bodyModel[183].setRotationPoint(0F, 0F, 0F);

		bodyModel[184].addShapeBox(-1F, -4F, 1F, 2, 1, 1, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox582
		bodyModel[184].setRotationPoint(0F, 0F, 0F);

		bodyModel[185].addShapeBox(-1F, -4F, 2F, 3, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox583
		bodyModel[185].setRotationPoint(0F, 0F, 0F);

		bodyModel[186].addShapeBox(-1F, -3F, 2F, 3, 3, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox584
		bodyModel[186].setRotationPoint(0F, 0F, 0F);

		bodyModel[187].addShapeBox(-1F, -4F, 7F, 3, 4, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox585
		bodyModel[187].setRotationPoint(0F, 0F, 0F);

		bodyModel[188].addShapeBox(-1F, -3.5F, 8F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox586
		bodyModel[188].setRotationPoint(0F, 0F, 0F);

		bodyModel[189].addShapeBox(-1F, -5.5F, 8F, 3, 2, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox587
		bodyModel[189].setRotationPoint(0F, 0F, 0F);

		bodyModel[190].addShapeBox(-1F, -1.5F, 8F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, -1F, 1F); // Import ImportBox588
		bodyModel[190].setRotationPoint(0F, 0F, 0F);

		bodyModel[191].addShapeBox(-1F, -5.5F, 10F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox589
		bodyModel[191].setRotationPoint(0F, 0F, 0F);

		bodyModel[192].addShapeBox(-1F, -0.5F, 10F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox590
		bodyModel[192].setRotationPoint(0F, 0F, 0F);

		bodyModel[193].addShapeBox(-0.5F, -4.5F, 9.5F, 2, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox591
		bodyModel[193].setRotationPoint(0F, 0F, 0F);

		bodyModel[194].addShapeBox(-0.5F, -3.5F, 9.5F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox592
		bodyModel[194].setRotationPoint(0F, 0F, 0F);

		bodyModel[195].addShapeBox(-0.5F, -1.5F, 9.5F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportBox593
		bodyModel[195].setRotationPoint(0F, 0F, 0F);

		bodyModel[196].addShapeBox(-1F, -1F, -1F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox594
		bodyModel[196].setRotationPoint(0F, 0F, 0F);

		bodyModel[197].addShapeBox(-1F, 0F, -1F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Import ImportBox595
		bodyModel[197].setRotationPoint(0F, 0F, 0F);

		bodyModel[198].addShapeBox(-0.8F, -2F, -0.5F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox596
		bodyModel[198].setRotationPoint(0F, 0F, 0F);

		bodyModel[199].addShapeBox(7.2F, -1.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox597
		bodyModel[199].setRotationPoint(0F, 0F, 0F);

		bodyModel[200].addShapeBox(7.2F, -2.3F, -0.5F, 9, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Import ImportBox598
		bodyModel[200].setRotationPoint(0F, 0F, 0F);

		bodyModel[201].addShapeBox(7.2F, -1.5F, -0.5F, 5, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Import ImportBox599
		bodyModel[201].setRotationPoint(0F, 0F, 0F);

		bodyModel[202].addShapeBox(12.2F, -1.5F, -0.5F, 3, 1, 1, 0F,0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Import ImportBox600
		bodyModel[202].setRotationPoint(0F, 0F, 0F);

		bodyModel[203].addShapeBox(16.2F, -2.3F, -0.5F, 3, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.3F, -0.3F); // Import ImportBox601
		bodyModel[203].setRotationPoint(0F, 0F, 0F);

		bodyModel[204].addShapeBox(5.2F, -2.5F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox602
		bodyModel[204].setRotationPoint(0F, 0F, 0F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 500, 400, textureX, textureY); // Import ImportBox0
		turretModel[1] = new ModelRendererTurbo(this, 500, 462, textureX, textureY); // Import ImportBox4
		turretModel[2] = new ModelRendererTurbo(this, 500, 523, textureX, textureY); // Import ImportBox5
		turretModel[3] = new ModelRendererTurbo(this, 500, 462, textureX, textureY); // Import ImportBox6
		turretModel[4] = new ModelRendererTurbo(this, 500, 573, textureX, textureY); // Import ImportBox7
		turretModel[5] = new ModelRendererTurbo(this, 500, 623, textureX, textureY); // Import ImportBox8
		turretModel[6] = new ModelRendererTurbo(this, 500, 663, textureX, textureY); // Import ImportBox9
		turretModel[7] = new ModelRendererTurbo(this, 500, 698, textureX, textureY); // Import ImportBox10
		turretModel[8] = new ModelRendererTurbo(this, 500, 740, textureX, textureY); // Import ImportBox11
		turretModel[9] = new ModelRendererTurbo(this, 500, 777, textureX, textureY); // Import ImportBox12
		turretModel[10] = new ModelRendererTurbo(this, 500, 794, textureX, textureY); // Import ImportBox15
		turretModel[11] = new ModelRendererTurbo(this, 500, 809, textureX, textureY); // Import ImportBox16
		turretModel[12] = new ModelRendererTurbo(this, 500, 777, textureX, textureY); // Import ImportBox17
		turretModel[13] = new ModelRendererTurbo(this, 500, 794, textureX, textureY); // Import ImportBox18
		turretModel[14] = new ModelRendererTurbo(this, 500, 809, textureX, textureY); // Import ImportBox19
		turretModel[15] = new ModelRendererTurbo(this, 500, 824, textureX, textureY); // Import ImportBox21
		turretModel[16] = new ModelRendererTurbo(this, 500, 845, textureX, textureY); // Import ImportBox22
		turretModel[17] = new ModelRendererTurbo(this, 500, 824, textureX, textureY); // Import ImportBox23
		turretModel[18] = new ModelRendererTurbo(this, 500, 845, textureX, textureY); // Import ImportBox24
		turretModel[19] = new ModelRendererTurbo(this, 500, 860, textureX, textureY); // Import ImportBox25
		turretModel[20] = new ModelRendererTurbo(this, 500, 865, textureX, textureY); // Import ImportBox26
		turretModel[21] = new ModelRendererTurbo(this, 500, 865, textureX, textureY); // Import ImportBox29
		turretModel[22] = new ModelRendererTurbo(this, 500, 865, textureX, textureY); // Import ImportBox30
		turretModel[23] = new ModelRendererTurbo(this, 500, 865, textureX, textureY); // Import ImportBox31
		turretModel[24] = new ModelRendererTurbo(this, 500, 865, textureX, textureY); // Import ImportBox32
		turretModel[25] = new ModelRendererTurbo(this, 500, 865, textureX, textureY); // Import ImportBox33
		turretModel[26] = new ModelRendererTurbo(this, 500, 865, textureX, textureY); // Import ImportBox34
		turretModel[27] = new ModelRendererTurbo(this, 500, 860, textureX, textureY); // Import ImportBox35
		turretModel[28] = new ModelRendererTurbo(this, 500, 865, textureX, textureY); // Import ImportBox36
		turretModel[29] = new ModelRendererTurbo(this, 500, 865, textureX, textureY); // Import ImportBox37
		turretModel[30] = new ModelRendererTurbo(this, 500, 865, textureX, textureY); // Import ImportBox38
		turretModel[31] = new ModelRendererTurbo(this, 500, 865, textureX, textureY); // Import ImportBox39
		turretModel[32] = new ModelRendererTurbo(this, 500, 865, textureX, textureY); // Import ImportBox40
		turretModel[33] = new ModelRendererTurbo(this, 500, 865, textureX, textureY); // Import ImportBox41
		turretModel[34] = new ModelRendererTurbo(this, 500, 865, textureX, textureY); // Import ImportBox42
		turretModel[35] = new ModelRendererTurbo(this, 500, 870, textureX, textureY); // Import ImportBox43
		turretModel[36] = new ModelRendererTurbo(this, 500, 870, textureX, textureY); // Import ImportBox44
		turretModel[37] = new ModelRendererTurbo(this, 500, 870, textureX, textureY); // Import ImportBox45
		turretModel[38] = new ModelRendererTurbo(this, 500, 870, textureX, textureY); // Import ImportBox46
		turretModel[39] = new ModelRendererTurbo(this, 500, 904, textureX, textureY); // Import ImportBox48
		turretModel[40] = new ModelRendererTurbo(this, 500, 916, textureX, textureY); // Import ImportBox49
		turretModel[41] = new ModelRendererTurbo(this, 500, 929, textureX, textureY); // Import ImportBox50
		turretModel[42] = new ModelRendererTurbo(this, 500, 964, textureX, textureY); // Import ImportBox51
		turretModel[43] = new ModelRendererTurbo(this, 500, 999, textureX, textureY); // Import ImportBox52
		turretModel[44] = new ModelRendererTurbo(this, 500, 1034, textureX, textureY); // Import ImportBox53
		turretModel[45] = new ModelRendererTurbo(this, 500, 1042, textureX, textureY); // Import ImportBox54
		turretModel[46] = new ModelRendererTurbo(this, 500, 1050, textureX, textureY); // Import ImportBox55
		turretModel[47] = new ModelRendererTurbo(this, 500, 1064, textureX, textureY); // Import ImportBox56
		turretModel[48] = new ModelRendererTurbo(this, 500, 1034, textureX, textureY); // Import ImportBox57
		turretModel[49] = new ModelRendererTurbo(this, 500, 1042, textureX, textureY); // Import ImportBox58
		turretModel[50] = new ModelRendererTurbo(this, 500, 1050, textureX, textureY); // Import ImportBox59
		turretModel[51] = new ModelRendererTurbo(this, 500, 1064, textureX, textureY); // Import ImportBox60
		turretModel[52] = new ModelRendererTurbo(this, 500, 1040, textureX, textureY); // Import ImportBox61
		turretModel[53] = new ModelRendererTurbo(this, 500, 1040, textureX, textureY); // Import ImportBox62
		turretModel[54] = new ModelRendererTurbo(this, 500, 1072, textureX, textureY); // Import ImportBox63
		turretModel[55] = new ModelRendererTurbo(this, 500, 1072, textureX, textureY); // Import ImportBox64
		turretModel[56] = new ModelRendererTurbo(this, 500, 1079, textureX, textureY); // Import ImportBox65
		turretModel[57] = new ModelRendererTurbo(this, 500, 1117, textureX, textureY); // Import ImportBox66
		turretModel[58] = new ModelRendererTurbo(this, 500, 1151, textureX, textureY); // Import ImportBox67
		turretModel[59] = new ModelRendererTurbo(this, 500, 1197, textureX, textureY); // Import ImportBox68
		turretModel[60] = new ModelRendererTurbo(this, 500, 1228, textureX, textureY); // Import ImportBox69
		turretModel[61] = new ModelRendererTurbo(this, 500, 1261, textureX, textureY); // Import ImportBox70
		turretModel[62] = new ModelRendererTurbo(this, 500, 1268, textureX, textureY); // Import ImportBox71
		turretModel[63] = new ModelRendererTurbo(this, 500, 1276, textureX, textureY); // Import ImportBox72
		turretModel[64] = new ModelRendererTurbo(this, 500, 1284, textureX, textureY); // Import ImportBox73
		turretModel[65] = new ModelRendererTurbo(this, 500, 1293, textureX, textureY); // Import ImportBox74
		turretModel[66] = new ModelRendererTurbo(this, 500, 1303, textureX, textureY); // Import ImportBox75
		turretModel[67] = new ModelRendererTurbo(this, 500, 1311, textureX, textureY); // Import ImportBox76
		turretModel[68] = new ModelRendererTurbo(this, 500, 1261, textureX, textureY); // Import ImportBox77
		turretModel[69] = new ModelRendererTurbo(this, 500, 1268, textureX, textureY); // Import ImportBox78
		turretModel[70] = new ModelRendererTurbo(this, 500, 1276, textureX, textureY); // Import ImportBox79
		turretModel[71] = new ModelRendererTurbo(this, 500, 1284, textureX, textureY); // Import ImportBox80
		turretModel[72] = new ModelRendererTurbo(this, 500, 1293, textureX, textureY); // Import ImportBox81
		turretModel[73] = new ModelRendererTurbo(this, 500, 1303, textureX, textureY); // Import ImportBox82
		turretModel[74] = new ModelRendererTurbo(this, 500, 1311, textureX, textureY); // Import ImportBox83
		turretModel[75] = new ModelRendererTurbo(this, 500, 1320, textureX, textureY); // Import ImportBox84
		turretModel[76] = new ModelRendererTurbo(this, 500, 1329, textureX, textureY); // Import ImportBox85
		turretModel[77] = new ModelRendererTurbo(this, 500, 1329, textureX, textureY); // Import ImportBox86
		turretModel[78] = new ModelRendererTurbo(this, 500, 1332, textureX, textureY); // Import ImportBox87
		turretModel[79] = new ModelRendererTurbo(this, 500, 1344, textureX, textureY); // Import ImportBox88
		turretModel[80] = new ModelRendererTurbo(this, 500, 1344, textureX, textureY); // Import ImportBox89
		turretModel[81] = new ModelRendererTurbo(this, 500, 1320, textureX, textureY); // Import ImportBox90
		turretModel[82] = new ModelRendererTurbo(this, 500, 1329, textureX, textureY); // Import ImportBox91
		turretModel[83] = new ModelRendererTurbo(this, 500, 1329, textureX, textureY); // Import ImportBox92
		turretModel[84] = new ModelRendererTurbo(this, 500, 1332, textureX, textureY); // Import ImportBox93
		turretModel[85] = new ModelRendererTurbo(this, 500, 1344, textureX, textureY); // Import ImportBox94
		turretModel[86] = new ModelRendererTurbo(this, 500, 1344, textureX, textureY); // Import ImportBox95
		turretModel[87] = new ModelRendererTurbo(this, 500, 1327, textureX, textureY); // Import ImportBox96
		turretModel[88] = new ModelRendererTurbo(this, 500, 1372, textureX, textureY); // Import ImportBox97
		turretModel[89] = new ModelRendererTurbo(this, 500, 1372, textureX, textureY); // Import ImportBox98
		turretModel[90] = new ModelRendererTurbo(this, 500, 1380, textureX, textureY); // Import ImportBox99
		turretModel[91] = new ModelRendererTurbo(this, 500, 1380, textureX, textureY); // Import ImportBox100
		turretModel[92] = new ModelRendererTurbo(this, 500, 1384, textureX, textureY); // Import ImportBox101
		turretModel[93] = new ModelRendererTurbo(this, 500, 1395, textureX, textureY); // Import ImportBox102
		turretModel[94] = new ModelRendererTurbo(this, 500, 1406, textureX, textureY); // Import ImportBox103
		turretModel[95] = new ModelRendererTurbo(this, 500, 1406, textureX, textureY); // Import ImportBox104
		turretModel[96] = new ModelRendererTurbo(this, 500, 1380, textureX, textureY); // Import ImportBox105
		turretModel[97] = new ModelRendererTurbo(this, 500, 1380, textureX, textureY); // Import ImportBox106
		turretModel[98] = new ModelRendererTurbo(this, 500, 1384, textureX, textureY); // Import ImportBox107
		turretModel[99] = new ModelRendererTurbo(this, 500, 1395, textureX, textureY); // Import ImportBox108
		turretModel[100] = new ModelRendererTurbo(this, 500, 1406, textureX, textureY); // Import ImportBox109
		turretModel[101] = new ModelRendererTurbo(this, 500, 1406, textureX, textureY); // Import ImportBox110
		turretModel[102] = new ModelRendererTurbo(this, 500, 1409, textureX, textureY); // Import ImportBox111
		turretModel[103] = new ModelRendererTurbo(this, 500, 1419, textureX, textureY); // Import ImportBox112
		turretModel[104] = new ModelRendererTurbo(this, 500, 1419, textureX, textureY); // Import ImportBox113
		turretModel[105] = new ModelRendererTurbo(this, 500, 1409, textureX, textureY); // Import ImportBox114
		turretModel[106] = new ModelRendererTurbo(this, 500, 1424, textureX, textureY); // Import ImportBox115
		turretModel[107] = new ModelRendererTurbo(this, 500, 1439, textureX, textureY); // Import ImportBox116
		turretModel[108] = new ModelRendererTurbo(this, 500, 1448, textureX, textureY); // Import ImportBox117
		turretModel[109] = new ModelRendererTurbo(this, 500, 1457, textureX, textureY); // Import ImportBox118
		turretModel[110] = new ModelRendererTurbo(this, 500, 1467, textureX, textureY); // Import ImportBox119
		turretModel[111] = new ModelRendererTurbo(this, 500, 1482, textureX, textureY); // Import ImportBox120
		turretModel[112] = new ModelRendererTurbo(this, 500, 1482, textureX, textureY); // Import ImportBox121
		turretModel[113] = new ModelRendererTurbo(this, 500, 1489, textureX, textureY); // Import ImportBox122
		turretModel[114] = new ModelRendererTurbo(this, 500, 1495, textureX, textureY); // Import ImportBox123
		turretModel[115] = new ModelRendererTurbo(this, 500, 1489, textureX, textureY); // Import ImportBox124
		turretModel[116] = new ModelRendererTurbo(this, 500, 1495, textureX, textureY); // Import ImportBox125
		turretModel[117] = new ModelRendererTurbo(this, 500, 1498, textureX, textureY); // Import ImportBox126
		turretModel[118] = new ModelRendererTurbo(this, 500, 1498, textureX, textureY); // Import ImportBox127
		turretModel[119] = new ModelRendererTurbo(this, 500, 1505, textureX, textureY); // Import ImportBox128
		turretModel[120] = new ModelRendererTurbo(this, 500, 1509, textureX, textureY); // Import ImportBox129
		turretModel[121] = new ModelRendererTurbo(this, 500, 1524, textureX, textureY); // Import ImportBox130
		turretModel[122] = new ModelRendererTurbo(this, 500, 1539, textureX, textureY); // Import ImportBox131
		turretModel[123] = new ModelRendererTurbo(this, 500, 1550, textureX, textureY); // Import ImportBox132
		turretModel[124] = new ModelRendererTurbo(this, 500, 1561, textureX, textureY); // Import ImportBox133
		turretModel[125] = new ModelRendererTurbo(this, 500, 1571, textureX, textureY); // Import ImportBox134
		turretModel[126] = new ModelRendererTurbo(this, 500, 1561, textureX, textureY); // Import ImportBox135
		turretModel[127] = new ModelRendererTurbo(this, 500, 1571, textureX, textureY); // Import ImportBox136
		turretModel[128] = new ModelRendererTurbo(this, 500, 1578, textureX, textureY); // Import ImportBox137
		turretModel[129] = new ModelRendererTurbo(this, 500, 1587, textureX, textureY); // Import ImportBox138
		turretModel[130] = new ModelRendererTurbo(this, 500, 1587, textureX, textureY); // Import ImportBox139
		turretModel[131] = new ModelRendererTurbo(this, 500, 1578, textureX, textureY); // Import ImportBox140

		turretModel[0].addShapeBox(0F, 0F, 0F, 19, 2, 58, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		turretModel[0].setRotationPoint(-8.5F, -26F, -29F);

		turretModel[1].addShapeBox(0F, 0F, 0F, 13, 2, 58, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Import ImportBox4
		turretModel[1].setRotationPoint(-21.5F, -26F, -29F);

		turretModel[2].addShapeBox(0F, 0F, 0F, 6, 2, 46, 0F,0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F); // Import ImportBox5
		turretModel[2].setRotationPoint(-27.5F, -26F, -23F);

		turretModel[3].addShapeBox(0F, 0F, 0F, 13, 2, 58, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Import ImportBox6
		turretModel[3].setRotationPoint(10.5F, -26F, -29F);

		turretModel[4].addShapeBox(0F, 0F, 0F, 4, 2, 46, 0F,0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F); // Import ImportBox7
		turretModel[4].setRotationPoint(23.5F, -26F, -23F);

		turretModel[5].addShapeBox(0F, 0F, 0F, 43, 11, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox8
		turretModel[5].setRotationPoint(-21.5F, -37F, -14F);

		turretModel[6].addShapeBox(0F, 0F, 0F, 43, 5, 28, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox9
		turretModel[6].setRotationPoint(-21.5F, -42F, -14F);

		turretModel[7].addShapeBox(0F, 0F, 0F, 3, 11, 30, 0F,3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox10
		turretModel[7].setRotationPoint(20.5F, -37F, -15F);

		turretModel[8].addShapeBox(0F, 0F, 0F, 3, 6, 30, 0F,0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox11
		turretModel[8].setRotationPoint(17.5F, -43F, -15F);

		turretModel[9].addShapeBox(0F, 0F, 0F, 20, 6, 9, 0F,0F, 0F, 0F, -3F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox12
		turretModel[9].setRotationPoint(25.5F, -32F, -14F);

		turretModel[10].addShapeBox(0F, 0F, 0F, 11, 5, 9, 0F,0F, 0F, -3F, -10F, 0F, -3F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox15
		turretModel[10].setRotationPoint(24.5F, -42F, -14F);

		turretModel[11].addShapeBox(0F, 0F, 0F, 18, 5, 9, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox16
		turretModel[11].setRotationPoint(25.5F, -37F, -14F);

		turretModel[12].addShapeBox(0F, 0F, 0F, 20, 6, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox17
		turretModel[12].setRotationPoint(25.5F, -32F, 5F);

		turretModel[13].addShapeBox(0F, 0F, 0F, 11, 5, 9, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		turretModel[13].setRotationPoint(24.5F, -42F, 5F);

		turretModel[14].addShapeBox(0F, 0F, 0F, 18, 5, 9, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, -1.5F, 0F, 0F, 0F, 0F); // Import ImportBox19
		turretModel[14].setRotationPoint(25.5F, -37F, 5F);

		turretModel[15].addShapeBox(0F, 0F, 0F, 4, 11, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox21
		turretModel[15].setRotationPoint(21.5F, -37F, -14F);

		turretModel[16].addShapeBox(0F, 0F, 0F, 3, 5, 9, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox22
		turretModel[16].setRotationPoint(21.5F, -42F, -14F);

		turretModel[17].addShapeBox(0F, 0F, 0F, 4, 11, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox23
		turretModel[17].setRotationPoint(21.5F, -37F, 5F);

		turretModel[18].addShapeBox(0F, 0F, 0F, 3, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox24
		turretModel[18].setRotationPoint(21.5F, -42F, 5F);

		turretModel[19].addShapeBox(0F, 0F, 0F, 13, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox25
		turretModel[19].setRotationPoint(8.5F, -27F, -17F);

		turretModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox26
		turretModel[20].setRotationPoint(8.5F, -28F, -17F);

		turretModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox29
		turretModel[21].setRotationPoint(10.5F, -28F, -17F);

		turretModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox30
		turretModel[22].setRotationPoint(12.5F, -28F, -17F);

		turretModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox31
		turretModel[23].setRotationPoint(14.5F, -28F, -17F);

		turretModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox32
		turretModel[24].setRotationPoint(16.5F, -28F, -17F);

		turretModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox33
		turretModel[25].setRotationPoint(18.5F, -28F, -17F);

		turretModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox34
		turretModel[26].setRotationPoint(20.5F, -28F, -17F);

		turretModel[27].addShapeBox(0F, 0F, 0F, 13, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox35
		turretModel[27].setRotationPoint(8.5F, -27F, 14F);

		turretModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox36
		turretModel[28].setRotationPoint(8.5F, -28F, 14F);

		turretModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox37
		turretModel[29].setRotationPoint(10.5F, -28F, 14F);

		turretModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox38
		turretModel[30].setRotationPoint(12.5F, -28F, 14F);

		turretModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox39
		turretModel[31].setRotationPoint(14.5F, -28F, 14F);

		turretModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox40
		turretModel[32].setRotationPoint(16.5F, -28F, 14F);

		turretModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox41
		turretModel[33].setRotationPoint(18.5F, -28F, 14F);

		turretModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox42
		turretModel[34].setRotationPoint(20.5F, -28F, 14F);

		turretModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox43
		turretModel[35].setRotationPoint(20.5F, -29F, -15.5F);

		turretModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox44
		turretModel[36].setRotationPoint(18.5F, -36F, -15.5F);

		turretModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 29, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox45
		turretModel[37].setRotationPoint(18.5F, -39F, -14.5F);

		turretModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox46
		turretModel[38].setRotationPoint(18.5F, -41F, -13.5F);

		turretModel[39].addShapeBox(0F, 0F, 0F, 3, 5, 6, 0F,2F, -2F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import ImportBox48
		turretModel[39].setRotationPoint(14.5F, -48F, -3F);

		turretModel[40].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F,2F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -2F, -1F, -1F, -2F, 0F, 0F, 0F); // Import ImportBox49
		turretModel[40].setRotationPoint(17.5F, -48F, -3F);

		turretModel[41].addShapeBox(0F, 0F, 0F, 6, 2, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox50
		turretModel[41].setRotationPoint(3.5F, -37F, -16F);

		turretModel[42].addShapeBox(0F, 0F, 0F, 6, 2, 32, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox51
		turretModel[42].setRotationPoint(3.5F, -39F, -16F);

		turretModel[43].addShapeBox(0F, 0F, 0F, 6, 2, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox52
		turretModel[43].setRotationPoint(3.5F, -35F, -16F);

		turretModel[44].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox53
		turretModel[44].setRotationPoint(8.5F, -29F, -23F);

		turretModel[45].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox54
		turretModel[45].setRotationPoint(8.5F, -28F, -23F);

		turretModel[46].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox55
		turretModel[46].setRotationPoint(3.5F, -28F, -28F);

		turretModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox56
		turretModel[47].setRotationPoint(6.5F, -28F, -28F);

		turretModel[48].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox57
		turretModel[48].setRotationPoint(8.5F, -29F, 18F);

		turretModel[49].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox58
		turretModel[49].setRotationPoint(8.5F, -28F, 18F);

		turretModel[50].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox59
		turretModel[50].setRotationPoint(3.5F, -28F, 17F);

		turretModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox60
		turretModel[51].setRotationPoint(6.5F, -28F, 24F);

		turretModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox61
		turretModel[52].setRotationPoint(0.5F, -35F, -15F);

		turretModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox62
		turretModel[53].setRotationPoint(0.5F, -31F, -15F);

		turretModel[54].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox63
		turretModel[54].setRotationPoint(0.5F, -35F, -16F);

		turretModel[55].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import ImportBox64
		turretModel[55].setRotationPoint(0.5F, -35F, 15F);

		turretModel[56].addShapeBox(0F, 0F, 0F, 8, 9, 28, 0F,0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F); // Import ImportBox65
		turretModel[56].setRotationPoint(-29.5F, -35F, -14F);

		turretModel[57].addShapeBox(0F, 0F, 0F, 8, 5, 28, 0F,0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, -2F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 4F); // Import ImportBox66
		turretModel[57].setRotationPoint(-29.5F, -42F, -14F);

		turretModel[58].addShapeBox(0F, 0F, 0F, 16, 16, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox67
		turretModel[58].setRotationPoint(-45.5F, -42F, -14F);

		turretModel[59].addShapeBox(0F, 0F, 0F, 4, 2, 28, 0F,0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, -3.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.8F, 0F, 0F); // Import ImportBox68
		turretModel[59].setRotationPoint(-25.5F, -37F, -14F);

		turretModel[60].addShapeBox(0F, 0F, 0F, 8, 4, 28, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox69
		turretModel[60].setRotationPoint(-29.5F, -39F, -14F);

		turretModel[61].addShapeBox(0F, 0F, 0F, 8, 2, 4, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox70
		turretModel[61].setRotationPoint(-37.5F, -28F, -18F);

		turretModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox71
		turretModel[62].setRotationPoint(-38.5F, -28F, -19F);

		turretModel[63].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox72
		turretModel[63].setRotationPoint(-44.5F, -28F, -18F);

		turretModel[64].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F,0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Import ImportBox73
		turretModel[64].setRotationPoint(-34.5F, -42F, -18F);

		turretModel[65].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 4F, 0F, 0F, 4F, 0F); // Import ImportBox74
		turretModel[65].setRotationPoint(-40.5F, -42F, -18F);

		turretModel[66].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F,0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 4F, 0F, 0F, 4F, 0F); // Import ImportBox75
		turretModel[66].setRotationPoint(-45.5F, -42F, -18F);

		turretModel[67].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Import ImportBox76
		turretModel[67].setRotationPoint(-29.5F, -39F, -18F);

		turretModel[68].addShapeBox(0F, 0F, 0F, 8, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox77
		turretModel[68].setRotationPoint(-37.5F, -28F, 14F);

		turretModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox78
		turretModel[69].setRotationPoint(-38.5F, -28F, 14F);

		turretModel[70].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F); // Import ImportBox79
		turretModel[70].setRotationPoint(-44.5F, -28F, 14F);

		turretModel[71].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox80
		turretModel[71].setRotationPoint(-34.5F, -42F, 14F);

		turretModel[72].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Import ImportBox81
		turretModel[72].setRotationPoint(-40.5F, -42F, 14F);

		turretModel[73].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox82
		turretModel[73].setRotationPoint(-45.5F, -42F, 14F);

		turretModel[74].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, -2F, -4F, 0F, 0F, -4F); // Import ImportBox83
		turretModel[74].setRotationPoint(-29.5F, -39F, 14F);

		turretModel[75].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox84
		turretModel[75].setRotationPoint(-38.5F, -35F, -19F);

		turretModel[76].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox85
		turretModel[76].setRotationPoint(-37.5F, -35F, -19F);

		turretModel[77].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox86
		turretModel[77].setRotationPoint(-37.5F, -31F, -19F);

		turretModel[78].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox87
		turretModel[78].setRotationPoint(-45.5F, -35F, -15F);

		turretModel[79].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F); // Import ImportBox88
		turretModel[79].setRotationPoint(-44.5F, -35F, -15F);

		turretModel[80].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F); // Import ImportBox89
		turretModel[80].setRotationPoint(-44.5F, -31F, -15F);

		turretModel[81].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox90
		turretModel[81].setRotationPoint(-38.5F, -35F, 18F);

		turretModel[82].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import ImportBox91
		turretModel[82].setRotationPoint(-37.5F, -35F, 18F);

		turretModel[83].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import ImportBox92
		turretModel[83].setRotationPoint(-37.5F, -31F, 18F);

		turretModel[84].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox93
		turretModel[84].setRotationPoint(-45.5F, -35F, 14F);

		turretModel[85].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F); // Import ImportBox94
		turretModel[85].setRotationPoint(-44.5F, -35F, 14F);

		turretModel[86].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F); // Import ImportBox95
		turretModel[86].setRotationPoint(-44.5F, -31F, 14F);

		turretModel[87].addShapeBox(0F, 0F, 0F, 16, 16, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import ImportBox96
		turretModel[87].setRotationPoint(-61.5F, -42F, -14F);

		turretModel[88].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F,0F, -1F, -8F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 5F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 3F, 5F); // Import ImportBox97
		turretModel[88].setRotationPoint(-50.5F, -42F, -18F);

		turretModel[89].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F,0F, -1F, 5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -8F, 0F, 3F, 5F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, -1F, -5F); // Import ImportBox98
		turretModel[89].setRotationPoint(-50.5F, -42F, 14F);

		turretModel[90].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox99
		turretModel[90].setRotationPoint(-52.5F, -41F, -15F);

		turretModel[91].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox100
		turretModel[91].setRotationPoint(-52.5F, -30F, -15F);

		turretModel[92].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox101
		turretModel[92].setRotationPoint(-48.5F, -39F, -15F);

		turretModel[93].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox102
		turretModel[93].setRotationPoint(-51.5F, -39F, -15F);

		turretModel[94].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox103
		turretModel[94].setRotationPoint(-58.5F, -40.5F, -15F);

		turretModel[95].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox104
		turretModel[95].setRotationPoint(-58.5F, -29.5F, -15F);

		turretModel[96].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox105
		turretModel[96].setRotationPoint(-52.5F, -41F, 14F);

		turretModel[97].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox106
		turretModel[97].setRotationPoint(-52.5F, -30F, 14F);

		turretModel[98].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox107
		turretModel[98].setRotationPoint(-48.5F, -39F, 14F);

		turretModel[99].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox108
		turretModel[99].setRotationPoint(-51.5F, -39F, 14F);

		turretModel[100].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox109
		turretModel[100].setRotationPoint(-58.5F, -40.5F, 14F);

		turretModel[101].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox110
		turretModel[101].setRotationPoint(-58.5F, -29.5F, 14F);

		turretModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox111
		turretModel[102].setRotationPoint(-62.5F, -39F, -4F);

		turretModel[103].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox112
		turretModel[103].setRotationPoint(-62.5F, -38F, -4F);

		turretModel[104].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox113
		turretModel[104].setRotationPoint(-62.5F, -38F, 3F);

		turretModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox114
		turretModel[105].setRotationPoint(-62.5F, -30F, -4F);

		turretModel[106].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox115
		turretModel[106].setRotationPoint(-62F, -38F, -3F);

		turretModel[107].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import ImportBox116
		turretModel[107].setRotationPoint(-62.5F, -32.5F, -3F);

		turretModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox117
		turretModel[108].setRotationPoint(-62.5F, -34.5F, -3F);

		turretModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox118
		turretModel[109].setRotationPoint(-62.5F, -36.5F, -3F);

		turretModel[110].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox119
		turretModel[110].setRotationPoint(-62.5F, -38F, -3F);
		turretModel[110].rotateAngleZ = -1.91986218F;

		turretModel[111].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox120
		turretModel[111].setRotationPoint(-62.5F, -41F, -12F);

		turretModel[112].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox121
		turretModel[112].setRotationPoint(-62.5F, -41F, 11F);

		turretModel[113].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox122
		turretModel[113].setRotationPoint(-6.5F, -28F, -27F);

		turretModel[114].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox123
		turretModel[114].setRotationPoint(-6.5F, -28F, -28F);

		turretModel[115].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox124
		turretModel[115].setRotationPoint(-6.5F, -28F, 25F);

		turretModel[116].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox125
		turretModel[116].setRotationPoint(-6.5F, -28F, 27F);

		turretModel[117].addShapeBox(0F, -5F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox126
		turretModel[117].setRotationPoint(-17.5F, -26F, -15F);
		turretModel[117].rotateAngleZ = -0.52359878F;

		turretModel[118].addShapeBox(0F, -5F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox127
		turretModel[118].setRotationPoint(-17.5F, -26F, -18F);
		turretModel[118].rotateAngleZ = -0.52359878F;

		turretModel[119].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox128
		turretModel[119].setRotationPoint(-18.5F, -27F, -17F);

		turretModel[120].addShapeBox(1F, -14F, 0F, 1, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox129
		turretModel[120].setRotationPoint(-17.5F, -26F, -18F);
		turretModel[120].rotateAngleZ = -0.52359878F;

		turretModel[121].addShapeBox(1F, -14F, 0F, 1, 10, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox130
		turretModel[121].setRotationPoint(-17.5F, -26F, -21F);
		turretModel[121].rotateAngleZ = -0.52359878F;

		turretModel[122].addTrapezoid(0F, 0F, 0F, 4, 5, 4, 0F, -1.00F, ModelRendererTurbo.MR_TOP); // Import ImportBox131
		turretModel[122].setRotationPoint(-9.5F, -47F, -1F);

		turretModel[123].addTrapezoid(0F, 0F, 0F, 2, 8, 2, 0F, 0F, ModelRendererTurbo.MR_TOP); // Import ImportBox132
		turretModel[123].setRotationPoint(-8.5F, -55F, 0F);

		turretModel[124].addTrapezoid(0F, 0F, 0F, 4, 5, 4, 0F, -1.00F, ModelRendererTurbo.MR_TOP); // Import ImportBox133
		turretModel[124].setRotationPoint(-33.5F, -47F, -12F);

		turretModel[125].addTrapezoid(0F, 0F, 0F, 2, 3, 2, 0F, 0F, ModelRendererTurbo.MR_TOP); // Import ImportBox134
		turretModel[125].setRotationPoint(-32.5F, -50F, -11F);

		turretModel[126].addTrapezoid(0F, 0F, 0F, 4, 5, 4, 0F, -1.00F, ModelRendererTurbo.MR_TOP); // Import ImportBox135
		turretModel[126].setRotationPoint(-33.5F, -47F, 8F);

		turretModel[127].addTrapezoid(0F, 0F, 0F, 2, 3, 2, 0F, 0F, ModelRendererTurbo.MR_TOP); // Import ImportBox136
		turretModel[127].setRotationPoint(-32.5F, -50F, 9F);

		turretModel[128].addTrapezoid(0F, 0F, 0F, 4, 1, 6, 0F, 0F, ModelRendererTurbo.MR_TOP); // Import ImportBox137
		turretModel[128].setRotationPoint(-27.5F, -43F, -3F);

		turretModel[129].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox138
		turretModel[129].setRotationPoint(-27.5F, -45F, -3F);

		turretModel[130].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox139
		turretModel[130].setRotationPoint(-47.5F, -45F, -3F);

		turretModel[131].addTrapezoid(0F, 0F, 0F, 4, 1, 6, 0F, 0F, ModelRendererTurbo.MR_TOP); // Import ImportBox140
		turretModel[131].setRotationPoint(-47.5F, -43F, -3F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 500, 1596, textureX, textureY); // Import ImportBox141
		barrelModel[1] = new ModelRendererTurbo(this, 500, 1617, textureX, textureY); // Import ImportBox142
		barrelModel[2] = new ModelRendererTurbo(this, 500, 1634, textureX, textureY); // Import ImportBox143
		barrelModel[3] = new ModelRendererTurbo(this, 500, 1647, textureX, textureY); // Import ImportBox144
		barrelModel[4] = new ModelRendererTurbo(this, 500, 1647, textureX, textureY); // Import ImportBox145
		barrelModel[5] = new ModelRendererTurbo(this, 500, 1658, textureX, textureY); // Import ImportBox146
		barrelModel[6] = new ModelRendererTurbo(this, 500, 1658, textureX, textureY); // Import ImportBox147
		barrelModel[7] = new ModelRendererTurbo(this, 500, 1658, textureX, textureY); // Import ImportBox148
		barrelModel[8] = new ModelRendererTurbo(this, 500, 1667, textureX, textureY); // Import ImportBox149
		barrelModel[9] = new ModelRendererTurbo(this, 500, 1678, textureX, textureY); // Import ImportBox150
		barrelModel[10] = new ModelRendererTurbo(this, 500, 1667, textureX, textureY); // Import ImportBox151
		barrelModel[11] = new ModelRendererTurbo(this, 500, 1691, textureX, textureY); // Import ImportBox152
		barrelModel[12] = new ModelRendererTurbo(this, 500, 1703, textureX, textureY); // Import ImportBox153
		barrelModel[13] = new ModelRendererTurbo(this, 500, 1691, textureX, textureY); // Import ImportBox154
		barrelModel[14] = new ModelRendererTurbo(this, 500, 1691, textureX, textureY); // Import ImportBox155
		barrelModel[15] = new ModelRendererTurbo(this, 500, 1703, textureX, textureY); // Import ImportBox156
		barrelModel[16] = new ModelRendererTurbo(this, 500, 1691, textureX, textureY); // Import ImportBox157
		barrelModel[17] = new ModelRendererTurbo(this, 500, 1717, textureX, textureY); // Import ImportBox158
		barrelModel[18] = new ModelRendererTurbo(this, 500, 1726, textureX, textureY); // Import ImportBox159
		barrelModel[19] = new ModelRendererTurbo(this, 500, 1717, textureX, textureY); // Import ImportBox160
		barrelModel[20] = new ModelRendererTurbo(this, 500, 1736, textureX, textureY); // Import ImportBox161
		barrelModel[21] = new ModelRendererTurbo(this, 500, 1740, textureX, textureY); // Import ImportBox162
		barrelModel[22] = new ModelRendererTurbo(this, 500, 1745, textureX, textureY); // Import ImportBox163
		barrelModel[23] = new ModelRendererTurbo(this, 500, 1751, textureX, textureY); // Import ImportBox164

		barrelModel[0].addShapeBox(-3F, -9F, -5F, 24, 10, 10, 0F,0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox141
		barrelModel[0].setRotationPoint(24.5F, -33F, 0F);

		barrelModel[1].addShapeBox(-3F, 1F, -5F, 24, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox142
		barrelModel[1].setRotationPoint(24.5F, -33F, 0F);

		barrelModel[2].addShapeBox(7F, -3F, -4F, 14, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox143
		barrelModel[2].setRotationPoint(24.5F, -33F, 0F);

		barrelModel[3].addShapeBox(7F, 1F, -4F, 14, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import ImportBox144
		barrelModel[3].setRotationPoint(24.5F, -33F, 0F);

		barrelModel[4].addShapeBox(7F, -5F, -4F, 14, 2, 8, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox145
		barrelModel[4].setRotationPoint(24.5F, -33F, 0F);

		barrelModel[5].addShapeBox(21F, -2F, -3F, 12, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox146
		barrelModel[5].setRotationPoint(24.5F, -33F, 0F);

		barrelModel[6].addShapeBox(21F, -4F, -3F, 12, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox147
		barrelModel[6].setRotationPoint(24.5F, -33F, 0F);

		barrelModel[7].addShapeBox(21F, 0F, -3F, 12, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import ImportBox148
		barrelModel[7].setRotationPoint(24.5F, -33F, 0F);

		barrelModel[8].addShapeBox(36F, 0F, -4F, 10, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import ImportBox149
		barrelModel[8].setRotationPoint(24.5F, -33F, 0F);

		barrelModel[9].addShapeBox(36F, -4F, -4F, 10, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox150
		barrelModel[9].setRotationPoint(24.5F, -33F, 0F);

		barrelModel[10].addShapeBox(36F, -6F, -4F, 10, 2, 8, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox151
		barrelModel[10].setRotationPoint(24.5F, -33F, 0F);

		barrelModel[11].addShapeBox(33F, 0F, -4F, 3, 2, 8, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F); // Import ImportBox152
		barrelModel[11].setRotationPoint(24.5F, -33F, 0F);

		barrelModel[12].addShapeBox(33F, -4F, -4F, 3, 4, 8, 0F,0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import ImportBox153
		barrelModel[12].setRotationPoint(24.5F, -33F, 0F);

		barrelModel[13].addShapeBox(33F, -6F, -4F, 3, 2, 8, 0F,0F, -2F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -3F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F); // Import ImportBox154
		barrelModel[13].setRotationPoint(24.5F, -33F, 0F);

		barrelModel[14].addShapeBox(46F, -6F, -4F, 3, 2, 8, 0F,0F, 0F, -2F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, 0F); // Import ImportBox155
		barrelModel[14].setRotationPoint(24.5F, -33F, 0F);

		barrelModel[15].addShapeBox(46F, -4F, -4F, 3, 4, 8, 0F,0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import ImportBox156
		barrelModel[15].setRotationPoint(24.5F, -33F, 0F);

		barrelModel[16].addShapeBox(46F, 0F, -4F, 3, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F); // Import ImportBox157
		barrelModel[16].setRotationPoint(24.5F, -33F, 0F);

		barrelModel[17].addShapeBox(49F, -4F, -3F, 55, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox158
		barrelModel[17].setRotationPoint(24.5F, -33F, 0F);

		barrelModel[18].addShapeBox(49F, -2F, -3F, 55, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox159
		barrelModel[18].setRotationPoint(24.5F, -33F, 0F);

		barrelModel[19].addShapeBox(49F, 0F, -3F, 55, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import ImportBox160
		barrelModel[19].setRotationPoint(24.5F, -33F, 0F);

		barrelModel[20].addShapeBox(104F, -2F, -2F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox161
		barrelModel[20].setRotationPoint(24.5F, -33F, 0F);

		barrelModel[21].addShapeBox(104F, -2F, 1F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox162
		barrelModel[21].setRotationPoint(24.5F, -33F, 0F);

		barrelModel[22].addShapeBox(104F, -3F, -2F, 8, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox163
		barrelModel[22].setRotationPoint(24.5F, -33F, 0F);

		barrelModel[23].addShapeBox(104F, 0F, -2F, 8, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportBox164
		barrelModel[23].setRotationPoint(24.5F, -33F, 0F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 300, 1350, textureX, textureY); // Import ImportBox512
		leftTrackModel[1] = new ModelRendererTurbo(this, 300, 1365, textureX, textureY); // Import ImportBox513
		leftTrackModel[2] = new ModelRendererTurbo(this, 300, 1380, textureX, textureY); // Import ImportBox514
		leftTrackModel[3] = new ModelRendererTurbo(this, 300, 1396, textureX, textureY); // Import ImportBox515
		leftTrackModel[4] = new ModelRendererTurbo(this, 300, 1410, textureX, textureY); // Import ImportBox516
		leftTrackModel[5] = new ModelRendererTurbo(this, 300, 1422, textureX, textureY); // Import ImportBox517
		leftTrackModel[6] = new ModelRendererTurbo(this, 300, 1431, textureX, textureY); // Import ImportBox518
		leftTrackModel[7] = new ModelRendererTurbo(this, 300, 1442, textureX, textureY); // Import ImportBox519
		leftTrackModel[8] = new ModelRendererTurbo(this, 300, 1442, textureX, textureY); // Import ImportBox520
		leftTrackModel[9] = new ModelRendererTurbo(this, 300, 1431, textureX, textureY); // Import ImportBox521
		leftTrackModel[10] = new ModelRendererTurbo(this, 300, 1396, textureX, textureY); // Import ImportBox522
		leftTrackModel[11] = new ModelRendererTurbo(this, 300, 1410, textureX, textureY); // Import ImportBox523
		leftTrackModel[12] = new ModelRendererTurbo(this, 300, 1422, textureX, textureY); // Import ImportBox524
		leftTrackModel[13] = new ModelRendererTurbo(this, 300, 1442, textureX, textureY); // Import ImportBox525
		leftTrackModel[14] = new ModelRendererTurbo(this, 300, 1431, textureX, textureY); // Import ImportBox526
		leftTrackModel[15] = new ModelRendererTurbo(this, 300, 1396, textureX, textureY); // Import ImportBox527
		leftTrackModel[16] = new ModelRendererTurbo(this, 300, 1410, textureX, textureY); // Import ImportBox528
		leftTrackModel[17] = new ModelRendererTurbo(this, 300, 1422, textureX, textureY); // Import ImportBox529
		leftTrackModel[18] = new ModelRendererTurbo(this, 300, 1442, textureX, textureY); // Import ImportBox530
		leftTrackModel[19] = new ModelRendererTurbo(this, 300, 1431, textureX, textureY); // Import ImportBox531
		leftTrackModel[20] = new ModelRendererTurbo(this, 300, 1396, textureX, textureY); // Import ImportBox532
		leftTrackModel[21] = new ModelRendererTurbo(this, 300, 1410, textureX, textureY); // Import ImportBox533
		leftTrackModel[22] = new ModelRendererTurbo(this, 300, 1422, textureX, textureY); // Import ImportBox534
		leftTrackModel[23] = new ModelRendererTurbo(this, 300, 1835, textureX, textureY); // Import ImportBox535
		leftTrackModel[24] = new ModelRendererTurbo(this, 300, 1826, textureX, textureY); // Import ImportBox536
		leftTrackModel[25] = new ModelRendererTurbo(this, 300, 1826, textureX, textureY); // Import ImportBox537
		leftTrackModel[26] = new ModelRendererTurbo(this, 300, 1808, textureX, textureY); // Import ImportBox538
		leftTrackModel[27] = new ModelRendererTurbo(this, 300, 1843, textureX, textureY); // Import ImportBox539
		leftTrackModel[28] = new ModelRendererTurbo(this, 300, 1843, textureX, textureY); // Import ImportBox540
		leftTrackModel[29] = new ModelRendererTurbo(this, 300, 1835, textureX, textureY); // Import ImportBox541
		leftTrackModel[30] = new ModelRendererTurbo(this, 300, 1792, textureX, textureY); // Import ImportBox542
		leftTrackModel[31] = new ModelRendererTurbo(this, 300, 1835, textureX, textureY); // Import ImportBox543
		leftTrackModel[32] = new ModelRendererTurbo(this, 300, 1826, textureX, textureY); // Import ImportBox544
		leftTrackModel[33] = new ModelRendererTurbo(this, 300, 1826, textureX, textureY); // Import ImportBox545
		leftTrackModel[34] = new ModelRendererTurbo(this, 300, 1808, textureX, textureY); // Import ImportBox546
		leftTrackModel[35] = new ModelRendererTurbo(this, 300, 1843, textureX, textureY); // Import ImportBox547
		leftTrackModel[36] = new ModelRendererTurbo(this, 300, 1843, textureX, textureY); // Import ImportBox548
		leftTrackModel[37] = new ModelRendererTurbo(this, 300, 1835, textureX, textureY); // Import ImportBox549
		leftTrackModel[38] = new ModelRendererTurbo(this, 300, 1792, textureX, textureY); // Import ImportBox550
		leftTrackModel[39] = new ModelRendererTurbo(this, 300, 1442, textureX, textureY); // Import ImportBox551
		leftTrackModel[40] = new ModelRendererTurbo(this, 300, 1431, textureX, textureY); // Import ImportBox552
		leftTrackModel[41] = new ModelRendererTurbo(this, 300, 1396, textureX, textureY); // Import ImportBox553
		leftTrackModel[42] = new ModelRendererTurbo(this, 300, 1410, textureX, textureY); // Import ImportBox554
		leftTrackModel[43] = new ModelRendererTurbo(this, 300, 1422, textureX, textureY); // Import ImportBox555
		leftTrackModel[44] = new ModelRendererTurbo(this, 300, 1442, textureX, textureY); // Import ImportBox556
		leftTrackModel[45] = new ModelRendererTurbo(this, 300, 1431, textureX, textureY); // Import ImportBox557
		leftTrackModel[46] = new ModelRendererTurbo(this, 300, 1396, textureX, textureY); // Import ImportBox558
		leftTrackModel[47] = new ModelRendererTurbo(this, 300, 1410, textureX, textureY); // Import ImportBox559
		leftTrackModel[48] = new ModelRendererTurbo(this, 300, 1422, textureX, textureY); // Import ImportBox560
		leftTrackModel[49] = new ModelRendererTurbo(this, 300, 1451, textureX, textureY); // Import ImportBox561
		leftTrackModel[50] = new ModelRendererTurbo(this, 300, 1463, textureX, textureY); // Import ImportBox562
		leftTrackModel[51] = new ModelRendererTurbo(this, 300, 1474, textureX, textureY); // Import ImportBox563
		leftTrackModel[52] = new ModelRendererTurbo(this, 300, 1484, textureX, textureY); // Import ImportBox564
		leftTrackModel[53] = new ModelRendererTurbo(this, 300, 1495, textureX, textureY); // Import ImportBox565
		leftTrackModel[54] = new ModelRendererTurbo(this, 300, 1792, textureX, textureY); // Import ImportBox566
		leftTrackModel[55] = new ModelRendererTurbo(this, 300, 1808, textureX, textureY); // Import ImportBox567
		leftTrackModel[56] = new ModelRendererTurbo(this, 300, 1826, textureX, textureY); // Import ImportBox568
		leftTrackModel[57] = new ModelRendererTurbo(this, 300, 1835, textureX, textureY); // Import ImportBox569
		leftTrackModel[58] = new ModelRendererTurbo(this, 300, 1826, textureX, textureY); // Import ImportBox570
		leftTrackModel[59] = new ModelRendererTurbo(this, 300, 1835, textureX, textureY); // Import ImportBox571
		leftTrackModel[60] = new ModelRendererTurbo(this, 300, 1843, textureX, textureY); // Import ImportBox572
		leftTrackModel[61] = new ModelRendererTurbo(this, 300, 1843, textureX, textureY); // Import ImportBox573
		leftTrackModel[62] = new ModelRendererTurbo(this, 300, 1505, textureX, textureY); // Import ImportBox574
		leftTrackModel[63] = new ModelRendererTurbo(this, 300, 1523, textureX, textureY); // Import ImportBox575
		leftTrackModel[64] = new ModelRendererTurbo(this, 300, 1541, textureX, textureY); // Import ImportBox576
		leftTrackModel[65] = new ModelRendererTurbo(this, 300, 1577, textureX, textureY); // Import ImportBox577
		leftTrackModel[66] = new ModelRendererTurbo(this, 300, 1596, textureX, textureY); // Import ImportBox578
		leftTrackModel[67] = new ModelRendererTurbo(this, 300, 1714, textureX, textureY); // Import ImportBox579
		leftTrackModel[68] = new ModelRendererTurbo(this, 300, 1750, textureX, textureY); // Import ImportBox580
		leftTrackModel[69] = new ModelRendererTurbo(this, 300, 1770, textureX, textureY); // Import ImportBox581
		leftTrackModel[70] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import ImportBox605
		leftTrackModel[71] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import ImportBox606
		leftTrackModel[72] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import ImportBox607

		leftTrackModel[0].addShapeBox(0F, 0F, 0F, 12, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox512
		leftTrackModel[0].setRotationPoint(58F, -11.5F, 22.5F);

		leftTrackModel[1].addShapeBox(0F, 0F, 0F, 12, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import ImportBox513
		leftTrackModel[1].setRotationPoint(58F, -7.5F, 22.5F);

		leftTrackModel[2].addShapeBox(0F, 0F, 0F, 12, 4, 10, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox514
		leftTrackModel[2].setRotationPoint(58F, -15.5F, 22.5F);

		leftTrackModel[3].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox515
		leftTrackModel[3].setRotationPoint(39.5F, -4F, 24.5F);

		leftTrackModel[4].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox516
		leftTrackModel[4].setRotationPoint(39.5F, 2F, 24.5F);

		leftTrackModel[5].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import ImportBox517
		leftTrackModel[5].setRotationPoint(41.5F, 6F, 24.5F);

		leftTrackModel[6].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox518
		leftTrackModel[6].setRotationPoint(39.5F, -8F, 24.5F);

		leftTrackModel[7].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox519
		leftTrackModel[7].setRotationPoint(41.5F, -10F, 24.5F);

		leftTrackModel[8].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox520
		leftTrackModel[8].setRotationPoint(23F, -10F, 24.5F);

		leftTrackModel[9].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox521
		leftTrackModel[9].setRotationPoint(21F, -8F, 24.5F);

		leftTrackModel[10].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox522
		leftTrackModel[10].setRotationPoint(21F, -4F, 24.5F);

		leftTrackModel[11].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox523
		leftTrackModel[11].setRotationPoint(21F, 2F, 24.5F);

		leftTrackModel[12].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import ImportBox524
		leftTrackModel[12].setRotationPoint(23F, 6F, 24.5F);

		leftTrackModel[13].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox525
		leftTrackModel[13].setRotationPoint(-0.5F, -10F, 24.5F);

		leftTrackModel[14].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox526
		leftTrackModel[14].setRotationPoint(-2.5F, -8F, 24.5F);

		leftTrackModel[15].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox527
		leftTrackModel[15].setRotationPoint(-2.5F, -4F, 24.5F);

		leftTrackModel[16].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox528
		leftTrackModel[16].setRotationPoint(-2.5F, 2F, 24.5F);

		leftTrackModel[17].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import ImportBox529
		leftTrackModel[17].setRotationPoint(-0.5F, 6F, 24.5F);

		leftTrackModel[18].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox530
		leftTrackModel[18].setRotationPoint(-19.5F, -10F, 24.5F);

		leftTrackModel[19].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox531
		leftTrackModel[19].setRotationPoint(-21.5F, -8F, 24.5F);

		leftTrackModel[20].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox532
		leftTrackModel[20].setRotationPoint(-21.5F, -4F, 24.5F);

		leftTrackModel[21].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox533
		leftTrackModel[21].setRotationPoint(-21.5F, 2F, 24.5F);

		leftTrackModel[22].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import ImportBox534
		leftTrackModel[22].setRotationPoint(-19.5F, 6F, 24.5F);

		leftTrackModel[23].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import ImportBox535
		leftTrackModel[23].setRotationPoint(-15.5F, -3F, 16.5F);

		leftTrackModel[24].addShapeBox(0F, 0F, 0F, 8, 4, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import ImportBox536
		leftTrackModel[24].setRotationPoint(-14.5F, -4F, 16.5F);

		leftTrackModel[25].addShapeBox(0F, 0F, 0F, 8, 4, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import ImportBox537
		leftTrackModel[25].setRotationPoint(1.5F, -4F, 16.5F);

		leftTrackModel[26].addShapeBox(0F, 0F, 0F, 8, 13, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox538
		leftTrackModel[26].setRotationPoint(-6.5F, -12F, 16.5F);

		leftTrackModel[27].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox539
		leftTrackModel[27].setRotationPoint(-13.5F, -2F, 19.5F);

		leftTrackModel[28].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox540
		leftTrackModel[28].setRotationPoint(6.5F, -2F, 19.5F);

		leftTrackModel[29].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import ImportBox541
		leftTrackModel[29].setRotationPoint(9.5F, -3F, 16.5F);

		leftTrackModel[30].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Import ImportBox542
		leftTrackModel[30].setRotationPoint(-6.5F, -12F, 20.5F);

		leftTrackModel[31].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import ImportBox543
		leftTrackModel[31].setRotationPoint(25.5F, -3F, 16.5F);

		leftTrackModel[32].addShapeBox(0F, 0F, 0F, 8, 4, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import ImportBox544
		leftTrackModel[32].setRotationPoint(26.5F, -4F, 16.5F);

		leftTrackModel[33].addShapeBox(0F, 0F, 0F, 8, 4, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import ImportBox545
		leftTrackModel[33].setRotationPoint(42.5F, -4F, 16.5F);

		leftTrackModel[34].addShapeBox(0F, 0F, 0F, 8, 13, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox546
		leftTrackModel[34].setRotationPoint(34.5F, -12F, 16.5F);

		leftTrackModel[35].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox547
		leftTrackModel[35].setRotationPoint(27.5F, -2F, 19.5F);

		leftTrackModel[36].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox548
		leftTrackModel[36].setRotationPoint(47.5F, -2F, 19.5F);

		leftTrackModel[37].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import ImportBox549
		leftTrackModel[37].setRotationPoint(50.5F, -3F, 16.5F);

		leftTrackModel[38].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Import ImportBox550
		leftTrackModel[38].setRotationPoint(34.5F, -12F, 20.5F);

		leftTrackModel[39].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox551
		leftTrackModel[39].setRotationPoint(-40F, -10F, 24.5F);

		leftTrackModel[40].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox552
		leftTrackModel[40].setRotationPoint(-42F, -8F, 24.5F);

		leftTrackModel[41].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox553
		leftTrackModel[41].setRotationPoint(-42F, -4F, 24.5F);

		leftTrackModel[42].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox554
		leftTrackModel[42].setRotationPoint(-42F, 2F, 24.5F);

		leftTrackModel[43].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import ImportBox555
		leftTrackModel[43].setRotationPoint(-40F, 6F, 24.5F);

		leftTrackModel[44].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox556
		leftTrackModel[44].setRotationPoint(-58.5F, -10F, 24.5F);

		leftTrackModel[45].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox557
		leftTrackModel[45].setRotationPoint(-60.5F, -8F, 24.5F);

		leftTrackModel[46].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox558
		leftTrackModel[46].setRotationPoint(-60.5F, -4F, 24.5F);

		leftTrackModel[47].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox559
		leftTrackModel[47].setRotationPoint(-60.5F, 2F, 24.5F);

		leftTrackModel[48].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import ImportBox560
		leftTrackModel[48].setRotationPoint(-58.5F, 6F, 24.5F);

		leftTrackModel[49].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox561
		leftTrackModel[49].setRotationPoint(-74.5F, -9F, 24.5F);

		leftTrackModel[50].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox562
		leftTrackModel[50].setRotationPoint(-74.5F, -11F, 24.5F);

		leftTrackModel[51].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox563
		leftTrackModel[51].setRotationPoint(-73.5F, -12F, 24.5F);

		leftTrackModel[52].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox564
		leftTrackModel[52].setRotationPoint(-74.5F, -6F, 24.5F);

		leftTrackModel[53].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox565
		leftTrackModel[53].setRotationPoint(-73.5F, -4F, 24.5F);

		leftTrackModel[54].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Import ImportBox566
		leftTrackModel[54].setRotationPoint(-46.5F, -12F, 20.5F);

		leftTrackModel[55].addShapeBox(0F, 0F, 0F, 8, 13, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox567
		leftTrackModel[55].setRotationPoint(-46.5F, -12F, 16.5F);

		leftTrackModel[56].addShapeBox(0F, 0F, 0F, 8, 4, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import ImportBox568
		leftTrackModel[56].setRotationPoint(-38.5F, -4F, 16.5F);

		leftTrackModel[57].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import ImportBox569
		leftTrackModel[57].setRotationPoint(-30.5F, -3F, 16.5F);

		leftTrackModel[58].addShapeBox(0F, 0F, 0F, 8, 4, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import ImportBox570
		leftTrackModel[58].setRotationPoint(-54.5F, -4F, 16.5F);

		leftTrackModel[59].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import ImportBox571
		leftTrackModel[59].setRotationPoint(-55.5F, -3F, 16.5F);

		leftTrackModel[60].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox572
		leftTrackModel[60].setRotationPoint(-33.5F, -2F, 19.5F);

		leftTrackModel[61].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox573
		leftTrackModel[61].setRotationPoint(-53.5F, -2F, 19.5F);

		leftTrackModel[62].addShapeBox(-1F, -1F, 0F, 1, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox574
		leftTrackModel[62].setRotationPoint(70.5F, -12.5F, 21F);
		leftTrackModel[62].rotateAngleZ = 0.33161256F;

		leftTrackModel[63].addShapeBox(-1F, 0F, 0F, 1, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F); // Import ImportBox575
		leftTrackModel[63].setRotationPoint(71.47F, -9.65F, 21F);
		leftTrackModel[63].rotateAngleZ = -0.27925268F;

		leftTrackModel[64].addShapeBox(-1F, 0F, 0F, 1, 22, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox576
		leftTrackModel[64].setRotationPoint(70.4F, -5.7F, 21F);
		leftTrackModel[64].rotateAngleZ = -0.90757121F;

		leftTrackModel[65].addShapeBox(-1F, 0F, 0F, 1, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox577
		leftTrackModel[65].setRotationPoint(53.1F, 7.8F, 21F);
		leftTrackModel[65].rotateAngleZ = -1.32645023F;

		leftTrackModel[66].addShapeBox(-1F, 0F, 0F, 1, 104, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox578
		leftTrackModel[66].setRotationPoint(48.2F, 9F, 21F);
		leftTrackModel[66].rotateAngleZ = -1.57079633F;

		leftTrackModel[67].addShapeBox(-1F, 0F, 0F, 1, 22, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox579
		leftTrackModel[67].setRotationPoint(-55.8F, 9F, 21F);
		leftTrackModel[67].rotateAngleZ = -2.12930169F;

		leftTrackModel[68].addShapeBox(-1F, 0F, 0F, 1, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox580
		leftTrackModel[68].setRotationPoint(-74.5F, -2.7F, 21F);
		leftTrackModel[68].rotateAngleZ = -2.75762022F;

		leftTrackModel[69].addShapeBox(-1F, 0F, 0F, 1, 8, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox581
		leftTrackModel[69].setRotationPoint(-76F, -6.4F, 21F);
		leftTrackModel[69].rotateAngleZ = -3.24631241F;

		leftTrackModel[70].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox605
		leftTrackModel[70].setRotationPoint(62F, -10.5F, 13.5F);

		leftTrackModel[71].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox606
		leftTrackModel[71].setRotationPoint(62F, -11.5F, 13.5F);

		leftTrackModel[72].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox607
		leftTrackModel[72].setRotationPoint(62F, -8.5F, 13.5F);
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 300, 1350, textureX, textureY); // Import ImportBox438
		rightTrackModel[1] = new ModelRendererTurbo(this, 300, 1365, textureX, textureY); // Import ImportBox439
		rightTrackModel[2] = new ModelRendererTurbo(this, 300, 1380, textureX, textureY); // Import ImportBox440
		rightTrackModel[3] = new ModelRendererTurbo(this, 300, 1396, textureX, textureY); // Import ImportBox441
		rightTrackModel[4] = new ModelRendererTurbo(this, 300, 1410, textureX, textureY); // Import ImportBox442
		rightTrackModel[5] = new ModelRendererTurbo(this, 300, 1422, textureX, textureY); // Import ImportBox443
		rightTrackModel[6] = new ModelRendererTurbo(this, 300, 1431, textureX, textureY); // Import ImportBox444
		rightTrackModel[7] = new ModelRendererTurbo(this, 300, 1442, textureX, textureY); // Import ImportBox445
		rightTrackModel[8] = new ModelRendererTurbo(this, 300, 1442, textureX, textureY); // Import ImportBox446
		rightTrackModel[9] = new ModelRendererTurbo(this, 300, 1431, textureX, textureY); // Import ImportBox447
		rightTrackModel[10] = new ModelRendererTurbo(this, 300, 1396, textureX, textureY); // Import ImportBox448
		rightTrackModel[11] = new ModelRendererTurbo(this, 300, 1410, textureX, textureY); // Import ImportBox449
		rightTrackModel[12] = new ModelRendererTurbo(this, 300, 1422, textureX, textureY); // Import ImportBox450
		rightTrackModel[13] = new ModelRendererTurbo(this, 300, 1442, textureX, textureY); // Import ImportBox451
		rightTrackModel[14] = new ModelRendererTurbo(this, 300, 1431, textureX, textureY); // Import ImportBox452
		rightTrackModel[15] = new ModelRendererTurbo(this, 300, 1396, textureX, textureY); // Import ImportBox453
		rightTrackModel[16] = new ModelRendererTurbo(this, 300, 1410, textureX, textureY); // Import ImportBox454
		rightTrackModel[17] = new ModelRendererTurbo(this, 300, 1422, textureX, textureY); // Import ImportBox455
		rightTrackModel[18] = new ModelRendererTurbo(this, 300, 1442, textureX, textureY); // Import ImportBox456
		rightTrackModel[19] = new ModelRendererTurbo(this, 300, 1431, textureX, textureY); // Import ImportBox457
		rightTrackModel[20] = new ModelRendererTurbo(this, 300, 1396, textureX, textureY); // Import ImportBox458
		rightTrackModel[21] = new ModelRendererTurbo(this, 300, 1410, textureX, textureY); // Import ImportBox459
		rightTrackModel[22] = new ModelRendererTurbo(this, 300, 1422, textureX, textureY); // Import ImportBox460
		rightTrackModel[23] = new ModelRendererTurbo(this, 300, 1442, textureX, textureY); // Import ImportBox461
		rightTrackModel[24] = new ModelRendererTurbo(this, 300, 1431, textureX, textureY); // Import ImportBox462
		rightTrackModel[25] = new ModelRendererTurbo(this, 300, 1396, textureX, textureY); // Import ImportBox463
		rightTrackModel[26] = new ModelRendererTurbo(this, 300, 1410, textureX, textureY); // Import ImportBox464
		rightTrackModel[27] = new ModelRendererTurbo(this, 300, 1422, textureX, textureY); // Import ImportBox465
		rightTrackModel[28] = new ModelRendererTurbo(this, 300, 1442, textureX, textureY); // Import ImportBox466
		rightTrackModel[29] = new ModelRendererTurbo(this, 300, 1431, textureX, textureY); // Import ImportBox467
		rightTrackModel[30] = new ModelRendererTurbo(this, 300, 1396, textureX, textureY); // Import ImportBox468
		rightTrackModel[31] = new ModelRendererTurbo(this, 300, 1410, textureX, textureY); // Import ImportBox469
		rightTrackModel[32] = new ModelRendererTurbo(this, 300, 1422, textureX, textureY); // Import ImportBox470
		rightTrackModel[33] = new ModelRendererTurbo(this, 300, 1451, textureX, textureY); // Import ImportBox471
		rightTrackModel[34] = new ModelRendererTurbo(this, 300, 1463, textureX, textureY); // Import ImportBox473
		rightTrackModel[35] = new ModelRendererTurbo(this, 300, 1474, textureX, textureY); // Import ImportBox474
		rightTrackModel[36] = new ModelRendererTurbo(this, 300, 1484, textureX, textureY); // Import ImportBox475
		rightTrackModel[37] = new ModelRendererTurbo(this, 300, 1495, textureX, textureY); // Import ImportBox476
		rightTrackModel[38] = new ModelRendererTurbo(this, 300, 1505, textureX, textureY); // Import ImportBox477
		rightTrackModel[39] = new ModelRendererTurbo(this, 300, 1523, textureX, textureY); // Import ImportBox478
		rightTrackModel[40] = new ModelRendererTurbo(this, 300, 1541, textureX, textureY); // Import ImportBox479
		rightTrackModel[41] = new ModelRendererTurbo(this, 300, 1577, textureX, textureY); // Import ImportBox480
		rightTrackModel[42] = new ModelRendererTurbo(this, 300, 1596, textureX, textureY); // Import ImportBox481
		rightTrackModel[43] = new ModelRendererTurbo(this, 300, 1714, textureX, textureY); // Import ImportBox482
		rightTrackModel[44] = new ModelRendererTurbo(this, 300, 1750, textureX, textureY); // Import ImportBox483
		rightTrackModel[45] = new ModelRendererTurbo(this, 300, 1770, textureX, textureY); // Import ImportBox484
		rightTrackModel[46] = new ModelRendererTurbo(this, 300, 1792, textureX, textureY); // Import ImportBox485
		rightTrackModel[47] = new ModelRendererTurbo(this, 300, 1808, textureX, textureY); // Import ImportBox486
		rightTrackModel[48] = new ModelRendererTurbo(this, 300, 1826, textureX, textureY); // Import ImportBox487
		rightTrackModel[49] = new ModelRendererTurbo(this, 300, 1835, textureX, textureY); // Import ImportBox488
		rightTrackModel[50] = new ModelRendererTurbo(this, 300, 1826, textureX, textureY); // Import ImportBox489
		rightTrackModel[51] = new ModelRendererTurbo(this, 300, 1835, textureX, textureY); // Import ImportBox490
		rightTrackModel[52] = new ModelRendererTurbo(this, 300, 1843, textureX, textureY); // Import ImportBox491
		rightTrackModel[53] = new ModelRendererTurbo(this, 300, 1843, textureX, textureY); // Import ImportBox492
		rightTrackModel[54] = new ModelRendererTurbo(this, 300, 1835, textureX, textureY); // Import ImportBox493
		rightTrackModel[55] = new ModelRendererTurbo(this, 300, 1826, textureX, textureY); // Import ImportBox494
		rightTrackModel[56] = new ModelRendererTurbo(this, 300, 1826, textureX, textureY); // Import ImportBox495
		rightTrackModel[57] = new ModelRendererTurbo(this, 300, 1808, textureX, textureY); // Import ImportBox496
		rightTrackModel[58] = new ModelRendererTurbo(this, 300, 1843, textureX, textureY); // Import ImportBox497
		rightTrackModel[59] = new ModelRendererTurbo(this, 300, 1843, textureX, textureY); // Import ImportBox498
		rightTrackModel[60] = new ModelRendererTurbo(this, 300, 1835, textureX, textureY); // Import ImportBox499
		rightTrackModel[61] = new ModelRendererTurbo(this, 300, 1792, textureX, textureY); // Import ImportBox500
		rightTrackModel[62] = new ModelRendererTurbo(this, 300, 1835, textureX, textureY); // Import ImportBox501
		rightTrackModel[63] = new ModelRendererTurbo(this, 300, 1826, textureX, textureY); // Import ImportBox502
		rightTrackModel[64] = new ModelRendererTurbo(this, 300, 1826, textureX, textureY); // Import ImportBox503
		rightTrackModel[65] = new ModelRendererTurbo(this, 300, 1808, textureX, textureY); // Import ImportBox504
		rightTrackModel[66] = new ModelRendererTurbo(this, 300, 1843, textureX, textureY); // Import ImportBox505
		rightTrackModel[67] = new ModelRendererTurbo(this, 300, 1843, textureX, textureY); // Import ImportBox506
		rightTrackModel[68] = new ModelRendererTurbo(this, 300, 1835, textureX, textureY); // Import ImportBox507
		rightTrackModel[69] = new ModelRendererTurbo(this, 300, 1792, textureX, textureY); // Import ImportBox508
		rightTrackModel[70] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import ImportBox509
		rightTrackModel[71] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import ImportBox510
		rightTrackModel[72] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import ImportBox511

		rightTrackModel[0].addShapeBox(0F, 0F, 0F, 12, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox438
		rightTrackModel[0].setRotationPoint(58F, -11.5F, -32.5F);

		rightTrackModel[1].addShapeBox(0F, 0F, 0F, 12, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import ImportBox439
		rightTrackModel[1].setRotationPoint(58F, -7.5F, -32.5F);

		rightTrackModel[2].addShapeBox(0F, 0F, 0F, 12, 4, 10, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox440
		rightTrackModel[2].setRotationPoint(58F, -15.5F, -32.5F);

		rightTrackModel[3].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox441
		rightTrackModel[3].setRotationPoint(39.5F, -4F, -30.5F);

		rightTrackModel[4].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox442
		rightTrackModel[4].setRotationPoint(39.5F, 2F, -30.5F);

		rightTrackModel[5].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import ImportBox443
		rightTrackModel[5].setRotationPoint(41.5F, 6F, -30.5F);

		rightTrackModel[6].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox444
		rightTrackModel[6].setRotationPoint(39.5F, -8F, -30.5F);

		rightTrackModel[7].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox445
		rightTrackModel[7].setRotationPoint(41.5F, -10F, -30.5F);

		rightTrackModel[8].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox446
		rightTrackModel[8].setRotationPoint(23F, -10F, -30.5F);

		rightTrackModel[9].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox447
		rightTrackModel[9].setRotationPoint(21F, -8F, -30.5F);

		rightTrackModel[10].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox448
		rightTrackModel[10].setRotationPoint(21F, -4F, -30.5F);

		rightTrackModel[11].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox449
		rightTrackModel[11].setRotationPoint(21F, 2F, -30.5F);

		rightTrackModel[12].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import ImportBox450
		rightTrackModel[12].setRotationPoint(23F, 6F, -30.5F);

		rightTrackModel[13].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox451
		rightTrackModel[13].setRotationPoint(-0.5F, -10F, -30.5F);

		rightTrackModel[14].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox452
		rightTrackModel[14].setRotationPoint(-2.5F, -8F, -30.5F);

		rightTrackModel[15].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox453
		rightTrackModel[15].setRotationPoint(-2.5F, -4F, -30.5F);

		rightTrackModel[16].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox454
		rightTrackModel[16].setRotationPoint(-2.5F, 2F, -30.5F);

		rightTrackModel[17].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import ImportBox455
		rightTrackModel[17].setRotationPoint(-0.5F, 6F, -30.5F);

		rightTrackModel[18].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox456
		rightTrackModel[18].setRotationPoint(-19.5F, -10F, -30.5F);

		rightTrackModel[19].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox457
		rightTrackModel[19].setRotationPoint(-21.5F, -8F, -30.5F);

		rightTrackModel[20].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox458
		rightTrackModel[20].setRotationPoint(-21.5F, -4F, -30.5F);

		rightTrackModel[21].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox459
		rightTrackModel[21].setRotationPoint(-21.5F, 2F, -30.5F);

		rightTrackModel[22].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import ImportBox460
		rightTrackModel[22].setRotationPoint(-19.5F, 6F, -30.5F);

		rightTrackModel[23].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox461
		rightTrackModel[23].setRotationPoint(-40F, -10F, -30.5F);

		rightTrackModel[24].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox462
		rightTrackModel[24].setRotationPoint(-42F, -8F, -30.5F);

		rightTrackModel[25].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox463
		rightTrackModel[25].setRotationPoint(-42F, -4F, -30.5F);

		rightTrackModel[26].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox464
		rightTrackModel[26].setRotationPoint(-42F, 2F, -30.5F);

		rightTrackModel[27].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import ImportBox465
		rightTrackModel[27].setRotationPoint(-40F, 6F, -30.5F);

		rightTrackModel[28].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox466
		rightTrackModel[28].setRotationPoint(-58.5F, -10F, -30.5F);

		rightTrackModel[29].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox467
		rightTrackModel[29].setRotationPoint(-60.5F, -8F, -30.5F);

		rightTrackModel[30].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox468
		rightTrackModel[30].setRotationPoint(-60.5F, -4F, -30.5F);

		rightTrackModel[31].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox469
		rightTrackModel[31].setRotationPoint(-60.5F, 2F, -30.5F);

		rightTrackModel[32].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import ImportBox470
		rightTrackModel[32].setRotationPoint(-58.5F, 6F, -30.5F);

		rightTrackModel[33].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox471
		rightTrackModel[33].setRotationPoint(-74.5F, -9F, -32.5F);

		rightTrackModel[34].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox473
		rightTrackModel[34].setRotationPoint(-74.5F, -11F, -32.5F);

		rightTrackModel[35].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox474
		rightTrackModel[35].setRotationPoint(-73.5F, -12F, -32.5F);

		rightTrackModel[36].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox475
		rightTrackModel[36].setRotationPoint(-74.5F, -6F, -32.5F);

		rightTrackModel[37].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox476
		rightTrackModel[37].setRotationPoint(-73.5F, -4F, -32.5F);

		rightTrackModel[38].addShapeBox(-1F, -1F, 0F, 1, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox477
		rightTrackModel[38].setRotationPoint(70.5F, -12.5F, -34F);
		rightTrackModel[38].rotateAngleZ = 0.33161256F;

		rightTrackModel[39].addShapeBox(-1F, 0F, 0F, 1, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F); // Import ImportBox478
		rightTrackModel[39].setRotationPoint(71.47F, -9.65F, -34F);
		rightTrackModel[39].rotateAngleZ = -0.27925268F;

		rightTrackModel[40].addShapeBox(-1F, 0F, 0F, 1, 22, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox479
		rightTrackModel[40].setRotationPoint(70.4F, -5.7F, -34F);
		rightTrackModel[40].rotateAngleZ = -0.90757121F;

		rightTrackModel[41].addShapeBox(-1F, 0F, 0F, 1, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox480
		rightTrackModel[41].setRotationPoint(53.1F, 7.8F, -34F);
		rightTrackModel[41].rotateAngleZ = -1.32645023F;

		rightTrackModel[42].addShapeBox(-1F, 0F, 0F, 1, 104, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox481
		rightTrackModel[42].setRotationPoint(48.2F, 9F, -34F);
		rightTrackModel[42].rotateAngleZ = -1.57079633F;

		rightTrackModel[43].addShapeBox(-1F, 0F, 0F, 1, 22, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox482
		rightTrackModel[43].setRotationPoint(-55.8F, 9F, -34F);
		rightTrackModel[43].rotateAngleZ = -2.12930169F;

		rightTrackModel[44].addShapeBox(-1F, 0F, 0F, 1, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox483
		rightTrackModel[44].setRotationPoint(-74.5F, -2.7F, -34F);
		rightTrackModel[44].rotateAngleZ = -2.75762022F;

		rightTrackModel[45].addShapeBox(-1F, 0F, 0F, 1, 8, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox484
		rightTrackModel[45].setRotationPoint(-76F, -6.4F, -34F);
		rightTrackModel[45].rotateAngleZ = -3.24631241F;

		rightTrackModel[46].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox485
		rightTrackModel[46].setRotationPoint(-46.5F, -12F, -22.5F);

		rightTrackModel[47].addShapeBox(0F, 0F, 0F, 8, 13, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox486
		rightTrackModel[47].setRotationPoint(-46.5F, -12F, -20.5F);

		rightTrackModel[48].addShapeBox(0F, 0F, 0F, 8, 4, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import ImportBox487
		rightTrackModel[48].setRotationPoint(-38.5F, -4F, -19.5F);

		rightTrackModel[49].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import ImportBox488
		rightTrackModel[49].setRotationPoint(-30.5F, -3F, -19.5F);

		rightTrackModel[50].addShapeBox(0F, 0F, 0F, 8, 4, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import ImportBox489
		rightTrackModel[50].setRotationPoint(-54.5F, -4F, -19.5F);

		rightTrackModel[51].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import ImportBox490
		rightTrackModel[51].setRotationPoint(-55.5F, -3F, -19.5F);

		rightTrackModel[52].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox491
		rightTrackModel[52].setRotationPoint(-33.5F, -2F, -24.5F);

		rightTrackModel[53].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox492
		rightTrackModel[53].setRotationPoint(-53.5F, -2F, -24.5F);

		rightTrackModel[54].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import ImportBox493
		rightTrackModel[54].setRotationPoint(-15.5F, -3F, -19.5F);

		rightTrackModel[55].addShapeBox(0F, 0F, 0F, 8, 4, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import ImportBox494
		rightTrackModel[55].setRotationPoint(-14.5F, -4F, -19.5F);

		rightTrackModel[56].addShapeBox(0F, 0F, 0F, 8, 4, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import ImportBox495
		rightTrackModel[56].setRotationPoint(1.5F, -4F, -19.5F);

		rightTrackModel[57].addShapeBox(0F, 0F, 0F, 8, 13, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox496
		rightTrackModel[57].setRotationPoint(-6.5F, -12F, -20.5F);

		rightTrackModel[58].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox497
		rightTrackModel[58].setRotationPoint(-13.5F, -2F, -24.5F);

		rightTrackModel[59].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox498
		rightTrackModel[59].setRotationPoint(6.5F, -2F, -24.5F);

		rightTrackModel[60].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import ImportBox499
		rightTrackModel[60].setRotationPoint(9.5F, -3F, -19.5F);

		rightTrackModel[61].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox500
		rightTrackModel[61].setRotationPoint(-6.5F, -12F, -22.5F);

		rightTrackModel[62].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import ImportBox501
		rightTrackModel[62].setRotationPoint(25.5F, -3F, -19.5F);

		rightTrackModel[63].addShapeBox(0F, 0F, 0F, 8, 4, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import ImportBox502
		rightTrackModel[63].setRotationPoint(26.5F, -4F, -19.5F);

		rightTrackModel[64].addShapeBox(0F, 0F, 0F, 8, 4, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import ImportBox503
		rightTrackModel[64].setRotationPoint(42.5F, -4F, -19.5F);

		rightTrackModel[65].addShapeBox(0F, 0F, 0F, 8, 13, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox504
		rightTrackModel[65].setRotationPoint(34.5F, -12F, -20.5F);

		rightTrackModel[66].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox505
		rightTrackModel[66].setRotationPoint(27.5F, -2F, -24.5F);

		rightTrackModel[67].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox506
		rightTrackModel[67].setRotationPoint(47.5F, -2F, -24.5F);

		rightTrackModel[68].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import ImportBox507
		rightTrackModel[68].setRotationPoint(50.5F, -3F, -19.5F);

		rightTrackModel[69].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox508
		rightTrackModel[69].setRotationPoint(34.5F, -12F, -22.5F);

		rightTrackModel[70].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox509
		rightTrackModel[70].setRotationPoint(62F, -10.5F, -23.5F);

		rightTrackModel[71].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox510
		rightTrackModel[71].setRotationPoint(62F, -11.5F, -23.5F);

		rightTrackModel[72].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox511
		rightTrackModel[72].setRotationPoint(62F, -8.5F, -23.5F);
	}
}