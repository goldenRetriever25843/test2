//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelModernPeakedHat extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelModernPeakedHat() //Same as Filename
	{
		headModel = new ModelRendererTurbo[11];
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		headModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 3
		headModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 6
		headModel[3] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 11
		headModel[4] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 11
		headModel[5] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 21
		headModel[6] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 22
		headModel[7] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 23
		headModel[8] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 25
		headModel[9] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 26
		headModel[10] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 27

		headModel[0].addShapeBox(0F, -6F, -4F, 4, 1, 4, 0F, 0F, 1F, 0.2F, 0F, 0.8F, 0F, 0F, 0.4F, 0F, 0F, 0.8F, 0F, 0F, 0F, 1F, 0.2F, 0F, 0.5F, 0.2F, 0.5F, 0F, 0F, 0F, 0F); // Box 1
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(0F, -6F, 0F, 4, 1, 4, 0F, 0F, 0.8F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0.2F, 0F, 0F, 0F, 0.2F, 0.5F, 0F, 0.2F, 1F, 0.1F, 0F, 1.2F, 0.3F); // Box 3
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -5.25F, -6F, 4, 1, 2, 0F, -0.3F, -0.7F, -0.7F, 0F, -0.6F, 0.5F, 0F, 0.4F, 0F, 0.2F, -0.2F, 0F, -0.2F, 0.1F, 0F, 0F, 0F, 0.7F, 0F, -0.4F, 0F, 0.2F, -0.6F, 0.5F); // Box 6
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-1F, -6.8F, -4.8F, 2, 1, 1, 0F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, 0F, -0.6F, 0F, 0F); // Box 11
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(0F, -5.25F, -6F, 4, 1, 2, 0F, 0F, -0.6F, 0.5F, -0.3F, -0.7F, -0.7F, 0.2F, -0.2F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0.7F, -0.2F, 0.1F, 0F, 0.2F, -0.6F, 0.5F, 0F, -0.4F, 0F); // Box 11
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4F, -6F, 0F, 4, 1, 4, 0F, 0F, 0.4F, 0F, 0F, 0.8F, 0F, 0F, -0.1F, 0.2F, 0F, 0F, 0F, 0.2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1.2F, 0.3F, 0.2F, 1F, 0.1F); // Box 21
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4F, -6F, -4F, 4, 1, 4, 0F, 0F, 0.8F, 0F, 0F, 1F, 0.2F, 0F, 0.8F, 0F, 0F, 0.4F, 0F, 0.2F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0.2F, 0.5F, 0F); // Box 22
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-4F, -8.6F, -4F, 4, 1, 4, 0F, 0.5F, 0F, 1F, 0F, 1F, 2F, 0F, 0F, 1F, 2F, -0.5F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 1.2F, 0F); // Box 23
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-4F, -8.6F, 0F, 4, 1, 4, 0F, 2F, -0.5F, 0F, 0F, 0F, -1F, 0F, -0.2F, 1.5F, 0.8F, -0.5F, 0.5F, 0F, 1.2F, 0F, 0F, 0.8F, 0F, 0F, 1.8F, 0.2F, 0F, 1.6F, 0F); // Box 25
		headModel[8].setRotationPoint(0F, 0F, -4F);

		headModel[9].addShapeBox(0F, -8.6F, 0F, 4, 1, 4, 0F, 0F, 0F, -1F, 2F, -0.5F, 0F, 0.8F, -0.5F, 0.5F, 0F, -0.2F, 1.5F, 0F, 0.8F, 0F, 0F, 1.2F, 0F, 0F, 1.6F, 0F, 0F, 1.8F, 0.2F); // Box 26
		headModel[9].setRotationPoint(0F, 0F, -4F);

		headModel[10].addShapeBox(0F, -8.6F, -4F, 4, 1, 4, 0F, 0F, 1F, 2F, 0.5F, 0F, 1F, 2F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 1.2F, 0F, 0F, 0.8F, 0F); // Box 27
		headModel[10].setRotationPoint(0F, 0F, 0F);


	}
}