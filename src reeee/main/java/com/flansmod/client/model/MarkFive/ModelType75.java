//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Type75
// Model Creator: 
// Created on: 28.08.2018 - 15:31:43
// Last changed on: 28.08.2018 - 15:31:43

package com.flansmod.client.model.MarkFive; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelType75 extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 512;

	public ModelType75() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[121];
		turretModel = new ModelRendererTurbo[69];
		barrelModel = new ModelRendererTurbo[29];
		leftTrackWheelModels = new ModelRendererTurbo[85];
		rightTrackWheelModels = new ModelRendererTurbo[85];
		leftTrackModel = new ModelRendererTurbo[12];
		rightTrackModel = new ModelRendererTurbo[12];

		initbodyModel_1();
		initturretModel_1();
		initbarrelModel_1();
		initleftTrackWheelModels_1();
		initrightTrackWheelModels_1();
		initleftTrackModel_1();
		initrightTrackModel_1();

		initGuns();

		translateAll(0F, 13F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportChassis1
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportChassis112
		bodyModel[2] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import ImportChassis113
		bodyModel[3] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import ImportChassis114
		bodyModel[4] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Import ImportChassis115
		bodyModel[5] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Import ImportChassis116
		bodyModel[6] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Import ImportChassis117
		bodyModel[7] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import ImportChassis118
		bodyModel[8] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import ImportChassis120
		bodyModel[9] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import ImportChassis122
		bodyModel[10] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import ImportChassis123
		bodyModel[11] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import ImportChassis124
		bodyModel[12] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import ImportChassis125
		bodyModel[13] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import ImportChassis127
		bodyModel[14] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Import ImportChassis128
		bodyModel[15] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import ImportChassis129
		bodyModel[16] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import ImportChassis130
		bodyModel[17] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Import ImportChassis131
		bodyModel[18] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import ImportChassis132
		bodyModel[19] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import ImportChassis133
		bodyModel[20] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import ImportChassis134
		bodyModel[21] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import ImportChassis135
		bodyModel[22] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import ImportChassis136
		bodyModel[23] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import ImportChassis137
		bodyModel[24] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import ImportChassis138
		bodyModel[25] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import ImportChassis139
		bodyModel[26] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Import ImportChassis14
		bodyModel[27] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import ImportChassis140
		bodyModel[28] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import ImportChassis157
		bodyModel[29] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import ImportChassis158
		bodyModel[30] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Import ImportChassis159
		bodyModel[31] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Import ImportChassis16
		bodyModel[32] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Import ImportChassis161
		bodyModel[33] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Import ImportChassis162
		bodyModel[34] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Import ImportChassis163
		bodyModel[35] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Import ImportChassis164
		bodyModel[36] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import ImportChassis165
		bodyModel[37] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import ImportChassis166
		bodyModel[38] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Import ImportChassis167
		bodyModel[39] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import ImportChassis168
		bodyModel[40] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Import ImportChassis169
		bodyModel[41] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Import ImportChassis17
		bodyModel[42] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Import ImportChassis172
		bodyModel[43] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Import ImportChassis173
		bodyModel[44] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Import ImportChassis174
		bodyModel[45] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Import ImportChassis175
		bodyModel[46] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Import ImportChassis176
		bodyModel[47] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Import ImportChassis178
		bodyModel[48] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import ImportChassis179
		bodyModel[49] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import ImportChassis180
		bodyModel[50] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Import ImportChassis181
		bodyModel[51] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Import ImportChassis182
		bodyModel[52] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Import ImportChassis183
		bodyModel[53] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Import ImportChassis184
		bodyModel[54] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import ImportChassis185
		bodyModel[55] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Import ImportChassis186
		bodyModel[56] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import ImportChassis187
		bodyModel[57] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import ImportChassis191
		bodyModel[58] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Import ImportChassis192
		bodyModel[59] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Import ImportChassis193
		bodyModel[60] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Import ImportChassis2
		bodyModel[61] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Import ImportChassis21
		bodyModel[62] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Import ImportChassis22
		bodyModel[63] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Import ImportChassis23
		bodyModel[64] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Import ImportChassis24
		bodyModel[65] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Import ImportChassis25
		bodyModel[66] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Import ImportChassis26
		bodyModel[67] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Import ImportChassis28
		bodyModel[68] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Import ImportChassis29
		bodyModel[69] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Import ImportChassis30
		bodyModel[70] = new ModelRendererTurbo(this, 689, 1, textureX, textureY); // Import ImportChassis31
		bodyModel[71] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Import ImportChassis32
		bodyModel[72] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Import ImportChassis33
		bodyModel[73] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Import ImportChassis40
		bodyModel[74] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Import ImportChassis41
		bodyModel[75] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Import ImportChassis42
		bodyModel[76] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Import ImportChassis43
		bodyModel[77] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import ImportChassis44
		bodyModel[78] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Import ImportChassis46
		bodyModel[79] = new ModelRendererTurbo(this, 561, 57, textureX, textureY); // Import ImportChassis5
		bodyModel[80] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Import ImportChassis51
		bodyModel[81] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Import ImportChassis52
		bodyModel[82] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Import ImportChassis53
		bodyModel[83] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Import ImportChassis54
		bodyModel[84] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Import ImportChassis55
		bodyModel[85] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Import ImportChassis56
		bodyModel[86] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import ImportChassis57
		bodyModel[87] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Import ImportChassis58
		bodyModel[88] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Import ImportChassis59
		bodyModel[89] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Import ImportChassis6
		bodyModel[90] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Import ImportChassis61
		bodyModel[91] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Import ImportChassis62
		bodyModel[92] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Import ImportChassis63
		bodyModel[93] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Import ImportChassis64
		bodyModel[94] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Import ImportChassis65
		bodyModel[95] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Import ImportChassis66
		bodyModel[96] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Import ImportChassis67
		bodyModel[97] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Import ImportChassis69
		bodyModel[98] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Import ImportChassis7
		bodyModel[99] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Import ImportChassis7
		bodyModel[100] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Import ImportChassis70
		bodyModel[101] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Import ImportChassis71
		bodyModel[102] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Import ImportChassis73
		bodyModel[103] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Import ImportChassis74
		bodyModel[104] = new ModelRendererTurbo(this, 721, 57, textureX, textureY); // Import ImportChassis8
		bodyModel[105] = new ModelRendererTurbo(this, 817, 57, textureX, textureY); // Import ImportChassis9
		bodyModel[106] = new ModelRendererTurbo(this, 521, 9, textureX, textureY); // Import ImportChassis92
		bodyModel[107] = new ModelRendererTurbo(this, 553, 9, textureX, textureY); // Import ImportChassis93
		bodyModel[108] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Import ImportChassis94
		bodyModel[109] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Import ImportChassis95
		bodyModel[110] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Import Box585
		bodyModel[111] = new ModelRendererTurbo(this, 553, 73, textureX, textureY); // Import Box586
		bodyModel[112] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Box 390
		bodyModel[113] = new ModelRendererTurbo(this, 81, 129, textureX, textureY); // Box 391
		bodyModel[114] = new ModelRendererTurbo(this, 385, 129, textureX, textureY); // Box 392
		bodyModel[115] = new ModelRendererTurbo(this, 729, 129, textureX, textureY); // Box 393
		bodyModel[116] = new ModelRendererTurbo(this, 777, 129, textureX, textureY); // Box 394
		bodyModel[117] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Box 395
		bodyModel[118] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Box 396
		bodyModel[119] = new ModelRendererTurbo(this, 857, 129, textureX, textureY); // Box 397
		bodyModel[120] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 408

		bodyModel[0].addBox(-57.7F, -2.5F, 2.5F, 3, 1, 1, 0F); // Import ImportChassis1
		bodyModel[0].setRotationPoint(41F, -24F, 0F);

		bodyModel[1].addBox(29.5F, 8.5F, -24.5F, 3, 3, 49, 0F); // Import ImportChassis112
		bodyModel[1].setRotationPoint(41F, -26F, 0F);

		bodyModel[2].addBox(15.5F, 13.5F, -24.5F, 3, 3, 49, 0F); // Import ImportChassis113
		bodyModel[2].setRotationPoint(41F, -26F, 0F);

		bodyModel[3].addBox(0.5F, 13.5F, -24.5F, 3, 3, 49, 0F); // Import ImportChassis114
		bodyModel[3].setRotationPoint(41F, -26F, 0F);

		bodyModel[4].addBox(-14.5F, 13.5F, -24.5F, 3, 3, 49, 0F); // Import ImportChassis115
		bodyModel[4].setRotationPoint(41F, -26F, 0F);

		bodyModel[5].addBox(-29.5F, 13.5F, -24.5F, 3, 3, 49, 0F); // Import ImportChassis116
		bodyModel[5].setRotationPoint(41F, -26F, 0F);

		bodyModel[6].addBox(-44.5F, 13.5F, -24.5F, 3, 3, 49, 0F); // Import ImportChassis117
		bodyModel[6].setRotationPoint(41F, -26F, 0F);

		bodyModel[7].addShapeBox(35F, -7F, -19.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportChassis118
		bodyModel[7].setRotationPoint(35F, -37F, 0F);
		bodyModel[7].rotateAngleZ = -0.34906585F;

		bodyModel[8].addShapeBox(33F, -7F, -19.5F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportChassis120
		bodyModel[8].setRotationPoint(35F, -37F, 0F);
		bodyModel[8].rotateAngleZ = -0.34906585F;

		bodyModel[9].addShapeBox(33F, -7F, 18.5F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportChassis122
		bodyModel[9].setRotationPoint(35F, -37F, 0F);
		bodyModel[9].rotateAngleZ = -0.34906585F;

		bodyModel[10].addBox(34F, -7F, 18.5F, 1, 1, 1, 0F); // Import ImportChassis123
		bodyModel[10].setRotationPoint(35F, -37F, 0F);
		bodyModel[10].rotateAngleZ = -0.34906585F;

		bodyModel[11].addShapeBox(35F, -7F, 18.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportChassis124
		bodyModel[11].setRotationPoint(35F, -37F, 0F);
		bodyModel[11].rotateAngleZ = -0.34906585F;

		bodyModel[12].addShapeBox(24F, 2.5F, 4F, 4, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Import ImportChassis125
		bodyModel[12].setRotationPoint(41F, -33F, -20F);

		bodyModel[13].addShapeBox(23F, 1F, 4.5F, 3, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Import ImportChassis127
		bodyModel[13].setRotationPoint(41F, -33F, -20F);

		bodyModel[14].addBox(19F, 1F, 4.5F, 4, 3, 12, 0F); // Import ImportChassis128
		bodyModel[14].setRotationPoint(41F, -33F, -20F);

		bodyModel[15].addShapeBox(16F, 1F, 4.5F, 3, 2, 12, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Import ImportChassis129
		bodyModel[15].setRotationPoint(41F, -33F, -20F);

		bodyModel[16].addShapeBox(21.5F, 0.7F, 8.5F, 2, 1, 4, 0F,0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F); // Import ImportChassis130
		bodyModel[16].setRotationPoint(41F, -33F, -20F);

		bodyModel[17].addBox(20.5F, 0.7F, 8.5F, 1, 1, 4, 0F); // Import ImportChassis131
		bodyModel[17].setRotationPoint(41F, -33F, -20F);

		bodyModel[18].addShapeBox(18.5F, 0.7F, 8.5F, 2, 1, 4, 0F,-1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Import ImportChassis132
		bodyModel[18].setRotationPoint(41F, -33F, -20F);

		bodyModel[19].addShapeBox(23F, 0.5F, -1.5F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.6F, 0F, 0F, -.6F, 0F, 0F, -.6F, 0F, 0F, -.6F, 0F); // Import ImportChassis133
		bodyModel[19].setRotationPoint(41F, -33F, -20F);
		bodyModel[19].rotateAngleY = 0.54105207F;

		bodyModel[20].addShapeBox(23F, -1F, 3.5F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.6F, 0F, 0F, -.6F, 0F, 0F, -.6F, 0F, 0F, -.6F, 0F); // Import ImportChassis134
		bodyModel[20].setRotationPoint(41F, -32F, -20F);
		bodyModel[20].rotateAngleY = 0.54105207F;

		bodyModel[21].addShapeBox(14.5F, 0.7F, 15.5F, 2, 3, 3, 0F,-1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Import ImportChassis135
		bodyModel[21].setRotationPoint(41F, -33.5F, -20F);

		bodyModel[22].addBox(16.5F, 0.7F, 15.5F, 1, 3, 3, 0F); // Import ImportChassis136
		bodyModel[22].setRotationPoint(41F, -33.5F, -20F);

		bodyModel[23].addShapeBox(17.5F, 0.7F, 15.5F, 2, 3, 3, 0F,0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F); // Import ImportChassis137
		bodyModel[23].setRotationPoint(41F, -33.5F, -20F);

		bodyModel[24].addBox(27.3F, 1.5F, -8.5F, 1, 1, 4, 0F); // Import ImportChassis138
		bodyModel[24].setRotationPoint(41F, -33F, -20F);
		bodyModel[24].rotateAngleY = 0.78539816F;

		bodyModel[25].addBox(25.5F, 1.5F, 8F, 1, 1, 5, 0F); // Import ImportChassis139
		bodyModel[25].setRotationPoint(41F, -33F, -20F);

		bodyModel[26].addBox(-59F, 1F, -16F, 75, 22, 32, 0F); // Import ImportChassis14
		bodyModel[26].setRotationPoint(41F, -33F, 0F);

		bodyModel[27].addBox(12.5F, 1.5F, 0.5F, 1, 1, 4, 0F); // Import ImportChassis140
		bodyModel[27].setRotationPoint(41F, -33F, 0F);
		bodyModel[27].rotateAngleY = -0.78539816F;

		bodyModel[28].addBox(23F, 1F, 20.5F, 1, 4, 1, 0F); // Import ImportChassis157
		bodyModel[28].setRotationPoint(52F, -29F, -4F);

		bodyModel[29].addBox(23F, 1F, 27.5F, 1, 4, 1, 0F); // Import ImportChassis158
		bodyModel[29].setRotationPoint(52F, -29F, -4F);

		bodyModel[30].addBox(23F, 3F, 20.5F, 4, 1, 8, 0F); // Import ImportChassis159
		bodyModel[30].setRotationPoint(52F, -28F, -4F);

		bodyModel[31].addShapeBox(-61F, 15F, -16F, 8, 3, 32, 0F,1F, 5F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 1F, 5F, 0F, 1F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5.5F, 0F); // Import ImportChassis16
		bodyModel[31].setRotationPoint(35F, -28F, 0F);

		bodyModel[32].addBox(26F, 1F, 20.5F, 1, 4, 1, 0F); // Import ImportChassis161
		bodyModel[32].setRotationPoint(52F, -29F, -4F);

		bodyModel[33].addBox(26F, 1F, 27.5F, 1, 4, 1, 0F); // Import ImportChassis162
		bodyModel[33].setRotationPoint(52F, -29F, -4F);

		bodyModel[34].addBox(24F, 1F, 22F, 2, 2, 2, 0F); // Import ImportChassis163
		bodyModel[34].setRotationPoint(52F, -28F, -4F);

		bodyModel[35].addBox(24F, 1F, 24.3F, 2, 2, 2, 0F); // Import ImportChassis164
		bodyModel[35].setRotationPoint(52F, -28F, -4F);

		bodyModel[36].addBox(24F, 1F, 26.5F, 2, 1, 1, 0F); // Import ImportChassis165
		bodyModel[36].setRotationPoint(52F, -28F, -4F);

		bodyModel[37].addShapeBox(26F, 1F, 22.5F, 1, 3, 1, 0F,-.8F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, -.8F, 0F, -.4F, -.8F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, -.8F, 0F, -.4F); // Import ImportChassis166
		bodyModel[37].setRotationPoint(52F, -28F, -4F);

		bodyModel[38].addShapeBox(26F, 1F, 24F, 1, 3, 1, 0F,-.8F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, -.8F, 0F, -.4F, -.8F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, -.8F, 0F, -.4F); // Import ImportChassis167
		bodyModel[38].setRotationPoint(52F, -28F, -4F);

		bodyModel[39].addShapeBox(26F, 1F, 25.5F, 1, 3, 1, 0F,-.8F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, -.8F, 0F, -.4F, -.8F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, -.8F, 0F, -.4F); // Import ImportChassis168
		bodyModel[39].setRotationPoint(52F, -28F, -4F);

		bodyModel[40].addShapeBox(24F, 0F, 21.5F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F); // Import ImportChassis169
		bodyModel[40].setRotationPoint(52F, -28F, -4F);

		bodyModel[41].addShapeBox(-64F, 1F, -16F, 15, 15, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import ImportChassis17
		bodyModel[41].setRotationPoint(35F, -32F, 0F);

		bodyModel[42].addBox(23F, 1F, -28.5F, 1, 4, 1, 0F); // Import ImportChassis172
		bodyModel[42].setRotationPoint(52F, -29F, 4F);

		bodyModel[43].addBox(23F, 1F, -21.5F, 1, 3, 1, 0F); // Import ImportChassis173
		bodyModel[43].setRotationPoint(52F, -28F, 0F);

		bodyModel[44].addBox(23F, 3F, -28.5F, 4, 1, 8, 0F); // Import ImportChassis174
		bodyModel[44].setRotationPoint(52F, -28F, 4F);

		bodyModel[45].addBox(26F, 1F, -28.5F, 1, 4, 1, 0F); // Import ImportChassis175
		bodyModel[45].setRotationPoint(52F, -29F, 4F);

		bodyModel[46].addBox(26F, 1F, -21.5F, 1, 4, 1, 0F); // Import ImportChassis176
		bodyModel[46].setRotationPoint(52F, -29F, 4F);

		bodyModel[47].addBox(24F, 1F, -24F, 2, 2, 2, 0F); // Import ImportChassis178
		bodyModel[47].setRotationPoint(52F, -28F, 4F);

		bodyModel[48].addBox(24F, 1F, -26.3F, 2, 2, 2, 0F); // Import ImportChassis179
		bodyModel[48].setRotationPoint(52F, -28F, 4F);

		bodyModel[49].addBox(24F, 1F, -27.5F, 2, 1, 1, 0F); // Import ImportChassis180
		bodyModel[49].setRotationPoint(52F, -28F, 4F);

		bodyModel[50].addShapeBox(26F, 1F, -26.5F, 1, 3, 1, 0F,-.8F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, -.8F, 0F, -.4F, -.8F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, -.8F, 0F, -.4F); // Import ImportChassis181
		bodyModel[50].setRotationPoint(52F, -28F, 4F);

		bodyModel[51].addShapeBox(26F, 1F, -25F, 1, 3, 1, 0F,-.8F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, -.8F, 0F, -.4F, -.8F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, -.8F, 0F, -.4F); // Import ImportChassis182
		bodyModel[51].setRotationPoint(52F, -28F, 4F);

		bodyModel[52].addShapeBox(26F, 1F, -23.5F, 1, 3, 1, 0F,-.8F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, -.8F, 0F, -.4F, -.8F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, -.8F, 0F, -.4F); // Import ImportChassis183
		bodyModel[52].setRotationPoint(52F, -28F, 4F);

		bodyModel[53].addBox(-64F, 4.5F, 20F, 1, 1, 9, 0F); // Import ImportChassis184
		bodyModel[53].setRotationPoint(35F, -26F, -4F);

		bodyModel[54].addBox(-64F, 4.5F, -29F, 1, 1, 9, 0F); // Import ImportChassis185
		bodyModel[54].setRotationPoint(35F, -26F, 4F);

		bodyModel[55].addBox(-65.5F, 2F, -27.5F, 2, 1, 3, 0F); // Import ImportChassis186
		bodyModel[55].setRotationPoint(35F, -32F, 4F);

		bodyModel[56].addBox(-3F, -65F, -19.5F, 3, 1, 1, 0F); // Import ImportChassis187
		bodyModel[56].setRotationPoint(35F, -32F, 4F);
		bodyModel[56].rotateAngleZ = 1.57079633F;

		bodyModel[57].addBox(-2F, -67F, -19.5F, 1, 1, 1, 0F); // Import ImportChassis191
		bodyModel[57].setRotationPoint(35F, -32F, 4F);
		bodyModel[57].rotateAngleZ = 1.57079633F;

		bodyModel[58].addShapeBox(-1F, -67F, -19.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportChassis192
		bodyModel[58].setRotationPoint(35F, -32F, 4F);
		bodyModel[58].rotateAngleZ = 1.57079633F;

		bodyModel[59].addShapeBox(-3F, -67F, -19.5F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportChassis193
		bodyModel[59].setRotationPoint(35F, -32F, 4F);
		bodyModel[59].rotateAngleZ = 1.57079633F;

		bodyModel[60].addBox(-58F, 10F, -23.5F, 2, 2, 47, 0F); // Import ImportChassis2
		bodyModel[60].setRotationPoint(129F, -27F, 0F);

		bodyModel[61].addBox(-48.5F, -2.3F, -7F, 20, 1, 14, 0F); // Import ImportChassis21
		bodyModel[61].setRotationPoint(41F, -24F, 0F);

		bodyModel[62].addBox(-63F, -3F, 5F, 9, 1, 5, 0F); // Import ImportChassis22
		bodyModel[62].setRotationPoint(41F, -24F, 0F);

		bodyModel[63].addBox(-63F, -3F, -9F, 1, 1, 14, 0F); // Import ImportChassis23
		bodyModel[63].setRotationPoint(41F, -24F, 0F);

		bodyModel[64].addBox(-62F, -2.2F, -9F, 9, 1, 15, 0F); // Import ImportChassis24
		bodyModel[64].setRotationPoint(41F, -24F, 0F);

		bodyModel[65].addBox(-61.7F, -3F, 2F, 1, 1, 2, 0F); // Import ImportChassis25
		bodyModel[65].setRotationPoint(41F, -24F, 0F);

		bodyModel[66].addBox(-61.7F, -3F, -8F, 1, 1, 2, 0F); // Import ImportChassis26
		bodyModel[66].setRotationPoint(41F, -24F, 0F);

		bodyModel[67].addBox(-59.7F, -3F, -8F, 2, 1, 2, 0F); // Import ImportChassis28
		bodyModel[67].setRotationPoint(41F, -24F, 0F);

		bodyModel[68].addBox(-57.7F, -2.5F, -7.5F, 3, 1, 1, 0F); // Import ImportChassis29
		bodyModel[68].setRotationPoint(41F, -24F, 0F);

		bodyModel[69].addShapeBox(-60.7F, -3F, 3F, 1, 1, 1, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportChassis30
		bodyModel[69].setRotationPoint(41F, -24F, 0F);

		bodyModel[70].addBox(-59.7F, -3F, 2F, 2, 1, 2, 0F); // Import ImportChassis31
		bodyModel[70].setRotationPoint(41F, -24F, 0F);

		bodyModel[71].addShapeBox(-60.7F, -3F, -7F, 1, 1, 1, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportChassis32
		bodyModel[71].setRotationPoint(41F, -24F, 0F);

		bodyModel[72].addShapeBox(-60.7F, -3F, -8F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Import ImportChassis33
		bodyModel[72].setRotationPoint(41F, -24F, 0F);

		bodyModel[73].addShapeBox(16F, 0F, 20F, 18, 4, 9, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportChassis40
		bodyModel[73].setRotationPoint(41F, -32F, -4F);

		bodyModel[74].addBox(-64F, 3.5F, -29F, 80, 7, 9, 0F); // Import ImportChassis41
		bodyModel[74].setRotationPoint(35F, -32F, 4F);

		bodyModel[75].addBox(-64F, 3.5F, 20F, 80, 7, 9, 0F); // Import ImportChassis42
		bodyModel[75].setRotationPoint(35F, -32F, -4F);

		bodyModel[76].addShapeBox(34F, 3.5F, 20F, 4, 1, 9, 0F,0F, 0F, 0F, .5F, -3F, 0F, .5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2.5F, 0F, -1F, 2.5F, 0F, 0F, 0F, 0F); // Import ImportChassis43
		bodyModel[76].setRotationPoint(41F, -28F, -4F);

		bodyModel[77].addShapeBox(34F, 3.5F, -29F, 4, 1, 9, 0F,0F, 0F, 0F, .5F, -3F, 0F, .5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2.5F, 0F, -1F, 2.5F, 0F, 0F, 0F, 0F); // Import ImportChassis44
		bodyModel[77].setRotationPoint(41F, -28F, 4F);

		bodyModel[78].addBox(-64.2F, 2.3F, 19F, 1, 1, 1, 0F); // Import ImportChassis46
		bodyModel[78].setRotationPoint(35F, -32F, 0F);

		bodyModel[79].addShapeBox(-64F, 0F, 16F, 86, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportChassis5
		bodyModel[79].setRotationPoint(35F, -32F, 0F);

		bodyModel[80].addShapeBox(-65.5F, 1F, 20.5F, 2, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportChassis51
		bodyModel[80].setRotationPoint(35F, -32F, 0F);

		bodyModel[81].addBox(-65.5F, 2F, 20.5F, 2, 1, 3, 0F); // Import ImportChassis52
		bodyModel[81].setRotationPoint(35F, -32F, 0F);

		bodyModel[82].addShapeBox(-65.5F, 3F, 20.5F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportChassis53
		bodyModel[82].setRotationPoint(35F, -32F, 0F);

		bodyModel[83].addShapeBox(-64.5F, -0.2F, 19F, 1, 1, 1, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportChassis54
		bodyModel[83].setRotationPoint(35F, -32F, 0F);

		bodyModel[84].addShapeBox(-64.3F, -0.2F, 17F, 1, 1, 3, 0F,0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F); // Import ImportChassis55
		bodyModel[84].setRotationPoint(35F, -32F, 0F);

		bodyModel[85].addShapeBox(-64.5F, -0.2F, 17F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Import ImportChassis56
		bodyModel[85].setRotationPoint(35F, -32F, 0F);

		bodyModel[86].addShapeBox(-64.2F, 0.3F, 19F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Import ImportChassis57
		bodyModel[86].setRotationPoint(35F, -32F, 0F);

		bodyModel[87].addShapeBox(-64.2F, 0.3F, 17F, 1, 2, 1, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportChassis58
		bodyModel[87].setRotationPoint(35F, -32F, 0F);

		bodyModel[88].addShapeBox(-64.2F, 1.3F, 17F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportChassis59
		bodyModel[88].setRotationPoint(35F, -32F, 0F);

		bodyModel[89].addShapeBox(-60.7F, -3F, 2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Import ImportChassis6
		bodyModel[89].setRotationPoint(41F, -24F, 0F);

		bodyModel[90].addBox(-64.2F, 2.3F, 17F, 1, 1, 1, 0F); // Import ImportChassis61
		bodyModel[90].setRotationPoint(35F, -32F, 0F);

		bodyModel[91].addShapeBox(-64.2F, 3.3F, 17F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportChassis62
		bodyModel[91].setRotationPoint(35F, -32F, 0F);

		bodyModel[92].addBox(-3F, -65F, 14.5F, 3, 1, 1, 0F); // Import ImportChassis63
		bodyModel[92].setRotationPoint(41F, -26F, 0F);
		bodyModel[92].rotateAngleZ = 1.57079633F;

		bodyModel[93].addShapeBox(-1F, -67F, 14.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportChassis64
		bodyModel[93].setRotationPoint(41F, -26F, 0F);
		bodyModel[93].rotateAngleZ = 1.57079633F;

		bodyModel[94].addBox(-2F, -67F, 14.5F, 1, 1, 1, 0F); // Import ImportChassis65
		bodyModel[94].setRotationPoint(41F, -26F, 0F);
		bodyModel[94].rotateAngleZ = 1.57079633F;

		bodyModel[95].addShapeBox(-3F, -67F, 14.5F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportChassis66
		bodyModel[95].setRotationPoint(41F, -26F, 0F);
		bodyModel[95].rotateAngleZ = 1.57079633F;

		bodyModel[96].addShapeBox(-65.5F, 1F, -27.5F, 2, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportChassis67
		bodyModel[96].setRotationPoint(35F, -32F, 4F);

		bodyModel[97].addShapeBox(-65.5F, 3F, -27.5F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportChassis69
		bodyModel[97].setRotationPoint(35F, -32F, 4F);

		bodyModel[98].addShapeBox(-43F, 53.5F, -28.5F, 1, 2, 8, 0F,-.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F); // Import ImportChassis7
		bodyModel[98].setRotationPoint(35F, -26F, 4F);
		bodyModel[98].rotateAngleZ = -0.75049158F;

		bodyModel[99].addBox(34F, -7F, -19.5F, 1, 1, 1, 0F); // Import ImportChassis7
		bodyModel[99].setRotationPoint(35F, -37F, 0F);
		bodyModel[99].rotateAngleZ = -0.34906585F;

		bodyModel[100].addBox(-65.5F, 2F, -24.3F, 2, 1, 1, 0F); // Import ImportChassis70
		bodyModel[100].setRotationPoint(35F, -32F, 4F);

		bodyModel[101].addShapeBox(-64F, 5.5F, -29F, 1, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, -.5F, 0F); // Import ImportChassis71
		bodyModel[101].setRotationPoint(35F, -26F, 4F);

		bodyModel[102].addShapeBox(-64F, 5.5F, 20F, 1, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, -.5F, 0F); // Import ImportChassis73
		bodyModel[102].setRotationPoint(35F, -26F, -4F);

		bodyModel[103].addShapeBox(-43F, 53.5F, 20.5F, 1, 2, 8, 0F,-.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F); // Import ImportChassis74
		bodyModel[103].setRotationPoint(35F, -26F, -4F);
		bodyModel[103].rotateAngleZ = -0.75049158F;

		bodyModel[104].addShapeBox(16F, 1F, -16F, 14, 22, 32, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -5F, 0F, 3F, -5F, 0F, 0F, 0F, 0F); // Import ImportChassis8
		bodyModel[104].setRotationPoint(41F, -33F, 0F);

		bodyModel[105].addShapeBox(30F, 4F, -16F, 10, 11, 32, 0F,0F, 0F, 0F, -6F, -2.5F, 0F, -6F, -2.5F, 0F, 0F, 0F, 0F, -3F, 3F, 0F, -5.5F, -8F, 0F, -5.5F, -8F, 0F, -3F, 3F, 0F); // Import ImportChassis9
		bodyModel[105].setRotationPoint(41F, -33F, 0F);

		bodyModel[106].addBox(-36.5F, -3.7F, 12F, 8, 1, 5, 0F); // Import ImportChassis92
		bodyModel[106].setRotationPoint(41F, -24F, 0F);
		bodyModel[106].rotateAngleX = -0.10471976F;

		bodyModel[107].addBox(-62.5F, -3.7F, 13F, 14, 1, 4, 0F); // Import ImportChassis93
		bodyModel[107].setRotationPoint(41F, -24F, 0F);
		bodyModel[107].rotateAngleX = -0.10471976F;

		bodyModel[108].addBox(-36.5F, -3.7F, -17F, 8, 1, 5, 0F); // Import ImportChassis94
		bodyModel[108].setRotationPoint(41F, -24F, 0F);
		bodyModel[108].rotateAngleX = 0.10471976F;

		bodyModel[109].addBox(-62.5F, -3.7F, -17F, 14, 1, 4, 0F); // Import ImportChassis95
		bodyModel[109].setRotationPoint(41F, -24F, 0F);
		bodyModel[109].rotateAngleX = 0.10471976F;

		bodyModel[110].addShapeBox(16F, 0F, -20F, 18, 4, 9, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box585
		bodyModel[110].setRotationPoint(41F, -32F, -5F);

		bodyModel[111].addShapeBox(-64F, 0F, -20F, 86, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box586
		bodyModel[111].setRotationPoint(35F, -32F, -5F);

		bodyModel[112].addShapeBox(34F, 3.5F, 20F, 12, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		bodyModel[112].setRotationPoint(29F, -32F, -4F);

		bodyModel[113].addShapeBox(34F, 3.5F, -20F, 12, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		bodyModel[113].setRotationPoint(29F, -32F, -5F);

		bodyModel[114].addShapeBox(-64F, 3.5F, 20F, 12, 7, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 392
		bodyModel[114].setRotationPoint(115F, -32F, -4F);

		bodyModel[115].addShapeBox(-64F, 3.5F, -29F, 12, 7, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 393
		bodyModel[115].setRotationPoint(115F, -32F, 4F);

		bodyModel[116].addShapeBox(-64F, 1F, -8F, 6, 14, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 394
		bodyModel[116].setRotationPoint(34F, -31F, 0F);

		bodyModel[117].addShapeBox(26F, 0F, -20.5F, 4, 1, 8, 0F,0F, 0F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395
		bodyModel[117].setRotationPoint(49F, -29F, -4F);

		bodyModel[118].addShapeBox(26F, 0F, 20.5F, 4, 1, 8, 0F,0F, 0F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[118].setRotationPoint(49F, -29F, -4F);

		bodyModel[119].addShapeBox(-64F, 0F, 0F, 30, 3, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[119].setRotationPoint(50F, -33F, -15F);

		bodyModel[120].addBox(-44.5F, 13.5F, -24.5F, 3, 3, 49, 0F); // Box 408
		bodyModel[120].setRotationPoint(25F, -26F, 0F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 0
		turretModel[1] = new ModelRendererTurbo(this, 609, 105, textureX, textureY); // Box 330
		turretModel[2] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Box 331
		turretModel[3] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 332
		turretModel[4] = new ModelRendererTurbo(this, 561, 105, textureX, textureY); // Box 333
		turretModel[5] = new ModelRendererTurbo(this, 673, 105, textureX, textureY); // Box 334
		turretModel[6] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 335
		turretModel[7] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Box 336
		turretModel[8] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 340
		turretModel[9] = new ModelRendererTurbo(this, 985, 97, textureX, textureY); // Box 341
		turretModel[10] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Box 342
		turretModel[11] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 343
		turretModel[12] = new ModelRendererTurbo(this, 369, 113, textureX, textureY); // Box 344
		turretModel[13] = new ModelRendererTurbo(this, 721, 113, textureX, textureY); // Box 345
		turretModel[14] = new ModelRendererTurbo(this, 753, 113, textureX, textureY); // Box 346
		turretModel[15] = new ModelRendererTurbo(this, 993, 113, textureX, textureY); // Box 347
		turretModel[16] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Box 348
		turretModel[17] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Box 349
		turretModel[18] = new ModelRendererTurbo(this, 457, 121, textureX, textureY); // Box 350
		turretModel[19] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 351
		turretModel[20] = new ModelRendererTurbo(this, 1017, 41, textureX, textureY); // Box 352
		turretModel[21] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 353
		turretModel[22] = new ModelRendererTurbo(this, 1017, 81, textureX, textureY); // Box 354
		turretModel[23] = new ModelRendererTurbo(this, 713, 89, textureX, textureY); // Box 355
		turretModel[24] = new ModelRendererTurbo(this, 1017, 97, textureX, textureY); // Box 356
		turretModel[25] = new ModelRendererTurbo(this, 785, 113, textureX, textureY); // Box 357
		turretModel[26] = new ModelRendererTurbo(this, 793, 113, textureX, textureY); // Box 358
		turretModel[27] = new ModelRendererTurbo(this, 801, 113, textureX, textureY); // Box 359
		turretModel[28] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 360
		turretModel[29] = new ModelRendererTurbo(this, 561, 89, textureX, textureY); // Box 361
		turretModel[30] = new ModelRendererTurbo(this, 665, 89, textureX, textureY); // Box 362
		turretModel[31] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 363
		turretModel[32] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Box 364
		turretModel[33] = new ModelRendererTurbo(this, 601, 121, textureX, textureY); // Box 365
		turretModel[34] = new ModelRendererTurbo(this, 721, 121, textureX, textureY); // Box 366
		turretModel[35] = new ModelRendererTurbo(this, 753, 121, textureX, textureY); // Box 367
		turretModel[36] = new ModelRendererTurbo(this, 809, 121, textureX, textureY); // Box 368
		turretModel[37] = new ModelRendererTurbo(this, 841, 121, textureX, textureY); // Box 369
		turretModel[38] = new ModelRendererTurbo(this, 873, 121, textureX, textureY); // Box 370
		turretModel[39] = new ModelRendererTurbo(this, 905, 121, textureX, textureY); // Box 371
		turretModel[40] = new ModelRendererTurbo(this, 937, 121, textureX, textureY); // Box 372
		turretModel[41] = new ModelRendererTurbo(this, 969, 121, textureX, textureY); // Box 373
		turretModel[42] = new ModelRendererTurbo(this, 633, 121, textureX, textureY); // Box 374
		turretModel[43] = new ModelRendererTurbo(this, 641, 121, textureX, textureY); // Box 375
		turretModel[44] = new ModelRendererTurbo(this, 1001, 121, textureX, textureY); // Box 376
		turretModel[45] = new ModelRendererTurbo(this, 1009, 121, textureX, textureY); // Box 377
		turretModel[46] = new ModelRendererTurbo(this, 1017, 121, textureX, textureY); // Box 378
		turretModel[47] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 379
		turretModel[48] = new ModelRendererTurbo(this, 9, 129, textureX, textureY); // Box 380
		turretModel[49] = new ModelRendererTurbo(this, 17, 129, textureX, textureY); // Box 381
		turretModel[50] = new ModelRendererTurbo(this, 25, 129, textureX, textureY); // Box 382
		turretModel[51] = new ModelRendererTurbo(this, 737, 113, textureX, textureY); // Box 383
		turretModel[52] = new ModelRendererTurbo(this, 769, 113, textureX, textureY); // Box 384
		turretModel[53] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 385
		turretModel[54] = new ModelRendererTurbo(this, 617, 121, textureX, textureY); // Box 386
		turretModel[55] = new ModelRendererTurbo(this, 705, 121, textureX, textureY); // Box 387
		turretModel[56] = new ModelRendererTurbo(this, 825, 121, textureX, textureY); // Box 388
		turretModel[57] = new ModelRendererTurbo(this, 857, 121, textureX, textureY); // Box 389
		turretModel[58] = new ModelRendererTurbo(this, 865, 137, textureX, textureY); // Box 424
		turretModel[59] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Box 425
		turretModel[60] = new ModelRendererTurbo(this, 97, 145, textureX, textureY); // Box 426
		turretModel[61] = new ModelRendererTurbo(this, 505, 169, textureX, textureY); // Box 460
		turretModel[62] = new ModelRendererTurbo(this, 545, 169, textureX, textureY); // Box 461
		turretModel[63] = new ModelRendererTurbo(this, 601, 169, textureX, textureY); // Box 462
		turretModel[64] = new ModelRendererTurbo(this, 641, 169, textureX, textureY); // Box 463
		turretModel[65] = new ModelRendererTurbo(this, 681, 169, textureX, textureY); // Box 464
		turretModel[66] = new ModelRendererTurbo(this, 721, 169, textureX, textureY); // Box 465
		turretModel[67] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 466
		turretModel[68] = new ModelRendererTurbo(this, 561, 41, textureX, textureY); // Box 467

		turretModel[0].addShapeBox(0F, 0F, 0F, 35, 12, 46, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 0
		turretModel[0].setRotationPoint(-29F, -45F, -23F);

		turretModel[1].addShapeBox(0F, 0F, 0F, 10, 5, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -4.9F, 0F, 0F, -4.9F, 0F, 0F, 0F, 4F); // Box 330
		turretModel[1].setRotationPoint(5F, -50F, -19F);

		turretModel[2].addShapeBox(0F, 0F, 0F, 11, 17, 28, 0F,0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 4F, 0F, 1F, 4F, 0F, 2F, 0F, 0F, 5F); // Box 331
		turretModel[2].setRotationPoint(15F, -50F, -14F);

		turretModel[3].addShapeBox(0F, 0F, 0F, 34, 5, 46, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		turretModel[3].setRotationPoint(-29F, -50F, -23F);

		turretModel[4].addShapeBox(0F, 0F, 0F, 10, 17, 9, 0F,0F, 0F, -5F, 0F, 0F, -4.9F, 0F, 0F, -4F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -1F, -1F, 0F, 3F); // Box 333
		turretModel[4].setRotationPoint(5F, -50F, 14F);

		turretModel[5].addShapeBox(0F, 0F, 0F, 11, 17, 9, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -8.9F, 0F, 0F, -3.9F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, -6F, -3F, 0F, -1F); // Box 334
		turretModel[5].setRotationPoint(15F, -50F, 14F);

		turretModel[6].addShapeBox(0F, 0F, 0F, 10, 17, 9, 0F,0F, -5F, 0F, 0F, 0F, -4F, 0F, 0F, -4.9F, 0F, 0F, -5F, -1F, 0F, 3F, 3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		turretModel[6].setRotationPoint(5F, -50F, -23F);

		turretModel[7].addShapeBox(0F, 0F, 0F, 11, 17, 9, 0F,0F, 0F, -3.9F, 0F, 0F, -8.9F, 0F, 0F, 0F, 0F, 0F, -5F, -3F, 0F, -1F, 4F, 0F, -6F, 4F, 0F, 0F, 0F, 0F, 0F); // Box 336
		turretModel[7].setRotationPoint(15F, -50F, -23F);

		turretModel[8].addShapeBox(0F, 0F, 0F, 7, 6, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F); // Box 340
		turretModel[8].setRotationPoint(-36F, -40F, -7F);

		turretModel[9].addShapeBox(0F, 0F, 0F, 3, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		turretModel[9].setRotationPoint(-32F, -49.9F, -5F);

		turretModel[10].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
		turretModel[10].setRotationPoint(-40F, -46.9F, -20.5F);

		turretModel[11].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		turretModel[11].setRotationPoint(-40F, -46.9F, -9.5F);

		turretModel[12].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		turretModel[12].setRotationPoint(-40F, -43.4F, -9.5F);

		turretModel[13].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		turretModel[13].setRotationPoint(-40F, -43.4F, -20.5F);

		turretModel[14].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 346
		turretModel[14].setRotationPoint(-40F, -39.9F, -9.5F);

		turretModel[15].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		turretModel[15].setRotationPoint(-40F, -39.9F, -20.5F);

		turretModel[16].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		turretModel[16].setRotationPoint(-40F, -37.4F, -12F);

		turretModel[17].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		turretModel[17].setRotationPoint(-40F, -37.4F, -18F);

		turretModel[18].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		turretModel[18].setRotationPoint(-40F, -37.4F, -15F);

		turretModel[19].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		turretModel[19].setRotationPoint(-40F, -46.9F, -9.5F);

		turretModel[20].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		turretModel[20].setRotationPoint(-40F, -46.9F, -20.5F);

		turretModel[21].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		turretModel[21].setRotationPoint(-40F, -46.9F, -12F);

		turretModel[22].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		turretModel[22].setRotationPoint(-40F, -46.9F, -15F);

		turretModel[23].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355
		turretModel[23].setRotationPoint(-40F, -46.9F, -18F);

		turretModel[24].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
		turretModel[24].setRotationPoint(-36F, -46.9F, -20.5F);

		turretModel[25].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		turretModel[25].setRotationPoint(-36F, -46.9F, -9.5F);

		turretModel[26].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		turretModel[26].setRotationPoint(-32F, -46.9F, -20.5F);

		turretModel[27].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		turretModel[27].setRotationPoint(-32F, -46.9F, -9.5F);

		turretModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		turretModel[28].setRotationPoint(-36F, -37.4F, -20.5F);

		turretModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		turretModel[29].setRotationPoint(-32F, -37.4F, -20.5F);

		turretModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		turretModel[30].setRotationPoint(-40F, -43.4F, -20.5F);

		turretModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 363
		turretModel[31].setRotationPoint(-40F, -39.9F, -20.5F);

		turretModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		turretModel[32].setRotationPoint(-40F, -46.9F, -20.5F);

		turretModel[33].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		turretModel[33].setRotationPoint(-40F, -46.9F, 19.5F);

		turretModel[34].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		turretModel[34].setRotationPoint(-40F, -46.9F, 8.5F);

		turretModel[35].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		turretModel[35].setRotationPoint(-40F, -43.4F, 8.5F);

		turretModel[36].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		turretModel[36].setRotationPoint(-40F, -43.4F, 19.5F);

		turretModel[37].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		turretModel[37].setRotationPoint(-40F, -39.9F, 8.5F);

		turretModel[38].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		turretModel[38].setRotationPoint(-40F, -39.9F, 19.5F);

		turretModel[39].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		turretModel[39].setRotationPoint(-40F, -37.4F, 11F);

		turretModel[40].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		turretModel[40].setRotationPoint(-40F, -37.4F, 17F);

		turretModel[41].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		turretModel[41].setRotationPoint(-40F, -37.4F, 14F);

		turretModel[42].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		turretModel[42].setRotationPoint(-40F, -46.9F, 8.5F);

		turretModel[43].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		turretModel[43].setRotationPoint(-40F, -46.9F, 19.5F);

		turretModel[44].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		turretModel[44].setRotationPoint(-40F, -46.9F, 11F);

		turretModel[45].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		turretModel[45].setRotationPoint(-40F, -46.9F, 14F);

		turretModel[46].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		turretModel[46].setRotationPoint(-40F, -46.9F, 17F);

		turretModel[47].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		turretModel[47].setRotationPoint(-36F, -46.9F, 19.5F);

		turretModel[48].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		turretModel[48].setRotationPoint(-36F, -46.9F, 8.5F);

		turretModel[49].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
		turretModel[49].setRotationPoint(-32F, -46.9F, 19.5F);

		turretModel[50].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		turretModel[50].setRotationPoint(-32F, -46.9F, 8.5F);

		turretModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		turretModel[51].setRotationPoint(-36F, -37.4F, 8.5F);

		turretModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		turretModel[52].setRotationPoint(-32F, -37.4F, 8.5F);

		turretModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
		turretModel[53].setRotationPoint(-40F, -43.4F, 8.5F);

		turretModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386
		turretModel[54].setRotationPoint(-40F, -39.9F, 8.5F);

		turretModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		turretModel[55].setRotationPoint(-40F, -46.9F, 8.5F);

		turretModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388
		turretModel[56].setRotationPoint(-40F, -37.4F, 8.5F);

		turretModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		turretModel[57].setRotationPoint(-40F, -37.4F, -20.5F);

		turretModel[58].addShapeBox(0F, 0F, 0F, 6, 7, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		turretModel[58].setRotationPoint(10F, -57F, -17F);

		turretModel[59].addShapeBox(0F, 0F, 0F, 6, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 425
		turretModel[59].setRotationPoint(10F, -57F, -13F);

		turretModel[60].addShapeBox(0F, 0F, 0F, 6, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 426
		turretModel[60].setRotationPoint(10F, -57F, -15F);

		turretModel[61].addShapeBox(0F, 0F, 0F, 4, 2, 12, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 460
		turretModel[61].setRotationPoint(-15F, -52F, 5F);

		turretModel[62].addShapeBox(0F, 0F, 0F, 4, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 461
		turretModel[62].setRotationPoint(-11F, -52F, 5F);

		turretModel[63].addShapeBox(0F, 0F, 0F, 4, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 462
		turretModel[63].setRotationPoint(-7F, -52F, 5F);

		turretModel[64].addShapeBox(0F, 0F, 0F, 4, 2, 12, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 463
		turretModel[64].setRotationPoint(-15F, -52F, -17F);

		turretModel[65].addShapeBox(0F, 0F, 0F, 4, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 464
		turretModel[65].setRotationPoint(-11F, -52F, -17F);

		turretModel[66].addShapeBox(0F, 0F, 0F, 4, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 465
		turretModel[66].setRotationPoint(-7F, -52F, -17F);

		turretModel[67].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 3F, 1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 3F, 1F, 0F); // Box 466
		turretModel[67].setRotationPoint(-3F, -54F, 9.5F);

		turretModel[68].addShapeBox(-1F, 0F, -1F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
		turretModel[68].setRotationPoint(2F, -59F, 11F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Box 427
		barrelModel[1] = new ModelRendererTurbo(this, 385, 153, textureX, textureY); // Box 428
		barrelModel[2] = new ModelRendererTurbo(this, 609, 153, textureX, textureY); // Box 429
		barrelModel[3] = new ModelRendererTurbo(this, 665, 153, textureX, textureY); // Box 430
		barrelModel[4] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 431
		barrelModel[5] = new ModelRendererTurbo(this, 105, 169, textureX, textureY); // Box 432
		barrelModel[6] = new ModelRendererTurbo(this, 617, 89, textureX, textureY); // Box 433
		barrelModel[7] = new ModelRendererTurbo(this, 641, 89, textureX, textureY); // Box 434
		barrelModel[8] = new ModelRendererTurbo(this, 921, 89, textureX, textureY); // Box 435
		barrelModel[9] = new ModelRendererTurbo(this, 945, 89, textureX, textureY); // Box 436
		barrelModel[10] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 437
		barrelModel[11] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 438
		barrelModel[12] = new ModelRendererTurbo(this, 353, 145, textureX, textureY); // Box 439
		barrelModel[13] = new ModelRendererTurbo(this, 953, 145, textureX, textureY); // Box 440
		barrelModel[14] = new ModelRendererTurbo(this, 113, 153, textureX, textureY); // Box 441
		barrelModel[15] = new ModelRendererTurbo(this, 825, 153, textureX, textureY); // Box 442
		barrelModel[16] = new ModelRendererTurbo(this, 985, 153, textureX, textureY); // Box 443
		barrelModel[17] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 444
		barrelModel[18] = new ModelRendererTurbo(this, 809, 129, textureX, textureY); // Box 445
		barrelModel[19] = new ModelRendererTurbo(this, 713, 137, textureX, textureY); // Box 446
		barrelModel[20] = new ModelRendererTurbo(this, 601, 161, textureX, textureY); // Box 447
		barrelModel[21] = new ModelRendererTurbo(this, 761, 161, textureX, textureY); // Box 448
		barrelModel[22] = new ModelRendererTurbo(this, 777, 161, textureX, textureY); // Box 449
		barrelModel[23] = new ModelRendererTurbo(this, 793, 161, textureX, textureY); // Box 454
		barrelModel[24] = new ModelRendererTurbo(this, 209, 169, textureX, textureY); // Box 455
		barrelModel[25] = new ModelRendererTurbo(this, 249, 169, textureX, textureY); // Box 456
		barrelModel[26] = new ModelRendererTurbo(this, 289, 169, textureX, textureY); // Box 457
		barrelModel[27] = new ModelRendererTurbo(this, 441, 169, textureX, textureY); // Box 458
		barrelModel[28] = new ModelRendererTurbo(this, 481, 169, textureX, textureY); // Box 459

		barrelModel[0].addShapeBox(0F, 0F, -1F, 25, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
		barrelModel[0].setRotationPoint(22F, -44F, 0F);

		barrelModel[1].addShapeBox(0F, 0F, -3F, 25, 6, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		barrelModel[1].setRotationPoint(22F, -44F, 0F);

		barrelModel[2].addShapeBox(0F, 0F, 1F, 25, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 429
		barrelModel[2].setRotationPoint(22F, -44F, 0F);

		barrelModel[3].addShapeBox(25F, 0F, -3F, 47, 6, 2, 0F,0F, -2F, -0.3F, 0F, -2F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -2F, -0.3F, 0F, -2F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 430
		barrelModel[3].setRotationPoint(22F, -44F, 0F);

		barrelModel[4].addShapeBox(25F, 0F, -1F, 47, 6, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 431
		barrelModel[4].setRotationPoint(22F, -44F, 0F);

		barrelModel[5].addShapeBox(25F, 0F, 1F, 47, 6, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -2F, -0.3F, 0F, -2F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -2F, -0.3F, 0F, -2F, -0.3F); // Box 432
		barrelModel[5].setRotationPoint(22F, -44F, 0F);

		barrelModel[6].addShapeBox(72F, 0F, 1F, 3, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 433
		barrelModel[6].setRotationPoint(22F, -44F, 0F);

		barrelModel[7].addShapeBox(72F, 0F, -1F, 3, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
		barrelModel[7].setRotationPoint(22F, -44F, 0F);

		barrelModel[8].addShapeBox(72F, 0F, -3F, 3, 6, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 435
		barrelModel[8].setRotationPoint(22F, -44F, 0F);

		barrelModel[9].addShapeBox(75F, 0F, 1F, 4, 6, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 1F, 0F, -2F, 0F); // Box 436
		barrelModel[9].setRotationPoint(22F, -44F, 0F);

		barrelModel[10].addShapeBox(75F, 0F, -1F, 4, 6, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 437
		barrelModel[10].setRotationPoint(22F, -44F, 0F);

		barrelModel[11].addShapeBox(75F, 0F, -3F, 4, 6, 2, 0F,0F, -2F, 0F, 0F, -2F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 438
		barrelModel[11].setRotationPoint(22F, -44F, 0F);

		barrelModel[12].addShapeBox(79F, 0F, 1F, 7, 6, 2, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 1F, 0F, -2F, 1F); // Box 439
		barrelModel[12].setRotationPoint(22F, -44F, 0F);

		barrelModel[13].addShapeBox(79F, 0F, -1F, 7, 6, 2, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 440
		barrelModel[13].setRotationPoint(22F, -44F, 0F);

		barrelModel[14].addShapeBox(79F, 0F, -3F, 7, 6, 2, 0F,0F, -2F, 1F, 0F, -2F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 441
		barrelModel[14].setRotationPoint(22F, -44F, 0F);

		barrelModel[15].addShapeBox(45F, 0F, -1F, 12, 6, 2, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 442
		barrelModel[15].setRotationPoint(22F, -44F, 0F);

		barrelModel[16].addShapeBox(45F, 0F, -3F, 12, 6, 2, 0F,0F, -2F, 1F, 0F, -2F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 443
		barrelModel[16].setRotationPoint(22F, -44F, 0F);

		barrelModel[17].addShapeBox(45F, 0F, 1F, 12, 6, 2, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 1F, 0F, -2F, 1F); // Box 444
		barrelModel[17].setRotationPoint(22F, -44F, 0F);

		barrelModel[18].addShapeBox(12F, -1.5F, 1.5F, 1, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 445
		barrelModel[18].setRotationPoint(22F, -44F, 0F);

		barrelModel[19].addShapeBox(12F, -1.5F, -1.5F, 1, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 446
		barrelModel[19].setRotationPoint(22F, -44F, 0F);

		barrelModel[20].addShapeBox(12F, -1.5F, -4.5F, 1, 9, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447
		barrelModel[20].setRotationPoint(22F, -44F, 0F);

		barrelModel[21].addShapeBox(12F, -5F, 2F, 1, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1.5F, 0F, -3F, -1.5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 448
		barrelModel[21].setRotationPoint(22F, -44F, 0F);

		barrelModel[22].addShapeBox(12F, 2F, -8F, 1, 9, 6, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, -3F, -1.5F, 0F, -3F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 449
		barrelModel[22].setRotationPoint(22F, -44F, 0F);

		barrelModel[23].addShapeBox(-2F, -5F, 4F, 14, 6, 2, 0F,0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -2F, -1.3F, 0F, -2F, -1.3F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -2F, -1.3F, 0F, -2F, -1.3F); // Box 454
		barrelModel[23].setRotationPoint(22F, -44F, 0F);

		barrelModel[24].addShapeBox(-2F, -5F, 2F, 14, 6, 2, 0F,0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F); // Box 455
		barrelModel[24].setRotationPoint(22F, -44F, 0F);

		barrelModel[25].addShapeBox(-2F, -5F, 0F, 14, 6, 2, 0F,0F, -2F, -1.3F, 0F, -2F, -1.3F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -2F, -1.3F, 0F, -2F, -1.3F, 0F, -1.3F, 0F, 0F, -1.3F, 0F); // Box 456
		barrelModel[25].setRotationPoint(22F, -44F, 0F);

		barrelModel[26].addShapeBox(-2F, 5F, -6F, 14, 6, 2, 0F,0F, -2F, -1.3F, 0F, -2F, -1.3F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -2F, -1.3F, 0F, -2F, -1.3F, 0F, -1.3F, 0F, 0F, -1.3F, 0F); // Box 457
		barrelModel[26].setRotationPoint(22F, -44F, 0F);

		barrelModel[27].addShapeBox(-2F, 5F, -2F, 14, 6, 2, 0F,0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -2F, -1.3F, 0F, -2F, -1.3F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -2F, -1.3F, 0F, -2F, -1.3F); // Box 458
		barrelModel[27].setRotationPoint(22F, -44F, 0F);

		barrelModel[28].addShapeBox(-2F, 5F, -4F, 14, 6, 2, 0F,0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F); // Box 459
		barrelModel[28].setRotationPoint(22F, -44F, 0F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Import ImportWeelL12
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Import ImportWeelL13
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Import ImportWeelL14
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 673, 9, textureX, textureY); // Import ImportWeelL15
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Import ImportWeelL16
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Import ImportWeelL17
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Import ImportWeelL18
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Import ImportWeelL19
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Import ImportWeelL20
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Import ImportWeelL21
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Import ImportWeelL22
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 545, 17, textureX, textureY); // Import ImportWeelL23
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 617, 17, textureX, textureY); // Import ImportWeelL24
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 657, 17, textureX, textureY); // Import ImportWeelL25
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 545, 9, textureX, textureY); // Import ImportWeelL26
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 577, 17, textureX, textureY); // Import ImportWeelL27
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Import ImportWeelL28
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 593, 9, textureX, textureY); // Import ImportWeelL30
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 857, 17, textureX, textureY); // Import ImportWeelL31
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Import ImportWeelL32
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 617, 9, textureX, textureY); // Import ImportWeelL33
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 873, 17, textureX, textureY); // Import ImportWeelL34
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import ImportWeelL35
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Import ImportWeelL36
		leftTrackWheelModels[24] = new ModelRendererTurbo(this, 905, 17, textureX, textureY); // Import ImportWeelL37
		leftTrackWheelModels[25] = new ModelRendererTurbo(this, 857, 9, textureX, textureY); // Import ImportWeelL38
		leftTrackWheelModels[26] = new ModelRendererTurbo(this, 945, 9, textureX, textureY); // Import ImportWeelL39
		leftTrackWheelModels[27] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Import ImportWeelL40
		leftTrackWheelModels[28] = new ModelRendererTurbo(this, 697, 9, textureX, textureY); // Import ImportWeelL41
		leftTrackWheelModels[29] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Import ImportWeelL42
		leftTrackWheelModels[30] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Import ImportWeelL43
		leftTrackWheelModels[31] = new ModelRendererTurbo(this, 993, 17, textureX, textureY); // Import ImportWeelL44
		leftTrackWheelModels[32] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Import ImportWeelL45
		leftTrackWheelModels[33] = new ModelRendererTurbo(this, 945, 25, textureX, textureY); // Import ImportWeelL46
		leftTrackWheelModels[34] = new ModelRendererTurbo(this, 985, 25, textureX, textureY); // Import ImportWeelL47
		leftTrackWheelModels[35] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Import ImportWeelL48
		leftTrackWheelModels[36] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Import ImportWeelL49
		leftTrackWheelModels[37] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Import ImportWeelL50
		leftTrackWheelModels[38] = new ModelRendererTurbo(this, 537, 17, textureX, textureY); // Import ImportWeelL51
		leftTrackWheelModels[39] = new ModelRendererTurbo(this, 649, 17, textureX, textureY); // Import ImportWeelL52
		leftTrackWheelModels[40] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Import ImportWeelL53
		leftTrackWheelModels[41] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Import ImportWeelL54
		leftTrackWheelModels[42] = new ModelRendererTurbo(this, 689, 17, textureX, textureY); // Import ImportWeelL55
		leftTrackWheelModels[43] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Import ImportWeelL56
		leftTrackWheelModels[44] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Import ImportWeelL57
		leftTrackWheelModels[45] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Import ImportWeelL58
		leftTrackWheelModels[46] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Import ImportWeelL59
		leftTrackWheelModels[47] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Import ImportWeelL60
		leftTrackWheelModels[48] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Import ImportWeelL61
		leftTrackWheelModels[49] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Import ImportWeelL62
		leftTrackWheelModels[50] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Import ImportWeelL63
		leftTrackWheelModels[51] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Import ImportWeelL64
		leftTrackWheelModels[52] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Import ImportWeelL65
		leftTrackWheelModels[53] = new ModelRendererTurbo(this, 585, 25, textureX, textureY); // Import ImportWeelL66
		leftTrackWheelModels[54] = new ModelRendererTurbo(this, 857, 25, textureX, textureY); // Import ImportWeelL67
		leftTrackWheelModels[55] = new ModelRendererTurbo(this, 905, 25, textureX, textureY); // Import ImportWeelL68
		leftTrackWheelModels[56] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Import ImportWeelL69
		leftTrackWheelModels[57] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Import ImportWeelL70
		leftTrackWheelModels[58] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Import ImportWeelL71
		leftTrackWheelModels[59] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Import ImportWeelL72
		leftTrackWheelModels[60] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Import ImportWeelL73
		leftTrackWheelModels[61] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Import ImportWeelL74
		leftTrackWheelModels[62] = new ModelRendererTurbo(this, 537, 33, textureX, textureY); // Import ImportWeelL75
		leftTrackWheelModels[63] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Import ImportWeelL76
		leftTrackWheelModels[64] = new ModelRendererTurbo(this, 593, 25, textureX, textureY); // Import ImportWeelL77
		leftTrackWheelModels[65] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Import ImportWeelL78
		leftTrackWheelModels[66] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Import ImportWeelL79
		leftTrackWheelModels[67] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Import ImportWeelL80
		leftTrackWheelModels[68] = new ModelRendererTurbo(this, 545, 33, textureX, textureY); // Import ImportWeelL82
		leftTrackWheelModels[69] = new ModelRendererTurbo(this, 569, 33, textureX, textureY); // Import ImportWeelL83
		leftTrackWheelModels[70] = new ModelRendererTurbo(this, 617, 33, textureX, textureY); // Import ImportWeelL84
		leftTrackWheelModels[71] = new ModelRendererTurbo(this, 561, 33, textureX, textureY); // Import ImportWeelL85
		leftTrackWheelModels[72] = new ModelRendererTurbo(this, 641, 33, textureX, textureY); // Import ImportWeelL86
		leftTrackWheelModels[73] = new ModelRendererTurbo(this, 825, 137, textureX, textureY); // Box 410
		leftTrackWheelModels[74] = new ModelRendererTurbo(this, 985, 137, textureX, textureY); // Box 411
		leftTrackWheelModels[75] = new ModelRendererTurbo(this, 769, 129, textureX, textureY); // Box 412
		leftTrackWheelModels[76] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 413
		leftTrackWheelModels[77] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 414
		leftTrackWheelModels[78] = new ModelRendererTurbo(this, 465, 137, textureX, textureY); // Box 415
		leftTrackWheelModels[79] = new ModelRendererTurbo(this, 697, 25, textureX, textureY); // Box 416
		leftTrackWheelModels[80] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 417
		leftTrackWheelModels[81] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 418
		leftTrackWheelModels[82] = new ModelRendererTurbo(this, 929, 25, textureX, textureY); // Box 419
		leftTrackWheelModels[83] = new ModelRendererTurbo(this, 513, 81, textureX, textureY); // Box 420
		leftTrackWheelModels[84] = new ModelRendererTurbo(this, 593, 89, textureX, textureY); // Box 421

		leftTrackWheelModels[0].addShapeBox(-6F, -6F, -7F, 12, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportWeelL12
		leftTrackWheelModels[0].setRotationPoint(58F, -11F, 24F);

		leftTrackWheelModels[1].addBox(-6F, -2F, -7F, 12, 4, 6, 0F); // Import ImportWeelL13
		leftTrackWheelModels[1].setRotationPoint(58F, -11F, 24F);

		leftTrackWheelModels[2].addShapeBox(-6F, 2F, -7F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import ImportWeelL14
		leftTrackWheelModels[2].setRotationPoint(58F, -11F, 24F);

		leftTrackWheelModels[3].addShapeBox(-3F, -6F, -1F, 9, 4, 1, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Import ImportWeelL15
		leftTrackWheelModels[3].setRotationPoint(58F, -11F, 24F);

		leftTrackWheelModels[4].addBox(5F, -2F, -1F, 1, 4, 1, 0F); // Import ImportWeelL16
		leftTrackWheelModels[4].setRotationPoint(58F, -11F, 24F);

		leftTrackWheelModels[5].addShapeBox(1F, 2F, -1F, 5, 4, 1, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import ImportWeelL17
		leftTrackWheelModels[5].setRotationPoint(58F, -11F, 24F);

		leftTrackWheelModels[6].addBox(-2F, 5F, -1F, 4, 1, 1, 0F); // Import ImportWeelL18
		leftTrackWheelModels[6].setRotationPoint(58F, -11F, 24F);

		leftTrackWheelModels[7].addBox(-2F, -6F, -1F, 4, 1, 1, 0F); // Import ImportWeelL19
		leftTrackWheelModels[7].setRotationPoint(58F, -11F, 24F);

		leftTrackWheelModels[8].addShapeBox(-6F, -6F, -1F, 5, 4, 1, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import ImportWeelL20
		leftTrackWheelModels[8].setRotationPoint(58F, -11F, 24F);

		leftTrackWheelModels[9].addBox(-6F, -2F, -1F, 1, 4, 1, 0F); // Import ImportWeelL21
		leftTrackWheelModels[9].setRotationPoint(58F, -11F, 24F);

		leftTrackWheelModels[10].addShapeBox(-10F, 2F, -1F, 9, 4, 1, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Import ImportWeelL22
		leftTrackWheelModels[10].setRotationPoint(58F, -11F, 24F);

		leftTrackWheelModels[11].addShapeBox(-6F, -6F, -7F, 12, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportWeelL23
		leftTrackWheelModels[11].setRotationPoint(43F, -11F, 24F);

		leftTrackWheelModels[12].addBox(-6F, -2F, -7F, 12, 4, 6, 0F); // Import ImportWeelL24
		leftTrackWheelModels[12].setRotationPoint(43F, -11F, 24F);

		leftTrackWheelModels[13].addShapeBox(-6F, 2F, -7F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import ImportWeelL25
		leftTrackWheelModels[13].setRotationPoint(43F, -11F, 24F);

		leftTrackWheelModels[14].addBox(-2F, -6F, -1F, 4, 1, 1, 0F); // Import ImportWeelL26
		leftTrackWheelModels[14].setRotationPoint(43F, -11F, 24F);

		leftTrackWheelModels[15].addShapeBox(-3F, -6F, -1F, 9, 4, 1, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Import ImportWeelL27
		leftTrackWheelModels[15].setRotationPoint(43F, -11F, 24F);

		leftTrackWheelModels[16].addBox(5F, -2F, -1F, 1, 4, 1, 0F); // Import ImportWeelL28
		leftTrackWheelModels[16].setRotationPoint(43F, -11F, 24F);

		leftTrackWheelModels[17].addBox(-2F, 5F, -1F, 4, 1, 1, 0F); // Import ImportWeelL30
		leftTrackWheelModels[17].setRotationPoint(43F, -11F, 24F);

		leftTrackWheelModels[18].addShapeBox(-10F, 2F, -1F, 9, 4, 1, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Import ImportWeelL31
		leftTrackWheelModels[18].setRotationPoint(43F, -11F, 24F);

		leftTrackWheelModels[19].addBox(-6F, -2F, -1F, 1, 4, 1, 0F); // Import ImportWeelL32
		leftTrackWheelModels[19].setRotationPoint(43F, -11F, 24F);

		leftTrackWheelModels[20].addShapeBox(-6F, -6F, -1F, 5, 4, 1, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import ImportWeelL33
		leftTrackWheelModels[20].setRotationPoint(43F, -11F, 24F);

		leftTrackWheelModels[21].addShapeBox(-6F, -6F, -7F, 12, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportWeelL34
		leftTrackWheelModels[21].setRotationPoint(28F, -11F, 24F);

		leftTrackWheelModels[22].addBox(-6F, -2F, -7F, 12, 4, 6, 0F); // Import ImportWeelL35
		leftTrackWheelModels[22].setRotationPoint(28F, -11F, 24F);

		leftTrackWheelModels[23].addShapeBox(-6F, 2F, -7F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import ImportWeelL36
		leftTrackWheelModels[23].setRotationPoint(28F, -11F, 24F);

		leftTrackWheelModels[24].addShapeBox(-3F, -6F, -1F, 9, 4, 1, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Import ImportWeelL37
		leftTrackWheelModels[24].setRotationPoint(28F, -11F, 24F);

		leftTrackWheelModels[25].addBox(-2F, -6F, -1F, 4, 1, 1, 0F); // Import ImportWeelL38
		leftTrackWheelModels[25].setRotationPoint(28F, -11F, 24F);

		leftTrackWheelModels[26].addShapeBox(-6F, -6F, -1F, 5, 4, 1, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import ImportWeelL39
		leftTrackWheelModels[26].setRotationPoint(28F, -11F, 24F);

		leftTrackWheelModels[27].addBox(-6F, -2F, -1F, 1, 4, 1, 0F); // Import ImportWeelL40
		leftTrackWheelModels[27].setRotationPoint(28F, -11F, 24F);

		leftTrackWheelModels[28].addBox(5F, -2F, -1F, 1, 4, 1, 0F); // Import ImportWeelL41
		leftTrackWheelModels[28].setRotationPoint(28F, -11F, 24F);

		leftTrackWheelModels[29].addShapeBox(1F, 2F, -1F, 5, 4, 1, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import ImportWeelL42
		leftTrackWheelModels[29].setRotationPoint(28F, -11F, 24F);

		leftTrackWheelModels[30].addBox(-2F, 5F, -1F, 4, 1, 1, 0F); // Import ImportWeelL43
		leftTrackWheelModels[30].setRotationPoint(28F, -11F, 24F);

		leftTrackWheelModels[31].addShapeBox(-10F, 2F, -1F, 9, 4, 1, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Import ImportWeelL44
		leftTrackWheelModels[31].setRotationPoint(28F, -11F, 24F);

		leftTrackWheelModels[32].addShapeBox(-6F, -6F, -7F, 12, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportWeelL45
		leftTrackWheelModels[32].setRotationPoint(13F, -11F, 24F);

		leftTrackWheelModels[33].addBox(-6F, -2F, -7F, 12, 4, 6, 0F); // Import ImportWeelL46
		leftTrackWheelModels[33].setRotationPoint(13F, -11F, 24F);

		leftTrackWheelModels[34].addShapeBox(-6F, 2F, -7F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import ImportWeelL47
		leftTrackWheelModels[34].setRotationPoint(13F, -11F, 24F);

		leftTrackWheelModels[35].addBox(-2F, -6F, -1F, 4, 1, 1, 0F); // Import ImportWeelL48
		leftTrackWheelModels[35].setRotationPoint(13F, -11F, 24F);

		leftTrackWheelModels[36].addShapeBox(-3F, -6F, -1F, 9, 4, 1, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Import ImportWeelL49
		leftTrackWheelModels[36].setRotationPoint(13F, -11F, 24F);

		leftTrackWheelModels[37].addBox(5F, -2F, -1F, 1, 4, 1, 0F); // Import ImportWeelL50
		leftTrackWheelModels[37].setRotationPoint(13F, -11F, 24F);

		leftTrackWheelModels[38].addShapeBox(1F, 2F, -1F, 5, 4, 1, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import ImportWeelL51
		leftTrackWheelModels[38].setRotationPoint(13F, -11F, 24F);

		leftTrackWheelModels[39].addBox(-2F, 5F, -1F, 4, 1, 1, 0F); // Import ImportWeelL52
		leftTrackWheelModels[39].setRotationPoint(13F, -11F, 24F);

		leftTrackWheelModels[40].addShapeBox(-10F, 2F, -1F, 9, 4, 1, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Import ImportWeelL53
		leftTrackWheelModels[40].setRotationPoint(13F, -11F, 24F);

		leftTrackWheelModels[41].addBox(-6F, -2F, -1F, 1, 4, 1, 0F); // Import ImportWeelL54
		leftTrackWheelModels[41].setRotationPoint(13F, -11F, 24F);

		leftTrackWheelModels[42].addShapeBox(-6F, -6F, -1F, 5, 4, 1, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import ImportWeelL55
		leftTrackWheelModels[42].setRotationPoint(13F, -11F, 24F);

		leftTrackWheelModels[43].addShapeBox(-6F, -6F, -7F, 12, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportWeelL56
		leftTrackWheelModels[43].setRotationPoint(-2F, -11F, 24F);

		leftTrackWheelModels[44].addBox(-6F, -2F, -7F, 12, 4, 6, 0F); // Import ImportWeelL57
		leftTrackWheelModels[44].setRotationPoint(-2F, -11F, 24F);

		leftTrackWheelModels[45].addShapeBox(-6F, 2F, -7F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import ImportWeelL58
		leftTrackWheelModels[45].setRotationPoint(-2F, -11F, 24F);

		leftTrackWheelModels[46].addBox(-2F, -6F, -1F, 4, 1, 1, 0F); // Import ImportWeelL59
		leftTrackWheelModels[46].setRotationPoint(-2F, -11F, 24F);

		leftTrackWheelModels[47].addShapeBox(-3F, -6F, -1F, 9, 4, 1, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Import ImportWeelL60
		leftTrackWheelModels[47].setRotationPoint(-2F, -11F, 24F);

		leftTrackWheelModels[48].addBox(5F, -2F, -1F, 1, 4, 1, 0F); // Import ImportWeelL61
		leftTrackWheelModels[48].setRotationPoint(-2F, -11F, 24F);

		leftTrackWheelModels[49].addShapeBox(1F, 2F, -1F, 5, 4, 1, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import ImportWeelL62
		leftTrackWheelModels[49].setRotationPoint(-2F, -11F, 24F);

		leftTrackWheelModels[50].addBox(-2F, 5F, -1F, 4, 1, 1, 0F); // Import ImportWeelL63
		leftTrackWheelModels[50].setRotationPoint(-2F, -11F, 24F);

		leftTrackWheelModels[51].addShapeBox(-10F, 2F, -1F, 9, 4, 1, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Import ImportWeelL64
		leftTrackWheelModels[51].setRotationPoint(-2F, -11F, 24F);

		leftTrackWheelModels[52].addBox(-6F, -2F, -1F, 1, 4, 1, 0F); // Import ImportWeelL65
		leftTrackWheelModels[52].setRotationPoint(-2F, -11F, 24F);

		leftTrackWheelModels[53].addShapeBox(-6F, -6F, -1F, 5, 4, 1, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import ImportWeelL66
		leftTrackWheelModels[53].setRotationPoint(-2F, -11F, 24F);

		leftTrackWheelModels[54].addShapeBox(1F, 2F, -1F, 5, 4, 1, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import ImportWeelL67
		leftTrackWheelModels[54].setRotationPoint(43F, -11F, 24F);

		leftTrackWheelModels[55].addBox(-3F, -1F, -10F, 6, 2, 5, 0F); // Import ImportWeelL68
		leftTrackWheelModels[55].setRotationPoint(72F, -16F, 27F);

		leftTrackWheelModels[56].addShapeBox(-3F, -3F, -10F, 6, 2, 5, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportWeelL69
		leftTrackWheelModels[56].setRotationPoint(72F, -16F, 27F);

		leftTrackWheelModels[57].addBox(2F, -1F, -5F, 1, 2, 2, 0F); // Import ImportWeelL70
		leftTrackWheelModels[57].setRotationPoint(72F, -16F, 27F);

		leftTrackWheelModels[58].addShapeBox(-2F, -3F, -5F, 5, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Import ImportWeelL71
		leftTrackWheelModels[58].setRotationPoint(72F, -16F, 27F);

		leftTrackWheelModels[59].addBox(-1F, -3F, -5F, 2, 1, 2, 0F); // Import ImportWeelL72
		leftTrackWheelModels[59].setRotationPoint(72F, -16F, 27F);

		leftTrackWheelModels[60].addShapeBox(-3F, -3F, -5F, 5, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import ImportWeelL73
		leftTrackWheelModels[60].setRotationPoint(72F, -16F, 27F);

		leftTrackWheelModels[61].addBox(-3F, -1F, -5F, 1, 2, 2, 0F); // Import ImportWeelL74
		leftTrackWheelModels[61].setRotationPoint(72F, -16F, 27F);

		leftTrackWheelModels[62].addShapeBox(-5F, 1F, -5F, 5, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Import ImportWeelL75
		leftTrackWheelModels[62].setRotationPoint(72F, -16F, 27F);

		leftTrackWheelModels[63].addBox(-1F, 2F, -5F, 2, 1, 2, 0F); // Import ImportWeelL76
		leftTrackWheelModels[63].setRotationPoint(72F, -16F, 27F);

		leftTrackWheelModels[64].addBox(-0.5F, -4F, -10F, 1, 1, 7, 0F); // Import ImportWeelL77
		leftTrackWheelModels[64].setRotationPoint(72F, -16F, 27F);

		leftTrackWheelModels[65].addBox(-0.5F, -3.8F, -10F, 1, 1, 7, 0F); // Import ImportWeelL78
		leftTrackWheelModels[65].setRotationPoint(72F, -16F, 27F);
		leftTrackWheelModels[65].rotateAngleZ = -0.78539816F;

		leftTrackWheelModels[66].addBox(3F, -0.5F, -10F, 1, 1, 7, 0F); // Import ImportWeelL79
		leftTrackWheelModels[66].setRotationPoint(72F, -16F, 27F);

		leftTrackWheelModels[67].addBox(2.8F, -0.5F, -10F, 1, 1, 7, 0F); // Import ImportWeelL80
		leftTrackWheelModels[67].setRotationPoint(72F, -16F, 27F);
		leftTrackWheelModels[67].rotateAngleZ = -0.78539816F;

		leftTrackWheelModels[68].addBox(-0.5F, 2.8F, -10F, 1, 1, 7, 0F); // Import ImportWeelL82
		leftTrackWheelModels[68].setRotationPoint(72F, -16F, 27F);
		leftTrackWheelModels[68].rotateAngleZ = -0.78539816F;

		leftTrackWheelModels[69].addBox(-4F, -0.5F, -10F, 1, 1, 7, 0F); // Import ImportWeelL83
		leftTrackWheelModels[69].setRotationPoint(72F, -16F, 27F);

		leftTrackWheelModels[70].addBox(-3.8F, -0.5F, -10F, 1, 1, 7, 0F); // Import ImportWeelL84
		leftTrackWheelModels[70].setRotationPoint(72F, -16F, 27F);
		leftTrackWheelModels[70].rotateAngleZ = -0.78539816F;

		leftTrackWheelModels[71].addShapeBox(0F, 1F, -5F, 5, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import ImportWeelL85
		leftTrackWheelModels[71].setRotationPoint(72F, -16F, 27F);

		leftTrackWheelModels[72].addShapeBox(-3F, 1F, -10F, 6, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportWeelL86
		leftTrackWheelModels[72].setRotationPoint(72F, -16F, 27F);

		leftTrackWheelModels[73].addBox(-6F, -2F, -7F, 12, 4, 6, 0F); // Box 410
		leftTrackWheelModels[73].setRotationPoint(-18F, -11F, 24F);

		leftTrackWheelModels[74].addShapeBox(-6F, 2F, -7F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 411
		leftTrackWheelModels[74].setRotationPoint(-18F, -11F, 24F);

		leftTrackWheelModels[75].addShapeBox(-10F, 2F, -1F, 9, 4, 1, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 412
		leftTrackWheelModels[75].setRotationPoint(-18F, -11F, 24F);

		leftTrackWheelModels[76].addBox(-2F, -6F, -1F, 4, 1, 1, 0F); // Box 413
		leftTrackWheelModels[76].setRotationPoint(-18F, -11F, 24F);

		leftTrackWheelModels[77].addShapeBox(-6F, -6F, -7F, 12, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 414
		leftTrackWheelModels[77].setRotationPoint(-18F, -11F, 24F);

		leftTrackWheelModels[78].addShapeBox(-3F, -6F, -1F, 9, 4, 1, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 415
		leftTrackWheelModels[78].setRotationPoint(-18F, -11F, 24F);

		leftTrackWheelModels[79].addBox(5F, -2F, -1F, 1, 4, 1, 0F); // Box 416
		leftTrackWheelModels[79].setRotationPoint(-18F, -11F, 24F);

		leftTrackWheelModels[80].addShapeBox(1F, 2F, -1F, 5, 4, 1, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 417
		leftTrackWheelModels[80].setRotationPoint(-18F, -11F, 24F);

		leftTrackWheelModels[81].addBox(-2F, 5F, -1F, 4, 1, 1, 0F); // Box 418
		leftTrackWheelModels[81].setRotationPoint(-18F, -11F, 24F);

		leftTrackWheelModels[82].addBox(-6F, -2F, -1F, 1, 4, 1, 0F); // Box 419
		leftTrackWheelModels[82].setRotationPoint(-18F, -11F, 24F);

		leftTrackWheelModels[83].addShapeBox(-6F, -6F, -1F, 5, 4, 1, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 420
		leftTrackWheelModels[83].setRotationPoint(-18F, -11F, 24F);

		leftTrackWheelModels[84].addBox(-0.5F, 3F, -10F, 1, 1, 7, 0F); // Box 421
		leftTrackWheelModels[84].setRotationPoint(72F, -16F, 27F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 889, 33, textureX, textureY); // Import ImportWheelR12
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 985, 49, textureX, textureY); // Import ImportWheelR13
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 785, 57, textureX, textureY); // Import ImportWheelR14
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 977, 25, textureX, textureY); // Import ImportWheelR15
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import ImportWheelR16
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Import ImportWheelR17
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 921, 33, textureX, textureY); // Import ImportWheelR18
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Import ImportWheelR19
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Import ImportWheelR20
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Import ImportWheelR21
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Import ImportWheelR22
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 873, 57, textureX, textureY); // Import ImportWheelR23
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 913, 57, textureX, textureY); // Import ImportWheelR24
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 953, 57, textureX, textureY); // Import ImportWheelR25
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 633, 33, textureX, textureY); // Import ImportWheelR26
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Import ImportWheelR27
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Import ImportWheelR28
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Import ImportWheelR29
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Import ImportWheelR30
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Import ImportWheelR31
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Import ImportWheelR32
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Import ImportWheelR33
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Import ImportWheelR34
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Import ImportWheelR35
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 585, 41, textureX, textureY); // Import ImportWheelR36
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 601, 17, textureX, textureY); // Import ImportWheelR37
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Import ImportWheelR38
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 633, 41, textureX, textureY); // Import ImportWheelR39
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 649, 41, textureX, textureY); // Import ImportWheelR40
		rightTrackWheelModels[29] = new ModelRendererTurbo(this, 617, 17, textureX, textureY); // Import ImportWheelR41
		rightTrackWheelModels[30] = new ModelRendererTurbo(this, 985, 65, textureX, textureY); // Import ImportWheelR42
		rightTrackWheelModels[31] = new ModelRendererTurbo(this, 785, 73, textureX, textureY); // Import ImportWheelR43
		rightTrackWheelModels[32] = new ModelRendererTurbo(this, 873, 73, textureX, textureY); // Import ImportWheelR44
		rightTrackWheelModels[33] = new ModelRendererTurbo(this, 913, 73, textureX, textureY); // Import ImportWheelR45
		rightTrackWheelModels[34] = new ModelRendererTurbo(this, 953, 73, textureX, textureY); // Import ImportWheelR46
		rightTrackWheelModels[35] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Import ImportWheelR47
		rightTrackWheelModels[36] = new ModelRendererTurbo(this, 929, 17, textureX, textureY); // Import ImportWheelR48
		rightTrackWheelModels[37] = new ModelRendererTurbo(this, 945, 41, textureX, textureY); // Import ImportWheelR49
		rightTrackWheelModels[38] = new ModelRendererTurbo(this, 961, 41, textureX, textureY); // Import ImportWheelR50
		rightTrackWheelModels[39] = new ModelRendererTurbo(this, 977, 41, textureX, textureY); // Import ImportWheelR51
		rightTrackWheelModels[40] = new ModelRendererTurbo(this, 1017, 17, textureX, textureY); // Import ImportWheelR52
		rightTrackWheelModels[41] = new ModelRendererTurbo(this, 1001, 41, textureX, textureY); // Import ImportWheelR53
		rightTrackWheelModels[42] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import ImportWheelR54
		rightTrackWheelModels[43] = new ModelRendererTurbo(this, 817, 57, textureX, textureY); // Import ImportWheelR55
		rightTrackWheelModels[44] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Import ImportWheelR56
		rightTrackWheelModels[45] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Import ImportWheelR57
		rightTrackWheelModels[46] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Import ImportWheelR58
		rightTrackWheelModels[47] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Import ImportWheelR59
		rightTrackWheelModels[48] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Import ImportWheelR60
		rightTrackWheelModels[49] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import ImportWheelR61
		rightTrackWheelModels[50] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Import ImportWheelR62
		rightTrackWheelModels[51] = new ModelRendererTurbo(this, 553, 57, textureX, textureY); // Import ImportWheelR63
		rightTrackWheelModels[52] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import ImportWheelR64
		rightTrackWheelModels[53] = new ModelRendererTurbo(this, 825, 65, textureX, textureY); // Import ImportWheelR65
		rightTrackWheelModels[54] = new ModelRendererTurbo(this, 905, 57, textureX, textureY); // Import ImportWheelR66
		rightTrackWheelModels[55] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import ImportWheelR67
		rightTrackWheelModels[56] = new ModelRendererTurbo(this, 825, 73, textureX, textureY); // Import ImportWheelR68
		rightTrackWheelModels[57] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Import ImportWheelR69
		rightTrackWheelModels[58] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Import ImportWheelR70
		rightTrackWheelModels[59] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Import ImportWheelR71
		rightTrackWheelModels[60] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Import ImportWheelR72
		rightTrackWheelModels[61] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Import ImportWheelR73
		rightTrackWheelModels[62] = new ModelRendererTurbo(this, 737, 73, textureX, textureY); // Import ImportWheelR74
		rightTrackWheelModels[63] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Import ImportWheelR75
		rightTrackWheelModels[64] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Import ImportWheelR76
		rightTrackWheelModels[65] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Import ImportWheelR77
		rightTrackWheelModels[66] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Import ImportWheelR78
		rightTrackWheelModels[67] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Import ImportWheelR79
		rightTrackWheelModels[68] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Import ImportWheelR80
		rightTrackWheelModels[69] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Import ImportWheelR81
		rightTrackWheelModels[70] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Import ImportWheelR82
		rightTrackWheelModels[71] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Import ImportWheelR83
		rightTrackWheelModels[72] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Import ImportWheelR84
		rightTrackWheelModels[73] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Import ImportWheelR85
		rightTrackWheelModels[74] = new ModelRendererTurbo(this, 953, 129, textureX, textureY); // Box 398
		rightTrackWheelModels[75] = new ModelRendererTurbo(this, 945, 57, textureX, textureY); // Box 399
		rightTrackWheelModels[76] = new ModelRendererTurbo(this, 825, 81, textureX, textureY); // Box 400
		rightTrackWheelModels[77] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 401
		rightTrackWheelModels[78] = new ModelRendererTurbo(this, 905, 73, textureX, textureY); // Box 402
		rightTrackWheelModels[79] = new ModelRendererTurbo(this, 433, 137, textureX, textureY); // Box 403
		rightTrackWheelModels[80] = new ModelRendererTurbo(this, 817, 73, textureX, textureY); // Box 404
		rightTrackWheelModels[81] = new ModelRendererTurbo(this, 521, 97, textureX, textureY); // Box 405
		rightTrackWheelModels[82] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 406
		rightTrackWheelModels[83] = new ModelRendererTurbo(this, 561, 137, textureX, textureY); // Box 407
		rightTrackWheelModels[84] = new ModelRendererTurbo(this, 945, 73, textureX, textureY); // Box 409

		rightTrackWheelModels[0].addShapeBox(-6F, -6F, 2F, 12, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportWheelR12
		rightTrackWheelModels[0].setRotationPoint(58F, -11F, -25F);

		rightTrackWheelModels[1].addBox(-6F, -2F, 2F, 12, 4, 6, 0F); // Import ImportWheelR13
		rightTrackWheelModels[1].setRotationPoint(58F, -11F, -25F);

		rightTrackWheelModels[2].addShapeBox(-6F, 2F, 2F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import ImportWheelR14
		rightTrackWheelModels[2].setRotationPoint(58F, -11F, -25F);

		rightTrackWheelModels[3].addBox(-2F, -6F, 1F, 4, 1, 1, 0F); // Import ImportWheelR15
		rightTrackWheelModels[3].setRotationPoint(58F, -11F, -25F);

		rightTrackWheelModels[4].addShapeBox(-3F, -6F, 1F, 9, 4, 1, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Import ImportWheelR16
		rightTrackWheelModels[4].setRotationPoint(58F, -11F, -25F);

		rightTrackWheelModels[5].addBox(5F, -2F, 1F, 1, 4, 1, 0F); // Import ImportWheelR17
		rightTrackWheelModels[5].setRotationPoint(58F, -11F, -25F);

		rightTrackWheelModels[6].addShapeBox(1F, 2F, 1F, 5, 4, 1, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import ImportWheelR18
		rightTrackWheelModels[6].setRotationPoint(58F, -11F, -25F);

		rightTrackWheelModels[7].addBox(-2F, 5F, 1F, 4, 1, 1, 0F); // Import ImportWheelR19
		rightTrackWheelModels[7].setRotationPoint(58F, -11F, -25F);

		rightTrackWheelModels[8].addShapeBox(-10F, 2F, 1F, 9, 4, 1, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Import ImportWheelR20
		rightTrackWheelModels[8].setRotationPoint(58F, -11F, -25F);

		rightTrackWheelModels[9].addBox(-6F, -2F, 1F, 1, 4, 1, 0F); // Import ImportWheelR21
		rightTrackWheelModels[9].setRotationPoint(58F, -11F, -25F);

		rightTrackWheelModels[10].addShapeBox(-6F, -6F, 1F, 5, 4, 1, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import ImportWheelR22
		rightTrackWheelModels[10].setRotationPoint(58F, -11F, -25F);

		rightTrackWheelModels[11].addShapeBox(-6F, -6F, 2F, 12, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportWheelR23
		rightTrackWheelModels[11].setRotationPoint(43F, -11F, -25F);

		rightTrackWheelModels[12].addBox(-6F, -2F, 2F, 12, 4, 6, 0F); // Import ImportWheelR24
		rightTrackWheelModels[12].setRotationPoint(43F, -11F, -25F);

		rightTrackWheelModels[13].addShapeBox(-6F, 2F, 2F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import ImportWheelR25
		rightTrackWheelModels[13].setRotationPoint(43F, -11F, -25F);

		rightTrackWheelModels[14].addBox(-2F, 5F, 1F, 4, 1, 1, 0F); // Import ImportWheelR26
		rightTrackWheelModels[14].setRotationPoint(43F, -11F, -25F);

		rightTrackWheelModels[15].addShapeBox(-10F, 2F, 1F, 9, 4, 1, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Import ImportWheelR27
		rightTrackWheelModels[15].setRotationPoint(43F, -11F, -25F);

		rightTrackWheelModels[16].addBox(-6F, -2F, 1F, 1, 4, 1, 0F); // Import ImportWheelR28
		rightTrackWheelModels[16].setRotationPoint(43F, -11F, -25F);

		rightTrackWheelModels[17].addShapeBox(-6F, -6F, 1F, 5, 4, 1, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import ImportWheelR29
		rightTrackWheelModels[17].setRotationPoint(43F, -11F, -25F);

		rightTrackWheelModels[18].addBox(-2F, -6F, 1F, 4, 1, 1, 0F); // Import ImportWheelR30
		rightTrackWheelModels[18].setRotationPoint(43F, -11F, -25F);

		rightTrackWheelModels[19].addShapeBox(-3F, -6F, 1F, 9, 4, 1, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Import ImportWheelR31
		rightTrackWheelModels[19].setRotationPoint(43F, -11F, -25F);

		rightTrackWheelModels[20].addBox(5F, -2F, 1F, 1, 4, 1, 0F); // Import ImportWheelR32
		rightTrackWheelModels[20].setRotationPoint(43F, -11F, -25F);

		rightTrackWheelModels[21].addShapeBox(1F, 2F, 1F, 5, 4, 1, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import ImportWheelR33
		rightTrackWheelModels[21].setRotationPoint(43F, -11F, -25F);

		rightTrackWheelModels[22].addShapeBox(1F, 2F, 1F, 5, 4, 1, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import ImportWheelR34
		rightTrackWheelModels[22].setRotationPoint(28F, -11F, -25F);

		rightTrackWheelModels[23].addBox(-2F, 5F, 1F, 4, 1, 1, 0F); // Import ImportWheelR35
		rightTrackWheelModels[23].setRotationPoint(28F, -11F, -25F);

		rightTrackWheelModels[24].addShapeBox(-10F, 2F, 1F, 9, 4, 1, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Import ImportWheelR36
		rightTrackWheelModels[24].setRotationPoint(28F, -11F, -25F);

		rightTrackWheelModels[25].addBox(-6F, -2F, 1F, 1, 4, 1, 0F); // Import ImportWheelR37
		rightTrackWheelModels[25].setRotationPoint(28F, -11F, -25F);

		rightTrackWheelModels[26].addShapeBox(-6F, -6F, 1F, 5, 4, 1, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import ImportWheelR38
		rightTrackWheelModels[26].setRotationPoint(28F, -11F, -25F);

		rightTrackWheelModels[27].addBox(-2F, -6F, 1F, 4, 1, 1, 0F); // Import ImportWheelR39
		rightTrackWheelModels[27].setRotationPoint(28F, -11F, -25F);

		rightTrackWheelModels[28].addShapeBox(-3F, -6F, 1F, 9, 4, 1, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Import ImportWheelR40
		rightTrackWheelModels[28].setRotationPoint(28F, -11F, -25F);

		rightTrackWheelModels[29].addBox(5F, -2F, 1F, 1, 4, 1, 0F); // Import ImportWheelR41
		rightTrackWheelModels[29].setRotationPoint(28F, -11F, -25F);

		rightTrackWheelModels[30].addShapeBox(-6F, -6F, 2F, 12, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportWheelR42
		rightTrackWheelModels[30].setRotationPoint(28F, -11F, -25F);

		rightTrackWheelModels[31].addBox(-6F, -2F, 2F, 12, 4, 6, 0F); // Import ImportWheelR43
		rightTrackWheelModels[31].setRotationPoint(28F, -11F, -25F);

		rightTrackWheelModels[32].addShapeBox(-6F, 2F, 2F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import ImportWheelR44
		rightTrackWheelModels[32].setRotationPoint(28F, -11F, -25F);

		rightTrackWheelModels[33].addShapeBox(-6F, -6F, 2F, 12, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportWheelR45
		rightTrackWheelModels[33].setRotationPoint(13F, -11F, -25F);

		rightTrackWheelModels[34].addBox(-6F, -2F, 2F, 12, 4, 6, 0F); // Import ImportWheelR46
		rightTrackWheelModels[34].setRotationPoint(13F, -11F, -25F);

		rightTrackWheelModels[35].addShapeBox(-6F, 2F, 2F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import ImportWheelR47
		rightTrackWheelModels[35].setRotationPoint(13F, -11F, -25F);

		rightTrackWheelModels[36].addBox(-6F, -2F, 1F, 1, 4, 1, 0F); // Import ImportWheelR48
		rightTrackWheelModels[36].setRotationPoint(13F, -11F, -25F);

		rightTrackWheelModels[37].addShapeBox(-6F, -6F, 1F, 5, 4, 1, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import ImportWheelR49
		rightTrackWheelModels[37].setRotationPoint(13F, -11F, -25F);

		rightTrackWheelModels[38].addBox(-2F, -6F, 1F, 4, 1, 1, 0F); // Import ImportWheelR50
		rightTrackWheelModels[38].setRotationPoint(13F, -11F, -25F);

		rightTrackWheelModels[39].addShapeBox(-3F, -6F, 1F, 9, 4, 1, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Import ImportWheelR51
		rightTrackWheelModels[39].setRotationPoint(13F, -11F, -25F);

		rightTrackWheelModels[40].addBox(5F, -2F, 1F, 1, 4, 1, 0F); // Import ImportWheelR52
		rightTrackWheelModels[40].setRotationPoint(13F, -11F, -25F);

		rightTrackWheelModels[41].addShapeBox(1F, 2F, 1F, 5, 4, 1, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import ImportWheelR53
		rightTrackWheelModels[41].setRotationPoint(13F, -11F, -25F);

		rightTrackWheelModels[42].addBox(-2F, 5F, 1F, 4, 1, 1, 0F); // Import ImportWheelR54
		rightTrackWheelModels[42].setRotationPoint(13F, -11F, -25F);

		rightTrackWheelModels[43].addShapeBox(-10F, 2F, 1F, 9, 4, 1, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Import ImportWheelR55
		rightTrackWheelModels[43].setRotationPoint(13F, -11F, -25F);

		rightTrackWheelModels[44].addShapeBox(-6F, 2F, 2F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import ImportWheelR56
		rightTrackWheelModels[44].setRotationPoint(-2F, -11F, -25F);

		rightTrackWheelModels[45].addBox(-6F, -2F, 2F, 12, 4, 6, 0F); // Import ImportWheelR57
		rightTrackWheelModels[45].setRotationPoint(-2F, -11F, -25F);

		rightTrackWheelModels[46].addShapeBox(-6F, -6F, 2F, 12, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportWheelR58
		rightTrackWheelModels[46].setRotationPoint(-2F, -11F, -25F);

		rightTrackWheelModels[47].addBox(-2F, -6F, 1F, 4, 1, 1, 0F); // Import ImportWheelR59
		rightTrackWheelModels[47].setRotationPoint(-2F, -11F, -25F);

		rightTrackWheelModels[48].addBox(-2F, 5F, 1F, 4, 1, 1, 0F); // Import ImportWheelR60
		rightTrackWheelModels[48].setRotationPoint(-2F, -11F, -25F);

		rightTrackWheelModels[49].addBox(-6F, -2F, 1F, 1, 4, 1, 0F); // Import ImportWheelR61
		rightTrackWheelModels[49].setRotationPoint(-2F, -11F, -25F);

		rightTrackWheelModels[50].addBox(5F, -2F, 1F, 1, 4, 1, 0F); // Import ImportWheelR62
		rightTrackWheelModels[50].setRotationPoint(-2F, -11F, -25F);

		rightTrackWheelModels[51].addShapeBox(-6F, -6F, 1F, 5, 4, 1, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import ImportWheelR63
		rightTrackWheelModels[51].setRotationPoint(-2F, -11F, -25F);

		rightTrackWheelModels[52].addShapeBox(-3F, -6F, 1F, 9, 4, 1, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Import ImportWheelR64
		rightTrackWheelModels[52].setRotationPoint(-2F, -11F, -25F);

		rightTrackWheelModels[53].addShapeBox(-10F, 2F, 1F, 9, 4, 1, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Import ImportWheelR65
		rightTrackWheelModels[53].setRotationPoint(-2F, -11F, -25F);

		rightTrackWheelModels[54].addShapeBox(1F, 2F, 1F, 5, 4, 1, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import ImportWheelR66
		rightTrackWheelModels[54].setRotationPoint(-2F, -11F, -25F);

		rightTrackWheelModels[55].addShapeBox(-3F, -3F, 0F, 6, 2, 5, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportWheelR67
		rightTrackWheelModels[55].setRotationPoint(72F, -16F, -22F);

		rightTrackWheelModels[56].addBox(-3F, -1F, 0F, 6, 2, 5, 0F); // Import ImportWheelR68
		rightTrackWheelModels[56].setRotationPoint(72F, -16F, -22F);

		rightTrackWheelModels[57].addShapeBox(-3F, 1F, 0F, 6, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportWheelR69
		rightTrackWheelModels[57].setRotationPoint(72F, -16F, -22F);

		rightTrackWheelModels[58].addBox(-1F, -3F, -2F, 2, 1, 2, 0F); // Import ImportWheelR70
		rightTrackWheelModels[58].setRotationPoint(72F, -16F, -22F);

		rightTrackWheelModels[59].addBox(-1F, 2F, -2F, 2, 1, 2, 0F); // Import ImportWheelR71
		rightTrackWheelModels[59].setRotationPoint(72F, -16F, -22F);

		rightTrackWheelModels[60].addBox(2F, -1F, -2F, 1, 2, 2, 0F); // Import ImportWheelR72
		rightTrackWheelModels[60].setRotationPoint(72F, -16F, -22F);

		rightTrackWheelModels[61].addBox(-3F, -1F, -2F, 1, 2, 2, 0F); // Import ImportWheelR73
		rightTrackWheelModels[61].setRotationPoint(72F, -16F, -22F);

		rightTrackWheelModels[62].addShapeBox(-3F, -3F, -2F, 5, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import ImportWheelR74
		rightTrackWheelModels[62].setRotationPoint(72F, -16F, -22F);

		rightTrackWheelModels[63].addShapeBox(-2F, -3F, -2F, 5, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Import ImportWheelR75
		rightTrackWheelModels[63].setRotationPoint(72F, -16F, -22F);

		rightTrackWheelModels[64].addShapeBox(0F, 1F, -2F, 5, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import ImportWheelR76
		rightTrackWheelModels[64].setRotationPoint(72F, -16F, -22F);

		rightTrackWheelModels[65].addShapeBox(-5F, 1F, -2F, 5, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Import ImportWheelR77
		rightTrackWheelModels[65].setRotationPoint(72F, -16F, -22F);

		rightTrackWheelModels[66].addBox(-0.5F, -4F, -2F, 1, 1, 7, 0F); // Import ImportWheelR78
		rightTrackWheelModels[66].setRotationPoint(72F, -16F, -22F);

		rightTrackWheelModels[67].addBox(-0.5F, 3F, -2F, 1, 1, 7, 0F); // Import ImportWheelR79
		rightTrackWheelModels[67].setRotationPoint(72F, -16F, -22F);

		rightTrackWheelModels[68].addBox(2.8F, -0.5F, -2F, 1, 1, 7, 0F); // Import ImportWheelR80
		rightTrackWheelModels[68].setRotationPoint(72F, -16F, -22F);
		rightTrackWheelModels[68].rotateAngleZ = -0.78539816F;

		rightTrackWheelModels[69].addBox(3F, -0.5F, -2F, 1, 1, 7, 0F); // Import ImportWheelR81
		rightTrackWheelModels[69].setRotationPoint(72F, -16F, -22F);

		rightTrackWheelModels[70].addBox(-0.5F, -3.8F, -2F, 1, 1, 7, 0F); // Import ImportWheelR82
		rightTrackWheelModels[70].setRotationPoint(72F, -16F, -22F);
		rightTrackWheelModels[70].rotateAngleZ = -0.78539816F;

		rightTrackWheelModels[71].addBox(-3.8F, -0.5F, -2F, 1, 1, 7, 0F); // Import ImportWheelR83
		rightTrackWheelModels[71].setRotationPoint(72F, -16F, -22F);
		rightTrackWheelModels[71].rotateAngleZ = -0.78539816F;

		rightTrackWheelModels[72].addBox(-4F, -0.5F, -2F, 1, 1, 7, 0F); // Import ImportWheelR84
		rightTrackWheelModels[72].setRotationPoint(72F, -16F, -22F);

		rightTrackWheelModels[73].addBox(-0.5F, 2.8F, -2F, 1, 1, 7, 0F); // Import ImportWheelR85
		rightTrackWheelModels[73].setRotationPoint(72F, -16F, -22F);
		rightTrackWheelModels[73].rotateAngleZ = -0.78539816F;

		rightTrackWheelModels[74].addShapeBox(-6F, 2F, 2F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 398
		rightTrackWheelModels[74].setRotationPoint(-18F, -11F, -25F);

		rightTrackWheelModels[75].addBox(-2F, 5F, 1F, 4, 1, 1, 0F); // Box 399
		rightTrackWheelModels[75].setRotationPoint(-18F, -11F, -25F);

		rightTrackWheelModels[76].addShapeBox(-10F, 2F, 1F, 9, 4, 1, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 400
		rightTrackWheelModels[76].setRotationPoint(-18F, -11F, -25F);

		rightTrackWheelModels[77].addBox(-6F, -2F, 1F, 1, 4, 1, 0F); // Box 401
		rightTrackWheelModels[77].setRotationPoint(-18F, -11F, -25F);

		rightTrackWheelModels[78].addShapeBox(-6F, -6F, 1F, 5, 4, 1, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 402
		rightTrackWheelModels[78].setRotationPoint(-18F, -11F, -25F);

		rightTrackWheelModels[79].addShapeBox(-6F, -6F, 2F, 12, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		rightTrackWheelModels[79].setRotationPoint(-18F, -11F, -25F);

		rightTrackWheelModels[80].addBox(-2F, -6F, 1F, 4, 1, 1, 0F); // Box 404
		rightTrackWheelModels[80].setRotationPoint(-18F, -11F, -25F);

		rightTrackWheelModels[81].addShapeBox(-3F, -6F, 1F, 9, 4, 1, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 405
		rightTrackWheelModels[81].setRotationPoint(-18F, -11F, -25F);

		rightTrackWheelModels[82].addBox(5F, -2F, 1F, 1, 4, 1, 0F); // Box 406
		rightTrackWheelModels[82].setRotationPoint(-18F, -11F, -25F);

		rightTrackWheelModels[83].addBox(-6F, -2F, 2F, 12, 4, 6, 0F); // Box 407
		rightTrackWheelModels[83].setRotationPoint(-18F, -11F, -25F);

		rightTrackWheelModels[84].addShapeBox(1F, 2F, 1F, 5, 4, 1, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 409
		rightTrackWheelModels[84].setRotationPoint(-18F, -11F, -25F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Import ImportTrackL1
		leftTrackModel[1] = new ModelRendererTurbo(this, 521, 81, textureX, textureY); // Import ImportTrackL10
		leftTrackModel[2] = new ModelRendererTurbo(this, 985, 81, textureX, textureY); // Import ImportTrackL11
		leftTrackModel[3] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Import ImportTrackL12
		leftTrackModel[4] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Import ImportTrackL2
		leftTrackModel[5] = new ModelRendererTurbo(this, 545, 89, textureX, textureY); // Import ImportTrackL3
		leftTrackModel[6] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Import ImportTrackL4
		leftTrackModel[7] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Import ImportTrackL5
		leftTrackModel[8] = new ModelRendererTurbo(this, 577, 89, textureX, textureY); // Import ImportTrackL6
		leftTrackModel[9] = new ModelRendererTurbo(this, 601, 89, textureX, textureY); // Import ImportTrackL7
		leftTrackModel[10] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Import ImportTrackL8
		leftTrackModel[11] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 423

		leftTrackModel[0].addBox(26F, 5F, -9F, 6, 1, 9, 0F); // Import ImportTrackL1
		leftTrackModel[0].setRotationPoint(41F, -25F, 25F);

		leftTrackModel[1].addBox(-61F, 5.2F, -9F, 4, 1, 9, 0F); // Import ImportTrackL10
		leftTrackModel[1].setRotationPoint(40F, -23.5F, 25F);

		leftTrackModel[2].addBox(-52.8F, -39.45F, -9F, 6, 1, 9, 0F); // Import ImportTrackL11
		leftTrackModel[2].setRotationPoint(40F, -23.5F, 25F);
		leftTrackModel[2].rotateAngleZ = 0.78539816F;

		leftTrackModel[3].addBox(-62.82F, 8F, -9F, 1, 5, 9, 0F); // Import ImportTrackL12
		leftTrackModel[3].setRotationPoint(37.5F, -22F, 25F);

		leftTrackModel[4].addBox(-48F, 21F, -9F, 80, 1, 9, 0F); // Import ImportTrackL2
		leftTrackModel[4].setRotationPoint(27.5F, -26F, 25F);

		leftTrackModel[5].addBox(26.5F, -18.64F, -9F, 4, 1, 9, 0F); // Import ImportTrackL3
		leftTrackModel[5].setRotationPoint(41F, -25F, 25F);
		leftTrackModel[5].rotateAngleZ = -0.76794487F;

		leftTrackModel[6].addBox(33.9F, 7.79F, -9F, 1, 3, 9, 0F); // Import ImportTrackL4
		leftTrackModel[6].setRotationPoint(41F, -25F, 25F);

		leftTrackModel[7].addBox(28.33F, -22.83F, -9F, 1, 18, 9, 0F); // Import ImportTrackL5
		leftTrackModel[7].setRotationPoint(41F, -27F, 25F);
		leftTrackModel[7].rotateAngleZ = -1.01229097F;

		leftTrackModel[8].addBox(28.33F, -6.3F, -9F, 1, 1, 9, 0F); // Import ImportTrackL6
		leftTrackModel[8].setRotationPoint(40F, -26F, 25F);
		leftTrackModel[8].rotateAngleZ = -1.01229097F;

		leftTrackModel[9].addBox(9F, -24.87F, -9F, 1, 17, 9, 0F); // Import ImportTrackL7
		leftTrackModel[9].setRotationPoint(42F, -26F, 25F);
		leftTrackModel[9].rotateAngleZ = -1.44862328F;

		leftTrackModel[10].addBox(-34.65F, 6.68F, -9F, 69, 1, 9, 0F); // Import ImportTrackL8
		leftTrackModel[10].setRotationPoint(17F, -25F, 25F);

		leftTrackModel[11].addBox(0F, 0F, -9F, 6, 1, 9, 0F); // Box 423
		leftTrackModel[11].setRotationPoint(-24F, -9F, 25F);
		leftTrackModel[11].rotateAngleZ = -0.78539816F;
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 625, 89, textureX, textureY); // Import ImportTrackR1
		rightTrackModel[1] = new ModelRendererTurbo(this, 649, 89, textureX, textureY); // Import ImportTrackR10
		rightTrackModel[2] = new ModelRendererTurbo(this, 681, 89, textureX, textureY); // Import ImportTrackR11
		rightTrackModel[3] = new ModelRendererTurbo(this, 905, 89, textureX, textureY); // Import ImportTrackR12
		rightTrackModel[4] = new ModelRendererTurbo(this, 953, 89, textureX, textureY); // Import ImportTrackR2
		rightTrackModel[5] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Import ImportTrackR3
		rightTrackModel[6] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Import ImportTrackR4
		rightTrackModel[7] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Import ImportTrackR5
		rightTrackModel[8] = new ModelRendererTurbo(this, 809, 105, textureX, textureY); // Import ImportTrackR6
		rightTrackModel[9] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Import ImportTrackR7
		rightTrackModel[10] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Import ImportTrackR8
		rightTrackModel[11] = new ModelRendererTurbo(this, 593, 129, textureX, textureY); // Box 422

		rightTrackModel[0].addBox(9F, -24.87F, -4F, 1, 17, 9, 0F); // Import ImportTrackR1
		rightTrackModel[0].setRotationPoint(42F, -26F, -21F);
		rightTrackModel[0].rotateAngleZ = -1.44862328F;

		rightTrackModel[1].addBox(-61F, 5.2F, -4F, 4, 1, 9, 0F); // Import ImportTrackR10
		rightTrackModel[1].setRotationPoint(40F, -23.5F, -21F);

		rightTrackModel[2].addBox(-52.8F, -39.45F, -4F, 6, 1, 9, 0F); // Import ImportTrackR11
		rightTrackModel[2].setRotationPoint(40F, -23.5F, -21F);
		rightTrackModel[2].rotateAngleZ = 0.78539816F;

		rightTrackModel[3].addBox(-62.82F, 8F, -4F, 1, 5, 9, 0F); // Import ImportTrackR12
		rightTrackModel[3].setRotationPoint(37.5F, -22F, -21F);

		rightTrackModel[4].addBox(26F, 5F, -4F, 5, 1, 9, 0F); // Import ImportTrackR2
		rightTrackModel[4].setRotationPoint(42F, -25F, -21F);

		rightTrackModel[5].addBox(26.5F, -18.64F, -4F, 4, 1, 9, 0F); // Import ImportTrackR3
		rightTrackModel[5].setRotationPoint(41F, -25F, -21F);
		rightTrackModel[5].rotateAngleZ = -0.76794487F;

		rightTrackModel[6].addBox(33.9F, 7.79F, -4F, 1, 4, 9, 0F); // Import ImportTrackR4
		rightTrackModel[6].setRotationPoint(41F, -25F, -21F);

		rightTrackModel[7].addBox(28.33F, -22.83F, -4F, 1, 17, 9, 0F); // Import ImportTrackR5
		rightTrackModel[7].setRotationPoint(41F, -26F, -21F);
		rightTrackModel[7].rotateAngleZ = -1.01229097F;

		rightTrackModel[8].addBox(-48F, 21F, -4F, 81, 1, 9, 0F); // Import ImportTrackR6
		rightTrackModel[8].setRotationPoint(27.5F, -26F, -21F);

		rightTrackModel[9].addBox(28.33F, -6.3F, -4F, 1, 1, 9, 0F); // Import ImportTrackR7
		rightTrackModel[9].setRotationPoint(40F, -26F, -21F);
		rightTrackModel[9].rotateAngleZ = -1.01229097F;

		rightTrackModel[10].addBox(-34.65F, 6.68F, -4F, 69, 1, 9, 0F); // Import ImportTrackR8
		rightTrackModel[10].setRotationPoint(17F, -25F, -21F);

		rightTrackModel[11].addBox(0F, 0F, -4F, 6, 1, 9, 0F); // Box 422
		rightTrackModel[11].setRotationPoint(-24F, -9F, -21F);
		rightTrackModel[11].rotateAngleZ = -0.78539816F;
	}

	private void initGuns() {
	}
	{

		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[6];
		gun_1_Model[0][0] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 469
		gun_1_Model[0][1] = new ModelRendererTurbo(this, 969, 161, textureX, textureY); // Box 480
		gun_1_Model[0][2] = new ModelRendererTurbo(this, 601, 9, textureX, textureY); // Box 481
		gun_1_Model[0][3] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 482
		gun_1_Model[0][4] = new ModelRendererTurbo(this, 553, 73, textureX, textureY); // Box 483
		gun_1_Model[0][5] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 484

		gun_1_Model[0][0].addShapeBox(2F, 1F, -1.5F, 5, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 469

		gun_1_Model[0][1].addShapeBox(6.5F, 2F, -4.5F, 1, 2, 9, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 480

		gun_1_Model[0][2].addShapeBox(6.5F, -5F, -4.5F, 1, 2, 3, 0F,-0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 481

		gun_1_Model[0][3].addShapeBox(6.5F, -3F, -4.5F, 1, 5, 3, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 482

		gun_1_Model[0][4].addShapeBox(6.5F, -3F, 1.5F, 1, 5, 3, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 483

		gun_1_Model[0][5].addShapeBox(6.5F, -5F, 1.5F, 1, 2, 3, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 484

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[0])
		{
			gunPart.setRotationPoint(0F, -60F, 11F);
		}


		gun_1_Model[1] = new ModelRendererTurbo[0];

		gun_1_Model[2] = new ModelRendererTurbo[12];
		gun_1_Model[2][0] = new ModelRendererTurbo(this, 129, 161, textureX, textureY); // Box 468
		gun_1_Model[2][1] = new ModelRendererTurbo(this, 569, 169, textureX, textureY); // Box 470
		gun_1_Model[2][2] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 471
		gun_1_Model[2][3] = new ModelRendererTurbo(this, 945, 25, textureX, textureY); // Box 472
		gun_1_Model[2][4] = new ModelRendererTurbo(this, 585, 33, textureX, textureY); // Box 473
		gun_1_Model[2][5] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 474
		gun_1_Model[2][6] = new ModelRendererTurbo(this, 577, 89, textureX, textureY); // Box 475
		gun_1_Model[2][7] = new ModelRendererTurbo(this, 681, 89, textureX, textureY); // Box 476
		gun_1_Model[2][8] = new ModelRendererTurbo(this, 153, 161, textureX, textureY); // Box 477
		gun_1_Model[2][9] = new ModelRendererTurbo(this, 529, 169, textureX, textureY); // Box 478
		gun_1_Model[2][10] = new ModelRendererTurbo(this, 705, 105, textureX, textureY); // Box 479
		gun_1_Model[2][11] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 433

		gun_1_Model[2][0].addShapeBox(-3F, 0F, -2F, 7, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 468

		gun_1_Model[2][1].addShapeBox(-5F, -2F, -2F, 10, 3, 4, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 470

		gun_1_Model[2][2].addShapeBox(-7F, -2F, 1F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 471

		gun_1_Model[2][3].addShapeBox(-7F, -2F, -2F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 472

		gun_1_Model[2][4].addShapeBox(-7F, -2F, 1F, 3, 1, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 1F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 1F, 0F, -0.3F, -1F, 0F, -0.3F, 0F); // Box 473

		gun_1_Model[2][5].addShapeBox(-7F, 0F, 1F, 3, 1, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 1F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 1F, 0F, -0.3F, -1F, 0F, -0.3F, 0F); // Box 474

		gun_1_Model[2][6].addShapeBox(-7F, 0F, -1F, 3, 1, 1, 0F,0F, -0.3F, 1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, 0F, -0.3F, 1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F); // Box 475

		gun_1_Model[2][7].addShapeBox(-7F, -2F, -1F, 3, 1, 1, 0F,0F, -0.3F, 1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, 0F, -0.3F, 1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F); // Box 476

		gun_1_Model[2][8].addShapeBox(5F, -2F, -1.5F, 8, 3, 3, 0F,0F, -0.5F, -0.5F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.5F, -0.5F); // Box 477

		gun_1_Model[2][9].addShapeBox(13F, -2F, -1.5F, 8, 3, 3, 0F,0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F); // Box 478

		gun_1_Model[2][10].addShapeBox(21F, -2F, -1.5F, 3, 3, 3, 0F,0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F); // Box 479

		gun_1_Model[2][11].addShapeBox(1F, -1F, 1.5F, 3, 3, 5, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 433

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[2])
		{
			gunPart.setRotationPoint(0F, -60F, 11F);
		}


		registerGunModel("Browning", gun_1_Model);
	}
}