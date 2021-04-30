//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelT80Fixed extends ModelVehicle
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelT80Fixed()
	{
		bodyModel = new ModelRendererTurbo[107];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Import CR.TopAngle
		bodyModel[1] = new ModelRendererTurbo(this, 0, 900, textureX, textureY); // Import CR.FrontLowerGlacis
		bodyModel[2] = new ModelRendererTurbo(this, 148, 960, textureX, textureY); // Import CR.MainBulk
		bodyModel[3] = new ModelRendererTurbo(this, 0, 830, textureX, textureY); // Import CR.LowerFrontCoverUp
		bodyModel[4] = new ModelRendererTurbo(this, 0, 780, textureX, textureY); // Import CR.UnderAngleCoveruptop
		bodyModel[5] = new ModelRendererTurbo(this, 0, 720, textureX, textureY); // Import CR.UnderAngleCoverupBottom
		bodyModel[6] = new ModelRendererTurbo(this, 0, 620, textureX, textureY); // Import CR.RightTrackFront
		bodyModel[7] = new ModelRendererTurbo(this, 50, 620, textureX, textureY); // Import CR.RightTrackFrontTop
		bodyModel[8] = new ModelRendererTurbo(this, 35, 0, textureX, textureY); // Import CR.RightTrackMain
		bodyModel[9] = new ModelRendererTurbo(this, 0, 540, textureX, textureY); // Import CR.rightTrackFrontCoverUp
		bodyModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import CR.BackTopTrack
		bodyModel[11] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import CR.BackBottomTrackright
		bodyModel[12] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import CR.BackBottomTrackleft
		bodyModel[13] = new ModelRendererTurbo(this, 0, 330, textureX, textureY); // Import CR.UtilityLog
		bodyModel[14] = new ModelRendererTurbo(this, 100, 330, textureX, textureY); // Import CR.LogHolderRight
		bodyModel[15] = new ModelRendererTurbo(this, 100, 330, textureX, textureY); // Import CR.LogHolderLeft
		bodyModel[16] = new ModelRendererTurbo(this, 50, 620, textureX, textureY); // Import CR.LeftTrackFrontTop
		bodyModel[17] = new ModelRendererTurbo(this, 0, 620, textureX, textureY); // Import CR.LeftTrackFront
		bodyModel[18] = new ModelRendererTurbo(this, 0, 540, textureX, textureY); // Import CR.leftTrackFrontCoverUp
		bodyModel[19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import CR.LeftTrackMain
		bodyModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import CR.BackTopTrackLeft
		bodyModel[21] = new ModelRendererTurbo(this, 480, 800, textureX, textureY); // Import CR.LeftLight
		bodyModel[22] = new ModelRendererTurbo(this, 480, 800, textureX, textureY); // Import CR.RightLight
		bodyModel[23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import CR.BeardArmor
		bodyModel[24] = new ModelRendererTurbo(this, 430, 800, textureX, textureY); // Import CR.DriverThingy
		bodyModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import CR.BackBonusArea
		bodyModel[26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import CR.LowerReactiveArmor
		bodyModel[27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import CR.FuelTankconnectorRight
		bodyModel[28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import CR.FuelTankconnectorLeft
		bodyModel[29] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 101
		bodyModel[30] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 110
		bodyModel[31] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 111
		bodyModel[32] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 112
		bodyModel[33] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 114
		bodyModel[34] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 116
		bodyModel[35] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 117
		bodyModel[36] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 124
		bodyModel[37] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 125
		bodyModel[38] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 126
		bodyModel[39] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 128
		bodyModel[40] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 129
		bodyModel[41] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 195
		bodyModel[42] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 202
		bodyModel[43] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 203
		bodyModel[44] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 204
		bodyModel[45] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 205
		bodyModel[46] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 206
		bodyModel[47] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 207
		bodyModel[48] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 208
		bodyModel[49] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 209
		bodyModel[50] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 229
		bodyModel[51] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 230
		bodyModel[52] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 231
		bodyModel[53] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 232
		bodyModel[54] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 233
		bodyModel[55] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 234
		bodyModel[56] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 235
		bodyModel[57] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 236
		bodyModel[58] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 237
		bodyModel[59] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 238
		bodyModel[60] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 240
		bodyModel[61] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 242
		bodyModel[62] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 243
		bodyModel[63] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 244
		bodyModel[64] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 245
		bodyModel[65] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 246
		bodyModel[66] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 247
		bodyModel[67] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 248
		bodyModel[68] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 249
		bodyModel[69] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 250
		bodyModel[70] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 251
		bodyModel[71] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 252
		bodyModel[72] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 253
		bodyModel[73] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 254
		bodyModel[74] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 255
		bodyModel[75] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 256
		bodyModel[76] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 257
		bodyModel[77] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 258
		bodyModel[78] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 259
		bodyModel[79] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 260
		bodyModel[80] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 261
		bodyModel[81] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 262
		bodyModel[82] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 263
		bodyModel[83] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 264
		bodyModel[84] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 265
		bodyModel[85] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 266
		bodyModel[86] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 267
		bodyModel[87] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 268
		bodyModel[88] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 269
		bodyModel[89] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 270
		bodyModel[90] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 271
		bodyModel[91] = new ModelRendererTurbo(this, 148, 960, textureX, textureY); // Box 289
		bodyModel[92] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 290
		bodyModel[93] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 291
		bodyModel[94] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 292
		bodyModel[95] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 297
		bodyModel[96] = new ModelRendererTurbo(this, 35, 0, textureX, textureY); // Box 298
		bodyModel[97] = new ModelRendererTurbo(this, 35, 0, textureX, textureY); // Box 299
		bodyModel[98] = new ModelRendererTurbo(this, 35, 0, textureX, textureY); // Box 300
		bodyModel[99] = new ModelRendererTurbo(this, 35, 0, textureX, textureY); // Box 301
		bodyModel[100] = new ModelRendererTurbo(this, 35, 0, textureX, textureY); // Box 303
		bodyModel[101] = new ModelRendererTurbo(this, 35, 0, textureX, textureY); // Box 304
		bodyModel[102] = new ModelRendererTurbo(this, 35, 0, textureX, textureY); // Box 305
		bodyModel[103] = new ModelRendererTurbo(this, 35, 0, textureX, textureY); // Box 306
		bodyModel[104] = new ModelRendererTurbo(this, 35, 0, textureX, textureY); // Box 307
		bodyModel[105] = new ModelRendererTurbo(this, 35, 0, textureX, textureY); // Box 308
		bodyModel[106] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 309

		bodyModel[0].addBox(0F, 0F, 0F, 24, 1, 34, 0F); // Import CR.TopAngle
		bodyModel[0].setRotationPoint(29F, -15F, -17F);
		bodyModel[0].rotateAngleZ = -0.40142573F;

		bodyModel[1].addBox(-2.9F, 0F, 0F, 4, 10, 34, 0F); // Import CR.FrontLowerGlacis
		bodyModel[1].setRotationPoint(49.5F, -5.2F, -17F);
		bodyModel[1].rotateAngleZ = -0.66322512F;

		bodyModel[2].addBox(0F, 0F, 0F, 65, 18, 34, 0F); // Import CR.MainBulk
		bodyModel[2].setRotationPoint(-36F, -15F, -17F);

		bodyModel[3].addBox(0F, 0F, 0F, 19, 12, 34, 0F); // Import CR.LowerFrontCoverUp
		bodyModel[3].setRotationPoint(25F, -9F, -17F);

		bodyModel[4].addBox(0F, 0F, 0F, 6, 3, 34, 0F); // Import CR.UnderAngleCoveruptop
		bodyModel[4].setRotationPoint(43F, -8F, -17F);
		bodyModel[4].rotateAngleZ = -0.26179939F;

		bodyModel[5].addBox(0F, -2.1F, 0F, 10, 3, 34, 0F); // Import CR.UnderAngleCoverupBottom
		bodyModel[5].setRotationPoint(39F, 0F, -17F);
		bodyModel[5].rotateAngleZ = 0.55850536F;

		bodyModel[6].addBox(-3F, 2F, 0F, 4, 6, 10, 0F); // Import CR.RightTrackFront
		bodyModel[6].setRotationPoint(55F, -12F, 17F);
		bodyModel[6].rotateAngleZ = 0.52359878F;

		bodyModel[7].addBox(-4F, 0F, 0F, 5, 12, 10, 0F); // Import CR.RightTrackFrontTop
		bodyModel[7].setRotationPoint(45F, -13F, 17F);
		bodyModel[7].rotateAngleZ = 1.30899694F;

		bodyModel[8].addBox(0F, 0F, 0F, 81, 13, 9, 0F); // Import CR.RightTrackMain
		bodyModel[8].setRotationPoint(-35.5F, -14F, 17F);

		bodyModel[9].addBox(0F, -8.5F, 0F, 11, 8, 10, 0F); // Import CR.rightTrackFrontCoverUp
		bodyModel[9].setRotationPoint(45.5F, -1F, 17F);
		bodyModel[9].rotateAngleZ = 0.08726646F;

		bodyModel[10].addBox(0F, 0F, 0F, 26, 7, 10, 0F); // Import CR.BackTopTrack
		bodyModel[10].setRotationPoint(-45F, -14F, 17F);

		bodyModel[11].addBox(0F, -6F, 0F, 11, 6, 10, 0F); // Import CR.BackBottomTrackright
		bodyModel[11].setRotationPoint(-45F, -7F, 17F);
		bodyModel[11].rotateAngleZ = -0.55850536F;

		bodyModel[12].addBox(0F, -6F, -27F, 11, 6, 10, 0F); // Import CR.BackBottomTrackleft
		bodyModel[12].setRotationPoint(-45F, -7F, 0F);
		bodyModel[12].rotateAngleZ = -0.5585054F;

		bodyModel[13].addBox(0F, 0F, 0F, 3, 3, 50, 0F); // Import CR.UtilityLog
		bodyModel[13].setRotationPoint(-46F, -5F, -25F);

		bodyModel[14].addBox(-4F, 8F, -0.5F, 8, 1, 1, 0F); // Import CR.LogHolderRight
		bodyModel[14].setRotationPoint(-47F, -10F, 12F);
		bodyModel[14].rotateAngleZ = 0.52359878F;

		bodyModel[15].addBox(-4F, 8F, -0.5F, 8, 1, 1, 0F); // Import CR.LogHolderLeft
		bodyModel[15].setRotationPoint(-47F, -10F, -12F);
		bodyModel[15].rotateAngleZ = 0.52359878F;

		bodyModel[16].addBox(-4F, 0F, 0F, 5, 12, 10, 0F); // Import CR.LeftTrackFrontTop
		bodyModel[16].setRotationPoint(45F, -13F, -27F);
		bodyModel[16].rotateAngleZ = 1.30899694F;

		bodyModel[17].addBox(-3F, 2F, 0F, 4, 6, 10, 0F); // Import CR.LeftTrackFront
		bodyModel[17].setRotationPoint(55F, -12F, -27F);
		bodyModel[17].rotateAngleZ = 0.52359878F;

		bodyModel[18].addBox(0F, -8.5F, 0F, 11, 8, 10, 0F); // Import CR.leftTrackFrontCoverUp
		bodyModel[18].setRotationPoint(45.5F, -1F, -27F);
		bodyModel[18].rotateAngleZ = 0.13962634F;

		bodyModel[19].addBox(0F, 0F, 0F, 81, 13, 9, 0F); // Import CR.LeftTrackMain
		bodyModel[19].setRotationPoint(-35.5F, -14F, -26F);

		bodyModel[20].addBox(0F, 0F, 0F, 26, 7, 10, 0F); // Import CR.BackTopTrackLeft
		bodyModel[20].setRotationPoint(-45F, -14F, -27F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 5, 3, 0F); // Import CR.LeftLight
		bodyModel[21].setRotationPoint(47F, -11F, -15F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 5, 3, 0F); // Import CR.RightLight
		bodyModel[22].setRotationPoint(47F, -11F, 12F);

		bodyModel[23].addBox(-1.7F, -1F, 0F, 0, 8, 16, 0F); // Import CR.BeardArmor
		bodyModel[23].setRotationPoint(52F, -3F, -16.2F);
		bodyModel[23].rotateAngleZ = -0.20943951F;

		bodyModel[24].addShapeBox(0F, 0F, 0F, 5, 3, 10, 0F,0F, 0F, 6F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 6F,0F, 0F, 4F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 4F); // Import CR.DriverThingy
		bodyModel[24].setRotationPoint(29F, -15.8F, -5F);

		bodyModel[25].addBox(0F, 0F, 0F, 24, 3, 34, 0F); // Import CR.BackBonusArea
		bodyModel[25].setRotationPoint(-44F, -15F, -17F);

		bodyModel[26].addBox(12.9F, -0.8F, 0F, 4, 1, 2, 0F); // Import CR.LowerReactiveArmor
		bodyModel[26].setRotationPoint(34F, -13F, -9.6F);
		bodyModel[26].rotateAngleZ = -0.40142573F;

		bodyModel[27].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Import CR.FuelTankconnectorRight
		bodyModel[27].setRotationPoint(-50F, -16F, 25F);

		bodyModel[28].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Import CR.FuelTankconnectorLeft
		bodyModel[28].setRotationPoint(-50F, -16F, -26F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 4, 6, 0F,0F, 0F, 3F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 3F,0F, 0F, 4F,2F, 0F, 4F,2F, 0F, 4F,0F, 0F, 4F); // Box 101
		bodyModel[29].setRotationPoint(25F, -16.8F, -3F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 0, 8, 0F,0F, 2F, 0F,18F, 0F, 0F,18F, 0F, 0F,0F, 2F, 0F,0F, 0F, 0F,18F, 0F, 0F,18F, 0F, 0F,0F, 0F, 0F); // Box 110
		bodyModel[30].setRotationPoint(20F, -14F, 18F);

		bodyModel[31].addBox(0F, 0F, 0F, 16, 2, 8, 0F); // Box 111
		bodyModel[31].setRotationPoint(4F, -16F, 18F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0F,18F, 0F, 0F,18F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,18F, 0F, 0F,18F, 0F, 1F,0F, 0F, 1F); // Box 112
		bodyModel[32].setRotationPoint(-17F, -16.5F, 18F);

		bodyModel[33].addBox(0F, 0F, 0F, 21, 2, 8, 0F); // Box 114
		bodyModel[33].setRotationPoint(-17F, -15.5F, 18F);

		bodyModel[34].addBox(0F, 0F, 0F, 27, 2, 8, 0F); // Box 116
		bodyModel[34].setRotationPoint(-44F, -15.5F, 18F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 0, 7, 0F,0F, 1F, 0F,23F, 1F, 0F,23F, 1F, 0F,0F, 1F, 0F,0F, 0F, 0F,23F, 0F, 0F,23F, 0F, 1F,0F, 0F, 1F); // Box 117
		bodyModel[35].setRotationPoint(-43F, -15.5F, 18F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 0, 8, 0F,0F, 2F, 0F,18F, 0F, 0F,18F, 0F, 0F,0F, 2F, 0F,0F, 0F, 0F,18F, 0F, 0F,18F, 0F, 0F,0F, 0F, 0F); // Box 124
		bodyModel[36].setRotationPoint(20F, -14F, -26F);

		bodyModel[37].addBox(0F, 0F, 0F, 16, 2, 8, 0F); // Box 125
		bodyModel[37].setRotationPoint(4F, -16F, -26F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0F,18F, 0F, 0F,18F, 0F, 0F,0F, 0F, 0F,0F, 0F, 1F,18F, 0F, 1F,18F, 0F, 0F,0F, 0F, 0F); // Box 126
		bodyModel[38].setRotationPoint(-17F, -16.5F, -25F);

		bodyModel[39].addBox(0F, 0F, 0F, 21, 2, 8, 0F); // Box 128
		bodyModel[39].setRotationPoint(-17F, -15.5F, -26F);

		bodyModel[40].addBox(0F, 0F, 0F, 27, 2, 8, 0F); // Box 129
		bodyModel[40].setRotationPoint(-44F, -15.5F, -26F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 17, 2, 24, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,5F, 0F, 5F,0F, 0F, 5F,0F, 0F, 5F,5F, 0F, 5F); // Box 195
		bodyModel[41].setRotationPoint(-38F, -17F, -12F);

		bodyModel[42].addBox(12.9F, -0.8F, 0F, 4, 1, 2, 0F); // Box 202
		bodyModel[42].setRotationPoint(34F, -13F, -7.4F);
		bodyModel[42].rotateAngleZ = -0.40142573F;

		bodyModel[43].addBox(12.9F, -0.8F, 0F, 4, 1, 2, 0F); // Box 203
		bodyModel[43].setRotationPoint(34F, -13F, -5.2F);
		bodyModel[43].rotateAngleZ = -0.40142573F;

		bodyModel[44].addBox(12.9F, -0.8F, 0F, 4, 1, 2, 0F); // Box 204
		bodyModel[44].setRotationPoint(34F, -13F, -3F);
		bodyModel[44].rotateAngleZ = -0.40142573F;

		bodyModel[45].addBox(12.9F, -0.8F, 0F, 4, 1, 2, 0F); // Box 205
		bodyModel[45].setRotationPoint(34F, -13F, -0.8F);
		bodyModel[45].rotateAngleZ = -0.40142573F;

		bodyModel[46].addBox(12.9F, -0.8F, 0F, 4, 1, 2, 0F); // Box 206
		bodyModel[46].setRotationPoint(34F, -13F, 1.4F);
		bodyModel[46].rotateAngleZ = -0.40142573F;

		bodyModel[47].addBox(12.9F, -0.8F, 0F, 4, 1, 2, 0F); // Box 207
		bodyModel[47].setRotationPoint(34F, -13F, 5.8F);
		bodyModel[47].rotateAngleZ = -0.40142573F;

		bodyModel[48].addBox(12.9F, -0.8F, 0F, 4, 1, 2, 0F); // Box 208
		bodyModel[48].setRotationPoint(34F, -13F, 8F);
		bodyModel[48].rotateAngleZ = -0.40142573F;

		bodyModel[49].addBox(12.9F, -0.8F, 0F, 4, 1, 2, 0F); // Box 209
		bodyModel[49].setRotationPoint(34F, -13F, 3.6F);
		bodyModel[49].rotateAngleZ = -0.40142573F;

		bodyModel[50].addBox(8.5F, -0.8F, 0F, 4, 1, 2, 0F); // Box 229
		bodyModel[50].setRotationPoint(34F, -13F, -9.6F);
		bodyModel[50].rotateAngleZ = -0.40142573F;

		bodyModel[51].addBox(8.5F, -0.8F, 0F, 4, 1, 2, 0F); // Box 230
		bodyModel[51].setRotationPoint(34F, -13F, -7.4F);
		bodyModel[51].rotateAngleZ = -0.40142573F;

		bodyModel[52].addBox(8.5F, -0.8F, 0F, 4, 1, 2, 0F); // Box 231
		bodyModel[52].setRotationPoint(34F, -13F, -5.2F);
		bodyModel[52].rotateAngleZ = -0.40142573F;

		bodyModel[53].addBox(8.5F, -0.8F, 0F, 4, 1, 2, 0F); // Box 232
		bodyModel[53].setRotationPoint(34F, -13F, -3F);
		bodyModel[53].rotateAngleZ = -0.40142573F;

		bodyModel[54].addBox(8.5F, -0.8F, 0F, 4, 1, 2, 0F); // Box 233
		bodyModel[54].setRotationPoint(34F, -13F, -0.8F);
		bodyModel[54].rotateAngleZ = -0.40142573F;

		bodyModel[55].addBox(8.5F, -0.8F, 0F, 4, 1, 2, 0F); // Box 234
		bodyModel[55].setRotationPoint(34F, -13F, 1.4F);
		bodyModel[55].rotateAngleZ = -0.40142573F;

		bodyModel[56].addBox(8.5F, -0.8F, 0F, 4, 1, 2, 0F); // Box 235
		bodyModel[56].setRotationPoint(34F, -13F, 3.6F);
		bodyModel[56].rotateAngleZ = -0.40142573F;

		bodyModel[57].addBox(8.5F, -0.8F, 0F, 4, 1, 2, 0F); // Box 236
		bodyModel[57].setRotationPoint(34F, -13F, 5.8F);
		bodyModel[57].rotateAngleZ = -0.40142573F;

		bodyModel[58].addBox(8.5F, -0.8F, 0F, 4, 1, 2, 0F); // Box 237
		bodyModel[58].setRotationPoint(34F, -13F, 8F);
		bodyModel[58].rotateAngleZ = -0.40142573F;

		bodyModel[59].addBox(8.5F, -0.8F, 0F, 4, 1, 2, 0F); // Box 238
		bodyModel[59].setRotationPoint(34F, -13F, 12.5F);
		bodyModel[59].rotateAngleZ = -0.40142573F;

		bodyModel[60].addBox(8.5F, -0.8F, 0F, 4, 1, 2, 0F); // Box 240
		bodyModel[60].setRotationPoint(34F, -13F, 10.3F);
		bodyModel[60].rotateAngleZ = -0.40142573F;

		bodyModel[61].addBox(8.5F, -0.8F, 0F, 4, 1, 2, 0F); // Box 242
		bodyModel[61].setRotationPoint(34F, -13F, -11.9F);
		bodyModel[61].rotateAngleZ = -0.40142573F;

		bodyModel[62].addBox(8.5F, -0.8F, 0F, 4, 1, 2, 0F); // Box 243
		bodyModel[62].setRotationPoint(34F, -13F, -14.1F);
		bodyModel[62].rotateAngleZ = -0.40142573F;

		bodyModel[63].addBox(4.1F, -0.8F, 0F, 4, 1, 2, 0F); // Box 244
		bodyModel[63].setRotationPoint(34F, -13F, -16.3F);
		bodyModel[63].rotateAngleZ = -0.40142573F;

		bodyModel[64].addBox(4.1F, -0.8F, 0F, 4, 1, 2, 0F); // Box 245
		bodyModel[64].setRotationPoint(34F, -13F, -14.1F);
		bodyModel[64].rotateAngleZ = -0.40142573F;

		bodyModel[65].addBox(4.1F, -0.8F, 0F, 4, 1, 2, 0F); // Box 246
		bodyModel[65].setRotationPoint(34F, -13F, -11.9F);
		bodyModel[65].rotateAngleZ = -0.40142573F;

		bodyModel[66].addBox(4.1F, -0.8F, 0F, 4, 1, 2, 0F); // Box 247
		bodyModel[66].setRotationPoint(34F, -13F, -9.6F);
		bodyModel[66].rotateAngleZ = -0.40142573F;

		bodyModel[67].addBox(4.1F, -0.8F, 0F, 4, 1, 2, 0F); // Box 248
		bodyModel[67].setRotationPoint(34F, -13F, -7.4F);
		bodyModel[67].rotateAngleZ = -0.40142573F;

		bodyModel[68].addBox(4.1F, -0.8F, 0F, 4, 1, 2, 0F); // Box 249
		bodyModel[68].setRotationPoint(34F, -13F, -5.2F);
		bodyModel[68].rotateAngleZ = -0.40142573F;

		bodyModel[69].addBox(4.1F, -0.8F, 0F, 4, 1, 2, 0F); // Box 250
		bodyModel[69].setRotationPoint(34F, -13F, -3F);
		bodyModel[69].rotateAngleZ = -0.40142573F;

		bodyModel[70].addBox(4.1F, -0.8F, 0F, 4, 1, 2, 0F); // Box 251
		bodyModel[70].setRotationPoint(34F, -13F, -0.8F);
		bodyModel[70].rotateAngleZ = -0.40142573F;

		bodyModel[71].addBox(4.1F, -0.8F, 0F, 4, 1, 2, 0F); // Box 252
		bodyModel[71].setRotationPoint(34F, -13F, 1.4F);
		bodyModel[71].rotateAngleZ = -0.40142573F;

		bodyModel[72].addBox(4.1F, -0.8F, 0F, 4, 1, 2, 0F); // Box 253
		bodyModel[72].setRotationPoint(34F, -13F, 3.6F);
		bodyModel[72].rotateAngleZ = -0.40142573F;

		bodyModel[73].addBox(4.1F, -0.8F, 0F, 4, 1, 2, 0F); // Box 254
		bodyModel[73].setRotationPoint(34F, -13F, 5.8F);
		bodyModel[73].rotateAngleZ = -0.40142573F;

		bodyModel[74].addBox(4.1F, -0.8F, 0F, 4, 1, 2, 0F); // Box 255
		bodyModel[74].setRotationPoint(34F, -13F, 8F);
		bodyModel[74].rotateAngleZ = -0.40142573F;

		bodyModel[75].addBox(4.1F, -0.8F, 0F, 4, 1, 2, 0F); // Box 256
		bodyModel[75].setRotationPoint(34F, -13F, 10.3F);
		bodyModel[75].rotateAngleZ = -0.40142573F;

		bodyModel[76].addBox(4.1F, -0.8F, 0F, 4, 1, 2, 0F); // Box 257
		bodyModel[76].setRotationPoint(34F, -13F, 12.5F);
		bodyModel[76].rotateAngleZ = -0.40142573F;

		bodyModel[77].addBox(4.1F, -0.8F, 0F, 4, 1, 2, 0F); // Box 258
		bodyModel[77].setRotationPoint(34F, -13F, 14.7F);
		bodyModel[77].rotateAngleZ = -0.40142573F;

		bodyModel[78].addBox(-0.3F, -0.8F, 0F, 4, 1, 2, 0F); // Box 259
		bodyModel[78].setRotationPoint(34F, -13F, 14.7F);
		bodyModel[78].rotateAngleZ = -0.40142573F;

		bodyModel[79].addBox(-0.3F, -0.8F, 0F, 4, 1, 2, 0F); // Box 260
		bodyModel[79].setRotationPoint(34F, -13F, 12.5F);
		bodyModel[79].rotateAngleZ = -0.40142573F;

		bodyModel[80].addBox(-0.3F, -0.8F, 0F, 4, 1, 2, 0F); // Box 261
		bodyModel[80].setRotationPoint(34F, -13F, 10.3F);
		bodyModel[80].rotateAngleZ = -0.40142573F;

		bodyModel[81].addBox(-0.3F, -0.8F, 0F, 4, 1, 2, 0F); // Box 262
		bodyModel[81].setRotationPoint(34F, -13F, -11.9F);
		bodyModel[81].rotateAngleZ = -0.40142573F;

		bodyModel[82].addBox(-0.3F, -0.8F, 0F, 4, 1, 2, 0F); // Box 263
		bodyModel[82].setRotationPoint(34F, -13F, -14.1F);
		bodyModel[82].rotateAngleZ = -0.40142573F;

		bodyModel[83].addBox(-0.3F, -0.8F, 0F, 4, 1, 2, 0F); // Box 264
		bodyModel[83].setRotationPoint(34F, -13F, -16.3F);
		bodyModel[83].rotateAngleZ = -0.40142573F;

		bodyModel[84].addBox(0F, 0F, 0F, 9, 5, 12, 0F); // Box 265
		bodyModel[84].setRotationPoint(-50.5F, -23F, 17F);

		bodyModel[85].addShapeBox(2F, -2F, 0F, 5, 2, 12, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F); // Box 266
		bodyModel[85].setRotationPoint(-50.5F, -23F, 17F);

		bodyModel[86].addShapeBox(2F, 5F, 0F, 5, 2, 12, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 267
		bodyModel[86].setRotationPoint(-50.5F, -23F, 17F);

		bodyModel[87].addShapeBox(2F, -2F, 0F, 5, 2, 12, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F); // Box 268
		bodyModel[87].setRotationPoint(-50.5F, -23F, -29F);

		bodyModel[88].addBox(0F, 0F, 0F, 9, 5, 12, 0F); // Box 269
		bodyModel[88].setRotationPoint(-50.5F, -23F, -29F);

		bodyModel[89].addShapeBox(2F, 5F, 0F, 5, 2, 12, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 270
		bodyModel[89].setRotationPoint(-50.5F, -23F, -29F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0F, 0F, 0F,0F, 0F, 3F,0F, 0F, 3F,0F, 0F, 0F,2F, 0F, 4F,0F, 0F, 4F,0F, 0F, 4F,2F, 0F, 4F); // Box 271
		bodyModel[90].setRotationPoint(21F, -16.8F, -3F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 8, 11, 34, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 4F, 0F,0F, 4F, 0F,0F, 0F, 0F); // Box 289
		bodyModel[91].setRotationPoint(-44F, -12F, -17F);

		bodyModel[92].addBox(0F, 0F, 0F, 0, 6, 10, 0F); // Box 290
		bodyModel[92].setRotationPoint(-45F, -7F, 17F);
		bodyModel[92].rotateAngleZ = -0.52359878F;

		bodyModel[93].addBox(0F, 0F, 0F, 0, 6, 10, 0F); // Box 291
		bodyModel[93].setRotationPoint(-45F, -7F, -27F);
		bodyModel[93].rotateAngleZ = -0.52359878F;

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 5, 18, 0F,0F, 0F, 0F,3F, 3F, 0F,3F, 3F, 0F,0F, 0F, 0F,0F, 0F, 0F,3F, 0F, 0F,3F, 0F, 0F,0F, 0F, 0F); // Box 292
		bodyModel[94].setRotationPoint(-48F, -11F, -9F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 3, 0, 7, 0F,0F, 1F, 0F,23F, 1F, 0F,23F, 1F, 0F,0F, 1F, 0F,0F, 0F, 1F,23F, 0F, 1F,23F, 0F, 0F,0F, 0F, 0F); // Box 297
		bodyModel[95].setRotationPoint(-43F, -15.5F, -25F);

		bodyModel[96].addBox(0F, 0F, 0F, 45, 13, 1, 0F); // Box 298
		bodyModel[96].setRotationPoint(-35.5F, -14F, 26.5F);

		bodyModel[97].addBox(0F, 0F, 0F, 45, 13, 1, 0F); // Box 299
		bodyModel[97].setRotationPoint(-35.5F, -14F, -27.5F);

		bodyModel[98].addBox(0F, 0F, 0F, 36, 13, 1, 0F); // Box 300
		bodyModel[98].setRotationPoint(9.5F, -14F, -27.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 6, 0, 1, 0F,0F, 0F, 0F,6F, 0F, 0F,6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 3F, 0F,0F, 3F, 0F,0F, 0F, 0F); // Box 301
		bodyModel[99].setRotationPoint(9.5F, -1F, -27.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 6, 0, 1, 0F,0F, 0F, 0F,6F, 0F, 0F,6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 3F, 0F,0F, 3F, 0F,0F, 0F, 0F); // Box 303
		bodyModel[100].setRotationPoint(21.5F, -1F, -27.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 6, 0, 1, 0F,0F, 0F, 0F,6F, 0F, 0F,6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 3F, 0F,0F, 3F, 0F,0F, 0F, 0F); // Box 304
		bodyModel[101].setRotationPoint(33.5F, -1F, -27.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 6, 0, 1, 0F,0F, 0F, 0F,6F, 0F, 0F,6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 3F, 0F,0F, 3F, 0F,0F, 0F, 0F); // Box 305
		bodyModel[102].setRotationPoint(9.5F, -1F, 26.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 6, 0, 1, 0F,0F, 0F, 0F,6F, 0F, 0F,6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 3F, 0F,0F, 3F, 0F,0F, 0F, 0F); // Box 306
		bodyModel[103].setRotationPoint(21.5F, -1F, 26.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 6, 0, 1, 0F,0F, 0F, 0F,6F, 0F, 0F,6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 3F, 0F,0F, 3F, 0F,0F, 0F, 0F); // Box 307
		bodyModel[104].setRotationPoint(33.5F, -1F, 26.5F);

		bodyModel[105].addBox(0F, 0F, 0F, 36, 13, 1, 0F); // Box 308
		bodyModel[105].setRotationPoint(9.5F, -14F, 26.5F);

		bodyModel[106].addBox(-1.7F, -1F, 0F, 0, 8, 16, 0F); // Box 309
		bodyModel[106].setRotationPoint(52F, -3F, 0.2F);
		bodyModel[106].rotateAngleZ = -0.20943951F;


		turretModel = new ModelRendererTurbo[122];
		turretModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import TR.BarrelBase
		turretModel[1] = new ModelRendererTurbo(this, 803, 800, textureX, textureY); // Import TR.Camera
		turretModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import TR.Commanderhatch
		turretModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import TR.OtherHatch
		turretModel[4] = new ModelRendererTurbo(this, 480, 800, textureX, textureY); // Import TR.TurretLight
		turretModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import TR.WeirdThing
		turretModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import TR.MassiveExposedFuelTank
		turretModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import TR.MGStick
		turretModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import TR.TopReactiveArmor
		turretModel[9] = new ModelRendererTurbo(this, 800, 400, textureX, textureY); // Import Shape1
		turretModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 14
		turretModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 15
		turretModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 16
		turretModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 17
		turretModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 18
		turretModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 20
		turretModel[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Mini Light
		turretModel[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 23
		turretModel[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 24
		turretModel[19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 25
		turretModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 26
		turretModel[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 28
		turretModel[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 29
		turretModel[23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 30
		turretModel[24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 31
		turretModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 32
		turretModel[26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 33
		turretModel[27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 34
		turretModel[28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 35
		turretModel[29] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 36
		turretModel[30] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 37
		turretModel[31] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 38
		turretModel[32] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 39
		turretModel[33] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 40
		turretModel[34] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 41
		turretModel[35] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 44
		turretModel[36] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 45
		turretModel[37] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 46
		turretModel[38] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 47
		turretModel[39] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 48
		turretModel[40] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 49
		turretModel[41] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 50
		turretModel[42] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 51
		turretModel[43] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 52
		turretModel[44] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 53
		turretModel[45] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 54
		turretModel[46] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 55
		turretModel[47] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 56
		turretModel[48] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 57
		turretModel[49] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 58
		turretModel[50] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 59
		turretModel[51] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 60
		turretModel[52] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 61
		turretModel[53] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 64
		turretModel[54] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 65
		turretModel[55] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 66
		turretModel[56] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 67
		turretModel[57] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 68
		turretModel[58] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 69
		turretModel[59] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 70
		turretModel[60] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 71
		turretModel[61] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 72
		turretModel[62] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 73
		turretModel[63] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 74
		turretModel[64] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 75
		turretModel[65] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 76
		turretModel[66] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 77
		turretModel[67] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 78
		turretModel[68] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 79
		turretModel[69] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 80
		turretModel[70] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 81
		turretModel[71] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 82
		turretModel[72] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 83
		turretModel[73] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 84
		turretModel[74] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 85
		turretModel[75] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 86
		turretModel[76] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 87
		turretModel[77] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 88
		turretModel[78] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 89
		turretModel[79] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 90
		turretModel[80] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 92
		turretModel[81] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 93
		turretModel[82] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 94
		turretModel[83] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 95
		turretModel[84] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 96
		turretModel[85] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 97
		turretModel[86] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 98
		turretModel[87] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 99
		turretModel[88] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 100
		turretModel[89] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 102
		turretModel[90] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 103
		turretModel[91] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 104
		turretModel[92] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 105
		turretModel[93] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 106
		turretModel[94] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 107
		turretModel[95] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 108
		turretModel[96] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 109
		turretModel[97] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 272
		turretModel[98] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 273
		turretModel[99] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 274
		turretModel[100] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 275
		turretModel[101] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 278
		turretModel[102] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 279
		turretModel[103] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 280
		turretModel[104] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 281
		turretModel[105] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 282
		turretModel[106] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 283
		turretModel[107] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 284
		turretModel[108] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 285
		turretModel[109] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 286
		turretModel[110] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 287
		turretModel[111] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 288
		turretModel[112] = new ModelRendererTurbo(this, 248, 960, textureX, textureY); // Box 293
		turretModel[113] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 294
		turretModel[114] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 295
		turretModel[115] = new ModelRendererTurbo(this, 248, 960, textureX, textureY); // Box 296
		turretModel[116] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 310
		turretModel[117] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 311
		turretModel[118] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 312
		turretModel[119] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 313
		turretModel[120] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 314
		turretModel[121] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 315

		turretModel[0].addShapeBox(20F, -26F, -4F, 3, 6, 8, 0F,1F, 0F, 9F,0F, 0F, 0F,0F, 0F, 0F,1F, 0F, 9F,1F, 0F, 9F,0F, 0F, 0F,0F, 0F, 0F,1F, 0F, 9F); // Import TR.BarrelBase
		turretModel[0].setRotationPoint(0F, 3.5F, 0F);

		turretModel[1].addBox(12F, 0F, 6F, 3, 4, 4, 0F); // Import TR.Camera
		turretModel[1].setRotationPoint(0F, -26.5F, 0F);
		turretModel[1].rotateAngleZ = 0.05235988F;

		turretModel[2].addShapeBox(-10F, 0F, -12F, 12, 4, 10, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,1F, 2F, 2F,2F, 0F, 2F,2F, 0F, 2F,2F, 0F, 2F); // Import TR.Commanderhatch
		turretModel[2].setRotationPoint(0F, -28F, 0F);

		turretModel[3].addBox(-14F, 0F, -2F, 6, 3, 10, 0F); // Import TR.OtherHatch
		turretModel[3].setRotationPoint(0F, -26.5F, 0F);
		turretModel[3].rotateAngleY = -0.57595865F;

		turretModel[4].addBox(6F, 0F, 11F, 1, 5, 3, 0F); // Import TR.TurretLight
		turretModel[4].setRotationPoint(0F, -28.7F, 0F);

		turretModel[5].addShapeBox(-26F, 0F, -10F, 7, 1, 20, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 6F, 0F,0F, 6F, 0F,0F, 0F, 0F); // Import TR.WeirdThing
		turretModel[5].setRotationPoint(0F, -24.5F, 0F);

		turretModel[6].addBox(-33F, 0F, -19F, 7, 3, 38, 0F); // Import TR.MassiveExposedFuelTank
		turretModel[6].setRotationPoint(0F, -26F, 0F);

		turretModel[7].addBox(3F, 0F, -9F, 1, 7, 3, 0F); // Import TR.MGStick
		turretModel[7].setRotationPoint(0F, -32F, 0F);
		turretModel[7].rotateAngleZ = -0.17453293F;

		turretModel[8].addShapeBox(7F, 0F, -5F, 10, 7, 10, 0F,4F, 0F, 15F,2F, 0F, 8F,2F, 0F, 8F,4F, 0F, 15F,4F, 0F, 15F,2F, 0F, 8F,2F, 0F, 8F,4F, 0F, 15F); // Import TR.TopReactiveArmor
		turretModel[8].setRotationPoint(0F, -22.5F, 0F);

		turretModel[9].addShapeBox(-10F, 0F, 2F, 1, 60, 1, 0F,-0.5F, 0F, -0.5F,-0.5F, 0F, -0.5F,-0.5F, 0F, -0.5F,-0.5F, 0F, -0.5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Shape1
		turretModel[9].setRotationPoint(0F, -60F, 0F);
		turretModel[9].rotateAngleZ = 0.05235988F;

		turretModel[10].addShapeBox(-6F, 0F, -5F, 3, 7, 10, 0F,11F, 0F, 7F,6F, 0F, 15F,6F, 0F, 15F,11F, 0F, 7F,11F, 0F, 7F,6F, 0F, 15F,6F, 0F, 15F,11F, 0F, 7F); // Box 14
		turretModel[10].setRotationPoint(0F, -22.5F, 0F);

		turretModel[11].addShapeBox(-21F, 0F, 0F, 3, 7, 0, 0F,0F, 0F, 0F,1F, 0F, 12F,1F, 0F, 12F,0F, 0F, 0F,0F, 0F, 0F,1F, 0F, 12F,1F, 0F, 12F,0F, 0F, 0F); // Box 15
		turretModel[11].setRotationPoint(0F, -22.5F, 0F);

		turretModel[12].addShapeBox(7F, 0F, -5F, 10, 2, 10, 0F,4F, 1F, 12F,2F, 0F, 5F,2F, 0F, 5F,4F, 1F, 12F,4F, 0F, 15F,2F, 0F, 8F,2F, 0F, 8F,4F, 0F, 15F); // Box 16
		turretModel[12].setRotationPoint(0F, -24.5F, 0F);

		turretModel[13].addShapeBox(20F, -26F, -4F, 0, 2, 8, 0F,1F, 0F, 6F,0F, 0F, 0F,0F, 0F, 0F,1F, 0F, 6F,1F, 0F, 9F,3F, 0F, 0F,3F, 0F, 0F,1F, 0F, 9F); // Box 17
		turretModel[13].setRotationPoint(0F, 1.5F, 0F);

		turretModel[14].addShapeBox(-6F, 0F, -5F, 3, 3, 10, 0F,11F, 0F, 4F,6F, 0F, 12F,6F, 0F, 12F,11F, 0F, 4F,11F, 0F, 7F,6F, 0F, 15F,6F, 0F, 15F,11F, 0F, 7F); // Box 18
		turretModel[14].setRotationPoint(0F, -25.5F, 0F);

		turretModel[15].addShapeBox(-18F, 0F, 0F, 0, 3, 0, 0F,0F, 0F, 0F,1F, 0F, 9F,1F, 0F, 9F,0F, 0F, 0F,3F, 0F, 0F,1F, 0F, 12F,1F, 0F, 12F,3F, 0F, 0F); // Box 20
		turretModel[15].setRotationPoint(0F, -25.5F, 0F);

		turretModel[16].addBox(22F, 0F, -9F, 3, 4, 4, 0F); // Mini Light
		turretModel[16].setRotationPoint(0F, -23F, 0F);

		turretModel[17].addBox(24F, -1F, -12F, 4, 2, 1, 0F); // Box 23
		turretModel[17].setRotationPoint(0F, -35F, 0F);
		turretModel[17].rotateAngleZ = -0.50614548F;

		turretModel[18].addBox(26F, 1F, -12F, 4, 2, 1, 0F); // Box 24
		turretModel[18].setRotationPoint(0F, -2F, 0F);
		turretModel[18].rotateAngleZ = 0.6981317F;

		turretModel[19].addBox(23F, -0.5F, -14.5F, 4, 2, 1, 0F); // Box 25
		turretModel[19].setRotationPoint(0F, -35F, 0F);
		turretModel[19].rotateAngleZ = -0.50614548F;

		turretModel[20].addBox(25F, 0.5F, -14.5F, 4, 2, 1, 0F); // Box 26
		turretModel[20].setRotationPoint(0F, -2F, 0F);
		turretModel[20].rotateAngleZ = 0.6981317F;

		turretModel[21].addBox(22F, -1.5F, -16.7F, 4, 2, 1, 0F); // Box 28
		turretModel[21].setRotationPoint(0F, -3F, 0F);
		turretModel[21].rotateAngleZ = 0.6981317F;

		turretModel[22].addBox(20F, 1.5F, -16.7F, 4, 2, 1, 0F); // Box 29
		turretModel[22].setRotationPoint(0F, -36F, 0F);
		turretModel[22].rotateAngleZ = -0.50614548F;

		turretModel[23].addBox(16F, 4.5F, -18.9F, 4, 2, 1, 0F); // Box 30
		turretModel[23].setRotationPoint(0F, -36F, 0F);
		turretModel[23].rotateAngleZ = -0.50614548F;

		turretModel[24].addBox(18F, -4.5F, -18.9F, 4, 2, 1, 0F); // Box 31
		turretModel[24].setRotationPoint(0F, -3F, 0F);
		turretModel[24].rotateAngleZ = 0.6981317F;

		turretModel[25].addBox(14F, 5.75F, -20.05F, 4, 2, 1, 0F); // Box 32
		turretModel[25].setRotationPoint(0F, -36F, 0F);
		turretModel[25].rotateAngleZ = -0.50614548F;

		turretModel[26].addBox(16F, -5.75F, -20.05F, 4, 2, 1, 0F); // Box 33
		turretModel[26].setRotationPoint(0F, -3F, 0F);
		turretModel[26].rotateAngleZ = 0.6981317F;

		turretModel[27].addBox(24.5F, -1.25F, -10.5F, 4, 2, 1, 0F); // Box 34
		turretModel[27].setRotationPoint(0F, -35F, 0F);
		turretModel[27].rotateAngleZ = -0.50614548F;

		turretModel[28].addBox(26.5F, 1.25F, -10.5F, 4, 2, 1, 0F); // Box 35
		turretModel[28].setRotationPoint(0F, -2F, 0F);
		turretModel[28].rotateAngleZ = 0.6981317F;

		turretModel[29].addBox(23.5F, -0.75F, -13.2F, 4, 2, 1, 0F); // Box 36
		turretModel[29].setRotationPoint(0F, -35F, 0F);
		turretModel[29].rotateAngleZ = -0.50614548F;

		turretModel[30].addBox(25.5F, 0.75F, -13.2F, 4, 2, 1, 0F); // Box 37
		turretModel[30].setRotationPoint(0F, -2F, 0F);
		turretModel[30].rotateAngleZ = 0.6981317F;

		turretModel[31].addBox(24F, 0F, -15.6F, 4, 2, 1, 0F); // Box 38
		turretModel[31].setRotationPoint(0F, -2F, 0F);
		turretModel[31].rotateAngleZ = 0.6981317F;

		turretModel[32].addBox(22F, 0F, -15.6F, 4, 2, 1, 0F); // Box 39
		turretModel[32].setRotationPoint(0F, -35F, 0F);
		turretModel[32].rotateAngleZ = -0.50614548F;

		turretModel[33].addBox(18F, 3F, -17.8F, 4, 2, 1, 0F); // Box 40
		turretModel[33].setRotationPoint(0F, -36F, 0F);
		turretModel[33].rotateAngleZ = -0.50614548F;

		turretModel[34].addBox(20F, -3F, -17.8F, 4, 2, 1, 0F); // Box 41
		turretModel[34].setRotationPoint(0F, -3F, 0F);
		turretModel[34].rotateAngleZ = 0.6981317F;

		turretModel[35].addBox(24.5F, -1.25F, 7.5F, 4, 2, 1, 0F); // Box 44
		turretModel[35].setRotationPoint(0F, -35F, 0F);
		turretModel[35].rotateAngleZ = -0.50614548F;

		turretModel[36].addBox(26.5F, 1.25F, 7.5F, 4, 2, 1, 0F); // Box 45
		turretModel[36].setRotationPoint(0F, -2F, 0F);
		turretModel[36].rotateAngleZ = 0.6981317F;

		turretModel[37].addBox(26F, 1F, 9F, 4, 2, 1, 0F); // Box 46
		turretModel[37].setRotationPoint(0F, -2F, 0F);
		turretModel[37].rotateAngleZ = 0.6981317F;

		turretModel[38].addBox(24F, -1F, 9F, 4, 2, 1, 0F); // Box 47
		turretModel[38].setRotationPoint(0F, -35F, 0F);
		turretModel[38].rotateAngleZ = -0.50614548F;

		turretModel[39].addBox(23.5F, -0.75F, 10.8F, 4, 2, 1, 0F); // Box 48
		turretModel[39].setRotationPoint(0F, -35F, 0F);
		turretModel[39].rotateAngleZ = -0.50614548F;

		turretModel[40].addBox(25.5F, 0.75F, 10.8F, 4, 2, 1, 0F); // Box 49
		turretModel[40].setRotationPoint(0F, -2F, 0F);
		turretModel[40].rotateAngleZ = 0.6981317F;

		turretModel[41].addBox(25F, 0.5F, 12F, 4, 2, 1, 0F); // Box 50
		turretModel[41].setRotationPoint(0F, -2F, 0F);
		turretModel[41].rotateAngleZ = 0.6981317F;

		turretModel[42].addBox(23F, -0.5F, 12F, 4, 2, 1, 0F); // Box 51
		turretModel[42].setRotationPoint(0F, -35F, 0F);
		turretModel[42].rotateAngleZ = -0.50614548F;

		turretModel[43].addBox(22F, 0F, 13.4F, 4, 2, 1, 0F); // Box 52
		turretModel[43].setRotationPoint(0F, -35F, 0F);
		turretModel[43].rotateAngleZ = -0.50614548F;

		turretModel[44].addBox(24F, 0F, 13.4F, 4, 2, 1, 0F); // Box 53
		turretModel[44].setRotationPoint(0F, -2F, 0F);
		turretModel[44].rotateAngleZ = 0.6981317F;

		turretModel[45].addBox(22F, -1.5F, 15F, 4, 2, 1, 0F); // Box 54
		turretModel[45].setRotationPoint(0F, -3F, 0F);
		turretModel[45].rotateAngleZ = 0.6981317F;

		turretModel[46].addBox(20F, 1.5F, 15F, 4, 2, 1, 0F); // Box 55
		turretModel[46].setRotationPoint(0F, -36F, 0F);
		turretModel[46].rotateAngleZ = -0.50614548F;

		turretModel[47].addBox(18F, 3F, 16.4F, 4, 2, 1, 0F); // Box 56
		turretModel[47].setRotationPoint(0F, -36F, 0F);
		turretModel[47].rotateAngleZ = -0.50614548F;

		turretModel[48].addBox(20F, -3F, 16.4F, 4, 2, 1, 0F); // Box 57
		turretModel[48].setRotationPoint(0F, -3F, 0F);
		turretModel[48].rotateAngleZ = 0.6981317F;

		turretModel[49].addBox(18F, -4.5F, 17.7F, 4, 2, 1, 0F); // Box 58
		turretModel[49].setRotationPoint(0F, -3F, 0F);
		turretModel[49].rotateAngleZ = 0.6981317F;

		turretModel[50].addBox(16F, 4.5F, 17.7F, 4, 2, 1, 0F); // Box 59
		turretModel[50].setRotationPoint(0F, -36F, 0F);
		turretModel[50].rotateAngleZ = -0.50614548F;

		turretModel[51].addBox(14F, 5.75F, 19F, 4, 2, 1, 0F); // Box 60
		turretModel[51].setRotationPoint(0F, -36F, 0F);
		turretModel[51].rotateAngleZ = -0.50614548F;

		turretModel[52].addBox(16F, -5.75F, 19F, 4, 2, 1, 0F); // Box 61
		turretModel[52].setRotationPoint(0F, -3F, 0F);
		turretModel[52].rotateAngleZ = 0.6981317F;

		turretModel[53].addBox(24.9F, -1.6F, 6.2F, 4, 2, 1, 0F); // Box 64
		turretModel[53].setRotationPoint(0F, -35F, 0F);
		turretModel[53].rotateAngleZ = -0.50614548F;

		turretModel[54].addBox(26.9F, 1.6F, 6.2F, 4, 2, 1, 0F); // Box 65
		turretModel[54].setRotationPoint(0F, -2F, 0F);
		turretModel[54].rotateAngleZ = 0.6981317F;

		turretModel[55].addBox(27.2F, 1.7F, 4.9F, 4, 2, 1, 0F); // Box 66
		turretModel[55].setRotationPoint(0F, -2F, 0F);
		turretModel[55].rotateAngleZ = 0.6981317F;

		turretModel[56].addBox(25.2F, -1.7F, 4.9F, 4, 2, 1, 0F); // Box 67
		turretModel[56].setRotationPoint(0F, -35F, 0F);
		turretModel[56].rotateAngleZ = -0.50614548F;

		turretModel[57].addBox(18.2F, 0F, -4F, 5, 1, 8, 0F); // Box 68
		turretModel[57].setRotationPoint(0F, -29.4F, 0F);
		turretModel[57].rotateAngleZ = -0.20943951F;

		turretModel[58].addBox(18.2F, -4F, 0.5F, 4, 1, 1, 0F); // Box 69
		turretModel[58].setRotationPoint(0F, -26.5F, 0F);
		turretModel[58].rotateAngleZ = -0.20943951F;

		turretModel[59].addBox(18.2F, -4F, 2F, 4, 1, 1, 0F); // Box 70
		turretModel[59].setRotationPoint(0F, -26.5F, 0F);
		turretModel[59].rotateAngleZ = -0.20943951F;

		turretModel[60].addBox(18.2F, -4F, -1.25F, 4, 1, 1, 0F); // Box 71
		turretModel[60].setRotationPoint(0F, -26.5F, 0F);
		turretModel[60].rotateAngleZ = -0.20943951F;

		turretModel[61].addBox(18.2F, -4F, -3F, 4, 1, 1, 0F); // Box 72
		turretModel[61].setRotationPoint(0F, -26.5F, 0F);
		turretModel[61].rotateAngleZ = -0.20943951F;

		turretModel[62].addBox(10.2F, -3F, -1F, 4, 1, 1, 0F); // Box 73
		turretModel[62].setRotationPoint(0F, -23.5F, 0F);
		turretModel[62].rotateAngleZ = -0.06981317F;

		turretModel[63].addBox(10.2F, -3F, -2.5F, 4, 1, 1, 0F); // Box 74
		turretModel[63].setRotationPoint(0F, -23.5F, 0F);
		turretModel[63].rotateAngleZ = -0.06981317F;

		turretModel[64].addBox(10.2F, -3F, -4.25F, 4, 1, 1, 0F); // Box 75
		turretModel[64].setRotationPoint(0F, -23.5F, 0F);
		turretModel[64].rotateAngleZ = -0.06981317F;

		turretModel[65].addBox(10.2F, -3F, -6F, 4, 1, 1, 0F); // Box 76
		turretModel[65].setRotationPoint(0F, -23.5F, 0F);
		turretModel[65].rotateAngleZ = -0.06981317F;

		turretModel[66].addBox(5.2F, -3F, -1F, 4, 1, 1, 0F); // Box 77
		turretModel[66].setRotationPoint(0F, -23.5F, 0F);
		turretModel[66].rotateAngleZ = -0.06981317F;

		turretModel[67].addBox(5.2F, -3F, -2.5F, 4, 1, 1, 0F); // Box 78
		turretModel[67].setRotationPoint(0F, -23.5F, 0F);
		turretModel[67].rotateAngleZ = -0.06981317F;

		turretModel[68].addBox(5.2F, -3F, -4.25F, 4, 1, 1, 0F); // Box 79
		turretModel[68].setRotationPoint(0F, -23.5F, 0F);
		turretModel[68].rotateAngleZ = -0.06981317F;

		turretModel[69].addBox(5.2F, -3F, -6F, 4, 1, 1, 0F); // Box 80
		turretModel[69].setRotationPoint(0F, -23.5F, 0F);
		turretModel[69].rotateAngleZ = -0.06981317F;

		turretModel[70].addBox(5.2F, -3F, 0.5F, 4, 1, 1, 0F); // Box 81
		turretModel[70].setRotationPoint(0F, -23.5F, 0F);
		turretModel[70].rotateAngleZ = -0.06981317F;

		turretModel[71].addBox(10.2F, -3F, 0.5F, 4, 1, 1, 0F); // Box 82
		turretModel[71].setRotationPoint(0F, -23.5F, 0F);
		turretModel[71].rotateAngleZ = -0.06981317F;

		turretModel[72].addBox(5.2F, -3F, 2F, 4, 1, 1, 0F); // Box 83
		turretModel[72].setRotationPoint(0F, -23.5F, 0F);
		turretModel[72].rotateAngleZ = -0.06981317F;

		turretModel[73].addBox(10.2F, -3F, 2F, 4, 1, 1, 0F); // Box 84
		turretModel[73].setRotationPoint(0F, -23.5F, 0F);
		turretModel[73].rotateAngleZ = -0.06981317F;

		turretModel[74].addBox(5.2F, -3F, 3.5F, 4, 1, 1, 0F); // Box 85
		turretModel[74].setRotationPoint(0F, -23.5F, 0F);
		turretModel[74].rotateAngleZ = -0.06981317F;

		turretModel[75].addBox(10.2F, -3F, 3.5F, 4, 1, 1, 0F); // Box 86
		turretModel[75].setRotationPoint(0F, -23.5F, 0F);
		turretModel[75].rotateAngleZ = -0.06981317F;

		turretModel[76].addBox(0.2F, -3F, 2F, 4, 1, 1, 0F); // Box 87
		turretModel[76].setRotationPoint(0F, -23.5F, 0F);
		turretModel[76].rotateAngleZ = -0.05235988F;

		turretModel[77].addBox(0.2F, -3F, 0.5F, 4, 1, 1, 0F); // Box 88
		turretModel[77].setRotationPoint(0F, -23.5F, 0F);
		turretModel[77].rotateAngleZ = -0.05235988F;

		turretModel[78].addBox(0.2F, -3F, 3.5F, 4, 1, 1, 0F); // Box 89
		turretModel[78].setRotationPoint(0F, -23.5F, 0F);
		turretModel[78].rotateAngleZ = -0.05235988F;

		turretModel[79].addShapeBox(6F, 0F, -16F, 6, 5, 7, 0F,2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 90
		turretModel[79].setRotationPoint(0F, -27F, 0F);

		turretModel[80].addBox(4F, 0F, 16F, 1, 3, 7, 0F); // Box 92
		turretModel[80].setRotationPoint(0F, -22F, 0F);
		turretModel[80].rotateAngleY = 0.31415927F;

		turretModel[81].addBox(-23F, 0F, -7F, 1, 3, 9, 0F); // Box 93
		turretModel[81].setRotationPoint(0F, -22F, 0F);
		turretModel[81].rotateAngleY = -1.37881011F;

		turretModel[82].addBox(-24F, 0F, -11F, 1, 3, 9, 0F); // Box 94
		turretModel[82].setRotationPoint(0F, -22F, 0F);
		turretModel[82].rotateAngleY = -1.15191731F;

		turretModel[83].addBox(-11F, 0F, 16F, 1, 3, 7, 0F); // Box 95
		turretModel[83].setRotationPoint(0F, -22F, 0F);
		turretModel[83].rotateAngleY = 0.41887902F;

		turretModel[84].addShapeBox(-26F, 0F, -10F, 2, 4, 6, 0F,1F, 0F, 0F,1F, 0F, 0F,1F, 0F, 0F,1F, 0F, 0F,0F, 1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 1F, 0F); // Box 96
		turretModel[84].setRotationPoint(0F, -23F, 0F);
		turretModel[84].rotateAngleY = -1.15191731F;

		turretModel[85].addBox(11.2F, -4F, 14F, 4, 1, 1, 0F); // Box 97
		turretModel[85].setRotationPoint(0F, -24.5F, 0F);
		turretModel[85].rotateAngleZ = -0.20943951F;

		turretModel[86].addBox(8.2F, -4F, 15.5F, 4, 1, 1, 0F); // Box 98
		turretModel[86].setRotationPoint(0F, -23.3F, 0F);
		turretModel[86].rotateAngleZ = -0.20943951F;

		turretModel[87].addBox(5.2F, -4F, 17F, 4, 1, 1, 0F); // Box 99
		turretModel[87].setRotationPoint(0F, -22.5F, 0F);
		turretModel[87].rotateAngleZ = -0.20943951F;

		turretModel[88].addShapeBox(7.5F, 0F, 6F, 4, 4, 4, 0F,0F, 0F, 0F,1F, 1F, 1F,1F, 1F, 1F,0F, 0F, 0F,0F, 0F, 0F,1F, 0F, 1F,1F, 0F, 1F,0F, 0F, 0F); // Box 100
		turretModel[88].setRotationPoint(0F, -26.5F, 0F);
		turretModel[88].rotateAngleZ = 0.05235988F;

		turretModel[89].addShapeBox(-31F, 0F, -19F, 3, 2, 38, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F); // Box 102
		turretModel[89].setRotationPoint(0F, -28F, 0F);

		turretModel[90].addShapeBox(-31F, 0F, -19F, 3, 2, 38, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 103
		turretModel[90].setRotationPoint(0F, -23F, 0F);

		turretModel[91].addBox(-23.5F, 0F, -2F, 1, 4, 7, 0F); // Box 104
		turretModel[91].setRotationPoint(0F, -22F, 0F);
		turretModel[91].rotateAngleY = -1.69296937F;

		turretModel[92].addBox(14F, -15.75F, 21.3F, 4, 1, 1, 0F); // Box 105
		turretModel[92].setRotationPoint(0F, 0F, 0F);
		turretModel[92].rotateAngleY = -0.12217305F;
		turretModel[92].rotateAngleZ = 0.6981317F;

		turretModel[93].addBox(14F, -15.75F, 20.2F, 4, 1, 1, 0F); // Box 106
		turretModel[93].setRotationPoint(0F, 0F, 0F);
		turretModel[93].rotateAngleY = -0.12217305F;
		turretModel[93].rotateAngleZ = 0.6981317F;

		turretModel[94].addBox(12F, -17.75F, 20.2F, 4, 1, 1, 0F); // Box 107
		turretModel[94].setRotationPoint(0F, 0F, 0F);
		turretModel[94].rotateAngleY = -0.12217305F;
		turretModel[94].rotateAngleZ = 0.6981317F;

		turretModel[95].addBox(12F, -17.75F, 21.3F, 4, 1, 1, 0F); // Box 108
		turretModel[95].setRotationPoint(0F, 0F, 0F);
		turretModel[95].rotateAngleY = -0.12217305F;
		turretModel[95].rotateAngleZ = 0.6981317F;

		turretModel[96].addBox(1F, 0F, 15F, 1, 2, 8, 0F); // Box 109
		turretModel[96].setRotationPoint(0F, -22F, 0F);
		turretModel[96].rotateAngleY = -0.27925268F;
		turretModel[96].rotateAngleZ = -0.52359878F;

		turretModel[97].addBox(-14.8F, -3F, 3.5F, 2, 2, 3, 0F); // Box 272
		turretModel[97].setRotationPoint(0F, -23.5F, 0F);
		turretModel[97].rotateAngleZ = -0.05235988F;

		turretModel[98].addShapeBox(-10F, 0F, -12F, 10, 4, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,2F, 2F, 2F,2F, 0F, 2F,2F, 0F, 2F,2F, 0F, 2F); // Box 273
		turretModel[98].setRotationPoint(1F, -28.5F, 1F);

		turretModel[99].addShapeBox(0F, 0F, -7.5F, 1, 7, 1, 0F,0F, 2F, 4F,0F, 2F, 4F,0F, 2F, 4F,0F, 2F, 4F,0F, 0F, 3F,0F, 0F, 3F,0F, 0F, 3F,0F, 0F, 3F); // Box 274
		turretModel[99].setRotationPoint(0F, -33F, 0F);

		turretModel[100].addShapeBox(0F, 0F, -4.5F, 1, 3, 1, 0F,0F, 2F, 0F,0F, 2F, 0F,0F, 2F, 0F,0F, 2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 1F,0F, 0F, 1F); // Box 275
		turretModel[100].setRotationPoint(0F, -38F, 0F);

		turretModel[101].addShapeBox(0F, 0F, -10.5F, 1, 3, 1, 0F,0F, 2F, 0F,0F, 2F, 0F,0F, 2F, 0F,0F, 2F, 0F,0F, 0F, 1F,0F, 0F, 1F,0F, 0F, 0F,0F, 0F, 0F); // Box 278
		turretModel[101].setRotationPoint(0F, -38F, 0F);

		turretModel[102].addBox(0F, 0F, -9.5F, 1, 2, 5, 0F); // Box 279
		turretModel[102].setRotationPoint(0F, -40F, 0F);

		turretModel[103].addBox(-2F, 2F, -23F, 1, 2, 8, 0F); // Box 280
		turretModel[103].setRotationPoint(0F, -22F, 0F);
		turretModel[103].rotateAngleY = 0.27925268F;
		turretModel[103].rotateAngleZ = -0.52359878F;

		turretModel[104].addBox(-23.5F, 0F, -2F, 1, 4, 7, 0F); // Box 281
		turretModel[104].setRotationPoint(0F, -22F, 0F);
		turretModel[104].rotateAngleY = 1.69296937F;

		turretModel[105].addBox(16F, -13.75F, -19.7F, 4, 1, 1, 0F); // Box 282
		turretModel[105].setRotationPoint(0F, 0F, -1F);
		turretModel[105].rotateAngleY = -0.12217305F;
		turretModel[105].rotateAngleZ = 0.6981317F;

		turretModel[106].addBox(16F, -13.75F, -20.8F, 4, 1, 1, 0F); // Box 283
		turretModel[106].setRotationPoint(0F, 0F, -1F);
		turretModel[106].rotateAngleY = -0.12217305F;
		turretModel[106].rotateAngleZ = 0.6981317F;

		turretModel[107].addBox(14F, -15.75F, -19.7F, 4, 1, 1, 0F); // Box 284
		turretModel[107].setRotationPoint(0F, 0F, -1F);
		turretModel[107].rotateAngleY = -0.12217305F;
		turretModel[107].rotateAngleZ = 0.6981317F;

		turretModel[108].addBox(14F, -15.75F, -20.8F, 4, 1, 1, 0F); // Box 285
		turretModel[108].setRotationPoint(0F, 0F, -1F);
		turretModel[108].rotateAngleY = -0.12217305F;
		turretModel[108].rotateAngleZ = 0.6981317F;

		turretModel[109].addBox(3F, 0F, -5F, 3, 4, 4, 0F); // Box 286
		turretModel[109].setRotationPoint(0F, -30F, 0F);

		turretModel[110].addBox(-31.5F, -3F, 3.5F, 4, 3, 8, 0F); // Box 287
		turretModel[110].setRotationPoint(0F, -26.5F, 0F);
		turretModel[110].rotateAngleZ = -0.05235988F;

		turretModel[111].addBox(-31.5F, -3F, -11.5F, 4, 3, 8, 0F); // Box 288
		turretModel[111].setRotationPoint(0F, -26.5F, 0F);
		turretModel[111].rotateAngleZ = -0.05235988F;

		turretModel[112].addBox(17.8F, 8F, -8F, 2, 6, 5, 0F); // Box 293
		turretModel[112].setRotationPoint(0F, -32F, 0F);
		turretModel[112].rotateAngleY = -1.93731547F;

		turretModel[113].addBox(-23.5F, 0F, -6F, 1, 4, 7, 0F); // Box 294
		turretModel[113].setRotationPoint(0F, -22F, 0F);
		turretModel[113].rotateAngleY = 1.22173048F;

		turretModel[114].addBox(1F, 0F, -23F, 1, 2, 8, 0F); // Box 295
		turretModel[114].setRotationPoint(0F, -22F, 0F);
		turretModel[114].rotateAngleY = -0.40142573F;
		turretModel[114].rotateAngleZ = -0.4712389F;

		turretModel[115].addBox(20F, 8F, -8F, 2, 6, 5, 0F); // Box 296
		turretModel[115].setRotationPoint(0F, -32F, 0F);
		turretModel[115].rotateAngleY = -1.93731547F;

		turretModel[116].addBox(-33.5F, 0F, -20F, 8, 4, 1, 0F); // Box 310
		turretModel[116].setRotationPoint(0F, -26.5F, 0F);

		turretModel[117].addShapeBox(-31.5F, 0F, -20F, 4, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,02F, 0F, 0F,2F, 0F, 0F); // Box 311
		turretModel[117].setRotationPoint(0F, -28.5F, 0F);

		turretModel[118].addShapeBox(-31.5F, 0F, -20F, 4, 2, 1, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 312
		turretModel[118].setRotationPoint(0F, -22.5F, 0F);

		turretModel[119].addShapeBox(-31.5F, 0F, 19F, 4, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,02F, 0F, 0F,2F, 0F, 0F); // Box 313
		turretModel[119].setRotationPoint(0F, -28.5F, 0F);

		turretModel[120].addBox(-33.5F, 0F, 19F, 8, 4, 1, 0F); // Box 314
		turretModel[120].setRotationPoint(0F, -26.5F, 0F);

		turretModel[121].addShapeBox(-31.5F, 0F, 19F, 4, 2, 1, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 315
		turretModel[121].setRotationPoint(0F, -22.5F, 0F);


		barrelModel = new ModelRendererTurbo[15];
		barrelModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import BL.BarrelBase
		barrelModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import BL.MainBarrel
		barrelModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import BL.WormThing
		barrelModel[3] = new ModelRendererTurbo(this, 800, 750, textureX, textureY); // Import BL.TipofGun
		barrelModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import BL.GunHolder
		barrelModel[5] = new ModelRendererTurbo(this, 800, 600, textureX, textureY); // Import BL.MainGunBody
		barrelModel[6] = new ModelRendererTurbo(this, 800, 700, textureX, textureY); // Import BL.MGHandGuard
		barrelModel[7] = new ModelRendererTurbo(this, 800, 680, textureX, textureY); // Import BL.MGBarrel
		barrelModel[8] = new ModelRendererTurbo(this, 850, 680, textureX, textureY); // Import BL.MGsight
		barrelModel[9] = new ModelRendererTurbo(this, 248, 960, textureX, textureY); // Import BL.AmmoBox
		barrelModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 196
		barrelModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 197
		barrelModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 198
		barrelModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 199
		barrelModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 200

		barrelModel[0].addShapeBox(3F, -1.5F, -1.5F, 5, 3, 3, 0F,0F, 3F, 3F,1F, 1F, 1F,1F, 1F, 1F,0F, 3F, 3F,0F, 3F, 3F,1F, 1F, 1F,1F, 1F, 1F,0F, 3F, 3F); // Import BL.BarrelBase
		barrelModel[0].setRotationPoint(18F, -20.5F, 0F);

		barrelModel[1].addBox(6F, -1.5F, -1.5F, 85, 3, 3, 0F); // Import BL.MainBarrel
		barrelModel[1].setRotationPoint(18F, -20.5F, 0F);

		barrelModel[2].addBox(44F, -2.5F, -2.5F, 20, 5, 5, 0F); // Import BL.WormThing
		barrelModel[2].setRotationPoint(18F, -20.5F, 0F);

		barrelModel[3].addBox(91F, -1.5F, -1.5F, 1, 3, 3, 0F); // Import BL.TipofGun
		barrelModel[3].setRotationPoint(18F, -20.5F, 0F);

		barrelModel[4].addBox(-3F, 0F, 3.5F, 5, 2, 3, 0F); // Import BL.GunHolder
		barrelModel[4].setRotationPoint(5.5F, -32F, -12.5F);
		barrelModel[4].rotateAngleZ = -0.13962634F;

		barrelModel[5].addBox(-4F, -3F, 4F, 10, 3, 2, 0F); // Import BL.MainGunBody
		barrelModel[5].setRotationPoint(5.5F, -32F, -12.5F);

		barrelModel[6].addBox(6F, -2.7F, 4.5F, 10, 2, 1, 0F); // Import BL.MGHandGuard
		barrelModel[6].setRotationPoint(5.5F, -32F, -12.5F);

		barrelModel[7].addBox(16F, -2.7F, 4.5F, 10, 1, 1, 0F); // Import BL.MGBarrel
		barrelModel[7].setRotationPoint(5.5F, -32F, -12.5F);

		barrelModel[8].addBox(22F, -4.5F, 4.5F, 1, 2, 1, 0F); // Import BL.MGsight
		barrelModel[8].setRotationPoint(5.5F, -32F, -12.5F);

		barrelModel[9].addBox(4F, -2F, 2F, 2, 6, 5, 0F); // Import BL.AmmoBox
		barrelModel[9].setRotationPoint(5.5F, -32F, -12.5F);
		barrelModel[9].rotateAngleX = -0.10471976F;
		barrelModel[9].rotateAngleY = -0.40142573F;
		barrelModel[9].rotateAngleZ = 0.41887902F;

		barrelModel[10].addBox(65F, -2F, -2F, 12, 4, 4, 0F); // Box 196
		barrelModel[10].setRotationPoint(18F, -20.5F, 0F);

		barrelModel[11].addBox(78F, -2F, -2F, 12, 4, 4, 0F); // Box 197
		barrelModel[11].setRotationPoint(18F, -20.5F, 0F);

		barrelModel[12].addBox(31F, -2F, -2F, 12, 4, 4, 0F); // Box 198
		barrelModel[12].setRotationPoint(18F, -20.5F, 0F);

		barrelModel[13].addBox(18F, -2F, -2F, 12, 4, 4, 0F); // Box 199
		barrelModel[13].setRotationPoint(18F, -20.5F, 0F);

		barrelModel[14].addShapeBox(-5F, -2F, -2F, 22, 4, 4, 0F,0F, 1F, 1F,0F, 0F, 0F,0F, 0F, 0F,0F, 1F, 1F,0F, 1F, 1F,0F, 0F, 0F,0F, 0F, 0F,0F, 1F, 1F); // Box 200
		barrelModel[14].setRotationPoint(18F, -20.5F, 0F);


		leftTrackWheelModels = new ModelRendererTurbo[24];
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 248, 960, textureX, textureY); // Box 130
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 248, 960, textureX, textureY); // Box 132
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 248, 960, textureX, textureY); // Box 148
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 248, 960, textureX, textureY); // Box 149
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 248, 960, textureX, textureY); // Box 150
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 248, 960, textureX, textureY); // Box 151
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 248, 960, textureX, textureY); // Box 152
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 248, 960, textureX, textureY); // Box 153
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 248, 960, textureX, textureY); // Box 154
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 248, 960, textureX, textureY); // Box 155
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 248, 960, textureX, textureY); // Box 156
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 248, 960, textureX, textureY); // Box 157
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 248, 960, textureX, textureY); // Box 158
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 248, 960, textureX, textureY); // Box 159
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 248, 960, textureX, textureY); // Box 160
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 248, 960, textureX, textureY); // Box 161
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 248, 960, textureX, textureY); // Box 162
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 248, 960, textureX, textureY); // Box 163
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 248, 960, textureX, textureY); // Box 164
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 248, 960, textureX, textureY); // Box 165
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 248, 960, textureX, textureY); // Box 166
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 248, 960, textureX, textureY); // Box 167
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 248, 960, textureX, textureY); // Box 168
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 248, 960, textureX, textureY); // Box 169

		leftTrackWheelModels[0].addShapeBox(-2.5F, -4.5F, -3F, 5, 2, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F); // Box 130
		leftTrackWheelModels[0].setRotationPoint(35.5F, 4.5F, -22F);

		leftTrackWheelModels[1].addBox(-4.5F, -2.5F, -3F, 9, 5, 6, 0F); // Box 132
		leftTrackWheelModels[1].setRotationPoint(35.5F, 4.5F, -22F);

		leftTrackWheelModels[2].addShapeBox(-2.5F, 2.5F, -3F, 5, 2, 6, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 148
		leftTrackWheelModels[2].setRotationPoint(35.5F, 4.5F, -22F);

		leftTrackWheelModels[3].addBox(-4.5F, -2.5F, -3F, 9, 5, 6, 0F); // Box 149
		leftTrackWheelModels[3].setRotationPoint(24.5F, 4.5F, -22F);

		leftTrackWheelModels[4].addShapeBox(-2.5F, 2.5F, -3F, 5, 2, 6, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 150
		leftTrackWheelModels[4].setRotationPoint(24.5F, 4.5F, -22F);

		leftTrackWheelModels[5].addShapeBox(-2.5F, -4.5F, -3F, 5, 2, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F); // Box 151
		leftTrackWheelModels[5].setRotationPoint(24.5F, 4.5F, -22F);

		leftTrackWheelModels[6].addBox(-4.5F, -2.5F, -3F, 9, 5, 6, 0F); // Box 152
		leftTrackWheelModels[6].setRotationPoint(12.5F, 4.5F, -22F);

		leftTrackWheelModels[7].addShapeBox(-2.5F, 2.5F, -3F, 5, 2, 6, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 153
		leftTrackWheelModels[7].setRotationPoint(12.5F, 4.5F, -22F);

		leftTrackWheelModels[8].addShapeBox(-2.5F, -4.5F, -3F, 5, 2, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F); // Box 154
		leftTrackWheelModels[8].setRotationPoint(12.5F, 4.5F, -22F);

		leftTrackWheelModels[9].addBox(-4.5F, -2.5F, -3F, 9, 5, 6, 0F); // Box 155
		leftTrackWheelModels[9].setRotationPoint(0.5F, 4.5F, -22F);

		leftTrackWheelModels[10].addShapeBox(-2.5F, 2.5F, -3F, 5, 2, 6, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 156
		leftTrackWheelModels[10].setRotationPoint(0.5F, 4.5F, -22F);

		leftTrackWheelModels[11].addShapeBox(-2.5F, -4.5F, -3F, 5, 2, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F); // Box 157
		leftTrackWheelModels[11].setRotationPoint(0.5F, 4.5F, -22F);

		leftTrackWheelModels[12].addBox(-4.5F, -2.5F, -3F, 9, 5, 6, 0F); // Box 158
		leftTrackWheelModels[12].setRotationPoint(-10.5F, 4.5F, -22F);

		leftTrackWheelModels[13].addShapeBox(-2.5F, 2.5F, -3F, 5, 2, 6, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 159
		leftTrackWheelModels[13].setRotationPoint(-10.5F, 4.5F, -22F);

		leftTrackWheelModels[14].addShapeBox(-2.5F, -4.5F, -3F, 5, 2, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F); // Box 160
		leftTrackWheelModels[14].setRotationPoint(-10.5F, 4.5F, -22F);

		leftTrackWheelModels[15].addBox(-4.5F, -2.5F, -3F, 9, 5, 6, 0F); // Box 161
		leftTrackWheelModels[15].setRotationPoint(-22.5F, 4.5F, -22F);

		leftTrackWheelModels[16].addShapeBox(-2.5F, 2.5F, -3F, 5, 2, 6, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 162
		leftTrackWheelModels[16].setRotationPoint(-22.5F, 4.5F, -22F);

		leftTrackWheelModels[17].addShapeBox(-2.5F, -4.5F, -3F, 5, 2, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F); // Box 163
		leftTrackWheelModels[17].setRotationPoint(-22.5F, 4.5F, -22F);

		leftTrackWheelModels[18].addShapeBox(-2.5F, -4.5F, -3F, 5, 2, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F); // Box 164
		leftTrackWheelModels[18].setRotationPoint(48.5F, -2.5F, -22F);

		leftTrackWheelModels[19].addBox(-4.5F, -2.5F, -3F, 9, 5, 6, 0F); // Box 165
		leftTrackWheelModels[19].setRotationPoint(48.5F, -2.5F, -22F);

		leftTrackWheelModels[20].addShapeBox(-2.5F, 2.5F, -3F, 5, 2, 6, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 166
		leftTrackWheelModels[20].setRotationPoint(48.5F, -2.5F, -22F);

		leftTrackWheelModels[21].addBox(-4.5F, -2.5F, -3F, 9, 5, 6, 0F); // Box 167
		leftTrackWheelModels[21].setRotationPoint(-36.5F, -3.5F, -22F);

		leftTrackWheelModels[22].addShapeBox(-2.5F, 2.5F, -3F, 5, 2, 6, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 168
		leftTrackWheelModels[22].setRotationPoint(-36.5F, -3.5F, -22F);

		leftTrackWheelModels[23].addShapeBox(-2.5F, -4.5F, -3F, 5, 2, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F); // Box 169
		leftTrackWheelModels[23].setRotationPoint(-36.5F, -3.5F, -22F);


		rightTrackWheelModels = new ModelRendererTurbo[24];
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 248, 960, textureX, textureY); // Box 170
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 248, 960, textureX, textureY); // Box 171
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 248, 960, textureX, textureY); // Box 172
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 248, 960, textureX, textureY); // Box 173
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 248, 960, textureX, textureY); // Box 174
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 248, 960, textureX, textureY); // Box 175
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 248, 960, textureX, textureY); // Box 176
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 248, 960, textureX, textureY); // Box 177
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 248, 960, textureX, textureY); // Box 178
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 248, 960, textureX, textureY); // Box 179
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 248, 960, textureX, textureY); // Box 180
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 248, 960, textureX, textureY); // Box 181
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 248, 960, textureX, textureY); // Box 182
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 248, 960, textureX, textureY); // Box 183
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 248, 960, textureX, textureY); // Box 184
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 248, 960, textureX, textureY); // Box 185
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 248, 960, textureX, textureY); // Box 186
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 248, 960, textureX, textureY); // Box 187
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 248, 960, textureX, textureY); // Box 188
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 248, 960, textureX, textureY); // Box 189
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 248, 960, textureX, textureY); // Box 190
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 248, 960, textureX, textureY); // Box 192
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 248, 960, textureX, textureY); // Box 193
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 248, 960, textureX, textureY); // Box 194

		rightTrackWheelModels[0].addBox(-4.5F, -2.5F, -3F, 9, 5, 6, 0F); // Box 170
		rightTrackWheelModels[0].setRotationPoint(-22.5F, 4.5F, 22F);

		rightTrackWheelModels[1].addShapeBox(-2.5F, -4.5F, -3F, 5, 2, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F); // Box 171
		rightTrackWheelModels[1].setRotationPoint(-22.5F, 4.5F, 22F);

		rightTrackWheelModels[2].addShapeBox(-2.5F, 2.5F, -3F, 5, 2, 6, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 172
		rightTrackWheelModels[2].setRotationPoint(-22.5F, 4.5F, 22F);

		rightTrackWheelModels[3].addShapeBox(-2.5F, 2.5F, -3F, 5, 2, 6, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 173
		rightTrackWheelModels[3].setRotationPoint(-10.5F, 4.5F, 22F);

		rightTrackWheelModels[4].addBox(-4.5F, -2.5F, -3F, 9, 5, 6, 0F); // Box 174
		rightTrackWheelModels[4].setRotationPoint(-10.5F, 4.5F, 22F);

		rightTrackWheelModels[5].addShapeBox(-2.5F, -4.5F, -3F, 5, 2, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F); // Box 175
		rightTrackWheelModels[5].setRotationPoint(-10.5F, 4.5F, 22F);

		rightTrackWheelModels[6].addShapeBox(-2.5F, -4.5F, -3F, 5, 2, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F); // Box 176
		rightTrackWheelModels[6].setRotationPoint(0.5F, 4.5F, 22F);

		rightTrackWheelModels[7].addBox(-4.5F, -2.5F, -3F, 9, 5, 6, 0F); // Box 177
		rightTrackWheelModels[7].setRotationPoint(0.5F, 4.5F, 22F);

		rightTrackWheelModels[8].addShapeBox(-2.5F, 2.5F, -3F, 5, 2, 6, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 178
		rightTrackWheelModels[8].setRotationPoint(0.5F, 4.5F, 22F);

		rightTrackWheelModels[9].addShapeBox(-2.5F, 2.5F, -3F, 5, 2, 6, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 179
		rightTrackWheelModels[9].setRotationPoint(12.5F, 4.5F, 22F);

		rightTrackWheelModels[10].addBox(-4.5F, -2.5F, -3F, 9, 5, 6, 0F); // Box 180
		rightTrackWheelModels[10].setRotationPoint(12.5F, 4.5F, 22F);

		rightTrackWheelModels[11].addShapeBox(-2.5F, -4.5F, -3F, 5, 2, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F); // Box 181
		rightTrackWheelModels[11].setRotationPoint(12.5F, 4.5F, 22F);

		rightTrackWheelModels[12].addShapeBox(-2.5F, -4.5F, -3F, 5, 2, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F); // Box 182
		rightTrackWheelModels[12].setRotationPoint(24.5F, 4.5F, 22F);

		rightTrackWheelModels[13].addBox(-4.5F, -2.5F, -3F, 9, 5, 6, 0F); // Box 183
		rightTrackWheelModels[13].setRotationPoint(24.5F, 4.5F, 22F);

		rightTrackWheelModels[14].addShapeBox(-2.5F, 2.5F, -3F, 5, 2, 6, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 184
		rightTrackWheelModels[14].setRotationPoint(24.5F, 4.5F, 22F);

		rightTrackWheelModels[15].addShapeBox(-2.5F, 2.5F, -3F, 5, 2, 6, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 185
		rightTrackWheelModels[15].setRotationPoint(35.5F, 4.5F, 22F);

		rightTrackWheelModels[16].addBox(-4.5F, -2.5F, -3F, 9, 5, 6, 0F); // Box 186
		rightTrackWheelModels[16].setRotationPoint(35.5F, 4.5F, 22F);

		rightTrackWheelModels[17].addShapeBox(-2.5F, -4.5F, -3F, 5, 2, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F); // Box 187
		rightTrackWheelModels[17].setRotationPoint(35.5F, 4.5F, 22F);

		rightTrackWheelModels[18].addBox(-4.5F, -2.5F, -3F, 9, 5, 6, 0F); // Box 188
		rightTrackWheelModels[18].setRotationPoint(48.5F, -2.5F, 22F);

		rightTrackWheelModels[19].addShapeBox(-2.5F, -4.5F, -3F, 5, 2, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F); // Box 189
		rightTrackWheelModels[19].setRotationPoint(48.5F, -2.5F, 22F);

		rightTrackWheelModels[20].addShapeBox(-2.5F, 2.5F, -3F, 5, 2, 6, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 190
		rightTrackWheelModels[20].setRotationPoint(48.5F, -2.5F, 22F);

		rightTrackWheelModels[21].addShapeBox(-2.5F, -4.5F, -3F, 5, 2, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F); // Box 192
		rightTrackWheelModels[21].setRotationPoint(-36.5F, -3.5F, 22F);

		rightTrackWheelModels[22].addBox(-4.5F, -2.5F, -3F, 9, 5, 6, 0F); // Box 193
		rightTrackWheelModels[22].setRotationPoint(-36.5F, -3.5F, 22F);

		rightTrackWheelModels[23].addShapeBox(-2.5F, 2.5F, -3F, 5, 2, 6, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 194
		rightTrackWheelModels[23].setRotationPoint(-36.5F, -3.5F, 22F);


		leftTrackModel = new ModelRendererTurbo[5];
		leftTrackModel[0] = new ModelRendererTurbo(this, 500, 900, textureX, textureY); // Import LT.TrackFront
		leftTrackModel[1] = new ModelRendererTurbo(this, 530, 900, textureX, textureY); // Import LT.TrackFrontBottomCorner
		leftTrackModel[2] = new ModelRendererTurbo(this, 500, 870, textureX, textureY); // Import LT.TrackBottom
		leftTrackModel[3] = new ModelRendererTurbo(this, 500, 830, textureX, textureY); // Import LT.TrackBackBottomCorner
		leftTrackModel[4] = new ModelRendererTurbo(this, 530, 830, textureX, textureY); // Import LT.TrackBack

		leftTrackModel[0].addBox(0F, 0F, -4F, 1, 8, 8, 0F); // Import LT.TrackFront
		leftTrackModel[0].setRotationPoint(53F, -8F, -22F);

		leftTrackModel[1].addBox(0F, 0F, -4F, 1, 18, 8, 0F); // Import LT.TrackFrontBottomCorner
		leftTrackModel[1].setRotationPoint(53.5F, -0.5F, -22F);
		leftTrackModel[1].rotateAngleZ = -1.01229097F;

		leftTrackModel[2].addBox(0F, 0F, -4F, 64, 1, 8, 0F); // Import LT.TrackBottom
		leftTrackModel[2].setRotationPoint(-25F, 9F, -22F);

		leftTrackModel[3].addBox(0F, 0F, -4F, 1, 20, 8, 0F); // Import LT.TrackBackBottomCorner
		leftTrackModel[3].setRotationPoint(-42F, 0F, -22F);
		leftTrackModel[3].rotateAngleZ = 1.047198F;

		leftTrackModel[4].addBox(0F, 0F, -4F, 1, 8, 8, 0F); // Import LT.TrackBack
		leftTrackModel[4].setRotationPoint(-42F, -8F, -22F);


		rightTrackModel = new ModelRendererTurbo[5];
		rightTrackModel[0] = new ModelRendererTurbo(this, 500, 900, textureX, textureY); // Import RT.TrackFront
		rightTrackModel[1] = new ModelRendererTurbo(this, 530, 900, textureX, textureY); // Import RT.TrackFrontBottomCorner
		rightTrackModel[2] = new ModelRendererTurbo(this, 500, 870, textureX, textureY); // Import RT.TrackBottom
		rightTrackModel[3] = new ModelRendererTurbo(this, 500, 830, textureX, textureY); // Import RT.TrackBackBottomCorner
		rightTrackModel[4] = new ModelRendererTurbo(this, 530, 830, textureX, textureY); // Import RT.TrackBack

		rightTrackModel[0].addBox(0F, 0F, -4F, 1, 8, 8, 0F); // Import RT.TrackFront
		rightTrackModel[0].setRotationPoint(53F, -8F, 22F);

		rightTrackModel[1].addBox(0F, 0F, -4F, 1, 18, 8, 0F); // Import RT.TrackFrontBottomCorner
		rightTrackModel[1].setRotationPoint(53.5F, -0.5F, 22F);
		rightTrackModel[1].rotateAngleZ = -1.01229097F;

		rightTrackModel[2].addBox(0F, 0F, -4F, 64, 1, 8, 0F); // Import RT.TrackBottom
		rightTrackModel[2].setRotationPoint(-25F, 9F, 22F);

		rightTrackModel[3].addBox(0F, 0F, -4F, 1, 20, 8, 0F); // Import RT.TrackBackBottomCorner
		rightTrackModel[3].setRotationPoint(-42F, 0F, 22F);
		rightTrackModel[3].rotateAngleZ = 1.047198F;

		rightTrackModel[4].addBox(0F, 0F, -4F, 1, 8, 8, 0F); // Import RT.TrackBack
		rightTrackModel[4].setRotationPoint(-42F, -8F, 22F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
