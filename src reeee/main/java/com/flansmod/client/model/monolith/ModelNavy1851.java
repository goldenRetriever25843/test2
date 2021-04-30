//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 07.08.2016 - 12:07:42
// Last changed on: 07.08.2016 - 12:07:42

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelNavy1851 extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelNavy1851() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[83];
		ammoModel = new ModelRendererTurbo[6];
		revolverBarrelModel = new ModelRendererTurbo[14];

		initgunModel_1();
		initammoModel_1();
		initrevolverBarrelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 0
		gunModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1
		gunModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 2
		gunModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 18
		gunModel[6] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 21
		gunModel[7] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 23
		gunModel[8] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 24
		gunModel[9] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 31
		gunModel[10] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 32
		gunModel[11] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 33
		gunModel[12] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 34
		gunModel[13] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 35
		gunModel[14] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 36
		gunModel[15] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 38
		gunModel[16] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 39
		gunModel[17] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 42
		gunModel[18] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 43
		gunModel[19] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 44
		gunModel[20] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 45
		gunModel[21] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 47
		gunModel[22] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 48
		gunModel[23] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 0
		gunModel[24] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 2
		gunModel[25] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 3
		gunModel[26] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 5
		gunModel[27] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 6
		gunModel[28] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 7
		gunModel[29] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 8
		gunModel[30] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 9
		gunModel[31] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 10
		gunModel[32] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 47
		gunModel[33] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 48
		gunModel[34] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 49
		gunModel[35] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 50
		gunModel[36] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 51
		gunModel[37] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 52
		gunModel[38] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 53
		gunModel[39] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 54
		gunModel[40] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 55
		gunModel[41] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 56
		gunModel[42] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 57
		gunModel[43] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 58
		gunModel[44] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 59
		gunModel[45] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 60
		gunModel[46] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 61
		gunModel[47] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 62
		gunModel[48] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 63
		gunModel[49] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 64
		gunModel[50] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 65
		gunModel[51] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 66
		gunModel[52] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 67
		gunModel[53] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 70
		gunModel[54] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 71
		gunModel[55] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 72
		gunModel[56] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 73
		gunModel[57] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 74
		gunModel[58] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 75
		gunModel[59] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 77
		gunModel[60] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 78
		gunModel[61] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 79
		gunModel[62] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 80
		gunModel[63] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 81
		gunModel[64] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 82
		gunModel[65] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 83
		gunModel[66] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 84
		gunModel[67] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 85
		gunModel[68] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 86
		gunModel[69] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 87
		gunModel[70] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 88
		gunModel[71] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 90
		gunModel[72] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 91
		gunModel[73] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 94
		gunModel[74] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 95
		gunModel[75] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 96
		gunModel[76] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 97
		gunModel[77] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 98
		gunModel[78] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 100
		gunModel[79] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 101
		gunModel[80] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 103
		gunModel[81] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 104
		gunModel[82] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 105

		gunModel[0].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.15F, -0.05F, 0F, -0.15F, -0.05F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0.05F, -0.15F, -0.05F, 0.05F, -0.15F, -0.05F, 0.05F, -0.15F, 0F, 0.05F, -0.15F); // Box 0
		gunModel[0].setRotationPoint(3.8F, -3.35F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.35F, -0.15F, 0.1F, -0.35F, -0.15F, 0.1F, -0.35F, -0.15F, 0F, -0.35F, -0.15F, 0F, -0.35F, -0.15F, 0.1F, -0.35F, -0.15F, 0.1F, -0.35F, -0.15F, 0F, -0.35F, -0.15F); // Box 0
		gunModel[1].setRotationPoint(5.75F, -3.7F, -0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.44F, -0.35F, 0.05F, -0.44F, -0.35F, 0.05F, -0.44F, -0.35F, 0F, -0.44F, -0.35F, 0F, -0.35F, -0.15F, 0.05F, -0.35F, -0.15F, 0.05F, -0.35F, -0.15F, 0F, -0.35F, -0.15F); // Box 1
		gunModel[2].setRotationPoint(3.8F, -4F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.35F, -0.15F, 0.1F, -0.35F, -0.15F, 0.1F, -0.35F, -0.15F, 0F, -0.35F, -0.15F, 0F, -0.42F, -0.35F, 0.1F, -0.44F, -0.35F, 0.1F, -0.44F, -0.35F, 0F, -0.44F, -0.35F); // Box 2
		gunModel[3].setRotationPoint(5.75F, -3.4F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.05F, -0.15F, -0.42F, -0.05F, -0.15F, -0.42F, -0.05F, -0.15F, -0.4F, -0.05F, -0.15F, -0.4F, -0.2F, -0.15F, -0.42F, -0.4F, -0.15F, -0.42F, -0.4F, -0.15F, -0.4F, -0.2F, -0.15F); // Box 4
		gunModel[4].setRotationPoint(5.35F, -3.1F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.31F, 0.2F, -0.35F, -0.28F, 0.3F, -0.35F, -0.43F, -1F, -0.35F, -0.43F, -1F, -0.35F, -0.3F, 0.2F, -0.35F, -0.3F, 0.3F, -0.35F, -0.43F, -1F, -0.35F, -0.43F, -1F); // Box 18
		gunModel[5].setRotationPoint(1.1F, -2.18F, -0.5F);
		gunModel[5].rotateAngleX = 1.57079633F;

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.3F, -0.35F, 0F); // Box 21
		gunModel[6].setRotationPoint(1.1F, -3.15F, -0.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.27F, -0.38F, -0.35F, -0.27F, -0.38F, -0.35F, -0.27F, -0.38F, -0.3F, -0.27F, -0.38F, -0.3F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.3F, -0.4F, 0F); // Box 23
		gunModel[7].setRotationPoint(1.1F, -3.4F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.27F, -0.38F, -0.35F, -0.27F, -0.38F, -0.35F, -0.27F, -0.38F, -0.3F, -0.27F, -0.38F); // Box 24
		gunModel[8].setRotationPoint(1.1F, -2.9F, -0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.43F, -0.3F, 0.1F, -0.43F, -0.3F, 0.1F, -0.43F, -0.3F, 0F, -0.43F, -0.3F, 0F, -0.43F, -0.3F, 0.1F, -0.43F, -0.3F, 0.1F, -0.43F, -0.3F, 0F, -0.43F, -0.3F); // Box 31
		gunModel[9].setRotationPoint(2.75F, -3.05F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.45F, 0.1F, -0.45F, -0.45F, 0.1F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.43F, -0.3F, 0.1F, -0.43F, -0.3F, 0.1F, -0.43F, -0.3F, 0F, -0.43F, -0.3F); // Box 32
		gunModel[10].setRotationPoint(2.75F, -3.2F, -0.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.43F, -0.3F, 0.1F, -0.43F, -0.3F, 0.1F, -0.43F, -0.3F, 0F, -0.43F, -0.3F, 0F, -0.45F, -0.45F, 0.1F, -0.45F, -0.45F, 0.1F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 33
		gunModel[11].setRotationPoint(2.75F, -2.9F, -0.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.4F, -0.2F, -0.45F, -0.4F, -0.2F, -0.45F, -0.4F, -0.2F, -0.5F, -0.4F, -0.2F, -0.35F, -0.22F, -0.2F, -0.35F, -0.22F, -0.2F, -0.35F, -0.22F, -0.2F, -0.35F, -0.22F); // Box 34
		gunModel[12].setRotationPoint(3.2F, -3.95F, -0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.45F, -0.22F, -0.2F, -0.45F, -0.22F, -0.2F, -0.45F, -0.22F, -0.2F, -0.45F, -0.22F, -0.2F, -0.3F, -0.22F, -0.2F, -0.3F, -0.22F, -0.2F, -0.3F, -0.22F, -0.2F, -0.3F, -0.22F); // Box 35
		gunModel[13].setRotationPoint(3.2F, -3.75F, -0.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.35F, -0.22F, -0.2F, -0.35F, -0.22F, -0.2F, -0.35F, -0.22F, -0.2F, -0.35F, -0.22F, -0.2F, -0.45F, -0.4F, -0.2F, -0.45F, -0.4F, -0.2F, -0.45F, -0.4F, -0.2F, -0.45F, -0.4F); // Box 36
		gunModel[14].setRotationPoint(3.2F, -3.4F, -0.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.15F, 0.35F, 0F, -0.15F, 0.35F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.15F, -0.15F, 0.35F, -0.65F, -0.15F, 0.35F, -0.65F, -0.15F, 0F, -0.15F, -0.15F); // Box 38
		gunModel[15].setRotationPoint(0.45F, -1.85F, -0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.15F, -0.45F, -0.25F, -0.15F, -0.45F, -0.25F, -0.15F, -0.3F, -0.4F, -0.15F, -0.3F, -0.2F, -0.15F, -0.35F, -0.2F, -0.15F, -0.35F, -0.2F, -0.15F, -0.3F, -0.2F, -0.15F); // Box 39
		gunModel[16].setRotationPoint(0.15F, -2.65F, -0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.25F, -0.15F, -0.5F, -0.55F, -0.15F, -0.5F, -0.55F, -0.15F, -0.2F, -0.25F, -0.15F, -0.3F, -0.2F, -0.15F, -0.5F, -0.2F, -0.15F, -0.5F, -0.2F, -0.15F, -0.3F, -0.2F, -0.15F); // Box 42
		gunModel[17].setRotationPoint(0.5F, -2.65F, -0.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.41F, -0.15F, -0.5F, -0.55F, -0.15F, -0.5F, -0.55F, -0.15F, -0.3F, -0.41F, -0.15F, -0.3F, -0.32F, -0.15F, -0.5F, -0.32F, -0.15F, -0.5F, -0.32F, -0.15F, -0.3F, -0.32F, -0.15F); // Box 43
		gunModel[18].setRotationPoint(0.7F, -2.52F, -0.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.15F, -0.5F, -0.53F, -0.15F, -0.5F, -0.53F, -0.15F, -0.3F, -0.4F, -0.15F, -0.3F, -0.45F, -0.15F, -0.5F, -0.45F, -0.15F, -0.5F, -0.45F, -0.15F, -0.3F, -0.45F, -0.15F); // Box 44
		gunModel[19].setRotationPoint(0.9F, -2.38F, -0.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.1F, -0.15F, -0.2F, -0.1F, -0.15F, -0.2F, -0.1F, -0.15F, -0.2F, -0.1F, -0.15F, -0.2F, -0.1F, -0.15F, -0.5F, -0.15F, -0.15F, -0.5F, -0.15F, -0.15F, -0.2F, -0.1F, -0.15F); // Box 45
		gunModel[20].setRotationPoint(3.6F, -2.4F, -0.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, -0.3F, -0.4F, -0.15F, -0.3F, -0.25F, -0.15F, -0.35F, -0.37F, -0.15F, -0.35F, -0.37F, -0.15F, -0.3F, -0.25F, -0.15F); // Box 47
		gunModel[21].setRotationPoint(0.15F, -1.4F, -0.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.15F, -0.72F, -0.15F, -0.15F, -0.19F, -0.15F, -0.15F, -0.19F, -0.15F, -0.2F, -0.7F, -0.15F, -0.15F, -0.15F, -0.3F, -0.2F, -0.65F, -0.3F, -0.2F, -0.65F, -0.3F, -0.2F, -0.15F, -0.3F); // Box 48
		gunModel[22].setRotationPoint(0.55F, -1.75F, -0.5F);
		gunModel[22].rotateAngleZ = -0.04363323F;

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, -0.4F, -0.15F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, -0.74F, -0.4F, -0.15F, -0.39F, -0.28F, -0.15F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.39F, -0.28F, -0.15F); // Box 0
		gunModel[23].setRotationPoint(0.41F, -1.49F, -0.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, 0F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.55F, 0F, -0.3F, -0.55F, 0F, -0.3F, -0.35F, 0F, -0.3F); // Box 2
		gunModel[24].setRotationPoint(1.98F, -1.4F, -0.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.35F, -0.3F, -0.55F, -0.35F, -0.3F, -0.55F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.55F, -0.35F, -0.3F, -0.55F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F); // Box 3
		gunModel[25].setRotationPoint(2.3F, -0.95F, -0.5F);
		gunModel[25].rotateAngleZ = -0.68067841F;

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.35F, -0.3F, -0.55F, -0.35F, -0.3F, -0.55F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.55F, -0.35F, -0.3F, -0.55F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F); // Box 5
		gunModel[26].setRotationPoint(2.37F, -0.7F, -0.5F);
		gunModel[26].rotateAngleZ = -1.15191731F;

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.35F, -0.3F, -0.55F, -0.35F, -0.3F, -0.55F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.55F, -0.35F, -0.3F, -0.55F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F); // Box 6
		gunModel[27].setRotationPoint(2.2F, -0.54F, -0.5F);
		gunModel[27].rotateAngleZ = -1.36135682F;

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.35F, -0.3F, -0.55F, -0.35F, -0.3F, -0.55F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.3F, -0.35F, -0.3F, -0.6F, -0.35F, -0.3F, -0.6F, -0.35F, -0.3F, -0.3F, -0.35F, -0.3F); // Box 7
		gunModel[28].setRotationPoint(1.95F, -0.45F, -0.5F);
		gunModel[28].rotateAngleZ = -1.46607657F;

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.35F, -0.3F, -0.55F, -0.35F, -0.3F, -0.55F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.3F, -0.35F, -0.3F, -0.6F, -0.35F, -0.3F, -0.6F, -0.35F, -0.3F, -0.3F, -0.35F, -0.3F); // Box 8
		gunModel[29].setRotationPoint(1.85F, -0.25F, -0.5F);
		gunModel[29].rotateAngleZ = -1.98967535F;

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.35F, -0.3F, -0.55F, -0.35F, -0.3F, -0.55F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.3F, -0.35F, -0.3F, -0.6F, -0.35F, -0.3F, -0.6F, -0.35F, -0.3F, -0.3F, -0.35F, -0.3F); // Box 9
		gunModel[30].setRotationPoint(1.65F, -0.2F, -0.5F);
		gunModel[30].rotateAngleZ = -2.37364778F;

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.35F, -0.3F, -0.55F, -0.35F, -0.3F, -0.55F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.12F, -0.25F, -0.3F, -0.58F, -0.25F, -0.16F, -0.58F, -0.25F, -0.16F, -0.12F, -0.25F, -0.3F); // Box 10
		gunModel[31].setRotationPoint(1.45F, -0.22F, -0.5F);
		gunModel[31].rotateAngleZ = -2.8099801F;

		gunModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.65F, -0.43F, -0.3F, 0.15F, -0.43F, -0.3F, 0.15F, -0.43F, -0.3F, 0.65F, -0.43F, -0.3F, 0.65F, -0.45F, -0.45F, 0.15F, -0.45F, -0.45F, 0.15F, -0.45F, -0.45F, 0.65F, -0.45F, -0.45F); // Box 47
		gunModel[32].setRotationPoint(4.6F, -2.41F, -0.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.55F, -0.43F, -0.3F, 0.15F, -0.43F, -0.3F, 0.15F, -0.43F, -0.3F, 0.65F, -0.43F, -0.3F, 0.65F, -0.43F, -0.3F, 0.15F, -0.43F, -0.3F, 0.15F, -0.43F, -0.3F, 0.65F, -0.43F, -0.3F); // Box 48
		gunModel[33].setRotationPoint(4.6F, -2.55F, -0.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.75F, -0.45F, -0.45F, 0.15F, -0.45F, -0.45F, 0.15F, -0.45F, -0.45F, 0.75F, -0.45F, -0.45F, 0.75F, -0.43F, -0.3F, 0.15F, -0.43F, -0.3F, 0.15F, -0.43F, -0.3F, 0.75F, -0.43F, -0.3F); // Box 49
		gunModel[34].setRotationPoint(4.6F, -2.69F, -0.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,1.3F, -0.45F, -0.45F, 0.15F, -0.45F, -0.45F, 0.15F, -0.45F, -0.45F, 1.3F, -0.45F, -0.45F, 1.3F, -0.43F, -0.33F, 0.15F, -0.43F, -0.33F, 0.15F, -0.43F, -0.33F, 1.3F, -0.43F, -0.33F); // Box 50
		gunModel[35].setRotationPoint(8.1F, -3.2F, -0.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,1.3F, -0.43F, -0.33F, 0.15F, -0.43F, -0.33F, 0.15F, -0.43F, -0.33F, 1.3F, -0.43F, -0.33F, 1.3F, -0.45F, -0.33F, 0.15F, -0.45F, -0.33F, 0.15F, -0.45F, -0.33F, 1.3F, -0.45F, -0.33F); // Box 51
		gunModel[36].setRotationPoint(8.1F, -3.06F, -0.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,1.3F, -0.43F, -0.33F, 0.15F, -0.43F, -0.33F, 0.15F, -0.43F, -0.33F, 1.3F, -0.43F, -0.33F, 1.3F, -0.45F, -0.45F, 0.15F, -0.45F, -0.45F, 0.15F, -0.45F, -0.45F, 1.3F, -0.45F, -0.45F); // Box 52
		gunModel[37].setRotationPoint(8.1F, -2.94F, -0.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.25F, -0.38F, -0.35F, -0.25F, -0.38F, -0.35F, -0.25F, -0.38F, -0.35F, -0.25F, -0.38F, -0.5F, -0.25F, -0.38F, -0.5F, -0.25F, -0.38F, -0.5F, -0.25F, -0.38F, -0.5F, -0.25F, -0.38F); // Box 53
		gunModel[38].setRotationPoint(10.9F, -3.1F, -0.5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.05F, -0.25F, -0.25F, -0.05F, -0.25F, -0.25F, -0.05F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, -0.05F, -0.25F, -0.25F, -0.05F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F); // Box 54
		gunModel[39].setRotationPoint(5.85F, -3.1F, -0.5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,1.3F, -0.43F, -0.45F, 0.15F, -0.43F, -0.45F, 0.15F, -0.43F, -0.45F, 1.3F, -0.43F, -0.45F, 1.3F, -0.45F, -0.45F, 0.15F, -0.45F, -0.45F, 0.15F, -0.45F, -0.45F, 1.3F, -0.45F, -0.45F); // Box 55
		gunModel[40].setRotationPoint(11.25F, -3.06F, -0.5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.22F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -0.22F, -0.25F, -0.25F, -0.22F, -0.25F, -0.25F, -0.22F, -0.25F, -0.25F, -0.22F, -0.25F, -0.25F, -0.22F, -0.25F, -0.25F); // Box 56
		gunModel[41].setRotationPoint(5.53F, -2.6F, -0.5F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.22F, -0.4F, -0.25F, -0.22F, -0.4F, -0.25F, -0.22F, -0.4F, -0.25F, -0.22F, -0.4F, -0.25F, -0.45F, -0.45F, -0.25F, -0.45F, -0.45F, -0.25F, -0.45F, -0.45F, -0.25F, -0.45F, -0.45F, -0.25F); // Box 57
		gunModel[42].setRotationPoint(5.53F, -2.25F, -0.5F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, -0.35F, -0.3F, -0.3F, -0.55F, -0.3F, -0.3F, -0.55F, -0.3F, -0.3F, -0.35F, -0.3F, -0.3F); // Box 58
		gunModel[43].setRotationPoint(1.98F, -1.55F, -0.5F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.25F, -0.45F, -0.35F, -0.25F, -0.45F, -0.35F, -0.25F, -0.45F, -0.35F, -0.25F, -0.45F, -0.35F, -0.25F, -0.45F, -0.35F, -0.25F, -0.45F, -0.35F, -0.25F, -0.45F, -0.35F, -0.25F, -0.45F); // Box 59
		gunModel[44].setRotationPoint(10.9F, -3.95F, -0.5F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.35F, -0.4F, -0.38F, -0.35F, -0.4F, -0.38F, -0.35F, -0.4F, -0.45F, -0.35F, -0.4F, -0.41F, -0.25F, -0.4F, -0.43F, -0.25F, -0.4F, -0.43F, -0.25F, -0.4F, -0.41F, -0.25F, -0.4F); // Box 60
		gunModel[45].setRotationPoint(0.8F, -1.45F, -0.5F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.43F, -0.35F, -0.4F, -0.41F, -0.35F, -0.4F, -0.41F, -0.35F, -0.4F, -0.43F, -0.35F, -0.4F, -0.5F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.5F, -0.35F, -0.4F); // Box 61
		gunModel[46].setRotationPoint(0.78F, -1.05F, -0.5F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.43F, -0.35F, -0.4F, -0.41F, -0.35F, -0.4F, -0.41F, -0.35F, -0.4F, -0.43F, -0.35F, -0.4F, -0.6F, -0.45F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.6F, -0.45F, -0.4F); // Box 62
		gunModel[47].setRotationPoint(0.85F, -0.75F, -0.5F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.05F, -0.31F, -0.155F, -0.58F, -0.25F, -0.15F, -0.58F, -0.25F, -0.15F, -0.05F, -0.31F, -0.155F, -0.5F, -0.35F, -0.3F, -0.55F, -0.36F, -0.3F, -0.55F, -0.36F, -0.3F, -0.5F, -0.35F, -0.3F); // Box 63
		gunModel[48].setRotationPoint(0.35F, -0.95F, -0.5F);
		gunModel[48].rotateAngleZ = 0.17453293F;

		gunModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.35F, -0.15F, -0.45F, -0.25F, -0.15F, -0.45F, -0.25F, -0.15F, -0.45F, -0.35F, -0.15F, -0.45F, -0.2F, -0.15F, -0.45F, -0.2F, -0.15F, -0.45F, -0.2F, -0.15F, -0.45F, -0.2F, -0.15F); // Box 64
		gunModel[49].setRotationPoint(-0.1F, -2.5F, -0.5F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.45F, -0.15F, -0.45F, -0.35F, -0.15F, -0.45F, -0.35F, -0.15F, -0.45F, -0.45F, -0.15F, -0.45F, -0.2F, -0.15F, -0.45F, -0.2F, -0.15F, -0.45F, -0.2F, -0.15F, -0.45F, -0.2F, -0.15F); // Box 65
		gunModel[50].setRotationPoint(-0.2F, -2.5F, -0.5F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.65F, -0.15F, -0.45F, -0.45F, -0.15F, -0.45F, -0.45F, -0.15F, -0.45F, -0.65F, -0.15F, -0.45F, -0.2F, -0.15F, -0.45F, -0.2F, -0.15F, -0.45F, -0.2F, -0.15F, -0.45F, -0.2F, -0.15F); // Box 66
		gunModel[51].setRotationPoint(-0.3F, -2.5F, -0.5F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.25F, 0.25F, -0.4F, -0.25F, 0.25F, -0.4F, -0.25F, 0.25F, -0.4F, -0.25F, 0.25F, -0.4F, -0.35F, -0.15F, -0.4F, -0.3F, -0.15F, -0.4F, -0.3F, -0.15F, -0.4F, -0.35F, -0.15F); // Box 67
		gunModel[52].setRotationPoint(0.8F, -2.55F, -0.5F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.15F, -0.4F, -0.33F, -0.15F, -0.4F, -0.33F, -0.15F, -0.4F, -0.4F, -0.15F, -0.4F, -0.25F, 0.25F, -0.4F, -0.25F, 0.25F, -0.4F, -0.25F, 0.25F, -0.4F, -0.25F, 0.25F); // Box 70
		gunModel[53].setRotationPoint(0.8F, -3.65F, -0.5F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.25F, 0.25F, -0.4F, -0.25F, 0.25F, -0.4F, -0.25F, 0.25F, -0.4F, -0.25F, 0.25F, -0.4F, -0.15F, 0.25F, -0.4F, -0.15F, 0.25F, -0.4F, -0.15F, 0.25F, -0.4F, -0.15F, 0.25F); // Box 71
		gunModel[54].setRotationPoint(0.8F, -3.15F, -0.5F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.53F, -0.25F, -0.4F, -0.39F, -0.15F, -0.4F, -0.39F, -0.15F, -0.4F, -0.53F, -0.25F, -0.4F, -0.15F, 0.1F, -0.4F, -0.25F, 0.25F, -0.4F, -0.25F, 0.25F, -0.4F, -0.15F, 0.1F); // Box 72
		gunModel[55].setRotationPoint(0.6F, -3.65F, -0.5F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.15F, 0.1F, -0.4F, -0.25F, 0.25F, -0.4F, -0.25F, 0.25F, -0.4F, -0.15F, 0.1F, -0.4F, -0.45F, -0.25F, -0.4F, -0.35F, -0.15F, -0.4F, -0.35F, -0.15F, -0.4F, -0.45F, -0.25F); // Box 73
		gunModel[56].setRotationPoint(0.6F, -2.55F, -0.5F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.35F, 0.1F, -0.4F, -0.25F, 0.25F, -0.4F, -0.25F, 0.25F, -0.4F, -0.35F, 0.1F, -0.4F, -0.25F, 0.1F, -0.4F, -0.15F, 0.25F, -0.4F, -0.15F, 0.25F, -0.4F, -0.25F, 0.1F); // Box 74
		gunModel[57].setRotationPoint(0.6F, -3.15F, -0.5F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.7F, -0.35F, -0.4F, -0.52F, -0.25F, -0.4F, -0.52F, -0.25F, -0.4F, -0.7F, -0.35F, -0.4F, -0.01F, -0.1F, -0.4F, -0.15F, 0.11F, -0.4F, -0.15F, 0.11F, -0.4F, -0.01F, -0.1F); // Box 75
		gunModel[58].setRotationPoint(0.4F, -3.65F, -0.5F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.02F, -0.15F, -0.4F, -0.16F, 0.1F, -0.4F, -0.16F, 0.1F, -0.4F, -0.02F, -0.15F, -0.4F, -0.7F, -0.2F, -0.4F, -0.52F, -0.2F, -0.4F, -0.52F, -0.2F, -0.4F, -0.7F, -0.2F); // Box 77
		gunModel[59].setRotationPoint(0.4F, -2.55F, -0.5F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.59F, -0.1F, -0.4F, -0.45F, 0.1F, -0.4F, -0.45F, 0.1F, -0.4F, -0.59F, -0.1F, -0.4F, -0.28F, -0.15F, -0.4F, -0.14F, 0.1F, -0.4F, -0.14F, 0.1F, -0.4F, -0.28F, -0.15F); // Box 78
		gunModel[60].setRotationPoint(0.4F, -3.25F, -0.5F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.85F, -0.35F, -0.45F, -0.7F, -0.35F, -0.45F, -0.7F, -0.35F, -0.45F, -0.85F, -0.35F, -0.4F, 0F, -0.35F, -0.45F, 0F, -0.1F, -0.45F, 0F, -0.1F, -0.4F, 0F, -0.35F); // Box 79
		gunModel[61].setRotationPoint(0.25F, -3.65F, -0.5F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, -0.35F, -0.45F, 0F, -0.12F, -0.45F, 0F, -0.12F, -0.4F, 0F, -0.35F, -0.45F, -0.85F, -0.35F, -0.45F, -0.7F, -0.25F, -0.45F, -0.7F, -0.25F, -0.45F, -0.85F, -0.35F); // Box 80
		gunModel[62].setRotationPoint(0.25F, -2.53F, -0.5F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.35F, -0.45F, -0.45F, -0.1F, -0.45F, -0.45F, -0.1F, -0.4F, -0.45F, -0.35F, -0.4F, -0.43F, -0.35F, -0.45F, -0.43F, -0.1F, -0.45F, -0.43F, -0.1F, -0.4F, -0.43F, -0.35F); // Box 81
		gunModel[63].setRotationPoint(0.25F, -3.1F, -0.5F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.38F, -0.4F, -0.35F, -0.38F, -0.4F, -0.35F, -0.38F, -0.4F, -0.35F, -0.38F, -0.45F, -0.35F, -0.38F, -0.4F, -0.35F, -0.38F, -0.4F, -0.35F, -0.38F, -0.45F, -0.35F, -0.38F); // Box 82
		gunModel[64].setRotationPoint(0.1F, -2.9F, -0.5F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.43F, -0.35F, -0.38F, -0.4F, -0.35F, -0.38F, -0.4F, -0.35F, -0.38F, -0.43F, -0.35F, -0.38F, -0.39F, -0.35F, -0.38F, -0.4F, -0.35F, -0.38F, -0.4F, -0.35F, -0.38F, -0.39F, -0.35F, -0.38F); // Box 83
		gunModel[65].setRotationPoint(0.1F, -3.2F, -0.5F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.43F, -0.2F, -0.38F, -0.05F, -0.35F, -0.38F, -0.05F, -0.35F, -0.38F, -0.43F, -0.2F, -0.38F, -0.39F, -0.35F, -0.38F, -0.4F, -0.35F, -0.38F, -0.4F, -0.35F, -0.38F, -0.39F, -0.35F, -0.38F); // Box 84
		gunModel[66].setRotationPoint(0.14F, -3.5F, -0.5F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.43F, -0.35F, -0.38F, -0.4F, -0.28F, -0.38F, -0.4F, -0.28F, -0.38F, -0.43F, -0.35F, -0.38F, 0F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 85
		gunModel[67].setRotationPoint(0.6F, -3.7F, -0.5F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.43F, -0.34F, -0.38F, -0.4F, -0.3F, -0.38F, -0.4F, -0.3F, -0.38F, -0.43F, -0.345F, -0.38F, -0.4F, -0.35F, -0.38F, -0.4F, -0.35F, -0.38F, -0.4F, -0.35F, -0.38F, -0.4F, -0.35F, -0.38F); // Box 86
		gunModel[68].setRotationPoint(0.77F, -3.76F, -0.5F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.34F, -0.38F, -0.3F, -0.3F, -0.38F, -0.3F, -0.3F, -0.38F, -0.3F, -0.345F, -0.38F, -0.3F, -0.35F, -0.38F, -0.3F, -0.35F, -0.38F, -0.3F, -0.35F, -0.38F, -0.3F, -0.35F, -0.38F); // Box 87
		gunModel[69].setRotationPoint(1.06F, -3.8F, -0.5F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.38F, -0.4F, -0.35F, -0.38F, -0.4F, -0.35F, -0.38F, -0.4F, -0.35F, -0.38F, -0.39F, -0.6F, -0.38F, -0.4F, -0.3F, -0.38F, -0.4F, -0.3F, -0.38F, -0.39F, -0.6F, -0.38F); // Box 88
		gunModel[70].setRotationPoint(-0.04F, -3.65F, -0.5F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.4F, -0.38F, -0.45F, -0.4F, -0.38F, -0.45F, -0.4F, -0.38F, -0.35F, -0.4F, -0.38F, -0.39F, -0.4F, -0.38F, -0.4F, -0.4F, -0.38F, -0.4F, -0.4F, -0.38F, -0.39F, -0.4F, -0.38F); // Box 90
		gunModel[71].setRotationPoint(-0.04F, -3.9F, -0.5F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.38F, -0.6F, -0.35F, -0.38F, -0.6F, -0.35F, -0.38F, -0.3F, -0.35F, -0.38F, -0.39F, -0.4F, -0.38F, -0.4F, -0.4F, -0.38F, -0.4F, -0.4F, -0.38F, -0.39F, -0.4F, -0.38F); // Box 91
		gunModel[72].setRotationPoint(-0.08F, -4.1F, -0.5F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.05F, -0.55F, -0.3F, -0.23F, -0.35F, -0.15F, -0.24F, -0.35F, -0.15F, -0.05F, -0.55F, -0.3F, -0.05F, -0.45F, -0.3F, -0.24F, -0.45F, -0.15F, -0.24F, -0.45F, -0.15F, -0.05F, -0.45F, -0.3F); // Box 94
		gunModel[73].setRotationPoint(-0.6F, -2.25F, -0.5F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.55F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.55F, 0F); // Box 95
		gunModel[74].setRotationPoint(-0.55F, -1.7F, -0.5F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.55F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.3F, -0.55F, -0.1F, 0.3F, 0.55F, 0F, 0F, 0.55F, 0F, 0F, 0.55F, 0F, 0.3F, 0.55F, 0F); // Box 96
		gunModel[75].setRotationPoint(-1.55F, -1.7F, -0.5F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.3F, 0.4F, 0F, 1.2F, 0.4F, 0F, 0.15F, 0.4F, 0F, 0.15F, 0.4F, 0F, 1.2F, 0.4F, 0F); // Box 97
		gunModel[76].setRotationPoint(-1.55F, 0.25F, -0.5F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.3F, 0.05F, 0F, -0.3F, 0.05F, 0F, -0.2F, -0.2F, 0F, -0.24F, -0.18F, 0F, -0.75F, -0.18F, 0F, -0.75F, -0.18F, 0F, -0.24F, -0.18F, 0F); // Box 98
		gunModel[77].setRotationPoint(-0.75F, -0.35F, -0.5F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.55F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.3F, -0.55F, -0.3F, 0.3F, 0.55F, -0.3F, 0F, 0.55F, -0.3F, 0F, 0.55F, -0.3F, 0.3F, 0.55F, -0.3F); // Box 100
		gunModel[78].setRotationPoint(-1.56F, -1.7F, -0.5F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0.3F, 0.4F, -0.3F, 1.2F, 0.4F, -0.3F, 0.15F, 0.4F, -0.3F, 0.15F, 0.4F, -0.3F, 1.2F, 0.4F, -0.3F); // Box 101
		gunModel[79].setRotationPoint(-1.56F, 0.26F, -0.5F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.55F, -0.3F, 0F, 0.05F, -0.3F, 0F, 0.05F, -0.3F, 0F, 0.55F, -0.3F); // Box 103
		gunModel[80].setRotationPoint(-0.55F, -1.69F, -0.5F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.3F, -0.3F, 0.05F, -0.3F, -0.3F, 0.05F, -0.3F, -0.2F, -0.2F, -0.3F, -0.24F, -0.18F, -0.3F, -0.75F, -0.18F, -0.3F, -0.75F, -0.18F, -0.3F, -0.24F, -0.18F, -0.3F); // Box 104
		gunModel[81].setRotationPoint(-0.74F, -0.35F, -0.5F);

		gunModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0.3F, 0.4F, -0.3F, 1.2F, 0.4F, -0.3F, 0.15F, 0.4F, -0.3F, 0.15F, 0.4F, -0.3F, 1.2F, 0.4F, -0.3F); // Box 105
		gunModel[82].setRotationPoint(-1.54F, 0.26F, -0.5F);
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 99
		ammoModel[1] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 100
		ammoModel[2] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 101
		ammoModel[3] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 102
		ammoModel[4] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 103
		ammoModel[5] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 104

		ammoModel[0].addShapeBox(0F, 1F, 0F, 1, 1, 1, 0F,0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F); // Box 99
		ammoModel[0].setRotationPoint(1.8F, -4.15F, 0F);

		ammoModel[1].addShapeBox(0F, 1F, 0F, 1, 1, 1, 0F,0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F); // Box 100
		ammoModel[1].setRotationPoint(1.8F, -4.15F, -1F);

		ammoModel[2].addShapeBox(0F, 1F, 0F, 1, 1, 1, 0F,0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F); // Box 101
		ammoModel[2].setRotationPoint(1.8F, -4.6F, -0.7F);

		ammoModel[3].addShapeBox(0F, 1F, 0F, 1, 1, 1, 0F,0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F); // Box 102
		ammoModel[3].setRotationPoint(1.8F, -4.6F, -0.3F);

		ammoModel[4].addShapeBox(0F, 1F, 0F, 1, 1, 1, 0F,0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F); // Box 103
		ammoModel[4].setRotationPoint(1.8F, -3.7F, -0.7F);

		ammoModel[5].addShapeBox(0F, 1F, 0F, 1, 1, 1, 0F,0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F); // Box 104
		ammoModel[5].setRotationPoint(1.8F, -3.7F, -0.3F);
	}

	private void initrevolverBarrelModel_1()
	{
		revolverBarrelModel[0] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 5
		revolverBarrelModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 18
		revolverBarrelModel[2] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 19
		revolverBarrelModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 26
		revolverBarrelModel[4] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 35
		revolverBarrelModel[5] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 17
		revolverBarrelModel[6] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 19
		revolverBarrelModel[7] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 20
		revolverBarrelModel[8] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 25
		revolverBarrelModel[9] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 26
		revolverBarrelModel[10] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 27
		revolverBarrelModel[11] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 28
		revolverBarrelModel[12] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 29
		revolverBarrelModel[13] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 30

		revolverBarrelModel[0].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0.3F, -0.35F, -0.25F, 0.3F, -0.35F, -0.25F, 0.3F, 0F, -0.25F, 0.3F, 0F, -0.25F, 0.3F, -0.35F, -0.25F, 0.3F, -0.35F, -0.25F, 0.3F, 0F, -0.25F, 0.3F); // Box 5
		revolverBarrelModel[0].setRotationPoint(1.75F, -3.15F, -0.5F);

		revolverBarrelModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.23F, -0.25F, -0.35F, -0.23F, -0.25F, -0.35F, -0.23F, -0.25F, 0F, -0.23F, -0.25F, 0F, -0.25F, 0.3F, -0.35F, -0.25F, 0.3F, -0.35F, -0.25F, 0.3F, 0F, -0.25F, 0.3F); // Box 18
		revolverBarrelModel[1].setRotationPoint(1.75F, -3.65F, -0.5F);

		revolverBarrelModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0.3F, -0.35F, -0.25F, 0.3F, -0.35F, -0.25F, 0.3F, 0F, -0.25F, 0.3F, 0F, -0.23F, -0.25F, -0.35F, -0.23F, -0.25F, -0.35F, -0.23F, -0.25F, 0F, -0.25F, -0.25F); // Box 19
		revolverBarrelModel[2].setRotationPoint(1.75F, -2.65F, -0.5F);

		revolverBarrelModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.33F, -1F, -0.35F, -0.33F, -1F, -0.35F, -0.3F, 0.28F, -0.35F, -0.3F, 0.23F, -0.35F, -0.43F, -1F, -0.35F, -0.43F, -1F, -0.35F, -0.28F, 0.3F, -0.35F, -0.31F, 0.2F); // Box 26
		revolverBarrelModel[3].setRotationPoint(1.1F, -2.5F, -0.63F);
		revolverBarrelModel[3].rotateAngleX = 0.78539816F;

		revolverBarrelModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.3F, 0.23F, -0.35F, -0.3F, 0.28F, -0.35F, -0.33F, -1F, -0.35F, -0.33F, -1F, -0.35F, -0.3F, 0.2F, -0.35F, -0.3F, 0.3F, -0.35F, -0.43F, -1F, -0.35F, -0.43F, -1F); // Box 35
		revolverBarrelModel[4].setRotationPoint(1.1F, -3.2F, -0.0899999999999996F);
		revolverBarrelModel[4].rotateAngleX = -0.78539816F;

		revolverBarrelModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.43F, -0.5F, -0.35F, -0.43F, -0.5F, -0.35F, -0.3F, 0.3F, -0.35F, -0.3F, 0.2F, -0.35F, -0.43F, -0.5F, -0.35F, -0.43F, -0.5F, -0.35F, -0.28F, 0.3F, -0.35F, -0.31F, 0.2F); // Box 17
		revolverBarrelModel[5].setRotationPoint(1.1F, -2.13F, -0.5F);
		revolverBarrelModel[5].rotateAngleX = 1.57079633F;

		revolverBarrelModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.43F, -1F, -0.35F, -0.43F, -1F, -0.35F, -0.3F, 0.3F, -0.35F, -0.31F, 0.23F, -0.35F, -0.33F, -1F, -0.35F, -0.33F, -1F, -0.35F, -0.28F, 0.28F, -0.35F, -0.3F, 0.2F); // Box 19
		revolverBarrelModel[6].setRotationPoint(1.1F, -3.5F, 0.0700000000000003F);
		revolverBarrelModel[6].rotateAngleX = -0.78539816F;

		revolverBarrelModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.3F, 0.23F, -0.35F, -0.3F, 0.3F, -0.35F, -0.43F, -1F, -0.35F, -0.43F, -1F, -0.35F, -0.31F, 0.2F, -0.35F, -0.28F, 0.28F, -0.35F, -0.33F, -1F, -0.35F, -0.33F, -1F); // Box 20
		revolverBarrelModel[7].setRotationPoint(1.1F, -2.8F, -0.8F);
		revolverBarrelModel[7].rotateAngleX = 0.78539816F;

		revolverBarrelModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.43F, -0.43F, -0.35F, -0.43F, -0.43F, -0.35F, -0.43F, -0.43F, -0.35F, -0.43F, -0.43F, -0.35F, -0.43F, -0.43F, -0.35F, -0.43F, -0.43F, -0.35F, -0.43F, -0.43F, -0.35F, -0.43F, -0.43F); // Box 25
		revolverBarrelModel[8].setRotationPoint(1.2F, -3.15F, 0.15F);

		revolverBarrelModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.43F, -0.43F, -0.35F, -0.43F, -0.43F, -0.35F, -0.43F, -0.43F, -0.35F, -0.43F, -0.43F, -0.35F, -0.43F, -0.43F, -0.35F, -0.43F, -0.43F, -0.35F, -0.43F, -0.43F, -0.35F, -0.43F, -0.43F); // Box 26
		revolverBarrelModel[9].setRotationPoint(1.2F, -3.15F, -1.15F);

		revolverBarrelModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.43F, -0.43F, -0.35F, -0.43F, -0.43F, -0.35F, -0.43F, -0.43F, -0.35F, -0.43F, -0.43F, -0.35F, -0.43F, -0.43F, -0.35F, -0.43F, -0.43F, -0.35F, -0.43F, -0.43F, -0.35F, -0.43F, -0.43F); // Box 27
		revolverBarrelModel[10].setRotationPoint(1.2F, -3.7F, -0.2F);

		revolverBarrelModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.43F, -0.43F, -0.35F, -0.43F, -0.43F, -0.35F, -0.43F, -0.43F, -0.35F, -0.43F, -0.43F, -0.35F, -0.43F, -0.43F, -0.35F, -0.43F, -0.43F, -0.35F, -0.43F, -0.43F, -0.35F, -0.43F, -0.43F); // Box 28
		revolverBarrelModel[11].setRotationPoint(1.2F, -3.7F, -0.8F);

		revolverBarrelModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.43F, -0.43F, -0.35F, -0.43F, -0.43F, -0.35F, -0.43F, -0.43F, -0.35F, -0.43F, -0.43F, -0.35F, -0.43F, -0.43F, -0.35F, -0.43F, -0.43F, -0.35F, -0.43F, -0.43F, -0.35F, -0.43F, -0.43F); // Box 29
		revolverBarrelModel[12].setRotationPoint(1.2F, -2.6F, -0.2F);

		revolverBarrelModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.43F, -0.43F, -0.35F, -0.43F, -0.43F, -0.35F, -0.43F, -0.43F, -0.35F, -0.43F, -0.43F, -0.35F, -0.43F, -0.43F, -0.35F, -0.43F, -0.43F, -0.35F, -0.43F, -0.43F, -0.35F, -0.43F, -0.43F); // Box 30
		revolverBarrelModel[13].setRotationPoint(1.2F, -2.6F, -0.8F);
		

		gunSlideDistance = 0F;
		animationType = EnumAnimationType.REVOLVER;
		translateAll(0F, -3F, 0F);
	}
}