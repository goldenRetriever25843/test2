//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelEliteRPG extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelEliteRPG() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[50];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 6
		gunModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 5
		gunModel[4] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 17
		gunModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 18
		gunModel[6] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 20
		gunModel[7] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 21
		gunModel[8] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 22
		gunModel[9] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 23
		gunModel[10] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 24
		gunModel[11] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 25
		gunModel[12] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 26
		gunModel[13] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 27
		gunModel[14] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 30
		gunModel[15] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 31
		gunModel[16] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 0
		gunModel[17] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 1
		gunModel[18] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 2
		gunModel[19] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 3
		gunModel[20] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 5
		gunModel[21] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 6
		gunModel[22] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 8
		gunModel[23] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 9
		gunModel[24] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 10
		gunModel[25] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 11
		gunModel[26] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 12
		gunModel[27] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 13
		gunModel[28] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 14
		gunModel[29] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 15
		gunModel[30] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 16
		gunModel[31] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 17
		gunModel[32] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 18
		gunModel[33] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 19
		gunModel[34] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 20
		gunModel[35] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 21
		gunModel[36] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 22
		gunModel[37] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 23
		gunModel[38] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 24
		gunModel[39] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 25
		gunModel[40] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 26
		gunModel[41] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 27
		gunModel[42] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 28
		gunModel[43] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 29
		gunModel[44] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 30
		gunModel[45] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 31
		gunModel[46] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 32
		gunModel[47] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 33
		gunModel[48] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 34
		gunModel[49] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 35

		gunModel[0].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F); // Box 0
		gunModel[0].setRotationPoint(0F, 0.3F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, 0.7F, -0.18F, 0.2F, 0.7F, -0.18F, 0.2F, 0.7F, -0.18F, 0.1F, 0.7F, -0.18F, 0F, 0F, -0.18F, 0.2F, 0F, -0.18F, 0.2F, 0F, -0.18F, 0F, 0F, -0.18F); // Box 1
		gunModel[1].setRotationPoint(0F, -0.7F, -0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.3F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0.3F, -0.4F, -0.2F, 0.3F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0.3F, -0.4F, -0.2F); // Box 6
		gunModel[2].setRotationPoint(3.7F, -3F, 0F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F); // Box 5
		gunModel[3].setRotationPoint(-3.8F, -1.25F, 0F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 18, 2, 2, 0F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F); // Box 17
		gunModel[4].setRotationPoint(-12F, -2.8F, -1F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 18, 2, 2, 0F, -0.4F, -0.8F, -0.8F, -0.4F, -0.8F, -0.8F, -0.4F, -0.8F, -0.8F, -0.4F, -0.8F, -0.8F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F); // Box 18
		gunModel[5].setRotationPoint(-12F, -3.2F, -1F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 18, 2, 2, 0F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.8F, -0.4F, -0.8F, -0.8F, -0.4F, -0.8F, -0.8F, -0.4F, -0.8F, -0.8F); // Box 20
		gunModel[6].setRotationPoint(-12F, -2.4F, -1F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, -0.4F, -0.75F, -0.8F, -0.4F, -0.75F, -0.8F, -0.4F, -0.75F, -0.8F, -0.4F, -0.75F, -0.8F, -0.4F, -0.75F, -0.3F, -0.4F, -0.75F, -0.3F, -0.4F, -0.75F, -0.3F, -0.4F, -0.75F, -0.3F); // Box 21
		gunModel[7].setRotationPoint(-7F, -3.35F, -1F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, -0.4F, -0.7F, -0.3F, -0.4F, -0.7F, -0.3F, -0.4F, -0.7F, -0.3F, -0.4F, -0.7F, -0.3F, -0.4F, -0.7F, -0.3F, -0.4F, -0.7F, -0.3F, -0.4F, -0.7F, -0.3F, -0.4F, -0.7F, -0.3F); // Box 22
		gunModel[8].setRotationPoint(-7F, -2.8F, -1F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, -0.4F, -0.75F, -0.3F, -0.4F, -0.75F, -0.3F, -0.4F, -0.75F, -0.3F, -0.4F, -0.75F, -0.3F, -0.4F, -0.75F, -0.8F, -0.4F, -0.75F, -0.8F, -0.4F, -0.75F, -0.8F, -0.4F, -0.75F, -0.8F); // Box 23
		gunModel[9].setRotationPoint(-7F, -2.25F, -1F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.4F, -1F, -0.8F, -0.4F, -0.75F, -0.8F, -0.4F, -0.75F, -0.8F, -0.4F, -1F, -0.8F, -0.4F, -0.75F, -0.5F, -0.4F, -0.75F, -0.3F, -0.4F, -0.75F, -0.3F, -0.4F, -0.75F, -0.5F); // Box 24
		gunModel[10].setRotationPoint(-8.15F, -3.36F, -1F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.4F, -0.75F, -0.5F, -0.4F, -0.75F, -0.3F, -0.4F, -0.75F, -0.3F, -0.4F, -0.75F, -0.5F, -0.4F, -1F, -0.8F, -0.4F, -0.75F, -0.8F, -0.4F, -0.75F, -0.8F, -0.4F, -1F, -0.8F); // Box 25
		gunModel[11].setRotationPoint(-8.15F, -2.25F, -1F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.4F, -0.7F, -0.5F, -0.4F, -0.7F, -0.3F, -0.4F, -0.7F, -0.3F, -0.4F, -0.7F, -0.5F, -0.4F, -0.7F, -0.5F, -0.4F, -0.7F, -0.3F, -0.4F, -0.7F, -0.3F, -0.4F, -0.7F, -0.5F); // Box 26
		gunModel[12].setRotationPoint(-8.15F, -2.81F, -1F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.8F, -0.75F, -0.8F, -0.8F, -1F, -0.8F, -0.8F, -1F, -0.8F, -0.8F, -0.75F, -0.8F, -0.8F, -0.7F, -0.3F, -0.8F, -0.7F, -0.45F, -0.8F, -0.7F, -0.45F, -0.8F, -0.7F, -0.3F); // Box 27
		gunModel[13].setRotationPoint(-1.2F, -3.35F, -1F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.8F, -0.75F, -0.3F, -0.8F, -0.75F, -0.45F, -0.8F, -0.75F, -0.45F, -0.8F, -0.75F, -0.3F, -0.8F, -0.75F, -0.8F, -0.8F, -1F, -0.8F, -0.8F, -1F, -0.8F, -0.8F, -0.75F, -0.8F); // Box 30
		gunModel[14].setRotationPoint(-1.2F, -2.25F, -1F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.8F, -0.75F, -0.3F, -0.8F, -0.75F, -0.45F, -0.8F, -0.75F, -0.45F, -0.8F, -0.75F, -0.3F, -0.8F, -0.75F, -0.3F, -0.8F, -0.75F, -0.45F, -0.8F, -0.75F, -0.45F, -0.8F, -0.75F, -0.3F); // Box 31
		gunModel[15].setRotationPoint(-1.2F, -2.78F, -1F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, -0.6F, -0.75F, -0.3F, -0.4F, -0.75F, -0.3F, -0.4F, -0.75F, -0.3F, -0.6F, -0.75F, -0.3F, -0.6F, -0.75F, -0.8F, -0.4F, -0.75F, -0.8F, -0.4F, -0.75F, -0.8F, -0.6F, -0.75F, -0.8F); // Box 0
		gunModel[16].setRotationPoint(-3F, -2.25F, -1F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, -0.6F, -0.7F, -0.3F, -0.4F, -0.7F, -0.3F, -0.4F, -0.7F, -0.3F, -0.6F, -0.7F, -0.3F, -0.6F, -0.7F, -0.3F, -0.4F, -0.7F, -0.3F, -0.4F, -0.7F, -0.3F, -0.6F, -0.7F, -0.3F); // Box 1
		gunModel[17].setRotationPoint(-3F, -2.8F, -1F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, -0.6F, -0.75F, -0.8F, -0.4F, -0.75F, -0.8F, -0.4F, -0.75F, -0.8F, -0.6F, -0.75F, -0.8F, -0.6F, -0.75F, -0.3F, -0.4F, -0.75F, -0.3F, -0.4F, -0.75F, -0.3F, -0.6F, -0.75F, -0.3F); // Box 2
		gunModel[18].setRotationPoint(-3F, -3.35F, -1F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, -0.1F, -0.8F, 0F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F, -0.1F, -0.8F, 0F); // Box 3
		gunModel[19].setRotationPoint(-15.2F, -2.8F, -1F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, -0.1F, -0.35F, -0.6F, -0.4F, -0.8F, -0.8F, -0.4F, -0.8F, -0.8F, -0.1F, -0.35F, -0.6F, -0.1F, -0.8F, 0F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F, -0.1F, -0.8F, 0F); // Box 5
		gunModel[20].setRotationPoint(-15.2F, -3.2F, -1F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, -0.1F, -0.8F, 0F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F, -0.1F, -0.8F, 0F, -0.1F, -0.35F, -0.6F, -0.4F, -0.8F, -0.8F, -0.4F, -0.8F, -0.8F, -0.1F, -0.35F, -0.6F); // Box 6
		gunModel[21].setRotationPoint(-15.2F, -2.4F, -1F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.2F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, 0.4F, -0.5F, -0.4F, 0.4F, -0.5F, -0.4F, 0.4F, -0.2F, -0.4F, 0.4F); // Box 8
		gunModel[22].setRotationPoint(-15.5F, -3.55F, -1F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.2F, -0.4F, 0.4F, -0.5F, -0.4F, 0.4F, -0.5F, -0.4F, 0.4F, -0.2F, -0.4F, 0.4F, -0.2F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F); // Box 9
		gunModel[23].setRotationPoint(-15.5F, -2F, -1F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.2F, -0.83F, 0.4F, -0.5F, -0.83F, 0.4F, -0.5F, -0.83F, 0.4F, -0.2F, -0.83F, 0.4F, -0.2F, -0.83F, 0.4F, -0.5F, -0.83F, 0.4F, -0.5F, -0.83F, 0.4F, -0.2F, -0.83F, 0.4F); // Box 10
		gunModel[24].setRotationPoint(-15.5F, -2.78F, -1F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F); // Box 11
		gunModel[25].setRotationPoint(-4F, -1.5F, 0F);

		gunModel[26].addShapeBox(-1F, 0F, 0F, 1, 1, 1, 0F, 0.1F, 0F, -0.18F, 0.1F, 0F, -0.18F, 0.1F, 0F, -0.18F, 0.1F, 0F, -0.18F, 0.1F, 0F, -0.18F, 0.1F, -0.1F, -0.18F, 0.1F, -0.1F, -0.18F, 0.1F, 0F, -0.18F); // Box 12
		gunModel[26].setRotationPoint(2F, -1.7F, -0.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F); // Box 13
		gunModel[27].setRotationPoint(1.48F, -0.95F, -0.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F); // Box 14
		gunModel[28].setRotationPoint(2F, -0.65F, -0.5F);
		gunModel[28].rotateAngleZ = -1.29154365F;

		gunModel[29].addShapeBox(-1F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 15
		gunModel[29].setRotationPoint(0F, -1.9F, -0.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F); // Box 16
		gunModel[30].setRotationPoint(4F, -2.7F, 0F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F); // Box 17
		gunModel[31].setRotationPoint(3.1F, -2.7F, 0F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.3F, -0.35F, -0.45F, 0F, -0.35F, -0.45F, 0F, -0.35F, -0.45F, 0.3F, -0.35F, -0.45F, 0.3F, -0.35F, -0.45F, 0F, -0.35F, -0.45F, 0F, -0.35F, -0.45F, 0.3F, -0.35F, -0.45F); // Box 18
		gunModel[32].setRotationPoint(3.7F, -3.2F, -0.25F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.3F, -0.35F, -0.45F, 0F, -0.35F, -0.45F, 0F, -0.35F, -0.45F, 0.3F, -0.35F, -0.45F, 0.3F, -0.35F, -0.45F, 0F, -0.35F, -0.45F, 0F, -0.35F, -0.45F, 0.3F, -0.35F, -0.45F); // Box 19
		gunModel[33].setRotationPoint(3.7F, -3.2F, 0.25F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.1F, -0.35F, -0.45F, -0.1F, -0.35F, -0.45F, -0.1F, -0.35F, -0.45F, -0.1F, -0.35F, -0.45F, -0.1F, -0.35F, -0.45F, -0.1F, -0.35F, -0.45F, -0.1F, -0.35F, -0.45F, -0.1F, -0.35F); // Box 20
		gunModel[34].setRotationPoint(4.1F, -3.4F, 0F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.4F, -0.48F, -0.45F, -0.4F, -0.48F, -0.45F, -0.4F, -0.48F, -0.45F, -0.4F, -0.48F, -0.45F, -0.4F, -0.48F, -0.45F, -0.4F, -0.48F, -0.45F, -0.4F, -0.48F, -0.45F, -0.4F, -0.48F); // Box 21
		gunModel[35].setRotationPoint(4.1F, -3.9F, 0F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.45F, -0.4F, -0.48F, -0.45F, -0.4F, -0.48F, -0.45F, -0.4F, -0.48F, -0.45F, -0.4F, -0.48F, -0.45F, -0.4F, -0.48F, -0.45F, -0.4F, -0.48F, -0.45F, -0.4F, -0.48F, -0.45F, -0.4F, -0.48F); // Box 22
		gunModel[36].setRotationPoint(4.1F, -4.05F, 0.13F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.45F, -0.4F, -0.48F, -0.45F, -0.4F, -0.48F, -0.45F, -0.4F, -0.48F, -0.45F, -0.4F, -0.48F, -0.45F, -0.4F, -0.48F, -0.45F, -0.4F, -0.48F, -0.45F, -0.4F, -0.48F, -0.45F, -0.4F, -0.48F); // Box 23
		gunModel[37].setRotationPoint(4.1F, -4.05F, -0.13F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.48F, -0.35F, -0.45F, -0.48F, -0.35F, -0.45F, -0.48F, -0.35F, -0.45F, -0.48F, -0.35F, -0.45F, -0.48F, -0.35F, -0.45F, -0.48F, -0.35F, -0.45F, -0.48F, -0.35F, -0.45F, -0.48F, -0.35F); // Box 24
		gunModel[38].setRotationPoint(4.1F, -4.15F, 0F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.3F, -0.35F, -0.45F, 0F, -0.35F, -0.45F, 0F, -0.35F, -0.45F, 0.3F, -0.35F, -0.45F, 0.3F, -0.35F, -0.45F, 0F, -0.35F, -0.45F, 0F, -0.35F, -0.45F, 0.3F, -0.35F, -0.45F); // Box 25
		gunModel[39].setRotationPoint(-1.8F, -3.4F, 0.25F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.3F, -0.35F, -0.45F, 0F, -0.35F, -0.45F, 0F, -0.35F, -0.45F, 0.3F, -0.35F, -0.45F, 0.3F, -0.35F, -0.45F, 0F, -0.35F, -0.45F, 0F, -0.35F, -0.45F, 0.3F, -0.35F, -0.45F); // Box 26
		gunModel[40].setRotationPoint(-1.8F, -3.4F, -0.25F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.3F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0.3F, -0.4F, -0.2F, 0.3F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0.3F, -0.4F, -0.2F); // Box 27
		gunModel[41].setRotationPoint(-1.8F, -3.2F, 0F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F); // Box 28
		gunModel[42].setRotationPoint(-1.5F, -2.9F, 0F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F); // Box 29
		gunModel[43].setRotationPoint(-2.4F, -2.9F, 0F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.2F, -0.25F, -0.45F, -0.2F, -0.25F, -0.45F, -0.2F, -0.25F, -0.45F, -0.2F, -0.25F, -0.45F, -0.2F, -0.25F, -0.45F, -0.2F, -0.25F, -0.45F, -0.2F, -0.25F, -0.45F, -0.2F, -0.25F); // Box 30
		gunModel[44].setRotationPoint(-2.4F, -3.6F, 0F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F); // Box 31
		gunModel[45].setRotationPoint(-2.4F, -3.95F, -0.15F);

		gunModel[46].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F); // Box 32
		gunModel[46].setRotationPoint(-2.4F, -2.95F, 0.15F);

		gunModel[47].addShapeBox(0F, 1F, 0F, 1, 2, 1, 0F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F); // Box 33
		gunModel[47].setRotationPoint(-2.3F, -5.4F, -0.2F);

		gunModel[48].addShapeBox(0F, 1F, 0F, 1, 2, 1, 0F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F); // Box 34
		gunModel[48].setRotationPoint(-2.3F, -5.4F, 0.2F);

		gunModel[49].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F); // Box 35
		gunModel[49].setRotationPoint(-2.3F, -3.65F, 0F);


		ammoModel = new ModelRendererTurbo[13];
		ammoModel[0] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 36
		ammoModel[1] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 37
		ammoModel[2] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 38
		ammoModel[3] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 39
		ammoModel[4] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 41
		ammoModel[5] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 42
		ammoModel[6] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 43
		ammoModel[7] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 44
		ammoModel[8] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 45
		ammoModel[9] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 46
		ammoModel[10] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 48
		ammoModel[11] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 49
		ammoModel[12] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 50

		ammoModel[0].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.1F, -0.55F, -0.6F, -0.1F, -0.9F, -0.9F, -0.1F, -0.9F, -0.9F, -0.1F, -0.55F, -0.6F, -0.1F, -0.9F, -0.2F, -0.1F, -0.9F, -0.5F, -0.1F, -0.9F, -0.5F, -0.1F, -0.9F, -0.2F); // Box 36
		ammoModel[0].setRotationPoint(5.5F, -3.1F, -1F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.1F, -0.9F, -0.2F, -0.1F, -0.9F, -0.5F, -0.1F, -0.9F, -0.5F, -0.1F, -0.9F, -0.2F, -0.1F, -0.55F, -0.6F, -0.1F, -0.9F, -0.8F, -0.1F, -0.9F, -0.8F, -0.1F, -0.55F, -0.6F); // Box 37
		ammoModel[1].setRotationPoint(5.5F, -2.5F, -1F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.2F); // Box 38
		ammoModel[2].setRotationPoint(5.5F, -2.3F, -1F);

		ammoModel[3].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, -0.1F, -0.25F, -0.4F, -0.4F, -1F, -0.95F, -0.4F, -1F, -0.95F, -0.1F, -0.25F, -0.4F, -0.1F, -0.8F, 0.05F, -0.4F, -0.8F, -0.75F, -0.4F, -0.8F, -0.75F, -0.1F, -0.8F, 0.05F); // Box 39
		ammoModel[3].setRotationPoint(9.6F, -3.05F, -1F);

		ammoModel[4].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, -0.1F, -0.8F, 0.05F, -0.4F, -0.8F, -0.75F, -0.4F, -0.8F, -0.75F, -0.1F, -0.8F, 0.05F, -0.1F, -0.45F, -0.4F, -0.4F, -1F, -1F, -0.4F, -1F, -1F, -0.1F, -0.45F, -0.4F); // Box 41
		ammoModel[4].setRotationPoint(9.6F, -2.45F, -1F);

		ammoModel[5].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, -0.1F, -0.9F, -0.65F, -0.4F, -0.9F, 0.05F, -0.4F, -0.9F, 0.05F, -0.1F, -0.9F, -0.65F, -0.1F, -0.9F, -0.95F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.1F, -0.9F, -0.95F); // Box 42
		ammoModel[5].setRotationPoint(6.1F, -2.55F, -1F);

		ammoModel[6].addShapeBox(0F, -1F, 0F, 4, 2, 2, 0F, -0.1F, -1F, -0.95F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.1F, -1F, -0.95F, -0.1F, -0.7F, -0.65F, -0.4F, -0.7F, 0.05F, -0.4F, -0.7F, 0.05F, -0.1F, -0.7F, -0.65F); // Box 43
		ammoModel[6].setRotationPoint(6.1F, -2.15F, -1F);

		ammoModel[7].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, -0.1F, -0.4F, 0.05F, -0.4F, -0.4F, -0.75F, -0.4F, -0.4F, -0.75F, -0.1F, -0.4F, 0.05F, -0.1F, -0.4F, 0.05F, -0.4F, -0.4F, -0.75F, -0.4F, -0.4F, -0.75F, -0.1F, -0.4F, 0.05F); // Box 44
		ammoModel[7].setRotationPoint(9.6F, -2.25F, -1F);

		ammoModel[8].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, -0.1F, -0.4F, -0.65F, -0.4F, -0.4F, 0.05F, -0.4F, -0.4F, 0.05F, -0.1F, -0.4F, -0.65F, -0.1F, -0.4F, -0.65F, -0.4F, -0.4F, 0.05F, -0.4F, -0.4F, 0.05F, -0.1F, -0.4F, -0.65F); // Box 45
		ammoModel[8].setRotationPoint(6.1F, -2.25F, -1F);

		ammoModel[9].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 46
		ammoModel[9].setRotationPoint(0F, -2.3F, -0.5F);

		ammoModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.45F, -0.75F, 0F, -0.45F, -0.75F, 0F, -0.45F, -0.75F, 0F, -0.45F, -0.75F, 0F, -0.45F, -0.75F, 0F, -0.45F, -0.75F, 0F, -0.45F, -0.75F, 0F, -0.45F, -0.75F); // Box 48
		ammoModel[10].setRotationPoint(13.2F, -2.25F, -1F);

		ammoModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.4F, -0.95F, 0F, -0.4F, -0.95F, 0F, -0.4F, -0.95F, 0F, -0.4F, -0.95F, 0F, -0.4F, -0.75F, 0F, -0.4F, -0.75F, 0F, -0.4F, -0.75F, 0F, -0.4F, -0.75F); // Box 49
		ammoModel[11].setRotationPoint(13.2F, -2.4F, -1F);

		ammoModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.4F, -0.75F, 0F, -0.4F, -0.75F, 0F, -0.4F, -0.75F, 0F, -0.4F, -0.75F, 0F, -0.4F, -0.95F, 0F, -0.4F, -0.95F, 0F, -0.4F, -0.95F, 0F, -0.4F, -0.95F); // Box 50
		ammoModel[12].setRotationPoint(13.2F, -2.1F, -1F);



		translateAll(0F, -1F, -0.5F);
		animationType = EnumAnimationType.END_LOADED;


		flipAll();
	}
}