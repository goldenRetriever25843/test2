//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class MausTrap extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public MausTrap()
	{
		maustrapModel = new ModelRendererTurbo[9];
		maustrapModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		maustrapModel[1] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 1
		maustrapModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		maustrapModel[3] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 3
		maustrapModel[4] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 4
		maustrapModel[5] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 5
		maustrapModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 6
		maustrapModel[7] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 7
		maustrapModel[8] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 8

		maustrapModel[0].addBox(0F, 0F, 0F, 64, 8, 128, 0F); // Box 0
		maustrapModel[0].setRotationPoint(-32F, 25F, -32F);

		maustrapModel[1].addBox(0F, 0F, 0F, 60, 6, 6, 0F); // Box 1
		maustrapModel[1].setRotationPoint(-30F, 33F, 30F);

		maustrapModel[2].addBox(0F, 0F, 0F, 2, 2, 54, 0F); // Box 2
		maustrapModel[2].setRotationPoint(-29F, 35F, 32F);

		maustrapModel[3].addBox(0F, 0F, 0F, 2, 2, 54, 0F); // Box 3
		maustrapModel[3].setRotationPoint(27F, 35F, 32F);

		maustrapModel[4].addBox(0F, 0F, 0F, 58, 2, 2, 0F); // Box 4
		maustrapModel[4].setRotationPoint(-29F, 35F, 86F);

		maustrapModel[5].addBox(0F, 0F, 0F, 2, 2, 70, 0F); // Box 5
		maustrapModel[5].setRotationPoint(-1F, 40F, 20F);

		maustrapModel[6].addShapeBox(0F, 0F, 0F, 2, 2, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F); // Box 6
		maustrapModel[6].setRotationPoint(-1F, 34F, 6F);

		maustrapModel[7].addBox(0F, 0F, 0F, 20, 4, 20, 0F); // Box 7
		maustrapModel[7].setRotationPoint(-10F, 33F, -12F);

		maustrapModel[8].addShapeBox(0F, 0F, 0F, 26, 17, 26, 0F, 0F, 0F, 0F, 3F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, -6F, -3F, 0F, -3F, -4F, -3F, 3F, -6F, 0F, -7F, -4F, 0F, -11F); // Box 8
		maustrapModel[8].setRotationPoint(-13F, 37F, -13F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 9; i++)
		{
			maustrapModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo maustrapModel[];
}