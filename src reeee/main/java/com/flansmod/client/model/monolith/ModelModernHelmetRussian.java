//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.2.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelModernHelmetRussian extends ModelCustomArmour
{
	int textureX = 512;
	int textureY = 512;

	public ModelModernHelmetRussian()
	{
		headModel = new ModelRendererTurbo[20];
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 3
		headModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 3
		headModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 14
		headModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 6
		headModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 8
		headModel[5] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 8
		headModel[6] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 9
		headModel[7] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 10
		headModel[8] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 10
		headModel[9] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 10
		headModel[10] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 13
		headModel[11] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 14
		headModel[12] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 15
		headModel[13] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 16
		headModel[14] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 17
		headModel[15] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 18
		headModel[16] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 19
		headModel[17] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 20
		headModel[18] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 21
		headModel[19] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 22

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 3, 3, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.1F, 0F, 0.8F, 0.1F, 0F, 0.8F, 1.4F, 0F, 0.1F, 1.4F, 0F, 0.1F); // Box 3
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -9F, -4F, 8, 1, 8, 0F, -0.9F, 0.2F, -1.9F, -0.9F, 0.2F, -1.9F, -0.9F, 0.5F, -1.4F, -0.9F, 0.5F, -1.4F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F); // Box 3
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4.5F, -3.7F, -0.5F, 9, 1, 1, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, -0.4F, 2.8F, 2.8F, -0.4F, 2.8F, 2.8F, -0.4F, 2.8F, -3.2F, -0.4F, 2.8F, -3.2F); // Box 14
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -8F, -0.8F, 8, 3, 5, 0F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F, 0.4F, 1.4F, 0F, 0.1F, 1.4F, 0F, 0.1F, 0.1F, 0F, 0.8F, 0.1F, 0F, 0.8F); // Box 6
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -5F, -0.8F, 8, 2, 5, 0F, 1.4F, 0F, 0.1F, 1.4F, 0F, 0.1F, 0.1F, 0F, 0.8F, 0.1F, 0F, 0.8F, 1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, 0.1F, -0.5F, 0.8F, 0.1F, -0.5F, 0.8F); // Box 8
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4F, -5F, -4F, 8, 1, 3, 0F, 0.1F, 0.2F, 0.8F, 0.1F, 0.2F, 0.8F, 1.4F, 0F, 0.1F, 1.4F, 0F, 0.1F, 0.1F, -0.4F, 1.5F, 0.1F, -0.4F, 1.5F, 1.4F, -0.5F, 0.3F, 1.4F, -0.5F, 0.3F); // Box 8
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(4.8F, -4.6F, -1.5F, 1, 1, 1, 0F, 0F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F); // Box 9
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(4.5F, -4.5F, -1F, 1, 3, 1, 0F, -0.4F, 0.2F, -0.4F, -0.4F, 0.2F, -0.4F, -0.4F, 0.2F, -0.4F, -0.4F, 0.2F, -0.4F, 0F, 0.2F, 3.6F, -0.8F, 0.2F, 3.6F, -0.8F, 0.2F, -4.4F, 0F, 0.2F, -4.4F); // Box 10
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(4.15F, -1.1F, -5.05F, 1, 1, 1, 0F, -0.4F, 0.2F, -0.4F, -0.4F, 0.2F, -0.4F, -0.4F, 0.2F, -0.4F, -0.4F, 0.2F, -0.4F, 2F, -0.8F, 0.6F, -2.8F, -0.8F, 0.6F, -2.8F, -0.8F, -1.4F, 2F, -0.8F, -1.4F); // Box 10
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(1.3F, -1.4F, -6.05F, 1, 1, 1, 0F, -0.2F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 10
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-3F, -7.5F, -4.8F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 13
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-4.5F, -4.7F, -4.2F, 9, 2, 1, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, -0.3F, 2.8F, -1F, -0.3F, 2.8F, -1F, -0.3F, 2.8F, 0.5F, -0.3F, 2.8F, 0.5F); // Box 14
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-4F, -2.5F, -4F, 8, 2, 8, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0.6F, 0.1F, 0.1F, 0.6F, 0.1F, 0.1F, 0.6F, 0.1F, 0.1F, 0.6F, 0.1F); // Box 15
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-4F, -4.5F, -4F, 1, 2, 8, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0.6F, 0.1F, 0.1F, 0.6F, 0.1F, 0.1F, 0.6F, 0.1F, 0.1F, 0.6F, 0.1F); // Box 16
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(3F, -4.5F, -4F, 1, 2, 8, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0.6F, 0.1F, 0.1F, 0.6F, 0.1F, 0.1F, 0.6F, 0.1F, 0.1F, 0.6F, 0.1F); // Box 17
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-4F, -4.5F, 3F, 8, 2, 1, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0.6F, 0.1F, 0.1F, 0.6F, 0.1F, 0.1F, 0.6F, 0.1F, 0.1F, 0.6F, 0.1F); // Box 18
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-3F, -6.5F, -4.8F, 3, 1, 1, 0F, 0F, 0F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 19
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(0F, -6.5F, -4.8F, 3, 1, 1, 0F, -0.1F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 20
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-4.5F, -6.8F, -4.7F, 9, 1, 4, 0F, -0.3F, -0.2F, -0.2F, -0.28F, -0.2F, -0.2F, 0.75F, -0.2F, 0F, 0.7F, -0.2F, 0F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, 0.8F, -0.2F, 0F, 0.8F, -0.2F, 0F); // Box 21
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-4.5F, -6.8F, -0.7F, 9, 1, 6, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, -0.3F, 0.8F, -0.2F, 0F, 0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.15F); // Box 22
		headModel[19].setRotationPoint(0F, 0F, 0F);


	}
}