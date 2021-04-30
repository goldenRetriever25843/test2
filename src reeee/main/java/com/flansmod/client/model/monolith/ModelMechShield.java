//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMechShield extends ModelGun //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelMechShield() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[18];
		gunModel[0] = new ModelRendererTurbo(this, 125, 89, textureX, textureY); // Box 1
		gunModel[1] = new ModelRendererTurbo(this, 125, 89, textureX, textureY); // Box 2
		gunModel[2] = new ModelRendererTurbo(this, 125, 89, textureX, textureY); // Box 3
		gunModel[3] = new ModelRendererTurbo(this, 170, 53, textureX, textureY); // Box 4
		gunModel[4] = new ModelRendererTurbo(this, 169, 149, textureX, textureY); // Box 5
		gunModel[5] = new ModelRendererTurbo(this, 169, 149, textureX, textureY); // Box 6
		gunModel[6] = new ModelRendererTurbo(this, 89, 150, textureX, textureY); // Box 7
		gunModel[7] = new ModelRendererTurbo(this, 89, 121, textureX, textureY); // Box 8
		gunModel[8] = new ModelRendererTurbo(this, 89, 179, textureX, textureY); // Box 9
		gunModel[9] = new ModelRendererTurbo(this, 173, 173, textureX, textureY); // Box 10
		gunModel[10] = new ModelRendererTurbo(this, 188, 199, textureX, textureY); // Box 11
		gunModel[11] = new ModelRendererTurbo(this, 155, 190, textureX, textureY); // Box 12
		gunModel[12] = new ModelRendererTurbo(this, 196, 173, textureX, textureY); // Box 13
		gunModel[13] = new ModelRendererTurbo(this, 211, 155, textureX, textureY); // Box 14
		gunModel[14] = new ModelRendererTurbo(this, 174, 1, textureX, textureY); // Box 15
		gunModel[15] = new ModelRendererTurbo(this, 167, 11, textureX, textureY); // Box 16
		gunModel[16] = new ModelRendererTurbo(this, 167, 11, textureX, textureY); // Box 17
		gunModel[17] = new ModelRendererTurbo(this, 9, 11, textureX, textureY); // Box 18

		gunModel[0].addBox(0F, -1F, -8F, 2, 3, 16, 0F); // Box 1
		gunModel[0].setRotationPoint(0F, 0F, 0F);

		gunModel[1].addShapeBox(0F, -1F, -9F, 9, 3, 2, 0F, 0F, 0F, 0F, 0F, -.5F, 3F, 0F, -.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 3F, 0F, 2F, -3F, 0F, 0F, 0F); // Box 2
		gunModel[1].setRotationPoint(0F, 0F, 0F);

		gunModel[2].addShapeBox(0F, -1F, 7F, 9, 3, 2, 0F, 0F, 0F, 0F, 0F, -.5F, -3F, 0F, -.5F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -3F, 0F, 2F, 3F, 0F, 0F, 0F); // Box 3
		gunModel[2].setRotationPoint(0F, 0F, 0F);

		gunModel[3].addBox(9F, -7F, -16F, 6, 59, 32, 0F); // Box 4
		gunModel[3].setRotationPoint(0F, 0F, 0F);

		gunModel[4].addBox(9F, 52F, 10F, 6, 6, 6, 0F); // Box 5
		gunModel[4].setRotationPoint(0F, 0F, 0F);

		gunModel[5].addBox(9F, 52F, -16F, 6, 6, 6, 0F); // Box 6
		gunModel[5].setRotationPoint(0F, 0F, 0F);

		gunModel[6].addBox(6F, 56F, -10F, 12, 4, 20, 0F); // Box 7
		gunModel[6].setRotationPoint(0F, 0F, 0F);

		gunModel[7].addShapeBox(6F, 52F, -10F, 12, 4, 20, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		gunModel[7].setRotationPoint(0F, 0F, 0F);

		gunModel[8].addShapeBox(6F, 60F, -10F, 12, 4, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 9
		gunModel[8].setRotationPoint(0F, 0F, 0F);

		gunModel[9].addShapeBox(3F, 46F, 12F, 6, 12, 2, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		gunModel[9].setRotationPoint(0F, 0F, 0F);

		gunModel[10].addShapeBox(3F, 46F, -12F, 6, 2, 24, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -2F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 5F, 0F); // Box 11
		gunModel[10].setRotationPoint(0F, 0F, 0F);

		gunModel[11].addBox(3F, 53F, -12F, 2, 5, 24, 0F); // Box 12
		gunModel[11].setRotationPoint(0F, 0F, 0F);

		gunModel[12].addShapeBox(3F, 46F, -14F, 6, 12, 2, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		gunModel[12].setRotationPoint(0F, 0F, 0F);

		gunModel[13].addShapeBox(15F, 47F, -5F, 2, 5, 10, 0F, 0F, 0F, -.5F, -2F, 0F, -.5F, -2F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		gunModel[13].setRotationPoint(0F, 0F, 0F);

		gunModel[14].addShapeBox(9F, -22F, -16F, 6, 15, 32, 0F, 14F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		gunModel[14].setRotationPoint(0F, 0F, 0F);

		gunModel[15].addShapeBox(-5F, -28F, 9F, 6, 6, 7, 0F, 3F, -3F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 3F, -3F, 0F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		gunModel[15].setRotationPoint(0F, 0F, 0F);

		gunModel[16].addShapeBox(-5F, -28F, -16F, 6, 6, 7, 0F, 3F, -3F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 2F); // Box 17
		gunModel[16].setRotationPoint(0F, 0F, 0F);

		gunModel[17].addShapeBox(15.05F, -8F, -25F, 0, 60, 50, 0F, 0F, -7F, -9F, 0F, -7F, -9F, 0F, -7F, -9F, 0F, -7F, -9F, 0F, -7F, -9F, 0F, -7F, -9F, 0F, -7F, -9F, 0F, -7F, -9F); // Box 18
		gunModel[17].setRotationPoint(0F, 0F, 0F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}