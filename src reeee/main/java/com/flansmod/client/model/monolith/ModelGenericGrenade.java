//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelGenericGrenade extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelGenericGrenade()
	{
		genericgrenadeModel = new ModelRendererTurbo[14];
		genericgrenadeModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		genericgrenadeModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 1
		genericgrenadeModel[2] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 2
		genericgrenadeModel[3] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 3
		genericgrenadeModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 4
		genericgrenadeModel[5] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 5
		genericgrenadeModel[6] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 6
		genericgrenadeModel[7] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 7
		genericgrenadeModel[8] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 8
		genericgrenadeModel[9] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 9
		genericgrenadeModel[10] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 10
		genericgrenadeModel[11] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 11
		genericgrenadeModel[12] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 12
		genericgrenadeModel[13] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 13

		genericgrenadeModel[0].addShapeBox(0F, 0F, 0F, 13, 7, 13, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		genericgrenadeModel[0].setRotationPoint(0F, -2F, 0F);

		genericgrenadeModel[1].addBox(0F, 0F, 0F, 13, 8, 13, 0F); // Box 1
		genericgrenadeModel[1].setRotationPoint(0F, 5F, 0F);

		genericgrenadeModel[2].addShapeBox(0F, 0F, 0F, 13, 7, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Box 2
		genericgrenadeModel[2].setRotationPoint(0F, 13F, 0F);

		genericgrenadeModel[3].addShapeBox(0F, 0F, 0F, 8, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 3
		genericgrenadeModel[3].setRotationPoint(2.5F, 20F, 2.5F);

		genericgrenadeModel[4].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 4
		genericgrenadeModel[4].setRotationPoint(3.5F, 24F, 3.5F);

		genericgrenadeModel[5].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 5
		genericgrenadeModel[5].setRotationPoint(3.5F, 25F, 3.5F);

		genericgrenadeModel[6].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 6
		genericgrenadeModel[6].setRotationPoint(1.5F, 29F, 3.5F);

		genericgrenadeModel[7].addShapeBox(0F, 0F, 0F, 4, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 7
		genericgrenadeModel[7].setRotationPoint(9.5F, 25F, 3.5F);

		genericgrenadeModel[8].addShapeBox(0F, 0F, 0F, 6, 12, 6, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 8
		genericgrenadeModel[8].setRotationPoint(11.5F, 13F, 3.5F);

		genericgrenadeModel[9].addBox(0F, 0F, 0F, 2, 9, 6, 0F); // Box 9
		genericgrenadeModel[9].setRotationPoint(15.5F, 4F, 3.5F);

		genericgrenadeModel[10].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 10
		genericgrenadeModel[10].setRotationPoint(4.5F, 33F, 2.5F);

		genericgrenadeModel[11].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		genericgrenadeModel[11].setRotationPoint(4.5F, 27F, 2.5F);

		genericgrenadeModel[12].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 12
		genericgrenadeModel[12].setRotationPoint(4.5F, 28F, 2.5F);

		genericgrenadeModel[13].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 13
		genericgrenadeModel[13].setRotationPoint(10.5F, 28F, 2.5F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 14; i++)
		{
			genericgrenadeModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo genericgrenadeModel[];
}