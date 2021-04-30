//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SprutSD
// Model Creator: 
// Created on: 29.06.2015 - 13:29:38
// Last changed on: 29.06.2015 - 13:29:38

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelZBD05 extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelZBD05() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[73];
		bodyDoorOpenModel = new ModelRendererTurbo[18];
		bodyDoorCloseModel = new ModelRendererTurbo[10];
		turretModel = new ModelRendererTurbo[55];
		barrelModel = new ModelRendererTurbo[75];
		leftTrackWheelModels = new ModelRendererTurbo[91];
		rightTrackWheelModels = new ModelRendererTurbo[69];
		leftTrackModel = new ModelRendererTurbo[11];
		rightTrackModel = new ModelRendererTurbo[11];

		initbodyModel_1();
		initbodyDoorOpenModel_1();
		initbodyDoorCloseModel_1();
		initturretModel_1();
		initbarrelModel_1();
		initleftTrackWheelModels_1();
		initrightTrackWheelModels_1();
		initleftTrackModel_1();
		initrightTrackModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 13
		bodyModel[1] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 13
		bodyModel[2] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 13
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 13
		bodyModel[4] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 13
		bodyModel[5] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Box 13
		bodyModel[6] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Box 13
		bodyModel[7] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Box 13
		bodyModel[8] = new ModelRendererTurbo(this, 689, 1, textureX, textureY); // Box 13
		bodyModel[9] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 13
		bodyModel[10] = new ModelRendererTurbo(this, 633, 33, textureX, textureY); // Box 13
		bodyModel[11] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 745, 33, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 585, 33, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Box 13
		bodyModel[15] = new ModelRendererTurbo(this, 481, 137, textureX, textureY); // Box 13
		bodyModel[16] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 13
		bodyModel[17] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Box 13
		bodyModel[18] = new ModelRendererTurbo(this, 761, 129, textureX, textureY); // Box 13
		bodyModel[19] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 13
		bodyModel[20] = new ModelRendererTurbo(this, 713, 137, textureX, textureY); // Box 13
		bodyModel[21] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 13
		bodyModel[22] = new ModelRendererTurbo(this, 545, 217, textureX, textureY); // Box 13
		bodyModel[23] = new ModelRendererTurbo(this, 897, 169, textureX, textureY); // Box 13
		bodyModel[24] = new ModelRendererTurbo(this, 665, 153, textureX, textureY); // Box 13
		bodyModel[25] = new ModelRendererTurbo(this, 865, 153, textureX, textureY); // Box 13
		bodyModel[26] = new ModelRendererTurbo(this, 201, 161, textureX, textureY); // Box 13
		bodyModel[27] = new ModelRendererTurbo(this, 521, 169, textureX, textureY); // Box 13
		bodyModel[28] = new ModelRendererTurbo(this, 569, 9, textureX, textureY); // Box 13
		bodyModel[29] = new ModelRendererTurbo(this, 649, 9, textureX, textureY); // Box 13
		bodyModel[30] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 13
		bodyModel[31] = new ModelRendererTurbo(this, 857, 41, textureX, textureY); // Box 13
		bodyModel[32] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 13
		bodyModel[33] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 13
		bodyModel[34] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 13
		bodyModel[35] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Box 13
		bodyModel[36] = new ModelRendererTurbo(this, 361, 169, textureX, textureY); // Box 13
		bodyModel[37] = new ModelRendererTurbo(this, 913, 161, textureX, textureY); // Box 13
		bodyModel[38] = new ModelRendererTurbo(this, 801, 89, textureX, textureY); // Box 13
		bodyModel[39] = new ModelRendererTurbo(this, 961, 161, textureX, textureY); // Box 13
		bodyModel[40] = new ModelRendererTurbo(this, 657, 113, textureX, textureY); // Box 13
		bodyModel[41] = new ModelRendererTurbo(this, 1001, 113, textureX, textureY); // Box 13
		bodyModel[42] = new ModelRendererTurbo(this, 889, 121, textureX, textureY); // Box 13
		bodyModel[43] = new ModelRendererTurbo(this, 209, 129, textureX, textureY); // Box 13
		bodyModel[44] = new ModelRendererTurbo(this, 241, 161, textureX, textureY); // Box 13
		bodyModel[45] = new ModelRendererTurbo(this, 761, 161, textureX, textureY); // Box 13
		bodyModel[46] = new ModelRendererTurbo(this, 81, 201, textureX, textureY); // Box 13
		bodyModel[47] = new ModelRendererTurbo(this, 753, 217, textureX, textureY); // Box 13
		bodyModel[48] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 13
		bodyModel[49] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 13
		bodyModel[50] = new ModelRendererTurbo(this, 609, 9, textureX, textureY); // Box 13
		bodyModel[51] = new ModelRendererTurbo(this, 721, 17, textureX, textureY); // Box 13
		bodyModel[52] = new ModelRendererTurbo(this, 753, 17, textureX, textureY); // Box 13
		bodyModel[53] = new ModelRendererTurbo(this, 857, 17, textureX, textureY); // Box 13
		bodyModel[54] = new ModelRendererTurbo(this, 265, 233, textureX, textureY); // Box 13
		bodyModel[55] = new ModelRendererTurbo(this, 417, 233, textureX, textureY); // Box 13
		bodyModel[56] = new ModelRendererTurbo(this, 753, 241, textureX, textureY); // Box 13
		bodyModel[57] = new ModelRendererTurbo(this, 145, 257, textureX, textureY); // Box 13
		bodyModel[58] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 13
		bodyModel[59] = new ModelRendererTurbo(this, 41, 201, textureX, textureY); // Box 13
		bodyModel[60] = new ModelRendererTurbo(this, 81, 225, textureX, textureY); // Box 13
		bodyModel[61] = new ModelRendererTurbo(this, 401, 249, textureX, textureY); // Box 13
		bodyModel[62] = new ModelRendererTurbo(this, 297, 273, textureX, textureY); // Box 13
		bodyModel[63] = new ModelRendererTurbo(this, 609, 273, textureX, textureY); // Box 13
		bodyModel[64] = new ModelRendererTurbo(this, 553, 281, textureX, textureY); // Box 13
		bodyModel[65] = new ModelRendererTurbo(this, 97, 281, textureX, textureY); // Box 13
		bodyModel[66] = new ModelRendererTurbo(this, 873, 241, textureX, textureY); // Box 13
		bodyModel[67] = new ModelRendererTurbo(this, 345, 289, textureX, textureY); // Box 13
		bodyModel[68] = new ModelRendererTurbo(this, 401, 337, textureX, textureY); // Box 13
		bodyModel[69] = new ModelRendererTurbo(this, 1017, 161, textureX, textureY); // Box 13
		bodyModel[70] = new ModelRendererTurbo(this, 1009, 193, textureX, textureY); // Box 13
		bodyModel[71] = new ModelRendererTurbo(this, 794, 396, textureX, textureY); // Box 13
		bodyModel[72] = new ModelRendererTurbo(this, 693, 396, textureX, textureY); // Box 13

		bodyModel[0].addShapeBox(0F, 0F, 0F, 80, 20, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 13
		bodyModel[0].setRotationPoint(-63F, -30F, -37F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 66, 20, 74, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[1].setRotationPoint(17F, -30F, -37F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 150, 5, 2, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 13
		bodyModel[2].setRotationPoint(-61F, -10F, -26F);

		bodyModel[3].addShapeBox(-1F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[3].setRotationPoint(62F, 6F, 25F);

		bodyModel[4].addShapeBox(-1F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[4].setRotationPoint(46F, 6F, 25F);

		bodyModel[5].addShapeBox(-1F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[5].setRotationPoint(28F, 6F, 25F);

		bodyModel[6].addShapeBox(-1F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[6].setRotationPoint(8F, 6F, 25F);

		bodyModel[7].addShapeBox(-1F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[7].setRotationPoint(-11F, 6F, 25F);

		bodyModel[8].addShapeBox(-1F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[8].setRotationPoint(-37F, 6F, 25F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 36, 16, 74, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21.5F, 0F, 0F, -21.5F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[9].setRotationPoint(83F, -26F, -37F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 15, 5, 74, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -6F, 0F, 0F); // Box 13
		bodyModel[10].setRotationPoint(83F, -10F, -37F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 150, 10, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, -2F, 0F, 0F); // Box 13
		bodyModel[11].setRotationPoint(-61F, -5F, -26F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 131, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[12].setRotationPoint(-47F, -11F, 37F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 10, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[13].setRotationPoint(-60F, -11F, 37F);

		bodyModel[14].addShapeBox(0F, 0F, -1F, 131, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[14].setRotationPoint(-47F, -11F, -37F);

		bodyModel[15].addShapeBox(0F, 0F, -1F, 135, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[15].setRotationPoint(-47F, -7F, -37F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 135, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[16].setRotationPoint(-47F, -7F, 37F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[17].setRotationPoint(-50F, -11F, 37F);

		bodyModel[18].addShapeBox(0F, 0F, -1F, 10, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[18].setRotationPoint(-60F, -11F, -37F);

		bodyModel[19].addShapeBox(0F, 0F, -1F, 3, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[19].setRotationPoint(-50F, -11F, -37F);

		bodyModel[20].addShapeBox(0F, 0F, -37F, 38, 1, 74, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[20].setRotationPoint(89F, -5F, 0F);
		bodyModel[20].rotateAngleZ = 0.54105207F;

		bodyModel[21].addShapeBox(0F, 0F, 0F, 80, 20, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 13
		bodyModel[21].setRotationPoint(-63F, -30F, 24F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 76, 2, 48, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[22].setRotationPoint(-59F, -30F, -24F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 4, 20, 48, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 13
		bodyModel[23].setRotationPoint(-63F, -30F, -24F);

		bodyModel[24].addShapeBox(-1F, 3F, -10F, 2, 30, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[24].setRotationPoint(-63F, -30F, 0F);
		bodyModel[24].rotateAngleZ = 0.10471976F;

		bodyModel[25].addShapeBox(14F, 0F, -10F, 10, 1, 20, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[25].setRotationPoint(40F, -29.5F, 20F);
		bodyModel[25].rotateAngleZ = -0.06108652F;

		bodyModel[26].addShapeBox(24F, 0F, -10F, 8, 1, 20, 0F,0F, 0F, -1F, -2F, 0F, -4F, -2F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 13
		bodyModel[26].setRotationPoint(40F, -29.5F, 20F);
		bodyModel[26].rotateAngleZ = -0.06108652F;

		bodyModel[27].addShapeBox(22F, -0.5F, -18F, 19, 2, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[27].setRotationPoint(40F, -29.5F, -3F);
		bodyModel[27].rotateAngleZ = -0.06108652F;

		bodyModel[28].addShapeBox(22F, -0.75F, -18F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[28].setRotationPoint(40F, -29.5F, -3F);
		bodyModel[28].rotateAngleZ = -0.06108652F;

		bodyModel[29].addShapeBox(22F, -0.75F, 11F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[29].setRotationPoint(40F, -29.5F, -3F);
		bodyModel[29].rotateAngleZ = -0.06108652F;

		bodyModel[30].addShapeBox(22F, -0.75F, -17F, 1, 1, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[30].setRotationPoint(40F, -29.5F, -3F);
		bodyModel[30].rotateAngleZ = -0.06108652F;

		bodyModel[31].addShapeBox(40F, -0.75F, -17F, 1, 1, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[31].setRotationPoint(40F, -29.5F, -3F);
		bodyModel[31].rotateAngleZ = -0.06108652F;

		bodyModel[32].addShapeBox(23F, -0.75F, -12.5F, 17, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[32].setRotationPoint(40F, -29.5F, -3F);
		bodyModel[32].rotateAngleZ = -0.06108652F;

		bodyModel[33].addShapeBox(23F, -0.75F, -6.5F, 17, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[33].setRotationPoint(40F, -29.5F, -3F);
		bodyModel[33].rotateAngleZ = -0.06108652F;

		bodyModel[34].addShapeBox(23F, -0.75F, -0.5F, 17, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[34].setRotationPoint(40F, -29.5F, -3F);
		bodyModel[34].rotateAngleZ = -0.06108652F;

		bodyModel[35].addShapeBox(23F, -0.75F, 5.5F, 17, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[35].setRotationPoint(40F, -29.5F, -3F);
		bodyModel[35].rotateAngleZ = -0.06108652F;

		bodyModel[36].addShapeBox(10F, -0.5F, -33F, 22, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[36].setRotationPoint(40F, -29.5F, -3F);
		bodyModel[36].rotateAngleZ = -0.06108652F;

		bodyModel[37].addShapeBox(10F, -0.75F, -33F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[37].setRotationPoint(40F, -29.5F, -3F);
		bodyModel[37].rotateAngleZ = -0.06108652F;

		bodyModel[38].addShapeBox(10F, -0.75F, -32F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[38].setRotationPoint(40F, -29.5F, -3F);
		bodyModel[38].rotateAngleZ = -0.06108652F;

		bodyModel[39].addShapeBox(10F, -0.75F, -22F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[39].setRotationPoint(40F, -29.5F, -3F);
		bodyModel[39].rotateAngleZ = -0.06108652F;

		bodyModel[40].addShapeBox(31F, -0.75F, -32F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[40].setRotationPoint(40F, -29.5F, -3F);
		bodyModel[40].rotateAngleZ = -0.06108652F;

		bodyModel[41].addShapeBox(25.5F, -0.75F, -32F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[41].setRotationPoint(40F, -29.5F, -3F);
		bodyModel[41].rotateAngleZ = -0.06108652F;

		bodyModel[42].addShapeBox(20.5F, -0.75F, -32F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[42].setRotationPoint(40F, -29.5F, -3F);
		bodyModel[42].rotateAngleZ = -0.06108652F;

		bodyModel[43].addShapeBox(15.5F, -0.75F, -32F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[43].setRotationPoint(40F, -29.5F, -3F);
		bodyModel[43].rotateAngleZ = -0.06108652F;

		bodyModel[44].addShapeBox(-10F, -3F, -34F, 8, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[44].setRotationPoint(40F, -29.5F, -3F);
		bodyModel[44].rotateAngleZ = -0.06108652F;

		bodyModel[45].addShapeBox(-10F, -3F, -28F, 8, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[45].setRotationPoint(40F, -29.5F, -3F);
		bodyModel[45].rotateAngleZ = -0.06108652F;

		bodyModel[46].addShapeBox(0F, 1F, 5F, 26, 1, 20, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[46].setRotationPoint(-59F, -32F, 0F);

		bodyModel[47].addShapeBox(0F, 1F, -26F, 26, 1, 20, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[47].setRotationPoint(-59F, -32F, 0F);

		bodyModel[48].addShapeBox(-1F, 0F, -4F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[48].setRotationPoint(-37F, 6F, -25F);

		bodyModel[49].addShapeBox(-1F, 0F, -4F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[49].setRotationPoint(-11F, 6F, -25F);

		bodyModel[50].addShapeBox(-1F, 0F, -4F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[50].setRotationPoint(8F, 6F, -25F);

		bodyModel[51].addShapeBox(-1F, 0F, -4F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[51].setRotationPoint(28F, 6F, -25F);

		bodyModel[52].addShapeBox(-1F, 0F, -4F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[52].setRotationPoint(46F, 6F, -25F);

		bodyModel[53].addShapeBox(-1F, 0F, -4F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[53].setRotationPoint(62F, 6F, -25F);

		bodyModel[54].addShapeBox(-7F, 0F, -2F, 70, 20, 2, 0F,0F, -7F, 0F, -20F, -7F, 0F, -20F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -20F, -7F, 0F, -20F, -7F, 0F, 0F, -7F, 0F); // Box 13
		bodyModel[54].setRotationPoint(-43F, -13.5F, 6F);

		bodyModel[55].addShapeBox(-7F, 0F, -2F, 70, 2, 10, 0F,0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[55].setRotationPoint(-43F, 0.5F, 8F);

		bodyModel[56].addShapeBox(-7F, 0F, -3F, 70, 2, 10, 0F,0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[56].setRotationPoint(-43F, 0.5F, -13F);

		bodyModel[57].addShapeBox(-7F, 0F, -14F, 70, 20, 2, 0F,0F, -7F, 0F, -20F, -7F, 0F, -20F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -20F, -7F, 0F, -20F, -7F, 0F, 0F, -7F, 0F); // Box 13
		bodyModel[57].setRotationPoint(-43F, -13.5F, 8F);

		bodyModel[58].addBox(0F, 0F, 0F, 6, 34, 12, 0F); // Box 13
		bodyModel[58].setRotationPoint(11F, -29F, -6F);

		bodyModel[59].addBox(0F, 0F, 0F, 6, 34, 8, 0F); // Box 13
		bodyModel[59].setRotationPoint(13F, -29F, -16F);

		bodyModel[60].addBox(0F, 0F, 0F, 6, 34, 8, 0F); // Box 13
		bodyModel[60].setRotationPoint(13F, -29F, 8F);

		bodyModel[61].addBox(0F, 0F, 0F, 50, 6, 12, 0F); // Box 13
		bodyModel[61].setRotationPoint(-50F, -1F, -6F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 150, 10, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, -2F, 0F, 0F); // Box 13
		bodyModel[62].setRotationPoint(-61F, -5F, 24F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 150, 5, 2, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 13
		bodyModel[63].setRotationPoint(-61F, -10F, 24F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 130, 1, 52, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[64].setRotationPoint(-59F, 5F, -26F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 72, 10, 48, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[65].setRotationPoint(17F, -5F, -24F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 5, 48, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 13
		bodyModel[66].setRotationPoint(-61F, -10F, -24F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 10, 48, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 13
		bodyModel[67].setRotationPoint(-61F, -5F, -24F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 72, 5, 48, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[68].setRotationPoint(17F, -10F, -24F);

		bodyModel[69].addShapeBox(-60F, -35F, 33.5F, 1, 50, 1, 0F,3.65F, 0F, -0.35F, -4.35F, 0F, -0.35F, -4.35F, 0F, -0.35F, 3.65F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F); // Box 13
		bodyModel[69].setRotationPoint(0F, -45F, 0F);

		bodyModel[70].addShapeBox(-60F, -45F, -34.5F, 1, 60, 1, 0F,3.65F, 0F, -0.35F, -4.35F, 0F, -0.35F, -4.35F, 0F, -0.35F, 3.65F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F); // Box 13
		bodyModel[70].setRotationPoint(0F, -45F, 0F);

		bodyModel[71].addShapeBox(-50F, -50F, -1F, 100, 100, 1, 0F,-45F, -45F, 0F, -45F, -45F, 0F, -45F, -45F, 0F, -45F, -45F, 0F, -45F, -45F, 0F, -45F, -45F, 0F, -45F, -45F, 0F, -45F, -45F, 0F); // Box 13
		bodyModel[71].setRotationPoint(20F, -20F, -36.35F);

		bodyModel[72].addShapeBox(-50F, -50F, 0F, 100, 100, 1, 0F,-45F, -45F, 0F, -45F, -45F, 0F, -45F, -45F, 0F, -45F, -45F, 0F, -45F, -45F, 0F, -45F, -45F, 0F, -45F, -45F, 0F, -45F, -45F, 0F); // Box 13
		bodyModel[72].setRotationPoint(20F, -20F, 36.35F);
	}

	private void initbodyDoorOpenModel_1()
	{
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 201, 145, textureX, textureY); // Box 13
		bodyDoorOpenModel[1] = new ModelRendererTurbo(this, 1017, 89, textureX, textureY); // Box 13
		bodyDoorOpenModel[2] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 13
		bodyDoorOpenModel[3] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Box 13
		bodyDoorOpenModel[4] = new ModelRendererTurbo(this, 537, 9, textureX, textureY); // Box 13
		bodyDoorOpenModel[5] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 13
		bodyDoorOpenModel[6] = new ModelRendererTurbo(this, 729, 153, textureX, textureY); // Box 13
		bodyDoorOpenModel[7] = new ModelRendererTurbo(this, 745, 153, textureX, textureY); // Box 13
		bodyDoorOpenModel[8] = new ModelRendererTurbo(this, 410, 293, textureX, textureY); // Box 13
		bodyDoorOpenModel[9] = new ModelRendererTurbo(this, 410, 300, textureX, textureY); // Box 13
		bodyDoorOpenModel[10] = new ModelRendererTurbo(this, 399, 293, textureX, textureY); // Box 13
		bodyDoorOpenModel[11] = new ModelRendererTurbo(this, 399, 293, textureX, textureY); // Box 13
		bodyDoorOpenModel[12] = new ModelRendererTurbo(this, 399, 313, textureX, textureY); // Box 13
		bodyDoorOpenModel[13] = new ModelRendererTurbo(this, 399, 307, textureX, textureY); // Box 13
		bodyDoorOpenModel[14] = new ModelRendererTurbo(this, 399, 313, textureX, textureY); // Box 13
		bodyDoorOpenModel[15] = new ModelRendererTurbo(this, 399, 307, textureX, textureY); // Box 13
		bodyDoorOpenModel[16] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 411
		bodyDoorOpenModel[17] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); // Box 412

		bodyDoorOpenModel[0].addShapeBox(0F, -0.5F, -37F, 39, 1, 74, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyDoorOpenModel[0].setRotationPoint(121.8F, -24.1F, 0F);
		bodyDoorOpenModel[0].rotateAngleZ = 0.52359878F;

		bodyDoorOpenModel[1].addShapeBox(-6.9F, -10.4F, -25.5F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F); // Box 13
		bodyDoorOpenModel[1].setRotationPoint(-57.5F, 3F, 0F);
		bodyDoorOpenModel[1].rotateAngleZ = 1.25663706F;

		bodyDoorOpenModel[2].addShapeBox(-4.1F, -5.4F, -25.5F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyDoorOpenModel[2].setRotationPoint(-57.5F, 3F, 0F);
		bodyDoorOpenModel[2].rotateAngleZ = 1.25663706F;

		bodyDoorOpenModel[3].addShapeBox(-6.9F, -10.4F, 24.5F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F); // Box 13
		bodyDoorOpenModel[3].setRotationPoint(-57.5F, 3F, 0F);
		bodyDoorOpenModel[3].rotateAngleZ = 1.25663706F;

		bodyDoorOpenModel[4].addShapeBox(-4.1F, -5.4F, 24.5F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyDoorOpenModel[4].setRotationPoint(-57.5F, 3F, 0F);
		bodyDoorOpenModel[4].rotateAngleZ = 1.25663706F;

		bodyDoorOpenModel[5].addShapeBox(-7F, -30F, -35F, 1, 20, 70, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyDoorOpenModel[5].setRotationPoint(-57.5F, 3F, 0F);
		bodyDoorOpenModel[5].rotateAngleZ = 1.25663706F;

		bodyDoorOpenModel[6].addShapeBox(-1F, 0F, 24F, 2, 37, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyDoorOpenModel[6].setRotationPoint(-62F, -30F, 0F);
		bodyDoorOpenModel[6].rotateAngleZ = -0.2268928F;

		bodyDoorOpenModel[7].addShapeBox(-1F, 0F, -26F, 2, 37, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyDoorOpenModel[7].setRotationPoint(-62F, -30F, 0F);
		bodyDoorOpenModel[7].rotateAngleZ = -0.2268928F;

		bodyDoorOpenModel[8].addShapeBox(0F, 0F, -1F, 14, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyDoorOpenModel[8].setRotationPoint(108F, -24.5F, 20F);
		bodyDoorOpenModel[8].rotateAngleZ = 0.61086524F;

		bodyDoorOpenModel[9].addShapeBox(0F, 0F, -1F, 14, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyDoorOpenModel[9].setRotationPoint(108F, -24.5F, -20F);
		bodyDoorOpenModel[9].rotateAngleZ = 0.61086524F;

		bodyDoorOpenModel[10].addShapeBox(12.6F, -6.1F, -1F, 2, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyDoorOpenModel[10].setRotationPoint(108F, -24.5F, 20F);
		bodyDoorOpenModel[10].rotateAngleZ = 0.17453293F;

		bodyDoorOpenModel[11].addShapeBox(12.6F, -6.1F, -1F, 2, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyDoorOpenModel[11].setRotationPoint(108F, -24.5F, -20F);
		bodyDoorOpenModel[11].rotateAngleZ = 0.17453293F;

		bodyDoorOpenModel[12].addShapeBox(12.6F, -6.1F, -0.5F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyDoorOpenModel[12].setRotationPoint(108F, -24.5F, 20F);
		bodyDoorOpenModel[12].rotateAngleZ = 0.1134464F;

		bodyDoorOpenModel[13].addShapeBox(21.6F, -6.1F, -0.5F, 1, 1, 1, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 13
		bodyDoorOpenModel[13].setRotationPoint(108F, -24.5F, 20F);
		bodyDoorOpenModel[13].rotateAngleZ = 0.1134464F;

		bodyDoorOpenModel[14].addShapeBox(12.6F, -6.1F, -0.5F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyDoorOpenModel[14].setRotationPoint(108F, -24.5F, -20F);
		bodyDoorOpenModel[14].rotateAngleZ = 0.1134464F;

		bodyDoorOpenModel[15].addShapeBox(21.6F, -6.1F, -0.5F, 1, 1, 1, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 13
		bodyDoorOpenModel[15].setRotationPoint(108F, -24.5F, -20F);
		bodyDoorOpenModel[15].rotateAngleZ = 0.1134464F;

		bodyDoorOpenModel[16].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F); // Box 411
		bodyDoorOpenModel[16].setRotationPoint(-33F, -38F, 28F);

		bodyDoorOpenModel[17].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 412
		bodyDoorOpenModel[17].setRotationPoint(-33.5F, -40F, 27.5F);
	}

	private void initbodyDoorCloseModel_1()
	{
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 361, 153, textureX, textureY); // Box 13
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 121, 161, textureX, textureY); // Box 13
		bodyDoorCloseModel[2] = new ModelRendererTurbo(this, 425, 145, textureX, textureY); // Box 13
		bodyDoorCloseModel[3] = new ModelRendererTurbo(this, 713, 153, textureX, textureY); // Box 13
		bodyDoorCloseModel[4] = new ModelRendererTurbo(this, 1017, 65, textureX, textureY); // Box 13
		bodyDoorCloseModel[5] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 13
		bodyDoorCloseModel[6] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 13
		bodyDoorCloseModel[7] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 13
		bodyDoorCloseModel[8] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 409
		bodyDoorCloseModel[9] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); // Box 410

		bodyDoorCloseModel[0].addShapeBox(0F, -0.5F, -37F, 39, 1, 74, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyDoorCloseModel[0].setRotationPoint(121.8F, -24.1F, 0F);
		bodyDoorCloseModel[0].rotateAngleZ = 3.07177948F;

		bodyDoorCloseModel[1].addShapeBox(-7F, -30F, -35F, 1, 20, 70, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyDoorCloseModel[1].setRotationPoint(-57.5F, 3F, 0F);
		bodyDoorCloseModel[1].rotateAngleZ = 0.10471976F;

		bodyDoorCloseModel[2].addShapeBox(-1F, 0F, -26F, 2, 24, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyDoorCloseModel[2].setRotationPoint(-62F, -30F, 0F);
		bodyDoorCloseModel[2].rotateAngleZ = -0.10471976F;

		bodyDoorCloseModel[3].addShapeBox(-1F, 0F, 24F, 2, 24, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyDoorCloseModel[3].setRotationPoint(-62F, -30F, 0F);
		bodyDoorCloseModel[3].rotateAngleZ = -0.10471976F;

		bodyDoorCloseModel[4].addShapeBox(-6.9F, -10.4F, 24.5F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F); // Box 13
		bodyDoorCloseModel[4].setRotationPoint(-57.5F, 3F, 0F);
		bodyDoorCloseModel[4].rotateAngleZ = 0.10471976F;

		bodyDoorCloseModel[5].addShapeBox(-4.1F, -5.4F, 24.5F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyDoorCloseModel[5].setRotationPoint(-57.5F, 3F, 0F);
		bodyDoorCloseModel[5].rotateAngleZ = 0.10471976F;

		bodyDoorCloseModel[6].addShapeBox(-6.9F, -10.4F, -25.5F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F); // Box 13
		bodyDoorCloseModel[6].setRotationPoint(-57.5F, 3F, 0F);
		bodyDoorCloseModel[6].rotateAngleZ = 0.10471976F;

		bodyDoorCloseModel[7].addShapeBox(-4.1F, -5.4F, -25.5F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyDoorCloseModel[7].setRotationPoint(-57.5F, 3F, 0F);
		bodyDoorCloseModel[7].rotateAngleZ = 0.10471976F;

		bodyDoorCloseModel[8].addBox(0F, 0F, 0F, 5, 3, 5, 0F); // Box 409
		bodyDoorCloseModel[8].setRotationPoint(-33F, -31F, 28F);

		bodyDoorCloseModel[9].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 410
		bodyDoorCloseModel[9].setRotationPoint(-33.5F, -33F, 27.5F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 593, 169, textureX, textureY); // Box 13
		turretModel[1] = new ModelRendererTurbo(this, 961, 169, textureX, textureY); // Box 13
		turretModel[2] = new ModelRendererTurbo(this, 737, 177, textureX, textureY); // Box 13
		turretModel[3] = new ModelRendererTurbo(this, 865, 177, textureX, textureY); // Box 13
		turretModel[4] = new ModelRendererTurbo(this, 201, 185, textureX, textureY); // Box 13
		turretModel[5] = new ModelRendererTurbo(this, 361, 185, textureX, textureY); // Box 13
		turretModel[6] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 13
		turretModel[7] = new ModelRendererTurbo(this, 697, 57, textureX, textureY); // Box 13
		turretModel[8] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 13
		turretModel[9] = new ModelRendererTurbo(this, 793, 17, textureX, textureY); // Box 13
		turretModel[10] = new ModelRendererTurbo(this, 609, 177, textureX, textureY); // Box 13
		turretModel[11] = new ModelRendererTurbo(this, 929, 241, textureX, textureY); // Box 13
		turretModel[12] = new ModelRendererTurbo(this, 945, 281, textureX, textureY); // Box 13
		turretModel[13] = new ModelRendererTurbo(this, 625, 169, textureX, textureY); // Box 13
		turretModel[14] = new ModelRendererTurbo(this, 897, 177, textureX, textureY); // Box 13
		turretModel[15] = new ModelRendererTurbo(this, 233, 185, textureX, textureY); // Box 13
		turretModel[16] = new ModelRendererTurbo(this, 297, 289, textureX, textureY); // Box 13
		turretModel[17] = new ModelRendererTurbo(this, 401, 289, textureX, textureY); // Box 13
		turretModel[18] = new ModelRendererTurbo(this, 505, 289, textureX, textureY); // Box 13
		turretModel[19] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Box 13
		turretModel[20] = new ModelRendererTurbo(this, 881, 321, textureX, textureY); // Box 13
		turretModel[21] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Box 13
		turretModel[22] = new ModelRendererTurbo(this, 601, 337, textureX, textureY); // Box 13
		turretModel[23] = new ModelRendererTurbo(this, 953, 321, textureX, textureY); // Box 13
		turretModel[24] = new ModelRendererTurbo(this, 697, 337, textureX, textureY); // Box 13
		turretModel[25] = new ModelRendererTurbo(this, 657, 337, textureX, textureY); // Box 13
		turretModel[26] = new ModelRendererTurbo(this, 753, 337, textureX, textureY); // Box 13
		turretModel[27] = new ModelRendererTurbo(this, 833, 217, textureX, textureY); // Box 13
		turretModel[28] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 13
		turretModel[29] = new ModelRendererTurbo(this, 393, 185, textureX, textureY); // Box 13
		turretModel[30] = new ModelRendererTurbo(this, 897, 185, textureX, textureY); // Box 13
		turretModel[31] = new ModelRendererTurbo(this, 233, 193, textureX, textureY); // Box 13
		turretModel[32] = new ModelRendererTurbo(this, 521, 209, textureX, textureY); // Box 13
		turretModel[33] = new ModelRendererTurbo(this, 521, 249, textureX, textureY); // Box 13
		turretModel[34] = new ModelRendererTurbo(this, 1017, 217, textureX, textureY); // Box 13
		turretModel[35] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 13
		turretModel[36] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 13
		turretModel[37] = new ModelRendererTurbo(this, 833, 17, textureX, textureY); // Box 13
		turretModel[38] = new ModelRendererTurbo(this, 881, 17, textureX, textureY); // Box 13
		turretModel[39] = new ModelRendererTurbo(this, 905, 17, textureX, textureY); // Box 13
		turretModel[40] = new ModelRendererTurbo(this, 929, 17, textureX, textureY); // Box 13
		turretModel[41] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 13
		turretModel[42] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 13
		turretModel[43] = new ModelRendererTurbo(this, 953, 17, textureX, textureY); // Box 13
		turretModel[44] = new ModelRendererTurbo(this, 985, 17, textureX, textureY); // Box 13
		turretModel[45] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 13
		turretModel[46] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 13
		turretModel[47] = new ModelRendererTurbo(this, 681, 33, textureX, textureY); // Box 13
		turretModel[48] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 13
		turretModel[49] = new ModelRendererTurbo(this, 81, 297, textureX, textureY); // Box 13
		turretModel[50] = new ModelRendererTurbo(this, 913, 193, textureX, textureY); // Box 13
		turretModel[51] = new ModelRendererTurbo(this, 705, 201, textureX, textureY); // Box 13
		turretModel[52] = new ModelRendererTurbo(this, 961, 193, textureX, textureY); // Box 13
		turretModel[53] = new ModelRendererTurbo(this, 121, 345, textureX, textureY); // Box 13
		turretModel[54] = new ModelRendererTurbo(this, 833, 337, textureX, textureY); // Box 13

		turretModel[0].addShapeBox(-12F, -2F, 1F, 6, 1, 18, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		turretModel[0].setRotationPoint(0F, -45F, 0F);

		turretModel[1].addShapeBox(-6F, -2F, 1F, 6, 1, 18, 0F,0F, 0F, -1F, -1F, 0F, -4F, -1F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 13
		turretModel[1].setRotationPoint(0F, -45F, 0F);

		turretModel[2].addShapeBox(-18F, -2F, 1F, 6, 1, 18, 0F,-1F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 13
		turretModel[2].setRotationPoint(0F, -45F, 0F);

		turretModel[3].addShapeBox(-18F, -2F, -19F, 6, 1, 18, 0F,-1F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 13
		turretModel[3].setRotationPoint(0F, -45F, 0F);

		turretModel[4].addShapeBox(-12F, -2F, -19F, 6, 1, 18, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		turretModel[4].setRotationPoint(0F, -45F, 0F);

		turretModel[5].addShapeBox(-6F, -2F, -19F, 6, 1, 18, 0F,0F, 0F, -1F, -1F, 0F, -4F, -1F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 13
		turretModel[5].setRotationPoint(0F, -45F, 0F);

		turretModel[6].addShapeBox(-14.25F, 0F, -22F, 1, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		turretModel[6].setRotationPoint(0F, -45F, 0F);

		turretModel[7].addShapeBox(-14.25F, 0F, 19F, 1, 7, 3, 0F,0F, 0F, 0F, 0F, 0.00F, 0F, 0.00F, 0F, 0F, 0.00F, 0.00F, 0F, 0F, 0F, 0F, 0F, 0.00F, 0F, 0.00F, 0F, 0F, 0.00F, 0.00F, 0F); // Box 13
		turretModel[7].setRotationPoint(0F, -45F, 0F);

		turretModel[8].addShapeBox(-32.5F, 0F, 17F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0.00F, 0F, 0.00F, 0F, 0F, -1.00F, 0.00F, 0F, 0F, 0F, 0F, 0F, 0.00F, 0F, 0.00F, 0F, 0F, -1.00F, 0.00F, 0F); // Box 13
		turretModel[8].setRotationPoint(0F, -45F, 0F);

		turretModel[9].addShapeBox(-32.5F, 0F, -18F, 1, 7, 1, 0F,-1.00F, 0.00F, 0F, 0.00F, 0F, 0F, 0F, 0.00F, 0F, 0F, 0F, 0F, -1.00F, 0.00F, 0F, 0.00F, 0F, 0F, 0F, 0.00F, 0F, 0F, 0F, 0F); // Box 13
		turretModel[9].setRotationPoint(0F, -45F, 0F);

		turretModel[10].addShapeBox(-32.5F, 0F, -17F, 1, 1, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		turretModel[10].setRotationPoint(0F, -39F, 0F);

		turretModel[11].addShapeBox(-32.5F, 0F, -17F, 1, 1, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		turretModel[11].setRotationPoint(0F, -42F, 0F);

		turretModel[12].addShapeBox(-32.5F, 0F, -17F, 1, 1, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		turretModel[12].setRotationPoint(0F, -45F, 0F);

		turretModel[13].addShapeBox(-27F, 0F, -24.5F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		turretModel[13].setRotationPoint(0F, -39F, 0F);
		turretModel[13].rotateAngleY = -0.2268928F;

		turretModel[14].addShapeBox(-27F, 0F, -24.5F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		turretModel[14].setRotationPoint(0F, -42F, 0F);
		turretModel[14].rotateAngleY = -0.2268928F;

		turretModel[15].addShapeBox(-27F, 0F, -24.5F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		turretModel[15].setRotationPoint(0F, -45F, 0F);
		turretModel[15].rotateAngleY = -0.2268928F;

		turretModel[16].addShapeBox(-30F, 1F, -14F, 14, 1, 28, 0F,0F, 4F, 3F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 4F, 3F, -6F, -1F, 2F, 0F, 0F, 7F, 0F, 0F, 7F, -6F, -1F, 2F); // Box 13
		turretModel[16].setRotationPoint(0F, -33F, 0F);

		turretModel[17].addShapeBox(-16F, 0F, -22F, 26, 1, 44, 0F,0F, 0F, 0F, 0F, 0F, 0.00F, 0F, 0F, 0.00F, 0F, 0F, 0F, 0.00F, 0F, -1F, 0.00F, 0F, -1F, 0.00F, 0F, -1F, 0.00F, 0F, -1F); // Box 13
		turretModel[17].setRotationPoint(0F, -32F, 0F);

		turretModel[18].addShapeBox(-16F, -1F, -22F, 26, 14, 17, 0F,0F, 0F, -2F, -9F, 0F, -1F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		turretModel[18].setRotationPoint(0F, -45F, 0F);

		turretModel[19].addShapeBox(2F, -1F, 5F, 22, 14, 16, 0F,1F, 0F, 0F, -14F, -1F, 0F, -14F, -1F, -8F, 1F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, -8F, 0F, 1F); // Box 13
		turretModel[19].setRotationPoint(0F, -45F, 0F);

		turretModel[20].addShapeBox(-30F, -1F, -21F, 14, 14, 42, 0F,-2F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -5F, 0F, -4F, -4F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -4F, -4F); // Box 13
		turretModel[20].setRotationPoint(0F, -45F, 0F);

		turretModel[21].addShapeBox(-9F, 14F, -19F, 18, 2, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		turretModel[21].setRotationPoint(0F, -46F, 0F);

		turretModel[22].addShapeBox(9F, 14F, -19F, 6, 2, 38, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 13
		turretModel[22].setRotationPoint(0F, -46F, 0F);

		turretModel[23].addShapeBox(15F, 14F, -15F, 4, 2, 30, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 13
		turretModel[23].setRotationPoint(0F, -46F, 0F);

		turretModel[24].addShapeBox(-15F, 14F, -19F, 6, 2, 38, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 13
		turretModel[24].setRotationPoint(0F, -46F, 0F);

		turretModel[25].addShapeBox(-19F, 14F, -15F, 4, 2, 30, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 13
		turretModel[25].setRotationPoint(0F, -46F, 0F);

		turretModel[26].addShapeBox(2F, -1F, -21F, 22, 14, 16, 0F,1F, 0F, 0F, -14F, -1F, -7F, -14F, -1F, 0F, 1F, 0F, 0F, -8F, 0F, 1F, 0F, 0F, -12F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 13
		turretModel[26].setRotationPoint(0F, -45F, 0F);

		turretModel[27].addShapeBox(10F, 1F, -22F, 14, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -13F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 13
		turretModel[27].setRotationPoint(0F, -33F, 0F);

		turretModel[28].addShapeBox(10F, 1F, 5F, 14, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -13F, 0F, 0F, -1F); // Box 13
		turretModel[28].setRotationPoint(0F, -33F, 0F);

		turretModel[29].addShapeBox(-27F, 0F, 23.5F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		turretModel[29].setRotationPoint(0F, -45F, 0F);
		turretModel[29].rotateAngleY = 0.2268928F;

		turretModel[30].addShapeBox(-27F, 0F, 23.5F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		turretModel[30].setRotationPoint(0F, -42F, 0F);
		turretModel[30].rotateAngleY = 0.2268928F;

		turretModel[31].addShapeBox(-27F, 0F, 23.5F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		turretModel[31].setRotationPoint(0F, -39F, 0F);
		turretModel[31].rotateAngleY = 0.2268928F;

		turretModel[32].addShapeBox(1F, -1F, -5F, 23, 14, 2, 0F,0F, 0F, 0F, -14F, -1F, 0F, -14F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		turretModel[32].setRotationPoint(0F, -45F, 0F);

		turretModel[33].addShapeBox(2F, 13F, -5F, 22, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 13
		turretModel[33].setRotationPoint(0F, -45F, 0F);

		turretModel[34].addShapeBox(-20F, -40F, 11.5F, 1, 40, 1, 0F,3.65F, 0F, -0.35F, -4.35F, 0F, -0.35F, -4.35F, 0F, -0.35F, 3.65F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F); // Box 13
		turretModel[34].setRotationPoint(0F, -45F, 0F);

		turretModel[35].addShapeBox(14F, 16.5F, 2.5F, 3, 1, 1, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, 1F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, 1F, 0F, 0.25F, 0.25F); // Box 13
		turretModel[35].setRotationPoint(0F, -45F, 0F);
		turretModel[35].rotateAngleY = -0.78539816F;
		turretModel[35].rotateAngleZ = 0.52359878F;

		turretModel[36].addShapeBox(14F, 19F, 2.5F, 3, 1, 1, 0F,0F, 0.25F, 0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0.75F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.75F, -0.25F, -0.5F, 0.75F, 0.75F, 0F, 0.25F, 0.25F); // Box 13
		turretModel[36].setRotationPoint(0F, -45F, 0F);
		turretModel[36].rotateAngleY = -0.78539816F;
		turretModel[36].rotateAngleZ = 0.52359878F;

		turretModel[37].addShapeBox(14F, 14F, 2.5F, 3, 1, 1, 0F,0F, 0.25F, 0.25F, 0F, 0.75F, -0.25F, -0.5F, 0.75F, 0.75F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0.75F, 0F, 0.25F, 0.25F); // Box 13
		turretModel[37].setRotationPoint(0F, -45F, 0F);
		turretModel[37].rotateAngleY = -0.78539816F;
		turretModel[37].rotateAngleZ = 0.52359878F;

		turretModel[38].addShapeBox(14F, 14F, 0.5F, 3, 1, 1, 0F,0F, 0.25F, 0.25F, -0.5F, 0.75F, 0.75F, 0F, 0.75F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.5F, -0.25F, 0.75F, 0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F); // Box 13
		turretModel[38].setRotationPoint(0F, -45F, 0F);
		turretModel[38].rotateAngleY = -0.78539816F;
		turretModel[38].rotateAngleZ = 0.52359878F;

		turretModel[39].addShapeBox(14F, 16.5F, 0.5F, 3, 1, 1, 0F,0F, 0.25F, 0.25F, -0.5F, 0.25F, 1F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.5F, 0.25F, 1F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0.25F); // Box 13
		turretModel[39].setRotationPoint(0F, -45F, 0F);
		turretModel[39].rotateAngleY = -0.78539816F;
		turretModel[39].rotateAngleZ = 0.52359878F;

		turretModel[40].addShapeBox(14F, 19F, 0.5F, 3, 1, 1, 0F,0F, 0.25F, 0.25F, -0.5F, -0.25F, 0.75F, 0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.5F, 0.75F, 0.75F, 0F, 0.75F, -0.25F, 0F, 0.25F, 0.25F); // Box 13
		turretModel[40].setRotationPoint(0F, -45F, 0F);
		turretModel[40].rotateAngleY = -0.78539816F;
		turretModel[40].rotateAngleZ = 0.52359878F;

		turretModel[41].addShapeBox(13.5F, 13F, -0.5F, 1, 8, 5, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 13
		turretModel[41].setRotationPoint(0F, -45F, 0F);
		turretModel[41].rotateAngleY = -0.78539816F;
		turretModel[41].rotateAngleZ = 0.52359878F;

		turretModel[42].addShapeBox(13.5F, 13F, -4.5F, 1, 8, 5, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 13
		turretModel[42].setRotationPoint(0F, -45F, 0F);
		turretModel[42].rotateAngleY = 0.78539816F;
		turretModel[42].rotateAngleZ = 0.52359878F;

		turretModel[43].addShapeBox(14F, 14F, -1.5F, 3, 1, 1, 0F,0F, 0.25F, 0.25F, 0F, 0.75F, -0.25F, -0.5F, 0.75F, 0.75F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0.75F, 0F, 0.25F, 0.25F); // Box 13
		turretModel[43].setRotationPoint(0F, -45F, 0F);
		turretModel[43].rotateAngleY = 0.78539816F;
		turretModel[43].rotateAngleZ = 0.52359878F;

		turretModel[44].addShapeBox(14F, 16.5F, -1.5F, 3, 1, 1, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, 1F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, 1F, 0F, 0.25F, 0.25F); // Box 13
		turretModel[44].setRotationPoint(0F, -45F, 0F);
		turretModel[44].rotateAngleY = 0.78539816F;
		turretModel[44].rotateAngleZ = 0.52359878F;

		turretModel[45].addShapeBox(14F, 19F, -1.5F, 3, 1, 1, 0F,0F, 0.25F, 0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0.75F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.75F, -0.25F, -0.5F, 0.75F, 0.75F, 0F, 0.25F, 0.25F); // Box 13
		turretModel[45].setRotationPoint(0F, -45F, 0F);
		turretModel[45].rotateAngleY = 0.78539816F;
		turretModel[45].rotateAngleZ = 0.52359878F;

		turretModel[46].addShapeBox(14F, 19F, -3.5F, 3, 1, 1, 0F,0F, 0.25F, 0.25F, -0.5F, -0.25F, 0.75F, 0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.5F, 0.75F, 0.75F, 0F, 0.75F, -0.25F, 0F, 0.25F, 0.25F); // Box 13
		turretModel[46].setRotationPoint(0F, -45F, 0F);
		turretModel[46].rotateAngleY = 0.78539816F;
		turretModel[46].rotateAngleZ = 0.52359878F;

		turretModel[47].addShapeBox(14F, 16.5F, -3.5F, 3, 1, 1, 0F,0F, 0.25F, 0.25F, -0.5F, 0.25F, 1F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.5F, 0.25F, 1F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0.25F); // Box 13
		turretModel[47].setRotationPoint(0F, -45F, 0F);
		turretModel[47].rotateAngleY = 0.78539816F;
		turretModel[47].rotateAngleZ = 0.52359878F;

		turretModel[48].addShapeBox(14F, 14F, -3.5F, 3, 1, 1, 0F,0F, 0.25F, 0.25F, -0.5F, 0.75F, 0.75F, 0F, 0.75F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.5F, -0.25F, 0.75F, 0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F); // Box 13
		turretModel[48].setRotationPoint(0F, -45F, 0F);
		turretModel[48].rotateAngleY = 0.78539816F;
		turretModel[48].rotateAngleZ = 0.52359878F;

		turretModel[49].addShapeBox(1F, -1F, 3F, 23, 14, 2, 0F,0F, 0F, 0F, -14F, -1F, 0F, -14F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		turretModel[49].setRotationPoint(0F, -45F, 0F);

		turretModel[50].addShapeBox(1F, -1F, -3F, 9, 5, 6, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.25F, 0F, 0F, 4.25F, 0F, 0F, 0F, 0F, 0F); // Box 13
		turretModel[50].setRotationPoint(0F, -45F, 0F);

		turretModel[51].addShapeBox(1F, 10F, -3F, 20, 3, 6, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 13
		turretModel[51].setRotationPoint(0F, -45F, 0F);

		turretModel[52].addShapeBox(-12F, -3F, -3F, 12, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		turretModel[52].setRotationPoint(13F, -38F, 0F);

		turretModel[53].addShapeBox(-16F, -1F, 5F, 26, 14, 17, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		turretModel[53].setRotationPoint(0F, -45F, 0F);

		turretModel[54].addShapeBox(-16F, -1F, -5F, 17, 14, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		turretModel[54].setRotationPoint(0F, -45F, 0F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 13
		barrelModel[1] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 13
		barrelModel[2] = new ModelRendererTurbo(this, 865, 201, textureX, textureY); // Box 13
		barrelModel[3] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 13
		barrelModel[4] = new ModelRendererTurbo(this, 737, 129, textureX, textureY); // Box 13
		barrelModel[5] = new ModelRendererTurbo(this, 201, 225, textureX, textureY); // Box 13
		barrelModel[6] = new ModelRendererTurbo(this, 785, 129, textureX, textureY); // Box 13
		barrelModel[7] = new ModelRendererTurbo(this, 937, 137, textureX, textureY); // Box 13
		barrelModel[8] = new ModelRendererTurbo(this, 593, 193, textureX, textureY); // Box 13
		barrelModel[9] = new ModelRendererTurbo(this, 201, 209, textureX, textureY); // Box 13
		barrelModel[10] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 13
		barrelModel[11] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 13
		barrelModel[12] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 13
		barrelModel[13] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 13
		barrelModel[14] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 13
		barrelModel[15] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 13
		barrelModel[16] = new ModelRendererTurbo(this, 761, 41, textureX, textureY); // Box 13
		barrelModel[17] = new ModelRendererTurbo(this, 801, 41, textureX, textureY); // Box 13
		barrelModel[18] = new ModelRendererTurbo(this, 361, 209, textureX, textureY); // Box 13
		barrelModel[19] = new ModelRendererTurbo(this, 961, 209, textureX, textureY); // Box 13
		barrelModel[20] = new ModelRendererTurbo(this, 905, 41, textureX, textureY); // Box 13
		barrelModel[21] = new ModelRendererTurbo(this, 929, 41, textureX, textureY); // Box 13
		barrelModel[22] = new ModelRendererTurbo(this, 953, 41, textureX, textureY); // Box 13
		barrelModel[23] = new ModelRendererTurbo(this, 977, 41, textureX, textureY); // Box 13
		barrelModel[24] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 13
		barrelModel[25] = new ModelRendererTurbo(this, 577, 49, textureX, textureY); // Box 13
		barrelModel[26] = new ModelRendererTurbo(this, 105, 225, textureX, textureY); // Box 13
		barrelModel[27] = new ModelRendererTurbo(this, 617, 49, textureX, textureY); // Box 13
		barrelModel[28] = new ModelRendererTurbo(this, 697, 49, textureX, textureY); // Box 13
		barrelModel[29] = new ModelRendererTurbo(this, 1017, 17, textureX, textureY); // Box 13
		barrelModel[30] = new ModelRendererTurbo(this, 361, 145, textureX, textureY); // Box 13
		barrelModel[31] = new ModelRendererTurbo(this, 865, 153, textureX, textureY); // Box 13
		barrelModel[32] = new ModelRendererTurbo(this, 977, 153, textureX, textureY); // Box 13
		barrelModel[33] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 13
		barrelModel[34] = new ModelRendererTurbo(this, 681, 97, textureX, textureY); // Box 13
		barrelModel[35] = new ModelRendererTurbo(this, 297, 257, textureX, textureY); // Box 13
		barrelModel[36] = new ModelRendererTurbo(this, 753, 257, textureX, textureY); // Box 13
		barrelModel[37] = new ModelRendererTurbo(this, 817, 257, textureX, textureY); // Box 13
		barrelModel[38] = new ModelRendererTurbo(this, 297, 265, textureX, textureY); // Box 13
		barrelModel[39] = new ModelRendererTurbo(this, 361, 257, textureX, textureY); // Box 13
		barrelModel[40] = new ModelRendererTurbo(this, 969, 257, textureX, textureY); // Box 13
		barrelModel[41] = new ModelRendererTurbo(this, 801, 265, textureX, textureY); // Box 13
		barrelModel[42] = new ModelRendererTurbo(this, 849, 265, textureX, textureY); // Box 13
		barrelModel[43] = new ModelRendererTurbo(this, 529, 9, textureX, textureY); // Box 13
		barrelModel[44] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 13
		barrelModel[45] = new ModelRendererTurbo(this, 561, 33, textureX, textureY); // Box 13
		barrelModel[46] = new ModelRendererTurbo(this, 577, 33, textureX, textureY); // Box 13
		barrelModel[47] = new ModelRendererTurbo(this, 801, 17, textureX, textureY); // Box 13
		barrelModel[48] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 13
		barrelModel[49] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 13
		barrelModel[50] = new ModelRendererTurbo(this, 609, 33, textureX, textureY); // Box 13
		barrelModel[51] = new ModelRendererTurbo(this, 649, 33, textureX, textureY); // Box 13
		barrelModel[52] = new ModelRendererTurbo(this, 1017, 33, textureX, textureY); // Box 13
		barrelModel[53] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 13
		barrelModel[54] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 13
		barrelModel[55] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 13
		barrelModel[56] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 13
		barrelModel[57] = new ModelRendererTurbo(this, 745, 41, textureX, textureY); // Box 13
		barrelModel[58] = new ModelRendererTurbo(this, 849, 41, textureX, textureY); // Box 13
		barrelModel[59] = new ModelRendererTurbo(this, 889, 41, textureX, textureY); // Box 13
		barrelModel[60] = new ModelRendererTurbo(this, 561, 49, textureX, textureY); // Box 13
		barrelModel[61] = new ModelRendererTurbo(this, 681, 41, textureX, textureY); // Box 13
		barrelModel[62] = new ModelRendererTurbo(this, 665, 49, textureX, textureY); // Box 13
		barrelModel[63] = new ModelRendererTurbo(this, 1017, 49, textureX, textureY); // Box 13
		barrelModel[64] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 13
		barrelModel[65] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 13
		barrelModel[66] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 13
		barrelModel[67] = new ModelRendererTurbo(this, 521, 169, textureX, textureY); // Box 13
		barrelModel[68] = new ModelRendererTurbo(this, 993, 169, textureX, textureY); // Box 13
		barrelModel[69] = new ModelRendererTurbo(this, 521, 185, textureX, textureY); // Box 13
		barrelModel[70] = new ModelRendererTurbo(this, 393, 193, textureX, textureY); // Box 13
		barrelModel[71] = new ModelRendererTurbo(this, 921, 169, textureX, textureY); // Box 13
		barrelModel[72] = new ModelRendererTurbo(this, 713, 193, textureX, textureY); // Box 13
		barrelModel[73] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 13
		barrelModel[74] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 13

		barrelModel[0].addShapeBox(59F, 0.5F, -2.5F, 1, 2, 5, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -2F, 0F, -0.75F, -2F, 0F, -0.75F, -2F, 0F, -0.75F, -2F); // Box 13
		barrelModel[0].setRotationPoint(14F, -38F, 0F);

		barrelModel[1].addShapeBox(59F, -0.5F, -2.5F, 1, 1, 5, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 13
		barrelModel[1].setRotationPoint(14F, -38F, 0F);

		barrelModel[2].addShapeBox(-7.5F, -4.5F, 24F, 18, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		barrelModel[2].setRotationPoint(-8F, -37F, 0F);

		barrelModel[3].addShapeBox(10.5F, -4.5F, 24F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 13
		barrelModel[3].setRotationPoint(-8F, -37F, 0F);

		barrelModel[4].addShapeBox(-1.5F, -0.5F, 21F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		barrelModel[4].setRotationPoint(-8F, -37F, 0F);

		barrelModel[5].addShapeBox(8F, -1F, -1F, 54, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 13
		barrelModel[5].setRotationPoint(14F, -38F, 0F);

		barrelModel[6].addShapeBox(-1.5F, -1.5F, 21F, 3, 1, 6, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		barrelModel[6].setRotationPoint(-8F, -37F, 0F);

		barrelModel[7].addShapeBox(-1.5F, 0.5F, 21F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 13
		barrelModel[7].setRotationPoint(-8F, -37F, 0F);

		barrelModel[8].addShapeBox(-7.5F, -5.5F, 24F, 18, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		barrelModel[8].setRotationPoint(-8F, -37F, 0F);

		barrelModel[9].addShapeBox(-7.5F, -2.5F, 24F, 18, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 13
		barrelModel[9].setRotationPoint(-8F, -37F, 0F);

		barrelModel[10].addShapeBox(10.5F, -5.5F, 24F, 2, 1, 4, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 13
		barrelModel[10].setRotationPoint(-8F, -37F, 0F);

		barrelModel[11].addShapeBox(10.5F, -2.5F, 24F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Box 13
		barrelModel[11].setRotationPoint(-8F, -37F, 0F);

		barrelModel[12].addShapeBox(12.5F, -4.5F, 25F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		barrelModel[12].setRotationPoint(-8F, -37F, 0F);

		barrelModel[13].addShapeBox(14.5F, -4.5F, 25F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 13
		barrelModel[13].setRotationPoint(-8F, -37F, 0F);

		barrelModel[14].addShapeBox(-7.5F, -7.5F, 27F, 3, 3, 1, 0F,0F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, -1F, 1.5F, 0F, -1F, 1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		barrelModel[14].setRotationPoint(-8F, -37F, 0F);

		barrelModel[15].addShapeBox(-7.5F, -7.5F, 24F, 3, 3, 1, 0F,0F, -1F, 1.5F, -2F, -1F, 1.5F, -2F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 13
		barrelModel[15].setRotationPoint(-8F, -37F, 0F);

		barrelModel[16].addShapeBox(-7.5F, -2.5F, 24F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1.5F, -2F, -1F, 1.5F, -2F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 13
		barrelModel[16].setRotationPoint(-8F, -37F, 0F);

		barrelModel[17].addShapeBox(-7.5F, -2.5F, 27F, 3, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, -1F, 1.5F, 0F, -1F, 1.5F); // Box 13
		barrelModel[17].setRotationPoint(-8F, -37F, 0F);

		barrelModel[18].addShapeBox(-7.5F, -4.5F, -28F, 18, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		barrelModel[18].setRotationPoint(-8F, -37F, 0F);

		barrelModel[19].addShapeBox(-7.5F, -5.5F, -28F, 18, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		barrelModel[19].setRotationPoint(-8F, -37F, 0F);

		barrelModel[20].addShapeBox(-7.5F, -7.5F, -25F, 3, 3, 1, 0F,0F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, -1F, 1.5F, 0F, -1F, 1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		barrelModel[20].setRotationPoint(-8F, -37F, 0F);

		barrelModel[21].addShapeBox(-7.5F, -7.5F, -28F, 3, 3, 1, 0F,0F, -1F, 1.5F, -2F, -1F, 1.5F, -2F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 13
		barrelModel[21].setRotationPoint(-8F, -37F, 0F);

		barrelModel[22].addShapeBox(-7.5F, -2.5F, -25F, 3, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, -1F, 1.5F, 0F, -1F, 1.5F); // Box 13
		barrelModel[22].setRotationPoint(-8F, -37F, 0F);

		barrelModel[23].addShapeBox(-7.5F, -2.5F, -28F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1.5F, -2F, -1F, 1.5F, -2F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 13
		barrelModel[23].setRotationPoint(-8F, -37F, 0F);

		barrelModel[24].addShapeBox(10.5F, -4.5F, -28F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 13
		barrelModel[24].setRotationPoint(-8F, -37F, 0F);

		barrelModel[25].addShapeBox(10.5F, -2.5F, -28F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Box 13
		barrelModel[25].setRotationPoint(-8F, -37F, 0F);

		barrelModel[26].addShapeBox(-7.5F, -2.5F, -28F, 18, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 13
		barrelModel[26].setRotationPoint(-8F, -37F, 0F);

		barrelModel[27].addShapeBox(10.5F, -5.5F, -28F, 2, 1, 4, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 13
		barrelModel[27].setRotationPoint(-8F, -37F, 0F);

		barrelModel[28].addShapeBox(12.5F, -4.5F, -27F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		barrelModel[28].setRotationPoint(-8F, -37F, 0F);

		barrelModel[29].addShapeBox(14.5F, -4.5F, -27F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 13
		barrelModel[29].setRotationPoint(-8F, -37F, 0F);

		barrelModel[30].addShapeBox(-1.5F, -1.5F, -27F, 3, 1, 6, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		barrelModel[30].setRotationPoint(-8F, -37F, 0F);

		barrelModel[31].addShapeBox(-1.5F, -0.5F, -27F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		barrelModel[31].setRotationPoint(-8F, -37F, 0F);

		barrelModel[32].addShapeBox(-1.5F, 0.5F, -27F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 13
		barrelModel[32].setRotationPoint(-8F, -37F, 0F);

		barrelModel[33].addShapeBox(-2.5F, -1.5F, -27F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		barrelModel[33].setRotationPoint(-8F, -37F, 0F);

		barrelModel[34].addShapeBox(-2.5F, -1.5F, 25F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		barrelModel[34].setRotationPoint(-8F, -37F, 0F);

		barrelModel[35].addShapeBox(8F, -2.25F, -0.5F, 30, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 13
		barrelModel[35].setRotationPoint(14F, -38F, 0F);

		barrelModel[36].addShapeBox(8F, 1.25F, -0.5F, 30, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 13
		barrelModel[36].setRotationPoint(14F, -38F, 0F);

		barrelModel[37].addShapeBox(8F, -0.5F, 1.25F, 30, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 13
		barrelModel[37].setRotationPoint(14F, -38F, 0F);

		barrelModel[38].addShapeBox(8F, -0.5F, -2.25F, 30, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 13
		barrelModel[38].setRotationPoint(14F, -38F, 0F);

		barrelModel[39].addShapeBox(39F, -1.75F, -0.5F, 20, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 13
		barrelModel[39].setRotationPoint(14F, -38F, 0F);

		barrelModel[40].addShapeBox(39F, 0.75F, -0.5F, 20, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 13
		barrelModel[40].setRotationPoint(14F, -38F, 0F);

		barrelModel[41].addShapeBox(39F, -0.5F, 0.75F, 20, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 13
		barrelModel[41].setRotationPoint(14F, -38F, 0F);

		barrelModel[42].addShapeBox(39F, -0.5F, -1.75F, 20, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 13
		barrelModel[42].setRotationPoint(14F, -38F, 0F);

		barrelModel[43].addShapeBox(59F, -2.5F, -2.5F, 1, 2, 5, 0F,0F, -0.75F, -2F, 0F, -0.75F, -2F, 0F, -0.75F, -2F, 0F, -0.75F, -2F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 13
		barrelModel[43].setRotationPoint(14F, -38F, 0F);

		barrelModel[44].addShapeBox(16F, -1F, -1F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		barrelModel[44].setRotationPoint(14F, -38F, 0F);

		barrelModel[45].addShapeBox(32F, -1F, -1F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		barrelModel[45].setRotationPoint(14F, -38F, 0F);

		barrelModel[46].addShapeBox(24F, -1F, -1F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		barrelModel[46].setRotationPoint(14F, -38F, 0F);

		barrelModel[47].addShapeBox(24F, -2F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		barrelModel[47].setRotationPoint(14F, -38F, 0F);

		barrelModel[48].addShapeBox(24F, 1F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 13
		barrelModel[48].setRotationPoint(14F, -38F, 0F);

		barrelModel[49].addShapeBox(24F, -0.5F, 1F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 13
		barrelModel[49].setRotationPoint(14F, -38F, 0F);

		barrelModel[50].addShapeBox(24F, -0.5F, -2F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		barrelModel[50].setRotationPoint(14F, -38F, 0F);

		barrelModel[51].addShapeBox(16F, -2F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		barrelModel[51].setRotationPoint(14F, -38F, 0F);

		barrelModel[52].addShapeBox(16F, -0.5F, 1F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 13
		barrelModel[52].setRotationPoint(14F, -38F, 0F);

		barrelModel[53].addShapeBox(16F, 1F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 13
		barrelModel[53].setRotationPoint(14F, -38F, 0F);

		barrelModel[54].addShapeBox(16F, -0.5F, -2F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		barrelModel[54].setRotationPoint(14F, -38F, 0F);

		barrelModel[55].addShapeBox(32F, -2F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		barrelModel[55].setRotationPoint(14F, -38F, 0F);

		barrelModel[56].addShapeBox(32F, -0.5F, 1F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 13
		barrelModel[56].setRotationPoint(14F, -38F, 0F);

		barrelModel[57].addShapeBox(32F, 1F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 13
		barrelModel[57].setRotationPoint(14F, -38F, 0F);

		barrelModel[58].addShapeBox(32F, -0.5F, -2F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		barrelModel[58].setRotationPoint(14F, -38F, 0F);

		barrelModel[59].addShapeBox(38F, -2F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		barrelModel[59].setRotationPoint(14F, -38F, 0F);

		barrelModel[60].addShapeBox(38F, -0.5F, 1F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F); // Box 13
		barrelModel[60].setRotationPoint(14F, -38F, 0F);

		barrelModel[61].addShapeBox(38F, -1F, -1F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		barrelModel[61].setRotationPoint(14F, -38F, 0F);

		barrelModel[62].addShapeBox(38F, -0.5F, -2F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		barrelModel[62].setRotationPoint(14F, -38F, 0F);

		barrelModel[63].addShapeBox(38F, 1F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F); // Box 13
		barrelModel[63].setRotationPoint(14F, -38F, 0F);

		barrelModel[64].addShapeBox(48F, -1F, -1F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		barrelModel[64].setRotationPoint(14F, -38F, 0F);

		barrelModel[65].addShapeBox(48F, -2F, -0.5F, 1, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		barrelModel[65].setRotationPoint(14F, -38F, 0F);

		barrelModel[66].addShapeBox(48F, -0.5F, 1F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 13
		barrelModel[66].setRotationPoint(14F, -38F, 0F);

		barrelModel[67].addShapeBox(-1F, -3F, -3F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 13
		barrelModel[67].setRotationPoint(14F, -38F, 0F);

		barrelModel[68].addShapeBox(5F, -2F, -3F, 5, 2, 6, 0F,0F, 0.75F, -1F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0.75F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F); // Box 13
		barrelModel[68].setRotationPoint(14F, -38F, 0F);

		barrelModel[69].addShapeBox(5F, 0F, -3F, 5, 2, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0.75F, -1F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0.75F, -1F); // Box 13
		barrelModel[69].setRotationPoint(14F, -38F, 0F);

		barrelModel[70].addShapeBox(-1F, 0F, -3F, 6, 3, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0F, 0F); // Box 13
		barrelModel[70].setRotationPoint(14F, -38F, 0F);

		barrelModel[71].addShapeBox(5F, -0.5F, -3F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 13
		barrelModel[71].setRotationPoint(14F, -38F, 0F);

		barrelModel[72].addShapeBox(-1F, -0.5F, -3F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		barrelModel[72].setRotationPoint(14F, -38F, 0F);

		barrelModel[73].addShapeBox(48F, 1F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 13
		barrelModel[73].setRotationPoint(14F, -38F, 0F);

		barrelModel[74].addShapeBox(48F, -0.5F, -2F, 1, 1, 1, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		barrelModel[74].setRotationPoint(14F, -38F, 0F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 801, 17, textureX, textureY); // Box 13
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 841, 17, textureX, textureY); // Box 13
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 865, 17, textureX, textureY); // Box 13
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 889, 17, textureX, textureY); // Box 13
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 913, 17, textureX, textureY); // Box 13
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 937, 17, textureX, textureY); // Box 13
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 961, 17, textureX, textureY); // Box 13
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 993, 17, textureX, textureY); // Box 13
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 13
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 13
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 13
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 13
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 13
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 13
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 561, 33, textureX, textureY); // Box 13
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 609, 33, textureX, textureY); // Box 13
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 649, 33, textureX, textureY); // Box 13
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 689, 33, textureX, textureY); // Box 13
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 13
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 13
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 13
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 13
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 13
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 13
		leftTrackWheelModels[24] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 13
		leftTrackWheelModels[25] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 13
		leftTrackWheelModels[26] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 13
		leftTrackWheelModels[27] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 13
		leftTrackWheelModels[28] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 13
		leftTrackWheelModels[29] = new ModelRendererTurbo(this, 745, 41, textureX, textureY); // Box 13
		leftTrackWheelModels[30] = new ModelRendererTurbo(this, 769, 41, textureX, textureY); // Box 13
		leftTrackWheelModels[31] = new ModelRendererTurbo(this, 809, 41, textureX, textureY); // Box 13
		leftTrackWheelModels[32] = new ModelRendererTurbo(this, 849, 41, textureX, textureY); // Box 13
		leftTrackWheelModels[33] = new ModelRendererTurbo(this, 889, 41, textureX, textureY); // Box 13
		leftTrackWheelModels[34] = new ModelRendererTurbo(this, 913, 41, textureX, textureY); // Box 13
		leftTrackWheelModels[35] = new ModelRendererTurbo(this, 937, 41, textureX, textureY); // Box 13
		leftTrackWheelModels[36] = new ModelRendererTurbo(this, 961, 41, textureX, textureY); // Box 13
		leftTrackWheelModels[37] = new ModelRendererTurbo(this, 985, 41, textureX, textureY); // Box 13
		leftTrackWheelModels[38] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 13
		leftTrackWheelModels[39] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 13
		leftTrackWheelModels[40] = new ModelRendererTurbo(this, 561, 49, textureX, textureY); // Box 13
		leftTrackWheelModels[41] = new ModelRendererTurbo(this, 585, 49, textureX, textureY); // Box 13
		leftTrackWheelModels[42] = new ModelRendererTurbo(this, 625, 49, textureX, textureY); // Box 13
		leftTrackWheelModels[43] = new ModelRendererTurbo(this, 665, 49, textureX, textureY); // Box 13
		leftTrackWheelModels[44] = new ModelRendererTurbo(this, 1001, 49, textureX, textureY); // Box 13
		leftTrackWheelModels[45] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 13
		leftTrackWheelModels[46] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 13
		leftTrackWheelModels[47] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 13
		leftTrackWheelModels[48] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 13
		leftTrackWheelModels[49] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 13
		leftTrackWheelModels[50] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 13
		leftTrackWheelModels[51] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 13
		leftTrackWheelModels[52] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 13
		leftTrackWheelModels[53] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 13
		leftTrackWheelModels[54] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 13
		leftTrackWheelModels[55] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 13
		leftTrackWheelModels[56] = new ModelRendererTurbo(this, 745, 57, textureX, textureY); // Box 13
		leftTrackWheelModels[57] = new ModelRendererTurbo(this, 769, 57, textureX, textureY); // Box 13
		leftTrackWheelModels[58] = new ModelRendererTurbo(this, 793, 57, textureX, textureY); // Box 13
		leftTrackWheelModels[59] = new ModelRendererTurbo(this, 817, 57, textureX, textureY); // Box 13
		leftTrackWheelModels[60] = new ModelRendererTurbo(this, 841, 57, textureX, textureY); // Box 13
		leftTrackWheelModels[61] = new ModelRendererTurbo(this, 865, 57, textureX, textureY); // Box 13
		leftTrackWheelModels[62] = new ModelRendererTurbo(this, 889, 57, textureX, textureY); // Box 13
		leftTrackWheelModels[63] = new ModelRendererTurbo(this, 913, 57, textureX, textureY); // Box 13
		leftTrackWheelModels[64] = new ModelRendererTurbo(this, 953, 57, textureX, textureY); // Box 13
		leftTrackWheelModels[65] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 13
		leftTrackWheelModels[66] = new ModelRendererTurbo(this, 561, 65, textureX, textureY); // Box 13
		leftTrackWheelModels[67] = new ModelRendererTurbo(this, 585, 65, textureX, textureY); // Box 13
		leftTrackWheelModels[68] = new ModelRendererTurbo(this, 609, 65, textureX, textureY); // Box 13
		leftTrackWheelModels[69] = new ModelRendererTurbo(this, 633, 65, textureX, textureY); // Box 13
		leftTrackWheelModels[70] = new ModelRendererTurbo(this, 657, 65, textureX, textureY); // Box 13
		leftTrackWheelModels[71] = new ModelRendererTurbo(this, 681, 65, textureX, textureY); // Box 13
		leftTrackWheelModels[72] = new ModelRendererTurbo(this, 985, 65, textureX, textureY); // Box 13
		leftTrackWheelModels[73] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 13
		leftTrackWheelModels[74] = new ModelRendererTurbo(this, 377, 137, textureX, textureY); // Box 13
		leftTrackWheelModels[75] = new ModelRendererTurbo(this, 961, 129, textureX, textureY); // Box 13
		leftTrackWheelModels[76] = new ModelRendererTurbo(this, 1001, 129, textureX, textureY); // Box 13
		leftTrackWheelModels[77] = new ModelRendererTurbo(this, 865, 137, textureX, textureY); // Box 13
		leftTrackWheelModels[78] = new ModelRendererTurbo(this, 889, 137, textureX, textureY); // Box 13
		leftTrackWheelModels[79] = new ModelRendererTurbo(this, 913, 137, textureX, textureY); // Box 13
		leftTrackWheelModels[80] = new ModelRendererTurbo(this, 753, 145, textureX, textureY); // Box 13
		leftTrackWheelModels[81] = new ModelRendererTurbo(this, 361, 153, textureX, textureY); // Box 13
		leftTrackWheelModels[82] = new ModelRendererTurbo(this, 393, 153, textureX, textureY); // Box 13
		leftTrackWheelModels[83] = new ModelRendererTurbo(this, 1001, 145, textureX, textureY); // Box 13
		leftTrackWheelModels[84] = new ModelRendererTurbo(this, 521, 153, textureX, textureY); // Box 13
		leftTrackWheelModels[85] = new ModelRendererTurbo(this, 545, 153, textureX, textureY); // Box 13
		leftTrackWheelModels[86] = new ModelRendererTurbo(this, 569, 153, textureX, textureY); // Box 13
		leftTrackWheelModels[87] = new ModelRendererTurbo(this, 593, 153, textureX, textureY); // Box 13
		leftTrackWheelModels[88] = new ModelRendererTurbo(this, 617, 153, textureX, textureY); // Box 13
		leftTrackWheelModels[89] = new ModelRendererTurbo(this, 641, 153, textureX, textureY); // Box 13
		leftTrackWheelModels[90] = new ModelRendererTurbo(this, 665, 153, textureX, textureY); // Box 13

		leftTrackWheelModels[0].addShapeBox(-5F, -2F, -6F, 10, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[0].setRotationPoint(62F, 6F, 35F);

		leftTrackWheelModels[1].addShapeBox(-2F, -6F, -6F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[1].setRotationPoint(62F, 6F, 35F);

		leftTrackWheelModels[2].addShapeBox(5F, -2F, -6F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[2].setRotationPoint(62F, 6F, 35F);

		leftTrackWheelModels[3].addShapeBox(-6F, -2F, -6F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[3].setRotationPoint(62F, 6F, 35F);

		leftTrackWheelModels[4].addShapeBox(-6F, -6F, -6F, 1, 4, 7, 0F,-4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[4].setRotationPoint(62F, 6F, 35F);

		leftTrackWheelModels[5].addShapeBox(5F, -6F, -6F, 1, 4, 7, 0F,3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[5].setRotationPoint(62F, 6F, 35F);

		leftTrackWheelModels[6].addShapeBox(-4F, -2F, -7F, 8, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[6].setRotationPoint(82F, -2.5F, 37F);

		leftTrackWheelModels[7].addShapeBox(-4F, 2F, -7F, 8, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 13
		leftTrackWheelModels[7].setRotationPoint(82F, -2.5F, 37F);

		leftTrackWheelModels[8].addShapeBox(-4F, -4F, -7F, 8, 2, 6, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[8].setRotationPoint(82F, -2.5F, 37F);

		leftTrackWheelModels[9].addShapeBox(-5F, -2F, -5F, 10, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[9].setRotationPoint(-53F, -1F, 35F);

		leftTrackWheelModels[10].addShapeBox(-5F, 2F, -5F, 10, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 13
		leftTrackWheelModels[10].setRotationPoint(-53F, -1F, 35F);

		leftTrackWheelModels[11].addShapeBox(5F, 2F, -6F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F); // Box 13
		leftTrackWheelModels[11].setRotationPoint(-53F, -1F, 35F);

		leftTrackWheelModels[12].addShapeBox(-2F, 5F, -6F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[12].setRotationPoint(-53F, -1F, 35F);

		leftTrackWheelModels[13].addShapeBox(-6F, 2F, -6F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F); // Box 13
		leftTrackWheelModels[13].setRotationPoint(-53F, -1F, 35F);

		leftTrackWheelModels[14].addShapeBox(-2F, 5F, -6F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[14].setRotationPoint(62F, 6F, 35F);

		leftTrackWheelModels[15].addShapeBox(-5F, -5F, -6F, 10, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[15].setRotationPoint(62F, 6F, 35F);

		leftTrackWheelModels[16].addShapeBox(-5F, 2F, -6F, 10, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 13
		leftTrackWheelModels[16].setRotationPoint(62F, 6F, 35F);

		leftTrackWheelModels[17].addShapeBox(5F, 2F, -6F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F); // Box 13
		leftTrackWheelModels[17].setRotationPoint(62F, 6F, 35F);

		leftTrackWheelModels[18].addShapeBox(-6F, 2F, -6F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F); // Box 13
		leftTrackWheelModels[18].setRotationPoint(62F, 6F, 35F);

		leftTrackWheelModels[19].addShapeBox(-5F, -2F, -6F, 10, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[19].setRotationPoint(46F, 6F, 35F);

		leftTrackWheelModels[20].addShapeBox(-5F, 2F, -6F, 10, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 13
		leftTrackWheelModels[20].setRotationPoint(46F, 6F, 35F);

		leftTrackWheelModels[21].addShapeBox(-5F, -5F, -6F, 10, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[21].setRotationPoint(46F, 6F, 35F);

		leftTrackWheelModels[22].addShapeBox(5F, -6F, -6F, 1, 4, 7, 0F,3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[22].setRotationPoint(46F, 6F, 35F);

		leftTrackWheelModels[23].addShapeBox(5F, -2F, -6F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[23].setRotationPoint(46F, 6F, 35F);

		leftTrackWheelModels[24].addShapeBox(5F, 2F, -6F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F); // Box 13
		leftTrackWheelModels[24].setRotationPoint(46F, 6F, 35F);

		leftTrackWheelModels[25].addShapeBox(-2F, 5F, -6F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[25].setRotationPoint(46F, 6F, 35F);

		leftTrackWheelModels[26].addShapeBox(-6F, 2F, -6F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F); // Box 13
		leftTrackWheelModels[26].setRotationPoint(46F, 6F, 35F);

		leftTrackWheelModels[27].addShapeBox(-6F, -2F, -6F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[27].setRotationPoint(46F, 6F, 35F);

		leftTrackWheelModels[28].addShapeBox(-6F, -6F, -6F, 1, 4, 7, 0F,-4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[28].setRotationPoint(46F, 6F, 35F);

		leftTrackWheelModels[29].addShapeBox(-2F, -6F, -6F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[29].setRotationPoint(46F, 6F, 35F);

		leftTrackWheelModels[30].addShapeBox(-5F, -2F, -6F, 10, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[30].setRotationPoint(28F, 6F, 35F);

		leftTrackWheelModels[31].addShapeBox(-5F, 2F, -6F, 10, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 13
		leftTrackWheelModels[31].setRotationPoint(28F, 6F, 35F);

		leftTrackWheelModels[32].addShapeBox(-5F, -5F, -6F, 10, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[32].setRotationPoint(28F, 6F, 35F);

		leftTrackWheelModels[33].addShapeBox(5F, -6F, -6F, 1, 4, 7, 0F,3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[33].setRotationPoint(28F, 6F, 35F);

		leftTrackWheelModels[34].addShapeBox(5F, -2F, -6F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[34].setRotationPoint(28F, 6F, 35F);

		leftTrackWheelModels[35].addShapeBox(5F, 2F, -6F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F); // Box 13
		leftTrackWheelModels[35].setRotationPoint(28F, 6F, 35F);

		leftTrackWheelModels[36].addShapeBox(-2F, 5F, -6F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[36].setRotationPoint(28F, 6F, 35F);

		leftTrackWheelModels[37].addShapeBox(-6F, 2F, -6F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F); // Box 13
		leftTrackWheelModels[37].setRotationPoint(28F, 6F, 35F);

		leftTrackWheelModels[38].addShapeBox(-6F, -2F, -6F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[38].setRotationPoint(28F, 6F, 35F);

		leftTrackWheelModels[39].addShapeBox(-6F, -6F, -6F, 1, 4, 7, 0F,-4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[39].setRotationPoint(28F, 6F, 35F);

		leftTrackWheelModels[40].addShapeBox(-2F, -6F, -6F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[40].setRotationPoint(28F, 6F, 35F);

		leftTrackWheelModels[41].addShapeBox(-5F, -2F, -6F, 10, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[41].setRotationPoint(8F, 6F, 35F);

		leftTrackWheelModels[42].addShapeBox(-5F, 2F, -6F, 10, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 13
		leftTrackWheelModels[42].setRotationPoint(8F, 6F, 35F);

		leftTrackWheelModels[43].addShapeBox(-5F, -5F, -6F, 10, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[43].setRotationPoint(8F, 6F, 35F);

		leftTrackWheelModels[44].addShapeBox(5F, -6F, -6F, 1, 4, 7, 0F,3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[44].setRotationPoint(8F, 6F, 35F);

		leftTrackWheelModels[45].addShapeBox(5F, -2F, -6F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[45].setRotationPoint(8F, 6F, 35F);

		leftTrackWheelModels[46].addShapeBox(5F, 2F, -6F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F); // Box 13
		leftTrackWheelModels[46].setRotationPoint(8F, 6F, 35F);

		leftTrackWheelModels[47].addShapeBox(-2F, 5F, -6F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[47].setRotationPoint(8F, 6F, 35F);

		leftTrackWheelModels[48].addShapeBox(-6F, 2F, -6F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F); // Box 13
		leftTrackWheelModels[48].setRotationPoint(8F, 6F, 35F);

		leftTrackWheelModels[49].addShapeBox(-6F, -2F, -6F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[49].setRotationPoint(8F, 6F, 35F);

		leftTrackWheelModels[50].addShapeBox(-6F, -6F, -6F, 1, 4, 7, 0F,-4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[50].setRotationPoint(8F, 6F, 35F);

		leftTrackWheelModels[51].addShapeBox(-2F, -6F, -6F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[51].setRotationPoint(8F, 6F, 35F);

		leftTrackWheelModels[52].addShapeBox(-5F, -2F, -6F, 10, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[52].setRotationPoint(-11F, 6F, 35F);

		leftTrackWheelModels[53].addShapeBox(-5F, 2F, -6F, 10, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 13
		leftTrackWheelModels[53].setRotationPoint(-11F, 6F, 35F);

		leftTrackWheelModels[54].addShapeBox(-5F, -5F, -6F, 10, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[54].setRotationPoint(-11F, 6F, 35F);

		leftTrackWheelModels[55].addShapeBox(5F, -6F, -6F, 1, 4, 7, 0F,3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[55].setRotationPoint(-11F, 6F, 35F);

		leftTrackWheelModels[56].addShapeBox(5F, -2F, -6F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[56].setRotationPoint(-11F, 6F, 35F);

		leftTrackWheelModels[57].addShapeBox(5F, 2F, -6F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F); // Box 13
		leftTrackWheelModels[57].setRotationPoint(-11F, 6F, 35F);

		leftTrackWheelModels[58].addShapeBox(-2F, 5F, -6F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[58].setRotationPoint(-11F, 6F, 35F);

		leftTrackWheelModels[59].addShapeBox(-6F, 2F, -6F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F); // Box 13
		leftTrackWheelModels[59].setRotationPoint(-11F, 6F, 35F);

		leftTrackWheelModels[60].addShapeBox(-6F, -2F, -6F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[60].setRotationPoint(-11F, 6F, 35F);

		leftTrackWheelModels[61].addShapeBox(-6F, -6F, -6F, 1, 4, 7, 0F,-4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[61].setRotationPoint(-11F, 6F, 35F);

		leftTrackWheelModels[62].addShapeBox(-2F, -6F, -6F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[62].setRotationPoint(-11F, 6F, 35F);

		leftTrackWheelModels[63].addShapeBox(-5F, -2F, -6F, 10, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[63].setRotationPoint(-37F, 6F, 35F);

		leftTrackWheelModels[64].addShapeBox(-5F, 2F, -6F, 10, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 13
		leftTrackWheelModels[64].setRotationPoint(-37F, 6F, 35F);

		leftTrackWheelModels[65].addShapeBox(-5F, -5F, -6F, 10, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[65].setRotationPoint(-37F, 6F, 35F);

		leftTrackWheelModels[66].addShapeBox(5F, -6F, -6F, 1, 4, 7, 0F,3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[66].setRotationPoint(-37F, 6F, 35F);

		leftTrackWheelModels[67].addShapeBox(5F, -2F, -6F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[67].setRotationPoint(-37F, 6F, 35F);

		leftTrackWheelModels[68].addShapeBox(5F, 2F, -6F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F); // Box 13
		leftTrackWheelModels[68].setRotationPoint(-37F, 6F, 35F);

		leftTrackWheelModels[69].addShapeBox(-2F, 5F, -6F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[69].setRotationPoint(-37F, 6F, 35F);

		leftTrackWheelModels[70].addShapeBox(-6F, 2F, -6F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F); // Box 13
		leftTrackWheelModels[70].setRotationPoint(-37F, 6F, 35F);

		leftTrackWheelModels[71].addShapeBox(-6F, -2F, -6F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[71].setRotationPoint(-37F, 6F, 35F);

		leftTrackWheelModels[72].addShapeBox(-6F, -6F, -6F, 1, 4, 7, 0F,-4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[72].setRotationPoint(-37F, 6F, 35F);

		leftTrackWheelModels[73].addShapeBox(-2F, -6F, -6F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[73].setRotationPoint(-37F, 6F, 35F);

		leftTrackWheelModels[74].addShapeBox(-5F, -5F, -5F, 10, 3, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[74].setRotationPoint(-53F, -1F, 35F);

		leftTrackWheelModels[75].addShapeBox(5F, -2F, -6F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[75].setRotationPoint(-53F, -1F, 35F);

		leftTrackWheelModels[76].addShapeBox(-6F, -2F, -6F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[76].setRotationPoint(-53F, -1F, 35F);

		leftTrackWheelModels[77].addShapeBox(-6F, -6F, -6F, 1, 4, 7, 0F,-4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[77].setRotationPoint(-53F, -1F, 35F);

		leftTrackWheelModels[78].addShapeBox(-2F, -6F, -6F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[78].setRotationPoint(-53F, -1F, 35F);

		leftTrackWheelModels[79].addShapeBox(5F, -6F, -6F, 1, 4, 7, 0F,3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[79].setRotationPoint(-53F, -1F, 35F);

		leftTrackWheelModels[80].addShapeBox(-5F, -2F, 0F, 10, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[80].setRotationPoint(-53F, -1F, -35F);

		leftTrackWheelModels[81].addShapeBox(-5F, 2F, 0F, 10, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 13
		leftTrackWheelModels[81].setRotationPoint(-53F, -1F, -35F);

		leftTrackWheelModels[82].addShapeBox(-5F, -5F, 0F, 10, 3, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[82].setRotationPoint(-53F, -1F, -35F);

		leftTrackWheelModels[83].addShapeBox(-2F, -6F, -1F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[83].setRotationPoint(-53F, -1F, -35F);

		leftTrackWheelModels[84].addShapeBox(5F, -6F, -1F, 1, 4, 7, 0F,3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[84].setRotationPoint(-53F, -1F, -35F);

		leftTrackWheelModels[85].addShapeBox(5F, -2F, -1F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[85].setRotationPoint(-53F, -1F, -35F);

		leftTrackWheelModels[86].addShapeBox(5F, 2F, -1F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F); // Box 13
		leftTrackWheelModels[86].setRotationPoint(-53F, -1F, -35F);

		leftTrackWheelModels[87].addShapeBox(-2F, 5F, -1F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[87].setRotationPoint(-53F, -1F, -35F);

		leftTrackWheelModels[88].addShapeBox(-6F, 2F, -1F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F); // Box 13
		leftTrackWheelModels[88].setRotationPoint(-53F, -1F, -35F);

		leftTrackWheelModels[89].addShapeBox(-6F, -6F, -1F, 1, 4, 7, 0F,-4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[89].setRotationPoint(-53F, -1F, -35F);

		leftTrackWheelModels[90].addShapeBox(-6F, -2F, -1F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[90].setRotationPoint(-53F, -1F, -35F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 561, 81, textureX, textureY); // Box 13
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 13
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 1001, 73, textureX, textureY); // Box 13
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 601, 81, textureX, textureY); // Box 13
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 625, 81, textureX, textureY); // Box 13
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 649, 81, textureX, textureY); // Box 13
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 673, 81, textureX, textureY); // Box 13
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 13
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 745, 89, textureX, textureY); // Box 13
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 977, 81, textureX, textureY); // Box 13
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 777, 89, textureX, textureY); // Box 13
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 817, 89, textureX, textureY); // Box 13
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 13
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 857, 89, textureX, textureY); // Box 13
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 881, 89, textureX, textureY); // Box 13
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 921, 89, textureX, textureY); // Box 13
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Box 13
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 961, 89, textureX, textureY); // Box 13
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 993, 89, textureX, textureY); // Box 13
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 13
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 13
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 977, 97, textureX, textureY); // Box 13
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 817, 105, textureX, textureY); // Box 13
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 841, 105, textureX, textureY); // Box 13
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 13
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 865, 105, textureX, textureY); // Box 13
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 561, 97, textureX, textureY); // Box 13
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 601, 97, textureX, textureY); // Box 13
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 905, 105, textureX, textureY); // Box 13
		rightTrackWheelModels[29] = new ModelRendererTurbo(this, 929, 105, textureX, textureY); // Box 13
		rightTrackWheelModels[30] = new ModelRendererTurbo(this, 953, 105, textureX, textureY); // Box 13
		rightTrackWheelModels[31] = new ModelRendererTurbo(this, 641, 97, textureX, textureY); // Box 13
		rightTrackWheelModels[32] = new ModelRendererTurbo(this, 993, 105, textureX, textureY); // Box 13
		rightTrackWheelModels[33] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Box 13
		rightTrackWheelModels[34] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Box 13
		rightTrackWheelModels[35] = new ModelRendererTurbo(this, 665, 97, textureX, textureY); // Box 13
		rightTrackWheelModels[36] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Box 13
		rightTrackWheelModels[37] = new ModelRendererTurbo(this, 633, 113, textureX, textureY); // Box 13
		rightTrackWheelModels[38] = new ModelRendererTurbo(this, 673, 113, textureX, textureY); // Box 13
		rightTrackWheelModels[39] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Box 13
		rightTrackWheelModels[40] = new ModelRendererTurbo(this, 713, 113, textureX, textureY); // Box 13
		rightTrackWheelModels[41] = new ModelRendererTurbo(this, 737, 113, textureX, textureY); // Box 13
		rightTrackWheelModels[42] = new ModelRendererTurbo(this, 761, 113, textureX, textureY); // Box 13
		rightTrackWheelModels[43] = new ModelRendererTurbo(this, 785, 113, textureX, textureY); // Box 13
		rightTrackWheelModels[44] = new ModelRendererTurbo(this, 969, 113, textureX, textureY); // Box 13
		rightTrackWheelModels[45] = new ModelRendererTurbo(this, 393, 121, textureX, textureY); // Box 13
		rightTrackWheelModels[46] = new ModelRendererTurbo(this, 801, 121, textureX, textureY); // Box 13
		rightTrackWheelModels[47] = new ModelRendererTurbo(this, 825, 121, textureX, textureY); // Box 13
		rightTrackWheelModels[48] = new ModelRendererTurbo(this, 865, 121, textureX, textureY); // Box 13
		rightTrackWheelModels[49] = new ModelRendererTurbo(this, 905, 121, textureX, textureY); // Box 13
		rightTrackWheelModels[50] = new ModelRendererTurbo(this, 945, 121, textureX, textureY); // Box 13
		rightTrackWheelModels[51] = new ModelRendererTurbo(this, 985, 121, textureX, textureY); // Box 13
		rightTrackWheelModels[52] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 13
		rightTrackWheelModels[53] = new ModelRendererTurbo(this, 25, 129, textureX, textureY); // Box 13
		rightTrackWheelModels[54] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // Box 13
		rightTrackWheelModels[55] = new ModelRendererTurbo(this, 73, 129, textureX, textureY); // Box 13
		rightTrackWheelModels[56] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Box 13
		rightTrackWheelModels[57] = new ModelRendererTurbo(this, 121, 129, textureX, textureY); // Box 13
		rightTrackWheelModels[58] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // Box 13
		rightTrackWheelModels[59] = new ModelRendererTurbo(this, 185, 129, textureX, textureY); // Box 13
		rightTrackWheelModels[60] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Box 13
		rightTrackWheelModels[61] = new ModelRendererTurbo(this, 265, 129, textureX, textureY); // Box 13
		rightTrackWheelModels[62] = new ModelRendererTurbo(this, 289, 129, textureX, textureY); // Box 13
		rightTrackWheelModels[63] = new ModelRendererTurbo(this, 313, 129, textureX, textureY); // Box 13
		rightTrackWheelModels[64] = new ModelRendererTurbo(this, 337, 129, textureX, textureY); // Box 13
		rightTrackWheelModels[65] = new ModelRendererTurbo(this, 361, 129, textureX, textureY); // Box 13
		rightTrackWheelModels[66] = new ModelRendererTurbo(this, 409, 129, textureX, textureY); // Box 13
		rightTrackWheelModels[67] = new ModelRendererTurbo(this, 433, 129, textureX, textureY); // Box 13
		rightTrackWheelModels[68] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Box 13

		rightTrackWheelModels[0].addShapeBox(-5F, -2F, 0F, 10, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[0].setRotationPoint(62F, 6F, -35F);

		rightTrackWheelModels[1].addShapeBox(-2F, -6F, -1F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[1].setRotationPoint(62F, 6F, -35F);

		rightTrackWheelModels[2].addShapeBox(5F, -2F, -1F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[2].setRotationPoint(62F, 6F, -35F);

		rightTrackWheelModels[3].addShapeBox(-6F, -2F, -1F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[3].setRotationPoint(62F, 6F, -35F);

		rightTrackWheelModels[4].addShapeBox(-6F, -6F, -1F, 1, 4, 7, 0F,-4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[4].setRotationPoint(62F, 6F, -35F);

		rightTrackWheelModels[5].addShapeBox(5F, -6F, -1F, 1, 4, 7, 0F,3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[5].setRotationPoint(62F, 6F, -35F);

		rightTrackWheelModels[6].addShapeBox(-4F, -2F, -2F, 8, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[6].setRotationPoint(82F, -2.5F, -33F);

		rightTrackWheelModels[7].addShapeBox(-4F, 2F, -2F, 8, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 13
		rightTrackWheelModels[7].setRotationPoint(82F, -2.5F, -33F);

		rightTrackWheelModels[8].addShapeBox(-4F, -4F, -2F, 8, 2, 6, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[8].setRotationPoint(82F, -2.5F, -33F);

		rightTrackWheelModels[9].addShapeBox(-2F, 5F, -1F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[9].setRotationPoint(62F, 6F, -35F);

		rightTrackWheelModels[10].addShapeBox(-5F, -5F, 0F, 10, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[10].setRotationPoint(62F, 6F, -35F);

		rightTrackWheelModels[11].addShapeBox(-5F, 2F, 0F, 10, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 13
		rightTrackWheelModels[11].setRotationPoint(62F, 6F, -35F);

		rightTrackWheelModels[12].addShapeBox(5F, 2F, -1F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F); // Box 13
		rightTrackWheelModels[12].setRotationPoint(62F, 6F, -35F);

		rightTrackWheelModels[13].addShapeBox(-6F, 2F, -1F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F); // Box 13
		rightTrackWheelModels[13].setRotationPoint(62F, 6F, -35F);

		rightTrackWheelModels[14].addShapeBox(-5F, -2F, 0F, 10, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[14].setRotationPoint(46F, 6F, -35F);

		rightTrackWheelModels[15].addShapeBox(-5F, 2F, 0F, 10, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 13
		rightTrackWheelModels[15].setRotationPoint(46F, 6F, -35F);

		rightTrackWheelModels[16].addShapeBox(-5F, -5F, 0F, 10, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[16].setRotationPoint(46F, 6F, -35F);

		rightTrackWheelModels[17].addShapeBox(5F, -6F, -1F, 1, 4, 7, 0F,3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[17].setRotationPoint(46F, 6F, -35F);

		rightTrackWheelModels[18].addShapeBox(5F, -2F, -1F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[18].setRotationPoint(46F, 6F, -35F);

		rightTrackWheelModels[19].addShapeBox(5F, 2F, -1F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F); // Box 13
		rightTrackWheelModels[19].setRotationPoint(46F, 6F, -35F);

		rightTrackWheelModels[20].addShapeBox(-2F, 5F, -1F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[20].setRotationPoint(46F, 6F, -35F);

		rightTrackWheelModels[21].addShapeBox(-6F, 2F, -1F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F); // Box 13
		rightTrackWheelModels[21].setRotationPoint(46F, 6F, -35F);

		rightTrackWheelModels[22].addShapeBox(-6F, -2F, -1F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[22].setRotationPoint(46F, 6F, -35F);

		rightTrackWheelModels[23].addShapeBox(-6F, -6F, -1F, 1, 4, 7, 0F,-4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[23].setRotationPoint(46F, 6F, -35F);

		rightTrackWheelModels[24].addShapeBox(-2F, -6F, -1F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[24].setRotationPoint(46F, 6F, -35F);

		rightTrackWheelModels[25].addShapeBox(-5F, -2F, 0F, 10, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[25].setRotationPoint(28F, 6F, -35F);

		rightTrackWheelModels[26].addShapeBox(-5F, 2F, 0F, 10, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 13
		rightTrackWheelModels[26].setRotationPoint(28F, 6F, -35F);

		rightTrackWheelModels[27].addShapeBox(-5F, -5F, 0F, 10, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[27].setRotationPoint(28F, 6F, -35F);

		rightTrackWheelModels[28].addShapeBox(5F, -6F, -1F, 1, 4, 7, 0F,3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[28].setRotationPoint(28F, 6F, -35F);

		rightTrackWheelModels[29].addShapeBox(5F, -2F, -1F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[29].setRotationPoint(28F, 6F, -35F);

		rightTrackWheelModels[30].addShapeBox(5F, 2F, -1F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F); // Box 13
		rightTrackWheelModels[30].setRotationPoint(28F, 6F, -35F);

		rightTrackWheelModels[31].addShapeBox(-2F, 5F, -1F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[31].setRotationPoint(28F, 6F, -35F);

		rightTrackWheelModels[32].addShapeBox(-6F, 2F, -1F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F); // Box 13
		rightTrackWheelModels[32].setRotationPoint(28F, 6F, -35F);

		rightTrackWheelModels[33].addShapeBox(-6F, -2F, -1F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[33].setRotationPoint(28F, 6F, -35F);

		rightTrackWheelModels[34].addShapeBox(-6F, -6F, -1F, 1, 4, 7, 0F,-4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[34].setRotationPoint(28F, 6F, -35F);

		rightTrackWheelModels[35].addShapeBox(-2F, -6F, -1F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[35].setRotationPoint(28F, 6F, -35F);

		rightTrackWheelModels[36].addShapeBox(-5F, -2F, 0F, 10, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[36].setRotationPoint(8F, 6F, -35F);

		rightTrackWheelModels[37].addShapeBox(-5F, 2F, 0F, 10, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 13
		rightTrackWheelModels[37].setRotationPoint(8F, 6F, -35F);

		rightTrackWheelModels[38].addShapeBox(-5F, -5F, 0F, 10, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[38].setRotationPoint(8F, 6F, -35F);

		rightTrackWheelModels[39].addShapeBox(5F, -6F, -1F, 1, 4, 7, 0F,3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[39].setRotationPoint(8F, 6F, -35F);

		rightTrackWheelModels[40].addShapeBox(5F, -2F, -1F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[40].setRotationPoint(8F, 6F, -35F);

		rightTrackWheelModels[41].addShapeBox(5F, 2F, -1F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F); // Box 13
		rightTrackWheelModels[41].setRotationPoint(8F, 6F, -35F);

		rightTrackWheelModels[42].addShapeBox(-2F, 5F, -1F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[42].setRotationPoint(8F, 6F, -35F);

		rightTrackWheelModels[43].addShapeBox(-6F, 2F, -1F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F); // Box 13
		rightTrackWheelModels[43].setRotationPoint(8F, 6F, -35F);

		rightTrackWheelModels[44].addShapeBox(-6F, -2F, -1F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[44].setRotationPoint(8F, 6F, -35F);

		rightTrackWheelModels[45].addShapeBox(-6F, -6F, -1F, 1, 4, 7, 0F,-4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[45].setRotationPoint(8F, 6F, -35F);

		rightTrackWheelModels[46].addShapeBox(-2F, -6F, -1F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[46].setRotationPoint(8F, 6F, -35F);

		rightTrackWheelModels[47].addShapeBox(-5F, -2F, 0F, 10, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[47].setRotationPoint(-11F, 6F, -35F);

		rightTrackWheelModels[48].addShapeBox(-5F, 2F, 0F, 10, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 13
		rightTrackWheelModels[48].setRotationPoint(-11F, 6F, -35F);

		rightTrackWheelModels[49].addShapeBox(-5F, -5F, 0F, 10, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[49].setRotationPoint(-11F, 6F, -35F);

		rightTrackWheelModels[50].addShapeBox(5F, -6F, -1F, 1, 4, 7, 0F,3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[50].setRotationPoint(-11F, 6F, -35F);

		rightTrackWheelModels[51].addShapeBox(5F, -2F, -1F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[51].setRotationPoint(-11F, 6F, -35F);

		rightTrackWheelModels[52].addShapeBox(5F, 2F, -1F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F); // Box 13
		rightTrackWheelModels[52].setRotationPoint(-11F, 6F, -35F);

		rightTrackWheelModels[53].addShapeBox(-2F, 5F, -1F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[53].setRotationPoint(-11F, 6F, -35F);

		rightTrackWheelModels[54].addShapeBox(-6F, 2F, -1F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F); // Box 13
		rightTrackWheelModels[54].setRotationPoint(-11F, 6F, -35F);

		rightTrackWheelModels[55].addShapeBox(-6F, -2F, -1F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[55].setRotationPoint(-11F, 6F, -35F);

		rightTrackWheelModels[56].addShapeBox(-6F, -6F, -1F, 1, 4, 7, 0F,-4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[56].setRotationPoint(-11F, 6F, -35F);

		rightTrackWheelModels[57].addShapeBox(-2F, -6F, -1F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[57].setRotationPoint(-11F, 6F, -35F);

		rightTrackWheelModels[58].addShapeBox(-5F, -2F, 0F, 10, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[58].setRotationPoint(-37F, 6F, -35F);

		rightTrackWheelModels[59].addShapeBox(-5F, 2F, 0F, 10, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 13
		rightTrackWheelModels[59].setRotationPoint(-37F, 6F, -35F);

		rightTrackWheelModels[60].addShapeBox(-5F, -5F, 0F, 10, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[60].setRotationPoint(-37F, 6F, -35F);

		rightTrackWheelModels[61].addShapeBox(5F, -6F, -1F, 1, 4, 7, 0F,3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[61].setRotationPoint(-37F, 6F, -35F);

		rightTrackWheelModels[62].addShapeBox(5F, -2F, -1F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[62].setRotationPoint(-37F, 6F, -35F);

		rightTrackWheelModels[63].addShapeBox(5F, 2F, -1F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F); // Box 13
		rightTrackWheelModels[63].setRotationPoint(-37F, 6F, -35F);

		rightTrackWheelModels[64].addShapeBox(-2F, 5F, -1F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[64].setRotationPoint(-37F, 6F, -35F);

		rightTrackWheelModels[65].addShapeBox(-6F, 2F, -1F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F); // Box 13
		rightTrackWheelModels[65].setRotationPoint(-37F, 6F, -35F);

		rightTrackWheelModels[66].addShapeBox(-6F, -2F, -1F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[66].setRotationPoint(-37F, 6F, -35F);

		rightTrackWheelModels[67].addShapeBox(-6F, -6F, -1F, 1, 4, 7, 0F,-4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[67].setRotationPoint(-37F, 6F, -35F);

		rightTrackWheelModels[68].addShapeBox(-2F, -6F, -1F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[68].setRotationPoint(-37F, 6F, -35F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Box 13
		leftTrackModel[1] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Box 13
		leftTrackModel[2] = new ModelRendererTurbo(this, 625, 1, textureX, textureY); // Box 13
		leftTrackModel[3] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 13
		leftTrackModel[4] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 13
		leftTrackModel[5] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 13
		leftTrackModel[6] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 13
		leftTrackModel[7] = new ModelRendererTurbo(this, 729, 17, textureX, textureY); // Box 13
		leftTrackModel[8] = new ModelRendererTurbo(this, 761, 17, textureX, textureY); // Box 13
		leftTrackModel[9] = new ModelRendererTurbo(this, 1001, 33, textureX, textureY); // Box 13
		leftTrackModel[10] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 13

		leftTrackModel[0].addShapeBox(0F, 0F, -10F, 109, 1, 10, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 13
		leftTrackModel[0].setRotationPoint(-42F, 12F, 37F);

		leftTrackModel[1].addShapeBox(2F, 0F, -10F, 27, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackModel[1].setRotationPoint(88.7F, -1F, 37F);
		leftTrackModel[1].rotateAngleZ = -2.63544717F;

		leftTrackModel[2].addShapeBox(0F, 0F, -10F, 1, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackModel[2].setRotationPoint(-60.1F, -3F, 37F);

		leftTrackModel[3].addShapeBox(4F, 0F, 5F, 20, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackModel[3].setRotationPoint(-60.5F, 2.6F, 22F);
		leftTrackModel[3].rotateAngleZ = -0.40142573F;

		leftTrackModel[4].addShapeBox(0F, 0F, -10F, 1, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackModel[4].setRotationPoint(86F, -5F, 37F);

		leftTrackModel[5].addShapeBox(0F, 0F, -10F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackModel[5].setRotationPoint(86.4F, -4.2F, 37F);
		leftTrackModel[5].rotateAngleZ = 2.44346095F;

		leftTrackModel[6].addShapeBox(0F, 0F, -10F, 132, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackModel[6].setRotationPoint(-54F, -8F, 37F);

		leftTrackModel[7].addShapeBox(1.5F, 0F, -10F, 5, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackModel[7].setRotationPoint(-60F, -5F, 37F);
		leftTrackModel[7].rotateAngleZ = 0.4712389F;

		leftTrackModel[8].addShapeBox(0F, 0F, -10F, 9, 1, 10, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackModel[8].setRotationPoint(84.4F, -6F, 37F);
		leftTrackModel[8].rotateAngleZ = 3.00196631F;

		leftTrackModel[9].addShapeBox(0F, -3F, -10F, 1, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackModel[9].setRotationPoint(-60.1F, -3F, 37F);
		leftTrackModel[9].rotateAngleZ = -0.52359878F;

		leftTrackModel[10].addShapeBox(0F, 0F, -10F, 1, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackModel[10].setRotationPoint(-60.1F, 1F, 37F);
		leftTrackModel[10].rotateAngleZ = 0.61086524F;
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 745, 73, textureX, textureY); // Box 13
		rightTrackModel[1] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 13
		rightTrackModel[2] = new ModelRendererTurbo(this, 633, 33, textureX, textureY); // Box 13
		rightTrackModel[3] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 13
		rightTrackModel[4] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 13
		rightTrackModel[5] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 13
		rightTrackModel[6] = new ModelRendererTurbo(this, 921, 145, textureX, textureY); // Box 13
		rightTrackModel[7] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 13
		rightTrackModel[8] = new ModelRendererTurbo(this, 977, 137, textureX, textureY); // Box 13
		rightTrackModel[9] = new ModelRendererTurbo(this, 649, 49, textureX, textureY); // Box 13
		rightTrackModel[10] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 13

		rightTrackModel[0].addShapeBox(0F, 0F, 0F, 109, 1, 10, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 13
		rightTrackModel[0].setRotationPoint(-42F, 12F, -37F);

		rightTrackModel[1].addShapeBox(2F, 0F, 0F, 27, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackModel[1].setRotationPoint(88.7F, -1F, -37F);
		rightTrackModel[1].rotateAngleZ = -2.63544717F;

		rightTrackModel[2].addShapeBox(0F, 0F, 0F, 1, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackModel[2].setRotationPoint(86F, -5F, -37F);

		rightTrackModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackModel[3].setRotationPoint(86.4F, -4.2F, -37F);
		rightTrackModel[3].rotateAngleZ = 2.44346095F;

		rightTrackModel[4].addShapeBox(0F, 0F, 0F, 132, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackModel[4].setRotationPoint(-54F, -8F, -37F);

		rightTrackModel[5].addShapeBox(0F, 0F, 0F, 9, 1, 10, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackModel[5].setRotationPoint(84.4F, -6F, -37F);
		rightTrackModel[5].rotateAngleZ = 3.00196631F;

		rightTrackModel[6].addShapeBox(4F, 0F, -15F, 20, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackModel[6].setRotationPoint(-60.5F, 2.6F, -22F);
		rightTrackModel[6].rotateAngleZ = -0.40142573F;

		rightTrackModel[7].addShapeBox(0F, 0F, -30F, 1, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackModel[7].setRotationPoint(-60.1F, 1F, -7F);
		rightTrackModel[7].rotateAngleZ = 0.61086524F;

		rightTrackModel[8].addShapeBox(1.5F, 0F, -30F, 5, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackModel[8].setRotationPoint(-60F, -5F, -7F);
		rightTrackModel[8].rotateAngleZ = 0.4712389F;

		rightTrackModel[9].addShapeBox(0F, -3F, -30F, 1, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackModel[9].setRotationPoint(-60.1F, -3F, -7F);
		rightTrackModel[9].rotateAngleZ = -0.52359878F;

		rightTrackModel[10].addShapeBox(0F, 0F, -30F, 1, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackModel[10].setRotationPoint(-60.1F, -3F, -7F);
	}
}