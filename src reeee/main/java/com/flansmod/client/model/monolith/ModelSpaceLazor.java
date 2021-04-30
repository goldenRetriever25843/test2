//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SpaceLazor
// Model Creator:
// Created on:09.08.2016 - 16:24:43
// Last changed on: 09.08.2016 - 16:24:43

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSpaceLazor extends ModelBase
{
	int textureX = 128;
	int textureY = 1024;

	public ModelSpaceLazor()
	{
		spacelazorModel = new ModelRendererTurbo[3];
		spacelazorModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		spacelazorModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 1
		spacelazorModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 2

		spacelazorModel[0].addBox(0F, 0F, 0F, 8, 800, 8, 0F); // Box 0
		spacelazorModel[0].setRotationPoint(-4F, 600F, -4F);

		spacelazorModel[1].addShapeBox(0F, 0F, 0F, 8, 200, 8, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		spacelazorModel[1].setRotationPoint(-4F, 400.5F, -4F);

		spacelazorModel[2].addShapeBox(0F, 0F, 0F, 8, 200, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F); // Box 2
		spacelazorModel[2].setRotationPoint(-4F, 1400.5F, -4F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 3; i++)
		{
			spacelazorModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo spacelazorModel[];
}