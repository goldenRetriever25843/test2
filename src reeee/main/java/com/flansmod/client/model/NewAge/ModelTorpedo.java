//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:01.08.2017 - 13:19:27
// Last changed on: 01.08.2017 - 13:19:27

package com.flansmod.client.model.NewAge;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelTorpedo extends ModelBase
{
	int textureX = 128;
	int textureY = 128;

	public ModelTorpedo()
	{
		torpedoModel = new ModelRendererTurbo[18];
		torpedoModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		torpedoModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1
		torpedoModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 2
		torpedoModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 4
		torpedoModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 5
		torpedoModel[5] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 6
		torpedoModel[6] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 7
		torpedoModel[7] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 8
		torpedoModel[8] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 9
		torpedoModel[9] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 10
		torpedoModel[10] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 11
		torpedoModel[11] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 12
		torpedoModel[12] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 13
		torpedoModel[13] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 14
		torpedoModel[14] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 15
		torpedoModel[15] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 16
		torpedoModel[16] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 17
		torpedoModel[17] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 18

		torpedoModel[0].addBox(0F, 0F, 0F, 2, 45, 6, 0F); // Box 0
		torpedoModel[0].setRotationPoint(-1F, -16F, -3F);

		torpedoModel[1].addShapeBox(0F, 0F, 0F, 2, 45, 6, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 1
		torpedoModel[1].setRotationPoint(1F, -16F, -3F);

		torpedoModel[2].addShapeBox(0F, 0F, 0F, 2, 45, 6, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 2
		torpedoModel[2].setRotationPoint(-3F, -16F, -3F);

		torpedoModel[3].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 4
		torpedoModel[3].setRotationPoint(-1F, 29F, -3F);

		torpedoModel[4].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 5
		torpedoModel[4].setRotationPoint(1F, 29F, -3F);

		torpedoModel[5].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F); // Box 6
		torpedoModel[5].setRotationPoint(-3F, 29F, -3F);

		torpedoModel[6].addShapeBox(0F, 0F, 0F, 2, 26, 6, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 7
		torpedoModel[6].setRotationPoint(-3F, -42F, -3F);

		torpedoModel[7].addShapeBox(0F, 0F, 0F, 2, 26, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		torpedoModel[7].setRotationPoint(-1F, -42F, -3F);

		torpedoModel[8].addShapeBox(0F, 0F, 0F, 2, 26, 6, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 9
		torpedoModel[8].setRotationPoint(1F, -42F, -3F);

		torpedoModel[9].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		torpedoModel[9].setRotationPoint(-0.5F, -47F, -0.5F);

		torpedoModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		torpedoModel[10].setRotationPoint(-0.5F, -46F, -2.5F);

		torpedoModel[11].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		torpedoModel[11].setRotationPoint(-2.5F, -44F, -0.5F);

		torpedoModel[12].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F); // Box 13
		torpedoModel[12].setRotationPoint(0.5F, -40F, -0.5F);

		torpedoModel[13].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 14
		torpedoModel[13].setRotationPoint(-5.5F, -40F, -0.5F);

		torpedoModel[14].addShapeBox(0F, 0F, 0F, 1, 9, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		torpedoModel[14].setRotationPoint(-0.5F, -40F, 0.5F);

		torpedoModel[15].addShapeBox(0F, 0F, 0F, 1, 9, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F); // Box 16
		torpedoModel[15].setRotationPoint(-0.5F, -40F, -5.5F);

		torpedoModel[16].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		torpedoModel[16].setRotationPoint(-2.5F, -46F, -0.5F);

		torpedoModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		torpedoModel[17].setRotationPoint(-0.5F, -44F, -2.5F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 18; i++)
		{
			torpedoModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo torpedoModel[];
}