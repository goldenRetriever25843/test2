//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 11.10.2017 - 18:59:21
// Last changed on: 11.10.2017 - 18:59:21

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelM95rifle extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelM95rifle() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[94];
		defaultScopeModel = new ModelRendererTurbo[80];
		
		gunSlideDistance = 0.1F;
		animationType = EnumAnimationType.RIFLE_TOP;

		initgunModel_1();
		initattachmentModel_1();

		translateAll(-3F, -1.5F, -1.0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 7
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 8
		gunModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 9
		gunModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 10
		gunModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 11
		gunModel[5] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 12
		gunModel[6] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 13
		gunModel[7] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 13
		gunModel[8] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 13
		gunModel[9] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 13
		gunModel[10] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 13
		gunModel[11] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 13
		gunModel[12] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 19
		gunModel[13] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 20
		gunModel[14] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 21
		gunModel[15] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 0
		gunModel[16] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 1
		gunModel[17] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 2
		gunModel[18] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 3
		gunModel[19] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 4
		gunModel[20] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 5
		gunModel[21] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 6
		gunModel[22] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 7
		gunModel[23] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 0
		gunModel[24] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 1
		gunModel[25] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 2
		gunModel[26] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 4
		gunModel[27] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 5
		gunModel[28] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 6
		gunModel[29] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 7
		gunModel[30] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 8
		gunModel[31] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 10
		gunModel[32] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 11
		gunModel[33] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 12
		gunModel[34] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 0
		gunModel[35] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 2
		gunModel[36] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 3
		gunModel[37] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 4
		gunModel[38] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 5
		gunModel[39] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 6
		gunModel[40] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 8
		gunModel[41] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 9
		gunModel[42] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 0
		gunModel[43] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 4
		gunModel[44] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 6
		gunModel[45] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 6
		gunModel[46] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 6
		gunModel[47] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 6
		gunModel[48] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 6
		gunModel[49] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 6
		gunModel[50] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 12
		gunModel[51] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 13
		gunModel[52] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 15
		gunModel[53] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 16
		gunModel[54] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 17
		gunModel[55] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 18
		gunModel[56] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 20
		gunModel[57] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 21
		gunModel[58] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 22
		gunModel[59] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 24
		gunModel[60] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 25
		gunModel[61] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 26
		gunModel[62] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 27
		gunModel[63] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 28
		gunModel[64] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 29
		gunModel[65] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 30
		gunModel[66] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 31
		gunModel[67] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 32
		gunModel[68] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 33
		gunModel[69] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 33
		gunModel[70] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 33
		gunModel[71] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 33
		gunModel[72] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 33
		gunModel[73] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 33
		gunModel[74] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 33
		gunModel[75] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 41
		gunModel[76] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 43
		gunModel[77] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 44
		gunModel[78] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 45
		gunModel[79] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 46
		gunModel[80] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 47
		gunModel[81] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 48
		gunModel[82] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 49
		gunModel[83] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 50
		gunModel[84] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 1
		gunModel[85] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 2
		gunModel[86] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 3
		gunModel[87] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 19
		gunModel[88] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 2
		gunModel[89] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 5
		gunModel[90] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 0
		gunModel[91] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 56
		gunModel[92] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 57
		gunModel[93] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 58

		gunModel[0].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,-0.25F, -1.25F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F, -0.8F, 0F, -0.25F, -1.25F, 0F, -0.3F, 0F, -0.5F, -0.5F, -0.7F, -0.5F, -0.5F, -0.9F, -0.15F, -0.3F, -0.25F, -0.1F); // Box 7
		gunModel[0].setRotationPoint(-5F, -2.5F, 0F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.125F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.1F, -0.1F, -0.125F, -0.1F, -0.1F, -0.175F, -0.55F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, 0F, -0.175F, -0.55F, 0F); // Box 8
		gunModel[1].setRotationPoint(-5F, -2.5F, 0F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,-0.175F, -0.45F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.175F, -0.45F, 0F, -0.25F, -0.75F, -0.5F, -0.5F, -1.2F, -0.5F, -0.5F, -1.2F, 0F, -0.25F, -0.75F, 0F); // Box 9
		gunModel[2].setRotationPoint(-5F, -2.5F, 0F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.8F, -0.5F, 0.1F, -0.85F, -0.5F, 0.05F, -0.75F, -0.125F, -0.5F, -0.8F, 0F, -0.5F, -0.7F, -0.5F, -0.2F, -0.75F, -0.5F, -0.2F, -0.85F, -0.225F, -0.5F, -0.9F, -0.15F); // Box 10
		gunModel[3].setRotationPoint(0F, -2.5F, 0F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.25F, -0.5F, 0.575F, -0.25F, -0.5F, 0.275F, -0.25F, -0.125F, -0.5F, -0.25F, 0F, -0.5F, -1.2F, -0.5F, 0.1F, -1.15F, -0.5F, 0.05F, -1.25F, -0.125F, -0.5F, -1.2F, 0F); // Box 11
		gunModel[4].setRotationPoint(0F, -2.5F, 0F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0.15F, -0.5F, 0F, 0.05F, -0.125F, -0.5F, -0.1F, -0.1F, -0.5F, -0.75F, -0.5F, 0.575F, -0.75F, -0.5F, 0.275F, -0.75F, -0.125F, -0.5F, -0.75F, 0F); // Box 12
		gunModel[5].setRotationPoint(0F, -2.5F, 0F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,-0.25F, -1.25F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, -0.5F, -0.25F, -1.25F, -0.5F, -0.3F, -0.25F, -0.1F, -0.5F, -0.9F, -0.15F, -0.5F, -0.7F, -0.5F, -0.3F, 0F, -0.5F); // Box 13
		gunModel[6].setRotationPoint(-5F, -2.5F, 0F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.125F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.175F, -0.55F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.5F, -0.175F, -0.55F, -0.5F); // Box 13
		gunModel[7].setRotationPoint(-5F, -2.5F, 0F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,-0.175F, -0.45F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.175F, -0.45F, -0.5F, -0.25F, -0.75F, 0F, -0.5F, -1.2F, 0F, -0.5F, -1.2F, -0.5F, -0.25F, -0.75F, -0.5F); // Box 13
		gunModel[8].setRotationPoint(-5F, -2.5F, 0F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.8F, 0F, 0.05F, -0.75F, -0.125F, 0.1F, -0.85F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F, -0.9F, -0.15F, -0.2F, -0.85F, -0.225F, -0.2F, -0.75F, -0.5F, -0.5F, -0.7F, -0.5F); // Box 13
		gunModel[9].setRotationPoint(0F, -2.5F, 0F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.25F, 0F, 0.275F, -0.25F, -0.125F, 0.575F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -1.2F, 0F, 0.05F, -1.25F, -0.125F, 0.1F, -1.15F, -0.5F, -0.5F, -1.2F, -0.5F); // Box 13
		gunModel[10].setRotationPoint(0F, -2.5F, 0F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.1F, -0.1F, 0F, 0.05F, -0.1F, 0F, 0.15F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, 0F, 0.275F, -0.75F, -0.125F, 0.575F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F); // Box 13
		gunModel[11].setRotationPoint(0F, -2.5F, 0F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.05F, -0.5F, -0.7F, -0.05F); // Box 19
		gunModel[12].setRotationPoint(4F, -3F, 0F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.15F, -0.5F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, 0F, 0F, 0.05F, -0.125F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.725F, -0.125F, 0F, -0.725F, -0.125F); // Box 20
		gunModel[13].setRotationPoint(1F, -2.5F, 0F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, -0.5F, -0.3F, -0.5F, -0.5F, -0.225F, -0.125F, 0F, -0.225F, -0.125F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 21
		gunModel[14].setRotationPoint(1F, -3F, 0F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.15F, 0F, -0.3F, 0F, 0F, 0F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.425F, -0.275F, 0F, -0.225F, -0.125F); // Box 0
		gunModel[15].setRotationPoint(5F, -3F, 0F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.15F, 0F, -0.2F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.525F, -0.275F, 0F, -0.425F, -0.275F); // Box 1
		gunModel[16].setRotationPoint(13F, -3F, 0F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0.075F, -0.5F, 0F, -0.025F, -0.5F, 0F, -0.175F, -0.275F, -0.25F, -0.125F, -0.225F, -0.25F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.225F, -0.25F, -0.7F, -0.125F); // Box 2
		gunModel[17].setRotationPoint(5F, -3F, 0F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, -0.08F, -0.28F, 0F, -0.08F, -0.28F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.15F); // Box 3
		gunModel[18].setRotationPoint(13F, -3F, 0F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -1F, 0.2F, -0.25F, -1F, 0.2F, -0.5F, 0.25F, -0.8F, 0F, 0.25F, -0.8F, 0F, 0.25F, 0.2F, -0.5F, 0.25F, 0.2F); // Box 4
		gunModel[19].setRotationPoint(1.5F, -2.5F, -0.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0.05F, -0.5F, 0F, 0.1F, -0.5F, 0F, -0.08F, -0.28F, 0F, -0.08F, -0.2F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.15F, 0F, -0.7F, -0.02F); // Box 5
		gunModel[20].setRotationPoint(6F, -3F, 0F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.225F, -0.125F, -0.5F, -0.225F, -0.125F); // Box 6
		gunModel[21].setRotationPoint(1F, -3F, 0F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.05F, -0.125F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, -0.5F, 0F, 0.15F, -0.5F, 0F, -0.725F, -0.125F, -0.5F, -0.725F, -0.125F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 7
		gunModel[22].setRotationPoint(1F, -2.5F, 0F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.8F, -0.75F, 0F, -0.8F, -0.75F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.25F, -0.8F, -0.75F, -0.25F, -0.8F, -0.75F, -0.25F, 0.2F, 0F, -0.25F, 0.2F); // Box 0
		gunModel[23].setRotationPoint(1.5F, -2.5F, -0.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, -0.8F, -0.75F, -0.75F, -0.8F, -0.75F, -0.75F, 0.2F, 0F, -0.75F, 0.2F, -0.25F, 0F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0F, 0.2F, -0.25F, 0F, 0.2F); // Box 1
		gunModel[24].setRotationPoint(1.5F, -2.5F, -0.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, -0.75F, -0.8F, 0F, -0.75F, -0.8F, 0F, -0.75F, 0.2F, -0.75F, -0.75F, 0.2F, -0.5F, 0F, -0.8F, -0.25F, 0F, -0.8F, -0.25F, 0F, 0.2F, -0.5F, 0F, 0.2F); // Box 2
		gunModel[25].setRotationPoint(1.75F, -2.5F, -0.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.25F, -0.9F, -0.9F, -0.15F, -0.9F, -0.9F, -0.15F, 0.1F, 0F, -0.25F, 0.1F); // Box 4
		gunModel[26].setRotationPoint(2F, -2.5F, -0.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.375F, -0.675F, 0F, 0.5F, -0.675F, 0F, 0.5F, 0.325F, 0F, 0.375F, 0.325F, 0F, -0.75F, -0.675F, -0.25F, -0.875F, -0.675F, -0.25F, -0.875F, 0.325F, 0F, -0.75F, 0.325F); // Box 5
		gunModel[27].setRotationPoint(3.5F, -1.5F, -0.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.675F, 0F, 0F, -0.675F, 0F, 0F, 0.325F, 0F, 0F, 0.325F, 0F, -1.25F, -0.675F, 0F, -1.5F, -0.675F, 0F, -1.5F, 0.325F, 0F, -1.25F, 0.325F); // Box 6
		gunModel[28].setRotationPoint(2.5F, -2.5F, -0.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, -0.675F, 0F, 0.375F, -0.675F, 0F, 0.375F, 0.325F, 0F, 0.25F, 0.325F, 0F, -0.875F, -0.675F, -0.75F, -0.75F, -0.675F, -0.75F, -0.75F, 0.325F, 0F, -0.875F, 0.325F); // Box 7
		gunModel[29].setRotationPoint(2.5F, -1.5F, -0.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, -0.675F, 0F, 0.375F, -0.675F, 0F, 0.375F, 0.325F, 0F, 0.25F, 0.325F, -0.25F, -0.75F, -0.675F, 0F, -0.75F, -0.675F, 0F, -0.75F, 0.325F, -0.25F, -0.75F, 0.325F); // Box 8
		gunModel[30].setRotationPoint(2.5F, -1.5F, -0.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.075F, -0.325F, -0.5F, -0.075F, -0.325F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F); // Box 10
		gunModel[31].setRotationPoint(1F, -3.15F, 0F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, -0.075F, -0.325F, -0.5F, -0.075F, -0.325F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F); // Box 11
		gunModel[32].setRotationPoint(1F, -3.15F, 0F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.075F, -0.325F, -0.5F, -0.075F, -0.325F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 12
		gunModel[33].setRotationPoint(1F, -3.65F, 0F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.075F, -0.325F, -0.5F, -0.075F, -0.325F); // Box 0
		gunModel[34].setRotationPoint(1F, -3.65F, 0F);

		gunModel[35].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,-0.125F, -0.125F, 0F, -0.75F, -0.075F, 0F, -0.75F, -0.075F, 0F, -0.125F, -0.125F, 0F, -0.075F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.075F, -0.75F, 0F); // Box 2
		gunModel[35].setRotationPoint(1.5F, -3.15F, 0F);

		gunModel[36].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,-0.075F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.075F, -0.75F, 0F, -0.125F, -0.125F, 0F, -0.75F, -0.075F, 0F, -0.75F, -0.075F, 0F, -0.125F, -0.125F, 0F); // Box 3
		gunModel[36].setRotationPoint(1.5F, -3.65F, 0F);

		gunModel[37].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,-0.75F, -0.75F, 0F, -0.075F, -0.75F, 0F, -0.075F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.075F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.75F, -0.075F, 0F); // Box 4
		gunModel[37].setRotationPoint(1F, -3.65F, 0F);

		gunModel[38].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,-0.75F, -0.075F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.75F, -0.075F, 0F, -0.75F, -0.75F, 0F, -0.075F, -0.75F, 0F, -0.075F, -0.75F, 0F, -0.75F, -0.75F, 0F); // Box 5
		gunModel[38].setRotationPoint(1F, -3.15F, 0F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.05F, 0F, -0.7F, -0.05F); // Box 6
		gunModel[39].setRotationPoint(2F, -3F, 0F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, -0.5F, -0.8F, -0.1F, -0.5F, -0.8F, -0.1F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.3F, -0.8F, -0.1F, -0.3F, -0.8F, -0.1F, -0.3F, 0F, -0.6F, -0.3F, 0F); // Box 8
		gunModel[40].setRotationPoint(1.5F, -4F, 0F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 9
		gunModel[41].setRotationPoint(2F, -3.65F, 0F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.15F, -0.5F, -0.75F, 0.15F, -0.5F, -0.75F, -0.05F, -0.15F, 0F, -0.05F, -0.15F, 0F, -0.7F, -0.5F, -0.75F, -0.7F, -0.5F, -0.75F, -0.7F, -0.05F, 0F, -0.7F, -0.05F); // Box 0
		gunModel[42].setRotationPoint(5F, -3F, 0F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.825F, -0.325F, 0F, -0.825F, -0.325F, 0F, -0.825F, -0.5F, 0F, -0.825F, -0.5F, 0F, -0.05F, -0.375F, 0F, -0.05F, -0.375F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 4
		gunModel[43].setRotationPoint(19F, -3.64F, 0F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.225F, -0.125F, 0F, -0.425F, -0.275F, 0F, -0.2F, -0.5F, 0F, 0F, -0.5F); // Box 6
		gunModel[44].setRotationPoint(5F, -3F, 0F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.3F, -0.15F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.425F, -0.275F, 0F, -0.525F, -0.275F, 0F, -0.3F, -0.5F, 0F, -0.2F, -0.5F); // Box 6
		gunModel[45].setRotationPoint(13F, -3F, 0F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.125F, -0.225F, 0F, -0.175F, -0.275F, 0F, -0.025F, -0.5F, -0.25F, 0.075F, -0.5F, -0.25F, -0.7F, -0.125F, 0F, -0.7F, -0.225F, 0F, -0.7F, -0.5F, -0.25F, -0.7F, -0.5F); // Box 6
		gunModel[46].setRotationPoint(5F, -3F, 0F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.08F, -0.28F, 0F, -0.08F, -0.28F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, -0.7F, -0.15F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F); // Box 6
		gunModel[47].setRotationPoint(13F, -3F, 0F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.08F, -0.2F, 0F, -0.08F, -0.28F, 0F, 0.1F, -0.5F, 0F, 0.05F, -0.5F, 0F, -0.7F, -0.02F, 0F, -0.7F, -0.15F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F); // Box 6
		gunModel[48].setRotationPoint(6F, -3F, 0F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.05F, -0.15F, -0.75F, -0.05F, -0.15F, -0.75F, 0.15F, -0.5F, 0F, 0.15F, -0.5F, 0F, -0.7F, -0.05F, -0.75F, -0.7F, -0.05F, -0.75F, -0.7F, -0.5F, 0F, -0.7F, -0.5F); // Box 6
		gunModel[49].setRotationPoint(5F, -3F, 0F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0.13F, -0.5F, -0.3F, 0.13F, -0.5F, -0.3F, -0.05F, -0.25F, -0.3F, -0.05F, -0.25F, -0.3F, -0.7F, -0.5F, -0.3F, -0.7F, -0.5F, -0.3F, -0.7F, -0.15F, -0.3F, -0.7F, -0.12F); // Box 12
		gunModel[50].setRotationPoint(12.5F, -3F, 0F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.05F, -0.25F, -0.3F, -0.05F, -0.25F, -0.3F, 0.13F, -0.5F, -0.3F, 0.13F, -0.5F, -0.3F, -0.7F, -0.12F, -0.3F, -0.7F, -0.15F, -0.3F, -0.7F, -0.5F, -0.3F, -0.7F, -0.5F); // Box 13
		gunModel[51].setRotationPoint(12.5F, -3F, 0F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.12F, -0.3F, -0.17F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, -0.435F, -0.255F, -0.3F, -0.395F, -0.245F); // Box 15
		gunModel[52].setRotationPoint(12.5F, -3F, 0F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.12F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.395F, -0.245F, -0.3F, -0.435F, -0.255F, -0.3F, -0.2F, -0.5F, -0.3F, -0.17F, -0.5F); // Box 16
		gunModel[53].setRotationPoint(12.5F, -3F, 0F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0.13F, -0.5F, -0.3F, 0.13F, -0.5F, -0.3F, -0.05F, -0.28F, -0.3F, -0.05F, -0.28F, -0.3F, -0.7F, -0.5F, -0.3F, -0.7F, -0.5F, -0.3F, -0.7F, -0.17F, -0.3F, -0.7F, -0.15F); // Box 17
		gunModel[54].setRotationPoint(18F, -3F, 0F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.05F, -0.28F, -0.3F, -0.05F, -0.28F, -0.3F, 0.13F, -0.5F, -0.3F, 0.13F, -0.5F, -0.3F, -0.7F, -0.15F, -0.3F, -0.7F, -0.17F, -0.3F, -0.7F, -0.5F, -0.3F, -0.7F, -0.5F); // Box 18
		gunModel[55].setRotationPoint(18F, -3F, 0F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.17F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.475F, -0.245F, -0.3F, -0.495F, -0.245F, -0.3F, -0.27F, -0.5F, -0.3F, -0.28F, -0.5F); // Box 20
		gunModel[56].setRotationPoint(18F, -3F, 0F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.875F, -0.375F, -0.5F, -0.875F, -0.375F, -0.5F, -0.875F, -0.5F, 0F, -0.875F, -0.5F, 0F, 0.05F, -0.375F, -0.625F, 0.05F, -0.375F, -0.625F, 0.1F, -0.5F, 0F, 0.1F, -0.5F); // Box 21
		gunModel[57].setRotationPoint(19F, -3.64F, 0F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.875F, -0.5F, -0.5F, -0.875F, -0.5F, -0.5F, -0.875F, -0.375F, 0F, -0.875F, -0.375F, 0F, 0.1F, -0.5F, -0.625F, 0.1F, -0.5F, -0.625F, 0.05F, -0.375F, 0F, 0.05F, -0.375F); // Box 22
		gunModel[58].setRotationPoint(19F, -3.64F, 0F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.125F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.625F, -0.125F, -0.75F, -0.625F, -0.125F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.625F, -0.125F, 0F, -0.625F); // Box 24
		gunModel[59].setRotationPoint(6F, -3.85F, 0F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.875F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.5F, -0.875F, -0.75F, -0.5F, -0.875F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.875F, 0F, -0.5F); // Box 25
		gunModel[60].setRotationPoint(7F, -3.85F, 0F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.6F, -0.225F, -0.75F, -0.6F, -0.225F, -0.75F, -0.6F, -0.6F, -0.125F, -0.6F, -0.6F, -0.125F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, -0.3F, -0.5F, -0.125F, -0.3F, -0.5F); // Box 26
		gunModel[61].setRotationPoint(6F, -3.85F, 0F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.05F, -0.875F, -0.125F, -0.75F, -0.875F, -0.125F, -0.75F, -0.75F, -0.5F, 0.05F, -0.75F, -0.5F, 0.05F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.5F, 0.05F, 0.125F, -0.5F); // Box 27
		gunModel[62].setRotationPoint(6F, -3.85F, 0F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.05F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.875F, -0.125F, 0.05F, -0.875F, -0.125F, 0.05F, 0.125F, -0.5F, -0.75F, 0.125F, -0.5F, -0.75F, 0.125F, 0F, 0.05F, 0.125F, 0F); // Box 28
		gunModel[63].setRotationPoint(6F, -3.85F, 0F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.7F, -0.25F, -0.375F, -0.7F, -0.25F, -0.375F, -0.7F, -0.6F, -0.25F, -0.7F, -0.6F, -0.25F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.6F, -0.25F, 0F, -0.6F); // Box 29
		gunModel[64].setRotationPoint(6F, -3.85F, 0F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.7F, -0.225F, -0.75F, -0.7F, -0.225F, -0.75F, -0.7F, -0.5F, -0.125F, -0.7F, -0.5F, -0.125F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F); // Box 30
		gunModel[65].setRotationPoint(6F, -3.85F, 0F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.7F, -0.65F, -0.5F, -0.7F, -0.65F, -0.375F, -0.7F, -0.25F, -0.25F, -0.7F, -0.25F, -0.375F, 0F, -0.65F, -0.5F, 0F, -0.65F, -0.375F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 31
		gunModel[66].setRotationPoint(6F, -3.85F, -0.5F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.7F, -0.4F, -0.475F, -0.7F, -0.4F, -0.525F, -0.7F, -0.5F, -0.25F, -0.7F, -0.5F, -0.25F, 0F, -0.4F, -0.475F, 0F, -0.4F, -0.525F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 32
		gunModel[67].setRotationPoint(6F, -3.85F, 0F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.125F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.25F, -0.125F, -0.75F, -0.25F, -0.125F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.25F, -0.125F, 0F, -0.25F); // Box 33
		gunModel[68].setRotationPoint(6F, -3.85F, 0F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.875F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.25F, -0.875F, -0.75F, -0.25F, -0.875F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.875F, 0F, -0.25F); // Box 33
		gunModel[69].setRotationPoint(7F, -3.85F, 0F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.6F, -0.6F, -0.75F, -0.6F, -0.6F, -0.75F, -0.6F, -0.225F, -0.125F, -0.6F, -0.225F, -0.125F, -0.3F, -0.5F, -0.75F, -0.3F, -0.5F, -0.75F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 33
		gunModel[70].setRotationPoint(6F, -3.85F, 0F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.7F, -0.6F, -0.375F, -0.7F, -0.6F, -0.375F, -0.7F, -0.25F, -0.25F, -0.7F, -0.25F, -0.25F, 0F, -0.6F, -0.375F, 0F, -0.6F, -0.375F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 33
		gunModel[71].setRotationPoint(6F, -3.85F, 0F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.7F, -0.5F, -0.75F, -0.7F, -0.5F, -0.75F, -0.7F, -0.225F, -0.125F, -0.7F, -0.225F, -0.125F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 33
		gunModel[72].setRotationPoint(6F, -3.85F, 0F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.7F, -0.25F, -0.375F, -0.7F, -0.25F, -0.5F, -0.7F, -0.65F, -0.375F, -0.7F, -0.65F, -0.25F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.5F, 0F, -0.65F, -0.375F, 0F, -0.65F); // Box 33
		gunModel[73].setRotationPoint(6F, -3.85F, 0.5F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.7F, -0.5F, -0.525F, -0.7F, -0.5F, -0.475F, -0.7F, -0.4F, -0.25F, -0.7F, -0.4F, -0.25F, 0F, -0.5F, -0.525F, 0F, -0.5F, -0.475F, 0F, -0.4F, -0.25F, 0F, -0.4F); // Box 33
		gunModel[74].setRotationPoint(6F, -3.85F, 0F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, 0.15F, -0.45F, -0.75F, 0.15F, -0.45F, -0.75F, 0.15F, -0.45F, -0.125F, 0.15F, -0.45F, -0.125F, -0.825F, -0.45F, -0.75F, -0.825F, -0.45F, -0.75F, -0.825F, -0.45F, -0.125F, -0.825F, -0.45F); // Box 41
		gunModel[75].setRotationPoint(19.25F, -3F, 0F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.65F, -0.55F, -0.75F, -0.65F, -0.55F, -0.75F, -0.65F, -0.35F, -0.125F, -0.65F, -0.35F, -0.125F, -0.2F, -0.6F, -0.75F, -0.2F, -0.6F, -0.75F, -0.2F, -0.3F, -0.125F, -0.2F, -0.3F); // Box 43
		gunModel[76].setRotationPoint(19.25F, -4.05F, 0F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.6F, -0.5F, -0.75F, -0.6F, -0.5F, -0.75F, -0.65F, -0.35F, -0.125F, -0.65F, -0.35F, -0.125F, -0.3F, -0.5F, -0.75F, -0.3F, -0.5F, -0.75F, -0.25F, -0.35F, -0.125F, -0.25F, -0.35F); // Box 44
		gunModel[77].setRotationPoint(19.25F, -4.05F, 0F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.3F, -0.5F, -0.75F, -0.3F, -0.5F, -0.75F, -0.25F, -0.35F, -0.125F, -0.25F, -0.35F, -0.125F, -0.6F, -0.5F, -0.75F, -0.6F, -0.5F, -0.75F, -0.65F, -0.35F, -0.125F, -0.65F, -0.35F); // Box 45
		gunModel[78].setRotationPoint(19.25F, -3.45F, 0F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, -0.35F, -0.75F, -0.25F, -0.35F, -0.75F, -0.3F, -0.5F, -0.125F, -0.3F, -0.5F, -0.125F, -0.65F, -0.35F, -0.75F, -0.65F, -0.35F, -0.75F, -0.6F, -0.5F, -0.125F, -0.6F, -0.5F); // Box 46
		gunModel[79].setRotationPoint(19.25F, -3.45F, 0F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.2F, -0.6F, -0.75F, -0.2F, -0.6F, -0.75F, -0.2F, -0.3F, -0.125F, -0.2F, -0.3F, -0.125F, -0.65F, -0.55F, -0.75F, -0.65F, -0.55F, -0.75F, -0.65F, -0.35F, -0.125F, -0.65F, -0.35F); // Box 47
		gunModel[80].setRotationPoint(19.25F, -3.45F, 0F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.2F, -0.3F, -0.75F, -0.2F, -0.3F, -0.75F, -0.2F, -0.6F, -0.125F, -0.2F, -0.6F, -0.125F, -0.65F, -0.35F, -0.75F, -0.65F, -0.35F, -0.75F, -0.65F, -0.55F, -0.125F, -0.65F, -0.55F); // Box 48
		gunModel[81].setRotationPoint(19.25F, -3.45F, 0F);

		gunModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.65F, -0.35F, -0.75F, -0.65F, -0.35F, -0.75F, -0.65F, -0.55F, -0.125F, -0.65F, -0.55F, -0.125F, -0.2F, -0.3F, -0.75F, -0.2F, -0.3F, -0.75F, -0.2F, -0.6F, -0.125F, -0.2F, -0.6F); // Box 49
		gunModel[82].setRotationPoint(19.25F, -4.05F, 0F);

		gunModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.65F, -0.35F, -0.75F, -0.65F, -0.35F, -0.75F, -0.6F, -0.5F, -0.125F, -0.6F, -0.5F, -0.125F, -0.25F, -0.35F, -0.75F, -0.25F, -0.35F, -0.75F, -0.3F, -0.5F, -0.125F, -0.3F, -0.5F); // Box 50
		gunModel[83].setRotationPoint(19.25F, -4.05F, 0F);

		gunModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.05F, -0.375F, 0F, -0.05F, -0.375F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.825F, -0.325F, 0F, -0.825F, -0.325F, 0F, -0.825F, -0.5F, 0F, -0.825F, -0.5F); // Box 1
		gunModel[84].setRotationPoint(19F, -3F, 0F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.05F, -0.375F, 0F, -0.05F, -0.375F, 0F, -0.825F, -0.5F, 0F, -0.825F, -0.5F, 0F, -0.825F, -0.325F, 0F, -0.825F, -0.325F); // Box 2
		gunModel[85].setRotationPoint(19F, -3F, 0F);

		gunModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.825F, -0.5F, 0F, -0.825F, -0.5F, 0F, -0.825F, -0.325F, 0F, -0.825F, -0.325F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.05F, -0.375F, 0F, -0.05F, -0.375F); // Box 3
		gunModel[86].setRotationPoint(19F, -3.64F, 0F);

		gunModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.17F, -0.3F, -0.3F, -0.15F, -0.3F, -0.28F, -0.5F, -0.3F, -0.27F, -0.5F, -0.3F, -0.495F, -0.245F, -0.3F, -0.475F, -0.245F); // Box 19
		gunModel[87].setRotationPoint(18F, -3F, 0F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.5F, -0.5F, 0.2F, -0.5F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.7F, -0.5F, -0.5F, -0.7F, -0.5F, -0.5F, -0.7F, -0.05F, 0F, -0.7F, -0.05F); // Box 2
		gunModel[88].setRotationPoint(2F, -3F, 0F);

		gunModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, -0.7F, -0.05F, -0.5F, -0.7F, -0.05F, -0.5F, -0.7F, -0.5F, 0F, -0.7F, -0.5F); // Box 5
		gunModel[89].setRotationPoint(2F, -3F, 0F);

		gunModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.2F, -0.5F, -0.5F, 0.2F, -0.5F, -0.5F, -0.7F, -0.05F, 0F, -0.7F, -0.05F, 0F, -0.7F, -0.5F, -0.5F, -0.7F, -0.5F); // Box 0
		gunModel[90].setRotationPoint(4F, -3F, 0F);

		gunModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, -0.7F, -0.8F, -0.1F, -0.7F, -0.8F, -0.1F, -0.7F, 0F, -0.6F, -0.7F, 0F, -0.6F, 0.2F, -0.5F, -0.1F, 0.2F, -0.5F, -0.1F, 0.2F, -0.3F, -0.6F, 0.2F, -0.3F); // Box 56
		gunModel[91].setRotationPoint(1.5F, -4F, 0F);

		gunModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, -0.5F, -0.8F, -0.1F, -0.5F, -0.8F, -0.1F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.3F, -0.8F, -0.1F, -0.3F, -0.8F, -0.1F, -0.3F, 0F, -0.6F, -0.3F, 0F); // Box 57
		gunModel[92].setRotationPoint(4F, -4F, 0F);

		gunModel[93].addShapeBox(3F, 0F, 0F, 1, 1, 1, 0F,-0.6F, -0.7F, -0.8F, -0.1F, -0.7F, -0.8F, -0.1F, -0.7F, 0F, -0.6F, -0.7F, 0F, -0.6F, 0.2F, -0.5F, -0.1F, 0.2F, -0.5F, -0.1F, 0.2F, -0.3F, -0.6F, 0.2F, -0.3F); // Box 58
		gunModel[93].setRotationPoint(1F, -4F, 0F);
	}

	private void initattachmentModel_1()
	{
		defaultScopeModel[0] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // No Part Selected
		defaultScopeModel[1] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 8
		defaultScopeModel[2] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 4
		defaultScopeModel[3] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 6
		defaultScopeModel[4] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 7
		defaultScopeModel[5] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 8
		defaultScopeModel[6] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 9
		defaultScopeModel[7] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 10
		defaultScopeModel[8] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 11
		defaultScopeModel[9] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 12
		defaultScopeModel[10] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 13
		defaultScopeModel[11] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 14
		defaultScopeModel[12] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 15
		defaultScopeModel[13] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 15
		defaultScopeModel[14] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 17
		defaultScopeModel[15] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 18
		defaultScopeModel[16] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 19
		defaultScopeModel[17] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 19
		defaultScopeModel[18] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 21
		defaultScopeModel[19] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 21
		defaultScopeModel[20] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 21
		defaultScopeModel[21] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 21
		defaultScopeModel[22] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 21
		defaultScopeModel[23] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 21
		defaultScopeModel[24] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 21
		defaultScopeModel[25] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 21
		defaultScopeModel[26] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 29
		defaultScopeModel[27] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 32
		defaultScopeModel[28] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 32
		defaultScopeModel[29] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 32
		defaultScopeModel[30] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 32
		defaultScopeModel[31] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 36
		defaultScopeModel[32] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 46
		defaultScopeModel[33] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 47
		defaultScopeModel[34] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 48
		defaultScopeModel[35] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 48
		defaultScopeModel[36] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 48
		defaultScopeModel[37] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 48
		defaultScopeModel[38] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 48
		defaultScopeModel[39] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 48
		defaultScopeModel[40] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 54
		defaultScopeModel[41] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // No Part Selected
		defaultScopeModel[42] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // No Part Selected
		defaultScopeModel[43] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // No Part Selected
		defaultScopeModel[44] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // No Part Selected
		defaultScopeModel[45] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // No Part Selected
		defaultScopeModel[46] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // No Part Selected
		defaultScopeModel[47] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // No Part Selected
		defaultScopeModel[48] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // No Part Selected
		defaultScopeModel[49] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // No Part Selected
		defaultScopeModel[50] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // No Part Selected
		defaultScopeModel[51] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // No Part Selected
		defaultScopeModel[52] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // No Part Selected
		defaultScopeModel[53] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // No Part Selected
		defaultScopeModel[54] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 75
		defaultScopeModel[55] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 76
		defaultScopeModel[56] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 77
		defaultScopeModel[57] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 78
		defaultScopeModel[58] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 79
		defaultScopeModel[59] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 80
		defaultScopeModel[60] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 81
		defaultScopeModel[61] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 82
		defaultScopeModel[62] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 83
		defaultScopeModel[63] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 84
		defaultScopeModel[64] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 85
		defaultScopeModel[65] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 86
		defaultScopeModel[66] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 87
		defaultScopeModel[67] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 88
		defaultScopeModel[68] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 91
		defaultScopeModel[69] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 92
		defaultScopeModel[70] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 93
		defaultScopeModel[71] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 94
		defaultScopeModel[72] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 92
		defaultScopeModel[73] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 92
		defaultScopeModel[74] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 92
		defaultScopeModel[75] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 92
		defaultScopeModel[76] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 92
		defaultScopeModel[77] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 92
		defaultScopeModel[78] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 92
		defaultScopeModel[79] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 92

		defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.115F, -0.825F, -1F, -0.115F, -0.825F, -1F, -0.115F, -0.05F, 0F, -0.115F, -0.05F, 0F, -0.865F, -0.825F, -1F, -0.865F, -0.825F, -1F, -0.865F, -0.05F, 0F, -0.865F, -0.05F); // No Part Selected
		defaultScopeModel[0].setRotationPoint(4.25F, -4F, 0.25F);

		defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0.25F, -0.125F, 3F, 0.25F, -0.125F, 3F, 0.125F, -0.625F, 1F, 0.125F, -0.625F, 1F, -1.2F, -0.125F, 3F, -1.2F, -0.125F, 3F, -1.075F, -0.625F, 1F, -1.075F, -0.625F); // Box 8
		defaultScopeModel[1].setRotationPoint(1.5F, -4F, 0.75F);

		defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -1.22F, -0.125F, 0F, -1.22F, -0.125F, 0F, -1.095F, -0.605F, -0.5F, -1.095F, -0.605F, -0.5F, 0.27F, -0.125F, 0F, 0.27F, -0.125F, 0F, 0.145F, -0.605F, -0.5F, 0.145F, -0.605F); // Box 4
		defaultScopeModel[2].setRotationPoint(4F, -4.75F, 0.75F);

		defaultScopeModel[3].addShapeBox(0F, 0F, -0.75F, 1, 1, 1, 0F,0F, 0.375F, -0.875F, -0.75F, 0.25F, -0.875F, -0.75F, 0.125F, 0.125F, 0F, 0.2F, 0.2F, 0F, -1.2F, -0.875F, -0.75F, -1.2F, -0.875F, -0.75F, -1.075F, 0.125F, 0F, -1.075F, 0.125F); // Box 6
		defaultScopeModel[3].setRotationPoint(1.5F, -4F, 0.75F);

		defaultScopeModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0.125F, -0.325F, 3F, 0.125F, -0.325F, 3F, 0.125F, -0.625F, 1F, 0.125F, -0.625F, 1F, -0.875F, -0.45F, 3F, -0.875F, -0.45F, 3F, -0.875F, -0.5F, 1F, -0.875F, -0.5F); // Box 7
		defaultScopeModel[4].setRotationPoint(1.5F, -4F, 0.75F);

		defaultScopeModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0.125F, -0.625F, 3F, 0.125F, -0.625F, 3F, 0.125F, -0.325F, 1F, 0.125F, -0.325F, 1F, -0.875F, -0.5F, 3F, -0.875F, -0.5F, 3F, -0.875F, -0.45F, 1F, -0.875F, -0.45F); // Box 8
		defaultScopeModel[5].setRotationPoint(1.5F, -4F, 0F);

		defaultScopeModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, -0.875F, -0.5F, 3F, -0.875F, -0.5F, 3F, -0.875F, -0.45F, 1F, -0.875F, -0.45F, 1F, 0.125F, -0.625F, 3F, 0.125F, -0.625F, 3F, 0.125F, -0.325F, 1F, 0.125F, -0.325F); // Box 9
		defaultScopeModel[6].setRotationPoint(1.5F, -4.75F, 0F);

		defaultScopeModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, -0.875F, -0.45F, 3F, -0.875F, -0.45F, 3F, -0.875F, -0.5F, 1F, -0.875F, -0.5F, 1F, 0.125F, -0.325F, 3F, 0.125F, -0.325F, 3F, 0.125F, -0.625F, 1F, 0.125F, -0.625F); // Box 10
		defaultScopeModel[7].setRotationPoint(1.5F, -4.75F, 0.75F);

		defaultScopeModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, -1.2F, -0.125F, 3F, -1.2F, -0.125F, 3F, -1.075F, -0.625F, 1F, -1.075F, -0.625F, 1F, 0.25F, -0.125F, 3F, 0.25F, -0.125F, 3F, 0.125F, -0.625F, 1F, 0.125F, -0.625F); // Box 11
		defaultScopeModel[8].setRotationPoint(1.5F, -4.75F, 0.75F);

		defaultScopeModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, -1.075F, -0.625F, 3F, -1.075F, -0.625F, 3F, -1.2F, -0.125F, 1F, -1.2F, -0.125F, 1F, 0.125F, -0.625F, 3F, 0.125F, -0.625F, 3F, 0.25F, -0.125F, 1F, 0.25F, -0.125F); // Box 12
		defaultScopeModel[9].setRotationPoint(1.5F, -4.75F, 0F);

		defaultScopeModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0.125F, -0.625F, 3F, 0.125F, -0.625F, 3F, 0.25F, -0.125F, 1F, 0.25F, -0.125F, 1F, -1.075F, -0.625F, 3F, -1.075F, -0.625F, 3F, -1.2F, -0.125F, 1F, -1.2F, -0.125F); // Box 13
		defaultScopeModel[10].setRotationPoint(1.5F, -4F, 0F);

		defaultScopeModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.875F, -0.47F, 0F, -0.875F, -0.47F, 0F, -0.875F, -0.48F, -0.5F, -0.875F, -0.48F, -0.5F, 0.145F, -0.345F, 0F, 0.145F, -0.345F, 0F, 0.145F, -0.605F, -0.5F, 0.145F, -0.605F); // Box 14
		defaultScopeModel[11].setRotationPoint(4F, -4.75F, 0.75F);

		defaultScopeModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.27F, -0.125F, 0F, 0.27F, -0.125F, 0F, 0.145F, -0.605F, -0.5F, 0.145F, -0.605F, -0.5F, -1.22F, -0.125F, 0F, -1.22F, -0.125F, 0F, -1.095F, -0.605F, -0.5F, -1.095F, -0.605F); // Box 15
		defaultScopeModel[12].setRotationPoint(4F, -4F, 0.75F);

		defaultScopeModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.145F, -0.345F, 0F, 0.145F, -0.345F, 0F, 0.145F, -0.605F, -0.5F, 0.145F, -0.605F, -0.5F, -0.875F, -0.47F, 0F, -0.875F, -0.47F, 0F, -0.875F, -0.48F, -0.5F, -0.875F, -0.48F); // Box 15
		defaultScopeModel[13].setRotationPoint(4F, -4F, 0.75F);

		defaultScopeModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.145F, -0.605F, 0F, 0.145F, -0.605F, 0F, 0.27F, -0.125F, -0.5F, 0.27F, -0.125F, -0.5F, -1.095F, -0.605F, 0F, -1.095F, -0.605F, 0F, -1.22F, -0.125F, -0.5F, -1.22F, -0.125F); // Box 17
		defaultScopeModel[14].setRotationPoint(4F, -4F, 0F);

		defaultScopeModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.145F, -0.605F, 0F, 0.145F, -0.605F, 0F, 0.145F, -0.345F, -0.5F, 0.145F, -0.345F, -0.5F, -0.875F, -0.48F, 0F, -0.875F, -0.48F, 0F, -0.875F, -0.47F, -0.5F, -0.875F, -0.47F); // Box 18
		defaultScopeModel[15].setRotationPoint(4F, -4F, 0F);

		defaultScopeModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -1.095F, -0.605F, 0F, -1.095F, -0.605F, 0F, -1.22F, -0.125F, -0.5F, -1.22F, -0.125F, -0.5F, 0.145F, -0.605F, 0F, 0.145F, -0.605F, 0F, 0.27F, -0.125F, -0.5F, 0.27F, -0.125F); // Box 19
		defaultScopeModel[16].setRotationPoint(4F, -4.75F, 0F);

		defaultScopeModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.875F, -0.48F, 0F, -0.875F, -0.48F, 0F, -0.875F, -0.47F, -0.5F, -0.875F, -0.47F, -0.5F, 0.145F, -0.605F, 0F, 0.145F, -0.605F, 0F, 0.145F, -0.345F, -0.5F, 0.145F, -0.345F); // Box 19
		defaultScopeModel[17].setRotationPoint(4F, -4.75F, 0F);

		defaultScopeModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -1.22F, -0.125F, 0F, -1.22F, -0.125F, 0F, -1.095F, -0.605F, -0.5F, -1.095F, -0.605F, -0.5F, 0.27F, -0.125F, 0F, 0.27F, -0.125F, 0F, 0.145F, -0.605F, -0.5F, 0.145F, -0.605F); // Box 21
		defaultScopeModel[18].setRotationPoint(1.5F, -4.75F, 0.75F);

		defaultScopeModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.875F, -0.47F, 0F, -0.875F, -0.47F, 0F, -0.875F, -0.48F, -0.5F, -0.875F, -0.48F, -0.5F, 0.145F, -0.345F, 0F, 0.145F, -0.345F, 0F, 0.145F, -0.605F, -0.5F, 0.145F, -0.605F); // Box 21
		defaultScopeModel[19].setRotationPoint(1.5F, -4.75F, 0.75F);

		defaultScopeModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.27F, -0.125F, 0F, 0.27F, -0.125F, 0F, 0.145F, -0.605F, -0.5F, 0.145F, -0.605F, -0.5F, -1.22F, -0.125F, 0F, -1.22F, -0.125F, 0F, -1.095F, -0.605F, -0.5F, -1.095F, -0.605F); // Box 21
		defaultScopeModel[20].setRotationPoint(1.5F, -4F, 0.75F);

		defaultScopeModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.145F, -0.345F, 0F, 0.145F, -0.345F, 0F, 0.145F, -0.605F, -0.5F, 0.145F, -0.605F, -0.5F, -0.875F, -0.47F, 0F, -0.875F, -0.47F, 0F, -0.875F, -0.48F, -0.5F, -0.875F, -0.48F); // Box 21
		defaultScopeModel[21].setRotationPoint(1.5F, -4F, 0.75F);

		defaultScopeModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.145F, -0.605F, 0F, 0.145F, -0.605F, 0F, 0.27F, -0.125F, -0.5F, 0.27F, -0.125F, -0.5F, -1.095F, -0.605F, 0F, -1.095F, -0.605F, 0F, -1.22F, -0.125F, -0.5F, -1.22F, -0.125F); // Box 21
		defaultScopeModel[22].setRotationPoint(1.5F, -4F, 0F);

		defaultScopeModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.145F, -0.605F, 0F, 0.145F, -0.605F, 0F, 0.145F, -0.345F, -0.5F, 0.145F, -0.345F, -0.5F, -0.875F, -0.48F, 0F, -0.875F, -0.48F, 0F, -0.875F, -0.47F, -0.5F, -0.875F, -0.47F); // Box 21
		defaultScopeModel[23].setRotationPoint(1.5F, -4F, 0F);

		defaultScopeModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -1.095F, -0.605F, 0F, -1.095F, -0.605F, 0F, -1.22F, -0.125F, -0.5F, -1.22F, -0.125F, -0.5F, 0.145F, -0.605F, 0F, 0.145F, -0.605F, 0F, 0.27F, -0.125F, -0.5F, 0.27F, -0.125F); // Box 21
		defaultScopeModel[24].setRotationPoint(1.5F, -4.75F, 0F);

		defaultScopeModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.875F, -0.48F, 0F, -0.875F, -0.48F, 0F, -0.875F, -0.47F, -0.5F, -0.875F, -0.47F, -0.5F, 0.145F, -0.605F, 0F, 0.145F, -0.605F, 0F, 0.145F, -0.345F, -0.5F, 0.145F, -0.345F); // Box 21
		defaultScopeModel[25].setRotationPoint(1.5F, -4.75F, 0F);

		defaultScopeModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.125F, -1.075F, -0.75F, 0.125F, -1.075F, -0.75F, 0.125F, 0.125F, 0F, 0.2F, 0.2F, 0F, -0.875F, -1.2F, -0.75F, -0.875F, -1.2F, -0.75F, -0.875F, 0.25F, 0F, -0.875F, 0.375F); // Box 29
		defaultScopeModel[26].setRotationPoint(1.5F, -4F, 0F);

		defaultScopeModel[27].addShapeBox(0F, 0F, -0.75F, 1, 1, 1, 0F,0F, -1.2F, -0.875F, -0.75F, -1.2F, -0.875F, -0.75F, -1.075F, 0.125F, 0F, -1.075F, 0.125F, 0F, 0.375F, -0.875F, -0.75F, 0.25F, -0.875F, -0.75F, 0.125F, 0.125F, 0F, 0.2F, 0.2F); // Box 32
		defaultScopeModel[27].setRotationPoint(1.5F, -4.75F, 0.75F);

		defaultScopeModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.875F, -1.2F, -0.75F, -0.875F, -1.2F, -0.75F, -0.875F, 0.25F, 0F, -0.875F, 0.375F, 0F, 0.125F, -1.075F, -0.75F, 0.125F, -1.075F, -0.75F, 0.125F, 0.125F, 0F, 0.2F, 0.2F); // Box 32
		defaultScopeModel[28].setRotationPoint(1.5F, -4.75F, 0F);

		defaultScopeModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.25F, -0.875F, -1.2F, -1F, -0.875F, -1.2F, -1F, -0.875F, 0.375F, 1.25F, -0.875F, 0.375F, 1.25F, 0.125F, -1.075F, -1F, 0.125F, -1.075F, -1F, 0.2F, 0.2F, 1.25F, 0.2F, 0.2F); // Box 32
		defaultScopeModel[29].setRotationPoint(1.5F, -4.75F, 0F);

		defaultScopeModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.25F, -1.2F, -0.875F, -1F, -1.2F, -0.875F, -1F, -1.075F, 0.125F, 1.25F, -1.075F, 0.125F, 1.25F, 0.375F, -0.875F, -1F, 0.375F, -0.875F, -1F, 0.2F, 0.2F, 1.25F, 0.2F, 0.2F); // Box 32
		defaultScopeModel[30].setRotationPoint(1.5F, -4.75F, 0F);

		defaultScopeModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.25F, 0.2F, 0.2F, -1F, 0.2F, 0.2F, -1F, 0.375F, -0.875F, 1.25F, 0.375F, -0.875F, 1.25F, -1.075F, 0.125F, -1F, -1.075F, 0.125F, -1F, -1.2F, -0.875F, 1.25F, -1.2F, -0.875F); // Box 36
		defaultScopeModel[31].setRotationPoint(1.5F, -4F, 0.75F);

		defaultScopeModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.25F, 0.375F, -0.875F, -1F, 0.375F, -0.875F, -1F, 0.2F, 0.2F, 1.25F, 0.2F, 0.2F, 1.25F, -1.2F, -0.875F, -1F, -1.2F, -0.875F, -1F, -1.075F, 0.125F, 1.25F, -1.075F, 0.125F); // Box 46
		defaultScopeModel[32].setRotationPoint(1.5F, -4F, 0F);

		defaultScopeModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.25F, 0.125F, -1.075F, -1F, 0.125F, -1.075F, -1F, 0.2F, 0.2F, 1.25F, 0.2F, 0.2F, 1.25F, -0.875F, -1.2F, -1F, -0.875F, -1.2F, -1F, -0.875F, 0.375F, 1.25F, -0.875F, 0.375F); // Box 47
		defaultScopeModel[33].setRotationPoint(1.5F, -4F, 0F);

		defaultScopeModel[34].addShapeBox(0F, 0F, -0.75F, 1, 1, 1, 0F,0F, 0.2F, 0.2F, -0.75F, 0.125F, 0.125F, -0.75F, 0.25F, -0.875F, 0F, 0.375F, -0.875F, 0F, -1.075F, 0.125F, -0.75F, -1.075F, 0.125F, -0.75F, -1.2F, -0.875F, 0F, -1.2F, -0.875F); // Box 48
		defaultScopeModel[34].setRotationPoint(1.5F, -4F, 1.5F);

		defaultScopeModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, 0.2F, -0.75F, 0.125F, 0.125F, -0.75F, 0.125F, -1.075F, 0F, 0.125F, -1.075F, 0F, -0.875F, 0.375F, -0.75F, -0.875F, 0.25F, -0.75F, -0.875F, -1.2F, 0F, -0.875F, -1.2F); // Box 48
		defaultScopeModel[35].setRotationPoint(1.5F, -4F, 0.75F);

		defaultScopeModel[36].addShapeBox(0F, 0F, -0.75F, 1, 1, 1, 0F,0F, -1.075F, 0.125F, -0.75F, -1.075F, 0.125F, -0.75F, -1.2F, -0.875F, 0F, -1.2F, -0.875F, 0F, 0.2F, 0.2F, -0.75F, 0.125F, 0.125F, -0.75F, 0.25F, -0.875F, 0F, 0.375F, -0.875F); // Box 48
		defaultScopeModel[36].setRotationPoint(1.5F, -4.75F, 1.5F);

		defaultScopeModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.875F, 0.375F, -0.75F, -0.875F, 0.25F, -0.75F, -0.875F, -1.2F, 0F, -0.875F, -1.2F, 0F, 0.2F, 0.2F, -0.75F, 0.125F, 0.125F, -0.75F, 0.125F, -1.075F, 0F, 0.125F, -1.075F); // Box 48
		defaultScopeModel[37].setRotationPoint(1.5F, -4.75F, 0.75F);

		defaultScopeModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.25F, -0.875F, 0.375F, -1F, -0.875F, 0.375F, -1F, -0.875F, -1.2F, 1.25F, -0.875F, -1.2F, 1.25F, 0.2F, 0.2F, -1F, 0.2F, 0.2F, -1F, 0.125F, -1.075F, 1.25F, 0.125F, -1.075F); // Box 48
		defaultScopeModel[38].setRotationPoint(1.5F, -4.75F, 0.75F);

		defaultScopeModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.25F, -1.075F, 0.125F, -1F, -1.075F, 0.125F, -1F, -1.2F, -0.875F, 1.25F, -1.2F, -0.875F, 1.25F, 0.2F, 0.2F, -1F, 0.2F, 0.2F, -1F, 0.375F, -0.875F, 1.25F, 0.375F, -0.875F); // Box 48
		defaultScopeModel[39].setRotationPoint(1.5F, -4.75F, 0.75F);

		defaultScopeModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.25F, 0.2F, 0.2F, -1F, 0.2F, 0.2F, -1F, 0.125F, -1.075F, 1.25F, 0.125F, -1.075F, 1.25F, -0.875F, 0.375F, -1F, -0.875F, 0.375F, -1F, -0.875F, -1.2F, 1.25F, -0.875F, -1.2F); // Box 54
		defaultScopeModel[40].setRotationPoint(1.5F, -4F, 0.75F);

		defaultScopeModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.62F, -1F, 0.2F, -0.62F, -1F, 0.2F, -0.37F, 0F, 0.2F, -0.37F, 0F, -0.55F, -0.62F, -1F, -0.55F, -0.62F, -1F, -0.55F, -0.37F, 0F, -0.55F, -0.37F); // No Part Selected
		defaultScopeModel[41].setRotationPoint(4.25F, -4F, 0.25F);

		defaultScopeModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.615F, -1F, 0.2F, -0.615F, -1F, 0.2F, -0.365F, 0F, 0.2F, -0.365F, 0F, -1.05F, -0.615F, -1F, -1.05F, -0.615F, -1F, -1.05F, -0.365F, 0F, -1.05F, -0.365F); // No Part Selected
		defaultScopeModel[42].setRotationPoint(4.25F, -4F, 0.25F);

		defaultScopeModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.12F, -0.3F, -1F, -0.12F, -0.3F, -1F, -0.12F, -0.05F, 0F, -0.12F, -0.05F, 0F, -0.87F, -0.3F, -1F, -0.87F, -0.3F, -1F, -0.87F, -0.05F, 0F, -0.87F, -0.05F); // No Part Selected
		defaultScopeModel[43].setRotationPoint(4.25F, -4F, 0.25F);

		defaultScopeModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.115F, -0.05F, -1F, -0.115F, -0.05F, -1F, -0.115F, -0.825F, 0F, -0.115F, -0.825F, 0F, -0.865F, -0.05F, -1F, -0.865F, -0.05F, -1F, -0.865F, -0.825F, 0F, -0.865F, -0.825F); // No Part Selected
		defaultScopeModel[44].setRotationPoint(4.25F, -4F, 0.5F);

		defaultScopeModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1.05F, -0.615F, -1F, -1.05F, -0.615F, -1F, -1.05F, -0.365F, 0F, -1.05F, -0.365F, 0F, 0.2F, -0.615F, -1F, 0.2F, -0.615F, -1F, 0.2F, -0.365F, 0F, 0.2F, -0.365F); // No Part Selected
		defaultScopeModel[45].setRotationPoint(4.25F, -4.75F, 0.25F);

		defaultScopeModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.14F, -0.75F, -1F, 0.14F, -0.75F, -1F, 0.12F, -0.13F, 0F, 0.12F, -0.13F, 0F, -0.87F, -0.9F, -1F, -0.87F, -0.9F, -1F, -0.87F, -0.01F, 0F, -0.87F, -0.01F); // No Part Selected
		defaultScopeModel[46].setRotationPoint(4.25F, -4F, 0.25F);

		defaultScopeModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.24F, -0.6F, -1F, 0.24F, -0.6F, -1F, 0.12F, -0.13F, 0F, 0.12F, -0.13F, 0F, -1.17F, -0.6F, -1F, -1.17F, -0.6F, -1F, -1.02F, -0.11F, 0F, -1.02F, -0.11F); // No Part Selected
		defaultScopeModel[47].setRotationPoint(4.25F, -4F, 0.25F);

		defaultScopeModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1.17F, -0.6F, -1F, -1.17F, -0.6F, -1F, -1.02F, -0.11F, 0F, -1.02F, -0.11F, 0F, 0.24F, -0.6F, -1F, 0.24F, -0.6F, -1F, 0.12F, -0.13F, 0F, 0.12F, -0.13F); // No Part Selected
		defaultScopeModel[48].setRotationPoint(4.25F, -4.75F, 0.25F);

		defaultScopeModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1.02F, -0.11F, -1F, -1.02F, -0.11F, -1F, -1.17F, -0.6F, 0F, -1.17F, -0.6F, 0F, 0.12F, -0.13F, -1F, 0.12F, -0.13F, -1F, 0.24F, -0.6F, 0F, 0.24F, -0.6F); // No Part Selected
		defaultScopeModel[49].setRotationPoint(4.25F, -4.75F, 0.5F);

		defaultScopeModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.12F, -0.13F, -1F, 0.12F, -0.13F, -1F, 0.24F, -0.6F, 0F, 0.24F, -0.6F, 0F, -1.02F, -0.11F, -1F, -1.02F, -0.11F, -1F, -1.17F, -0.6F, 0F, -1.17F, -0.6F); // No Part Selected
		defaultScopeModel[50].setRotationPoint(4.25F, -4F, 0.5F);

		defaultScopeModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.87F, -0.9F, -1F, -0.87F, -0.9F, -1F, -0.87F, -0.01F, 0F, -0.87F, -0.01F, 0F, 0.14F, -0.75F, -1F, 0.14F, -0.75F, -1F, 0.12F, -0.13F, 0F, 0.12F, -0.13F); // No Part Selected
		defaultScopeModel[51].setRotationPoint(4.25F, -4.75F, 0.25F);

		defaultScopeModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.87F, -0.01F, -1F, -0.87F, -0.01F, -1F, -0.87F, -0.9F, 0F, -0.87F, -0.9F, 0F, 0.12F, -0.13F, -1F, 0.12F, -0.13F, -1F, 0.14F, -0.75F, 0F, 0.14F, -0.75F); // No Part Selected
		defaultScopeModel[52].setRotationPoint(4.25F, -4.75F, 0.5F);

		defaultScopeModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.12F, -0.13F, -1F, 0.12F, -0.13F, -1F, 0.14F, -0.75F, 0F, 0.14F, -0.75F, 0F, -0.87F, -0.01F, -1F, -0.87F, -0.01F, -1F, -0.87F, -0.9F, 0F, -0.87F, -0.9F); // No Part Selected
		defaultScopeModel[53].setRotationPoint(4.25F, -4F, 0.5F);

		defaultScopeModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.115F, -0.825F, -1F, -0.115F, -0.825F, -1F, -0.115F, -0.05F, 0F, -0.115F, -0.05F, 0F, -0.865F, -0.825F, -1F, -0.865F, -0.825F, -1F, -0.865F, -0.05F, 0F, -0.865F, -0.05F); // Box 75
		defaultScopeModel[54].setRotationPoint(2.75F, -4F, 0.25F);

		defaultScopeModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.62F, -1F, 0.2F, -0.62F, -1F, 0.2F, -0.37F, 0F, 0.2F, -0.37F, 0F, -0.55F, -0.62F, -1F, -0.55F, -0.62F, -1F, -0.55F, -0.37F, 0F, -0.55F, -0.37F); // Box 76
		defaultScopeModel[55].setRotationPoint(2.75F, -4F, 0.25F);

		defaultScopeModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, -0.615F, -1F, 0.2F, -0.615F, -1F, 0.2F, -0.365F, 0F, 0.2F, -0.365F, 0F, -1.05F, -0.615F, -1F, -1.05F, -0.615F, -1F, -1.05F, -0.365F, 0F, -1.05F, -0.365F); // Box 77
		defaultScopeModel[56].setRotationPoint(2.75F, -4F, 0.25F);

		defaultScopeModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.12F, -0.3F, -1F, -0.12F, -0.3F, -1F, -0.12F, -0.05F, 0F, -0.12F, -0.05F, 0F, -0.87F, -0.3F, -1F, -0.87F, -0.3F, -1F, -0.87F, -0.05F, 0F, -0.87F, -0.05F); // Box 78
		defaultScopeModel[57].setRotationPoint(2.75F, -4F, 0.25F);

		defaultScopeModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.115F, -0.05F, -1F, -0.115F, -0.05F, -1F, -0.115F, -0.825F, 0F, -0.115F, -0.825F, 0F, -0.865F, -0.05F, -1F, -0.865F, -0.05F, -1F, -0.865F, -0.825F, 0F, -0.865F, -0.825F); // Box 79
		defaultScopeModel[58].setRotationPoint(2.75F, -4F, 0.5F);

		defaultScopeModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1.05F, -0.615F, -1F, -1.05F, -0.615F, -1F, -1.05F, -0.365F, 0F, -1.05F, -0.365F, 0F, 0.2F, -0.615F, -1F, 0.2F, -0.615F, -1F, 0.2F, -0.365F, 0F, 0.2F, -0.365F); // Box 80
		defaultScopeModel[59].setRotationPoint(2.75F, -4.75F, 0.25F);

		defaultScopeModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.14F, -0.75F, -1F, 0.14F, -0.75F, -1F, 0.12F, -0.13F, 0F, 0.12F, -0.13F, 0F, -0.87F, -0.9F, -1F, -0.87F, -0.9F, -1F, -0.87F, -0.01F, 0F, -0.87F, -0.01F); // Box 81
		defaultScopeModel[60].setRotationPoint(2.75F, -4F, 0.25F);

		defaultScopeModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.24F, -0.6F, -1F, 0.24F, -0.6F, -1F, 0.12F, -0.13F, 0F, 0.12F, -0.13F, 0F, -1.17F, -0.6F, -1F, -1.17F, -0.6F, -1F, -1.02F, -0.11F, 0F, -1.02F, -0.11F); // Box 82
		defaultScopeModel[61].setRotationPoint(2.75F, -4F, 0.25F);

		defaultScopeModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1.17F, -0.6F, -1F, -1.17F, -0.6F, -1F, -1.02F, -0.11F, 0F, -1.02F, -0.11F, 0F, 0.24F, -0.6F, -1F, 0.24F, -0.6F, -1F, 0.12F, -0.13F, 0F, 0.12F, -0.13F); // Box 83
		defaultScopeModel[62].setRotationPoint(2.75F, -4.75F, 0.25F);

		defaultScopeModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1.02F, -0.11F, -1F, -1.02F, -0.11F, -1F, -1.17F, -0.6F, 0F, -1.17F, -0.6F, 0F, 0.12F, -0.13F, -1F, 0.12F, -0.13F, -1F, 0.24F, -0.6F, 0F, 0.24F, -0.6F); // Box 84
		defaultScopeModel[63].setRotationPoint(2.75F, -4.75F, 0.5F);

		defaultScopeModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.12F, -0.13F, -1F, 0.12F, -0.13F, -1F, 0.24F, -0.6F, 0F, 0.24F, -0.6F, 0F, -1.02F, -0.11F, -1F, -1.02F, -0.11F, -1F, -1.17F, -0.6F, 0F, -1.17F, -0.6F); // Box 85
		defaultScopeModel[64].setRotationPoint(2.75F, -4F, 0.5F);

		defaultScopeModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.87F, -0.9F, -1F, -0.87F, -0.9F, -1F, -0.87F, -0.01F, 0F, -0.87F, -0.01F, 0F, 0.14F, -0.75F, -1F, 0.14F, -0.75F, -1F, 0.12F, -0.13F, 0F, 0.12F, -0.13F); // Box 86
		defaultScopeModel[65].setRotationPoint(2.75F, -4.75F, 0.25F);

		defaultScopeModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.87F, -0.01F, -1F, -0.87F, -0.01F, -1F, -0.87F, -0.9F, 0F, -0.87F, -0.9F, 0F, 0.12F, -0.13F, -1F, 0.12F, -0.13F, -1F, 0.14F, -0.75F, 0F, 0.14F, -0.75F); // Box 87
		defaultScopeModel[66].setRotationPoint(2.75F, -4.75F, 0.5F);

		defaultScopeModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.12F, -0.13F, -1F, 0.12F, -0.13F, -1F, 0.14F, -0.75F, 0F, 0.14F, -0.75F, 0F, -0.87F, -0.01F, -1F, -0.87F, -0.01F, -1F, -0.87F, -0.9F, 0F, -0.87F, -0.9F); // Box 88
		defaultScopeModel[67].setRotationPoint(2.75F, -4F, 0.5F);

		defaultScopeModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-2.25F, 0.3F, -0.125F, 1.5F, 0.3F, -0.125F, 1.5F, 0.3F, -0.625F, -2.35F, 0.3F, -0.725F, -2.25F, -1.2F, -0.125F, 1.5F, -1.2F, -0.125F, 1.5F, -1.075F, -0.625F, -2.35F, -1.175F, -0.725F); // Box 91
		defaultScopeModel[68].setRotationPoint(1.5F, -4F, 0.75F);

		defaultScopeModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-2.2F, -1.1F, -0.125F, 1.5F, -1.1F, -0.125F, 1.5F, -1.1F, -0.575F, -2.3F, -1.1F, -0.675F, -2.2F, 0.2F, -0.125F, 1.5F, 0.2F, -0.125F, 1.5F, 0.2F, -0.575F, -2.3F, 0.2F, -0.675F); // Box 92
		defaultScopeModel[69].setRotationPoint(1.5F, -5.5F, 0.75F);

		defaultScopeModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-2.35F, 0.3F, -0.725F, 1.5F, 0.3F, -0.625F, 1.5F, 0.3F, -0.125F, -2.25F, 0.3F, -0.125F, -2.35F, -1.175F, -0.725F, 1.5F, -1.075F, -0.625F, 1.5F, -1.2F, -0.125F, -2.25F, -1.2F, -0.125F); // Box 93
		defaultScopeModel[70].setRotationPoint(1.5F, -4F, 0F);

		defaultScopeModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.5F, 0.3F, -0.625F, -2.35F, 0.3F, -0.725F, -2.25F, 0.3F, -0.125F, 1.5F, 0.3F, -0.125F, 1.5F, -1.075F, -0.625F, -2.35F, -1.175F, -0.725F, -2.25F, -1.2F, -0.125F, 1.5F, -1.2F, -0.125F); // Box 94
		defaultScopeModel[71].setRotationPoint(5.5F, -4F, 0F);

		defaultScopeModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.5F, 0.3F, -0.125F, -2.25F, 0.3F, -0.125F, -2.35F, 0.3F, -0.725F, 1.5F, 0.3F, -0.625F, 1.5F, -1.2F, -0.125F, -2.25F, -1.2F, -0.125F, -2.35F, -1.175F, -0.725F, 1.5F, -1.075F, -0.625F); // Box 92
		defaultScopeModel[72].setRotationPoint(5.5F, -4F, 0.75F);

		defaultScopeModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.5F, -1.1F, -0.125F, -2.2F, -1.1F, -0.125F, -2.3F, -1.1F, -0.675F, 1.5F, -1.1F, -0.575F, 1.5F, 0.2F, -0.125F, -2.2F, 0.2F, -0.125F, -2.3F, 0.2F, -0.675F, 1.5F, 0.2F, -0.575F); // Box 92
		defaultScopeModel[73].setRotationPoint(5.5F, -5.5F, 0.75F);

		defaultScopeModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.5F, -1.1F, -0.575F, -2.3F, -1.1F, -0.675F, -2.2F, -1.1F, -0.125F, 1.5F, -1.1F, -0.125F, 1.5F, 0.2F, -0.575F, -2.3F, 0.2F, -0.675F, -2.2F, 0.2F, -0.125F, 1.5F, 0.2F, -0.125F); // Box 92
		defaultScopeModel[74].setRotationPoint(5.5F, -5.5F, 0F);

		defaultScopeModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-2.3F, -1.1F, -0.675F, 1.5F, -1.1F, -0.575F, 1.5F, -1.1F, -0.125F, -2.2F, -1.1F, -0.125F, -2.3F, 0.2F, -0.675F, 1.5F, 0.2F, -0.575F, 1.5F, 0.2F, -0.125F, -2.2F, 0.2F, -0.125F); // Box 92
		defaultScopeModel[75].setRotationPoint(1.5F, -5.5F, 0F);

		defaultScopeModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.5F, -1.05F, -0.725F, -2.4F, -1.05F, -0.775F, -2.35F, -1.05F, -0.125F, 1.5F, -1.05F, -0.125F, 1.5F, 0.1F, -0.675F, -2.375F, 0.1F, -0.75F, -2.3F, 0.1F, -0.125F, 1.5F, 0.1F, -0.125F); // Box 92
		defaultScopeModel[76].setRotationPoint(5.5F, -5.5F, 0F);

		defaultScopeModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-2.4F, -1.05F, -0.775F, 1.5F, -1.05F, -0.725F, 1.5F, -1.05F, -0.125F, -2.35F, -1.05F, -0.125F, -2.375F, 0.1F, -0.75F, 1.5F, 0.1F, -0.675F, 1.5F, 0.1F, -0.125F, -2.3F, 0.1F, -0.125F); // Box 92
		defaultScopeModel[77].setRotationPoint(1.5F, -5.5F, 0F);

		defaultScopeModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-2.35F, -1.05F, -0.125F, 1.5F, -1.05F, -0.125F, 1.5F, -1.05F, -0.725F, -2.4F, -1.05F, -0.775F, -2.3F, 0.1F, -0.125F, 1.5F, 0.1F, -0.125F, 1.5F, 0.1F, -0.675F, -2.375F, 0.1F, -0.75F); // Box 92
		defaultScopeModel[78].setRotationPoint(1.5F, -5.5F, 0.75F);

		defaultScopeModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.5F, -1.05F, -0.125F, -2.35F, -1.05F, -0.125F, -2.4F, -1.05F, -0.775F, 1.5F, -1.05F, -0.725F, 1.5F, 0.1F, -0.125F, -2.3F, 0.1F, -0.125F, -2.375F, 0.1F, -0.75F, 1.5F, 0.1F, -0.675F); // Box 92
		defaultScopeModel[79].setRotationPoint(5.5F, -5.5F, 0.75F);
	}
}