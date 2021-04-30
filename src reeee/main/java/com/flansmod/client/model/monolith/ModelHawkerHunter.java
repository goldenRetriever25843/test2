//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 26.03.2016 - 17:44:31
// Last changed on: 26.03.2016 - 17:44:31

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelHawkerHunter extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelHawkerHunter() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[62];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 569, 41, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 777, 41, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 641, 73, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 24
		bodyModel[12] = new ModelRendererTurbo(this, 577, 105, textureX, textureY); // Box 25
		bodyModel[13] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 26
		bodyModel[14] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Box 27
		bodyModel[15] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Box 28
		bodyModel[16] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Box 31
		bodyModel[17] = new ModelRendererTurbo(this, 657, 113, textureX, textureY); // Box 34
		bodyModel[18] = new ModelRendererTurbo(this, 737, 113, textureX, textureY); // Box 35
		bodyModel[19] = new ModelRendererTurbo(this, 937, 113, textureX, textureY); // Box 36
		bodyModel[20] = new ModelRendererTurbo(this, 745, 41, textureX, textureY); // Box 37
		bodyModel[21] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 38
		bodyModel[22] = new ModelRendererTurbo(this, 513, 129, textureX, textureY); // Box 39
		bodyModel[23] = new ModelRendererTurbo(this, 777, 129, textureX, textureY); // Box 40
		bodyModel[24] = new ModelRendererTurbo(this, 177, 145, textureX, textureY); // Box 41
		bodyModel[25] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 42
		bodyModel[26] = new ModelRendererTurbo(this, 825, 17, textureX, textureY); // Box 43
		bodyModel[27] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Box 46
		bodyModel[28] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 48
		bodyModel[29] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 49
		bodyModel[30] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Box 50
		bodyModel[31] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Box 51
		bodyModel[32] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Box 52
		bodyModel[33] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 53
		bodyModel[34] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Box 54
		bodyModel[35] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 55
		bodyModel[36] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 56
		bodyModel[37] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 59
		bodyModel[38] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 60
		bodyModel[39] = new ModelRendererTurbo(this, 921, 145, textureX, textureY); // Box 61
		bodyModel[40] = new ModelRendererTurbo(this, 193, 161, textureX, textureY); // Box 62
		bodyModel[41] = new ModelRendererTurbo(this, 881, 177, textureX, textureY); // Box 63
		bodyModel[42] = new ModelRendererTurbo(this, 169, 193, textureX, textureY); // Box 64
		bodyModel[43] = new ModelRendererTurbo(this, 545, 41, textureX, textureY); // Box 65
		bodyModel[44] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 66
		bodyModel[45] = new ModelRendererTurbo(this, 961, 57, textureX, textureY); // Box 67
		bodyModel[46] = new ModelRendererTurbo(this, 609, 73, textureX, textureY); // Box 68
		bodyModel[47] = new ModelRendererTurbo(this, 801, 81, textureX, textureY); // Box 69
		bodyModel[48] = new ModelRendererTurbo(this, 553, 145, textureX, textureY); // Box 20
		bodyModel[49] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 21
		bodyModel[50] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 22
		bodyModel[51] = new ModelRendererTurbo(this, 1009, 17, textureX, textureY); // Box 24
		bodyModel[52] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 0
		bodyModel[53] = new ModelRendererTurbo(this, 273, 113, textureX, textureY); // Box 1
		bodyModel[54] = new ModelRendererTurbo(this, 177, 241, textureX, textureY); // Box 2
		bodyModel[55] = new ModelRendererTurbo(this, 617, 145, textureX, textureY); // Box 3
		bodyModel[56] = new ModelRendererTurbo(this, 665, 145, textureX, textureY); // Box 4
		bodyModel[57] = new ModelRendererTurbo(this, 329, 241, textureX, textureY); // Box 5
		bodyModel[58] = new ModelRendererTurbo(this, 609, 89, textureX, textureY); // Box 98
		bodyModel[59] = new ModelRendererTurbo(this, 609, 89, textureX, textureY); // Box 99
		bodyModel[60] = new ModelRendererTurbo(this, 609, 89, textureX, textureY); // Box 100
		bodyModel[61] = new ModelRendererTurbo(this, 609, 89, textureX, textureY); // Box 101

		bodyModel[0].addShapeBox(0F, 0F, 0F, 112, 5, 26, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-81F, -38F, -10F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 112, 5, 30, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-81F, -33F, -12F);

		bodyModel[2].addBox(0F, 0F, 0F, 112, 7, 30, 0F); // Box 2
		bodyModel[2].setRotationPoint(-81F, -28F, -12F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 112, 5, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 3
		bodyModel[3].setRotationPoint(-81F, -21F, -12F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 112, 5, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 4
		bodyModel[4].setRotationPoint(-81F, -16F, -10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 74, 5, 26, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, -7F, 0F, -2F, -7F, 0F, 0F, -5F); // Box 5
		bodyModel[5].setRotationPoint(31F, -16F, -10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 74, 5, 30, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -2F); // Box 6
		bodyModel[6].setRotationPoint(31F, -21F, -12F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 74, 7, 30, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 7
		bodyModel[7].setRotationPoint(31F, -28F, -12F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 74, 5, 30, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 8
		bodyModel[8].setRotationPoint(31F, -33F, -12F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 74, 5, 26, 0F, 0F, 0F, -5F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 9
		bodyModel[9].setRotationPoint(31F, -38F, -10F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 20, 5, 22, 0F, 0F, 0F, -5F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, 0F); // Box 11
		bodyModel[10].setRotationPoint(105F, -38F, -8F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 30, 5, 8, 0F, 0F, 0F, -8F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[11].setRotationPoint(-111F, -38F, -10F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 30, 5, 10, 0F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[12].setRotationPoint(-111F, -33F, -12F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 30, 7, 10, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[13].setRotationPoint(-111F, -28F, -12F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 30, 5, 30, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -5F); // Box 27
		bodyModel[14].setRotationPoint(-111F, -21F, -12F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 30, 5, 26, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -8F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -8F); // Box 28
		bodyModel[15].setRotationPoint(-111F, -16F, -10F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 30, 7, 24, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 31
		bodyModel[16].setRotationPoint(-141F, -28F, -9F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 30, 5, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 34
		bodyModel[17].setRotationPoint(-111F, -38F, 8F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 30, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 35
		bodyModel[18].setRotationPoint(-111F, -33F, 8F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 30, 7, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 36
		bodyModel[19].setRotationPoint(-111F, -28F, 8F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 14, 8, 16, 0F, -1F, 0F, -5F, 0F, -3F, -5F, 0F, -3F, -5F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 37
		bodyModel[20].setRotationPoint(-81F, -46F, -5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 14, 5, 14, 0F, 0F, 0F, -4F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 38
		bodyModel[21].setRotationPoint(-67F, -43F, -4F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 120, 4, 10, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 39
		bodyModel[22].setRotationPoint(-53F, -42F, -2F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 58, 17, 2, 0F, -31F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -31F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[23].setRotationPoint(67F, -62F, 2F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 56, 4, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 41
		bodyModel[24].setRotationPoint(67F, -42F, 0F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 27, 16, 2, 0F, -21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[25].setRotationPoint(98F, -78F, 2F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 16, 4, 2, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[26].setRotationPoint(119F, -82F, 2F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 61, 3, 2, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[27].setRotationPoint(64F, -45F, 2F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 48
		bodyModel[28].setRotationPoint(-107F, -42F, -3F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 49
		bodyModel[29].setRotationPoint(-106F, -44F, -2F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[30].setRotationPoint(-104F, -47F, 0F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 51
		bodyModel[31].setRotationPoint(-108F, -39F, -4F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[32].setRotationPoint(-108F, -39F, 8F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[33].setRotationPoint(-107F, -42F, 7F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[34].setRotationPoint(-106F, -44F, 6F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[35].setRotationPoint(-105F, -46F, 5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 56
		bodyModel[36].setRotationPoint(-105F, -46F, -1F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 56, 6, 36, 0F, 0F, 0F, 0F, -33F, 0F, 0F, 0F, -3F, 0F, -31F, -3F, 0F, 0F, -3F, 0F, -33F, -3F, 0F, 0F, 0F, 0F, -31F, 0F, 0F); // Box 59
		bodyModel[37].setRotationPoint(83F, -50F, 4F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 56, 6, 36, 0F, -33F, -3F, 0F, 0F, -3F, 0F, -31F, 0F, 0F, 0F, 0F, 0F, -33F, 0F, 0F, 0F, 0F, 0F, -31F, -3F, 0F, 0F, -3F, 0F); // Box 60
		bodyModel[38].setRotationPoint(83F, -50F, -34F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 30, 5, 20, 0F, 0F, -6F, -9F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -6F, -9F, 0F, 2F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -7F); // Box 61
		bodyModel[39].setRotationPoint(-141F, -38F, -7F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 30, 5, 24, 0F, 0F, -2F, -9F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -9F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 62
		bodyModel[40].setRotationPoint(-141F, -33F, -9F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 30, 5, 24, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -2F, -9F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -9F); // Box 63
		bodyModel[41].setRotationPoint(-141F, -21F, -9F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 30, 5, 20, 0F, 0F, 2F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -7F, 0F, -6F, -9F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -6F, -9F); // Box 64
		bodyModel[42].setRotationPoint(-141F, -16F, -7F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 10, 7, 10, 0F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F); // Box 65
		bodyModel[43].setRotationPoint(-151F, -28F, -2F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 10, 6, 10, 0F, 0F, -5F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -5F, -3F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F); // Box 66
		bodyModel[44].setRotationPoint(-151F, -31F, -2F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 10, 6, 6, 0F, 0F, -5F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -5F, -3F, 0F, 0F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, -1F); // Box 67
		bodyModel[45].setRotationPoint(-151F, -32F, 0F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 10, 5, 10, 0F, 0F, 3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -3F, 0F, -7F, -3F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -7F, -3F); // Box 68
		bodyModel[46].setRotationPoint(-151F, -21F, -2F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 10, 6, 6, 0F, 0F, 2F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2F, -1F, 0F, -7F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -7F, -2F); // Box 69
		bodyModel[47].setRotationPoint(-151F, -21F, 0F);

		bodyModel[48].addBox(0F, 0F, 0F, 20, 2, 10, 0F); // Box 20
		bodyModel[48].setRotationPoint(-104F, -23F, -2F);

		bodyModel[49].addBox(0F, 0F, 0F, 2, 20, 10, 0F); // Box 21
		bodyModel[49].setRotationPoint(-86F, -43F, -2F);

		bodyModel[50].addBox(0F, 0F, 0F, 2, 9, 2, 0F); // Box 22
		bodyModel[50].setRotationPoint(-107F, -30F, 2F);

		bodyModel[51].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 24
		bodyModel[51].setRotationPoint(-107F, -31F, 1F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 12, 4, 10, 0F, -12F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 0
		bodyModel[52].setRotationPoint(-65F, -33F, -20F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 12, 4, 10, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -12F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[53].setRotationPoint(-65F, -28F, -20F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 63, 8, 10, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -7F, -1F, 0F, 0F, 1F, 0F); // Box 2
		bodyModel[54].setRotationPoint(-53F, -33F, -20F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 12, 4, 10, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -12F, -3F, 0F); // Box 3
		bodyModel[55].setRotationPoint(-65F, -28F, 16F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 12, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -12F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -12F, 0F, 0F); // Box 4
		bodyModel[56].setRotationPoint(-65F, -33F, 16F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 63, 8, 10, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, -7F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 5
		bodyModel[57].setRotationPoint(-53F, -33F, 16F);

		bodyModel[58].addBox(0F, 0F, 0F, 21, 1, 1, 0F); // Box 98
		bodyModel[58].setRotationPoint(-108F, -15F, -7F);

		bodyModel[59].addBox(0F, 0F, 0F, 21, 1, 1, 0F); // Box 99
		bodyModel[59].setRotationPoint(-108F, -15F, 12F);

		bodyModel[60].addBox(0F, 0F, 0F, 21, 1, 1, 0F); // Box 100
		bodyModel[60].setRotationPoint(-116F, -13F, -4F);

		bodyModel[61].addBox(0F, 0F, 0F, 21, 1, 1, 0F); // Box 101
		bodyModel[61].setRotationPoint(-116F, -13F, 9F);


		tailModel = new ModelRendererTurbo[16];
		tailModel[0] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Box 10
		tailModel[1] = new ModelRendererTurbo(this, 705, 81, textureX, textureY); // Box 12
		tailModel[2] = new ModelRendererTurbo(this, 825, 81, textureX, textureY); // Box 13
		tailModel[3] = new ModelRendererTurbo(this, 409, 105, textureX, textureY); // Box 14
		tailModel[4] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 15
		tailModel[5] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Box 16
		tailModel[6] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Box 17
		tailModel[7] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Box 18
		tailModel[8] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Box 19
		tailModel[9] = new ModelRendererTurbo(this, 537, 17, textureX, textureY); // Box 20
		tailModel[10] = new ModelRendererTurbo(this, 977, 17, textureX, textureY); // Box 21
		tailModel[11] = new ModelRendererTurbo(this, 961, 33, textureX, textureY); // Box 22
		tailModel[12] = new ModelRendererTurbo(this, 945, 81, textureX, textureY); // Box 23
		tailModel[13] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 44
		tailModel[14] = new ModelRendererTurbo(this, 905, 129, textureX, textureY); // Box 45
		tailModel[15] = new ModelRendererTurbo(this, 721, 73, textureX, textureY); // Box 25

		tailModel[0].addShapeBox(0F, 0F, 0F, 31, 5, 26, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, -2F); // Box 10
		tailModel[0].setRotationPoint(105F, -21F, -10F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 31, 5, 26, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 12
		tailModel[1].setRotationPoint(105F, -33F, -10F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 31, 7, 26, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 13
		tailModel[2].setRotationPoint(105F, -28F, -10F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 31, 3, 22, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -3F, -7F, 0F, -3F, -7F, 0F, 0F, -5F); // Box 14
		tailModel[3].setRotationPoint(105F, -16F, -8F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 8, 4, 18, 0F, 0F, -1F, -5F, 0F, -3F, -7F, 0F, -3F, -7F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 15
		tailModel[4].setRotationPoint(136F, -37F, -6F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 8, 5, 8, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 16
		tailModel[5].setRotationPoint(136F, -33F, -8F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 8, 5, 8, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 17
		tailModel[6].setRotationPoint(136F, -33F, 6F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 8, 7, 5, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		tailModel[7].setRotationPoint(136F, -28F, -8F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 8, 7, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 19
		tailModel[8].setRotationPoint(136F, -28F, 9F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 8, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, -1F, -4F, 0F, -1F, -2F, 0F, 0F, -2F); // Box 20
		tailModel[9].setRotationPoint(136F, -21F, -8F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 8, 4, 8, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -4F, 0F, 0F, -2F); // Box 21
		tailModel[10].setRotationPoint(136F, -21F, 6F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 8, 1, 18, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, -7F, 0F, -1F, -7F, 0F, 0F, -5F); // Box 22
		tailModel[11].setRotationPoint(136F, -17F, -6F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 11, 6, 20, 0F, 0F, -1F, -6F, 0F, -3F, -6F, 0F, -3F, -6F, 0F, -1F, -6F, 0F, 0F, -0.3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.3F); // Box 23
		tailModel[12].setRotationPoint(125F, -39F, -7F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		tailModel[13].setRotationPoint(135F, -82F, 2F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 14, 33, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F); // Box 45
		tailModel[14].setRotationPoint(125F, -78F, 2F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 25
		tailModel[15].setRotationPoint(125F, -50F, 2F);


		leftWingModel = new ModelRendererTurbo[2];
		leftWingModel[0] = new ModelRendererTurbo(this, 553, 161, textureX, textureY); // Box 58
		leftWingModel[1] = new ModelRendererTurbo(this, 609, 89, textureX, textureY); // Box 26

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 120, 9, 81, 0F, -87F, -6F, 0F, 0F, -6F, 0F, -57F, 0F, 0F, 0F, 0F, 0F, -87F, 0F, 0F, 0F, 0F, 0F, -57F, -6F, 0F, 0F, -6F, 0F); // Box 58
		leftWingModel[0].setRotationPoint(-53F, -30F, -101F);

		leftWingModel[1].addBox(0F, 0F, 0F, 21, 1, 1, 0F); // Box 26
		leftWingModel[1].setRotationPoint(5F, -24F, -89F);


		rightWingModel = new ModelRendererTurbo[1];
		rightWingModel[0] = new ModelRendererTurbo(this, 225, 145, textureX, textureY); // Box 57

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 120, 9, 81, 0F, 0F, 0F, 0F, -57F, 0F, 0F, 0F, -6F, 0F, -87F, -6F, 0F, 0F, -6F, 0F, -57F, -6F, 0F, 0F, 0F, 0F, -87F, 0F, 0F); // Box 57
		rightWingModel[0].setRotationPoint(-53F, -30F, 26F);


		bodyWheelModel = new ModelRendererTurbo[6];
		bodyWheelModel[0] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 0
		bodyWheelModel[1] = new ModelRendererTurbo(this, 577, 9, textureX, textureY); // Box 1
		bodyWheelModel[2] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 2
		bodyWheelModel[3] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 3
		bodyWheelModel[4] = new ModelRendererTurbo(this, 953, 17, textureX, textureY); // Box 4
		bodyWheelModel[5] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 5

		bodyWheelModel[0].addBox(0F, 0F, 0F, 2, 5, 4, 0F); // Box 0
		bodyWheelModel[0].setRotationPoint(-97F, -11F, 1F);

		bodyWheelModel[1].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyWheelModel[1].setRotationPoint(-99F, -6F, 1F);

		bodyWheelModel[2].addShapeBox(0F, 0F, 0F, 4, 7, 5, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 2
		bodyWheelModel[2].setRotationPoint(-99F, -1F, 0.5F);

		bodyWheelModel[3].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyWheelModel[3].setRotationPoint(-100F, 1F, 1F);

		bodyWheelModel[4].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 4
		bodyWheelModel[4].setRotationPoint(-100F, 7F, 1F);

		bodyWheelModel[5].addBox(0F, 0F, 0F, 8, 3, 4, 0F); // Box 5
		bodyWheelModel[5].setRotationPoint(-100F, 4F, 1F);


		leftWingWheelModel = new ModelRendererTurbo[7];
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 857, 33, textureX, textureY); // Box 6
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 889, 33, textureX, textureY); // Box 7
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 921, 33, textureX, textureY); // Box 8
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 1001, 33, textureX, textureY); // Box 9
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 865, 9, textureX, textureY); // Box 10
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 1001, 57, textureX, textureY); // Box 11
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 18

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftWingWheelModel[0].setRotationPoint(-10F, 1F, -50F);

		leftWingWheelModel[1].addBox(0F, 0F, 0F, 8, 3, 4, 0F); // Box 7
		leftWingWheelModel[1].setRotationPoint(-10F, 4F, -50F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 8
		leftWingWheelModel[2].setRotationPoint(-10F, 7F, -50F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 4, 7, 5, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 9
		leftWingWheelModel[3].setRotationPoint(-9F, -1F, -50.5F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 10
		leftWingWheelModel[4].setRotationPoint(-9F, -6F, -50F);

		leftWingWheelModel[5].addBox(0F, 0F, 0F, 2, 19, 4, 0F); // Box 11
		leftWingWheelModel[5].setRotationPoint(-7F, -25F, -50F);

		leftWingWheelModel[6].addBox(0F, 0F, 0F, 11, 14, 2, 0F); // Box 18
		leftWingWheelModel[6].setRotationPoint(-11F, -25F, -52F);


		rightWingWheelModel = new ModelRendererTurbo[7];
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 953, 33, textureX, textureY); // Box 12
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 13
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 14
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 705, 73, textureX, textureY); // Box 15
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 577, 41, textureX, textureY); // Box 16
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 921, 81, textureX, textureY); // Box 17
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 937, 81, textureX, textureY); // Box 19

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		rightWingWheelModel[0].setRotationPoint(-10F, 1F, 50F);

		rightWingWheelModel[1].addBox(0F, 0F, 0F, 8, 3, 4, 0F); // Box 13
		rightWingWheelModel[1].setRotationPoint(-10F, 4F, 50F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 14
		rightWingWheelModel[2].setRotationPoint(-10F, 7F, 50F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 4, 7, 5, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 15
		rightWingWheelModel[3].setRotationPoint(-9F, -1F, 49.5F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 16
		rightWingWheelModel[4].setRotationPoint(-9F, -6F, 50F);

		rightWingWheelModel[5].addBox(0F, 0F, 0F, 2, 19, 4, 0F); // Box 17
		rightWingWheelModel[5].setRotationPoint(-7F, -25F, 50F);

		rightWingWheelModel[6].addBox(0F, 0F, 0F, 11, 14, 2, 0F); // Box 19
		rightWingWheelModel[6].setRotationPoint(-11F, -25F, 54F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}