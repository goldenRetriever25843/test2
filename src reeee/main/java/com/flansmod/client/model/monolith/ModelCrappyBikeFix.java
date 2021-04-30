//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelCrappyBikeFix extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelCrappyBikeFix() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[18];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 28
		bodyModel[17] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 29

		bodyModel[0].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -0.5F); // Box 1
		bodyModel[0].setRotationPoint(-12F, 3F, -1.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(-3F, -3F, -0.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, 0F, 0F, 6F, -1F, 0F, 6F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -6F, -1F, 0F, -6F, 1F, 0F, 0F, -0.5F); // Box 3
		bodyModel[2].setRotationPoint(-12F, 3F, -1.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[3].setRotationPoint(0F, 3F, -0.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 5
		bodyModel[4].setRotationPoint(-3F, -2.5F, -0.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-12F, 3F, 0.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 6F, 1F, 0F, 6F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -6F, 1F, 0F, -6F, -1F, 0F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(-12F, 3F, 0.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 7
		bodyModel[7].setRotationPoint(-14F, -3F, -0.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 8
		bodyModel[8].setRotationPoint(-14F, 9F, -0.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 9
		bodyModel[9].setRotationPoint(-18F, 1F, -0.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 4F, 0F, -0.2F, -4F, 0F, -0.2F, -4F, 0F, -0.2F, 4F, 0F, -0.2F); // Box 10
		bodyModel[10].setRotationPoint(-14F, -3F, -0.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 11
		bodyModel[11].setRotationPoint(-6F, 1F, -0.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -4F, 0F, -0.2F, 4F, 0F, -0.2F, 4F, 0F, -0.2F, -4F, 0F, -0.2F); // Box 12
		bodyModel[12].setRotationPoint(-10F, -3F, -0.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 4F, 0F, -0.2F, -4F, 0F, -0.2F, -4F, 0F, -0.2F, 4F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 13
		bodyModel[13].setRotationPoint(-14F, 6F, -0.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, -4F, 0F, -0.2F, 4F, 0F, -0.2F, 4F, 0F, -0.2F, -4F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 14
		bodyModel[14].setRotationPoint(-10F, 6F, -0.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[15].setRotationPoint(-12F, 3F, -1.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[16].setRotationPoint(-3F, -4.5F, -0.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 29
		bodyModel[17].setRotationPoint(-5F, -6F, -2F);


		leftFrontWheelModel = new ModelRendererTurbo[11];
		leftFrontWheelModel[0] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 16
		leftFrontWheelModel[1] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 17
		leftFrontWheelModel[2] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 18
		leftFrontWheelModel[3] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 19
		leftFrontWheelModel[4] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 20
		leftFrontWheelModel[5] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 21
		leftFrontWheelModel[6] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 22
		leftFrontWheelModel[7] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 23
		leftFrontWheelModel[8] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 24
		leftFrontWheelModel[9] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 26
		leftFrontWheelModel[10] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 27

		leftFrontWheelModel[0].addShapeBox(0F, -5F, -0.5F, 1, 6, 1, 0F, 2.1F, 0F, 0.1F, -1.9F, 0F, 0.1F, -1.9F, 0F, 0.1F, 2.1F, 0F, 0.1F, -1.9F, 8F, 0.1F, 2.1F, 8F, 0.1F, 2.1F, 8F, 0.1F, -1.9F, 8F, 0.1F); // Box 16
		leftFrontWheelModel[0].setRotationPoint(9F, -5F, 0F);

		leftFrontWheelModel[1].addShapeBox(0F, 2F, -0.5F, 5, 1, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 17
		leftFrontWheelModel[1].setRotationPoint(9F, -5F, 0F);

		leftFrontWheelModel[2].addShapeBox(4F, 2F, -0.5F, 1, 4, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -4F, 0F, -0.2F, 4F, 0F, -0.2F, 4F, 0F, -0.2F, -4F, 0F, -0.2F); // Box 18
		leftFrontWheelModel[2].setRotationPoint(9F, -5F, 0F);

		leftFrontWheelModel[3].addShapeBox(8F, 6F, -0.5F, 1, 5, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 19
		leftFrontWheelModel[3].setRotationPoint(9F, -5F, 0F);

		leftFrontWheelModel[4].addShapeBox(4F, 11F, -0.5F, 1, 4, 1, 0F, -4F, 0F, -0.2F, 4F, 0F, -0.2F, 4F, 0F, -0.2F, -4F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 20
		leftFrontWheelModel[4].setRotationPoint(9F, -5F, 0F);

		leftFrontWheelModel[5].addShapeBox(0F, 14F, -0.5F, 5, 1, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 21
		leftFrontWheelModel[5].setRotationPoint(9F, -5F, 0F);

		leftFrontWheelModel[6].addShapeBox(0F, 11F, -0.5F, 1, 4, 1, 0F, 4F, 0F, -0.2F, -4F, 0F, -0.2F, -4F, 0F, -0.2F, 4F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 22
		leftFrontWheelModel[6].setRotationPoint(9F, -5F, 0F);

		leftFrontWheelModel[7].addShapeBox(-4F, 6F, -0.5F, 1, 5, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 23
		leftFrontWheelModel[7].setRotationPoint(9F, -5F, 0F);

		leftFrontWheelModel[8].addShapeBox(0F, 2F, -0.5F, 1, 4, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 4F, 0F, -0.2F, -4F, 0F, -0.2F, -4F, 0F, -0.2F, 4F, 0F, -0.2F); // Box 24
		leftFrontWheelModel[8].setRotationPoint(9F, -5F, 0F);

		leftFrontWheelModel[9].addShapeBox(-2F, -5F, -5.5F, 1, 1, 11, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 26
		leftFrontWheelModel[9].setRotationPoint(9F, -5F, 0F);

		leftFrontWheelModel[10].addShapeBox(-0.8F, -4F, -0.5F, 1, 2, 1, 0F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F); // Box 27
		leftFrontWheelModel[10].setRotationPoint(9F, -5F, 0F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}