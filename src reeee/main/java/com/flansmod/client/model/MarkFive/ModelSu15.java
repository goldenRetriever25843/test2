//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SU15
// Model Creator: 
// Created on: 10.07.2015 - 12:02:04
// Last changed on: 10.07.2015 - 12:02:04

package com.flansmod.client.model.MarkFive; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSu15 extends ModelPlane //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSu15() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[88];
		noseModel = new ModelRendererTurbo[6];
		tailModel = new ModelRendererTurbo[14];
		leftWingModel = new ModelRendererTurbo[7];
		rightWingModel = new ModelRendererTurbo[7];
		yawFlapModel = new ModelRendererTurbo[3];
		pitchFlapLeftModel = new ModelRendererTurbo[2];
		pitchFlapRightModel = new ModelRendererTurbo[1];
		pitchFlapLeftWingModel = new ModelRendererTurbo[1];
		pitchFlapRightWingModel = new ModelRendererTurbo[1];
		bodyWheelModel = new ModelRendererTurbo[9];
		leftWingWheelModel = new ModelRendererTurbo[7];
		rightWingWheelModel = new ModelRendererTurbo[7];

		initbodyModel_1();
		initnoseModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inityawFlapModel_1();
		initpitchFlapLeftModel_1();
		initpitchFlapRightModel_1();
		initpitchFlapLeftWingModel_1();
		initpitchFlapRightWingModel_1();
		initbodyWheelModel_1();
		initleftWingWheelModel_1();
		initrightWingWheelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 275
		bodyModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 276
		bodyModel[2] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 17
		bodyModel[3] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 34
		bodyModel[4] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 35
		bodyModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 36
		bodyModel[6] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 37
		bodyModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 38
		bodyModel[8] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 39
		bodyModel[9] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 40
		bodyModel[10] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 41
		bodyModel[11] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 42
		bodyModel[12] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 43
		bodyModel[13] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 44
		bodyModel[14] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 45
		bodyModel[15] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 46
		bodyModel[16] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 47
		bodyModel[17] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 48
		bodyModel[18] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 49
		bodyModel[19] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 50
		bodyModel[20] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 51
		bodyModel[21] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 52
		bodyModel[22] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 53
		bodyModel[23] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 54
		bodyModel[24] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 59
		bodyModel[25] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 60
		bodyModel[26] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 61
		bodyModel[27] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 62
		bodyModel[28] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 63
		bodyModel[29] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 64
		bodyModel[30] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 70
		bodyModel[31] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 75
		bodyModel[32] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 76
		bodyModel[33] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 77
		bodyModel[34] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 104
		bodyModel[35] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 149
		bodyModel[36] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 150
		bodyModel[37] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 151
		bodyModel[38] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 152
		bodyModel[39] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 153
		bodyModel[40] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 154
		bodyModel[41] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 155
		bodyModel[42] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 156
		bodyModel[43] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 157
		bodyModel[44] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 162
		bodyModel[45] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 149
		bodyModel[46] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 157
		bodyModel[47] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 158
		bodyModel[48] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 159
		bodyModel[49] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 160
		bodyModel[50] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 161
		bodyModel[51] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 162
		bodyModel[52] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 163
		bodyModel[53] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Box 164
		bodyModel[54] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 165
		bodyModel[55] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Box 166
		bodyModel[56] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 167
		bodyModel[57] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 168
		bodyModel[58] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 169
		bodyModel[59] = new ModelRendererTurbo(this, 281, 121, textureX, textureY); // Box 170
		bodyModel[60] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 174
		bodyModel[61] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Box 175
		bodyModel[62] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Box 176
		bodyModel[63] = new ModelRendererTurbo(this, 425, 153, textureX, textureY); // Box 177
		bodyModel[64] = new ModelRendererTurbo(this, 305, 193, textureX, textureY); // Box 178
		bodyModel[65] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 180
		bodyModel[66] = new ModelRendererTurbo(this, 425, 185, textureX, textureY); // Box 182
		bodyModel[67] = new ModelRendererTurbo(this, 201, 225, textureX, textureY); // Box 184
		bodyModel[68] = new ModelRendererTurbo(this, 321, 225, textureX, textureY); // Box 185
		bodyModel[69] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 186
		bodyModel[70] = new ModelRendererTurbo(this, 121, 249, textureX, textureY); // Box 188
		bodyModel[71] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Box 189
		bodyModel[72] = new ModelRendererTurbo(this, 353, 257, textureX, textureY); // Box 190
		bodyModel[73] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Box 191
		bodyModel[74] = new ModelRendererTurbo(this, 353, 305, textureX, textureY); // Box 192
		bodyModel[75] = new ModelRendererTurbo(this, 209, 257, textureX, textureY); // Box 129
		bodyModel[76] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 151
		bodyModel[77] = new ModelRendererTurbo(this, 441, 305, textureX, textureY); // Box 152
		bodyModel[78] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 153
		bodyModel[79] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 154
		bodyModel[80] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 155
		bodyModel[81] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 156
		bodyModel[82] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 157
		bodyModel[83] = new ModelRendererTurbo(this, 481, 137, textureX, textureY); // Box 159
		bodyModel[84] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 160
		bodyModel[85] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Box 161
		bodyModel[86] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 163
		bodyModel[87] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 164

		bodyModel[0].addShapeBox(0F, 0F, 0F, 73, 43, 3, 0F,-62F, -1.5F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, -62F, -1.5F, 0F, 10F, 1F, 0F, -33F, 1F, 0F, -33F, 1F, 0F, 10F, 1F, 0F); // Box 275
		bodyModel[0].setRotationPoint(115F, -76F, -1.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 1F, 0F, 0F); // Box 276
		bodyModel[1].setRotationPoint(189.5F, -75F, -1.5F);

		bodyModel[2].addShapeBox(0F, -13F, 0F, 29, 8, 24, 0F,0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, -1F, -9F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -1F, -10F); // Box 17
		bodyModel[2].setRotationPoint(-88F, -1F, -12F);

		bodyModel[3].addShapeBox(0F, -13F, 0F, 11, 8, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0.5F, -9F, 0F, 0.5F, -9F, 0F, 0F, -9F); // Box 34
		bodyModel[3].setRotationPoint(-59F, -1F, -11F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 34, 8, 20, 0F,0F, 0F, 1F, 1F, 0F, 1.5F, 1F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0.5F, -8F, 0.5F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0F, 0.5F, -8F); // Box 35
		bodyModel[4].setRotationPoint(-48F, -14F, -10F);

		bodyModel[5].addShapeBox(-0.5F, -1.5F, -3F, 2, 2, 6, 0F,0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[5].setRotationPoint(-61F, -30F, 0F);
		bodyModel[5].rotateAngleZ = -0.97738438F;

		bodyModel[6].addShapeBox(-0.5F, -5.5F, -3F, 1, 5, 1, 0F,-0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F); // Box 37
		bodyModel[6].setRotationPoint(-61F, -30F, 0F);
		bodyModel[6].rotateAngleZ = -0.97738438F;

		bodyModel[7].addShapeBox(-0.5F, -7.5F, -3F, 1, 2, 1, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F); // Box 38
		bodyModel[7].setRotationPoint(-61F, -30F, 0F);
		bodyModel[7].rotateAngleZ = -0.97738438F;

		bodyModel[8].addShapeBox(-0.5F, -9.5F, -2.5F, 1, 2, 1, 0F,-0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 1F, -0.3F, 0F, 1F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F); // Box 39
		bodyModel[8].setRotationPoint(-61F, -30F, 0F);
		bodyModel[8].rotateAngleZ = -0.97738438F;

		bodyModel[9].addShapeBox(-0.5F, -5.5F, 3F, 1, 5, 1, 0F,-0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F); // Box 40
		bodyModel[9].setRotationPoint(-61F, -30F, -1F);
		bodyModel[9].rotateAngleZ = -0.97738438F;

		bodyModel[10].addShapeBox(-0.5F, -7.5F, 3F, 1, 2, 1, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F); // Box 41
		bodyModel[10].setRotationPoint(-61F, -30F, -1F);
		bodyModel[10].rotateAngleZ = -0.97738438F;

		bodyModel[11].addShapeBox(-0.5F, -9.5F, 2.5F, 1, 2, 1, 0F,-0.3F, 0F, 1F, -0.3F, 0F, 1F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F); // Box 42
		bodyModel[11].setRotationPoint(-61F, -30F, -1F);
		bodyModel[11].rotateAngleZ = -0.97738438F;

		bodyModel[12].addShapeBox(-0.5F, -10F, -1F, 1, 1, 2, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0.5F, -0.3F, -0.5F, 0.5F, -0.3F, -0.5F, 0.5F, -0.3F, -0.5F, 0.5F); // Box 43
		bodyModel[12].setRotationPoint(-61F, -30F, 0F);
		bodyModel[12].rotateAngleZ = -0.97738438F;

		bodyModel[13].addShapeBox(-5.5F, -0.5F, -0.5F, 6, 1, 1, 0F,0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 44
		bodyModel[13].setRotationPoint(-55F, -30F, -5F);
		bodyModel[13].rotateAngleY = -0.43633231F;
		bodyModel[13].rotateAngleZ = -0.12217305F;

		bodyModel[14].addShapeBox(-0.5F, -0.5F, -0.5F, 8, 1, 1, 0F,-0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 1F, -0.3F, 0F, 1F, -0.3F, -0.5F, 0F, -0.3F); // Box 45
		bodyModel[14].setRotationPoint(-55F, -30F, -5F);
		bodyModel[14].rotateAngleY = -0.31415927F;
		bodyModel[14].rotateAngleZ = -0.01745329F;

		bodyModel[15].addShapeBox(-0.5F, -0.5F, -0.5F, 4, 2, 1, 0F,-0.5F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, -0.5F, 0F, -0.3F); // Box 46
		bodyModel[15].setRotationPoint(-48F, -30F, -7.3F);
		bodyModel[15].rotateAngleZ = 0.06981317F;

		bodyModel[16].addShapeBox(-0.5F, -0.5F, -0.5F, 9, 3, 1, 0F,-0.5F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, -0.5F, 0F, -0.3F); // Box 47
		bodyModel[16].setRotationPoint(-44.5F, -29.7F, -7.3F);
		bodyModel[16].rotateAngleY = 0.10471976F;
		bodyModel[16].rotateAngleZ = 0.13962634F;

		bodyModel[17].addShapeBox(-0.5F, -1.5F, -0.5F, 13, 3, 1, 0F,-0.5F, -0.3F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.7F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, -0.5F, -0.7F, -0.3F); // Box 48
		bodyModel[17].setRotationPoint(-36F, -29.8F, -6.4F);
		bodyModel[17].rotateAngleY = 0.34906585F;
		bodyModel[17].rotateAngleZ = 0.06981317F;

		bodyModel[18].addShapeBox(-5.5F, -0.5F, -0.5F, 6, 1, 1, 0F,0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 49
		bodyModel[18].setRotationPoint(-55F, -30F, 5F);
		bodyModel[18].rotateAngleY = 0.43633231F;
		bodyModel[18].rotateAngleZ = -0.12217305F;

		bodyModel[19].addShapeBox(-0.5F, -0.5F, -0.5F, 8, 1, 1, 0F,-0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 1F, -0.3F, 0F, 1F, -0.3F, -0.5F, 0F, -0.3F); // Box 50
		bodyModel[19].setRotationPoint(-55F, -30F, 5F);
		bodyModel[19].rotateAngleY = 0.31415927F;
		bodyModel[19].rotateAngleZ = -0.01745329F;

		bodyModel[20].addShapeBox(-0.5F, -0.5F, -0.5F, 4, 2, 1, 0F,-0.5F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, -0.5F, 0F, -0.3F); // Box 51
		bodyModel[20].setRotationPoint(-48F, -30F, 7.3F);
		bodyModel[20].rotateAngleZ = 0.06981317F;

		bodyModel[21].addShapeBox(-0.5F, -0.5F, -0.5F, 9, 3, 1, 0F,-0.5F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, -0.5F, 0F, -0.3F); // Box 52
		bodyModel[21].setRotationPoint(-44.5F, -29.7F, 7.3F);
		bodyModel[21].rotateAngleY = -0.10471976F;
		bodyModel[21].rotateAngleZ = 0.15707963F;

		bodyModel[22].addShapeBox(-0.5F, -1.5F, -0.5F, 13, 3, 1, 0F,-0.5F, -0.3F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.7F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, -0.5F, -0.7F, -0.3F); // Box 53
		bodyModel[22].setRotationPoint(-36F, -29.8F, 6.4F);
		bodyModel[22].rotateAngleY = -0.34906585F;
		bodyModel[22].rotateAngleZ = 0.06981317F;

		bodyModel[23].addShapeBox(-0.5F, -1.5F, -0.5F, 19, 7, 9, 0F,0F, -0.5F, -2F, 0F, -5.5F, -3.3F, 0F, -5.5F, -3.3F, 0F, -0.5F, -2F, 0F, 1.5F, 1.5F, 0F, -0.8F, -2F, 0F, -0.8F, -2F, 0F, 1.5F, -0.5F); // Box 54
		bodyModel[23].setRotationPoint(-31F, -36F, -4F);

		bodyModel[24].addShapeBox(-0.5F, -0.5F, -0.5F, 4, 1, 1, 0F,0F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 59
		bodyModel[24].setRotationPoint(-49F, -36.7F, 0F);
		bodyModel[24].rotateAngleZ = 0.15707963F;

		bodyModel[25].addShapeBox(-2F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0.6F, -0.3F, 0F, 0.6F, -0.3F, 0F, 0F, -0.5F, 0F, 0F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 60
		bodyModel[25].setRotationPoint(-51F, -36.2F, 0F);
		bodyModel[25].rotateAngleZ = 0.27925268F;

		bodyModel[26].addShapeBox(-0.2F, -0.5F, -0.5F, 2, 1, 2, 0F,2F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.3F, 0F, 3.5F, -0.3F, 0F, 2F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 3.5F, -0.3F, 0F); // Box 61
		bodyModel[26].setRotationPoint(-51F, -36.1F, 1F);
		bodyModel[26].rotateAngleX = -0.38397244F;
		bodyModel[26].rotateAngleZ = 0.27925268F;

		bodyModel[27].addShapeBox(-1F, -0.5F, -0.5F, 2, 1, 2, 0F,0F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 62
		bodyModel[27].setRotationPoint(-50F, -35.6F, 2.8F);
		bodyModel[27].rotateAngleX = -0.50614548F;
		bodyModel[27].rotateAngleZ = 0.27925268F;

		bodyModel[28].addShapeBox(-1F, -0.5F, 1.5F, 2, 1, 2, 0F,0F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[28].setRotationPoint(-50F, -35.6F, 2.8F);
		bodyModel[28].rotateAngleX = -0.50614548F;
		bodyModel[28].rotateAngleZ = 0.27925268F;

		bodyModel[29].addShapeBox(-1F, -0.2F, 3.5F, 2, 1, 2, 0F,0F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -3.1F, 1.2F, 0F, -2.8F, 0.7F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 1F, 2.7F, 1.5F, 0F, 2F, 0.3F); // Box 64
		bodyModel[29].setRotationPoint(-50F, -35.6F, 2.8F);
		bodyModel[29].rotateAngleX = -0.50614548F;
		bodyModel[29].rotateAngleZ = 0.27925268F;

		bodyModel[30].addShapeBox(-1F, -0.2F, 3.5F, 2, 1, 2, 0F,0.1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -2.8F, 0.7F, 0.1F, -3.1F, 1.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 2F, 0.3F, 1F, 2.7F, 1.5F); // Box 70
		bodyModel[30].setRotationPoint(-50F, -35.6F, -2.8F);
		bodyModel[30].rotateAngleX = -0.50614548F;
		bodyModel[30].rotateAngleY = -3.14159265F;
		bodyModel[30].rotateAngleZ = -0.27925268F;

		bodyModel[31].addShapeBox(0F, -0.5F, -0.5F, 2, 1, 2, 0F,3.5F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.4F, 0F, 2F, -0.4F, 0F, 3.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 2F, -0.3F, 0F); // Box 75
		bodyModel[31].setRotationPoint(-51F, -35.7F, -1.9F);
		bodyModel[31].rotateAngleX = 0.38397244F;
		bodyModel[31].rotateAngleZ = 0.27925268F;

		bodyModel[32].addShapeBox(-0.8F, -0.5F, -0.5F, 2, 1, 2, 0F,0F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 76
		bodyModel[32].setRotationPoint(-50F, -35.1F, -3.7F);
		bodyModel[32].rotateAngleX = 0.50614548F;
		bodyModel[32].rotateAngleZ = 0.27925268F;

		bodyModel[33].addShapeBox(-0.8F, -0.5F, -4.8F, 2, 1, 2, 0F,0F, -0.6F, 0F, 0.1F, -0.6F, 0F, 0.1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 77
		bodyModel[33].setRotationPoint(-50.3F, -36.1F, -1.7F);
		bodyModel[33].rotateAngleX = 0.50614548F;
		bodyModel[33].rotateAngleZ = 0.27925268F;

		bodyModel[34].addShapeBox(0F, 34F, 0F, 22, 1, 27, 0F,-31F, 0F, -1F, 19F, 0F, 0F, -4F, 0F, 0F, 12F, 0F, 0F, -31F, 0F, -1F, 19F, 0F, 0F, -4F, 0F, 0F, 12F, 0F, 0F); // Box 104
		bodyModel[34].setRotationPoint(150F, -50F, -45.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 22, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[35].setRotationPoint(-40F, -34F, -4F);
		bodyModel[35].rotateAngleZ = -0.13962634F;

		bodyModel[36].addShapeBox(0F, 0F, 0F, 18, 19, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[36].setRotationPoint(-37F, -29F, -5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 8, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[37].setRotationPoint(-50F, -19F, -4F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 4, 7, 9, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[38].setRotationPoint(-59F, -29.5F, -4.5F);
		bodyModel[38].rotateAngleZ = 0.06981317F;

		bodyModel[39].addShapeBox(0F, 0F, 0F, 18, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[39].setRotationPoint(-55F, -22.5F, -9F);
		bodyModel[39].rotateAngleZ = 0.06981317F;

		bodyModel[40].addShapeBox(0F, 0F, 0F, 18, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[40].setRotationPoint(-55F, -22.5F, 5F);
		bodyModel[40].rotateAngleZ = 0.06981317F;

		bodyModel[41].addShapeBox(0F, 0F, 0F, 6, 10, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[41].setRotationPoint(-61F, -23.5F, -1.5F);
		bodyModel[41].rotateAngleZ = 0.06981317F;

		bodyModel[42].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[42].setRotationPoint(-60F, -27.5F, -7.2F);
		bodyModel[42].rotateAngleZ = 0.06981317F;

		bodyModel[43].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[43].setRotationPoint(-60F, -27.5F, 4.2F);
		bodyModel[43].rotateAngleZ = 0.06981317F;

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 162
		bodyModel[44].setRotationPoint(-55.5F, -32F, -4F);
		bodyModel[44].rotateAngleZ = -0.17453293F;

		bodyModel[45].addShapeBox(0F, 34F, 0F, 22, 1, 27, 0F,12F, 0F, 0F, -4F, 0F, 0F, 19F, 0F, 0F, -31F, 0F, -1F, 12F, 0F, 0F, -4F, 0F, 0F, 19F, 0F, 0F, -31F, 0F, -1F); // Box 149
		bodyModel[45].setRotationPoint(150F, -50F, 18.5F);

		bodyModel[46].addShapeBox(-0.5F, -0.5F, -0.5F, 7, 1, 1, 0F,0F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 157
		bodyModel[46].setRotationPoint(-45F, -37.3F, 0F);
		bodyModel[46].rotateAngleZ = 0.05235988F;

		bodyModel[47].addShapeBox(-0.5F, -0.5F, -0.5F, 7, 1, 1, 0F,0F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 158
		bodyModel[47].setRotationPoint(-38F, -37.6F, 0F);
		bodyModel[47].rotateAngleZ = -0.12217305F;

		bodyModel[48].addShapeBox(0F, -13F, 0F, 11, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[48].setRotationPoint(-59F, -9F, -11F);

		bodyModel[49].addShapeBox(0F, -13F, 0F, 35, 8, 1, 0F,0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F); // Box 160
		bodyModel[49].setRotationPoint(-48F, -9F, -12F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 11, 8, 1, 0F,0F, 0F, -6F, 0F, -0.5F, -4.5F, 0F, -0.5F, 4F, 0F, 0F, 8.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 161
		bodyModel[50].setRotationPoint(-59F, -30F, -12F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, 0F, -1F, 0F, 0.15F, -0.9F, 0F, 0.15F, 0.9F, 0F, 0F, 1F); // Box 162
		bodyModel[51].setRotationPoint(-48F, -30F, -12F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 8, 8, 1, 0F,0F, -0.5F, -4.5F, 0F, -0.2F, -5.4F, 0F, -0.2F, 4.9F, 0F, -0.5F, 4F, 0F, 0.15F, -0.9F, 0F, 0.4F, -0.8F, 0F, 0.4F, 0.8F, 0F, 0.15F, 0.9F); // Box 163
		bodyModel[52].setRotationPoint(-44F, -30F, -12F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 23, 8, 1, 0F,0F, -0.2F, -5.4F, 0.5F, 2F, -7.5F, 0.5F, 2F, 11F, 0F, -0.2F, 4.9F, 0F, 0.4F, -0.8F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0.4F, 0.8F); // Box 164
		bodyModel[53].setRotationPoint(-36F, -30F, -12F);

		bodyModel[54].addShapeBox(0F, -13F, 0F, 11, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[54].setRotationPoint(-59F, -9F, 10F);

		bodyModel[55].addShapeBox(0F, -13F, 0F, 35, 8, 1, 0F,0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F); // Box 166
		bodyModel[55].setRotationPoint(-48F, -9F, 11F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 11, 8, 1, 0F,0F, 0F, 8.5F, 0F, -0.5F, 4F, 0F, -0.5F, -4.5F, 0F, 0F, -6F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 167
		bodyModel[56].setRotationPoint(-59F, -30F, 11F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, 0F, 0F, 1F, 0F, 0.15F, 0.9F, 0F, 0.15F, -0.9F, 0F, 0F, -1F); // Box 168
		bodyModel[57].setRotationPoint(-48F, -30F, 11F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 8, 8, 1, 0F,0F, -0.5F, 4F, 0F, -0.2F, 4.9F, 0F, -0.2F, -5.4F, 0F, -0.5F, -4.5F, 0F, 0.15F, 0.9F, 0F, 0.4F, 0.8F, 0F, 0.4F, -0.8F, 0F, 0.15F, -0.9F); // Box 169
		bodyModel[58].setRotationPoint(-44F, -30F, 11F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 23, 8, 1, 0F,0F, -0.2F, 4.9F, 0.5F, 2F, 11F, 0.5F, 2F, -7.5F, 0F, -0.2F, -5.4F, 0F, 0.4F, 0.8F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0.4F, -0.8F); // Box 170
		bodyModel[59].setRotationPoint(-36F, -30F, 11F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 4, 16, 8, 0F,12F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 0.8F, -0.5F, 12F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F); // Box 174
		bodyModel[60].setRotationPoint(-26F, -26F, 10F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 4, 16, 8, 0F,0.5F, 0.8F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 12F, 0F, -1F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, -1F); // Box 175
		bodyModel[61].setRotationPoint(-26F, -26F, -18F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 27, 17, 8, 0F,0F, 0F, 0F, 0F, 2F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[62].setRotationPoint(-22F, -27F, 10F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 27, 17, 8, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[63].setRotationPoint(-22F, -27F, -18F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 45, 18, 12, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 3F, -5F, 0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 4F, -5F, 0F, 3F, -4F); // Box 178
		bodyModel[64].setRotationPoint(5F, -28F, -18F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 64, 18, 7, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 180
		bodyModel[65].setRotationPoint(50F, -28F, -18F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 30, 18, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 4F, 0F); // Box 182
		bodyModel[66].setRotationPoint(114F, -28F, -18F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 45, 18, 12, 0F,0F, 1F, -5F, 0F, 3F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 3F, -4F, 0F, 4F, -5F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 184
		bodyModel[67].setRotationPoint(5F, -28F, 6F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 64, 18, 7, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 185
		bodyModel[68].setRotationPoint(50F, -28F, 11F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 30, 18, 7, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[69].setRotationPoint(114F, -28F, 11F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 18, 10, 23, 0F,-0.5F, 0F, -7F, 0F, 0F, -8F, 0F, 0F, -8F, -0.5F, 0F, -7F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[70].setRotationPoint(-13F, -32F, -11.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 162, 10, 23, 0F,0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 189
		bodyModel[71].setRotationPoint(5F, -32F, -11.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 45, 22, 22, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -1F); // Box 190
		bodyModel[72].setRotationPoint(5F, -29F, -11F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 64, 22, 22, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 191
		bodyModel[73].setRotationPoint(50F, -29F, -11F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 30, 25, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[74].setRotationPoint(114F, -31F, -11F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 18, 8, 20, 0F,0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0.5F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -5.5F); // Box 129
		bodyModel[75].setRotationPoint(-13F, -14F, -10F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 29, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[76].setRotationPoint(41F, -6F, -7F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 29, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[77].setRotationPoint(41F, -6F, 2F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[78].setRotationPoint(28F, -5F, -6F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[79].setRotationPoint(28F, -5F, -4F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[80].setRotationPoint(28F, -5F, 5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[81].setRotationPoint(28F, -5F, 3F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 10, 3, 5, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 157
		bodyModel[82].setRotationPoint(31F, -6F, 2F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 10, 3, 5, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 159
		bodyModel[83].setRotationPoint(31F, -6F, -7F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, 0F, 0F, 0F, -1.45F, -2.45F, 0F, -1.45F, -2.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.45F, -2.45F, 0F, -1.45F, -2.45F, 0F, 0F, 0F); // Box 160
		bodyModel[84].setRotationPoint(70F, -6F, -7F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, 0F, 0F, 0F, -1.45F, -2.45F, 0F, -1.45F, -2.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.45F, -2.45F, 0F, -1.45F, -2.45F, 0F, 0F, 0F); // Box 161
		bodyModel[85].setRotationPoint(70F, -6F, 2F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,9F, -4F, 0F, 4F, 1F, 0F, 4F, 1F, 0F, 9F, -4F, 0F, 9F, 7F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 9F, 7F, 0F); // Box 163
		bodyModel[86].setRotationPoint(109.5F, -39F, -1.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,15F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 15F, -1.5F, 0F, 20F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 20F, 2F, 0F); // Box 164
		bodyModel[87].setRotationPoint(94.5F, -35F, -1.5F);
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 13
		noseModel[1] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 16
		noseModel[2] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // Box 171
		noseModel[3] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 172
		noseModel[4] = new ModelRendererTurbo(this, 161, 169, textureX, textureY); // Box 173
		noseModel[5] = new ModelRendererTurbo(this, 201, 209, textureX, textureY); // Box 128

		noseModel[0].addShapeBox(0F, -13F, 0F, 29, 8, 24, 0F,0F, -4F, -9F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -4F, -9F, 0F, 2F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 2F, -3F); // Box 13
		noseModel[0].setRotationPoint(-88F, -17F, -12F);

		noseModel[1].addShapeBox(0F, -13F, 0F, 29, 8, 24, 0F,0F, -2F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F); // Box 16
		noseModel[1].setRotationPoint(-88F, -9F, -12F);

		noseModel[2].addShapeBox(0F, -13F, 0F, 52, 8, 24, 0F,0F, -1F, -11.8F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, -11.8F, 0F, -6.8F, -11.8F, 0F, -1F, -9F, 0F, -1F, -10F, 0F, -6.8F, -11.8F); // Box 171
		noseModel[2].setRotationPoint(-140F, -1F, -12F);

		noseModel[3].addShapeBox(0F, -13F, 0F, 52, 8, 24, 0F,0F, -9F, -11.8F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, -9F, -11.8F, 0F, 1.2F, -11.8F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1.2F, -11.8F); // Box 172
		noseModel[3].setRotationPoint(-140F, -9F, -12F);

		noseModel[4].addShapeBox(0F, -13F, 0F, 52, 8, 24, 0F,0F, -17F, -11.8F, 0F, -4F, -9F, 0F, -4F, -9F, 0F, -17F, -11.8F, 0F, 9F, -11.8F, 0F, 2F, -3F, 0F, 2F, -3F, 0F, 9F, -11.8F); // Box 173
		noseModel[4].setRotationPoint(-140F, -17F, -12F);

		noseModel[5].addShapeBox(0F, -13F, 0F, 42, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, 2.2F, -0.3F, 0F, 2.2F, -0.3F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -2.8F, -0.3F, 0F, -2.8F, -0.3F, 0F, -0.45F, -0.45F); // Box 128
		noseModel[5].setRotationPoint(-180F, 2F, -0.5F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 272
		tailModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 273
		tailModel[2] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 274
		tailModel[3] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 154
		tailModel[4] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 155
		tailModel[5] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 156
		tailModel[6] = new ModelRendererTurbo(this, 145, 209, textureX, textureY); // Box 183
		tailModel[7] = new ModelRendererTurbo(this, 81, 241, textureX, textureY); // Box 187
		tailModel[8] = new ModelRendererTurbo(this, 177, 329, textureX, textureY); // Box 193
		tailModel[9] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 125
		tailModel[10] = new ModelRendererTurbo(this, 281, 137, textureX, textureY); // Box 126
		tailModel[11] = new ModelRendererTurbo(this, 137, 169, textureX, textureY); // Box 127
		tailModel[12] = new ModelRendererTurbo(this, 273, 257, textureX, textureY); // Box 144
		tailModel[13] = new ModelRendererTurbo(this, 425, 129, textureX, textureY); // Box 145

		tailModel[0].addShapeBox(110F, -3.5F, 0F, 7, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 272
		tailModel[0].setRotationPoint(57F, -20F, -17.5F);

		tailModel[1].addShapeBox(110F, 1.5F, 0F, 7, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, -5F); // Box 273
		tailModel[1].setRotationPoint(57F, -19F, -17.5F);

		tailModel[2].addShapeBox(110F, -8.5F, 0F, 7, 6, 18, 0F,0F, 0F, -6F, 0F, -1F, -6F, 0F, -1F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 274
		tailModel[2].setRotationPoint(57F, -21F, -17.5F);

		tailModel[3].addShapeBox(110F, -3.5F, 0F, 7, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 154
		tailModel[3].setRotationPoint(57F, -20F, -0.5F);

		tailModel[4].addShapeBox(110F, 1.5F, 0F, 7, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, -5F); // Box 155
		tailModel[4].setRotationPoint(57F, -19F, -0.5F);

		tailModel[5].addShapeBox(110F, -8.5F, 0F, 7, 6, 18, 0F,0F, 0F, -6F, 0F, -1F, -6F, 0F, -1F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 156
		tailModel[5].setRotationPoint(57F, -21F, -0.5F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 23, 17, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 183
		tailModel[6].setRotationPoint(144F, -28F, -18F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 23, 17, 7, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 187
		tailModel[7].setRotationPoint(144F, -28F, 11F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 23, 23, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 193
		tailModel[8].setRotationPoint(144F, -31F, -11F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 20, 8, 3, 0F,0F, 0F, 0F, 1.5F, 4.5F, 0F, 1.5F, 4.5F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 6F, 0F, 0F); // Box 125
		tailModel[9].setRotationPoint(160F, -39F, -1.5F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 3, 9, 11, 0F,0F, 0F, -2F, 13F, -3F, -5F, 13F, -3F, -5F, 0F, 0F, -2F, 0F, -8F, 0F, -3F, -7.9F, 0F, -3F, -7.9F, 0F, 0F, -8F, 0F); // Box 126
		tailModel[10].setRotationPoint(167F, -32F, -5.5F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 3, 9, 11, 0F,0F, -8F, 0F, -3F, -7.9F, 0F, -3F, -7.9F, 0F, 0F, -8F, 0F, 0F, 13F, -5F, 13F, 0.8F, -5F, 13F, 0.8F, -5F, 0F, 13F, -5F); // Box 127
		tailModel[11].setRotationPoint(167F, -38.8F, -5.5F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 28, 5, 5, 0F,0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F); // Box 144
		tailModel[12].setRotationPoint(156F, -38F, -2.5F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 1F); // Box 145
		tailModel[13].setRotationPoint(184F, -38F, -2.5F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 217, 393, textureX, textureY); // Box 133
		leftWingModel[1] = new ModelRendererTurbo(this, 361, 401, textureX, textureY); // Box 139
		leftWingModel[2] = new ModelRendererTurbo(this, 1, 417, textureX, textureY); // Box 140
		leftWingModel[3] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Box 141
		leftWingModel[4] = new ModelRendererTurbo(this, 441, 361, textureX, textureY); // Box 142
		leftWingModel[5] = new ModelRendererTurbo(this, 425, 217, textureX, textureY); // Box 148
		leftWingModel[6] = new ModelRendererTurbo(this, 209, 217, textureX, textureY); // Box 150

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 54, 3, 32, 0F,0F, 0F, -31.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -31.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		leftWingModel[0].setRotationPoint(15F, -17F, -49F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 36, 3, 32, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		leftWingModel[1].setRotationPoint(69F, -17F, -49F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 36, 3, 30, 0F,-30F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 0F, -30F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 0F); // Box 140
		leftWingModel[2].setRotationPoint(69F, -17F, -79F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 4, 3, 7, 0F,-1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		leftWingModel[3].setRotationPoint(110F, -17F, -79F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 9, 3, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		leftWingModel[4].setRotationPoint(105F, -17F, -42F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 30, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F); // Box 148
		leftWingModel[5].setRotationPoint(71F, -14F, -50F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 30, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F); // Box 150
		leftWingModel[6].setRotationPoint(33F, -14F, -27F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 241, 353, textureX, textureY); // Box 130
		rightWingModel[1] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Box 131
		rightWingModel[2] = new ModelRendererTurbo(this, 113, 385, textureX, textureY); // Box 132
		rightWingModel[3] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // Box 136
		rightWingModel[4] = new ModelRendererTurbo(this, 433, 329, textureX, textureY); // Box 137
		rightWingModel[5] = new ModelRendererTurbo(this, 209, 217, textureX, textureY); // Box 147
		rightWingModel[6] = new ModelRendererTurbo(this, 209, 217, textureX, textureY); // Box 149

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 54, 3, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -31.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -31.8F); // Box 130
		rightWingModel[0].setRotationPoint(15F, -17F, 17F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 36, 3, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 131
		rightWingModel[1].setRotationPoint(69F, -17F, 17F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 36, 3, 30, 0F,0F, 0F, 0F, 0F, 0F, 7F, 6F, 0F, 0F, -30F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 6F, 0F, 0F, -30F, 0F, 0F); // Box 132
		rightWingModel[2].setRotationPoint(69F, -17F, 49F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 4, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F); // Box 136
		rightWingModel[3].setRotationPoint(110F, -17F, 72F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 9, 3, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		rightWingModel[4].setRotationPoint(105F, -17F, 17F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 30, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F); // Box 147
		rightWingModel[5].setRotationPoint(71F, -14F, 49F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 30, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F); // Box 149
		rightWingModel[6].setRotationPoint(33F, -14F, 26F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 93
		yawFlapModel[1] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 159
		yawFlapModel[2] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 161

		yawFlapModel[0].addShapeBox(0F, -16F, -1.5F, 17, 33, 3, 0F,-15F, 0.3F, -0.2F, 6.5F, -1.7F, -0.2F, 6.5F, -1.7F, -0.2F, -15F, 0.3F, -0.2F, 11.5F, 0F, -0.2F, -9F, -4F, -0.2F, -9F, -4F, -0.2F, 11.5F, 0F, -0.2F); // Box 93
		yawFlapModel[0].setRotationPoint(173.5F, -56.5F, 0F);

		yawFlapModel[1].addShapeBox(-2F, 0F, 2F, 3, 1, 2, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 159
		yawFlapModel[1].setRotationPoint(-57F, -16.5F, 0F);
		yawFlapModel[1].rotateAngleZ = 0.06981317F;

		yawFlapModel[2].addShapeBox(-2F, 0F, -4F, 3, 1, 2, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 161
		yawFlapModel[2].setRotationPoint(-57F, -16.5F, 0F);
		yawFlapModel[2].rotateAngleZ = 0.06981317F;
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 105
		pitchFlapLeftModel[1] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 158

		pitchFlapLeftModel[0].addShapeBox(0F, -0.5F, 0F, 6, 1, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 3.2F, 0F, -9.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.2F, 0F, -8.5F, 0F, 0F, 0F); // Box 105
		pitchFlapLeftModel[0].setRotationPoint(190.9F, -15F, -45.5F);
		pitchFlapLeftModel[0].rotateAngleY = 0.70685835F;

		pitchFlapLeftModel[1].addShapeBox(-0.5F, -14F, -0.5F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		pitchFlapLeftModel[1].setRotationPoint(-51F, -13.5F, 0F);
		pitchFlapLeftModel[1].rotateAngleZ = 0.06981317F;
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 150

		pitchFlapRightModel[0].addShapeBox(0F, -0.5F, 0F, 6, 1, 36, 0F,0F, 0F, 0F, 3.2F, 0F, -9.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.2F, 0F, -8.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		pitchFlapRightModel[0].setRotationPoint(167.4F, -15F, 18.5F);
		pitchFlapRightModel[0].rotateAngleY = -0.70685835F;
	}

	private void initpitchFlapLeftWingModel_1()
	{
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 105, 425, textureX, textureY); // Box 143

		pitchFlapLeftWingModel[0].addShapeBox(0F, -1.5F, -15F, 9, 3, 30, 0F,0F, 0F, 0F, -5F, 0F, 0.7F, -0.2F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0.7F, -0.2F, 0F, -1.2F, 0F, 0F, 0F); // Box 143
		pitchFlapLeftWingModel[0].setRotationPoint(107.5F, -15.5F, -57F);
		pitchFlapLeftWingModel[0].rotateAngleY = 0.15707963F;
	}

	private void initpitchFlapRightWingModel_1()
	{
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 385, 361, textureX, textureY); // Box 138

		pitchFlapRightWingModel[0].addShapeBox(0F, -1.5F, -15F, 9, 3, 30, 0F,0F, 0F, 0F, -0.2F, 0F, -1.2F, -5F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -1.2F, -5F, 0F, 0.7F, 0F, 0F, 0F); // Box 138
		pitchFlapRightWingModel[0].setRotationPoint(107.5F, -15.5F, 57F);
		pitchFlapRightWingModel[0].rotateAngleY = -0.15707963F;
	}

	private void initbodyWheelModel_1()
	{
		bodyWheelModel[0] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 116
		bodyWheelModel[1] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 117
		bodyWheelModel[2] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 118
		bodyWheelModel[3] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 119
		bodyWheelModel[4] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 120
		bodyWheelModel[5] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 121
		bodyWheelModel[6] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 122
		bodyWheelModel[7] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 123
		bodyWheelModel[8] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 124

		bodyWheelModel[0].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyWheelModel[0].setRotationPoint(-65.5F, 6.5F, -1.5F);

		bodyWheelModel[1].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 117
		bodyWheelModel[1].setRotationPoint(-65.5F, 9.5F, -1.5F);

		bodyWheelModel[2].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyWheelModel[2].setRotationPoint(-65.5F, 3.5F, -1.5F);

		bodyWheelModel[3].addShapeBox(3F, 0F, 0F, 7, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyWheelModel[3].setRotationPoint(-67.5F, 0.5F, -2.5F);
		bodyWheelModel[3].rotateAngleZ = -0.6981317F;

		bodyWheelModel[4].addShapeBox(0F, -7F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyWheelModel[4].setRotationPoint(-65.5F, -2.5F, -0.5F);
		bodyWheelModel[4].rotateAngleZ = -0.41887902F;

		bodyWheelModel[5].addShapeBox(0F, 0.5F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyWheelModel[5].setRotationPoint(-67.5F, 0.5F, -1.5F);
		bodyWheelModel[5].rotateAngleZ = -0.6981317F;

		bodyWheelModel[6].addShapeBox(0F, -7F, 0F, 1, 6, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 122
		bodyWheelModel[6].setRotationPoint(-65.5F, 4.5F, -0.5F);

		bodyWheelModel[7].addShapeBox(0F, 0F, 0F, 15, 4, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 123
		bodyWheelModel[7].setRotationPoint(-77F, -10.5F, -4F);
		bodyWheelModel[7].rotateAngleZ = -0.2268928F;

		bodyWheelModel[8].addShapeBox(0F, 0F, 0F, 15, 4, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 124
		bodyWheelModel[8].setRotationPoint(-77F, -10.5F, 3F);
		bodyWheelModel[8].rotateAngleZ = -0.2268928F;
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 125
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 126
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 127
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 128
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 129
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 130
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 131

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 15, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		leftWingWheelModel[0].setRotationPoint(69F, 0.5F, -37.5F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 15, 5, 3, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		leftWingWheelModel[1].setRotationPoint(69F, -4.5F, -37.5F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 15, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 127
		leftWingWheelModel[2].setRotationPoint(69F, 5.5F, -37.5F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		leftWingWheelModel[3].setRotationPoint(73.5F, -10.5F, -38.5F);
		leftWingWheelModel[3].rotateAngleX = 0.01745329F;
		leftWingWheelModel[3].rotateAngleZ = -0.03490659F;

		leftWingWheelModel[4].addShapeBox(0F, -4F, 0F, 1, 4, 1, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 129
		leftWingWheelModel[4].setRotationPoint(73.5F, -10.5F, -38.5F);
		leftWingWheelModel[4].rotateAngleX = 0.01745329F;
		leftWingWheelModel[4].rotateAngleZ = -0.03490659F;

		leftWingWheelModel[5].addShapeBox(0F, -11F, 0F, 1, 11, 1, 0F,0.3F, -1F, 0.3F, 0.3F, -1F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 130
		leftWingWheelModel[5].setRotationPoint(73.5F, -10.5F, -32.5F);
		leftWingWheelModel[5].rotateAngleX = -0.99483767F;
		leftWingWheelModel[5].rotateAngleZ = -0.03490659F;

		leftWingWheelModel[6].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 131
		leftWingWheelModel[6].setRotationPoint(73.5F, -10.5F, -32.5F);
		leftWingWheelModel[6].rotateAngleX = -0.99483767F;
		leftWingWheelModel[6].rotateAngleZ = -0.03490659F;
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 135
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 136
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 137
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 138
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 139
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 140
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 141

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 15, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		rightWingWheelModel[0].setRotationPoint(69F, 0.5F, 34.5F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 15, 5, 3, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		rightWingWheelModel[1].setRotationPoint(69F, -4.5F, 34.5F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 15, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 137
		rightWingWheelModel[2].setRotationPoint(69F, 5.5F, 34.5F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		rightWingWheelModel[3].setRotationPoint(73.5F, -10.5F, 37.5F);
		rightWingWheelModel[3].rotateAngleX = 0.01745329F;
		rightWingWheelModel[3].rotateAngleZ = -0.03490659F;

		rightWingWheelModel[4].addShapeBox(0F, -4F, 0F, 1, 4, 1, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 139
		rightWingWheelModel[4].setRotationPoint(73.5F, -10.5F, 37.5F);
		rightWingWheelModel[4].rotateAngleX = 0.01745329F;
		rightWingWheelModel[4].rotateAngleZ = -0.03490659F;

		rightWingWheelModel[5].addShapeBox(0F, -10.5F, 0F, 1, 11, 1, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, -2F, 0.3F, 0.3F, -2F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 140
		rightWingWheelModel[5].setRotationPoint(73.5F, -10.5F, 31.5F);
		rightWingWheelModel[5].rotateAngleX = 0.99483767F;
		rightWingWheelModel[5].rotateAngleZ = -0.03490659F;

		rightWingWheelModel[6].addShapeBox(0F, 0.5F, 0F, 1, 7, 1, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 141
		rightWingWheelModel[6].setRotationPoint(73.5F, -10.5F, 31.5F);
		rightWingWheelModel[6].rotateAngleX = 0.99483767F;
		rightWingWheelModel[6].rotateAngleZ = -0.03490659F;
	}
}