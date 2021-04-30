//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 06.07.2016 - 17:44:18
// Last changed on: 06.07.2016 - 17:44:18

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelBabylonLion extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelBabylonLion() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[85];
		turretModel = new ModelRendererTurbo[189];
		barrelModel = new ModelRendererTurbo[13];
		rightBackWheelModel = new ModelRendererTurbo[3];
		leftTrackWheelModels = new ModelRendererTurbo[27];
		rightTrackWheelModels = new ModelRendererTurbo[18];
		leftTrackModel = new ModelRendererTurbo[10];
		rightTrackModel = new ModelRendererTurbo[10];

		initbodyModel_1();
		initturretModel_1();
		initbarrelModel_1();
		initrightBackWheelModel_1();
		initleftTrackWheelModels_1();
		initrightTrackWheelModels_1();
		initleftTrackModel_1();
		initrightTrackModel_1();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 609, 17, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 321, 105, textureX, textureY); // Box 79
		bodyModel[9] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 80
		bodyModel[10] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 81
		bodyModel[11] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 82
		bodyModel[12] = new ModelRendererTurbo(this, 905, 105, textureX, textureY); // Box 83
		bodyModel[13] = new ModelRendererTurbo(this, 529, 113, textureX, textureY); // Box 85
		bodyModel[14] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 83
		bodyModel[15] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 85
		bodyModel[16] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 86
		bodyModel[17] = new ModelRendererTurbo(this, 609, 33, textureX, textureY); // Box 87
		bodyModel[18] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 88
		bodyModel[19] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 89
		bodyModel[20] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 90
		bodyModel[21] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 91
		bodyModel[22] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Box 92
		bodyModel[23] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Box 93
		bodyModel[24] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Box 94
		bodyModel[25] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 95
		bodyModel[26] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 96
		bodyModel[27] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 97
		bodyModel[28] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 98
		bodyModel[29] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 99
		bodyModel[30] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 100
		bodyModel[31] = new ModelRendererTurbo(this, 953, 97, textureX, textureY); // Box 101
		bodyModel[32] = new ModelRendererTurbo(this, 753, 105, textureX, textureY); // Box 102
		bodyModel[33] = new ModelRendererTurbo(this, 913, 105, textureX, textureY); // Box 104
		bodyModel[34] = new ModelRendererTurbo(this, 753, 113, textureX, textureY); // Box 105
		bodyModel[35] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 106
		bodyModel[36] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 107
		bodyModel[37] = new ModelRendererTurbo(this, 881, 17, textureX, textureY); // Box 108
		bodyModel[38] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 109
		bodyModel[39] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 110
		bodyModel[40] = new ModelRendererTurbo(this, 569, 25, textureX, textureY); // Box 111
		bodyModel[41] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 112
		bodyModel[42] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 113
		bodyModel[43] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Box 114
		bodyModel[44] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 115
		bodyModel[45] = new ModelRendererTurbo(this, 969, 105, textureX, textureY); // Box 116
		bodyModel[46] = new ModelRendererTurbo(this, 793, 113, textureX, textureY); // Box 117
		bodyModel[47] = new ModelRendererTurbo(this, 833, 113, textureX, textureY); // Box 118
		bodyModel[48] = new ModelRendererTurbo(this, 873, 113, textureX, textureY); // Box 119
		bodyModel[49] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 120
		bodyModel[50] = new ModelRendererTurbo(this, 857, 33, textureX, textureY); // Box 121
		bodyModel[51] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Box 122
		bodyModel[52] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Box 11
		bodyModel[53] = new ModelRendererTurbo(this, 745, 129, textureX, textureY); // Box 126
		bodyModel[54] = new ModelRendererTurbo(this, 281, 137, textureX, textureY); // Box 127
		bodyModel[55] = new ModelRendererTurbo(this, 569, 17, textureX, textureY); // Box 128
		bodyModel[56] = new ModelRendererTurbo(this, 969, 17, textureX, textureY); // Box 129
		bodyModel[57] = new ModelRendererTurbo(this, 921, 33, textureX, textureY); // Box 130
		bodyModel[58] = new ModelRendererTurbo(this, 833, 249, textureX, textureY); // Box 332
		bodyModel[59] = new ModelRendererTurbo(this, 401, 257, textureX, textureY); // Box 333
		bodyModel[60] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 334
		bodyModel[61] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 335
		bodyModel[62] = new ModelRendererTurbo(this, 481, 257, textureX, textureY); // Box 336
		bodyModel[63] = new ModelRendererTurbo(this, 561, 257, textureX, textureY); // Box 337
		bodyModel[64] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 338
		bodyModel[65] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 339
		bodyModel[66] = new ModelRendererTurbo(this, 457, 153, textureX, textureY); // Box 340
		bodyModel[67] = new ModelRendererTurbo(this, 425, 137, textureX, textureY); // Box 341
		bodyModel[68] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 342
		bodyModel[69] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 343
		bodyModel[70] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Box 121
		bodyModel[71] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Box 122
		bodyModel[72] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Box 123
		bodyModel[73] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 126
		bodyModel[74] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 352
		bodyModel[75] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 353
		bodyModel[76] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 354
		bodyModel[77] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 355
		bodyModel[78] = new ModelRendererTurbo(this, 545, 17, textureX, textureY); // Box 595
		bodyModel[79] = new ModelRendererTurbo(this, 609, 17, textureX, textureY); // Box 596
		bodyModel[80] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 597
		bodyModel[81] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 598
		bodyModel[82] = new ModelRendererTurbo(this, 881, 17, textureX, textureY); // Box 599
		bodyModel[83] = new ModelRendererTurbo(this, 897, 17, textureX, textureY); // Box 600
		bodyModel[84] = new ModelRendererTurbo(this, 228, 4, textureX, textureY); // Box 355

		bodyModel[0].addBox(0F, 0F, 0F, 63, 23, 45, 0F); // Box 0
		bodyModel[0].setRotationPoint(-31F, -18.5F, -22.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 31, 23, 45, 0F,0F, 0F, 0F, 0F, -12.5F, 0F, 0F, -12.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10.5F, 0F, 0F, -10.5F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(32F, -18.5F, -22.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 33, 23, 45, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-64F, -18.5F, -22.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 7, 21, 45, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -13F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -13F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-70.9F, -18.5F, -22.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 129, 1, 13, 0F); // Box 4
		bodyModel[4].setRotationPoint(-69F, -15F, -35.5F);

		bodyModel[5].addBox(0F, 0F, 0F, 129, 1, 13, 0F); // Box 5
		bodyModel[5].setRotationPoint(-69F, -15F, 22.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 4, 1, 13, 0F,-1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F); // Box 6
		bodyModel[6].setRotationPoint(-73F, -15F, -35.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 4, 1, 13, 0F,-1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F); // Box 7
		bodyModel[7].setRotationPoint(-73F, -15F, 22.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 14, 4, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[8].setRotationPoint(-63F, -18.6F, -20.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 14, 4, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[9].setRotationPoint(-63F, -18.6F, 0.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 14, 4, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[10].setRotationPoint(-48F, -19F, -19.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 4, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[11].setRotationPoint(-70.5F, -17.8F, 6.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 4, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[12].setRotationPoint(-70.5F, -17.8F, -9.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 101, 5, 12, 0F,0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 24F, 0F, 0F, 24F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[13].setRotationPoint(-69F, -19.6F, 22.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 101, 5, 12, 0F,0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 24F, 0F, 0F, 24F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[14].setRotationPoint(-69F, -19.6F, -34.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 24, 9, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5.5F, 3F, -0.6F, -0.3F, 3F, -0.6F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[15].setRotationPoint(36F, -15F, 21.95F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 24, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[16].setRotationPoint(5F, -18.6F, 26.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 22, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[17].setRotationPoint(-31F, -19F, 25.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 88
		bodyModel[18].setRotationPoint(5F, -18.8F, 26.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 89
		bodyModel[19].setRotationPoint(10F, -18.8F, 26.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 90
		bodyModel[20].setRotationPoint(18F, -18.8F, 26.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 91
		bodyModel[21].setRotationPoint(25F, -18.8F, 26.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 92
		bodyModel[22].setRotationPoint(-14F, -19.8F, 25.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 93
		bodyModel[23].setRotationPoint(-21F, -19.8F, 25.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 94
		bodyModel[24].setRotationPoint(-28F, -19.8F, 25.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 16, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[25].setRotationPoint(-68F, -19F, 25.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 96
		bodyModel[26].setRotationPoint(-57F, -19.8F, 25.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 97
		bodyModel[27].setRotationPoint(-66F, -19.8F, 25.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 98
		bodyModel[28].setRotationPoint(-62F, -19.8F, 25.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 99
		bodyModel[29].setRotationPoint(-53F, -19.8F, -34F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 100
		bodyModel[30].setRotationPoint(-35F, -19.8F, -34F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 101
		bodyModel[31].setRotationPoint(5F, -18.8F, -34F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 102
		bodyModel[32].setRotationPoint(30F, -18.3F, -34F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 2, 30, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.1F, -0.1F, -0.4F, 0.2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 104
		bodyModel[33].setRotationPoint(33F, -18.8F, -16.5F);
		bodyModel[33].rotateAngleX = -0.31415927F;
		bodyModel[33].rotateAngleY = -0.90757121F;

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 2, 29, 0F,-0.4F, -0.05F, 0F, -0.4F, -0.35F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 105
		bodyModel[34].setRotationPoint(55.5F, -9.8F, -1F);
		bodyModel[34].rotateAngleX = 0.31415927F;
		bodyModel[34].rotateAngleY = 0.90757121F;
		bodyModel[34].rotateAngleZ = -0.01745329F;

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.3F, 0.3F, -0.2F, -0.2F, -0.15F, -0.2F, -0.15F, -0.15F, -0.25F, -0.3F, 0.3F, -0.2F, -0.3F, 0F, -0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.3F, 0F, -0.2F); // Box 106
		bodyModel[35].setRotationPoint(54.55F, -9.62F, -0.45F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 107
		bodyModel[36].setRotationPoint(46F, -13F, -4.45F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 108
		bodyModel[37].setRotationPoint(43.7F, -14F, -5.45F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 109
		bodyModel[38].setRotationPoint(41.5F, -14.8F, -5.45F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 110
		bodyModel[39].setRotationPoint(39.3F, -15.8F, -5.45F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 2F, 0F, 1F); // Box 111
		bodyModel[40].setRotationPoint(34.3F, -18.2F, -2.45F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 2F, 0F, 1F); // Box 112
		bodyModel[41].setRotationPoint(34.4F, -18F, -2F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[42].setRotationPoint(24.3F, -18.8F, -3.45F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[43].setRotationPoint(24.3F, -18.8F, -6.45F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 115
		bodyModel[44].setRotationPoint(24.3F, -18.8F, 4.55F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 5, 1, 13, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[45].setRotationPoint(60F, -15F, -35.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 5, 1, 13, 0F,0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[46].setRotationPoint(65F, -14F, -35.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 5, 1, 13, 0F,0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[47].setRotationPoint(65F, -14F, 22.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 5, 1, 13, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[48].setRotationPoint(60F, -15F, 22.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 7, 9, 1, 0F,0F, 0F, -0.5F, -2F, -1F, -0.5F, -2F, -1F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 3F, -1.1F, -0.5F, 3F, -1.1F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[49].setRotationPoint(60F, -15F, 21.95F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 7, 9, 1, 0F,0F, 0F, -0.5F, -2F, -1F, -0.5F, -2F, -1F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 3F, -1.1F, -0.5F, 3F, -1.1F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[50].setRotationPoint(60F, -15F, -23.45F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 24, 9, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5.5F, 3F, -0.6F, -0.3F, 3F, -0.6F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[51].setRotationPoint(36F, -15F, -23.45F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 4, 2, 71, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 11
		bodyModel[52].setRotationPoint(-76.75F, -10.8F, -35F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 4, 2, 71, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 126
		bodyModel[53].setRotationPoint(-76.75F, -7.8F, -35F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 4, 1, 71, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 127
		bodyModel[54].setRotationPoint(-76.75F, -8.8F, -35F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 128
		bodyModel[55].setRotationPoint(-76.75F, -5.8F, -20F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 129
		bodyModel[56].setRotationPoint(-76.75F, -5.8F, 20F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 130
		bodyModel[57].setRotationPoint(-76.75F, -5.8F, 0F);

		bodyModel[58].addBox(0F, 0F, 0F, 93, 10, 1, 0F); // Box 332
		bodyModel[58].setRotationPoint(-33F, -15F, -36.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 36, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -6F, 0F); // Box 333
		bodyModel[59].setRotationPoint(-69F, -15F, -36.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[60].setRotationPoint(60F, -15F, -36.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,0F, 0F, 0F, 0F, -5.4F, 0F, 0F, -5.4F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F); // Box 335
		bodyModel[61].setRotationPoint(65F, -14F, -36.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 36, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -6F, 0F); // Box 336
		bodyModel[62].setRotationPoint(-69F, -15F, 35.5F);

		bodyModel[63].addBox(0F, 0F, 0F, 93, 10, 1, 0F); // Box 337
		bodyModel[63].setRotationPoint(-33F, -15F, 35.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 338
		bodyModel[64].setRotationPoint(60F, -15F, 35.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,0F, 0F, 0F, 0F, -5.4F, 0F, 0F, -5.4F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F); // Box 339
		bodyModel[65].setRotationPoint(65F, -14F, 35.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 340
		bodyModel[66].setRotationPoint(-51F, -19F, 34F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 13, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[67].setRotationPoint(-49.5F, -17.5F, 34F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F); // Box 342
		bodyModel[68].setRotationPoint(-50.5F, -17.5F, 34F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[69].setRotationPoint(-36.5F, -17.5F, 34F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 121
		bodyModel[70].setRotationPoint(52.2F, -13.4F, 17.15F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 122
		bodyModel[71].setRotationPoint(52.2F, -14.4F, 17.15F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F); // Box 123
		bodyModel[72].setRotationPoint(52.2F, -12.4F, 17.15F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 126
		bodyModel[73].setRotationPoint(51.3F, -12.9F, 16.1F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 352
		bodyModel[74].setRotationPoint(51.3F, -12.9F, -18.9F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F); // Box 353
		bodyModel[75].setRotationPoint(52.2F, -12.4F, -17.85F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 354
		bodyModel[76].setRotationPoint(52.2F, -13.4F, -17.85F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 355
		bodyModel[77].setRotationPoint(52.2F, -14.4F, -17.85F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0.3F, 1F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 1F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 595
		bodyModel[78].setRotationPoint(51.2F, -10F, -18.85F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0.3F, 1F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 1F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 596
		bodyModel[79].setRotationPoint(51.2F, -10F, 16.15F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 597
		bodyModel[80].setRotationPoint(51.3F, -12.9F, 18.1F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 598
		bodyModel[81].setRotationPoint(51.3F, -12.9F, -16.9F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0.3F, 1.2F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 1.2F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 599
		bodyModel[82].setRotationPoint(58.2F, -7.2F, -12.85F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0.3F, 1.2F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 1.2F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 600
		bodyModel[83].setRotationPoint(58.2F, -7.2F, 13.15F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 30, 23, 42, 0F,-5F, -1.8F, 0F, -0.5F, -11.8F, 0F, -0.5F, -11.8F, 0F, -5F, -1.8F, 0F, 0F, -1.8F, 0F, -0.6F, -10.5F, 0F, -0.6F, -10.5F, 0F, 0F, -1.8F, 0F); // Box 355
		bodyModel[84].setRotationPoint(32.5F, -18.5F, -21F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 281, 121, textureX, textureY); // Box 132
		turretModel[1] = new ModelRendererTurbo(this, 825, 129, textureX, textureY); // Box 133
		turretModel[2] = new ModelRendererTurbo(this, 361, 137, textureX, textureY); // Box 134
		turretModel[3] = new ModelRendererTurbo(this, 985, 121, textureX, textureY); // Box 135
		turretModel[4] = new ModelRendererTurbo(this, 497, 137, textureX, textureY); // Box 136
		turretModel[5] = new ModelRendererTurbo(this, 497, 129, textureX, textureY); // Box 137
		turretModel[6] = new ModelRendererTurbo(this, 825, 129, textureX, textureY); // Box 138
		turretModel[7] = new ModelRendererTurbo(this, 217, 137, textureX, textureY); // Box 139
		turretModel[8] = new ModelRendererTurbo(this, 601, 137, textureX, textureY); // Box 140
		turretModel[9] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 141
		turretModel[10] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Box 142
		turretModel[11] = new ModelRendererTurbo(this, 281, 137, textureX, textureY); // Box 143
		turretModel[12] = new ModelRendererTurbo(this, 561, 137, textureX, textureY); // Box 144
		turretModel[13] = new ModelRendererTurbo(this, 665, 137, textureX, textureY); // Box 145
		turretModel[14] = new ModelRendererTurbo(this, 673, 145, textureX, textureY); // Box 146
		turretModel[15] = new ModelRendererTurbo(this, 953, 137, textureX, textureY); // Box 147
		turretModel[16] = new ModelRendererTurbo(this, 65, 145, textureX, textureY); // Box 148
		turretModel[17] = new ModelRendererTurbo(this, 161, 145, textureX, textureY); // Box 149
		turretModel[18] = new ModelRendererTurbo(this, 737, 145, textureX, textureY); // Box 150
		turretModel[19] = new ModelRendererTurbo(this, 433, 161, textureX, textureY); // Box 151
		turretModel[20] = new ModelRendererTurbo(this, 361, 137, textureX, textureY); // Box 152
		turretModel[21] = new ModelRendererTurbo(this, 993, 105, textureX, textureY); // Box 154
		turretModel[22] = new ModelRendererTurbo(this, 953, 121, textureX, textureY); // Box 155
		turretModel[23] = new ModelRendererTurbo(this, 889, 145, textureX, textureY); // Box 156
		turretModel[24] = new ModelRendererTurbo(this, 913, 169, textureX, textureY); // Box 157
		turretModel[25] = new ModelRendererTurbo(this, 489, 185, textureX, textureY); // Box 158
		turretModel[26] = new ModelRendererTurbo(this, 281, 161, textureX, textureY); // Box 159
		turretModel[27] = new ModelRendererTurbo(this, 569, 185, textureX, textureY); // Box 160
		turretModel[28] = new ModelRendererTurbo(this, 217, 161, textureX, textureY); // Box 161
		turretModel[29] = new ModelRendererTurbo(this, 961, 169, textureX, textureY); // Box 162
		turretModel[30] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 163
		turretModel[31] = new ModelRendererTurbo(this, 73, 193, textureX, textureY); // Box 164
		turretModel[32] = new ModelRendererTurbo(this, 121, 193, textureX, textureY); // Box 165
		turretModel[33] = new ModelRendererTurbo(this, 609, 193, textureX, textureY); // Box 166
		turretModel[34] = new ModelRendererTurbo(this, 657, 193, textureX, textureY); // Box 167
		turretModel[35] = new ModelRendererTurbo(this, 169, 201, textureX, textureY); // Box 168
		turretModel[36] = new ModelRendererTurbo(this, 217, 201, textureX, textureY); // Box 169
		turretModel[37] = new ModelRendererTurbo(this, 409, 201, textureX, textureY); // Box 170
		turretModel[38] = new ModelRendererTurbo(this, 705, 209, textureX, textureY); // Box 171
		turretModel[39] = new ModelRendererTurbo(this, 777, 209, textureX, textureY); // Box 172
		turretModel[40] = new ModelRendererTurbo(this, 761, 177, textureX, textureY); // Box 173
		turretModel[41] = new ModelRendererTurbo(this, 361, 185, textureX, textureY); // Box 174
		turretModel[42] = new ModelRendererTurbo(this, 993, 73, textureX, textureY); // Box 176
		turretModel[43] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Box 177
		turretModel[44] = new ModelRendererTurbo(this, 817, 113, textureX, textureY); // Box 178
		turretModel[45] = new ModelRendererTurbo(this, 857, 49, textureX, textureY); // Box 181
		turretModel[46] = new ModelRendererTurbo(this, 913, 49, textureX, textureY); // Box 182
		turretModel[47] = new ModelRendererTurbo(this, 841, 65, textureX, textureY); // Box 186
		turretModel[48] = new ModelRendererTurbo(this, 897, 65, textureX, textureY); // Box 189
		turretModel[49] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 190
		turretModel[50] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 177
		turretModel[51] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 178
		turretModel[52] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 179
		turretModel[53] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 180
		turretModel[54] = new ModelRendererTurbo(this, 601, 137, textureX, textureY); // Box 181
		turretModel[55] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 183
		turretModel[56] = new ModelRendererTurbo(this, 537, 185, textureX, textureY); // Box 184
		turretModel[57] = new ModelRendererTurbo(this, 969, 193, textureX, textureY); // Box 185
		turretModel[58] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 186
		turretModel[59] = new ModelRendererTurbo(this, 537, 73, textureX, textureY); // Box 188
		turretModel[60] = new ModelRendererTurbo(this, 593, 73, textureX, textureY); // Box 189
		turretModel[61] = new ModelRendererTurbo(this, 617, 73, textureX, textureY); // Box 192
		turretModel[62] = new ModelRendererTurbo(this, 633, 81, textureX, textureY); // Box 193
		turretModel[63] = new ModelRendererTurbo(this, 857, 113, textureX, textureY); // Box 194
		turretModel[64] = new ModelRendererTurbo(this, 489, 153, textureX, textureY); // Box 195
		turretModel[65] = new ModelRendererTurbo(this, 825, 153, textureX, textureY); // Box 197
		turretModel[66] = new ModelRendererTurbo(this, 49, 193, textureX, textureY); // Box 198
		turretModel[67] = new ModelRendererTurbo(this, 457, 209, textureX, textureY); // Box 199
		turretModel[68] = new ModelRendererTurbo(this, 753, 209, textureX, textureY); // Box 200
		turretModel[69] = new ModelRendererTurbo(this, 825, 209, textureX, textureY); // Box 201
		turretModel[70] = new ModelRendererTurbo(this, 745, 121, textureX, textureY); // Box 202
		turretModel[71] = new ModelRendererTurbo(this, 777, 145, textureX, textureY); // Box 203
		turretModel[72] = new ModelRendererTurbo(this, 921, 145, textureX, textureY); // Box 204
		turretModel[73] = new ModelRendererTurbo(this, 425, 153, textureX, textureY); // Box 205
		turretModel[74] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 206
		turretModel[75] = new ModelRendererTurbo(this, 361, 161, textureX, textureY); // Box 207
		turretModel[76] = new ModelRendererTurbo(this, 665, 161, textureX, textureY); // Box 208
		turretModel[77] = new ModelRendererTurbo(this, 737, 169, textureX, textureY); // Box 209
		turretModel[78] = new ModelRendererTurbo(this, 825, 185, textureX, textureY); // Box 210
		turretModel[79] = new ModelRendererTurbo(this, 865, 185, textureX, textureY); // Box 212
		turretModel[80] = new ModelRendererTurbo(this, 793, 129, textureX, textureY); // Box 213
		turretModel[81] = new ModelRendererTurbo(this, 889, 129, textureX, textureY); // Box 214
		turretModel[82] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 215
		turretModel[83] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 216
		turretModel[84] = new ModelRendererTurbo(this, 705, 193, textureX, textureY); // Box 217
		turretModel[85] = new ModelRendererTurbo(this, 873, 209, textureX, textureY); // Box 218
		turretModel[86] = new ModelRendererTurbo(this, 913, 209, textureX, textureY); // Box 219
		turretModel[87] = new ModelRendererTurbo(this, 297, 217, textureX, textureY); // Box 221
		turretModel[88] = new ModelRendererTurbo(this, 321, 217, textureX, textureY); // Box 222
		turretModel[89] = new ModelRendererTurbo(this, 545, 217, textureX, textureY); // Box 223
		turretModel[90] = new ModelRendererTurbo(this, 937, 217, textureX, textureY); // Box 224
		turretModel[91] = new ModelRendererTurbo(this, 969, 25, textureX, textureY); // Box 225
		turretModel[92] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 226
		turretModel[93] = new ModelRendererTurbo(this, 401, 185, textureX, textureY); // Box 227
		turretModel[94] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 229
		turretModel[95] = new ModelRendererTurbo(this, 65, 225, textureX, textureY); // Box 230
		turretModel[96] = new ModelRendererTurbo(this, 321, 137, textureX, textureY); // Box 232
		turretModel[97] = new ModelRendererTurbo(this, 689, 81, textureX, textureY); // Box 233
		turretModel[98] = new ModelRendererTurbo(this, 521, 105, textureX, textureY); // Box 234
		turretModel[99] = new ModelRendererTurbo(this, 745, 81, textureX, textureY); // Box 235
		turretModel[100] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 236
		turretModel[101] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 237
		turretModel[102] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 238
		turretModel[103] = new ModelRendererTurbo(this, 985, 217, textureX, textureY); // Box 239
		turretModel[104] = new ModelRendererTurbo(this, 913, 81, textureX, textureY); // Box 243
		turretModel[105] = new ModelRendererTurbo(this, 801, 81, textureX, textureY); // Box 244
		turretModel[106] = new ModelRendererTurbo(this, 545, 89, textureX, textureY); // Box 245
		turretModel[107] = new ModelRendererTurbo(this, 857, 81, textureX, textureY); // Box 246
		turretModel[108] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 247
		turretModel[109] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 248
		turretModel[110] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 249
		turretModel[111] = new ModelRendererTurbo(this, 129, 225, textureX, textureY); // Box 250
		turretModel[112] = new ModelRendererTurbo(this, 489, 225, textureX, textureY); // Box 254
		turretModel[113] = new ModelRendererTurbo(this, 249, 137, textureX, textureY); // Box 255
		turretModel[114] = new ModelRendererTurbo(this, 609, 225, textureX, textureY); // Box 256
		turretModel[115] = new ModelRendererTurbo(this, 657, 225, textureX, textureY); // Box 257
		turretModel[116] = new ModelRendererTurbo(this, 561, 137, textureX, textureY); // Box 258
		turretModel[117] = new ModelRendererTurbo(this, 857, 225, textureX, textureY); // Box 259
		turretModel[118] = new ModelRendererTurbo(this, 897, 225, textureX, textureY); // Box 260
		turretModel[119] = new ModelRendererTurbo(this, 161, 233, textureX, textureY); // Box 261
		turretModel[120] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 262
		turretModel[121] = new ModelRendererTurbo(this, 201, 233, textureX, textureY); // Box 263
		turretModel[122] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 264
		turretModel[123] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 265
		turretModel[124] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 266
		turretModel[125] = new ModelRendererTurbo(this, 545, 41, textureX, textureY); // Box 267
		turretModel[126] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 268
		turretModel[127] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 269
		turretModel[128] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Box 270
		turretModel[129] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 271
		turretModel[130] = new ModelRendererTurbo(this, 49, 225, textureX, textureY); // Box 272
		turretModel[131] = new ModelRendererTurbo(this, 113, 225, textureX, textureY); // Box 273
		turretModel[132] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 274
		turretModel[133] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Box 275
		turretModel[134] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 276
		turretModel[135] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 277
		turretModel[136] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 278
		turretModel[137] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 279
		turretModel[138] = new ModelRendererTurbo(this, 1009, 57, textureX, textureY); // Box 280
		turretModel[139] = new ModelRendererTurbo(this, 953, 65, textureX, textureY); // Box 281
		turretModel[140] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 282
		turretModel[141] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 283
		turretModel[142] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 284
		turretModel[143] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 285
		turretModel[144] = new ModelRendererTurbo(this, 577, 89, textureX, textureY); // Box 288
		turretModel[145] = new ModelRendererTurbo(this, 953, 89, textureX, textureY); // Box 289
		turretModel[146] = new ModelRendererTurbo(this, 1009, 89, textureX, textureY); // Box 290
		turretModel[147] = new ModelRendererTurbo(this, 585, 97, textureX, textureY); // Box 291
		turretModel[148] = new ModelRendererTurbo(this, 641, 97, textureX, textureY); // Box 292
		turretModel[149] = new ModelRendererTurbo(this, 697, 97, textureX, textureY); // Box 293
		turretModel[150] = new ModelRendererTurbo(this, 753, 97, textureX, textureY); // Box 294
		turretModel[151] = new ModelRendererTurbo(this, 809, 97, textureX, textureY); // Box 295
		turretModel[152] = new ModelRendererTurbo(this, 857, 97, textureX, textureY); // Box 296
		turretModel[153] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 297
		turretModel[154] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 298
		turretModel[155] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 299
		turretModel[156] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Box 300
		turretModel[157] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 301
		turretModel[158] = new ModelRendererTurbo(this, 281, 105, textureX, textureY); // Box 302
		turretModel[159] = new ModelRendererTurbo(this, 449, 105, textureX, textureY); // Box 303
		turretModel[160] = new ModelRendererTurbo(this, 449, 113, textureX, textureY); // Box 304
		turretModel[161] = new ModelRendererTurbo(this, 977, 121, textureX, textureY); // Box 305
		turretModel[162] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Box 306
		turretModel[163] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Box 307
		turretModel[164] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Box 308
		turretModel[165] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Box 309
		turretModel[166] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 311
		turretModel[167] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 312
		turretModel[168] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Box 313
		turretModel[169] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Box 314
		turretModel[170] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 356
		turretModel[171] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 363
		turretModel[172] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 364
		turretModel[173] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 365
		turretModel[174] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 366
		turretModel[175] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 367
		turretModel[176] = new ModelRendererTurbo(this, 545, 9, textureX, textureY); // Box 368
		turretModel[177] = new ModelRendererTurbo(this, 553, 9, textureX, textureY); // Box 369
		turretModel[178] = new ModelRendererTurbo(this, 609, 9, textureX, textureY); // Box 370
		turretModel[179] = new ModelRendererTurbo(this, 617, 9, textureX, textureY); // Box 371
		turretModel[180] = new ModelRendererTurbo(this, 905, 9, textureX, textureY); // Box 376
		turretModel[181] = new ModelRendererTurbo(this, 945, 9, textureX, textureY); // Box 377
		turretModel[182] = new ModelRendererTurbo(this, 985, 9, textureX, textureY); // Box 378
		turretModel[183] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 379
		turretModel[184] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 380
		turretModel[185] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 381
		turretModel[186] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 382
		turretModel[187] = new ModelRendererTurbo(this, 161, 145, textureX, textureY); // Box 593
		turretModel[188] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 594

		turretModel[0].addShapeBox(1.5F, -3.5F, 17F, 8, 4, 10, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1.3F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1.3F, 0F, 0F, 0.5F); // Box 132
		turretModel[0].setRotationPoint(0F, -19.5F, 0F);

		turretModel[1].addShapeBox(1.5F, -3.5F, -26.7F, 8, 4, 47, 0F,0F, 0F, 0.5F, -0.2F, 0F, -1.3F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.2F, 0F, -1.3F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 133
		turretModel[1].setRotationPoint(0F, -19.5F, 0F);

		turretModel[2].addShapeBox(-6.5F, -3.5F, -26.7F, 8, 4, 43, 0F,0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 134
		turretModel[2].setRotationPoint(0F, -19.5F, 0F);

		turretModel[3].addShapeBox(-6.5F, -3.5F, 17F, 8, 4, 10, 0F,0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 135
		turretModel[3].setRotationPoint(0F, -19.5F, 0F);

		turretModel[4].addShapeBox(9.3F, -3.5F, -24.9F, 9, 4, 40, 0F,0F, 0F, 0.5F, -0.2F, 0F, -5F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, -5.4F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 136
		turretModel[4].setRotationPoint(0F, -19.5F, 0F);

		turretModel[5].addShapeBox(9.3F, -3.5F, 15.2F, 9, 4, 10, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.2F, 0F, 0F, -1F, 0F, -5.4F, 0F, 0F, 0.5F); // Box 137
		turretModel[5].setRotationPoint(0F, -19.5F, 0F);

		turretModel[6].addShapeBox(18.1F, -3.5F, -19F, 6, 4, 15, 0F,0F, 0F, 0.9F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0.5F, -1F, 0F, -6.4F, -0.2F, 0F, 0F, 1F, 0F, 0F); // Box 138
		turretModel[6].setRotationPoint(0F, -19.5F, 0F);

		turretModel[7].addShapeBox(18.1F, -3.5F, 4.3F, 6, 4, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0.9F, 1F, 0F, 0F, -0.2F, 0F, 0F, -1F, 0F, -6.4F, 0.8F, 0F, 0.5F); // Box 139
		turretModel[7].setRotationPoint(0F, -19.5F, 0F);

		turretModel[8].addShapeBox(-14.5F, -3.5F, -26.4F, 8, 4, 41, 0F,-0.2F, 0F, -3.3F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -3.3F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 140
		turretModel[8].setRotationPoint(0F, -19.5F, 0F);

		turretModel[9].addShapeBox(-14.5F, -3.5F, -14F, 8, 4, 41, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.2F, 0F, -3.3F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.2F, 0F, -3.3F); // Box 141
		turretModel[9].setRotationPoint(0F, -19.5F, 0F);

		turretModel[10].addShapeBox(-22.3F, -3.5F, -22.6F, 8, 4, 37, 0F,-0.2F, 0F, -5.3F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -5.8F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 142
		turretModel[10].setRotationPoint(0F, -19.5F, 0F);

		turretModel[11].addShapeBox(-22.3F, -3.5F, 5.2F, 8, 4, 18, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.2F, 0F, -5.3F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.2F, 0F, -5.8F); // Box 143
		turretModel[11].setRotationPoint(0F, -19.5F, 0F);

		turretModel[12].addShapeBox(-30.1F, -3.5F, -16.6F, 8, 4, 23, 0F,0.5F, 0F, -8F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.2F, 0F, -9.8F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 144
		turretModel[12].setRotationPoint(0F, -19.5F, 0F);

		turretModel[13].addShapeBox(-30.1F, -3.5F, 1.2F, 8, 4, 16, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0.5F, 0F, -8F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -0.2F, 0F, -9.8F); // Box 145
		turretModel[13].setRotationPoint(0F, -19.5F, 0F);

		turretModel[14].addShapeBox(-6.5F, -7.5F, -26.7F, 8, 4, 43, 0F,0F, 0F, -0.8F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 146
		turretModel[14].setRotationPoint(0F, -19.5F, 0F);

		turretModel[15].addShapeBox(-6.5F, -7.5F, 1F, 8, 4, 26, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.8F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 147
		turretModel[15].setRotationPoint(0F, -19.5F, 0F);

		turretModel[16].addShapeBox(1.5F, -7.5F, 0F, 8, 4, 27, 0F,0F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -2.4F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -1.3F, 0F, 0F, 0.5F); // Box 148
		turretModel[16].setRotationPoint(0F, -19.5F, 0F);

		turretModel[17].addShapeBox(1.5F, -7.5F, -26.7F, 8, 4, 26, 0F,0F, 0F, -0.5F, -0.2F, 0F, -2.4F, -0.2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.2F, 0F, -1.3F, -0.2F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 149
		turretModel[17].setRotationPoint(0F, -19.5F, 0F);

		turretModel[18].addShapeBox(9.3F, -8.5F, 6.2F, 9, 4, 19, 0F,0F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, -5.65F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -5F, 0F, 0F, 0.5F); // Box 150
		turretModel[18].setRotationPoint(0F, -18.5F, 0F);

		turretModel[19].addShapeBox(9.3F, -7.5F, -24.9F, 9, 4, 31, 0F,0F, 0F, -0.6F, -1.2F, 0F, -5.65F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.2F, 0F, -5F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 151
		turretModel[19].setRotationPoint(0F, -19.5F, 0F);

		turretModel[20].addShapeBox(18.1F, -7.5F, -19F, 6, 4, 15, 0F,1F, 0F, 0.3F, -1.6F, 0F, -8.4F, -0.8F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0.9F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		turretModel[20].setRotationPoint(0F, -19.5F, 0F);

		turretModel[21].addShapeBox(17.05F, -0.5F, -3.7F, 7, 4, 8, 0F,0F, 0F, 0.3F, -0.8F, 0F, 0.3F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0F, 0F, 0F, 0F); // Box 154
		turretModel[21].setRotationPoint(0F, -19.5F, 0F);

		turretModel[22].addShapeBox(17.05F, -3.5F, -3.7F, 7, 4, 8, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F, 0F, 0F, 0F, 0F); // Box 155
		turretModel[22].setRotationPoint(0F, -19.5F, 0F);

		turretModel[23].addShapeBox(18.1F, -8.5F, 4.3F, 6, 4, 15, 0F,2F, 0F, 0F, -0.8F, 0F, 0F, -1.6F, 0F, -8.4F, 1F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0.9F); // Box 156
		turretModel[23].setRotationPoint(0F, -18.5F, 0F);

		turretModel[24].addShapeBox(-14.5F, -7.5F, -26.4F, 8, 4, 28, 0F,-0.2F, 0F, -4.3F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -3.3F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 157
		turretModel[24].setRotationPoint(0F, -19.5F, 0F);

		turretModel[25].addShapeBox(-14.5F, -7.5F, -1.3F, 8, 4, 28, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.2F, 0F, -4.3F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, -0.2F, 0F, -3F); // Box 158
		turretModel[25].setRotationPoint(0F, -19.5F, 0F);

		turretModel[26].addShapeBox(-22.3F, -7.5F, -22.6F, 8, 4, 24, 0F,-0.2F, 0F, -6F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -5.3F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 159
		turretModel[26].setRotationPoint(0F, -19.5F, 0F);

		turretModel[27].addShapeBox(-22.3F, -7.5F, -1.1F, 8, 4, 24, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.2F, 0F, -6F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, -0.2F, 0F, -5F); // Box 160
		turretModel[27].setRotationPoint(0F, -19.5F, 0F);

		turretModel[28].addShapeBox(-30.1F, -7.5F, -16.6F, 8, 4, 16, 0F,0.5F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -8F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 161
		turretModel[28].setRotationPoint(0F, -19.5F, 0F);

		turretModel[29].addShapeBox(-30.1F, -7.5F, -1.15F, 8, 4, 18, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0.5F, 0F, -9F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.1F, 0.5F, 0F, -7.7F); // Box 162
		turretModel[29].setRotationPoint(0F, -19.5F, 0F);

		turretModel[30].addShapeBox(1.5F, -8.5F, -26.7F, 8, 1, 27, 0F,0F, 0F, -1.2F, -0.2F, 0F, -2.9F, -0.2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.2F, 0F, -2.4F, -0.2F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 163
		turretModel[30].setRotationPoint(0F, -19.5F, 0F);

		turretModel[31].addShapeBox(1.5F, -8.5F, 1F, 8, 1, 26, 0F,0F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -2.9F, 0F, 0F, -1.2F, 0F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -2.4F, 0F, 0F, -0.5F); // Box 164
		turretModel[31].setRotationPoint(0F, -19.5F, 0F);

		turretModel[32].addShapeBox(-6.5F, -8.5F, -26.7F, 8, 1, 28, 0F,0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.8F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 165
		turretModel[32].setRotationPoint(0F, -19.5F, 0F);

		turretModel[33].addShapeBox(-6.5F, -8.5F, -1F, 8, 1, 28, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.8F); // Box 166
		turretModel[33].setRotationPoint(0F, -19.5F, 0F);

		turretModel[34].addShapeBox(9.3F, -9.5F, -0.8F, 8, 1, 26, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -6F, 0F, 0F, -1.1F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -5.6F, 0F, 0F, -0.6F); // Box 167
		turretModel[34].setRotationPoint(0F, -18.5F, 0F);

		turretModel[35].addShapeBox(9.3F, -9.5F, -24.9F, 8, 1, 26, 0F,0F, 0F, -1.1F, -0.4F, 0F, -6F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.2F, 0F, -5.6F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 168
		turretModel[35].setRotationPoint(0F, -18.5F, 0F);

		turretModel[36].addShapeBox(-14.5F, -8.5F, -1.8F, 8, 1, 28, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.2F, 0.5F, -4.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -3.8F); // Box 169
		turretModel[36].setRotationPoint(0F, -19.5F, 0F);

		turretModel[37].addShapeBox(-14.5F, -8.5F, -25.9F, 8, 1, 28, 0F,-0.2F, 0.5F, -4.2F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -3.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 170
		turretModel[37].setRotationPoint(0F, -19.5F, 0F);

		turretModel[38].addShapeBox(-22.3F, -8.5F, -22.6F, 8, 1, 24, 0F,-0.2F, 1.2F, -7F, 0F, 0.5F, -0.9F, 0F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, -6F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 171
		turretModel[38].setRotationPoint(0F, -19.5F, 0F);

		turretModel[39].addShapeBox(-22.3F, -8.5F, -1.1F, 8, 1, 24, 0F,-0.2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.9F, -0.2F, 1.2F, -7F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.2F, 0F, -6F); // Box 172
		turretModel[39].setRotationPoint(0F, -19.5F, 0F);

		turretModel[40].addShapeBox(-30.1F, -8.5F, -1.15F, 8, 1, 18, 0F,-1F, 2F, -1.2F, 0F, 1F, 0F, 0F, 1.2F, -0.95F, -1.9F, 2F, -9F, 0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0.5F, 0F, -9F); // Box 173
		turretModel[40].setRotationPoint(0F, -19.5F, 0F);

		turretModel[41].addShapeBox(-30.1F, -8.5F, -16.6F, 8, 1, 18, 0F,-1.9F, 2F, -9F, 0F, 1.2F, -0.95F, 0F, 1F, 0F, -1F, 2F, -1.35F, 0.5F, 0F, -9F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0.5F, 0F, -1F); // Box 174
		turretModel[41].setRotationPoint(0F, -19.5F, 0F);

		turretModel[42].addShapeBox(16.2F, -11.5F, -3.7F, 7, 1, 8, 0F,0F, 0F, 0.3F, -0.8F, 0F, 0.3F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0F, 0F, 0F, 0F); // Box 176
		turretModel[42].setRotationPoint(0F, -16.5F, 0F);

		turretModel[43].addShapeBox(16.2F, -11.5F, -11F, 7, 1, 7, 0F,-0.7F, 0F, 7.9F, -1.8F, 0F, -0.5F, -0.8F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 8.3F, -0.7F, 0F, -0.35F, 0.1F, 0F, 0F, 0F, 0F, 0F); // Box 177
		turretModel[43].setRotationPoint(0F, -16.5F, 0F);

		turretModel[44].addShapeBox(16.2F, -11.5F, 4.3F, 7, 1, 7, 0F,0F, 0F, 0F, -0.8F, 0F, 0F, -1.8F, 0F, -0.5F, -0.7F, 0F, 7.9F, 0F, 0F, 0F, 0.1F, 0F, 0F, -0.7F, 0F, -0.35F, -0.9F, 0F, 8.3F); // Box 178
		turretModel[44].setRotationPoint(0F, -16.5F, 0F);

		turretModel[45].addShapeBox(-6.5F, -11.5F, -26F, 8, 3, 4, 0F,0F, -2.4F, -1.2F, 0F, -2.4F, -1.2F, -0.4F, -0.05F, 0.7F, 0F, -0.05F, 0.3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 181
		turretModel[45].setRotationPoint(0F, -19.5F, 0F);

		turretModel[46].addShapeBox(1.5F, -11.5F, -26F, 8, 3, 4, 0F,0F, -2.4F, -1.2F, -0.3F, -2.4F, -3.2F, -0.7F, -0.2F, 2.7F, 0.4F, -0.05F, 0.7F, 0F, 0F, -0.5F, -0.2F, 0F, -2.2F, 0F, 0F, 2.3F, 0F, 0F, 0.3F); // Box 182
		turretModel[46].setRotationPoint(0F, -19.5F, 0F);

		turretModel[47].addShapeBox(9.3F, -11.5F, -24.3F, 6, 3, 4, 0F,0.1F, -2.4F, -1.5F, 0.8F, -2.35F, -6.1F, -1.8F, -0.35F, 4.9F, 0.5F, -0.2F, 1F, 0F, 0F, -0.5F, 1.6F, 0F, -5.4F, 0F, 0F, 4.3F, 0F, 0F, 0.3F); // Box 186
		turretModel[47].setRotationPoint(0F, -19.5F, 0F);

		turretModel[48].addShapeBox(1.5F, -11.5F, 22.3F, 8, 3, 4, 0F,0.4F, -0.05F, 0.7F, -0.7F, -0.2F, 2.7F, -0.3F, -2.4F, -3.2F, 0F, -2.4F, -1.2F, 0F, 0F, 0.3F, 0F, 0F, 2.3F, -0.2F, 0F, -2.2F, 0F, 0F, -0.5F); // Box 189
		turretModel[48].setRotationPoint(0F, -19.5F, 0F);

		turretModel[49].addShapeBox(-6.5F, -11.5F, 22.3F, 8, 3, 4, 0F,0F, -0.05F, 0.3F, -0.4F, -0.05F, 0.7F, 0F, -2.4F, -1.2F, 0F, -2.4F, -1.2F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 190
		turretModel[49].setRotationPoint(0F, -19.5F, 0F);

		turretModel[50].addShapeBox(-14.5F, -9.5F, 21.8F, 8, 1, 4, 0F,-0.2F, 2.1F, 3F, 0F, 1.95F, -0.2F, 0F, -0.4F, -0.7F, -0.2F, 0.5F, -5F, -0.2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.5F, -3.8F); // Box 177
		turretModel[50].setRotationPoint(0F, -19.5F, 0F);

		turretModel[51].addShapeBox(-14.5F, -9.5F, -25.5F, 8, 1, 4, 0F,-0.2F, 0.5F, -5F, 0F, -0.4F, -0.7F, 0F, 1.95F, -0.2F, -0.2F, 2.1F, 3F, -0.2F, -0.5F, -3.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 2F); // Box 178
		turretModel[51].setRotationPoint(0F, -19.5F, 0F);

		turretModel[52].addShapeBox(-22.31F, -10.2F, 17.8F, 8, 1, 4, 0F,-1.15F, 1.55F, 3.95F, 0F, 1.4F, -1F, 0F, -0.2F, -1F, -0.65F, 0.6F, -7F, -1.2F, -1F, 4F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, -0.2F, -0.5F, -5.9F); // Box 179
		turretModel[52].setRotationPoint(0F, -19.5F, 0F);

		turretModel[53].addShapeBox(-22.31F, -10.2F, -21.5F, 8, 1, 4, 0F,-0.7F, 0.5F, -6.9F, 0F, -0.2F, -1F, 0F, 1.4F, -1F, -1.2F, 1.55F, 3.9F, -0.2F, -0.5F, -5.9F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, -1.2F, -1F, 4F); // Box 180
		turretModel[53].setRotationPoint(0F, -19.5F, 0F);

		turretModel[54].addShapeBox(-30.1F, -11.5F, 6.85F, 8, 1, 10, 0F,-6.3F, 0.7F, -0.8F, 0.95F, 0.25F, -7F, 0.45F, -0.7F, -2.05F, -2F, -1F, -9F, -2.8F, 0F, -1F, 0F, 0F, -1F, 0F, 0.8F, -0.95F, -1.9F, 0F, -9F); // Box 181
		turretModel[54].setRotationPoint(0F, -19.5F, 0F);

		turretModel[55].addShapeBox(-30.1F, -11.5F, -16.6F, 8, 1, 10, 0F,-2F, -0.95F, -9F, 0.47F, -0.8F, -2F, 0.97F, 0.24F, -7F, -6.3F, 0.7F, -0.8F, -1.9F, 0F, -9F, 0F, 0.8F, -0.95F, 0F, 0F, -1F, -5.8F, 0F, -1F); // Box 183
		turretModel[55].setRotationPoint(0F, -19.5F, 0F);

		turretModel[56].addShapeBox(-27.7F, -10.5F, -1.3F, 8, 1, 18, 0F,-3.5F, 1.7F, -1.2F, -4F, 1F, -1F, -4F, 1.2F, -9.1F, -3.9F, 1.68F, -9F, 1.4F, -1F, -1.35F, -4F, -1F, -1F, -4F, -1F, -9F, 0.5F, -1F, -8.85F); // Box 184
		turretModel[56].setRotationPoint(0F, -19.5F, 0F);

		turretModel[57].addShapeBox(-27.7F, -10.5F, -16.45F, 8, 1, 18, 0F,-3.9F, 1.68F, -9.05F, -4F, 1.2F, -9F, -4F, 1F, -1F, -3.5F, 1.7F, -1.6F, 0.5F, -1F, -8.85F, -4F, -1F, -9F, -4F, -1F, -1F, 1.4F, -1F, -1.5F); // Box 185
		turretModel[57].setRotationPoint(0F, -19.5F, 0F);

		turretModel[58].addShapeBox(16.9F, -11.5F, -19.35F, 6, 3, 4, 0F,0.8F, -2.33F, -1.2F, -2.45F, -2.4F, -9.1F, -5.8F, -0.45F, 5.9F, 3.4F, -0.35F, -0.05F, 0F, 0F, -0.45F, -1.5F, 0F, -8.85F, -9F, 0F, 5.3F, 2F, 0F, 0.3F); // Box 186
		turretModel[58].setRotationPoint(0F, -19.5F, 0F);

		turretModel[59].addShapeBox(16.9F, -11.5F, 15.65F, 6, 3, 4, 0F,3.4F, -0.35F, -0.1F, -5.8F, -0.4F, 5.9F, -2.45F, -2.4F, -9.1F, 0.8F, -2.35F, -1.2F, 2F, 0F, 0.3F, -9F, 0F, 5.3F, -1.5F, 0F, -8.85F, 0F, 0F, -0.45F); // Box 188
		turretModel[59].setRotationPoint(0F, -19.5F, 0F);

		turretModel[60].addShapeBox(9.3F, -11.5F, 20.6F, 6, 3, 4, 0F,0.5F, -0.2F, 1F, -1.8F, -0.35F, 4.85F, 0.82F, -2.36F, -6.1F, 0.1F, -2.4F, -1.5F, 0F, 0F, 0.3F, 0F, 0F, 4.3F, 1.6F, 0F, -5.4F, 0F, 0F, -0.5F); // Box 189
		turretModel[60].setRotationPoint(0F, -19.5F, 0F);

		turretModel[61].addShapeBox(19.85F, -11.5F, 9.5F, 4, 3, 4, 0F,2.75F, -0.4F, -0.25F, -6.21F, -0.73F, 5.5F, -2.5F, -2.35F, -9.25F, -0.6F, -2.4F, -2.95F, 5F, 0F, 0.3F, -9F, 0F, 5.3F, -1.45F, 0F, -9.2F, -1.55F, 0F, -2.7F); // Box 192
		turretModel[61].setRotationPoint(0F, -19.5F, 0F);

		turretModel[62].addShapeBox(19.85F, -11.5F, -13.2F, 4, 3, 4, 0F,-0.6F, -2.4F, -2.95F, -2.5F, -2.35F, -9.2F, -6.21F, -0.75F, 5.5F, 2.75F, -0.45F, -0.25F, -1.55F, 0F, -2.7F, -1.45F, 0F, -9.2F, -9F, 0F, 5.3F, 5F, 0F, 0.3F); // Box 193
		turretModel[62].setRotationPoint(0F, -19.5F, 0F);

		turretModel[63].addShapeBox(17.9F, -11.5F, -3.85F, 5, 3, 8, 0F,-0.1F, -0.91F, -0.12F, -1.55F, -2.35F, 0.15F, -1.55F, -2.35F, 0.1F, -0.1F, -0.89F, -0.12F, -0.1F, 0F, -0.15F, -0.5F, 0F, 0.15F, -0.5F, 0F, 0.15F, -0.1F, 0F, -0.15F); // Box 194
		turretModel[63].setRotationPoint(0F, -19.5F, 0F);

		turretModel[64].addShapeBox(1.1F, -11.45F, -21.8F, 8, 4, 14, 0F,0F, 0F, -0.5F, -0.3F, -0.15F, -2.5F, -0.3F, 2F, -0.5F, 0F, 2.7F, -0.5F, 0F, 0F, 0.5F, -0.3F, 0F, -1.5F, -0.3F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 195
		turretModel[64].setRotationPoint(0F, -19.5F, 0F);

		turretModel[65].addShapeBox(1.1F, -11.45F, 8.1F, 8, 4, 14, 0F,0F, 2.7F, -0.5F, -0.3F, 2F, -0.5F, -0.3F, -0.15F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, -1.5F, 0F, 0F, 0.5F); // Box 197
		turretModel[65].setRotationPoint(0F, -19.5F, 0F);

		turretModel[66].addShapeBox(-6.9F, -11.45F, 8.1F, 8, 4, 14, 0F,-0.3F, 3F, -0.5F, 0F, 2.7F, -0.5F, 0F, 0F, -0.5F, -0.4F, 0F, -0.1F, -0.3F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.4F, 0F, 0.5F); // Box 198
		turretModel[66].setRotationPoint(0F, -19.5F, 0F);

		turretModel[67].addShapeBox(-6.9F, -11.45F, -21.8F, 8, 4, 14, 0F,-0.4F, 0F, -0.1F, 0F, 0F, -0.5F, 0F, 2.7F, -0.5F, -0.3F, 3F, -0.5F, -0.4F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.3F, 0F, 0.5F); // Box 199
		turretModel[67].setRotationPoint(0F, -19.5F, 0F);

		turretModel[68].addShapeBox(-14.1F, -11.45F, 8.1F, 8, 4, 14, 0F,0.2F, 3F, -0.5F, -0.5F, 3F, -0.5F, -0.4F, 0F, -0.1F, 0.2F, 0.15F, -3.3F, 0.2F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.4F, 0F, 0.5F, 0.2F, 0F, -1.5F); // Box 200
		turretModel[68].setRotationPoint(0F, -19.5F, 0F);

		turretModel[69].addShapeBox(-14.1F, -11.45F, -21.8F, 8, 4, 14, 0F,0.2F, 0.15F, -3.3F, -0.4F, 0F, -0.1F, -0.5F, 3F, -0.5F, 0.2F, 3F, -0.5F, 0.2F, 0F, -1.5F, -0.4F, 0F, 0.5F, -0.3F, 0F, 0.5F, 0.2F, 0F, 0.5F); // Box 201
		turretModel[69].setRotationPoint(0F, -19.5F, 0F);

		turretModel[70].addShapeBox(-21.1F, -12F, 6.1F, 7, 4, 11, 0F,2.7F, 0.2F, -1.55F, -0.2F, 2.45F, -2.5F, -0.2F, -0.4F, 1.7F, 0.05F, -0.25F, -3.25F, 0.2F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.2F, 0F, 1.5F, 0.2F, 0F, -3.5F); // Box 202
		turretModel[70].setRotationPoint(0F, -19.5F, 0F);

		turretModel[71].addShapeBox(-21.1F, -12F, -16.8F, 7, 4, 11, 0F,0.05F, -0.25F, -3.25F, -0.2F, -0.4F, 1.7F, -0.2F, 2.45F, -2.5F, 2.7F, 0.2F, -1.55F, 0.2F, 0F, -3.5F, -0.2F, 0F, 1.5F, -0.1F, 0F, -0.5F, 0.2F, 0F, -0.5F); // Box 203
		turretModel[71].setRotationPoint(0F, -19.5F, 0F);

		turretModel[72].addShapeBox(-14.2F, -11.45F, 0.1F, 8, 4, 8, 0F,0.1F, 3F, -0.1F, -0.5F, 3.2F, -0.1F, -0.4F, 3F, 0.5F, 0.1F, 3F, 0.5F, 0.1F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.4F, 0F, 0.5F, 0.1F, 0F, -1.5F); // Box 204
		turretModel[72].setRotationPoint(0F, -19.5F, 0F);

		turretModel[73].addShapeBox(-14.2F, -11.45F, -7.7F, 8, 4, 8, 0F,0.1F, 3F, 0.6F, -0.4F, 3F, 0.6F, -0.5F, 3.2F, -0.1F, 0.1F, 3F, -0.1F, 0.1F, 0F, -1.5F, -0.4F, 0F, 0.5F, -0.3F, 0F, 0.5F, 0.1F, 0F, 0.5F); // Box 205
		turretModel[73].setRotationPoint(0F, -19.5F, 0F);

		turretModel[74].addShapeBox(-7F, -11.45F, -7.7F, 8, 4, 8, 0F,-0.4F, 3F, 0.6F, 0.1F, 2.7F, 0.6F, 0.1F, 3F, -0.1F, -0.3F, 3.2F, -0.1F, -0.4F, 0F, 0.5F, 0.1F, 0F, -1.5F, 0.1F, 0F, 0.5F, -0.3F, 0F, 0.5F); // Box 206
		turretModel[74].setRotationPoint(0F, -19.5F, 0F);

		turretModel[75].addShapeBox(-7F, -11.45F, 0.1F, 8, 4, 8, 0F,-0.3F, 3.2F, -0.1F, 0.1F, 3F, -0.1F, 0.1F, 2.7F, 0.5F, -0.4F, 3F, 0.5F, -0.3F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, -1.5F, -0.4F, 0F, 0.5F); // Box 207
		turretModel[75].setRotationPoint(0F, -19.5F, 0F);

		turretModel[76].addShapeBox(0.7F, -11.15F, 0.1F, 8, 4, 8, 0F,-0.4F, 3.3F, -0.1F, 0.1F, 3F, -0.1F, 0.1F, 2.3F, 0.5F, -0.4F, 3F, 0.5F, -0.3F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, -1.5F, -0.4F, 0F, 0.5F); // Box 208
		turretModel[76].setRotationPoint(0F, -19.5F, 0F);

		turretModel[77].addShapeBox(0.7F, -11.15F, -7.7F, 8, 4, 8, 0F,-0.4F, 3F, 0.6F, 0.1F, 2.3F, 0.6F, 0.1F, 3F, -0.1F, -0.4F, 3.3F, -0.1F, -0.4F, 0F, 0.5F, 0.1F, 0F, -1.5F, 0.1F, 0F, 0.5F, -0.3F, 0F, 0.5F); // Box 209
		turretModel[77].setRotationPoint(0F, -19.5F, 0F);

		turretModel[78].addShapeBox(8.4F, -11.15F, -7.7F, 8, 4, 8, 0F,-0.4F, 2.8F, 0.6F, 0.7F, 0.4F, 1.75F, 0.1F, 0.5F, -0.1F, -0.4F, 3.5F, -0.1F, -0.4F, 0F, 0.5F, 1.1F, 0F, 1.5F, 0.1F, 0F, 0.5F, -0.3F, 0F, 0.5F); // Box 210
		turretModel[78].setRotationPoint(0F, -19F, 0F);

		turretModel[79].addShapeBox(8.4F, -11.15F, 0.1F, 8, 4, 8, 0F,-0.4F, 3.5F, -0.1F, 0.1F, 0.5F, -0.1F, 0.7F, 0.45F, 1.65F, -0.4F, 2.8F, 0.6F, -0.3F, 0F, 0.5F, 0.1F, 0F, 0.5F, 1.1F, 0F, 1.5F, -0.4F, 0F, 0.5F); // Box 212
		turretModel[79].setRotationPoint(0F, -19F, 0F);

		turretModel[80].addShapeBox(17F, -11.05F, -9.6F, 1, 2, 10, 0F,-0.1F, 0.5F, -0.2F, -0.85F, 0.45F, -0.2F, -0.05F, 0.04F, -0.2F, 0.5F, 0.6F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.05F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 213
		turretModel[80].setRotationPoint(0F, -19F, 0F);

		turretModel[81].addShapeBox(17F, -11.05F, 0F, 1, 2, 10, 0F,0.5F, 0.6F, -0.2F, -0.05F, 0.05F, -0.2F, -0.85F, 0.5F, -0.2F, -0.1F, 0.55F, -0.25F, 0F, 0F, -0.2F, -0.05F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 214
		turretModel[81].setRotationPoint(0F, -19F, 0F);

		turretModel[82].addShapeBox(17F, -11.05F, -4F, 1, 2, 4, 0F,-0.6F, 0.2F, -0.2F, 0F, 0.04F, -0.2F, 0F, 0F, 0.2F, -0.95F, 0.05F, 0.2F, 0F, 0F, -0.2F, -0.05F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 215
		turretModel[82].setRotationPoint(0F, -19F, 0F);

		turretModel[83].addShapeBox(17.02F, -11.08F, 0.2F, 1, 2, 4, 0F,-0.95F, 0.05F, 0.2F, 0F, 0F, 0.2F, 0F, 0.02F, -0.18F, -0.6F, 0.2F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.05F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 216
		turretModel[83].setRotationPoint(0F, -19F, 0F);

		turretModel[84].addShapeBox(8.8F, -11.45F, -19.8F, 8, 4, 11, 0F,0F, -0.15F, -0.5F, -3.3F, -0.3F, -4.4F, 0.3F, -0.4F, -0.65F, 0F, 2F, 0.5F, 0F, 0F, 0.5F, -1.3F, 0F, -4.5F, 0.3F, 0F, 0F, 0F, 0F, 1.5F); // Box 217
		turretModel[84].setRotationPoint(0F, -19.5F, 0F);

		turretModel[85].addShapeBox(8.8F, -11.45F, 9.1F, 8, 4, 11, 0F,0F, 2F, 0.4F, 0.3F, -0.35F, -0.65F, -3.3F, -0.3F, -4.35F, 0F, -0.15F, -0.5F, 0F, 0F, 1.5F, 0.3F, 0F, 0F, -1.3F, 0F, -4.5F, 0F, 0F, 0.5F); // Box 218
		turretModel[85].setRotationPoint(0F, -19.5F, 0F);

		turretModel[86].addShapeBox(-23.8F, -11.45F, 0.1F, 10, 4, 8, 0F,0.4F, 0.75F, 0.2F, -0.5F, 3F, -0.1F, -0.5F, 3F, 0.5F, 0F, 0.75F, -0.45F, 1.1F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.4F, 0F, 0.5F, 0F, 0F, -0.45F); // Box 219
		turretModel[86].setRotationPoint(0F, -19.5F, 0F);

		turretModel[87].addShapeBox(-23.8F, -11.45F, -7.9F, 10, 4, 8, 0F,0F, 0.75F, -0.55F, -0.5F, 3F, 0.4F, -0.5F, 3F, 0.1F, 0.4F, 0.75F, -0.2F, 0F, 0F, -0.45F, -0.4F, 0F, 0.5F, -0.3F, 0F, 0.5F, 1.1F, 0F, 0.5F); // Box 221
		turretModel[87].setRotationPoint(0F, -19.5F, 0F);

		turretModel[88].addShapeBox(-41.8F, -11.45F, -9F, 11, 4, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		turretModel[88].setRotationPoint(0F, -19.5F, 0F);

		turretModel[89].addShapeBox(-41.8F, -7.45F, -9F, 11, 5, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 223
		turretModel[89].setRotationPoint(0F, -19.5F, 0F);

		turretModel[90].addShapeBox(-41.8F, -11.45F, -9F, 11, 1, 19, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 224
		turretModel[90].setRotationPoint(0F, -19.5F, 0F);

		turretModel[91].addShapeBox(-40.8F, -12F, -5.8F, 7, 1, 1, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 225
		turretModel[91].setRotationPoint(0F, -19.5F, 0F);

		turretModel[92].addShapeBox(-40.8F, -12F, 5.6F, 7, 1, 1, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 226
		turretModel[92].setRotationPoint(0F, -19.5F, 0F);

		turretModel[93].addShapeBox(-40.8F, -11.8F, -6.4F, 7, 1, 14, 0F,0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F); // Box 227
		turretModel[93].setRotationPoint(0F, -19.5F, 0F);

		turretModel[94].addShapeBox(-21F, -10.45F, -25.5F, 11, 4, 20, 0F,-5F, 0F, 7F, 0F, 0F, 0F, -17F, 0F, -7F, 11F, 0F, -15F, -5F, 0F, 7F, 0F, 0F, 0F, -17F, 0F, -7F, 11F, 0F, -15F); // Box 229
		turretModel[94].setRotationPoint(0F, -19.5F, 0F);

		turretModel[95].addShapeBox(-21F, -6.45F, -25.5F, 11, 5, 20, 0F,-5F, 0F, 7F, 0F, 0F, 0F, -17F, 0F, -7F, 11F, 0F, -15F, -7F, 0F, 5F, 0F, 0F, 0F, -17F, 0F, -7F, 10F, 0F, -13F); // Box 230
		turretModel[95].setRotationPoint(0F, -19.5F, 0F);

		turretModel[96].addShapeBox(2.3F, -15.45F, 6.1F, 5, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		turretModel[96].setRotationPoint(0F, -19.5F, 0F);

		turretModel[97].addShapeBox(2.3F, -16.45F, 6.1F, 5, 1, 7, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		turretModel[97].setRotationPoint(0F, -19.5F, 0F);

		turretModel[98].addShapeBox(-4.7F, -15.45F, 7.1F, 3, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		turretModel[98].setRotationPoint(0F, -19.5F, 0F);

		turretModel[99].addShapeBox(-4.7F, -16.45F, 7.1F, 3, 1, 6, 0F,-0.2F, 0.2F, -0.5F, -0.4F, 0.2F, -0.5F, -0.4F, 0.2F, -0.5F, -0.2F, 0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		turretModel[99].setRotationPoint(0F, -19.5F, 0F);

		turretModel[100].addShapeBox(-4.3F, -17.45F, 8.1F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		turretModel[100].setRotationPoint(0F, -19.5F, 0F);

		turretModel[101].addShapeBox(-4.3F, -18.45F, 8.1F, 2, 1, 4, 0F,-0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		turretModel[101].setRotationPoint(0F, -19.5F, 0F);

		turretModel[102].addShapeBox(-3.2F, -18.45F, 8.1F, 1, 1, 4, 0F,0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F); // Box 238
		turretModel[102].setRotationPoint(0F, -19.5F, 0F);

		turretModel[103].addShapeBox(-18.3F, -14.45F, 9F, 11, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		turretModel[103].setRotationPoint(0F, -19.6F, 0F);

		turretModel[104].addShapeBox(-18.3F, -14.8F, 6F, 11, 4, 3, 0F,-2.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, -2.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		turretModel[104].setRotationPoint(0F, -19.6F, 0F);

		turretModel[105].addShapeBox(-15.8F, -15F, 5F, 7, 4, 1, 0F,-2.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -2.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		turretModel[105].setRotationPoint(0F, -19.6F, 0F);

		turretModel[106].addShapeBox(-18.3F, -13.45F, 16F, 11, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.45F, 0F, -2.5F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 245
		turretModel[106].setRotationPoint(0F, -19.6F, 0F);

		turretModel[107].addShapeBox(-15.8F, -13F, 19F, 7, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.2F, 0F, -2.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 246
		turretModel[107].setRotationPoint(0F, -19.6F, 0F);

		turretModel[108].addShapeBox(-6.9F, -15F, 8.7F, 1, 2, 6, 0F,0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, -0.4F, 0F, 0.3F, -0.4F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 247
		turretModel[108].setRotationPoint(0F, -19.5F, 0F);

		turretModel[109].addShapeBox(-6.95F, -15F, 8.9F, 1, 1, 1, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 2.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 2.3F, 0F, 0F); // Box 248
		turretModel[109].setRotationPoint(0F, -19.5F, 0F);

		turretModel[110].addShapeBox(-6.95F, -14.5F, 12.9F, 1, 1, 1, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 2.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 2.3F, 0F, 0F); // Box 249
		turretModel[110].setRotationPoint(0F, -19.5F, 0F);

		turretModel[111].addShapeBox(-14.2F, -13F, -21.7F, 4, 4, 17, 0F,0F, 1.6F, -0.4F, -0.2F, 1.6F, 0.4F, -0.2F, 1.6F, 1F, 0F, 1.6F, 0.2F, 0F, 0F, -0.4F, -0.2F, 0F, 1.4F, -0.2F, 0F, 1F, 0F, 0F, 0.2F); // Box 250
		turretModel[111].setRotationPoint(0F, -19.7F, 0F);

		turretModel[112].addShapeBox(-18F, -13F, -20.9F, 4, 4, 16, 0F,0F, 1.6F, -2.8F, -0.2F, 1.6F, 0.4F, -0.2F, 1.6F, 0.4F, 0F, 1.6F, -3F, 0F, 0F, -2.8F, -0.2F, 0F, 0.4F, -0.2F, 0F, 0.4F, 0F, 0F, -3F); // Box 254
		turretModel[112].setRotationPoint(0F, -19.7F, 0F);

		turretModel[113].addShapeBox(-19.8F, -13F, -17.6F, 2, 4, 9, 0F,-0.2F, 1.6F, -2.8F, -0.2F, 1.6F, 0.5F, -0.2F, 1.6F, 0.7F, -0.2F, 1.6F, -3.2F, -0.2F, 0F, -2.8F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.65F, -0.2F, 0F, -3.2F); // Box 255
		turretModel[113].setRotationPoint(0F, -19.7F, 0F);

		turretModel[114].addShapeBox(-6.8F, -13F, -20.9F, 4, 4, 16, 0F,-0.2F, 1.6F, 0.4F, 0F, 1.6F, -2.8F, 0F, 1.6F, -3F, -0.2F, 1.6F, 0.4F, -0.2F, 0F, 2.4F, 0F, 0F, -0.8F, 0F, 0F, -3F, -0.2F, 0F, 0.4F); // Box 256
		turretModel[114].setRotationPoint(0F, -19.7F, 0F);

		turretModel[115].addShapeBox(-10.6F, -13F, -21.7F, 4, 4, 17, 0F,-0.2F, 1.6F, 0.4F, 0F, 1.6F, -0.4F, 0F, 1.6F, 0.2F, -0.2F, 1.6F, 1F, -0.2F, 0F, 1.4F, 0F, 0F, 1.6F, 0F, 0F, 0.2F, -0.2F, 0F, 1F); // Box 257
		turretModel[115].setRotationPoint(0F, -19.7F, 0F);

		turretModel[116].addShapeBox(-3F, -13F, -17.6F, 2, 4, 9, 0F,-0.2F, 1.6F, 0.5F, -0.2F, 1.6F, -2.8F, -0.2F, 1.6F, -3.2F, -0.2F, 1.6F, 0.7F, -0.2F, 0F, 2.5F, 1.8F, 0F, -1.8F, 0.8F, 0F, -3.2F, -0.2F, 0F, 0.65F); // Box 258
		turretModel[116].setRotationPoint(0F, -19.7F, 0F);

		turretModel[117].addShapeBox(-14.2F, -16.6F, -20.7F, 4, 2, 15, 0F,0F, 0F, -1.4F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.4F, -0.2F, 0F, 0.4F, -0.2F, 0F, 1F, 0F, 0F, 0.2F); // Box 259
		turretModel[117].setRotationPoint(0F, -19.7F, 0F);

		turretModel[118].addShapeBox(-10.6F, -16.6F, -20.7F, 4, 2, 15, 0F,-0.2F, 0F, -0.6F, 0F, 0F, -1.4F, 0F, 0F, -0.8F, -0.2F, 0F, 0F, -0.2F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.2F, -0.2F, 0F, 1F); // Box 260
		turretModel[118].setRotationPoint(0F, -19.7F, 0F);

		turretModel[119].addShapeBox(-6.8F, -16.6F, -19.9F, 4, 2, 14, 0F,-0.2F, 0F, -0.6F, -1F, 0F, -3.8F, -1F, 0F, -4F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0.4F, 0F, 0F, -2.8F, 0F, 0F, -3F, -0.2F, 0F, 0.4F); // Box 261
		turretModel[119].setRotationPoint(0F, -19.7F, 0F);

		turretModel[120].addShapeBox(-3F, -16.6F, -16.6F, 1, 2, 7, 0F,0.8F, 0F, -0.5F, -1.2F, 0F, -2.8F, -1.2F, 0F, -3.2F, 0.8F, 0F, -0.3F, -0.2F, 0F, 0.5F, -0.2F, 0F, -2.8F, -0.2F, 0F, -3.2F, -0.2F, 0F, 0.65F); // Box 262
		turretModel[120].setRotationPoint(0F, -19.7F, 0F);

		turretModel[121].addShapeBox(-18F, -16.6F, -19.9F, 4, 2, 14, 0F,-1F, 0F, -3.8F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.6F, -1F, 0F, -4F, 0F, 0F, -2.8F, -0.2F, 0F, 0.4F, -0.2F, 0F, 0.4F, 0F, 0F, -3F); // Box 263
		turretModel[121].setRotationPoint(0F, -19.7F, 0F);

		turretModel[122].addShapeBox(-18.8F, -16.6F, -16.6F, 1, 2, 7, 0F,-1.2F, 0F, -3.8F, 0.8F, 0F, -0.5F, 0.8F, 0F, -0.3F, -1.2F, 0F, -3.2F, -0.2F, 0F, -2.8F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.65F, -0.2F, 0F, -3.2F); // Box 264
		turretModel[122].setRotationPoint(0F, -19.7F, 0F);

		turretModel[123].addShapeBox(3.5F, -15.8F, 11.1F, 9, 5, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 265
		turretModel[123].setRotationPoint(0F, -19.5F, 0F);

		turretModel[124].addShapeBox(3.5F, -15.8F, 8.1F, 9, 5, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 266
		turretModel[124].setRotationPoint(0F, -19.5F, 0F);

		turretModel[125].addShapeBox(3.5F, -16.4F, 8.6F, 9, 1, 3, 0F,0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F); // Box 267
		turretModel[125].setRotationPoint(0F, -19.5F, 0F);

		turretModel[126].addShapeBox(12.5F, -14.4F, 11.1F, 2, 4, 1, 0F,0F, 0F, -0.4F, -2F, 0F, -0.4F, -2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 268
		turretModel[126].setRotationPoint(0F, -19.5F, 0F);

		turretModel[127].addShapeBox(12.5F, -14.4F, 8.1F, 2, 4, 1, 0F,0F, 0F, -0.4F, -2F, 0F, -0.4F, -2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 269
		turretModel[127].setRotationPoint(0F, -19.5F, 0F);

		turretModel[128].addShapeBox(5.5F, -16.3F, 8.6F, 6, 5, 3, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 270
		turretModel[128].setRotationPoint(0F, -19.5F, 0F);

		turretModel[129].addShapeBox(18.7F, -11.5F, -3.85F, 6, 4, 8, 0F,-0.1F, -0.91F, -0.12F, -1.55F, -2.35F, 0.15F, -1.55F, -2.35F, 0.1F, -0.1F, -0.89F, -0.12F, -0.1F, 0F, -0.15F, -0.5F, 0F, 0.15F, -0.5F, 0F, 0.15F, -0.1F, 0F, -0.15F); // Box 271
		turretModel[129].setRotationPoint(0F, -19.5F, 0F);

		turretModel[130].addShapeBox(18F, -7.5F, -3.7F, 7, 4, 8, 0F,0F, 0F, 0.3F, -0.8F, 0F, 0.3F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0F, 0F, 0F, 0F); // Box 272
		turretModel[130].setRotationPoint(0F, -19.5F, 0F);

		turretModel[131].addShapeBox(18F, -3.5F, -3.7F, 7, 4, 8, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F, 0F, 0F, 0F, 0F); // Box 273
		turretModel[131].setRotationPoint(0F, -19.5F, 0F);

		turretModel[132].addShapeBox(-6.7F, -13F, 20.1F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 274
		turretModel[132].setRotationPoint(0F, -19.5F, 0F);

		turretModel[133].addShapeBox(-6.7F, -13.8F, 18.5F, 1, 1, 4, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 275
		turretModel[133].setRotationPoint(0F, -19.5F, 0F);

		turretModel[134].addShapeBox(-6.7F, -16.6F, 18.3F, 1, 3, 1, 0F,-0.2F, 0F, 0.8F, -0.2F, 0F, 0.8F, -0.2F, 0F, -1.2F, -0.2F, 0F, -1.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 276
		turretModel[134].setRotationPoint(0F, -19.5F, 0F);

		turretModel[135].addShapeBox(-6.7F, -16.6F, 21.7F, 1, 3, 1, 0F,-0.2F, 0F, -1.2F, -0.2F, 0F, -1.2F, -0.2F, 0F, 0.8F, -0.2F, 0F, 0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 277
		turretModel[135].setRotationPoint(0F, -19.5F, 0F);

		turretModel[136].addShapeBox(-6.7F, -17F, 22.7F, 1, 1, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 278
		turretModel[136].setRotationPoint(0F, -19.5F, 0F);

		turretModel[137].addShapeBox(-6.7F, -17F, 17.3F, 1, 1, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 279
		turretModel[137].setRotationPoint(0F, -19.5F, 0F);

		turretModel[138].addShapeBox(-5F, -17.5F, 17.5F, 1, 1, 6, 0F,-0.1F, 0.3F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F); // Box 280
		turretModel[138].setRotationPoint(0F, -19.5F, 0F);

		turretModel[139].addShapeBox(-5F, -19F, 17.5F, 1, 1, 6, 0F,-0.1F, 0.5F, -1.3F, -0.1F, 0.5F, -1.3F, -0.1F, 0.5F, -1.3F, -0.1F, 0.5F, -1.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 281
		turretModel[139].setRotationPoint(0F, -19.3F, 0F);

		turretModel[140].addShapeBox(-5F, -16.5F, 17.5F, 1, 1, 6, 0F,-0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 0F); // Box 282
		turretModel[140].setRotationPoint(0F, -19.5F, 0F);

		turretModel[141].addShapeBox(-5F, -15F, 17.5F, 1, 1, 6, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.5F, -1.3F, -0.1F, 0.5F, -1.3F, -0.1F, 0.5F, -1.3F, -0.1F, 0.5F, -1.3F); // Box 283
		turretModel[141].setRotationPoint(0F, -19.7F, 0F);

		turretModel[142].addShapeBox(-5F, -20.2F, 17.5F, 1, 1, 6, 0F,-0.1F, -0.3F, -2.6F, -0.1F, -0.3F, -2.6F, -0.1F, -0.3F, -2.6F, -0.1F, -0.3F, -2.6F, -0.1F, -0.3F, -1.3F, -0.1F, -0.3F, -1.3F, -0.1F, -0.3F, -1.3F, -0.1F, -0.3F, -1.3F); // Box 284
		turretModel[142].setRotationPoint(0F, -19.3F, 0F);

		turretModel[143].addShapeBox(-5F, -13.8F, 17.5F, 1, 1, 6, 0F,-0.1F, -0.3F, -1.3F, -0.1F, -0.3F, -1.3F, -0.1F, -0.3F, -1.3F, -0.1F, -0.3F, -1.3F, -0.1F, -0.3F, -2.6F, -0.1F, -0.3F, -2.6F, -0.1F, -0.3F, -2.6F, -0.1F, -0.3F, -2.6F); // Box 285
		turretModel[143].setRotationPoint(0F, -19.7F, 0F);

		turretModel[144].addShapeBox(-6.8F, -16.7F, 18F, 2, 1, 5, 0F,-0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 288
		turretModel[144].setRotationPoint(0F, -19.5F, 0F);

		turretModel[145].addShapeBox(-6.8F, -17.7F, 18F, 2, 1, 5, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F); // Box 289
		turretModel[145].setRotationPoint(0F, -19.5F, 0F);

		turretModel[146].addShapeBox(-6.8F, -18.9F, 18F, 2, 1, 5, 0F,-0.1F, 0F, -1.1F, -0.1F, 0F, -1.1F, -0.1F, 0F, -1.1F, -0.1F, 0F, -1.1F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 290
		turretModel[146].setRotationPoint(0F, -19.3F, 0F);

		turretModel[147].addShapeBox(-6.8F, -19.6F, 17.5F, 2, 1, 6, 0F,-0.1F, -0.3F, -2.6F, -0.1F, -0.3F, -2.6F, -0.1F, -0.3F, -2.6F, -0.1F, -0.3F, -2.6F, -0.1F, -0.3F, -1.6F, -0.1F, -0.3F, -1.6F, -0.1F, -0.3F, -1.6F, -0.1F, -0.3F, -1.6F); // Box 291
		turretModel[147].setRotationPoint(0F, -19.3F, 0F);

		turretModel[148].addShapeBox(-6.8F, -15.9F, 18F, 2, 1, 5, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -1.1F, -0.1F, 0F, -1.1F, -0.1F, 0F, -1.1F, -0.1F, 0F, -1.1F); // Box 292
		turretModel[148].setRotationPoint(0F, -19.3F, 0F);

		turretModel[149].addShapeBox(-6.8F, -15.2F, 17.5F, 2, 1, 6, 0F,-0.1F, -0.3F, -1.6F, -0.1F, -0.3F, -1.6F, -0.1F, -0.3F, -1.6F, -0.1F, -0.3F, -1.6F, -0.1F, -0.3F, -2.6F, -0.1F, -0.3F, -2.6F, -0.1F, -0.3F, -2.6F, -0.1F, -0.3F, -2.6F); // Box 293
		turretModel[149].setRotationPoint(0F, -19.3F, 0F);

		turretModel[150].addShapeBox(26F, -1.4F, -14F, 2, 1, 6, 0F,-0.1F, -0.3F, -1.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -1.3F, -0.1F, -0.3F, -2.6F, -0.1F, 0.4F, -1.8F, -0.1F, 0.4F, -1.8F, -0.1F, -0.3F, -2.6F); // Box 294
		turretModel[150].setRotationPoint(0F, -19.7F, 0F);

		turretModel[151].addShapeBox(26F, -2.6F, -14F, 2, 1, 6, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 1F, -0.1F, 0F, 1F, -0.1F, 0F, 0F, -0.1F, 0.5F, -1.3F, -0.1F, 0.5F, -0.3F, -0.1F, 0.5F, -0.3F, -0.1F, 0.5F, -1.3F); // Box 295
		turretModel[151].setRotationPoint(0F, -19.7F, 0F);

		turretModel[152].addShapeBox(26F, -4.1F, -14F, 2, 1, 6, 0F,-0.1F, 0F, 0.4F, -0.1F, 0F, 1.4F, -0.1F, 0F, 1.4F, -0.1F, 0F, 0.4F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 1F, -0.1F, 0.3F, 1F, -0.1F, 0.3F, 0F); // Box 296
		turretModel[152].setRotationPoint(0F, -19.5F, 0F);

		turretModel[153].addShapeBox(26F, -5.1F, -14F, 2, 1, 6, 0F,-0.1F, 0.3F, 0F, -0.1F, 0.3F, 1F, -0.1F, 0.3F, 1F, -0.1F, 0.3F, 0F, -0.1F, 0F, 0.4F, -0.1F, 0F, 1.4F, -0.1F, 0F, 1.4F, -0.1F, 0F, 0.4F); // Box 297
		turretModel[153].setRotationPoint(0F, -19.5F, 0F);

		turretModel[154].addShapeBox(26F, -6.6F, -14F, 2, 1, 6, 0F,-0.1F, 0.5F, -1.3F, -0.1F, 0.5F, -0.3F, -0.1F, 0.5F, -0.3F, -0.1F, 0.5F, -1.3F, -0.1F, 0F, 0F, -0.1F, 0F, 1F, -0.1F, 0F, 1F, -0.1F, 0F, 0F); // Box 298
		turretModel[154].setRotationPoint(0F, -19.3F, 0F);

		turretModel[155].addShapeBox(26F, -7.8F, -14F, 2, 1, 6, 0F,-0.1F, -0.3F, -2.6F, -0.1F, 0.4F, -1.8F, -0.1F, 0.4F, -1.8F, -0.1F, -0.3F, -2.6F, -0.1F, -0.3F, -1.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -1.3F); // Box 299
		turretModel[155].setRotationPoint(0F, -19.3F, 0F);

		turretModel[156].addShapeBox(24.2F, -2.7F, -14.3F, 2, 1, 6, 0F,-0.1F, -0.3F, -1.6F, -0.1F, -0.3F, -1.6F, -0.1F, -0.3F, -1.6F, -0.1F, -0.3F, -1.6F, -0.1F, -0.3F, -2.6F, -0.1F, -0.3F, -2.6F, -0.1F, -0.3F, -2.6F, -0.1F, -0.3F, -2.6F); // Box 300
		turretModel[156].setRotationPoint(0F, -19.3F, 0F);

		turretModel[157].addShapeBox(24.2F, -3.4F, -13.8F, 2, 1, 5, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -1.1F, -0.1F, 0F, -1.1F, -0.1F, 0F, -1.1F, -0.1F, 0F, -1.1F); // Box 301
		turretModel[157].setRotationPoint(0F, -19.3F, 0F);

		turretModel[158].addShapeBox(24.2F, -4.2F, -13.8F, 2, 1, 5, 0F,-0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 302
		turretModel[158].setRotationPoint(0F, -19.5F, 0F);

		turretModel[159].addShapeBox(24.2F, -5.2F, -13.8F, 2, 1, 5, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F); // Box 303
		turretModel[159].setRotationPoint(0F, -19.5F, 0F);

		turretModel[160].addShapeBox(24.2F, -6.4F, -13.8F, 2, 1, 5, 0F,-0.1F, 0F, -1.1F, -0.1F, 0F, -1.1F, -0.1F, 0F, -1.1F, -0.1F, 0F, -1.1F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 304
		turretModel[160].setRotationPoint(0F, -19.3F, 0F);

		turretModel[161].addShapeBox(24.2F, -7.1F, -14.3F, 2, 1, 6, 0F,-0.1F, -0.3F, -2.6F, -0.1F, -0.3F, -2.6F, -0.1F, -0.3F, -2.6F, -0.1F, -0.3F, -2.6F, -0.1F, -0.3F, -1.6F, -0.1F, -0.3F, -1.6F, -0.1F, -0.3F, -1.6F, -0.1F, -0.3F, -1.6F); // Box 305
		turretModel[161].setRotationPoint(0F, -19.3F, 0F);

		turretModel[162].addShapeBox(24.3F, -7.8F, -13.9F, 1, 1, 5, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 306
		turretModel[162].setRotationPoint(0F, -19.5F, 0F);

		turretModel[163].addShapeBox(23.3F, -9F, -11.6F, 2, 1, 1, 0F,-0.2F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, 0F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0F, -0.2F, -0.4F, 0F); // Box 307
		turretModel[163].setRotationPoint(0F, -19.5F, 0F);

		turretModel[164].addShapeBox(24.3F, -7.6F, -9.7F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -1.2F, -0.2F, 0F, -1.2F, -0.2F, 0F, 0.8F, -0.2F, 0F, 0.8F); // Box 308
		turretModel[164].setRotationPoint(0F, -19.5F, 0F);

		turretModel[165].addShapeBox(24.3F, -7.6F, -14.1F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0.8F, -0.2F, 0F, 0.8F, -0.2F, 0F, -1.2F, -0.2F, 0F, -1.2F); // Box 309
		turretModel[165].setRotationPoint(0F, -19.5F, 0F);

		turretModel[166].addShapeBox(24.3F, -4F, -15F, 1, 1, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 311
		turretModel[166].setRotationPoint(0F, -19.5F, 0F);

		turretModel[167].addShapeBox(24.3F, -4F, -8.8F, 1, 1, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 312
		turretModel[167].setRotationPoint(0F, -19.5F, 0F);

		turretModel[168].addShapeBox(19.7F, -9.2F, -11.6F, 4, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 313
		turretModel[168].setRotationPoint(0F, -19.5F, 0F);

		turretModel[169].addShapeBox(19F, -9.2F, -11.6F, 3, 1, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 314
		turretModel[169].setRotationPoint(0F, -19.5F, 0F);

		turretModel[170].addShapeBox(22.6F, -6.7F, 7.1F, 1, 3, 1, 0F,-2F, 0F, 0.2F, 2.4F, -0.3F, 0.2F, 2.4F, -0.3F, 0.2F, -2F, 0F, 0.2F, -0.6F, 0F, 0.2F, 1.2F, 0F, 0.2F, 1.2F, 0F, 0.2F, -0.6F, 0F, 0.2F); // Box 356
		turretModel[170].setRotationPoint(0F, -19.5F, 0F);

		turretModel[171].addShapeBox(22.4F, -6.7F, 9.1F, 1, 3, 1, 0F,-2F, 0F, 0.2F, 2.4F, -0.3F, 0.2F, 2.4F, -0.3F, 0.2F, -2F, 0F, 0.2F, -0.6F, 0F, 0.2F, 1.2F, 0F, 0.2F, 1.2F, 0F, 0.2F, -0.6F, 0F, 0.2F); // Box 363
		turretModel[171].setRotationPoint(0F, -19.5F, 0F);

		turretModel[172].addShapeBox(22.2F, -6.7F, 11F, 1, 3, 1, 0F,-2F, 0F, 0.2F, 2.4F, -0.3F, 0.2F, 2.4F, -0.3F, 0.2F, -2F, 0F, 0.2F, 1.4F, 0F, 0.2F, 1.2F, 0F, 0.2F, 1.2F, 0F, 0.2F, -0.6F, 0F, 0.2F); // Box 364
		turretModel[172].setRotationPoint(0F, -19.5F, 0F);

		turretModel[173].addShapeBox(21.2F, -7F, 13F, 1, 3, 1, 0F,-2F, 0F, 0.2F, 2.4F, -0.3F, 0.2F, 2.4F, -0.3F, 0.2F, -2F, 0F, 0.2F, -0.6F, 0F, 0.2F, 1.2F, 0F, 0.2F, 1.2F, 0F, 0.2F, -0.6F, 0F, 0.2F); // Box 365
		turretModel[173].setRotationPoint(0F, -19.5F, 0F);

		turretModel[174].addShapeBox(19.2F, -7.4F, 15F, 1, 3, 1, 0F,-2F, 0F, 0.2F, 2.4F, -0.3F, 0.2F, 2.4F, -0.3F, 0.2F, -2F, 0F, 0.2F, -0.6F, 0F, 0.2F, 1.2F, 0F, 0.2F, 1.2F, 0F, 0.2F, -0.6F, 0F, 0.2F); // Box 366
		turretModel[174].setRotationPoint(0F, -19.5F, 0F);

		turretModel[175].addShapeBox(18F, -7.5F, 17F, 1, 3, 1, 0F,-2F, 0F, 0.2F, 2.4F, -0.3F, 0.2F, 2.4F, -0.3F, 0.2F, -2F, 0F, 0.2F, -0.6F, 0F, 0.2F, 1.2F, 0F, 0.2F, 1.2F, 0F, 0.2F, -0.6F, 0F, 0.2F); // Box 367
		turretModel[175].setRotationPoint(0F, -19.5F, 0F);

		turretModel[176].addShapeBox(16.8F, -9F, 17F, 1, 3, 1, 0F,-2F, 0F, 0.2F, 2.4F, -0.3F, 0.2F, 2.4F, -0.3F, 0.2F, -2F, 0F, 0.2F, -0.6F, 0F, 0.2F, 1.2F, 0F, 0.2F, 1.2F, 0F, 0.2F, -0.6F, 0F, 0.2F); // Box 368
		turretModel[176].setRotationPoint(0F, -19.5F, 0F);

		turretModel[177].addShapeBox(15.6F, -6.8F, -20.4F, 1, 3, 1, 0F,-2F, 0F, 0.2F, 2.4F, -0.3F, 0.2F, 2.4F, -0.3F, 0.2F, -2F, 0F, 0.2F, -0.6F, 0F, 0.2F, 1.2F, 0F, 0.2F, 1.2F, 0F, 0.2F, -0.6F, 0F, 0.2F); // Box 369
		turretModel[177].setRotationPoint(0F, -19.5F, 0F);

		turretModel[178].addShapeBox(17.4F, -6.7F, -18.5F, 1, 3, 1, 0F,-2F, 0F, 0.2F, 2.4F, -0.3F, 0.2F, 2.4F, -0.3F, 0.2F, -2F, 0F, 0.2F, -0.6F, 0F, 0.2F, 1.2F, 0F, 0.2F, 1.2F, 0F, 0.2F, -0.6F, 0F, 0.2F); // Box 370
		turretModel[178].setRotationPoint(0F, -19.5F, 0F);

		turretModel[179].addShapeBox(18.4F, -7.4F, -16.5F, 1, 3, 1, 0F,-2F, 0F, 0.2F, 2.4F, -0.3F, 0.2F, 2.4F, -0.3F, 0.2F, -2F, 0F, 0.2F, -0.6F, 0F, 0.2F, 1.2F, 0F, 0.2F, 1.2F, 0F, 0.2F, -0.6F, 0F, 0.2F); // Box 371
		turretModel[179].setRotationPoint(0F, -19.5F, 0F);

		turretModel[180].addShapeBox(19.4F, -9F, -14F, 1, 3, 1, 0F,-2F, 0F, 0.2F, 2.4F, -0.3F, 0.2F, 2.4F, -0.3F, 0.2F, -2F, 0F, 0.2F, -0.6F, 0F, 0.2F, 1.2F, 0F, 0.2F, 1.2F, 0F, 0.2F, -0.6F, 0F, 0.2F); // Box 376
		turretModel[180].setRotationPoint(0F, -19.5F, 0F);

		turretModel[181].addShapeBox(14F, -9F, -20.8F, 1, 3, 1, 0F,-2F, 0F, 0.2F, 2.4F, -0.3F, 0.2F, 2.4F, -0.3F, 0.2F, -2F, 0F, 0.2F, -0.6F, 0F, 0.2F, 1.2F, 0F, 0.2F, 1.2F, 0F, 0.2F, -0.6F, 0F, 0.2F); // Box 377
		turretModel[181].setRotationPoint(0F, -19.5F, 0F);

		turretModel[182].addShapeBox(-3.9F, -16.45F, -14.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 378
		turretModel[182].setRotationPoint(0F, -19.5F, 0F);

		turretModel[183].addShapeBox(-4.7F, -16.45F, -19F, 1, 1, 2, 0F,2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 379
		turretModel[183].setRotationPoint(0F, -19.5F, 0F);

		turretModel[184].addShapeBox(-4.7F, -16.45F, -9F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 2F, 0F, 0F); // Box 380
		turretModel[184].setRotationPoint(0F, -19.5F, 0F);

		turretModel[185].addShapeBox(-16.9F, -16.45F, -19F, 1, 1, 2, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 381
		turretModel[185].setRotationPoint(0F, -19.5F, 0F);

		turretModel[186].addShapeBox(-17.2F, -16.4F, -9F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1.5F, 0F, 0F); // Box 382
		turretModel[186].setRotationPoint(0F, -19.5F, 0F);

		turretModel[187].addShapeBox(-10.6F, -18F, -18.7F, 4, 2, 5, 0F,-0.8F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.2F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.2F, -0.2F, 0F, 1F); // Box 593
		turretModel[187].setRotationPoint(0F, -19.7F, 0F);

		turretModel[188].addShapeBox(-8.2F, -18F, -17.6F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 594
		turretModel[188].setRotationPoint(0F, -19.5F, 0F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 1001, 137, textureX, textureY); // Box 315
		barrelModel[1] = new ModelRendererTurbo(this, 65, 145, textureX, textureY); // Box 317
		barrelModel[2] = new ModelRendererTurbo(this, 897, 113, textureX, textureY); // Box 318
		barrelModel[3] = new ModelRendererTurbo(this, 905, 129, textureX, textureY); // Box 319
		barrelModel[4] = new ModelRendererTurbo(this, 233, 249, textureX, textureY); // Box 322
		barrelModel[5] = new ModelRendererTurbo(this, 433, 249, textureX, textureY); // Box 323
		barrelModel[6] = new ModelRendererTurbo(this, 633, 249, textureX, textureY); // Box 324
		barrelModel[7] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 325
		barrelModel[8] = new ModelRendererTurbo(this, 201, 257, textureX, textureY); // Box 327
		barrelModel[9] = new ModelRendererTurbo(this, 705, 137, textureX, textureY); // Box 328
		barrelModel[10] = new ModelRendererTurbo(this, 225, 233, textureX, textureY); // Box 329
		barrelModel[11] = new ModelRendererTurbo(this, 401, 233, textureX, textureY); // Box 330
		barrelModel[12] = new ModelRendererTurbo(this, 561, 169, textureX, textureY); // Box 331

		barrelModel[0].addShapeBox(4F, 0F, -3F, 5, 2, 6, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 315
		barrelModel[0].setRotationPoint(20F, -23.7F, 0.2F);

		barrelModel[1].addShapeBox(4F, -2F, -3F, 5, 2, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 317
		barrelModel[1].setRotationPoint(20F, -23.7F, 0.2F);

		barrelModel[2].addShapeBox(4F, -3F, -2F, 5, 1, 4, 0F,0F, 0.1F, -0.8F, 0F, 0.1F, -0.8F, 0F, 0.1F, -0.8F, 0F, 0.1F, -0.8F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 318
		barrelModel[2].setRotationPoint(20F, -23.7F, 0.2F);

		barrelModel[3].addShapeBox(4F, 2F, -2F, 5, 1, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.1F, -0.8F, 0F, 0.1F, -0.8F, 0F, 0.1F, -0.8F, 0F, 0.1F, -0.8F); // Box 319
		barrelModel[3].setRotationPoint(20F, -23.7F, 0.2F);

		barrelModel[4].addShapeBox(9F, -1.5F, -2.5F, 93, 1, 5, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 322
		barrelModel[4].setRotationPoint(20F, -23.7F, 0.2F);

		barrelModel[5].addShapeBox(9F, -2.5F, -2F, 93, 1, 4, 0F,0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 323
		barrelModel[5].setRotationPoint(20F, -23.7F, 0.2F);

		barrelModel[6].addShapeBox(9F, 1.6F, -2F, 93, 1, 4, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F); // Box 324
		barrelModel[6].setRotationPoint(20F, -23.7F, 0.2F);

		barrelModel[7].addShapeBox(9F, 0.6F, -2.5F, 93, 1, 5, 0F,0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 325
		barrelModel[7].setRotationPoint(20F, -23.7F, 0.2F);

		barrelModel[8].addShapeBox(9F, -0.4F, -2.5F, 93, 1, 5, 0F,0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 327
		barrelModel[8].setRotationPoint(20F, -23.7F, 0.2F);

		barrelModel[9].addShapeBox(55F, -3F, -2F, 19, 1, 4, 0F,0F, 0.1F, -0.8F, 0F, 0.1F, -0.8F, 0F, 0.1F, -0.8F, 0F, 0.1F, -0.8F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 328
		barrelModel[9].setRotationPoint(20F, -23.7F, 0.2F);

		barrelModel[10].addShapeBox(55F, -2F, -3F, 19, 2, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 329
		barrelModel[10].setRotationPoint(20F, -23.7F, 0.2F);

		barrelModel[11].addShapeBox(55F, 0F, -3F, 19, 2, 6, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 330
		barrelModel[11].setRotationPoint(20F, -23.7F, 0.2F);

		barrelModel[12].addShapeBox(55F, 2F, -2F, 19, 1, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.1F, -0.8F, 0F, 0.1F, -0.8F, 0F, 0.1F, -0.8F, 0F, 0.1F, -0.8F); // Box 331
		barrelModel[12].setRotationPoint(20F, -23.7F, 0.2F);
	}

	private void initrightBackWheelModel_1()
	{
		rightBackWheelModel[0] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Box 355
		rightBackWheelModel[1] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Box 356
		rightBackWheelModel[2] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 357

		rightBackWheelModel[0].addShapeBox(-6F, 1.8F, -5F, 13, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 355
		rightBackWheelModel[0].setRotationPoint(-56F, -3.5F, -29.2F);

		rightBackWheelModel[1].addShapeBox(-6F, -1.5F, -5F, 13, 3, 10, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 356
		rightBackWheelModel[1].setRotationPoint(-56F, -3.5F, -29.2F);

		rightBackWheelModel[2].addShapeBox(-6F, -5.8F, -5F, 13, 4, 10, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		rightBackWheelModel[2].setRotationPoint(-56F, -3.5F, -29.2F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 937, 33, textureX, textureY); // Box 203
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 873, 49, textureX, textureY); // Box 204
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 929, 49, textureX, textureY); // Box 205
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 969, 57, textureX, textureY); // Box 31
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 857, 65, textureX, textureY); // Box 32
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 913, 65, textureX, textureY); // Box 33
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 34
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 35
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 36
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 37
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 38
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 39
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 553, 73, textureX, textureY); // Box 40
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 953, 73, textureX, textureY); // Box 41
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 593, 81, textureX, textureY); // Box 42
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 649, 81, textureX, textureY); // Box 43
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 705, 81, textureX, textureY); // Box 44
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 761, 81, textureX, textureY); // Box 45
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Box 76
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Box 77
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 78
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Box 358
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 359
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Box 360
		leftTrackWheelModels[24] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Box 361
		leftTrackWheelModels[25] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 362
		leftTrackWheelModels[26] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Box 363

		leftTrackWheelModels[0].addShapeBox(-7F, -7F, -4F, 14, 5, 10, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		leftTrackWheelModels[0].setRotationPoint(28.5F, 2F, 28.2F);

		leftTrackWheelModels[1].addShapeBox(-7F, -2F, -4F, 14, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		leftTrackWheelModels[1].setRotationPoint(28.5F, 2F, 28.2F);

		leftTrackWheelModels[2].addShapeBox(-7F, 2F, -4F, 14, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 205
		leftTrackWheelModels[2].setRotationPoint(28.5F, 2F, 28.2F);

		leftTrackWheelModels[3].addShapeBox(-7F, -7F, -4F, 14, 5, 10, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		leftTrackWheelModels[3].setRotationPoint(46.5F, 2F, 28.2F);

		leftTrackWheelModels[4].addShapeBox(-7F, -2F, -4F, 14, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		leftTrackWheelModels[4].setRotationPoint(46.5F, 2F, 28.2F);

		leftTrackWheelModels[5].addShapeBox(-7F, 2F, -4F, 14, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 33
		leftTrackWheelModels[5].setRotationPoint(46.5F, 2F, 28.2F);

		leftTrackWheelModels[6].addShapeBox(-7F, -7F, -4F, 14, 5, 10, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[6].setRotationPoint(11.5F, 2F, 28.2F);

		leftTrackWheelModels[7].addShapeBox(-7F, -2F, -4F, 14, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		leftTrackWheelModels[7].setRotationPoint(11.5F, 2F, 28.2F);

		leftTrackWheelModels[8].addShapeBox(-7F, 2F, -4F, 14, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 36
		leftTrackWheelModels[8].setRotationPoint(11.5F, 2F, 28.2F);

		leftTrackWheelModels[9].addShapeBox(-7F, -7F, -4F, 14, 5, 10, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		leftTrackWheelModels[9].setRotationPoint(-5.5F, 2F, 28.2F);

		leftTrackWheelModels[10].addShapeBox(-7F, -2F, -4F, 14, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		leftTrackWheelModels[10].setRotationPoint(-5.5F, 2F, 28.2F);

		leftTrackWheelModels[11].addShapeBox(-7F, 2F, -4F, 14, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 39
		leftTrackWheelModels[11].setRotationPoint(-5.5F, 2F, 28.2F);

		leftTrackWheelModels[12].addShapeBox(-7F, -7F, -4F, 14, 5, 10, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		leftTrackWheelModels[12].setRotationPoint(-23.5F, 2F, 28.2F);

		leftTrackWheelModels[13].addShapeBox(-7F, -2F, -4F, 14, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		leftTrackWheelModels[13].setRotationPoint(-23.5F, 2F, 28.2F);

		leftTrackWheelModels[14].addShapeBox(-7F, 2F, -4F, 14, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 42
		leftTrackWheelModels[14].setRotationPoint(-23.5F, 2F, 28.2F);

		leftTrackWheelModels[15].addShapeBox(-7F, -7F, -4F, 14, 5, 10, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		leftTrackWheelModels[15].setRotationPoint(-40.5F, 2F, 28.2F);

		leftTrackWheelModels[16].addShapeBox(-7F, -2F, -4F, 14, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		leftTrackWheelModels[16].setRotationPoint(-40.5F, 2F, 28.2F);

		leftTrackWheelModels[17].addShapeBox(-7F, 2F, -4F, 14, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 45
		leftTrackWheelModels[17].setRotationPoint(-40.5F, 2F, 28.2F);

		leftTrackWheelModels[18].addShapeBox(-6F, 1.8F, -5F, 13, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 76
		leftTrackWheelModels[18].setRotationPoint(-56F, -3.5F, 29.2F);

		leftTrackWheelModels[19].addShapeBox(-6F, -1.5F, -5F, 13, 3, 10, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 77
		leftTrackWheelModels[19].setRotationPoint(-56F, -3.5F, 29.2F);

		leftTrackWheelModels[20].addShapeBox(-6F, -5.8F, -5F, 13, 4, 10, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		leftTrackWheelModels[20].setRotationPoint(-56F, -3.5F, 29.2F);

		leftTrackWheelModels[21].addShapeBox(-6F, 1.8F, -5F, 13, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 358
		leftTrackWheelModels[21].setRotationPoint(59F, -5F, 29.2F);

		leftTrackWheelModels[22].addShapeBox(-6F, -5.8F, -5F, 13, 4, 10, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		leftTrackWheelModels[22].setRotationPoint(59F, -5F, 29.2F);

		leftTrackWheelModels[23].addShapeBox(-6F, -1.5F, -5F, 13, 3, 10, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 360
		leftTrackWheelModels[23].setRotationPoint(59F, -5F, 29.2F);

		leftTrackWheelModels[24].addShapeBox(-6F, 1.8F, -5F, 13, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 361
		leftTrackWheelModels[24].setRotationPoint(59F, -5F, -29.2F);

		leftTrackWheelModels[25].addShapeBox(-6F, -5.8F, -5F, 13, 4, 10, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		leftTrackWheelModels[25].setRotationPoint(59F, -5F, -29.2F);

		leftTrackWheelModels[26].addShapeBox(-6F, -1.5F, -5F, 13, 3, 10, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 363
		leftTrackWheelModels[26].setRotationPoint(59F, -5F, -29.2F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 817, 81, textureX, textureY); // Box 46
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 873, 81, textureX, textureY); // Box 47
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 48
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box 49
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 50
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 51
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 52
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 53
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 54
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Box 55
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 56
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 57
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 913, 89, textureX, textureY); // Box 58
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 969, 89, textureX, textureY); // Box 59
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 545, 97, textureX, textureY); // Box 60
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 601, 97, textureX, textureY); // Box 61
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 657, 97, textureX, textureY); // Box 62
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 713, 97, textureX, textureY); // Box 63

		rightTrackWheelModels[0].addShapeBox(-7F, -7F, -4F, 14, 5, 10, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		rightTrackWheelModels[0].setRotationPoint(-40.5F, 2F, -29.8F);

		rightTrackWheelModels[1].addShapeBox(-7F, -2F, -4F, 14, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		rightTrackWheelModels[1].setRotationPoint(-40.5F, 2F, -29.8F);

		rightTrackWheelModels[2].addShapeBox(-7F, 2F, -4F, 14, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 48
		rightTrackWheelModels[2].setRotationPoint(-40.5F, 2F, -29.8F);

		rightTrackWheelModels[3].addShapeBox(-7F, -7F, -4F, 14, 5, 10, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		rightTrackWheelModels[3].setRotationPoint(-23.5F, 2F, -29.8F);

		rightTrackWheelModels[4].addShapeBox(-7F, -2F, -4F, 14, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		rightTrackWheelModels[4].setRotationPoint(-23.5F, 2F, -29.8F);

		rightTrackWheelModels[5].addShapeBox(-7F, 2F, -4F, 14, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 51
		rightTrackWheelModels[5].setRotationPoint(-23.5F, 2F, -29.8F);

		rightTrackWheelModels[6].addShapeBox(-7F, 2F, -4F, 14, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 52
		rightTrackWheelModels[6].setRotationPoint(-5.5F, 2F, -29.8F);

		rightTrackWheelModels[7].addShapeBox(-7F, -2F, -4F, 14, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		rightTrackWheelModels[7].setRotationPoint(-5.5F, 2F, -29.8F);

		rightTrackWheelModels[8].addShapeBox(-7F, -7F, -4F, 14, 5, 10, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		rightTrackWheelModels[8].setRotationPoint(-5.5F, 2F, -29.8F);

		rightTrackWheelModels[9].addShapeBox(-7F, -7F, -4F, 14, 5, 10, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		rightTrackWheelModels[9].setRotationPoint(11.5F, 2F, -29.8F);

		rightTrackWheelModels[10].addShapeBox(-7F, -2F, -4F, 14, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		rightTrackWheelModels[10].setRotationPoint(11.5F, 2F, -29.8F);

		rightTrackWheelModels[11].addShapeBox(-7F, 2F, -4F, 14, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 57
		rightTrackWheelModels[11].setRotationPoint(11.5F, 2F, -29.8F);

		rightTrackWheelModels[12].addShapeBox(-7F, -7F, -4F, 14, 5, 10, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		rightTrackWheelModels[12].setRotationPoint(28.5F, 2F, -29.8F);

		rightTrackWheelModels[13].addShapeBox(-7F, -2F, -4F, 14, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		rightTrackWheelModels[13].setRotationPoint(28.5F, 2F, -29.8F);

		rightTrackWheelModels[14].addShapeBox(-7F, 2F, -4F, 14, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 60
		rightTrackWheelModels[14].setRotationPoint(28.5F, 2F, -29.8F);

		rightTrackWheelModels[15].addShapeBox(-7F, 2F, -4F, 14, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 61
		rightTrackWheelModels[15].setRotationPoint(46.5F, 2F, -29.8F);

		rightTrackWheelModels[16].addShapeBox(-7F, -2F, -4F, 14, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		rightTrackWheelModels[16].setRotationPoint(46.5F, 2F, -29.8F);

		rightTrackWheelModels[17].addShapeBox(-7F, -7F, -4F, 14, 5, 10, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		rightTrackWheelModels[17].setRotationPoint(46.5F, 2F, -29.8F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 657, 33, textureX, textureY); // Box 8
		leftTrackModel[1] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 9
		leftTrackModel[2] = new ModelRendererTurbo(this, 657, 49, textureX, textureY); // Box 10
		leftTrackModel[3] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 11
		leftTrackModel[4] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 12
		leftTrackModel[5] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Box 13
		leftTrackModel[6] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Box 14
		leftTrackModel[7] = new ModelRendererTurbo(this, 545, 9, textureX, textureY); // Box 15
		leftTrackModel[8] = new ModelRendererTurbo(this, 985, 9, textureX, textureY); // Box 16
		leftTrackModel[9] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 17

		leftTrackModel[0].addBox(0F, 0F, 0F, 91, 1, 13, 0F); // Box 8
		leftTrackModel[0].setRotationPoint(-31F, -12F, 22.5F);

		leftTrackModel[1].addShapeBox(0F, 0F, 0F, 28, 1, 13, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 9
		leftTrackModel[1].setRotationPoint(-59F, -12F, 22.5F);

		leftTrackModel[2].addBox(0F, 0F, 0F, 92, 1, 13, 0F); // Box 10
		leftTrackModel[2].setRotationPoint(-43F, 9F, 22.5F);

		leftTrackModel[3].addShapeBox(0F, 0F, 0F, 17, 1, 13, 0F,0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F); // Box 11
		leftTrackModel[3].setRotationPoint(-60F, 9F, 22.5F);

		leftTrackModel[4].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F); // Box 12
		leftTrackModel[4].setRotationPoint(-63F, 1F, 22.5F);

		leftTrackModel[5].addShapeBox(0F, 0F, 0F, 4, 1, 13, 0F,0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackModel[5].setRotationPoint(-63F, -4F, 22.5F);

		leftTrackModel[6].addShapeBox(0F, 0F, 0F, 15, 1, 13, 0F,0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F); // Box 14
		leftTrackModel[6].setRotationPoint(49F, 9F, 22.5F);

		leftTrackModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F,0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 15
		leftTrackModel[7].setRotationPoint(64F, -5F, 22.5F);

		leftTrackModel[8].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F); // Box 16
		leftTrackModel[8].setRotationPoint(64F, 0F, 22.5F);

		leftTrackModel[9].addShapeBox(0F, 0F, 0F, 4, 1, 13, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 17
		leftTrackModel[9].setRotationPoint(60F, -12F, 22.5F);
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 18
		rightTrackModel[1] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 19
		rightTrackModel[2] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 20
		rightTrackModel[3] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 21
		rightTrackModel[4] = new ModelRendererTurbo(this, 641, 65, textureX, textureY); // Box 22
		rightTrackModel[5] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 23
		rightTrackModel[6] = new ModelRendererTurbo(this, 897, 17, textureX, textureY); // Box 24
		rightTrackModel[7] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 25
		rightTrackModel[8] = new ModelRendererTurbo(this, 545, 25, textureX, textureY); // Box 26
		rightTrackModel[9] = new ModelRendererTurbo(this, 873, 33, textureX, textureY); // Box 27

		rightTrackModel[0].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F,0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 18
		rightTrackModel[0].setRotationPoint(64F, -5F, -35.5F);

		rightTrackModel[1].addShapeBox(0F, 0F, 0F, 4, 1, 13, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		rightTrackModel[1].setRotationPoint(60F, -12F, -35.5F);

		rightTrackModel[2].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F); // Box 20
		rightTrackModel[2].setRotationPoint(64F, 0F, -35.5F);

		rightTrackModel[3].addShapeBox(0F, 0F, 0F, 15, 1, 13, 0F,0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F); // Box 21
		rightTrackModel[3].setRotationPoint(49F, 9F, -35.5F);

		rightTrackModel[4].addBox(0F, 0F, 0F, 92, 1, 13, 0F); // Box 22
		rightTrackModel[4].setRotationPoint(-43F, 9F, -35.5F);

		rightTrackModel[5].addBox(0F, 0F, 0F, 91, 1, 13, 0F); // Box 23
		rightTrackModel[5].setRotationPoint(-31F, -12F, -35.5F);

		rightTrackModel[6].addShapeBox(0F, 0F, 0F, 28, 1, 13, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 24
		rightTrackModel[6].setRotationPoint(-59F, -12F, -35.5F);

		rightTrackModel[7].addShapeBox(0F, 0F, 0F, 4, 1, 13, 0F,0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 25
		rightTrackModel[7].setRotationPoint(-63F, -4F, -35.5F);

		rightTrackModel[8].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F); // Box 26
		rightTrackModel[8].setRotationPoint(-63F, 1F, -35.5F);

		rightTrackModel[9].addShapeBox(0F, 0F, 0F, 17, 1, 13, 0F,0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F); // Box 27
		rightTrackModel[9].setRotationPoint(-60F, 9F, -35.5F);
	}

	private void initGuns() {
	}
	{

		// Driver/Pilot
		ModelRendererTurbo[][] gun_0_Model = new ModelRendererTurbo[3][];

		gun_0_Model[0] = new ModelRendererTurbo[21];
		gun_0_Model[0][0] = new ModelRendererTurbo(this, 49, 297, textureX, textureY); // Box 227
		gun_0_Model[0][1] = new ModelRendererTurbo(this, 73, 297, textureX, textureY); // Box 228
		gun_0_Model[0][2] = new ModelRendererTurbo(this, 113, 297, textureX, textureY); // Box 231
		gun_0_Model[0][3] = new ModelRendererTurbo(this, 177, 297, textureX, textureY); // Box 234
		gun_0_Model[0][4] = new ModelRendererTurbo(this, 185, 297, textureX, textureY); // Box 235
		gun_0_Model[0][5] = new ModelRendererTurbo(this, 193, 297, textureX, textureY); // Box 236
		gun_0_Model[0][6] = new ModelRendererTurbo(this, 497, 297, textureX, textureY); // Box 237
		gun_0_Model[0][7] = new ModelRendererTurbo(this, 505, 297, textureX, textureY); // Box 238
		gun_0_Model[0][8] = new ModelRendererTurbo(this, 41, 305, textureX, textureY); // Box 239
		gun_0_Model[0][9] = new ModelRendererTurbo(this, 49, 305, textureX, textureY); // Box 240
		gun_0_Model[0][10] = new ModelRendererTurbo(this, 193, 305, textureX, textureY); // Box 241
		gun_0_Model[0][11] = new ModelRendererTurbo(this, 505, 305, textureX, textureY); // Box 242
		gun_0_Model[0][12] = new ModelRendererTurbo(this, 1, 313, textureX, textureY); // Box 243
		gun_0_Model[0][13] = new ModelRendererTurbo(this, 33, 313, textureX, textureY); // Box 244
		gun_0_Model[0][14] = new ModelRendererTurbo(this, 41, 313, textureX, textureY); // Box 245
		gun_0_Model[0][15] = new ModelRendererTurbo(this, 49, 313, textureX, textureY); // Box 246
		gun_0_Model[0][16] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 247
		gun_0_Model[0][17] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Box 248
		gun_0_Model[0][18] = new ModelRendererTurbo(this, 193, 313, textureX, textureY); // Box 250
		gun_0_Model[0][19] = new ModelRendererTurbo(this, 217, 313, textureX, textureY); // Box 251
		gun_0_Model[0][20] = new ModelRendererTurbo(this, 225, 313, textureX, textureY); // Box 252

		gun_0_Model[0][0].addShapeBox(-1F, -2.7F, -1.35F, 1, 2, 1, 0F,1.2F, -0.3F, -0.4F, -0.94F, 0F, -0.4F, -0.94F, 0F, -0.4F, 1.2F, -0.3F, -0.4F, 0F, 0F, -0.4F, 0.7F, 0F, -0.4F, 0.7F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 227

		gun_0_Model[0][1].addShapeBox(-1F, -2.7F, 0.3F, 1, 2, 1, 0F,1.2F, -0.3F, -0.4F, -0.94F, 0F, -0.4F, -0.94F, 0F, -0.4F, 1.2F, -0.3F, -0.4F, 0F, 0F, -0.4F, 0.7F, 0F, -0.4F, 0.7F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 228

		gun_0_Model[0][2].addShapeBox(-1.4F, -3.3F, -1.35F, 1, 1, 1, 0F,0.8F, -0.2F, -0.4F, -0.94F, -0.2F, -0.4F, -0.94F, -0.2F, -0.4F, 0.8F, -0.2F, -0.4F, 0.8F, -0.1F, -0.4F, -0.55F, -0.4F, -0.4F, -0.55F, -0.4F, -0.4F, 0.8F, -0.1F, -0.4F); // Box 231

		gun_0_Model[0][3].addShapeBox(-3.1F, -3.1F, 0.5F, 2, 1, 1, 0F,0.2F, 0F, -0.35F, 0.9F, 0F, -0.35F, 0.9F, 0F, -0.35F, 0.2F, 0F, -0.35F, 0.2F, 0F, -0.35F, 0.9F, 0F, -0.35F, 0.9F, 0F, -0.35F, 0.2F, 0F, -0.35F); // Box 234

		gun_0_Model[0][4].addShapeBox(-3.1F, -4.1F, 0.5F, 2, 1, 1, 0F,-0.8F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.8F, 0F, -0.35F, 0.2F, 0F, -0.35F, 0.9F, 0F, -0.35F, 0.9F, 0F, -0.35F, 0.2F, 0F, -0.35F); // Box 235

		gun_0_Model[0][5].addShapeBox(-3.1F, -2.1F, 0.5F, 2, 1, 1, 0F,0.2F, 0F, -0.35F, 0.9F, 0F, -0.35F, 0.9F, 0F, -0.35F, 0.2F, 0F, -0.35F, -0.8F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.8F, 0F, -0.35F); // Box 236

		gun_0_Model[0][6].addShapeBox(-0.8F, -3.1F, 0.6F, 1, 1, 1, 0F,-0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F); // Box 237

		gun_0_Model[0][7].addShapeBox(-3.7F, -3.1F, 0.6F, 1, 1, 1, 0F,-0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F); // Box 238

		gun_0_Model[0][8].addShapeBox(-0.8F, -4.1F, 0.6F, 1, 1, 1, 0F,0.65F, 0F, -0.35F, -1.35F, 0F, -0.35F, -1.35F, 0F, -0.35F, 0.65F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F); // Box 239

		gun_0_Model[0][9].addShapeBox(-3.7F, -4.1F, 0.6F, 1, 1, 1, 0F,-1.35F, 0F, -0.35F, 0.65F, 0F, -0.35F, 0.65F, 0F, -0.35F, -1.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F); // Box 240

		gun_0_Model[0][10].addShapeBox(-0.8F, -2.1F, 0.6F, 1, 1, 1, 0F,-0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, 0.65F, 0F, -0.35F, -1.35F, 0F, -0.35F, -1.35F, 0F, -0.35F, 0.65F, 0F, -0.35F); // Box 241

		gun_0_Model[0][11].addShapeBox(-3.7F, -2.1F, 0.6F, 1, 1, 1, 0F,-0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -1.35F, 0F, -0.35F, 0.65F, 0F, -0.35F, 0.65F, 0F, -0.35F, -1.35F, 0F, -0.35F); // Box 242

		gun_0_Model[0][12].addShapeBox(-2.75F, -1.75F, 0.6F, 2, 1, 1, 0F,-0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F); // Box 243

		gun_0_Model[0][13].addShapeBox(-2.75F, -4.5F, 0.6F, 2, 1, 1, 0F,-0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F); // Box 244

		gun_0_Model[0][14].addShapeBox(-2.28F, -2.92F, 0.8F, 1, 1, 1, 0F,-0.1F, -0.35F, -0.35F, -0.1F, -0.35F, -0.35F, -0.1F, -0.35F, -0.35F, -0.1F, -0.35F, -0.35F, -0.3F, -0.33F, -0.35F, -0.3F, -0.33F, -0.35F, -0.3F, -0.33F, -0.35F, -0.3F, -0.33F, -0.35F); // Box 245

		gun_0_Model[0][15].addShapeBox(-2.28F, -3.23F, 0.8F, 1, 1, 1, 0F,-0.3F, -0.33F, -0.35F, -0.3F, -0.33F, -0.35F, -0.3F, -0.33F, -0.35F, -0.3F, -0.33F, -0.35F, -0.1F, -0.35F, -0.35F, -0.1F, -0.35F, -0.35F, -0.1F, -0.35F, -0.35F, -0.1F, -0.35F, -0.35F); // Box 246

		gun_0_Model[0][16].addBox(-1F, -1F, -1F, 2, 1, 2, 0F); // Box 247

		gun_0_Model[0][17].addBox(-1F, -0.8F, -1F, 2, 1, 2, 0F); // Box 248

		gun_0_Model[0][18].addShapeBox(0.25F, -1.6F, -1.6F, 1, 1, 1, 0F,-0.25F, -0.2F, -0.38F, -0.25F, -0.2F, -0.38F, -0.25F, -0.2F, -0.38F, -0.25F, -0.2F, -0.38F, -0.25F, 0.1F, -0.38F, -0.25F, 0.1F, -0.38F, -0.25F, 0.1F, -0.38F, -0.25F, 0.1F, -0.38F); // Box 250

		gun_0_Model[0][19].addShapeBox(0.25F, -1.6F, 0.55F, 1, 1, 1, 0F,-0.25F, -0.2F, -0.38F, -0.25F, -0.2F, -0.38F, -0.25F, -0.2F, -0.38F, -0.25F, -0.2F, -0.38F, -0.25F, 0.1F, -0.38F, -0.25F, 0.1F, -0.38F, -0.25F, 0.1F, -0.38F, -0.25F, 0.1F, -0.38F); // Box 251

		gun_0_Model[0][20].addShapeBox(0.25F, -1.3F, 0.3F, 1, 1, 1, 0F,-0.25F, -0.2F, -0.38F, -0.25F, -0.2F, -0.38F, -0.25F, -0.2F, -0.38F, -0.25F, -0.2F, -0.38F, -0.25F, 0.1F, -0.38F, -0.25F, 0.1F, -0.38F, -0.25F, 0.1F, -0.38F, -0.25F, 0.1F, -0.38F); // Box 252

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_0_Model[0])
		{
			gunPart.setRotationPoint(-2F, -36F, -14F);
		}


		gun_0_Model[1] = new ModelRendererTurbo[0];

		gun_0_Model[2] = new ModelRendererTurbo[224];
		gun_0_Model[2][0] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 172
		gun_0_Model[2][1] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 173
		gun_0_Model[2][2] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Box 174
		gun_0_Model[2][3] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 175
		gun_0_Model[2][4] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 176
		gun_0_Model[2][5] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 177
		gun_0_Model[2][6] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 178
		gun_0_Model[2][7] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 179
		gun_0_Model[2][8] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 180
		gun_0_Model[2][9] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 181
		gun_0_Model[2][10] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 182
		gun_0_Model[2][11] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 183
		gun_0_Model[2][12] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 184
		gun_0_Model[2][13] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 187
		gun_0_Model[2][14] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 189
		gun_0_Model[2][15] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 190
		gun_0_Model[2][16] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 191
		gun_0_Model[2][17] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 192
		gun_0_Model[2][18] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 193
		gun_0_Model[2][19] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Box 194
		gun_0_Model[2][20] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 195
		gun_0_Model[2][21] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 196
		gun_0_Model[2][22] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 197
		gun_0_Model[2][23] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Box 198
		gun_0_Model[2][24] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Box 199
		gun_0_Model[2][25] = new ModelRendererTurbo(this, 305, 225, textureX, textureY); // Box 25
		gun_0_Model[2][26] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 26
		gun_0_Model[2][27] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 28
		gun_0_Model[2][28] = new ModelRendererTurbo(this, 329, 105, textureX, textureY); // Box 29
		gun_0_Model[2][29] = new ModelRendererTurbo(this, 33, 265, textureX, textureY); // Box 30
		gun_0_Model[2][30] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 31
		gun_0_Model[2][31] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 32
		gun_0_Model[2][32] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Box 33
		gun_0_Model[2][33] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Box 34
		gun_0_Model[2][34] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 35
		gun_0_Model[2][35] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 36
		gun_0_Model[2][36] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Box 37
		gun_0_Model[2][37] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Box 38
		gun_0_Model[2][38] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Box 39
		gun_0_Model[2][39] = new ModelRendererTurbo(this, 321, 121, textureX, textureY); // Box 40
		gun_0_Model[2][40] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Box 42
		gun_0_Model[2][41] = new ModelRendererTurbo(this, 481, 121, textureX, textureY); // Box 43
		gun_0_Model[2][42] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Box 44
		gun_0_Model[2][43] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 45
		gun_0_Model[2][44] = new ModelRendererTurbo(this, 297, 129, textureX, textureY); // Box 46
		gun_0_Model[2][45] = new ModelRendererTurbo(this, 193, 265, textureX, textureY); // Box 47
		gun_0_Model[2][46] = new ModelRendererTurbo(this, 225, 265, textureX, textureY); // Box 48
		gun_0_Model[2][47] = new ModelRendererTurbo(this, 225, 289, textureX, textureY); // Box 49
		gun_0_Model[2][48] = new ModelRendererTurbo(this, 305, 129, textureX, textureY); // Box 50
		gun_0_Model[2][49] = new ModelRendererTurbo(this, 345, 129, textureX, textureY); // Box 51
		gun_0_Model[2][50] = new ModelRendererTurbo(this, 353, 129, textureX, textureY); // Box 52
		gun_0_Model[2][51] = new ModelRendererTurbo(this, 393, 129, textureX, textureY); // Box 53
		gun_0_Model[2][52] = new ModelRendererTurbo(this, 417, 129, textureX, textureY); // Box 54
		gun_0_Model[2][53] = new ModelRendererTurbo(this, 425, 129, textureX, textureY); // Box 55
		gun_0_Model[2][54] = new ModelRendererTurbo(this, 505, 129, textureX, textureY); // Box 54
		gun_0_Model[2][55] = new ModelRendererTurbo(this, 41, 137, textureX, textureY); // Box 55
		gun_0_Model[2][56] = new ModelRendererTurbo(this, 89, 137, textureX, textureY); // Box 56
		gun_0_Model[2][57] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 57
		gun_0_Model[2][58] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Box 58
		gun_0_Model[2][59] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Box 59
		gun_0_Model[2][60] = new ModelRendererTurbo(this, 145, 137, textureX, textureY); // Box 60
		gun_0_Model[2][61] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Box 64
		gun_0_Model[2][62] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Box 65
		gun_0_Model[2][63] = new ModelRendererTurbo(this, 233, 137, textureX, textureY); // Box 66
		gun_0_Model[2][64] = new ModelRendererTurbo(this, 433, 137, textureX, textureY); // Box 67
		gun_0_Model[2][65] = new ModelRendererTurbo(this, 441, 137, textureX, textureY); // Box 68
		gun_0_Model[2][66] = new ModelRendererTurbo(this, 273, 145, textureX, textureY); // Box 69
		gun_0_Model[2][67] = new ModelRendererTurbo(this, 281, 145, textureX, textureY); // Box 70
		gun_0_Model[2][68] = new ModelRendererTurbo(this, 321, 145, textureX, textureY); // Box 71
		gun_0_Model[2][69] = new ModelRendererTurbo(this, 329, 145, textureX, textureY); // Box 72
		gun_0_Model[2][70] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Box 73
		gun_0_Model[2][71] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 74
		gun_0_Model[2][72] = new ModelRendererTurbo(this, 41, 153, textureX, textureY); // Box 75
		gun_0_Model[2][73] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 76
		gun_0_Model[2][74] = new ModelRendererTurbo(this, 89, 153, textureX, textureY); // Box 77
		gun_0_Model[2][75] = new ModelRendererTurbo(this, 97, 153, textureX, textureY); // Box 78
		gun_0_Model[2][76] = new ModelRendererTurbo(this, 129, 153, textureX, textureY); // Box 79
		gun_0_Model[2][77] = new ModelRendererTurbo(this, 137, 153, textureX, textureY); // Box 80
		gun_0_Model[2][78] = new ModelRendererTurbo(this, 169, 153, textureX, textureY); // Box 81
		gun_0_Model[2][79] = new ModelRendererTurbo(this, 177, 153, textureX, textureY); // Box 82
		gun_0_Model[2][80] = new ModelRendererTurbo(this, 401, 153, textureX, textureY); // Box 83
		gun_0_Model[2][81] = new ModelRendererTurbo(this, 441, 153, textureX, textureY); // Box 84
		gun_0_Model[2][82] = new ModelRendererTurbo(this, 409, 153, textureX, textureY); // Box 85
		gun_0_Model[2][83] = new ModelRendererTurbo(this, 449, 153, textureX, textureY); // Box 86
		gun_0_Model[2][84] = new ModelRendererTurbo(this, 241, 161, textureX, textureY); // Box 87
		gun_0_Model[2][85] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Box 88
		gun_0_Model[2][86] = new ModelRendererTurbo(this, 481, 217, textureX, textureY); // Box 89
		gun_0_Model[2][87] = new ModelRendererTurbo(this, 281, 161, textureX, textureY); // Box 90
		gun_0_Model[2][88] = new ModelRendererTurbo(this, 497, 161, textureX, textureY); // Box 91
		gun_0_Model[2][89] = new ModelRendererTurbo(this, 289, 161, textureX, textureY); // Box 92
		gun_0_Model[2][90] = new ModelRendererTurbo(this, 225, 225, textureX, textureY); // Box 108
		gun_0_Model[2][91] = new ModelRendererTurbo(this, 321, 161, textureX, textureY); // Box 92
		gun_0_Model[2][92] = new ModelRendererTurbo(this, 329, 161, textureX, textureY); // Box 93
		gun_0_Model[2][93] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 94
		gun_0_Model[2][94] = new ModelRendererTurbo(this, 41, 169, textureX, textureY); // Box 95
		gun_0_Model[2][95] = new ModelRendererTurbo(this, 49, 169, textureX, textureY); // Box 96
		gun_0_Model[2][96] = new ModelRendererTurbo(this, 89, 169, textureX, textureY); // Box 97
		gun_0_Model[2][97] = new ModelRendererTurbo(this, 97, 169, textureX, textureY); // Box 98
		gun_0_Model[2][98] = new ModelRendererTurbo(this, 137, 169, textureX, textureY); // Box 99
		gun_0_Model[2][99] = new ModelRendererTurbo(this, 145, 169, textureX, textureY); // Box 100
		gun_0_Model[2][100] = new ModelRendererTurbo(this, 201, 169, textureX, textureY); // Box 101
		gun_0_Model[2][101] = new ModelRendererTurbo(this, 409, 169, textureX, textureY); // Box 102
		gun_0_Model[2][102] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 103
		gun_0_Model[2][103] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 105
		gun_0_Model[2][104] = new ModelRendererTurbo(this, 417, 169, textureX, textureY); // Box 106
		gun_0_Model[2][105] = new ModelRendererTurbo(this, 457, 169, textureX, textureY); // Box 107
		gun_0_Model[2][106] = new ModelRendererTurbo(this, 465, 169, textureX, textureY); // Box 108
		gun_0_Model[2][107] = new ModelRendererTurbo(this, 505, 169, textureX, textureY); // Box 109
		gun_0_Model[2][108] = new ModelRendererTurbo(this, 225, 177, textureX, textureY); // Box 110
		gun_0_Model[2][109] = new ModelRendererTurbo(this, 233, 177, textureX, textureY); // Box 111
		gun_0_Model[2][110] = new ModelRendererTurbo(this, 273, 177, textureX, textureY); // Box 112
		gun_0_Model[2][111] = new ModelRendererTurbo(this, 281, 177, textureX, textureY); // Box 113
		gun_0_Model[2][112] = new ModelRendererTurbo(this, 321, 177, textureX, textureY); // Box 114
		gun_0_Model[2][113] = new ModelRendererTurbo(this, 329, 177, textureX, textureY); // Box 115
		gun_0_Model[2][114] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 116
		gun_0_Model[2][115] = new ModelRendererTurbo(this, 41, 185, textureX, textureY); // Box 117
		gun_0_Model[2][116] = new ModelRendererTurbo(this, 49, 185, textureX, textureY); // Box 118
		gun_0_Model[2][117] = new ModelRendererTurbo(this, 89, 185, textureX, textureY); // Box 119
		gun_0_Model[2][118] = new ModelRendererTurbo(this, 97, 185, textureX, textureY); // Box 120
		gun_0_Model[2][119] = new ModelRendererTurbo(this, 137, 185, textureX, textureY); // Box 121
		gun_0_Model[2][120] = new ModelRendererTurbo(this, 145, 185, textureX, textureY); // Box 122
		gun_0_Model[2][121] = new ModelRendererTurbo(this, 177, 185, textureX, textureY); // Box 123
		gun_0_Model[2][122] = new ModelRendererTurbo(this, 401, 185, textureX, textureY); // Box 124
		gun_0_Model[2][123] = new ModelRendererTurbo(this, 441, 185, textureX, textureY); // Box 126
		gun_0_Model[2][124] = new ModelRendererTurbo(this, 489, 185, textureX, textureY); // Box 127
		gun_0_Model[2][125] = new ModelRendererTurbo(this, 409, 185, textureX, textureY); // Box 128
		gun_0_Model[2][126] = new ModelRendererTurbo(this, 217, 193, textureX, textureY); // Box 129
		gun_0_Model[2][127] = new ModelRendererTurbo(this, 225, 193, textureX, textureY); // Box 130
		gun_0_Model[2][128] = new ModelRendererTurbo(this, 321, 241, textureX, textureY); // Box 131
		gun_0_Model[2][129] = new ModelRendererTurbo(this, 305, 193, textureX, textureY); // Box 132
		gun_0_Model[2][130] = new ModelRendererTurbo(this, 361, 193, textureX, textureY); // Box 133
		gun_0_Model[2][131] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 134
		gun_0_Model[2][132] = new ModelRendererTurbo(this, 9, 201, textureX, textureY); // Box 135
		gun_0_Model[2][133] = new ModelRendererTurbo(this, 305, 201, textureX, textureY); // Box 136
		gun_0_Model[2][134] = new ModelRendererTurbo(this, 329, 201, textureX, textureY); // Box 137
		gun_0_Model[2][135] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Box 138
		gun_0_Model[2][136] = new ModelRendererTurbo(this, 497, 241, textureX, textureY); // Box 139
		gun_0_Model[2][137] = new ModelRendererTurbo(this, 497, 257, textureX, textureY); // Box 140
		gun_0_Model[2][138] = new ModelRendererTurbo(this, 489, 281, textureX, textureY); // Box 141
		gun_0_Model[2][139] = new ModelRendererTurbo(this, 393, 201, textureX, textureY); // Box 107
		gun_0_Model[2][140] = new ModelRendererTurbo(this, 401, 201, textureX, textureY); // Box 16
		gun_0_Model[2][141] = new ModelRendererTurbo(this, 433, 201, textureX, textureY); // Box 17
		gun_0_Model[2][142] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 18
		gun_0_Model[2][143] = new ModelRendererTurbo(this, 9, 209, textureX, textureY); // Box 19
		gun_0_Model[2][144] = new ModelRendererTurbo(this, 193, 209, textureX, textureY); // Box 20
		gun_0_Model[2][145] = new ModelRendererTurbo(this, 241, 209, textureX, textureY); // Box 21
		gun_0_Model[2][146] = new ModelRendererTurbo(this, 257, 209, textureX, textureY); // Box 22
		gun_0_Model[2][147] = new ModelRendererTurbo(this, 305, 209, textureX, textureY); // Box 23
		gun_0_Model[2][148] = new ModelRendererTurbo(this, 329, 209, textureX, textureY); // Box 24
		gun_0_Model[2][149] = new ModelRendererTurbo(this, 393, 209, textureX, textureY); // Box 25
		gun_0_Model[2][150] = new ModelRendererTurbo(this, 401, 209, textureX, textureY); // Box 26
		gun_0_Model[2][151] = new ModelRendererTurbo(this, 433, 209, textureX, textureY); // Box 27
		gun_0_Model[2][152] = new ModelRendererTurbo(this, 505, 209, textureX, textureY); // Box 28
		gun_0_Model[2][153] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 29
		gun_0_Model[2][154] = new ModelRendererTurbo(this, 33, 217, textureX, textureY); // Box 159
		gun_0_Model[2][155] = new ModelRendererTurbo(this, 193, 217, textureX, textureY); // Box 160
		gun_0_Model[2][156] = new ModelRendererTurbo(this, 305, 217, textureX, textureY); // Box 161
		gun_0_Model[2][157] = new ModelRendererTurbo(this, 329, 217, textureX, textureY); // Box 162
		gun_0_Model[2][158] = new ModelRendererTurbo(this, 505, 217, textureX, textureY); // Box 163
		gun_0_Model[2][159] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 164
		gun_0_Model[2][160] = new ModelRendererTurbo(this, 193, 225, textureX, textureY); // Box 165
		gun_0_Model[2][161] = new ModelRendererTurbo(this, 393, 225, textureX, textureY); // Box 166
		gun_0_Model[2][162] = new ModelRendererTurbo(this, 449, 225, textureX, textureY); // Box 167
		gun_0_Model[2][163] = new ModelRendererTurbo(this, 481, 225, textureX, textureY); // Box 168
		gun_0_Model[2][164] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 169
		gun_0_Model[2][165] = new ModelRendererTurbo(this, 49, 233, textureX, textureY); // Box 170
		gun_0_Model[2][166] = new ModelRendererTurbo(this, 193, 233, textureX, textureY); // Box 171
		gun_0_Model[2][167] = new ModelRendererTurbo(this, 225, 233, textureX, textureY); // Box 172
		gun_0_Model[2][168] = new ModelRendererTurbo(this, 449, 233, textureX, textureY); // Box 173
		gun_0_Model[2][169] = new ModelRendererTurbo(this, 481, 233, textureX, textureY); // Box 174
		gun_0_Model[2][170] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 175
		gun_0_Model[2][171] = new ModelRendererTurbo(this, 33, 241, textureX, textureY); // Box 176
		gun_0_Model[2][172] = new ModelRendererTurbo(this, 49, 241, textureX, textureY); // Box 177
		gun_0_Model[2][173] = new ModelRendererTurbo(this, 193, 241, textureX, textureY); // Box 178
		gun_0_Model[2][174] = new ModelRendererTurbo(this, 273, 241, textureX, textureY); // Box 179
		gun_0_Model[2][175] = new ModelRendererTurbo(this, 305, 241, textureX, textureY); // Box 180
		gun_0_Model[2][176] = new ModelRendererTurbo(this, 393, 241, textureX, textureY); // Box 181
		gun_0_Model[2][177] = new ModelRendererTurbo(this, 401, 241, textureX, textureY); // Box 182
		gun_0_Model[2][178] = new ModelRendererTurbo(this, 449, 241, textureX, textureY); // Box 183
		gun_0_Model[2][179] = new ModelRendererTurbo(this, 457, 241, textureX, textureY); // Box 184
		gun_0_Model[2][180] = new ModelRendererTurbo(this, 481, 241, textureX, textureY); // Box 185
		gun_0_Model[2][181] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 186
		gun_0_Model[2][182] = new ModelRendererTurbo(this, 193, 249, textureX, textureY); // Box 187
		gun_0_Model[2][183] = new ModelRendererTurbo(this, 225, 249, textureX, textureY); // Box 188
		gun_0_Model[2][184] = new ModelRendererTurbo(this, 233, 249, textureX, textureY); // Box 189
		gun_0_Model[2][185] = new ModelRendererTurbo(this, 249, 249, textureX, textureY); // Box 190
		gun_0_Model[2][186] = new ModelRendererTurbo(this, 273, 249, textureX, textureY); // Box 191
		gun_0_Model[2][187] = new ModelRendererTurbo(this, 329, 249, textureX, textureY); // Box 192
		gun_0_Model[2][188] = new ModelRendererTurbo(this, 505, 249, textureX, textureY); // Box 193
		gun_0_Model[2][189] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 194
		gun_0_Model[2][190] = new ModelRendererTurbo(this, 225, 257, textureX, textureY); // Box 195
		gun_0_Model[2][191] = new ModelRendererTurbo(this, 329, 257, textureX, textureY); // Box 196
		gun_0_Model[2][192] = new ModelRendererTurbo(this, 481, 257, textureX, textureY); // Box 197
		gun_0_Model[2][193] = new ModelRendererTurbo(this, 273, 265, textureX, textureY); // Box 198
		gun_0_Model[2][194] = new ModelRendererTurbo(this, 505, 265, textureX, textureY); // Box 199
		gun_0_Model[2][195] = new ModelRendererTurbo(this, 249, 273, textureX, textureY); // Box 200
		gun_0_Model[2][196] = new ModelRendererTurbo(this, 273, 273, textureX, textureY); // Box 201
		gun_0_Model[2][197] = new ModelRendererTurbo(this, 505, 273, textureX, textureY); // Box 202
		gun_0_Model[2][198] = new ModelRendererTurbo(this, 249, 281, textureX, textureY); // Box 203
		gun_0_Model[2][199] = new ModelRendererTurbo(this, 273, 281, textureX, textureY); // Box 204
		gun_0_Model[2][200] = new ModelRendererTurbo(this, 289, 281, textureX, textureY); // Box 205
		gun_0_Model[2][201] = new ModelRendererTurbo(this, 297, 281, textureX, textureY); // Box 206
		gun_0_Model[2][202] = new ModelRendererTurbo(this, 321, 281, textureX, textureY); // Box 207
		gun_0_Model[2][203] = new ModelRendererTurbo(this, 361, 281, textureX, textureY); // Box 208
		gun_0_Model[2][204] = new ModelRendererTurbo(this, 377, 281, textureX, textureY); // Box 209
		gun_0_Model[2][205] = new ModelRendererTurbo(this, 409, 281, textureX, textureY); // Box 210
		gun_0_Model[2][206] = new ModelRendererTurbo(this, 425, 281, textureX, textureY); // Box 211
		gun_0_Model[2][207] = new ModelRendererTurbo(this, 457, 281, textureX, textureY); // Box 212
		gun_0_Model[2][208] = new ModelRendererTurbo(this, 505, 281, textureX, textureY); // Box 213
		gun_0_Model[2][209] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Box 214
		gun_0_Model[2][210] = new ModelRendererTurbo(this, 33, 289, textureX, textureY); // Box 215
		gun_0_Model[2][211] = new ModelRendererTurbo(this, 41, 289, textureX, textureY); // Box 216
		gun_0_Model[2][212] = new ModelRendererTurbo(this, 49, 289, textureX, textureY); // Box 217
		gun_0_Model[2][213] = new ModelRendererTurbo(this, 73, 289, textureX, textureY); // Box 218
		gun_0_Model[2][214] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 219
		gun_0_Model[2][215] = new ModelRendererTurbo(this, 457, 289, textureX, textureY); // Box 220
		gun_0_Model[2][216] = new ModelRendererTurbo(this, 489, 289, textureX, textureY); // Box 221
		gun_0_Model[2][217] = new ModelRendererTurbo(this, 497, 289, textureX, textureY); // Box 222
		gun_0_Model[2][218] = new ModelRendererTurbo(this, 505, 289, textureX, textureY); // Box 223
		gun_0_Model[2][219] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Box 224
		gun_0_Model[2][220] = new ModelRendererTurbo(this, 33, 297, textureX, textureY); // Box 225
		gun_0_Model[2][221] = new ModelRendererTurbo(this, 41, 297, textureX, textureY); // Box 226
		gun_0_Model[2][222] = new ModelRendererTurbo(this, 105, 297, textureX, textureY); // Box 229
		gun_0_Model[2][223] = new ModelRendererTurbo(this, 169, 297, textureX, textureY); // Box 232

		gun_0_Model[2][0].addBox(-2.8F, -5.8F, -0.5F, 3, 1, 1, 0F); // Box 172

		gun_0_Model[2][1].addShapeBox(-2.8F, -4.8F, -0.5F, 3, 1, 1, 0F,0F, -0.1F, -0.05F, 0.45F, -0.1F, -0.05F, 0.45F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0.45F, -0.1F, -0.05F, 0.45F, -0.1F, -0.05F, 0F, -0.1F, -0.05F); // Box 173

		gun_0_Model[2][2].addShapeBox(-10.4F, -6.05F, -0.5F, 4, 2, 1, 0F,0F, -0.4F, 0F, 0.45F, -0.4F, 0F, 0.45F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.1F, 0F, 0.45F, -0.1F, 0F, 0.45F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 174

		gun_0_Model[2][3].addShapeBox(-5.95F, -5.05F, -0.5F, 3, 1, 1, 0F,0F, 0.3F, 0F, 0.15F, 0.3F, 0F, 0.15F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.1F, 0F, 0.15F, -0.1F, 0F, 0.15F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 175

		gun_0_Model[2][4].addShapeBox(-6.85F, -6.45F, -0.5F, 1, 1, 1, 0F,0F, 0.2F, -0.05F, -0.1F, 0.2F, -0.05F, -0.1F, 0.2F, -0.05F, 0F, 0.2F, -0.05F, 0F, -0.2F, -0.05F, -0.1F, -0.2F, -0.05F, -0.1F, -0.2F, -0.05F, 0F, -0.2F, -0.05F); // Box 176

		gun_0_Model[2][5].addShapeBox(-5.95F, -6.95F, -0.5F, 2, 1, 1, 0F,0F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, 0F, -0.3F, -0.05F, 0F, -0.1F, -0.05F, -0.3F, -0.1F, -0.05F, -0.3F, -0.1F, -0.05F, 0F, -0.1F, -0.05F); // Box 177

		gun_0_Model[2][6].addShapeBox(-4.25F, -6.95F, -0.5F, 2, 1, 1, 0F,0F, -0.3F, -0.05F, -0.3F, -0.6F, -0.05F, -0.3F, -0.6F, -0.05F, 0F, -0.3F, -0.05F, 0F, 0F, -0.05F, -0.3F, 0F, -0.05F, -0.3F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 178

		gun_0_Model[2][7].addShapeBox(-3.2F, -6.38F, -0.5F, 1, 1, 1, 0F,-0.35F, -0.42F, -0.05F, -0.35F, -0.42F, -0.05F, -0.35F, -0.42F, -0.05F, -0.35F, -0.42F, -0.05F, -0.35F, -0.42F, -0.05F, -0.35F, -0.42F, -0.05F, -0.35F, -0.42F, -0.05F, -0.35F, -0.42F, -0.05F); // Box 179

		gun_0_Model[2][8].addShapeBox(-5.88F, -6.95F, 0.15F, 2, 1, 1, 0F,-0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 180

		gun_0_Model[2][9].addShapeBox(-5.98F, -6.65F, 0.15F, 1, 1, 1, 0F,-0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F); // Box 181

		gun_0_Model[2][10].addShapeBox(-4.79F, -6.65F, 0.15F, 1, 1, 1, 0F,-0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F); // Box 182

		gun_0_Model[2][11].addShapeBox(-5.95F, -6.55F, -0.5F, 1, 1, 1, 0F,0F, -0.3F, -0.05F, -0.5F, -0.3F, -0.05F, -0.5F, -0.3F, -0.05F, 0F, -0.3F, -0.05F, 0F, -0.3F, -0.05F, -0.5F, -0.3F, -0.05F, -0.5F, -0.3F, -0.05F, 0F, -0.3F, -0.05F); // Box 183

		gun_0_Model[2][12].addShapeBox(-6.28F, -6.5F, 0.15F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F); // Box 184

		gun_0_Model[2][13].addShapeBox(-6.3F, -5.8F, -1.15F, 4, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F); // Box 187

		gun_0_Model[2][14].addShapeBox(-3.1F, -6.1F, -1.2F, 1, 1, 1, 0F,-0.4F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 189

		gun_0_Model[2][15].addShapeBox(-5.88F, -6.95F, -1.15F, 2, 1, 1, 0F,-0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 190

		gun_0_Model[2][16].addShapeBox(-5.98F, -6.65F, -1.15F, 1, 1, 1, 0F,-0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F); // Box 191

		gun_0_Model[2][17].addShapeBox(-6.28F, -6.5F, -1.15F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F); // Box 192

		gun_0_Model[2][18].addShapeBox(-6.43F, -6.25F, -1.15F, 1, 1, 1, 0F,-0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F); // Box 193

		gun_0_Model[2][19].addShapeBox(-4.79F, -6.65F, -1.15F, 1, 1, 1, 0F,-0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F); // Box 194

		gun_0_Model[2][20].addShapeBox(-6.3F, -5.8F, 0.15F, 4, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F); // Box 195

		gun_0_Model[2][21].addShapeBox(-3.1F, -6.1F, 0.15F, 1, 1, 1, 0F,-0.4F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 196

		gun_0_Model[2][22].addShapeBox(-6.43F, -6.25F, 0.15F, 1, 1, 1, 0F,-0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F); // Box 197

		gun_0_Model[2][23].addShapeBox(-6.25F, -5.85F, -1.35F, 4, 1, 1, 0F,-0.3F, -0.4F, -0.48F, -0.6F, -0.4F, -0.48F, -0.6F, -0.4F, -0.48F, -0.3F, -0.4F, -0.48F, -0.5F, -0.45F, -0.35F, -0.8F, -0.45F, -0.35F, -0.8F, -0.45F, -0.61F, -0.5F, -0.45F, -0.61F); // Box 198

		gun_0_Model[2][24].addShapeBox(-5.8F, -5.7F, -1.48F, 3, 1, 1, 0F,-0.3F, -0.4F, -0.48F, -0.6F, -0.4F, -0.48F, -0.6F, -0.4F, -0.48F, -0.3F, -0.4F, -0.48F, -0.5F, -0.3F, -0.46F, -0.8F, -0.3F, -0.46F, -0.8F, -0.3F, -0.5F, -0.5F, -0.3F, -0.5F); // Box 199

		gun_0_Model[2][25].addShapeBox(0.2F, -5.75F, -0.5F, 12, 1, 1, 0F,0F, -0.35F, -0.05F, 0.45F, -0.35F, -0.05F, 0.45F, -0.35F, -0.05F, 0F, -0.35F, -0.05F, 0F, -0.35F, -0.05F, 0.45F, -0.35F, -0.05F, 0.45F, -0.35F, -0.05F, 0F, -0.35F, -0.05F); // Box 25

		gun_0_Model[2][26].addShapeBox(12.65F, -6.05F, -0.5F, 1, 1, 1, 0F,0F, -0.35F, -0.35F, 0.9F, -0.45F, -0.35F, 0.9F, -0.45F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.05F, 0.9F, -0.35F, -0.15F, 0.9F, -0.35F, -0.15F, 0F, -0.35F, -0.05F); // Box 26

		gun_0_Model[2][27].addShapeBox(0.2F, -5.45F, -0.5F, 12, 1, 1, 0F,0F, -0.35F, -0.05F, 0.45F, -0.35F, -0.05F, 0.45F, -0.35F, -0.05F, 0F, -0.35F, -0.05F, 0F, -0.35F, -0.35F, 0.45F, -0.35F, -0.35F, 0.45F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 28

		gun_0_Model[2][28].addShapeBox(12.65F, -5.75F, -0.5F, 1, 1, 1, 0F,0F, -0.35F, -0.05F, 0.9F, -0.35F, -0.15F, 0.9F, -0.35F, -0.15F, 0F, -0.35F, -0.05F, 0F, -0.35F, -0.05F, 0.9F, -0.35F, -0.15F, 0.9F, -0.35F, -0.15F, 0F, -0.35F, -0.05F); // Box 29

		gun_0_Model[2][29].addShapeBox(0.2F, -6.05F, -0.5F, 12, 1, 1, 0F,0F, -0.35F, -0.35F, 0.45F, -0.35F, -0.35F, 0.45F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.05F, 0.45F, -0.35F, -0.05F, 0.45F, -0.35F, -0.05F, 0F, -0.35F, -0.05F); // Box 30

		gun_0_Model[2][30].addShapeBox(12.65F, -5.45F, -0.5F, 1, 1, 1, 0F,0F, -0.35F, -0.05F, 0.9F, -0.35F, -0.15F, 0.9F, -0.35F, -0.15F, 0F, -0.35F, -0.05F, 0F, -0.35F, -0.35F, 0.9F, -0.45F, -0.35F, 0.9F, -0.45F, -0.35F, 0F, -0.35F, -0.35F); // Box 31

		gun_0_Model[2][31].addShapeBox(15.1F, -6.05F, -0.5F, 1, 1, 1, 0F,0.6F, -0.5F, -0.4F, 0.6F, -0.5F, -0.4F, 0.6F, -0.5F, -0.4F, 0.6F, -0.5F, -0.4F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F); // Box 32

		gun_0_Model[2][32].addShapeBox(15.1F, -5.45F, -0.5F, 1, 1, 1, 0F,0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.5F, -0.4F, 0.6F, -0.5F, -0.4F, 0.6F, -0.5F, -0.4F, 0.6F, -0.5F, -0.4F); // Box 33

		gun_0_Model[2][33].addShapeBox(15.1F, -5.75F, -0.5F, 1, 1, 1, 0F,0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F); // Box 34

		gun_0_Model[2][34].addShapeBox(16.7F, -6.05F, -0.5F, 1, 1, 1, 0F,0F, -0.5F, -0.4F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.5F, -0.4F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.2F); // Box 35

		gun_0_Model[2][35].addShapeBox(16.7F, -5.75F, -0.5F, 1, 1, 1, 0F,0F, -0.35F, -0.2F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.2F); // Box 36

		gun_0_Model[2][36].addShapeBox(16.7F, -5.45F, -0.5F, 1, 1, 1, 0F,0F, -0.35F, -0.2F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.2F, 0F, -0.5F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.5F, -0.4F); // Box 37

		gun_0_Model[2][37].addShapeBox(17.15F, -6.05F, -0.5F, 1, 1, 1, 0F,-0.45F, -0.2F, -0.1F, -0.35F, -0.2F, -0.1F, -0.35F, -0.2F, -0.1F, -0.45F, -0.2F, -0.1F, -0.45F, -0.3F, 0.2F, -0.35F, -0.3F, 0.2F, -0.35F, -0.3F, 0.2F, -0.45F, -0.3F, 0.2F); // Box 38

		gun_0_Model[2][38].addShapeBox(17.15F, -5.45F, -0.5F, 1, 1, 1, 0F,-0.45F, -0.3F, 0.2F, -0.35F, -0.3F, 0.2F, -0.35F, -0.3F, 0.2F, -0.45F, -0.3F, 0.2F, -0.45F, -0.2F, -0.1F, -0.35F, -0.2F, -0.1F, -0.35F, -0.2F, -0.1F, -0.45F, -0.2F, -0.1F); // Box 39

		gun_0_Model[2][39].addShapeBox(17.15F, -5.75F, -0.5F, 1, 1, 1, 0F,-0.45F, -0.4F, 0.2F, -0.35F, -0.4F, 0.2F, -0.35F, -0.4F, 0.2F, -0.45F, -0.4F, 0.2F, -0.45F, -0.4F, 0.2F, -0.35F, -0.4F, 0.2F, -0.35F, -0.4F, 0.2F, -0.45F, -0.4F, 0.2F); // Box 40

		gun_0_Model[2][40].addShapeBox(17.8F, -6.05F, -0.5F, 1, 1, 1, 0F,-0.45F, -0.2F, -0.1F, -0.45F, -0.2F, -0.1F, -0.45F, -0.2F, -0.1F, -0.45F, -0.2F, -0.1F, -0.45F, -0.3F, 0.2F, -0.45F, -0.3F, 0.2F, -0.45F, -0.3F, 0.2F, -0.45F, -0.3F, 0.2F); // Box 42

		gun_0_Model[2][41].addShapeBox(17.8F, -5.75F, -0.5F, 1, 1, 1, 0F,-0.45F, -0.4F, 0.2F, -0.45F, -0.4F, 0.2F, -0.45F, -0.4F, 0.2F, -0.45F, -0.4F, 0.2F, -0.45F, -0.4F, 0.2F, -0.45F, -0.4F, 0.2F, -0.45F, -0.4F, 0.2F, -0.45F, -0.4F, 0.2F); // Box 43

		gun_0_Model[2][42].addShapeBox(17.8F, -5.45F, -0.5F, 1, 1, 1, 0F,-0.45F, -0.3F, 0.2F, -0.45F, -0.3F, 0.2F, -0.45F, -0.3F, 0.2F, -0.45F, -0.3F, 0.2F, -0.45F, -0.2F, -0.1F, -0.45F, -0.2F, -0.1F, -0.45F, -0.2F, -0.1F, -0.45F, -0.2F, -0.1F); // Box 44

		gun_0_Model[2][43].addShapeBox(17.5F, -6.3F, -0.5F, 1, 1, 1, 0F,-0.2F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F); // Box 45

		gun_0_Model[2][44].addShapeBox(17.5F, -5.2F, -0.5F, 1, 1, 1, 0F,-0.2F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F); // Box 46

		gun_0_Model[2][45].addShapeBox(1.1F, -4.9F, -0.5F, 11, 1, 1, 0F,0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F); // Box 47

		gun_0_Model[2][46].addShapeBox(1.1F, -5.2F, -0.5F, 11, 1, 1, 0F,0.6F, -0.5F, -0.4F, 0.6F, -0.5F, -0.4F, 0.6F, -0.5F, -0.4F, 0.6F, -0.5F, -0.4F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F); // Box 48

		gun_0_Model[2][47].addShapeBox(1.1F, -4.6F, -0.5F, 11, 1, 1, 0F,0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.5F, -0.4F, 0.6F, -0.5F, -0.4F, 0.6F, -0.5F, -0.4F, 0.6F, -0.5F, -0.4F); // Box 49

		gun_0_Model[2][48].addShapeBox(11.6F, -5.2F, -0.5F, 1, 1, 1, 0F,0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F); // Box 50

		gun_0_Model[2][49].addShapeBox(9.6F, -5.2F, -0.5F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F); // Box 51

		gun_0_Model[2][50].addShapeBox(17.9F, -5.75F, -0.5F, 1, 1, 1, 0F,-0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F); // Box 52

		gun_0_Model[2][51].addShapeBox(17.9F, -5.45F, -0.5F, 1, 1, 1, 0F,-0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F); // Box 53

		gun_0_Model[2][52].addShapeBox(17.9F, -6.05F, -0.5F, 1, 1, 1, 0F,-0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F); // Box 54

		gun_0_Model[2][53].addShapeBox(17.5F, -5.75F, 0.1F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F); // Box 55

		gun_0_Model[2][54].addShapeBox(17.5F, -5.75F, -1.1F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F); // Box 54

		gun_0_Model[2][55].addShapeBox(-2.7F, -3.9F, -0.5F, 3, 1, 1, 0F,0F, -0.25F, 0.2F, 0.85F, -0.25F, 0.2F, 0.85F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0.85F, -0.25F, 0.2F, 0.85F, -0.25F, 0.2F, 0F, -0.25F, 0.2F); // Box 55

		gun_0_Model[2][56].addShapeBox(-1.7F, -3.4F, -0.5F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0.85F, -0.25F, 0F, 0.85F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.25F, 0.85F, -0.5F, -0.25F, 0.85F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 56

		gun_0_Model[2][57].addShapeBox(-2.2F, -4.4F, -1.1F, 1, 1, 1, 0F,-0.15F, 0.3F, -0.4F, 0.1F, 0.3F, -0.4F, 0.1F, 0.3F, -0.4F, -0.15F, 0.3F, -0.4F, 0.15F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0.15F, -0.25F, -0.4F); // Box 57

		gun_0_Model[2][58].addShapeBox(-2.2F, -4.4F, 0.1F, 1, 1, 1, 0F,-0.15F, 0.3F, -0.4F, 0.1F, 0.3F, -0.4F, 0.1F, 0.3F, -0.4F, -0.15F, 0.3F, -0.4F, 0.15F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0.15F, -0.25F, -0.4F); // Box 58

		gun_0_Model[2][59].addShapeBox(-11.2F, -6.1F, 0F, 1, 1, 1, 0F,-0.2F, -0.35F, -0.4F, -0.2F, -0.45F, -0.25F, -0.2F, -0.45F, -0.5F, -0.2F, -0.35F, -0.35F, -0.2F, -0.55F, -0.4F, -0.2F, -0.45F, -0.25F, -0.2F, -0.45F, -0.5F, -0.2F, -0.55F, -0.35F); // Box 59

		gun_0_Model[2][60].addShapeBox(-11.2F, -6.1F, -1F, 1, 1, 1, 0F,-0.2F, -0.35F, -0.35F, -0.2F, -0.45F, -0.5F, -0.2F, -0.45F, -0.25F, -0.2F, -0.35F, -0.4F, -0.2F, -0.55F, -0.35F, -0.2F, -0.45F, -0.5F, -0.2F, -0.45F, -0.25F, -0.2F, -0.55F, -0.4F); // Box 60

		gun_0_Model[2][61].addShapeBox(-11.2F, -4.7F, -1F, 1, 1, 1, 0F,-0.2F, -0.55F, -0.35F, -0.2F, -0.45F, -0.5F, -0.2F, -0.45F, -0.25F, -0.2F, -0.55F, -0.4F, -0.2F, -0.35F, -0.35F, -0.2F, -0.45F, -0.5F, -0.2F, -0.45F, -0.25F, -0.2F, -0.35F, -0.4F); // Box 64

		gun_0_Model[2][62].addShapeBox(-11.2F, -4.7F, 0F, 1, 1, 1, 0F,-0.2F, -0.55F, -0.4F, -0.2F, -0.45F, -0.25F, -0.2F, -0.45F, -0.5F, -0.2F, -0.55F, -0.35F, -0.2F, -0.35F, -0.4F, -0.2F, -0.45F, -0.25F, -0.2F, -0.45F, -0.5F, -0.2F, -0.35F, -0.35F); // Box 65

		gun_0_Model[2][63].addShapeBox(-11.8F, -6.1F, 0.15F, 1, 1, 1, 0F,-0.1F, -0.35F, -0.75F, -0.2F, -0.35F, -0.25F, -0.2F, -0.35F, -0.5F, -0.1F, -0.35F, 0.25F, -0.1F, -0.55F, -0.75F, -0.2F, -0.55F, -0.25F, -0.2F, -0.55F, -0.5F, -0.1F, -0.55F, 0.25F); // Box 66

		gun_0_Model[2][64].addShapeBox(-11.8F, -6.1F, -1.15F, 1, 1, 1, 0F,-0.1F, -0.35F, 0.25F, -0.2F, -0.35F, -0.5F, -0.2F, -0.35F, -0.25F, -0.1F, -0.35F, -0.75F, -0.1F, -0.55F, 0.25F, -0.2F, -0.55F, -0.5F, -0.2F, -0.55F, -0.25F, -0.1F, -0.55F, -0.75F); // Box 67

		gun_0_Model[2][65].addShapeBox(-11.8F, -4.5F, 0.15F, 1, 1, 1, 0F,-0.1F, -0.35F, -0.75F, -0.2F, -0.35F, -0.25F, -0.2F, -0.35F, -0.5F, -0.1F, -0.35F, 0.25F, -0.1F, -0.55F, -0.75F, -0.2F, -0.55F, -0.25F, -0.2F, -0.55F, -0.5F, -0.1F, -0.55F, 0.25F); // Box 68

		gun_0_Model[2][66].addShapeBox(-11.8F, -4.5F, -1.15F, 1, 1, 1, 0F,-0.1F, -0.35F, 0.25F, -0.2F, -0.35F, -0.5F, -0.2F, -0.35F, -0.25F, -0.1F, -0.35F, -0.75F, -0.1F, -0.55F, 0.25F, -0.2F, -0.55F, -0.5F, -0.2F, -0.55F, -0.25F, -0.1F, -0.55F, -0.75F); // Box 69

		gun_0_Model[2][67].addShapeBox(-12.35F, -6.1F, 0.65F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.4F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.25F, -0.3F, -0.35F, -0.4F, -0.3F, -0.55F, -0.4F, -0.35F, -0.55F, -0.25F, -0.35F, -0.55F, -0.25F, -0.3F, -0.55F, -0.4F); // Box 70

		gun_0_Model[2][68].addShapeBox(-12.35F, -6.1F, -1.65F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.4F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.25F, -0.3F, -0.35F, -0.4F, -0.3F, -0.55F, -0.4F, -0.35F, -0.55F, -0.25F, -0.35F, -0.55F, -0.25F, -0.3F, -0.55F, -0.4F); // Box 71

		gun_0_Model[2][69].addShapeBox(-12.35F, -4.5F, -1.65F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.4F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.4F, -0.35F, -0.55F, -0.4F, -0.35F, -0.55F, -0.25F, -0.35F, -0.55F, -0.25F, -0.35F, -0.55F, -0.4F); // Box 72

		gun_0_Model[2][70].addShapeBox(-12.35F, -4.5F, 0.65F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.4F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.4F, -0.35F, -0.55F, -0.4F, -0.35F, -0.55F, -0.25F, -0.35F, -0.55F, -0.25F, -0.35F, -0.55F, -0.4F); // Box 73

		gun_0_Model[2][71].addShapeBox(-12.35F, -5.9F, 0.78F, 1, 2, 1, 0F,-0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F); // Box 74

		gun_0_Model[2][72].addShapeBox(-12.35F, -5.9F, 0.57F, 1, 2, 1, 0F,-0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F); // Box 75

		gun_0_Model[2][73].addShapeBox(-12.35F, -5.9F, -1.76F, 1, 2, 1, 0F,-0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F); // Box 76

		gun_0_Model[2][74].addShapeBox(-12.35F, -5.9F, -1.55F, 1, 2, 1, 0F,-0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F); // Box 77

		gun_0_Model[2][75].addShapeBox(-4.75F, -6.35F, -0.9F, 1, 1, 1, 0F,-0.48F, -0.42F, -0.15F, -0.48F, -0.42F, -0.15F, -0.48F, -0.42F, -0.15F, -0.48F, -0.42F, -0.15F, -0.48F, -0.45F, -0.35F, -0.48F, -0.45F, -0.35F, -0.48F, -0.45F, -0.35F, -0.48F, -0.45F, -0.35F); // Box 78

		gun_0_Model[2][76].addShapeBox(-4.75F, -6F, -0.9F, 1, 1, 1, 0F,-0.48F, -0.2F, -0.35F, -0.48F, -0.2F, -0.35F, -0.48F, -0.2F, -0.35F, -0.48F, -0.2F, -0.35F, -0.48F, -0.2F, -0.4F, -0.48F, -0.2F, -0.4F, -0.48F, -0.2F, -0.4F, -0.48F, -0.2F, -0.4F); // Box 79

		gun_0_Model[2][77].addShapeBox(-4.75F, -6.53F, -0.9F, 1, 1, 1, 0F,-0.48F, -0.4F, -0.15F, -0.48F, -0.4F, -0.15F, -0.48F, -0.4F, -0.15F, -0.48F, -0.4F, -0.15F, -0.48F, -0.4F, -0.15F, -0.48F, -0.4F, -0.15F, -0.48F, -0.4F, -0.15F, -0.48F, -0.4F, -0.15F); // Box 80

		gun_0_Model[2][78].addShapeBox(-5.9F, -6.53F, -0.9F, 1, 1, 1, 0F,-0.48F, -0.4F, -0.15F, -0.48F, -0.4F, -0.15F, -0.48F, -0.4F, -0.15F, -0.48F, -0.4F, -0.15F, -0.48F, -0.4F, -0.15F, -0.48F, -0.4F, -0.15F, -0.48F, -0.4F, -0.15F, -0.48F, -0.4F, -0.15F); // Box 81

		gun_0_Model[2][79].addShapeBox(-5.9F, -6.35F, -0.9F, 1, 1, 1, 0F,-0.48F, -0.42F, -0.15F, -0.48F, -0.42F, -0.15F, -0.48F, -0.42F, -0.15F, -0.48F, -0.42F, -0.15F, -0.48F, -0.45F, -0.35F, -0.48F, -0.45F, -0.35F, -0.48F, -0.45F, -0.35F, -0.48F, -0.45F, -0.35F); // Box 82

		gun_0_Model[2][80].addShapeBox(-5.9F, -6F, -0.9F, 1, 1, 1, 0F,-0.48F, -0.2F, -0.35F, -0.48F, -0.2F, -0.35F, -0.48F, -0.2F, -0.35F, -0.48F, -0.2F, -0.35F, -0.48F, -0.2F, -0.4F, -0.48F, -0.2F, -0.4F, -0.48F, -0.2F, -0.4F, -0.48F, -0.2F, -0.4F); // Box 83

		gun_0_Model[2][81].addShapeBox(-5.88F, -6.8F, 0F, 2, 1, 1, 0F,-0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F); // Box 84

		gun_0_Model[2][82].addShapeBox(-2.1F, -6.45F, -0.5F, 1, 1, 1, 0F,-0.2F, -0.25F, -0.3F, -0.2F, -0.6F, -0.3F, -0.2F, -0.6F, -0.3F, -0.2F, -0.25F, -0.3F, -0.1F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F); // Box 85

		gun_0_Model[2][83].addShapeBox(-5.35F, -5.96F, -1.25F, 1, 1, 1, 0F,-0.1F, -0.48F, -0.3F, -0.1F, -0.48F, -0.3F, -0.1F, -0.48F, -0.3F, -0.1F, -0.48F, -0.3F, -0.1F, -0.48F, -0.3F, -0.1F, -0.48F, -0.3F, -0.1F, -0.48F, -0.3F, -0.1F, -0.48F, -0.3F); // Box 86

		gun_0_Model[2][84].addShapeBox(-5.35F, -5.96F, -1.5F, 1, 1, 1, 0F,-0.1F, -0.55F, -0.45F, -0.1F, -0.55F, -0.45F, -0.1F, -0.48F, -0.45F, -0.1F, -0.48F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.48F, -0.45F, -0.1F, -0.48F, -0.45F); // Box 87

		gun_0_Model[2][85].addShapeBox(-5.35F, -5.89F, -1.6F, 1, 1, 1, 0F,-0.1F, -0.8F, -0.4F, -0.1F, -0.8F, -0.4F, -0.1F, -0.48F, -0.45F, -0.1F, -0.48F, -0.45F, -0.1F, 0.1F, -0.3F, -0.1F, 0.1F, -0.3F, -0.1F, -0.48F, -0.45F, -0.1F, -0.48F, -0.45F); // Box 88

		gun_0_Model[2][86].addShapeBox(-10.4F, -4.65F, -0.5F, 7, 1, 1, 0F,0F, -0.25F, -0.3F, 0.85F, -0.25F, -0.3F, 0.85F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0.85F, -0.25F, -0.3F, 0.85F, -0.25F, -0.3F, 0F, -0.25F, -0.3F); // Box 89

		gun_0_Model[2][87].addShapeBox(-7.4F, -7F, -0.53F, 1, 1, 1, 0F,-0.45F, -0.38F, -0.15F, -0.45F, -0.38F, -0.15F, -0.45F, -0.38F, -0.15F, -0.45F, -0.38F, -0.15F, -0.45F, -0.38F, -0.15F, -0.45F, -0.38F, -0.15F, -0.45F, -0.38F, -0.15F, -0.45F, -0.38F, -0.15F); // Box 90

		gun_0_Model[2][88].addShapeBox(-9.8F, -4.2F, -0.5F, 6, 1, 1, 0F,-0.3F, -0.4F, -0.4F, 0.85F, -0.4F, -0.4F, 0.85F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, 0.85F, -0.4F, -0.4F, 0.85F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F); // Box 91

		gun_0_Model[2][89].addShapeBox(-3.5F, -4.3F, -0.5F, 1, 1, 1, 0F,-0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F); // Box 92

		gun_0_Model[2][90].addShapeBox(-11.7F, -5.2F, -0.5F, 7, 1, 1, 0F,0F, -0.28F, -0.28F, 0F, -0.28F, -0.28F, 0F, -0.28F, -0.28F, 0F, -0.28F, -0.28F, 0F, -0.28F, -0.28F, 0F, -0.28F, -0.28F, 0F, -0.28F, -0.28F, 0F, -0.28F, -0.28F); // Box 108

		gun_0_Model[2][91].addShapeBox(-2.1F, -5.5F, 0.1F, 1, 1, 1, 0F,-0.06F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, -0.06F, -0.2F, -0.4F, -0.05F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, -0.05F, -0.2F, -0.4F); // Box 92

		gun_0_Model[2][92].addShapeBox(-2.1F, -5.5F, -1.1F, 1, 1, 1, 0F,-0.06F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, -0.06F, -0.2F, -0.4F, -0.05F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, -0.05F, -0.2F, -0.4F); // Box 93

		gun_0_Model[2][93].addShapeBox(-9.8F, -4.3F, -0.55F, 1, 1, 1, 0F,-0.3F, -0.3F, 0.25F, -0.3F, -0.3F, 0.25F, -0.3F, -0.3F, 0.25F, -0.3F, -0.3F, 0.25F, -0.3F, -0.3F, 0.25F, -0.3F, -0.3F, 0.25F, -0.3F, -0.3F, 0.25F, -0.3F, -0.3F, 0.25F); // Box 94

		gun_0_Model[2][94].addShapeBox(-9.9F, -4.3F, -1.4F, 1, 1, 1, 0F,-0.2F, -0.38F, -0.4F, -0.2F, -0.38F, -0.4F, -0.2F, -0.38F, -0.4F, -0.2F, -0.38F, -0.4F, -0.2F, -0.38F, -0.4F, -0.2F, -0.38F, -0.4F, -0.2F, -0.38F, -0.4F, -0.2F, -0.38F, -0.4F); // Box 95

		gun_0_Model[2][95].addShapeBox(-10.9F, -4.3F, -1.4F, 1, 1, 1, 0F,0.2F, -0.88F, -0.4F, 0.2F, -0.38F, -0.4F, 0.2F, -0.38F, -0.4F, 0.2F, -0.88F, -0.4F, 0.2F, 0.2F, -0.4F, 0.2F, -0.38F, -0.4F, 0.2F, -0.38F, -0.4F, 0.2F, 0.2F, -0.4F); // Box 96

		gun_0_Model[2][96].addShapeBox(-11.75F, -3.75F, -1.4F, 1, 1, 1, 0F,-0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F); // Box 97

		gun_0_Model[2][97].addShapeBox(-11.75F, -3.75F, 0.3F, 1, 1, 1, 0F,-0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F); // Box 98

		gun_0_Model[2][98].addShapeBox(-10.9F, -4.3F, 0.3F, 1, 1, 1, 0F,0.2F, -0.88F, -0.4F, 0.2F, -0.38F, -0.4F, 0.2F, -0.38F, -0.4F, 0.2F, -0.88F, -0.4F, 0.2F, 0.2F, -0.4F, 0.2F, -0.38F, -0.4F, 0.2F, -0.38F, -0.4F, 0.2F, 0.2F, -0.4F); // Box 99

		gun_0_Model[2][99].addShapeBox(-9.9F, -4.3F, 0.3F, 1, 1, 1, 0F,-0.2F, -0.38F, -0.4F, -0.2F, -0.38F, -0.4F, -0.2F, -0.38F, -0.4F, -0.2F, -0.38F, -0.4F, -0.2F, -0.38F, -0.4F, -0.2F, -0.38F, -0.4F, -0.2F, -0.38F, -0.4F, -0.2F, -0.38F, -0.4F); // Box 100

		gun_0_Model[2][100].addShapeBox(-8.6F, -4.45F, -0.9F, 1, 1, 1, 0F,0.1F, -0.3F, -0.42F, 0.1F, -0.3F, -0.42F, 0.1F, -0.3F, -0.42F, 0.1F, -0.3F, -0.42F, -0.3F, -0.3F, -0.42F, -0.3F, -0.3F, -0.42F, -0.3F, -0.3F, -0.42F, -0.3F, -0.3F, -0.42F); // Box 101

		gun_0_Model[2][101].addShapeBox(-9.1F, -4.6F, -0.9F, 1, 1, 1, 0F,0.1F, -0.3F, -0.42F, 0.1F, -0.3F, -0.42F, 0.1F, -0.3F, -0.42F, 0.1F, -0.3F, -0.42F, 0.1F, -0.3F, -0.42F, 0.1F, -0.3F, -0.42F, 0.1F, -0.3F, -0.42F, 0.1F, -0.3F, -0.42F); // Box 102

		gun_0_Model[2][102].addShapeBox(-11.8F, -3.68F, -1.1F, 1, 1, 2, 0F,-0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F); // Box 103

		gun_0_Model[2][103].addShapeBox(-11.8F, -3.88F, -1.1F, 1, 1, 2, 0F,-0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F); // Box 105

		gun_0_Model[2][104].addShapeBox(-11.1F, -5F, -0.2F, 1, 1, 1, 0F,0F, 0F, -0.45F, -0.8F, 0F, -0.45F, -0.8F, 0F, -0.45F, 0F, 0F, -0.45F, -0.6F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.6F, -0.2F, -0.45F); // Box 106

		gun_0_Model[2][105].addShapeBox(-11.1F, -5F, -0.8F, 1, 1, 1, 0F,0F, 0F, -0.45F, -0.8F, 0F, -0.45F, -0.8F, 0F, -0.45F, 0F, 0F, -0.45F, -0.6F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.6F, -0.2F, -0.45F); // Box 107

		gun_0_Model[2][106].addShapeBox(-11.5F, -5.7F, -0.8F, 1, 1, 1, 0F,-0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F); // Box 108

		gun_0_Model[2][107].addShapeBox(-11.5F, -5.7F, -0.2F, 1, 1, 1, 0F,-0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F); // Box 109

		gun_0_Model[2][108].addShapeBox(-8.4F, -6.5F, -0.2F, 1, 2, 1, 0F,-0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.45F); // Box 110

		gun_0_Model[2][109].addShapeBox(-8.4F, -6.5F, -0.8F, 1, 2, 1, 0F,-0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.45F); // Box 111

		gun_0_Model[2][110].addShapeBox(-8.4F, -6.9F, -0.8F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F); // Box 112

		gun_0_Model[2][111].addShapeBox(-8.4F, -6.9F, -0.2F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F); // Box 113

		gun_0_Model[2][112].addShapeBox(-8.4F, -9.5F, -0.2F, 1, 4, 1, 0F,-0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Box 114

		gun_0_Model[2][113].addShapeBox(-8.4F, -9.5F, -0.8F, 1, 4, 1, 0F,-0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Box 115

		gun_0_Model[2][114].addShapeBox(-8.4F, -9.5F, -0.55F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F); // Box 116

		gun_0_Model[2][115].addShapeBox(-8.4F, -7.4F, -0.55F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F); // Box 117

		gun_0_Model[2][116].addShapeBox(-6.7F, -5.4F, -1.1F, 1, 1, 1, 0F,-0.5F, -0.2F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, -0.5F, -0.2F, -0.45F, -0.64F, -0.2F, -0.45F, 0.02F, -0.4F, -0.45F, 0.02F, -0.4F, -0.45F, -0.64F, -0.2F, -0.45F); // Box 118

		gun_0_Model[2][117].addShapeBox(-6.8F, -6.4F, -1.1F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F); // Box 119

		gun_0_Model[2][118].addShapeBox(-6.45F, -4.35F, -1.1F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.45F, -0.32F, -0.3F, -0.45F, -0.32F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.76F, -0.25F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, -0.76F, -0.25F, -0.45F); // Box 120

		gun_0_Model[2][119].addShapeBox(-6.8F, -5.4F, -1.1F, 1, 1, 1, 0F,-0.3F, 0.35F, -0.45F, -0.32F, 0.35F, -0.45F, -0.32F, 0.35F, -0.45F, -0.3F, 0.35F, -0.45F, -0.64F, 0.35F, -0.45F, 0.02F, 0.35F, -0.45F, 0.02F, 0.35F, -0.45F, -0.64F, 0.35F, -0.45F); // Box 121

		gun_0_Model[2][120].addShapeBox(-6.2F, -5.4F, -1.1F, 1, 1, 1, 0F,-0.5F, -0.4F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, 0.02F, -0.2F, -0.45F, 0.02F, -0.2F, -0.45F, -0.5F, -0.4F, -0.45F); // Box 122

		gun_0_Model[2][121].addShapeBox(-5.7F, -5.2F, -1.1F, 1, 1, 1, 0F,-0.5F, -0.25F, -0.45F, -0.1F, -0.7F, -0.45F, -0.1F, -0.7F, -0.45F, -0.5F, -0.25F, -0.45F, -0.5F, -0.4F, -0.45F, -0.25F, -0.1F, -0.45F, -0.25F, -0.1F, -0.45F, -0.5F, -0.4F, -0.45F); // Box 123

		gun_0_Model[2][122].addShapeBox(-8.9F, -6.5F, 0.25F, 1, 2, 1, 0F,0.8F, -0.25F, -0.45F, -0.6F, -0.25F, -0.45F, -0.6F, -0.25F, -0.45F, 0.8F, -0.25F, -0.45F, -0.4F, -0.25F, -0.45F, 0.8F, -0.25F, -0.45F, 0.8F, -0.25F, -0.45F, -0.4F, -0.25F, -0.45F); // Box 124

		gun_0_Model[2][123].addShapeBox(-9F, -4.75F, 0.25F, 5, 1, 1, 0F,0.8F, 0F, -0.45F, 1F, 0F, -0.45F, 1F, 0F, -0.45F, 0.8F, 0F, -0.45F, 0.8F, 0F, -0.45F, 1.8F, 0F, -0.45F, 1.8F, 0F, -0.45F, 0.8F, 0F, -0.45F); // Box 126

		gun_0_Model[2][124].addShapeBox(-9F, -3.95F, 0.25F, 5, 1, 1, 0F,0.8F, -0.2F, -0.45F, 1.8F, -0.2F, -0.45F, 1.8F, -0.2F, -0.45F, 0.8F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, 1.2F, -0.2F, -0.45F, 1.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F); // Box 127

		gun_0_Model[2][125].addShapeBox(-9.8F, -5.2F, 0.25F, 1, 1, 1, 0F,0.1F, -0.35F, -0.35F, 0.1F, -0.35F, -0.35F, 0.1F, -0.35F, -0.35F, 0.1F, -0.35F, -0.35F, 0.1F, -0.35F, -0.35F, 0.1F, -0.35F, -0.35F, 0.1F, -0.35F, -0.35F, 0.1F, -0.35F, -0.35F); // Box 128

		gun_0_Model[2][126].addShapeBox(-9.8F, -6.8F, 0.25F, 1, 1, 1, 0F,0.2F, -0.42F, -0.35F, 0.3F, -0.42F, -0.35F, 0.3F, -0.42F, -0.35F, 0.2F, -0.42F, -0.35F, 0.2F, -0.42F, -0.35F, 0.3F, -0.42F, -0.35F, 0.3F, -0.42F, -0.35F, 0.2F, -0.42F, -0.35F); // Box 129

		gun_0_Model[2][127].addShapeBox(-9.5F, -4.2F, 0.4F, 1, 1, 1, 0F,0F, 0.05F, -0.45F, -0.1F, 0.05F, -0.45F, -0.1F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F); // Box 130

		gun_0_Model[2][128].addShapeBox(-9F, -4F, 0.4F, 6, 1, 1, 0F,0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F); // Box 131

		gun_0_Model[2][129].addShapeBox(-7.1F, -4.8F, 0.4F, 4, 1, 1, 0F,0F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.4F, -0.45F); // Box 132

		gun_0_Model[2][130].addShapeBox(-7F, -4.35F, 0.6F, 1, 1, 1, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, -0.15F, -0.2F, -0.3F, -0.15F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, -0.15F, -0.2F, -0.3F, -0.15F, -0.2F); // Box 133

		gun_0_Model[2][131].addShapeBox(-7.35F, -4.65F, 0.7F, 1, 1, 1, 0F,0.3F, -0.35F, -0.35F, 0.3F, -0.35F, -0.35F, 0.3F, -0.35F, -0.35F, 0.3F, -0.35F, -0.35F, 0.3F, -0.35F, -0.35F, 0.3F, -0.35F, -0.35F, 0.3F, -0.35F, -0.35F, 0.3F, -0.35F, -0.35F); // Box 134

		gun_0_Model[2][132].addShapeBox(-7.8F, -4.35F, 0.75F, 1, 3, 1, 0F,-0.25F, -0.35F, -0.45F, -0.25F, -0.35F, -0.45F, -0.25F, -0.35F, -0.45F, -0.25F, -0.35F, -0.45F, -0.25F, -0.35F, -1.45F, -0.25F, -0.35F, -1.45F, -0.25F, -0.35F, 0.55F, -0.25F, -0.35F, 0.55F); // Box 135

		gun_0_Model[2][133].addShapeBox(-8.8F, -4.1F, 0.7F, 1, 1, 1, 0F,-0.35F, 0.5F, -0.35F, -0.35F, 0.5F, -0.35F, -0.35F, 0.5F, -0.35F, -0.35F, 0.5F, -0.35F, -0.35F, 0.7F, -0.35F, -0.35F, 0.7F, -0.35F, -0.35F, 0.7F, -0.35F, -0.35F, 0.7F, -0.35F); // Box 136

		gun_0_Model[2][134].addShapeBox(-8.8F, -2.8F, 0.7F, 1, 1, 1, 0F,-0.15F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F); // Box 137

		gun_0_Model[2][135].addShapeBox(-8.8F, -4.1F, -0.2F, 1, 1, 2, 0F,-0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F); // Box 138

		gun_0_Model[2][136].addShapeBox(-5.9F, -5.05F, 1.75F, 3, 2, 4, 0F,0F, -1.2F, 0.3F, 0.2F, -1.2F, 0.3F, 0.2F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0F, 1.1F, -0.2F, 0.2F, 1.1F, -0.2F, 0.2F, 0F, 0.35F, 0F, 0F, 0.35F); // Box 139

		gun_0_Model[2][137].addShapeBox(-5.9F, -6.05F, 1.3F, 3, 1, 4, 0F,0F, -1.3F, -0.7F, 0.2F, -1.3F, -0.7F, 0.2F, -0.45F, -0.1F, 0F, -0.45F, -0.1F, 0F, 1.2F, -0.15F, 0.2F, 1.2F, -0.15F, 0.2F, -0.2F, 0.35F, 0F, -0.2F, 0.35F); // Box 140

		gun_0_Model[2][138].addShapeBox(-5.9F, -3.25F, 1.95F, 3, 1, 4, 0F,0F, -1.3F, 0F, 0.2F, -1.3F, 0F, 0.2F, -0.2F, 0.15F, 0F, -0.2F, 0.15F, 0F, 0.6F, -0.4F, 0.2F, 0.6F, -0.4F, 0.2F, -0.4F, -0.1F, 0F, -0.4F, 0.1F); // Box 141

		gun_0_Model[2][139].addShapeBox(-5.85F, -5.55F, 1.7F, 1, 1, 1, 0F,0F, -0.4F, -0.38F, 0.6F, -0.42F, -0.4F, 0.6F, -0.42F, -0.4F, 0F, -0.4F, -0.38F, 0F, -0.4F, -0.23F, 0.6F, -0.4F, -0.25F, 0.6F, -0.4F, -0.25F, 0F, -0.4F, -0.23F); // Box 107

		gun_0_Model[2][140].addShapeBox(-5.85F, -5.4F, 1.7F, 1, 1, 1, 0F,0F, -0.45F, -0.23F, 0.6F, -0.45F, -0.25F, 0.6F, -0.45F, -0.25F, 0F, -0.45F, -0.23F, 0F, -0.45F, -0.23F, 0.6F, -0.45F, -0.25F, 0.6F, -0.45F, -0.25F, 0F, -0.45F, -0.23F); // Box 16

		gun_0_Model[2][141].addShapeBox(-5.85F, -5.25F, 1.7F, 1, 1, 1, 0F,0F, -0.4F, -0.23F, 0.6F, -0.4F, -0.25F, 0.6F, -0.4F, -0.25F, 0F, -0.4F, -0.23F, 0F, -0.4F, -0.38F, 0.6F, -0.42F, -0.4F, 0.6F, -0.42F, -0.4F, 0F, -0.4F, -0.38F); // Box 17

		gun_0_Model[2][142].addShapeBox(-4.55F, -5.55F, 1.7F, 1, 1, 1, 0F,-0.3F, -0.42F, -0.4F, -0.3F, -0.51F, -0.42F, -0.3F, -0.51F, -0.42F, -0.3F, -0.42F, -0.4F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.25F); // Box 18

		gun_0_Model[2][143].addShapeBox(-4.55F, -5.25F, 1.7F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.25F, -0.3F, -0.42F, -0.38F, -0.3F, -0.53F, -0.42F, -0.3F, -0.53F, -0.42F, -0.3F, -0.42F, -0.38F); // Box 19

		gun_0_Model[2][144].addShapeBox(-4.55F, -5.4F, 1.7F, 1, 1, 1, 0F,-0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.25F); // Box 20

		gun_0_Model[2][145].addShapeBox(-4.05F, -5.55F, 1.7F, 1, 1, 1, 0F,-0.2F, -0.51F, -0.42F, -0.5F, -0.51F, -0.42F, -0.5F, -0.51F, -0.42F, -0.2F, -0.51F, -0.42F, -0.2F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F); // Box 21

		gun_0_Model[2][146].addShapeBox(-4.05F, -5.25F, 1.7F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.52F, -0.43F, -0.5F, -0.52F, -0.43F, -0.5F, -0.52F, -0.43F, -0.2F, -0.52F, -0.43F); // Box 22

		gun_0_Model[2][147].addShapeBox(-4.05F, -5.35F, 1.7F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, -0.2F, -0.5F, -0.35F); // Box 23

		gun_0_Model[2][148].addShapeBox(-3.8F, -5.55F, 1.7F, 1, 1, 1, 0F,-0.2F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.2F, -0.52F, -0.43F, -0.2F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.2F, -0.4F, -0.36F); // Box 24

		gun_0_Model[2][149].addShapeBox(-3.8F, -5.26F, 1.7F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.2F, -0.4F, -0.36F, -0.2F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.2F, -0.52F, -0.43F); // Box 25

		gun_0_Model[2][150].addShapeBox(-3.8F, -5.46F, 1.7F, 1, 1, 1, 0F,-0.2F, -0.51F, -0.36F, -0.4F, -0.51F, -0.36F, -0.4F, -0.51F, -0.36F, -0.2F, -0.51F, -0.36F, -0.2F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.2F, -0.4F, -0.36F); // Box 26

		gun_0_Model[2][151].addShapeBox(-3.4F, -5.55F, 1.7F, 1, 1, 1, 0F,-0.2F, -0.52F, -0.43F, -0.3F, -0.63F, -0.48F, -0.3F, -0.63F, -0.48F, -0.2F, -0.52F, -0.43F, -0.2F, -0.4F, -0.36F, -0.3F, -0.36F, -0.48F, -0.3F, -0.36F, -0.48F, -0.2F, -0.4F, -0.36F); // Box 27

		gun_0_Model[2][152].addShapeBox(-3.4F, -5.46F, 1.7F, 1, 1, 1, 0F,-0.2F, -0.51F, -0.36F, -0.3F, -0.55F, -0.48F, -0.3F, -0.55F, -0.48F, -0.2F, -0.51F, -0.36F, -0.2F, -0.4F, -0.36F, -0.3F, -0.44F, -0.48F, -0.3F, -0.44F, -0.48F, -0.2F, -0.4F, -0.36F); // Box 28

		gun_0_Model[2][153].addShapeBox(-3.4F, -5.26F, 1.7F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.36F, -0.3F, -0.36F, -0.48F, -0.3F, -0.36F, -0.48F, -0.2F, -0.4F, -0.36F, -0.2F, -0.52F, -0.43F, -0.3F, -0.63F, -0.48F, -0.3F, -0.63F, -0.48F, -0.2F, -0.52F, -0.43F); // Box 29

		gun_0_Model[2][154].addShapeBox(-5.85F, -5.85F, 1.25F, 1, 1, 1, 0F,0F, -0.4F, -0.38F, 0.6F, -0.42F, -0.4F, 0.6F, -0.42F, -0.4F, 0F, -0.4F, -0.38F, 0F, -0.4F, -0.23F, 0.6F, -0.4F, -0.25F, 0.6F, -0.4F, -0.25F, 0F, -0.4F, -0.23F); // Box 159

		gun_0_Model[2][155].addShapeBox(-5.85F, -5.7F, 1.25F, 1, 1, 1, 0F,0F, -0.45F, -0.23F, 0.6F, -0.45F, -0.25F, 0.6F, -0.45F, -0.25F, 0F, -0.45F, -0.23F, 0F, -0.45F, -0.23F, 0.6F, -0.45F, -0.25F, 0.6F, -0.45F, -0.25F, 0F, -0.45F, -0.23F); // Box 160

		gun_0_Model[2][156].addShapeBox(-5.85F, -5.55F, 1.25F, 1, 1, 1, 0F,0F, -0.4F, -0.23F, 0.6F, -0.4F, -0.25F, 0.6F, -0.4F, -0.25F, 0F, -0.4F, -0.23F, 0F, -0.4F, -0.38F, 0.6F, -0.42F, -0.4F, 0.6F, -0.42F, -0.4F, 0F, -0.4F, -0.38F); // Box 161

		gun_0_Model[2][157].addShapeBox(-4.55F, -5.85F, 1.25F, 1, 1, 1, 0F,-0.3F, -0.42F, -0.4F, -0.3F, -0.51F, -0.42F, -0.3F, -0.51F, -0.42F, -0.3F, -0.42F, -0.4F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.25F); // Box 162

		gun_0_Model[2][158].addShapeBox(-4.55F, -5.55F, 1.25F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.25F, -0.3F, -0.42F, -0.38F, -0.3F, -0.53F, -0.42F, -0.3F, -0.53F, -0.42F, -0.3F, -0.42F, -0.38F); // Box 163

		gun_0_Model[2][159].addShapeBox(-4.55F, -5.7F, 1.25F, 1, 1, 1, 0F,-0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.25F); // Box 164

		gun_0_Model[2][160].addShapeBox(-4.05F, -5.85F, 1.25F, 1, 1, 1, 0F,-0.2F, -0.51F, -0.42F, -0.5F, -0.51F, -0.42F, -0.5F, -0.51F, -0.42F, -0.2F, -0.51F, -0.42F, -0.2F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F); // Box 165

		gun_0_Model[2][161].addShapeBox(-4.05F, -5.55F, 1.25F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.52F, -0.43F, -0.5F, -0.52F, -0.43F, -0.5F, -0.52F, -0.43F, -0.2F, -0.52F, -0.43F); // Box 166

		gun_0_Model[2][162].addShapeBox(-4.05F, -5.65F, 1.25F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, -0.2F, -0.5F, -0.35F); // Box 167

		gun_0_Model[2][163].addShapeBox(-3.8F, -5.85F, 1.25F, 1, 1, 1, 0F,-0.2F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.2F, -0.52F, -0.43F, -0.2F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.2F, -0.4F, -0.36F); // Box 168

		gun_0_Model[2][164].addShapeBox(-3.8F, -5.56F, 1.25F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.2F, -0.4F, -0.36F, -0.2F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.2F, -0.52F, -0.43F); // Box 169

		gun_0_Model[2][165].addShapeBox(-3.8F, -5.76F, 1.25F, 1, 1, 1, 0F,-0.2F, -0.51F, -0.36F, -0.4F, -0.51F, -0.36F, -0.4F, -0.51F, -0.36F, -0.2F, -0.51F, -0.36F, -0.2F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.2F, -0.4F, -0.36F); // Box 170

		gun_0_Model[2][166].addShapeBox(-3.4F, -5.85F, 1.25F, 1, 1, 1, 0F,-0.2F, -0.52F, -0.43F, -0.3F, -0.63F, -0.48F, -0.3F, -0.63F, -0.48F, -0.2F, -0.52F, -0.43F, -0.2F, -0.4F, -0.36F, -0.3F, -0.36F, -0.48F, -0.3F, -0.36F, -0.48F, -0.2F, -0.4F, -0.36F); // Box 171

		gun_0_Model[2][167].addShapeBox(-3.4F, -5.76F, 1.25F, 1, 1, 1, 0F,-0.2F, -0.51F, -0.36F, -0.3F, -0.55F, -0.48F, -0.3F, -0.55F, -0.48F, -0.2F, -0.51F, -0.36F, -0.2F, -0.4F, -0.36F, -0.3F, -0.44F, -0.48F, -0.3F, -0.44F, -0.48F, -0.2F, -0.4F, -0.36F); // Box 172

		gun_0_Model[2][168].addShapeBox(-3.4F, -5.56F, 1.25F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.36F, -0.3F, -0.36F, -0.48F, -0.3F, -0.36F, -0.48F, -0.2F, -0.4F, -0.36F, -0.2F, -0.52F, -0.43F, -0.3F, -0.63F, -0.48F, -0.3F, -0.63F, -0.48F, -0.2F, -0.52F, -0.43F); // Box 173

		gun_0_Model[2][169].addShapeBox(-5.85F, -6.3F, 0.95F, 1, 1, 1, 0F,0F, -0.4F, -0.38F, 0.6F, -0.42F, -0.4F, 0.6F, -0.42F, -0.4F, 0F, -0.4F, -0.38F, 0F, -0.4F, -0.23F, 0.6F, -0.4F, -0.25F, 0.6F, -0.4F, -0.25F, 0F, -0.4F, -0.23F); // Box 174

		gun_0_Model[2][170].addShapeBox(-5.85F, -6.15F, 0.95F, 1, 1, 1, 0F,0F, -0.45F, -0.23F, 0.6F, -0.45F, -0.25F, 0.6F, -0.45F, -0.25F, 0F, -0.45F, -0.23F, 0F, -0.45F, -0.23F, 0.6F, -0.45F, -0.25F, 0.6F, -0.45F, -0.25F, 0F, -0.45F, -0.23F); // Box 175

		gun_0_Model[2][171].addShapeBox(-5.85F, -6F, 0.95F, 1, 1, 1, 0F,0F, -0.4F, -0.23F, 0.6F, -0.4F, -0.25F, 0.6F, -0.4F, -0.25F, 0F, -0.4F, -0.23F, 0F, -0.4F, -0.38F, 0.6F, -0.42F, -0.4F, 0.6F, -0.42F, -0.4F, 0F, -0.4F, -0.38F); // Box 176

		gun_0_Model[2][172].addShapeBox(-4.55F, -6.3F, 0.95F, 1, 1, 1, 0F,-0.3F, -0.42F, -0.4F, -0.3F, -0.51F, -0.42F, -0.3F, -0.51F, -0.42F, -0.3F, -0.42F, -0.4F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.25F); // Box 177

		gun_0_Model[2][173].addShapeBox(-4.55F, -6F, 0.95F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.25F, -0.3F, -0.42F, -0.38F, -0.3F, -0.53F, -0.42F, -0.3F, -0.53F, -0.42F, -0.3F, -0.42F, -0.38F); // Box 178

		gun_0_Model[2][174].addShapeBox(-4.55F, -6.15F, 0.95F, 1, 1, 1, 0F,-0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.25F); // Box 179

		gun_0_Model[2][175].addShapeBox(-4.05F, -6.3F, 0.95F, 1, 1, 1, 0F,-0.2F, -0.51F, -0.42F, -0.5F, -0.51F, -0.42F, -0.5F, -0.51F, -0.42F, -0.2F, -0.51F, -0.42F, -0.2F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F); // Box 180

		gun_0_Model[2][176].addShapeBox(-4.05F, -6F, 0.95F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.52F, -0.43F, -0.5F, -0.52F, -0.43F, -0.5F, -0.52F, -0.43F, -0.2F, -0.52F, -0.43F); // Box 181

		gun_0_Model[2][177].addShapeBox(-4.05F, -6.1F, 0.95F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, -0.2F, -0.5F, -0.35F); // Box 182

		gun_0_Model[2][178].addShapeBox(-3.8F, -6.3F, 0.95F, 1, 1, 1, 0F,-0.2F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.2F, -0.52F, -0.43F, -0.2F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.2F, -0.4F, -0.36F); // Box 183

		gun_0_Model[2][179].addShapeBox(-3.8F, -6.01F, 0.95F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.2F, -0.4F, -0.36F, -0.2F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.2F, -0.52F, -0.43F); // Box 184

		gun_0_Model[2][180].addShapeBox(-3.8F, -6.21F, 0.95F, 1, 1, 1, 0F,-0.2F, -0.51F, -0.36F, -0.4F, -0.51F, -0.36F, -0.4F, -0.51F, -0.36F, -0.2F, -0.51F, -0.36F, -0.2F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.2F, -0.4F, -0.36F); // Box 185

		gun_0_Model[2][181].addShapeBox(-3.4F, -6.3F, 0.95F, 1, 1, 1, 0F,-0.2F, -0.52F, -0.43F, -0.3F, -0.63F, -0.48F, -0.3F, -0.63F, -0.48F, -0.2F, -0.52F, -0.43F, -0.2F, -0.4F, -0.36F, -0.3F, -0.36F, -0.48F, -0.3F, -0.36F, -0.48F, -0.2F, -0.4F, -0.36F); // Box 186

		gun_0_Model[2][182].addShapeBox(-3.4F, -6.21F, 0.95F, 1, 1, 1, 0F,-0.2F, -0.51F, -0.36F, -0.3F, -0.55F, -0.48F, -0.3F, -0.55F, -0.48F, -0.2F, -0.51F, -0.36F, -0.2F, -0.4F, -0.36F, -0.3F, -0.44F, -0.48F, -0.3F, -0.44F, -0.48F, -0.2F, -0.4F, -0.36F); // Box 187

		gun_0_Model[2][183].addShapeBox(-3.4F, -6.01F, 0.95F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.36F, -0.3F, -0.36F, -0.48F, -0.3F, -0.36F, -0.48F, -0.2F, -0.4F, -0.36F, -0.2F, -0.52F, -0.43F, -0.3F, -0.63F, -0.48F, -0.3F, -0.63F, -0.48F, -0.2F, -0.52F, -0.43F); // Box 188

		gun_0_Model[2][184].addShapeBox(-5.85F, -6.3F, 0.4F, 1, 1, 1, 0F,0F, -0.4F, -0.38F, 0.6F, -0.42F, -0.4F, 0.6F, -0.42F, -0.4F, 0F, -0.4F, -0.38F, 0F, -0.4F, -0.23F, 0.6F, -0.4F, -0.25F, 0.6F, -0.4F, -0.25F, 0F, -0.4F, -0.23F); // Box 189

		gun_0_Model[2][185].addShapeBox(-5.85F, -6.15F, 0.4F, 1, 1, 1, 0F,0F, -0.45F, -0.23F, 0.6F, -0.45F, -0.25F, 0.6F, -0.45F, -0.25F, 0F, -0.45F, -0.23F, 0F, -0.45F, -0.23F, 0.6F, -0.45F, -0.25F, 0.6F, -0.45F, -0.25F, 0F, -0.45F, -0.23F); // Box 190

		gun_0_Model[2][186].addShapeBox(-5.85F, -6F, 0.4F, 1, 1, 1, 0F,0F, -0.4F, -0.23F, 0.6F, -0.4F, -0.25F, 0.6F, -0.4F, -0.25F, 0F, -0.4F, -0.23F, 0F, -0.4F, -0.38F, 0.6F, -0.42F, -0.4F, 0.6F, -0.42F, -0.4F, 0F, -0.4F, -0.38F); // Box 191

		gun_0_Model[2][187].addShapeBox(-4.55F, -6.3F, 0.4F, 1, 1, 1, 0F,-0.3F, -0.42F, -0.4F, -0.3F, -0.51F, -0.42F, -0.3F, -0.51F, -0.42F, -0.3F, -0.42F, -0.4F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.25F); // Box 192

		gun_0_Model[2][188].addShapeBox(-4.55F, -6F, 0.4F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.25F, -0.3F, -0.42F, -0.38F, -0.3F, -0.53F, -0.42F, -0.3F, -0.53F, -0.42F, -0.3F, -0.42F, -0.38F); // Box 193

		gun_0_Model[2][189].addShapeBox(-4.55F, -6.15F, 0.4F, 1, 1, 1, 0F,-0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.25F); // Box 194

		gun_0_Model[2][190].addShapeBox(-4.05F, -6.3F, 0.4F, 1, 1, 1, 0F,-0.2F, -0.51F, -0.42F, -0.5F, -0.51F, -0.42F, -0.5F, -0.51F, -0.42F, -0.2F, -0.51F, -0.42F, -0.2F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F); // Box 195

		gun_0_Model[2][191].addShapeBox(-4.05F, -6F, 0.4F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.52F, -0.43F, -0.5F, -0.52F, -0.43F, -0.5F, -0.52F, -0.43F, -0.2F, -0.52F, -0.43F); // Box 196

		gun_0_Model[2][192].addShapeBox(-4.05F, -6.1F, 0.4F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, -0.2F, -0.5F, -0.35F); // Box 197

		gun_0_Model[2][193].addShapeBox(-3.8F, -6.3F, 0.4F, 1, 1, 1, 0F,-0.2F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.2F, -0.52F, -0.43F, -0.2F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.2F, -0.4F, -0.36F); // Box 198

		gun_0_Model[2][194].addShapeBox(-3.8F, -6.01F, 0.4F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.2F, -0.4F, -0.36F, -0.2F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.2F, -0.52F, -0.43F); // Box 199

		gun_0_Model[2][195].addShapeBox(-3.8F, -6.21F, 0.4F, 1, 1, 1, 0F,-0.2F, -0.51F, -0.36F, -0.4F, -0.51F, -0.36F, -0.4F, -0.51F, -0.36F, -0.2F, -0.51F, -0.36F, -0.2F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.2F, -0.4F, -0.36F); // Box 200

		gun_0_Model[2][196].addShapeBox(-3.4F, -6.3F, 0.4F, 1, 1, 1, 0F,-0.2F, -0.52F, -0.43F, -0.3F, -0.63F, -0.48F, -0.3F, -0.63F, -0.48F, -0.2F, -0.52F, -0.43F, -0.2F, -0.4F, -0.36F, -0.3F, -0.36F, -0.48F, -0.3F, -0.36F, -0.48F, -0.2F, -0.4F, -0.36F); // Box 201

		gun_0_Model[2][197].addShapeBox(-3.4F, -6.21F, 0.4F, 1, 1, 1, 0F,-0.2F, -0.51F, -0.36F, -0.3F, -0.55F, -0.48F, -0.3F, -0.55F, -0.48F, -0.2F, -0.51F, -0.36F, -0.2F, -0.4F, -0.36F, -0.3F, -0.44F, -0.48F, -0.3F, -0.44F, -0.48F, -0.2F, -0.4F, -0.36F); // Box 202

		gun_0_Model[2][198].addShapeBox(-3.4F, -6.01F, 0.4F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.36F, -0.3F, -0.36F, -0.48F, -0.3F, -0.36F, -0.48F, -0.2F, -0.4F, -0.36F, -0.2F, -0.52F, -0.43F, -0.3F, -0.63F, -0.48F, -0.3F, -0.63F, -0.48F, -0.2F, -0.52F, -0.43F); // Box 203

		gun_0_Model[2][199].addShapeBox(-5.85F, -6.3F, -0.1F, 1, 1, 1, 0F,0F, -0.4F, -0.38F, 0.6F, -0.42F, -0.4F, 0.6F, -0.42F, -0.4F, 0F, -0.4F, -0.38F, 0F, -0.4F, -0.23F, 0.6F, -0.4F, -0.25F, 0.6F, -0.4F, -0.25F, 0F, -0.4F, -0.23F); // Box 204

		gun_0_Model[2][200].addShapeBox(-5.85F, -6.15F, -0.1F, 1, 1, 1, 0F,0F, -0.45F, -0.23F, 0.6F, -0.45F, -0.25F, 0.6F, -0.45F, -0.25F, 0F, -0.45F, -0.23F, 0F, -0.45F, -0.23F, 0.6F, -0.45F, -0.25F, 0.6F, -0.45F, -0.25F, 0F, -0.45F, -0.23F); // Box 205

		gun_0_Model[2][201].addShapeBox(-5.85F, -6F, -0.1F, 1, 1, 1, 0F,0F, -0.4F, -0.23F, 0.6F, -0.4F, -0.25F, 0.6F, -0.4F, -0.25F, 0F, -0.4F, -0.23F, 0F, -0.4F, -0.38F, 0.6F, -0.42F, -0.4F, 0.6F, -0.42F, -0.4F, 0F, -0.4F, -0.38F); // Box 206

		gun_0_Model[2][202].addShapeBox(-4.55F, -6.3F, -0.1F, 1, 1, 1, 0F,-0.3F, -0.42F, -0.4F, -0.3F, -0.51F, -0.42F, -0.3F, -0.51F, -0.42F, -0.3F, -0.42F, -0.4F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.25F); // Box 207

		gun_0_Model[2][203].addShapeBox(-4.55F, -6F, -0.1F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.25F, -0.3F, -0.42F, -0.38F, -0.3F, -0.53F, -0.42F, -0.3F, -0.53F, -0.42F, -0.3F, -0.42F, -0.38F); // Box 208

		gun_0_Model[2][204].addShapeBox(-4.55F, -6.15F, -0.1F, 1, 1, 1, 0F,-0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.25F); // Box 209

		gun_0_Model[2][205].addShapeBox(-4.05F, -6.3F, -0.1F, 1, 1, 1, 0F,-0.2F, -0.51F, -0.42F, -0.5F, -0.51F, -0.42F, -0.5F, -0.51F, -0.42F, -0.2F, -0.51F, -0.42F, -0.2F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F); // Box 210

		gun_0_Model[2][206].addShapeBox(-4.05F, -6F, -0.1F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.52F, -0.43F, -0.5F, -0.52F, -0.43F, -0.5F, -0.52F, -0.43F, -0.2F, -0.52F, -0.43F); // Box 211

		gun_0_Model[2][207].addShapeBox(-4.05F, -6.1F, -0.1F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, -0.2F, -0.5F, -0.35F); // Box 212

		gun_0_Model[2][208].addShapeBox(-3.8F, -6.3F, -0.1F, 1, 1, 1, 0F,-0.2F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.2F, -0.52F, -0.43F, -0.2F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.2F, -0.4F, -0.36F); // Box 213

		gun_0_Model[2][209].addShapeBox(-3.8F, -6.01F, -0.1F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.2F, -0.4F, -0.36F, -0.2F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.2F, -0.52F, -0.43F); // Box 214

		gun_0_Model[2][210].addShapeBox(-3.8F, -6.21F, -0.1F, 1, 1, 1, 0F,-0.2F, -0.51F, -0.36F, -0.4F, -0.51F, -0.36F, -0.4F, -0.51F, -0.36F, -0.2F, -0.51F, -0.36F, -0.2F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.2F, -0.4F, -0.36F); // Box 215

		gun_0_Model[2][211].addShapeBox(-3.4F, -6.3F, -0.1F, 1, 1, 1, 0F,-0.2F, -0.52F, -0.43F, -0.3F, -0.63F, -0.48F, -0.3F, -0.63F, -0.48F, -0.2F, -0.52F, -0.43F, -0.2F, -0.4F, -0.36F, -0.3F, -0.36F, -0.48F, -0.3F, -0.36F, -0.48F, -0.2F, -0.4F, -0.36F); // Box 216

		gun_0_Model[2][212].addShapeBox(-3.4F, -6.21F, -0.1F, 1, 1, 1, 0F,-0.2F, -0.51F, -0.36F, -0.3F, -0.55F, -0.48F, -0.3F, -0.55F, -0.48F, -0.2F, -0.51F, -0.36F, -0.2F, -0.4F, -0.36F, -0.3F, -0.44F, -0.48F, -0.3F, -0.44F, -0.48F, -0.2F, -0.4F, -0.36F); // Box 217

		gun_0_Model[2][213].addShapeBox(-3.4F, -6.01F, -0.1F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.36F, -0.3F, -0.36F, -0.48F, -0.3F, -0.36F, -0.48F, -0.2F, -0.4F, -0.36F, -0.2F, -0.52F, -0.43F, -0.3F, -0.63F, -0.48F, -0.3F, -0.63F, -0.48F, -0.2F, -0.52F, -0.43F); // Box 218

		gun_0_Model[2][214].addShapeBox(-5.35F, -4F, 0F, 1, 1, 2, 0F,0.3F, -0.35F, -0.35F, 0.3F, -0.35F, -0.35F, 0.3F, -0.35F, -0.35F, 0.3F, -0.35F, -0.35F, 0.3F, -0.35F, -0.35F, 0.3F, -0.35F, -0.35F, 0.3F, -0.35F, -0.35F, 0.3F, -0.35F, -0.35F); // Box 219

		gun_0_Model[2][215].addShapeBox(13.4F, -6.4F, -0.5F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.15F, 0F, -0.1F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F); // Box 220

		gun_0_Model[2][216].addShapeBox(13.4F, -7.4F, -0.5F, 1, 1, 1, 0F,-0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 221

		gun_0_Model[2][217].addShapeBox(13.4F, -7.75F, -0.25F, 1, 1, 1, 0F,-0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F); // Box 222

		gun_0_Model[2][218].addShapeBox(13.4F, -7.75F, -0.75F, 1, 1, 1, 0F,-0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F); // Box 223

		gun_0_Model[2][219].addShapeBox(13.4F, -8F, -0.25F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F); // Box 224

		gun_0_Model[2][220].addShapeBox(13.4F, -8F, -0.75F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.5F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F); // Box 225

		gun_0_Model[2][221].addShapeBox(13.4F, -7.8F, -0.5F, 1, 1, 1, 0F,-0.35F, -0.35F, -0.5F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F); // Box 226

		gun_0_Model[2][222].addShapeBox(-2.5F, -3.4F, -0.5F, 1, 1, 1, 0F,-0.15F, -0.25F, 0.2F, -0.15F, -0.25F, 0.2F, -0.15F, -0.25F, 0.2F, -0.15F, -0.25F, 0.2F, -0.15F, -0.25F, 0.2F, -0.15F, -0.25F, 0.2F, -0.15F, -0.25F, 0.2F, -0.15F, -0.25F, 0.2F); // Box 229

		gun_0_Model[2][223].addShapeBox(-2.5F, -2.95F, -0.5F, 1, 1, 1, 0F,-0.15F, -0.3F, 0.2F, -0.15F, -0.3F, 0.2F, -0.15F, -0.3F, 0.2F, -0.15F, -0.3F, 0.2F, -0.35F, -0.4F, 0.2F, -0.35F, -0.4F, 0.2F, -0.35F, -0.4F, 0.2F, -0.35F, -0.4F, 0.2F); // Box 232

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_0_Model[2])
		{
			gunPart.setRotationPoint(-2F, -36F, -14F);
		}


		registerGunModel("PassengerGun0", gun_0_Model);
	}
}