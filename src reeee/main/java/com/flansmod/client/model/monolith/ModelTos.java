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

public class ModelTos extends ModelVehicle
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelTos()
	{

// Body
		bodyModel = new ModelRendererTurbo[39];
		bodyModel[0] = new ModelRendererTurbo(this,  0,  970, textureX, textureY); // CR.TopAngle
		bodyModel[1] = new ModelRendererTurbo(this,  0,  900, textureX, textureY); // CR.FrontLowerGlacis
		bodyModel[2] = new ModelRendererTurbo(this,  140,  960, textureX, textureY); // CR.MainBulk
		bodyModel[3] = new ModelRendererTurbo(this,  0,  830, textureX, textureY); // CR.LowerFrontCoverUp
		bodyModel[4] = new ModelRendererTurbo(this,  0,  720, textureX, textureY); // CR.UnderAngleCoverupBottom
		bodyModel[5] = new ModelRendererTurbo(this,  0,  665, textureX, textureY); // CR.Topcoverup
		bodyModel[6] = new ModelRendererTurbo(this,  0,  620, textureX, textureY); // CR.RightTrackFront
		bodyModel[7] = new ModelRendererTurbo(this,  50,  620, textureX, textureY); // CR.RightTrackFrontTop
		bodyModel[8] = new ModelRendererTurbo(this,  0,  580, textureX, textureY); // CR.RightTrackMain
		bodyModel[9] = new ModelRendererTurbo(this,  0,  540, textureX, textureY); // CR.rightTrackFrontCoverUp
		bodyModel[10] = new ModelRendererTurbo(this,  70,  540, textureX, textureY); // CR.RightHull/TrackThing
		bodyModel[11] = new ModelRendererTurbo(this,  0,  470, textureX, textureY); // CR.BackMainAngle
		bodyModel[12] = new ModelRendererTurbo(this,  0,  430, textureX, textureY); // CR.BackTopTrack
		bodyModel[13] = new ModelRendererTurbo(this,  0,  400, textureX, textureY); // CR.BackBottomTrack
		bodyModel[14] = new ModelRendererTurbo(this,  0,  330, textureX, textureY); // CR.UtilityLog
		bodyModel[15] = new ModelRendererTurbo(this,  100,  330, textureX, textureY); // CR.LogHolderRight
		bodyModel[16] = new ModelRendererTurbo(this,  100,  330, textureX, textureY); // CR.LogHolderLeft
		bodyModel[17] = new ModelRendererTurbo(this,  50,  620, textureX, textureY); // CR.LeftTrackFrontTop
		bodyModel[18] = new ModelRendererTurbo(this,  0,  620, textureX, textureY); // CR.LeftTrackFront
		bodyModel[19] = new ModelRendererTurbo(this,  0,  540, textureX, textureY); // CR.leftTrackFrontCoverUp
		bodyModel[20] = new ModelRendererTurbo(this,  0,  580, textureX, textureY); // CR.LeftTrackMain
		bodyModel[21] = new ModelRendererTurbo(this,  0,  430, textureX, textureY); // CR.BackTopTrackLeft
		bodyModel[22] = new ModelRendererTurbo(this,  0,  400, textureX, textureY); // CR.BackBottomTrackLeft
		bodyModel[23] = new ModelRendererTurbo(this,  70,  540, textureX, textureY); // CR.LeftHull/TrackThing
		bodyModel[24] = new ModelRendererTurbo(this,  0,  300, textureX, textureY); // CR.LeftTrackBumperFront
		bodyModel[25] = new ModelRendererTurbo(this,  0,  300, textureX, textureY); // CR.RightTrackBumperFront
		bodyModel[26] = new ModelRendererTurbo(this,  70,  300, textureX, textureY); // CR.LeftTrackBumperBody
		bodyModel[27] = new ModelRendererTurbo(this,  70,  300, textureX, textureY); // CR.RightTrackBumperBody
		bodyModel[28] = new ModelRendererTurbo(this,  500,  980, textureX, textureY); // CR.LeftFrontwheel
		bodyModel[29] = new ModelRendererTurbo(this,  500,  980, textureX, textureY); // CR.LeftBackwheel
		bodyModel[30] = new ModelRendererTurbo(this,  500,  980, textureX, textureY); // CR.RightFrontwheel
		bodyModel[31] = new ModelRendererTurbo(this,  500,  980, textureX, textureY); // CR.RightBackwheel
		bodyModel[32] = new ModelRendererTurbo(this,  500,  800, textureX, textureY); // CR.LeftBackTrackBumper
		bodyModel[33] = new ModelRendererTurbo(this,  500,  800, textureX, textureY); // CR.RightBackTrackBumper
		bodyModel[34] = new ModelRendererTurbo(this,  480,  800, textureX, textureY); // CR.LeftLight
		bodyModel[35] = new ModelRendererTurbo(this,  480,  800, textureX, textureY); // CR.RightLight
		bodyModel[36] = new ModelRendererTurbo(this,  420,  850, textureX, textureY); // CR.TriangleThing
		bodyModel[37] = new ModelRendererTurbo(this,  430,  800, textureX, textureY); // CR.DriverThingy
		bodyModel[38] = new ModelRendererTurbo(this,  430,  750, textureX, textureY); // CR.Axis

		bodyModel[0].addBox(0F, 0F, 0F, 25, 2, 34, 0F); // CR.TopAngle
		bodyModel[0].setRotationPoint(34F, -14F, -17F);
		bodyModel[0].rotateAngleZ = -0.4537856F;

		bodyModel[1].addBox(-2.9F, 1.5F, 0F, 4, 11, 34, 0F); // CR.FrontLowerGlacis
		bodyModel[1].setRotationPoint(55.5F, -3.2F, -17F);
		bodyModel[1].rotateAngleZ = -1.029744F;

		bodyModel[2].addBox(0F, 0F, 0F, 69, 18, 34, 0F); // CR.MainBulk
		bodyModel[2].setRotationPoint(-35F, -14F, -17F);

		bodyModel[3].addBox(0F, 0F, 0F, 16, 12, 34, 0F); // CR.LowerFrontCoverUp
		bodyModel[3].setRotationPoint(30F, -8F, -17F);

		bodyModel[4].addBox(0F, -2.1F, 0F, 10, 3, 34, 0F); // CR.UnderAngleCoverupBottom
		bodyModel[4].setRotationPoint(43F, 1F, -17F);
		bodyModel[4].rotateAngleZ = 0.5585054F;

		bodyModel[5].addBox(2F, -0.5F, 0F, 21, 7, 34, 0F); // CR.Topcoverup
		bodyModel[5].setRotationPoint(29F, -14F, -17F);
		bodyModel[5].rotateAngleZ = -0.418879F;

		bodyModel[6].addBox(-12F, 2F, 0F, 13, 6, 10, 0F); // CR.RightTrackFront
		bodyModel[6].setRotationPoint(60.5F, -11.5F, 17F);
		bodyModel[6].rotateAngleZ = 0.2443461F;

		bodyModel[7].addBox(-4F, 0F, 0F, 5, 12, 10, 0F); // CR.RightTrackFrontTop
		bodyModel[7].setRotationPoint(50F, -11F, 17F);
		bodyModel[7].rotateAngleZ = 1.396263F;

		bodyModel[8].addBox(0F, 0F, 0F, 70, 11, 10, 0F); // CR.RightTrackMain
		bodyModel[8].setRotationPoint(-19.5F, -12F, 17F);

		bodyModel[9].addBox(0F, -8.5F, 0F, 2, 8, 10, 0F); // CR.rightTrackFrontCoverUp
		bodyModel[9].setRotationPoint(50.5F, -1F, 17F);
		bodyModel[9].rotateAngleZ = 0.08726646F;

		bodyModel[10].addBox(0F, 0F, 0F, 7, 1, 13, 0F); // CR.RightHull/TrackThing
		bodyModel[10].setRotationPoint(48F, -5F, 10F);
		bodyModel[10].rotateAngleX = 0.06981317F;
		bodyModel[10].rotateAngleY = -0.541052F;

		bodyModel[11].addBox(0F, 0F, 0F, 8, 17, 34, 0F); // CR.BackMainAngle
		bodyModel[11].setRotationPoint(-42F, -11.5F, -17F);
		bodyModel[11].rotateAngleZ = 0.4537856F;

		bodyModel[12].addBox(0F, 0F, 0F, 26, 5, 10, 0F); // CR.BackTopTrack
		bodyModel[12].setRotationPoint(-45F, -12F, 17F);

		bodyModel[13].addBox(0F, -6F, 0F, 26, 6, 10, 0F); // CR.BackBottomTrack
		bodyModel[13].setRotationPoint(-45F, -7F, 17F);
		bodyModel[13].rotateAngleZ = -0.2268928F;

		bodyModel[14].addBox(0F, 0F, 0F, 5, 5, 50, 0F); // CR.UtilityLog
		bodyModel[14].setRotationPoint(-46F, -6F, -25F);

		bodyModel[15].addBox(0F, 6F, -0.5F, 5, 4, 1, 0F); // CR.LogHolderRight
		bodyModel[15].setRotationPoint(-47F, -10F, 12F);
		bodyModel[15].rotateAngleZ = 0.5235988F;

		bodyModel[16].addBox(0F, 6F, -0.5F, 5, 3, 1, 0F); // CR.LogHolderLeft
		bodyModel[16].setRotationPoint(-47F, -10F, -12F);
		bodyModel[16].rotateAngleZ = 0.5235988F;

		bodyModel[17].addBox(-4F, 0F, 0F, 5, 12, 10, 0F); // CR.LeftTrackFrontTop
		bodyModel[17].setRotationPoint(50F, -11F, -27F);
		bodyModel[17].rotateAngleZ = 1.396263F;

		bodyModel[18].addBox(-12F, 2F, 0F, 13, 6, 10, 0F); // CR.LeftTrackFront
		bodyModel[18].setRotationPoint(60.5F, -11.5F, -27F);
		bodyModel[18].rotateAngleZ = 0.2443461F;

		bodyModel[19].addBox(0F, -8.5F, 0F, 2, 8, 10, 0F); // CR.leftTrackFrontCoverUp
		bodyModel[19].setRotationPoint(50.5F, -1F, -27F);
		bodyModel[19].rotateAngleZ = 0.08726646F;

		bodyModel[20].addBox(0F, 0F, 0F, 70, 11, 10, 0F); // CR.LeftTrackMain
		bodyModel[20].setRotationPoint(-19.5F, -12F, -27F);

		bodyModel[21].addBox(0F, 0F, 0F, 26, 5, 10, 0F); // CR.BackTopTrackLeft
		bodyModel[21].setRotationPoint(-45F, -12F, -27F);

		bodyModel[22].addBox(0F, -6F, 0F, 26, 6, 10, 0F); // CR.BackBottomTrackLeft
		bodyModel[22].setRotationPoint(-45F, -7F, -27F);
		bodyModel[22].rotateAngleZ = -0.2268928F;

		bodyModel[23].addBox(0F, 0F, -14F, 7, 1, 13, 0F); // CR.LeftHull/TrackThing
		bodyModel[23].setRotationPoint(47.5F, -5F, -9F);
		bodyModel[23].rotateAngleX = -0.06981317F;
		bodyModel[23].rotateAngleY = 0.541052F;

		bodyModel[24].addBox(0F, 0F, 0F, 28, 4, 8, 0F); // CR.LeftTrackBumperFront
		bodyModel[24].setRotationPoint(34F, -15.5F, -25.5F);
		bodyModel[24].rotateAngleZ = -0.1919862F;

		bodyModel[25].addBox(0F, 0F, 0F, 28, 4, 8, 0F); // CR.RightTrackBumperFront
		bodyModel[25].setRotationPoint(34F, -15.5F, 17.5F);
		bodyModel[25].rotateAngleZ = -0.1919862F;

		bodyModel[26].addBox(0F, 0F, 0F, 73, 4, 8, 0F); // CR.LeftTrackBumperBody
		bodyModel[26].setRotationPoint(-39F, -15.5F, -25.5F);

		bodyModel[27].addBox(0F, 0F, 0F, 73, 4, 8, 0F); // CR.RightTrackBumperBody
		bodyModel[27].setRotationPoint(-39F, -15.5F, 17.5F);

		bodyModel[28].addBox(0F, 0F, -3F, 8, 8, 6, 0F); // CR.LeftFrontwheel
		bodyModel[28].setRotationPoint(50F, -7.5F, -22F);

		bodyModel[29].addBox(0F, 0F, -3F, 8, 8, 6, 0F); // CR.LeftBackwheel
		bodyModel[29].setRotationPoint(-37F, -8.5F, -22F);

		bodyModel[30].addBox(0F, 0F, -3F, 8, 8, 6, 0F); // CR.RightFrontwheel
		bodyModel[30].setRotationPoint(50F, -7.5F, 22F);

		bodyModel[31].addBox(0F, 0F, -3F, 8, 8, 6, 0F); // CR.RightBackwheel
		bodyModel[31].setRotationPoint(-37F, -8.5F, 22F);

		bodyModel[32].addBox(0F, 0F, 0F, 6, 4, 8, 0F); // CR.LeftBackTrackBumper
		bodyModel[32].setRotationPoint(-44F, -12F, -25.5F);
		bodyModel[32].rotateAngleZ = 0.6320364F;

		bodyModel[33].addBox(0F, 0F, 0F, 6, 4, 8, 0F); // CR.RightBackTrackBumper
		bodyModel[33].setRotationPoint(-44F, -12F, 17.5F);
		bodyModel[33].rotateAngleZ = 0.6320364F;

		bodyModel[34].addBox(0F, 0F, 0F, 1, 5, 3, 0F); // CR.LeftLight
		bodyModel[34].setRotationPoint(50F, -10F, -15F);

		bodyModel[35].addBox(0F, 0F, 0F, 1, 5, 3, 0F); // CR.RightLight
		bodyModel[35].setRotationPoint(50F, -10F, 12F);

		bodyModel[36].addBox(-8F, 0F, -8F, 16, 2, 16, 0F); // CR.TriangleThing
		bodyModel[36].setRotationPoint(38F, -11.8F, 0F);
		bodyModel[36].rotateAngleX = -0.2443461F;
		bodyModel[36].rotateAngleY = -0.7853982F;
		bodyModel[36].rotateAngleZ = -0.2530727F;

		bodyModel[37].addBox(0F, 0F, 0F, 10, 4, 10, 0F); // CR.DriverThingy
		bodyModel[37].setRotationPoint(26F, -15.5F, -5F);

		bodyModel[38].addBox(0F, 0F, 0F, 20, 4, 20, 0F); // CR.Axis
		bodyModel[38].setRotationPoint(-10F, -16F, -10F);



// Turret
		turretModel = new ModelRendererTurbo[9];
		turretModel[0] = new ModelRendererTurbo(this,  890,  400, textureX, textureY); // TR."Turret"1
		turretModel[1] = new ModelRendererTurbo(this,  890,  400, textureX, textureY); // TR."Turret"2
		turretModel[2] = new ModelRendererTurbo(this,  890,  320, textureX, textureY); // TR."Turret"3
		turretModel[3] = new ModelRendererTurbo(this,  890,  320, textureX, textureY); // TR."Turret"4
		turretModel[4] = new ModelRendererTurbo(this,  830,  400, textureX, textureY); // TR.Hatch
		turretModel[5] = new ModelRendererTurbo(this,  800,  370, textureX, textureY); // TR.BackThingLeft
		turretModel[6] = new ModelRendererTurbo(this,  800,  370, textureX, textureY); // TR.BackThingRight
		turretModel[7] = new ModelRendererTurbo(this,  740,  400, textureX, textureY); // TR.BackThingCenter
		turretModel[8] = new ModelRendererTurbo(this,  640,  300, textureX, textureY); // TR.MiddleSupport

		turretModel[0].addBox(-9F, 0F, -18.5F, 18, 4, 37, 0F); // TR."Turret"1
		turretModel[0].setRotationPoint(0F, -19F, 0F);

		turretModel[1].addBox(-9F, 0F, -18.5F, 18, 4, 37, 0F); // TR."Turret"2
		turretModel[1].setRotationPoint(0F, -19F, 0F);
		turretModel[1].rotateAngleY = 1.570796F;

		turretModel[2].addBox(-6.5F, 0F, -19F, 13, 4, 38, 0F); // TR."Turret"3
		turretModel[2].setRotationPoint(0F, -19F, 0F);
		turretModel[2].rotateAngleY = -0.7853982F;

		turretModel[3].addBox(-6.5F, 0F, -19F, 13, 4, 38, 0F); // TR."Turret"4
		turretModel[3].setRotationPoint(0F, -19F, 0F);
		turretModel[3].rotateAngleY = 0.7853982F;

		turretModel[4].addBox(-1F, 0F, -14F, 10, 2, 10, 0F); // TR.Hatch
		turretModel[4].setRotationPoint(0F, -20.5F, 0F);

		turretModel[5].addBox(-26F, 0F, -16F, 28, 4, 6, 0F); // TR.BackThingLeft
		turretModel[5].setRotationPoint(0F, -23F, 0F);
		turretModel[5].rotateAngleZ = -0.3490658F;

		turretModel[6].addBox(-26F, 0F, 10F, 28, 4, 6, 0F); // TR.BackThingRight
		turretModel[6].setRotationPoint(0F, -23F, 0F);
		turretModel[6].rotateAngleZ = -0.3490658F;

		turretModel[7].addBox(-27F, 0F, -10F, 3, 3, 20, 0F); // TR.BackThingCenter
		turretModel[7].setRotationPoint(0F, -24F, 0F);
		turretModel[7].rotateAngleZ = -0.3490658F;

		turretModel[8].addBox(-8F, -30F, -1F, 2, 30, 2, 0F); // TR.MiddleSupport
		turretModel[8].setRotationPoint(0F, -20F, 0F);
		turretModel[8].rotateAngleZ = 0.6320364F;



// Barrel
		barrelModel = new ModelRendererTurbo[3];
		barrelModel[0] = new ModelRendererTurbo(this,  680,  290, textureX, textureY); // BL.RocketBrick
		barrelModel[1] = new ModelRendererTurbo(this,  700,  360, textureX, textureY); // BL.RightSupport
		barrelModel[2] = new ModelRendererTurbo(this,  700,  360, textureX, textureY); // BL.LeftSupport

		barrelModel[0].addBox(8F, -23F, -18F, 58, 14, 36, 0F); // BL.RocketBrick
		barrelModel[0].setRotationPoint(-32.5F, -18.5F, 0F);

		barrelModel[1].addBox(8F, -10F, 15.5F, 28, 4, 2, 0F); // BL.RightSupport
		barrelModel[1].setRotationPoint(-32.5F, -18.5F, 0F);
		barrelModel[1].rotateAngleZ = 0.3490658F;

		barrelModel[2].addBox(8F, -10F, -17.5F, 28, 4, 2, 0F); // BL.LeftSupport
		barrelModel[2].setRotationPoint(-32.5F, -18.5F, 0F);
		barrelModel[2].rotateAngleZ = 0.3490658F;



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
		leftTrackModel[0].setRotationPoint(58F, -8F, -22F);

		leftTrackModel[1].addBox(0F, 0F, -4F, 1, 18, 8, 0F); // LT.TrackFrontBottomCorner
		leftTrackModel[1].setRotationPoint(58.5F, -0.5F, -22F);
		leftTrackModel[1].rotateAngleZ = -1.012291F;

		leftTrackModel[2].addBox(0F, 0F, -4F, 69, 1, 8, 0F); // LT.TrackBottom
		leftTrackModel[2].setRotationPoint(-25F, 9F, -22F);

		leftTrackModel[3].addBox(0F, 0F, -4F, 1, 16, 8, 0F); // LT.TrackBackBottomCorner
		leftTrackModel[3].setRotationPoint(-38F, 0F, -22F);
		leftTrackModel[3].rotateAngleZ = 0.9250245F;

		leftTrackModel[4].addBox(0F, 0F, -4F, 1, 8, 8, 0F); // LT.TrackBack
		leftTrackModel[4].setRotationPoint(-38F, -8F, -22F);

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
		rightTrackModel[0].setRotationPoint(58F, -8F, 22F);

		rightTrackModel[1].addBox(0F, 0F, -4F, 1, 18, 8, 0F); // RT.TrackFrontBottomCorner
		rightTrackModel[1].setRotationPoint(58.5F, -0.5F, 22F);
		rightTrackModel[1].rotateAngleZ = -1.012291F;

		rightTrackModel[2].addBox(0F, 0F, -4F, 69, 1, 8, 0F); // RT.TrackBottom
		rightTrackModel[2].setRotationPoint(-25F, 9F, 22F);

		rightTrackModel[3].addBox(0F, 0F, -4F, 1, 16, 8, 0F); // RT.TrackBackBottomCorner
		rightTrackModel[3].setRotationPoint(-38F, 0F, 22F);
		rightTrackModel[3].rotateAngleZ = 0.9250245F;

		rightTrackModel[4].addBox(0F, 0F, -4F, 1, 8, 8, 0F); // RT.TrackBack
		rightTrackModel[4].setRotationPoint(-38F, -8F, 22F);

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
		translateAll(0, 1/2, 0);
	}
}