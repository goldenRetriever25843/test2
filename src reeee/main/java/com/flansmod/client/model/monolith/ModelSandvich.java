//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.2.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSandvich extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelSandvich()
	{
		sandvichModel = new ModelRendererTurbo[6];
		sandvichModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		sandvichModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		sandvichModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 2
		sandvichModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 3
		sandvichModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 4
		sandvichModel[5] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 5

		sandvichModel[0].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -3F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -3F); // Box 0
		sandvichModel[0].setRotationPoint(-3F, 0F, -2F);

		sandvichModel[1].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -3F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -3F); // Box 1
		sandvichModel[1].setRotationPoint(-3F, 1F, -2F);

		sandvichModel[2].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -3.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -3.1F); // Box 2
		sandvichModel[2].setRotationPoint(-3F, 0.5F, -2.2F);
		sandvichModel[2].rotateAngleY = 0.05235988F;
		sandvichModel[2].rotateAngleZ = 0.01745329F;

		sandvichModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 3
		sandvichModel[3].setRotationPoint(0F, -0.5F, -1F);

		sandvichModel[4].addShapeBox(0F, 0F, -1F, 1, 1, 1, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 4
		sandvichModel[4].setRotationPoint(0F, -1.2F, 0F);

		sandvichModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 5
		sandvichModel[5].setRotationPoint(0F, -1.5F, -1F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 6; i++)
		{
			sandvichModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo sandvichModel[];
}