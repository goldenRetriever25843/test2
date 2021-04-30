//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SmallBullet
// Model Creator:
// Created on:08.07.2018 - 22:17:59
// Last changed on: 08.07.2018 - 22:17:59

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSmallBullet extends ModelBase
{
	int textureX = 32;
	int textureY = 32;

	public ModelSmallBullet()
	{
		smallbulletModel = new ModelRendererTurbo[8];
		smallbulletModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportBox0
		smallbulletModel[1] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Import ImportBox7
		smallbulletModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		smallbulletModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box1
		smallbulletModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box2
		smallbulletModel[5] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Import Box3
		smallbulletModel[6] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Import Box4
		smallbulletModel[7] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Import Box5

		smallbulletModel[0].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, -0.999F, 0F, 0F, -0.999F, 0F, -0.999F, 0F, 0F, -0.999F, 0F, 0F, 0F, -0.92F, 0F, 0F, -0.95F, 0F, -0.95F, 0F, 0F, -0.92F); // Import ImportBox0
		smallbulletModel[0].setRotationPoint(0.01F, -0.01F, 0.01F);

		smallbulletModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.92F, 0F, 0F, -0.95F, 0F, -0.95F, 0F, 0F, -0.92F, 0F, -0.5F, 0F, -0.999F, -0.5F, 0F, -0.999F, -0.5F, -0.999F, 0F, -0.5F, -0.999F); // Import ImportBox7
		smallbulletModel[1].setRotationPoint(0.01F, 4.01F, 0.01F);

		smallbulletModel[2].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, -0.999F, -0.999F, 0F, -0.999F, -0.999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.92F, -0.95F, 0F, -0.95F, -0.92F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		smallbulletModel[2].setRotationPoint(0.01F, -0.01F, -1.01F);

		smallbulletModel[3].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, -0.999F, 0F, -0.999F, 0F, 0F, -0.999F, 0F, 0F, 0F, -0.999F, 0F, 0F, -0.95F, 0F, -0.95F, 0F, 0F, -0.92F, 0F, 0F, 0F, -0.92F, 0F, 0F); // Import Box1
		smallbulletModel[3].setRotationPoint(-1.01F, -0.01F, -1.01F);

		smallbulletModel[4].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, -0.999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.999F, -0.999F, 0F, -0.999F, -0.92F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.92F, -0.95F, 0F, -0.95F); // Import Box2
		smallbulletModel[4].setRotationPoint(-1.01F, -0.01F, 0.01F);

		smallbulletModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.92F, -0.95F, 0F, -0.95F, -0.92F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.999F, -0.999F, -0.5F, -0.999F, -0.999F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box3
		smallbulletModel[5].setRotationPoint(0.01F, 4.01F, -1.01F);

		smallbulletModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.95F, 0F, -0.95F, 0F, 0F, -0.92F, 0F, 0F, 0F, -0.92F, 0F, 0F, -0.999F, -0.5F, -0.999F, 0F, -0.5F, -0.999F, 0F, -0.5F, 0F, -0.999F, -0.5F, 0F); // Import Box4
		smallbulletModel[6].setRotationPoint(-1.01F, 4.01F, -1.01F);

		smallbulletModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.92F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.92F, -0.95F, 0F, -0.95F, -0.999F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.999F, -0.999F, -0.5F, -0.999F); // Import Box5
		smallbulletModel[7].setRotationPoint(-1.01F, 4.01F, 0.01F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 8; i++)
		{
			smallbulletModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo smallbulletModel[];
}