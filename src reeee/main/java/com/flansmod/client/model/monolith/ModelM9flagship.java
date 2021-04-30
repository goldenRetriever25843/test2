//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 07.09.2015 - 09:03:03
// Last changed on: 07.09.2015 - 09:03:03

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelM9flagship extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelM9flagship() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[76];
		ammoModel = new ModelRendererTurbo[3];
		slideModel = new ModelRendererTurbo[33];

		initgunModel_1();
		initammoModel_1();
		initslideModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 6
		gunModel[7] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 7
		gunModel[8] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 8
		gunModel[9] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 9
		gunModel[10] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 10
		gunModel[11] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 11
		gunModel[12] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 12
		gunModel[13] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 14
		gunModel[14] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 15
		gunModel[15] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 16
		gunModel[16] = new ModelRendererTurbo(this, 465, 145, textureX, textureY); // Box 35
		gunModel[17] = new ModelRendererTurbo(this, 49, 193, textureX, textureY); // Box 39
		gunModel[18] = new ModelRendererTurbo(this, 337, 201, textureX, textureY); // Box 43
		gunModel[19] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 48
		gunModel[20] = new ModelRendererTurbo(this, 49, 169, textureX, textureY); // Box 49
		gunModel[21] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 50
		gunModel[22] = new ModelRendererTurbo(this, 49, 225, textureX, textureY); // Box 51
		gunModel[23] = new ModelRendererTurbo(this, 153, 161, textureX, textureY); // Box 52
		gunModel[24] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 53
		gunModel[25] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 54
		gunModel[26] = new ModelRendererTurbo(this, 457, 209, textureX, textureY); // Box 55
		gunModel[27] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Box 56
		gunModel[28] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Box 57
		gunModel[29] = new ModelRendererTurbo(this, 113, 225, textureX, textureY); // Box 59
		gunModel[30] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 60
		gunModel[31] = new ModelRendererTurbo(this, 33, 137, textureX, textureY); // Box 61
		gunModel[32] = new ModelRendererTurbo(this, 89, 137, textureX, textureY); // Box 62
		gunModel[33] = new ModelRendererTurbo(this, 329, 137, textureX, textureY); // Box 63
		gunModel[34] = new ModelRendererTurbo(this, 161, 225, textureX, textureY); // Box 64
		gunModel[35] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 65
		gunModel[36] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 66
		gunModel[37] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 67
		gunModel[38] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 68
		gunModel[39] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 69
		gunModel[40] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 70
		gunModel[41] = new ModelRendererTurbo(this, 209, 225, textureX, textureY); // Box 0
		gunModel[42] = new ModelRendererTurbo(this, 249, 225, textureX, textureY); // Box 1
		gunModel[43] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 8
		gunModel[44] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 15
		gunModel[45] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 16
		gunModel[46] = new ModelRendererTurbo(this, 337, 265, textureX, textureY); // Box 17
		gunModel[47] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 18
		gunModel[48] = new ModelRendererTurbo(this, 385, 265, textureX, textureY); // Box 19
		gunModel[49] = new ModelRendererTurbo(this, 433, 265, textureX, textureY); // Box 20
		gunModel[50] = new ModelRendererTurbo(this, 193, 249, textureX, textureY); // Box 21
		gunModel[51] = new ModelRendererTurbo(this, 273, 113, textureX, textureY); // Box 0
		gunModel[52] = new ModelRendererTurbo(this, 113, 185, textureX, textureY); // Box 1
		gunModel[53] = new ModelRendererTurbo(this, 273, 281, textureX, textureY); // Box 2
		gunModel[54] = new ModelRendererTurbo(this, 433, 113, textureX, textureY); // Box 3
		gunModel[55] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Box 5
		gunModel[56] = new ModelRendererTurbo(this, 433, 289, textureX, textureY); // Box 6
		gunModel[57] = new ModelRendererTurbo(this, 217, 153, textureX, textureY); // Box 7
		gunModel[58] = new ModelRendererTurbo(this, 97, 177, textureX, textureY); // Box 8
		gunModel[59] = new ModelRendererTurbo(this, 129, 297, textureX, textureY); // Box 9
		gunModel[60] = new ModelRendererTurbo(this, 185, 129, textureX, textureY); // Box 10
		gunModel[61] = new ModelRendererTurbo(this, 177, 297, textureX, textureY); // Box 11
		gunModel[62] = new ModelRendererTurbo(this, 225, 297, textureX, textureY); // Box 12
		gunModel[63] = new ModelRendererTurbo(this, 289, 297, textureX, textureY); // Box 13
		gunModel[64] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 14
		gunModel[65] = new ModelRendererTurbo(this, 345, 297, textureX, textureY); // Box 15
		gunModel[66] = new ModelRendererTurbo(this, 345, 305, textureX, textureY); // Box 16
		gunModel[67] = new ModelRendererTurbo(this, 385, 137, textureX, textureY); // Box 17
		gunModel[68] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 18
		gunModel[69] = new ModelRendererTurbo(this, 1, 313, textureX, textureY); // Box 19
		gunModel[70] = new ModelRendererTurbo(this, 409, 305, textureX, textureY); // Box 20
		gunModel[71] = new ModelRendererTurbo(this, 225, 321, textureX, textureY); // Box 21
		gunModel[72] = new ModelRendererTurbo(this, 353, 321, textureX, textureY); // Box 22
		gunModel[73] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Box 23
		gunModel[74] = new ModelRendererTurbo(this, 137, 337, textureX, textureY); // Box 24
		gunModel[75] = new ModelRendererTurbo(this, 233, 337, textureX, textureY); // Box 26

		gunModel[0].addShapeBox(0F, 0F, 0F, 42, 8, 17, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[0].setRotationPoint(-38F, -54F, 0F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 22, 12, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 1
		gunModel[1].setRotationPoint(-38F, -46F, 0F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 25, 5, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 2
		gunModel[2].setRotationPoint(-16F, -43F, 0F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 20, 27, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F); // Box 3
		gunModel[3].setRotationPoint(-16F, -38F, 0F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 18, 3, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 4
		gunModel[4].setRotationPoint(-16F, -46F, 0F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 20, 22, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[5].setRotationPoint(-24F, -11F, 0F);

		gunModel[6].addBox(0F, 0F, 0F, 19, 3, 17, 0F); // Box 6
		gunModel[6].setRotationPoint(-35F, -34F, 0F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 26, 20, 17, 0F,-7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		gunModel[7].setRotationPoint(-42F, -31F, 0F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 25, 17, 17, 0F,-7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		gunModel[8].setRotationPoint(-49F, -11F, 0F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 26, 5, 17, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		gunModel[9].setRotationPoint(-50F, 6F, 0F);

		gunModel[10].addBox(0F, 0F, 0F, 41, 4, 17, 0F); // Box 10
		gunModel[10].setRotationPoint(-50F, 11F, 0F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 26, 7, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 11
		gunModel[11].setRotationPoint(-50F, 15F, 0F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 16, 7, 17, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		gunModel[12].setRotationPoint(-24F, 15F, 0F);

		gunModel[13].addBox(0F, 0F, 0F, 40, 1, 16, 0F); // Box 14
		gunModel[13].setRotationPoint(-36F, -55F, 0.5F);

		gunModel[14].addBox(0F, 0F, 0F, 45, 13, 16, 0F); // Box 15
		gunModel[14].setRotationPoint(1F, -55F, 0.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 40, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 16
		gunModel[15].setRotationPoint(56F, -49F, 0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 5, 9, 16, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		gunModel[16].setRotationPoint(-37F, -64F, 0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 121, 4, 20, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		gunModel[17].setRotationPoint(-25F, -69F, -1.5F);

		gunModel[18].addBox(0F, 0F, 0F, 16, 11, 11, 0F); // Box 43
		gunModel[18].setRotationPoint(96F, -70F, 3F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 6, 5, 16, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		gunModel[19].setRotationPoint(-42F, -55F, 0.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 12, 2, 16, 0F,-7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		gunModel[20].setRotationPoint(-49F, -50F, 0.5F);

		gunModel[21].addBox(0F, 0F, 0F, 12, 2, 16, 0F); // Box 50
		gunModel[21].setRotationPoint(-49F, -48F, 0.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 12, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 51
		gunModel[22].setRotationPoint(-49F, -46F, 0.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 7, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 52
		gunModel[23].setRotationPoint(-44F, -44F, 0.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 6, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 53
		gunModel[24].setRotationPoint(-42F, -43F, 0.5F);

		gunModel[25].addShapeBox(0F, 5F, 0F, 8, 5, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F); // Box 54
		gunModel[25].setRotationPoint(-42F, -68F, 6F);
		gunModel[25].rotateAngleZ = 0.83775804F;

		gunModel[26].addShapeBox(0F, 0F, 0F, 15, 7, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -6F, 0F, 0F); // Box 55
		gunModel[26].setRotationPoint(32F, -42F, 2.5F);

		gunModel[27].addBox(0F, 0F, 0F, 4, 8, 12, 0F); // Box 56
		gunModel[27].setRotationPoint(38F, -35F, 2.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 7, 5, 12, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 57
		gunModel[28].setRotationPoint(35F, -27F, 2.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 11, 6, 12, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 59
		gunModel[29].setRotationPoint(27F, -24F, 2.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 11, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		gunModel[30].setRotationPoint(16F, -20F, 2.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 7, 7, 12, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		gunModel[31].setRotationPoint(-2F, -30F, 2.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 8, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F); // Box 62
		gunModel[32].setRotationPoint(-3F, -21F, 2.5F);

		gunModel[33].addBox(0F, 0F, 0F, 8, 2, 12, 0F); // Box 63
		gunModel[33].setRotationPoint(-3F, -23F, 2.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 11, 5, 12, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 64
		gunModel[34].setRotationPoint(5F, -23F, 2.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 7, 3, 12, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 65
		gunModel[35].setRotationPoint(35F, -24F, 2.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 9, 5, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 66
		gunModel[36].setRotationPoint(10F, -42F, 5.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 67
		gunModel[37].setRotationPoint(10F, -37F, 5.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 68
		gunModel[38].setRotationPoint(10.5F, -35F, 5.5F);

		gunModel[39].addBox(0F, 0F, 0F, 3, 4, 6, 0F); // Box 69
		gunModel[39].setRotationPoint(10.5F, -33F, 5.5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 5, 7, 6, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 70
		gunModel[40].setRotationPoint(10.5F, -29F, 5.5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 10, 7, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F); // Box 0
		gunModel[41].setRotationPoint(46F, -49F, 0.5F);

		gunModel[42].addBox(0F, 0F, 0F, 50, 6, 3, 0F); // Box 1
		gunModel[42].setRotationPoint(46F, -55F, 0.5F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 121, 3, 14, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		gunModel[43].setRotationPoint(-25F, -72F, 1.5F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 36, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		gunModel[44].setRotationPoint(-16F, -46F, -2F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 25, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 16
		gunModel[45].setRotationPoint(-16F, -43F, -2F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 20, 27, 2, 0F,0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F); // Box 17
		gunModel[46].setRotationPoint(-16F, -38F, -2F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 19, 3, 2, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		gunModel[47].setRotationPoint(-35F, -34F, -2F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 20, 22, 2, 0F,0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 19
		gunModel[48].setRotationPoint(-24F, -11F, -2F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 26, 20, 2, 0F,-11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		gunModel[49].setRotationPoint(-42F, -31F, -2F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 25, 17, 2, 0F,-11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		gunModel[50].setRotationPoint(-49F, -11F, -2F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 26, 5, 2, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[51].setRotationPoint(-50F, 6F, -2F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 41, 4, 2, 0F,-4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		gunModel[52].setRotationPoint(-50F, 11F, -2F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 26, 7, 2, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 2
		gunModel[53].setRotationPoint(-50F, 15F, -2F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 16, 7, 2, 0F,0F, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		gunModel[54].setRotationPoint(-24F, 15F, -2F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 58, 8, 2, 0F,-2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -6F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 5
		gunModel[55].setRotationPoint(-38F, -54F, 17F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 22, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F); // Box 6
		gunModel[56].setRotationPoint(-38F, -46F, 17F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 36, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		gunModel[57].setRotationPoint(-16F, -46F, 17F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 25, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F); // Box 8
		gunModel[58].setRotationPoint(-16F, -43F, 17F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 20, 27, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F); // Box 9
		gunModel[59].setRotationPoint(-16F, -38F, 17F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 19, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 10
		gunModel[60].setRotationPoint(-35F, -34F, 17F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 20, 22, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F); // Box 11
		gunModel[61].setRotationPoint(-24F, -11F, 17F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 26, 20, 2, 0F,-7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 12
		gunModel[62].setRotationPoint(-42F, -31F, 17F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 25, 17, 2, 0F,-7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 13
		gunModel[63].setRotationPoint(-49F, -11F, 17F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 26, 5, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 14
		gunModel[64].setRotationPoint(-50F, 6F, 17F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 41, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 15
		gunModel[65].setRotationPoint(-50F, 11F, 17F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 26, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 16
		gunModel[66].setRotationPoint(-50F, 15F, 17F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 16, 7, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 17
		gunModel[67].setRotationPoint(-24F, 15F, 17F);

		gunModel[68].addShapeBox(2F, 0F, 0F, 6, 5, 5, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		gunModel[68].setRotationPoint(-42F, -68F, 6F);
		gunModel[68].rotateAngleZ = 0.83775804F;

		gunModel[69].addShapeBox(0F, 0F, 0F, 58, 8, 2, 0F,-2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -6F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 19
		gunModel[69].setRotationPoint(-38F, -54F, 17F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 22, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F); // Box 20
		gunModel[70].setRotationPoint(-38F, -46F, 17F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 58, 8, 2, 0F,-6F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		gunModel[71].setRotationPoint(-38F, -54F, -2F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 22, 12, 2, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 22
		gunModel[72].setRotationPoint(-38F, -46F, -2F);

		gunModel[73].addBox(0F, 0F, 0F, 60, 6, 6, 0F); // Box 23
		gunModel[73].setRotationPoint(46F, -54F, 5.5F);

		gunModel[74].addBox(0F, 0F, 0F, 50, 6, 3, 0F); // Box 24
		gunModel[74].setRotationPoint(46F, -55F, 13.5F);

		gunModel[75].addBox(0F, 0F, 0F, 128, 6, 11, 0F); // Box 26
		gunModel[75].setRotationPoint(-32F, -65F, 3F);
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 13
		ammoModel[1] = new ModelRendererTurbo(this, 1, 345, textureX, textureY); // Box 27
		ammoModel[2] = new ModelRendererTurbo(this, 97, 345, textureX, textureY); // Box 28

		ammoModel[0].addShapeBox(0F, 0F, 0F, 31, 5, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F); // Box 13
		ammoModel[0].setRotationPoint(-39F, 22F, 0F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 32, 77, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F); // Box 27
		ammoModel[1].setRotationPoint(-32F, -55F, 1F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 6, 77, 15, 0F,-6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		ammoModel[2].setRotationPoint(-38F, -55F, 1F);
	}

	private void initslideModel_1()
	{
		slideModel[0] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 17
		slideModel[1] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Box 18
		slideModel[2] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 19
		slideModel[3] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 20
		slideModel[4] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 21
		slideModel[5] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Box 22
		slideModel[6] = new ModelRendererTurbo(this, 457, 113, textureX, textureY); // Box 23
		slideModel[7] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // Box 24
		slideModel[8] = new ModelRendererTurbo(this, 153, 129, textureX, textureY); // Box 25
		slideModel[9] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 26
		slideModel[10] = new ModelRendererTurbo(this, 57, 137, textureX, textureY); // Box 27
		slideModel[11] = new ModelRendererTurbo(this, 297, 137, textureX, textureY); // Box 28
		slideModel[12] = new ModelRendererTurbo(this, 353, 137, textureX, textureY); // Box 29
		slideModel[13] = new ModelRendererTurbo(this, 409, 137, textureX, textureY); // Box 30
		slideModel[14] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 31
		slideModel[15] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Box 32
		slideModel[16] = new ModelRendererTurbo(this, 217, 161, textureX, textureY); // Box 34
		slideModel[17] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 36
		slideModel[18] = new ModelRendererTurbo(this, 313, 169, textureX, textureY); // Box 37
		slideModel[19] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 38
		slideModel[20] = new ModelRendererTurbo(this, 441, 177, textureX, textureY); // Box 42
		slideModel[21] = new ModelRendererTurbo(this, 377, 209, textureX, textureY); // Box 44
		slideModel[22] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 45
		slideModel[23] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 46
		slideModel[24] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 47
		slideModel[25] = new ModelRendererTurbo(this, 337, 225, textureX, textureY); // Box 2
		slideModel[26] = new ModelRendererTurbo(this, 377, 241, textureX, textureY); // Box 3
		slideModel[27] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 4
		slideModel[28] = new ModelRendererTurbo(this, 249, 241, textureX, textureY); // Box 5
		slideModel[29] = new ModelRendererTurbo(this, 281, 241, textureX, textureY); // Box 6
		slideModel[30] = new ModelRendererTurbo(this, 41, 249, textureX, textureY); // Box 7
		slideModel[31] = new ModelRendererTurbo(this, 89, 249, textureX, textureY); // Box 10
		slideModel[32] = new ModelRendererTurbo(this, 137, 249, textureX, textureY); // Box 11

		slideModel[0].addBox(0F, 0F, 0F, 62, 12, 22, 0F); // Box 17
		slideModel[0].setRotationPoint(36F, -67F, -2.5F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 20, 9, 22, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		slideModel[1].setRotationPoint(16F, -64F, -2.5F);

		slideModel[2].addShapeBox(0F, 0F, 0F, 4, 9, 22, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 19
		slideModel[2].setRotationPoint(14F, -64F, -2.5F);

		slideModel[3].addShapeBox(0F, 0F, 0F, 4, 9, 22, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 20
		slideModel[3].setRotationPoint(12F, -64F, -2.5F);

		slideModel[4].addShapeBox(0F, 0F, 0F, 4, 9, 22, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 21
		slideModel[4].setRotationPoint(10F, -64F, -2.5F);

		slideModel[5].addShapeBox(0F, 0F, 0F, 4, 9, 22, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 22
		slideModel[5].setRotationPoint(4F, -64F, -2.5F);

		slideModel[6].addShapeBox(0F, 0F, 0F, 4, 9, 22, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 23
		slideModel[6].setRotationPoint(8F, -64F, -2.5F);

		slideModel[7].addShapeBox(0F, 0F, 0F, 4, 9, 22, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 24
		slideModel[7].setRotationPoint(6F, -64F, -2.5F);

		slideModel[8].addShapeBox(0F, 0F, 0F, 4, 9, 22, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 25
		slideModel[8].setRotationPoint(-4F, -64F, -2.5F);

		slideModel[9].addShapeBox(0F, 0F, 0F, 4, 9, 22, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 26
		slideModel[9].setRotationPoint(0F, -64F, -2.5F);

		slideModel[10].addShapeBox(0F, 0F, 0F, 4, 9, 22, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 27
		slideModel[10].setRotationPoint(-2F, -64F, -2.5F);

		slideModel[11].addShapeBox(0F, 0F, 0F, 4, 9, 22, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 28
		slideModel[11].setRotationPoint(2F, -64F, -2.5F);

		slideModel[12].addShapeBox(0F, 0F, 0F, 4, 9, 22, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 29
		slideModel[12].setRotationPoint(-10F, -64F, -2.5F);

		slideModel[13].addShapeBox(0F, 0F, 0F, 4, 9, 22, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 30
		slideModel[13].setRotationPoint(-6F, -64F, -2.5F);

		slideModel[14].addShapeBox(0F, 0F, 0F, 4, 9, 22, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 31
		slideModel[14].setRotationPoint(-8F, -64F, -2.5F);

		slideModel[15].addShapeBox(0F, 0F, 0F, 4, 9, 22, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 32
		slideModel[15].setRotationPoint(-12F, -64F, -2.5F);

		slideModel[16].addShapeBox(0F, 0F, 0F, 23, 9, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 34
		slideModel[16].setRotationPoint(-32F, -64F, -2.5F);

		slideModel[17].addShapeBox(0F, 0F, 0F, 11, 6, 22, 0F,-4F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -4F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		slideModel[17].setRotationPoint(-33F, -70F, -2.5F);

		slideModel[18].addShapeBox(0F, 0F, 0F, 41, 6, 22, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		slideModel[18].setRotationPoint(-22F, -70F, -2.5F);

		slideModel[19].addShapeBox(0F, 0F, 0F, 18, 1, 22, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		slideModel[19].setRotationPoint(18F, -65F, -2.5F);

		slideModel[20].addBox(0F, 0F, 0F, 11, 12, 18, 0F); // Box 42
		slideModel[20].setRotationPoint(96F, -67F, -0.5F);

		slideModel[21].addBox(0F, 0F, 0F, 29, 9, 20, 0F); // Box 44
		slideModel[21].setRotationPoint(-11F, -64F, -1.5F);

		slideModel[22].addShapeBox(0F, 0F, 0F, 6, 5, 2, 0F,-2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		slideModel[22].setRotationPoint(-23F, -77F, 3.5F);

		slideModel[23].addShapeBox(0F, 0F, 0F, 6, 5, 2, 0F,-2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		slideModel[23].setRotationPoint(-23F, -77F, 11.5F);

		slideModel[24].addShapeBox(0F, 0F, 0F, 9, 4, 2, 0F,-1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		slideModel[24].setRotationPoint(98F, -77F, 7.5F);

		slideModel[25].addShapeBox(0F, 0F, 0F, 4, 9, 22, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		slideModel[25].setRotationPoint(-36F, -64F, -2.5F);

		slideModel[26].addShapeBox(0F, 0F, 0F, 41, 3, 16, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		slideModel[26].setRotationPoint(-22F, -73F, 0.5F);

		slideModel[27].addShapeBox(0F, 0F, 0F, 11, 5, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		slideModel[27].setRotationPoint(96F, -55F, 1.5F);

		slideModel[28].addShapeBox(0F, 0F, 0F, 11, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 5
		slideModel[28].setRotationPoint(96F, -50F, 1.5F);

		slideModel[29].addShapeBox(0F, 0F, 0F, 2, 12, 22, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 6
		slideModel[29].setRotationPoint(98F, -67F, -2.5F);

		slideModel[30].addShapeBox(0F, 0F, 0F, 7, 3, 16, 0F,-3F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -3F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		slideModel[30].setRotationPoint(-29F, -73F, 0.5F);

		slideModel[31].addShapeBox(0F, 0F, 0F, 11, 3, 18, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		slideModel[31].setRotationPoint(96F, -70F, -0.5F);

		slideModel[32].addShapeBox(0F, 0F, 0F, 11, 3, 14, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		slideModel[32].setRotationPoint(96F, -73F, 1.5F);
		
		translateAll(12F, -15F, -8F);
		gunSlideDistance = 2.5F;
		animationType = EnumAnimationType.ALT_PISTOL_CLIP;
	}
}