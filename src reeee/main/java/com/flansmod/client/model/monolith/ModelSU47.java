//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.4.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSU47 extends ModelPlane //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSU47() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[65];
		tailModel = new ModelRendererTurbo[13];
		leftWingModel = new ModelRendererTurbo[3];
		rightWingModel = new ModelRendererTurbo[3];
		pitchFlapLeftModel = new ModelRendererTurbo[6];
		pitchFlapRightModel = new ModelRendererTurbo[7];
		pitchFlapLeftWingModel = new ModelRendererTurbo[1];
		bodyWheelModel = new ModelRendererTurbo[27];
		hudModel = new ModelRendererTurbo[1];

		initbodyModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		initpitchFlapLeftModel_1();
		initpitchFlapRightModel_1();
		initpitchFlapLeftWingModel_1();
		initbodyWheelModel_1();
		inithudModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 20
		bodyModel[19] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 21
		bodyModel[20] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 22
		bodyModel[21] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 23
		bodyModel[22] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 24
		bodyModel[23] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 25
		bodyModel[24] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 26
		bodyModel[25] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 27
		bodyModel[26] = new ModelRendererTurbo(this, 361, 97, textureX, textureY); // Box 28
		bodyModel[27] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 29
		bodyModel[28] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 30
		bodyModel[29] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 39
		bodyModel[30] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Box 40
		bodyModel[31] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Box 42
		bodyModel[32] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 45
		bodyModel[33] = new ModelRendererTurbo(this, 297, 105, textureX, textureY); // Box 46
		bodyModel[34] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 47
		bodyModel[35] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 48
		bodyModel[36] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 38
		bodyModel[37] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 39
		bodyModel[38] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 40
		bodyModel[39] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 41
		bodyModel[40] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 42
		bodyModel[41] = new ModelRendererTurbo(this, 129, 153, textureX, textureY); // Box 52
		bodyModel[42] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 65
		bodyModel[43] = new ModelRendererTurbo(this, 81, 201, textureX, textureY); // Box 66
		bodyModel[44] = new ModelRendererTurbo(this, 169, 201, textureX, textureY); // Box 67
		bodyModel[45] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 79
		bodyModel[46] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 107
		bodyModel[47] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 108
		bodyModel[48] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 109
		bodyModel[49] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 110
		bodyModel[50] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 111
		bodyModel[51] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 112
		bodyModel[52] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 114
		bodyModel[53] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 115
		bodyModel[54] = new ModelRendererTurbo(this, 313, 217, textureX, textureY); // Box 117
		bodyModel[55] = new ModelRendererTurbo(this, 457, 217, textureX, textureY); // Box 118
		bodyModel[56] = new ModelRendererTurbo(this, 361, 225, textureX, textureY); // Box 119
		bodyModel[57] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 120
		bodyModel[58] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 121
		bodyModel[59] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 122
		bodyModel[60] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 123
		bodyModel[61] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 124
		bodyModel[62] = new ModelRendererTurbo(this, 185, 161, textureX, textureY); // Box 125
		bodyModel[63] = new ModelRendererTurbo(this, 257, 201, textureX, textureY); // Box 126
		bodyModel[64] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 132

		bodyModel[0].addShapeBox(0F, 0F, 0F, 42, 17, 13, 0F,0F, 1F, 0F, 0F, -2F, 0F, 0F, -5F, 7F, 0F, -3F, 7F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, -2F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-22F, -22F, 0F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 42, 17, 13, 0F,0F, -3F, 7F, 0F, -5F, 7F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, -1F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-22F, -22F, -13F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 19, 6, 20, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.15F, 0F, 0F, -1.15F); // Box 2
		bodyModel[2].setRotationPoint(-41F, -23F, 0F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 19, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.15F, 0F, 0F, -1.15F, 0F, 0.5F, 4F, 0F, 2F, 4F, 0F, 2F, -7F, 0F, 0F, -6F); // Box 3
		bodyModel[3].setRotationPoint(-41F, -17F, 16F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 19, 6, 20, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -1.15F, 0F, 0F, -1.15F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-41F, -23F, -20F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 19, 8, 4, 0F,0F, 0F, -1.15F, 0F, 0F, -1.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 2F, -7F, 0F, 2F, 4F, 0F, 0.5F, 4F); // Box 5
		bodyModel[5].setRotationPoint(-41F, -17F, -20F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 19, 7, 13, 0F,0F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0.5F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -3.5F, -1F); // Box 6
		bodyModel[6].setRotationPoint(-41F, -12F, 0F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 19, 7, 13, 0F,0F, -2F, 0.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -3.5F, -1F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F); // Box 8
		bodyModel[7].setRotationPoint(-41F, -12F, -13F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 21, 6, 15, 0F,2F, -3F, -2F, 0F, 1F, 5F, 0F, -4F, 0F, -21F, -4F, 0F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, -1.15F, -21F, 0F, -1.15F); // Box 9
		bodyModel[8].setRotationPoint(-62F, -23F, 5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 21, 6, 15, 0F,-21F, -4F, 0F, 0F, -4F, 0F, 0F, 1F, 5F, 2F, -3F, -2F, -21F, 0F, -1.15F, 0F, 0F, -1.15F, 0F, 0F, 0F, 0F, -1F, -3F); // Box 10
		bodyModel[9].setRotationPoint(-62F, -23F, -20F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 42, 8, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 2F, -2F, 0F, 2F, -2F); // Box 11
		bodyModel[10].setRotationPoint(-70F, -18F, 0F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 42, 8, 9, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 12
		bodyModel[11].setRotationPoint(-70F, -18F, -9F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 26, 8, 9, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2.5F, 0F, 3F, 0F, 0F, 4F, 0F, 0F, 2F, -2F, 0F, 2F, -5F); // Box 13
		bodyModel[12].setRotationPoint(-96F, -18F, 0F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 26, 8, 9, 0F,0F, -4F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 2F, -5F, 0F, 2F, -2F, 0F, 4F, 0F, 0F, 3F, 0F); // Box 14
		bodyModel[13].setRotationPoint(-96F, -18F, -9F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 10, 6, 7, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -2.5F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, -3F, 0F, 0F, -4.5F); // Box 15
		bodyModel[14].setRotationPoint(-106F, -14F, 0F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 10, 6, 7, 0F,0F, -1F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -4.5F, 0F, 0F, -3F, 0F, 1F, 0F, 0F, 0.5F, 0F); // Box 16
		bodyModel[15].setRotationPoint(-106F, -14F, -7F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 14, 5, 4, 0F,-3F, -2F, -1.8F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2F, 0F, -6F, -1F, -2F, 0F, 0F, -1.5F, 0F, 0.5F, 0F, 0F, -3F, 0F); // Box 17
		bodyModel[16].setRotationPoint(-120F, -13F, -4F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 14, 4, 4, 0F,-3F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -4.75F, -2.5F, -3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -3F, 2F, -1.8F); // Box 18
		bodyModel[17].setRotationPoint(-120F, -17F, 0F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 10, 3, 6, 0F,0F, 0F, 0F, 0F, 2.7F, 0F, 0F, 0F, -0.5F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, -1.5F); // Box 20
		bodyModel[18].setRotationPoint(-106F, -17F, 0F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 10, 3, 6, 0F,0F, -2F, -2F, 0F, 0F, -0.5F, 0F, 2.7F, 0F, 0F, 0F, 0F, 0F, 1F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[19].setRotationPoint(-106F, -17F, -6F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 26, 6, 9, 0F,0F, -7F, -3.5F, 0F, -2.5F, -3F, 0F, -1.5F, -4F, 0F, -4.3F, 0F, 0F, 4F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 22
		bodyModel[20].setRotationPoint(-96F, -24F, -9F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 26, 6, 9, 0F,0F, -4.3F, 0F, 0F, -1.5F, -4F, 0F, -2.5F, -3F, 0F, -7F, -3.5F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -2.5F); // Box 23
		bodyModel[21].setRotationPoint(-96F, -24F, 0F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 46, 17, 13, 0F,0F, -3F, 7F, 0F, -7F, 4F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 24
		bodyModel[22].setRotationPoint(20F, -20F, -13F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 46, 17, 13, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -7F, 4F, 0F, -3F, 7F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F); // Box 25
		bodyModel[23].setRotationPoint(20F, -20F, 0F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 16, 14, 13, 0F,0F, -1F, 0F, 0F, -2.5F, 0F, 0F, -3F, 3F, 0F, -2F, 4F, 0F, -2F, 0F, 0F, -2.5F, 0F, 0F, -3F, -1F, 0F, -2F, -1F); // Box 26
		bodyModel[24].setRotationPoint(66F, -15F, 0F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 16, 14, 13, 0F,0F, -2F, 4F, 0F, -3F, 3F, 0F, -2.5F, 0F, 0F, -1F, 0F, 0F, -2F, -1F, 0F, -3F, -1F, 0F, -2.5F, 0F, 0F, -2F, 0F); // Box 27
		bodyModel[25].setRotationPoint(66F, -15F, -13F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 62, 6, 10, 0F,0F, 0F, 0F, 0F, -5F, 4F, 0F, -5.5F, 0F, 0F, -2F, 0F, 0F, 0F, 4F, 0F, 1.5F, 6F, 0F, 0.8F, 0F, 0F, -2F, 0F); // Box 28
		bodyModel[26].setRotationPoint(20F, -17F, 20F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 62, 6, 10, 0F,0F, -2F, 0F, 0F, -5.5F, 0F, 0F, -5F, 4F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.8F, 0F, 0F, 1.5F, 6F, 0F, 0F, 4F); // Box 29
		bodyModel[27].setRotationPoint(20F, -17F, -30F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 30, 6, 10, 0F,0F, 1F, 3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, -13F, 0F, -3F, 3F, 0F, 0F, 4F, 0F, -2F, 0F, 0F, -3F, -13F); // Box 30
		bodyModel[28].setRotationPoint(-10F, -17F, 20F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 62, 8, 13, 0F,0F, -1.5F, 0F, 0F, -3.5F, -3F, 0F, -3.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[29].setRotationPoint(20F, -19F, -14F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 62, 8, 13, 0F,0F, 0F, 0F, 0F, -3.5F, -3F, 0F, -3.5F, -3F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[30].setRotationPoint(20F, -19F, 1F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 30, 6, 10, 0F,0F, 1F, -13F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 3F, 0F, -3F, -13F, 0F, -2F, 0F, 0F, 0F, 4F, 0F, -3F, 3F); // Box 42
		bodyModel[31].setRotationPoint(-10F, -17F, -30F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 14, 5, 4, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -3F, -2F, -1.8F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1.5F, -6F, -1F, -2F); // Box 45
		bodyModel[32].setRotationPoint(-120F, -13F, 0F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 14, 4, 4, 0F,-3F, -4.75F, -2.5F, 0F, -2F, 0F, 0F, 0F, 0F, -3F, -4F, 0F, -3F, 2F, -1.8F, 0F, 0F, 0.5F, 0F, 0F, 0F, -3F, 2F, 0F); // Box 46
		bodyModel[33].setRotationPoint(-120F, -17F, -4F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -2F); // Box 47
		bodyModel[34].setRotationPoint(-120F, -13F, 0F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -2F, -2F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[35].setRotationPoint(-120F, -13F, -2F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 26, 6, 4, 0F,-0.02F, 0.72F, 0F, 0F, 3.5F, 4F, 0F, 3.5F, 0F, -0.02F, 0.72F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[36].setRotationPoint(-96F, -19F, 0F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 39
		bodyModel[37].setRotationPoint(-131F, -11.5F, -0.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.3F, -0.3F); // Box 40
		bodyModel[38].setRotationPoint(-133F, -11.5F, -0.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 41
		bodyModel[39].setRotationPoint(-138F, -11.5F, -0.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.5F, -0.5F); // Box 42
		bodyModel[40].setRotationPoint(-141F, -11.5F, -0.5F);

		bodyModel[41].addShapeBox(-17F, 0F, -18F, 17, 1, 19, 0F,-19.5F, 0F, 0.5F, 10F, 0F, -2F, 0F, 0F, 0F, 3F, 0F, 0F, -19.5F, 0F, 0.5F, 10F, 0F, -2F, 0F, 0F, 0F, 3F, 0F, 0F); // Box 52
		bodyModel[41].setRotationPoint(-19F, -16F, -18F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 33, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[42].setRotationPoint(56F, -12.5F, -30F);
		bodyModel[42].rotateAngleZ = -0.04886922F;

		bodyModel[43].addShapeBox(0F, 0F, 0F, 33, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 0F); // Box 66
		bodyModel[43].setRotationPoint(56F, -12.5F, 21F);
		bodyModel[43].rotateAngleZ = -0.04886922F;

		bodyModel[44].addShapeBox(0F, 0F, 0F, 33, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 0F); // Box 67
		bodyModel[44].setRotationPoint(56F, -12.5F, 21F);
		bodyModel[44].rotateAngleZ = -0.04886922F;

		bodyModel[45].addShapeBox(0F, 0F, 0F, 5, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, 0F); // Box 79
		bodyModel[45].setRotationPoint(82F, -12F, -1F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[46].setRotationPoint(-74F, -28F, -1F);
		bodyModel[46].rotateAngleZ = 0.31415927F;

		bodyModel[47].addShapeBox(0F, 0F, 2F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 108
		bodyModel[47].setRotationPoint(-74F, -28F, -1F);
		bodyModel[47].rotateAngleZ = 0.31415927F;

		bodyModel[48].addShapeBox(0F, 1F, 4F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 3F, -1.5F, 0F, 3F, -1.5F); // Box 109
		bodyModel[48].setRotationPoint(-74F, -28F, -1F);
		bodyModel[48].rotateAngleZ = 0.31415927F;

		bodyModel[49].addShapeBox(0F, 5F, 4F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 110
		bodyModel[49].setRotationPoint(-74F, -28F, -1F);
		bodyModel[49].rotateAngleZ = 0.31415927F;

		bodyModel[50].addShapeBox(0F, 0F, -2F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[50].setRotationPoint(-74F, -28F, -1F);
		bodyModel[50].rotateAngleZ = 0.31415927F;

		bodyModel[51].addShapeBox(0F, 1F, -4F, 1, 1, 2, 0F,0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1.5F, 0F, 3F, -1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 112
		bodyModel[51].setRotationPoint(-74F, -28F, -1F);
		bodyModel[51].rotateAngleZ = 0.31415927F;

		bodyModel[52].addBox(0F, 0F, 0F, 2, 8, 4, 0F); // Box 114
		bodyModel[52].setRotationPoint(-62F, -25F, -2F);
		bodyModel[52].rotateAngleZ = -0.33161256F;

		bodyModel[53].addShapeBox(0F, -2F, 0F, 2, 2, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[53].setRotationPoint(-62F, -25F, -1F);
		bodyModel[53].rotateAngleZ = -0.33161256F;

		bodyModel[54].addShapeBox(0F, 0F, 0F, 17, 6, 9, 0F,0F, -1.5F, -4F, 0F, 0.7F, 0F, 0F, -1.5F, -3F, 0F, -2.5F, -3F, 0F, 0F, -4F, 0F, 4F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0F); // Box 117
		bodyModel[54].setRotationPoint(-70F, -24F, 0F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 17, 6, 9, 0F,0F, -2.5F, -3F, 0F, -1.5F, -3F, 0F, 0.7F, 0F, 0F, -1.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 4F, 0F, 0F, 0F, -4F); // Box 118
		bodyModel[55].setRotationPoint(-70F, -24F, -9F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 17, 6, 9, 0F,0F, 0.7F, 0F, 2F, -0.5F, 0F, 0F, -2.5F, -3F, 0F, -1.5F, -3F, 0F, 4F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0.8F); // Box 119
		bodyModel[56].setRotationPoint(-53F, -24F, 0F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 17, 6, 9, 0F,0F, -1.5F, -3F, 0F, -2.5F, -3F, 2F, -0.5F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 4F, 0F); // Box 120
		bodyModel[57].setRotationPoint(-53F, -24F, -9F);

		bodyModel[58].addShapeBox(0F, 5F, -3F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[58].setRotationPoint(-74F, -28F, -1F);
		bodyModel[58].rotateAngleZ = 0.31415927F;

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F); // Box 122
		bodyModel[59].setRotationPoint(-72F, -25F, -2F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[60].setRotationPoint(-72F, -23.5F, -3F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,1F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1.5F, -1F, 1F, 0.5F, -1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 1F, 0.5F, -1F); // Box 124
		bodyModel[61].setRotationPoint(-74F, -25F, -2F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,-3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, 4F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 1F, -3F); // Box 125
		bodyModel[62].setRotationPoint(-78F, -23.5F, -3F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 52, 52, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -50F, -0.4F, 0F, -50F, -0.4F, -50F, 0F, -0.4F, -50F, 0F, -0.4F, -50F, -50F, -0.4F, -50F, -50F); // Box 126
		bodyModel[63].setRotationPoint(-71.5F, -27F, -1F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[64].setRotationPoint(-68F, -23.5F, -0.5F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 465, 137, textureX, textureY); // Box 47
		tailModel[1] = new ModelRendererTurbo(this, 481, 137, textureX, textureY); // Box 50
		tailModel[2] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 56
		tailModel[3] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Box 57
		tailModel[4] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 58
		tailModel[5] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 59
		tailModel[6] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 60
		tailModel[7] = new ModelRendererTurbo(this, 345, 169, textureX, textureY); // Box 61
		tailModel[8] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 62
		tailModel[9] = new ModelRendererTurbo(this, 289, 145, textureX, textureY); // Box 63
		tailModel[10] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 64
		tailModel[11] = new ModelRendererTurbo(this, 145, 233, textureX, textureY); // Box 130
		tailModel[12] = new ModelRendererTurbo(this, 273, 321, textureX, textureY); // Box 131

		tailModel[0].addShapeBox(0F, 0F, 0F, 5, 33, 1, 0F,0F, 0F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 37F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 37F, -2F, 0F); // Box 47
		tailModel[0].setRotationPoint(78F, -43.5F, 30.3F);
		tailModel[0].rotateAngleX = -0.14835299F;

		tailModel[1].addShapeBox(0F, 0F, 0F, 5, 33, 1, 0F,0F, 0F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 37F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 37F, -2F, 0F); // Box 50
		tailModel[1].setRotationPoint(78F, -43.5F, -31.3F);
		tailModel[1].rotateAngleX = 0.14835299F;

		tailModel[2].addShapeBox(0F, 0F, 0F, 10, 4, 4, 0F,0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 56
		tailModel[2].setRotationPoint(82F, -12.9F, -20.3F);
		tailModel[2].rotateAngleZ = -0.01745329F;

		tailModel[3].addShapeBox(-16F, 0F, 0F, 16, 4, 4, 0F,0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F); // Box 57
		tailModel[3].setRotationPoint(82F, -12.9F, -20.3F);
		tailModel[3].rotateAngleZ = -0.01745329F;

		tailModel[4].addShapeBox(-25F, 0F, 0F, 9, 4, 4, 0F,0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 4F, -1.7F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1.7F, -0.8F); // Box 58
		tailModel[4].setRotationPoint(82F, -12.9F, -20.3F);
		tailModel[4].rotateAngleZ = -0.01745329F;

		tailModel[5].addShapeBox(10F, 0F, 0F, 10, 4, 4, 0F,0F, 0.2F, 0.2F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0.2F, 0.2F); // Box 59
		tailModel[5].setRotationPoint(82F, -12.9F, -20.3F);
		tailModel[5].rotateAngleZ = -0.01745329F;

		tailModel[6].addShapeBox(20F, 0F, 0F, 4, 4, 4, 0F,0F, -0.6F, -0.6F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -0.6F, -0.6F); // Box 60
		tailModel[6].setRotationPoint(82F, -12.9F, -20.3F);
		tailModel[6].rotateAngleZ = -0.01745329F;

		tailModel[7].addShapeBox(-16F, 0F, 0F, 16, 4, 4, 0F,0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F); // Box 61
		tailModel[7].setRotationPoint(82F, -12.9F, 16.3F);
		tailModel[7].rotateAngleZ = -0.01745329F;

		tailModel[8].addShapeBox(-25F, 0F, 0F, 9, 4, 4, 0F,0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 4F, -1.7F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1.7F, -0.8F); // Box 62
		tailModel[8].setRotationPoint(82F, -12.9F, 16.3F);
		tailModel[8].rotateAngleZ = -0.01745329F;

		tailModel[9].addShapeBox(0F, 0F, 0F, 10, 4, 4, 0F,0F, 0.2F, 0.2F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.1F, 0F, 0.2F, 0.2F); // Box 63
		tailModel[9].setRotationPoint(82F, -12.9F, 16.3F);
		tailModel[9].rotateAngleZ = -0.01745329F;

		tailModel[10].addShapeBox(10F, 0F, 0F, 5, 4, 4, 0F,0F, 0.1F, 0.1F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0.1F, 0.1F); // Box 64
		tailModel[10].setRotationPoint(82F, -12.9F, 16.3F);
		tailModel[10].rotateAngleZ = -0.01745329F;

		tailModel[11].addShapeBox(-10F, 12F, 0F, 40, 40, 1, 0F,0F, 0F, 0.2F, -30F, 0F, 0.2F, -30F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -30F, 0.2F, -30F, -30F, 0.2F, -30F, -30F, 0.2F, 0F, -30F, 0.2F); // Box 130
		tailModel[11].setRotationPoint(78F, -43.5F, -31.3F);
		tailModel[11].rotateAngleX = 0.14835299F;

		tailModel[12].addShapeBox(-10F, 12F, 0F, 40, 40, 1, 0F,0F, 0F, 0.2F, -30F, 0F, 0.2F, -30F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -30F, 0.2F, -30F, -30F, 0.2F, -30F, -30F, 0.2F, 0F, -30F, 0.2F); // Box 131
		tailModel[12].setRotationPoint(78F, -43.5F, 30.3F);
		tailModel[12].rotateAngleX = -0.14835299F;
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Box 43
		leftWingModel[1] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 43
		leftWingModel[2] = new ModelRendererTurbo(this, 329, 273, textureX, textureY); // Box 128

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 32, 6, 56, 0F,18.5F, -0.25F, 0F, -36F, -0.8F, -3F, 2F, -1.7F, 0F, -1F, 0F, 0F, 18.5F, -5.25F, 0F, -36F, -5F, -3F, 2F, -3F, 0F, -1F, -4.5F, 0F); // Box 43
		leftWingModel[0].setRotationPoint(15F, -15F, -83F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 5, 1, 18, 0F,0F, 0F, 0F, 1F, -0.4F, -2.5F, 15F, -0.4F, 0F, -12.9F, -0.35F, 0F, 0F, -0.8F, 0F, 1F, -0.1F, -2.5F, 15F, -0.1F, 0F, -12.9F, -0.05F, 0F); // Box 43
		leftWingModel[1].setRotationPoint(11F, -14.25F, -80F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 40, 2, 40, 0F,0F, -0.2F, 0F, -30F, -0.6F, 0F, -30F, -0.5F, -30F, 0F, 0F, -30F, 0F, -0.5F, 0F, -30F, -0.2F, 0F, -30F, -0.1F, -30F, 0F, -0.5F, -30F); // Box 128
		leftWingModel[2].setRotationPoint(9F, -15F, -66F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 41
		rightWingModel[1] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 45
		rightWingModel[2] = new ModelRendererTurbo(this, 329, 273, textureX, textureY); // Box 129

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 32, 6, 56, 0F,-1F, 0F, 0F, 2F, -1.7F, 0F, -36F, -0.8F, -3F, 18.5F, -0.25F, 0F, -1F, -4.5F, 0F, 2F, -3F, 0F, -36F, -5F, -3F, 18.5F, -5.25F, 0F); // Box 41
		rightWingModel[0].setRotationPoint(15F, -15F, 27F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 5, 1, 18, 0F,-12.9F, -0.35F, 0F, 15F, -0.4F, 0F, 1F, -0.4F, -2.5F, 0F, 0F, 0F, -12.9F, -0.05F, 0F, 15F, -0.1F, 0F, 1F, -0.1F, -2.5F, 0F, -0.8F, 0F); // Box 45
		rightWingModel[1].setRotationPoint(11F, -14.25F, 62F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 40, 2, 40, 0F,0F, 0F, -30F, -30F, -0.5F, -30F, -30F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, -30F, -30F, -0.1F, -30F, -30F, -0.2F, 0F, 0F, -0.5F, 0F); // Box 129
		rightWingModel[2].setRotationPoint(9F, -15F, 26F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 361, 185, textureX, textureY); // Box 54
		pitchFlapLeftModel[1] = new ModelRendererTurbo(this, 417, 185, textureX, textureY); // Box 55
		pitchFlapLeftModel[2] = new ModelRendererTurbo(this, 457, 193, textureX, textureY); // Box 69
		pitchFlapLeftModel[3] = new ModelRendererTurbo(this, 417, 209, textureX, textureY); // Box 76
		pitchFlapLeftModel[4] = new ModelRendererTurbo(this, 41, 217, textureX, textureY); // Box 77
		pitchFlapLeftModel[5] = new ModelRendererTurbo(this, 89, 217, textureX, textureY); // Box 78

		pitchFlapLeftModel[0].addShapeBox(-17F, 0F, 0F, 17, 1, 19, 0F,3F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, -2F, -19.5F, 0F, 0.5F, 3F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, -2F, -19.5F, 0F, 0.5F); // Box 54
		pitchFlapLeftModel[0].setRotationPoint(-19F, -16F, 17F);

		pitchFlapLeftModel[1].addShapeBox(0F, 0F, -2F, 10, 1, 17, 0F,0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // Box 55
		pitchFlapLeftModel[1].setRotationPoint(-19.02F, -16F, 19F);

		pitchFlapLeftModel[2].addShapeBox(0F, -0.5F, 0F, 9, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 69
		pitchFlapLeftModel[2].setRotationPoint(89F, -10.4F, -39F);
		pitchFlapLeftModel[2].rotateAngleZ = -0.04886922F;

		pitchFlapLeftModel[3].addShapeBox(-2F, -5F, -5F, 11, 3, 10, 0F,0F, 0.8F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0.8F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 76
		pitchFlapLeftModel[3].setRotationPoint(82F, -9.5F, -7.5F);

		pitchFlapLeftModel[4].addShapeBox(-2F, -2F, -5F, 11, 4, 10, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 77
		pitchFlapLeftModel[4].setRotationPoint(82F, -9.5F, -7.5F);

		pitchFlapLeftModel[5].addShapeBox(-2F, 2F, -5F, 11, 3, 10, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0.5F, -2F); // Box 78
		pitchFlapLeftModel[5].setRotationPoint(82F, -9.5F, -7.5F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 289, 145, textureX, textureY); // Box 46
		pitchFlapRightModel[1] = new ModelRendererTurbo(this, 345, 145, textureX, textureY); // Box 51
		pitchFlapRightModel[2] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 53
		pitchFlapRightModel[3] = new ModelRendererTurbo(this, 321, 193, textureX, textureY); // Box 68
		pitchFlapRightModel[4] = new ModelRendererTurbo(this, 257, 201, textureX, textureY); // Box 70
		pitchFlapRightModel[5] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 71
		pitchFlapRightModel[6] = new ModelRendererTurbo(this, 369, 209, textureX, textureY); // Box 72

		pitchFlapRightModel[0].addShapeBox(0F, -0.5F, -39F, 5, 1, 39, 0F,-0.4F, -0.6F, 0.4F, 2F, -1.7F, 3.2F, 0.65F, -0.15F, -4.1F, 0F, -0.1F, 0F, -0.4F, 0.8F, 0.4F, 2F, 1F, 3.2F, 0.65F, -0.35F, -4.1F, 0F, -0.35F, 0F); // Box 46
		pitchFlapRightModel[0].setRotationPoint(24F, -13.5F, 62F);
		pitchFlapRightModel[0].rotateAngleY = 0.60213859F;

		pitchFlapRightModel[1].addShapeBox(-17F, 0F, -18F, 17, 1, 19, 0F,-19.5F, 0F, 0.5F, 10F, 0F, -2F, 0F, 0F, 0F, 3F, 0F, 0F, -19.5F, 0F, 0.5F, 10F, 0F, -2F, 0F, 0F, 0F, 3F, 0F, 0F); // Box 51
		pitchFlapRightModel[1].setRotationPoint(-19F, -16F, -18F);

		pitchFlapRightModel[2].addShapeBox(0F, 0F, -16F, 10, 1, 17, 0F,-10F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F); // Box 53
		pitchFlapRightModel[2].setRotationPoint(-19.02F, -16F, -18F);

		pitchFlapRightModel[3].addShapeBox(0F, -0.5F, 0F, 9, 1, 18, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 68
		pitchFlapRightModel[3].setRotationPoint(89F, -10.4F, 21F);
		pitchFlapRightModel[3].rotateAngleZ = -0.04886922F;

		pitchFlapRightModel[4].addShapeBox(-2F, -5F, -5F, 11, 3, 10, 0F,0F, 0.8F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0.8F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 70
		pitchFlapRightModel[4].setRotationPoint(82F, -9.5F, 7.5F);

		pitchFlapRightModel[5].addShapeBox(-2F, -2F, -5F, 11, 4, 10, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 71
		pitchFlapRightModel[5].setRotationPoint(82F, -9.5F, 7.5F);

		pitchFlapRightModel[6].addShapeBox(-2F, 2F, -5F, 11, 3, 10, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0.5F, -2F); // Box 72
		pitchFlapRightModel[6].setRotationPoint(82F, -9.5F, 7.5F);
	}

	private void initpitchFlapLeftWingModel_1()
	{
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 409, 137, textureX, textureY); // Box 44

		pitchFlapLeftWingModel[0].addShapeBox(0F, -0.5F, 0F, 5, 1, 39, 0F,0F, -0.1F, 0F, 0.65F, -0.15F, -4.1F, 2F, -1.7F, 3.2F, -0.4F, -0.6F, 0.4F, 0F, -0.35F, 0F, 0.65F, -0.35F, -4.1F, 2F, 1F, 3.2F, -0.4F, 0.8F, 0.4F); // Box 44
		pitchFlapLeftWingModel[0].setRotationPoint(24F, -13.5F, -62F);
		pitchFlapLeftWingModel[0].rotateAngleY = -0.60213859F;
	}

	private void initbodyWheelModel_1()
	{
		bodyWheelModel[0] = new ModelRendererTurbo(this, 129, 217, textureX, textureY); // Box 80
		bodyWheelModel[1] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 81
		bodyWheelModel[2] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 82
		bodyWheelModel[3] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 83
		bodyWheelModel[4] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 84
		bodyWheelModel[5] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 85
		bodyWheelModel[6] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 86
		bodyWheelModel[7] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 87
		bodyWheelModel[8] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 88
		bodyWheelModel[9] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 89
		bodyWheelModel[10] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 90
		bodyWheelModel[11] = new ModelRendererTurbo(this, 185, 217, textureX, textureY); // Box 91
		bodyWheelModel[12] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 92
		bodyWheelModel[13] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 93
		bodyWheelModel[14] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 94
		bodyWheelModel[15] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 95
		bodyWheelModel[16] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Box 96
		bodyWheelModel[17] = new ModelRendererTurbo(this, 201, 129, textureX, textureY); // Box 97
		bodyWheelModel[18] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 98
		bodyWheelModel[19] = new ModelRendererTurbo(this, 249, 217, textureX, textureY); // Box 99
		bodyWheelModel[20] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 100
		bodyWheelModel[21] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 101
		bodyWheelModel[22] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 102
		bodyWheelModel[23] = new ModelRendererTurbo(this, 233, 129, textureX, textureY); // Box 103
		bodyWheelModel[24] = new ModelRendererTurbo(this, 265, 129, textureX, textureY); // Box 104
		bodyWheelModel[25] = new ModelRendererTurbo(this, 185, 153, textureX, textureY); // Box 105
		bodyWheelModel[26] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 106

		bodyWheelModel[0].addBox(0F, 0F, 0F, 23, 7, 1, 0F); // Box 80
		bodyWheelModel[0].setRotationPoint(-83F, -9F, -4F);
		bodyWheelModel[0].rotateAngleX = -0.08726646F;

		bodyWheelModel[1].addBox(0F, 0F, 0F, 2, 11, 2, 0F); // Box 81
		bodyWheelModel[1].setRotationPoint(-63F, -9F, -1F);

		bodyWheelModel[2].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 82
		bodyWheelModel[2].setRotationPoint(-62.5F, 1F, -0.5F);

		bodyWheelModel[3].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyWheelModel[3].setRotationPoint(-64F, 4.5F, 0.7F);

		bodyWheelModel[4].addBox(0F, 0F, 0F, 6, 2, 2, 0F); // Box 84
		bodyWheelModel[4].setRotationPoint(-64F, 6.5F, 0.7F);

		bodyWheelModel[5].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 85
		bodyWheelModel[5].setRotationPoint(-64F, 8.5F, 0.7F);

		bodyWheelModel[6].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 86
		bodyWheelModel[6].setRotationPoint(-64F, 8.5F, -2.7F);

		bodyWheelModel[7].addBox(0F, 0F, 0F, 6, 2, 2, 0F); // Box 87
		bodyWheelModel[7].setRotationPoint(-64F, 6.5F, -2.7F);

		bodyWheelModel[8].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyWheelModel[8].setRotationPoint(-64F, 4.5F, -2.7F);

		bodyWheelModel[9].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 89
		bodyWheelModel[9].setRotationPoint(-61.5F, 1F, -0.5F);
		bodyWheelModel[9].rotateAngleZ = 0.82030475F;

		bodyWheelModel[10].addShapeBox(4.4F, -1F, 0F, 1, 5, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 90
		bodyWheelModel[10].setRotationPoint(-61.5F, 1F, -0.5F);
		bodyWheelModel[10].rotateAngleZ = -0.87266463F;

		bodyWheelModel[11].addBox(0F, 0F, 0F, 28, 10, 1, 0F); // Box 91
		bodyWheelModel[11].setRotationPoint(-7F, -12F, -16F);
		bodyWheelModel[11].rotateAngleX = -0.52359878F;

		bodyWheelModel[12].addBox(0F, 0F, 0F, 3, 14, 3, 0F); // Box 92
		bodyWheelModel[12].setRotationPoint(17F, -12F, -16F);

		bodyWheelModel[13].addBox(0F, 0F, 0F, 2, 5, 2, 0F); // Box 93
		bodyWheelModel[13].setRotationPoint(17.5F, 1F, -15.5F);

		bodyWheelModel[14].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 94
		bodyWheelModel[14].setRotationPoint(18F, 5F, -19.5F);

		bodyWheelModel[15].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyWheelModel[15].setRotationPoint(14F, 1F, -21.5F);

		bodyWheelModel[16].addBox(0F, 0F, 0F, 9, 3, 3, 0F); // Box 96
		bodyWheelModel[16].setRotationPoint(14F, 4F, -21.5F);

		bodyWheelModel[17].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 97
		bodyWheelModel[17].setRotationPoint(14F, 7F, -21.5F);

		bodyWheelModel[18].addBox(0F, 0F, 0F, 1, 19, 2, 0F); // Box 98
		bodyWheelModel[18].setRotationPoint(4F, -12F, -12F);
		bodyWheelModel[18].rotateAngleX = -0.19198622F;
		bodyWheelModel[18].rotateAngleZ = 0.78539816F;

		bodyWheelModel[19].addBox(0F, 0F, 0F, 28, 10, 1, 0F); // Box 99
		bodyWheelModel[19].setRotationPoint(-7F, -12F, 15F);
		bodyWheelModel[19].rotateAngleX = 0.52359878F;

		bodyWheelModel[20].addBox(0F, 0F, 0F, 3, 14, 3, 0F); // Box 100
		bodyWheelModel[20].setRotationPoint(17F, -12F, 13F);

		bodyWheelModel[21].addBox(0F, 0F, 0F, 2, 5, 2, 0F); // Box 101
		bodyWheelModel[21].setRotationPoint(17.5F, 1F, 13.5F);

		bodyWheelModel[22].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 102
		bodyWheelModel[22].setRotationPoint(18F, 5F, 15.5F);

		bodyWheelModel[23].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyWheelModel[23].setRotationPoint(14F, 1F, 18.5F);

		bodyWheelModel[24].addBox(0F, 0F, 0F, 9, 3, 3, 0F); // Box 104
		bodyWheelModel[24].setRotationPoint(14F, 4F, 18.5F);

		bodyWheelModel[25].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 105
		bodyWheelModel[25].setRotationPoint(14F, 7F, 18.5F);

		bodyWheelModel[26].addBox(0F, 0F, 0F, 1, 19, 2, 0F); // Box 106
		bodyWheelModel[26].setRotationPoint(4F, -12F, 10F);
		bodyWheelModel[26].rotateAngleX = 0.19198622F;
		bodyWheelModel[26].rotateAngleZ = 0.78539816F;
	}

	private void inithudModel_1()
	{
		hudModel[0] = new ModelRendererTurbo(this, 33, 217, textureX, textureY); // Box 127

		hudModel[0].addShapeBox(0F, -1F, -1F, 1, 52, 52, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -50F, -0.4F, 0F, -50F, -0.4F, -50F, 0F, -0.4F, -50F, 0F, -0.4F, -50F, -50F, -0.4F, -50F, -50F); // Box 127
		hudModel[0].setRotationPoint(-71.2F, -26F, 0F);
	}
}