//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelDesk extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelDesk() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[35];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 10
		bodyModel[8] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 11
		bodyModel[9] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 12
		bodyModel[10] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 13
		bodyModel[11] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 14
		bodyModel[12] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 15
		bodyModel[13] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 16
		bodyModel[14] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 17
		bodyModel[15] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 18
		bodyModel[16] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 19
		bodyModel[17] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 20
		bodyModel[18] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 21
		bodyModel[19] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 22
		bodyModel[20] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 23
		bodyModel[21] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 24
		bodyModel[22] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 25
		bodyModel[23] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 26
		bodyModel[24] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 27
		bodyModel[25] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 28
		bodyModel[26] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 29
		bodyModel[27] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 30
		bodyModel[28] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 31
		bodyModel[29] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 32
		bodyModel[30] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 33
		bodyModel[31] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 34
		bodyModel[32] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 35
		bodyModel[33] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 36
		bodyModel[34] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 37

		bodyModel[0].addBox(0F, 0F, 0F, 16, 3, 16, 0F); // Box 0
		bodyModel[0].setRotationPoint(-4F, -5F, -8F);

		bodyModel[1].addBox(0F, 0F, 0F, 2, 12, 2, 0F); // Box 1
		bodyModel[1].setRotationPoint(-4F, -2F, -8F);

		bodyModel[2].addBox(0F, 0F, 0F, 2, 12, 2, 0F); // Box 2
		bodyModel[2].setRotationPoint(-4F, -2F, 6F);

		bodyModel[3].addBox(0F, 0F, 0F, 2, 12, 2, 0F); // Box 3
		bodyModel[3].setRotationPoint(10F, -2F, 6F);

		bodyModel[4].addBox(0F, 0F, 0F, 2, 12, 2, 0F); // Box 4
		bodyModel[4].setRotationPoint(10F, -2F, -8F);

		bodyModel[5].addBox(0F, 0F, 0F, 2, 7, 16, 0F); // Box 5
		bodyModel[5].setRotationPoint(-6F, -25F, -8F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 4, 13, 2, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 7
		bodyModel[6].setRotationPoint(-6F, -18F, 4F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 4, 13, 2, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 10
		bodyModel[7].setRotationPoint(-6F, -18F, -6F);

		bodyModel[8].addBox(0F, 0F, 0F, 16, 15, 32, 0F); // Box 11
		bodyModel[8].setRotationPoint(14F, -13F, -10F);

		bodyModel[9].addBox(0F, 0F, 0F, 37, 15, 16, 0F); // Box 12
		bodyModel[9].setRotationPoint(-7F, -13F, -26F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 13
		bodyModel[10].setRotationPoint(-7F, 2F, -12F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 14
		bodyModel[11].setRotationPoint(-7F, 2F, -26F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 15
		bodyModel[12].setRotationPoint(28F, 2F, -26F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 16
		bodyModel[13].setRotationPoint(28F, 2F, -12F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 17
		bodyModel[14].setRotationPoint(28F, 2F, 20F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 18
		bodyModel[15].setRotationPoint(14F, 2F, 20F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 19
		bodyModel[16].setRotationPoint(14F, 2F, -12F);

		bodyModel[17].addBox(0F, 0F, 0F, 6, 1, 12, 0F); // Box 20
		bodyModel[17].setRotationPoint(15F, -14F, -6F);

		bodyModel[18].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // Box 21
		bodyModel[18].setRotationPoint(23F, -14F, -4F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 22
		bodyModel[19].setRotationPoint(27F, -17F, -2F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 10, 16, 0F); // Box 23
		bodyModel[20].setRotationPoint(26F, -27F, -8F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[21].setRotationPoint(27F, -18F, -2F);

		bodyModel[22].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 25
		bodyModel[22].setRotationPoint(16F, -14F, -9F);

		bodyModel[23].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 26
		bodyModel[23].setRotationPoint(19F, -13.5F, -8.5F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 27
		bodyModel[24].setRotationPoint(25F, -13.5F, -7.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[25].setRotationPoint(25F, -13.5F, -8.5F);

		bodyModel[26].addBox(0F, 0F, 0F, 14, 14, 8, 0F); // Box 29
		bodyModel[26].setRotationPoint(-2F, -4F, 10F);

		bodyModel[27].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 30
		bodyModel[27].setRotationPoint(13.5F, -12F, 14F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 31
		bodyModel[28].setRotationPoint(13.5F, -8F, 14F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 32
		bodyModel[29].setRotationPoint(13.5F, -4F, 14F);

		bodyModel[30].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 33
		bodyModel[30].setRotationPoint(13.5F, 0F, 14F);

		bodyModel[31].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 34
		bodyModel[31].setRotationPoint(-4F, 0F, -10.5F);

		bodyModel[32].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 35
		bodyModel[32].setRotationPoint(-4F, -4F, -10.5F);

		bodyModel[33].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 36
		bodyModel[33].setRotationPoint(-4F, -8F, -10.5F);

		bodyModel[34].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 37
		bodyModel[34].setRotationPoint(-4F, -12F, -10.5F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}