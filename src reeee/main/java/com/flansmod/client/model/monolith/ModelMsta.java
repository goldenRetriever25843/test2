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

public class ModelMsta extends ModelVehicle
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelMsta()
	{

// Body
		bodyModel = new ModelRendererTurbo[41];
		bodyModel[0] = new ModelRendererTurbo(this,  0,  970, textureX, textureY); // CR.TopAngle
		bodyModel[1] = new ModelRendererTurbo(this,  0,  900, textureX, textureY); // CR.FrontLowerGlacis
		bodyModel[2] = new ModelRendererTurbo(this,  140,  960, textureX, textureY); // CR.MainBulk
		bodyModel[3] = new ModelRendererTurbo(this,  0,  830, textureX, textureY); // CR.LowerFrontCoverUp
		bodyModel[4] = new ModelRendererTurbo(this,  0,  780, textureX, textureY); // CR.UnderAngleCoveruptop
		bodyModel[5] = new ModelRendererTurbo(this,  0,  720, textureX, textureY); // CR.UnderAngleCoverupBottom
		bodyModel[6] = new ModelRendererTurbo(this,  0,  665, textureX, textureY); // CR.Topcoverup
		bodyModel[7] = new ModelRendererTurbo(this,  0,  620, textureX, textureY); // CR.RightTrackFront
		bodyModel[8] = new ModelRendererTurbo(this,  50,  620, textureX, textureY); // CR.RightTrackFrontTop
		bodyModel[9] = new ModelRendererTurbo(this,  0,  580, textureX, textureY); // CR.RightTrackMain
		bodyModel[10] = new ModelRendererTurbo(this,  0,  540, textureX, textureY); // CR.rightTrackFrontCoverUp
		bodyModel[11] = new ModelRendererTurbo(this,  70,  540, textureX, textureY); // CR.RightHull/TrackThing
		bodyModel[12] = new ModelRendererTurbo(this,  0,  470, textureX, textureY); // CR.BackMainAngle
		bodyModel[13] = new ModelRendererTurbo(this,  0,  430, textureX, textureY); // CR.BackTopTrack
		bodyModel[14] = new ModelRendererTurbo(this,  0,  400, textureX, textureY); // CR.BackBottomTrack
		bodyModel[15] = new ModelRendererTurbo(this,  0,  330, textureX, textureY); // CR.UtilityLog
		bodyModel[16] = new ModelRendererTurbo(this,  100,  330, textureX, textureY); // CR.LogHolderRight
		bodyModel[17] = new ModelRendererTurbo(this,  100,  330, textureX, textureY); // CR.LogHolderLeft
		bodyModel[18] = new ModelRendererTurbo(this,  50,  620, textureX, textureY); // CR.LeftTrackFrontTop
		bodyModel[19] = new ModelRendererTurbo(this,  0,  620, textureX, textureY); // CR.LeftTrackFront
		bodyModel[20] = new ModelRendererTurbo(this,  0,  540, textureX, textureY); // CR.leftTrackFrontCoverUp
		bodyModel[21] = new ModelRendererTurbo(this,  0,  580, textureX, textureY); // CR.LeftTrackMain
		bodyModel[22] = new ModelRendererTurbo(this,  0,  430, textureX, textureY); // CR.BackTopTrackLeft
		bodyModel[23] = new ModelRendererTurbo(this,  0,  400, textureX, textureY); // CR.BackBottomTrackLeft
		bodyModel[24] = new ModelRendererTurbo(this,  70,  540, textureX, textureY); // CR.LeftHull/TrackThing
		bodyModel[25] = new ModelRendererTurbo(this,  0,  300, textureX, textureY); // CR.LeftTrackBumperFront
		bodyModel[26] = new ModelRendererTurbo(this,  0,  300, textureX, textureY); // CR.RightTrackBumperFront
		bodyModel[27] = new ModelRendererTurbo(this,  70,  300, textureX, textureY); // CR.LeftTrackBumperBody
		bodyModel[28] = new ModelRendererTurbo(this,  70,  300, textureX, textureY); // CR.RightTrackBumperBody
		bodyModel[29] = new ModelRendererTurbo(this,  500,  980, textureX, textureY); // CR.LeftFrontwheel
		bodyModel[30] = new ModelRendererTurbo(this,  500,  980, textureX, textureY); // CR.LeftBackwheel
		bodyModel[31] = new ModelRendererTurbo(this,  500,  980, textureX, textureY); // CR.RightFrontwheel
		bodyModel[32] = new ModelRendererTurbo(this,  500,  980, textureX, textureY); // CR.RightBackwheel
		bodyModel[33] = new ModelRendererTurbo(this,  500,  800, textureX, textureY); // CR.LeftBackTrackBumper
		bodyModel[34] = new ModelRendererTurbo(this,  500,  800, textureX, textureY); // CR.RightBackTrackBumper
		bodyModel[35] = new ModelRendererTurbo(this,  480,  800, textureX, textureY); // CR.LeftLight
		bodyModel[36] = new ModelRendererTurbo(this,  480,  800, textureX, textureY); // CR.RightLight
		bodyModel[37] = new ModelRendererTurbo(this,  420,  850, textureX, textureY); // CR.TriangleThing
		bodyModel[38] = new ModelRendererTurbo(this,  420,  880, textureX, textureY); // CR.Teeth
		bodyModel[39] = new ModelRendererTurbo(this,  430,  800, textureX, textureY); // CR.DriverThingy
		bodyModel[40] = new ModelRendererTurbo(this,  430,  750, textureX, textureY); // CR.Axis

		bodyModel[0].addBox(0F, 0F, 0F, 24, 2, 34, 0F); // CR.TopAngle
		bodyModel[0].setRotationPoint(34F, -16F, -17F);
		bodyModel[0].rotateAngleZ = -0.4014257F;

		bodyModel[1].addBox(-2.9F, 0F, 0F, 4, 11, 34, 0F); // CR.FrontLowerGlacis
		bodyModel[1].setRotationPoint(54.5F, -6.2F, -17F);
		bodyModel[1].rotateAngleZ = -0.6632251F;

		bodyModel[2].addBox(0F, 0F, 0F, 73, 19, 34, 0F); // CR.MainBulk
		bodyModel[2].setRotationPoint(-39F, -16F, -17F);

		bodyModel[3].addBox(0F, 0F, 0F, 19, 12, 34, 0F); // CR.LowerFrontCoverUp
		bodyModel[3].setRotationPoint(30F, -9F, -17F);

		bodyModel[4].addBox(0F, 0F, 0F, 7, 3, 34, 0F); // CR.UnderAngleCoveruptop
		bodyModel[4].setRotationPoint(48F, -9F, -17F);
		bodyModel[4].rotateAngleZ = -0.2617994F;

		bodyModel[5].addBox(0F, -2.1F, 0F, 10, 3, 34, 0F); // CR.UnderAngleCoverupBottom
		bodyModel[5].setRotationPoint(44F, 0F, -17F);
		bodyModel[5].rotateAngleZ = 0.5585054F;

		bodyModel[6].addBox(2F, -0.5F, 0F, 21, 7, 34, 0F); // CR.Topcoverup
		bodyModel[6].setRotationPoint(29F, -16F, -17F);
		bodyModel[6].rotateAngleZ = -0.418879F;

		bodyModel[7].addBox(-3F, 2F, 0F, 4, 6, 10, 0F); // CR.RightTrackFront
		bodyModel[7].setRotationPoint(60F, -12F, 17F);
		bodyModel[7].rotateAngleZ = 0.5235988F;

		bodyModel[8].addBox(-3F, 0F, 0F, 4, 12, 10, 0F); // CR.RightTrackFrontTop
		bodyModel[8].setRotationPoint(50F, -12F, 17F);
		bodyModel[8].rotateAngleZ = 1.396263F;

		bodyModel[9].addBox(0F, 0F, 0F, 70, 12, 10, 0F); // CR.RightTrackMain
		bodyModel[9].setRotationPoint(-19.5F, -13F, 17F);

		bodyModel[10].addBox(0F, -8.5F, 0F, 11, 8, 10, 0F); // CR.rightTrackFrontCoverUp
		bodyModel[10].setRotationPoint(50.5F, -1F, 17F);
		bodyModel[10].rotateAngleZ = 0.08726646F;

		bodyModel[11].addBox(0F, 0F, 0F, 8, 1, 14, 0F); // CR.RightHull/TrackThing
		bodyModel[11].setRotationPoint(48F, -6F, 9F);
		bodyModel[11].rotateAngleX = 0.1396263F;
		bodyModel[11].rotateAngleY = -0.541052F;

		bodyModel[12].addBox(0F, 0F, 0F, 8, 16, 34, 0F); // CR.BackMainAngle
		bodyModel[12].setRotationPoint(-46F, -12F, -17F);
		bodyModel[12].rotateAngleZ = 0.4537856F;

		bodyModel[13].addBox(0F, 0F, 0F, 26, 6, 10, 0F); // CR.BackTopTrack
		bodyModel[13].setRotationPoint(-45F, -13F, 17F);

		bodyModel[14].addBox(0F, -6F, 0F, 26, 6, 10, 0F); // CR.BackBottomTrack
		bodyModel[14].setRotationPoint(-45F, -7F, 17F);
		bodyModel[14].rotateAngleZ = -0.2268928F;

		bodyModel[15].addBox(0F, 0F, 0F, 6, 6, 50, 0F); // CR.UtilityLog
		bodyModel[15].setRotationPoint(-52F, -10F, -25F);

		bodyModel[16].addBox(-4F, 0F, -0.5F, 8, 7, 1, 0F); // CR.LogHolderRight
		bodyModel[16].setRotationPoint(-47F, -10F, 12F);
		bodyModel[16].rotateAngleZ = 0.5235988F;

		bodyModel[17].addBox(-4F, 0F, -0.5F, 8, 7, 1, 0F); // CR.LogHolderLeft
		bodyModel[17].setRotationPoint(-47F, -10F, -12F);
		bodyModel[17].rotateAngleZ = 0.5235988F;

		bodyModel[18].addBox(-3F, 0F, 0F, 4, 12, 10, 0F); // CR.LeftTrackFrontTop
		bodyModel[18].setRotationPoint(50F, -12F, -27F);
		bodyModel[18].rotateAngleZ = 1.396263F;

		bodyModel[19].addBox(-3F, 2F, 0F, 4, 6, 10, 0F); // CR.LeftTrackFront
		bodyModel[19].setRotationPoint(60F, -12F, -27F);
		bodyModel[19].rotateAngleZ = 0.5235988F;

		bodyModel[20].addBox(0F, -8.5F, 0F, 11, 8, 10, 0F); // CR.leftTrackFrontCoverUp
		bodyModel[20].setRotationPoint(50.5F, -1F, -27F);
		bodyModel[20].rotateAngleZ = 0.1396263F;

		bodyModel[21].addBox(0F, 0F, 0F, 70, 12, 10, 0F); // CR.LeftTrackMain
		bodyModel[21].setRotationPoint(-19.5F, -13F, -27F);

		bodyModel[22].addBox(0F, 0F, 0F, 26, 6, 10, 0F); // CR.BackTopTrackLeft
		bodyModel[22].setRotationPoint(-45F, -13F, -27F);

		bodyModel[23].addBox(0F, -6F, 0F, 26, 6, 10, 0F); // CR.BackBottomTrackLeft
		bodyModel[23].setRotationPoint(-45F, -7F, -27F);
		bodyModel[23].rotateAngleZ = -0.2268928F;

		bodyModel[24].addBox(0F, 0F, -14F, 8, 1, 14, 0F); // CR.LeftHull/TrackThing
		bodyModel[24].setRotationPoint(48F, -6F, -9F);
		bodyModel[24].rotateAngleX = -0.1396263F;
		bodyModel[24].rotateAngleY = 0.541052F;

		bodyModel[25].addBox(0F, 0F, 0F, 14, 4, 9, 0F); // CR.LeftTrackBumperFront
		bodyModel[25].setRotationPoint(34F, -16.5F, -26.5F);
		bodyModel[25].rotateAngleZ = -0.2617994F;

		bodyModel[26].addBox(0F, 0F, 0F, 14, 4, 9, 0F); // CR.RightTrackBumperFront
		bodyModel[26].setRotationPoint(34F, -16.5F, 17.5F);
		bodyModel[26].rotateAngleZ = -0.2617994F;

		bodyModel[27].addBox(0F, 0F, 0F, 73, 4, 9, 0F); // CR.LeftTrackBumperBody
		bodyModel[27].setRotationPoint(-39F, -16.5F, -26.5F);

		bodyModel[28].addBox(0F, 0F, 0F, 73, 4, 9, 0F); // CR.RightTrackBumperBody
		bodyModel[28].setRotationPoint(-39F, -16.5F, 17.5F);

		bodyModel[29].addBox(0F, 0F, -3F, 8, 8, 6, 0F); // CR.LeftFrontwheel
		bodyModel[29].setRotationPoint(53F, -8.5F, -22F);

		bodyModel[30].addBox(0F, 0F, -3F, 8, 8, 6, 0F); // CR.LeftBackwheel
		bodyModel[30].setRotationPoint(-41F, -8.5F, -22F);

		bodyModel[31].addBox(0F, 0F, -3F, 8, 8, 6, 0F); // CR.RightFrontwheel
		bodyModel[31].setRotationPoint(53F, -8.5F, 22F);

		bodyModel[32].addBox(0F, 0F, -3F, 8, 8, 6, 0F); // CR.RightBackwheel
		bodyModel[32].setRotationPoint(-41F, -8.5F, 22F);

		bodyModel[33].addBox(0F, 0F, 0F, 6, 4, 9, 0F); // CR.LeftBackTrackBumper
		bodyModel[33].setRotationPoint(-44F, -13F, -26.5F);
		bodyModel[33].rotateAngleZ = 0.6320364F;

		bodyModel[34].addBox(0F, 0F, 0F, 6, 4, 9, 0F); // CR.RightBackTrackBumper
		bodyModel[34].setRotationPoint(-44F, -13F, 17.5F);
		bodyModel[34].rotateAngleZ = 0.6320364F;

		bodyModel[35].addBox(0F, 0F, 0F, 1, 5, 3, 0F); // CR.LeftLight
		bodyModel[35].setRotationPoint(50F, -13F, -15F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 5, 3, 0F); // CR.RightLight
		bodyModel[36].setRotationPoint(50F, -13F, 12F);

		bodyModel[37].addBox(-8F, 0F, -8F, 16, 2, 16, 0F); // CR.TriangleThing
		bodyModel[37].setRotationPoint(43F, -12F, 0F);
		bodyModel[37].rotateAngleX = -0.1570796F;
		bodyModel[37].rotateAngleY = -0.7853982F;
		bodyModel[37].rotateAngleZ = -0.1570796F;

		bodyModel[38].addBox(-2.7F, 0F, 0F, 1, 4, 32, 0F); // CR.Teeth
		bodyModel[38].setRotationPoint(55F, -1F, -16F);
		bodyModel[38].rotateAngleZ = -0.6632251F;

		bodyModel[39].addBox(0F, 0F, 0F, 5, 3, 10, 0F); // CR.DriverThingy
		bodyModel[39].setRotationPoint(34F, -15.8F, -5F);

		bodyModel[40].addBox(0F, 0F, 0F, 30, 4, 30, 0F); // CR.Axis
		bodyModel[40].setRotationPoint(-15F, -18F, -15F);



// Turret
		turretModel = new ModelRendererTurbo[33];
		turretModel[0] = new ModelRendererTurbo(this,  800,  960, textureX, textureY); // TR.MainFattyPart
		turretModel[1] = new ModelRendererTurbo(this,  800,  920, textureX, textureY); // TR.LeftCheeck
		turretModel[2] = new ModelRendererTurbo(this,  800,  920, textureX, textureY); // TR.RightCheeck
		turretModel[3] = new ModelRendererTurbo(this,  950,  920, textureX, textureY); // TR.LeftCheeckCorner
		turretModel[4] = new ModelRendererTurbo(this,  950,  920, textureX, textureY); // TR.RightCheeckCorner
		turretModel[5] = new ModelRendererTurbo(this,  800,  880, textureX, textureY); // TR.LeftFrontSide
		turretModel[6] = new ModelRendererTurbo(this,  800,  880, textureX, textureY); // TR.RightFrontSide
		turretModel[7] = new ModelRendererTurbo(this,  900,  880, textureX, textureY); // TR.UpperRightCheeckCorner
		turretModel[8] = new ModelRendererTurbo(this,  950,  880, textureX, textureY); // TR.RightTopFrontSide
		turretModel[9] = new ModelRendererTurbo(this,  800,  840, textureX, textureY); // TR.LeftUpperCheeck
		turretModel[10] = new ModelRendererTurbo(this,  800,  840, textureX, textureY); // TR.RightUpperCheeck
		turretModel[11] = new ModelRendererTurbo(this,  900,  880, textureX, textureY); // TR.UpperLeftCheeckCorner
		turretModel[12] = new ModelRendererTurbo(this,  950,  880, textureX, textureY); // TR.LeftTopFrontSide
		turretModel[13] = new ModelRendererTurbo(this,  800,  790, textureX, textureY); // TR.Roof
		turretModel[14] = new ModelRendererTurbo(this,  800,  740, textureX, textureY); // TR.RightBack
		turretModel[15] = new ModelRendererTurbo(this,  800,  740, textureX, textureY); // TR.LeftBack
		turretModel[16] = new ModelRendererTurbo(this,  860,  735, textureX, textureY); // TR.BackCenterangle
		turretModel[17] = new ModelRendererTurbo(this,  800,  700, textureX, textureY); // TR.BackRightTopCorner
		turretModel[18] = new ModelRendererTurbo(this,  800,  700, textureX, textureY); // TR.BackLeftTopCorner
		turretModel[19] = new ModelRendererTurbo(this,  880,  700, textureX, textureY); // TR.DecorativeTubeThing
		turretModel[20] = new ModelRendererTurbo(this,  930,  680, textureX, textureY); // TR.DeathThingy
		turretModel[21] = new ModelRendererTurbo(this,  800,  650, textureX, textureY); // TR.DeathThingyholder
		turretModel[22] = new ModelRendererTurbo(this,  850,  650, textureX, textureY); // TR.DeathThingyholderBottom
		turretModel[23] = new ModelRendererTurbo(this,  800,  500, textureX, textureY); // TR.Antenna
		turretModel[24] = new ModelRendererTurbo(this,  800,  550, textureX, textureY); // TR.Camera
		turretModel[25] = new ModelRendererTurbo(this,  800,  600, textureX, textureY); // TR.Hatch
		turretModel[26] = new ModelRendererTurbo(this,  880,  600, textureX, textureY); // TR.MGHolder
		turretModel[27] = new ModelRendererTurbo(this,  0,  50, textureX, textureY); // TR."Circle"1
		turretModel[28] = new ModelRendererTurbo(this,  70,  50, textureX, textureY); // TR."Circle"2
		turretModel[29] = new ModelRendererTurbo(this,  120,  50, textureX, textureY); // TR."Circle"3
		turretModel[30] = new ModelRendererTurbo(this,  170,  50, textureX, textureY); // TR."Circle"4
		turretModel[31] = new ModelRendererTurbo(this,  220,  50, textureX, textureY); // TR."Circle"5
		turretModel[32] = new ModelRendererTurbo(this,  270,  50, textureX, textureY); // TR."Circle"6

		turretModel[0].addBox(-31F, 0F, -19F, 54, 17, 38, 0F); // TR.MainFattyPart
		turretModel[0].setRotationPoint(0F, -33.5F, 0F);

		turretModel[1].addBox(-34F, 4F, -19F, 57, 15, 5, 0F); // TR.LeftCheeck
		turretModel[1].setRotationPoint(0F, -32F, 0F);
		turretModel[1].rotateAngleX = -0.2443461F;

		turretModel[2].addBox(-34F, 4F, 14F, 57, 15, 5, 0F); // TR.RightCheeck
		turretModel[2].setRotationPoint(0F, -32F, 0F);
		turretModel[2].rotateAngleX = 0.2443461F;

		turretModel[3].addBox(19F, 0F, -21.5F, 7, 14, 5, 0F); // TR.LeftCheeckCorner
		turretModel[3].setRotationPoint(0F, -17.5F, 0F);
		turretModel[3].rotateAngleX = -0.2443461F;
		turretModel[3].rotateAngleY = 0.06981317F;
		turretModel[3].rotateAngleZ = 0.4363323F;

		turretModel[4].addBox(19F, 0F, 16.5F, 8, 14, 5, 0F); // TR.RightCheeckCorner
		turretModel[4].setRotationPoint(0F, -17.5F, 0F);
		turretModel[4].rotateAngleX = 0.2443461F;
		turretModel[4].rotateAngleY = -0.06981317F;
		turretModel[4].rotateAngleZ = 0.4363323F;

		turretModel[5].addBox(19.2F, 0F, -19F, 7, 15, 15, 0F); // TR.LeftFrontSide
		turretModel[5].setRotationPoint(0F, -22.5F, 0F);
		turretModel[5].rotateAngleZ = 0.4363323F;

		turretModel[6].addBox(19.2F, 0F, 4F, 7, 15, 15, 0F); // TR.RightFrontSide
		turretModel[6].setRotationPoint(0F, -22.5F, 0F);
		turretModel[6].rotateAngleZ = 0.4363323F;

		turretModel[7].addBox(17F, 1F, 11.2F, 8, 10, 5, 0F); // TR.UpperRightCheeckCorner
		turretModel[7].setRotationPoint(0F, -24.5F, 0F);
		turretModel[7].rotateAngleX = 0.5061455F;
		turretModel[7].rotateAngleZ = 0.4363323F;

		turretModel[8].addBox(19.2F, -9F, 4F, 7, 9, 10, 0F); // TR.RightTopFrontSide
		turretModel[8].setRotationPoint(0F, -22.5F, 0F);
		turretModel[8].rotateAngleZ = 0.4363323F;

		turretModel[9].addBox(-25F, 6F, -13F, 44, 10, 5, 0F); // TR.LeftUpperCheeck
		turretModel[9].setRotationPoint(0F, -41F, 0F);
		turretModel[9].rotateAngleX = -0.4886922F;

		turretModel[10].addBox(-25F, 6F, 8.5F, 44, 10, 5, 0F); // TR.RightUpperCheeck
		turretModel[10].setRotationPoint(0F, -41F, 0F);
		turretModel[10].rotateAngleX = 0.4886922F;

		turretModel[11].addBox(17F, 1F, -16F, 8, 10, 5, 0F); // TR.UpperLeftCheeckCorner
		turretModel[11].setRotationPoint(0F, -24.5F, 0F);
		turretModel[11].rotateAngleX = -0.5061455F;
		turretModel[11].rotateAngleZ = 0.4363323F;

		turretModel[12].addBox(19.2F, -9F, -14F, 7, 9, 10, 0F); // TR.LeftTopFrontSide
		turretModel[12].setRotationPoint(0F, -22.5F, 0F);
		turretModel[12].rotateAngleZ = 0.4363323F;

		turretModel[13].addBox(-24F, 0F, -14.5F, 43, 9, 29, 0F); // TR.Roof
		turretModel[13].setRotationPoint(0F, -42F, 0F);

		turretModel[14].addBox(-34F, 0F, 7F, 3, 16, 12, 0F); // TR.RightBack
		turretModel[14].setRotationPoint(0F, -33.5F, 0F);

		turretModel[15].addBox(-34F, 0F, -19F, 3, 16, 12, 0F); // TR.LeftBack
		turretModel[15].setRotationPoint(0F, -33.5F, 0F);

		turretModel[16].addBox(-32F, 0F, -14.5F, 5, 11, 29, 0F); // TR.BackCenterangle
		turretModel[16].setRotationPoint(0F, -20.5F, 0F);
		turretModel[16].rotateAngleZ = -0.7330383F;

		turretModel[17].addBox(-26F, 7F, 17F, 5, 10, 6, 0F); // TR.BackRightTopCorner
		turretModel[17].setRotationPoint(0F, -21F, 0F);
		turretModel[17].rotateAngleX = 0.5585054F;
		turretModel[17].rotateAngleY = 0.3665192F;
		turretModel[17].rotateAngleZ = -0.5934119F;

		turretModel[18].addBox(-38F, -8F, -32F, 5, 10, 6, 0F); // TR.BackLeftTopCorner
		turretModel[18].setRotationPoint(0F, 1F, 0F);
		turretModel[18].rotateAngleX = -0.5585054F;
		turretModel[18].rotateAngleY = -0.3665192F;
		turretModel[18].rotateAngleZ = -0.5934119F;

		turretModel[19].addBox(-38F, 6F, -9F, 4, 18, 4, 0F); // TR.DecorativeTubeThing
		turretModel[19].setRotationPoint(0F, -37F, 0F);
		turretModel[19].rotateAngleX = -0.5948578F;

		turretModel[20].addBox(-38F, 2F, -2F, 5, 30, 4, 0F); // TR.DeathThingy
		turretModel[20].setRotationPoint(0F, -20F, 0F);
		turretModel[20].rotateAngleZ = -0.8726646F;

		turretModel[21].addBox(-34F, 13F, -1.5F, 8, 15, 3, 0F); // TR.DeathThingyholder
		turretModel[21].setRotationPoint(0F, -20F, 0F);
		turretModel[21].rotateAngleZ = -0.8726646F;

		turretModel[22].addBox(-31F, 14F, -1.5F, 8, 11, 3, 0F); // TR.DeathThingyholderBottom
		turretModel[22].setRotationPoint(0F, -31F, 0F);
		turretModel[22].rotateAngleZ = -0.4636999F;

		turretModel[23].addBox(-12F, 0F, -10F, 1, 30, 1, 0F); // TR.Antenna
		turretModel[23].setRotationPoint(0F, -70F, 0F);

		turretModel[24].addBox(9F, 0F, 8F, 8, 4, 4, 0F); // TR.Camera
		turretModel[24].setRotationPoint(0F, -46F, 0F);

		turretModel[25].addBox(6F, 0F, -13F, 10, 1, 10, 0F); // TR.Hatch
		turretModel[25].setRotationPoint(0F, -43F, 0F);

		turretModel[26].addBox(16F, 0F, -8.5F, 1, 4, 1, 0F); // TR.MGHolder
		turretModel[26].setRotationPoint(0F, -50F, 0F);
		turretModel[26].rotateAngleZ = -0.3141593F;

		turretModel[27].addBox(29F, 2F, -4F, 4, 6, 8, 0F); // TR."Circle"1
		turretModel[27].setRotationPoint(0F, -16F, 0F);
		turretModel[27].rotateAngleZ = 1.047198F;

		turretModel[28].addBox(23.5F, -1F, -4F, 6, 7, 8, 0F); // TR."Circle"2
		turretModel[28].setRotationPoint(0F, -23F, 0F);
		turretModel[28].rotateAngleZ = 0.6108652F;

		turretModel[29].addBox(22.6F, -3F, -4F, 6, 6, 8, 0F); // TR."Circle"3
		turretModel[29].setRotationPoint(0F, -26.2F, 0F);
		turretModel[29].rotateAngleZ = 0.2094395F;

		turretModel[30].addBox(22.5F, 0F, -4F, 6, 4, 8, 0F); // TR."Circle"4
		turretModel[30].setRotationPoint(0F, -29F, 0F);

		turretModel[31].addBox(26.5F, 0F, -4F, 6, 4, 8, 0F); // TR."Circle"5
		turretModel[31].setRotationPoint(0F, -41F, 0F);
		turretModel[31].rotateAngleZ = -0.5235988F;

		turretModel[32].addBox(18F, -16F, -4F, 6, 6, 8, 0F); // TR."Circle"6
		turretModel[32].setRotationPoint(0F, -34F, 0F);
		turretModel[32].rotateAngleZ = -1.047198F;



// Barrel
		barrelModel = new ModelRendererTurbo[11];
		barrelModel[0] = new ModelRendererTurbo(this,  900,  0, textureX, textureY); // BL.MGBody
		barrelModel[1] = new ModelRendererTurbo(this,  970,  0, textureX, textureY); // BL.MGAmmo
		barrelModel[2] = new ModelRendererTurbo(this,  850,  0, textureX, textureY); // BL.MGBarrel
		barrelModel[3] = new ModelRendererTurbo(this,  800,  0, textureX, textureY); // BL.MGBarrelFront
		barrelModel[4] = new ModelRendererTurbo(this,  750,  0, textureX, textureY); // BL.MGSight
		barrelModel[5] = new ModelRendererTurbo(this,  600,  50, textureX, textureY); // BL.MainBarrel
		barrelModel[6] = new ModelRendererTurbo(this,  600,  80, textureX, textureY); // BL.Muzzle
		barrelModel[7] = new ModelRendererTurbo(this,  700,  80, textureX, textureY); // BL.WormThing
		barrelModel[8] = new ModelRendererTurbo(this,  600,  120, textureX, textureY); // BL.Back
		barrelModel[9] = new ModelRendererTurbo(this,  720,  120, textureX, textureY); // BL.chinuThingright
		barrelModel[10] = new ModelRendererTurbo(this,  720,  120, textureX, textureY); // BL.chinuThingright

		barrelModel[0].addBox(0F, 0F, -1F, 7, 3, 2, 0F); // BL.MGBody
		barrelModel[0].setRotationPoint(14F, -47.2F, -8F);

		barrelModel[1].addBox(3F, 0.5F, -5F, 2, 3, 4, 0F); // BL.MGAmmo
		barrelModel[1].setRotationPoint(14F, -47F, -8F);

		barrelModel[2].addBox(7F, 0F, -0.5F, 7, 2, 1, 0F); // BL.MGBarrel
		barrelModel[2].setRotationPoint(14F, -47F, -8F);

		barrelModel[3].addBox(14F, 0F, -0.5F, 9, 1, 1, 0F); // BL.MGBarrelFront
		barrelModel[3].setRotationPoint(14F, -47F, -8F);

		barrelModel[4].addBox(19F, -1.5F, -0.5F, 1, 2, 1, 0F); // BL.MGSight
		barrelModel[4].setRotationPoint(14F, -47F, -8F);

		barrelModel[5].addBox(0F, -1F, -2F, 110, 4, 4, 0F); // BL.MainBarrel
		barrelModel[5].setRotationPoint(16F, -32F, 0F);

		barrelModel[6].addBox(110F, -2.5F, -4F, 18, 6, 8, 0F); // BL.Muzzle
		barrelModel[6].setRotationPoint(16F, -31.5F, 0F);

		barrelModel[7].addBox(65F, -2F, -3F, 20, 6, 6, 0F); // BL.WormThing
		barrelModel[7].setRotationPoint(16F, -32F, 0F);

		barrelModel[8].addBox(0F, -2F, -3F, 40, 6, 6, 0F); // BL.Back
		barrelModel[8].setRotationPoint(16F, -32F, 0F);

		barrelModel[9].addBox(0F, -5F, 0.8F, 28, 3, 3, 0F); // BL.chinuThingright
		barrelModel[9].setRotationPoint(16F, -32F, 0F);

		barrelModel[10].addBox(0F, -5F, -3.8F, 28, 3, 3, 0F); // BL.chinuThingright
		barrelModel[10].setRotationPoint(16F, -32F, 0F);



// Body Door Open
		bodyDoorOpenModel = new ModelRendererTurbo[2];
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this,  400,  300, textureX, textureY); // DO.GunHolderRight
		bodyDoorOpenModel[1] = new ModelRendererTurbo(this,  400,  300, textureX, textureY); // DO.GunHolderLeft

		bodyDoorOpenModel[0].addBox(0F, 0F, 0F, 1, 23, 3, 0F); // DO.GunHolderRight
		bodyDoorOpenModel[0].setRotationPoint(43F, -28F, 0F);
		bodyDoorOpenModel[0].rotateAngleX = 0.5235988F;

		bodyDoorOpenModel[1].addBox(0F, 0F, -3F, 1, 23, 3, 0F); // DO.GunHolderLeft
		bodyDoorOpenModel[1].setRotationPoint(43F, -28F, 0F);
		bodyDoorOpenModel[1].rotateAngleX = -0.5235988F;



