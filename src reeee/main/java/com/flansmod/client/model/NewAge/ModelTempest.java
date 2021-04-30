//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 01.08.2017 - 13:32:37
// Last changed on: 01.08.2017 - 13:32:37

package com.flansmod.client.model.NewAge; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelTempest extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 512;

	public ModelTempest() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[95];
		noseModel = new ModelRendererTurbo[75];
		tailModel = new ModelRendererTurbo[4];
		leftWingModel = new ModelRendererTurbo[10];
		rightWingModel = new ModelRendererTurbo[10];
		leftWingWheelModel = new ModelRendererTurbo[8];
		rightWingWheelModel = new ModelRendererTurbo[8];

		initbodyModel_1();
		initnoseModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		initleftWingWheelModel_1();
		initrightWingWheelModel_1();

		initPropeller();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 697, 9, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 545, 17, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 625, 25, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 873, 25, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 697, 33, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 937, 25, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 793, 33, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 537, 41, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 23
		bodyModel[24] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 24
		bodyModel[25] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 25
		bodyModel[26] = new ModelRendererTurbo(this, 553, 49, textureX, textureY); // Box 26
		bodyModel[27] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 28
		bodyModel[28] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 29
		bodyModel[29] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Box 30
		bodyModel[30] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 31
		bodyModel[31] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 32
		bodyModel[32] = new ModelRendererTurbo(this, 159, 28, textureX, textureY); // Box 33
		bodyModel[33] = new ModelRendererTurbo(this, 977, 17, textureX, textureY); // Box 34
		bodyModel[34] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 35
		bodyModel[35] = new ModelRendererTurbo(this, 961, 73, textureX, textureY); // Box 91
		bodyModel[36] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 92
		bodyModel[37] = new ModelRendererTurbo(this, 1009, 65, textureX, textureY); // Box 93
		bodyModel[38] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 94
		bodyModel[39] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Box 95
		bodyModel[40] = new ModelRendererTurbo(this, 865, 9, textureX, textureY); // Box 96
		bodyModel[41] = new ModelRendererTurbo(this, 705, 17, textureX, textureY); // Box 97
		bodyModel[42] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 101
		bodyModel[43] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 102
		bodyModel[44] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 108
		bodyModel[45] = new ModelRendererTurbo(this, 553, 81, textureX, textureY); // Box 109
		bodyModel[46] = new ModelRendererTurbo(this, 649, 81, textureX, textureY); // Box 110
		bodyModel[47] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 111
		bodyModel[48] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 116
		bodyModel[49] = new ModelRendererTurbo(this, 705, 81, textureX, textureY); // Box 117
		bodyModel[50] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 139
		bodyModel[51] = new ModelRendererTurbo(this, 1009, 25, textureX, textureY); // Box 140
		bodyModel[52] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 141
		bodyModel[53] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 142
		bodyModel[54] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 143
		bodyModel[55] = new ModelRendererTurbo(this, 697, 33, textureX, textureY); // Box 144
		bodyModel[56] = new ModelRendererTurbo(this, 945, 25, textureX, textureY); // Box 161
		bodyModel[57] = new ModelRendererTurbo(this, 865, 33, textureX, textureY); // Box 162
		bodyModel[58] = new ModelRendererTurbo(this, 609, 57, textureX, textureY); // Box 163
		bodyModel[59] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 164
		bodyModel[60] = new ModelRendererTurbo(this, 793, 33, textureX, textureY); // Box 165
		bodyModel[61] = new ModelRendererTurbo(this, 1009, 33, textureX, textureY); // Box 166
		bodyModel[62] = new ModelRendererTurbo(this, 609, 41, textureX, textureY); // Box 167
		bodyModel[63] = new ModelRendererTurbo(this, 881, 25, textureX, textureY); // Box 168
		bodyModel[64] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Box 169
		bodyModel[65] = new ModelRendererTurbo(this, 513, 57, textureX, textureY); // Box 170
		bodyModel[66] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 171
		bodyModel[67] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 172
		bodyModel[68] = new ModelRendererTurbo(this, 545, 65, textureX, textureY); // Box 173
		bodyModel[69] = new ModelRendererTurbo(this, 561, 97, textureX, textureY); // Box 174
		bodyModel[70] = new ModelRendererTurbo(this, 609, 65, textureX, textureY); // Box 175
		bodyModel[71] = new ModelRendererTurbo(this, 993, 65, textureX, textureY); // Box 176
		bodyModel[72] = new ModelRendererTurbo(this, 921, 73, textureX, textureY); // Box 177
		bodyModel[73] = new ModelRendererTurbo(this, 817, 97, textureX, textureY); // Box 178
		bodyModel[74] = new ModelRendererTurbo(this, 681, 65, textureX, textureY); // Box 179
		bodyModel[75] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 180
		bodyModel[76] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 181
		bodyModel[77] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 182
		bodyModel[78] = new ModelRendererTurbo(this, 937, 97, textureX, textureY); // Box 183
		bodyModel[79] = new ModelRendererTurbo(this, 969, 97, textureX, textureY); // Box 184
		bodyModel[80] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 185
		bodyModel[81] = new ModelRendererTurbo(this, 897, 89, textureX, textureY); // Box 186
		bodyModel[82] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 187
		bodyModel[83] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Box 188
		bodyModel[84] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 189
		bodyModel[85] = new ModelRendererTurbo(this, 761, 105, textureX, textureY); // Box 190
		bodyModel[86] = new ModelRendererTurbo(this, 953, 105, textureX, textureY); // Box 191
		bodyModel[87] = new ModelRendererTurbo(this, 1001, 89, textureX, textureY); // Box 192
		bodyModel[88] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 193
		bodyModel[89] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Box 194
		bodyModel[90] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 195
		bodyModel[91] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 196
		bodyModel[92] = new ModelRendererTurbo(this, 865, 41, textureX, textureY); // Box 197
		bodyModel[93] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 198
		bodyModel[94] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 199

		bodyModel[0].addShapeBox(0F, 0F, 0F, 73, 4, 20, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -8F, 0F, -1F, -8F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(19F, -31F, -10F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 73, 4, 18, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 1F); // Box 1
		bodyModel[1].setRotationPoint(19F, -35F, -9F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 73, 3, 16, 0F,0F, 0F, 0F, 0F, -1F, -6F, 0F, -1F, -6F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 1F); // Box 2
		bodyModel[2].setRotationPoint(19F, -38F, -8F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 73, 4, 10, 0F,0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0F, 3F); // Box 3
		bodyModel[3].setRotationPoint(19F, -42F, -5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 73, 2, 4, 0F,0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 3F); // Box 4
		bodyModel[4].setRotationPoint(19F, -44F, -2F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 73, 4, 18, 0F,0F, 0F, 1F, 0F, 1F, -7F, 0F, 1F, -7F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -4F, -7F, 0F, -4F, -7F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(19F, -27F, -9F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 73, 4, 16, 0F,0F, 0F, 1F, 0F, 4F, -6F, 0F, 4F, -6F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -7F, -6F, 0F, -7F, -6F, 0F, 0F, -1F); // Box 6
		bodyModel[6].setRotationPoint(19F, -23F, -8F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 73, 4, 12, 0F,0F, 0F, 1F, 0F, 7F, -4F, 0F, 7F, -4F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, -10F, -5F, 0F, -10F, -5F, 0F, 0F, -4F); // Box 7
		bodyModel[7].setRotationPoint(19F, -19F, -6F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 34, 4, 18, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 4F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 4F, -2F); // Box 8
		bodyModel[8].setRotationPoint(-15F, -23F, -9F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 34, 4, 14, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 2F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 2F, -5F); // Box 9
		bodyModel[9].setRotationPoint(-15F, -19F, -7F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 25, 4, 18, 0F,4F, 0F, 1F, 4F, 0F, 1F, 4F, 0F, 1F, 4F, 0F, 1F, 4F, 4F, -2F, 4F, 4F, -2F, 4F, 4F, -2F, 4F, 4F, -2F); // Box 10
		bodyModel[10].setRotationPoint(-44F, -23F, -9F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 25, 2, 14, 0F,4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, -5F, 4F, 0F, -5F, 4F, 0F, -5F, 4F, 0F, -5F); // Box 11
		bodyModel[11].setRotationPoint(-44F, -15F, -7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 25, 4, 20, 0F,4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F); // Box 12
		bodyModel[12].setRotationPoint(-44F, -27F, -10F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 25, 5, 20, 0F,4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F); // Box 13
		bodyModel[13].setRotationPoint(-44F, -32F, -10F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 25, 3, 20, 0F,4F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F); // Box 14
		bodyModel[14].setRotationPoint(-44F, -35F, -10F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 25, 3, 18, 0F,4F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F); // Box 15
		bodyModel[15].setRotationPoint(-44F, -38F, -9F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 25, 4, 16, 0F,4F, 0F, -3F, 4F, 0F, -3F, 4F, 0F, -3F, 4F, 0F, -3F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F); // Box 16
		bodyModel[16].setRotationPoint(-44F, -42F, -8F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 25, 1, 10, 0F,4F, 0F, -3F, 4F, 0F, -3F, 4F, 0F, -3F, 4F, 0F, -3F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F); // Box 17
		bodyModel[17].setRotationPoint(-44F, -43F, -5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 34, 5, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[18].setRotationPoint(-15F, -32F, -10F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 34, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 19
		bodyModel[19].setRotationPoint(-15F, -27F, -10F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 34, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, -1F, 0F, 0F, -1F); // Box 20
		bodyModel[20].setRotationPoint(-15F, -35F, -9F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 34, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 21
		bodyModel[21].setRotationPoint(-15F, -38F, -8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 22
		bodyModel[22].setRotationPoint(-15F, -42F, -5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 34, 5, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[23].setRotationPoint(-15F, -32F, 9F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 34, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 24
		bodyModel[24].setRotationPoint(-15F, -27F, 9F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 34, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, 0F, 1F); // Box 25
		bodyModel[25].setRotationPoint(-15F, -35F, 8F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 34, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 26
		bodyModel[26].setRotationPoint(-15F, -38F, 7F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 18, 3, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 28
		bodyModel[27].setRotationPoint(-9F, -41F, -5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 29
		bodyModel[28].setRotationPoint(9F, -42F, -5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 30
		bodyModel[29].setRotationPoint(-15F, -42F, 4F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 18, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 31
		bodyModel[30].setRotationPoint(-9F, -41F, 4F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 32
		bodyModel[31].setRotationPoint(9F, -42F, 4F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -1F, 0F, 0F, 2F, -4F, 0F, 2F, 4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, 0F, 0F); // Box 33
		bodyModel[32].setRotationPoint(9F, -42F, -6F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -1F, 0F, 0F, 2F, 4F, 0F, 2F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 34
		bodyModel[33].setRotationPoint(9F, -42F, 5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.5F); // Box 35
		bodyModel[34].setRotationPoint(17F, -44F, -2F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 18, 5, 4, 0F,4F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F); // Box 91
		bodyModel[35].setRotationPoint(72F, -45F, -2F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 6, 19, 2, 0F,-3F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, 16F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 1F, 16F, 0F, 1F); // Box 92
		bodyModel[36].setRotationPoint(84F, -64F, -1F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 19, 2, 0F,-5F, 0F, -1F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, -1F, 14F, 0F, -1F, -14F, 0F, 1F, -14F, 0F, 1F, 14F, 0F, -1F); // Box 93
		bodyModel[37].setRotationPoint(80F, -64F, -1F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 12F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 12F, 0F, -1F); // Box 94
		bodyModel[38].setRotationPoint(66F, -45F, -1F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 95
		bodyModel[39].setRotationPoint(85F, -66F, -1F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, -1F, 2F, 1F, -1F, 2F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[40].setRotationPoint(87F, -66F, -1F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,12F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 12F, 0F, 1F, 5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 5F, 0F, 0F); // Box 97
		bodyModel[41].setRotationPoint(90F, -25F, -1F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 3F, 0F, -2F, 3F, 0F, 0F, 0F); // Box 101
		bodyModel[42].setRotationPoint(-66F, -37F, -2F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, -2F, 3F, 0F, -2F, 3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F); // Box 102
		bodyModel[43].setRotationPoint(-66F, -27F, -2F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 9, 4, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F); // Box 108
		bodyModel[44].setRotationPoint(74F, -40F, 2F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 8, 4, 36, 0F,0F, -2F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, -5F, -2F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, -5F, -2F, -5F); // Box 109
		bodyModel[45].setRotationPoint(66F, -40F, 2F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 9, 4, 36, 0F,-2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[46].setRotationPoint(74F, -40F, -38F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 8, 4, 36, 0F,-5F, -2F, -5F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -5F, -2F, -5F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 111
		bodyModel[47].setRotationPoint(66F, -40F, -38F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 7, 3, 2, 0F,0F, 0F, -1F, -4F, -1F, -1F, -4F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F); // Box 116
		bodyModel[48].setRotationPoint(92F, -67F, -1F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, -1F, -2F, -5F, -1F, -2F, 0F, 0F, -1F); // Box 117
		bodyModel[49].setRotationPoint(92F, -26F, -2F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 139
		bodyModel[50].setRotationPoint(-9F, -47F, 1F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[51].setRotationPoint(-9F, -48F, -3F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 141
		bodyModel[52].setRotationPoint(-9F, -44F, -4F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 142
		bodyModel[53].setRotationPoint(-9F, -47F, -2F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[54].setRotationPoint(-16F, -42F, -3F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 6F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[55].setRotationPoint(-16F, -42F, 2F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[56].setRotationPoint(78F, -24F, -1F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[57].setRotationPoint(78F, -19F, 1F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[58].setRotationPoint(78F, -19F, -2F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[59].setRotationPoint(86F, -17F, -2F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[60].setRotationPoint(84F, -17F, -1F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 166
		bodyModel[61].setRotationPoint(84F, -16F, -1F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[62].setRotationPoint(84F, -19F, -1F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 168
		bodyModel[63].setRotationPoint(-9F, -44F, 3F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 4, 12, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[64].setRotationPoint(-15F, -40F, -3F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 4, 12, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[65].setRotationPoint(-15F, -40F, 3F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 4, 12, 3, 0F,0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[66].setRotationPoint(-15F, -40F, -6F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 172
		bodyModel[67].setRotationPoint(-15F, -38F, 6F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 173
		bodyModel[68].setRotationPoint(-15F, -35F, 6F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 6, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[69].setRotationPoint(-15F, -32F, 6F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[70].setRotationPoint(-15F, -40F, 6F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[71].setRotationPoint(-15F, -38F, -7F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[72].setRotationPoint(-15F, -35F, -8F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 6, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[73].setRotationPoint(-15F, -32F, -9F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[74].setRotationPoint(-15F, -40F, -7F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F,0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[75].setRotationPoint(-15F, -43F, -3F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 1F, -3F, 0F, 1F, -3F, -1.2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 1F, 0F, 0F, 0F); // Box 181
		bodyModel[76].setRotationPoint(-15F, -43F, 3F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, -1F, 0F, -3F, -1.2F, 0F, -3F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[77].setRotationPoint(-15F, -43F, -5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 10, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[78].setRotationPoint(9F, -32F, 6F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 12, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 184
		bodyModel[79].setRotationPoint(9F, -35F, 6F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 185
		bodyModel[80].setRotationPoint(9F, -38F, 6F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[81].setRotationPoint(9F, -40F, 6F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[82].setRotationPoint(9F, -40F, -7F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[83].setRotationPoint(9F, -38F, -7F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 12, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[84].setRotationPoint(9F, -35F, -8F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 10, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[85].setRotationPoint(9F, -32F, -9F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 12, 17, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[86].setRotationPoint(9F, -40F, -6F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 15, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); // Box 192
		bodyModel[87].setRotationPoint(7F, -42F, -5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[88].setRotationPoint(3F, -27F, -5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 7, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[89].setRotationPoint(-4F, -27F, -5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[90].setRotationPoint(-8F, -33F, -0.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 196
		bodyModel[91].setRotationPoint(-12F, -27.5F, 1.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 197
		bodyModel[92].setRotationPoint(-12F, -27.5F, -4.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[93].setRotationPoint(7F, -45F, -3F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[94].setRotationPoint(7F, -47F, -3F);
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 857, 49, textureX, textureY); // Box 36
		noseModel[1] = new ModelRendererTurbo(this, 929, 49, textureX, textureY); // Box 37
		noseModel[2] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 38
		noseModel[3] = new ModelRendererTurbo(this, 977, 49, textureX, textureY); // Box 39
		noseModel[4] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 40
		noseModel[5] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 41
		noseModel[6] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 42
		noseModel[7] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 43
		noseModel[8] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 44
		noseModel[9] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 46
		noseModel[10] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 47
		noseModel[11] = new ModelRendererTurbo(this, 513, 57, textureX, textureY); // Box 48
		noseModel[12] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 49
		noseModel[13] = new ModelRendererTurbo(this, 561, 57, textureX, textureY); // Box 50
		noseModel[14] = new ModelRendererTurbo(this, 705, 57, textureX, textureY); // Box 51
		noseModel[15] = new ModelRendererTurbo(this, 769, 33, textureX, textureY); // Box 52
		noseModel[16] = new ModelRendererTurbo(this, 905, 49, textureX, textureY); // Box 53
		noseModel[17] = new ModelRendererTurbo(this, 1001, 17, textureX, textureY); // Box 54
		noseModel[18] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 55
		noseModel[19] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 56
		noseModel[20] = new ModelRendererTurbo(this, 521, 25, textureX, textureY); // Box 57
		noseModel[21] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 58
		noseModel[22] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 59
		noseModel[23] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 60
		noseModel[24] = new ModelRendererTurbo(this, 521, 33, textureX, textureY); // Box 61
		noseModel[25] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 62
		noseModel[26] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 63
		noseModel[27] = new ModelRendererTurbo(this, 545, 57, textureX, textureY); // Box 64
		noseModel[28] = new ModelRendererTurbo(this, 681, 49, textureX, textureY); // Box 65
		noseModel[29] = new ModelRendererTurbo(this, 681, 57, textureX, textureY); // Box 66
		noseModel[30] = new ModelRendererTurbo(this, 769, 49, textureX, textureY); // Box 67
		noseModel[31] = new ModelRendererTurbo(this, 745, 57, textureX, textureY); // Box 68
		noseModel[32] = new ModelRendererTurbo(this, 769, 57, textureX, textureY); // Box 69
		noseModel[33] = new ModelRendererTurbo(this, 801, 57, textureX, textureY); // Box 70
		noseModel[34] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 71
		noseModel[35] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 72
		noseModel[36] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 73
		noseModel[37] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 74
		noseModel[38] = new ModelRendererTurbo(this, 761, 65, textureX, textureY); // Box 75
		noseModel[39] = new ModelRendererTurbo(this, 849, 57, textureX, textureY); // Box 76
		noseModel[40] = new ModelRendererTurbo(this, 809, 65, textureX, textureY); // Box 77
		noseModel[41] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 78
		noseModel[42] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 79
		noseModel[43] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 80
		noseModel[44] = new ModelRendererTurbo(this, 625, 73, textureX, textureY); // Box 81
		noseModel[45] = new ModelRendererTurbo(this, 673, 73, textureX, textureY); // Box 82
		noseModel[46] = new ModelRendererTurbo(this, 721, 73, textureX, textureY); // Box 83
		noseModel[47] = new ModelRendererTurbo(this, 761, 73, textureX, textureY); // Box 84
		noseModel[48] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 85
		noseModel[49] = new ModelRendererTurbo(this, 801, 73, textureX, textureY); // Box 86
		noseModel[50] = new ModelRendererTurbo(this, 857, 73, textureX, textureY); // Box 87
		noseModel[51] = new ModelRendererTurbo(this, 921, 73, textureX, textureY); // Box 88
		noseModel[52] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 89
		noseModel[53] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 90
		noseModel[54] = new ModelRendererTurbo(this, 841, 73, textureX, textureY); // Box 98
		noseModel[55] = new ModelRendererTurbo(this, 897, 73, textureX, textureY); // Box 99
		noseModel[56] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 100
		noseModel[57] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 103
		noseModel[58] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 104
		noseModel[59] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 105
		noseModel[60] = new ModelRendererTurbo(this, 529, 81, textureX, textureY); // Box 106
		noseModel[61] = new ModelRendererTurbo(this, 561, 81, textureX, textureY); // Box 107
		noseModel[62] = new ModelRendererTurbo(this, 841, 73, textureX, textureY); // Box 198
		noseModel[63] = new ModelRendererTurbo(this, 841, 73, textureX, textureY); // Box 199
		noseModel[64] = new ModelRendererTurbo(this, 841, 73, textureX, textureY); // Box 200
		noseModel[65] = new ModelRendererTurbo(this, 841, 73, textureX, textureY); // Box 201
		noseModel[66] = new ModelRendererTurbo(this, 841, 73, textureX, textureY); // Box 202
		noseModel[67] = new ModelRendererTurbo(this, 841, 73, textureX, textureY); // Box 203
		noseModel[68] = new ModelRendererTurbo(this, 841, 73, textureX, textureY); // Box 204
		noseModel[69] = new ModelRendererTurbo(this, 841, 73, textureX, textureY); // Box 205
		noseModel[70] = new ModelRendererTurbo(this, 841, 73, textureX, textureY); // Box 206
		noseModel[71] = new ModelRendererTurbo(this, 841, 73, textureX, textureY); // Box 207
		noseModel[72] = new ModelRendererTurbo(this, 841, 73, textureX, textureY); // Box 208
		noseModel[73] = new ModelRendererTurbo(this, 841, 73, textureX, textureY); // Box 209
		noseModel[74] = new ModelRendererTurbo(this, 841, 73, textureX, textureY); // Box 210

		noseModel[0].addShapeBox(0F, 0F, 0F, 12, 3, 20, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 36
		noseModel[0].setRotationPoint(-60F, -35F, -10F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 12, 3, 18, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		noseModel[1].setRotationPoint(-60F, -38F, -9F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 12, 3, 16, 0F,0F, -1F, -3F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, -1F, -3F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 38
		noseModel[2].setRotationPoint(-60F, -41F, -8F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 12, 1, 10, 0F,0F, -1F, -3F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, -1F, -3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F); // Box 39
		noseModel[3].setRotationPoint(-60F, -42F, -5F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 7, 1, 10, 0F,0F, -1F, -3F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, -1F, -3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F); // Box 40
		noseModel[4].setRotationPoint(-67F, -40F, -5F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 7, 2, 14, 0F,0F, -1F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 0F); // Box 41
		noseModel[5].setRotationPoint(-67F, -39F, -7F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 7, 3, 14, 0F,0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 1F); // Box 42
		noseModel[6].setRotationPoint(-67F, -36F, -7F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 12, 4, 20, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 43
		noseModel[7].setRotationPoint(-60F, -33F, -10F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 7, 3, 16, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 44
		noseModel[8].setRotationPoint(-67F, -33F, -8F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 12, 4, 20, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 46
		noseModel[9].setRotationPoint(-60F, -30F, -10F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 12, 4, 20, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 47
		noseModel[10].setRotationPoint(-60F, -27F, -10F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 7, 3, 16, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F); // Box 48
		noseModel[11].setRotationPoint(-67F, -30F, -8F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 7, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -3F); // Box 49
		noseModel[12].setRotationPoint(-67F, -27F, -7F);

		noseModel[13].addShapeBox(0F, 0F, 0F, 12, 2, 16, 0F,0F, 0F, 1F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 7F, -1F, 0F, 7F, -1F, 0F, 0F, -2F); // Box 50
		noseModel[13].setRotationPoint(-60F, -24F, -8F);

		noseModel[14].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F,0F, 0F, 0F, 0F, -7F, 1F, 0F, -7F, 1F, 0F, 0F, 0F, 0F, 1F, -5F, 0F, 8F, -4F, 0F, 8F, -4F, 0F, 1F, -5F); // Box 51
		noseModel[14].setRotationPoint(-60F, -22F, -6F);

		noseModel[15].addShapeBox(0F, 0F, 0F, 7, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -1F, 0F); // Box 52
		noseModel[15].setRotationPoint(-67F, -24F, -4F);

		noseModel[16].addShapeBox(0F, 0F, 0F, 7, 2, 8, 0F,0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, -1F, -3F); // Box 53
		noseModel[16].setRotationPoint(-67F, -23F, -4F);

		noseModel[17].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -2F); // Box 54
		noseModel[17].setRotationPoint(-67F, -23F, -4F);

		noseModel[18].addShapeBox(0F, 0F, 0F, 19, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -2F); // Box 55
		noseModel[18].setRotationPoint(-57F, -23F, -8F);

		noseModel[19].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -1F); // Box 56
		noseModel[19].setRotationPoint(-67F, -21F, -6F);

		noseModel[20].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -1F); // Box 57
		noseModel[20].setRotationPoint(-67F, -19F, -7F);

		noseModel[21].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 58
		noseModel[21].setRotationPoint(-67F, -16F, -8F);

		noseModel[22].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 1F); // Box 59
		noseModel[22].setRotationPoint(-67F, -14F, -8F);

		noseModel[23].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 2F, 1F, 0F, 1F, -2F, 0F, -1F, 1F); // Box 60
		noseModel[23].setRotationPoint(-67F, -11F, -7F);

		noseModel[24].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 3F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 61
		noseModel[24].setRotationPoint(-67F, -10F, -5F);

		noseModel[25].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 62
		noseModel[25].setRotationPoint(-67F, -10F, -4F);

		noseModel[26].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 1F); // Box 63
		noseModel[26].setRotationPoint(-67F, -21F, 5F);

		noseModel[27].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 1F); // Box 64
		noseModel[27].setRotationPoint(-67F, -19F, 6F);

		noseModel[28].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 65
		noseModel[28].setRotationPoint(-67F, -16F, 7F);

		noseModel[29].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -1F); // Box 66
		noseModel[29].setRotationPoint(-67F, -14F, 7F);

		noseModel[30].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 1F, -2F, 0F, 2F, 1F, 0F, 0F, -2F); // Box 67
		noseModel[30].setRotationPoint(-67F, -11F, 6F);

		noseModel[31].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 2F, 3F, 0F, 0F, 0F); // Box 68
		noseModel[31].setRotationPoint(-67F, -10F, 4F);

		noseModel[32].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 69
		noseModel[32].setRotationPoint(-67F, -10F, 0F);

		noseModel[33].addShapeBox(0F, 0F, 0F, 19, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F); // Box 70
		noseModel[33].setRotationPoint(-57F, -21F, -10F);

		noseModel[34].addShapeBox(0F, 0F, 0F, 19, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 71
		noseModel[34].setRotationPoint(-57F, -19F, -11F);

		noseModel[35].addShapeBox(0F, 0F, 0F, 19, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 72
		noseModel[35].setRotationPoint(-57F, -16F, -11F);

		noseModel[36].addShapeBox(0F, 0F, 0F, 19, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 1F); // Box 73
		noseModel[36].setRotationPoint(-57F, -14F, -11F);

		noseModel[37].addShapeBox(0F, 0F, 0F, 19, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, -1F, 3F, 0F, -1F, 1F); // Box 74
		noseModel[37].setRotationPoint(-57F, -11F, -10F);

		noseModel[38].addShapeBox(0F, 0F, 0F, 19, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 75
		noseModel[38].setRotationPoint(-57F, -8F, -8F);

		noseModel[39].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 2F); // Box 76
		noseModel[39].setRotationPoint(-67F, -23F, 3F);

		noseModel[40].addShapeBox(0F, 0F, 0F, 19, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 2F); // Box 77
		noseModel[40].setRotationPoint(-57F, -23F, 7F);

		noseModel[41].addShapeBox(0F, 0F, 0F, 19, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F); // Box 78
		noseModel[41].setRotationPoint(-57F, -21F, 9F);

		noseModel[42].addShapeBox(0F, 0F, 0F, 19, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 79
		noseModel[42].setRotationPoint(-57F, -19F, 10F);

		noseModel[43].addShapeBox(0F, 0F, 0F, 19, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 80
		noseModel[43].setRotationPoint(-57F, -16F, 10F);

		noseModel[44].addShapeBox(0F, 0F, 0F, 19, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -1F); // Box 81
		noseModel[44].setRotationPoint(-57F, -14F, 10F);

		noseModel[45].addShapeBox(0F, 0F, 0F, 19, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, 0F, -4F, 0F, 0F, -2F); // Box 82
		noseModel[45].setRotationPoint(-57F, -11F, 9F);

		noseModel[46].addShapeBox(0F, 0F, 0F, 19, 1, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 83
		noseModel[46].setRotationPoint(-57F, -8F, 4F);

		noseModel[47].addShapeBox(0F, 0F, 0F, 19, 1, 8, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 84
		noseModel[47].setRotationPoint(-57F, -7F, -4F);

		noseModel[48].addShapeBox(0F, 0F, 0F, 8, 4, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 85
		noseModel[48].setRotationPoint(-58F, -11F, -9F);

		noseModel[49].addShapeBox(0F, 0F, 0F, 8, 3, 18, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		noseModel[49].setRotationPoint(-58F, -14F, -9F);

		noseModel[50].addShapeBox(0F, 0F, 0F, 8, 5, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		noseModel[50].setRotationPoint(-58F, -19F, -10F);

		noseModel[51].addShapeBox(0F, 0F, 0F, 8, 2, 20, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		noseModel[51].setRotationPoint(-58F, -21F, -10F);

		noseModel[52].addShapeBox(0F, 0F, 0F, 8, 2, 18, 0F,0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		noseModel[52].setRotationPoint(-58F, -23F, -9F);

		noseModel[53].addShapeBox(0F, 0F, 0F, 10, 10, 10, 0F,0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F); // Box 90
		noseModel[53].setRotationPoint(-66F, -20F, -5F);

		noseModel[54].addShapeBox(0F, 0F, 0F, 7, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F); // Box 98
		noseModel[54].setRotationPoint(-74F, -33F, -4F);

		noseModel[55].addShapeBox(0F, 0F, 0F, 7, 3, 8, 0F,0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F); // Box 99
		noseModel[55].setRotationPoint(-74F, -36F, -4F);

		noseModel[56].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, -1F, -2F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -2F); // Box 100
		noseModel[56].setRotationPoint(-74F, -37F, -4F);

		noseModel[57].addShapeBox(0F, 0F, 0F, 7, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -2F); // Box 103
		noseModel[57].setRotationPoint(-74F, -30F, -4F);

		noseModel[58].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, -1F, -2F); // Box 104
		noseModel[58].setRotationPoint(-74F, -27F, -4F);

		noseModel[59].addShapeBox(0F, 0F, 0F, 5, 3, 8, 0F,0F, -1.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -4F, 0F, -1.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -4F); // Box 105
		noseModel[59].setRotationPoint(-79F, -33F, -4F);

		noseModel[60].addShapeBox(0F, 0F, 0F, 5, 3, 8, 0F,0F, -4.5F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4.5F, -4F, 0F, 1.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -4F); // Box 106
		noseModel[60].setRotationPoint(-79F, -36F, -4F);

		noseModel[61].addShapeBox(0F, 0F, 0F, 5, 3, 8, 0F,0F, 1.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -4F, 0F, -4.5F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4.5F, -4F); // Box 107
		noseModel[61].setRotationPoint(-79F, -30F, -4F);

		noseModel[62].addShapeBox(0F, 0F, 0F, 7, 3, 8, 0F,0F, -1F, 0F, 0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, -1F, 0F); // Box 198
		noseModel[62].setRotationPoint(-45F, -31F, -8F);

		noseModel[63].addShapeBox(0F, 0F, 0F, 7, 3, 8, 0F,0F, -1F, 0F, 0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, -1F, 0F); // Box 199
		noseModel[63].setRotationPoint(-48F, -31F, -8F);

		noseModel[64].addShapeBox(0F, 0F, 0F, 7, 3, 8, 0F,0F, -1F, 0F, 0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, -1F, 0F); // Box 200
		noseModel[64].setRotationPoint(-51F, -31F, -8F);

		noseModel[65].addShapeBox(0F, 0F, 0F, 7, 3, 8, 0F,0F, -1F, 0F, 0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, -1F, 0F); // Box 201
		noseModel[65].setRotationPoint(-54F, -31F, -8F);

		noseModel[66].addShapeBox(0F, 0F, 0F, 7, 3, 8, 0F,0F, -1F, 0F, 0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, -1F, 0F); // Box 202
		noseModel[66].setRotationPoint(-57F, -31F, -8F);

		noseModel[67].addShapeBox(0F, 0F, 0F, 7, 3, 8, 0F,0F, -1F, 0F, 0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, -1F, 0F); // Box 203
		noseModel[67].setRotationPoint(-60F, -31F, -8F);

		noseModel[68].addShapeBox(0F, 0F, 0F, 7, 3, 8, 0F,0F, -1F, 0F, 0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, -1F, 0F); // Box 204
		noseModel[68].setRotationPoint(-45F, -31F, 0F);

		noseModel[69].addShapeBox(0F, 0F, 0F, 7, 3, 8, 0F,0F, -1F, 0F, 0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, -1F, 0F); // Box 205
		noseModel[69].setRotationPoint(-48F, -31F, 0F);

		noseModel[70].addShapeBox(0F, 0F, 0F, 7, 3, 8, 0F,0F, -1F, 0F, 0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, -1F, 0F); // Box 206
		noseModel[70].setRotationPoint(-51F, -31F, 0F);

		noseModel[71].addShapeBox(0F, 0F, 0F, 7, 3, 8, 0F,0F, -1F, 0F, 0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, -1F, 0F); // Box 207
		noseModel[71].setRotationPoint(-54F, -31F, 0F);

		noseModel[72].addShapeBox(0F, 0F, 0F, 7, 3, 8, 0F,0F, -1F, 0F, 0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, -1F, 0F); // Box 208
		noseModel[72].setRotationPoint(-57F, -31F, 0F);

		noseModel[73].addShapeBox(0F, 0F, 0F, 7, 3, 8, 0F,0F, -1F, 0F, 0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, -1F, 0F); // Box 209
		noseModel[73].setRotationPoint(-60F, -31F, 0F);

		noseModel[74].addShapeBox(0F, 0F, 0F, 7, 3, 8, 0F,-3.5F, 15F, -4F, -3.5F, 15F, -4F, -3.5F, 15F, -4F, -3.5F, 15F, -4F, -3F, 0F, -3.5F, -3F, 0F, -3.5F, -3F, 0F, -3.5F, -3F, 0F, -3.5F); // Box 210
		noseModel[74].setRotationPoint(36F, -44F, -4F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 112
		tailModel[1] = new ModelRendererTurbo(this, 705, 89, textureX, textureY); // Box 113
		tailModel[2] = new ModelRendererTurbo(this, 609, 81, textureX, textureY); // Box 114
		tailModel[3] = new ModelRendererTurbo(this, 649, 81, textureX, textureY); // Box 115

		tailModel[0].addShapeBox(0F, 0F, 0F, 9, 4, 36, 0F,0F, -2F, 0F, -4F, -2F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, -2F, -5F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 112
		tailModel[0].setRotationPoint(83F, -40F, -38F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 9, 4, 36, 0F,0F, 0F, 0F, 0F, -2F, 0F, -4F, -2F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, -2F, -5F, 0F, -1F, 0F); // Box 113
		tailModel[1].setRotationPoint(83F, -40F, 2F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 12, 17, 4, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 2F, 0F); // Box 114
		tailModel[2].setRotationPoint(92F, -45F, -2F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 12, 19, 4, 0F,0F, 0F, -1F, -5F, -1F, -2F, -5F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 115
		tailModel[3].setRotationPoint(92F, -64F, -2F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 126
		leftWingModel[1] = new ModelRendererTurbo(this, 817, 105, textureX, textureY); // Box 127
		leftWingModel[2] = new ModelRendererTurbo(this, 593, 129, textureX, textureY); // Box 128
		leftWingModel[3] = new ModelRendererTurbo(this, 369, 137, textureX, textureY); // Box 129
		leftWingModel[4] = new ModelRendererTurbo(this, 625, 137, textureX, textureY); // Box 130
		leftWingModel[5] = new ModelRendererTurbo(this, 25, 145, textureX, textureY); // Box 131
		leftWingModel[6] = new ModelRendererTurbo(this, 393, 145, textureX, textureY); // Box 132
		leftWingModel[7] = new ModelRendererTurbo(this, 713, 145, textureX, textureY); // Box 133
		leftWingModel[8] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 134
		leftWingModel[9] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 135

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 9, 6, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		leftWingModel[0].setRotationPoint(-30F, -21F, -38F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 13, 6, 36, 0F,0F, 0F, 0F, 0F, -2F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F); // Box 127
		leftWingModel[1].setRotationPoint(-21F, -21F, -38F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 12, 3, 36, 0F,0F, 0F, 0F, -2F, -2F, 0F, 1F, -2F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F); // Box 128
		leftWingModel[2].setRotationPoint(-8F, -19F, -38F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 9, 6, 36, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 129
		leftWingModel[3].setRotationPoint(-39F, -21F, -38F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 9, 6, 68, 0F,-4F, 3F, -2F, 0F, 4F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, -8F, -2F, 0F, -7F, -2F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 130
		leftWingModel[4].setRotationPoint(-39F, -21F, -106F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 9, 6, 68, 0F,0F, 4F, -2F, 0F, 4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -2F, 0F, -7F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		leftWingModel[5].setRotationPoint(-30F, -21F, -106F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 12, 6, 68, 0F,0F, 4F, -2F, -6F, 3F, -2F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, -7F, -2F, -6F, -7F, -2F, 1F, -1F, 0F, 0F, 0F, 0F); // Box 132
		leftWingModel[6].setRotationPoint(-21F, -21F, -106F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 8, 2, 68, 0F,6F, 6F, -2F, -10F, 5F, -2F, 3F, -1F, 0F, -1F, 1F, 0F, 6F, -6F, -2F, -10F, -7F, -2F, 3F, -1F, 0F, 0F, 0F, 0F); // Box 133
		leftWingModel[7].setRotationPoint(-9F, -18F, -106F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 23, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		leftWingModel[8].setRotationPoint(-39F, -19F, -44F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 23, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		leftWingModel[9].setRotationPoint(-39F, -18.8F, -41F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 118
		rightWingModel[1] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 119
		rightWingModel[2] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 120
		rightWingModel[3] = new ModelRendererTurbo(this, 761, 97, textureX, textureY); // Box 121
		rightWingModel[4] = new ModelRendererTurbo(this, 849, 97, textureX, textureY); // Box 122
		rightWingModel[5] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Box 123
		rightWingModel[6] = new ModelRendererTurbo(this, 497, 129, textureX, textureY); // Box 124
		rightWingModel[7] = new ModelRendererTurbo(this, 281, 137, textureX, textureY); // Box 125
		rightWingModel[8] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 211
		rightWingModel[9] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 212

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 9, 6, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		rightWingModel[0].setRotationPoint(-30F, -21F, 2F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 13, 6, 36, 0F,0F, 0F, 0F, 1F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 119
		rightWingModel[1].setRotationPoint(-21F, -21F, 2F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 12, 3, 36, 0F,-1F, 1F, 0F, 1F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F); // Box 120
		rightWingModel[2].setRotationPoint(-8F, -19F, 2F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 9, 6, 36, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 121
		rightWingModel[3].setRotationPoint(-39F, -21F, 2F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 9, 6, 68, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 4F, -2F, -4F, 3F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -7F, -2F, -4F, -8F, -2F); // Box 122
		rightWingModel[4].setRotationPoint(-39F, -21F, 38F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 9, 6, 68, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -2F, 0F, -7F, -2F); // Box 123
		rightWingModel[5].setRotationPoint(-30F, -21F, 38F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 12, 6, 68, 0F,0F, 0F, 0F, 1F, -2F, 0F, -6F, 3F, -2F, 0F, 4F, -2F, 0F, 0F, 0F, 1F, -1F, 0F, -6F, -7F, -2F, 0F, -7F, -2F); // Box 124
		rightWingModel[6].setRotationPoint(-21F, -21F, 38F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 8, 2, 68, 0F,-1F, 1F, 0F, 3F, -1F, 0F, -10F, 5F, -2F, 6F, 6F, -2F, 0F, 0F, 0F, 3F, -1F, 0F, -10F, -7F, -2F, 6F, -6F, -2F); // Box 125
		rightWingModel[7].setRotationPoint(-9F, -18F, 38F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 23, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		rightWingModel[8].setRotationPoint(-39F, -19F, 43F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 23, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		rightWingModel[9].setRotationPoint(-39F, -18.8F, 40F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 145
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 929, 49, textureX, textureY); // Box 146
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 545, 25, textureX, textureY); // Box 147
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Box 148
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 149
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 761, 89, textureX, textureY); // Box 150
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 151
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 705, 97, textureX, textureY); // Box 160

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 6, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 4F, 0F, 0F); // Box 145
		leftWingWheelModel[0].setRotationPoint(-28F, -15F, -38F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 4F, 0F, 0F); // Box 146
		leftWingWheelModel[1].setRotationPoint(-32F, -5F, -38F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 147
		leftWingWheelModel[2].setRotationPoint(-26F, -15F, -31F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		leftWingWheelModel[3].setRotationPoint(-30F, -1F, -37F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		leftWingWheelModel[4].setRotationPoint(-35.5F, -2.5F, -36F);

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 150
		leftWingWheelModel[5].setRotationPoint(-35.5F, 1.5F, -36F);

		leftWingWheelModel[6].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		leftWingWheelModel[6].setRotationPoint(-35.5F, -6.5F, -36F);

		leftWingWheelModel[7].addShapeBox(0F, 0F, 0F, 13, 14, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -9F, 0F, 0F); // Box 160
		leftWingWheelModel[7].setRotationPoint(-28F, -15F, -14F);
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 152
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 153
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 553, 25, textureX, textureY); // Box 154
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 633, 25, textureX, textureY); // Box 155
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 156
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 409, 97, textureX, textureY); // Box 157
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 158
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 529, 97, textureX, textureY); // Box 159

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 6, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 4F, 0F, 0F); // Box 152
		rightWingWheelModel[0].setRotationPoint(-28F, -15F, 37F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 4F, 0F, 0F); // Box 153
		rightWingWheelModel[1].setRotationPoint(-32F, -5F, 37F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 7F); // Box 154
		rightWingWheelModel[2].setRotationPoint(-26F, -15F, 30F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		rightWingWheelModel[3].setRotationPoint(-30F, -1F, 36F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		rightWingWheelModel[4].setRotationPoint(-35.5F, -2.5F, 32F);

		rightWingWheelModel[5].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 157
		rightWingWheelModel[5].setRotationPoint(-35.5F, 1.5F, 32F);

		rightWingWheelModel[6].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		rightWingWheelModel[6].setRotationPoint(-35.5F, -6.5F, 32F);

		rightWingWheelModel[7].addShapeBox(0F, 0F, 0F, 13, 14, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -9F, 0F, 0F); // Box 159
		rightWingWheelModel[7].setRotationPoint(-28F, -15F, 13F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[1][4];
		propellerModels[0] = makeProp1(-70F, -31.5F, 0F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[4];
		prop[0] = new ModelRendererTurbo(this, 0, 157, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 157, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 157, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 0, 157, textureX, textureY);
		prop[0].addBox(-0.5F, -33F, -1.5F, 1, 33, 3, 0.0F);
		prop[1].addBox(-0.5F, -33F, -1.5F, 1, 33, 3, 0.0F);
		prop[2].addBox(-0.5F, -33F, -1.5F, 1, 33, 3, 0.0F);
		prop[3].addBox(-0.5F, -33F, -1.5F, 1, 33, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[3].setRotationPoint(i, j, k);
		return prop;
	}
}