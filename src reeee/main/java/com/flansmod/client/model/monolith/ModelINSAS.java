//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 19.03.2016 - 18:51:19
// Last changed on: 19.03.2016 - 18:51:19

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelINSAS extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelINSAS() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[37];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 6
		gunModel[7] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 7
		gunModel[8] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 8
		gunModel[9] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 9
		gunModel[10] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 10
		gunModel[11] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 11
		gunModel[12] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 15
		gunModel[13] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 16
		gunModel[14] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 17
		gunModel[15] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 18
		gunModel[16] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 19
		gunModel[17] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 20
		gunModel[18] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 21
		gunModel[19] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 23
		gunModel[20] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 24
		gunModel[21] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 25
		gunModel[22] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 26
		gunModel[23] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 27
		gunModel[24] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 28
		gunModel[25] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 29
		gunModel[26] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 30
		gunModel[27] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 31
		gunModel[28] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 32
		gunModel[29] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 33
		gunModel[30] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 34
		gunModel[31] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 35
		gunModel[32] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 36
		gunModel[33] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 37
		gunModel[34] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 38
		gunModel[35] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 39
		gunModel[36] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 40

		gunModel[0].addBox(0F, 0F, 0F, 15, 1, 1, 0F); // Box 0
		gunModel[0].setRotationPoint(30F, -7F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 1
		gunModel[1].setRotationPoint(45F, -7F, -0.5F);

		gunModel[2].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 2
		gunModel[2].setRotationPoint(25F, -9F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 3
		gunModel[3].setRotationPoint(35F, -9F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 13, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 1F); // Box 4
		gunModel[4].setRotationPoint(17F, -8.5F, -1.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 13, 2, 3, 0F, 0F, -0.5F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 1F, 0F, 0F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[5].setRotationPoint(17F, -5.5F, -1.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -0.1F, 0.6F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.1F, 0.6F, 0F, -0.6F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.6F, 0F); // Box 6
		gunModel[6].setRotationPoint(29F, -5.5F, -1.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 7
		gunModel[7].setRotationPoint(41F, -7F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 21, 4, 3, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0.5F, -0.2F); // Box 8
		gunModel[8].setRotationPoint(-3.5F, -8F, -1.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 19, 1, 3, 0F, -1.5F, 0.2F, -1F, 0F, 0.2F, -1F, 0F, 0.2F, -1F, -1.5F, 0.2F, -1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 9
		gunModel[9].setRotationPoint(-3.5F, -9F, -1.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 14, 2, 3, 0F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 10
		gunModel[10].setRotationPoint(15.5F, -8.75F, -1.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 11
		gunModel[11].setRotationPoint(15.5F, -9.75F, -1.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		gunModel[12].setRotationPoint(4.5F, -9.9F, -0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 16
		gunModel[13].setRotationPoint(25F, -9.7F, -0.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F); // Box 17
		gunModel[14].setRotationPoint(35.5F, -10.45F, -1F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F); // Box 18
		gunModel[15].setRotationPoint(35.5F, -10.45F, 0F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.2F, 0.2F, -0.44F, -0.2F, 0.2F, -0.44F, -0.2F, 0.2F, -0.44F, -0.2F, 0.2F, -0.44F, -0.2F, 0.2F, -0.44F, -0.2F, 0.2F, -0.44F, -0.2F, 0.2F, -0.44F, -0.2F, 0.2F, -0.44F); // Box 19
		gunModel[16].setRotationPoint(35.5F, -9.75F, -0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F); // Box 20
		gunModel[17].setRotationPoint(-1.5F, -10.2F, 0F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F); // Box 21
		gunModel[18].setRotationPoint(-1.5F, -10.2F, -1F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F); // Box 23
		gunModel[19].setRotationPoint(-1.5F, -11.6F, 0F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F); // Box 24
		gunModel[20].setRotationPoint(-1.5F, -11.6F, -1F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 16, 7, 3, 0F, 0F, 0F, -0.2F, 0F, 1F, -0.4F, 0F, 1F, -0.4F, 0F, 0F, -0.2F, 0F, 0.5F, -0.2F, 0F, -5F, -0.4F, 0F, -5F, -0.4F, 0F, 0.5F, -0.2F); // Box 25
		gunModel[21].setRotationPoint(-19.5F, -6F, -1.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 3, 9, 3, 0F, 0.5F, -0.3F, 0F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0.5F, -0.3F, 0F, 0F, 0.5F, 0F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.5F, 0F); // Box 26
		gunModel[22].setRotationPoint(-22.5F, -6.5F, -1.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.3F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.3F, 0F); // Box 27
		gunModel[23].setRotationPoint(-3F, -4F, -1F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, -0.5F, 0.3F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.5F, 0.3F, 0F, -1F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -1F, -0.5F, -0.25F); // Box 28
		gunModel[24].setRotationPoint(-3F, -2.4F, -1F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 3, 6, 2, 0F, 0F, 0F, -0.25F, -0.2F, 1F, -0.25F, -0.2F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 29
		gunModel[25].setRotationPoint(-2F, -1.9F, -1F);
		gunModel[25].rotateAngleZ = -0.34906585F;

		gunModel[26].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.3F, 0F, -1F, 0.3F, 0F, 0F, 0F, 0F); // Box 30
		gunModel[26].setRotationPoint(6.3F, -4F, -1F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, 0F, 0F, -0.45F, 0.2F, 0F, -0.45F, 0.2F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F); // Box 31
		gunModel[27].setRotationPoint(5.8F, -2F, -0.5F);
		gunModel[27].rotateAngleZ = -0.2443461F;

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F); // Box 32
		gunModel[28].setRotationPoint(5.8F, -1.5F, -0.5F);
		gunModel[28].rotateAngleZ = -1.57079633F;

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.45F, 0F, 0F, -0.45F, 0.2F, 0F, -0.45F, 0.2F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F); // Box 33
		gunModel[29].setRotationPoint(1.5F, -2.7F, -0.5F);
		gunModel[29].rotateAngleZ = 0.33161256F;

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F); // Box 34
		gunModel[30].setRotationPoint(3F, -3.7F, -0.5F);
		gunModel[30].rotateAngleZ = 0.33161256F;

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 35
		gunModel[31].setRotationPoint(16F, -12F, -1F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 36
		gunModel[32].setRotationPoint(15F, -12.5F, -0.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.4F, 0F, -0.4F, 0.1F, 0F, -0.4F, -0.9F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, 0F, -0.4F, 0.1F, 0F, -0.4F, -0.9F, -0.4F, -0.4F, -0.4F); // Box 37
		gunModel[33].setRotationPoint(15.6F, -12.5F, -0.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 38
		gunModel[34].setRotationPoint(7F, -12.8F, -0.5F);
		gunModel[34].rotateAngleZ = -0.03490659F;

		gunModel[35].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 39
		gunModel[35].setRotationPoint(22F, -9.8F, 0.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 40
		gunModel[36].setRotationPoint(25F, -9.8F, 0.5F);


		ammoModel = new ModelRendererTurbo[3];
		ammoModel[0] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 12
		ammoModel[1] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 13
		ammoModel[2] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 14

		ammoModel[0].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 12
		ammoModel[0].setRotationPoint(8F, -4.2F, -1F);
		ammoModel[0].rotateAngleZ = 0.08726646F;

		ammoModel[1].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 13
		ammoModel[1].setRotationPoint(8.2F, -2.2F, -1F);
		ammoModel[1].rotateAngleZ = 0.12217305F;

		ammoModel[2].addShapeBox(0F, 0F, 0F, 5, 4, 2, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F); // Box 14
		ammoModel[2].setRotationPoint(8.6F, 0.8F, -1F);
		ammoModel[2].rotateAngleZ = 0.27925268F;
		
		animationType = EnumAnimationType.PISTOL_CLIP;
		translateAll(0F, -0.5F, 0F);



		translateAll(0F, -3F, 0F);


		flipAll();
	}
}