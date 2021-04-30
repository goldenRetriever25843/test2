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

public class ModelType10 extends ModelVehicle
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelType10()
	{

// Body
		bodyModel = new ModelRendererTurbo[33];
		bodyModel[0] = new ModelRendererTurbo(this,  550,  0, textureX, textureY); // CR.RightFakeNoseAngle
		bodyModel[1] = new ModelRendererTurbo(this,  550,  30, textureX, textureY); // CR.RightBackNoseAngle
		bodyModel[2] = new ModelRendererTurbo(this,  550,  70, textureX, textureY); // CR.RightNoseBridgeAngle
		bodyModel[3] = new ModelRendererTurbo(this,  550,  100, textureX, textureY); // CR.RightTopFrontAngle
		bodyModel[4] = new ModelRendererTurbo(this,  550,  130, textureX, textureY); // CR.RightUpperSidePlate
		bodyModel[5] = new ModelRendererTurbo(this,  550,  0, textureX, textureY); // CR.LeftFakeNoseAngle
		bodyModel[6] = new ModelRendererTurbo(this,  550,  30, textureX, textureY); // CR.LeftBackNoseAngle
		bodyModel[7] = new ModelRendererTurbo(this,  550,  70, textureX, textureY); // CR.LeftNoseBridgeAngle
		bodyModel[8] = new ModelRendererTurbo(this,  550,  100, textureX, textureY); // CR.LeftTopFrontAngle
		bodyModel[9] = new ModelRendererTurbo(this,  550,  130, textureX, textureY); // CR.LeftUpperSidePlate
		bodyModel[10] = new ModelRendererTurbo(this,  550,  150, textureX, textureY); // CR.Core
		bodyModel[11] = new ModelRendererTurbo(this,  550,  230, textureX, textureY); // CR.FrontAngle
		bodyModel[12] = new ModelRendererTurbo(this,  650,  230, textureX, textureY); // CR.NoseAngle
		bodyModel[13] = new ModelRendererTurbo(this,  550,  290, textureX, textureY); // CR.BackCore
		bodyModel[14] = new ModelRendererTurbo(this,  550,  370, textureX, textureY); // CR.LowerCore
		bodyModel[15] = new ModelRendererTurbo(this,  550,  430, textureX, textureY); // CR.LowerBackCore
		bodyModel[16] = new ModelRendererTurbo(this,  680,  430, textureX, textureY); // CR.ExhaustPort
		bodyModel[17] = new ModelRendererTurbo(this,  550,  480, textureX, textureY); // CR.RightForwardAngle
		bodyModel[18] = new ModelRendererTurbo(this,  550,  480, textureX, textureY); // CR.LeftForwardAngle
		bodyModel[19] = new ModelRendererTurbo(this,  590,  480, textureX, textureY); // CR.MudflapRight
		bodyModel[20] = new ModelRendererTurbo(this,  590,  480, textureX, textureY); // CR.MudflapLeft
		bodyModel[21] = new ModelRendererTurbo(this,  650,  480, textureX, textureY); // CR.MiniExhaustRight
		bodyModel[22] = new ModelRendererTurbo(this,  650,  480, textureX, textureY); // CR.MiniExhaustLeft
		bodyModel[23] = new ModelRendererTurbo(this,  680,  480, textureX, textureY); // CR.RightLight
		bodyModel[24] = new ModelRendererTurbo(this,  550,  520, textureX, textureY); // CR.UnderTurret
		bodyModel[25] = new ModelRendererTurbo(this,  550,  570, textureX, textureY); // CR.LeftLowerSidePlate
		bodyModel[26] = new ModelRendererTurbo(this,  680,  530, textureX, textureY); // CR.FrontWheelRight
		bodyModel[27] = new ModelRendererTurbo(this,  680,  530, textureX, textureY); // CR.BackWheelRight
		bodyModel[28] = new ModelRendererTurbo(this,  680,  530, textureX, textureY); // CR.FrontWheelLeft
		bodyModel[29] = new ModelRendererTurbo(this,  680,  530, textureX, textureY); // CR.BackWheelRight
		bodyModel[30] = new ModelRendererTurbo(this,  550,  600, textureX, textureY); // CR.Computerthingy?
		bodyModel[31] = new ModelRendererTurbo(this,  550,  570, textureX, textureY); // CR.RightLowerSidePlate
		bodyModel[32] = new ModelRendererTurbo(this,  680,  480, textureX, textureY); // CR.LeftLight

		bodyModel[0].addBox(0F, 0F, 0F, 9, 1, 10, 0F); // CR.RightFakeNoseAngle
		bodyModel[0].setRotationPoint(44F, -11.5F, 16F);
		bodyModel[0].rotateAngleZ = -0.09075712F;

		bodyModel[1].addBox(0F, 0F, 0F, 8, 5, 10, 0F); // CR.RightBackNoseAngle
		bodyModel[1].setRotationPoint(25F, -16F, 16F);
		bodyModel[1].rotateAngleZ = -0.4363323F;

		bodyModel[2].addBox(0F, 0F, 0F, 15, 3, 10, 0F); // CR.RightNoseBridgeAngle
		bodyModel[2].setRotationPoint(30F, -13.5F, 16F);
		bodyModel[2].rotateAngleZ = -0.1396263F;

		bodyModel[3].addBox(0F, 0F, 0F, 8, 4, 10, 0F); // CR.RightTopFrontAngle
		bodyModel[3].setRotationPoint(53F, -10.6F, 16F);
		bodyModel[3].rotateAngleZ = -0.4363323F;

		bodyModel[4].addBox(0F, 0F, 0F, 103, 9, 1, 0F); // CR.RightUpperSidePlate
		bodyModel[4].setRotationPoint(-50F, -11F, 26F);

		bodyModel[5].addBox(0F, 0F, 0F, 9, 1, 10, 0F); // CR.LeftFakeNoseAngle
		bodyModel[5].setRotationPoint(44F, -11.5F, -26F);
		bodyModel[5].rotateAngleZ = -0.09075712F;

		bodyModel[6].addBox(0F, 0F, 0F, 8, 5, 10, 0F); // CR.LeftBackNoseAngle
		bodyModel[6].setRotationPoint(25F, -16F, -26F);
		bodyModel[6].rotateAngleZ = -0.4363323F;

		bodyModel[7].addBox(0F, 0F, 0F, 15, 3, 10, 0F); // CR.LeftNoseBridgeAngle
		bodyModel[7].setRotationPoint(30F, -13.5F, -26F);
		bodyModel[7].rotateAngleZ = -0.1396263F;

		bodyModel[8].addBox(0F, 0F, 0F, 8, 4, 10, 0F); // CR.LeftTopFrontAngle
		bodyModel[8].setRotationPoint(53F, -10.6F, -26F);
		bodyModel[8].rotateAngleZ = -0.4363323F;

		bodyModel[9].addBox(0F, 0F, 0F, 103, 9, 1, 0F); // CR.LeftUpperSidePlate
		bodyModel[9].setRotationPoint(-50F, -11F, -27F);

		bodyModel[10].addBox(0F, 0F, 0F, 60, 13, 52, 0F); // CR.Core
		bodyModel[10].setRotationPoint(-35F, -16F, -26F);

		bodyModel[11].addBox(0F, 0F, 0F, 7, 12, 32, 0F); // CR.FrontAngle
		bodyModel[11].setRotationPoint(53F, -10.5F, -16F);
		bodyModel[11].rotateAngleZ = -0.4363323F;

		bodyModel[12].addBox(0F, 0F, 0F, 28, 5, 32, 0F); // CR.NoseAngle
		bodyModel[12].setRotationPoint(25F, -13F, -16F);
		bodyModel[12].rotateAngleZ = -0.09075712F;

		bodyModel[13].addBox(0F, 0F, 0F, 25, 11, 52, 0F); // CR.BackCore
		bodyModel[13].setRotationPoint(-60F, -17F, -26F);

		bodyModel[14].addBox(0F, 0F, 0F, 90, 12, 32, 0F); // CR.LowerCore
		bodyModel[14].setRotationPoint(-36F, -9F, -16F);

		bodyModel[15].addBox(0F, 0F, 0F, 26, 10, 32, 0F); // CR.LowerBackCore
		bodyModel[15].setRotationPoint(-56.5F, -15.5F, -16F);
		bodyModel[15].rotateAngleZ = -0.3490658F;

		bodyModel[16].addBox(0F, 0F, 0F, 4, 8, 30, 0F); // CR.ExhaustPort
		bodyModel[16].setRotationPoint(-64F, -15F, -15F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 6, 10, 0F); // CR.RightForwardAngle
		bodyModel[17].setRotationPoint(59.3F, -6.8F, 16F);
		bodyModel[17].rotateAngleZ = 0.4363323F;

		bodyModel[18].addBox(0F, 0F, 0F, 1, 6, 10, 0F); // CR.LeftForwardAngle
		bodyModel[18].setRotationPoint(59.3F, -6.8F, -26F);
		bodyModel[18].rotateAngleZ = 0.4363323F;

		bodyModel[19].addBox(0F, 0F, 0F, 1, 6, 10, 0F); // CR.MudflapRight
		bodyModel[19].setRotationPoint(-57F, -6F, 16F);
		bodyModel[19].rotateAngleZ = -0.2094395F;

		bodyModel[20].addBox(0F, 0F, 0F, 1, 6, 10, 0F); // CR.MudflapLeft
		bodyModel[20].setRotationPoint(-57F, -6F, -26F);
		bodyModel[20].rotateAngleZ = -0.2094395F;

		bodyModel[21].addBox(0F, 0F, 0F, 2, 6, 4, 0F); // CR.MiniExhaustRight
		bodyModel[21].setRotationPoint(-62F, -14F, 17F);

		bodyModel[22].addBox(0F, 0F, 0F, 2, 6, 4, 0F); // CR.MiniExhaustLeft
		bodyModel[22].setRotationPoint(-62F, -14F, -21F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // CR.RightLight
		bodyModel[23].setRotationPoint(55F, -11F, 19F);

		bodyModel[24].addBox(0F, 0F, 0F, 28, 1, 28, 0F); // CR.UnderTurret
		bodyModel[24].setRotationPoint(-14F, -17F, -14F);

		bodyModel[25].addBox(0F, 0F, 0F, 98, 6, 0, 0F); // CR.LeftLowerSidePlate
		bodyModel[25].setRotationPoint(-48F, -2F, -26.5F);

		bodyModel[26].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // CR.FrontWheelRight
		bodyModel[26].setRotationPoint(51F, -5F, 18F);

		bodyModel[27].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // CR.BackWheelRight
		bodyModel[27].setRotationPoint(-52F, -5F, 18F);

		bodyModel[28].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // CR.FrontWheelLeft
		bodyModel[28].setRotationPoint(51F, -5F, -24F);

		bodyModel[29].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // CR.BackWheelRight
		bodyModel[29].setRotationPoint(-52F, -5F, -24F);

		bodyModel[30].addBox(0F, 0F, 0F, 7, 4, 10, 0F); // CR.Computerthingy?
		bodyModel[30].setRotationPoint(25F, -16F, -5F);

		bodyModel[31].addBox(0F, 0F, 0F, 98, 6, 0, 0F); // CR.RightLowerSidePlate
		bodyModel[31].setRotationPoint(-48F, -2F, 26.5F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // CR.LeftLight
		bodyModel[32].setRotationPoint(55F, -11F, -24F);



// Turret
		turretModel = new ModelRendererTurbo[30];
		turretModel[0] = new ModelRendererTurbo(this,  300,  0, textureX, textureY); // TR.Center
		turretModel[1] = new ModelRendererTurbo(this,  300,  50, textureX, textureY); // TR.ConverttobasketArea
		turretModel[2] = new ModelRendererTurbo(this,  300,  110, textureX, textureY); // TR.TopAngleFront
		turretModel[3] = new ModelRendererTurbo(this,  300,  160, textureX, textureY); // TR.TopAngleForward
		turretModel[4] = new ModelRendererTurbo(this,  300,  210, textureX, textureY); // TR.FrontAngleLower
		turretModel[5] = new ModelRendererTurbo(this,  300,  260, textureX, textureY); // TR.FrontAngleLowest
		turretModel[6] = new ModelRendererTurbo(this,  300,  310, textureX, textureY); // TR.RightSideAngleArea
		turretModel[7] = new ModelRendererTurbo(this,  300,  350, textureX, textureY); // TR.RightSide
		turretModel[8] = new ModelRendererTurbo(this,  300,  380, textureX, textureY); // TR.backupper
		turretModel[9] = new ModelRendererTurbo(this,  300,  450, textureX, textureY); // TR.CageBottom
		turretModel[10] = new ModelRendererTurbo(this,  300,  500, textureX, textureY); // TR.CageRight
		turretModel[11] = new ModelRendererTurbo(this,  300,  500, textureX, textureY); // TR.CageLeft
		turretModel[12] = new ModelRendererTurbo(this,  350,  500, textureX, textureY); // TR.CageBack
		turretModel[13] = new ModelRendererTurbo(this,  300,  350, textureX, textureY); // TR.LeftSide
		turretModel[14] = new ModelRendererTurbo(this,  300,  310, textureX, textureY); // TR.LeftSideAngleArea
		turretModel[15] = new ModelRendererTurbo(this,  300,  530, textureX, textureY); // TR.RightCornerAngle
		turretModel[16] = new ModelRendererTurbo(this,  300,  530, textureX, textureY); // TR.LeftCornerAngle
		turretModel[17] = new ModelRendererTurbo(this,  300,  550, textureX, textureY); // TR.RightAntennaBase
		turretModel[18] = new ModelRendererTurbo(this,  300,  550, textureX, textureY); // TR.LeftAntennaBase
		turretModel[19] = new ModelRendererTurbo(this,  290,  50, textureX, textureY); // TR.RightAntenna
		turretModel[20] = new ModelRendererTurbo(this,  290,  50, textureX, textureY); // TR.LeftAntenna
		turretModel[21] = new ModelRendererTurbo(this,  320,  550, textureX, textureY); // TR.Camera
		turretModel[22] = new ModelRendererTurbo(this,  300,  570, textureX, textureY); // TR.BackCamera?Stand
		turretModel[23] = new ModelRendererTurbo(this,  380,  570, textureX, textureY); // TR.Parascope?
		turretModel[24] = new ModelRendererTurbo(this,  300,  600, textureX, textureY); // TR.CommanderHatch
		turretModel[25] = new ModelRendererTurbo(this,  380,  600, textureX, textureY); // TR.GunStick
		turretModel[26] = new ModelRendererTurbo(this,  300,  630, textureX, textureY); // TR.GapFiller
		turretModel[27] = new ModelRendererTurbo(this,  380,  650, textureX, textureY); // TR.FrontSensorThing
		turretModel[28] = new ModelRendererTurbo(this,  300,  700, textureX, textureY); // TR.RightBackAngleLand
		turretModel[29] = new ModelRendererTurbo(this,  300,  700, textureX, textureY); // TR.LeftBackAngleLand

		turretModel[0].addBox(-27F, 0F, -15F, 50, 10, 30, 0F); // TR.Center
		turretModel[0].setRotationPoint(0F, -27F, 0F);

		turretModel[1].addBox(-38F, 0F, -20F, 30, 8, 40, 0F); // TR.ConverttobasketArea
		turretModel[1].setRotationPoint(0F, -27F, 0F);

		turretModel[2].addBox(23F, 0F, -15F, 14, 6, 30, 0F); // TR.TopAngleFront
		turretModel[2].setRotationPoint(0F, -28.3F, 0F);
		turretModel[2].rotateAngleZ = -0.05235988F;

		turretModel[3].addBox(42F, -3F, -15F, 7, 2, 30, 0F); // TR.TopAngleForward
		turretModel[3].setRotationPoint(0F, -47.4F, 0F);
		turretModel[3].rotateAngleZ = -0.5934119F;

		turretModel[4].addBox(37F, 0F, -15F, 8, 2, 30, 0F); // TR.FrontAngleLower
		turretModel[4].setRotationPoint(0F, -5F, 0F);
		turretModel[4].rotateAngleZ = 0.418879F;

		turretModel[5].addBox(22.2F, 0F, -15F, 13, 4, 30, 0F); // TR.FrontAngleLowest
		turretModel[5].setRotationPoint(0F, -18.8F, 0F);
		turretModel[5].rotateAngleZ = 0.1047198F;

		turretModel[6].addBox(-8F, 0F, 17F, 31, 5, 10, 0F); // TR.RightSideAngleArea
		turretModel[6].setRotationPoint(0F, -34.8F, 0F);
		turretModel[6].rotateAngleX = -0.4886922F;

		turretModel[7].addBox(-16F, 0F, 15F, 39, 5, 9, 0F); // TR.RightSide
		turretModel[7].setRotationPoint(0F, -22F, 0F);

		turretModel[8].addBox(-38F, 0F, -24F, 30, 5, 48, 0F); // TR.backupper
		turretModel[8].setRotationPoint(0F, -24F, 0F);

		turretModel[9].addBox(-53F, 0F, -19F, 15, 1, 38, 0F); // TR.CageBottom
		turretModel[9].setRotationPoint(0F, -19F, 0F);
		turretModel[9].rotateAngleZ = -0.05235988F;

		turretModel[10].addBox(-53F, 0F, 18F, 15, 6, 1, 0F); // TR.CageRight
		turretModel[10].setRotationPoint(0F, -24.5F, 0F);
		turretModel[10].rotateAngleZ = -0.05235988F;

		turretModel[11].addBox(-53F, 0F, -19F, 15, 6, 1, 0F); // TR.CageLeft
		turretModel[11].setRotationPoint(0F, -24.3F, 0F);
		turretModel[11].rotateAngleZ = -0.05235988F;

		turretModel[12].addBox(-53F, 0F, -19F, 1, 6, 38, 0F); // TR.CageBack
		turretModel[12].setRotationPoint(0F, -24.5F, 0F);
		turretModel[12].rotateAngleZ = -0.05235988F;

		turretModel[13].addBox(-16F, 0F, -24F, 39, 5, 9, 0F); // TR.LeftSide
		turretModel[13].setRotationPoint(0F, -22F, 0F);

		turretModel[14].addBox(-8F, 0F, -27F, 31, 5, 10, 0F); // TR.LeftSideAngleArea
		turretModel[14].setRotationPoint(0F, -34.8F, 0F);
		turretModel[14].rotateAngleX = 0.4886922F;

		turretModel[15].addBox(10F, 0F, 23.5F, 14, 3, 6, 0F); // TR.RightCornerAngle
		turretModel[15].setRotationPoint(0F, -22F, 0F);
		turretModel[15].rotateAngleY = -0.4886922F;

		turretModel[16].addBox(10F, 0F, -30F, 14, 3, 6, 0F); // TR.LeftCornerAngle
		turretModel[16].setRotationPoint(0F, -22F, 0F);
		turretModel[16].rotateAngleY = 0.4886922F;

		turretModel[17].addBox(46F, 7F, 21F, 2, 6, 2, 0F); // TR.RightAntennaBase
		turretModel[17].setRotationPoint(0F, -57F, 0F);
		turretModel[17].rotateAngleZ = -2.268928F;

		turretModel[18].addBox(46F, 7F, -23F, 2, 6, 2, 0F); // TR.LeftAntennaBase
		turretModel[18].setRotationPoint(0F, -57F, 0F);
		turretModel[18].rotateAngleZ = -2.268928F;

		turretModel[19].addBox(46.5F, 8F, 21.5F, 1, 50, 1, 0F); // TR.RightAntenna
		turretModel[19].setRotationPoint(0F, -57F, 0F);
		turretModel[19].rotateAngleZ = -2.268928F;

		turretModel[20].addBox(46.5F, 8F, -22.5F, 1, 50, 1, 0F); // TR.LeftAntenna
		turretModel[20].setRotationPoint(0F, -57F, 0F);
		turretModel[20].rotateAngleZ = -2.268928F;

		turretModel[21].addBox(30F, 2F, -1.5F, 5, 3, 3, 0F); // TR.Camera
		turretModel[21].setRotationPoint(0F, -32F, 0F);
		turretModel[21].rotateAngleZ = -0.03490658F;

		turretModel[22].addBox(-21F, 0F, -14F, 12, 7, 7, 0F); // TR.BackCamera?Stand
		turretModel[22].setRotationPoint(0F, -33F, 0F);

		turretModel[23].addBox(-16F, 0F, -13F, 6, 5, 5, 0F); // TR.Parascope?
		turretModel[23].setRotationPoint(0F, -38F, 0F);

		turretModel[24].addBox(-5F, 0F, -12F, 12, 3, 12, 0F); // TR.CommanderHatch
		turretModel[24].setRotationPoint(0F, -30F, 0F);

		turretModel[25].addBox(6F, 0F, -2F, 1, 9, 1, 0F); // TR.GunStick
		turretModel[25].setRotationPoint(0F, -40F, 0F);
		turretModel[25].rotateAngleZ = -0.3346075F;

		turretModel[26].addBox(36F, 0F, -15F, 3, 4, 30, 0F); // TR.GapFiller
		turretModel[26].setRotationPoint(0F, -24.1F, 0F);

		turretModel[27].addBox(18F, 0F, 5F, 4, 4, 6, 0F); // TR.FrontSensorThing
		turretModel[27].setRotationPoint(0F, -31F, 0F);

		turretModel[28].addBox(-38F, -2F, 21F, 30, 5, 5, 0F); // TR.RightBackAngleLand
		turretModel[28].setRotationPoint(0F, -35F, 0F);
		turretModel[28].rotateAngleX = -0.4886922F;

		turretModel[29].addBox(-38F, -2F, -26F, 30, 5, 5, 0F); // TR.LeftBackAngleLand
		turretModel[29].setRotationPoint(0F, -35F, 0F);
		turretModel[29].rotateAngleX = 0.4886922F;



// Barrel
		barrelModel = new ModelRendererTurbo[7];
		barrelModel[0] = new ModelRendererTurbo(this,  300,  800, textureX, textureY); // BL.DecorativeMGBase
		barrelModel[1] = new ModelRendererTurbo(this,  300,  820, textureX, textureY); // BL.DecorativeMGBarrel
		barrelModel[2] = new ModelRendererTurbo(this,  350,  800, textureX, textureY); // BL.DecorativeMGBase
		barrelModel[3] = new ModelRendererTurbo(this,  300,  850, textureX, textureY); // BL.GunHolder
		barrelModel[4] = new ModelRendererTurbo(this,  300,  880, textureX, textureY); // BL.BackFattyPart
		barrelModel[5] = new ModelRendererTurbo(this,  300,  910, textureX, textureY); // BL.MiddleyPart
		barrelModel[6] = new ModelRendererTurbo(this,  300,  940, textureX, textureY); // BL.End

		barrelModel[0].addBox(-4F, -1F, -2F, 7, 2, 4, 0F); // BL.DecorativeMGBase
		barrelModel[0].setRotationPoint(6F, -38F, -1.5F);

		barrelModel[1].addBox(6F, -1.5F, -0.5F, 12, 1, 1, 0F); // BL.DecorativeMGBarrel
		barrelModel[1].setRotationPoint(6F, -38F, -1.5F);

		barrelModel[2].addBox(-8F, -2F, -1.5F, 14, 2, 3, 0F); // BL.DecorativeMGBase
		barrelModel[2].setRotationPoint(6F, -38F, -1.5F);

		barrelModel[3].addBox(-11F, -3F, 0F, 16, 6, 6, 0F); // BL.GunHolder
		barrelModel[3].setRotationPoint(38F, -22.5F, -3F);

		barrelModel[4].addBox(5F, -2.5F, 0.5F, 20, 5, 5, 0F); // BL.BackFattyPart
		barrelModel[4].setRotationPoint(38F, -22.5F, -3F);

		barrelModel[5].addBox(25F, -2F, 1F, 30, 4, 4, 0F); // BL.MiddleyPart
		barrelModel[5].setRotationPoint(38F, -22.5F, -3F);

		barrelModel[6].addBox(55F, -1.5F, 1.5F, 4, 3, 3, 0F); // BL.End
		barrelModel[6].setRotationPoint(38F, -22.5F, -3F);



// Left Track
		leftTrackModel = new ModelRendererTurbo[10];
		leftTrackModel[0] = new ModelRendererTurbo(this,  680,  530, textureX, textureY); // LT.Wheel1Left
		leftTrackModel[1] = new ModelRendererTurbo(this,  680,  530, textureX, textureY); // LT.Wheel2Left
		leftTrackModel[2] = new ModelRendererTurbo(this,  680,  530, textureX, textureY); // LT.Wheel3Left
		leftTrackModel[3] = new ModelRendererTurbo(this,  680,  530, textureX, textureY); // LT.Wheel4Left
		leftTrackModel[4] = new ModelRendererTurbo(this,  680,  530, textureX, textureY); // LT.Wheel5Left
		leftTrackModel[5] = new ModelRendererTurbo(this,  0,  100, textureX, textureY); // LT.FrontTrack
		leftTrackModel[6] = new ModelRendererTurbo(this,  0,  140, textureX, textureY); // LT.BottomTrack
		leftTrackModel[7] = new ModelRendererTurbo(this,  0,  180, textureX, textureY); // LT.FrontAngle
		leftTrackModel[8] = new ModelRendererTurbo(this,  0,  230, textureX, textureY); // LT.BackAngle
		leftTrackModel[9] = new ModelRendererTurbo(this,  0,  280, textureX, textureY); // LT.BackTrack

		leftTrackModel[0].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // LT.Wheel1Left
		leftTrackModel[0].setRotationPoint(36F, 1F, -24F);

		leftTrackModel[1].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // LT.Wheel2Left
		leftTrackModel[1].setRotationPoint(18F, 1F, -24F);

		leftTrackModel[2].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // LT.Wheel3Left
		leftTrackModel[2].setRotationPoint(0F, 1F, -24F);

		leftTrackModel[3].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // LT.Wheel4Left
		leftTrackModel[3].setRotationPoint(-18F, 1F, -24F);

		leftTrackModel[4].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // LT.Wheel5Left
		leftTrackModel[4].setRotationPoint(-36F, 1F, -24F);

		leftTrackModel[5].addBox(0F, 0F, 0F, 1, 10, 8, 0F); // LT.FrontTrack
		leftTrackModel[5].setRotationPoint(59F, -6.5F, -25F);

		leftTrackModel[6].addBox(0F, 0F, 0F, 82, 1, 8, 0F); // LT.BottomTrack
		leftTrackModel[6].setRotationPoint(-36.5F, 9F, -25F);

		leftTrackModel[7].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // LT.FrontAngle
		leftTrackModel[7].setRotationPoint(59F, 3F, -25F);
		leftTrackModel[7].rotateAngleZ = -1.169371F;

		leftTrackModel[8].addBox(0F, 0F, 0F, 1, 18, 8, 0F); // LT.BackAngle
		leftTrackModel[8].setRotationPoint(-53F, 3F, -25F);
		leftTrackModel[8].rotateAngleZ = 1.186824F;

		leftTrackModel[9].addBox(0F, 0F, 0F, 1, 8, 8, 0F); // LT.BackTrack
		leftTrackModel[9].setRotationPoint(-53F, -5F, -25F);



// Right Track
		rightTrackModel = new ModelRendererTurbo[10];
		rightTrackModel[0] = new ModelRendererTurbo(this,  680,  530, textureX, textureY); // RT.Wheel1Right
		rightTrackModel[1] = new ModelRendererTurbo(this,  680,  530, textureX, textureY); // RT.Wheel2Right
		rightTrackModel[2] = new ModelRendererTurbo(this,  680,  530, textureX, textureY); // RT.Wheel3Right
		rightTrackModel[3] = new ModelRendererTurbo(this,  680,  530, textureX, textureY); // RT.Wheel4Right
		rightTrackModel[4] = new ModelRendererTurbo(this,  680,  530, textureX, textureY); // RT.Wheel5Right
		rightTrackModel[5] = new ModelRendererTurbo(this,  0,  100, textureX, textureY); // RT.FrontTrack
		rightTrackModel[6] = new ModelRendererTurbo(this,  0,  140, textureX, textureY); // RT.BottomTrack
		rightTrackModel[7] = new ModelRendererTurbo(this,  0,  180, textureX, textureY); // RT.FrontAngle
		rightTrackModel[8] = new ModelRendererTurbo(this,  0,  230, textureX, textureY); // RT.BackAngle
		rightTrackModel[9] = new ModelRendererTurbo(this,  0,  280, textureX, textureY); // RT.BackTrack

		rightTrackModel[0].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // RT.Wheel1Right
		rightTrackModel[0].setRotationPoint(36F, 1F, 18F);

		rightTrackModel[1].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // RT.Wheel2Right
		rightTrackModel[1].setRotationPoint(18F, 1F, 18F);

		rightTrackModel[2].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // RT.Wheel3Right
		rightTrackModel[2].setRotationPoint(0F, 1F, 18F);

		rightTrackModel[3].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // RT.Wheel4Right
		rightTrackModel[3].setRotationPoint(-18F, 1F, 18F);

		rightTrackModel[4].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // RT.Wheel5Right
		rightTrackModel[4].setRotationPoint(-36F, 1F, 18F);

		rightTrackModel[5].addBox(0F, 0F, 0F, 1, 10, 8, 0F); // RT.FrontTrack
		rightTrackModel[5].setRotationPoint(59F, -6.5F, 17F);

		rightTrackModel[6].addBox(0F, 0F, 0F, 82, 1, 8, 0F); // RT.BottomTrack
		rightTrackModel[6].setRotationPoint(-36.5F, 9F, 17F);

		rightTrackModel[7].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // RT.FrontAngle
		rightTrackModel[7].setRotationPoint(59F, 3F, 17F);
		rightTrackModel[7].rotateAngleZ = -1.169371F;

		rightTrackModel[8].addBox(0F, 0F, 0F, 1, 18, 8, 0F); // RT.BackAngle
		rightTrackModel[8].setRotationPoint(-53F, 3F, 17F);
		rightTrackModel[8].rotateAngleZ = 1.186824F;

		rightTrackModel[9].addBox(0F, 0F, 0F, 1, 8, 8, 0F); // RT.BackTrack
		rightTrackModel[9].setRotationPoint(-53F, -5F, 17F);


		translateAll(0, -1, 0);


		flipAll();
	}
}