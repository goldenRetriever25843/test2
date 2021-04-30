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

public class ModelArisaka99 extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelArisaka99()
	{
		gunModel = new ModelRendererTurbo[33];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 5
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 6
		gunModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 7
		gunModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 8
		gunModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 9
		gunModel[5] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 10
		gunModel[6] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 11
		gunModel[7] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 12
		gunModel[8] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 12
		gunModel[9] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 12
		gunModel[10] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 12
		gunModel[11] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 12
		gunModel[12] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 12
		gunModel[13] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 12
		gunModel[14] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 12
		gunModel[15] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 12
		gunModel[16] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 12
		gunModel[17] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 12
		gunModel[18] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 12
		gunModel[19] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 24
		gunModel[20] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 25
		gunModel[21] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 26
		gunModel[22] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 12
		gunModel[23] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 12
		gunModel[24] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 12
		gunModel[25] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 12
		gunModel[26] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 12
		gunModel[27] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 12
		gunModel[28] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 12
		gunModel[29] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 12
		gunModel[30] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 12
		gunModel[31] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 12
		gunModel[32] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 12

		gunModel[0].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, -0.2F, 1.2F, 0F, -0.2F, 1.2F, 0F, 0F, 0F, 0F, 0F, 1.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, 0F, 1.2F, 0F); // Box 5
		gunModel[0].setRotationPoint(-5.5F, -3.5F, -1F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,-2.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.2F, 0F, 0F, -2.2F, 1F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, -2.2F, 1F, 0F); // Box 6
		gunModel[1].setRotationPoint(-9.5F, -3.5F, -1F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F,0F, 0F, 0.5F, -2.2F, 0F, 0F, -2.2F, 0F, 0F, 0F, 0F, 0.5F, -0.6F, 4.2F, 0.5F, -2.2F, 1F, 0F, -2.2F, 1F, 0F, -0.6F, 4.2F, 0.5F); // Box 7
		gunModel[2].setRotationPoint(-18.1F, -3.5F, -1F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F); // Box 8
		gunModel[3].setRotationPoint(-1.7F, -4.5F, -1F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.3F, 0.2F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0.3F, 0F, 0F); // Box 9
		gunModel[4].setRotationPoint(6.3F, -4.5F, -1F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,-0.4F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, -0.2F, 0F, 0.3F, -0.8F, 0F, 0.3F, -0.8F, 0F, -0.4F, -0.2F, 0F); // Box 10
		gunModel[5].setRotationPoint(6.5F, -4.5F, -1F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 19, 2, 2, 0F,0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.8F, 0F, 0.5F, -0.8F, 0F, 0.5F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 11
		gunModel[6].setRotationPoint(17.5F, -4.5F, -1F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Box 12
		gunModel[7].setRotationPoint(0.8F, -3F, -1F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Box 12
		gunModel[8].setRotationPoint(-2F, -3F, -1F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.4F, 0.8F, -0.2F, -0.4F, 1F, -0.2F, -0.4F, 1F, -0.2F, -0.4F, 0.8F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, -0.5F, -0.2F); // Box 12
		gunModel[9].setRotationPoint(-0.6F, -0.4F, -1F);
		gunModel[9].rotateAngleZ = 1.57079633F;

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.4F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.6F); // Box 12
		gunModel[10].setRotationPoint(-1F, -3.3F, -1F);
		gunModel[10].rotateAngleZ = -0.19198622F;

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, -0.7F, 0.1F, 0.5F, -0.7F, 0.1F, 0.5F, -0.7F, 0.1F, 0F, -0.7F, 0.1F); // Box 12
		gunModel[11].setRotationPoint(36.7F, -4.5F, -1F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 12
		gunModel[12].setRotationPoint(37.7F, -4.4F, -0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, -0.7F, 0.1F, 0.5F, -0.7F, 0.1F, 0.5F, -0.7F, 0.1F, 0F, -0.7F, 0.1F); // Box 12
		gunModel[13].setRotationPoint(36.7F, -5.3F, -1F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.1F, -0.1F, 0.5F, -0.1F, -0.1F, 0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0.5F, -0.1F, -0.1F, 0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 12
		gunModel[14].setRotationPoint(37.7F, -5.3F, -0.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, 0.5F, -0.1F, -0.1F, 0.5F, -0.1F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.1F, -0.1F, 0.5F, -0.1F, -0.1F, 0F, -0.2F, -0.2F); // Box 12
		gunModel[15].setRotationPoint(42.2F, -5.3F, -0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F); // Box 12
		gunModel[16].setRotationPoint(41.1F, -6.1F, -0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, -0.7F, 0.1F, 0F, -0.7F, 0.1F, 0F, -0.7F, 0.1F, 0F, -0.7F, 0.1F); // Box 12
		gunModel[17].setRotationPoint(19.7F, -4.5F, -1F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, -0.7F, 0.1F, 0F, -0.7F, 0.1F, 0F, -0.7F, 0.1F, 0F, -0.7F, 0.1F); // Box 12
		gunModel[18].setRotationPoint(19.7F, -5.3F, -1F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 16, 1, 2, 0F,0.5F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0.5F, -0.8F, 0F); // Box 24
		gunModel[19].setRotationPoint(21F, -5.2F, -1F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 25
		gunModel[20].setRotationPoint(15F, -5.29F, -1F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 26
		gunModel[21].setRotationPoint(14.3F, -5.29F, -1F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.1F, 0.1F, 0.4F, 0.1F, 0.1F, 0.4F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0.4F, 0.1F, 0.1F, 0.4F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 12
		gunModel[22].setRotationPoint(0.3F, -5.8F, -0.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F); // Box 12
		gunModel[23].setRotationPoint(-3F, -5.8F, -0.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F); // Box 12
		gunModel[24].setRotationPoint(-2.7F, -5.7F, -0.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.1F, 0.1F, 0.8F, 0.1F, 0.1F, 0.8F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0.8F, 0.1F, 0.1F, 0.8F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 12
		gunModel[25].setRotationPoint(6.1F, -5.8F, -0.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.05F, 0.05F, 0.8F, 0.05F, 0.05F, 0.8F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0.8F, 0.05F, 0.05F, 0.8F, 0.05F, 0.05F, 0F, 0.05F, 0.05F); // Box 12
		gunModel[26].setRotationPoint(6.9F, -5.8F, -0.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.05F, 0.05F, -0.2F, -0.05F, -0.05F, -0.2F, -0.05F, -0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, -0.2F, -0.05F, -0.05F, -0.2F, -0.05F, -0.05F, 0F, 0.05F, 0.05F); // Box 12
		gunModel[27].setRotationPoint(9.7F, -5.8F, -0.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0.05F, 0.05F, 0.8F, 0.05F, 0.05F, 0.8F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0.8F, 0.05F, 0.05F, 0.8F, 0.05F, 0.05F, 0F, 0.05F, 0.05F); // Box 12
		gunModel[28].setRotationPoint(10.5F, -5.7F, -0.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0.05F, -0.1F, 0.8F, 0.05F, -0.1F, 0.8F, 0.05F, -0.1F, 0F, 0.05F, -0.1F, 0F, 0.05F, -0.1F, 0.8F, 0.05F, -0.1F, 0.8F, 0.05F, -0.1F, 0F, 0.05F, -0.1F); // Box 12
		gunModel[29].setRotationPoint(11F, -5.9F, -0.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.05F, -0.8F, 0F, 0.05F, -0.8F, 0F, 0.05F, -0.1F, 0F, 0.05F, -0.1F, 0F, 0.05F, -0.8F, 0F, 0.05F, -0.8F, 0F, 0.05F, -0.1F, 0F, 0.05F, -0.1F); // Box 12
		gunModel[30].setRotationPoint(11F, -6.2F, -0.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.05F, -0.8F, 0F, 0.05F, -0.8F, 0F, 0.05F, -0.1F, 0F, 0.05F, -0.1F, 0F, 0.05F, -0.8F, 0F, 0.05F, -0.8F, 0F, 0.05F, -0.1F, 0F, 0.05F, -0.1F); // Box 12
		gunModel[31].setRotationPoint(11F, -6.2F, -1.2F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F); // Box 12
		gunModel[32].setRotationPoint(37.1F, -4.1F, -0.5F);


		defaultScopeModel = new ModelRendererTurbo[7];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 51
		defaultScopeModel[1] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 52
		defaultScopeModel[2] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 53
		defaultScopeModel[3] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 54
		defaultScopeModel[4] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 55
		defaultScopeModel[5] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 56
		defaultScopeModel[6] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 57

		defaultScopeModel[0].addShapeBox(0F, 0F, -0.4F, 4, 1, 2, 0F,0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F); // Box 51
		defaultScopeModel[0].setRotationPoint(3.3F, -5.5F, 0.5F);
		defaultScopeModel[0].rotateAngleX = 0.26179939F;

		defaultScopeModel[1].addShapeBox(0F, -0.8F, 0.6F, 4, 1, 1, 0F,0F, 0F, -0.8F, 0.4F, 0F, -0.8F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0.4F, 0F, -0.8F, 0.4F, 0F, 0F, 0F, 0F, 0F); // Box 52
		defaultScopeModel[1].setRotationPoint(3.3F, -5.5F, 0.5F);
		defaultScopeModel[1].rotateAngleX = 0.26179939F;

		defaultScopeModel[2].addShapeBox(0F, 0F, 0.6F, 5, 1, 1, 0F,0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F); // Box 53
		defaultScopeModel[2].setRotationPoint(2.3F, -7.3F, 0.3F);
		defaultScopeModel[2].rotateAngleX = 0.26179939F;

		defaultScopeModel[3].addShapeBox(0F, 0F, 0.6F, 6, 1, 1, 0F,0F, 0.2F, 0.2F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0.2F, 0.2F); // Box 54
		defaultScopeModel[3].setRotationPoint(-3.7F, -7.3F, 0.3F);
		defaultScopeModel[3].rotateAngleX = 0.26179939F;

		defaultScopeModel[4].addShapeBox(0F, 0F, 0.6F, 1, 1, 1, 0F,0F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 55
		defaultScopeModel[4].setRotationPoint(-4.7F, -7.3F, 0.3F);
		defaultScopeModel[4].rotateAngleX = 0.26179939F;

		defaultScopeModel[5].addShapeBox(0F, 0F, 0.6F, 1, 1, 1, 0F,0F, 0.6F, 0.6F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F, 0F, 0.6F, 0.6F); // Box 56
		defaultScopeModel[5].setRotationPoint(-5.7F, -7.3F, 0.3F);
		defaultScopeModel[5].rotateAngleX = 0.26179939F;

		defaultScopeModel[6].addShapeBox(0F, 0F, 0.6F, 1, 1, 1, 0F,0F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 57
		defaultScopeModel[6].setRotationPoint(7.3F, -7.3F, 0.3F);
		defaultScopeModel[6].rotateAngleX = 0.26179939F;


		ammoModel = new ModelRendererTurbo[11];
		ammoModel[0] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 40
		ammoModel[1] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 41
		ammoModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 42
		ammoModel[3] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 43
		ammoModel[4] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 44
		ammoModel[5] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 45
		ammoModel[6] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 46
		ammoModel[7] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 47
		ammoModel[8] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 48
		ammoModel[9] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 49
		ammoModel[10] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 50

		ammoModel[0].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.3F, -0.2F, -0.25F, -0.3F, -0.2F, -0.25F, -0.3F, -0.2F, -0.25F, -0.3F, -0.2F, -0.25F, -0.3F, -0.2F, -0.25F, -0.3F, -0.2F, -0.25F, -0.3F, -0.2F, -0.25F, -0.3F, -0.2F, -0.25F); // Box 40
		ammoModel[0].setRotationPoint(1.5F, -5.8F, -0.5F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 41
		ammoModel[1].setRotationPoint(1.9F, -5.8F, -0.5F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 42
		ammoModel[2].setRotationPoint(1.9F, -5.3F, -0.5F);

		ammoModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 43
		ammoModel[3].setRotationPoint(1.9F, -4.8F, -0.5F);

		ammoModel[4].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 44
		ammoModel[4].setRotationPoint(1.9F, -4.3F, -0.5F);

		ammoModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 45
		ammoModel[5].setRotationPoint(1.9F, -3.8F, -0.5F);

		ammoModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.32F, -0.32F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, -0.3F, -0.32F, -0.32F, -0.3F, -0.32F, -0.32F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, -0.3F, -0.32F, -0.32F); // Box 46
		ammoModel[6].setRotationPoint(4.3F, -3.8F, -0.5F);

		ammoModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.32F, -0.32F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, -0.3F, -0.32F, -0.32F, -0.3F, -0.32F, -0.32F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, -0.3F, -0.32F, -0.32F); // Box 47
		ammoModel[7].setRotationPoint(4.3F, -4.3F, -0.5F);

		ammoModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.32F, -0.32F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, -0.3F, -0.32F, -0.32F, -0.3F, -0.32F, -0.32F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, -0.3F, -0.32F, -0.32F); // Box 48
		ammoModel[8].setRotationPoint(4.3F, -4.8F, -0.5F);

		ammoModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.32F, -0.32F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, -0.3F, -0.32F, -0.32F, -0.3F, -0.32F, -0.32F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, -0.3F, -0.32F, -0.32F); // Box 49
		ammoModel[9].setRotationPoint(4.3F, -5.3F, -0.5F);

		ammoModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.32F, -0.32F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, -0.3F, -0.32F, -0.32F, -0.3F, -0.32F, -0.32F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, -0.3F, -0.32F, -0.32F); // Box 50
		ammoModel[10].setRotationPoint(4.3F, -5.8F, -0.5F);


		pumpModel = new ModelRendererTurbo[2];
		pumpModel[0] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 30
		pumpModel[1] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 38

		pumpModel[0].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F); // Box 30
		pumpModel[0].setRotationPoint(1.3F, -5.7F, -0.5F);

		pumpModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Box 38
		pumpModel[1].setRotationPoint(-1F, -6F, -1.5F);
		pumpModel[1].rotateAngleX = -0.17453293F;



		barrelAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		stockAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		scopeAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		gripAttachPoint = new Vector3f(0 /16F, 0F /16F, 0F /16F);

		gunSlideDistance = 0.1F;
		pumpDelayAfterReload = 65;
		pumpDelay = 11;
		pumpTime = 9;
		animationType = EnumAnimationType.RIFLE_TOP;
		
		numBulletsInReloadAnimation = 1;
		tiltGunTime = 0.25F;
		unloadClipTime = 0.0F;
		loadClipTime = 0.35F;
		untiltGunTime = 0.4F;



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}