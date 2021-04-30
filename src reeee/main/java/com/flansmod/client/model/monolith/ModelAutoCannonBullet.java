//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: AutoCannonBullet
// Model Creator:
// Created on:-
// Last changed on: -

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelAutoCannonBullet extends ModelBase
{
	int textureX = 32;
	int textureY = 32;

	public ModelAutoCannonBullet()
	{
		autocannonbulletModel = new ModelRendererTurbo[8];
		autocannonbulletModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportBox2
		autocannonbulletModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Import ImportBox8
		autocannonbulletModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import ImportBox9
		autocannonbulletModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import ImportBox10
		autocannonbulletModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import ImportBox11
		autocannonbulletModel[5] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Import ImportBox12
		autocannonbulletModel[6] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Import ImportBox13
		autocannonbulletModel[7] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Import ImportBox14

		autocannonbulletModel[0].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -0.35F, 0F, -0.35F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import ImportBox2
		autocannonbulletModel[0].setRotationPoint(-1.03F, -3.01F, -1.03F);

		autocannonbulletModel[1].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.35F, 0F, -0.35F); // Import ImportBox8
		autocannonbulletModel[1].setRotationPoint(-1.03F, -3.01F, 0.03F);

		autocannonbulletModel[2].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.35F, 0F, -0.35F, 0F, 0F, -0.25F); // Import ImportBox9
		autocannonbulletModel[2].setRotationPoint(0.03F, -3.01F, 0.03F);

		autocannonbulletModel[3].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.35F, 0F, -0.35F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox10
		autocannonbulletModel[3].setRotationPoint(0.03F, -3.01F, -1.03F);

		autocannonbulletModel[4].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -0.25F, -0.35F, 0F, -0.35F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox11
		autocannonbulletModel[4].setRotationPoint(0.03F, 4.03F, -1.03F);

		autocannonbulletModel[5].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.35F, 0F, -0.35F, 0F, 0F, -0.25F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F); // Import ImportBox12
		autocannonbulletModel[5].setRotationPoint(0.03F, 4.03F, 0.03F);

		autocannonbulletModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.35F, 0F, -0.35F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F); // Import ImportBox13
		autocannonbulletModel[6].setRotationPoint(-1.03F, 4.03F, 0.03F);

		autocannonbulletModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.35F, 0F, -0.35F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox14
		autocannonbulletModel[7].setRotationPoint(-1.03F, 4.03F, -1.03F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 8; i++)
		{
			autocannonbulletModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo autocannonbulletModel[];
}