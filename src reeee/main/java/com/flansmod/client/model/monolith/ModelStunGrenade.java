//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelStunGrenade extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelStunGrenade()
	{
		stungrenadeModel = new ModelRendererTurbo[35];
		stungrenadeModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		stungrenadeModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 2
		stungrenadeModel[2] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 3
		stungrenadeModel[3] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 4
		stungrenadeModel[4] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 5
		stungrenadeModel[5] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 6
		stungrenadeModel[6] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 7
		stungrenadeModel[7] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 8
		stungrenadeModel[8] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 9
		stungrenadeModel[9] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 10
		stungrenadeModel[10] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 11
		stungrenadeModel[11] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 12
		stungrenadeModel[12] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 13
		stungrenadeModel[13] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 14
		stungrenadeModel[14] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 15
		stungrenadeModel[15] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 16
		stungrenadeModel[16] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 17
		stungrenadeModel[17] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 18
		stungrenadeModel[18] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 19
		stungrenadeModel[19] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 20
		stungrenadeModel[20] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 21
		stungrenadeModel[21] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 22
		stungrenadeModel[22] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 23
		stungrenadeModel[23] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 24
		stungrenadeModel[24] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 25
		stungrenadeModel[25] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 26
		stungrenadeModel[26] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 27
		stungrenadeModel[27] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 28
		stungrenadeModel[28] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 29
		stungrenadeModel[29] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 30
		stungrenadeModel[30] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 31
		stungrenadeModel[31] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 32
		stungrenadeModel[32] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 33
		stungrenadeModel[33] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 34
		stungrenadeModel[34] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 35

		stungrenadeModel[0].addShapeBox(0F, 0F, 0F, 12, 15, 33, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 1
		stungrenadeModel[0].setRotationPoint(-13F, 42F, -18F);

		stungrenadeModel[1].addShapeBox(0F, 0F, 0F, 12, 15, 33, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 2
		stungrenadeModel[1].setRotationPoint(8F, 42F, -18F);

		stungrenadeModel[2].addBox(0F, 0F, 0F, 9, 15, 33, 0F); // Box 3
		stungrenadeModel[2].setRotationPoint(-1F, 42F, -18F);

		stungrenadeModel[3].addShapeBox(0F, 0F, 0F, 9, 15, 26, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 4
		stungrenadeModel[3].setRotationPoint(8F, -2F, -14.5F);

		stungrenadeModel[4].addBox(0F, 0F, 0F, 9, 15, 26, 0F); // Box 5
		stungrenadeModel[4].setRotationPoint(-1F, -2F, -14.5F);

		stungrenadeModel[5].addShapeBox(0F, 0F, 0F, 9, 15, 26, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 6
		stungrenadeModel[5].setRotationPoint(-10F, -2F, -14.5F);

		stungrenadeModel[6].addShapeBox(0F, 0F, 0F, 12, 15, 33, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 7
		stungrenadeModel[6].setRotationPoint(-13F, -17F, -18F);

		stungrenadeModel[7].addBox(0F, 0F, 0F, 9, 15, 33, 0F); // Box 8
		stungrenadeModel[7].setRotationPoint(-1F, -17F, -18F);

		stungrenadeModel[8].addShapeBox(0F, 0F, 0F, 12, 15, 33, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 9
		stungrenadeModel[8].setRotationPoint(8F, -17F, -18F);

		stungrenadeModel[9].addShapeBox(0F, 0F, 0F, 5, 2, 20, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 10
		stungrenadeModel[9].setRotationPoint(8F, 57F, -11.5F);

		stungrenadeModel[10].addBox(0F, 0F, 0F, 9, 2, 20, 0F); // Box 11
		stungrenadeModel[10].setRotationPoint(-1F, 57F, -11.5F);

		stungrenadeModel[11].addShapeBox(0F, 0F, 0F, 5, 2, 20, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 12
		stungrenadeModel[11].setRotationPoint(-6F, 57F, -11.5F);

		stungrenadeModel[12].addBox(0F, 0F, 0F, 9, 16, 9, 0F); // Box 13
		stungrenadeModel[12].setRotationPoint(-1F, 75F, 3F);
		stungrenadeModel[12].rotateAngleX = 3.14159265F;

		stungrenadeModel[13].addShapeBox(0F, 0F, 0F, 7, 12, 9, 0F, -6F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		stungrenadeModel[13].setRotationPoint(-14F, 75F, 3F);
		stungrenadeModel[13].rotateAngleX = 3.14159265F;

		stungrenadeModel[14].addBox(0F, 0F, 0F, 6, 14, 9, 0F); // Box 15
		stungrenadeModel[14].setRotationPoint(-7F, 75F, 3F);
		stungrenadeModel[14].rotateAngleX = 3.14159265F;

		stungrenadeModel[15].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		stungrenadeModel[15].setRotationPoint(-15F, 81F, -6F);
		stungrenadeModel[15].rotateAngleX = 3.14159265F;

		stungrenadeModel[16].addShapeBox(0F, 0F, 0F, 9, 2, 9, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		stungrenadeModel[16].setRotationPoint(-16F, 63F, 3F);
		stungrenadeModel[16].rotateAngleX = 3.14159265F;

		stungrenadeModel[17].addShapeBox(0F, 0F, 0F, 9, 2, 9, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 18
		stungrenadeModel[17].setRotationPoint(-20F, 61F, 3F);
		stungrenadeModel[17].rotateAngleX = 3.14159265F;

		stungrenadeModel[18].addShapeBox(0F, 0F, 0F, 7, 2, 9, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 19
		stungrenadeModel[18].setRotationPoint(-22F, 59F, 3F);
		stungrenadeModel[18].rotateAngleX = 3.14159265F;

		stungrenadeModel[19].addBox(0F, 0F, 0F, 4, 43, 9, 0F); // Box 20
		stungrenadeModel[19].setRotationPoint(-22F, 57F, 3F);
		stungrenadeModel[19].rotateAngleX = 3.14159265F;

		stungrenadeModel[20].addShapeBox(0F, 0F, 0F, 10, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 21
		stungrenadeModel[20].setRotationPoint(-22F, 14F, 3F);
		stungrenadeModel[20].rotateAngleX = 3.14159265F;

		stungrenadeModel[21].addBox(0F, 0F, 0F, 5, 7, 7, 0F); // Box 22
		stungrenadeModel[21].setRotationPoint(8F, 74F, 2F);
		stungrenadeModel[21].rotateAngleX = 3.14159265F;

		stungrenadeModel[22].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 23
		stungrenadeModel[22].setRotationPoint(-16F, 80F, -6F);
		stungrenadeModel[22].rotateAngleX = 3.14159265F;

		stungrenadeModel[23].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 24
		stungrenadeModel[23].setRotationPoint(-16F, 78F, -6F);
		stungrenadeModel[23].rotateAngleX = 3.14159265F;

		stungrenadeModel[24].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 25
		stungrenadeModel[24].setRotationPoint(-16F, 75F, -6F);
		stungrenadeModel[24].rotateAngleX = 3.14159265F;

		stungrenadeModel[25].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 26
		stungrenadeModel[25].setRotationPoint(-13F, 66F, -6F);
		stungrenadeModel[25].rotateAngleX = 3.14159265F;

		stungrenadeModel[26].addShapeBox(0F, 0F, 0F, 5, 10, 2, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 27
		stungrenadeModel[26].setRotationPoint(-10F, 76F, -6F);
		stungrenadeModel[26].rotateAngleX = 3.14159265F;

		stungrenadeModel[27].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		stungrenadeModel[27].setRotationPoint(-7F, 81F, -6F);
		stungrenadeModel[27].rotateAngleX = 3.14159265F;

		stungrenadeModel[28].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 29
		stungrenadeModel[28].setRotationPoint(-10F, 66F, -6F);
		stungrenadeModel[28].rotateAngleX = 3.14159265F;

		stungrenadeModel[29].addBox(0F, 0F, 0F, 9, 15, 26, 0F); // Box 30
		stungrenadeModel[29].setRotationPoint(-1F, 27F, -14.5F);

		stungrenadeModel[30].addShapeBox(0F, 0F, 0F, 9, 15, 26, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 31
		stungrenadeModel[30].setRotationPoint(-10F, 27F, -14.5F);

		stungrenadeModel[31].addShapeBox(0F, 0F, 0F, 9, 15, 26, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 32
		stungrenadeModel[31].setRotationPoint(8F, 27F, -14.5F);

		stungrenadeModel[32].addBox(0F, 0F, 0F, 9, 14, 26, 0F); // Box 33
		stungrenadeModel[32].setRotationPoint(-1F, 13F, -14.5F);

		stungrenadeModel[33].addShapeBox(0F, 0F, 0F, 9, 14, 26, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 34
		stungrenadeModel[33].setRotationPoint(8F, 13F, -14.5F);

		stungrenadeModel[34].addShapeBox(0F, 0F, 0F, 9, 14, 26, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 35
		stungrenadeModel[34].setRotationPoint(-10F, 13F, -14.5F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 35; i++)
		{
			stungrenadeModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo stungrenadeModel[];
}