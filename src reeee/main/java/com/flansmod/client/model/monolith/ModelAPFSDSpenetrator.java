//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: APFSDS
// Model Creator:
// Created on:08.07.2018 - 22:31:20
// Last changed on: 08.07.2018 - 22:31:20

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelAPFSDSpenetrator extends ModelBase
{
	int textureX = 32;
	int textureY = 32;

	public ModelAPFSDSpenetrator()
	{
		apfsdspenetratorModel = new ModelRendererTurbo[7];
		apfsdspenetratorModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		apfsdspenetratorModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 3
		apfsdspenetratorModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 5
		apfsdspenetratorModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 6
		apfsdspenetratorModel[4] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 7
		apfsdspenetratorModel[5] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 8
		apfsdspenetratorModel[6] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 9

		apfsdspenetratorModel[0].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, -3F, -0.4F, -0.5F, -3F, -0.4F, 0F, 0F, -0.4F); // Box 1
		apfsdspenetratorModel[0].setRotationPoint(0.05F, -8F, -0.5F);

		apfsdspenetratorModel[1].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, -3F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, -3F, -0.4F); // Box 3
		apfsdspenetratorModel[1].setRotationPoint(-2.05F, -8F, -0.5F);

		apfsdspenetratorModel[2].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -3F, -0.5F, -0.4F, -3F, -0.5F); // Box 5
		apfsdspenetratorModel[2].setRotationPoint(-0.5F, -8F, 0.05F);

		apfsdspenetratorModel[3].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -3F, -0.5F, -0.4F, -3F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 6
		apfsdspenetratorModel[3].setRotationPoint(-0.5F, -8F, -2.05F);

		apfsdspenetratorModel[4].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 7
		apfsdspenetratorModel[4].setRotationPoint(-0.5F, -7.5F, -0.5F);

		apfsdspenetratorModel[5].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 8
		apfsdspenetratorModel[5].setRotationPoint(-0.5F, -3.5F, -0.5F);

		apfsdspenetratorModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 9
		apfsdspenetratorModel[6].setRotationPoint(-0.5F, 4.5F, -0.5F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 7; i++)
		{
			apfsdspenetratorModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo apfsdspenetratorModel[];
}