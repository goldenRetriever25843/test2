//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelModernFleetHat extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelModernFleetHat() //Same as Filename
	{
		headModel = new ModelRendererTurbo[21];
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		headModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1
		headModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 2
		headModel[3] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 3
		headModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 4
		headModel[5] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 6
		headModel[6] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 11
		headModel[7] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 11
		headModel[8] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 12
		headModel[9] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 13
		headModel[10] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 14
		headModel[11] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 15
		headModel[12] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 16
		headModel[13] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 17
		headModel[14] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 18
		headModel[15] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 19
		headModel[16] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 20
		headModel[17] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 22
		headModel[18] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 23
		headModel[19] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 24
		headModel[20] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 25

		headModel[0].addShapeBox(-4F, -8F, -4F, 4, 3, 4, 0F, 0F, 0.8F, 0F, 0F, 1F, 0.2F, 0F, 0.8F, 0F, 0F, 0.6F, 0F, 0.2F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 0
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(0F, -8F, -4F, 4, 3, 4, 0F, 0F, 1F, 0.2F, 0F, 0.8F, 0F, 0F, 0.6F, 0F, 0F, 0.8F, 0F, 0F, 0F, 1F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 1
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -8F, 0F, 4, 3, 4, 0F, 0F, 0.6F, 0F, 0F, 0.8F, 0F, 0F, 0.6F, 0.2F, 0F, 0.2F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 1F, 0.2F, 1F, 0.5F); // Box 2
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(0F, -8F, 0F, 4, 3, 4, 0F, 0F, 0.8F, 0F, 0F, 0.6F, 0F, 0F, 0.2F, 0F, 0F, 0.6F, 0.2F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 1F, 0.5F, 0F, 1.5F, 1F); // Box 3
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -6.2F, -5F, 8, 1, 5, 0F, -4F, -0.2F, 0F, 0.2F, -0.4F, -0.5F, 0.25F, -0.6F, 0F, -4F, -0.6F, 0F, -4F, -0.2F, 0F, 0.2F, 0F, -0.4F, 0.25F, 0.2F, 0F, -4F, 0.2F, 0F); // Box 4
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4F, -5.25F, -6F, 4, 1, 2, 0F, -0.3F, -0.7F, -0.7F, 0F, -0.6F, 0.5F, 0F, 0.4F, 0F, 0.2F, -0.2F, 0F, -0.2F, 0.1F, 0F, 0F, 0F, 0.7F, 0F, -0.4F, 0F, 0.2F, -0.6F, 0.5F); // Box 6
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-1F, -7.8F, -4.8F, 2, 1, 1, 0F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, 0F, -0.6F, 0F, 0F); // Box 11
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(0F, -5.25F, -6F, 4, 1, 2, 0F, 0F, -0.6F, 0.5F, -0.3F, -0.7F, -0.7F, 0.2F, -0.2F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0.7F, -0.2F, 0.1F, 0F, 0.2F, -0.6F, 0.5F, 0F, -0.4F, 0F); // Box 11
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-4F, -6.2F, -5F, 8, 1, 5, 0F, 0.2F, -0.4F, -0.5F, -4F, -0.2F, 0F, -4F, -0.6F, 0F, 0.25F, -0.6F, 0F, 0.2F, 0F, -0.4F, -4F, -0.2F, 0F, -4F, 0.2F, 0F, 0.25F, 0.2F, 0F); // Box 12
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(3.8F, -5F, -2.5F, 1, 4, 3, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 13
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(4.4F, -5F, -2.5F, 2, 4, 3, 0F, -0.2F, -0.05F, -0.05F, -0.6F, -0.45F, -0.45F, -0.6F, -0.45F, -0.45F, -0.2F, -0.05F, -0.05F, -0.2F, -0.05F, -0.05F, -0.6F, -0.45F, -0.45F, -0.6F, -0.45F, -0.45F, -0.2F, -0.05F, -0.05F); // Box 14
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-6.2F, -5F, -2.5F, 2, 4, 3, 0F, -0.6F, -0.45F, -0.45F, -0.2F, -0.05F, -0.05F, -0.2F, -0.05F, -0.05F, -0.6F, -0.45F, -0.45F, -0.6F, -0.45F, -0.45F, -0.2F, -0.05F, -0.05F, -0.2F, -0.05F, -0.05F, -0.6F, -0.45F, -0.45F); // Box 15
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-4.8F, -5F, -2.5F, 1, 4, 3, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 16
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(0F, -9F, -1.5F, 5, 5, 1, 0F, 0F, 0.1F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 17
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-5F, -9F, -1.5F, 5, 5, 1, 0F, -0.7F, -0.2F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.7F, -0.2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 18
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addBox(5.3F, -2.5F, -1.6F, 1, 1, 1, 0F); // Box 19
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(5F, -1.5F, -6.2F, 1, 1, 1, 0F, 3F, -0.6F, -0.2F, -3.8F, -0.6F, -0.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 3F, -0.2F, -0.2F, -3.8F, -0.2F, -0.2F, -0.8F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 20
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(6F, -2.4F, -2.2F, 1, 1, 1, 0F, 1F, -1.42F, 3F, -1.8F, -1.42F, 3F, -0.8F, -0.42F, 0F, 0F, -0.42F, 0F, 1F, 0.58F, 3F, -1.8F, 0.58F, 3F, -0.8F, -0.42F, 0F, 0F, -0.42F, 0F); // Box 22
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(6F, -2.9F, -2.2F, 1, 1, 1, 0F, 1F, -1.42F, 3F, -1.8F, -1.42F, 3F, -0.8F, -0.42F, 0F, 0F, -0.42F, 0F, 1F, 0.58F, 3F, -1.8F, 0.58F, 3F, -0.8F, -0.42F, 0F, 0F, -0.42F, 0F); // Box 23
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(5F, -1F, -6.2F, 1, 1, 1, 0F, 3F, -0.6F, -0.2F, -3.8F, -0.6F, -0.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 3F, -0.2F, -0.2F, -3.8F, -0.2F, -0.2F, -0.8F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 24
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(1.3F, -1F, -6.4F, 1, 1, 1, 0F, 0.6F, -0.18F, 0.5F, 0F, -0.05F, 0F, -0.2F, -0.05F, -0.1F, 0.7F, -0.15F, -0.6F, 0.6F, 0.1F, 0.5F, 0F, -0.05F, 0F, -0.2F, -0.05F, -0.1F, 0.7F, 0.1F, -0.6F); // Box 25
		headModel[20].setRotationPoint(0F, 0F, 0F);


	}
}