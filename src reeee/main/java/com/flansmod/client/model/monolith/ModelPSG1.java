//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 24.07.2016 - 15:17:48
// Last changed on: 24.07.2016 - 15:17:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPSG1 extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPSG1() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[49];
		ammoModel = new ModelRendererTurbo[1];

		initgunModel_1();
		initammoModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 2
		gunModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 3
		gunModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 4
		gunModel[4] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 5
		gunModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 6
		gunModel[6] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 7
		gunModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 8
		gunModel[8] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 9
		gunModel[9] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 10
		gunModel[10] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 11
		gunModel[11] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 12
		gunModel[12] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 14
		gunModel[13] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 15
		gunModel[14] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 16
		gunModel[15] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 17
		gunModel[16] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 18
		gunModel[17] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 19
		gunModel[18] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 20
		gunModel[19] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 21
		gunModel[20] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 22
		gunModel[21] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 23
		gunModel[22] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 24
		gunModel[23] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 25
		gunModel[24] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 26
		gunModel[25] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 27
		gunModel[26] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 28
		gunModel[27] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 30
		gunModel[28] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 31
		gunModel[29] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 32
		gunModel[30] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 40
		gunModel[31] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 41
		gunModel[32] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 42
		gunModel[33] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 43
		gunModel[34] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 44
		gunModel[35] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 45
		gunModel[36] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 48
		gunModel[37] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 49
		gunModel[38] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 50
		gunModel[39] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 51
		gunModel[40] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 53
		gunModel[41] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 54
		gunModel[42] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 55
		gunModel[43] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 56
		gunModel[44] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 57
		gunModel[45] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 58
		gunModel[46] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 60
		gunModel[47] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 63
		gunModel[48] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 0

		gunModel[0].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[0].setRotationPoint(-1F, -4.5F, 0F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		gunModel[1].setRotationPoint(-2F, -4F, 0F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		gunModel[2].setRotationPoint(-2F, -4.5F, 0F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 4
		gunModel[3].setRotationPoint(1F, -3F, 0F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F); // Box 5
		gunModel[4].setRotationPoint(4F, -3F, 0F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 6
		gunModel[5].setRotationPoint(6F, -4F, 0F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 7
		gunModel[6].setRotationPoint(6.5F, -4.25F, 0F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 8
		gunModel[7].setRotationPoint(6.5F, -3.5F, 0F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 9
		gunModel[8].setRotationPoint(6.5F, -5F, 0F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.25F, -0.65F, -1F, -0.25F, -0.65F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 10
		gunModel[9].setRotationPoint(15F, -5F, 0F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 11
		gunModel[10].setRotationPoint(15F, -4.25F, 0F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, 0F, -0.3F, -0.75F, 0F, -0.3F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 12
		gunModel[11].setRotationPoint(15F, -3.5F, 0F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 14
		gunModel[12].setRotationPoint(15F, -3.5F, 0F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		gunModel[13].setRotationPoint(-2F, -3F, 0F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 16
		gunModel[14].setRotationPoint(-7F, -3.5F, 0F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 17
		gunModel[15].setRotationPoint(-7F, -2.5F, 0F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, -1F, -0.5F, -0.1F, -1F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 18
		gunModel[16].setRotationPoint(-7F, -2F, 0F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, -1F, -0.5F, -0.1F, -1F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 19
		gunModel[17].setRotationPoint(-7F, -1.5F, 0F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.75F, -0.1F, -0.25F, -0.75F, -0.1F, -0.25F, -0.75F, -0.1F, 0F, -0.75F, -0.1F); // Box 20
		gunModel[18].setRotationPoint(-7F, -1F, 0F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.75F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.75F, 0F, -0.1F, -0.75F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, -0.75F, -0.25F, -0.1F); // Box 21
		gunModel[19].setRotationPoint(-8F, -3.5F, 0F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.9F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.9F, 0F, -0.1F, -1.25F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, -1.25F, -0.25F, -0.1F); // Box 22
		gunModel[20].setRotationPoint(-9.25F, -3.5F, 0F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1.25F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, -1.25F, -0.25F, -0.1F, -0.9F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.9F, 0F, -0.1F); // Box 23
		gunModel[21].setRotationPoint(-9.25F, -1.75F, 0F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, -0.25F, -0.4F, -0.1F, -0.25F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F); // Box 24
		gunModel[22].setRotationPoint(-8.25F, -2.15F, 0F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 25
		gunModel[23].setRotationPoint(0F, -3F, 0F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1.75F, 0.25F, 0F, -1.75F, 0.25F, 0F, 2F, 0F, 0F); // Box 26
		gunModel[24].setRotationPoint(1F, -3F, 0F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0.1F, -0.45F, -0.25F, 0.1F, -0.45F, -0.25F, 0F, -0.45F, -0.25F); // Box 27
		gunModel[25].setRotationPoint(1F, -1F, 0F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.15F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, -0.15F, -0.45F, -0.25F); // Box 28
		gunModel[26].setRotationPoint(2.5F, -0.5F, 0F);
		gunModel[26].rotateAngleZ = 1.18682389F;

		gunModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F); // Box 30
		gunModel[27].setRotationPoint(-0.75F, -0.5F, 0F);
		gunModel[27].rotateAngleZ = -0.36651914F;

		gunModel[28].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.15F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F); // Box 31
		gunModel[28].setRotationPoint(2.5F, -3F, 0F);
		gunModel[28].rotateAngleZ = -1.43116999F;

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, -0.5F, -0.45F, -0.25F, -0.5F, -0.45F, -0.25F, 0F, -0.75F, -0.25F); // Box 32
		gunModel[29].setRotationPoint(2F, -1F, 0F);
		gunModel[29].rotateAngleZ = 0.17453293F;

		gunModel[30].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 40
		gunModel[30].setRotationPoint(1F, -5F, 0F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.1F, 0.5F, -0.5F, -0.1F, 0.5F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 41
		gunModel[31].setRotationPoint(1.5F, -5.5F, 0F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, -0.1F, 0.5F, -0.5F, -0.1F, 0.5F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 42
		gunModel[32].setRotationPoint(0.75F, -6F, 0F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, -0.25F, 0.5F, -0.75F, -0.25F, 0.5F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 43
		gunModel[33].setRotationPoint(0.75F, -6.5F, 0F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.75F, -0.25F, 0.5F, -0.75F, -0.25F, 0.5F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 44
		gunModel[34].setRotationPoint(0.75F, -5F, 0F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.65F, -0.15F, 0.5F, -0.65F, -0.15F, 0.5F, -0.65F, -0.15F, 0F, -0.65F, -0.15F, 0F, 0F, 0.02F, 0.5F, 0F, 0.02F, 0.5F, 0F, 0.02F, 0F, 0F, 0.02F); // Box 45
		gunModel[35].setRotationPoint(5.75F, -6.5F, 0F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.02F, 0.5F, 0F, 0.02F, 0.5F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, -0.65F, -0.15F, 0.5F, -0.65F, -0.15F, 0.5F, -0.65F, -0.15F, 0F, -0.65F, -0.15F); // Box 48
		gunModel[36].setRotationPoint(5.75F, -5F, 0F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.02F, 0.5F, 0F, 0.02F, 0.5F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, -0.5F, 0.02F, 0.5F, -0.5F, 0.02F, 0.5F, -0.5F, 0.02F, 0F, -0.5F, 0.02F); // Box 49
		gunModel[37].setRotationPoint(5.75F, -5.5F, 0F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, -0.25F, 0.5F, -0.65F, -0.15F, 0.5F, -0.65F, -0.15F, 0F, -0.75F, -0.25F, 0F, 0F, -0.1F, 0.5F, 0F, 0.02F, 0.5F, 0F, 0.02F, 0F, 0F, -0.1F); // Box 50
		gunModel[38].setRotationPoint(4.25F, -6.5F, 0F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.1F, 0.5F, 0F, 0.02F, 0.5F, 0F, 0.02F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0.5F, -0.5F, 0.02F, 0.5F, -0.5F, 0.02F, 0F, -0.5F, -0.1F); // Box 51
		gunModel[39].setRotationPoint(4.25F, -5.5F, 0F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.1F, 0.5F, 0F, 0.02F, 0.5F, 0F, 0.02F, 0F, 0F, -0.1F, 0F, -0.75F, -0.25F, 0.5F, -0.65F, -0.15F, 0.5F, -0.65F, -0.15F, 0F, -0.75F, -0.25F); // Box 53
		gunModel[40].setRotationPoint(4.25F, -5F, 0F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, -0.1F, 0.5F, -0.5F, -0.1F, 0.5F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 54
		gunModel[41].setRotationPoint(-2.25F, -6F, 0F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, -0.25F, 0.5F, -0.75F, -0.25F, 0.5F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 55
		gunModel[42].setRotationPoint(-2.25F, -6.5F, 0F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.75F, -0.25F, 0.5F, -0.75F, -0.25F, 0.5F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 56
		gunModel[43].setRotationPoint(-2.25F, -5F, 0F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.25F, 0.5F, -0.4F, -0.25F, 0.5F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 57
		gunModel[44].setRotationPoint(-0.25F, -5.95F, 0F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0F, 0.5F, -0.25F); // Box 58
		gunModel[45].setRotationPoint(15F, -3.5F, 0F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0F, 0.5F, -0.25F); // Box 60
		gunModel[46].setRotationPoint(15F, -3F, 0F);
		gunModel[46].rotateAngleX = 0.34906585F;
		gunModel[46].rotateAngleZ = -0.01745329F;

		gunModel[47].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0F, 0.5F, -0.25F); // Box 63
		gunModel[47].setRotationPoint(15F, -3.35F, 0F);
		gunModel[47].rotateAngleX = -0.34906585F;
		gunModel[47].rotateAngleZ = -0.01745329F;

		gunModel[48].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		gunModel[48].setRotationPoint(-7F, -3.75F, 0F);
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 13

		ammoModel[0].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.5F, -0.25F); // Box 13
		ammoModel[0].setRotationPoint(4F, -2.5F, 0F);
		
		
	animationType = EnumAnimationType.BULLPUP;
		
		gunSlideDistance = 2F;
		
		translateAll(0F, 0F, 0F);
	}
}