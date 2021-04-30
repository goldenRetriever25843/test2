//This File was created with the Minecraft-SMP Modelling Toolbox 1.5.4.1
// Copyright (C) 2013 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 3.0.x+

// Model Checklist
//    Model: 
//    - Check Left/Right    [ ]  (Left = + / Right = -)
//    - Code Cleaned        [ ]
//    - Coverted to Version [ ]

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelRobertLee extends ModelVehicle
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelRobertLee()
	{

// Body
		bodyModel = new ModelRendererTurbo[168];
		bodyModel[0] = new ModelRendererTurbo(this,  1,  52, textureX, textureY); // Core1
		bodyModel[1] = new ModelRendererTurbo(this,  1,  101, textureX, textureY); // Core2
		bodyModel[2] = new ModelRendererTurbo(this,  1,  101, textureX, textureY); // Core3
		bodyModel[3] = new ModelRendererTurbo(this,  1,  140, textureX, textureY); // Core4
		bodyModel[4] = new ModelRendererTurbo(this,  1,  140, textureX, textureY); // Core5
		bodyModel[5] = new ModelRendererTurbo(this,  1,  140, textureX, textureY); // Core6
		bodyModel[6] = new ModelRendererTurbo(this,  1,  159, textureX, textureY); // Core7
		bodyModel[7] = new ModelRendererTurbo(this,  1,  159, textureX, textureY); // Core8
		bodyModel[8] = new ModelRendererTurbo(this,  1,  159, textureX, textureY); // Core9
		bodyModel[9] = new ModelRendererTurbo(this,  1,  159, textureX, textureY); // Core10
		bodyModel[10] = new ModelRendererTurbo(this,  1,  159, textureX, textureY); // Core11
		bodyModel[11] = new ModelRendererTurbo(this,  1,  159, textureX, textureY); // Core12
		bodyModel[12] = new ModelRendererTurbo(this,  1,  159, textureX, textureY); // Core13
		bodyModel[13] = new ModelRendererTurbo(this,  1,  166, textureX, textureY); // Core14
		bodyModel[14] = new ModelRendererTurbo(this,  1,  166, textureX, textureY); // Core15
		bodyModel[15] = new ModelRendererTurbo(this,  68,  101, textureX, textureY); // Core16
		bodyModel[16] = new ModelRendererTurbo(this,  1,  166, textureX, textureY); // Core17
		bodyModel[17] = new ModelRendererTurbo(this,  1,  187, textureX, textureY); // Core18
		bodyModel[18] = new ModelRendererTurbo(this,  1,  187, textureX, textureY); // Core19
		bodyModel[19] = new ModelRendererTurbo(this,  1,  187, textureX, textureY); // Core20
		bodyModel[20] = new ModelRendererTurbo(this,  1,  166, textureX, textureY); // Core21
		bodyModel[21] = new ModelRendererTurbo(this,  1,  166, textureX, textureY); // Core22
		bodyModel[22] = new ModelRendererTurbo(this,  1,  169, textureX, textureY); // Core23
		bodyModel[23] = new ModelRendererTurbo(this,  1,  166, textureX, textureY); // Core24
		bodyModel[24] = new ModelRendererTurbo(this,  1,  166, textureX, textureY); // Core25
		bodyModel[25] = new ModelRendererTurbo(this,  1,  166, textureX, textureY); // Core26
		bodyModel[26] = new ModelRendererTurbo(this,  1,  166, textureX, textureY); // Core27
		bodyModel[27] = new ModelRendererTurbo(this,  1,  166, textureX, textureY); // Core28
		bodyModel[28] = new ModelRendererTurbo(this,  1,  187, textureX, textureY); // Core29
		bodyModel[29] = new ModelRendererTurbo(this,  81,  230, textureX, textureY); // Core30
		bodyModel[30] = new ModelRendererTurbo(this,  1,  187, textureX, textureY); // Core31
		bodyModel[31] = new ModelRendererTurbo(this,  1,  166, textureX, textureY); // Core32
		bodyModel[32] = new ModelRendererTurbo(this,  1,  166, textureX, textureY); // Core33
		bodyModel[33] = new ModelRendererTurbo(this,  1,  166, textureX, textureY); // Core34
		bodyModel[34] = new ModelRendererTurbo(this,  1,  166, textureX, textureY); // Core35
		bodyModel[35] = new ModelRendererTurbo(this,  1,  166, textureX, textureY); // Core36
		bodyModel[36] = new ModelRendererTurbo(this,  1,  166, textureX, textureY); // Core37
		bodyModel[37] = new ModelRendererTurbo(this,  1,  169, textureX, textureY); // Core38
		bodyModel[38] = new ModelRendererTurbo(this,  1,  166, textureX, textureY); // Core39
		bodyModel[39] = new ModelRendererTurbo(this,  2,  362, textureX, textureY); // Core40
		bodyModel[40] = new ModelRendererTurbo(this,  2,  229, textureX, textureY); // Core41
		bodyModel[41] = new ModelRendererTurbo(this,  1,  166, textureX, textureY); // Core42
		bodyModel[42] = new ModelRendererTurbo(this,  1,  166, textureX, textureY); // Core43
		bodyModel[43] = new ModelRendererTurbo(this,  2,  229, textureX, textureY); // Core44
		bodyModel[44] = new ModelRendererTurbo(this,  2,  229, textureX, textureY); // Core45
		bodyModel[45] = new ModelRendererTurbo(this,  2,  229, textureX, textureY); // Core46
		bodyModel[46] = new ModelRendererTurbo(this,  2,  229, textureX, textureY); // Core47
		bodyModel[47] = new ModelRendererTurbo(this,  2,  229, textureX, textureY); // Core48
		bodyModel[48] = new ModelRendererTurbo(this,  2,  229, textureX, textureY); // Core49
		bodyModel[49] = new ModelRendererTurbo(this,  2,  229, textureX, textureY); // Core50
		bodyModel[50] = new ModelRendererTurbo(this,  2,  229, textureX, textureY); // Core51
		bodyModel[51] = new ModelRendererTurbo(this,  2,  229, textureX, textureY); // Core52
		bodyModel[52] = new ModelRendererTurbo(this,  2,  229, textureX, textureY); // Core53
		bodyModel[53] = new ModelRendererTurbo(this,  2,  268, textureX, textureY); // Core54
		bodyModel[54] = new ModelRendererTurbo(this,  34,  273, textureX, textureY); // Core55
		bodyModel[55] = new ModelRendererTurbo(this,  34,  273, textureX, textureY); // Core56
		bodyModel[56] = new ModelRendererTurbo(this,  34,  285, textureX, textureY); // Core57
		bodyModel[57] = new ModelRendererTurbo(this,  34,  285, textureX, textureY); // Core58
		bodyModel[58] = new ModelRendererTurbo(this,  50,  277, textureX, textureY); // Core59
		bodyModel[59] = new ModelRendererTurbo(this,  62,  176, textureX, textureY); // Core60
		bodyModel[60] = new ModelRendererTurbo(this,  62,  176, textureX, textureY); // Core61
		bodyModel[61] = new ModelRendererTurbo(this,  1,  166, textureX, textureY); // Core62
		bodyModel[62] = new ModelRendererTurbo(this,  1,  167, textureX, textureY); // Core63
		bodyModel[63] = new ModelRendererTurbo(this,  92,  166, textureX, textureY); // Core64
		bodyModel[64] = new ModelRendererTurbo(this,  92,  166, textureX, textureY); // Core65
		bodyModel[65] = new ModelRendererTurbo(this,  92,  166, textureX, textureY); // Core66
		bodyModel[66] = new ModelRendererTurbo(this,  1,  101, textureX, textureY); // Core67
		bodyModel[67] = new ModelRendererTurbo(this,  1,  101, textureX, textureY); // Core68
		bodyModel[68] = new ModelRendererTurbo(this,  1,  101, textureX, textureY); // Core69
		bodyModel[69] = new ModelRendererTurbo(this,  102,  186, textureX, textureY); // Core70
		bodyModel[70] = new ModelRendererTurbo(this,  1,  187, textureX, textureY); // Core71
		bodyModel[71] = new ModelRendererTurbo(this,  1,  187, textureX, textureY); // Core72
		bodyModel[72] = new ModelRendererTurbo(this,  92,  166, textureX, textureY); // Core73
		bodyModel[73] = new ModelRendererTurbo(this,  126,  183, textureX, textureY); // Core74
		bodyModel[74] = new ModelRendererTurbo(this,  126,  183, textureX, textureY); // Core75
		bodyModel[75] = new ModelRendererTurbo(this,  126,  183, textureX, textureY); // Core76
		bodyModel[76] = new ModelRendererTurbo(this,  126,  183, textureX, textureY); // Core77
		bodyModel[77] = new ModelRendererTurbo(this,  126,  183, textureX, textureY); // Core78
		bodyModel[78] = new ModelRendererTurbo(this,  126,  195, textureX, textureY); // Core79
		bodyModel[79] = new ModelRendererTurbo(this,  126,  210, textureX, textureY); // Core80
		bodyModel[80] = new ModelRendererTurbo(this,  126,  183, textureX, textureY); // Core81
		bodyModel[81] = new ModelRendererTurbo(this,  126,  183, textureX, textureY); // Core82
		bodyModel[82] = new ModelRendererTurbo(this,  126,  183, textureX, textureY); // Core83
		bodyModel[83] = new ModelRendererTurbo(this,  111,  211, textureX, textureY); // Core84
		bodyModel[84] = new ModelRendererTurbo(this,  111,  211, textureX, textureY); // Core85
		bodyModel[85] = new ModelRendererTurbo(this,  111,  211, textureX, textureY); // Core86
		bodyModel[86] = new ModelRendererTurbo(this,  111,  211, textureX, textureY); // Core87
		bodyModel[87] = new ModelRendererTurbo(this,  116,  225, textureX, textureY); // Core88
		bodyModel[88] = new ModelRendererTurbo(this,  116,  225, textureX, textureY); // Core89
		bodyModel[89] = new ModelRendererTurbo(this,  116,  225, textureX, textureY); // Core90
		bodyModel[90] = new ModelRendererTurbo(this,  2,  304, textureX, textureY); // Core91
		bodyModel[91] = new ModelRendererTurbo(this,  2,  304, textureX, textureY); // Core92
		bodyModel[92] = new ModelRendererTurbo(this,  2,  304, textureX, textureY); // Core93
		bodyModel[93] = new ModelRendererTurbo(this,  1,  140, textureX, textureY); // Core94
		bodyModel[94] = new ModelRendererTurbo(this,  1,  140, textureX, textureY); // Core95
		bodyModel[95] = new ModelRendererTurbo(this,  1,  140, textureX, textureY); // Core96
		bodyModel[96] = new ModelRendererTurbo(this,  1,  140, textureX, textureY); // Core97
		bodyModel[97] = new ModelRendererTurbo(this,  65,  157, textureX, textureY); // Core98
		bodyModel[98] = new ModelRendererTurbo(this,  1,  140, textureX, textureY); // Core99
		bodyModel[99] = new ModelRendererTurbo(this,  65,  157, textureX, textureY); // Core100
		bodyModel[100] = new ModelRendererTurbo(this,  58,  276, textureX, textureY); // Core101
		bodyModel[101] = new ModelRendererTurbo(this,  58,  276, textureX, textureY); // Core102
		bodyModel[102] = new ModelRendererTurbo(this,  2,  342, textureX, textureY); // Core103
		bodyModel[103] = new ModelRendererTurbo(this,  2,  342, textureX, textureY); // Core104
		bodyModel[104] = new ModelRendererTurbo(this,  2,  342, textureX, textureY); // Core105
		bodyModel[105] = new ModelRendererTurbo(this,  2,  342, textureX, textureY); // Core106
		bodyModel[106] = new ModelRendererTurbo(this,  2,  342, textureX, textureY); // Core107
		bodyModel[107] = new ModelRendererTurbo(this,  2,  342, textureX, textureY); // Core108
		bodyModel[108] = new ModelRendererTurbo(this,  82,  276, textureX, textureY); // Core109
		bodyModel[109] = new ModelRendererTurbo(this,  82,  276, textureX, textureY); // Core110
		bodyModel[110] = new ModelRendererTurbo(this,  82,  276, textureX, textureY); // Core111
		bodyModel[111] = new ModelRendererTurbo(this,  82,  286, textureX, textureY); // Core112
		bodyModel[112] = new ModelRendererTurbo(this,  82,  286, textureX, textureY); // Core113
		bodyModel[113] = new ModelRendererTurbo(this,  82,  276, textureX, textureY); // Core114
		bodyModel[114] = new ModelRendererTurbo(this,  82,  276, textureX, textureY); // Core115
		bodyModel[115] = new ModelRendererTurbo(this,  82,  276, textureX, textureY); // Core116
		bodyModel[116] = new ModelRendererTurbo(this,  70,  118, textureX, textureY); // Core117
		bodyModel[117] = new ModelRendererTurbo(this,  113,  101, textureX, textureY); // Core118
		bodyModel[118] = new ModelRendererTurbo(this,  113,  101, textureX, textureY); // Core119
		bodyModel[119] = new ModelRendererTurbo(this,  13,  342, textureX, textureY); // Core120
		bodyModel[120] = new ModelRendererTurbo(this,  24,  342, textureX, textureY); // Core121
		bodyModel[121] = new ModelRendererTurbo(this,  24,  342, textureX, textureY); // Core123
		bodyModel[122] = new ModelRendererTurbo(this,  24,  342, textureX, textureY); // Core124
		bodyModel[123] = new ModelRendererTurbo(this,  24,  342, textureX, textureY); // Core125
		bodyModel[124] = new ModelRendererTurbo(this,  24,  342, textureX, textureY); // Core126
		bodyModel[125] = new ModelRendererTurbo(this,  24,  342, textureX, textureY); // Core127
		bodyModel[126] = new ModelRendererTurbo(this,  13,  342, textureX, textureY); // Core128
		bodyModel[127] = new ModelRendererTurbo(this,  72,  297, textureX, textureY); // Core129
		bodyModel[128] = new ModelRendererTurbo(this,  72,  297, textureX, textureY); // Core130
		bodyModel[129] = new ModelRendererTurbo(this,  92,  120, textureX, textureY); // Core131
		bodyModel[130] = new ModelRendererTurbo(this,  116,  118, textureX, textureY); // Core132
		bodyModel[131] = new ModelRendererTurbo(this,  116,  118, textureX, textureY); // Core133
		bodyModel[132] = new ModelRendererTurbo(this,  109,  279, textureX, textureY); // Core134
		bodyModel[133] = new ModelRendererTurbo(this,  58,  276, textureX, textureY); // Core135
		bodyModel[134] = new ModelRendererTurbo(this,  58,  276, textureX, textureY); // Core136
		bodyModel[135] = new ModelRendererTurbo(this,  109,  279, textureX, textureY); // Core137
		bodyModel[136] = new ModelRendererTurbo(this,  93,  286, textureX, textureY); // Core138
		bodyModel[137] = new ModelRendererTurbo(this,  93,  286, textureX, textureY); // Core139
		bodyModel[138] = new ModelRendererTurbo(this,  109,  273, textureX, textureY); // Core140
		bodyModel[139] = new ModelRendererTurbo(this,  109,  273, textureX, textureY); // Core141
		bodyModel[140] = new ModelRendererTurbo(this,  109,  256, textureX, textureY); // Core142
		bodyModel[141] = new ModelRendererTurbo(this,  109,  262, textureX, textureY); // Core143
		bodyModel[142] = new ModelRendererTurbo(this,  109,  256, textureX, textureY); // Core144
		bodyModel[143] = new ModelRendererTurbo(this,  128,  256, textureX, textureY); // Core145
		bodyModel[144] = new ModelRendererTurbo(this,  128,  256, textureX, textureY); // Core146
		bodyModel[145] = new ModelRendererTurbo(this,  141,  258, textureX, textureY); // Core147
		bodyModel[146] = new ModelRendererTurbo(this,  42,  346, textureX, textureY); // Core148
		bodyModel[147] = new ModelRendererTurbo(this,  42,  346, textureX, textureY); // Core149
		bodyModel[148] = new ModelRendererTurbo(this,  42,  346, textureX, textureY); // Core150
		bodyModel[149] = new ModelRendererTurbo(this,  42,  346, textureX, textureY); // Core151
		bodyModel[150] = new ModelRendererTurbo(this,  42,  346, textureX, textureY); // Core152
		bodyModel[151] = new ModelRendererTurbo(this,  57,  352, textureX, textureY); // Core153
		bodyModel[152] = new ModelRendererTurbo(this,  57,  346, textureX, textureY); // Core154
		bodyModel[153] = new ModelRendererTurbo(this,  42,  346, textureX, textureY); // Core155
		bodyModel[154] = new ModelRendererTurbo(this,  69,  357, textureX, textureY); // Core156
		bodyModel[155] = new ModelRendererTurbo(this,  96,  346, textureX, textureY); // Core157
		bodyModel[156] = new ModelRendererTurbo(this,  116,  355, textureX, textureY); // Core158
		bodyModel[157] = new ModelRendererTurbo(this,  116,  355, textureX, textureY); // Core159
		bodyModel[158] = new ModelRendererTurbo(this,  116,  355, textureX, textureY); // Core160
		bodyModel[159] = new ModelRendererTurbo(this,  116,  355, textureX, textureY); // Core161
		bodyModel[160] = new ModelRendererTurbo(this,  1,  169, textureX, textureY); // Core162
		bodyModel[161] = new ModelRendererTurbo(this,  1,  166, textureX, textureY); // Core209
		bodyModel[162] = new ModelRendererTurbo(this,  1,  166, textureX, textureY); // Core210
		bodyModel[163] = new ModelRendererTurbo(this,  876,  39, textureX, textureY); // CoreWheelBolt1
		bodyModel[164] = new ModelRendererTurbo(this,  876,  39, textureX, textureY); // CoreWheelBolt2
		bodyModel[165] = new ModelRendererTurbo(this,  876,  39, textureX, textureY); // CoreWheelBolt3
		bodyModel[166] = new ModelRendererTurbo(this,  876,  39, textureX, textureY); // CoreWheelBolt4
		bodyModel[167] = new ModelRendererTurbo(this,  876,  39, textureX, textureY); // CoreWheelBolt5

		bodyModel[0].addBox(-28F, -5F, -14F, 57, 12, 28, 0F); // Core1
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addBox(6.8F, -22.5F, -7F, 12, 11, 21, 0F); // Core2
		bodyModel[1].setRotationPoint(0F, 0F, 0F);
		bodyModel[1].rotateAngleZ = -0.715585F;

		bodyModel[2].addBox(-10.2F, -22.6F, 4F, 3, 5, 10, 0F); // Core3
		bodyModel[2].setRotationPoint(0F, 0F, 0F);
		bodyModel[2].rotateAngleZ = -1.291544F;

		bodyModel[3].addBox(-28F, -5F, 14F, 58, 2, 8, 0F); // Core4
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addBox(26.5F, -15F, 14F, 4, 2, 8, 0F); // Core5
		bodyModel[4].setRotationPoint(0F, 0F, 0F);
		bodyModel[4].rotateAngleZ = -0.3490658F;

		bodyModel[5].addBox(-28F, -5F, -22F, 58, 2, 8, 0F); // Core6
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addBox(2.6F, -25.8F, -5.8F, 16, 1, 2, 0F); // Core7
		bodyModel[6].setRotationPoint(0F, 0F, 0F);
		bodyModel[6].rotateAngleX = -0.7853982F;
		bodyModel[6].rotateAngleZ = -0.715585F;

		bodyModel[7].addBox(2.6F, -25.8F, -3.8F, 15, 1, 1, 0F); // Core8
		bodyModel[7].setRotationPoint(0F, 0F, 0F);
		bodyModel[7].rotateAngleX = -0.7853982F;
		bodyModel[7].rotateAngleZ = -0.715585F;

		bodyModel[8].addBox(2.6F, -25.8F, -2.8F, 14, 1, 1, 0F); // Core9
		bodyModel[8].setRotationPoint(0F, 0F, 0F);
		bodyModel[8].rotateAngleX = -0.7853982F;
		bodyModel[8].rotateAngleZ = -0.715585F;

		bodyModel[9].addBox(2.6F, -25.8F, -1.8F, 13, 1, 2, 0F); // Core10
		bodyModel[9].setRotationPoint(0F, 0F, 0F);
		bodyModel[9].rotateAngleX = -0.7853982F;
		bodyModel[9].rotateAngleZ = -0.715585F;

		bodyModel[10].addBox(2.6F, -25.8F, 0.2F, 11, 1, 2, 0F); // Core11
		bodyModel[10].setRotationPoint(0F, 0F, 0F);
		bodyModel[10].rotateAngleX = -0.7853982F;
		bodyModel[10].rotateAngleZ = -0.715585F;

		bodyModel[11].addBox(2.6F, -25.8F, 2.2F, 10, 1, 1, 0F); // Core12
		bodyModel[11].setRotationPoint(0F, 0F, 0F);
		bodyModel[11].rotateAngleX = -0.7853982F;
		bodyModel[11].rotateAngleZ = -0.715585F;

		bodyModel[12].addBox(2.6F, -25.8F, 3.2F, 9, 1, 1, 0F); // Core13
		bodyModel[12].setRotationPoint(0F, 0F, 0F);
		bodyModel[12].rotateAngleX = -0.7853982F;
		bodyModel[12].rotateAngleZ = -0.715585F;

		bodyModel[13].addBox(3.4F, -15.5F, 20.2F, 7, 2, 1, 0F); // Core14
		bodyModel[13].setRotationPoint(0F, 0F, 0F);
		bodyModel[13].rotateAngleZ = -0.715585F;

		bodyModel[14].addBox(3.4F, -13.5F, 20.2F, 5, 2, 1, 0F); // Core15
		bodyModel[14].setRotationPoint(0F, 0F, 0F);
		bodyModel[14].rotateAngleZ = -0.715585F;

		bodyModel[15].addBox(-14.3F, -25.6F, -6.9F, 9, 1, 10, 0F); // Core16
		bodyModel[15].setRotationPoint(0F, 0F, 0F);
		bodyModel[15].rotateAngleX = -0.8377581F;
		bodyModel[15].rotateAngleY = -0.01745329F;
		bodyModel[15].rotateAngleZ = -1.291544F;

		bodyModel[16].addBox(-14.6F, -15.5F, 20.2F, 14, 5, 1, 0F); // Core17
		bodyModel[16].setRotationPoint(0F, 0F, 0F);
		bodyModel[16].rotateAngleZ = -1.27409F;

		bodyModel[17].addBox(-3.4F, -20F, -7F, 21, 4, 21, 0F); // Core18
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addBox(1.4F, -20F, 6.4F, 11, 4, 11, 0F); // Core19
		bodyModel[18].setRotationPoint(0F, 0F, 0F);
		bodyModel[18].rotateAngleY = 0.7853982F;

		bodyModel[19].addBox(-5.4F, -20F, 14F, 14, 4, 7, 0F); // Core20
		bodyModel[19].setRotationPoint(2F, 0F, 0F);

		bodyModel[20].addBox(-3.6F, -18.5F, -21.2F, 14, 4, 1, 0F); // Core21
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addBox(-3.6F, -7.5F, -21.2F, 14, 3, 1, 0F); // Core22
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addBox(1.3F, -18.5F, 16.6F, 11, 6, 1, 0F); // Core23
		bodyModel[22].setRotationPoint(0F, 0F, 0F);
		bodyModel[22].rotateAngleY = 0.7853982F;

		bodyModel[23].addBox(-27.6F, -11.3F, -21.2F, 24, 6, 1, 0F); // Core24
		bodyModel[23].setRotationPoint(0F, 1F, 0F);

		bodyModel[24].addBox(-25.6F, -14.5F, -21.2F, 24, 6, 1, 0F); // Core25
		bodyModel[24].setRotationPoint(0F, 1F, 0F);
		bodyModel[24].rotateAngleZ = 0.122173F;

		bodyModel[25].addBox(-25.6F, 8.5F, 18.6F, 24, 8, 1, 0F); // Core26
		bodyModel[25].setRotationPoint(0F, 1F, 0F);
		bodyModel[25].rotateAngleX = 1.308997F;
		bodyModel[25].rotateAngleZ = 0.122173F;

		bodyModel[26].addBox(-27.6F, -16.3F, 9.5F, 1, 2, 8, 0F); // Core27
		bodyModel[26].setRotationPoint(0F, 1F, 0F);
		bodyModel[26].rotateAngleX = -0.2617994F;

		bodyModel[27].addBox(-27.6F, -11.3F, -20.8F, 1, 6, 8, 0F); // Core28
		bodyModel[27].setRotationPoint(0F, 1F, 0F);

		bodyModel[28].addBox(3.2F, -20F, -2.6F, 19, 4, 10, 0F); // Core29
		bodyModel[28].setRotationPoint(0F, 0F, 0F);
		bodyModel[28].rotateAngleY = 0.7853982F;

		bodyModel[29].addBox(-12F, -18.5F, -11.5F, 1, 4, 5, 0F); // Core30
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addBox(-11.4F, -20F, -13.5F, 20, 4, 27, 0F); // Core31
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addBox(-27.6F, -11.3F, 20.2F, 24, 6, 1, 0F); // Core32
		bodyModel[31].setRotationPoint(0F, 1F, 0F);

		bodyModel[32].addBox(-25.6F, -14.5F, 20.2F, 24, 6, 1, 0F); // Core33
		bodyModel[32].setRotationPoint(0F, 1F, 0F);
		bodyModel[32].rotateAngleZ = 0.122173F;

		bodyModel[33].addBox(-3.6F, -7.5F, 20.2F, 14, 3, 1, 0F); // Core34
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addBox(-3.6F, -14.5F, -21.2F, 3, 7, 1, 0F); // Core35
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addBox(-3.6F, -18.5F, 20.2F, 14, 4, 1, 0F); // Core36
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addBox(6.4F, -14.5F, -21.2F, 3, 7, 1, 0F); // Core37
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addBox(1.3F, -18.5F, -17.6F, 11, 6, 1, 0F); // Core38
		bodyModel[37].setRotationPoint(0F, 0F, 0F);
		bodyModel[37].rotateAngleY = -0.7853982F;

		bodyModel[38].addBox(-25.6F, 8.5F, -19.6F, 24, 8, 1, 0F); // Core39
		bodyModel[38].setRotationPoint(0F, 1F, 0F);
		bodyModel[38].rotateAngleX = -1.308997F;
		bodyModel[38].rotateAngleZ = 0.122173F;

		bodyModel[39].addBox(-31F, -15.5F, -13.5F, 22, 7, 27, 0F); // Core40
		bodyModel[39].setRotationPoint(0F, 0F, 0F);
		bodyModel[39].rotateAngleZ = 0.1396263F;

		bodyModel[40].addBox(-32.9F, -11.1F, -13.5F, 7, 7, 27, 0F); // Core41
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addBox(-27.6F, -11.3F, 13.2F, 1, 6, 7, 0F); // Core42
		bodyModel[41].setRotationPoint(0F, 1F, 0F);

		bodyModel[42].addBox(-27.6F, -16.3F, -17.5F, 1, 2, 8, 0F); // Core43
		bodyModel[42].setRotationPoint(0F, 1F, 0F);
		bodyModel[42].rotateAngleX = 0.2617994F;

		bodyModel[43].addBox(-31.9F, -4.5F, 12.5F, 6, 7, 1, 0F); // Core44
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addBox(-31.9F, -4.7F, -13.5F, 6, 7, 1, 0F); // Core45
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addBox(-31.9F, 0.3F, 9.7F, 4, 8, 1, 0F); // Core46
		bodyModel[45].setRotationPoint(0F, 0F, 0F);
		bodyModel[45].rotateAngleX = 0.5235988F;

		bodyModel[46].addBox(-31.9F, 0.2F, -10.8F, 4, 8, 1, 0F); // Core47
		bodyModel[46].setRotationPoint(0F, 0F, 0F);
		bodyModel[46].rotateAngleX = -0.5235988F;

		bodyModel[47].addBox(-31.9F, -4.7F, -12.5F, 1, 5, 1, 0F); // Core48
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addBox(-31.9F, -4.4F, -11.5F, 1, 3, 1, 0F); // Core49
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addBox(-31.9F, -4.2F, -10.5F, 1, 1, 1, 0F); // Core50
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addBox(-31.9F, -4.6F, 11.5F, 1, 5, 1, 0F); // Core51
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addBox(-31.9F, -4.4F, 10.5F, 1, 3, 1, 0F); // Core52
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addBox(-31.9F, -4.2F, 9.5F, 1, 1, 1, 0F); // Core53
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addBox(-28.5F, -3F, -6.5F, 1, 9, 13, 0F); // Core54
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addBox(-29F, 4F, 4.5F, 2, 1, 4, 0F); // Core55
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addBox(-29F, -2F, 4.5F, 2, 1, 4, 0F); // Core56
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addBox(-29F, -2F, -8.5F, 2, 1, 4, 0F); // Core57
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addBox(-29F, 4F, -8.5F, 2, 1, 4, 0F); // Core58
		bodyModel[57].setRotationPoint(0F, 0F, 0F);

		bodyModel[58].addBox(-28.7F, -3.5F, -0.5F, 1, 10, 1, 0F); // Core59
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addBox(-0.6F, -14.5F, -21F, 7, 7, 1, 0F); // Core60
		bodyModel[59].setRotationPoint(0F, 0F, 0F);

		bodyModel[60].addBox(-0.6F, -14.5F, 20F, 7, 7, 1, 0F); // Core61
		bodyModel[60].setRotationPoint(0F, 0F, 0F);

		bodyModel[61].addBox(9.4F, -18.5F, -21.2F, 2, 14, 1, 0F); // Core62
		bodyModel[61].setRotationPoint(0F, 0F, 0F);

		bodyModel[62].addBox(3.5F, -20F, -23.8F, 8, 16, 1, 0F); // Core63
		bodyModel[62].setRotationPoint(0F, 0F, 0F);
		bodyModel[62].rotateAngleY = 0.3490658F;

		bodyModel[63].addBox(16F, -7.5F, -18.5F, 1, 3, 12, 0F); // Core64
		bodyModel[63].setRotationPoint(0F, 0F, 0F);

		bodyModel[64].addBox(16F, -18.5F, -10.5F, 1, 11, 4, 0F); // Core65
		bodyModel[64].setRotationPoint(0F, 0F, 0F);

		bodyModel[65].addBox(16F, -18.5F, -18.5F, 1, 11, 2, 0F); // Core66
		bodyModel[65].setRotationPoint(0F, 0F, 0F);

		bodyModel[66].addBox(-14.2F, -22.6F, -7F, 4, 1, 21, 0F); // Core67
		bodyModel[66].setRotationPoint(0F, 0F, 0F);
		bodyModel[66].rotateAngleZ = -1.291544F;

		bodyModel[67].addBox(-7.2F, -22.6F, -7F, 4, 5, 21, 0F); // Core68
		bodyModel[67].setRotationPoint(0F, 0F, 0F);
		bodyModel[67].rotateAngleZ = -1.291544F;

		bodyModel[68].addBox(-11.2F, -22.6F, -7F, 4, 3, 4, 0F); // Core69
		bodyModel[68].setRotationPoint(0F, 0F, 0F);
		bodyModel[68].rotateAngleZ = -1.291544F;

		bodyModel[69].addBox(15.5F, -18.5F, -16.5F, 1, 11, 6, 0F); // Core70
		bodyModel[69].setRotationPoint(0F, 0F, 0F);

		bodyModel[70].addBox(-17.4F, -20F, -12.5F, 11, 4, 11, 0F); // Core71
		bodyModel[70].setRotationPoint(0F, 0F, 0F);
		bodyModel[70].rotateAngleY = 0.7853982F;

		bodyModel[71].addBox(-3.5F, -20F, -21.1F, 15, 4, 15, 0F); // Core72
		bodyModel[71].setRotationPoint(0F, 0F, 0F);

		bodyModel[72].addBox(16F, -20F, -18.5F, 1, 2, 12, 0F); // Core73
		bodyModel[72].setRotationPoint(0F, 0F, 0F);

		bodyModel[73].addBox(17.6F, -21F, -16.5F, 4, 1, 6, 0F); // Core74
		bodyModel[73].setRotationPoint(0F, 0F, 0F);

		bodyModel[74].addBox(3.9F, -21F, -22.7F, 4, 1, 6, 0F); // Core75
		bodyModel[74].setRotationPoint(0F, 0F, 0F);
		bodyModel[74].rotateAngleY = 0.7853982F;

		bodyModel[75].addBox(22.9F, -21F, -2.5F, 4, 1, 6, 0F); // Core76
		bodyModel[75].setRotationPoint(0F, 0F, 0F);
		bodyModel[75].rotateAngleY = -0.7853982F;

		bodyModel[76].addBox(11.4F, -21F, -20.8F, 6, 1, 4, 0F); // Core77
		bodyModel[76].setRotationPoint(0F, 0F, 0F);

		bodyModel[77].addBox(7.2F, -21F, -16.5F, 4, 1, 6, 0F); // Core78
		bodyModel[77].setRotationPoint(0F, 0F, 0F);

		bodyModel[78].addBox(11.2F, -21F, -17.5F, 7, 1, 8, 0F); // Core79
		bodyModel[78].setRotationPoint(0F, 0F, 0F);

		bodyModel[79].addBox(13F, -21.2F, -15F, 3, 1, 3, 0F); // Core80
		bodyModel[79].setRotationPoint(0F, 0F, 0F);

		bodyModel[80].addBox(-6.5F, -21F, -22.8F, 4, 1, 6, 0F); // Core81
		bodyModel[80].setRotationPoint(0F, 0F, 0F);
		bodyModel[80].rotateAngleY = 0.7853982F;

		bodyModel[81].addBox(12.6F, -21F, -2.5F, 4, 1, 6, 0F); // Core82
		bodyModel[81].setRotationPoint(0F, 0F, 0F);
		bodyModel[81].rotateAngleY = -0.7853982F;

		bodyModel[82].addBox(11.4F, -21F, -10.3F, 6, 1, 4, 0F); // Core83
		bodyModel[82].setRotationPoint(0F, 0F, 0F);

		bodyModel[83].addBox(4.3F, -21.2F, -19.2F, 2, 1, 3, 0F); // Core84
		bodyModel[83].setRotationPoint(0F, 0F, 0F);
		bodyModel[83].rotateAngleY = 0.7853982F;

		bodyModel[84].addBox(13F, -21.2F, -9F, 3, 1, 2, 0F); // Core85
		bodyModel[84].setRotationPoint(0F, 0F, 0F);

		bodyModel[85].addBox(1.3F, -21.2F, -16.2F, 3, 1, 2, 0F); // Core86
		bodyModel[85].setRotationPoint(0F, 0F, 0F);
		bodyModel[85].rotateAngleY = 0.7853982F;

		bodyModel[86].addBox(10F, -22.2F, -13.2F, 1, 2, 2, 0F); // Core87
		bodyModel[86].setRotationPoint(0F, 0F, 0F);
		bodyModel[86].rotateAngleY = 0.3316126F;

		bodyModel[87].addBox(20F, -0.6F, -15.5F, 4, 4, 4, 0F); // Core88
		bodyModel[87].setRotationPoint(0F, 0F, 0F);
		bodyModel[87].rotateAngleZ = 0.7853982F;

		bodyModel[88].addBox(15.5F, -14.5F, -15.5F, 4, 4, 4, 0F); // Core89
		bodyModel[88].setRotationPoint(0F, 0F, 0F);

		bodyModel[89].addBox(17.2F, 2.2F, -15.5F, 4, 4, 4, 0F); // Core90
		bodyModel[89].setRotationPoint(0F, 0F, 0F);
		bodyModel[89].rotateAngleZ = 0.7853982F;

		bodyModel[90].addBox(27.6F, -1.3F, -14F, 5, 5, 28, 0F); // Core91
		bodyModel[90].setRotationPoint(0F, 0F, 0F);

		bodyModel[91].addBox(19F, 17F, -14F, 5, 5, 28, 0F); // Core92
		bodyModel[91].setRotationPoint(0F, 0F, 0F);
		bodyModel[91].rotateAngleZ = 0.7853982F;

		bodyModel[92].addBox(15.5F, 20.5F, -14F, 5, 5, 28, 0F); // Core93
		bodyModel[92].setRotationPoint(0F, 0F, 0F);
		bodyModel[92].rotateAngleZ = 0.7853982F;

		bodyModel[93].addBox(26.5F, -15F, -22F, 4, 2, 8, 0F); // Core94
		bodyModel[93].setRotationPoint(0F, 0F, 0F);
		bodyModel[93].rotateAngleZ = -0.3490658F;

		bodyModel[94].addBox(22.8F, -28.2F, 14F, 3, 2, 6, 0F); // Core95
		bodyModel[94].setRotationPoint(0F, 0F, 0F);
		bodyModel[94].rotateAngleZ = -0.8377581F;

		bodyModel[95].addBox(26F, -21.9F, 14F, 3, 2, 7, 0F); // Core96
		bodyModel[95].setRotationPoint(0F, 0F, 0F);
		bodyModel[95].rotateAngleZ = -0.5934119F;

		bodyModel[96].addBox(26F, -21.9F, -21F, 3, 2, 7, 0F); // Core97
		bodyModel[96].setRotationPoint(0F, 0F, 0F);
		bodyModel[96].rotateAngleZ = -0.5934119F;

		bodyModel[97].addBox(17.8F, -26.3F, 14F, 8, 7, 1, 0F); // Core98
		bodyModel[97].setRotationPoint(0F, 0F, 0F);
		bodyModel[97].rotateAngleZ = -0.8377581F;

		bodyModel[98].addBox(22.8F, -28.2F, -20F, 3, 2, 6, 0F); // Core99
		bodyModel[98].setRotationPoint(0F, 0F, 0F);
		bodyModel[98].rotateAngleZ = -0.8377581F;

		bodyModel[99].addBox(17.8F, -26.3F, -15F, 8, 7, 1, 0F); // Core100
		bodyModel[99].setRotationPoint(0F, 0F, 0F);
		bodyModel[99].rotateAngleZ = -0.8377581F;

		bodyModel[100].addBox(-28.5F, -0.5F, 11F, 5, 5, 4, 0F); // Core101
		bodyModel[100].setRotationPoint(0F, 0F, 0F);

		bodyModel[101].addBox(-28.5F, -0.5F, -15F, 5, 5, 4, 0F); // Core102
		bodyModel[101].setRotationPoint(0F, 0F, 0F);

		bodyModel[102].addBox(32.6F, -2.3F, 4F, 1, 7, 2, 0F); // Core103
		bodyModel[102].setRotationPoint(0F, 0F, 0F);

		bodyModel[103].addBox(21.8F, -25.1F, 4F, 1, 5, 2, 0F); // Core104
		bodyModel[103].setRotationPoint(0F, 0F, 0F);
		bodyModel[103].rotateAngleZ = -0.9773844F;

		bodyModel[104].addBox(19.8F, 20.4F, 4F, 1, 6, 2, 0F); // Core105
		bodyModel[104].setRotationPoint(0F, 0F, 0F);
		bodyModel[104].rotateAngleZ = 0.9773844F;

		bodyModel[105].addBox(19.8F, 20.4F, -6F, 1, 6, 2, 0F); // Core106
		bodyModel[105].setRotationPoint(0F, 0F, 0F);
		bodyModel[105].rotateAngleZ = 0.9773844F;

		bodyModel[106].addBox(32.6F, -2.3F, -6F, 1, 7, 2, 0F); // Core107
		bodyModel[106].setRotationPoint(0F, 0F, 0F);

		bodyModel[107].addBox(21.8F, -25.1F, -6F, 1, 5, 2, 0F); // Core108
		bodyModel[107].setRotationPoint(0F, 0F, 0F);
		bodyModel[107].rotateAngleZ = -0.9773844F;

		bodyModel[108].addBox(26.5F, -8.5F, 19F, 1, 4, 1, 0F); // Core109
		bodyModel[108].setRotationPoint(0F, 0F, 0F);

		bodyModel[109].addBox(26.5F, -9F, 16.5F, 1, 1, 3, 0F); // Core110
		bodyModel[109].setRotationPoint(0F, 0F, 0F);

		bodyModel[110].addBox(26.5F, -8.5F, 16F, 1, 4, 1, 0F); // Core111
		bodyModel[110].setRotationPoint(0F, 0F, 0F);

		bodyModel[111].addBox(26F, -8F, 17F, 2, 2, 2, 0F); // Core112
		bodyModel[111].setRotationPoint(0F, 0F, 0F);

		bodyModel[112].addBox(26F, -8F, -19F, 2, 2, 2, 0F); // Core113
		bodyModel[112].setRotationPoint(0F, 0F, 0F);

		bodyModel[113].addBox(26.5F, -8.5F, -20F, 1, 4, 1, 0F); // Core114
		bodyModel[113].setRotationPoint(0F, 0F, 0F);

		bodyModel[114].addBox(26.5F, -9F, -19.5F, 1, 1, 3, 0F); // Core115
		bodyModel[114].setRotationPoint(0F, 0F, 0F);

		bodyModel[115].addBox(26.5F, -8.5F, -17F, 1, 4, 1, 0F); // Core116
		bodyModel[115].setRotationPoint(0F, 0F, 0F);

		bodyModel[116].addBox(-11.2F, -25.6F, -3F, 1, 3, 7, 0F); // Core117
		bodyModel[116].setRotationPoint(0F, 0F, 0F);
		bodyModel[116].rotateAngleZ = -1.291544F;

		bodyModel[117].addBox(15.8F, -23F, 11F, 2, 1, 2, 0F); // Core118
		bodyModel[117].setRotationPoint(0F, 0F, 0F);
		bodyModel[117].rotateAngleZ = -0.715585F;

		bodyModel[118].addBox(15.8F, -23F, 8F, 2, 1, 2, 0F); // Core119
		bodyModel[118].setRotationPoint(0F, 0F, 0F);
		bodyModel[118].rotateAngleZ = -0.715585F;

		bodyModel[119].addBox(25F, -19.1F, 9F, 2, 1, 1, 0F); // Core120
		bodyModel[119].setRotationPoint(0F, 0F, 0F);
		bodyModel[119].rotateAngleZ = -0.7853982F;

		bodyModel[120].addBox(31.6F, 6.6F, 8.5F, 1, 1, 2, 0F); // Core121
		bodyModel[120].setRotationPoint(0F, 0F, 0F);

		bodyModel[121].addBox(31.6F, 5.2F, 8F, 1, 2, 1, 0F); // Core123
		bodyModel[121].setRotationPoint(0F, 0F, 0F);

		bodyModel[122].addBox(31.6F, 5.2F, 10F, 1, 2, 1, 0F); // Core124
		bodyModel[122].setRotationPoint(0F, 0F, 0F);

		bodyModel[123].addBox(31.6F, 6.6F, -10.5F, 1, 1, 2, 0F); // Core125
		bodyModel[123].setRotationPoint(0F, 0F, 0F);

		bodyModel[124].addBox(31.6F, 5.2F, -9F, 1, 2, 1, 0F); // Core126
		bodyModel[124].setRotationPoint(0F, 0F, 0F);

		bodyModel[125].addBox(31.6F, 5.2F, -11F, 1, 2, 1, 0F); // Core127
		bodyModel[125].setRotationPoint(0F, 0F, 0F);

		bodyModel[126].addBox(25F, -19.1F, -10F, 2, 1, 1, 0F); // Core128
		bodyModel[126].setRotationPoint(0F, 0F, 0F);
		bodyModel[126].rotateAngleZ = -0.7853982F;

		bodyModel[127].addBox(7.5F, -21F, -19.5F, 1, 1, 40, 0F); // Core129
		bodyModel[127].setRotationPoint(0F, 0F, 0F);
		bodyModel[127].rotateAngleY = -0.1570796F;

		bodyModel[128].addBox(-10F, -21F, -7.5F, 17, 1, 1, 0F); // Core130
		bodyModel[128].setRotationPoint(0F, 0F, 0F);

		bodyModel[129].addBox(-10.3F, -26.2F, -4.9F, 3, 1, 4, 0F); // Core131
		bodyModel[129].setRotationPoint(0F, 0F, 0F);
		bodyModel[129].rotateAngleX = -0.8377581F;
		bodyModel[129].rotateAngleY = -0.01745329F;
		bodyModel[129].rotateAngleZ = -1.291544F;

		bodyModel[130].addBox(-31.6F, -11.2F, -22F, 6, 2, 9, 0F); // Core132
		bodyModel[130].setRotationPoint(0F, 0F, 0F);
		bodyModel[130].rotateAngleZ = 0.2268928F;

		bodyModel[131].addBox(-31.6F, -11.2F, 13F, 6, 2, 9, 0F); // Core133
		bodyModel[131].setRotationPoint(0F, 0F, 0F);
		bodyModel[131].rotateAngleZ = 0.2268928F;

		bodyModel[132].addBox(-27.4F, -14F, -21F, 11, 4, 7, 0F); // Core134
		bodyModel[132].setRotationPoint(0F, 0F, 0F);

		bodyModel[133].addBox(28.5F, 1.5F, 11F, 5, 5, 4, 0F); // Core135
		bodyModel[133].setRotationPoint(0F, 0F, 0F);

		bodyModel[134].addBox(28.5F, 1.5F, -15F, 5, 5, 4, 0F); // Core136
		bodyModel[134].setRotationPoint(0F, 0F, 0F);

		bodyModel[135].addBox(-27.4F, -14F, 14F, 11, 4, 7, 0F); // Core137
		bodyModel[135].setRotationPoint(0F, 0F, 0F);

		bodyModel[136].addBox(-32.6F, -8F, -15.4F, 2, 2, 2, 0F); // Core138
		bodyModel[136].setRotationPoint(0F, 0F, 0F);

		bodyModel[137].addBox(-32.6F, -8F, 13.4F, 2, 2, 2, 0F); // Core139
		bodyModel[137].setRotationPoint(0F, 0F, 0F);

		bodyModel[138].addBox(-23.2F, -14.3F, 21F, 9, 1, 1, 0F); // Core140
		bodyModel[138].setRotationPoint(0F, 0F, 0F);
		bodyModel[138].rotateAngleY = 0.1745329F;

		bodyModel[139].addBox(-17.2F, -14.3F, 20.5F, 2, 1, 2, 0F); // Core141
		bodyModel[139].setRotationPoint(0F, 0F, 0F);
		bodyModel[139].rotateAngleY = 0.1745329F;

		bodyModel[140].addBox(-26.4F, -14.5F, -17F, 2, 1, 1, 0F); // Core142
		bodyModel[140].setRotationPoint(0F, 0F, 0F);

		bodyModel[141].addBox(-24.4F, -14.5F, -19F, 1, 1, 3, 0F); // Core143
		bodyModel[141].setRotationPoint(0F, 0F, 0F);

		bodyModel[142].addBox(-24.4F, -14.5F, -19F, 7, 1, 1, 0F); // Core144
		bodyModel[142].setRotationPoint(0F, 0F, 0F);

		bodyModel[143].addBox(-19.4F, -15F, -19.5F, 1, 2, 2, 0F); // Core145
		bodyModel[143].setRotationPoint(0F, 0F, 0F);

		bodyModel[144].addBox(-23.4F, -15F, -19.5F, 1, 2, 2, 0F); // Core146
		bodyModel[144].setRotationPoint(0F, 0F, 0F);

		bodyModel[145].addBox(3.4F, -20F, 17.4F, 2, 2, 2, 0F); // Core147
		bodyModel[145].setRotationPoint(0F, 0F, 0F);
		bodyModel[145].rotateAngleY = 0.7853982F;

		bodyModel[146].addBox(-30F, -17F, -11.5F, 1, 2, 2, 0F); // Core148
		bodyModel[146].setRotationPoint(0F, 0F, 0F);
		bodyModel[146].rotateAngleZ = 0.1396263F;

		bodyModel[147].addBox(-26F, -17F, 10.5F, 1, 2, 2, 0F); // Core149
		bodyModel[147].setRotationPoint(0F, 0F, 0F);
		bodyModel[147].rotateAngleZ = 0.1396263F;

		bodyModel[148].addBox(-18F, -17F, -11.5F, 1, 2, 2, 0F); // Core150
		bodyModel[148].setRotationPoint(0F, 0F, 0F);
		bodyModel[148].rotateAngleZ = 0.1396263F;

		bodyModel[149].addBox(-21F, -17F, -0.5F, 1, 2, 2, 0F); // Core151
		bodyModel[149].setRotationPoint(0F, 0F, 0F);
		bodyModel[149].rotateAngleZ = 0.1396263F;

		bodyModel[150].addBox(-18F, -17F, 10.5F, 1, 2, 2, 0F); // Core152
		bodyModel[150].setRotationPoint(0F, 0F, 0F);
		bodyModel[150].rotateAngleZ = 0.1396263F;

		bodyModel[151].addBox(-29.5F, -16.5F, -11F, 13, 1, 1, 0F); // Core153
		bodyModel[151].setRotationPoint(0F, 0F, 0F);
		bodyModel[151].rotateAngleZ = 0.1396263F;

		bodyModel[152].addBox(-28F, -16.5F, 11F, 12, 1, 1, 0F); // Core154
		bodyModel[152].setRotationPoint(0F, 0F, 0F);
		bodyModel[152].rotateAngleZ = 0.1396263F;

		bodyModel[153].addBox(-26F, -17F, -11.5F, 1, 2, 2, 0F); // Core155
		bodyModel[153].setRotationPoint(0F, 0F, 0F);
		bodyModel[153].rotateAngleZ = 0.1396263F;

		bodyModel[154].addBox(-26F, -16.5F, 0F, 7, 1, 1, 0F); // Core156
		bodyModel[154].setRotationPoint(0F, 0F, 0F);
		bodyModel[154].rotateAngleZ = 0.1396263F;

		bodyModel[155].addBox(-24F, -9.5F, -1F, 3, 1, 3, 0F); // Core157
		bodyModel[155].setRotationPoint(0F, 0F, 0F);
		bodyModel[155].rotateAngleZ = -0.2094395F;

		bodyModel[156].addBox(-29F, -16.5F, 1F, 3, 1, 1, 0F); // Core158
		bodyModel[156].setRotationPoint(0F, 0F, 0F);
		bodyModel[156].rotateAngleZ = 0.1396263F;

		bodyModel[157].addBox(-29F, -16.5F, 0F, 1, 1, 1, 0F); // Core159
		bodyModel[157].setRotationPoint(0F, 0F, 0F);
		bodyModel[157].rotateAngleZ = 0.1396263F;

		bodyModel[158].addBox(-29F, -16.5F, -1F, 3, 1, 1, 0F); // Core160
		bodyModel[158].setRotationPoint(0F, 0F, 0F);
		bodyModel[158].rotateAngleZ = 0.1396263F;

		bodyModel[159].addBox(-27F, -16.5F, 0F, 1, 1, 1, 0F); // Core161
		bodyModel[159].setRotationPoint(0F, 0F, 0F);
		bodyModel[159].rotateAngleZ = 0.1396263F;

		bodyModel[160].addBox(-11.5F, -18.5F, -13.5F, 1, 5, 27, 0F); // Core162
		bodyModel[160].setRotationPoint(0F, 0F, 0F);

		bodyModel[161].addBox(6.4F, -14.5F, 20.2F, 3, 7, 1, 0F); // Core209
		bodyModel[161].setRotationPoint(0F, 0F, 0F);

		bodyModel[162].addBox(-3.6F, -14.5F, 20.2F, 3, 7, 1, 0F); // Core210
		bodyModel[162].setRotationPoint(0F, 0F, 0F);

		bodyModel[163].addBox(30F, 1F, -17F, 2, 2, 34, 0F); // CoreWheelBolt1
		bodyModel[163].setRotationPoint(0F, 0F, 0F);

		bodyModel[164].addBox(17F, 0F, -17F, 4, 4, 34, 0F); // CoreWheelBolt2
		bodyModel[164].setRotationPoint(0F, 0F, 0F);

		bodyModel[165].addBox(-17F, 0F, -17F, 4, 4, 34, 0F); // CoreWheelBolt3
		bodyModel[165].setRotationPoint(0F, 0F, 0F);

		bodyModel[166].addBox(0F, 0F, -17F, 4, 4, 34, 0F); // CoreWheelBolt4
		bodyModel[166].setRotationPoint(0F, 0F, 0F);

		bodyModel[167].addBox(-27F, 1F, -17F, 2, 2, 34, 0F); // CoreWheelBolt5
		bodyModel[167].setRotationPoint(0F, 0F, 0F);



// Barrel
		barrelModel = new ModelRendererTurbo[1];
		barrelModel[0] = new ModelRendererTurbo(this,  2,  405, textureX, textureY); // CoreMainTankBarrel

		barrelModel[0].addBox(0F, -1F, -1F, 24, 2, 2, 0F); // CoreMainTankBarrel
		barrelModel[0].setRotationPoint(17F, -12.5F, -13.5F);



// Left Track
		leftTrackModel = new ModelRendererTurbo[48];
		leftTrackModel[0] = new ModelRendererTurbo(this,  189,  8, textureX, textureY); // SuspensionRM1
		leftTrackModel[1] = new ModelRendererTurbo(this,  189,  31, textureX, textureY); // SuspensionRM2
		leftTrackModel[2] = new ModelRendererTurbo(this,  189,  43, textureX, textureY); // SuspensionRM3
		leftTrackModel[3] = new ModelRendererTurbo(this,  189,  31, textureX, textureY); // SuspensionRM4
		leftTrackModel[4] = new ModelRendererTurbo(this,  189,  20, textureX, textureY); // SuspensionRM5
		leftTrackModel[5] = new ModelRendererTurbo(this,  189,  43, textureX, textureY); // SuspensionRM6
		leftTrackModel[6] = new ModelRendererTurbo(this,  189,  20, textureX, textureY); // SuspensionRM7
		leftTrackModel[7] = new ModelRendererTurbo(this,  189,  52, textureX, textureY); // SuspensionRM8
		leftTrackModel[8] = new ModelRendererTurbo(this,  189,  52, textureX, textureY); // SuspensionRM9
		leftTrackModel[9] = new ModelRendererTurbo(this,  189,  52, textureX, textureY); // SuspensionRM10
		leftTrackModel[10] = new ModelRendererTurbo(this,  189,  52, textureX, textureY); // SuspensionRM11
		leftTrackModel[11] = new ModelRendererTurbo(this,  189,  52, textureX, textureY); // SuspensionRM12
		leftTrackModel[12] = new ModelRendererTurbo(this,  189,  52, textureX, textureY); // SuspensionRM13
		leftTrackModel[13] = new ModelRendererTurbo(this,  189,  8, textureX, textureY); // SuspensionRB1
		leftTrackModel[14] = new ModelRendererTurbo(this,  189,  31, textureX, textureY); // SuspensionRB2
		leftTrackModel[15] = new ModelRendererTurbo(this,  189,  43, textureX, textureY); // SuspensionRB3
		leftTrackModel[16] = new ModelRendererTurbo(this,  189,  31, textureX, textureY); // SuspensionRB4
		leftTrackModel[17] = new ModelRendererTurbo(this,  189,  20, textureX, textureY); // SuspensionRB5
		leftTrackModel[18] = new ModelRendererTurbo(this,  189,  43, textureX, textureY); // SuspensionRB6
		leftTrackModel[19] = new ModelRendererTurbo(this,  189,  20, textureX, textureY); // SuspensionRB7
		leftTrackModel[20] = new ModelRendererTurbo(this,  189,  52, textureX, textureY); // SuspensionRB8
		leftTrackModel[21] = new ModelRendererTurbo(this,  189,  52, textureX, textureY); // SuspensionRB9
		leftTrackModel[22] = new ModelRendererTurbo(this,  189,  52, textureX, textureY); // SuspensionRB10
		leftTrackModel[23] = new ModelRendererTurbo(this,  189,  52, textureX, textureY); // SuspensionRB11
		leftTrackModel[24] = new ModelRendererTurbo(this,  189,  52, textureX, textureY); // SuspensionRB12
		leftTrackModel[25] = new ModelRendererTurbo(this,  189,  52, textureX, textureY); // SuspensionRB13
		leftTrackModel[26] = new ModelRendererTurbo(this,  189,  8, textureX, textureY); // SuspensionRF1
		leftTrackModel[27] = new ModelRendererTurbo(this,  189,  31, textureX, textureY); // SuspensionRF2
		leftTrackModel[28] = new ModelRendererTurbo(this,  189,  43, textureX, textureY); // SuspensionRF3
		leftTrackModel[29] = new ModelRendererTurbo(this,  189,  31, textureX, textureY); // SuspensionRF4
		leftTrackModel[30] = new ModelRendererTurbo(this,  189,  20, textureX, textureY); // SuspensionRF5
		leftTrackModel[31] = new ModelRendererTurbo(this,  189,  43, textureX, textureY); // SuspensionRF6
		leftTrackModel[32] = new ModelRendererTurbo(this,  189,  20, textureX, textureY); // SuspensionRF7
		leftTrackModel[33] = new ModelRendererTurbo(this,  189,  52, textureX, textureY); // SuspensionRF9
		leftTrackModel[34] = new ModelRendererTurbo(this,  189,  52, textureX, textureY); // SuspensionRF8
		leftTrackModel[35] = new ModelRendererTurbo(this,  189,  52, textureX, textureY); // SuspensionRF10
		leftTrackModel[36] = new ModelRendererTurbo(this,  189,  52, textureX, textureY); // SuspensionRF11
		leftTrackModel[37] = new ModelRendererTurbo(this,  189,  52, textureX, textureY); // SuspensionRF12
		leftTrackModel[38] = new ModelRendererTurbo(this,  189,  52, textureX, textureY); // SuspensionRF13
		leftTrackModel[39] = new ModelRendererTurbo(this,  234,  30, textureX, textureY); // Tracks1R
		leftTrackModel[40] = new ModelRendererTurbo(this,  234,  20, textureX, textureY); // Tracks2R
		leftTrackModel[41] = new ModelRendererTurbo(this,  234,  11, textureX, textureY); // Tracks3R
		leftTrackModel[42] = new ModelRendererTurbo(this,  234,  42, textureX, textureY); // Tracks4R
		leftTrackModel[43] = new ModelRendererTurbo(this,  234,  65, textureX, textureY); // Tracks5R
		leftTrackModel[44] = new ModelRendererTurbo(this,  234,  86, textureX, textureY); // Tracks6R
		leftTrackModel[45] = new ModelRendererTurbo(this,  234,  108, textureX, textureY); // Tracks7R
		leftTrackModel[46] = new ModelRendererTurbo(this,  234,  121, textureX, textureY); // Tracks8R
		leftTrackModel[47] = new ModelRendererTurbo(this,  234,  142, textureX, textureY); // Tracks9R

		leftTrackModel[0].addBox(-1.5F, -3.5F, -1.5F, 3, 3, 3, 0F); // SuspensionRM1
		leftTrackModel[0].setRotationPoint(2F, 2F, -19F);

		leftTrackModel[1].addBox(1.5F, -2.5F, -2.5F, 1, 2, 5, 0F); // SuspensionRM2
		leftTrackModel[1].setRotationPoint(2F, 2F, -19F);

		leftTrackModel[2].addBox(1.2F, 2.3F, -2.5F, 3, 1, 5, 0F); // SuspensionRM3
		leftTrackModel[2].setRotationPoint(2F, 2F, -19F);
		leftTrackModel[2].rotateAngleZ = -1.134464F;

		leftTrackModel[3].addBox(-2.5F, -2.5F, -2.5F, 1, 2, 5, 0F); // SuspensionRM4
		leftTrackModel[3].setRotationPoint(2F, 2F, -19F);

		leftTrackModel[4].addBox(-0.5F, -2.5F, -2F, 1, 2, 4, 0F); // SuspensionRM5
		leftTrackModel[4].setRotationPoint(2F, 2F, -19F);

		leftTrackModel[5].addBox(-4.2F, 2.3F, -2.5F, 3, 1, 5, 0F); // SuspensionRM6
		leftTrackModel[5].setRotationPoint(2F, 2F, -19F);
		leftTrackModel[5].rotateAngleZ = 1.134464F;

		leftTrackModel[6].addBox(-1.5F, 2.5F, -2.5F, 3, 3, 5, 0F); // SuspensionRM7
		leftTrackModel[6].setRotationPoint(2F, 2F, -19F);

		leftTrackModel[7].addBox(-4.2F, 3.3F, 1F, 2, 3, 1, 0F); // SuspensionRM8
		leftTrackModel[7].setRotationPoint(2F, 2F, -19F);
		leftTrackModel[7].rotateAngleZ = 1.134464F;

		leftTrackModel[8].addBox(-4.2F, 3.3F, -2F, 2, 3, 1, 0F); // SuspensionRM9
		leftTrackModel[8].setRotationPoint(2F, 2F, -19F);
		leftTrackModel[8].rotateAngleZ = 1.134464F;

		leftTrackModel[9].addBox(-3.7F, 6.3F, -2F, 1, 1, 4, 0F); // SuspensionRM10
		leftTrackModel[9].setRotationPoint(2F, 2F, -19F);
		leftTrackModel[9].rotateAngleZ = 1.134464F;

		leftTrackModel[10].addBox(2.2F, 3.3F, 1F, 2, 3, 1, 0F); // SuspensionRM11
		leftTrackModel[10].setRotationPoint(2F, 2F, -19F);
		leftTrackModel[10].rotateAngleZ = -1.134464F;

		leftTrackModel[11].addBox(2.2F, 3.3F, -2F, 2, 3, 1, 0F); // SuspensionRM12
		leftTrackModel[11].setRotationPoint(2F, 2F, -19F);
		leftTrackModel[11].rotateAngleZ = -1.134464F;

		leftTrackModel[12].addBox(2.7F, 6.3F, -2F, 1, 1, 4, 0F); // SuspensionRM13
		leftTrackModel[12].setRotationPoint(2F, 2F, -19F);
		leftTrackModel[12].rotateAngleZ = -1.134464F;

		leftTrackModel[13].addBox(-1.5F, -3.5F, -1.5F, 3, 3, 3, 0F); // SuspensionRB1
		leftTrackModel[13].setRotationPoint(-15F, 2F, -19F);

		leftTrackModel[14].addBox(1.5F, -2.5F, -2.5F, 1, 2, 5, 0F); // SuspensionRB2
		leftTrackModel[14].setRotationPoint(-15F, 2F, -19F);

		leftTrackModel[15].addBox(1.2F, 2.3F, -2.5F, 3, 1, 5, 0F); // SuspensionRB3
		leftTrackModel[15].setRotationPoint(-15F, 2F, -19F);
		leftTrackModel[15].rotateAngleZ = -1.134464F;

		leftTrackModel[16].addBox(-2.5F, -2.5F, -2.5F, 1, 2, 5, 0F); // SuspensionRB4
		leftTrackModel[16].setRotationPoint(-15F, 2F, -19F);

		leftTrackModel[17].addBox(-0.5F, -2.5F, -2F, 1, 2, 4, 0F); // SuspensionRB5
		leftTrackModel[17].setRotationPoint(-15F, 2F, -19F);

		leftTrackModel[18].addBox(-4.2F, 2.3F, -2.5F, 3, 1, 5, 0F); // SuspensionRB6
		leftTrackModel[18].setRotationPoint(-15F, 2F, -19F);
		leftTrackModel[18].rotateAngleZ = 1.134464F;

		leftTrackModel[19].addBox(-1.5F, 2.5F, -2.5F, 3, 3, 5, 0F); // SuspensionRB7
		leftTrackModel[19].setRotationPoint(-15F, 2F, -19F);

		leftTrackModel[20].addBox(-4.2F, 3.3F, 1F, 2, 3, 1, 0F); // SuspensionRB8
		leftTrackModel[20].setRotationPoint(-15F, 2F, -19F);
		leftTrackModel[20].rotateAngleZ = 1.134464F;

		leftTrackModel[21].addBox(-4.2F, 3.3F, -2F, 2, 3, 1, 0F); // SuspensionRB9
		leftTrackModel[21].setRotationPoint(-15F, 2F, -19F);
		leftTrackModel[21].rotateAngleZ = 1.134464F;

		leftTrackModel[22].addBox(-3.7F, 6.3F, -2F, 1, 1, 4, 0F); // SuspensionRB10
		leftTrackModel[22].setRotationPoint(-15F, 2F, -19F);
		leftTrackModel[22].rotateAngleZ = 1.134464F;

		leftTrackModel[23].addBox(2.2F, 3.3F, 1F, 2, 3, 1, 0F); // SuspensionRB11
		leftTrackModel[23].setRotationPoint(-15F, 2F, -19F);
		leftTrackModel[23].rotateAngleZ = -1.134464F;

		leftTrackModel[24].addBox(2.2F, 3.3F, -2F, 2, 3, 1, 0F); // SuspensionRB12
		leftTrackModel[24].setRotationPoint(-15F, 2F, -19F);
		leftTrackModel[24].rotateAngleZ = -1.134464F;

		leftTrackModel[25].addBox(2.7F, 6.3F, -2F, 1, 1, 4, 0F); // SuspensionRB13
		leftTrackModel[25].setRotationPoint(-15F, 2F, -19F);
		leftTrackModel[25].rotateAngleZ = -1.134464F;

		leftTrackModel[26].addBox(-1.5F, -3.5F, -1.5F, 3, 3, 3, 0F); // SuspensionRF1
		leftTrackModel[26].setRotationPoint(19F, 2F, -19F);

		leftTrackModel[27].addBox(1.5F, -2.5F, -2.5F, 1, 2, 5, 0F); // SuspensionRF2
		leftTrackModel[27].setRotationPoint(19F, 2F, -19F);

		leftTrackModel[28].addBox(1.2F, 2.3F, -2.5F, 3, 1, 5, 0F); // SuspensionRF3
		leftTrackModel[28].setRotationPoint(19F, 2F, -19F);
		leftTrackModel[28].rotateAngleZ = -1.134464F;

		leftTrackModel[29].addBox(-2.5F, -2.5F, -2.5F, 1, 2, 5, 0F); // SuspensionRF4
		leftTrackModel[29].setRotationPoint(19F, 2F, -19F);

		leftTrackModel[30].addBox(-0.5F, -2.5F, -2F, 1, 2, 4, 0F); // SuspensionRF5
		leftTrackModel[30].setRotationPoint(19F, 2F, -19F);

		leftTrackModel[31].addBox(-4.2F, 2.3F, -2.5F, 3, 1, 5, 0F); // SuspensionRF6
		leftTrackModel[31].setRotationPoint(19F, 2F, -19F);
		leftTrackModel[31].rotateAngleZ = 1.134464F;

		leftTrackModel[32].addBox(-1.5F, 2.5F, -2.5F, 3, 3, 5, 0F); // SuspensionRF7
		leftTrackModel[32].setRotationPoint(19F, 2F, -19F);

		leftTrackModel[33].addBox(-4.2F, 3.3F, -2F, 2, 3, 1, 0F); // SuspensionRF9
		leftTrackModel[33].setRotationPoint(19F, 2F, -19F);
		leftTrackModel[33].rotateAngleZ = 1.134464F;

		leftTrackModel[34].addBox(-4.2F, 3.3F, 1F, 2, 3, 1, 0F); // SuspensionRF8
		leftTrackModel[34].setRotationPoint(19F, 2F, -19F);
		leftTrackModel[34].rotateAngleZ = 1.134464F;

		leftTrackModel[35].addBox(-3.7F, 6.3F, -2F, 1, 1, 4, 0F); // SuspensionRF10
		leftTrackModel[35].setRotationPoint(19F, 2F, -19F);
		leftTrackModel[35].rotateAngleZ = 1.134464F;

		leftTrackModel[36].addBox(2.2F, 3.3F, 1F, 2, 3, 1, 0F); // SuspensionRF11
		leftTrackModel[36].setRotationPoint(19F, 2F, -19F);
		leftTrackModel[36].rotateAngleZ = -1.134464F;

		leftTrackModel[37].addBox(2.2F, 3.3F, -2F, 2, 3, 1, 0F); // SuspensionRF12
		leftTrackModel[37].setRotationPoint(19F, 2F, -19F);
		leftTrackModel[37].rotateAngleZ = -1.134464F;

		leftTrackModel[38].addBox(2.7F, 6.3F, -2F, 1, 1, 4, 0F); // SuspensionRF13
		leftTrackModel[38].setRotationPoint(19F, 2F, -19F);
		leftTrackModel[38].rotateAngleZ = -1.134464F;

		leftTrackModel[39].addBox(-30.3F, -0.1F, -22F, 1, 4, 7, 0F); // Tracks1R
		leftTrackModel[39].setRotationPoint(0F, 0F, 0F);

		leftTrackModel[40].addBox(-22.9F, -19.8F, -22F, 3, 1, 7, 0F); // Tracks2R
		leftTrackModel[40].setRotationPoint(0F, 0F, 0F);
		leftTrackModel[40].rotateAngleZ = 0.715585F;

		leftTrackModel[41].addBox(-28F, -2F, -22F, 61, 1, 7, 0F); // Tracks3R
		leftTrackModel[41].setRotationPoint(0F, 0F, 0F);

		leftTrackModel[42].addBox(-23.6F, -19.4F, -22F, 1, 10, 7, 0F); // Tracks4R
		leftTrackModel[42].setRotationPoint(0F, 0F, 0F);
		leftTrackModel[42].rotateAngleZ = 0.8203048F;

		leftTrackModel[43].addBox(22.2F, -24.7F, -22F, 3, 1, 7, 0F); // Tracks5R
		leftTrackModel[43].setRotationPoint(0F, 0F, 0F);
		leftTrackModel[43].rotateAngleZ = -0.7853982F;

		leftTrackModel[44].addBox(0.5F, -35.3F, -22F, 4, 1, 7, 0F); // Tracks6R
		leftTrackModel[44].setRotationPoint(0F, 0F, 0F);
		leftTrackModel[44].rotateAngleZ = -1.570796F;

		leftTrackModel[45].addBox(-21.6F, -28.2F, -22F, 3, 1, 7, 0F); // Tracks7R
		leftTrackModel[45].setRotationPoint(0F, 0F, 0F);
		leftTrackModel[45].rotateAngleZ = -2.356194F;

		leftTrackModel[46].addBox(-22.4F, -25.3F, -22F, 8, 1, 7, 0F); // Tracks8R
		leftTrackModel[46].setRotationPoint(0F, 0F, 0F);
		leftTrackModel[46].rotateAngleZ = -2.495821F;

		leftTrackModel[47].addBox(-23F, 10F, -22F, 50, 1, 7, 0F); // Tracks9R
		leftTrackModel[47].setRotationPoint(0F, 0F, 0F);



// Right Track
		rightTrackModel = new ModelRendererTurbo[48];
		rightTrackModel[0] = new ModelRendererTurbo(this,  189,  8, textureX, textureY); // SuspensionLM1
		rightTrackModel[1] = new ModelRendererTurbo(this,  189,  31, textureX, textureY); // SuspensionLM2
		rightTrackModel[2] = new ModelRendererTurbo(this,  189,  43, textureX, textureY); // SuspensionLM3
		rightTrackModel[3] = new ModelRendererTurbo(this,  189,  31, textureX, textureY); // SuspensionLM4
		rightTrackModel[4] = new ModelRendererTurbo(this,  189,  20, textureX, textureY); // SuspensionLM5
		rightTrackModel[5] = new ModelRendererTurbo(this,  189,  43, textureX, textureY); // SuspensionLM6
		rightTrackModel[6] = new ModelRendererTurbo(this,  189,  20, textureX, textureY); // SuspensionLM7
		rightTrackModel[7] = new ModelRendererTurbo(this,  189,  52, textureX, textureY); // SuspensionLM8
		rightTrackModel[8] = new ModelRendererTurbo(this,  189,  52, textureX, textureY); // SuspensionLM9
		rightTrackModel[9] = new ModelRendererTurbo(this,  189,  52, textureX, textureY); // SuspensionLM10
		rightTrackModel[10] = new ModelRendererTurbo(this,  189,  52, textureX, textureY); // SuspensionLM11
		rightTrackModel[11] = new ModelRendererTurbo(this,  189,  52, textureX, textureY); // SuspensionLM12
		rightTrackModel[12] = new ModelRendererTurbo(this,  189,  52, textureX, textureY); // SuspensionLM13
		rightTrackModel[13] = new ModelRendererTurbo(this,  189,  8, textureX, textureY); // SuspensionlF1
		rightTrackModel[14] = new ModelRendererTurbo(this,  189,  31, textureX, textureY); // SuspensionlF2
		rightTrackModel[15] = new ModelRendererTurbo(this,  189,  43, textureX, textureY); // SuspensionlF3
		rightTrackModel[16] = new ModelRendererTurbo(this,  189,  31, textureX, textureY); // SuspensionlF4
		rightTrackModel[17] = new ModelRendererTurbo(this,  189,  20, textureX, textureY); // SuspensionF5
		rightTrackModel[18] = new ModelRendererTurbo(this,  189,  43, textureX, textureY); // SuspensionlF6
		rightTrackModel[19] = new ModelRendererTurbo(this,  189,  20, textureX, textureY); // SuspensionLF7
		rightTrackModel[20] = new ModelRendererTurbo(this,  189,  52, textureX, textureY); // SuspensionLF8
		rightTrackModel[21] = new ModelRendererTurbo(this,  189,  52, textureX, textureY); // SuspensionLF9
		rightTrackModel[22] = new ModelRendererTurbo(this,  189,  52, textureX, textureY); // SuspensionLF10
		rightTrackModel[23] = new ModelRendererTurbo(this,  189,  52, textureX, textureY); // SuspensionLF11
		rightTrackModel[24] = new ModelRendererTurbo(this,  189,  52, textureX, textureY); // SuspensionLF12
		rightTrackModel[25] = new ModelRendererTurbo(this,  189,  52, textureX, textureY); // SuspensionLF13
		rightTrackModel[26] = new ModelRendererTurbo(this,  189,  8, textureX, textureY); // SuspensionLB1
		rightTrackModel[27] = new ModelRendererTurbo(this,  189,  31, textureX, textureY); // SuspensionLB2
		rightTrackModel[28] = new ModelRendererTurbo(this,  189,  43, textureX, textureY); // SuspensionLB3
		rightTrackModel[29] = new ModelRendererTurbo(this,  189,  31, textureX, textureY); // SuspensionLB4
		rightTrackModel[30] = new ModelRendererTurbo(this,  189,  20, textureX, textureY); // SuspensionLB5
		rightTrackModel[31] = new ModelRendererTurbo(this,  189,  43, textureX, textureY); // SuspensionLB6
		rightTrackModel[32] = new ModelRendererTurbo(this,  189,  20, textureX, textureY); // SuspensionLB7
		rightTrackModel[33] = new ModelRendererTurbo(this,  189,  52, textureX, textureY); // SuspensionLB8
		rightTrackModel[34] = new ModelRendererTurbo(this,  189,  52, textureX, textureY); // SuspensionLB9
		rightTrackModel[35] = new ModelRendererTurbo(this,  189,  52, textureX, textureY); // SuspensionLB10
		rightTrackModel[36] = new ModelRendererTurbo(this,  189,  52, textureX, textureY); // SuspensionLB11
		rightTrackModel[37] = new ModelRendererTurbo(this,  189,  52, textureX, textureY); // SuspensionLB12
		rightTrackModel[38] = new ModelRendererTurbo(this,  189,  52, textureX, textureY); // SuspensionLB13
		rightTrackModel[39] = new ModelRendererTurbo(this,  234,  30, textureX, textureY); // Tracks1L
		rightTrackModel[40] = new ModelRendererTurbo(this,  234,  20, textureX, textureY); // Tracks2L
		rightTrackModel[41] = new ModelRendererTurbo(this,  234,  11, textureX, textureY); // Tracks3L
		rightTrackModel[42] = new ModelRendererTurbo(this,  234,  42, textureX, textureY); // Tracks4L
		rightTrackModel[43] = new ModelRendererTurbo(this,  234,  65, textureX, textureY); // Tracks5L
		rightTrackModel[44] = new ModelRendererTurbo(this,  234,  86, textureX, textureY); // Tracks6L
		rightTrackModel[45] = new ModelRendererTurbo(this,  234,  108, textureX, textureY); // Tracks7L
		rightTrackModel[46] = new ModelRendererTurbo(this,  234,  121, textureX, textureY); // Tracks8L
		rightTrackModel[47] = new ModelRendererTurbo(this,  234,  142, textureX, textureY); // Tracks9L

		rightTrackModel[0].addBox(-1.5F, -3.5F, -1.5F, 3, 3, 3, 0F); // SuspensionLM1
		rightTrackModel[0].setRotationPoint(2F, 2F, 19F);

		rightTrackModel[1].addBox(1.5F, -2.5F, -2.5F, 1, 2, 5, 0F); // SuspensionLM2
		rightTrackModel[1].setRotationPoint(2F, 2F, 19F);

		rightTrackModel[2].addBox(1.2F, 2.3F, -2.5F, 3, 1, 5, 0F); // SuspensionLM3
		rightTrackModel[2].setRotationPoint(2F, 2F, 19F);
		rightTrackModel[2].rotateAngleZ = -1.134464F;

		rightTrackModel[3].addBox(-2.5F, -2.5F, -2.5F, 1, 2, 5, 0F); // SuspensionLM4
		rightTrackModel[3].setRotationPoint(2F, 2F, 19F);

		rightTrackModel[4].addBox(-0.5F, -2.5F, -2F, 1, 2, 4, 0F); // SuspensionLM5
		rightTrackModel[4].setRotationPoint(2F, 2F, 19F);

		rightTrackModel[5].addBox(-4.2F, 2.3F, -2.5F, 3, 1, 5, 0F); // SuspensionLM6
		rightTrackModel[5].setRotationPoint(2F, 2F, 19F);
		rightTrackModel[5].rotateAngleZ = 1.134464F;

		rightTrackModel[6].addBox(-1.5F, 2.5F, -2.5F, 3, 3, 5, 0F); // SuspensionLM7
		rightTrackModel[6].setRotationPoint(2F, 2F, 19F);

		rightTrackModel[7].addBox(-4.2F, 3.3F, 1F, 2, 3, 1, 0F); // SuspensionLM8
		rightTrackModel[7].setRotationPoint(2F, 2F, 19F);
		rightTrackModel[7].rotateAngleZ = 1.134464F;

		rightTrackModel[8].addBox(-4.2F, 3.3F, -2F, 2, 3, 1, 0F); // SuspensionLM9
		rightTrackModel[8].setRotationPoint(2F, 2F, 19F);
		rightTrackModel[8].rotateAngleZ = 1.134464F;

		rightTrackModel[9].addBox(-3.7F, 6.3F, -2F, 1, 1, 4, 0F); // SuspensionLM10
		rightTrackModel[9].setRotationPoint(2F, 2F, 19F);
		rightTrackModel[9].rotateAngleZ = 1.134464F;

		rightTrackModel[10].addBox(2.2F, 3.3F, 1F, 2, 3, 1, 0F); // SuspensionLM11
		rightTrackModel[10].setRotationPoint(2F, 2F, 19F);
		rightTrackModel[10].rotateAngleZ = -1.134464F;

		rightTrackModel[11].addBox(2.2F, 3.3F, -3F, 2, 3, 1, 0F); // SuspensionLM12
		rightTrackModel[11].setRotationPoint(2F, 2F, 19F);
		rightTrackModel[11].rotateAngleZ = -1.134464F;

		rightTrackModel[12].addBox(2.7F, 6.3F, -2F, 1, 1, 4, 0F); // SuspensionLM13
		rightTrackModel[12].setRotationPoint(2F, 2F, 19F);
		rightTrackModel[12].rotateAngleZ = -1.134464F;

		rightTrackModel[13].addBox(-1.5F, -3.5F, -1.5F, 3, 3, 3, 0F); // SuspensionlF1
		rightTrackModel[13].setRotationPoint(19F, 2F, 19F);

		rightTrackModel[14].addBox(1.5F, -2.5F, -2.5F, 1, 2, 5, 0F); // SuspensionlF2
		rightTrackModel[14].setRotationPoint(19F, 2F, 19F);

		rightTrackModel[15].addBox(1.2F, 2.3F, -2.5F, 3, 1, 5, 0F); // SuspensionlF3
		rightTrackModel[15].setRotationPoint(19F, 2F, 19F);
		rightTrackModel[15].rotateAngleZ = -1.134464F;

		rightTrackModel[16].addBox(-2.5F, -2.5F, -2.5F, 1, 2, 5, 0F); // SuspensionlF4
		rightTrackModel[16].setRotationPoint(19F, 2F, 19F);

		rightTrackModel[17].addBox(-0.5F, -2.5F, -2F, 1, 2, 4, 0F); // SuspensionF5
		rightTrackModel[17].setRotationPoint(19F, 2F, 19F);

		rightTrackModel[18].addBox(-4.2F, 2.3F, -2.5F, 3, 1, 5, 0F); // SuspensionlF6
		rightTrackModel[18].setRotationPoint(19F, 2F, 19F);
		rightTrackModel[18].rotateAngleZ = 1.134464F;

		rightTrackModel[19].addBox(-1.5F, 2.5F, -2.5F, 3, 3, 5, 0F); // SuspensionLF7
		rightTrackModel[19].setRotationPoint(19F, 2F, 19F);

		rightTrackModel[20].addBox(-4.2F, 3.3F, 1F, 2, 3, 1, 0F); // SuspensionLF8
		rightTrackModel[20].setRotationPoint(19F, 2F, 19F);
		rightTrackModel[20].rotateAngleZ = 1.134464F;

		rightTrackModel[21].addBox(-4.2F, 3.3F, -2F, 2, 3, 1, 0F); // SuspensionLF9
		rightTrackModel[21].setRotationPoint(19F, 2F, 19F);
		rightTrackModel[21].rotateAngleZ = 1.134464F;

		rightTrackModel[22].addBox(-3.7F, 6.3F, -2F, 1, 1, 4, 0F); // SuspensionLF10
		rightTrackModel[22].setRotationPoint(19F, 2F, 19F);
		rightTrackModel[22].rotateAngleZ = 1.134464F;

		rightTrackModel[23].addBox(2.2F, 3.3F, 1F, 2, 3, 1, 0F); // SuspensionLF11
		rightTrackModel[23].setRotationPoint(19F, 2F, 19F);
		rightTrackModel[23].rotateAngleZ = -1.134464F;

		rightTrackModel[24].addBox(2.2F, 3.3F, -2F, 2, 3, 1, 0F); // SuspensionLF12
		rightTrackModel[24].setRotationPoint(19F, 2F, 19F);
		rightTrackModel[24].rotateAngleZ = -1.134464F;

		rightTrackModel[25].addBox(2.7F, 6.3F, -2F, 1, 1, 4, 0F); // SuspensionLF13
		rightTrackModel[25].setRotationPoint(19F, 2F, 19F);
		rightTrackModel[25].rotateAngleZ = -1.134464F;

		rightTrackModel[26].addBox(-1.5F, -3.5F, -1.5F, 3, 3, 3, 0F); // SuspensionLB1
		rightTrackModel[26].setRotationPoint(-15F, 2F, 19F);

		rightTrackModel[27].addBox(1.5F, -2.5F, -2.5F, 1, 2, 5, 0F); // SuspensionLB2
		rightTrackModel[27].setRotationPoint(-15F, 2F, 19F);

		rightTrackModel[28].addBox(1.2F, 2.3F, -2.5F, 3, 1, 5, 0F); // SuspensionLB3
		rightTrackModel[28].setRotationPoint(-15F, 2F, 19F);
		rightTrackModel[28].rotateAngleZ = -1.134464F;

		rightTrackModel[29].addBox(-2.5F, -2.5F, -2.5F, 1, 2, 5, 0F); // SuspensionLB4
		rightTrackModel[29].setRotationPoint(-15F, 2F, 19F);

		rightTrackModel[30].addBox(-0.5F, -2.5F, -2F, 1, 2, 4, 0F); // SuspensionLB5
		rightTrackModel[30].setRotationPoint(-15F, 2F, 19F);

		rightTrackModel[31].addBox(-4.2F, 2.3F, -2.5F, 3, 1, 5, 0F); // SuspensionLB6
		rightTrackModel[31].setRotationPoint(-15F, 2F, 19F);
		rightTrackModel[31].rotateAngleZ = 1.134464F;

		rightTrackModel[32].addBox(-1.5F, 2.5F, -2.5F, 3, 3, 5, 0F); // SuspensionLB7
		rightTrackModel[32].setRotationPoint(-15F, 2F, 19F);

		rightTrackModel[33].addBox(-4.2F, 3.3F, 1F, 2, 3, 1, 0F); // SuspensionLB8
		rightTrackModel[33].setRotationPoint(-15F, 2F, 19F);
		rightTrackModel[33].rotateAngleZ = 1.134464F;

		rightTrackModel[34].addBox(-4.2F, 3.3F, -2F, 2, 3, 1, 0F); // SuspensionLB9
		rightTrackModel[34].setRotationPoint(-15F, 2F, 19F);
		rightTrackModel[34].rotateAngleZ = 1.134464F;

		rightTrackModel[35].addBox(-3.7F, 6.3F, -2F, 1, 1, 4, 0F); // SuspensionLB10
		rightTrackModel[35].setRotationPoint(-15F, 2F, 19F);
		rightTrackModel[35].rotateAngleZ = 1.134464F;

		rightTrackModel[36].addBox(2.2F, 3.3F, 1F, 2, 3, 1, 0F); // SuspensionLB11
		rightTrackModel[36].setRotationPoint(-15F, 2F, 19F);
		rightTrackModel[36].rotateAngleZ = -1.134464F;

		rightTrackModel[37].addBox(2.2F, 3.3F, -2F, 2, 3, 1, 0F); // SuspensionLB12
		rightTrackModel[37].setRotationPoint(-15F, 2F, 19F);
		rightTrackModel[37].rotateAngleZ = -1.134464F;

		rightTrackModel[38].addBox(2.7F, 6.3F, -2F, 1, 1, 4, 0F); // SuspensionLB13
		rightTrackModel[38].setRotationPoint(-15F, 2F, 19F);
		rightTrackModel[38].rotateAngleZ = -1.134464F;

		rightTrackModel[39].addBox(-30.3F, -0.1F, 15F, 1, 4, 7, 0F); // Tracks1L
		rightTrackModel[39].setRotationPoint(0F, 0F, 0F);

		rightTrackModel[40].addBox(-22.9F, -19.8F, 15F, 3, 1, 7, 0F); // Tracks2L
		rightTrackModel[40].setRotationPoint(0F, 0F, 0F);
		rightTrackModel[40].rotateAngleZ = 0.715585F;

		rightTrackModel[41].addBox(-28F, -2F, 15F, 61, 1, 7, 0F); // Tracks3L
		rightTrackModel[41].setRotationPoint(0F, 0F, 0F);

		rightTrackModel[42].addBox(-23.6F, -19.4F, 15F, 1, 10, 7, 0F); // Tracks4L
		rightTrackModel[42].setRotationPoint(0F, 0F, 0F);
		rightTrackModel[42].rotateAngleZ = 0.8203048F;

		rightTrackModel[43].addBox(22.2F, -24.7F, 15F, 3, 1, 7, 0F); // Tracks5L
		rightTrackModel[43].setRotationPoint(0F, 0F, 0F);
		rightTrackModel[43].rotateAngleZ = -0.7853982F;

		rightTrackModel[44].addBox(0.5F, -35.3F, 15F, 4, 1, 7, 0F); // Tracks6L
		rightTrackModel[44].setRotationPoint(0F, 0F, 0F);
		rightTrackModel[44].rotateAngleZ = -1.570796F;

		rightTrackModel[45].addBox(-21.6F, -28.2F, 15F, 3, 1, 7, 0F); // Tracks7L
		rightTrackModel[45].setRotationPoint(0F, 0F, 0F);
		rightTrackModel[45].rotateAngleZ = -2.356194F;

		rightTrackModel[46].addBox(-22.4F, -25.3F, 15F, 8, 1, 7, 0F); // Tracks8L
		rightTrackModel[46].setRotationPoint(0F, 0F, 0F);
		rightTrackModel[46].rotateAngleZ = -2.495821F;

		rightTrackModel[47].addBox(-23F, 10F, 15F, 50, 1, 7, 0F); // Tracks9L
		rightTrackModel[47].setRotationPoint(0F, 0F, 0F);



// Left Track Wheel
		leftTrackWheelModels = new ModelRendererTurbo[61];
		leftTrackWheelModels[0] = new ModelRendererTurbo(this,  189,  63, textureX, textureY); // WheelsRM14
		leftTrackWheelModels[1] = new ModelRendererTurbo(this,  189,  63, textureX, textureY); // WheelsRM15
		leftTrackWheelModels[2] = new ModelRendererTurbo(this,  189,  75, textureX, textureY); // WheelsRM16
		leftTrackWheelModels[3] = new ModelRendererTurbo(this,  189,  75, textureX, textureY); // WheelsRM17
		leftTrackWheelModels[4] = new ModelRendererTurbo(this,  189,  75, textureX, textureY); // WheelsRM18
		leftTrackWheelModels[5] = new ModelRendererTurbo(this,  189,  75, textureX, textureY); // WheelsRM19
		leftTrackWheelModels[6] = new ModelRendererTurbo(this,  189,  75, textureX, textureY); // WheelsRM20
		leftTrackWheelModels[7] = new ModelRendererTurbo(this,  189,  75, textureX, textureY); // WheelsRM21
		leftTrackWheelModels[8] = new ModelRendererTurbo(this,  189,  75, textureX, textureY); // WheelsRM22
		leftTrackWheelModels[9] = new ModelRendererTurbo(this,  189,  75, textureX, textureY); // WheelsRM23
		leftTrackWheelModels[10] = new ModelRendererTurbo(this,  189,  63, textureX, textureY); // WheelsRM24
		leftTrackWheelModels[11] = new ModelRendererTurbo(this,  189,  63, textureX, textureY); // WheelsRM25
		leftTrackWheelModels[12] = new ModelRendererTurbo(this,  189,  20, textureX, textureY); // WheelsRM26
		leftTrackWheelModels[13] = new ModelRendererTurbo(this,  189,  20, textureX, textureY); // WheelsRM26
		leftTrackWheelModels[14] = new ModelRendererTurbo(this,  189,  63, textureX, textureY); // WheelsRB14
		leftTrackWheelModels[15] = new ModelRendererTurbo(this,  189,  63, textureX, textureY); // WheelsRB15
		leftTrackWheelModels[16] = new ModelRendererTurbo(this,  189,  75, textureX, textureY); // WheelsRB16
		leftTrackWheelModels[17] = new ModelRendererTurbo(this,  189,  75, textureX, textureY); // WheelsRB17
		leftTrackWheelModels[18] = new ModelRendererTurbo(this,  189,  75, textureX, textureY); // WheelsRB18
		leftTrackWheelModels[19] = new ModelRendererTurbo(this,  189,  75, textureX, textureY); // WheelsRB19
		leftTrackWheelModels[20] = new ModelRendererTurbo(this,  189,  75, textureX, textureY); // WheelsRB20
		leftTrackWheelModels[21] = new ModelRendererTurbo(this,  189,  75, textureX, textureY); // WheelsRB21
		leftTrackWheelModels[22] = new ModelRendererTurbo(this,  189,  75, textureX, textureY); // WheelsRB22
		leftTrackWheelModels[23] = new ModelRendererTurbo(this,  189,  75, textureX, textureY); // WheelsRB23
		leftTrackWheelModels[24] = new ModelRendererTurbo(this,  189,  63, textureX, textureY); // WheelsRB24
		leftTrackWheelModels[25] = new ModelRendererTurbo(this,  189,  63, textureX, textureY); // WheelsRB25
		leftTrackWheelModels[26] = new ModelRendererTurbo(this,  189,  20, textureX, textureY); // WheelsRB26
		leftTrackWheelModels[27] = new ModelRendererTurbo(this,  189,  63, textureX, textureY); // WheelsRF14
		leftTrackWheelModels[28] = new ModelRendererTurbo(this,  189,  63, textureX, textureY); // WheelsRF15
		leftTrackWheelModels[29] = new ModelRendererTurbo(this,  189,  75, textureX, textureY); // WheelsRF16
		leftTrackWheelModels[30] = new ModelRendererTurbo(this,  189,  75, textureX, textureY); // WheelsRF17
		leftTrackWheelModels[31] = new ModelRendererTurbo(this,  189,  75, textureX, textureY); // WheelsRF18
		leftTrackWheelModels[32] = new ModelRendererTurbo(this,  189,  75, textureX, textureY); // WheelsRF19
		leftTrackWheelModels[33] = new ModelRendererTurbo(this,  189,  75, textureX, textureY); // WheelsRF20
		leftTrackWheelModels[34] = new ModelRendererTurbo(this,  189,  75, textureX, textureY); // WheelsRF21
		leftTrackWheelModels[35] = new ModelRendererTurbo(this,  189,  75, textureX, textureY); // WheelsRF22
		leftTrackWheelModels[36] = new ModelRendererTurbo(this,  189,  75, textureX, textureY); // WheelsRF23
		leftTrackWheelModels[37] = new ModelRendererTurbo(this,  189,  63, textureX, textureY); // WheelsRF24
		leftTrackWheelModels[38] = new ModelRendererTurbo(this,  189,  63, textureX, textureY); // WheelsRF25
		leftTrackWheelModels[39] = new ModelRendererTurbo(this,  189,  20, textureX, textureY); // WheelsRf26
		leftTrackWheelModels[40] = new ModelRendererTurbo(this,  189,  109, textureX, textureY); // WheelMFR1
		leftTrackWheelModels[41] = new ModelRendererTurbo(this,  189,  96, textureX, textureY); // WheelMFR2
		leftTrackWheelModels[42] = new ModelRendererTurbo(this,  189,  125, textureX, textureY); // WheelMFR3
		leftTrackWheelModels[43] = new ModelRendererTurbo(this,  189,  125, textureX, textureY); // WheelMFR4
		leftTrackWheelModels[44] = new ModelRendererTurbo(this,  189,  133, textureX, textureY); // WheelMFR5
		leftTrackWheelModels[45] = new ModelRendererTurbo(this,  189,  133, textureX, textureY); // WheelMFR6
		leftTrackWheelModels[46] = new ModelRendererTurbo(this,  189,  148, textureX, textureY); // WheelMFR7
		leftTrackWheelModels[47] = new ModelRendererTurbo(this,  189,  146, textureX, textureY); // WheelMFR8
		leftTrackWheelModels[48] = new ModelRendererTurbo(this,  189,  148, textureX, textureY); // WheelMFR9
		leftTrackWheelModels[49] = new ModelRendererTurbo(this,  189,  148, textureX, textureY); // WheelMFR10
		leftTrackWheelModels[50] = new ModelRendererTurbo(this,  189,  163, textureX, textureY); // WheelMBR1
		leftTrackWheelModels[51] = new ModelRendererTurbo(this,  189,  163, textureX, textureY); // WheelMBR2
		leftTrackWheelModels[52] = new ModelRendererTurbo(this,  189,  163, textureX, textureY); // WheelMBR3
		leftTrackWheelModels[53] = new ModelRendererTurbo(this,  189,  177, textureX, textureY); // WheelMBR4
		leftTrackWheelModels[54] = new ModelRendererTurbo(this,  189,  177, textureX, textureY); // WheelMBR5
		leftTrackWheelModels[55] = new ModelRendererTurbo(this,  189,  188, textureX, textureY); // WheelMBR6
		leftTrackWheelModels[56] = new ModelRendererTurbo(this,  189,  188, textureX, textureY); // WheelMBR7
		leftTrackWheelModels[57] = new ModelRendererTurbo(this,  189,  198, textureX, textureY); // WheelMBR8
		leftTrackWheelModels[58] = new ModelRendererTurbo(this,  189,  198, textureX, textureY); // WheelMBR9
		leftTrackWheelModels[59] = new ModelRendererTurbo(this,  189,  198, textureX, textureY); // WheelMBR10
		leftTrackWheelModels[60] = new ModelRendererTurbo(this,  189,  198, textureX, textureY); // WheelMBR11

		leftTrackWheelModels[0].addBox(-6.3F, 5.3F, -0.5F, 3, 1, 1, 0F); // WheelsRM14
		leftTrackWheelModels[0].setRotationPoint(2F, 2F, -19F);

		leftTrackWheelModels[1].addBox(-5.3F, 4.3F, -0.5F, 1, 3, 1, 0F); // WheelsRM15
		leftTrackWheelModels[1].setRotationPoint(2F, 2F, -19F);

		leftTrackWheelModels[2].addBox(-7.3F, 3.9F, -1F, 1, 4, 2, 0F); // WheelsRM16
		leftTrackWheelModels[2].setRotationPoint(2F, 2F, -19F);

		leftTrackWheelModels[3].addBox(-6.8F, 3.3F, -1F, 4, 1, 2, 0F); // WheelsRM17
		leftTrackWheelModels[3].setRotationPoint(2F, 2F, -19F);

		leftTrackWheelModels[4].addBox(-3.3F, 3.9F, -1F, 1, 4, 2, 0F); // WheelsRM18
		leftTrackWheelModels[4].setRotationPoint(2F, 2F, -19F);

		leftTrackWheelModels[5].addBox(-6.8F, 7.3F, -1F, 4, 1, 2, 0F); // WheelsRM19
		leftTrackWheelModels[5].setRotationPoint(2F, 2F, -19F);

		leftTrackWheelModels[6].addBox(2.3F, 3.9F, -1F, 1, 4, 2, 0F); // WheelsRM20
		leftTrackWheelModels[6].setRotationPoint(2F, 2F, -19F);

		leftTrackWheelModels[7].addBox(2.8F, 3.3F, -1F, 4, 1, 2, 0F); // WheelsRM21
		leftTrackWheelModels[7].setRotationPoint(2F, 2F, -19F);

		leftTrackWheelModels[8].addBox(6.3F, 3.9F, -1F, 1, 4, 2, 0F); // WheelsRM22
		leftTrackWheelModels[8].setRotationPoint(2F, 2F, -19F);

		leftTrackWheelModels[9].addBox(2.8F, 7.3F, -1F, 4, 1, 2, 0F); // WheelsRM23
		leftTrackWheelModels[9].setRotationPoint(2F, 2F, -19F);

		leftTrackWheelModels[10].addBox(4.3F, 4.3F, -0.5F, 1, 3, 1, 0F); // WheelsRM24
		leftTrackWheelModels[10].setRotationPoint(2F, 2F, -19F);

		leftTrackWheelModels[11].addBox(3.3F, 5.3F, -0.5F, 3, 1, 1, 0F); // WheelsRM25
		leftTrackWheelModels[11].setRotationPoint(2F, 2F, -19F);

		leftTrackWheelModels[12].addBox(-2.5F, -0.5F, -2.5F, 5, 3, 5, 0F); // WheelsRM26
		leftTrackWheelModels[12].setRotationPoint(2F, 2F, -19F);

		leftTrackWheelModels[13].addBox(-2.5F, -0.5F, -2.5F, 5, 3, 5, 0F); // WheelsRM26
		leftTrackWheelModels[13].setRotationPoint(2F, 2F, -19F);

		leftTrackWheelModels[14].addBox(-6.3F, 5.3F, -0.5F, 3, 1, 1, 0F); // WheelsRB14
		leftTrackWheelModels[14].setRotationPoint(-15F, 2F, -19F);

		leftTrackWheelModels[15].addBox(-5.3F, 4.3F, -0.5F, 1, 3, 1, 0F); // WheelsRB15
		leftTrackWheelModels[15].setRotationPoint(-15F, 2F, -19F);

		leftTrackWheelModels[16].addBox(-7.3F, 3.9F, -1F, 1, 4, 2, 0F); // WheelsRB16
		leftTrackWheelModels[16].setRotationPoint(-15F, 2F, -19F);

		leftTrackWheelModels[17].addBox(-6.8F, 3.3F, -1F, 4, 1, 2, 0F); // WheelsRB17
		leftTrackWheelModels[17].setRotationPoint(-15F, 2F, -19F);

		leftTrackWheelModels[18].addBox(-3.3F, 3.9F, -1F, 1, 4, 2, 0F); // WheelsRB18
		leftTrackWheelModels[18].setRotationPoint(-15F, 2F, -19F);

		leftTrackWheelModels[19].addBox(-6.8F, 7.3F, -1F, 4, 1, 2, 0F); // WheelsRB19
		leftTrackWheelModels[19].setRotationPoint(-15F, 2F, -19F);

		leftTrackWheelModels[20].addBox(2.3F, 3.9F, -1F, 1, 4, 2, 0F); // WheelsRB20
		leftTrackWheelModels[20].setRotationPoint(-15F, 2F, -19F);

		leftTrackWheelModels[21].addBox(2.8F, 3.3F, -1F, 4, 1, 2, 0F); // WheelsRB21
		leftTrackWheelModels[21].setRotationPoint(-15F, 2F, -19F);

		leftTrackWheelModels[22].addBox(6.3F, 3.9F, -1F, 1, 4, 2, 0F); // WheelsRB22
		leftTrackWheelModels[22].setRotationPoint(-15F, 2F, -19F);

		leftTrackWheelModels[23].addBox(2.8F, 7.3F, -1F, 4, 1, 2, 0F); // WheelsRB23
		leftTrackWheelModels[23].setRotationPoint(-15F, 2F, -19F);

		leftTrackWheelModels[24].addBox(4.3F, 4.3F, -0.5F, 1, 3, 1, 0F); // WheelsRB24
		leftTrackWheelModels[24].setRotationPoint(-15F, 2F, -19F);

		leftTrackWheelModels[25].addBox(3.7F, 5.3F, -0.5F, 3, 1, 1, 0F); // WheelsRB25
		leftTrackWheelModels[25].setRotationPoint(-15F, 2F, -19F);

		leftTrackWheelModels[26].addBox(-2.5F, -0.5F, -2.5F, 5, 3, 5, 0F); // WheelsRB26
		leftTrackWheelModels[26].setRotationPoint(-15F, 2F, -19F);

		leftTrackWheelModels[27].addBox(-6.3F, 5.3F, -0.5F, 3, 1, 1, 0F); // WheelsRF14
		leftTrackWheelModels[27].setRotationPoint(19F, 2F, -19F);

		leftTrackWheelModels[28].addBox(-5.3F, 4.3F, -0.5F, 1, 3, 1, 0F); // WheelsRF15
		leftTrackWheelModels[28].setRotationPoint(19F, 2F, -19F);

		leftTrackWheelModels[29].addBox(-7.3F, 3.9F, -1F, 1, 4, 2, 0F); // WheelsRF16
		leftTrackWheelModels[29].setRotationPoint(19F, 2F, -19F);

		leftTrackWheelModels[30].addBox(-6.8F, 3.3F, -1F, 4, 1, 2, 0F); // WheelsRF17
		leftTrackWheelModels[30].setRotationPoint(19F, 2F, -19F);

		leftTrackWheelModels[31].addBox(-3.3F, 3.9F, -1F, 1, 4, 2, 0F); // WheelsRF18
		leftTrackWheelModels[31].setRotationPoint(19F, 2F, -19F);

		leftTrackWheelModels[32].addBox(-6.8F, 7.3F, -1F, 4, 1, 2, 0F); // WheelsRF19
		leftTrackWheelModels[32].setRotationPoint(19F, 2F, -19F);

		leftTrackWheelModels[33].addBox(2.3F, 3.9F, -1F, 1, 4, 2, 0F); // WheelsRF20
		leftTrackWheelModels[33].setRotationPoint(19F, 2F, -19F);

		leftTrackWheelModels[34].addBox(2.8F, 3.3F, -1F, 4, 1, 2, 0F); // WheelsRF21
		leftTrackWheelModels[34].setRotationPoint(19F, 2F, -19F);

		leftTrackWheelModels[35].addBox(6.3F, 3.9F, -1F, 1, 4, 2, 0F); // WheelsRF22
		leftTrackWheelModels[35].setRotationPoint(19F, 2F, -19F);

		leftTrackWheelModels[36].addBox(2.8F, 7.3F, -1F, 4, 1, 2, 0F); // WheelsRF23
		leftTrackWheelModels[36].setRotationPoint(19F, 2F, -19F);

		leftTrackWheelModels[37].addBox(4.3F, 4.3F, -0.5F, 1, 3, 1, 0F); // WheelsRF24
		leftTrackWheelModels[37].setRotationPoint(19F, 2F, -19F);

		leftTrackWheelModels[38].addBox(3.3F, 5.3F, -0.5F, 3, 1, 1, 0F); // WheelsRF25
		leftTrackWheelModels[38].setRotationPoint(19F, 2F, -19F);

		leftTrackWheelModels[39].addBox(-2.5F, -0.5F, -2.5F, 5, 3, 5, 0F); // WheelsRf26
		leftTrackWheelModels[39].setRotationPoint(19F, 2F, -19F);

		leftTrackWheelModels[40].addBox(-3F, -4F, -1F, 6, 6, 2, 0F); // WheelMFR1
		leftTrackWheelModels[40].setRotationPoint(31F, 3F, -19F);

		leftTrackWheelModels[41].addBox(-2F, -3F, -2F, 4, 4, 4, 0F); // WheelMFR2
		leftTrackWheelModels[41].setRotationPoint(31F, 3F, -19F);

		leftTrackWheelModels[42].addBox(-2F, 1.5F, -2F, 4, 1, 4, 0F); // WheelMFR3
		leftTrackWheelModels[42].setRotationPoint(31F, 3F, -19F);

		leftTrackWheelModels[43].addBox(-2F, -4.5F, -2F, 4, 1, 4, 0F); // WheelMFR4
		leftTrackWheelModels[43].setRotationPoint(31F, 3F, -19F);

		leftTrackWheelModels[44].addBox(2.5F, -3F, -2F, 1, 4, 4, 0F); // WheelMFR5
		leftTrackWheelModels[44].setRotationPoint(31F, 3F, -19F);

		leftTrackWheelModels[45].addBox(-3.5F, -3F, -2F, 1, 4, 4, 0F); // WheelMFR6
		leftTrackWheelModels[45].setRotationPoint(31F, 3F, -19F);

		leftTrackWheelModels[46].addBox(2F, -4F, -2F, 1, 1, 4, 0F); // WheelMFR7
		leftTrackWheelModels[46].setRotationPoint(31F, 3F, -19F);

		leftTrackWheelModels[47].addBox(-3F, -4F, -2F, 1, 1, 4, 0F); // WheelMFR8
		leftTrackWheelModels[47].setRotationPoint(31F, 3F, -19F);

		leftTrackWheelModels[48].addBox(-3F, 1F, -2F, 1, 1, 4, 0F); // WheelMFR9
		leftTrackWheelModels[48].setRotationPoint(31F, 3F, -19F);

		leftTrackWheelModels[49].addBox(2F, 1F, -2F, 1, 1, 4, 0F); // WheelMFR10
		leftTrackWheelModels[49].setRotationPoint(31F, 3F, -19F);

		leftTrackWheelModels[50].addBox(-2.5F, -0.5F, -2F, 5, 1, 4, 0F); // WheelMBR1
		leftTrackWheelModels[50].setRotationPoint(-26F, 2F, -19F);

		leftTrackWheelModels[51].addBox(-0.5F, -2.5F, -2F, 1, 5, 4, 0F); // WheelMBR2
		leftTrackWheelModels[51].setRotationPoint(-26F, 2F, -19F);

		leftTrackWheelModels[52].addBox(-1F, -1F, -2F, 2, 2, 4, 0F); // WheelMBR3
		leftTrackWheelModels[52].setRotationPoint(-26F, 2F, -19F);

		leftTrackWheelModels[53].addBox(2F, -2F, -2F, 1, 4, 4, 0F); // WheelMBR4
		leftTrackWheelModels[53].setRotationPoint(-26F, 2F, -19F);

		leftTrackWheelModels[54].addBox(-3F, -2F, -2F, 1, 4, 4, 0F); // WheelMBR5
		leftTrackWheelModels[54].setRotationPoint(-26F, 2F, -19F);

		leftTrackWheelModels[55].addBox(-2F, 2F, -2F, 4, 1, 4, 0F); // WheelMBR6
		leftTrackWheelModels[55].setRotationPoint(-26F, 2F, -19F);

		leftTrackWheelModels[56].addBox(-2F, -3F, -2F, 4, 1, 4, 0F); // WheelMBR7
		leftTrackWheelModels[56].setRotationPoint(-26F, 2F, -19F);

		leftTrackWheelModels[57].addBox(-2.5F, 1.5F, -2F, 1, 1, 4, 0F); // WheelMBR8
		leftTrackWheelModels[57].setRotationPoint(-26F, 2F, -19F);

		leftTrackWheelModels[58].addBox(-2.5F, -2.5F, -2F, 1, 1, 4, 0F); // WheelMBR9
		leftTrackWheelModels[58].setRotationPoint(-26F, 2F, -19F);

		leftTrackWheelModels[59].addBox(1.5F, -2.5F, -2F, 1, 1, 4, 0F); // WheelMBR10
		leftTrackWheelModels[59].setRotationPoint(-26F, 2F, -19F);

		leftTrackWheelModels[60].addBox(1.5F, 1.5F, -2F, 1, 1, 4, 0F); // WheelMBR11
		leftTrackWheelModels[60].setRotationPoint(-26F, 2F, -19F);



// Right Track Wheel
		rightTrackWheelModels = new ModelRendererTurbo[60];
		rightTrackWheelModels[0] = new ModelRendererTurbo(this,  189,  63, textureX, textureY); // WheelsLB14
		rightTrackWheelModels[1] = new ModelRendererTurbo(this,  189,  63, textureX, textureY); // WheelsLB15
		rightTrackWheelModels[2] = new ModelRendererTurbo(this,  189,  75, textureX, textureY); // WheelsLB16
		rightTrackWheelModels[3] = new ModelRendererTurbo(this,  189,  75, textureX, textureY); // WheelsLB17
		rightTrackWheelModels[4] = new ModelRendererTurbo(this,  189,  75, textureX, textureY); // WheelsLB18
		rightTrackWheelModels[5] = new ModelRendererTurbo(this,  189,  75, textureX, textureY); // WheelsLB19
		rightTrackWheelModels[6] = new ModelRendererTurbo(this,  189,  75, textureX, textureY); // WheelsLB20
		rightTrackWheelModels[7] = new ModelRendererTurbo(this,  189,  75, textureX, textureY); // WheelsLB21
		rightTrackWheelModels[8] = new ModelRendererTurbo(this,  189,  75, textureX, textureY); // WheelsLB22
		rightTrackWheelModels[9] = new ModelRendererTurbo(this,  189,  75, textureX, textureY); // WheelsLB23
		rightTrackWheelModels[10] = new ModelRendererTurbo(this,  189,  63, textureX, textureY); // WheelsLB24
		rightTrackWheelModels[11] = new ModelRendererTurbo(this,  189,  63, textureX, textureY); // WheelsLB25
		rightTrackWheelModels[12] = new ModelRendererTurbo(this,  189,  20, textureX, textureY); // WheelsLB26
		rightTrackWheelModels[13] = new ModelRendererTurbo(this,  189,  109, textureX, textureY); // WheelMFL1
		rightTrackWheelModels[14] = new ModelRendererTurbo(this,  189,  96, textureX, textureY); // WheelMFL2
		rightTrackWheelModels[15] = new ModelRendererTurbo(this,  189,  125, textureX, textureY); // WheelMFL3
		rightTrackWheelModels[16] = new ModelRendererTurbo(this,  189,  125, textureX, textureY); // WheelMFL4
		rightTrackWheelModels[17] = new ModelRendererTurbo(this,  189,  133, textureX, textureY); // WheelMFL5
		rightTrackWheelModels[18] = new ModelRendererTurbo(this,  189,  133, textureX, textureY); // WheelMFL6
		rightTrackWheelModels[19] = new ModelRendererTurbo(this,  189,  148, textureX, textureY); // WheelMFL7
		rightTrackWheelModels[20] = new ModelRendererTurbo(this,  189,  146, textureX, textureY); // WheelMFL8
		rightTrackWheelModels[21] = new ModelRendererTurbo(this,  189,  148, textureX, textureY); // WheelMFL9
		rightTrackWheelModels[22] = new ModelRendererTurbo(this,  189,  148, textureX, textureY); // WheelMFL10
		rightTrackWheelModels[23] = new ModelRendererTurbo(this,  189,  163, textureX, textureY); // WheelMBR1
		rightTrackWheelModels[24] = new ModelRendererTurbo(this,  189,  163, textureX, textureY); // WheelMBL2
		rightTrackWheelModels[25] = new ModelRendererTurbo(this,  189,  163, textureX, textureY); // WheelMBL3
		rightTrackWheelModels[26] = new ModelRendererTurbo(this,  189,  177, textureX, textureY); // WheelMBL4
		rightTrackWheelModels[27] = new ModelRendererTurbo(this,  189,  177, textureX, textureY); // WheelMBL5
		rightTrackWheelModels[28] = new ModelRendererTurbo(this,  189,  188, textureX, textureY); // WheelMBL6
		rightTrackWheelModels[29] = new ModelRendererTurbo(this,  189,  188, textureX, textureY); // WheelMBL7
		rightTrackWheelModels[30] = new ModelRendererTurbo(this,  189,  198, textureX, textureY); // WheelMBL8
		rightTrackWheelModels[31] = new ModelRendererTurbo(this,  189,  198, textureX, textureY); // WheelMBL9
		rightTrackWheelModels[32] = new ModelRendererTurbo(this,  189,  198, textureX, textureY); // WheelMBL10
		rightTrackWheelModels[33] = new ModelRendererTurbo(this,  189,  198, textureX, textureY); // WheelMBL11
		rightTrackWheelModels[34] = new ModelRendererTurbo(this,  189,  63, textureX, textureY); // WheelMBL11.mirror
		rightTrackWheelModels[35] = new ModelRendererTurbo(this,  189,  63, textureX, textureY); // WheelsLM15
		rightTrackWheelModels[36] = new ModelRendererTurbo(this,  189,  75, textureX, textureY); // WheelsLM16
		rightTrackWheelModels[37] = new ModelRendererTurbo(this,  189,  75, textureX, textureY); // WheelsLM17
		rightTrackWheelModels[38] = new ModelRendererTurbo(this,  189,  75, textureX, textureY); // WheelsLM18
		rightTrackWheelModels[39] = new ModelRendererTurbo(this,  189,  75, textureX, textureY); // WheelsLM19
		rightTrackWheelModels[40] = new ModelRendererTurbo(this,  189,  75, textureX, textureY); // WheelsLM20
		rightTrackWheelModels[41] = new ModelRendererTurbo(this,  189,  75, textureX, textureY); // WheelsLM21
		rightTrackWheelModels[42] = new ModelRendererTurbo(this,  189,  75, textureX, textureY); // WheelsLM22
		rightTrackWheelModels[43] = new ModelRendererTurbo(this,  189,  75, textureX, textureY); // WheelsLM23
		rightTrackWheelModels[44] = new ModelRendererTurbo(this,  189,  63, textureX, textureY); // WheelsLM24
		rightTrackWheelModels[45] = new ModelRendererTurbo(this,  -15,  63, textureX, textureY); // WheelsLm25
		rightTrackWheelModels[46] = new ModelRendererTurbo(this,  189,  20, textureX, textureY); // WheelsLM26
		rightTrackWheelModels[47] = new ModelRendererTurbo(this,  189,  63, textureX, textureY); // WheelsLF14
		rightTrackWheelModels[48] = new ModelRendererTurbo(this,  189,  63, textureX, textureY); // WheelsLF15
		rightTrackWheelModels[49] = new ModelRendererTurbo(this,  189,  75, textureX, textureY); // WheelsLF16
		rightTrackWheelModels[50] = new ModelRendererTurbo(this,  189,  75, textureX, textureY); // WheelsLF17
		rightTrackWheelModels[51] = new ModelRendererTurbo(this,  189,  75, textureX, textureY); // WheelsLF18
		rightTrackWheelModels[52] = new ModelRendererTurbo(this,  189,  75, textureX, textureY); // WheelsLF19
		rightTrackWheelModels[53] = new ModelRendererTurbo(this,  189,  75, textureX, textureY); // WheelsLF20
		rightTrackWheelModels[54] = new ModelRendererTurbo(this,  189,  76, textureX, textureY); // WheelsLF21
		rightTrackWheelModels[55] = new ModelRendererTurbo(this,  189,  75, textureX, textureY); // WheelsLF22
		rightTrackWheelModels[56] = new ModelRendererTurbo(this,  189,  75, textureX, textureY); // WheelsLF23
		rightTrackWheelModels[57] = new ModelRendererTurbo(this,  189,  63, textureX, textureY); // WheelsLF24
		rightTrackWheelModels[58] = new ModelRendererTurbo(this,  189,  63, textureX, textureY); // WheelsLF25
		rightTrackWheelModels[59] = new ModelRendererTurbo(this,  189,  20, textureX, textureY); // WheelsLF26

		rightTrackWheelModels[0].addBox(-6.3F, 5.3F, -0.5F, 3, 1, 1, 0F); // WheelsLB14
		rightTrackWheelModels[0].setRotationPoint(-15F, 2F, 19F);

		rightTrackWheelModels[1].addBox(-5.3F, 4.3F, -0.5F, 1, 3, 1, 0F); // WheelsLB15
		rightTrackWheelModels[1].setRotationPoint(-15F, 2F, 19F);

		rightTrackWheelModels[2].addBox(-7.3F, 3.9F, -1F, 1, 4, 2, 0F); // WheelsLB16
		rightTrackWheelModels[2].setRotationPoint(-15F, 2F, 19F);

		rightTrackWheelModels[3].addBox(-6.8F, 3.3F, -1F, 4, 1, 2, 0F); // WheelsLB17
		rightTrackWheelModels[3].setRotationPoint(-15F, 2F, 19F);

		rightTrackWheelModels[4].addBox(-3.3F, 3.9F, -1F, 1, 4, 2, 0F); // WheelsLB18
		rightTrackWheelModels[4].setRotationPoint(-15F, 2F, 19F);

		rightTrackWheelModels[5].addBox(-6.8F, 7.3F, -1F, 4, 1, 2, 0F); // WheelsLB19
		rightTrackWheelModels[5].setRotationPoint(-15F, 2F, 19F);

		rightTrackWheelModels[6].addBox(2.3F, 3.9F, -1F, 1, 4, 2, 0F); // WheelsLB20
		rightTrackWheelModels[6].setRotationPoint(-15F, 2F, 19F);

		rightTrackWheelModels[7].addBox(2.8F, 3.3F, -1F, 4, 1, 2, 0F); // WheelsLB21
		rightTrackWheelModels[7].setRotationPoint(-15F, 2F, 19F);

		rightTrackWheelModels[8].addBox(6.3F, 3.9F, -1F, 1, 4, 2, 0F); // WheelsLB22
		rightTrackWheelModels[8].setRotationPoint(-15F, 2F, 19F);

		rightTrackWheelModels[9].addBox(2.8F, 7.3F, -1F, 4, 1, 2, 0F); // WheelsLB23
		rightTrackWheelModels[9].setRotationPoint(-15F, 2F, 19F);

		rightTrackWheelModels[10].addBox(4.3F, 4.3F, -0.5F, 1, 3, 1, 0F); // WheelsLB24
		rightTrackWheelModels[10].setRotationPoint(-15F, 2F, 19F);

		rightTrackWheelModels[11].addBox(3.7F, 5.3F, -0.5F, 3, 1, 1, 0F); // WheelsLB25
		rightTrackWheelModels[11].setRotationPoint(-15F, 2F, 19F);

		rightTrackWheelModels[12].addBox(-2.5F, -0.5F, -2.5F, 5, 3, 5, 0F); // WheelsLB26
		rightTrackWheelModels[12].setRotationPoint(-15F, 2F, 19F);

		rightTrackWheelModels[13].addBox(-3F, -4F, -1F, 6, 6, 2, 0F); // WheelMFL1
		rightTrackWheelModels[13].setRotationPoint(31F, 3F, 19F);

		rightTrackWheelModels[14].addBox(-2F, -3F, -2F, 4, 4, 4, 0F); // WheelMFL2
		rightTrackWheelModels[14].setRotationPoint(31F, 3F, 19F);

		rightTrackWheelModels[15].addBox(-2F, 1.5F, -2F, 4, 1, 4, 0F); // WheelMFL3
		rightTrackWheelModels[15].setRotationPoint(31F, 3F, 19F);

		rightTrackWheelModels[16].addBox(-2F, -4.5F, -2F, 4, 1, 4, 0F); // WheelMFL4
		rightTrackWheelModels[16].setRotationPoint(31F, 3F, 19F);

		rightTrackWheelModels[17].addBox(2.5F, -3F, -2F, 1, 4, 4, 0F); // WheelMFL5
		rightTrackWheelModels[17].setRotationPoint(31F, 3F, 19F);

		rightTrackWheelModels[18].addBox(-3.5F, -3F, -2F, 1, 4, 4, 0F); // WheelMFL6
		rightTrackWheelModels[18].setRotationPoint(31F, 3F, 19F);

		rightTrackWheelModels[19].addBox(2F, -4F, -2F, 1, 1, 4, 0F); // WheelMFL7
		rightTrackWheelModels[19].setRotationPoint(31F, 3F, 19F);

		rightTrackWheelModels[20].addBox(-3F, -4F, -2F, 1, 1, 4, 0F); // WheelMFL8
		rightTrackWheelModels[20].setRotationPoint(31F, 3F, 19F);

		rightTrackWheelModels[21].addBox(-3F, 1F, -2F, 1, 1, 4, 0F); // WheelMFL9
		rightTrackWheelModels[21].setRotationPoint(31F, 3F, 19F);

		rightTrackWheelModels[22].addBox(2F, 1F, -2F, 1, 1, 4, 0F); // WheelMFL10
		rightTrackWheelModels[22].setRotationPoint(31F, 3F, 19F);

		rightTrackWheelModels[23].addBox(-2.5F, -0.5F, -2F, 5, 1, 4, 0F); // WheelMBR1
		rightTrackWheelModels[23].setRotationPoint(-26F, 2F, 19F);

		rightTrackWheelModels[24].addBox(-0.5F, -2.5F, -2F, 1, 5, 4, 0F); // WheelMBL2
		rightTrackWheelModels[24].setRotationPoint(-26F, 2F, 19F);

		rightTrackWheelModels[25].addBox(-1F, -1F, -2F, 2, 2, 4, 0F); // WheelMBL3
		rightTrackWheelModels[25].setRotationPoint(-26F, 2F, 19F);

		rightTrackWheelModels[26].addBox(2F, -2F, -2F, 1, 4, 4, 0F); // WheelMBL4
		rightTrackWheelModels[26].setRotationPoint(-26F, 2F, 19F);

		rightTrackWheelModels[27].addBox(-3F, -2F, -2F, 1, 4, 4, 0F); // WheelMBL5
		rightTrackWheelModels[27].setRotationPoint(-26F, 2F, 19F);

		rightTrackWheelModels[28].addBox(-2F, 2F, -2F, 4, 1, 4, 0F); // WheelMBL6
		rightTrackWheelModels[28].setRotationPoint(-26F, 2F, 19F);

		rightTrackWheelModels[29].addBox(-2F, -3F, -2F, 4, 1, 4, 0F); // WheelMBL7
		rightTrackWheelModels[29].setRotationPoint(-26F, 2F, 19F);

		rightTrackWheelModels[30].addBox(-2.5F, 1.5F, -2F, 1, 1, 4, 0F); // WheelMBL8
		rightTrackWheelModels[30].setRotationPoint(-26F, 2F, 19F);

		rightTrackWheelModels[31].addBox(-2.5F, -2.5F, -2F, 1, 1, 4, 0F); // WheelMBL9
		rightTrackWheelModels[31].setRotationPoint(-26F, 2F, 19F);

		rightTrackWheelModels[32].addBox(1.5F, -2.5F, -2F, 1, 1, 4, 0F); // WheelMBL10
		rightTrackWheelModels[32].setRotationPoint(-26F, 2F, 19F);

		rightTrackWheelModels[33].addBox(1.5F, 1.5F, -2F, 1, 1, 4, 0F); // WheelMBL11
		rightTrackWheelModels[33].setRotationPoint(-26F, 2F, 19F);

		rightTrackWheelModels[34].addBox(-6.3F, 5.3F, -0.5F, 3, 1, 1, 0F); // WheelsLM14
		rightTrackWheelModels[34].setRotationPoint(2F, 2F, 19F);

		rightTrackWheelModels[35].addBox(-5.3F, 4.3F, -0.5F, 1, 3, 1, 0F); // WheelsLM15
		rightTrackWheelModels[35].setRotationPoint(2F, 2F, 19F);

		rightTrackWheelModels[36].addBox(-7.3F, 3.9F, -1F, 1, 4, 2, 0F); // WheelsLM16
		rightTrackWheelModels[36].setRotationPoint(2F, 2F, 19F);

		rightTrackWheelModels[37].addBox(-6.8F, 3.3F, -1F, 4, 1, 2, 0F); // WheelsLM17
		rightTrackWheelModels[37].setRotationPoint(2F, 2F, 19F);

		rightTrackWheelModels[38].addBox(-3.3F, 3.9F, -1F, 1, 4, 2, 0F); // WheelsLM18
		rightTrackWheelModels[38].setRotationPoint(2F, 2F, 19F);

		rightTrackWheelModels[39].addBox(-6.8F, 7.3F, -1F, 4, 1, 2, 0F); // WheelsLM19
		rightTrackWheelModels[39].setRotationPoint(2F, 2F, 19F);

		rightTrackWheelModels[40].addBox(2.3F, 3.9F, -1F, 1, 4, 2, 0F); // WheelsLM20
		rightTrackWheelModels[40].setRotationPoint(2F, 2F, 19F);

		rightTrackWheelModels[41].addBox(2.8F, 3.3F, -1F, 4, 1, 2, 0F); // WheelsLM21
		rightTrackWheelModels[41].setRotationPoint(2F, 2F, 19F);

		rightTrackWheelModels[42].addBox(6.3F, 3.9F, -1F, 1, 4, 2, 0F); // WheelsLM22
		rightTrackWheelModels[42].setRotationPoint(2F, 2F, 19F);

		rightTrackWheelModels[43].addBox(2.8F, 7.3F, -1F, 4, 1, 2, 0F); // WheelsLM23
		rightTrackWheelModels[43].setRotationPoint(2F, 2F, 19F);

		rightTrackWheelModels[44].addBox(4.3F, 4.3F, -0.5F, 1, 3, 1, 0F); // WheelsLM24
		rightTrackWheelModels[44].setRotationPoint(2F, 2F, 19F);

		rightTrackWheelModels[45].addBox(3.3F, 5.3F, -0.5F, 3, 1, 1, 0F); // WheelsLm25
		rightTrackWheelModels[45].setRotationPoint(2F, 2F, 19F);

		rightTrackWheelModels[46].addBox(-2.5F, -0.5F, -2.5F, 5, 3, 5, 0F); // WheelsLM26
		rightTrackWheelModels[46].setRotationPoint(2F, 2F, 19F);

		rightTrackWheelModels[47].addBox(-6.3F, 5.3F, -0.5F, 3, 1, 1, 0F); // WheelsLF14
		rightTrackWheelModels[47].setRotationPoint(19F, 2F, 19F);

		rightTrackWheelModels[48].addBox(-5.3F, 4.3F, -0.5F, 1, 3, 1, 0F); // WheelsLF15
		rightTrackWheelModels[48].setRotationPoint(19F, 2F, 19F);

		rightTrackWheelModels[49].addBox(-7.3F, 3.9F, -1F, 1, 4, 2, 0F); // WheelsLF16
		rightTrackWheelModels[49].setRotationPoint(19F, 2F, 19F);

		rightTrackWheelModels[50].addBox(-6.8F, 3.3F, -1F, 4, 1, 2, 0F); // WheelsLF17
		rightTrackWheelModels[50].setRotationPoint(19F, 2F, 19F);

		rightTrackWheelModels[51].addBox(-3.3F, 3.9F, -1F, 1, 4, 2, 0F); // WheelsLF18
		rightTrackWheelModels[51].setRotationPoint(19F, 2F, 19F);

		rightTrackWheelModels[52].addBox(-6.8F, 7.3F, -1F, 4, 1, 2, 0F); // WheelsLF19
		rightTrackWheelModels[52].setRotationPoint(19F, 2F, 19F);

		rightTrackWheelModels[53].addBox(2.3F, 3.9F, -1F, 1, 4, 2, 0F); // WheelsLF20
		rightTrackWheelModels[53].setRotationPoint(19F, 2F, 19F);

		rightTrackWheelModels[54].addBox(2.8F, 3.3F, -1F, 4, 1, 2, 0F); // WheelsLF21
		rightTrackWheelModels[54].setRotationPoint(19F, 2F, 19F);

		rightTrackWheelModels[55].addBox(6.3F, 3.9F, -1F, 1, 4, 2, 0F); // WheelsLF22
		rightTrackWheelModels[55].setRotationPoint(19F, 2F, 19F);

		rightTrackWheelModels[56].addBox(2.8F, 7.3F, -1F, 4, 1, 2, 0F); // WheelsLF23
		rightTrackWheelModels[56].setRotationPoint(19F, 2F, 19F);

		rightTrackWheelModels[57].addBox(4.3F, 4.3F, -0.5F, 1, 3, 1, 0F); // WheelsLF24
		rightTrackWheelModels[57].setRotationPoint(19F, 2F, 19F);

		rightTrackWheelModels[58].addBox(3.3F, 5.3F, -0.5F, 3, 1, 1, 0F); // WheelsLF25
		rightTrackWheelModels[58].setRotationPoint(19F, 2F, 19F);

		rightTrackWheelModels[59].addBox(-2.5F, -0.5F, -2.5F, 5, 3, 5, 0F); // WheelsLF26
		rightTrackWheelModels[59].setRotationPoint(19F, 2F, 19F);


		
		ModelRendererTurbo[][] TurretModel = new ModelRendererTurbo[3][];

		TurretModel[0] = new ModelRendererTurbo[46];
		TurretModel[0][0] = new ModelRendererTurbo(this,  3,  416, textureX, textureY); // CoreTurret1
		TurretModel[0][1] = new ModelRendererTurbo(this,  3,  449, textureX, textureY); // CoreTurret2
		TurretModel[0][2] = new ModelRendererTurbo(this,  3,  449, textureX, textureY); // CoreTurret3
		TurretModel[0][3] = new ModelRendererTurbo(this,  3,  416, textureX, textureY); // CoreTurret4
		TurretModel[0][4] = new ModelRendererTurbo(this,  64,  441, textureX, textureY); // CoreTurret5
		TurretModel[0][5] = new ModelRendererTurbo(this,  3,  416, textureX, textureY); // CoreTurret6
		TurretModel[0][6] = new ModelRendererTurbo(this,  3,  416, textureX, textureY); // CoreTurret7
		TurretModel[0][7] = new ModelRendererTurbo(this,  3,  416, textureX, textureY); // CoreTurret8
		TurretModel[0][8] = new ModelRendererTurbo(this,  3,  416, textureX, textureY); // CoreTurret9
		TurretModel[0][9] = new ModelRendererTurbo(this,  3,  416, textureX, textureY); // CoreTurret10
		TurretModel[0][10] = new ModelRendererTurbo(this,  69,  432, textureX, textureY); // CoreTurret11
		TurretModel[0][11] = new ModelRendererTurbo(this,  3,  416, textureX, textureY); // CoreTurret16
		TurretModel[0][12] = new ModelRendererTurbo(this,  3,  416, textureX, textureY); // CoreTurret19
		TurretModel[0][13] = new ModelRendererTurbo(this,  3,  416, textureX, textureY); // CoreTurret15
		TurretModel[0][14] = new ModelRendererTurbo(this,  3,  416, textureX, textureY); // CoreTurret14
		TurretModel[0][15] = new ModelRendererTurbo(this,  3,  416, textureX, textureY); // CoreTurret13
		TurretModel[0][16] = new ModelRendererTurbo(this,  3,  416, textureX, textureY); // CoreTurret12
		TurretModel[0][17] = new ModelRendererTurbo(this,  72,  409, textureX, textureY); // CoreTurret17
		TurretModel[0][18] = new ModelRendererTurbo(this,  3,  416, textureX, textureY); // CoreTurret18
		TurretModel[0][19] = new ModelRendererTurbo(this,  3,  468, textureX, textureY); // CoreTurret21
		TurretModel[0][20] = new ModelRendererTurbo(this,  3,  468, textureX, textureY); // CoreTurret43
		TurretModel[0][21] = new ModelRendererTurbo(this,  3,  468, textureX, textureY); // CoreTurret36
		TurretModel[0][22] = new ModelRendererTurbo(this,  3,  468, textureX, textureY); // CoreTurret40
		TurretModel[0][23] = new ModelRendererTurbo(this,  3,  468, textureX, textureY); // CoreTurret45
		TurretModel[0][24] = new ModelRendererTurbo(this,  3,  468, textureX, textureY); // CoreTurret37
		TurretModel[0][25] = new ModelRendererTurbo(this,  3,  468, textureX, textureY); // CoreTurret42
		TurretModel[0][26] = new ModelRendererTurbo(this,  3,  468, textureX, textureY); // CoreTurret41
		TurretModel[0][27] = new ModelRendererTurbo(this,  3,  468, textureX, textureY); // CoreTurret39
		TurretModel[0][28] = new ModelRendererTurbo(this,  3,  468, textureX, textureY); // CoreTurret26
		TurretModel[0][29] = new ModelRendererTurbo(this,  3,  468, textureX, textureY); // CoreTurret28
		TurretModel[0][30] = new ModelRendererTurbo(this,  3,  468, textureX, textureY); // CoreTurret29
		TurretModel[0][31] = new ModelRendererTurbo(this,  3,  468, textureX, textureY); // CoreTurret24
		TurretModel[0][32] = new ModelRendererTurbo(this,  3,  468, textureX, textureY); // Coreturret27
		TurretModel[0][33] = new ModelRendererTurbo(this,  3,  468, textureX, textureY); // CoreTurret25
		TurretModel[0][34] = new ModelRendererTurbo(this,  101,  438, textureX, textureY); // CoreTurret38
		TurretModel[0][35] = new ModelRendererTurbo(this,  84,  438, textureX, textureY); // CoreTurret22
		TurretModel[0][36] = new ModelRendererTurbo(this,  84,  438, textureX, textureY); // CoreTurret31
		TurretModel[0][37] = new ModelRendererTurbo(this,  84,  438, textureX, textureY); // CoreTurret30
		TurretModel[0][38] = new ModelRendererTurbo(this,  84,  438, textureX, textureY); // CoreTurret37
		TurretModel[0][39] = new ModelRendererTurbo(this,  84,  438, textureX, textureY); // CoreTurret37
		TurretModel[0][40] = new ModelRendererTurbo(this,  28,  469, textureX, textureY); // CoreTurret33
		TurretModel[0][41] = new ModelRendererTurbo(this,  28,  469, textureX, textureY); // CoreTurret34
		TurretModel[0][42] = new ModelRendererTurbo(this,  28,  469, textureX, textureY); // CoreTurret35
		TurretModel[0][43] = new ModelRendererTurbo(this,  84,  438, textureX, textureY); // CoreTurret23
		TurretModel[0][44] = new ModelRendererTurbo(this,  1,  487, textureX, textureY); // CoreTurretDecal1
		TurretModel[0][45] = new ModelRendererTurbo(this,  1,  498, textureX, textureY); // CoreTurretDecal2

		TurretModel[0][0].addBox(-3.7F, 4F, -6.6F, 11, 2, 17, 0F); // CoreTurret1
		TurretModel[0][0].setRotationPoint(0F, -26F, 8F);

		TurretModel[0][1].addBox(-3.2F, -2.9F, 1.4F, 11, 4, 9, 0F); // CoreTurret2
		TurretModel[0][1].setRotationPoint(0F, -26F, 8F);
		TurretModel[0][1].rotateAngleZ = -0.8726646F;

		TurretModel[0][2].addBox(-3.166667F, -2.9F, -6.6F, 11, 4, 4, 0F); // CoreTurret3
		TurretModel[0][2].setRotationPoint(0F, -26F, 8F);
		TurretModel[0][2].rotateAngleZ = -0.8726646F;

		TurretModel[0][3].addBox(0.3F, 3F, -2.6F, 5, 1, 4, 0F); // CoreTurret4
		TurretModel[0][3].setRotationPoint(0F, -26F, 8F);

		TurretModel[0][4].addBox(0.3F, 1F, -2.6F, 3, 2, 4, 0F); // CoreTurret5
		TurretModel[0][4].setRotationPoint(0F, -26F, 8F);

		TurretModel[0][5].addBox(1.3F, -1.4F, -6.6F, 4, 4, 17, 0F); // CoreTurret6
		TurretModel[0][5].setRotationPoint(0F, -26F, 8F);
		TurretModel[0][5].rotateAngleZ = -0.8726646F;

		TurretModel[0][6].addBox(-3.7F, -4F, -6.6F, 4, 8, 17, 0F); // CoreTurret7
		TurretModel[0][6].setRotationPoint(0F, -26F, 8F);

		TurretModel[0][7].addBox(-9.4F, -4F, -1.2F, 6, 10, 6, 0F); // CoreTurret8
		TurretModel[0][7].setRotationPoint(0F, -26F, 8F);

		TurretModel[0][8].addBox(-9.9F, -4F, -3.2F, 5, 10, 8, 0F); // CoreTurret9
		TurretModel[0][8].setRotationPoint(0F, -26F, 8F);
		TurretModel[0][8].rotateAngleY = 0.7853982F;

		TurretModel[0][9].addBox(-6F, -4F, -7.3F, 8, 10, 5, 0F); // CoreTurret10
		TurretModel[0][9].setRotationPoint(0F, -26F, 8F);
		TurretModel[0][9].rotateAngleY = 0.7853982F;

		TurretModel[0][10].addBox(-4.7F, -3F, -8F, 3, 4, 1, 0F); // CoreTurret11
		TurretModel[0][10].setRotationPoint(0F, -26F, 8F);
		TurretModel[0][10].rotateAngleY = 0.7853982F;

		TurretModel[0][11].addBox(-1.2F, -4F, 1.4F, 3, 2, 2, 0F); // CoreTurret16
		TurretModel[0][11].setRotationPoint(0F, -26F, 8F);
		TurretModel[0][11].rotateAngleZ = -0.8726646F;

		TurretModel[0][12].addBox(0.3F, -3.5F, 1.4F, 2, 1, 2, 0F); // CoreTurret19
		TurretModel[0][12].setRotationPoint(0F, -26F, 8F);

		TurretModel[0][13].addBox(2.2F, -1.2F, 1.4F, 2, 2, 2, 0F); // CoreTurret15
		TurretModel[0][13].setRotationPoint(0F, -26F, 8F);

		TurretModel[0][14].addBox(2.2F, -1.2F, -4.6F, 2, 2, 2, 0F); // CoreTurret14
		TurretModel[0][14].setRotationPoint(0F, -26F, 8F);

		TurretModel[0][15].addBox(-1.2F, -4F, -4.6F, 3, 2, 2, 0F); // CoreTurret13
		TurretModel[0][15].setRotationPoint(0F, -26F, 8F);
		TurretModel[0][15].rotateAngleZ = -0.8726646F;

		TurretModel[0][16].addBox(0.3F, -3.5F, -4.6F, 2, 1, 2, 0F); // CoreTurret12
		TurretModel[0][16].setRotationPoint(0F, -26F, 8F);

		TurretModel[0][17].addBox(-1F, -3.1F, 3.4F, 3, 1, 4, 0F); // CoreTurret17
		TurretModel[0][17].setRotationPoint(0F, -26F, 8F);
		TurretModel[0][17].rotateAngleZ = -0.8726646F;

		TurretModel[0][18].addBox(-1.5F, -3.2F, 7.4F, 4, 2, 2, 0F); // CoreTurret18
		TurretModel[0][18].setRotationPoint(0F, -26F, 8F);
		TurretModel[0][18].rotateAngleZ = -0.8726646F;

		TurretModel[0][19].addBox(-2.7F, -5F, 2.8F, 3, 2, 4, 0F); // CoreTurret21
		TurretModel[0][19].setRotationPoint(0F, -26F, 8F);

		TurretModel[0][20].addBox(-11.4F, -8F, -1.8F, 3, 6, 4, 0F); // CoreTurret43
		TurretModel[0][20].setRotationPoint(0F, -26F, 8F);
		TurretModel[0][20].rotateAngleY = 0.7853982F;

		TurretModel[0][21].addBox(-6.6F, -8F, -0.1F, 4, 4, 3, 0F); // CoreTurret36
		TurretModel[0][21].setRotationPoint(0F, -26F, 8F);

		TurretModel[0][22].addBox(-8.6F, -8F, 2F, 2, 3, 3, 0F); // CoreTurret40
		TurretModel[0][22].setRotationPoint(0F, -26F, 8F);
		TurretModel[0][22].rotateAngleY = 0.7853982F;

		TurretModel[0][23].addBox(-6.6F, -8F, 6.6F, 4, 6, 3, 0F); // CoreTurret45
		TurretModel[0][23].setRotationPoint(0F, -26F, 8F);

		TurretModel[0][24].addBox(-4.8F, -8F, -1.8F, 3, 3, 2, 0F); // CoreTurret37
		TurretModel[0][24].setRotationPoint(0F, -26F, 8F);
		TurretModel[0][24].rotateAngleY = 0.7853982F;

		TurretModel[0][25].addBox(-8.6F, -8F, -4.7F, 4, 4, 3, 0F); // CoreTurret42
		TurretModel[0][25].setRotationPoint(0F, -26F, 8F);
		TurretModel[0][25].rotateAngleY = 0.7853982F;

		TurretModel[0][26].addBox(-9.5F, -8F, 2.7F, 3, 6, 4, 0F); // CoreTurret41
		TurretModel[0][26].setRotationPoint(0F, -26F, 8F);

		TurretModel[0][27].addBox(-6.7F, -8F, 1.8F, 5, 2, 6, 0F); // CoreTurret39
		TurretModel[0][27].setRotationPoint(0F, -26F, 8F);

		TurretModel[0][28].addBox(-6.9F, -6.4F, 2F, 2, 2, 3, 0F); // CoreTurret26
		TurretModel[0][28].setRotationPoint(0F, -26F, 8F);
		TurretModel[0][28].rotateAngleY = 0.7853982F;

		TurretModel[0][29].addBox(-4.8F, -6.5F, -0.4F, 3, 2, 2, 0F); // CoreTurret28
		TurretModel[0][29].setRotationPoint(0F, -26F, 8F);
		TurretModel[0][29].rotateAngleY = 0.7853982F;

		TurretModel[0][30].addBox(-4.8F, -5.6F, -5.4F, 3, 2, 2, 0F); // CoreTurret29
		TurretModel[0][30].setRotationPoint(0F, -26F, 8F);
		TurretModel[0][30].rotateAngleX = -0.7853982F;
		TurretModel[0][30].rotateAngleY = 0.7853982F;

		TurretModel[0][31].addBox(-4.8F, -5F, -1.8F, 3, 2, 4, 0F); // CoreTurret24
		TurretModel[0][31].setRotationPoint(0F, -26F, 8F);
		TurretModel[0][31].rotateAngleY = 0.7853982F;

		TurretModel[0][32].addBox(-10F, -1F, 2F, 2, 2, 3, 0F); // Coreturret27
		TurretModel[0][32].setRotationPoint(0F, -26F, 8F);
		TurretModel[0][32].rotateAngleY = 0.7853982F;
		TurretModel[0][32].rotateAngleZ = -0.7853982F;

		TurretModel[0][33].addBox(-8.6F, -5F, 2F, 4, 2, 3, 0F); // CoreTurret25
		TurretModel[0][33].setRotationPoint(0F, -26F, 8F);
		TurretModel[0][33].rotateAngleY = 0.7853982F;

		TurretModel[0][34].addBox(-2.7F, -6F, 4.5F, 2, 1, 3, 0F); // CoreTurret38
		TurretModel[0][34].setRotationPoint(0F, -26F, 8F);

		TurretModel[0][35].addBox(-1.7F, -6.8F, 2.9F, 5, 1, 1, 0F); // CoreTurret22
		TurretModel[0][35].setRotationPoint(0F, -26F, 8F);

		TurretModel[0][36].addBox(-6.4F, -4.3F, 4.5F, 1, 1, 3, 0F); // CoreTurret31
		TurretModel[0][36].setRotationPoint(0F, -26F, 8F);
		TurretModel[0][36].rotateAngleZ = -0.7853982F;

		TurretModel[0][37].addBox(-6.4F, -4.3F, 1.8F, 1, 1, 3, 0F); // CoreTurret30
		TurretModel[0][37].setRotationPoint(0F, -26F, 8F);
		TurretModel[0][37].rotateAngleZ = -0.7853982F;

		TurretModel[0][38].addBox(-3.4F, -7F, 5.2F, 2, 1, 3, 0F); // CoreTurret37
		TurretModel[0][38].setRotationPoint(0F, -26F, 8F);

		TurretModel[0][39].addBox(-3.4F, -7F, 1.2F, 2, 1, 4, 0F); // CoreTurret37
		TurretModel[0][39].setRotationPoint(0F, -26F, 8F);

		TurretModel[0][40].addBox(3.4F, -6.8F, 4.5F, 1, 1, 1, 0F); // CoreTurret33
		TurretModel[0][40].setRotationPoint(0F, -26F, 8F);
		TurretModel[0][40].rotateAngleZ = 0.7853982F;

		TurretModel[0][41].addBox(-2.4F, -7F, 4.5F, 2, 1, 1, 0F); // CoreTurret34
		TurretModel[0][41].setRotationPoint(0F, -26F, 8F);

		TurretModel[0][42].addBox(3.4F, -6.4F, 4.5F, 1, 1, 1, 0F); // CoreTurret35
		TurretModel[0][42].setRotationPoint(0F, -26F, 8F);
		TurretModel[0][42].rotateAngleZ = 0.7853982F;

		TurretModel[0][43].addBox(-2.7F, -6F, 1.9F, 2, 1, 3, 0F); // CoreTurret23
		TurretModel[0][43].setRotationPoint(0F, -26F, 8F);

		TurretModel[0][44].addBox(-4F, -2F, -7.5F, 7, 7, 1, 0); // CoreTurretDecal1
		TurretModel[0][44].setRotationPoint(0F, -26F, 8F);

		TurretModel[0][45].addBox(-4F, -2F, 10.1F, 7, 7, 1, 0); // CoreTurretDecal2
		TurretModel[0][45].setRotationPoint(0F, -26F, 8F);		
		
		for(ModelRendererTurbo TurretPart : TurretModel[0])
			TurretPart.setRotationPoint(0F, -26F, 8F);


		TurretModel[1] = new ModelRendererTurbo[4];
		TurretModel[1][0] = new ModelRendererTurbo(this,  67,  421, textureX, textureY); // CoreTurretBarrel1
		TurretModel[1][1] = new ModelRendererTurbo(this,  91,  431, textureX, textureY); // CoreTurretBarrel2
		TurretModel[1][2] = new ModelRendererTurbo(this,  91,  431, textureX, textureY); // CoreTurretBarrel3
		TurretModel[1][3] = new ModelRendererTurbo(this,  67,  421, textureX, textureY); // CoreTurretBarrel4

		TurretModel[1][0].addBox(0.3F, -2.2F, -2.6F, 4, 4, 4, 0F); // CoreTurretBarrel1
		TurretModel[1][0].setRotationPoint(0F, -26F, 8F);

		TurretModel[1][1].addBox(-0.5F, 0F, -2F, 6, 1, 1, 0F); // CoreTurretBarrel2
		TurretModel[1][1].setRotationPoint(4F, -26F, 8F);

		TurretModel[1][2].addBox(2.5F, -0.5F, -1F, 13, 1, 1, 0F); // CoreTurretBarrel3
		TurretModel[1][2].setRotationPoint(4F, -26F, 8F);

		TurretModel[1][3].addBox(-0.5F, -1F, -1.5F, 5, 2, 2, 0F); // CoreTurretBarrel4
		TurretModel[1][3].setRotationPoint(4F, -26F, 8F);		
		
		for(ModelRendererTurbo TurretPart : TurretModel[1])
			TurretPart.setRotationPoint(0F, -26F, 8F);


		TurretModel[2] = new ModelRendererTurbo[4];
		TurretModel[2][0] = new ModelRendererTurbo(this,  67,  421, textureX, textureY); // CoreTurretBarrel1
		TurretModel[2][1] = new ModelRendererTurbo(this,  91,  431, textureX, textureY); // CoreTurretBarrel2
		TurretModel[2][2] = new ModelRendererTurbo(this,  91,  431, textureX, textureY); // CoreTurretBarrel3
		TurretModel[2][3] = new ModelRendererTurbo(this,  67,  421, textureX, textureY); // CoreTurretBarrel4

		TurretModel[2][0].addBox(0.3F, -2.2F, -2.6F, 4, 4, 4, 0F); // CoreTurretBarrel1
		TurretModel[2][0].setRotationPoint(0F, -26F, 8F);

		TurretModel[2][1].addBox(-0.5F, 0F, -2F, 6, 1, 1, 0F); // CoreTurretBarrel2
		TurretModel[2][1].setRotationPoint(4F, -26F, 8F);

		TurretModel[2][2].addBox(2.5F, -0.5F, -1F, 13, 1, 1, 0F); // CoreTurretBarrel3
		TurretModel[2][2].setRotationPoint(4F, -26F, 8F);

		TurretModel[2][3].addBox(-0.5F, -1F, -1.5F, 5, 2, 2, 0F); // CoreTurretBarrel4
		TurretModel[2][3].setRotationPoint(4F, -26F, 8F);		
		
		for(ModelRendererTurbo TurretPart : TurretModel[2])
			TurretPart.setRotationPoint(0F, -26F, 8F);
		
		registerGunModel("Turret", TurretModel);
		
		
		
		
		translateAll(0, 0, 0);


		flipAll();
	}
}