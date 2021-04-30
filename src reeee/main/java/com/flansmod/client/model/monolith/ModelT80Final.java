//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: T80BV
// Model Creator: 
// Created on: -
// Last changed on: -

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelT80Final extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelT80Final() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[107];
		turretModel = new ModelRendererTurbo[121];
		barrelModel = new ModelRendererTurbo[15];
		leftTrackWheelModels = new ModelRendererTurbo[24];
		rightTrackWheelModels = new ModelRendererTurbo[24];
		leftTrackModel = new ModelRendererTurbo[5];
		rightTrackModel = new ModelRendererTurbo[5];

		initbodyModel_1();
		initturretModel_1();
		initbarrelModel_1();
		initleftTrackWheelModels_1();
		initrightTrackWheelModels_1();
		initleftTrackModel_1();
		initrightTrackModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportCR.TopAngle
		bodyModel[1] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import ImportCR.FrontLowerGlacis
		bodyModel[2] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import ImportCR.MainBulk
		bodyModel[3] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import ImportCR.LowerFrontCoverUp
		bodyModel[4] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Import ImportCR.UnderAngleCoveruptop
		bodyModel[5] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Import ImportCR.UnderAngleCoverupBottom
		bodyModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportCR.RightTrackFront
		bodyModel[7] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import ImportCR.RightTrackFrontTop
		bodyModel[8] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Import ImportCR.RightTrackMain
		bodyModel[9] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import ImportCR.rightTrackFrontCoverUp
		bodyModel[10] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Import ImportCR.BackTopTrack
		bodyModel[11] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Import ImportCR.BackBottomTrackright
		bodyModel[12] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Import ImportCR.BackBottomTrackleft
		bodyModel[13] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Import ImportCR.UtilityLog
		bodyModel[14] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import ImportCR.LogHolderRight
		bodyModel[15] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import ImportCR.LogHolderLeft
		bodyModel[16] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Import ImportCR.LeftTrackFrontTop
		bodyModel[17] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Import ImportCR.LeftTrackFront
		bodyModel[18] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Import ImportCR.leftTrackFrontCoverUp
		bodyModel[19] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Import ImportCR.LeftTrackMain
		bodyModel[20] = new ModelRendererTurbo(this, 697, 25, textureX, textureY); // Import ImportCR.BackTopTrackLeft
		bodyModel[21] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportCR.LeftLight
		bodyModel[22] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import ImportCR.RightLight
		bodyModel[23] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import ImportCR.BeardArmor
		bodyModel[24] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Import ImportCR.DriverThingy
		bodyModel[25] = new ModelRendererTurbo(this, 873, 25, textureX, textureY); // Import ImportCR.BackBonusArea
		bodyModel[26] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import ImportCR.LowerReactiveArmor
		bodyModel[27] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Import ImportCR.FuelTankconnectorRight
		bodyModel[28] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Import ImportCR.FuelTankconnectorLeft
		bodyModel[29] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Import Box101
		bodyModel[30] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Import Box110
		bodyModel[31] = new ModelRendererTurbo(this, 961, 17, textureX, textureY); // Import Box111
		bodyModel[32] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Import Box112
		bodyModel[33] = new ModelRendererTurbo(this, 777, 25, textureX, textureY); // Import Box114
		bodyModel[34] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import Box116
		bodyModel[35] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Import Box117
		bodyModel[36] = new ModelRendererTurbo(this, 521, 17, textureX, textureY); // Import Box124
		bodyModel[37] = new ModelRendererTurbo(this, 857, 25, textureX, textureY); // Import Box125
		bodyModel[38] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Box126
		bodyModel[39] = new ModelRendererTurbo(this, 961, 33, textureX, textureY); // Import Box128
		bodyModel[40] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Import Box129
		bodyModel[41] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Import Box195
		bodyModel[42] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Import Box202
		bodyModel[43] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Import Box203
		bodyModel[44] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Import Box204
		bodyModel[45] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Import Box205
		bodyModel[46] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Import Box206
		bodyModel[47] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Import Box207
		bodyModel[48] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Import Box208
		bodyModel[49] = new ModelRendererTurbo(this, 529, 9, textureX, textureY); // Import Box209
		bodyModel[50] = new ModelRendererTurbo(this, 1009, 17, textureX, textureY); // Import Box229
		bodyModel[51] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Import Box230
		bodyModel[52] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Import Box231
		bodyModel[53] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Import Box232
		bodyModel[54] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Import Box233
		bodyModel[55] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Import Box234
		bodyModel[56] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Import Box235
		bodyModel[57] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Import Box236
		bodyModel[58] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Import Box237
		bodyModel[59] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Import Box238
		bodyModel[60] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Import Box240
		bodyModel[61] = new ModelRendererTurbo(this, 513, 25, textureX, textureY); // Import Box242
		bodyModel[62] = new ModelRendererTurbo(this, 561, 25, textureX, textureY); // Import Box243
		bodyModel[63] = new ModelRendererTurbo(this, 577, 25, textureX, textureY); // Import Box244
		bodyModel[64] = new ModelRendererTurbo(this, 593, 25, textureX, textureY); // Import Box245
		bodyModel[65] = new ModelRendererTurbo(this, 609, 25, textureX, textureY); // Import Box246
		bodyModel[66] = new ModelRendererTurbo(this, 657, 25, textureX, textureY); // Import Box247
		bodyModel[67] = new ModelRendererTurbo(this, 673, 25, textureX, textureY); // Import Box248
		bodyModel[68] = new ModelRendererTurbo(this, 689, 25, textureX, textureY); // Import Box249
		bodyModel[69] = new ModelRendererTurbo(this, 761, 25, textureX, textureY); // Import Box250
		bodyModel[70] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Import Box251
		bodyModel[71] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Import Box252
		bodyModel[72] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Import Box253
		bodyModel[73] = new ModelRendererTurbo(this, 681, 41, textureX, textureY); // Import Box254
		bodyModel[74] = new ModelRendererTurbo(this, 769, 41, textureX, textureY); // Import Box255
		bodyModel[75] = new ModelRendererTurbo(this, 785, 41, textureX, textureY); // Import Box256
		bodyModel[76] = new ModelRendererTurbo(this, 801, 41, textureX, textureY); // Import Box257
		bodyModel[77] = new ModelRendererTurbo(this, 817, 41, textureX, textureY); // Import Box258
		bodyModel[78] = new ModelRendererTurbo(this, 857, 41, textureX, textureY); // Import Box259
		bodyModel[79] = new ModelRendererTurbo(this, 873, 41, textureX, textureY); // Import Box260
		bodyModel[80] = new ModelRendererTurbo(this, 889, 41, textureX, textureY); // Import Box261
		bodyModel[81] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Import Box262
		bodyModel[82] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Import Box263
		bodyModel[83] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Import Box264
		bodyModel[84] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Import Box265
		bodyModel[85] = new ModelRendererTurbo(this, 689, 49, textureX, textureY); // Import Box266
		bodyModel[86] = new ModelRendererTurbo(this, 729, 49, textureX, textureY); // Import Box267
		bodyModel[87] = new ModelRendererTurbo(this, 769, 49, textureX, textureY); // Import Box268
		bodyModel[88] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import Box269
		bodyModel[89] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Import Box270
		bodyModel[90] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Import Box271
		bodyModel[91] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Import Box289
		bodyModel[92] = new ModelRendererTurbo(this, 993, 49, textureX, textureY); // Import Box290
		bodyModel[93] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Import Box291
		bodyModel[94] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Import Box292
		bodyModel[95] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Import Box297
		bodyModel[96] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Import Box298
		bodyModel[97] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Import Box299
		bodyModel[98] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Import Box300
		bodyModel[99] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Import Box301
		bodyModel[100] = new ModelRendererTurbo(this, 881, 9, textureX, textureY); // Import Box303
		bodyModel[101] = new ModelRendererTurbo(this, 913, 9, textureX, textureY); // Import Box304
		bodyModel[102] = new ModelRendererTurbo(this, 961, 9, textureX, textureY); // Import Box305
		bodyModel[103] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Import Box306
		bodyModel[104] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Import Box307
		bodyModel[105] = new ModelRendererTurbo(this, 585, 65, textureX, textureY); // Import Box308
		bodyModel[106] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Import Box309

		bodyModel[0].addBox(0F, 0F, 0F, 24, 1, 34, 0F); // Import ImportCR.TopAngle
		bodyModel[0].setRotationPoint(29F, -14F, -17F);
		bodyModel[0].rotateAngleZ = -0.40142573F;

		bodyModel[1].addBox(-2.9F, 0F, 0F, 4, 10, 34, 0F); // Import ImportCR.FrontLowerGlacis
		bodyModel[1].setRotationPoint(49.5F, -4.2F, -17F);
		bodyModel[1].rotateAngleZ = -0.66322512F;

		bodyModel[2].addBox(0F, 0F, 0F, 65, 18, 34, 0F); // Import ImportCR.MainBulk
		bodyModel[2].setRotationPoint(-36F, -14F, -17F);

		bodyModel[3].addBox(0F, 0F, 0F, 19, 12, 34, 0F); // Import ImportCR.LowerFrontCoverUp
		bodyModel[3].setRotationPoint(25F, -8F, -17F);

		bodyModel[4].addBox(0F, 0F, 0F, 6, 3, 34, 0F); // Import ImportCR.UnderAngleCoveruptop
		bodyModel[4].setRotationPoint(43F, -7F, -17F);
		bodyModel[4].rotateAngleZ = -0.26179939F;

		bodyModel[5].addBox(0F, -2.1F, 0F, 10, 3, 34, 0F); // Import ImportCR.UnderAngleCoverupBottom
		bodyModel[5].setRotationPoint(39F, 1F, -17F);
		bodyModel[5].rotateAngleZ = 0.55850536F;

		bodyModel[6].addBox(-3F, 2F, 0F, 4, 6, 10, 0F); // Import ImportCR.RightTrackFront
		bodyModel[6].setRotationPoint(55F, -11F, 17F);
		bodyModel[6].rotateAngleZ = 0.52359878F;

		bodyModel[7].addBox(-4F, 0F, 0F, 5, 12, 10, 0F); // Import ImportCR.RightTrackFrontTop
		bodyModel[7].setRotationPoint(45F, -12F, 17F);
		bodyModel[7].rotateAngleZ = 1.30899694F;

		bodyModel[8].addBox(0F, 0F, 0F, 81, 13, 9, 0F); // Import ImportCR.RightTrackMain
		bodyModel[8].setRotationPoint(-35.5F, -13F, 17F);

		bodyModel[9].addBox(0F, -8.5F, 0F, 11, 8, 10, 0F); // Import ImportCR.rightTrackFrontCoverUp
		bodyModel[9].setRotationPoint(45.5F, 0F, 17F);
		bodyModel[9].rotateAngleZ = 0.08726646F;

		bodyModel[10].addBox(0F, 0F, 0F, 26, 7, 10, 0F); // Import ImportCR.BackTopTrack
		bodyModel[10].setRotationPoint(-45F, -13F, 17F);

		bodyModel[11].addBox(0F, -6F, 0F, 11, 6, 10, 0F); // Import ImportCR.BackBottomTrackright
		bodyModel[11].setRotationPoint(-45F, -6F, 17F);
		bodyModel[11].rotateAngleZ = -0.55850536F;

		bodyModel[12].addBox(0F, -6F, -27F, 11, 6, 10, 0F); // Import ImportCR.BackBottomTrackleft
		bodyModel[12].setRotationPoint(-45F, -6F, 0F);
		bodyModel[12].rotateAngleZ = -0.5585054F;

		bodyModel[13].addBox(0F, 0F, 0F, 3, 3, 50, 0F); // Import ImportCR.UtilityLog
		bodyModel[13].setRotationPoint(-46F, -4F, -25F);

		bodyModel[14].addBox(-4F, 8F, -0.5F, 8, 1, 1, 0F); // Import ImportCR.LogHolderRight
		bodyModel[14].setRotationPoint(-47F, -9F, 12F);
		bodyModel[14].rotateAngleZ = 0.52359878F;

		bodyModel[15].addBox(-4F, 8F, -0.5F, 8, 1, 1, 0F); // Import ImportCR.LogHolderLeft
		bodyModel[15].setRotationPoint(-47F, -9F, -12F);
		bodyModel[15].rotateAngleZ = 0.52359878F;

		bodyModel[16].addBox(-4F, 0F, 0F, 5, 12, 10, 0F); // Import ImportCR.LeftTrackFrontTop
		bodyModel[16].setRotationPoint(45F, -12F, -27F);
		bodyModel[16].rotateAngleZ = 1.30899694F;

		bodyModel[17].addBox(-3F, 2F, 0F, 4, 6, 10, 0F); // Import ImportCR.LeftTrackFront
		bodyModel[17].setRotationPoint(55F, -11F, -27F);
		bodyModel[17].rotateAngleZ = 0.52359878F;

		bodyModel[18].addBox(0F, -8.5F, 0F, 11, 8, 10, 0F); // Import ImportCR.leftTrackFrontCoverUp
		bodyModel[18].setRotationPoint(45.5F, 0F, -27F);
		bodyModel[18].rotateAngleZ = 0.13962634F;

		bodyModel[19].addBox(0F, 0F, 0F, 81, 13, 9, 0F); // Import ImportCR.LeftTrackMain
		bodyModel[19].setRotationPoint(-35.5F, -13F, -26F);

		bodyModel[20].addBox(0F, 0F, 0F, 26, 7, 10, 0F); // Import ImportCR.BackTopTrackLeft
		bodyModel[20].setRotationPoint(-45F, -13F, -27F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 5, 3, 0F); // Import ImportCR.LeftLight
		bodyModel[21].setRotationPoint(48F, -10F, -15F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 5, 3, 0F); // Import ImportCR.RightLight
		bodyModel[22].setRotationPoint(48F, -10F, 12F);

		bodyModel[23].addBox(-1.7F, -1F, 0F, 0, 8, 16, 0F); // Import ImportCR.BeardArmor
		bodyModel[23].setRotationPoint(52F, -2F, -16.2F);
		bodyModel[23].rotateAngleZ = -0.20943951F;

		bodyModel[24].addShapeBox(0F, 0F, 0F, 5, 3, 10, 0F,0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F); // Import ImportCR.DriverThingy
		bodyModel[24].setRotationPoint(29F, -14.8F, -5F);

		bodyModel[25].addBox(0F, 0F, 0F, 24, 3, 34, 0F); // Import ImportCR.BackBonusArea
		bodyModel[25].setRotationPoint(-44F, -14F, -17F);

		bodyModel[26].addBox(14.9F, -0.8F, 0F, 4, 1, 2, 0F); // Import ImportCR.LowerReactiveArmor
		bodyModel[26].setRotationPoint(34F, -13F, -9.6F);
		bodyModel[26].rotateAngleZ = -0.40142573F;

		bodyModel[27].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Import ImportCR.FuelTankconnectorRight
		bodyModel[27].setRotationPoint(-50F, -15F, 25F);

		bodyModel[28].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Import ImportCR.FuelTankconnectorLeft
		bodyModel[28].setRotationPoint(-50F, -15F, -26F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 4, 6, 0F,0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 4F, 2F, 0F, 4F, 2F, 0F, 4F, 0F, 0F, 4F); // Import Box101
		bodyModel[29].setRotationPoint(25F, -15.8F, -3F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 0, 8, 0F,0F, 2F, 0F, 18F, 0F, 0F, 18F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 18F, 0F, 0F, 18F, 0F, 0F, 0F, 0F, 0F); // Import Box110
		bodyModel[30].setRotationPoint(20F, -13F, 18F);

		bodyModel[31].addBox(0F, 0F, 0F, 16, 2, 8, 0F); // Import Box111
		bodyModel[31].setRotationPoint(4F, -15F, 18F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 18F, 0F, 0F, 18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 18F, 0F, 0F, 18F, 0F, 1F, 0F, 0F, 1F); // Import Box112
		bodyModel[32].setRotationPoint(-17F, -15.5F, 18F);

		bodyModel[33].addBox(0F, 0F, 0F, 21, 2, 8, 0F); // Import Box114
		bodyModel[33].setRotationPoint(-17F, -14.5F, 18F);

		bodyModel[34].addBox(0F, 0F, 0F, 27, 2, 8, 0F); // Import Box116
		bodyModel[34].setRotationPoint(-44F, -14.5F, 18F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 0, 7, 0F,0F, 1F, 0F, 23F, 1F, 0F, 23F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 23F, 0F, 0F, 23F, 0F, 1F, 0F, 0F, 1F); // Import Box117
		bodyModel[35].setRotationPoint(-43F, -14.5F, 18F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 0, 8, 0F,0F, 2F, 0F, 18F, 0F, 0F, 18F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 18F, 0F, 0F, 18F, 0F, 0F, 0F, 0F, 0F); // Import Box124
		bodyModel[36].setRotationPoint(20F, -13F, -26F);

		bodyModel[37].addBox(0F, 0F, 0F, 16, 2, 8, 0F); // Import Box125
		bodyModel[37].setRotationPoint(4F, -15F, -26F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 18F, 0F, 0F, 18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 18F, 0F, 1F, 18F, 0F, 0F, 0F, 0F, 0F); // Import Box126
		bodyModel[38].setRotationPoint(-17F, -15.5F, -25F);

		bodyModel[39].addBox(0F, 0F, 0F, 21, 2, 8, 0F); // Import Box128
		bodyModel[39].setRotationPoint(-17F, -14.5F, -26F);

		bodyModel[40].addBox(0F, 0F, 0F, 27, 2, 8, 0F); // Import Box129
		bodyModel[40].setRotationPoint(-44F, -14.5F, -26F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 17, 2, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 5F, 0F, 5F); // Import Box195
		bodyModel[41].setRotationPoint(-38F, -16F, -12F);

		bodyModel[42].addBox(14.9F, -0.8F, 0F, 4, 1, 2, 0F); // Import Box202
		bodyModel[42].setRotationPoint(34F, -13F, -7.4F);
		bodyModel[42].rotateAngleZ = -0.40142573F;

		bodyModel[43].addBox(14.9F, -0.8F, 0F, 4, 1, 2, 0F); // Import Box203
		bodyModel[43].setRotationPoint(34F, -13F, -5.2F);
		bodyModel[43].rotateAngleZ = -0.40142573F;

		bodyModel[44].addBox(14.9F, -0.8F, 0F, 4, 1, 2, 0F); // Import Box204
		bodyModel[44].setRotationPoint(34F, -13F, -3F);
		bodyModel[44].rotateAngleZ = -0.40142573F;

		bodyModel[45].addBox(14.9F, -0.8F, 0F, 4, 1, 2, 0F); // Import Box205
		bodyModel[45].setRotationPoint(34F, -13F, -0.8F);
		bodyModel[45].rotateAngleZ = -0.40142573F;

		bodyModel[46].addBox(14.9F, -0.8F, 0F, 4, 1, 2, 0F); // Import Box206
		bodyModel[46].setRotationPoint(34F, -13F, 1.4F);
		bodyModel[46].rotateAngleZ = -0.40142573F;

		bodyModel[47].addBox(14.9F, -0.8F, 0F, 4, 1, 2, 0F); // Import Box207
		bodyModel[47].setRotationPoint(34F, -13F, 5.8F);
		bodyModel[47].rotateAngleZ = -0.40142573F;

		bodyModel[48].addBox(14.9F, -0.8F, 0F, 4, 1, 2, 0F); // Import Box208
		bodyModel[48].setRotationPoint(34F, -13F, 8F);
		bodyModel[48].rotateAngleZ = -0.40142573F;

		bodyModel[49].addBox(14.9F, -0.8F, 0F, 4, 1, 2, 0F); // Import Box209
		bodyModel[49].setRotationPoint(34F, -13F, 3.6F);
		bodyModel[49].rotateAngleZ = -0.40142573F;

		bodyModel[50].addBox(10.5F, -0.8F, 0F, 4, 1, 2, 0F); // Import Box229
		bodyModel[50].setRotationPoint(34F, -13F, -9.6F);
		bodyModel[50].rotateAngleZ = -0.40142573F;

		bodyModel[51].addBox(10.5F, -0.8F, 0F, 4, 1, 2, 0F); // Import Box230
		bodyModel[51].setRotationPoint(34F, -13F, -7.4F);
		bodyModel[51].rotateAngleZ = -0.40142573F;

		bodyModel[52].addBox(10.5F, -0.8F, 0F, 4, 1, 2, 0F); // Import Box231
		bodyModel[52].setRotationPoint(34F, -13F, -5.2F);
		bodyModel[52].rotateAngleZ = -0.40142573F;

		bodyModel[53].addBox(10.5F, -0.8F, 0F, 4, 1, 2, 0F); // Import Box232
		bodyModel[53].setRotationPoint(34F, -13F, -3F);
		bodyModel[53].rotateAngleZ = -0.40142573F;

		bodyModel[54].addBox(10.5F, -0.8F, 0F, 4, 1, 2, 0F); // Import Box233
		bodyModel[54].setRotationPoint(34F, -13F, -0.8F);
		bodyModel[54].rotateAngleZ = -0.40142573F;

		bodyModel[55].addBox(10.5F, -0.8F, 0F, 4, 1, 2, 0F); // Import Box234
		bodyModel[55].setRotationPoint(34F, -13F, 1.4F);
		bodyModel[55].rotateAngleZ = -0.40142573F;

		bodyModel[56].addBox(10.5F, -0.8F, 0F, 4, 1, 2, 0F); // Import Box235
		bodyModel[56].setRotationPoint(34F, -13F, 3.6F);
		bodyModel[56].rotateAngleZ = -0.40142573F;

		bodyModel[57].addBox(10.5F, -0.8F, 0F, 4, 1, 2, 0F); // Import Box236
		bodyModel[57].setRotationPoint(34F, -13F, 5.8F);
		bodyModel[57].rotateAngleZ = -0.40142573F;

		bodyModel[58].addBox(10.5F, -0.8F, 0F, 4, 1, 2, 0F); // Import Box237
		bodyModel[58].setRotationPoint(34F, -13F, 8F);
		bodyModel[58].rotateAngleZ = -0.40142573F;

		bodyModel[59].addBox(10.5F, -0.8F, 0F, 4, 1, 2, 0F); // Import Box238
		bodyModel[59].setRotationPoint(34F, -13F, 12.5F);
		bodyModel[59].rotateAngleZ = -0.40142573F;

		bodyModel[60].addBox(10.5F, -0.8F, 0F, 4, 1, 2, 0F); // Import Box240
		bodyModel[60].setRotationPoint(34F, -13F, 10.3F);
		bodyModel[60].rotateAngleZ = -0.40142573F;

		bodyModel[61].addBox(10.5F, -0.8F, 0F, 4, 1, 2, 0F); // Import Box242
		bodyModel[61].setRotationPoint(34F, -13F, -11.9F);
		bodyModel[61].rotateAngleZ = -0.40142573F;

		bodyModel[62].addBox(10.5F, -0.8F, 0F, 4, 1, 2, 0F); // Import Box243
		bodyModel[62].setRotationPoint(34F, -13F, -14.1F);
		bodyModel[62].rotateAngleZ = -0.40142573F;

		bodyModel[63].addBox(6.1F, -0.8F, 0F, 4, 1, 2, 0F); // Import Box244
		bodyModel[63].setRotationPoint(34F, -13F, -16.3F);
		bodyModel[63].rotateAngleZ = -0.40142573F;

		bodyModel[64].addBox(6.1F, -0.8F, 0F, 4, 1, 2, 0F); // Import Box245
		bodyModel[64].setRotationPoint(34F, -13F, -14.1F);
		bodyModel[64].rotateAngleZ = -0.40142573F;

		bodyModel[65].addBox(6.1F, -0.8F, 0F, 4, 1, 2, 0F); // Import Box246
		bodyModel[65].setRotationPoint(34F, -13F, -11.9F);
		bodyModel[65].rotateAngleZ = -0.40142573F;

		bodyModel[66].addBox(6.1F, -0.8F, 0F, 4, 1, 2, 0F); // Import Box247
		bodyModel[66].setRotationPoint(34F, -13F, -9.6F);
		bodyModel[66].rotateAngleZ = -0.40142573F;

		bodyModel[67].addBox(6.1F, -0.8F, 0F, 4, 1, 2, 0F); // Import Box248
		bodyModel[67].setRotationPoint(34F, -13F, -7.4F);
		bodyModel[67].rotateAngleZ = -0.40142573F;

		bodyModel[68].addBox(6.1F, -0.8F, 0F, 4, 1, 2, 0F); // Import Box249
		bodyModel[68].setRotationPoint(34F, -13F, -5.2F);
		bodyModel[68].rotateAngleZ = -0.40142573F;

		bodyModel[69].addBox(6.1F, -0.8F, 0F, 4, 1, 2, 0F); // Import Box250
		bodyModel[69].setRotationPoint(34F, -13F, -3F);
		bodyModel[69].rotateAngleZ = -0.40142573F;

		bodyModel[70].addBox(6.1F, -0.8F, 0F, 4, 1, 2, 0F); // Import Box251
		bodyModel[70].setRotationPoint(34F, -13F, -0.8F);
		bodyModel[70].rotateAngleZ = -0.40142573F;

		bodyModel[71].addBox(6.1F, -0.8F, 0F, 4, 1, 2, 0F); // Import Box252
		bodyModel[71].setRotationPoint(34F, -13F, 1.4F);
		bodyModel[71].rotateAngleZ = -0.40142573F;

		bodyModel[72].addBox(6.1F, -0.8F, 0F, 4, 1, 2, 0F); // Import Box253
		bodyModel[72].setRotationPoint(34F, -13F, 3.6F);
		bodyModel[72].rotateAngleZ = -0.40142573F;

		bodyModel[73].addBox(6.1F, -0.8F, 0F, 4, 1, 2, 0F); // Import Box254
		bodyModel[73].setRotationPoint(34F, -13F, 5.8F);
		bodyModel[73].rotateAngleZ = -0.40142573F;

		bodyModel[74].addBox(6.1F, -0.8F, 0F, 4, 1, 2, 0F); // Import Box255
		bodyModel[74].setRotationPoint(34F, -13F, 8F);
		bodyModel[74].rotateAngleZ = -0.40142573F;

		bodyModel[75].addBox(6.1F, -0.8F, 0F, 4, 1, 2, 0F); // Import Box256
		bodyModel[75].setRotationPoint(34F, -13F, 10.3F);
		bodyModel[75].rotateAngleZ = -0.40142573F;

		bodyModel[76].addBox(6.1F, -0.8F, 0F, 4, 1, 2, 0F); // Import Box257
		bodyModel[76].setRotationPoint(34F, -13F, 12.5F);
		bodyModel[76].rotateAngleZ = -0.40142573F;

		bodyModel[77].addBox(6.1F, -0.8F, 0F, 4, 1, 2, 0F); // Import Box258
		bodyModel[77].setRotationPoint(34F, -13F, 14.7F);
		bodyModel[77].rotateAngleZ = -0.40142573F;

		bodyModel[78].addBox(1.7F, -0.8F, 0F, 4, 1, 2, 0F); // Import Box259
		bodyModel[78].setRotationPoint(34F, -13F, 14.7F);
		bodyModel[78].rotateAngleZ = -0.40142573F;

		bodyModel[79].addBox(1.7F, -0.8F, 0F, 4, 1, 2, 0F); // Import Box260
		bodyModel[79].setRotationPoint(34F, -13F, 12.5F);
		bodyModel[79].rotateAngleZ = -0.40142573F;

		bodyModel[80].addBox(1.7F, -0.8F, 0F, 4, 1, 2, 0F); // Import Box261
		bodyModel[80].setRotationPoint(34F, -13F, 10.3F);
		bodyModel[80].rotateAngleZ = -0.40142573F;

		bodyModel[81].addBox(1.7F, -0.8F, 0F, 4, 1, 2, 0F); // Import Box262
		bodyModel[81].setRotationPoint(34F, -13F, -11.9F);
		bodyModel[81].rotateAngleZ = -0.40142573F;

		bodyModel[82].addBox(1.7F, -0.8F, 0F, 4, 1, 2, 0F); // Import Box263
		bodyModel[82].setRotationPoint(34F, -13F, -14.1F);
		bodyModel[82].rotateAngleZ = -0.40142573F;

		bodyModel[83].addBox(1.7F, -0.8F, 0F, 4, 1, 2, 0F); // Import Box264
		bodyModel[83].setRotationPoint(34F, -13F, -16.3F);
		bodyModel[83].rotateAngleZ = -0.40142573F;

		bodyModel[84].addBox(0F, 0F, 0F, 9, 5, 12, 0F); // Import Box265
		bodyModel[84].setRotationPoint(-50.5F, -22F, 17F);

		bodyModel[85].addShapeBox(2F, -2F, 0F, 5, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Import Box266
		bodyModel[85].setRotationPoint(-50.5F, -22F, 17F);

		bodyModel[86].addShapeBox(2F, 5F, 0F, 5, 2, 12, 0F,2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box267
		bodyModel[86].setRotationPoint(-50.5F, -22F, 17F);

		bodyModel[87].addShapeBox(2F, -2F, 0F, 5, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Import Box268
		bodyModel[87].setRotationPoint(-50.5F, -22F, -29F);

		bodyModel[88].addBox(0F, 0F, 0F, 9, 5, 12, 0F); // Import Box269
		bodyModel[88].setRotationPoint(-50.5F, -22F, -29F);

		bodyModel[89].addShapeBox(2F, 5F, 0F, 5, 2, 12, 0F,2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box270
		bodyModel[89].setRotationPoint(-50.5F, -22F, -29F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 2F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 2F, 0F, 4F); // Import Box271
		bodyModel[90].setRotationPoint(21F, -15.8F, -3F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 8, 11, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Import Box289
		bodyModel[91].setRotationPoint(-44F, -11F, -17F);

		bodyModel[92].addBox(0F, 0F, 0F, 0, 6, 10, 0F); // Import Box290
		bodyModel[92].setRotationPoint(-45F, -6F, 17F);
		bodyModel[92].rotateAngleZ = -0.52359878F;

		bodyModel[93].addBox(0F, 0F, 0F, 0, 6, 10, 0F); // Import Box291
		bodyModel[93].setRotationPoint(-45F, -6F, -27F);
		bodyModel[93].rotateAngleZ = -0.52359878F;

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 5, 18, 0F,0F, 0F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Import Box292
		bodyModel[94].setRotationPoint(-48F, -10F, -9F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 3, 0, 7, 0F,0F, 1F, 0F, 23F, 1F, 0F, 23F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 23F, 0F, 1F, 23F, 0F, 0F, 0F, 0F, 0F); // Import Box297
		bodyModel[95].setRotationPoint(-43F, -14.5F, -25F);

		bodyModel[96].addBox(0F, 0F, 0F, 45, 13, 1, 0F); // Import Box298
		bodyModel[96].setRotationPoint(-35.5F, -13F, 26.5F);

		bodyModel[97].addBox(0F, 0F, 0F, 45, 13, 1, 0F); // Import Box299
		bodyModel[97].setRotationPoint(-35.5F, -13F, -27.5F);

		bodyModel[98].addBox(0F, 0F, 0F, 36, 13, 1, 0F); // Import Box300
		bodyModel[98].setRotationPoint(9.5F, -13F, -27.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 6, 0, 1, 0F,0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Import Box301
		bodyModel[99].setRotationPoint(9.5F, 0F, -27.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 6, 0, 1, 0F,0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Import Box303
		bodyModel[100].setRotationPoint(21.5F, 0F, -27.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 6, 0, 1, 0F,0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Import Box304
		bodyModel[101].setRotationPoint(33.5F, 0F, -27.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 6, 0, 1, 0F,0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Import Box305
		bodyModel[102].setRotationPoint(9.5F, 0F, 26.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 6, 0, 1, 0F,0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Import Box306
		bodyModel[103].setRotationPoint(21.5F, 0F, 26.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 6, 0, 1, 0F,0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Import Box307
		bodyModel[104].setRotationPoint(33.5F, 0F, 26.5F);

		bodyModel[105].addBox(0F, 0F, 0F, 36, 13, 1, 0F); // Import Box308
		bodyModel[105].setRotationPoint(9.5F, -13F, 26.5F);

		bodyModel[106].addBox(-1.7F, -1F, 0F, 0, 8, 16, 0F); // Import Box309
		bodyModel[106].setRotationPoint(52F, -2F, 0.2F);
		bodyModel[106].rotateAngleZ = -0.20943951F;
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 801, 57, textureX, textureY); // Import ImportTR.BarrelBase
		turretModel[1] = new ModelRendererTurbo(this, 713, 49, textureX, textureY); // Import ImportTR.Camera
		turretModel[2] = new ModelRendererTurbo(this, 825, 57, textureX, textureY); // Import ImportTR.Commanderhatch
		turretModel[3] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Import ImportTR.OtherHatch
		turretModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import ImportTR.TurretLight
		turretModel[5] = new ModelRendererTurbo(this, 641, 65, textureX, textureY); // Import ImportTR.WeirdThing
		turretModel[6] = new ModelRendererTurbo(this, 665, 65, textureX, textureY); // Import ImportTR.MassiveExposedFuelTank
		turretModel[7] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Import ImportTR.MGStick
		turretModel[8] = new ModelRendererTurbo(this, 721, 65, textureX, textureY); // Import ImportTR.TopReactiveArmor
		turretModel[9] = new ModelRendererTurbo(this, 769, 65, textureX, textureY); // Import Box14
		turretModel[10] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import Box15
		turretModel[11] = new ModelRendererTurbo(this, 865, 65, textureX, textureY); // Import Box16
		turretModel[12] = new ModelRendererTurbo(this, 753, 49, textureX, textureY); // Import Box17
		turretModel[13] = new ModelRendererTurbo(this, 913, 65, textureX, textureY); // Import Box18
		turretModel[14] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import Box20
		turretModel[15] = new ModelRendererTurbo(this, 961, 49, textureX, textureY); // Import MiniLight
		turretModel[16] = new ModelRendererTurbo(this, 689, 49, textureX, textureY); // Import Box23
		turretModel[17] = new ModelRendererTurbo(this, 729, 49, textureX, textureY); // Import Box24
		turretModel[18] = new ModelRendererTurbo(this, 753, 49, textureX, textureY); // Import Box25
		turretModel[19] = new ModelRendererTurbo(this, 769, 49, textureX, textureY); // Import Box26
		turretModel[20] = new ModelRendererTurbo(this, 977, 49, textureX, textureY); // Import Box28
		turretModel[21] = new ModelRendererTurbo(this, 993, 49, textureX, textureY); // Import Box29
		turretModel[22] = new ModelRendererTurbo(this, 1009, 49, textureX, textureY); // Import Box30
		turretModel[23] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import Box31
		turretModel[24] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Import Box32
		turretModel[25] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Import Box33
		turretModel[26] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Import Box34
		turretModel[27] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Import Box35
		turretModel[28] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Import Box36
		turretModel[29] = new ModelRendererTurbo(this, 689, 57, textureX, textureY); // Import Box37
		turretModel[30] = new ModelRendererTurbo(this, 729, 57, textureX, textureY); // Import Box38
		turretModel[31] = new ModelRendererTurbo(this, 793, 57, textureX, textureY); // Import Box39
		turretModel[32] = new ModelRendererTurbo(this, 817, 57, textureX, textureY); // Import Box40
		turretModel[33] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import Box41
		turretModel[34] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Import Box44
		turretModel[35] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Import Box45
		turretModel[36] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Import Box46
		turretModel[37] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Import Box47
		turretModel[38] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Import Box48
		turretModel[39] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Import Box49
		turretModel[40] = new ModelRendererTurbo(this, 681, 65, textureX, textureY); // Import Box50
		turretModel[41] = new ModelRendererTurbo(this, 753, 65, textureX, textureY); // Import Box51
		turretModel[42] = new ModelRendererTurbo(this, 897, 65, textureX, textureY); // Import Box52
		turretModel[43] = new ModelRendererTurbo(this, 937, 65, textureX, textureY); // Import Box53
		turretModel[44] = new ModelRendererTurbo(this, 953, 65, textureX, textureY); // Import Box54
		turretModel[45] = new ModelRendererTurbo(this, 969, 65, textureX, textureY); // Import Box55
		turretModel[46] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Import Box56
		turretModel[47] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Import Box57
		turretModel[48] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Import Box58
		turretModel[49] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Import Box59
		turretModel[50] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Import Box60
		turretModel[51] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Import Box61
		turretModel[52] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Import Box64
		turretModel[53] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Import Box65
		turretModel[54] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Import Box66
		turretModel[55] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Import Box67
		turretModel[56] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Import Box68
		turretModel[57] = new ModelRendererTurbo(this, 681, 73, textureX, textureY); // Import Box69
		turretModel[58] = new ModelRendererTurbo(this, 801, 73, textureX, textureY); // Import Box70
		turretModel[59] = new ModelRendererTurbo(this, 817, 73, textureX, textureY); // Import Box71
		turretModel[60] = new ModelRendererTurbo(this, 833, 73, textureX, textureY); // Import Box72
		turretModel[61] = new ModelRendererTurbo(this, 849, 73, textureX, textureY); // Import Box73
		turretModel[62] = new ModelRendererTurbo(this, 945, 73, textureX, textureY); // Import Box74
		turretModel[63] = new ModelRendererTurbo(this, 961, 73, textureX, textureY); // Import Box75
		turretModel[64] = new ModelRendererTurbo(this, 977, 73, textureX, textureY); // Import Box76
		turretModel[65] = new ModelRendererTurbo(this, 993, 73, textureX, textureY); // Import Box77
		turretModel[66] = new ModelRendererTurbo(this, 1009, 73, textureX, textureY); // Import Box78
		turretModel[67] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Import Box79
		turretModel[68] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Import Box80
		turretModel[69] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Import Box81
		turretModel[70] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Import Box82
		turretModel[71] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Import Box83
		turretModel[72] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Import Box84
		turretModel[73] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Import Box85
		turretModel[74] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Import Box86
		turretModel[75] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Import Box87
		turretModel[76] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Import Box88
		turretModel[77] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Import Box89
		turretModel[78] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Import Box90
		turretModel[79] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Import Box92
		turretModel[80] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Import Box93
		turretModel[81] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Import Box94
		turretModel[82] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Import Box95
		turretModel[83] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Import Box96
		turretModel[84] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Import Box97
		turretModel[85] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Import Box98
		turretModel[86] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Import Box99
		turretModel[87] = new ModelRendererTurbo(this, 761, 65, textureX, textureY); // Import Box100
		turretModel[88] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Import Box102
		turretModel[89] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Import Box103
		turretModel[90] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Import Box104
		turretModel[91] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Import Box105
		turretModel[92] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Import Box106
		turretModel[93] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Import Box107
		turretModel[94] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Import Box108
		turretModel[95] = new ModelRendererTurbo(this, 537, 81, textureX, textureY); // Import Box109
		turretModel[96] = new ModelRendererTurbo(this, 1009, 25, textureX, textureY); // Import Box272
		turretModel[97] = new ModelRendererTurbo(this, 561, 81, textureX, textureY); // Import Box273
		turretModel[98] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Import Box274
		turretModel[99] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Import Box275
		turretModel[100] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Import Box278
		turretModel[101] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Import Box279
		turretModel[102] = new ModelRendererTurbo(this, 601, 81, textureX, textureY); // Import Box280
		turretModel[103] = new ModelRendererTurbo(this, 625, 81, textureX, textureY); // Import Box281
		turretModel[104] = new ModelRendererTurbo(this, 553, 81, textureX, textureY); // Import Box282
		turretModel[105] = new ModelRendererTurbo(this, 593, 81, textureX, textureY); // Import Box283
		turretModel[106] = new ModelRendererTurbo(this, 617, 81, textureX, textureY); // Import Box284
		turretModel[107] = new ModelRendererTurbo(this, 641, 81, textureX, textureY); // Import Box285
		turretModel[108] = new ModelRendererTurbo(this, 905, 65, textureX, textureY); // Import Box286
		turretModel[109] = new ModelRendererTurbo(this, 793, 81, textureX, textureY); // Import Box287
		turretModel[110] = new ModelRendererTurbo(this, 825, 81, textureX, textureY); // Import Box288
		turretModel[111] = new ModelRendererTurbo(this, 857, 81, textureX, textureY); // Import Box293
		turretModel[112] = new ModelRendererTurbo(this, 873, 81, textureX, textureY); // Import Box294
		turretModel[113] = new ModelRendererTurbo(this, 897, 81, textureX, textureY); // Import Box295
		turretModel[114] = new ModelRendererTurbo(this, 921, 81, textureX, textureY); // Import Box296
		turretModel[115] = new ModelRendererTurbo(this, 937, 81, textureX, textureY); // Import Box310
		turretModel[116] = new ModelRendererTurbo(this, 681, 81, textureX, textureY); // Import Box311
		turretModel[117] = new ModelRendererTurbo(this, 817, 81, textureX, textureY); // Import Box312
		turretModel[118] = new ModelRendererTurbo(this, 849, 81, textureX, textureY); // Import Box313
		turretModel[119] = new ModelRendererTurbo(this, 961, 81, textureX, textureY); // Import Box314
		turretModel[120] = new ModelRendererTurbo(this, 889, 81, textureX, textureY); // Import Box315

		turretModel[0].addShapeBox(20F, -26F, -4F, 3, 6, 8, 0F,1F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 9F, 1F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 9F); // Import ImportTR.BarrelBase
		turretModel[0].setRotationPoint(0F, 4.5F, 0F);

		turretModel[1].addBox(12F, 0F, 6F, 3, 4, 4, 0F); // Import ImportTR.Camera
		turretModel[1].setRotationPoint(0F, -25.5F, 0F);
		turretModel[1].rotateAngleZ = 0.05235988F;

		turretModel[2].addShapeBox(-10F, 0F, -12F, 12, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 2F, 2F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 2F); // Import ImportTR.Commanderhatch
		turretModel[2].setRotationPoint(0F, -27F, 0F);

		turretModel[3].addBox(-14F, 0F, -2F, 6, 3, 10, 0F); // Import ImportTR.OtherHatch
		turretModel[3].setRotationPoint(0F, -25.5F, 0F);
		turretModel[3].rotateAngleY = -0.57595865F;

		turretModel[4].addBox(6F, 0F, 11F, 1, 5, 3, 0F); // Import ImportTR.TurretLight
		turretModel[4].setRotationPoint(0F, -27.7F, 0F);

		turretModel[5].addShapeBox(-26F, 0F, -10F, 7, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F); // Import ImportTR.WeirdThing
		turretModel[5].setRotationPoint(0F, -23.5F, 0F);

		turretModel[6].addBox(-33F, 0F, -19F, 7, 3, 38, 0F); // Import ImportTR.MassiveExposedFuelTank
		turretModel[6].setRotationPoint(0F, -25F, 0F);

		turretModel[7].addBox(3F, 0F, -9F, 1, 7, 3, 0F); // Import ImportTR.MGStick
		turretModel[7].setRotationPoint(0F, -31F, 0F);
		turretModel[7].rotateAngleZ = -0.17453293F;

		turretModel[8].addShapeBox(7F, 0F, -5F, 10, 7, 10, 0F,4F, 0F, 15F, 2F, 0F, 8F, 2F, 0F, 8F, 4F, 0F, 15F, 4F, 0F, 15F, 2F, 0F, 8F, 2F, 0F, 8F, 4F, 0F, 15F); // Import ImportTR.TopReactiveArmor
		turretModel[8].setRotationPoint(0F, -21.5F, 0F);

		turretModel[9].addShapeBox(-6F, 0F, -5F, 3, 7, 10, 0F,11F, 0F, 7F, 6F, 0F, 15F, 6F, 0F, 15F, 11F, 0F, 7F, 11F, 0F, 7F, 6F, 0F, 15F, 6F, 0F, 15F, 11F, 0F, 7F); // Import Box14
		turretModel[9].setRotationPoint(0F, -21.5F, 0F);

		turretModel[10].addShapeBox(-21F, 0F, 0F, 3, 7, 0, 0F,0F, 0F, 0F, 1F, 0F, 12F, 1F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 12F, 1F, 0F, 12F, 0F, 0F, 0F); // Import Box15
		turretModel[10].setRotationPoint(0F, -21.5F, 0F);

		turretModel[11].addShapeBox(7F, 0F, -5F, 10, 2, 10, 0F,4F, 1F, 12F, 2F, 0F, 5F, 2F, 0F, 5F, 4F, 1F, 12F, 4F, 0F, 15F, 2F, 0F, 8F, 2F, 0F, 8F, 4F, 0F, 15F); // Import Box16
		turretModel[11].setRotationPoint(0F, -23.5F, 0F);

		turretModel[12].addShapeBox(20F, -26F, -4F, 0, 2, 8, 0F,1F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 6F, 1F, 0F, 9F, 3F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 9F); // Import Box17
		turretModel[12].setRotationPoint(0F, 2.5F, 0F);

		turretModel[13].addShapeBox(-6F, 0F, -5F, 3, 3, 10, 0F,11F, 0F, 4F, 6F, 0F, 12F, 6F, 0F, 12F, 11F, 0F, 4F, 11F, 0F, 7F, 6F, 0F, 15F, 6F, 0F, 15F, 11F, 0F, 7F); // Import Box18
		turretModel[13].setRotationPoint(0F, -24.5F, 0F);

		turretModel[14].addShapeBox(-18F, 0F, 0F, 0, 3, 0, 0F,0F, 0F, 0F, 1F, 0F, 9F, 1F, 0F, 9F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 12F, 1F, 0F, 12F, 3F, 0F, 0F); // Import Box20
		turretModel[14].setRotationPoint(0F, -24.5F, 0F);

		turretModel[15].addBox(22F, 0F, -9F, 3, 4, 4, 0F); // Import MiniLight
		turretModel[15].setRotationPoint(0F, -22F, 0F);

		turretModel[16].addBox(24F, -1F, -12F, 4, 2, 1, 0F); // Import Box23
		turretModel[16].setRotationPoint(0F, -34F, 0F);
		turretModel[16].rotateAngleZ = -0.50614548F;

		turretModel[17].addBox(26F, 1F, -12F, 4, 2, 1, 0F); // Import Box24
		turretModel[17].setRotationPoint(0F, -1F, 0F);
		turretModel[17].rotateAngleZ = 0.6981317F;

		turretModel[18].addBox(23F, -0.5F, -14.5F, 4, 2, 1, 0F); // Import Box25
		turretModel[18].setRotationPoint(0F, -34F, 0F);
		turretModel[18].rotateAngleZ = -0.50614548F;

		turretModel[19].addBox(25F, 0.5F, -14.5F, 4, 2, 1, 0F); // Import Box26
		turretModel[19].setRotationPoint(0F, -1F, 0F);
		turretModel[19].rotateAngleZ = 0.6981317F;

		turretModel[20].addBox(22F, -1.5F, -16.7F, 4, 2, 1, 0F); // Import Box28
		turretModel[20].setRotationPoint(0F, -2F, 0F);
		turretModel[20].rotateAngleZ = 0.6981317F;

		turretModel[21].addBox(20F, 1.5F, -16.7F, 4, 2, 1, 0F); // Import Box29
		turretModel[21].setRotationPoint(0F, -35F, 0F);
		turretModel[21].rotateAngleZ = -0.50614548F;

		turretModel[22].addBox(16F, 4.5F, -18.9F, 4, 2, 1, 0F); // Import Box30
		turretModel[22].setRotationPoint(0F, -35F, 0F);
		turretModel[22].rotateAngleZ = -0.50614548F;

		turretModel[23].addBox(18F, -4.5F, -18.9F, 4, 2, 1, 0F); // Import Box31
		turretModel[23].setRotationPoint(0F, -2F, 0F);
		turretModel[23].rotateAngleZ = 0.6981317F;

		turretModel[24].addBox(14F, 5.75F, -20.05F, 4, 2, 1, 0F); // Import Box32
		turretModel[24].setRotationPoint(0F, -35F, 0F);
		turretModel[24].rotateAngleZ = -0.50614548F;

		turretModel[25].addBox(16F, -5.75F, -20.05F, 4, 2, 1, 0F); // Import Box33
		turretModel[25].setRotationPoint(0F, -2F, 0F);
		turretModel[25].rotateAngleZ = 0.6981317F;

		turretModel[26].addBox(24.5F, -1.25F, -10.5F, 4, 2, 1, 0F); // Import Box34
		turretModel[26].setRotationPoint(0F, -34F, 0F);
		turretModel[26].rotateAngleZ = -0.50614548F;

		turretModel[27].addBox(26.5F, 1.25F, -10.5F, 4, 2, 1, 0F); // Import Box35
		turretModel[27].setRotationPoint(0F, -1F, 0F);
		turretModel[27].rotateAngleZ = 0.6981317F;

		turretModel[28].addBox(23.5F, -0.75F, -13.2F, 4, 2, 1, 0F); // Import Box36
		turretModel[28].setRotationPoint(0F, -34F, 0F);
		turretModel[28].rotateAngleZ = -0.50614548F;

		turretModel[29].addBox(25.5F, 0.75F, -13.2F, 4, 2, 1, 0F); // Import Box37
		turretModel[29].setRotationPoint(0F, -1F, 0F);
		turretModel[29].rotateAngleZ = 0.6981317F;

		turretModel[30].addBox(24F, 0F, -15.6F, 4, 2, 1, 0F); // Import Box38
		turretModel[30].setRotationPoint(0F, -1F, 0F);
		turretModel[30].rotateAngleZ = 0.6981317F;

		turretModel[31].addBox(22F, 0F, -15.6F, 4, 2, 1, 0F); // Import Box39
		turretModel[31].setRotationPoint(0F, -34F, 0F);
		turretModel[31].rotateAngleZ = -0.50614548F;

		turretModel[32].addBox(18F, 3F, -17.8F, 4, 2, 1, 0F); // Import Box40
		turretModel[32].setRotationPoint(0F, -35F, 0F);
		turretModel[32].rotateAngleZ = -0.50614548F;

		turretModel[33].addBox(20F, -3F, -17.8F, 4, 2, 1, 0F); // Import Box41
		turretModel[33].setRotationPoint(0F, -2F, 0F);
		turretModel[33].rotateAngleZ = 0.6981317F;

		turretModel[34].addBox(24.5F, -1.25F, 7.5F, 4, 2, 1, 0F); // Import Box44
		turretModel[34].setRotationPoint(0F, -34F, 0F);
		turretModel[34].rotateAngleZ = -0.50614548F;

		turretModel[35].addBox(26.5F, 1.25F, 7.5F, 4, 2, 1, 0F); // Import Box45
		turretModel[35].setRotationPoint(0F, -1F, 0F);
		turretModel[35].rotateAngleZ = 0.6981317F;

		turretModel[36].addBox(26F, 1F, 9F, 4, 2, 1, 0F); // Import Box46
		turretModel[36].setRotationPoint(0F, -1F, 0F);
		turretModel[36].rotateAngleZ = 0.6981317F;

		turretModel[37].addBox(24F, -1F, 9F, 4, 2, 1, 0F); // Import Box47
		turretModel[37].setRotationPoint(0F, -34F, 0F);
		turretModel[37].rotateAngleZ = -0.50614548F;

		turretModel[38].addBox(23.5F, -0.75F, 10.8F, 4, 2, 1, 0F); // Import Box48
		turretModel[38].setRotationPoint(0F, -34F, 0F);
		turretModel[38].rotateAngleZ = -0.50614548F;

		turretModel[39].addBox(25.5F, 0.75F, 10.8F, 4, 2, 1, 0F); // Import Box49
		turretModel[39].setRotationPoint(0F, -1F, 0F);
		turretModel[39].rotateAngleZ = 0.6981317F;

		turretModel[40].addBox(25F, 0.5F, 12F, 4, 2, 1, 0F); // Import Box50
		turretModel[40].setRotationPoint(0F, -1F, 0F);
		turretModel[40].rotateAngleZ = 0.6981317F;

		turretModel[41].addBox(23F, -0.5F, 12F, 4, 2, 1, 0F); // Import Box51
		turretModel[41].setRotationPoint(0F, -34F, 0F);
		turretModel[41].rotateAngleZ = -0.50614548F;

		turretModel[42].addBox(22F, 0F, 13.4F, 4, 2, 1, 0F); // Import Box52
		turretModel[42].setRotationPoint(0F, -34F, 0F);
		turretModel[42].rotateAngleZ = -0.50614548F;

		turretModel[43].addBox(24F, 0F, 13.4F, 4, 2, 1, 0F); // Import Box53
		turretModel[43].setRotationPoint(0F, -1F, 0F);
		turretModel[43].rotateAngleZ = 0.6981317F;

		turretModel[44].addBox(22F, -1.5F, 15F, 4, 2, 1, 0F); // Import Box54
		turretModel[44].setRotationPoint(0F, -2F, 0F);
		turretModel[44].rotateAngleZ = 0.6981317F;

		turretModel[45].addBox(20F, 1.5F, 15F, 4, 2, 1, 0F); // Import Box55
		turretModel[45].setRotationPoint(0F, -35F, 0F);
		turretModel[45].rotateAngleZ = -0.50614548F;

		turretModel[46].addBox(18F, 3F, 16.4F, 4, 2, 1, 0F); // Import Box56
		turretModel[46].setRotationPoint(0F, -35F, 0F);
		turretModel[46].rotateAngleZ = -0.50614548F;

		turretModel[47].addBox(20F, -3F, 16.4F, 4, 2, 1, 0F); // Import Box57
		turretModel[47].setRotationPoint(0F, -2F, 0F);
		turretModel[47].rotateAngleZ = 0.6981317F;

		turretModel[48].addBox(18F, -4.5F, 17.7F, 4, 2, 1, 0F); // Import Box58
		turretModel[48].setRotationPoint(0F, -2F, 0F);
		turretModel[48].rotateAngleZ = 0.6981317F;

		turretModel[49].addBox(16F, 4.5F, 17.7F, 4, 2, 1, 0F); // Import Box59
		turretModel[49].setRotationPoint(0F, -35F, 0F);
		turretModel[49].rotateAngleZ = -0.50614548F;

		turretModel[50].addBox(14F, 5.75F, 19F, 4, 2, 1, 0F); // Import Box60
		turretModel[50].setRotationPoint(0F, -35F, 0F);
		turretModel[50].rotateAngleZ = -0.50614548F;

		turretModel[51].addBox(16F, -5.75F, 19F, 4, 2, 1, 0F); // Import Box61
		turretModel[51].setRotationPoint(0F, -2F, 0F);
		turretModel[51].rotateAngleZ = 0.6981317F;

		turretModel[52].addBox(24.9F, -1.6F, 6.2F, 4, 2, 1, 0F); // Import Box64
		turretModel[52].setRotationPoint(0F, -34F, 0F);
		turretModel[52].rotateAngleZ = -0.50614548F;

		turretModel[53].addBox(26.9F, 1.6F, 6.2F, 4, 2, 1, 0F); // Import Box65
		turretModel[53].setRotationPoint(0F, -1F, 0F);
		turretModel[53].rotateAngleZ = 0.6981317F;

		turretModel[54].addBox(27.2F, 1.7F, 4.9F, 4, 2, 1, 0F); // Import Box66
		turretModel[54].setRotationPoint(0F, -1F, 0F);
		turretModel[54].rotateAngleZ = 0.6981317F;

		turretModel[55].addBox(25.2F, -1.7F, 4.9F, 4, 2, 1, 0F); // Import Box67
		turretModel[55].setRotationPoint(0F, -34F, 0F);
		turretModel[55].rotateAngleZ = -0.50614548F;

		turretModel[56].addBox(18.2F, 0F, -4F, 5, 1, 8, 0F); // Import Box68
		turretModel[56].setRotationPoint(0F, -28.4F, 0F);
		turretModel[56].rotateAngleZ = -0.20943951F;

		turretModel[57].addBox(18.2F, -4F, 0.5F, 4, 1, 1, 0F); // Import Box69
		turretModel[57].setRotationPoint(0F, -25.5F, 0F);
		turretModel[57].rotateAngleZ = -0.20943951F;

		turretModel[58].addBox(18.2F, -4F, 2F, 4, 1, 1, 0F); // Import Box70
		turretModel[58].setRotationPoint(0F, -25.5F, 0F);
		turretModel[58].rotateAngleZ = -0.20943951F;

		turretModel[59].addBox(18.2F, -4F, -1.25F, 4, 1, 1, 0F); // Import Box71
		turretModel[59].setRotationPoint(0F, -25.5F, 0F);
		turretModel[59].rotateAngleZ = -0.20943951F;

		turretModel[60].addBox(18.2F, -4F, -3F, 4, 1, 1, 0F); // Import Box72
		turretModel[60].setRotationPoint(0F, -25.5F, 0F);
		turretModel[60].rotateAngleZ = -0.20943951F;

		turretModel[61].addBox(10.2F, -3F, -1F, 4, 1, 1, 0F); // Import Box73
		turretModel[61].setRotationPoint(0F, -22.5F, 0F);
		turretModel[61].rotateAngleZ = -0.06981317F;

		turretModel[62].addBox(10.2F, -3F, -2.5F, 4, 1, 1, 0F); // Import Box74
		turretModel[62].setRotationPoint(0F, -22.5F, 0F);
		turretModel[62].rotateAngleZ = -0.06981317F;

		turretModel[63].addBox(10.2F, -3F, -4.25F, 4, 1, 1, 0F); // Import Box75
		turretModel[63].setRotationPoint(0F, -22.5F, 0F);
		turretModel[63].rotateAngleZ = -0.06981317F;

		turretModel[64].addBox(10.2F, -3F, -6F, 4, 1, 1, 0F); // Import Box76
		turretModel[64].setRotationPoint(0F, -22.5F, 0F);
		turretModel[64].rotateAngleZ = -0.06981317F;

		turretModel[65].addBox(5.2F, -3F, -1F, 4, 1, 1, 0F); // Import Box77
		turretModel[65].setRotationPoint(0F, -22.5F, 0F);
		turretModel[65].rotateAngleZ = -0.06981317F;

		turretModel[66].addBox(5.2F, -3F, -2.5F, 4, 1, 1, 0F); // Import Box78
		turretModel[66].setRotationPoint(0F, -22.5F, 0F);
		turretModel[66].rotateAngleZ = -0.06981317F;

		turretModel[67].addBox(5.2F, -3F, -4.25F, 4, 1, 1, 0F); // Import Box79
		turretModel[67].setRotationPoint(0F, -22.5F, 0F);
		turretModel[67].rotateAngleZ = -0.06981317F;

		turretModel[68].addBox(5.2F, -3F, -6F, 4, 1, 1, 0F); // Import Box80
		turretModel[68].setRotationPoint(0F, -22.5F, 0F);
		turretModel[68].rotateAngleZ = -0.06981317F;

		turretModel[69].addBox(5.2F, -3F, 0.5F, 4, 1, 1, 0F); // Import Box81
		turretModel[69].setRotationPoint(0F, -22.5F, 0F);
		turretModel[69].rotateAngleZ = -0.06981317F;

		turretModel[70].addBox(10.2F, -3F, 0.5F, 4, 1, 1, 0F); // Import Box82
		turretModel[70].setRotationPoint(0F, -22.5F, 0F);
		turretModel[70].rotateAngleZ = -0.06981317F;

		turretModel[71].addBox(5.2F, -3F, 2F, 4, 1, 1, 0F); // Import Box83
		turretModel[71].setRotationPoint(0F, -22.5F, 0F);
		turretModel[71].rotateAngleZ = -0.06981317F;

		turretModel[72].addBox(10.2F, -3F, 2F, 4, 1, 1, 0F); // Import Box84
		turretModel[72].setRotationPoint(0F, -22.5F, 0F);
		turretModel[72].rotateAngleZ = -0.06981317F;

		turretModel[73].addBox(5.2F, -3F, 3.5F, 4, 1, 1, 0F); // Import Box85
		turretModel[73].setRotationPoint(0F, -22.5F, 0F);
		turretModel[73].rotateAngleZ = -0.06981317F;

		turretModel[74].addBox(10.2F, -3F, 3.5F, 4, 1, 1, 0F); // Import Box86
		turretModel[74].setRotationPoint(0F, -22.5F, 0F);
		turretModel[74].rotateAngleZ = -0.06981317F;

		turretModel[75].addBox(0.2F, -3F, 2F, 4, 1, 1, 0F); // Import Box87
		turretModel[75].setRotationPoint(0F, -22.5F, 0F);
		turretModel[75].rotateAngleZ = -0.05235988F;

		turretModel[76].addBox(0.2F, -3F, 0.5F, 4, 1, 1, 0F); // Import Box88
		turretModel[76].setRotationPoint(0F, -22.5F, 0F);
		turretModel[76].rotateAngleZ = -0.05235988F;

		turretModel[77].addBox(0.2F, -3F, 3.5F, 4, 1, 1, 0F); // Import Box89
		turretModel[77].setRotationPoint(0F, -22.5F, 0F);
		turretModel[77].rotateAngleZ = -0.05235988F;

		turretModel[78].addShapeBox(6F, 0F, -16F, 6, 5, 7, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box90
		turretModel[78].setRotationPoint(0F, -26F, 0F);

		turretModel[79].addBox(4F, 0F, 16F, 1, 3, 7, 0F); // Import Box92
		turretModel[79].setRotationPoint(0F, -21F, 0F);
		turretModel[79].rotateAngleY = 0.31415927F;

		turretModel[80].addBox(-23F, 0F, -7F, 1, 3, 9, 0F); // Import Box93
		turretModel[80].setRotationPoint(0F, -21F, 0F);
		turretModel[80].rotateAngleY = -1.37881011F;

		turretModel[81].addBox(-24F, 0F, -11F, 1, 3, 9, 0F); // Import Box94
		turretModel[81].setRotationPoint(0F, -21F, 0F);
		turretModel[81].rotateAngleY = -1.15191731F;

		turretModel[82].addBox(-11F, 0F, 16F, 1, 3, 7, 0F); // Import Box95
		turretModel[82].setRotationPoint(0F, -21F, 0F);
		turretModel[82].rotateAngleY = 0.41887902F;

		turretModel[83].addShapeBox(-26F, 0F, -10F, 2, 4, 6, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import Box96
		turretModel[83].setRotationPoint(0F, -22F, 0F);
		turretModel[83].rotateAngleY = -1.15191731F;

		turretModel[84].addBox(11.2F, -4F, 14F, 4, 1, 1, 0F); // Import Box97
		turretModel[84].setRotationPoint(0F, -23.5F, 0F);
		turretModel[84].rotateAngleZ = -0.20943951F;

		turretModel[85].addBox(8.2F, -4F, 15.5F, 4, 1, 1, 0F); // Import Box98
		turretModel[85].setRotationPoint(0F, -22.3F, 0F);
		turretModel[85].rotateAngleZ = -0.20943951F;

		turretModel[86].addBox(5.2F, -4F, 17F, 4, 1, 1, 0F); // Import Box99
		turretModel[86].setRotationPoint(0F, -21.5F, 0F);
		turretModel[86].rotateAngleZ = -0.20943951F;

		turretModel[87].addShapeBox(7.5F, 0F, 6F, 4, 4, 4, 0F,0F, 0F, 0F, 1F, 1F, 1F, 1F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 0F); // Import Box100
		turretModel[87].setRotationPoint(0F, -25.5F, 0F);
		turretModel[87].rotateAngleZ = 0.05235988F;

		turretModel[88].addShapeBox(-31F, 0F, -19F, 3, 2, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Import Box102
		turretModel[88].setRotationPoint(0F, -27F, 0F);

		turretModel[89].addShapeBox(-31F, 0F, -19F, 3, 2, 38, 0F,2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box103
		turretModel[89].setRotationPoint(0F, -22F, 0F);

		turretModel[90].addBox(-23.5F, 0F, -2F, 1, 4, 7, 0F); // Import Box104
		turretModel[90].setRotationPoint(0F, -21F, 0F);
		turretModel[90].rotateAngleY = -1.69296937F;

		turretModel[91].addBox(14F, -15.75F, 21.3F, 4, 1, 1, 0F); // Import Box105
		turretModel[91].setRotationPoint(0F, 1F, 0F);
		turretModel[91].rotateAngleY = -0.12217305F;
		turretModel[91].rotateAngleZ = 0.6981317F;

		turretModel[92].addBox(14F, -15.75F, 20.2F, 4, 1, 1, 0F); // Import Box106
		turretModel[92].setRotationPoint(0F, 1F, 0F);
		turretModel[92].rotateAngleY = -0.12217305F;
		turretModel[92].rotateAngleZ = 0.6981317F;

		turretModel[93].addBox(12F, -17.75F, 20.2F, 4, 1, 1, 0F); // Import Box107
		turretModel[93].setRotationPoint(0F, 1F, 0F);
		turretModel[93].rotateAngleY = -0.12217305F;
		turretModel[93].rotateAngleZ = 0.6981317F;

		turretModel[94].addBox(12F, -17.75F, 21.3F, 4, 1, 1, 0F); // Import Box108
		turretModel[94].setRotationPoint(0F, 1F, 0F);
		turretModel[94].rotateAngleY = -0.12217305F;
		turretModel[94].rotateAngleZ = 0.6981317F;

		turretModel[95].addBox(1F, 0F, 15F, 1, 2, 8, 0F); // Import Box109
		turretModel[95].setRotationPoint(0F, -21F, 0F);
		turretModel[95].rotateAngleY = -0.27925268F;
		turretModel[95].rotateAngleZ = -0.52359878F;

		turretModel[96].addBox(-14.8F, -3F, 3.5F, 2, 2, 3, 0F); // Import Box272
		turretModel[96].setRotationPoint(0F, -22.5F, 0F);
		turretModel[96].rotateAngleZ = -0.05235988F;

		turretModel[97].addShapeBox(-10F, 0F, -12F, 10, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 2F, 2F, 2F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 2F); // Import Box273
		turretModel[97].setRotationPoint(1F, -27.5F, 1F);

		turretModel[98].addShapeBox(0F, 0F, -7.5F, 1, 7, 1, 0F,0F, 2F, 4F, 0F, 2F, 4F, 0F, 2F, 4F, 0F, 2F, 4F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Import Box274
		turretModel[98].setRotationPoint(0F, -32F, 0F);

		turretModel[99].addShapeBox(0F, 0F, -4.5F, 1, 3, 0, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // Import Box275
		turretModel[99].setRotationPoint(0F, -37F, 0F);

		turretModel[100].addShapeBox(0F, 0F, -9.5F, 1, 3, 0, 0F,0F, 2F, 1F, 0F, 2F, 1F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box278
		turretModel[100].setRotationPoint(0F, -37F, 0F);

		turretModel[101].addBox(0F, 0F, -9.5F, 1, 2, 5, 0F); // Import Box279
		turretModel[101].setRotationPoint(0F, -39F, 0F);

		turretModel[102].addBox(-2F, 2F, -23F, 1, 2, 8, 0F); // Import Box280
		turretModel[102].setRotationPoint(0F, -21F, 0F);
		turretModel[102].rotateAngleY = 0.27925268F;
		turretModel[102].rotateAngleZ = -0.52359878F;

		turretModel[103].addBox(-23.5F, 0F, -2F, 1, 4, 7, 0F); // Import Box281
		turretModel[103].setRotationPoint(0F, -21F, 0F);
		turretModel[103].rotateAngleY = 1.69296937F;

		turretModel[104].addBox(16F, -13.75F, -19.7F, 4, 1, 1, 0F); // Import Box282
		turretModel[104].setRotationPoint(0F, 1F, -1F);
		turretModel[104].rotateAngleY = -0.12217305F;
		turretModel[104].rotateAngleZ = 0.6981317F;

		turretModel[105].addBox(16F, -13.75F, -20.8F, 4, 1, 1, 0F); // Import Box283
		turretModel[105].setRotationPoint(0F, 1F, -1F);
		turretModel[105].rotateAngleY = -0.12217305F;
		turretModel[105].rotateAngleZ = 0.6981317F;

		turretModel[106].addBox(14F, -15.75F, -19.7F, 4, 1, 1, 0F); // Import Box284
		turretModel[106].setRotationPoint(0F, 1F, -1F);
		turretModel[106].rotateAngleY = -0.12217305F;
		turretModel[106].rotateAngleZ = 0.6981317F;

		turretModel[107].addBox(14F, -15.75F, -20.8F, 4, 1, 1, 0F); // Import Box285
		turretModel[107].setRotationPoint(0F, 1F, -1F);
		turretModel[107].rotateAngleY = -0.12217305F;
		turretModel[107].rotateAngleZ = 0.6981317F;

		turretModel[108].addBox(3F, 0F, -5F, 3, 4, 4, 0F); // Import Box286
		turretModel[108].setRotationPoint(0F, -29F, 0F);

		turretModel[109].addBox(-31.5F, -3F, 3.5F, 4, 3, 8, 0F); // Import Box287
		turretModel[109].setRotationPoint(0F, -25.5F, 0F);
		turretModel[109].rotateAngleZ = -0.05235988F;

		turretModel[110].addBox(-31.5F, -3F, -11.5F, 4, 3, 8, 0F); // Import Box288
		turretModel[110].setRotationPoint(0F, -25.5F, 0F);
		turretModel[110].rotateAngleZ = -0.05235988F;

		turretModel[111].addBox(17.8F, 8F, -8F, 2, 6, 5, 0F); // Import Box293
		turretModel[111].setRotationPoint(0F, -31F, 0F);
		turretModel[111].rotateAngleY = -1.93731547F;

		turretModel[112].addBox(-23.5F, 0F, -6F, 1, 4, 7, 0F); // Import Box294
		turretModel[112].setRotationPoint(0F, -21F, 0F);
		turretModel[112].rotateAngleY = 1.22173048F;

		turretModel[113].addBox(1F, 0F, -23F, 1, 2, 8, 0F); // Import Box295
		turretModel[113].setRotationPoint(0F, -21F, 0F);
		turretModel[113].rotateAngleY = -0.40142573F;
		turretModel[113].rotateAngleZ = -0.4712389F;

		turretModel[114].addBox(20F, 8F, -8F, 2, 6, 5, 0F); // Import Box296
		turretModel[114].setRotationPoint(0F, -31F, 0F);
		turretModel[114].rotateAngleY = -1.93731547F;

		turretModel[115].addBox(-33.5F, 0F, -20F, 8, 4, 1, 0F); // Import Box310
		turretModel[115].setRotationPoint(0F, -25.5F, 0F);

		turretModel[116].addShapeBox(-31.5F, 0F, -20F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 02F, 0F, 0F, 2F, 0F, 0F); // Import Box311
		turretModel[116].setRotationPoint(0F, -27.5F, 0F);

		turretModel[117].addShapeBox(-31.5F, 0F, -20F, 4, 2, 1, 0F,2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box312
		turretModel[117].setRotationPoint(0F, -21.5F, 0F);

		turretModel[118].addShapeBox(-31.5F, 0F, 19F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 02F, 0F, 0F, 2F, 0F, 0F); // Import Box313
		turretModel[118].setRotationPoint(0F, -27.5F, 0F);

		turretModel[119].addBox(-33.5F, 0F, 19F, 8, 4, 1, 0F); // Import Box314
		turretModel[119].setRotationPoint(0F, -25.5F, 0F);

		turretModel[120].addShapeBox(-31.5F, 0F, 19F, 4, 2, 1, 0F,2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box315
		turretModel[120].setRotationPoint(0F, -21.5F, 0F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Import ImportBL.BarrelBase
		barrelModel[1] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Import ImportBL.MainBarrel
		barrelModel[2] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Import ImportBL.WormThing
		barrelModel[3] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import ImportBL.TipofGun
		barrelModel[4] = new ModelRendererTurbo(this, 985, 81, textureX, textureY); // Import ImportBL.GunHolder
		barrelModel[5] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Import ImportBL.MainGunBody
		barrelModel[6] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Import ImportBL.MGHandGuard
		barrelModel[7] = new ModelRendererTurbo(this, 1001, 81, textureX, textureY); // Import ImportBL.MGBarrel
		barrelModel[8] = new ModelRendererTurbo(this, 625, 1, textureX, textureY); // Import ImportBL.MGsight
		barrelModel[9] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Import ImportBL.AmmoBox
		barrelModel[10] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Import Box196
		barrelModel[11] = new ModelRendererTurbo(this, 641, 89, textureX, textureY); // Import Box197
		barrelModel[12] = new ModelRendererTurbo(this, 721, 89, textureX, textureY); // Import Box198
		barrelModel[13] = new ModelRendererTurbo(this, 761, 89, textureX, textureY); // Import Box199
		barrelModel[14] = new ModelRendererTurbo(this, 937, 89, textureX, textureY); // Import Box200

		barrelModel[0].addShapeBox(3F, -1.5F, -1.5F, 5, 3, 3, 0F,0F, 3F, 3F, 1F, 1F, 1F, 1F, 1F, 1F, 0F, 3F, 3F, 0F, 3F, 3F, 1F, 1F, 1F, 1F, 1F, 1F, 0F, 3F, 3F); // Import ImportBL.BarrelBase
		barrelModel[0].setRotationPoint(18F, -19.5F, 0F);

		barrelModel[1].addBox(6F, -1.5F, -1.5F, 85, 3, 3, 0F); // Import ImportBL.MainBarrel
		barrelModel[1].setRotationPoint(18F, -19.5F, 0F);

		barrelModel[2].addBox(44F, -2.5F, -2.5F, 20, 5, 5, 0F); // Import ImportBL.WormThing
		barrelModel[2].setRotationPoint(18F, -19.5F, 0F);

		barrelModel[3].addBox(91F, -1.5F, -1.5F, 1, 3, 3, 0F); // Import ImportBL.TipofGun
		barrelModel[3].setRotationPoint(18F, -19.5F, 0F);

		barrelModel[4].addBox(-3F, 0F, 3.5F, 5, 2, 3, 0F); // Import ImportBL.GunHolder
		barrelModel[4].setRotationPoint(5.5F, -31F, -12.5F);
		barrelModel[4].rotateAngleZ = -0.13962634F;

		barrelModel[5].addBox(-4F, -3F, 4F, 10, 3, 2, 0F); // Import ImportBL.MainGunBody
		barrelModel[5].setRotationPoint(5.5F, -31F, -12.5F);

		barrelModel[6].addBox(6F, -2.7F, 4.5F, 10, 2, 1, 0F); // Import ImportBL.MGHandGuard
		barrelModel[6].setRotationPoint(5.5F, -31F, -12.5F);

		barrelModel[7].addBox(16F, -2.7F, 4.5F, 10, 1, 1, 0F); // Import ImportBL.MGBarrel
		barrelModel[7].setRotationPoint(5.5F, -31F, -12.5F);

		barrelModel[8].addBox(22F, -4.5F, 4.5F, 1, 2, 1, 0F); // Import ImportBL.MGsight
		barrelModel[8].setRotationPoint(5.5F, -31F, -12.5F);

		barrelModel[9].addBox(4F, -2F, 2F, 2, 6, 5, 0F); // Import ImportBL.AmmoBox
		barrelModel[9].setRotationPoint(5.5F, -31F, -12.5F);
		barrelModel[9].rotateAngleX = -0.10471976F;
		barrelModel[9].rotateAngleY = -0.40142573F;
		barrelModel[9].rotateAngleZ = 0.41887902F;

		barrelModel[10].addBox(65F, -2F, -2F, 12, 4, 4, 0F); // Import Box196
		barrelModel[10].setRotationPoint(18F, -19.5F, 0F);

		barrelModel[11].addBox(78F, -2F, -2F, 12, 4, 4, 0F); // Import Box197
		barrelModel[11].setRotationPoint(18F, -19.5F, 0F);

		barrelModel[12].addBox(31F, -2F, -2F, 12, 4, 4, 0F); // Import Box198
		barrelModel[12].setRotationPoint(18F, -19.5F, 0F);

		barrelModel[13].addBox(18F, -2F, -2F, 12, 4, 4, 0F); // Import Box199
		barrelModel[13].setRotationPoint(18F, -19.5F, 0F);

		barrelModel[14].addShapeBox(-5F, -2F, -2F, 22, 4, 4, 0F,0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F); // Import Box200
		barrelModel[14].setRotationPoint(18F, -19.5F, 0F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 793, 97, textureX, textureY); // Box 26
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 849, 97, textureX, textureY); // Box 27
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 825, 97, textureX, textureY); // Box 28
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 825, 97, textureX, textureY); // Box 29
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 793, 97, textureX, textureY); // Box 30
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 849, 97, textureX, textureY); // Box 31
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 849, 97, textureX, textureY); // Box 32
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 793, 97, textureX, textureY); // Box 33
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 825, 97, textureX, textureY); // Box 34
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 825, 97, textureX, textureY); // Box 35
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 793, 97, textureX, textureY); // Box 36
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 849, 97, textureX, textureY); // Box 37
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 793, 97, textureX, textureY); // Box 38
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 849, 97, textureX, textureY); // Box 39
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 825, 97, textureX, textureY); // Box 40
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 825, 97, textureX, textureY); // Box 41
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 793, 97, textureX, textureY); // Box 42
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 849, 97, textureX, textureY); // Box 43
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 793, 97, textureX, textureY); // Box 44
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 849, 97, textureX, textureY); // Box 45
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 825, 97, textureX, textureY); // Box 46
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 849, 97, textureX, textureY); // Box 47
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 793, 97, textureX, textureY); // Box 48
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 825, 97, textureX, textureY); // Box 49

		leftTrackWheelModels[0].addBox(-4.5F, -2.5F, -3F, 9, 5, 6, 0F); // Box 26
		leftTrackWheelModels[0].setRotationPoint(48.5F, -2.5F, 22F);

		leftTrackWheelModels[1].addShapeBox(-2.5F, -4.5F, -3F, 5, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 27
		leftTrackWheelModels[1].setRotationPoint(48.5F, -2.5F, 22F);

		leftTrackWheelModels[2].addShapeBox(-2.5F, 2.5F, -3F, 5, 2, 6, 0F,2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		leftTrackWheelModels[2].setRotationPoint(48.5F, -2.5F, 22F);

		leftTrackWheelModels[3].addShapeBox(-2.5F, 2.5F, -3F, 5, 2, 6, 0F,2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		leftTrackWheelModels[3].setRotationPoint(35.5F, 4.5F, 22F);

		leftTrackWheelModels[4].addBox(-4.5F, -2.5F, -3F, 9, 5, 6, 0F); // Box 30
		leftTrackWheelModels[4].setRotationPoint(35.5F, 4.5F, 22F);

		leftTrackWheelModels[5].addShapeBox(-2.5F, -4.5F, -3F, 5, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 31
		leftTrackWheelModels[5].setRotationPoint(35.5F, 4.5F, 22F);

		leftTrackWheelModels[6].addShapeBox(-2.5F, -4.5F, -3F, 5, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 32
		leftTrackWheelModels[6].setRotationPoint(24.5F, 4.5F, 22F);

		leftTrackWheelModels[7].addBox(-4.5F, -2.5F, -3F, 9, 5, 6, 0F); // Box 33
		leftTrackWheelModels[7].setRotationPoint(24.5F, 4.5F, 22F);

		leftTrackWheelModels[8].addShapeBox(-2.5F, 2.5F, -3F, 5, 2, 6, 0F,2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[8].setRotationPoint(24.5F, 4.5F, 22F);

		leftTrackWheelModels[9].addShapeBox(-2.5F, 2.5F, -3F, 5, 2, 6, 0F,2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		leftTrackWheelModels[9].setRotationPoint(12.5F, 4.5F, 22F);

		leftTrackWheelModels[10].addBox(-4.5F, -2.5F, -3F, 9, 5, 6, 0F); // Box 36
		leftTrackWheelModels[10].setRotationPoint(12.5F, 4.5F, 22F);

		leftTrackWheelModels[11].addShapeBox(-2.5F, -4.5F, -3F, 5, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 37
		leftTrackWheelModels[11].setRotationPoint(12.5F, 4.5F, 22F);

		leftTrackWheelModels[12].addBox(-4.5F, -2.5F, -3F, 9, 5, 6, 0F); // Box 38
		leftTrackWheelModels[12].setRotationPoint(0.5F, 4.5F, 22F);

		leftTrackWheelModels[13].addShapeBox(-2.5F, -4.5F, -3F, 5, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 39
		leftTrackWheelModels[13].setRotationPoint(0.5F, 4.5F, 22F);

		leftTrackWheelModels[14].addShapeBox(-2.5F, 2.5F, -3F, 5, 2, 6, 0F,2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		leftTrackWheelModels[14].setRotationPoint(0.5F, 4.5F, 22F);

		leftTrackWheelModels[15].addShapeBox(-2.5F, 2.5F, -3F, 5, 2, 6, 0F,2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		leftTrackWheelModels[15].setRotationPoint(-10.5F, 4.5F, 22F);

		leftTrackWheelModels[16].addBox(-4.5F, -2.5F, -3F, 9, 5, 6, 0F); // Box 42
		leftTrackWheelModels[16].setRotationPoint(-10.5F, 4.5F, 22F);

		leftTrackWheelModels[17].addShapeBox(-2.5F, -4.5F, -3F, 5, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 43
		leftTrackWheelModels[17].setRotationPoint(-10.5F, 4.5F, 22F);

		leftTrackWheelModels[18].addBox(-4.5F, -2.5F, -3F, 9, 5, 6, 0F); // Box 44
		leftTrackWheelModels[18].setRotationPoint(-22.5F, 4.5F, 22F);

		leftTrackWheelModels[19].addShapeBox(-2.5F, -4.5F, -3F, 5, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 45
		leftTrackWheelModels[19].setRotationPoint(-22.5F, 4.5F, 22F);

		leftTrackWheelModels[20].addShapeBox(-2.5F, 2.5F, -3F, 5, 2, 6, 0F,2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		leftTrackWheelModels[20].setRotationPoint(-22.5F, 4.5F, 22F);

		leftTrackWheelModels[21].addShapeBox(-2.5F, -4.5F, -3F, 5, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 47
		leftTrackWheelModels[21].setRotationPoint(-36.5F, -3.5F, 22F);

		leftTrackWheelModels[22].addBox(-4.5F, -2.5F, -3F, 9, 5, 6, 0F); // Box 48
		leftTrackWheelModels[22].setRotationPoint(-36.5F, -3.5F, 22F);

		leftTrackWheelModels[23].addShapeBox(-2.5F, 2.5F, -3F, 5, 2, 6, 0F,2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		leftTrackWheelModels[23].setRotationPoint(-36.5F, -3.5F, 22F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 793, 97, textureX, textureY); // Import Box158
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 825, 97, textureX, textureY); // Import Box159
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 849, 97, textureX, textureY); // Import Box160
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 849, 97, textureX, textureY); // Box 0
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 793, 97, textureX, textureY); // Box 1
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 825, 97, textureX, textureY); // Box 2
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 793, 97, textureX, textureY); // Box 3
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 793, 97, textureX, textureY); // Box 4
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 793, 97, textureX, textureY); // Box 5
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 793, 97, textureX, textureY); // Box 6
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 849, 97, textureX, textureY); // Box 7
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 849, 97, textureX, textureY); // Box 8
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 849, 97, textureX, textureY); // Box 9
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 849, 97, textureX, textureY); // Box 10
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 825, 97, textureX, textureY); // Box 11
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 825, 97, textureX, textureY); // Box 12
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 825, 97, textureX, textureY); // Box 13
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 825, 97, textureX, textureY); // Box 14
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 793, 97, textureX, textureY); // Box 15
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 793, 97, textureX, textureY); // Box 16
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 849, 97, textureX, textureY); // Box 17
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 825, 97, textureX, textureY); // Box 18
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 849, 97, textureX, textureY); // Box 19
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 825, 97, textureX, textureY); // Box 20

		rightTrackWheelModels[0].addBox(-4.5F, -2.5F, -3F, 9, 5, 6, 0F); // Import Box158
		rightTrackWheelModels[0].setRotationPoint(-10.5F, 4.5F, -22F);

		rightTrackWheelModels[1].addShapeBox(-2.5F, 2.5F, -3F, 5, 2, 6, 0F,2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box159
		rightTrackWheelModels[1].setRotationPoint(-10.5F, 4.5F, -22F);

		rightTrackWheelModels[2].addShapeBox(-2.5F, -4.5F, -3F, 5, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Import Box160
		rightTrackWheelModels[2].setRotationPoint(-10.5F, 4.5F, -22F);

		rightTrackWheelModels[3].addShapeBox(-2.5F, -4.5F, -3F, 5, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 0
		rightTrackWheelModels[3].setRotationPoint(-22.5F, 4.5F, -22F);

		rightTrackWheelModels[4].addBox(-4.5F, -2.5F, -3F, 9, 5, 6, 0F); // Box 1
		rightTrackWheelModels[4].setRotationPoint(-22.5F, 4.5F, -22F);

		rightTrackWheelModels[5].addShapeBox(-2.5F, 2.5F, -3F, 5, 2, 6, 0F,2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		rightTrackWheelModels[5].setRotationPoint(-22.5F, 4.5F, -22F);

		rightTrackWheelModels[6].addBox(-4.5F, -2.5F, -3F, 9, 5, 6, 0F); // Box 3
		rightTrackWheelModels[6].setRotationPoint(0.5F, 4.5F, -22F);

		rightTrackWheelModels[7].addBox(-4.5F, -2.5F, -3F, 9, 5, 6, 0F); // Box 4
		rightTrackWheelModels[7].setRotationPoint(12.5F, 4.5F, -22F);

		rightTrackWheelModels[8].addBox(-4.5F, -2.5F, -3F, 9, 5, 6, 0F); // Box 5
		rightTrackWheelModels[8].setRotationPoint(24.5F, 4.5F, -22F);

		rightTrackWheelModels[9].addBox(-4.5F, -2.5F, -3F, 9, 5, 6, 0F); // Box 6
		rightTrackWheelModels[9].setRotationPoint(35.5F, 4.5F, -22F);

		rightTrackWheelModels[10].addShapeBox(-2.5F, -4.5F, -3F, 5, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 7
		rightTrackWheelModels[10].setRotationPoint(12.5F, 4.5F, -22F);

		rightTrackWheelModels[11].addShapeBox(-2.5F, -4.5F, -3F, 5, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 8
		rightTrackWheelModels[11].setRotationPoint(0.5F, 4.5F, -22F);

		rightTrackWheelModels[12].addShapeBox(-2.5F, -4.5F, -3F, 5, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 9
		rightTrackWheelModels[12].setRotationPoint(35.5F, 4.5F, -22F);

		rightTrackWheelModels[13].addShapeBox(-2.5F, -4.5F, -3F, 5, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 10
		rightTrackWheelModels[13].setRotationPoint(24.5F, 4.5F, -22F);

		rightTrackWheelModels[14].addShapeBox(-2.5F, 2.5F, -3F, 5, 2, 6, 0F,2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		rightTrackWheelModels[14].setRotationPoint(12.5F, 4.5F, -22F);

		rightTrackWheelModels[15].addShapeBox(-2.5F, 2.5F, -3F, 5, 2, 6, 0F,2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		rightTrackWheelModels[15].setRotationPoint(0.5F, 4.5F, -22F);

		rightTrackWheelModels[16].addShapeBox(-2.5F, 2.5F, -3F, 5, 2, 6, 0F,2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[16].setRotationPoint(35.5F, 4.5F, -22F);

		rightTrackWheelModels[17].addShapeBox(-2.5F, 2.5F, -3F, 5, 2, 6, 0F,2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[17].setRotationPoint(24.5F, 4.5F, -22F);

		rightTrackWheelModels[18].addBox(-4.5F, -2.5F, -3F, 9, 5, 6, 0F); // Box 15
		rightTrackWheelModels[18].setRotationPoint(-36.5F, -3.5F, -22F);

		rightTrackWheelModels[19].addBox(-4.5F, -2.5F, -3F, 9, 5, 6, 0F); // Box 16
		rightTrackWheelModels[19].setRotationPoint(48.5F, -2.5F, -22F);

		rightTrackWheelModels[20].addShapeBox(-2.5F, -4.5F, -3F, 5, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 17
		rightTrackWheelModels[20].setRotationPoint(-36.5F, -3.5F, -22F);

		rightTrackWheelModels[21].addShapeBox(-2.5F, 2.5F, -3F, 5, 2, 6, 0F,2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		rightTrackWheelModels[21].setRotationPoint(-36.5F, -3.5F, -22F);

		rightTrackWheelModels[22].addShapeBox(-2.5F, -4.5F, -3F, 5, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 19
		rightTrackWheelModels[22].setRotationPoint(48.5F, -2.5F, -22F);

		rightTrackWheelModels[23].addShapeBox(-2.5F, 2.5F, -3F, 5, 2, 6, 0F,2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		rightTrackWheelModels[23].setRotationPoint(48.5F, -2.5F, -22F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 617, 113, textureX, textureY); // Box 21
		leftTrackModel[1] = new ModelRendererTurbo(this, 905, 113, textureX, textureY); // Box 22
		leftTrackModel[2] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 23
		leftTrackModel[3] = new ModelRendererTurbo(this, 1001, 113, textureX, textureY); // Box 24
		leftTrackModel[4] = new ModelRendererTurbo(this, 153, 121, textureX, textureY); // Box 25

		leftTrackModel[0].addBox(0F, 0F, -4F, 1, 8, 8, 0F); // Box 21
		leftTrackModel[0].setRotationPoint(53F, -8F, 22F);

		leftTrackModel[1].addBox(0F, 0F, -4F, 1, 18, 8, 0F); // Box 22
		leftTrackModel[1].setRotationPoint(53.5F, -0.5F, 22F);
		leftTrackModel[1].rotateAngleZ = -1.01229097F;

		leftTrackModel[2].addBox(0F, 0F, -4F, 64, 1, 8, 0F); // Box 23
		leftTrackModel[2].setRotationPoint(-25F, 9F, 22F);

		leftTrackModel[3].addBox(0F, 0F, -4F, 1, 20, 8, 0F); // Box 24
		leftTrackModel[3].setRotationPoint(-42F, 0F, 22F);
		leftTrackModel[3].rotateAngleZ = 1.047198F;

		leftTrackModel[4].addBox(0F, 0F, -4F, 1, 8, 8, 0F); // Box 25
		leftTrackModel[4].setRotationPoint(-42F, -8F, 22F);
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 617, 113, textureX, textureY); // Import ImportLT.TrackFront
		rightTrackModel[1] = new ModelRendererTurbo(this, 905, 113, textureX, textureY); // Import ImportLT.TrackFrontBottomCorner
		rightTrackModel[2] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Import ImportLT.TrackBottom
		rightTrackModel[3] = new ModelRendererTurbo(this, 1001, 113, textureX, textureY); // Import ImportLT.TrackBackBottomCorner
		rightTrackModel[4] = new ModelRendererTurbo(this, 153, 121, textureX, textureY); // Import ImportLT.TrackBack

		rightTrackModel[0].addBox(0F, 0F, -4F, 1, 8, 8, 0F); // Import ImportLT.TrackFront
		rightTrackModel[0].setRotationPoint(53F, -8F, -22F);

		rightTrackModel[1].addBox(0F, 0F, -4F, 1, 18, 8, 0F); // Import ImportLT.TrackFrontBottomCorner
		rightTrackModel[1].setRotationPoint(53.5F, -0.5F, -22F);
		rightTrackModel[1].rotateAngleZ = -1.01229097F;

		rightTrackModel[2].addBox(0F, 0F, -4F, 64, 1, 8, 0F); // Import ImportLT.TrackBottom
		rightTrackModel[2].setRotationPoint(-25F, 9F, -22F);

		rightTrackModel[3].addBox(0F, 0F, -4F, 1, 20, 8, 0F); // Import ImportLT.TrackBackBottomCorner
		rightTrackModel[3].setRotationPoint(-42F, 0F, -22F);
		rightTrackModel[3].rotateAngleZ = 1.047198F;

		rightTrackModel[4].addBox(0F, 0F, -4F, 1, 8, 8, 0F); // Import ImportLT.TrackBack
		rightTrackModel[4].setRotationPoint(-42F, -8F, -22F);
		
		translateAll(0F, -2F, 0F);
	}
}