//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 11.01.2016 - 02:35:06
// Last changed on: 11.01.2016 - 02:35:06

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelJapSabre extends ModelPlane //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelJapSabre() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[67];
		tailModel = new ModelRendererTurbo[8];
		leftWingModel = new ModelRendererTurbo[2];
		rightWingModel = new ModelRendererTurbo[2];
		bodyWheelModel = new ModelRendererTurbo[23];

		initbodyModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		initbodyWheelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 7
		bodyModel[6] = new ModelRendererTurbo(this, 0, 33, textureX, textureY); // Box 8
		bodyModel[7] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 9
		bodyModel[8] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 10
		bodyModel[9] = new ModelRendererTurbo(this, 202, 1, textureX, textureY); // Box 11
		bodyModel[10] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 12
		bodyModel[11] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 15
		bodyModel[13] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 16
		bodyModel[14] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 17
		bodyModel[15] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 19
		bodyModel[16] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 20
		bodyModel[17] = new ModelRendererTurbo(this, 443, 51, textureX, textureY); // Box 21
		bodyModel[18] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 22
		bodyModel[19] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 23
		bodyModel[20] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 24
		bodyModel[21] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 25
		bodyModel[22] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 26
		bodyModel[23] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 27
		bodyModel[24] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 28
		bodyModel[25] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 29
		bodyModel[26] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 30
		bodyModel[27] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 31
		bodyModel[28] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 32
		bodyModel[29] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 34
		bodyModel[30] = new ModelRendererTurbo(this, 401, 168, textureX, textureY); // Box 38
		bodyModel[31] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 39
		bodyModel[32] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 2
		bodyModel[33] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 3
		bodyModel[34] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 4
		bodyModel[35] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 5
		bodyModel[36] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 6
		bodyModel[37] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Box 7
		bodyModel[38] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 21
		bodyModel[39] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 22
		bodyModel[40] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 23
		bodyModel[41] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 24
		bodyModel[42] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 25
		bodyModel[43] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 26
		bodyModel[44] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 27
		bodyModel[45] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 28
		bodyModel[46] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 29
		bodyModel[47] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 32
		bodyModel[48] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 33
		bodyModel[49] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 34
		bodyModel[50] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 35
		bodyModel[51] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 36
		bodyModel[52] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 37
		bodyModel[53] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 38
		bodyModel[54] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 39
		bodyModel[55] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 40
		bodyModel[56] = new ModelRendererTurbo(this, 333, 424, textureX, textureY); // Box 97
		bodyModel[57] = new ModelRendererTurbo(this, 347, 424, textureX, textureY); // Box 98
		bodyModel[58] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 102
		bodyModel[59] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 103
		bodyModel[60] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 104
		bodyModel[61] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 105
		bodyModel[62] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Box 106
		bodyModel[63] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 107
		bodyModel[64] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 108
		bodyModel[65] = new ModelRendererTurbo(this, 433, 113, textureX, textureY); // Box 109
		bodyModel[66] = new ModelRendererTurbo(this, 257, 137, textureX, textureY); // Box 110

		bodyModel[0].addShapeBox(0F, 0F, 0F, 29, 5, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 0
		bodyModel[0].setRotationPoint(-16F, -9F, -12F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 29, 11, 23, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-16F, -20F, -12F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 29, 6, 21, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[2].setRotationPoint(-16F, -26F, -11F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 29, 2, 15, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[3].setRotationPoint(-16F, -28F, -8F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 14, 6, 21, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[4].setRotationPoint(-30F, -26F, -11F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 14, 11, 23, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[5].setRotationPoint(-30F, -20F, -12F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 28, 6, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, -4F); // Box 8
		bodyModel[6].setRotationPoint(-44F, -9F, -12F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[7].setRotationPoint(-30F, -28F, -8F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 14, 11, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[8].setRotationPoint(-44F, -20F, -12F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 14, 11, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[9].setRotationPoint(-44F, -20F, 6F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 14, 6, 3, 0F,0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[10].setRotationPoint(-44F, -26F, -11F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 14, 6, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[11].setRotationPoint(-44F, -26F, 7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 12, 4, 15, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, -5F); // Box 15
		bodyModel[12].setRotationPoint(-75F, -9F, -8F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 19, 11, 23, 0F,0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 16
		bodyModel[13].setRotationPoint(-63F, -20F, -12F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 19, 5, 21, 0F,0F, 0.5F, -7F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0.5F, -7F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 17
		bodyModel[14].setRotationPoint(-63F, -25F, -11F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 19, 6, 23, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -8F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, -8F); // Box 19
		bodyModel[15].setRotationPoint(-63F, -9F, -12F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 12, 11, 15, 0F,0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 20
		bodyModel[16].setRotationPoint(-75F, -20F, -8F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 12, 6, 13, 0F,0F, -3F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, -4F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F); // Box 21
		bodyModel[17].setRotationPoint(-75F, -25.5F, -7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 6, 4, 9, 0F,-1F, -1F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, -1F, -4F, 0F, -1F, -2F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, -2F); // Box 22
		bodyModel[18].setRotationPoint(-81F, -22.5F, -5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 6, 6, 4, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -3F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -3F, 0F, -2F); // Box 23
		bodyModel[19].setRotationPoint(-81F, -20F, 1F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 6, 6, 4, 0F,0F, -0.5F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -1F, -3F, 0F, -1F); // Box 24
		bodyModel[20].setRotationPoint(-81F, -20F, -6F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, -4F); // Box 25
		bodyModel[21].setRotationPoint(-78F, -9F, -6F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[22].setRotationPoint(-78F, -14F, -6F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 27
		bodyModel[23].setRotationPoint(-78F, -14F, 2F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 69, 12, 23, 0F,0F, -7F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -7F, 0F, 0F, 0F, -4F, 0F, -10F, -9F, 0F, -10F, -9F, 0F, 0F, -4F); // Box 28
		bodyModel[24].setRotationPoint(13F, -16F, -12F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 69, 11, 23, 0F,0F, 0F, -1F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -7F, -6F, 0F, -7F, -6F, 0F, 0F, 0F); // Box 29
		bodyModel[25].setRotationPoint(13F, -20F, -12F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 69, 6, 21, 0F,0F, 0F, -3F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 30
		bodyModel[26].setRotationPoint(13F, -26F, -11F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 69, 2, 15, 0F,0F, 0F, -2F, 0F, -1F, -7F, 0F, -1F, -7F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 31
		bodyModel[27].setRotationPoint(13F, -28F, -8F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 6, 5, 11, 0F,0.5F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, -4F, -3F, 0F, -4F, -3F, 0.5F, 0F, 0F); // Box 32
		bodyModel[28].setRotationPoint(82F, -26F, -6F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 19, 5, 3, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[29].setRotationPoint(31F, -32F, -2F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 32, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[30].setRotationPoint(50F, -32F, -2F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F,0F, 0F, -2F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 39
		bodyModel[31].setRotationPoint(82F, -27F, -3F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 14, 17, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[32].setRotationPoint(-44F, -26F, -8F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 14, 17, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[33].setRotationPoint(-44F, -26F, 6F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 16, 5, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 4
		bodyModel[34].setRotationPoint(-44F, -25F, -8F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 16, 5, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 5
		bodyModel[35].setRotationPoint(-44F, -25F, 2F);

		bodyModel[36].addBox(0F, 0F, 0F, 7, 1, 11, 0F); // Box 6
		bodyModel[36].setRotationPoint(-39F, -10F, -6F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 16, 11, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[37].setRotationPoint(-32F, -26F, -6F);

		bodyModel[38].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 21
		bodyModel[38].setRotationPoint(-51F, -27F, -7F);

		bodyModel[39].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 22
		bodyModel[39].setRotationPoint(-51F, -27F, 5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[40].setRotationPoint(-51F, -29F, 4F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 24
		bodyModel[41].setRotationPoint(-51F, -29F, -7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[42].setRotationPoint(-51F, -31F, 3F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 26
		bodyModel[43].setRotationPoint(-51F, -31F, -6F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 27
		bodyModel[44].setRotationPoint(-51F, -32F, -5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[45].setRotationPoint(-51F, -32F, 2F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[46].setRotationPoint(-51F, -33F, -4F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[47].setRotationPoint(-25F, -28F, 4F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[48].setRotationPoint(-25F, -30F, 3F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[49].setRotationPoint(-25F, -31F, 2F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[50].setRotationPoint(-25F, -32F, -4F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 36
		bodyModel[51].setRotationPoint(-25F, -31F, -5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 37
		bodyModel[52].setRotationPoint(-25F, -30F, -6F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[53].setRotationPoint(-25F, -28F, -7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[54].setRotationPoint(-53F, -32F, 2F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[55].setRotationPoint(-53F, -32F, -3F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 13, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[56].setRotationPoint(25F, -22F, -11.2F);
		bodyModel[56].rotateAngleX = -0.06981317F;
		bodyModel[56].rotateAngleY = 0.06981317F;

		bodyModel[57].addShapeBox(0F, -1F, 0F, 13, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[57].setRotationPoint(25F, -22F, 9F);
		bodyModel[57].rotateAngleX = 0.13962634F;
		bodyModel[57].rotateAngleY = -0.08726646F;

		bodyModel[58].addBox(0F, 0F, 0F, 3, 6, 12, 0F); // Box 102
		bodyModel[58].setRotationPoint(-44F, -25.2F, -6.5F);

		bodyModel[59].addBox(-8F, 0F, 0F, 8, 9, 2, 0F); // Box 103
		bodyModel[59].setRotationPoint(-41F, -23.2F, -7F);
		bodyModel[59].rotateAngleZ = 0.50614548F;

		bodyModel[60].addBox(-8F, 0F, 0F, 8, 9, 2, 0F); // Box 104
		bodyModel[60].setRotationPoint(-41F, -23.2F, 4F);
		bodyModel[60].rotateAngleZ = 0.50614548F;

		bodyModel[61].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 105
		bodyModel[61].setRotationPoint(-40.6F, -25.5F, -6.8F);
		bodyModel[61].rotateAngleY = 0.31415927F;

		bodyModel[62].addBox(-3F, 0F, 0F, 7, 3, 6, 0F); // Box 106
		bodyModel[62].setRotationPoint(-47F, -26.2F, -3.5F);
		bodyModel[62].rotateAngleZ = 0.33161256F;

		bodyModel[63].addBox(0F, -2F, 0F, 1, 2, 1, 0F); // Box 107
		bodyModel[63].setRotationPoint(-42.2F, -24.8F, -5F);
		bodyModel[63].rotateAngleZ = 0.10471976F;

		bodyModel[64].addShapeBox(-8F, 0F, 0F, 8, 10, 2, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 108
		bodyModel[64].setRotationPoint(-41F, -19.2F, -1.5F);
		bodyModel[64].rotateAngleZ = 0.20943951F;

		bodyModel[65].addBox(-12F, 0F, 0F, 12, 9, 2, 0F); // Box 109
		bodyModel[65].setRotationPoint(-31F, -17.2F, -7F);

		bodyModel[66].addBox(-12F, 0F, 0F, 12, 9, 2, 0F); // Box 110
		bodyModel[66].setRotationPoint(-31F, -17.2F, 4.3F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Box 35
		tailModel[1] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 37
		tailModel[2] = new ModelRendererTurbo(this, 369, 129, textureX, textureY); // Box 0
		tailModel[3] = new ModelRendererTurbo(this, 257, 145, textureX, textureY); // Box 1
		tailModel[4] = new ModelRendererTurbo(this, 345, 480, textureX, textureY); // Box 99
		tailModel[5] = new ModelRendererTurbo(this, 319, 480, textureX, textureY); // Box 100
		tailModel[6] = new ModelRendererTurbo(this, 329, 445, textureX, textureY); // Box 101
		tailModel[7] = new ModelRendererTurbo(this, 348, 445, textureX, textureY); // Box 102

		tailModel[0].addShapeBox(0F, 0F, 0F, 27, 28, 3, 0F,-25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		tailModel[0].setRotationPoint(50F, -60F, -2F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 14, 28, 3, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F); // Box 37
		tailModel[1].setRotationPoint(77F, -60F, -2F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 35, 4, 31, 0F,-25F, 0F, 0F, 0F, 0F, 0F, -15F, -2F, 0F, 0F, -2F, 0F, -25F, -2F, 0F, 0F, -2F, 0F, -15F, 0F, 0F, 0F, 0F, 0F); // Box 0
		tailModel[2].setRotationPoint(60F, -28F, -34F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 35, 4, 31, 0F,0F, -2F, 0F, -15F, -2F, 0F, 0F, 0F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, -2F, 0F, -25F, -2F, 0F); // Box 1
		tailModel[3].setRotationPoint(60F, -28F, 2F);

		tailModel[4].addBox(0F, 0F, 0F, 26, 6, 1, 0F); // Box 99
		tailModel[4].setRotationPoint(55F, -37F, -2.1F);

		tailModel[5].addBox(0F, 0F, 0F, 26, 6, 1, 0F); // Box 100
		tailModel[5].setRotationPoint(55F, -37F, 0.1F);

		tailModel[6].addBox(4F, 0F, 0F, 18, 15, 1, 0F); // Box 101
		tailModel[6].setRotationPoint(63F, -52F, 0F);

		tailModel[7].addBox(4F, 0F, 0F, 18, 15, 1, 0F); // Box 102
		tailModel[7].setRotationPoint(63F, -52F, -2F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 41
		leftWingModel[1] = new ModelRendererTurbo(this, 366, 192, textureX, textureY); // Box 97

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 85, 4, 81, 0F,-65F, 0F, 0F, 0F, 0F, 0F, -42F, -2F, 0F, 0F, -2F, 0F, -65F, -2F, 0F, 0F, -2F, 0F, -42F, 0F, 0F, 0F, 0F, 0F); // Box 41
		leftWingModel[0].setRotationPoint(-43F, -8F, -90F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 13, 2, 14, 0F,0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.2F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 97
		leftWingModel[1].setRotationPoint(14F, -7.55F, -77F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 40
		rightWingModel[1] = new ModelRendererTurbo(this, 363, 231, textureX, textureY); // Box 96

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 85, 4, 81, 0F,0F, -2F, 0F, -42F, -2F, 0F, 0F, 0F, 0F, -65F, 0F, 0F, 0F, 0F, 0F, -42F, 0F, 0F, 0F, -2F, 0F, -65F, -2F, 0F); // Box 40
		rightWingModel[0].setRotationPoint(-43F, -8F, 7F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 13, 2, 14, 0F,0F, -0.2F, 0F, 0F, -0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 96
		rightWingModel[1].setRotationPoint(14F, -7.55F, 61F);
	}

	private void initbodyWheelModel_1()
	{
		bodyWheelModel[0] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 0
		bodyWheelModel[1] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 0
		bodyWheelModel[2] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 1
		bodyWheelModel[3] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 2
		bodyWheelModel[4] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 3
		bodyWheelModel[5] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 4
		bodyWheelModel[6] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 5
		bodyWheelModel[7] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 6
		bodyWheelModel[8] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 7
		bodyWheelModel[9] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 8
		bodyWheelModel[10] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 9
		bodyWheelModel[11] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 10
		bodyWheelModel[12] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 11
		bodyWheelModel[13] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 12
		bodyWheelModel[14] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 13
		bodyWheelModel[15] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 14
		bodyWheelModel[16] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 15
		bodyWheelModel[17] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 16
		bodyWheelModel[18] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 17
		bodyWheelModel[19] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 18
		bodyWheelModel[20] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 19
		bodyWheelModel[21] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 20
		bodyWheelModel[22] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 21

		bodyWheelModel[0].addBox(0F, 0F, 0F, 2, 6, 2, 0F); // Box 0
		bodyWheelModel[0].setRotationPoint(-70F, -3F, -2F);

		bodyWheelModel[1].addBox(0F, 0F, 0F, 1, 6, 3, 0F); // Box 0
		bodyWheelModel[1].setRotationPoint(-68F, -7F, -2.5F);

		bodyWheelModel[2].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyWheelModel[2].setRotationPoint(-70F, -7F, -1.5F);

		bodyWheelModel[3].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyWheelModel[3].setRotationPoint(-72F, 3F, -2F);

		bodyWheelModel[4].addBox(0F, 0F, 0F, 6, 3, 2, 0F); // Box 3
		bodyWheelModel[4].setRotationPoint(-72F, 5F, -2F);

		bodyWheelModel[5].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 4
		bodyWheelModel[5].setRotationPoint(-72F, 8F, -2F);

		bodyWheelModel[6].addBox(0F, 0F, 0F, 1, 5, 3, 0F); // Box 5
		bodyWheelModel[6].setRotationPoint(-69F, -2F, -2.5F);

		bodyWheelModel[7].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Box 6
		bodyWheelModel[7].setRotationPoint(-72F, 1F, -2.5F);

		bodyWheelModel[8].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyWheelModel[8].setRotationPoint(-72F, -3F, -1.5F);

		bodyWheelModel[9].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyWheelModel[9].setRotationPoint(-2F, 3F, -8F);

		bodyWheelModel[10].addBox(0F, 0F, 0F, 6, 3, 2, 0F); // Box 9
		bodyWheelModel[10].setRotationPoint(-2F, 5F, -8F);

		bodyWheelModel[11].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 10
		bodyWheelModel[11].setRotationPoint(-2F, 8F, -8F);

		bodyWheelModel[12].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyWheelModel[12].setRotationPoint(-2F, 3F, 5F);

		bodyWheelModel[13].addBox(0F, 0F, 0F, 6, 3, 2, 0F); // Box 12
		bodyWheelModel[13].setRotationPoint(-2F, 5F, 5F);

		bodyWheelModel[14].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 13
		bodyWheelModel[14].setRotationPoint(-2F, 8F, 5F);

		bodyWheelModel[15].addBox(0F, 0F, 0F, 2, 7, 2, 0F); // Box 14
		bodyWheelModel[15].setRotationPoint(0F, -4F, -8F);

		bodyWheelModel[16].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 15
		bodyWheelModel[16].setRotationPoint(-2F, -4F, -8F);

		bodyWheelModel[17].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 16
		bodyWheelModel[17].setRotationPoint(-2F, -1F, -8F);

		bodyWheelModel[18].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 17
		bodyWheelModel[18].setRotationPoint(-2F, 0F, -8F);

		bodyWheelModel[19].addBox(0F, 0F, 0F, 2, 7, 2, 0F); // Box 18
		bodyWheelModel[19].setRotationPoint(0F, -4F, 5F);

		bodyWheelModel[20].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 19
		bodyWheelModel[20].setRotationPoint(-2F, 0F, 5F);

		bodyWheelModel[21].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 20
		bodyWheelModel[21].setRotationPoint(-2F, -1F, 5F);

		bodyWheelModel[22].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 21
		bodyWheelModel[22].setRotationPoint(-2F, -4F, 5F);
	}
}