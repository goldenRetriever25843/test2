//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelType10Kai extends ModelVehicle
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelType10Kai()
	{
		bodyModel = new ModelRendererTurbo[44];
		bodyModel[0] = new ModelRendererTurbo(this, 550, 0, textureX, textureY); // Import CR.RightFakeNoseAngle
		bodyModel[1] = new ModelRendererTurbo(this, 550, 30, textureX, textureY); // Import CR.RightBackNoseAngle
		bodyModel[2] = new ModelRendererTurbo(this, 550, 70, textureX, textureY); // Import CR.RightNoseBridgeAngle
		bodyModel[3] = new ModelRendererTurbo(this, 550, 100, textureX, textureY); // Import CR.RightTopFrontAngle
		bodyModel[4] = new ModelRendererTurbo(this, 550, 130, textureX, textureY); // Import CR.RightUpperSidePlate
		bodyModel[5] = new ModelRendererTurbo(this, 550, 0, textureX, textureY); // Import CR.LeftFakeNoseAngle
		bodyModel[6] = new ModelRendererTurbo(this, 550, 30, textureX, textureY); // Import CR.LeftBackNoseAngle
		bodyModel[7] = new ModelRendererTurbo(this, 550, 70, textureX, textureY); // Import CR.LeftNoseBridgeAngle
		bodyModel[8] = new ModelRendererTurbo(this, 550, 100, textureX, textureY); // Import CR.LeftTopFrontAngle
		bodyModel[9] = new ModelRendererTurbo(this, 550, 130, textureX, textureY); // Import CR.LeftUpperSidePlate
		bodyModel[10] = new ModelRendererTurbo(this, 550, 150, textureX, textureY); // Import CR.Core
		bodyModel[11] = new ModelRendererTurbo(this, 550, 230, textureX, textureY); // Import CR.FrontAngle
		bodyModel[12] = new ModelRendererTurbo(this, 650, 230, textureX, textureY); // Import CR.NoseAngle
		bodyModel[13] = new ModelRendererTurbo(this, 550, 290, textureX, textureY); // Import CR.BackCore
		bodyModel[14] = new ModelRendererTurbo(this, 550, 370, textureX, textureY); // Import CR.LowerCore
		bodyModel[15] = new ModelRendererTurbo(this, 550, 430, textureX, textureY); // Import CR.LowerBackCore
		bodyModel[16] = new ModelRendererTurbo(this, 680, 430, textureX, textureY); // Import CR.ExhaustPort
		bodyModel[17] = new ModelRendererTurbo(this, 550, 480, textureX, textureY); // Import CR.RightForwardAngle
		bodyModel[18] = new ModelRendererTurbo(this, 550, 480, textureX, textureY); // Import CR.LeftForwardAngle
		bodyModel[19] = new ModelRendererTurbo(this, 590, 480, textureX, textureY); // Import CR.MudflapRight
		bodyModel[20] = new ModelRendererTurbo(this, 590, 480, textureX, textureY); // Import CR.MudflapLeft
		bodyModel[21] = new ModelRendererTurbo(this, 650, 480, textureX, textureY); // Import CR.MiniExhaustRight
		bodyModel[22] = new ModelRendererTurbo(this, 650, 480, textureX, textureY); // Import CR.MiniExhaustLeft
		bodyModel[23] = new ModelRendererTurbo(this, 680, 480, textureX, textureY); // Import CR.RightLight
		bodyModel[24] = new ModelRendererTurbo(this, 550, 520, textureX, textureY); // Import CR.UnderTurret
		bodyModel[25] = new ModelRendererTurbo(this, 550, 570, textureX, textureY); // Import CR.LeftLowerSidePlate
		bodyModel[26] = new ModelRendererTurbo(this, 680, 530, textureX, textureY); // Import CR.FrontWheelRight
		bodyModel[27] = new ModelRendererTurbo(this, 680, 530, textureX, textureY); // Import CR.BackWheelRight
		bodyModel[28] = new ModelRendererTurbo(this, 680, 530, textureX, textureY); // Import CR.FrontWheelLeft
		bodyModel[29] = new ModelRendererTurbo(this, 680, 530, textureX, textureY); // Import CR.BackWheelRight
		bodyModel[30] = new ModelRendererTurbo(this, 550, 600, textureX, textureY); // Import CR.Computerthingy?
		bodyModel[31] = new ModelRendererTurbo(this, 550, 570, textureX, textureY); // Import CR.RightLowerSidePlate
		bodyModel[32] = new ModelRendererTurbo(this, 680, 480, textureX, textureY); // Import CR.LeftLight
		bodyModel[33] = new ModelRendererTurbo(this, 680, 480, textureX, textureY); // Box 12
		bodyModel[34] = new ModelRendererTurbo(this, 680, 480, textureX, textureY); // Box 13
		bodyModel[35] = new ModelRendererTurbo(this, 597, 327, textureX, textureY); // Box 14
		bodyModel[36] = new ModelRendererTurbo(this, 597, 327, textureX, textureY); // Box 15
		bodyModel[37] = new ModelRendererTurbo(this, 680, 430, textureX, textureY); // Box 16
		bodyModel[38] = new ModelRendererTurbo(this, 680, 430, textureX, textureY); // Box 17
		bodyModel[39] = new ModelRendererTurbo(this, 650, 480, textureX, textureY); // Box 18
		bodyModel[40] = new ModelRendererTurbo(this, 650, 480, textureX, textureY); // Box 19
		bodyModel[41] = new ModelRendererTurbo(this, 650, 480, textureX, textureY); // Box 20
		bodyModel[42] = new ModelRendererTurbo(this, 650, 480, textureX, textureY); // Box 21
		bodyModel[43] = new ModelRendererTurbo(this, 651, 373, textureX, textureY); // Box 0

		bodyModel[0].addBox(0F, 0F, 0F, 9, 1, 10, 0F); // Import CR.RightFakeNoseAngle
		bodyModel[0].setRotationPoint(44F, -11.5F, 16F);
		bodyModel[0].rotateAngleZ = -0.09075712F;

		bodyModel[1].addBox(0F, 0F, 0F, 8, 5, 10, 0F); // Import CR.RightBackNoseAngle
		bodyModel[1].setRotationPoint(25F, -16F, 16F);
		bodyModel[1].rotateAngleZ = -0.4363323F;

		bodyModel[2].addBox(0F, 0F, 0F, 15, 3, 10, 0F); // Import CR.RightNoseBridgeAngle
		bodyModel[2].setRotationPoint(30F, -13.5F, 16F);
		bodyModel[2].rotateAngleZ = -0.1396263F;

		bodyModel[3].addShapeBox(0F, 0F, 0F, 8, 4, 10, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 5F, 0F,0F, 1F, 0F,0F, 1F, 0F,0F, 5F, 0F); // Import CR.RightTopFrontAngle
		bodyModel[3].setRotationPoint(53F, -10.6F, 16F);
		bodyModel[3].rotateAngleZ = -0.43633231F;

		bodyModel[4].addBox(0F, 0F, 0F, 103, 9, 1, 0F); // Import CR.RightUpperSidePlate
		bodyModel[4].setRotationPoint(-50F, -11F, 26F);

		bodyModel[5].addBox(0F, 0F, 0F, 9, 1, 10, 0F); // Import CR.LeftFakeNoseAngle
		bodyModel[5].setRotationPoint(44F, -11.5F, -26F);
		bodyModel[5].rotateAngleZ = -0.09075712F;

		bodyModel[6].addBox(0F, 0F, 0F, 8, 5, 10, 0F); // Import CR.LeftBackNoseAngle
		bodyModel[6].setRotationPoint(25F, -16F, -26F);
		bodyModel[6].rotateAngleZ = -0.4363323F;

		bodyModel[7].addBox(0F, 0F, 0F, 15, 3, 10, 0F); // Import CR.LeftNoseBridgeAngle
		bodyModel[7].setRotationPoint(30F, -13.5F, -26F);
		bodyModel[7].rotateAngleZ = -0.1396263F;

		bodyModel[8].addShapeBox(0F, 0F, 0F, 8, 4, 10, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 5F, 0F,0F, 1F, 0F,0F, 1F, 0F,0F, 5F, 0F); // Import CR.LeftTopFrontAngle
		bodyModel[8].setRotationPoint(53F, -10.6F, -26F);
		bodyModel[8].rotateAngleZ = -0.4363323F;

		bodyModel[9].addBox(0F, 0F, 0F, 103, 9, 1, 0F); // Import CR.LeftUpperSidePlate
		bodyModel[9].setRotationPoint(-50F, -11F, -27F);

		bodyModel[10].addBox(0F, 0F, 0F, 60, 13, 52, 0F); // Import CR.Core
		bodyModel[10].setRotationPoint(-35F, -16F, -26F);

		bodyModel[11].addBox(0F, 0F, 0F, 7, 12, 32, 0F); // Import CR.FrontAngle
		bodyModel[11].setRotationPoint(53F, -10.5F, -16F);
		bodyModel[11].rotateAngleZ = -0.4363323F;

		bodyModel[12].addBox(0F, 0F, 0F, 28, 5, 32, 0F); // Import CR.NoseAngle
		bodyModel[12].setRotationPoint(25F, -13F, -16F);
		bodyModel[12].rotateAngleZ = -0.09075712F;

		bodyModel[13].addShapeBox(0F, 0F, 0F, 25, 11, 52, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,12F, 0F, 0F,12F, 0F, 0F,0F, 0F, 0F); // Import CR.BackCore
		bodyModel[13].setRotationPoint(-60F, -17F, -26F);

		bodyModel[14].addBox(0F, 0F, 0F, 90, 12, 32, 0F); // Import CR.LowerCore
		bodyModel[14].setRotationPoint(-36F, -9F, -16F);

		bodyModel[15].addBox(0F, 0F, 0F, 26, 10, 32, 0F); // Import CR.LowerBackCore
		bodyModel[15].setRotationPoint(-56.5F, -15.5F, -16F);
		bodyModel[15].rotateAngleZ = -0.3490658F;

		bodyModel[16].addBox(0F, 0F, 0F, 4, 8, 30, 0F); // Import CR.ExhaustPort
		bodyModel[16].setRotationPoint(-64F, -15F, -15F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 6, 10, 0F); // Import CR.RightForwardAngle
		bodyModel[17].setRotationPoint(59.3F, -6.8F, 16F);
		bodyModel[17].rotateAngleZ = 0.4363323F;

		bodyModel[18].addBox(0F, 0F, 0F, 1, 6, 10, 0F); // Import CR.LeftForwardAngle
		bodyModel[18].setRotationPoint(59.3F, -6.8F, -26F);
		bodyModel[18].rotateAngleZ = 0.4363323F;

		bodyModel[19].addBox(0F, 0F, 0F, 1, 6, 10, 0F); // Import CR.MudflapRight
		bodyModel[19].setRotationPoint(-57F, -6F, 16F);
		bodyModel[19].rotateAngleZ = -0.2094395F;

		bodyModel[20].addBox(0F, 0F, 0F, 1, 6, 10, 0F); // Import CR.MudflapLeft
		bodyModel[20].setRotationPoint(-57F, -6F, -26F);
		bodyModel[20].rotateAngleZ = -0.2094395F;

		bodyModel[21].addBox(0F, 0F, 0F, 2, 6, 4, 0F); // Import CR.MiniExhaustRight
		bodyModel[21].setRotationPoint(-62F, -15F, 17F);

		bodyModel[22].addBox(0F, 0F, 0F, 2, 6, 4, 0F); // Import CR.MiniExhaustLeft
		bodyModel[22].setRotationPoint(-62F, -15F, -21F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Import CR.RightLight
		bodyModel[23].setRotationPoint(55F, -11F, 19F);

		bodyModel[24].addBox(0F, 0F, 0F, 28, 1, 28, 0F); // Import CR.UnderTurret
		bodyModel[24].setRotationPoint(-14F, -17F, -14F);

		bodyModel[25].addBox(0F, 0F, 0F, 98, 6, 0, 0F); // Import CR.LeftLowerSidePlate
		bodyModel[25].setRotationPoint(-48F, -2F, -26.5F);

		bodyModel[26].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // Import CR.FrontWheelRight
		bodyModel[26].setRotationPoint(51F, -5F, 18F);

		bodyModel[27].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // Import CR.BackWheelRight
		bodyModel[27].setRotationPoint(-52F, -6F, 18F);

		bodyModel[28].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // Import CR.FrontWheelLeft
		bodyModel[28].setRotationPoint(51F, -5F, -24F);

		bodyModel[29].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // Import CR.BackWheelRight
		bodyModel[29].setRotationPoint(-52F, -6F, -24F);

		bodyModel[30].addBox(0F, 0F, 0F, 7, 4, 10, 0F); // Import CR.Computerthingy?
		bodyModel[30].setRotationPoint(25F, -16F, -5F);

		bodyModel[31].addBox(0F, 0F, 0F, 98, 6, 0, 0F); // Import CR.RightLowerSidePlate
		bodyModel[31].setRotationPoint(-48F, -2F, 26.5F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Import CR.LeftLight
		bodyModel[32].setRotationPoint(55F, -11F, -24F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 12
		bodyModel[33].setRotationPoint(-60F, -8F, -18F);
		bodyModel[33].rotateAngleY = -3.14159265F;

		bodyModel[34].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 13
		bodyModel[34].setRotationPoint(-60F, -8F, 23F);
		bodyModel[34].rotateAngleY = -3.14159265F;

		bodyModel[35].addBox(0F, 0F, 0F, 2, 2, 15, 0F); // Box 14
		bodyModel[35].setRotationPoint(-64F, -17.5F, -17F);

		bodyModel[36].addBox(0F, 0F, 0F, 2, 2, 15, 0F); // Box 15
		bodyModel[36].setRotationPoint(-64F, -17.5F, 2F);

		bodyModel[37].addBox(0F, 0F, 0F, 4, 8, 30, 0F); // Box 16
		bodyModel[37].setRotationPoint(-38F, -18F, -15F);
		bodyModel[37].rotateAngleZ = 4.71238898F;

		bodyModel[38].addBox(0F, 0F, 0F, 4, 8, 30, 0F); // Box 17
		bodyModel[38].setRotationPoint(-48F, -18F, -15F);
		bodyModel[38].rotateAngleZ = 4.71238898F;

		bodyModel[39].addBox(0F, 0F, 0F, 2, 6, 4, 0F); // Box 18
		bodyModel[39].setRotationPoint(-39F, -18F, 17F);
		bodyModel[39].rotateAngleZ = 4.71238898F;

		bodyModel[40].addBox(0F, 0F, 0F, 2, 6, 4, 0F); // Box 19
		bodyModel[40].setRotationPoint(-49F, -18F, 17F);
		bodyModel[40].rotateAngleZ = 4.71238898F;

		bodyModel[41].addBox(0F, 0F, 0F, 2, 6, 4, 0F); // Box 20
		bodyModel[41].setRotationPoint(-49F, -18F, -21F);
		bodyModel[41].rotateAngleZ = 4.71238898F;

		bodyModel[42].addBox(0F, 0F, 0F, 2, 6, 4, 0F); // Box 21
		bodyModel[42].setRotationPoint(-39F, -18F, -21F);
		bodyModel[42].rotateAngleZ = 4.71238898F;

		bodyModel[43].addBox(-3F, 0F, -12F, 9, 3, 12, 0F); // Box 0
		bodyModel[43].setRotationPoint(38F, -12.5F, 6F);
		bodyModel[43].rotateAngleZ = -0.06981317F;


		turretModel = new ModelRendererTurbo[34];
		turretModel[0] = new ModelRendererTurbo(this, 300, 0, textureX, textureY); // Import TR.Center
		turretModel[1] = new ModelRendererTurbo(this, 570, 372, textureX, textureY); // Import TR.ConverttobasketArea
		turretModel[2] = new ModelRendererTurbo(this, 300, 110, textureX, textureY); // Import TR.TopAngleFront
		turretModel[3] = new ModelRendererTurbo(this, 570, 375, textureX, textureY); // Import TR.TopAngleForward
		turretModel[4] = new ModelRendererTurbo(this, 581, 380, textureX, textureY); // Import TR.FrontAngleLower
		turretModel[5] = new ModelRendererTurbo(this, 300, 310, textureX, textureY); // Import TR.RightSideAngleArea
		turretModel[6] = new ModelRendererTurbo(this, 300, 350, textureX, textureY); // Import TR.RightSide
		turretModel[7] = new ModelRendererTurbo(this, 300, 380, textureX, textureY); // Import TR.backupper
		turretModel[8] = new ModelRendererTurbo(this, 300, 450, textureX, textureY); // Import TR.CageBottom
		turretModel[9] = new ModelRendererTurbo(this, 300, 500, textureX, textureY); // Import TR.CageRight
		turretModel[10] = new ModelRendererTurbo(this, 300, 500, textureX, textureY); // Import TR.CageLeft
		turretModel[11] = new ModelRendererTurbo(this, 350, 500, textureX, textureY); // Import TR.CageBack
		turretModel[12] = new ModelRendererTurbo(this, 300, 350, textureX, textureY); // Import TR.LeftSide
		turretModel[13] = new ModelRendererTurbo(this, 577, 370, textureX, textureY); // Import TR.RightCornerAngle
		turretModel[14] = new ModelRendererTurbo(this, 300, 550, textureX, textureY); // Import TR.RightAntennaBase
		turretModel[15] = new ModelRendererTurbo(this, 300, 550, textureX, textureY); // Import TR.LeftAntennaBase
		turretModel[16] = new ModelRendererTurbo(this, 290, 50, textureX, textureY); // Import TR.RightAntenna
		turretModel[17] = new ModelRendererTurbo(this, 290, 50, textureX, textureY); // Import TR.LeftAntenna
		turretModel[18] = new ModelRendererTurbo(this, 320, 550, textureX, textureY); // Import TR.Camera
		turretModel[19] = new ModelRendererTurbo(this, 300, 570, textureX, textureY); // Import TR.BackCamera?Stand
		turretModel[20] = new ModelRendererTurbo(this, 380, 570, textureX, textureY); // Import TR.Parascope?
		turretModel[21] = new ModelRendererTurbo(this, 664, 372, textureX, textureY); // Import TR.CommanderHatch
		turretModel[22] = new ModelRendererTurbo(this, 664, 372, textureX, textureY); // Import TR.GunStick
		turretModel[23] = new ModelRendererTurbo(this, 380, 650, textureX, textureY); // Import TR.FrontSensorThing
		turretModel[24] = new ModelRendererTurbo(this, 300, 700, textureX, textureY); // Import TR.RightBackAngleLand
		turretModel[25] = new ModelRendererTurbo(this, 577, 370, textureX, textureY); // Box 7
		turretModel[26] = new ModelRendererTurbo(this, 300, 310, textureX, textureY); // Box 8
		turretModel[27] = new ModelRendererTurbo(this, 300, 700, textureX, textureY); // Box 9
		turretModel[28] = new ModelRendererTurbo(this, 628, 373, textureX, textureY); // Box 10
		turretModel[29] = new ModelRendererTurbo(this, 380, 650, textureX, textureY); // Box 11
		turretModel[30] = new ModelRendererTurbo(this, 654, 372, textureX, textureY); // Box 1
		turretModel[31] = new ModelRendererTurbo(this, 672, 372, textureX, textureY); // Box 2
		turretModel[32] = new ModelRendererTurbo(this, 664, 0, textureX, textureY); // Box 3
		turretModel[33] = new ModelRendererTurbo(this, 654, 372, textureX, textureY); // Box 4

		turretModel[0].addBox(7F, 0F, -15F, 16, 10, 30, 0F); // Import TR.Center
		turretModel[0].setRotationPoint(0F, -27F, 0F);

		turretModel[1].addShapeBox(-38F, 0F, -15F, 30, 8, 30, 0F,0F, 0F, 4F,15F, 0F, 0F,15F, 0F, 0F,0F, 0F, 4F,0F, 0F, 4F,15F, 0F, 0F,15F, 0F, 0F,0F, 0F, 4F); // Import TR.ConverttobasketArea
		turretModel[1].setRotationPoint(0F, -27F, 0F);

		turretModel[2].addShapeBox(23F, 0F, -15F, 14, 4, 30, 0F,0F, 2F, 0F,0F, 1F, 0F,0F, 1F, 0F,0F, 2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import TR.TopAngleFront
		turretModel[2].setRotationPoint(0F, -26.3F, 0F);
		turretModel[2].rotateAngleZ = -0.05235988F;

		turretModel[3].addShapeBox(42F, -3F, -13F, 7, 1, 26, 0F,0F, 0F, 2F,1F, 1F, 0F,1F, 1F, 0F,0F, 0F, 2F,0F, 3F, 2F,0F, 0F, 0F,0F, 0F, 0F,0F, 3F, 2F); // Import TR.TopAngleForward
		turretModel[3].setRotationPoint(0F, -46.4F, 0F);
		turretModel[3].rotateAngleZ = -0.59341195F;

		turretModel[4].addShapeBox(37F, 0F, -9F, 5, 1, 2, 0F,0F, 1F, 10F,2F, 1F, 4F,2F, 1F, 4F,20F, 1F, 3F,12F, 2F, 8F,0F, 2F, 0F,0F, 2F, 0F,12F, 2F, 0F); // Import TR.FrontAngleLower
		turretModel[4].setRotationPoint(0F, -20F, 0F);
		turretModel[4].rotateAngleZ = 0.01745329F;

		turretModel[5].addShapeBox(-8F, 2F, 17F, 31, 1, 10, 0F,0F, 2F, 0F,0F, 0F, 0F,0F, 2F, 0F,0F, 4F, 0F,0F, 2F, 0F,0F, 3F, 0F,0F, 2F, 2F,0F, 2F, 1F); // Import TR.RightSideAngleArea
		turretModel[5].setRotationPoint(0F, -34.8F, 0F);
		turretModel[5].rotateAngleX = -0.48869219F;

		turretModel[6].addBox(-30F, 0F, 15F, 38, 5, 9, 0F); // Import TR.RightSide
		turretModel[6].setRotationPoint(0F, -22F, 0F);

		turretModel[7].addBox(-38F, 0F, -24F, 30, 5, 48, 0F); // Import TR.backupper
		turretModel[7].setRotationPoint(0F, -24F, 0F);

		turretModel[8].addBox(-53F, 0F, -19F, 15, 1, 38, 0F); // Import TR.CageBottom
		turretModel[8].setRotationPoint(0F, -19F, 0F);
		turretModel[8].rotateAngleZ = -0.05235988F;

		turretModel[9].addBox(-53F, 0F, 18F, 15, 6, 1, 0F); // Import TR.CageRight
		turretModel[9].setRotationPoint(0F, -24.5F, 0F);
		turretModel[9].rotateAngleZ = -0.05235988F;

		turretModel[10].addBox(-53F, 0F, -19F, 15, 6, 1, 0F); // Import TR.CageLeft
		turretModel[10].setRotationPoint(0F, -24.3F, 0F);
		turretModel[10].rotateAngleZ = -0.05235988F;

		turretModel[11].addBox(-53F, 0F, -19F, 1, 6, 38, 0F); // Import TR.CageBack
		turretModel[11].setRotationPoint(0F, -24.5F, 0F);
		turretModel[11].rotateAngleZ = -0.05235988F;

		turretModel[12].addBox(-30F, 0F, -24F, 38, 5, 9, 0F); // Import TR.LeftSide
		turretModel[12].setRotationPoint(0F, -22F, 0F);

		turretModel[13].addShapeBox(13F, 0F, 23F, 10, 3, 6, 0F,0F, 3F, 0F,6F, 0F, 0F,2F, 0F, 5F,4F, 0F, 3F,0F, 2F, 0F,6F, 0F, 0F,0F, 0F, 5F,4F, 2F, 3F); // Import TR.RightCornerAngle
		turretModel[13].setRotationPoint(0F, -22F, 0F);
		turretModel[13].rotateAngleY = -0.48869219F;

		turretModel[14].addBox(46F, 7F, 21F, 2, 6, 2, 0F); // Import TR.RightAntennaBase
		turretModel[14].setRotationPoint(0F, -56F, 0F);
		turretModel[14].rotateAngleZ = -2.26892803F;

		turretModel[15].addBox(46F, 7F, -23F, 2, 6, 2, 0F); // Import TR.LeftAntennaBase
		turretModel[15].setRotationPoint(0F, -56F, 0F);
		turretModel[15].rotateAngleZ = -2.26892803F;

		turretModel[16].addShapeBox(47F, 8F, 22F, 0, 50, 0, 0F,1F, 0F, 1F,1F, 0F, 1F,1F, 0F, 1F,1F, 0F, 1F,0F, 10F, 0F,0F, 10F, 0F,0F, 10F, 0F,0F, 10F, 0F); // Import TR.RightAntenna
		turretModel[16].setRotationPoint(0F, -56F, 0F);
		turretModel[16].rotateAngleZ = -2.26892803F;

		turretModel[17].addShapeBox(47F, 8F, -22F, 0, 50, 0, 0F,1F, 0F, 1F,1F, 0F, 1F,1F, 0F, 1F,1F, 0F, 1F,0F, 10F, 0F,0F, 10F, 0F,0F, 10F, 0F,0F, 10F, 0F); // Import TR.LeftAntenna
		turretModel[17].setRotationPoint(0F, -56F, 0F);
		turretModel[17].rotateAngleZ = -2.26892803F;

		turretModel[18].addBox(31F, 2F, 1.5F, 5, 3, 3, 0F); // Import TR.Camera
		turretModel[18].setRotationPoint(0F, -31F, 0F);
		turretModel[18].rotateAngleZ = -0.03490659F;

		turretModel[19].addShapeBox(-19F, 0F, -14F, 10, 7, 7, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,2F, 0F, 1F,0F, 0F, 1F,0F, 0F, 1F,2F, 0F, 1F); // Import TR.BackCamera?Stand
		turretModel[19].setRotationPoint(0F, -33F, 0F);

		turretModel[20].addBox(-16F, 0F, -13F, 6, 5, 5, 0F); // Import TR.Parascope?
		turretModel[20].setRotationPoint(0F, -38F, 0F);

		turretModel[21].addShapeBox(1F, 0F, -10F, 6, 3, 8, 0F,0F, 0F, 2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 2F,0F, 0F, 2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 2F); // Import TR.CommanderHatch
		turretModel[21].setRotationPoint(0F, -29F, 0F);

		turretModel[22].addBox(9F, 0F, -2F, 1, 11, 1, 0F); // Import TR.GunStick
		turretModel[22].setRotationPoint(0F, -40F, 0F);
		turretModel[22].rotateAngleZ = -0.33460754F;

		turretModel[23].addBox(18F, 0F, 5F, 4, 4, 6, 0F); // Import TR.FrontSensorThing
		turretModel[23].setRotationPoint(0F, -31F, 0F);

		turretModel[24].addShapeBox(-30F, 0F, 21F, 22, 3, 5, 0F,0F, 2F, 1F,0F, 0F, 3F,0F, 0F, 1F,8F, 0F, 0F,8F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,8F, 0F, 0F); // Import TR.RightBackAngleLand
		turretModel[24].setRotationPoint(0F, -35F, 0F);
		turretModel[24].rotateAngleX = -0.48869219F;

		turretModel[25].addShapeBox(13F, 0F, -29F, 10, 3, 6, 0F,4F, 0F, 3F,2F, 0F, 5F,6F, 0F, 0F,0F, 3F, 0F,4F, 2F, 3F,0F, 0F, 5F,6F, 0F, 0F,0F, 2F, 0F); // Box 7
		turretModel[25].setRotationPoint(0F, -22F, 0F);
		turretModel[25].rotateAngleY = 0.48869219F;

		turretModel[26].addShapeBox(-8F, 4F, -28F, 31, 1, 10, 0F,0F, 4F, 0F,0F, 2F, 0F,0F, 0F, 0F,0F, 2F, 0F,0F, 2F, 1F,0F, 2F, 2F,0F, 3F, 0F,0F, 2F, 0F); // Box 8
		turretModel[26].setRotationPoint(0F, -36.8F, 0F);
		turretModel[26].rotateAngleX = 0.48869219F;

		turretModel[27].addShapeBox(-30F, 0F, -26F, 22, 3, 5, 0F,8F, 0F, 0F,0F, 0F, 1F,0F, 0F, 3F,0F, 2F, 1F,8F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,8F, 0F, 0F); // Box 9
		turretModel[27].setRotationPoint(0F, -35F, 0F);
		turretModel[27].rotateAngleX = 0.48869219F;

		turretModel[28].addShapeBox(37F, 0F, 7F, 5, 1, 2, 0F,20F, 1F, 4F,2F, 1F, 4F,2F, 1F, 4F,0F, 1F, 3F,12F, 2F, 0F,0F, 2F, 0F,0F, 2F, 0F,12F, 2F, 10F); // Box 10
		turretModel[28].setRotationPoint(0F, -20F, 0F);
		turretModel[28].rotateAngleZ = 0.01745329F;

		turretModel[29].addShapeBox(16.5F, 0F, 5F, 4, 4, 6, 0F,1F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,1F, 0F, 0F,3F, 1F, 2F,0F, 1F, 2F,0F, 1F, 2F,3F, 1F, 2F); // Box 11
		turretModel[29].setRotationPoint(0F, -32F, 0F);

		turretModel[30].addBox(10F, -7F, 0.5F, 2, 3, 5, 0F); // Box 1
		turretModel[30].setRotationPoint(0F, -32F, 0F);
		turretModel[30].rotateAngleZ = -0.03490659F;

		turretModel[31].addShapeBox(-5F, 0F, -10F, 6, 3, 8, 0F,0F, 0F, 0F,0F, 0F, 2F,0F, 0F, 2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 2F,0F, 0F, 2F,0F, 0F, 0F); // Box 2
		turretModel[31].setRotationPoint(0F, -29F, 0F);

		turretModel[32].addBox(-5F, 0F, -10F, 0, 0, 0, 0F); // Box 3
		turretModel[32].setRotationPoint(0F, -29F, 0F);

		turretModel[33].addBox(9F, -5F, -2.5F, 4, 3, 2, 0F); // Box 4
		turretModel[33].setRotationPoint(0F, -32F, 0F);
		turretModel[33].rotateAngleZ = -0.08726646F;


		barrelModel = new ModelRendererTurbo[7];
		barrelModel[0] = new ModelRendererTurbo(this, 350, 798, textureX, textureY); // Import BL.DecorativeMGBase
		barrelModel[1] = new ModelRendererTurbo(this, 300, 820, textureX, textureY); // Import BL.DecorativeMGBarrel
		barrelModel[2] = new ModelRendererTurbo(this, 350, 800, textureX, textureY); // Import BL.DecorativeMGBase
		barrelModel[3] = new ModelRendererTurbo(this, 654, 372, textureX, textureY); // Import BL.GunHolder
		barrelModel[4] = new ModelRendererTurbo(this, 300, 880, textureX, textureY); // Import BL.BackFattyPart
		barrelModel[5] = new ModelRendererTurbo(this, 300, 910, textureX, textureY); // Import BL.MiddleyPart
		barrelModel[6] = new ModelRendererTurbo(this, 300, 940, textureX, textureY); // Import BL.End

		barrelModel[0].addBox(-1F, -1F, -2F, 7, 3, 4, 0F); // Import BL.DecorativeMGBase
		barrelModel[0].setRotationPoint(6F, -38F, -1.5F);

		barrelModel[1].addBox(9F, -1.5F, -0.5F, 12, 1, 1, 0F); // Import BL.DecorativeMGBarrel
		barrelModel[1].setRotationPoint(6F, -38F, -1.5F);

		barrelModel[2].addBox(-7F, -2F, -1.5F, 16, 2, 3, 0F); // Import BL.DecorativeMGBase
		barrelModel[2].setRotationPoint(6F, -38F, -1.5F);

		barrelModel[3].addBox(-15F, -3F, 0F, 22, 6, 6, 0F); // Import BL.GunHolder
		barrelModel[3].setRotationPoint(38F, -22F, -3F);

		barrelModel[4].addBox(5F, -2.5F, 0.5F, 20, 5, 5, 0F); // Import BL.BackFattyPart
		barrelModel[4].setRotationPoint(38F, -22F, -3F);

		barrelModel[5].addBox(25F, -2F, 1F, 30, 4, 4, 0F); // Import BL.MiddleyPart
		barrelModel[5].setRotationPoint(38F, -22F, -3F);

		barrelModel[6].addBox(55F, -1.5F, 1.5F, 4, 3, 3, 0F); // Import BL.End
		barrelModel[6].setRotationPoint(38F, -22F, -3F);


		leftTrackModel = new ModelRendererTurbo[10];
		leftTrackModel[0] = new ModelRendererTurbo(this, 680, 530, textureX, textureY); // Import LT.Wheel1Left
		leftTrackModel[1] = new ModelRendererTurbo(this, 680, 530, textureX, textureY); // Import LT.Wheel2Left
		leftTrackModel[2] = new ModelRendererTurbo(this, 680, 530, textureX, textureY); // Import LT.Wheel3Left
		leftTrackModel[3] = new ModelRendererTurbo(this, 680, 530, textureX, textureY); // Import LT.Wheel4Left
		leftTrackModel[4] = new ModelRendererTurbo(this, 680, 530, textureX, textureY); // Import LT.Wheel5Left
		leftTrackModel[5] = new ModelRendererTurbo(this, 0, 100, textureX, textureY); // Import LT.FrontTrack
		leftTrackModel[6] = new ModelRendererTurbo(this, 0, 140, textureX, textureY); // Import LT.BottomTrack
		leftTrackModel[7] = new ModelRendererTurbo(this, 0, 180, textureX, textureY); // Import LT.FrontAngle
		leftTrackModel[8] = new ModelRendererTurbo(this, 0, 230, textureX, textureY); // Import LT.BackAngle
		leftTrackModel[9] = new ModelRendererTurbo(this, 0, 280, textureX, textureY); // Import LT.BackTrack

		leftTrackModel[0].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // Import LT.Wheel1Left
		leftTrackModel[0].setRotationPoint(36F, 1F, -24F);

		leftTrackModel[1].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // Import LT.Wheel2Left
		leftTrackModel[1].setRotationPoint(18F, 1F, -24F);

		leftTrackModel[2].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // Import LT.Wheel3Left
		leftTrackModel[2].setRotationPoint(0F, 1F, -24F);

		leftTrackModel[3].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // Import LT.Wheel4Left
		leftTrackModel[3].setRotationPoint(-18F, 1F, -24F);

		leftTrackModel[4].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // Import LT.Wheel5Left
		leftTrackModel[4].setRotationPoint(-36F, 1F, -24F);

		leftTrackModel[5].addBox(0F, 0F, 0F, 1, 10, 8, 0F); // Import LT.FrontTrack
		leftTrackModel[5].setRotationPoint(59F, -6.5F, -25F);

		leftTrackModel[6].addBox(0F, 0F, 0F, 82, 1, 8, 0F); // Import LT.BottomTrack
		leftTrackModel[6].setRotationPoint(-36.5F, 9F, -25F);

		leftTrackModel[7].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Import LT.FrontAngle
		leftTrackModel[7].setRotationPoint(59F, 3F, -25F);
		leftTrackModel[7].rotateAngleZ = -1.169371F;

		leftTrackModel[8].addBox(0F, 0F, 0F, 1, 18, 8, 0F); // Import LT.BackAngle
		leftTrackModel[8].setRotationPoint(-53F, 2F, -25F);
		leftTrackModel[8].rotateAngleZ = 1.13446401F;

		leftTrackModel[9].addBox(0F, 0F, 0F, 1, 8, 8, 0F); // Import LT.BackTrack
		leftTrackModel[9].setRotationPoint(-53F, -6F, -25F);


		rightTrackModel = new ModelRendererTurbo[10];
		rightTrackModel[0] = new ModelRendererTurbo(this, 680, 530, textureX, textureY); // Import RT.Wheel1Right
		rightTrackModel[1] = new ModelRendererTurbo(this, 680, 530, textureX, textureY); // Import RT.Wheel2Right
		rightTrackModel[2] = new ModelRendererTurbo(this, 680, 530, textureX, textureY); // Import RT.Wheel3Right
		rightTrackModel[3] = new ModelRendererTurbo(this, 680, 530, textureX, textureY); // Import RT.Wheel4Right
		rightTrackModel[4] = new ModelRendererTurbo(this, 680, 530, textureX, textureY); // Import RT.Wheel5Right
		rightTrackModel[5] = new ModelRendererTurbo(this, 0, 100, textureX, textureY); // Import RT.FrontTrack
		rightTrackModel[6] = new ModelRendererTurbo(this, 0, 140, textureX, textureY); // Import RT.BottomTrack
		rightTrackModel[7] = new ModelRendererTurbo(this, 0, 180, textureX, textureY); // Import RT.FrontAngle
		rightTrackModel[8] = new ModelRendererTurbo(this, 0, 230, textureX, textureY); // Import RT.BackAngle
		rightTrackModel[9] = new ModelRendererTurbo(this, 0, 280, textureX, textureY); // Import RT.BackTrack

		rightTrackModel[0].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // Import RT.Wheel1Right
		rightTrackModel[0].setRotationPoint(36F, 1F, 18F);

		rightTrackModel[1].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // Import RT.Wheel2Right
		rightTrackModel[1].setRotationPoint(18F, 1F, 18F);

		rightTrackModel[2].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // Import RT.Wheel3Right
		rightTrackModel[2].setRotationPoint(0F, 1F, 18F);

		rightTrackModel[3].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // Import RT.Wheel4Right
		rightTrackModel[3].setRotationPoint(-18F, 1F, 18F);

		rightTrackModel[4].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // Import RT.Wheel5Right
		rightTrackModel[4].setRotationPoint(-36F, 1F, 18F);

		rightTrackModel[5].addBox(0F, 0F, 0F, 1, 10, 8, 0F); // Import RT.FrontTrack
		rightTrackModel[5].setRotationPoint(59F, -6.5F, 17F);

		rightTrackModel[6].addBox(0F, 0F, 0F, 82, 1, 8, 0F); // Import RT.BottomTrack
		rightTrackModel[6].setRotationPoint(-36.5F, 9F, 17F);

		rightTrackModel[7].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Import RT.FrontAngle
		rightTrackModel[7].setRotationPoint(59F, 3F, 17F);
		rightTrackModel[7].rotateAngleZ = -1.169371F;

		rightTrackModel[8].addBox(0F, 0F, 0F, 1, 18, 8, 0F); // Import RT.BackAngle
		rightTrackModel[8].setRotationPoint(-53F, 2F, 17F);
		rightTrackModel[8].rotateAngleZ = 1.13446401F;

		rightTrackModel[9].addBox(0F, 0F, 0F, 1, 8, 8, 0F); // Import RT.BackTrack
		rightTrackModel[9].setRotationPoint(-53F, -6F, 17F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
