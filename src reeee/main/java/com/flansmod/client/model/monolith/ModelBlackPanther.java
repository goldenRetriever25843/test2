//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.2.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelBlackPanther extends ModelVehicle
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelBlackPanther()
	{
		bodyModel = new ModelRendererTurbo[46];
		bodyModel[0] = new ModelRendererTurbo(this, 550, 0, textureX, textureY); // Import CR.RightFakeNoseAngle
		bodyModel[1] = new ModelRendererTurbo(this, 550, 30, textureX, textureY); // Import CR.RightBackNoseAngle
		bodyModel[2] = new ModelRendererTurbo(this, 550, 70, textureX, textureY); // Import CR.RightNoseBridgeAngle
		bodyModel[3] = new ModelRendererTurbo(this, 550, 130, textureX, textureY); // Import CR.RightUpperSidePlate
		bodyModel[4] = new ModelRendererTurbo(this, 550, 150, textureX, textureY); // Import CR.Core
		bodyModel[5] = new ModelRendererTurbo(this, 550, 370, textureX, textureY); // Import CR.FrontAngle
		bodyModel[6] = new ModelRendererTurbo(this, 650, 230, textureX, textureY); // Import CR.NoseAngle
		bodyModel[7] = new ModelRendererTurbo(this, 550, 290, textureX, textureY); // Import CR.BackCore
		bodyModel[8] = new ModelRendererTurbo(this, 550, 370, textureX, textureY); // Import CR.LowerCore
		bodyModel[9] = new ModelRendererTurbo(this, 554, 430, textureX, textureY); // Import CR.LowerBackCore
		bodyModel[10] = new ModelRendererTurbo(this, 680, 430, textureX, textureY); // Import CR.ExhaustPort
		bodyModel[11] = new ModelRendererTurbo(this, 590, 480, textureX, textureY); // Import CR.MudflapRight
		bodyModel[12] = new ModelRendererTurbo(this, 590, 480, textureX, textureY); // Import CR.MudflapLeft
		bodyModel[13] = new ModelRendererTurbo(this, 650, 480, textureX, textureY); // Import CR.MiniExhaustLeft
		bodyModel[14] = new ModelRendererTurbo(this, 680, 480, textureX, textureY); // Import CR.RightLight
		bodyModel[15] = new ModelRendererTurbo(this, 550, 520, textureX, textureY); // Import CR.UnderTurret
		bodyModel[16] = new ModelRendererTurbo(this, 680, 530, textureX, textureY); // Import CR.FrontWheelRight
		bodyModel[17] = new ModelRendererTurbo(this, 680, 530, textureX, textureY); // Import CR.BackWheelRight
		bodyModel[18] = new ModelRendererTurbo(this, 680, 530, textureX, textureY); // Import CR.FrontWheelLeft
		bodyModel[19] = new ModelRendererTurbo(this, 680, 530, textureX, textureY); // Import CR.BackWheelRight
		bodyModel[20] = new ModelRendererTurbo(this, 680, 480, textureX, textureY); // Import CR.LeftLight
		bodyModel[21] = new ModelRendererTurbo(this, 680, 480, textureX, textureY); // Box 13
		bodyModel[22] = new ModelRendererTurbo(this, 597, 327, textureX, textureY); // Box 14
		bodyModel[23] = new ModelRendererTurbo(this, 597, 327, textureX, textureY); // Box 15
		bodyModel[24] = new ModelRendererTurbo(this, 680, 430, textureX, textureY); // Box 16
		bodyModel[25] = new ModelRendererTurbo(this, 680, 430, textureX, textureY); // Box 17
		bodyModel[26] = new ModelRendererTurbo(this, 650, 480, textureX, textureY); // Box 18
		bodyModel[27] = new ModelRendererTurbo(this, 650, 480, textureX, textureY); // Box 19
		bodyModel[28] = new ModelRendererTurbo(this, 650, 480, textureX, textureY); // Box 20
		bodyModel[29] = new ModelRendererTurbo(this, 650, 480, textureX, textureY); // Box 21
		bodyModel[30] = new ModelRendererTurbo(this, 651, 373, textureX, textureY); // Box 0
		bodyModel[31] = new ModelRendererTurbo(this, 550, 100, textureX, textureY); // Box 105
		bodyModel[32] = new ModelRendererTurbo(this, 550, 130, textureX, textureY); // Box 107
		bodyModel[33] = new ModelRendererTurbo(this, 550, 370, textureX, textureY); // Box 108
		bodyModel[34] = new ModelRendererTurbo(this, 550, 0, textureX, textureY); // Box 109
		bodyModel[35] = new ModelRendererTurbo(this, 550, 30, textureX, textureY); // Box 110
		bodyModel[36] = new ModelRendererTurbo(this, 550, 70, textureX, textureY); // Box 111
		bodyModel[37] = new ModelRendererTurbo(this, 550, 100, textureX, textureY); // Box 112
		bodyModel[38] = new ModelRendererTurbo(this, 680, 480, textureX, textureY); // Box 115
		bodyModel[39] = new ModelRendererTurbo(this, 550, 130, textureX, textureY); // Box 125
		bodyModel[40] = new ModelRendererTurbo(this, 556, 130, textureX, textureY); // Box 126
		bodyModel[41] = new ModelRendererTurbo(this, 550, 130, textureX, textureY); // Box 127
		bodyModel[42] = new ModelRendererTurbo(this, 555, 130, textureX, textureY); // Box 128
		bodyModel[43] = new ModelRendererTurbo(this, 550, 600, textureX, textureY); // Box 131
		bodyModel[44] = new ModelRendererTurbo(this, 650, 480, textureX, textureY); // Box 163
		bodyModel[45] = new ModelRendererTurbo(this, 680, 480, textureX, textureY); // Box 164

		bodyModel[0].addShapeBox(0F, 0F, 0F, 9, 1, 10, 0F,0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 4F, 2F, 0F, 4F, 2F, 0F, 0F, 2F, 0F); // Import CR.RightFakeNoseAngle
		bodyModel[0].setRotationPoint(44F, -11.7F, 16F);
		bodyModel[0].rotateAngleZ = -0.05585054F;

		bodyModel[1].addBox(0F, 0F, 0F, 8, 5, 10, 0F); // Import CR.RightBackNoseAngle
		bodyModel[1].setRotationPoint(25F, -14.5F, 16F);
		bodyModel[1].rotateAngleZ = -0.15707963F;

		bodyModel[2].addShapeBox(0F, 0F, 0F, 15, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import CR.RightNoseBridgeAngle
		bodyModel[2].setRotationPoint(30F, -13.7F, 16F);
		bodyModel[2].rotateAngleZ = -0.13962634F;

		bodyModel[3].addShapeBox(0F, 0F, 0F, 103, 9, 1, 0F,-8F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -8F, 0F, 0F, -8F, 2F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, -8F, 2F, 0F); // Import CR.RightUpperSidePlate
		bodyModel[3].setRotationPoint(-50F, -10F, 26F);

		bodyModel[4].addBox(0F, 0F, 0F, 60, 13, 52, 0F); // Import CR.Core
		bodyModel[4].setRotationPoint(-35F, -14.5F, -26F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 7, 12, 32, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import CR.FrontAngle
		bodyModel[5].setRotationPoint(53F, -10.5F, -16F);
		bodyModel[5].rotateAngleZ = -0.54105207F;

		bodyModel[6].addBox(0F, 0F, 0F, 28, 5, 32, 0F); // Import CR.NoseAngle
		bodyModel[6].setRotationPoint(25F, -13F, -16F);
		bodyModel[6].rotateAngleZ = -0.09075712F;

		bodyModel[7].addShapeBox(0F, 0F, 0F, 25, 11, 52, 0F,0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 90F, 0F, 0F, 90F, 0F, 0F, -6F, 0F, 0F); // Import CR.BackCore
		bodyModel[7].setRotationPoint(-60F, -17F, -26F);

		bodyModel[8].addBox(0F, 0F, 0F, 90, 12, 32, 0F); // Import CR.LowerCore
		bodyModel[8].setRotationPoint(-36F, -9F, -16F);

		bodyModel[9].addBox(0F, 0F, 0F, 22, 10, 32, 0F); // Import CR.LowerBackCore
		bodyModel[9].setRotationPoint(-52F, -15.5F, -16F);
		bodyModel[9].rotateAngleZ = -0.42760567F;

		bodyModel[10].addShapeBox(0F, 3F, 0F, 4, 8, 30, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Import CR.ExhaustPort
		bodyModel[10].setRotationPoint(-62F, -15F, -15F);
		bodyModel[10].rotateAngleZ = 0.52359878F;

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Import CR.MudflapRight
		bodyModel[11].setRotationPoint(-54F, -6F, 16F);
		bodyModel[11].rotateAngleZ = -0.20943951F;

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Import CR.MudflapLeft
		bodyModel[12].setRotationPoint(-54F, -6F, -26F);
		bodyModel[12].rotateAngleZ = -0.20943951F;

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,0F, 0F, 7F, 4F, 0F, 7F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 7F, 4F, 1F, 7F, 4F, 1F, 0F, 0F, 1F, 0F); // Import CR.MiniExhaustLeft
		bodyModel[13].setRotationPoint(-62F, -16.8F, -19F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Import CR.RightLight
		bodyModel[14].setRotationPoint(55F, -11F, 19F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 28, 1, 28, 0F,2F, 2F, 2F, 2F, 2F, 2F, 2F, 2F, 2F, 2F, 2F, 2F, 2F, 2F, 2F, 2F, 2F, 2F, 2F, 2F, 2F, 2F, 2F, 2F); // Import CR.UnderTurret
		bodyModel[15].setRotationPoint(-15F, -17F, -14F);

		bodyModel[16].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // Import CR.FrontWheelRight
		bodyModel[16].setRotationPoint(51F, -5F, 18F);

		bodyModel[17].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // Import CR.BackWheelRight
		bodyModel[17].setRotationPoint(-52F, -6F, 18F);

		bodyModel[18].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // Import CR.FrontWheelLeft
		bodyModel[18].setRotationPoint(51F, -5F, -24F);

		bodyModel[19].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // Import CR.BackWheelRight
		bodyModel[19].setRotationPoint(-52F, -6F, -24F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,4F, 0.7F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 4F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CR.LeftLight
		bodyModel[20].setRotationPoint(57F, -9.5F, -16F);
		bodyModel[20].rotateAngleZ = 0.03490659F;

		bodyModel[21].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 13
		bodyModel[21].setRotationPoint(-61.5F, -14F, 23F);
		bodyModel[21].rotateAngleY = -3.14159265F;

		bodyModel[22].addBox(0F, 0F, 0F, 2, 2, 15, 0F); // Box 14
		bodyModel[22].setRotationPoint(-61F, -15.5F, -15F);

		bodyModel[23].addBox(0F, 0F, 0F, 2, 2, 15, 0F); // Box 15
		bodyModel[23].setRotationPoint(-61F, -15.5F, 0F);

		bodyModel[24].addBox(0F, 0F, 0F, 4, 8, 30, 0F); // Box 16
		bodyModel[24].setRotationPoint(-38F, -17.25F, -15F);
		bodyModel[24].rotateAngleZ = 4.71238898F;

		bodyModel[25].addBox(0F, 0F, 0F, 4, 8, 30, 0F); // Box 17
		bodyModel[25].setRotationPoint(-48F, -17.25F, -15F);
		bodyModel[25].rotateAngleZ = 4.71238898F;

		bodyModel[26].addBox(0F, 0F, 0F, 2, 6, 4, 0F); // Box 18
		bodyModel[26].setRotationPoint(-39F, -17.25F, 17F);
		bodyModel[26].rotateAngleZ = 4.71238898F;

		bodyModel[27].addBox(0F, 0F, 0F, 2, 6, 4, 0F); // Box 19
		bodyModel[27].setRotationPoint(-49F, -17.25F, 17F);
		bodyModel[27].rotateAngleZ = 4.71238898F;

		bodyModel[28].addBox(0F, 0F, 0F, 2, 6, 4, 0F); // Box 20
		bodyModel[28].setRotationPoint(-49F, -17.25F, -21F);
		bodyModel[28].rotateAngleZ = 4.71238898F;

		bodyModel[29].addBox(0F, 0F, 0F, 2, 6, 4, 0F); // Box 21
		bodyModel[29].setRotationPoint(-39F, -17.25F, -21F);
		bodyModel[29].rotateAngleZ = 4.71238898F;

		bodyModel[30].addBox(-3F, 0F, -12F, 9, 3, 12, 0F); // Box 0
		bodyModel[30].setRotationPoint(38F, -12.5F, 6F);
		bodyModel[30].rotateAngleZ = -0.06981317F;

		bodyModel[31].addShapeBox(0F, 0F, 0F, 8, 4, 10, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 5F, 0F); // Box 105
		bodyModel[31].setRotationPoint(57F, -11F, 16F);
		bodyModel[31].rotateAngleZ = -0.6981317F;

		bodyModel[32].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F,5F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 5F, 0F, 0F, 5F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 5F, 2F, 0F); // Box 107
		bodyModel[32].setRotationPoint(53F, -10F, 26F);

		bodyModel[33].addShapeBox(6F, 0F, 0F, 7, 12, 32, 0F,0F, 0F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[33].setRotationPoint(53F, -10.5F, -16F);
		bodyModel[33].rotateAngleZ = -0.54105207F;

		bodyModel[34].addShapeBox(0F, 0F, 0F, 9, 1, 10, 0F,0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 4F, 2F, 0F, 4F, 2F, 0F, 0F, 3F, 0F); // Box 109
		bodyModel[34].setRotationPoint(44F, -11.7F, -26F);
		bodyModel[34].rotateAngleZ = -0.05585054F;

		bodyModel[35].addBox(0F, 0F, 0F, 8, 5, 10, 0F); // Box 110
		bodyModel[35].setRotationPoint(25F, -14.5F, -26F);
		bodyModel[35].rotateAngleZ = -0.15707963F;

		bodyModel[36].addShapeBox(0F, 0F, 0F, 15, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 111
		bodyModel[36].setRotationPoint(30F, -13.7F, -26F);
		bodyModel[36].rotateAngleZ = -0.13962634F;

		bodyModel[37].addShapeBox(0F, 0F, 0F, 8, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 5F, 0F); // Box 112
		bodyModel[37].setRotationPoint(57F, -11F, -26F);
		bodyModel[37].rotateAngleZ = -0.6981317F;

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,4F, 0.7F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 4F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[38].setRotationPoint(57F, -9.5F, 11F);
		bodyModel[38].rotateAngleZ = 0.03490659F;

		bodyModel[39].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F,5F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 5F, 0F, 0F, 5F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 5F, 2F, 0F); // Box 125
		bodyModel[39].setRotationPoint(53F, -10F, -27F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 16, 9, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 126
		bodyModel[40].setRotationPoint(-58F, -10F, 26F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 103, 9, 1, 0F,-8F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -8F, 0F, 0F, -8F, 2F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, -8F, 2F, 0F); // Box 127
		bodyModel[41].setRotationPoint(-50F, -10F, -27F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 16, 9, 1, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 128
		bodyModel[42].setRotationPoint(-58F, -10F, -27F);

		bodyModel[43].addBox(0F, 0F, 0F, 7, 4, 10, 0F); // Box 131
		bodyModel[43].setRotationPoint(25F, -15F, -5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 7F, 0F, 0F, 7F, 0F, 1F, 0F, 4F, 1F, 0F, 4F, 1F, 7F, 0F, 1F, 7F); // Box 163
		bodyModel[44].setRotationPoint(-62F, -16.8F, 15F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 164
		bodyModel[45].setRotationPoint(-61.5F, -14F, -18F);
		bodyModel[45].rotateAngleY = -3.14159265F;


		turretModel = new ModelRendererTurbo[43];
		turretModel[0] = new ModelRendererTurbo(this, 300, 0, textureX, textureY); // Import TR.Center
		turretModel[1] = new ModelRendererTurbo(this, 570, 372, textureX, textureY); // Import TR.ConverttobasketArea
		turretModel[2] = new ModelRendererTurbo(this, 300, 450, textureX, textureY); // Import TR.CageBottom
		turretModel[3] = new ModelRendererTurbo(this, 300, 500, textureX, textureY); // Import TR.CageRight
		turretModel[4] = new ModelRendererTurbo(this, 300, 500, textureX, textureY); // Import TR.CageLeft
		turretModel[5] = new ModelRendererTurbo(this, 350, 500, textureX, textureY); // Import TR.CageBack
		turretModel[6] = new ModelRendererTurbo(this, 305, 572, textureX, textureY); // Import TR.BackCamera?Stand
		turretModel[7] = new ModelRendererTurbo(this, 664, 372, textureX, textureY); // Import TR.CommanderHatch
		turretModel[8] = new ModelRendererTurbo(this, 654, 372, textureX, textureY); // Box 1
		turretModel[9] = new ModelRendererTurbo(this, 672, 372, textureX, textureY); // Box 2
		turretModel[10] = new ModelRendererTurbo(this, 664, 0, textureX, textureY); // Box 3
		turretModel[11] = new ModelRendererTurbo(this, 654, 372, textureX, textureY); // Box 4
		turretModel[12] = new ModelRendererTurbo(this, 300, 0, textureX, textureY); // Box 133
		turretModel[13] = new ModelRendererTurbo(this, 300, 0, textureX, textureY); // Box 134
		turretModel[14] = new ModelRendererTurbo(this, 300, 0, textureX, textureY); // Box 135
		turretModel[15] = new ModelRendererTurbo(this, 300, 0, textureX, textureY); // Box 136
		turretModel[16] = new ModelRendererTurbo(this, 570, 372, textureX, textureY); // Box 137
		turretModel[17] = new ModelRendererTurbo(this, 570, 372, textureX, textureY); // Box 138
		turretModel[18] = new ModelRendererTurbo(this, 380, 650, textureX, textureY); // Box 140
		turretModel[19] = new ModelRendererTurbo(this, 654, 372, textureX, textureY); // Box 141
		turretModel[20] = new ModelRendererTurbo(this, 654, 372, textureX, textureY); // Box 142
		turretModel[21] = new ModelRendererTurbo(this, 654, 372, textureX, textureY); // Box 143
		turretModel[22] = new ModelRendererTurbo(this, 654, 372, textureX, textureY); // Box 144
		turretModel[23] = new ModelRendererTurbo(this, 654, 372, textureX, textureY); // Box 145
		turretModel[24] = new ModelRendererTurbo(this, 654, 372, textureX, textureY); // Box 146
		turretModel[25] = new ModelRendererTurbo(this, 672, 372, textureX, textureY); // Box 147
		turretModel[26] = new ModelRendererTurbo(this, 672, 372, textureX, textureY); // Box 148
		turretModel[27] = new ModelRendererTurbo(this, 597, 327, textureX, textureY); // Box 149
		turretModel[28] = new ModelRendererTurbo(this, 597, 327, textureX, textureY); // Box 150
		turretModel[29] = new ModelRendererTurbo(this, 597, 327, textureX, textureY); // Box 151
		turretModel[30] = new ModelRendererTurbo(this, 597, 327, textureX, textureY); // Box 152
		turretModel[31] = new ModelRendererTurbo(this, 597, 327, textureX, textureY); // Box 153
		turretModel[32] = new ModelRendererTurbo(this, 667, 375, textureX, textureY); // Box 154
		turretModel[33] = new ModelRendererTurbo(this, 672, 372, textureX, textureY); // Box 155
		turretModel[34] = new ModelRendererTurbo(this, 597, 327, textureX, textureY); // Box 156
		turretModel[35] = new ModelRendererTurbo(this, 597, 327, textureX, textureY); // Box 157
		turretModel[36] = new ModelRendererTurbo(this, 597, 327, textureX, textureY); // Box 158
		turretModel[37] = new ModelRendererTurbo(this, 597, 327, textureX, textureY); // Box 159
		turretModel[38] = new ModelRendererTurbo(this, 597, 327, textureX, textureY); // Box 160
		turretModel[39] = new ModelRendererTurbo(this, 300, 500, textureX, textureY); // Box 161
		turretModel[40] = new ModelRendererTurbo(this, 300, 500, textureX, textureY); // Box 162
		turretModel[41] = new ModelRendererTurbo(this, 380, 650, textureX, textureY); // Box 165
		turretModel[42] = new ModelRendererTurbo(this, 561, 104, textureX, textureY); // Box 166

		turretModel[0].addShapeBox(-3F, -2F, -2F, 16, 10, 30, 0F,0F, -1.5F, -9F, 8F, -5F, -9F, 8F, -5.5F, -6F, 0F, -1.5F, -6F, 0F, 4F, -9F, 8F, 4F, -9F, 8F, 2F, -6F, 0F, 2F, -6F); // Import TR.Center
		turretModel[0].setRotationPoint(0F, -27F, 0F);

		turretModel[1].addShapeBox(-35F, 0F, -15F, 32, 8, 30, 0F,1F, 2F, 7F, 0F, 2F, 7F, 0F, 2F, 7F, 1F, 2F, 7F, -1F, 1.5F, 7F, 0F, 1.8F, 7F, 0F, 1.8F, 7F, 1F, 1.5F, 7F); // Import TR.ConverttobasketArea
		turretModel[1].setRotationPoint(0F, -27F, 0F);

		turretModel[2].addShapeBox(-49F, -1.5F, -19F, 15, 1, 38, 0F,-2F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, -2F, 0F, 3F); // Import TR.CageBottom
		turretModel[2].setRotationPoint(0F, -19F, 0F);

		turretModel[3].addShapeBox(-50F, -2F, 23F, 15, 6, 1, 0F,-2F, 1F, 0F, 32F, 1F, 0F, 32F, 1F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 32F, 1F, 0F, 32F, 1F, 0F, -2F, 1F, 0F); // Import TR.CageRight
		turretModel[3].setRotationPoint(0F, -24.5F, 0F);

		turretModel[4].addShapeBox(-50F, -2F, -24F, 15, 6, 1, 0F,-2F, 1F, 0F, 32F, 1F, 0F, 32F, 1F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 32F, 1F, 0F, 32F, 1F, 0F, -2F, 1F, 0F); // Import TR.CageLeft
		turretModel[4].setRotationPoint(0F, -24.3F, 0F);

		turretModel[5].addShapeBox(-48F, -2F, -19F, 1, 6, 38, 0F,0F, 1F, 5F, 0F, 1F, 5F, 0F, 1F, 5F, 0F, 1F, 5F, 0F, 0.5F, 5F, 0F, 0.5F, 5F, 0F, 0.5F, 5F, 0F, 0.5F, 5F); // Import TR.CageBack
		turretModel[5].setRotationPoint(0F, -24.5F, 0F);

		turretModel[6].addShapeBox(10F, 2F, -17F, 5, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import TR.BackCamera?Stand
		turretModel[6].setRotationPoint(0F, -33F, 0F);

		turretModel[7].addShapeBox(4F, 0F, -17F, 6, 3, 8, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 1F, 2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 2F); // Import TR.CommanderHatch
		turretModel[7].setRotationPoint(0F, -29F, 0F);

		turretModel[8].addShapeBox(-39F, -1F, 24.5F, 2, 3, 5, 0F,9F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 6F, -4F, 0F, 6F, -4F, 0F, 6F, 0F, 9F, 6F, 0F); // Box 1
		turretModel[8].setRotationPoint(1F, -27F, -13F);
		turretModel[8].rotateAngleZ = -0.03490659F;

		turretModel[9].addShapeBox(-2F, 0F, -17F, 6, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 2
		turretModel[9].setRotationPoint(0F, -29F, 0F);

		turretModel[10].addBox(-5F, 0F, -10F, 0, 0, 0, 0F); // Box 3
		turretModel[10].setRotationPoint(0F, -29F, 0F);

		turretModel[11].addBox(10F, -2F, -15.5F, 4, 3, 2, 0F); // Box 4
		turretModel[11].setRotationPoint(0F, -32F, 0F);
		turretModel[11].rotateAngleZ = -0.08726646F;

		turretModel[12].addShapeBox(-3F, -2F, -15F, 16, 10, 30, 0F,0F, 0F, -10F, 14F, -2F, -10F, 14F, -2F, -8F, 0F, 0F, -8F, 0F, 0F, -10F, 14F, 0F, -10F, 14F, 0F, -8F, 0F, 0F, -8F); // Box 133
		turretModel[12].setRotationPoint(0F, -27F, 0F);

		turretModel[13].addShapeBox(-3F, -2F, 2F, 16, 10, 30, 0F,0F, -1.5F, -6F, 8F, -5.5F, -6F, 8F, -5F, -7F, 0F, -1.5F, -7F, 0F, 2F, -6F, 8F, 2F, -6F, 8F, 4F, -7F, 0F, 4F, -7F); // Box 134
		turretModel[13].setRotationPoint(0F, -27F, -30F);

		turretModel[14].addShapeBox(21F, -2F, -2F, 16, 10, 30, 0F,0F, -5F, -9F, 1.5F, -8.2F, -9F, -2F, -8.2F, -8F, 0F, -5.5F, -6F, 0F, 3.5F, -9F, 1.5F, 2.5F, -9F, -3F, 2.8F, -7F, 0F, 1.5F, -6F); // Box 135
		turretModel[14].setRotationPoint(0F, -27F, 0F);

		turretModel[15].addShapeBox(21F, -2F, 2F, 16, 10, 30, 0F,0F, -5.5F, -6F, -2F, -8.2F, -8F, 1.5F, -8.2F, -7F, 0F, -5F, -7F, 0F, 1.5F, -6F, -3F, 2.8F, -7F, 1.5F, 2.5F, -7F, 0F, 3.5F, -7F); // Box 136
		turretModel[15].setRotationPoint(0F, -27F, -30F);

		turretModel[16].addShapeBox(-3F, -2F, -15F, 16, 10, 18, 0F,0F, 0F, -9F, 23.5F, -3.5F, -9F, 23.5F, -3F, -8F, 0F, 0F, -8F, 0F, 0F, -9F, 25.2F, -1.8F, -8.5F, 25.4F, -1.8F, -8F, 0F, 0F, -8F); // Box 137
		turretModel[16].setRotationPoint(0F, -27F, 0F);

		turretModel[17].addShapeBox(-3F, -2F, 17F, 16, 10, 18, 0F,0F, 0F, -8F, 23.5F, -3F, -8F, 23.5F, -3.5F, -9F, 0F, 0F, -9F, 0F, 0F, -8F, 25.4F, -1.8F, -8F, 25.2F, -1.8F, -8.5F, 0F, 0F, -9F); // Box 138
		turretModel[17].setRotationPoint(0F, -27F, -18F);

		turretModel[18].addShapeBox(11F, 0F, 11F, 4, 4, 6, 0F,1F, 0.2F, 2F, 1F, 0F, 2F, 1F, 0F, 2F, 1F, 0.2F, 2F, 1F, 1F, 2F, 1F, 1F, 2F, 1F, 1F, 2F, 1F, 1F, 2F); // Box 140
		turretModel[18].setRotationPoint(0F, -29.5F, 0F);

		turretModel[19].addBox(10F, -8F, 0.5F, 2, 3, 5, 0F); // Box 141
		turretModel[19].setRotationPoint(1F, -27F, -13F);
		turretModel[19].rotateAngleZ = -0.03490659F;

		turretModel[20].addShapeBox(-39F, -1F, -24.5F, 2, 3, 5, 0F,9F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 6F, -4F, 0F, 6F, -4F, 0F, 6F, 0F, 9F, 6F, 0F); // Box 142
		turretModel[20].setRotationPoint(1F, -27F, 6F);
		turretModel[20].rotateAngleZ = -0.03490659F;

		turretModel[21].addShapeBox(-39F, -1F, 24.5F, 2, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		turretModel[21].setRotationPoint(1F, -27F, -13F);
		turretModel[21].rotateAngleZ = -0.03490659F;

		turretModel[22].addShapeBox(-39F, -1F, -1.5F, 2, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		turretModel[22].setRotationPoint(1F, -27F, -13F);
		turretModel[22].rotateAngleZ = -0.03490659F;

		turretModel[23].addShapeBox(-39F, -1F, -2.5F, 2, 3, 5, 0F,-0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F); // Box 145
		turretModel[23].setRotationPoint(1F, -30F, -13F);
		turretModel[23].rotateAngleZ = -0.03490659F;

		turretModel[24].addShapeBox(-39F, -1F, 25.5F, 2, 3, 5, 0F,-0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F); // Box 146
		turretModel[24].setRotationPoint(1F, -30F, -13F);
		turretModel[24].rotateAngleZ = -0.03490659F;

		turretModel[25].addShapeBox(-39F, -4F, 25.5F, 2, 3, 5, 0F,-1F, 30F, -2.5F, -1F, 30F, -2.5F, -1F, 30F, -2.5F, -1F, 30F, -2.5F, -0.7F, 0F, -2.2F, -0.7F, 0F, -2.2F, -0.7F, 0F, -2.2F, -0.7F, 0F, -2.2F); // Box 147
		turretModel[25].setRotationPoint(1F, -30F, -13F);
		turretModel[25].rotateAngleZ = -0.03490659F;

		turretModel[26].addShapeBox(-39F, -4F, -2.5F, 2, 3, 5, 0F,-1F, 30F, -2.5F, -1F, 30F, -2.5F, -1F, 30F, -2.5F, -1F, 30F, -2.5F, -0.7F, 0F, -2.2F, -0.7F, 0F, -2.2F, -0.7F, 0F, -2.2F, -0.7F, 0F, -2.2F); // Box 148
		turretModel[26].setRotationPoint(1F, -30F, -13F);
		turretModel[26].rotateAngleZ = -0.03490659F;

		turretModel[27].addShapeBox(-5F, -1F, -20F, 2, 2, 15, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 149
		turretModel[27].setRotationPoint(0F, -29.5F, 0F);

		turretModel[28].addShapeBox(-5F, -3F, -16.5F, 2, 2, 15, 0F,-0.5F, 2F, -7F, -0.5F, 2F, -7F, -0.5F, 2F, -7F, -0.5F, 2F, -7F, -0.5F, 0F, -7F, -0.5F, 0F, -7F, -0.5F, 0F, -7F, -0.5F, 0F, -7F); // Box 150
		turretModel[28].setRotationPoint(0F, -29.5F, 0F);
		turretModel[28].rotateAngleZ = 0.2268928F;

		turretModel[29].addShapeBox(-5F, -3F, -23.5F, 2, 2, 15, 0F,-0.5F, 2F, -7F, -0.5F, 2F, -7F, -0.5F, 2F, -7F, -0.5F, 2F, -7F, -0.5F, 0F, -7F, -0.5F, 0F, -7F, -0.5F, 0F, -7F, -0.5F, 0F, -7F); // Box 151
		turretModel[29].setRotationPoint(0F, -29.5F, 0F);
		turretModel[29].rotateAngleZ = 0.2268928F;

		turretModel[30].addShapeBox(-5F, -6F, -20F, 2, 2, 15, 0F,-0.5F, 2F, -3F, -0.5F, 2F, -3F, -0.5F, 2F, -3F, -0.5F, 2F, -3F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, -4F); // Box 152
		turretModel[30].setRotationPoint(0F, -29.5F, 0F);
		turretModel[30].rotateAngleZ = 0.2268928F;

		turretModel[31].addShapeBox(-5F, -12F, -20F, 2, 2, 15, 0F,-0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 2F, -3F, -0.5F, 2F, -3F, -0.5F, 2F, -3F, -0.5F, 2F, -3F); // Box 153
		turretModel[31].setRotationPoint(0F, -29.5F, 0F);
		turretModel[31].rotateAngleZ = 0.2268928F;

		turretModel[32].addShapeBox(4F, 1F, 12F, 4, 3, 5, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 1F, 2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 2F); // Box 154
		turretModel[32].setRotationPoint(0F, -29F, 0F);

		turretModel[33].addShapeBox(0F, 1F, 12F, 4, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 155
		turretModel[33].setRotationPoint(0F, -29F, 0F);

		turretModel[34].addShapeBox(-3F, 2F, 7F, 2, 2, 15, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 156
		turretModel[34].setRotationPoint(0F, -30.5F, 0F);

		turretModel[35].addShapeBox(-3F, 0F, 10.5F, 2, 2, 15, 0F,-0.5F, 2F, -7F, -0.5F, 2F, -7F, -0.5F, 2F, -7F, -0.5F, 2F, -7F, -0.5F, 0F, -7F, -0.5F, 0F, -7F, -0.5F, 0F, -7F, -0.5F, 0F, -7F); // Box 157
		turretModel[35].setRotationPoint(0F, -30.5F, 0F);
		turretModel[35].rotateAngleZ = 0.2268928F;

		turretModel[36].addShapeBox(-3F, 0F, 3.5F, 2, 2, 15, 0F,-0.5F, 2F, -7F, -0.5F, 2F, -7F, -0.5F, 2F, -7F, -0.5F, 2F, -7F, -0.5F, 0F, -7F, -0.5F, 0F, -7F, -0.5F, 0F, -7F, -0.5F, 0F, -7F); // Box 158
		turretModel[36].setRotationPoint(0F, -30.5F, 0F);
		turretModel[36].rotateAngleZ = 0.2268928F;

		turretModel[37].addShapeBox(-3F, -5F, 7F, 2, 4, 15, 0F,-0.5F, 2F, -3F, -0.5F, 2F, -3F, -0.5F, 2F, -3F, -0.5F, 2F, -3F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, -4F); // Box 159
		turretModel[37].setRotationPoint(0F, -30.5F, 0F);
		turretModel[37].rotateAngleZ = 0.2268928F;

		turretModel[38].addShapeBox(-3F, -13F, 7F, 2, 4, 15, 0F,-0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 2F, -3F, -0.5F, 2F, -3F, -0.5F, 2F, -3F, -0.5F, 2F, -3F); // Box 160
		turretModel[38].setRotationPoint(0F, -30.5F, 0F);
		turretModel[38].rotateAngleZ = 0.2268928F;

		turretModel[39].addShapeBox(-5F, -2F, 23F, 15, 6, 1, 0F,-2F, 1F, 0F, 15F, -3F, 0F, 15F, -3F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 15F, 1F, 0F, 15F, 1F, 0F, -2F, 1F, 0F); // Box 161
		turretModel[39].setRotationPoint(0F, -24.5F, 0F);

		turretModel[40].addShapeBox(-5F, -2F, -23F, 15, 6, 1, 0F,-2F, 1F, 0F, 15F, -3F, 0F, 15F, -3F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 15F, 1F, 0F, 15F, 1F, 0F, -2F, 1F, 0F); // Box 162
		turretModel[40].setRotationPoint(0F, -24.5F, -1F);

		turretModel[41].addShapeBox(-30F, 0F, -3F, 4, 4, 6, 0F,1F, 0.2F, 2F, 1F, 0F, 2F, 1F, 0F, 2F, 1F, 0.2F, 2F, 2F, 1F, 2F, 2F, 1F, 2F, 2F, 1F, 2F, 2F, 1F, 2F); // Box 165
		turretModel[41].setRotationPoint(0F, -33.5F, 0F);

		turretModel[42].addShapeBox(-30F, -10F, -3F, 4, 4, 6, 0F,0F, 0.2F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.2F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F); // Box 166
		turretModel[42].setRotationPoint(0F, -33.5F, 0F);
		turretModel[42].rotateAngleZ = 0.20943951F;


		barrelModel = new ModelRendererTurbo[13];
		barrelModel[0] = new ModelRendererTurbo(this, 550, 600, textureX, textureY); // Import CR.Computerthingy?
		barrelModel[1] = new ModelRendererTurbo(this, 350, 798, textureX, textureY); // Import BL.DecorativeMGBase
		barrelModel[2] = new ModelRendererTurbo(this, 353, 800, textureX, textureY); // Import BL.DecorativeMGBarrel
		barrelModel[3] = new ModelRendererTurbo(this, 350, 800, textureX, textureY); // Import BL.DecorativeMGBase
		barrelModel[4] = new ModelRendererTurbo(this, 654, 372, textureX, textureY); // Import BL.GunHolder
		barrelModel[5] = new ModelRendererTurbo(this, 300, 880, textureX, textureY); // Import BL.BackFattyPart
		barrelModel[6] = new ModelRendererTurbo(this, 300, 910, textureX, textureY); // Import BL.MiddleyPart
		barrelModel[7] = new ModelRendererTurbo(this, 300, 940, textureX, textureY); // Import BL.End
		barrelModel[8] = new ModelRendererTurbo(this, 300, 880, textureX, textureY); // Box 123
		barrelModel[9] = new ModelRendererTurbo(this, 300, 880, textureX, textureY); // Box 129
		barrelModel[10] = new ModelRendererTurbo(this, 300, 880, textureX, textureY); // Box 130
		barrelModel[11] = new ModelRendererTurbo(this, 550, 100, textureX, textureY); // Box 132
		barrelModel[12] = new ModelRendererTurbo(this, 352, 800, textureX, textureY); // Box 139

		barrelModel[0].addShapeBox(-0.5F, -10.5F, -2F, 7, 4, 10, 0F,1F, -0.2F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 1.5F, 1F, -0.2F, 1.5F, 1F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 1.5F, 1F, 2F, 1.5F); // Import CR.Computerthingy?
		barrelModel[0].setRotationPoint(30F, -22F, -3F);

		barrelModel[1].addBox(-1F, -2F, -2F, 7, 3, 4, 0F); // Import BL.DecorativeMGBase
		barrelModel[1].setRotationPoint(7F, -33F, -14.5F);

		barrelModel[2].addBox(9F, -2.5F, -0.5F, 12, 1, 1, 0F); // Import BL.DecorativeMGBarrel
		barrelModel[2].setRotationPoint(7F, -33F, -14.5F);

		barrelModel[3].addBox(-7F, -3F, -1.5F, 16, 2, 3, 0F); // Import BL.DecorativeMGBase
		barrelModel[3].setRotationPoint(7F, -33F, -14.5F);

		barrelModel[4].addBox(-15F, -3F, 0F, 22, 6, 6, 0F); // Import BL.GunHolder
		barrelModel[4].setRotationPoint(30F, -22F, -3F);

		barrelModel[5].addShapeBox(5F, -2.5F, 0.5F, 20, 5, 5, 0F,0F, 0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0.5F); // Import BL.BackFattyPart
		barrelModel[5].setRotationPoint(30F, -22F, -3F);

		barrelModel[6].addShapeBox(25F, -2F, 1F, 30, 4, 4, 0F,0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F); // Import BL.MiddleyPart
		barrelModel[6].setRotationPoint(30F, -22F, -3F);

		barrelModel[7].addBox(65F, -1.5F, 1.5F, 4, 3, 3, 0F); // Import BL.End
		barrelModel[7].setRotationPoint(30F, -22F, -3F);

		barrelModel[8].addShapeBox(24F, -3F, 0.5F, 12, 5, 5, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 123
		barrelModel[8].setRotationPoint(30F, -22F, -3F);

		barrelModel[9].addShapeBox(-3F, 0F, 0.5F, 12, 5, 5, 0F,6F, 0.5F, 2.5F, 0F, 0.5F, 2.5F, 0F, 0.5F, 4F, 6F, 0.5F, 4.5F, 10F, 0.5F, 2.5F, -3F, -0.5F, 2.5F, -2F, -0.5F, 4F, 10F, 0.5F, 4.5F); // Box 129
		barrelModel[9].setRotationPoint(30F, -22F, -3F);

		barrelModel[10].addShapeBox(-3F, -6F, 0.5F, 12, 5, 5, 0F,-2F, -0.5F, 2.5F, -2F, -0.5F, 2.5F, -2F, -0.5F, 4F, -2F, -0.5F, 4.5F, 6F, 1.5F, 2.5F, 0F, 0.5F, 2.5F, 0F, 0.5F, 4F, 6F, 0.5F, 4.5F); // Box 130
		barrelModel[10].setRotationPoint(30F, -22F, -3F);

		barrelModel[11].addShapeBox(-9.5F, -10.5F, -2F, 7, 4, 10, 0F,-1F, -1.5F, 0F, 1F, -0.2F, 0F, 1F, -0.2F, 1.5F, -1F, -1.5F, 1.5F, 0F, 3F, 0F, 1F, 2F, 0F, 1F, 2F, 1.5F, 0F, 3F, 1.5F); // Box 132
		barrelModel[11].setRotationPoint(30F, -22F, -3F);

		barrelModel[12].addShapeBox(7F, -4F, 7.5F, 7, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 139
		barrelModel[12].setRotationPoint(30F, -22F, -3F);


		leftTrackModel = new ModelRendererTurbo[11];
		leftTrackModel[0] = new ModelRendererTurbo(this, 0, 100, textureX, textureY); // Import LT.FrontTrack
		leftTrackModel[1] = new ModelRendererTurbo(this, 0, 140, textureX, textureY); // Import LT.BottomTrack
		leftTrackModel[2] = new ModelRendererTurbo(this, 0, 180, textureX, textureY); // Import LT.FrontAngle
		leftTrackModel[3] = new ModelRendererTurbo(this, 0, 230, textureX, textureY); // Import LT.BackAngle
		leftTrackModel[4] = new ModelRendererTurbo(this, 0, 280, textureX, textureY); // Import LT.BackTrack
		leftTrackModel[5] = new ModelRendererTurbo(this, 680, 530, textureX, textureY); // Box 117
		leftTrackModel[6] = new ModelRendererTurbo(this, 680, 530, textureX, textureY); // Box 118
		leftTrackModel[7] = new ModelRendererTurbo(this, 680, 530, textureX, textureY); // Box 119
		leftTrackModel[8] = new ModelRendererTurbo(this, 680, 530, textureX, textureY); // Box 120
		leftTrackModel[9] = new ModelRendererTurbo(this, 680, 530, textureX, textureY); // Box 121
		leftTrackModel[10] = new ModelRendererTurbo(this, 680, 530, textureX, textureY); // Box 122

		leftTrackModel[0].addBox(0F, 0F, 0F, 1, 10, 8, 0F); // Import LT.FrontTrack
		leftTrackModel[0].setRotationPoint(59F, -6.5F, -25F);

		leftTrackModel[1].addBox(0F, 0F, 0F, 82, 1, 8, 0F); // Import LT.BottomTrack
		leftTrackModel[1].setRotationPoint(-36.5F, 9F, -25F);

		leftTrackModel[2].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Import LT.FrontAngle
		leftTrackModel[2].setRotationPoint(59F, 3F, -25F);
		leftTrackModel[2].rotateAngleZ = -1.169371F;

		leftTrackModel[3].addBox(0F, 0F, 0F, 1, 18, 8, 0F); // Import LT.BackAngle
		leftTrackModel[3].setRotationPoint(-53F, 2F, -25F);
		leftTrackModel[3].rotateAngleZ = 1.13446401F;

		leftTrackModel[4].addBox(0F, 0F, 0F, 1, 8, 8, 0F); // Import LT.BackTrack
		leftTrackModel[4].setRotationPoint(-53F, -6F, -25F);

		leftTrackModel[5].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // Box 117
		leftTrackModel[5].setRotationPoint(36F, 1F, -24F);

		leftTrackModel[6].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // Box 118
		leftTrackModel[6].setRotationPoint(22F, 1F, -24F);

		leftTrackModel[7].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // Box 119
		leftTrackModel[7].setRotationPoint(8F, 1F, -24F);

		leftTrackModel[8].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // Box 120
		leftTrackModel[8].setRotationPoint(-6F, 1F, -24F);

		leftTrackModel[9].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // Box 121
		leftTrackModel[9].setRotationPoint(-21F, 1F, -24F);

		leftTrackModel[10].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // Box 122
		leftTrackModel[10].setRotationPoint(-36F, 1F, -24F);


		rightTrackModel = new ModelRendererTurbo[11];
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
		rightTrackModel[10] = new ModelRendererTurbo(this, 680, 530, textureX, textureY); // Box 116

		rightTrackModel[0].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // Import RT.Wheel1Right
		rightTrackModel[0].setRotationPoint(36F, 1F, 18F);

		rightTrackModel[1].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // Import RT.Wheel2Right
		rightTrackModel[1].setRotationPoint(22F, 1F, 18F);

		rightTrackModel[2].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // Import RT.Wheel3Right
		rightTrackModel[2].setRotationPoint(8F, 1F, 18F);

		rightTrackModel[3].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // Import RT.Wheel4Right
		rightTrackModel[3].setRotationPoint(-6F, 1F, 18F);

		rightTrackModel[4].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // Import RT.Wheel5Right
		rightTrackModel[4].setRotationPoint(-21F, 1F, 18F);

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

		rightTrackModel[10].addBox(0F, 0F, 0F, 8, 8, 6, 0F); // Box 116
		rightTrackModel[10].setRotationPoint(-36F, 1F, 18F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}