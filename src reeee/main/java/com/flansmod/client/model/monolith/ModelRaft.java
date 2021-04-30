//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:14.08.2016 - 15:35:41
// Last changed on: 14.08.2016 - 15:35:41

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

import org.lwjgl.opengl.GL11;

public class ModelRaft extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelRaft()
	{
		raftModel = new ModelRendererTurbo[36];
		raftModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		raftModel[1] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 1
		raftModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 2
		raftModel[3] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 3
		raftModel[4] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 4
		raftModel[5] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 5
		raftModel[6] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 6
		raftModel[7] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 7
		raftModel[8] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 8
		raftModel[9] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 9
		raftModel[10] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 10
		raftModel[11] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 11
		raftModel[12] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 12
		raftModel[13] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 13
		raftModel[14] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 14
		raftModel[15] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 15
		raftModel[16] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 16
		raftModel[17] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 17
		raftModel[18] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 18
		raftModel[19] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 20
		raftModel[20] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 21
		raftModel[21] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 22
		raftModel[22] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 24
		raftModel[23] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 25
		raftModel[24] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 26
		raftModel[25] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 27
		raftModel[26] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 28
		raftModel[27] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		raftModel[28] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 30
		raftModel[29] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 31
		raftModel[30] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 32
		raftModel[31] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 33
		raftModel[32] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 34
		raftModel[33] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 35
		raftModel[34] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 36
		raftModel[35] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 39

		raftModel[0].addShapeBox(0F, 0F, 0F, 35, 4, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 0
		raftModel[0].setRotationPoint(-6F, 0F, -8F);

		raftModel[1].addShapeBox(0F, 0F, 0F, 10, 4, 16, 0F, 0F, 0F, 0F, -1F, 0F, -8F, -1F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -8F, -1F, -4F, -8F, -1F, -4F, -8F, 0F, 0F, -8F); // Box 1
		raftModel[1].setRotationPoint(29F, 0F, -8F);

		raftModel[2].addShapeBox(0F, 0F, 0F, 35, 2, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		raftModel[2].setRotationPoint(-6F, -3F, 5F);

		raftModel[3].addShapeBox(0F, 0F, 0F, 35, 2, 5, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		raftModel[3].setRotationPoint(-6F, -4.5F, 5F);

		raftModel[4].addShapeBox(0F, 0F, 0F, 35, 2, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 4
		raftModel[4].setRotationPoint(-6F, -1.5F, 5F);

		raftModel[5].addShapeBox(0F, 0F, 0F, 35, 2, 5, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		raftModel[5].setRotationPoint(-6F, -4.5F, -10F);

		raftModel[6].addShapeBox(0F, 0F, 0F, 35, 2, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		raftModel[6].setRotationPoint(-6F, -3F, -10F);

		raftModel[7].addShapeBox(0F, 0F, 0F, 35, 2, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 7
		raftModel[7].setRotationPoint(-6F, -1.5F, -10F);

		raftModel[8].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		raftModel[8].setRotationPoint(29F, -3F, -10F);
		raftModel[8].rotateAngleY = 0.61086524F;

		raftModel[9].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		raftModel[9].setRotationPoint(29F, -4.5F, -10F);
		raftModel[9].rotateAngleY = 0.61086524F;

		raftModel[10].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 10
		raftModel[10].setRotationPoint(29F, -1.5F, -10F);
		raftModel[10].rotateAngleY = 0.61086524F;

		raftModel[11].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		raftModel[11].setRotationPoint(29F, -4.5F, -10F);
		raftModel[11].rotateAngleY = 0.61086524F;

		raftModel[12].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		raftModel[12].setRotationPoint(29F, -3F, -10F);
		raftModel[12].rotateAngleY = 0.61086524F;

		raftModel[13].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 13
		raftModel[13].setRotationPoint(29F, -1.5F, -10F);
		raftModel[13].rotateAngleY = 0.61086524F;

		raftModel[14].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		raftModel[14].setRotationPoint(26F, -4.5F, 6F);
		raftModel[14].rotateAngleY = -0.61086524F;

		raftModel[15].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		raftModel[15].setRotationPoint(26F, -3F, 6F);
		raftModel[15].rotateAngleY = -0.61086524F;

		raftModel[16].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 16
		raftModel[16].setRotationPoint(26F, -1.5F, 6F);
		raftModel[16].rotateAngleY = -0.61086524F;

		raftModel[17].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		raftModel[17].setRotationPoint(35F, -3F, -3F);

		raftModel[18].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F, 0F, -0.5F, 0F, -1.25F, -0.5F, -1F, -1.25F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		raftModel[18].setRotationPoint(35F, -4.5F, -3F);

		raftModel[19].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1.25F, -0.5F, -1F, -1.25F, -0.5F, -1F, 0F, -0.5F, 0F); // Box 20
		raftModel[19].setRotationPoint(35F, -1F, -3F);

		raftModel[20].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 21
		raftModel[20].setRotationPoint(-9F, -3F, 5F);

		raftModel[21].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F, 0F, -2F, -2F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 22
		raftModel[21].setRotationPoint(-9F, -4.5F, 5F);

		raftModel[22].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -2F, -2F); // Box 24
		raftModel[22].setRotationPoint(-9F, -1F, 5F);

		raftModel[23].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -2F, -2F); // Box 25
		raftModel[23].setRotationPoint(-9F, -1F, -10F);

		raftModel[24].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F, 0F, -2F, -2F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 26
		raftModel[24].setRotationPoint(-9F, -4.5F, -10F);

		raftModel[25].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 27
		raftModel[25].setRotationPoint(-9F, -3F, -10F);

		raftModel[26].addBox(0F, 0F, 0F, 1, 3, 12, 0F); // Box 28
		raftModel[26].setRotationPoint(-6F, -3F, -6F);

		raftModel[27].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 29
		raftModel[27].setRotationPoint(-8F, -4F, -1F);

		raftModel[28].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 30
		raftModel[28].setRotationPoint(-9F, -6F, -2F);

		raftModel[29].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 31
		raftModel[29].setRotationPoint(-9F, -7F, -2F);

		raftModel[30].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 32
		raftModel[30].setRotationPoint(-3F, -5.5F, -2F);

		raftModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 33
		raftModel[31].setRotationPoint(1F, -5.4F, -2F);

		raftModel[32].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 34
		raftModel[32].setRotationPoint(-9F, -4F, -2F);

		raftModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		raftModel[33].setRotationPoint(-8.5F, 2.5F, -1.5F);

		raftModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		raftModel[34].setRotationPoint(-8.5F, 1.5F, -1.5F);

		raftModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 39
		raftModel[35].setRotationPoint(-8.5F, 3.5F, -1.5F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{

		GL11.glScalef(1.35F, 1.35F, 1.35F);

		for(int i = 0; i < 36; i++)
		{
			raftModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo raftModel[];
}