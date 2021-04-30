//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 12.06.2016 - 00:45:08
// Last changed on: 12.06.2016 - 00:45:08

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelBRDM2 extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelBRDM2() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[91];
		turretModel = new ModelRendererTurbo[8];
		barrelModel = new ModelRendererTurbo[9];
		leftFrontWheelModel = new ModelRendererTurbo[6];
		rightFrontWheelModel = new ModelRendererTurbo[6];
		leftBackWheelModel = new ModelRendererTurbo[6];
		rightBackWheelModel = new ModelRendererTurbo[6];

		initbodyModel_1();
		initturretModel_1();
		initbarrelModel_1();
		initleftFrontWheelModel_1();
		initrightFrontWheelModel_1();
		initleftBackWheelModel_1();
		initrightBackWheelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 17
		bodyModel[2] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 18
		bodyModel[3] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 19
		bodyModel[4] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 20
		bodyModel[5] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 22
		bodyModel[6] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 23
		bodyModel[7] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 24
		bodyModel[8] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 25
		bodyModel[9] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 26
		bodyModel[10] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 27
		bodyModel[11] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 31
		bodyModel[12] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 32
		bodyModel[13] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 33
		bodyModel[14] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 34
		bodyModel[15] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 0
		bodyModel[16] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 1
		bodyModel[17] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 3
		bodyModel[18] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 4
		bodyModel[19] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 6
		bodyModel[20] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 7
		bodyModel[21] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 8
		bodyModel[22] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 9
		bodyModel[23] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 10
		bodyModel[24] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 12
		bodyModel[25] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 13
		bodyModel[26] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 14
		bodyModel[27] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 16
		bodyModel[28] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 17
		bodyModel[29] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 46
		bodyModel[30] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[31] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 1
		bodyModel[32] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 2
		bodyModel[33] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 3
		bodyModel[34] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 4
		bodyModel[35] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 5
		bodyModel[36] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 6
		bodyModel[37] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 7
		bodyModel[38] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 8
		bodyModel[39] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 9
		bodyModel[40] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 10
		bodyModel[41] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 11
		bodyModel[42] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 12
		bodyModel[43] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 13
		bodyModel[44] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 14
		bodyModel[45] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 15
		bodyModel[46] = new ModelRendererTurbo(this, 337, 129, textureX, textureY); // Box 16
		bodyModel[47] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 17
		bodyModel[48] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Box 18
		bodyModel[49] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 19
		bodyModel[50] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 20
		bodyModel[51] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 21
		bodyModel[52] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 22
		bodyModel[53] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 23
		bodyModel[54] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 24
		bodyModel[55] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 25
		bodyModel[56] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 27
		bodyModel[57] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 28
		bodyModel[58] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 29
		bodyModel[59] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 30
		bodyModel[60] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 31
		bodyModel[61] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 0
		bodyModel[62] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 1
		bodyModel[63] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 2
		bodyModel[64] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 3
		bodyModel[65] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 4
		bodyModel[66] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 5
		bodyModel[67] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 6
		bodyModel[68] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 7
		bodyModel[69] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 0
		bodyModel[70] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 1
		bodyModel[71] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 2
		bodyModel[72] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 3
		bodyModel[73] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 4
		bodyModel[74] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 5
		bodyModel[75] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 6
		bodyModel[76] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 7
		bodyModel[77] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 80
		bodyModel[78] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 81
		bodyModel[79] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 82
		bodyModel[80] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 83
		bodyModel[81] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 84
		bodyModel[82] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 85
		bodyModel[83] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 86
		bodyModel[84] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 87
		bodyModel[85] = new ModelRendererTurbo(this, 97, 169, textureX, textureY); // Box 53
		bodyModel[86] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 55
		bodyModel[87] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 56
		bodyModel[88] = new ModelRendererTurbo(this, 153, 169, textureX, textureY); // Box 57
		bodyModel[89] = new ModelRendererTurbo(this, 209, 169, textureX, textureY); // Box 58
		bodyModel[90] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 75

		bodyModel[0].addBox(0F, 0F, 0F, 61, 4, 37, 0F); // Box 0
		bodyModel[0].setRotationPoint(-45F, -13.5F, -18F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 25, 12, 37, 0F,5F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[1].setRotationPoint(-14.5F, -9.5F, -18F);

		bodyModel[2].addBox(0F, 0F, 0F, 10, 3, 37, 0F); // Box 18
		bodyModel[2].setRotationPoint(16F, -13.5F, -18F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 37, 0F,0F, 0F, 0F, 2.8F, 0F, 0F, 2.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[3].setRotationPoint(16F, -10.5F, -18F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 5, 37, 0F,0.1F, 0F, 0F, 2.5F, 0F, 0F, 2.4F, 0F, 0F, 0.1F, 0F, 0F, 1.3F, 0F, 0F, -3.3F, 0F, 0F, -3.3F, 0F, 0F, 1.3F, 0F, 0F); // Box 20
		bodyModel[4].setRotationPoint(13.6F, -9.5F, -18F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 15, 3, 37, 0F,0F, 0F, 0F, 0.5F, -2.2F, 0F, 0.5F, -2.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 5.5F, 0F, -6F, 5.5F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[5].setRotationPoint(26F, -13.5F, -18F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 10, 7, 37, 0F,0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[6].setRotationPoint(-45F, -9.5F, -18F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 7, 5, 37, 0F,0F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, -7.7F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -7.7F, 0F, 0F); // Box 24
		bodyModel[7].setRotationPoint(-25F, -9.5F, -18F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 7, 5, 37, 0F,-1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, 0F, 0.7F, 0F, 0F, -7.7F, 0F, 0F, -7.7F, 0F, 0F, 0.7F, 0F, 0F); // Box 25
		bodyModel[8].setRotationPoint(-35F, -9.5F, -18F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 12, 37, 0F,0F, -0.2F, 0F, -0.75F, -0.6F, 0F, -0.75F, -0.6F, 0F, 0F, -0.2F, 0F, 6.5F, -5.5F, 0F, -5.9F, 0.6F, -2F, -5.9F, 0.6F, -2F, 6.5F, -5.5F, 0F); // Box 26
		bodyModel[9].setRotationPoint(41.5F, -11.5F, -18F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 12, 37, 0F,-4.75F, -0.6F, 0F, 10F, 0.2F, -8F, 10F, 0.2F, -8F, -4.75F, -0.6F, 0F, 0.4F, 0.65F, -2F, -2F, 0.6F, -7F, -2.3F, 0.6F, -6F, 0.4F, 0.6F, -1.95F); // Box 27
		bodyModel[10].setRotationPoint(38F, -11.5F, -18F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 14, 1, 9, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 1.8F, -8.5F, 0F, 0.2F, 0F, -0.55F, 0F, -0.18F, 1.4F, 0F, 0F, 0F, 1.8F, -8.5F, 0F, -0.6F); // Box 31
		bodyModel[11].setRotationPoint(29F, -13.5F, -18F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 7, 1, 11, 0F,0F, -2F, 0F, 0F, -1.5F, -8F, 0F, 0F, 1.8F, 0F, 0F, -0.2F, 0.25F, 1.6F, 0F, 0F, 0.8F, -8F, 0F, 0.8F, 1.8F, 0F, 0F, -0.2F); // Box 32
		bodyModel[12].setRotationPoint(43F, -13.5F, -18F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 7, 1, 11, 0F,0F, 0F, -0.2F, 0F, 0F, 1.8F, 0F, -1.5F, -8F, 0F, -2F, 0F, 0F, 0F, -0.2F, 0F, 0.8F, 1.8F, 0F, 0.8F, -8F, 0.25F, 1.6F, 0F); // Box 33
		bodyModel[13].setRotationPoint(43F, -13.5F, 8F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 14, 1, 9, 0F,-8.5F, 0F, 0.2F, 0F, 0F, 1.8F, 0F, -2F, 0F, 0F, 0F, 0F, -8.5F, 0F, 0.2F, 0F, 0F, 1.8F, -0.16F, 1.4F, 0F, 0F, -0.55F, 0F); // Box 34
		bodyModel[14].setRotationPoint(29F, -13.5F, 10F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 12, 2, 11, 0F,0.5F, 0F, 3.6F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0.5F, 0F, 4F, 0.5F, -0.2F, 3.6F, 0F, -0.2F, 0F, 0F, -0.2F, 0.4F, 0.5F, -0.2F, 4F); // Box 0
		bodyModel[15].setRotationPoint(38F, -13.5F, -5.2F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 15, 1, 9, 0F,-14.5F, 0F, 0F, 0.3F, 0F, 0F, -8.2F, 0F, 0.2F, 5F, 0F, 0.2F, -14.5F, -0.2F, 0F, 0.3F, -0.2F, 0F, -8.2F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 1
		bodyModel[16].setRotationPoint(22.2F, -13.5F, 9.8F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 15, 1, 9, 0F,5F, 0F, 0.2F, -8.2F, 0F, 0.2F, 0.3F, 0F, 0F, -14.5F, 0F, 0F, 0F, -0.2F, 0.2F, -8.2F, -0.2F, 0.2F, 0.3F, -0.2F, 0F, -14.5F, -0.2F, 0F); // Box 3
		bodyModel[17].setRotationPoint(22.2F, -13.5F, -17.8F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 9, 8, 19, 0F,0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, -3F, 0F, 7.5F, 10F, 0F, 0F, 10F, 0F, 0F, -3F, 0F, 7.5F); // Box 4
		bodyModel[18].setRotationPoint(19.6F, -20.7F, -9F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 28, 8, 24, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 6
		bodyModel[19].setRotationPoint(-12.4F, -20.7F, -11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 4, 8, 24, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 6F, 3F, 0F, 5.5F, 3F, 0F, 4.5F, 0F, 0F, 5F); // Box 7
		bodyModel[20].setRotationPoint(15.6F, -20.7F, -11F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 28, 1, 13, 0F,0F, 0F, 5.3F, 0F, 0F, 5.3F, 0F, 0F, 4.9F, 0F, 0F, 4.9F, 0F, 0F, 6F, -1F, 0F, 6F, -1F, 0F, 5.5F, 0F, 0F, 5.5F); // Box 8
		bodyModel[21].setRotationPoint(-12.4F, -21.7F, -5.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 5, 8, 24, 0F,0.1F, 0F, -0.1F, 0F, 1F, -0.2F, 0F, 1F, -0.6F, 0.1F, 0F, -1F, 1.95F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 5F, 1.95F, 0F, 5.1F); // Box 9
		bodyModel[22].setRotationPoint(-17.4F, -20.7F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 24, 6, 24, 0F,2F, -3F, -1.2F, 1.5F, 1.2F, -0.1F, 1.5F, 1.2F, -1F, 2F, -3F, -3F, 2F, 0F, 0.5F, -0.15F, 0F, 5.4F, -0.15F, 0F, 4.5F, 2F, 0F, -1F); // Box 10
		bodyModel[23].setRotationPoint(-43F, -19.5F, -11F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 5, 1, 12, 0F,0F, 0F, 5.3F, 0F, 0F, 5.3F, 0F, 0F, 5.3F, 0F, 0F, 5.3F, 0F, 0F, 5.3F, 0F, 0F, 5.3F, 0F, 0F, 5.3F, 0F, 0F, 5.3F); // Box 12
		bodyModel[24].setRotationPoint(14.6F, -21.7F, -5.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F,0F, 0F, 5.3F, 0.3F, 0F, 4.3F, 0.3F, 0F, 4.3F, 0F, 0F, 5.3F, 0F, 0F, 5.3F, 0.3F, 0F, 4.3F, 0.3F, 0F, 4.3F, 0F, 0F, 5.3F); // Box 13
		bodyModel[25].setRotationPoint(19.6F, -21.7F, -5.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 5.3F, 0.3F, 0F, 2.3F, 0.3F, 0F, 1.3F, 0F, 0F, 5.3F, 0F, 0F, 5.3F, 0.3F, 0F, 2.3F, 0.3F, 0F, 1.3F, 0F, 0F, 5.3F); // Box 14
		bodyModel[26].setRotationPoint(23.9F, -21.7F, -4.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 5.3F, 0.3F, 0F, 1.3F, 0.3F, 0F, 2.3F, 0F, 0F, 5.3F, 0F, 0F, 5.3F, 0.3F, 0F, 1.3F, 0.3F, 0F, 2.3F, 0F, 0F, 5.3F); // Box 16
		bodyModel[27].setRotationPoint(23.9F, -21.7F, 3.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 37, 0F,1F, -0.1F, 0F, 0.09F, -0.4F, 0F, 0.09F, -0.4F, 0F, 1F, -0.1F, 0F, 0F, -0.7F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.7F, 0F); // Box 17
		bodyModel[28].setRotationPoint(41.75F, -11.5F, -18F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 6, 21, 0F,-5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 1F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, 1F, 0.5F, 0.5F); // Box 46
		bodyModel[29].setRotationPoint(43.5F, -8.5F, -10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,-2F, -1F, 0F, 2F, -1F, 0F, 5F, 0F, 1F, -5F, 0F, 1F, 3F, -0.5F, 0.5F, -3F, -0.5F, 0.5F, -1F, 0.5F, 0.5F, 1F, 0.5F, 0.5F); // Box 0
		bodyModel[30].setRotationPoint(43.5F, -8.5F, -14F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,-5F, 0F, 1F, 5F, 0F, 1F, 2F, -1F, 0F, -2F, -1F, 0F, 1F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, -2F, -0.5F, 0.5F, 2F, -0.5F, 0.5F); // Box 1
		bodyModel[31].setRotationPoint(43.5F, -8.5F, 12F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4.5F, -0.5F, 0F, 4.5F, -0.5F, 0F, -3F, 0F, 0F); // Box 2
		bodyModel[32].setRotationPoint(29.6F, -19.5F, -8F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 4.5F, -0.5F, 0F, 4.5F, -0.5F, 0F, -3F, 0F, 0F); // Box 3
		bodyModel[33].setRotationPoint(29.6F, -19.5F, 2F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[34].setRotationPoint(29F, -20F, -7F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[35].setRotationPoint(29F, -20F, -3F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[36].setRotationPoint(29F, -20F, 3F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[37].setRotationPoint(29F, -20F, 7F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[38].setRotationPoint(20.9F, -21.6F, -10.6F);
		bodyModel[38].rotateAngleY = 0.2268928F;

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[39].setRotationPoint(20.4F, -21.6F, 9.7F);
		bodyModel[39].rotateAngleY = -0.2268928F;

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[40].setRotationPoint(15.9F, -21.6F, -10.9F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[41].setRotationPoint(15.9F, -21.6F, 9.9F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[42].setRotationPoint(24.2F, -21.6F, 8.3F);
		bodyModel[42].rotateAngleY = -0.61086524F;

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[43].setRotationPoint(25.2F, -21.6F, -9.1F);
		bodyModel[43].rotateAngleY = 0.61086524F;

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[44].setRotationPoint(26F, -21.6F, -4.9F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[45].setRotationPoint(26F, -21.6F, 4.1F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 28, 13, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[46].setRotationPoint(10.6F, -10.5F, -12F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 28, 13, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[47].setRotationPoint(-40.4F, -10.5F, -12F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 6, 5, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F); // Box 18
		bodyModel[48].setRotationPoint(-45F, -2.5F, -12F);

		bodyModel[49].addBox(0F, 0F, 0F, 3, 4, 2, 0F); // Box 19
		bodyModel[49].setRotationPoint(1F, -20.5F, -13.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[50].setRotationPoint(-2F, -20.5F, -13.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[51].setRotationPoint(4F, -20.5F, -13.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 22
		bodyModel[52].setRotationPoint(4F, -20F, 12.5F);

		bodyModel[53].addBox(0F, 0F, 0F, 3, 4, 3, 0F); // Box 23
		bodyModel[53].setRotationPoint(1F, -20F, 12.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 24
		bodyModel[54].setRotationPoint(-2F, -20F, 12.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 25
		bodyModel[55].setRotationPoint(1.5F, -19.8F, -13.6F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.1F, 0F, 0F, -0.1F, 0F, -1F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.7F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 27
		bodyModel[56].setRotationPoint(4F, -19.8F, -13.7F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.1F, 0F, -1.1F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.7F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 28
		bodyModel[57].setRotationPoint(-1F, -19.8F, -13.55F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 29
		bodyModel[58].setRotationPoint(1.5F, -19.8F, 12.6F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -1.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -1.2F, -0.1F, 0F, 0F); // Box 30
		bodyModel[59].setRotationPoint(4F, -19.8F, 12.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -1.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.1F, -0.1F, 0F, -0.9F); // Box 31
		bodyModel[60].setRotationPoint(-1F, -19.8F, 12.55F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[61].setRotationPoint(25.2F, -19.6F, -11F);
		bodyModel[61].rotateAngleY = 0.38397244F;

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[62].setRotationPoint(24.9F, -19.6F, 10.7F);
		bodyModel[62].rotateAngleY = -0.38397244F;

		bodyModel[63].addBox(0F, 0F, 0F, 21, 1, 1, 0F); // Box 2
		bodyModel[63].setRotationPoint(-12F, -3.5F, -18.1F);

		bodyModel[64].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 3
		bodyModel[64].setRotationPoint(-12F, -0.5F, -18.1F);

		bodyModel[65].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 4
		bodyModel[65].setRotationPoint(1F, -0.5F, -18.1F);

		bodyModel[66].addBox(0F, 0F, 0F, 21, 1, 1, 0F); // Box 5
		bodyModel[66].setRotationPoint(-12F, -3.5F, 18.1F);

		bodyModel[67].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 6
		bodyModel[67].setRotationPoint(-12F, -0.5F, 18.1F);

		bodyModel[68].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 7
		bodyModel[68].setRotationPoint(1F, -0.5F, 18.1F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 5, 1, 9, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[69].setRotationPoint(-44F, -16.8F, 0.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 5, 1, 9, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[70].setRotationPoint(-44F, -16.8F, -9.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 5, 1, 9, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[71].setRotationPoint(-38.5F, -17.8F, -9.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 5, 1, 9, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[72].setRotationPoint(-38.5F, -17.8F, 0.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 5, 1, 9, 0F,0F, 0F, 0F, 2F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[73].setRotationPoint(-25.5F, -19.8F, 1.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 5, 1, 9, 0F,0F, 0F, 0F, -1F, 1F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[74].setRotationPoint(-25.5F, -19.8F, -9.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 6
		bodyModel[75].setRotationPoint(-41F, -16F, 10.8F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F,0F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 7
		bodyModel[76].setRotationPoint(-41F, -16F, -13.8F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0F, 0F); // Box 80
		bodyModel[77].setRotationPoint(42F, -14.5F, 11.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0F, 0F); // Box 81
		bodyModel[78].setRotationPoint(42.5F, -14.8F, 9.3F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0F, 0F); // Box 82
		bodyModel[79].setRotationPoint(43.5F, -14.8F, -9F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0F, 0F); // Box 83
		bodyModel[80].setRotationPoint(43F, -14.5F, -11.3F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F); // Box 84
		bodyModel[81].setRotationPoint(43F, -14.3F, -9F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F); // Box 85
		bodyModel[82].setRotationPoint(42F, -14.3F, 9.3F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F); // Box 86
		bodyModel[83].setRotationPoint(41.5F, -14F, 11.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F); // Box 87
		bodyModel[84].setRotationPoint(42.5F, -14F, -11.3F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 17, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[85].setRotationPoint(-45.2F, -12.5F, -9F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 17, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[86].setRotationPoint(-45.2F, -8.5F, -9F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 17, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[87].setRotationPoint(-45.2F, -8.5F, 4F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 17, 4, 7, 0F,0F, 0F, -2.8F, 0F, 0F, -2.8F, 0F, 0F, -2.8F, 0F, 0F, -2.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[88].setRotationPoint(-45.5F, -9.5F, -3.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 17, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 58
		bodyModel[89].setRotationPoint(-45.5F, -5.5F, -3.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -1F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 75
		bodyModel[90].setRotationPoint(2.5F, -28.2F, 3.1F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 0
		turretModel[1] = new ModelRendererTurbo(this, 473, 161, textureX, textureY); // Box 211
		turretModel[2] = new ModelRendererTurbo(this, 249, 169, textureX, textureY); // Box 216
		turretModel[3] = new ModelRendererTurbo(this, 289, 169, textureX, textureY); // Box 217
		turretModel[4] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 218
		turretModel[5] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 219
		turretModel[6] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 220
		turretModel[7] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 221

		turretModel[0].addShapeBox(22.3F, 0F, -3.58F, 2, 1, 5, 0F,3F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0.55F, 0F, -0.05F, 0.55F, 0F, 0.1F, 0F, 0F, 0F); // Box 0
		turretModel[0].setRotationPoint(-13.5F, -22.2F, 1.5F);

		turretModel[1].addShapeBox(13.5F, 0F, -7F, 6, 6, 13, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 4F, 1F, 0F, 4F, 1F, 0F, 4F, 1F, 0F, 4F); // Box 211
		turretModel[1].setRotationPoint(-16F, -27.7F, 1F);

		turretModel[2].addShapeBox(13.5F, 0F, -7F, 3, 6, 13, 0F,0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, 0F, -1F, 0F, 4F, 2F, 0F, 1F, 2F, 0F, 1F, -1F, 0F, 4F); // Box 216
		turretModel[2].setRotationPoint(-10F, -27.7F, 1F);

		turretModel[3].addShapeBox(13.5F, 0F, -7F, 3, 6, 13, 0F,0F, -0.5F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 2F, 0F, 1F, -1F, 0F, 4F, -1F, 0F, 4F, 2F, 0F, 1F); // Box 217
		turretModel[3].setRotationPoint(-19F, -27.7F, 1F);

		turretModel[4].addShapeBox(8.5F, 0F, -5F, 2, 6, 9, 0F,-1F, -0.5F, -2F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -1F, -0.5F, -2F, 2.5F, 0F, 0.5F, -2F, 0F, 3F, -2F, 0F, 3F, 2.5F, 0F, 0.5F); // Box 218
		turretModel[4].setRotationPoint(-16F, -27.7F, 1F);

		turretModel[5].addShapeBox(20.5F, 0F, -5F, 2, 6, 4, 0F,0F, -0.5F, -1F, -1F, -0.5F, -2F, -1F, -0.5F, -2F, 0F, -0.5F, -2F, -2F, 0F, 3F, 2.5F, 0F, 1F, 2.5F, 0F, -2F, -2F, 0F, -2F); // Box 219
		turretModel[5].setRotationPoint(-14F, -27.7F, 1F);

		turretModel[6].addShapeBox(20.5F, 0F, -1F, 2, 6, 4, 0F,0F, -0.5F, -2F, -1F, -0.5F, -2F, -1F, -0.5F, -2F, 0F, -0.5F, -1F, -2F, 0F, -2F, 2.5F, 0F, -2F, 2.5F, 0F, 0.5F, -2F, 0F, 3F); // Box 220
		turretModel[6].setRotationPoint(-14F, -27.7F, 2F);

		turretModel[7].addShapeBox(20.63F, 0F, -3F, 1, 1, 5, 0F,1F, 0F, 0F, -0.15F, 0F, 0F, -0.14F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.1F, 0.55F, 0F, 0.1F, 0.55F, 0F, 0.1F, 1F, 0F, 0F); // Box 221
		turretModel[7].setRotationPoint(-14F, -27.2F, 1.1F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Import 
		barrelModel[1] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Import 
		barrelModel[2] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Import 
		barrelModel[3] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Import 
		barrelModel[4] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Import 
		barrelModel[5] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Import 
		barrelModel[6] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 226
		barrelModel[7] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 227
		barrelModel[8] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 228

		barrelModel[0].addShapeBox(13F, -0.7F, -0.8F, 3, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F); // Import 
		barrelModel[0].setRotationPoint(5F, -24.6F, 1F);

		barrelModel[1].addShapeBox(8F, -0.7F, -0.8F, 1, 1, 1, 0F,0F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Import 
		barrelModel[1].setRotationPoint(5F, -24.6F, 1F);

		barrelModel[2].addShapeBox(11.75F, -0.7F, -0.8F, 2, 1, 1, 0F,0F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Import 
		barrelModel[2].setRotationPoint(5F, -24.6F, 1F);

		barrelModel[3].addShapeBox(0.25F, -1.7F, -1.8F, 14, 3, 3, 0F,0F, -1.2F, -1.2F, -0.5F, -1.2F, -1.2F, -0.5F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, -0.5F, -1.2F, -1.2F, -0.5F, -1.2F, -1.2F, 0F, -1.2F, -1.2F); // Import 
		barrelModel[3].setRotationPoint(5F, -24.6F, 1F);

		barrelModel[4].addShapeBox(0F, -0.5F, -0.8F, 8, 1, 1, 0F,0F, -0.1F, 0.5F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, 0F, -0.1F, 0.5F, 0F, -0.3F, 0F, -0.75F, -0.3F, 0F, -0.75F, -0.3F, 0F, 0F, -0.3F, 0F); // Import 
		barrelModel[4].setRotationPoint(5F, -24.6F, 1F);

		barrelModel[5].addShapeBox(1F, -0.5F, -2.25F, 4, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Import 
		barrelModel[5].setRotationPoint(5F, -24.5F, 1F);

		barrelModel[6].addShapeBox(5F, -0.5F, -2.25F, 1, 1, 1, 0F,0.5F, -0.3F, -0.3F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.3F, -0.3F); // Box 226
		barrelModel[6].setRotationPoint(5F, -24.5F, 1F);

		barrelModel[7].addShapeBox(2F, -0.7F, -0.8F, 1, 1, 1, 0F,0F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 227
		barrelModel[7].setRotationPoint(5F, -24.6F, 1F);

		barrelModel[8].addShapeBox(5F, -0.7F, -0.8F, 1, 1, 1, 0F,0F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 228
		barrelModel[8].setRotationPoint(5F, -24.6F, 1F);
	}

	private void initleftFrontWheelModel_1()
	{
		leftFrontWheelModel[0] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 35
		leftFrontWheelModel[1] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 36
		leftFrontWheelModel[2] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 37
		leftFrontWheelModel[3] = new ModelRendererTurbo(this, 425, 129, textureX, textureY); // Box 38
		leftFrontWheelModel[4] = new ModelRendererTurbo(this, 89, 137, textureX, textureY); // Box 39
		leftFrontWheelModel[5] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 40

		leftFrontWheelModel[0].addShapeBox(-8.5F, -8.5F, -3F, 17, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		leftFrontWheelModel[0].setRotationPoint(23.5F, 1.5F, 15F);

		leftFrontWheelModel[1].addShapeBox(-6F, -7F, -2.8F, 12, 4, 6, 0F,-5F, -0.2F, 0F, -5F, -0.2F, 0F, -4F, -0.2F, 0F, -4F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		leftFrontWheelModel[1].setRotationPoint(23.5F, 1.5F, 15F);

		leftFrontWheelModel[2].addShapeBox(-6F, -2.5F, -2.8F, 12, 5, 6, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 37
		leftFrontWheelModel[2].setRotationPoint(23.5F, 1.5F, 15F);

		leftFrontWheelModel[3].addBox(-8.5F, -3.5F, -3F, 17, 7, 6, 0F); // Box 38
		leftFrontWheelModel[3].setRotationPoint(23.5F, 1.5F, 15F);

		leftFrontWheelModel[4].addShapeBox(-8.5F, 3.5F, -3F, 17, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 39
		leftFrontWheelModel[4].setRotationPoint(23.5F, 1.5F, 15F);

		leftFrontWheelModel[5].addShapeBox(-6F, 3F, -2.8F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, -4F, -0.2F, 0F, -4F, -0.2F, 0F); // Box 40
		leftFrontWheelModel[5].setRotationPoint(23.5F, 1.5F, 15F);
	}

	private void initrightFrontWheelModel_1()
	{
		rightFrontWheelModel[0] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 146
		rightFrontWheelModel[1] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 147
		rightFrontWheelModel[2] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 148
		rightFrontWheelModel[3] = new ModelRendererTurbo(this, 425, 129, textureX, textureY); // Box 149
		rightFrontWheelModel[4] = new ModelRendererTurbo(this, 89, 137, textureX, textureY); // Box 150
		rightFrontWheelModel[5] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 151

		rightFrontWheelModel[0].addShapeBox(-8.5F, -8.5F, -3F, 17, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		rightFrontWheelModel[0].setRotationPoint(23.5F, 1.5F, -14F);

		rightFrontWheelModel[1].addShapeBox(-6F, -7F, -3.2F, 12, 4, 6, 0F,-4F, -0.2F, 0F, -4F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		rightFrontWheelModel[1].setRotationPoint(23.5F, 1.5F, -14F);

		rightFrontWheelModel[2].addShapeBox(-6F, -2.5F, -3.2F, 12, 5, 6, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 148
		rightFrontWheelModel[2].setRotationPoint(23.5F, 1.5F, -14F);

		rightFrontWheelModel[3].addBox(-8.5F, -3.5F, -3F, 17, 7, 6, 0F); // Box 149
		rightFrontWheelModel[3].setRotationPoint(23.5F, 1.5F, -14F);

		rightFrontWheelModel[4].addShapeBox(-8.5F, 3.5F, -3F, 17, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 150
		rightFrontWheelModel[4].setRotationPoint(23.5F, 1.5F, -14F);

		rightFrontWheelModel[5].addShapeBox(-6F, 3F, -3.2F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -0.2F, 0F, -4F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F); // Box 151
		rightFrontWheelModel[5].setRotationPoint(23.5F, 1.5F, -14F);
	}

	private void initleftBackWheelModel_1()
	{
		leftBackWheelModel[0] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 140
		leftBackWheelModel[1] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 141
		leftBackWheelModel[2] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 142
		leftBackWheelModel[3] = new ModelRendererTurbo(this, 89, 137, textureX, textureY); // Box 143
		leftBackWheelModel[4] = new ModelRendererTurbo(this, 425, 129, textureX, textureY); // Box 144
		leftBackWheelModel[5] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 145

		leftBackWheelModel[0].addShapeBox(-6F, -2.5F, -2.8F, 12, 5, 6, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 140
		leftBackWheelModel[0].setRotationPoint(-26.5F, 1.5F, 15F);

		leftBackWheelModel[1].addShapeBox(-6F, -7F, -2.8F, 12, 4, 6, 0F,-5F, -0.2F, 0F, -5F, -0.2F, 0F, -4F, -0.2F, 0F, -4F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		leftBackWheelModel[1].setRotationPoint(-26.5F, 1.5F, 15F);

		leftBackWheelModel[2].addShapeBox(-6F, 3F, -2.8F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, -4F, -0.2F, 0F, -4F, -0.2F, 0F); // Box 142
		leftBackWheelModel[2].setRotationPoint(-26.5F, 1.5F, 15F);

		leftBackWheelModel[3].addShapeBox(-8.5F, 3.5F, -3F, 17, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 143
		leftBackWheelModel[3].setRotationPoint(-26.5F, 1.5F, 15F);

		leftBackWheelModel[4].addBox(-8.5F, -3.5F, -3F, 17, 7, 6, 0F); // Box 144
		leftBackWheelModel[4].setRotationPoint(-26.5F, 1.5F, 15F);

		leftBackWheelModel[5].addShapeBox(-8.5F, -8.5F, -3F, 17, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		leftBackWheelModel[5].setRotationPoint(-26.5F, 1.5F, 15F);
	}

	private void initrightBackWheelModel_1()
	{
		rightBackWheelModel[0] = new ModelRendererTurbo(this, 89, 137, textureX, textureY); // Box 152
		rightBackWheelModel[1] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 153
		rightBackWheelModel[2] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 154
		rightBackWheelModel[3] = new ModelRendererTurbo(this, 425, 129, textureX, textureY); // Box 155
		rightBackWheelModel[4] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 156
		rightBackWheelModel[5] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 157

		rightBackWheelModel[0].addShapeBox(-8.5F, 3.5F, -3F, 17, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 152
		rightBackWheelModel[0].setRotationPoint(-26.5F, 1.5F, -14F);

		rightBackWheelModel[1].addShapeBox(-6F, 3F, -3.2F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -0.2F, 0F, -4F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F); // Box 153
		rightBackWheelModel[1].setRotationPoint(-26.5F, 1.5F, -14F);

		rightBackWheelModel[2].addShapeBox(-6F, -2.5F, -3.2F, 12, 5, 6, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 154
		rightBackWheelModel[2].setRotationPoint(-26.5F, 1.5F, -14F);

		rightBackWheelModel[3].addBox(-8.5F, -3.5F, -3F, 17, 7, 6, 0F); // Box 155
		rightBackWheelModel[3].setRotationPoint(-26.5F, 1.5F, -14F);

		rightBackWheelModel[4].addShapeBox(-8.5F, -8.5F, -3F, 17, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		rightBackWheelModel[4].setRotationPoint(-26.5F, 1.5F, -14F);

		rightBackWheelModel[5].addShapeBox(-6F, -7F, -3.2F, 12, 4, 6, 0F,-4F, -0.2F, 0F, -4F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		rightBackWheelModel[5].setRotationPoint(-26.5F, 1.5F, -14F);
	}
}