// Left Track
		leftTrackModel = new ModelRendererTurbo[11];
		leftTrackModel[0] = new ModelRendererTurbo(this,  500,  900, textureX, textureY); // LT.TrackFront
		leftTrackModel[1] = new ModelRendererTurbo(this,  530,  900, textureX, textureY); // LT.TrackFrontBottomCorner
		leftTrackModel[2] = new ModelRendererTurbo(this,  500,  870, textureX, textureY); // LT.TrackBottom
		leftTrackModel[3] = new ModelRendererTurbo(this,  500,  830, textureX, textureY); // LT.TrackBackBottomCorner
		leftTrackModel[4] = new ModelRendererTurbo(this,  530,  830, textureX, textureY); // LT.TrackBack
		leftTrackModel[5] = new ModelRendererTurbo(this,  500,  980, textureX, textureY); // LT.Wheel1
		leftTrackModel[6] = new ModelRendererTurbo(this,  500,  980, textureX, textureY); // LT.Wheel2
		leftTrackModel[7] = new ModelRendererTurbo(this,  500,  980, textureX, textureY); // LT.Wheel3
		leftTrackModel[8] = new ModelRendererTurbo(this,  500,  980, textureX, textureY); // LT.Wheel4
		leftTrackModel[9] = new ModelRendererTurbo(this,  500,  980, textureX, textureY); // LT.Wheel5
		leftTrackModel[10] = new ModelRendererTurbo(this,  500,  980, textureX, textureY); // LT.Wheel6

		leftTrackModel[0].addBox(0F, 0F, -4F, 1, 8, 8, 0F); // LT.TrackFront
		leftTrackModel[0].setRotationPoint(61F, -8F, -22F);

		leftTrackModel[1].addBox(0F, 0F, -4F, 1, 21, 8, 0F); // LT.TrackFrontBottomCorner
		leftTrackModel[1].setRotationPoint(61.5F, -0.5F, -22F);
		leftTrackModel[1].rotateAngleZ = -1.099557F;

		leftTrackModel[2].addBox(0F, 0F, -4F, 69, 1, 8, 0F); // LT.TrackBottom
		leftTrackModel[2].setRotationPoint(-25F, 9F, -22F);

		leftTrackModel[3].addBox(0F, 0F, -4F, 1, 20, 8, 0F); // LT.TrackBackBottomCorner
		leftTrackModel[3].setRotationPoint(-42F, 0F, -22F);
		leftTrackModel[3].rotateAngleZ = 1.047198F;

		leftTrackModel[4].addBox(0F, 0F, -4F, 1, 8, 8, 0F); // LT.TrackBack
		leftTrackModel[4].setRotationPoint(-42F, -8F, -22F);

		leftTrackModel[5].addBox(0F, 0F, -3F, 8, 8, 6, 0F); // LT.Wheel1
		leftTrackModel[5].setRotationPoint(-25F, 1F, -22F);

		leftTrackModel[6].addBox(0F, 0F, -3F, 8, 8, 6, 0F); // LT.Wheel2
		leftTrackModel[6].setRotationPoint(-13F, 1F, -22F);

		leftTrackModel[7].addBox(0F, 0F, -3F, 8, 8, 6, 0F); // LT.Wheel3
		leftTrackModel[7].setRotationPoint(-1F, 1F, -22F);

		leftTrackModel[8].addBox(0F, 0F, -3F, 8, 8, 6, 0F); // LT.Wheel4
		leftTrackModel[8].setRotationPoint(11F, 1F, -22F);

		leftTrackModel[9].addBox(0F, 0F, -3F, 8, 8, 6, 0F); // LT.Wheel5
		leftTrackModel[9].setRotationPoint(23F, 1F, -22F);

		leftTrackModel[10].addBox(0F, 0F, -3F, 8, 8, 6, 0F); // LT.Wheel6
		leftTrackModel[10].setRotationPoint(35F, 1F, -22F);



