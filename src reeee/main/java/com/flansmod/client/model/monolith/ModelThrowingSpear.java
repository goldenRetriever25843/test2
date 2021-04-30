//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ThrowingSpear
// Model Creator:
// Created on:02.07.2016 - 15:45:07
// Last changed on: 02.07.2016 - 15:45:07

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelThrowingSpear extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelThrowingSpear()
	{
		throwingspearModel = new ModelRendererTurbo[3];
		throwingspearModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		throwingspearModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 1
		throwingspearModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2

		throwingspearModel[0].addShapeBox(0F, 0F, 0F, 1, 30, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 0
		throwingspearModel[0].setRotationPoint(-0.5F, -17F, -0.5F);

		throwingspearModel[1].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		throwingspearModel[1].setRotationPoint(-0.5F, 13F, -0.5F);

		throwingspearModel[2].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 2
		throwingspearModel[2].setRotationPoint(-0.5F, 15F, -0.5F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 3; i++)
		{
			throwingspearModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo throwingspearModel[];
}