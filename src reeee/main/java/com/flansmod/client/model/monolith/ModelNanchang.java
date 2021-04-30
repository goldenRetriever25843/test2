//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelNanchang extends ModelVehicle //Same as Filename
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelNanchang() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[39];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import CR,SpinalChordBack
		bodyModel[1] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import CR,FloorBack
		bodyModel[2] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Import CR,SpinalChordFront
		bodyModel[3] = new ModelRendererTurbo(this, 729, 217, textureX, textureY); // Import CR,Commandcentre
		bodyModel[4] = new ModelRendererTurbo(this, 1353, 217, textureX, textureY); // Import CR,FrontAngleright2
		bodyModel[5] = new ModelRendererTurbo(this, 617, 393, textureX, textureY); // Import CR,FrontCommandsquare
		bodyModel[6] = new ModelRendererTurbo(this, 993, 393, textureX, textureY); // Import CR,MainCommPole
		bodyModel[7] = new ModelRendererTurbo(this, 1537, 1, textureX, textureY); // Import CR,AntennaTop
		bodyModel[8] = new ModelRendererTurbo(this, 1537, 1, textureX, textureY); // Import CR,JesusDetectorTop
		bodyModel[9] = new ModelRendererTurbo(this, 1913, 1, textureX, textureY); // Import CR,CommPoleLeft
		bodyModel[10] = new ModelRendererTurbo(this, 1953, 1, textureX, textureY); // Import CR,CommPoleRight
		bodyModel[11] = new ModelRendererTurbo(this, 1705, 1, textureX, textureY); // Import CR,SmokeStack
		bodyModel[12] = new ModelRendererTurbo(this, 1033, 417, textureX, textureY); // Import CR,UnderSmokestack
		bodyModel[13] = new ModelRendererTurbo(this, 1313, 417, textureX, textureY); // Import CR,Buildings1
		bodyModel[14] = new ModelRendererTurbo(this, 1, 465, textureX, textureY); // Import CR,Buildings2
		bodyModel[15] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Import CR,MidBuildings
		bodyModel[16] = new ModelRendererTurbo(this, 1729, 417, textureX, textureY); // Import CR,BackCommPole
		bodyModel[17] = new ModelRendererTurbo(this, 1849, 1, textureX, textureY); // Import CR,BackPoleRight
		bodyModel[18] = new ModelRendererTurbo(this, 1993, 1, textureX, textureY); // Import CR,BackPoleLeft
		bodyModel[19] = new ModelRendererTurbo(this, 1537, 81, textureX, textureY); // Import PGA,Turret
		bodyModel[20] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Import PGA,Barrel
		bodyModel[21] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Import PGA2,Turret
		bodyModel[22] = new ModelRendererTurbo(this, 1633, 1, textureX, textureY); // Import PGA2,Barrel
		bodyModel[23] = new ModelRendererTurbo(this, 1033, 553, textureX, textureY); // Box 0
		bodyModel[24] = new ModelRendererTurbo(this, 329, 465, textureX, textureY); // Box 2
		bodyModel[25] = new ModelRendererTurbo(this, 569, 217, textureX, textureY); // Box 10
		bodyModel[26] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 11
		bodyModel[27] = new ModelRendererTurbo(this, 1225, 217, textureX, textureY); // Box 12
		bodyModel[28] = new ModelRendererTurbo(this, 1225, 273, textureX, textureY); // Box 15
		bodyModel[29] = new ModelRendererTurbo(this, 705, 217, textureX, textureY); // Box 16
		bodyModel[30] = new ModelRendererTurbo(this, 1769, 417, textureX, textureY); // Box 17
		bodyModel[31] = new ModelRendererTurbo(this, 1593, 1, textureX, textureY); // Box 18
		bodyModel[32] = new ModelRendererTurbo(this, 1889, 1, textureX, textureY); // Box 0
		bodyModel[33] = new ModelRendererTurbo(this, 1441, 553, textureX, textureY); // Box 1
		bodyModel[34] = new ModelRendererTurbo(this, 569, 561, textureX, textureY); // Box 0
		bodyModel[35] = new ModelRendererTurbo(this, 1769, 553, textureX, textureY); // Box 1
		bodyModel[36] = new ModelRendererTurbo(this, 1, 601, textureX, textureY); // Box 2
		bodyModel[37] = new ModelRendererTurbo(this, 161, 617, textureX, textureY); // Box 3
		bodyModel[38] = new ModelRendererTurbo(this, 1321, 625, textureX, textureY); // Box 4

		bodyModel[0].addShapeBox(0F, 0F, 0F, 160, 52, 40, 0F, 2F, 0F, 0F, 0F, 0F, 60F, 0F, 0F, 60F, 2F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 52F, 0F, 0F, 52F, 0F, 0F, -12F); // Import CR,SpinalChordBack
		bodyModel[0].setRotationPoint(-583F, -1F, -20F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 560, 52, 160, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F); // Import CR,FloorBack
		bodyModel[1].setRotationPoint(-423F, -1F, -80F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 200, 82, 160, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 40F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 40F, 0F, -8F); // Import CR,SpinalChordFront
		bodyModel[2].setRotationPoint(137F, -31F, -80F);

		bodyModel[3].addBox(0F, 0F, 0F, 184, 50, 124, 0F); // Import CR,Commandcentre
		bodyModel[3].setRotationPoint(138F, -75F, -62F);

		bodyModel[4].addShapeBox(-220F, 0F, -130F, 220, 82, 116, 0F, 0F, 0F, 22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 22F, 0F, 0F, 14F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 14F); // Import CR,FrontAngleright2
		bodyModel[4].setRotationPoint(557F, -31F, 72F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 76, 58, 108, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CR,FrontCommandsquare
		bodyModel[5].setRotationPoint(188F, -123F, -54F);

		bodyModel[6].addBox(0F, 0F, 0F, 8, 400, 8, 0F); // Import CR,MainCommPole
		bodyModel[6].setRotationPoint(140F, -366F, -4F);
		bodyModel[6].rotateAngleZ = 0.06981317F;

		bodyModel[7].addBox(-2.5F, -2F, -6F, 12, 30, 12, 0F); // Import CR,AntennaTop
		bodyModel[7].setRotationPoint(140F, -366F, 0F);
		bodyModel[7].rotateAngleZ = 0.06981317F;

		bodyModel[8].addBox(0F, 66F, 0F, 10, 6, 70, 0F); // Import CR,JesusDetectorTop
		bodyModel[8].setRotationPoint(147F, -366F, -35F);
		bodyModel[8].rotateAngleZ = 0.05235988F;

		bodyModel[9].addBox(-4F, 0F, -4F, 8, 300, 8, 0F); // Import CR,CommPoleLeft
		bodyModel[9].setRotationPoint(150F, -294F, 0F);
		bodyModel[9].rotateAngleX = -0.15707963F;
		bodyModel[9].rotateAngleZ = -0.10471976F;

		bodyModel[10].addBox(-4F, 0F, -4F, 8, 300, 8, 0F); // Import CR,CommPoleRight
		bodyModel[10].setRotationPoint(150F, -294F, 0F);
		bodyModel[10].rotateAngleX = 0.15707963F;
		bodyModel[10].rotateAngleZ = -0.10471976F;

		bodyModel[11].addShapeBox(0F, 0F, 0F, 40, 160, 30, 0F, 0F, -18F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CR,SmokeStack
		bodyModel[11].setRotationPoint(46F, -128F, -15F);
		bodyModel[11].rotateAngleZ = 0.06981317F;

		bodyModel[12].addShapeBox(0F, 0F, 0F, 140, 41, 40, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 10F, 12F, 0F, 6F, 12F, 0F, 6F, 0F, 0F, 10F); // Import CR,UnderSmokestack
		bodyModel[12].setRotationPoint(-44F, -40F, -20F);

		bodyModel[13].addBox(0F, 0F, 0F, 120, 50, 85, 0F); // Import CR,Buildings1
		bodyModel[13].setRotationPoint(-163F, -51F, -42.5F);

		bodyModel[14].addBox(0F, 0F, 0F, 75, 50, 85, 0F); // Import CR,Buildings2
		bodyModel[14].setRotationPoint(-298F, -51F, -42.5F);

		bodyModel[15].addBox(0F, 0F, 0F, 60, 50, 60, 0F); // Import CR,MidBuildings
		bodyModel[15].setRotationPoint(-223F, -50F, -30F);

		bodyModel[16].addBox(-350F, 0F, 0F, 8, 330, 8, 0F); // Import CR,BackCommPole
		bodyModel[16].setRotationPoint(135F, -346F, -4F);
		bodyModel[16].rotateAngleZ = 0.05235988F;

		bodyModel[17].addBox(0F, -280F, 40F, 8, 207, 8, 0F); // Import CR,BackPoleRight
		bodyModel[17].setRotationPoint(-253F, 75F, 0F);
		bodyModel[17].rotateAngleX = 0.15707963F;
		bodyModel[17].rotateAngleZ = -0.15707963F;

		bodyModel[18].addBox(0F, -280F, -48F, 8, 207, 8, 0F); // Import CR,BackPoleLeft
		bodyModel[18].setRotationPoint(-253F, 75F, 0F);
		bodyModel[18].rotateAngleX = -0.15707963F;
		bodyModel[18].rotateAngleZ = -0.15707963F;

		bodyModel[19].addBox(-10F, 0F, -15F, 20, 20, 30, 0F); // Import PGA,Turret
		bodyModel[19].setRotationPoint(328F, -94F, 0F);

		bodyModel[20].addBox(-12F, -1F, -1.5F, 50, 3, 3, 0F); // Import PGA,Barrel
		bodyModel[20].setRotationPoint(328F, -84F, 0F);

		bodyModel[21].addBox(-10F, 0F, -15F, 20, 20, 30, 0F); // Import PGA2,Turret
		bodyModel[21].setRotationPoint(-273F, -71F, 0F);

		bodyModel[22].addBox(-12F, -1F, -1.5F, 40, 3, 3, 0F); // Import PGA2,Barrel
		bodyModel[22].setRotationPoint(-303F, -61F, 0F);

		bodyModel[23].addShapeBox(-180F, 0F, -10F, 180, 82, 20, 0F, 0F, 0F, 48F, 8F, 14F, 0F, 8F, 14F, 0F, 0F, 0F, 48F, 0F, 0F, 40F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 40F); // Box 0
		bodyModel[23].setRotationPoint(737F, -31F, 0F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 50, 50, 124, 0F, 0F, 0F, 0F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, 0F); // Box 2
		bodyModel[24].setRotationPoint(322F, -75F, -62F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 34, 8, 60, 0F, 0F, 0F, 0F, 2F, 0F, -22F, 2F, 0F, -22F, 0F, 0F, 0F, 0F, 0F, 1F, 3F, 0F, -22F, 3F, 0F, -22F, 0F, 0F, 1F); // Box 10
		bodyModel[25].setRotationPoint(126F, -102F, -30F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 25, 8, 44, 0F, 0F, 0F, 0F, 2F, 0F, -22F, 2F, 0F, -22F, 0F, 0F, 0F, 0F, 0F, 1F, 3F, 0F, -22F, 3F, 0F, -22F, 0F, 0F, 1F); // Box 11
		bodyModel[26].setRotationPoint(130F, -140F, -22F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 45, 10, 40, 0F, -4F, 0F, 0F, 2F, 0F, -12F, 2F, 0F, -12F, -4F, 0F, 0F, -1F, 6F, 1F, 3F, 0F, -12F, 3F, 0F, -12F, -1F, 6F, 1F); // Box 12
		bodyModel[27].setRotationPoint(136F, -213F, -20F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 34, 8, 50, 0F, 0F, 0F, 0F, 2F, 0F, -22F, 2F, 0F, -22F, 0F, 0F, 0F, 0F, 0F, 1F, 3F, 0F, -22F, 3F, 0F, -22F, 0F, 0F, 1F); // Box 15
		bodyModel[28].setRotationPoint(-230F, -48F, -25F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 26, 8, 36, 0F, 0F, 0F, 0F, 2F, 0F, -14F, 2F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 1F, 3F, 0F, -14F, 3F, 0F, -14F, 0F, 0F, 1F); // Box 16
		bodyModel[29].setRotationPoint(-224F, -100F, -18F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 40, 50, 85, 0F, 0F, -25F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F); // Box 17
		bodyModel[30].setRotationPoint(-339F, -51F, -42.5F);

		bodyModel[31].addShapeBox(0F, 0F, -1.5F, 3, 44, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[31].setRotationPoint(737F, -80F, 0F);

		bodyModel[32].addShapeBox(0F, 0F, -1.5F, 3, 37, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 45F, 0F, 0F, 45F, 0F, 0F, 45F, 0F, 0F, 45F, 0F); // Box 0
		bodyModel[32].setRotationPoint(-580F, -80F, 0F);

		bodyModel[33].addShapeBox(0F, 8F, -1.5F, 128, 68, 3, 0F, -64F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -64F, 0F, 0F, -64F, -34F, 0F, 0F, -34F, 0F, 0F, -34F, 0F, -64F, -34F, 0F); // Box 1
		bodyModel[33].setRotationPoint(17F, -290F, 0F);
		bodyModel[33].rotateAngleZ = 0.06981317F;

		bodyModel[34].addBox(0F, 0F, 0F, 88, 22, 116, 0F); // Box 0
		bodyModel[34].setRotationPoint(138F, -92F, -58F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 15, 71, 108, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F); // Box 1
		bodyModel[35].setRotationPoint(264F, -141F, -54F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 28, 18, 108, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[36].setRotationPoint(236F, -141F, -54F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 16, 8, 114, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F); // Box 3
		bodyModel[37].setRotationPoint(265F, -143F, -57F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 29, 8, 114, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[38].setRotationPoint(236F, -143F, -57F);



		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[3];
		gun_1_Model[0][0] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 5
		gun_1_Model[0][1] = new ModelRendererTurbo(this, 1377, 249, textureX, textureY); // Box 6
		gun_1_Model[0][2] = new ModelRendererTurbo(this, 1609, 81, textureX, textureY); // Box 8

		gun_1_Model[0][0].addShapeBox(-10F, -15F, -22F, 30, 36, 44, 0F,2F, 0F, 0F, -5F, -2F, -1F, -5F, -2F, -1F, 2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F); // Box 5

		gun_1_Model[0][1].addShapeBox(-11F, 8F, -11F, 22, 22, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6

		gun_1_Model[0][2].addShapeBox(-22F, -10F, -5F, 36, 12, 10, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 8

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[0])
		{
			gunPart.setRotationPoint(528F, -58F, 0F);
		}


		gun_1_Model[1] = new ModelRendererTurbo[1];
		gun_1_Model[1][0] = new ModelRendererTurbo(this, 569, 289, textureX, textureY); // Box 7

		gun_1_Model[1][0].addShapeBox(-10F, -7F, -3F, 83, 6, 6, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 7

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[1])
		{
			gunPart.setRotationPoint(528F, -58F, 0F);
		}


		gun_1_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun1", gun_1_Model);

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[3];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 5
		gun_2_Model[0][1] = new ModelRendererTurbo(this, 1377, 249, textureX, textureY); // Box 6
		gun_2_Model[0][2] = new ModelRendererTurbo(this, 1609, 81, textureX, textureY); // Box 8

		gun_2_Model[0][0].addShapeBox(-10F, -15F, -22F, 30, 36, 44, 0F,2F, 0F, 0F, -5F, -2F, -1F, -5F, -2F, -1F, 2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F); // Box 5

		gun_2_Model[0][1].addShapeBox(-11F, 8F, -11F, 22, 22, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6

		gun_2_Model[0][2].addShapeBox(-22F, -10F, -5F, 36, 12, 10, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 8

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(-423F, -18F, 0F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[1];
		gun_2_Model[1][0] = new ModelRendererTurbo(this, 569, 289, textureX, textureY); // Box 7

		gun_2_Model[1][0].addShapeBox(-10F, -7F, -3F, 83, 6, 6, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 7

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