//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 14.08.2016 - 15:35:41
// Last changed on: 14.08.2016 - 15:35:41

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelRaftManual extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelRaftManual() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[27];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 24
		bodyModel[23] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 25
		bodyModel[24] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 26
		bodyModel[25] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 27
		bodyModel[26] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 28

		bodyModel[0].addShapeBox(0F, 0F, 0F, 35, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 0
		bodyModel[0].setRotationPoint(-6F, 0F, -8F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 10, 4, 16, 0F,0F, 0F, 0F, -1F, 0F, -8F, -1F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -8F, -1F, -4F, -8F, -1F, -4F, -8F, 0F, 0F, -8F); // Box 1
		bodyModel[1].setRotationPoint(29F, 0F, -8F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 35, 2, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-6F, -3F, 5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 35, 2, 5, 0F,0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-6F, -4.5F, 5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 35, 2, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 4
		bodyModel[4].setRotationPoint(-6F, -1.5F, 5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 35, 2, 5, 0F,0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-6F, -4.5F, -10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 35, 2, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(-6F, -3F, -10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 35, 2, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 7
		bodyModel[7].setRotationPoint(-6F, -1.5F, -10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[8].setRotationPoint(29F, -3F, -10F);
		bodyModel[8].rotateAngleY = 0.61086524F;

		bodyModel[9].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[9].setRotationPoint(29F, -4.5F, -10F);
		bodyModel[9].rotateAngleY = 0.61086524F;

		bodyModel[10].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 10
		bodyModel[10].setRotationPoint(29F, -1.5F, -10F);
		bodyModel[10].rotateAngleY = 0.61086524F;

		bodyModel[11].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[11].setRotationPoint(29F, -4.5F, -10F);
		bodyModel[11].rotateAngleY = 0.61086524F;

		bodyModel[12].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[12].setRotationPoint(29F, -3F, -10F);
		bodyModel[12].rotateAngleY = 0.61086524F;

		bodyModel[13].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 13
		bodyModel[13].setRotationPoint(29F, -1.5F, -10F);
		bodyModel[13].rotateAngleY = 0.61086524F;

		bodyModel[14].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[14].setRotationPoint(26F, -4.5F, 6F);
		bodyModel[14].rotateAngleY = -0.61086524F;

		bodyModel[15].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[15].setRotationPoint(26F, -3F, 6F);
		bodyModel[15].rotateAngleY = -0.61086524F;

		bodyModel[16].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 16
		bodyModel[16].setRotationPoint(26F, -1.5F, 6F);
		bodyModel[16].rotateAngleY = -0.61086524F;

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[17].setRotationPoint(35F, -3F, -3F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, -0.5F, 0F, -1.25F, -0.5F, -1F, -1.25F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[18].setRotationPoint(35F, -4.5F, -3F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1.25F, -0.5F, -1F, -1.25F, -0.5F, -1F, 0F, -0.5F, 0F); // Box 20
		bodyModel[19].setRotationPoint(35F, -1F, -3F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 21
		bodyModel[20].setRotationPoint(-9F, -3F, 5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, -2F, -2F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 22
		bodyModel[21].setRotationPoint(-9F, -4.5F, 5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -2F, -2F); // Box 24
		bodyModel[22].setRotationPoint(-9F, -1F, 5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -2F, -2F); // Box 25
		bodyModel[23].setRotationPoint(-9F, -1F, -10F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, -2F, -2F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 26
		bodyModel[24].setRotationPoint(-9F, -4.5F, -10F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 27
		bodyModel[25].setRotationPoint(-9F, -3F, -10F);

		bodyModel[26].addBox(0F, 0F, 0F, 1, 3, 12, 0F); // Box 28
		bodyModel[26].setRotationPoint(-6F, -3F, -6F);
	}
}