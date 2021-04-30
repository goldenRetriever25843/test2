//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.2.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelK1A1 extends ModelVehicle
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelK1A1()
	{
		bodyModel = new ModelRendererTurbo[42];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 100, textureX, textureY); // Import Body2
		bodyModel[1] = new ModelRendererTurbo(this, 0, 151, textureX, textureY); // Import Body3
		bodyModel[2] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import Body12
		bodyModel[3] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import Body13
		bodyModel[4] = new ModelRendererTurbo(this, 0, 420, textureX, textureY); // Import Body14
		bodyModel[5] = new ModelRendererTurbo(this, 0, 530, textureX, textureY); // Import Body17
		bodyModel[6] = new ModelRendererTurbo(this, 0, 550, textureX, textureY); // Import Body18
		bodyModel[7] = new ModelRendererTurbo(this, 0, 570, textureX, textureY); // Import Body19
		bodyModel[8] = new ModelRendererTurbo(this, 0, 590, textureX, textureY); // Import Body20
		bodyModel[9] = new ModelRendererTurbo(this, 0, 610, textureX, textureY); // Import Body21
		bodyModel[10] = new ModelRendererTurbo(this, 0, 630, textureX, textureY); // Import Body22
		bodyModel[11] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Import Body23
		bodyModel[12] = new ModelRendererTurbo(this, 0, 675, textureX, textureY); // Import Body24
		bodyModel[13] = new ModelRendererTurbo(this, 0, 675, textureX, textureY); // Import Body25
		bodyModel[14] = new ModelRendererTurbo(this, 0, 710, textureX, textureY); // Import Body27
		bodyModel[15] = new ModelRendererTurbo(this, 0, 730, textureX, textureY); // Import Body28
		bodyModel[16] = new ModelRendererTurbo(this, 0, 750, textureX, textureY); // Import Body29
		bodyModel[17] = new ModelRendererTurbo(this, 0, 530, textureX, textureY); // Import Body32
		bodyModel[18] = new ModelRendererTurbo(this, 0, 550, textureX, textureY); // Import Body33
		bodyModel[19] = new ModelRendererTurbo(this, 0, 570, textureX, textureY); // Import Body34
		bodyModel[20] = new ModelRendererTurbo(this, 0, 590, textureX, textureY); // Import Body35
		bodyModel[21] = new ModelRendererTurbo(this, 0, 610, textureX, textureY); // Import Body36
		bodyModel[22] = new ModelRendererTurbo(this, 0, 630, textureX, textureY); // Import Body37
		bodyModel[23] = new ModelRendererTurbo(this, 0, 675, textureX, textureY); // Import Body39
		bodyModel[24] = new ModelRendererTurbo(this, 0, 675, textureX, textureY); // Import Body40
		bodyModel[25] = new ModelRendererTurbo(this, 0, 710, textureX, textureY); // Import Body42
		bodyModel[26] = new ModelRendererTurbo(this, 0, 730, textureX, textureY); // Import Body44
		bodyModel[27] = new ModelRendererTurbo(this, 0, 750, textureX, textureY); // Import Body45
		bodyModel[28] = new ModelRendererTurbo(this, 0, 770, textureX, textureY); // Import Body46
		bodyModel[29] = new ModelRendererTurbo(this, 8, 840, textureX, textureY); // Import Body47
		bodyModel[30] = new ModelRendererTurbo(this, 0, 890, textureX, textureY); // Import Body48
		bodyModel[31] = new ModelRendererTurbo(this, 96, 179, textureX, textureY); // Box 0
		bodyModel[32] = new ModelRendererTurbo(this, 200, 890, textureX, textureY); // Box 1
		bodyModel[33] = new ModelRendererTurbo(this, 0, 550, textureX, textureY); // Box 2
		bodyModel[34] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 4
		bodyModel[35] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 5
		bodyModel[36] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 6
		bodyModel[37] = new ModelRendererTurbo(this, 0, 710, textureX, textureY); // Box 9
		bodyModel[38] = new ModelRendererTurbo(this, 250, 9, textureX, textureY); // Box 10
		bodyModel[39] = new ModelRendererTurbo(this, 0, 710, textureX, textureY); // Box 11
		bodyModel[40] = new ModelRendererTurbo(this, 0, 630, textureX, textureY); // Box 12
		bodyModel[41] = new ModelRendererTurbo(this, 0, 550, textureX, textureY); // Box 18

		bodyModel[0].addBox(0F, 0F, 0F, 98, 7, 42, 0F); // Import Body2
		bodyModel[0].setRotationPoint(-63F, -16F, -21F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 51, 4, 70, 0F,0F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Body3
		bodyModel[1].setRotationPoint(-64F, -18F, -35F);

		bodyModel[2].addBox(0F, 0F, 0F, 1, 1, 60, 0F); // Import Body12
		bodyModel[2].setRotationPoint(-65F, -13F, -30F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 1, 60, 0F); // Import Body13
		bodyModel[3].setRotationPoint(-65F, -9F, -30F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 9, 70, 0F); // Import Body14
		bodyModel[4].setRotationPoint(-64F, -12F, -35F);

		bodyModel[5].addBox(0F, 0F, 0F, 44, 12, 1, 0F); // Import Body17
		bodyModel[5].setRotationPoint(-43F, -9F, -35F);

		bodyModel[6].addBox(0F, 0F, 0F, 28, 17, 1, 0F); // Import Body18
		bodyModel[6].setRotationPoint(-42F, -13F, -35.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 14, 15, 1, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Body19
		bodyModel[7].setRotationPoint(-13.5F, -11F, -35.5F);

		bodyModel[8].addBox(0F, 0F, 0F, 11, 17, 1, 0F); // Import Body20
		bodyModel[8].setRotationPoint(1F, -13F, -35.5F);

		bodyModel[9].addBox(0F, 0F, 0F, 19, 17, 1, 0F); // Import Body21
		bodyModel[9].setRotationPoint(12.5F, -13F, -35.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 28, 15, 1, 0F,0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Body22
		bodyModel[10].setRotationPoint(32F, -11F, -35.7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 16, 4, 15, 0F,0F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Body23
		bodyModel[11].setRotationPoint(55F, -11F, -35.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 11, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Import Body24
		bodyModel[12].setRotationPoint(60F, -7F, -35.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 7, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Import Body25
		bodyModel[13].setRotationPoint(64F, -7F, -22.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 32, 3, 14, 0F,0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Body27
		bodyModel[14].setRotationPoint(32F, -12F, -35F);

		bodyModel[15].addBox(0F, 0F, 0F, 59, 14, 1, 0F); // Import Body28
		bodyModel[15].setRotationPoint(1F, -11F, -35F);

		bodyModel[16].addBox(0F, 0F, 0F, 127, 13, 2, 0F); // Import Body29
		bodyModel[16].setRotationPoint(-63.5F, -9F, -22.5F);

		bodyModel[17].addBox(0F, 0F, 0F, 44, 12, 1, 0F); // Import Body32
		bodyModel[17].setRotationPoint(-43F, -9F, 34F);

		bodyModel[18].addBox(0F, 0F, 0F, 28, 17, 1, 0F); // Import Body33
		bodyModel[18].setRotationPoint(-42F, -13F, 34.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 14, 15, 1, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Body34
		bodyModel[19].setRotationPoint(-13.5F, -11F, 34.5F);

		bodyModel[20].addBox(0F, 0F, 0F, 11, 17, 1, 0F); // Import Body35
		bodyModel[20].setRotationPoint(1F, -13F, 34.5F);

		bodyModel[21].addBox(0F, 0F, 0F, 19, 17, 1, 0F); // Import Body36
		bodyModel[21].setRotationPoint(12.5F, -13F, 34.5F);

		bodyModel[22].addBox(0F, 0F, 0F, 28, 15, 1, 0F); // Import Body37
		bodyModel[22].setRotationPoint(32F, -11F, 34.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 11, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Import Body39
		bodyModel[23].setRotationPoint(60F, -7F, 33.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 7, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Import Body40
		bodyModel[24].setRotationPoint(64F, -7F, 20.5F);

		bodyModel[25].addBox(0F, 0F, 0F, 95, 5, 14, 0F); // Import Body42
		bodyModel[25].setRotationPoint(-63F, -14F, -35F);

		bodyModel[26].addBox(0F, 0F, 0F, 59, 14, 1, 0F); // Import Body44
		bodyModel[26].setRotationPoint(1F, -11F, 34F);

		bodyModel[27].addBox(0F, 0F, 0F, 127, 13, 2, 0F); // Import Body45
		bodyModel[27].setRotationPoint(-63.5F, -9F, 20.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 137, 7, 42, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F); // Import Body46
		bodyModel[28].setRotationPoint(-63F, -3F, -21F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 118, 5, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F); // Import Body47
		bodyModel[29].setRotationPoint(-63F, 4F, -21F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 4, 7, 33, 0F,0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F); // Import Body48
		bodyModel[30].setRotationPoint(35F, -16F, -16.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 26, 14, 42, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[31].setRotationPoint(35F, -16F, -21F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 5, 7, 42, 0F,0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[32].setRotationPoint(61F, -10F, -21F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 20, 13, 1, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Box 2
		bodyModel[33].setRotationPoint(-63F, -9F, 34.5F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 1, 60, 0F); // Box 4
		bodyModel[34].setRotationPoint(-65F, -11F, -30F);

		bodyModel[35].addBox(0F, 0F, 0F, 1, 1, 60, 0F); // Box 5
		bodyModel[35].setRotationPoint(-65F, -15F, -30F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 1, 60, 0F); // Box 6
		bodyModel[36].setRotationPoint(-65F, -17F, -30F);

		bodyModel[37].addBox(0F, 0F, 0F, 95, 5, 14, 0F); // Box 9
		bodyModel[37].setRotationPoint(-63F, -14F, 21F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 16, 4, 15, 0F,0F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[38].setRotationPoint(55F, -11F, 20.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 32, 3, 14, 0F,0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[39].setRotationPoint(32F, -12F, 21F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 28, 15, 1, 0F,0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[40].setRotationPoint(32F, -11F, 34.7F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 20, 13, 1, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Box 18
		bodyModel[41].setRotationPoint(-63F, -9F, -35.5F);


		turretModel = new ModelRendererTurbo[36];
		turretModel[0] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Import Turret1
		turretModel[1] = new ModelRendererTurbo(this, 300, 100, textureX, textureY); // Import Turret3
		turretModel[2] = new ModelRendererTurbo(this, 250, 150, textureX, textureY); // Import Turret4
		turretModel[3] = new ModelRendererTurbo(this, 250, 200, textureX, textureY); // Import Turret5
		turretModel[4] = new ModelRendererTurbo(this, 200, 250, textureX, textureY); // Import Turret6
		turretModel[5] = new ModelRendererTurbo(this, 206, 4, textureX, textureY); // Import Turret7
		turretModel[6] = new ModelRendererTurbo(this, 200, 410, textureX, textureY); // Import Turret8
		turretModel[7] = new ModelRendererTurbo(this, 200, 480, textureX, textureY); // Import Turret9
		turretModel[8] = new ModelRendererTurbo(this, 200, 480, textureX, textureY); // Import Turret10
		turretModel[9] = new ModelRendererTurbo(this, 200, 485, textureX, textureY); // Import Turret11
		turretModel[10] = new ModelRendererTurbo(this, 200, 485, textureX, textureY); // Import Turret12
		turretModel[11] = new ModelRendererTurbo(this, 200, 550, textureX, textureY); // Import Turret19
		turretModel[12] = new ModelRendererTurbo(this, 200, 550, textureX, textureY); // Import Turret20
		turretModel[13] = new ModelRendererTurbo(this, 200, 560, textureX, textureY); // Import Turret21
		turretModel[14] = new ModelRendererTurbo(this, 220, 600, textureX, textureY); // Import Turret22
		turretModel[15] = new ModelRendererTurbo(this, 200, 600, textureX, textureY); // Import Turret23
		turretModel[16] = new ModelRendererTurbo(this, 200, 250, textureX, textureY); // Import Turret24
		turretModel[17] = new ModelRendererTurbo(this, 200, 620, textureX, textureY); // Import Turret25
		turretModel[18] = new ModelRendererTurbo(this, 200, 620, textureX, textureY); // Import Turret26
		turretModel[19] = new ModelRendererTurbo(this, 200, 620, textureX, textureY); // Import Turret27
		turretModel[20] = new ModelRendererTurbo(this, 200, 640, textureX, textureY); // Import Turret28
		turretModel[21] = new ModelRendererTurbo(this, 200, 660, textureX, textureY); // Import Turret29
		turretModel[22] = new ModelRendererTurbo(this, 200, 660, textureX, textureY); // Import Turret30
		turretModel[23] = new ModelRendererTurbo(this, 200, 680, textureX, textureY); // Import Turret31
		turretModel[24] = new ModelRendererTurbo(this, 200, 250, textureX, textureY); // Import Turret32
		turretModel[25] = new ModelRendererTurbo(this, 200, 250, textureX, textureY); // Import Turret33
		turretModel[26] = new ModelRendererTurbo(this, 200, 250, textureX, textureY); // Import Turret34
		turretModel[27] = new ModelRendererTurbo(this, 200, 600, textureX, textureY); // Box 7
		turretModel[28] = new ModelRendererTurbo(this, 200, 600, textureX, textureY); // Box 8
		turretModel[29] = new ModelRendererTurbo(this, 200, 550, textureX, textureY); // Box 13
		turretModel[30] = new ModelRendererTurbo(this, 200, 550, textureX, textureY); // Box 14
		turretModel[31] = new ModelRendererTurbo(this, 200, 500, textureX, textureY); // Box 15
		turretModel[32] = new ModelRendererTurbo(this, 200, 500, textureX, textureY); // Box 16
		turretModel[33] = new ModelRendererTurbo(this, 300, 100, textureX, textureY); // Box 17
		turretModel[34] = new ModelRendererTurbo(this, 200, 500, textureX, textureY); // Box 19
		turretModel[35] = new ModelRendererTurbo(this, 200, 500, textureX, textureY); // Box 20

		turretModel[0].addShapeBox(0F, 0F, 0F, 26, 16, 64, 0F,0F, 0F, -8F, 0F, -3F, -8F, 0F, -3F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import Turret1
		turretModel[0].setRotationPoint(0F, -32F, -32F);

		turretModel[1].addShapeBox(-3F, 0F, 0F, 16, 13, 25, 0F,0F, 0F, 0F, -6F, -3F, 0F, -12F, -1F, -10F, 0F, 0F, -8F, 4F, 0F, 0F, 4F, -1F, 0F, -12F, -4F, -2F, 4F, 0F, 0F); // Import Turret3
		turretModel[1].setRotationPoint(29F, -29F, 7F);

		turretModel[2].addBox(0F, 0F, 0F, 5, 5, 30, 0F); // Import Turret4
		turretModel[2].setRotationPoint(-5F, -21F, -15F);

		turretModel[3].addShapeBox(0F, 0F, 0F, 10, 5, 30, 0F,0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F); // Import Turret5
		turretModel[3].setRotationPoint(-15F, -21F, -15F);

		turretModel[4].addShapeBox(15F, 0F, 0F, 20, 11, 60, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 5F, 2F, 0F, 5F, 2F, 0F, 0F, 0F); // Import Turret6
		turretModel[4].setRotationPoint(-35F, -32F, -30F);

		turretModel[5].addShapeBox(0F, 0F, 0F, 20, 11, 60, 0F,0F, 1F, -16F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -16F, 0F, -2F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -16F); // Import Turret7
		turretModel[5].setRotationPoint(-40F, -32F, -30F);

		turretModel[6].addBox(0F, 0F, 0F, 9, 2, 62, 0F); // Import Turret8
		turretModel[6].setRotationPoint(-50F, -22F, -31F);

		turretModel[7].addBox(0F, 0F, 0F, 2, 11, 2, 0F); // Import Turret9
		turretModel[7].setRotationPoint(-50F, -33F, -31F);

		turretModel[8].addBox(0F, 0F, 0F, 2, 11, 2, 0F); // Import Turret10
		turretModel[8].setRotationPoint(-50F, -33F, 29F);

		turretModel[9].addBox(0F, 0F, 0F, 1, 1, 58, 0F); // Import Turret11
		turretModel[9].setRotationPoint(-49F, -32F, -29F);

		turretModel[10].addBox(0F, 0F, 0F, 1, 1, 58, 0F); // Import Turret12
		turretModel[10].setRotationPoint(-49F, -27F, -29F);

		turretModel[11].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 6F, 0F, -1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 6F, 0F, 1F, -6F, 0F, 0F, 0F); // Import Turret19
		turretModel[11].setRotationPoint(0F, -32F, 29F);

		turretModel[12].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F); // Import Turret20
		turretModel[12].setRotationPoint(0F, -27F, 29F);

		turretModel[13].addBox(0F, 0F, 0F, 6, 10, 20, 0F); // Import Turret21
		turretModel[13].setRotationPoint(-41F, -32F, -10F);

		turretModel[14].addBox(20F, 0F, 0F, 3, 5, 3, 0F); // Import Turret22
		turretModel[14].setRotationPoint(-40F, -37F, -3.5F);

		turretModel[15].addBox(20F, 0F, 0F, 2, 9, 2, 0F); // Import Turret23
		turretModel[15].setRotationPoint(-39.5F, -46F, -3F);

		turretModel[16].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Turret24
		turretModel[16].setRotationPoint(6F, -31F, -10F);

		turretModel[17].addBox(0F, 0F, 0F, 12, 1, 4, 0F); // Import Turret25
		turretModel[17].setRotationPoint(6F, -31F, -10F);

		turretModel[18].addBox(0F, 0F, 0F, 12, 1, 4, 0F); // Import Turret26
		turretModel[18].setRotationPoint(6F, -31F, -14F);

		turretModel[19].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Turret27
		turretModel[19].setRotationPoint(6F, -31F, -18F);

		turretModel[20].addBox(0F, 0F, 0F, 4, 2, 12, 0F); // Import Turret28
		turretModel[20].setRotationPoint(10F, -33F, -18F);

		turretModel[21].addBox(0F, 0F, 0F, 4, 5, 2, 0F); // Import Turret29
		turretModel[21].setRotationPoint(10F, -38F, -18F);

		turretModel[22].addBox(0F, 0F, 0F, 4, 5, 2, 0F); // Import Turret30
		turretModel[22].setRotationPoint(10F, -38F, -8F);

		turretModel[23].addBox(0F, 0F, 0F, 12, 4, 4, 0F); // Import Turret31
		turretModel[23].setRotationPoint(7F, -36F, -14F);

		turretModel[24].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Turret32
		turretModel[24].setRotationPoint(-13F, -33F, 2F);

		turretModel[25].addBox(0F, 0F, 0F, 12, 1, 4, 0F); // Import Turret33
		turretModel[25].setRotationPoint(-13F, -33F, 6F);

		turretModel[26].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Turret34
		turretModel[26].setRotationPoint(-13F, -33F, 10F);

		turretModel[27].addShapeBox(20F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 34F, 0F, 0F, 34F, 0F, 0F, 34F, 0F, 0F, 34F, 0F); // Box 7
		turretModel[27].setRotationPoint(-58.5F, -65F, 9F);

		turretModel[28].addShapeBox(20F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 38F, 0F, 0F, 38F, 0F, 0F, 38F, 0F, 0F, 38F, 0F); // Box 8
		turretModel[28].setRotationPoint(-33.5F, -68F, -21F);

		turretModel[29].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, -6F, 0F, -1F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -6F, 0F, 1F, 6F, 0F, 0F, 0F); // Box 13
		turretModel[29].setRotationPoint(0F, -32F, -30F);

		turretModel[30].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F); // Box 14
		turretModel[30].setRotationPoint(0F, -27F, -30F);

		turretModel[31].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 40F, 0F, 0F, 40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 40F, 0F, 0F, 40F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[31].setRotationPoint(-48F, -32F, -30F);

		turretModel[32].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 40F, 0F, 0F, 40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 40F, 0F, 0F, 40F, 0F, 0F, 0F, 0F, 0F); // Box 16
		turretModel[32].setRotationPoint(-48F, -27F, -30F);

		turretModel[33].addShapeBox(-3F, 0F, 0F, 16, 13, 25, 0F,0F, 0F, -8F, -12F, -1F, -10F, -7F, -3F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -12F, -4F, -2F, 4F, -1F, 0F, 4F, 0F, 0F); // Box 17
		turretModel[33].setRotationPoint(29F, -29F, -32F);

		turretModel[34].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 40F, 0F, 0F, 40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 40F, 0F, 0F, 40F, 0F, 0F, 0F, 0F, 0F); // Box 19
		turretModel[34].setRotationPoint(-48F, -32F, 29F);

		turretModel[35].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 40F, 0F, 0F, 40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 40F, 0F, 0F, 40F, 0F, 0F, 0F, 0F, 0F); // Box 20
		turretModel[35].setRotationPoint(-48F, -27F, 29F);


		barrelModel = new ModelRendererTurbo[10];
		barrelModel[0] = new ModelRendererTurbo(this, 200, 700, textureX, textureY); // Import Barrel1
		barrelModel[1] = new ModelRendererTurbo(this, 250, 9, textureX, textureY); // Import Barrel2
		barrelModel[2] = new ModelRendererTurbo(this, 200, 730, textureX, textureY); // Import Barrel3
		barrelModel[3] = new ModelRendererTurbo(this, 270, 750, textureX, textureY); // Import Barrel4
		barrelModel[4] = new ModelRendererTurbo(this, 320, 750, textureX, textureY); // Import Barrel5
		barrelModel[5] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Import BarrelTwo1
		barrelModel[6] = new ModelRendererTurbo(this, 400, 30, textureX, textureY); // Import BarrelTwo2
		barrelModel[7] = new ModelRendererTurbo(this, 400, 45, textureX, textureY); // Import BarrelTwo3
		barrelModel[8] = new ModelRendererTurbo(this, 400, 60, textureX, textureY); // Import BarrelTwo4
		barrelModel[9] = new ModelRendererTurbo(this, 400, 70, textureX, textureY); // Import BarrelTwo5

		barrelModel[0].addShapeBox(-3F, -6F, -7F, 22, 4, 14, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Barrel1
		barrelModel[0].setRotationPoint(30F, -24F, 0F);

		barrelModel[1].addShapeBox(0F, -2F, -7F, 19, 7, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Barrel2
		barrelModel[1].setRotationPoint(30F, -24F, 0F);

		barrelModel[2].addShapeBox(6F, -4F, -2.5F, 74, 5, 5, 0F,0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F); // Import Barrel3
		barrelModel[2].setRotationPoint(30F, -22F, 0F);

		barrelModel[3].addShapeBox(40F, -6F, -3F, 11, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Import Barrel4
		barrelModel[3].setRotationPoint(30F, -22F, 0F);

		barrelModel[4].addBox(80F, -3F, -1.5F, 5, 3, 3, 0F); // Import Barrel5
		barrelModel[4].setRotationPoint(30F, -22F, 0F);

		barrelModel[5].addBox(-2F, 0F, -4F, 4, 1, 8, 0F); // Import BarrelTwo1
		barrelModel[5].setRotationPoint(13F, -37F, -12F);

		barrelModel[6].addBox(-2F, -4F, -2F, 13, 3, 4, 0F); // Import BarrelTwo2
		barrelModel[6].setRotationPoint(11F, -36F, -12F);

		barrelModel[7].addBox(11F, -3.5F, -1.5F, 7, 2, 3, 0F); // Import BarrelTwo3
		barrelModel[7].setRotationPoint(11F, -36F, -12F);

		barrelModel[8].addBox(18F, -3F, -1F, 11, 1, 1, 0F); // Import BarrelTwo4
		barrelModel[8].setRotationPoint(11F, -36F, -11.5F);

		barrelModel[9].addBox(-2F, -4F, -2F, 5, 6, 7, 0F); // Import BarrelTwo5
		barrelModel[9].setRotationPoint(18F, -35F, -8F);


		leftTrackModel = new ModelRendererTurbo[30];
		leftTrackModel[0] = new ModelRendererTurbo(this, 400, 150, textureX, textureY); // Import LeftTrack1
		leftTrackModel[1] = new ModelRendererTurbo(this, 400, 180, textureX, textureY); // Import LeftTrack2
		leftTrackModel[2] = new ModelRendererTurbo(this, 350, 220, textureX, textureY); // Import LeftTrack3
		leftTrackModel[3] = new ModelRendererTurbo(this, 400, 150, textureX, textureY); // Import LeftTrack4
		leftTrackModel[4] = new ModelRendererTurbo(this, 400, 250, textureX, textureY); // Import LeftTrack5
		leftTrackModel[5] = new ModelRendererTurbo(this, 400, 290, textureX, textureY); // Import LeftTrack6
		leftTrackModel[6] = new ModelRendererTurbo(this, 400, 310, textureX, textureY); // Import LeftTrack7
		leftTrackModel[7] = new ModelRendererTurbo(this, 400, 330, textureX, textureY); // Import LeftTrack8
		leftTrackModel[8] = new ModelRendererTurbo(this, 400, 360, textureX, textureY); // Import LeftTrack9
		leftTrackModel[9] = new ModelRendererTurbo(this, 400, 380, textureX, textureY); // Import LeftTrack10
		leftTrackModel[10] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Import LeftTrack11
		leftTrackModel[11] = new ModelRendererTurbo(this, 400, 360, textureX, textureY); // Import LeftTrack12
		leftTrackModel[12] = new ModelRendererTurbo(this, 400, 360, textureX, textureY); // Import LeftTrack13
		leftTrackModel[13] = new ModelRendererTurbo(this, 400, 360, textureX, textureY); // Import LeftTrack14
		leftTrackModel[14] = new ModelRendererTurbo(this, 400, 360, textureX, textureY); // Import LeftTrack15
		leftTrackModel[15] = new ModelRendererTurbo(this, 400, 360, textureX, textureY); // Import LeftTrack16
		leftTrackModel[16] = new ModelRendererTurbo(this, 400, 360, textureX, textureY); // Import LeftTrack17
		leftTrackModel[17] = new ModelRendererTurbo(this, 400, 380, textureX, textureY); // Import LeftTrack18
		leftTrackModel[18] = new ModelRendererTurbo(this, 400, 380, textureX, textureY); // Import LeftTrack19
		leftTrackModel[19] = new ModelRendererTurbo(this, 400, 380, textureX, textureY); // Import LeftTrack20
		leftTrackModel[20] = new ModelRendererTurbo(this, 400, 380, textureX, textureY); // Import LeftTrack21
		leftTrackModel[21] = new ModelRendererTurbo(this, 400, 380, textureX, textureY); // Import LeftTrack22
		leftTrackModel[22] = new ModelRendererTurbo(this, 400, 380, textureX, textureY); // Import LeftTrack23
		leftTrackModel[23] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Import LeftTrack24
		leftTrackModel[24] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Import LeftTrack25
		leftTrackModel[25] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Import LeftTrack26
		leftTrackModel[26] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Import LeftTrack27
		leftTrackModel[27] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Import LeftTrack28
		leftTrackModel[28] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Import LeftTrack29
		leftTrackModel[29] = new ModelRendererTurbo(this, 400, 420, textureX, textureY); // Import LeftTrack30

		leftTrackModel[0].addBox(0F, 0F, 0F, 2, 11, 13, 0F); // Import LeftTrack1
		leftTrackModel[0].setRotationPoint(68F, -7F, 21.5F);

		leftTrackModel[1].addBox(-2F, 0F, 0F, 2, 24, 13, 0F); // Import LeftTrack2
		leftTrackModel[1].setRotationPoint(70F, 4F, 21.4F);
		leftTrackModel[1].rotateAngleZ = -0.9424778F;

		leftTrackModel[2].addBox(-96F, 0F, 0F, 96, 2, 13, 0F); // Import LeftTrack3
		leftTrackModel[2].setRotationPoint(51F, 16F, 21.5F);

		leftTrackModel[3].addBox(0F, 0F, 0F, 2, 11, 13, 0F); // Import LeftTrack4
		leftTrackModel[3].setRotationPoint(-63F, -7F, 21.5F);

		leftTrackModel[4].addBox(0F, 0F, 0F, 2, 23, 13, 0F); // Import LeftTrack5
		leftTrackModel[4].setRotationPoint(-63F, 4F, 21.4F);
		leftTrackModel[4].rotateAngleZ = 0.9250245F;

		leftTrackModel[5].addShapeBox(0F, 0F, 0F, 15, 5, 9, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftTrack6
		leftTrackModel[5].setRotationPoint(-60F, -9F, 23.5F);

		leftTrackModel[6].addBox(0F, 0F, 0F, 15, 5, 9, 0F); // Import LeftTrack7
		leftTrackModel[6].setRotationPoint(-60F, -4F, 23.5F);

		leftTrackModel[7].addShapeBox(0F, 0F, 0F, 15, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Import LeftTrack8
		leftTrackModel[7].setRotationPoint(-60F, 1F, 23.5F);

		leftTrackModel[8].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftTrack9
		leftTrackModel[8].setRotationPoint(-43F, 4F, 23.5F);

		leftTrackModel[9].addBox(0F, 0F, 0F, 12, 4, 9, 0F); // Import LeftTrack10
		leftTrackModel[9].setRotationPoint(-43F, 8F, 23.5F);

		leftTrackModel[10].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import LeftTrack11
		leftTrackModel[10].setRotationPoint(-43F, 12F, 23.5F);

		leftTrackModel[11].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftTrack12
		leftTrackModel[11].setRotationPoint(-26F, 4F, 23.5F);

		leftTrackModel[12].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftTrack13
		leftTrackModel[12].setRotationPoint(-9F, 4F, 23.5F);

		leftTrackModel[13].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftTrack14
		leftTrackModel[13].setRotationPoint(8F, 4F, 23.5F);

		leftTrackModel[14].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftTrack15
		leftTrackModel[14].setRotationPoint(25F, 4F, 23.5F);

		leftTrackModel[15].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftTrack16
		leftTrackModel[15].setRotationPoint(42F, 4F, 23.5F);

		leftTrackModel[16].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftTrack17
		leftTrackModel[16].setRotationPoint(56F, -6F, 23.5F);

		leftTrackModel[17].addBox(0F, 0F, 0F, 12, 4, 9, 0F); // Import LeftTrack18
		leftTrackModel[17].setRotationPoint(-26F, 8F, 23.5F);

		leftTrackModel[18].addBox(0F, 0F, 0F, 12, 4, 9, 0F); // Import LeftTrack19
		leftTrackModel[18].setRotationPoint(-9F, 8F, 23.5F);

		leftTrackModel[19].addBox(0F, 0F, 0F, 12, 4, 9, 0F); // Import LeftTrack20
		leftTrackModel[19].setRotationPoint(8F, 8F, 23.5F);

		leftTrackModel[20].addBox(0F, 0F, 0F, 12, 4, 9, 0F); // Import LeftTrack21
		leftTrackModel[20].setRotationPoint(25F, 8F, 23.5F);

		leftTrackModel[21].addBox(0F, 0F, 0F, 12, 4, 9, 0F); // Import LeftTrack22
		leftTrackModel[21].setRotationPoint(42F, 8F, 23.5F);

		leftTrackModel[22].addBox(0F, 0F, 0F, 12, 4, 9, 0F); // Import LeftTrack23
		leftTrackModel[22].setRotationPoint(56F, -2F, 23.5F);

		leftTrackModel[23].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import LeftTrack24
		leftTrackModel[23].setRotationPoint(-26F, 12F, 23.5F);

		leftTrackModel[24].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import LeftTrack25
		leftTrackModel[24].setRotationPoint(-9F, 12F, 23.5F);

		leftTrackModel[25].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import LeftTrack26
		leftTrackModel[25].setRotationPoint(8F, 12F, 23.5F);

		leftTrackModel[26].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import LeftTrack27
		leftTrackModel[26].setRotationPoint(25F, 12F, 23.5F);

		leftTrackModel[27].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import LeftTrack28
		leftTrackModel[27].setRotationPoint(42F, 12F, 23.5F);

		leftTrackModel[28].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import LeftTrack29
		leftTrackModel[28].setRotationPoint(56F, 2F, 23.5F);

		leftTrackModel[29].addShapeBox(0F, 0F, 0F, 116, 17, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F); // Import LeftTrack30
		leftTrackModel[29].setRotationPoint(-53F, -7F, 25.5F);


		rightTrackModel = new ModelRendererTurbo[30];
		rightTrackModel[0] = new ModelRendererTurbo(this, 400, 150, textureX, textureY); // Import RightTrack1
		rightTrackModel[1] = new ModelRendererTurbo(this, 400, 180, textureX, textureY); // Import RightTrack2
		rightTrackModel[2] = new ModelRendererTurbo(this, 350, 220, textureX, textureY); // Import RightTrack3
		rightTrackModel[3] = new ModelRendererTurbo(this, 400, 150, textureX, textureY); // Import RightTrack4
		rightTrackModel[4] = new ModelRendererTurbo(this, 400, 250, textureX, textureY); // Import RightTrack5
		rightTrackModel[5] = new ModelRendererTurbo(this, 400, 290, textureX, textureY); // Import RightTrack6
		rightTrackModel[6] = new ModelRendererTurbo(this, 400, 310, textureX, textureY); // Import RightTrack7
		rightTrackModel[7] = new ModelRendererTurbo(this, 400, 330, textureX, textureY); // Import RightTrack8
		rightTrackModel[8] = new ModelRendererTurbo(this, 400, 360, textureX, textureY); // Import RightTrack9
		rightTrackModel[9] = new ModelRendererTurbo(this, 400, 380, textureX, textureY); // Import RightTrack10
		rightTrackModel[10] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Import RightTrack11
		rightTrackModel[11] = new ModelRendererTurbo(this, 400, 360, textureX, textureY); // Import RightTrack12
		rightTrackModel[12] = new ModelRendererTurbo(this, 400, 360, textureX, textureY); // Import RightTrack13
		rightTrackModel[13] = new ModelRendererTurbo(this, 400, 360, textureX, textureY); // Import RightTrack14
		rightTrackModel[14] = new ModelRendererTurbo(this, 400, 360, textureX, textureY); // Import RightTrack15
		rightTrackModel[15] = new ModelRendererTurbo(this, 400, 360, textureX, textureY); // Import RightTrack16
		rightTrackModel[16] = new ModelRendererTurbo(this, 400, 360, textureX, textureY); // Import RightTrack17
		rightTrackModel[17] = new ModelRendererTurbo(this, 400, 380, textureX, textureY); // Import RightTrack18
		rightTrackModel[18] = new ModelRendererTurbo(this, 400, 380, textureX, textureY); // Import RightTrack19
		rightTrackModel[19] = new ModelRendererTurbo(this, 400, 380, textureX, textureY); // Import RightTrack20
		rightTrackModel[20] = new ModelRendererTurbo(this, 400, 380, textureX, textureY); // Import RightTrack21
		rightTrackModel[21] = new ModelRendererTurbo(this, 400, 380, textureX, textureY); // Import RightTrack22
		rightTrackModel[22] = new ModelRendererTurbo(this, 400, 380, textureX, textureY); // Import RightTrack23
		rightTrackModel[23] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Import RightTrack24
		rightTrackModel[24] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Import RightTrack25
		rightTrackModel[25] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Import RightTrack26
		rightTrackModel[26] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Import RightTrack27
		rightTrackModel[27] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Import RightTrack28
		rightTrackModel[28] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Import RightTrack29
		rightTrackModel[29] = new ModelRendererTurbo(this, 400, 420, textureX, textureY); // Import RightTrack30

		rightTrackModel[0].addBox(0F, 0F, 0F, 2, 11, 13, 0F); // Import RightTrack1
		rightTrackModel[0].setRotationPoint(68F, -7F, -34.5F);

		rightTrackModel[1].addBox(-2F, 0F, 0F, 2, 24, 13, 0F); // Import RightTrack2
		rightTrackModel[1].setRotationPoint(70F, 4F, -34.4F);
		rightTrackModel[1].rotateAngleZ = -0.9424778F;

		rightTrackModel[2].addBox(-96F, 0F, 0F, 96, 2, 13, 0F); // Import RightTrack3
		rightTrackModel[2].setRotationPoint(51F, 16F, -34.5F);

		rightTrackModel[3].addBox(0F, 0F, 0F, 2, 11, 13, 0F); // Import RightTrack4
		rightTrackModel[3].setRotationPoint(-63F, -7F, -34.5F);

		rightTrackModel[4].addBox(0F, 0F, 0F, 2, 23, 13, 0F); // Import RightTrack5
		rightTrackModel[4].setRotationPoint(-63F, 4F, -34.5F);
		rightTrackModel[4].rotateAngleZ = 0.9250245F;

		rightTrackModel[5].addShapeBox(0F, 0F, 0F, 15, 5, 9, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightTrack6
		rightTrackModel[5].setRotationPoint(-60F, -9F, -32.5F);

		rightTrackModel[6].addBox(0F, 0F, 0F, 15, 5, 9, 0F); // Import RightTrack7
		rightTrackModel[6].setRotationPoint(-60F, -4F, -32.5F);

		rightTrackModel[7].addShapeBox(0F, 0F, 0F, 15, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Import RightTrack8
		rightTrackModel[7].setRotationPoint(-60F, 1F, -32.5F);

		rightTrackModel[8].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightTrack9
		rightTrackModel[8].setRotationPoint(-43F, 4F, -32.5F);

		rightTrackModel[9].addBox(0F, 0F, 0F, 12, 4, 9, 0F); // Import RightTrack10
		rightTrackModel[9].setRotationPoint(-43F, 8F, -32.5F);

		rightTrackModel[10].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import RightTrack11
		rightTrackModel[10].setRotationPoint(-43F, 12F, -32.5F);

		rightTrackModel[11].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightTrack12
		rightTrackModel[11].setRotationPoint(-26F, 4F, -32.5F);

		rightTrackModel[12].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightTrack13
		rightTrackModel[12].setRotationPoint(-9F, 4F, -32.5F);

		rightTrackModel[13].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightTrack14
		rightTrackModel[13].setRotationPoint(8F, 4F, -32.5F);

		rightTrackModel[14].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightTrack15
		rightTrackModel[14].setRotationPoint(25F, 4F, -32.5F);

		rightTrackModel[15].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightTrack16
		rightTrackModel[15].setRotationPoint(41F, 4F, -32.5F);

		rightTrackModel[16].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightTrack17
		rightTrackModel[16].setRotationPoint(56F, -6F, -32.5F);

		rightTrackModel[17].addBox(0F, 0F, 0F, 12, 4, 9, 0F); // Import RightTrack18
		rightTrackModel[17].setRotationPoint(-26F, 8F, -32.5F);

		rightTrackModel[18].addBox(0F, 0F, 0F, 12, 4, 9, 0F); // Import RightTrack19
		rightTrackModel[18].setRotationPoint(-9F, 8F, -32.5F);

		rightTrackModel[19].addBox(0F, 0F, 0F, 12, 4, 9, 0F); // Import RightTrack20
		rightTrackModel[19].setRotationPoint(8F, 8F, -32.5F);

		rightTrackModel[20].addBox(0F, 0F, 0F, 12, 4, 9, 0F); // Import RightTrack21
		rightTrackModel[20].setRotationPoint(25F, 8F, -32.5F);

		rightTrackModel[21].addBox(0F, 0F, 0F, 12, 4, 9, 0F); // Import RightTrack22
		rightTrackModel[21].setRotationPoint(41F, 8F, -32.5F);

		rightTrackModel[22].addBox(0F, 0F, 0F, 12, 4, 9, 0F); // Import RightTrack23
		rightTrackModel[22].setRotationPoint(56F, -2F, -32.5F);

		rightTrackModel[23].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import RightTrack24
		rightTrackModel[23].setRotationPoint(-26F, 12F, -32.5F);

		rightTrackModel[24].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import RightTrack25
		rightTrackModel[24].setRotationPoint(-9F, 12F, -32.5F);

		rightTrackModel[25].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import RightTrack26
		rightTrackModel[25].setRotationPoint(8F, 12F, -32.5F);

		rightTrackModel[26].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import RightTrack27
		rightTrackModel[26].setRotationPoint(25F, 12F, -32.5F);

		rightTrackModel[27].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import RightTrack28
		rightTrackModel[27].setRotationPoint(41F, 12F, -32.5F);

		rightTrackModel[28].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import RightTrack29
		rightTrackModel[28].setRotationPoint(56F, 2F, -32.5F);

		rightTrackModel[29].addShapeBox(0F, 0F, 0F, 116, 17, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F); // Import RightTrack30
		rightTrackModel[29].setRotationPoint(-53F, -7F, -30.5F);



		translateAll(15F, -4F, 0F);


		flipAll();
	}
}