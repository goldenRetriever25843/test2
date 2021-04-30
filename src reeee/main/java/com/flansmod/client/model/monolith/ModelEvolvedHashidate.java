//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.4.2
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelEvolvedHashidate extends ModelVehicle //Same as Filename
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelEvolvedHashidate() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[41];
		bodyModel[0] = new ModelRendererTurbo(this, 800, 1750, textureX, textureY); // Import CR,SpinalChordBack
		bodyModel[1] = new ModelRendererTurbo(this, 0, 850, textureX, textureY); // Import CR,SpinalChordFront
		bodyModel[2] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Import CR,FloorBack
		bodyModel[3] = new ModelRendererTurbo(this, 0, 1700, textureX, textureY); // Import CR,SpinalChordFront
		bodyModel[4] = new ModelRendererTurbo(this, 1300, 1800, textureX, textureY); // Import CR,Commandcentre
		bodyModel[5] = new ModelRendererTurbo(this, 0, 1250, textureX, textureY); // Import CR,FrontAngleright
		bodyModel[6] = new ModelRendererTurbo(this, 0, 1250, textureX, textureY); // Import CR,FrontAngleLeft
		bodyModel[7] = new ModelRendererTurbo(this, 0, 1450, textureX, textureY); // Import CR,FrontAngleright2
		bodyModel[8] = new ModelRendererTurbo(this, 0, 1450, textureX, textureY); // Import CR,FrontAngleright2
		bodyModel[9] = new ModelRendererTurbo(this, 0, 1000, textureX, textureY); // Import CR,FrontFiller
		bodyModel[10] = new ModelRendererTurbo(this, 400, 1000, textureX, textureY); // Import CR,FrontFiller
		bodyModel[11] = new ModelRendererTurbo(this, 800, 1900, textureX, textureY); // Import CR,SpinalChordBackRight
		bodyModel[12] = new ModelRendererTurbo(this, 800, 1900, textureX, textureY); // Import CR,SpinalChordBackLeft
		bodyModel[13] = new ModelRendererTurbo(this, 800, 1500, textureX, textureY); // Import CR,SpinalChordBackFiller
		bodyModel[14] = new ModelRendererTurbo(this, 1600, 1000, textureX, textureY); // Import CR,CommandPorch
		bodyModel[15] = new ModelRendererTurbo(this, 1800, 600, textureX, textureY); // Import CR,CommandSquareRight
		bodyModel[16] = new ModelRendererTurbo(this, 1800, 600, textureX, textureY); // Import CR,CommandSquareLeft
		bodyModel[17] = new ModelRendererTurbo(this, 1750, 750, textureX, textureY); // Import CR,FrontCommandsquare
		bodyModel[18] = new ModelRendererTurbo(this, 1800, 1200, textureX, textureY); // Import CR,CommSquare
		bodyModel[19] = new ModelRendererTurbo(this, 1600, 1200, textureX, textureY); // Import CR,CommsquareSpine
		bodyModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import CR,MainCommPole
		bodyModel[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import CR,AntennaTop
		bodyModel[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import CR,JesusDetector
		bodyModel[23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import CR,AngletennaRight
		bodyModel[24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import CR,AngletennaLeft
		bodyModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import CR,JesusDetectorTop
		bodyModel[26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import CR,CommPoleLeft
		bodyModel[27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import CR,CommPoleRight
		bodyModel[28] = new ModelRendererTurbo(this, 1400, 1400, textureX, textureY); // Import CR,SmokeStack
		bodyModel[29] = new ModelRendererTurbo(this, 1400, 1700, textureX, textureY); // Import CR,UnderSmokestack
		bodyModel[30] = new ModelRendererTurbo(this, 800, 1200, textureX, textureY); // Import CR,Buildings1
		bodyModel[31] = new ModelRendererTurbo(this, 800, 1000, textureX, textureY); // Import CR,Buildings2
		bodyModel[32] = new ModelRendererTurbo(this, 950, 850, textureX, textureY); // Import CR,MidBuildings
		bodyModel[33] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import CR,BackCommPole
		bodyModel[34] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import CR,JesusDetector
		bodyModel[35] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import CR,BackPoleRight
		bodyModel[36] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import CR,BackPoleLeft
		bodyModel[37] = new ModelRendererTurbo(this, 1900, 150, textureX, textureY); // Import PGA,Turret
		bodyModel[38] = new ModelRendererTurbo(this, 1900, 100, textureX, textureY); // Import PGA,Barrel
		bodyModel[39] = new ModelRendererTurbo(this, 1900, 150, textureX, textureY); // Import PGA2,Turret
		bodyModel[40] = new ModelRendererTurbo(this, 1900, 100, textureX, textureY); // Import PGA2,Barrel

		bodyModel[0].addBox(0F, 0F, 0F, 160, 52, 40, 0F); // Import CR,SpinalChordBack
		bodyModel[0].setRotationPoint(-583F, -1F, -20F);

		bodyModel[1].addBox(0F, 0F, 0F, 400, 90, 20, 0F); // Import CR,SpinalChordFront
		bodyModel[1].setRotationPoint(337F, -39F, -10F);

		bodyModel[2].addBox(0F, 0F, 0F, 560, 52, 160, 0F); // Import CR,FloorBack
		bodyModel[2].setRotationPoint(-423F, -1F, -80F);

		bodyModel[3].addBox(0F, 0F, 0F, 200, 90, 160, 0F); // Import CR,SpinalChordFront
		bodyModel[3].setRotationPoint(137F, -39F, -80F);

		bodyModel[4].addBox(0F, 0F, 0F, 225, 45, 100, 0F); // Import CR,Commandcentre
		bodyModel[4].setRotationPoint(147F, -84F, -50F);

		bodyModel[5].addBox(-180F, 0F, -10F, 180, 90, 20, 0F); // Import CR,FrontAngleright
		bodyModel[5].setRotationPoint(734F, -39F, 0F);
		bodyModel[5].rotateAngleY = -0.26179939F;

		bodyModel[6].addBox(-180F, 0F, -10F, 180, 90, 20, 0F); // Import CR,FrontAngleLeft
		bodyModel[6].setRotationPoint(734F, -39F, 0F);
		bodyModel[6].rotateAngleY = 0.26179939F;

		bodyModel[7].addBox(-235F, 0F, -60F, 230, 90, 70, 0F); // Import CR,FrontAngleright2
		bodyModel[7].setRotationPoint(567F, -39F, 46F);
		bodyModel[7].rotateAngleY = -0.10471976F;

		bodyModel[8].addBox(-235F, 0F, -10F, 230, 90, 70, 0F); // Import CR,FrontAngleright2
		bodyModel[8].setRotationPoint(567F, -39F, -46F);
		bodyModel[8].rotateAngleY = 0.10471976F;

		bodyModel[9].addBox(0F, 0F, 0F, 60, 90, 80, 0F); // Import CR,FrontFiller
		bodyModel[9].setRotationPoint(555F, -39F, -40F);

		bodyModel[10].addBox(0F, 0F, 0F, 45, 90, 60, 0F); // Import CR,FrontFiller
		bodyModel[10].setRotationPoint(615F, -39F, -30F);

		bodyModel[11].addBox(0F, 0F, -20F, 171, 52, 40, 0F); // Import CR,SpinalChordBackRight
		bodyModel[11].setRotationPoint(-576F, -1F, 0F);
		bodyModel[11].rotateAngleY = 0.36651914F;

		bodyModel[12].addBox(0F, 0F, -20F, 171, 52, 40, 0F); // Import CR,SpinalChordBackLeft
		bodyModel[12].setRotationPoint(-576F, -1F, 0F);
		bodyModel[12].rotateAngleY = -0.36651914F;

		bodyModel[13].addBox(0F, 0F, 0F, 50, 52, 80, 0F); // Import CR,SpinalChordBackFiller
		bodyModel[13].setRotationPoint(-473F, -1F, -40F);

		bodyModel[14].addBox(0F, 0F, 0F, 70, 22, 120, 0F); // Import CR,CommandPorch
		bodyModel[14].setRotationPoint(137F, -106F, -60F);

		bodyModel[15].addBox(0F, 0F, -35F, 80, 58, 35, 0F); // Import CR,CommandSquareRight
		bodyModel[15].setRotationPoint(202F, -141F, 50F);
		bodyModel[15].rotateAngleY = -0.31415927F;

		bodyModel[16].addBox(0F, 0F, 0F, 80, 58, 35, 0F); // Import CR,CommandSquareLeft
		bodyModel[16].setRotationPoint(202F, -141F, -50F);
		bodyModel[16].rotateAngleY = 0.31415927F;

		bodyModel[17].addBox(0F, 0F, 0F, 80, 58, 50, 0F); // Import CR,FrontCommandsquare
		bodyModel[17].setRotationPoint(199F, -141F, -25F);

		bodyModel[18].addBox(-21F, 0F, -21F, 42, 28, 42, 0F); // Import CR,CommSquare
		bodyModel[18].setRotationPoint(197F, -169F, 0F);

		bodyModel[19].addBox(0F, -8F, 0F, 34, 46, 32, 0F); // Import CR,CommsquareSpine
		bodyModel[19].setRotationPoint(172F, -142F, -16F);
		bodyModel[19].rotateAngleZ = -0.37178611F;

		bodyModel[20].addBox(0F, 0F, 0F, 8, 400, 8, 0F); // Import CR,MainCommPole
		bodyModel[20].setRotationPoint(127F, -481F, -4F);
		bodyModel[20].rotateAngleZ = 0.05235988F;

		bodyModel[21].addBox(-2.5F, -2F, -6F, 12, 30, 12, 0F); // Import CR,AntennaTop
		bodyModel[21].setRotationPoint(127F, -481F, 0F);
		bodyModel[21].rotateAngleZ = 0.05235988F;

		bodyModel[22].addBox(0F, 50F, 0F, 10, 10, 120, 0F); // Import CR,JesusDetector
		bodyModel[22].setRotationPoint(140F, -381F, -60F);
		bodyModel[22].rotateAngleZ = 0.05235988F;

		bodyModel[23].addBox(-2F, 0F, 0F, 10, 8, 50, 0F); // Import CR,AngletennaRight
		bodyModel[23].setRotationPoint(137F, -356F, 0F);
		bodyModel[23].rotateAngleX = 0.13962634F;
		bodyModel[23].rotateAngleY = 0.34906585F;
		bodyModel[23].rotateAngleZ = -0.34906585F;

		bodyModel[24].addBox(-2F, 0F, -50F, 10, 8, 50, 0F); // Import CR,AngletennaLeft
		bodyModel[24].setRotationPoint(137F, -356F, 0F);
		bodyModel[24].rotateAngleX = -0.13962634F;
		bodyModel[24].rotateAngleY = -0.34906585F;
		bodyModel[24].rotateAngleZ = -0.34906585F;

		bodyModel[25].addBox(0F, 66F, 0F, 10, 6, 70, 0F); // Import CR,JesusDetectorTop
		bodyModel[25].setRotationPoint(134F, -481F, -35F);
		bodyModel[25].rotateAngleZ = 0.05235988F;

		bodyModel[26].addBox(-4F, 0F, -4F, 8, 350, 8, 0F); // Import CR,CommPoleLeft
		bodyModel[26].setRotationPoint(137F, -331F, 0F);
		bodyModel[26].rotateAngleX = -0.15707963F;
		bodyModel[26].rotateAngleZ = -0.15707963F;

		bodyModel[27].addBox(-4F, 0F, -4F, 8, 350, 8, 0F); // Import CR,CommPoleRight
		bodyModel[27].setRotationPoint(137F, -331F, 0F);
		bodyModel[27].rotateAngleX = 0.15707963F;
		bodyModel[27].rotateAngleZ = -0.15707963F;

		bodyModel[28].addBox(0F, 0F, 0F, 40, 160, 30, 0F); // Import CR,SmokeStack
		bodyModel[28].setRotationPoint(7F, -151F, -15F);
		bodyModel[28].rotateAngleZ = 0.03490659F;

		bodyModel[29].addBox(0F, 0F, 0F, 100, 30, 40, 0F); // Import CR,UnderSmokestack
		bodyModel[29].setRotationPoint(-43F, -29F, -20F);

		bodyModel[30].addBox(0F, 0F, 0F, 120, 50, 85, 0F); // Import CR,Buildings1
		bodyModel[30].setRotationPoint(-163F, -51F, -42.5F);

		bodyModel[31].addBox(0F, 0F, 0F, 100, 50, 85, 0F); // Import CR,Buildings2
		bodyModel[31].setRotationPoint(-323F, -51F, -42.5F);

		bodyModel[32].addBox(0F, 0F, 0F, 60, 50, 60, 0F); // Import CR,MidBuildings
		bodyModel[32].setRotationPoint(-223F, -51F, -30F);

		bodyModel[33].addBox(-350F, 0F, 0F, 8, 330, 8, 0F); // Import CR,BackCommPole
		bodyModel[33].setRotationPoint(127F, -391F, -4F);
		bodyModel[33].rotateAngleZ = 0.05235988F;

		bodyModel[34].addBox(0F, 0F, 0F, 10, 10, 100, 0F); // Import CR,JesusDetector
		bodyModel[34].setRotationPoint(-223F, -326F, -50F);
		bodyModel[34].rotateAngleZ = 0.05235988F;

		bodyModel[35].addBox(0F, -280F, 40F, 8, 207, 8, 0F); // Import CR,BackPoleRight
		bodyModel[35].setRotationPoint(-261F, 30F, 0F);
		bodyModel[35].rotateAngleX = 0.15707963F;
		bodyModel[35].rotateAngleZ = -0.15707963F;

		bodyModel[36].addBox(0F, -280F, -48F, 8, 207, 8, 0F); // Import CR,BackPoleLeft
		bodyModel[36].setRotationPoint(-261F, 30F, 0F);
		bodyModel[36].rotateAngleX = -0.15707963F;
		bodyModel[36].rotateAngleZ = -0.15707963F;

		bodyModel[37].addBox(-10F, 0F, -15F, 20, 20, 30, 0F); // Import PGA,Turret
		bodyModel[37].setRotationPoint(328F, -104F, 0F);

		bodyModel[38].addBox(-12F, -1F, -1F, 40, 2, 2, 0F); // Import PGA,Barrel
		bodyModel[38].setRotationPoint(328F, -94F, 0F);

		bodyModel[39].addBox(-10F, 0F, -15F, 20, 20, 30, 0F); // Import PGA2,Turret
		bodyModel[39].setRotationPoint(-273F, -71F, 0F);

		bodyModel[40].addBox(-12F, -1F, -1F, 40, 2, 2, 0F); // Import PGA2,Barrel
		bodyModel[40].setRotationPoint(-273F, -61F, 0F);



		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[1];
		gun_1_Model[0][0] = new ModelRendererTurbo(this, 1850, 250, textureX, textureY); // Import PG,Turret

		gun_1_Model[0][0].addBox(-20F, -18F, -25F, 40, 36, 50, 0F); // Import PG,Turret

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[0])
		{
			gunPart.setRotationPoint(528F, -58F, 0F);
		}


		gun_1_Model[1] = new ModelRendererTurbo[0];

		gun_1_Model[2] = new ModelRendererTurbo[2];
		gun_1_Model[2][0] = new ModelRendererTurbo(this, 1900, 350, textureX, textureY); // Import PG,BarrelLeft
		gun_1_Model[2][1] = new ModelRendererTurbo(this, 1900, 350, textureX, textureY); // Import PG,BarrelRight

		gun_1_Model[2][0].addBox(-25F, -7.5F, -10F, 80, 5, 5, 0F); // Import PG,BarrelLeft

		gun_1_Model[2][1].addBox(-25F, -7.5F, 5F, 80, 5, 5, 0F); // Import PG,BarrelRight

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[2])
		{
			gunPart.setRotationPoint(528F, -58F, 0F);
		}


		registerGunModel("PassengerGun1", gun_1_Model);

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[1];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 1850, 250, textureX, textureY); // Import PG,Turret

		gun_2_Model[0][0].addBox(-20F, -18F, -25F, 40, 36, 50, 0F); // Import PG,Turret

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(-423F, -18F, 0F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[0];

		gun_2_Model[2] = new ModelRendererTurbo[2];
		gun_2_Model[2][0] = new ModelRendererTurbo(this, 1900, 350, textureX, textureY); // Import PG,BarrelLeft
		gun_2_Model[2][1] = new ModelRendererTurbo(this, 1900, 350, textureX, textureY); // Import PG,BarrelRight

		gun_2_Model[2][0].addBox(-25F, -7.5F, -10F, 80, 5, 5, 0F); // Import PG,BarrelLeft

		gun_2_Model[2][1].addBox(-25F, -7.5F, 5F, 80, 5, 5, 0F); // Import PG,BarrelRight

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[2])
		{
			gunPart.setRotationPoint(-423F, -18F, 0F);
		}


		registerGunModel("PassengerGun2", gun_2_Model);

		translateAll(0F, 0F, 0F);


		flipAll();
	}
}