//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelMonitor extends ModelVehicle
{
	int textureX = 512;
	int textureY = 512;

	public ModelMonitor()
	{
		bodyModel = new ModelRendererTurbo[27];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 400, textureX, textureY); // Import MainBody
		bodyModel[1] = new ModelRendererTurbo(this, 250, 0, textureX, textureY); // Back Left
		bodyModel[2] = new ModelRendererTurbo(this, 11, 80, textureX, textureY); // Import FrontCover-Up
		bodyModel[3] = new ModelRendererTurbo(this, 16, 0, textureX, textureY); // Import ViewPortLandTop
		bodyModel[4] = new ModelRendererTurbo(this, 17, 0, textureX, textureY); // Import ViewPortLand
		bodyModel[5] = new ModelRendererTurbo(this, 18, 0, textureX, textureY); // Import FlagPole
		bodyModel[6] = new ModelRendererTurbo(this, 120, 200, textureX, textureY); // Import Flag
		bodyModel[7] = new ModelRendererTurbo(this, 20, 0, textureX, textureY); // Import Bottom1
		bodyModel[8] = new ModelRendererTurbo(this, 21, 0, textureX, textureY); // Import Bottom2
		bodyModel[9] = new ModelRendererTurbo(this, 22, 0, textureX, textureY); // Import Bottom3
		bodyModel[10] = new ModelRendererTurbo(this, 23, 0, textureX, textureY); // Import Bottom4
		bodyModel[11] = new ModelRendererTurbo(this, 24, 0, textureX, textureY); // Import BottomFrontCorner
		bodyModel[12] = new ModelRendererTurbo(this, 25, 0, textureX, textureY); // Import BottomFrontCorner2
		bodyModel[13] = new ModelRendererTurbo(this, 28, 0, textureX, textureY); // Import Exhaust1
		bodyModel[14] = new ModelRendererTurbo(this, 29, 0, textureX, textureY); // Import Exhaust2
		bodyModel[15] = new ModelRendererTurbo(this, 30, 0, textureX, textureY); // Import BackCorner1
		bodyModel[16] = new ModelRendererTurbo(this, 31, 0, textureX, textureY); // Import BackCorner2
		bodyModel[17] = new ModelRendererTurbo(this, 32, 0, textureX, textureY); // Import BottomRod
		bodyModel[18] = new ModelRendererTurbo(this, 33, 0, textureX, textureY); // Import BackRod
		bodyModel[19] = new ModelRendererTurbo(this, 34, 0, textureX, textureY); // Import Rudder
		bodyModel[20] = new ModelRendererTurbo(this, 35, 0, textureX, textureY); // Import Box24
		bodyModel[21] = new ModelRendererTurbo(this, 36, 0, textureX, textureY); // Import Box25
		bodyModel[22] = new ModelRendererTurbo(this, 37, 0, textureX, textureY); // Import Box26
		bodyModel[23] = new ModelRendererTurbo(this, 38, 0, textureX, textureY); // Import PropCore
		bodyModel[24] = new ModelRendererTurbo(this, 1, 4, textureX, textureY); // Import Prop
		bodyModel[25] = new ModelRendererTurbo(this, 250, 0, textureX, textureY); // Back Right
		bodyModel[26] = new ModelRendererTurbo(this, 11, 80, textureX, textureY); // Box 16

		bodyModel[0].addBox(0F, 0F, 0F, 155, 6, 70, 0F); // Import MainBody
		bodyModel[0].setRotationPoint(-80F, -10F, -35F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 5, 6, 35, 0F,90F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,60F, 0F, -10F,90F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,60F, 0F, -10F); // Back Left
		bodyModel[1].setRotationPoint(-85F, -10F, 0F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 5, 6, 35, 0F,0F, 0F, 0F,70F, 0F, 0F,50F, 0F, -15F,0F, 0F, 0F,0F, 0F, 0F,70F, 0F, 0F,50F, 0F, -15F,0F, 0F, 0F); // Import FrontCover-Up
		bodyModel[2].setRotationPoint(75F, -10F, 0F);

		bodyModel[3].addBox(0F, 0F, 0F, 10, 2, 10, 0F); // Import ViewPortLandTop
		bodyModel[3].setRotationPoint(90F, -18F, -5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 10, 6, 10, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,7F, 0F, 7F,7F, 0F, 7F,7F, 0F, 7F,7F, 0F, 7F); // Import ViewPortLand
		bodyModel[4].setRotationPoint(90F, -16F, -5F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 49, 1, 0F); // Import FlagPole
		bodyModel[5].setRotationPoint(-165F, -56F, -0.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 14, 10, 0, 0F); // Import Flag
		bodyModel[6].setRotationPoint(-179F, -55F, 0F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F,80F, 0F, 0F,80F, 0F, 20F,0F, 0F, 28F,0F, 0F, 0F,80F, 0F, 0F,80F, 0F, 12F,0F, 0F, 17F); // Import Bottom1
		bodyModel[7].setRotationPoint(14F, -4F, 0F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F,80F, 0F, 0F,80F, 0F, -21F,0F, 0F, -29F,0F, 0F, 0F,80F, 0F, 0F,80F, 0F, -13F,0F, 0F, -18F); // Import Bottom2
		bodyModel[8].setRotationPoint(14F, -4F, 0F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F,-95F, 0F, 0F,-95F, 0F, 20F,0F, 0F, 28F,0F, 0F, 0F,-95F, 0F, 0F,-95F, 0F, 12F,0F, 0F, 17F); // Import Bottom3
		bodyModel[9].setRotationPoint(14F, -4F, 0F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F,-95F, 0F, 0F,-95F, 0F, -21F,0F, 0F, -29F,0F, 0F, 0F,-95F, 0F, 0F,-95F, 0F, -13F,0F, 0F, -18F); // Import Bottom4
		bodyModel[10].setRotationPoint(14F, -4F, 0F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F,20F, 0F, 0F,8F, 0F, 14F,0F, 0F, 20F,0F, 0F, 0F,20F, -12F, 0F,20F, -12F, -1F,0F, 0F, 12F); // Import BottomFrontCorner
		bodyModel[11].setRotationPoint(95F, -4F, 0F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F,20F, 0F, 0F,8F, 0F, -15F,0F, 0F, -21F,0F, 0F, 0F,20F, -12F, 0F,20F, -12F, -1F,0F, 0F, -13F); // Import BottomFrontCorner2
		bodyModel[12].setRotationPoint(95F, -4F, 0F);

		bodyModel[13].addBox(0F, 0F, 0F, 6, 12, 6, 0F); // Import Exhaust1
		bodyModel[13].setRotationPoint(-44F, -22F, 11F);

		bodyModel[14].addBox(0F, 0F, 0F, 6, 12, 6, 0F); // Import Exhaust2
		bodyModel[14].setRotationPoint(-44F, -22F, -17F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F,-25F, 0F, 0F,-10F, 0F, 12F,0F, 0F, 20F,0F, 0F, 0F,-10F, -4F, 0F,-10F, -4F, 6F,0F, 0F, 12F); // Import BackCorner1
		bodyModel[15].setRotationPoint(-80F, -4F, 0F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F,-25F, 0F, 0F,-10F, 0F, -13F,0F, 0F, -21F,0F, 0F, 0F,-10F, -4F, 0F,-10F, -4F, -7F,0F, 0F, -13F); // Import BackCorner2
		bodyModel[16].setRotationPoint(-80F, -4F, 0F);

		bodyModel[17].addBox(0F, 0F, 0F, 70, 1, 1, 0F); // Import BottomRod
		bodyModel[17].setRotationPoint(-150F, 6.5F, -0.5F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Import BackRod
		bodyModel[18].setRotationPoint(-150F, -5F, -0.5F);

		bodyModel[19].addBox(0F, 0F, 0F, 12, 8, 2, 0F); // Import Rudder
		bodyModel[19].setRotationPoint(-155F, -3F, -1F);

		bodyModel[20].addBox(0F, 0F, 0F, 10, 2, 2, 0F); // Import Box24
		bodyModel[20].setRotationPoint(-100F, 0.5F, -1F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Import Box25
		bodyModel[21].setRotationPoint(-140F, -5F, -0.5F);

		bodyModel[22].addBox(0F, 0F, 0F, 40, 1, 1, 0F); // Import Box26
		bodyModel[22].setRotationPoint(-135F, 1F, -0.5F);

		bodyModel[23].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Import PropCore
		bodyModel[23].setRotationPoint(-138F, 0.5F, -1F);

		bodyModel[24].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Import Prop
		bodyModel[24].setRotationPoint(-137F, -2.5F, -0.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 5, 6, 35, 0F,60F, 0F, -10F,0F, 0F, 0F,0F, 0F, 0F,90F, 0F, 0F,60F, 0F, -10F,0F, 0F, 0F,0F, 0F, 0F,90F, 0F, 0F); // Back Right
		bodyModel[25].setRotationPoint(-85F, -10F, -35F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 5, 6, 35, 0F,0F, 0F, 0F,50F, 0F, -15F,70F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,50F, 0F, -15F,70F, 0F, 0F,0F, 0F, 0F); // Box 16
		bodyModel[26].setRotationPoint(75F, -10F, -35F);


		turretModel = new ModelRendererTurbo[4];
		turretModel[0] = new ModelRendererTurbo(this, 12, 0, textureX, textureY); // Import TurretMain
		turretModel[1] = new ModelRendererTurbo(this, 14, 0, textureX, textureY); // Import Turret3
		turretModel[2] = new ModelRendererTurbo(this, 12, 0, textureX, textureY); // Turret 2
		turretModel[3] = new ModelRendererTurbo(this, 14, 0, textureX, textureY); // Turret 4

		turretModel[0].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F,18F, 0F, 0F,12F, 0F, 12F,0F, 0F, 17F,0F, 0F, 0F,18F, 0F, 0F,12F, 0F, 12F,0F, 0F, 17F); // Import TurretMain
		turretModel[0].setRotationPoint(0F, -28F, 0F);

		turretModel[1].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F,-19F, 0F, 0F,-13F, 0F, -13F,0F, 0F, -19F,0F, 0F, 0F,-19F, 0F, 0F,-13F, 0F, -13F,0F, 0F, -19F); // Import Turret3
		turretModel[1].setRotationPoint(0F, -28F, 0F);

		turretModel[2].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 17F,12F, 0F, 12F,18F, 0F, 0F,0F, 0F, 0F,0F, 0F, 17F,12F, 0F, 12F,18F, 0F, 0F,0F, 0F, 0F); // Turret 2
		turretModel[2].setRotationPoint(0F, -28F, -1F);

		turretModel[3].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, -19F,-13F, 0F, -13F,-19F, 0F, 0F,0F, 0F, 0F,0F, 0F, -19F,-13F, 0F, -13F,-19F, 0F, 0F,0F, 0F, 0F); // Turret 4
		turretModel[3].setRotationPoint(0F, -28F, -1F);


		barrelModel = new ModelRendererTurbo[2];
		barrelModel[0] = new ModelRendererTurbo(this, 200, 80, textureX, textureY); // Import Cannon2
		barrelModel[1] = new ModelRendererTurbo(this, 200, 80, textureX, textureY); // Import Box16

		barrelModel[0].addBox(0F, -1.5F, -5.5F, 24, 3, 3, 0F); // Import Cannon2
		barrelModel[0].setRotationPoint(0F, -18F, 0F);

		barrelModel[1].addBox(0F, -1.5F, 2.5F, 24, 3, 3, 0F); // Import Box16
		barrelModel[1].setRotationPoint(0F, -18F, 0F);



		translateAll(100F, 0F, 0F);


		flipAll();
	}
}
