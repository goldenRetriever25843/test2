//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Nanchang
// Model Creator: 
// Created on: 26.08.2015 - 19:35:46
// Last changed on: 26.08.2015 - 19:35:46

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelType1934 extends ModelVehicle //Same as Filename
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelType1934() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[44];
		bodyDoorOpenModel = new ModelRendererTurbo[1];
		bodyDoorCloseModel = new ModelRendererTurbo[1];

		initbodyModel_1();
		initbodyDoorOpenModel_1();
		initbodyDoorCloseModel_1();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import CR,SpinalChordBack
		bodyModel[1] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Import CR,FloorBack
		bodyModel[2] = new ModelRendererTurbo(this, 1, 313, textureX, textureY); // Import CR,SpinalChordFront
		bodyModel[3] = new ModelRendererTurbo(this, 729, 313, textureX, textureY); // Import CR,Commandcentre
		bodyModel[4] = new ModelRendererTurbo(this, 1281, 313, textureX, textureY); // Import CR,FrontAngleright2
		bodyModel[5] = new ModelRendererTurbo(this, 617, 489, textureX, textureY); // Import CR,FrontCommandsquare
		bodyModel[6] = new ModelRendererTurbo(this, 1865, 1, textureX, textureY); // Import CR,MainCommPole
		bodyModel[7] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Import CR,AntennaTop
		bodyModel[8] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Import CR,JesusDetectorTop
		bodyModel[9] = new ModelRendererTurbo(this, 1841, 417, textureX, textureY); // Import CR,SmokeStack
		bodyModel[10] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Import CR,UnderSmokestack
		bodyModel[11] = new ModelRendererTurbo(this, 1009, 513, textureX, textureY); // Import CR,Buildings1
		bodyModel[12] = new ModelRendererTurbo(this, 1425, 513, textureX, textureY); // Import CR,Buildings2
		bodyModel[13] = new ModelRendererTurbo(this, 569, 313, textureX, textureY); // Import CR,MidBuildings
		bodyModel[14] = new ModelRendererTurbo(this, 1705, 1, textureX, textureY); // Import CR,BackCommPole
		bodyModel[15] = new ModelRendererTurbo(this, 1745, 1, textureX, textureY); // Import CR,BackPoleRight
		bodyModel[16] = new ModelRendererTurbo(this, 1785, 1, textureX, textureY); // Import CR,BackPoleLeft
		bodyModel[17] = new ModelRendererTurbo(this, 1, 561, textureX, textureY); // Box 0
		bodyModel[18] = new ModelRendererTurbo(this, 209, 561, textureX, textureY); // Box 2
		bodyModel[19] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Box 10
		bodyModel[20] = new ModelRendererTurbo(this, 1129, 1, textureX, textureY); // Box 11
		bodyModel[21] = new ModelRendererTurbo(this, 1273, 1, textureX, textureY); // Box 15
		bodyModel[22] = new ModelRendererTurbo(this, 1393, 1, textureX, textureY); // Box 16
		bodyModel[23] = new ModelRendererTurbo(this, 1665, 569, textureX, textureY); // Box 17
		bodyModel[24] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 18
		bodyModel[25] = new ModelRendererTurbo(this, 1129, 1, textureX, textureY); // Box 0
		bodyModel[26] = new ModelRendererTurbo(this, 1161, 649, textureX, textureY); // Box 0
		bodyModel[27] = new ModelRendererTurbo(this, 457, 633, textureX, textureY); // Box 1
		bodyModel[28] = new ModelRendererTurbo(this, 705, 657, textureX, textureY); // Box 2
		bodyModel[29] = new ModelRendererTurbo(this, 1497, 649, textureX, textureY); // Box 3
		bodyModel[30] = new ModelRendererTurbo(this, 1649, 705, textureX, textureY); // Box 4
		bodyModel[31] = new ModelRendererTurbo(this, 1, 665, textureX, textureY); // Box 39
		bodyModel[32] = new ModelRendererTurbo(this, 673, 785, textureX, textureY); // Box 41
		bodyModel[33] = new ModelRendererTurbo(this, 153, 737, textureX, textureY); // Box 42
		bodyModel[34] = new ModelRendererTurbo(this, 937, 793, textureX, textureY); // Box 43
		bodyModel[35] = new ModelRendererTurbo(this, 1305, 793, textureX, textureY); // Box 44
		bodyModel[36] = new ModelRendererTurbo(this, 1, 865, textureX, textureY); // Box 46
		bodyModel[37] = new ModelRendererTurbo(this, 369, 865, textureX, textureY); // Box 47
		bodyModel[38] = new ModelRendererTurbo(this, 1585, 833, textureX, textureY); // Box 48
		bodyModel[39] = new ModelRendererTurbo(this, 625, 865, textureX, textureY); // Box 49
		bodyModel[40] = new ModelRendererTurbo(this, 833, 921, textureX, textureY); // Box 52
		bodyModel[41] = new ModelRendererTurbo(this, 985, 921, textureX, textureY); // Box 53
		bodyModel[42] = new ModelRendererTurbo(this, 1161, 313, textureX, textureY); // Box 54
		bodyModel[43] = new ModelRendererTurbo(this, 1161, 649, textureX, textureY); // Box 61

		bodyModel[0].addShapeBox(-801F, -1F, -20F, 160, 52, 40, 0F,2F, 0F, 34F, 0F, 0F, 60F, 0F, 0F, 60F, 2F, 0F, 34F, -20F, 0F, 2F, 0F, 0F, 52F, 0F, 0F, 52F, -20F, 0F, 2F); // Import CR,SpinalChordBack
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-642F, -1F, -80F, 770, 52, 160, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F); // Import CR,FloorBack
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(137F, -31F, -80F, 200, 82, 160, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 40F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 40F, 0F, -8F); // Import CR,SpinalChordFront
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addBox(172F, -75F, -62F, 150, 50, 124, 0F); // Import CR,Commandcentre
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(337F, -31F, -58F, 161, 82, 116, 0F,0F, 0F, 22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 22F, 0F, 0F, 14F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 14F); // Import CR,FrontAngleright2
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(177F, -123F, -54F, 87, 58, 108, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CR,FrontCommandsquare
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addBox(209F, -366F, -4F, 8, 400, 8, 0F); // Import CR,MainCommPole
		bodyModel[6].setRotationPoint(0F, 0F, 0F);
		bodyModel[6].rotateAngleZ = 0.06981317F;

		bodyModel[7].addBox(206.5F, -377F, -6F, 12, 18, 12, 0F); // Import CR,AntennaTop
		bodyModel[7].setRotationPoint(0F, 9F, 0F);
		bodyModel[7].rotateAngleZ = 0.06981317F;

		bodyModel[8].addBox(201F, -300F, -35F, 10, 6, 70, 0F); // Import CR,JesusDetectorTop
		bodyModel[8].setRotationPoint(0F, 0F, 0F);
		bodyModel[8].rotateAngleZ = 0.05235988F;

		bodyModel[9].addShapeBox(98F, -152F, -16F, 58, 160, 32, 0F,0F, -18F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CR,SmokeStack
		bodyModel[9].setRotationPoint(0F, 0F, 0F);
		bodyModel[9].rotateAngleZ = 0.06981317F;

		bodyModel[10].addShapeBox(-44F, -40F, -20F, 140, 41, 40, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 10F, 12F, 0F, 6F, 12F, 0F, 6F, 0F, 0F, 10F); // Import CR,UnderSmokestack
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addBox(-163F, -51F, -42.5F, 120, 50, 85, 0F); // Import CR,Buildings1
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addBox(-298F, -51F, -42.5F, 75, 50, 85, 0F); // Import CR,Buildings2
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addBox(-223F, -50F, -30F, 60, 50, 60, 0F); // Import CR,MidBuildings
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addBox(-344F, -193F, -4F, 8, 159, 8, 0F); // Import CR,BackCommPole
		bodyModel[14].setRotationPoint(0F, 0F, 0F);
		bodyModel[14].rotateAngleZ = 0.05235988F;

		bodyModel[15].addBox(149F, -260F, 37F, 8, 218, 8, 0F); // Import CR,BackPoleRight
		bodyModel[15].setRotationPoint(0F, 0F, 0F);
		bodyModel[15].rotateAngleX = 0.15707963F;
		bodyModel[15].rotateAngleZ = -0.15707963F;

		bodyModel[16].addBox(148F, -260F, -48F, 8, 219, 8, 0F); // Import CR,BackPoleLeft
		bodyModel[16].setRotationPoint(0F, 0F, 0F);
		bodyModel[16].rotateAngleX = -0.15707963F;
		bodyModel[16].rotateAngleZ = -0.15707963F;

		bodyModel[17].addShapeBox(498F, -31F, -10F, 142, 82, 20, 0F,0F, 0F, 48F, 8F, 14F, 0F, 8F, 14F, 0F, 0F, 0F, 48F, 0F, 0F, 40F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 40F); // Box 0
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(322F, -75F, -62F, 50, 50, 124, 0F,0F, 0F, 0F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, 0F); // Box 2
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(177F, -168F, -30F, 34, 8, 60, 0F,0F, 0F, 0F, 2F, 0F, -22F, 2F, 0F, -22F, 0F, 0F, 0F, 0F, 0F, 1F, 3F, 0F, -22F, 3F, 0F, -22F, 0F, 0F, 1F); // Box 10
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(182F, -242F, -22F, 25, 8, 44, 0F,0F, 0F, 0F, 2F, 0F, -22F, 2F, 0F, -22F, 0F, 0F, 0F, 0F, 0F, 1F, 3F, 0F, -22F, 3F, 0F, -22F, 0F, 0F, 1F); // Box 11
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-230F, -48F, -25F, 34, 8, 50, 0F,0F, 0F, 0F, 2F, 0F, -22F, 2F, 0F, -22F, 0F, 0F, 0F, 0F, 0F, 1F, 3F, 0F, -22F, 3F, 0F, -22F, 0F, 0F, 1F); // Box 15
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-351F, -100F, -18F, 26, 8, 36, 0F,0F, 0F, 0F, 2F, 0F, -14F, 2F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 1F, 3F, 0F, -14F, 3F, 0F, -14F, 0F, 0F, 1F); // Box 16
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-339F, -51F, -42.5F, 41, 50, 85, 0F,0F, -25F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F); // Box 17
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(641F, -80F, -1.5F, 3, 44, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-262F, -80F, -1.5F, 3, 37, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 45F, 0F, 0F, 45F, 0F, 0F, 45F, 0F, 0F, 45F, 0F); // Box 0
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addBox(171F, -92F, -58F, 50, 22, 116, 0F); // Box 0
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(264F, -141F, -54F, 15, 71, 108, 0F,0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F); // Box 1
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(177F, -141F, -54F, 87, 18, 108, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(265F, -143F, -57F, 16, 8, 114, 0F,0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F); // Box 3
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(194F, -143F, -57F, 71, 8, 114, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(-90F, -140F, -16F, 44, 157, 30, 0F,0F, -18F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[31].setRotationPoint(0F, 0F, 0F);
		bodyModel[31].rotateAngleZ = 0.06981317F;

		bodyModel[32].addShapeBox(-170F, -57F, -15F, 140, 41, 31, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 10F, 12F, 0F, 6F, 12F, 0F, 6F, 0F, 0F, 10F); // Box 41
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(-378F, -40F, -42.5F, 40, 39, 85, 0F,0F, -16F, 0F, 0F, -25F, -10F, 0F, -25F, -10F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F); // Box 42
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-475F, -40F, -42.5F, 97, 39, 85, 0F,0F, -16F, -10F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, -16F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F); // Box 43
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(-584F, -40F, -42.5F, 109, 39, 85, 0F,0F, -16F, 0F, 0F, -16F, -10F, 0F, -16F, -10F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F); // Box 44
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(172F, -116F, -20F, 125, 25, 40, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 10F, 12F, 0F, 6F, 12F, 0F, 6F, 0F, 0F, 10F); // Box 46
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(168F, -91F, -20F, 140, 22, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 47
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(368F, -46F, -52F, 68, 15, 109, 0F,0F, 0F, 0F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, 0F); // Box 48
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(318F, -46F, -52F, 50, 15, 109, 0F,0F, 0F, -30F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -30F); // Box 49
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(178F, -143F, -57F, 16, 8, 114, 0F,0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F); // Box 52
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(-240F, -71F, -15F, 152, 20, 31, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 10F, 12F, 0F, 6F, 12F, 0F, 6F, 0F, 0F, 10F); // Box 53
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(-502F, -54F, -15F, 72, 32, 32, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 10F, 12F, 0F, 6F, 12F, 0F, 6F, 0F, 0F, 10F); // Box 54
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addBox(-181F, -54F, -58F, 50, 8, 116, 0F); // Box 61
		bodyModel[43].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyDoorOpenModel_1()
	{
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 1098, 974, textureX, textureY); // Box 62

		bodyDoorOpenModel[0].addShapeBox(82F, -338F, -1.5F, 128, 68, 3, 0F,-64F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -64F, 0F, 0F, -64F, -34F, 0F, 0F, -34F, 0F, 0F, -34F, 0F, -64F, -34F, 0F); // Box 62
		bodyDoorOpenModel[0].setRotationPoint(0F, 0F, 0F);
		bodyDoorOpenModel[0].rotateAngleZ = 0.06981317F;
	}

	private void initbodyDoorCloseModel_1()
	{
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 1009, 649, textureX, textureY); // Box 1

		bodyDoorCloseModel[0].addShapeBox(82F, -338F, -1.5F, 128, 68, 3, 0F,-63.8F, 0.3F, 0.4F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0.4F, -63.8F, 0.3F, 0.4F, -63.8F, -34F, 0.4F, 0F, -34F, 0.4F, 0F, -34F, 0.4F, -63.8F, -34F, 0.4F); // Box 1
		bodyDoorCloseModel[0].setRotationPoint(0F, 0F, 0F);
		bodyDoorCloseModel[0].rotateAngleZ = 0.06981317F;
	}

	private void initGuns() {
	}
	{

		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[1];
		gun_1_Model[0][0] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Import PGA,Turret

		gun_1_Model[0][0].addBox(-10F, -7F, -15F, 20, 20, 30, 0F); // Import PGA,Turret

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[0])
		{
			gunPart.setRotationPoint(475F, -45F, 0F);
		}


		gun_1_Model[1] = new ModelRendererTurbo[1];
		gun_1_Model[1][0] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import PGA,Barrel

		gun_1_Model[1][0].addBox(-2F, -1F, -1.5F, 50, 3, 3, 0F); // Import PGA,Barrel

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[1])
		{
			gunPart.setRotationPoint(475F, -45F, 0F);
		}


		gun_1_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun1", gun_1_Model);

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[1];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Import PGA,Turret

		gun_2_Model[0][0].addBox(-10F, -7F, -15F, 20, 20, 30, 0F); // Import PGA,Turret

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(-398F, -37F, 0F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[1];
		gun_2_Model[1][0] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import PGA,Barrel

		gun_2_Model[1][0].addBox(-2F, -1F, -1.5F, 50, 3, 3, 0F); // Import PGA,Barrel

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[1])
		{
			gunPart.setRotationPoint(-398F, -37F, 0F);
		}


		gun_2_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun2", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[1];
		gun_3_Model[0][0] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Import PGA,Turret

		gun_3_Model[0][0].addBox(-10F, -7F, -15F, 20, 20, 30, 0F); // Import PGA,Turret

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[0])
		{
			gunPart.setRotationPoint(-528F, -37F, 0F);
		}


		gun_3_Model[1] = new ModelRendererTurbo[1];
		gun_3_Model[1][0] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import PGA,Barrel

		gun_3_Model[1][0].addBox(-2F, -1F, -1.5F, 50, 3, 3, 0F); // Import PGA,Barrel

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[1])
		{
			gunPart.setRotationPoint(-528F, -37F, 0F);
		}


		gun_3_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun3", gun_3_Model);

		// Passenger 5
		ModelRendererTurbo[][] gun_4_Model = new ModelRendererTurbo[3][];

		gun_4_Model[0] = new ModelRendererTurbo[1];
		gun_4_Model[0][0] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Import PGA,Turret

		gun_4_Model[0][0].addBox(-10F, -7F, -15F, 20, 20, 30, 0F); // Import PGA,Turret

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[0])
		{
			gunPart.setRotationPoint(-630F, -14F, 0F);
		}


		gun_4_Model[1] = new ModelRendererTurbo[1];
		gun_4_Model[1][0] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import PGA,Barrel

		gun_4_Model[1][0].addBox(-2F, -1F, -1.5F, 50, 3, 3, 0F); // Import PGA,Barrel

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[1])
		{
			gunPart.setRotationPoint(-630F, -14F, 0F);
		}


		gun_4_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun4", gun_4_Model);

		// Passenger 6
		ModelRendererTurbo[][] gun_5_Model = new ModelRendererTurbo[3][];

		gun_5_Model[0] = new ModelRendererTurbo[1];
		gun_5_Model[0][0] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Import PGA,Turret

		gun_5_Model[0][0].addBox(-10F, -7F, -15F, 20, 20, 30, 0F); // Import PGA,Turret

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[0])
		{
			gunPart.setRotationPoint(405F, -58F, 0F);
		}


		gun_5_Model[1] = new ModelRendererTurbo[1];
		gun_5_Model[1][0] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import PGA,Barrel

		gun_5_Model[1][0].addBox(-2F, -1F, -1.5F, 50, 3, 3, 0F); // Import PGA,Barrel

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[1])
		{
			gunPart.setRotationPoint(405F, -58F, 0F);
		}


		gun_5_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun5", gun_5_Model);
	}
}