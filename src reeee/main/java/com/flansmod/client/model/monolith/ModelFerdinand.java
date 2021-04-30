//This File was created with the Minecraft-SMP Modelling Toolbox 1.5.4.1
// Copyright (C) 2013 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 3.0.x+

// Model Checklist
//    Model: 
//    - Check Left/Right    [ ]  (Left = + / Right = -)
//    - Code Cleaned        [ ]
//    - Coverted to Version [ ]

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelFerdinand extends ModelVehicle
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelFerdinand()
	{

// Body
		bodyModel = new ModelRendererTurbo[40];
		bodyModel[0] = new ModelRendererTurbo(this,  0,  720, textureX, textureY); // CR.MainBody
		bodyModel[1] = new ModelRendererTurbo(this,  0,  800, textureX, textureY); // CR.TopBeak
		bodyModel[2] = new ModelRendererTurbo(this,  0,  175, textureX, textureY); // CR.BottomBeak
		bodyModel[3] = new ModelRendererTurbo(this,  0,  225, textureX, textureY); // CR.BeakFiller
		bodyModel[4] = new ModelRendererTurbo(this,  0,  275, textureX, textureY); // CR.Back
		bodyModel[5] = new ModelRendererTurbo(this,  0,  350, textureX, textureY); // CR.BackFiller
		bodyModel[6] = new ModelRendererTurbo(this,  0,  420, textureX, textureY); // CR.RightUtilitySquare
		bodyModel[7] = new ModelRendererTurbo(this,  0,  450, textureX, textureY); // CR.LeftUtilitySquare
		bodyModel[8] = new ModelRendererTurbo(this,  0,  480, textureX, textureY); // CR.LowerTrackTopRight
		bodyModel[9] = new ModelRendererTurbo(this,  0,  510, textureX, textureY); // CR.FrontCornerTrackGuardRight
		bodyModel[10] = new ModelRendererTurbo(this,  0,  550, textureX, textureY); // CR.TopTrackGuardRight
		bodyModel[11] = new ModelRendererTurbo(this,  0,  575, textureX, textureY); // CR.TrackSideRight
		bodyModel[12] = new ModelRendererTurbo(this,  0,  600, textureX, textureY); // CR.TrackFrontRight
		bodyModel[13] = new ModelRendererTurbo(this,  0,  630, textureX, textureY); // CR.TrackBackCorner
		bodyModel[14] = new ModelRendererTurbo(this,  0,  650, textureX, textureY); // CR.TrackGuardBack
		bodyModel[15] = new ModelRendererTurbo(this,  0,  680, textureX, textureY); // CR.RightFrontCorner
		bodyModel[16] = new ModelRendererTurbo(this,  0,  680, textureX, textureY); // CR.LeftFrontCorner
		bodyModel[17] = new ModelRendererTurbo(this,  0,  480, textureX, textureY); // CR.LowerTrackTopLeft
		bodyModel[18] = new ModelRendererTurbo(this,  0,  630, textureX, textureY); // CR.TrackBackCornerleft
		bodyModel[19] = new ModelRendererTurbo(this,  0,  650, textureX, textureY); // CR.TrackGuardBackleft
		bodyModel[20] = new ModelRendererTurbo(this,  0,  510, textureX, textureY); // CR.FrontCornerTrackGuardLeft
		bodyModel[21] = new ModelRendererTurbo(this,  0,  550, textureX, textureY); // CR.TopTrackGuardLeft
		bodyModel[22] = new ModelRendererTurbo(this,  0,  600, textureX, textureY); // CR.TrackFrontLeft
		bodyModel[23] = new ModelRendererTurbo(this,  0,  575, textureX, textureY); // CR.TrackSideLeft
		bodyModel[24] = new ModelRendererTurbo(this,  800,  20, textureX, textureY); // CR.BackMiddle
		bodyModel[25] = new ModelRendererTurbo(this,  800,  200, textureX, textureY); // CR.TurretSideRight
		bodyModel[26] = new ModelRendererTurbo(this,  800,  200, textureX, textureY); // CR.TurretSideLeft
		bodyModel[27] = new ModelRendererTurbo(this,  800,  260, textureX, textureY); // CR.turretMain
		bodyModel[28] = new ModelRendererTurbo(this,  800,  340, textureX, textureY); // CR.Commander'sHatch
		bodyModel[29] = new ModelRendererTurbo(this,  800,  370, textureX, textureY); // CR.RandomSquarePeg
		bodyModel[30] = new ModelRendererTurbo(this,  800,  400, textureX, textureY); // CR.PortHole
		bodyModel[31] = new ModelRendererTurbo(this,  800,  600, textureX, textureY); // CR.UnderGunThingy
		bodyModel[32] = new ModelRendererTurbo(this,  800,  650, textureX, textureY); // CR.EngineStuff
		bodyModel[33] = new ModelRendererTurbo(this,  800,  720, textureX, textureY); // CR.AntennaBase
		bodyModel[34] = new ModelRendererTurbo(this,  800,  750, textureX, textureY); // CR.Antenna
		bodyModel[35] = new ModelRendererTurbo(this,  800,  800, textureX, textureY); // CR.antennaHolderStuff
		bodyModel[36] = new ModelRendererTurbo(this,  800,  860, textureX, textureY); // CR.GummyRight
		bodyModel[37] = new ModelRendererTurbo(this,  800,  860, textureX, textureY); // CR.GummyLeft
		bodyModel[38] = new ModelRendererTurbo(this,  850,  860, textureX, textureY); // CR.FrontThingRight
		bodyModel[39] = new ModelRendererTurbo(this,  850,  860, textureX, textureY); // CR.FrontThingLeft

		bodyModel[0].addBox(0F, 0F, 0F, 78, 22, 36, 0F); // CR.MainBody
		bodyModel[0].setRotationPoint(-52F, -22F, -18F);

		bodyModel[1].addBox(0F, 0F, 0F, 10, 15, 36, 0); // CR.TopBeak
		bodyModel[1].setRotationPoint(36F, -14F, -18F);
		bodyModel[1].rotateAngleZ = -1.256637F;

		bodyModel[2].addBox(0F, 0F, 0F, 6, 4, 36, 0); // CR.BottomBeak
		bodyModel[2].setRotationPoint(19F, -4F, -18F);

		bodyModel[3].addBox(0F, 0F, 0F, 12, 7, 36, 0F); // CR.BeakFiller
		bodyModel[3].setRotationPoint(23.8F, -14F, -18F);

		bodyModel[4].addBox(0F, 0F, 0F, 20, 14, 36, 0F); // CR.Back
		bodyModel[4].setRotationPoint(-69.5F, -12.6F, -18F);
		bodyModel[4].rotateAngleZ = 0.5235988F;

		bodyModel[5].addBox(0F, 0F, 0F, 15, 9, 36, 0F); // CR.BackFiller
		bodyModel[5].setRotationPoint(-63F, -9F, -18F);

		bodyModel[6].addBox(0F, 0F, 0F, 77, 10, 8, 0F); // CR.RightUtilitySquare
		bodyModel[6].setRotationPoint(-67F, -22F, 18F);

		bodyModel[7].addBox(0F, 0F, 0F, 77, 10, 8, 0F); // CR.LeftUtilitySquare
		bodyModel[7].setRotationPoint(-67F, -22F, -26F);

		bodyModel[8].addBox(0F, 0F, 0F, 62, 1, 12, 0F); // CR.LowerTrackTopRight
		bodyModel[8].setRotationPoint(-52F, -12F, 18F);

		bodyModel[9].addBox(0F, 0F, 0F, 17, 1, 12, 0F); // CR.FrontCornerTrackGuardRight
		bodyModel[9].setRotationPoint(10F, -12F, 18F);
		bodyModel[9].rotateAngleZ = 0.2094395F;

		bodyModel[10].addBox(0F, 0F, 0F, 12, 1, 12, 0F); // CR.TopTrackGuardRight
		bodyModel[10].setRotationPoint(26F, -15.5F, 18F);

		bodyModel[11].addBox(0F, 0F, 0F, 13, 6, 0, 0F); // CR.TrackSideRight
		bodyModel[11].setRotationPoint(26F, -14.5F, 18F);

		bodyModel[12].addBox(0F, 0F, 0F, 7, 1, 12, 0F); // CR.TrackFrontRight
		bodyModel[12].setRotationPoint(38F, -15.5F, 18F);
		bodyModel[12].rotateAngleZ = -0.6981317F;

		bodyModel[13].addBox(0F, 0F, 0F, 18, 1, 12, 0F); // CR.TrackBackCorner
		bodyModel[13].setRotationPoint(-68F, -15F, 18F);
		bodyModel[13].rotateAngleZ = -0.1745329F;

		bodyModel[14].addBox(0F, 0F, 0F, 9, 1, 12, 0F); // CR.TrackGuardBack
		bodyModel[14].setRotationPoint(-73F, -8F, 18F);
		bodyModel[14].rotateAngleZ = 0.9250245F;

		bodyModel[15].addBox(0F, 0F, 0F, 18, 10, 8, 0F); // CR.RightFrontCorner
		bodyModel[15].setRotationPoint(6F, -22F, 19F);
		bodyModel[15].rotateAngleY = -0.4537856F;

		bodyModel[16].addBox(0F, 0F, 0F, 18, 10, 8, 0F); // CR.LeftFrontCorner
		bodyModel[16].setRotationPoint(9.5F, -22F, -26F);
		bodyModel[16].rotateAngleY = 0.4537856F;

		bodyModel[17].addBox(0F, 0F, 0F, 62, 1, 12, 0F); // CR.LowerTrackTopLeft
		bodyModel[17].setRotationPoint(-52F, -12F, -30F);

		bodyModel[18].addBox(0F, 0F, 0F, 18, 1, 12, 0F); // CR.TrackBackCornerleft
		bodyModel[18].setRotationPoint(-68F, -15F, -30F);
		bodyModel[18].rotateAngleZ = -0.1745329F;

		bodyModel[19].addBox(0F, 0F, 0F, 9, 1, 12, 0F); // CR.TrackGuardBackleft
		bodyModel[19].setRotationPoint(-73F, -8F, -30F);
		bodyModel[19].rotateAngleZ = 0.9250245F;

		bodyModel[20].addBox(0F, 0F, 0F, 17, 1, 12, 0F); // CR.FrontCornerTrackGuardLeft
		bodyModel[20].setRotationPoint(10F, -12F, -30F);
		bodyModel[20].rotateAngleZ = 0.2094395F;

		bodyModel[21].addBox(0F, 0F, 0F, 12, 1, 12, 0F); // CR.TopTrackGuardLeft
		bodyModel[21].setRotationPoint(26F, -15.5F, -30F);

		bodyModel[22].addBox(0F, 0F, 0F, 7, 1, 12, 0F); // CR.TrackFrontLeft
		bodyModel[22].setRotationPoint(38F, -15.5F, -30F);
		bodyModel[22].rotateAngleZ = -0.6981317F;

		bodyModel[23].addBox(0F, 0F, 0F, 13, 6, 0, 0F); // CR.TrackSideLeft
		bodyModel[23].setRotationPoint(26F, -14.5F, -18F);

		bodyModel[24].addBox(0F, 0F, 0F, 6, 12, 52, 0F); // CR.BackMiddle
		bodyModel[24].setRotationPoint(-72F, -22F, -26F);
		bodyModel[24].rotateAngleZ = 0.1570796F;

		bodyModel[25].addBox(0F, -20F, 0F, 54, 22, 8, 0F); // CR.TurretSideRight
		bodyModel[25].setRotationPoint(-71F, -21F, 18F);
		bodyModel[25].rotateAngleX = 0.3717861F;

		bodyModel[26].addBox(0F, -20F, -8F, 54, 22, 8, 0F); // CR.TurretSideLeft
		bodyModel[26].setRotationPoint(-71F, -21F, -18F);
		bodyModel[26].rotateAngleX = -0.3717901F;

		bodyModel[27].addBox(0F, 0F, 0F, 54, 21, 36, 0F); // CR.turretMain
		bodyModel[27].setRotationPoint(-71F, -42.5F, -18F);

		bodyModel[28].addBox(0F, 0F, 0F, 10, 2, 10, 0F); // CR.Commander'sHatch
		bodyModel[28].setRotationPoint(-60F, -43.5F, 5F);

		bodyModel[29].addBox(-2.5F, 0F, -2.5F, 5, 4, 5, 0F); // CR.RandomSquarePeg
		bodyModel[29].setRotationPoint(-47F, -45F, 0F);
		bodyModel[29].rotateAngleY = -0.7853982F;

		bodyModel[30].addBox(0F, 0F, 0F, 10, 3, 10, 0F); // CR.PortHole
		bodyModel[30].setRotationPoint(-38F, -43F, -16F);
		bodyModel[30].rotateAngleZ = 0.1745329F;

		bodyModel[31].addBox(0F, 0F, 0F, 4, 3, 15, 0F); // CR.UnderGunThingy
		bodyModel[31].setRotationPoint(-17F, -25F, -7.5F);

		bodyModel[32].addBox(0F, 0F, 0F, 20, 1, 48, 0F); // CR.EngineStuff
		bodyModel[32].setRotationPoint(-12F, -23F, -24F);

		bodyModel[33].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // CR.AntennaBase
		bodyModel[33].setRotationPoint(12F, -24F, -18F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 26, 1, 0F); // CR.Antenna
		bodyModel[34].setRotationPoint(13.5F, -48F, -16.5F);

		bodyModel[35].addBox(0F, 0F, 0F, 7, 1, 40, 0F); // CR.antennaHolderStuff
		bodyModel[35].setRotationPoint(10.5F, -22.5F, -20F);

		bodyModel[36].addBox(0F, 0F, -4F, 3, 3, 8, 0F); // CR.GummyRight
		bodyModel[36].setRotationPoint(-17.5F, -24.5F, 16F);

		bodyModel[37].addBox(0F, 0F, -4F, 3, 3, 8, 0F); // CR.GummyLeft
		bodyModel[37].setRotationPoint(-17.5F, -24.5F, -16F);

		bodyModel[38].addBox(4F, -2F, -0.5F, 4, 2, 1, 0F); // CR.FrontThingRight
		bodyModel[38].setRotationPoint(36F, -14F, 12F);
		bodyModel[38].rotateAngleZ = -1.256637F;

		bodyModel[39].addBox(4F, -2F, -0.5F, 4, 2, 1, 0F); // CR.FrontThingLeft
		bodyModel[39].setRotationPoint(36F, -14F, -12F);
		bodyModel[39].rotateAngleZ = -1.256637F;



// Barrel
		barrelModel = new ModelRendererTurbo[6];
		barrelModel[0] = new ModelRendererTurbo(this,  800,  440, textureX, textureY); // BL.PivotPoint
		barrelModel[1] = new ModelRendererTurbo(this,  800,  490, textureX, textureY); // BL.GunShield
		barrelModel[2] = new ModelRendererTurbo(this,  800,  550, textureX, textureY); // BL.Shield/gunconverter
		barrelModel[3] = new ModelRendererTurbo(this,  800,  900, textureX, textureY); // BL.Gun
		barrelModel[4] = new ModelRendererTurbo(this,  800,  930, textureX, textureY); // BL.MuzzleBase
		barrelModel[5] = new ModelRendererTurbo(this,  880,  930, textureX, textureY); // BL.Aircooler

		barrelModel[0].addBox(0F, -6F, -6F, 8, 12, 12, 0F); // BL.PivotPoint
		barrelModel[0].setRotationPoint(-18F, -33F, 0F);

		barrelModel[1].addBox(8F, -8F, -9F, 1, 16, 18, 0F); // BL.GunShield
		barrelModel[1].setRotationPoint(-18F, -33F, 0F);

		barrelModel[2].addBox(8F, -4.5F, -4.5F, 6, 9, 9, 0F); // BL.Shield/gunconverter
		barrelModel[2].setRotationPoint(-18F, -33F, 0F);

		barrelModel[3].addBox(14F, -2F, -2F, 60, 4, 4, 0F); // BL.Gun
		barrelModel[3].setRotationPoint(-18F, -33F, 0F);

		barrelModel[4].addBox(74F, -2.5F, -2.5F, 6, 5, 5, 0F); // BL.MuzzleBase
		barrelModel[4].setRotationPoint(-18F, -33F, 0F);

		barrelModel[5].addBox(80F, -3F, -3F, 12, 6, 6, 0F); // BL.Aircooler
		barrelModel[5].setRotationPoint(-18F, -33F, 0F);



// Left Track
		leftTrackModel = new ModelRendererTurbo[19];
		leftTrackModel[0] = new ModelRendererTurbo(this,  500,  50, textureX, textureY); // LT.BackWheelLeft
		leftTrackModel[1] = new ModelRendererTurbo(this,  500,  50, textureX, textureY); // LT.FrontWheelLeft
		leftTrackModel[2] = new ModelRendererTurbo(this,  500,  150, textureX, textureY); // LT.FrontPairA
		leftTrackModel[3] = new ModelRendererTurbo(this,  500,  150, textureX, textureY); // LT.FrontPairB
		leftTrackModel[4] = new ModelRendererTurbo(this,  500,  150, textureX, textureY); // LT.BackPairA
		leftTrackModel[5] = new ModelRendererTurbo(this,  500,  150, textureX, textureY); // LT.BackPairB
		leftTrackModel[6] = new ModelRendererTurbo(this,  500,  150, textureX, textureY); // LT.MiddlePairA
		leftTrackModel[7] = new ModelRendererTurbo(this,  500,  150, textureX, textureY); // LT.MiddlePairB
		leftTrackModel[8] = new ModelRendererTurbo(this,  500,  200, textureX, textureY); // LT.BottomThread
		leftTrackModel[9] = new ModelRendererTurbo(this,  500,  250, textureX, textureY); // LT.BottomFrontCornerThread
		leftTrackModel[10] = new ModelRendererTurbo(this,  500,  275, textureX, textureY); // LT.FrontThread
		leftTrackModel[11] = new ModelRendererTurbo(this,  500,  320, textureX, textureY); // LT.TopFrontThread
		leftTrackModel[12] = new ModelRendererTurbo(this,  500,  360, textureX, textureY); // LT.InnerAngleForward
		leftTrackModel[13] = new ModelRendererTurbo(this,  500,  400, textureX, textureY); // LT.InnerThread
		leftTrackModel[14] = new ModelRendererTurbo(this,  500,  425, textureX, textureY); // LT.InnerAngleBack
		leftTrackModel[15] = new ModelRendererTurbo(this,  500,  450, textureX, textureY); // LT.TopBackThread
		leftTrackModel[16] = new ModelRendererTurbo(this,  500,  475, textureX, textureY); // LT.BackThread
		leftTrackModel[17] = new ModelRendererTurbo(this,  500,  500, textureX, textureY); // LT.BackCornerBottomThread
		leftTrackModel[18] = new ModelRendererTurbo(this,  500,  360, textureX, textureY); // lT.InnerAngleForward

		leftTrackModel[0].addBox(0F, 0F, 0F, 11, 11, 11, 0F); // LT.BackWheelLeft
		leftTrackModel[0].setRotationPoint(-68F, -7F, -29F);

		leftTrackModel[1].addBox(0F, 0F, 0F, 11, 11, 11, 0F); // LT.FrontWheelLeft
		leftTrackModel[1].setRotationPoint(28F, -11F, -29F);

		leftTrackModel[2].addBox(0F, 0F, 0F, 10, 10, 11, 0F); // LT.FrontPairA
		leftTrackModel[2].setRotationPoint(13F, -1F, -29F);

		leftTrackModel[3].addBox(0F, 0F, 0F, 10, 10, 11, 0F); // LT.FrontPairB
		leftTrackModel[3].setRotationPoint(1F, -1F, -29F);

		leftTrackModel[4].addBox(0F, 0F, 0F, 10, 10, 11, 0F); // LT.BackPairA
		leftTrackModel[4].setRotationPoint(-42F, -1F, -29F);

		leftTrackModel[5].addBox(0F, 0F, 0F, 10, 10, 11, 0F); // LT.BackPairB
		leftTrackModel[5].setRotationPoint(-54F, -1F, -29F);

		leftTrackModel[6].addBox(0F, 0F, 0F, 10, 10, 11, 0F); // LT.MiddlePairA
		leftTrackModel[6].setRotationPoint(-14.5F, -1F, -29F);

		leftTrackModel[7].addBox(0F, 0F, 0F, 10, 10, 11, 0F); // LT.MiddlePairB
		leftTrackModel[7].setRotationPoint(-26.5F, -1F, -29F);

		leftTrackModel[8].addBox(0F, 0F, 0F, 79, 1, 11, 0F); // LT.BottomThread
		leftTrackModel[8].setRotationPoint(-55F, 9F, -29F);

		leftTrackModel[9].addBox(0F, 0F, 0F, 19, 1, 11, 0F); // LT.BottomFrontCornerThread
		leftTrackModel[9].setRotationPoint(23F, 9F, -29F);
		leftTrackModel[9].rotateAngleZ = 0.5235988F;

		leftTrackModel[10].addBox(0F, 0F, 0F, 1, 12, 11, 0F); // LT.FrontThread
		leftTrackModel[10].setRotationPoint(39F, -11.5F, -29F);

		leftTrackModel[11].addBox(0F, 0F, 0F, 12, 1, 11, 0F); // LT.TopFrontThread
		leftTrackModel[11].setRotationPoint(27.5F, -12F, -29F);

		leftTrackModel[12].addBox(0F, 0F, 0F, 18, 1, 11, 0F); // LT.InnerAngleForward
		leftTrackModel[12].setRotationPoint(11.5F, -4F, 0F);
		leftTrackModel[12].rotateAngleZ = 0.4537856F;

		leftTrackModel[13].addBox(0F, 0F, 0F, 48, 1, 11, 0F); // LT.InnerThread
		leftTrackModel[13].setRotationPoint(-36F, -4F, -29F);

		leftTrackModel[14].addBox(0F, 0F, 0F, 22, 1, 11, 0F); // LT.InnerAngleBack
		leftTrackModel[14].setRotationPoint(-57F, -8F, -29F);
		leftTrackModel[14].rotateAngleZ = -0.1745329F;

		leftTrackModel[15].addBox(0F, 0F, 0F, 12, 1, 11, 0F); // LT.TopBackThread
		leftTrackModel[15].setRotationPoint(-69F, -8F, -29F);

		leftTrackModel[16].addBox(0F, 0F, 0F, 1, 13, 11, 0F); // LT.BackThread
		leftTrackModel[16].setRotationPoint(-69F, -8F, -29F);

		leftTrackModel[17].addBox(0F, 0F, 0F, 16, 1, 11, 0F); // LT.BackCornerBottomThread
		leftTrackModel[17].setRotationPoint(-69F, 3.5F, -29F);
		leftTrackModel[17].rotateAngleZ = -0.3490658F;

		leftTrackModel[18].addBox(0F, 0F, 0F, 18, 1, 11, 0F); // lT.InnerAngleForward
		leftTrackModel[18].setRotationPoint(11.5F, -4F, -29F);
		leftTrackModel[18].rotateAngleZ = 0.4537856F;



// Right Track
		rightTrackModel = new ModelRendererTurbo[18];
		rightTrackModel[0] = new ModelRendererTurbo(this,  500,  50, textureX, textureY); // RT.BackWheelRight
		rightTrackModel[1] = new ModelRendererTurbo(this,  500,  50, textureX, textureY); // RT.FrontWheelRight
		rightTrackModel[2] = new ModelRendererTurbo(this,  500,  150, textureX, textureY); // RT.FrontPairA
		rightTrackModel[3] = new ModelRendererTurbo(this,  500,  150, textureX, textureY); // RT.FrontPairB
		rightTrackModel[4] = new ModelRendererTurbo(this,  500,  150, textureX, textureY); // RT.BackPairA
		rightTrackModel[5] = new ModelRendererTurbo(this,  500,  150, textureX, textureY); // RT.BackPairB
		rightTrackModel[6] = new ModelRendererTurbo(this,  500,  150, textureX, textureY); // RT.MiddlePairA
		rightTrackModel[7] = new ModelRendererTurbo(this,  500,  150, textureX, textureY); // RT.MiddlePairB
		rightTrackModel[8] = new ModelRendererTurbo(this,  500,  200, textureX, textureY); // RT.BottomThread
		rightTrackModel[9] = new ModelRendererTurbo(this,  500,  250, textureX, textureY); // RT.BottomFrontCornerThread
		rightTrackModel[10] = new ModelRendererTurbo(this,  500,  275, textureX, textureY); // RT.FrontThread
		rightTrackModel[11] = new ModelRendererTurbo(this,  500,  320, textureX, textureY); // RT.TopFrontThread
		rightTrackModel[12] = new ModelRendererTurbo(this,  500,  360, textureX, textureY); // RT.InnerAngleForward
		rightTrackModel[13] = new ModelRendererTurbo(this,  500,  400, textureX, textureY); // RT.InnerThread
		rightTrackModel[14] = new ModelRendererTurbo(this,  500,  425, textureX, textureY); // RT.InnerAngleBack
		rightTrackModel[15] = new ModelRendererTurbo(this,  500,  450, textureX, textureY); // RT.TopBackThread
		rightTrackModel[16] = new ModelRendererTurbo(this,  500,  475, textureX, textureY); // RT.BackThread
		rightTrackModel[17] = new ModelRendererTurbo(this,  500,  500, textureX, textureY); // RT.BackCornerBottomThread

		rightTrackModel[0].addBox(0F, 0F, 0F, 11, 11, 11, 0F); // RT.BackWheelRight
		rightTrackModel[0].setRotationPoint(-68F, -7F, 18F);

		rightTrackModel[1].addBox(0F, 0F, 0F, 11, 11, 11, 0F); // RT.FrontWheelRight
		rightTrackModel[1].setRotationPoint(28F, -11F, 18F);

		rightTrackModel[2].addBox(0F, 0F, 0F, 10, 10, 11, 0F); // RT.FrontPairA
		rightTrackModel[2].setRotationPoint(13F, -1F, 18F);

		rightTrackModel[3].addBox(0F, 0F, 0F, 10, 10, 11, 0F); // RT.FrontPairB
		rightTrackModel[3].setRotationPoint(1F, -1F, 18F);

		rightTrackModel[4].addBox(0F, 0F, 0F, 10, 10, 11, 0F); // RT.BackPairA
		rightTrackModel[4].setRotationPoint(-42F, -1F, 18F);

		rightTrackModel[5].addBox(0F, 0F, 0F, 10, 10, 11, 0F); // RT.BackPairB
		rightTrackModel[5].setRotationPoint(-54F, -1F, 18F);

		rightTrackModel[6].addBox(0F, 0F, 0F, 10, 10, 11, 0F); // RT.MiddlePairA
		rightTrackModel[6].setRotationPoint(-14.5F, -1F, 18F);

		rightTrackModel[7].addBox(0F, 0F, 0F, 10, 10, 11, 0F); // RT.MiddlePairB
		rightTrackModel[7].setRotationPoint(-26.5F, -1F, 18F);

		rightTrackModel[8].addBox(0F, 0F, 0F, 79, 1, 11, 0F); // RT.BottomThread
		rightTrackModel[8].setRotationPoint(-55F, 9F, 18F);

		rightTrackModel[9].addBox(0F, 0F, 0F, 19, 1, 11, 0F); // RT.BottomFrontCornerThread
		rightTrackModel[9].setRotationPoint(23F, 9F, 18F);
		rightTrackModel[9].rotateAngleZ = 0.5235988F;

		rightTrackModel[10].addBox(0F, 0F, 0F, 1, 12, 11, 0F); // RT.FrontThread
		rightTrackModel[10].setRotationPoint(39F, -11.5F, 18F);

		rightTrackModel[11].addBox(0F, 0F, 0F, 12, 1, 11, 0F); // RT.TopFrontThread
		rightTrackModel[11].setRotationPoint(27.5F, -12F, 18F);

		rightTrackModel[12].addBox(0F, 0F, 0F, 18, 1, 11, 0F); // RT.InnerAngleForward
		rightTrackModel[12].setRotationPoint(11.5F, -4F, 18F);
		rightTrackModel[12].rotateAngleZ = 0.4537856F;

		rightTrackModel[13].addBox(0F, 0F, 0F, 48, 1, 11, 0F); // RT.InnerThread
		rightTrackModel[13].setRotationPoint(-36F, -4F, 18F);

		rightTrackModel[14].addBox(0F, 0F, 0F, 22, 1, 11, 0F); // RT.InnerAngleBack
		rightTrackModel[14].setRotationPoint(-57F, -8F, 18F);
		rightTrackModel[14].rotateAngleZ = -0.1745329F;

		rightTrackModel[15].addBox(0F, 0F, 0F, 12, 1, 11, 0F); // RT.TopBackThread
		rightTrackModel[15].setRotationPoint(-69F, -8F, 18F);

		rightTrackModel[16].addBox(0F, 0F, 0F, 1, 13, 11, 0F); // RT.BackThread
		rightTrackModel[16].setRotationPoint(-69F, -8F, 18F);

		rightTrackModel[17].addBox(0F, 0F, 0F, 16, 1, 11, 0F); // RT.BackCornerBottomThread
		rightTrackModel[17].setRotationPoint(-69F, 3.5F, 18F);
		rightTrackModel[17].rotateAngleZ = -0.3490658F;


		translateAll(0, -1, 0);


		flipAll();
	}
}