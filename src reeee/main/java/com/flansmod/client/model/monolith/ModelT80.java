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

public class ModelT80 extends ModelVehicle
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelT80()
	{

// Body
		bodyModel = new ModelRendererTurbo[47];
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
		bodyModel[35] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CR.BeardArmor
		bodyModel[36] = new ModelRendererTurbo(this,  430,  800, textureX, textureY); // CR.DriverThingy
		bodyModel[37] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CR.Exhaust
		bodyModel[38] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CR.BackBonusArea
		bodyModel[39] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CR.LowerReactiveArmor
		bodyModel[40] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CR.UpperReactiveArmor
		bodyModel[41] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CR.RightExposedFuelTank
		bodyModel[42] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CR.LeftExposedFuelTank
		bodyModel[43] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CR.FuelTankconnectorRight
		bodyModel[44] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CR.FuelTankconnectorLeft
		bodyModel[45] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CR.BonusSideArmorLeft
		bodyModel[46] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CR.BonusSideArmorRight

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

		bodyModel[11].addBox(0F, 0F, 0F, 8, 18, 34, 0F); // CR.BackMainAngle
		bodyModel[11].setRotationPoint(-46F, -12F, -17F);
		bodyModel[11].rotateAngleZ = 0.5934119F;

		bodyModel[12].addBox(0F, 0F, 0F, 26, 6, 10, 0F); // CR.BackTopTrack
		bodyModel[12].setRotationPoint(-45F, -13F, 17F);

		bodyModel[13].addBox(0F, -6F, 0F, 11, 6, 10, 0F); // CR.BackBottomTrackright
		bodyModel[13].setRotationPoint(-45F, -7F, 17F);
		bodyModel[13].rotateAngleZ = -0.5585054F;

		bodyModel[14].addBox(0F, -6F, -27F, 11, 6, 10, 0F); // CR.BackBottomTrackleft
		bodyModel[14].setRotationPoint(-45F, -7F, 0F);
		bodyModel[14].rotateAngleZ = -0.5585054F;

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

		bodyModel[33].addBox(0F, 0F, 0F, 1, 5, 3, 0F); // CR.LeftLight
		bodyModel[33].setRotationPoint(48F, -13F, -15F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 5, 3, 0F); // CR.RightLight
		bodyModel[34].setRotationPoint(48F, -13F, 12F);

		bodyModel[35].addBox(-1.7F, -1F, 0F, 0, 8, 32, 0F); // CR.BeardArmor
		bodyModel[35].setRotationPoint(57F, -3F, -16F);
		bodyModel[35].rotateAngleZ = -0.2094395F;

		bodyModel[36].addBox(0F, 0F, 0F, 5, 3, 10, 0F); // CR.DriverThingy
		bodyModel[36].setRotationPoint(34F, -15.8F, -5F);

		bodyModel[37].addBox(0F, 0F, 0F, 12, 5, 16, 0F); // CR.Exhaust
		bodyModel[37].setRotationPoint(-50F, -16F, -8F);

		bodyModel[38].addBox(0F, 0F, 0F, 22, 5, 32, 0F); // CR.BackBonusArea
		bodyModel[38].setRotationPoint(-44F, -17F, -16F);

		bodyModel[39].addBox(16F, -0.8F, 0F, 6, 1, 16, 0F); // CR.LowerReactiveArmor
		bodyModel[39].setRotationPoint(34F, -16F, -8F);
		bodyModel[39].rotateAngleZ = -0.4014257F;

		bodyModel[40].addBox(7F, -0.8F, 0F, 6, 1, 28, 0F); // CR.UpperReactiveArmor
		bodyModel[40].setRotationPoint(34F, -16F, -14F);
		bodyModel[40].rotateAngleZ = -0.4014257F;

		bodyModel[41].addBox(0F, 0F, 0F, 8, 8, 12, 0F); // CR.RightExposedFuelTank
		bodyModel[41].setRotationPoint(-52F, -24F, 16F);

		bodyModel[42].addBox(0F, 0F, 0F, 8, 8, 12, 0F); // CR.LeftExposedFuelTank
		bodyModel[42].setRotationPoint(-52F, -24F, -28F);

		bodyModel[43].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // CR.FuelTankconnectorRight
		bodyModel[43].setRotationPoint(-50F, -16F, 25F);

		bodyModel[44].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // CR.FuelTankconnectorLeft
		bodyModel[44].setRotationPoint(-50F, -16F, -26F);

		bodyModel[45].addBox(0F, 0F, 0F, 36, 14, 1, 0F); // CR.BonusSideArmorLeft
		bodyModel[45].setRotationPoint(9F, -14F, -28F);

		bodyModel[46].addBox(0F, 0F, 0F, 36, 14, 1, 0F); // CR.BonusSideArmorRight
		bodyModel[46].setRotationPoint(9F, -14F, 27F);



// Turret
		turretModel = new ModelRendererTurbo[25];
		turretModel[0] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // TR.CenterOctoganLeft
		turretModel[1] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // TR.CenterOctoganRight
		turretModel[2] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // TR.BackOctoganRight
		turretModel[3] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // TR.BackOctoganLeft
		turretModel[4] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // TR.CenterFrontOctoganLeft
		turretModel[5] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // TR.CenterFrontOctoganLeft
		turretModel[6] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // TR.FrontLeft
		turretModel[7] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // TR.FrontRight
		turretModel[8] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // TR.BarrelBase
		turretModel[9] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // TR.TopLeftArmor
		turretModel[10] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // TR.TopRightArmor
		turretModel[11] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // TR.FrontLeftArmor
		turretModel[12] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // TR.FrontRightArmor
		turretModel[13] = new ModelRendererTurbo(this,  800,  800, textureX, textureY); // TR.Camera
		turretModel[14] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // TR.Commanderhatch
		turretModel[15] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // TR.OtherHatch
		turretModel[16] = new ModelRendererTurbo(this,  480,  800, textureX, textureY); // TR.TurretLight
		turretModel[17] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // TR.WeirdThing
		turretModel[18] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // TR.MassiveExposedFuelTank
		turretModel[19] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // TR.WeirdBoxLeft
		turretModel[20] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // TR.WeirdBoxLeft
		turretModel[21] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // TR.WeirdUnderThingy
		turretModel[22] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // TR.MGStick
		turretModel[23] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // TR.TopReactiveArmor
		turretModel[24] = new ModelRendererTurbo(this,  800,  400, textureX, textureY); // Shape1

		turretModel[0].addBox(-10F, 0F, -18F, 17, 11, 18, 0F); // TR.CenterOctoganLeft
		turretModel[0].setRotationPoint(0F, -27F, 0F);
		turretModel[0].rotateAngleY = -0.4363323F;

		turretModel[1].addBox(-10F, 0F, 0F, 17, 11, 18, 0F); // TR.CenterOctoganRight
		turretModel[1].setRotationPoint(0F, -27F, 0F);
		turretModel[1].rotateAngleY = 0.4363323F;

		turretModel[2].addBox(-19.5F, 0F, -4F, 17, 11, 12, 0F); // TR.BackOctoganRight
		turretModel[2].setRotationPoint(0F, -27F, 0F);
		turretModel[2].rotateAngleY = -0.2094395F;

		turretModel[3].addBox(-19.5F, 0F, -8F, 17, 11, 12, 0F); // TR.BackOctoganLeft
		turretModel[3].setRotationPoint(0F, -27F, 0F);
		turretModel[3].rotateAngleY = 0.2094395F;

		turretModel[4].addBox(-6.5F, 0F, -18F, 20, 10, 18, 0F); // TR.CenterFrontOctoganLeft
		turretModel[4].setRotationPoint(0F, -26F, 0F);
		turretModel[4].rotateAngleY = 0.296706F;

		turretModel[5].addBox(-6.5F, 0F, 0F, 20, 10, 18, 0F); // TR.CenterFrontOctoganLeft
		turretModel[5].setRotationPoint(0F, -26F, 0F);
		turretModel[5].rotateAngleY = -0.296706F;

		turretModel[6].addBox(4F, 0F, -9F, 17, 9, 14, 0F); // TR.FrontLeft
		turretModel[6].setRotationPoint(0F, -25F, 0F);
		turretModel[6].rotateAngleY = -0.2094395F;

		turretModel[7].addBox(4F, 0F, -5F, 17, 9, 14, 0F); // TR.FrontRight
		turretModel[7].setRotationPoint(0F, -25F, 0F);
		turretModel[7].rotateAngleY = 0.2094395F;

		turretModel[8].addBox(20F, -26F, -4F, 3, 8, 8, 0F); // TR.BarrelBase
		turretModel[8].setRotationPoint(0F, 1.5F, 0F);

		turretModel[9].addBox(-10F, 0F, -24F, 23, 8, 4, 0F); // TR.TopLeftArmor
		turretModel[9].setRotationPoint(0F, -10F, 0F);
		turretModel[9].rotateAngleX = -0.6632251F;
		turretModel[9].rotateAngleY = 0.3490658F;

		turretModel[10].addBox(-10F, -8F, 26F, 23, 8, 4, 0F); // TR.TopRightArmor
		turretModel[10].setRotationPoint(0F, 0F, 0F);
		turretModel[10].rotateAngleX = 0.6632251F;
		turretModel[10].rotateAngleY = -0.3490658F;

		turretModel[11].addBox(-5F, 2F, -26F, 8, 8, 4, 0F); // TR.FrontLeftArmor
		turretModel[11].setRotationPoint(0F, -10F, 0F);
		turretModel[11].rotateAngleX = -0.6632251F;
		turretModel[11].rotateAngleY = 1.186824F;

		turretModel[12].addBox(-5F, 1F, 23F, 8, 8, 4, 0F); // TR.FrontRightArmor
		turretModel[12].setRotationPoint(0F, -8.5F, 0F);
		turretModel[12].rotateAngleX = 0.6632251F;
		turretModel[12].rotateAngleY = -1.186824F;

		turretModel[13].addBox(10F, 0F, 6F, 6, 4, 4, 0F); // TR.Camera
		turretModel[13].setRotationPoint(0F, -28.5F, 0F);
		turretModel[13].rotateAngleZ = 0.08726646F;

		turretModel[14].addBox(-12F, 0F, -14F, 16, 4, 14, 0F); // TR.Commanderhatch
		turretModel[14].setRotationPoint(0F, -28.5F, 0F);

		turretModel[15].addBox(-8F, 0F, 2F, 8, 3, 12, 0F); // TR.OtherHatch
		turretModel[15].setRotationPoint(0F, -28F, 0F);

		turretModel[16].addBox(6F, 0F, 10F, 1, 5, 3, 0F); // TR.TurretLight
		turretModel[16].setRotationPoint(0F, -29F, 0F);

		turretModel[17].addBox(-26F, 0F, -10F, 7, 6, 20, 0F); // TR.WeirdThing
		turretModel[17].setRotationPoint(0F, -24.5F, 0F);

		turretModel[18].addBox(-33F, 0F, -23F, 7, 7, 46, 0F); // TR.MassiveExposedFuelTank
		turretModel[18].setRotationPoint(0F, -28F, 0F);

		turretModel[19].addBox(-12F, 0F, -22F, 13, 6, 4, 0F); // TR.WeirdBoxLeft
		turretModel[19].setRotationPoint(0F, -26F, 0F);
		turretModel[19].rotateAngleY = -0.3490658F;

		turretModel[20].addBox(-12F, 0F, 18F, 13, 6, 4, 0F); // TR.WeirdBoxLeft
		turretModel[20].setRotationPoint(0F, -26F, 0F);
		turretModel[20].rotateAngleY = 0.3490658F;

		turretModel[21].addBox(-27F, 0F, -19F, 6, 3, 38, 0F); // TR.WeirdUnderThingy
		turretModel[21].setRotationPoint(0F, -20.5F, 0F);

		turretModel[22].addBox(5F, 0F, -13F, 1, 7, 1, 0F); // TR.MGStick
		turretModel[22].setRotationPoint(0F, -32F, 0F);

		turretModel[23].addBox(5F, 0F, -5F, 16, 1, 10, 0F); // TR.TopReactiveArmor
		turretModel[23].setRotationPoint(0F, -27.5F, 0F);
		turretModel[23].rotateAngleZ = -0.06981317F;

		turretModel[24].addBox(-17F, 0F, -7F, 1, 60, 1, 0F); // Shape1
		turretModel[24].setRotationPoint(0F, -60F, 0F);



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

		barrelModel[1].addBox(6F, -2F, -2F, 85, 4, 4, 0F); // BL.MainBarrel
		barrelModel[1].setRotationPoint(18F, -20.5F, 0F);

		barrelModel[2].addBox(44F, -2.5F, -2.5F, 20, 5, 5, 0F); // BL.WormThing
		barrelModel[2].setRotationPoint(18F, -20.5F, 0F);

		barrelModel[3].addBox(91F, -1.5F, -1.5F, 1, 3, 3, 0F); // BL.TipofGun
		barrelModel[3].setRotationPoint(18F, -20.5F, 0F);

		barrelModel[4].addBox(-1F, 0F, -1.5F, 8, 1, 3, 0F); // BL.GunHolder
		barrelModel[4].setRotationPoint(5.5F, -32F, -12.5F);

		barrelModel[5].addBox(-2F, -3F, -1F, 10, 3, 2, 0F); // BL.MainGunBody
		barrelModel[5].setRotationPoint(5.5F, -32F, -12.5F);

		barrelModel[6].addBox(8F, -2.7F, -0.5F, 10, 2, 1, 0F); // BL.MGHandGuard
		barrelModel[6].setRotationPoint(5.5F, -32F, -12.5F);

		barrelModel[7].addBox(18F, -2.7F, -.5F, 10, 1, 1, 0F); // BL.MGBarrel
		barrelModel[7].setRotationPoint(5.5F, -32F, -12.5F);

		barrelModel[8].addBox(24F, -4.5F, -.5F, 1, 2, 1, 0F); // BL.MGsight
		barrelModel[8].setRotationPoint(5.5F, -32F, -12.5F);

		barrelModel[9].addBox(4F, -2F, -6F, 2, 4, 5, 0F); // BL.AmmoBox
		barrelModel[9].setRotationPoint(5.5F, -32F, -12.5F);



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