//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelGunTank extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelGunTank() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[131];
		bodyModel[0] = new ModelRendererTurbo(this, 75, 547, textureX, textureY); // Import Chassis1
		bodyModel[1] = new ModelRendererTurbo(this, 36, 421, textureX, textureY); // Import Chassis10
		bodyModel[2] = new ModelRendererTurbo(this, 35, 419, textureX, textureY); // Import Chassis11
		bodyModel[3] = new ModelRendererTurbo(this, 206, 7, textureX, textureY); // Import Chassis112
		bodyModel[4] = new ModelRendererTurbo(this, 206, 7, textureX, textureY); // Import Chassis113
		bodyModel[5] = new ModelRendererTurbo(this, 206, 7, textureX, textureY); // Import Chassis114
		bodyModel[6] = new ModelRendererTurbo(this, 206, 7, textureX, textureY); // Import Chassis115
		bodyModel[7] = new ModelRendererTurbo(this, 206, 7, textureX, textureY); // Import Chassis116
		bodyModel[8] = new ModelRendererTurbo(this, 206, 7, textureX, textureY); // Import Chassis117
		bodyModel[9] = new ModelRendererTurbo(this, 5, 362, textureX, textureY); // Import Chassis118
		bodyModel[10] = new ModelRendererTurbo(this, 5, 362, textureX, textureY); // Import Chassis119
		bodyModel[11] = new ModelRendererTurbo(this, 36, 421, textureX, textureY); // Import Chassis12
		bodyModel[12] = new ModelRendererTurbo(this, 5, 362, textureX, textureY); // Import Chassis120
		bodyModel[13] = new ModelRendererTurbo(this, 5, 362, textureX, textureY); // Import Chassis121
		bodyModel[14] = new ModelRendererTurbo(this, 5, 362, textureX, textureY); // Import Chassis122
		bodyModel[15] = new ModelRendererTurbo(this, 5, 362, textureX, textureY); // Import Chassis123
		bodyModel[16] = new ModelRendererTurbo(this, 5, 362, textureX, textureY); // Import Chassis124
		bodyModel[17] = new ModelRendererTurbo(this, 68, 415, textureX, textureY); // Import Chassis125
		bodyModel[18] = new ModelRendererTurbo(this, 68, 439, textureX, textureY); // Import Chassis126
		bodyModel[19] = new ModelRendererTurbo(this, 106, 395, textureX, textureY); // Import Chassis127
		bodyModel[20] = new ModelRendererTurbo(this, 106, 416, textureX, textureY); // Import Chassis128
		bodyModel[21] = new ModelRendererTurbo(this, 106, 434, textureX, textureY); // Import Chassis129
		bodyModel[22] = new ModelRendererTurbo(this, 35, 419, textureX, textureY); // Import Chassis13
		bodyModel[23] = new ModelRendererTurbo(this, 59, 411, textureX, textureY); // Import Chassis130
		bodyModel[24] = new ModelRendererTurbo(this, 59, 411, textureX, textureY); // Import Chassis131
		bodyModel[25] = new ModelRendererTurbo(this, 59, 411, textureX, textureY); // Import Chassis132
		bodyModel[26] = new ModelRendererTurbo(this, 84, 395, textureX, textureY); // Import Chassis133
		bodyModel[27] = new ModelRendererTurbo(this, 81, 395, textureX, textureY); // Import Chassis134
		bodyModel[28] = new ModelRendererTurbo(this, 65, 395, textureX, textureY); // Import Chassis135
		bodyModel[29] = new ModelRendererTurbo(this, 65, 395, textureX, textureY); // Import Chassis136
		bodyModel[30] = new ModelRendererTurbo(this, 65, 395, textureX, textureY); // Import Chassis137
		bodyModel[31] = new ModelRendererTurbo(this, 60, 439, textureX, textureY); // Import Chassis138
		bodyModel[32] = new ModelRendererTurbo(this, 60, 439, textureX, textureY); // Import Chassis139
		bodyModel[33] = new ModelRendererTurbo(this, 7, 119, textureX, textureY); // Import Chassis14
		bodyModel[34] = new ModelRendererTurbo(this, 60, 439, textureX, textureY); // Import Chassis140
		bodyModel[35] = new ModelRendererTurbo(this, 6, 73, textureX, textureY); // Import Chassis15
		bodyModel[36] = new ModelRendererTurbo(this, 6, 423, textureX, textureY); // Import Chassis156
		bodyModel[37] = new ModelRendererTurbo(this, 6, 423, textureX, textureY); // Import Chassis157
		bodyModel[38] = new ModelRendererTurbo(this, 6, 423, textureX, textureY); // Import Chassis158
		bodyModel[39] = new ModelRendererTurbo(this, 6, 423, textureX, textureY); // Import Chassis159
		bodyModel[40] = new ModelRendererTurbo(this, 106, 250, textureX, textureY); // Import Chassis16
		bodyModel[41] = new ModelRendererTurbo(this, 6, 423, textureX, textureY); // Import Chassis160
		bodyModel[42] = new ModelRendererTurbo(this, 6, 423, textureX, textureY); // Import Chassis161
		bodyModel[43] = new ModelRendererTurbo(this, 6, 423, textureX, textureY); // Import Chassis162
		bodyModel[44] = new ModelRendererTurbo(this, 6, 439, textureX, textureY); // Import Chassis163
		bodyModel[45] = new ModelRendererTurbo(this, 6, 451, textureX, textureY); // Import Chassis164
		bodyModel[46] = new ModelRendererTurbo(this, 20, 440, textureX, textureY); // Import Chassis165
		bodyModel[47] = new ModelRendererTurbo(this, 6, 423, textureX, textureY); // Import Chassis166
		bodyModel[48] = new ModelRendererTurbo(this, 6, 423, textureX, textureY); // Import Chassis167
		bodyModel[49] = new ModelRendererTurbo(this, 6, 423, textureX, textureY); // Import Chassis168
		bodyModel[50] = new ModelRendererTurbo(this, 6, 423, textureX, textureY); // Import Chassis169
		bodyModel[51] = new ModelRendererTurbo(this, 9, 248, textureX, textureY); // Import Chassis17
		bodyModel[52] = new ModelRendererTurbo(this, 6, 423, textureX, textureY); // Import Chassis170
		bodyModel[53] = new ModelRendererTurbo(this, 6, 423, textureX, textureY); // Import Chassis171
		bodyModel[54] = new ModelRendererTurbo(this, 6, 423, textureX, textureY); // Import Chassis172
		bodyModel[55] = new ModelRendererTurbo(this, 6, 423, textureX, textureY); // Import Chassis173
		bodyModel[56] = new ModelRendererTurbo(this, 6, 423, textureX, textureY); // Import Chassis174
		bodyModel[57] = new ModelRendererTurbo(this, 6, 423, textureX, textureY); // Import Chassis175
		bodyModel[58] = new ModelRendererTurbo(this, 6, 423, textureX, textureY); // Import Chassis176
		bodyModel[59] = new ModelRendererTurbo(this, 6, 423, textureX, textureY); // Import Chassis177
		bodyModel[60] = new ModelRendererTurbo(this, 6, 439, textureX, textureY); // Import Chassis178
		bodyModel[61] = new ModelRendererTurbo(this, 6, 451, textureX, textureY); // Import Chassis179
		bodyModel[62] = new ModelRendererTurbo(this, 20, 440, textureX, textureY); // Import Chassis180
		bodyModel[63] = new ModelRendererTurbo(this, 6, 423, textureX, textureY); // Import Chassis181
		bodyModel[64] = new ModelRendererTurbo(this, 6, 423, textureX, textureY); // Import Chassis182
		bodyModel[65] = new ModelRendererTurbo(this, 6, 423, textureX, textureY); // Import Chassis183
		bodyModel[66] = new ModelRendererTurbo(this, 0, 250, textureX, textureY); // Import Chassis184
		bodyModel[67] = new ModelRendererTurbo(this, 1, 250, textureX, textureY); // Import Chassis185
		bodyModel[68] = new ModelRendererTurbo(this, 131, 510, textureX, textureY); // Import Chassis186
		bodyModel[69] = new ModelRendererTurbo(this, 5, 362, textureX, textureY); // Import Chassis187
		bodyModel[70] = new ModelRendererTurbo(this, 5, 362, textureX, textureY); // Import Chassis191
		bodyModel[71] = new ModelRendererTurbo(this, 5, 362, textureX, textureY); // Import Chassis192
		bodyModel[72] = new ModelRendererTurbo(this, 5, 362, textureX, textureY); // Import Chassis193
		bodyModel[73] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import Chassis2
		bodyModel[74] = new ModelRendererTurbo(this, 7, 544, textureX, textureY); // Import Chassis21
		bodyModel[75] = new ModelRendererTurbo(this, 112, 544, textureX, textureY); // Import Chassis22
		bodyModel[76] = new ModelRendererTurbo(this, 107, 555, textureX, textureY); // Import Chassis23
		bodyModel[77] = new ModelRendererTurbo(this, 73, 540, textureX, textureY); // Import Chassis24
		bodyModel[78] = new ModelRendererTurbo(this, 75, 547, textureX, textureY); // Import Chassis25
		bodyModel[79] = new ModelRendererTurbo(this, 75, 547, textureX, textureY); // Import Chassis26
		bodyModel[80] = new ModelRendererTurbo(this, 75, 547, textureX, textureY); // Import Chassis28
		bodyModel[81] = new ModelRendererTurbo(this, 75, 547, textureX, textureY); // Import Chassis29
		bodyModel[82] = new ModelRendererTurbo(this, 75, 547, textureX, textureY); // Import Chassis30
		bodyModel[83] = new ModelRendererTurbo(this, 75, 547, textureX, textureY); // Import Chassis31
		bodyModel[84] = new ModelRendererTurbo(this, 75, 547, textureX, textureY); // Import Chassis32
		bodyModel[85] = new ModelRendererTurbo(this, 75, 547, textureX, textureY); // Import Chassis33
		bodyModel[86] = new ModelRendererTurbo(this, 2, 397, textureX, textureY); // Import Chassis40
		bodyModel[87] = new ModelRendererTurbo(this, 11, 371, textureX, textureY); // Import Chassis41
		bodyModel[88] = new ModelRendererTurbo(this, 9, 333, textureX, textureY); // Import Chassis42
		bodyModel[89] = new ModelRendererTurbo(this, 39, 396, textureX, textureY); // Import Chassis43
		bodyModel[90] = new ModelRendererTurbo(this, 39, 396, textureX, textureY); // Import Chassis44
		bodyModel[91] = new ModelRendererTurbo(this, 7, 387, textureX, textureY); // Import Chassis45
		bodyModel[92] = new ModelRendererTurbo(this, 110, 502, textureX, textureY); // Import Chassis46
		bodyModel[93] = new ModelRendererTurbo(this, 7, 387, textureX, textureY); // Import Chassis46
		bodyModel[94] = new ModelRendererTurbo(this, 7, 387, textureX, textureY); // Import Chassis47
		bodyModel[95] = new ModelRendererTurbo(this, 7, 387, textureX, textureY); // Import Chassis48
		bodyModel[96] = new ModelRendererTurbo(this, 3, 328, textureX, textureY); // Import Chassis49
		bodyModel[97] = new ModelRendererTurbo(this, 31, 313, textureX, textureY); // Import Chassis5
		bodyModel[98] = new ModelRendererTurbo(this, 3, 328, textureX, textureY); // Import Chassis50
		bodyModel[99] = new ModelRendererTurbo(this, 131, 502, textureX, textureY); // Import Chassis51
		bodyModel[100] = new ModelRendererTurbo(this, 131, 510, textureX, textureY); // Import Chassis52
		bodyModel[101] = new ModelRendererTurbo(this, 131, 519, textureX, textureY); // Import Chassis53
		bodyModel[102] = new ModelRendererTurbo(this, 110, 510, textureX, textureY); // Import Chassis54
		bodyModel[103] = new ModelRendererTurbo(this, 110, 502, textureX, textureY); // Import Chassis55
		bodyModel[104] = new ModelRendererTurbo(this, 110, 510, textureX, textureY); // Import Chassis56
		bodyModel[105] = new ModelRendererTurbo(this, 110, 502, textureX, textureY); // Import Chassis57
		bodyModel[106] = new ModelRendererTurbo(this, 110, 502, textureX, textureY); // Import Chassis58
		bodyModel[107] = new ModelRendererTurbo(this, 110, 502, textureX, textureY); // Import Chassis59
		bodyModel[108] = new ModelRendererTurbo(this, 75, 547, textureX, textureY); // Import Chassis6
		bodyModel[109] = new ModelRendererTurbo(this, 110, 502, textureX, textureY); // Import Chassis61
		bodyModel[110] = new ModelRendererTurbo(this, 110, 502, textureX, textureY); // Import Chassis62
		bodyModel[111] = new ModelRendererTurbo(this, 5, 362, textureX, textureY); // Import Chassis63
		bodyModel[112] = new ModelRendererTurbo(this, 5, 362, textureX, textureY); // Import Chassis64
		bodyModel[113] = new ModelRendererTurbo(this, 5, 362, textureX, textureY); // Import Chassis65
		bodyModel[114] = new ModelRendererTurbo(this, 5, 362, textureX, textureY); // Import Chassis66
		bodyModel[115] = new ModelRendererTurbo(this, 131, 502, textureX, textureY); // Import Chassis67
		bodyModel[116] = new ModelRendererTurbo(this, 131, 519, textureX, textureY); // Import Chassis69
		bodyModel[117] = new ModelRendererTurbo(this, 3, 273, textureX, textureY); // Import Chassis7
		bodyModel[118] = new ModelRendererTurbo(this, 5, 362, textureX, textureY); // Import Chassis7
		bodyModel[119] = new ModelRendererTurbo(this, 125, 508, textureX, textureY); // Import Chassis70
		bodyModel[120] = new ModelRendererTurbo(this, 3, 310, textureX, textureY); // Import Chassis71
		bodyModel[121] = new ModelRendererTurbo(this, 3, 310, textureX, textureY); // Import Chassis73
		bodyModel[122] = new ModelRendererTurbo(this, 3, 273, textureX, textureY); // Import Chassis74
		bodyModel[123] = new ModelRendererTurbo(this, 12, 182, textureX, textureY); // Import Chassis8
		bodyModel[124] = new ModelRendererTurbo(this, 126, 186, textureX, textureY); // Import Chassis9
		bodyModel[125] = new ModelRendererTurbo(this, 3, 563, textureX, textureY); // Import Chassis92
		bodyModel[126] = new ModelRendererTurbo(this, 33, 563, textureX, textureY); // Import Chassis93
		bodyModel[127] = new ModelRendererTurbo(this, 3, 563, textureX, textureY); // Import Chassis94
		bodyModel[128] = new ModelRendererTurbo(this, 33, 563, textureX, textureY); // Import Chassis95
		bodyModel[129] = new ModelRendererTurbo(this, 2, 397, textureX, textureY); // Box 585
		bodyModel[130] = new ModelRendererTurbo(this, 31, 313, textureX, textureY); // Box 586

		bodyModel[0].addBox(-57.7F, -2.5F, 2.5F, 3, 1, 1, 0F); // Import Chassis1
		bodyModel[0].setRotationPoint(0F, -24F, 0F);

		bodyModel[1].addBox(22F, -4F, -9F, 1, 2, 1, 0F); // Import Chassis10
		bodyModel[1].setRotationPoint(0F, -26F, 0F);
		bodyModel[1].rotateAngleZ = -0.20943951F;

		bodyModel[2].addBox(22.5F, -3F, -13F, 3, 1, 9, 0F); // Import Chassis11
		bodyModel[2].setRotationPoint(0F, -26F, 0F);
		bodyModel[2].rotateAngleZ = -0.20943951F;

		bodyModel[3].addBox(29.5F, 8.5F, -24.5F, 3, 3, 49, 0F); // Import Chassis112
		bodyModel[3].setRotationPoint(0F, -26F, 0F);

		bodyModel[4].addBox(15.5F, 13.5F, -24.5F, 3, 3, 49, 0F); // Import Chassis113
		bodyModel[4].setRotationPoint(0F, -26F, 0F);

		bodyModel[5].addBox(0.5F, 13.5F, -24.5F, 3, 3, 49, 0F); // Import Chassis114
		bodyModel[5].setRotationPoint(0F, -26F, 0F);

		bodyModel[6].addBox(-14.5F, 13.5F, -24.5F, 3, 3, 49, 0F); // Import Chassis115
		bodyModel[6].setRotationPoint(0F, -26F, 0F);

		bodyModel[7].addBox(-29.5F, 13.5F, -24.5F, 3, 3, 49, 0F); // Import Chassis116
		bodyModel[7].setRotationPoint(0F, -26F, 0F);

		bodyModel[8].addBox(-44.5F, 13.5F, -24.5F, 3, 3, 49, 0F); // Import Chassis117
		bodyModel[8].setRotationPoint(0F, -26F, 0F);

		bodyModel[9].addShapeBox(35F, -7F, -19.5F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Chassis118
		bodyModel[9].setRotationPoint(0F, -26F, 0F);
		bodyModel[9].rotateAngleZ = -0.34906585F;

		bodyModel[10].addBox(33F, -5F, -19.5F, 3, 1, 1, 0F); // Import Chassis119
		bodyModel[10].setRotationPoint(0F, -26F, 0F);
		bodyModel[10].rotateAngleZ = -0.34906585F;

		bodyModel[11].addBox(25F, -4F, -9F, 1, 2, 1, 0F); // Import Chassis12
		bodyModel[11].setRotationPoint(0F, -26F, 0F);
		bodyModel[11].rotateAngleZ = -0.20943951F;

		bodyModel[12].addShapeBox(33F, -7F, -19.5F, 1, 2, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Chassis120
		bodyModel[12].setRotationPoint(0F, -26F, 0F);
		bodyModel[12].rotateAngleZ = -0.34906585F;

		bodyModel[13].addBox(33F, -5F, 18.5F, 3, 1, 1, 0F); // Import Chassis121
		bodyModel[13].setRotationPoint(0F, -26F, 0F);
		bodyModel[13].rotateAngleZ = -0.34906585F;

		bodyModel[14].addShapeBox(33F, -7F, 18.5F, 1, 2, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Chassis122
		bodyModel[14].setRotationPoint(0F, -26F, 0F);
		bodyModel[14].rotateAngleZ = -0.34906585F;

		bodyModel[15].addBox(34F, -7F, 18.5F, 1, 1, 1, 0F); // Import Chassis123
		bodyModel[15].setRotationPoint(0F, -26F, 0F);
		bodyModel[15].rotateAngleZ = -0.34906585F;

		bodyModel[16].addShapeBox(35F, -7F, 18.5F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Chassis124
		bodyModel[16].setRotationPoint(0F, -26F, 0F);
		bodyModel[16].rotateAngleZ = -0.34906585F;

		bodyModel[17].addShapeBox(24F, 2.5F, 4F, 4, 2, 13, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Import Chassis125
		bodyModel[17].setRotationPoint(0F, -26F, 0F);

		bodyModel[18].addBox(20F, 2.5F, 4F, 4, 1, 13, 0F); // Import Chassis126
		bodyModel[18].setRotationPoint(0F, -26F, 0F);

		bodyModel[19].addShapeBox(23F, 1F, 4.5F, 3, 2, 12, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Import Chassis127
		bodyModel[19].setRotationPoint(0F, -26F, 0F);

		bodyModel[20].addBox(19F, 1F, 4.5F, 4, 3, 12, 0F); // Import Chassis128
		bodyModel[20].setRotationPoint(0F, -26F, 0F);

		bodyModel[21].addShapeBox(16F, 1F, 4.5F, 3, 2, 12, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Import Chassis129
		bodyModel[21].setRotationPoint(0F, -26F, 0F);

		bodyModel[22].addBox(26F, -3F, -13F, 3, 1, 9, 0F); // Import Chassis13
		bodyModel[22].setRotationPoint(0F, -26F, 0F);
		bodyModel[22].rotateAngleZ = -0.20943951F;

		bodyModel[23].addShapeBox(21.5F, 0.7F, 8.5F, 2, 1, 4, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F); // Import Chassis130
		bodyModel[23].setRotationPoint(0F, -26F, 0F);

		bodyModel[24].addBox(20.5F, 0.7F, 8.5F, 1, 1, 4, 0F); // Import Chassis131
		bodyModel[24].setRotationPoint(0F, -26F, 0F);

		bodyModel[25].addShapeBox(18.5F, 0.7F, 8.5F, 2, 1, 4, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Import Chassis132
		bodyModel[25].setRotationPoint(0F, -26F, 0F);

		bodyModel[26].addShapeBox(23F, 0.5F, -1.5F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.6F, 0F, 0F, -.6F, 0F, 0F, -.6F, 0F, 0F, -.6F, 0F); // Import Chassis133
		bodyModel[26].setRotationPoint(0F, -26F, 0F);
		bodyModel[26].rotateAngleY = 0.54105207F;

		bodyModel[27].addShapeBox(23F, -1F, 3.5F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.6F, 0F, 0F, -.6F, 0F, 0F, -.6F, 0F, 0F, -.6F, 0F); // Import Chassis134
		bodyModel[27].setRotationPoint(0F, -25F, 0F);
		bodyModel[27].rotateAngleY = 0.54105207F;

		bodyModel[28].addShapeBox(14.5F, 0.7F, 15.5F, 2, 3, 3, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Import Chassis135
		bodyModel[28].setRotationPoint(0F, -26.5F, 0F);

		bodyModel[29].addBox(16.5F, 0.7F, 15.5F, 1, 3, 3, 0F); // Import Chassis136
		bodyModel[29].setRotationPoint(0F, -26.5F, 0F);

		bodyModel[30].addShapeBox(17.5F, 0.7F, 15.5F, 2, 3, 3, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F); // Import Chassis137
		bodyModel[30].setRotationPoint(0F, -26.5F, 0F);

		bodyModel[31].addBox(27.3F, 1.5F, -8.5F, 1, 1, 4, 0F); // Import Chassis138
		bodyModel[31].setRotationPoint(0F, -26F, 0F);
		bodyModel[31].rotateAngleY = 0.78539816F;

		bodyModel[32].addBox(25.5F, 1.5F, 8F, 1, 1, 5, 0F); // Import Chassis139
		bodyModel[32].setRotationPoint(0F, -26F, 0F);

		bodyModel[33].addBox(-59F, 1F, -16F, 75, 16, 32, 0F); // Import Chassis14
		bodyModel[33].setRotationPoint(0F, -26F, 0F);

		bodyModel[34].addBox(12.5F, 1.5F, 19.5F, 1, 1, 4, 0F); // Import Chassis140
		bodyModel[34].setRotationPoint(0F, -26F, 0F);
		bodyModel[34].rotateAngleY = -0.78539816F;

		bodyModel[35].addBox(-64F, 0F, -16F, 79, 1, 32, 0F); // Import Chassis15
		bodyModel[35].setRotationPoint(0F, -26F, 0F);

		bodyModel[36].addShapeBox(23F, 0F, 20.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Chassis156
		bodyModel[36].setRotationPoint(0F, -26F, -4F);

		bodyModel[37].addBox(23F, 1F, 20.5F, 1, 3, 1, 0F); // Import Chassis157
		bodyModel[37].setRotationPoint(0F, -26F, -4F);

		bodyModel[38].addBox(23F, 1F, 27.5F, 1, 3, 1, 0F); // Import Chassis158
		bodyModel[38].setRotationPoint(0F, -26F, -4F);

		bodyModel[39].addBox(23F, 3F, 20.5F, 4, 1, 8, 0F); // Import Chassis159
		bodyModel[39].setRotationPoint(0F, -26F, -4F);

		bodyModel[40].addShapeBox(-61F, 15F, -16F, 2, 2, 32, 0F, 1F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 5F, 0F, 1F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5.5F, 0F); // Import Chassis16
		bodyModel[40].setRotationPoint(0F, -26F, 0F);

		bodyModel[41].addShapeBox(26F, 0F, 20.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Chassis160
		bodyModel[41].setRotationPoint(0F, -26F, -4F);

		bodyModel[42].addBox(26F, 1F, 20.5F, 1, 3, 1, 0F); // Import Chassis161
		bodyModel[42].setRotationPoint(0F, -26F, -4F);

		bodyModel[43].addBox(26F, 1F, 27.5F, 1, 3, 1, 0F); // Import Chassis162
		bodyModel[43].setRotationPoint(0F, -26F, -4F);

		bodyModel[44].addBox(24F, 1F, 22F, 2, 2, 2, 0F); // Import Chassis163
		bodyModel[44].setRotationPoint(0F, -26F, -4F);

		bodyModel[45].addBox(24F, 1F, 24.3F, 2, 2, 2, 0F); // Import Chassis164
		bodyModel[45].setRotationPoint(0F, -26F, -4F);

		bodyModel[46].addBox(24F, 1F, 26.5F, 2, 1, 1, 0F); // Import Chassis165
		bodyModel[46].setRotationPoint(0F, -26F, -4F);

		bodyModel[47].addShapeBox(26F, 1F, 22.5F, 1, 3, 1, 0F, -.8F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, -.8F, 0F, -.4F, -.8F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, -.8F, 0F, -.4F); // Import Chassis166
		bodyModel[47].setRotationPoint(0F, -26F, -4F);

		bodyModel[48].addShapeBox(26F, 1F, 24F, 1, 3, 1, 0F, -.8F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, -.8F, 0F, -.4F, -.8F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, -.8F, 0F, -.4F); // Import Chassis167
		bodyModel[48].setRotationPoint(0F, -26F, -4F);

		bodyModel[49].addShapeBox(26F, 1F, 25.5F, 1, 3, 1, 0F, -.8F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, -.8F, 0F, -.4F, -.8F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, -.8F, 0F, -.4F); // Import Chassis168
		bodyModel[49].setRotationPoint(0F, -26F, -4F);

		bodyModel[50].addShapeBox(24F, 0F, 21.5F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F); // Import Chassis169
		bodyModel[50].setRotationPoint(0F, -26F, -4F);

		bodyModel[51].addShapeBox(-64F, 1F, -16F, 5, 9, 32, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import Chassis17
		bodyModel[51].setRotationPoint(0F, -26F, 0F);

		bodyModel[52].addShapeBox(24F, 0F, -27.5F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F); // Import Chassis170
		bodyModel[52].setRotationPoint(0F, -26F, 4F);

		bodyModel[53].addShapeBox(23F, 0F, -28.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Chassis171
		bodyModel[53].setRotationPoint(0F, -26F, 4F);

		bodyModel[54].addBox(23F, 1F, -28.5F, 1, 3, 1, 0F); // Import Chassis172
		bodyModel[54].setRotationPoint(0F, -26F, 4F);

		bodyModel[55].addBox(23F, 1F, -21.5F, 1, 3, 1, 0F); // Import Chassis173
		bodyModel[55].setRotationPoint(0F, -26F, 0F);

		bodyModel[56].addBox(23F, 3F, -28.5F, 4, 1, 8, 0F); // Import Chassis174
		bodyModel[56].setRotationPoint(0F, -26F, 4F);

		bodyModel[57].addBox(26F, 1F, -28.5F, 1, 3, 1, 0F); // Import Chassis175
		bodyModel[57].setRotationPoint(0F, -26F, 4F);

		bodyModel[58].addBox(26F, 1F, -21.5F, 1, 3, 1, 0F); // Import Chassis176
		bodyModel[58].setRotationPoint(0F, -26F, 4F);

		bodyModel[59].addShapeBox(26F, 0F, -28.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Chassis177
		bodyModel[59].setRotationPoint(0F, -26F, 4F);

		bodyModel[60].addBox(24F, 1F, -24F, 2, 2, 2, 0F); // Import Chassis178
		bodyModel[60].setRotationPoint(0F, -26F, 4F);

		bodyModel[61].addBox(24F, 1F, -26.3F, 2, 2, 2, 0F); // Import Chassis179
		bodyModel[61].setRotationPoint(0F, -26F, 4F);

		bodyModel[62].addBox(24F, 1F, -27.5F, 2, 1, 1, 0F); // Import Chassis180
		bodyModel[62].setRotationPoint(0F, -26F, 4F);

		bodyModel[63].addShapeBox(26F, 1F, -26.5F, 1, 3, 1, 0F, -.8F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, -.8F, 0F, -.4F, -.8F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, -.8F, 0F, -.4F); // Import Chassis181
		bodyModel[63].setRotationPoint(0F, -26F, 4F);

		bodyModel[64].addShapeBox(26F, 1F, -25F, 1, 3, 1, 0F, -.8F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, -.8F, 0F, -.4F, -.8F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, -.8F, 0F, -.4F); // Import Chassis182
		bodyModel[64].setRotationPoint(0F, -26F, 4F);

		bodyModel[65].addShapeBox(26F, 1F, -23.5F, 1, 3, 1, 0F, -.8F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, -.8F, 0F, -.4F, -.8F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, -.8F, 0F, -.4F); // Import Chassis183
		bodyModel[65].setRotationPoint(0F, -26F, 4F);

		bodyModel[66].addBox(-64F, 4.5F, 20F, 1, 1, 9, 0F); // Import Chassis184
		bodyModel[66].setRotationPoint(0F, -26F, -4F);

		bodyModel[67].addBox(-64F, 4.5F, -29F, 1, 1, 9, 0F); // Import Chassis185
		bodyModel[67].setRotationPoint(0F, -26F, 4F);

		bodyModel[68].addBox(-65.5F, 2F, -27.5F, 2, 1, 3, 0F); // Import Chassis186
		bodyModel[68].setRotationPoint(0F, -26F, 4F);

		bodyModel[69].addBox(-3F, -65F, -19.5F, 3, 1, 1, 0F); // Import Chassis187
		bodyModel[69].setRotationPoint(0F, -26F, 4F);
		bodyModel[69].rotateAngleZ = 1.57079633F;

		bodyModel[70].addBox(-2F, -67F, -19.5F, 1, 1, 1, 0F); // Import Chassis191
		bodyModel[70].setRotationPoint(0F, -26F, 4F);
		bodyModel[70].rotateAngleZ = 1.57079633F;

		bodyModel[71].addShapeBox(-1F, -67F, -19.5F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Chassis192
		bodyModel[71].setRotationPoint(0F, -26F, 4F);
		bodyModel[71].rotateAngleZ = 1.57079633F;

		bodyModel[72].addShapeBox(-3F, -67F, -19.5F, 1, 2, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Chassis193
		bodyModel[72].setRotationPoint(0F, -26F, 4F);
		bodyModel[72].rotateAngleZ = 1.57079633F;

		bodyModel[73].addBox(-58F, 10F, -23.5F, 2, 2, 47, 0F); // Import Chassis2
		bodyModel[73].setRotationPoint(0F, -26F, 0F);

		bodyModel[74].addBox(-48.5F, -2.3F, -7F, 20, 1, 14, 0F); // Import Chassis21
		bodyModel[74].setRotationPoint(0F, -24F, 0F);

		bodyModel[75].addBox(-63F, -3F, 5F, 9, 1, 5, 0F); // Import Chassis22
		bodyModel[75].setRotationPoint(0F, -24F, 0F);

		bodyModel[76].addBox(-63F, -3F, -9F, 1, 1, 14, 0F); // Import Chassis23
		bodyModel[76].setRotationPoint(0F, -24F, 0F);

		bodyModel[77].addBox(-62F, -2.2F, -9F, 9, 1, 15, 0F); // Import Chassis24
		bodyModel[77].setRotationPoint(0F, -24F, 0F);

		bodyModel[78].addBox(-61.7F, -3F, 2F, 1, 1, 2, 0F); // Import Chassis25
		bodyModel[78].setRotationPoint(0F, -24F, 0F);

		bodyModel[79].addBox(-61.7F, -3F, -8F, 1, 1, 2, 0F); // Import Chassis26
		bodyModel[79].setRotationPoint(0F, -24F, 0F);

		bodyModel[80].addBox(-59.7F, -3F, -8F, 2, 1, 2, 0F); // Import Chassis28
		bodyModel[80].setRotationPoint(0F, -24F, 0F);

		bodyModel[81].addBox(-57.7F, -2.5F, -7.5F, 3, 1, 1, 0F); // Import Chassis29
		bodyModel[81].setRotationPoint(0F, -24F, 0F);

		bodyModel[82].addShapeBox(-60.7F, -3F, 3F, 1, 1, 1, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Chassis30
		bodyModel[82].setRotationPoint(0F, -24F, 0F);

		bodyModel[83].addBox(-59.7F, -3F, 2F, 2, 1, 2, 0F); // Import Chassis31
		bodyModel[83].setRotationPoint(0F, -24F, 0F);

		bodyModel[84].addShapeBox(-60.7F, -3F, -7F, 1, 1, 1, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Chassis32
		bodyModel[84].setRotationPoint(0F, -24F, 0F);

		bodyModel[85].addShapeBox(-60.7F, -3F, -8F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Import Chassis33
		bodyModel[85].setRotationPoint(0F, -24F, 0F);

		bodyModel[86].addShapeBox(16F, 0F, 20F, 6, 4, 9, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Chassis40
		bodyModel[86].setRotationPoint(0F, -26F, -4F);

		bodyModel[87].addBox(-64F, 3.5F, -29F, 98, 1, 9, 0F); // Import Chassis41
		bodyModel[87].setRotationPoint(0F, -26F, 4F);

		bodyModel[88].addBox(-64F, 3.5F, 20F, 98, 1, 9, 0F); // Import Chassis42
		bodyModel[88].setRotationPoint(0F, -26F, -4F);

		bodyModel[89].addShapeBox(34F, 3.5F, 20F, 4, 1, 9, 0F, 0F, 0F, 0F, .5F, -3F, 0F, .5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F); // Import Chassis43
		bodyModel[89].setRotationPoint(0F, -26F, -4F);

		bodyModel[90].addShapeBox(34F, 3.5F, -29F, 4, 1, 9, 0F, 0F, 0F, 0F, .5F, -3F, 0F, .5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F); // Import Chassis44
		bodyModel[90].setRotationPoint(0F, -26F, 4F);

		bodyModel[91].addShapeBox(34F, 4.5F, -21F, 4, 3, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Chassis45
		bodyModel[91].setRotationPoint(0F, -26F, 0F);

		bodyModel[92].addBox(-64.2F, 2.3F, 19F, 1, 1, 1, 0F); // Import Chassis46
		bodyModel[92].setRotationPoint(0F, -26F, 0F);

		bodyModel[93].addBox(-62F, 4.5F, -21F, 96, 2, 1, 0F); // Import Chassis46
		bodyModel[93].setRotationPoint(0F, -26F, 0F);

		bodyModel[94].addBox(-62F, 4.5F, 20F, 96, 2, 1, 0F); // Import Chassis47
		bodyModel[94].setRotationPoint(0F, -26F, -4F);

		bodyModel[95].addShapeBox(34F, 4.5F, 20F, 4, 3, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Chassis48
		bodyModel[95].setRotationPoint(0F, -26F, 0F);

		bodyModel[96].addShapeBox(-67F, 5.5F, 16F, 5, 5, 1, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Import Chassis49
		bodyModel[96].setRotationPoint(0F, -26F, 0F);

		bodyModel[97].addShapeBox(-64F, 0F, 16F, 80, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Chassis5
		bodyModel[97].setRotationPoint(0F, -26F, 0F);

		bodyModel[98].addShapeBox(-67F, 5.5F, -25F, 5, 5, 1, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Import Chassis50
		bodyModel[98].setRotationPoint(0F, -26F, 4F);

		bodyModel[99].addShapeBox(-65.5F, 1F, 20.5F, 2, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Chassis51
		bodyModel[99].setRotationPoint(0F, -26F, 0F);

		bodyModel[100].addBox(-65.5F, 2F, 20.5F, 2, 1, 3, 0F); // Import Chassis52
		bodyModel[100].setRotationPoint(0F, -26F, 0F);

		bodyModel[101].addShapeBox(-65.5F, 3F, 20.5F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Chassis53
		bodyModel[101].setRotationPoint(0F, -26F, 0F);

		bodyModel[102].addShapeBox(-64.5F, -0.2F, 19F, 1, 1, 1, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Chassis54
		bodyModel[102].setRotationPoint(0F, -26F, 0F);

		bodyModel[103].addShapeBox(-64.3F, -0.2F, 17F, 1, 1, 3, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F); // Import Chassis55
		bodyModel[103].setRotationPoint(0F, -26F, 0F);

		bodyModel[104].addShapeBox(-64.5F, -0.2F, 17F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Import Chassis56
		bodyModel[104].setRotationPoint(0F, -26F, 0F);

		bodyModel[105].addShapeBox(-64.2F, 0.3F, 19F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Import Chassis57
		bodyModel[105].setRotationPoint(0F, -26F, 0F);

		bodyModel[106].addShapeBox(-64.2F, 0.3F, 17F, 1, 2, 1, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Chassis58
		bodyModel[106].setRotationPoint(0F, -26F, 0F);

		bodyModel[107].addShapeBox(-64.2F, 1.3F, 17F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Chassis59
		bodyModel[107].setRotationPoint(0F, -26F, 0F);

		bodyModel[108].addShapeBox(-60.7F, -3F, 2F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Import Chassis6
		bodyModel[108].setRotationPoint(0F, -24F, 0F);

		bodyModel[109].addBox(-64.2F, 2.3F, 17F, 1, 1, 1, 0F); // Import Chassis61
		bodyModel[109].setRotationPoint(0F, -26F, 0F);

		bodyModel[110].addShapeBox(-64.2F, 3.3F, 17F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Chassis62
		bodyModel[110].setRotationPoint(0F, -26F, 0F);

		bodyModel[111].addBox(-3F, -65F, 14.5F, 3, 1, 1, 0F); // Import Chassis63
		bodyModel[111].setRotationPoint(0F, -26F, 0F);
		bodyModel[111].rotateAngleZ = 1.57079633F;

		bodyModel[112].addShapeBox(-1F, -67F, 14.5F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Chassis64
		bodyModel[112].setRotationPoint(0F, -26F, 0F);
		bodyModel[112].rotateAngleZ = 1.57079633F;

		bodyModel[113].addBox(-2F, -67F, 14.5F, 1, 1, 1, 0F); // Import Chassis65
		bodyModel[113].setRotationPoint(0F, -26F, 0F);
		bodyModel[113].rotateAngleZ = 1.57079633F;

		bodyModel[114].addShapeBox(-3F, -67F, 14.5F, 1, 2, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Chassis66
		bodyModel[114].setRotationPoint(0F, -26F, 0F);
		bodyModel[114].rotateAngleZ = 1.57079633F;

		bodyModel[115].addShapeBox(-65.5F, 1F, -27.5F, 2, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Chassis67
		bodyModel[115].setRotationPoint(0F, -26F, 4F);

		bodyModel[116].addShapeBox(-65.5F, 3F, -27.5F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Chassis69
		bodyModel[116].setRotationPoint(0F, -26F, 4F);

		bodyModel[117].addShapeBox(-43F, 53.5F, -28.5F, 1, 2, 8, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F); // Import Chassis7
		bodyModel[117].setRotationPoint(0F, -26F, 4F);
		bodyModel[117].rotateAngleZ = -0.75049158F;

		bodyModel[118].addBox(34F, -7F, -19.5F, 1, 1, 1, 0F); // Import Chassis7
		bodyModel[118].setRotationPoint(0F, -26F, 0F);
		bodyModel[118].rotateAngleZ = -0.34906585F;

		bodyModel[119].addBox(-65.5F, 2F, -24.3F, 2, 1, 1, 0F); // Import Chassis70
		bodyModel[119].setRotationPoint(0F, -26F, 4F);

		bodyModel[120].addShapeBox(-64F, 5.5F, -29F, 1, 5, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, -.5F, 0F); // Import Chassis71
		bodyModel[120].setRotationPoint(0F, -26F, 4F);

		bodyModel[121].addShapeBox(-64F, 5.5F, 20F, 1, 5, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, -.5F, 0F); // Import Chassis73
		bodyModel[121].setRotationPoint(0F, -26F, -4F);

		bodyModel[122].addShapeBox(-43F, 53.5F, 20.5F, 1, 2, 8, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F); // Import Chassis74
		bodyModel[122].setRotationPoint(0F, -26F, -4F);
		bodyModel[122].rotateAngleZ = -0.75049158F;

		bodyModel[123].addShapeBox(16F, 1F, -16F, 14, 16, 32, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -3F, 0F, 3F, -3F, 0F, 0F, 0F, 0F); // Import Chassis8
		bodyModel[123].setRotationPoint(0F, -26F, 0F);

		bodyModel[124].addShapeBox(30F, 4F, -16F, 10, 12, 32, 0F, 0F, 0F, 0F, -6F, -1.5F, 0F, -6F, -2.5F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -5.5F, -10F, 0F, -5.5F, -10F, 0F, -3F, -2F, 0F); // Import Chassis9
		bodyModel[124].setRotationPoint(0F, -26F, 0F);

		bodyModel[125].addBox(-36.5F, -3.7F, 12F, 8, 1, 5, 0F); // Import Chassis92
		bodyModel[125].setRotationPoint(0F, -24F, 0F);
		bodyModel[125].rotateAngleX = -0.10471976F;

		bodyModel[126].addBox(-62.5F, -3.7F, 13F, 14, 1, 4, 0F); // Import Chassis93
		bodyModel[126].setRotationPoint(0F, -24F, 0F);
		bodyModel[126].rotateAngleX = -0.10471976F;

		bodyModel[127].addBox(-36.5F, -3.7F, -17F, 8, 1, 5, 0F); // Import Chassis94
		bodyModel[127].setRotationPoint(0F, -24F, 0F);
		bodyModel[127].rotateAngleX = 0.10471976F;

		bodyModel[128].addBox(-62.5F, -3.7F, -17F, 14, 1, 4, 0F); // Import Chassis95
		bodyModel[128].setRotationPoint(0F, -24F, 0F);
		bodyModel[128].rotateAngleX = 0.10471976F;

		bodyModel[129].addShapeBox(16F, 0F, -20F, 6, 4, 9, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 585
		bodyModel[129].setRotationPoint(0F, -26F, -5F);

		bodyModel[130].addShapeBox(-64F, 0F, -20F, 80, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 586
		bodyModel[130].setRotationPoint(0F, -26F, -5F);


		turretModel = new ModelRendererTurbo[28];
		turretModel[0] = new ModelRendererTurbo(this, 313, 277, textureX, textureY); // Import Turret63
		turretModel[1] = new ModelRendererTurbo(this, 323, 275, textureX, textureY); // Import Turret64
		turretModel[2] = new ModelRendererTurbo(this, 313, 277, textureX, textureY); // Import Turret65
		turretModel[3] = new ModelRendererTurbo(this, 323, 275, textureX, textureY); // Import Turret66
		turretModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 388
		turretModel[5] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 389
		turretModel[6] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 390
		turretModel[7] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 391
		turretModel[8] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Box 392
		turretModel[9] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Box 393
		turretModel[10] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 394
		turretModel[11] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 395
		turretModel[12] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 396
		turretModel[13] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 397
		turretModel[14] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 398
		turretModel[15] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Box 399
		turretModel[16] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Box 400
		turretModel[17] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 401
		turretModel[18] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 402
		turretModel[19] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 403
		turretModel[20] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 404
		turretModel[21] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 409
		turretModel[22] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Box 410
		turretModel[23] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Box 411
		turretModel[24] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Box 412
		turretModel[25] = new ModelRendererTurbo(this, 897, 9, textureX, textureY); // Box 427
		turretModel[26] = new ModelRendererTurbo(this, 897, 9, textureX, textureY); // Box 428
		turretModel[27] = new ModelRendererTurbo(this, 897, 9, textureX, textureY); // Box 429

		turretModel[0].addBox(-26F, -14.5F, -13F, 1, 3, 1, 0F); // Import Turret63
		turretModel[0].setRotationPoint(0F, -40F, 0F);
		turretModel[0].rotateAngleZ = 0.6981317F;

		turretModel[1].addShapeBox(-26F, -40.5F, -13F, 1, 26, 1, 0F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Import Turret64
		turretModel[1].setRotationPoint(0F, -40F, 0F);
		turretModel[1].rotateAngleZ = 0.6981317F;

		turretModel[2].addBox(-26F, -14.5F, 12F, 1, 3, 1, 0F); // Import Turret65
		turretModel[2].setRotationPoint(0F, -40F, 0F);
		turretModel[2].rotateAngleZ = 0.6981317F;

		turretModel[3].addShapeBox(-26F, -40.5F, 12F, 1, 26, 1, 0F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Import Turret66
		turretModel[3].setRotationPoint(0F, -40F, 0F);
		turretModel[3].rotateAngleZ = 0.6981317F;

		turretModel[4].addShapeBox(-17F, 0F, -12F, 29, 15, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388
		turretModel[4].setRotationPoint(0F, -41F, 0F);

		turretModel[5].addShapeBox(12F, 0F, -12F, 10, 15, 24, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -3F, -2F, 2F, -3F, -2F, 0F, 0F, 0F); // Box 389
		turretModel[5].setRotationPoint(0F, -41F, 0F);

		turretModel[6].addShapeBox(22F, 0F, -10F, 2, 11, 20, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 2F, -2F, -3F, 2F, -2F, -3F, -2F, 0F, -1F); // Box 390
		turretModel[6].setRotationPoint(0F, -40F, 0F);

		turretModel[7].addShapeBox(-23F, 0F, -12F, 6, 15, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 391
		turretModel[7].setRotationPoint(0F, -41F, 0F);

		turretModel[8].addShapeBox(-30F, -5F, -12F, 7, 18, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 392
		turretModel[8].setRotationPoint(0F, -41F, 0F);

		turretModel[9].addShapeBox(-23F, 0F, -12F, 14, 4, 24, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 393
		turretModel[9].setRotationPoint(0F, -45F, 0F);

		turretModel[10].addShapeBox(-6F, 0F, 12F, 8, 7, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 394
		turretModel[10].setRotationPoint(0F, -33F, 0F);

		turretModel[11].addShapeBox(-12F, 0F, 12F, 6, 7, 4, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -4F); // Box 395
		turretModel[11].setRotationPoint(0F, -33F, 0F);

		turretModel[12].addShapeBox(2F, 0F, 12F, 10, 7, 4, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F); // Box 396
		turretModel[12].setRotationPoint(0F, -33F, 0F);

		turretModel[13].addShapeBox(-6F, 0F, -16F, 8, 7, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		turretModel[13].setRotationPoint(0F, -33F, 0F);

		turretModel[14].addShapeBox(-12F, 0F, -16F, 6, 7, 4, 0F, -3F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		turretModel[14].setRotationPoint(0F, -33F, 0F);

		turretModel[15].addShapeBox(2F, 0F, -16F, 10, 7, 4, 0F, 0F, 0F, 0F, -3F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		turretModel[15].setRotationPoint(0F, -33F, 0F);

		turretModel[16].addShapeBox(-27.5F, -5F, -3F, 4, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 400
		turretModel[16].setRotationPoint(0F, -46F, 0F);

		turretModel[17].addShapeBox(-27.5F, -10F, 3F, 5, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
		turretModel[17].setRotationPoint(0F, -46F, 0F);

		turretModel[18].addShapeBox(-29.5F, -10F, 3F, 2, 6, 2, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 402
		turretModel[18].setRotationPoint(0F, -46F, 0F);

		turretModel[19].addShapeBox(-26.5F, -5F, -3F, 3, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 403
		turretModel[19].setRotationPoint(0F, -51F, 0F);

		turretModel[20].addShapeBox(-26.5F, -5F, 1F, 3, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 404
		turretModel[20].setRotationPoint(0F, -51F, 0F);

		turretModel[21].addShapeBox(-34.5F, -5F, -2F, 3, 9, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -5F, 2F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -5F, 2F, 0F); // Box 409
		turretModel[21].setRotationPoint(0F, -44F, 0F);

		turretModel[22].addShapeBox(-38.5F, -5F, -2F, 3, 7, 4, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 410
		turretModel[22].setRotationPoint(0F, -51F, 0F);

		turretModel[23].addShapeBox(-38.5F, -5F, -2.5F, 3, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		turretModel[23].setRotationPoint(0F, -56F, 0F);

		turretModel[24].addShapeBox(-38.5F, -5F, -12F, 3, 2, 24, 0F, 0.5F, 0.2F, 0F, 1F, -0.2F, 0F, 1F, -0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 1F, -0.2F, 0F, 1F, -0.2F, 0F, 0.5F, 0.2F, 0F); // Box 412
		turretModel[24].setRotationPoint(0F, -58F, 0F);

		turretModel[25].addShapeBox(-4F, 0F, -6F, 6, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
		turretModel[25].setRotationPoint(0F, -42F, 0F);

		turretModel[26].addShapeBox(2F, 0F, -6F, 2, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 428
		turretModel[26].setRotationPoint(0F, -42F, 0F);

		turretModel[27].addShapeBox(-6F, 0F, -6F, 2, 1, 12, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 429
		turretModel[27].setRotationPoint(0F, -42F, 0F);


		barrelModel = new ModelRendererTurbo[18];
		barrelModel[0] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 405
		barrelModel[1] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Box 406
		barrelModel[2] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 407
		barrelModel[3] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Box 408
		barrelModel[4] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 413
		barrelModel[5] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Box 414
		barrelModel[6] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Box 415
		barrelModel[7] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Box 416
		barrelModel[8] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Box 417
		barrelModel[9] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Box 418
		barrelModel[10] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 419
		barrelModel[11] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Box 420
		barrelModel[12] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Box 421
		barrelModel[13] = new ModelRendererTurbo(this, 713, 9, textureX, textureY); // Box 422
		barrelModel[14] = new ModelRendererTurbo(this, 761, 9, textureX, textureY); // Box 423
		barrelModel[15] = new ModelRendererTurbo(this, 809, 9, textureX, textureY); // Box 424
		barrelModel[16] = new ModelRendererTurbo(this, 833, 9, textureX, textureY); // Box 425
		barrelModel[17] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 426

		barrelModel[0].addShapeBox(-2F, -1F, -1F, 5, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		barrelModel[0].setRotationPoint(-25.5F, -53F, 0F);

		barrelModel[1].addShapeBox(3F, -1F, -4F, 2, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 406
		barrelModel[1].setRotationPoint(-25.5F, -53F, 0F);

		barrelModel[2].addShapeBox(3F, -3F, -4F, 2, 2, 8, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407
		barrelModel[2].setRotationPoint(-25.5F, -53F, 0F);

		barrelModel[3].addShapeBox(3F, 3F, -4F, 2, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 408
		barrelModel[3].setRotationPoint(-25.5F, -53F, 0F);

		barrelModel[4].addShapeBox(-1F, -1F, 1F, 4, 3, 2, 0F, 6F, 2F, 0F, 6F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		barrelModel[4].setRotationPoint(-15F, -37F, 13F);

		barrelModel[5].addShapeBox(-7F, -3F, -1F, 18, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 414
		barrelModel[5].setRotationPoint(-15F, -37F, 13F);

		barrelModel[6].addShapeBox(-7F, 2F, -1F, 18, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, -5F, -0.5F, 0F, -7F, -0.5F, 0F, -5F, -0.5F, 0F); // Box 415
		barrelModel[6].setRotationPoint(-15F, -37F, 13F);

		barrelModel[7].addShapeBox(-7F, -5F, -1F, 18, 2, 2, 0F, -3F, -0.5F, 0F, -5F, -0.5F, 0F, -7F, -0.5F, 0F, -5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 416
		barrelModel[7].setRotationPoint(-15F, -37F, 13F);

		barrelModel[8].addShapeBox(11F, -3F, -1F, 7, 5, 2, 0F, 0F, 0F, -0.5F, 0F, -1.75F, -0.5F, 0F, -1.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.75F, -0.5F, 0F, -1.75F, -0.5F, 0F, 0F, -0.5F); // Box 417
		barrelModel[8].setRotationPoint(-15F, -37F, 13F);

		barrelModel[9].addShapeBox(18F, -1F, -0.5F, 36, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
		barrelModel[9].setRotationPoint(-15F, -37F, 13F);

		barrelModel[10].addShapeBox(54F, -1F, -0.5F, 7, 1, 1, 0F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F); // Box 419
		barrelModel[10].setRotationPoint(-15F, -37F, 13F);

		barrelModel[11].addShapeBox(-1F, -1F, -3F, 4, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 2F, 0F, 6F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 2F, 0F, 0F); // Box 420
		barrelModel[11].setRotationPoint(-15F, -37F, -13F);

		barrelModel[12].addShapeBox(-7F, -3F, -1F, 18, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421
		barrelModel[12].setRotationPoint(-15F, -37F, -13F);

		barrelModel[13].addShapeBox(-7F, 2F, -1F, 18, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -0.5F, 0F, -7F, -0.5F, 0F, -5F, -0.5F, 0F, -3F, -0.5F, 0F); // Box 422
		barrelModel[13].setRotationPoint(-15F, -37F, -13F);

		barrelModel[14].addShapeBox(-7F, -5F, -1F, 18, 2, 2, 0F, -5F, -0.5F, 0F, -7F, -0.5F, 0F, -5F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		barrelModel[14].setRotationPoint(-15F, -37F, -13F);

		barrelModel[15].addShapeBox(11F, -3F, -1F, 7, 5, 2, 0F, 0F, 0F, -0.5F, 0F, -1.75F, -0.5F, 0F, -1.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.75F, -0.5F, 0F, -1.75F, -0.5F, 0F, 0F, -0.5F); // Box 424
		barrelModel[15].setRotationPoint(-15F, -37F, -13F);

		barrelModel[16].addShapeBox(18F, -1F, -0.5F, 36, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		barrelModel[16].setRotationPoint(-15F, -37F, -13F);

		barrelModel[17].addShapeBox(54F, -1F, -0.5F, 7, 1, 1, 0F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F); // Box 426
		barrelModel[17].setRotationPoint(-15F, -37F, -13F);


		leftTrackWheelModels = new ModelRendererTurbo[85];
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 277, 2, textureX, textureY); // Import WeelL10
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 277, 2, textureX, textureY); // Import WeelL11
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 203, 3, textureX, textureY); // Import WeelL12
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 203, 19, textureX, textureY); // Import WeelL13
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 203, 34, textureX, textureY); // Import WeelL14
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WeelL15
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WeelL16
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WeelL17
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WeelL18
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WeelL19
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WeelL20
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WeelL21
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WeelL22
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 203, 3, textureX, textureY); // Import WeelL23
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 203, 19, textureX, textureY); // Import WeelL24
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 203, 34, textureX, textureY); // Import WeelL25
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WeelL26
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WeelL27
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WeelL28
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WeelL30
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WeelL31
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WeelL32
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WeelL33
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 203, 3, textureX, textureY); // Import WeelL34
		leftTrackWheelModels[24] = new ModelRendererTurbo(this, 203, 19, textureX, textureY); // Import WeelL35
		leftTrackWheelModels[25] = new ModelRendererTurbo(this, 203, 34, textureX, textureY); // Import WeelL36
		leftTrackWheelModels[26] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WeelL37
		leftTrackWheelModels[27] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WeelL38
		leftTrackWheelModels[28] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WeelL39
		leftTrackWheelModels[29] = new ModelRendererTurbo(this, 277, 2, textureX, textureY); // Import WeelL4
		leftTrackWheelModels[30] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WeelL40
		leftTrackWheelModels[31] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WeelL41
		leftTrackWheelModels[32] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WeelL42
		leftTrackWheelModels[33] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WeelL43
		leftTrackWheelModels[34] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WeelL44
		leftTrackWheelModels[35] = new ModelRendererTurbo(this, 203, 3, textureX, textureY); // Import WeelL45
		leftTrackWheelModels[36] = new ModelRendererTurbo(this, 203, 19, textureX, textureY); // Import WeelL46
		leftTrackWheelModels[37] = new ModelRendererTurbo(this, 203, 34, textureX, textureY); // Import WeelL47
		leftTrackWheelModels[38] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WeelL48
		leftTrackWheelModels[39] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WeelL49
		leftTrackWheelModels[40] = new ModelRendererTurbo(this, 277, 2, textureX, textureY); // Import WeelL5
		leftTrackWheelModels[41] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WeelL50
		leftTrackWheelModels[42] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WeelL51
		leftTrackWheelModels[43] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WeelL52
		leftTrackWheelModels[44] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WeelL53
		leftTrackWheelModels[45] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WeelL54
		leftTrackWheelModels[46] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WeelL55
		leftTrackWheelModels[47] = new ModelRendererTurbo(this, 203, 3, textureX, textureY); // Import WeelL56
		leftTrackWheelModels[48] = new ModelRendererTurbo(this, 203, 19, textureX, textureY); // Import WeelL57
		leftTrackWheelModels[49] = new ModelRendererTurbo(this, 203, 34, textureX, textureY); // Import WeelL58
		leftTrackWheelModels[50] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WeelL59
		leftTrackWheelModels[51] = new ModelRendererTurbo(this, 277, 2, textureX, textureY); // Import WeelL6
		leftTrackWheelModels[52] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WeelL60
		leftTrackWheelModels[53] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WeelL61
		leftTrackWheelModels[54] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WeelL62
		leftTrackWheelModels[55] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WeelL63
		leftTrackWheelModels[56] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WeelL64
		leftTrackWheelModels[57] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WeelL65
		leftTrackWheelModels[58] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WeelL66
		leftTrackWheelModels[59] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WeelL67
		leftTrackWheelModels[60] = new ModelRendererTurbo(this, 347, 18, textureX, textureY); // Import WeelL68
		leftTrackWheelModels[61] = new ModelRendererTurbo(this, 347, 7, textureX, textureY); // Import WeelL69
		leftTrackWheelModels[62] = new ModelRendererTurbo(this, 277, 2, textureX, textureY); // Import WeelL7
		leftTrackWheelModels[63] = new ModelRendererTurbo(this, 350, 45, textureX, textureY); // Import WeelL70
		leftTrackWheelModels[64] = new ModelRendererTurbo(this, 350, 45, textureX, textureY); // Import WeelL71
		leftTrackWheelModels[65] = new ModelRendererTurbo(this, 350, 45, textureX, textureY); // Import WeelL72
		leftTrackWheelModels[66] = new ModelRendererTurbo(this, 350, 45, textureX, textureY); // Import WeelL73
		leftTrackWheelModels[67] = new ModelRendererTurbo(this, 350, 45, textureX, textureY); // Import WeelL74
		leftTrackWheelModels[68] = new ModelRendererTurbo(this, 350, 45, textureX, textureY); // Import WeelL75
		leftTrackWheelModels[69] = new ModelRendererTurbo(this, 350, 45, textureX, textureY); // Import WeelL76
		leftTrackWheelModels[70] = new ModelRendererTurbo(this, 350, 45, textureX, textureY); // Import WeelL77
		leftTrackWheelModels[71] = new ModelRendererTurbo(this, 350, 45, textureX, textureY); // Import WeelL78
		leftTrackWheelModels[72] = new ModelRendererTurbo(this, 350, 45, textureX, textureY); // Import WeelL79
		leftTrackWheelModels[73] = new ModelRendererTurbo(this, 351, 61, textureX, textureY); // Import WeelL80
		leftTrackWheelModels[74] = new ModelRendererTurbo(this, 350, 59, textureX, textureY); // Import WeelL81
		leftTrackWheelModels[75] = new ModelRendererTurbo(this, 351, 62, textureX, textureY); // Import WeelL82
		leftTrackWheelModels[76] = new ModelRendererTurbo(this, 351, 61, textureX, textureY); // Import WeelL83
		leftTrackWheelModels[77] = new ModelRendererTurbo(this, 351, 60, textureX, textureY); // Import WeelL84
		leftTrackWheelModels[78] = new ModelRendererTurbo(this, 350, 45, textureX, textureY); // Import WeelL85
		leftTrackWheelModels[79] = new ModelRendererTurbo(this, 347, 30, textureX, textureY); // Import WeelL86
		leftTrackWheelModels[80] = new ModelRendererTurbo(this, 277, 2, textureX, textureY); // Import WeelL9
		leftTrackWheelModels[81] = new ModelRendererTurbo(this, 277, 2, textureX, textureY); // Import WeelLh
		leftTrackWheelModels[82] = new ModelRendererTurbo(this, 277, 7, textureX, textureY); // Import WheelL1
		leftTrackWheelModels[83] = new ModelRendererTurbo(this, 277, 19, textureX, textureY); // Import WheelL2
		leftTrackWheelModels[84] = new ModelRendererTurbo(this, 277, 35, textureX, textureY); // Import WheelL3

		leftTrackWheelModels[0].addBox(-4F, -2F, -2F, 1, 4, 1, 0F); // Import WeelL10
		leftTrackWheelModels[0].setRotationPoint(31F, -16F, 25F);

		leftTrackWheelModels[1].addShapeBox(-4F, -4F, -2F, 5, 2, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import WeelL11
		leftTrackWheelModels[1].setRotationPoint(31F, -16F, 25F);

		leftTrackWheelModels[2].addShapeBox(-6F, -6F, -7F, 12, 4, 6, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WeelL12
		leftTrackWheelModels[2].setRotationPoint(17F, -11F, 24F);

		leftTrackWheelModels[3].addBox(-6F, -2F, -7F, 12, 4, 6, 0F); // Import WeelL13
		leftTrackWheelModels[3].setRotationPoint(17F, -11F, 24F);

		leftTrackWheelModels[4].addShapeBox(-6F, 2F, -7F, 12, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import WeelL14
		leftTrackWheelModels[4].setRotationPoint(17F, -11F, 24F);

		leftTrackWheelModels[5].addShapeBox(-3F, -6F, -1F, 9, 4, 1, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Import WeelL15
		leftTrackWheelModels[5].setRotationPoint(17F, -11F, 24F);

		leftTrackWheelModels[6].addBox(5F, -2F, -1F, 1, 4, 1, 0F); // Import WeelL16
		leftTrackWheelModels[6].setRotationPoint(17F, -11F, 24F);

		leftTrackWheelModels[7].addShapeBox(1F, 2F, -1F, 5, 4, 1, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import WeelL17
		leftTrackWheelModels[7].setRotationPoint(17F, -11F, 24F);

		leftTrackWheelModels[8].addBox(-2F, 5F, -1F, 4, 1, 1, 0F); // Import WeelL18
		leftTrackWheelModels[8].setRotationPoint(17F, -11F, 24F);

		leftTrackWheelModels[9].addBox(-2F, -6F, -1F, 4, 1, 1, 0F); // Import WeelL19
		leftTrackWheelModels[9].setRotationPoint(17F, -11F, 24F);

		leftTrackWheelModels[10].addShapeBox(-6F, -6F, -1F, 5, 4, 1, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import WeelL20
		leftTrackWheelModels[10].setRotationPoint(17F, -11F, 24F);

		leftTrackWheelModels[11].addBox(-6F, -2F, -1F, 1, 4, 1, 0F); // Import WeelL21
		leftTrackWheelModels[11].setRotationPoint(17F, -11F, 24F);

		leftTrackWheelModels[12].addShapeBox(-10F, 2F, -1F, 9, 4, 1, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Import WeelL22
		leftTrackWheelModels[12].setRotationPoint(17F, -11F, 24F);

		leftTrackWheelModels[13].addShapeBox(-6F, -6F, -7F, 12, 4, 6, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WeelL23
		leftTrackWheelModels[13].setRotationPoint(2F, -11F, 24F);

		leftTrackWheelModels[14].addBox(-6F, -2F, -7F, 12, 4, 6, 0F); // Import WeelL24
		leftTrackWheelModels[14].setRotationPoint(2F, -11F, 24F);

		leftTrackWheelModels[15].addShapeBox(-6F, 2F, -7F, 12, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import WeelL25
		leftTrackWheelModels[15].setRotationPoint(2F, -11F, 24F);

		leftTrackWheelModels[16].addBox(-2F, -6F, -1F, 4, 1, 1, 0F); // Import WeelL26
		leftTrackWheelModels[16].setRotationPoint(2F, -11F, 24F);

		leftTrackWheelModels[17].addShapeBox(-3F, -6F, -1F, 9, 4, 1, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Import WeelL27
		leftTrackWheelModels[17].setRotationPoint(2F, -11F, 24F);

		leftTrackWheelModels[18].addBox(5F, -2F, -1F, 1, 4, 1, 0F); // Import WeelL28
		leftTrackWheelModels[18].setRotationPoint(2F, -11F, 24F);

		leftTrackWheelModels[19].addBox(-2F, 5F, -1F, 4, 1, 1, 0F); // Import WeelL30
		leftTrackWheelModels[19].setRotationPoint(2F, -11F, 24F);

		leftTrackWheelModels[20].addShapeBox(-10F, 2F, -1F, 9, 4, 1, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Import WeelL31
		leftTrackWheelModels[20].setRotationPoint(2F, -11F, 24F);

		leftTrackWheelModels[21].addBox(-6F, -2F, -1F, 1, 4, 1, 0F); // Import WeelL32
		leftTrackWheelModels[21].setRotationPoint(2F, -11F, 24F);

		leftTrackWheelModels[22].addShapeBox(-6F, -6F, -1F, 5, 4, 1, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import WeelL33
		leftTrackWheelModels[22].setRotationPoint(2F, -11F, 24F);

		leftTrackWheelModels[23].addShapeBox(-6F, -6F, -7F, 12, 4, 6, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WeelL34
		leftTrackWheelModels[23].setRotationPoint(-13F, -11F, 24F);

		leftTrackWheelModels[24].addBox(-6F, -2F, -7F, 12, 4, 6, 0F); // Import WeelL35
		leftTrackWheelModels[24].setRotationPoint(-13F, -11F, 24F);

		leftTrackWheelModels[25].addShapeBox(-6F, 2F, -7F, 12, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import WeelL36
		leftTrackWheelModels[25].setRotationPoint(-13F, -11F, 24F);

		leftTrackWheelModels[26].addShapeBox(-3F, -6F, -1F, 9, 4, 1, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Import WeelL37
		leftTrackWheelModels[26].setRotationPoint(-13F, -11F, 24F);

		leftTrackWheelModels[27].addBox(-2F, -6F, -1F, 4, 1, 1, 0F); // Import WeelL38
		leftTrackWheelModels[27].setRotationPoint(-13F, -11F, 24F);

		leftTrackWheelModels[28].addShapeBox(-6F, -6F, -1F, 5, 4, 1, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import WeelL39
		leftTrackWheelModels[28].setRotationPoint(-13F, -11F, 24F);

		leftTrackWheelModels[29].addBox(-2F, -4F, -2F, 4, 1, 1, 0F); // Import WeelL4
		leftTrackWheelModels[29].setRotationPoint(31F, -16F, 25F);

		leftTrackWheelModels[30].addBox(-6F, -2F, -1F, 1, 4, 1, 0F); // Import WeelL40
		leftTrackWheelModels[30].setRotationPoint(-13F, -11F, 24F);

		leftTrackWheelModels[31].addBox(5F, -2F, -1F, 1, 4, 1, 0F); // Import WeelL41
		leftTrackWheelModels[31].setRotationPoint(-13F, -11F, 24F);

		leftTrackWheelModels[32].addShapeBox(1F, 2F, -1F, 5, 4, 1, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import WeelL42
		leftTrackWheelModels[32].setRotationPoint(-13F, -11F, 24F);

		leftTrackWheelModels[33].addBox(-2F, 5F, -1F, 4, 1, 1, 0F); // Import WeelL43
		leftTrackWheelModels[33].setRotationPoint(-13F, -11F, 24F);

		leftTrackWheelModels[34].addShapeBox(-10F, 2F, -1F, 9, 4, 1, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Import WeelL44
		leftTrackWheelModels[34].setRotationPoint(-13F, -11F, 24F);

		leftTrackWheelModels[35].addShapeBox(-6F, -6F, -7F, 12, 4, 6, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WeelL45
		leftTrackWheelModels[35].setRotationPoint(-28F, -11F, 24F);

		leftTrackWheelModels[36].addBox(-6F, -2F, -7F, 12, 4, 6, 0F); // Import WeelL46
		leftTrackWheelModels[36].setRotationPoint(-28F, -11F, 24F);

		leftTrackWheelModels[37].addShapeBox(-6F, 2F, -7F, 12, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import WeelL47
		leftTrackWheelModels[37].setRotationPoint(-28F, -11F, 24F);

		leftTrackWheelModels[38].addBox(-2F, -6F, -1F, 4, 1, 1, 0F); // Import WeelL48
		leftTrackWheelModels[38].setRotationPoint(-28F, -11F, 24F);

		leftTrackWheelModels[39].addShapeBox(-3F, -6F, -1F, 9, 4, 1, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Import WeelL49
		leftTrackWheelModels[39].setRotationPoint(-28F, -11F, 24F);

		leftTrackWheelModels[40].addShapeBox(-1F, -4F, -2F, 5, 2, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Import WeelL5
		leftTrackWheelModels[40].setRotationPoint(31F, -16F, 25F);

		leftTrackWheelModels[41].addBox(5F, -2F, -1F, 1, 4, 1, 0F); // Import WeelL50
		leftTrackWheelModels[41].setRotationPoint(-28F, -11F, 24F);

		leftTrackWheelModels[42].addShapeBox(1F, 2F, -1F, 5, 4, 1, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import WeelL51
		leftTrackWheelModels[42].setRotationPoint(-28F, -11F, 24F);

		leftTrackWheelModels[43].addBox(-2F, 5F, -1F, 4, 1, 1, 0F); // Import WeelL52
		leftTrackWheelModels[43].setRotationPoint(-28F, -11F, 24F);

		leftTrackWheelModels[44].addShapeBox(-10F, 2F, -1F, 9, 4, 1, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Import WeelL53
		leftTrackWheelModels[44].setRotationPoint(-28F, -11F, 24F);

		leftTrackWheelModels[45].addBox(-6F, -2F, -1F, 1, 4, 1, 0F); // Import WeelL54
		leftTrackWheelModels[45].setRotationPoint(-28F, -11F, 24F);

		leftTrackWheelModels[46].addShapeBox(-6F, -6F, -1F, 5, 4, 1, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import WeelL55
		leftTrackWheelModels[46].setRotationPoint(-28F, -11F, 24F);

		leftTrackWheelModels[47].addShapeBox(-6F, -6F, -7F, 12, 4, 6, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WeelL56
		leftTrackWheelModels[47].setRotationPoint(-43F, -11F, 24F);

		leftTrackWheelModels[48].addBox(-6F, -2F, -7F, 12, 4, 6, 0F); // Import WeelL57
		leftTrackWheelModels[48].setRotationPoint(-43F, -11F, 24F);

		leftTrackWheelModels[49].addShapeBox(-6F, 2F, -7F, 12, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import WeelL58
		leftTrackWheelModels[49].setRotationPoint(-43F, -11F, 24F);

		leftTrackWheelModels[50].addBox(-2F, -6F, -1F, 4, 1, 1, 0F); // Import WeelL59
		leftTrackWheelModels[50].setRotationPoint(-43F, -11F, 24F);

		leftTrackWheelModels[51].addBox(3F, -2F, -2F, 1, 4, 1, 0F); // Import WeelL6
		leftTrackWheelModels[51].setRotationPoint(31F, -16F, 25F);

		leftTrackWheelModels[52].addShapeBox(-3F, -6F, -1F, 9, 4, 1, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Import WeelL60
		leftTrackWheelModels[52].setRotationPoint(-43F, -11F, 24F);

		leftTrackWheelModels[53].addBox(5F, -2F, -1F, 1, 4, 1, 0F); // Import WeelL61
		leftTrackWheelModels[53].setRotationPoint(-43F, -11F, 24F);

		leftTrackWheelModels[54].addShapeBox(1F, 2F, -1F, 5, 4, 1, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import WeelL62
		leftTrackWheelModels[54].setRotationPoint(-43F, -11F, 24F);

		leftTrackWheelModels[55].addBox(-2F, 5F, -1F, 4, 1, 1, 0F); // Import WeelL63
		leftTrackWheelModels[55].setRotationPoint(-43F, -11F, 24F);

		leftTrackWheelModels[56].addShapeBox(-10F, 2F, -1F, 9, 4, 1, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Import WeelL64
		leftTrackWheelModels[56].setRotationPoint(-43F, -11F, 24F);

		leftTrackWheelModels[57].addBox(-6F, -2F, -1F, 1, 4, 1, 0F); // Import WeelL65
		leftTrackWheelModels[57].setRotationPoint(-43F, -11F, 24F);

		leftTrackWheelModels[58].addShapeBox(-6F, -6F, -1F, 5, 4, 1, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import WeelL66
		leftTrackWheelModels[58].setRotationPoint(-43F, -11F, 24F);

		leftTrackWheelModels[59].addShapeBox(1F, 2F, -1F, 5, 4, 1, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import WeelL67
		leftTrackWheelModels[59].setRotationPoint(2F, -11F, 24F);

		leftTrackWheelModels[60].addBox(-3F, -1F, -10F, 6, 2, 5, 0F); // Import WeelL68
		leftTrackWheelModels[60].setRotationPoint(-57F, -15F, 27F);

		leftTrackWheelModels[61].addShapeBox(-3F, -3F, -10F, 6, 2, 5, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WeelL69
		leftTrackWheelModels[61].setRotationPoint(-57F, -15F, 27F);

		leftTrackWheelModels[62].addShapeBox(1F, 2F, -2F, 5, 2, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import WeelL7
		leftTrackWheelModels[62].setRotationPoint(31F, -16F, 25F);

		leftTrackWheelModels[63].addBox(2F, -1F, -5F, 1, 2, 2, 0F); // Import WeelL70
		leftTrackWheelModels[63].setRotationPoint(-57F, -15F, 27F);

		leftTrackWheelModels[64].addShapeBox(-2F, -3F, -5F, 5, 2, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Import WeelL71
		leftTrackWheelModels[64].setRotationPoint(-57F, -15F, 27F);

		leftTrackWheelModels[65].addBox(-1F, -3F, -5F, 2, 1, 2, 0F); // Import WeelL72
		leftTrackWheelModels[65].setRotationPoint(-57F, -15F, 27F);

		leftTrackWheelModels[66].addShapeBox(-3F, -3F, -5F, 5, 2, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import WeelL73
		leftTrackWheelModels[66].setRotationPoint(-57F, -15F, 27F);

		leftTrackWheelModels[67].addBox(-3F, -1F, -5F, 1, 2, 2, 0F); // Import WeelL74
		leftTrackWheelModels[67].setRotationPoint(-57F, -15F, 27F);

		leftTrackWheelModels[68].addShapeBox(-5F, 1F, -5F, 5, 2, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Import WeelL75
		leftTrackWheelModels[68].setRotationPoint(-57F, -15F, 27F);

		leftTrackWheelModels[69].addBox(-1F, 2F, -5F, 2, 1, 2, 0F); // Import WeelL76
		leftTrackWheelModels[69].setRotationPoint(-57F, -15F, 27F);

		leftTrackWheelModels[70].addBox(-0.5F, -4F, -10F, 1, 1, 7, 0F); // Import WeelL77
		leftTrackWheelModels[70].setRotationPoint(-57F, -15F, 27F);

		leftTrackWheelModels[71].addBox(-0.5F, -3.8F, -10F, 1, 1, 7, 0F); // Import WeelL78
		leftTrackWheelModels[71].setRotationPoint(-57F, -15F, 27F);
		leftTrackWheelModels[71].rotateAngleZ = -0.78539816F;

		leftTrackWheelModels[72].addBox(3F, -0.5F, -10F, 1, 1, 7, 0F); // Import WeelL79
		leftTrackWheelModels[72].setRotationPoint(-57F, -15F, 27F);

		leftTrackWheelModels[73].addBox(2.8F, -0.5F, -10F, 1, 1, 7, 0F); // Import WeelL80
		leftTrackWheelModels[73].setRotationPoint(-57F, -15F, 27F);
		leftTrackWheelModels[73].rotateAngleZ = -0.78539816F;

		leftTrackWheelModels[74].addBox(-0.5F, 3F, -10F, 1, 1, 7, 0F); // Import WeelL81
		leftTrackWheelModels[74].setRotationPoint(-57F, -15F, 27F);

		leftTrackWheelModels[75].addBox(-0.5F, 2.8F, -10F, 1, 1, 7, 0F); // Import WeelL82
		leftTrackWheelModels[75].setRotationPoint(-57F, -15F, 27F);
		leftTrackWheelModels[75].rotateAngleZ = -0.78539816F;

		leftTrackWheelModels[76].addBox(-4F, -0.5F, -10F, 1, 1, 7, 0F); // Import WeelL83
		leftTrackWheelModels[76].setRotationPoint(-57F, -15F, 27F);

		leftTrackWheelModels[77].addBox(-3.8F, -0.5F, -10F, 1, 1, 7, 0F); // Import WeelL84
		leftTrackWheelModels[77].setRotationPoint(-57F, -15F, 27F);
		leftTrackWheelModels[77].rotateAngleZ = -0.78539816F;

		leftTrackWheelModels[78].addShapeBox(0F, 1F, -5F, 5, 2, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import WeelL85
		leftTrackWheelModels[78].setRotationPoint(-57F, -15F, 27F);

		leftTrackWheelModels[79].addShapeBox(-3F, 1F, -10F, 6, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import WeelL86
		leftTrackWheelModels[79].setRotationPoint(-57F, -15F, 27F);

		leftTrackWheelModels[80].addShapeBox(-6F, 2F, -2F, 5, 2, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Import WeelL9
		leftTrackWheelModels[80].setRotationPoint(31F, -16F, 25F);

		leftTrackWheelModels[81].addBox(-2F, 3F, -2F, 4, 1, 1, 0F); // Import WeelLh
		leftTrackWheelModels[81].setRotationPoint(31F, -16F, 25F);

		leftTrackWheelModels[82].addShapeBox(-4F, -4F, -8F, 8, 2, 6, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheelL1
		leftTrackWheelModels[82].setRotationPoint(31F, -16F, 25F);

		leftTrackWheelModels[83].addBox(-4F, -2F, -8F, 8, 4, 6, 0F); // Import WheelL2
		leftTrackWheelModels[83].setRotationPoint(31F, -16F, 25F);

		leftTrackWheelModels[84].addShapeBox(-4F, 2F, -8F, 8, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import WheelL3
		leftTrackWheelModels[84].setRotationPoint(31F, -16F, 25F);


		rightTrackWheelModels = new ModelRendererTurbo[85];
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 277, 7, textureX, textureY); // Import WheelR1
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 277, 2, textureX, textureY); // Import WheelR10
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 277, 2, textureX, textureY); // Import WheelR11
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 203, 3, textureX, textureY); // Import WheelR12
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 203, 19, textureX, textureY); // Import WheelR13
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 203, 34, textureX, textureY); // Import WheelR14
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WheelR15
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WheelR16
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WheelR17
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WheelR18
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WheelR19
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 277, 19, textureX, textureY); // Import WheelR2
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WheelR20
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WheelR21
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WheelR22
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 203, 3, textureX, textureY); // Import WheelR23
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 203, 19, textureX, textureY); // Import WheelR24
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 203, 34, textureX, textureY); // Import WheelR25
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WheelR26
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WheelR27
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WheelR28
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WheelR29
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 277, 35, textureX, textureY); // Import WheelR3
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WheelR30
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WheelR31
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WheelR32
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WheelR33
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WheelR34
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WheelR35
		rightTrackWheelModels[29] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WheelR36
		rightTrackWheelModels[30] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WheelR37
		rightTrackWheelModels[31] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WheelR38
		rightTrackWheelModels[32] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WheelR39
		rightTrackWheelModels[33] = new ModelRendererTurbo(this, 277, 2, textureX, textureY); // Import WheelR4
		rightTrackWheelModels[34] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WheelR40
		rightTrackWheelModels[35] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WheelR41
		rightTrackWheelModels[36] = new ModelRendererTurbo(this, 203, 3, textureX, textureY); // Import WheelR42
		rightTrackWheelModels[37] = new ModelRendererTurbo(this, 203, 19, textureX, textureY); // Import WheelR43
		rightTrackWheelModels[38] = new ModelRendererTurbo(this, 203, 34, textureX, textureY); // Import WheelR44
		rightTrackWheelModels[39] = new ModelRendererTurbo(this, 203, 3, textureX, textureY); // Import WheelR45
		rightTrackWheelModels[40] = new ModelRendererTurbo(this, 203, 19, textureX, textureY); // Import WheelR46
		rightTrackWheelModels[41] = new ModelRendererTurbo(this, 203, 34, textureX, textureY); // Import WheelR47
		rightTrackWheelModels[42] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WheelR48
		rightTrackWheelModels[43] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WheelR49
		rightTrackWheelModels[44] = new ModelRendererTurbo(this, 277, 2, textureX, textureY); // Import WheelR5
		rightTrackWheelModels[45] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WheelR50
		rightTrackWheelModels[46] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WheelR51
		rightTrackWheelModels[47] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WheelR52
		rightTrackWheelModels[48] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WheelR53
		rightTrackWheelModels[49] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WheelR54
		rightTrackWheelModels[50] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WheelR55
		rightTrackWheelModels[51] = new ModelRendererTurbo(this, 203, 34, textureX, textureY); // Import WheelR56
		rightTrackWheelModels[52] = new ModelRendererTurbo(this, 203, 19, textureX, textureY); // Import WheelR57
		rightTrackWheelModels[53] = new ModelRendererTurbo(this, 203, 3, textureX, textureY); // Import WheelR58
		rightTrackWheelModels[54] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WheelR59
		rightTrackWheelModels[55] = new ModelRendererTurbo(this, 277, 2, textureX, textureY); // Import WheelR6
		rightTrackWheelModels[56] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WheelR60
		rightTrackWheelModels[57] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WheelR61
		rightTrackWheelModels[58] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WheelR62
		rightTrackWheelModels[59] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WheelR63
		rightTrackWheelModels[60] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WheelR64
		rightTrackWheelModels[61] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WheelR65
		rightTrackWheelModels[62] = new ModelRendererTurbo(this, 176, 5, textureX, textureY); // Import WheelR66
		rightTrackWheelModels[63] = new ModelRendererTurbo(this, 347, 7, textureX, textureY); // Import WheelR67
		rightTrackWheelModels[64] = new ModelRendererTurbo(this, 347, 18, textureX, textureY); // Import WheelR68
		rightTrackWheelModels[65] = new ModelRendererTurbo(this, 347, 30, textureX, textureY); // Import WheelR69
		rightTrackWheelModels[66] = new ModelRendererTurbo(this, 277, 2, textureX, textureY); // Import WheelR7
		rightTrackWheelModels[67] = new ModelRendererTurbo(this, 350, 45, textureX, textureY); // Import WheelR70
		rightTrackWheelModels[68] = new ModelRendererTurbo(this, 350, 45, textureX, textureY); // Import WheelR71
		rightTrackWheelModels[69] = new ModelRendererTurbo(this, 350, 45, textureX, textureY); // Import WheelR72
		rightTrackWheelModels[70] = new ModelRendererTurbo(this, 350, 45, textureX, textureY); // Import WheelR73
		rightTrackWheelModels[71] = new ModelRendererTurbo(this, 350, 45, textureX, textureY); // Import WheelR74
		rightTrackWheelModels[72] = new ModelRendererTurbo(this, 350, 45, textureX, textureY); // Import WheelR75
		rightTrackWheelModels[73] = new ModelRendererTurbo(this, 350, 45, textureX, textureY); // Import WheelR76
		rightTrackWheelModels[74] = new ModelRendererTurbo(this, 350, 45, textureX, textureY); // Import WheelR77
		rightTrackWheelModels[75] = new ModelRendererTurbo(this, 350, 60, textureX, textureY); // Import WheelR78
		rightTrackWheelModels[76] = new ModelRendererTurbo(this, 350, 60, textureX, textureY); // Import WheelR79
		rightTrackWheelModels[77] = new ModelRendererTurbo(this, 277, 2, textureX, textureY); // Import WheelR8
		rightTrackWheelModels[78] = new ModelRendererTurbo(this, 351, 60, textureX, textureY); // Import WheelR80
		rightTrackWheelModels[79] = new ModelRendererTurbo(this, 351, 61, textureX, textureY); // Import WheelR81
		rightTrackWheelModels[80] = new ModelRendererTurbo(this, 350, 61, textureX, textureY); // Import WheelR82
		rightTrackWheelModels[81] = new ModelRendererTurbo(this, 351, 61, textureX, textureY); // Import WheelR83
		rightTrackWheelModels[82] = new ModelRendererTurbo(this, 350, 60, textureX, textureY); // Import WheelR84
		rightTrackWheelModels[83] = new ModelRendererTurbo(this, 350, 60, textureX, textureY); // Import WheelR85
		rightTrackWheelModels[84] = new ModelRendererTurbo(this, 277, 2, textureX, textureY); // Import WheelR9

		rightTrackWheelModels[0].addShapeBox(-4F, -4F, 1F, 8, 2, 6, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheelR1
		rightTrackWheelModels[0].setRotationPoint(31F, -16F, -24F);

		rightTrackWheelModels[1].addBox(-4F, -2F, 0F, 1, 4, 1, 0F); // Import WheelR10
		rightTrackWheelModels[1].setRotationPoint(31F, -16F, -24F);

		rightTrackWheelModels[2].addShapeBox(-4F, -4F, 0F, 5, 2, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import WheelR11
		rightTrackWheelModels[2].setRotationPoint(31F, -16F, -24F);

		rightTrackWheelModels[3].addShapeBox(-6F, -6F, 2F, 12, 4, 6, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheelR12
		rightTrackWheelModels[3].setRotationPoint(17F, -11F, -25F);

		rightTrackWheelModels[4].addBox(-6F, -2F, 2F, 12, 4, 6, 0F); // Import WheelR13
		rightTrackWheelModels[4].setRotationPoint(17F, -11F, -25F);

		rightTrackWheelModels[5].addShapeBox(-6F, 2F, 2F, 12, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import WheelR14
		rightTrackWheelModels[5].setRotationPoint(17F, -11F, -25F);

		rightTrackWheelModels[6].addBox(-2F, -6F, 1F, 4, 1, 1, 0F); // Import WheelR15
		rightTrackWheelModels[6].setRotationPoint(17F, -11F, -25F);

		rightTrackWheelModels[7].addShapeBox(-3F, -6F, 1F, 9, 4, 1, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Import WheelR16
		rightTrackWheelModels[7].setRotationPoint(17F, -11F, -25F);

		rightTrackWheelModels[8].addBox(5F, -2F, 1F, 1, 4, 1, 0F); // Import WheelR17
		rightTrackWheelModels[8].setRotationPoint(17F, -11F, -25F);

		rightTrackWheelModels[9].addShapeBox(1F, 2F, 1F, 5, 4, 1, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import WheelR18
		rightTrackWheelModels[9].setRotationPoint(17F, -11F, -25F);

		rightTrackWheelModels[10].addBox(-2F, 5F, 1F, 4, 1, 1, 0F); // Import WheelR19
		rightTrackWheelModels[10].setRotationPoint(17F, -11F, -25F);

		rightTrackWheelModels[11].addBox(-4F, -2F, 1F, 8, 4, 6, 0F); // Import WheelR2
		rightTrackWheelModels[11].setRotationPoint(31F, -16F, -24F);

		rightTrackWheelModels[12].addShapeBox(-10F, 2F, 1F, 9, 4, 1, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Import WheelR20
		rightTrackWheelModels[12].setRotationPoint(17F, -11F, -25F);

		rightTrackWheelModels[13].addBox(-6F, -2F, 1F, 1, 4, 1, 0F); // Import WheelR21
		rightTrackWheelModels[13].setRotationPoint(17F, -11F, -25F);

		rightTrackWheelModels[14].addShapeBox(-6F, -6F, 1F, 5, 4, 1, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import WheelR22
		rightTrackWheelModels[14].setRotationPoint(17F, -11F, -25F);

		rightTrackWheelModels[15].addShapeBox(-6F, -6F, 2F, 12, 4, 6, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheelR23
		rightTrackWheelModels[15].setRotationPoint(2F, -11F, -25F);

		rightTrackWheelModels[16].addBox(-6F, -2F, 2F, 12, 4, 6, 0F); // Import WheelR24
		rightTrackWheelModels[16].setRotationPoint(2F, -11F, -25F);

		rightTrackWheelModels[17].addShapeBox(-6F, 2F, 2F, 12, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import WheelR25
		rightTrackWheelModels[17].setRotationPoint(2F, -11F, -25F);

		rightTrackWheelModels[18].addBox(-2F, 5F, 1F, 4, 1, 1, 0F); // Import WheelR26
		rightTrackWheelModels[18].setRotationPoint(2F, -11F, -25F);

		rightTrackWheelModels[19].addShapeBox(-10F, 2F, 1F, 9, 4, 1, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Import WheelR27
		rightTrackWheelModels[19].setRotationPoint(2F, -11F, -25F);

		rightTrackWheelModels[20].addBox(-6F, -2F, 1F, 1, 4, 1, 0F); // Import WheelR28
		rightTrackWheelModels[20].setRotationPoint(2F, -11F, -25F);

		rightTrackWheelModels[21].addShapeBox(-6F, -6F, 1F, 5, 4, 1, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import WheelR29
		rightTrackWheelModels[21].setRotationPoint(2F, -11F, -25F);

		rightTrackWheelModels[22].addShapeBox(-4F, 2F, 1F, 8, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import WheelR3
		rightTrackWheelModels[22].setRotationPoint(31F, -16F, -24F);

		rightTrackWheelModels[23].addBox(-2F, -6F, 1F, 4, 1, 1, 0F); // Import WheelR30
		rightTrackWheelModels[23].setRotationPoint(2F, -11F, -25F);

		rightTrackWheelModels[24].addShapeBox(-3F, -6F, 1F, 9, 4, 1, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Import WheelR31
		rightTrackWheelModels[24].setRotationPoint(2F, -11F, -25F);

		rightTrackWheelModels[25].addBox(5F, -2F, 1F, 1, 4, 1, 0F); // Import WheelR32
		rightTrackWheelModels[25].setRotationPoint(2F, -11F, -25F);

		rightTrackWheelModels[26].addShapeBox(1F, 2F, 1F, 5, 4, 1, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import WheelR33
		rightTrackWheelModels[26].setRotationPoint(2F, -11F, -25F);

		rightTrackWheelModels[27].addShapeBox(1F, 2F, 1F, 5, 4, 1, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import WheelR34
		rightTrackWheelModels[27].setRotationPoint(-13F, -11F, -25F);

		rightTrackWheelModels[28].addBox(-2F, 5F, 1F, 4, 1, 1, 0F); // Import WheelR35
		rightTrackWheelModels[28].setRotationPoint(-13F, -11F, -25F);

		rightTrackWheelModels[29].addShapeBox(-10F, 2F, 1F, 9, 4, 1, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Import WheelR36
		rightTrackWheelModels[29].setRotationPoint(-13F, -11F, -25F);

		rightTrackWheelModels[30].addBox(-6F, -2F, 1F, 1, 4, 1, 0F); // Import WheelR37
		rightTrackWheelModels[30].setRotationPoint(-13F, -11F, -25F);

		rightTrackWheelModels[31].addShapeBox(-6F, -6F, 1F, 5, 4, 1, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import WheelR38
		rightTrackWheelModels[31].setRotationPoint(-13F, -11F, -25F);

		rightTrackWheelModels[32].addBox(-2F, -6F, 1F, 4, 1, 1, 0F); // Import WheelR39
		rightTrackWheelModels[32].setRotationPoint(-13F, -11F, -25F);

		rightTrackWheelModels[33].addBox(-2F, -4F, 0F, 4, 1, 1, 0F); // Import WheelR4
		rightTrackWheelModels[33].setRotationPoint(31F, -16F, -24F);

		rightTrackWheelModels[34].addShapeBox(-3F, -6F, 1F, 9, 4, 1, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Import WheelR40
		rightTrackWheelModels[34].setRotationPoint(-13F, -11F, -25F);

		rightTrackWheelModels[35].addBox(5F, -2F, 1F, 1, 4, 1, 0F); // Import WheelR41
		rightTrackWheelModels[35].setRotationPoint(-13F, -11F, -25F);

		rightTrackWheelModels[36].addShapeBox(-6F, -6F, 2F, 12, 4, 6, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheelR42
		rightTrackWheelModels[36].setRotationPoint(-13F, -11F, -25F);

		rightTrackWheelModels[37].addBox(-6F, -2F, 2F, 12, 4, 6, 0F); // Import WheelR43
		rightTrackWheelModels[37].setRotationPoint(-13F, -11F, -25F);

		rightTrackWheelModels[38].addShapeBox(-6F, 2F, 2F, 12, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import WheelR44
		rightTrackWheelModels[38].setRotationPoint(-13F, -11F, -25F);

		rightTrackWheelModels[39].addShapeBox(-6F, -6F, 2F, 12, 4, 6, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheelR45
		rightTrackWheelModels[39].setRotationPoint(-28F, -11F, -25F);

		rightTrackWheelModels[40].addBox(-6F, -2F, 2F, 12, 4, 6, 0F); // Import WheelR46
		rightTrackWheelModels[40].setRotationPoint(-28F, -11F, -25F);

		rightTrackWheelModels[41].addShapeBox(-6F, 2F, 2F, 12, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import WheelR47
		rightTrackWheelModels[41].setRotationPoint(-28F, -11F, -25F);

		rightTrackWheelModels[42].addBox(-6F, -2F, 1F, 1, 4, 1, 0F); // Import WheelR48
		rightTrackWheelModels[42].setRotationPoint(-28F, -11F, -25F);

		rightTrackWheelModels[43].addShapeBox(-6F, -6F, 1F, 5, 4, 1, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import WheelR49
		rightTrackWheelModels[43].setRotationPoint(-28F, -11F, -25F);

		rightTrackWheelModels[44].addShapeBox(-1F, -4F, 0F, 5, 2, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Import WheelR5
		rightTrackWheelModels[44].setRotationPoint(31F, -16F, -24F);

		rightTrackWheelModels[45].addBox(-2F, -6F, 1F, 4, 1, 1, 0F); // Import WheelR50
		rightTrackWheelModels[45].setRotationPoint(-28F, -11F, -25F);

		rightTrackWheelModels[46].addShapeBox(-3F, -6F, 1F, 9, 4, 1, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Import WheelR51
		rightTrackWheelModels[46].setRotationPoint(-28F, -11F, -25F);

		rightTrackWheelModels[47].addBox(5F, -2F, 1F, 1, 4, 1, 0F); // Import WheelR52
		rightTrackWheelModels[47].setRotationPoint(-28F, -11F, -25F);

		rightTrackWheelModels[48].addShapeBox(1F, 2F, 1F, 5, 4, 1, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import WheelR53
		rightTrackWheelModels[48].setRotationPoint(-28F, -11F, -25F);

		rightTrackWheelModels[49].addBox(-2F, 5F, 1F, 4, 1, 1, 0F); // Import WheelR54
		rightTrackWheelModels[49].setRotationPoint(-28F, -11F, -25F);

		rightTrackWheelModels[50].addShapeBox(-10F, 2F, 1F, 9, 4, 1, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Import WheelR55
		rightTrackWheelModels[50].setRotationPoint(-28F, -11F, -25F);

		rightTrackWheelModels[51].addShapeBox(-6F, 2F, 2F, 12, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import WheelR56
		rightTrackWheelModels[51].setRotationPoint(-43F, -11F, -25F);

		rightTrackWheelModels[52].addBox(-6F, -2F, 2F, 12, 4, 6, 0F); // Import WheelR57
		rightTrackWheelModels[52].setRotationPoint(-43F, -11F, -25F);

		rightTrackWheelModels[53].addShapeBox(-6F, -6F, 2F, 12, 4, 6, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheelR58
		rightTrackWheelModels[53].setRotationPoint(-43F, -11F, -25F);

		rightTrackWheelModels[54].addBox(-2F, -6F, 1F, 4, 1, 1, 0F); // Import WheelR59
		rightTrackWheelModels[54].setRotationPoint(-43F, -11F, -25F);

		rightTrackWheelModels[55].addBox(3F, -2F, 0F, 1, 4, 1, 0F); // Import WheelR6
		rightTrackWheelModels[55].setRotationPoint(31F, -16F, -24F);

		rightTrackWheelModels[56].addBox(-2F, 5F, 1F, 4, 1, 1, 0F); // Import WheelR60
		rightTrackWheelModels[56].setRotationPoint(-43F, -11F, -25F);

		rightTrackWheelModels[57].addBox(-6F, -2F, 1F, 1, 4, 1, 0F); // Import WheelR61
		rightTrackWheelModels[57].setRotationPoint(-43F, -11F, -25F);

		rightTrackWheelModels[58].addBox(5F, -2F, 1F, 1, 4, 1, 0F); // Import WheelR62
		rightTrackWheelModels[58].setRotationPoint(-43F, -11F, -25F);

		rightTrackWheelModels[59].addShapeBox(-6F, -6F, 1F, 5, 4, 1, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import WheelR63
		rightTrackWheelModels[59].setRotationPoint(-43F, -11F, -25F);

		rightTrackWheelModels[60].addShapeBox(-3F, -6F, 1F, 9, 4, 1, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Import WheelR64
		rightTrackWheelModels[60].setRotationPoint(-43F, -11F, -25F);

		rightTrackWheelModels[61].addShapeBox(-10F, 2F, 1F, 9, 4, 1, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Import WheelR65
		rightTrackWheelModels[61].setRotationPoint(-43F, -11F, -25F);

		rightTrackWheelModels[62].addShapeBox(1F, 2F, 1F, 5, 4, 1, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import WheelR66
		rightTrackWheelModels[62].setRotationPoint(-43F, -11F, -25F);

		rightTrackWheelModels[63].addShapeBox(-3F, -3F, 0F, 6, 2, 5, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheelR67
		rightTrackWheelModels[63].setRotationPoint(-57F, -15F, -22F);

		rightTrackWheelModels[64].addBox(-3F, -1F, 0F, 6, 2, 5, 0F); // Import WheelR68
		rightTrackWheelModels[64].setRotationPoint(-57F, -15F, -22F);

		rightTrackWheelModels[65].addShapeBox(-3F, 1F, 0F, 6, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import WheelR69
		rightTrackWheelModels[65].setRotationPoint(-57F, -15F, -22F);

		rightTrackWheelModels[66].addShapeBox(1F, 2F, 0F, 5, 2, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import WheelR7
		rightTrackWheelModels[66].setRotationPoint(31F, -16F, -24F);

		rightTrackWheelModels[67].addBox(-1F, -3F, -2F, 2, 1, 2, 0F); // Import WheelR70
		rightTrackWheelModels[67].setRotationPoint(-57F, -15F, -22F);

		rightTrackWheelModels[68].addBox(-1F, 2F, -2F, 2, 1, 2, 0F); // Import WheelR71
		rightTrackWheelModels[68].setRotationPoint(-57F, -15F, -22F);

		rightTrackWheelModels[69].addBox(2F, -1F, -2F, 1, 2, 2, 0F); // Import WheelR72
		rightTrackWheelModels[69].setRotationPoint(-57F, -15F, -22F);

		rightTrackWheelModels[70].addBox(-3F, -1F, -2F, 1, 2, 2, 0F); // Import WheelR73
		rightTrackWheelModels[70].setRotationPoint(-57F, -15F, -22F);

		rightTrackWheelModels[71].addShapeBox(-3F, -3F, -2F, 5, 2, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import WheelR74
		rightTrackWheelModels[71].setRotationPoint(-57F, -15F, -22F);

		rightTrackWheelModels[72].addShapeBox(-2F, -3F, -2F, 5, 2, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Import WheelR75
		rightTrackWheelModels[72].setRotationPoint(-57F, -15F, -22F);

		rightTrackWheelModels[73].addShapeBox(0F, 1F, -2F, 5, 2, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import WheelR76
		rightTrackWheelModels[73].setRotationPoint(-57F, -15F, -22F);

		rightTrackWheelModels[74].addShapeBox(-5F, 1F, -2F, 5, 2, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Import WheelR77
		rightTrackWheelModels[74].setRotationPoint(-57F, -15F, -22F);

		rightTrackWheelModels[75].addBox(-0.5F, -4F, -2F, 1, 1, 7, 0F); // Import WheelR78
		rightTrackWheelModels[75].setRotationPoint(-57F, -15F, -22F);

		rightTrackWheelModels[76].addBox(-0.5F, 3F, -2F, 1, 1, 7, 0F); // Import WheelR79
		rightTrackWheelModels[76].setRotationPoint(-57F, -15F, -22F);

		rightTrackWheelModels[77].addBox(-2F, 3F, 0F, 4, 1, 1, 0F); // Import WheelR8
		rightTrackWheelModels[77].setRotationPoint(31F, -16F, -24F);

		rightTrackWheelModels[78].addBox(2.8F, -0.5F, -2F, 1, 1, 7, 0F); // Import WheelR80
		rightTrackWheelModels[78].setRotationPoint(-57F, -15F, -22F);
		rightTrackWheelModels[78].rotateAngleZ = -0.78539816F;

		rightTrackWheelModels[79].addBox(3F, -0.5F, -2F, 1, 1, 7, 0F); // Import WheelR81
		rightTrackWheelModels[79].setRotationPoint(-57F, -15F, -22F);

		rightTrackWheelModels[80].addBox(-0.5F, -3.8F, -2F, 1, 1, 7, 0F); // Import WheelR82
		rightTrackWheelModels[80].setRotationPoint(-57F, -15F, -22F);
		rightTrackWheelModels[80].rotateAngleZ = -0.78539816F;

		rightTrackWheelModels[81].addBox(-3.8F, -0.5F, -2F, 1, 1, 7, 0F); // Import WheelR83
		rightTrackWheelModels[81].setRotationPoint(-57F, -15F, -22F);
		rightTrackWheelModels[81].rotateAngleZ = -0.78539816F;

		rightTrackWheelModels[82].addBox(-4F, -0.5F, -2F, 1, 1, 7, 0F); // Import WheelR84
		rightTrackWheelModels[82].setRotationPoint(-57F, -15F, -22F);

		rightTrackWheelModels[83].addBox(-0.5F, 2.8F, -2F, 1, 1, 7, 0F); // Import WheelR85
		rightTrackWheelModels[83].setRotationPoint(-57F, -15F, -22F);
		rightTrackWheelModels[83].rotateAngleZ = -0.78539816F;

		rightTrackWheelModels[84].addShapeBox(-6F, 2F, 0F, 5, 2, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Import WheelR9
		rightTrackWheelModels[84].setRotationPoint(31F, -16F, -24F);


		leftTrackModel = new ModelRendererTurbo[14];
		leftTrackModel[0] = new ModelRendererTurbo(this, 302, 98, textureX, textureY); // Import TrackL1
		leftTrackModel[1] = new ModelRendererTurbo(this, 368, 151, textureX, textureY); // Import TrackL10
		leftTrackModel[2] = new ModelRendererTurbo(this, 342, 98, textureX, textureY); // Import TrackL11
		leftTrackModel[3] = new ModelRendererTurbo(this, 344, 124, textureX, textureY); // Import TrackL12
		leftTrackModel[4] = new ModelRendererTurbo(this, 306, 153, textureX, textureY); // Import TrackL13
		leftTrackModel[5] = new ModelRendererTurbo(this, 371, 126, textureX, textureY); // Import TrackL14
		leftTrackModel[6] = new ModelRendererTurbo(this, 252, 176, textureX, textureY); // Import TrackL2
		leftTrackModel[7] = new ModelRendererTurbo(this, 271, 123, textureX, textureY); // Import TrackL3
		leftTrackModel[8] = new ModelRendererTurbo(this, 310, 120, textureX, textureY); // Import TrackL4
		leftTrackModel[9] = new ModelRendererTurbo(this, 277, 142, textureX, textureY); // Import TrackL5
		leftTrackModel[10] = new ModelRendererTurbo(this, 374, 99, textureX, textureY); // Import TrackL6
		leftTrackModel[11] = new ModelRendererTurbo(this, 275, 88, textureX, textureY); // Import TrackL7
		leftTrackModel[12] = new ModelRendererTurbo(this, 252, 73, textureX, textureY); // Import TrackL8
		leftTrackModel[13] = new ModelRendererTurbo(this, 252, 73, textureX, textureY); // Import TrackL9

		leftTrackModel[0].addBox(26F, 5F, -9F, 6, 1, 9, 0F); // Import TrackL1
		leftTrackModel[0].setRotationPoint(1F, -26F, 25F);

		leftTrackModel[1].addBox(-61F, 5.2F, -9F, 4, 1, 9, 0F); // Import TrackL10
		leftTrackModel[1].setRotationPoint(2F, -25F, 25F);

		leftTrackModel[2].addBox(-50.8F, -39.45F, -9F, 4, 1, 9, 0F); // Import TrackL11
		leftTrackModel[2].setRotationPoint(2F, -25F, 25F);
		leftTrackModel[2].rotateAngleZ = 0.78539816F;

		leftTrackModel[3].addBox(-62.82F, 8F, -9F, 1, 4, 9, 0F); // Import TrackL12
		leftTrackModel[3].setRotationPoint(1F, -25F, 25F);

		leftTrackModel[4].addBox(-47.65F, 42F, -9F, 17, 1, 9, 0F); // Import TrackL13
		leftTrackModel[4].setRotationPoint(1F, -26F, 25F);
		leftTrackModel[4].rotateAngleZ = -0.52359878F;

		leftTrackModel[5].addBox(-62.82F, 11.4F, -9F, 1, 1, 9, 0F); // Import TrackL14
		leftTrackModel[5].setRotationPoint(1F, -25F, 25F);

		leftTrackModel[6].addBox(-48F, 21F, -9F, 68, 1, 9, 0F); // Import TrackL2
		leftTrackModel[6].setRotationPoint(1F, -26F, 25F);

		leftTrackModel[7].addBox(26.5F, -18.64F, -9F, 4, 1, 9, 0F); // Import TrackL3
		leftTrackModel[7].setRotationPoint(1F, -26F, 25F);
		leftTrackModel[7].rotateAngleZ = -0.76794487F;

		leftTrackModel[8].addBox(33.9F, 7.79F, -9F, 1, 5, 9, 0F); // Import TrackL4
		leftTrackModel[8].setRotationPoint(1F, -26F, 25F);

		leftTrackModel[9].addBox(28.33F, -22.83F, -9F, 1, 17, 9, 0F); // Import TrackL5
		leftTrackModel[9].setRotationPoint(1F, -26F, 25F);
		leftTrackModel[9].rotateAngleZ = -1.01229097F;

		leftTrackModel[10].addBox(28.33F, -6.3F, -9F, 1, 1, 9, 0F); // Import TrackL6
		leftTrackModel[10].setRotationPoint(1F, -26F, 25F);
		leftTrackModel[10].rotateAngleZ = -1.01229097F;

		leftTrackModel[11].addBox(9F, -24.87F, -9F, 1, 17, 9, 0F); // Import TrackL7
		leftTrackModel[11].setRotationPoint(1F, -26F, 25F);
		leftTrackModel[11].rotateAngleZ = -1.41371669F;

		leftTrackModel[12].addBox(-34.65F, 6.68F, -9F, 44, 1, 9, 0F); // Import TrackL8
		leftTrackModel[12].setRotationPoint(1F, -25F, 25F);

		leftTrackModel[13].addBox(-55.65F, 9.1F, -9F, 22, 1, 9, 0F); // Import TrackL9
		leftTrackModel[13].setRotationPoint(1F, -25F, 25F);
		leftTrackModel[13].rotateAngleZ = -0.06981317F;


		rightTrackModel = new ModelRendererTurbo[14];
		rightTrackModel[0] = new ModelRendererTurbo(this, 275, 88, textureX, textureY); // Import TrackR1
		rightTrackModel[1] = new ModelRendererTurbo(this, 368, 151, textureX, textureY); // Import TrackR10
		rightTrackModel[2] = new ModelRendererTurbo(this, 342, 98, textureX, textureY); // Import TrackR11
		rightTrackModel[3] = new ModelRendererTurbo(this, 344, 124, textureX, textureY); // Import TrackR12
		rightTrackModel[4] = new ModelRendererTurbo(this, 306, 153, textureX, textureY); // Import TrackR13
		rightTrackModel[5] = new ModelRendererTurbo(this, 371, 126, textureX, textureY); // Import TrackR14
		rightTrackModel[6] = new ModelRendererTurbo(this, 302, 98, textureX, textureY); // Import TrackR2
		rightTrackModel[7] = new ModelRendererTurbo(this, 271, 123, textureX, textureY); // Import TrackR3
		rightTrackModel[8] = new ModelRendererTurbo(this, 310, 120, textureX, textureY); // Import TrackR4
		rightTrackModel[9] = new ModelRendererTurbo(this, 277, 142, textureX, textureY); // Import TrackR5
		rightTrackModel[10] = new ModelRendererTurbo(this, 252, 176, textureX, textureY); // Import TrackR6
		rightTrackModel[11] = new ModelRendererTurbo(this, 374, 99, textureX, textureY); // Import TrackR7
		rightTrackModel[12] = new ModelRendererTurbo(this, 252, 73, textureX, textureY); // Import TrackR8
		rightTrackModel[13] = new ModelRendererTurbo(this, 252, 73, textureX, textureY); // Import TrackR9

		rightTrackModel[0].addBox(9F, -24.87F, -4F, 1, 17, 9, 0F); // Import TrackR1
		rightTrackModel[0].setRotationPoint(1F, -26F, -21F);
		rightTrackModel[0].rotateAngleZ = -1.41371669F;

		rightTrackModel[1].addBox(-61F, 5.2F, -4F, 4, 1, 9, 0F); // Import TrackR10
		rightTrackModel[1].setRotationPoint(2F, -25F, -21F);

		rightTrackModel[2].addBox(-50.8F, -39.45F, -4F, 4, 1, 9, 0F); // Import TrackR11
		rightTrackModel[2].setRotationPoint(2F, -25F, -21F);
		rightTrackModel[2].rotateAngleZ = 0.78539816F;

		rightTrackModel[3].addBox(-62.82F, 8F, -4F, 1, 4, 9, 0F); // Import TrackR12
		rightTrackModel[3].setRotationPoint(1F, -25F, -21F);

		rightTrackModel[4].addBox(-47.65F, 42F, -4F, 17, 1, 9, 0F); // Import TrackR13
		rightTrackModel[4].setRotationPoint(1F, -26F, -21F);
		rightTrackModel[4].rotateAngleZ = -0.52359878F;

		rightTrackModel[5].addBox(-62.82F, 11.4F, -4F, 1, 1, 9, 0F); // Import TrackR14
		rightTrackModel[5].setRotationPoint(1F, -25F, -21F);

		rightTrackModel[6].addBox(26F, 5F, -4F, 6, 1, 9, 0F); // Import TrackR2
		rightTrackModel[6].setRotationPoint(1F, -26F, -21F);

		rightTrackModel[7].addBox(26.5F, -18.64F, -4F, 4, 1, 9, 0F); // Import TrackR3
		rightTrackModel[7].setRotationPoint(1F, -26F, -21F);
		rightTrackModel[7].rotateAngleZ = -0.76794487F;

		rightTrackModel[8].addBox(33.9F, 7.79F, -4F, 1, 5, 9, 0F); // Import TrackR4
		rightTrackModel[8].setRotationPoint(1F, -26F, -21F);

		rightTrackModel[9].addBox(28.33F, -22.83F, -4F, 1, 17, 9, 0F); // Import TrackR5
		rightTrackModel[9].setRotationPoint(1F, -26F, -21F);
		rightTrackModel[9].rotateAngleZ = -1.01229097F;

		rightTrackModel[10].addBox(-48F, 21F, -4F, 68, 1, 9, 0F); // Import TrackR6
		rightTrackModel[10].setRotationPoint(1F, -26F, -21F);

		rightTrackModel[11].addBox(28.33F, -6.3F, -4F, 1, 1, 9, 0F); // Import TrackR7
		rightTrackModel[11].setRotationPoint(1F, -26F, -21F);
		rightTrackModel[11].rotateAngleZ = -1.01229097F;

		rightTrackModel[12].addBox(-34.65F, 6.68F, -4F, 44, 1, 9, 0F); // Import TrackR8
		rightTrackModel[12].setRotationPoint(1F, -25F, -21F);

		rightTrackModel[13].addBox(-55.65F, 9.1F, -4F, 22, 1, 9, 0F); // Import TrackR9
		rightTrackModel[13].setRotationPoint(1F, -25F, -21F);
		rightTrackModel[13].rotateAngleZ = -0.06981317F;



		translateAll(0F, 13F, 0F);


		flipAll();
	}
}