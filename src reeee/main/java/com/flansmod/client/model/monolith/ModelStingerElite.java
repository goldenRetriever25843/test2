//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 24.04.2016 - 13:42:44
// Last changed on: 24.04.2016 - 13:42:44

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelStingerElite extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelStingerElite() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[54];
		ammoModel = new ModelRendererTurbo[12];

		initgunModel_1();
		initammoModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		gunModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 4
		gunModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 5
		gunModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 6
		gunModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 7
		gunModel[5] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 9
		gunModel[6] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 10
		gunModel[7] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 11
		gunModel[8] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 12
		gunModel[9] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 13
		gunModel[10] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 15
		gunModel[11] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 16
		gunModel[12] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 18
		gunModel[13] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 20
		gunModel[14] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 22
		gunModel[15] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 24
		gunModel[16] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 25
		gunModel[17] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 26
		gunModel[18] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 27
		gunModel[19] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 28
		gunModel[20] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 29
		gunModel[21] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 30
		gunModel[22] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 31
		gunModel[23] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 32
		gunModel[24] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 33
		gunModel[25] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 34
		gunModel[26] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 35
		gunModel[27] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 36
		gunModel[28] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 37
		gunModel[29] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 38
		gunModel[30] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 39
		gunModel[31] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 40
		gunModel[32] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 41
		gunModel[33] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 43
		gunModel[34] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 44
		gunModel[35] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 45
		gunModel[36] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 46
		gunModel[37] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 48
		gunModel[38] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 49
		gunModel[39] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 50
		gunModel[40] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 51
		gunModel[41] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 53
		gunModel[42] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 54
		gunModel[43] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 55
		gunModel[44] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 56
		gunModel[45] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 57
		gunModel[46] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 58
		gunModel[47] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 59
		gunModel[48] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 61
		gunModel[49] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 62
		gunModel[50] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 63
		gunModel[51] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 64
		gunModel[52] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 65
		gunModel[53] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 66

		gunModel[0].addShapeBox(0F, 0F, 0F, 3, 2, 14, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		gunModel[0].setRotationPoint(-9F, 7F, 1.5F);
		gunModel[0].rotateAngleX = 1.06465084F;
		gunModel[0].rotateAngleY = -1.57079633F;

		gunModel[1].addShapeBox(0F, 0F, 0F, 3, 2, 13, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		gunModel[1].setRotationPoint(-2.85F, -4F, 1.5F);
		gunModel[1].rotateAngleX = -2.07694181F;
		gunModel[1].rotateAngleY = -1.57079633F;

		gunModel[2].addBox(0F, 0F, 0F, 2, 8, 5, 0F); // Box 5
		gunModel[2].setRotationPoint(5F, -7F, -2.5F);

		gunModel[3].addBox(0F, 0F, 0F, 10, 1, 5, 0F); // Box 6
		gunModel[3].setRotationPoint(-5F, 0F, -2.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 10, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		gunModel[4].setRotationPoint(-5F, -7F, -2.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 9
		gunModel[5].setRotationPoint(-4F, -3F, 2.5F);
		gunModel[5].rotateAngleX = 3.14159265F;

		gunModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 10
		gunModel[6].setRotationPoint(-4F, -1F, -2.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 11
		gunModel[7].setRotationPoint(-4F, -3F, -2.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 7, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 12
		gunModel[8].setRotationPoint(7F, -7F, -2.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 1F, 1F, 0F); // Box 13
		gunModel[9].setRotationPoint(-6F, -7F, -2.5F);

		gunModel[10].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 15
		gunModel[10].setRotationPoint(2F, -5F, -0.5F);
		gunModel[10].rotateAngleZ = -0.29670597F;

		gunModel[11].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 16
		gunModel[11].setRotationPoint(-10F, 5F, -2.5F);
		gunModel[11].rotateAngleZ = -0.52359878F;

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 18
		gunModel[12].setRotationPoint(-4F, 2F, -1F);
		gunModel[12].rotateAngleZ = -0.52359878F;

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 20
		gunModel[13].setRotationPoint(-6.15F, 6F, -1F);
		gunModel[13].rotateAngleZ = -0.52359878F;

		gunModel[14].addShapeBox(0F, 0F, 0F, 48, 4, 5, 0F,0F, 4F, -2F, 0F, 4F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 22
		gunModel[14].setRotationPoint(-23F, -15F, 0.5F);

		gunModel[15].addBox(0F, 0F, 0F, 48, 12, 5, 0F); // Box 24
		gunModel[15].setRotationPoint(-23F, -19F, -2.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 48, 4, 5, 0F,0F, 4F, -2F, 0F, 4F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 25
		gunModel[16].setRotationPoint(-23F, -11F, -0.5F);
		gunModel[16].rotateAngleX = -3.14159265F;

		gunModel[17].addBox(0F, 0F, 0F, 30, 11, 5, 0F); // Box 26
		gunModel[17].setRotationPoint(25F, -18F, -2.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 30, 3, 5, 0F,0F, 4F, -2F, 0F, 4F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 27
		gunModel[18].setRotationPoint(25F, -14F, 0.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 30, 3, 5, 0F,0F, 4F, -2F, 0F, 4F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 28
		gunModel[19].setRotationPoint(25F, -11F, -0.5F);
		gunModel[19].rotateAngleX = -3.14159265F;

		gunModel[20].addShapeBox(0F, 0F, 0F, 4, 12, 5, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		gunModel[20].setRotationPoint(-27F, -19F, -2.5F);

		gunModel[21].addBox(0F, 0F, 0F, 23, 11, 5, 0F); // Box 30
		gunModel[21].setRotationPoint(-50F, -18F, -2.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 27, 3, 5, 0F,0F, 4F, -2F, 0F, 4F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 31
		gunModel[22].setRotationPoint(-50F, -11F, -0.5F);
		gunModel[22].rotateAngleX = -3.14159265F;

		gunModel[23].addShapeBox(0F, 0F, 0F, 27, 3, 5, 0F,0F, 4F, -2F, 0F, 4F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 32
		gunModel[23].setRotationPoint(-50F, -14F, 0.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 12, 4, 5, 0F,0F, 4F, -2F, 0F, 4F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 33
		gunModel[24].setRotationPoint(-62F, -11F, -0.5F);
		gunModel[24].rotateAngleX = -3.14159265F;

		gunModel[25].addBox(0F, 0F, 0F, 12, 12, 5, 0F); // Box 34
		gunModel[25].setRotationPoint(-62F, -19F, -2.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 12, 4, 5, 0F,0F, 4F, -2F, 0F, 4F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 35
		gunModel[26].setRotationPoint(-62F, -15F, 0.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 10, 4, 5, 0F,0F, 8F, -2F, 0F, 4F, -2F, 0F, 1F, 0F, 0F, 1F, 4F, 0F, 8F, -2F, 0F, 4F, -2F, 0F, 1F, 0F, 0F, 1F, 4F); // Box 36
		gunModel[27].setRotationPoint(-72F, -15F, 0.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 10, 12, 5, 0F,0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 37
		gunModel[28].setRotationPoint(-72F, -19F, -2.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 10, 4, 5, 0F,0F, 8F, -2F, 0F, 4F, -2F, 0F, 1F, 0F, 0F, 1F, 4F, 0F, 8F, -2F, 0F, 4F, -2F, 0F, 1F, 0F, 0F, 1F, 4F); // Box 38
		gunModel[29].setRotationPoint(-72F, -11F, -0.5F);
		gunModel[29].rotateAngleX = 3.14159265F;

		gunModel[30].addShapeBox(0F, 0F, 0F, 3, 5, 6, 0F,0F, 4F, -2F, 0F, 4F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 39
		gunModel[30].setRotationPoint(55F, -15F, 0.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 3, 5, 6, 0F,0F, 4F, -2F, 0F, 4F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 40
		gunModel[31].setRotationPoint(55F, -10F, -0.5F);
		gunModel[31].rotateAngleX = -3.14159265F;

		gunModel[32].addBox(0F, 0F, 0F, 3, 13, 5, 0F); // Box 41
		gunModel[32].setRotationPoint(55F, -19F, -2.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		gunModel[33].setRotationPoint(38F, -21F, -2.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		gunModel[34].setRotationPoint(36F, -21F, -2.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		gunModel[35].setRotationPoint(43F, -20F, -2.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 17, 11, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 46
		gunModel[36].setRotationPoint(35F, -10F, -4.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, 4F, -2F, 0F, 4F, -2F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, 2F, -1F, 0F, 2F, -1F); // Box 48
		gunModel[37].setRotationPoint(26F, 1F, 2.5F);
		gunModel[37].rotateAngleZ = 1.57079633F;

		gunModel[38].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, 4F, -2F, 0F, 4F, -2F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, 2F, -1F, 0F, 2F, -1F); // Box 49
		gunModel[38].setRotationPoint(27F, 1F, -2.5F);
		gunModel[38].rotateAngleX = -3.14159265F;
		gunModel[38].rotateAngleZ = 1.57079633F;

		gunModel[39].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, 4F, -2F, 0F, 4F, -2F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, 2F, -1F, 0F, 2F, -1F); // Box 50
		gunModel[39].setRotationPoint(24F, 1F, -0.5F);
		gunModel[39].rotateAngleX = -3.14159265F;
		gunModel[39].rotateAngleY = -1.57079633F;
		gunModel[39].rotateAngleZ = 1.57079633F;

		gunModel[40].addBox(0F, 0F, 0F, 4, 11, 9, 0F); // Box 51
		gunModel[40].setRotationPoint(31F, -10F, -4.5F);

		gunModel[41].addBox(0F, 0F, 0F, 2, 11, 2, 0F); // Box 53
		gunModel[41].setRotationPoint(10F, -28F, 4F);
		gunModel[41].rotateAngleX = -0.54105207F;

		gunModel[42].addBox(0F, 0F, 0F, 38, 12, 3, 0F); // Box 54
		gunModel[42].setRotationPoint(-15F, -28F, 3.5F);
		gunModel[42].rotateAngleX = 1.04719755F;

		gunModel[43].addShapeBox(0F, 0F, 0F, 38, 4, 5, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 55
		gunModel[43].setRotationPoint(-15F, -23.95F, 10.5F);
		gunModel[43].rotateAngleX = 1.04719755F;

		gunModel[44].addShapeBox(0F, 0F, 0F, 38, 4, 5, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 56
		gunModel[44].setRotationPoint(-15F, -24.6F, 15.4F);
		gunModel[44].rotateAngleX = 4.1887902F;

		gunModel[45].addBox(0F, 0F, 0F, 2, 11, 2, 0F); // Box 57
		gunModel[45].setRotationPoint(-5F, -28F, 4F);
		gunModel[45].rotateAngleX = -0.54105207F;

		gunModel[46].addBox(0F, 0F, 0F, 13, 4, 5, 0F); // Box 58
		gunModel[46].setRotationPoint(-3F, -21F, -2.5F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 7, 4, 5, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		gunModel[47].setRotationPoint(-10F, -21F, -2.5F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 7, 4, 5, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		gunModel[48].setRotationPoint(10F, -21F, -2.5F);

		gunModel[49].addBox(0F, 0F, 0F, 9, 16, 9, 0F); // Box 62
		gunModel[49].setRotationPoint(22F, -8F, -4.5F);

		gunModel[50].addBox(0F, 0F, 0F, 1, 13, 1, 0F); // Box 63
		gunModel[50].setRotationPoint(-3F, -25F, 3F);
		gunModel[50].rotateAngleZ = 1.57079633F;

		gunModel[51].addBox(0F, 0F, 0F, 1, 13, 1, 0F); // Box 64
		gunModel[51].setRotationPoint(-3F, -22F, 1F);
		gunModel[51].rotateAngleZ = 1.57079633F;

		gunModel[52].addBox(0F, 0F, 0F, 1, 10, 1, 0F); // Box 65
		gunModel[52].setRotationPoint(-4.5F, -24F, 3F);
		gunModel[52].rotateAngleX = 1.36135682F;

		gunModel[53].addBox(0F, 0F, 0F, 1, 10, 1, 0F); // Box 66
		gunModel[53].setRotationPoint(10.5F, -24F, 3F);
		gunModel[53].rotateAngleX = 1.36135682F;
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 70
		ammoModel[1] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 71
		ammoModel[2] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 72
		ammoModel[3] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 73
		ammoModel[4] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 74
		ammoModel[5] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 75
		ammoModel[6] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 76
		ammoModel[7] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 62
		ammoModel[8] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 63
		ammoModel[9] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 64
		ammoModel[10] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 65
		ammoModel[11] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 66

		ammoModel[0].addShapeBox(-91F, 0F, 0F, 92, 6, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 70
		ammoModel[0].setRotationPoint(50F, -9F, 3F);
		ammoModel[0].rotateAngleX = -3.14159265F;

		ammoModel[1].addBox(0F, 0F, 0F, 2, 6, 2, 0F); // Box 71
		ammoModel[1].setRotationPoint(-47F, -13F, -1F);

		ammoModel[2].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 72
		ammoModel[2].setRotationPoint(-47F, -17F, -1F);

		ammoModel[3].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 73
		ammoModel[3].setRotationPoint(-47F, -13F, -1F);
		ammoModel[3].rotateAngleX = -1.55334303F;

		ammoModel[4].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 74
		ammoModel[4].setRotationPoint(-47F, -11F, 1F);
		ammoModel[4].rotateAngleX = 1.57079633F;

		ammoModel[5].addShapeBox(-9F, 0F, 0F, 4, 6, 3, 0F,0F, -1F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 1F, 0F); // Box 75
		ammoModel[5].setRotationPoint(60F, -9F, 3F);
		ammoModel[5].rotateAngleX = -3.14159265F;

		ammoModel[6].addShapeBox(-13F, 0F, 0F, 4, 6, 3, 0F,0F, -1F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 1F, 0F); // Box 76
		ammoModel[6].setRotationPoint(64F, -15F, -3F);

		ammoModel[7].addShapeBox(-91F, 0F, 0F, 92, 6, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 62
		ammoModel[7].setRotationPoint(50F, -15F, -3F);

		ammoModel[8].addShapeBox(-92F, 0F, 0F, 4, 6, 3, 0F,0F, -2F, -1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 63
		ammoModel[8].setRotationPoint(47F, -15F, -3F);

		ammoModel[9].addShapeBox(-92F, 0F, 0F, 4, 6, 3, 0F,0F, -2F, -1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 64
		ammoModel[9].setRotationPoint(47F, -9F, 3F);
		ammoModel[9].rotateAngleX = -3.14159265F;

		ammoModel[10].addShapeBox(-92F, 0F, 0F, 6, 4, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		ammoModel[10].setRotationPoint(39F, -14F, -2F);

		ammoModel[11].addShapeBox(-92F, 0F, 0F, 6, 4, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		ammoModel[11].setRotationPoint(39F, -10F, 2F);
		ammoModel[11].rotateAngleX = 3.14159265F;
		
		animationType = EnumAnimationType.END_LOADED;
	}
}