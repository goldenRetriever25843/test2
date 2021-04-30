//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelMecha;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelGlasgow extends ModelMecha //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelGlasgow() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[129];
		bodyModel[0] = new ModelRendererTurbo(this, 89, 53, textureX, textureY); // Core1
		bodyModel[1] = new ModelRendererTurbo(this, 261, 65, textureX, textureY); // Core10
		bodyModel[2] = new ModelRendererTurbo(this, 168, 168, textureX, textureY); // Core100
		bodyModel[3] = new ModelRendererTurbo(this, 168, 178, textureX, textureY); // Core101
		bodyModel[4] = new ModelRendererTurbo(this, 168, 173, textureX, textureY); // Core102
		bodyModel[5] = new ModelRendererTurbo(this, 133, 186, textureX, textureY); // Core103
		bodyModel[6] = new ModelRendererTurbo(this, 186, 186, textureX, textureY); // Core104
		bodyModel[7] = new ModelRendererTurbo(this, 168, 185, textureX, textureY); // Core105
		bodyModel[8] = new ModelRendererTurbo(this, 168, 190, textureX, textureY); // Core106
		bodyModel[9] = new ModelRendererTurbo(this, 168, 195, textureX, textureY); // Core107
		bodyModel[10] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // Core108
		bodyModel[11] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // Core109
		bodyModel[12] = new ModelRendererTurbo(this, 131, 209, textureX, textureY); // Core11
		bodyModel[13] = new ModelRendererTurbo(this, 131, 209, textureX, textureY); // Core110
		bodyModel[14] = new ModelRendererTurbo(this, 11, 173, textureX, textureY); // Core111
		bodyModel[15] = new ModelRendererTurbo(this, 110, 130, textureX, textureY); // Core112
		bodyModel[16] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // Core113
		bodyModel[17] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // Core114
		bodyModel[18] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // Core115
		bodyModel[19] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // Core116
		bodyModel[20] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // Core117
		bodyModel[21] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // Core118
		bodyModel[22] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // Core119
		bodyModel[23] = new ModelRendererTurbo(this, 73, 227, textureX, textureY); // Core12
		bodyModel[24] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // Core120
		bodyModel[25] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // Core121
		bodyModel[26] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // Core122
		bodyModel[27] = new ModelRendererTurbo(this, 62, 111, textureX, textureY); // Core123
		bodyModel[28] = new ModelRendererTurbo(this, 121, 233, textureX, textureY); // Core124
		bodyModel[29] = new ModelRendererTurbo(this, 11, 173, textureX, textureY); // Core125
		bodyModel[30] = new ModelRendererTurbo(this, 121, 233, textureX, textureY); // Core126
		bodyModel[31] = new ModelRendererTurbo(this, 261, 65, textureX, textureY); // Core127
		bodyModel[32] = new ModelRendererTurbo(this, 129, 103, textureX, textureY); // Core128
		bodyModel[33] = new ModelRendererTurbo(this, 73, 227, textureX, textureY); // Core13
		bodyModel[34] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Core14
		bodyModel[35] = new ModelRendererTurbo(this, 131, 209, textureX, textureY); // Core15
		bodyModel[36] = new ModelRendererTurbo(this, 73, 227, textureX, textureY); // Core16
		bodyModel[37] = new ModelRendererTurbo(this, 301, 89, textureX, textureY); // Core17
		bodyModel[38] = new ModelRendererTurbo(this, 131, 209, textureX, textureY); // Core18
		bodyModel[39] = new ModelRendererTurbo(this, 73, 227, textureX, textureY); // Core19
		bodyModel[40] = new ModelRendererTurbo(this, 127, 32, textureX, textureY); // Core2
		bodyModel[41] = new ModelRendererTurbo(this, 261, 65, textureX, textureY); // Core20
		bodyModel[42] = new ModelRendererTurbo(this, 263, 101, textureX, textureY); // Core21
		bodyModel[43] = new ModelRendererTurbo(this, 263, 101, textureX, textureY); // Core22
		bodyModel[44] = new ModelRendererTurbo(this, 38, 197, textureX, textureY); // Core23
		bodyModel[45] = new ModelRendererTurbo(this, 89, 53, textureX, textureY); // Core24
		bodyModel[46] = new ModelRendererTurbo(this, 121, 233, textureX, textureY); // Core25
		bodyModel[47] = new ModelRendererTurbo(this, 97, 2, textureX, textureY); // Core26
		bodyModel[48] = new ModelRendererTurbo(this, 291, 89, textureX, textureY); // Core27
		bodyModel[49] = new ModelRendererTurbo(this, 131, 58, textureX, textureY); // Core28
		bodyModel[50] = new ModelRendererTurbo(this, 11, 185, textureX, textureY); // Core29
		bodyModel[51] = new ModelRendererTurbo(this, 121, 233, textureX, textureY); // Core3
		bodyModel[52] = new ModelRendererTurbo(this, 73, 227, textureX, textureY); // Core30
		bodyModel[53] = new ModelRendererTurbo(this, 277, 89, textureX, textureY); // Core31
		bodyModel[54] = new ModelRendererTurbo(this, 11, 185, textureX, textureY); // Core32
		bodyModel[55] = new ModelRendererTurbo(this, 302, 5, textureX, textureY); // Core33
		bodyModel[56] = new ModelRendererTurbo(this, 73, 227, textureX, textureY); // Core34
		bodyModel[57] = new ModelRendererTurbo(this, 5, 83, textureX, textureY); // Core35
		bodyModel[58] = new ModelRendererTurbo(this, 73, 227, textureX, textureY); // Core36
		bodyModel[59] = new ModelRendererTurbo(this, 150, 69, textureX, textureY); // Core37
		bodyModel[60] = new ModelRendererTurbo(this, 73, 227, textureX, textureY); // Core38
		bodyModel[61] = new ModelRendererTurbo(this, 131, 209, textureX, textureY); // Core39
		bodyModel[62] = new ModelRendererTurbo(this, 121, 233, textureX, textureY); // Core4
		bodyModel[63] = new ModelRendererTurbo(this, 38, 197, textureX, textureY); // Core40
		bodyModel[64] = new ModelRendererTurbo(this, 274, 101, textureX, textureY); // Core41
		bodyModel[65] = new ModelRendererTurbo(this, 38, 197, textureX, textureY); // Core42
		bodyModel[66] = new ModelRendererTurbo(this, 38, 197, textureX, textureY); // Core43
		bodyModel[67] = new ModelRendererTurbo(this, 263, 101, textureX, textureY); // Core44
		bodyModel[68] = new ModelRendererTurbo(this, 38, 197, textureX, textureY); // Core45
		bodyModel[69] = new ModelRendererTurbo(this, 286, 101, textureX, textureY); // Core46
		bodyModel[70] = new ModelRendererTurbo(this, 261, 65, textureX, textureY); // Core47
		bodyModel[71] = new ModelRendererTurbo(this, 38, 197, textureX, textureY); // Core48
		bodyModel[72] = new ModelRendererTurbo(this, 261, 65, textureX, textureY); // Core49
		bodyModel[73] = new ModelRendererTurbo(this, 205, 59, textureX, textureY); // Core5
		bodyModel[74] = new ModelRendererTurbo(this, 261, 65, textureX, textureY); // Core50
		bodyModel[75] = new ModelRendererTurbo(this, 73, 227, textureX, textureY); // Core51
		bodyModel[76] = new ModelRendererTurbo(this, 73, 227, textureX, textureY); // Core52
		bodyModel[77] = new ModelRendererTurbo(this, 261, 65, textureX, textureY); // Core53
		bodyModel[78] = new ModelRendererTurbo(this, 73, 227, textureX, textureY); // Core54
		bodyModel[79] = new ModelRendererTurbo(this, 261, 65, textureX, textureY); // Core55
		bodyModel[80] = new ModelRendererTurbo(this, 325, 54, textureX, textureY); // Core56
		bodyModel[81] = new ModelRendererTurbo(this, 68, 77, textureX, textureY); // Core57
		bodyModel[82] = new ModelRendererTurbo(this, 89, 53, textureX, textureY); // Core58
		bodyModel[83] = new ModelRendererTurbo(this, 73, 227, textureX, textureY); // Core59
		bodyModel[84] = new ModelRendererTurbo(this, 89, 53, textureX, textureY); // Core6
		bodyModel[85] = new ModelRendererTurbo(this, 251, 95, textureX, textureY); // Core60
		bodyModel[86] = new ModelRendererTurbo(this, 251, 95, textureX, textureY); // Core61
		bodyModel[87] = new ModelRendererTurbo(this, 73, 227, textureX, textureY); // Core62
		bodyModel[88] = new ModelRendererTurbo(this, 251, 95, textureX, textureY); // Core63
		bodyModel[89] = new ModelRendererTurbo(this, 79, 263, textureX, textureY); // Core64
		bodyModel[90] = new ModelRendererTurbo(this, 251, 95, textureX, textureY); // Core65
		bodyModel[91] = new ModelRendererTurbo(this, 261, 65, textureX, textureY); // Core66
		bodyModel[92] = new ModelRendererTurbo(this, 261, 65, textureX, textureY); // Core67
		bodyModel[93] = new ModelRendererTurbo(this, 261, 65, textureX, textureY); // Core68
		bodyModel[94] = new ModelRendererTurbo(this, 261, 65, textureX, textureY); // Core69
		bodyModel[95] = new ModelRendererTurbo(this, 121, 233, textureX, textureY); // Core7
		bodyModel[96] = new ModelRendererTurbo(this, 277, 89, textureX, textureY); // Core70
		bodyModel[97] = new ModelRendererTurbo(this, 291, 89, textureX, textureY); // Core71
		bodyModel[98] = new ModelRendererTurbo(this, 73, 227, textureX, textureY); // Core72
		bodyModel[99] = new ModelRendererTurbo(this, 131, 209, textureX, textureY); // Core73
		bodyModel[100] = new ModelRendererTurbo(this, 6, 108, textureX, textureY); // Core74
		bodyModel[101] = new ModelRendererTurbo(this, 333, 73, textureX, textureY); // Core75
		bodyModel[102] = new ModelRendererTurbo(this, 263, 101, textureX, textureY); // Core76
		bodyModel[103] = new ModelRendererTurbo(this, 274, 101, textureX, textureY); // Core77
		bodyModel[104] = new ModelRendererTurbo(this, 263, 101, textureX, textureY); // Core78
		bodyModel[105] = new ModelRendererTurbo(this, 263, 101, textureX, textureY); // Core79
		bodyModel[106] = new ModelRendererTurbo(this, 73, 227, textureX, textureY); // Core8
		bodyModel[107] = new ModelRendererTurbo(this, 286, 101, textureX, textureY); // Core80
		bodyModel[108] = new ModelRendererTurbo(this, 261, 65, textureX, textureY); // Core81
		bodyModel[109] = new ModelRendererTurbo(this, 305, 35, textureX, textureY); // Core82
		bodyModel[110] = new ModelRendererTurbo(this, 73, 227, textureX, textureY); // Core83
		bodyModel[111] = new ModelRendererTurbo(this, 131, 209, textureX, textureY); // Core84
		bodyModel[112] = new ModelRendererTurbo(this, 4, 135, textureX, textureY); // Core85
		bodyModel[113] = new ModelRendererTurbo(this, 315, 96, textureX, textureY); // Core86
		bodyModel[114] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Core87
		bodyModel[115] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Core88
		bodyModel[116] = new ModelRendererTurbo(this, 205, 94, textureX, textureY); // Core89
		bodyModel[117] = new ModelRendererTurbo(this, 335, 42, textureX, textureY); // Core9
		bodyModel[118] = new ModelRendererTurbo(this, 305, 35, textureX, textureY); // Core90
		bodyModel[119] = new ModelRendererTurbo(this, 200, 2, textureX, textureY); // Core91
		bodyModel[120] = new ModelRendererTurbo(this, 144, 7, textureX, textureY); // Core92
		bodyModel[121] = new ModelRendererTurbo(this, 212, 29, textureX, textureY); // Core93
		bodyModel[122] = new ModelRendererTurbo(this, 133, 168, textureX, textureY); // Core94
		bodyModel[123] = new ModelRendererTurbo(this, 186, 168, textureX, textureY); // Core95
		bodyModel[124] = new ModelRendererTurbo(this, 131, 209, textureX, textureY); // Core96
		bodyModel[125] = new ModelRendererTurbo(this, 11, 173, textureX, textureY); // Core97
		bodyModel[126] = new ModelRendererTurbo(this, 73, 227, textureX, textureY); // Core98
		bodyModel[127] = new ModelRendererTurbo(this, 56, 138, textureX, textureY); // Core99
		bodyModel[128] = new ModelRendererTurbo(this, 261, 65, textureX, textureY); // Core130

		bodyModel[0].addShapeBox(5.85F, -31.7F, -2F, 1, 1, 1, 0F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F); // Core1
		bodyModel[0].setRotationPoint(1F, -62F, 0F);

		bodyModel[1].addShapeBox(-12F, -13F, -9F, 5, 5, 7, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core10
		bodyModel[1].setRotationPoint(0F, -62F, 0F);

		bodyModel[2].addShapeBox(-16F, -20.5F, 13.5F, 3, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core100
		bodyModel[2].setRotationPoint(0F, -62F, 0F);

		bodyModel[3].addShapeBox(-16F, -18.5F, 13.5F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Core101
		bodyModel[3].setRotationPoint(0F, -62F, 0F);

		bodyModel[4].addBox(-16F, -19.5F, 13.5F, 3, 1, 1, 0F); // Core102
		bodyModel[4].setRotationPoint(0F, -62F, 0F);

		bodyModel[5].addShapeBox(-15F, -23F, -13.5F, 11, 8, 3, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, -1.5F, .5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, -1.5F, .5F); // Core103
		bodyModel[5].setRotationPoint(0F, -62F, 0F);

		bodyModel[6].addShapeBox(-17F, -21.5F, -13.5F, 2, 5, 3, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, -1.5F, .5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, -1.5F, .5F); // Core104
		bodyModel[6].setRotationPoint(0F, -62F, 0F);

		bodyModel[7].addShapeBox(-16F, -20.5F, -14.5F, 3, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core105
		bodyModel[7].setRotationPoint(0F, -62F, 0F);

		bodyModel[8].addBox(-16F, -19.5F, -14.5F, 3, 1, 1, 0F); // Core106
		bodyModel[8].setRotationPoint(0F, -62F, 0F);

		bodyModel[9].addShapeBox(-16F, -18.5F, -14.5F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Core107
		bodyModel[9].setRotationPoint(0F, -62F, 0F);

		bodyModel[10].addShapeBox(-7F, -33F, -3.5F, 8, 6, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Core108
		bodyModel[10].setRotationPoint(0F, -62F, 0F);

		bodyModel[11].addShapeBox(1F, -33F, -3.5F, 5, 5, 7, 0F, 0F, 0F, 0F, 0F, -1F, -.5F, 0F, -1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F); // Core109
		bodyModel[11].setRotationPoint(0F, -62F, 0F);

		bodyModel[12].addBox(1F, -23F, -14F, 2, 8, 3, 0F); // Core11
		bodyModel[12].setRotationPoint(0F, -62F, 0F);

		bodyModel[13].addBox(1F, -23F, 11F, 2, 8, 3, 0F); // Core110
		bodyModel[13].setRotationPoint(0F, -62F, 0F);

		bodyModel[14].addShapeBox(-36F, -27F, -10F, 9, 21, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core111
		bodyModel[14].setRotationPoint(0F, -62F, 0F);

		bodyModel[15].addBox(-6F, -16F, -10F, 18, 6, 20, 0F); // Core112
		bodyModel[15].setRotationPoint(0F, -62F, 0F);

		bodyModel[16].addShapeBox(1F, -34F, -3.5F, 5, 1, 7, 0F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, -.5F, 0F, 1F, -.5F, 0F, 0F, 0F); // Core113
		bodyModel[16].setRotationPoint(0F, -62F, 0F);

		bodyModel[17].addShapeBox(-7F, -34F, -3.5F, 8, 1, 7, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core114
		bodyModel[17].setRotationPoint(0F, -62F, 0F);

		bodyModel[18].addShapeBox(1F, -28F, -3.5F, 5, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Core115
		bodyModel[18].setRotationPoint(0F, -62F, 0F);

		bodyModel[19].addShapeBox(1F, -29F, -3.5F, 6, 2, 7, 0F, 0F, 0F, 0F, 0F, -2F, -.5F, 0F, -2F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F); // Core116
		bodyModel[19].setRotationPoint(0F, -62F, 0F);

		bodyModel[20].addShapeBox(-1F, -27F, -3.5F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Core117
		bodyModel[20].setRotationPoint(0F, -62F, 0F);

		bodyModel[21].addShapeBox(1F, -27F, -3.5F, 6, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, -.5F, 0F, .3F, -.5F, 0F, 0F, 0F); // Core118
		bodyModel[21].setRotationPoint(0F, -62F, 0F);

		bodyModel[22].addShapeBox(7F, -27F, -3F, 1, 1, 6, 0F, 0F, 0F, 0F, -.5F, -.3F, -.5F, -.5F, -.3F, -.5F, 0F, 0F, 0F, 0F, .3F, 0F, -.5F, .3F, -.5F, -.5F, .3F, -.5F, 0F, .3F, 0F); // Core119
		bodyModel[22].setRotationPoint(0F, -62F, 0F);

		bodyModel[23].addShapeBox(-5F, -25F, -25F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, -.5F, -.3F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.3F, 0F, -.5F, 0F, 0F, 0F, 0F); // Core12
		bodyModel[23].setRotationPoint(0F, -62F, 0F);
		bodyModel[23].rotateAngleX = -0.6981317F;

		bodyModel[24].addShapeBox(6F, -32F, -3F, 1, 4, 6, 0F, 0F, 0F, 0F, .5F, -.5F, -1F, .5F, -.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, -.2F, -1F, .3F, -.2F, -1F, 0F, 0F, 0F); // Core120
		bodyModel[24].setRotationPoint(0F, -62F, 0F);

		bodyModel[25].addShapeBox(6F, -28F, -3F, 1, 1, 6, 0F, 0F, 0F, 0F, .3F, .2F, -1F, .3F, .2F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -.5F, 0F, -1.5F, -.5F, 0F, -1.5F, 0F, 0F, -1F); // Core121
		bodyModel[25].setRotationPoint(0F, -62F, 0F);

		bodyModel[26].addShapeBox(6F, -33F, -3F, 1, 1, 6, 0F, 0F, 0F, -1F, .2F, -.6F, -1.5F, .2F, -.6F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, .5F, .5F, -1F, .5F, .5F, -1F, 0F, 0F, 0F); // Core122
		bodyModel[26].setRotationPoint(0F, -62F, 0F);

		bodyModel[27].addShapeBox(4F, -10F, -10F, 8, 2, 20, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, -1.8F); // Core123
		bodyModel[27].setRotationPoint(0F, -62F, 0F);

		bodyModel[28].addShapeBox(-6F, -24F, -15F, 10, 3, 7, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core124
		bodyModel[28].setRotationPoint(0F, -62F, 0F);

		bodyModel[29].addShapeBox(-38F, -27F, -10F, 2, 21, 20, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F); // Core125
		bodyModel[29].setRotationPoint(0F, -62F, 0F);

		bodyModel[30].addBox(-6F, -21F, -15F, 10, 4, 7, 0F); // Core126
		bodyModel[30].setRotationPoint(0F, -62F, 0F);

		bodyModel[31].addBox(-36F, 1F, -2.5F, 2, 5, 4, 0F); // Core127
		bodyModel[31].setRotationPoint(0F, -62F, 0F);
		bodyModel[31].rotateAngleZ = -0.89011792F;

		bodyModel[32].addShapeBox(-6F, -18F, -10F, 18, 2, 20, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core128
		bodyModel[32].setRotationPoint(0F, -62F, 0F);

		bodyModel[33].addShapeBox(-7F, -25F, -25F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core13
		bodyModel[33].setRotationPoint(0F, -62F, 0F);
		bodyModel[33].rotateAngleX = -0.6981317F;

		bodyModel[34].addShapeBox(-10F, -13F, -2F, 3, 5, 4, 0F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.8F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Core14
		bodyModel[34].setRotationPoint(0F, -62F, 0F);

		bodyModel[35].addShapeBox(3F, -23F, -14F, 2, 8, 3, 0F, 0F, 0F, 0F, 0F, -1.5F, -.5F, 0F, -1.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -.5F, 0F, -1.5F, -.5F, 0F, 0F, 0F); // Core15
		bodyModel[35].setRotationPoint(0F, -62F, 0F);

		bodyModel[36].addShapeBox(-2F, -28.5F, -6.8F, 1, 3, 2, 0F, 0F, -.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1F, 0F, -.5F, -.3F, 0F, -.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1F, 0F, -.5F, -.3F); // Core16
		bodyModel[36].setRotationPoint(0F, -62F, 0F);
		bodyModel[36].rotateAngleX = -0.34906585F;

		bodyModel[37].addShapeBox(-8F, -16F, -1.5F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core17
		bodyModel[37].setRotationPoint(0F, -62F, 0F);

		bodyModel[38].addShapeBox(5F, -21.5F, -13.5F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, -.5F, -.8F, 0F, -.5F, -.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, 0F); // Core18
		bodyModel[38].setRotationPoint(0F, -62F, 0F);

		bodyModel[39].addShapeBox(-4F, -28.5F, -6.8F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.3F, 0F, 0F, 0F); // Core19
		bodyModel[39].setRotationPoint(0F, -62F, 0F);
		bodyModel[39].rotateAngleX = -0.34906585F;

		bodyModel[40].addBox(-27F, -1F, -10F, 20, 1, 20, 0F); // Core2
		bodyModel[40].setRotationPoint(0F, -62F, 0F);

		bodyModel[41].addBox(-12F, -13F, -9F, 5, 3, 3, 0F); // Core20
		bodyModel[41].setRotationPoint(0F, -62F, 0F);

		bodyModel[42].addShapeBox(-15F, -13.2F, -8F, 2, 1, 1, 0F, -.2F, -.3F, -.1F, 0F, -.3F, -.1F, 0F, -.3F, -.1F, -.2F, -.3F, -.1F, -.2F, -.3F, -.1F, -.2F, -.3F, -.1F, -.2F, -.3F, -.1F, -.2F, -.3F, -.1F); // Core21
		bodyModel[42].setRotationPoint(0F, -62F, 0F);

		bodyModel[43].addShapeBox(-13.9F, -14.7F, -8F, 1, 2, 1, 0F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F); // Core22
		bodyModel[43].setRotationPoint(0F, -62F, 0F);

		bodyModel[44].addShapeBox(18F, -21F, 3F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Core23
		bodyModel[44].setRotationPoint(0F, -62F, 0F);
		bodyModel[44].rotateAngleZ = 0.03490659F;

		bodyModel[45].addShapeBox(5.75F, -29.1F, 1F, 1, 1, 1, 0F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F); // Core24
		bodyModel[45].setRotationPoint(1F, -62F, 0F);

		bodyModel[46].addShapeBox(-6F, -17F, 8F, 10, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Core25
		bodyModel[46].setRotationPoint(0F, -62F, 0F);

		bodyModel[47].addShapeBox(-7F, -27F, -10F, 1, 27, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Core26
		bodyModel[47].setRotationPoint(0F, -62F, 0F);

		bodyModel[48].addShapeBox(-15F, -12.5F, -8.5F, 1, 2, 2, 0F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F); // Core27
		bodyModel[48].setRotationPoint(0F, -62F, 0F);

		bodyModel[49].addShapeBox(15F, -23F, -7F, 2, 10, 14, 0F, 0F, 0F, 0F, -.5F, -.3F, 0F, -.5F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Core28
		bodyModel[49].setRotationPoint(0F, -62F, 0F);

		bodyModel[50].addShapeBox(4F, -25F, -7F, 2, 2, 14, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core29
		bodyModel[50].setRotationPoint(0F, -62F, 0F);

		bodyModel[51].addBox(-6F, -21F, 8F, 10, 4, 7, 0F); // Core3
		bodyModel[51].setRotationPoint(0F, -62F, 0F);

		bodyModel[52].addShapeBox(-2F, -28.5F, 4.8F, 1, 3, 2, 0F, 0F, -.5F, -.3F, 0F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.3F, 0F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, -.5F, 0F); // Core30
		bodyModel[52].setRotationPoint(0F, -62F, 0F);
		bodyModel[52].rotateAngleX = 0.34906585F;

		bodyModel[53].addBox(-14F, -12.5F, -8.5F, 2, 2, 2, 0F); // Core31
		bodyModel[53].setRotationPoint(0F, -62F, 0F);

		bodyModel[54].addShapeBox(6F, -25F, -7F, 9, 2, 14, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core32
		bodyModel[54].setRotationPoint(0F, -62F, 0F);

		bodyModel[55].addShapeBox(-8F, -24F, -6.5F, 1, 8, 13, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F); // Core33
		bodyModel[55].setRotationPoint(0F, -62F, 0F);

		bodyModel[56].addShapeBox(-4F, -28.5F, 4.8F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, -.5F, -.3F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.3F, 0F, -.5F, 0F, 0F, 0F, 0F); // Core34
		bodyModel[56].setRotationPoint(0F, -62F, 0F);
		bodyModel[56].rotateAngleX = 0.34906585F;

		bodyModel[57].addBox(0F, -23F, -7F, 15, 9, 14, 0F); // Core35
		bodyModel[57].setRotationPoint(0F, -62F, 0F);

		bodyModel[58].addShapeBox(-6F, -28.5F, 4.8F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core36
		bodyModel[58].setRotationPoint(0F, -62F, 0F);
		bodyModel[58].rotateAngleX = 0.34906585F;

		bodyModel[59].addShapeBox(13F, -21F, -9F, 3, 11, 18, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Core37
		bodyModel[59].setRotationPoint(0F, -62F, 0F);

		bodyModel[60].addShapeBox(-6F, -28.5F, -6.8F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core38
		bodyModel[60].setRotationPoint(0F, -62F, 0F);
		bodyModel[60].rotateAngleX = -0.34906585F;

		bodyModel[61].addShapeBox(5F, -18.5F, -13.5F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.8F, 0F, -.5F, -.8F, 0F, 0F, 0F); // Core39
		bodyModel[61].setRotationPoint(0F, -62F, 0F);

		bodyModel[62].addShapeBox(-6F, -24F, 8F, 10, 3, 7, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core4
		bodyModel[62].setRotationPoint(0F, -62F, 0F);

		bodyModel[63].addShapeBox(16F, -21F, 3F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core40
		bodyModel[63].setRotationPoint(0F, -62F, 0F);
		bodyModel[63].rotateAngleZ = 0.03490659F;

		bodyModel[64].addShapeBox(-16.9F, -12.2F, -8F, 1, 2, 1, 0F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F); // Core41
		bodyModel[64].setRotationPoint(0F, -62F, 0F);
		bodyModel[64].rotateAngleZ = -0.15707963F;

		bodyModel[65].addShapeBox(16F, -16F, 3F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core42
		bodyModel[65].setRotationPoint(0F, -62F, 0F);
		bodyModel[65].rotateAngleZ = 0.03490659F;

		bodyModel[66].addShapeBox(18F, -21F, -4F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Core43
		bodyModel[66].setRotationPoint(0F, -62F, 0F);
		bodyModel[66].rotateAngleZ = 0.03490659F;

		bodyModel[67].addShapeBox(-13.9F, -15F, -8F, 1, 1, 1, 0F, -.15F, -.4F, -.15F, -.15F, -.4F, -.15F, -.15F, -.4F, -.15F, -.15F, -.4F, -.15F, -.15F, -.4F, -.15F, -.15F, -.4F, -.15F, -.15F, -.4F, -.15F, -.15F, -.4F, -.15F); // Core44
		bodyModel[67].setRotationPoint(0F, -62F, 0F);

		bodyModel[68].addShapeBox(16F, -21F, -4F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core45
		bodyModel[68].setRotationPoint(0F, -62F, 0F);
		bodyModel[68].rotateAngleZ = 0.03490659F;

		bodyModel[69].addShapeBox(-14.7F, -14.9F, -8F, 1, 1, 1, 0F, -.2F, -.4F, -.25F, 0F, -.4F, -.25F, 0F, -.4F, -.25F, -.2F, -.4F, -.25F, -.1F, -.4F, -.25F, 0F, -.4F, -.25F, 0F, -.4F, -.25F, -.1F, -.4F, -.25F); // Core46
		bodyModel[69].setRotationPoint(0F, -62F, 0F);

		bodyModel[70].addBox(-12F, -8F, -9F, 5, 7, 1, 0F); // Core47
		bodyModel[70].setRotationPoint(0F, -62F, 0F);

		bodyModel[71].addShapeBox(16F, -16F, -4F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core48
		bodyModel[71].setRotationPoint(0F, -62F, 0F);
		bodyModel[71].rotateAngleZ = 0.03490659F;

		bodyModel[72].addBox(-28F, -5F, -9F, 16, 4, 1, 0F); // Core49
		bodyModel[72].setRotationPoint(0F, -62F, 0F);

		bodyModel[73].addBox(-27F, -27F, -10F, 20, 26, 1, 0F); // Core5
		bodyModel[73].setRotationPoint(0F, -62F, 0F);

		bodyModel[74].addBox(-28F, -27F, -9F, 21, 1, 1, 0F); // Core50
		bodyModel[74].setRotationPoint(0F, -62F, 0F);

		bodyModel[75].addBox(-6F, -26F, -7F, 2, 3, 14, 0F); // Core51
		bodyModel[75].setRotationPoint(0F, -62F, 0F);

		bodyModel[76].addBox(-4F, -26F, -7F, 6, 3, 2, 0F); // Core52
		bodyModel[76].setRotationPoint(0F, -62F, 0F);

		bodyModel[77].addBox(-9F, -26F, -9F, 2, 13, 1, 0F); // Core53
		bodyModel[77].setRotationPoint(0F, -62F, 0F);

		bodyModel[78].addBox(-4F, -26F, 5F, 6, 3, 2, 0F); // Core54
		bodyModel[78].setRotationPoint(0F, -62F, 0F);

		bodyModel[79].addBox(-8F, -27F, -8F, 1, 1, 16, 0F); // Core55
		bodyModel[79].setRotationPoint(0F, -62F, 0F);

		bodyModel[80].addBox(-27F, -3F, -6F, 11, 2, 12, 0F); // Core56
		bodyModel[80].setRotationPoint(0F, -62F, 0F);

		bodyModel[81].addShapeBox(-6F, -21F, -9F, 19, 11, 18, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core57
		bodyModel[81].setRotationPoint(0F, -62F, 0F);

		bodyModel[82].addShapeBox(5.75F, -29.1F, -2F, 1, 1, 1, 0F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F); // Core58
		bodyModel[82].setRotationPoint(1F, -62F, 0F);

		bodyModel[83].addShapeBox(2F, -26F, 5F, 2, 3, 2, 0F, 0F, 0F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F); // Core59
		bodyModel[83].setRotationPoint(0F, -62F, 0F);

		bodyModel[84].addShapeBox(5.85F, -31.7F, 1F, 1, 1, 1, 0F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F); // Core6
		bodyModel[84].setRotationPoint(1F, -62F, 0F);

		bodyModel[85].addBox(-14F, -2F, -5F, 3, 1, 2, 0F); // Core60
		bodyModel[85].setRotationPoint(0F, -62F, 0F);

		bodyModel[86].addShapeBox(-9F, -7.5F, -5F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core61
		bodyModel[86].setRotationPoint(0F, -62F, 0F);
		bodyModel[86].rotateAngleZ = 0.52359878F;

		bodyModel[87].addShapeBox(2F, -26F, -7F, 2, 3, 2, 0F, 0F, 0F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F); // Core62
		bodyModel[87].setRotationPoint(0F, -62F, 0F);

		bodyModel[88].addShapeBox(-9F, -7.5F, 3F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core63
		bodyModel[88].setRotationPoint(0F, -62F, 0F);
		bodyModel[88].rotateAngleZ = 0.52359878F;

		bodyModel[89].addShapeBox(-2F, -29F, -2F, 4, 6, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, .5F, .5F, 0F, .5F, .5F, 0F, .5F, .5F, 0F, .5F); // Core64
		bodyModel[89].setRotationPoint(0F, -62F, 0F);

		bodyModel[90].addBox(-14F, -2F, 3F, 3, 1, 2, 0F); // Core65
		bodyModel[90].setRotationPoint(0F, -62F, 0F);

		bodyModel[91].addShapeBox(-12F, -13F, 2F, 5, 5, 7, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core66
		bodyModel[91].setRotationPoint(0F, -62F, 0F);

		bodyModel[92].addBox(-9F, -26F, 8F, 2, 13, 1, 0F); // Core67
		bodyModel[92].setRotationPoint(0F, -62F, 0F);

		bodyModel[93].addBox(-28F, -5F, 8F, 16, 4, 1, 0F); // Core68
		bodyModel[93].setRotationPoint(0F, -62F, 0F);

		bodyModel[94].addBox(-12F, -13F, 6F, 5, 3, 3, 0F); // Core69
		bodyModel[94].setRotationPoint(0F, -62F, 0F);

		bodyModel[95].addShapeBox(-6F, -17F, -15F, 10, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Core7
		bodyModel[95].setRotationPoint(0F, -62F, 0F);

		bodyModel[96].addBox(-14F, -12.5F, 6.5F, 2, 2, 2, 0F); // Core70
		bodyModel[96].setRotationPoint(0F, -62F, 0F);

		bodyModel[97].addShapeBox(-15F, -12.5F, 6.5F, 1, 2, 2, 0F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F); // Core71
		bodyModel[97].setRotationPoint(0F, -62F, 0F);

		bodyModel[98].addShapeBox(-7F, -25F, 23F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core72
		bodyModel[98].setRotationPoint(0F, -62F, 0F);
		bodyModel[98].rotateAngleX = 0.6981317F;

		bodyModel[99].addShapeBox(3F, -23F, 11F, 2, 8, 3, 0F, 0F, 0F, 0F, 0F, -1.5F, -.5F, 0F, -1.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -.5F, 0F, -1.5F, -.5F, 0F, 0F, 0F); // Core73
		bodyModel[99].setRotationPoint(0F, -62F, 0F);

		bodyModel[100].addBox(-6F, -11F, -6.5F, 12, 11, 13, 0F); // Core74
		bodyModel[100].setRotationPoint(0F, -62F, 0F);

		bodyModel[101].addBox(-27F, -17F, -6F, 2, 14, 12, 0F); // Core75
		bodyModel[101].setRotationPoint(0F, -62F, 0F);

		bodyModel[102].addShapeBox(-15F, -13.2F, 7F, 2, 1, 1, 0F, -.2F, -.3F, -.1F, 0F, -.3F, -.1F, 0F, -.3F, -.1F, -.2F, -.3F, -.1F, -.2F, -.3F, -.1F, -.2F, -.3F, -.1F, -.2F, -.3F, -.1F, -.2F, -.3F, -.1F); // Core76
		bodyModel[102].setRotationPoint(0F, -62F, 0F);

		bodyModel[103].addShapeBox(-16.9F, -12.2F, 7F, 1, 2, 1, 0F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F); // Core77
		bodyModel[103].setRotationPoint(0F, -62F, 0F);
		bodyModel[103].rotateAngleZ = -0.15707963F;

		bodyModel[104].addShapeBox(-13.9F, -14.7F, 7F, 1, 2, 1, 0F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F); // Core78
		bodyModel[104].setRotationPoint(0F, -62F, 0F);

		bodyModel[105].addShapeBox(-13.9F, -15F, 7F, 1, 1, 1, 0F, -.15F, -.4F, -.15F, -.15F, -.4F, -.15F, -.15F, -.4F, -.15F, -.15F, -.4F, -.15F, -.15F, -.4F, -.15F, -.15F, -.4F, -.15F, -.15F, -.4F, -.15F, -.15F, -.4F, -.15F); // Core79
		bodyModel[105].setRotationPoint(0F, -62F, 0F);

		bodyModel[106].addShapeBox(-3F, -25F, -25F, 2, 3, 2, 0F, 0F, -.5F, -.3F, 0F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.3F, 0F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, -.5F, 0F); // Core8
		bodyModel[106].setRotationPoint(0F, -62F, 0F);
		bodyModel[106].rotateAngleX = -0.6981317F;

		bodyModel[107].addShapeBox(-14.7F, -14.9F, 7F, 1, 1, 1, 0F, -.2F, -.4F, -.25F, 0F, -.4F, -.25F, 0F, -.4F, -.25F, -.2F, -.4F, -.25F, -.1F, -.4F, -.25F, 0F, -.4F, -.25F, 0F, -.4F, -.25F, -.1F, -.4F, -.25F); // Core80
		bodyModel[107].setRotationPoint(0F, -62F, 0F);

		bodyModel[108].addBox(-28F, -27F, 8F, 21, 1, 1, 0F); // Core81
		bodyModel[108].setRotationPoint(0F, -62F, 0F);

		bodyModel[109].addBox(-20F, -24F, -9.5F, 10, 8, 2, 0F); // Core82
		bodyModel[109].setRotationPoint(0F, -62F, 0F);

		bodyModel[110].addShapeBox(-5F, -25F, 23F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.3F, 0F, 0F, 0F); // Core83
		bodyModel[110].setRotationPoint(0F, -62F, 0F);
		bodyModel[110].rotateAngleX = 0.6981317F;

		bodyModel[111].addShapeBox(5F, -21.5F, 11.5F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, -.5F, -.8F, 0F, -.5F, -.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, 0F); // Core84
		bodyModel[111].setRotationPoint(0F, -62F, 0F);

		bodyModel[112].addShapeBox(-1F, -10F, -7.5F, 8, 6, 15, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core85
		bodyModel[112].setRotationPoint(0F, -62F, 0F);

		bodyModel[113].addBox(-27F, -24F, -4.5F, 2, 7, 9, 0F); // Core86
		bodyModel[113].setRotationPoint(0F, -62F, 0F);

		bodyModel[114].addShapeBox(-10F, -15F, -8F, 3, 2, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core87
		bodyModel[114].setRotationPoint(0F, -62F, 0F);

		bodyModel[115].addShapeBox(-10F, -15F, 7F, 3, 2, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core88
		bodyModel[115].setRotationPoint(0F, -62F, 0F);

		bodyModel[116].addBox(-27F, -27F, 9F, 20, 26, 1, 0F); // Core89
		bodyModel[116].setRotationPoint(0F, -62F, 0F);

		bodyModel[117].addBox(-23F, -27F, -3.5F, 5, 1, 6, 0F); // Core9
		bodyModel[117].setRotationPoint(0F, -62F, 0F);

		bodyModel[118].addBox(-20F, -24F, 7.5F, 10, 8, 2, 0F); // Core90
		bodyModel[118].setRotationPoint(0F, -62F, 0F);

		bodyModel[119].addShapeBox(-19F, -31F, -10F, 7, 4, 20, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core91
		bodyModel[119].setRotationPoint(0F, -62F, 0F);

		bodyModel[120].addShapeBox(-12F, -29F, -10F, 6, 2, 20, 0F, 0F, 0F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core92
		bodyModel[120].setRotationPoint(0F, -62F, 0F);

		bodyModel[121].addShapeBox(-36F, -31F, -10F, 17, 4, 20, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core93
		bodyModel[121].setRotationPoint(0F, -62F, 0F);

		bodyModel[122].addShapeBox(-15F, -23F, 10.5F, 11, 8, 3, 0F, 0F, -1.5F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Core94
		bodyModel[122].setRotationPoint(0F, -62F, 0F);

		bodyModel[123].addShapeBox(-17F, -21.5F, 10.5F, 2, 5, 3, 0F, 0F, -1.5F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Core95
		bodyModel[123].setRotationPoint(0F, -62F, 0F);

		bodyModel[124].addShapeBox(5F, -18.5F, 11.5F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.8F, 0F, -.5F, -.8F, 0F, 0F, 0F); // Core96
		bodyModel[124].setRotationPoint(0F, -62F, 0F);

		bodyModel[125].addShapeBox(-31F, -6F, -10F, 4, 6, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Core97
		bodyModel[125].setRotationPoint(0F, -62F, 0F);

		bodyModel[126].addShapeBox(-3F, -25F, 23F, 2, 3, 2, 0F, 0F, -.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1F, 0F, -.5F, -.3F, 0F, -.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1F, 0F, -.5F, -.3F); // Core98
		bodyModel[126].setRotationPoint(0F, -62F, 0F);
		bodyModel[126].rotateAngleX = 0.6981317F;

		bodyModel[127].addShapeBox(-1F, -4F, -7.5F, 8, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.8F, -.5F, 0F, -.8F, -.5F, 0F, -.8F, -.5F, 0F, -.8F); // Core99
		bodyModel[127].setRotationPoint(0F, -62F, 0F);

		bodyModel[128].addBox(-12F, -8F, 8F, 5, 7, 1, 0F); // Core130
		bodyModel[128].setRotationPoint(0F, -62F, 0F);


		hipsModel = new ModelRendererTurbo[6];
		hipsModel[0] = new ModelRendererTurbo(this, 23, 263, textureX, textureY); // Hip1
		hipsModel[1] = new ModelRendererTurbo(this, 23, 263, textureX, textureY); // Hip2
		hipsModel[2] = new ModelRendererTurbo(this, 23, 263, textureX, textureY); // Hip3
		hipsModel[3] = new ModelRendererTurbo(this, 23, 263, textureX, textureY); // Hip4
		hipsModel[4] = new ModelRendererTurbo(this, 23, 263, textureX, textureY); // Hip5
		hipsModel[5] = new ModelRendererTurbo(this, 79, 263, textureX, textureY); // Hip6

		hipsModel[0].addShapeBox(-6.5F, 0F, -4F, 13, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1.5F, 0F, 0F); // Hip1
		hipsModel[0].setRotationPoint(0F, -62F, 0F);

		hipsModel[1].addShapeBox(-7.5F, 4F, -4F, 16, 5, 8, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hip2
		hipsModel[1].setRotationPoint(0F, -62F, 0F);

		hipsModel[2].addShapeBox(-7.5F, 9F, -4F, 14, 4, 8, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F); // Hip3
		hipsModel[2].setRotationPoint(0F, -62F, 0F);

		hipsModel[3].addShapeBox(-7.5F, 0F, 4F, 14, 4, 5, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -3.5F, -1.2F, 0F, -3.5F, -1.2F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, -1F, .5F, -2F, -1F, .5F); // Hip4
		hipsModel[3].setRotationPoint(0F, -62F, 0F);

		hipsModel[4].addShapeBox(-7.5F, 0F, -9F, 14, 4, 5, 0F, -3.5F, -1.2F, 0F, -3.5F, -1.2F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, .5F, -2F, -1F, .5F, 2F, 0F, 0F, 0F, 0F, 0F); // Hip5
		hipsModel[4].setRotationPoint(0F, -62F, 0F);

		hipsModel[5].addBox(-2.5F, 5.5F, -6F, 5, 5, 12, 0F); // Hip6
		hipsModel[5].setRotationPoint(0F, -62F, 0F);


		leftArmModel = new ModelRendererTurbo[41];
		leftArmModel[0] = new ModelRendererTurbo(this, 79, 263, textureX, textureY); // LeftArm1
		leftArmModel[1] = new ModelRendererTurbo(this, 31, 179, textureX, textureY); // LeftArm10
		leftArmModel[2] = new ModelRendererTurbo(this, 31, 179, textureX, textureY); // LeftArm11
		leftArmModel[3] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // LeftArm12
		leftArmModel[4] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // LeftArm13
		leftArmModel[5] = new ModelRendererTurbo(this, 121, 233, textureX, textureY); // LeftArm14
		leftArmModel[6] = new ModelRendererTurbo(this, 79, 263, textureX, textureY); // LeftArm15
		leftArmModel[7] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // LeftArm17
		leftArmModel[8] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // LeftArm18
		leftArmModel[9] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // LeftArm19
		leftArmModel[10] = new ModelRendererTurbo(this, 79, 263, textureX, textureY); // LeftArm2
		leftArmModel[11] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // LeftArm20
		leftArmModel[12] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // LeftArm21
		leftArmModel[13] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // LeftArm22
		leftArmModel[14] = new ModelRendererTurbo(this, 73, 227, textureX, textureY); // LeftArm23
		leftArmModel[15] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // LeftArm24
		leftArmModel[16] = new ModelRendererTurbo(this, 79, 263, textureX, textureY); // LeftArm25
		leftArmModel[17] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // LeftArm26
		leftArmModel[18] = new ModelRendererTurbo(this, 121, 257, textureX, textureY); // LeftArm27
		leftArmModel[19] = new ModelRendererTurbo(this, 121, 257, textureX, textureY); // LeftArm28
		leftArmModel[20] = new ModelRendererTurbo(this, 121, 257, textureX, textureY); // LeftArm29
		leftArmModel[21] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // LeftArm3
		leftArmModel[22] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // LeftArm30
		leftArmModel[23] = new ModelRendererTurbo(this, 121, 257, textureX, textureY); // LeftArm31
		leftArmModel[24] = new ModelRendererTurbo(this, 121, 257, textureX, textureY); // LeftArm32
		leftArmModel[25] = new ModelRendererTurbo(this, 121, 257, textureX, textureY); // LeftArm33
		leftArmModel[26] = new ModelRendererTurbo(this, 121, 257, textureX, textureY); // LeftArm34
		leftArmModel[27] = new ModelRendererTurbo(this, 121, 257, textureX, textureY); // LeftArm35
		leftArmModel[28] = new ModelRendererTurbo(this, 121, 257, textureX, textureY); // LeftArm36
		leftArmModel[29] = new ModelRendererTurbo(this, 121, 257, textureX, textureY); // LeftArm37
		leftArmModel[30] = new ModelRendererTurbo(this, 121, 257, textureX, textureY); // LeftArm38
		leftArmModel[31] = new ModelRendererTurbo(this, 121, 257, textureX, textureY); // LeftArm39
		leftArmModel[32] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // LeftArm4
		leftArmModel[33] = new ModelRendererTurbo(this, 79, 263, textureX, textureY); // LeftArm40
		leftArmModel[34] = new ModelRendererTurbo(this, 79, 263, textureX, textureY); // LeftArm41
		leftArmModel[35] = new ModelRendererTurbo(this, 79, 263, textureX, textureY); // LeftArm42
		leftArmModel[36] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // LeftArm5
		leftArmModel[37] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // LeftArm6
		leftArmModel[38] = new ModelRendererTurbo(this, 121, 233, textureX, textureY); // LeftArm7
		leftArmModel[39] = new ModelRendererTurbo(this, 31, 179, textureX, textureY); // LeftArm8
		leftArmModel[40] = new ModelRendererTurbo(this, 31, 179, textureX, textureY); // LeftArm9

		leftArmModel[0].addShapeBox(-2.5F, 2F, 2F, 5, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // LeftArm1
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);
		leftArmModel[0].rotateAngleZ = -0.19198622F;

		leftArmModel[1].addBox(4F, -4F, 2F, 1, 8, 8, 0F); // LeftArm10
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);
		leftArmModel[1].rotateAngleZ = -0.19198622F;

		leftArmModel[2].addShapeBox(-5F, -5F, 1F, 10, 1, 9, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftArm11
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);
		leftArmModel[2].rotateAngleZ = -0.19198622F;

		leftArmModel[3].addShapeBox(1.5F, 13F, 8F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // LeftArm12
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);
		leftArmModel[3].rotateAngleZ = -0.19198622F;

		leftArmModel[4].addShapeBox(-3.5F, 5F, 2F, 5, 5, 1, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftArm13
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);
		leftArmModel[4].rotateAngleZ = -0.19198622F;

		leftArmModel[5].addBox(-2F, 12F, 2.5F, 3, 3, 7, 0F); // LeftArm14
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);
		leftArmModel[5].rotateAngleZ = -0.19198622F;

		leftArmModel[6].addBox(-4.5F, 13F, 4F, 5, 8, 4, 0F); // LeftArm15
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);

		leftArmModel[7].addBox(-8.5F, 21F, 2F, 8, 4, 8, 0F); // LeftArm17
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);
		leftArmModel[7].rotateAngleZ = 0.10471976F;

		leftArmModel[8].addShapeBox(-8.5F, 17F, 2F, 3, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftArm18
		leftArmModel[8].setRotationPoint(0F, 0F, 0F);
		leftArmModel[8].rotateAngleZ = 0.10471976F;

		leftArmModel[9].addShapeBox(-5.5F, 17F, 8F, 5, 4, 2, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftArm19
		leftArmModel[9].setRotationPoint(0F, 0F, 0F);
		leftArmModel[9].rotateAngleZ = 0.10471976F;

		leftArmModel[10].addBox(-2.5F, 3F, 3F, 5, 2, 6, 0F); // LeftArm2
		leftArmModel[10].setRotationPoint(0F, 0F, 0F);
		leftArmModel[10].rotateAngleZ = -0.19198622F;

		leftArmModel[11].addShapeBox(-8.5F, 25F, 2F, 8, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F); // LeftArm20
		leftArmModel[11].setRotationPoint(0F, 0F, 0F);
		leftArmModel[11].rotateAngleZ = 0.10471976F;

		leftArmModel[12].addShapeBox(-5.5F, 17F, 2F, 5, 4, 2, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftArm21
		leftArmModel[12].setRotationPoint(0F, 0F, 0F);
		leftArmModel[12].rotateAngleZ = 0.10471976F;

		leftArmModel[13].addShapeBox(-7.5F, 26F, 3F, 7, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftArm22
		leftArmModel[13].setRotationPoint(0F, 0F, 0F);
		leftArmModel[13].rotateAngleZ = 0.10471976F;

		leftArmModel[14].addShapeBox(-8F, 30F, 2.5F, 8, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftArm23
		leftArmModel[14].setRotationPoint(0F, 0F, 0F);
		leftArmModel[14].rotateAngleZ = 0.10471976F;

		leftArmModel[15].addShapeBox(-9.5F, 15F, 4F, 1, 4, 4, 0F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F); // LeftArm24
		leftArmModel[15].setRotationPoint(0F, 0F, 0F);
		leftArmModel[15].rotateAngleZ = 0.10471976F;

		leftArmModel[16].addBox(-2.5F, 32F, 3.5F, 5, 2, 5, 0F); // LeftArm25
		leftArmModel[16].setRotationPoint(0F, 0F, 0F);

		leftArmModel[17].addBox(-4F, 34F, 5.5F, 8, 5, 3, 0F); // LeftArm26
		leftArmModel[17].setRotationPoint(0F, 0F, 0F);

		leftArmModel[18].addBox(-4F, 34F, 4.5F, 8, 4, 1, 0F); // LeftArm27
		leftArmModel[18].setRotationPoint(0F, 0F, 0F);

		leftArmModel[19].addBox(0F, 34F, 3.5F, 4, 3, 2, 0F); // LeftArm28
		leftArmModel[19].setRotationPoint(0F, 0F, 0F);

		leftArmModel[20].addBox(2.5F, 35F, 3F, 2, 4, 2, 0F); // LeftArm29
		leftArmModel[20].setRotationPoint(0F, 0F, 0F);

		leftArmModel[21].addBox(-3.5F, 5F, 3F, 5, 5, 6, 0F); // LeftArm3
		leftArmModel[21].setRotationPoint(0F, 0F, 0F);
		leftArmModel[21].rotateAngleZ = -0.19198622F;

		leftArmModel[22].addShapeBox(-4F, 34F, 8.5F, 8, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, -.5F, -.5F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, -.5F, -.5F, -.5F, -.5F); // LeftArm30
		leftArmModel[22].setRotationPoint(0F, 0F, 0F);

		leftArmModel[23].addBox(2F, 39F, 6F, 2, 1, 2, 0F); // LeftArm31
		leftArmModel[23].setRotationPoint(0F, 0F, 0F);

		leftArmModel[24].addBox(0F, 38F, 6F, 2, 3, 2, 0F); // LeftArm32
		leftArmModel[24].setRotationPoint(0F, 0F, 0F);

		leftArmModel[25].addBox(-2F, 37.5F, 6F, 2, 3, 2, 0F); // LeftArm33
		leftArmModel[25].setRotationPoint(0F, 0F, 0F);

		leftArmModel[26].addBox(-4F, 38.5F, 6F, 2, 1, 2, 0F); // LeftArm34
		leftArmModel[26].setRotationPoint(0F, 0F, 0F);

		leftArmModel[27].addShapeBox(0.5F, 39F, 3F, 4, 2, 2, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, -.5F, 0F); // LeftArm35
		leftArmModel[27].setRotationPoint(0F, 0F, 0F);

		leftArmModel[28].addShapeBox(2F, 40F, 4F, 2, 2, 4, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F); // LeftArm36
		leftArmModel[28].setRotationPoint(0F, 0F, 0F);

		leftArmModel[29].addShapeBox(0F, 41F, 4F, 2, 2, 4, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F); // LeftArm37
		leftArmModel[29].setRotationPoint(0F, 0F, 0F);

		leftArmModel[30].addShapeBox(-2F, 40.5F, 4F, 2, 2, 4, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F); // LeftArm38
		leftArmModel[30].setRotationPoint(0F, 0F, 0F);

		leftArmModel[31].addShapeBox(-4F, 39.5F, 4F, 2, 2, 4, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F); // LeftArm39
		leftArmModel[31].setRotationPoint(0F, 0F, 0F);

		leftArmModel[32].addShapeBox(-3.5F, 5F, 9F, 5, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // LeftArm4
		leftArmModel[32].setRotationPoint(0F, 0F, 0F);
		leftArmModel[32].rotateAngleZ = -0.19198622F;

		leftArmModel[33].addBox(-2F, -2F, 0F, 4, 4, 2, 0F); // LeftArm40
		leftArmModel[33].setRotationPoint(0F, 0F, 0F);
		leftArmModel[33].rotateAngleZ = -0.19198622F;

		leftArmModel[34].addBox(-2.5F, -2F, 2F, 5, 4, 8, 0F); // LeftArm41
		leftArmModel[34].setRotationPoint(0F, 0F, 0F);
		leftArmModel[34].rotateAngleZ = -0.19198622F;

		leftArmModel[35].addShapeBox(-2.5F, -4F, 2F, 5, 2, 8, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftArm42
		leftArmModel[35].setRotationPoint(0F, 0F, 0F);
		leftArmModel[35].rotateAngleZ = -0.19198622F;

		leftArmModel[36].addBox(1.5F, 5F, 3F, 2, 8, 6, 0F); // LeftArm5
		leftArmModel[36].setRotationPoint(0F, 0F, 0F);
		leftArmModel[36].rotateAngleZ = -0.19198622F;

		leftArmModel[37].addShapeBox(1.5F, 13F, 3F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // LeftArm6
		leftArmModel[37].setRotationPoint(0F, 0F, 0F);
		leftArmModel[37].rotateAngleZ = -0.19198622F;

		leftArmModel[38].addBox(-2.5F, 10F, 3F, 4, 6, 6, 0F); // LeftArm7
		leftArmModel[38].setRotationPoint(0F, 0F, 0F);
		leftArmModel[38].rotateAngleZ = -0.19198622F;

		leftArmModel[39].addBox(-5F, -4F, 1F, 10, 8, 1, 0F); // LeftArm8
		leftArmModel[39].setRotationPoint(0F, 0F, 0F);
		leftArmModel[39].rotateAngleZ = -0.19198622F;

		leftArmModel[40].addBox(-5F, -4F, 2F, 1, 8, 8, 0F); // LeftArm9
		leftArmModel[40].setRotationPoint(0F, 0F, 0F);
		leftArmModel[40].rotateAngleZ = -0.19198622F;


		rightArmModel = new ModelRendererTurbo[41];
		rightArmModel[0] = new ModelRendererTurbo(this, 31, 179, textureX, textureY); // RightArn1
		rightArmModel[1] = new ModelRendererTurbo(this, 121, 257, textureX, textureY); // RightArn10
		rightArmModel[2] = new ModelRendererTurbo(this, 121, 233, textureX, textureY); // RightArn11
		rightArmModel[3] = new ModelRendererTurbo(this, 121, 233, textureX, textureY); // RightArn12
		rightArmModel[4] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // RightArn13
		rightArmModel[5] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // RightArn14
		rightArmModel[6] = new ModelRendererTurbo(this, 79, 263, textureX, textureY); // RightArn15
		rightArmModel[7] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // RightArn16
		rightArmModel[8] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // RightArn17
		rightArmModel[9] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // RightArn18
		rightArmModel[10] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // RightArn19
		rightArmModel[11] = new ModelRendererTurbo(this, 31, 179, textureX, textureY); // RightArn2
		rightArmModel[12] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // RightArn20
		rightArmModel[13] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // RightArn21
		rightArmModel[14] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // RightArn22
		rightArmModel[15] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // RightArn23
		rightArmModel[16] = new ModelRendererTurbo(this, 73, 227, textureX, textureY); // RightArn24
		rightArmModel[17] = new ModelRendererTurbo(this, 79, 263, textureX, textureY); // RightArn25
		rightArmModel[18] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // RightArn26
		rightArmModel[19] = new ModelRendererTurbo(this, 121, 257, textureX, textureY); // RightArn27
		rightArmModel[20] = new ModelRendererTurbo(this, 121, 257, textureX, textureY); // RightArn28
		rightArmModel[21] = new ModelRendererTurbo(this, 121, 257, textureX, textureY); // RightArn29
		rightArmModel[22] = new ModelRendererTurbo(this, 31, 179, textureX, textureY); // RightArn3
		rightArmModel[23] = new ModelRendererTurbo(this, 121, 257, textureX, textureY); // RightArn30
		rightArmModel[24] = new ModelRendererTurbo(this, 121, 257, textureX, textureY); // RightArn31
		rightArmModel[25] = new ModelRendererTurbo(this, 121, 257, textureX, textureY); // RightArn32
		rightArmModel[26] = new ModelRendererTurbo(this, 121, 257, textureX, textureY); // RightArn33
		rightArmModel[27] = new ModelRendererTurbo(this, 121, 257, textureX, textureY); // RightArn34
		rightArmModel[28] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // RightArn35
		rightArmModel[29] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // RightArn36
		rightArmModel[30] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // RightArn37
		rightArmModel[31] = new ModelRendererTurbo(this, 121, 257, textureX, textureY); // RightArn38
		rightArmModel[32] = new ModelRendererTurbo(this, 121, 257, textureX, textureY); // RightArn39
		rightArmModel[33] = new ModelRendererTurbo(this, 31, 179, textureX, textureY); // RightArn4
		rightArmModel[34] = new ModelRendererTurbo(this, 121, 257, textureX, textureY); // RightArn41
		rightArmModel[35] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // RightArn42
		rightArmModel[36] = new ModelRendererTurbo(this, 79, 263, textureX, textureY); // RightArn5
		rightArmModel[37] = new ModelRendererTurbo(this, 79, 263, textureX, textureY); // RightArn7
		rightArmModel[38] = new ModelRendererTurbo(this, 79, 263, textureX, textureY); // RightArn7
		rightArmModel[39] = new ModelRendererTurbo(this, 79, 263, textureX, textureY); // RightArn8
		rightArmModel[40] = new ModelRendererTurbo(this, 79, 263, textureX, textureY); // RightArn9

		rightArmModel[0].addBox(4F, -4F, -11F, 1, 8, 8, 0F); // RightArn1
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);
		rightArmModel[0].rotateAngleZ = -0.19198622F;

		rightArmModel[1].addShapeBox(-2F, 40.5F, -8F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, -.5F, 0F); // RightArn10
		rightArmModel[1].setRotationPoint(0F, 0F, -1F);

		rightArmModel[2].addBox(-2.5F, 10F, -9F, 4, 6, 6, 0F); // RightArn11
		rightArmModel[2].setRotationPoint(0F, 0F, -1F);
		rightArmModel[2].rotateAngleZ = -0.19198622F;

		rightArmModel[3].addBox(-2F, 12F, -9.5F, 3, 3, 7, 0F); // RightArn12
		rightArmModel[3].setRotationPoint(0F, 0F, -1F);
		rightArmModel[3].rotateAngleZ = -0.19198622F;

		rightArmModel[4].addShapeBox(1.5F, 13F, -4F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // RightArn13
		rightArmModel[4].setRotationPoint(0F, 0F, -1F);
		rightArmModel[4].rotateAngleZ = -0.19198622F;

		rightArmModel[5].addBox(1.5F, 5F, -9F, 2, 8, 6, 0F); // RightArn14
		rightArmModel[5].setRotationPoint(0F, 0F, -1F);
		rightArmModel[5].rotateAngleZ = -0.19198622F;

		rightArmModel[6].addBox(-4.5F, 13F, -8F, 5, 8, 4, 0F); // RightArn15
		rightArmModel[6].setRotationPoint(0F, 0F, -1F);

		rightArmModel[7].addShapeBox(-3.5F, 5F, -10F, 5, 5, 1, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArn16
		rightArmModel[7].setRotationPoint(0F, 0F, -1F);
		rightArmModel[7].rotateAngleZ = -0.19198622F;

		rightArmModel[8].addShapeBox(-5.5F, 17F, -4F, 5, 4, 2, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArn17
		rightArmModel[8].setRotationPoint(0F, 0F, -1F);
		rightArmModel[8].rotateAngleZ = 0.10471976F;

		rightArmModel[9].addShapeBox(-8.5F, 17F, -10F, 3, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArn18
		rightArmModel[9].setRotationPoint(0F, 0F, -1F);
		rightArmModel[9].rotateAngleZ = 0.10471976F;

		rightArmModel[10].addShapeBox(-9.5F, 15F, -8F, 1, 4, 4, 0F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F); // RightArn19
		rightArmModel[10].setRotationPoint(0F, 0F, -1F);
		rightArmModel[10].rotateAngleZ = 0.10471976F;

		rightArmModel[11].addShapeBox(-5F, -5F, -11F, 10, 1, 9, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArn2
		rightArmModel[11].setRotationPoint(0F, 0F, 0F);
		rightArmModel[11].rotateAngleZ = -0.19198622F;

		rightArmModel[12].addShapeBox(-5.5F, 17F, -10F, 5, 4, 2, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArn20
		rightArmModel[12].setRotationPoint(0F, 0F, -1F);
		rightArmModel[12].rotateAngleZ = 0.10471976F;

		rightArmModel[13].addBox(-8.5F, 21F, -10F, 8, 4, 8, 0F); // RightArn21
		rightArmModel[13].setRotationPoint(0F, 0F, -1F);
		rightArmModel[13].rotateAngleZ = 0.10471976F;

		rightArmModel[14].addShapeBox(-7.5F, 26F, -9F, 7, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArn22
		rightArmModel[14].setRotationPoint(0F, 0F, -1F);
		rightArmModel[14].rotateAngleZ = 0.10471976F;

		rightArmModel[15].addShapeBox(-8.5F, 25F, -10F, 8, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F); // RightArn23
		rightArmModel[15].setRotationPoint(0F, 0F, -1F);
		rightArmModel[15].rotateAngleZ = 0.10471976F;

		rightArmModel[16].addShapeBox(-8F, 30F, -9.5F, 8, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArn24
		rightArmModel[16].setRotationPoint(0F, 0F, -1F);
		rightArmModel[16].rotateAngleZ = 0.10471976F;

		rightArmModel[17].addBox(-2.5F, 32F, -8.5F, 5, 2, 5, 0F); // RightArn25
		rightArmModel[17].setRotationPoint(0F, 0F, -1F);

		rightArmModel[18].addBox(-4F, 34F, -8.5F, 8, 5, 3, 0F); // RightArn26
		rightArmModel[18].setRotationPoint(0F, 0F, -1F);

		rightArmModel[19].addBox(-4F, 34F, -5.5F, 8, 4, 1, 0F); // RightArn27
		rightArmModel[19].setRotationPoint(0F, 0F, -1F);

		rightArmModel[20].addBox(0F, 34F, -5.5F, 4, 3, 2, 0F); // RightArn28
		rightArmModel[20].setRotationPoint(0F, 0F, -1F);

		rightArmModel[21].addBox(2.5F, 35F, -5F, 2, 4, 2, 0F); // RightArn29
		rightArmModel[21].setRotationPoint(0F, 0F, -1F);

		rightArmModel[22].addBox(-5F, -4F, -11F, 1, 8, 8, 0F); // RightArn3
		rightArmModel[22].setRotationPoint(0F, 0F, 0F);
		rightArmModel[22].rotateAngleZ = -0.19198622F;

		rightArmModel[23].addShapeBox(0.5F, 39F, -5F, 4, 2, 2, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, -.5F, 0F); // RightArn30
		rightArmModel[23].setRotationPoint(0F, 0F, -1F);

		rightArmModel[24].addBox(2F, 39F, -8F, 2, 1, 2, 0F); // RightArn31
		rightArmModel[24].setRotationPoint(0F, 0F, -1F);

		rightArmModel[25].addBox(0F, 38F, -8F, 2, 3, 2, 0F); // RightArn32
		rightArmModel[25].setRotationPoint(0F, 0F, -1F);

		rightArmModel[26].addBox(-2F, 37.5F, -8F, 2, 3, 2, 0F); // RightArn33
		rightArmModel[26].setRotationPoint(0F, 0F, -1F);

		rightArmModel[27].addBox(-4F, 38.5F, -8F, 2, 1, 2, 0F); // RightArn34
		rightArmModel[27].setRotationPoint(0F, 0F, -1F);

		rightArmModel[28].addShapeBox(1.5F, 13F, -9F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // RightArn35
		rightArmModel[28].setRotationPoint(0F, 0F, -1F);
		rightArmModel[28].rotateAngleZ = -0.19198622F;

		rightArmModel[29].addBox(-3.5F, 5F, -9F, 5, 5, 6, 0F); // RightArn36
		rightArmModel[29].setRotationPoint(0F, 0F, -1F);
		rightArmModel[29].rotateAngleZ = -0.19198622F;

		rightArmModel[30].addShapeBox(-4F, 34F, -9.5F, 8, 5, 1, 0F, -.5F, -.5F, -.5F, -.5F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, -.5F, -.5F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArn37
		rightArmModel[30].setRotationPoint(0F, 0F, -1F);

		rightArmModel[31].addShapeBox(2F, 40F, -8F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, -.5F, 0F); // RightArn38
		rightArmModel[31].setRotationPoint(0F, 0F, -1F);

		rightArmModel[32].addShapeBox(0F, 41F, -8F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, -.5F, 0F); // RightArn39
		rightArmModel[32].setRotationPoint(0F, 0F, -1F);

		rightArmModel[33].addBox(-5F, -4F, -2F, 10, 8, 1, 0F); // RightArn4
		rightArmModel[33].setRotationPoint(0F, 0F, -1F);
		rightArmModel[33].rotateAngleZ = -0.19198622F;

		rightArmModel[34].addShapeBox(-4F, 39.5F, -8F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, -.5F, 0F); // RightArn41
		rightArmModel[34].setRotationPoint(0F, 0F, -1F);

		rightArmModel[35].addShapeBox(-3.5F, 5F, -3F, 5, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // RightArn42
		rightArmModel[35].setRotationPoint(0F, 0F, -1F);
		rightArmModel[35].rotateAngleZ = -0.19198622F;

		rightArmModel[36].addBox(-2F, -2F, -2F, 4, 4, 2, 0F); // RightArn5
		rightArmModel[36].setRotationPoint(0F, 0F, -1F);
		rightArmModel[36].rotateAngleZ = -0.19198622F;

		rightArmModel[37].addShapeBox(-2.5F, -4F, -10F, 5, 2, 8, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArn7
		rightArmModel[37].setRotationPoint(0F, 0F, -1F);
		rightArmModel[37].rotateAngleZ = -0.19198622F;

		rightArmModel[38].addBox(-2.5F, -2F, -10F, 5, 4, 8, 0F); // RightArn7
		rightArmModel[38].setRotationPoint(0F, 0F, -1F);
		rightArmModel[38].rotateAngleZ = -0.19198622F;

		rightArmModel[39].addShapeBox(-2.5F, 2F, -10F, 5, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // RightArn8
		rightArmModel[39].setRotationPoint(0F, 0F, -1F);
		rightArmModel[39].rotateAngleZ = -0.19198622F;

		rightArmModel[40].addBox(-2.5F, 3F, -9F, 5, 2, 6, 0F); // RightArn9
		rightArmModel[40].setRotationPoint(0F, 0F, -1F);
		rightArmModel[40].rotateAngleZ = -0.19198622F;


		leftLegModel = new ModelRendererTurbo[36];
		leftLegModel[0] = new ModelRendererTurbo(this, 17, 179, textureX, textureY); // LeftLeg1
		leftLegModel[1] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // LeftLeg10
		leftLegModel[2] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // LeftLeg12
		leftLegModel[3] = new ModelRendererTurbo(this, 79, 263, textureX, textureY); // LeftLeg13
		leftLegModel[4] = new ModelRendererTurbo(this, 79, 263, textureX, textureY); // LeftLeg14
		leftLegModel[5] = new ModelRendererTurbo(this, 79, 263, textureX, textureY); // LeftLeg15
		leftLegModel[6] = new ModelRendererTurbo(this, 79, 263, textureX, textureY); // LeftLeg16
		leftLegModel[7] = new ModelRendererTurbo(this, 79, 263, textureX, textureY); // LeftLeg17
		leftLegModel[8] = new ModelRendererTurbo(this, 79, 263, textureX, textureY); // LeftLeg18
		leftLegModel[9] = new ModelRendererTurbo(this, 23, 263, textureX, textureY); // LeftLeg19
		leftLegModel[10] = new ModelRendererTurbo(this, 17, 179, textureX, textureY); // LeftLeg2
		leftLegModel[11] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // LeftLeg20
		leftLegModel[12] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // LeftLeg21
		leftLegModel[13] = new ModelRendererTurbo(this, 23, 263, textureX, textureY); // LeftLeg23
		leftLegModel[14] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // LeftLeg24
		leftLegModel[15] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // LeftLeg25
		leftLegModel[16] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // LeftLeg26
		leftLegModel[17] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // LeftLeg27
		leftLegModel[18] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // LeftLeg28
		leftLegModel[19] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // LeftLeg29
		leftLegModel[20] = new ModelRendererTurbo(this, 23, 263, textureX, textureY); // LeftLeg30
		leftLegModel[21] = new ModelRendererTurbo(this, 23, 263, textureX, textureY); // LeftLeg31
		leftLegModel[22] = new ModelRendererTurbo(this, 23, 263, textureX, textureY); // LeftLeg33
		leftLegModel[23] = new ModelRendererTurbo(this, 23, 263, textureX, textureY); // LeftLeg34
		leftLegModel[24] = new ModelRendererTurbo(this, 23, 263, textureX, textureY); // LeftLeg35
		leftLegModel[25] = new ModelRendererTurbo(this, 23, 263, textureX, textureY); // LeftLeg36
		leftLegModel[26] = new ModelRendererTurbo(this, 79, 263, textureX, textureY); // LeftLeg4
		leftLegModel[27] = new ModelRendererTurbo(this, 17, 179, textureX, textureY); // LeftLeg43
		leftLegModel[28] = new ModelRendererTurbo(this, 17, 179, textureX, textureY); // LeftLeg47
		leftLegModel[29] = new ModelRendererTurbo(this, 23, 263, textureX, textureY); // LeftLeg48
		leftLegModel[30] = new ModelRendererTurbo(this, 79, 263, textureX, textureY); // LeftLeg5
		leftLegModel[31] = new ModelRendererTurbo(this, 79, 263, textureX, textureY); // LeftLeg54
		leftLegModel[32] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // LeftLeg6
		leftLegModel[33] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // LeftLeg7
		leftLegModel[34] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // LeftLeg8
		leftLegModel[35] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // LeftLeg9

		leftLegModel[0].addBox(6F, 40F, -3F, 5, 6, 14, 0F); // LeftLeg1
		leftLegModel[0].setRotationPoint(0F, -54F, 6F);
		leftLegModel[0].rotateAngleZ = -0.34906585F;

		leftLegModel[1].addShapeBox(-5.5F, -5F, -0.5F, 3, 3, 9, 0F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // LeftLeg10
		leftLegModel[1].setRotationPoint(0F, -54F, 6F);
		leftLegModel[1].rotateAngleZ = 0.26179939F;

		leftLegModel[2].addShapeBox(-5.5F, -2F, -0.5F, 3, 15, 9, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // LeftLeg12
		leftLegModel[2].setRotationPoint(0F, -54F, 6F);
		leftLegModel[2].rotateAngleZ = 0.26179939F;

		leftLegModel[3].addBox(-4.5F, 13F, 6F, 7, 4, 2, 0F); // LeftLeg13
		leftLegModel[3].setRotationPoint(0F, -54F, 6F);
		leftLegModel[3].rotateAngleZ = 0.26179939F;

		leftLegModel[4].addShapeBox(-4.5F, 17F, 6F, 7, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // LeftLeg14
		leftLegModel[4].setRotationPoint(0F, -54F, 6F);
		leftLegModel[4].rotateAngleZ = 0.26179939F;

		leftLegModel[5].addBox(6F, 13F, -0.5F, 2, 2, 9, 0F); // LeftLeg15
		leftLegModel[5].setRotationPoint(0F, -54F, 6F);
		leftLegModel[5].rotateAngleZ = -0.26179939F;

		leftLegModel[6].addBox(-4.5F, 13F, 0F, 7, 4, 2, 0F); // LeftLeg16
		leftLegModel[6].setRotationPoint(0F, -54F, 6F);
		leftLegModel[6].rotateAngleZ = 0.26179939F;

		leftLegModel[7].addShapeBox(-4.5F, 17F, 0F, 7, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // LeftLeg17
		leftLegModel[7].setRotationPoint(0F, -54F, 6F);
		leftLegModel[7].rotateAngleZ = 0.26179939F;

		leftLegModel[8].addBox(5F, 12F, 2F, 6, 5, 4, 0F); // LeftLeg18
		leftLegModel[8].setRotationPoint(0F, -54F, 6F);
		leftLegModel[8].rotateAngleZ = -0.34906585F;

		leftLegModel[9].addBox(4F, 17F, -1F, 7, 12, 10, 0F); // LeftLeg19
		leftLegModel[9].setRotationPoint(0F, -54F, 6F);
		leftLegModel[9].rotateAngleZ = -0.34906585F;

		leftLegModel[10].addShapeBox(11F, 40F, -3F, 6, 6, 14, 0F, 0F, 0F, 0F, -1F, 0F, -4F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, 0F); // LeftLeg2
		leftLegModel[10].setRotationPoint(0F, -54F, 6F);
		leftLegModel[10].rotateAngleZ = -0.34906585F;

		leftLegModel[11].addShapeBox(2F, 17F, -1F, 2, 11, 10, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg20
		leftLegModel[11].setRotationPoint(0F, -54F, 6F);
		leftLegModel[11].rotateAngleZ = -0.34906585F;

		leftLegModel[12].addShapeBox(2F, 28F, -1F, 4, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // LeftLeg21
		leftLegModel[12].setRotationPoint(0F, -54F, 6F);
		leftLegModel[12].rotateAngleZ = -0.34906585F;

		leftLegModel[13].addBox(5F, 29F, -1F, 6, 15, 10, 0F); // LeftLeg23
		leftLegModel[13].setRotationPoint(0F, -54F, 6F);
		leftLegModel[13].rotateAngleZ = -0.34906585F;

		leftLegModel[14].addShapeBox(2F, 17F, 9F, 2, 11, 2, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // LeftLeg24
		leftLegModel[14].setRotationPoint(0F, -54F, 6F);
		leftLegModel[14].rotateAngleZ = -0.34906585F;

		leftLegModel[15].addShapeBox(4F, 17F, 9F, 8, 11, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // LeftLeg25
		leftLegModel[15].setRotationPoint(0F, -54F, 6F);
		leftLegModel[15].rotateAngleZ = -0.34906585F;

		leftLegModel[16].addShapeBox(2F, 28F, 9F, 10, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -3.5F, -1.5F, 0F, -4.5F, -1.5F, 0F); // LeftLeg26
		leftLegModel[16].setRotationPoint(0F, -54F, 6F);
		leftLegModel[16].rotateAngleZ = -0.34906585F;

		leftLegModel[17].addShapeBox(2F, 28F, -3F, 10, 4, 2, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -1.5F, 0F, -3.5F, -1.5F, 0F, -2F, 0F, 0F, -3F, 0F, 0F); // LeftLeg27
		leftLegModel[17].setRotationPoint(0F, -54F, 6F);
		leftLegModel[17].rotateAngleZ = -0.34906585F;

		leftLegModel[18].addShapeBox(4F, 17F, -3F, 8, 11, 2, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg28
		leftLegModel[18].setRotationPoint(0F, -54F, 6F);
		leftLegModel[18].rotateAngleZ = -0.34906585F;

		leftLegModel[19].addShapeBox(2F, 17F, -3F, 2, 11, 2, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg29
		leftLegModel[19].setRotationPoint(0F, -54F, 6F);
		leftLegModel[19].rotateAngleZ = -0.34906585F;

		leftLegModel[20].addBox(11F, 17F, -1F, 2, 12, 10, 0F); // LeftLeg30
		leftLegModel[20].setRotationPoint(0F, -54F, 6F);
		leftLegModel[20].rotateAngleZ = -0.34906585F;

		leftLegModel[21].addShapeBox(13F, 17F, -1F, 3, 12, 10, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // LeftLeg31
		leftLegModel[21].setRotationPoint(0F, -54F, 6F);
		leftLegModel[21].rotateAngleZ = -0.34906585F;

		leftLegModel[22].addShapeBox(11F, 32F, -1F, 2, 12, 10, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -2F, 2F, 0F, -2F, 0F, 0F, 0F); // LeftLeg33
		leftLegModel[22].setRotationPoint(0F, -54F, 6F);
		leftLegModel[22].rotateAngleZ = -0.34906585F;

		leftLegModel[23].addShapeBox(11F, 29F, -1F, 2, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // LeftLeg34
		leftLegModel[23].setRotationPoint(0F, -54F, 6F);
		leftLegModel[23].rotateAngleZ = -0.34906585F;

		leftLegModel[24].addShapeBox(13F, 29F, -1F, 3, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 0F, -2F); // LeftLeg35
		leftLegModel[24].setRotationPoint(0F, -54F, 6F);
		leftLegModel[24].rotateAngleZ = -0.34906585F;

		leftLegModel[25].addShapeBox(13F, 13F, -1F, 3, 4, 10, 0F, -1F, 0F, -2.5F, 0F, -3F, -2.5F, 0F, -3F, -2.5F, -1F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // LeftLeg36
		leftLegModel[25].setRotationPoint(0F, -54F, 6F);
		leftLegModel[25].rotateAngleZ = -0.34906585F;

		leftLegModel[26].addShapeBox(-2.5F, -4F, 0F, 5, 2, 8, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg4
		leftLegModel[26].setRotationPoint(0F, -54F, 6F);
		leftLegModel[26].rotateAngleZ = 0.26179939F;

		leftLegModel[27].addShapeBox(3F, 32F, -3F, 3, 8, 14, 0F, -1.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -1.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg43
		leftLegModel[27].setRotationPoint(0F, -54F, 6F);
		leftLegModel[27].rotateAngleZ = -0.34906585F;

		leftLegModel[28].addShapeBox(3F, 40F, -3F, 3, 5, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // LeftLeg47
		leftLegModel[28].setRotationPoint(0F, -54F, 6F);
		leftLegModel[28].rotateAngleZ = -0.34906585F;

		leftLegModel[29].addShapeBox(2F, 33F, -2F, 4, 12, 12, 0F, -1.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -1.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg48
		leftLegModel[29].setRotationPoint(0F, -54F, 6F);
		leftLegModel[29].rotateAngleZ = -0.34906585F;

		leftLegModel[30].addShapeBox(-2.5F, 2F, 0F, 5, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // LeftLeg5
		leftLegModel[30].setRotationPoint(0F, -54F, 6F);
		leftLegModel[30].rotateAngleZ = 0.26179939F;

		leftLegModel[31].addBox(-2.5F, -2F, 0F, 5, 4, 8, 0F); // LeftLeg54
		leftLegModel[31].setRotationPoint(0F, -54F, 6F);
		leftLegModel[31].rotateAngleZ = 0.26179939F;

		leftLegModel[32].addShapeBox(2.5F, -2F, -0.5F, 3, 15, 9, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // LeftLeg6
		leftLegModel[32].setRotationPoint(0F, -54F, 6F);
		leftLegModel[32].rotateAngleZ = 0.26179939F;

		leftLegModel[33].addShapeBox(2.5F, -5F, -0.5F, 3, 3, 9, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // LeftLeg7
		leftLegModel[33].setRotationPoint(0F, -54F, 6F);
		leftLegModel[33].rotateAngleZ = 0.26179939F;

		leftLegModel[34].addShapeBox(2.5F, 13F, -0.5F, 3, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F); // LeftLeg8
		leftLegModel[34].setRotationPoint(0F, -54F, 6F);
		leftLegModel[34].rotateAngleZ = 0.26179939F;

		leftLegModel[35].addBox(-2.5F, 4F, -0.5F, 5, 9, 9, 0F); // LeftLeg9
		leftLegModel[35].setRotationPoint(0F, -54F, 6F);
		leftLegModel[35].rotateAngleZ = 0.26179939F;


		rightLegModel = new ModelRendererTurbo[36];
		rightLegModel[0] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // RightLeg1
		rightLegModel[1] = new ModelRendererTurbo(this, 23, 263, textureX, textureY); // RightLeg10
		rightLegModel[2] = new ModelRendererTurbo(this, 17, 179, textureX, textureY); // RightLeg11
		rightLegModel[3] = new ModelRendererTurbo(this, 17, 179, textureX, textureY); // RightLeg12
		rightLegModel[4] = new ModelRendererTurbo(this, 17, 179, textureX, textureY); // RightLeg13
		rightLegModel[5] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // RightLeg2
		rightLegModel[6] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // RightLeg3
		rightLegModel[7] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // RightLeg32
		rightLegModel[8] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // RightLeg33
		rightLegModel[9] = new ModelRendererTurbo(this, 79, 263, textureX, textureY); // RightLeg34
		rightLegModel[10] = new ModelRendererTurbo(this, 79, 263, textureX, textureY); // RightLeg35
		rightLegModel[11] = new ModelRendererTurbo(this, 79, 263, textureX, textureY); // RightLeg36
		rightLegModel[12] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // RightLeg37
		rightLegModel[13] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // RightLeg38
		rightLegModel[14] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // RightLeg39
		rightLegModel[15] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // RightLeg4
		rightLegModel[16] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // RightLeg40
		rightLegModel[17] = new ModelRendererTurbo(this, 79, 263, textureX, textureY); // RightLeg41
		rightLegModel[18] = new ModelRendererTurbo(this, 79, 263, textureX, textureY); // RightLeg42
		rightLegModel[19] = new ModelRendererTurbo(this, 79, 263, textureX, textureY); // RightLeg43
		rightLegModel[20] = new ModelRendererTurbo(this, 79, 263, textureX, textureY); // RightLeg44
		rightLegModel[21] = new ModelRendererTurbo(this, 79, 263, textureX, textureY); // RightLeg45
		rightLegModel[22] = new ModelRendererTurbo(this, 79, 263, textureX, textureY); // RightLeg46
		rightLegModel[23] = new ModelRendererTurbo(this, 23, 263, textureX, textureY); // RightLeg47
		rightLegModel[24] = new ModelRendererTurbo(this, 23, 263, textureX, textureY); // RightLeg48
		rightLegModel[25] = new ModelRendererTurbo(this, 23, 263, textureX, textureY); // RightLeg49
		rightLegModel[26] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // RightLeg5
		rightLegModel[27] = new ModelRendererTurbo(this, 23, 263, textureX, textureY); // RightLeg50
		rightLegModel[28] = new ModelRendererTurbo(this, 23, 263, textureX, textureY); // RightLeg51
		rightLegModel[29] = new ModelRendererTurbo(this, 23, 263, textureX, textureY); // RightLeg52
		rightLegModel[30] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // RightLeg53
		rightLegModel[31] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // RightLeg54
		rightLegModel[32] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // RightLeg6
		rightLegModel[33] = new ModelRendererTurbo(this, 23, 263, textureX, textureY); // RightLeg7
		rightLegModel[34] = new ModelRendererTurbo(this, 23, 263, textureX, textureY); // RightLeg8
		rightLegModel[35] = new ModelRendererTurbo(this, 17, 179, textureX, textureY); // RightLeg9

		rightLegModel[0].addShapeBox(2F, 17F, -9F, 2, 11, 10, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg1
		rightLegModel[0].setRotationPoint(0F, -54F, -6F);
		rightLegModel[0].rotateAngleZ = -0.34906585F;

		rightLegModel[1].addShapeBox(2F, 33F, -10F, 4, 12, 12, 0F, -1.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -1.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg10
		rightLegModel[1].setRotationPoint(0F, -54F, -6F);
		rightLegModel[1].rotateAngleZ = -0.34906585F;

		rightLegModel[2].addShapeBox(3F, 40F, -11F, 3, 5, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // RightLeg11
		rightLegModel[2].setRotationPoint(0F, -54F, -6F);
		rightLegModel[2].rotateAngleZ = -0.34906585F;

		rightLegModel[3].addBox(6F, 40F, -11F, 5, 6, 14, 0F); // RightLeg12
		rightLegModel[3].setRotationPoint(0F, -54F, -6F);
		rightLegModel[3].rotateAngleZ = -0.34906585F;

		rightLegModel[4].addShapeBox(11F, 40F, -11F, 6, 6, 14, 0F, 0F, 0F, 0F, -1F, 0F, -4F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, 0F); // RightLeg13
		rightLegModel[4].setRotationPoint(0F, -54F, -6F);
		rightLegModel[4].rotateAngleZ = -0.34906585F;

		rightLegModel[5].addShapeBox(2F, 17F, -11F, 2, 11, 2, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg2
		rightLegModel[5].setRotationPoint(0F, -54F, -6F);
		rightLegModel[5].rotateAngleZ = -0.34906585F;

		rightLegModel[6].addShapeBox(2F, 28F, -9F, 4, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // RightLeg3
		rightLegModel[6].setRotationPoint(0F, -54F, -6F);
		rightLegModel[6].rotateAngleZ = -0.34906585F;

		rightLegModel[7].addShapeBox(-5.5F, -2F, -8.5F, 3, 15, 9, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // RightLeg32
		rightLegModel[7].setRotationPoint(0F, -54F, -6F);
		rightLegModel[7].rotateAngleZ = 0.26179939F;

		rightLegModel[8].addShapeBox(-5.5F, -5F, -8.5F, 3, 3, 9, 0F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // RightLeg33
		rightLegModel[8].setRotationPoint(0F, -54F, -6F);
		rightLegModel[8].rotateAngleZ = 0.26179939F;

		rightLegModel[9].addShapeBox(-2.5F, -4F, -8F, 5, 2, 8, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg34
		rightLegModel[9].setRotationPoint(0F, -54F, -6F);
		rightLegModel[9].rotateAngleZ = 0.26179939F;

		rightLegModel[10].addBox(-2.5F, -2F, -8F, 5, 4, 8, 0F); // RightLeg35
		rightLegModel[10].setRotationPoint(0F, -54F, -6F);
		rightLegModel[10].rotateAngleZ = 0.26179939F;

		rightLegModel[11].addShapeBox(-2.5F, 2F, -8F, 5, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // RightLeg36
		rightLegModel[11].setRotationPoint(0F, -54F, -6F);
		rightLegModel[11].rotateAngleZ = 0.26179939F;

		rightLegModel[12].addShapeBox(2.5F, -5F, -8.5F, 3, 3, 9, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // RightLeg37
		rightLegModel[12].setRotationPoint(0F, -54F, -6F);
		rightLegModel[12].rotateAngleZ = 0.26179939F;

		rightLegModel[13].addShapeBox(2.5F, -2F, -8.5F, 3, 15, 9, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // RightLeg38
		rightLegModel[13].setRotationPoint(0F, -54F, -6F);
		rightLegModel[13].rotateAngleZ = 0.26179939F;

		rightLegModel[14].addShapeBox(2.5F, 13F, -8.5F, 3, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F); // RightLeg39
		rightLegModel[14].setRotationPoint(0F, -54F, -6F);
		rightLegModel[14].rotateAngleZ = 0.26179939F;

		rightLegModel[15].addShapeBox(2F, 28F, 1F, 10, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -3.5F, -1.5F, 0F, -4.5F, -1.5F, 0F); // RightLeg4
		rightLegModel[15].setRotationPoint(0F, -54F, -6F);
		rightLegModel[15].rotateAngleZ = -0.34906585F;

		rightLegModel[16].addBox(-2.5F, 4F, -8.5F, 5, 9, 9, 0F); // RightLeg40
		rightLegModel[16].setRotationPoint(0F, -54F, -6F);
		rightLegModel[16].rotateAngleZ = 0.26179939F;

		rightLegModel[17].addBox(-4.5F, 13F, -2F, 7, 4, 2, 0F); // RightLeg41
		rightLegModel[17].setRotationPoint(0F, -54F, -6F);
		rightLegModel[17].rotateAngleZ = 0.26179939F;

		rightLegModel[18].addBox(6F, 13F, -8.5F, 2, 2, 9, 0F); // RightLeg42
		rightLegModel[18].setRotationPoint(0F, -54F, -6F);
		rightLegModel[18].rotateAngleZ = -0.26179939F;

		rightLegModel[19].addShapeBox(-4.5F, 17F, -2F, 7, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // RightLeg43
		rightLegModel[19].setRotationPoint(0F, -54F, -6F);
		rightLegModel[19].rotateAngleZ = 0.26179939F;

		rightLegModel[20].addBox(5F, 12F, -6F, 6, 5, 4, 0F); // RightLeg44
		rightLegModel[20].setRotationPoint(0F, -54F, -6F);
		rightLegModel[20].rotateAngleZ = -0.34906585F;

		rightLegModel[21].addBox(-4.5F, 13F, -8F, 7, 4, 2, 0F); // RightLeg45
		rightLegModel[21].setRotationPoint(0F, -54F, -6F);
		rightLegModel[21].rotateAngleZ = 0.26179939F;

		rightLegModel[22].addShapeBox(-4.5F, 17F, -8F, 7, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // RightLeg46
		rightLegModel[22].setRotationPoint(0F, -54F, -6F);
		rightLegModel[22].rotateAngleZ = 0.26179939F;

		rightLegModel[23].addBox(11F, 17F, -9F, 2, 12, 10, 0F); // RightLeg47
		rightLegModel[23].setRotationPoint(0F, -54F, -6F);
		rightLegModel[23].rotateAngleZ = -0.34906585F;

		rightLegModel[24].addBox(4F, 17F, -9F, 7, 12, 10, 0F); // RightLeg48
		rightLegModel[24].setRotationPoint(0F, -54F, -6F);
		rightLegModel[24].rotateAngleZ = -0.34906585F;

		rightLegModel[25].addShapeBox(11F, 29F, -9F, 2, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // RightLeg49
		rightLegModel[25].setRotationPoint(0F, -54F, -6F);
		rightLegModel[25].rotateAngleZ = -0.34906585F;

		rightLegModel[26].addShapeBox(2F, 17F, 1F, 2, 11, 2, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // RightLeg5
		rightLegModel[26].setRotationPoint(0F, -54F, -6F);
		rightLegModel[26].rotateAngleZ = -0.34906585F;

		rightLegModel[27].addShapeBox(13F, 29F, -9F, 3, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 0F, -2F); // RightLeg50
		rightLegModel[27].setRotationPoint(0F, -54F, -6F);
		rightLegModel[27].rotateAngleZ = -0.34906585F;

		rightLegModel[28].addShapeBox(13F, 17F, -9F, 3, 12, 10, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // RightLeg51
		rightLegModel[28].setRotationPoint(0F, -54F, -6F);
		rightLegModel[28].rotateAngleZ = -0.34906585F;

		rightLegModel[29].addShapeBox(13F, 13F, -9F, 3, 4, 10, 0F, -1F, 0F, -2.5F, 0F, -3F, -2.5F, 0F, -3F, -2.5F, -1F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // RightLeg52
		rightLegModel[29].setRotationPoint(0F, -54F, -6F);
		rightLegModel[29].rotateAngleZ = -0.34906585F;

		rightLegModel[30].addShapeBox(2F, 28F, -11F, 10, 4, 2, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -1.5F, 0F, -3.5F, -1.5F, 0F, -2F, 0F, 0F, -3F, 0F, 0F); // RightLeg53
		rightLegModel[30].setRotationPoint(0F, -54F, -6F);
		rightLegModel[30].rotateAngleZ = -0.34906585F;

		rightLegModel[31].addShapeBox(4F, 17F, -11F, 8, 11, 2, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg54
		rightLegModel[31].setRotationPoint(0F, -54F, -6F);
		rightLegModel[31].rotateAngleZ = -0.34906585F;

		rightLegModel[32].addShapeBox(4F, 17F, 1F, 8, 11, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // RightLeg6
		rightLegModel[32].setRotationPoint(0F, -54F, -6F);
		rightLegModel[32].rotateAngleZ = -0.34906585F;

		rightLegModel[33].addBox(5F, 29F, -9F, 6, 15, 10, 0F); // RightLeg7
		rightLegModel[33].setRotationPoint(0F, -54F, -6F);
		rightLegModel[33].rotateAngleZ = -0.34906585F;

		rightLegModel[34].addShapeBox(11F, 32F, -9F, 2, 12, 10, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -2F, 2F, 0F, -2F, 0F, 0F, 0F); // RightLeg8
		rightLegModel[34].setRotationPoint(0F, -54F, -6F);
		rightLegModel[34].rotateAngleZ = -0.34906585F;

		rightLegModel[35].addShapeBox(3F, 32F, -11F, 3, 8, 14, 0F, -1.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -1.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg9
		rightLegModel[35].setRotationPoint(0F, -54F, -6F);
		rightLegModel[35].rotateAngleZ = -0.34906585F;


		leftFootModel = new ModelRendererTurbo[18];
		leftFootModel[0] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // LeftLeg11
		leftFootModel[1] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // LeftLeg22
		leftFootModel[2] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // LeftLeg3
		leftFootModel[3] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // LeftLeg32
		leftFootModel[4] = new ModelRendererTurbo(this, 83, 173, textureX, textureY); // LeftLeg37
		leftFootModel[5] = new ModelRendererTurbo(this, 83, 173, textureX, textureY); // LeftLeg38
		leftFootModel[6] = new ModelRendererTurbo(this, 83, 173, textureX, textureY); // LeftLeg39
		leftFootModel[7] = new ModelRendererTurbo(this, 83, 173, textureX, textureY); // LeftLeg40
		leftFootModel[8] = new ModelRendererTurbo(this, 83, 173, textureX, textureY); // LeftLeg41
		leftFootModel[9] = new ModelRendererTurbo(this, 83, 173, textureX, textureY); // LeftLeg42
		leftFootModel[10] = new ModelRendererTurbo(this, 83, 195, textureX, textureY); // LeftLeg44
		leftFootModel[11] = new ModelRendererTurbo(this, 83, 187, textureX, textureY); // LeftLeg45
		leftFootModel[12] = new ModelRendererTurbo(this, 83, 206, textureX, textureY); // LeftLeg46
		leftFootModel[13] = new ModelRendererTurbo(this, 121, 233, textureX, textureY); // LeftLeg49
		leftFootModel[14] = new ModelRendererTurbo(this, 121, 233, textureX, textureY); // LeftLeg50
		leftFootModel[15] = new ModelRendererTurbo(this, 121, 233, textureX, textureY); // LeftLeg51
		leftFootModel[16] = new ModelRendererTurbo(this, 121, 233, textureX, textureY); // LeftLeg52
		leftFootModel[17] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // LeftLeg53

		leftFootModel[0].addShapeBox(-14F, 50F, -0.5F, 4, 4, 9, 0F, 1.5F, 0F, -1F, -.5F, 0F, 0F, -.5F, 0F, 0F, 1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // LeftLeg11
		leftFootModel[0].setRotationPoint(0F, -54F, 6F);

		leftFootModel[1].addShapeBox(-15.5F, 48F, -0.5F, 4, 2, 9, 0F, .5F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, .5F, 0F, -2F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F); // LeftLeg22
		leftFootModel[1].setRotationPoint(0F, -54F, 6F);

		leftFootModel[2].addShapeBox(-3F, 49F, -1F, 1, 4, 10, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, -2F, 0F); // LeftLeg3
		leftFootModel[2].setRotationPoint(0F, -54F, 6F);

		leftFootModel[3].addBox(-9F, 48F, 8F, 4, 6, 5, 0F); // LeftLeg32
		leftFootModel[3].setRotationPoint(0F, -54F, 6F);

		leftFootModel[4].addShapeBox(-9.5F, 50F, 13F, 5, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg37
		leftFootModel[4].setRotationPoint(0F, -54F, 6F);

		leftFootModel[5].addShapeBox(-9.5F, 49F, 13F, 5, 1, 3, 0F, -1.5F, .5F, 0F, -1.5F, .5F, 0F, -1.5F, .5F, 0F, -1.5F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg38
		leftFootModel[5].setRotationPoint(0F, -54F, 6F);

		leftFootModel[6].addShapeBox(-9.5F, 52F, 13F, 5, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, .5F, 0F, -1.5F, .5F, 0F, -1.5F, .5F, 0F, -1.5F, .5F, 0F); // LeftLeg39
		leftFootModel[6].setRotationPoint(0F, -54F, 6F);

		leftFootModel[7].addShapeBox(-26.5F, 49.5F, 13.5F, 18, 3, 2, 0F, 0F, .5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 1F, 0F, .5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 1F); // LeftLeg40
		leftFootModel[7].setRotationPoint(0F, -54F, 6F);

		leftFootModel[8].addShapeBox(-32.5F, 49F, 12.5F, 6, 4, 4, 0F, 0F, 1F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, .5F, 0F, 1F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, .5F); // LeftLeg41
		leftFootModel[8].setRotationPoint(0F, -54F, 6F);

		leftFootModel[9].addShapeBox(-39.5F, 49F, 12.5F, 7, 4, 4, 0F, 0F, 0F, 0F, 0F, 1F, .5F, 0F, 1F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, .5F, 0F, 1F, .5F, 0F, 0F, 0F); // LeftLeg42
		leftFootModel[9].setRotationPoint(0F, -54F, 6F);

		leftFootModel[10].addShapeBox(-42.5F, 49.5F, 13F, 7, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg44
		leftFootModel[10].setRotationPoint(0F, -54F, 6F);

		leftFootModel[11].addShapeBox(-42.5F, 47.5F, 13F, 7, 2, 3, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg45
		leftFootModel[11].setRotationPoint(0F, -54F, 6F);

		leftFootModel[12].addShapeBox(-42.5F, 52.5F, 13F, 7, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // LeftLeg46
		leftFootModel[12].setRotationPoint(0F, -54F, 6F);

		leftFootModel[13].addBox(-9F, 46F, 0F, 5, 8, 8, 0F); // LeftLeg49
		leftFootModel[13].setRotationPoint(0F, -54F, 6F);

		leftFootModel[14].addShapeBox(-4F, 46F, 0F, 3, 8, 8, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // LeftLeg50
		leftFootModel[14].setRotationPoint(0F, -54F, 6F);

		leftFootModel[15].addShapeBox(-12F, 46F, 0F, 3, 8, 8, 0F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // LeftLeg51
		leftFootModel[15].setRotationPoint(0F, -54F, 6F);

		leftFootModel[16].addShapeBox(-4F, 46F, 1F, 11, 7, 6, 0F, 0F, 0F, -1F, -1.5F, -3F, -1.5F, -1.5F, -3F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // LeftLeg52
		leftFootModel[16].setRotationPoint(0F, -54F, 6F);

		leftFootModel[17].addShapeBox(-2F, 51F, -1F, 11, 3, 10, 0F, 0F, .5F, 0F, -1F, 0F, -3F, -1F, 0F, -3F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F); // LeftLeg53
		leftFootModel[17].setRotationPoint(0F, -54F, 6F);


		rightFootModel = new ModelRendererTurbo[18];
		rightFootModel[0] = new ModelRendererTurbo(this, 121, 233, textureX, textureY); // RightLeg14
		rightFootModel[1] = new ModelRendererTurbo(this, 121, 233, textureX, textureY); // RightLeg15
		rightFootModel[2] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // RightLeg16
		rightFootModel[3] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // RightLeg17
		rightFootModel[4] = new ModelRendererTurbo(this, 121, 233, textureX, textureY); // RightLeg18
		rightFootModel[5] = new ModelRendererTurbo(this, 121, 233, textureX, textureY); // RightLeg19
		rightFootModel[6] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // RightLeg20
		rightFootModel[7] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // RightLeg21
		rightFootModel[8] = new ModelRendererTurbo(this, 19, 227, textureX, textureY); // RightLeg22
		rightFootModel[9] = new ModelRendererTurbo(this, 83, 173, textureX, textureY); // RightLeg23
		rightFootModel[10] = new ModelRendererTurbo(this, 83, 173, textureX, textureY); // RightLeg24
		rightFootModel[11] = new ModelRendererTurbo(this, 83, 173, textureX, textureY); // RightLeg25
		rightFootModel[12] = new ModelRendererTurbo(this, 83, 173, textureX, textureY); // RightLeg26
		rightFootModel[13] = new ModelRendererTurbo(this, 83, 173, textureX, textureY); // RightLeg27
		rightFootModel[14] = new ModelRendererTurbo(this, 83, 173, textureX, textureY); // RightLeg28
		rightFootModel[15] = new ModelRendererTurbo(this, 83, 206, textureX, textureY); // RightLeg29
		rightFootModel[16] = new ModelRendererTurbo(this, 83, 195, textureX, textureY); // RightLeg30
		rightFootModel[17] = new ModelRendererTurbo(this, 83, 187, textureX, textureY); // RightLeg31

		rightFootModel[0].addShapeBox(-4F, 46F, -8F, 3, 8, 8, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // RightLeg14
		rightFootModel[0].setRotationPoint(0F, -54F, -6F);

		rightFootModel[1].addShapeBox(-4F, 46F, -7F, 11, 7, 6, 0F, 0F, 0F, -1F, -1.5F, -3F, -1.5F, -1.5F, -3F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // RightLeg15
		rightFootModel[1].setRotationPoint(0F, -54F, -6F);

		rightFootModel[2].addShapeBox(-2F, 51F, -9F, 11, 3, 10, 0F, 0F, .5F, 0F, -1F, 0F, -3F, -1F, 0F, -3F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F); // RightLeg16
		rightFootModel[2].setRotationPoint(0F, -54F, -6F);

		rightFootModel[3].addShapeBox(-3F, 49F, -9F, 1, 4, 10, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, -2F, 0F); // RightLeg17
		rightFootModel[3].setRotationPoint(0F, -54F, -6F);

		rightFootModel[4].addBox(-9F, 46F, -8F, 5, 8, 8, 0F); // RightLeg18
		rightFootModel[4].setRotationPoint(0F, -54F, -6F);

		rightFootModel[5].addShapeBox(-12F, 46F, -8F, 3, 8, 8, 0F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // RightLeg19
		rightFootModel[5].setRotationPoint(0F, -54F, -6F);

		rightFootModel[6].addShapeBox(-15.5F, 48F, -8.5F, 4, 2, 9, 0F, .5F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, .5F, 0F, -2F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F); // RightLeg20
		rightFootModel[6].setRotationPoint(0F, -54F, -6F);

		rightFootModel[7].addShapeBox(-14F, 50F, -8.5F, 4, 4, 9, 0F, 1.5F, 0F, -1F, -.5F, 0F, 0F, -.5F, 0F, 0F, 1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // RightLeg21
		rightFootModel[7].setRotationPoint(0F, -54F, -6F);

		rightFootModel[8].addBox(-9F, 48F, -13F, 4, 6, 5, 0F); // RightLeg22
		rightFootModel[8].setRotationPoint(0F, -54F, -6F);

		rightFootModel[9].addShapeBox(-9.5F, 49F, -16F, 5, 1, 3, 0F, -1.5F, .5F, 0F, -1.5F, .5F, 0F, -1.5F, .5F, 0F, -1.5F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg23
		rightFootModel[9].setRotationPoint(0F, -54F, -6F);

		rightFootModel[10].addShapeBox(-9.5F, 50F, -16F, 5, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg24
		rightFootModel[10].setRotationPoint(0F, -54F, -6F);

		rightFootModel[11].addShapeBox(-9.5F, 52F, -16F, 5, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, .5F, 0F, -1.5F, .5F, 0F, -1.5F, .5F, 0F, -1.5F, .5F, 0F); // RightLeg25
		rightFootModel[11].setRotationPoint(0F, -54F, -6F);

		rightFootModel[12].addShapeBox(-26.5F, 49.5F, -15.5F, 18, 3, 2, 0F, 0F, .5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 1F, 0F, .5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 1F); // RightLeg26
		rightFootModel[12].setRotationPoint(0F, -54F, -6F);

		rightFootModel[13].addShapeBox(-32.5F, 49F, -16.5F, 6, 4, 4, 0F, 0F, 1F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, .5F, 0F, 1F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, .5F); // RightLeg27
		rightFootModel[13].setRotationPoint(0F, -54F, -6F);

		rightFootModel[14].addShapeBox(-39.5F, 49F, -16.5F, 7, 4, 4, 0F, 0F, 0F, 0F, 0F, 1F, .5F, 0F, 1F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, .5F, 0F, 1F, .5F, 0F, 0F, 0F); // RightLeg28
		rightFootModel[14].setRotationPoint(0F, -54F, -6F);

		rightFootModel[15].addShapeBox(-42.5F, 52.5F, -16F, 7, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // RightLeg29
		rightFootModel[15].setRotationPoint(0F, -54F, -6F);

		rightFootModel[16].addShapeBox(-42.5F, 49.5F, -16F, 7, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg30
		rightFootModel[16].setRotationPoint(0F, -54F, -6F);

		rightFootModel[17].addShapeBox(-42.5F, 47.5F, -16F, 7, 2, 3, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg31
		rightFootModel[17].setRotationPoint(0F, -54F, -6F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}