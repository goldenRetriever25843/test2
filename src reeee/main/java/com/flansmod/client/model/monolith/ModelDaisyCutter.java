//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.4.2
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelDaisyCutter extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelDaisyCutter()
	{
		daisycutterModel = new ModelRendererTurbo[18];
		daisycutterModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		daisycutterModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 1
		daisycutterModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 2
		daisycutterModel[3] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 3
		daisycutterModel[4] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 4
		daisycutterModel[5] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 5
		daisycutterModel[6] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 6
		daisycutterModel[7] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 7
		daisycutterModel[8] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 8
		daisycutterModel[9] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 9
		daisycutterModel[10] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 10
		daisycutterModel[11] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 12
		daisycutterModel[12] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 14
		daisycutterModel[13] = new ModelRendererTurbo(this, 249, 169, textureX, textureY); // Box 15
		daisycutterModel[14] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 16
		daisycutterModel[15] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 17
		daisycutterModel[16] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 18
		daisycutterModel[17] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 19

		daisycutterModel[0].addShapeBox(0F, 0F, 0F, 16, 42, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, 0F); // Box 0
		daisycutterModel[0].setRotationPoint(0F, 0F, 0F);

		daisycutterModel[1].addShapeBox(0F, 0F, 0F, 16, 42, 16, 0F, 0F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		daisycutterModel[1].setRotationPoint(0F, 0F, -16F);

		daisycutterModel[2].addShapeBox(0F, 0F, 0F, 16, 42, 16, 0F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		daisycutterModel[2].setRotationPoint(-16F, 0F, -16F);

		daisycutterModel[3].addShapeBox(0F, 0F, 0F, 16, 42, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F); // Box 3
		daisycutterModel[3].setRotationPoint(-16F, 0F, 0F);

		daisycutterModel[4].addShapeBox(0F, 0F, 0F, 16, 20, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, -16F, 0F, 0F, -16F); // Box 4
		daisycutterModel[4].setRotationPoint(0F, 42F, 0F);

		daisycutterModel[5].addShapeBox(0F, 0F, 0F, 16, 20, 16, 0F, 0F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, -16F, 0F, -16F, -16F, 0F, 0F, 0F, 0F, 0F); // Box 5
		daisycutterModel[5].setRotationPoint(0F, 42F, -16F);

		daisycutterModel[6].addShapeBox(0F, 0F, 0F, 16, 20, 16, 0F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, -16F, 0F, 0F); // Box 6
		daisycutterModel[6].setRotationPoint(-16F, 42F, -16F);

		daisycutterModel[7].addShapeBox(0F, 0F, 0F, 16, 20, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, -16F, 0F, -16F); // Box 7
		daisycutterModel[7].setRotationPoint(-16F, 42F, 0F);

		daisycutterModel[8].addBox(0F, 0F, 0F, 2, 20, 2, 0F); // Box 8
		daisycutterModel[8].setRotationPoint(-1F, 59F, -1F);

		daisycutterModel[9].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 2F); // Box 9
		daisycutterModel[9].setRotationPoint(-1F, 79F, -1F);

		daisycutterModel[10].addShapeBox(0F, 0F, 0F, 60, 20, 60, 0F, -16F, 0F, 0F, 0F, 10F, 0F, 0F, 0F, -16F, -22F, 0F, -22F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -4F, 0F, -4F); // Box 10
		daisycutterModel[10].setRotationPoint(-60F, -100F, 0F);

		daisycutterModel[11].addShapeBox(0F, 0F, 0F, 60, 20, 60, 0F, -22F, 0F, -22F, 0F, 0F, -16F, 0F, 10F, 0F, -16F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, 5F, 0F, 0F, 0F, 5F, 0F, 0F); // Box 12
		daisycutterModel[11].setRotationPoint(-60F, -100F, -60F);

		daisycutterModel[12].addShapeBox(0F, 0F, 0F, 60, 20, 60, 0F, 0F, 0F, -16F, -22F, 0F, -22F, -16F, 0F, 0F, 0F, 10F, 0F, 0F, 0F, 5F, -4F, 0F, -4F, 5F, 0F, 0F, 0F, 0F, 0F); // Box 14
		daisycutterModel[12].setRotationPoint(0F, -100F, -60F);

		daisycutterModel[13].addShapeBox(0F, 0F, 0F, 60, 20, 60, 0F, 0F, 10F, 0F, -16F, 0F, 0F, -22F, 0F, -22F, 0F, 0F, -16F, 0F, 0F, 0F, 5F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, 5F); // Box 15
		daisycutterModel[13].setRotationPoint(0F, -100F, 0F);

		daisycutterModel[14].addShapeBox(-0.5F, 0F, -0.5F, 1, 80, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 45F, 0F, 45F, -45F, 0F, 45F, -45F, 0F, -45F, 45F, 0F, -45F); // Box 16
		daisycutterModel[14].setRotationPoint(55F, -80F, 55F);

		daisycutterModel[15].addShapeBox(-0.5F, 0F, -0.5F, 1, 80, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 45F, 0F, -45F, -45F, 0F, -45F, -45F, 0F, 45F, 45F, 0F, 45F); // Box 17
		daisycutterModel[15].setRotationPoint(55F, -80F, -56F);

		daisycutterModel[16].addShapeBox(-0.5F, 0F, -0.5F, 1, 80, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -45F, 0F, -45F, 45F, 0F, -45F, 45F, 0F, 45F, -45F, 0F, 45F); // Box 18
		daisycutterModel[16].setRotationPoint(-55F, -80F, -56F);

		daisycutterModel[17].addShapeBox(-0.5F, 0F, -0.5F, 1, 80, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -45F, 0F, 45F, 45F, 0F, 45F, 45F, 0F, -45F, -45F, 0F, -45F); // Box 19
		daisycutterModel[17].setRotationPoint(-55F, -80F, 55F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 18; i++)
		{
			daisycutterModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo daisycutterModel[];
}