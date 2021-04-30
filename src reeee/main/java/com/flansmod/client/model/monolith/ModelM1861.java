//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 07.08.2016 - 12:07:56
// Last changed on: 07.08.2016 - 12:07:56

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelM1861 extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelM1861() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[67];
		ammoModel = new ModelRendererTurbo[1];

		initgunModel_1();
		initammoModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 5
		gunModel[5] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 6
		gunModel[6] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 7
		gunModel[7] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 8
		gunModel[8] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 9
		gunModel[9] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 10
		gunModel[10] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 11
		gunModel[11] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 12
		gunModel[12] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 13
		gunModel[13] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 14
		gunModel[14] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 15
		gunModel[15] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 16
		gunModel[16] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 17
		gunModel[17] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 0
		gunModel[18] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 1
		gunModel[19] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 2
		gunModel[20] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 3
		gunModel[21] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 4
		gunModel[22] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 5
		gunModel[23] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 6
		gunModel[24] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 7
		gunModel[25] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 8
		gunModel[26] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 9
		gunModel[27] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 11
		gunModel[28] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 12
		gunModel[29] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 13
		gunModel[30] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 14
		gunModel[31] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 15
		gunModel[32] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 16
		gunModel[33] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 17
		gunModel[34] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 18
		gunModel[35] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 20
		gunModel[36] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 21
		gunModel[37] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 22
		gunModel[38] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 23
		gunModel[39] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 24
		gunModel[40] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 25
		gunModel[41] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 26
		gunModel[42] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 27
		gunModel[43] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 28
		gunModel[44] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 29
		gunModel[45] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 30
		gunModel[46] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 31
		gunModel[47] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 32
		gunModel[48] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 33
		gunModel[49] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 34
		gunModel[50] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 35
		gunModel[51] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 36
		gunModel[52] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 37
		gunModel[53] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 38
		gunModel[54] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 39
		gunModel[55] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 40
		gunModel[56] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 41
		gunModel[57] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 42
		gunModel[58] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 43
		gunModel[59] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 44
		gunModel[60] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 45
		gunModel[61] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 46
		gunModel[62] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 47
		gunModel[63] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 48
		gunModel[64] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 49
		gunModel[65] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 50
		gunModel[66] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 51

		gunModel[0].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F,0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.3F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, 0.3F, -0.25F); // Box 0
		gunModel[0].setRotationPoint(3.7F, -4.9F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 19, 2, 2, 0F,0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F); // Box 1
		gunModel[1].setRotationPoint(20.7F, -4.9F, -0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 21, 2, 2, 0F,0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F, 0F, -0.4F, -0.25F); // Box 2
		gunModel[2].setRotationPoint(39.7F, -4.9F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.15F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, -0.15F, -0.25F, 0F, 1F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 1F, -0.25F); // Box 3
		gunModel[3].setRotationPoint(0.699999999999999F, -4.9F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, -1.8F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, -1.8F, -0.25F, 0F, 2.5F, -0.25F, 0F, 0.35F, -0.25F, 0F, 0.35F, -0.25F, 0F, 2.5F, -0.25F); // Box 5
		gunModel[4].setRotationPoint(-5.3F, -4.25F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, -1.8F, -0.25F, 0F, 0.35F, -0.25F, 0F, 0.35F, -0.25F, 0F, -1.8F, -0.25F, 0F, 4.6F, -0.25F, 0F, 0.35F, -0.25F, 0F, 0.35F, -0.25F, 0F, 4.6F, -0.25F); // Box 6
		gunModel[5].setRotationPoint(-17.3F, -2.1F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F,0F, -1.8F, -0.25F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F, 0F, -1.8F, -0.25F, 0F, 2.5F, -0.25F, 0F, 0.35F, -0.25F, 0F, 0.35F, -0.25F, 0F, 2.5F, -0.25F); // Box 7
		gunModel[6].setRotationPoint(-17.3F, -3.8F, -0.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F,0F, -2.4F, -0.25F, -0.5F, -1.5F, -0.25F, -0.5F, -1.5F, -0.25F, 0F, -2.4F, -0.25F, 0F, 1.8F, -0.25F, 0F, 0.6F, -0.25F, 0F, 0.6F, -0.25F, 0F, 1.8F, -0.25F); // Box 8
		gunModel[7].setRotationPoint(-17.3F, -4.8F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.65F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -0.65F, -0.25F, 0F, 0.4F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.4F, -0.25F); // Box 9
		gunModel[8].setRotationPoint(-5.3F, -3.85F, -0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.15F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.15F, -0.25F, -0.6F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.6F, 0F, -0.25F); // Box 10
		gunModel[9].setRotationPoint(-19.3F, -2.4F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.6F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.6F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F); // Box 11
		gunModel[10].setRotationPoint(-19.3F, -0.4F, -0.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -0.9F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.9F, 0F, -0.25F); // Box 12
		gunModel[11].setRotationPoint(-19.3F, 1.6F, -0.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.9F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.9F, 0F, -0.25F, -1.3F, -0.2F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, -1.3F, -0.2F, -0.25F); // Box 13
		gunModel[12].setRotationPoint(-19.3F, 3.6F, -0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.4F, 0.05F, -0.25F, 0.4F, 0.15F, -0.25F, 0.4F, 0.15F, -0.25F, 0.4F, 0.05F, -0.25F, 0.4F, -0.4F, -0.25F, 0.8F, -0.4F, -0.25F, 0.8F, -0.4F, -0.25F, 0.4F, -0.4F, -0.25F); // Box 14
		gunModel[13].setRotationPoint(4.1F, -5.6F, -0.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 60, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F); // Box 15
		gunModel[14].setRotationPoint(6.7F, -5.4F, -0.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 58, 1, 2, 0F,2.15F, -0.43F, -0.85F, 0F, -0.5F, -0.85F, 0F, -0.5F, -0.85F, 2.15F, -0.43F, -0.85F, 3F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 3F, -0.2F, -0.5F); // Box 16
		gunModel[15].setRotationPoint(8.7F, -6.2F, -0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 59, 1, 2, 0F,3F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 3F, -0.2F, -0.5F, 2F, -0.5F, -0.85F, 0F, -0.5F, -0.85F, 0F, -0.5F, -0.85F, 2F, -0.5F, -0.85F); // Box 17
		gunModel[16].setRotationPoint(7.7F, -5.2F, -0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0.1F, -0.25F, -0.5F, 0.1F, -0.25F, -0.5F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, -0.6F, -0.25F, -0.8F, -1F, -0.25F, -0.8F, -1F, -0.25F, 0F, -0.6F, -0.25F); // Box 0
		gunModel[17].setRotationPoint(60.7F, -4.9F, -0.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.15F, -0.7F, 0F, -0.15F, -0.7F, 0F, -0.15F, -0.7F, 0F, -0.15F, -0.7F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 1
		gunModel[18].setRotationPoint(56.2F, -5.9F, -0.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.15F, -0.7F, 0F, -0.15F, -0.7F, 0F, -0.15F, -0.7F, 0F, -0.15F, -0.7F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 2
		gunModel[19].setRotationPoint(38.2F, -5.9F, -0.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.13F, -0.7F, 0F, -0.13F, -0.7F, 0F, -0.13F, -0.7F, 0F, -0.13F, -0.7F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 3
		gunModel[20].setRotationPoint(20.5F, -5.9F, -0.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.15F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F); // Box 4
		gunModel[21].setRotationPoint(56.2F, -5.15F, -0.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.15F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 5
		gunModel[22].setRotationPoint(38.2F, -5.15F, -0.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.15F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 6
		gunModel[23].setRotationPoint(20.5F, -5.15F, -0.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 7
		gunModel[24].setRotationPoint(56.7F, -4.4F, 0F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.4F); // Box 8
		gunModel[25].setRotationPoint(64.5F, -4.4F, 0F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F); // Box 9
		gunModel[26].setRotationPoint(63.7F, -6.4F, 0F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, -0.7F, -0.1F, -0.2F, -0.7F, -0.1F, -0.2F, -0.7F, -0.1F, -0.2F, -0.7F, -0.1F, -0.2F, -0.7F, -0.1F, -0.2F, -0.7F, -0.1F, -0.2F, -0.7F, -0.1F, -0.2F, -0.7F, -0.1F); // Box 11
		gunModel[27].setRotationPoint(8.5F, -5F, 0.45F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, -0.7F, -0.1F, -0.2F, -0.7F, -0.1F, -0.2F, -0.7F, -0.1F, -0.2F, -0.7F, -0.1F, -0.2F, -0.7F, -0.1F, -0.2F, -0.7F, -0.1F, -0.2F, -0.7F, -0.1F, -0.2F, -0.7F, -0.1F); // Box 12
		gunModel[28].setRotationPoint(5.1F, -6.2F, 0.45F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.1F, -0.7F, -0.3F, -0.15F, -0.7F, -0.3F, -0.15F, -0.7F, -0.3F, -0.1F, -0.7F, -0.3F, -0.1F, -0.7F, -0.3F, -0.15F, -0.7F, -0.3F, -0.15F, -0.7F, -0.3F, -0.1F, -0.7F, -0.3F); // Box 13
		gunModel[29].setRotationPoint(3F, -6.8F, -1F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.3F, -0.7F, -0.3F, -0.2F, -0.7F, -0.3F, -0.2F, -0.7F, -0.3F, -0.3F, -0.7F, -0.3F, -0.2F, -1.2F, -0.3F, -0.2F, -0.7F, -0.3F, -0.2F, -0.7F, -0.3F, -0.2F, -1.2F, -0.3F); // Box 14
		gunModel[30].setRotationPoint(2.3F, -5.8F, -1F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, -0.7F, -0.3F, -0.2F, -0.7F, -0.3F, -0.2F, -0.7F, -0.3F, -0.8F, -0.7F, -0.3F, -0.3F, -1.3F, -0.3F, -0.2F, -1.3F, -0.3F, -0.2F, -1.3F, -0.3F, -0.3F, -1.3F, -0.3F); // Box 15
		gunModel[31].setRotationPoint(2.3F, -6.8F, -1F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.3F, -0.6F, -0.3F, -0.3F, -1.5F, -0.3F, -0.3F, -1.5F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.7F, -0.3F, -0.3F, -1F, -0.3F, -0.3F, -1F, -0.3F, -0.3F, -0.7F, -0.3F); // Box 16
		gunModel[32].setRotationPoint(3.55F, -5.8F, -1F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.2F, -1.3F, -0.3F, -0.3F, -1.3F, -0.3F, -0.3F, -1.3F, -0.3F, -0.2F, -1.3F, -0.3F, -0.2F, -1F, -0.3F, -0.8F, -1F, -0.3F, -0.8F, -1F, -0.3F, -0.2F, -1F, -0.3F); // Box 17
		gunModel[33].setRotationPoint(3.65F, -7.4F, -1F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.7F, -0.3F, 0F, -0.7F, -0.3F, 0F, -0.7F, -0.1F, 0F, -0.7F, -0.1F, -0.1F, -0.7F, -0.3F, 0F, -0.7F, -0.3F, 0F, -0.7F, -0.1F, -0.1F, -0.7F, -0.1F); // Box 18
		gunModel[34].setRotationPoint(3F, -7.4F, -1F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.7F, -0.3F, -0.65F, -0.55F, -0.3F, -0.65F, -0.55F, -0.1F, 0F, -0.7F, -0.1F, 0F, -0.7F, -0.3F, -0.65F, -0.7F, -0.3F, -0.65F, -0.7F, -0.1F, 0F, -0.7F, -0.1F); // Box 20
		gunModel[35].setRotationPoint(4F, -7.4F, -1F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.7F, -0.3F, -0.65F, -0.6F, -0.3F, -0.65F, -0.6F, -0.1F, 0F, -0.7F, -0.1F, 0F, -0.55F, -0.3F, -0.65F, -0.65F, -0.3F, -0.65F, -0.65F, -0.1F, 0F, -0.55F, -0.1F); // Box 21
		gunModel[36].setRotationPoint(4.35F, -7.55F, -1F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.3F, -0.65F, -0.6F, -0.3F, -0.65F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.65F, -0.3F, -0.65F, -0.65F, -0.3F, -0.65F, -0.65F, -0.1F, 0F, -0.65F, -0.1F); // Box 22
		gunModel[37].setRotationPoint(4.7F, -7.55F, -1F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.3F, -0.65F, -0.8F, -0.3F, -0.65F, -0.8F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.65F, -0.3F, -0.65F, -0.45F, -0.3F, -0.65F, -0.45F, -0.1F, 0F, -0.65F, -0.1F); // Box 23
		gunModel[38].setRotationPoint(5.05F, -7.55F, -1F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.3F, -0.6F, -0.95F, -0.3F, -0.6F, -0.95F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.65F, -0.3F, -0.95F, -0.65F, -0.3F, -0.95F, -0.65F, -0.1F, 0F, -0.65F, -0.1F); // Box 24
		gunModel[39].setRotationPoint(5.4F, -7.35F, -1F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.1F, 0F, -0.3F, -0.85F, 0F, -0.3F, -0.9F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0F, -0.7F, -0.3F, -0.5F, -0.7F, -0.3F, -0.5F, -0.7F, -0.1F, 0F, -0.7F, -0.1F); // Box 25
		gunModel[40].setRotationPoint(3F, -8F, -1F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, -0.7F, -0.4F, 0.15F, -0.7F, -0.4F, 0.15F, -0.7F, -0.4F, 0F, -0.7F, -0.4F, 0F, -0.5F, -0.4F, 0.15F, -0.8F, -0.4F, 0.15F, -0.8F, -0.4F, 0F, -0.5F, -0.4F); // Box 26
		gunModel[41].setRotationPoint(3.8F, -5.8F, -0.75F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.15F, -0.6F, -0.4F, 0.15F, -0.6F, -0.4F, 0.15F, -0.6F, -0.4F, -0.15F, -0.6F, -0.4F, -0.15F, -0.6F, -0.4F, 0.15F, -0.6F, -0.4F, 0.15F, -0.6F, -0.4F, -0.15F, -0.6F, -0.4F); // Box 27
		gunModel[42].setRotationPoint(6.8F, -5F, -0.75F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, -0.6F, -0.4F, -0.35F, -0.85F, -0.4F, -0.35F, -0.85F, -0.4F, -0.3F, -0.6F, -0.4F, -0.3F, -0.6F, -0.4F, -0.35F, -0.85F, -0.4F, -0.35F, -0.85F, -0.4F, -0.3F, -0.6F, -0.4F); // Box 28
		gunModel[43].setRotationPoint(8.65F, -5F, -0.75F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.15F, -0.6F, -0.4F, -0.3F, -1.3F, -0.4F, -0.3F, -1.3F, -0.4F, -0.15F, -0.6F, -0.4F, -0.15F, -0.7F, -0.4F, -0.3F, -0.7F, -0.4F, -0.3F, -0.7F, -0.4F, -0.15F, -0.7F, -0.4F); // Box 29
		gunModel[44].setRotationPoint(6.8F, -5.7F, -0.75F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.15F, -1F, -0.4F, -0.25F, -1.3F, -0.4F, -0.2F, -1.3F, -0.4F, -0.15F, -1F, -0.4F, -0.4F, -0.7F, -0.4F, -0.2F, -0.7F, -0.4F, -0.2F, -0.7F, -0.4F, -0.4F, -0.7F, -0.4F); // Box 30
		gunModel[45].setRotationPoint(7.1F, -5.7F, -0.75F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0.15F, -1.4F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0.15F, -1.4F, -0.4F, 0.15F, -0.5F, -0.4F, 0F, -0.7F, -0.4F, 0F, -0.7F, -0.4F, 0.15F, -0.5F, -0.4F); // Box 31
		gunModel[46].setRotationPoint(1.8F, -5.6F, -0.75F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.1F, -0.15F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.15F, -0.4F); // Box 32
		gunModel[47].setRotationPoint(0.85F, -4F, -0.75F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -1.3F, -0.4F, -0.15F, -1F, -0.4F, -0.15F, -1F, -0.4F, -0.2F, -1.3F, -0.4F, -0.2F, -0.7F, -0.4F, 0.6F, -0.7F, -0.4F, 0.6F, -0.7F, -0.4F, -0.2F, -0.7F, -0.4F); // Box 33
		gunModel[48].setRotationPoint(3.58F, -6.4F, -0.75F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.1F, -0.5F, -0.25F, -0.1F, -0.5F, -0.25F, -0.1F, -0.5F, -0.35F, -0.1F, -0.5F, -0.35F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.35F, -0.1F, -0.4F, -0.35F); // Box 34
		gunModel[49].setRotationPoint(5.1F, -5.8F, -0.9F);
		gunModel[49].rotateAngleZ = 0.75049158F;

		gunModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.35F, -0.25F, -0.1F, -0.35F, -0.25F, -0.1F, -0.35F, -0.35F, -0.1F, -0.35F, -0.35F, -0.3F, -0.35F, -0.25F, -0.3F, -0.35F, -0.25F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F); // Box 35
		gunModel[50].setRotationPoint(5.95F, -4.89F, -0.9F);
		gunModel[50].rotateAngleZ = 0.75049158F;

		gunModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.35F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.7F, -0.35F); // Box 36
		gunModel[51].setRotationPoint(4.75F, -6.2F, -0.9F);
		gunModel[51].rotateAngleZ = 0.75049158F;

		gunModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.7F, -0.6F, -0.7F, 0.7F, -0.5F, -0.7F, 0.7F, -0.5F, -0.7F, 0.7F, -0.6F, -0.7F, 0.7F, -0.2F, -0.45F, 0.7F, -0.2F, -0.45F, 0.7F, -0.2F, -0.45F, 0.7F, -0.2F, -0.45F); // Box 37
		gunModel[52].setRotationPoint(4.85F, -6.27F, -0.5F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F); // Box 38
		gunModel[53].setRotationPoint(4.2F, -3.1F, 0F);
		gunModel[53].rotateAngleZ = -0.13962634F;

		gunModel[54].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F); // Box 39
		gunModel[54].setRotationPoint(0.6F, -2.7F, 0F);
		gunModel[54].rotateAngleZ = 0.13962634F;

		gunModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F); // Box 40
		gunModel[55].setRotationPoint(4.14F, -1.5F, 0F);
		gunModel[55].rotateAngleZ = -0.89011792F;

		gunModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F); // Box 41
		gunModel[56].setRotationPoint(3.65F, -1F, 0F);
		gunModel[56].rotateAngleZ = -1.41371669F;

		gunModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F); // Box 42
		gunModel[57].setRotationPoint(2.43F, -0.65F, 0F);
		gunModel[57].rotateAngleZ = -2.21656815F;

		gunModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F); // Box 43
		gunModel[58].setRotationPoint(2.95F, -0.85F, 0F);
		gunModel[58].rotateAngleZ = -1.57079633F;

		gunModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F); // Box 44
		gunModel[59].setRotationPoint(2.6F, -3.6F, 0F);
		gunModel[59].rotateAngleZ = -0.36651914F;

		gunModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.2F, -0.1F, -0.5F, -0.2F, -0.1F, -0.5F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F); // Box 45
		gunModel[60].setRotationPoint(3F, -0.78F, 0F);
		gunModel[60].rotateAngleZ = -2.98451302F;

		gunModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F); // Box 46
		gunModel[61].setRotationPoint(3.3F, -0.55F, 0F);
		gunModel[61].rotateAngleZ = -2.68780705F;

		gunModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F); // Box 47
		gunModel[62].setRotationPoint(4.05F, -3.1F, 0F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 1.2F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F); // Box 48
		gunModel[63].setRotationPoint(0.75F, -2.6F, 0F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.1F, -0.6F, -0.1F, -0.1F, -0.8F, -0.1F, -0.1F, -0.8F, -0.1F, -0.1F, -0.6F, -0.1F, -0.1F, -0.8F, -0.1F, -0.1F, -0.8F, -0.1F, -0.1F, -0.8F, -0.1F, -0.1F, -0.8F, -0.1F); // Box 49
		gunModel[64].setRotationPoint(9.5F, -6.7F, 0F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.3F, -0.4F, -0.8F, -0.3F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.3F, -0.4F, -0.8F, -0.3F); // Box 50
		gunModel[65].setRotationPoint(9.2F, -7.05F, 0.2F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.3F, -0.4F, -0.8F, -0.3F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.3F, -0.4F, -0.8F, -0.3F); // Box 51
		gunModel[66].setRotationPoint(9.2F, -7.05F, -0.3F);
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 67

		ammoModel[0].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.21F, -0.21F, 0F, -0.21F, -0.21F, 0F, -0.21F, -0.21F, 0F, -0.21F, -0.21F, 0F, -0.21F, -0.21F, 0F, -0.21F, -0.21F, 0F, -0.21F, -0.21F, 0F, -0.21F, -0.21F); // Box 67
		ammoModel[0].setRotationPoint(64.5F, -5.7F, 0F);
		
		translateAll(0F, -8F, -0.5F);
		animationType = EnumAnimationType.END_LOADED;
	}
}