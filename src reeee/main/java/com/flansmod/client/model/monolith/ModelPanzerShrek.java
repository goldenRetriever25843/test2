//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 10.04.2016 - 15:46:36
// Last changed on: 10.04.2016 - 15:46:36

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPanzerShrek extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelPanzerShrek() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[58];
		ammoModel = new ModelRendererTurbo[14];

		initgunModel_1();
		initammoModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		gunModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 3
		gunModel[2] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 5
		gunModel[3] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Box 6
		gunModel[4] = new ModelRendererTurbo(this, 929, 9, textureX, textureY); // Box 7
		gunModel[5] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Box 8
		gunModel[6] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 10
		gunModel[7] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 19
		gunModel[8] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 20
		gunModel[9] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 21
		gunModel[10] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 22
		gunModel[11] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 23
		gunModel[12] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Box 24
		gunModel[13] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 25
		gunModel[14] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 26
		gunModel[15] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 27
		gunModel[16] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 28
		gunModel[17] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 29
		gunModel[18] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 30
		gunModel[19] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 31
		gunModel[20] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 32
		gunModel[21] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 35
		gunModel[22] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 43
		gunModel[23] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 44
		gunModel[24] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 48
		gunModel[25] = new ModelRendererTurbo(this, 649, 9, textureX, textureY); // Box 50
		gunModel[26] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 52
		gunModel[27] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 54
		gunModel[28] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Box 56
		gunModel[29] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 57
		gunModel[30] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 58
		gunModel[31] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 59
		gunModel[32] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 60
		gunModel[33] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 61
		gunModel[34] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 40
		gunModel[35] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 41
		gunModel[36] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 42
		gunModel[37] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 38
		gunModel[38] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 39
		gunModel[39] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 50
		gunModel[40] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 53
		gunModel[41] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 55
		gunModel[42] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 56
		gunModel[43] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 0
		gunModel[44] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 2
		gunModel[45] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 3
		gunModel[46] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 5
		gunModel[47] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 6
		gunModel[48] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 9
		gunModel[49] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 10
		gunModel[50] = new ModelRendererTurbo(this, 513, 17, textureX, textureY); // Box 18
		gunModel[51] = new ModelRendererTurbo(this, 521, 17, textureX, textureY); // Box 20
		gunModel[52] = new ModelRendererTurbo(this, 529, 17, textureX, textureY); // Box 21
		gunModel[53] = new ModelRendererTurbo(this, 545, 17, textureX, textureY); // Box 22
		gunModel[54] = new ModelRendererTurbo(this, 553, 17, textureX, textureY); // Box 23
		gunModel[55] = new ModelRendererTurbo(this, 561, 17, textureX, textureY); // Box 25
		gunModel[56] = new ModelRendererTurbo(this, 569, 17, textureX, textureY); // Box 26
		gunModel[57] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 61

		gunModel[0].addShapeBox(0F, 0F, 0F, 39, 4, 8, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		gunModel[0].setRotationPoint(62F, -26F, -2F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 129, 4, 8, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		gunModel[1].setRotationPoint(-68F, -26F, -2F);

		gunModel[2].addBox(0F, 0F, 0F, 129, 3, 8, 0F); // Box 5
		gunModel[2].setRotationPoint(-68F, -22F, -2F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 129, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 6
		gunModel[3].setRotationPoint(-68F, -19F, -2F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 39, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 7
		gunModel[4].setRotationPoint(62F, -19F, -2F);

		gunModel[5].addBox(0F, 0F, 0F, 39, 3, 3, 0F); // Box 8
		gunModel[5].setRotationPoint(62F, -22F, 3F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 7, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 1F, 0F); // Box 10
		gunModel[6].setRotationPoint(26F, -16F, 1F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 7, 5, 2, 0F,-1F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 19
		gunModel[7].setRotationPoint(27F, -1F, 1F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 20, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		gunModel[8].setRotationPoint(8F, -1F, 1F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 21
		gunModel[9].setRotationPoint(7F, -1F, 1F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 22
		gunModel[10].setRotationPoint(6F, -1F, 1F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		gunModel[11].setRotationPoint(1F, -1F, 1F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 24
		gunModel[12].setRotationPoint(-2F, -3F, 1F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 25
		gunModel[13].setRotationPoint(-6F, -4F, 1F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 3, 9, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		gunModel[14].setRotationPoint(-2F, -12F, 1F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 3, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 27
		gunModel[15].setRotationPoint(-5F, -12F, 1F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		gunModel[16].setRotationPoint(-1F, -16F, 1F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 29
		gunModel[17].setRotationPoint(4F, -16F, 1F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 8, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		gunModel[18].setRotationPoint(7F, -16F, 1F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 31
		gunModel[19].setRotationPoint(15F, -16F, 1F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 9, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 32
		gunModel[20].setRotationPoint(18F, -16F, 1F);

		gunModel[21].addBox(0F, 0F, 0F, 1, 21, 15, 0F); // Box 35
		gunModel[21].setRotationPoint(61F, -27F, -8F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 1F, 0F, 0F); // Box 43
		gunModel[22].setRotationPoint(61F, -6F, -8F);

		gunModel[23].addBox(0F, 0F, 0F, 1, 21, 6, 0F); // Box 44
		gunModel[23].setRotationPoint(61F, -27F, 7F);

		gunModel[24].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 48
		gunModel[24].setRotationPoint(61F, -32F, 12F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		gunModel[25].setRotationPoint(101F, -33F, 2F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 52
		gunModel[26].setRotationPoint(101F, -31F, 5F);

		gunModel[27].addBox(0F, 0F, 0F, 1, 4, 5, 0F); // Box 54
		gunModel[27].setRotationPoint(101F, -28F, 0F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		gunModel[28].setRotationPoint(101F, -31F, 0F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		gunModel[29].setRotationPoint(101F, -29F, -2F);

		gunModel[30].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 58
		gunModel[30].setRotationPoint(101F, -31F, 0F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 59
		gunModel[31].setRotationPoint(101F, -24F, -4F);

		gunModel[32].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 60
		gunModel[32].setRotationPoint(101F, -29F, 3F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 61
		gunModel[33].setRotationPoint(101F, -19F, -2F);

		gunModel[34].addBox(0F, 0F, 0F, 1, 5, 12, 0F); // Box 40
		gunModel[34].setRotationPoint(61F, -32F, -8F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 4, 12, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		gunModel[35].setRotationPoint(-73F, -28F, -4F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 1, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		gunModel[36].setRotationPoint(-73F, -24F, -4F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		gunModel[37].setRotationPoint(-73F, -19F, -1F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 8, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 39
		gunModel[38].setRotationPoint(7F, -12F, 1F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,4F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		gunModel[39].setRotationPoint(-69F, -26F, 1F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 1F, 0F); // Box 53
		gunModel[40].setRotationPoint(-69F, -17F, 1F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,4F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		gunModel[41].setRotationPoint(-69F, -21F, -2F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,4F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 56
		gunModel[42].setRotationPoint(-69F, -21F, 5F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[43].setRotationPoint(-5F, -16F, 1F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 1, 3, 21, 0F,2F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		gunModel[44].setRotationPoint(61F, -35F, -8F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		gunModel[45].setRotationPoint(-47F, -16F, 1F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 14, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[46].setRotationPoint(-33F, -16F, 1F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		gunModel[47].setRotationPoint(-33F, -15F, 1F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		gunModel[48].setRotationPoint(-19F, -16F, 1F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		gunModel[49].setRotationPoint(-12F, -16F, 1F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 2F, 0F, 0F); // Box 18
		gunModel[50].setRotationPoint(-33F, -13F, 1F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		gunModel[51].setRotationPoint(-35F, -5F, 1F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 21
		gunModel[52].setRotationPoint(-34F, -3F, 1F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 2F, 0F, 0F); // Box 22
		gunModel[53].setRotationPoint(-28F, -13F, 1F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		gunModel[54].setRotationPoint(-30F, -5F, 1F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		gunModel[55].setRotationPoint(-28F, -15F, 1F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,0F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 26
		gunModel[56].setRotationPoint(10F, -9F, 2F);

		gunModel[57].addBox(0F, 0F, 0F, 39, 3, 2, 0F); // Box 61
		gunModel[57].setRotationPoint(62F, -22F, -2F);
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 745, 17, textureX, textureY); // Box 130
		ammoModel[1] = new ModelRendererTurbo(this, 825, 17, textureX, textureY); // Box 131
		ammoModel[2] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 132
		ammoModel[3] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 133
		ammoModel[4] = new ModelRendererTurbo(this, 689, 25, textureX, textureY); // Box 134
		ammoModel[5] = new ModelRendererTurbo(this, 769, 25, textureX, textureY); // Box 135
		ammoModel[6] = new ModelRendererTurbo(this, 849, 25, textureX, textureY); // Box 136
		ammoModel[7] = new ModelRendererTurbo(this, 929, 25, textureX, textureY); // Box 137
		ammoModel[8] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 194
		ammoModel[9] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 195
		ammoModel[10] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 196
		ammoModel[11] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 197
		ammoModel[12] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 204
		ammoModel[13] = new ModelRendererTurbo(this, 269, 49, textureX, textureY); // Box 213

		ammoModel[0].addBox(0F, 0F, 0F, 10, 5, 2, 0F); // Box 130
		ammoModel[0].setRotationPoint(77F, -23.5F, 1F);

		ammoModel[1].addBox(0F, 0F, 0F, 10, 1, 2, 0F); // Box 131
		ammoModel[1].setRotationPoint(77F, -18.5F, 1F);

		ammoModel[2].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 132
		ammoModel[2].setRotationPoint(77F, -21.5F, 4F);

		ammoModel[3].addBox(0F, 0F, 0F, 10, 2, 6, 0F); // Box 133
		ammoModel[3].setRotationPoint(77F, -21.5F, -1F);

		ammoModel[4].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 134
		ammoModel[4].setRotationPoint(77F, -23.5F, -1F);

		ammoModel[5].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 135
		ammoModel[5].setRotationPoint(77F, -23.5F, 3F);

		ammoModel[6].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 136
		ammoModel[6].setRotationPoint(77F, -20.5F, 3F);

		ammoModel[7].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		ammoModel[7].setRotationPoint(77F, -20.5F, -1F);

		ammoModel[8].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		ammoModel[8].setRotationPoint(85F, -22.5F, 1F);

		ammoModel[9].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 195
		ammoModel[9].setRotationPoint(85F, -19.5F, 1F);

		ammoModel[10].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 196
		ammoModel[10].setRotationPoint(85F, -21.5F, 3F);

		ammoModel[11].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		ammoModel[11].setRotationPoint(85F, -21.5F, 0F);

		ammoModel[12].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // Box 204
		ammoModel[12].setRotationPoint(93F, -21.5F, 1F);

		ammoModel[13].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, 1F, 0F, 10F, 1F, 0F, 10F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F); // Box 213
		ammoModel[13].setRotationPoint(58F, -20.5F, 1F);
		
		animationType = EnumAnimationType.END_LOADED;
		translateAll(-30F, 2F, -8F);
		
		
	}
}