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

public class ModelHashidate extends ModelVehicle
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelHashidate()
	{

// Body
		bodyModel = new ModelRendererTurbo[37];
		bodyModel[0] = new ModelRendererTurbo(this,  800,  1750, textureX, textureY); // CR.SpinalChordBack
		bodyModel[1] = new ModelRendererTurbo(this,  0,  850, textureX, textureY); // CR.SpinalChordFront
		bodyModel[2] = new ModelRendererTurbo(this,  0,  600, textureX, textureY); // CR.FloorBack
		bodyModel[3] = new ModelRendererTurbo(this,  0,  1700, textureX, textureY); // CR.SpinalChordFront
		bodyModel[4] = new ModelRendererTurbo(this,  1300,  1800, textureX, textureY); // CR.Commandcentre
		bodyModel[5] = new ModelRendererTurbo(this,  0,  1250, textureX, textureY); // CR.FrontAngleright
		bodyModel[6] = new ModelRendererTurbo(this,  0,  1250, textureX, textureY); // CR.FrontAngleLeft
		bodyModel[7] = new ModelRendererTurbo(this,  0,  1450, textureX, textureY); // CR.FrontAngleright2
		bodyModel[8] = new ModelRendererTurbo(this,  0,  1450, textureX, textureY); // CR.FrontAngleright2
		bodyModel[9] = new ModelRendererTurbo(this,  0,  1000, textureX, textureY); // CR.FrontFiller
		bodyModel[10] = new ModelRendererTurbo(this,  400,  1000, textureX, textureY); // CR.FrontFiller
		bodyModel[11] = new ModelRendererTurbo(this,  800,  1900, textureX, textureY); // CR.SpinalChordBackRight
		bodyModel[12] = new ModelRendererTurbo(this,  800,  1900, textureX, textureY); // CR.SpinalChordBackLeft
		bodyModel[13] = new ModelRendererTurbo(this,  800,  1500, textureX, textureY); // CR.SpinalChordBackFiller
		bodyModel[14] = new ModelRendererTurbo(this,  1600,  1000, textureX, textureY); // CR.CommandPorch
		bodyModel[15] = new ModelRendererTurbo(this,  1800,  600, textureX, textureY); // CR.CommandSquareRight
		bodyModel[16] = new ModelRendererTurbo(this,  1800,  600, textureX, textureY); // CR.CommandSquareLeft
		bodyModel[17] = new ModelRendererTurbo(this,  1750,  750, textureX, textureY); // CR.FrontCommandsquare
		bodyModel[18] = new ModelRendererTurbo(this,  1800,  1200, textureX, textureY); // CR.CommSquare
		bodyModel[19] = new ModelRendererTurbo(this,  1600,  1200, textureX, textureY); // CR.CommsquareSpine
		bodyModel[20] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CR.MainCommPole
		bodyModel[21] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CR.AntennaTop
		bodyModel[22] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CR.JesusDetector
		bodyModel[23] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CR.AngletennaRight
		bodyModel[24] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CR.AngletennaLeft
		bodyModel[25] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CR.JesusDetectorTop
		bodyModel[26] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CR.CommPoleLeft
		bodyModel[27] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CR.CommPoleRight
		bodyModel[28] = new ModelRendererTurbo(this,  1400,  1400, textureX, textureY); // CR.SmokeStack
		bodyModel[29] = new ModelRendererTurbo(this,  1400,  1700, textureX, textureY); // CR.UnderSmokestack
		bodyModel[30] = new ModelRendererTurbo(this,  800,  1200, textureX, textureY); // CR.Buildings1
		bodyModel[31] = new ModelRendererTurbo(this,  800,  1000, textureX, textureY); // CR.Buildings2
		bodyModel[32] = new ModelRendererTurbo(this,  950,  850, textureX, textureY); // CR.MidBuildings
		bodyModel[33] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CR.BackCommPole
		bodyModel[34] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CR.JesusDetector
		bodyModel[35] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CR.BackPoleRight
		bodyModel[36] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CR.BackPoleLeft

		bodyModel[0].addBox(0F, 0F, 0F, 160, 52, 40, 0F); // CR.SpinalChordBack
		bodyModel[0].setRotationPoint(-160F, -20F, -20F);

		bodyModel[1].addBox(0F, 0F, 0F, 400, 90, 20, 0F); // CR.SpinalChordFront
		bodyModel[1].setRotationPoint(760F, -58F, -10F);

		bodyModel[2].addBox(0F, 0F, 0F, 560, 52, 160, 0F); // CR.FloorBack
		bodyModel[2].setRotationPoint(0F, -20F, -80F);

		bodyModel[3].addBox(0F, 0F, 0F, 200, 90, 160, 0F); // CR.SpinalChordFront
		bodyModel[3].setRotationPoint(560F, -58F, -80F);

		bodyModel[4].addBox(0F, 0F, 0F, 225, 45, 100, 0F); // CR.Commandcentre
		bodyModel[4].setRotationPoint(570F, -103F, -50F);

		bodyModel[5].addBox(-180F, 0F, -10F, 180, 90, 20, 0F); // CR.FrontAngleright
		bodyModel[5].setRotationPoint(1157F, -58F, 0F);
		bodyModel[5].rotateAngleY = -0.2617994F;

		bodyModel[6].addBox(-180F, 0F, -10F, 180, 90, 20, 0F); // CR.FrontAngleLeft
		bodyModel[6].setRotationPoint(1157F, -58F, 0F);
		bodyModel[6].rotateAngleY = 0.2617994F;

		bodyModel[7].addBox(-235F, 0F, -60F, 230, 90, 70, 0F); // CR.FrontAngleright2
		bodyModel[7].setRotationPoint(990F, -58F, 46F);
		bodyModel[7].rotateAngleY = -0.1047198F;

		bodyModel[8].addBox(-235F, 0F, -10F, 230, 90, 70, 0F); // CR.FrontAngleright2
		bodyModel[8].setRotationPoint(990F, -58F, -46F);
		bodyModel[8].rotateAngleY = 0.1047198F;

		bodyModel[9].addBox(0F, 0F, 0F, 60, 90, 80, 0F); // CR.FrontFiller
		bodyModel[9].setRotationPoint(978F, -58F, -40F);

		bodyModel[10].addBox(0F, 0F, 0F, 45, 90, 60, 0F); // CR.FrontFiller
		bodyModel[10].setRotationPoint(1038F, -58F, -30F);

		bodyModel[11].addBox(0F, 0F, -20F, 171, 52, 40, 0F); // CR.SpinalChordBackRight
		bodyModel[11].setRotationPoint(-153F, -20F, 0F);
		bodyModel[11].rotateAngleY = 0.3665192F;

		bodyModel[12].addBox(0F, 0F, -20F, 171, 52, 40, 0F); // CR.SpinalChordBackLeft
		bodyModel[12].setRotationPoint(-153F, -20F, 0F);
		bodyModel[12].rotateAngleY = -0.3665192F;

		bodyModel[13].addBox(0F, 0F, 0F, 50, 52, 80, 0F); // CR.SpinalChordBackFiller
		bodyModel[13].setRotationPoint(-50F, -20F, -40F);

		bodyModel[14].addBox(0F, 0F, 0F, 70, 22, 120, 0F); // CR.CommandPorch
		bodyModel[14].setRotationPoint(560F, -125F, -60F);

		bodyModel[15].addBox(0F, 0F, -35F, 80, 58, 35, 0F); // CR.CommandSquareRight
		bodyModel[15].setRotationPoint(625F, -160F, 50F);
		bodyModel[15].rotateAngleY = -0.3141593F;

		bodyModel[16].addBox(0F, 0F, 0F, 80, 58, 35, 0F); // CR.CommandSquareLeft
		bodyModel[16].setRotationPoint(625F, -160F, -50F);
		bodyModel[16].rotateAngleY = 0.3141593F;

		bodyModel[17].addBox(0F, 0F, 0F, 80, 58, 50, 0F); // CR.FrontCommandsquare
		bodyModel[17].setRotationPoint(622F, -160F, -25F);

		bodyModel[18].addBox(-21F, 0F, -21F, 42, 28, 42, 0F); // CR.CommSquare
		bodyModel[18].setRotationPoint(620F, -188F, 0F);

		bodyModel[19].addBox(0F, -8F, 0F, 34, 46, 32, 0F); // CR.CommsquareSpine
		bodyModel[19].setRotationPoint(595F, -161F, -16F);
		bodyModel[19].rotateAngleZ = -0.3717861F;

		bodyModel[20].addBox(0F, 0F, 0F, 8, 400, 8, 0F); // CR.MainCommPole
		bodyModel[20].setRotationPoint(550F, -500F, -4F);
		bodyModel[20].rotateAngleZ = 0.05235988F;

		bodyModel[21].addBox(-2.5F, -2F, -6F, 12, 30, 12, 0F); // CR.AntennaTop
		bodyModel[21].setRotationPoint(550F, -500F, 0F);
		bodyModel[21].rotateAngleZ = 0.05235988F;

		bodyModel[22].addBox(0F, 50F, 0F, 10, 10, 120, 0F); // CR.JesusDetector
		bodyModel[22].setRotationPoint(563F, -400F, -60F);
		bodyModel[22].rotateAngleZ = 0.05235988F;

		bodyModel[23].addBox(-2F, 0F, 0F, 10, 8, 50, 0F); // CR.AngletennaRight
		bodyModel[23].setRotationPoint(560F, -375F, 0F);
		bodyModel[23].rotateAngleX = 0.1396263F;
		bodyModel[23].rotateAngleY = 0.3490658F;
		bodyModel[23].rotateAngleZ = -0.3490658F;

		bodyModel[24].addBox(-2F, 0F, -50F, 10, 8, 50, 0F); // CR.AngletennaLeft
		bodyModel[24].setRotationPoint(560F, -375F, 0F);
		bodyModel[24].rotateAngleX = -0.1396263F;
		bodyModel[24].rotateAngleY = -0.3490658F;
		bodyModel[24].rotateAngleZ = -0.3490658F;

		bodyModel[25].addBox(0F, 66F, 0F, 10, 6, 70, 0F); // CR.JesusDetectorTop
		bodyModel[25].setRotationPoint(557F, -500F, -35F);
		bodyModel[25].rotateAngleZ = 0.05235988F;

		bodyModel[26].addBox(-4F, 0F, -4F, 8, 350, 8, 0F); // CR.CommPoleLeft
		bodyModel[26].setRotationPoint(560F, -350F, 0F);
		bodyModel[26].rotateAngleX = -0.1570796F;
		bodyModel[26].rotateAngleZ = -0.1570796F;

		bodyModel[27].addBox(-4F, 0F, -4F, 8, 350, 8, 0F); // CR.CommPoleRight
		bodyModel[27].setRotationPoint(560F, -350F, 0F);
		bodyModel[27].rotateAngleX = 0.1570796F;
		bodyModel[27].rotateAngleZ = -0.1570796F;

		bodyModel[28].addBox(0F, 0F, 0F, 40, 160, 30, 0F); // CR.SmokeStack
		bodyModel[28].setRotationPoint(430F, -170F, -15F);
		bodyModel[28].rotateAngleZ = 0.03490658F;

		bodyModel[29].addBox(0F, 0F, 0F, 100, 30, 40, 0F); // CR.UnderSmokestack
		bodyModel[29].setRotationPoint(380F, -48F, -20F);

		bodyModel[30].addBox(0F, 0F, 0F, 120, 50, 85, 0F); // CR.Buildings1
		bodyModel[30].setRotationPoint(260F, -70F, -42.5F);

		bodyModel[31].addBox(0F, 0F, 0F, 100, 50, 85, 0F); // CR.Buildings2
		bodyModel[31].setRotationPoint(100F, -70F, -42.5F);

		bodyModel[32].addBox(0F, 0F, 0F, 60, 50, 60, 0F); // CR.MidBuildings
		bodyModel[32].setRotationPoint(200F, -70F, -30F);

		bodyModel[33].addBox(-350F, 0F, 0F, 8, 330, 8, 0F); // CR.BackCommPole
		bodyModel[33].setRotationPoint(550F, -410F, -4F);
		bodyModel[33].rotateAngleZ = 0.05235988F;

		bodyModel[34].addBox(0F, 0F, 0F, 10, 10, 100, 0F); // CR.JesusDetector
		bodyModel[34].setRotationPoint(200F, -345F, -50F);
		bodyModel[34].rotateAngleZ = 0.05235988F;

		bodyModel[35].addBox(0F, -280F, 40F, 8, 207, 8, 0F); // CR.BackPoleRight
		bodyModel[35].setRotationPoint(162F, 11F, 0F);
		bodyModel[35].rotateAngleX = 0.1570796F;
		bodyModel[35].rotateAngleZ = -0.1570796F;

		bodyModel[36].addBox(0F, -280F, -48F, 8, 207, 8, 0F); // CR.BackPoleLeft
		bodyModel[36].setRotationPoint(162F, 11F, 0F);
		bodyModel[36].rotateAngleX = -0.1570796F;
		bodyModel[36].rotateAngleZ = -0.1570796F;

		
		
		
		
		ModelRendererTurbo[][] FrontGunModel = new ModelRendererTurbo[3][];

		FrontGunModel[0] = new ModelRendererTurbo[1];
		FrontGunModel[0][0] = new ModelRendererTurbo(this,  1850,  250, textureX, textureY); // PG.Turret

		FrontGunModel[0][0].addBox(-20F, 0F, -25F, 40, 36, 50, 0F); // PG.Turret
		FrontGunModel[0][0].setRotationPoint(940F, -95F, 0F);		
		
		for(ModelRendererTurbo FrontGunPart : FrontGunModel[0])
			FrontGunPart.setRotationPoint(940F, -95F, 0F);


		FrontGunModel[1] = new ModelRendererTurbo[2];
		FrontGunModel[1][0] = new ModelRendererTurbo(this,  1900,  350, textureX, textureY); // PG.BarrelLeft
		FrontGunModel[1][1] = new ModelRendererTurbo(this,  1900,  350, textureX, textureY); // PG.BarrelRight

		FrontGunModel[1][0].addBox(-25F, -2.5F, -10F, 80, 5, 5, 0F); // PG.BarrelLeft
		FrontGunModel[1][0].setRotationPoint(940F, -81F, 0F);

		FrontGunModel[1][1].addBox(-25F, -2.5F, 5F, 80, 5, 5, 0F); // PG.BarrelRight
		FrontGunModel[1][1].setRotationPoint(940F, -81F, 0F);		
		
		for(ModelRendererTurbo FrontGunPart : FrontGunModel[1])
			FrontGunPart.setRotationPoint(940F, -81F, 0F);


		FrontGunModel[2] = new ModelRendererTurbo[2];
		FrontGunModel[2][0] = new ModelRendererTurbo(this,  1900,  350, textureX, textureY); // PG.BarrelLeft
		FrontGunModel[2][1] = new ModelRendererTurbo(this,  1900,  350, textureX, textureY); // PG.BarrelRight

		FrontGunModel[2][0].addBox(-25F, -2.5F, -10F, 80, 5, 5, 0F); // PG.BarrelLeft
		FrontGunModel[2][0].setRotationPoint(940F, -81F, 0F);

		FrontGunModel[2][1].addBox(-25F, -2.5F, 5F, 80, 5, 5, 0F); // PG.BarrelRight
		FrontGunModel[2][1].setRotationPoint(940F, -81F, 0F);		
		
		for(ModelRendererTurbo FrontGunPart : FrontGunModel[2])
			FrontGunPart.setRotationPoint(940F, -81F, 0F);
		
		registerGunModel("FrontGun", FrontGunModel);
		
		
		
		
		
		
		//Copy This part into your model
		
		ModelRendererTurbo[][] AAGUN2Model = new ModelRendererTurbo[3][];

		AAGUN2Model[0] = new ModelRendererTurbo[1];
		AAGUN2Model[0][0] = new ModelRendererTurbo(this,  1900,  150, textureX, textureY); // PGA2.Turret

		AAGUN2Model[0][0].addBox(-10F, 0F, -15F, 20, 20, 30, 0F); // PGA2.Turret
		AAGUN2Model[0][0].setRotationPoint(150F, -90F, 0F);		
		
		for(ModelRendererTurbo AAGUN2Part : AAGUN2Model[0])
			AAGUN2Part.setRotationPoint(150F, -90F, 0F);


		AAGUN2Model[1] = new ModelRendererTurbo[1];
		AAGUN2Model[1][0] = new ModelRendererTurbo(this,  1900,  100, textureX, textureY); // PGA2.Barrel

		AAGUN2Model[1][0].addBox(-12F, -1F, -1F, 40, 2, 2, 0F); // PGA2.Barrel
		AAGUN2Model[1][0].setRotationPoint(150F, -80F, 0F);		
		
		for(ModelRendererTurbo AAGUN2Part : AAGUN2Model[1])
			AAGUN2Part.setRotationPoint(150F, -80F, 0F);


		AAGUN2Model[2] = new ModelRendererTurbo[1];
		AAGUN2Model[2][0] = new ModelRendererTurbo(this,  1900,  100, textureX, textureY); // PGA2.Barrel

		AAGUN2Model[2][0].addBox(-12F, -1F, -1F, 40, 2, 2, 0F); // PGA2.Barrel
		AAGUN2Model[2][0].setRotationPoint(150F, -80F, 0F);		
		
		for(ModelRendererTurbo AAGUN2Part : AAGUN2Model[2])
			AAGUN2Part.setRotationPoint(150F, -80F, 0F);
		
		registerGunModel("AAGunTwo", AAGUN2Model);
		
		
		
		
		//Copy This part into your model
		
		ModelRendererTurbo[][] AAGUN1Model = new ModelRendererTurbo[3][];

		AAGUN1Model[0] = new ModelRendererTurbo[1];
		AAGUN1Model[0][0] = new ModelRendererTurbo(this,  1900,  150, textureX, textureY); // PGA.Turret

		AAGUN1Model[0][0].addBox(-10F, 0F, -15F, 20, 20, 30, 0F); // PGA.Turret
		AAGUN1Model[0][0].setRotationPoint(751F, -123F, 0F);		
		
		for(ModelRendererTurbo AAGUN1Part : AAGUN1Model[0])
			AAGUN1Part.setRotationPoint(751F, -123F, 0F);


		AAGUN1Model[1] = new ModelRendererTurbo[1];
		AAGUN1Model[1][0] = new ModelRendererTurbo(this,  1900,  100, textureX, textureY); // PGA.Barrel

		AAGUN1Model[1][0].addBox(-12F, -1F, -1F, 40, 2, 2, 0F); // PGA.Barrel
		AAGUN1Model[1][0].setRotationPoint(751F, -113F, 0F);		
		
		for(ModelRendererTurbo AAGUN1Part : AAGUN1Model[1])
			AAGUN1Part.setRotationPoint(751F, -113F, 0F);


		AAGUN1Model[2] = new ModelRendererTurbo[1];
		AAGUN1Model[2][0] = new ModelRendererTurbo(this,  1900,  100, textureX, textureY); // PGA.Barrel

		AAGUN1Model[2][0].addBox(-12F, -1F, -1F, 40, 2, 2, 0F); // PGA.Barrel
		AAGUN1Model[2][0].setRotationPoint(751F, -113F, 0F);		
		
		for(ModelRendererTurbo AAGUN1Part : AAGUN1Model[2])
			AAGUN1Part.setRotationPoint(751F, -113F, 0F);
		
		registerGunModel("AAGunOne", AAGUN1Model);
		
		


// Turret
		turretModel = new ModelRendererTurbo[1];
		turretModel[0] = new ModelRendererTurbo(this,  1850,  250, textureX, textureY); // TR.Turret

		turretModel[0].addBox(-20F, 0F, -25F, 40, 36, 50, 0F); // TR.Turret
		turretModel[0].setRotationPoint(0F, -56F, 0F);



// Barrel
		barrelModel = new ModelRendererTurbo[2];
		barrelModel[0] = new ModelRendererTurbo(this,  1900,  350, textureX, textureY); // BL.Barrel12cm
		barrelModel[1] = new ModelRendererTurbo(this,  1900,  350, textureX, textureY); // BL.Barrel12cm

		barrelModel[0].addBox(-25F, -2.5F, -10F, 80, 5, 5, 0F); // BL.Barrel12cm
		barrelModel[0].setRotationPoint(0F, -42F, 0F);

		barrelModel[1].addBox(-25F, -2.5F, 5F, 80, 5, 5, 0F); // BL.Barrel12cm
		barrelModel[1].setRotationPoint(0F, -42F, 0F);


		translateAll(0, 0, 0);


		flipAll();
	}
}