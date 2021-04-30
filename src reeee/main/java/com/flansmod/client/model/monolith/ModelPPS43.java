//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 12.06.2016 - 00:47:37
// Last changed on: 12.06.2016 - 00:47:37

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPPS43 extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPPS43() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[49];
		ammoModel = new ModelRendererTurbo[2];

		initgunModel_1();
		initammoModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 0
		gunModel[6] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 2
		gunModel[7] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 3
		gunModel[8] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 4
		gunModel[9] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 5
		gunModel[10] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 6
		gunModel[11] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 7
		gunModel[12] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 8
		gunModel[13] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 10
		gunModel[14] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 11
		gunModel[15] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 12
		gunModel[16] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 1
		gunModel[17] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 2
		gunModel[18] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 3
		gunModel[19] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 4
		gunModel[20] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 5
		gunModel[21] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 8
		gunModel[22] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 10
		gunModel[23] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 11
		gunModel[24] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 12
		gunModel[25] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 14
		gunModel[26] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 15
		gunModel[27] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 16
		gunModel[28] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 17
		gunModel[29] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 18
		gunModel[30] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 19
		gunModel[31] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 20
		gunModel[32] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 21
		gunModel[33] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 22
		gunModel[34] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 23
		gunModel[35] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 24
		gunModel[36] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 26
		gunModel[37] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 27
		gunModel[38] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 28
		gunModel[39] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 29
		gunModel[40] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 31
		gunModel[41] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 32
		gunModel[42] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 33
		gunModel[43] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 34
		gunModel[44] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 35
		gunModel[45] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 36
		gunModel[46] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 37
		gunModel[47] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 38
		gunModel[48] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 39

		gunModel[0].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0.5F, -0.5F, -0.32F, -0.45F, -0.3F, -0.32F, -0.45F, -0.3F, -0.32F, 0.5F, -0.5F, -0.32F, 0.4F, -0.3F, -0.32F, -0.45F, -0.3F, -0.32F, -0.45F, -0.3F, -0.32F, 0.4F, -0.3F, -0.32F); // Box 0
		gunModel[0].setRotationPoint(1.5F, -1.55F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0.35F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0.35F, -0.35F, -0.3F, 0.5F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F); // Box 1
		gunModel[1].setRotationPoint(1.5F, -1.75F, -0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0.25F, -0.55F, -0.4F, -0.55F, -0.55F, -0.4F, -0.55F, -0.55F, -0.4F, 0.25F, -0.55F, -0.4F, 0.35F, -0.3F, -0.3F, -0.55F, -0.3F, -0.3F, -0.55F, -0.3F, -0.3F, 0.35F, -0.3F, -0.3F); // Box 2
		gunModel[2].setRotationPoint(1.5F, -2.1F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F); // Box 3
		gunModel[3].setRotationPoint(4.5F, -1.75F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.3F, 0.25F, -0.5F, -0.3F, 0.25F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.1F, -0.3F, -0.25F, -0.1F, -0.3F, -0.25F, -0.1F, -0.3F, 0F, -0.1F, -0.3F); // Box 4
		gunModel[4].setRotationPoint(6.05F, -1.75F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, -0.33F, 0.1F, -0.5F, -0.33F, 0.1F, -0.5F, -0.33F, -0.5F, -0.5F, -0.33F, -0.2F, -0.1F, -0.33F, -0.2F, 0.05F, -0.33F, -0.2F, 0.05F, -0.33F, -0.2F, -0.1F, -0.33F); // Box 0
		gunModel[5].setRotationPoint(1.23F, -1.5F, -0.5F);
		gunModel[5].rotateAngleZ = -0.05235988F;

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.33F, -0.3F, -0.3F, -0.33F, -0.3F, -0.3F, -0.33F, -0.3F, -0.3F, -0.33F, -0.3F, -0.3F, -0.33F, -0.3F, -0.3F, -0.33F, -0.3F, -0.3F, -0.33F, -0.3F, -0.3F, -0.33F); // Box 2
		gunModel[6].setRotationPoint(1.1F, -1.15F, -0.5F);
		gunModel[6].rotateAngleZ = 0.34906585F;

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.3F, -0.33F, -0.35F, -0.45F, -0.33F, -0.35F, -0.45F, -0.33F, -0.35F, -0.3F, -0.33F, -0.35F, -0.3F, -0.33F, -0.35F, -0.45F, -0.33F, -0.35F, -0.45F, -0.33F, -0.35F, -0.3F, -0.33F); // Box 3
		gunModel[7].setRotationPoint(1.65F, -0.85F, -0.5F);
		gunModel[7].rotateAngleZ = -0.03490659F;

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.33F, -0.12F, -0.5F, -0.33F, -0.12F, -0.5F, -0.33F, -0.2F, -0.5F, -0.33F, -0.3F, -0.35F, -0.33F, -0.2F, -0.38F, -0.33F, -0.2F, -0.38F, -0.33F, -0.3F, -0.35F, -0.33F); // Box 4
		gunModel[8].setRotationPoint(1.27F, -0.12F, -0.5F);
		gunModel[8].rotateAngleZ = -0.27925268F;

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.33F, -0.12F, -0.45F, -0.33F, -0.12F, -0.45F, -0.33F, -0.4F, -0.45F, -0.33F, -0.4F, -0.45F, -0.33F, -0.05F, -0.45F, -0.33F, -0.05F, -0.45F, -0.33F, -0.4F, -0.45F, -0.33F); // Box 5
		gunModel[9].setRotationPoint(1.1F, -0.05F, -0.5F);
		gunModel[9].rotateAngleZ = -0.10471976F;

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.47F, -0.35F, -0.41F, -0.47F, -0.35F, -0.41F, -0.47F, -0.35F, -0.41F, -0.47F, -0.35F, -0.41F, -0.47F, -0.35F, -0.41F, -0.47F, -0.35F, -0.41F, -0.47F, -0.35F, -0.41F, -0.47F, -0.35F, -0.41F); // Box 6
		gunModel[10].setRotationPoint(2.68F, -1.08F, -0.5F);
		gunModel[10].rotateAngleZ = -0.03490659F;

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.47F, -0.4F, -0.42F, -0.47F, -0.4F, -0.42F, -0.47F, -0.4F, -0.42F, -0.47F, -0.4F, -0.42F, -0.47F, -0.4F, -0.42F, -0.47F, -0.4F, -0.42F, -0.47F, -0.4F, -0.42F, -0.47F, -0.4F, -0.42F); // Box 7
		gunModel[11].setRotationPoint(3.36F, -1.02F, -0.5F);
		gunModel[11].rotateAngleZ = -1.18682389F;

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.47F, -0.1F, -0.42F, -0.47F, -0.1F, -0.42F, -0.47F, -0.1F, -0.42F, -0.47F, -0.1F, -0.42F, -0.47F, -0.1F, -0.42F, -0.47F, -0.1F, -0.42F, -0.47F, -0.1F, -0.42F, -0.47F, -0.1F, -0.42F); // Box 8
		gunModel[12].setRotationPoint(3.1F, -0.82F, -0.5F);
		gunModel[12].rotateAngleZ = -1.57079633F;

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.47F, -0.3F, -0.42F, -0.47F, -0.3F, -0.42F, -0.47F, -0.3F, -0.42F, -0.47F, -0.3F, -0.42F, -0.47F, -0.4F, -0.42F, -0.47F, -0.4F, -0.42F, -0.47F, -0.4F, -0.42F, -0.47F, -0.4F, -0.42F); // Box 10
		gunModel[13].setRotationPoint(2.4F, -0.65F, -0.5F);
		gunModel[13].rotateAngleZ = 0.95993109F;

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.18F, 0F, -0.34F, -0.18F, 0F, -0.34F, -0.18F, 0F, -0.34F, -0.18F, 0F, -0.34F, -0.18F, 0F, -0.34F, -0.18F, 0F, -0.34F, -0.18F, 0F, -0.34F, -0.18F, 0F, -0.34F); // Box 11
		gunModel[14].setRotationPoint(5.1F, -1F, -0.5F);
		gunModel[14].rotateAngleZ = 0.17453293F;

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.38F, -0.3F, 0F, -0.38F, -0.3F, 0F, -0.38F, -0.3F, 0F, -0.38F, -0.3F, 0F, -0.38F, -0.3F, 0.2F, -0.38F, -0.3F, 0.2F, -0.38F, -0.3F, 0F, -0.38F); // Box 12
		gunModel[15].setRotationPoint(4.6F, -1.3F, -0.5F);
		gunModel[15].rotateAngleZ = 0.17453293F;

		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.39F, -0.35F, -0.47F, -0.39F, -0.35F, -0.47F, -0.39F, -0.35F, -0.47F, -0.39F, -0.35F, -0.47F, -0.39F, -0.35F, -0.47F, -0.39F, -0.35F, -0.47F, -0.39F, -0.35F, -0.47F, -0.39F, -0.35F, -0.47F); // Box 1
		gunModel[16].setRotationPoint(2.75F, -1.1F, -0.6F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.47F, -0.35F, -0.35F, -0.47F, -0.35F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.2F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.35F, -0.47F, -0.4F, -0.2F, -0.47F); // Box 2
		gunModel[17].setRotationPoint(2.85F, -1.3F, -0.6F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.45F, -0.47F, -0.1F, -0.45F, -0.47F, -0.1F, -0.45F, -0.47F, -0.2F, -0.45F, -0.47F, -0.2F, -0.4F, -0.47F, -0.1F, -0.4F, -0.47F, -0.1F, -0.4F, -0.47F, -0.2F, -0.4F, -0.47F); // Box 3
		gunModel[18].setRotationPoint(4.8F, -0.55F, -0.7F);
		gunModel[18].rotateAngleZ = 0.15707963F;

		gunModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.45F, -0.47F, -0.1F, -0.45F, -0.47F, -0.1F, -0.45F, -0.47F, -0.2F, -0.45F, -0.47F, -0.2F, -0.4F, -0.47F, -0.1F, -0.4F, -0.47F, -0.1F, -0.4F, -0.47F, -0.2F, -0.4F, -0.47F); // Box 4
		gunModel[19].setRotationPoint(4.8F, -0.55F, -0.3F);
		gunModel[19].rotateAngleZ = 0.15707963F;

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.35F, -0.27F, -0.35F, -0.35F, -0.27F, -0.35F, -0.35F, -0.27F, -0.35F, -0.35F, -0.27F, -0.35F, -0.35F, -0.27F, -0.1F, -0.4F, -0.27F, -0.1F, -0.4F, -0.27F, -0.35F, -0.35F, -0.27F); // Box 5
		gunModel[20].setRotationPoint(4.7F, -0.7F, -0.5F);
		gunModel[20].rotateAngleZ = 0.03490659F;

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.28F, -0.35F, -0.9F, -0.35F, -0.35F, -0.9F, -0.35F, -0.35F, 0F, -0.28F, -0.35F, 0F, -0.35F, -0.35F, -0.9F, -0.45F, -0.35F, -0.9F, -0.45F, -0.35F, 0F, -0.35F, -0.35F); // Box 8
		gunModel[21].setRotationPoint(9.85F, -1.81F, -0.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.47F, -0.1F, -0.35F, -0.47F, -0.1F, -0.35F, -0.47F, -0.1F, -0.35F, -0.47F, -0.1F, -0.35F, -0.47F, -0.55F, -0.35F, -0.47F, -0.55F, -0.35F, -0.47F, -0.555F, -0.35F, -0.47F, -0.55F, -0.35F); // Box 10
		gunModel[22].setRotationPoint(9.95F, -2F, -0.5F);
		gunModel[22].rotateAngleZ = -1.57079633F;

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.3F, -0.28F, 0F, -0.3F, -0.28F, 0F, -0.3F, -0.28F, -0.45F, -0.3F, -0.28F, -0.45F, -0.3F, -0.28F, 0F, -0.3F, -0.28F, 0F, -0.3F, -0.28F, -0.45F, -0.3F, -0.28F); // Box 11
		gunModel[23].setRotationPoint(8.5F, -1.85F, -0.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.47F, -0.1F, -0.35F, -0.47F, -0.1F, -0.35F, -0.47F, -0.1F, -0.35F, -0.47F, -0.1F, -0.35F, -0.47F, -0.55F, -0.35F, -0.47F, -0.55F, -0.35F, -0.47F, -0.555F, -0.35F, -0.47F, -0.55F, -0.35F); // Box 12
		gunModel[24].setRotationPoint(9.95F, -1.7F, -0.5F);
		gunModel[24].rotateAngleZ = -1.57079633F;

		gunModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.42F, -0.35F, -0.48F, -0.42F, -0.35F, -0.48F, -0.42F, -0.35F, -0.48F, -0.42F, -0.35F, -0.48F, -0.35F, -0.35F, -0.48F, -0.35F, -0.35F, -0.48F, -0.35F, -0.35F, -0.48F, -0.35F, -0.35F, -0.48F); // Box 14
		gunModel[25].setRotationPoint(3.65F, -2.05F, -0.4F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.42F, -0.35F, -0.48F, -0.42F, -0.35F, -0.48F, -0.42F, -0.35F, -0.48F, -0.42F, -0.35F, -0.48F, -0.35F, -0.35F, -0.48F, -0.35F, -0.35F, -0.48F, -0.35F, -0.35F, -0.48F, -0.35F, -0.35F, -0.48F); // Box 15
		gunModel[26].setRotationPoint(3.65F, -2.05F, -0.6F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.35F, -0.48F, -0.25F, -0.35F, -0.48F, -0.25F, -0.35F, -0.48F, -0.25F, -0.35F, -0.48F, -0.25F, -0.35F, -0.48F, -0.25F, -0.35F, -0.48F, -0.25F, -0.35F, -0.48F, -0.25F, -0.35F, -0.48F); // Box 16
		gunModel[27].setRotationPoint(3.65F, -1.98F, -0.4F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.35F, -0.48F, -0.25F, -0.35F, -0.48F, -0.25F, -0.35F, -0.48F, -0.25F, -0.35F, -0.48F, -0.25F, -0.35F, -0.48F, -0.25F, -0.35F, -0.48F, -0.25F, -0.35F, -0.48F, -0.25F, -0.35F, -0.48F); // Box 17
		gunModel[28].setRotationPoint(3.65F, -1.98F, -0.6F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.485F, -0.35F, -0.43F, -0.485F, -0.35F, -0.43F, -0.485F, -0.35F, -0.43F, -0.485F, -0.35F, -0.43F, -0.485F, -0.35F, -0.43F, -0.485F, -0.35F, -0.43F, -0.485F, -0.35F, -0.43F, -0.485F, -0.35F, -0.43F); // Box 18
		gunModel[29].setRotationPoint(3.6F, -1.96F, -0.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.485F, -0.35F, -0.47F, -0.485F, -0.35F, -0.47F, -0.485F, -0.35F, -0.47F, -0.485F, -0.35F, -0.47F, -0.485F, -0.35F, -0.47F, -0.485F, -0.35F, -0.47F, -0.485F, -0.35F, -0.47F, -0.485F, -0.35F, -0.47F); // Box 19
		gunModel[30].setRotationPoint(3.6F, -2.02F, -0.56F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.485F, -0.35F, -0.47F, -0.485F, -0.35F, -0.47F, -0.485F, -0.35F, -0.47F, -0.485F, -0.35F, -0.47F, -0.485F, -0.35F, -0.47F, -0.485F, -0.35F, -0.47F, -0.485F, -0.35F, -0.47F, -0.485F, -0.35F, -0.47F); // Box 20
		gunModel[31].setRotationPoint(3.6F, -2.02F, -0.44F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.48F, -0.2F, -0.4F, -0.48F, -0.2F, -0.4F, -0.48F, -0.2F, -0.4F, -0.48F, -0.2F, -0.4F, -0.48F, -0.2F, -0.4F, -0.48F, -0.2F, -0.4F, -0.48F, -0.2F, -0.4F, -0.48F); // Box 21
		gunModel[32].setRotationPoint(8.68F, -2.09F, -0.35F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.48F, -0.2F, -0.4F, -0.48F, -0.2F, -0.4F, -0.48F, -0.2F, -0.4F, -0.48F, -0.2F, -0.4F, -0.48F, -0.2F, -0.4F, -0.48F, -0.2F, -0.4F, -0.48F, -0.2F, -0.4F, -0.48F); // Box 22
		gunModel[33].setRotationPoint(8.68F, -2.1F, -0.65F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.47F, -0.48F, -0.35F, -0.47F, -0.48F, -0.35F, -0.47F, -0.48F, -0.35F, -0.47F, -0.48F, -0.2F, -0.43F, -0.48F, -0.2F, -0.43F, -0.48F, -0.2F, -0.45F, -0.48F, -0.2F, -0.45F, -0.48F); // Box 23
		gunModel[34].setRotationPoint(8.68F, -2.44F, -0.28F);
		gunModel[34].rotateAngleX = -0.55850536F;

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.47F, -0.48F, -0.35F, -0.47F, -0.48F, -0.35F, -0.47F, -0.48F, -0.35F, -0.47F, -0.48F, -0.2F, -0.45F, -0.48F, -0.2F, -0.45F, -0.48F, -0.2F, -0.43F, -0.48F, -0.2F, -0.43F, -0.48F); // Box 24
		gunModel[35].setRotationPoint(8.68F, -1.9F, -0.57F);
		gunModel[35].rotateAngleX = 0.55850536F;

		gunModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.38F, -0.4F, -0.35F, -0.38F, -0.4F, -0.35F, -0.38F, -0.4F, -0.35F, -0.38F, -0.4F, -0.35F, -0.38F, -0.4F, -0.35F, -0.38F, -0.4F, -0.35F, -0.38F, -0.4F, -0.35F, -0.38F); // Box 26
		gunModel[36].setRotationPoint(8.7F, -1.96F, -0.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.485F, -0.35F, -0.48F, -0.485F, -0.35F, -0.48F, -0.485F, -0.35F, -0.48F, -0.485F, -0.35F, -0.48F, -0.485F, -0.35F, -0.48F, -0.485F, -0.35F, -0.48F, -0.485F, -0.35F, -0.48F, -0.485F, -0.35F, -0.48F); // Box 27
		gunModel[37].setRotationPoint(8.6F, -2.05F, -0.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.46F, -0.4F, -0.41F, -0.46F, -0.4F, -0.41F, -0.46F, -0.4F, -0.41F, -0.46F, -0.4F, -0.41F, -0.47F, -0.4F, -0.41F, -0.47F, -0.4F, -0.41F, -0.47F, -0.4F, -0.41F, -0.47F, -0.4F, -0.41F); // Box 28
		gunModel[38].setRotationPoint(2.2F, -1.32F, -0.5F);
		gunModel[38].rotateAngleZ = -0.15707963F;

		gunModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.46F, -0.4F, -0.41F, -0.46F, -0.4F, -0.41F, -0.46F, -0.4F, -0.41F, -0.46F, -0.4F, -0.41F, -0.47F, -0.38F, -0.41F, -0.49F, -0.38F, -0.41F, -0.49F, -0.38F, -0.41F, -0.47F, -0.38F, -0.41F); // Box 29
		gunModel[39].setRotationPoint(2F, -0.86F, -0.5F);
		gunModel[39].rotateAngleY = 0.01745329F;
		gunModel[39].rotateAngleZ = 0.36651914F;

		gunModel[40].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.38F, -0.45F, 0F, -0.38F, -0.45F, 0F, -0.38F, -0.45F, 0F, -0.38F, -0.45F, 0F, -0.38F, -0.45F, 0F, -0.38F, -0.45F, 0F, -0.38F, -0.45F, 0F, -0.38F, -0.45F); // Box 31
		gunModel[40].setRotationPoint(-1.85F, -0.75F, -0.25F);
		gunModel[40].rotateAngleZ = 0.27925268F;

		gunModel[41].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.38F, -0.45F, 0F, -0.38F, -0.45F, 0F, -0.38F, -0.45F, 0F, -0.38F, -0.45F, 0F, -0.38F, -0.45F, 0F, -0.38F, -0.45F, 0F, -0.38F, -0.45F, 0F, -0.38F, -0.45F); // Box 32
		gunModel[41].setRotationPoint(-1.85F, -0.75F, -0.75F);
		gunModel[41].rotateAngleZ = 0.27925268F;

		gunModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.43F, -0.25F, -0.2F, -0.43F, -0.25F, -0.2F, -0.43F, -0.2F, -0.2F, -0.43F, -0.2F, -0.2F, -0.43F, -0.25F, -0.2F, -0.43F, -0.25F, -0.2F, -0.43F, -0.2F, -0.2F, -0.43F); // Box 33
		gunModel[42].setRotationPoint(-2.1F, -0.65F, -0.3F);
		gunModel[42].rotateAngleZ = 0.27925268F;

		gunModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.43F, -0.25F, -0.2F, -0.43F, -0.25F, -0.2F, -0.43F, -0.2F, -0.2F, -0.43F, -0.2F, -0.2F, -0.43F, -0.25F, -0.2F, -0.43F, -0.25F, -0.2F, -0.43F, -0.2F, -0.2F, -0.43F); // Box 34
		gunModel[43].setRotationPoint(-2.1F, -0.65F, -0.7F);
		gunModel[43].rotateAngleZ = 0.27925268F;

		gunModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.4F, -0.15F, -0.45F, -0.4F, -0.15F, -0.45F, -0.4F, -0.15F, -0.45F, -0.4F, -0.15F, -0.45F, -0.4F, -0.15F, -0.45F, -0.4F, -0.15F, -0.45F, -0.4F, -0.15F, -0.45F, -0.4F, -0.15F, -0.45F); // Box 35
		gunModel[44].setRotationPoint(-2.3F, -0.9F, -0.75F);
		gunModel[44].rotateAngleZ = 0.15707963F;

		gunModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.4F, -0.15F, -0.45F, -0.4F, -0.15F, -0.45F, -0.4F, -0.15F, -0.45F, -0.4F, -0.15F, -0.45F, -0.4F, -0.15F, -0.45F, -0.4F, -0.15F, -0.45F, -0.4F, -0.15F, -0.45F, -0.4F, -0.15F, -0.45F); // Box 36
		gunModel[45].setRotationPoint(-2.3F, -0.9F, -0.25F);
		gunModel[45].rotateAngleZ = 0.15707963F;

		gunModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F); // Box 37
		gunModel[46].setRotationPoint(-2.38F, -1.17F, -0.5F);
		gunModel[46].rotateAngleZ = 0.2268928F;

		gunModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F); // Box 38
		gunModel[47].setRotationPoint(-2.1F, 0.45F, -0.5F);
		gunModel[47].rotateAngleZ = 0.2268928F;

		gunModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.31F, -0.31F, -0.2F, -0.31F, -0.31F, -0.2F, -0.31F, -0.31F, -0.2F, -0.31F, -0.31F, -0.2F, -0.31F, -0.31F, -0.2F, -0.31F, -0.31F, -0.2F, -0.31F, -0.31F, -0.2F, -0.31F, -0.31F, -0.2F); // Box 39
		gunModel[48].setRotationPoint(0.8F, -1.6F, -0.5F);
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 6
		ammoModel[1] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 7

		ammoModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.22F, 0F, -0.36F, -0.22F, -0.1F, -0.36F, -0.22F, -0.1F, -0.36F, -0.22F, 0F, -0.36F, -0.22F, -0.1F, -0.36F, -0.22F, -0.1F, -0.36F, -0.22F, -0.1F, -0.36F, -0.22F, -0.1F, -0.36F); // Box 6
		ammoModel[0].setRotationPoint(5.27F, 0F, -0.5F);
		ammoModel[0].rotateAngleZ = 0.36651914F;

		ammoModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.22F, 0F, -0.36F, -0.22F, -0.1F, -0.36F, -0.22F, -0.1F, -0.36F, -0.22F, 0F, -0.36F, -0.22F, 0.2F, -0.36F, -0.22F, 0.2F, -0.36F, -0.22F, 0.2F, -0.36F, -0.22F, 0.2F, -0.36F); // Box 7
		ammoModel[1].setRotationPoint(5.6F, 0.85F, -0.5F);
		ammoModel[1].rotateAngleZ = 0.55850536F;
		
		animationType = EnumAnimationType.PISTOL_CLIP;
		translateAll(-1.5F, -1.7F, 0F);

		gunSlideDistance = 0.1F;
		
	}
}