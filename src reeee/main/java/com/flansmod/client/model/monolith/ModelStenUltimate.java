//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: -
// Last changed on: -

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelStenUltimate extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelStenUltimate() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[55];
		ammoModel = new ModelRendererTurbo[2];
		slideModel = new ModelRendererTurbo[1];

		initgunModel_1();
		initammoModel_1();
		initslideModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 0
		gunModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 1
		gunModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 2
		gunModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 3
		gunModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 4
		gunModel[6] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 5
		gunModel[7] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 6
		gunModel[8] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 7
		gunModel[9] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 9
		gunModel[10] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 10
		gunModel[11] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 11
		gunModel[12] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 12
		gunModel[13] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 13
		gunModel[14] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 14
		gunModel[15] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 15
		gunModel[16] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 16
		gunModel[17] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 17
		gunModel[18] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 19
		gunModel[19] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 20
		gunModel[20] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 22
		gunModel[21] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 23
		gunModel[22] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 24
		gunModel[23] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 25
		gunModel[24] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 26
		gunModel[25] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 27
		gunModel[26] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 29
		gunModel[27] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 30
		gunModel[28] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 31
		gunModel[29] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 32
		gunModel[30] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 33
		gunModel[31] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 34
		gunModel[32] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 35
		gunModel[33] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 36
		gunModel[34] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 37
		gunModel[35] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 38
		gunModel[36] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 39
		gunModel[37] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 40
		gunModel[38] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 42
		gunModel[39] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 43
		gunModel[40] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 45
		gunModel[41] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 46
		gunModel[42] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 48
		gunModel[43] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 49
		gunModel[44] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 50
		gunModel[45] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 51
		gunModel[46] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 52
		gunModel[47] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 53
		gunModel[48] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 54
		gunModel[49] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 56
		gunModel[50] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 57
		gunModel[51] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 58
		gunModel[52] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 60
		gunModel[53] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 61
		gunModel[54] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 62

		gunModel[0].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0.35F, -0.15F, 0.1F, 0.35F, -0.15F, 0.1F, 0.35F, -0.15F, 0F, 0.35F, -0.15F, 0F, 0F, -0.15F, 0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F, 0F, 0F, -0.15F); // Box 0
		gunModel[0].setRotationPoint(-0.1F, -2F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.1F, 0.35F, -0.05F, 0.1F, 0.35F, -0.05F, 0.1F, 0.35F, -0.05F, -0.1F, 0.35F, -0.05F, -0.1F, 0F, -0.05F, -2.65F, 0F, -0.05F, -2.65F, 0F, -0.05F, -0.1F, 0F, -0.05F); // Box 0
		gunModel[1].setRotationPoint(4.9F, -2F, -0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.15F, 0.35F, -0.05F, 0.1F, 0.35F, -0.05F, 0.1F, 0.35F, -0.05F, -0.15F, 0.35F, -0.05F, -0.15F, 0F, -0.05F, 0.1F, 0F, -0.05F, 0.1F, 0F, -0.05F, -0.15F, 0F, -0.05F); // Box 1
		gunModel[2].setRotationPoint(3.9F, -2F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.35F, 0F, -0.05F, 0.45F, 0F, -0.05F, 0.45F, 0F, -0.05F, 0.35F, 0F, -0.05F, -0.15F, -0.5F, -0.05F, -0.7F, -0.5F, -0.05F, -0.7F, -0.5F, -0.05F, -0.15F, -0.5F, -0.05F); // Box 2
		gunModel[3].setRotationPoint(2.8F, -1F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, -0.25F, -0.05F, 0.1F, -0.25F, -0.05F, 0.1F, -0.25F, -0.05F, 0.2F, -0.25F, -0.05F, 0.2F, -0.2F, -0.05F, 0.1F, -0.2F, -0.05F, 0.1F, -0.2F, -0.05F, 0.2F, -0.2F, -0.05F); // Box 3
		gunModel[4].setRotationPoint(2.95F, -1.8F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.4F, -0.05F, -0.35F, -0.25F, -0.05F, -0.35F, -0.25F, -0.05F, -0.35F, -0.4F, -0.05F, -0.35F, -0.2F, -0.05F, -0.35F, -0.2F, -0.05F, -0.35F, -0.2F, -0.05F, -0.35F, -0.2F, -0.05F); // Box 4
		gunModel[5].setRotationPoint(2.1F, -1.8F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -0.2F, 0.3F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.3F, 0F, -0.2F, 0.3F); // Box 5
		gunModel[6].setRotationPoint(0.7F, -3.65F, -0.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -0.3F, 0.3F, 0.1F, -0.3F, 0.3F, 0.1F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.2F, -0.15F, 0.1F, -0.2F, -0.15F, 0.1F, -0.2F, -0.15F, 0F, -0.2F, -0.15F); // Box 6
		gunModel[7].setRotationPoint(0.7F, -3.15F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.3F, 0.3F, 0.1F, -0.3F, 0.3F, 0.1F, -0.3F, 0.3F, 0F, -0.3F, 0.3F); // Box 7
		gunModel[8].setRotationPoint(0.7F, -4.15F, -0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.3F, 0.4F, 0.1F, -0.3F, 0.4F, 0.1F, -0.3F, 0.4F, 0F, -0.3F, 0.4F); // Box 9
		gunModel[9].setRotationPoint(8.8F, -4.15F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.3F, 0.4F, 0.1F, -0.3F, 0.4F, 0.1F, -0.3F, 0.4F, 0F, -0.3F, 0.4F, 0F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0F, -0.1F, -0.2F); // Box 10
		gunModel[10].setRotationPoint(8.8F, -3.15F, -0.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.3F, 0.4F, 0.1F, -0.3F, 0.4F, 0.1F, -0.3F, 0.4F, 0F, -0.3F, 0.4F); // Box 11
		gunModel[11].setRotationPoint(8.8F, -3.55F, -0.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.1F, 0.4F, -0.2F, -0.1F, 0.4F, -0.2F, -0.1F, 0.4F, 0.3F, -0.1F, 0.4F, 0.3F, -0.3F, 0.4F, -0.2F, -0.3F, 0.4F, -0.2F, -0.3F, 0.4F, 0.3F, -0.3F, 0.4F); // Box 12
		gunModel[12].setRotationPoint(0F, -3.55F, -0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, 0.3F, -0.1F, -0.2F, 0.3F, -0.3F, 0.4F, -0.2F, -0.3F, 0.4F, -0.2F, -0.3F, 0.4F, 0.3F, -0.3F, 0.4F); // Box 13
		gunModel[13].setRotationPoint(0F, -4.15F, -0.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.3F, 0.4F, -0.2F, -0.3F, 0.4F, -0.2F, -0.3F, 0.4F, 0.3F, -0.3F, 0.4F, 0.3F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, 0.3F, -0.1F, -0.2F); // Box 14
		gunModel[14].setRotationPoint(0F, -3.15F, -0.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.15F, -0.27F, 0F, -0.15F, -0.27F, 0F, -0.15F, -0.27F, 0F, -0.15F, -0.27F, 0F, -0.3F, 0.33F, 0F, -0.3F, 0.33F, 0F, -0.3F, 0.33F, 0F, -0.3F, 0.33F); // Box 15
		gunModel[15].setRotationPoint(12.8F, -4.15F, -0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.1F, 0.33F, 0F, -0.1F, 0.33F, 0F, -0.1F, 0.33F, 0F, -0.1F, 0.33F, 0F, -0.3F, 0.33F, 0F, -0.3F, 0.33F, 0F, -0.3F, 0.33F, 0F, -0.3F, 0.33F); // Box 16
		gunModel[16].setRotationPoint(12.8F, -3.55F, -0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.3F, 0.33F, 0F, -0.3F, 0.33F, 0F, -0.3F, 0.33F, 0F, -0.3F, 0.33F, 0F, -0.1F, -0.27F, 0F, -0.1F, -0.27F, 0F, -0.1F, -0.27F, 0F, -0.1F, -0.27F); // Box 17
		gunModel[17].setRotationPoint(12.8F, -3.15F, -0.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.3F, 0.5F, -0.35F, -0.3F, 0.5F, -0.35F, -0.3F, 0.5F, -0.35F, -0.3F, 0.5F, -0.35F, -0.05F, -0.1F, -0.35F, -0.05F, -0.1F, -0.35F, -0.05F, -0.1F, -0.35F, -0.05F, -0.1F); // Box 19
		gunModel[18].setRotationPoint(-0.5F, -3.15F, -0.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.05F, -0.7F, -0.35F, -0.05F, -0.7F, -0.35F, -0.05F, -0.1F, 0F, -0.05F, -0.1F, 0F, -0.3F, -1.3F, -0.35F, -0.3F, -1.3F, -0.35F, -0.3F, 0.5F, 0F, -0.3F, 0.5F); // Box 20
		gunModel[19].setRotationPoint(-0.5F, -4.15F, -0.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, -1.3F, -0.35F, -0.3F, -1.3F, -0.35F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.05F, -0.7F, -0.35F, -0.05F, -0.7F, -0.35F, -0.05F, -0.1F, 0F, -0.05F, -0.1F); // Box 22
		gunModel[20].setRotationPoint(-0.5F, -4.4F, -1.7F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.35F, 0.5F, -0.35F, -0.35F, 0.5F, -0.35F, -0.35F, 0.5F, -0.35F, -0.35F, 0.5F, -0.35F, -0.05F, 0.5F, -0.35F, -0.05F, 0.5F, -0.35F, -0.05F, 0.5F, -0.35F, -0.05F, 0.5F); // Box 23
		gunModel[21].setRotationPoint(-0.5F, -3.8F, -0.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.1F, -0.2F, -0.15F, -0.1F, -0.2F, -0.15F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.75F, -0.2F, -0.15F, -0.75F, -0.2F, -0.15F, -0.75F, -0.2F, -0.2F, -0.75F, -0.2F); // Box 24
		gunModel[22].setRotationPoint(-0.7F, -4.2F, -0.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0.35F, -0.14F, -0.4F, 0.35F, -0.14F, -0.4F, 0.35F, -0.14F, -0.4F, 0.35F, -0.14F, -0.4F, 0F, -0.14F, -0.4F, 0F, -0.14F, -0.4F, 0F, -0.14F, -0.4F, 0F, -0.14F); // Box 25
		gunModel[23].setRotationPoint(-0.7F, -2F, -0.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,-0.4F, -3.5F, -0.14F, -0.4F, -0.1F, -0.14F, -0.4F, -0.1F, -0.14F, -0.4F, -3.5F, -0.14F, -0.4F, 3.25F, -0.14F, -0.4F, -0.15F, -0.14F, -0.4F, -0.15F, -0.14F, -0.4F, 3.25F, -0.14F); // Box 26
		gunModel[24].setRotationPoint(-11.9F, -2.7F, -0.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.4F, -1.5F, -0.25F, -0.4F, -0.8F, -0.25F, -0.4F, -0.8F, -0.25F, -0.4F, -1.5F, -0.25F, -2.3F, 0.95F, -0.25F, -0.4F, 0.7F, -0.25F, -0.4F, 0.7F, -0.25F, -2.3F, 0.95F, -0.25F); // Box 27
		gunModel[25].setRotationPoint(-2.9F, -2.7F, -0.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.4F, -1F, -0.25F, -1.8F, -0.8F, -0.25F, -1.8F, -0.8F, -0.25F, -0.4F, -1F, -0.25F, -1.9F, 1.5F, -0.25F, -1.2F, 0.7F, -0.25F, -1.2F, 0.7F, -0.25F, -1.9F, 1.5F, -0.25F); // Box 29
		gunModel[26].setRotationPoint(-3.9F, -1.9F, -0.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.05F, -1F, -0.25F, -0.8F, -0.95F, -0.25F, -0.8F, -0.95F, -0.25F, 0.05F, -1F, -0.25F, -0.3F, 0.55F, -0.25F, -0.3F, 0.05F, -0.25F, -0.3F, 0.05F, -0.25F, -0.3F, 0.55F, -0.25F); // Box 30
		gunModel[27].setRotationPoint(-2.75F, -2.15F, -0.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1.8F, -1F, -0.25F, -0.55F, -1.1F, -0.25F, -0.55F, -1.1F, -0.25F, -1.8F, -1F, -0.25F, -1.2F, 0.7F, -0.25F, -1.7F, 1.5F, -0.25F, -1.7F, 1.5F, -0.25F, -1.2F, 0.7F, -0.25F); // Box 31
		gunModel[28].setRotationPoint(-3F, -1.9F, -0.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.05F, -1F, -0.25F, -0.8F, -0.95F, -0.25F, -0.8F, -0.95F, -0.25F, 0.05F, -1F, -0.25F, -0.25F, 0.6F, -0.25F, -0.3F, 0.05F, -0.25F, -0.3F, 0.05F, -0.25F, -0.25F, 0.6F, -0.25F); // Box 32
		gunModel[29].setRotationPoint(-1.8F, -2.2F, -0.5F);
		gunModel[29].rotateAngleZ = 0.08726646F;

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.05F, -1.05F, -0.25F, -0.4F, -1.15F, -0.25F, -0.4F, -1.15F, -0.25F, 0.05F, -1.05F, -0.25F, -0.2F, 1.05F, -0.25F, -0.5F, 1.05F, -0.25F, -0.5F, 1.05F, -0.25F, -0.2F, 1.05F, -0.25F); // Box 33
		gunModel[30].setRotationPoint(-2.4F, -1.4F, -0.5F);
		gunModel[30].rotateAngleZ = 0.10471976F;

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.05F, -1F, -0.25F, -0.8F, -0.95F, -0.25F, -0.8F, -0.95F, -0.25F, 0.05F, -1F, -0.25F, -0.3F, 0.55F, -0.25F, -0.3F, 0.05F, -0.25F, -0.3F, 0.05F, -0.25F, -0.3F, 0.55F, -0.25F); // Box 34
		gunModel[31].setRotationPoint(-1.75F, -2.45F, -0.5F);
		gunModel[31].rotateAngleZ = -0.54105207F;

		gunModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.43F, 0.35F, -0.25F, -0.43F, 0.35F, -0.25F, -0.43F, 0.35F, -0.25F, -0.43F, 0.35F, -0.25F, -0.43F, 0F, -0.25F, -0.43F, 0F, -0.25F, -0.43F, 0F, -0.25F, -0.43F, 0F, -0.25F); // Box 35
		gunModel[32].setRotationPoint(1.75F, -0.7F, -0.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.43F, 0.35F, -0.25F, -0.43F, 0.35F, -0.25F, -0.43F, 0.35F, -0.25F, -0.43F, 0.35F, -0.25F, -0.43F, 0F, -0.25F, -0.43F, 0F, -0.25F, -0.43F, 0F, -0.25F, -0.43F, 0F, -0.25F); // Box 36
		gunModel[33].setRotationPoint(-0.1F, -0.7F, -0.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.01F, -0.43F, -0.25F, 0.01F, -0.43F, -0.25F, 0.01F, -0.43F, -0.25F, 0.01F, -0.43F, -0.25F, -0.2F, -0.43F, -0.25F, -0.2F, -0.43F, -0.25F, -0.2F, -0.43F, -0.25F, -0.2F, -0.43F, -0.25F); // Box 37
		gunModel[34].setRotationPoint(0.32F, -0.14F, -0.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.43F, 0.35F, -0.25F, -0.1F, 0.35F, -0.25F, -0.1F, 0.35F, -0.25F, -0.43F, 0.35F, -0.25F, -0.43F, 0F, -0.25F, -0.43F, 0F, -0.25F, -0.43F, 0F, -0.25F, -0.43F, 0F, -0.25F); // Box 38
		gunModel[35].setRotationPoint(0.2F, -0.9F, -0.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0.4F, 0.2F, -0.6F, 0.2F, 0.2F, -0.6F, 0.2F, 0.2F, 0F, 0.4F, 0.2F, -0.6F, 0.4F, 0.2F, -0.05F, 0.1F, 0.2F, -0.05F, 0.1F, 0.2F, -0.6F, 0.4F, 0.2F); // Box 39
		gunModel[36].setRotationPoint(-12.1F, -0.7F, -0.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F); // Box 40
		gunModel[37].setRotationPoint(2.95F, -2.5F, -0.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.1F, 0.05F, 0.4F, -0.1F, 0.05F, 0.4F, -0.1F, 0.05F, 0.4F, -0.1F, 0.05F, 0.4F, -0.1F, 0.2F, 0.4F, -0.1F, 0.2F, 0.4F, -0.1F, 0.2F, 0.4F, -0.1F, 0.2F, 0.4F); // Box 42
		gunModel[38].setRotationPoint(9.3F, -3.65F, 0.5F);

		gunModel[39].addShapeBox(1F, 0F, 0F, 2, 1, 2, 0F,-0.1F, -0.15F, 0.4F, -0.1F, -0.15F, 0.4F, -0.1F, -0.15F, 0.4F, -0.1F, -0.15F, 0.4F, -0.1F, -0.15F, 0.4F, -0.1F, -0.15F, 0.4F, -0.1F, -0.15F, 0.4F, -0.1F, -0.15F, 0.4F); // Box 43
		gunModel[39].setRotationPoint(8.15F, -3.6F, 0.45F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0.05F, -0.2F, -0.4F, 0.05F, -0.2F, -0.4F, 0.05F, -0.2F, -0.4F, 0.05F, -0.2F, -0.4F, 0.05F, -0.2F, -0.4F, 0.05F, -0.2F, -0.4F, 0.05F, -0.2F, -0.4F, 0.05F, -0.2F); // Box 45
		gunModel[40].setRotationPoint(9F, -4.1F, 0.5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F); // Box 46
		gunModel[41].setRotationPoint(9.3F, -4.55F, 0.5F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F); // Box 48
		gunModel[42].setRotationPoint(15.4F, -3.65F, -0.5F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F); // Box 49
		gunModel[43].setRotationPoint(15.4F, -3.95F, -0.5F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F); // Box 50
		gunModel[44].setRotationPoint(15.4F, -3.35F, -0.5F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.3F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 51
		gunModel[45].setRotationPoint(8.8F, -3.55F, -0.95F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 52
		gunModel[46].setRotationPoint(8.8F, -3.15F, -0.95F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.3F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 53
		gunModel[47].setRotationPoint(8.8F, -4.15F, -0.95F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.3F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 54
		gunModel[48].setRotationPoint(1.4F, -4.15F, -0.94F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.43F, -0.1F, -0.3F, -0.43F, -0.1F, -0.3F, -0.43F, -0.1F, -0.3F, -0.43F, -0.1F, -0.3F, -0.43F, -0.1F, -0.15F, -0.43F, -0.1F, -0.15F, -0.43F, -0.1F, -0.15F, -0.43F, -0.1F, -0.15F); // Box 56
		gunModel[49].setRotationPoint(-0.44F, -4.4F, -0.5F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.43F, -0.3F, -0.47F, -0.43F, -0.3F, -0.47F, -0.43F, -0.3F, -0.43F, -0.43F, -0.3F, -0.43F, -0.43F, -0.3F, -0.47F, -0.43F, -0.3F, -0.47F, -0.43F, -0.3F, -0.43F, -0.43F, -0.3F, -0.43F); // Box 57
		gunModel[50].setRotationPoint(-0.44F, -4.8F, -0.38F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.43F, -0.3F, -0.43F, -0.43F, -0.3F, -0.43F, -0.43F, -0.3F, -0.47F, -0.43F, -0.3F, -0.47F, -0.43F, -0.3F, -0.43F, -0.43F, -0.3F, -0.43F, -0.43F, -0.3F, -0.47F, -0.43F, -0.3F, -0.47F); // Box 58
		gunModel[51].setRotationPoint(-0.44F, -4.8F, -0.63F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.43F, -0.45F, -0.4F, -0.43F, -0.45F, -0.4F, -0.43F, -0.45F, -0.4F, -0.43F, -0.45F, -0.4F, -0.43F, -0.45F, -0.3F, -0.43F, -0.45F, -0.3F, -0.43F, -0.45F, -0.3F, -0.43F, -0.45F, -0.3F); // Box 60
		gunModel[52].setRotationPoint(-0.44F, -5.05F, -0.5F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.1F, -0.4F, -0.35F, -0.1F, -0.4F, -0.35F, -0.1F, -0.4F, -0.35F, -0.1F, -0.4F, -0.35F, -0.1F, -0.4F, -0.35F, -0.1F, -0.4F, -0.35F, -0.1F, -0.4F, -0.35F, -0.1F); // Box 61
		gunModel[53].setRotationPoint(11.75F, -4.4F, -0.5F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F); // Box 62
		gunModel[54].setRotationPoint(11.75F, -4.75F, -0.5F);
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 44
		ammoModel[1] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 47

		ammoModel[0].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-0.2F, -0.05F, 0.3F, -0.2F, -0.05F, 0.3F, -0.2F, -0.05F, 0.3F, -0.2F, -0.05F, 0.3F, -0.2F, 0.15F, 0.3F, -0.2F, 0.15F, 0.3F, -0.2F, 0.15F, 0.3F, -0.2F, 0.15F, 0.3F); // Box 44
		ammoModel[0].setRotationPoint(9.3F, -3.68F, 2.5F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.2F, -0.05F, -0.4F, -0.1F, -0.05F, -0.4F, -0.1F, -0.05F, -0.4F, -0.2F, -0.05F, -0.4F, -0.2F, 0.15F, -0.4F, -0.1F, 0.15F, -0.4F, -0.1F, 0.15F, -0.4F, -0.2F, 0.15F, -0.4F); // Box 47
		ammoModel[1].setRotationPoint(9.3F, -3.68F, 9.4F);
	}

	private void initslideModel_1()
	{
		slideModel[0] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 55

		slideModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.12F, -0.3F, -0.4F, -0.12F, -0.3F, -0.4F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.65F, -0.1F, -0.4F, -0.65F, -0.1F, -0.4F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 55
		slideModel[0].setRotationPoint(6.4F, -4.12F, -1.6F);
		
		gunSlideDistance = 1F;
		animationType = EnumAnimationType.SIDE_CLIP;

		translateAll(0F, -2F, 0F);
		
		
	}
}