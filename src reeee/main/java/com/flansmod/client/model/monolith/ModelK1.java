//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.2.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelK1 extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelK1()
	{
		gunModel = new ModelRendererTurbo[38];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 6
		gunModel[7] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 7
		gunModel[8] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 8
		gunModel[9] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 10
		gunModel[10] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 11
		gunModel[11] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 12
		gunModel[12] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 13
		gunModel[13] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 14
		gunModel[14] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 18
		gunModel[15] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 19
		gunModel[16] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 20
		gunModel[17] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 21
		gunModel[18] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 22
		gunModel[19] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 23
		gunModel[20] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 24
		gunModel[21] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 25
		gunModel[22] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 26
		gunModel[23] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 27
		gunModel[24] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 28
		gunModel[25] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 29
		gunModel[26] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 30
		gunModel[27] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 31
		gunModel[28] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 32
		gunModel[29] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 33
		gunModel[30] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 34
		gunModel[31] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 35
		gunModel[32] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 36
		gunModel[33] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 37
		gunModel[34] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 39
		gunModel[35] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 40
		gunModel[36] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 41
		gunModel[37] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 42

		gunModel[0].addShapeBox(0F, 0F, 0F, 33, 7, 3, 0F,0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F); // Box 0
		gunModel[0].setRotationPoint(-9F, -16.2F, -1.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 33, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 1
		gunModel[1].setRotationPoint(-9F, -7F, -1.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 31, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 2
		gunModel[2].setRotationPoint(-9F, -6F, -1.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,-6F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -6F, 0F, 0F, -10F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -10F, 0.5F, 0F); // Box 3
		gunModel[3].setRotationPoint(-9F, -4F, -1.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F); // Box 4
		gunModel[4].setRotationPoint(11F, -4F, -1.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 5
		gunModel[5].setRotationPoint(9F, -4F, -1F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 9, 6, 3, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -2F, -2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -2F, -2F, -0.2F); // Box 6
		gunModel[6].setRotationPoint(-8F, -6F, -1.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 9, 14, 3, 0F,0F, 0F, -0.2F, -2F, -2F, -0.2F, -2F, -2F, -0.2F, 0F, 0F, -0.2F, 8F, -4F, -0.2F, -9F, 0F, -0.2F, -9F, 0F, -0.2F, 8F, -4F, -0.2F); // Box 7
		gunModel[7].setRotationPoint(-6F, -2F, -1.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 33, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		gunModel[8].setRotationPoint(-9F, -9F, -1.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 33, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		gunModel[9].setRotationPoint(-9F, -13F, -2F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F,0F, 0F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0F); // Box 11
		gunModel[10].setRotationPoint(19F, -13F, -2F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 25, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 12
		gunModel[11].setRotationPoint(24F, -17F, -2.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 25, 3, 5, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 13
		gunModel[12].setRotationPoint(24F, -10F, -2.5F);

		gunModel[13].addBox(0F, 0F, 0F, 7, 7, 4, 0F); // Box 14
		gunModel[13].setRotationPoint(47.5F, -16.5F, -2F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 18
		gunModel[14].setRotationPoint(53.5F, -13F, -1F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F); // Box 19
		gunModel[15].setRotationPoint(58.5F, -13F, -1F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 20
		gunModel[16].setRotationPoint(51F, -17.8F, -0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		gunModel[17].setRotationPoint(51F, -22F, 0F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 22
		gunModel[18].setRotationPoint(51F, -20F, 0F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F); // Box 23
		gunModel[19].setRotationPoint(51F, -22F, -2F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		gunModel[20].setRotationPoint(51F, -20F, -2F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 25
		gunModel[21].setRotationPoint(2.2F, 0.4F, -1F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 26
		gunModel[22].setRotationPoint(7.6F, 0.6F, -1F);
		gunModel[22].rotateAngleZ = 1.06465084F;

		gunModel[23].addShapeBox(0.2F, 0F, 0F, 2, 1, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 27
		gunModel[23].setRotationPoint(1F, -0.8F, -1F);
		gunModel[23].rotateAngleZ = -0.6981317F;

		gunModel[24].addShapeBox(0.2F, 0F, 0F, 4, 1, 2, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 28
		gunModel[24].setRotationPoint(4F, -4.8F, -1F);
		gunModel[24].rotateAngleZ = -1.57079633F;

		gunModel[25].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0.2F, -0.3F, -3F, 0.2F, -0.3F, -3F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F); // Box 29
		gunModel[25].setRotationPoint(-8.8F, -17.2F, -1.4F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F); // Box 30
		gunModel[26].setRotationPoint(-5.8F, -20.2F, -1.4F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,-1F, 0.2F, -0.3F, -2F, 0.2F, -0.3F, -2F, 0.2F, -0.3F, -1F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F); // Box 31
		gunModel[27].setRotationPoint(-5.8F, -21.6F, -1.4F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0.2F, -0.3F, -3F, 0.2F, -0.3F, -3F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F); // Box 32
		gunModel[28].setRotationPoint(-8.8F, -17.2F, 0.4F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F); // Box 33
		gunModel[29].setRotationPoint(-5.8F, -20.2F, 0.4F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,-1F, 0.2F, -0.3F, -2F, 0.2F, -0.3F, -2F, 0.2F, -0.3F, -1F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F); // Box 34
		gunModel[30].setRotationPoint(-5.8F, -21.6F, 0.4F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F); // Box 35
		gunModel[31].setRotationPoint(-5.8F, -18.2F, -1F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F); // Box 36
		gunModel[32].setRotationPoint(-3.8F, -19.6F, -1F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.55F); // Box 37
		gunModel[33].setRotationPoint(-3.8F, -21.2F, -0.8F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.55F, 0F, 1.6F, -0.2F, 0F, 0.6F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 39
		gunModel[34].setRotationPoint(-3.8F, -20.6F, -0.8F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.55F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 40
		gunModel[35].setRotationPoint(-3.8F, -21.2F, -0.2F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.55F, -0.55F, 0F, -0.55F, -0.55F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0.6F, -0.2F, 0F, 0.6F, -0.2F); // Box 41
		gunModel[36].setRotationPoint(-3.8F, -20.6F, -0.2F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0.2F, -0.45F, 0F, 0.2F, -0.45F, 0F, 0.2F, -0.45F, 0F, 0.2F, -0.45F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 42
		gunModel[37].setRotationPoint(51F, -19.9F, -0.5F);


		defaultStockModel = new ModelRendererTurbo[2];
		defaultStockModel[0] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 51
		defaultStockModel[1] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 53

		defaultStockModel[0].addShapeBox(0F, 0F, 0F, 25, 8, 2, 0F,8F, 0F, 0.5F, 5F, 0F, 0F, 5F, 0F, 0F, 8F, 0F, 0.5F, 8F, -7F, 0.5F, 5F, -7F, 0F, 5F, -7F, 0F, 8F, -7F, 0.5F); // Box 51
		defaultStockModel[0].setRotationPoint(-39F, -14F, -1F);

		defaultStockModel[1].addShapeBox(0F, 0F, 0F, 5, 9, 3, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 2F, 0F, -1.5F, 3F, 0F, -1.5F, 3F, 0F, -1.5F, 2F, 0F); // Box 53
		defaultStockModel[1].setRotationPoint(-51F, -15F, -1.5F);


		ammoModel = new ModelRendererTurbo[4];
		ammoModel[0] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 44
		ammoModel[1] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 45
		ammoModel[2] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 46
		ammoModel[3] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 47

		ammoModel[0].addBox(0F, 0F, 0F, 10, 4, 2, 0F); // Box 44
		ammoModel[0].setRotationPoint(11F, -3F, -1F);

		ammoModel[1].addBox(0F, 0F, 0F, 10, 4, 2, 0F); // Box 45
		ammoModel[1].setRotationPoint(11F, 1F, -1F);

		ammoModel[2].addBox(0F, 0F, 0F, 10, 2, 2, 0F); // Box 46
		ammoModel[2].setRotationPoint(11F, 5F, -1F);

		ammoModel[3].addShapeBox(0F, 0F, 0F, 10, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 47
		ammoModel[3].setRotationPoint(11F, 7F, -1F);


		slideModel = new ModelRendererTurbo[1];
		slideModel[0] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 43

		slideModel[0].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 43
		slideModel[0].setRotationPoint(20F, -14.5F, -5F);
		slideModel[0].rotateAngleX = -0.29670597F;



		barrelAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		stockAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		scopeAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		gripAttachPoint = new Vector3f(0 /16F, 0F /16F, 0F /16F);

		gunSlideDistance = 0.3F;
		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, -5F, 0F);


		flipAll();
	}
}