// Right Track
		rightTrackModel = new ModelRendererTurbo[11];
		rightTrackModel[0] = new ModelRendererTurbo(this,  500,  900, textureX, textureY); // RT.TrackFront
		rightTrackModel[1] = new ModelRendererTurbo(this,  530,  900, textureX, textureY); // RT.TrackFrontBottomCorner
		rightTrackModel[2] = new ModelRendererTurbo(this,  500,  870, textureX, textureY); // RT.TrackBottom
		rightTrackModel[3] = new ModelRendererTurbo(this,  500,  830, textureX, textureY); // RT.TrackBackBottomCorner
		rightTrackModel[4] = new ModelRendererTurbo(this,  530,  830, textureX, textureY); // RT.TrackBack
		rightTrackModel[5] = new ModelRendererTurbo(this,  500,  980, textureX, textureY); // RT.Wheel1
		rightTrackModel[6] = new ModelRendererTurbo(this,  500,  980, textureX, textureY); // RT.Wheel2
		rightTrackModel[7] = new ModelRendererTurbo(this,  500,  980, textureX, textureY); // RT.Wheel3
		rightTrackModel[8] = new ModelRendererTurbo(this,  500,  980, textureX, textureY); // RT.Wheel4
		rightTrackModel[9] = new ModelRendererTurbo(this,  500,  980, textureX, textureY); // RT.Wheel5
		rightTrackModel[10] = new ModelRendererTurbo(this,  500,  980, textureX, textureY); // RT.Wheel6

		rightTrackModel[0].addBox(0F, 0F, -4F, 1, 8, 8, 0F); // RT.TrackFront
		rightTrackModel[0].setRotationPoint(61F, -8F, 22F);

		rightTrackModel[1].addBox(0F, 0F, -4F, 1, 21, 8, 0F); // RT.TrackFrontBottomCorner
		rightTrackModel[1].setRotationPoint(61.5F, -0.5F, 22F);
		rightTrackModel[1].rotateAngleZ = -1.099557F;

		rightTrackModel[2].addBox(0F, 0F, -4F, 69, 1, 8, 0F); // RT.TrackBottom
		rightTrackModel[2].setRotationPoint(-25F, 9F, 22F);

		rightTrackModel[3].addBox(0F, 0F, -4F, 1, 20, 8, 0F); // RT.TrackBackBottomCorner
		rightTrackModel[3].setRotationPoint(-42F, 0F, 22F);
		rightTrackModel[3].rotateAngleZ = 1.047198F;

		rightTrackModel[4].addBox(0F, 0F, -4F, 1, 8, 8, 0F); // RT.TrackBack
		rightTrackModel[4].setRotationPoint(-42F, -8F, 22F);

		rightTrackModel[5].addBox(0F, 0F, -3F, 8, 8, 6, 0F); // RT.Wheel1
		rightTrackModel[5].setRotationPoint(-25F, 1F, 22F);

		rightTrackModel[6].addBox(0F, 0F, -3F, 8, 8, 6, 0F); // RT.Wheel2
		rightTrackModel[6].setRotationPoint(-13F, 1F, 22F);

		rightTrackModel[7].addBox(0F, 0F, -3F, 8, 8, 6, 0F); // RT.Wheel3
		rightTrackModel[7].setRotationPoint(-1F, 1F, 22F);

		rightTrackModel[8].addBox(0F, 0F, -3F, 8, 8, 6, 0F); // RT.Wheel4
		rightTrackModel[8].setRotationPoint(11F, 1F, 22F);

		rightTrackModel[9].addBox(0F, 0F, -3F, 8, 8, 6, 0F); // RT.Wheel5
		rightTrackModel[9].setRotationPoint(23F, 1F, 22F);

		rightTrackModel[10].addBox(0F, 0F, -3F, 8, 8, 6, 0F); // RT.Wheel6
		rightTrackModel[10].setRotationPoint(35F, 1F, 22F);


		flipAll(); //Call this function to flip everything in X and Y. For correcting old models.
		translateAll(0, 1, 0);
	}
}