//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: HEATFS
// Model Creator:
// Created on:08.07.2018 - 22:44:22
// Last changed on: 08.07.2018 - 22:44:22

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelHEATFS extends ModelBase
{
	int textureX = 32;
	int textureY = 32;

	public ModelHEATFS()
	{
		heatfsModel = new ModelRendererTurbo[11];
		heatfsModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		heatfsModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 1
		heatfsModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2
		heatfsModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 3
		heatfsModel[4] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 4
		heatfsModel[5] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 5
		heatfsModel[6] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 6
		heatfsModel[7] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 7
		heatfsModel[8] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 8
		heatfsModel[9] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 9
		heatfsModel[10] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 10

		heatfsModel[0].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 0
		heatfsModel[0].setRotationPoint(-0.5F, 1F, -0.5F);

		heatfsModel[1].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 1
		heatfsModel[1].setRotationPoint(-0.5F, 4.5F, -0.5F);

		heatfsModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 2
		heatfsModel[2].setRotationPoint(-0.5F, 0F, -0.5F);

		heatfsModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 3
		heatfsModel[3].setRotationPoint(-0.5F, -0.5F, -0.5F);

		heatfsModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 4
		heatfsModel[4].setRotationPoint(-0.5F, 6.5F, -0.5F);

		heatfsModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F); // Box 5
		heatfsModel[5].setRotationPoint(-0.5F, 5.9F, -0.5F);

		heatfsModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.4F, -0.2F); // Box 6
		heatfsModel[6].setRotationPoint(-0.5F, -1.8F, -0.5F);

		heatfsModel[7].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F); // Box 7
		heatfsModel[7].setRotationPoint(-2F, -2F, -0.5F);

		heatfsModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F); // Box 8
		heatfsModel[8].setRotationPoint(-0.5F, -2F, -2F);

		heatfsModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.9F, -0.3F, 0.4F, 0.05F, -0.3F, 0.25F, -3.2F, -0.3F, -1.4F, 2.3F, -0.3F, -1.6F, -0.9F, -0.3F, 0.4F, 0.05F, -0.3F, 0.25F, -3.2F, -0.3F, -1.4F, 2.3F, -0.3F, -1.6F); // Box 9
		heatfsModel[9].setRotationPoint(0.7F, -2F, -1.2F);

		heatfsModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.05F, -0.3F, 0.25F, -0.9F, -0.3F, 0.4F, 2.3F, -0.3F, -1.6F, -3.2F, -0.3F, -1.4F, 0.05F, -0.3F, 0.25F, -0.9F, -0.3F, 0.4F, 2.3F, -0.3F, -1.6F, -3.2F, -0.3F, -1.4F); // Box 10
		heatfsModel[10].setRotationPoint(-1.7F, -2F, -1.2F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 11; i++)
		{
			heatfsModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo heatfsModel[];
}