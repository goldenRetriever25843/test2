//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.2.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelRussiaVest extends ModelCustomArmour
{
	int textureX = 512;
	int textureY = 512;

	public ModelRussiaVest()
	{
		bodyModel = new ModelRendererTurbo[20];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 20

		bodyModel[0].addShapeBox(-4.5F, 4F, -2.5F, 4, 6, 2, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4.5F, 0F, -2.5F, 4, 4, 2, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(0.5F, 0F, -2.5F, 4, 4, 2, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 3
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4.5F, 8.5F, -1.7F, 9, 1, 4, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 4
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(0.5F, 4F, -2.5F, 4, 6, 2, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F); // Box 5
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-0.5F, 4.5F, -2.5F, 1, 5, 2, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 6
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-3.7F, 7.5F, -3.2F, 3, 2, 2, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F); // Box 7
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-3.7F, 5F, -3.2F, 3, 2, 2, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F); // Box 8
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-3.7F, 4.8F, -3.4F, 3, 2, 2, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 9
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-3.7F, 7.3F, -3.4F, 3, 2, 2, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 10
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(0.9F, 5.5F, -3.2F, 1, 4, 2, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0F); // Box 11
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(2.8F, 5.5F, -3.2F, 1, 4, 2, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0F); // Box 12
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(2.8F, 5.1F, -3.4F, 1, 4, 2, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F); // Box 13
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(0.9F, 5.1F, -3.4F, 1, 4, 2, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F); // Box 14
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-3.7F, 3.5F, -3.2F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(1.7F, 3.5F, -3.2F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-4.5F, 0F, -0.5F, 4, 9, 2, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F); // Box 17
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(2F, 0F, -0.5F, 4, 9, 2, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F); // Box 18
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-4.5F, 4.5F, -1.7F, 9, 1, 4, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 19
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-4.5F, 6.5F, -1.7F, 9, 1, 4, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 20
		bodyModel[19].setRotationPoint(0F, 0F, 0F);


	}
}