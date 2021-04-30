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

public class ModelTribal extends ModelVehicle //Same as Filename
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelTribal() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[42];
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
		bodyModel[1] = new ModelRendererTurbo(this, -119, 809, textureX, textureY); // Import CR,FloorBack
		bodyModel[2] = new ModelRendererTurbo(this, 1091, 1123, textureX, textureY); // Import CR,SpinalChordFront
		bodyModel[3] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Import CR,Commandcentre
		bodyModel[4] = new ModelRendererTurbo(this, 857, 177, textureX, textureY); // Import CR,FrontAngleright2
		bodyModel[5] = new ModelRendererTurbo(this, 1601, 1, textureX, textureY); // Import CR,FrontCommandsquare
		bodyModel[6] = new ModelRendererTurbo(this, 1977, 1, textureX, textureY); // Import CR,MainCommPole
		bodyModel[7] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Import CR,AntennaTop
		bodyModel[8] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Import CR,JesusDetectorTop
		bodyModel[9] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Import CR,SmokeStack
		bodyModel[10] = new ModelRendererTurbo(this, 1417, 177, textureX, textureY); // Import CR,UnderSmokestack
		bodyModel[11] = new ModelRendererTurbo(this, 137, 249, textureX, textureY); // Import CR,Buildings1
		bodyModel[12] = new ModelRendererTurbo(this, 1537, 265, textureX, textureY); // Import CR,Buildings2
		bodyModel[13] = new ModelRendererTurbo(this, 553, 249, textureX, textureY); // Import CR,MidBuildings
		bodyModel[14] = new ModelRendererTurbo(this, 1873, 169, textureX, textureY); // Import CR,BackCommPole
		bodyModel[15] = new ModelRendererTurbo(this, 1913, 169, textureX, textureY); // Import CR,BackPoleRight
		bodyModel[16] = new ModelRendererTurbo(this, 801, 249, textureX, textureY); // Import CR,BackPoleLeft
		bodyModel[17] = new ModelRendererTurbo(this, 841, 377, textureX, textureY); // Box 0
		bodyModel[18] = new ModelRendererTurbo(this, 425, 361, textureX, textureY); // Box 2
		bodyModel[19] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Box 10
		bodyModel[20] = new ModelRendererTurbo(this, 1537, 9, textureX, textureY); // Box 11
		bodyModel[21] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 12
		bodyModel[22] = new ModelRendererTurbo(this, 929, 57, textureX, textureY); // Box 15
		bodyModel[23] = new ModelRendererTurbo(this, 1473, 65, textureX, textureY); // Box 16
		bodyModel[24] = new ModelRendererTurbo(this, 1249, 377, textureX, textureY); // Box 17
		bodyModel[25] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Box 18
		bodyModel[26] = new ModelRendererTurbo(this, 1633, 1, textureX, textureY); // Box 0
		bodyModel[27] = new ModelRendererTurbo(this, 1385, 401, textureX, textureY); // Box 0
		bodyModel[28] = new ModelRendererTurbo(this, 1801, 385, textureX, textureY); // Box 1
		bodyModel[29] = new ModelRendererTurbo(this, 1, 401, textureX, textureY); // Box 2
		bodyModel[30] = new ModelRendererTurbo(this, 161, 457, textureX, textureY); // Box 3
		bodyModel[31] = new ModelRendererTurbo(this, 689, 481, textureX, textureY); // Box 4
		bodyModel[32] = new ModelRendererTurbo(this, 857, 481, textureX, textureY); // Box 39
		bodyModel[33] = new ModelRendererTurbo(this, 297, 537, textureX, textureY); // Box 40
		bodyModel[34] = new ModelRendererTurbo(this, 1, 545, textureX, textureY); // Box 41
		bodyModel[35] = new ModelRendererTurbo(this, 1321, 561, textureX, textureY); // Box 42
		bodyModel[36] = new ModelRendererTurbo(this, 817, 81, textureX, textureY); // Box 43
		bodyModel[37] = new ModelRendererTurbo(this, 1601, 561, textureX, textureY); // Box 44
		bodyModel[38] = new ModelRendererTurbo(this, 537, 609, textureX, textureY); // Box 45
		bodyModel[39] = new ModelRendererTurbo(this, 865, 657, textureX, textureY); // Box 46
		bodyModel[40] = new ModelRendererTurbo(this, 1793, 641, textureX, textureY); // Box 47
		bodyModel[41] = new ModelRendererTurbo(this, 1281, 697, textureX, textureY); // Box 48

		bodyModel[0].addShapeBox(-917F, -1F, -20F, 160, 52, 40, 0F,2F, 0F, 16F, 0F, 0F, 60F, 0F, 0F, 60F, 2F, 0F, 16F, 0F, 0F, 11F, 0F, 0F, 52F, 0F, 0F, 52F, 0F, 0F, 11F); // Import CR,SpinalChordBack
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-757F, -1F, -80F, 885, 52, 160, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F); // Import CR,FloorBack
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(137F, -31F, -80F, 200, 82, 160, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 40F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 40F, 0F, -8F); // Import CR,SpinalChordFront
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(139F, -75F, -62F, 184, 50, 124, 0F,0F, -8F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CR,Commandcentre
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(337F, -31F, -58F, 220, 82, 116, 0F,0F, 0F, 22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 22F, 0F, 0F, 14F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 14F); // Import CR,FrontAngleright2
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(188F, -123F, -54F, 76, 58, 108, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CR,FrontCommandsquare
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addBox(140F, -366F, -4F, 8, 400, 8, 0F); // Import CR,MainCommPole
		bodyModel[6].setRotationPoint(0F, 0F, 0F);
		bodyModel[6].rotateAngleZ = 0.06981317F;

		bodyModel[7].addBox(137.5F, -368F, -6F, 12, 18, 12, 0F); // Import CR,AntennaTop
		bodyModel[7].setRotationPoint(0F, 0F, 0F);
		bodyModel[7].rotateAngleZ = 0.06981317F;

		bodyModel[8].addBox(118F, -255F, -35F, 10, 6, 70, 0F); // Import CR,JesusDetectorTop
		bodyModel[8].setRotationPoint(0F, 0F, 0F);
		bodyModel[8].rotateAngleZ = 0.05235988F;

		bodyModel[9].addShapeBox(0F, -128F, -22F, 64, 160, 44, 0F,0F, -8F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CR,SmokeStack
		bodyModel[9].setRotationPoint(0F, 0F, 0F);
		bodyModel[9].rotateAngleZ = 0.06981317F;

		bodyModel[10].addShapeBox(-44F, -40F, -20F, 185, 41, 40, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 10F, 12F, 0F, 6F, 12F, 0F, 6F, 0F, 0F, 10F); // Import CR,UnderSmokestack
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addBox(-163F, -51F, -42.5F, 120, 50, 85, 0F); // Import CR,Buildings1
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addBox(-299F, -51F, -42.5F, 76, 50, 85, 0F); // Import CR,Buildings2
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addBox(-223F, -50F, -30F, 60, 50, 60, 0F); // Import CR,MidBuildings
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addBox(116F, -298F, -4F, 8, 291, 8, 0F); // Import CR,BackCommPole
		bodyModel[14].setRotationPoint(0F, 0F, 0F);
		bodyModel[14].rotateAngleZ = 0.05235988F;

		bodyModel[15].addBox(64F, -205F, 40F, 8, 207, 8, 0F); // Import CR,BackPoleRight
		bodyModel[15].setRotationPoint(0F, 0F, 0F);
		bodyModel[15].rotateAngleX = 0.15707963F;
		bodyModel[15].rotateAngleZ = -0.15707963F;

		bodyModel[16].addBox(64F, -205F, -48F, 8, 207, 8, 0F); // Import CR,BackPoleLeft
		bodyModel[16].setRotationPoint(0F, 0F, 0F);
		bodyModel[16].rotateAngleX = -0.15707963F;
		bodyModel[16].rotateAngleZ = -0.15707963F;

		bodyModel[17].addShapeBox(557F, -31F, -10F, 180, 82, 20, 0F,0F, 0F, 48F, 8F, 14F, 0F, 8F, 14F, 0F, 0F, 0F, 48F, 0F, 0F, 40F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 40F); // Box 0
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(428F, -64F, -62F, 63, 47, 124, 0F,0F, 0F, 0F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, 0F); // Box 2
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(111F, -102F, -30F, 34, 8, 60, 0F,0F, 0F, 0F, 2F, 0F, -22F, 2F, 0F, -22F, 0F, 0F, 0F, 0F, 0F, 1F, 3F, 0F, -22F, 3F, 0F, -22F, 0F, 0F, 1F); // Box 10
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(107F, -245F, -22F, 25, 8, 44, 0F,0F, 0F, 0F, 2F, 0F, -22F, 2F, 0F, -22F, 0F, 0F, 0F, 0F, 0F, 1F, 3F, 0F, -22F, 3F, 0F, -22F, 0F, 0F, 1F); // Box 11
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(94F, -213F, -19F, 45, 10, 40, 0F,-4F, 0F, 0F, 2F, 0F, -12F, 2F, 0F, -12F, -4F, 0F, 0F, -1F, 6F, 1F, 3F, 0F, -12F, 3F, 0F, -12F, -1F, 6F, 1F); // Box 12
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-230F, -48F, -25F, 34, 8, 50, 0F,0F, 0F, 0F, 2F, 0F, -22F, 2F, 0F, -22F, 0F, 0F, 0F, 0F, 0F, 1F, 3F, 0F, -22F, 3F, 0F, -22F, 0F, 0F, 1F); // Box 15
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(86F, -111F, -18F, 26, 8, 36, 0F,0F, 0F, 0F, 2F, 0F, -14F, 2F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 1F, 3F, 0F, -14F, 3F, 0F, -14F, 0F, 0F, 1F); // Box 16
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-339F, -51F, -42.5F, 40, 50, 85, 0F,0F, -25F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F); // Box 17
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(737F, -80F, -1.5F, 3, 44, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-414F, -80F, -1.5F, 3, 37, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 45F, 0F, 0F, 45F, 0F, 0F, 45F, 0F, 0F, 45F, 0F); // Box 0
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addBox(138F, -103F, -58F, 88, 37, 116, 0F); // Box 0
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(264F, -141F, -54F, 15, 77, 108, 0F,0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F); // Box 1
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(236F, -141F, -54F, 28, 18, 108, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(265F, -143F, -57F, 16, 8, 114, 0F,0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F); // Box 3
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(236F, -143F, -57F, 29, 8, 114, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(323F, -64F, -62F, 105, 47, 124, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(216F, -113F, -66F, 32, 13, 130, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-171F, -148F, -18F, 52, 163, 35, 0F,0F, -8F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[34].setRotationPoint(0F, 0F, 0F);
		bodyModel[34].rotateAngleZ = 0.06981317F;

		bodyModel[35].addShapeBox(242F, -125F, -37F, 63, 61, 74, 0F,0F, 0F, 0F, 0F, -10F, -23F, 0F, -10F, -23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, 0F, 0F); // Box 42
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addBox(118F, -278F, -28F, 10, 6, 55, 0F); // Box 43
		bodyModel[36].setRotationPoint(0F, 0F, 0F);
		bodyModel[36].rotateAngleZ = 0.05235988F;

		bodyModel[37].addShapeBox(-379F, -51F, -42.5F, 40, 50, 85, 0F,0F, 0F, 0F, 0F, -25F, -10F, 0F, -25F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F); // Box 44
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addBox(-455F, -51F, -42.5F, 76, 50, 85, 0F); // Box 45
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addBox(-638F, -30F, -30F, 187, 50, 60, 0F); // Box 46
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(-699F, -30F, -30F, 61, 50, 60, 0F,0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F); // Box 47
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addBox(-657F, -36F, -43.5F, 202, 6, 84, 0F); // Box 48
		bodyModel[41].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyDoorOpenModel_1()
	{
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 197, 732, textureX, textureY); // Box 58

		bodyDoorOpenModel[0].addShapeBox(17F, -339F, -1.5F, 128, 68, 3, 0F,-64F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -64F, 0F, 0F, -64F, -34F, 0F, 0F, -34F, 0F, 0F, -34F, 0F, -64F, -34F, 0F); // Box 58
		bodyDoorOpenModel[0].setRotationPoint(0F, 0F, 0F);
		bodyDoorOpenModel[0].rotateAngleZ = 0.06981317F;
	}

	private void initbodyDoorCloseModel_1()
	{
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 193, 385, textureX, textureY); // Box 1

		bodyDoorCloseModel[0].addShapeBox(17F, -338F, -1.5F, 128, 68, 3, 0F,-64F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -64F, 0F, 0.2F, -64F, -34F, 0.2F, 0F, -34F, 0.2F, 0F, -34F, 0.2F, -64F, -34F, 0.2F); // Box 1
		bodyDoorCloseModel[0].setRotationPoint(0F, 0F, 0F);
		bodyDoorCloseModel[0].rotateAngleZ = 0.06981317F;
	}

	private void initGuns() {
	}
	{

		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[1];
		gun_1_Model[0][0] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Import PGA,Turret

		gun_1_Model[0][0].addBox(-10F, -9F, -15F, 20, 20, 30, 0F); // Import PGA,Turret

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[0])
		{
			gunPart.setRotationPoint(547F, -42F, 0F);
		}


		gun_1_Model[1] = new ModelRendererTurbo[2];
		gun_1_Model[1][0] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Import PGA,Barrel
		gun_1_Model[1][1] = new ModelRendererTurbo(this, 1865, 1, textureX, textureY); // Box 49

		gun_1_Model[1][0].addBox(-1F, -2F, -6.5F, 50, 3, 3, 0F); // Import PGA,Barrel

		gun_1_Model[1][1].addBox(-1F, -2F, 3.5F, 50, 3, 3, 0F); // Box 49

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[1])
		{
			gunPart.setRotationPoint(547F, -42F, 0F);
		}


		gun_1_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun1", gun_1_Model);

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[1];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Import PGA,Turret

		gun_2_Model[0][0].addBox(-10F, -9F, -15F, 20, 20, 30, 0F); // Import PGA,Turret

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(-575F, -49F, 0F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[2];
		gun_2_Model[1][0] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Import PGA,Barrel
		gun_2_Model[1][1] = new ModelRendererTurbo(this, 1865, 1, textureX, textureY); // Box 49

		gun_2_Model[1][0].addBox(-1F, -2F, -6.5F, 50, 3, 3, 0F); // Import PGA,Barrel

		gun_2_Model[1][1].addBox(-1F, -2F, 3.5F, 50, 3, 3, 0F); // Box 49

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[1])
		{
			gunPart.setRotationPoint(-575F, -49F, 0F);
		}


		gun_2_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun2", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[1];
		gun_3_Model[0][0] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Import PGA,Turret

		gun_3_Model[0][0].addBox(-10F, -9F, -15F, 20, 20, 30, 0F); // Import PGA,Turret

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[0])
		{
			gunPart.setRotationPoint(-790F, -14F, 0F);
		}


		gun_3_Model[1] = new ModelRendererTurbo[2];
		gun_3_Model[1][0] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Import PGA,Barrel
		gun_3_Model[1][1] = new ModelRendererTurbo(this, 1865, 1, textureX, textureY); // Box 49

		gun_3_Model[1][0].addBox(-1F, -2F, -6.5F, 50, 3, 3, 0F); // Import PGA,Barrel

		gun_3_Model[1][1].addBox(-1F, -2F, 3.5F, 50, 3, 3, 0F); // Box 49

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[1])
		{
			gunPart.setRotationPoint(-790F, -14F, 0F);
		}


		gun_3_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun3", gun_3_Model);

		// Passenger 5
		ModelRendererTurbo[][] gun_4_Model = new ModelRendererTurbo[3][];

		gun_4_Model[0] = new ModelRendererTurbo[1];
		gun_4_Model[0][0] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Import PGA,Turret

		gun_4_Model[0][0].addBox(-10F, -9F, -15F, 20, 20, 30, 0F); // Import PGA,Turret

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[0])
		{
			gunPart.setRotationPoint(393F, -75F, 0F);
		}


		gun_4_Model[1] = new ModelRendererTurbo[2];
		gun_4_Model[1][0] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Import PGA,Barrel
		gun_4_Model[1][1] = new ModelRendererTurbo(this, 1865, 1, textureX, textureY); // Box 49

		gun_4_Model[1][0].addBox(-1F, -2F, -6.5F, 50, 3, 3, 0F); // Import PGA,Barrel

		gun_4_Model[1][1].addBox(-1F, -2F, 3.5F, 50, 3, 3, 0F); // Box 49

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[1])
		{
			gunPart.setRotationPoint(393F, -75F, 0F);
		}


		gun_4_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun4", gun_4_Model);
	}
}