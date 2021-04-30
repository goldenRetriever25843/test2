//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.1.9
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSV98 extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelSV98()
	{
		gunModel = new ModelRendererTurbo[27];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Core
		gunModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 6
		gunModel[7] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 8
		gunModel[8] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 9
		gunModel[9] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 10
		gunModel[10] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 12
		gunModel[11] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Barrel
		gunModel[12] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 18
		gunModel[13] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 34
		gunModel[14] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 35
		gunModel[15] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 36
		gunModel[16] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 37
		gunModel[17] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 38
		gunModel[18] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 39
		gunModel[19] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 40
		gunModel[20] = new ModelRendererTurbo(this, 35, 9, textureX, textureY); // Box 41
		gunModel[21] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 42
		gunModel[22] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 43
		gunModel[23] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 44
		gunModel[24] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 46
		gunModel[25] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 47
		gunModel[26] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 48

		gunModel[0].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.4F, -0.8F, 0F, 0.4F, -0.8F, 0F, 0.4F, -0.8F, 0F, 0.4F, -0.8F, 0F); // Core
		gunModel[0].setRotationPoint(0F, -3.5F, -1F);

		gunModel[1].addBox(0F, 0F, 0F, 18, 1, 2, 0F); // Box 1
		gunModel[1].setRotationPoint(-0.6F, -3.3F, -1F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, -0.4F, -1F, -0.2F, -0.4F, -1F, -0.2F, -0.4F, 0.7F, 0F, -0.4F); // Box 2
		gunModel[2].setRotationPoint(7.4F, -2.3F, -1F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, -0.5F, 1.2F, 0F, -0.5F, 1.2F, 0F, -0.5F, -0.1F, -0.1F, -0.5F); // Box 3
		gunModel[3].setRotationPoint(-0.6F, -2.3F, -1F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.2F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, -0.2F, -0.1F, 0.1F, -0.5F, 0.3F, 0.2F, -0.5F, 0.3F, 0.2F, -0.5F, -0.1F, 0.1F, -0.5F); // Box 4
		gunModel[4].setRotationPoint(5.4F, -2.3F, -1F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0.2F, -0.8F, 1.2F, -0.5F, -0.8F, 1.2F, -0.5F, -0.8F, -0.5F, 0.2F, -0.8F); // Box 5
		gunModel[5].setRotationPoint(1.8F, -1.4F, -1F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.1F, 0.3F, -0.8F, 0.3F, -0.5F, -0.8F, 0.3F, -0.5F, -0.8F, -1.1F, 0.3F, -0.8F); // Box 6
		gunModel[6].setRotationPoint(-0.5F, -1.4F, -1F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.7F, 0.2F, -0.5F, -0.7F, 0.2F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0.2F, 0.3F, -0.8F, 0.5F, 0.2F, -0.8F, 0.5F, 0.2F, -0.8F, 0.2F, 0.3F, -0.8F); // Box 8
		gunModel[7].setRotationPoint(0.8F, -1.4F, -1F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 9
		gunModel[8].setRotationPoint(-2.6F, -3.3F, -0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, -1F, -0.1F, -0.1F); // Box 10
		gunModel[9].setRotationPoint(-2.6F, -2.3F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 12
		gunModel[10].setRotationPoint(0.4F, -4.4F, -0.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Barrel
		gunModel[11].setRotationPoint(8.4F, -4.4F, -0.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, -0.4F, -0.1F, 0.5F, -0.4F, -0.1F, 0.5F, -0.4F, -0.1F, 0F, -0.4F, -0.1F); // Box 18
		gunModel[12].setRotationPoint(0.6F, -4.8F, -0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1.8F, 0.8F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1.8F, 0.8F, 0F); // Box 34
		gunModel[13].setRotationPoint(-1.25F, -1.4F, -0.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.8F, 0.8F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0.8F, 0.8F, 0F, 0.5F, -0.8F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.8F, 0F); // Box 35
		gunModel[14].setRotationPoint(-2.25F, 1.2F, -0.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F); // Box 36
		gunModel[15].setRotationPoint(-1.25F, 0.6F, -0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F); // Box 37
		gunModel[16].setRotationPoint(-9.6F, -2.3F, -0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		gunModel[17].setRotationPoint(-9.6F, -3.3F, -0.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0.1F, 1.7F, 0F, 0.1F, 1.7F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.6F, 0F, 0.1F, 0.6F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 39
		gunModel[18].setRotationPoint(-9.4F, -3.5F, -0.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 40
		gunModel[19].setRotationPoint(-9.6F, -2.3F, -0.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 2.5F, 0F, -0.2F, 2.5F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0.5F, 0F, 2F, -0.2F, -0.2F, 2F, -0.2F, -0.2F, 0F, 0.5F, 0F); // Box 41
		gunModel[20].setRotationPoint(-5.6F, -0.3F, -0.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 42
		gunModel[21].setRotationPoint(-8.6F, -0.3F, -0.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 43
		gunModel[22].setRotationPoint(-8.6F, -1.3F, -0.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.1F, 0F, -0.2F, 0.8F, 0F, -0.2F, 0.8F, 0F, -0.2F, -0.1F, 0F, -0.2F); // Box 44
		gunModel[23].setRotationPoint(-4.9F, -1.3F, -0.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 46
		gunModel[24].setRotationPoint(-6.5F, -1.3F, -0.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.5F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0.5F, 0.4F, 0F, 0.5F, 0.4F, 0F, 0.5F, 0.4F, 0.5F, 0.5F, 0.4F); // Box 47
		gunModel[25].setRotationPoint(-10.6F, -1.3F, -0.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.8F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0.8F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0.5F, 0F, 0.4F); // Box 48
		gunModel[26].setRotationPoint(-10.6F, -3.3F, -0.5F);


		defaultBarrelModel = new ModelRendererTurbo[4];
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 14
		defaultBarrelModel[1] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 15
		defaultBarrelModel[2] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 16
		defaultBarrelModel[3] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 17

		defaultBarrelModel[0].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 14
		defaultBarrelModel[0].setRotationPoint(27.4F, -4.4F, -0.5F);

		defaultBarrelModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.1F, 0.1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.1F, 0.1F); // Box 15
		defaultBarrelModel[1].setRotationPoint(29.4F, -4.4F, -0.5F);

		defaultBarrelModel[2].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 16
		defaultBarrelModel[2].setRotationPoint(29.4F, -4.4F, -0.5F);

		defaultBarrelModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 17
		defaultBarrelModel[3].setRotationPoint(28F, -5.4F, -0.5F);


		defaultScopeModel = new ModelRendererTurbo[9];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 19
		defaultScopeModel[1] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 20
		defaultScopeModel[2] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 21
		defaultScopeModel[3] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 22
		defaultScopeModel[4] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 23
		defaultScopeModel[5] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 25
		defaultScopeModel[6] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 26
		defaultScopeModel[7] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 27
		defaultScopeModel[8] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 28

		defaultScopeModel[0].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 19
		defaultScopeModel[0].setRotationPoint(0.2F, -6.4F, -0.5F);

		defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0F, 0F); // Box 20
		defaultScopeModel[1].setRotationPoint(5.2F, -6.4F, -0.5F);

		defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F); // Box 21
		defaultScopeModel[2].setRotationPoint(8.2F, -6.4F, -0.5F);

		defaultScopeModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.6F, 0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.6F, 0.6F, 0F, 0.6F, 0.6F); // Box 22
		defaultScopeModel[3].setRotationPoint(9.2F, -6.4F, -0.5F);

		defaultScopeModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0.5F, -0.1F, -0.1F, 0.5F, -0.1F, -0.1F, 0.5F, -0.1F, -0.1F, 0.5F, -0.1F); // Box 23
		defaultScopeModel[4].setRotationPoint(2.4F, -7.4F, -0.5F);

		defaultScopeModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F); // Box 25
		defaultScopeModel[5].setRotationPoint(-2.8F, -6.4F, -0.5F);

		defaultScopeModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 26
		defaultScopeModel[6].setRotationPoint(-3.8F, -6.4F, -0.5F);

		defaultScopeModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0.5F, -0.1F, -0.1F, 0.5F, -0.1F, -0.1F, 0.5F, -0.1F, -0.1F, 0.5F, -0.1F); // Box 27
		defaultScopeModel[7].setRotationPoint(4F, -6.4F, -0.5F);

		defaultScopeModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0.5F, -0.1F, -0.1F, 0.5F, -0.1F, -0.1F, 0.5F, -0.1F, -0.1F, 0.5F, -0.1F); // Box 28
		defaultScopeModel[8].setRotationPoint(0.8F, -6.4F, -0.5F);


		defaultGripModel = new ModelRendererTurbo[5];
		defaultGripModel[0] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 29
		defaultGripModel[1] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 30
		defaultGripModel[2] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 31
		defaultGripModel[3] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 32
		defaultGripModel[4] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 33

		defaultGripModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F); // Box 29
		defaultGripModel[0].setRotationPoint(17.4F, -3F, -0.5F);

		defaultGripModel[1].addShapeBox(0F, 0F, -0.5F, 1, 8, 1, 0F,-0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F); // Box 30
		defaultGripModel[1].setRotationPoint(17.4F, -2.2F, 0F);
		defaultGripModel[1].rotateAngleX = 0.43633231F;
		defaultGripModel[1].rotateAngleZ = 0.05235988F;

		defaultGripModel[2].addShapeBox(0F, 0F, -0.5F, 1, 8, 1, 0F,-0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F); // Box 31
		defaultGripModel[2].setRotationPoint(17.4F, -2.2F, 0F);
		defaultGripModel[2].rotateAngleX = -0.43633231F;
		defaultGripModel[2].rotateAngleZ = 0.05235988F;

		defaultGripModel[3].addShapeBox(0F, 7.6F, -0.5F, 2, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 32
		defaultGripModel[3].setRotationPoint(16.9F, -2.2F, 0F);
		defaultGripModel[3].rotateAngleX = 0.43633231F;
		defaultGripModel[3].rotateAngleZ = 0.05235988F;

		defaultGripModel[4].addShapeBox(0F, 7.6F, -0.5F, 2, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 33
		defaultGripModel[4].setRotationPoint(16.9F, -2.2F, 0F);
		defaultGripModel[4].rotateAngleX = -0.43633231F;
		defaultGripModel[4].rotateAngleZ = 0.05235988F;


		pumpModel = new ModelRendererTurbo[1];
		pumpModel[0] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 49

		pumpModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 49
		pumpModel[0].setRotationPoint(4.2F, -4.2F, -1.8F);
		pumpModel[0].rotateAngleX = 0.31415927F;
		
		


		barrelAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		stockAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		scopeAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		gripAttachPoint = new Vector3f(0 /16F, 0F /16F, 0F /16F);

		gunSlideDistance = 0.1F;
		pumpDelayAfterReload = 65;
		pumpDelay = 5;
		pumpTime = 12;
		animationType = EnumAnimationType.NONE;
		


		translateAll(0F, 0F, 0F);


		flipAll();
		translateAll(4F, 3F, 0F);
	}
}