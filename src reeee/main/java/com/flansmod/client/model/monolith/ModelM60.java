//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.4.2
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelM60 extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelM60() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[36];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 6
		gunModel[7] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 7
		gunModel[8] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 8
		gunModel[9] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 9
		gunModel[10] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 10
		gunModel[11] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 11
		gunModel[12] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 12
		gunModel[13] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 13
		gunModel[14] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 14
		gunModel[15] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 15
		gunModel[16] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 16
		gunModel[17] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 17
		gunModel[18] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 18
		gunModel[19] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 19
		gunModel[20] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 20
		gunModel[21] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 22
		gunModel[22] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 23
		gunModel[23] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 24
		gunModel[24] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 25
		gunModel[25] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 26
		gunModel[26] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 27
		gunModel[27] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 29
		gunModel[28] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 30
		gunModel[29] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 32
		gunModel[30] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 33
		gunModel[31] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 34
		gunModel[32] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 35
		gunModel[33] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 36
		gunModel[34] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 37
		gunModel[35] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 38

		gunModel[0].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 0
		gunModel[0].setRotationPoint(-8.5F, -6.5F, 0F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -1.5F, -0.25F, -0.5F, -1.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 1
		gunModel[1].setRotationPoint(-7.5F, -6.5F, 0F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 2
		gunModel[2].setRotationPoint(-6F, -5.6F, 0F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, 0F, -0.25F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F, 0F, 0F, -0.25F); // Box 3
		gunModel[3].setRotationPoint(-6F, -4F, 0F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, -0.25F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.6F, -0.25F, -0.3F, -0.6F, -0.25F, -0.3F, -0.6F, -0.25F, 0F, -0.6F, -0.25F); // Box 4
		gunModel[4].setRotationPoint(-6F, -6F, 0F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F, 0F, -0.4F, 0.15F, -0.2F, -0.4F, 0.15F, -0.2F, -0.4F, 0.15F, 0F, -0.4F, 0.15F, 0F, 0F, 0.15F, -0.2F, 0F, 0.15F, -0.2F, 0F, 0.15F, 0F, 0F, 0.15F); // Box 5
		gunModel[5].setRotationPoint(-4.3F, -6F, 0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F); // Box 6
		gunModel[6].setRotationPoint(-4.3F, -6F, 0F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.6F, -0.05F, 0.5F, 0F, 0.15F, 0.5F, 0F, 0.15F, 0F, -0.6F, -0.05F, 0F, 0F, 0.15F, 0.5F, 0F, 0.15F, 0.5F, 0F, 0.15F, 0F, 0F, 0.15F); // Box 7
		gunModel[7].setRotationPoint(-2.3F, -6.6F, 0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0.15F, 0.3F, 0F, 0.15F, 0.3F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0.3F, 0F, 0.15F, 0.3F, 0F, 0.15F, 0F, 0F, 0.15F); // Box 8
		gunModel[8].setRotationPoint(0.2F, -6.6F, 0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 9
		gunModel[9].setRotationPoint(3.7F, -5.5F, 0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 10
		gunModel[10].setRotationPoint(21.2F, -5.5F, 0.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.1F, -0.1F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, 0F, -0.1F, -0.1F); // Box 11
		gunModel[11].setRotationPoint(23.4F, -5.5F, 0.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.15F, -0.15F, 0.5F, -0.15F, -0.15F, 0.5F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0.5F, -0.15F, -0.15F, 0.5F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 12
		gunModel[12].setRotationPoint(16.7F, -4.6F, 0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		gunModel[13].setRotationPoint(4.5F, -5.2F, 0F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 14
		gunModel[14].setRotationPoint(6.5F, -6.2F, 0F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		gunModel[15].setRotationPoint(-0.5F, -4.4F, 0.5F);

		gunModel[16].addShapeBox(-1F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, 0F, -0.3F, 0F); // Box 16
		gunModel[16].setRotationPoint(1.5F, -3.4F, 0.5F);
		gunModel[16].rotateAngleZ = -0.50614548F;

		gunModel[17].addShapeBox(-1F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		gunModel[17].setRotationPoint(2F, -3.4F, 0.5F);

		gunModel[18].addShapeBox(-0.5F, 0.3F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F); // Box 18
		gunModel[18].setRotationPoint(3.5F, -3.7F, 0.5F);
		gunModel[18].rotateAngleZ = -0.15707963F;

		gunModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F); // Box 19
		gunModel[19].setRotationPoint(4.5F, -5.9F, 0F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.15F, -0.6F, 0F, -0.15F, -0.6F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -0.6F, 0F, -0.15F, -0.6F, 0F, -0.15F, 0F, 0F, -0.15F); // Box 20
		gunModel[20].setRotationPoint(4.4F, -6.8F, 0.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.35F, 0F, 0.4F, -0.35F, 0F, 0.4F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0.4F, -0.35F, 0F, 0.4F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 22
		gunModel[21].setRotationPoint(3.5F, -6.25F, 0.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 23
		gunModel[22].setRotationPoint(3.55F, -6.6F, 0.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 24
		gunModel[23].setRotationPoint(5.8F, -6.3F, 0.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.25F, -0.8F, 0F, -0.25F, -0.8F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.6F, -0.25F, -0.8F, -0.6F, -0.25F, -0.8F, -0.6F, -0.25F, 0F, -0.6F, -0.25F); // Box 25
		gunModel[24].setRotationPoint(3.95F, -6.6F, 0.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.35F, -0.45F, 0F, -0.35F, -0.45F, 0F, -0.35F, -0.45F, 0F, -0.35F, -0.45F, 0F, -0.35F, -0.45F, 0F, -0.35F, -0.45F, 0F, -0.35F, -0.45F, 0F, -0.35F, -0.45F); // Box 26
		gunModel[25].setRotationPoint(6.4F, -6.4F, 0.3F);
		gunModel[25].rotateAngleX = 0.50614548F;

		gunModel[26].addShapeBox(0F, 0F, -1.05F, 1, 2, 1, 0F, -0.35F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, 0F, -0.45F); // Box 27
		gunModel[26].setRotationPoint(7.75F, -8.2F, 0.5F);
		gunModel[26].rotateAngleX = 0.50614548F;

		gunModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 29
		gunModel[27].setRotationPoint(5.2F, -8.5F, -0.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 30
		gunModel[28].setRotationPoint(20.2F, -5.7F, 0.5F);

		gunModel[29].addShapeBox(0F, -0.2F, 0F, 1, 2, 1, 0F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0.5F, -0.4F, -0.35F, 0.5F, -0.4F, -0.35F, 0.5F, -0.4F, -0.35F, 0.5F, -0.4F); // Box 32
		gunModel[29].setRotationPoint(19.75F, -7.3F, 0.5F);
		gunModel[29].rotateAngleZ = -0.33161256F;

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0.5F, -0.4F, -0.35F, 0.5F, -0.4F, -0.35F, 0.5F, -0.4F, -0.35F, 0.5F, -0.4F); // Box 33
		gunModel[30].setRotationPoint(19.85F, -7.3F, 0.5F);
		gunModel[30].rotateAngleZ = 0.05235988F;

		gunModel[31].addShapeBox(-7F, 0F, 0F, 7, 1, 1, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 34
		gunModel[31].setRotationPoint(20.2F, -4.1F, 1.5F);
		gunModel[31].rotateAngleY = -1.57079633F;
		gunModel[31].rotateAngleZ = 0.95993109F;

		gunModel[32].addShapeBox(-7F, -1F, 0F, 7, 1, 1, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 35
		gunModel[32].setRotationPoint(20.2F, -4.1F, 0.5F);
		gunModel[32].rotateAngleY = -1.57079633F;
		gunModel[32].rotateAngleZ = 2.18166156F;

		gunModel[33].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.05F, -0.05F, 0.5F, -0.05F, -0.05F, 0.5F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0.5F, -0.05F, -0.05F, 0.5F, -0.05F, -0.05F, 0F, -0.05F, -0.05F); // Box 36
		gunModel[33].setRotationPoint(11.7F, -4.6F, 0.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F); // Box 37
		gunModel[34].setRotationPoint(16.2F, -5.7F, 0.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F); // Box 38
		gunModel[35].setRotationPoint(14.8F, -5.7F, 0.5F);


		ammoModel = new ModelRendererTurbo[5];
		ammoModel[0] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 39
		ammoModel[1] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 22
		ammoModel[2] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 41
		ammoModel[3] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 42
		ammoModel[4] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 43

		ammoModel[0].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 39
		ammoModel[0].setRotationPoint(1F, -5.6F, 1.65F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 22
		ammoModel[1].setRotationPoint(1.27F, -6F, 2.5F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 41
		ammoModel[2].setRotationPoint(1.27F, -6.2F, 2F);

		ammoModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 42
		ammoModel[3].setRotationPoint(1.27F, -6.5F, 1.5F);

		ammoModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 43
		ammoModel[4].setRotationPoint(1.27F, -6.8F, 1F);

		animationType = EnumAnimationType.PISTOL_CLIP;

		translateAll(0F, 1F, -1F);
		gunSlideDistance = 0.1F;

		flipAll();
	}
}