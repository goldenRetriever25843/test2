//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:-
// Last changed on: -

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelTestBullet extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelTestBullet()
	{
		testbulletModel = new ModelRendererTurbo[1];
		testbulletModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0

		testbulletModel[0].addShapeBox(0F, 0F, 0F, 20, 40, 20, 0F, -3F, -3F, -3F, -3F, -3F, -3F, -3F, -3F, -3F, -3F, -3F, -3F, -3F, -3F, -3F, -3F, -3F, -3F, -3F, -3F, -3F, -3F, -3F, -3F); // Box 0
		testbulletModel[0].setRotationPoint(-10F, -20F, -10F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 1; i++)
		{
			testbulletModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo testbulletModel[];
}