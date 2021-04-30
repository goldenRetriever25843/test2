//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: NATOheat
// Model Creator:
// Created on:09.07.2018 - 12:14:02
// Last changed on: 09.07.2018 - 12:14:02

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelNATOheat extends ModelBase
{
	int textureX = 32;
	int textureY = 32;

	public ModelNATOheat()
	{
		natoheatModel = new ModelRendererTurbo[12];
		natoheatModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box1
		natoheatModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Import Box3
		natoheatModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import Box5
		natoheatModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box6
		natoheatModel[4] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import Box7
		natoheatModel[5] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Import Box8
		natoheatModel[6] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 0
		natoheatModel[7] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 1
		natoheatModel[8] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 2
		natoheatModel[9] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 3
		natoheatModel[10] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 4
		natoheatModel[11] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 5

		natoheatModel[0].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, -1F, -0.4F, -0.5F, -1F, -0.4F, 0F, 0F, -0.4F); // Import Box1
		natoheatModel[0].setRotationPoint(0.05F, -9F, -0.5F);

		natoheatModel[1].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, -1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, -1F, -0.4F); // Import Box3
		natoheatModel[1].setRotationPoint(-2.05F, -9F, -0.5F);

		natoheatModel[2].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1F, -0.5F, -0.4F, -1F, -0.5F); // Import Box5
		natoheatModel[2].setRotationPoint(-0.5F, -9F, 0.05F);

		natoheatModel[3].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1F, -0.5F, -0.4F, -1F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Import Box6
		natoheatModel[3].setRotationPoint(-0.5F, -9F, -2.05F);

		natoheatModel[4].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Import Box7
		natoheatModel[4].setRotationPoint(-0.5F, -7.5F, -0.5F);

		natoheatModel[5].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Import Box8
		natoheatModel[5].setRotationPoint(-0.5F, -3.5F, -0.5F);

		natoheatModel[6].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F, -1.1F, 0F, -1.1F, -1.1F, 0F, -1.1F, -1.1F, 0F, -1.1F, -1.1F, 0F, -1.1F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 0
		natoheatModel[6].setRotationPoint(-1.5F, -0.5F, -1.5F);

		natoheatModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // Box 1
		natoheatModel[7].setRotationPoint(-1.5F, 0.75F, -1.5F);

		natoheatModel[8].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F); // Box 2
		natoheatModel[8].setRotationPoint(-1.5F, 1.5F, -1.5F);

		natoheatModel[9].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 3
		natoheatModel[9].setRotationPoint(-0.5F, 5.5F, -0.5F);

		natoheatModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 4
		natoheatModel[10].setRotationPoint(-0.5F, 8.5F, -0.5F);

		natoheatModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F); // Box 5
		natoheatModel[11].setRotationPoint(-0.5F, 5.15F, -0.5F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 12; i++)
		{
			natoheatModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo natoheatModel[];
}