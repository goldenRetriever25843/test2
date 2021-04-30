//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 01.01.2018 - 19:27:06
// Last changed on: 01.01.2018 - 19:27:06

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelM12pistol extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelM12pistol() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[98];

		initgunModel_1();

		translateAll(0F, -1.2F, -0.5F);
		
		gunSlideDistance = 0.1F;
		animationType = EnumAnimationType.BULLPUP;


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 11
		gunModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 12
		gunModel[4] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 13
		gunModel[5] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 16
		gunModel[6] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 17
		gunModel[7] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 18
		gunModel[8] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 19
		gunModel[9] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 20
		gunModel[10] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 0
		gunModel[11] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 1
		gunModel[12] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 0
		gunModel[13] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 1
		gunModel[14] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 2
		gunModel[15] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 0
		gunModel[16] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 3
		gunModel[17] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 4
		gunModel[18] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 6
		gunModel[19] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 7
		gunModel[20] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 8
		gunModel[21] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 10
		gunModel[22] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 11
		gunModel[23] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 12
		gunModel[24] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 13
		gunModel[25] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 14
		gunModel[26] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 16
		gunModel[27] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 17
		gunModel[28] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 18
		gunModel[29] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 19
		gunModel[30] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 0
		gunModel[31] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 2
		gunModel[32] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 4
		gunModel[33] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 5
		gunModel[34] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 6
		gunModel[35] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 7
		gunModel[36] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 8
		gunModel[37] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 9
		gunModel[38] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 10
		gunModel[39] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 11
		gunModel[40] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 12
		gunModel[41] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 13
		gunModel[42] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 14
		gunModel[43] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 15
		gunModel[44] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 16
		gunModel[45] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 17
		gunModel[46] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 19
		gunModel[47] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 20
		gunModel[48] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 21
		gunModel[49] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 22
		gunModel[50] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 23
		gunModel[51] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 24
		gunModel[52] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 25
		gunModel[53] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 26
		gunModel[54] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 27
		gunModel[55] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 28
		gunModel[56] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 28
		gunModel[57] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 28
		gunModel[58] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 28
		gunModel[59] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 28
		gunModel[60] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 33
		gunModel[61] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 34
		gunModel[62] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 35
		gunModel[63] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 36
		gunModel[64] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 37
		gunModel[65] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 38
		gunModel[66] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 39
		gunModel[67] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 40
		gunModel[68] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 41
		gunModel[69] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 42
		gunModel[70] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 43
		gunModel[71] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 44
		gunModel[72] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 45
		gunModel[73] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 46
		gunModel[74] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 48
		gunModel[75] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 49
		gunModel[76] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 50
		gunModel[77] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 51
		gunModel[78] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 52
		gunModel[79] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 53
		gunModel[80] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 56
		gunModel[81] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 57
		gunModel[82] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 59
		gunModel[83] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 61
		gunModel[84] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 62
		gunModel[85] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 63
		gunModel[86] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 64
		gunModel[87] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 65
		gunModel[88] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 66
		gunModel[89] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 67
		gunModel[90] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 68
		gunModel[91] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 69
		gunModel[92] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 70
		gunModel[93] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 71
		gunModel[94] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 72
		gunModel[95] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 73
		gunModel[96] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 13
		gunModel[97] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 54

		gunModel[0].addShapeBox(0F, -2F, 0F, 1, 1, 1, 0F,-0.245F, -1.73F, -0.34F, -0.075F, -1.73F, -0.34F, -0.075F, -1.73F, -0.34F, -0.245F, -1.73F, -0.34F, -0.245F, 0.75F, -0.34F, -0.075F, 0.75F, -0.34F, -0.075F, 0.75F, -0.34F, -0.245F, 0.75F, -0.34F); // Box 0
		gunModel[0].setRotationPoint(0F, 0F, 0F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1.295F, -1.15F, -0.4F, 0.36F, -1.15F, -0.4F, 0.36F, -1.15F, -0.4F, -1.295F, -1.15F, -0.4F, -1.375F, 0.245F, -0.4F, 0.425F, 0.25F, -0.4F, 0.425F, 0.25F, -0.4F, -1.375F, 0.245F, -0.4F); // Box 1
		gunModel[1].setRotationPoint(0F, -3F, 0F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.7F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.1F, -0.3F, 0.7F, -0.1F, -0.3F, 0.7F, -0.75F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, -0.75F, -0.23F, 0.7F, -0.75F, -0.23F); // Box 11
		gunModel[2].setRotationPoint(3F, -3F, 0F);

		gunModel[3].addShapeBox(0F, -0.05F, 0F, 2, 1, 1, 0F,0F, -0.625F, -0.5F, 0.25F, -0.625F, -0.5F, 0.25F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.175F, -0.5F, 0.25F, -0.175F, -0.5F, 0.25F, -0.225F, -0.32F, 0F, -0.225F, -0.32F); // Box 12
		gunModel[3].setRotationPoint(2F, -3F, 0F);

		gunModel[4].addShapeBox(0F, -0.1F, 0F, 2, 1, 1, 0F,0.675F, -0.2F, -0.4F, -1.25F, -0.2F, -0.4F, -1.25F, -0.26F, -0.4F, 0.675F, -0.26F, -0.4F, 0.675F, -0.65F, -0.4F, -1.25F, -0.65F, -0.4F, -1.25F, -0.65F, -0.4F, 0.675F, -0.65F, -0.4F); // Box 13
		gunModel[4].setRotationPoint(1F, -3F, 0F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -0.1F, -0.3F, 0.2F, -0.1F, -0.3F, 0.2F, -0.75F, -0.5F, -1F, -0.75F, -0.5F, -1F, -0.75F, -0.23F, 0.2F, -0.75F, -0.23F); // Box 16
		gunModel[5].setRotationPoint(1.8F, -3F, 0F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.7F, -0.1F, -0.3F, 0.25F, -0.1F, -0.3F, 0.25F, 0F, -0.5F, 0.7F, 0F, -0.5F, 0.7F, -0.75F, -0.23F, 0.25F, -0.75F, -0.23F, 0.25F, -0.75F, -0.5F, 0.7F, -0.75F, -0.5F); // Box 17
		gunModel[6].setRotationPoint(3F, -3F, 0F);

		gunModel[7].addShapeBox(0F, -0.05F, 0F, 2, 1, 1, 0F,0F, -0.625F, -0.25F, 0.25F, -0.625F, -0.25F, 0.25F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.225F, -0.32F, 0.25F, -0.225F, -0.32F, 0.25F, -0.175F, -0.5F, 0F, -0.175F, -0.5F); // Box 18
		gunModel[7].setRotationPoint(2F, -3F, 0F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, -0.1F, -0.3F, -1F, -0.1F, -0.3F, -1F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, -0.75F, -0.23F, -1F, -0.75F, -0.23F, -1F, -0.75F, -0.5F, 0.2F, -0.75F, -0.5F); // Box 19
		gunModel[8].setRotationPoint(1.8F, -3F, 0F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.18F, -0.26F, -0.5F, -0.18F, -0.26F, -0.5F, -0.18F, -0.26F, 0F, -0.18F, -0.26F, 0F, -0.75F, -0.23F, -0.5F, -0.75F, -0.23F, -0.5F, -0.75F, -0.23F, 0F, -0.75F, -0.23F); // Box 20
		gunModel[9].setRotationPoint(1.8F, -3F, 0F);

		gunModel[10].addShapeBox(-0.85F, -0.05F, 0F, 1, 1, 1, 0F,-0.58F, -0.65F, -0.22F, -0.125F, -0.65F, -0.22F, -0.125F, -0.65F, -0.22F, -0.58F, -0.65F, -0.22F, -0.59F, -0.3F, -0.22F, -0.175F, -0.3F, -0.22F, -0.175F, -0.3F, -0.22F, -0.59F, -0.3F, -0.22F); // Box 0
		gunModel[10].setRotationPoint(4.1F, -3F, 0F);

		gunModel[11].addShapeBox(-0.85F, 0F, 0F, 1, 1, 1, 0F,-0.63F, -0.5F, -0.22F, -0.175F, -0.5F, -0.22F, -0.175F, -0.5F, -0.22F, -0.63F, -0.5F, -0.22F, -0.58F, -0.35F, -0.22F, -0.125F, -0.35F, -0.22F, -0.125F, -0.35F, -0.22F, -0.58F, -0.35F, -0.22F); // Box 1
		gunModel[11].setRotationPoint(4.1F, -3.05F, 0F);

		gunModel[12].addShapeBox(0F, -0.1F, 0F, 2, 1, 1, 0F,0.3F, -0.26F, -0.39F, 0.3F, -0.26F, -0.39F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.65F, -0.35F, 0.3F, -0.65F, -0.35F, 0.3F, -0.65F, -0.5F, 0.3F, -0.65F, -0.5F); // Box 0
		gunModel[12].setRotationPoint(2F, -3F, 0F);

		gunModel[13].addShapeBox(0F, -0.4F, 0F, 2, 1, 1, 0F,0.3F, -0.65F, -0.35F, 0.3F, -0.65F, -0.35F, 0.3F, -0.65F, -0.5F, 0.3F, -0.65F, -0.5F, 0.3F, -0.26F, -0.39F, 0.3F, -0.26F, -0.39F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F); // Box 1
		gunModel[13].setRotationPoint(2F, -3F, 0F);

		gunModel[14].addShapeBox(0F, -0.4F, 0F, 2, 1, 1, 0F,0.3F, -0.65F, -0.5F, 0.3F, -0.65F, -0.5F, 0.3F, -0.65F, -0.35F, 0.3F, -0.65F, -0.35F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.26F, -0.39F, 0.3F, -0.26F, -0.39F); // Box 2
		gunModel[14].setRotationPoint(2F, -3F, 0F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.34F, -0.05F, -0.4F, 0F, -0.05F, -0.4F, 0F, -0.05F, -0.4F, 0.34F, -0.05F, -0.4F, 0.35F, -0.85F, -0.36F, 0F, -0.85F, -0.36F, 0F, -0.85F, -0.36F, 0.35F, -0.85F, -0.36F); // Box 0
		gunModel[15].setRotationPoint(0.6F, -3F, 0F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.95F, 0F, -0.43F, 0F, 0F, -0.43F, 0F, 0F, -0.43F, -0.95F, 0F, -0.43F, -0.9F, -0.95F, -0.4F, 0F, -0.95F, -0.4F, 0F, -0.95F, -0.4F, -0.9F, -0.95F, -0.4F); // Box 3
		gunModel[16].setRotationPoint(0.6F, -3F, 0F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, 0F, -0.35F, -1F, 0F, -0.35F, -1F, 0F, -0.35F, 0.2F, 0F, -0.35F, 0.2F, -0.75F, -0.35F, -1F, -0.75F, -0.35F, -1F, -0.75F, -0.35F, 0.2F, -0.75F, -0.35F); // Box 4
		gunModel[17].setRotationPoint(1.8F, -3F, 0F);

		gunModel[18].addShapeBox(-1F, 0F, 0F, 1, 1, 1, 0F,-0.75F, -0.675F, -0.23F, 0.05F, -0.675F, -0.23F, 0.05F, -0.675F, -0.23F, -0.75F, -0.675F, -0.23F, -0.6F, -0.425F, -0.23F, 0.1F, -0.425F, -0.23F, 0.1F, -0.425F, -0.23F, -0.6F, -0.425F, -0.23F); // Box 6
		gunModel[18].setRotationPoint(4.1F, -3F, 0F);

		gunModel[19].addShapeBox(0F, -0.05F, 0F, 1, 1, 1, 0F,-1F, -0.625F, -0.5F, 0.2F, -0.625F, -0.5F, 0.2F, -0.625F, -0.25F, -1F, -0.625F, -0.25F, -1F, -0.175F, -0.5F, 0.2F, -0.2F, -0.5F, 0.2F, -0.25F, -0.32F, -1F, -0.175F, -0.25F); // Box 7
		gunModel[19].setRotationPoint(0.5F, -3F, 0F);

		gunModel[20].addShapeBox(0F, -0.05F, 0F, 1, 1, 1, 0F,-1F, -0.625F, -0.25F, 0.2F, -0.625F, -0.25F, 0.2F, -0.625F, -0.5F, -1F, -0.625F, -0.5F, -1F, -0.175F, -0.25F, 0.2F, -0.25F, -0.32F, 0.2F, -0.2F, -0.5F, -1F, -0.175F, -0.5F); // Box 8
		gunModel[20].setRotationPoint(0.5F, -3F, 0F);

		gunModel[21].addShapeBox(-1F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, -0.23F, 0.25F, -0.25F, -0.23F, 0.25F, -0.25F, -0.23F, 0F, -0.25F, -0.23F, 0F, -0.425F, -0.23F, 0.25F, -0.425F, -0.23F, 0.25F, -0.425F, -0.23F, 0F, -0.425F, -0.23F); // Box 10
		gunModel[21].setRotationPoint(2F, -3F, 0F);

		gunModel[22].addShapeBox(0F, -0.05F, 0F, 2, 1, 1, 0F,-0.55F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, -0.55F, -0.625F, -0.25F, -0.7F, -0.175F, -0.25F, 0F, -0.175F, -0.25F, 0F, -0.175F, -0.25F, -0.7F, -0.175F, -0.25F); // Box 11
		gunModel[22].setRotationPoint(-0.5F, -3F, 0F);

		gunModel[23].addShapeBox(-1F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, -0.28F, -0.4F, 0F, -0.28F, -0.4F, 0F, -0.28F, -0.4F, 0F, -0.28F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F); // Box 12
		gunModel[23].setRotationPoint(1F, -3F, 0F);

		gunModel[24].addShapeBox(-1F, 0F, 0F, 1, 1, 1, 0F,-0.09F, -0.5F, -0.23F, 0F, -0.5F, -0.23F, 0F, -0.5F, -0.23F, -0.09F, -0.5F, -0.23F, -0.05F, -0.425F, -0.23F, 0F, -0.425F, -0.23F, 0F, -0.425F, -0.23F, -0.05F, -0.425F, -0.23F); // Box 13
		gunModel[24].setRotationPoint(1F, -3F, 0F);

		gunModel[25].addShapeBox(-1F, 0F, 0F, 1, 1, 1, 0F,-0.22F, -0.25F, -0.57F, 0F, -0.25F, -0.57F, 0F, -0.25F, -0.23F, -0.22F, -0.25F, -0.23F, -0.15F, -0.6F, -0.57F, 0F, -0.6F, -0.57F, 0F, -0.6F, -0.23F, -0.15F, -0.6F, -0.23F); // Box 14
		gunModel[25].setRotationPoint(1F, -3F, 0F);

		gunModel[26].addShapeBox(0F, -0.05F, 0F, 1, 1, 1, 0F,-0.85F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.625F, -0.25F, -0.85F, -0.625F, -0.25F, -0.85F, -0.2F, -0.5F, 0F, -0.175F, -0.5F, 0F, -0.225F, -0.32F, -0.85F, -0.25F, -0.32F); // Box 16
		gunModel[26].setRotationPoint(1F, -3F, 0F);

		gunModel[27].addShapeBox(0F, -0.05F, 0F, 1, 1, 1, 0F,0F, -0.625F, -0.5F, -0.85F, -0.625F, -0.5F, -0.85F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.2F, -0.5F, -0.85F, -0.2F, -0.5F, -0.85F, -0.25F, -0.32F, 0F, -0.25F, -0.32F); // Box 17
		gunModel[27].setRotationPoint(1.7F, -3F, 0F);

		gunModel[28].addShapeBox(0F, -0.05F, 0F, 1, 1, 1, 0F,0F, -0.625F, -0.25F, -0.85F, -0.625F, -0.25F, -0.85F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.25F, -0.32F, -0.85F, -0.25F, -0.32F, -0.85F, -0.2F, -0.5F, 0F, -0.2F, -0.5F); // Box 18
		gunModel[28].setRotationPoint(1.7F, -3F, 0F);

		gunModel[29].addShapeBox(0F, -0.05F, 0F, 1, 1, 1, 0F,-0.85F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.5F, -0.85F, -0.625F, -0.5F, -0.85F, -0.25F, -0.32F, 0F, -0.225F, -0.32F, 0F, -0.175F, -0.5F, -0.85F, -0.2F, -0.5F); // Box 19
		gunModel[29].setRotationPoint(1F, -3F, 0F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0.125F, -0.27F, 0.3F, 0.125F, -0.27F, 0.3F, 0.125F, -0.27F, -0.25F, 0.125F, -0.27F, -0.27F, -1F, -0.29F, 0.25F, -1F, -0.29F, 0.25F, -1F, -0.29F, -0.27F, -1F, -0.29F); // Box 0
		gunModel[30].setRotationPoint(0F, -2F, 0F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0.225F, -0.25F, 0.45F, 0.225F, -0.25F, 0.45F, 0.225F, -0.25F, -0.2F, 0.225F, -0.25F, -0.25F, -1.125F, -0.27F, 0.3F, -1.125F, -0.27F, 0.3F, -1.125F, -0.27F, -0.25F, -1.125F, -0.27F); // Box 2
		gunModel[31].setRotationPoint(0F, -2F, 0F);

		gunModel[32].addShapeBox(-1F, 0F, 0F, 1, 1, 1, 0F,-0.06F, -0.4F, -0.44F, 0F, -0.4F, -0.44F, 0F, -0.4F, -0.44F, -0.06F, -0.4F, -0.44F, -0.11F, -0.5F, -0.44F, 0F, -0.5F, -0.44F, 0F, -0.5F, -0.44F, -0.11F, -0.5F, -0.44F); // Box 4
		gunModel[32].setRotationPoint(1F, -3F, 0F);

		gunModel[33].addShapeBox(-1F, 0F, 0F, 1, 1, 1, 0F,0.04F, -0.35F, -0.44F, 0F, -0.35F, -0.44F, 0F, -0.35F, -0.44F, 0.04F, -0.35F, -0.44F, -0.06F, -0.6F, -0.44F, 0F, -0.6F, -0.44F, 0F, -0.6F, -0.44F, -0.06F, -0.6F, -0.44F); // Box 5
		gunModel[33].setRotationPoint(1F, -3F, 0F);

		gunModel[34].addShapeBox(-1F, -0.3F, 0F, 1, 1, 1, 0F,-0.06F, -0.6F, -0.44F, 0F, -0.6F, -0.43F, 0F, -0.6F, -0.43F, -0.06F, -0.6F, -0.44F, 0.04F, -0.35F, -0.44F, 0F, -0.35F, -0.44F, 0F, -0.35F, -0.44F, 0.04F, -0.35F, -0.44F); // Box 6
		gunModel[34].setRotationPoint(1F, -3F, 0F);

		gunModel[35].addShapeBox(-1F, -0.3F, 0F, 1, 1, 1, 0F,-0.11F, -0.5F, -0.44F, 0F, -0.5F, -0.44F, 0F, -0.5F, -0.44F, -0.11F, -0.5F, -0.44F, -0.06F, -0.4F, -0.44F, 0F, -0.4F, -0.44F, 0F, -0.4F, -0.44F, -0.06F, -0.4F, -0.44F); // Box 7
		gunModel[35].setRotationPoint(1F, -3F, 0F);

		gunModel[36].addShapeBox(-1F, -0.3F, 0F, 1, 1, 1, 0F,-0.14F, -0.46F, -0.44F, -0.84F, -0.45F, -0.44F, -0.84F, -0.45F, -0.44F, -0.14F, -0.46F, -0.44F, -0.11F, -0.5F, -0.44F, -0.84F, -0.5F, -0.44F, -0.84F, -0.5F, -0.44F, -0.11F, -0.5F, -0.44F); // Box 8
		gunModel[36].setRotationPoint(1F, -3F, 0F);

		gunModel[37].addShapeBox(-1.6F, -0.3F, 0F, 1, 1, 1, 0F,-0.76F, -0.45F, -0.44F, -0.2F, -0.46F, -0.44F, -0.2F, -0.46F, -0.44F, -0.76F, -0.45F, -0.44F, -0.76F, -0.5F, -0.44F, -0.17F, -0.5F, -0.44F, -0.17F, -0.5F, -0.44F, -0.76F, -0.5F, -0.44F); // Box 9
		gunModel[37].setRotationPoint(1F, -3F, 0F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, 0.05F, -0.6F, -1F, 0.05F, -0.6F, -1F, 0.05F, -0.35F, 0.2F, 0.05F, -0.35F, 0.2F, -1F, -0.6F, -1F, -1F, -0.6F, -1F, -1F, -0.35F, 0.2F, -1F, -0.35F); // Box 10
		gunModel[38].setRotationPoint(1.8F, -3F, 0F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, 0.05F, -0.35F, -1F, 0.05F, -0.35F, -1F, 0.05F, -0.6F, 0.2F, 0.05F, -0.6F, 0.2F, -1F, -0.35F, -1F, -1F, -0.35F, -1F, -1F, -0.6F, 0.2F, -1F, -0.6F); // Box 11
		gunModel[39].setRotationPoint(1.8F, -3F, 0F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, 0.03F, -0.35F, -1.15F, 0.03F, -0.35F, -1.15F, 0.03F, -0.35F, 0.2F, 0.03F, -0.35F, 0.2F, -1F, -0.35F, -1.15F, -1F, -0.35F, -1.15F, -1F, -0.35F, 0.2F, -1F, -0.35F); // Box 12
		gunModel[40].setRotationPoint(1.8F, -3F, 0F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0.01F, -0.49F, 0.125F, 0.01F, -0.49F, 0.125F, 0.01F, -0.49F, -1F, 0.01F, -0.49F, -1F, -0.75F, -0.49F, 0.125F, -0.75F, -0.49F, 0.125F, -0.75F, -0.49F, -1F, -0.75F, -0.49F); // Box 13
		gunModel[41].setRotationPoint(3F, -3F, 0F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, -0.03F, -0.41F, 0.125F, -0.03F, -0.41F, 0.125F, 0.01F, -0.51F, -1F, 0.01F, -0.51F, -1F, -0.97F, -0.41F, 0.125F, -0.97F, -0.41F, 0.125F, -1F, -0.51F, -1F, -1F, -0.51F); // Box 14
		gunModel[42].setRotationPoint(3F, -3F, 0F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0.01F, -0.51F, 0.125F, 0.01F, -0.51F, 0.125F, -0.03F, -0.41F, -1F, -0.03F, -0.41F, -1F, -1F, -0.51F, 0.125F, -1F, -0.51F, 0.125F, -0.97F, -0.41F, -1F, -0.97F, -0.41F); // Box 15
		gunModel[43].setRotationPoint(3F, -3F, 0F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0.05F, -0.51F, 0.125F, 0.05F, -0.51F, 0.125F, 0.05F, -0.48F, -1F, 0.05F, -0.48F, -1F, -1F, -0.51F, 0.125F, -1F, -0.51F, 0.125F, -1F, -0.48F, -1F, -1F, -0.48F); // Box 16
		gunModel[44].setRotationPoint(3F, -3F, 0F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0.05F, -0.48F, 0.125F, 0.05F, -0.48F, 0.125F, 0.05F, -0.51F, -1F, 0.05F, -0.51F, -1F, -1F, -0.48F, 0.125F, -1F, -0.48F, 0.125F, -1F, -0.51F, -1F, -1F, -0.51F); // Box 17
		gunModel[45].setRotationPoint(3F, -3F, 0F);

		gunModel[46].addShapeBox(-1F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0.05F, -0.29F, -0.4F, 0.05F, -0.29F, -0.4F, 0.05F, -0.68F, -0.4F, 0.05F, -0.68F, -0.4F, -1F, -0.28F, -0.4F, -1F, -0.28F, -0.4F, -1F, -0.68F, -0.4F, -1F, -0.68F); // Box 19
		gunModel[46].setRotationPoint(1F, -3F, 0F);

		gunModel[47].addShapeBox(-1F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0.05F, -0.68F, -0.4F, 0.05F, -0.68F, -0.4F, 0.05F, -0.29F, -0.4F, 0.05F, -0.29F, -0.4F, -1F, -0.68F, -0.4F, -1F, -0.68F, -0.4F, -1F, -0.28F, -0.4F, -1F, -0.28F); // Box 20
		gunModel[47].setRotationPoint(1F, -3F, 0F);

		gunModel[48].addShapeBox(-1F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0.05F, -0.54F, -0.55F, 0.05F, -0.54F, -0.55F, 0.05F, -0.29F, -0.4F, 0.05F, -0.29F, -0.4F, -1F, -0.5F, -0.55F, -1F, -0.5F, -0.55F, -1F, -0.28F, -0.4F, -1F, -0.28F); // Box 21
		gunModel[48].setRotationPoint(1F, -3F, 0F);

		gunModel[49].addShapeBox(-1F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0.05F, -0.29F, -0.55F, 0.05F, -0.29F, -0.55F, 0.05F, -0.54F, -0.4F, 0.05F, -0.54F, -0.4F, -1F, -0.28F, -0.55F, -1F, -0.28F, -0.55F, -1F, -0.5F, -0.4F, -1F, -0.5F); // Box 22
		gunModel[49].setRotationPoint(1F, -3F, 0F);

		gunModel[50].addShapeBox(-0.96F, 0F, 0F, 1, 1, 1, 0F,-0.49F, 0.05F, -0.28F, -0.49F, 0.05F, -0.28F, -0.49F, 0.05F, -0.7F, -0.49F, 0.05F, -0.7F, -0.49F, -0.75F, -0.24F, -0.49F, -0.75F, -0.24F, -0.49F, -0.75F, -0.7F, -0.49F, -0.75F, -0.7F); // Box 23
		gunModel[50].setRotationPoint(1F, -3F, 0F);

		gunModel[51].addShapeBox(-1.04F, 0F, 0F, 1, 1, 1, 0F,-0.49F, 0.05F, -0.28F, -0.49F, 0.05F, -0.28F, -0.49F, 0.05F, -0.7F, -0.49F, 0.05F, -0.7F, -0.49F, -0.75F, -0.24F, -0.49F, -0.75F, -0.24F, -0.49F, -0.75F, -0.7F, -0.49F, -0.75F, -0.7F); // Box 24
		gunModel[51].setRotationPoint(1F, -3F, 0F);

		gunModel[52].addShapeBox(-1.08F, 0F, 0F, 1, 1, 1, 0F,-0.49F, 0.05F, -0.28F, -0.49F, 0.05F, -0.28F, -0.49F, 0.05F, -0.7F, -0.49F, 0.05F, -0.7F, -0.49F, -0.75F, -0.24F, -0.49F, -0.75F, -0.24F, -0.49F, -0.75F, -0.7F, -0.49F, -0.75F, -0.7F); // Box 25
		gunModel[52].setRotationPoint(1F, -3F, 0F);

		gunModel[53].addShapeBox(-1F, 0F, 0F, 1, 1, 1, 0F,-0.49F, 0.05F, -0.28F, -0.49F, 0.05F, -0.28F, -0.49F, 0.05F, -0.7F, -0.49F, 0.05F, -0.7F, -0.49F, -0.75F, -0.24F, -0.49F, -0.75F, -0.24F, -0.49F, -0.75F, -0.7F, -0.49F, -0.75F, -0.7F); // Box 26
		gunModel[53].setRotationPoint(1F, -3F, 0F);

		gunModel[54].addShapeBox(-0.92F, 0F, 0F, 1, 1, 1, 0F,-0.49F, 0.05F, -0.28F, -0.49F, 0.05F, -0.28F, -0.49F, 0.05F, -0.7F, -0.49F, 0.05F, -0.7F, -0.49F, -0.75F, -0.24F, -0.49F, -0.75F, -0.24F, -0.49F, -0.75F, -0.7F, -0.49F, -0.75F, -0.7F); // Box 27
		gunModel[54].setRotationPoint(1F, -3F, 0F);

		gunModel[55].addShapeBox(-0.96F, 0F, 0F, 1, 1, 1, 0F,-0.49F, 0.05F, -0.7F, -0.49F, 0.05F, -0.7F, -0.49F, 0.05F, -0.28F, -0.49F, 0.05F, -0.28F, -0.49F, -0.75F, -0.7F, -0.49F, -0.75F, -0.7F, -0.49F, -0.75F, -0.24F, -0.49F, -0.75F, -0.24F); // Box 28
		gunModel[55].setRotationPoint(1F, -3F, 0F);

		gunModel[56].addShapeBox(-1.04F, 0F, 0F, 1, 1, 1, 0F,-0.49F, 0.05F, -0.7F, -0.49F, 0.05F, -0.7F, -0.49F, 0.05F, -0.28F, -0.49F, 0.05F, -0.28F, -0.49F, -0.75F, -0.7F, -0.49F, -0.75F, -0.7F, -0.49F, -0.75F, -0.24F, -0.49F, -0.75F, -0.24F); // Box 28
		gunModel[56].setRotationPoint(1F, -3F, 0F);

		gunModel[57].addShapeBox(-1.08F, 0F, 0F, 1, 1, 1, 0F,-0.49F, 0.05F, -0.7F, -0.49F, 0.05F, -0.7F, -0.49F, 0.05F, -0.28F, -0.49F, 0.05F, -0.28F, -0.49F, -0.75F, -0.7F, -0.49F, -0.75F, -0.7F, -0.49F, -0.75F, -0.24F, -0.49F, -0.75F, -0.24F); // Box 28
		gunModel[57].setRotationPoint(1F, -3F, 0F);

		gunModel[58].addShapeBox(-1F, 0F, 0F, 1, 1, 1, 0F,-0.49F, 0.05F, -0.7F, -0.49F, 0.05F, -0.7F, -0.49F, 0.05F, -0.28F, -0.49F, 0.05F, -0.28F, -0.49F, -0.75F, -0.7F, -0.49F, -0.75F, -0.7F, -0.49F, -0.75F, -0.24F, -0.49F, -0.75F, -0.24F); // Box 28
		gunModel[58].setRotationPoint(1F, -3F, 0F);

		gunModel[59].addShapeBox(-0.92F, 0F, 0F, 1, 1, 1, 0F,-0.49F, 0.05F, -0.7F, -0.49F, 0.05F, -0.7F, -0.49F, 0.05F, -0.28F, -0.49F, 0.05F, -0.28F, -0.49F, -0.75F, -0.7F, -0.49F, -0.75F, -0.7F, -0.49F, -0.75F, -0.24F, -0.49F, -0.75F, -0.24F); // Box 28
		gunModel[59].setRotationPoint(1F, -3F, 0F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.35F, -0.15F, -0.57F, 0F, -0.15F, -0.57F, 0F, -0.15F, -0.36F, 0.35F, -0.15F, -0.36F, 0.38F, -0.75F, -0.57F, 0F, -0.75F, -0.57F, 0F, -0.75F, -0.28F, 0.38F, -0.75F, -0.28F); // Box 33
		gunModel[60].setRotationPoint(0.6F, -3F, 0F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.35F, -0.15F, -0.36F, 0F, -0.15F, -0.36F, 0F, -0.15F, -0.57F, 0.35F, -0.15F, -0.57F, 0.38F, -0.75F, -0.28F, 0F, -0.75F, -0.28F, 0F, -0.75F, -0.57F, 0.38F, -0.75F, -0.57F); // Box 34
		gunModel[61].setRotationPoint(0.6F, -3F, 0F);

		gunModel[62].addShapeBox(-1F, 0F, 0F, 1, 1, 1, 0F,-0.22F, -0.25F, -0.23F, 0F, -0.25F, -0.23F, 0F, -0.25F, -0.57F, -0.22F, -0.25F, -0.57F, -0.15F, -0.6F, -0.23F, 0F, -0.6F, -0.23F, 0F, -0.6F, -0.57F, -0.15F, -0.6F, -0.57F); // Box 35
		gunModel[62].setRotationPoint(1F, -3F, 0F);

		gunModel[63].addShapeBox(-1F, 0F, 0F, 1, 1, 1, 0F,-0.15F, -0.4F, -0.23F, 0F, -0.4F, -0.23F, 0F, -0.4F, -0.57F, -0.15F, -0.4F, -0.57F, -0.05F, -0.425F, -0.23F, 0F, -0.425F, -0.23F, 0F, -0.425F, -0.57F, -0.05F, -0.425F, -0.57F); // Box 36
		gunModel[63].setRotationPoint(1F, -3F, 0F);

		gunModel[64].addShapeBox(-1F, 0F, 0F, 1, 1, 1, 0F,-0.15F, -0.4F, -0.57F, 0F, -0.4F, -0.57F, 0F, -0.4F, -0.23F, -0.15F, -0.4F, -0.23F, -0.05F, -0.425F, -0.57F, 0F, -0.425F, -0.57F, 0F, -0.425F, -0.23F, -0.05F, -0.425F, -0.23F); // Box 37
		gunModel[64].setRotationPoint(1F, -3F, 0F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, -0.575F, -0.4F, 0.95F, -0.575F, -0.4F, 0.95F, -0.575F, -0.4F, -1F, -0.575F, -0.4F, -1F, -0.2F, -0.4F, 0.8F, -0.2F, -0.4F, 0.8F, -0.2F, -0.4F, -1F, -0.2F, -0.4F); // Box 38
		gunModel[65].setRotationPoint(0F, -3F, 0F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1.75F, -0.8F, -0.4F, 0.8F, -0.8F, -0.4F, 0.8F, -0.8F, -0.4F, -1.75F, -0.8F, -0.4F, -1.78F, -0.05F, -0.4F, 0.82F, -0.05F, -0.4F, 0.82F, -0.05F, -0.4F, -1.78F, -0.05F, -0.4F); // Box 39
		gunModel[66].setRotationPoint(0F, -3F, 0F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1.78F, 0.05F, -0.4F, 0.82F, 0.05F, -0.4F, 0.82F, 0.05F, -0.4F, -1.78F, 0.05F, -0.4F, -1.75F, -0.9F, -0.4F, 0.8F, -0.9F, -0.4F, 0.8F, -0.9F, -0.4F, -1.75F, -0.9F, -0.4F); // Box 40
		gunModel[67].setRotationPoint(0F, -2F, 0F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, -1.1F, -0.4F, 0.33F, -1.1F, -0.4F, 0.33F, -1.1F, -0.4F, -1F, -1.1F, -0.4F, -1F, 0.2F, -0.4F, 0.39F, 0.2F, -0.4F, 0.39F, 0.2F, -0.4F, -1F, 0.2F, -0.4F); // Box 41
		gunModel[68].setRotationPoint(0F, -3F, 0F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, -0.575F, -0.4F, 0.47F, -0.575F, -0.4F, 0.47F, -0.575F, -0.4F, -1F, -0.575F, -0.4F, -1F, -0.05F, -0.4F, 0.32F, -0.05F, -0.4F, 0.32F, -0.05F, -0.4F, -1F, -0.05F, -0.4F); // Box 42
		gunModel[69].setRotationPoint(0F, -3F, 0F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0.05F, -0.4F, 0.32F, 0.05F, -0.4F, 0.32F, 0.05F, -0.4F, -1F, 0.05F, -0.4F, -1F, -0.9F, -0.4F, 0.33F, -0.9F, -0.4F, 0.33F, -0.9F, -0.4F, -1F, -0.9F, -0.4F); // Box 43
		gunModel[70].setRotationPoint(0F, -2F, 0F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, -1.2F, -0.4F, 0.37F, -1.2F, -0.4F, 0.37F, -1.2F, -0.4F, -1F, -1.2F, -0.4F, -1F, 0.25F, -0.4F, 0.22F, 0.25F, -0.4F, 0.22F, 0.25F, -0.4F, -1F, 0.25F, -0.4F); // Box 44
		gunModel[71].setRotationPoint(0F, -3F, 0F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1.75F, -0.7F, -0.4F, 0.8F, -0.7F, -0.4F, 0.8F, -0.7F, -0.4F, -1.75F, -0.7F, -0.4F, -1.67F, -0.2F, -0.4F, 0.73F, -0.2F, -0.4F, 0.73F, -0.2F, -0.4F, -1.67F, -0.2F, -0.4F); // Box 45
		gunModel[72].setRotationPoint(0F, -2.6F, 0F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1.37F, -1.245F, -0.4F, 0.65F, -1.245F, -0.4F, 0.65F, -1.245F, -0.4F, -1.37F, -1.245F, -0.4F, -1.425F, 0.27F, -0.4F, 0.6F, 0.27F, -0.4F, 0.6F, 0.27F, -0.4F, -1.425F, 0.27F, -0.4F); // Box 46
		gunModel[73].setRotationPoint(0F, -3F, 0F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, -0.8F, -0.45F, 0.62F, -0.8F, -0.45F, 0.62F, -0.8F, -0.45F, -1F, -0.8F, -0.45F, -1F, -0.15F, -0.45F, 0.57F, -0.15F, -0.45F, 0.57F, -0.15F, -0.45F, -1F, -0.15F, -0.45F); // Box 48
		gunModel[74].setRotationPoint(0F, -3F, 0F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, -0.02F, -0.45F, 0.55F, -0.02F, -0.45F, 0.55F, -0.02F, -0.45F, -1F, -0.02F, -0.45F, -1F, -0.9F, -0.45F, 0.57F, -0.9F, -0.45F, 0.57F, -0.9F, -0.45F, -1F, -0.9F, -0.45F); // Box 49
		gunModel[75].setRotationPoint(0F, -2F, 0F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, -0.85F, -0.45F, 0.57F, -0.85F, -0.45F, 0.57F, -0.85F, -0.45F, -1F, -0.85F, -0.45F, -1F, -0.05F, -0.45F, 0.54F, -0.05F, -0.45F, 0.54F, -0.05F, -0.45F, -1F, -0.05F, -0.45F); // Box 50
		gunModel[76].setRotationPoint(0F, -3F, 0F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0.05F, -0.45F, 0.54F, 0.05F, -0.45F, 0.54F, 0.05F, -0.45F, -1F, 0.05F, -0.45F, -1F, -0.98F, -0.45F, 0.55F, -0.98F, -0.45F, 0.55F, -0.98F, -0.45F, -1F, -0.98F, -0.45F); // Box 51
		gunModel[77].setRotationPoint(0F, -2F, 0F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1.2F, -0.1F, -0.45F, 0.57F, -0.1F, -0.45F, 0.57F, -0.1F, -0.45F, -1.2F, -0.1F, -0.45F, -1.45F, -0.81F, -0.45F, 0.62F, -0.8F, -0.45F, 0.62F, -0.8F, -0.45F, -1.45F, -0.81F, -0.45F); // Box 52
		gunModel[78].setRotationPoint(0F, -2F, 0F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1.67F, -0.2F, -0.4F, 0.73F, -0.2F, -0.4F, 0.73F, -0.2F, -0.4F, -1.67F, -0.2F, -0.4F, -1.6F, -0.75F, -0.4F, 0.65F, -0.755F, -0.4F, 0.65F, -0.755F, -0.4F, -1.6F, -0.75F, -0.4F); // Box 53
		gunModel[79].setRotationPoint(0F, -2F, 0F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.32F, 0.1F, -0.72F, 0.2F, 0.1F, -0.72F, 0.05F, -0.05F, -0.26F, -0.42F, -0.05F, -0.26F, -0.145F, 0.6F, -0.71F, 0.025F, 0.6F, -0.71F, -0.075F, 0.45F, -0.28F, -0.295F, 0.45F, -0.28F); // Box 56
		gunModel[80].setRotationPoint(0F, -2F, 0F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.42F, -0.05F, -0.26F, 0.05F, -0.05F, -0.26F, 0.2F, 0.1F, -0.72F, -0.32F, 0.1F, -0.72F, -0.295F, 0.45F, -0.28F, -0.075F, 0.45F, -0.28F, 0.025F, 0.6F, -0.71F, -0.145F, 0.6F, -0.71F); // Box 57
		gunModel[81].setRotationPoint(0F, -2F, 0F);

		gunModel[82].addShapeBox(0F, -0.2F, 0F, 1, 1, 1, 0F,-0.53F, -1.63F, -0.26F, -0.41F, -1.61F, -0.26F, -0.41F, -1.61F, -0.26F, -0.53F, -1.63F, -0.26F, -0.5F, 0.7F, -0.26F, -0.41F, 0.7F, -0.26F, -0.41F, 0.7F, -0.26F, -0.5F, 0.7F, -0.26F); // Box 59
		gunModel[82].setRotationPoint(0F, -2F, 0F);

		gunModel[83].addShapeBox(0F, -0.2F, 0F, 1, 1, 1, 0F,-0.53F, -1.63F, -0.27F, -0.4F, -1.6F, -0.27F, -0.4F, -1.6F, -0.27F, -0.53F, -1.63F, -0.27F, -0.5F, 0.7F, -0.27F, -0.4F, 0.7F, -0.27F, -0.4F, 0.7F, -0.27F, -0.5F, 0.7F, -0.27F); // Box 61
		gunModel[83].setRotationPoint(0F, -2F, 0F);

		gunModel[84].addShapeBox(0.2F, -0.2F, 0F, 1, 1, 1, 0F,-0.4F, -1.6F, -0.27F, -0.53F, -1.63F, -0.27F, -0.53F, -1.63F, -0.27F, -0.4F, -1.6F, -0.27F, -0.4F, 0.7F, -0.27F, -0.5F, 0.7F, -0.27F, -0.5F, 0.7F, -0.27F, -0.4F, 0.7F, -0.27F); // Box 62
		gunModel[84].setRotationPoint(0F, -2F, 0F);

		gunModel[85].addShapeBox(0.2F, 2.2F, 0F, 1, 1, 1, 0F,-0.4F, 0.7F, -0.27F, -0.5F, 0.7F, -0.27F, -0.5F, 0.7F, -0.27F, -0.4F, 0.7F, -0.27F, -0.4F, -1.6F, -0.27F, -0.53F, -1.63F, -0.27F, -0.53F, -1.63F, -0.27F, -0.4F, -1.6F, -0.27F); // Box 63
		gunModel[85].setRotationPoint(0F, -2F, 0F);

		gunModel[86].addShapeBox(0F, 2.2F, 0F, 1, 1, 1, 0F,-0.5F, 0.7F, -0.27F, -0.4F, 0.7F, -0.27F, -0.4F, 0.7F, -0.27F, -0.5F, 0.7F, -0.27F, -0.53F, -1.63F, -0.27F, -0.4F, -1.6F, -0.27F, -0.4F, -1.6F, -0.27F, -0.53F, -1.63F, -0.27F); // Box 64
		gunModel[86].setRotationPoint(0F, -2F, 0F);

		gunModel[87].addShapeBox(0F, 2.2F, 0F, 1, 1, 1, 0F,-0.5F, 0.7F, -0.26F, -0.41F, 0.7F, -0.26F, -0.41F, 0.7F, -0.26F, -0.5F, 0.7F, -0.26F, -0.53F, -1.63F, -0.26F, -0.41F, -1.61F, -0.26F, -0.41F, -1.61F, -0.26F, -0.53F, -1.63F, -0.26F); // Box 65
		gunModel[87].setRotationPoint(0F, -2F, 0F);

		gunModel[88].addShapeBox(0.2F, 2.2F, 0F, 1, 1, 1, 0F,-0.41F, 0.7F, -0.26F, -0.5F, 0.7F, -0.26F, -0.5F, 0.7F, -0.26F, -0.41F, 0.7F, -0.26F, -0.41F, -1.61F, -0.26F, -0.53F, -1.63F, -0.26F, -0.53F, -1.63F, -0.26F, -0.41F, -1.61F, -0.26F); // Box 66
		gunModel[88].setRotationPoint(0F, -2F, 0F);

		gunModel[89].addShapeBox(0.2F, -0.2F, 0F, 1, 1, 1, 0F,-0.41F, -1.61F, -0.26F, -0.53F, -1.63F, -0.26F, -0.53F, -1.63F, -0.26F, -0.41F, -1.61F, -0.26F, -0.41F, 0.7F, -0.26F, -0.5F, 0.7F, -0.26F, -0.5F, 0.7F, -0.26F, -0.41F, 0.7F, -0.26F); // Box 67
		gunModel[89].setRotationPoint(0F, -2F, 0F);

		gunModel[90].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F,-0.995F, -1.6F, -0.34F, 0.025F, -1.6F, -0.34F, 0.025F, -1.6F, -0.34F, -0.995F, -1.6F, -0.34F, -0.895F, 0.75F, -0.34F, -0.075F, 0.75F, -0.34F, -0.075F, 0.75F, -0.34F, -0.895F, 0.75F, -0.34F); // Box 68
		gunModel[90].setRotationPoint(0F, -1F, 0F);

		gunModel[91].addShapeBox(0.17F, 0F, 0F, 1, 1, 1, 0F,0.025F, -1.6F, -0.34F, -0.995F, -1.6F, -0.34F, -0.995F, -1.6F, -0.34F, 0.025F, -1.6F, -0.34F, -0.075F, 0.75F, -0.34F, -0.895F, 0.75F, -0.34F, -0.895F, 0.75F, -0.34F, -0.075F, 0.75F, -0.34F); // Box 69
		gunModel[91].setRotationPoint(0F, -2F, 0F);

		gunModel[92].addShapeBox(-1F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.4F, -0.77F, -0.65F, -0.4F, -0.77F, -0.65F, -0.4F, -0.21F, -0.25F, -0.4F, -0.21F, -0.05F, -0.425F, -0.77F, -0.85F, -0.425F, -0.77F, -0.85F, -0.425F, -0.21F, -0.05F, -0.425F, -0.21F); // Box 70
		gunModel[92].setRotationPoint(1F, -3F, 0F);

		gunModel[93].addShapeBox(-1F, 0F, 0F, 1, 1, 1, 0F,-0.27F, -0.42F, -0.77F, -0.69F, -0.42F, -0.77F, -0.69F, -0.42F, -0.2F, -0.27F, -0.42F, -0.2F, -0.13F, -0.475F, -0.77F, -0.82F, -0.475F, -0.77F, -0.82F, -0.475F, -0.2F, -0.13F, -0.475F, -0.2F); // Box 71
		gunModel[93].setRotationPoint(1F, -3F, 0F);

		gunModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.675F, 0.125F, -0.26F, -0.175F, 0.125F, -0.26F, -0.175F, 0.125F, -0.26F, -0.675F, 0.125F, -0.26F, -0.675F, -1.075F, -0.27F, -0.175F, -1.075F, -0.27F, -0.175F, -1.075F, -0.27F, -0.675F, -1.075F, -0.27F); // Box 72
		gunModel[94].setRotationPoint(0F, -2F, 0F);

		gunModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.625F, 0.225F, -0.24F, -0.125F, 0.225F, -0.24F, -0.125F, 0.225F, -0.24F, -0.625F, 0.225F, -0.24F, -0.625F, -1.125F, -0.26F, -0.125F, -1.175F, -0.26F, -0.125F, -1.125F, -0.26F, -0.625F, -1.125F, -0.26F); // Box 73
		gunModel[95].setRotationPoint(0F, -2F, 0F);

		gunModel[96].addShapeBox(-1F, -0.1F, 0F, 2, 1, 1, 0F,0.3F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.26F, -0.39F, 0.3F, -0.26F, -0.39F, 0.3F, -0.65F, -0.5F, 0.3F, -0.65F, -0.5F, 0.3F, -0.65F, -0.35F, 0.3F, -0.65F, -0.35F); // Box 13
		gunModel[96].setRotationPoint(3F, -3F, 0F);

		gunModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.27F, 0F, -0.29F, 0.25F, 0F, -0.29F, 0.25F, 0F, -0.29F, -0.27F, 0F, -0.29F, -0.095F, 0.6F, -0.29F, 0.075F, 0.6F, -0.29F, 0.075F, 0.6F, -0.29F, -0.095F, 0.6F, -0.29F); // Box 54
		gunModel[97].setRotationPoint(0F, -2F, 0F);
	}
}