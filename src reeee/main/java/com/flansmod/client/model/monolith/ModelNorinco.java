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

public class ModelNorinco extends ModelVehicle
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelNorinco()
	{

// Body
		bodyModel = new ModelRendererTurbo[57];
		bodyModel[0] = new ModelRendererTurbo(this,  0,  970, textureX, textureY); // CR.TopAngle
		bodyModel[1] = new ModelRendererTurbo(this,  0,  900, textureX, textureY); // CR.FrontLowerGlacis
		bodyModel[2] = new ModelRendererTurbo(this,  140,  960, textureX, textureY); // CR.MainBulk
		bodyModel[3] = new ModelRendererTurbo(this,  0,  830, textureX, textureY); // CR.LowerFrontCoverUp
		bodyModel[4] = new ModelRendererTurbo(this,  0,  780, textureX, textureY); // CR.UnderAngleCoveruptop
		bodyModel[5] = new ModelRendererTurbo(this,  0,  720, textureX, textureY); // CR.UnderAngleCoverupBottom
		bodyModel[6] = new ModelRendererTurbo(this,  0,  665, textureX, textureY); // CR.Topcoverup
		bodyModel[7] = new ModelRendererTurbo(this,  0,  620, textureX, textureY); // CR.RightTrackFront
		bodyModel[8] = new ModelRendererTurbo(this,  50,  620, textureX, textureY); // CR.RightTrackFrontTop
		bodyModel[9] = new ModelRendererTurbo(this,  35,  0, textureX, textureY); // CR.RightTrackMain
		bodyModel[10] = new ModelRendererTurbo(this,  0,  540, textureX, textureY); // CR.rightTrackFrontCoverUp
		bodyModel[11] = new ModelRendererTurbo(this,  0,  470, textureX, textureY); // CR.BackMainAngle
		bodyModel[12] = new ModelRendererTurbo(this,  0,  430, textureX, textureY); // CR.BackTopTrack
		bodyModel[13] = new ModelRendererTurbo(this,  0,  400, textureX, textureY); // CR.BackBottomTrackright
		bodyModel[14] = new ModelRendererTurbo(this,  0,  400, textureX, textureY); // CR.BackBottomTrackleft
		bodyModel[15] = new ModelRendererTurbo(this,  0,  330, textureX, textureY); // CR.UtilityLog
		bodyModel[16] = new ModelRendererTurbo(this,  100,  330, textureX, textureY); // CR.LogHolderRight
		bodyModel[17] = new ModelRendererTurbo(this,  100,  330, textureX, textureY); // CR.LogHolderLeft
		bodyModel[18] = new ModelRendererTurbo(this,  50,  620, textureX, textureY); // CR.LeftTrackFrontTop
		bodyModel[19] = new ModelRendererTurbo(this,  0,  620, textureX, textureY); // CR.LeftTrackFront
		bodyModel[20] = new ModelRendererTurbo(this,  0,  540, textureX, textureY); // CR.leftTrackFrontCoverUp
		bodyModel[21] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CR.LeftTrackMain
		bodyModel[22] = new ModelRendererTurbo(this,  0,  430, textureX, textureY); // CR.BackTopTrackLeft
		bodyModel[23] = new ModelRendererTurbo(this,  0,  300, textureX, textureY); // CR.LeftTrackBumperFront
		bodyModel[24] = new ModelRendererTurbo(this,  0,  300, textureX, textureY); // CR.RightTrackBumperFront
		bodyModel[25] = new ModelRendererTurbo(this,  70,  300, textureX, textureY); // CR.LeftTrackBumperBody
		bodyModel[26] = new ModelRendererTurbo(this,  70,  300, textureX, textureY); // CR.RightTrackBumperBody
		bodyModel[27] = new ModelRendererTurbo(this,  500,  980, textureX, textureY); // CR.LeftFrontwheel
		bodyModel[28] = new ModelRendererTurbo(this,  500,  980, textureX, textureY); // CR.LeftBackwheel
		bodyModel[29] = new ModelRendererTurbo(this,  500,  980, textureX, textureY); // CR.RightFrontwheel
		bodyModel[30] = new ModelRendererTurbo(this,  500,  980, textureX, textureY); // CR.RightBackwheel
		bodyModel[31] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CR.LeftBackTrackBumper
		bodyModel[32] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CR.RightBackTrackBumper
		bodyModel[33] = new ModelRendererTurbo(this,  480,  800, textureX, textureY); // CR.LeftLight
		bodyModel[34] = new ModelRendererTurbo(this,  480,  800, textureX, textureY); // CR.RightLight
		bodyModel[35] = new ModelRendererTurbo(this,  430,  800, textureX, textureY); // CR.DriverThingy
		bodyModel[36] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CR.Exhaust
		bodyModel[37] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CR.BackBonusArea
		bodyModel[38] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CR.LowerReactiveArmor
		bodyModel[39] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CR.UpperReactiveArmor
		bodyModel[40] = new ModelRendererTurbo(this,  300,  800, textureX, textureY); // CR.RightExposedFuelTank
		bodyModel[41] = new ModelRendererTurbo(this,  300,  800, textureX, textureY); // CR.LeftExposedFuelTank
		bodyModel[42] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CR.FuelTankconnectorRight
		bodyModel[43] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CR.FuelTankconnectorLeft
		bodyModel[44] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CR.LeftTrackTooth1
		bodyModel[45] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CR.LeftTrackTooth2
		bodyModel[46] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CR.LeftTrackTooth3
		bodyModel[47] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CR.LeftTrackTooth4
		bodyModel[48] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CR.LeftTrackTooth5
		bodyModel[49] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CR.LeftTrackTooth6
		bodyModel[50] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CR.RightTrackTooth1
		bodyModel[51] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CR.RightTrackTooth2
		bodyModel[52] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CR.RightTrackTooth3
		bodyModel[53] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CR.RightTrackTooth4
		bodyModel[54] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CR.RightTrackTooth5
		bodyModel[55] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CR.RightTrackTooth6
		bodyModel[56] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CR.UppestReactiveArmor

		bodyModel[0].addBox(0F, 0F, 0F, 24, 2, 34, 0F); // CR.TopAngle
		bodyModel[0].setRotationPoint(34F, -16F, -17F);
		bodyModel[0].rotateAngleZ = -0.4014257F;

		bodyModel[1].addBox(-2.9F, 0F, 0F, 4, 11, 34, 0F); // CR.FrontLowerGlacis
		bodyModel[1].setRotationPoint(54.5F, -6.2F, -17F);
		bodyModel[1].rotateAngleZ = -0.6632251F;

		bodyModel[2].addBox(0F, 0F, 0F, 70, 19, 34, 0F); // CR.MainBulk
		bodyModel[2].setRotationPoint(-36F, -16F, -17F);

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

		bodyModel[9].addBox(0F, 0F, 0F, 86, 12, 10, 0F); // CR.RightTrackMain
		bodyModel[9].setRotationPoint(-35.5F, -13F, 17F);

		bodyModel[10].addBox(0F, -8.5F, 0F, 11, 8, 10, 0F); // CR.rightTrackFrontCoverUp
		bodyModel[10].setRotationPoint(50.5F, -1F, 17F);
		bodyModel[10].rotateAngleZ = 0.08726646F;

		bodyModel[11].addBox(0F, 0F, 0F, 8, 14, 34, 0F); // CR.BackMainAngle
		bodyModel[11].setRotationPoint(-46F, -7F, -17F);
		bodyModel[11].rotateAngleZ = 0.8164836F;

		bodyModel[12].addBox(0F, 0F, 0F, 26, 6, 10, 0F); // CR.BackTopTrack
		bodyModel[12].setRotationPoint(-45F, -13F, 17F);

		bodyModel[13].addBox(0F, -6F, 0F, 11, 6, 10, 0F); // CR.BackBottomTrackright
		bodyModel[13].setRotationPoint(-45F, -7F, 17F);
		bodyModel[13].rotateAngleZ = -0.5585054F;

		bodyModel[14].addBox(0F, -6F, -27F, 11, 6, 10, 0F); // CR.BackBottomTrackleft
		bodyModel[14].setRotationPoint(-45F, -7F, 0F);
		bodyModel[14].rotateAngleZ = -0.5585054F;

		bodyModel[15].addBox(0F, 0F, 0F, 2, 2, 50, 0F); // CR.UtilityLog
		bodyModel[15].setRotationPoint(-51F, -10F, -25F);

		bodyModel[16].addBox(-4F, 0F, -0.5F, 8, 1, 1, 0F); // CR.LogHolderRight
		bodyModel[16].setRotationPoint(-46F, -9.5F, 12F);

		bodyModel[17].addBox(-4F, 0F, -0.5F, 8, 1, 1, 0F); // CR.LogHolderLeft
		bodyModel[17].setRotationPoint(-46F, -8.5F, -12F);

		bodyModel[18].addBox(-3F, 0F, 0F, 4, 12, 10, 0F); // CR.LeftTrackFrontTop
		bodyModel[18].setRotationPoint(50F, -12F, -27F);
		bodyModel[18].rotateAngleZ = 1.396263F;

		bodyModel[19].addBox(-3F, 2F, 0F, 4, 6, 10, 0F); // CR.LeftTrackFront
		bodyModel[19].setRotationPoint(60F, -12F, -27F);
		bodyModel[19].rotateAngleZ = 0.5235988F;

		bodyModel[20].addBox(0F, -8.5F, 0F, 11, 8, 10, 0F); // CR.leftTrackFrontCoverUp
		bodyModel[20].setRotationPoint(50.5F, -1F, -27F);
		bodyModel[20].rotateAngleZ = 0.1396263F;

		bodyModel[21].addBox(0F, 0F, 0F, 86, 12, 10, 0F); // CR.LeftTrackMain
		bodyModel[21].setRotationPoint(-35.5F, -13F, -27F);

		bodyModel[22].addBox(0F, 0F, 0F, 26, 6, 10, 0F); // CR.BackTopTrackLeft
		bodyModel[22].setRotationPoint(-45F, -13F, -27F);

		bodyModel[23].addBox(0F, 0F, 0F, 14, 4, 9, 0F); // CR.LeftTrackBumperFront
		bodyModel[23].setRotationPoint(34F, -16.5F, -26.5F);
		bodyModel[23].rotateAngleZ = -0.2617994F;

		bodyModel[24].addBox(0F, 0F, 0F, 14, 4, 9, 0F); // CR.RightTrackBumperFront
		bodyModel[24].setRotationPoint(34F, -16.5F, 17.5F);
		bodyModel[24].rotateAngleZ = -0.2617994F;

		bodyModel[25].addBox(0F, 0F, 0F, 73, 4, 9, 0F); // CR.LeftTrackBumperBody
		bodyModel[25].setRotationPoint(-39F, -16.5F, -26.5F);

		bodyModel[26].addBox(0F, 0F, 0F, 73, 4, 9, 0F); // CR.RightTrackBumperBody
		bodyModel[26].setRotationPoint(-39F, -16.5F, 17.5F);

		bodyModel[27].addBox(0F, 0F, -3F, 9, 8, 6, 0F); // CR.LeftFrontwheel
		bodyModel[27].setRotationPoint(49F, -8.5F, -22F);

		bodyModel[28].addBox(0F, 0F, -3F, 8, 8, 6, 0F); // CR.LeftBackwheel
		bodyModel[28].setRotationPoint(-41F, -8.5F, -22F);

		bodyModel[29].addBox(0F, 0F, -3F, 9, 8, 6, 0F); // CR.RightFrontwheel
		bodyModel[29].setRotationPoint(49F, -8.5F, 22F);

		bodyModel[30].addBox(0F, 0F, -3F, 8, 8, 6, 0F); // CR.RightBackwheel
		bodyModel[30].setRotationPoint(-41F, -8.5F, 22F);

		bodyModel[31].addBox(0F, 0F, 0F, 6, 4, 9, 0F); // CR.LeftBackTrackBumper
		bodyModel[31].setRotationPoint(-44F, -13F, -26.5F);
		bodyModel[31].rotateAngleZ = 0.6320364F;

		bodyModel[32].addBox(0F, 0F, 0F, 6, 4, 9, 0F); // CR.RightBackTrackBumper
		bodyModel[32].setRotationPoint(-44F, -13F, 17.5F);
		bodyModel[32].rotateAngleZ = 0.6320364F;

		bodyModel[33].addBox(0F, 0F, 0F, 1, 6, 3, 0F); // CR.LeftLight
		bodyModel[33].setRotationPoint(46F, -14F, -16.5F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 6, 3, 0F); // CR.RightLight
		bodyModel[34].setRotationPoint(46F, -14F, 13.5F);

		bodyModel[35].addBox(0F, 0F, 0F, 2, 3, 10, 0F); // CR.DriverThingy
		bodyModel[35].setRotationPoint(34F, -16.8F, -5F);

		bodyModel[36].addBox(1.5F, 0F, 0F, 5, 9, 34, 0F); // CR.Exhaust
		bodyModel[36].setRotationPoint(-50F, -15F, -17F);
		bodyModel[36].rotateAngleZ = 0.2792527F;

		bodyModel[37].addBox(0F, 0F, 0F, 22, 5, 34, 0F); // CR.BackBonusArea
		bodyModel[37].setRotationPoint(-44F, -17F, -17F);

		bodyModel[38].addBox(20F, -1.8F, 0F, 4, 2, 28, 0F); // CR.LowerReactiveArmor
		bodyModel[38].setRotationPoint(34F, -16F, -14F);
		bodyModel[38].rotateAngleZ = -0.4014257F;

		bodyModel[39].addBox(15F, -1.8F, 0F, 5, 2, 32, 0F); // CR.UpperReactiveArmor
		bodyModel[39].setRotationPoint(34F, -16F, -16F);
		bodyModel[39].rotateAngleZ = -0.4014257F;

		bodyModel[40].addBox(0F, 0F, 0F, 8, 8, 12, 0F); // CR.RightExposedFuelTank
		bodyModel[40].setRotationPoint(-58F, -20F, 3F);

		bodyModel[41].addBox(0F, 0F, 0F, 8, 8, 12, 0F); // CR.LeftExposedFuelTank
		bodyModel[41].setRotationPoint(-58F, -20F, -15F);

		bodyModel[42].addBox(0F, 0F, 0F, 11, 2, 1, 0F); // CR.FuelTankconnectorRight
		bodyModel[42].setRotationPoint(-50F, -14F, 11F);

		bodyModel[43].addBox(0F, 0F, 0F, 11, 2, 1, 0F); // CR.FuelTankconnectorLeft
		bodyModel[43].setRotationPoint(-50F, -15F, -12F);

		bodyModel[44].addBox(0F, 0F, 0F, 9, 9, 1, 0F); // CR.LeftTrackTooth1
		bodyModel[44].setRotationPoint(40F, -7.5F, -27F);
		bodyModel[44].rotateAngleZ = -0.7853982F;

		bodyModel[45].addBox(0F, 0F, 0F, 9, 9, 1, 0F); // CR.LeftTrackTooth2
		bodyModel[45].setRotationPoint(27F, -7.5F, -27F);
		bodyModel[45].rotateAngleZ = -0.7853982F;

		bodyModel[46].addBox(0F, 0F, 0F, 9, 9, 1, 0F); // CR.LeftTrackTooth3
		bodyModel[46].setRotationPoint(14F, -7.5F, -27F);
		bodyModel[46].rotateAngleZ = -0.7853982F;

		bodyModel[47].addBox(0F, 0F, 0F, 9, 9, 1, 0F); // CR.LeftTrackTooth4
		bodyModel[47].setRotationPoint(1F, -7.5F, -27F);
		bodyModel[47].rotateAngleZ = -0.7853982F;

		bodyModel[48].addBox(0F, 0F, 0F, 9, 9, 1, 0F); // CR.LeftTrackTooth5
		bodyModel[48].setRotationPoint(-12F, -7.5F, -27F);
		bodyModel[48].rotateAngleZ = -0.7853982F;

		bodyModel[49].addBox(0F, 0F, 0F, 9, 9, 1, 0F); // CR.LeftTrackTooth6
		bodyModel[49].setRotationPoint(-25F, -7.5F, -27F);
		bodyModel[49].rotateAngleZ = -0.7853982F;

		bodyModel[50].addBox(0F, 0F, 0F, 9, 9, 1, 0F); // CR.RightTrackTooth1
		bodyModel[50].setRotationPoint(40F, -7.5F, 26F);
		bodyModel[50].rotateAngleZ = -0.7853982F;

		bodyModel[51].addBox(0F, 0F, 0F, 9, 9, 1, 0F); // CR.RightTrackTooth2
		bodyModel[51].setRotationPoint(27F, -7.5F, 26F);
		bodyModel[51].rotateAngleZ = -0.7853982F;

		bodyModel[52].addBox(0F, 0F, 0F, 9, 9, 1, 0F); // CR.RightTrackTooth3
		bodyModel[52].setRotationPoint(14F, -7.5F, 26F);
		bodyModel[52].rotateAngleZ = -0.7853982F;

		bodyModel[53].addBox(0F, 0F, 0F, 9, 9, 1, 0F); // CR.RightTrackTooth4
		bodyModel[53].setRotationPoint(1F, -7.5F, 26F);
		bodyModel[53].rotateAngleZ = -0.7853982F;

		bodyModel[54].addBox(0F, 0F, 0F, 9, 9, 1, 0F); // CR.RightTrackTooth5
		bodyModel[54].setRotationPoint(-12F, -7.5F, 26F);
		bodyModel[54].rotateAngleZ = -0.7853982F;

		bodyModel[55].addBox(0F, 0F, 0F, 9, 9, 1, 0F); // CR.RightTrackTooth6
		bodyModel[55].setRotationPoint(-25F, -7.5F, 26F);
		bodyModel[55].rotateAngleZ = -0.7853982F;

		bodyModel[56].addBox(5F, -1F, 0F, 10, 2, 26, 0F); // CR.UppestReactiveArmor
		bodyModel[56].setRotationPoint(34F, -16F, -13F);
		bodyModel[56].rotateAngleZ = -0.2792527F;



// Turret
		turretModel = new ModelRendererTurbo[30];
		turretModel[0] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // TR.CenterOctoganLeft
		turretModel[1] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // TR.CenterOctoganRight
		turretModel[2] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // TR.BackOctoganRight
		turretModel[3] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // TR.BackOctoganLeft
		turretModel[4] = new ModelRendererTurbo(this,  300,  750, textureX, textureY); // TR.CenterFrontOctoganLeft
		turretModel[5] = new ModelRendererTurbo(this,  300,  750, textureX, textureY); // TR.CenterFrontOctoganLeft
		turretModel[6] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // TR.FrontLeft
		turretModel[7] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // TR.FrontRight
		turretModel[8] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // TR.BarrelBase
		turretModel[9] = new ModelRendererTurbo(this,  300,  590, textureX, textureY); // TR.Camera
		turretModel[10] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // TR.Commanderhatch
		turretModel[11] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // TR.OtherHatch
		turretModel[12] = new ModelRendererTurbo(this,  300,  620, textureX, textureY); // TR.TurretLight
		turretModel[13] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // TR.MGStick
		turretModel[14] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // TR.TopReactiveArmor
		turretModel[15] = new ModelRendererTurbo(this,  800,  400, textureX, textureY); // TR.Antenna
		turretModel[16] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // TR.RightFrontCheeck
		turretModel[17] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // TR.LeftFrontCheeck
		turretModel[18] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // TR.LeftCrappyConversion
		turretModel[19] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // TR.RightCrappyConversion
		turretModel[20] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // TR.BackActualTurret
		turretModel[21] = new ModelRendererTurbo(this,  300,  660, textureX, textureY); // TR.LeftSpacedArmor
		turretModel[22] = new ModelRendererTurbo(this,  300,  660, textureX, textureY); // TR.RightSpacedArmor
		turretModel[23] = new ModelRendererTurbo(this,  300,  500, textureX, textureY); // TR.ExtrernalFueltank
		turretModel[24] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // TR.SpacedArmorBack
		turretModel[25] = new ModelRendererTurbo(this,  300,  540, textureX, textureY); // TR.Drive-throughspeaker
		turretModel[26] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // TR.SpeakerHoldup
		turretModel[27] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // TR.TeletubbyFrequencer
		turretModel[28] = new ModelRendererTurbo(this,  300,  700, textureX, textureY); // TR.GrenadesLeft
		turretModel[29] = new ModelRendererTurbo(this,  300,  700, textureX, textureY); // TR.GrenadesRight

		turretModel[0].addBox(-25F, 0F, -20.5F, 33, 8, 18, 0F); // TR.CenterOctoganLeft
		turretModel[0].setRotationPoint(0F, -26F, 0F);
		turretModel[0].rotateAngleY = -0.2617994F;

		turretModel[1].addBox(-25F, 0F, 2.5F, 33, 8, 18, 0F); // TR.CenterOctoganRight
		turretModel[1].setRotationPoint(0F, -26F, 0F);
		turretModel[1].rotateAngleY = 0.2617994F;

		turretModel[2].addBox(-12.5F, 0F, -3F, 17, 11, 12, 0F); // TR.BackOctoganRight
		turretModel[2].setRotationPoint(0F, -27F, 0F);
		turretModel[2].rotateAngleY = -0.2094395F;

		turretModel[3].addBox(-12.5F, 0F, -9F, 17, 11, 12, 0F); // TR.BackOctoganLeft
		turretModel[3].setRotationPoint(0F, -27F, 0F);
		turretModel[3].rotateAngleY = 0.2094395F;

		turretModel[4].addBox(0F, 0F, -22F, 15, 10, 18, 0F); // TR.CenterFrontOctoganLeft
		turretModel[4].setRotationPoint(0F, -26F, 0F);
		turretModel[4].rotateAngleY = 0.08726646F;

		turretModel[5].addBox(0F, 0F, 4F, 15, 10, 18, 0F); // TR.CenterFrontOctoganLeft
		turretModel[5].setRotationPoint(0F, -26F, 0F);
		turretModel[5].rotateAngleY = -0.08726646F;

		turretModel[6].addBox(4F, 0F, -10F, 19, 9, 18, 0F); // TR.FrontLeft
		turretModel[6].setRotationPoint(0F, -25F, 0F);
		turretModel[6].rotateAngleY = -0.5235988F;

		turretModel[7].addBox(4F, 0F, -8F, 19, 9, 18, 0F); // TR.FrontRight
		turretModel[7].setRotationPoint(0F, -25F, 0F);
		turretModel[7].rotateAngleY = 0.5235988F;

		turretModel[8].addBox(18F, -26F, -4F, 5, 8, 8, 0F); // TR.BarrelBase
		turretModel[8].setRotationPoint(0F, 1.5F, 0F);

		turretModel[9].addBox(0F, 0F, 6F, 4, 4, 7, 0F); // TR.Camera
		turretModel[9].setRotationPoint(0F, -29.5F, 0F);

		turretModel[10].addBox(-12F, 0F, -14F, 12, 4, 12, 0F); // TR.Commanderhatch
		turretModel[10].setRotationPoint(0F, -28.5F, 0F);

		turretModel[11].addBox(-8F, 0F, 2F, 8, 3, 12, 0F); // TR.OtherHatch
		turretModel[11].setRotationPoint(0F, -28F, 0F);

		turretModel[12].addBox(6F, 0F, -13F, 3, 5, 4, 0F); // TR.TurretLight
		turretModel[12].setRotationPoint(0F, -31F, 0F);

		turretModel[13].addBox(2F, 0F, -13F, 1, 9, 1, 0F); // TR.MGStick
		turretModel[13].setRotationPoint(0F, -34F, 0F);

		turretModel[14].addBox(0F, 0F, -13F, 19, 2, 26, 0F); // TR.TopReactiveArmor
		turretModel[14].setRotationPoint(0F, -27.5F, 0F);
		turretModel[14].rotateAngleZ = -0.06981317F;

		turretModel[15].addBox(-14F, 0F, -14F, 1, 40, 1, 0F); // TR.Antenna
		turretModel[15].setRotationPoint(0F, -60F, 0F);

		turretModel[16].addBox(33F, 0F, -8F, 6, 6, 17, 0F); // TR.RightFrontCheeck
		turretModel[16].setRotationPoint(0F, -48F, 0F);
		turretModel[16].rotateAngleY = 0.5235988F;
		turretModel[16].rotateAngleZ = -0.7853982F;

		turretModel[17].addBox(33F, 0F, -9F, 6, 6, 17, 0F); // TR.LeftFrontCheeck
		turretModel[17].setRotationPoint(0F, -48F, 0F);
		turretModel[17].rotateAngleY = -0.5235988F;
		turretModel[17].rotateAngleZ = -0.7853982F;

		turretModel[18].addBox(20.8F, 0F, -20.5F, 6, 6, 4, 0F); // TR.LeftCrappyConversion
		turretModel[18].setRotationPoint(0F, -39.5F, 0F);
		turretModel[18].rotateAngleZ = -0.7853982F;

		turretModel[19].addBox(20.8F, 0F, 16.5F, 6, 6, 4, 0F); // TR.RightCrappyConversion
		turretModel[19].setRotationPoint(0F, -39.5F, 0F);
		turretModel[19].rotateAngleZ = -0.7853982F;

		turretModel[20].addBox(-29.5F, 0F, -13F, 4, 8, 26, 0F); // TR.BackActualTurret
		turretModel[20].setRotationPoint(0F, -26F, 0F);

		turretModel[21].addBox(-31F, 0F, -24F, 28, 6, 4, 0F); // TR.LeftSpacedArmor
		turretModel[21].setRotationPoint(0F, -25F, 0F);
		turretModel[21].rotateAngleZ = -0.03490658F;

		turretModel[22].addBox(-31F, 0F, 20F, 28, 6, 4, 0F); // TR.RightSpacedArmor
		turretModel[22].setRotationPoint(0F, -25F, 0F);
		turretModel[22].rotateAngleZ = -0.03490658F;

		turretModel[23].addBox(-35F, 0F, -18F, 4, 4, 22, 0F); // TR.ExtrernalFueltank
		turretModel[23].setRotationPoint(0F, -26F, 0F);

		turretModel[24].addBox(-31F, 0F, -20F, 1, 6, 40, 0F); // TR.SpacedArmorBack
		turretModel[24].setRotationPoint(0F, -26F, 0F);

		turretModel[25].addBox(-14F, 0F, 5.5F, 6, 4, 8, 0F); // TR.Drive-throughspeaker
		turretModel[25].setRotationPoint(0F, -34F, 0F);

		turretModel[26].addBox(-12F, 0F, 8.5F, 2, 4, 2, 0F); // TR.SpeakerHoldup
		turretModel[26].setRotationPoint(0F, -30F, 0F);

		turretModel[27].addBox(-20F, 0F, -9F, 3, 10, 3, 0F); // TR.TeletubbyFrequencer
		turretModel[27].setRotationPoint(0F, -36F, 0F);

		turretModel[28].addBox(-1F, -2F, -25F, 4, 6, 3, 0F); // TR.GrenadesLeft
		turretModel[28].setRotationPoint(0F, -22F, 0F);
		turretModel[28].rotateAngleZ = 0.2617994F;

		turretModel[29].addBox(-1F, -2F, 22F, 4, 6, 3, 0F); // TR.GrenadesRight
		turretModel[29].setRotationPoint(0F, -22F, 0F);
		turretModel[29].rotateAngleZ = 0.2617994F;



// Barrel
		barrelModel = new ModelRendererTurbo[10];
		barrelModel[0] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // BL.BarrelBase
		barrelModel[1] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // BL.MainBarrel
		barrelModel[2] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // BL.WormThing
		barrelModel[3] = new ModelRendererTurbo(this,  800,  750, textureX, textureY); // BL.TipofGun
		barrelModel[4] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // BL.GunHolder
		barrelModel[5] = new ModelRendererTurbo(this,  800,  600, textureX, textureY); // BL.MainGunBody
		barrelModel[6] = new ModelRendererTurbo(this,  800,  700, textureX, textureY); // BL.MGHandGuard
		barrelModel[7] = new ModelRendererTurbo(this,  800,  680, textureX, textureY); // BL.MGBarrel
		barrelModel[8] = new ModelRendererTurbo(this,  850,  680, textureX, textureY); // BL.MGsight
		barrelModel[9] = new ModelRendererTurbo(this,  800,  560, textureX, textureY); // BL.AmmoBox

		barrelModel[0].addBox(3F, -3.5F, -3.5F, 5, 7, 7, 0F); // BL.BarrelBase
		barrelModel[0].setRotationPoint(18F, -20.5F, 0F);

		barrelModel[1].addBox(6F, -2F, -2F, 94, 4, 4, 0F); // BL.MainBarrel
		barrelModel[1].setRotationPoint(18F, -20.5F, 0F);

		barrelModel[2].addBox(50F, -2.5F, -2.5F, 20, 5, 5, 0F); // BL.WormThing
		barrelModel[2].setRotationPoint(18F, -20.5F, 0F);

		barrelModel[3].addBox(100F, -1.5F, -1.5F, 1, 3, 3, 0F); // BL.TipofGun
		barrelModel[3].setRotationPoint(18F, -20.5F, 0F);

		barrelModel[4].addBox(-1F, 0F, -1.5F, 8, 1, 3, 0F); // BL.GunHolder
		barrelModel[4].setRotationPoint(-1.5F, -34F, -12.5F);

		barrelModel[5].addBox(-2F, -3F, -1F, 10, 3, 2, 0F); // BL.MainGunBody
		barrelModel[5].setRotationPoint(-1.5F, -34F, -12.5F);

		barrelModel[6].addBox(8F, -2.7F, -0.5F, 10, 2, 1, 0F); // BL.MGHandGuard
		barrelModel[6].setRotationPoint(-1.5F, -34F, -12.5F);

		barrelModel[7].addBox(18F, -2.7F, -.5F, 10, 1, 1, 0F); // BL.MGBarrel
		barrelModel[7].setRotationPoint(-1.5F, -34F, -12.5F);

		barrelModel[8].addBox(24F, -4.5F, -.5F, 1, 2, 1, 0F); // BL.MGsight
		barrelModel[8].setRotationPoint(-1.5F, -34F, -12.5F);

		barrelModel[9].addBox(4F, -2F, 1F, 2, 4, 5, 0F); // BL.AmmoBox
		barrelModel[9].setRotationPoint(-1.5F, -34F, -12.5F);



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
		rightTrackModel[0].setRotationPoint(58F, -8F, 22F);

		rightTrackModel[1].addBox(0F, 0F, -4F, 1, 18, 8, 0F); // RT.TrackFrontBottomCorner
		rightTrackModel[1].setRotationPoint(58.5F, -0.5F, 22F);
		rightTrackModel[1].rotateAngleZ = -1.012291F;

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