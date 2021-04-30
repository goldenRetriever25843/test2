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

public class ModelM72elite extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelM72elite() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[41];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 6
		gunModel[7] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 7
		gunModel[8] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 8
		gunModel[9] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 9
		gunModel[10] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 10
		gunModel[11] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 11
		gunModel[12] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 12
		gunModel[13] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 13
		gunModel[14] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 14
		gunModel[15] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 15
		gunModel[16] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 16
		gunModel[17] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 17
		gunModel[18] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 18
		gunModel[19] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 19
		gunModel[20] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 20
		gunModel[21] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 21
		gunModel[22] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 22
		gunModel[23] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 23
		gunModel[24] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 24
		gunModel[25] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 25
		gunModel[26] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 26
		gunModel[27] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 27
		gunModel[28] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 28
		gunModel[29] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 29
		gunModel[30] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 30
		gunModel[31] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 31
		gunModel[32] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 32
		gunModel[33] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 33
		gunModel[34] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 34
		gunModel[35] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 35
		gunModel[36] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 36
		gunModel[37] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 37
		gunModel[38] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 38
		gunModel[39] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 39
		gunModel[40] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 40

		gunModel[0].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0.5F, -0.35F, 0.1F, 0F, -0.35F, 0.1F, 0F, -0.35F, 0.1F, 0.5F, -0.35F, 0.1F, 0.5F, -0.35F, 0.1F, 0F, -0.35F, 0.1F, 0F, -0.35F, 0.1F, 0.5F, -0.35F, 0.1F); // Box 0
		gunModel[0].setRotationPoint(-1F, -2F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0.5F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0.5F, -0.3F, -0.2F, 0.5F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0.5F, -0.3F, 0.1F); // Box 1
		gunModel[1].setRotationPoint(-1F, -2.35F, -0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0.5F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0.5F, -0.3F, 0.1F, 0.5F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0.5F, -0.3F, -0.2F); // Box 2
		gunModel[2].setRotationPoint(-1F, -1.65F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.5F, -0.35F, -0.2F, 0.5F, -0.35F, -0.2F, 0.5F, -0.35F, -0.2F, 0.5F, -0.35F, -0.2F, 0.5F, -0.35F, 0F, 0.5F, -0.35F, 0F, 0.5F, -0.35F, 0F, 0.5F, -0.35F, 0F); // Box 3
		gunModel[3].setRotationPoint(-5F, -2.35F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.5F, -0.35F, 0F, 0.5F, -0.35F, 0F, 0.5F, -0.35F, 0F, 0.5F, -0.35F, 0F, 0.5F, -0.35F, -0.2F, 0.5F, -0.35F, -0.2F, 0.5F, -0.35F, -0.2F, 0.5F, -0.35F, -0.2F); // Box 4
		gunModel[4].setRotationPoint(-5F, -1.65F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F); // Box 5
		gunModel[5].setRotationPoint(-5F, -2F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, -0.3F, -0.15F, -0.9F, -0.3F, -0.15F, -0.9F, -0.3F, -0.15F, 0.1F, -0.3F, -0.15F, 0.1F, -0.3F, 0.15F, -0.9F, -0.3F, 0.15F, -0.9F, -0.3F, 0.15F, 0.1F, -0.3F, 0.15F); // Box 6
		gunModel[6].setRotationPoint(-5.5F, -2.4F, -0.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, -0.3F, 0.15F, -0.9F, -0.3F, 0.15F, -0.9F, -0.3F, 0.15F, 0.1F, -0.3F, 0.15F, 0.1F, -0.3F, 0.15F, -0.9F, -0.3F, 0.15F, -0.9F, -0.3F, 0.15F, 0.1F, -0.3F, 0.15F); // Box 7
		gunModel[7].setRotationPoint(-5.5F, -2F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, -0.3F, 0.15F, -0.9F, -0.3F, 0.15F, -0.9F, -0.3F, 0.15F, 0.1F, -0.3F, 0.15F, 0.1F, -0.3F, -0.15F, -0.9F, -0.3F, -0.15F, -0.9F, -0.3F, -0.15F, 0.1F, -0.3F, -0.15F); // Box 8
		gunModel[8].setRotationPoint(-5.5F, -1.6F, -0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0.5F, -0.3F, -0.2F, 0.5F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0.5F, -0.3F, -0.2F); // Box 9
		gunModel[9].setRotationPoint(4.9F, -2.75F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, -0.35F, -0.25F, -0.8F, -0.3F, -0.2F, -0.8F, -0.3F, -0.2F, 0.2F, -0.35F, -0.25F, 0.2F, -0.3F, -0.25F, -0.8F, -0.3F, -0.2F, -0.8F, -0.3F, -0.2F, 0.2F, -0.3F, -0.25F); // Box 10
		gunModel[10].setRotationPoint(4.2F, -2.75F, -0.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.2F, -0.32F, -0.26F, 0.2F, -0.32F, -0.26F, 0.2F, -0.32F, -0.26F, 0.2F, -0.32F, -0.26F, 0.2F, -0.32F, -0.26F, 0.2F, -0.32F, -0.26F, 0.2F, -0.32F, -0.26F, 0.2F, -0.32F, -0.26F); // Box 11
		gunModel[11].setRotationPoint(1.8F, -2.72F, -0.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, -0.32F, -0.32F, -0.9F, -0.32F, -0.25F, -0.9F, -0.32F, -0.25F, 0.1F, -0.32F, -0.32F, 0.1F, -0.32F, -0.32F, -0.9F, -0.32F, -0.25F, -0.9F, -0.32F, -0.25F, 0.1F, -0.32F, -0.32F); // Box 12
		gunModel[12].setRotationPoint(1.5F, -2.72F, -0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.15F, -0.32F, -0.32F, -0.85F, -0.32F, -0.32F, -0.85F, -0.32F, -0.32F, 0.15F, -0.32F, -0.32F, 0.15F, -0.32F, -0.32F, -0.85F, -0.32F, -0.32F, -0.85F, -0.32F, -0.32F, 0.15F, -0.32F, -0.32F); // Box 13
		gunModel[13].setRotationPoint(1.4F, -2.72F, -0.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, -0.25F, -0.32F, 0.2F, -0.25F, -0.32F, 0.2F, -0.25F, -0.32F, 0.2F, -0.25F, -0.32F, 0.2F, -0.25F, -0.32F, 0.2F, -0.25F, -0.32F, 0.2F, -0.25F, -0.32F, 0.2F, -0.25F, -0.32F); // Box 14
		gunModel[14].setRotationPoint(0.05F, -2.75F, -0.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.38F, -0.25F, -0.38F, -0.38F, -0.25F, -0.32F, -0.38F, -0.25F, -0.32F, -0.38F, -0.25F, -0.38F, -0.38F, -0.25F, -0.38F, -0.38F, -0.25F, -0.32F, -0.38F, -0.25F, -0.32F, -0.38F, -0.25F, -0.38F); // Box 15
		gunModel[15].setRotationPoint(-0.77F, -2.75F, -0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, -0.3F, -0.2F, -1.2F, -0.3F, -0.2F, -1.2F, -0.3F, -0.2F, 0.5F, -0.3F, -0.2F, 0.5F, -0.3F, 0.15F, -1.2F, -0.3F, 0.15F, -1.2F, -0.3F, 0.15F, 0.5F, -0.3F, 0.15F); // Box 16
		gunModel[16].setRotationPoint(-1F, -2.37F, -0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, -0.3F, 0.15F, -1.2F, -0.3F, 0.15F, -1.2F, -0.3F, 0.15F, 0.5F, -0.3F, 0.15F, 0.5F, -0.3F, -0.2F, -1.2F, -0.3F, -0.2F, -1.2F, -0.3F, -0.2F, 0.5F, -0.3F, -0.2F); // Box 17
		gunModel[17].setRotationPoint(-1F, -1.63F, -0.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, -0.33F, 0.15F, -1.2F, -0.33F, 0.15F, -1.2F, -0.33F, 0.15F, 0.5F, -0.33F, 0.15F, 0.5F, -0.33F, 0.15F, -1.2F, -0.33F, 0.15F, -1.2F, -0.33F, 0.15F, 0.5F, -0.33F, 0.15F); // Box 18
		gunModel[18].setRotationPoint(-1F, -2F, -0.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.25F, -0.45F, -0.4F, 0.25F, -0.45F, -0.4F, 0.25F, -0.45F, -0.4F, 0.25F, -0.45F, -0.4F, 0.25F, -0.45F, -0.4F, 0.25F, -0.45F, -0.4F, 0.25F, -0.45F, -0.4F, 0.25F, -0.45F, -0.4F); // Box 19
		gunModel[19].setRotationPoint(-4.1F, -2.75F, -0.5F);

		gunModel[20].addShapeBox(-1F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.4F, -0.3F, 0.25F, -0.4F, -0.3F, 0.25F, -0.4F, -0.3F, 0.25F, -0.4F, -0.3F, 0.25F, -0.4F, -0.3F, 0.25F, -0.4F, -0.3F, 0.25F, -0.4F, -0.3F, 0.25F, -0.4F, -0.3F); // Box 20
		gunModel[20].setRotationPoint(-4.15F, -2.75F, -0.5F);

		gunModel[21].addShapeBox(-1F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.35F, -0.2F, 0.25F, -0.35F, -0.2F, 0.25F, -0.35F, -0.2F, 0.25F, -0.35F, -0.2F, 0.25F, -0.35F, -0.2F, 0.25F, -0.35F, -0.2F, 0.25F, -0.35F, -0.2F, 0.25F, -0.35F, -0.2F); // Box 21
		gunModel[21].setRotationPoint(-4.15F, -2.95F, -0.5F);

		gunModel[22].addShapeBox(-1F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F); // Box 22
		gunModel[22].setRotationPoint(-5F, -2.75F, -0.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.25F, -0.38F, -0.2F, -0.25F, -0.38F, -0.2F, -0.25F, -0.38F, -0.2F, -0.25F, -0.38F, -0.2F, -0.25F, -0.38F, -0.2F, -0.25F, -0.38F, -0.2F, -0.25F, -0.38F, -0.2F, -0.25F, -0.38F); // Box 23
		gunModel[23].setRotationPoint(-0.1F, -2.73F, -0.5F);
		gunModel[23].rotateAngleZ = 0.17453293F;

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.15F, -0.32F, -0.38F, -0.85F, -0.32F, -0.38F, -0.85F, -0.32F, -0.38F, 0.15F, -0.32F, -0.38F, 0.15F, -0.32F, -0.38F, -0.85F, -0.32F, -0.38F, -0.85F, -0.32F, -0.38F, 0.15F, -0.32F, -0.38F); // Box 24
		gunModel[24].setRotationPoint(1.4F, -2.85F, -0.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.48F, 0F, -0.45F, -0.48F, 0F, -0.45F, -0.48F, 0F, -0.5F, -0.48F, 0F, -0.5F, -0.48F, 0F, -0.45F, -0.48F, 0F, -0.45F, -0.48F, 0F, -0.5F, -0.48F, 0F, -0.5F); // Box 25
		gunModel[25].setRotationPoint(5.2F, -3.15F, -0.65F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.48F, 0F, -0.5F, -0.48F, 0F, -0.5F, -0.48F, 0F, -0.45F, -0.48F, 0F, -0.45F, -0.48F, 0F, -0.5F, -0.48F, 0F, -0.5F, -0.48F, 0F, -0.45F, -0.48F, 0F, -0.45F); // Box 26
		gunModel[26].setRotationPoint(5.2F, -3.15F, -0.35F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.48F, -0.48F, -0.15F, -0.48F, -0.48F, -0.15F, -0.48F, -0.48F, -0.45F, -0.48F, -0.48F, -0.45F, -0.48F, -0.48F, -0.15F, -0.48F, -0.48F, -0.15F, -0.48F, -0.48F, -0.45F, -0.48F, -0.48F, -0.45F); // Box 27
		gunModel[27].setRotationPoint(5.2F, -3.65F, -0.35F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.495F, -0.2F, -0.35F, -0.495F, -0.2F, -0.35F, -0.495F, -0.2F, -0.35F, -0.495F, -0.2F, -0.35F, -0.495F, -0.2F, -0.35F, -0.495F, -0.2F, -0.35F, -0.495F, -0.2F, -0.35F, -0.495F, -0.2F, -0.35F); // Box 28
		gunModel[28].setRotationPoint(5.2F, -2.9F, -0.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.495F, -0.46F, -0.45F, -0.495F, -0.46F, -0.45F, -0.495F, -0.46F, -0.35F, -0.495F, -0.46F, -0.35F, -0.495F, -0.46F, -0.45F, -0.495F, -0.46F, -0.45F, -0.495F, -0.46F, -0.5F, -0.495F, -0.46F, -0.5F); // Box 29
		gunModel[29].setRotationPoint(5.2F, -3.6F, -0.6F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.495F, -0.499F, -0.35F, -0.495F, -0.499F, -0.35F, -0.495F, -0.499F, -0.35F, -0.495F, -0.499F, -0.35F, -0.495F, -0.499F, -0.35F, -0.495F, -0.499F, -0.35F, -0.495F, -0.499F, -0.35F, -0.495F, -0.499F, -0.35F); // Box 30
		gunModel[30].setRotationPoint(5.2F, -3.5F, -0.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.495F, -0.499F, -0.35F, -0.495F, -0.499F, -0.35F, -0.495F, -0.499F, -0.35F, -0.495F, -0.499F, -0.35F, -0.495F, -0.499F, -0.35F, -0.495F, -0.499F, -0.35F, -0.495F, -0.499F, -0.35F, -0.495F, -0.499F, -0.35F); // Box 31
		gunModel[31].setRotationPoint(5.2F, -3.4F, -0.5F);

		gunModel[32].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, -0.495F, -0.499F, -0.35F, -0.495F, -0.499F, -0.35F, -0.495F, -0.499F, -0.35F, -0.495F, -0.499F, -0.35F, -0.495F, -0.499F, -0.35F, -0.495F, -0.499F, -0.35F, -0.495F, -0.499F, -0.35F, -0.495F, -0.499F, -0.35F); // Box 32
		gunModel[32].setRotationPoint(5.2F, -2.3F, -0.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.499F, -0.2F, -0.499F, -0.499F, -0.2F, -0.499F, -0.499F, -0.2F, -0.499F, -0.499F, -0.2F, -0.499F, -0.499F, -0.2F, -0.499F, -0.499F, -0.2F, -0.499F, -0.499F, -0.2F, -0.499F, -0.499F, -0.2F, -0.499F); // Box 33
		gunModel[33].setRotationPoint(5.2F, -3.35F, -0.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.495F, -0.46F, -0.35F, -0.495F, -0.46F, -0.35F, -0.495F, -0.46F, -0.45F, -0.495F, -0.46F, -0.45F, -0.495F, -0.46F, -0.5F, -0.495F, -0.46F, -0.5F, -0.495F, -0.46F, -0.45F, -0.495F, -0.46F, -0.45F); // Box 34
		gunModel[34].setRotationPoint(5.2F, -3.6F, -0.4F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.05F, -0.4F, -0.4F, -0.95F, -0.4F, -0.4F, -0.95F, -0.4F, -0.4F, 0.05F, -0.4F, -0.4F, 0.05F, -0.4F, -0.32F, -0.95F, -0.2F, -0.32F, -0.95F, -0.2F, -0.32F, 0.05F, -0.4F, -0.32F); // Box 35
		gunModel[35].setRotationPoint(-0.4F, -3.1F, -0.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.05F, -0.25F, -0.4F, -0.95F, -0.25F, -0.4F, -0.95F, -0.25F, -0.4F, 0.05F, -0.25F, -0.4F, 0.05F, -0.3F, -0.4F, -0.95F, -0.3F, -0.4F, -0.95F, -0.3F, -0.4F, 0.05F, -0.3F, -0.4F); // Box 36
		gunModel[36].setRotationPoint(-0.4F, -3.3F, -0.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, -0.35F, -0.48F, -0.9F, -0.35F, -0.48F, -0.9F, -0.3F, -0.46F, 0.1F, -0.3F, -0.46F, 0.1F, -0.35F, -0.5F, -0.9F, -0.35F, -0.5F, -0.9F, -0.35F, -0.46F, 0.1F, -0.35F, -0.46F); // Box 37
		gunModel[37].setRotationPoint(-0.4F, -3.55F, -0.6F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, -0.3F, -0.46F, -0.9F, -0.3F, -0.46F, -0.9F, -0.35F, -0.48F, 0.1F, -0.35F, -0.48F, 0.1F, -0.35F, -0.46F, -0.9F, -0.35F, -0.46F, -0.9F, -0.35F, -0.5F, 0.1F, -0.35F, -0.5F); // Box 38
		gunModel[38].setRotationPoint(-0.4F, -3.55F, -0.4F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, -0.46F, -0.43F, -0.9F, -0.46F, -0.43F, -0.9F, -0.46F, -0.43F, 0.1F, -0.46F, -0.43F, 0.1F, -0.46F, -0.42F, -0.9F, -0.46F, -0.42F, -0.9F, -0.46F, -0.42F, 0.1F, -0.46F, -0.42F); // Box 39
		gunModel[39].setRotationPoint(-0.4F, -3.71F, -0.5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, -0.43F, -0.4F, -0.9F, -0.43F, -0.4F, -0.9F, -0.43F, -0.4F, 0.1F, -0.43F, -0.4F, 0.1F, -0.43F, -0.4F, -0.9F, -0.43F, -0.4F, -0.9F, -0.43F, -0.4F, 0.1F, -0.43F, -0.4F); // Box 40
		gunModel[40].setRotationPoint(-0.4F, -3.45F, -0.5F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}