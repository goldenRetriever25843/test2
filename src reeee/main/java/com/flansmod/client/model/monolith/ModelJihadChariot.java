//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.2.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelJihadChariot extends ModelVehicle
{
	int textureX = 512;
	int textureY = 512;

	public ModelJihadChariot()
	{
		bodyModel = new ModelRendererTurbo[36];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Hood
		bodyModel[1] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 35
		bodyModel[23] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 36
		bodyModel[24] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 37
		bodyModel[25] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 38
		bodyModel[26] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 39
		bodyModel[27] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 40
		bodyModel[28] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 41
		bodyModel[29] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 42
		bodyModel[30] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 43
		bodyModel[31] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 44
		bodyModel[32] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 45
		bodyModel[33] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 46
		bodyModel[34] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 65
		bodyModel[35] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 66

		bodyModel[0].addShapeBox(0F, 0F, 0F, 28, 9, 36, 0F,0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Hood
		bodyModel[0].setRotationPoint(68F, -18F, -18F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 6, 10, 36, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(92F, -9F, -18F);

		bodyModel[2].addBox(0F, 0F, 0F, 36, 14, 2, 0F); // Box 2
		bodyModel[2].setRotationPoint(32F, -18F, 16F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(68F, -9F, 16F);

		bodyModel[4].addBox(0F, 0F, 0F, 2, 14, 32, 0F); // Box 4
		bodyModel[4].setRotationPoint(32F, -18F, -16F);

		bodyModel[5].addBox(0F, 0F, 0F, 36, 14, 2, 0F); // Box 5
		bodyModel[5].setRotationPoint(32F, -18F, -18F);

		bodyModel[6].addBox(0F, 0F, 0F, 51, 8, 2, 0F); // Box 6
		bodyModel[6].setRotationPoint(-19F, -16F, 16F);

		bodyModel[7].addBox(0F, 0F, 0F, 51, 8, 2, 0F); // Box 7
		bodyModel[7].setRotationPoint(-19F, -16F, -18F);

		bodyModel[8].addBox(0F, 0F, 0F, 9, 14, 2, 0F); // Box 9
		bodyModel[8].setRotationPoint(32F, -32F, -16F);
		bodyModel[8].rotateAngleX = -0.12217305F;

		bodyModel[9].addBox(0F, 0F, 0F, 14, 2, 2, 0F); // Box 10
		bodyModel[9].setRotationPoint(41F, -32F, -16F);
		bodyModel[9].rotateAngleX = -0.12217305F;

		bodyModel[10].addBox(0F, 0F, 0F, 9, 14, 2, 0F); // Box 11
		bodyModel[10].setRotationPoint(32F, -32F, 14F);
		bodyModel[10].rotateAngleX = 0.12217305F;

		bodyModel[11].addBox(0F, 0F, 0F, 14, 2, 2, 0F); // Box 12
		bodyModel[11].setRotationPoint(41F, -32F, 14F);
		bodyModel[11].rotateAngleX = 0.12217305F;

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 15, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, -14F, 0F, 0F); // Box 13
		bodyModel[12].setRotationPoint(53F, -32F, -16F);
		bodyModel[12].rotateAngleX = -0.12217305F;

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 15, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, -14F, 0F, 0F); // Box 14
		bodyModel[13].setRotationPoint(53F, -32F, 14F);
		bodyModel[13].rotateAngleX = 0.12217305F;

		bodyModel[14].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[14].setRotationPoint(68F, -9F, -18F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 18, 4, 2, 0F,0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[15].setRotationPoint(-19F, -8F, -18F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 15, 4, 2, 0F,3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[16].setRotationPoint(17F, -8F, -18F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 18, 4, 2, 0F,0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[17].setRotationPoint(-19F, -8F, 16F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 15, 4, 2, 0F,3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[18].setRotationPoint(17F, -8F, 16F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 54, 6, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -6F, -1F, 0F, -6F, -1F, 0F, -6F, -1F, 0F, -6F); // Box 20
		bodyModel[19].setRotationPoint(17F, -4F, -18F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 23, 1, 32, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[20].setRotationPoint(32F, -32.5F, -16F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 23, 10, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[21].setRotationPoint(71F, -13F, -9F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 18, 6, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 35
		bodyModel[22].setRotationPoint(-19F, -4F, -18F);

		bodyModel[23].addBox(-7.5F, -7.5F, -3F, 15, 1, 6, 0F); // Box 36
		bodyModel[23].setRotationPoint(8.5F, -1.5F, 13.5F);

		bodyModel[24].addBox(-7.5F, -7.5F, -3F, 15, 1, 6, 0F); // Box 37
		bodyModel[24].setRotationPoint(8.5F, -1.5F, -13.5F);

		bodyModel[25].addBox(0F, 0F, 0F, 7, 1, 6, 0F); // Box 38
		bodyModel[25].setRotationPoint(16F, -9F, -16.5F);
		bodyModel[25].rotateAngleZ = -0.9250245F;

		bodyModel[26].addBox(0F, 0F, 0F, 7, 1, 6, 0F); // Box 39
		bodyModel[26].setRotationPoint(16F, -9F, 10.5F);
		bodyModel[26].rotateAngleZ = -0.9250245F;

		bodyModel[27].addBox(0F, -1F, 0F, 7, 1, 6, 0F); // Box 40
		bodyModel[27].setRotationPoint(1F, -9F, 10.5F);
		bodyModel[27].rotateAngleZ = -2.32128791F;

		bodyModel[28].addBox(0F, -1F, 0F, 7, 1, 6, 0F); // Box 41
		bodyModel[28].setRotationPoint(1F, -9F, -16.5F);
		bodyModel[28].rotateAngleZ = -2.32128791F;

		bodyModel[29].addShapeBox(-7.5F, -7.5F, -3F, 15, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F); // Box 42
		bodyModel[29].setRotationPoint(8.5F, -1.5F, 12.5F);

		bodyModel[30].addShapeBox(-7.5F, -7.5F, -3F, 15, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F); // Box 43
		bodyModel[30].setRotationPoint(8.5F, -1.5F, -7.5F);

		bodyModel[31].addBox(0F, 0F, 0F, 20, 6, 24, 0F); // Box 44
		bodyModel[31].setRotationPoint(-2F, -4F, -12F);

		bodyModel[32].addBox(0F, 0F, 0F, 14, 4, 14, 0F); // Box 45
		bodyModel[32].setRotationPoint(-7F, -8F, -7F);

		bodyModel[33].addBox(0F, 0F, 0F, 8, 10, 8, 0F); // Box 46
		bodyModel[33].setRotationPoint(-4F, -18F, -4F);

		bodyModel[34].addBox(0F, 0F, 0F, 6, 7, 32, 0F); // Box 65
		bodyModel[34].setRotationPoint(63F, -17F, -16F);
		bodyModel[34].rotateAngleZ = -0.26179939F;

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 10, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[35].setRotationPoint(70F, -13F, -16F);


		turretModel = new ModelRendererTurbo[12];
		turretModel[0] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 47
		turretModel[1] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 48
		turretModel[2] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 49
		turretModel[3] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 50
		turretModel[4] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 51
		turretModel[5] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 52
		turretModel[6] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 53
		turretModel[7] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 54
		turretModel[8] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 61
		turretModel[9] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 62
		turretModel[10] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 63
		turretModel[11] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 64

		turretModel[0].addBox(0F, 0F, 0F, 16, 2, 16, 0F); // Box 47
		turretModel[0].setRotationPoint(-8F, -20F, -8F);

		turretModel[1].addBox(-2F, -2F, 14F, 12, 2, 8, 0F); // Box 48
		turretModel[1].setRotationPoint(-8F, -20F, -6F);

		turretModel[2].addBox(-2F, -14F, 14F, 2, 12, 8, 0F); // Box 49
		turretModel[2].setRotationPoint(-8F, -20F, -6F);

		turretModel[3].addBox(0F, 0F, 0F, 12, 5, 2, 0F); // Box 50
		turretModel[3].setRotationPoint(-6F, -25F, -8F);

		turretModel[4].addBox(0F, 0F, 0F, 12, 5, 2, 0F); // Box 51
		turretModel[4].setRotationPoint(-6F, -25F, 6F);

		turretModel[5].addBox(0F, 0F, 0F, 6, 10, 2, 0F); // Box 52
		turretModel[5].setRotationPoint(-3F, -30F, 4F);

		turretModel[6].addBox(0F, 0F, 0F, 6, 10, 2, 0F); // Box 53
		turretModel[6].setRotationPoint(-3F, -30F, -6F);

		turretModel[7].addBox(0F, 0F, 0F, 2, 2, 14, 0F); // Box 54
		turretModel[7].setRotationPoint(-1F, -29F, -7F);

		turretModel[8].addBox(0F, 0F, 0F, 12, 7, 10, 0F); // Box 61
		turretModel[8].setRotationPoint(44F, -10F, 3F);

		turretModel[9].addBox(0F, -12F, 0F, 2, 16, 10, 0F); // Box 62
		turretModel[9].setRotationPoint(43F, -14F, 3F);
		turretModel[9].rotateAngleZ = 0.10471976F;

		turretModel[10].addBox(0F, 0F, 0F, 12, 7, 10, 0F); // Box 63
		turretModel[10].setRotationPoint(44F, -10F, -13F);

		turretModel[11].addBox(0F, -12F, 0F, 2, 16, 10, 0F); // Box 64
		turretModel[11].setRotationPoint(43F, -14F, -13F);
		turretModel[11].rotateAngleZ = 0.10471976F;


		barrelModel = new ModelRendererTurbo[6];
		barrelModel[0] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 55
		barrelModel[1] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 56
		barrelModel[2] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 57
		barrelModel[3] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 58
		barrelModel[4] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 59
		barrelModel[5] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Box 60

		barrelModel[0].addBox(-2F, -4F, -1.5F, 8, 5, 3, 0F); // Box 55
		barrelModel[0].setRotationPoint(0F, -28.5F, 0F);

		barrelModel[1].addBox(6F, -2F, -1F, 12, 3, 2, 0F); // Box 56
		barrelModel[1].setRotationPoint(0F, -28.5F, 0F);

		barrelModel[2].addBox(12F, -2F, -1F, 16, 1, 1, 0F); // Box 57
		barrelModel[2].setRotationPoint(0F, -28.5F, 0F);

		barrelModel[3].addBox(12F, -0.5F, -1F, 13, 1, 1, 0F); // Box 58
		barrelModel[3].setRotationPoint(0F, -28.5F, 0F);

		barrelModel[4].addBox(6F, -3.5F, -1F, 13, 1, 1, 0F); // Box 59
		barrelModel[4].setRotationPoint(0F, -28.5F, 0F);

		barrelModel[5].addBox(5F, -1F, -5.5F, 7, 5, 4, 0F); // Box 60
		barrelModel[5].setRotationPoint(0F, -28.5F, 0F);


		leftFrontWheelModel = new ModelRendererTurbo[3];
		leftFrontWheelModel[0] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 23
		leftFrontWheelModel[1] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 24
		leftFrontWheelModel[2] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 25

		leftFrontWheelModel[0].addBox(-7.5F, -2.5F, -3F, 15, 5, 6, 0F); // Box 23
		leftFrontWheelModel[0].setRotationPoint(80.5F, 0.5F, 14.5F);

		leftFrontWheelModel[1].addShapeBox(-7.5F, -7.5F, -3F, 15, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		leftFrontWheelModel[1].setRotationPoint(80.5F, 0.5F, 14.5F);

		leftFrontWheelModel[2].addShapeBox(-7.5F, 2.5F, -3F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 25
		leftFrontWheelModel[2].setRotationPoint(80.5F, 0.5F, 14.5F);


		rightFrontWheelModel = new ModelRendererTurbo[3];
		rightFrontWheelModel[0] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 32
		rightFrontWheelModel[1] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 33
		rightFrontWheelModel[2] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 34

		rightFrontWheelModel[0].addBox(-7.5F, -2.5F, -3F, 15, 5, 6, 0F); // Box 32
		rightFrontWheelModel[0].setRotationPoint(80.5F, 0.5F, -14.5F);

		rightFrontWheelModel[1].addShapeBox(-7.5F, 2.5F, -3F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 33
		rightFrontWheelModel[1].setRotationPoint(80.5F, 0.5F, -14.5F);

		rightFrontWheelModel[2].addShapeBox(-7.5F, -7.5F, -3F, 15, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightFrontWheelModel[2].setRotationPoint(80.5F, 0.5F, -14.5F);


		leftBackWheelModel = new ModelRendererTurbo[3];
		leftBackWheelModel[0] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 26
		leftBackWheelModel[1] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 27
		leftBackWheelModel[2] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 28

		leftBackWheelModel[0].addBox(-7.5F, -2.5F, -3F, 15, 5, 6, 0F); // Box 26
		leftBackWheelModel[0].setRotationPoint(8.5F, 0.5F, 14.5F);

		leftBackWheelModel[1].addShapeBox(-7.5F, 2.5F, -3F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 27
		leftBackWheelModel[1].setRotationPoint(8.5F, 0.5F, 14.5F);

		leftBackWheelModel[2].addShapeBox(-7.5F, -7.5F, -3F, 15, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		leftBackWheelModel[2].setRotationPoint(8.5F, 0.5F, 14.5F);


		rightBackWheelModel = new ModelRendererTurbo[3];
		rightBackWheelModel[0] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 29
		rightBackWheelModel[1] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 30
		rightBackWheelModel[2] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 31

		rightBackWheelModel[0].addBox(-7.5F, -2.5F, -3F, 15, 5, 6, 0F); // Box 29
		rightBackWheelModel[0].setRotationPoint(8.5F, 0.5F, -14.5F);

		rightBackWheelModel[1].addShapeBox(-7.5F, 2.5F, -3F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 30
		rightBackWheelModel[1].setRotationPoint(8.5F, 0.5F, -14.5F);

		rightBackWheelModel[2].addShapeBox(-7.5F, -7.5F, -3F, 15, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		rightBackWheelModel[2].setRotationPoint(8.5F, 0.5F, -14.5F);


		steeringWheelModel = new ModelRendererTurbo[1];
		steeringWheelModel[0] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 67

		steeringWheelModel[0].addBox(-1F, -2.5F, -2.5F, 1, 5, 5, 0F); // Box 67
		steeringWheelModel[0].setRotationPoint(62F, -16F, 7F);
		steeringWheelModel[0].rotateAngleZ = -0.26179939F;



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}