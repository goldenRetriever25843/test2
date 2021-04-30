//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelT72Mark3 extends ModelVehicle
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelT72Mark3()
	{
		bodyModel = new ModelRendererTurbo[58];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Import CR.TopAngle
		bodyModel[1] = new ModelRendererTurbo(this, 0, 900, textureX, textureY); // Import CR.FrontLowerGlacis
		bodyModel[2] = new ModelRendererTurbo(this, 148, 960, textureX, textureY); // Import CR.MainBulk
		bodyModel[3] = new ModelRendererTurbo(this, 0, 620, textureX, textureY); // Import CR.RightTrackFront
		bodyModel[4] = new ModelRendererTurbo(this, 50, 620, textureX, textureY); // Import CR.RightTrackFrontTop
		bodyModel[5] = new ModelRendererTurbo(this, 35, 0, textureX, textureY); // Import CR.RightTrackMain
		bodyModel[6] = new ModelRendererTurbo(this, 0, 540, textureX, textureY); // Import CR.rightTrackFrontCoverUp
		bodyModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import CR.BackTopTrack
		bodyModel[8] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import CR.BackBottomTrackright
		bodyModel[9] = new ModelRendererTurbo(this, 0, 330, textureX, textureY); // Import CR.UtilityLog
		bodyModel[10] = new ModelRendererTurbo(this, 100, 330, textureX, textureY); // Import CR.LogHolderRight
		bodyModel[11] = new ModelRendererTurbo(this, 100, 330, textureX, textureY); // Import CR.LogHolderLeft
		bodyModel[12] = new ModelRendererTurbo(this, 50, 620, textureX, textureY); // Import CR.LeftTrackFrontTop
		bodyModel[13] = new ModelRendererTurbo(this, 0, 620, textureX, textureY); // Import CR.LeftTrackFront
		bodyModel[14] = new ModelRendererTurbo(this, 0, 540, textureX, textureY); // Import CR.leftTrackFrontCoverUp
		bodyModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import CR.LeftTrackMain
		bodyModel[16] = new ModelRendererTurbo(this, 480, 800, textureX, textureY); // Import CR.LeftLight
		bodyModel[17] = new ModelRendererTurbo(this, 480, 800, textureX, textureY); // Import CR.RightLight
		bodyModel[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import CR.BackBonusArea
		bodyModel[19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 101
		bodyModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 110
		bodyModel[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 111
		bodyModel[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 114
		bodyModel[23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 116
		bodyModel[24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 271
		bodyModel[25] = new ModelRendererTurbo(this, 148, 960, textureX, textureY); // Box 289
		bodyModel[26] = new ModelRendererTurbo(this, 35, 0, textureX, textureY); // Box 298
		bodyModel[27] = new ModelRendererTurbo(this, 35, 0, textureX, textureY); // Box 299
		bodyModel[28] = new ModelRendererTurbo(this, 35, 0, textureX, textureY); // Box 300
		bodyModel[29] = new ModelRendererTurbo(this, 35, 0, textureX, textureY); // Box 308
		bodyModel[30] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 203
		bodyModel[31] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 204
		bodyModel[32] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 206
		bodyModel[33] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 207
		bodyModel[34] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 209
		bodyModel[35] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 210
		bodyModel[36] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 211
		bodyModel[37] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 212
		bodyModel[38] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 265
		bodyModel[39] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 266
		bodyModel[40] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 268
		bodyModel[41] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 269
		bodyModel[42] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 270
		bodyModel[43] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 271
		bodyModel[44] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 272
		bodyModel[45] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 273
		bodyModel[46] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 274
		bodyModel[47] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 275
		bodyModel[48] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 276
		bodyModel[49] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1
		bodyModel[50] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 2
		bodyModel[51] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 4
		bodyModel[52] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 8
		bodyModel[53] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 9
		bodyModel[54] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 10
		bodyModel[55] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 11
		bodyModel[56] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 12
		bodyModel[57] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 13

		bodyModel[0].addShapeBox(0F, 0F, 0F, 22, 1, 34, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 5F, 0F); // Import CR.TopAngle
		bodyModel[0].setRotationPoint(29F, -14F, -17F);
		bodyModel[0].rotateAngleZ = -0.50614548F;

		bodyModel[1].addBox(-2.9F, 1F, 0F, 4, 7, 34, 0F); // Import CR.FrontLowerGlacis
		bodyModel[1].setRotationPoint(47.5F, -4.2F, -17F);
		bodyModel[1].rotateAngleZ = -0.66322512F;

		bodyModel[2].addShapeBox(0F, 0F, 0F, 65, 17, 34, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,15F, 0F, 0F,15F, 0F, 0F,0F, 0F, 0F); // Import CR.MainBulk
		bodyModel[2].setRotationPoint(-36F, -14F, -17F);

		bodyModel[3].addBox(-3F, 2F, 0F, 4, 6, 10, 0F); // Import CR.RightTrackFront
		bodyModel[3].setRotationPoint(50F, -11F, 17F);
		bodyModel[3].rotateAngleZ = 0.52359878F;

		bodyModel[4].addBox(-4F, 0F, 0F, 5, 12, 10, 0F); // Import CR.RightTrackFrontTop
		bodyModel[4].setRotationPoint(40F, -9.8F, 17F);
		bodyModel[4].rotateAngleZ = 1.48352986F;

		bodyModel[5].addBox(0F, 0F, 0F, 76, 10, 9, 0F); // Import CR.RightTrackMain
		bodyModel[5].setRotationPoint(-35.5F, -10.5F, 17F);

		bodyModel[6].addBox(0F, -8.5F, 0F, 11, 7, 10, 0F); // Import CR.rightTrackFrontCoverUp
		bodyModel[6].setRotationPoint(40.5F, 0F, 17F);
		bodyModel[6].rotateAngleZ = 0.12217305F;

		bodyModel[7].addBox(0F, 0F, 0F, 28, 4, 10, 0F); // Import CR.BackTopTrack
		bodyModel[7].setRotationPoint(-45F, -10.5F, 17F);

		bodyModel[8].addShapeBox(0F, -6F, 0F, 10, 3, 10, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 6F, 0F,0F, 6F, 0F,0F, 0F, 0F); // Import CR.BackBottomTrackright
		bodyModel[8].setRotationPoint(-45F, -3.5F, 17F);

		bodyModel[9].addBox(0F, 0F, 0F, 3, 3, 50, 0F); // Import CR.UtilityLog
		bodyModel[9].setRotationPoint(-46F, -6F, -25F);

		bodyModel[10].addBox(-4F, 8F, -0.5F, 8, 1, 1, 0F); // Import CR.LogHolderRight
		bodyModel[10].setRotationPoint(-47F, -10F, 12F);
		bodyModel[10].rotateAngleZ = 0.52359878F;

		bodyModel[11].addBox(-4F, 8F, -0.5F, 8, 1, 1, 0F); // Import CR.LogHolderLeft
		bodyModel[11].setRotationPoint(-47F, -10F, -12F);
		bodyModel[11].rotateAngleZ = 0.52359878F;

		bodyModel[12].addBox(-4F, 0F, 0F, 5, 12, 10, 0F); // Import CR.LeftTrackFrontTop
		bodyModel[12].setRotationPoint(40F, -9.8F, -27F);
		bodyModel[12].rotateAngleZ = 1.48352986F;

		bodyModel[13].addBox(-3F, 2F, 0F, 4, 6, 10, 0F); // Import CR.LeftTrackFront
		bodyModel[13].setRotationPoint(50F, -11F, -27F);
		bodyModel[13].rotateAngleZ = 0.52359878F;

		bodyModel[14].addBox(0F, -8.5F, 0F, 11, 7, 10, 0F); // Import CR.leftTrackFrontCoverUp
		bodyModel[14].setRotationPoint(40.5F, 0F, -27F);
		bodyModel[14].rotateAngleZ = 0.12217305F;

		bodyModel[15].addBox(0F, 0F, 0F, 76, 10, 9, 0F); // Import CR.LeftTrackMain
		bodyModel[15].setRotationPoint(-35.5F, -10.5F, -26F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 5, 3, 0F); // Import CR.LeftLight
		bodyModel[16].setRotationPoint(40F, -10.9F, -15F);

		bodyModel[17].addBox(1F, 0F, 0F, 1, 5, 3, 0F); // Import CR.RightLight
		bodyModel[17].setRotationPoint(39F, -10.9F, 12F);

		bodyModel[18].addBox(0F, 0F, 0F, 24, 2, 34, 0F); // Import CR.BackBonusArea
		bodyModel[18].setRotationPoint(-44F, -14F, -17F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,0F, 0F, 6F,0F, 0F, 3F,0F, 0F, 3F,0F, 0F, 6F,0F, 0F, 8F,2F, 0F, 8F,2F, 0F, 8F,0F, 0F, 8F); // Box 101
		bodyModel[19].setRotationPoint(28F, -14.8F, -1F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 0, 8, 0F,0F, 3F, 0F,18F, 0F, 0F,18F, 0F, 0F,0F, 3F, 0F,0F, 0F, 0F,18F, 0F, 0F,18F, 0F, 0F,0F, 0F, 0F); // Box 110
		bodyModel[20].setRotationPoint(20F, -10.5F, 17.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 16, 3, 8, 0F,0F, 1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 111
		bodyModel[21].setRotationPoint(4F, -13.5F, 17.5F);

		bodyModel[22].addBox(0F, 0F, 0F, 21, 4, 8, 0F); // Box 114
		bodyModel[22].setRotationPoint(-17F, -14.5F, 17.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 27, 3, 8, 0F,0F, 0F, 0F,0F, 1F, 0F,0F, 1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 116
		bodyModel[23].setRotationPoint(-44F, -13.5F, 17.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,0F, 0F, 6F,0F, 0F, 6F,0F, 0F, 6F,0F, 0F, 6F,2F, 0F, 8F,0F, 0F, 8F,0F, 0F, 8F,2F, 0F, 8F); // Box 271
		bodyModel[24].setRotationPoint(24F, -14.8F, -1F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 8, 11, 34, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 3F, 0F,0F, 4F, 0F,0F, 4F, 0F,0F, 3F, 0F); // Box 289
		bodyModel[25].setRotationPoint(-44F, -12F, -17F);

		bodyModel[26].addBox(0F, 0F, 0F, 45, 10, 1, 0F); // Box 298
		bodyModel[26].setRotationPoint(-35.5F, -10.5F, 26F);

		bodyModel[27].addBox(0F, 0F, 0F, 45, 10, 1, 0F); // Box 299
		bodyModel[27].setRotationPoint(-35.5F, -10.5F, -27F);

		bodyModel[28].addBox(0F, 0F, 0F, 31, 10, 1, 0F); // Box 300
		bodyModel[28].setRotationPoint(9.5F, -10.5F, -27F);

		bodyModel[29].addBox(0F, 0F, 0F, 31, 10, 1, 0F); // Box 308
		bodyModel[29].setRotationPoint(9.5F, -10.5F, 26F);

		bodyModel[30].addShapeBox(0F, -6F, 0F, 10, 3, 10, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 6F, 0F,0F, 6F, 0F,0F, 0F, 0F); // Box 203
		bodyModel[30].setRotationPoint(-45F, -3.5F, -27F);

		bodyModel[31].addBox(0F, 0F, 0F, 28, 4, 10, 0F); // Box 204
		bodyModel[31].setRotationPoint(-45F, -10.5F, -27F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 27, 3, 8, 0F,0F, 0F, 0F,0F, 1F, 0F,0F, 1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 206
		bodyModel[32].setRotationPoint(-44F, -13.5F, -25.5F);

		bodyModel[33].addBox(0F, 0F, 0F, 21, 4, 8, 0F); // Box 207
		bodyModel[33].setRotationPoint(-17F, -14.5F, -25.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 16, 3, 8, 0F,0F, 1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 209
		bodyModel[34].setRotationPoint(4F, -13.5F, -25.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 0, 8, 0F,0F, 3F, 0F,18F, 0F, 0F,18F, 0F, 0F,0F, 3F, 0F,0F, 0F, 0F,18F, 0F, 0F,18F, 0F, 0F,0F, 0F, 0F); // Box 210
		bodyModel[35].setRotationPoint(20F, -10.5F, -25.5F);

		bodyModel[36].addBox(0F, 0F, 0F, 6, 1, 12, 0F); // Box 211
		bodyModel[36].setRotationPoint(-45F, -15F, -13F);

		bodyModel[37].addBox(0F, 0F, 0F, 6, 1, 12, 0F); // Box 212
		bodyModel[37].setRotationPoint(-45F, -15F, 1F);

		bodyModel[38].addBox(0F, 0F, 0F, 8, 2, 30, 0F); // Box 265
		bodyModel[38].setRotationPoint(-39F, -15F, -15F);

		bodyModel[39].addBox(13F, 0F, 0F, 15, 2, 15, 0F); // Box 266
		bodyModel[39].setRotationPoint(15F, -17.5F, 8F);
		bodyModel[39].rotateAngleX = -0.23561945F;
		bodyModel[39].rotateAngleY = -0.78539816F;
		bodyModel[39].rotateAngleZ = -0.23561945F;

		bodyModel[40].addBox(22.5F, 1F, 0F, 1, 4, 33, 0F); // Box 268
		bodyModel[40].setRotationPoint(29F, -15F, -16.5F);
		bodyModel[40].rotateAngleZ = -0.66322512F;

		bodyModel[41].addBox(22.2F, -2F, 1F, 1, 3, 1, 0F); // Box 269
		bodyModel[41].setRotationPoint(29F, -15F, -16.5F);
		bodyModel[41].rotateAngleZ = -0.66322512F;

		bodyModel[42].addBox(22.2F, -2F, 4F, 1, 3, 1, 0F); // Box 270
		bodyModel[42].setRotationPoint(29F, -15F, -16.5F);
		bodyModel[42].rotateAngleZ = -0.66322512F;

		bodyModel[43].addBox(22.2F, -2F, 0F, 1, 3, 1, 0F); // Box 271
		bodyModel[43].setRotationPoint(29F, -15F, 14.5F);
		bodyModel[43].rotateAngleZ = -0.66322512F;

		bodyModel[44].addBox(22.2F, -2F, 0F, 1, 3, 1, 0F); // Box 272
		bodyModel[44].setRotationPoint(29F, -15F, 11.5F);
		bodyModel[44].rotateAngleZ = -0.66322512F;

		bodyModel[45].addBox(22.2F, -2F, 4F, 1, 3, 1, 0F); // Box 273
		bodyModel[45].setRotationPoint(29F, -15F, -10.5F);
		bodyModel[45].rotateAngleZ = -0.66322512F;

		bodyModel[46].addBox(22.2F, -2F, 0F, 1, 3, 1, 0F); // Box 274
		bodyModel[46].setRotationPoint(29F, -15F, 5.5F);
		bodyModel[46].rotateAngleZ = -0.66322512F;

		bodyModel[47].addBox(22.2F, -2F, 0F, 1, 3, 1, 0F); // Box 275
		bodyModel[47].setRotationPoint(29F, -15F, 2F);
		bodyModel[47].rotateAngleZ = -0.66322512F;

		bodyModel[48].addBox(22.2F, -2F, 4F, 1, 3, 1, 0F); // Box 276
		bodyModel[48].setRotationPoint(29F, -15F, -7F);
		bodyModel[48].rotateAngleZ = -0.66322512F;

		bodyModel[49].addBox(0F, 0F, 0F, 7, 3, 12, 0F); // Box 1
		bodyModel[49].setRotationPoint(-52F, -18F, 1F);

		bodyModel[50].addShapeBox(0F, -1F, 0F, 3, 1, 12, 0F,0F, 1F, 0F,0F, 1F, 0F,0F, 1F, 0F,0F, 1F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F); // Box 2
		bodyModel[50].setRotationPoint(-50F, -18F, 1F);

		bodyModel[51].addShapeBox(0F, -1F, 0F, 3, 1, 12, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,0F, 1F, 0F,0F, 1F, 0F,0F, 1F, 0F,0F, 1F, 0F); // Box 4
		bodyModel[51].setRotationPoint(-50F, -14F, 1F);

		bodyModel[52].addBox(0F, -1F, 0F, 0, 0, 0, 0F); // Box 8
		bodyModel[52].setRotationPoint(0F, -8F, -12F);

		bodyModel[53].addBox(0F, 0F, 0F, 7, 3, 12, 0F); // Box 9
		bodyModel[53].setRotationPoint(-52F, -18F, -13F);

		bodyModel[54].addShapeBox(0F, -1F, 0F, 3, 1, 12, 0F,0F, 1F, 0F,0F, 1F, 0F,0F, 1F, 0F,0F, 1F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F); // Box 10
		bodyModel[54].setRotationPoint(-50F, -18F, -13F);

		bodyModel[55].addShapeBox(0F, -1F, 0F, 3, 1, 12, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,0F, 1F, 0F,0F, 1F, 0F,0F, 1F, 0F,0F, 1F, 0F); // Box 11
		bodyModel[55].setRotationPoint(-50F, -14F, -13F);

		bodyModel[56].addBox(0F, -2F, 1F, 8, 1, 8, 0F); // Box 12
		bodyModel[56].setRotationPoint(48F, -2F, -23.5F);
		bodyModel[56].rotateAngleX = -0.10471976F;
		bodyModel[56].rotateAngleY = 0.78539816F;
		bodyModel[56].rotateAngleZ = 0.05235988F;

		bodyModel[57].addBox(0F, -2F, 3F, 8, 1, 8, 0F); // Box 13
		bodyModel[57].setRotationPoint(39F, -2F, 15.5F);
		bodyModel[57].rotateAngleX = 0.10471976F;
		bodyModel[57].rotateAngleY = -0.78539816F;
		bodyModel[57].rotateAngleZ = -0.05235988F;


		turretModel = new ModelRendererTurbo[24];
		turretModel[0] = new ModelRendererTurbo(this, 803, 800, textureX, textureY); // Import TR.Camera
		turretModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import TR.Commanderhatch
		turretModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import TR.OtherHatch
		turretModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import TR.MGStick
		turretModel[4] = new ModelRendererTurbo(this, 800, 402, textureX, textureY); // Import Shape1
		turretModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 14
		turretModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 15
		turretModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 20
		turretModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 100
		turretModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 272
		turretModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 273
		turretModel[11] = new ModelRendererTurbo(this, 248, 960, textureX, textureY); // Box 293
		turretModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 213
		turretModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 215
		turretModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 216
		turretModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 217
		turretModel[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 218
		turretModel[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 219
		turretModel[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 220
		turretModel[19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 243
		turretModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 244
		turretModel[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 245
		turretModel[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 277
		turretModel[23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0

		turretModel[0].addBox(13F, 0F, 6F, 3, 4, 4, 0F); // Import TR.Camera
		turretModel[0].setRotationPoint(0F, -25.5F, 0F);
		turretModel[0].rotateAngleZ = 0.05235988F;

		turretModel[1].addShapeBox(-8F, 0F, -9F, 8, 4, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,1F, 2F, 1F,2F, 0F, 2F,2F, 0F, 2F,2F, 0F, 2F); // Import TR.Commanderhatch
		turretModel[1].setRotationPoint(0F, -27F, 0F);

		turretModel[2].addBox(-9F, 0F, -1F, 4, 3, 7, 0F); // Import TR.OtherHatch
		turretModel[2].setRotationPoint(0F, -27.5F, 0F);
		turretModel[2].rotateAngleY = -0.57595865F;

		turretModel[3].addBox(3F, 3F, -9.5F, 1, 1, 9, 0F); // Import TR.MGStick
		turretModel[3].setRotationPoint(0F, -32F, 0F);
		turretModel[3].rotateAngleZ = -0.17453293F;

		turretModel[4].addShapeBox(-6F, 0F, -6F, 0, 0, 0, 0F,0F, 60F, 0F,0F, 60F, 0F,0F, 60F, 0F,0F, 60F, 0F,1F, 0F, 1F,1F, 0F, 1F,1F, 0F, 1F,1F, 0F, 1F); // Import Shape1
		turretModel[4].setRotationPoint(0F, 0F, 0F);
		turretModel[4].rotateAngleZ = 0.05235988F;

		turretModel[5].addShapeBox(0F, 0F, -5F, 11, 7, 10, 0F,4F, 0F, 8F,8F, 0F, 12F,8F, 0F, 12F,4F, 0F, 8F,4F, 0F, 10F,8F, 0F, 14F,8F, 0F, 14F,4F, 0F, 10F); // Box 14
		turretModel[5].setRotationPoint(-8F, -22.5F, 0F);

		turretModel[6].addShapeBox(-19F, 0F, -5F, 3, 7, 10, 0F,0F, 0F, 0F,4F, 0F, 8F,4F, 0F, 8F,0F, 0F, 0F,1F, 0F, 2F,4F, 0F, 10F,4F, 0F, 10F,1F, 0F, 2F); // Box 15
		turretModel[6].setRotationPoint(0F, -22.5F, 0F);

		turretModel[7].addShapeBox(-13F, 0F, -3F, 0, 1, 6, 0F,2F, 3F, 1F,1F, 4F, 5F,1F, 4F, 5F,2F, 3F, 1F,6F, 0F, 2F,1F, 0F, 10F,1F, 0F, 10F,6F, 0F, 2F); // Box 20
		turretModel[7].setRotationPoint(0F, -23.5F, 0F);

		turretModel[8].addShapeBox(8.5F, 0F, 6F, 4, 4, 4, 0F,0F, 0F, 0F,1F, 1F, 1F,1F, 1F, 1F,0F, 0F, 0F,0F, 0F, 0F,1F, 0F, 1F,1F, 0F, 1F,0F, 0F, 0F); // Box 100
		turretModel[8].setRotationPoint(0F, -25.5F, 0F);
		turretModel[8].rotateAngleZ = 0.05235988F;

		turretModel[9].addBox(-5.8F, -4F, 4F, 2, 2, 3, 0F); // Box 272
		turretModel[9].setRotationPoint(0F, -20.5F, 0F);
		turretModel[9].rotateAngleY = -0.57595865F;
		turretModel[9].rotateAngleZ = -0.05235988F;

		turretModel[10].addShapeBox(-7F, 0F, -8F, 6, 4, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,2F, 2F, 2F,2F, 0F, 2F,2F, 0F, 2F,2F, 0F, 2F); // Box 273
		turretModel[10].setRotationPoint(0F, -27.5F, 0F);

		turretModel[11].addBox(17F, 8F, 3.8F, 5, 6, 2, 0F); // Box 293
		turretModel[11].setRotationPoint(0F, -32F, 0F);
		turretModel[11].rotateAngleY = -1.71042267F;

		turretModel[12].addShapeBox(19F, 0F, -5F, 0, 7, 10, 0F,8F, 0F, 12F,0F, 0F, 6F,0F, 0F, 6F,8F, 0F, 12F,8F, 0F, 14F,2F, 0F, 8F,2F, 0F, 8F,8F, 0F, 14F); // Box 213
		turretModel[12].setRotationPoint(0F, -22.5F, 0F);

		turretModel[13].addShapeBox(8F, 0F, -5F, 0, 3, 10, 0F,8F, 0F, 12F,8F, 0F, 5F,8F, 0F, 5F,8F, 0F, 12F,8F, 0F, 12F,8F, 0F, 5F,8F, 0F, 5F,8F, 0F, 12F); // Box 215
		turretModel[13].setRotationPoint(0F, -16.5F, 0F);

		turretModel[14].addShapeBox(-8F, 0F, -5F, 0, 3, 10, 0F,8F, 0F, 5F,8F, 0F, 12F,8F, 0F, 12F,8F, 0F, 5F,8F, 0F, 5F,8F, 0F, 12F,8F, 0F, 12F,8F, 0F, 5F); // Box 216
		turretModel[14].setRotationPoint(0F, -16.5F, 0F);

		turretModel[15].addShapeBox(19F, 0F, -5F, 0, 1, 10, 0F,6F, 2F, 8F,0F, 0F, 4F,0F, 0F, 4F,6F, 2F, 8F,6F, 0F, 12F,2F, 0F, 6F,2F, 0F, 6F,6F, 0F, 12F); // Box 217
		turretModel[15].setRotationPoint(-2F, -23.5F, 0F);

		turretModel[16].addShapeBox(0F, 0F, -5F, 3, 1, 10, 0F,12F, 4F, 3F,8F, 2F, 8F,8F, 2F, 8F,12F, 4F, 3F,12F, 0F, 8F,8F, 0F, 12F,8F, 0F, 12F,12F, 0F, 8F); // Box 218
		turretModel[16].setRotationPoint(0F, -23.5F, 0F);

		turretModel[17].addBox(-19F, 0F, -10F, 3, 3, 16, 0F); // Box 219
		turretModel[17].setRotationPoint(0F, -20.5F, 0F);
		turretModel[17].rotateAngleY = -1.32645023F;

		turretModel[18].addBox(16F, 0F, -11F, 8, 6, 6, 0F); // Box 220
		turretModel[18].setRotationPoint(0F, -22F, 0F);
		turretModel[18].rotateAngleZ = 0.06981317F;

		turretModel[19].addBox(1.2F, -7F, 8F, 3, 5, 6, 0F); // Box 243
		turretModel[19].setRotationPoint(0F, -20.5F, 0F);
		turretModel[19].rotateAngleZ = -0.05235988F;

		turretModel[20].addBox(0F, 0F, -9.5F, 2, 2, 9, 0F); // Box 244
		turretModel[20].setRotationPoint(0F, -28F, 0F);

		turretModel[21].addShapeBox(-22F, 0F, -4F, 7, 1, 12, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 2F, 0F,0F, 6F, 0F,0F, 6F, 0F,0F, 2F, 0F); // Box 245
		turretModel[21].setRotationPoint(0F, -23.5F, 0F);
		turretModel[21].rotateAngleY = 1.3962634F;

		turretModel[22].addBox(0.5F, 0F, -8.5F, 1, 4, 7, 0F); // Box 277
		turretModel[22].setRotationPoint(0F, -32F, 0F);

		turretModel[23].addShapeBox(-27F, 0F, -5.5F, 7, 2, 12, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 2F, 0F,0F, 6F, 0F,0F, 6F, 0F,0F, 2F, 0F); // Box 0
		turretModel[23].setRotationPoint(0F, -22.5F, 0F);


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

		barrelModel[0].addShapeBox(3F, -1.5F, -1.5F, 5, 3, 3, 0F,0F, 2F, 2F,1F, 1F, 1F,1F, 1F, 1F,0F, 2F, 2F,0F, 2F, 2F,1F, 1F, 1F,1F, 1F, 1F,0F, 2F, 2F); // Import BL.BarrelBase
		barrelModel[0].setRotationPoint(16F, -19.5F, 0F);

		barrelModel[1].addBox(10F, -1.5F, -1.5F, 80, 3, 3, 0F); // Import BL.MainBarrel
		barrelModel[1].setRotationPoint(12F, -19.5F, 0F);

		barrelModel[2].addBox(44F, -2.5F, -2.5F, 19, 5, 5, 0F); // Import BL.WormThing
		barrelModel[2].setRotationPoint(14F, -19.5F, 0F);

		barrelModel[3].addBox(90F, -1.5F, -1.5F, 1, 3, 3, 0F); // Import BL.TipofGun
		barrelModel[3].setRotationPoint(12F, -19.5F, 0F);

		barrelModel[4].addBox(-2F, 1F, 3.5F, 5, 2, 3, 0F); // Import BL.GunHolder
		barrelModel[4].setRotationPoint(5.5F, -29F, -10F);
		barrelModel[4].rotateAngleZ = -0.13962634F;

		barrelModel[5].addBox(-3F, -2F, 4F, 10, 3, 2, 0F); // Import BL.MainGunBody
		barrelModel[5].setRotationPoint(5.5F, -29F, -10F);

		barrelModel[6].addBox(7F, -1.7F, 4.5F, 10, 2, 1, 0F); // Import BL.MGHandGuard
		barrelModel[6].setRotationPoint(5.5F, -29F, -10F);

		barrelModel[7].addBox(17F, -1.7F, 4.5F, 10, 1, 1, 0F); // Import BL.MGBarrel
		barrelModel[7].setRotationPoint(5.5F, -29F, -10F);

		barrelModel[8].addBox(23F, -3.5F, 4.5F, 1, 2, 1, 0F); // Import BL.MGsight
		barrelModel[8].setRotationPoint(5.5F, -29F, -10F);

		barrelModel[9].addBox(3F, -1F, 2F, 2, 6, 5, 0F); // Import BL.AmmoBox
		barrelModel[9].setRotationPoint(5.5F, -29F, -10F);
		barrelModel[9].rotateAngleX = -0.10471976F;
		barrelModel[9].rotateAngleY = -0.40142573F;
		barrelModel[9].rotateAngleZ = 0.41887902F;

		barrelModel[10].addBox(65F, -2F, -2F, 11, 4, 4, 0F); // Box 196
		barrelModel[10].setRotationPoint(13F, -19.5F, 0F);

		barrelModel[11].addBox(78F, -2F, -2F, 11, 4, 4, 0F); // Box 197
		barrelModel[11].setRotationPoint(12F, -19.5F, 0F);

		barrelModel[12].addBox(30F, -2F, -2F, 11, 4, 4, 0F); // Box 198
		barrelModel[12].setRotationPoint(16F, -19.5F, 0F);

		barrelModel[13].addBox(18F, -2F, -2F, 11, 4, 4, 0F); // Box 199
		barrelModel[13].setRotationPoint(16F, -19.5F, 0F);

		barrelModel[14].addShapeBox(-5F, -2F, -2F, 22, 4, 4, 0F,0F, 1F, 1F,0F, 0F, 0F,0F, 0F, 0F,0F, 1F, 1F,0F, 1F, 1F,0F, 0F, 0F,0F, 0F, 0F,0F, 1F, 1F); // Box 200
		barrelModel[14].setRotationPoint(16F, -19.5F, 0F);


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
		leftTrackWheelModels[0].setRotationPoint(30.5F, 4.5F, -22F);

		leftTrackWheelModels[1].addBox(-4.5F, -2.5F, -3F, 9, 5, 6, 0F); // Box 132
		leftTrackWheelModels[1].setRotationPoint(30.5F, 4.5F, -22F);

		leftTrackWheelModels[2].addShapeBox(-2.5F, 2.5F, -3F, 5, 2, 6, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 148
		leftTrackWheelModels[2].setRotationPoint(30.5F, 4.5F, -22F);

		leftTrackWheelModels[3].addBox(-4.5F, -2.5F, -3F, 9, 5, 6, 0F); // Box 149
		leftTrackWheelModels[3].setRotationPoint(20F, 4.5F, -22F);

		leftTrackWheelModels[4].addShapeBox(-2.5F, 2.5F, -3F, 5, 2, 6, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 150
		leftTrackWheelModels[4].setRotationPoint(20F, 4.5F, -22F);

		leftTrackWheelModels[5].addShapeBox(-2.5F, -4.5F, -3F, 5, 2, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F); // Box 151
		leftTrackWheelModels[5].setRotationPoint(20F, 4.5F, -22F);

		leftTrackWheelModels[6].addBox(-4.5F, -2.5F, -3F, 9, 5, 6, 0F); // Box 152
		leftTrackWheelModels[6].setRotationPoint(9.5F, 4.5F, -22F);

		leftTrackWheelModels[7].addShapeBox(-2.5F, 2.5F, -3F, 5, 2, 6, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 153
		leftTrackWheelModels[7].setRotationPoint(9.5F, 4.5F, -22F);

		leftTrackWheelModels[8].addShapeBox(-2.5F, -4.5F, -3F, 5, 2, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F); // Box 154
		leftTrackWheelModels[8].setRotationPoint(9.5F, 4.5F, -22F);

		leftTrackWheelModels[9].addBox(-4.5F, -2.5F, -3F, 9, 5, 6, 0F); // Box 155
		leftTrackWheelModels[9].setRotationPoint(-1.5F, 4.5F, -22F);

		leftTrackWheelModels[10].addShapeBox(-2.5F, 2.5F, -3F, 5, 2, 6, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 156
		leftTrackWheelModels[10].setRotationPoint(-1.5F, 4.5F, -22F);

		leftTrackWheelModels[11].addShapeBox(-2.5F, -4.5F, -3F, 5, 2, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F); // Box 157
		leftTrackWheelModels[11].setRotationPoint(-1.5F, 4.5F, -22F);

		leftTrackWheelModels[12].addBox(-4.5F, -2.5F, -3F, 9, 5, 6, 0F); // Box 158
		leftTrackWheelModels[12].setRotationPoint(-12F, 4.5F, -22F);

		leftTrackWheelModels[13].addShapeBox(-2.5F, 2.5F, -3F, 5, 2, 6, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 159
		leftTrackWheelModels[13].setRotationPoint(-12F, 4.5F, -22F);

		leftTrackWheelModels[14].addShapeBox(-2.5F, -4.5F, -3F, 5, 2, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F); // Box 160
		leftTrackWheelModels[14].setRotationPoint(-12F, 4.5F, -22F);

		leftTrackWheelModels[15].addBox(-4.5F, -2.5F, -3F, 9, 5, 6, 0F); // Box 161
		leftTrackWheelModels[15].setRotationPoint(-22.5F, 4.5F, -22F);

		leftTrackWheelModels[16].addShapeBox(-2.5F, 2.5F, -3F, 5, 2, 6, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 162
		leftTrackWheelModels[16].setRotationPoint(-22.5F, 4.5F, -22F);

		leftTrackWheelModels[17].addShapeBox(-2.5F, -4.5F, -3F, 5, 2, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F); // Box 163
		leftTrackWheelModels[17].setRotationPoint(-22.5F, 4.5F, -22F);

		leftTrackWheelModels[18].addShapeBox(-2.5F, -4.5F, -3F, 5, 2, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F); // Box 164
		leftTrackWheelModels[18].setRotationPoint(43.5F, -2.5F, -22F);

		leftTrackWheelModels[19].addBox(-4.5F, -2.5F, -3F, 9, 5, 6, 0F); // Box 165
		leftTrackWheelModels[19].setRotationPoint(43.5F, -2.5F, -22F);

		leftTrackWheelModels[20].addShapeBox(-2.5F, 2.5F, -3F, 5, 2, 6, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 166
		leftTrackWheelModels[20].setRotationPoint(43.5F, -2.5F, -22F);

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
		rightTrackWheelModels[3].setRotationPoint(-12F, 4.5F, 22F);

		rightTrackWheelModels[4].addBox(-4.5F, -2.5F, -3F, 9, 5, 6, 0F); // Box 174
		rightTrackWheelModels[4].setRotationPoint(-12F, 4.5F, 22F);

		rightTrackWheelModels[5].addShapeBox(-2.5F, -4.5F, -3F, 5, 2, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F); // Box 175
		rightTrackWheelModels[5].setRotationPoint(-12F, 4.5F, 22F);

		rightTrackWheelModels[6].addShapeBox(-2.5F, -4.5F, -3F, 5, 2, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F); // Box 176
		rightTrackWheelModels[6].setRotationPoint(-1.5F, 4.5F, 22F);

		rightTrackWheelModels[7].addBox(-4.5F, -2.5F, -3F, 9, 5, 6, 0F); // Box 177
		rightTrackWheelModels[7].setRotationPoint(-1.5F, 4.5F, 22F);

		rightTrackWheelModels[8].addShapeBox(-2.5F, 2.5F, -3F, 5, 2, 6, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 178
		rightTrackWheelModels[8].setRotationPoint(-1.5F, 4.5F, 22F);

		rightTrackWheelModels[9].addShapeBox(-2.5F, 2.5F, -3F, 5, 2, 6, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 179
		rightTrackWheelModels[9].setRotationPoint(9.5F, 4.5F, 22F);

		rightTrackWheelModels[10].addBox(-4.5F, -2.5F, -3F, 9, 5, 6, 0F); // Box 180
		rightTrackWheelModels[10].setRotationPoint(9.5F, 4.5F, 22F);

		rightTrackWheelModels[11].addShapeBox(-2.5F, -4.5F, -3F, 5, 2, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F); // Box 181
		rightTrackWheelModels[11].setRotationPoint(9.5F, 4.5F, 22F);

		rightTrackWheelModels[12].addShapeBox(-2.5F, -4.5F, -3F, 5, 2, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F); // Box 182
		rightTrackWheelModels[12].setRotationPoint(20F, 4.5F, 22F);

		rightTrackWheelModels[13].addBox(-4.5F, -2.5F, -3F, 9, 5, 6, 0F); // Box 183
		rightTrackWheelModels[13].setRotationPoint(20F, 4.5F, 22F);

		rightTrackWheelModels[14].addShapeBox(-2.5F, 2.5F, -3F, 5, 2, 6, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 184
		rightTrackWheelModels[14].setRotationPoint(20F, 4.5F, 22F);

		rightTrackWheelModels[15].addShapeBox(-2.5F, 2.5F, -3F, 5, 2, 6, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 185
		rightTrackWheelModels[15].setRotationPoint(30.5F, 4.5F, 22F);

		rightTrackWheelModels[16].addBox(-4.5F, -2.5F, -3F, 9, 5, 6, 0F); // Box 186
		rightTrackWheelModels[16].setRotationPoint(30.5F, 4.5F, 22F);

		rightTrackWheelModels[17].addShapeBox(-2.5F, -4.5F, -3F, 5, 2, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F); // Box 187
		rightTrackWheelModels[17].setRotationPoint(30.5F, 4.5F, 22F);

		rightTrackWheelModels[18].addBox(-4.5F, -2.5F, -3F, 9, 5, 6, 0F); // Box 188
		rightTrackWheelModels[18].setRotationPoint(43.5F, -2.5F, 22F);

		rightTrackWheelModels[19].addShapeBox(-2.5F, -4.5F, -3F, 5, 2, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F); // Box 189
		rightTrackWheelModels[19].setRotationPoint(43.5F, -2.5F, 22F);

		rightTrackWheelModels[20].addShapeBox(-2.5F, 2.5F, -3F, 5, 2, 6, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 190
		rightTrackWheelModels[20].setRotationPoint(43.5F, -2.5F, 22F);

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
		leftTrackModel[0].setRotationPoint(48F, -8F, -22F);

		leftTrackModel[1].addBox(0F, 0F, -4F, 1, 18, 8, 0F); // Import LT.TrackFrontBottomCorner
		leftTrackModel[1].setRotationPoint(48.5F, -0.5F, -22F);
		leftTrackModel[1].rotateAngleZ = -1.01229097F;

		leftTrackModel[2].addBox(0F, 0F, -4F, 59, 1, 8, 0F); // Import LT.TrackBottom
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
		rightTrackModel[0].setRotationPoint(48F, -8F, 22F);

		rightTrackModel[1].addBox(0F, 0F, -4F, 1, 18, 8, 0F); // Import RT.TrackFrontBottomCorner
		rightTrackModel[1].setRotationPoint(48.5F, -0.5F, 22F);
		rightTrackModel[1].rotateAngleZ = -1.01229097F;

		rightTrackModel[2].addBox(0F, 0F, -4F, 59, 1, 8, 0F); // Import RT.TrackBottom
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
