//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.3.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelDetonator extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelDetonator()
	{
		detonatorModel = new ModelRendererTurbo[2];
		detonatorModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		detonatorModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1

		detonatorModel[0].addBox(0F, 0F, 0F, 2, 6, 4, 0F); // Box 0
		detonatorModel[0].setRotationPoint(-1F, -3F, -2F);

		detonatorModel[1].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 1
		detonatorModel[1].setRotationPoint(-0.5F, 2F, -0.5F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 2; i++)
		{
			detonatorModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo detonatorModel[];
}