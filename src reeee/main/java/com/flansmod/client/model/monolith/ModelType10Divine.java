//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Type10
// Model Creator: 
// Created on: 19.06.2016 - 23:17:40
// Last changed on: 19.06.2016 - 23:17:40

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelType10Divine extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelType10Divine() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[41];
		turretModel = new ModelRendererTurbo[85];
		barrelModel = new ModelRendererTurbo[8];
		leftTrackWheelModels = new ModelRendererTurbo[21];
		rightTrackWheelModels = new ModelRendererTurbo[21];
		leftTrackModel = new ModelRendererTurbo[7];
		rightTrackModel = new ModelRendererTurbo[7];

		initbodyModel_1();
		initturretModel_1();
		initbarrelModel_1();
		initleftTrackWheelModels_1();
		initrightTrackWheelModels_1();
		initleftTrackModel_1();
		initrightTrackModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import CR.RightFakeNoseAngle
		bodyModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import CR.RightBackNoseAngle
		bodyModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import CR.RightNoseBridgeAngle
		bodyModel[3] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Import CR.RightTopFrontAngle
		bodyModel[4] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import CR.RightUpperSidePlate
		bodyModel[5] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Import CR.LeftFakeNoseAngle
		bodyModel[6] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Import CR.LeftNoseBridgeAngle
		bodyModel[7] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Import CR.LeftTopFrontAngle
		bodyModel[8] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Import CR.LeftUpperSidePlate
		bodyModel[9] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Import CR.Core
		bodyModel[10] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Import CR.FrontAngle
		bodyModel[11] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import CR.NoseAngle
		bodyModel[12] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Import CR.BackCore
		bodyModel[13] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Import CR.LowerCore
		bodyModel[14] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Import CR.LowerBackCore
		bodyModel[15] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Import CR.ExhaustPort
		bodyModel[16] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Import CR.RightForwardAngle
		bodyModel[17] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Import CR.LeftForwardAngle
		bodyModel[18] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Import CR.MudflapRight
		bodyModel[19] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Import CR.MudflapLeft
		bodyModel[20] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Import CR.MiniExhaustRight
		bodyModel[21] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Import CR.MiniExhaustLeft
		bodyModel[22] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import CR.RightLight
		bodyModel[23] = new ModelRendererTurbo(this, 513, 17, textureX, textureY); // Import CR.UnderTurret
		bodyModel[24] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Import CR.LeftLowerSidePlate
		bodyModel[25] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Import CR.Computerthingy?
		bodyModel[26] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Import CR.RightLowerSidePlate
		bodyModel[27] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import CR.LeftLight
		bodyModel[28] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Box 12
		bodyModel[29] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 13
		bodyModel[30] = new ModelRendererTurbo(this, 977, 49, textureX, textureY); // Box 14
		bodyModel[31] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 15
		bodyModel[32] = new ModelRendererTurbo(this, 713, 73, textureX, textureY); // Box 16
		bodyModel[33] = new ModelRendererTurbo(this, 785, 73, textureX, textureY); // Box 17
		bodyModel[34] = new ModelRendererTurbo(this, 1001, 17, textureX, textureY); // Box 18
		bodyModel[35] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 19
		bodyModel[36] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 20
		bodyModel[37] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 21
		bodyModel[38] = new ModelRendererTurbo(this, 985, 121, textureX, textureY); // Box 210
		bodyModel[39] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 216
		bodyModel[40] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 218

		bodyModel[0].addBox(0F, 0F, 0F, 9, 1, 10, 0F); // Import CR.RightFakeNoseAngle
		bodyModel[0].setRotationPoint(44F, -11.5F, 16F);
		bodyModel[0].rotateAngleZ = -0.09075712F;

		bodyModel[1].addShapeBox(0F, 0F, 0F, 5, 5, 10, 0F,0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CR.RightBackNoseAngle
		bodyModel[1].setRotationPoint(25F, -16F, 16F);

		bodyModel[2].addBox(0F, 0F, 0F, 15, 3, 10, 0F); // Import CR.RightNoseBridgeAngle
		bodyModel[2].setRotationPoint(30F, -13.5F, 16F);
		bodyModel[2].rotateAngleZ = -0.1396263F;

		bodyModel[3].addShapeBox(0F, 0F, 0F, 8, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 5F, 0F); // Import CR.RightTopFrontAngle
		bodyModel[3].setRotationPoint(53F, -10.6F, 16F);
		bodyModel[3].rotateAngleZ = -0.43633231F;

		bodyModel[4].addBox(0F, 0F, 0F, 103, 9, 1, 0F); // Import CR.RightUpperSidePlate
		bodyModel[4].setRotationPoint(-50F, -11F, 26F);

		bodyModel[5].addBox(0F, 0F, 0F, 9, 1, 10, 0F); // Import CR.LeftFakeNoseAngle
		bodyModel[5].setRotationPoint(44F, -11.5F, -26F);
		bodyModel[5].rotateAngleZ = -0.09075712F;

		bodyModel[6].addBox(0F, 0F, 0F, 15, 3, 10, 0F); // Import CR.LeftNoseBridgeAngle
		bodyModel[6].setRotationPoint(30F, -13.5F, -26F);
		bodyModel[6].rotateAngleZ = -0.1396263F;

		bodyModel[7].addShapeBox(0F, 0F, 0F, 8, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 5F, 0F); // Import CR.LeftTopFrontAngle
		bodyModel[7].setRotationPoint(53F, -10.6F, -26F);
		bodyModel[7].rotateAngleZ = -0.4363323F;

		bodyModel[8].addBox(0F, 0F, 1F, 103, 9, 1, 0F); // Import CR.LeftUpperSidePlate
		bodyModel[8].setRotationPoint(-50F, -11F, -28F);

		bodyModel[9].addBox(0F, 0F, 0F, 60, 13, 52, 0F); // Import CR.Core
		bodyModel[9].setRotationPoint(-35F, -16F, -26F);

		bodyModel[10].addBox(0F, 0F, 0F, 7, 12, 32, 0F); // Import CR.FrontAngle
		bodyModel[10].setRotationPoint(53F, -10.5F, -16F);
		bodyModel[10].rotateAngleZ = -0.4363323F;

		bodyModel[11].addBox(0F, 0F, 0F, 28, 5, 32, 0F); // Import CR.NoseAngle
		bodyModel[11].setRotationPoint(25F, -13F, -16F);
		bodyModel[11].rotateAngleZ = -0.09075712F;

		bodyModel[12].addShapeBox(0F, 0F, 0F, 25, 11, 52, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F); // Import CR.BackCore
		bodyModel[12].setRotationPoint(-60F, -17F, -26F);

		bodyModel[13].addBox(0F, 0F, 0F, 90, 12, 32, 0F); // Import CR.LowerCore
		bodyModel[13].setRotationPoint(-36F, -9F, -16F);

		bodyModel[14].addBox(0F, 0F, 0F, 26, 10, 32, 0F); // Import CR.LowerBackCore
		bodyModel[14].setRotationPoint(-56.5F, -15.5F, -16F);
		bodyModel[14].rotateAngleZ = -0.3490658F;

		bodyModel[15].addBox(0F, 0F, 0F, 4, 8, 30, 0F); // Import CR.ExhaustPort
		bodyModel[15].setRotationPoint(-64F, -15F, -15F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 6, 10, 0F); // Import CR.RightForwardAngle
		bodyModel[16].setRotationPoint(59.3F, -6.8F, 16F);
		bodyModel[16].rotateAngleZ = 0.4363323F;

		bodyModel[17].addBox(0F, 0F, 0F, 1, 6, 10, 0F); // Import CR.LeftForwardAngle
		bodyModel[17].setRotationPoint(59.3F, -6.8F, -26F);
		bodyModel[17].rotateAngleZ = 0.4363323F;

		bodyModel[18].addBox(0F, 0F, 0F, 1, 6, 10, 0F); // Import CR.MudflapRight
		bodyModel[18].setRotationPoint(-57F, -6F, 16F);
		bodyModel[18].rotateAngleZ = -0.2094395F;

		bodyModel[19].addBox(0F, 0F, 0F, 1, 6, 10, 0F); // Import CR.MudflapLeft
		bodyModel[19].setRotationPoint(-57F, -6F, -26F);
		bodyModel[19].rotateAngleZ = -0.2094395F;

		bodyModel[20].addBox(0F, 0F, 0F, 2, 6, 4, 0F); // Import CR.MiniExhaustRight
		bodyModel[20].setRotationPoint(-62F, -15F, 17F);

		bodyModel[21].addBox(0F, 0F, 0F, 2, 6, 4, 0F); // Import CR.MiniExhaustLeft
		bodyModel[21].setRotationPoint(-62F, -15F, -21F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Import CR.RightLight
		bodyModel[22].setRotationPoint(55F, -11F, 19F);

		bodyModel[23].addBox(0F, 0F, 0F, 28, 1, 28, 0F); // Import CR.UnderTurret
		bodyModel[23].setRotationPoint(-14F, -17F, -14F);

		bodyModel[24].addBox(0F, 0F, 1F, 98, 6, 0, 0F); // Import CR.LeftLowerSidePlate
		bodyModel[24].setRotationPoint(-48F, -2F, -27.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 9, 4, 28, 0F,0F, 0F, 2F, 0F, -3F, 2F, 0F, -3F, -13F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -13F, 0F, 0F, -4F); // Import CR.Computerthingy?
		bodyModel[25].setRotationPoint(25F, -15.5F, -14F);

		bodyModel[26].addBox(0F, 0F, 0F, 98, 6, 0, 0F); // Import CR.RightLowerSidePlate
		bodyModel[26].setRotationPoint(-48F, -2F, 26.5F);

		bodyModel[27].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Import CR.LeftLight
		bodyModel[27].setRotationPoint(55F, -11F, -24F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 12
		bodyModel[28].setRotationPoint(-60F, -8F, -18F);
		bodyModel[28].rotateAngleY = -3.14159265F;

		bodyModel[29].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 13
		bodyModel[29].setRotationPoint(-60F, -8F, 23F);
		bodyModel[29].rotateAngleY = -3.14159265F;

		bodyModel[30].addBox(0F, 0F, 0F, 2, 2, 15, 0F); // Box 14
		bodyModel[30].setRotationPoint(-62F, -17.5F, -17F);

		bodyModel[31].addBox(0F, 0F, 0F, 2, 2, 15, 0F); // Box 15
		bodyModel[31].setRotationPoint(-62F, -17.5F, 2F);

		bodyModel[32].addBox(0F, 0F, 0F, 4, 8, 30, 0F); // Box 16
		bodyModel[32].setRotationPoint(-38F, -18F, -15F);
		bodyModel[32].rotateAngleZ = 4.71238898F;

		bodyModel[33].addBox(0F, 0F, 0F, 4, 8, 30, 0F); // Box 17
		bodyModel[33].setRotationPoint(-48F, -18F, -15F);
		bodyModel[33].rotateAngleZ = 4.71238898F;

		bodyModel[34].addBox(0F, 0F, 0F, 2, 6, 4, 0F); // Box 18
		bodyModel[34].setRotationPoint(-39F, -18F, 17F);
		bodyModel[34].rotateAngleZ = 4.71238898F;

		bodyModel[35].addBox(0F, 0F, 0F, 2, 6, 4, 0F); // Box 19
		bodyModel[35].setRotationPoint(-49F, -18F, 17F);
		bodyModel[35].rotateAngleZ = 4.71238898F;

		bodyModel[36].addBox(0F, 0F, 0F, 2, 6, 4, 0F); // Box 20
		bodyModel[36].setRotationPoint(-49F, -18F, -21F);
		bodyModel[36].rotateAngleZ = 4.71238898F;

		bodyModel[37].addBox(0F, 0F, 0F, 2, 6, 4, 0F); // Box 21
		bodyModel[37].setRotationPoint(-39F, -18F, -21F);
		bodyModel[37].rotateAngleZ = 4.71238898F;

		bodyModel[38].addShapeBox(0F, 0F, 0F, 5, 5, 10, 0F,0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[38].setRotationPoint(25F, -16F, -26F);

		bodyModel[39].addShapeBox(1F, 0F, -10F, 3, 2, 5, 0F,0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F); // Box 216
		bodyModel[39].setRotationPoint(29F, -13.8F, 18.5F);

		bodyModel[40].addShapeBox(-5F, 0F, -10F, 6, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[40].setRotationPoint(29F, -13.8F, 16.5F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 913, 41, textureX, textureY); // Import TR.Center
		turretModel[1] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Import TR.ConverttobasketArea
		turretModel[2] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import TR.TopAngleFront
		turretModel[3] = new ModelRendererTurbo(this, 609, 57, textureX, textureY); // Import TR.TopAngleForward
		turretModel[4] = new ModelRendererTurbo(this, 545, 49, textureX, textureY); // Import TR.RightSideAngleArea
		turretModel[5] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Import TR.RightSide
		turretModel[6] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Import TR.backupper
		turretModel[7] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Import TR.CageBottom
		turretModel[8] = new ModelRendererTurbo(this, 601, 17, textureX, textureY); // Import TR.CageRight
		turretModel[9] = new ModelRendererTurbo(this, 681, 17, textureX, textureY); // Import TR.CageLeft
		turretModel[10] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Import TR.CageBack
		turretModel[11] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import TR.RightAntennaBase
		turretModel[12] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import TR.LeftAntennaBase
		turretModel[13] = new ModelRendererTurbo(this, 857, 25, textureX, textureY); // Import TR.RightAntenna
		turretModel[14] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Import TR.Camera
		turretModel[15] = new ModelRendererTurbo(this, 601, 25, textureX, textureY); // Import TR.BackCamera?Stand
		turretModel[16] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import TR.Parascope?
		turretModel[17] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Import TR.CommanderHatch
		turretModel[18] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Import TR.GunStick
		turretModel[19] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Import TR.FrontSensorThing
		turretModel[20] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Import TR.RightBackAngleLand
		turretModel[21] = new ModelRendererTurbo(this, 657, 73, textureX, textureY); // Box 8
		turretModel[22] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 11
		turretModel[23] = new ModelRendererTurbo(this, 977, 41, textureX, textureY); // Box 1
		turretModel[24] = new ModelRendererTurbo(this, 913, 49, textureX, textureY); // Box 2
		turretModel[25] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 3
		turretModel[26] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 4
		turretModel[27] = new ModelRendererTurbo(this, 705, 113, textureX, textureY); // Box 157
		turretModel[28] = new ModelRendererTurbo(this, 769, 113, textureX, textureY); // Box 159
		turretModel[29] = new ModelRendererTurbo(this, 641, 113, textureX, textureY); // Box 160
		turretModel[30] = new ModelRendererTurbo(this, 817, 113, textureX, textureY); // Box 161
		turretModel[31] = new ModelRendererTurbo(this, 825, 121, textureX, textureY); // Box 162
		turretModel[32] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Box 163
		turretModel[33] = new ModelRendererTurbo(this, 601, 41, textureX, textureY); // Box 164
		turretModel[34] = new ModelRendererTurbo(this, 857, 49, textureX, textureY); // Box 165
		turretModel[35] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 166
		turretModel[36] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 167
		turretModel[37] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Box 168
		turretModel[38] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Box 169
		turretModel[39] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Box 170
		turretModel[40] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Box 171
		turretModel[41] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Box 172
		turretModel[42] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Box 173
		turretModel[43] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Box 174
		turretModel[44] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 175
		turretModel[45] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 176
		turretModel[46] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 177
		turretModel[47] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 178
		turretModel[48] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 179
		turretModel[49] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 180
		turretModel[50] = new ModelRendererTurbo(this, 641, 17, textureX, textureY); // Box 181
		turretModel[51] = new ModelRendererTurbo(this, 721, 17, textureX, textureY); // Box 182
		turretModel[52] = new ModelRendererTurbo(this, 881, 17, textureX, textureY); // Box 183
		turretModel[53] = new ModelRendererTurbo(this, 961, 17, textureX, textureY); // Box 184
		turretModel[54] = new ModelRendererTurbo(this, 1017, 17, textureX, textureY); // Box 185
		turretModel[55] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 186
		turretModel[56] = new ModelRendererTurbo(this, 513, 25, textureX, textureY); // Box 187
		turretModel[57] = new ModelRendererTurbo(this, 641, 121, textureX, textureY); // Box 188
		turretModel[58] = new ModelRendererTurbo(this, 897, 121, textureX, textureY); // Box 189
		turretModel[59] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 190
		turretModel[60] = new ModelRendererTurbo(this, 81, 129, textureX, textureY); // Box 191
		turretModel[61] = new ModelRendererTurbo(this, 161, 129, textureX, textureY); // Box 192
		turretModel[62] = new ModelRendererTurbo(this, 273, 129, textureX, textureY); // Box 193
		turretModel[63] = new ModelRendererTurbo(this, 353, 129, textureX, textureY); // Box 194
		turretModel[64] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 195
		turretModel[65] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 196
		turretModel[66] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 198
		turretModel[67] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 200
		turretModel[68] = new ModelRendererTurbo(this, 521, 105, textureX, textureY); // Box 202
		turretModel[69] = new ModelRendererTurbo(this, 273, 113, textureX, textureY); // Box 204
		turretModel[70] = new ModelRendererTurbo(this, 393, 113, textureX, textureY); // Box 206
		turretModel[71] = new ModelRendererTurbo(this, 457, 113, textureX, textureY); // Box 208
		turretModel[72] = new ModelRendererTurbo(this, 945, 121, textureX, textureY); // Box 209
		turretModel[73] = new ModelRendererTurbo(this, 713, 25, textureX, textureY); // Box 211
		turretModel[74] = new ModelRendererTurbo(this, 689, 121, textureX, textureY); // Box 212
		turretModel[75] = new ModelRendererTurbo(this, 865, 25, textureX, textureY); // Box 213
		turretModel[76] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 214
		turretModel[77] = new ModelRendererTurbo(this, 1017, 25, textureX, textureY); // Box 215
		turretModel[78] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 219
		turretModel[79] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 220
		turretModel[80] = new ModelRendererTurbo(this, 529, 25, textureX, textureY); // Box 221
		turretModel[81] = new ModelRendererTurbo(this, 601, 25, textureX, textureY); // Box 222
		turretModel[82] = new ModelRendererTurbo(this, 905, 121, textureX, textureY); // Box 223
		turretModel[83] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 224
		turretModel[84] = new ModelRendererTurbo(this, 857, 25, textureX, textureY); // Box 225

		turretModel[0].addBox(7F, 0F, -15F, 16, 10, 30, 0F); // Import TR.Center
		turretModel[0].setRotationPoint(0F, -26.9F, 0F);

		turretModel[1].addShapeBox(-38F, 0F, -15F, 30, 8, 30, 0F,0F, 0F, 4F, 15F, 0F, 0F, 15F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 15F, 0F, 0F, 15F, 0F, 0F, 0F, 0F, 4F); // Import TR.ConverttobasketArea
		turretModel[1].setRotationPoint(0F, -26.9F, 0F);

		turretModel[2].addShapeBox(23F, 0F, -15F, 14, 4, 30, 0F,0F, 2F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import TR.TopAngleFront
		turretModel[2].setRotationPoint(0F, -26.2F, 0F);
		turretModel[2].rotateAngleZ = -0.05235988F;

		turretModel[3].addShapeBox(0F, 0F, 0F, 7, 5, 28, 0F,0F, 0F, 0F, 0F, -3F, -2F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F); // Import TR.TopAngleForward
		turretModel[3].setRotationPoint(37F, -25.3F, -14F);

		turretModel[4].addShapeBox(-8F, 2F, 17F, 31, 1, 10, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 2F, 2F, 0F, 2F, 1F); // Import TR.RightSideAngleArea
		turretModel[4].setRotationPoint(0F, -34.7F, 0F);
		turretModel[4].rotateAngleX = -0.48869219F;

		turretModel[5].addShapeBox(-30F, 0F, 15F, 22, 1, 8, 0F,3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0.8F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, -0.7F, 0F, 0.8F, 0F); // Import TR.RightSide
		turretModel[5].setRotationPoint(0F, -18.9F, 0F);

		turretModel[6].addShapeBox(-38F, 0F, -24F, 30, 5, 48, 0F,0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import TR.backupper
		turretModel[6].setRotationPoint(0F, -23.9F, 0F);

		turretModel[7].addBox(-53F, 0F, -19F, 1, 1, 38, 0F); // Import TR.CageBottom
		turretModel[7].setRotationPoint(0F, -18.9F, 0F);
		turretModel[7].rotateAngleZ = -0.05235988F;

		turretModel[8].addBox(-53F, -0.1F, 18F, 15, 1, 1, 0F); // Import TR.CageRight
		turretModel[8].setRotationPoint(0F, -24.4F, 0F);
		turretModel[8].rotateAngleZ = -0.05235988F;

		turretModel[9].addBox(-53F, -0.1F, -19F, 15, 1, 1, 0F); // Import TR.CageLeft
		turretModel[9].setRotationPoint(0F, -24.2F, 0F);
		turretModel[9].rotateAngleZ = -0.05235988F;

		turretModel[10].addBox(-53F, 0F, -19F, 1, 1, 38, 0F); // Import TR.CageBack
		turretModel[10].setRotationPoint(0F, -24.4F, 0F);
		turretModel[10].rotateAngleZ = -0.05235988F;

		turretModel[11].addBox(46F, 7F, 21F, 2, 6, 2, 0F); // Import TR.RightAntennaBase
		turretModel[11].setRotationPoint(0F, -55.9F, 0F);
		turretModel[11].rotateAngleZ = -2.26892803F;

		turretModel[12].addBox(46F, 7F, -23F, 2, 6, 2, 0F); // Import TR.LeftAntennaBase
		turretModel[12].setRotationPoint(0F, -55.9F, 0F);
		turretModel[12].rotateAngleZ = -2.26892803F;

		turretModel[13].addShapeBox(47F, 13F, 21.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 60F, -0.5F, -0.5F, 60F, -0.5F, -0.5F, 60F, -0.5F, -0.5F, 60F, -0.5F); // Import TR.RightAntenna
		turretModel[13].setRotationPoint(1F, -55.9F, 0F);
		turretModel[13].rotateAngleZ = -2.26892803F;

		turretModel[14].addShapeBox(31F, 2F, 1.5F, 5, 3, 3, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Import TR.Camera
		turretModel[14].setRotationPoint(0F, -30.9F, 0F);
		turretModel[14].rotateAngleZ = -0.03490659F;

		turretModel[15].addShapeBox(-19F, 0F, -14F, 10, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 2F, 0F, 1.5F); // Import TR.BackCamera?Stand
		turretModel[15].setRotationPoint(1F, -32.9F, 0F);

		turretModel[16].addShapeBox(-16F, 0F, -13F, 6, 4, 5, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Import TR.Parascope?
		turretModel[16].setRotationPoint(1F, -36.9F, 0F);

		turretModel[17].addShapeBox(1F, 0F, -10F, 4, 4, 8, 0F,0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F); // Import TR.CommanderHatch
		turretModel[17].setRotationPoint(2F, -29.9F, 0F);

		turretModel[18].addBox(9F, 0F, -2F, 1, 11, 1, 0F); // Import TR.GunStick
		turretModel[18].setRotationPoint(0F, -39.9F, 0F);
		turretModel[18].rotateAngleZ = -0.33460754F;

		turretModel[19].addBox(18F, 0F, 5F, 6, 3, 6, 0F); // Import TR.FrontSensorThing
		turretModel[19].setRotationPoint(4F, -29.9F, 0F);

		turretModel[20].addShapeBox(-30F, 0F, 21F, 22, 3, 5, 0F,0F, 2F, 1F, 0F, 0F, 3F, 0F, 2F, 1F, 8F, 1.5F, 0.2F, 8F, -1.8F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 8F, -4.5F, 0.2F); // Import TR.RightBackAngleLand
		turretModel[20].setRotationPoint(0F, -34.9F, 0F);
		turretModel[20].rotateAngleX = -0.48869219F;

		turretModel[21].addShapeBox(-8F, 4F, -28F, 31, 1, 10, 0F,0F, 4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 1F, 0F, 2F, 2F, 0F, 3F, 0F, 0F, 2F, 0F); // Box 8
		turretModel[21].setRotationPoint(0F, -36.7F, 0F);
		turretModel[21].rotateAngleX = 0.48869219F;

		turretModel[22].addShapeBox(16.5F, 0F, 5F, 10, 3, 6, 0F,1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 3F, 1F, 2F, 0F, 1F, 2F, 0F, 1F, 2F, 3F, 1F, 2F); // Box 11
		turretModel[22].setRotationPoint(0F, -30.9F, 0F);

		turretModel[23].addBox(11F, -7F, 0.5F, 2, 3, 5, 0F); // Box 1
		turretModel[23].setRotationPoint(0F, -31.9F, 0F);
		turretModel[23].rotateAngleZ = -0.03490659F;

		turretModel[24].addShapeBox(-5F, 0F, -10F, 4, 4, 8, 0F,0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F); // Box 2
		turretModel[24].setRotationPoint(0F, -29.9F, 0F);

		turretModel[25].addBox(-5F, 0F, -10F, 0, 0, 0, 0F); // Box 3
		turretModel[25].setRotationPoint(0F, -28.9F, 0F);

		turretModel[26].addBox(9F, -5F, -3.5F, 7, 5, 4, 0F); // Box 4
		turretModel[26].setRotationPoint(0F, -31.9F, 0F);
		turretModel[26].rotateAngleZ = -0.08726646F;

		turretModel[27].addShapeBox(-30F, 0F, 15F, 22, 1, 8, 0F,2.5F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, -0.7F, 0F, 0.8F, 0F, 0F, 0.8F, 0F); // Box 157
		turretModel[27].setRotationPoint(0F, -18.9F, -38F);

		turretModel[28].addShapeBox(0F, 0F, 0F, 22, 3, 5, 0F,8F, 1.5F, 0.2F, 0F, 2F, 1F, 0F, 0F, 3F, 0F, 2F, 1F, 8F, -4.5F, 0.2F, 0F, -2F, -1F, 0F, 0F, 0F, 8F, -1.8F, 0F); // Box 159
		turretModel[28].setRotationPoint(-30F, -22.4F, -23F);
		turretModel[28].rotateAngleX = 0.48869219F;

		turretModel[29].addShapeBox(0F, 2F, 0F, 6, 8, 9, 0F,0F, 0F, 0F, 15F, -3F, 3F, 5F, -3F, -1.5F, 0F, -2.6F, -0.2F, 0F, 0F, 0F, 6F, -1F, 1F, -1F, 0F, -2F, 0F, 0F, -0.7F); // Box 160
		turretModel[29].setRotationPoint(23F, -26.7F, 15F);

		turretModel[30].addShapeBox(0F, 2F, 0F, 6, 8, 9, 0F,0F, -2.6F, -0.2F, 5F, -3F, -1.5F, 15F, -3F, 3F, 0F, 0F, 0F, 0F, 0F, -0.7F, -1F, 0F, -2F, 6F, -1F, 1F, 0F, 0F, 0F); // Box 161
		turretModel[30].setRotationPoint(23F, -26.7F, -24F);

		turretModel[31].addShapeBox(0F, 2F, 0F, 21, 5, 30, 0F,0F, 0F, 0F, -0.5F, -1.5F, -3F, -0.5F, -1.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -1F, -2F, -9F, -1F, -2F, 0F, 0F, 0F); // Box 162
		turretModel[31].setRotationPoint(23F, -24.7F, -15F);

		turretModel[32].addBox(-53F, 3F, -19F, 1, 1, 38, 0F); // Box 163
		turretModel[32].setRotationPoint(0F, -24.4F, 0F);
		turretModel[32].rotateAngleZ = -0.05235988F;

		turretModel[33].addBox(-53F, 2.95F, 18F, 15, 1, 1, 0F); // Box 164
		turretModel[33].setRotationPoint(0F, -24.4F, 0F);
		turretModel[33].rotateAngleZ = -0.05235988F;

		turretModel[34].addBox(-53F, 2.95F, -19F, 15, 1, 1, 0F); // Box 165
		turretModel[34].setRotationPoint(0F, -24.2F, 0F);
		turretModel[34].rotateAngleZ = -0.05235988F;

		turretModel[35].addBox(-53F, -0.0499999999999998F, 18F, 1, 6, 1, 0F); // Box 166
		turretModel[35].setRotationPoint(0F, -24.4F, 0F);
		turretModel[35].rotateAngleZ = -0.05235988F;

		turretModel[36].addBox(-50F, -0.0499999999999998F, 18F, 1, 6, 1, 0F); // Box 167
		turretModel[36].setRotationPoint(0F, -24.4F, 0F);
		turretModel[36].rotateAngleZ = -0.05235988F;

		turretModel[37].addBox(-47F, -0.0499999999999998F, 18F, 1, 6, 1, 0F); // Box 168
		turretModel[37].setRotationPoint(0F, -24.4F, 0F);
		turretModel[37].rotateAngleZ = -0.05235988F;

		turretModel[38].addBox(-44F, -0.0499999999999998F, 18F, 1, 6, 1, 0F); // Box 169
		turretModel[38].setRotationPoint(0F, -24.4F, 0F);
		turretModel[38].rotateAngleZ = -0.05235988F;

		turretModel[39].addBox(-41F, -0.0499999999999998F, 18F, 1, 6, 1, 0F); // Box 170
		turretModel[39].setRotationPoint(0F, -24.4F, 0F);
		turretModel[39].rotateAngleZ = -0.05235988F;

		turretModel[40].addBox(-53F, -0.0499999999999998F, 18F, 1, 6, 1, 0F); // Box 171
		turretModel[40].setRotationPoint(0F, -24.4F, -37F);
		turretModel[40].rotateAngleZ = -0.05235988F;

		turretModel[41].addBox(-50F, -0.0499999999999998F, 18F, 1, 6, 1, 0F); // Box 172
		turretModel[41].setRotationPoint(0F, -24.4F, -37F);
		turretModel[41].rotateAngleZ = -0.05235988F;

		turretModel[42].addBox(-47F, -0.0499999999999998F, 18F, 1, 6, 1, 0F); // Box 173
		turretModel[42].setRotationPoint(0F, -24.4F, -37F);
		turretModel[42].rotateAngleZ = -0.05235988F;

		turretModel[43].addBox(-44F, -0.0499999999999998F, 18F, 1, 6, 1, 0F); // Box 174
		turretModel[43].setRotationPoint(0F, -24.4F, -37F);
		turretModel[43].rotateAngleZ = -0.05235988F;

		turretModel[44].addBox(-41F, -0.0499999999999998F, 18F, 1, 6, 1, 0F); // Box 175
		turretModel[44].setRotationPoint(0F, -24.4F, -37F);
		turretModel[44].rotateAngleZ = -0.05235988F;

		turretModel[45].addBox(-53F, -0.0499999999999998F, 21F, 1, 6, 1, 0F); // Box 176
		turretModel[45].setRotationPoint(0F, -24.4F, -37F);
		turretModel[45].rotateAngleZ = -0.05235988F;

		turretModel[46].addBox(-53F, -0.0499999999999998F, 24F, 1, 6, 1, 0F); // Box 177
		turretModel[46].setRotationPoint(0F, -24.4F, -37F);
		turretModel[46].rotateAngleZ = -0.05235988F;

		turretModel[47].addBox(-53F, -0.0499999999999998F, 24F, 1, 6, 1, 0F); // Box 178
		turretModel[47].setRotationPoint(0F, -24.4F, -34F);
		turretModel[47].rotateAngleZ = -0.05235988F;

		turretModel[48].addBox(-53F, -0.0499999999999998F, 15F, 1, 6, 1, 0F); // Box 179
		turretModel[48].setRotationPoint(0F, -24.4F, 0F);
		turretModel[48].rotateAngleZ = -0.05235988F;

		turretModel[49].addBox(-53F, -0.0499999999999998F, 12F, 1, 6, 1, 0F); // Box 180
		turretModel[49].setRotationPoint(0F, -24.4F, 0F);
		turretModel[49].rotateAngleZ = -0.05235988F;

		turretModel[50].addBox(-53F, -0.0499999999999998F, 9F, 1, 6, 1, 0F); // Box 181
		turretModel[50].setRotationPoint(0F, -24.4F, 0F);
		turretModel[50].rotateAngleZ = -0.05235988F;

		turretModel[51].addBox(-53F, -0.0499999999999998F, 6F, 1, 6, 1, 0F); // Box 182
		turretModel[51].setRotationPoint(0F, -24.4F, 0F);
		turretModel[51].rotateAngleZ = -0.05235988F;

		turretModel[52].addBox(-53F, -0.0499999999999998F, 3F, 1, 6, 1, 0F); // Box 183
		turretModel[52].setRotationPoint(0F, -24.4F, 0F);
		turretModel[52].rotateAngleZ = -0.05235988F;

		turretModel[53].addBox(-53F, -0.0499999999999998F, 0F, 1, 6, 1, 0F); // Box 184
		turretModel[53].setRotationPoint(0F, -24.4F, 0F);
		turretModel[53].rotateAngleZ = -0.05235988F;

		turretModel[54].addBox(-53F, -0.0499999999999998F, 27F, 1, 6, 1, 0F); // Box 185
		turretModel[54].setRotationPoint(0F, -24.4F, -34F);
		turretModel[54].rotateAngleZ = -0.05235988F;

		turretModel[55].addBox(-53F, -0.0499999999999998F, 30F, 1, 6, 1, 0F); // Box 186
		turretModel[55].setRotationPoint(0F, -24.4F, -34F);
		turretModel[55].rotateAngleZ = -0.05235988F;

		turretModel[56].addBox(-53F, -0.0499999999999998F, 33F, 1, 6, 1, 0F); // Box 187
		turretModel[56].setRotationPoint(0F, -24.4F, -34F);
		turretModel[56].rotateAngleZ = -0.05235988F;

		turretModel[57].addBox(-51F, 0F, -19F, 1, 1, 38, 0F); // Box 188
		turretModel[57].setRotationPoint(0F, -18.9F, 0F);
		turretModel[57].rotateAngleZ = -0.05235988F;

		turretModel[58].addBox(-49F, 0F, -19F, 1, 1, 38, 0F); // Box 189
		turretModel[58].setRotationPoint(0F, -18.9F, 0F);
		turretModel[58].rotateAngleZ = -0.05235988F;

		turretModel[59].addBox(-47F, 0F, -19F, 1, 1, 38, 0F); // Box 190
		turretModel[59].setRotationPoint(0F, -18.9F, 0F);
		turretModel[59].rotateAngleZ = -0.05235988F;

		turretModel[60].addBox(-45F, 0F, -19F, 1, 1, 38, 0F); // Box 191
		turretModel[60].setRotationPoint(0F, -18.9F, 0F);
		turretModel[60].rotateAngleZ = -0.05235988F;

		turretModel[61].addBox(-43F, 0F, -19F, 1, 1, 38, 0F); // Box 192
		turretModel[61].setRotationPoint(0F, -18.9F, 0F);
		turretModel[61].rotateAngleZ = -0.05235988F;

		turretModel[62].addBox(-41F, 0F, -19F, 1, 1, 38, 0F); // Box 193
		turretModel[62].setRotationPoint(0F, -18.9F, 0F);
		turretModel[62].rotateAngleZ = -0.05235988F;

		turretModel[63].addBox(-39F, 0F, -19F, 1, 1, 38, 0F); // Box 194
		turretModel[63].setRotationPoint(0F, -18.9F, 0F);
		turretModel[63].rotateAngleZ = -0.05235988F;

		turretModel[64].addBox(-53F, 5.9F, 18F, 15, 1, 1, 0F); // Box 195
		turretModel[64].setRotationPoint(0F, -24.4F, 0F);
		turretModel[64].rotateAngleZ = -0.05235988F;

		turretModel[65].addBox(-53F, 5.9F, -19F, 15, 1, 1, 0F); // Box 196
		turretModel[65].setRotationPoint(0F, -24.2F, 0F);
		turretModel[65].rotateAngleZ = -0.05235988F;

		turretModel[66].addBox(-53F, 5.2F, -13F, 15, 1, 1, 0F); // Box 198
		turretModel[66].setRotationPoint(0F, -24.2F, 0F);
		turretModel[66].rotateAngleZ = -0.05235988F;

		turretModel[67].addBox(-53F, 5.2F, -7F, 15, 1, 1, 0F); // Box 200
		turretModel[67].setRotationPoint(0F, -24.2F, 0F);
		turretModel[67].rotateAngleZ = -0.05235988F;

		turretModel[68].addBox(-53F, 5.2F, -1F, 15, 1, 1, 0F); // Box 202
		turretModel[68].setRotationPoint(0F, -24.2F, 0F);
		turretModel[68].rotateAngleZ = -0.05235988F;

		turretModel[69].addBox(-53F, 5.2F, 0F, 15, 1, 1, 0F); // Box 204
		turretModel[69].setRotationPoint(0F, -24.2F, 0F);
		turretModel[69].rotateAngleZ = -0.05235988F;

		turretModel[70].addBox(-53F, 5.2F, 6F, 15, 1, 1, 0F); // Box 206
		turretModel[70].setRotationPoint(0F, -24.2F, 0F);
		turretModel[70].rotateAngleZ = -0.05235988F;

		turretModel[71].addBox(-53F, 5.2F, 12F, 15, 1, 1, 0F); // Box 208
		turretModel[71].setRotationPoint(0F, -24.2F, 0F);
		turretModel[71].rotateAngleZ = -0.05235988F;

		turretModel[72].addShapeBox(-5F, 0F, -10F, 4, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		turretModel[72].setRotationPoint(4F, -29.9F, -2F);

		turretModel[73].addShapeBox(1F, 0F, -10F, 3, 1, 5, 0F,0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F); // Box 211
		turretModel[73].setRotationPoint(14F, -27.9F, -3F);

		turretModel[74].addShapeBox(-5F, 0F, -10F, 3, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		turretModel[74].setRotationPoint(17F, -27.9F, -5F);

		turretModel[75].addShapeBox(-5F, 0F, -10F, 3, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F); // Box 213
		turretModel[75].setRotationPoint(14F, -27.9F, -3F);

		turretModel[76].addShapeBox(0F, 0F, -4F, 2, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		turretModel[76].setRotationPoint(9F, -28.9F, -7F);
		turretModel[76].rotateAngleX = 0.2443461F;
		turretModel[76].rotateAngleY = 0.68067841F;

		turretModel[77].addBox(9F, -1F, -2F, 1, 11, 1, 0F); // Box 215
		turretModel[77].setRotationPoint(-1F, -28.9F, 0F);
		turretModel[77].rotateAngleZ = 0.34906585F;

		turretModel[78].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		turretModel[78].setRotationPoint(33F, -22.9F, -21F);
		turretModel[78].rotateAngleZ = -0.6981317F;

		turretModel[79].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		turretModel[79].setRotationPoint(31.2F, -23.4F, -21.5F);
		turretModel[79].rotateAngleZ = -0.6981317F;

		turretModel[80].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		turretModel[80].setRotationPoint(29F, -23.4F, -22F);
		turretModel[80].rotateAngleZ = -0.6981317F;

		turretModel[81].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		turretModel[81].setRotationPoint(26.8F, -23.4F, -22.5F);
		turretModel[81].rotateAngleZ = -0.6981317F;

		turretModel[82].addShapeBox(0F, 0F, 0F, 6, 4, 5, 0F,-1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		turretModel[82].setRotationPoint(18.8F, -26.7F, -19.5F);

		turretModel[83].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		turretModel[83].setRotationPoint(-39F, -35.9F, -0.5F);

		turretModel[84].addShapeBox(47F, 13F, -21.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 60F, -0.5F, -0.5F, 60F, -0.5F, -0.5F, 60F, -0.5F, -0.5F, 60F, -0.5F); // Box 225
		turretModel[84].setRotationPoint(1F, -55.9F, -1F);
		turretModel[84].rotateAngleZ = -2.26892803F;
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 513, 17, textureX, textureY); // Import BL.DecorativeMGBase
		barrelModel[1] = new ModelRendererTurbo(this, 681, 25, textureX, textureY); // Import BL.DecorativeMGBarrel
		barrelModel[2] = new ModelRendererTurbo(this, 905, 25, textureX, textureY); // Import BL.DecorativeMGBase
		barrelModel[3] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Import BL.GunHolder
		barrelModel[4] = new ModelRendererTurbo(this, 681, 33, textureX, textureY); // Import BL.BackFattyPart
		barrelModel[5] = new ModelRendererTurbo(this, 521, 73, textureX, textureY); // Import BL.MiddleyPart
		barrelModel[6] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Import BL.End
		barrelModel[7] = new ModelRendererTurbo(this, 857, 25, textureX, textureY); // Box 126

		barrelModel[0].addBox(-1F, -1F, -2F, 7, 3, 4, 0F); // Import BL.DecorativeMGBase
		barrelModel[0].setRotationPoint(6F, -38F, -1.5F);

		barrelModel[1].addShapeBox(9F, -1.5F, -0.5F, 16, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Import BL.DecorativeMGBarrel
		barrelModel[1].setRotationPoint(6F, -38F, -1.5F);

		barrelModel[2].addBox(-7F, -2F, -1.5F, 16, 2, 3, 0F); // Import BL.DecorativeMGBase
		barrelModel[2].setRotationPoint(6F, -38F, -1.5F);

		barrelModel[3].addBox(-15F, -3F, 0F, 22, 6, 6, 0F); // Import BL.GunHolder
		barrelModel[3].setRotationPoint(38F, -22F, -3F);

		barrelModel[4].addBox(5F, -2.5F, 0.5F, 20, 5, 5, 0F); // Import BL.BackFattyPart
		barrelModel[4].setRotationPoint(38F, -22F, -3F);

		barrelModel[5].addBox(25F, -2F, 1F, 35, 4, 4, 0F); // Import BL.MiddleyPart
		barrelModel[5].setRotationPoint(38F, -22F, -3F);

		barrelModel[6].addBox(60F, -1.5F, 1.5F, 5, 3, 3, 0F); // Import BL.End
		barrelModel[6].setRotationPoint(38F, -22F, -3F);

		barrelModel[7].addShapeBox(9F, -1.5F, -0.5F, 5, 1, 1, 0F,0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F); // Box 126
		barrelModel[7].setRotationPoint(6F, -38F, -1.5F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import RT.Wheel1Right
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 105
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Box 106
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Box 107
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Box 108
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Box 109
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Box 110
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Box 111
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Box 112
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Box 113
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Box 114
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Box 115
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Box 116
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Box 117
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Box 118
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Box 119
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Box 120
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Box 121
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Box 122
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Box 123
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Box 124

		leftTrackWheelModels[0].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import RT.Wheel1Right
		leftTrackWheelModels[0].setRotationPoint(40.5F, 4.5F, 18F);

		leftTrackWheelModels[1].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		leftTrackWheelModels[1].setRotationPoint(40.5F, 4.5F, 18F);

		leftTrackWheelModels[2].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		leftTrackWheelModels[2].setRotationPoint(40.5F, 4.5F, 18F);

		leftTrackWheelModels[3].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 107
		leftTrackWheelModels[3].setRotationPoint(22F, 4.5F, 18F);

		leftTrackWheelModels[4].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		leftTrackWheelModels[4].setRotationPoint(22F, 4.5F, 18F);

		leftTrackWheelModels[5].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		leftTrackWheelModels[5].setRotationPoint(22F, 4.5F, 18F);

		leftTrackWheelModels[6].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 110
		leftTrackWheelModels[6].setRotationPoint(4F, 4.5F, 18F);

		leftTrackWheelModels[7].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		leftTrackWheelModels[7].setRotationPoint(4F, 4.5F, 18F);

		leftTrackWheelModels[8].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		leftTrackWheelModels[8].setRotationPoint(4F, 4.5F, 18F);

		leftTrackWheelModels[9].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 113
		leftTrackWheelModels[9].setRotationPoint(-14F, 4.5F, 18F);

		leftTrackWheelModels[10].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		leftTrackWheelModels[10].setRotationPoint(-14F, 4.5F, 18F);

		leftTrackWheelModels[11].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		leftTrackWheelModels[11].setRotationPoint(-14F, 4.5F, 18F);

		leftTrackWheelModels[12].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 116
		leftTrackWheelModels[12].setRotationPoint(-32F, 4.5F, 18F);

		leftTrackWheelModels[13].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		leftTrackWheelModels[13].setRotationPoint(-32F, 4.5F, 18F);

		leftTrackWheelModels[14].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		leftTrackWheelModels[14].setRotationPoint(-32F, 4.5F, 18F);

		leftTrackWheelModels[15].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 119
		leftTrackWheelModels[15].setRotationPoint(-48F, -2.5F, 18F);

		leftTrackWheelModels[16].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		leftTrackWheelModels[16].setRotationPoint(-48F, -2.5F, 18F);

		leftTrackWheelModels[17].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		leftTrackWheelModels[17].setRotationPoint(-48F, -2.5F, 18F);

		leftTrackWheelModels[18].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 122
		leftTrackWheelModels[18].setRotationPoint(55F, -1.5F, 18F);

		leftTrackWheelModels[19].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		leftTrackWheelModels[19].setRotationPoint(55F, -1.5F, 18F);

		leftTrackWheelModels[20].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		leftTrackWheelModels[20].setRotationPoint(55F, -1.5F, 18F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Box 127
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Box 128
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Box 129
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Box 130
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Box 131
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Box 132
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Box 133
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Box 134
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Box 135
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Box 136
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Box 137
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Box 138
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Box 139
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Box 140
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Box 141
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Box 142
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Box 143
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Box 144
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Box 145
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Box 146
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Box 147

		rightTrackWheelModels[0].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 127
		rightTrackWheelModels[0].setRotationPoint(40.5F, 4.5F, -24F);

		rightTrackWheelModels[1].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		rightTrackWheelModels[1].setRotationPoint(40.5F, 4.5F, -24F);

		rightTrackWheelModels[2].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		rightTrackWheelModels[2].setRotationPoint(40.5F, 4.5F, -24F);

		rightTrackWheelModels[3].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 130
		rightTrackWheelModels[3].setRotationPoint(22F, 4.5F, -24F);

		rightTrackWheelModels[4].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		rightTrackWheelModels[4].setRotationPoint(22F, 4.5F, -24F);

		rightTrackWheelModels[5].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		rightTrackWheelModels[5].setRotationPoint(22F, 4.5F, -24F);

		rightTrackWheelModels[6].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 133
		rightTrackWheelModels[6].setRotationPoint(4F, 4.5F, -24F);

		rightTrackWheelModels[7].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		rightTrackWheelModels[7].setRotationPoint(4F, 4.5F, -24F);

		rightTrackWheelModels[8].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		rightTrackWheelModels[8].setRotationPoint(4F, 4.5F, -24F);

		rightTrackWheelModels[9].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 136
		rightTrackWheelModels[9].setRotationPoint(-14F, 4.5F, -24F);

		rightTrackWheelModels[10].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		rightTrackWheelModels[10].setRotationPoint(-14F, 4.5F, -24F);

		rightTrackWheelModels[11].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		rightTrackWheelModels[11].setRotationPoint(-14F, 4.5F, -24F);

		rightTrackWheelModels[12].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 139
		rightTrackWheelModels[12].setRotationPoint(-32F, 4.5F, -24F);

		rightTrackWheelModels[13].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		rightTrackWheelModels[13].setRotationPoint(-32F, 4.5F, -24F);

		rightTrackWheelModels[14].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		rightTrackWheelModels[14].setRotationPoint(-32F, 4.5F, -24F);

		rightTrackWheelModels[15].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 142
		rightTrackWheelModels[15].setRotationPoint(-48F, -2.5F, -24F);

		rightTrackWheelModels[16].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		rightTrackWheelModels[16].setRotationPoint(-48F, -2.5F, -24F);

		rightTrackWheelModels[17].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		rightTrackWheelModels[17].setRotationPoint(-48F, -2.5F, -24F);

		rightTrackWheelModels[18].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 145
		rightTrackWheelModels[18].setRotationPoint(55F, -1.5F, -24F);

		rightTrackWheelModels[19].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		rightTrackWheelModels[19].setRotationPoint(55F, -1.5F, -24F);

		rightTrackWheelModels[20].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		rightTrackWheelModels[20].setRotationPoint(55F, -1.5F, -24F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 513, 25, textureX, textureY); // Import RT.FrontTrack
		leftTrackModel[1] = new ModelRendererTurbo(this, 1001, 33, textureX, textureY); // Import RT.FrontAngle
		leftTrackModel[2] = new ModelRendererTurbo(this, 657, 57, textureX, textureY); // Box 125
		leftTrackModel[3] = new ModelRendererTurbo(this, 441, 113, textureX, textureY); // Box 153
		leftTrackModel[4] = new ModelRendererTurbo(this, 713, 89, textureX, textureY); // Box 154
		leftTrackModel[5] = new ModelRendererTurbo(this, 465, 121, textureX, textureY); // Box 155
		leftTrackModel[6] = new ModelRendererTurbo(this, 785, 89, textureX, textureY); // Box 156

		leftTrackModel[0].addBox(0F, 0F, 0F, 1, 7, 8, 0F); // Import RT.FrontTrack
		leftTrackModel[0].setRotationPoint(59F, -6.5F, 17F);

		leftTrackModel[1].addBox(0F, 0F, 0F, 1, 15, 8, 0F); // Import RT.FrontAngle
		leftTrackModel[1].setRotationPoint(57F, 3F, 17F);
		leftTrackModel[1].rotateAngleZ = -1.15191731F;

		leftTrackModel[2].addBox(0F, -0.5F, 0F, 1, 4, 8, 0F); // Box 125
		leftTrackModel[2].setRotationPoint(59F, 0.4F, 17F);
		leftTrackModel[2].rotateAngleZ = -0.68067841F;

		leftTrackModel[3].addBox(0F, 0F, 0F, 1, 18, 8, 0F); // Box 153
		leftTrackModel[3].setRotationPoint(-50F, 3F, 17F);
		leftTrackModel[3].rotateAngleZ = 1.1693706F;

		leftTrackModel[4].addBox(0F, 0F, 0F, 1, 5, 8, 0F); // Box 154
		leftTrackModel[4].setRotationPoint(-53F, -6F, 17F);

		leftTrackModel[5].addBox(0F, 0F, 0F, 77, 1, 8, 0F); // Box 155
		leftTrackModel[5].setRotationPoint(-33.5F, 9F, 17F);

		leftTrackModel[6].addBox(0F, 0F, 0F, 1, 5, 8, 0F); // Box 156
		leftTrackModel[6].setRotationPoint(-53F, -1F, 17F);
		leftTrackModel[6].rotateAngleZ = 0.64577182F;
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 641, 17, textureX, textureY); // Import LT.BackAngle
		rightTrackModel[1] = new ModelRendererTurbo(this, 945, 17, textureX, textureY); // Import LT.BackTrack
		rightTrackModel[2] = new ModelRendererTurbo(this, 785, 73, textureX, textureY); // Box 148
		rightTrackModel[3] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 149
		rightTrackModel[4] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Box 150
		rightTrackModel[5] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 151
		rightTrackModel[6] = new ModelRendererTurbo(this, 889, 73, textureX, textureY); // Box 152

		rightTrackModel[0].addBox(0F, 0F, 0F, 1, 18, 8, 0F); // Import LT.BackAngle
		rightTrackModel[0].setRotationPoint(-50F, 3F, -25F);
		rightTrackModel[0].rotateAngleZ = 1.1693706F;

		rightTrackModel[1].addBox(0F, 0F, 0F, 1, 5, 8, 0F); // Import LT.BackTrack
		rightTrackModel[1].setRotationPoint(-53F, -6F, -25F);

		rightTrackModel[2].addBox(0F, 0F, 0F, 1, 7, 8, 0F); // Box 148
		rightTrackModel[2].setRotationPoint(59F, -6.5F, -25F);

		rightTrackModel[3].addBox(0F, 0F, 0F, 77, 1, 8, 0F); // Box 149
		rightTrackModel[3].setRotationPoint(-33.5F, 9F, -25F);

		rightTrackModel[4].addBox(0F, 0F, 0F, 1, 15, 8, 0F); // Box 150
		rightTrackModel[4].setRotationPoint(57F, 3F, -25F);
		rightTrackModel[4].rotateAngleZ = -1.15191731F;

		rightTrackModel[5].addBox(0F, -0.5F, 0F, 1, 4, 8, 0F); // Box 151
		rightTrackModel[5].setRotationPoint(59F, 0.4F, -25F);
		rightTrackModel[5].rotateAngleZ = -0.68067841F;

		rightTrackModel[6].addBox(0F, 0F, 0F, 1, 5, 8, 0F); // Box 152
		rightTrackModel[6].setRotationPoint(-53F, -1F, -25F);
		rightTrackModel[6].rotateAngleZ = 0.64577182F;
	}
}