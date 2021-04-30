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

public class ModelQBU88 extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelQBU88()
	{
		gunModel = new ModelRendererTurbo[24];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 6
		gunModel[6] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 7
		gunModel[7] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 8
		gunModel[8] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 9
		gunModel[9] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 10
		gunModel[10] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 11
		gunModel[11] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 12
		gunModel[12] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 13
		gunModel[13] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 15
		gunModel[14] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 16
		gunModel[15] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 23
		gunModel[16] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 26
		gunModel[17] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 27
		gunModel[18] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 28
		gunModel[19] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 29
		gunModel[20] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 30
		gunModel[21] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 31
		gunModel[22] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 32
		gunModel[23] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 44

		gunModel[0].addShapeBox(0F, 0F, 0F, 27, 3, 3, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 0
		gunModel[0].setRotationPoint(-9.2F, -7.7F, -1.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, -0.2F, 2F, 0F, -0.2F, 2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.8F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.8F, -0.2F); // Box 1
		gunModel[1].setRotationPoint(-10.5F, -5.7F, -1.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		gunModel[2].setRotationPoint(-9.2F, -8.5F, -1.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 17, 3, 2, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 3
		gunModel[3].setRotationPoint(-7.5F, -10F, -1F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 21, 3, 2, 0F,0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, 1F, 0F, -0.1F, 1F, 0F, -0.1F, 1F, 0F, -0.1F, 1F); // Box 4
		gunModel[4].setRotationPoint(9.5F, -9.8F, -1F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 15, 2, 2, 0F,0.2F, -0.1F, 1F, 0.2F, -0.1F, 1F, 0.2F, -0.1F, 1F, 0.2F, -0.1F, 1F, 0.2F, -0.1F, 0.8F, 0.2F, -0.1F, 0.8F, 0.2F, -0.1F, 0.8F, 0.2F, -0.1F, 0.8F); // Box 6
		gunModel[5].setRotationPoint(18F, -7F, -1F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F,0.2F, -0.1F, 0.8F, 0.2F, -0.1F, 0.8F, 0.2F, -0.1F, 0.8F, 0.2F, -0.1F, 0.8F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0F); // Box 7
		gunModel[6].setRotationPoint(18F, -5.2F, -1F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 24, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		gunModel[7].setRotationPoint(-31.5F, -10F, -1F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 24, 1, 2, 0F,0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		gunModel[8].setRotationPoint(-31.5F, -5.7F, -1F);

		gunModel[9].addFlexTrapezoid(0F, 0F, 0F, 24, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 10
		gunModel[9].setRotationPoint(-31.5F, -5.7F, -1F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 12, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -7F, 0F, -0.4F, -7F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 11
		gunModel[10].setRotationPoint(-31.5F, -4.7F, -1F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, 0F, -0.4F, -7F, 0F, -0.4F, -7F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.3F, -0.8F, -9F, 0.3F, -0.8F, -9F, 0.3F, -0.8F, 0F, 0.3F, -0.8F); // Box 12
		gunModel[11].setRotationPoint(-31.5F, -1.7F, -1F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.2F, 0F, 0F, 0.15F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.15F); // Box 13
		gunModel[12].setRotationPoint(-25.5F, -5.2F, -0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, -0.4F, -0.1F, 1F, -0.4F, -0.1F, 1F, 0F, -0.1F, 1F); // Box 15
		gunModel[13].setRotationPoint(30.5F, -8.8F, -1F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 15, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 16
		gunModel[14].setRotationPoint(33F, -7F, -1F);

		gunModel[15].addShapeBox(0F, -3F, 0F, 8, 3, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 23
		gunModel[15].setRotationPoint(-17.5F, -2.2F, -0.5F);
		gunModel[15].rotateAngleZ = 0.12217305F;

		gunModel[16].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 26
		gunModel[16].setRotationPoint(-3.5F, -3.8F, -1F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 15, 2, 2, 0F,0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F); // Box 27
		gunModel[17].setRotationPoint(-7F, -5.5F, -1F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 28
		gunModel[18].setRotationPoint(0.2F, -0.6F, -1F);
		gunModel[18].rotateAngleZ = 0.03490659F;

		gunModel[19].addShapeBox(5F, -4F, 0F, 1, 4, 2, 0F,0F, -0.2F, -0.1F, 1F, -0.2F, -0.1F, 1F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 29
		gunModel[19].setRotationPoint(0.2F, -0.6F, -1F);
		gunModel[19].rotateAngleZ = -0.03490659F;

		gunModel[20].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 2.2F, 1F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 2.2F, 1F, 0F); // Box 30
		gunModel[20].setRotationPoint(-3.5F, 0.2F, -1F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 31
		gunModel[21].setRotationPoint(33F, -9F, -1F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 32
		gunModel[22].setRotationPoint(29.5F, -10.2F, -1F);

		gunModel[23].addShapeBox(5F, -4F, 0F, 1, 4, 1, 0F,0F, -0.2F, -0.3F, 1F, -0.2F, -0.3F, 1F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F); // Box 44
		gunModel[23].setRotationPoint(-3.2F, -1.6F, -0.5F);
		gunModel[23].rotateAngleZ = -0.03490659F;


		defaultBarrelModel = new ModelRendererTurbo[1];
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 17

		defaultBarrelModel[0].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		defaultBarrelModel[0].setRotationPoint(48F, -7F, -1F);


		defaultScopeModel = new ModelRendererTurbo[10];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 34
		defaultScopeModel[1] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 35
		defaultScopeModel[2] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 36
		defaultScopeModel[3] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 37
		defaultScopeModel[4] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 38
		defaultScopeModel[5] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 39
		defaultScopeModel[6] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 40
		defaultScopeModel[7] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 41
		defaultScopeModel[8] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 42
		defaultScopeModel[9] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 43

		defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		defaultScopeModel[0].setRotationPoint(0.5F, -11.2F, -0.5F);

		defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 35
		defaultScopeModel[1].setRotationPoint(1F, -14.2F, -0.5F);

		defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 36
		defaultScopeModel[2].setRotationPoint(-1.5F, -16.2F, -1F);

		defaultScopeModel[3].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 37
		defaultScopeModel[3].setRotationPoint(-4.5F, -16.7F, -1.5F);

		defaultScopeModel[4].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0.2F, 0.2F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0.2F, 0.2F); // Box 38
		defaultScopeModel[4].setRotationPoint(-2.5F, -16.7F, -1.5F);

		defaultScopeModel[5].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 0.4F, 0.4F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.4F, 0.4F); // Box 39
		defaultScopeModel[5].setRotationPoint(-9.5F, -16.7F, -1.5F);

		defaultScopeModel[6].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0.4F, 0.4F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.4F, 0.4F); // Box 40
		defaultScopeModel[6].setRotationPoint(-12.5F, -17.2F, -2F);

		defaultScopeModel[7].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0.2F, 0.2F, 0F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.2F, 0.2F); // Box 41
		defaultScopeModel[7].setRotationPoint(8.5F, -16.2F, -1F);

		defaultScopeModel[8].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.7F, 0.7F); // Box 42
		defaultScopeModel[8].setRotationPoint(13.5F, -16.2F, -1F);

		defaultScopeModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 43
		defaultScopeModel[9].setRotationPoint(3.8F, -17.8F, -0.5F);


		defaultGripModel = new ModelRendererTurbo[5];
		defaultGripModel[0] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 18
		defaultGripModel[1] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 19
		defaultGripModel[2] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 20
		defaultGripModel[3] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 21
		defaultGripModel[4] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 22

		defaultGripModel[0].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		defaultGripModel[0].setRotationPoint(35.5F, -7F, -1F);

		defaultGripModel[1].addShapeBox(0F, 0F, -0.5F, 1, 24, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		defaultGripModel[1].setRotationPoint(36.5F, -6F, 0F);
		defaultGripModel[1].rotateAngleX = 0.43633231F;
		defaultGripModel[1].rotateAngleZ = 0.06981317F;

		defaultGripModel[2].addShapeBox(0F, 0F, -0.5F, 1, 24, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		defaultGripModel[2].setRotationPoint(36.5F, -6F, 0F);
		defaultGripModel[2].rotateAngleX = -0.43633231F;
		defaultGripModel[2].rotateAngleZ = 0.06981317F;

		defaultGripModel[3].addShapeBox(-1F, 23F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		defaultGripModel[3].setRotationPoint(36.5F, -6F, 0F);
		defaultGripModel[3].rotateAngleX = 0.43633231F;
		defaultGripModel[3].rotateAngleZ = 0.06981317F;

		defaultGripModel[4].addShapeBox(-1F, 23F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		defaultGripModel[4].setRotationPoint(36.5F, -6F, 0F);
		defaultGripModel[4].rotateAngleX = -0.43633231F;
		defaultGripModel[4].rotateAngleZ = 0.06981317F;


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 14

		ammoModel[0].addShapeBox(0F, -3F, 0F, 6, 7, 1, 0F,0.2F, 0F, 0.15F, 0.2F, 0F, 0.15F, 0.2F, 0F, 0.15F, 0.2F, 0F, 0.15F, 0.2F, 0F, 0.15F, 0.2F, -1.5F, 0.15F, 0.2F, -1.5F, 0.15F, 0.2F, 0F, 0.15F); // Box 14
		ammoModel[0].setRotationPoint(-16.9F, -0.2F, -0.5F);


		slideModel = new ModelRendererTurbo[1];
		slideModel[0] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 45

		slideModel[0].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 45
		slideModel[0].setRotationPoint(7.8F, -9.5F, -2.5F);



		barrelAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		stockAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		scopeAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		gripAttachPoint = new Vector3f(0 /16F, 0F /16F, 0F /16F);

		gunSlideDistance = 0.5F;
		animationType = EnumAnimationType.BULLPUP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}