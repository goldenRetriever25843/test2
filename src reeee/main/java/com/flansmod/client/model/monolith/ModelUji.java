//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.4.2
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelUji extends ModelVehicle //Same as Filename
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelUji() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[56];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportCR,SpinalChordBack
		bodyModel[1] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import ImportCR,FloorBack
		bodyModel[2] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Import ImportCR,SpinalChordFront
		bodyModel[3] = new ModelRendererTurbo(this, 569, 217, textureX, textureY); // Import ImportCR,Commandcentre
		bodyModel[4] = new ModelRendererTurbo(this, 1121, 217, textureX, textureY); // Import ImportCR,FrontAngleright2
		bodyModel[5] = new ModelRendererTurbo(this, 1537, 1, textureX, textureY); // Import ImportCR,CommandPorch
		bodyModel[6] = new ModelRendererTurbo(this, 1697, 145, textureX, textureY); // Import ImportCR,FrontCommandsquare
		bodyModel[7] = new ModelRendererTurbo(this, 1801, 1, textureX, textureY); // Import ImportCR,CommsquareSpine
		bodyModel[8] = new ModelRendererTurbo(this, 1953, 1, textureX, textureY); // Import ImportCR,MainCommPole
		bodyModel[9] = new ModelRendererTurbo(this, 1537, 1, textureX, textureY); // Import ImportCR,AntennaTop
		bodyModel[10] = new ModelRendererTurbo(this, 1681, 305, textureX, textureY); // Import ImportCR,JesusDetector
		bodyModel[11] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Import ImportCR,AngletennaRight
		bodyModel[12] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Import ImportCR,AngletennaLeft
		bodyModel[13] = new ModelRendererTurbo(this, 1025, 217, textureX, textureY); // Import ImportCR,JesusDetectorTop
		bodyModel[14] = new ModelRendererTurbo(this, 1993, 1, textureX, textureY); // Import ImportCR,CommPoleLeft
		bodyModel[15] = new ModelRendererTurbo(this, 1993, 361, textureX, textureY); // Import ImportCR,CommPoleRight
		bodyModel[16] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Import ImportCR,SmokeStack
		bodyModel[17] = new ModelRendererTurbo(this, 729, 369, textureX, textureY); // Import ImportCR,UnderSmokestack
		bodyModel[18] = new ModelRendererTurbo(this, 929, 425, textureX, textureY); // Import ImportCR,Buildings1
		bodyModel[19] = new ModelRendererTurbo(this, 1345, 425, textureX, textureY); // Import ImportCR,Buildings2
		bodyModel[20] = new ModelRendererTurbo(this, 1673, 441, textureX, textureY); // Import ImportCR,MidBuildings
		bodyModel[21] = new ModelRendererTurbo(this, 1945, 417, textureX, textureY); // Import ImportCR,BackCommPole
		bodyModel[22] = new ModelRendererTurbo(this, 625, 449, textureX, textureY); // Import ImportCR,JesusDetector
		bodyModel[23] = new ModelRendererTurbo(this, 849, 449, textureX, textureY); // Import ImportCR,BackPoleRight
		bodyModel[24] = new ModelRendererTurbo(this, 889, 449, textureX, textureY); // Import ImportCR,BackPoleLeft
		bodyModel[25] = new ModelRendererTurbo(this, 1537, 49, textureX, textureY); // Import ImportPGA,Turret
		bodyModel[26] = new ModelRendererTurbo(this, 1801, 81, textureX, textureY); // Import ImportPGA,Barrel
		bodyModel[27] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Import ImportPGA2,Turret
		bodyModel[28] = new ModelRendererTurbo(this, 1801, 89, textureX, textureY); // Import ImportPGA2,Barrel
		bodyModel[29] = new ModelRendererTurbo(this, 1, 473, textureX, textureY); // Import Box0
		bodyModel[30] = new ModelRendererTurbo(this, 409, 473, textureX, textureY); // Import Box1
		bodyModel[31] = new ModelRendererTurbo(this, 1569, 553, textureX, textureY); // Import Box2
		bodyModel[32] = new ModelRendererTurbo(this, 1257, 425, textureX, textureY); // Import Box3
		bodyModel[33] = new ModelRendererTurbo(this, 505, 561, textureX, textureY); // Import Box4
		bodyModel[34] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Import Box5
		bodyModel[35] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Import Box6
		bodyModel[36] = new ModelRendererTurbo(this, 569, 217, textureX, textureY); // Import Box7
		bodyModel[37] = new ModelRendererTurbo(this, 1121, 217, textureX, textureY); // Import Box8
		bodyModel[38] = new ModelRendererTurbo(this, 1585, 441, textureX, textureY); // Import Box9
		bodyModel[39] = new ModelRendererTurbo(this, 929, 561, textureX, textureY); // Import Box10
		bodyModel[40] = new ModelRendererTurbo(this, 553, 473, textureX, textureY); // Import Box11
		bodyModel[41] = new ModelRendererTurbo(this, 1065, 561, textureX, textureY); // Import Box12
		bodyModel[42] = new ModelRendererTurbo(this, 1593, 1, textureX, textureY); // Import Box13
		bodyModel[43] = new ModelRendererTurbo(this, 1857, 81, textureX, textureY); // Import Box14
		bodyModel[44] = new ModelRendererTurbo(this, 1193, 561, textureX, textureY); // Import Box15
		bodyModel[45] = new ModelRendererTurbo(this, 1681, 257, textureX, textureY); // Import Box16
		bodyModel[46] = new ModelRendererTurbo(this, 1281, 561, textureX, textureY); // Import Box17
		bodyModel[47] = new ModelRendererTurbo(this, 1937, 1, textureX, textureY); // Import Box18
		bodyModel[48] = new ModelRendererTurbo(this, 1937, 1, textureX, textureY); // Import Box0
		bodyModel[49] = new ModelRendererTurbo(this, 100, 1800, textureX, textureY); // Import Box1
		bodyModel[50] = new ModelRendererTurbo(this, 1777, 553, textureX, textureY); // Import Box19
		bodyModel[51] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Import Box20
		bodyModel[52] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Import Box21
		bodyModel[53] = new ModelRendererTurbo(this, 1777, 553, textureX, textureY); // Import Box19
		bodyModel[54] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Import Box20
		bodyModel[55] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Import Box21

		bodyModel[0].addShapeBox(0F, 0F, 0F, 160, 52, 40, 0F, 2F, 0F, 0F, 0F, 0F, 60F, 0F, 0F, 60F, 2F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 52F, 0F, 0F, 52F, 0F, 0F, -12F); // Import ImportCR,SpinalChordBack
		bodyModel[0].setRotationPoint(-583F, -1F, -20F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 560, 52, 160, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F); // Import ImportCR,FloorBack
		bodyModel[1].setRotationPoint(-423F, -1F, -80F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 200, 90, 160, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 40F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 40F, 0F, -8F); // Import ImportCR,SpinalChordFront
		bodyModel[2].setRotationPoint(137F, -39F, -80F);

		bodyModel[3].addBox(0F, 0F, 0F, 175, 45, 100, 0F); // Import ImportCR,Commandcentre
		bodyModel[3].setRotationPoint(147F, -84F, -50F);

		bodyModel[4].addShapeBox(-220F, 0F, -130F, 220, 90, 116, 0F, 0F, 0F, 22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 22F, 0F, 0F, 14F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 14F); // Import ImportCR,FrontAngleright2
		bodyModel[4].setRotationPoint(557F, -39F, 72F);

		bodyModel[5].addBox(0F, 0F, 0F, 70, 22, 120, 0F); // Import ImportCR,CommandPorch
		bodyModel[5].setRotationPoint(137F, -106F, -60F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 76, 58, 50, 0F, 0F, 0F, 24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 24F, 0F, 0F, 24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 24F); // Import ImportCR,FrontCommandsquare
		bodyModel[6].setRotationPoint(203F, -123F, -25F);

		bodyModel[7].addBox(0F, -8F, 0F, 34, 46, 32, 0F); // Import ImportCR,CommsquareSpine
		bodyModel[7].setRotationPoint(172F, -142F, -16F);
		bodyModel[7].rotateAngleZ = -0.37178611F;

		bodyModel[8].addBox(0F, 0F, 0F, 8, 400, 8, 0F); // Import ImportCR,MainCommPole
		bodyModel[8].setRotationPoint(127F, -481F, -4F);
		bodyModel[8].rotateAngleZ = 0.05235988F;

		bodyModel[9].addBox(-2.5F, -2F, -6F, 12, 30, 12, 0F); // Import ImportCR,AntennaTop
		bodyModel[9].setRotationPoint(127F, -481F, 0F);
		bodyModel[9].rotateAngleZ = 0.05235988F;

		bodyModel[10].addBox(0F, 50F, 0F, 10, 10, 120, 0F); // Import ImportCR,JesusDetector
		bodyModel[10].setRotationPoint(140F, -381F, -60F);
		bodyModel[10].rotateAngleZ = 0.05235988F;

		bodyModel[11].addBox(-2F, 0F, 0F, 10, 8, 50, 0F); // Import ImportCR,AngletennaRight
		bodyModel[11].setRotationPoint(137F, -356F, 0F);
		bodyModel[11].rotateAngleX = 0.13962634F;
		bodyModel[11].rotateAngleY = 0.34906585F;
		bodyModel[11].rotateAngleZ = -0.34906585F;

		bodyModel[12].addBox(-2F, 0F, -50F, 10, 8, 50, 0F); // Import ImportCR,AngletennaLeft
		bodyModel[12].setRotationPoint(137F, -356F, 0F);
		bodyModel[12].rotateAngleX = -0.13962634F;
		bodyModel[12].rotateAngleY = -0.34906585F;
		bodyModel[12].rotateAngleZ = -0.34906585F;

		bodyModel[13].addBox(0F, 66F, 0F, 10, 6, 70, 0F); // Import ImportCR,JesusDetectorTop
		bodyModel[13].setRotationPoint(134F, -481F, -35F);
		bodyModel[13].rotateAngleZ = 0.05235988F;

		bodyModel[14].addBox(-4F, 0F, -4F, 8, 350, 8, 0F); // Import ImportCR,CommPoleLeft
		bodyModel[14].setRotationPoint(137F, -331F, 0F);
		bodyModel[14].rotateAngleX = -0.15707963F;
		bodyModel[14].rotateAngleZ = -0.15707963F;

		bodyModel[15].addBox(-4F, 0F, -4F, 8, 350, 8, 0F); // Import ImportCR,CommPoleRight
		bodyModel[15].setRotationPoint(137F, -331F, 0F);
		bodyModel[15].rotateAngleX = 0.15707963F;
		bodyModel[15].rotateAngleZ = -0.15707963F;

		bodyModel[16].addBox(0F, 0F, 0F, 38, 160, 30, 0F); // Import ImportCR,SmokeStack
		bodyModel[16].setRotationPoint(8F, -151F, -15F);
		bodyModel[16].rotateAngleZ = 0.06981317F;

		bodyModel[17].addShapeBox(0F, 0F, 0F, 100, 36, 40, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 10F, 8F, 0F, 6F, 8F, 0F, 6F, 0F, 0F, 10F); // Import ImportCR,UnderSmokestack
		bodyModel[17].setRotationPoint(-43F, -35F, -20F);

		bodyModel[18].addBox(0F, 0F, 0F, 120, 50, 85, 0F); // Import ImportCR,Buildings1
		bodyModel[18].setRotationPoint(-163F, -51F, -42.5F);

		bodyModel[19].addBox(0F, 0F, 0F, 75, 50, 85, 0F); // Import ImportCR,Buildings2
		bodyModel[19].setRotationPoint(-298F, -51F, -42.5F);

		bodyModel[20].addBox(0F, 0F, 0F, 60, 50, 60, 0F); // Import ImportCR,MidBuildings
		bodyModel[20].setRotationPoint(-223F, -51F, -30F);

		bodyModel[21].addBox(-350F, 0F, 0F, 8, 330, 8, 0F); // Import ImportCR,BackCommPole
		bodyModel[21].setRotationPoint(127F, -391F, -4F);
		bodyModel[21].rotateAngleZ = 0.05235988F;

		bodyModel[22].addBox(0F, 0F, 0F, 10, 10, 100, 0F); // Import ImportCR,JesusDetector
		bodyModel[22].setRotationPoint(-223F, -326F, -50F);
		bodyModel[22].rotateAngleZ = 0.05235988F;

		bodyModel[23].addBox(0F, -280F, 40F, 8, 207, 8, 0F); // Import ImportCR,BackPoleRight
		bodyModel[23].setRotationPoint(-261F, 30F, 0F);
		bodyModel[23].rotateAngleX = 0.15707963F;
		bodyModel[23].rotateAngleZ = -0.15707963F;

		bodyModel[24].addBox(0F, -280F, -48F, 8, 207, 8, 0F); // Import ImportCR,BackPoleLeft
		bodyModel[24].setRotationPoint(-261F, 30F, 0F);
		bodyModel[24].rotateAngleX = -0.15707963F;
		bodyModel[24].rotateAngleZ = -0.15707963F;

		bodyModel[25].addBox(-10F, 0F, -15F, 20, 20, 30, 0F); // Import ImportPGA,Turret
		bodyModel[25].setRotationPoint(328F, -104F, 0F);

		bodyModel[26].addBox(-12F, -1F, -1F, 40, 2, 2, 0F); // Import ImportPGA,Barrel
		bodyModel[26].setRotationPoint(328F, -94F, 0F);

		bodyModel[27].addBox(-10F, 0F, -15F, 20, 20, 30, 0F); // Import ImportPGA2,Turret
		bodyModel[27].setRotationPoint(-273F, -71F, 0F);

		bodyModel[28].addBox(-12F, -1F, -1F, 40, 2, 2, 0F); // Import ImportPGA2,Barrel
		bodyModel[28].setRotationPoint(-273F, -61F, 0F);

		bodyModel[29].addShapeBox(-180F, 0F, -10F, 180, 90, 20, 0F, 0F, 0F, 48F, 8F, 6F, 0F, 8F, 6F, 0F, 0F, 0F, 48F, 0F, 0F, 40F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 40F); // Import Box0
		bodyModel[29].setRotationPoint(737F, -39F, 0F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 21, 58, 50, 0F, 0F, 0F, 0F, 0F, 0F, 24F, 0F, 0F, 24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 24F, 0F, 0F, 24F, 0F, 0F, 0F); // Import Box1
		bodyModel[30].setRotationPoint(182F, -123F, -25F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 50, 45, 100, 0F, 0F, 0F, 0F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, 0F); // Import Box2
		bodyModel[31].setRotationPoint(322F, -84F, -50F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 23, 18, 54, 0F, 0F, 0F, -14F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 24F, 0F, 0F, 24F, 0F, 0F, 0F); // Import Box3
		bodyModel[32].setRotationPoint(180F, -141F, -27F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 78, 18, 54, 0F, 0F, 0F, 2F, -50F, 0F, -4F, -50F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 25F, 1F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 25F); // Import Box4
		bodyModel[33].setRotationPoint(203F, -141F, -27F);

		bodyModel[34].addShapeBox(-21F, 0F, -21F, 21, 20, 21, 0F, -6F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box5
		bodyModel[34].setRotationPoint(197F, -161F, 0F);

		bodyModel[35].addShapeBox(-21F, 0F, 21F, 21, 20, 21, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -6F); // Import Box6
		bodyModel[35].setRotationPoint(197F, -161F, -21F);

		bodyModel[36].addShapeBox(0F, 0F, 21F, 21, 20, 21, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -6F, 0F, 0F, 0F); // Import Box7
		bodyModel[36].setRotationPoint(197F, -161F, -21F);

		bodyModel[37].addShapeBox(0F, 0F, -21F, 21, 20, 21, 0F, 0F, 0F, 0F, -6F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		bodyModel[37].setRotationPoint(197F, -161F, 0F);

		bodyModel[38].addShapeBox(0F, -24F, 0F, 38, 24, 30, 0F, 4F, 0F, 4F, 4F, 0F, 4F, 4F, 0F, 4F, 4F, 0F, 4F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Import Box9
		bodyModel[38].setRotationPoint(8F, -151F, -15F);
		bodyModel[38].rotateAngleZ = 0.06981317F;

		bodyModel[39].addShapeBox(0F, 0F, 0F, 34, 8, 60, 0F, 0F, 0F, 0F, 2F, 0F, -22F, 2F, 0F, -22F, 0F, 0F, 0F, 0F, 0F, 1F, 3F, 0F, -22F, 3F, 0F, -22F, 0F, 0F, 1F); // Import Box10
		bodyModel[39].setRotationPoint(111F, -151F, -30F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 25, 8, 44, 0F, 0F, 0F, 0F, 2F, 0F, -22F, 2F, 0F, -22F, 0F, 0F, 0F, 0F, 0F, 1F, 3F, 0F, -22F, 3F, 0F, -22F, 0F, 0F, 1F); // Import Box11
		bodyModel[40].setRotationPoint(117F, -215F, -22F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 45, 8, 40, 0F, 0F, 0F, 0F, 2F, -5F, -12F, 2F, -5F, -12F, 0F, 0F, 0F, 0F, 0F, 1F, 3F, 5F, -12F, 3F, 5F, -12F, 0F, 0F, 1F); // Import Box12
		bodyModel[41].setRotationPoint(119F, -231F, -20F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 12, 20, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box13
		bodyModel[42].setRotationPoint(180F, -172F, -6F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 3, 3, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box14
		bodyModel[43].setRotationPoint(185F, -170F, -15F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 34, 8, 50, 0F, 0F, 0F, 0F, 2F, 0F, -22F, 2F, 0F, -22F, 0F, 0F, 0F, 0F, 0F, 1F, 3F, 0F, -22F, 3F, 0F, -22F, 0F, 0F, 1F); // Import Box15
		bodyModel[44].setRotationPoint(-238F, -93F, -25F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 26, 8, 36, 0F, 0F, 0F, 0F, 2F, 0F, -14F, 2F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 1F, 3F, 0F, -14F, 3F, 0F, -14F, 0F, 0F, 1F); // Import Box16
		bodyModel[45].setRotationPoint(-232F, -145F, -18F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 25, 50, 85, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F); // Import Box17
		bodyModel[46].setRotationPoint(-323F, -51F, -42.5F);

		bodyModel[47].addShapeBox(0F, 0F, -1.5F, 3, 37, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		bodyModel[47].setRotationPoint(737F, -80F, 0F);

		bodyModel[48].addShapeBox(0F, 0F, -1.5F, 3, 37, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 45F, 0F, 0F, 45F, 0F, 0F, 45F, 0F, 0F, 45F, 0F); // Import Box0
		bodyModel[48].setRotationPoint(-580F, -80F, 0F);

		bodyModel[49].addShapeBox(0F, 0F, -1.5F, 128, 68, 3, 0F, -64F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -64F, 0F, 0F, -64F, -34F, 0F, 0F, -34F, 0F, 0F, -34F, 0F, -64F, -34F, 0F); // Import Box1
		bodyModel[49].setRotationPoint(-708F, -80F, 0F);

		bodyModel[50].addShapeBox(-17F, -22F, -20F, 34, 40, 40, 0F, 6F, 4F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 4F, 4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import Box19
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(15F, -1F, -8F, 34, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box20
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(15F, -1F, 4F, 34, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box21
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(-17F, -22F, -20F, 34, 40, 40, 0F, 6F, 4F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 4F, 4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import Box19
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(15F, -1F, -8F, 34, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box20
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(15F, -1F, 4F, 34, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box21
		bodyModel[55].setRotationPoint(0F, 0F, 0F);



		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[1];
		gun_1_Model[0][0] = new ModelRendererTurbo(this, 1777, 553, textureX, textureY); // Box 19

		gun_1_Model[0][0].addShapeBox(-17F, -22F, -20F, 34, 40, 40, 0F,6F, 4F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 4F, 4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 19

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[0])
		{
			gunPart.setRotationPoint(528F, -58F, 0F);
		}


		gun_1_Model[1] = new ModelRendererTurbo[2];
		gun_1_Model[1][0] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 20
		gun_1_Model[1][1] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 21

		gun_1_Model[1][0].addShapeBox(15F, -1F, -8F, 34, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20

		gun_1_Model[1][1].addShapeBox(15F, -1F, 4F, 34, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[1])
		{
			gunPart.setRotationPoint(528F, -58F, 0F);
		}


		gun_1_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun1", gun_1_Model);

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[1];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 1777, 553, textureX, textureY); // Box 19

		gun_2_Model[0][0].addShapeBox(-17F, -22F, -20F, 34, 40, 40, 0F,6F, 4F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 4F, 4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 19

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(-423F, -18F, 0F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[2];
		gun_2_Model[1][0] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 20
		gun_2_Model[1][1] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 21

		gun_2_Model[1][0].addShapeBox(15F, -1F, -8F, 34, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20

		gun_2_Model[1][1].addShapeBox(15F, -1F, 4F, 34, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[1])
		{
			gunPart.setRotationPoint(-423F, -18F, 0F);
		}


		gun_2_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun2", gun_2_Model);

		translateAll(0F, 0F, 0F);


		flipAll();
	}
}