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

public class ModelPP19elite extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPP19elite() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[46];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 5
		gunModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 23
		gunModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 24
		gunModel[6] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 25
		gunModel[7] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 26
		gunModel[8] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 27
		gunModel[9] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 28
		gunModel[10] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 37
		gunModel[11] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 39
		gunModel[12] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 40
		gunModel[13] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 41
		gunModel[14] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 43
		gunModel[15] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 44
		gunModel[16] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 45
		gunModel[17] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 49
		gunModel[18] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 6
		gunModel[19] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 7
		gunModel[20] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 14
		gunModel[21] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 15
		gunModel[22] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 16
		gunModel[23] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 17
		gunModel[24] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 18
		gunModel[25] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 19
		gunModel[26] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 1
		gunModel[27] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 2
		gunModel[28] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 4
		gunModel[29] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 5
		gunModel[30] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 6
		gunModel[31] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 7
		gunModel[32] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 8
		gunModel[33] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 10
		gunModel[34] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 11
		gunModel[35] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 64
		gunModel[36] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 65
		gunModel[37] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 66
		gunModel[38] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 77
		gunModel[39] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 78
		gunModel[40] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 80
		gunModel[41] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 64
		gunModel[42] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 66
		gunModel[43] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 67
		gunModel[44] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 73
		gunModel[45] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 75

		gunModel[0].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.1F, -0.15F, 0.6F, -0.1F, -0.15F, 0.6F, -0.1F, -0.15F, 0F, -0.1F, -0.15F, 0F, 0F, -0.15F, 0.6F, -0.2F, -0.15F, 0.6F, -0.2F, -0.15F, 0F, 0F, -0.15F); // Box 0
		gunModel[0].setRotationPoint(-1.5F, -2F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.3F, -0.35F, 0.3F, -0.3F, -0.35F, 0.3F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0.3F, -0.3F, -0.15F, 0.3F, -0.3F, -0.15F, 0.3F, -0.3F, -0.15F, 0.3F, -0.3F, -0.15F); // Box 1
		gunModel[1].setRotationPoint(-1.2F, -2.6F, -0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, 0F, -0.2F, -0.3F); // Box 2
		gunModel[2].setRotationPoint(2.2F, -2.7F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.43F, -0.4F, 0.1F, -0.43F, -0.4F, 0.1F, -0.43F, -0.4F, 0F, -0.43F, -0.4F, 0F, -0.43F, -0.3F, 0.1F, -0.43F, -0.3F, 0.1F, -0.43F, -0.3F, 0F, -0.43F, -0.3F); // Box 5
		gunModel[3].setRotationPoint(5.5F, -2.25F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.38F, -0.35F, -0.4F, -0.3F, -0.35F, -0.4F, -0.3F, -0.35F, -0.4F, -0.38F, -0.35F, -0.4F, -0.3F, -0.35F, -0.4F, -0.3F, -0.35F, -0.4F, -0.3F, -0.35F, -0.4F, -0.3F, -0.35F, -0.4F); // Box 23
		gunModel[4].setRotationPoint(5.4F, -2.73F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.48F, -0.3F, -0.4F, -0.48F, -0.3F, -0.42F, -0.48F, -0.4F, -0.42F, -0.48F, -0.4F, -0.4F, -0.48F, -0.3F, -0.4F, -0.48F, -0.3F, -0.4F, -0.48F, -0.4F, -0.4F, -0.48F); // Box 24
		gunModel[5].setRotationPoint(5.4F, -2.87F, -0.67F);
		gunModel[5].rotateAngleX = 0.15707963F;

		gunModel[6].addShapeBox(0F, 0F, -1F, 1, 1, 1, 0F, -0.4F, -0.42F, -0.48F, -0.3F, -0.42F, -0.48F, -0.3F, -0.4F, -0.48F, -0.4F, -0.4F, -0.48F, -0.4F, -0.4F, -0.48F, -0.3F, -0.4F, -0.48F, -0.3F, -0.4F, -0.48F, -0.4F, -0.4F, -0.48F); // Box 25
		gunModel[6].setRotationPoint(5.4F, -2.85F, 0.68F);
		gunModel[6].rotateAngleX = -0.19198622F;

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.5F, -0.4F, -0.1F, -0.5F, -0.4F, -0.1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F); // Box 26
		gunModel[7].setRotationPoint(1.95F, -2.9F, -0.55F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.5F, -0.5F, -0.4F, -0.5F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F); // Box 27
		gunModel[8].setRotationPoint(1.55F, -3.05F, -0.65F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.5F, -0.5F, -0.4F); // Box 28
		gunModel[9].setRotationPoint(1.55F, -2.95F, -0.35F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.1F, 0.2F, -0.2F, -0.1F, 0.2F, -0.2F, -0.1F, 0.2F, -0.2F, -0.1F, 0.2F, -0.2F, -0.1F, 0.2F, -0.2F, -0.1F, 0.2F, -0.2F, -0.1F, 0.2F, -0.2F, -0.1F, 0.2F, -0.2F); // Box 37
		gunModel[10].setRotationPoint(-1.1F, -1.8F, -0.5F);
		gunModel[10].rotateAngleZ = -0.20943951F;

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F); // Box 39
		gunModel[11].setRotationPoint(-1.57F, -1.2F, -0.5F);
		gunModel[11].rotateAngleZ = 0.27925268F;

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F); // Box 40
		gunModel[12].setRotationPoint(-1.5F, -1.55F, -0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 41
		gunModel[13].setRotationPoint(-1.05F, -1.4F, -0.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 43
		gunModel[14].setRotationPoint(-0.7F, -1.4F, -0.5F);
		gunModel[14].rotateAngleZ = -0.75049158F;

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F); // Box 44
		gunModel[15].setRotationPoint(-0.75F, -1.4F, -0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F); // Box 45
		gunModel[16].setRotationPoint(0.33F, -1.45F, -0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.05F, -0.35F, -0.25F, 0.1F, -0.35F, -0.25F, 0.1F, -0.35F, -0.25F, 0.05F, -0.35F, -0.25F, 0.12F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, 0.12F, -0.35F, -0.25F); // Box 49
		gunModel[17].setRotationPoint(-5.62F, -0.55F, -0.5F);
		gunModel[17].rotateAngleZ = 0.27925268F;

		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.45F, -0.3F, 0.1F, -0.45F, -0.3F, 0.1F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0.1F, -0.45F, -0.3F, 0.1F, -0.45F, -0.3F, 0F, -0.45F, -0.3F); // Box 6
		gunModel[18].setRotationPoint(5F, -2.13F, -0.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.43F, -0.3F, 0.1F, -0.43F, -0.3F, 0.1F, -0.43F, -0.3F, 0F, -0.43F, -0.3F, 0F, -0.43F, -0.4F, 0.1F, -0.43F, -0.4F, 0.1F, -0.43F, -0.4F, 0F, -0.43F, -0.4F); // Box 7
		gunModel[19].setRotationPoint(5.5F, -2.01F, -0.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F); // Box 14
		gunModel[20].setRotationPoint(5.4F, -2.3F, -0.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.4F, -0.48F, -0.45F, -0.4F, -0.48F, -0.45F, -0.4F, -0.48F, -0.45F, -0.4F, -0.48F, -0.45F, -0.4F, -0.48F, -0.45F, -0.4F, -0.48F, -0.45F, -0.4F, -0.48F, -0.45F, -0.4F, -0.48F); // Box 15
		gunModel[21].setRotationPoint(5.42F, -2.92F, -0.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F); // Box 16
		gunModel[22].setRotationPoint(0.12F, -1.4F, -0.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.45F, -0.3F, -0.1F, -0.45F, -0.3F, -0.1F, -0.45F, -0.3F, -0.1F, -0.45F, -0.3F, -0.1F, -0.45F, -0.3F, -0.1F, -0.45F, -0.3F, -0.1F, -0.45F, -0.3F, -0.1F, -0.45F, -0.3F); // Box 17
		gunModel[23].setRotationPoint(-0.3F, -1.05F, -0.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.3F, -0.35F, -0.4F, -0.3F, -0.35F, -0.4F, -0.3F, -0.35F, -0.4F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F, -0.4F, -0.3F, -0.35F, -0.4F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F); // Box 18
		gunModel[24].setRotationPoint(-0.5F, -1.55F, -0.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F); // Box 19
		gunModel[25].setRotationPoint(-0.57F, -1.13F, -0.5F);
		gunModel[25].rotateAngleZ = 0.2268928F;

		gunModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.3F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0.3F, -0.4F, -0.15F, 0.3F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0.3F, -0.4F, -0.15F); // Box 1
		gunModel[26].setRotationPoint(-1.2F, -2.3F, -0.45F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, -0.4F, -0.15F, 0.3F, -0.4F, -0.15F, 0.3F, -0.4F, -0.15F, 0.1F, -0.4F, -0.15F, 0.1F, -0.4F, -0.15F, 0.1F, -0.4F, -0.15F, 0.1F, -0.4F, -0.15F, 0.1F, -0.4F, -0.15F); // Box 2
		gunModel[27].setRotationPoint(-1.4F, -2.3F, -0.55F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0.4F, -0.2F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0.4F, -0.2F, -0.4F); // Box 4
		gunModel[28].setRotationPoint(-0.05F, -2.3F, -0.8F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.5F, -0.4F, -0.1F, -0.5F, -0.4F, -0.1F, -0.5F, -0.4F, -0.1F, -0.5F, -0.4F, -0.1F, -0.25F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.25F, -0.4F); // Box 5
		gunModel[29].setRotationPoint(-0.7F, -2.2F, -0.8F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.47F, -0.4F, -0.35F, -0.48F, -0.4F, -0.35F, -0.48F, -0.4F, -0.35F, -0.48F, -0.4F, -0.35F, -0.48F, -0.4F, -0.35F, -0.48F, -0.4F, -0.35F, -0.48F, -0.4F, -0.35F, -0.48F, -0.4F); // Box 6
		gunModel[30].setRotationPoint(0.23F, -2.13F, -0.9F);
		gunModel[30].rotateAngleZ = 0.13962634F;

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.47F, -0.4F, -0.35F, -0.48F, -0.4F, -0.35F, -0.48F, -0.4F, -0.35F, -0.48F, -0.4F, -0.35F, -0.48F, -0.4F, -0.35F, -0.48F, -0.4F, -0.35F, -0.48F, -0.4F, -0.35F, -0.48F, -0.4F); // Box 7
		gunModel[31].setRotationPoint(0.2F, -2.38F, -0.9F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.45F, -0.5F, -0.35F, -0.5F, -0.45F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.45F, -0.45F, -0.35F); // Box 8
		gunModel[32].setRotationPoint(-1.2F, -2.1F, -0.75F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.45F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.45F, -0.3F, -0.1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F); // Box 10
		gunModel[33].setRotationPoint(2.05F, -2.9F, -0.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.43F, -0.43F, -0.2F, -0.43F, -0.43F, -0.2F, -0.43F, -0.43F, -0.2F, -0.43F, -0.43F, -0.2F, -0.43F, -0.43F, -0.2F, -0.43F, -0.43F, -0.2F, -0.43F, -0.43F, -0.2F, -0.43F, -0.43F, -0.2F); // Box 11
		gunModel[34].setRotationPoint(1.75F, -2.95F, -0.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.44F, -0.2F, -0.1F, -0.44F, -0.2F, -0.1F, -0.44F, -0.2F, 0F, -0.44F, -0.2F, -0.1F, -0.44F, -0.2F, -0.2F, -0.44F, -0.2F, -0.2F, -0.44F, -0.2F, -0.1F, -0.44F, -0.2F); // Box 64
		gunModel[35].setRotationPoint(-1.38F, -0.05F, -0.5F);
		gunModel[35].rotateAngleZ = -0.20943951F;

		gunModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.5F, -0.4F, -0.2F, -0.5F, -0.4F, -0.2F, 0.1F, -0.4F, -0.2F, 0.1F, -0.4F, -0.2F, -0.5F, -0.4F, -0.2F); // Box 65
		gunModel[36].setRotationPoint(-1.55F, -0.25F, -0.5F);
		gunModel[36].rotateAngleZ = -0.20943951F;

		gunModel[37].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, -0.1F, -0.4F, -0.4F, 0.3F, -0.4F, -0.4F, 0.3F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0.3F, -0.4F, -0.4F, 0.3F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 66
		gunModel[37].setRotationPoint(-1.42F, -2.62F, -0.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.2F, -0.35F, -0.25F, 0.1F, -0.35F, -0.25F, 0.1F, -0.35F, -0.25F, -0.2F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, 0.1F, -0.35F, -0.25F, 0.1F, -0.35F, -0.25F, 0F, -0.35F, -0.25F); // Box 77
		gunModel[38].setRotationPoint(-5.65F, -2.05F, -0.5F);
		gunModel[38].rotateAngleZ = 0.05235988F;

		gunModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, -0.2F); // Box 78
		gunModel[39].setRotationPoint(-2.3F, -1.88F, -0.5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, -0.35F, -0.25F, -0.25F, -0.35F, -0.25F, -0.25F, -0.35F, -0.25F, -0.25F, -0.35F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F); // Box 80
		gunModel[40].setRotationPoint(-5.9F, -2.05F, -0.5F);
		gunModel[40].rotateAngleZ = 0.05235988F;

		gunModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.05F, -0.15F, 0.1F, -0.05F, -0.2F, 0.1F, -0.05F, -0.2F, 0F, -0.05F, -0.15F, 0F, 0F, -0.15F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0F, 0F, -0.15F); // Box 64
		gunModel[41].setRotationPoint(2.1F, -2.2F, -0.5F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.3F, -0.07F, -0.2F, -0.2F, -0.07F, -0.2F, -0.2F, -0.07F, -0.2F, -0.3F, -0.07F, -0.2F, 0F, -0.15F, -0.2F, -0.3F, -0.15F, -0.2F, -0.3F, -0.15F, -0.2F, 0F, -0.15F, -0.2F); // Box 66
		gunModel[42].setRotationPoint(1.9F, -2.2F, -0.5F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.2F, -0.35F, -0.35F, -0.15F, -0.35F, -0.35F, -0.15F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.25F, -0.2F, -0.35F, -0.25F, -0.2F, -0.35F, -0.25F, -0.2F, -0.35F, -0.25F); // Box 67
		gunModel[43].setRotationPoint(1.9F, -2.75F, -0.5F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.05F, -0.3F, 0F, -0.05F, -0.3F, 0F, -0.05F, -0.3F, 0F, -0.05F, -0.3F, 0F, -0.05F, -0.35F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.35F, -0.3F); // Box 73
		gunModel[44].setRotationPoint(4.7F, -0.9F, -0.5F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F); // Box 75
		gunModel[45].setRotationPoint(6F, -2.13F, -0.5F);


		ammoModel = new ModelRendererTurbo[6];
		ammoModel[0] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 68
		ammoModel[1] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 69
		ammoModel[2] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 70
		ammoModel[3] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 71
		ammoModel[4] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 72
		ammoModel[5] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 74

		ammoModel[0].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.35F, -0.05F, 0F, -0.35F, -0.05F, 0F, -0.35F, -0.05F, 0F, -0.35F, -0.05F, 0F, -0.35F, -0.05F, 0F, -0.35F, -0.05F, 0F, -0.35F, -0.05F, 0F, -0.35F, -0.05F); // Box 68
		ammoModel[0].setRotationPoint(1.2F, -1.25F, -0.5F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.05F, 0F, -0.35F, -0.05F, 0F, -0.35F, -0.05F, 0F, -0.35F, -0.05F); // Box 69
		ammoModel[1].setRotationPoint(1.2F, -1.55F, -0.5F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.35F, -0.05F, 0F, -0.35F, -0.05F, 0F, -0.35F, -0.05F, 0F, -0.35F, -0.05F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 70
		ammoModel[2].setRotationPoint(1.2F, -0.95F, -0.5F);

		ammoModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.05F, -0.35F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.35F, -0.3F, -0.05F, -0.3F, 0F, -0.05F, -0.3F, 0F, -0.05F, -0.3F, 0F, -0.05F, -0.3F, 0F); // Box 71
		ammoModel[3].setRotationPoint(4.7F, -1.6F, -0.5F);

		ammoModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.05F, -0.35F, 0F, -0.05F, -0.35F, 0F, -0.05F, -0.35F, 0F, -0.05F, -0.35F, 0F, -0.05F, -0.35F, 0F, -0.05F, -0.35F, 0F, -0.05F, -0.35F, 0F, -0.05F, -0.35F, 0F); // Box 72
		ammoModel[4].setRotationPoint(4.7F, -1.25F, -0.5F);

		ammoModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.15F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.15F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F); // Box 74
		ammoModel[5].setRotationPoint(0.8F, -1.25F, -0.5F);


		slideModel = new ModelRendererTurbo[1];
		slideModel[0] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 52

		slideModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F); // Box 52
		slideModel[0].setRotationPoint(0.65F, -2.3F, -1F);
		slideModel[0].rotateAngleY = 0.17453293F;



		translateAll(0F, -0.7F, 0F);
		gunSlideDistance = 0.05F;
		animationType = EnumAnimationType.P90;


		flipAll();
	}
}