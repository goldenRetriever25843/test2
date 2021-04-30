//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelFridge extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelFridge() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[11];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 10

		bodyModel[0].addBox(0F, 0F, 0F, 1, 30, 14, 0F); // Box 0
		bodyModel[0].setRotationPoint(-7F, -20F, -7F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 12, 30, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-6F, -20F, -8F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 12, 30, 1, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-6F, -20F, 7F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 12, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-6F, -21F, -7F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-6F, -21F, -8F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-6F, -21F, 7F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 12, 1, 14, 0F, 1F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 1F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 6
		bodyModel[6].setRotationPoint(-6F, 9F, -7F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 11, 1, 14, 0F, 1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 7
		bodyModel[7].setRotationPoint(-5F, -8F, -7F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 9, 8, 14, 0F, 1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 8
		bodyModel[8].setRotationPoint(-5F, 1F, -7F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F, 1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 9
		bodyModel[9].setRotationPoint(3.5F, 1.5F, -6.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F, 1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 10
		bodyModel[10].setRotationPoint(3.5F, 1.5F, 0.5F);


		bodyDoorOpenModel = new ModelRendererTurbo[12];
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 15
		bodyDoorOpenModel[1] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 16
		bodyDoorOpenModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 17
		bodyDoorOpenModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 18
		bodyDoorOpenModel[4] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 19
		bodyDoorOpenModel[5] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 20
		bodyDoorOpenModel[6] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 21
		bodyDoorOpenModel[7] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 22
		bodyDoorOpenModel[8] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 23
		bodyDoorOpenModel[9] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 24
		bodyDoorOpenModel[10] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 25
		bodyDoorOpenModel[11] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 26

		bodyDoorOpenModel[0].addShapeBox(0F, 0F, 0F, 1, 29, 14, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 15
		bodyDoorOpenModel[0].setRotationPoint(5.75F, -20F, -7F);
		bodyDoorOpenModel[0].rotateAngleY = -1.57079633F;

		bodyDoorOpenModel[1].addShapeBox(0.75F, 0F, -1F, 1, 30, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyDoorOpenModel[1].setRotationPoint(5.75F, -20.5F, -7F);
		bodyDoorOpenModel[1].rotateAngleY = -1.57079633F;

		bodyDoorOpenModel[2].addShapeBox(2.75F, 0F, 13F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 17
		bodyDoorOpenModel[2].setRotationPoint(5.75F, -7.5F, -7F);
		bodyDoorOpenModel[2].rotateAngleY = -1.57079633F;

		bodyDoorOpenModel[3].addShapeBox(1.75F, 0F, 13F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyDoorOpenModel[3].setRotationPoint(5.75F, -8.5F, -7F);
		bodyDoorOpenModel[3].rotateAngleY = -1.57079633F;

		bodyDoorOpenModel[4].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyDoorOpenModel[4].setRotationPoint(8F, -1F, -8F);

		bodyDoorOpenModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyDoorOpenModel[5].setRotationPoint(8F, -3F, -8F);

		bodyDoorOpenModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyDoorOpenModel[6].setRotationPoint(17F, -3F, -8F);

		bodyDoorOpenModel[7].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyDoorOpenModel[7].setRotationPoint(9F, -3F, -5F);

		bodyDoorOpenModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyDoorOpenModel[8].setRotationPoint(8F, -12F, -8F);

		bodyDoorOpenModel[9].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyDoorOpenModel[9].setRotationPoint(9F, -12F, -5F);

		bodyDoorOpenModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyDoorOpenModel[10].setRotationPoint(17F, -12F, -8F);

		bodyDoorOpenModel[11].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyDoorOpenModel[11].setRotationPoint(8F, -10F, -8F);


		bodyDoorCloseModel = new ModelRendererTurbo[4];
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 11
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 12
		bodyDoorCloseModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 13
		bodyDoorCloseModel[3] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 14

		bodyDoorCloseModel[0].addShapeBox(0F, 0F, 0F, 1, 29, 14, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 11
		bodyDoorCloseModel[0].setRotationPoint(5.75F, -20F, -7F);

		bodyDoorCloseModel[1].addShapeBox(0.75F, 0F, -1F, 1, 30, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyDoorCloseModel[1].setRotationPoint(5.75F, -20.5F, -7F);

		bodyDoorCloseModel[2].addShapeBox(1.75F, 0F, 13F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyDoorCloseModel[2].setRotationPoint(5.75F, -8.5F, -7F);

		bodyDoorCloseModel[3].addShapeBox(2.75F, 0F, 13F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 14
		bodyDoorCloseModel[3].setRotationPoint(5.75F, -7.5F, -7F);


		rightTrackModel = new ModelRendererTurbo[5];
		rightTrackModel[0] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 27
		rightTrackModel[1] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 28
		rightTrackModel[2] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 29
		rightTrackModel[3] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 30
		rightTrackModel[4] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 31

		rightTrackModel[0].addBox(0F, 0F, 0F, 3, 3, 5, 0F); // Box 27
		rightTrackModel[0].setRotationPoint(-4F, -10.5F, 1F);
		rightTrackModel[0].rotateAngleY = -0.19198622F;

		rightTrackModel[1].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 28
		rightTrackModel[1].setRotationPoint(3F, -12.5F, -6F);
		rightTrackModel[1].rotateAngleY = 1.74532925F;

		rightTrackModel[2].addBox(0F, 0F, 0F, 2, 3, 4, 0F); // Box 29
		rightTrackModel[2].setRotationPoint(-4F, -4.5F, 1F);
		rightTrackModel[2].rotateAngleY = -0.12217305F;

		rightTrackModel[3].addBox(0F, 0F, 0F, 4, 3, 7, 0F); // Box 30
		rightTrackModel[3].setRotationPoint(-4F, -1.5F, -1F);
		rightTrackModel[3].rotateAngleY = -0.03490659F;

		rightTrackModel[4].addBox(0F, 0F, 0F, 2, 5, 3, 0F); // Box 31
		rightTrackModel[4].setRotationPoint(-2F, -3.5F, -6F);
		rightTrackModel[4].rotateAngleY = 0.34906585F;



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}