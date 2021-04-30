//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.1.1
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelT90GOD extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 512;

	public ModelT90GOD() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[350];
		turretModel = new ModelRendererTurbo[190];
		barrelModel = new ModelRendererTurbo[80];
		leftTrackModel = new ModelRendererTurbo[406];
		rightTrackModel = new ModelRendererTurbo[409];

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
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 24
		bodyModel[24] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 26
		bodyModel[26] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 27
		bodyModel[27] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 28
		bodyModel[28] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 29
		bodyModel[29] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 30
		bodyModel[30] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 31
		bodyModel[31] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 32
		bodyModel[32] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 33
		bodyModel[33] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 34
		bodyModel[34] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 35
		bodyModel[35] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 36
		bodyModel[36] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 37
		bodyModel[37] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 38
		bodyModel[38] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Box 39
		bodyModel[39] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Box 40
		bodyModel[40] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 41
		bodyModel[41] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Box 42
		bodyModel[42] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Box 43
		bodyModel[43] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Box 44
		bodyModel[44] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Box 45
		bodyModel[45] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Box 46
		bodyModel[46] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Box 47
		bodyModel[47] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Box 48
		bodyModel[48] = new ModelRendererTurbo(this, 625, 1, textureX, textureY); // Box 49
		bodyModel[49] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Box 50
		bodyModel[50] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Box 51
		bodyModel[51] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Box 52
		bodyModel[52] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Box 53
		bodyModel[53] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Box 54
		bodyModel[54] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Box 55
		bodyModel[55] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Box 56
		bodyModel[56] = new ModelRendererTurbo(this, 689, 1, textureX, textureY); // Box 57
		bodyModel[57] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Box 58
		bodyModel[58] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Box 59
		bodyModel[59] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Box 60
		bodyModel[60] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Box 61
		bodyModel[61] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Box 62
		bodyModel[62] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // Box 63
		bodyModel[63] = new ModelRendererTurbo(this, 745, 1, textureX, textureY); // Box 64
		bodyModel[64] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Box 65
		bodyModel[65] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Box 66
		bodyModel[66] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Box 67
		bodyModel[67] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Box 68
		bodyModel[68] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Box 69
		bodyModel[69] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Box 70
		bodyModel[70] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Box 71
		bodyModel[71] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Box 72
		bodyModel[72] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Box 73
		bodyModel[73] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Box 74
		bodyModel[74] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Box 75
		bodyModel[75] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Box 76
		bodyModel[76] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Box 77
		bodyModel[77] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Box 78
		bodyModel[78] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Box 79
		bodyModel[79] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Box 80
		bodyModel[80] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 81
		bodyModel[81] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Box 82
		bodyModel[82] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 83
		bodyModel[83] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 84
		bodyModel[84] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 85
		bodyModel[85] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 86
		bodyModel[86] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 87
		bodyModel[87] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 88
		bodyModel[88] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Box 89
		bodyModel[89] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Box 90
		bodyModel[90] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Box 91
		bodyModel[91] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 92
		bodyModel[92] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 93
		bodyModel[93] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 94
		bodyModel[94] = new ModelRendererTurbo(this, 617, 9, textureX, textureY); // Box 96
		bodyModel[95] = new ModelRendererTurbo(this, 673, 9, textureX, textureY); // Box 97
		bodyModel[96] = new ModelRendererTurbo(this, 729, 9, textureX, textureY); // Box 98
		bodyModel[97] = new ModelRendererTurbo(this, 777, 17, textureX, textureY); // Box 99
		bodyModel[98] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 100
		bodyModel[99] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 101
		bodyModel[100] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 102
		bodyModel[101] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 103
		bodyModel[102] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 104
		bodyModel[103] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 105
		bodyModel[104] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 106
		bodyModel[105] = new ModelRendererTurbo(this, 905, 17, textureX, textureY); // Box 109
		bodyModel[106] = new ModelRendererTurbo(this, 777, 9, textureX, textureY); // Box 110
		bodyModel[107] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 113
		bodyModel[108] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 114
		bodyModel[109] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 115
		bodyModel[110] = new ModelRendererTurbo(this, 513, 33, textureX, textureY); // Box 116
		bodyModel[111] = new ModelRendererTurbo(this, 681, 25, textureX, textureY); // Box 118
		bodyModel[112] = new ModelRendererTurbo(this, 729, 25, textureX, textureY); // Box 119
		bodyModel[113] = new ModelRendererTurbo(this, 905, 25, textureX, textureY); // Box 120
		bodyModel[114] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 121
		bodyModel[115] = new ModelRendererTurbo(this, 825, 9, textureX, textureY); // Box 122
		bodyModel[116] = new ModelRendererTurbo(this, 945, 25, textureX, textureY); // Box 123
		bodyModel[117] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 124
		bodyModel[118] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 731
		bodyModel[119] = new ModelRendererTurbo(this, 881, 153, textureX, textureY); // Box 732
		bodyModel[120] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 733
		bodyModel[121] = new ModelRendererTurbo(this, 577, 161, textureX, textureY); // Box 734
		bodyModel[122] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 746
		bodyModel[123] = new ModelRendererTurbo(this, 793, 153, textureX, textureY); // Box 754
		bodyModel[124] = new ModelRendererTurbo(this, 833, 153, textureX, textureY); // Box 755
		bodyModel[125] = new ModelRendererTurbo(this, 873, 153, textureX, textureY); // Box 756
		bodyModel[126] = new ModelRendererTurbo(this, 929, 153, textureX, textureY); // Box 757
		bodyModel[127] = new ModelRendererTurbo(this, 945, 153, textureX, textureY); // Box 758
		bodyModel[128] = new ModelRendererTurbo(this, 985, 153, textureX, textureY); // Box 759
		bodyModel[129] = new ModelRendererTurbo(this, 1001, 153, textureX, textureY); // Box 760
		bodyModel[130] = new ModelRendererTurbo(this, 49, 161, textureX, textureY); // Box 761
		bodyModel[131] = new ModelRendererTurbo(this, 65, 161, textureX, textureY); // Box 762
		bodyModel[132] = new ModelRendererTurbo(this, 81, 161, textureX, textureY); // Box 763
		bodyModel[133] = new ModelRendererTurbo(this, 97, 161, textureX, textureY); // Box 768
		bodyModel[134] = new ModelRendererTurbo(this, 137, 161, textureX, textureY); // Box 769
		bodyModel[135] = new ModelRendererTurbo(this, 177, 161, textureX, textureY); // Box 774
		bodyModel[136] = new ModelRendererTurbo(this, 217, 161, textureX, textureY); // Box 775
		bodyModel[137] = new ModelRendererTurbo(this, 257, 161, textureX, textureY); // Box 780
		bodyModel[138] = new ModelRendererTurbo(this, 273, 161, textureX, textureY); // Box 781
		bodyModel[139] = new ModelRendererTurbo(this, 289, 161, textureX, textureY); // Box 782
		bodyModel[140] = new ModelRendererTurbo(this, 305, 161, textureX, textureY); // Box 785
		bodyModel[141] = new ModelRendererTurbo(this, 25, 201, textureX, textureY); // Box 944
		bodyModel[142] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 945
		bodyModel[143] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 946
		bodyModel[144] = new ModelRendererTurbo(this, 993, 193, textureX, textureY); // Box 947
		bodyModel[145] = new ModelRendererTurbo(this, 57, 201, textureX, textureY); // Box 948
		bodyModel[146] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 949
		bodyModel[147] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 950
		bodyModel[148] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 951
		bodyModel[149] = new ModelRendererTurbo(this, 81, 201, textureX, textureY); // Box 952
		bodyModel[150] = new ModelRendererTurbo(this, 105, 201, textureX, textureY); // Box 953
		bodyModel[151] = new ModelRendererTurbo(this, 129, 201, textureX, textureY); // Box 954
		bodyModel[152] = new ModelRendererTurbo(this, 153, 201, textureX, textureY); // Box 955
		bodyModel[153] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 956
		bodyModel[154] = new ModelRendererTurbo(this, 185, 201, textureX, textureY); // Box 957
		bodyModel[155] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 958
		bodyModel[156] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 959
		bodyModel[157] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 960
		bodyModel[158] = new ModelRendererTurbo(this, 209, 201, textureX, textureY); // Box 961
		bodyModel[159] = new ModelRendererTurbo(this, 297, 201, textureX, textureY); // Box 967
		bodyModel[160] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 968
		bodyModel[161] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 969
		bodyModel[162] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 970
		bodyModel[163] = new ModelRendererTurbo(this, 321, 201, textureX, textureY); // Box 971
		bodyModel[164] = new ModelRendererTurbo(this, 601, 201, textureX, textureY); // Box 1024
		bodyModel[165] = new ModelRendererTurbo(this, 137, 209, textureX, textureY); // Box 1025
		bodyModel[166] = new ModelRendererTurbo(this, 337, 209, textureX, textureY); // Box 1026
		bodyModel[167] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 1029
		bodyModel[168] = new ModelRendererTurbo(this, 193, 217, textureX, textureY); // Box 1031
		bodyModel[169] = new ModelRendererTurbo(this, 393, 217, textureX, textureY); // Box 1032
		bodyModel[170] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 1035
		bodyModel[171] = new ModelRendererTurbo(this, 833, 201, textureX, textureY); // Box 1036
		bodyModel[172] = new ModelRendererTurbo(this, 905, 201, textureX, textureY); // Box 1037
		bodyModel[173] = new ModelRendererTurbo(this, 393, 225, textureX, textureY); // Box 1038
		bodyModel[174] = new ModelRendererTurbo(this, 833, 217, textureX, textureY); // Box 1039
		bodyModel[175] = new ModelRendererTurbo(this, 905, 225, textureX, textureY); // Box 1040
		bodyModel[176] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 1041
		bodyModel[177] = new ModelRendererTurbo(this, 977, 201, textureX, textureY); // Box 1043
		bodyModel[178] = new ModelRendererTurbo(this, 593, 209, textureX, textureY); // Box 1044
		bodyModel[179] = new ModelRendererTurbo(this, 97, 233, textureX, textureY); // Box 1045
		bodyModel[180] = new ModelRendererTurbo(this, 185, 233, textureX, textureY); // Box 1046
		bodyModel[181] = new ModelRendererTurbo(this, 185, 241, textureX, textureY); // Box 1047
		bodyModel[182] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1048
		bodyModel[183] = new ModelRendererTurbo(this, 809, 113, textureX, textureY); // Box 1050
		bodyModel[184] = new ModelRendererTurbo(this, 857, 129, textureX, textureY); // Box 1052
		bodyModel[185] = new ModelRendererTurbo(this, 961, 225, textureX, textureY); // Box 1053
		bodyModel[186] = new ModelRendererTurbo(this, 289, 233, textureX, textureY); // Box 1054
		bodyModel[187] = new ModelRendererTurbo(this, 889, 201, textureX, textureY); // Box 1055
		bodyModel[188] = new ModelRendererTurbo(this, 993, 209, textureX, textureY); // Box 1056
		bodyModel[189] = new ModelRendererTurbo(this, 833, 217, textureX, textureY); // Box 1057
		bodyModel[190] = new ModelRendererTurbo(this, 337, 241, textureX, textureY); // Box 1058
		bodyModel[191] = new ModelRendererTurbo(this, 505, 241, textureX, textureY); // Box 1059
		bodyModel[192] = new ModelRendererTurbo(this, 609, 217, textureX, textureY); // Box 1060
		bodyModel[193] = new ModelRendererTurbo(this, 665, 241, textureX, textureY); // Box 1061
		bodyModel[194] = new ModelRendererTurbo(this, 905, 217, textureX, textureY); // Box 1062
		bodyModel[195] = new ModelRendererTurbo(this, 489, 241, textureX, textureY); // Box 1063
		bodyModel[196] = new ModelRendererTurbo(this, 721, 241, textureX, textureY); // Box 1064
		bodyModel[197] = new ModelRendererTurbo(this, 753, 241, textureX, textureY); // Box 1065
		bodyModel[198] = new ModelRendererTurbo(this, 849, 9, textureX, textureY); // Box 1066
		bodyModel[199] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 1067
		bodyModel[200] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 1068
		bodyModel[201] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 1069
		bodyModel[202] = new ModelRendererTurbo(this, 713, 25, textureX, textureY); // Box 1084
		bodyModel[203] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 1085
		bodyModel[204] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 1086
		bodyModel[205] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 1087
		bodyModel[206] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 1088
		bodyModel[207] = new ModelRendererTurbo(this, 673, 33, textureX, textureY); // Box 1089
		bodyModel[208] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 1091
		bodyModel[209] = new ModelRendererTurbo(this, 761, 33, textureX, textureY); // Box 1092
		bodyModel[210] = new ModelRendererTurbo(this, 1017, 25, textureX, textureY); // Box 1093
		bodyModel[211] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 1094
		bodyModel[212] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 1095
		bodyModel[213] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 1096
		bodyModel[214] = new ModelRendererTurbo(this, 577, 161, textureX, textureY); // Box 1097
		bodyModel[215] = new ModelRendererTurbo(this, 961, 201, textureX, textureY); // Box 1098
		bodyModel[216] = new ModelRendererTurbo(this, 769, 241, textureX, textureY); // Box 1099
		bodyModel[217] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 1100
		bodyModel[218] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 1101
		bodyModel[219] = new ModelRendererTurbo(this, 217, 249, textureX, textureY); // Box 1102
		bodyModel[220] = new ModelRendererTurbo(this, 809, 193, textureX, textureY); // Box 1103
		bodyModel[221] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 1120
		bodyModel[222] = new ModelRendererTurbo(this, 537, 209, textureX, textureY); // Box 1121
		bodyModel[223] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 0
		bodyModel[224] = new ModelRendererTurbo(this, 1017, 97, textureX, textureY); // Box 1
		bodyModel[225] = new ModelRendererTurbo(this, 1017, 113, textureX, textureY); // Box 2
		bodyModel[226] = new ModelRendererTurbo(this, 785, 121, textureX, textureY); // Box 3
		bodyModel[227] = new ModelRendererTurbo(this, 841, 121, textureX, textureY); // Box 4
		bodyModel[228] = new ModelRendererTurbo(this, 137, 129, textureX, textureY); // Box 5
		bodyModel[229] = new ModelRendererTurbo(this, 1017, 129, textureX, textureY); // Box 6
		bodyModel[230] = new ModelRendererTurbo(this, 441, 137, textureX, textureY); // Box 7
		bodyModel[231] = new ModelRendererTurbo(this, 769, 137, textureX, textureY); // Box 8
		bodyModel[232] = new ModelRendererTurbo(this, 985, 137, textureX, textureY); // Box 9
		bodyModel[233] = new ModelRendererTurbo(this, 873, 145, textureX, textureY); // Box 10
		bodyModel[234] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 11
		bodyModel[235] = new ModelRendererTurbo(this, 809, 161, textureX, textureY); // Box 12
		bodyModel[236] = new ModelRendererTurbo(this, 1017, 161, textureX, textureY); // Box 13
		bodyModel[237] = new ModelRendererTurbo(this, 913, 169, textureX, textureY); // Box 14
		bodyModel[238] = new ModelRendererTurbo(this, 1017, 169, textureX, textureY); // Box 15
		bodyModel[239] = new ModelRendererTurbo(this, 33, 177, textureX, textureY); // Box 16
		bodyModel[240] = new ModelRendererTurbo(this, 633, 177, textureX, textureY); // Box 17
		bodyModel[241] = new ModelRendererTurbo(this, 641, 177, textureX, textureY); // Box 18
		bodyModel[242] = new ModelRendererTurbo(this, 649, 177, textureX, textureY); // Box 19
		bodyModel[243] = new ModelRendererTurbo(this, 665, 177, textureX, textureY); // Box 20
		bodyModel[244] = new ModelRendererTurbo(this, 673, 177, textureX, textureY); // Box 21
		bodyModel[245] = new ModelRendererTurbo(this, 681, 177, textureX, textureY); // Box 22
		bodyModel[246] = new ModelRendererTurbo(this, 697, 177, textureX, textureY); // Box 23
		bodyModel[247] = new ModelRendererTurbo(this, 705, 177, textureX, textureY); // Box 24
		bodyModel[248] = new ModelRendererTurbo(this, 713, 177, textureX, textureY); // Box 25
		bodyModel[249] = new ModelRendererTurbo(this, 729, 177, textureX, textureY); // Box 26
		bodyModel[250] = new ModelRendererTurbo(this, 737, 177, textureX, textureY); // Box 27
		bodyModel[251] = new ModelRendererTurbo(this, 745, 177, textureX, textureY); // Box 28
		bodyModel[252] = new ModelRendererTurbo(this, 761, 177, textureX, textureY); // Box 29
		bodyModel[253] = new ModelRendererTurbo(this, 769, 177, textureX, textureY); // Box 33
		bodyModel[254] = new ModelRendererTurbo(this, 777, 177, textureX, textureY); // Box 34
		bodyModel[255] = new ModelRendererTurbo(this, 793, 177, textureX, textureY); // Box 35
		bodyModel[256] = new ModelRendererTurbo(this, 833, 177, textureX, textureY); // Box 36
		bodyModel[257] = new ModelRendererTurbo(this, 841, 177, textureX, textureY); // Box 37
		bodyModel[258] = new ModelRendererTurbo(this, 849, 177, textureX, textureY); // Box 38
		bodyModel[259] = new ModelRendererTurbo(this, 929, 177, textureX, textureY); // Box 39
		bodyModel[260] = new ModelRendererTurbo(this, 1001, 177, textureX, textureY); // Box 40
		bodyModel[261] = new ModelRendererTurbo(this, 1009, 177, textureX, textureY); // Box 41
		bodyModel[262] = new ModelRendererTurbo(this, 1017, 177, textureX, textureY); // Box 42
		bodyModel[263] = new ModelRendererTurbo(this, 241, 185, textureX, textureY); // Box 43
		bodyModel[264] = new ModelRendererTurbo(this, 249, 185, textureX, textureY); // Box 44
		bodyModel[265] = new ModelRendererTurbo(this, 265, 185, textureX, textureY); // Box 45
		bodyModel[266] = new ModelRendererTurbo(this, 273, 185, textureX, textureY); // Box 46
		bodyModel[267] = new ModelRendererTurbo(this, 281, 185, textureX, textureY); // Box 47
		bodyModel[268] = new ModelRendererTurbo(this, 329, 185, textureX, textureY); // Box 48
		bodyModel[269] = new ModelRendererTurbo(this, 337, 185, textureX, textureY); // Box 49
		bodyModel[270] = new ModelRendererTurbo(this, 353, 185, textureX, textureY); // Box 50
		bodyModel[271] = new ModelRendererTurbo(this, 361, 185, textureX, textureY); // Box 51
		bodyModel[272] = new ModelRendererTurbo(this, 369, 185, textureX, textureY); // Box 52
		bodyModel[273] = new ModelRendererTurbo(this, 809, 185, textureX, textureY); // Box 53
		bodyModel[274] = new ModelRendererTurbo(this, 945, 185, textureX, textureY); // Box 54
		bodyModel[275] = new ModelRendererTurbo(this, 1017, 185, textureX, textureY); // Box 55
		bodyModel[276] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 56
		bodyModel[277] = new ModelRendererTurbo(this, 401, 193, textureX, textureY); // Box 57
		bodyModel[278] = new ModelRendererTurbo(this, 409, 193, textureX, textureY); // Box 58
		bodyModel[279] = new ModelRendererTurbo(this, 417, 193, textureX, textureY); // Box 59
		bodyModel[280] = new ModelRendererTurbo(this, 433, 193, textureX, textureY); // Box 60
		bodyModel[281] = new ModelRendererTurbo(this, 441, 193, textureX, textureY); // Box 61
		bodyModel[282] = new ModelRendererTurbo(this, 449, 193, textureX, textureY); // Box 62
		bodyModel[283] = new ModelRendererTurbo(this, 465, 193, textureX, textureY); // Box 63
		bodyModel[284] = new ModelRendererTurbo(this, 473, 193, textureX, textureY); // Box 64
		bodyModel[285] = new ModelRendererTurbo(this, 481, 193, textureX, textureY); // Box 65
		bodyModel[286] = new ModelRendererTurbo(this, 497, 193, textureX, textureY); // Box 66
		bodyModel[287] = new ModelRendererTurbo(this, 505, 193, textureX, textureY); // Box 67
		bodyModel[288] = new ModelRendererTurbo(this, 513, 193, textureX, textureY); // Box 68
		bodyModel[289] = new ModelRendererTurbo(this, 561, 193, textureX, textureY); // Box 69
		bodyModel[290] = new ModelRendererTurbo(this, 569, 193, textureX, textureY); // Box 70
		bodyModel[291] = new ModelRendererTurbo(this, 585, 193, textureX, textureY); // Box 71
		bodyModel[292] = new ModelRendererTurbo(this, 593, 193, textureX, textureY); // Box 74
		bodyModel[293] = new ModelRendererTurbo(this, 601, 193, textureX, textureY); // Box 75
		bodyModel[294] = new ModelRendererTurbo(this, 617, 193, textureX, textureY); // Box 76
		bodyModel[295] = new ModelRendererTurbo(this, 337, 233, textureX, textureY); // Box 1275
		bodyModel[296] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 1276
		bodyModel[297] = new ModelRendererTurbo(this, 953, 217, textureX, textureY); // Box 0
		bodyModel[298] = new ModelRendererTurbo(this, 1009, 217, textureX, textureY); // Box 1
		bodyModel[299] = new ModelRendererTurbo(this, 849, 225, textureX, textureY); // Box 2
		bodyModel[300] = new ModelRendererTurbo(this, 961, 225, textureX, textureY); // Box 3
		bodyModel[301] = new ModelRendererTurbo(this, 1009, 225, textureX, textureY); // Box 4
		bodyModel[302] = new ModelRendererTurbo(this, 89, 233, textureX, textureY); // Box 5
		bodyModel[303] = new ModelRendererTurbo(this, 385, 233, textureX, textureY); // Box 6
		bodyModel[304] = new ModelRendererTurbo(this, 961, 233, textureX, textureY); // Box 7
		bodyModel[305] = new ModelRendererTurbo(this, 1009, 233, textureX, textureY); // Box 8
		bodyModel[306] = new ModelRendererTurbo(this, 89, 241, textureX, textureY); // Box 9
		bodyModel[307] = new ModelRendererTurbo(this, 705, 241, textureX, textureY); // Box 10
		bodyModel[308] = new ModelRendererTurbo(this, 737, 241, textureX, textureY); // Box 11
		bodyModel[309] = new ModelRendererTurbo(this, 833, 241, textureX, textureY); // Box 12
		bodyModel[310] = new ModelRendererTurbo(this, 849, 241, textureX, textureY); // Box 13
		bodyModel[311] = new ModelRendererTurbo(this, 217, 249, textureX, textureY); // Box 18
		bodyModel[312] = new ModelRendererTurbo(this, 393, 249, textureX, textureY); // Box 19
		bodyModel[313] = new ModelRendererTurbo(this, 409, 249, textureX, textureY); // Box 20
		bodyModel[314] = new ModelRendererTurbo(this, 425, 249, textureX, textureY); // Box 21
		bodyModel[315] = new ModelRendererTurbo(this, 441, 249, textureX, textureY); // Box 22
		bodyModel[316] = new ModelRendererTurbo(this, 457, 249, textureX, textureY); // Box 23
		bodyModel[317] = new ModelRendererTurbo(this, 473, 249, textureX, textureY); // Box 24
		bodyModel[318] = new ModelRendererTurbo(this, 521, 249, textureX, textureY); // Box 25
		bodyModel[319] = new ModelRendererTurbo(this, 537, 249, textureX, textureY); // Box 26
		bodyModel[320] = new ModelRendererTurbo(this, 553, 249, textureX, textureY); // Box 31
		bodyModel[321] = new ModelRendererTurbo(this, 569, 249, textureX, textureY); // Box 32
		bodyModel[322] = new ModelRendererTurbo(this, 585, 249, textureX, textureY); // Box 33
		bodyModel[323] = new ModelRendererTurbo(this, 601, 249, textureX, textureY); // Box 34
		bodyModel[324] = new ModelRendererTurbo(this, 617, 249, textureX, textureY); // Box 35
		bodyModel[325] = new ModelRendererTurbo(this, 633, 249, textureX, textureY); // Box 36
		bodyModel[326] = new ModelRendererTurbo(this, 961, 249, textureX, textureY); // Box 37
		bodyModel[327] = new ModelRendererTurbo(this, 993, 249, textureX, textureY); // Box 38
		bodyModel[328] = new ModelRendererTurbo(this, 721, 257, textureX, textureY); // Box 39
		bodyModel[329] = new ModelRendererTurbo(this, 753, 257, textureX, textureY); // Box 40
		bodyModel[330] = new ModelRendererTurbo(this, 833, 257, textureX, textureY); // Box 41
		bodyModel[331] = new ModelRendererTurbo(this, 865, 257, textureX, textureY); // Box 42
		bodyModel[332] = new ModelRendererTurbo(this, 993, 257, textureX, textureY); // Box 43
		bodyModel[333] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 44
		bodyModel[334] = new ModelRendererTurbo(this, 457, 265, textureX, textureY); // Box 45
		bodyModel[335] = new ModelRendererTurbo(this, 721, 265, textureX, textureY); // Box 46
		bodyModel[336] = new ModelRendererTurbo(this, 753, 265, textureX, textureY); // Box 47
		bodyModel[337] = new ModelRendererTurbo(this, 833, 265, textureX, textureY); // Box 48
		bodyModel[338] = new ModelRendererTurbo(this, 865, 265, textureX, textureY); // Box 49
		bodyModel[339] = new ModelRendererTurbo(this, 897, 265, textureX, textureY); // Box 50
		bodyModel[340] = new ModelRendererTurbo(this, 929, 265, textureX, textureY); // Box 51
		bodyModel[341] = new ModelRendererTurbo(this, 889, 201, textureX, textureY); // Box 52
		bodyModel[342] = new ModelRendererTurbo(this, 961, 201, textureX, textureY); // Box 53
		bodyModel[343] = new ModelRendererTurbo(this, 1017, 201, textureX, textureY); // Box 54
		bodyModel[344] = new ModelRendererTurbo(this, 625, 209, textureX, textureY); // Box 55
		bodyModel[345] = new ModelRendererTurbo(this, 201, 217, textureX, textureY); // Box 56
		bodyModel[346] = new ModelRendererTurbo(this, 625, 217, textureX, textureY); // Box 57
		bodyModel[347] = new ModelRendererTurbo(this, 833, 217, textureX, textureY); // Box 58
		bodyModel[348] = new ModelRendererTurbo(this, 905, 217, textureX, textureY); // Box 59
		bodyModel[349] = new ModelRendererTurbo(this, 969, 217, textureX, textureY); // Box 60

		bodyModel[0].addBox(0F, 0F, 0F, 14, 1, 33, 0F); // Box 0
		bodyModel[0].setRotationPoint(34F, -12.5F, -17F);
		bodyModel[0].rotateAngleZ = -0.27925268F;

		bodyModel[1].addBox(0F, 0F, 0F, 1, 2, 33, 0F); // Box 1
		bodyModel[1].setRotationPoint(46F, -10.5F, -17F);

		bodyModel[2].addBox(0F, 0F, 0F, 11, 1, 6, 0F); // Box 2
		bodyModel[2].setRotationPoint(46F, -9F, -14.5F);
		bodyModel[2].rotateAngleZ = -0.27925268F;

		bodyModel[3].addBox(0F, 0F, 0F, 11, 1, 6, 0F); // Box 3
		bodyModel[3].setRotationPoint(46F, -9F, -3.5F);
		bodyModel[3].rotateAngleZ = -0.27925268F;

		bodyModel[4].addBox(0F, 0F, 0F, 11, 1, 6, 0F); // Box 4
		bodyModel[4].setRotationPoint(46F, -9F, 7.5F);
		bodyModel[4].rotateAngleZ = -0.27925268F;

		bodyModel[5].addBox(0F, 0F, 0F, 11, 1, 34, 0F); // Box 5
		bodyModel[5].setRotationPoint(46F, -9F, -17.5F);
		bodyModel[5].rotateAngleZ = -0.36651914F;

		bodyModel[6].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 6
		bodyModel[6].setRotationPoint(48.8F, -8.5F, -12.8F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 7
		bodyModel[7].setRotationPoint(48.8F, -10.5F, -12.3F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 8
		bodyModel[8].setRotationPoint(48.8F, -10.5F, -12.3F);
		bodyModel[8].rotateAngleZ = 1.41371669F;

		bodyModel[9].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 9
		bodyModel[9].setRotationPoint(50.3F, -10.5F, -12.3F);
		bodyModel[9].rotateAngleZ = 0.43633231F;

		bodyModel[10].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 10
		bodyModel[10].setRotationPoint(50.3F, -10.5F, 9.3F);
		bodyModel[10].rotateAngleZ = 0.43633231F;

		bodyModel[11].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 11
		bodyModel[11].setRotationPoint(48.8F, -10.5F, 9.3F);
		bodyModel[11].rotateAngleZ = 1.41371669F;

		bodyModel[12].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 12
		bodyModel[12].setRotationPoint(48.8F, -10.5F, 9.3F);

		bodyModel[13].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 13
		bodyModel[13].setRotationPoint(48.8F, -8.5F, 8.8F);

		bodyModel[14].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 14
		bodyModel[14].setRotationPoint(46.8F, -10.5F, 13.15F);

		bodyModel[15].addBox(0F, -1F, -1F, 1, 2, 2, 0F); // Box 15
		bodyModel[15].setRotationPoint(48.8F, -9.5F, 14.15F);
		bodyModel[15].rotateAngleX = 0.52359878F;

		bodyModel[16].addBox(0F, -1F, -1F, 2, 2, 2, 0F); // Box 16
		bodyModel[16].setRotationPoint(47.8F, -9.5F, 14.15F);
		bodyModel[16].rotateAngleX = 1.04719755F;

		bodyModel[17].addBox(0F, -1F, -1F, 1, 2, 2, 0F); // Box 17
		bodyModel[17].setRotationPoint(47.8F, -9.5F, 14.15F);
		bodyModel[17].rotateAngleX = 0.52359878F;

		bodyModel[18].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 18
		bodyModel[18].setRotationPoint(48.8F, -10.5F, 12F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 19
		bodyModel[19].setRotationPoint(48.8F, -10.5F, 15.3F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 21
		bodyModel[20].setRotationPoint(48.8F, -10.5F, 12.5F);
		bodyModel[20].rotateAngleX = 1.85004901F;

		bodyModel[21].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 22
		bodyModel[21].setRotationPoint(49.8F, -10.5F, 15.7F);
		bodyModel[21].rotateAngleX = 1.85004901F;
		bodyModel[21].rotateAngleY = -3.14159265F;

		bodyModel[22].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 23
		bodyModel[22].setRotationPoint(48.8F, -10.5F, -17F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 24
		bodyModel[23].setRotationPoint(48.8F, -10.5F, -13.7F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 25
		bodyModel[24].setRotationPoint(49.8F, -10.5F, -13.3F);
		bodyModel[24].rotateAngleX = 1.85004901F;
		bodyModel[24].rotateAngleY = -3.14159265F;

		bodyModel[25].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 26
		bodyModel[25].setRotationPoint(48.8F, -10.5F, -16.5F);
		bodyModel[25].rotateAngleX = 1.85004901F;

		bodyModel[26].addBox(0F, -1F, -1F, 2, 2, 2, 0F); // Box 27
		bodyModel[26].setRotationPoint(47.8F, -9.5F, -14.85F);
		bodyModel[26].rotateAngleX = 1.04719755F;

		bodyModel[27].addBox(0F, -1F, -1F, 1, 2, 2, 0F); // Box 28
		bodyModel[27].setRotationPoint(48.8F, -9.5F, -14.85F);
		bodyModel[27].rotateAngleX = 0.52359878F;

		bodyModel[28].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 29
		bodyModel[28].setRotationPoint(46.8F, -10.5F, -15.85F);

		bodyModel[29].addBox(0F, -1F, -1F, 1, 2, 2, 0F); // Box 30
		bodyModel[29].setRotationPoint(47.8F, -9.5F, -14.85F);
		bodyModel[29].rotateAngleX = 0.52359878F;

		bodyModel[30].addBox(0F, 0F, 0F, 5, 1, 34, 0F); // Box 31
		bodyModel[30].setRotationPoint(54.7F, -5F, -17.5F);
		bodyModel[30].rotateAngleZ = -2.36492114F;

		bodyModel[31].addBox(-1.5F, 0F, 0F, 8, 1, 34, 0F); // Box 32
		bodyModel[31].setRotationPoint(51F, -1F, -17.5F);
		bodyModel[31].rotateAngleZ = -2.36492114F;

		bodyModel[32].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 33
		bodyModel[32].setRotationPoint(55.2F, -4F, -15.3F);
		bodyModel[32].rotateAngleZ = -2.39982772F;

		bodyModel[33].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 34
		bodyModel[33].setRotationPoint(55.2F, -4F, -7F);
		bodyModel[33].rotateAngleZ = -2.39982772F;

		bodyModel[34].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 35
		bodyModel[34].setRotationPoint(55.2F, -4F, -2.9F);
		bodyModel[34].rotateAngleZ = -2.39982772F;

		bodyModel[35].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 36
		bodyModel[35].setRotationPoint(55.2F, -4F, 1.1F);
		bodyModel[35].rotateAngleZ = -2.39982772F;

		bodyModel[36].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 37
		bodyModel[36].setRotationPoint(55.2F, -4F, 5.1F);
		bodyModel[36].rotateAngleZ = -2.39982772F;

		bodyModel[37].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 38
		bodyModel[37].setRotationPoint(50.2F, 1F, 9F);
		bodyModel[37].rotateAngleZ = -2.39982772F;

		bodyModel[38].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 39
		bodyModel[38].setRotationPoint(50.2F, 1F, 2.1F);
		bodyModel[38].rotateAngleZ = -2.39982772F;

		bodyModel[39].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 40
		bodyModel[39].setRotationPoint(50.2F, 1F, -5.4F);
		bodyModel[39].rotateAngleZ = -2.39982772F;

		bodyModel[40].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 41
		bodyModel[40].setRotationPoint(50.2F, 1F, -12.4F);
		bodyModel[40].rotateAngleZ = -2.39982772F;

		bodyModel[41].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 42
		bodyModel[41].setRotationPoint(55.2F, -4F, 13.5F);
		bodyModel[41].rotateAngleZ = -2.39982772F;

		bodyModel[42].addBox(-0.5F, -3F, 0F, 1, 3, 2, 0F); // Box 43
		bodyModel[42].setRotationPoint(53F, -3F, 17.5F);

		bodyModel[43].addBox(-0.5F, -3F, 0F, 1, 3, 2, 0F); // Box 44
		bodyModel[43].setRotationPoint(53F, -3F, 17.5F);
		bodyModel[43].rotateAngleZ = 0.34906585F;

		bodyModel[44].addBox(-0.5F, -3F, 0F, 1, 3, 2, 0F); // Box 45
		bodyModel[44].setRotationPoint(53F, -3F, 17.5F);
		bodyModel[44].rotateAngleZ = 1.04719755F;

		bodyModel[45].addBox(-0.5F, -3F, 0F, 1, 3, 2, 0F); // Box 46
		bodyModel[45].setRotationPoint(53F, -3F, 17.5F);
		bodyModel[45].rotateAngleZ = 0.6981317F;

		bodyModel[46].addBox(-0.5F, -3F, 0F, 1, 3, 2, 0F); // Box 47
		bodyModel[46].setRotationPoint(53F, -3F, 17.5F);
		bodyModel[46].rotateAngleZ = 2.44346095F;

		bodyModel[47].addBox(-0.5F, -3F, 0F, 1, 3, 2, 0F); // Box 48
		bodyModel[47].setRotationPoint(53F, -3F, 17.5F);
		bodyModel[47].rotateAngleZ = 2.0943951F;

		bodyModel[48].addBox(-0.5F, -3F, 0F, 1, 3, 2, 0F); // Box 49
		bodyModel[48].setRotationPoint(53F, -3F, 17.5F);
		bodyModel[48].rotateAngleZ = 1.3962634F;

		bodyModel[49].addBox(-0.5F, -3F, 0F, 1, 3, 2, 0F); // Box 50
		bodyModel[49].setRotationPoint(53F, -3F, 17.5F);
		bodyModel[49].rotateAngleZ = 1.74532925F;

		bodyModel[50].addBox(-0.5F, -3F, 0F, 1, 3, 2, 0F); // Box 51
		bodyModel[50].setRotationPoint(53F, -3F, 17.5F);
		bodyModel[50].rotateAngleZ = 5.23598776F;

		bodyModel[51].addBox(-0.5F, -3F, 0F, 1, 3, 2, 0F); // Box 52
		bodyModel[51].setRotationPoint(53F, -3F, 17.5F);
		bodyModel[51].rotateAngleZ = 4.88692191F;

		bodyModel[52].addBox(-0.5F, -3F, 0F, 1, 3, 2, 0F); // Box 53
		bodyModel[52].setRotationPoint(53F, -3F, 17.5F);
		bodyModel[52].rotateAngleZ = 4.1887902F;

		bodyModel[53].addBox(-0.5F, -3F, 0F, 1, 3, 2, 0F); // Box 54
		bodyModel[53].setRotationPoint(53F, -3F, 17.5F);
		bodyModel[53].rotateAngleZ = 4.53785606F;

		bodyModel[54].addBox(-0.5F, -3F, 0F, 1, 3, 2, 0F); // Box 55
		bodyModel[54].setRotationPoint(53F, -3F, 17.5F);
		bodyModel[54].rotateAngleZ = 2.7925268F;

		bodyModel[55].addBox(-0.5F, -3F, 0F, 1, 3, 2, 0F); // Box 56
		bodyModel[55].setRotationPoint(53F, -3F, 17.5F);
		bodyModel[55].rotateAngleZ = 3.14159265F;

		bodyModel[56].addBox(-0.5F, -3F, 0F, 1, 3, 2, 0F); // Box 57
		bodyModel[56].setRotationPoint(53F, -3F, 17.5F);
		bodyModel[56].rotateAngleZ = 3.4906585F;

		bodyModel[57].addBox(-0.5F, -3F, 0F, 1, 3, 2, 0F); // Box 58
		bodyModel[57].setRotationPoint(53F, -3F, 17.5F);
		bodyModel[57].rotateAngleZ = 3.83972435F;

		bodyModel[58].addBox(-0.5F, -3F, 0F, 1, 3, 2, 0F); // Box 59
		bodyModel[58].setRotationPoint(53F, -3F, 17.5F);
		bodyModel[58].rotateAngleZ = -0.6981317F;

		bodyModel[59].addBox(-0.5F, -3F, 0F, 1, 3, 2, 0F); // Box 60
		bodyModel[59].setRotationPoint(53F, -3F, 17.5F);
		bodyModel[59].rotateAngleZ = -0.34906585F;

		bodyModel[60].addBox(-0.5F, -3F, 0F, 1, 3, 2, 0F); // Box 61
		bodyModel[60].setRotationPoint(53F, -3F, -20.2F);
		bodyModel[60].rotateAngleZ = 4.53785606F;

		bodyModel[61].addBox(-0.5F, -3F, 0F, 1, 3, 2, 0F); // Box 62
		bodyModel[61].setRotationPoint(53F, -3F, -20.2F);
		bodyModel[61].rotateAngleZ = 4.88692191F;

		bodyModel[62].addBox(-0.5F, -3F, 0F, 1, 3, 2, 0F); // Box 63
		bodyModel[62].setRotationPoint(53F, -3F, -20.2F);
		bodyModel[62].rotateAngleZ = 5.23598776F;

		bodyModel[63].addBox(-0.5F, -3F, 0F, 1, 3, 2, 0F); // Box 64
		bodyModel[63].setRotationPoint(53F, -3F, -20.2F);
		bodyModel[63].rotateAngleZ = -0.6981317F;

		bodyModel[64].addBox(-0.5F, -3F, 0F, 1, 3, 2, 0F); // Box 65
		bodyModel[64].setRotationPoint(53F, -3F, -20.2F);
		bodyModel[64].rotateAngleZ = -0.34906585F;

		bodyModel[65].addBox(-0.5F, -3F, 0F, 1, 3, 2, 0F); // Box 66
		bodyModel[65].setRotationPoint(53F, -3F, -20.2F);

		bodyModel[66].addBox(-0.5F, -3F, 0F, 1, 3, 2, 0F); // Box 67
		bodyModel[66].setRotationPoint(53F, -3F, -20.2F);
		bodyModel[66].rotateAngleZ = 0.34906585F;

		bodyModel[67].addBox(-0.5F, -3F, 0F, 1, 3, 2, 0F); // Box 68
		bodyModel[67].setRotationPoint(53F, -3F, -20.2F);
		bodyModel[67].rotateAngleZ = 0.6981317F;

		bodyModel[68].addBox(-0.5F, -3F, 0F, 1, 3, 2, 0F); // Box 69
		bodyModel[68].setRotationPoint(53F, -3F, -20.2F);
		bodyModel[68].rotateAngleZ = 1.04719755F;

		bodyModel[69].addBox(-0.5F, -3F, 0F, 1, 3, 2, 0F); // Box 70
		bodyModel[69].setRotationPoint(53F, -3F, -20.2F);
		bodyModel[69].rotateAngleZ = 1.3962634F;

		bodyModel[70].addBox(-0.5F, -3F, 0F, 1, 3, 2, 0F); // Box 71
		bodyModel[70].setRotationPoint(53F, -3F, -20.2F);
		bodyModel[70].rotateAngleZ = 1.74532925F;

		bodyModel[71].addBox(-0.5F, -3F, 0F, 1, 3, 2, 0F); // Box 72
		bodyModel[71].setRotationPoint(53F, -3F, -20.2F);
		bodyModel[71].rotateAngleZ = 2.0943951F;

		bodyModel[72].addBox(-0.5F, -3F, 0F, 1, 3, 2, 0F); // Box 73
		bodyModel[72].setRotationPoint(53F, -3F, -20.2F);
		bodyModel[72].rotateAngleZ = 2.44346095F;

		bodyModel[73].addBox(-0.5F, -3F, 0F, 1, 3, 2, 0F); // Box 74
		bodyModel[73].setRotationPoint(53F, -3F, -20.2F);
		bodyModel[73].rotateAngleZ = 2.7925268F;

		bodyModel[74].addBox(-0.5F, -3F, 0F, 1, 3, 2, 0F); // Box 75
		bodyModel[74].setRotationPoint(53F, -3F, -20.2F);
		bodyModel[74].rotateAngleZ = 3.14159265F;

		bodyModel[75].addBox(-0.5F, -3F, 0F, 1, 3, 2, 0F); // Box 76
		bodyModel[75].setRotationPoint(53F, -3F, -20.2F);
		bodyModel[75].rotateAngleZ = 3.4906585F;

		bodyModel[76].addBox(-0.5F, -3F, 0F, 1, 3, 2, 0F); // Box 77
		bodyModel[76].setRotationPoint(53F, -3F, -20.2F);
		bodyModel[76].rotateAngleZ = 3.83972435F;

		bodyModel[77].addBox(-0.5F, -3F, 0F, 1, 3, 2, 0F); // Box 78
		bodyModel[77].setRotationPoint(53F, -3F, -20.2F);
		bodyModel[77].rotateAngleZ = 4.1887902F;

		bodyModel[78].addBox(0F, 0F, 0F, 17, 1, 10, 0F); // Box 79
		bodyModel[78].setRotationPoint(29F, -14.7F, -29F);
		bodyModel[78].rotateAngleZ = -0.10471976F;

		bodyModel[79].addBox(0F, 0F, 0F, 13, 1, 9, 0F); // Box 80
		bodyModel[79].setRotationPoint(3F, -5F, -32F);
		bodyModel[79].rotateAngleX = 1.65806279F;

		bodyModel[80].addBox(0F, 0F, 0F, 55, 1, 10, 0F); // Box 81
		bodyModel[80].setRotationPoint(-25F, -15.7F, -29F);
		bodyModel[80].rotateAngleZ = -0.01745329F;

		bodyModel[81].addBox(0F, 0F, 0F, 13, 1, 9, 0F); // Box 82
		bodyModel[81].setRotationPoint(17F, -4F, -32F);
		bodyModel[81].rotateAngleX = 1.65806279F;

		bodyModel[82].addBox(0F, 0F, 0F, 13, 1, 9, 0F); // Box 83
		bodyModel[82].setRotationPoint(30F, -3F, -32F);
		bodyModel[82].rotateAngleX = 1.65806279F;

		bodyModel[83].addBox(0F, 0F, 0F, 10, 1, 9, 0F); // Box 84
		bodyModel[83].setRotationPoint(42F, -3F, -32F);
		bodyModel[83].rotateAngleX = 1.55334303F;

		bodyModel[84].addBox(0F, 0F, 0F, 10, 1, 9, 0F); // Box 85
		bodyModel[84].setRotationPoint(42F, -3F, 30.5F);
		bodyModel[84].rotateAngleX = 1.57079633F;

		bodyModel[85].addBox(0F, 0F, 0F, 13, 1, 9, 0F); // Box 86
		bodyModel[85].setRotationPoint(3F, -5F, 30.5F);
		bodyModel[85].rotateAngleX = 1.48352986F;

		bodyModel[86].addBox(0F, 0F, 0F, 13, 1, 9, 0F); // Box 87
		bodyModel[86].setRotationPoint(17F, -4F, 30.5F);
		bodyModel[86].rotateAngleX = 1.48352986F;

		bodyModel[87].addBox(0F, 0F, 0F, 13, 1, 9, 0F); // Box 88
		bodyModel[87].setRotationPoint(30F, -3F, 30.5F);
		bodyModel[87].rotateAngleX = 1.48352986F;

		bodyModel[88].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 89
		bodyModel[88].setRotationPoint(30.5F, -12.4F, 29.5F);

		bodyModel[89].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 90
		bodyModel[89].setRotationPoint(40.5F, -12.4F, 29.5F);

		bodyModel[90].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 91
		bodyModel[90].setRotationPoint(27.5F, -12.4F, 29.5F);

		bodyModel[91].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 92
		bodyModel[91].setRotationPoint(17.5F, -12.4F, 29.5F);

		bodyModel[92].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 93
		bodyModel[92].setRotationPoint(13.5F, -11.4F, 29.5F);

		bodyModel[93].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 94
		bodyModel[93].setRotationPoint(1.5F, -11.4F, 29.5F);

		bodyModel[94].addBox(0F, 0F, 0F, 16, 1, 10, 0F); // Box 96
		bodyModel[94].setRotationPoint(45F, -13F, -29F);
		bodyModel[94].rotateAngleZ = -0.13962634F;

		bodyModel[95].addBox(0F, 0F, 0F, 16, 1, 10, 0F); // Box 97
		bodyModel[95].setRotationPoint(45F, -13F, 18.9F);
		bodyModel[95].rotateAngleZ = -0.13962634F;

		bodyModel[96].addBox(0F, 0F, 0F, 17, 1, 10, 0F); // Box 98
		bodyModel[96].setRotationPoint(29F, -14.7F, 18.5F);
		bodyModel[96].rotateAngleZ = -0.10471976F;

		bodyModel[97].addBox(0F, 0F, 0F, 55, 1, 10, 0F); // Box 99
		bodyModel[97].setRotationPoint(-25F, -15.7F, 18.5F);
		bodyModel[97].rotateAngleZ = -0.01745329F;

		bodyModel[98].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 100
		bodyModel[98].setRotationPoint(30.5F, -12.4F, -32F);

		bodyModel[99].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 101
		bodyModel[99].setRotationPoint(40.5F, -12.4F, -32F);

		bodyModel[100].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 102
		bodyModel[100].setRotationPoint(27.5F, -12.4F, -32F);

		bodyModel[101].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 103
		bodyModel[101].setRotationPoint(17.5F, -12.4F, -32F);

		bodyModel[102].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 104
		bodyModel[102].setRotationPoint(13.5F, -11.4F, -32F);

		bodyModel[103].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 105
		bodyModel[103].setRotationPoint(1.5F, -11.4F, -32F);

		bodyModel[104].addBox(0F, 0F, 0F, 4, 1, 10, 0F); // Box 106
		bodyModel[104].setRotationPoint(60F, -11F, -29F);
		bodyModel[104].rotateAngleZ = -0.61086524F;

		bodyModel[105].addBox(0F, 0F, 0F, 55, 1, 3, 0F); // Box 109
		bodyModel[105].setRotationPoint(-25F, -12F, -29F);
		bodyModel[105].rotateAngleX = 1.65806279F;
		bodyModel[105].rotateAngleZ = -0.01745329F;

		bodyModel[106].addShapeBox(0F, 0F, 0F, 22, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[106].setRotationPoint(29F, -12F, -29F);
		bodyModel[106].rotateAngleX = 1.65806279F;
		bodyModel[106].rotateAngleZ = -0.08726646F;

		bodyModel[107].addBox(0F, 0F, 0F, 55, 1, 3, 0F); // Box 113
		bodyModel[107].setRotationPoint(-25F, -12F, 27F);
		bodyModel[107].rotateAngleX = 1.50098316F;
		bodyModel[107].rotateAngleZ = -0.01745329F;

		bodyModel[108].addShapeBox(0F, 0F, 0F, 22, 1, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[108].setRotationPoint(29F, -11F, 28F);
		bodyModel[108].rotateAngleX = 1.57079633F;
		bodyModel[108].rotateAngleZ = -0.08726646F;

		bodyModel[109].addBox(0F, 0F, 0F, 78, 1, 3, 0F); // Box 115
		bodyModel[109].setRotationPoint(-26F, -12F, -31F);
		bodyModel[109].rotateAngleX = 0.33161256F;
		bodyModel[109].rotateAngleZ = -0.01745329F;

		bodyModel[110].addBox(0F, 0F, 0F, 78, 1, 3, 0F); // Box 116
		bodyModel[110].setRotationPoint(-26F, -12F, 28F);
		bodyModel[110].rotateAngleX = -0.33161256F;
		bodyModel[110].rotateAngleZ = -0.01745329F;

		bodyModel[111].addBox(-6F, 0F, 0F, 8, 1, 12, 0F); // Box 118
		bodyModel[111].setRotationPoint(34F, -12.5F, -17F);
		bodyModel[111].rotateAngleZ = -0.2443461F;

		bodyModel[112].addBox(-6F, 0F, 0F, 8, 1, 12, 0F); // Box 119
		bodyModel[112].setRotationPoint(34F, -12.5F, 4F);
		bodyModel[112].rotateAngleZ = -0.2443461F;

		bodyModel[113].addBox(-6F, 0F, 0F, 8, 1, 9, 0F); // Box 120
		bodyModel[113].setRotationPoint(34F, -12.5F, -5F);
		bodyModel[113].rotateAngleZ = -0.05235988F;

		bodyModel[114].addBox(-6F, 0F, 0F, 8, 2, 6, 0F); // Box 121
		bodyModel[114].setRotationPoint(29.6F, -14F, -3.4F);
		bodyModel[114].rotateAngleZ = -0.05235988F;

		bodyModel[115].addBox(-6F, 0F, 0F, 7, 1, 6, 0F); // Box 122
		bodyModel[115].setRotationPoint(27.6F, -14.5F, -3.4F);

		bodyModel[116].addBox(-4F, 0F, 0F, 5, 1, 10, 0F); // Box 123
		bodyModel[116].setRotationPoint(26.6F, -14.5F, -5.4F);

		bodyModel[117].addBox(-5F, 0F, 0F, 6, 1, 8, 0F); // Box 124
		bodyModel[117].setRotationPoint(27F, -14.5F, -4.4F);

		bodyModel[118].addBox(0F, 0F, 0F, 84, 1, 9, 0F); // Box 731
		bodyModel[118].setRotationPoint(-43F, -3F, -32F);
		bodyModel[118].rotateAngleX = 1.50098316F;

		bodyModel[119].addShapeBox(0F, 0F, 0F, 18, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 2F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 2F, 1F, 0F, -1F); // Box 732
		bodyModel[119].setRotationPoint(-58.5F, -5F, -32F);
		bodyModel[119].rotateAngleX = 1.50098316F;
		bodyModel[119].rotateAngleZ = -0.12217305F;

		bodyModel[120].addShapeBox(0F, 0F, 0F, 18, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 2F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 2F, 1F, 0F, -1F); // Box 733
		bodyModel[120].setRotationPoint(-58.5F, -5F, 30F);
		bodyModel[120].rotateAngleX = 1.6406095F;
		bodyModel[120].rotateAngleZ = -0.12217305F;

		bodyModel[121].addBox(0F, 0F, 0F, 84, 1, 9, 0F); // Box 734
		bodyModel[121].setRotationPoint(-43F, -3F, 30F);
		bodyModel[121].rotateAngleX = 1.6406095F;

		bodyModel[122].addShapeBox(0F, 0F, 0F, 0, 0, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 746
		bodyModel[122].setRotationPoint(-37.5F, 7.1F, -16F);
		bodyModel[122].rotateAngleX = 1.65806279F;

		bodyModel[123].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 754
		bodyModel[123].setRotationPoint(-3.5F, -8.4F, -32.8F);
		bodyModel[123].rotateAngleX = 1.51843645F;

		bodyModel[124].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 755
		bodyModel[124].setRotationPoint(-9.5F, -8.4F, -32.8F);
		bodyModel[124].rotateAngleX = 1.51843645F;

		bodyModel[125].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 756
		bodyModel[125].setRotationPoint(-15.5F, -8.4F, -32.8F);
		bodyModel[125].rotateAngleX = 1.51843645F;

		bodyModel[126].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 757
		bodyModel[126].setRotationPoint(-21.5F, -8.4F, -32.8F);
		bodyModel[126].rotateAngleX = 1.51843645F;

		bodyModel[127].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 758
		bodyModel[127].setRotationPoint(-27.5F, -8.4F, -32.8F);
		bodyModel[127].rotateAngleX = 1.51843645F;

		bodyModel[128].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 759
		bodyModel[128].setRotationPoint(-33.5F, -8.4F, -32.8F);
		bodyModel[128].rotateAngleX = 1.51843645F;

		bodyModel[129].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 760
		bodyModel[129].setRotationPoint(-39.5F, -8.4F, -32.8F);
		bodyModel[129].rotateAngleX = 1.51843645F;

		bodyModel[130].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 761
		bodyModel[130].setRotationPoint(-51.5F, -8.4F, -32.8F);
		bodyModel[130].rotateAngleX = 1.51843645F;

		bodyModel[131].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 762
		bodyModel[131].setRotationPoint(-45.5F, -8.4F, -32.8F);
		bodyModel[131].rotateAngleX = 1.51843645F;

		bodyModel[132].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 763
		bodyModel[132].setRotationPoint(-3.5F, -8.4F, 30.8F);
		bodyModel[132].rotateAngleX = 1.6231562F;

		bodyModel[133].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 768
		bodyModel[133].setRotationPoint(-9.5F, -8.4F, 30.8F);
		bodyModel[133].rotateAngleX = 1.6231562F;

		bodyModel[134].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 769
		bodyModel[134].setRotationPoint(-15.5F, -8.4F, 30.8F);
		bodyModel[134].rotateAngleX = 1.6231562F;

		bodyModel[135].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 774
		bodyModel[135].setRotationPoint(-21.5F, -8.4F, 30.8F);
		bodyModel[135].rotateAngleX = 1.6231562F;

		bodyModel[136].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 775
		bodyModel[136].setRotationPoint(-27.5F, -8.4F, 30.8F);
		bodyModel[136].rotateAngleX = 1.6231562F;

		bodyModel[137].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 780
		bodyModel[137].setRotationPoint(-33.5F, -8.4F, 30.8F);
		bodyModel[137].rotateAngleX = 1.6231562F;

		bodyModel[138].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 781
		bodyModel[138].setRotationPoint(-51.5F, -8.4F, 30.8F);
		bodyModel[138].rotateAngleX = 1.6231562F;

		bodyModel[139].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 782
		bodyModel[139].setRotationPoint(-45.5F, -8.4F, 30.8F);
		bodyModel[139].rotateAngleX = 1.6231562F;

		bodyModel[140].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 785
		bodyModel[140].setRotationPoint(-39.5F, -8.4F, 30.8F);
		bodyModel[140].rotateAngleX = 1.6231562F;

		bodyModel[141].addBox(0F, 0F, 0F, 10, 1, 6, 0F); // Box 944
		bodyModel[141].setRotationPoint(51F, -3F, -31.9F);
		bodyModel[141].rotateAngleX = 1.57079633F;
		bodyModel[141].rotateAngleY = -0.06981317F;
		bodyModel[141].rotateAngleZ = 0.17453293F;

		bodyModel[142].addBox(0F, 0F, -0.5F, 3, 1, 5, 0F); // Box 945
		bodyModel[142].setRotationPoint(59.3F, -5F, -32.5F);
		bodyModel[142].rotateAngleX = 1.36135682F;
		bodyModel[142].rotateAngleY = 0.17453293F;
		bodyModel[142].rotateAngleZ = 0.13962634F;

		bodyModel[143].addBox(0F, 0F, 0F, 3, 1, 5, 0F); // Box 946
		bodyModel[143].setRotationPoint(62.3F, -5F, -32F);
		bodyModel[143].rotateAngleX = 1.29154365F;
		bodyModel[143].rotateAngleY = 1.09955743F;
		bodyModel[143].rotateAngleZ = -0.01745329F;

		bodyModel[144].addBox(0F, 0F, -5F, 10, 1, 5, 0F); // Box 947
		bodyModel[144].setRotationPoint(62F, -10F, -29.3F);
		bodyModel[144].rotateAngleX = 1.20427718F;
		bodyModel[144].rotateAngleY = 1.57079633F;
		bodyModel[144].rotateAngleZ = -0.01745329F;

		bodyModel[145].addShapeBox(2F, 0.4F, -2F, 11, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 948
		bodyModel[145].setRotationPoint(61.5F, -9.6F, -29.3F);
		bodyModel[145].rotateAngleX = -0.9250245F;
		bodyModel[145].rotateAngleZ = 3.00196631F;

		bodyModel[146].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 949
		bodyModel[146].setRotationPoint(60F, -9.3F, -31F);
		bodyModel[146].rotateAngleX = 0.6981317F;
		bodyModel[146].rotateAngleY = 0.64577182F;
		bodyModel[146].rotateAngleZ = 0.06981317F;

		bodyModel[147].addBox(0F, 0F, -0.5F, 3, 1, 5, 0F); // Box 950
		bodyModel[147].setRotationPoint(59.3F, -5F, 15.9F);
		bodyModel[147].rotateAngleX = 1.36135682F;
		bodyModel[147].rotateAngleY = 0.17453293F;
		bodyModel[147].rotateAngleZ = 0.13962634F;

		bodyModel[148].addBox(0F, 0F, 0F, 3, 1, 5, 0F); // Box 951
		bodyModel[148].setRotationPoint(62.3F, -5F, 16.4F);
		bodyModel[148].rotateAngleX = 1.29154365F;
		bodyModel[148].rotateAngleY = 1.09955743F;
		bodyModel[148].rotateAngleZ = -0.01745329F;

		bodyModel[149].addBox(0F, 0F, -5F, 10, 1, 5, 0F); // Box 952
		bodyModel[149].setRotationPoint(62F, -10F, 19.1F);
		bodyModel[149].rotateAngleX = 1.20427718F;
		bodyModel[149].rotateAngleY = 1.57079633F;
		bodyModel[149].rotateAngleZ = -0.01745329F;

		bodyModel[150].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 953
		bodyModel[150].setRotationPoint(60F, -11F, 19.4F);
		bodyModel[150].rotateAngleZ = -0.61086524F;

		bodyModel[151].addBox(2F, 0.4F, -2F, 11, 1, 3, 0F); // Box 954
		bodyModel[151].setRotationPoint(61.5F, -9.6F, 19.1F);
		bodyModel[151].rotateAngleX = -0.9250245F;
		bodyModel[151].rotateAngleZ = 3.00196631F;

		bodyModel[152].addShapeBox(0F, 0F, 0F, 10, 1, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, -1F, 2F); // Box 955
		bodyModel[152].setRotationPoint(51F, -3F, 16.5F);
		bodyModel[152].rotateAngleX = 1.57079633F;
		bodyModel[152].rotateAngleY = -0.06981317F;
		bodyModel[152].rotateAngleZ = 0.17453293F;

		bodyModel[153].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 956
		bodyModel[153].setRotationPoint(60F, -9.3F, 17.4F);
		bodyModel[153].rotateAngleX = 0.6981317F;
		bodyModel[153].rotateAngleY = 0.64577182F;
		bodyModel[153].rotateAngleZ = 0.06981317F;

		bodyModel[154].addShapeBox(-13F, 0.4F, -2F, 11, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 957
		bodyModel[154].setRotationPoint(61.5F, -9.6F, -19.1F);
		bodyModel[154].rotateAngleX = -1.29154365F;
		bodyModel[154].rotateAngleY = 3.14159265F;
		bodyModel[154].rotateAngleZ = 3.28121899F;

		bodyModel[155].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 958
		bodyModel[155].setRotationPoint(60F, -8.5F, -17.5F);
		bodyModel[155].rotateAngleX = 0.61086524F;
		bodyModel[155].rotateAngleY = 3.35103216F;
		bodyModel[155].rotateAngleZ = 1.08210414F;

		bodyModel[156].addBox(0F, 0F, 0F, 3, 1, 5, 0F); // Box 959
		bodyModel[156].setRotationPoint(63.3F, -5F, -19F);
		bodyModel[156].rotateAngleX = 1.27409035F;
		bodyModel[156].rotateAngleY = 2.42600766F;
		bodyModel[156].rotateAngleZ = 0.01745329F;

		bodyModel[157].addBox(0F, 0F, 0F, 3, 1, 5, 0F); // Box 960
		bodyModel[157].setRotationPoint(61F, -5F, -17F);
		bodyModel[157].rotateAngleX = 1.27409035F;
		bodyModel[157].rotateAngleY = 2.82743339F;
		bodyModel[157].rotateAngleZ = 0.01745329F;

		bodyModel[158].addBox(0F, 0F, 0F, 10, 1, 6, 0F); // Box 961
		bodyModel[158].setRotationPoint(51F, -3F, -17.2F);
		bodyModel[158].rotateAngleX = 1.81514242F;
		bodyModel[158].rotateAngleY = -0.06981317F;
		bodyModel[158].rotateAngleZ = 0.17453293F;

		bodyModel[159].addShapeBox(-13F, 0.4F, -2F, 11, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 967
		bodyModel[159].setRotationPoint(61.5F, -9.6F, 28.9F);
		bodyModel[159].rotateAngleX = -1.29154365F;
		bodyModel[159].rotateAngleY = 3.14159265F;
		bodyModel[159].rotateAngleZ = 3.28121899F;

		bodyModel[160].addBox(0F, 0F, 0F, 3, 1, 5, 0F); // Box 968
		bodyModel[160].setRotationPoint(63.3F, -5F, 29F);
		bodyModel[160].rotateAngleX = 1.27409035F;
		bodyModel[160].rotateAngleY = 2.42600766F;
		bodyModel[160].rotateAngleZ = 0.01745329F;

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 969
		bodyModel[161].setRotationPoint(60F, -8.5F, 30.5F);
		bodyModel[161].rotateAngleX = 0.61086524F;
		bodyModel[161].rotateAngleY = 3.35103216F;
		bodyModel[161].rotateAngleZ = 1.08210414F;

		bodyModel[162].addBox(0F, 0F, 0F, 3, 1, 5, 0F); // Box 970
		bodyModel[162].setRotationPoint(61F, -5F, 31F);
		bodyModel[162].rotateAngleX = 1.27409035F;
		bodyModel[162].rotateAngleY = 2.7925268F;
		bodyModel[162].rotateAngleZ = -0.08726646F;

		bodyModel[163].addShapeBox(0F, 0F, 0F, 10, 1, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, -1F, 2F); // Box 971
		bodyModel[163].setRotationPoint(51F, -3F, 31.1F);
		bodyModel[163].rotateAngleX = 1.67551608F;
		bodyModel[163].rotateAngleY = -0.06981317F;
		bodyModel[163].rotateAngleZ = 0.19198622F;

		bodyModel[164].addBox(0F, -0.5F, 0F, 97, 1, 33, 0F); // Box 1024
		bodyModel[164].setRotationPoint(47F, 2.7F, -16.8F);
		bodyModel[164].rotateAngleZ = -3.14159265F;

		bodyModel[165].addBox(0F, -0.5F, 0F, 97, 1, 4, 0F); // Box 1025
		bodyModel[165].setRotationPoint(47F, 3.7F, -2.4F);
		bodyModel[165].rotateAngleZ = -3.1503193F;

		bodyModel[166].addBox(0F, 0F, 0F, 97, 1, 2, 0F); // Box 1026
		bodyModel[166].setRotationPoint(47F, 3.3F, -15.8F);
		bodyModel[166].rotateAngleX = -1.57079633F;
		bodyModel[166].rotateAngleZ = -3.14159265F;

		bodyModel[167].addBox(0F, 0F, 0F, 97, 1, 2, 0F); // Box 1029
		bodyModel[167].setRotationPoint(47F, 1.3F, -15.8F);
		bodyModel[167].rotateAngleX = -1.98967535F;
		bodyModel[167].rotateAngleZ = -3.14159265F;

		bodyModel[168].addShapeBox(0F, 0F, 0F, 89, 1, 14, 0F,0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1031
		bodyModel[168].setRotationPoint(29F, 0F, 17F);
		bodyModel[168].rotateAngleX = -1.57079633F;
		bodyModel[168].rotateAngleZ = -3.14159265F;

		bodyModel[169].addBox(0F, 0F, 0F, 97, 1, 2, 0F); // Box 1032
		bodyModel[169].setRotationPoint(47F, 3.3F, 16.2F);
		bodyModel[169].rotateAngleX = -1.57079633F;
		bodyModel[169].rotateAngleZ = -3.14159265F;

		bodyModel[170].addBox(0F, -1F, 0F, 99, 1, 2, 0F); // Box 1035
		bodyModel[170].setRotationPoint(47F, 1.3F, 15.2F);
		bodyModel[170].rotateAngleX = -1.15191731F;
		bodyModel[170].rotateAngleZ = -3.14159265F;

		bodyModel[171].addShapeBox(0F, 0F, 0F, 20, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 1036
		bodyModel[171].setRotationPoint(49F, 0F, 17F);
		bodyModel[171].rotateAngleX = -1.57079633F;
		bodyModel[171].rotateAngleZ = -3.14159265F;

		bodyModel[172].addShapeBox(0F, 0F, 0F, 20, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 1037
		bodyModel[172].setRotationPoint(49F, 0F, -16.5F);
		bodyModel[172].rotateAngleX = -1.57079633F;
		bodyModel[172].rotateAngleZ = -3.14159265F;

		bodyModel[173].addShapeBox(0F, 0F, 0F, 89, 1, 14, 0F,0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1038
		bodyModel[173].setRotationPoint(29F, 0F, -16.5F);
		bodyModel[173].rotateAngleX = -1.57079633F;
		bodyModel[173].rotateAngleZ = -3.14159265F;

		bodyModel[174].addShapeBox(0F, -0.5F, -17F, 19, 1, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1039
		bodyModel[174].setRotationPoint(-50F, 2.7F, 0.2F);
		bodyModel[174].rotateAngleZ = 2.16420827F;

		bodyModel[175].addShapeBox(8F, -0.5F, -17F, 9, 1, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1040
		bodyModel[175].setRotationPoint(-50.5F, 2.7F, 0.2F);
		bodyModel[175].rotateAngleZ = 2.19911486F;

		bodyModel[176].addBox(0F, 0F, 0F, 35, 1, 12, 0F); // Box 1041
		bodyModel[176].setRotationPoint(-59F, -12.7F, 16.5F);

		bodyModel[177].addBox(0F, 0F, 0F, 1, 4, 12, 0F); // Box 1043
		bodyModel[177].setRotationPoint(-25F, -15.7F, 16.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1044
		bodyModel[178].setRotationPoint(-25F, -15.7F, -29.5F);

		bodyModel[179].addBox(0F, 0F, 0F, 35, 1, 12, 0F); // Box 1045
		bodyModel[179].setRotationPoint(-59F, -12.7F, -29.5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 55, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 1046
		bodyModel[180].setRotationPoint(-25F, -15F, 16.5F);
		bodyModel[180].rotateAngleX = 0.34906585F;
		bodyModel[180].rotateAngleZ = -0.01745329F;

		bodyModel[181].addShapeBox(0F, 0F, -2F, 55, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 1047
		bodyModel[181].setRotationPoint(-25F, -15F, -17.5F);
		bodyModel[181].rotateAngleX = -0.34906585F;
		bodyModel[181].rotateAngleZ = -0.01745329F;

		bodyModel[182].addBox(-2F, -0.5F, 0F, 1, 1, 12, 0F); // Box 1048
		bodyModel[182].setRotationPoint(-57F, -12.7F, -29.5F);

		bodyModel[183].addBox(-2F, -0.5F, 0F, 1, 1, 12, 0F); // Box 1050
		bodyModel[183].setRotationPoint(-57F, -12.7F, -29.5F);
		bodyModel[183].rotateAngleZ = -0.52359878F;

		bodyModel[184].addBox(-2F, -0.5F, 0F, 1, 1, 12, 0F); // Box 1052
		bodyModel[184].setRotationPoint(-57F, -12.7F, -29.5F);
		bodyModel[184].rotateAngleZ = -1.04719755F;

		bodyModel[185].addShapeBox(0F, 0F, 0F, 12, 3, 16, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1053
		bodyModel[185].setRotationPoint(-42F, -15.5F, -29.5F);
		bodyModel[185].rotateAngleY = 1.57079633F;

		bodyModel[186].addShapeBox(0F, 0F, 0F, 12, 3, 16, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1054
		bodyModel[186].setRotationPoint(-42F, -15.5F, 16.5F);
		bodyModel[186].rotateAngleY = 1.57079633F;

		bodyModel[187].addBox(-2F, -0.5F, 0F, 1, 1, 12, 0F); // Box 1055
		bodyModel[187].setRotationPoint(-57F, -12.7F, 16.5F);
		bodyModel[187].rotateAngleZ = -1.04719755F;

		bodyModel[188].addBox(-2F, -0.5F, 0F, 1, 1, 12, 0F); // Box 1056
		bodyModel[188].setRotationPoint(-57F, -12.7F, 16.5F);
		bodyModel[188].rotateAngleZ = -0.52359878F;

		bodyModel[189].addBox(-2F, -0.5F, 0F, 1, 1, 12, 0F); // Box 1057
		bodyModel[189].setRotationPoint(-57F, -12.7F, 16.5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 78, 1, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 1058
		bodyModel[190].setRotationPoint(-59F, -12F, 27.9F);
		bodyModel[190].rotateAngleX = -0.33161256F;

		bodyModel[191].addBox(0F, 0F, -3F, 78, 1, 3, 0F); // Box 1059
		bodyModel[191].setRotationPoint(-59F, -12F, -28.5F);
		bodyModel[191].rotateAngleX = 0.33161256F;

		bodyModel[192].addBox(0F, 0F, 0F, 1, 4, 11, 0F); // Box 1060
		bodyModel[192].setRotationPoint(-28F, -15.7F, -28.5F);
		bodyModel[192].rotateAngleZ = 0.29670597F;

		bodyModel[193].addBox(0F, 0F, 0F, 15, 4, 9, 0F); // Box 1061
		bodyModel[193].setRotationPoint(-42F, -16F, -26.5F);

		bodyModel[194].addBox(0F, 0F, 0F, 1, 15, 11, 0F); // Box 1062
		bodyModel[194].setRotationPoint(-42F, -15.1F, -28.5F);
		bodyModel[194].rotateAngleZ = 1.57079633F;

		bodyModel[195].addBox(0F, 0F, 0F, 1, 15, 11, 0F); // Box 1063
		bodyModel[195].setRotationPoint(-42F, -15.1F, 17.5F);
		bodyModel[195].rotateAngleZ = 1.57079633F;

		bodyModel[196].addBox(0F, 0F, 0F, 1, 4, 11, 0F); // Box 1064
		bodyModel[196].setRotationPoint(-28F, -15.7F, 17.5F);
		bodyModel[196].rotateAngleZ = 0.29670597F;

		bodyModel[197].addBox(0F, 0F, 0F, 15, 4, 9, 0F); // Box 1065
		bodyModel[197].setRotationPoint(-42F, -16F, 17.5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1066
		bodyModel[198].setRotationPoint(-62F, -10.7F, -16F);
		bodyModel[198].rotateAngleZ = 0.59341195F;

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1067
		bodyModel[199].setRotationPoint(-62F, -10.7F, 14.4F);
		bodyModel[199].rotateAngleZ = 0.59341195F;

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1068
		bodyModel[200].setRotationPoint(-62F, -10.7F, 4.6F);
		bodyModel[200].rotateAngleZ = 0.59341195F;

		bodyModel[201].addBox(0F, -3F, -0.5F, 1, 6, 1, 0F); // Box 1069
		bodyModel[201].setRotationPoint(-57.5F, -4.7F, -0.4F);
		bodyModel[201].rotateAngleZ = 0.59341195F;

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1084
		bodyModel[202].setRotationPoint(-62F, -10.7F, -6.4F);
		bodyModel[202].rotateAngleZ = 0.59341195F;

		bodyModel[203].addBox(-2F, -17F, -7.5F, 3, 3, 1, 0F); // Box 1085
		bodyModel[203].setRotationPoint(-57.5F, -4.7F, -0.4F);
		bodyModel[203].rotateAngleX = -1.57079633F;
		bodyModel[203].rotateAngleZ = 0.59341195F;

		bodyModel[204].addBox(-2F, -7F, -7.5F, 3, 3, 1, 0F); // Box 1086
		bodyModel[204].setRotationPoint(-57.5F, -4.7F, -0.4F);
		bodyModel[204].rotateAngleX = -1.57079633F;
		bodyModel[204].rotateAngleZ = 0.59341195F;

		bodyModel[205].addBox(-2F, 4F, -7.5F, 3, 3, 1, 0F); // Box 1087
		bodyModel[205].setRotationPoint(-57.5F, -4.7F, -0.4F);
		bodyModel[205].rotateAngleX = -1.57079633F;
		bodyModel[205].rotateAngleZ = 0.59341195F;

		bodyModel[206].addBox(-2F, 13.8F, -7.5F, 3, 3, 1, 0F); // Box 1088
		bodyModel[206].setRotationPoint(-57.5F, -4.7F, -0.4F);
		bodyModel[206].rotateAngleX = -1.57079633F;
		bodyModel[206].rotateAngleZ = 0.59341195F;

		bodyModel[207].addBox(-2F, 12.8F, -3.5F, 3, 1, 1, 0F); // Box 1089
		bodyModel[207].setRotationPoint(-57.5F, -4.7F, -0.4F);
		bodyModel[207].rotateAngleX = -1.57079633F;
		bodyModel[207].rotateAngleZ = 0.59341195F;

		bodyModel[208].addBox(-2.5F, 12.8F, -3.5F, 1, 1, 3, 0F); // Box 1091
		bodyModel[208].setRotationPoint(-57.5F, -4.7F, -0.4F);
		bodyModel[208].rotateAngleX = -1.57079633F;
		bodyModel[208].rotateAngleZ = 0.59341195F;

		bodyModel[209].addBox(-2F, 12.8F, -1.5F, 3, 1, 1, 0F); // Box 1092
		bodyModel[209].setRotationPoint(-57.5F, -4.7F, -0.4F);
		bodyModel[209].rotateAngleX = -1.57079633F;
		bodyModel[209].rotateAngleZ = 0.82030475F;

		bodyModel[210].addBox(-2.2F, 12.8F, -1.5F, 1, 1, 2, 0F); // Box 1093
		bodyModel[210].setRotationPoint(-57.5F, -4.7F, -0.4F);
		bodyModel[210].rotateAngleX = -1.57079633F;
		bodyModel[210].rotateAngleZ = 0.83775804F;

		bodyModel[211].addBox(-2.2F, -14F, -1.5F, 1, 1, 2, 0F); // Box 1094
		bodyModel[211].setRotationPoint(-57.5F, -4.7F, -0.4F);
		bodyModel[211].rotateAngleX = -1.57079633F;
		bodyModel[211].rotateAngleZ = 0.83775804F;

		bodyModel[212].addBox(-2F, -14F, -1.5F, 3, 1, 1, 0F); // Box 1095
		bodyModel[212].setRotationPoint(-57.5F, -4.7F, -0.4F);
		bodyModel[212].rotateAngleX = -1.57079633F;
		bodyModel[212].rotateAngleZ = 0.82030475F;

		bodyModel[213].addBox(-2F, -14F, -3.5F, 3, 1, 1, 0F); // Box 1096
		bodyModel[213].setRotationPoint(-57.5F, -4.7F, -0.4F);
		bodyModel[213].rotateAngleX = -1.57079633F;
		bodyModel[213].rotateAngleZ = 0.59341195F;

		bodyModel[214].addBox(-2.5F, -14F, -3.5F, 1, 1, 3, 0F); // Box 1097
		bodyModel[214].setRotationPoint(-57.5F, -4.7F, -0.4F);
		bodyModel[214].rotateAngleX = -1.57079633F;
		bodyModel[214].rotateAngleZ = 0.59341195F;

		bodyModel[215].addBox(0F, 0F, 0F, 3, 1, 10, 0F); // Box 1098
		bodyModel[215].setRotationPoint(-56F, -14F, -16.5F);
		bodyModel[215].rotateAngleZ = 1.90240888F;

		bodyModel[216].addBox(0F, 0F, 0F, 13, 1, 33, 0F); // Box 1099
		bodyModel[216].setRotationPoint(-53F, -14.7F, -16.5F);

		bodyModel[217].addBox(0F, 0F, 0F, 89, 2, 33, 0F); // Box 1100
		bodyModel[217].setRotationPoint(-61F, -14F, -16.5F);

		bodyModel[218].addBox(0F, 0F, 0F, 3, 1, 10, 0F); // Box 1101
		bodyModel[218].setRotationPoint(-56F, -14F, 5F);
		bodyModel[218].rotateAngleZ = 1.90240888F;

		bodyModel[219].addShapeBox(0F, -1F, 0F, 5, 1, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1102
		bodyModel[219].setRotationPoint(-61F, -14.7F, -13F);
		bodyModel[219].rotateAngleZ = -2.68780705F;

		bodyModel[220].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 1103
		bodyModel[220].setRotationPoint(-53F, -15.5F, -16.5F);

		bodyModel[221].addBox(0F, 0F, 0F, 32, 1, 1, 0F); // Box 1120
		bodyModel[221].setRotationPoint(-53F, -15.5F, 15.5F);
		bodyModel[221].rotateAngleY = -1.57079633F;

		bodyModel[222].addBox(0F, 0F, 0F, 32, 1, 1, 0F); // Box 1121
		bodyModel[222].setRotationPoint(-41F, -15.5F, 15.5F);
		bodyModel[222].rotateAngleY = -1.57079633F;

		bodyModel[223].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 0
		bodyModel[223].setRotationPoint(0F, -15F, 0F);

		bodyModel[224].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 1
		bodyModel[224].setRotationPoint(0F, -15F, 0F);
		bodyModel[224].rotateAngleY = -0.08726646F;

		bodyModel[225].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 2
		bodyModel[225].setRotationPoint(0F, -15F, 0F);
		bodyModel[225].rotateAngleY = -0.17453293F;

		bodyModel[226].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 3
		bodyModel[226].setRotationPoint(0F, -15F, 0F);
		bodyModel[226].rotateAngleY = -0.26179939F;

		bodyModel[227].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 4
		bodyModel[227].setRotationPoint(0F, -15F, 0F);
		bodyModel[227].rotateAngleY = -0.34906585F;

		bodyModel[228].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 5
		bodyModel[228].setRotationPoint(0F, -15F, 0F);
		bodyModel[228].rotateAngleY = -0.43633231F;

		bodyModel[229].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 6
		bodyModel[229].setRotationPoint(0F, -15F, 0F);
		bodyModel[229].rotateAngleY = -0.52359878F;

		bodyModel[230].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 7
		bodyModel[230].setRotationPoint(0F, -15F, 0F);
		bodyModel[230].rotateAngleY = -1.13446401F;

		bodyModel[231].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 8
		bodyModel[231].setRotationPoint(0F, -15F, 0F);
		bodyModel[231].rotateAngleY = -1.04719755F;

		bodyModel[232].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 9
		bodyModel[232].setRotationPoint(0F, -15F, 0F);
		bodyModel[232].rotateAngleY = -0.95993109F;

		bodyModel[233].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 10
		bodyModel[233].setRotationPoint(0F, -15F, 0F);
		bodyModel[233].rotateAngleY = -0.87266463F;

		bodyModel[234].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 11
		bodyModel[234].setRotationPoint(0F, -15F, 0F);
		bodyModel[234].rotateAngleY = -0.78539816F;

		bodyModel[235].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 12
		bodyModel[235].setRotationPoint(0F, -15F, 0F);
		bodyModel[235].rotateAngleY = -0.6981317F;

		bodyModel[236].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 13
		bodyModel[236].setRotationPoint(0F, -15F, 0F);
		bodyModel[236].rotateAngleY = -0.61086524F;

		bodyModel[237].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 14
		bodyModel[237].setRotationPoint(0F, -15F, 0F);
		bodyModel[237].rotateAngleY = -2.35619449F;

		bodyModel[238].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 15
		bodyModel[238].setRotationPoint(0F, -15F, 0F);
		bodyModel[238].rotateAngleY = -2.26892803F;

		bodyModel[239].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 16
		bodyModel[239].setRotationPoint(0F, -15F, 0F);
		bodyModel[239].rotateAngleY = -2.18166156F;

		bodyModel[240].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 17
		bodyModel[240].setRotationPoint(0F, -15F, 0F);
		bodyModel[240].rotateAngleY = -2.0943951F;

		bodyModel[241].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 18
		bodyModel[241].setRotationPoint(0F, -15F, 0F);
		bodyModel[241].rotateAngleY = -2.00712864F;

		bodyModel[242].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 19
		bodyModel[242].setRotationPoint(0F, -15F, 0F);
		bodyModel[242].rotateAngleY = -1.91986218F;

		bodyModel[243].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 20
		bodyModel[243].setRotationPoint(0F, -15F, 0F);
		bodyModel[243].rotateAngleY = -1.83259571F;

		bodyModel[244].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 21
		bodyModel[244].setRotationPoint(0F, -15F, 0F);
		bodyModel[244].rotateAngleY = -1.74532925F;

		bodyModel[245].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 22
		bodyModel[245].setRotationPoint(0F, -15F, 0F);
		bodyModel[245].rotateAngleY = -1.65806279F;

		bodyModel[246].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 23
		bodyModel[246].setRotationPoint(0F, -15F, 0F);
		bodyModel[246].rotateAngleY = -1.57079633F;

		bodyModel[247].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 24
		bodyModel[247].setRotationPoint(0F, -15F, 0F);
		bodyModel[247].rotateAngleY = -1.48352986F;

		bodyModel[248].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 25
		bodyModel[248].setRotationPoint(0F, -15F, 0F);
		bodyModel[248].rotateAngleY = -1.3962634F;

		bodyModel[249].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 26
		bodyModel[249].setRotationPoint(0F, -15F, 0F);
		bodyModel[249].rotateAngleY = -1.30899694F;

		bodyModel[250].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 27
		bodyModel[250].setRotationPoint(0F, -15F, 0F);
		bodyModel[250].rotateAngleY = -1.22173048F;

		bodyModel[251].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 28
		bodyModel[251].setRotationPoint(0F, -15F, 0F);
		bodyModel[251].rotateAngleY = -4.10152374F;

		bodyModel[252].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 29
		bodyModel[252].setRotationPoint(0F, -15F, 0F);
		bodyModel[252].rotateAngleY = -4.36332313F;

		bodyModel[253].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 33
		bodyModel[253].setRotationPoint(0F, -15F, 0F);
		bodyModel[253].rotateAngleY = -4.01425728F;

		bodyModel[254].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 34
		bodyModel[254].setRotationPoint(0F, -15F, 0F);
		bodyModel[254].rotateAngleY = -3.92699082F;

		bodyModel[255].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 35
		bodyModel[255].setRotationPoint(0F, -15F, 0F);
		bodyModel[255].rotateAngleY = -3.83972435F;

		bodyModel[256].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 36
		bodyModel[256].setRotationPoint(0F, -15F, 0F);
		bodyModel[256].rotateAngleY = -3.75245789F;

		bodyModel[257].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 37
		bodyModel[257].setRotationPoint(0F, -15F, 0F);
		bodyModel[257].rotateAngleY = -3.66519143F;

		bodyModel[258].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 38
		bodyModel[258].setRotationPoint(0F, -15F, 0F);
		bodyModel[258].rotateAngleY = -3.57792497F;

		bodyModel[259].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 39
		bodyModel[259].setRotationPoint(0F, -15F, 0F);
		bodyModel[259].rotateAngleY = -3.4906585F;

		bodyModel[260].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 40
		bodyModel[260].setRotationPoint(0F, -15F, 0F);
		bodyModel[260].rotateAngleY = -3.40339204F;

		bodyModel[261].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 41
		bodyModel[261].setRotationPoint(0F, -15F, 0F);
		bodyModel[261].rotateAngleY = -3.31612558F;

		bodyModel[262].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 42
		bodyModel[262].setRotationPoint(0F, -15F, 0F);
		bodyModel[262].rotateAngleY = -3.22885912F;

		bodyModel[263].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 43
		bodyModel[263].setRotationPoint(0F, -15F, 0F);
		bodyModel[263].rotateAngleY = -3.14159265F;

		bodyModel[264].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 44
		bodyModel[264].setRotationPoint(0F, -15F, 0F);
		bodyModel[264].rotateAngleY = -3.05432619F;

		bodyModel[265].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 45
		bodyModel[265].setRotationPoint(0F, -15F, 0F);
		bodyModel[265].rotateAngleY = -2.96705973F;

		bodyModel[266].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 46
		bodyModel[266].setRotationPoint(0F, -15F, 0F);
		bodyModel[266].rotateAngleY = -2.87979327F;

		bodyModel[267].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 47
		bodyModel[267].setRotationPoint(0F, -15F, 0F);
		bodyModel[267].rotateAngleY = -2.7925268F;

		bodyModel[268].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 48
		bodyModel[268].setRotationPoint(0F, -15F, 0F);
		bodyModel[268].rotateAngleY = -2.70526034F;

		bodyModel[269].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 49
		bodyModel[269].setRotationPoint(0F, -15F, 0F);
		bodyModel[269].rotateAngleY = -2.61799388F;

		bodyModel[270].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 50
		bodyModel[270].setRotationPoint(0F, -15F, 0F);
		bodyModel[270].rotateAngleY = -2.53072742F;

		bodyModel[271].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 51
		bodyModel[271].setRotationPoint(0F, -15F, 0F);
		bodyModel[271].rotateAngleY = -2.44346095F;

		bodyModel[272].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 52
		bodyModel[272].setRotationPoint(0F, -15F, 0F);
		bodyModel[272].rotateAngleY = -6.19591884F;

		bodyModel[273].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 53
		bodyModel[273].setRotationPoint(0F, -15F, 0F);
		bodyModel[273].rotateAngleY = -6.10865238F;

		bodyModel[274].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 54
		bodyModel[274].setRotationPoint(0F, -15F, 0F);
		bodyModel[274].rotateAngleY = -6.02138592F;

		bodyModel[275].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 55
		bodyModel[275].setRotationPoint(0F, -15F, 0F);
		bodyModel[275].rotateAngleY = -5.93411946F;

		bodyModel[276].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 56
		bodyModel[276].setRotationPoint(0F, -15F, 0F);
		bodyModel[276].rotateAngleY = -5.84685299F;

		bodyModel[277].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 57
		bodyModel[277].setRotationPoint(0F, -15F, 0F);
		bodyModel[277].rotateAngleY = -5.75958653F;

		bodyModel[278].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 58
		bodyModel[278].setRotationPoint(0F, -15F, 0F);
		bodyModel[278].rotateAngleY = -5.67232007F;

		bodyModel[279].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 59
		bodyModel[279].setRotationPoint(0F, -15F, 0F);
		bodyModel[279].rotateAngleY = -5.58505361F;

		bodyModel[280].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 60
		bodyModel[280].setRotationPoint(0F, -15F, 0F);
		bodyModel[280].rotateAngleY = -5.49778714F;

		bodyModel[281].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 61
		bodyModel[281].setRotationPoint(0F, -15F, 0F);
		bodyModel[281].rotateAngleY = -5.41052068F;

		bodyModel[282].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 62
		bodyModel[282].setRotationPoint(0F, -15F, 0F);
		bodyModel[282].rotateAngleY = -5.32325422F;

		bodyModel[283].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 63
		bodyModel[283].setRotationPoint(0F, -15F, 0F);
		bodyModel[283].rotateAngleY = -5.23598776F;

		bodyModel[284].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 64
		bodyModel[284].setRotationPoint(0F, -15F, 0F);
		bodyModel[284].rotateAngleY = -5.14872129F;

		bodyModel[285].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 65
		bodyModel[285].setRotationPoint(0F, -15F, 0F);
		bodyModel[285].rotateAngleY = -5.06145483F;

		bodyModel[286].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 66
		bodyModel[286].setRotationPoint(0F, -15F, 0F);
		bodyModel[286].rotateAngleY = -4.97418837F;

		bodyModel[287].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 67
		bodyModel[287].setRotationPoint(0F, -15F, 0F);
		bodyModel[287].rotateAngleY = -4.88692191F;

		bodyModel[288].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 68
		bodyModel[288].setRotationPoint(0F, -15F, 0F);
		bodyModel[288].rotateAngleY = -4.79965544F;

		bodyModel[289].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 69
		bodyModel[289].setRotationPoint(0F, -15F, 0F);
		bodyModel[289].rotateAngleY = -4.71238898F;

		bodyModel[290].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 70
		bodyModel[290].setRotationPoint(0F, -15F, 0F);
		bodyModel[290].rotateAngleY = -4.62512252F;

		bodyModel[291].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 71
		bodyModel[291].setRotationPoint(0F, -15F, 0F);
		bodyModel[291].rotateAngleY = -4.45058959F;

		bodyModel[292].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 74
		bodyModel[292].setRotationPoint(0F, -15F, 0F);
		bodyModel[292].rotateAngleY = -4.27605667F;

		bodyModel[293].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 75
		bodyModel[293].setRotationPoint(0F, -15F, 0F);
		bodyModel[293].rotateAngleY = -4.1887902F;

		bodyModel[294].addBox(15F, -2F, -1F, 1, 3, 2, 0F); // Box 76
		bodyModel[294].setRotationPoint(0F, -15F, 0F);
		bodyModel[294].rotateAngleY = -4.53785606F;

		bodyModel[295].addShapeBox(2F, 0.4F, -3F, 21, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 1275
		bodyModel[295].setRotationPoint(51.5F, -10.6F, 19.1F);
		bodyModel[295].rotateAngleX = -0.9250245F;
		bodyModel[295].rotateAngleY = 0.05235988F;
		bodyModel[295].rotateAngleZ = 3.00196631F;

		bodyModel[296].addShapeBox(-13F, 0.4F, -2F, 20, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 1276
		bodyModel[296].setRotationPoint(41.5F, -10.6F, -19.1F);
		bodyModel[296].rotateAngleX = -1.1693706F;
		bodyModel[296].rotateAngleY = 3.08923278F;
		bodyModel[296].rotateAngleZ = 3.28121899F;

		bodyModel[297].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 0
		bodyModel[297].setRotationPoint(-3.5F, -5.7F, 30.8F);
		bodyModel[297].rotateAngleX = 1.6231562F;

		bodyModel[298].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 1
		bodyModel[298].setRotationPoint(-9.5F, -5.7F, 30.8F);
		bodyModel[298].rotateAngleX = 1.6231562F;

		bodyModel[299].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 2
		bodyModel[299].setRotationPoint(-15.5F, -5.7F, 30.8F);
		bodyModel[299].rotateAngleX = 1.6231562F;

		bodyModel[300].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 3
		bodyModel[300].setRotationPoint(-21.5F, -5.7F, 30.8F);
		bodyModel[300].rotateAngleX = 1.6231562F;

		bodyModel[301].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 4
		bodyModel[301].setRotationPoint(-27.5F, -5.7F, 30.8F);
		bodyModel[301].rotateAngleX = 1.6231562F;

		bodyModel[302].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 5
		bodyModel[302].setRotationPoint(-33.5F, -5.7F, 30.8F);
		bodyModel[302].rotateAngleX = 1.6231562F;

		bodyModel[303].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 6
		bodyModel[303].setRotationPoint(-39.5F, -5.7F, 30.8F);
		bodyModel[303].rotateAngleX = 1.6231562F;

		bodyModel[304].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 7
		bodyModel[304].setRotationPoint(-45.5F, -5.7F, 30.8F);
		bodyModel[304].rotateAngleX = 1.6231562F;

		bodyModel[305].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 8
		bodyModel[305].setRotationPoint(-51.5F, -5.7F, 30.8F);
		bodyModel[305].rotateAngleX = 1.6231562F;

		bodyModel[306].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 9
		bodyModel[306].setRotationPoint(-2.5F, -2.7F, 30.8F);
		bodyModel[306].rotateAngleX = 1.6231562F;

		bodyModel[307].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 10
		bodyModel[307].setRotationPoint(-8.5F, -2.7F, 30.8F);
		bodyModel[307].rotateAngleX = 1.6231562F;

		bodyModel[308].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 11
		bodyModel[308].setRotationPoint(-14.5F, -2.7F, 30.8F);
		bodyModel[308].rotateAngleX = 1.6231562F;

		bodyModel[309].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 12
		bodyModel[309].setRotationPoint(-20.5F, -2.7F, 30.8F);
		bodyModel[309].rotateAngleX = 1.6231562F;

		bodyModel[310].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 13
		bodyModel[310].setRotationPoint(-26.5F, -2.7F, 30.8F);
		bodyModel[310].rotateAngleX = 1.6231562F;

		bodyModel[311].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 18
		bodyModel[311].setRotationPoint(-51.5F, -5.7F, -32.8F);
		bodyModel[311].rotateAngleX = 1.51843645F;

		bodyModel[312].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 19
		bodyModel[312].setRotationPoint(-45.5F, -5.7F, -32.8F);
		bodyModel[312].rotateAngleX = 1.51843645F;

		bodyModel[313].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 20
		bodyModel[313].setRotationPoint(-39.5F, -5.7F, -32.8F);
		bodyModel[313].rotateAngleX = 1.51843645F;

		bodyModel[314].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 21
		bodyModel[314].setRotationPoint(-33.5F, -5.7F, -32.8F);
		bodyModel[314].rotateAngleX = 1.51843645F;

		bodyModel[315].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 22
		bodyModel[315].setRotationPoint(-27.5F, -5.7F, -32.8F);
		bodyModel[315].rotateAngleX = 1.51843645F;

		bodyModel[316].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 23
		bodyModel[316].setRotationPoint(-21.5F, -5.7F, -32.8F);
		bodyModel[316].rotateAngleX = 1.51843645F;

		bodyModel[317].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 24
		bodyModel[317].setRotationPoint(-15.5F, -5.7F, -32.8F);
		bodyModel[317].rotateAngleX = 1.51843645F;

		bodyModel[318].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 25
		bodyModel[318].setRotationPoint(-9.5F, -5.7F, -32.8F);
		bodyModel[318].rotateAngleX = 1.51843645F;

		bodyModel[319].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 26
		bodyModel[319].setRotationPoint(-3.5F, -5.7F, -32.8F);
		bodyModel[319].rotateAngleX = 1.51843645F;

		bodyModel[320].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 31
		bodyModel[320].setRotationPoint(-31.5F, -2.7F, -32.8F);
		bodyModel[320].rotateAngleX = 1.51843645F;

		bodyModel[321].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 32
		bodyModel[321].setRotationPoint(-25.5F, -2.7F, -32.8F);
		bodyModel[321].rotateAngleX = 1.51843645F;

		bodyModel[322].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 33
		bodyModel[322].setRotationPoint(-19.5F, -2.7F, -32.8F);
		bodyModel[322].rotateAngleX = 1.51843645F;

		bodyModel[323].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 34
		bodyModel[323].setRotationPoint(-13.5F, -2.7F, -32.8F);
		bodyModel[323].rotateAngleX = 1.51843645F;

		bodyModel[324].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 35
		bodyModel[324].setRotationPoint(-7.5F, -2.7F, -32.8F);
		bodyModel[324].rotateAngleX = 1.51843645F;

		bodyModel[325].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 36
		bodyModel[325].setRotationPoint(-53F, -15.5F, -14.5F);

		bodyModel[326].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 37
		bodyModel[326].setRotationPoint(-53F, -15.5F, -12.5F);

		bodyModel[327].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 38
		bodyModel[327].setRotationPoint(-53F, -15.5F, -10.5F);

		bodyModel[328].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 39
		bodyModel[328].setRotationPoint(-53F, -15.5F, -8.5F);

		bodyModel[329].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 40
		bodyModel[329].setRotationPoint(-53F, -15.5F, -6.5F);

		bodyModel[330].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 41
		bodyModel[330].setRotationPoint(-53F, -15.5F, -4.5F);

		bodyModel[331].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 42
		bodyModel[331].setRotationPoint(-53F, -15.5F, -2.5F);

		bodyModel[332].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 43
		bodyModel[332].setRotationPoint(-53F, -15.5F, -0.5F);

		bodyModel[333].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 44
		bodyModel[333].setRotationPoint(-53F, -15.5F, 1.5F);

		bodyModel[334].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 45
		bodyModel[334].setRotationPoint(-53F, -15.5F, 3.5F);

		bodyModel[335].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 46
		bodyModel[335].setRotationPoint(-53F, -15.5F, 5.5F);

		bodyModel[336].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 47
		bodyModel[336].setRotationPoint(-53F, -15.5F, 7.5F);

		bodyModel[337].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 48
		bodyModel[337].setRotationPoint(-53F, -15.5F, 9.5F);

		bodyModel[338].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 49
		bodyModel[338].setRotationPoint(-53F, -15.5F, 11.5F);

		bodyModel[339].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 50
		bodyModel[339].setRotationPoint(-53F, -15.5F, 13.5F);

		bodyModel[340].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 51
		bodyModel[340].setRotationPoint(-53F, -15.5F, 15.5F);

		bodyModel[341].addBox(0F, -3F, -0.5F, 1, 6, 1, 0F); // Box 52
		bodyModel[341].setRotationPoint(-57.5F, -4.7F, -0.4F);
		bodyModel[341].rotateAngleX = 0.29670597F;
		bodyModel[341].rotateAngleZ = 0.59341195F;

		bodyModel[342].addBox(0F, -3F, -0.5F, 1, 6, 1, 0F); // Box 53
		bodyModel[342].setRotationPoint(-57.5F, -4.7F, -0.4F);
		bodyModel[342].rotateAngleX = 0.62831853F;
		bodyModel[342].rotateAngleZ = 0.59341195F;

		bodyModel[343].addBox(0F, -3F, -0.5F, 1, 6, 1, 0F); // Box 54
		bodyModel[343].setRotationPoint(-57.5F, -4.7F, -0.4F);
		bodyModel[343].rotateAngleX = 0.95993109F;
		bodyModel[343].rotateAngleZ = 0.59341195F;

		bodyModel[344].addBox(0F, -3F, -0.5F, 1, 6, 1, 0F); // Box 55
		bodyModel[344].setRotationPoint(-57.5F, -4.7F, -0.4F);
		bodyModel[344].rotateAngleX = 1.30899694F;
		bodyModel[344].rotateAngleZ = 0.59341195F;

		bodyModel[345].addBox(0F, -3F, -0.5F, 1, 6, 1, 0F); // Box 56
		bodyModel[345].setRotationPoint(-57.5F, -4.7F, -0.4F);
		bodyModel[345].rotateAngleX = 1.6406095F;
		bodyModel[345].rotateAngleZ = 0.59341195F;

		bodyModel[346].addBox(0F, -3F, -0.5F, 1, 6, 1, 0F); // Box 57
		bodyModel[346].setRotationPoint(-57.5F, -4.7F, -0.4F);
		bodyModel[346].rotateAngleX = 1.97222205F;
		bodyModel[346].rotateAngleZ = 0.59341195F;

		bodyModel[347].addBox(0F, -3F, -0.5F, 1, 6, 1, 0F); // Box 58
		bodyModel[347].setRotationPoint(-57.5F, -4.7F, -0.4F);
		bodyModel[347].rotateAngleX = 2.26892803F;
		bodyModel[347].rotateAngleZ = 0.59341195F;

		bodyModel[348].addBox(0F, -3F, -0.5F, 1, 6, 1, 0F); // Box 59
		bodyModel[348].setRotationPoint(-57.5F, -4.7F, -0.4F);
		bodyModel[348].rotateAngleX = 2.60054059F;
		bodyModel[348].rotateAngleZ = 0.59341195F;

		bodyModel[349].addBox(0F, -3F, -0.5F, 1, 6, 1, 0F); // Box 60
		bodyModel[349].setRotationPoint(-57.5F, -4.7F, -0.4F);
		bodyModel[349].rotateAngleX = 2.87979327F;
		bodyModel[349].rotateAngleZ = 0.59341195F;
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 257, 249, textureX, textureY); // Box 78
		turretModel[1] = new ModelRendererTurbo(this, 217, 257, textureX, textureY); // Box 50
		turretModel[2] = new ModelRendererTurbo(this, 785, 257, textureX, textureY); // Box 51
		turretModel[3] = new ModelRendererTurbo(this, 961, 265, textureX, textureY); // Box 52
		turretModel[4] = new ModelRendererTurbo(this, 977, 265, textureX, textureY); // Box 53
		turretModel[5] = new ModelRendererTurbo(this, 985, 265, textureX, textureY); // Box 54
		turretModel[6] = new ModelRendererTurbo(this, 785, 265, textureX, textureY); // Box 61
		turretModel[7] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 62
		turretModel[8] = new ModelRendererTurbo(this, 681, 273, textureX, textureY); // Box 63
		turretModel[9] = new ModelRendererTurbo(this, 897, 273, textureX, textureY); // Box 64
		turretModel[10] = new ModelRendererTurbo(this, 921, 273, textureX, textureY); // Box 65
		turretModel[11] = new ModelRendererTurbo(this, 833, 289, textureX, textureY); // Box 88
		turretModel[12] = new ModelRendererTurbo(this, 865, 289, textureX, textureY); // Box 89
		turretModel[13] = new ModelRendererTurbo(this, 897, 289, textureX, textureY); // Box 90
		turretModel[14] = new ModelRendererTurbo(this, 921, 289, textureX, textureY); // Box 91
		turretModel[15] = new ModelRendererTurbo(this, 953, 289, textureX, textureY); // Box 92
		turretModel[16] = new ModelRendererTurbo(this, 985, 289, textureX, textureY); // Box 93
		turretModel[17] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Box 94
		turretModel[18] = new ModelRendererTurbo(this, 33, 297, textureX, textureY); // Box 96
		turretModel[19] = new ModelRendererTurbo(this, 65, 297, textureX, textureY); // Box 97
		turretModel[20] = new ModelRendererTurbo(this, 97, 297, textureX, textureY); // Box 98
		turretModel[21] = new ModelRendererTurbo(this, 129, 297, textureX, textureY); // Box 99
		turretModel[22] = new ModelRendererTurbo(this, 161, 297, textureX, textureY); // Box 102
		turretModel[23] = new ModelRendererTurbo(this, 193, 297, textureX, textureY); // Box 103
		turretModel[24] = new ModelRendererTurbo(this, 225, 297, textureX, textureY); // Box 104
		turretModel[25] = new ModelRendererTurbo(this, 241, 297, textureX, textureY); // Box 106
		turretModel[26] = new ModelRendererTurbo(this, 265, 297, textureX, textureY); // Box 107
		turretModel[27] = new ModelRendererTurbo(this, 745, 273, textureX, textureY); // Box 108
		turretModel[28] = new ModelRendererTurbo(this, 873, 273, textureX, textureY); // Box 109
		turretModel[29] = new ModelRendererTurbo(this, 937, 273, textureX, textureY); // Box 110
		turretModel[30] = new ModelRendererTurbo(this, 297, 297, textureX, textureY); // Box 111
		turretModel[31] = new ModelRendererTurbo(this, 337, 297, textureX, textureY); // Box 112
		turretModel[32] = new ModelRendererTurbo(this, 377, 297, textureX, textureY); // Box 113
		turretModel[33] = new ModelRendererTurbo(this, 417, 297, textureX, textureY); // Box 115
		turretModel[34] = new ModelRendererTurbo(this, 425, 297, textureX, textureY); // Box 116
		turretModel[35] = new ModelRendererTurbo(this, 489, 297, textureX, textureY); // Box 117
		turretModel[36] = new ModelRendererTurbo(this, 465, 297, textureX, textureY); // Box 118
		turretModel[37] = new ModelRendererTurbo(this, 529, 297, textureX, textureY); // Box 119
		turretModel[38] = new ModelRendererTurbo(this, 489, 297, textureX, textureY); // Box 120
		turretModel[39] = new ModelRendererTurbo(this, 561, 297, textureX, textureY); // Box 121
		turretModel[40] = new ModelRendererTurbo(this, 601, 297, textureX, textureY); // Box 0
		turretModel[41] = new ModelRendererTurbo(this, 625, 297, textureX, textureY); // Box 1
		turretModel[42] = new ModelRendererTurbo(this, 649, 297, textureX, textureY); // Box 2
		turretModel[43] = new ModelRendererTurbo(this, 673, 297, textureX, textureY); // Box 3
		turretModel[44] = new ModelRendererTurbo(this, 697, 297, textureX, textureY); // Box 4
		turretModel[45] = new ModelRendererTurbo(this, 729, 297, textureX, textureY); // Box 5
		turretModel[46] = new ModelRendererTurbo(this, 761, 297, textureX, textureY); // Box 6
		turretModel[47] = new ModelRendererTurbo(this, 793, 297, textureX, textureY); // Box 7
		turretModel[48] = new ModelRendererTurbo(this, 297, 305, textureX, textureY); // Box 8
		turretModel[49] = new ModelRendererTurbo(this, 321, 305, textureX, textureY); // Box 9
		turretModel[50] = new ModelRendererTurbo(this, 345, 305, textureX, textureY); // Box 10
		turretModel[51] = new ModelRendererTurbo(this, 369, 305, textureX, textureY); // Box 11
		turretModel[52] = new ModelRendererTurbo(this, 393, 305, textureX, textureY); // Box 12
		turretModel[53] = new ModelRendererTurbo(this, 465, 305, textureX, textureY); // Box 13
		turretModel[54] = new ModelRendererTurbo(this, 529, 305, textureX, textureY); // Box 14
		turretModel[55] = new ModelRendererTurbo(this, 561, 305, textureX, textureY); // Box 15
		turretModel[56] = new ModelRendererTurbo(this, 593, 305, textureX, textureY); // Box 16
		turretModel[57] = new ModelRendererTurbo(this, 625, 305, textureX, textureY); // Box 17
		turretModel[58] = new ModelRendererTurbo(this, 657, 305, textureX, textureY); // Box 18
		turretModel[59] = new ModelRendererTurbo(this, 689, 305, textureX, textureY); // Box 19
		turretModel[60] = new ModelRendererTurbo(this, 721, 305, textureX, textureY); // Box 20
		turretModel[61] = new ModelRendererTurbo(this, 753, 305, textureX, textureY); // Box 21
		turretModel[62] = new ModelRendererTurbo(this, 785, 305, textureX, textureY); // Box 22
		turretModel[63] = new ModelRendererTurbo(this, 425, 305, textureX, textureY); // Box 23
		turretModel[64] = new ModelRendererTurbo(this, 817, 297, textureX, textureY); // Box 25
		turretModel[65] = new ModelRendererTurbo(this, 817, 305, textureX, textureY); // Box 26
		turretModel[66] = new ModelRendererTurbo(this, 841, 305, textureX, textureY); // Box 27
		turretModel[67] = new ModelRendererTurbo(this, 865, 305, textureX, textureY); // Box 28
		turretModel[68] = new ModelRendererTurbo(this, 889, 305, textureX, textureY); // Box 29
		turretModel[69] = new ModelRendererTurbo(this, 913, 305, textureX, textureY); // Box 30
		turretModel[70] = new ModelRendererTurbo(this, 937, 305, textureX, textureY); // Box 31
		turretModel[71] = new ModelRendererTurbo(this, 961, 305, textureX, textureY); // Box 37
		turretModel[72] = new ModelRendererTurbo(this, 985, 305, textureX, textureY); // Box 38
		turretModel[73] = new ModelRendererTurbo(this, 1, 313, textureX, textureY); // Box 39
		turretModel[74] = new ModelRendererTurbo(this, 33, 313, textureX, textureY); // Box 40
		turretModel[75] = new ModelRendererTurbo(this, 57, 313, textureX, textureY); // Box 41
		turretModel[76] = new ModelRendererTurbo(this, 81, 313, textureX, textureY); // Box 42
		turretModel[77] = new ModelRendererTurbo(this, 113, 313, textureX, textureY); // Box 43
		turretModel[78] = new ModelRendererTurbo(this, 145, 313, textureX, textureY); // Box 44
		turretModel[79] = new ModelRendererTurbo(this, 1009, 297, textureX, textureY); // Box 45
		turretModel[80] = new ModelRendererTurbo(this, 489, 305, textureX, textureY); // Box 46
		turretModel[81] = new ModelRendererTurbo(this, 177, 313, textureX, textureY); // Box 47
		turretModel[82] = new ModelRendererTurbo(this, 193, 313, textureX, textureY); // Box 48
		turretModel[83] = new ModelRendererTurbo(this, 209, 313, textureX, textureY); // Box 49
		turretModel[84] = new ModelRendererTurbo(this, 233, 313, textureX, textureY); // Box 50
		turretModel[85] = new ModelRendererTurbo(this, 305, 313, textureX, textureY); // Box 51
		turretModel[86] = new ModelRendererTurbo(this, 329, 313, textureX, textureY); // Box 52
		turretModel[87] = new ModelRendererTurbo(this, 353, 313, textureX, textureY); // Box 53
		turretModel[88] = new ModelRendererTurbo(this, 377, 313, textureX, textureY); // Box 54
		turretModel[89] = new ModelRendererTurbo(this, 401, 313, textureX, textureY); // Box 55
		turretModel[90] = new ModelRendererTurbo(this, 553, 313, textureX, textureY); // Box 56
		turretModel[91] = new ModelRendererTurbo(this, 569, 313, textureX, textureY); // Box 57
		turretModel[92] = new ModelRendererTurbo(this, 585, 313, textureX, textureY); // Box 58
		turretModel[93] = new ModelRendererTurbo(this, 601, 313, textureX, textureY); // Box 1332
		turretModel[94] = new ModelRendererTurbo(this, 617, 313, textureX, textureY); // Box 1333
		turretModel[95] = new ModelRendererTurbo(this, 633, 313, textureX, textureY); // Box 1334
		turretModel[96] = new ModelRendererTurbo(this, 649, 313, textureX, textureY); // Box 1335
		turretModel[97] = new ModelRendererTurbo(this, 681, 313, textureX, textureY); // Box 1336
		turretModel[98] = new ModelRendererTurbo(this, 713, 313, textureX, textureY); // Box 1337
		turretModel[99] = new ModelRendererTurbo(this, 745, 313, textureX, textureY); // Box 1338
		turretModel[100] = new ModelRendererTurbo(this, 761, 313, textureX, textureY); // Box 1339
		turretModel[101] = new ModelRendererTurbo(this, 777, 313, textureX, textureY); // Box 1340
		turretModel[102] = new ModelRendererTurbo(this, 793, 313, textureX, textureY); // Box 1341
		turretModel[103] = new ModelRendererTurbo(this, 809, 313, textureX, textureY); // Box 0
		turretModel[104] = new ModelRendererTurbo(this, 825, 313, textureX, textureY); // Box 1
		turretModel[105] = new ModelRendererTurbo(this, 841, 313, textureX, textureY); // Box 2
		turretModel[106] = new ModelRendererTurbo(this, 857, 313, textureX, textureY); // Box 3
		turretModel[107] = new ModelRendererTurbo(this, 873, 313, textureX, textureY); // Box 4
		turretModel[108] = new ModelRendererTurbo(this, 889, 313, textureX, textureY); // Box 5
		turretModel[109] = new ModelRendererTurbo(this, 905, 313, textureX, textureY); // Box 6
		turretModel[110] = new ModelRendererTurbo(this, 921, 313, textureX, textureY); // Box 7
		turretModel[111] = new ModelRendererTurbo(this, 937, 313, textureX, textureY); // Box 8
		turretModel[112] = new ModelRendererTurbo(this, 953, 313, textureX, textureY); // Box 9
		turretModel[113] = new ModelRendererTurbo(this, 969, 313, textureX, textureY); // Box 11
		turretModel[114] = new ModelRendererTurbo(this, 993, 313, textureX, textureY); // Box 12
		turretModel[115] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Box 13
		turretModel[116] = new ModelRendererTurbo(this, 49, 321, textureX, textureY); // Box 14
		turretModel[117] = new ModelRendererTurbo(this, 17, 273, textureX, textureY); // Box 15
		turretModel[118] = new ModelRendererTurbo(this, 249, 313, textureX, textureY); // Box 16
		turretModel[119] = new ModelRendererTurbo(this, 417, 313, textureX, textureY); // Box 17
		turretModel[120] = new ModelRendererTurbo(this, 465, 313, textureX, textureY); // Box 18
		turretModel[121] = new ModelRendererTurbo(this, 529, 313, textureX, textureY); // Box 19
		turretModel[122] = new ModelRendererTurbo(this, 433, 313, textureX, textureY); // Box 20
		turretModel[123] = new ModelRendererTurbo(this, 841, 281, textureX, textureY); // Box 21
		turretModel[124] = new ModelRendererTurbo(this, 33, 321, textureX, textureY); // Box 22
		turretModel[125] = new ModelRendererTurbo(this, 81, 321, textureX, textureY); // Box 23
		turretModel[126] = new ModelRendererTurbo(this, 257, 321, textureX, textureY); // Box 24
		turretModel[127] = new ModelRendererTurbo(this, 281, 321, textureX, textureY); // Box 25
		turretModel[128] = new ModelRendererTurbo(this, 97, 321, textureX, textureY); // Box 26
		turretModel[129] = new ModelRendererTurbo(this, 353, 321, textureX, textureY); // Box 27
		turretModel[130] = new ModelRendererTurbo(this, 857, 289, textureX, textureY); // Box 28
		turretModel[131] = new ModelRendererTurbo(this, 377, 321, textureX, textureY); // Box 29
		turretModel[132] = new ModelRendererTurbo(this, 889, 289, textureX, textureY); // Box 30
		turretModel[133] = new ModelRendererTurbo(this, 33, 329, textureX, textureY); // Box 31
		turretModel[134] = new ModelRendererTurbo(this, 81, 329, textureX, textureY); // Box 32
		turretModel[135] = new ModelRendererTurbo(this, 113, 329, textureX, textureY); // Box 33
		turretModel[136] = new ModelRendererTurbo(this, 145, 329, textureX, textureY); // Box 34
		turretModel[137] = new ModelRendererTurbo(this, 977, 289, textureX, textureY); // Box 35
		turretModel[138] = new ModelRendererTurbo(this, 1009, 289, textureX, textureY); // Box 36
		turretModel[139] = new ModelRendererTurbo(this, 169, 329, textureX, textureY); // Box 37
		turretModel[140] = new ModelRendererTurbo(this, 193, 329, textureX, textureY); // Box 38
		turretModel[141] = new ModelRendererTurbo(this, 201, 329, textureX, textureY); // Box 39
		turretModel[142] = new ModelRendererTurbo(this, 241, 329, textureX, textureY); // Box 40
		turretModel[143] = new ModelRendererTurbo(this, 225, 329, textureX, textureY); // Box 41
		turretModel[144] = new ModelRendererTurbo(this, 833, 209, textureX, textureY); // Box 42
		turretModel[145] = new ModelRendererTurbo(this, 265, 329, textureX, textureY); // Box 43
		turretModel[146] = new ModelRendererTurbo(this, 257, 329, textureX, textureY); // Box 44
		turretModel[147] = new ModelRendererTurbo(this, 337, 329, textureX, textureY); // Box 45
		turretModel[148] = new ModelRendererTurbo(this, 305, 329, textureX, textureY); // Box 46
		turretModel[149] = new ModelRendererTurbo(this, 385, 329, textureX, textureY); // Box 47
		turretModel[150] = new ModelRendererTurbo(this, 537, 329, textureX, textureY); // Box 48
		turretModel[151] = new ModelRendererTurbo(this, 577, 329, textureX, textureY); // Box 49
		turretModel[152] = new ModelRendererTurbo(this, 337, 329, textureX, textureY); // Box 50
		turretModel[153] = new ModelRendererTurbo(this, 617, 329, textureX, textureY); // Box 51
		turretModel[154] = new ModelRendererTurbo(this, 649, 329, textureX, textureY); // Box 52
		turretModel[155] = new ModelRendererTurbo(this, 681, 329, textureX, textureY); // Box 0
		turretModel[156] = new ModelRendererTurbo(this, 713, 329, textureX, textureY); // Box 2
		turretModel[157] = new ModelRendererTurbo(this, 745, 329, textureX, textureY); // Box 3
		turretModel[158] = new ModelRendererTurbo(this, 777, 329, textureX, textureY); // Box 4
		turretModel[159] = new ModelRendererTurbo(this, 817, 329, textureX, textureY); // Box 5
		turretModel[160] = new ModelRendererTurbo(this, 841, 329, textureX, textureY); // Box 6
		turretModel[161] = new ModelRendererTurbo(this, 881, 329, textureX, textureY); // Box 7
		turretModel[162] = new ModelRendererTurbo(this, 905, 329, textureX, textureY); // Box 8
		turretModel[163] = new ModelRendererTurbo(this, 945, 329, textureX, textureY); // Box 10
		turretModel[164] = new ModelRendererTurbo(this, 969, 329, textureX, textureY); // Box 11
		turretModel[165] = new ModelRendererTurbo(this, 161, 337, textureX, textureY); // Box 12
		turretModel[166] = new ModelRendererTurbo(this, 81, 337, textureX, textureY); // Box 13
		turretModel[167] = new ModelRendererTurbo(this, 889, 209, textureX, textureY); // Box 0
		turretModel[168] = new ModelRendererTurbo(this, 905, 209, textureX, textureY); // Box 1
		turretModel[169] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 2
		turretModel[170] = new ModelRendererTurbo(this, 993, 209, textureX, textureY); // Box 3
		turretModel[171] = new ModelRendererTurbo(this, 593, 217, textureX, textureY); // Box 4
		turretModel[172] = new ModelRendererTurbo(this, 569, 329, textureX, textureY); // Box 5
		turretModel[173] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 6
		turretModel[174] = new ModelRendererTurbo(this, 993, 329, textureX, textureY); // Box 7
		turretModel[175] = new ModelRendererTurbo(this, 345, 337, textureX, textureY); // Box 8
		turretModel[176] = new ModelRendererTurbo(this, 929, 329, textureX, textureY); // Box 16
		turretModel[177] = new ModelRendererTurbo(this, 393, 225, textureX, textureY); // Box 1
		turretModel[178] = new ModelRendererTurbo(this, 609, 329, textureX, textureY); // Box 2
		turretModel[179] = new ModelRendererTurbo(this, 25, 297, textureX, textureY); // Box 3
		turretModel[180] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 4
		turretModel[181] = new ModelRendererTurbo(this, 17, 185, textureX, textureY); // Box 5
		turretModel[182] = new ModelRendererTurbo(this, 65, 209, textureX, textureY); // Box 6
		turretModel[183] = new ModelRendererTurbo(this, 721, 241, textureX, textureY); // Box 7
		turretModel[184] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 8
		turretModel[185] = new ModelRendererTurbo(this, 753, 241, textureX, textureY); // Box 9
		turretModel[186] = new ModelRendererTurbo(this, 793, 241, textureX, textureY); // Box 11
		turretModel[187] = new ModelRendererTurbo(this, 609, 217, textureX, textureY); // Box 12
		turretModel[188] = new ModelRendererTurbo(this, 593, 233, textureX, textureY); // Box 13
		turretModel[189] = new ModelRendererTurbo(this, 929, 241, textureX, textureY); // Box 14

		turretModel[0].addBox(12F, 0F, -4F, 6, 1, 8, 0F); // Box 78
		turretModel[0].setRotationPoint(0F, -26F, 0F);

		turretModel[1].addBox(12F, -2F, -6F, 6, 1, 2, 0F); // Box 50
		turretModel[1].setRotationPoint(0F, -26F, 0F);
		turretModel[1].rotateAngleX = 0.50614548F;

		turretModel[2].addBox(12F, -2F, 4F, 6, 1, 2, 0F); // Box 51
		turretModel[2].setRotationPoint(0F, -26F, 0F);
		turretModel[2].rotateAngleX = -0.50614548F;

		turretModel[3].addBox(12F, 0F, 5F, 6, 9, 1, 0F); // Box 52
		turretModel[3].setRotationPoint(0F, -24F, 0F);
		turretModel[3].rotateAngleX = 0.03490659F;

		turretModel[4].addBox(12F, 0F, -6F, 6, 9, 1, 0F); // Box 53
		turretModel[4].setRotationPoint(0F, -24F, 0F);
		turretModel[4].rotateAngleX = 0.03490659F;

		turretModel[5].addBox(12F, 0F, -6F, 1, 11, 12, 0F); // Box 54
		turretModel[5].setRotationPoint(0F, -26F, 0F);

		turretModel[6].addBox(-3F, -4F, -4F, 6, 2, 2, 0F); // Box 61
		turretModel[6].setRotationPoint(0F, -26F, 0F);
		turretModel[6].rotateAngleZ = -0.15707963F;

		turretModel[7].addBox(-3F, -4F, -1F, 6, 2, 2, 0F); // Box 62
		turretModel[7].setRotationPoint(0F, -26F, 0F);
		turretModel[7].rotateAngleZ = -0.15707963F;

		turretModel[8].addBox(-3F, -4F, 1.7F, 6, 2, 2, 0F); // Box 63
		turretModel[8].setRotationPoint(0F, -26F, 0F);
		turretModel[8].rotateAngleZ = -0.15707963F;

		turretModel[9].addBox(7F, -5F, -2F, 5, 4, 5, 0F); // Box 64
		turretModel[9].setRotationPoint(0F, -26F, 0F);
		turretModel[9].rotateAngleY = -0.33161256F;
		turretModel[9].rotateAngleZ = -0.13962634F;

		turretModel[10].addBox(7F, -5F, -2F, 5, 4, 5, 0F); // Box 65
		turretModel[10].setRotationPoint(0F, -26F, 0F);
		turretModel[10].rotateAngleY = 0.33161256F;
		turretModel[10].rotateAngleZ = -0.13962634F;

		turretModel[11].addBox(6F, -2F, -4F, 6, 1, 8, 0F); // Box 88
		turretModel[11].setRotationPoint(0F, -26F, 0F);
		turretModel[11].rotateAngleZ = -0.12217305F;

		turretModel[12].addBox(6F, -2F, 3F, 6, 1, 8, 0F); // Box 89
		turretModel[12].setRotationPoint(0F, -26F, 0F);
		turretModel[12].rotateAngleY = 0.06981317F;
		turretModel[12].rotateAngleZ = -0.12217305F;

		turretModel[13].addBox(6F, -2F, -11F, 6, 1, 8, 0F); // Box 90
		turretModel[13].setRotationPoint(0F, -26F, 0F);
		turretModel[13].rotateAngleY = -0.06981317F;
		turretModel[13].rotateAngleZ = -0.12217305F;

		turretModel[14].addBox(10F, -4F, -14F, 7, 1, 11, 0F); // Box 91
		turretModel[14].setRotationPoint(0F, -26F, 0F);
		turretModel[14].rotateAngleY = -0.82030475F;
		turretModel[14].rotateAngleZ = -0.2268928F;

		turretModel[15].addBox(10F, -4F, -11F, 6, 1, 8, 0F); // Box 92
		turretModel[15].setRotationPoint(0F, -26F, 0F);
		turretModel[15].rotateAngleY = -0.61086524F;
		turretModel[15].rotateAngleZ = -0.2268928F;

		turretModel[16].addBox(10F, -4F, 3F, 6, 1, 8, 0F); // Box 93
		turretModel[16].setRotationPoint(0F, -26F, 0F);
		turretModel[16].rotateAngleY = 0.61086524F;
		turretModel[16].rotateAngleZ = -0.2268928F;

		turretModel[17].addBox(11F, -4F, 3F, 6, 1, 8, 0F); // Box 94
		turretModel[17].setRotationPoint(0F, -26F, 0F);
		turretModel[17].rotateAngleY = 0.82030475F;
		turretModel[17].rotateAngleZ = -0.2268928F;

		turretModel[18].addBox(19F, -8F, -4F, 6, 1, 8, 0F); // Box 96
		turretModel[18].setRotationPoint(0F, -25F, 0F);
		turretModel[18].rotateAngleY = 3.14159265F;
		turretModel[18].rotateAngleZ = -0.29670597F;

		turretModel[19].addBox(19F, -8F, -4F, 6, 1, 8, 0F); // Box 97
		turretModel[19].setRotationPoint(0F, -25F, 0F);
		turretModel[19].rotateAngleY = 3.43829863F;
		turretModel[19].rotateAngleZ = -0.29670597F;

		turretModel[20].addBox(19F, -8F, -4F, 6, 1, 8, 0F); // Box 98
		turretModel[20].setRotationPoint(0F, -25F, 0F);
		turretModel[20].rotateAngleY = 3.7350046F;
		turretModel[20].rotateAngleZ = -0.29670597F;

		turretModel[21].addBox(19F, -8F, -4F, 6, 1, 8, 0F); // Box 99
		turretModel[21].setRotationPoint(0F, -25F, 0F);
		turretModel[21].rotateAngleY = 4.03171057F;
		turretModel[21].rotateAngleZ = -0.29670597F;

		turretModel[22].addBox(19F, -8F, -4F, 6, 1, 8, 0F); // Box 102
		turretModel[22].setRotationPoint(0F, -25F, 0F);
		turretModel[22].rotateAngleY = 2.84488668F;
		turretModel[22].rotateAngleZ = -0.29670597F;

		turretModel[23].addBox(19F, -8F, -4F, 6, 1, 8, 0F); // Box 103
		turretModel[23].setRotationPoint(0F, -25F, 0F);
		turretModel[23].rotateAngleY = 2.54818071F;
		turretModel[23].rotateAngleZ = -0.29670597F;

		turretModel[24].addBox(19F, -8F, -4F, 6, 1, 8, 0F); // Box 104
		turretModel[24].setRotationPoint(0F, -25F, 0F);
		turretModel[24].rotateAngleY = 2.25147474F;
		turretModel[24].rotateAngleZ = -0.29670597F;

		turretModel[25].addBox(17F, -6F, -11F, 6, 1, 13, 0F); // Box 106
		turretModel[25].setRotationPoint(0F, -26F, 0F);
		turretModel[25].rotateAngleY = -1.65806279F;
		turretModel[25].rotateAngleZ = -0.27925268F;

		turretModel[26].addBox(17F, -6F, -4F, 6, 1, 15, 0F); // Box 107
		turretModel[26].setRotationPoint(0F, -26F, 0F);
		turretModel[26].rotateAngleY = 1.65806279F;
		turretModel[26].rotateAngleZ = -0.27925268F;

		turretModel[27].addBox(-23F, -7.3F, 1.7F, 6, 2, 2, 0F); // Box 108
		turretModel[27].setRotationPoint(0F, -26F, 0F);
		turretModel[27].rotateAngleZ = 0.20943951F;

		turretModel[28].addBox(-23F, -7.3F, -1F, 6, 2, 2, 0F); // Box 109
		turretModel[28].setRotationPoint(0F, -26F, 0F);
		turretModel[28].rotateAngleZ = 0.20943951F;

		turretModel[29].addBox(-23F, -7.3F, -4F, 6, 2, 2, 0F); // Box 110
		turretModel[29].setRotationPoint(0F, -26F, 0F);
		turretModel[29].rotateAngleZ = 0.20943951F;

		turretModel[30].addBox(17F, -9F, 4F, 11, 1, 5, 0F); // Box 111
		turretModel[30].setRotationPoint(0F, -26F, 0F);
		turretModel[30].rotateAngleX = -0.03490659F;
		turretModel[30].rotateAngleY = 1.15191731F;
		turretModel[30].rotateAngleZ = -0.45378561F;

		turretModel[31].addBox(16.5F, -8.8F, 2F, 11, 1, 5, 0F); // Box 112
		turretModel[31].setRotationPoint(0F, -26F, 0F);
		turretModel[31].rotateAngleX = -0.03490659F;
		turretModel[31].rotateAngleY = 0.97738438F;
		turretModel[31].rotateAngleZ = -0.45378561F;

		turretModel[32].addBox(16.5F, -8.8F, -7F, 11, 1, 5, 0F); // Box 113
		turretModel[32].setRotationPoint(0F, -26F, 0F);
		turretModel[32].rotateAngleX = 0.03490659F;
		turretModel[32].rotateAngleY = -0.97738438F;
		turretModel[32].rotateAngleZ = -0.45378561F;

		turretModel[33].addBox(17F, -9F, -9F, 11, 1, 5, 0F); // Box 115
		turretModel[33].setRotationPoint(0F, -26F, 0F);
		turretModel[33].rotateAngleX = 0.03490659F;
		turretModel[33].rotateAngleY = -1.15191731F;
		turretModel[33].rotateAngleZ = -0.45378561F;

		turretModel[34].addBox(-31F, 2F, -13F, 6, 8, 25, 0F); // Box 116
		turretModel[34].setRotationPoint(0F, -29F, 0F);

		turretModel[35].addShapeBox(-35F, 2F, -13F, 4, 8, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -3F); // Box 117
		turretModel[35].setRotationPoint(0F, -29F, 0F);

		turretModel[36].addBox(14.5F, 18.2F, 2F, 6, 1, 5, 0F); // Box 118
		turretModel[36].setRotationPoint(0F, -26F, 0F);
		turretModel[36].rotateAngleX = -0.03490659F;
		turretModel[36].rotateAngleY = 0.99483767F;
		turretModel[36].rotateAngleZ = 0.57595865F;

		turretModel[37].addBox(13F, 16F, 4F, 10, 1, 5, 0F); // Box 119
		turretModel[37].setRotationPoint(0F, -26F, 0F);
		turretModel[37].rotateAngleX = -0.03490659F;
		turretModel[37].rotateAngleY = 1.18682389F;
		turretModel[37].rotateAngleZ = 0.45378561F;

		turretModel[38].addBox(16.5F, 16.2F, -8F, 6, 1, 5, 0F); // Box 120
		turretModel[38].setRotationPoint(0F, -26F, 0F);
		turretModel[38].rotateAngleX = 0.03490659F;
		turretModel[38].rotateAngleY = -0.97738438F;
		turretModel[38].rotateAngleZ = 0.45378561F;

		turretModel[39].addBox(12F, 16F, -9F, 11, 1, 5, 0F); // Box 121
		turretModel[39].setRotationPoint(0F, -26F, 0F);
		turretModel[39].rotateAngleX = 0.03490659F;
		turretModel[39].rotateAngleY = -1.18682389F;
		turretModel[39].rotateAngleZ = 0.45378561F;

		turretModel[40].addBox(15F, 0F, -2F, 7, 1, 4, 0F); // Box 0
		turretModel[40].setRotationPoint(0F, -16F, 0F);
		turretModel[40].rotateAngleY = -0.87266463F;
		turretModel[40].rotateAngleZ = 0.06981317F;

		turretModel[41].addBox(15F, 0F, -2F, 7, 1, 4, 0F); // Box 1
		turretModel[41].setRotationPoint(0F, -16F, 0F);
		turretModel[41].rotateAngleY = -0.6981317F;
		turretModel[41].rotateAngleZ = 0.06981317F;

		turretModel[42].addBox(15F, 0F, -2F, 7, 1, 4, 0F); // Box 2
		turretModel[42].setRotationPoint(0F, -16F, 0F);
		turretModel[42].rotateAngleY = -1.22173048F;
		turretModel[42].rotateAngleZ = 0.06981317F;

		turretModel[43].addBox(15F, 0F, -2F, 7, 1, 4, 0F); // Box 3
		turretModel[43].setRotationPoint(0F, -16F, 0F);
		turretModel[43].rotateAngleY = -1.04719755F;
		turretModel[43].rotateAngleZ = 0.06981317F;

		turretModel[44].addBox(15F, 0F, -2.5F, 10, 1, 5, 0F); // Box 4
		turretModel[44].setRotationPoint(0F, -16F, 0F);
		turretModel[44].rotateAngleY = -1.91986218F;
		turretModel[44].rotateAngleZ = 0.06981317F;

		turretModel[45].addBox(15F, 0F, -2F, 10, 1, 4, 0F); // Box 5
		turretModel[45].setRotationPoint(0F, -16F, 0F);
		turretModel[45].rotateAngleY = -1.74532925F;
		turretModel[45].rotateAngleZ = 0.06981317F;

		turretModel[46].addBox(15F, 0F, -2.5F, 10, 1, 5, 0F); // Box 6
		turretModel[46].setRotationPoint(0F, -16F, 0F);
		turretModel[46].rotateAngleY = -1.57079633F;
		turretModel[46].rotateAngleZ = 0.06981317F;

		turretModel[47].addBox(15F, 0F, -2F, 7, 1, 4, 0F); // Box 7
		turretModel[47].setRotationPoint(0F, -16F, 0F);
		turretModel[47].rotateAngleY = -1.3962634F;
		turretModel[47].rotateAngleZ = 0.06981317F;

		turretModel[48].addBox(15F, 0F, -2F, 7, 1, 4, 0F); // Box 8
		turretModel[48].setRotationPoint(0F, -16F, 0F);
		turretModel[48].rotateAngleY = -3.31612558F;
		turretModel[48].rotateAngleZ = 0.06981317F;

		turretModel[49].addBox(15F, 0F, -2F, 7, 1, 4, 0F); // Box 9
		turretModel[49].setRotationPoint(0F, -16F, 0F);
		turretModel[49].rotateAngleY = -3.14159265F;
		turretModel[49].rotateAngleZ = 0.06981317F;

		turretModel[50].addBox(15F, 0F, -2F, 7, 1, 4, 0F); // Box 10
		turretModel[50].setRotationPoint(0F, -16F, 0F);
		turretModel[50].rotateAngleY = -2.96705973F;
		turretModel[50].rotateAngleZ = 0.06981317F;

		turretModel[51].addBox(15F, 0F, -2F, 7, 1, 4, 0F); // Box 11
		turretModel[51].setRotationPoint(0F, -16F, 0F);
		turretModel[51].rotateAngleY = -2.7925268F;
		turretModel[51].rotateAngleZ = 0.06981317F;

		turretModel[52].addBox(15F, 0F, -2.5F, 10, 1, 5, 0F); // Box 12
		turretModel[52].setRotationPoint(0F, -16F, 0F);
		turretModel[52].rotateAngleY = -2.61799388F;
		turretModel[52].rotateAngleZ = 0.06981317F;

		turretModel[53].addBox(15F, 0F, -2F, 10, 1, 4, 0F); // Box 13
		turretModel[53].setRotationPoint(0F, -16F, 0F);
		turretModel[53].rotateAngleY = -2.44346095F;
		turretModel[53].rotateAngleZ = 0.06981317F;

		turretModel[54].addBox(15F, 0F, -2.5F, 10, 1, 5, 0F); // Box 14
		turretModel[54].setRotationPoint(0F, -16F, 0F);
		turretModel[54].rotateAngleY = -2.26892803F;
		turretModel[54].rotateAngleZ = 0.06981317F;

		turretModel[55].addBox(15F, 0F, -2F, 10, 1, 4, 0F); // Box 15
		turretModel[55].setRotationPoint(0F, -16F, 0F);
		turretModel[55].rotateAngleY = -2.0943951F;
		turretModel[55].rotateAngleZ = 0.06981317F;

		turretModel[56].addBox(15F, 0F, -2.5F, 9, 1, 5, 0F); // Box 16
		turretModel[56].setRotationPoint(0F, -16F, 0F);
		turretModel[56].rotateAngleY = -4.71238898F;
		turretModel[56].rotateAngleZ = 0.06981317F;

		turretModel[57].addBox(15F, 0F, -2F, 10, 1, 4, 0F); // Box 17
		turretModel[57].setRotationPoint(0F, -16F, 0F);
		turretModel[57].rotateAngleY = -4.53785606F;
		turretModel[57].rotateAngleZ = 0.06981317F;

		turretModel[58].addBox(15F, 0F, -2.5F, 10, 1, 5, 0F); // Box 18
		turretModel[58].setRotationPoint(0F, -16F, 0F);
		turretModel[58].rotateAngleY = -4.36332313F;
		turretModel[58].rotateAngleZ = 0.06981317F;

		turretModel[59].addBox(15F, 0F, -2F, 10, 1, 4, 0F); // Box 19
		turretModel[59].setRotationPoint(0F, -16F, 0F);
		turretModel[59].rotateAngleY = -4.1887902F;
		turretModel[59].rotateAngleZ = 0.06981317F;

		turretModel[60].addBox(15F, 0F, -2.5F, 10, 1, 5, 0F); // Box 20
		turretModel[60].setRotationPoint(0F, -16F, 0F);
		turretModel[60].rotateAngleY = -4.01425728F;
		turretModel[60].rotateAngleZ = 0.06981317F;

		turretModel[61].addBox(15F, 0F, -2F, 10, 1, 4, 0F); // Box 21
		turretModel[61].setRotationPoint(0F, -16F, 0F);
		turretModel[61].rotateAngleY = -3.83972435F;
		turretModel[61].rotateAngleZ = 0.06981317F;

		turretModel[62].addBox(15F, 0F, -2.5F, 10, 1, 5, 0F); // Box 22
		turretModel[62].setRotationPoint(0F, -16F, 0F);
		turretModel[62].rotateAngleY = -3.66519143F;
		turretModel[62].rotateAngleZ = 0.06981317F;

		turretModel[63].addBox(15F, 0F, -2F, 7, 1, 4, 0F); // Box 23
		turretModel[63].setRotationPoint(0F, -16F, 0F);
		turretModel[63].rotateAngleY = -3.4906585F;
		turretModel[63].rotateAngleZ = 0.06981317F;

		turretModel[64].addBox(15F, 0F, -2F, 5, 1, 4, 0F); // Box 25
		turretModel[64].setRotationPoint(0F, -16F, 0F);
		turretModel[64].rotateAngleY = -5.93411946F;
		turretModel[64].rotateAngleZ = 0.06981317F;

		turretModel[65].addBox(15F, 0F, -2F, 7, 1, 4, 0F); // Box 26
		turretModel[65].setRotationPoint(0F, -16F, 0F);
		turretModel[65].rotateAngleY = -5.75958653F;
		turretModel[65].rotateAngleZ = 0.06981317F;

		turretModel[66].addBox(15F, 0F, -2F, 7, 1, 4, 0F); // Box 27
		turretModel[66].setRotationPoint(0F, -16F, 0F);
		turretModel[66].rotateAngleY = -5.58505361F;
		turretModel[66].rotateAngleZ = 0.06981317F;

		turretModel[67].addBox(15F, 0F, -2F, 7, 1, 4, 0F); // Box 28
		turretModel[67].setRotationPoint(0F, -16F, 0F);
		turretModel[67].rotateAngleY = -5.41052068F;
		turretModel[67].rotateAngleZ = 0.06981317F;

		turretModel[68].addBox(15F, 0F, -2F, 7, 1, 4, 0F); // Box 29
		turretModel[68].setRotationPoint(0F, -16F, 0F);
		turretModel[68].rotateAngleY = -5.23598776F;
		turretModel[68].rotateAngleZ = 0.06981317F;

		turretModel[69].addBox(15F, 0F, -2F, 7, 1, 4, 0F); // Box 30
		turretModel[69].setRotationPoint(0F, -16F, 0F);
		turretModel[69].rotateAngleY = -5.06145483F;
		turretModel[69].rotateAngleZ = 0.06981317F;

		turretModel[70].addBox(15F, 0F, -2F, 7, 1, 4, 0F); // Box 31
		turretModel[70].setRotationPoint(0F, -16F, 0F);
		turretModel[70].rotateAngleY = -4.88692191F;
		turretModel[70].rotateAngleZ = 0.06981317F;

		turretModel[71].addBox(15F, 0F, -2F, 5, 1, 4, 0F); // Box 37
		turretModel[71].setRotationPoint(0F, -16F, 0F);
		turretModel[71].rotateAngleY = -0.34906585F;
		turretModel[71].rotateAngleZ = 0.06981317F;

		turretModel[72].addBox(15F, 0F, -2F, 7, 1, 4, 0F); // Box 38
		turretModel[72].setRotationPoint(0F, -16F, 0F);
		turretModel[72].rotateAngleY = -0.52359878F;
		turretModel[72].rotateAngleZ = 0.06981317F;

		turretModel[73].addBox(17.5F, -8.8F, -7F, 10, 1, 5, 0F); // Box 39
		turretModel[73].setRotationPoint(0F, -26F, 0F);
		turretModel[73].rotateAngleX = 0.03490659F;
		turretModel[73].rotateAngleY = -0.73303829F;
		turretModel[73].rotateAngleZ = -0.45378561F;

		turretModel[74].addBox(17.5F, 16.2F, -8F, 5, 1, 5, 0F); // Box 40
		turretModel[74].setRotationPoint(0F, -26F, 0F);
		turretModel[74].rotateAngleX = 0.03490659F;
		turretModel[74].rotateAngleY = -0.73303829F;
		turretModel[74].rotateAngleZ = 0.45378561F;

		turretModel[75].addBox(15.5F, 18.2F, 2F, 5, 1, 5, 0F); // Box 41
		turretModel[75].setRotationPoint(0F, -26F, 0F);
		turretModel[75].rotateAngleX = -0.03490659F;
		turretModel[75].rotateAngleY = 0.75049158F;
		turretModel[75].rotateAngleZ = 0.57595865F;

		turretModel[76].addBox(17.5F, -8.8F, 2F, 10, 1, 5, 0F); // Box 42
		turretModel[76].setRotationPoint(0F, -26F, 0F);
		turretModel[76].rotateAngleX = -0.03490659F;
		turretModel[76].rotateAngleY = 0.71558499F;
		turretModel[76].rotateAngleZ = -0.45378561F;

		turretModel[77].addBox(17.5F, -10.8F, 2F, 7, 3, 5, 0F); // Box 43
		turretModel[77].setRotationPoint(0F, -26F, 0F);
		turretModel[77].rotateAngleX = -0.03490659F;
		turretModel[77].rotateAngleY = 0.71558499F;
		turretModel[77].rotateAngleZ = -0.45378561F;

		turretModel[78].addBox(17.5F, -10.8F, -7F, 7, 3, 5, 0F); // Box 44
		turretModel[78].setRotationPoint(0F, -26F, 0F);
		turretModel[78].rotateAngleX = 0.03490659F;
		turretModel[78].rotateAngleY = -0.73303829F;
		turretModel[78].rotateAngleZ = -0.45378561F;

		turretModel[79].addBox(14.5F, 8F, -9.5F, 1, 7, 6, 0F); // Box 45
		turretModel[79].setRotationPoint(0F, -24F, 0F);
		turretModel[79].rotateAngleY = -0.12217305F;
		turretModel[79].rotateAngleZ = 0.41887902F;

		turretModel[80].addBox(16F, 8F, -9.5F, 1, 7, 6, 0F); // Box 46
		turretModel[80].setRotationPoint(0F, -24F, 0F);
		turretModel[80].rotateAngleY = -0.36651914F;
		turretModel[80].rotateAngleZ = 0.40142573F;

		turretModel[81].addBox(14.5F, 8F, 3.8F, 1, 7, 6, 0F); // Box 47
		turretModel[81].setRotationPoint(0F, -24F, 0F);
		turretModel[81].rotateAngleY = 0.12217305F;
		turretModel[81].rotateAngleZ = 0.41887902F;

		turretModel[82].addBox(16.2F, 8F, 4.8F, 1, 7, 6, 0F); // Box 48
		turretModel[82].setRotationPoint(0F, -24F, 0F);
		turretModel[82].rotateAngleY = 0.36651914F;
		turretModel[82].rotateAngleZ = 0.40142573F;

		turretModel[83].addTrapezoid(20F, 4F, 11F, 3, 5, 7, 0F, 0.20F, ModelRendererTurbo.MR_RIGHT); // Box 49
		turretModel[83].setRotationPoint(0F, -26F, 0F);

		turretModel[84].addBox(22F, 4.5F, 11.5F, 3, 4, 6, 0F); // Box 50
		turretModel[84].setRotationPoint(0F, -26F, 0F);

		turretModel[85].addTrapezoid(20F, 4F, -18.5F, 3, 5, 7, 0F, 0.20F, ModelRendererTurbo.MR_RIGHT); // Box 51
		turretModel[85].setRotationPoint(0F, -26F, 0F);

		turretModel[86].addBox(22F, 4.5F, -18F, 3, 4, 6, 0F); // Box 52
		turretModel[86].setRotationPoint(0F, -26F, 0F);

		turretModel[87].addBox(15F, 6F, 11.5F, 5, 1, 6, 0F); // Box 53
		turretModel[87].setRotationPoint(0F, -26F, 0F);

		turretModel[88].addBox(15F, 6F, -18F, 5, 1, 6, 0F); // Box 54
		turretModel[88].setRotationPoint(0F, -26F, 0F);

		turretModel[89].addBox(9.5F, 8F, 3.8F, 1, 7, 6, 0F); // Box 55
		turretModel[89].setRotationPoint(0F, -24F, 0F);
		turretModel[89].rotateAngleY = 0.12217305F;
		turretModel[89].rotateAngleZ = 0.85521133F;

		turretModel[90].addBox(9.5F, 8F, -9.5F, 1, 7, 6, 0F); // Box 56
		turretModel[90].setRotationPoint(0F, -24F, 0F);
		turretModel[90].rotateAngleY = -0.12217305F;
		turretModel[90].rotateAngleZ = 0.85521133F;

		turretModel[91].addBox(10.5F, 9F, -9.5F, 1, 6, 6, 0F); // Box 57
		turretModel[91].setRotationPoint(0F, -24F, 0F);
		turretModel[91].rotateAngleY = -0.36651914F;
		turretModel[91].rotateAngleZ = 0.85521133F;

		turretModel[92].addBox(10.7F, 9F, 4.8F, 1, 6, 6, 0F); // Box 58
		turretModel[92].setRotationPoint(0F, -24F, 0F);
		turretModel[92].rotateAngleY = 0.36651914F;
		turretModel[92].rotateAngleZ = 0.85521133F;

		turretModel[93].addBox(18F, 6F, -3F, 1, 9, 6, 0F); // Box 1332
		turretModel[93].setRotationPoint(0F, -24F, 0F);
		turretModel[93].rotateAngleY = -0.9424778F;
		turretModel[93].rotateAngleZ = 0.38397244F;

		turretModel[94].addBox(18F, 6F, -3F, 1, 9, 6, 0F); // Box 1333
		turretModel[94].setRotationPoint(0F, -24F, 0F);
		turretModel[94].rotateAngleY = -1.20427718F;
		turretModel[94].rotateAngleZ = 0.38397244F;

		turretModel[95].addBox(25F, -3F, -3F, 1, 8, 6, 0F); // Box 1334
		turretModel[95].setRotationPoint(0F, -24F, 0F);
		turretModel[95].rotateAngleY = -2.68780705F;
		turretModel[95].rotateAngleZ = -0.06981317F;

		turretModel[96].addBox(-24F, 9.5F, -4F, 6, 1, 8, 0F); // Box 1335
		turretModel[96].setRotationPoint(0F, -26F, 0F);
		turretModel[96].rotateAngleZ = -0.08726646F;

		turretModel[97].addBox(-24F, 9.8F, -3F, 6, 1, 8, 0F); // Box 1336
		turretModel[97].setRotationPoint(0F, -26F, 0F);
		turretModel[97].rotateAngleX = -0.06981317F;
		turretModel[97].rotateAngleY = -0.31415927F;
		turretModel[97].rotateAngleZ = -0.08726646F;

		turretModel[98].addBox(-24F, 9.8F, -5F, 6, 1, 8, 0F); // Box 1337
		turretModel[98].setRotationPoint(0F, -26F, 0F);
		turretModel[98].rotateAngleX = 0.06981317F;
		turretModel[98].rotateAngleY = 0.31415927F;
		turretModel[98].rotateAngleZ = -0.08726646F;

		turretModel[99].addBox(25F, -3F, -3F, 1, 8, 6, 0F); // Box 1338
		turretModel[99].setRotationPoint(0F, -24F, 0F);
		turretModel[99].rotateAngleY = -2.91469985F;
		turretModel[99].rotateAngleZ = -0.06981317F;

		turretModel[100].addBox(25F, -3F, -3F, 1, 8, 6, 0F); // Box 1339
		turretModel[100].setRotationPoint(0F, -24F, 0F);
		turretModel[100].rotateAngleY = -3.14159265F;
		turretModel[100].rotateAngleZ = -0.06981317F;

		turretModel[101].addBox(25F, -3F, -3F, 1, 8, 6, 0F); // Box 1340
		turretModel[101].setRotationPoint(0F, -24F, 0F);
		turretModel[101].rotateAngleY = -3.36848546F;
		turretModel[101].rotateAngleZ = -0.06981317F;

		turretModel[102].addBox(25F, -3F, -3F, 1, 8, 6, 0F); // Box 1341
		turretModel[102].setRotationPoint(0F, -24F, 0F);
		turretModel[102].rotateAngleY = -3.59537826F;
		turretModel[102].rotateAngleZ = -0.06981317F;

		turretModel[103].addBox(18F, 6F, -3F, 1, 9, 6, 0F); // Box 0
		turretModel[103].setRotationPoint(0F, -24F, 0F);
		turretModel[103].rotateAngleY = 1.25663706F;
		turretModel[103].rotateAngleZ = 0.38397244F;

		turretModel[104].addBox(18F, 6F, -3F, 1, 9, 6, 0F); // Box 1
		turretModel[104].setRotationPoint(0F, -24F, 0F);
		turretModel[104].rotateAngleY = 0.99483767F;
		turretModel[104].rotateAngleZ = 0.38397244F;

		turretModel[105].addBox(25F, -3F, -3F, 1, 8, 6, 0F); // Box 2
		turretModel[105].setRotationPoint(0F, -24F, 0F);
		turretModel[105].rotateAngleY = -2.46091425F;
		turretModel[105].rotateAngleZ = -0.06981317F;

		turretModel[106].addBox(25F, -3F, -1F, 1, 8, 6, 0F); // Box 3
		turretModel[106].setRotationPoint(0F, -24F, 0F);
		turretModel[106].rotateAngleY = -2.32128791F;
		turretModel[106].rotateAngleZ = -0.06981317F;

		turretModel[107].addBox(25F, -3F, -3F, 1, 8, 6, 0F); // Box 4
		turretModel[107].setRotationPoint(0F, -24F, 0F);
		turretModel[107].rotateAngleY = -3.82227106F;
		turretModel[107].rotateAngleZ = -0.06981317F;

		turretModel[108].addBox(25F, -3F, -6F, 1, 8, 6, 0F); // Box 5
		turretModel[108].setRotationPoint(0F, -24F, 0F);
		turretModel[108].rotateAngleY = -3.92699082F;
		turretModel[108].rotateAngleZ = -0.06981317F;

		turretModel[109].addBox(18.8F, 6F, -3F, 1, 9, 6, 0F); // Box 6
		turretModel[109].setRotationPoint(0F, -24F, 0F);
		turretModel[109].rotateAngleY = 1.51843645F;
		turretModel[109].rotateAngleZ = 0.38397244F;

		turretModel[110].addBox(19.6F, 7F, 1F, 1, 8, 6, 0F); // Box 7
		turretModel[110].setRotationPoint(0F, -24F, 0F);
		turretModel[110].rotateAngleY = 1.60570291F;
		turretModel[110].rotateAngleZ = 0.38397244F;

		turretModel[111].addBox(18.8F, 6F, -3F, 1, 9, 6, 0F); // Box 8
		turretModel[111].setRotationPoint(0F, -24F, 0F);
		turretModel[111].rotateAngleY = -1.46607657F;
		turretModel[111].rotateAngleZ = 0.38397244F;

		turretModel[112].addBox(19.6F, 6F, -3F, 1, 9, 6, 0F); // Box 9
		turretModel[112].setRotationPoint(0F, -24F, 0F);
		turretModel[112].rotateAngleY = -1.72787596F;
		turretModel[112].rotateAngleZ = 0.38397244F;

		turretModel[113].addBox(23F, -3F, 6F, 1, 8, 7, 0F); // Box 11
		turretModel[113].setRotationPoint(0F, -24F, 0F);
		turretModel[113].rotateAngleY = -4.64257581F;
		turretModel[113].rotateAngleZ = -0.06981317F;

		turretModel[114].addBox(23F, -3F, -11F, 1, 8, 7, 0F); // Box 12
		turretModel[114].setRotationPoint(0F, -24F, 0F);
		turretModel[114].rotateAngleY = -1.67551608F;
		turretModel[114].rotateAngleZ = -0.06981317F;

		turretModel[115].addShapeBox(25F, -3F, -1F, 6, 8, 15, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F); // Box 13
		turretModel[115].setRotationPoint(0F, -24F, 0F);
		turretModel[115].rotateAngleY = -4.27605667F;
		turretModel[115].rotateAngleZ = -0.03490659F;

		turretModel[116].addShapeBox(25F, -3F, -13F, 6, 8, 15, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F); // Box 14
		turretModel[116].setRotationPoint(0F, -24F, 0F);
		turretModel[116].rotateAngleY = -2.02458193F;
		turretModel[116].rotateAngleZ = -0.03490659F;

		turretModel[117].addBox(3F, 4F, -29F, 2, 2, 5, 0F); // Box 15
		turretModel[117].setRotationPoint(0F, -26F, 0F);
		turretModel[117].rotateAngleY = -0.43633231F;

		turretModel[118].addBox(-5F, 1F, -29F, 6, 2, 2, 0F); // Box 16
		turretModel[118].setRotationPoint(0F, -26F, 0F);
		turretModel[118].rotateAngleY = -0.12217305F;

		turretModel[119].addBox(-5F, 1F, -26F, 6, 2, 2, 0F); // Box 17
		turretModel[119].setRotationPoint(0F, -26F, 0F);
		turretModel[119].rotateAngleY = -0.12217305F;

		turretModel[120].addBox(3F, 4F, -29F, 6, 2, 2, 0F); // Box 18
		turretModel[120].setRotationPoint(0F, -26F, 0F);
		turretModel[120].rotateAngleY = -0.43633231F;

		turretModel[121].addBox(3F, 4F, -26F, 6, 2, 2, 0F); // Box 19
		turretModel[121].setRotationPoint(0F, -26F, 0F);
		turretModel[121].rotateAngleY = -0.43633231F;

		turretModel[122].addBox(-5F, 1F, -29F, 2, 2, 6, 0F); // Box 20
		turretModel[122].setRotationPoint(0F, -26F, 0F);
		turretModel[122].rotateAngleY = -0.12217305F;

		turretModel[123].addBox(9F, 7F, -28F, 2, 2, 5, 0F); // Box 21
		turretModel[123].setRotationPoint(0F, -26F, 0F);
		turretModel[123].rotateAngleY = -0.64577182F;

		turretModel[124].addBox(9F, 7F, -25F, 6, 2, 2, 0F); // Box 22
		turretModel[124].setRotationPoint(0F, -26F, 0F);
		turretModel[124].rotateAngleY = -0.64577182F;

		turretModel[125].addBox(9F, 7F, -28F, 6, 2, 2, 0F); // Box 23
		turretModel[125].setRotationPoint(0F, -26F, 0F);
		turretModel[125].rotateAngleY = -0.64577182F;

		turretModel[126].addBox(-1F, 1F, -30F, 6, 2, 2, 0F); // Box 24
		turretModel[126].setRotationPoint(0F, -26F, 0F);
		turretModel[126].rotateAngleY = -3.01941961F;

		turretModel[127].addBox(-1F, 1F, -27F, 6, 2, 2, 0F); // Box 25
		turretModel[127].setRotationPoint(0F, -26F, 0F);
		turretModel[127].rotateAngleY = -3.01941961F;

		turretModel[128].addBox(3F, 1F, -30F, 2, 2, 6, 0F); // Box 26
		turretModel[128].setRotationPoint(0F, -26F, 0F);
		turretModel[128].rotateAngleY = -3.01941961F;

		turretModel[129].addBox(-9F, 4F, -26F, 6, 2, 2, 0F); // Box 27
		turretModel[129].setRotationPoint(0F, -26F, 0F);
		turretModel[129].rotateAngleY = -2.70526034F;

		turretModel[130].addBox(-5F, 4F, -29F, 2, 2, 5, 0F); // Box 28
		turretModel[130].setRotationPoint(0F, -26F, 0F);
		turretModel[130].rotateAngleY = -2.70526034F;

		turretModel[131].addBox(-9F, 4F, -29F, 6, 2, 2, 0F); // Box 29
		turretModel[131].setRotationPoint(0F, -26F, 0F);
		turretModel[131].rotateAngleY = -2.70526034F;

		turretModel[132].addBox(-11F, 7F, -28F, 2, 2, 5, 0F); // Box 30
		turretModel[132].setRotationPoint(0F, -26F, 0F);
		turretModel[132].rotateAngleY = -2.49582083F;

		turretModel[133].addBox(-15F, 7F, -25F, 6, 2, 2, 0F); // Box 31
		turretModel[133].setRotationPoint(0F, -26F, 0F);
		turretModel[133].rotateAngleY = -2.49582083F;

		turretModel[134].addBox(-15F, 7F, -28F, 6, 2, 2, 0F); // Box 32
		turretModel[134].setRotationPoint(0F, -26F, 0F);
		turretModel[134].rotateAngleY = -2.49582083F;

		turretModel[135].addBox(-1F, 0F, 6F, 7, 4, 7, 0F); // Box 33
		turretModel[135].setRotationPoint(0F, -30F, 0F);

		turretModel[136].addBox(-2F, -1F, -11F, 5, 5, 5, 0F); // Box 34
		turretModel[136].setRotationPoint(0F, -30F, 0F);

		turretModel[137].addBox(1F, -1F, -11F, 5, 5, 1, 0F); // Box 35
		turretModel[137].setRotationPoint(0F, -30F, 0F);
		turretModel[137].rotateAngleY = 0.05235988F;

		turretModel[138].addBox(1.8F, -1F, -7F, 5, 5, 1, 0F); // Box 36
		turretModel[138].setRotationPoint(0F, -30F, 0F);
		turretModel[138].rotateAngleY = -0.05235988F;

		turretModel[139].addBox(0.6F, -1F, -11F, 6, 1, 5, 0F); // Box 37
		turretModel[139].setRotationPoint(0F, -30F, 0F);
		turretModel[139].rotateAngleZ = 0.05235988F;

		turretModel[140].addTrapezoid(-4F, 0F, -17F, 4, 6, 4, 0F, 1.00F, ModelRendererTurbo.MR_BOTTOM); // Box 38
		turretModel[140].setRotationPoint(0F, -31F, 0F);

		turretModel[141].addFlexBox(-16F, -2F, -16F, 5, 3, 11, 0F, 0.00F, 0.00F, -1.00F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 39
		turretModel[141].setRotationPoint(0F, -30F, 0F);
		turretModel[141].rotateAngleX = 0.13962634F;
		turretModel[141].rotateAngleZ = 0.08726646F;

		turretModel[142].addFlexBox(-11F, -2F, -16F, 5, 3, 11, 0F, -1.00F, 0.00F, -2.00F, -2.00F, ModelRendererTurbo.MR_LEFT); // Box 40
		turretModel[142].setRotationPoint(0F, -30F, 0F);
		turretModel[142].rotateAngleX = 0.13962634F;
		turretModel[142].rotateAngleZ = 0.08726646F;

		turretModel[143].addBox(-16F, -4F, -2F, 4, 2, 4, 0F); // Box 41
		turretModel[143].setRotationPoint(0F, -29F, 0F);
		turretModel[143].rotateAngleZ = 0.17453293F;

		turretModel[144].addBox(-20F, 3F, 6F, 1, 3, 1, 0F); // Box 42
		turretModel[144].setRotationPoint(0F, -33F, 0F);

		turretModel[145].addBox(-25F, 5F, -3F, 2, 4, 6, 0F); // Box 43
		turretModel[145].setRotationPoint(0F, -33F, 0F);
		turretModel[145].rotateAngleX = 0.01745329F;
		turretModel[145].rotateAngleY = -0.62831853F;

		turretModel[146].addBox(-3F, -2F, -14F, 9, 1, 28, 0F); // Box 44
		turretModel[146].setRotationPoint(0F, -26F, 0F);
		turretModel[146].rotateAngleZ = -0.15707963F;

		turretModel[147].addBox(-9F, -1F, -13F, 7, 1, 27, 0F); // Box 45
		turretModel[147].setRotationPoint(0F, -27.5F, 0F);

		turretModel[148].addBox(12F, -4.8F, -11F, 6, 1, 13, 0F); // Box 46
		turretModel[148].setRotationPoint(0F, -26F, 0F);
		turretModel[148].rotateAngleY = -1.65806279F;
		turretModel[148].rotateAngleZ = -0.20943951F;

		turretModel[149].addBox(12F, -4.8F, -4F, 6, 1, 15, 0F); // Box 47
		turretModel[149].setRotationPoint(0F, -26F, 0F);
		turretModel[149].rotateAngleY = 1.65806279F;
		turretModel[149].rotateAngleZ = -0.20943951F;

		turretModel[150].addBox(-16F, -0.7F, -10F, 7, 1, 11, 0F); // Box 48
		turretModel[150].setRotationPoint(0F, -29F, 0F);
		turretModel[150].rotateAngleX = 0.01745329F;
		turretModel[150].rotateAngleZ = 0.12217305F;

		turretModel[151].addBox(-16F, -0.7F, 1F, 7, 1, 11, 0F); // Box 49
		turretModel[151].setRotationPoint(0F, -29F, 0F);
		turretModel[151].rotateAngleX = -0.01745329F;
		turretModel[151].rotateAngleZ = 0.12217305F;

		turretModel[152].addBox(-16F, -0.7F, 11F, 7, 1, 5, 0F); // Box 50
		turretModel[152].setRotationPoint(0F, -29F, 0F);
		turretModel[152].rotateAngleX = -0.05235988F;
		turretModel[152].rotateAngleZ = 0.12217305F;

		turretModel[153].addBox(-22F, -2F, 1F, 7, 1, 12, 0F); // Box 51
		turretModel[153].setRotationPoint(0F, -29F, 0F);
		turretModel[153].rotateAngleX = -0.01745329F;
		turretModel[153].rotateAngleZ = 0.20943951F;

		turretModel[154].addBox(-22F, -2F, -13F, 7, 1, 14, 0F); // Box 52
		turretModel[154].setRotationPoint(0F, -29F, 0F);
		turretModel[154].rotateAngleX = 0.01745329F;
		turretModel[154].rotateAngleZ = 0.20943951F;

		turretModel[155].addBox(-16F, -1F, 7.5F, 13, 5, 6, 0F); // Box 0
		turretModel[155].setRotationPoint(0F, -30F, 0F);

		turretModel[156].addBox(-12.5F, -1F, 4F, 6, 5, 13, 0F); // Box 2
		turretModel[156].setRotationPoint(0F, -30F, 0F);

		turretModel[157].addBox(-20.7F, -1F, -2.5F, 13, 5, 6, 0F); // Box 3
		turretModel[157].setRotationPoint(0F, -30F, 0F);
		turretModel[157].rotateAngleY = -0.78539816F;

		turretModel[158].addBox(-17.2F, -1F, -5.9F, 6, 5, 13, 0F); // Box 4
		turretModel[158].setRotationPoint(0F, -30F, 0F);
		turretModel[158].rotateAngleY = -0.78539816F;

		turretModel[159].addBox(-12F, -3F, 5F, 5, 2, 11, 0F); // Box 5
		turretModel[159].setRotationPoint(0F, -30F, 0F);

		turretModel[160].addBox(-19.7F, -3F, -2F, 11, 2, 5, 0F); // Box 6
		turretModel[160].setRotationPoint(0F, -30F, 0F);
		turretModel[160].rotateAngleY = -0.78539816F;

		turretModel[161].addBox(-15F, -3F, 7.5F, 11, 2, 6, 0F); // Box 7
		turretModel[161].setRotationPoint(0F, -30F, 0F);

		turretModel[162].addBox(-16.7F, -3F, -4.9F, 5, 2, 11, 0F); // Box 8
		turretModel[162].setRotationPoint(0F, -30F, 0F);
		turretModel[162].rotateAngleY = -0.78539816F;

		turretModel[163].addFlexBox(-12F, -4F, 5F, 5, 1, 11, 0F, 0.00F, 0.00F, -3.00F, -3.00F, ModelRendererTurbo.MR_TOP); // Box 10
		turretModel[163].setRotationPoint(0F, -30F, 0F);

		turretModel[164].addFlexBox(-19.7F, -4F, -2F, 11, 1, 5, 0F, -3.00F, -3.00F, 0.00F, 0.00F, ModelRendererTurbo.MR_TOP); // Box 11
		turretModel[164].setRotationPoint(0F, -30F, 0F);
		turretModel[164].rotateAngleY = -0.78539816F;

		turretModel[165].addFlexBox(-15F, -4F, 7.5F, 11, 1, 6, 0F, -3.00F, -3.00F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 12
		turretModel[165].setRotationPoint(0F, -30F, 0F);

		turretModel[166].addFlexBox(-16.7F, -4F, -4.9F, 5, 1, 11, 0F, 0F, 0F, -3.00F, -3.00F, ModelRendererTurbo.MR_TOP); // Box 13
		turretModel[166].setRotationPoint(0F, -30F, 0F);
		turretModel[166].rotateAngleY = -0.78539816F;

		turretModel[167].addBox(-7F, 0F, 6F, 1, 1, 2, 0F); // Box 0
		turretModel[167].setRotationPoint(0F, -34.5F, 0F);

		turretModel[168].addShapeBox(-7F, 0F, 4F, 1, 1, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 1
		turretModel[168].setRotationPoint(0F, -34.5F, 0F);

		turretModel[169].addFlexBox(-7F, 0F, 4F, 1, 1, 1, 0F, -0.50F, -0.50F, 0.00F, 0.00F, ModelRendererTurbo.MR_RIGHT); // Box 2
		turretModel[169].setRotationPoint(0F, -34.25F, 0F);

		turretModel[170].addFlexBox(-7F, 1F, 8F, 3, 2, 1, 0F, 0.00F, 1.00F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 3
		turretModel[170].setRotationPoint(0F, -36F, 0F);

		turretModel[171].addFlexBox(-7F, 1F, 11F, 3, 2, 1, 0F, 0.00F, 1.00F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 4
		turretModel[171].setRotationPoint(0F, -36F, 0F);

		turretModel[172].addShapeBox(-7F, 0F, 8F, 4, 1, 4, 0F,0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		turretModel[172].setRotationPoint(0F, -36F, 0F);

		turretModel[173].addBox(-8F, -1F, 8F, 1, 1, 4, 0F); // Box 6
		turretModel[173].setRotationPoint(0F, -34F, 0F);

		turretModel[174].addBox(-7F, -8F, 13F, 4, 6, 9, 0F); // Box 7
		turretModel[174].setRotationPoint(0F, -34F, 0F);

		turretModel[175].addBox(-6.5F, -8F, 17F, 3, 7, 6, 0F); // Box 8
		turretModel[175].setRotationPoint(0F, -34F, 0F);
		turretModel[175].rotateAngleY = 0.33161256F;

		turretModel[176].addBox(-2F, -0.5F, -0.5F, 12, 2, 1, 0F); // Box 16
		turretModel[176].setRotationPoint(-8F, -40F, 9.7F);

		turretModel[177].addBox(-6F, -7.3F, 10F, 3, 1, 3, 0F); // Box 1
		turretModel[177].setRotationPoint(0F, -34F, 0F);

		turretModel[178].addTrapezoid(1.5F, -1.35F, -1F, 6, 1, 2, 0F, -0.20F, ModelRendererTurbo.MR_TOP); // Box 2
		turretModel[178].setRotationPoint(-8F, -40F, 9.7F);

		turretModel[179].addBox(-14F, -2F, 5F, 3, 3, 3, 0F); // Box 3
		turretModel[179].setRotationPoint(0F, -34.4F, 0F);

		turretModel[180].addBox(-11F, -5F, 7.4F, 3, 5, 1, 0F); // Box 4
		turretModel[180].setRotationPoint(0F, -34.4F, 0F);
		turretModel[180].rotateAngleZ = 0.20943951F;

		turretModel[181].addShapeBox(-11F, -6F, 7.4F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		turretModel[181].setRotationPoint(0F, -34.4F, 0F);
		turretModel[181].rotateAngleZ = 0.20943951F;

		turretModel[182].addBox(-10F, -7F, 4.8F, 2, 2, 3, 0F); // Box 6
		turretModel[182].setRotationPoint(0F, -34.4F, 0F);
		turretModel[182].rotateAngleZ = 0.20943951F;

		turretModel[183].addShapeBox(-11.8F, -5F, 11.4F, 3, 6, 1, 0F,-2F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		turretModel[183].setRotationPoint(0F, -34.4F, 0F);
		turretModel[183].rotateAngleZ = -0.01745329F;

		turretModel[184].addBox(-12.5F, -1F, 16F, 1, 1, 4, 0F); // Box 8
		turretModel[184].setRotationPoint(0F, -34F, 0F);

		turretModel[185].addBox(-12.5F, -1F, 14F, 1, 4, 2, 0F); // Box 9
		turretModel[185].setRotationPoint(0F, -34F, 0F);

		turretModel[186].addShapeBox(-7.8F, -5F, 11.4F, 3, 6, 1, 0F,-2F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		turretModel[186].setRotationPoint(0F, -34.4F, 0F);
		turretModel[186].rotateAngleZ = -0.01745329F;

		turretModel[187].addShapeBox(-7.8F, -5F, 11.4F, 3, 2, 1, 0F,-2F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		turretModel[187].setRotationPoint(0F, -34.4F, 0F);
		turretModel[187].rotateAngleZ = -0.01745329F;

		turretModel[188].addShapeBox(-7.8F, -5F, 11.4F, 2, 3, 1, 0F,0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		turretModel[188].setRotationPoint(0F, -35.4F, 0F);
		turretModel[188].rotateAngleZ = -0.01745329F;

		turretModel[189].addShapeBox(-7F, -5F, 9.4F, 1, 1, 3, 0F,0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		turretModel[189].setRotationPoint(0F, -35.4F, 0F);
		turretModel[189].rotateAngleZ = -0.01745329F;
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 281, 273, textureX, textureY); // Box 79
		barrelModel[1] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Box 125
		barrelModel[2] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 135
		barrelModel[3] = new ModelRendererTurbo(this, 1001, 169, textureX, textureY); // Box 136
		barrelModel[4] = new ModelRendererTurbo(this, 209, 177, textureX, textureY); // Box 137
		barrelModel[5] = new ModelRendererTurbo(this, 609, 185, textureX, textureY); // Box 138
		barrelModel[6] = new ModelRendererTurbo(this, 1001, 185, textureX, textureY); // Box 139
		barrelModel[7] = new ModelRendererTurbo(this, 241, 193, textureX, textureY); // Box 140
		barrelModel[8] = new ModelRendererTurbo(this, 329, 193, textureX, textureY); // Box 141
		barrelModel[9] = new ModelRendererTurbo(this, 625, 193, textureX, textureY); // Box 142
		barrelModel[10] = new ModelRendererTurbo(this, 649, 193, textureX, textureY); // Box 143
		barrelModel[11] = new ModelRendererTurbo(this, 681, 193, textureX, textureY); // Box 144
		barrelModel[12] = new ModelRendererTurbo(this, 713, 193, textureX, textureY); // Box 145
		barrelModel[13] = new ModelRendererTurbo(this, 241, 201, textureX, textureY); // Box 146
		barrelModel[14] = new ModelRendererTurbo(this, 745, 193, textureX, textureY); // Box 147
		barrelModel[15] = new ModelRendererTurbo(this, 777, 193, textureX, textureY); // Box 148
		barrelModel[16] = new ModelRendererTurbo(this, 849, 193, textureX, textureY); // Box 149
		barrelModel[17] = new ModelRendererTurbo(this, 993, 201, textureX, textureY); // Box 150
		barrelModel[18] = new ModelRendererTurbo(this, 881, 193, textureX, textureY); // Box 151
		barrelModel[19] = new ModelRendererTurbo(this, 913, 193, textureX, textureY); // Box 152
		barrelModel[20] = new ModelRendererTurbo(this, 945, 193, textureX, textureY); // Box 153
		barrelModel[21] = new ModelRendererTurbo(this, 961, 193, textureX, textureY); // Box 154
		barrelModel[22] = new ModelRendererTurbo(this, 985, 193, textureX, textureY); // Box 155
		barrelModel[23] = new ModelRendererTurbo(this, 17, 201, textureX, textureY); // Box 156
		barrelModel[24] = new ModelRendererTurbo(this, 281, 201, textureX, textureY); // Box 157
		barrelModel[25] = new ModelRendererTurbo(this, 369, 201, textureX, textureY); // Box 158
		barrelModel[26] = new ModelRendererTurbo(this, 401, 201, textureX, textureY); // Box 159
		barrelModel[27] = new ModelRendererTurbo(this, 433, 201, textureX, textureY); // Box 160
		barrelModel[28] = new ModelRendererTurbo(this, 465, 201, textureX, textureY); // Box 161
		barrelModel[29] = new ModelRendererTurbo(this, 497, 201, textureX, textureY); // Box 162
		barrelModel[30] = new ModelRendererTurbo(this, 561, 201, textureX, textureY); // Box 163
		barrelModel[31] = new ModelRendererTurbo(this, 585, 201, textureX, textureY); // Box 164
		barrelModel[32] = new ModelRendererTurbo(this, 617, 201, textureX, textureY); // Box 165
		barrelModel[33] = new ModelRendererTurbo(this, 833, 201, textureX, textureY); // Box 166
		barrelModel[34] = new ModelRendererTurbo(this, 905, 201, textureX, textureY); // Box 167
		barrelModel[35] = new ModelRendererTurbo(this, 73, 209, textureX, textureY); // Box 168
		barrelModel[36] = new ModelRendererTurbo(this, 89, 209, textureX, textureY); // Box 169
		barrelModel[37] = new ModelRendererTurbo(this, 281, 273, textureX, textureY); // Box 1258
		barrelModel[38] = new ModelRendererTurbo(this, 281, 273, textureX, textureY); // Box 1259
		barrelModel[39] = new ModelRendererTurbo(this, 281, 273, textureX, textureY); // Box 1260
		barrelModel[40] = new ModelRendererTurbo(this, 281, 273, textureX, textureY); // Box 1263
		barrelModel[41] = new ModelRendererTurbo(this, 281, 273, textureX, textureY); // Box 1264
		barrelModel[42] = new ModelRendererTurbo(this, 281, 273, textureX, textureY); // Box 1265
		barrelModel[43] = new ModelRendererTurbo(this, 281, 273, textureX, textureY); // Box 1266
		barrelModel[44] = new ModelRendererTurbo(this, 281, 273, textureX, textureY); // Box 1268
		barrelModel[45] = new ModelRendererTurbo(this, 609, 209, textureX, textureY); // Box 1269
		barrelModel[46] = new ModelRendererTurbo(this, 1009, 209, textureX, textureY); // Box 1270
		barrelModel[47] = new ModelRendererTurbo(this, 849, 217, textureX, textureY); // Box 1272
		barrelModel[48] = new ModelRendererTurbo(this, 921, 217, textureX, textureY); // Box 1273
		barrelModel[49] = new ModelRendererTurbo(this, 937, 217, textureX, textureY); // Box 1274
		barrelModel[50] = new ModelRendererTurbo(this, 857, 273, textureX, textureY); // Box 55
		barrelModel[51] = new ModelRendererTurbo(this, 1001, 265, textureX, textureY); // Box 57
		barrelModel[52] = new ModelRendererTurbo(this, 217, 265, textureX, textureY); // Box 58
		barrelModel[53] = new ModelRendererTurbo(this, 889, 257, textureX, textureY); // Box 59
		barrelModel[54] = new ModelRendererTurbo(this, 881, 273, textureX, textureY); // Box 60
		barrelModel[55] = new ModelRendererTurbo(this, 705, 273, textureX, textureY); // Box 70
		barrelModel[56] = new ModelRendererTurbo(this, 945, 281, textureX, textureY); // Box 71
		barrelModel[57] = new ModelRendererTurbo(this, 201, 289, textureX, textureY); // Box 72
		barrelModel[58] = new ModelRendererTurbo(this, 241, 289, textureX, textureY); // Box 73
		barrelModel[59] = new ModelRendererTurbo(this, 281, 289, textureX, textureY); // Box 74
		barrelModel[60] = new ModelRendererTurbo(this, 321, 289, textureX, textureY); // Box 75
		barrelModel[61] = new ModelRendererTurbo(this, 361, 289, textureX, textureY); // Box 76
		barrelModel[62] = new ModelRendererTurbo(this, 401, 289, textureX, textureY); // Box 77
		barrelModel[63] = new ModelRendererTurbo(this, 441, 289, textureX, textureY); // Box 78
		barrelModel[64] = new ModelRendererTurbo(this, 481, 289, textureX, textureY); // Box 79
		barrelModel[65] = new ModelRendererTurbo(this, 521, 289, textureX, textureY); // Box 80
		barrelModel[66] = new ModelRendererTurbo(this, 561, 289, textureX, textureY); // Box 81
		barrelModel[67] = new ModelRendererTurbo(this, 601, 289, textureX, textureY); // Box 82
		barrelModel[68] = new ModelRendererTurbo(this, 641, 289, textureX, textureY); // Box 83
		barrelModel[69] = new ModelRendererTurbo(this, 681, 289, textureX, textureY); // Box 84
		barrelModel[70] = new ModelRendererTurbo(this, 721, 289, textureX, textureY); // Box 85
		barrelModel[71] = new ModelRendererTurbo(this, 761, 289, textureX, textureY); // Box 86
		barrelModel[72] = new ModelRendererTurbo(this, 801, 289, textureX, textureY); // Box 87
		barrelModel[73] = new ModelRendererTurbo(this, 417, 337, textureX, textureY); // Box 10
		barrelModel[74] = new ModelRendererTurbo(this, 1, 345, textureX, textureY); // Box 11
		barrelModel[75] = new ModelRendererTurbo(this, 105, 345, textureX, textureY); // Box 12
		barrelModel[76] = new ModelRendererTurbo(this, 177, 345, textureX, textureY); // Box 13
		barrelModel[77] = new ModelRendererTurbo(this, 433, 345, textureX, textureY); // Box 14
		barrelModel[78] = new ModelRendererTurbo(this, 505, 345, textureX, textureY); // Box 15
		barrelModel[79] = new ModelRendererTurbo(this, 281, 273, textureX, textureY); // Box 1434

		barrelModel[0].addShapeBox(0F, 0.6F, -0.5F, 97, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		barrelModel[0].setRotationPoint(12F, -20F, 0F);
		barrelModel[0].rotateAngleZ = 0.00193906F;

		barrelModel[1].addShapeBox(3F, -4.6F, -0.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 125
		barrelModel[1].setRotationPoint(12F, -20F, 0F);

		barrelModel[2].addShapeBox(3F, -4.6F, -0.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 135
		barrelModel[2].setRotationPoint(12F, -20F, 0F);
		barrelModel[2].rotateAngleX = 0.19198622F;

		barrelModel[3].addShapeBox(3F, -4.6F, -0.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 136
		barrelModel[3].setRotationPoint(12F, -20F, 0F);
		barrelModel[3].rotateAngleX = 0.40142573F;

		barrelModel[4].addShapeBox(3F, -4.6F, -0.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 137
		barrelModel[4].setRotationPoint(12F, -20F, 0F);
		barrelModel[4].rotateAngleX = 0.61086524F;

		barrelModel[5].addShapeBox(3F, -4.6F, -0.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 138
		barrelModel[5].setRotationPoint(12F, -20F, 0F);
		barrelModel[5].rotateAngleX = 1.43116999F;

		barrelModel[6].addShapeBox(3F, -4.6F, -0.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 139
		barrelModel[6].setRotationPoint(12F, -20F, 0F);
		barrelModel[6].rotateAngleX = 1.22173048F;

		barrelModel[7].addShapeBox(3F, -4.6F, -0.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 140
		barrelModel[7].setRotationPoint(12F, -20F, 0F);
		barrelModel[7].rotateAngleX = 1.01229097F;

		barrelModel[8].addShapeBox(3F, -4.6F, -0.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 141
		barrelModel[8].setRotationPoint(12F, -20F, 0F);
		barrelModel[8].rotateAngleX = 0.82030475F;

		barrelModel[9].addShapeBox(3F, -4.6F, -0.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 142
		barrelModel[9].setRotationPoint(12F, -20F, 0F);
		barrelModel[9].rotateAngleX = 6.09119909F;

		barrelModel[10].addShapeBox(3F, -4.6F, -0.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 143
		barrelModel[10].setRotationPoint(12F, -20F, 0F);
		barrelModel[10].rotateAngleX = 5.88175958F;

		barrelModel[11].addShapeBox(3F, -4.6F, -0.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 144
		barrelModel[11].setRotationPoint(12F, -20F, 0F);
		barrelModel[11].rotateAngleX = 5.67232007F;

		barrelModel[12].addShapeBox(3F, -4.6F, -0.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 145
		barrelModel[12].setRotationPoint(12F, -20F, 0F);
		barrelModel[12].rotateAngleX = 5.48033385F;

		barrelModel[13].addShapeBox(3F, -4.6F, -0.5F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 146
		barrelModel[13].setRotationPoint(12F, -20F, 0F);
		barrelModel[13].rotateAngleX = 4.64257581F;

		barrelModel[14].addShapeBox(3F, -4.6F, -0.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 147
		barrelModel[14].setRotationPoint(12F, -20F, 0F);
		barrelModel[14].rotateAngleX = 4.85201532F;

		barrelModel[15].addShapeBox(3F, -4.6F, -0.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 148
		barrelModel[15].setRotationPoint(12F, -20F, 0F);
		barrelModel[15].rotateAngleX = 5.06145483F;

		barrelModel[16].addShapeBox(3F, -4.6F, -0.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 149
		barrelModel[16].setRotationPoint(12F, -20F, 0F);
		barrelModel[16].rotateAngleX = 5.27089434F;

		barrelModel[17].addShapeBox(3F, -4.6F, -1.5F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 150
		barrelModel[17].setRotationPoint(12F, -20F, 0F);
		barrelModel[17].rotateAngleX = 1.6406095F;

		barrelModel[18].addShapeBox(9F, -3.1F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 151
		barrelModel[18].setRotationPoint(12F, -20F, 0F);

		barrelModel[19].addShapeBox(9F, -3.1F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 152
		barrelModel[19].setRotationPoint(12F, -20F, 0F);
		barrelModel[19].rotateAngleX = 0.33161256F;

		barrelModel[20].addShapeBox(9F, -3.1F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 153
		barrelModel[20].setRotationPoint(12F, -20F, 0F);
		barrelModel[20].rotateAngleX = 0.66322512F;

		barrelModel[21].addShapeBox(9F, -3.1F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 154
		barrelModel[21].setRotationPoint(12F, -20F, 0F);
		barrelModel[21].rotateAngleX = 0.99483767F;

		barrelModel[22].addShapeBox(9F, -3.1F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 155
		barrelModel[22].setRotationPoint(12F, -20F, 0F);
		barrelModel[22].rotateAngleX = 1.30899694F;

		barrelModel[23].addShapeBox(9F, -3.1F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 156
		barrelModel[23].setRotationPoint(12F, -20F, 0F);
		barrelModel[23].rotateAngleX = 1.6406095F;

		barrelModel[24].addShapeBox(9F, -3.1F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 157
		barrelModel[24].setRotationPoint(12F, -20F, 0F);
		barrelModel[24].rotateAngleX = 1.97222205F;

		barrelModel[25].addShapeBox(9F, -3.1F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 158
		barrelModel[25].setRotationPoint(12F, -20F, 0F);
		barrelModel[25].rotateAngleX = 2.30383461F;

		barrelModel[26].addShapeBox(9F, -3.1F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 159
		barrelModel[26].setRotationPoint(12F, -20F, 0F);
		barrelModel[26].rotateAngleX = 2.61799388F;

		barrelModel[27].addShapeBox(9F, -3.1F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 160
		barrelModel[27].setRotationPoint(12F, -20F, 0F);
		barrelModel[27].rotateAngleX = 5.95157275F;

		barrelModel[28].addShapeBox(9F, -3.1F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 161
		barrelModel[28].setRotationPoint(12F, -20F, 0F);
		barrelModel[28].rotateAngleX = 5.63741348F;

		barrelModel[29].addShapeBox(9F, -3.1F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 162
		barrelModel[29].setRotationPoint(12F, -20F, 0F);
		barrelModel[29].rotateAngleX = 5.30580093F;

		barrelModel[30].addShapeBox(9F, -3.1F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 163
		barrelModel[30].setRotationPoint(12F, -20F, 0F);
		barrelModel[30].rotateAngleX = 4.97418837F;

		barrelModel[31].addShapeBox(9F, -3.1F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 164
		barrelModel[31].setRotationPoint(12F, -20F, 0F);
		barrelModel[31].rotateAngleX = 4.64257581F;

		barrelModel[32].addShapeBox(9F, -3.1F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 165
		barrelModel[32].setRotationPoint(12F, -20F, 0F);
		barrelModel[32].rotateAngleX = 4.32841654F;

		barrelModel[33].addShapeBox(9F, -3.1F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 166
		barrelModel[33].setRotationPoint(12F, -20F, 0F);
		barrelModel[33].rotateAngleX = 3.99680399F;

		barrelModel[34].addShapeBox(9F, -3.1F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 167
		barrelModel[34].setRotationPoint(12F, -20F, 0F);
		barrelModel[34].rotateAngleX = 3.66519143F;

		barrelModel[35].addShapeBox(9F, -3.1F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 168
		barrelModel[35].setRotationPoint(12F, -20F, 0F);
		barrelModel[35].rotateAngleX = 3.31612558F;

		barrelModel[36].addShapeBox(9F, -3.1F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 169
		barrelModel[36].setRotationPoint(12F, -20F, 0F);
		barrelModel[36].rotateAngleX = 2.96705973F;

		barrelModel[37].addShapeBox(0F, 0.6F, -0.5F, 97, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1258
		barrelModel[37].setRotationPoint(12F, -20F, 0F);
		barrelModel[37].rotateAngleX = 0.62831853F;
		barrelModel[37].rotateAngleZ = 0.00193906F;

		barrelModel[38].addShapeBox(0F, 0.6F, -0.5F, 97, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1259
		barrelModel[38].setRotationPoint(12F, -20F, 0F);
		barrelModel[38].rotateAngleX = 1.88495559F;
		barrelModel[38].rotateAngleZ = 0.00193906F;

		barrelModel[39].addShapeBox(0F, 0.6F, -0.5F, 97, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1260
		barrelModel[39].setRotationPoint(12F, -20F, 0F);
		barrelModel[39].rotateAngleX = 1.25663706F;
		barrelModel[39].rotateAngleZ = 0.00193906F;

		barrelModel[40].addShapeBox(0F, 0.6F, -0.5F, 97, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1263
		barrelModel[40].setRotationPoint(12F, -20F, 0F);
		barrelModel[40].rotateAngleX = 3.14159265F;
		barrelModel[40].rotateAngleZ = 0.00193906F;

		barrelModel[41].addShapeBox(0F, 0.6F, -0.5F, 97, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1264
		barrelModel[41].setRotationPoint(12F, -20F, 0F);
		barrelModel[41].rotateAngleX = 2.51327412F;
		barrelModel[41].rotateAngleZ = 0.00193906F;

		barrelModel[42].addShapeBox(0F, 0.6F, -0.5F, 97, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1265
		barrelModel[42].setRotationPoint(12F, -20F, 0F);
		barrelModel[42].rotateAngleX = 5.65486678F;
		barrelModel[42].rotateAngleZ = 0.00193906F;

		barrelModel[43].addShapeBox(0F, 0.6F, -0.5F, 97, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1266
		barrelModel[43].setRotationPoint(12F, -20F, 0F);
		barrelModel[43].rotateAngleX = 5.02654825F;
		barrelModel[43].rotateAngleZ = 0.00193906F;

		barrelModel[44].addShapeBox(0F, 0.6F, -0.5F, 97, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1268
		barrelModel[44].setRotationPoint(12F, -20F, 0F);
		barrelModel[44].rotateAngleX = 3.76991118F;
		barrelModel[44].rotateAngleZ = 0.00193906F;

		barrelModel[45].addShapeBox(3F, -4F, -1F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 1269
		barrelModel[45].setRotationPoint(12F, -20F, 0F);
		barrelModel[45].rotateAngleX = 1.97222205F;

		barrelModel[46].addShapeBox(3F, -4F, -1F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 1270
		barrelModel[46].setRotationPoint(12F, -20F, 0F);
		barrelModel[46].rotateAngleX = 4.01425728F;

		barrelModel[47].addShapeBox(3F, -3.5F, 0.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 1272
		barrelModel[47].setRotationPoint(12F, -20F, 0F);
		barrelModel[47].rotateAngleX = 4.24115008F;

		barrelModel[48].addShapeBox(3F, -3.5F, 0.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 1273
		barrelModel[48].setRotationPoint(12F, -20F, 0F);
		barrelModel[48].rotateAngleX = 2.67035376F;

		barrelModel[49].addShapeBox(3F, 1.6F, -2.5F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1274
		barrelModel[49].setRotationPoint(12F, -20F, 0F);
		barrelModel[49].rotateAngleZ = 0.00193906F;

		barrelModel[50].addBox(5F, -2F, -5F, 1, 3, 10, 0F); // Box 55
		barrelModel[50].setRotationPoint(12F, -20F, 0F);

		barrelModel[51].addBox(5F, -2F, -5F, 1, 1, 10, 0F); // Box 57
		barrelModel[51].setRotationPoint(12F, -20F, 0F);
		barrelModel[51].rotateAngleZ = 0.15707963F;

		barrelModel[52].addBox(5F, -2F, -4F, 1, 1, 8, 0F); // Box 58
		barrelModel[52].setRotationPoint(12F, -20F, 0F);
		barrelModel[52].rotateAngleZ = 0.29670597F;

		barrelModel[53].addBox(4.5F, -3F, -3F, 1, 1, 6, 0F); // Box 59
		barrelModel[53].setRotationPoint(12F, -20F, 0F);
		barrelModel[53].rotateAngleZ = 0.29670597F;

		barrelModel[54].addBox(5F, -2F, -5F, 1, 1, 10, 0F); // Box 60
		barrelModel[54].setRotationPoint(12F, -20F, 0F);
		barrelModel[54].rotateAngleZ = -0.41887902F;

		barrelModel[55].addBox(55F, -2.8F, -0.5F, 16, 1, 1, 0F); // Box 70
		barrelModel[55].setRotationPoint(12F, -20F, 0F);
		barrelModel[55].rotateAngleX = 0.6981317F;

		barrelModel[56].addBox(55F, -2.8F, -0.5F, 16, 1, 1, 0F); // Box 71
		barrelModel[56].setRotationPoint(12F, -20F, 0F);
		barrelModel[56].rotateAngleX = 1.04719755F;

		barrelModel[57].addBox(55F, -2.8F, -0.5F, 16, 1, 1, 0F); // Box 72
		barrelModel[57].setRotationPoint(12F, -20F, 0F);
		barrelModel[57].rotateAngleX = 1.74532925F;

		barrelModel[58].addBox(55F, -2.8F, -0.5F, 16, 1, 1, 0F); // Box 73
		barrelModel[58].setRotationPoint(12F, -20F, 0F);
		barrelModel[58].rotateAngleX = 1.3962634F;

		barrelModel[59].addBox(55F, -2.8F, -0.5F, 16, 1, 1, 0F); // Box 74
		barrelModel[59].setRotationPoint(12F, -20F, 0F);
		barrelModel[59].rotateAngleX = 3.14159265F;

		barrelModel[60].addBox(55F, -2.8F, -0.5F, 16, 1, 1, 0F); // Box 75
		barrelModel[60].setRotationPoint(12F, -20F, 0F);
		barrelModel[60].rotateAngleX = 3.83972435F;

		barrelModel[61].addBox(55F, -2.8F, -0.5F, 16, 1, 1, 0F); // Box 76
		barrelModel[61].setRotationPoint(12F, -20F, 0F);
		barrelModel[61].rotateAngleX = 3.4906585F;

		barrelModel[62].addBox(55F, -2.8F, -0.5F, 16, 1, 1, 0F); // Box 77
		barrelModel[62].setRotationPoint(12F, -20F, 0F);
		barrelModel[62].rotateAngleX = 2.7925268F;

		barrelModel[63].addBox(55F, -2.8F, -0.5F, 16, 1, 1, 0F); // Box 78
		barrelModel[63].setRotationPoint(12F, -20F, 0F);
		barrelModel[63].rotateAngleX = 2.44346095F;

		barrelModel[64].addBox(55F, -2.8F, -0.5F, 16, 1, 1, 0F); // Box 79
		barrelModel[64].setRotationPoint(12F, -20F, 0F);
		barrelModel[64].rotateAngleX = 2.0943951F;

		barrelModel[65].addBox(55F, -2.8F, -0.5F, 16, 1, 1, 0F); // Box 80
		barrelModel[65].setRotationPoint(12F, -20F, 0F);
		barrelModel[65].rotateAngleX = 5.93411946F;

		barrelModel[66].addBox(55F, -2.8F, -0.5F, 16, 1, 1, 0F); // Box 81
		barrelModel[66].setRotationPoint(12F, -20F, 0F);
		barrelModel[66].rotateAngleX = 6.63225116F;

		barrelModel[67].addBox(55F, -2.8F, -0.5F, 16, 1, 1, 0F); // Box 82
		barrelModel[67].setRotationPoint(12F, -20F, 0F);
		barrelModel[67].rotateAngleX = 6.28318531F;

		barrelModel[68].addBox(55F, -2.8F, -0.5F, 16, 1, 1, 0F); // Box 83
		barrelModel[68].setRotationPoint(12F, -20F, 0F);
		barrelModel[68].rotateAngleX = 5.58505361F;

		barrelModel[69].addBox(55F, -2.8F, -0.5F, 16, 1, 1, 0F); // Box 84
		barrelModel[69].setRotationPoint(12F, -20F, 0F);
		barrelModel[69].rotateAngleX = 5.23598776F;

		barrelModel[70].addBox(55F, -2.8F, -0.5F, 16, 1, 1, 0F); // Box 85
		barrelModel[70].setRotationPoint(12F, -20F, 0F);
		barrelModel[70].rotateAngleX = 4.88692191F;

		barrelModel[71].addBox(55F, -2.8F, -0.5F, 16, 1, 1, 0F); // Box 86
		barrelModel[71].setRotationPoint(12F, -20F, 0F);
		barrelModel[71].rotateAngleX = 4.53785606F;

		barrelModel[72].addBox(55F, -2.8F, -0.5F, 16, 1, 1, 0F); // Box 87
		barrelModel[72].setRotationPoint(12F, -20F, 0F);
		barrelModel[72].rotateAngleX = 4.1887902F;

		barrelModel[73].addShapeBox(-2F, -0.5F, -0.5F, 32, 1, 1, 0F,0F, -0.9F, -0.2F, 0F, -0.9F, -0.2F, 0F, -0.9F, -0.2F, 0F, -0.9F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 10
		barrelModel[73].setRotationPoint(-8F, -40F, 9.7F);

		barrelModel[74].addShapeBox(-2F, -0.5F, -0.5F, 32, 1, 1, 0F,0F, -0.9F, -0.2F, 0F, -0.9F, -0.2F, 0F, -0.9F, -0.2F, 0F, -0.9F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 11
		barrelModel[74].setRotationPoint(-8F, -40F, 9.7F);
		barrelModel[74].rotateAngleX = 1.04719755F;

		barrelModel[75].addShapeBox(-2F, -0.5F, -0.5F, 32, 1, 1, 0F,0F, -0.9F, -0.2F, 0F, -0.9F, -0.2F, 0F, -0.9F, -0.2F, 0F, -0.9F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 12
		barrelModel[75].setRotationPoint(-8F, -40F, 9.7F);
		barrelModel[75].rotateAngleX = 3.14159265F;

		barrelModel[76].addShapeBox(-2F, -0.5F, -0.5F, 32, 1, 1, 0F,0F, -0.9F, -0.2F, 0F, -0.9F, -0.2F, 0F, -0.9F, -0.2F, 0F, -0.9F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 13
		barrelModel[76].setRotationPoint(-8F, -40F, 9.7F);
		barrelModel[76].rotateAngleX = 2.0943951F;

		barrelModel[77].addShapeBox(-2F, -0.5F, -0.5F, 32, 1, 1, 0F,0F, -0.9F, -0.2F, 0F, -0.9F, -0.2F, 0F, -0.9F, -0.2F, 0F, -0.9F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 14
		barrelModel[77].setRotationPoint(-8F, -40F, 9.7F);
		barrelModel[77].rotateAngleX = 5.23598776F;

		barrelModel[78].addShapeBox(-2F, -0.5F, -0.5F, 32, 1, 1, 0F,0F, -0.9F, -0.2F, 0F, -0.9F, -0.2F, 0F, -0.9F, -0.2F, 0F, -0.9F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 15
		barrelModel[78].setRotationPoint(-8F, -40F, 9.7F);
		barrelModel[78].rotateAngleX = 4.1887902F;

		barrelModel[79].addShapeBox(0F, 0.6F, -0.5F, 97, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1434
		barrelModel[79].setRotationPoint(12F, -20F, 0F);
		barrelModel[79].rotateAngleX = 4.39822972F;
		barrelModel[79].rotateAngleZ = 0.00193906F;
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 344
		leftTrackModel[1] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 345
		leftTrackModel[2] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 346
		leftTrackModel[3] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 347
		leftTrackModel[4] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 348
		leftTrackModel[5] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 349
		leftTrackModel[6] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 350
		leftTrackModel[7] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 351
		leftTrackModel[8] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 352
		leftTrackModel[9] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 353
		leftTrackModel[10] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 354
		leftTrackModel[11] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 355
		leftTrackModel[12] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Box 356
		leftTrackModel[13] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Box 357
		leftTrackModel[14] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 358
		leftTrackModel[15] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 359
		leftTrackModel[16] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 360
		leftTrackModel[17] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 361
		leftTrackModel[18] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 362
		leftTrackModel[19] = new ModelRendererTurbo(this, 633, 89, textureX, textureY); // Box 363
		leftTrackModel[20] = new ModelRendererTurbo(this, 665, 89, textureX, textureY); // Box 364
		leftTrackModel[21] = new ModelRendererTurbo(this, 697, 89, textureX, textureY); // Box 365
		leftTrackModel[22] = new ModelRendererTurbo(this, 729, 89, textureX, textureY); // Box 366
		leftTrackModel[23] = new ModelRendererTurbo(this, 761, 89, textureX, textureY); // Box 367
		leftTrackModel[24] = new ModelRendererTurbo(this, 793, 89, textureX, textureY); // Box 368
		leftTrackModel[25] = new ModelRendererTurbo(this, 825, 89, textureX, textureY); // Box 369
		leftTrackModel[26] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 370
		leftTrackModel[27] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 371
		leftTrackModel[28] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 372
		leftTrackModel[29] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 373
		leftTrackModel[30] = new ModelRendererTurbo(this, 513, 89, textureX, textureY); // Box 374
		leftTrackModel[31] = new ModelRendererTurbo(this, 553, 89, textureX, textureY); // Box 375
		leftTrackModel[32] = new ModelRendererTurbo(this, 593, 89, textureX, textureY); // Box 376
		leftTrackModel[33] = new ModelRendererTurbo(this, 657, 89, textureX, textureY); // Box 377
		leftTrackModel[34] = new ModelRendererTurbo(this, 689, 89, textureX, textureY); // Box 378
		leftTrackModel[35] = new ModelRendererTurbo(this, 721, 89, textureX, textureY); // Box 379
		leftTrackModel[36] = new ModelRendererTurbo(this, 753, 89, textureX, textureY); // Box 380
		leftTrackModel[37] = new ModelRendererTurbo(this, 785, 89, textureX, textureY); // Box 381
		leftTrackModel[38] = new ModelRendererTurbo(this, 817, 89, textureX, textureY); // Box 382
		leftTrackModel[39] = new ModelRendererTurbo(this, 849, 89, textureX, textureY); // Box 383
		leftTrackModel[40] = new ModelRendererTurbo(this, 865, 89, textureX, textureY); // Box 384
		leftTrackModel[41] = new ModelRendererTurbo(this, 881, 89, textureX, textureY); // Box 385
		leftTrackModel[42] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 386
		leftTrackModel[43] = new ModelRendererTurbo(this, 889, 89, textureX, textureY); // Box 387
		leftTrackModel[44] = new ModelRendererTurbo(this, 921, 89, textureX, textureY); // Box 388
		leftTrackModel[45] = new ModelRendererTurbo(this, 953, 89, textureX, textureY); // Box 389
		leftTrackModel[46] = new ModelRendererTurbo(this, 985, 89, textureX, textureY); // Box 390
		leftTrackModel[47] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 391
		leftTrackModel[48] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 392
		leftTrackModel[49] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 393
		leftTrackModel[50] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 394
		leftTrackModel[51] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 395
		leftTrackModel[52] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 396
		leftTrackModel[53] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 397
		leftTrackModel[54] = new ModelRendererTurbo(this, 913, 89, textureX, textureY); // Box 398
		leftTrackModel[55] = new ModelRendererTurbo(this, 945, 89, textureX, textureY); // Box 399
		leftTrackModel[56] = new ModelRendererTurbo(this, 977, 89, textureX, textureY); // Box 400
		leftTrackModel[57] = new ModelRendererTurbo(this, 1009, 89, textureX, textureY); // Box 401
		leftTrackModel[58] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 402
		leftTrackModel[59] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 403
		leftTrackModel[60] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 404
		leftTrackModel[61] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 405
		leftTrackModel[62] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 406
		leftTrackModel[63] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 407
		leftTrackModel[64] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 408
		leftTrackModel[65] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 409
		leftTrackModel[66] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 410
		leftTrackModel[67] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 411
		leftTrackModel[68] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Box 412
		leftTrackModel[69] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Box 413
		leftTrackModel[70] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Box 414
		leftTrackModel[71] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 415
		leftTrackModel[72] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 416
		leftTrackModel[73] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 417
		leftTrackModel[74] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 418
		leftTrackModel[75] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // Box 419
		leftTrackModel[76] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Box 420
		leftTrackModel[77] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 421
		leftTrackModel[78] = new ModelRendererTurbo(this, 521, 97, textureX, textureY); // Box 422
		leftTrackModel[79] = new ModelRendererTurbo(this, 537, 97, textureX, textureY); // Box 423
		leftTrackModel[80] = new ModelRendererTurbo(this, 553, 97, textureX, textureY); // Box 424
		leftTrackModel[81] = new ModelRendererTurbo(this, 569, 97, textureX, textureY); // Box 425
		leftTrackModel[82] = new ModelRendererTurbo(this, 585, 97, textureX, textureY); // Box 426
		leftTrackModel[83] = new ModelRendererTurbo(this, 601, 97, textureX, textureY); // Box 427
		leftTrackModel[84] = new ModelRendererTurbo(this, 617, 97, textureX, textureY); // Box 428
		leftTrackModel[85] = new ModelRendererTurbo(this, 857, 97, textureX, textureY); // Box 429
		leftTrackModel[86] = new ModelRendererTurbo(this, 865, 97, textureX, textureY); // Box 430
		leftTrackModel[87] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 431
		leftTrackModel[88] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Box 432
		leftTrackModel[89] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Box 433
		leftTrackModel[90] = new ModelRendererTurbo(this, 273, 105, textureX, textureY); // Box 434
		leftTrackModel[91] = new ModelRendererTurbo(this, 305, 105, textureX, textureY); // Box 435
		leftTrackModel[92] = new ModelRendererTurbo(this, 337, 105, textureX, textureY); // Box 436
		leftTrackModel[93] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // Box 437
		leftTrackModel[94] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 438
		leftTrackModel[95] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Box 439
		leftTrackModel[96] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 440
		leftTrackModel[97] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Box 441
		leftTrackModel[98] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 442
		leftTrackModel[99] = new ModelRendererTurbo(this, 265, 105, textureX, textureY); // Box 443
		leftTrackModel[100] = new ModelRendererTurbo(this, 297, 105, textureX, textureY); // Box 444
		leftTrackModel[101] = new ModelRendererTurbo(this, 329, 105, textureX, textureY); // Box 445
		leftTrackModel[102] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Box 446
		leftTrackModel[103] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 447
		leftTrackModel[104] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 448
		leftTrackModel[105] = new ModelRendererTurbo(this, 449, 105, textureX, textureY); // Box 449
		leftTrackModel[106] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Box 450
		leftTrackModel[107] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 451
		leftTrackModel[108] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 452
		leftTrackModel[109] = new ModelRendererTurbo(this, 513, 105, textureX, textureY); // Box 453
		leftTrackModel[110] = new ModelRendererTurbo(this, 529, 105, textureX, textureY); // Box 454
		leftTrackModel[111] = new ModelRendererTurbo(this, 545, 105, textureX, textureY); // Box 455
		leftTrackModel[112] = new ModelRendererTurbo(this, 561, 105, textureX, textureY); // Box 456
		leftTrackModel[113] = new ModelRendererTurbo(this, 577, 105, textureX, textureY); // Box 457
		leftTrackModel[114] = new ModelRendererTurbo(this, 593, 105, textureX, textureY); // Box 458
		leftTrackModel[115] = new ModelRendererTurbo(this, 609, 105, textureX, textureY); // Box 459
		leftTrackModel[116] = new ModelRendererTurbo(this, 625, 105, textureX, textureY); // Box 460
		leftTrackModel[117] = new ModelRendererTurbo(this, 641, 105, textureX, textureY); // Box 461
		leftTrackModel[118] = new ModelRendererTurbo(this, 657, 105, textureX, textureY); // Box 462
		leftTrackModel[119] = new ModelRendererTurbo(this, 673, 105, textureX, textureY); // Box 463
		leftTrackModel[120] = new ModelRendererTurbo(this, 689, 105, textureX, textureY); // Box 464
		leftTrackModel[121] = new ModelRendererTurbo(this, 705, 105, textureX, textureY); // Box 465
		leftTrackModel[122] = new ModelRendererTurbo(this, 721, 105, textureX, textureY); // Box 466
		leftTrackModel[123] = new ModelRendererTurbo(this, 737, 105, textureX, textureY); // Box 467
		leftTrackModel[124] = new ModelRendererTurbo(this, 753, 105, textureX, textureY); // Box 468
		leftTrackModel[125] = new ModelRendererTurbo(this, 769, 105, textureX, textureY); // Box 469
		leftTrackModel[126] = new ModelRendererTurbo(this, 785, 105, textureX, textureY); // Box 470
		leftTrackModel[127] = new ModelRendererTurbo(this, 801, 105, textureX, textureY); // Box 471
		leftTrackModel[128] = new ModelRendererTurbo(this, 817, 105, textureX, textureY); // Box 472
		leftTrackModel[129] = new ModelRendererTurbo(this, 825, 105, textureX, textureY); // Box 473
		leftTrackModel[130] = new ModelRendererTurbo(this, 889, 105, textureX, textureY); // Box 474
		leftTrackModel[131] = new ModelRendererTurbo(this, 921, 105, textureX, textureY); // Box 475
		leftTrackModel[132] = new ModelRendererTurbo(this, 953, 105, textureX, textureY); // Box 476
		leftTrackModel[133] = new ModelRendererTurbo(this, 985, 105, textureX, textureY); // Box 477
		leftTrackModel[134] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 478
		leftTrackModel[135] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Box 479
		leftTrackModel[136] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 480
		leftTrackModel[137] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 481
		leftTrackModel[138] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Box 482
		leftTrackModel[139] = new ModelRendererTurbo(this, 529, 81, textureX, textureY); // Box 483
		leftTrackModel[140] = new ModelRendererTurbo(this, 849, 105, textureX, textureY); // Box 484
		leftTrackModel[141] = new ModelRendererTurbo(this, 913, 105, textureX, textureY); // Box 485
		leftTrackModel[142] = new ModelRendererTurbo(this, 945, 105, textureX, textureY); // Box 486
		leftTrackModel[143] = new ModelRendererTurbo(this, 977, 105, textureX, textureY); // Box 487
		leftTrackModel[144] = new ModelRendererTurbo(this, 1009, 105, textureX, textureY); // Box 488
		leftTrackModel[145] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Box 489
		leftTrackModel[146] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Box 490
		leftTrackModel[147] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 491
		leftTrackModel[148] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 492
		leftTrackModel[149] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 493
		leftTrackModel[150] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 494
		leftTrackModel[151] = new ModelRendererTurbo(this, 465, 113, textureX, textureY); // Box 495
		leftTrackModel[152] = new ModelRendererTurbo(this, 481, 113, textureX, textureY); // Box 496
		leftTrackModel[153] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Box 497
		leftTrackModel[154] = new ModelRendererTurbo(this, 513, 113, textureX, textureY); // Box 498
		leftTrackModel[155] = new ModelRendererTurbo(this, 529, 113, textureX, textureY); // Box 499
		leftTrackModel[156] = new ModelRendererTurbo(this, 545, 113, textureX, textureY); // Box 500
		leftTrackModel[157] = new ModelRendererTurbo(this, 561, 113, textureX, textureY); // Box 501
		leftTrackModel[158] = new ModelRendererTurbo(this, 577, 113, textureX, textureY); // Box 502
		leftTrackModel[159] = new ModelRendererTurbo(this, 593, 113, textureX, textureY); // Box 503
		leftTrackModel[160] = new ModelRendererTurbo(this, 609, 113, textureX, textureY); // Box 504
		leftTrackModel[161] = new ModelRendererTurbo(this, 625, 113, textureX, textureY); // Box 505
		leftTrackModel[162] = new ModelRendererTurbo(this, 641, 113, textureX, textureY); // Box 506
		leftTrackModel[163] = new ModelRendererTurbo(this, 657, 113, textureX, textureY); // Box 507
		leftTrackModel[164] = new ModelRendererTurbo(this, 673, 113, textureX, textureY); // Box 508
		leftTrackModel[165] = new ModelRendererTurbo(this, 689, 113, textureX, textureY); // Box 509
		leftTrackModel[166] = new ModelRendererTurbo(this, 705, 113, textureX, textureY); // Box 510
		leftTrackModel[167] = new ModelRendererTurbo(this, 721, 113, textureX, textureY); // Box 511
		leftTrackModel[168] = new ModelRendererTurbo(this, 737, 113, textureX, textureY); // Box 512
		leftTrackModel[169] = new ModelRendererTurbo(this, 753, 113, textureX, textureY); // Box 513
		leftTrackModel[170] = new ModelRendererTurbo(this, 769, 113, textureX, textureY); // Box 514
		leftTrackModel[171] = new ModelRendererTurbo(this, 785, 113, textureX, textureY); // Box 515
		leftTrackModel[172] = new ModelRendererTurbo(this, 793, 113, textureX, textureY); // Box 516
		leftTrackModel[173] = new ModelRendererTurbo(this, 849, 113, textureX, textureY); // Box 517
		leftTrackModel[174] = new ModelRendererTurbo(this, 145, 121, textureX, textureY); // Box 518
		leftTrackModel[175] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 519
		leftTrackModel[176] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Box 520
		leftTrackModel[177] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 521
		leftTrackModel[178] = new ModelRendererTurbo(this, 273, 121, textureX, textureY); // Box 522
		leftTrackModel[179] = new ModelRendererTurbo(this, 305, 121, textureX, textureY); // Box 523
		leftTrackModel[180] = new ModelRendererTurbo(this, 337, 121, textureX, textureY); // Box 524
		leftTrackModel[181] = new ModelRendererTurbo(this, 449, 113, textureX, textureY); // Box 525
		leftTrackModel[182] = new ModelRendererTurbo(this, 569, 81, textureX, textureY); // Box 526
		leftTrackModel[183] = new ModelRendererTurbo(this, 873, 113, textureX, textureY); // Box 527
		leftTrackModel[184] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 528
		leftTrackModel[185] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Box 529
		leftTrackModel[186] = new ModelRendererTurbo(this, 233, 121, textureX, textureY); // Box 530
		leftTrackModel[187] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // Box 531
		leftTrackModel[188] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Box 532
		leftTrackModel[189] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 533
		leftTrackModel[190] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Box 534
		leftTrackModel[191] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Box 535
		leftTrackModel[192] = new ModelRendererTurbo(this, 393, 121, textureX, textureY); // Box 536
		leftTrackModel[193] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Box 537
		leftTrackModel[194] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Box 538
		leftTrackModel[195] = new ModelRendererTurbo(this, 481, 121, textureX, textureY); // Box 539
		leftTrackModel[196] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Box 540
		leftTrackModel[197] = new ModelRendererTurbo(this, 513, 121, textureX, textureY); // Box 541
		leftTrackModel[198] = new ModelRendererTurbo(this, 529, 121, textureX, textureY); // Box 542
		leftTrackModel[199] = new ModelRendererTurbo(this, 545, 121, textureX, textureY); // Box 543
		leftTrackModel[200] = new ModelRendererTurbo(this, 561, 121, textureX, textureY); // Box 544
		leftTrackModel[201] = new ModelRendererTurbo(this, 577, 121, textureX, textureY); // Box 545
		leftTrackModel[202] = new ModelRendererTurbo(this, 593, 121, textureX, textureY); // Box 546
		leftTrackModel[203] = new ModelRendererTurbo(this, 609, 121, textureX, textureY); // Box 547
		leftTrackModel[204] = new ModelRendererTurbo(this, 625, 121, textureX, textureY); // Box 548
		leftTrackModel[205] = new ModelRendererTurbo(this, 641, 121, textureX, textureY); // Box 549
		leftTrackModel[206] = new ModelRendererTurbo(this, 657, 121, textureX, textureY); // Box 550
		leftTrackModel[207] = new ModelRendererTurbo(this, 673, 121, textureX, textureY); // Box 551
		leftTrackModel[208] = new ModelRendererTurbo(this, 689, 121, textureX, textureY); // Box 552
		leftTrackModel[209] = new ModelRendererTurbo(this, 705, 121, textureX, textureY); // Box 553
		leftTrackModel[210] = new ModelRendererTurbo(this, 721, 121, textureX, textureY); // Box 554
		leftTrackModel[211] = new ModelRendererTurbo(this, 737, 121, textureX, textureY); // Box 555
		leftTrackModel[212] = new ModelRendererTurbo(this, 753, 121, textureX, textureY); // Box 556
		leftTrackModel[213] = new ModelRendererTurbo(this, 769, 121, textureX, textureY); // Box 557
		leftTrackModel[214] = new ModelRendererTurbo(this, 825, 121, textureX, textureY); // Box 558
		leftTrackModel[215] = new ModelRendererTurbo(this, 873, 121, textureX, textureY); // Box 559
		leftTrackModel[216] = new ModelRendererTurbo(this, 905, 121, textureX, textureY); // Box 560
		leftTrackModel[217] = new ModelRendererTurbo(this, 937, 121, textureX, textureY); // Box 561
		leftTrackModel[218] = new ModelRendererTurbo(this, 969, 121, textureX, textureY); // Box 562
		leftTrackModel[219] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 563
		leftTrackModel[220] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Box 564
		leftTrackModel[221] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Box 565
		leftTrackModel[222] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Box 566
		leftTrackModel[223] = new ModelRendererTurbo(this, 361, 129, textureX, textureY); // Box 567
		leftTrackModel[224] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Box 568
		leftTrackModel[225] = new ModelRendererTurbo(this, 609, 81, textureX, textureY); // Box 569
		leftTrackModel[226] = new ModelRendererTurbo(this, 897, 121, textureX, textureY); // Box 570
		leftTrackModel[227] = new ModelRendererTurbo(this, 929, 121, textureX, textureY); // Box 571
		leftTrackModel[228] = new ModelRendererTurbo(this, 961, 121, textureX, textureY); // Box 572
		leftTrackModel[229] = new ModelRendererTurbo(this, 993, 121, textureX, textureY); // Box 573
		leftTrackModel[230] = new ModelRendererTurbo(this, 1009, 121, textureX, textureY); // Box 574
		leftTrackModel[231] = new ModelRendererTurbo(this, 25, 129, textureX, textureY); // Box 575
		leftTrackModel[232] = new ModelRendererTurbo(this, 57, 129, textureX, textureY); // Box 576
		leftTrackModel[233] = new ModelRendererTurbo(this, 89, 129, textureX, textureY); // Box 577
		leftTrackModel[234] = new ModelRendererTurbo(this, 121, 129, textureX, textureY); // Box 578
		leftTrackModel[235] = new ModelRendererTurbo(this, 385, 129, textureX, textureY); // Box 579
		leftTrackModel[236] = new ModelRendererTurbo(this, 401, 129, textureX, textureY); // Box 580
		leftTrackModel[237] = new ModelRendererTurbo(this, 417, 129, textureX, textureY); // Box 581
		leftTrackModel[238] = new ModelRendererTurbo(this, 465, 129, textureX, textureY); // Box 582
		leftTrackModel[239] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Box 583
		leftTrackModel[240] = new ModelRendererTurbo(this, 497, 129, textureX, textureY); // Box 584
		leftTrackModel[241] = new ModelRendererTurbo(this, 513, 129, textureX, textureY); // Box 585
		leftTrackModel[242] = new ModelRendererTurbo(this, 529, 129, textureX, textureY); // Box 586
		leftTrackModel[243] = new ModelRendererTurbo(this, 545, 129, textureX, textureY); // Box 587
		leftTrackModel[244] = new ModelRendererTurbo(this, 561, 129, textureX, textureY); // Box 588
		leftTrackModel[245] = new ModelRendererTurbo(this, 577, 129, textureX, textureY); // Box 589
		leftTrackModel[246] = new ModelRendererTurbo(this, 593, 129, textureX, textureY); // Box 590
		leftTrackModel[247] = new ModelRendererTurbo(this, 609, 129, textureX, textureY); // Box 591
		leftTrackModel[248] = new ModelRendererTurbo(this, 625, 129, textureX, textureY); // Box 592
		leftTrackModel[249] = new ModelRendererTurbo(this, 641, 129, textureX, textureY); // Box 593
		leftTrackModel[250] = new ModelRendererTurbo(this, 657, 129, textureX, textureY); // Box 594
		leftTrackModel[251] = new ModelRendererTurbo(this, 673, 129, textureX, textureY); // Box 595
		leftTrackModel[252] = new ModelRendererTurbo(this, 689, 129, textureX, textureY); // Box 596
		leftTrackModel[253] = new ModelRendererTurbo(this, 705, 129, textureX, textureY); // Box 597
		leftTrackModel[254] = new ModelRendererTurbo(this, 721, 129, textureX, textureY); // Box 598
		leftTrackModel[255] = new ModelRendererTurbo(this, 737, 129, textureX, textureY); // Box 599
		leftTrackModel[256] = new ModelRendererTurbo(this, 753, 129, textureX, textureY); // Box 600
		leftTrackModel[257] = new ModelRendererTurbo(this, 769, 129, textureX, textureY); // Box 601
		leftTrackModel[258] = new ModelRendererTurbo(this, 777, 129, textureX, textureY); // Box 602
		leftTrackModel[259] = new ModelRendererTurbo(this, 809, 129, textureX, textureY); // Box 603
		leftTrackModel[260] = new ModelRendererTurbo(this, 841, 129, textureX, textureY); // Box 604
		leftTrackModel[261] = new ModelRendererTurbo(this, 993, 129, textureX, textureY); // Box 605
		leftTrackModel[262] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Box 606
		leftTrackModel[263] = new ModelRendererTurbo(this, 153, 137, textureX, textureY); // Box 607
		leftTrackModel[264] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Box 608
		leftTrackModel[265] = new ModelRendererTurbo(this, 217, 137, textureX, textureY); // Box 609
		leftTrackModel[266] = new ModelRendererTurbo(this, 249, 137, textureX, textureY); // Box 610
		leftTrackModel[267] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Box 611
		leftTrackModel[268] = new ModelRendererTurbo(this, 801, 129, textureX, textureY); // Box 612
		leftTrackModel[269] = new ModelRendererTurbo(this, 833, 129, textureX, textureY); // Box 613
		leftTrackModel[270] = new ModelRendererTurbo(this, 145, 137, textureX, textureY); // Box 614
		leftTrackModel[271] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Box 615
		leftTrackModel[272] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Box 616
		leftTrackModel[273] = new ModelRendererTurbo(this, 241, 137, textureX, textureY); // Box 617
		leftTrackModel[274] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Box 618
		leftTrackModel[275] = new ModelRendererTurbo(this, 289, 137, textureX, textureY); // Box 619
		leftTrackModel[276] = new ModelRendererTurbo(this, 305, 137, textureX, textureY); // Box 620
		leftTrackModel[277] = new ModelRendererTurbo(this, 321, 137, textureX, textureY); // Box 621
		leftTrackModel[278] = new ModelRendererTurbo(this, 337, 137, textureX, textureY); // Box 622
		leftTrackModel[279] = new ModelRendererTurbo(this, 393, 137, textureX, textureY); // Box 623
		leftTrackModel[280] = new ModelRendererTurbo(this, 409, 137, textureX, textureY); // Box 624
		leftTrackModel[281] = new ModelRendererTurbo(this, 425, 137, textureX, textureY); // Box 625
		leftTrackModel[282] = new ModelRendererTurbo(this, 481, 137, textureX, textureY); // Box 626
		leftTrackModel[283] = new ModelRendererTurbo(this, 497, 137, textureX, textureY); // Box 627
		leftTrackModel[284] = new ModelRendererTurbo(this, 513, 137, textureX, textureY); // Box 628
		leftTrackModel[285] = new ModelRendererTurbo(this, 529, 137, textureX, textureY); // Box 629
		leftTrackModel[286] = new ModelRendererTurbo(this, 545, 137, textureX, textureY); // Box 630
		leftTrackModel[287] = new ModelRendererTurbo(this, 561, 137, textureX, textureY); // Box 631
		leftTrackModel[288] = new ModelRendererTurbo(this, 577, 137, textureX, textureY); // Box 632
		leftTrackModel[289] = new ModelRendererTurbo(this, 593, 137, textureX, textureY); // Box 633
		leftTrackModel[290] = new ModelRendererTurbo(this, 609, 137, textureX, textureY); // Box 634
		leftTrackModel[291] = new ModelRendererTurbo(this, 625, 137, textureX, textureY); // Box 635
		leftTrackModel[292] = new ModelRendererTurbo(this, 641, 137, textureX, textureY); // Box 636
		leftTrackModel[293] = new ModelRendererTurbo(this, 657, 137, textureX, textureY); // Box 637
		leftTrackModel[294] = new ModelRendererTurbo(this, 673, 137, textureX, textureY); // Box 638
		leftTrackModel[295] = new ModelRendererTurbo(this, 689, 137, textureX, textureY); // Box 639
		leftTrackModel[296] = new ModelRendererTurbo(this, 705, 137, textureX, textureY); // Box 640
		leftTrackModel[297] = new ModelRendererTurbo(this, 721, 137, textureX, textureY); // Box 641
		leftTrackModel[298] = new ModelRendererTurbo(this, 737, 137, textureX, textureY); // Box 642
		leftTrackModel[299] = new ModelRendererTurbo(this, 753, 137, textureX, textureY); // Box 643
		leftTrackModel[300] = new ModelRendererTurbo(this, 873, 137, textureX, textureY); // Box 644
		leftTrackModel[301] = new ModelRendererTurbo(this, 769, 145, textureX, textureY); // Box 688
		leftTrackModel[302] = new ModelRendererTurbo(this, 809, 145, textureX, textureY); // Box 689
		leftTrackModel[303] = new ModelRendererTurbo(this, 849, 145, textureX, textureY); // Box 690
		leftTrackModel[304] = new ModelRendererTurbo(this, 961, 145, textureX, textureY); // Box 691
		leftTrackModel[305] = new ModelRendererTurbo(this, 113, 153, textureX, textureY); // Box 692
		leftTrackModel[306] = new ModelRendererTurbo(this, 153, 153, textureX, textureY); // Box 693
		leftTrackModel[307] = new ModelRendererTurbo(this, 193, 153, textureX, textureY); // Box 694
		leftTrackModel[308] = new ModelRendererTurbo(this, 233, 153, textureX, textureY); // Box 695
		leftTrackModel[309] = new ModelRendererTurbo(this, 321, 153, textureX, textureY); // Box 696
		leftTrackModel[310] = new ModelRendererTurbo(this, 361, 153, textureX, textureY); // Box 697
		leftTrackModel[311] = new ModelRendererTurbo(this, 793, 145, textureX, textureY); // Box 698
		leftTrackModel[312] = new ModelRendererTurbo(this, 833, 145, textureX, textureY); // Box 699
		leftTrackModel[313] = new ModelRendererTurbo(this, 985, 145, textureX, textureY); // Box 700
		leftTrackModel[314] = new ModelRendererTurbo(this, 1001, 145, textureX, textureY); // Box 701
		leftTrackModel[315] = new ModelRendererTurbo(this, 137, 153, textureX, textureY); // Box 702
		leftTrackModel[316] = new ModelRendererTurbo(this, 177, 153, textureX, textureY); // Box 703
		leftTrackModel[317] = new ModelRendererTurbo(this, 217, 153, textureX, textureY); // Box 704
		leftTrackModel[318] = new ModelRendererTurbo(this, 257, 153, textureX, textureY); // Box 705
		leftTrackModel[319] = new ModelRendererTurbo(this, 345, 153, textureX, textureY); // Box 706
		leftTrackModel[320] = new ModelRendererTurbo(this, 385, 153, textureX, textureY); // Box 707
		leftTrackModel[321] = new ModelRendererTurbo(this, 401, 153, textureX, textureY); // Box 708
		leftTrackModel[322] = new ModelRendererTurbo(this, 417, 153, textureX, textureY); // Box 709
		leftTrackModel[323] = new ModelRendererTurbo(this, 433, 153, textureX, textureY); // Box 710
		leftTrackModel[324] = new ModelRendererTurbo(this, 449, 153, textureX, textureY); // Box 711
		leftTrackModel[325] = new ModelRendererTurbo(this, 465, 153, textureX, textureY); // Box 712
		leftTrackModel[326] = new ModelRendererTurbo(this, 481, 153, textureX, textureY); // Box 713
		leftTrackModel[327] = new ModelRendererTurbo(this, 497, 153, textureX, textureY); // Box 714
		leftTrackModel[328] = new ModelRendererTurbo(this, 513, 153, textureX, textureY); // Box 715
		leftTrackModel[329] = new ModelRendererTurbo(this, 529, 153, textureX, textureY); // Box 716
		leftTrackModel[330] = new ModelRendererTurbo(this, 545, 153, textureX, textureY); // Box 717
		leftTrackModel[331] = new ModelRendererTurbo(this, 561, 153, textureX, textureY); // Box 718
		leftTrackModel[332] = new ModelRendererTurbo(this, 577, 153, textureX, textureY); // Box 719
		leftTrackModel[333] = new ModelRendererTurbo(this, 593, 153, textureX, textureY); // Box 720
		leftTrackModel[334] = new ModelRendererTurbo(this, 609, 153, textureX, textureY); // Box 721
		leftTrackModel[335] = new ModelRendererTurbo(this, 625, 153, textureX, textureY); // Box 722
		leftTrackModel[336] = new ModelRendererTurbo(this, 641, 153, textureX, textureY); // Box 723
		leftTrackModel[337] = new ModelRendererTurbo(this, 657, 153, textureX, textureY); // Box 724
		leftTrackModel[338] = new ModelRendererTurbo(this, 673, 153, textureX, textureY); // Box 725
		leftTrackModel[339] = new ModelRendererTurbo(this, 689, 153, textureX, textureY); // Box 726
		leftTrackModel[340] = new ModelRendererTurbo(this, 705, 153, textureX, textureY); // Box 727
		leftTrackModel[341] = new ModelRendererTurbo(this, 721, 153, textureX, textureY); // Box 728
		leftTrackModel[342] = new ModelRendererTurbo(this, 737, 153, textureX, textureY); // Box 729
		leftTrackModel[343] = new ModelRendererTurbo(this, 753, 153, textureX, textureY); // Box 730
		leftTrackModel[344] = new ModelRendererTurbo(this, 217, 169, textureX, textureY); // Box 826
		leftTrackModel[345] = new ModelRendererTurbo(this, 753, 161, textureX, textureY); // Box 827
		leftTrackModel[346] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 877
		leftTrackModel[347] = new ModelRendererTurbo(this, 17, 185, textureX, textureY); // Box 907
		leftTrackModel[348] = new ModelRendererTurbo(this, 649, 177, textureX, textureY); // Box 908
		leftTrackModel[349] = new ModelRendererTurbo(this, 681, 177, textureX, textureY); // Box 909
		leftTrackModel[350] = new ModelRendererTurbo(this, 713, 177, textureX, textureY); // Box 910
		leftTrackModel[351] = new ModelRendererTurbo(this, 745, 177, textureX, textureY); // Box 911
		leftTrackModel[352] = new ModelRendererTurbo(this, 777, 177, textureX, textureY); // Box 912
		leftTrackModel[353] = new ModelRendererTurbo(this, 817, 177, textureX, textureY); // Box 913
		leftTrackModel[354] = new ModelRendererTurbo(this, 849, 177, textureX, textureY); // Box 914
		leftTrackModel[355] = new ModelRendererTurbo(this, 881, 177, textureX, textureY); // Box 915
		leftTrackModel[356] = new ModelRendererTurbo(this, 913, 177, textureX, textureY); // Box 916
		leftTrackModel[357] = new ModelRendererTurbo(this, 953, 177, textureX, textureY); // Box 917
		leftTrackModel[358] = new ModelRendererTurbo(this, 897, 185, textureX, textureY); // Box 931
		leftTrackModel[359] = new ModelRendererTurbo(this, 929, 185, textureX, textureY); // Box 932
		leftTrackModel[360] = new ModelRendererTurbo(this, 969, 185, textureX, textureY); // Box 933
		leftTrackModel[361] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 934
		leftTrackModel[362] = new ModelRendererTurbo(this, 265, 193, textureX, textureY); // Box 935
		leftTrackModel[363] = new ModelRendererTurbo(this, 353, 193, textureX, textureY); // Box 936
		leftTrackModel[364] = new ModelRendererTurbo(this, 385, 193, textureX, textureY); // Box 937
		leftTrackModel[365] = new ModelRendererTurbo(this, 417, 193, textureX, textureY); // Box 938
		leftTrackModel[366] = new ModelRendererTurbo(this, 449, 193, textureX, textureY); // Box 939
		leftTrackModel[367] = new ModelRendererTurbo(this, 481, 193, textureX, textureY); // Box 940
		leftTrackModel[368] = new ModelRendererTurbo(this, 513, 193, textureX, textureY); // Box 941
		leftTrackModel[369] = new ModelRendererTurbo(this, 569, 193, textureX, textureY); // Box 942
		leftTrackModel[370] = new ModelRendererTurbo(this, 601, 193, textureX, textureY); // Box 943
		leftTrackModel[371] = new ModelRendererTurbo(this, 865, 161, textureX, textureY); // Box 1012
		leftTrackModel[372] = new ModelRendererTurbo(this, 937, 161, textureX, textureY); // Box 1013
		leftTrackModel[373] = new ModelRendererTurbo(this, 953, 161, textureX, textureY); // Box 1014
		leftTrackModel[374] = new ModelRendererTurbo(this, 969, 161, textureX, textureY); // Box 1015
		leftTrackModel[375] = new ModelRendererTurbo(this, 985, 161, textureX, textureY); // Box 1016
		leftTrackModel[376] = new ModelRendererTurbo(this, 1001, 161, textureX, textureY); // Box 1017
		leftTrackModel[377] = new ModelRendererTurbo(this, 209, 169, textureX, textureY); // Box 1018
		leftTrackModel[378] = new ModelRendererTurbo(this, 881, 169, textureX, textureY); // Box 1019
		leftTrackModel[379] = new ModelRendererTurbo(this, 897, 169, textureX, textureY); // Box 1020
		leftTrackModel[380] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 1021
		leftTrackModel[381] = new ModelRendererTurbo(this, 17, 177, textureX, textureY); // Box 1022
		leftTrackModel[382] = new ModelRendererTurbo(this, 609, 177, textureX, textureY); // Box 1023
		leftTrackModel[383] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 0
		leftTrackModel[384] = new ModelRendererTurbo(this, 641, 25, textureX, textureY); // Box 1
		leftTrackModel[385] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 2
		leftTrackModel[386] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 3
		leftTrackModel[387] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 4
		leftTrackModel[388] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 5
		leftTrackModel[389] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 6
		leftTrackModel[390] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 7
		leftTrackModel[391] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 8
		leftTrackModel[392] = new ModelRendererTurbo(this, 529, 89, textureX, textureY); // Box 9
		leftTrackModel[393] = new ModelRendererTurbo(this, 569, 89, textureX, textureY); // Box 10
		leftTrackModel[394] = new ModelRendererTurbo(this, 609, 89, textureX, textureY); // Box 11
		leftTrackModel[395] = new ModelRendererTurbo(this, 633, 89, textureX, textureY); // Box 12
		leftTrackModel[396] = new ModelRendererTurbo(this, 809, 129, textureX, textureY); // Box 13
		leftTrackModel[397] = new ModelRendererTurbo(this, 913, 137, textureX, textureY); // Box 14
		leftTrackModel[398] = new ModelRendererTurbo(this, 801, 145, textureX, textureY); // Box 15
		leftTrackModel[399] = new ModelRendererTurbo(this, 769, 153, textureX, textureY); // Box 16
		leftTrackModel[400] = new ModelRendererTurbo(this, 961, 153, textureX, textureY); // Box 17
		leftTrackModel[401] = new ModelRendererTurbo(this, 113, 161, textureX, textureY); // Box 18
		leftTrackModel[402] = new ModelRendererTurbo(this, 321, 161, textureX, textureY); // Box 19
		leftTrackModel[403] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 20
		leftTrackModel[404] = new ModelRendererTurbo(this, 873, 161, textureX, textureY); // Box 21
		leftTrackModel[405] = new ModelRendererTurbo(this, 945, 161, textureX, textureY); // Box 22

		leftTrackModel[0].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 344
		leftTrackModel[0].setRotationPoint(-34F, 2.4F, 21F);
		leftTrackModel[0].rotateAngleX = -0.2443461F;
		leftTrackModel[0].rotateAngleZ = 2.75762022F;

		leftTrackModel[1].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 345
		leftTrackModel[1].setRotationPoint(-34F, 2.4F, 21F);
		leftTrackModel[1].rotateAngleX = 0.36651914F;
		leftTrackModel[1].rotateAngleZ = 1.97222205F;

		leftTrackModel[2].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 346
		leftTrackModel[2].setRotationPoint(-34F, 2.4F, 21F);
		leftTrackModel[2].rotateAngleX = -0.2443461F;
		leftTrackModel[2].rotateAngleZ = 3.54301838F;

		leftTrackModel[3].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 347
		leftTrackModel[3].setRotationPoint(-34F, 2.4F, 21F);
		leftTrackModel[3].rotateAngleX = 0.2443461F;
		leftTrackModel[3].rotateAngleZ = 2.75762022F;

		leftTrackModel[4].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 348
		leftTrackModel[4].setRotationPoint(-34F, 2.4F, 21F);
		leftTrackModel[4].rotateAngleX = 0.2443461F;
		leftTrackModel[4].rotateAngleZ = 3.54301838F;

		leftTrackModel[5].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 349
		leftTrackModel[5].setRotationPoint(-34F, 2.4F, 21F);
		leftTrackModel[5].rotateAngleX = -0.2443461F;
		leftTrackModel[5].rotateAngleZ = 4.32841654F;

		leftTrackModel[6].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 350
		leftTrackModel[6].setRotationPoint(-34F, 2.4F, 21F);
		leftTrackModel[6].rotateAngleX = 0.2443461F;
		leftTrackModel[6].rotateAngleZ = 4.32841654F;

		leftTrackModel[7].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 351
		leftTrackModel[7].setRotationPoint(-34F, 2.4F, 21F);
		leftTrackModel[7].rotateAngleX = -0.2443461F;
		leftTrackModel[7].rotateAngleZ = 5.11381471F;

		leftTrackModel[8].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 352
		leftTrackModel[8].setRotationPoint(-34F, 2.4F, 21F);
		leftTrackModel[8].rotateAngleX = -0.2443461F;
		leftTrackModel[8].rotateAngleZ = 5.89921287F;

		leftTrackModel[9].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 353
		leftTrackModel[9].setRotationPoint(-34F, 2.4F, 21F);
		leftTrackModel[9].rotateAngleX = 0.2443461F;
		leftTrackModel[9].rotateAngleZ = 5.11381471F;

		leftTrackModel[10].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 354
		leftTrackModel[10].setRotationPoint(-34F, 2.4F, 21F);
		leftTrackModel[10].rotateAngleX = 0.2443461F;
		leftTrackModel[10].rotateAngleZ = 5.89921287F;

		leftTrackModel[11].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 355
		leftTrackModel[11].setRotationPoint(-34F, 2.4F, 21F);
		leftTrackModel[11].rotateAngleX = -0.2443461F;
		leftTrackModel[11].rotateAngleZ = 0.40142573F;

		leftTrackModel[12].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 356
		leftTrackModel[12].setRotationPoint(-34F, 2.4F, 21F);
		leftTrackModel[12].rotateAngleX = 0.2443461F;
		leftTrackModel[12].rotateAngleZ = 0.40142573F;

		leftTrackModel[13].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 357
		leftTrackModel[13].setRotationPoint(-34F, 2.4F, 21F);
		leftTrackModel[13].rotateAngleX = -0.2443461F;
		leftTrackModel[13].rotateAngleZ = 1.18682389F;

		leftTrackModel[14].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 358
		leftTrackModel[14].setRotationPoint(-34F, 2.4F, 21F);
		leftTrackModel[14].rotateAngleX = -0.2443461F;
		leftTrackModel[14].rotateAngleZ = 1.97222205F;

		leftTrackModel[15].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 359
		leftTrackModel[15].setRotationPoint(-34F, 2.4F, 21F);
		leftTrackModel[15].rotateAngleX = 0.2443461F;
		leftTrackModel[15].rotateAngleZ = 1.18682389F;

		leftTrackModel[16].addShapeBox(-1.5F, -6.15F, 0F, 3, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 360
		leftTrackModel[16].setRotationPoint(-34F, 2.4F, 20.6F);
		leftTrackModel[16].rotateAngleZ = 6.28318531F;

		leftTrackModel[17].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 361
		leftTrackModel[17].setRotationPoint(-34F, 2.4F, 20.6F);
		leftTrackModel[17].rotateAngleZ = 5.72467995F;

		leftTrackModel[18].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 362
		leftTrackModel[18].setRotationPoint(-34F, 2.4F, 20.6F);
		leftTrackModel[18].rotateAngleZ = 5.07890812F;

		leftTrackModel[19].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 363
		leftTrackModel[19].setRotationPoint(-34F, 2.4F, 20.6F);
		leftTrackModel[19].rotateAngleZ = 4.4331363F;

		leftTrackModel[20].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 364
		leftTrackModel[20].setRotationPoint(-34F, 2.4F, 20.6F);
		leftTrackModel[20].rotateAngleZ = 3.78736448F;

		leftTrackModel[21].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 365
		leftTrackModel[21].setRotationPoint(-34F, 2.4F, 20.6F);
		leftTrackModel[21].rotateAngleZ = 3.14159265F;

		leftTrackModel[22].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 366
		leftTrackModel[22].setRotationPoint(-34F, 2.4F, 20.6F);
		leftTrackModel[22].rotateAngleZ = 2.49582083F;

		leftTrackModel[23].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 367
		leftTrackModel[23].setRotationPoint(-34F, 2.4F, 20.6F);
		leftTrackModel[23].rotateAngleZ = 1.85004901F;

		leftTrackModel[24].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 368
		leftTrackModel[24].setRotationPoint(-34F, 2.4F, 20.6F);
		leftTrackModel[24].rotateAngleZ = 1.20427718F;

		leftTrackModel[25].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 369
		leftTrackModel[25].setRotationPoint(-34F, 2.4F, 20.6F);
		leftTrackModel[25].rotateAngleZ = 0.55850536F;

		leftTrackModel[26].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 370
		leftTrackModel[26].setRotationPoint(-34F, 2.4F, 29.5F);
		leftTrackModel[26].rotateAngleX = 0.2443461F;
		leftTrackModel[26].rotateAngleY = -3.14159265F;
		leftTrackModel[26].rotateAngleZ = 1.13446401F;

		leftTrackModel[27].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 371
		leftTrackModel[27].setRotationPoint(-34F, 2.4F, 29.5F);
		leftTrackModel[27].rotateAngleX = -0.2443461F;
		leftTrackModel[27].rotateAngleY = -3.14159265F;
		leftTrackModel[27].rotateAngleZ = 1.91986218F;

		leftTrackModel[28].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 372
		leftTrackModel[28].setRotationPoint(-34F, 2.4F, 29.5F);
		leftTrackModel[28].rotateAngleX = 0.2443461F;
		leftTrackModel[28].rotateAngleY = -3.14159265F;
		leftTrackModel[28].rotateAngleZ = 0.34906585F;

		leftTrackModel[29].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 373
		leftTrackModel[29].setRotationPoint(-34F, 2.4F, 29.5F);
		leftTrackModel[29].rotateAngleX = -0.2443461F;
		leftTrackModel[29].rotateAngleY = -3.14159265F;
		leftTrackModel[29].rotateAngleZ = 1.13446401F;

		leftTrackModel[30].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 374
		leftTrackModel[30].setRotationPoint(-34F, 2.4F, 29.5F);
		leftTrackModel[30].rotateAngleX = 0.2443461F;
		leftTrackModel[30].rotateAngleY = -3.14159265F;
		leftTrackModel[30].rotateAngleZ = 5.84685299F;

		leftTrackModel[31].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 375
		leftTrackModel[31].setRotationPoint(-34F, 2.4F, 29.5F);
		leftTrackModel[31].rotateAngleX = -0.2443461F;
		leftTrackModel[31].rotateAngleY = -3.14159265F;
		leftTrackModel[31].rotateAngleZ = 0.34906585F;

		leftTrackModel[32].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 376
		leftTrackModel[32].setRotationPoint(-34F, 2.4F, 29.5F);
		leftTrackModel[32].rotateAngleX = 0.2443461F;
		leftTrackModel[32].rotateAngleY = -3.14159265F;
		leftTrackModel[32].rotateAngleZ = 5.06145483F;

		leftTrackModel[33].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 377
		leftTrackModel[33].setRotationPoint(-34F, 2.4F, 29.5F);
		leftTrackModel[33].rotateAngleX = -0.2443461F;
		leftTrackModel[33].rotateAngleY = -3.14159265F;
		leftTrackModel[33].rotateAngleZ = 5.84685299F;

		leftTrackModel[34].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 378
		leftTrackModel[34].setRotationPoint(-34F, 2.4F, 29.5F);
		leftTrackModel[34].rotateAngleX = 0.2443461F;
		leftTrackModel[34].rotateAngleY = -3.14159265F;
		leftTrackModel[34].rotateAngleZ = 4.27605667F;

		leftTrackModel[35].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 379
		leftTrackModel[35].setRotationPoint(-34F, 2.4F, 29.5F);
		leftTrackModel[35].rotateAngleX = -0.2443461F;
		leftTrackModel[35].rotateAngleY = -3.14159265F;
		leftTrackModel[35].rotateAngleZ = 5.06145483F;

		leftTrackModel[36].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 380
		leftTrackModel[36].setRotationPoint(-34F, 2.4F, 29.5F);
		leftTrackModel[36].rotateAngleX = 0.2443461F;
		leftTrackModel[36].rotateAngleY = -3.14159265F;
		leftTrackModel[36].rotateAngleZ = 3.4906585F;

		leftTrackModel[37].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 381
		leftTrackModel[37].setRotationPoint(-34F, 2.4F, 29.5F);
		leftTrackModel[37].rotateAngleX = -0.2443461F;
		leftTrackModel[37].rotateAngleY = -3.14159265F;
		leftTrackModel[37].rotateAngleZ = 4.27605667F;

		leftTrackModel[38].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 382
		leftTrackModel[38].setRotationPoint(-34F, 2.4F, 29.5F);
		leftTrackModel[38].rotateAngleX = 0.2443461F;
		leftTrackModel[38].rotateAngleY = -3.14159265F;
		leftTrackModel[38].rotateAngleZ = 2.70526034F;

		leftTrackModel[39].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 383
		leftTrackModel[39].setRotationPoint(-34F, 2.4F, 29.5F);
		leftTrackModel[39].rotateAngleX = -0.2443461F;
		leftTrackModel[39].rotateAngleY = -3.14159265F;
		leftTrackModel[39].rotateAngleZ = 3.4906585F;

		leftTrackModel[40].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 384
		leftTrackModel[40].setRotationPoint(-34F, 2.4F, 29.5F);
		leftTrackModel[40].rotateAngleX = 0.36651914F;
		leftTrackModel[40].rotateAngleY = -3.14159265F;
		leftTrackModel[40].rotateAngleZ = 1.91986218F;

		leftTrackModel[41].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 385
		leftTrackModel[41].setRotationPoint(-34F, 2.4F, 29.5F);
		leftTrackModel[41].rotateAngleX = -0.2443461F;
		leftTrackModel[41].rotateAngleY = -3.14159265F;
		leftTrackModel[41].rotateAngleZ = 2.70526034F;

		leftTrackModel[42].addShapeBox(-1F, -1F, -1F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386
		leftTrackModel[42].setRotationPoint(-34F, 2.4F, 19.2F);

		leftTrackModel[43].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 387
		leftTrackModel[43].setRotationPoint(-19.2F, 2.4F, 20.6F);
		leftTrackModel[43].rotateAngleZ = 0.55850536F;

		leftTrackModel[44].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 388
		leftTrackModel[44].setRotationPoint(-19.2F, 2.4F, 20.6F);
		leftTrackModel[44].rotateAngleZ = 1.20427718F;

		leftTrackModel[45].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 389
		leftTrackModel[45].setRotationPoint(-19.2F, 2.4F, 20.6F);
		leftTrackModel[45].rotateAngleZ = 1.85004901F;

		leftTrackModel[46].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 390
		leftTrackModel[46].setRotationPoint(-19.2F, 2.4F, 20.6F);
		leftTrackModel[46].rotateAngleZ = 2.49582083F;

		leftTrackModel[47].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 391
		leftTrackModel[47].setRotationPoint(-19.2F, 2.4F, 20.6F);
		leftTrackModel[47].rotateAngleZ = 3.14159265F;

		leftTrackModel[48].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 392
		leftTrackModel[48].setRotationPoint(-19.2F, 2.4F, 20.6F);
		leftTrackModel[48].rotateAngleZ = 3.78736448F;

		leftTrackModel[49].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 393
		leftTrackModel[49].setRotationPoint(-19.2F, 2.4F, 20.6F);
		leftTrackModel[49].rotateAngleZ = 4.4331363F;

		leftTrackModel[50].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 394
		leftTrackModel[50].setRotationPoint(-19.2F, 2.4F, 20.6F);
		leftTrackModel[50].rotateAngleZ = 5.07890812F;

		leftTrackModel[51].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 395
		leftTrackModel[51].setRotationPoint(-19.2F, 2.4F, 20.6F);
		leftTrackModel[51].rotateAngleZ = 5.72467995F;

		leftTrackModel[52].addShapeBox(-1.5F, -6.15F, 0F, 3, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 396
		leftTrackModel[52].setRotationPoint(-19.2F, 2.4F, 20.6F);
		leftTrackModel[52].rotateAngleZ = 6.28318531F;

		leftTrackModel[53].addShapeBox(-1F, -1F, -1F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		leftTrackModel[53].setRotationPoint(-19.2F, 2.4F, 19.2F);

		leftTrackModel[54].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 398
		leftTrackModel[54].setRotationPoint(-19.2F, 2.4F, 29.5F);
		leftTrackModel[54].rotateAngleX = -0.2443461F;
		leftTrackModel[54].rotateAngleY = -3.14159265F;
		leftTrackModel[54].rotateAngleZ = 1.91986218F;

		leftTrackModel[55].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 399
		leftTrackModel[55].setRotationPoint(-19.2F, 2.4F, 29.5F);
		leftTrackModel[55].rotateAngleX = 0.2443461F;
		leftTrackModel[55].rotateAngleY = -3.14159265F;
		leftTrackModel[55].rotateAngleZ = 1.13446401F;

		leftTrackModel[56].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 400
		leftTrackModel[56].setRotationPoint(-19.2F, 2.4F, 29.5F);
		leftTrackModel[56].rotateAngleX = 0.2443461F;
		leftTrackModel[56].rotateAngleY = -3.14159265F;
		leftTrackModel[56].rotateAngleZ = 0.34906585F;

		leftTrackModel[57].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 401
		leftTrackModel[57].setRotationPoint(-19.2F, 2.4F, 29.5F);
		leftTrackModel[57].rotateAngleX = -0.2443461F;
		leftTrackModel[57].rotateAngleY = -3.14159265F;
		leftTrackModel[57].rotateAngleZ = 1.13446401F;

		leftTrackModel[58].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 402
		leftTrackModel[58].setRotationPoint(-19.2F, 2.4F, 29.5F);
		leftTrackModel[58].rotateAngleX = 0.2443461F;
		leftTrackModel[58].rotateAngleY = -3.14159265F;
		leftTrackModel[58].rotateAngleZ = 5.84685299F;

		leftTrackModel[59].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 403
		leftTrackModel[59].setRotationPoint(-19.2F, 2.4F, 29.5F);
		leftTrackModel[59].rotateAngleX = -0.2443461F;
		leftTrackModel[59].rotateAngleY = -3.14159265F;
		leftTrackModel[59].rotateAngleZ = 0.34906585F;

		leftTrackModel[60].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 404
		leftTrackModel[60].setRotationPoint(-19.2F, 2.4F, 29.5F);
		leftTrackModel[60].rotateAngleX = 0.2443461F;
		leftTrackModel[60].rotateAngleY = -3.14159265F;
		leftTrackModel[60].rotateAngleZ = 5.06145483F;

		leftTrackModel[61].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 405
		leftTrackModel[61].setRotationPoint(-19.2F, 2.4F, 29.5F);
		leftTrackModel[61].rotateAngleX = -0.2443461F;
		leftTrackModel[61].rotateAngleY = -3.14159265F;
		leftTrackModel[61].rotateAngleZ = 5.84685299F;

		leftTrackModel[62].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 406
		leftTrackModel[62].setRotationPoint(-19.2F, 2.4F, 29.5F);
		leftTrackModel[62].rotateAngleX = -0.2443461F;
		leftTrackModel[62].rotateAngleY = -3.14159265F;
		leftTrackModel[62].rotateAngleZ = 5.06145483F;

		leftTrackModel[63].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 407
		leftTrackModel[63].setRotationPoint(-19.2F, 2.4F, 29.5F);
		leftTrackModel[63].rotateAngleX = 0.2443461F;
		leftTrackModel[63].rotateAngleY = -3.14159265F;
		leftTrackModel[63].rotateAngleZ = 4.27605667F;

		leftTrackModel[64].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 408
		leftTrackModel[64].setRotationPoint(-19.2F, 2.4F, 29.5F);
		leftTrackModel[64].rotateAngleX = -0.2443461F;
		leftTrackModel[64].rotateAngleY = -3.14159265F;
		leftTrackModel[64].rotateAngleZ = 4.27605667F;

		leftTrackModel[65].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 409
		leftTrackModel[65].setRotationPoint(-19.2F, 2.4F, 29.5F);
		leftTrackModel[65].rotateAngleX = 0.2443461F;
		leftTrackModel[65].rotateAngleY = -3.14159265F;
		leftTrackModel[65].rotateAngleZ = 3.4906585F;

		leftTrackModel[66].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 410
		leftTrackModel[66].setRotationPoint(-19.2F, 2.4F, 29.5F);
		leftTrackModel[66].rotateAngleX = 0.2443461F;
		leftTrackModel[66].rotateAngleY = -3.14159265F;
		leftTrackModel[66].rotateAngleZ = 2.70526034F;

		leftTrackModel[67].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 411
		leftTrackModel[67].setRotationPoint(-19.2F, 2.4F, 29.5F);
		leftTrackModel[67].rotateAngleX = -0.2443461F;
		leftTrackModel[67].rotateAngleY = -3.14159265F;
		leftTrackModel[67].rotateAngleZ = 3.4906585F;

		leftTrackModel[68].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 412
		leftTrackModel[68].setRotationPoint(-19.2F, 2.4F, 29.5F);
		leftTrackModel[68].rotateAngleX = 0.36651914F;
		leftTrackModel[68].rotateAngleY = -3.14159265F;
		leftTrackModel[68].rotateAngleZ = 1.91986218F;

		leftTrackModel[69].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 413
		leftTrackModel[69].setRotationPoint(-19.2F, 2.4F, 29.5F);
		leftTrackModel[69].rotateAngleX = -0.2443461F;
		leftTrackModel[69].rotateAngleY = -3.14159265F;
		leftTrackModel[69].rotateAngleZ = 2.70526034F;

		leftTrackModel[70].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 414
		leftTrackModel[70].setRotationPoint(-19.2F, 2.4F, 21F);
		leftTrackModel[70].rotateAngleX = 0.36651914F;
		leftTrackModel[70].rotateAngleZ = 1.97222205F;

		leftTrackModel[71].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 415
		leftTrackModel[71].setRotationPoint(-19.2F, 2.4F, 21F);
		leftTrackModel[71].rotateAngleX = -0.2443461F;
		leftTrackModel[71].rotateAngleZ = 2.75762022F;

		leftTrackModel[72].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 416
		leftTrackModel[72].setRotationPoint(-19.2F, 2.4F, 21F);
		leftTrackModel[72].rotateAngleX = 0.2443461F;
		leftTrackModel[72].rotateAngleZ = 1.18682389F;

		leftTrackModel[73].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 417
		leftTrackModel[73].setRotationPoint(-19.2F, 2.4F, 21F);
		leftTrackModel[73].rotateAngleX = -0.2443461F;
		leftTrackModel[73].rotateAngleZ = 1.97222205F;

		leftTrackModel[74].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 418
		leftTrackModel[74].setRotationPoint(-19.2F, 2.4F, 21F);
		leftTrackModel[74].rotateAngleX = 0.2443461F;
		leftTrackModel[74].rotateAngleZ = 0.40142573F;

		leftTrackModel[75].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 419
		leftTrackModel[75].setRotationPoint(-19.2F, 2.4F, 21F);
		leftTrackModel[75].rotateAngleX = -0.2443461F;
		leftTrackModel[75].rotateAngleZ = 1.18682389F;

		leftTrackModel[76].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 420
		leftTrackModel[76].setRotationPoint(-19.2F, 2.4F, 21F);
		leftTrackModel[76].rotateAngleX = 0.2443461F;
		leftTrackModel[76].rotateAngleZ = 5.89921287F;

		leftTrackModel[77].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 421
		leftTrackModel[77].setRotationPoint(-19.2F, 2.4F, 21F);
		leftTrackModel[77].rotateAngleX = -0.2443461F;
		leftTrackModel[77].rotateAngleZ = 0.40142573F;

		leftTrackModel[78].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 422
		leftTrackModel[78].setRotationPoint(-19.2F, 2.4F, 21F);
		leftTrackModel[78].rotateAngleX = 0.2443461F;
		leftTrackModel[78].rotateAngleZ = 5.11381471F;

		leftTrackModel[79].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 423
		leftTrackModel[79].setRotationPoint(-19.2F, 2.4F, 21F);
		leftTrackModel[79].rotateAngleX = -0.2443461F;
		leftTrackModel[79].rotateAngleZ = 5.89921287F;

		leftTrackModel[80].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 424
		leftTrackModel[80].setRotationPoint(-19.2F, 2.4F, 21F);
		leftTrackModel[80].rotateAngleX = 0.2443461F;
		leftTrackModel[80].rotateAngleZ = 4.32841654F;

		leftTrackModel[81].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 425
		leftTrackModel[81].setRotationPoint(-19.2F, 2.4F, 21F);
		leftTrackModel[81].rotateAngleX = -0.2443461F;
		leftTrackModel[81].rotateAngleZ = 5.11381471F;

		leftTrackModel[82].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 426
		leftTrackModel[82].setRotationPoint(-19.2F, 2.4F, 21F);
		leftTrackModel[82].rotateAngleX = 0.2443461F;
		leftTrackModel[82].rotateAngleZ = 3.54301838F;

		leftTrackModel[83].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 427
		leftTrackModel[83].setRotationPoint(-19.2F, 2.4F, 21F);
		leftTrackModel[83].rotateAngleX = -0.2443461F;
		leftTrackModel[83].rotateAngleZ = 4.32841654F;

		leftTrackModel[84].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 428
		leftTrackModel[84].setRotationPoint(-19.2F, 2.4F, 21F);
		leftTrackModel[84].rotateAngleX = 0.2443461F;
		leftTrackModel[84].rotateAngleZ = 2.75762022F;

		leftTrackModel[85].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 429
		leftTrackModel[85].setRotationPoint(-19.2F, 2.4F, 21F);
		leftTrackModel[85].rotateAngleX = -0.2443461F;
		leftTrackModel[85].rotateAngleZ = 3.54301838F;

		leftTrackModel[86].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 430
		leftTrackModel[86].setRotationPoint(-4.5F, 2.4F, 20.6F);
		leftTrackModel[86].rotateAngleZ = -0.19198622F;

		leftTrackModel[87].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 431
		leftTrackModel[87].setRotationPoint(-4.5F, 2.4F, 20.6F);
		leftTrackModel[87].rotateAngleZ = 0.45378561F;

		leftTrackModel[88].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 432
		leftTrackModel[88].setRotationPoint(-4.5F, 2.4F, 20.6F);
		leftTrackModel[88].rotateAngleZ = 1.09955743F;

		leftTrackModel[89].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 433
		leftTrackModel[89].setRotationPoint(-4.5F, 2.4F, 20.6F);
		leftTrackModel[89].rotateAngleZ = 1.74532925F;

		leftTrackModel[90].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 434
		leftTrackModel[90].setRotationPoint(-4.5F, 2.4F, 20.6F);
		leftTrackModel[90].rotateAngleZ = 2.39110108F;

		leftTrackModel[91].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 435
		leftTrackModel[91].setRotationPoint(-4.5F, 2.4F, 20.6F);
		leftTrackModel[91].rotateAngleZ = 3.0368729F;

		leftTrackModel[92].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 436
		leftTrackModel[92].setRotationPoint(-4.5F, 2.4F, 20.6F);
		leftTrackModel[92].rotateAngleZ = 3.68264472F;

		leftTrackModel[93].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 437
		leftTrackModel[93].setRotationPoint(-4.5F, 2.4F, 20.6F);
		leftTrackModel[93].rotateAngleZ = 4.32841654F;

		leftTrackModel[94].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 438
		leftTrackModel[94].setRotationPoint(-4.5F, 2.4F, 20.6F);
		leftTrackModel[94].rotateAngleZ = 4.97418837F;

		leftTrackModel[95].addShapeBox(-1.5F, -6.15F, 0F, 3, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 439
		leftTrackModel[95].setRotationPoint(-4.5F, 2.4F, 20.6F);
		leftTrackModel[95].rotateAngleZ = 5.53269373F;

		leftTrackModel[96].addShapeBox(-1F, -1F, -1F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 440
		leftTrackModel[96].setRotationPoint(-4.5F, 2.4F, 19.2F);
		leftTrackModel[96].rotateAngleZ = -0.75049158F;

		leftTrackModel[97].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 441
		leftTrackModel[97].setRotationPoint(-4.5F, 2.4F, 29.5F);
		leftTrackModel[97].rotateAngleX = -0.2443461F;
		leftTrackModel[97].rotateAngleY = -3.14159265F;
		leftTrackModel[97].rotateAngleZ = 1.1693706F;

		leftTrackModel[98].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 442
		leftTrackModel[98].setRotationPoint(-4.5F, 2.4F, 29.5F);
		leftTrackModel[98].rotateAngleX = 0.2443461F;
		leftTrackModel[98].rotateAngleY = -3.14159265F;
		leftTrackModel[98].rotateAngleZ = 0.38397244F;

		leftTrackModel[99].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 443
		leftTrackModel[99].setRotationPoint(-4.5F, 2.4F, 29.5F);
		leftTrackModel[99].rotateAngleX = 0.2443461F;
		leftTrackModel[99].rotateAngleY = -3.14159265F;
		leftTrackModel[99].rotateAngleZ = -0.40142573F;

		leftTrackModel[100].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 444
		leftTrackModel[100].setRotationPoint(-4.5F, 2.4F, 29.5F);
		leftTrackModel[100].rotateAngleX = -0.2443461F;
		leftTrackModel[100].rotateAngleY = -3.14159265F;
		leftTrackModel[100].rotateAngleZ = 0.38397244F;

		leftTrackModel[101].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 445
		leftTrackModel[101].setRotationPoint(-4.5F, 2.4F, 29.5F);
		leftTrackModel[101].rotateAngleX = 0.2443461F;
		leftTrackModel[101].rotateAngleY = -3.14159265F;
		leftTrackModel[101].rotateAngleZ = 5.09636142F;

		leftTrackModel[102].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 446
		leftTrackModel[102].setRotationPoint(-4.5F, 2.4F, 29.5F);
		leftTrackModel[102].rotateAngleX = -0.2443461F;
		leftTrackModel[102].rotateAngleY = -3.14159265F;
		leftTrackModel[102].rotateAngleZ = -0.40142573F;

		leftTrackModel[103].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 447
		leftTrackModel[103].setRotationPoint(-4.5F, 2.4F, 29.5F);
		leftTrackModel[103].rotateAngleX = 0.2443461F;
		leftTrackModel[103].rotateAngleY = -3.14159265F;
		leftTrackModel[103].rotateAngleZ = 4.31096325F;

		leftTrackModel[104].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 448
		leftTrackModel[104].setRotationPoint(-4.5F, 2.4F, 29.5F);
		leftTrackModel[104].rotateAngleX = -0.2443461F;
		leftTrackModel[104].rotateAngleY = -3.14159265F;
		leftTrackModel[104].rotateAngleZ = 5.09636142F;

		leftTrackModel[105].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 449
		leftTrackModel[105].setRotationPoint(-4.5F, 2.4F, 29.5F);
		leftTrackModel[105].rotateAngleX = -0.2443461F;
		leftTrackModel[105].rotateAngleY = -3.14159265F;
		leftTrackModel[105].rotateAngleZ = 4.31096325F;

		leftTrackModel[106].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 450
		leftTrackModel[106].setRotationPoint(-4.5F, 2.4F, 29.5F);
		leftTrackModel[106].rotateAngleX = 0.2443461F;
		leftTrackModel[106].rotateAngleY = -3.14159265F;
		leftTrackModel[106].rotateAngleZ = 3.52556509F;

		leftTrackModel[107].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 451
		leftTrackModel[107].setRotationPoint(-4.5F, 2.4F, 29.5F);
		leftTrackModel[107].rotateAngleX = -0.2443461F;
		leftTrackModel[107].rotateAngleY = -3.14159265F;
		leftTrackModel[107].rotateAngleZ = 3.52556509F;

		leftTrackModel[108].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 452
		leftTrackModel[108].setRotationPoint(-4.5F, 2.4F, 29.5F);
		leftTrackModel[108].rotateAngleX = 0.2443461F;
		leftTrackModel[108].rotateAngleY = -3.14159265F;
		leftTrackModel[108].rotateAngleZ = 2.74016693F;

		leftTrackModel[109].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 453
		leftTrackModel[109].setRotationPoint(-4.5F, 2.4F, 29.5F);
		leftTrackModel[109].rotateAngleX = 0.2443461F;
		leftTrackModel[109].rotateAngleY = -3.14159265F;
		leftTrackModel[109].rotateAngleZ = 1.95476876F;

		leftTrackModel[110].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 454
		leftTrackModel[110].setRotationPoint(-4.5F, 2.4F, 29.5F);
		leftTrackModel[110].rotateAngleX = -0.2443461F;
		leftTrackModel[110].rotateAngleY = -3.14159265F;
		leftTrackModel[110].rotateAngleZ = 2.74016693F;

		leftTrackModel[111].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 455
		leftTrackModel[111].setRotationPoint(-4.5F, 2.4F, 29.5F);
		leftTrackModel[111].rotateAngleX = 0.36651914F;
		leftTrackModel[111].rotateAngleY = -3.14159265F;
		leftTrackModel[111].rotateAngleZ = 1.1693706F;

		leftTrackModel[112].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 456
		leftTrackModel[112].setRotationPoint(-4.5F, 2.4F, 29.5F);
		leftTrackModel[112].rotateAngleX = -0.2443461F;
		leftTrackModel[112].rotateAngleY = -3.14159265F;
		leftTrackModel[112].rotateAngleZ = 1.95476876F;

		leftTrackModel[113].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 457
		leftTrackModel[113].setRotationPoint(-4.5F, 2.4F, 21F);
		leftTrackModel[113].rotateAngleX = 0.36651914F;
		leftTrackModel[113].rotateAngleZ = 1.22173048F;

		leftTrackModel[114].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 458
		leftTrackModel[114].setRotationPoint(-4.5F, 2.4F, 21F);
		leftTrackModel[114].rotateAngleX = -0.2443461F;
		leftTrackModel[114].rotateAngleZ = 2.00712864F;

		leftTrackModel[115].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 459
		leftTrackModel[115].setRotationPoint(-4.5F, 2.4F, 21F);
		leftTrackModel[115].rotateAngleX = 0.2443461F;
		leftTrackModel[115].rotateAngleZ = 0.43633231F;

		leftTrackModel[116].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 460
		leftTrackModel[116].setRotationPoint(-4.5F, 2.4F, 21F);
		leftTrackModel[116].rotateAngleX = -0.2443461F;
		leftTrackModel[116].rotateAngleZ = 1.22173048F;

		leftTrackModel[117].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 461
		leftTrackModel[117].setRotationPoint(-4.5F, 2.4F, 21F);
		leftTrackModel[117].rotateAngleX = 0.2443461F;
		leftTrackModel[117].rotateAngleZ = -0.34906585F;

		leftTrackModel[118].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 462
		leftTrackModel[118].setRotationPoint(-4.5F, 2.4F, 21F);
		leftTrackModel[118].rotateAngleX = -0.2443461F;
		leftTrackModel[118].rotateAngleZ = 0.43633231F;

		leftTrackModel[119].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 463
		leftTrackModel[119].setRotationPoint(-4.5F, 2.4F, 21F);
		leftTrackModel[119].rotateAngleX = 0.2443461F;
		leftTrackModel[119].rotateAngleZ = 5.14872129F;

		leftTrackModel[120].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 464
		leftTrackModel[120].setRotationPoint(-4.5F, 2.4F, 21F);
		leftTrackModel[120].rotateAngleX = -0.2443461F;
		leftTrackModel[120].rotateAngleZ = -0.34906585F;

		leftTrackModel[121].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 465
		leftTrackModel[121].setRotationPoint(-4.5F, 2.4F, 21F);
		leftTrackModel[121].rotateAngleX = 0.2443461F;
		leftTrackModel[121].rotateAngleZ = 4.36332313F;

		leftTrackModel[122].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 466
		leftTrackModel[122].setRotationPoint(-4.5F, 2.4F, 21F);
		leftTrackModel[122].rotateAngleX = -0.2443461F;
		leftTrackModel[122].rotateAngleZ = 5.14872129F;

		leftTrackModel[123].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 467
		leftTrackModel[123].setRotationPoint(-4.5F, 2.4F, 21F);
		leftTrackModel[123].rotateAngleX = 0.2443461F;
		leftTrackModel[123].rotateAngleZ = 3.57792497F;

		leftTrackModel[124].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 468
		leftTrackModel[124].setRotationPoint(-4.5F, 2.4F, 21F);
		leftTrackModel[124].rotateAngleX = -0.2443461F;
		leftTrackModel[124].rotateAngleZ = 4.36332313F;

		leftTrackModel[125].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 469
		leftTrackModel[125].setRotationPoint(-4.5F, 2.4F, 21F);
		leftTrackModel[125].rotateAngleX = 0.2443461F;
		leftTrackModel[125].rotateAngleZ = 2.7925268F;

		leftTrackModel[126].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 470
		leftTrackModel[126].setRotationPoint(-4.5F, 2.4F, 21F);
		leftTrackModel[126].rotateAngleX = -0.2443461F;
		leftTrackModel[126].rotateAngleZ = 3.57792497F;

		leftTrackModel[127].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 471
		leftTrackModel[127].setRotationPoint(-4.5F, 2.4F, 21F);
		leftTrackModel[127].rotateAngleX = 0.2443461F;
		leftTrackModel[127].rotateAngleZ = 2.00712864F;

		leftTrackModel[128].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 472
		leftTrackModel[128].setRotationPoint(-4.5F, 2.4F, 21F);
		leftTrackModel[128].rotateAngleX = -0.2443461F;
		leftTrackModel[128].rotateAngleZ = 2.7925268F;

		leftTrackModel[129].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 473
		leftTrackModel[129].setRotationPoint(10F, 2.4F, 20.6F);
		leftTrackModel[129].rotateAngleZ = -0.19198622F;

		leftTrackModel[130].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 474
		leftTrackModel[130].setRotationPoint(10F, 2.4F, 20.6F);
		leftTrackModel[130].rotateAngleZ = 0.45378561F;

		leftTrackModel[131].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 475
		leftTrackModel[131].setRotationPoint(10F, 2.4F, 20.6F);
		leftTrackModel[131].rotateAngleZ = 1.09955743F;

		leftTrackModel[132].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 476
		leftTrackModel[132].setRotationPoint(10F, 2.4F, 20.6F);
		leftTrackModel[132].rotateAngleZ = 1.74532925F;

		leftTrackModel[133].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 477
		leftTrackModel[133].setRotationPoint(10F, 2.4F, 20.6F);
		leftTrackModel[133].rotateAngleZ = 2.39110108F;

		leftTrackModel[134].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 478
		leftTrackModel[134].setRotationPoint(10F, 2.4F, 20.6F);
		leftTrackModel[134].rotateAngleZ = 3.0368729F;

		leftTrackModel[135].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 479
		leftTrackModel[135].setRotationPoint(10F, 2.4F, 20.6F);
		leftTrackModel[135].rotateAngleZ = 3.68264472F;

		leftTrackModel[136].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 480
		leftTrackModel[136].setRotationPoint(10F, 2.4F, 20.6F);
		leftTrackModel[136].rotateAngleZ = 4.32841654F;

		leftTrackModel[137].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 481
		leftTrackModel[137].setRotationPoint(10F, 2.4F, 20.6F);
		leftTrackModel[137].rotateAngleZ = 4.97418837F;

		leftTrackModel[138].addShapeBox(-1.5F, -6.15F, 0F, 3, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 482
		leftTrackModel[138].setRotationPoint(10F, 2.4F, 20.6F);
		leftTrackModel[138].rotateAngleZ = 5.53269373F;

		leftTrackModel[139].addShapeBox(-1F, -1F, -1F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 483
		leftTrackModel[139].setRotationPoint(10F, 2.4F, 19.2F);
		leftTrackModel[139].rotateAngleZ = -0.75049158F;

		leftTrackModel[140].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 484
		leftTrackModel[140].setRotationPoint(10F, 2.4F, 29.5F);
		leftTrackModel[140].rotateAngleX = -0.2443461F;
		leftTrackModel[140].rotateAngleY = -3.14159265F;
		leftTrackModel[140].rotateAngleZ = 1.1693706F;

		leftTrackModel[141].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 485
		leftTrackModel[141].setRotationPoint(10F, 2.4F, 29.5F);
		leftTrackModel[141].rotateAngleX = 0.2443461F;
		leftTrackModel[141].rotateAngleY = -3.14159265F;
		leftTrackModel[141].rotateAngleZ = 0.38397244F;

		leftTrackModel[142].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 486
		leftTrackModel[142].setRotationPoint(10F, 2.4F, 29.5F);
		leftTrackModel[142].rotateAngleX = 0.2443461F;
		leftTrackModel[142].rotateAngleY = -3.14159265F;
		leftTrackModel[142].rotateAngleZ = -0.40142573F;

		leftTrackModel[143].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 487
		leftTrackModel[143].setRotationPoint(10F, 2.4F, 29.5F);
		leftTrackModel[143].rotateAngleX = -0.2443461F;
		leftTrackModel[143].rotateAngleY = -3.14159265F;
		leftTrackModel[143].rotateAngleZ = 0.38397244F;

		leftTrackModel[144].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 488
		leftTrackModel[144].setRotationPoint(10F, 2.4F, 29.5F);
		leftTrackModel[144].rotateAngleX = 0.2443461F;
		leftTrackModel[144].rotateAngleY = -3.14159265F;
		leftTrackModel[144].rotateAngleZ = 5.09636142F;

		leftTrackModel[145].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 489
		leftTrackModel[145].setRotationPoint(10F, 2.4F, 29.5F);
		leftTrackModel[145].rotateAngleX = -0.2443461F;
		leftTrackModel[145].rotateAngleY = -3.14159265F;
		leftTrackModel[145].rotateAngleZ = -0.40142573F;

		leftTrackModel[146].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 490
		leftTrackModel[146].setRotationPoint(10F, 2.4F, 29.5F);
		leftTrackModel[146].rotateAngleX = 0.2443461F;
		leftTrackModel[146].rotateAngleY = -3.14159265F;
		leftTrackModel[146].rotateAngleZ = 4.31096325F;

		leftTrackModel[147].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 491
		leftTrackModel[147].setRotationPoint(10F, 2.4F, 29.5F);
		leftTrackModel[147].rotateAngleX = -0.2443461F;
		leftTrackModel[147].rotateAngleY = -3.14159265F;
		leftTrackModel[147].rotateAngleZ = 5.09636142F;

		leftTrackModel[148].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 492
		leftTrackModel[148].setRotationPoint(10F, 2.4F, 29.5F);
		leftTrackModel[148].rotateAngleX = -0.2443461F;
		leftTrackModel[148].rotateAngleY = -3.14159265F;
		leftTrackModel[148].rotateAngleZ = 4.31096325F;

		leftTrackModel[149].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 493
		leftTrackModel[149].setRotationPoint(10F, 2.4F, 29.5F);
		leftTrackModel[149].rotateAngleX = 0.2443461F;
		leftTrackModel[149].rotateAngleY = -3.14159265F;
		leftTrackModel[149].rotateAngleZ = 3.52556509F;

		leftTrackModel[150].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 494
		leftTrackModel[150].setRotationPoint(10F, 2.4F, 29.5F);
		leftTrackModel[150].rotateAngleX = -0.2443461F;
		leftTrackModel[150].rotateAngleY = -3.14159265F;
		leftTrackModel[150].rotateAngleZ = 3.52556509F;

		leftTrackModel[151].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 495
		leftTrackModel[151].setRotationPoint(10F, 2.4F, 29.5F);
		leftTrackModel[151].rotateAngleX = 0.2443461F;
		leftTrackModel[151].rotateAngleY = -3.14159265F;
		leftTrackModel[151].rotateAngleZ = 2.74016693F;

		leftTrackModel[152].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 496
		leftTrackModel[152].setRotationPoint(10F, 2.4F, 29.5F);
		leftTrackModel[152].rotateAngleX = 0.2443461F;
		leftTrackModel[152].rotateAngleY = -3.14159265F;
		leftTrackModel[152].rotateAngleZ = 1.95476876F;

		leftTrackModel[153].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 497
		leftTrackModel[153].setRotationPoint(10F, 2.4F, 29.5F);
		leftTrackModel[153].rotateAngleX = -0.2443461F;
		leftTrackModel[153].rotateAngleY = -3.14159265F;
		leftTrackModel[153].rotateAngleZ = 2.74016693F;

		leftTrackModel[154].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 498
		leftTrackModel[154].setRotationPoint(10F, 2.4F, 29.5F);
		leftTrackModel[154].rotateAngleX = 0.36651914F;
		leftTrackModel[154].rotateAngleY = -3.14159265F;
		leftTrackModel[154].rotateAngleZ = 1.1693706F;

		leftTrackModel[155].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 499
		leftTrackModel[155].setRotationPoint(10F, 2.4F, 29.5F);
		leftTrackModel[155].rotateAngleX = -0.2443461F;
		leftTrackModel[155].rotateAngleY = -3.14159265F;
		leftTrackModel[155].rotateAngleZ = 1.95476876F;

		leftTrackModel[156].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 500
		leftTrackModel[156].setRotationPoint(10F, 2.4F, 21F);
		leftTrackModel[156].rotateAngleX = 0.36651914F;
		leftTrackModel[156].rotateAngleZ = 1.22173048F;

		leftTrackModel[157].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 501
		leftTrackModel[157].setRotationPoint(10F, 2.4F, 21F);
		leftTrackModel[157].rotateAngleX = -0.2443461F;
		leftTrackModel[157].rotateAngleZ = 2.00712864F;

		leftTrackModel[158].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 502
		leftTrackModel[158].setRotationPoint(10F, 2.4F, 21F);
		leftTrackModel[158].rotateAngleX = 0.2443461F;
		leftTrackModel[158].rotateAngleZ = 0.43633231F;

		leftTrackModel[159].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 503
		leftTrackModel[159].setRotationPoint(10F, 2.4F, 21F);
		leftTrackModel[159].rotateAngleX = -0.2443461F;
		leftTrackModel[159].rotateAngleZ = 1.22173048F;

		leftTrackModel[160].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 504
		leftTrackModel[160].setRotationPoint(10F, 2.4F, 21F);
		leftTrackModel[160].rotateAngleX = 0.2443461F;
		leftTrackModel[160].rotateAngleZ = -0.34906585F;

		leftTrackModel[161].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 505
		leftTrackModel[161].setRotationPoint(10F, 2.4F, 21F);
		leftTrackModel[161].rotateAngleX = -0.2443461F;
		leftTrackModel[161].rotateAngleZ = 0.43633231F;

		leftTrackModel[162].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 506
		leftTrackModel[162].setRotationPoint(10F, 2.4F, 21F);
		leftTrackModel[162].rotateAngleX = 0.2443461F;
		leftTrackModel[162].rotateAngleZ = 5.14872129F;

		leftTrackModel[163].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 507
		leftTrackModel[163].setRotationPoint(10F, 2.4F, 21F);
		leftTrackModel[163].rotateAngleX = -0.2443461F;
		leftTrackModel[163].rotateAngleZ = -0.34906585F;

		leftTrackModel[164].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 508
		leftTrackModel[164].setRotationPoint(10F, 2.4F, 21F);
		leftTrackModel[164].rotateAngleX = 0.2443461F;
		leftTrackModel[164].rotateAngleZ = 4.36332313F;

		leftTrackModel[165].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 509
		leftTrackModel[165].setRotationPoint(10F, 2.4F, 21F);
		leftTrackModel[165].rotateAngleX = -0.2443461F;
		leftTrackModel[165].rotateAngleZ = 5.14872129F;

		leftTrackModel[166].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 510
		leftTrackModel[166].setRotationPoint(10F, 2.4F, 21F);
		leftTrackModel[166].rotateAngleX = 0.2443461F;
		leftTrackModel[166].rotateAngleZ = 3.57792497F;

		leftTrackModel[167].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 511
		leftTrackModel[167].setRotationPoint(10F, 2.4F, 21F);
		leftTrackModel[167].rotateAngleX = -0.2443461F;
		leftTrackModel[167].rotateAngleZ = 4.36332313F;

		leftTrackModel[168].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 512
		leftTrackModel[168].setRotationPoint(10F, 2.4F, 21F);
		leftTrackModel[168].rotateAngleX = 0.2443461F;
		leftTrackModel[168].rotateAngleZ = 2.7925268F;

		leftTrackModel[169].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 513
		leftTrackModel[169].setRotationPoint(10F, 2.4F, 21F);
		leftTrackModel[169].rotateAngleX = -0.2443461F;
		leftTrackModel[169].rotateAngleZ = 3.57792497F;

		leftTrackModel[170].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 514
		leftTrackModel[170].setRotationPoint(10F, 2.4F, 21F);
		leftTrackModel[170].rotateAngleX = 0.2443461F;
		leftTrackModel[170].rotateAngleZ = 2.00712864F;

		leftTrackModel[171].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 515
		leftTrackModel[171].setRotationPoint(10F, 2.4F, 21F);
		leftTrackModel[171].rotateAngleX = -0.2443461F;
		leftTrackModel[171].rotateAngleZ = 2.7925268F;

		leftTrackModel[172].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 516
		leftTrackModel[172].setRotationPoint(24.5F, 2.4F, 20.6F);
		leftTrackModel[172].rotateAngleZ = -0.19198622F;

		leftTrackModel[173].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 517
		leftTrackModel[173].setRotationPoint(24.5F, 2.4F, 20.6F);
		leftTrackModel[173].rotateAngleZ = 0.45378561F;

		leftTrackModel[174].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 518
		leftTrackModel[174].setRotationPoint(24.5F, 2.4F, 20.6F);
		leftTrackModel[174].rotateAngleZ = 1.09955743F;

		leftTrackModel[175].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 519
		leftTrackModel[175].setRotationPoint(24.5F, 2.4F, 20.6F);
		leftTrackModel[175].rotateAngleZ = 1.74532925F;

		leftTrackModel[176].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 520
		leftTrackModel[176].setRotationPoint(24.5F, 2.4F, 20.6F);
		leftTrackModel[176].rotateAngleZ = 2.39110108F;

		leftTrackModel[177].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 521
		leftTrackModel[177].setRotationPoint(24.5F, 2.4F, 20.6F);
		leftTrackModel[177].rotateAngleZ = 3.0368729F;

		leftTrackModel[178].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 522
		leftTrackModel[178].setRotationPoint(24.5F, 2.4F, 20.6F);
		leftTrackModel[178].rotateAngleZ = 3.68264472F;

		leftTrackModel[179].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 523
		leftTrackModel[179].setRotationPoint(24.5F, 2.4F, 20.6F);
		leftTrackModel[179].rotateAngleZ = 4.32841654F;

		leftTrackModel[180].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 524
		leftTrackModel[180].setRotationPoint(24.5F, 2.4F, 20.6F);
		leftTrackModel[180].rotateAngleZ = 4.97418837F;

		leftTrackModel[181].addShapeBox(-1.5F, -6.15F, 0F, 3, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 525
		leftTrackModel[181].setRotationPoint(24.5F, 2.4F, 20.6F);
		leftTrackModel[181].rotateAngleZ = 5.53269373F;

		leftTrackModel[182].addShapeBox(-1F, -1F, -1F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 526
		leftTrackModel[182].setRotationPoint(24.5F, 2.4F, 19.2F);
		leftTrackModel[182].rotateAngleZ = -0.75049158F;

		leftTrackModel[183].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 527
		leftTrackModel[183].setRotationPoint(24.5F, 2.4F, 29.5F);
		leftTrackModel[183].rotateAngleX = -0.2443461F;
		leftTrackModel[183].rotateAngleY = -3.14159265F;
		leftTrackModel[183].rotateAngleZ = 1.1693706F;

		leftTrackModel[184].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 528
		leftTrackModel[184].setRotationPoint(24.5F, 2.4F, 29.5F);
		leftTrackModel[184].rotateAngleX = 0.2443461F;
		leftTrackModel[184].rotateAngleY = -3.14159265F;
		leftTrackModel[184].rotateAngleZ = 0.38397244F;

		leftTrackModel[185].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 529
		leftTrackModel[185].setRotationPoint(24.5F, 2.4F, 29.5F);
		leftTrackModel[185].rotateAngleX = 0.2443461F;
		leftTrackModel[185].rotateAngleY = -3.14159265F;
		leftTrackModel[185].rotateAngleZ = -0.40142573F;

		leftTrackModel[186].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 530
		leftTrackModel[186].setRotationPoint(24.5F, 2.4F, 29.5F);
		leftTrackModel[186].rotateAngleX = -0.2443461F;
		leftTrackModel[186].rotateAngleY = -3.14159265F;
		leftTrackModel[186].rotateAngleZ = 0.38397244F;

		leftTrackModel[187].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 531
		leftTrackModel[187].setRotationPoint(24.5F, 2.4F, 29.5F);
		leftTrackModel[187].rotateAngleX = 0.2443461F;
		leftTrackModel[187].rotateAngleY = -3.14159265F;
		leftTrackModel[187].rotateAngleZ = 5.09636142F;

		leftTrackModel[188].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 532
		leftTrackModel[188].setRotationPoint(24.5F, 2.4F, 29.5F);
		leftTrackModel[188].rotateAngleX = -0.2443461F;
		leftTrackModel[188].rotateAngleY = -3.14159265F;
		leftTrackModel[188].rotateAngleZ = -0.40142573F;

		leftTrackModel[189].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 533
		leftTrackModel[189].setRotationPoint(24.5F, 2.4F, 29.5F);
		leftTrackModel[189].rotateAngleX = 0.2443461F;
		leftTrackModel[189].rotateAngleY = -3.14159265F;
		leftTrackModel[189].rotateAngleZ = 4.31096325F;

		leftTrackModel[190].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 534
		leftTrackModel[190].setRotationPoint(24.5F, 2.4F, 29.5F);
		leftTrackModel[190].rotateAngleX = -0.2443461F;
		leftTrackModel[190].rotateAngleY = -3.14159265F;
		leftTrackModel[190].rotateAngleZ = 5.09636142F;

		leftTrackModel[191].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 535
		leftTrackModel[191].setRotationPoint(24.5F, 2.4F, 29.5F);
		leftTrackModel[191].rotateAngleX = -0.2443461F;
		leftTrackModel[191].rotateAngleY = -3.14159265F;
		leftTrackModel[191].rotateAngleZ = 4.31096325F;

		leftTrackModel[192].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 536
		leftTrackModel[192].setRotationPoint(24.5F, 2.4F, 29.5F);
		leftTrackModel[192].rotateAngleX = 0.2443461F;
		leftTrackModel[192].rotateAngleY = -3.14159265F;
		leftTrackModel[192].rotateAngleZ = 3.52556509F;

		leftTrackModel[193].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 537
		leftTrackModel[193].setRotationPoint(24.5F, 2.4F, 29.5F);
		leftTrackModel[193].rotateAngleX = -0.2443461F;
		leftTrackModel[193].rotateAngleY = -3.14159265F;
		leftTrackModel[193].rotateAngleZ = 3.52556509F;

		leftTrackModel[194].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 538
		leftTrackModel[194].setRotationPoint(24.5F, 2.4F, 29.5F);
		leftTrackModel[194].rotateAngleX = 0.2443461F;
		leftTrackModel[194].rotateAngleY = -3.14159265F;
		leftTrackModel[194].rotateAngleZ = 2.74016693F;

		leftTrackModel[195].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 539
		leftTrackModel[195].setRotationPoint(24.5F, 2.4F, 29.5F);
		leftTrackModel[195].rotateAngleX = 0.2443461F;
		leftTrackModel[195].rotateAngleY = -3.14159265F;
		leftTrackModel[195].rotateAngleZ = 1.95476876F;

		leftTrackModel[196].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 540
		leftTrackModel[196].setRotationPoint(24.5F, 2.4F, 29.5F);
		leftTrackModel[196].rotateAngleX = -0.2443461F;
		leftTrackModel[196].rotateAngleY = -3.14159265F;
		leftTrackModel[196].rotateAngleZ = 2.74016693F;

		leftTrackModel[197].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 541
		leftTrackModel[197].setRotationPoint(24.5F, 2.4F, 29.5F);
		leftTrackModel[197].rotateAngleX = 0.36651914F;
		leftTrackModel[197].rotateAngleY = -3.14159265F;
		leftTrackModel[197].rotateAngleZ = 1.1693706F;

		leftTrackModel[198].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 542
		leftTrackModel[198].setRotationPoint(24.5F, 2.4F, 29.5F);
		leftTrackModel[198].rotateAngleX = -0.2443461F;
		leftTrackModel[198].rotateAngleY = -3.14159265F;
		leftTrackModel[198].rotateAngleZ = 1.95476876F;

		leftTrackModel[199].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 543
		leftTrackModel[199].setRotationPoint(24.5F, 2.4F, 21F);
		leftTrackModel[199].rotateAngleX = 0.36651914F;
		leftTrackModel[199].rotateAngleZ = 1.22173048F;

		leftTrackModel[200].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 544
		leftTrackModel[200].setRotationPoint(24.5F, 2.4F, 21F);
		leftTrackModel[200].rotateAngleX = -0.2443461F;
		leftTrackModel[200].rotateAngleZ = 2.00712864F;

		leftTrackModel[201].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 545
		leftTrackModel[201].setRotationPoint(24.5F, 2.4F, 21F);
		leftTrackModel[201].rotateAngleX = 0.2443461F;
		leftTrackModel[201].rotateAngleZ = 0.43633231F;

		leftTrackModel[202].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 546
		leftTrackModel[202].setRotationPoint(24.5F, 2.4F, 21F);
		leftTrackModel[202].rotateAngleX = -0.2443461F;
		leftTrackModel[202].rotateAngleZ = 1.22173048F;

		leftTrackModel[203].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 547
		leftTrackModel[203].setRotationPoint(24.5F, 2.4F, 21F);
		leftTrackModel[203].rotateAngleX = 0.2443461F;
		leftTrackModel[203].rotateAngleZ = -0.34906585F;

		leftTrackModel[204].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 548
		leftTrackModel[204].setRotationPoint(24.5F, 2.4F, 21F);
		leftTrackModel[204].rotateAngleX = -0.2443461F;
		leftTrackModel[204].rotateAngleZ = 0.43633231F;

		leftTrackModel[205].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 549
		leftTrackModel[205].setRotationPoint(24.5F, 2.4F, 21F);
		leftTrackModel[205].rotateAngleX = 0.2443461F;
		leftTrackModel[205].rotateAngleZ = 5.14872129F;

		leftTrackModel[206].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 550
		leftTrackModel[206].setRotationPoint(24.5F, 2.4F, 21F);
		leftTrackModel[206].rotateAngleX = -0.2443461F;
		leftTrackModel[206].rotateAngleZ = -0.34906585F;

		leftTrackModel[207].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 551
		leftTrackModel[207].setRotationPoint(24.5F, 2.4F, 21F);
		leftTrackModel[207].rotateAngleX = 0.2443461F;
		leftTrackModel[207].rotateAngleZ = 4.36332313F;

		leftTrackModel[208].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 552
		leftTrackModel[208].setRotationPoint(24.5F, 2.4F, 21F);
		leftTrackModel[208].rotateAngleX = -0.2443461F;
		leftTrackModel[208].rotateAngleZ = 5.14872129F;

		leftTrackModel[209].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 553
		leftTrackModel[209].setRotationPoint(24.5F, 2.4F, 21F);
		leftTrackModel[209].rotateAngleX = 0.2443461F;
		leftTrackModel[209].rotateAngleZ = 3.57792497F;

		leftTrackModel[210].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 554
		leftTrackModel[210].setRotationPoint(24.5F, 2.4F, 21F);
		leftTrackModel[210].rotateAngleX = -0.2443461F;
		leftTrackModel[210].rotateAngleZ = 4.36332313F;

		leftTrackModel[211].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 555
		leftTrackModel[211].setRotationPoint(24.5F, 2.4F, 21F);
		leftTrackModel[211].rotateAngleX = 0.2443461F;
		leftTrackModel[211].rotateAngleZ = 2.7925268F;

		leftTrackModel[212].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 556
		leftTrackModel[212].setRotationPoint(24.5F, 2.4F, 21F);
		leftTrackModel[212].rotateAngleX = -0.2443461F;
		leftTrackModel[212].rotateAngleZ = 3.57792497F;

		leftTrackModel[213].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 557
		leftTrackModel[213].setRotationPoint(24.5F, 2.4F, 21F);
		leftTrackModel[213].rotateAngleX = 0.2443461F;
		leftTrackModel[213].rotateAngleZ = 2.00712864F;

		leftTrackModel[214].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 558
		leftTrackModel[214].setRotationPoint(24.5F, 2.4F, 21F);
		leftTrackModel[214].rotateAngleX = -0.2443461F;
		leftTrackModel[214].rotateAngleZ = 2.7925268F;

		leftTrackModel[215].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 559
		leftTrackModel[215].setRotationPoint(38.5F, 2.4F, 20.6F);
		leftTrackModel[215].rotateAngleZ = -0.19198622F;

		leftTrackModel[216].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 560
		leftTrackModel[216].setRotationPoint(38.5F, 2.4F, 20.6F);
		leftTrackModel[216].rotateAngleZ = 0.45378561F;

		leftTrackModel[217].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 561
		leftTrackModel[217].setRotationPoint(38.5F, 2.4F, 20.6F);
		leftTrackModel[217].rotateAngleZ = 1.09955743F;

		leftTrackModel[218].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 562
		leftTrackModel[218].setRotationPoint(38.5F, 2.4F, 20.6F);
		leftTrackModel[218].rotateAngleZ = 1.74532925F;

		leftTrackModel[219].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 563
		leftTrackModel[219].setRotationPoint(38.5F, 2.4F, 20.6F);
		leftTrackModel[219].rotateAngleZ = 2.39110108F;

		leftTrackModel[220].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 564
		leftTrackModel[220].setRotationPoint(38.5F, 2.4F, 20.6F);
		leftTrackModel[220].rotateAngleZ = 3.0368729F;

		leftTrackModel[221].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 565
		leftTrackModel[221].setRotationPoint(38.5F, 2.4F, 20.6F);
		leftTrackModel[221].rotateAngleZ = 3.68264472F;

		leftTrackModel[222].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 566
		leftTrackModel[222].setRotationPoint(38.5F, 2.4F, 20.6F);
		leftTrackModel[222].rotateAngleZ = 4.32841654F;

		leftTrackModel[223].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 567
		leftTrackModel[223].setRotationPoint(38.5F, 2.4F, 20.6F);
		leftTrackModel[223].rotateAngleZ = 4.97418837F;

		leftTrackModel[224].addShapeBox(-1.5F, -6.15F, 0F, 3, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 568
		leftTrackModel[224].setRotationPoint(38.5F, 2.4F, 20.6F);
		leftTrackModel[224].rotateAngleZ = 5.53269373F;

		leftTrackModel[225].addShapeBox(-1F, -1F, -1F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 569
		leftTrackModel[225].setRotationPoint(38.5F, 2.4F, 19.2F);
		leftTrackModel[225].rotateAngleZ = -0.75049158F;

		leftTrackModel[226].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 570
		leftTrackModel[226].setRotationPoint(38.5F, 2.4F, 29.5F);
		leftTrackModel[226].rotateAngleX = -0.2443461F;
		leftTrackModel[226].rotateAngleY = -3.14159265F;
		leftTrackModel[226].rotateAngleZ = 1.1693706F;

		leftTrackModel[227].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 571
		leftTrackModel[227].setRotationPoint(38.5F, 2.4F, 29.5F);
		leftTrackModel[227].rotateAngleX = 0.2443461F;
		leftTrackModel[227].rotateAngleY = -3.14159265F;
		leftTrackModel[227].rotateAngleZ = 0.38397244F;

		leftTrackModel[228].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 572
		leftTrackModel[228].setRotationPoint(38.5F, 2.4F, 29.5F);
		leftTrackModel[228].rotateAngleX = 0.2443461F;
		leftTrackModel[228].rotateAngleY = -3.14159265F;
		leftTrackModel[228].rotateAngleZ = -0.40142573F;

		leftTrackModel[229].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 573
		leftTrackModel[229].setRotationPoint(38.5F, 2.4F, 29.5F);
		leftTrackModel[229].rotateAngleX = -0.2443461F;
		leftTrackModel[229].rotateAngleY = -3.14159265F;
		leftTrackModel[229].rotateAngleZ = 0.38397244F;

		leftTrackModel[230].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 574
		leftTrackModel[230].setRotationPoint(38.5F, 2.4F, 29.5F);
		leftTrackModel[230].rotateAngleX = 0.2443461F;
		leftTrackModel[230].rotateAngleY = -3.14159265F;
		leftTrackModel[230].rotateAngleZ = 5.09636142F;

		leftTrackModel[231].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 575
		leftTrackModel[231].setRotationPoint(38.5F, 2.4F, 29.5F);
		leftTrackModel[231].rotateAngleX = -0.2443461F;
		leftTrackModel[231].rotateAngleY = -3.14159265F;
		leftTrackModel[231].rotateAngleZ = -0.40142573F;

		leftTrackModel[232].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 576
		leftTrackModel[232].setRotationPoint(38.5F, 2.4F, 29.5F);
		leftTrackModel[232].rotateAngleX = 0.2443461F;
		leftTrackModel[232].rotateAngleY = -3.14159265F;
		leftTrackModel[232].rotateAngleZ = 4.31096325F;

		leftTrackModel[233].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 577
		leftTrackModel[233].setRotationPoint(38.5F, 2.4F, 29.5F);
		leftTrackModel[233].rotateAngleX = -0.2443461F;
		leftTrackModel[233].rotateAngleY = -3.14159265F;
		leftTrackModel[233].rotateAngleZ = 5.09636142F;

		leftTrackModel[234].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 578
		leftTrackModel[234].setRotationPoint(38.5F, 2.4F, 29.5F);
		leftTrackModel[234].rotateAngleX = -0.2443461F;
		leftTrackModel[234].rotateAngleY = -3.14159265F;
		leftTrackModel[234].rotateAngleZ = 4.31096325F;

		leftTrackModel[235].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 579
		leftTrackModel[235].setRotationPoint(38.5F, 2.4F, 29.5F);
		leftTrackModel[235].rotateAngleX = 0.2443461F;
		leftTrackModel[235].rotateAngleY = -3.14159265F;
		leftTrackModel[235].rotateAngleZ = 3.52556509F;

		leftTrackModel[236].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 580
		leftTrackModel[236].setRotationPoint(38.5F, 2.4F, 29.5F);
		leftTrackModel[236].rotateAngleX = -0.2443461F;
		leftTrackModel[236].rotateAngleY = -3.14159265F;
		leftTrackModel[236].rotateAngleZ = 3.52556509F;

		leftTrackModel[237].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 581
		leftTrackModel[237].setRotationPoint(38.5F, 2.4F, 29.5F);
		leftTrackModel[237].rotateAngleX = 0.2443461F;
		leftTrackModel[237].rotateAngleY = -3.14159265F;
		leftTrackModel[237].rotateAngleZ = 2.74016693F;

		leftTrackModel[238].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 582
		leftTrackModel[238].setRotationPoint(38.5F, 2.4F, 29.5F);
		leftTrackModel[238].rotateAngleX = 0.2443461F;
		leftTrackModel[238].rotateAngleY = -3.14159265F;
		leftTrackModel[238].rotateAngleZ = 1.95476876F;

		leftTrackModel[239].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 583
		leftTrackModel[239].setRotationPoint(38.5F, 2.4F, 29.5F);
		leftTrackModel[239].rotateAngleX = -0.2443461F;
		leftTrackModel[239].rotateAngleY = -3.14159265F;
		leftTrackModel[239].rotateAngleZ = 2.74016693F;

		leftTrackModel[240].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 584
		leftTrackModel[240].setRotationPoint(38.5F, 2.4F, 29.5F);
		leftTrackModel[240].rotateAngleX = 0.36651914F;
		leftTrackModel[240].rotateAngleY = -3.14159265F;
		leftTrackModel[240].rotateAngleZ = 1.1693706F;

		leftTrackModel[241].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 585
		leftTrackModel[241].setRotationPoint(38.5F, 2.4F, 29.5F);
		leftTrackModel[241].rotateAngleX = -0.2443461F;
		leftTrackModel[241].rotateAngleY = -3.14159265F;
		leftTrackModel[241].rotateAngleZ = 1.95476876F;

		leftTrackModel[242].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 586
		leftTrackModel[242].setRotationPoint(38.5F, 2.4F, 21F);
		leftTrackModel[242].rotateAngleX = 0.36651914F;
		leftTrackModel[242].rotateAngleZ = 1.22173048F;

		leftTrackModel[243].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 587
		leftTrackModel[243].setRotationPoint(38.5F, 2.4F, 21F);
		leftTrackModel[243].rotateAngleX = -0.2443461F;
		leftTrackModel[243].rotateAngleZ = 2.00712864F;

		leftTrackModel[244].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 588
		leftTrackModel[244].setRotationPoint(38.5F, 2.4F, 21F);
		leftTrackModel[244].rotateAngleX = 0.2443461F;
		leftTrackModel[244].rotateAngleZ = 0.43633231F;

		leftTrackModel[245].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 589
		leftTrackModel[245].setRotationPoint(38.5F, 2.4F, 21F);
		leftTrackModel[245].rotateAngleX = -0.2443461F;
		leftTrackModel[245].rotateAngleZ = 1.22173048F;

		leftTrackModel[246].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 590
		leftTrackModel[246].setRotationPoint(38.5F, 2.4F, 21F);
		leftTrackModel[246].rotateAngleX = 0.2443461F;
		leftTrackModel[246].rotateAngleZ = -0.34906585F;

		leftTrackModel[247].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 591
		leftTrackModel[247].setRotationPoint(38.5F, 2.4F, 21F);
		leftTrackModel[247].rotateAngleX = -0.2443461F;
		leftTrackModel[247].rotateAngleZ = 0.43633231F;

		leftTrackModel[248].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 592
		leftTrackModel[248].setRotationPoint(38.5F, 2.4F, 21F);
		leftTrackModel[248].rotateAngleX = 0.2443461F;
		leftTrackModel[248].rotateAngleZ = 5.14872129F;

		leftTrackModel[249].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 593
		leftTrackModel[249].setRotationPoint(38.5F, 2.4F, 21F);
		leftTrackModel[249].rotateAngleX = -0.2443461F;
		leftTrackModel[249].rotateAngleZ = -0.34906585F;

		leftTrackModel[250].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 594
		leftTrackModel[250].setRotationPoint(38.5F, 2.4F, 21F);
		leftTrackModel[250].rotateAngleX = 0.2443461F;
		leftTrackModel[250].rotateAngleZ = 4.36332313F;

		leftTrackModel[251].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 595
		leftTrackModel[251].setRotationPoint(38.5F, 2.4F, 21F);
		leftTrackModel[251].rotateAngleX = -0.2443461F;
		leftTrackModel[251].rotateAngleZ = 5.14872129F;

		leftTrackModel[252].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 596
		leftTrackModel[252].setRotationPoint(38.5F, 2.4F, 21F);
		leftTrackModel[252].rotateAngleX = 0.2443461F;
		leftTrackModel[252].rotateAngleZ = 3.57792497F;

		leftTrackModel[253].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 597
		leftTrackModel[253].setRotationPoint(38.5F, 2.4F, 21F);
		leftTrackModel[253].rotateAngleX = -0.2443461F;
		leftTrackModel[253].rotateAngleZ = 4.36332313F;

		leftTrackModel[254].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 598
		leftTrackModel[254].setRotationPoint(38.5F, 2.4F, 21F);
		leftTrackModel[254].rotateAngleX = 0.2443461F;
		leftTrackModel[254].rotateAngleZ = 2.7925268F;

		leftTrackModel[255].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 599
		leftTrackModel[255].setRotationPoint(38.5F, 2.4F, 21F);
		leftTrackModel[255].rotateAngleX = -0.2443461F;
		leftTrackModel[255].rotateAngleZ = 3.57792497F;

		leftTrackModel[256].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 600
		leftTrackModel[256].setRotationPoint(38.5F, 2.4F, 21F);
		leftTrackModel[256].rotateAngleX = 0.2443461F;
		leftTrackModel[256].rotateAngleZ = 2.00712864F;

		leftTrackModel[257].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 601
		leftTrackModel[257].setRotationPoint(38.5F, 2.4F, 21F);
		leftTrackModel[257].rotateAngleX = -0.2443461F;
		leftTrackModel[257].rotateAngleZ = 2.7925268F;

		leftTrackModel[258].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 602
		leftTrackModel[258].setRotationPoint(52.5F, -3F, 19.6F);
		leftTrackModel[258].rotateAngleZ = -0.19198622F;

		leftTrackModel[259].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 603
		leftTrackModel[259].setRotationPoint(52.5F, -3F, 19.6F);
		leftTrackModel[259].rotateAngleZ = 0.45378561F;

		leftTrackModel[260].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 604
		leftTrackModel[260].setRotationPoint(52.5F, -3F, 19.6F);
		leftTrackModel[260].rotateAngleZ = 1.09955743F;

		leftTrackModel[261].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 605
		leftTrackModel[261].setRotationPoint(52.5F, -3F, 19.6F);
		leftTrackModel[261].rotateAngleZ = 1.74532925F;

		leftTrackModel[262].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 606
		leftTrackModel[262].setRotationPoint(52.5F, -3F, 19.6F);
		leftTrackModel[262].rotateAngleZ = 2.39110108F;

		leftTrackModel[263].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 607
		leftTrackModel[263].setRotationPoint(52.5F, -3F, 19.6F);
		leftTrackModel[263].rotateAngleZ = 3.0368729F;

		leftTrackModel[264].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 608
		leftTrackModel[264].setRotationPoint(52.5F, -3F, 19.6F);
		leftTrackModel[264].rotateAngleZ = 3.68264472F;

		leftTrackModel[265].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 609
		leftTrackModel[265].setRotationPoint(52.5F, -3F, 19.6F);
		leftTrackModel[265].rotateAngleZ = 4.32841654F;

		leftTrackModel[266].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 610
		leftTrackModel[266].setRotationPoint(52.5F, -3F, 19.6F);
		leftTrackModel[266].rotateAngleZ = 4.97418837F;

		leftTrackModel[267].addShapeBox(-1.5F, -6.15F, 0F, 3, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 611
		leftTrackModel[267].setRotationPoint(52.5F, -3F, 19.6F);
		leftTrackModel[267].rotateAngleZ = 5.53269373F;

		leftTrackModel[268].addShapeBox(-1F, -1F, -1F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 612
		leftTrackModel[268].setRotationPoint(52.5F, -3F, 17.2F);
		leftTrackModel[268].rotateAngleZ = -0.75049158F;

		leftTrackModel[269].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 613
		leftTrackModel[269].setRotationPoint(52.5F, -3F, 28.5F);
		leftTrackModel[269].rotateAngleX = -0.2443461F;
		leftTrackModel[269].rotateAngleY = -3.14159265F;
		leftTrackModel[269].rotateAngleZ = 1.1693706F;

		leftTrackModel[270].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 614
		leftTrackModel[270].setRotationPoint(52.5F, -3F, 28.5F);
		leftTrackModel[270].rotateAngleX = 0.2443461F;
		leftTrackModel[270].rotateAngleY = -3.14159265F;
		leftTrackModel[270].rotateAngleZ = 0.38397244F;

		leftTrackModel[271].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 615
		leftTrackModel[271].setRotationPoint(52.5F, -3F, 28.5F);
		leftTrackModel[271].rotateAngleX = 0.2443461F;
		leftTrackModel[271].rotateAngleY = -3.14159265F;
		leftTrackModel[271].rotateAngleZ = -0.40142573F;

		leftTrackModel[272].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 616
		leftTrackModel[272].setRotationPoint(52.5F, -3F, 28.5F);
		leftTrackModel[272].rotateAngleX = -0.2443461F;
		leftTrackModel[272].rotateAngleY = -3.14159265F;
		leftTrackModel[272].rotateAngleZ = 0.38397244F;

		leftTrackModel[273].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 617
		leftTrackModel[273].setRotationPoint(52.5F, -3F, 28.5F);
		leftTrackModel[273].rotateAngleX = 0.2443461F;
		leftTrackModel[273].rotateAngleY = -3.14159265F;
		leftTrackModel[273].rotateAngleZ = 5.09636142F;

		leftTrackModel[274].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 618
		leftTrackModel[274].setRotationPoint(52.5F, -3F, 28.5F);
		leftTrackModel[274].rotateAngleX = -0.2443461F;
		leftTrackModel[274].rotateAngleY = -3.14159265F;
		leftTrackModel[274].rotateAngleZ = -0.40142573F;

		leftTrackModel[275].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 619
		leftTrackModel[275].setRotationPoint(52.5F, -3F, 28.5F);
		leftTrackModel[275].rotateAngleX = 0.2443461F;
		leftTrackModel[275].rotateAngleY = -3.14159265F;
		leftTrackModel[275].rotateAngleZ = 4.31096325F;

		leftTrackModel[276].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 620
		leftTrackModel[276].setRotationPoint(52.5F, -3F, 28.5F);
		leftTrackModel[276].rotateAngleX = -0.2443461F;
		leftTrackModel[276].rotateAngleY = -3.14159265F;
		leftTrackModel[276].rotateAngleZ = 5.09636142F;

		leftTrackModel[277].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 621
		leftTrackModel[277].setRotationPoint(52.5F, -3F, 28.5F);
		leftTrackModel[277].rotateAngleX = -0.2443461F;
		leftTrackModel[277].rotateAngleY = -3.14159265F;
		leftTrackModel[277].rotateAngleZ = 4.31096325F;

		leftTrackModel[278].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 622
		leftTrackModel[278].setRotationPoint(52.5F, -3F, 28.5F);
		leftTrackModel[278].rotateAngleX = 0.2443461F;
		leftTrackModel[278].rotateAngleY = -3.14159265F;
		leftTrackModel[278].rotateAngleZ = 3.52556509F;

		leftTrackModel[279].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 623
		leftTrackModel[279].setRotationPoint(52.5F, -3F, 28.5F);
		leftTrackModel[279].rotateAngleX = -0.2443461F;
		leftTrackModel[279].rotateAngleY = -3.14159265F;
		leftTrackModel[279].rotateAngleZ = 3.52556509F;

		leftTrackModel[280].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 624
		leftTrackModel[280].setRotationPoint(52.5F, -3F, 28.5F);
		leftTrackModel[280].rotateAngleX = 0.2443461F;
		leftTrackModel[280].rotateAngleY = -3.14159265F;
		leftTrackModel[280].rotateAngleZ = 2.74016693F;

		leftTrackModel[281].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 625
		leftTrackModel[281].setRotationPoint(52.5F, -3F, 28.5F);
		leftTrackModel[281].rotateAngleX = 0.2443461F;
		leftTrackModel[281].rotateAngleY = -3.14159265F;
		leftTrackModel[281].rotateAngleZ = 1.95476876F;

		leftTrackModel[282].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 626
		leftTrackModel[282].setRotationPoint(52.5F, -3F, 28.5F);
		leftTrackModel[282].rotateAngleX = -0.2443461F;
		leftTrackModel[282].rotateAngleY = -3.14159265F;
		leftTrackModel[282].rotateAngleZ = 2.74016693F;

		leftTrackModel[283].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 627
		leftTrackModel[283].setRotationPoint(52.5F, -3F, 28.5F);
		leftTrackModel[283].rotateAngleX = 0.36651914F;
		leftTrackModel[283].rotateAngleY = -3.14159265F;
		leftTrackModel[283].rotateAngleZ = 1.1693706F;

		leftTrackModel[284].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 628
		leftTrackModel[284].setRotationPoint(52.5F, -3F, 28.5F);
		leftTrackModel[284].rotateAngleX = -0.2443461F;
		leftTrackModel[284].rotateAngleY = -3.14159265F;
		leftTrackModel[284].rotateAngleZ = 1.95476876F;

		leftTrackModel[285].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 629
		leftTrackModel[285].setRotationPoint(52.5F, -3F, 20F);
		leftTrackModel[285].rotateAngleX = 0.36651914F;
		leftTrackModel[285].rotateAngleZ = 1.22173048F;

		leftTrackModel[286].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 630
		leftTrackModel[286].setRotationPoint(52.5F, -3F, 20F);
		leftTrackModel[286].rotateAngleX = -0.2443461F;
		leftTrackModel[286].rotateAngleZ = 2.00712864F;

		leftTrackModel[287].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 631
		leftTrackModel[287].setRotationPoint(52.5F, -3F, 20F);
		leftTrackModel[287].rotateAngleX = 0.2443461F;
		leftTrackModel[287].rotateAngleZ = 0.43633231F;

		leftTrackModel[288].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 632
		leftTrackModel[288].setRotationPoint(52.5F, -3F, 20F);
		leftTrackModel[288].rotateAngleX = -0.2443461F;
		leftTrackModel[288].rotateAngleZ = 1.22173048F;

		leftTrackModel[289].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 633
		leftTrackModel[289].setRotationPoint(52.5F, -3F, 20F);
		leftTrackModel[289].rotateAngleX = 0.2443461F;
		leftTrackModel[289].rotateAngleZ = -0.34906585F;

		leftTrackModel[290].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 634
		leftTrackModel[290].setRotationPoint(52.5F, -3F, 20F);
		leftTrackModel[290].rotateAngleX = -0.2443461F;
		leftTrackModel[290].rotateAngleZ = 0.43633231F;

		leftTrackModel[291].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 635
		leftTrackModel[291].setRotationPoint(52.5F, -3F, 20F);
		leftTrackModel[291].rotateAngleX = 0.2443461F;
		leftTrackModel[291].rotateAngleZ = 5.14872129F;

		leftTrackModel[292].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 636
		leftTrackModel[292].setRotationPoint(52.5F, -3F, 20F);
		leftTrackModel[292].rotateAngleX = -0.2443461F;
		leftTrackModel[292].rotateAngleZ = -0.34906585F;

		leftTrackModel[293].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 637
		leftTrackModel[293].setRotationPoint(52.5F, -3F, 20F);
		leftTrackModel[293].rotateAngleX = 0.2443461F;
		leftTrackModel[293].rotateAngleZ = 4.36332313F;

		leftTrackModel[294].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 638
		leftTrackModel[294].setRotationPoint(52.5F, -3F, 20F);
		leftTrackModel[294].rotateAngleX = -0.2443461F;
		leftTrackModel[294].rotateAngleZ = 5.14872129F;

		leftTrackModel[295].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 639
		leftTrackModel[295].setRotationPoint(52.5F, -3F, 20F);
		leftTrackModel[295].rotateAngleX = 0.2443461F;
		leftTrackModel[295].rotateAngleZ = 3.57792497F;

		leftTrackModel[296].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 640
		leftTrackModel[296].setRotationPoint(52.5F, -3F, 20F);
		leftTrackModel[296].rotateAngleX = -0.2443461F;
		leftTrackModel[296].rotateAngleZ = 4.36332313F;

		leftTrackModel[297].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 641
		leftTrackModel[297].setRotationPoint(52.5F, -3F, 20F);
		leftTrackModel[297].rotateAngleX = 0.2443461F;
		leftTrackModel[297].rotateAngleZ = 2.7925268F;

		leftTrackModel[298].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 642
		leftTrackModel[298].setRotationPoint(52.5F, -3F, 20F);
		leftTrackModel[298].rotateAngleX = -0.2443461F;
		leftTrackModel[298].rotateAngleZ = 3.57792497F;

		leftTrackModel[299].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 643
		leftTrackModel[299].setRotationPoint(52.5F, -3F, 20F);
		leftTrackModel[299].rotateAngleX = 0.2443461F;
		leftTrackModel[299].rotateAngleZ = 2.00712864F;

		leftTrackModel[300].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 644
		leftTrackModel[300].setRotationPoint(52.5F, -3F, 20F);
		leftTrackModel[300].rotateAngleX = -0.2443461F;
		leftTrackModel[300].rotateAngleZ = 2.7925268F;

		leftTrackModel[301].addShapeBox(-2F, -6F, 0F, 4, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 688
		leftTrackModel[301].setRotationPoint(-49F, -3F, 17.6F);
		leftTrackModel[301].rotateAngleZ = -0.19198622F;

		leftTrackModel[302].addShapeBox(-2F, -6F, 0F, 4, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 689
		leftTrackModel[302].setRotationPoint(-49F, -3F, 17.6F);
		leftTrackModel[302].rotateAngleZ = 0.45378561F;

		leftTrackModel[303].addShapeBox(-2F, -6F, 0F, 4, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 690
		leftTrackModel[303].setRotationPoint(-49F, -3F, 17.6F);
		leftTrackModel[303].rotateAngleZ = 1.09955743F;

		leftTrackModel[304].addShapeBox(-2F, -6F, 0F, 4, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 691
		leftTrackModel[304].setRotationPoint(-49F, -3F, 17.6F);
		leftTrackModel[304].rotateAngleZ = 1.74532925F;

		leftTrackModel[305].addShapeBox(-2F, -6F, 0F, 4, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 692
		leftTrackModel[305].setRotationPoint(-49F, -3F, 17.6F);
		leftTrackModel[305].rotateAngleZ = 2.39110108F;

		leftTrackModel[306].addShapeBox(-2F, -6F, 0F, 4, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 693
		leftTrackModel[306].setRotationPoint(-49F, -3F, 17.6F);
		leftTrackModel[306].rotateAngleZ = 3.0368729F;

		leftTrackModel[307].addShapeBox(-2F, -6F, 0F, 4, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 694
		leftTrackModel[307].setRotationPoint(-49F, -3F, 17.6F);
		leftTrackModel[307].rotateAngleZ = 3.68264472F;

		leftTrackModel[308].addShapeBox(-2F, -6F, 0F, 4, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 695
		leftTrackModel[308].setRotationPoint(-49F, -3F, 17.6F);
		leftTrackModel[308].rotateAngleZ = 4.32841654F;

		leftTrackModel[309].addShapeBox(-2F, -6F, 0F, 4, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 696
		leftTrackModel[309].setRotationPoint(-49F, -3F, 17.6F);
		leftTrackModel[309].rotateAngleZ = 4.97418837F;

		leftTrackModel[310].addShapeBox(-1.5F, -6.15F, 0F, 3, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 697
		leftTrackModel[310].setRotationPoint(-49F, -3F, 17.6F);
		leftTrackModel[310].rotateAngleZ = 5.53269373F;

		leftTrackModel[311].addShapeBox(-1F, -1F, -1F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 698
		leftTrackModel[311].setRotationPoint(-49F, -3F, 19.2F);
		leftTrackModel[311].rotateAngleZ = -0.75049158F;

		leftTrackModel[312].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 699
		leftTrackModel[312].setRotationPoint(-49F, -3F, 29.5F);
		leftTrackModel[312].rotateAngleX = -0.2443461F;
		leftTrackModel[312].rotateAngleY = -3.14159265F;
		leftTrackModel[312].rotateAngleZ = 1.1693706F;

		leftTrackModel[313].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 700
		leftTrackModel[313].setRotationPoint(-49F, -3F, 29.5F);
		leftTrackModel[313].rotateAngleX = 0.2443461F;
		leftTrackModel[313].rotateAngleY = -3.14159265F;
		leftTrackModel[313].rotateAngleZ = 0.38397244F;

		leftTrackModel[314].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 701
		leftTrackModel[314].setRotationPoint(-49F, -3F, 29.5F);
		leftTrackModel[314].rotateAngleX = 0.2443461F;
		leftTrackModel[314].rotateAngleY = -3.14159265F;
		leftTrackModel[314].rotateAngleZ = -0.40142573F;

		leftTrackModel[315].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 702
		leftTrackModel[315].setRotationPoint(-49F, -3F, 29.5F);
		leftTrackModel[315].rotateAngleX = -0.2443461F;
		leftTrackModel[315].rotateAngleY = -3.14159265F;
		leftTrackModel[315].rotateAngleZ = 0.38397244F;

		leftTrackModel[316].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 703
		leftTrackModel[316].setRotationPoint(-49F, -3F, 29.5F);
		leftTrackModel[316].rotateAngleX = 0.2443461F;
		leftTrackModel[316].rotateAngleY = -3.14159265F;
		leftTrackModel[316].rotateAngleZ = 5.09636142F;

		leftTrackModel[317].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 704
		leftTrackModel[317].setRotationPoint(-49F, -3F, 29.5F);
		leftTrackModel[317].rotateAngleX = -0.2443461F;
		leftTrackModel[317].rotateAngleY = -3.14159265F;
		leftTrackModel[317].rotateAngleZ = -0.40142573F;

		leftTrackModel[318].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 705
		leftTrackModel[318].setRotationPoint(-49F, -3F, 29.5F);
		leftTrackModel[318].rotateAngleX = 0.2443461F;
		leftTrackModel[318].rotateAngleY = -3.14159265F;
		leftTrackModel[318].rotateAngleZ = 4.31096325F;

		leftTrackModel[319].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 706
		leftTrackModel[319].setRotationPoint(-49F, -3F, 29.5F);
		leftTrackModel[319].rotateAngleX = -0.2443461F;
		leftTrackModel[319].rotateAngleY = -3.14159265F;
		leftTrackModel[319].rotateAngleZ = 5.09636142F;

		leftTrackModel[320].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 707
		leftTrackModel[320].setRotationPoint(-49F, -3F, 29.5F);
		leftTrackModel[320].rotateAngleX = -0.2443461F;
		leftTrackModel[320].rotateAngleY = -3.14159265F;
		leftTrackModel[320].rotateAngleZ = 4.31096325F;

		leftTrackModel[321].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 708
		leftTrackModel[321].setRotationPoint(-49F, -3F, 29.5F);
		leftTrackModel[321].rotateAngleX = 0.2443461F;
		leftTrackModel[321].rotateAngleY = -3.14159265F;
		leftTrackModel[321].rotateAngleZ = 3.52556509F;

		leftTrackModel[322].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 709
		leftTrackModel[322].setRotationPoint(-49F, -3F, 29.5F);
		leftTrackModel[322].rotateAngleX = -0.2443461F;
		leftTrackModel[322].rotateAngleY = -3.14159265F;
		leftTrackModel[322].rotateAngleZ = 3.52556509F;

		leftTrackModel[323].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 710
		leftTrackModel[323].setRotationPoint(-49F, -3F, 29.5F);
		leftTrackModel[323].rotateAngleX = 0.2443461F;
		leftTrackModel[323].rotateAngleY = -3.14159265F;
		leftTrackModel[323].rotateAngleZ = 2.74016693F;

		leftTrackModel[324].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 711
		leftTrackModel[324].setRotationPoint(-49F, -3F, 29.5F);
		leftTrackModel[324].rotateAngleX = 0.2443461F;
		leftTrackModel[324].rotateAngleY = -3.14159265F;
		leftTrackModel[324].rotateAngleZ = 1.95476876F;

		leftTrackModel[325].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 712
		leftTrackModel[325].setRotationPoint(-49F, -3F, 29.5F);
		leftTrackModel[325].rotateAngleX = -0.2443461F;
		leftTrackModel[325].rotateAngleY = -3.14159265F;
		leftTrackModel[325].rotateAngleZ = 2.74016693F;

		leftTrackModel[326].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 713
		leftTrackModel[326].setRotationPoint(-49F, -3F, 29.5F);
		leftTrackModel[326].rotateAngleX = 0.36651914F;
		leftTrackModel[326].rotateAngleY = -3.14159265F;
		leftTrackModel[326].rotateAngleZ = 1.1693706F;

		leftTrackModel[327].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 714
		leftTrackModel[327].setRotationPoint(-49F, -3F, 29.5F);
		leftTrackModel[327].rotateAngleX = -0.2443461F;
		leftTrackModel[327].rotateAngleY = -3.14159265F;
		leftTrackModel[327].rotateAngleZ = 1.95476876F;

		leftTrackModel[328].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 715
		leftTrackModel[328].setRotationPoint(-49F, -3F, 18F);
		leftTrackModel[328].rotateAngleX = 0.36651914F;
		leftTrackModel[328].rotateAngleZ = 1.22173048F;

		leftTrackModel[329].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 716
		leftTrackModel[329].setRotationPoint(-49F, -3F, 18F);
		leftTrackModel[329].rotateAngleX = -0.2443461F;
		leftTrackModel[329].rotateAngleZ = 2.00712864F;

		leftTrackModel[330].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 717
		leftTrackModel[330].setRotationPoint(-49F, -3F, 18F);
		leftTrackModel[330].rotateAngleX = 0.2443461F;
		leftTrackModel[330].rotateAngleZ = 0.43633231F;

		leftTrackModel[331].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 718
		leftTrackModel[331].setRotationPoint(-49F, -3F, 18F);
		leftTrackModel[331].rotateAngleX = -0.2443461F;
		leftTrackModel[331].rotateAngleZ = 1.22173048F;

		leftTrackModel[332].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 719
		leftTrackModel[332].setRotationPoint(-49F, -3F, 18F);
		leftTrackModel[332].rotateAngleX = 0.2443461F;
		leftTrackModel[332].rotateAngleZ = -0.34906585F;

		leftTrackModel[333].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 720
		leftTrackModel[333].setRotationPoint(-49F, -3F, 18F);
		leftTrackModel[333].rotateAngleX = -0.2443461F;
		leftTrackModel[333].rotateAngleZ = 0.43633231F;

		leftTrackModel[334].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 721
		leftTrackModel[334].setRotationPoint(-49F, -3F, 18F);
		leftTrackModel[334].rotateAngleX = 0.2443461F;
		leftTrackModel[334].rotateAngleZ = 5.14872129F;

		leftTrackModel[335].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 722
		leftTrackModel[335].setRotationPoint(-49F, -3F, 18F);
		leftTrackModel[335].rotateAngleX = -0.2443461F;
		leftTrackModel[335].rotateAngleZ = -0.34906585F;

		leftTrackModel[336].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 723
		leftTrackModel[336].setRotationPoint(-49F, -3F, 18F);
		leftTrackModel[336].rotateAngleX = 0.2443461F;
		leftTrackModel[336].rotateAngleZ = 4.36332313F;

		leftTrackModel[337].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 724
		leftTrackModel[337].setRotationPoint(-49F, -3F, 18F);
		leftTrackModel[337].rotateAngleX = -0.2443461F;
		leftTrackModel[337].rotateAngleZ = 5.14872129F;

		leftTrackModel[338].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 725
		leftTrackModel[338].setRotationPoint(-49F, -3F, 18F);
		leftTrackModel[338].rotateAngleX = 0.2443461F;
		leftTrackModel[338].rotateAngleZ = 3.57792497F;

		leftTrackModel[339].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 726
		leftTrackModel[339].setRotationPoint(-49F, -3F, 18F);
		leftTrackModel[339].rotateAngleX = -0.2443461F;
		leftTrackModel[339].rotateAngleZ = 4.36332313F;

		leftTrackModel[340].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 727
		leftTrackModel[340].setRotationPoint(-49F, -3F, 18F);
		leftTrackModel[340].rotateAngleX = 0.2443461F;
		leftTrackModel[340].rotateAngleZ = 2.7925268F;

		leftTrackModel[341].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 728
		leftTrackModel[341].setRotationPoint(-49F, -3F, 18F);
		leftTrackModel[341].rotateAngleX = -0.2443461F;
		leftTrackModel[341].rotateAngleZ = 3.57792497F;

		leftTrackModel[342].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 729
		leftTrackModel[342].setRotationPoint(-49F, -3F, 18F);
		leftTrackModel[342].rotateAngleX = 0.2443461F;
		leftTrackModel[342].rotateAngleZ = 2.00712864F;

		leftTrackModel[343].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 730
		leftTrackModel[343].setRotationPoint(-49F, -3F, 18F);
		leftTrackModel[343].rotateAngleX = -0.2443461F;
		leftTrackModel[343].rotateAngleZ = 2.7925268F;

		leftTrackModel[344].addBox(-2F, -6F, 0F, 77, 1, 11, 0F); // Box 826
		leftTrackModel[344].setRotationPoint(38.5F, 3.4F, 18.6F);
		leftTrackModel[344].rotateAngleZ = 3.14159265F;

		leftTrackModel[345].addBox(0F, -1F, 0F, 18, 1, 11, 0F); // Box 827
		leftTrackModel[345].setRotationPoint(-35.5F, 8.4F, 18.6F);
		leftTrackModel[345].rotateAngleZ = 2.74016693F;

		leftTrackModel[346].addBox(-0.5F, -7F, 0F, 1, 1, 1, 0F); // Box 877
		leftTrackModel[346].setRotationPoint(-49F, -3.3F, 17.6F);

		leftTrackModel[347].addBox(-2F, -6F, 0F, 104, 1, 11, 0F); // Box 907
		leftTrackModel[347].setRotationPoint(52.5F, -15F, 18.6F);
		leftTrackModel[347].rotateAngleZ = 3.13722933F;

		leftTrackModel[348].addBox(-1F, -7F, 0F, 2, 1, 11, 0F); // Box 908
		leftTrackModel[348].setRotationPoint(-48.8F, -3.4F, 18.6F);
		leftTrackModel[348].rotateAngleZ = 1.32645023F;

		leftTrackModel[349].addBox(-1F, -7F, 0F, 2, 1, 11, 0F); // Box 909
		leftTrackModel[349].setRotationPoint(-48.8F, -3.4F, 18.6F);
		leftTrackModel[349].rotateAngleZ = 1.04719755F;

		leftTrackModel[350].addBox(-1F, -7F, 0F, 2, 1, 11, 0F); // Box 910
		leftTrackModel[350].setRotationPoint(-48.8F, -3.4F, 18.6F);
		leftTrackModel[350].rotateAngleZ = 0.76794487F;

		leftTrackModel[351].addBox(-1F, -7F, 0F, 2, 1, 11, 0F); // Box 911
		leftTrackModel[351].setRotationPoint(-48.8F, -3.4F, 18.6F);
		leftTrackModel[351].rotateAngleZ = 0.48869219F;

		leftTrackModel[352].addBox(-1F, -7F, 0F, 2, 1, 11, 0F); // Box 912
		leftTrackModel[352].setRotationPoint(-48.8F, -3.4F, 18.6F);
		leftTrackModel[352].rotateAngleZ = 0.27925268F;

		leftTrackModel[353].addBox(-1F, -7F, 0F, 2, 1, 11, 0F); // Box 913
		leftTrackModel[353].setRotationPoint(-48.8F, -3.4F, 18.6F);
		leftTrackModel[353].rotateAngleZ = 2.46091425F;

		leftTrackModel[354].addBox(-1F, -7F, 0F, 2, 1, 11, 0F); // Box 914
		leftTrackModel[354].setRotationPoint(-48.8F, -3.4F, 18.6F);
		leftTrackModel[354].rotateAngleZ = 2.74016693F;

		leftTrackModel[355].addBox(-1F, -7F, 0F, 2, 1, 11, 0F); // Box 915
		leftTrackModel[355].setRotationPoint(-48.8F, -3.4F, 18.6F);
		leftTrackModel[355].rotateAngleZ = 1.88495559F;

		leftTrackModel[356].addBox(-1F, -7F, 0F, 2, 1, 11, 0F); // Box 916
		leftTrackModel[356].setRotationPoint(-48.8F, -3.4F, 18.6F);
		leftTrackModel[356].rotateAngleZ = 1.60570291F;

		leftTrackModel[357].addBox(-1F, -7F, 0F, 2, 1, 11, 0F); // Box 917
		leftTrackModel[357].setRotationPoint(-48.8F, -3.4F, 18.6F);
		leftTrackModel[357].rotateAngleZ = 2.18166156F;

		leftTrackModel[358].addBox(-1F, 6F, 0F, 2, 1, 11, 0F); // Box 931
		leftTrackModel[358].setRotationPoint(52.5F, -3F, 18.6F);
		leftTrackModel[358].rotateAngleZ = 2.86233997F;

		leftTrackModel[359].addBox(-1F, 6F, 0F, 2, 1, 11, 0F); // Box 932
		leftTrackModel[359].setRotationPoint(52.5F, -3F, 18.6F);
		leftTrackModel[359].rotateAngleZ = 2.61799388F;

		leftTrackModel[360].addBox(-1F, 6F, 0F, 2, 1, 11, 0F); // Box 933
		leftTrackModel[360].setRotationPoint(52.5F, -3F, 18.6F);
		leftTrackModel[360].rotateAngleZ = 2.3387412F;

		leftTrackModel[361].addBox(-1F, 6F, 0F, 2, 1, 11, 0F); // Box 934
		leftTrackModel[361].setRotationPoint(52.5F, -3F, 18.6F);
		leftTrackModel[361].rotateAngleZ = 2.05948852F;

		leftTrackModel[362].addBox(-1F, 6F, 0F, 2, 1, 11, 0F); // Box 935
		leftTrackModel[362].setRotationPoint(52.5F, -3F, 18.6F);
		leftTrackModel[362].rotateAngleZ = 1.78023584F;

		leftTrackModel[363].addBox(-1F, 6F, 0F, 2, 1, 11, 0F); // Box 936
		leftTrackModel[363].setRotationPoint(52.5F, -3F, 18.6F);
		leftTrackModel[363].rotateAngleZ = 1.50098316F;

		leftTrackModel[364].addBox(-1F, 6F, 0F, 2, 1, 11, 0F); // Box 937
		leftTrackModel[364].setRotationPoint(52.5F, -3F, 18.6F);
		leftTrackModel[364].rotateAngleZ = 1.22173048F;

		leftTrackModel[365].addBox(-1F, 6F, 0F, 2, 1, 11, 0F); // Box 938
		leftTrackModel[365].setRotationPoint(52.5F, -3F, 18.6F);
		leftTrackModel[365].rotateAngleZ = 0.9424778F;

		leftTrackModel[366].addBox(-1F, 6F, 0F, 2, 1, 11, 0F); // Box 939
		leftTrackModel[366].setRotationPoint(52.5F, -3F, 18.6F);
		leftTrackModel[366].rotateAngleZ = 0.68067841F;

		leftTrackModel[367].addBox(-1F, 6F, 0F, 2, 1, 11, 0F); // Box 940
		leftTrackModel[367].setRotationPoint(52.5F, -3F, 18.6F);
		leftTrackModel[367].rotateAngleZ = 0.40142573F;

		leftTrackModel[368].addBox(-1F, 6F, 0F, 16, 1, 11, 0F); // Box 941
		leftTrackModel[368].setRotationPoint(38.5F, 2.4F, 18.6F);
		leftTrackModel[368].rotateAngleZ = 0.36651914F;

		leftTrackModel[369].addShapeBox(-1F, 6F, 0F, 2, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 942
		leftTrackModel[369].setRotationPoint(38.5F, 2.4F, 18.6F);
		leftTrackModel[369].rotateAngleZ = 0.19198622F;

		leftTrackModel[370].addShapeBox(-1F, 6F, 0F, 2, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 943
		leftTrackModel[370].setRotationPoint(38.5F, 2.4F, 18.6F);
		leftTrackModel[370].rotateAngleZ = 0.15707963F;

		leftTrackModel[371].addShapeBox(-1F, -1F, -1F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1012
		leftTrackModel[371].setRotationPoint(-28F, -2.6F, 17.2F);

		leftTrackModel[372].addShapeBox(-1F, -1F, -1F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1013
		leftTrackModel[372].setRotationPoint(-13.2F, -2.6F, 17.2F);

		leftTrackModel[373].addShapeBox(-1F, -1F, -1F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1014
		leftTrackModel[373].setRotationPoint(1.5F, -2.6F, 17.2F);
		leftTrackModel[373].rotateAngleZ = -0.75049158F;

		leftTrackModel[374].addShapeBox(-1F, -1F, -1F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1015
		leftTrackModel[374].setRotationPoint(30.5F, -2.6F, 17.2F);
		leftTrackModel[374].rotateAngleZ = -0.75049158F;

		leftTrackModel[375].addShapeBox(-1F, -1F, -1F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1016
		leftTrackModel[375].setRotationPoint(16F, -2.6F, 17.2F);
		leftTrackModel[375].rotateAngleZ = -0.75049158F;

		leftTrackModel[376].addShapeBox(-1F, -1F, -1F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1017
		leftTrackModel[376].setRotationPoint(44.5F, -2.6F, 17.2F);
		leftTrackModel[376].rotateAngleZ = -0.75049158F;

		leftTrackModel[377].addShapeBox(-1F, -1F, -1F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1018
		leftTrackModel[377].setRotationPoint(-28F, -2.6F, -18.8F);

		leftTrackModel[378].addShapeBox(-1F, -1F, -1F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1019
		leftTrackModel[378].setRotationPoint(-13.2F, -2.6F, -18.8F);

		leftTrackModel[379].addShapeBox(-1F, -1F, -1F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1020
		leftTrackModel[379].setRotationPoint(1.5F, -2.6F, -18.8F);
		leftTrackModel[379].rotateAngleZ = -0.75049158F;

		leftTrackModel[380].addShapeBox(-1F, -1F, -1F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1021
		leftTrackModel[380].setRotationPoint(30.5F, -2.6F, -18.8F);
		leftTrackModel[380].rotateAngleZ = -0.75049158F;

		leftTrackModel[381].addShapeBox(-1F, -1F, -1F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1022
		leftTrackModel[381].setRotationPoint(16F, -2.6F, -18.8F);
		leftTrackModel[381].rotateAngleZ = -0.75049158F;

		leftTrackModel[382].addShapeBox(-1F, -1F, -1F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1023
		leftTrackModel[382].setRotationPoint(44.5F, -2.6F, -18.8F);
		leftTrackModel[382].rotateAngleZ = -0.75049158F;

		leftTrackModel[383].addBox(-0.5F, -7F, 0F, 1, 1, 1, 0F); // Box 0
		leftTrackModel[383].setRotationPoint(-49F, -3.3F, 17.6F);
		leftTrackModel[383].rotateAngleZ = 1.04719755F;

		leftTrackModel[384].addBox(-0.5F, -7F, 0F, 1, 1, 1, 0F); // Box 1
		leftTrackModel[384].setRotationPoint(-49F, -3.3F, 17.6F);
		leftTrackModel[384].rotateAngleZ = 0.52359878F;

		leftTrackModel[385].addBox(-0.5F, -7F, 0F, 1, 1, 1, 0F); // Box 2
		leftTrackModel[385].setRotationPoint(-49F, -3.3F, 17.6F);
		leftTrackModel[385].rotateAngleZ = 1.57079633F;

		leftTrackModel[386].addBox(-0.5F, -7F, 0F, 1, 1, 1, 0F); // Box 3
		leftTrackModel[386].setRotationPoint(-49F, -3.3F, 17.6F);
		leftTrackModel[386].rotateAngleZ = 2.0943951F;

		leftTrackModel[387].addBox(-0.5F, -7F, 0F, 1, 1, 1, 0F); // Box 4
		leftTrackModel[387].setRotationPoint(-49F, -3.3F, 17.6F);
		leftTrackModel[387].rotateAngleZ = 2.61799388F;

		leftTrackModel[388].addBox(-0.5F, -7F, 0F, 1, 1, 1, 0F); // Box 5
		leftTrackModel[388].setRotationPoint(-49F, -3.3F, 17.6F);
		leftTrackModel[388].rotateAngleZ = 3.14159265F;

		leftTrackModel[389].addBox(-0.5F, -7F, 0F, 1, 1, 1, 0F); // Box 6
		leftTrackModel[389].setRotationPoint(-49F, -3.3F, 17.6F);
		leftTrackModel[389].rotateAngleZ = 4.1887902F;

		leftTrackModel[390].addBox(-0.5F, -7F, 0F, 1, 1, 1, 0F); // Box 7
		leftTrackModel[390].setRotationPoint(-49F, -3.3F, 17.6F);
		leftTrackModel[390].rotateAngleZ = 4.71238898F;

		leftTrackModel[391].addBox(-0.5F, -7F, 0F, 1, 1, 1, 0F); // Box 8
		leftTrackModel[391].setRotationPoint(-49F, -3.3F, 17.6F);
		leftTrackModel[391].rotateAngleZ = 5.23598776F;

		leftTrackModel[392].addBox(-0.5F, -7F, 0F, 1, 1, 1, 0F); // Box 9
		leftTrackModel[392].setRotationPoint(-49F, -3.3F, 17.6F);
		leftTrackModel[392].rotateAngleZ = 5.75958653F;

		leftTrackModel[393].addBox(-0.5F, -7F, 0F, 1, 1, 1, 0F); // Box 10
		leftTrackModel[393].setRotationPoint(-49F, -3.3F, 17.6F);
		leftTrackModel[393].rotateAngleZ = 3.66519143F;

		leftTrackModel[394].addBox(-0.5F, -7.1F, 0F, 1, 1, 1, 0F); // Box 11
		leftTrackModel[394].setRotationPoint(-49F, -3.3F, 28.7F);
		leftTrackModel[394].rotateAngleZ = 3.66519143F;

		leftTrackModel[395].addBox(-0.5F, -7.1F, 0F, 1, 1, 1, 0F); // Box 12
		leftTrackModel[395].setRotationPoint(-49F, -3.3F, 28.7F);
		leftTrackModel[395].rotateAngleZ = 4.1887902F;

		leftTrackModel[396].addBox(-0.5F, -7.1F, 0F, 1, 1, 1, 0F); // Box 13
		leftTrackModel[396].setRotationPoint(-49F, -3.3F, 28.7F);
		leftTrackModel[396].rotateAngleZ = 3.14159265F;

		leftTrackModel[397].addBox(-0.5F, -7.1F, 0F, 1, 1, 1, 0F); // Box 14
		leftTrackModel[397].setRotationPoint(-49F, -3.3F, 28.7F);
		leftTrackModel[397].rotateAngleZ = 4.71238898F;

		leftTrackModel[398].addBox(-0.5F, -7.1F, 0F, 1, 1, 1, 0F); // Box 15
		leftTrackModel[398].setRotationPoint(-49F, -3.3F, 28.7F);
		leftTrackModel[398].rotateAngleZ = 5.23598776F;

		leftTrackModel[399].addBox(-0.5F, -7.1F, 0F, 1, 1, 1, 0F); // Box 16
		leftTrackModel[399].setRotationPoint(-49F, -3.3F, 28.7F);
		leftTrackModel[399].rotateAngleZ = 5.75958653F;

		leftTrackModel[400].addBox(-0.5F, -7.1F, 0F, 1, 1, 1, 0F); // Box 17
		leftTrackModel[400].setRotationPoint(-49F, -3.3F, 28.7F);

		leftTrackModel[401].addBox(-0.5F, -7.1F, 0F, 1, 1, 1, 0F); // Box 18
		leftTrackModel[401].setRotationPoint(-49F, -3.3F, 28.7F);
		leftTrackModel[401].rotateAngleZ = 0.52359878F;

		leftTrackModel[402].addBox(-0.5F, -7.1F, 0F, 1, 1, 1, 0F); // Box 19
		leftTrackModel[402].setRotationPoint(-49F, -3.3F, 28.7F);
		leftTrackModel[402].rotateAngleZ = 1.04719755F;

		leftTrackModel[403].addBox(-0.5F, -7.1F, 0F, 1, 1, 1, 0F); // Box 20
		leftTrackModel[403].setRotationPoint(-49F, -3.3F, 28.7F);
		leftTrackModel[403].rotateAngleZ = 1.57079633F;

		leftTrackModel[404].addBox(-0.5F, -7.1F, 0F, 1, 1, 1, 0F); // Box 21
		leftTrackModel[404].setRotationPoint(-49F, -3.3F, 28.7F);
		leftTrackModel[404].rotateAngleZ = 2.0943951F;

		leftTrackModel[405].addBox(-0.5F, -7.1F, 0F, 1, 1, 1, 0F); // Box 22
		leftTrackModel[405].setRotationPoint(-49F, -3.3F, 28.7F);
		leftTrackModel[405].rotateAngleZ = 2.61799388F;
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 0
		rightTrackModel[1] = new ModelRendererTurbo(this, 609, 9, textureX, textureY); // Box 1
		rightTrackModel[2] = new ModelRendererTurbo(this, 665, 9, textureX, textureY); // Box 2
		rightTrackModel[3] = new ModelRendererTurbo(this, 721, 9, textureX, textureY); // Box 3
		rightTrackModel[4] = new ModelRendererTurbo(this, 1009, 9, textureX, textureY); // Box 4
		rightTrackModel[5] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 5
		rightTrackModel[6] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 6
		rightTrackModel[7] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 7
		rightTrackModel[8] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 8
		rightTrackModel[9] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 9
		rightTrackModel[10] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 10
		rightTrackModel[11] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 11
		rightTrackModel[12] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 12
		rightTrackModel[13] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 13
		rightTrackModel[14] = new ModelRendererTurbo(this, 649, 25, textureX, textureY); // Box 14
		rightTrackModel[15] = new ModelRendererTurbo(this, 665, 25, textureX, textureY); // Box 15
		rightTrackModel[16] = new ModelRendererTurbo(this, 713, 25, textureX, textureY); // Box 16
		rightTrackModel[17] = new ModelRendererTurbo(this, 977, 25, textureX, textureY); // Box 17
		rightTrackModel[18] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 18
		rightTrackModel[19] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 19
		rightTrackModel[20] = new ModelRendererTurbo(this, 761, 33, textureX, textureY); // Box 20
		rightTrackModel[21] = new ModelRendererTurbo(this, 793, 33, textureX, textureY); // Box 21
		rightTrackModel[22] = new ModelRendererTurbo(this, 825, 33, textureX, textureY); // Box 22
		rightTrackModel[23] = new ModelRendererTurbo(this, 857, 33, textureX, textureY); // Box 23
		rightTrackModel[24] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 24
		rightTrackModel[25] = new ModelRendererTurbo(this, 889, 33, textureX, textureY); // Box 25
		rightTrackModel[26] = new ModelRendererTurbo(this, 761, 25, textureX, textureY); // Box 26
		rightTrackModel[27] = new ModelRendererTurbo(this, 937, 25, textureX, textureY); // Box 27
		rightTrackModel[28] = new ModelRendererTurbo(this, 969, 25, textureX, textureY); // Box 28
		rightTrackModel[29] = new ModelRendererTurbo(this, 1001, 25, textureX, textureY); // Box 29
		rightTrackModel[30] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 30
		rightTrackModel[31] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 31
		rightTrackModel[32] = new ModelRendererTurbo(this, 785, 33, textureX, textureY); // Box 32
		rightTrackModel[33] = new ModelRendererTurbo(this, 817, 33, textureX, textureY); // Box 33
		rightTrackModel[34] = new ModelRendererTurbo(this, 849, 33, textureX, textureY); // Box 34
		rightTrackModel[35] = new ModelRendererTurbo(this, 881, 33, textureX, textureY); // Box 35
		rightTrackModel[36] = new ModelRendererTurbo(this, 1009, 33, textureX, textureY); // Box 36
		rightTrackModel[37] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 37
		rightTrackModel[38] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 38
		rightTrackModel[39] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 39
		rightTrackModel[40] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 40
		rightTrackModel[41] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 41
		rightTrackModel[42] = new ModelRendererTurbo(this, 681, 25, textureX, textureY); // Box 42
		rightTrackModel[43] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 43
		rightTrackModel[44] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 44
		rightTrackModel[45] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 45
		rightTrackModel[46] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 46
		rightTrackModel[47] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 47
		rightTrackModel[48] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 48
		rightTrackModel[49] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 49
		rightTrackModel[50] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 50
		rightTrackModel[51] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 51
		rightTrackModel[52] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 52
		rightTrackModel[53] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 53
		rightTrackModel[54] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 54
		rightTrackModel[55] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 55
		rightTrackModel[56] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 56
		rightTrackModel[57] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 57
		rightTrackModel[58] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 58
		rightTrackModel[59] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 59
		rightTrackModel[60] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 60
		rightTrackModel[61] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 61
		rightTrackModel[62] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 62
		rightTrackModel[63] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 63
		rightTrackModel[64] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 64
		rightTrackModel[65] = new ModelRendererTurbo(this, 521, 41, textureX, textureY); // Box 65
		rightTrackModel[66] = new ModelRendererTurbo(this, 537, 41, textureX, textureY); // Box 66
		rightTrackModel[67] = new ModelRendererTurbo(this, 553, 41, textureX, textureY); // Box 67
		rightTrackModel[68] = new ModelRendererTurbo(this, 569, 41, textureX, textureY); // Box 68
		rightTrackModel[69] = new ModelRendererTurbo(this, 585, 41, textureX, textureY); // Box 69
		rightTrackModel[70] = new ModelRendererTurbo(this, 601, 41, textureX, textureY); // Box 70
		rightTrackModel[71] = new ModelRendererTurbo(this, 617, 41, textureX, textureY); // Box 71
		rightTrackModel[72] = new ModelRendererTurbo(this, 633, 41, textureX, textureY); // Box 72
		rightTrackModel[73] = new ModelRendererTurbo(this, 649, 41, textureX, textureY); // Box 73
		rightTrackModel[74] = new ModelRendererTurbo(this, 665, 41, textureX, textureY); // Box 74
		rightTrackModel[75] = new ModelRendererTurbo(this, 681, 41, textureX, textureY); // Box 75
		rightTrackModel[76] = new ModelRendererTurbo(this, 697, 41, textureX, textureY); // Box 76
		rightTrackModel[77] = new ModelRendererTurbo(this, 713, 41, textureX, textureY); // Box 77
		rightTrackModel[78] = new ModelRendererTurbo(this, 729, 41, textureX, textureY); // Box 78
		rightTrackModel[79] = new ModelRendererTurbo(this, 745, 41, textureX, textureY); // Box 79
		rightTrackModel[80] = new ModelRendererTurbo(this, 921, 41, textureX, textureY); // Box 80
		rightTrackModel[81] = new ModelRendererTurbo(this, 937, 41, textureX, textureY); // Box 81
		rightTrackModel[82] = new ModelRendererTurbo(this, 953, 41, textureX, textureY); // Box 82
		rightTrackModel[83] = new ModelRendererTurbo(this, 969, 41, textureX, textureY); // Box 83
		rightTrackModel[84] = new ModelRendererTurbo(this, 985, 41, textureX, textureY); // Box 84
		rightTrackModel[85] = new ModelRendererTurbo(this, 1001, 41, textureX, textureY); // Box 85
		rightTrackModel[86] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 86
		rightTrackModel[87] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 87
		rightTrackModel[88] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 88
		rightTrackModel[89] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 89
		rightTrackModel[90] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 90
		rightTrackModel[91] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 91
		rightTrackModel[92] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 92
		rightTrackModel[93] = new ModelRendererTurbo(this, 537, 49, textureX, textureY); // Box 93
		rightTrackModel[94] = new ModelRendererTurbo(this, 569, 49, textureX, textureY); // Box 94
		rightTrackModel[95] = new ModelRendererTurbo(this, 601, 49, textureX, textureY); // Box 95
		rightTrackModel[96] = new ModelRendererTurbo(this, 905, 41, textureX, textureY); // Box 96
		rightTrackModel[97] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 97
		rightTrackModel[98] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 98
		rightTrackModel[99] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 99
		rightTrackModel[100] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 100
		rightTrackModel[101] = new ModelRendererTurbo(this, 529, 49, textureX, textureY); // Box 101
		rightTrackModel[102] = new ModelRendererTurbo(this, 561, 49, textureX, textureY); // Box 102
		rightTrackModel[103] = new ModelRendererTurbo(this, 593, 49, textureX, textureY); // Box 103
		rightTrackModel[104] = new ModelRendererTurbo(this, 625, 49, textureX, textureY); // Box 104
		rightTrackModel[105] = new ModelRendererTurbo(this, 641, 49, textureX, textureY); // Box 105
		rightTrackModel[106] = new ModelRendererTurbo(this, 657, 49, textureX, textureY); // Box 106
		rightTrackModel[107] = new ModelRendererTurbo(this, 673, 49, textureX, textureY); // Box 107
		rightTrackModel[108] = new ModelRendererTurbo(this, 689, 49, textureX, textureY); // Box 108
		rightTrackModel[109] = new ModelRendererTurbo(this, 705, 49, textureX, textureY); // Box 109
		rightTrackModel[110] = new ModelRendererTurbo(this, 721, 49, textureX, textureY); // Box 110
		rightTrackModel[111] = new ModelRendererTurbo(this, 737, 49, textureX, textureY); // Box 111
		rightTrackModel[112] = new ModelRendererTurbo(this, 753, 49, textureX, textureY); // Box 112
		rightTrackModel[113] = new ModelRendererTurbo(this, 769, 49, textureX, textureY); // Box 113
		rightTrackModel[114] = new ModelRendererTurbo(this, 785, 49, textureX, textureY); // Box 114
		rightTrackModel[115] = new ModelRendererTurbo(this, 801, 49, textureX, textureY); // Box 115
		rightTrackModel[116] = new ModelRendererTurbo(this, 817, 49, textureX, textureY); // Box 116
		rightTrackModel[117] = new ModelRendererTurbo(this, 833, 49, textureX, textureY); // Box 117
		rightTrackModel[118] = new ModelRendererTurbo(this, 849, 49, textureX, textureY); // Box 118
		rightTrackModel[119] = new ModelRendererTurbo(this, 865, 49, textureX, textureY); // Box 119
		rightTrackModel[120] = new ModelRendererTurbo(this, 881, 49, textureX, textureY); // Box 120
		rightTrackModel[121] = new ModelRendererTurbo(this, 937, 49, textureX, textureY); // Box 121
		rightTrackModel[122] = new ModelRendererTurbo(this, 953, 49, textureX, textureY); // Box 122
		rightTrackModel[123] = new ModelRendererTurbo(this, 969, 49, textureX, textureY); // Box 123
		rightTrackModel[124] = new ModelRendererTurbo(this, 985, 49, textureX, textureY); // Box 124
		rightTrackModel[125] = new ModelRendererTurbo(this, 1001, 49, textureX, textureY); // Box 125
		rightTrackModel[126] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 126
		rightTrackModel[127] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 127
		rightTrackModel[128] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 128
		rightTrackModel[129] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 129
		rightTrackModel[130] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 130
		rightTrackModel[131] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 131
		rightTrackModel[132] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 132
		rightTrackModel[133] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 133
		rightTrackModel[134] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 134
		rightTrackModel[135] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 135
		rightTrackModel[136] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 136
		rightTrackModel[137] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 137
		rightTrackModel[138] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 138
		rightTrackModel[139] = new ModelRendererTurbo(this, 889, 49, textureX, textureY); // Box 139
		rightTrackModel[140] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 140
		rightTrackModel[141] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 141
		rightTrackModel[142] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 142
		rightTrackModel[143] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 143
		rightTrackModel[144] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 144
		rightTrackModel[145] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 145
		rightTrackModel[146] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 146
		rightTrackModel[147] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 147
		rightTrackModel[148] = new ModelRendererTurbo(this, 633, 57, textureX, textureY); // Box 148
		rightTrackModel[149] = new ModelRendererTurbo(this, 649, 57, textureX, textureY); // Box 149
		rightTrackModel[150] = new ModelRendererTurbo(this, 665, 57, textureX, textureY); // Box 150
		rightTrackModel[151] = new ModelRendererTurbo(this, 681, 57, textureX, textureY); // Box 151
		rightTrackModel[152] = new ModelRendererTurbo(this, 697, 57, textureX, textureY); // Box 152
		rightTrackModel[153] = new ModelRendererTurbo(this, 713, 57, textureX, textureY); // Box 153
		rightTrackModel[154] = new ModelRendererTurbo(this, 729, 57, textureX, textureY); // Box 154
		rightTrackModel[155] = new ModelRendererTurbo(this, 745, 57, textureX, textureY); // Box 155
		rightTrackModel[156] = new ModelRendererTurbo(this, 761, 57, textureX, textureY); // Box 156
		rightTrackModel[157] = new ModelRendererTurbo(this, 777, 57, textureX, textureY); // Box 157
		rightTrackModel[158] = new ModelRendererTurbo(this, 793, 57, textureX, textureY); // Box 158
		rightTrackModel[159] = new ModelRendererTurbo(this, 809, 57, textureX, textureY); // Box 159
		rightTrackModel[160] = new ModelRendererTurbo(this, 825, 57, textureX, textureY); // Box 160
		rightTrackModel[161] = new ModelRendererTurbo(this, 841, 57, textureX, textureY); // Box 161
		rightTrackModel[162] = new ModelRendererTurbo(this, 857, 57, textureX, textureY); // Box 162
		rightTrackModel[163] = new ModelRendererTurbo(this, 873, 57, textureX, textureY); // Box 163
		rightTrackModel[164] = new ModelRendererTurbo(this, 921, 57, textureX, textureY); // Box 164
		rightTrackModel[165] = new ModelRendererTurbo(this, 937, 57, textureX, textureY); // Box 165
		rightTrackModel[166] = new ModelRendererTurbo(this, 953, 57, textureX, textureY); // Box 166
		rightTrackModel[167] = new ModelRendererTurbo(this, 969, 57, textureX, textureY); // Box 167
		rightTrackModel[168] = new ModelRendererTurbo(this, 985, 57, textureX, textureY); // Box 168
		rightTrackModel[169] = new ModelRendererTurbo(this, 1001, 57, textureX, textureY); // Box 169
		rightTrackModel[170] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 170
		rightTrackModel[171] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 171
		rightTrackModel[172] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 172
		rightTrackModel[173] = new ModelRendererTurbo(this, 905, 57, textureX, textureY); // Box 182
		rightTrackModel[174] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 215
		rightTrackModel[175] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 216
		rightTrackModel[176] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 217
		rightTrackModel[177] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 218
		rightTrackModel[178] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 219
		rightTrackModel[179] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 220
		rightTrackModel[180] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 221
		rightTrackModel[181] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 222
		rightTrackModel[182] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 223
		rightTrackModel[183] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 224
		rightTrackModel[184] = new ModelRendererTurbo(this, 889, 65, textureX, textureY); // Box 225
		rightTrackModel[185] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 226
		rightTrackModel[186] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 227
		rightTrackModel[187] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 228
		rightTrackModel[188] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 229
		rightTrackModel[189] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Box 230
		rightTrackModel[190] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 231
		rightTrackModel[191] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 232
		rightTrackModel[192] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 233
		rightTrackModel[193] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Box 234
		rightTrackModel[194] = new ModelRendererTurbo(this, 617, 73, textureX, textureY); // Box 235
		rightTrackModel[195] = new ModelRendererTurbo(this, 633, 73, textureX, textureY); // Box 236
		rightTrackModel[196] = new ModelRendererTurbo(this, 649, 73, textureX, textureY); // Box 237
		rightTrackModel[197] = new ModelRendererTurbo(this, 665, 73, textureX, textureY); // Box 238
		rightTrackModel[198] = new ModelRendererTurbo(this, 681, 73, textureX, textureY); // Box 239
		rightTrackModel[199] = new ModelRendererTurbo(this, 697, 73, textureX, textureY); // Box 240
		rightTrackModel[200] = new ModelRendererTurbo(this, 713, 73, textureX, textureY); // Box 241
		rightTrackModel[201] = new ModelRendererTurbo(this, 729, 73, textureX, textureY); // Box 242
		rightTrackModel[202] = new ModelRendererTurbo(this, 745, 73, textureX, textureY); // Box 243
		rightTrackModel[203] = new ModelRendererTurbo(this, 761, 73, textureX, textureY); // Box 244
		rightTrackModel[204] = new ModelRendererTurbo(this, 777, 73, textureX, textureY); // Box 245
		rightTrackModel[205] = new ModelRendererTurbo(this, 793, 73, textureX, textureY); // Box 246
		rightTrackModel[206] = new ModelRendererTurbo(this, 809, 73, textureX, textureY); // Box 247
		rightTrackModel[207] = new ModelRendererTurbo(this, 825, 73, textureX, textureY); // Box 248
		rightTrackModel[208] = new ModelRendererTurbo(this, 841, 73, textureX, textureY); // Box 249
		rightTrackModel[209] = new ModelRendererTurbo(this, 857, 73, textureX, textureY); // Box 250
		rightTrackModel[210] = new ModelRendererTurbo(this, 873, 73, textureX, textureY); // Box 251
		rightTrackModel[211] = new ModelRendererTurbo(this, 921, 73, textureX, textureY); // Box 252
		rightTrackModel[212] = new ModelRendererTurbo(this, 937, 73, textureX, textureY); // Box 253
		rightTrackModel[213] = new ModelRendererTurbo(this, 953, 73, textureX, textureY); // Box 254
		rightTrackModel[214] = new ModelRendererTurbo(this, 969, 73, textureX, textureY); // Box 255
		rightTrackModel[215] = new ModelRendererTurbo(this, 985, 73, textureX, textureY); // Box 256
		rightTrackModel[216] = new ModelRendererTurbo(this, 1001, 73, textureX, textureY); // Box 257
		rightTrackModel[217] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 258
		rightTrackModel[218] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 259
		rightTrackModel[219] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 260
		rightTrackModel[220] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 261
		rightTrackModel[221] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 262
		rightTrackModel[222] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 263
		rightTrackModel[223] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 264
		rightTrackModel[224] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 265
		rightTrackModel[225] = new ModelRendererTurbo(this, 529, 81, textureX, textureY); // Box 266
		rightTrackModel[226] = new ModelRendererTurbo(this, 569, 81, textureX, textureY); // Box 267
		rightTrackModel[227] = new ModelRendererTurbo(this, 609, 81, textureX, textureY); // Box 268
		rightTrackModel[228] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 269
		rightTrackModel[229] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 270
		rightTrackModel[230] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 271
		rightTrackModel[231] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 272
		rightTrackModel[232] = new ModelRendererTurbo(this, 513, 81, textureX, textureY); // Box 273
		rightTrackModel[233] = new ModelRendererTurbo(this, 553, 81, textureX, textureY); // Box 274
		rightTrackModel[234] = new ModelRendererTurbo(this, 593, 81, textureX, textureY); // Box 275
		rightTrackModel[235] = new ModelRendererTurbo(this, 633, 81, textureX, textureY); // Box 276
		rightTrackModel[236] = new ModelRendererTurbo(this, 649, 81, textureX, textureY); // Box 277
		rightTrackModel[237] = new ModelRendererTurbo(this, 665, 81, textureX, textureY); // Box 278
		rightTrackModel[238] = new ModelRendererTurbo(this, 681, 81, textureX, textureY); // Box 279
		rightTrackModel[239] = new ModelRendererTurbo(this, 697, 81, textureX, textureY); // Box 280
		rightTrackModel[240] = new ModelRendererTurbo(this, 713, 81, textureX, textureY); // Box 281
		rightTrackModel[241] = new ModelRendererTurbo(this, 729, 81, textureX, textureY); // Box 282
		rightTrackModel[242] = new ModelRendererTurbo(this, 745, 81, textureX, textureY); // Box 283
		rightTrackModel[243] = new ModelRendererTurbo(this, 761, 81, textureX, textureY); // Box 284
		rightTrackModel[244] = new ModelRendererTurbo(this, 777, 81, textureX, textureY); // Box 285
		rightTrackModel[245] = new ModelRendererTurbo(this, 793, 81, textureX, textureY); // Box 286
		rightTrackModel[246] = new ModelRendererTurbo(this, 809, 81, textureX, textureY); // Box 287
		rightTrackModel[247] = new ModelRendererTurbo(this, 825, 81, textureX, textureY); // Box 288
		rightTrackModel[248] = new ModelRendererTurbo(this, 841, 81, textureX, textureY); // Box 289
		rightTrackModel[249] = new ModelRendererTurbo(this, 857, 81, textureX, textureY); // Box 290
		rightTrackModel[250] = new ModelRendererTurbo(this, 873, 81, textureX, textureY); // Box 291
		rightTrackModel[251] = new ModelRendererTurbo(this, 889, 81, textureX, textureY); // Box 292
		rightTrackModel[252] = new ModelRendererTurbo(this, 905, 81, textureX, textureY); // Box 293
		rightTrackModel[253] = new ModelRendererTurbo(this, 921, 81, textureX, textureY); // Box 294
		rightTrackModel[254] = new ModelRendererTurbo(this, 937, 81, textureX, textureY); // Box 295
		rightTrackModel[255] = new ModelRendererTurbo(this, 953, 81, textureX, textureY); // Box 296
		rightTrackModel[256] = new ModelRendererTurbo(this, 969, 81, textureX, textureY); // Box 297
		rightTrackModel[257] = new ModelRendererTurbo(this, 985, 81, textureX, textureY); // Box 298
		rightTrackModel[258] = new ModelRendererTurbo(this, 1001, 81, textureX, textureY); // Box 299
		rightTrackModel[259] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 300
		rightTrackModel[260] = new ModelRendererTurbo(this, 881, 137, textureX, textureY); // Box 645
		rightTrackModel[261] = new ModelRendererTurbo(this, 913, 137, textureX, textureY); // Box 646
		rightTrackModel[262] = new ModelRendererTurbo(this, 945, 137, textureX, textureY); // Box 647
		rightTrackModel[263] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 648
		rightTrackModel[264] = new ModelRendererTurbo(this, 33, 145, textureX, textureY); // Box 649
		rightTrackModel[265] = new ModelRendererTurbo(this, 65, 145, textureX, textureY); // Box 650
		rightTrackModel[266] = new ModelRendererTurbo(this, 97, 145, textureX, textureY); // Box 651
		rightTrackModel[267] = new ModelRendererTurbo(this, 273, 145, textureX, textureY); // Box 652
		rightTrackModel[268] = new ModelRendererTurbo(this, 305, 145, textureX, textureY); // Box 653
		rightTrackModel[269] = new ModelRendererTurbo(this, 345, 137, textureX, textureY); // Box 654
		rightTrackModel[270] = new ModelRendererTurbo(this, 905, 137, textureX, textureY); // Box 655
		rightTrackModel[271] = new ModelRendererTurbo(this, 937, 137, textureX, textureY); // Box 656
		rightTrackModel[272] = new ModelRendererTurbo(this, 969, 137, textureX, textureY); // Box 657
		rightTrackModel[273] = new ModelRendererTurbo(this, 25, 145, textureX, textureY); // Box 658
		rightTrackModel[274] = new ModelRendererTurbo(this, 57, 145, textureX, textureY); // Box 659
		rightTrackModel[275] = new ModelRendererTurbo(this, 89, 145, textureX, textureY); // Box 660
		rightTrackModel[276] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Box 661
		rightTrackModel[277] = new ModelRendererTurbo(this, 329, 145, textureX, textureY); // Box 662
		rightTrackModel[278] = new ModelRendererTurbo(this, 377, 145, textureX, textureY); // Box 663
		rightTrackModel[279] = new ModelRendererTurbo(this, 393, 145, textureX, textureY); // Box 664
		rightTrackModel[280] = new ModelRendererTurbo(this, 409, 145, textureX, textureY); // Box 665
		rightTrackModel[281] = new ModelRendererTurbo(this, 425, 145, textureX, textureY); // Box 666
		rightTrackModel[282] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Box 667
		rightTrackModel[283] = new ModelRendererTurbo(this, 457, 145, textureX, textureY); // Box 668
		rightTrackModel[284] = new ModelRendererTurbo(this, 473, 145, textureX, textureY); // Box 669
		rightTrackModel[285] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Box 670
		rightTrackModel[286] = new ModelRendererTurbo(this, 505, 145, textureX, textureY); // Box 671
		rightTrackModel[287] = new ModelRendererTurbo(this, 521, 145, textureX, textureY); // Box 672
		rightTrackModel[288] = new ModelRendererTurbo(this, 537, 145, textureX, textureY); // Box 673
		rightTrackModel[289] = new ModelRendererTurbo(this, 553, 145, textureX, textureY); // Box 674
		rightTrackModel[290] = new ModelRendererTurbo(this, 569, 145, textureX, textureY); // Box 675
		rightTrackModel[291] = new ModelRendererTurbo(this, 585, 145, textureX, textureY); // Box 676
		rightTrackModel[292] = new ModelRendererTurbo(this, 601, 145, textureX, textureY); // Box 677
		rightTrackModel[293] = new ModelRendererTurbo(this, 617, 145, textureX, textureY); // Box 678
		rightTrackModel[294] = new ModelRendererTurbo(this, 633, 145, textureX, textureY); // Box 679
		rightTrackModel[295] = new ModelRendererTurbo(this, 649, 145, textureX, textureY); // Box 680
		rightTrackModel[296] = new ModelRendererTurbo(this, 665, 145, textureX, textureY); // Box 681
		rightTrackModel[297] = new ModelRendererTurbo(this, 681, 145, textureX, textureY); // Box 682
		rightTrackModel[298] = new ModelRendererTurbo(this, 697, 145, textureX, textureY); // Box 683
		rightTrackModel[299] = new ModelRendererTurbo(this, 713, 145, textureX, textureY); // Box 684
		rightTrackModel[300] = new ModelRendererTurbo(this, 729, 145, textureX, textureY); // Box 685
		rightTrackModel[301] = new ModelRendererTurbo(this, 745, 145, textureX, textureY); // Box 686
		rightTrackModel[302] = new ModelRendererTurbo(this, 761, 145, textureX, textureY); // Box 687
		rightTrackModel[303] = new ModelRendererTurbo(this, 41, 169, textureX, textureY); // Box 825
		rightTrackModel[304] = new ModelRendererTurbo(this, 817, 161, textureX, textureY); // Box 828
		rightTrackModel[305] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 829
		rightTrackModel[306] = new ModelRendererTurbo(this, 385, 177, textureX, textureY); // Box 894
		rightTrackModel[307] = new ModelRendererTurbo(this, 561, 161, textureX, textureY); // Box 896
		rightTrackModel[308] = new ModelRendererTurbo(this, 921, 161, textureX, textureY); // Box 897
		rightTrackModel[309] = new ModelRendererTurbo(this, 953, 161, textureX, textureY); // Box 898
		rightTrackModel[310] = new ModelRendererTurbo(this, 985, 161, textureX, textureY); // Box 899
		rightTrackModel[311] = new ModelRendererTurbo(this, 801, 169, textureX, textureY); // Box 900
		rightTrackModel[312] = new ModelRendererTurbo(this, 865, 169, textureX, textureY); // Box 901
		rightTrackModel[313] = new ModelRendererTurbo(this, 897, 169, textureX, textureY); // Box 902
		rightTrackModel[314] = new ModelRendererTurbo(this, 937, 169, textureX, textureY); // Box 903
		rightTrackModel[315] = new ModelRendererTurbo(this, 969, 169, textureX, textureY); // Box 904
		rightTrackModel[316] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 905
		rightTrackModel[317] = new ModelRendererTurbo(this, 617, 177, textureX, textureY); // Box 906
		rightTrackModel[318] = new ModelRendererTurbo(this, 985, 177, textureX, textureY); // Box 918
		rightTrackModel[319] = new ModelRendererTurbo(this, 249, 185, textureX, textureY); // Box 919
		rightTrackModel[320] = new ModelRendererTurbo(this, 281, 185, textureX, textureY); // Box 920
		rightTrackModel[321] = new ModelRendererTurbo(this, 337, 185, textureX, textureY); // Box 921
		rightTrackModel[322] = new ModelRendererTurbo(this, 369, 185, textureX, textureY); // Box 922
		rightTrackModel[323] = new ModelRendererTurbo(this, 633, 185, textureX, textureY); // Box 923
		rightTrackModel[324] = new ModelRendererTurbo(this, 665, 185, textureX, textureY); // Box 924
		rightTrackModel[325] = new ModelRendererTurbo(this, 697, 185, textureX, textureY); // Box 925
		rightTrackModel[326] = new ModelRendererTurbo(this, 729, 185, textureX, textureY); // Box 926
		rightTrackModel[327] = new ModelRendererTurbo(this, 761, 185, textureX, textureY); // Box 927
		rightTrackModel[328] = new ModelRendererTurbo(this, 793, 185, textureX, textureY); // Box 928
		rightTrackModel[329] = new ModelRendererTurbo(this, 833, 185, textureX, textureY); // Box 929
		rightTrackModel[330] = new ModelRendererTurbo(this, 865, 185, textureX, textureY); // Box 930
		rightTrackModel[331] = new ModelRendererTurbo(this, 1017, 41, textureX, textureY); // Box 1000
		rightTrackModel[332] = new ModelRendererTurbo(this, 1017, 57, textureX, textureY); // Box 1001
		rightTrackModel[333] = new ModelRendererTurbo(this, 1017, 73, textureX, textureY); // Box 1002
		rightTrackModel[334] = new ModelRendererTurbo(this, 809, 145, textureX, textureY); // Box 1003
		rightTrackModel[335] = new ModelRendererTurbo(this, 849, 145, textureX, textureY); // Box 1004
		rightTrackModel[336] = new ModelRendererTurbo(this, 1017, 145, textureX, textureY); // Box 1005
		rightTrackModel[337] = new ModelRendererTurbo(this, 153, 153, textureX, textureY); // Box 1006
		rightTrackModel[338] = new ModelRendererTurbo(this, 193, 153, textureX, textureY); // Box 1007
		rightTrackModel[339] = new ModelRendererTurbo(this, 233, 153, textureX, textureY); // Box 1008
		rightTrackModel[340] = new ModelRendererTurbo(this, 361, 153, textureX, textureY); // Box 1009
		rightTrackModel[341] = new ModelRendererTurbo(this, 801, 161, textureX, textureY); // Box 1010
		rightTrackModel[342] = new ModelRendererTurbo(this, 817, 161, textureX, textureY); // Box 1011
		rightTrackModel[343] = new ModelRendererTurbo(this, 977, 161, textureX, textureY); // Box 23
		rightTrackModel[344] = new ModelRendererTurbo(this, 1009, 161, textureX, textureY); // Box 24
		rightTrackModel[345] = new ModelRendererTurbo(this, 217, 169, textureX, textureY); // Box 25
		rightTrackModel[346] = new ModelRendererTurbo(this, 865, 169, textureX, textureY); // Box 26
		rightTrackModel[347] = new ModelRendererTurbo(this, 889, 169, textureX, textureY); // Box 27
		rightTrackModel[348] = new ModelRendererTurbo(this, 921, 169, textureX, textureY); // Box 28
		rightTrackModel[349] = new ModelRendererTurbo(this, 937, 169, textureX, textureY); // Box 30
		rightTrackModel[350] = new ModelRendererTurbo(this, 953, 169, textureX, textureY); // Box 31
		rightTrackModel[351] = new ModelRendererTurbo(this, 969, 169, textureX, textureY); // Box 32
		rightTrackModel[352] = new ModelRendererTurbo(this, 985, 169, textureX, textureY); // Box 33
		rightTrackModel[353] = new ModelRendererTurbo(this, 25, 177, textureX, textureY); // Box 34
		rightTrackModel[354] = new ModelRendererTurbo(this, 41, 177, textureX, textureY); // Box 35
		rightTrackModel[355] = new ModelRendererTurbo(this, 385, 177, textureX, textureY); // Box 36
		rightTrackModel[356] = new ModelRendererTurbo(this, 617, 177, textureX, textureY); // Box 37
		rightTrackModel[357] = new ModelRendererTurbo(this, 801, 177, textureX, textureY); // Box 38
		rightTrackModel[358] = new ModelRendererTurbo(this, 817, 177, textureX, textureY); // Box 39
		rightTrackModel[359] = new ModelRendererTurbo(this, 865, 177, textureX, textureY); // Box 40
		rightTrackModel[360] = new ModelRendererTurbo(this, 881, 177, textureX, textureY); // Box 41
		rightTrackModel[361] = new ModelRendererTurbo(this, 897, 177, textureX, textureY); // Box 42
		rightTrackModel[362] = new ModelRendererTurbo(this, 913, 177, textureX, textureY); // Box 43
		rightTrackModel[363] = new ModelRendererTurbo(this, 937, 177, textureX, textureY); // Box 44
		rightTrackModel[364] = new ModelRendererTurbo(this, 953, 177, textureX, textureY); // Box 45
		rightTrackModel[365] = new ModelRendererTurbo(this, 969, 177, textureX, textureY); // Box 46
		rightTrackModel[366] = new ModelRendererTurbo(this, 985, 177, textureX, textureY); // Box 47
		rightTrackModel[367] = new ModelRendererTurbo(this, 777, 73, textureX, textureY); // Box 1435
		rightTrackModel[368] = new ModelRendererTurbo(this, 729, 73, textureX, textureY); // Box 1436
		rightTrackModel[369] = new ModelRendererTurbo(this, 761, 73, textureX, textureY); // Box 1437
		rightTrackModel[370] = new ModelRendererTurbo(this, 793, 73, textureX, textureY); // Box 1438
		rightTrackModel[371] = new ModelRendererTurbo(this, 809, 73, textureX, textureY); // Box 1439
		rightTrackModel[372] = new ModelRendererTurbo(this, 841, 73, textureX, textureY); // Box 1440
		rightTrackModel[373] = new ModelRendererTurbo(this, 825, 73, textureX, textureY); // Box 1441
		rightTrackModel[374] = new ModelRendererTurbo(this, 873, 73, textureX, textureY); // Box 1442
		rightTrackModel[375] = new ModelRendererTurbo(this, 857, 73, textureX, textureY); // Box 1443
		rightTrackModel[376] = new ModelRendererTurbo(this, 937, 73, textureX, textureY); // Box 1444
		rightTrackModel[377] = new ModelRendererTurbo(this, 985, 73, textureX, textureY); // Box 1445
		rightTrackModel[378] = new ModelRendererTurbo(this, 1001, 73, textureX, textureY); // Box 1446
		rightTrackModel[379] = new ModelRendererTurbo(this, 745, 73, textureX, textureY); // Box 1447
		rightTrackModel[380] = new ModelRendererTurbo(this, 953, 73, textureX, textureY); // Box 1448
		rightTrackModel[381] = new ModelRendererTurbo(this, 969, 73, textureX, textureY); // Box 1449
		rightTrackModel[382] = new ModelRendererTurbo(this, 921, 73, textureX, textureY); // Box 1450
		rightTrackModel[383] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 1451
		rightTrackModel[384] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 1452
		rightTrackModel[385] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 1453
		rightTrackModel[386] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 1454
		rightTrackModel[387] = new ModelRendererTurbo(this, 697, 73, textureX, textureY); // Box 1455
		rightTrackModel[388] = new ModelRendererTurbo(this, 713, 73, textureX, textureY); // Box 1456
		rightTrackModel[389] = new ModelRendererTurbo(this, 665, 73, textureX, textureY); // Box 1457
		rightTrackModel[390] = new ModelRendererTurbo(this, 681, 73, textureX, textureY); // Box 1458
		rightTrackModel[391] = new ModelRendererTurbo(this, 649, 73, textureX, textureY); // Box 1459
		rightTrackModel[392] = new ModelRendererTurbo(this, 633, 73, textureX, textureY); // Box 1460
		rightTrackModel[393] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Box 1461
		rightTrackModel[394] = new ModelRendererTurbo(this, 617, 73, textureX, textureY); // Box 1462
		rightTrackModel[395] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 1463
		rightTrackModel[396] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 1464
		rightTrackModel[397] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 1465
		rightTrackModel[398] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Box 1466
		rightTrackModel[399] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 1467
		rightTrackModel[400] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 1468
		rightTrackModel[401] = new ModelRendererTurbo(this, 889, 65, textureX, textureY); // Box 1469
		rightTrackModel[402] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 1470
		rightTrackModel[403] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 1471
		rightTrackModel[404] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 1472
		rightTrackModel[405] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 1473
		rightTrackModel[406] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 1474
		rightTrackModel[407] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 1475
		rightTrackModel[408] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 1476

		rightTrackModel[0].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 0
		rightTrackModel[0].setRotationPoint(38.5F, 2.4F, -30F);
		rightTrackModel[0].rotateAngleX = 0.2443461F;
		rightTrackModel[0].rotateAngleZ = 0.40142573F;

		rightTrackModel[1].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 1
		rightTrackModel[1].setRotationPoint(38.5F, 2.4F, -30F);
		rightTrackModel[1].rotateAngleX = 0.2443461F;
		rightTrackModel[1].rotateAngleZ = 1.18682389F;

		rightTrackModel[2].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 2
		rightTrackModel[2].setRotationPoint(38.5F, 2.4F, -30F);
		rightTrackModel[2].rotateAngleX = 0.2443461F;
		rightTrackModel[2].rotateAngleZ = 2.75762022F;

		rightTrackModel[3].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 3
		rightTrackModel[3].setRotationPoint(38.5F, 2.4F, -30F);
		rightTrackModel[3].rotateAngleX = 0.36651914F;
		rightTrackModel[3].rotateAngleZ = 1.97222205F;

		rightTrackModel[4].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 4
		rightTrackModel[4].setRotationPoint(38.5F, 2.4F, -30F);
		rightTrackModel[4].rotateAngleX = 0.2443461F;
		rightTrackModel[4].rotateAngleZ = 5.89921287F;

		rightTrackModel[5].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 5
		rightTrackModel[5].setRotationPoint(38.5F, 2.4F, -30F);
		rightTrackModel[5].rotateAngleX = 0.2443461F;
		rightTrackModel[5].rotateAngleZ = 5.11381471F;

		rightTrackModel[6].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackModel[6].setRotationPoint(38.5F, 2.4F, -30F);
		rightTrackModel[6].rotateAngleX = 0.2443461F;
		rightTrackModel[6].rotateAngleZ = 4.32841654F;

		rightTrackModel[7].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 7
		rightTrackModel[7].setRotationPoint(38.5F, 2.4F, -30F);
		rightTrackModel[7].rotateAngleX = 0.2443461F;
		rightTrackModel[7].rotateAngleZ = 3.54301838F;

		rightTrackModel[8].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 8
		rightTrackModel[8].setRotationPoint(38.5F, 2.4F, -30F);
		rightTrackModel[8].rotateAngleX = -0.2443461F;
		rightTrackModel[8].rotateAngleZ = 5.89921287F;

		rightTrackModel[9].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 9
		rightTrackModel[9].setRotationPoint(38.5F, 2.4F, -30F);
		rightTrackModel[9].rotateAngleX = -0.2443461F;
		rightTrackModel[9].rotateAngleZ = 5.11381471F;

		rightTrackModel[10].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 10
		rightTrackModel[10].setRotationPoint(38.5F, 2.4F, -30F);
		rightTrackModel[10].rotateAngleX = -0.2443461F;
		rightTrackModel[10].rotateAngleZ = 4.32841654F;

		rightTrackModel[11].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 11
		rightTrackModel[11].setRotationPoint(38.5F, 2.4F, -30F);
		rightTrackModel[11].rotateAngleX = -0.2443461F;
		rightTrackModel[11].rotateAngleZ = 3.54301838F;

		rightTrackModel[12].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 12
		rightTrackModel[12].setRotationPoint(38.5F, 2.4F, -30F);
		rightTrackModel[12].rotateAngleX = -0.2443461F;
		rightTrackModel[12].rotateAngleZ = 0.40142573F;

		rightTrackModel[13].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackModel[13].setRotationPoint(38.5F, 2.4F, -30F);
		rightTrackModel[13].rotateAngleX = -0.2443461F;
		rightTrackModel[13].rotateAngleZ = 1.97222205F;

		rightTrackModel[14].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackModel[14].setRotationPoint(38.5F, 2.4F, -30F);
		rightTrackModel[14].rotateAngleX = -0.2443461F;
		rightTrackModel[14].rotateAngleZ = 1.18682389F;

		rightTrackModel[15].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 15
		rightTrackModel[15].setRotationPoint(38.5F, 2.4F, -30F);
		rightTrackModel[15].rotateAngleX = -0.2443461F;
		rightTrackModel[15].rotateAngleZ = 2.75762022F;

		rightTrackModel[16].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 16
		rightTrackModel[16].setRotationPoint(38.5F, 2.4F, -30.4F);
		rightTrackModel[16].rotateAngleZ = 0.55850536F;

		rightTrackModel[17].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 17
		rightTrackModel[17].setRotationPoint(38.5F, 2.4F, -30.4F);
		rightTrackModel[17].rotateAngleZ = 1.20427718F;

		rightTrackModel[18].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 18
		rightTrackModel[18].setRotationPoint(38.5F, 2.4F, -30.4F);
		rightTrackModel[18].rotateAngleZ = 2.49582083F;

		rightTrackModel[19].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 19
		rightTrackModel[19].setRotationPoint(38.5F, 2.4F, -30.4F);
		rightTrackModel[19].rotateAngleZ = 1.85004901F;

		rightTrackModel[20].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 20
		rightTrackModel[20].setRotationPoint(38.5F, 2.4F, -30.4F);
		rightTrackModel[20].rotateAngleZ = 3.78736448F;

		rightTrackModel[21].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 21
		rightTrackModel[21].setRotationPoint(38.5F, 2.4F, -30.4F);
		rightTrackModel[21].rotateAngleZ = 3.14159265F;

		rightTrackModel[22].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 22
		rightTrackModel[22].setRotationPoint(38.5F, 2.4F, -30.4F);
		rightTrackModel[22].rotateAngleZ = 5.72467995F;

		rightTrackModel[23].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 23
		rightTrackModel[23].setRotationPoint(38.5F, 2.4F, -30.4F);
		rightTrackModel[23].rotateAngleZ = 5.07890812F;

		rightTrackModel[24].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 24
		rightTrackModel[24].setRotationPoint(38.5F, 2.4F, -30.4F);
		rightTrackModel[24].rotateAngleZ = 4.4331363F;

		rightTrackModel[25].addShapeBox(-1.5F, -6.15F, 0F, 3, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 25
		rightTrackModel[25].setRotationPoint(38.5F, 2.4F, -30.4F);
		rightTrackModel[25].rotateAngleZ = 6.28318531F;

		rightTrackModel[26].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 26
		rightTrackModel[26].setRotationPoint(38.5F, 2.4F, -21.5F);
		rightTrackModel[26].rotateAngleX = 0.36651914F;
		rightTrackModel[26].rotateAngleY = -3.14159265F;
		rightTrackModel[26].rotateAngleZ = 1.91986218F;

		rightTrackModel[27].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 27
		rightTrackModel[27].setRotationPoint(38.5F, 2.4F, -21.5F);
		rightTrackModel[27].rotateAngleX = 0.2443461F;
		rightTrackModel[27].rotateAngleY = -3.14159265F;
		rightTrackModel[27].rotateAngleZ = 1.13446401F;

		rightTrackModel[28].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 28
		rightTrackModel[28].setRotationPoint(38.5F, 2.4F, -21.5F);
		rightTrackModel[28].rotateAngleX = 0.2443461F;
		rightTrackModel[28].rotateAngleY = -3.14159265F;
		rightTrackModel[28].rotateAngleZ = 0.34906585F;

		rightTrackModel[29].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 29
		rightTrackModel[29].setRotationPoint(38.5F, 2.4F, -21.5F);
		rightTrackModel[29].rotateAngleX = 0.2443461F;
		rightTrackModel[29].rotateAngleY = -3.14159265F;
		rightTrackModel[29].rotateAngleZ = 5.84685299F;

		rightTrackModel[30].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 30
		rightTrackModel[30].setRotationPoint(38.5F, 2.4F, -21.5F);
		rightTrackModel[30].rotateAngleX = -0.2443461F;
		rightTrackModel[30].rotateAngleY = -3.14159265F;
		rightTrackModel[30].rotateAngleZ = 0.34906585F;

		rightTrackModel[31].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 31
		rightTrackModel[31].setRotationPoint(38.5F, 2.4F, -21.5F);
		rightTrackModel[31].rotateAngleX = 0.2443461F;
		rightTrackModel[31].rotateAngleY = -3.14159265F;
		rightTrackModel[31].rotateAngleZ = 5.06145483F;

		rightTrackModel[32].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 32
		rightTrackModel[32].setRotationPoint(38.5F, 2.4F, -21.5F);
		rightTrackModel[32].rotateAngleX = -0.2443461F;
		rightTrackModel[32].rotateAngleY = -3.14159265F;
		rightTrackModel[32].rotateAngleZ = 5.06145483F;

		rightTrackModel[33].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 33
		rightTrackModel[33].setRotationPoint(38.5F, 2.4F, -21.5F);
		rightTrackModel[33].rotateAngleX = -0.2443461F;
		rightTrackModel[33].rotateAngleY = -3.14159265F;
		rightTrackModel[33].rotateAngleZ = 4.27605667F;

		rightTrackModel[34].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackModel[34].setRotationPoint(38.5F, 2.4F, -21.5F);
		rightTrackModel[34].rotateAngleX = 0.2443461F;
		rightTrackModel[34].rotateAngleY = -3.14159265F;
		rightTrackModel[34].rotateAngleZ = 2.70526034F;

		rightTrackModel[35].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 35
		rightTrackModel[35].setRotationPoint(38.5F, 2.4F, -21.5F);
		rightTrackModel[35].rotateAngleX = -0.2443461F;
		rightTrackModel[35].rotateAngleY = -3.14159265F;
		rightTrackModel[35].rotateAngleZ = 2.70526034F;

		rightTrackModel[36].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 36
		rightTrackModel[36].setRotationPoint(38.5F, 2.4F, -21.5F);
		rightTrackModel[36].rotateAngleX = -0.2443461F;
		rightTrackModel[36].rotateAngleY = -3.14159265F;
		rightTrackModel[36].rotateAngleZ = 1.91986218F;

		rightTrackModel[37].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 37
		rightTrackModel[37].setRotationPoint(38.5F, 2.4F, -21.5F);
		rightTrackModel[37].rotateAngleX = -0.2443461F;
		rightTrackModel[37].rotateAngleY = -3.14159265F;
		rightTrackModel[37].rotateAngleZ = 1.13446401F;

		rightTrackModel[38].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 38
		rightTrackModel[38].setRotationPoint(38.5F, 2.4F, -21.5F);
		rightTrackModel[38].rotateAngleX = -0.2443461F;
		rightTrackModel[38].rotateAngleY = -3.14159265F;
		rightTrackModel[38].rotateAngleZ = 5.84685299F;

		rightTrackModel[39].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 39
		rightTrackModel[39].setRotationPoint(38.5F, 2.4F, -21.5F);
		rightTrackModel[39].rotateAngleX = 0.2443461F;
		rightTrackModel[39].rotateAngleY = -3.14159265F;
		rightTrackModel[39].rotateAngleZ = 4.27605667F;

		rightTrackModel[40].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 40
		rightTrackModel[40].setRotationPoint(38.5F, 2.4F, -21.5F);
		rightTrackModel[40].rotateAngleX = 0.2443461F;
		rightTrackModel[40].rotateAngleY = -3.14159265F;
		rightTrackModel[40].rotateAngleZ = 3.4906585F;

		rightTrackModel[41].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 41
		rightTrackModel[41].setRotationPoint(38.5F, 2.4F, -21.5F);
		rightTrackModel[41].rotateAngleX = -0.2443461F;
		rightTrackModel[41].rotateAngleY = -3.14159265F;
		rightTrackModel[41].rotateAngleZ = 3.4906585F;

		rightTrackModel[42].addShapeBox(-1F, -1F, 8F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		rightTrackModel[42].setRotationPoint(38.5F, 2.4F, -30F);

		rightTrackModel[43].addShapeBox(-1F, -1F, 8F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		rightTrackModel[43].setRotationPoint(24.5F, 2.4F, -30F);

		rightTrackModel[44].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 44
		rightTrackModel[44].setRotationPoint(24.5F, 2.4F, -30.4F);
		rightTrackModel[44].rotateAngleZ = 5.72467995F;

		rightTrackModel[45].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 45
		rightTrackModel[45].setRotationPoint(24.5F, 2.4F, -30.4F);
		rightTrackModel[45].rotateAngleZ = 5.07890812F;

		rightTrackModel[46].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 46
		rightTrackModel[46].setRotationPoint(24.5F, 2.4F, -30.4F);
		rightTrackModel[46].rotateAngleZ = 4.4331363F;

		rightTrackModel[47].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 47
		rightTrackModel[47].setRotationPoint(24.5F, 2.4F, -30.4F);
		rightTrackModel[47].rotateAngleZ = 3.78736448F;

		rightTrackModel[48].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 48
		rightTrackModel[48].setRotationPoint(24.5F, 2.4F, -30.4F);
		rightTrackModel[48].rotateAngleZ = 3.14159265F;

		rightTrackModel[49].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 49
		rightTrackModel[49].setRotationPoint(24.5F, 2.4F, -30.4F);
		rightTrackModel[49].rotateAngleZ = 2.49582083F;

		rightTrackModel[50].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 50
		rightTrackModel[50].setRotationPoint(24.5F, 2.4F, -30.4F);
		rightTrackModel[50].rotateAngleZ = 1.85004901F;

		rightTrackModel[51].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 51
		rightTrackModel[51].setRotationPoint(24.5F, 2.4F, -30.4F);
		rightTrackModel[51].rotateAngleZ = 1.20427718F;

		rightTrackModel[52].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 52
		rightTrackModel[52].setRotationPoint(24.5F, 2.4F, -30.4F);
		rightTrackModel[52].rotateAngleZ = 0.55850536F;

		rightTrackModel[53].addShapeBox(-1.5F, -6.15F, 0F, 3, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 53
		rightTrackModel[53].setRotationPoint(24.5F, 2.4F, -30.4F);
		rightTrackModel[53].rotateAngleZ = 6.28318531F;

		rightTrackModel[54].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 54
		rightTrackModel[54].setRotationPoint(24.5F, 2.4F, -30F);
		rightTrackModel[54].rotateAngleX = -0.2443461F;
		rightTrackModel[54].rotateAngleZ = 1.97222205F;

		rightTrackModel[55].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 55
		rightTrackModel[55].setRotationPoint(24.5F, 2.4F, -30F);
		rightTrackModel[55].rotateAngleX = 0.2443461F;
		rightTrackModel[55].rotateAngleZ = 1.18682389F;

		rightTrackModel[56].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 56
		rightTrackModel[56].setRotationPoint(24.5F, 2.4F, -30F);
		rightTrackModel[56].rotateAngleX = -0.2443461F;
		rightTrackModel[56].rotateAngleZ = 2.75762022F;

		rightTrackModel[57].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 57
		rightTrackModel[57].setRotationPoint(24.5F, 2.4F, -30F);
		rightTrackModel[57].rotateAngleX = 0.36651914F;
		rightTrackModel[57].rotateAngleZ = 1.97222205F;

		rightTrackModel[58].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 58
		rightTrackModel[58].setRotationPoint(24.5F, 2.4F, -30F);
		rightTrackModel[58].rotateAngleX = -0.2443461F;
		rightTrackModel[58].rotateAngleZ = 3.54301838F;

		rightTrackModel[59].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 59
		rightTrackModel[59].setRotationPoint(24.5F, 2.4F, -30F);
		rightTrackModel[59].rotateAngleX = 0.2443461F;
		rightTrackModel[59].rotateAngleZ = 2.75762022F;

		rightTrackModel[60].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 60
		rightTrackModel[60].setRotationPoint(24.5F, 2.4F, -30F);
		rightTrackModel[60].rotateAngleX = -0.2443461F;
		rightTrackModel[60].rotateAngleZ = 4.32841654F;

		rightTrackModel[61].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 61
		rightTrackModel[61].setRotationPoint(24.5F, 2.4F, -30F);
		rightTrackModel[61].rotateAngleX = 0.2443461F;
		rightTrackModel[61].rotateAngleZ = 3.54301838F;

		rightTrackModel[62].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 62
		rightTrackModel[62].setRotationPoint(24.5F, 2.4F, -30F);
		rightTrackModel[62].rotateAngleX = 0.2443461F;
		rightTrackModel[62].rotateAngleZ = 4.32841654F;

		rightTrackModel[63].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 63
		rightTrackModel[63].setRotationPoint(24.5F, 2.4F, -30F);
		rightTrackModel[63].rotateAngleX = -0.2443461F;
		rightTrackModel[63].rotateAngleZ = 5.11381471F;

		rightTrackModel[64].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 64
		rightTrackModel[64].setRotationPoint(24.5F, 2.4F, -30F);
		rightTrackModel[64].rotateAngleX = -0.2443461F;
		rightTrackModel[64].rotateAngleZ = 5.89921287F;

		rightTrackModel[65].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 65
		rightTrackModel[65].setRotationPoint(24.5F, 2.4F, -30F);
		rightTrackModel[65].rotateAngleX = 0.2443461F;
		rightTrackModel[65].rotateAngleZ = 5.11381471F;

		rightTrackModel[66].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 66
		rightTrackModel[66].setRotationPoint(24.5F, 2.4F, -30F);
		rightTrackModel[66].rotateAngleX = 0.2443461F;
		rightTrackModel[66].rotateAngleZ = 5.89921287F;

		rightTrackModel[67].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 67
		rightTrackModel[67].setRotationPoint(24.5F, 2.4F, -30F);
		rightTrackModel[67].rotateAngleX = -0.2443461F;
		rightTrackModel[67].rotateAngleZ = 0.40142573F;

		rightTrackModel[68].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 68
		rightTrackModel[68].setRotationPoint(24.5F, 2.4F, -30F);
		rightTrackModel[68].rotateAngleX = 0.2443461F;
		rightTrackModel[68].rotateAngleZ = 0.40142573F;

		rightTrackModel[69].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 69
		rightTrackModel[69].setRotationPoint(24.5F, 2.4F, -30F);
		rightTrackModel[69].rotateAngleX = -0.2443461F;
		rightTrackModel[69].rotateAngleZ = 1.18682389F;

		rightTrackModel[70].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 70
		rightTrackModel[70].setRotationPoint(24.5F, 2.4F, -21.5F);
		rightTrackModel[70].rotateAngleX = -0.2443461F;
		rightTrackModel[70].rotateAngleY = -3.14159265F;
		rightTrackModel[70].rotateAngleZ = 1.91986218F;

		rightTrackModel[71].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 71
		rightTrackModel[71].setRotationPoint(24.5F, 2.4F, -21.5F);
		rightTrackModel[71].rotateAngleX = 0.2443461F;
		rightTrackModel[71].rotateAngleY = -3.14159265F;
		rightTrackModel[71].rotateAngleZ = 1.13446401F;

		rightTrackModel[72].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 72
		rightTrackModel[72].setRotationPoint(24.5F, 2.4F, -21.5F);
		rightTrackModel[72].rotateAngleX = -0.2443461F;
		rightTrackModel[72].rotateAngleY = -3.14159265F;
		rightTrackModel[72].rotateAngleZ = 2.70526034F;

		rightTrackModel[73].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 73
		rightTrackModel[73].setRotationPoint(24.5F, 2.4F, -21.5F);
		rightTrackModel[73].rotateAngleX = 0.36651914F;
		rightTrackModel[73].rotateAngleY = -3.14159265F;
		rightTrackModel[73].rotateAngleZ = 1.91986218F;

		rightTrackModel[74].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 74
		rightTrackModel[74].setRotationPoint(24.5F, 2.4F, -21.5F);
		rightTrackModel[74].rotateAngleX = -0.2443461F;
		rightTrackModel[74].rotateAngleY = -3.14159265F;
		rightTrackModel[74].rotateAngleZ = 3.4906585F;

		rightTrackModel[75].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 75
		rightTrackModel[75].setRotationPoint(24.5F, 2.4F, -21.5F);
		rightTrackModel[75].rotateAngleX = 0.2443461F;
		rightTrackModel[75].rotateAngleY = -3.14159265F;
		rightTrackModel[75].rotateAngleZ = 2.70526034F;

		rightTrackModel[76].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 76
		rightTrackModel[76].setRotationPoint(24.5F, 2.4F, -21.5F);
		rightTrackModel[76].rotateAngleX = 0.2443461F;
		rightTrackModel[76].rotateAngleY = -3.14159265F;
		rightTrackModel[76].rotateAngleZ = 3.4906585F;

		rightTrackModel[77].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 77
		rightTrackModel[77].setRotationPoint(24.5F, 2.4F, -21.5F);
		rightTrackModel[77].rotateAngleX = -0.2443461F;
		rightTrackModel[77].rotateAngleY = -3.14159265F;
		rightTrackModel[77].rotateAngleZ = 4.27605667F;

		rightTrackModel[78].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 78
		rightTrackModel[78].setRotationPoint(24.5F, 2.4F, -21.5F);
		rightTrackModel[78].rotateAngleX = 0.2443461F;
		rightTrackModel[78].rotateAngleY = -3.14159265F;
		rightTrackModel[78].rotateAngleZ = 4.27605667F;

		rightTrackModel[79].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 79
		rightTrackModel[79].setRotationPoint(24.5F, 2.4F, -21.5F);
		rightTrackModel[79].rotateAngleX = -0.2443461F;
		rightTrackModel[79].rotateAngleY = -3.14159265F;
		rightTrackModel[79].rotateAngleZ = 5.06145483F;

		rightTrackModel[80].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 80
		rightTrackModel[80].setRotationPoint(24.5F, 2.4F, -21.5F);
		rightTrackModel[80].rotateAngleX = 0.2443461F;
		rightTrackModel[80].rotateAngleY = -3.14159265F;
		rightTrackModel[80].rotateAngleZ = 5.06145483F;

		rightTrackModel[81].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 81
		rightTrackModel[81].setRotationPoint(24.5F, 2.4F, -21.5F);
		rightTrackModel[81].rotateAngleX = -0.2443461F;
		rightTrackModel[81].rotateAngleY = -3.14159265F;
		rightTrackModel[81].rotateAngleZ = 5.84685299F;

		rightTrackModel[82].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 82
		rightTrackModel[82].setRotationPoint(24.5F, 2.4F, -21.5F);
		rightTrackModel[82].rotateAngleX = 0.2443461F;
		rightTrackModel[82].rotateAngleY = -3.14159265F;
		rightTrackModel[82].rotateAngleZ = 5.84685299F;

		rightTrackModel[83].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 83
		rightTrackModel[83].setRotationPoint(24.5F, 2.4F, -21.5F);
		rightTrackModel[83].rotateAngleX = -0.2443461F;
		rightTrackModel[83].rotateAngleY = -3.14159265F;
		rightTrackModel[83].rotateAngleZ = 0.34906585F;

		rightTrackModel[84].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 84
		rightTrackModel[84].setRotationPoint(24.5F, 2.4F, -21.5F);
		rightTrackModel[84].rotateAngleX = 0.2443461F;
		rightTrackModel[84].rotateAngleY = -3.14159265F;
		rightTrackModel[84].rotateAngleZ = 0.34906585F;

		rightTrackModel[85].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 85
		rightTrackModel[85].setRotationPoint(24.5F, 2.4F, -21.5F);
		rightTrackModel[85].rotateAngleX = -0.2443461F;
		rightTrackModel[85].rotateAngleY = -3.14159265F;
		rightTrackModel[85].rotateAngleZ = 1.13446401F;

		rightTrackModel[86].addShapeBox(-1F, -1F, 8F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		rightTrackModel[86].setRotationPoint(10F, 2.4F, -30F);

		rightTrackModel[87].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 87
		rightTrackModel[87].setRotationPoint(10F, 2.4F, -30.4F);
		rightTrackModel[87].rotateAngleZ = 5.72467995F;

		rightTrackModel[88].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 88
		rightTrackModel[88].setRotationPoint(10F, 2.4F, -30.4F);
		rightTrackModel[88].rotateAngleZ = 5.07890812F;

		rightTrackModel[89].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 89
		rightTrackModel[89].setRotationPoint(10F, 2.4F, -30.4F);
		rightTrackModel[89].rotateAngleZ = 4.4331363F;

		rightTrackModel[90].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 90
		rightTrackModel[90].setRotationPoint(10F, 2.4F, -30.4F);
		rightTrackModel[90].rotateAngleZ = 3.78736448F;

		rightTrackModel[91].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 91
		rightTrackModel[91].setRotationPoint(10F, 2.4F, -30.4F);
		rightTrackModel[91].rotateAngleZ = 3.14159265F;

		rightTrackModel[92].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 92
		rightTrackModel[92].setRotationPoint(10F, 2.4F, -30.4F);
		rightTrackModel[92].rotateAngleZ = 2.49582083F;

		rightTrackModel[93].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 93
		rightTrackModel[93].setRotationPoint(10F, 2.4F, -30.4F);
		rightTrackModel[93].rotateAngleZ = 1.85004901F;

		rightTrackModel[94].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 94
		rightTrackModel[94].setRotationPoint(10F, 2.4F, -30.4F);
		rightTrackModel[94].rotateAngleZ = 1.20427718F;

		rightTrackModel[95].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 95
		rightTrackModel[95].setRotationPoint(10F, 2.4F, -30.4F);
		rightTrackModel[95].rotateAngleZ = 0.55850536F;

		rightTrackModel[96].addShapeBox(-1.5F, -6.15F, 0F, 3, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 96
		rightTrackModel[96].setRotationPoint(10F, 2.4F, -30.4F);
		rightTrackModel[96].rotateAngleZ = 6.28318531F;

		rightTrackModel[97].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 97
		rightTrackModel[97].setRotationPoint(10F, 2.4F, -30F);
		rightTrackModel[97].rotateAngleX = -0.2443461F;
		rightTrackModel[97].rotateAngleZ = 1.97222205F;

		rightTrackModel[98].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 98
		rightTrackModel[98].setRotationPoint(10F, 2.4F, -30F);
		rightTrackModel[98].rotateAngleX = 0.2443461F;
		rightTrackModel[98].rotateAngleZ = 1.18682389F;

		rightTrackModel[99].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 99
		rightTrackModel[99].setRotationPoint(10F, 2.4F, -30F);
		rightTrackModel[99].rotateAngleX = -0.2443461F;
		rightTrackModel[99].rotateAngleZ = 2.75762022F;

		rightTrackModel[100].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 100
		rightTrackModel[100].setRotationPoint(10F, 2.4F, -30F);
		rightTrackModel[100].rotateAngleX = 0.36651914F;
		rightTrackModel[100].rotateAngleZ = 1.97222205F;

		rightTrackModel[101].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 101
		rightTrackModel[101].setRotationPoint(10F, 2.4F, -30F);
		rightTrackModel[101].rotateAngleX = -0.2443461F;
		rightTrackModel[101].rotateAngleZ = 3.54301838F;

		rightTrackModel[102].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 102
		rightTrackModel[102].setRotationPoint(10F, 2.4F, -30F);
		rightTrackModel[102].rotateAngleX = 0.2443461F;
		rightTrackModel[102].rotateAngleZ = 2.75762022F;

		rightTrackModel[103].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 103
		rightTrackModel[103].setRotationPoint(10F, 2.4F, -30F);
		rightTrackModel[103].rotateAngleX = -0.2443461F;
		rightTrackModel[103].rotateAngleZ = 4.32841654F;

		rightTrackModel[104].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 104
		rightTrackModel[104].setRotationPoint(10F, 2.4F, -30F);
		rightTrackModel[104].rotateAngleX = 0.2443461F;
		rightTrackModel[104].rotateAngleZ = 3.54301838F;

		rightTrackModel[105].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 105
		rightTrackModel[105].setRotationPoint(10F, 2.4F, -30F);
		rightTrackModel[105].rotateAngleX = 0.2443461F;
		rightTrackModel[105].rotateAngleZ = 4.32841654F;

		rightTrackModel[106].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 106
		rightTrackModel[106].setRotationPoint(10F, 2.4F, -30F);
		rightTrackModel[106].rotateAngleX = -0.2443461F;
		rightTrackModel[106].rotateAngleZ = 5.11381471F;

		rightTrackModel[107].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 107
		rightTrackModel[107].setRotationPoint(10F, 2.4F, -30F);
		rightTrackModel[107].rotateAngleX = -0.2443461F;
		rightTrackModel[107].rotateAngleZ = 5.89921287F;

		rightTrackModel[108].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 108
		rightTrackModel[108].setRotationPoint(10F, 2.4F, -30F);
		rightTrackModel[108].rotateAngleX = 0.2443461F;
		rightTrackModel[108].rotateAngleZ = 5.11381471F;

		rightTrackModel[109].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 109
		rightTrackModel[109].setRotationPoint(10F, 2.4F, -30F);
		rightTrackModel[109].rotateAngleX = 0.2443461F;
		rightTrackModel[109].rotateAngleZ = 5.89921287F;

		rightTrackModel[110].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 110
		rightTrackModel[110].setRotationPoint(10F, 2.4F, -30F);
		rightTrackModel[110].rotateAngleX = -0.2443461F;
		rightTrackModel[110].rotateAngleZ = 0.40142573F;

		rightTrackModel[111].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 111
		rightTrackModel[111].setRotationPoint(10F, 2.4F, -30F);
		rightTrackModel[111].rotateAngleX = 0.2443461F;
		rightTrackModel[111].rotateAngleZ = 0.40142573F;

		rightTrackModel[112].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 112
		rightTrackModel[112].setRotationPoint(10F, 2.4F, -30F);
		rightTrackModel[112].rotateAngleX = -0.2443461F;
		rightTrackModel[112].rotateAngleZ = 1.18682389F;

		rightTrackModel[113].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 113
		rightTrackModel[113].setRotationPoint(10F, 2.4F, -21.5F);
		rightTrackModel[113].rotateAngleX = -0.2443461F;
		rightTrackModel[113].rotateAngleY = -3.14159265F;
		rightTrackModel[113].rotateAngleZ = 1.91986218F;

		rightTrackModel[114].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 114
		rightTrackModel[114].setRotationPoint(10F, 2.4F, -21.5F);
		rightTrackModel[114].rotateAngleX = 0.2443461F;
		rightTrackModel[114].rotateAngleY = -3.14159265F;
		rightTrackModel[114].rotateAngleZ = 1.13446401F;

		rightTrackModel[115].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 115
		rightTrackModel[115].setRotationPoint(10F, 2.4F, -21.5F);
		rightTrackModel[115].rotateAngleX = -0.2443461F;
		rightTrackModel[115].rotateAngleY = -3.14159265F;
		rightTrackModel[115].rotateAngleZ = 2.70526034F;

		rightTrackModel[116].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 116
		rightTrackModel[116].setRotationPoint(10F, 2.4F, -21.5F);
		rightTrackModel[116].rotateAngleX = 0.36651914F;
		rightTrackModel[116].rotateAngleY = -3.14159265F;
		rightTrackModel[116].rotateAngleZ = 1.91986218F;

		rightTrackModel[117].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 117
		rightTrackModel[117].setRotationPoint(10F, 2.4F, -21.5F);
		rightTrackModel[117].rotateAngleX = -0.2443461F;
		rightTrackModel[117].rotateAngleY = -3.14159265F;
		rightTrackModel[117].rotateAngleZ = 3.4906585F;

		rightTrackModel[118].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 118
		rightTrackModel[118].setRotationPoint(10F, 2.4F, -21.5F);
		rightTrackModel[118].rotateAngleX = 0.2443461F;
		rightTrackModel[118].rotateAngleY = -3.14159265F;
		rightTrackModel[118].rotateAngleZ = 2.70526034F;

		rightTrackModel[119].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 119
		rightTrackModel[119].setRotationPoint(10F, 2.4F, -21.5F);
		rightTrackModel[119].rotateAngleX = 0.2443461F;
		rightTrackModel[119].rotateAngleY = -3.14159265F;
		rightTrackModel[119].rotateAngleZ = 3.4906585F;

		rightTrackModel[120].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 120
		rightTrackModel[120].setRotationPoint(10F, 2.4F, -21.5F);
		rightTrackModel[120].rotateAngleX = -0.2443461F;
		rightTrackModel[120].rotateAngleY = -3.14159265F;
		rightTrackModel[120].rotateAngleZ = 4.27605667F;

		rightTrackModel[121].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 121
		rightTrackModel[121].setRotationPoint(10F, 2.4F, -21.5F);
		rightTrackModel[121].rotateAngleX = 0.2443461F;
		rightTrackModel[121].rotateAngleY = -3.14159265F;
		rightTrackModel[121].rotateAngleZ = 4.27605667F;

		rightTrackModel[122].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 122
		rightTrackModel[122].setRotationPoint(10F, 2.4F, -21.5F);
		rightTrackModel[122].rotateAngleX = -0.2443461F;
		rightTrackModel[122].rotateAngleY = -3.14159265F;
		rightTrackModel[122].rotateAngleZ = 5.06145483F;

		rightTrackModel[123].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 123
		rightTrackModel[123].setRotationPoint(10F, 2.4F, -21.5F);
		rightTrackModel[123].rotateAngleX = 0.2443461F;
		rightTrackModel[123].rotateAngleY = -3.14159265F;
		rightTrackModel[123].rotateAngleZ = 5.06145483F;

		rightTrackModel[124].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 124
		rightTrackModel[124].setRotationPoint(10F, 2.4F, -21.5F);
		rightTrackModel[124].rotateAngleX = -0.2443461F;
		rightTrackModel[124].rotateAngleY = -3.14159265F;
		rightTrackModel[124].rotateAngleZ = 5.84685299F;

		rightTrackModel[125].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 125
		rightTrackModel[125].setRotationPoint(10F, 2.4F, -21.5F);
		rightTrackModel[125].rotateAngleX = 0.2443461F;
		rightTrackModel[125].rotateAngleY = -3.14159265F;
		rightTrackModel[125].rotateAngleZ = 5.84685299F;

		rightTrackModel[126].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 126
		rightTrackModel[126].setRotationPoint(10F, 2.4F, -21.5F);
		rightTrackModel[126].rotateAngleX = -0.2443461F;
		rightTrackModel[126].rotateAngleY = -3.14159265F;
		rightTrackModel[126].rotateAngleZ = 0.34906585F;

		rightTrackModel[127].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 127
		rightTrackModel[127].setRotationPoint(10F, 2.4F, -21.5F);
		rightTrackModel[127].rotateAngleX = 0.2443461F;
		rightTrackModel[127].rotateAngleY = -3.14159265F;
		rightTrackModel[127].rotateAngleZ = 0.34906585F;

		rightTrackModel[128].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 128
		rightTrackModel[128].setRotationPoint(10F, 2.4F, -21.5F);
		rightTrackModel[128].rotateAngleX = -0.2443461F;
		rightTrackModel[128].rotateAngleY = -3.14159265F;
		rightTrackModel[128].rotateAngleZ = 1.13446401F;

		rightTrackModel[129].addShapeBox(-1F, -1F, 8F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		rightTrackModel[129].setRotationPoint(-4.5F, 2.4F, -30F);

		rightTrackModel[130].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 130
		rightTrackModel[130].setRotationPoint(-4.5F, 2.4F, -30.4F);
		rightTrackModel[130].rotateAngleZ = 5.72467995F;

		rightTrackModel[131].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 131
		rightTrackModel[131].setRotationPoint(-4.5F, 2.4F, -30.4F);
		rightTrackModel[131].rotateAngleZ = 5.07890812F;

		rightTrackModel[132].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 132
		rightTrackModel[132].setRotationPoint(-4.5F, 2.4F, -30.4F);
		rightTrackModel[132].rotateAngleZ = 4.4331363F;

		rightTrackModel[133].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 133
		rightTrackModel[133].setRotationPoint(-4.5F, 2.4F, -30.4F);
		rightTrackModel[133].rotateAngleZ = 3.78736448F;

		rightTrackModel[134].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 134
		rightTrackModel[134].setRotationPoint(-4.5F, 2.4F, -30.4F);
		rightTrackModel[134].rotateAngleZ = 3.14159265F;

		rightTrackModel[135].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 135
		rightTrackModel[135].setRotationPoint(-4.5F, 2.4F, -30.4F);
		rightTrackModel[135].rotateAngleZ = 2.49582083F;

		rightTrackModel[136].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 136
		rightTrackModel[136].setRotationPoint(-4.5F, 2.4F, -30.4F);
		rightTrackModel[136].rotateAngleZ = 1.85004901F;

		rightTrackModel[137].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 137
		rightTrackModel[137].setRotationPoint(-4.5F, 2.4F, -30.4F);
		rightTrackModel[137].rotateAngleZ = 1.20427718F;

		rightTrackModel[138].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 138
		rightTrackModel[138].setRotationPoint(-4.5F, 2.4F, -30.4F);
		rightTrackModel[138].rotateAngleZ = 0.55850536F;

		rightTrackModel[139].addShapeBox(-1.5F, -6.15F, 0F, 3, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 139
		rightTrackModel[139].setRotationPoint(-4.5F, 2.4F, -30.4F);
		rightTrackModel[139].rotateAngleZ = 6.28318531F;

		rightTrackModel[140].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 140
		rightTrackModel[140].setRotationPoint(-4.5F, 2.4F, -30F);
		rightTrackModel[140].rotateAngleX = -0.2443461F;
		rightTrackModel[140].rotateAngleZ = 1.97222205F;

		rightTrackModel[141].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 141
		rightTrackModel[141].setRotationPoint(-4.5F, 2.4F, -30F);
		rightTrackModel[141].rotateAngleX = 0.2443461F;
		rightTrackModel[141].rotateAngleZ = 1.18682389F;

		rightTrackModel[142].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 142
		rightTrackModel[142].setRotationPoint(-4.5F, 2.4F, -30F);
		rightTrackModel[142].rotateAngleX = -0.2443461F;
		rightTrackModel[142].rotateAngleZ = 2.75762022F;

		rightTrackModel[143].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 143
		rightTrackModel[143].setRotationPoint(-4.5F, 2.4F, -30F);
		rightTrackModel[143].rotateAngleX = 0.36651914F;
		rightTrackModel[143].rotateAngleZ = 1.97222205F;

		rightTrackModel[144].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 144
		rightTrackModel[144].setRotationPoint(-4.5F, 2.4F, -30F);
		rightTrackModel[144].rotateAngleX = -0.2443461F;
		rightTrackModel[144].rotateAngleZ = 3.54301838F;

		rightTrackModel[145].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 145
		rightTrackModel[145].setRotationPoint(-4.5F, 2.4F, -30F);
		rightTrackModel[145].rotateAngleX = 0.2443461F;
		rightTrackModel[145].rotateAngleZ = 2.75762022F;

		rightTrackModel[146].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 146
		rightTrackModel[146].setRotationPoint(-4.5F, 2.4F, -30F);
		rightTrackModel[146].rotateAngleX = -0.2443461F;
		rightTrackModel[146].rotateAngleZ = 4.32841654F;

		rightTrackModel[147].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 147
		rightTrackModel[147].setRotationPoint(-4.5F, 2.4F, -30F);
		rightTrackModel[147].rotateAngleX = 0.2443461F;
		rightTrackModel[147].rotateAngleZ = 3.54301838F;

		rightTrackModel[148].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 148
		rightTrackModel[148].setRotationPoint(-4.5F, 2.4F, -30F);
		rightTrackModel[148].rotateAngleX = 0.2443461F;
		rightTrackModel[148].rotateAngleZ = 4.32841654F;

		rightTrackModel[149].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 149
		rightTrackModel[149].setRotationPoint(-4.5F, 2.4F, -30F);
		rightTrackModel[149].rotateAngleX = -0.2443461F;
		rightTrackModel[149].rotateAngleZ = 5.11381471F;

		rightTrackModel[150].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 150
		rightTrackModel[150].setRotationPoint(-4.5F, 2.4F, -30F);
		rightTrackModel[150].rotateAngleX = -0.2443461F;
		rightTrackModel[150].rotateAngleZ = 5.89921287F;

		rightTrackModel[151].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 151
		rightTrackModel[151].setRotationPoint(-4.5F, 2.4F, -30F);
		rightTrackModel[151].rotateAngleX = 0.2443461F;
		rightTrackModel[151].rotateAngleZ = 5.11381471F;

		rightTrackModel[152].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 152
		rightTrackModel[152].setRotationPoint(-4.5F, 2.4F, -30F);
		rightTrackModel[152].rotateAngleX = 0.2443461F;
		rightTrackModel[152].rotateAngleZ = 5.89921287F;

		rightTrackModel[153].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 153
		rightTrackModel[153].setRotationPoint(-4.5F, 2.4F, -30F);
		rightTrackModel[153].rotateAngleX = -0.2443461F;
		rightTrackModel[153].rotateAngleZ = 0.40142573F;

		rightTrackModel[154].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 154
		rightTrackModel[154].setRotationPoint(-4.5F, 2.4F, -30F);
		rightTrackModel[154].rotateAngleX = 0.2443461F;
		rightTrackModel[154].rotateAngleZ = 0.40142573F;

		rightTrackModel[155].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 155
		rightTrackModel[155].setRotationPoint(-4.5F, 2.4F, -30F);
		rightTrackModel[155].rotateAngleX = -0.2443461F;
		rightTrackModel[155].rotateAngleZ = 1.18682389F;

		rightTrackModel[156].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 156
		rightTrackModel[156].setRotationPoint(-4.5F, 2.4F, -21.5F);
		rightTrackModel[156].rotateAngleX = -0.2443461F;
		rightTrackModel[156].rotateAngleY = -3.14159265F;
		rightTrackModel[156].rotateAngleZ = 1.91986218F;

		rightTrackModel[157].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 157
		rightTrackModel[157].setRotationPoint(-4.5F, 2.4F, -21.5F);
		rightTrackModel[157].rotateAngleX = 0.2443461F;
		rightTrackModel[157].rotateAngleY = -3.14159265F;
		rightTrackModel[157].rotateAngleZ = 1.13446401F;

		rightTrackModel[158].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 158
		rightTrackModel[158].setRotationPoint(-4.5F, 2.4F, -21.5F);
		rightTrackModel[158].rotateAngleX = -0.2443461F;
		rightTrackModel[158].rotateAngleY = -3.14159265F;
		rightTrackModel[158].rotateAngleZ = 2.70526034F;

		rightTrackModel[159].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 159
		rightTrackModel[159].setRotationPoint(-4.5F, 2.4F, -21.5F);
		rightTrackModel[159].rotateAngleX = 0.36651914F;
		rightTrackModel[159].rotateAngleY = -3.14159265F;
		rightTrackModel[159].rotateAngleZ = 1.91986218F;

		rightTrackModel[160].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 160
		rightTrackModel[160].setRotationPoint(-4.5F, 2.4F, -21.5F);
		rightTrackModel[160].rotateAngleX = -0.2443461F;
		rightTrackModel[160].rotateAngleY = -3.14159265F;
		rightTrackModel[160].rotateAngleZ = 3.4906585F;

		rightTrackModel[161].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 161
		rightTrackModel[161].setRotationPoint(-4.5F, 2.4F, -21.5F);
		rightTrackModel[161].rotateAngleX = 0.2443461F;
		rightTrackModel[161].rotateAngleY = -3.14159265F;
		rightTrackModel[161].rotateAngleZ = 2.70526034F;

		rightTrackModel[162].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 162
		rightTrackModel[162].setRotationPoint(-4.5F, 2.4F, -21.5F);
		rightTrackModel[162].rotateAngleX = 0.2443461F;
		rightTrackModel[162].rotateAngleY = -3.14159265F;
		rightTrackModel[162].rotateAngleZ = 3.4906585F;

		rightTrackModel[163].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 163
		rightTrackModel[163].setRotationPoint(-4.5F, 2.4F, -21.5F);
		rightTrackModel[163].rotateAngleX = -0.2443461F;
		rightTrackModel[163].rotateAngleY = -3.14159265F;
		rightTrackModel[163].rotateAngleZ = 4.27605667F;

		rightTrackModel[164].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 164
		rightTrackModel[164].setRotationPoint(-4.5F, 2.4F, -21.5F);
		rightTrackModel[164].rotateAngleX = 0.2443461F;
		rightTrackModel[164].rotateAngleY = -3.14159265F;
		rightTrackModel[164].rotateAngleZ = 4.27605667F;

		rightTrackModel[165].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 165
		rightTrackModel[165].setRotationPoint(-4.5F, 2.4F, -21.5F);
		rightTrackModel[165].rotateAngleX = -0.2443461F;
		rightTrackModel[165].rotateAngleY = -3.14159265F;
		rightTrackModel[165].rotateAngleZ = 5.06145483F;

		rightTrackModel[166].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 166
		rightTrackModel[166].setRotationPoint(-4.5F, 2.4F, -21.5F);
		rightTrackModel[166].rotateAngleX = 0.2443461F;
		rightTrackModel[166].rotateAngleY = -3.14159265F;
		rightTrackModel[166].rotateAngleZ = 5.06145483F;

		rightTrackModel[167].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 167
		rightTrackModel[167].setRotationPoint(-4.5F, 2.4F, -21.5F);
		rightTrackModel[167].rotateAngleX = -0.2443461F;
		rightTrackModel[167].rotateAngleY = -3.14159265F;
		rightTrackModel[167].rotateAngleZ = 5.84685299F;

		rightTrackModel[168].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 168
		rightTrackModel[168].setRotationPoint(-4.5F, 2.4F, -21.5F);
		rightTrackModel[168].rotateAngleX = 0.2443461F;
		rightTrackModel[168].rotateAngleY = -3.14159265F;
		rightTrackModel[168].rotateAngleZ = 5.84685299F;

		rightTrackModel[169].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 169
		rightTrackModel[169].setRotationPoint(-4.5F, 2.4F, -21.5F);
		rightTrackModel[169].rotateAngleX = -0.2443461F;
		rightTrackModel[169].rotateAngleY = -3.14159265F;
		rightTrackModel[169].rotateAngleZ = 0.34906585F;

		rightTrackModel[170].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 170
		rightTrackModel[170].setRotationPoint(-4.5F, 2.4F, -21.5F);
		rightTrackModel[170].rotateAngleX = 0.2443461F;
		rightTrackModel[170].rotateAngleY = -3.14159265F;
		rightTrackModel[170].rotateAngleZ = 0.34906585F;

		rightTrackModel[171].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 171
		rightTrackModel[171].setRotationPoint(-4.5F, 2.4F, -21.5F);
		rightTrackModel[171].rotateAngleX = -0.2443461F;
		rightTrackModel[171].rotateAngleY = -3.14159265F;
		rightTrackModel[171].rotateAngleZ = 1.13446401F;

		rightTrackModel[172].addShapeBox(-1F, -1F, 8F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		rightTrackModel[172].setRotationPoint(-19F, 2.4F, -30F);

		rightTrackModel[173].addShapeBox(-1.5F, -6.15F, 0F, 3, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 182
		rightTrackModel[173].setRotationPoint(-19F, 2.4F, -30.4F);
		rightTrackModel[173].rotateAngleZ = 6.28318531F;

		rightTrackModel[174].addShapeBox(-1F, -1F, 8F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		rightTrackModel[174].setRotationPoint(-34F, 2.4F, -30F);

		rightTrackModel[175].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 216
		rightTrackModel[175].setRotationPoint(-34F, 2.4F, -30.4F);
		rightTrackModel[175].rotateAngleZ = 5.72467995F;

		rightTrackModel[176].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 217
		rightTrackModel[176].setRotationPoint(-34F, 2.4F, -30.4F);
		rightTrackModel[176].rotateAngleZ = 5.07890812F;

		rightTrackModel[177].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 218
		rightTrackModel[177].setRotationPoint(-34F, 2.4F, -30.4F);
		rightTrackModel[177].rotateAngleZ = 4.4331363F;

		rightTrackModel[178].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 219
		rightTrackModel[178].setRotationPoint(-34F, 2.4F, -30.4F);
		rightTrackModel[178].rotateAngleZ = 3.78736448F;

		rightTrackModel[179].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 220
		rightTrackModel[179].setRotationPoint(-34F, 2.4F, -30.4F);
		rightTrackModel[179].rotateAngleZ = 3.14159265F;

		rightTrackModel[180].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 221
		rightTrackModel[180].setRotationPoint(-34F, 2.4F, -30.4F);
		rightTrackModel[180].rotateAngleZ = 2.49582083F;

		rightTrackModel[181].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 222
		rightTrackModel[181].setRotationPoint(-34F, 2.4F, -30.4F);
		rightTrackModel[181].rotateAngleZ = 1.85004901F;

		rightTrackModel[182].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 223
		rightTrackModel[182].setRotationPoint(-34F, 2.4F, -30.4F);
		rightTrackModel[182].rotateAngleZ = 1.20427718F;

		rightTrackModel[183].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 224
		rightTrackModel[183].setRotationPoint(-34F, 2.4F, -30.4F);
		rightTrackModel[183].rotateAngleZ = 0.55850536F;

		rightTrackModel[184].addShapeBox(-1.5F, -6.15F, 0F, 3, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 225
		rightTrackModel[184].setRotationPoint(-34F, 2.4F, -30.4F);
		rightTrackModel[184].rotateAngleZ = 6.28318531F;

		rightTrackModel[185].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 226
		rightTrackModel[185].setRotationPoint(-34F, 2.4F, -30F);
		rightTrackModel[185].rotateAngleX = -0.2443461F;
		rightTrackModel[185].rotateAngleZ = 1.97222205F;

		rightTrackModel[186].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 227
		rightTrackModel[186].setRotationPoint(-34F, 2.4F, -30F);
		rightTrackModel[186].rotateAngleX = 0.2443461F;
		rightTrackModel[186].rotateAngleZ = 1.18682389F;

		rightTrackModel[187].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 228
		rightTrackModel[187].setRotationPoint(-34F, 2.4F, -30F);
		rightTrackModel[187].rotateAngleX = -0.2443461F;
		rightTrackModel[187].rotateAngleZ = 2.75762022F;

		rightTrackModel[188].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 229
		rightTrackModel[188].setRotationPoint(-34F, 2.4F, -30F);
		rightTrackModel[188].rotateAngleX = 0.36651914F;
		rightTrackModel[188].rotateAngleZ = 1.97222205F;

		rightTrackModel[189].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 230
		rightTrackModel[189].setRotationPoint(-34F, 2.4F, -30F);
		rightTrackModel[189].rotateAngleX = -0.2443461F;
		rightTrackModel[189].rotateAngleZ = 3.54301838F;

		rightTrackModel[190].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 231
		rightTrackModel[190].setRotationPoint(-34F, 2.4F, -30F);
		rightTrackModel[190].rotateAngleX = 0.2443461F;
		rightTrackModel[190].rotateAngleZ = 2.75762022F;

		rightTrackModel[191].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 232
		rightTrackModel[191].setRotationPoint(-34F, 2.4F, -30F);
		rightTrackModel[191].rotateAngleX = -0.2443461F;
		rightTrackModel[191].rotateAngleZ = 4.32841654F;

		rightTrackModel[192].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 233
		rightTrackModel[192].setRotationPoint(-34F, 2.4F, -30F);
		rightTrackModel[192].rotateAngleX = 0.2443461F;
		rightTrackModel[192].rotateAngleZ = 3.54301838F;

		rightTrackModel[193].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 234
		rightTrackModel[193].setRotationPoint(-34F, 2.4F, -30F);
		rightTrackModel[193].rotateAngleX = 0.2443461F;
		rightTrackModel[193].rotateAngleZ = 4.32841654F;

		rightTrackModel[194].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 235
		rightTrackModel[194].setRotationPoint(-34F, 2.4F, -30F);
		rightTrackModel[194].rotateAngleX = -0.2443461F;
		rightTrackModel[194].rotateAngleZ = 5.11381471F;

		rightTrackModel[195].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 236
		rightTrackModel[195].setRotationPoint(-34F, 2.4F, -30F);
		rightTrackModel[195].rotateAngleX = -0.2443461F;
		rightTrackModel[195].rotateAngleZ = 5.89921287F;

		rightTrackModel[196].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 237
		rightTrackModel[196].setRotationPoint(-34F, 2.4F, -30F);
		rightTrackModel[196].rotateAngleX = 0.2443461F;
		rightTrackModel[196].rotateAngleZ = 5.11381471F;

		rightTrackModel[197].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 238
		rightTrackModel[197].setRotationPoint(-34F, 2.4F, -30F);
		rightTrackModel[197].rotateAngleX = 0.2443461F;
		rightTrackModel[197].rotateAngleZ = 5.89921287F;

		rightTrackModel[198].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 239
		rightTrackModel[198].setRotationPoint(-34F, 2.4F, -30F);
		rightTrackModel[198].rotateAngleX = -0.2443461F;
		rightTrackModel[198].rotateAngleZ = 0.40142573F;

		rightTrackModel[199].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 240
		rightTrackModel[199].setRotationPoint(-34F, 2.4F, -30F);
		rightTrackModel[199].rotateAngleX = 0.2443461F;
		rightTrackModel[199].rotateAngleZ = 0.40142573F;

		rightTrackModel[200].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 241
		rightTrackModel[200].setRotationPoint(-34F, 2.4F, -30F);
		rightTrackModel[200].rotateAngleX = -0.2443461F;
		rightTrackModel[200].rotateAngleZ = 1.18682389F;

		rightTrackModel[201].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 242
		rightTrackModel[201].setRotationPoint(-34F, 2.4F, -21.5F);
		rightTrackModel[201].rotateAngleX = -0.2443461F;
		rightTrackModel[201].rotateAngleY = -3.14159265F;
		rightTrackModel[201].rotateAngleZ = 1.91986218F;

		rightTrackModel[202].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 243
		rightTrackModel[202].setRotationPoint(-34F, 2.4F, -21.5F);
		rightTrackModel[202].rotateAngleX = 0.2443461F;
		rightTrackModel[202].rotateAngleY = -3.14159265F;
		rightTrackModel[202].rotateAngleZ = 1.13446401F;

		rightTrackModel[203].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 244
		rightTrackModel[203].setRotationPoint(-34F, 2.4F, -21.5F);
		rightTrackModel[203].rotateAngleX = -0.2443461F;
		rightTrackModel[203].rotateAngleY = -3.14159265F;
		rightTrackModel[203].rotateAngleZ = 2.70526034F;

		rightTrackModel[204].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 245
		rightTrackModel[204].setRotationPoint(-34F, 2.4F, -21.5F);
		rightTrackModel[204].rotateAngleX = 0.36651914F;
		rightTrackModel[204].rotateAngleY = -3.14159265F;
		rightTrackModel[204].rotateAngleZ = 1.91986218F;

		rightTrackModel[205].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 246
		rightTrackModel[205].setRotationPoint(-34F, 2.4F, -21.5F);
		rightTrackModel[205].rotateAngleX = -0.2443461F;
		rightTrackModel[205].rotateAngleY = -3.14159265F;
		rightTrackModel[205].rotateAngleZ = 3.4906585F;

		rightTrackModel[206].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 247
		rightTrackModel[206].setRotationPoint(-34F, 2.4F, -21.5F);
		rightTrackModel[206].rotateAngleX = 0.2443461F;
		rightTrackModel[206].rotateAngleY = -3.14159265F;
		rightTrackModel[206].rotateAngleZ = 2.70526034F;

		rightTrackModel[207].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 248
		rightTrackModel[207].setRotationPoint(-34F, 2.4F, -21.5F);
		rightTrackModel[207].rotateAngleX = 0.2443461F;
		rightTrackModel[207].rotateAngleY = -3.14159265F;
		rightTrackModel[207].rotateAngleZ = 3.4906585F;

		rightTrackModel[208].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 249
		rightTrackModel[208].setRotationPoint(-34F, 2.4F, -21.5F);
		rightTrackModel[208].rotateAngleX = -0.2443461F;
		rightTrackModel[208].rotateAngleY = -3.14159265F;
		rightTrackModel[208].rotateAngleZ = 4.27605667F;

		rightTrackModel[209].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 250
		rightTrackModel[209].setRotationPoint(-34F, 2.4F, -21.5F);
		rightTrackModel[209].rotateAngleX = 0.2443461F;
		rightTrackModel[209].rotateAngleY = -3.14159265F;
		rightTrackModel[209].rotateAngleZ = 4.27605667F;

		rightTrackModel[210].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 251
		rightTrackModel[210].setRotationPoint(-34F, 2.4F, -21.5F);
		rightTrackModel[210].rotateAngleX = -0.2443461F;
		rightTrackModel[210].rotateAngleY = -3.14159265F;
		rightTrackModel[210].rotateAngleZ = 5.06145483F;

		rightTrackModel[211].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 252
		rightTrackModel[211].setRotationPoint(-34F, 2.4F, -21.5F);
		rightTrackModel[211].rotateAngleX = 0.2443461F;
		rightTrackModel[211].rotateAngleY = -3.14159265F;
		rightTrackModel[211].rotateAngleZ = 5.06145483F;

		rightTrackModel[212].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 253
		rightTrackModel[212].setRotationPoint(-34F, 2.4F, -21.5F);
		rightTrackModel[212].rotateAngleX = -0.2443461F;
		rightTrackModel[212].rotateAngleY = -3.14159265F;
		rightTrackModel[212].rotateAngleZ = 5.84685299F;

		rightTrackModel[213].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 254
		rightTrackModel[213].setRotationPoint(-34F, 2.4F, -21.5F);
		rightTrackModel[213].rotateAngleX = 0.2443461F;
		rightTrackModel[213].rotateAngleY = -3.14159265F;
		rightTrackModel[213].rotateAngleZ = 5.84685299F;

		rightTrackModel[214].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 255
		rightTrackModel[214].setRotationPoint(-34F, 2.4F, -21.5F);
		rightTrackModel[214].rotateAngleX = -0.2443461F;
		rightTrackModel[214].rotateAngleY = -3.14159265F;
		rightTrackModel[214].rotateAngleZ = 0.34906585F;

		rightTrackModel[215].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 256
		rightTrackModel[215].setRotationPoint(-34F, 2.4F, -21.5F);
		rightTrackModel[215].rotateAngleX = 0.2443461F;
		rightTrackModel[215].rotateAngleY = -3.14159265F;
		rightTrackModel[215].rotateAngleZ = 0.34906585F;

		rightTrackModel[216].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 257
		rightTrackModel[216].setRotationPoint(-34F, 2.4F, -21.5F);
		rightTrackModel[216].rotateAngleX = -0.2443461F;
		rightTrackModel[216].rotateAngleY = -3.14159265F;
		rightTrackModel[216].rotateAngleZ = 1.13446401F;

		rightTrackModel[217].addShapeBox(-1F, -1F, 8F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		rightTrackModel[217].setRotationPoint(-49F, -3.3F, -30F);

		rightTrackModel[218].addShapeBox(-2F, -6F, 0F, 4, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 259
		rightTrackModel[218].setRotationPoint(-49F, -3.3F, -30.4F);
		rightTrackModel[218].rotateAngleZ = 5.72467995F;

		rightTrackModel[219].addShapeBox(-2F, -6F, 0F, 4, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 260
		rightTrackModel[219].setRotationPoint(-49F, -3.3F, -30.4F);
		rightTrackModel[219].rotateAngleZ = 5.07890812F;

		rightTrackModel[220].addShapeBox(-2F, -6F, 0F, 4, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 261
		rightTrackModel[220].setRotationPoint(-49F, -3.3F, -30.4F);
		rightTrackModel[220].rotateAngleZ = 4.4331363F;

		rightTrackModel[221].addShapeBox(-2F, -6F, 0F, 4, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 262
		rightTrackModel[221].setRotationPoint(-49F, -3.3F, -30.4F);
		rightTrackModel[221].rotateAngleZ = 3.78736448F;

		rightTrackModel[222].addShapeBox(-2F, -6F, 0F, 4, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 263
		rightTrackModel[222].setRotationPoint(-49F, -3.3F, -30.4F);
		rightTrackModel[222].rotateAngleZ = 3.14159265F;

		rightTrackModel[223].addShapeBox(-2F, -6F, 0F, 4, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 264
		rightTrackModel[223].setRotationPoint(-49F, -3.3F, -30.4F);
		rightTrackModel[223].rotateAngleZ = 2.49582083F;

		rightTrackModel[224].addShapeBox(-2F, -6F, 0F, 4, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 265
		rightTrackModel[224].setRotationPoint(-49F, -3.3F, -30.4F);
		rightTrackModel[224].rotateAngleZ = 1.85004901F;

		rightTrackModel[225].addShapeBox(-2F, -6F, 0F, 4, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 266
		rightTrackModel[225].setRotationPoint(-49F, -3.3F, -30.4F);
		rightTrackModel[225].rotateAngleZ = 1.20427718F;

		rightTrackModel[226].addShapeBox(-2F, -6F, 0F, 4, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 267
		rightTrackModel[226].setRotationPoint(-49F, -3.3F, -30.4F);
		rightTrackModel[226].rotateAngleZ = 0.55850536F;

		rightTrackModel[227].addShapeBox(-1.5F, -6.15F, 0F, 3, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 268
		rightTrackModel[227].setRotationPoint(-49F, -3.3F, -30.4F);
		rightTrackModel[227].rotateAngleZ = 6.28318531F;

		rightTrackModel[228].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 269
		rightTrackModel[228].setRotationPoint(-49F, -3.3F, -30F);
		rightTrackModel[228].rotateAngleX = -0.2443461F;
		rightTrackModel[228].rotateAngleZ = 1.97222205F;

		rightTrackModel[229].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 270
		rightTrackModel[229].setRotationPoint(-49F, -3.3F, -30F);
		rightTrackModel[229].rotateAngleX = 0.2443461F;
		rightTrackModel[229].rotateAngleZ = 1.18682389F;

		rightTrackModel[230].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 271
		rightTrackModel[230].setRotationPoint(-49F, -3.3F, -30F);
		rightTrackModel[230].rotateAngleX = -0.2443461F;
		rightTrackModel[230].rotateAngleZ = 2.75762022F;

		rightTrackModel[231].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 272
		rightTrackModel[231].setRotationPoint(-49F, -3.3F, -30F);
		rightTrackModel[231].rotateAngleX = 0.36651914F;
		rightTrackModel[231].rotateAngleZ = 1.97222205F;

		rightTrackModel[232].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 273
		rightTrackModel[232].setRotationPoint(-49F, -3.3F, -30F);
		rightTrackModel[232].rotateAngleX = -0.2443461F;
		rightTrackModel[232].rotateAngleZ = 3.54301838F;

		rightTrackModel[233].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 274
		rightTrackModel[233].setRotationPoint(-49F, -3.3F, -30F);
		rightTrackModel[233].rotateAngleX = 0.2443461F;
		rightTrackModel[233].rotateAngleZ = 2.75762022F;

		rightTrackModel[234].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 275
		rightTrackModel[234].setRotationPoint(-49F, -3.3F, -30F);
		rightTrackModel[234].rotateAngleX = -0.2443461F;
		rightTrackModel[234].rotateAngleZ = 4.32841654F;

		rightTrackModel[235].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 276
		rightTrackModel[235].setRotationPoint(-49F, -3.3F, -30F);
		rightTrackModel[235].rotateAngleX = 0.2443461F;
		rightTrackModel[235].rotateAngleZ = 3.54301838F;

		rightTrackModel[236].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 277
		rightTrackModel[236].setRotationPoint(-49F, -3.3F, -30F);
		rightTrackModel[236].rotateAngleX = 0.2443461F;
		rightTrackModel[236].rotateAngleZ = 4.32841654F;

		rightTrackModel[237].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 278
		rightTrackModel[237].setRotationPoint(-49F, -3.3F, -30F);
		rightTrackModel[237].rotateAngleX = -0.2443461F;
		rightTrackModel[237].rotateAngleZ = 5.11381471F;

		rightTrackModel[238].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 279
		rightTrackModel[238].setRotationPoint(-49F, -3.3F, -30F);
		rightTrackModel[238].rotateAngleX = -0.2443461F;
		rightTrackModel[238].rotateAngleZ = 5.89921287F;

		rightTrackModel[239].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 280
		rightTrackModel[239].setRotationPoint(-49F, -3.3F, -30F);
		rightTrackModel[239].rotateAngleX = 0.2443461F;
		rightTrackModel[239].rotateAngleZ = 5.11381471F;

		rightTrackModel[240].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 281
		rightTrackModel[240].setRotationPoint(-49F, -3.3F, -30F);
		rightTrackModel[240].rotateAngleX = 0.2443461F;
		rightTrackModel[240].rotateAngleZ = 5.89921287F;

		rightTrackModel[241].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 282
		rightTrackModel[241].setRotationPoint(-49F, -3.3F, -30F);
		rightTrackModel[241].rotateAngleX = -0.2443461F;
		rightTrackModel[241].rotateAngleZ = 0.40142573F;

		rightTrackModel[242].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 283
		rightTrackModel[242].setRotationPoint(-49F, -3.3F, -30F);
		rightTrackModel[242].rotateAngleX = 0.2443461F;
		rightTrackModel[242].rotateAngleZ = 0.40142573F;

		rightTrackModel[243].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 284
		rightTrackModel[243].setRotationPoint(-49F, -3.3F, -30F);
		rightTrackModel[243].rotateAngleX = -0.2443461F;
		rightTrackModel[243].rotateAngleZ = 1.18682389F;

		rightTrackModel[244].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 285
		rightTrackModel[244].setRotationPoint(-49F, -3.3F, -18.5F);
		rightTrackModel[244].rotateAngleX = -0.2443461F;
		rightTrackModel[244].rotateAngleY = -3.14159265F;
		rightTrackModel[244].rotateAngleZ = 1.91986218F;

		rightTrackModel[245].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 286
		rightTrackModel[245].setRotationPoint(-49F, -3.3F, -18.5F);
		rightTrackModel[245].rotateAngleX = 0.2443461F;
		rightTrackModel[245].rotateAngleY = -3.14159265F;
		rightTrackModel[245].rotateAngleZ = 1.13446401F;

		rightTrackModel[246].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 287
		rightTrackModel[246].setRotationPoint(-49F, -3.3F, -18.5F);
		rightTrackModel[246].rotateAngleX = -0.2443461F;
		rightTrackModel[246].rotateAngleY = -3.14159265F;
		rightTrackModel[246].rotateAngleZ = 2.70526034F;

		rightTrackModel[247].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 288
		rightTrackModel[247].setRotationPoint(-49F, -3.3F, -18.5F);
		rightTrackModel[247].rotateAngleX = 0.36651914F;
		rightTrackModel[247].rotateAngleY = -3.14159265F;
		rightTrackModel[247].rotateAngleZ = 1.91986218F;

		rightTrackModel[248].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 289
		rightTrackModel[248].setRotationPoint(-49F, -3.3F, -18.5F);
		rightTrackModel[248].rotateAngleX = -0.2443461F;
		rightTrackModel[248].rotateAngleY = -3.14159265F;
		rightTrackModel[248].rotateAngleZ = 3.4906585F;

		rightTrackModel[249].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 290
		rightTrackModel[249].setRotationPoint(-49F, -3.3F, -18.5F);
		rightTrackModel[249].rotateAngleX = 0.2443461F;
		rightTrackModel[249].rotateAngleY = -3.14159265F;
		rightTrackModel[249].rotateAngleZ = 2.70526034F;

		rightTrackModel[250].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 291
		rightTrackModel[250].setRotationPoint(-49F, -3.3F, -18.5F);
		rightTrackModel[250].rotateAngleX = 0.2443461F;
		rightTrackModel[250].rotateAngleY = -3.14159265F;
		rightTrackModel[250].rotateAngleZ = 3.4906585F;

		rightTrackModel[251].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 292
		rightTrackModel[251].setRotationPoint(-49F, -3.3F, -18.5F);
		rightTrackModel[251].rotateAngleX = -0.2443461F;
		rightTrackModel[251].rotateAngleY = -3.14159265F;
		rightTrackModel[251].rotateAngleZ = 4.27605667F;

		rightTrackModel[252].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 293
		rightTrackModel[252].setRotationPoint(-49F, -3.3F, -18.5F);
		rightTrackModel[252].rotateAngleX = 0.2443461F;
		rightTrackModel[252].rotateAngleY = -3.14159265F;
		rightTrackModel[252].rotateAngleZ = 4.27605667F;

		rightTrackModel[253].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 294
		rightTrackModel[253].setRotationPoint(-49F, -3.3F, -18.5F);
		rightTrackModel[253].rotateAngleX = -0.2443461F;
		rightTrackModel[253].rotateAngleY = -3.14159265F;
		rightTrackModel[253].rotateAngleZ = 5.06145483F;

		rightTrackModel[254].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 295
		rightTrackModel[254].setRotationPoint(-49F, -3.3F, -18.5F);
		rightTrackModel[254].rotateAngleX = 0.2443461F;
		rightTrackModel[254].rotateAngleY = -3.14159265F;
		rightTrackModel[254].rotateAngleZ = 5.06145483F;

		rightTrackModel[255].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 296
		rightTrackModel[255].setRotationPoint(-49F, -3.3F, -18.5F);
		rightTrackModel[255].rotateAngleX = -0.2443461F;
		rightTrackModel[255].rotateAngleY = -3.14159265F;
		rightTrackModel[255].rotateAngleZ = 5.84685299F;

		rightTrackModel[256].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 297
		rightTrackModel[256].setRotationPoint(-49F, -3.3F, -18.5F);
		rightTrackModel[256].rotateAngleX = 0.2443461F;
		rightTrackModel[256].rotateAngleY = -3.14159265F;
		rightTrackModel[256].rotateAngleZ = 5.84685299F;

		rightTrackModel[257].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 298
		rightTrackModel[257].setRotationPoint(-49F, -3.3F, -18.5F);
		rightTrackModel[257].rotateAngleX = -0.2443461F;
		rightTrackModel[257].rotateAngleY = -3.14159265F;
		rightTrackModel[257].rotateAngleZ = 0.34906585F;

		rightTrackModel[258].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 299
		rightTrackModel[258].setRotationPoint(-49F, -3.3F, -18.5F);
		rightTrackModel[258].rotateAngleX = 0.2443461F;
		rightTrackModel[258].rotateAngleY = -3.14159265F;
		rightTrackModel[258].rotateAngleZ = 0.34906585F;

		rightTrackModel[259].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 300
		rightTrackModel[259].setRotationPoint(-49F, -3.3F, -18.5F);
		rightTrackModel[259].rotateAngleX = -0.2443461F;
		rightTrackModel[259].rotateAngleY = -3.14159265F;
		rightTrackModel[259].rotateAngleZ = 1.13446401F;

		rightTrackModel[260].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 645
		rightTrackModel[260].setRotationPoint(52.5F, -3F, -29.4F);
		rightTrackModel[260].rotateAngleZ = -0.19198622F;

		rightTrackModel[261].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 646
		rightTrackModel[261].setRotationPoint(52.5F, -3F, -29.4F);
		rightTrackModel[261].rotateAngleZ = 0.45378561F;

		rightTrackModel[262].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 647
		rightTrackModel[262].setRotationPoint(52.5F, -3F, -29.4F);
		rightTrackModel[262].rotateAngleZ = 1.09955743F;

		rightTrackModel[263].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 648
		rightTrackModel[263].setRotationPoint(52.5F, -3F, -29.4F);
		rightTrackModel[263].rotateAngleZ = 1.74532925F;

		rightTrackModel[264].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 649
		rightTrackModel[264].setRotationPoint(52.5F, -3F, -29.4F);
		rightTrackModel[264].rotateAngleZ = 2.39110108F;

		rightTrackModel[265].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 650
		rightTrackModel[265].setRotationPoint(52.5F, -3F, -29.4F);
		rightTrackModel[265].rotateAngleZ = 3.0368729F;

		rightTrackModel[266].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 651
		rightTrackModel[266].setRotationPoint(52.5F, -3F, -29.4F);
		rightTrackModel[266].rotateAngleZ = 3.68264472F;

		rightTrackModel[267].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 652
		rightTrackModel[267].setRotationPoint(52.5F, -3F, -29.4F);
		rightTrackModel[267].rotateAngleZ = 4.32841654F;

		rightTrackModel[268].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 653
		rightTrackModel[268].setRotationPoint(52.5F, -3F, -29.4F);
		rightTrackModel[268].rotateAngleZ = 4.97418837F;

		rightTrackModel[269].addShapeBox(-1.5F, -6.15F, 0F, 3, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 654
		rightTrackModel[269].setRotationPoint(52.5F, -3F, -29.4F);
		rightTrackModel[269].rotateAngleZ = 5.53269373F;

		rightTrackModel[270].addShapeBox(-1F, -1F, 9F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 655
		rightTrackModel[270].setRotationPoint(52.5F, -3F, -29F);
		rightTrackModel[270].rotateAngleZ = -0.75049158F;

		rightTrackModel[271].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 656
		rightTrackModel[271].setRotationPoint(52.5F, -3F, -20.5F);
		rightTrackModel[271].rotateAngleX = -0.2443461F;
		rightTrackModel[271].rotateAngleY = -3.14159265F;
		rightTrackModel[271].rotateAngleZ = 1.1693706F;

		rightTrackModel[272].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 657
		rightTrackModel[272].setRotationPoint(52.5F, -3F, -20.5F);
		rightTrackModel[272].rotateAngleX = 0.2443461F;
		rightTrackModel[272].rotateAngleY = -3.14159265F;
		rightTrackModel[272].rotateAngleZ = 0.38397244F;

		rightTrackModel[273].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 658
		rightTrackModel[273].setRotationPoint(52.5F, -3F, -20.5F);
		rightTrackModel[273].rotateAngleX = 0.2443461F;
		rightTrackModel[273].rotateAngleY = -3.14159265F;
		rightTrackModel[273].rotateAngleZ = -0.40142573F;

		rightTrackModel[274].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 659
		rightTrackModel[274].setRotationPoint(52.5F, -3F, -20.5F);
		rightTrackModel[274].rotateAngleX = -0.2443461F;
		rightTrackModel[274].rotateAngleY = -3.14159265F;
		rightTrackModel[274].rotateAngleZ = 0.38397244F;

		rightTrackModel[275].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 660
		rightTrackModel[275].setRotationPoint(52.5F, -3F, -20.5F);
		rightTrackModel[275].rotateAngleX = 0.2443461F;
		rightTrackModel[275].rotateAngleY = -3.14159265F;
		rightTrackModel[275].rotateAngleZ = 5.09636142F;

		rightTrackModel[276].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 661
		rightTrackModel[276].setRotationPoint(52.5F, -3F, -20.5F);
		rightTrackModel[276].rotateAngleX = -0.2443461F;
		rightTrackModel[276].rotateAngleY = -3.14159265F;
		rightTrackModel[276].rotateAngleZ = -0.40142573F;

		rightTrackModel[277].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 662
		rightTrackModel[277].setRotationPoint(52.5F, -3F, -20.5F);
		rightTrackModel[277].rotateAngleX = 0.2443461F;
		rightTrackModel[277].rotateAngleY = -3.14159265F;
		rightTrackModel[277].rotateAngleZ = 4.31096325F;

		rightTrackModel[278].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 663
		rightTrackModel[278].setRotationPoint(52.5F, -3F, -20.5F);
		rightTrackModel[278].rotateAngleX = -0.2443461F;
		rightTrackModel[278].rotateAngleY = -3.14159265F;
		rightTrackModel[278].rotateAngleZ = 5.09636142F;

		rightTrackModel[279].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 664
		rightTrackModel[279].setRotationPoint(52.5F, -3F, -20.5F);
		rightTrackModel[279].rotateAngleX = -0.2443461F;
		rightTrackModel[279].rotateAngleY = -3.14159265F;
		rightTrackModel[279].rotateAngleZ = 4.31096325F;

		rightTrackModel[280].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 665
		rightTrackModel[280].setRotationPoint(52.5F, -3F, -20.5F);
		rightTrackModel[280].rotateAngleX = 0.2443461F;
		rightTrackModel[280].rotateAngleY = -3.14159265F;
		rightTrackModel[280].rotateAngleZ = 3.52556509F;

		rightTrackModel[281].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 666
		rightTrackModel[281].setRotationPoint(52.5F, -3F, -20.5F);
		rightTrackModel[281].rotateAngleX = -0.2443461F;
		rightTrackModel[281].rotateAngleY = -3.14159265F;
		rightTrackModel[281].rotateAngleZ = 3.52556509F;

		rightTrackModel[282].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 667
		rightTrackModel[282].setRotationPoint(52.5F, -3F, -20.5F);
		rightTrackModel[282].rotateAngleX = 0.2443461F;
		rightTrackModel[282].rotateAngleY = -3.14159265F;
		rightTrackModel[282].rotateAngleZ = 2.74016693F;

		rightTrackModel[283].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 668
		rightTrackModel[283].setRotationPoint(52.5F, -3F, -20.5F);
		rightTrackModel[283].rotateAngleX = 0.2443461F;
		rightTrackModel[283].rotateAngleY = -3.14159265F;
		rightTrackModel[283].rotateAngleZ = 1.95476876F;

		rightTrackModel[284].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 669
		rightTrackModel[284].setRotationPoint(52.5F, -3F, -20.5F);
		rightTrackModel[284].rotateAngleX = -0.2443461F;
		rightTrackModel[284].rotateAngleY = -3.14159265F;
		rightTrackModel[284].rotateAngleZ = 2.74016693F;

		rightTrackModel[285].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 670
		rightTrackModel[285].setRotationPoint(52.5F, -3F, -20.5F);
		rightTrackModel[285].rotateAngleX = 0.36651914F;
		rightTrackModel[285].rotateAngleY = -3.14159265F;
		rightTrackModel[285].rotateAngleZ = 1.1693706F;

		rightTrackModel[286].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 671
		rightTrackModel[286].setRotationPoint(52.5F, -3F, -20.5F);
		rightTrackModel[286].rotateAngleX = -0.2443461F;
		rightTrackModel[286].rotateAngleY = -3.14159265F;
		rightTrackModel[286].rotateAngleZ = 1.95476876F;

		rightTrackModel[287].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 672
		rightTrackModel[287].setRotationPoint(52.5F, -3F, -29F);
		rightTrackModel[287].rotateAngleX = 0.36651914F;
		rightTrackModel[287].rotateAngleZ = 1.22173048F;

		rightTrackModel[288].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 673
		rightTrackModel[288].setRotationPoint(52.5F, -3F, -29F);
		rightTrackModel[288].rotateAngleX = -0.2443461F;
		rightTrackModel[288].rotateAngleZ = 2.00712864F;

		rightTrackModel[289].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 674
		rightTrackModel[289].setRotationPoint(52.5F, -3F, -29F);
		rightTrackModel[289].rotateAngleX = 0.2443461F;
		rightTrackModel[289].rotateAngleZ = 0.43633231F;

		rightTrackModel[290].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 675
		rightTrackModel[290].setRotationPoint(52.5F, -3F, -29F);
		rightTrackModel[290].rotateAngleX = -0.2443461F;
		rightTrackModel[290].rotateAngleZ = 1.22173048F;

		rightTrackModel[291].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 676
		rightTrackModel[291].setRotationPoint(52.5F, -3F, -29F);
		rightTrackModel[291].rotateAngleX = 0.2443461F;
		rightTrackModel[291].rotateAngleZ = -0.34906585F;

		rightTrackModel[292].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 677
		rightTrackModel[292].setRotationPoint(52.5F, -3F, -29F);
		rightTrackModel[292].rotateAngleX = -0.2443461F;
		rightTrackModel[292].rotateAngleZ = 0.43633231F;

		rightTrackModel[293].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 678
		rightTrackModel[293].setRotationPoint(52.5F, -3F, -29F);
		rightTrackModel[293].rotateAngleX = 0.2443461F;
		rightTrackModel[293].rotateAngleZ = 5.14872129F;

		rightTrackModel[294].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 679
		rightTrackModel[294].setRotationPoint(52.5F, -3F, -29F);
		rightTrackModel[294].rotateAngleX = -0.2443461F;
		rightTrackModel[294].rotateAngleZ = -0.34906585F;

		rightTrackModel[295].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 680
		rightTrackModel[295].setRotationPoint(52.5F, -3F, -29F);
		rightTrackModel[295].rotateAngleX = 0.2443461F;
		rightTrackModel[295].rotateAngleZ = 4.36332313F;

		rightTrackModel[296].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 681
		rightTrackModel[296].setRotationPoint(52.5F, -3F, -29F);
		rightTrackModel[296].rotateAngleX = -0.2443461F;
		rightTrackModel[296].rotateAngleZ = 5.14872129F;

		rightTrackModel[297].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 682
		rightTrackModel[297].setRotationPoint(52.5F, -3F, -29F);
		rightTrackModel[297].rotateAngleX = 0.2443461F;
		rightTrackModel[297].rotateAngleZ = 3.57792497F;

		rightTrackModel[298].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 683
		rightTrackModel[298].setRotationPoint(52.5F, -3F, -29F);
		rightTrackModel[298].rotateAngleX = -0.2443461F;
		rightTrackModel[298].rotateAngleZ = 4.36332313F;

		rightTrackModel[299].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 684
		rightTrackModel[299].setRotationPoint(52.5F, -3F, -29F);
		rightTrackModel[299].rotateAngleX = 0.2443461F;
		rightTrackModel[299].rotateAngleZ = 2.7925268F;

		rightTrackModel[300].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 685
		rightTrackModel[300].setRotationPoint(52.5F, -3F, -29F);
		rightTrackModel[300].rotateAngleX = -0.2443461F;
		rightTrackModel[300].rotateAngleZ = 3.57792497F;

		rightTrackModel[301].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 686
		rightTrackModel[301].setRotationPoint(52.5F, -3F, -29F);
		rightTrackModel[301].rotateAngleX = 0.2443461F;
		rightTrackModel[301].rotateAngleZ = 2.00712864F;

		rightTrackModel[302].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 687
		rightTrackModel[302].setRotationPoint(52.5F, -3F, -29F);
		rightTrackModel[302].rotateAngleX = -0.2443461F;
		rightTrackModel[302].rotateAngleZ = 2.7925268F;

		rightTrackModel[303].addShapeBox(-2F, -6F, 0F, 76, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 825
		rightTrackModel[303].setRotationPoint(37.5F, 3.4F, -30.4F);
		rightTrackModel[303].rotateAngleZ = 3.14159265F;

		rightTrackModel[304].addShapeBox(0F, -1F, 0F, 18, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 828
		rightTrackModel[304].setRotationPoint(-35.5F, 8.4F, -30.4F);
		rightTrackModel[304].rotateAngleZ = 2.74016693F;

		rightTrackModel[305].addShapeBox(-0.5F, -7F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 829
		rightTrackModel[305].setRotationPoint(-49F, -3.3F, -30.4F);

		rightTrackModel[306].addShapeBox(-2F, -6F, 0F, 104, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 894
		rightTrackModel[306].setRotationPoint(52.5F, -15F, -30.4F);
		rightTrackModel[306].rotateAngleZ = 3.13722933F;

		rightTrackModel[307].addShapeBox(-1F, -7F, 0F, 2, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 896
		rightTrackModel[307].setRotationPoint(-48.8F, -3.4F, -30.4F);
		rightTrackModel[307].rotateAngleZ = 2.74016693F;

		rightTrackModel[308].addShapeBox(-1F, -7F, 0F, 2, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 897
		rightTrackModel[308].setRotationPoint(-48.8F, -3.4F, -30.4F);
		rightTrackModel[308].rotateAngleZ = 2.46091425F;

		rightTrackModel[309].addShapeBox(-1F, -7F, 0F, 2, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 898
		rightTrackModel[309].setRotationPoint(-48.8F, -3.4F, -30.4F);
		rightTrackModel[309].rotateAngleZ = 2.18166156F;

		rightTrackModel[310].addShapeBox(-1F, -7F, 0F, 2, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 899
		rightTrackModel[310].setRotationPoint(-48.8F, -3.4F, -30.4F);
		rightTrackModel[310].rotateAngleZ = 1.88495559F;

		rightTrackModel[311].addShapeBox(-1F, -7F, 0F, 2, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 900
		rightTrackModel[311].setRotationPoint(-48.8F, -3.4F, -30.4F);
		rightTrackModel[311].rotateAngleZ = 1.60570291F;

		rightTrackModel[312].addShapeBox(-1F, -7F, 0F, 2, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 901
		rightTrackModel[312].setRotationPoint(-48.8F, -3.4F, -30.4F);
		rightTrackModel[312].rotateAngleZ = 1.32645023F;

		rightTrackModel[313].addShapeBox(-1F, -7F, 0F, 2, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 902
		rightTrackModel[313].setRotationPoint(-48.8F, -3.4F, -30.4F);
		rightTrackModel[313].rotateAngleZ = 1.04719755F;

		rightTrackModel[314].addShapeBox(-1F, -7F, 0F, 2, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 903
		rightTrackModel[314].setRotationPoint(-48.8F, -3.4F, -30.4F);
		rightTrackModel[314].rotateAngleZ = 0.76794487F;

		rightTrackModel[315].addShapeBox(-1F, -7F, 0F, 2, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 904
		rightTrackModel[315].setRotationPoint(-48.8F, -3.4F, -30.4F);
		rightTrackModel[315].rotateAngleZ = 0.48869219F;

		rightTrackModel[316].addShapeBox(-1F, -7F, 0F, 2, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 905
		rightTrackModel[316].setRotationPoint(-48.8F, -3.4F, -30.4F);
		rightTrackModel[316].rotateAngleZ = 0.27925268F;

		rightTrackModel[317].addShapeBox(-1F, -7F, 0F, 2, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 906
		rightTrackModel[317].setRotationPoint(-48.8F, -3.4F, -30.4F);

		rightTrackModel[318].addShapeBox(-1F, 6F, 0F, 2, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 918
		rightTrackModel[318].setRotationPoint(38.5F, 2.4F, -30.4F);
		rightTrackModel[318].rotateAngleZ = 0.19198622F;

		rightTrackModel[319].addShapeBox(-1F, 6F, 0F, 2, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 919
		rightTrackModel[319].setRotationPoint(38.5F, 2.4F, -30.4F);
		rightTrackModel[319].rotateAngleZ = 0.15707963F;

		rightTrackModel[320].addShapeBox(-1F, 6F, 0F, 16, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 920
		rightTrackModel[320].setRotationPoint(38.5F, 2.4F, -30.4F);
		rightTrackModel[320].rotateAngleZ = 0.36651914F;

		rightTrackModel[321].addShapeBox(-1F, 6F, 0F, 2, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 921
		rightTrackModel[321].setRotationPoint(52.5F, -3F, -30.4F);
		rightTrackModel[321].rotateAngleZ = 0.40142573F;

		rightTrackModel[322].addShapeBox(-1F, 6F, 0F, 2, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 922
		rightTrackModel[322].setRotationPoint(52.5F, -3F, -30.4F);
		rightTrackModel[322].rotateAngleZ = 0.68067841F;

		rightTrackModel[323].addShapeBox(-1F, 6F, 0F, 2, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 923
		rightTrackModel[323].setRotationPoint(52.5F, -3F, -30.4F);
		rightTrackModel[323].rotateAngleZ = 0.9424778F;

		rightTrackModel[324].addShapeBox(-1F, 6F, 0F, 2, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 924
		rightTrackModel[324].setRotationPoint(52.5F, -3F, -30.4F);
		rightTrackModel[324].rotateAngleZ = 1.22173048F;

		rightTrackModel[325].addShapeBox(-1F, 6F, 0F, 2, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 925
		rightTrackModel[325].setRotationPoint(52.5F, -3F, -30.4F);
		rightTrackModel[325].rotateAngleZ = 1.50098316F;

		rightTrackModel[326].addShapeBox(-1F, 6F, 0F, 2, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 926
		rightTrackModel[326].setRotationPoint(52.5F, -3F, -30.4F);
		rightTrackModel[326].rotateAngleZ = 1.78023584F;

		rightTrackModel[327].addShapeBox(-1F, 6F, 0F, 2, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 927
		rightTrackModel[327].setRotationPoint(52.5F, -3F, -30.4F);
		rightTrackModel[327].rotateAngleZ = 2.05948852F;

		rightTrackModel[328].addShapeBox(-1F, 6F, 0F, 2, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 928
		rightTrackModel[328].setRotationPoint(52.5F, -3F, -30.4F);
		rightTrackModel[328].rotateAngleZ = 2.3387412F;

		rightTrackModel[329].addShapeBox(-1F, 6F, 0F, 2, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 929
		rightTrackModel[329].setRotationPoint(52.5F, -3F, -30.4F);
		rightTrackModel[329].rotateAngleZ = 2.61799388F;

		rightTrackModel[330].addShapeBox(-1F, 6F, 0F, 2, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 930
		rightTrackModel[330].setRotationPoint(52.5F, -3F, -30.4F);
		rightTrackModel[330].rotateAngleZ = 2.86233997F;

		rightTrackModel[331].addShapeBox(-0.5F, -0.5F, 8F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1000
		rightTrackModel[331].setRotationPoint(38.5F, 2.4F, -28F);
		rightTrackModel[331].rotateAngleZ = 2.28638132F;

		rightTrackModel[332].addShapeBox(-0.5F, -0.5F, 8F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1001
		rightTrackModel[332].setRotationPoint(24.5F, 2.4F, -28F);
		rightTrackModel[332].rotateAngleZ = 2.28638132F;

		rightTrackModel[333].addShapeBox(-0.5F, -0.5F, 8F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1002
		rightTrackModel[333].setRotationPoint(10F, 2.4F, -28F);
		rightTrackModel[333].rotateAngleZ = 2.28638132F;

		rightTrackModel[334].addShapeBox(-0.5F, -0.5F, 8F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1003
		rightTrackModel[334].setRotationPoint(-4.5F, 2.4F, -28F);
		rightTrackModel[334].rotateAngleZ = 2.28638132F;

		rightTrackModel[335].addShapeBox(-0.5F, -0.5F, 8F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1004
		rightTrackModel[335].setRotationPoint(-19F, 2.4F, -28F);
		rightTrackModel[335].rotateAngleZ = 2.28638132F;

		rightTrackModel[336].addShapeBox(-0.5F, -0.5F, 8F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1005
		rightTrackModel[336].setRotationPoint(-34F, 2.4F, -28F);
		rightTrackModel[336].rotateAngleZ = 2.28638132F;

		rightTrackModel[337].addShapeBox(-0.5F, -0.5F, 8F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1006
		rightTrackModel[337].setRotationPoint(-34F, 2.4F, 10F);
		rightTrackModel[337].rotateAngleZ = 2.28638132F;

		rightTrackModel[338].addShapeBox(-0.5F, -0.5F, 8F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1007
		rightTrackModel[338].setRotationPoint(-19F, 2.4F, 10F);
		rightTrackModel[338].rotateAngleZ = 2.28638132F;

		rightTrackModel[339].addShapeBox(-0.5F, -0.5F, 8F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1008
		rightTrackModel[339].setRotationPoint(-4.5F, 2.4F, 10F);
		rightTrackModel[339].rotateAngleZ = 2.28638132F;

		rightTrackModel[340].addShapeBox(-0.5F, -0.5F, 8F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1009
		rightTrackModel[340].setRotationPoint(10F, 2.4F, 10F);
		rightTrackModel[340].rotateAngleZ = 2.28638132F;

		rightTrackModel[341].addShapeBox(-0.5F, -0.5F, 8F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1010
		rightTrackModel[341].setRotationPoint(24.5F, 2.4F, 10F);
		rightTrackModel[341].rotateAngleZ = 2.28638132F;

		rightTrackModel[342].addShapeBox(-0.5F, -0.5F, 8F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1011
		rightTrackModel[342].setRotationPoint(38.5F, 2.4F, 10F);
		rightTrackModel[342].rotateAngleZ = 2.28638132F;

		rightTrackModel[343].addBox(-0.5F, -7.1F, 0F, 1, 1, 1, 0F); // Box 23
		rightTrackModel[343].setRotationPoint(-49F, -3.3F, -19.3F);
		rightTrackModel[343].rotateAngleZ = 3.66519143F;

		rightTrackModel[344].addBox(-0.5F, -7.1F, 0F, 1, 1, 1, 0F); // Box 24
		rightTrackModel[344].setRotationPoint(-49F, -3.3F, -19.3F);
		rightTrackModel[344].rotateAngleZ = 4.1887902F;

		rightTrackModel[345].addBox(-0.5F, -7.1F, 0F, 1, 1, 1, 0F); // Box 25
		rightTrackModel[345].setRotationPoint(-49F, -3.3F, -19.3F);
		rightTrackModel[345].rotateAngleZ = 3.14159265F;

		rightTrackModel[346].addBox(-0.5F, -7.1F, 0F, 1, 1, 1, 0F); // Box 26
		rightTrackModel[346].setRotationPoint(-49F, -3.3F, -19.3F);
		rightTrackModel[346].rotateAngleZ = 4.71238898F;

		rightTrackModel[347].addBox(-0.5F, -7.1F, 0F, 1, 1, 1, 0F); // Box 27
		rightTrackModel[347].setRotationPoint(-49F, -3.3F, -19.3F);
		rightTrackModel[347].rotateAngleZ = 5.23598776F;

		rightTrackModel[348].addBox(-0.5F, -7.1F, 0F, 1, 1, 1, 0F); // Box 28
		rightTrackModel[348].setRotationPoint(-49F, -3.3F, -19.3F);
		rightTrackModel[348].rotateAngleZ = 5.75958653F;

		rightTrackModel[349].addBox(-0.5F, -7.1F, 0F, 1, 1, 1, 0F); // Box 30
		rightTrackModel[349].setRotationPoint(-49F, -3.3F, -19.3F);
		rightTrackModel[349].rotateAngleZ = 0.52359878F;

		rightTrackModel[350].addBox(-0.5F, -7.1F, 0F, 1, 1, 1, 0F); // Box 31
		rightTrackModel[350].setRotationPoint(-49F, -3.3F, -19.3F);
		rightTrackModel[350].rotateAngleZ = 1.04719755F;

		rightTrackModel[351].addBox(-0.5F, -7.1F, 0F, 1, 1, 1, 0F); // Box 32
		rightTrackModel[351].setRotationPoint(-49F, -3.3F, -19.3F);
		rightTrackModel[351].rotateAngleZ = 1.57079633F;

		rightTrackModel[352].addBox(-0.5F, -7.1F, 0F, 1, 1, 1, 0F); // Box 33
		rightTrackModel[352].setRotationPoint(-49F, -3.3F, -19.3F);
		rightTrackModel[352].rotateAngleZ = 2.0943951F;

		rightTrackModel[353].addBox(-0.5F, -7.1F, 0F, 1, 1, 1, 0F); // Box 34
		rightTrackModel[353].setRotationPoint(-49F, -3.3F, -19.3F);
		rightTrackModel[353].rotateAngleZ = 2.61799388F;

		rightTrackModel[354].addBox(-0.5F, -7.1F, 0F, 1, 1, 1, 0F); // Box 35
		rightTrackModel[354].setRotationPoint(-49F, -3.3F, -19.3F);

		rightTrackModel[355].addBox(-0.5F, -7.1F, 0F, 1, 1, 1, 0F); // Box 36
		rightTrackModel[355].setRotationPoint(-49F, -3.3F, -30.5F);

		rightTrackModel[356].addBox(-0.5F, -7.1F, 0F, 1, 1, 1, 0F); // Box 37
		rightTrackModel[356].setRotationPoint(-49F, -3.3F, -30.5F);
		rightTrackModel[356].rotateAngleZ = 0.52359878F;

		rightTrackModel[357].addBox(-0.5F, -7.1F, 0F, 1, 1, 1, 0F); // Box 38
		rightTrackModel[357].setRotationPoint(-49F, -3.3F, -30.5F);
		rightTrackModel[357].rotateAngleZ = 1.04719755F;

		rightTrackModel[358].addBox(-0.5F, -7.1F, 0F, 1, 1, 1, 0F); // Box 39
		rightTrackModel[358].setRotationPoint(-49F, -3.3F, -30.5F);
		rightTrackModel[358].rotateAngleZ = 1.57079633F;

		rightTrackModel[359].addBox(-0.5F, -7.1F, 0F, 1, 1, 1, 0F); // Box 40
		rightTrackModel[359].setRotationPoint(-49F, -3.3F, -30.5F);
		rightTrackModel[359].rotateAngleZ = 2.0943951F;

		rightTrackModel[360].addBox(-0.5F, -7.1F, 0F, 1, 1, 1, 0F); // Box 41
		rightTrackModel[360].setRotationPoint(-49F, -3.3F, -30.5F);
		rightTrackModel[360].rotateAngleZ = 2.61799388F;

		rightTrackModel[361].addBox(-0.5F, -7.1F, 0F, 1, 1, 1, 0F); // Box 42
		rightTrackModel[361].setRotationPoint(-49F, -3.3F, -30.5F);
		rightTrackModel[361].rotateAngleZ = 3.14159265F;

		rightTrackModel[362].addBox(-0.5F, -7.1F, 0F, 1, 1, 1, 0F); // Box 43
		rightTrackModel[362].setRotationPoint(-49F, -3.3F, -30.5F);
		rightTrackModel[362].rotateAngleZ = 3.66519143F;

		rightTrackModel[363].addBox(-0.5F, -7.1F, 0F, 1, 1, 1, 0F); // Box 44
		rightTrackModel[363].setRotationPoint(-49F, -3.3F, -30.5F);
		rightTrackModel[363].rotateAngleZ = 4.1887902F;

		rightTrackModel[364].addBox(-0.5F, -7.1F, 0F, 1, 1, 1, 0F); // Box 45
		rightTrackModel[364].setRotationPoint(-49F, -3.3F, -30.5F);
		rightTrackModel[364].rotateAngleZ = 4.71238898F;

		rightTrackModel[365].addBox(-0.5F, -7.1F, 0F, 1, 1, 1, 0F); // Box 46
		rightTrackModel[365].setRotationPoint(-49F, -3.3F, -30.5F);
		rightTrackModel[365].rotateAngleZ = 5.23598776F;

		rightTrackModel[366].addBox(-0.5F, -7.1F, 0F, 1, 1, 1, 0F); // Box 47
		rightTrackModel[366].setRotationPoint(-49F, -3.3F, -30.5F);
		rightTrackModel[366].rotateAngleZ = 5.75958653F;

		rightTrackModel[367].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 1435
		rightTrackModel[367].setRotationPoint(-19F, 2.4F, -21.5F);
		rightTrackModel[367].rotateAngleX = 0.36651914F;
		rightTrackModel[367].rotateAngleY = -3.14159265F;
		rightTrackModel[367].rotateAngleZ = 1.91986218F;

		rightTrackModel[368].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 1436
		rightTrackModel[368].setRotationPoint(-19F, 2.4F, -21.5F);
		rightTrackModel[368].rotateAngleX = -0.2443461F;
		rightTrackModel[368].rotateAngleY = -3.14159265F;
		rightTrackModel[368].rotateAngleZ = 1.91986218F;

		rightTrackModel[369].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 1437
		rightTrackModel[369].setRotationPoint(-19F, 2.4F, -21.5F);
		rightTrackModel[369].rotateAngleX = -0.2443461F;
		rightTrackModel[369].rotateAngleY = -3.14159265F;
		rightTrackModel[369].rotateAngleZ = 2.70526034F;

		rightTrackModel[370].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 1438
		rightTrackModel[370].setRotationPoint(-19F, 2.4F, -21.5F);
		rightTrackModel[370].rotateAngleX = -0.2443461F;
		rightTrackModel[370].rotateAngleY = -3.14159265F;
		rightTrackModel[370].rotateAngleZ = 3.4906585F;

		rightTrackModel[371].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 1439
		rightTrackModel[371].setRotationPoint(-19F, 2.4F, -21.5F);
		rightTrackModel[371].rotateAngleX = 0.2443461F;
		rightTrackModel[371].rotateAngleY = -3.14159265F;
		rightTrackModel[371].rotateAngleZ = 2.70526034F;

		rightTrackModel[372].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 1440
		rightTrackModel[372].setRotationPoint(-19F, 2.4F, -21.5F);
		rightTrackModel[372].rotateAngleX = -0.2443461F;
		rightTrackModel[372].rotateAngleY = -3.14159265F;
		rightTrackModel[372].rotateAngleZ = 4.27605667F;

		rightTrackModel[373].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 1441
		rightTrackModel[373].setRotationPoint(-19F, 2.4F, -21.5F);
		rightTrackModel[373].rotateAngleX = 0.2443461F;
		rightTrackModel[373].rotateAngleY = -3.14159265F;
		rightTrackModel[373].rotateAngleZ = 3.4906585F;

		rightTrackModel[374].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 1442
		rightTrackModel[374].setRotationPoint(-19F, 2.4F, -21.5F);
		rightTrackModel[374].rotateAngleX = -0.2443461F;
		rightTrackModel[374].rotateAngleY = -3.14159265F;
		rightTrackModel[374].rotateAngleZ = 5.06145483F;

		rightTrackModel[375].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 1443
		rightTrackModel[375].setRotationPoint(-19F, 2.4F, -21.5F);
		rightTrackModel[375].rotateAngleX = 0.2443461F;
		rightTrackModel[375].rotateAngleY = -3.14159265F;
		rightTrackModel[375].rotateAngleZ = 4.27605667F;

		rightTrackModel[376].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 1444
		rightTrackModel[376].setRotationPoint(-19F, 2.4F, -21.5F);
		rightTrackModel[376].rotateAngleX = -0.2443461F;
		rightTrackModel[376].rotateAngleY = -3.14159265F;
		rightTrackModel[376].rotateAngleZ = 5.84685299F;

		rightTrackModel[377].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 1445
		rightTrackModel[377].setRotationPoint(-19F, 2.4F, -21.5F);
		rightTrackModel[377].rotateAngleX = 0.2443461F;
		rightTrackModel[377].rotateAngleY = -3.14159265F;
		rightTrackModel[377].rotateAngleZ = 0.34906585F;

		rightTrackModel[378].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 1446
		rightTrackModel[378].setRotationPoint(-19F, 2.4F, -21.5F);
		rightTrackModel[378].rotateAngleX = -0.2443461F;
		rightTrackModel[378].rotateAngleY = -3.14159265F;
		rightTrackModel[378].rotateAngleZ = 1.13446401F;

		rightTrackModel[379].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 1447
		rightTrackModel[379].setRotationPoint(-19F, 2.4F, -21.5F);
		rightTrackModel[379].rotateAngleX = 0.2443461F;
		rightTrackModel[379].rotateAngleY = -3.14159265F;
		rightTrackModel[379].rotateAngleZ = 1.13446401F;

		rightTrackModel[380].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 1448
		rightTrackModel[380].setRotationPoint(-19F, 2.4F, -21.5F);
		rightTrackModel[380].rotateAngleX = 0.2443461F;
		rightTrackModel[380].rotateAngleY = -3.14159265F;
		rightTrackModel[380].rotateAngleZ = 5.84685299F;

		rightTrackModel[381].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 1449
		rightTrackModel[381].setRotationPoint(-19F, 2.4F, -21.5F);
		rightTrackModel[381].rotateAngleX = -0.2443461F;
		rightTrackModel[381].rotateAngleY = -3.14159265F;
		rightTrackModel[381].rotateAngleZ = 0.34906585F;

		rightTrackModel[382].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 1450
		rightTrackModel[382].setRotationPoint(-19F, 2.4F, -21.5F);
		rightTrackModel[382].rotateAngleX = 0.2443461F;
		rightTrackModel[382].rotateAngleY = -3.14159265F;
		rightTrackModel[382].rotateAngleZ = 5.06145483F;

		rightTrackModel[383].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 1451
		rightTrackModel[383].setRotationPoint(-19F, 2.4F, -30F);
		rightTrackModel[383].rotateAngleX = 0.36651914F;
		rightTrackModel[383].rotateAngleZ = 1.97222205F;

		rightTrackModel[384].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 1452
		rightTrackModel[384].setRotationPoint(-19F, 2.4F, -30F);
		rightTrackModel[384].rotateAngleX = -0.2443461F;
		rightTrackModel[384].rotateAngleZ = 2.75762022F;

		rightTrackModel[385].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 1453
		rightTrackModel[385].setRotationPoint(-19F, 2.4F, -30F);
		rightTrackModel[385].rotateAngleX = 0.2443461F;
		rightTrackModel[385].rotateAngleZ = 1.18682389F;

		rightTrackModel[386].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 1454
		rightTrackModel[386].setRotationPoint(-19F, 2.4F, -30F);
		rightTrackModel[386].rotateAngleX = -0.2443461F;
		rightTrackModel[386].rotateAngleZ = 1.97222205F;

		rightTrackModel[387].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 1455
		rightTrackModel[387].setRotationPoint(-19F, 2.4F, -30F);
		rightTrackModel[387].rotateAngleX = 0.2443461F;
		rightTrackModel[387].rotateAngleZ = 0.40142573F;

		rightTrackModel[388].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 1456
		rightTrackModel[388].setRotationPoint(-19F, 2.4F, -30F);
		rightTrackModel[388].rotateAngleX = -0.2443461F;
		rightTrackModel[388].rotateAngleZ = 1.18682389F;

		rightTrackModel[389].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 1457
		rightTrackModel[389].setRotationPoint(-19F, 2.4F, -30F);
		rightTrackModel[389].rotateAngleX = 0.2443461F;
		rightTrackModel[389].rotateAngleZ = 5.89921287F;

		rightTrackModel[390].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 1458
		rightTrackModel[390].setRotationPoint(-19F, 2.4F, -30F);
		rightTrackModel[390].rotateAngleX = -0.2443461F;
		rightTrackModel[390].rotateAngleZ = 0.40142573F;

		rightTrackModel[391].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 1459
		rightTrackModel[391].setRotationPoint(-19F, 2.4F, -30F);
		rightTrackModel[391].rotateAngleX = 0.2443461F;
		rightTrackModel[391].rotateAngleZ = 5.11381471F;

		rightTrackModel[392].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 1460
		rightTrackModel[392].setRotationPoint(-19F, 2.4F, -30F);
		rightTrackModel[392].rotateAngleX = -0.2443461F;
		rightTrackModel[392].rotateAngleZ = 5.89921287F;

		rightTrackModel[393].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 1461
		rightTrackModel[393].setRotationPoint(-19F, 2.4F, -30F);
		rightTrackModel[393].rotateAngleX = 0.2443461F;
		rightTrackModel[393].rotateAngleZ = 4.32841654F;

		rightTrackModel[394].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 1462
		rightTrackModel[394].setRotationPoint(-19F, 2.4F, -30F);
		rightTrackModel[394].rotateAngleX = -0.2443461F;
		rightTrackModel[394].rotateAngleZ = 5.11381471F;

		rightTrackModel[395].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 1463
		rightTrackModel[395].setRotationPoint(-19F, 2.4F, -30F);
		rightTrackModel[395].rotateAngleX = 0.2443461F;
		rightTrackModel[395].rotateAngleZ = 3.54301838F;

		rightTrackModel[396].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 1464
		rightTrackModel[396].setRotationPoint(-19F, 2.4F, -30F);
		rightTrackModel[396].rotateAngleX = -0.2443461F;
		rightTrackModel[396].rotateAngleZ = 4.32841654F;

		rightTrackModel[397].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 1465
		rightTrackModel[397].setRotationPoint(-19F, 2.4F, -30F);
		rightTrackModel[397].rotateAngleX = 0.2443461F;
		rightTrackModel[397].rotateAngleZ = 2.75762022F;

		rightTrackModel[398].addShapeBox(0F, -1F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 1466
		rightTrackModel[398].setRotationPoint(-19F, 2.4F, -30F);
		rightTrackModel[398].rotateAngleX = -0.2443461F;
		rightTrackModel[398].rotateAngleZ = 3.54301838F;

		rightTrackModel[399].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1467
		rightTrackModel[399].setRotationPoint(-19F, 2.4F, -30.4F);
		rightTrackModel[399].rotateAngleZ = 1.20427718F;

		rightTrackModel[400].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1468
		rightTrackModel[400].setRotationPoint(-19F, 2.4F, -30.4F);
		rightTrackModel[400].rotateAngleZ = 0.55850536F;

		rightTrackModel[401].addShapeBox(-1.5F, -6.15F, 0F, 3, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1469
		rightTrackModel[401].setRotationPoint(-19F, 2.4F, -30.4F);
		rightTrackModel[401].rotateAngleZ = 6.28318531F;

		rightTrackModel[402].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1470
		rightTrackModel[402].setRotationPoint(-19F, 2.4F, -30.4F);
		rightTrackModel[402].rotateAngleZ = 5.72467995F;

		rightTrackModel[403].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1471
		rightTrackModel[403].setRotationPoint(-19F, 2.4F, -30.4F);
		rightTrackModel[403].rotateAngleZ = 5.07890812F;

		rightTrackModel[404].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1472
		rightTrackModel[404].setRotationPoint(-19F, 2.4F, -30.4F);
		rightTrackModel[404].rotateAngleZ = 4.4331363F;

		rightTrackModel[405].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1473
		rightTrackModel[405].setRotationPoint(-19F, 2.4F, -30.4F);
		rightTrackModel[405].rotateAngleZ = 3.78736448F;

		rightTrackModel[406].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1474
		rightTrackModel[406].setRotationPoint(-19F, 2.4F, -30.4F);
		rightTrackModel[406].rotateAngleZ = 3.14159265F;

		rightTrackModel[407].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1475
		rightTrackModel[407].setRotationPoint(-19F, 2.4F, -30.4F);
		rightTrackModel[407].rotateAngleZ = 2.49582083F;

		rightTrackModel[408].addShapeBox(-2F, -6F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1476
		rightTrackModel[408].setRotationPoint(-19F, 2.4F, -30.4F);
		rightTrackModel[408].rotateAngleZ = 1.85004901F;
	}
}