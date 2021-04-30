//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSmokeGrenade extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelSmokeGrenade()
	{
		smokegrenadeModel = new ModelRendererTurbo[31];
		smokegrenadeModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		smokegrenadeModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 5
		smokegrenadeModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 6
		smokegrenadeModel[3] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 10
		smokegrenadeModel[4] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 11
		smokegrenadeModel[5] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 12
		smokegrenadeModel[6] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 13
		smokegrenadeModel[7] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 14
		smokegrenadeModel[8] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 15
		smokegrenadeModel[9] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 16
		smokegrenadeModel[10] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 17
		smokegrenadeModel[11] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 18
		smokegrenadeModel[12] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 19
		smokegrenadeModel[13] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 20
		smokegrenadeModel[14] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 22
		smokegrenadeModel[15] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 23
		smokegrenadeModel[16] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 24
		smokegrenadeModel[17] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 25
		smokegrenadeModel[18] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 26
		smokegrenadeModel[19] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 27
		smokegrenadeModel[20] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 28
		smokegrenadeModel[21] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 29
		smokegrenadeModel[22] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 30
		smokegrenadeModel[23] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 31
		smokegrenadeModel[24] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 32
		smokegrenadeModel[25] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 33
		smokegrenadeModel[26] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 34
		smokegrenadeModel[27] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 35
		smokegrenadeModel[28] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 35
		smokegrenadeModel[29] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 36
		smokegrenadeModel[30] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 37

		smokegrenadeModel[0].addShapeBox(0F, 0F, 0F, 9, 15, 26, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 4
		smokegrenadeModel[0].setRotationPoint(8F, -58F, -14.5F);

		smokegrenadeModel[1].addBox(0F, 0F, 0F, 9, 15, 26, 0F); // Box 5
		smokegrenadeModel[1].setRotationPoint(-1F, -58F, -14.5F);

		smokegrenadeModel[2].addShapeBox(0F, 0F, 0F, 9, 15, 26, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 6
		smokegrenadeModel[2].setRotationPoint(-10F, -58F, -14.5F);

		smokegrenadeModel[3].addShapeBox(0F, 0F, 0F, 5, 2, 20, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 10
		smokegrenadeModel[3].setRotationPoint(8F, 1F, -11.5F);

		smokegrenadeModel[4].addBox(0F, 0F, 0F, 9, 2, 20, 0F); // Box 11
		smokegrenadeModel[4].setRotationPoint(-1F, 1F, -11.5F);

		smokegrenadeModel[5].addShapeBox(0F, 0F, 0F, 5, 2, 20, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 12
		smokegrenadeModel[5].setRotationPoint(-6F, 1F, -11.5F);

		smokegrenadeModel[6].addBox(0F, 0F, 0F, 9, 16, 9, 0F); // Box 13
		smokegrenadeModel[6].setRotationPoint(-1F, 19F, 3F);
		smokegrenadeModel[6].rotateAngleX = 3.14159265F;

		smokegrenadeModel[7].addShapeBox(0F, 0F, 0F, 7, 12, 9, 0F, -6F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		smokegrenadeModel[7].setRotationPoint(-14F, 19F, 3F);
		smokegrenadeModel[7].rotateAngleX = 3.14159265F;

		smokegrenadeModel[8].addBox(0F, 0F, 0F, 6, 14, 9, 0F); // Box 15
		smokegrenadeModel[8].setRotationPoint(-7F, 19F, 3F);
		smokegrenadeModel[8].rotateAngleX = 3.14159265F;

		smokegrenadeModel[9].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		smokegrenadeModel[9].setRotationPoint(-15F, 25F, -6F);
		smokegrenadeModel[9].rotateAngleX = 3.14159265F;

		smokegrenadeModel[10].addShapeBox(0F, 0F, 0F, 9, 2, 9, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		smokegrenadeModel[10].setRotationPoint(-16F, 7F, 3F);
		smokegrenadeModel[10].rotateAngleX = 3.14159265F;

		smokegrenadeModel[11].addShapeBox(0F, 0F, 0F, 9, 2, 9, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 18
		smokegrenadeModel[11].setRotationPoint(-20F, 5F, 3F);
		smokegrenadeModel[11].rotateAngleX = 3.14159265F;

		smokegrenadeModel[12].addShapeBox(0F, 0F, 0F, 7, 2, 9, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 19
		smokegrenadeModel[12].setRotationPoint(-22F, 3F, 3F);
		smokegrenadeModel[12].rotateAngleX = 3.14159265F;

		smokegrenadeModel[13].addBox(0F, 0F, 0F, 4, 43, 9, 0F); // Box 20
		smokegrenadeModel[13].setRotationPoint(-22F, 1F, 3F);
		smokegrenadeModel[13].rotateAngleX = 3.14159265F;

		smokegrenadeModel[14].addBox(0F, 0F, 0F, 5, 3, 7, 0F); // Box 22
		smokegrenadeModel[14].setRotationPoint(8F, 19F, 2F);
		smokegrenadeModel[14].rotateAngleX = 3.14159265F;

		smokegrenadeModel[15].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 23
		smokegrenadeModel[15].setRotationPoint(-16F, 24F, -6F);
		smokegrenadeModel[15].rotateAngleX = 3.14159265F;

		smokegrenadeModel[16].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 24
		smokegrenadeModel[16].setRotationPoint(-16F, 22F, -6F);
		smokegrenadeModel[16].rotateAngleX = 3.14159265F;

		smokegrenadeModel[17].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 25
		smokegrenadeModel[17].setRotationPoint(-16F, 19F, -6F);
		smokegrenadeModel[17].rotateAngleX = 3.14159265F;

		smokegrenadeModel[18].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 26
		smokegrenadeModel[18].setRotationPoint(-13F, 10F, -6F);
		smokegrenadeModel[18].rotateAngleX = 3.14159265F;

		smokegrenadeModel[19].addShapeBox(0F, 0F, 0F, 5, 10, 2, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 27
		smokegrenadeModel[19].setRotationPoint(-10F, 20F, -6F);
		smokegrenadeModel[19].rotateAngleX = 3.14159265F;

		smokegrenadeModel[20].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		smokegrenadeModel[20].setRotationPoint(-7F, 25F, -6F);
		smokegrenadeModel[20].rotateAngleX = 3.14159265F;

		smokegrenadeModel[21].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 29
		smokegrenadeModel[21].setRotationPoint(-10F, 10F, -6F);
		smokegrenadeModel[21].rotateAngleX = 3.14159265F;

		smokegrenadeModel[22].addBox(0F, 0F, 0F, 9, 30, 26, 0F); // Box 30
		smokegrenadeModel[22].setRotationPoint(-1F, -29F, -14.5F);

		smokegrenadeModel[23].addShapeBox(0F, 0F, 0F, 9, 30, 26, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 31
		smokegrenadeModel[23].setRotationPoint(-10F, -29F, -14.5F);

		smokegrenadeModel[24].addShapeBox(0F, 0F, 0F, 9, 30, 26, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 32
		smokegrenadeModel[24].setRotationPoint(8F, -29F, -14.5F);

		smokegrenadeModel[25].addBox(0F, 0F, 0F, 9, 14, 26, 0F); // Box 33
		smokegrenadeModel[25].setRotationPoint(-1F, -43F, -14.5F);

		smokegrenadeModel[26].addShapeBox(0F, 0F, 0F, 9, 14, 26, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 34
		smokegrenadeModel[26].setRotationPoint(8F, -43F, -14.5F);

		smokegrenadeModel[27].addShapeBox(0F, 0F, 0F, 9, 14, 26, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 35
		smokegrenadeModel[27].setRotationPoint(-10F, -43F, -14.5F);

		smokegrenadeModel[28].addBox(0F, 0F, 0F, 9, 2, 26, 0F); // Box 35
		smokegrenadeModel[28].setRotationPoint(-1F, 1F, -14.5F);

		smokegrenadeModel[29].addShapeBox(0F, 0F, 0F, 9, 2, 26, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 36
		smokegrenadeModel[29].setRotationPoint(8F, 1F, -14.5F);

		smokegrenadeModel[30].addShapeBox(0F, 0F, 0F, 9, 2, 26, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 37
		smokegrenadeModel[30].setRotationPoint(-10F, 1F, -14.5F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 31; i++)
		{
			smokegrenadeModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo smokegrenadeModel[];
}