//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 26.06.2016 - 03:57:48
// Last changed on: 26.06.2016 - 03:57:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelKP31 extends ModelGun //Same as Filename
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelKP31() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[77];
		ammoModel = new ModelRendererTurbo[14];

		initgunModel_1();
		initammoModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 0
		gunModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 1
		gunModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 2
		gunModel[4] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 3
		gunModel[5] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 4
		gunModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 5
		gunModel[7] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 6
		gunModel[8] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 7
		gunModel[9] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 9
		gunModel[10] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 10
		gunModel[11] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 11
		gunModel[12] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 13
		gunModel[13] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 14
		gunModel[14] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 15
		gunModel[15] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 16
		gunModel[16] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 17
		gunModel[17] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 18
		gunModel[18] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 19
		gunModel[19] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 21
		gunModel[20] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 22
		gunModel[21] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 23
		gunModel[22] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 24
		gunModel[23] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 25
		gunModel[24] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 26
		gunModel[25] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 27
		gunModel[26] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 28
		gunModel[27] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 29
		gunModel[28] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 30
		gunModel[29] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 31
		gunModel[30] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 32
		gunModel[31] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 33
		gunModel[32] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 34
		gunModel[33] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 35
		gunModel[34] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 36
		gunModel[35] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 38
		gunModel[36] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 39
		gunModel[37] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 40
		gunModel[38] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Box 41
		gunModel[39] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Box 42
		gunModel[40] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Box 43
		gunModel[41] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Box 44
		gunModel[42] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 45
		gunModel[43] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Box 46
		gunModel[44] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Box 47
		gunModel[45] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Box 48
		gunModel[46] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Box 50
		gunModel[47] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Box 51
		gunModel[48] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Box 52
		gunModel[49] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Box 53
		gunModel[50] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Box 129
		gunModel[51] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Box 130
		gunModel[52] = new ModelRendererTurbo(this, 625, 1, textureX, textureY); // Box 136
		gunModel[53] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Box 63
		gunModel[54] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Box 64
		gunModel[55] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Box 65
		gunModel[56] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Box 66
		gunModel[57] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Box 68
		gunModel[58] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Box 69
		gunModel[59] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Box 70
		gunModel[60] = new ModelRendererTurbo(this, 689, 1, textureX, textureY); // Box 71
		gunModel[61] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Box 72
		gunModel[62] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Box 73
		gunModel[63] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Box 74
		gunModel[64] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Box 75
		gunModel[65] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Box 76
		gunModel[66] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // Box 78
		gunModel[67] = new ModelRendererTurbo(this, 745, 1, textureX, textureY); // Box 81
		gunModel[68] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Box 82
		gunModel[69] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Box 83
		gunModel[70] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Box 84
		gunModel[71] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Box 85
		gunModel[72] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Box 86
		gunModel[73] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Box 87
		gunModel[74] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Box 88
		gunModel[75] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Box 89
		gunModel[76] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Box 90

		gunModel[0].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.6F, 0.05F, 0.25F, 0.6F, 0.05F, 0.25F, 0.6F, 0.05F, 0F, 0.6F, 0.05F); // Box 0
		gunModel[0].setRotationPoint(0F, -2.75F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.6F, -0.6F, 0.05F, 0.2F, 0F, 0.05F, 0.2F, 0F, 0.05F, -0.6F, -0.6F, 0.05F, -0.6F, 0.6F, 0.05F, 0.2F, 0.6F, 0.05F, 0.2F, 0.6F, 0.05F, -0.6F, 0.6F, 0.05F); // Box 0
		gunModel[1].setRotationPoint(-3.2F, -1.9F, -0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,-0.6F, 0F, 0.05F, 0.2F, 0F, 0.05F, 0.2F, 0F, 0.05F, -0.6F, 0F, 0.05F, -0.6F, 2.8F, 0.05F, 0.2F, 0.6F, 0.05F, 0.2F, 0.6F, 0.05F, -0.6F, 2.8F, 0.05F); // Box 1
		gunModel[2].setRotationPoint(-10.2F, -1.9F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.6F, -0.6F, 0.05F, 0.7F, -0.6F, 0.05F, 0.7F, -0.6F, 0.05F, -0.6F, -0.6F, 0.05F, -0.6F, 0.45F, 0.05F, 0.2F, -0.2F, 0.05F, 0.2F, -0.2F, 0.05F, -0.6F, 0.45F, 0.05F); // Box 2
		gunModel[3].setRotationPoint(-0.6F, -1.75F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.6F, -0.6F, 0.05F, 0.2F, -0.6F, 0.05F, 0.2F, -0.6F, 0.05F, -0.6F, -0.6F, 0.05F, -0.6F, 0.4F, 0.05F, -1.2F, 0.6F, 0.05F, -1.2F, 0.6F, 0.05F, -0.6F, 0.4F, 0.05F); // Box 3
		gunModel[4].setRotationPoint(-3.2F, -0.9F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0.8F, 0.05F, -0.3F, 0.55F, 0.05F, -0.3F, 0.55F, 0.05F, -0.3F, 0.8F, 0.05F, -0.3F, 0.8F, 0.05F, -0.3F, 0.6F, 0.05F, -0.3F, 0.6F, 0.05F, -0.3F, 0.8F, 0.05F); // Box 4
		gunModel[5].setRotationPoint(-3.3F, -1.1F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.45F, 0.05F, -0.3F, -0.55F, 0.05F, -0.3F, -0.55F, 0.05F, -0.3F, -0.45F, 0.05F, -0.3F, -0.2F, 0.05F, 0.05F, -0.35F, 0.05F, 0.05F, -0.35F, 0.05F, -0.3F, -0.2F, 0.05F); // Box 5
		gunModel[6].setRotationPoint(-2.9F, -2.1F, -0.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.7F, 0F, 0.05F, 0.2F, 0F, 0.05F, 0.2F, 0F, 0.05F, -0.7F, 0F, 0.05F, -0.9F, 2.6F, 0.05F, 0.2F, 2.8F, 0.05F, 0.2F, 2.8F, 0.05F, -0.9F, 2.6F, 0.05F); // Box 6
		gunModel[7].setRotationPoint(-10.8F, -1.9F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.9F, -0.7F, 0.05F, 0.15F, 0F, 0.05F, 0.15F, 0F, 0.05F, -0.9F, -0.7F, 0.05F, -1.25F, 0.9F, 0.05F, 0.25F, 0.9F, 0.05F, 0.25F, 0.9F, 0.05F, -1.25F, 0.9F, 0.05F); // Box 7
		gunModel[8].setRotationPoint(-11.25F, -1.9F, -0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.37F, 0F, 0.05F, -0.37F, 0F, 0.05F, -0.37F, 0F, 0.05F, -0.37F, 0F, 0.05F, -0.37F, 0.6F, 0.05F, -0.37F, 0.6F, 0.05F, -0.37F, 0.6F, 0.05F, -0.37F, 0.6F, 0.05F); // Box 9
		gunModel[9].setRotationPoint(6.88F, -2.75F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0.55F, 0.05F, -0.3F, 0.8F, 0.05F, -0.3F, 0.8F, 0.05F, -0.3F, 0.55F, 0.05F, -0.3F, -0.8F, 0.05F, -0.3F, -0.8F, 0.05F, -0.3F, -0.8F, 0.05F, -0.3F, -0.8F, 0.05F); // Box 10
		gunModel[10].setRotationPoint(-0.7F, -1.25F, -0.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.3F, 0.05F, 0.35F, -0.3F, 0.05F, 0.35F, -0.3F, 0.05F, 0F, -0.3F, 0.05F, 0F, -0.3F, 0.05F, 0.35F, -0.3F, 0.05F, 0.35F, -0.3F, 0.05F, 0F, -0.3F, 0.05F); // Box 11
		gunModel[11].setRotationPoint(-0.1F, -3.65F, -0.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.25F, -0.3F, 0.35F, -0.25F, -0.3F, 0.35F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.4F, 0.05F, 0.35F, -0.4F, 0.05F, 0.35F, -0.4F, 0.05F, 0F, -0.4F, 0.05F); // Box 13
		gunModel[12].setRotationPoint(-0.1F, -3.95F, -0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.25F, 0.05F, 0.35F, -0.25F, 0.05F, 0.35F, -0.25F, 0.05F, 0F, -0.25F, 0.05F, 0F, -0.4F, -0.3F, 0.35F, -0.4F, -0.3F, 0.35F, -0.4F, -0.3F, 0F, -0.4F, -0.3F); // Box 14
		gunModel[13].setRotationPoint(-0.1F, -3.2F, -0.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.4F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, 0.05F, -0.4F, -0.4F, 0.05F); // Box 15
		gunModel[14].setRotationPoint(6.85F, -3.95F, -0.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.4F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, 0.05F, -0.4F, -0.25F, 0.05F, -0.4F, -0.35F, -0.3F, -0.5F, -0.35F, -0.3F, -0.5F, -0.35F, 0.05F, -0.4F, -0.35F, 0.05F); // Box 16
		gunModel[15].setRotationPoint(6.85F, -3.6F, -0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.4F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, 0.05F, -0.4F, -0.4F, 0.05F, -0.4F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F); // Box 17
		gunModel[16].setRotationPoint(6.85F, -3.35F, -0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.4F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.6F, -0.15F, -0.5F, -0.6F, -0.15F, -0.5F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F); // Box 18
		gunModel[17].setRotationPoint(6.85F, -3.95F, -0.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.4F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F); // Box 19
		gunModel[18].setRotationPoint(6.85F, -3.35F, -0.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.4F, 0.05F, -0.4F, -0.4F, 0.05F, -0.4F, -0.4F, 0.05F, -0.4F, -0.4F, 0.05F); // Box 21
		gunModel[19].setRotationPoint(6.85F, -3.95F, -0.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.3F, 0.05F, -0.4F, -0.3F, 0.05F, -0.4F, -0.3F, 0.05F, -0.4F, -0.3F, 0.05F, -0.4F, -0.3F, 0.05F, -0.4F, -0.3F, 0.05F, -0.4F, -0.3F, 0.05F, -0.4F, -0.3F, 0.05F); // Box 22
		gunModel[20].setRotationPoint(6.85F, -3.65F, -0.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.25F, 0.05F, -0.4F, -0.25F, 0.05F, -0.4F, -0.25F, 0.05F, -0.4F, -0.25F, 0.05F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F); // Box 23
		gunModel[21].setRotationPoint(6.85F, -3.2F, -0.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.4F, -0.3F, 0.05F, -0.1F, -0.3F, 0.05F, -0.1F, -0.3F, 0.05F, -0.4F, -0.3F, 0.05F, -0.4F, -0.3F, 0.05F, -0.1F, -0.3F, 0.05F, -0.1F, -0.3F, 0.05F, -0.4F, -0.3F, 0.05F); // Box 24
		gunModel[22].setRotationPoint(8.75F, -3.65F, -0.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.4F, -0.25F, 0.05F, -0.1F, -0.25F, 0.05F, -0.1F, -0.25F, 0.05F, -0.4F, -0.25F, 0.05F, -0.4F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F); // Box 25
		gunModel[23].setRotationPoint(8.75F, -3.2F, -0.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.4F, -0.25F, -0.3F, -0.1F, -0.25F, -0.3F, -0.1F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.4F, 0.05F, -0.1F, -0.4F, 0.05F, -0.1F, -0.4F, 0.05F, -0.4F, -0.4F, 0.05F); // Box 26
		gunModel[24].setRotationPoint(8.75F, -3.95F, -0.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,-0.4F, -0.3F, -0.3F, -0.1F, -0.3F, -0.35F, -0.1F, -0.3F, -0.35F, -0.4F, -0.3F, -0.35F, -0.4F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.4F, -0.4F, 0F); // Box 27
		gunModel[25].setRotationPoint(9.75F, -3.95F, -0.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,-0.4F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.4F, -0.3F, 0F); // Box 28
		gunModel[26].setRotationPoint(8.75F, -3.65F, -0.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,-0.4F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.3F, -0.35F, -0.1F, -0.3F, -0.35F, -0.1F, -0.3F, -0.35F, -0.4F, -0.3F, -0.35F); // Box 29
		gunModel[27].setRotationPoint(9.75F, -3.35F, -0.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.05F, -0.2F, -0.2F, 0.05F, -0.2F, -0.2F, 0.35F, -0.2F); // Box 30
		gunModel[28].setRotationPoint(8.75F, -2.9F, -0.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.25F, -0.3F, -0.2F, -0.25F, -0.3F, -0.2F, -0.25F, -0.3F, -0.2F, -0.25F, -0.3F, -0.2F, -0.4F, 0.05F, -0.2F, -0.4F, 0.05F, -0.2F, -0.4F, 0.05F, -0.2F, -0.4F, 0.05F); // Box 31
		gunModel[29].setRotationPoint(19.3F, -3.95F, -0.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.3F, 0.05F, -0.2F, -0.3F, 0.05F, -0.2F, -0.3F, 0.05F, -0.2F, -0.3F, 0.05F, -0.2F, -0.3F, 0.05F, -0.2F, -0.3F, 0.05F, -0.2F, -0.3F, 0.05F, -0.2F, -0.3F, 0.05F); // Box 32
		gunModel[30].setRotationPoint(19.3F, -3.65F, -0.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.25F, 0.05F, -0.2F, -0.25F, 0.05F, -0.2F, -0.25F, 0.05F, -0.2F, -0.25F, 0.05F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F); // Box 33
		gunModel[31].setRotationPoint(19.3F, -3.2F, -0.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.4F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.35F, -0.4F, -0.1F, -0.35F, -0.4F, -0.1F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F); // Box 34
		gunModel[32].setRotationPoint(20.2F, -3.35F, -0.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.4F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F); // Box 35
		gunModel[33].setRotationPoint(20.2F, -3.65F, -0.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.4F, -0.35F, -0.4F, -0.1F, -0.35F, -0.4F, -0.1F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F); // Box 36
		gunModel[34].setRotationPoint(20.2F, -3.95F, -0.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.4F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F); // Box 38
		gunModel[35].setRotationPoint(20.6F, -3.9F, -0.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.4F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F); // Box 39
		gunModel[36].setRotationPoint(20.6F, -3.4F, -0.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.4F, -0.35F, -0.2F, -0.1F, -0.35F, -0.2F, -0.1F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.1F, -0.35F, -0.2F, -0.1F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F); // Box 40
		gunModel[37].setRotationPoint(20.6F, -3.65F, -0.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.25F, -0.45F, -0.2F, -0.25F, -0.45F, -0.2F, -0.25F, -0.45F, -0.2F, -0.25F, -0.45F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F); // Box 41
		gunModel[38].setRotationPoint(19.3F, -4.2F, -0.5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.25F, -0.45F, -0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.45F, -0.4F, -0.25F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F); // Box 42
		gunModel[39].setRotationPoint(19.3F, -4.55F, -0.5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.4F, 0.15F, 0F, -0.4F, 0.15F, 0F, -0.4F, 0.15F, -0.1F, -0.4F, 0.15F); // Box 43
		gunModel[40].setRotationPoint(-1F, -4F, -0.5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.4F, 0.15F, 0F, -0.4F, 0.15F, 0F, -0.4F, 0.15F, -0.1F, -0.4F, 0.15F, -0.1F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F); // Box 44
		gunModel[41].setRotationPoint(-1F, -3.3F, -0.5F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.3F, 0.15F, 0F, -0.3F, 0.15F, 0F, -0.3F, 0.15F, -0.1F, -0.3F, 0.15F, -0.1F, -0.2F, 0.15F, 0F, -0.2F, 0.15F, 0F, -0.2F, 0.15F, -0.1F, -0.2F, 0.15F); // Box 45
		gunModel[42].setRotationPoint(-1F, -3.7F, -0.5F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.45F, 0.1F, -0.35F, -0.45F, 0.1F, -0.35F, -0.45F, 0.1F, -0.35F, -0.45F, 0.1F, -0.35F, -0.45F, 0.1F, -0.35F, -0.45F, 0.1F, -0.35F, -0.45F, 0.1F, -0.35F, -0.45F, 0.1F); // Box 46
		gunModel[43].setRotationPoint(-0.65F, -2.75F, -1F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, 0.1F, -0.45F, -0.45F, 0.1F, -0.45F, -0.45F, 0.1F, -0.45F, -0.45F, 0.1F, -0.35F, -0.45F, 0.1F, -0.35F, -0.45F, 0.1F, -0.35F, -0.45F, 0.1F, -0.35F, -0.45F, 0.1F); // Box 47
		gunModel[44].setRotationPoint(-0.65F, -2.85F, -1F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.45F, 0.1F, -0.35F, -0.45F, 0.1F, -0.35F, -0.45F, 0.1F, -0.35F, -0.45F, 0.1F, -0.45F, -0.45F, 0.1F, -0.45F, -0.45F, 0.1F, -0.45F, -0.45F, 0.1F, -0.45F, -0.45F, 0.1F); // Box 48
		gunModel[45].setRotationPoint(-0.65F, -2.65F, -1F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F); // Box 50
		gunModel[46].setRotationPoint(-0.65F, -2.87F, -1.7F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F); // Box 51
		gunModel[47].setRotationPoint(-0.65F, -2.61F, -1.7F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.47F, -0.3F, -0.25F, -0.47F, -0.3F, -0.25F, -0.47F, -0.3F, -0.25F, -0.47F, -0.3F, -0.25F, -0.47F, -0.3F, -0.25F, -0.47F, -0.3F, -0.25F, -0.47F, -0.3F, -0.25F, -0.47F, -0.3F); // Box 52
		gunModel[48].setRotationPoint(-0.65F, -2.74F, -1.7F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F); // Box 53
		gunModel[49].setRotationPoint(-0.67F, -2.75F, -0.5F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.5F, -0.15F, -0.4F, -0.5F, -0.15F, -0.4F, -0.5F, -0.15F, -0.4F, -0.5F, -0.15F, -0.4F, -0.1F, -0.15F, -0.4F, -0.1F, -0.15F, -0.4F, -0.1F, -0.15F, -0.4F, -0.1F, -0.15F); // Box 129
		gunModel[50].setRotationPoint(0.75F, -1.75F, -0.5F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, -0.5F, -0.5F, -0.15F, -0.4F, -0.1F, -0.15F, -0.4F, -0.1F, -0.15F, -0.4F, -0.1F, -0.15F, -0.4F, -0.1F, -0.15F); // Box 130
		gunModel[51].setRotationPoint(0.75F, -2.15F, -0.5F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.5F, -0.15F, -0.4F, -0.5F, -0.15F, -0.4F, -0.5F, -0.15F, -0.3F, -0.5F, -0.15F, -0.6F, -0.1F, -0.15F, -0.4F, -0.1F, -0.15F, -0.4F, -0.1F, -0.15F, -0.6F, -0.1F, -0.15F); // Box 136
		gunModel[52].setRotationPoint(2.6F, -2.35F, -0.5F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F); // Box 63
		gunModel[53].setRotationPoint(2.55F, -2.05F, -0.5F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F); // Box 64
		gunModel[54].setRotationPoint(0.82F, -1.85F, -0.5F);
		gunModel[54].rotateAngleZ = 0.19198622F;

		gunModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.3F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.3F, -0.2F, 0F, -0.45F, -0.2F, -0.9F, -0.4F, -0.2F, -0.9F, -0.4F, -0.2F, 0F, -0.45F, -0.2F); // Box 65
		gunModel[55].setRotationPoint(2.55F, -0.75F, -0.5F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.35F, -0.2F, -0.45F, -0.3F, -0.2F, -0.45F, -0.3F, -0.2F, -0.45F, -0.35F, -0.2F, -0.9F, -0.45F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, -0.9F, -0.45F, -0.2F); // Box 66
		gunModel[56].setRotationPoint(1.1F, -0.68F, -0.5F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.45F, -0.2F, -0.1F, -0.45F, -0.2F, -0.1F, -0.45F, -0.2F, -0.25F, -0.45F, -0.2F, -0.25F, -0.45F, -0.2F, -0.1F, -0.45F, -0.2F, -0.1F, -0.45F, -0.2F, -0.25F, -0.45F, -0.2F); // Box 68
		gunModel[57].setRotationPoint(1.75F, -0.68F, -0.5F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.45F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F); // Box 69
		gunModel[58].setRotationPoint(1.4F, -2.1F, -0.5F);
		gunModel[58].rotateAngleZ = 0.12217305F;

		gunModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.48F, -0.35F, -0.3F, -0.48F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F); // Box 70
		gunModel[59].setRotationPoint(1.46F, -0.6F, -0.5F);
		gunModel[59].rotateAngleZ = 0.59341195F;

		gunModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.43F, -0.4F, -0.1F, -0.43F, -0.4F, -0.1F, -0.43F, -0.4F, -0.1F, -0.43F, -0.4F, -0.1F, -0.43F, -0.4F, -0.1F, -0.43F, -0.4F, -0.1F, -0.43F, -0.4F, -0.1F, -0.43F, -0.4F); // Box 71
		gunModel[60].setRotationPoint(2.75F, -1.35F, -0.5F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F); // Box 72
		gunModel[61].setRotationPoint(3.05F, -1.5F, -0.5F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.45F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.5F, -0.35F, -0.2F, -0.5F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F); // Box 73
		gunModel[62].setRotationPoint(6.65F, -2.15F, -0.5F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.45F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.5F, -0.35F, -0.2F, -0.5F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F); // Box 74
		gunModel[63].setRotationPoint(6.2F, -2.3F, -0.5F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.05F, -0.25F, -0.2F, 0.35F, -0.25F, -0.2F, 0.35F, -0.25F, -0.2F, -0.05F, -0.25F, -0.2F, -0.05F, -0.4F, -0.2F, 0.35F, -0.4F, -0.2F, 0.35F, -0.4F, -0.2F, -0.05F, -0.4F, -0.2F); // Box 75
		gunModel[64].setRotationPoint(2.25F, -4.05F, -0.5F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.25F, -0.5F, 0.3F, 0.2F, -0.5F, 0.3F, 0.2F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.4F, -0.5F, 0.3F, -0.4F, -0.5F, 0.3F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F); // Box 76
		gunModel[65].setRotationPoint(3.4F, -4.05F, -0.3F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.05F, -0.1F, -0.2F, 0.35F, -0.25F, -0.2F, 0.35F, -0.25F, -0.2F, -0.05F, -0.1F, -0.2F, -0.05F, -0.4F, -0.2F, 0.35F, -0.4F, -0.2F, 0.35F, -0.4F, -0.2F, -0.05F, -0.4F, -0.2F); // Box 78
		gunModel[66].setRotationPoint(5.1F, -4.05F, -0.5F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F); // Box 81
		gunModel[67].setRotationPoint(5F, -4.15F, -0.5F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.05F, -0.42F, -0.3F, 0.6F, -0.42F, -0.3F, 0.6F, -0.42F, -0.3F, -0.05F, -0.42F, -0.3F, -0.05F, -0.42F, -0.3F, 0.6F, -0.42F, -0.3F, 0.6F, -0.42F, -0.3F, -0.05F, -0.42F, -0.3F); // Box 82
		gunModel[68].setRotationPoint(3.25F, -4.6F, -0.5F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.25F, -0.5F, 0.3F, 0.2F, -0.5F, 0.3F, 0.2F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.4F, -0.5F, 0.3F, -0.4F, -0.5F, 0.3F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F); // Box 83
		gunModel[69].setRotationPoint(3.4F, -4.05F, -0.8F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0.2F, -0.5F, -0.4F, 0.2F, -0.5F, -0.4F, 0.2F, -0.4F, -0.4F, 0.2F, -0.4F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 84
		gunModel[70].setRotationPoint(4.3F, -4.05F, -0.8F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0.2F, -0.5F, -0.4F, 0.2F, -0.5F, -0.4F, 0.2F, -0.4F, -0.4F, 0.2F, -0.4F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 85
		gunModel[71].setRotationPoint(4.3F, -4.05F, -0.3F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0.2F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.5F, 0.3F, 0.2F, -0.5F, 0.3F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.5F, 0.3F, -0.4F, -0.5F); // Box 86
		gunModel[72].setRotationPoint(5.2F, -4.05F, -0.2F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0.2F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.5F, 0.3F, 0.2F, -0.5F, 0.3F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.5F, 0.3F, -0.4F, -0.5F); // Box 87
		gunModel[73].setRotationPoint(5.2F, -4.05F, -0.7F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F); // Box 88
		gunModel[74].setRotationPoint(2.85F, -4.75F, -0.35F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F); // Box 89
		gunModel[75].setRotationPoint(2.85F, -4.75F, -0.65F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F); // Box 90
		gunModel[76].setRotationPoint(3F, -4.6F, -0.5F);
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 91
		ammoModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 92
		ammoModel[2] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 93
		ammoModel[3] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Box 94
		ammoModel[4] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Box 95
		ammoModel[5] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 96
		ammoModel[6] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 97
		ammoModel[7] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Box 98
		ammoModel[8] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Box 99
		ammoModel[9] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Box 100
		ammoModel[10] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 101
		ammoModel[11] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Box 103
		ammoModel[12] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Box 104
		ammoModel[13] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Box 105

		ammoModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.1F, -0.4F, 0.4F, -0.1F, -0.4F, 0.4F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, 0.7F, 0.95F, 0.4F, 0.7F, 0.95F, 0.4F, 0.7F, 0.95F, 0F, 0.7F, 0.95F); // Box 91
		ammoModel[0].setRotationPoint(7.5F, -2.65F, -1.5F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.7F, 0.95F, 0.4F, 0.7F, 0.95F, 0.4F, 0.7F, 0.95F, 0F, 0.7F, 1F, 0F, -0.1F, -0.3F, 0.4F, -0.1F, -0.3F, 0.4F, -0.1F, -0.3F, 0F, -0.1F, -0.3F); // Box 92
		ammoModel[1].setRotationPoint(7.5F, 1.35F, -1.5F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.7F, 0.95F, 0.4F, 0.7F, 0.95F, 0.4F, 0.7F, 0.95F, 0F, 0.7F, 0.95F, 0F, -0.1F, 0.95F, 0.4F, -0.1F, 0.95F, 0.4F, -0.1F, 0.95F, 0F, -0.1F, 0.95F); // Box 93
		ammoModel[2].setRotationPoint(7.5F, -0.25F, -1.5F);

		ammoModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.4F, -0.4F, 0.3F, -0.4F, -0.4F, 0.3F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, 0.3F, -0.4F, -0.4F, 0.3F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F); // Box 94
		ammoModel[3].setRotationPoint(7.5F, -3.1F, -0.3F);

		ammoModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.4F, -0.4F, 0.3F, -0.4F, -0.4F, 0.3F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, 0.3F, -0.4F, -0.4F, 0.3F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F); // Box 95
		ammoModel[4].setRotationPoint(7.5F, -3.1F, -0.7F);

		ammoModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, 0.4F, -0.8F, 0F, 0.4F, -0.8F, 0F, 0.4F, -0.8F, 0F, 0.4F, -0.8F); // Box 96
		ammoModel[5].setRotationPoint(8F, -2.65F, -1.5F);

		ammoModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.15F, -0.2F, 0F, -0.15F, -0.2F, 0F, -0.15F, -0.2F, 0F, -0.15F, -0.2F, 0F, -0.15F, -0.2F, 0F, -0.15F, -0.2F, 0F, -0.15F, -0.2F, 0F, -0.15F, -0.2F); // Box 97
		ammoModel[6].setRotationPoint(8F, -0.65F, -1.5F);

		ammoModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 98
		ammoModel[7].setRotationPoint(8.05F, -0.65F, -0.5F);

		ammoModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 99
		ammoModel[8].setRotationPoint(8.05F, -0.45F, -0.5F);

		ammoModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 100
		ammoModel[9].setRotationPoint(8.05F, -0.85F, -0.5F);

		ammoModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, 0.4F, -1F, 0F, 0.4F, -1F, 0F, 0.4F, -1F, 0F, 0.4F, -1F); // Box 101
		ammoModel[10].setRotationPoint(7.45F, -2.65F, -1.5F);

		ammoModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F); // Box 103
		ammoModel[11].setRotationPoint(7.1F, -0.9F, -0.5F);

		ammoModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F); // Box 104
		ammoModel[12].setRotationPoint(7.1F, -0.65F, -0.5F);

		ammoModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F); // Box 105
		ammoModel[13].setRotationPoint(7.1F, -0.4F, -0.5F);
		
		animationType = EnumAnimationType.PISTOL_CLIP;
		translateAll(0F, -2F, 0F);

		gunSlideDistance = 0.1F;
	}
}