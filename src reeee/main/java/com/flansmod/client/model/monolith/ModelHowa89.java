//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.4.2
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelHowa89 extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelHowa89() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[38];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 6
		gunModel[7] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 7
		gunModel[8] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 8
		gunModel[9] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 9
		gunModel[10] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 10
		gunModel[11] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 11
		gunModel[12] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 12
		gunModel[13] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 18
		gunModel[14] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 19
		gunModel[15] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 20
		gunModel[16] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 21
		gunModel[17] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 22
		gunModel[18] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 23
		gunModel[19] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 24
		gunModel[20] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 25
		gunModel[21] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 33
		gunModel[22] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 34
		gunModel[23] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 35
		gunModel[24] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 36
		gunModel[25] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 37
		gunModel[26] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 38
		gunModel[27] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 39
		gunModel[28] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 52
		gunModel[29] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 53
		gunModel[30] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 54
		gunModel[31] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 56
		gunModel[32] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 57
		gunModel[33] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 58
		gunModel[34] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 59
		gunModel[35] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 60
		gunModel[36] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 67
		gunModel[37] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 68

		gunModel[0].addBox(0F, 0F, 0F, 26, 4, 4, 0F); // Box 0
		gunModel[0].setRotationPoint(-7F, -12F, -2F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 1
		gunModel[1].setRotationPoint(-7F, -8F, -2F);

		gunModel[2].addBox(0F, 0F, 0F, 11, 2, 4, 0F); // Box 2
		gunModel[2].setRotationPoint(3F, -8F, -2F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 3
		gunModel[3].setRotationPoint(14F, -8F, -2F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Box 4
		gunModel[4].setRotationPoint(-4F, -5F, -1.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[5].setRotationPoint(-4F, -8F, -1.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		gunModel[6].setRotationPoint(2F, -7F, -1.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 7
		gunModel[7].setRotationPoint(9F, -5F, -1.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2.5F, 0F, 0F); // Box 8
		gunModel[8].setRotationPoint(9F, -3F, -1.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 9
		gunModel[9].setRotationPoint(2F, -1.5F, -1.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 6, 7, 3, 0F, 3F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 3F, 0F, 0F, 6.5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 6.5F, 0F, 0F); // Box 10
		gunModel[10].setRotationPoint(-4F, -1F, -1.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 6, 7, 3, 0F, 3F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 3F, 0F, 0F, 6.5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 6.5F, 0F, 0F); // Box 11
		gunModel[11].setRotationPoint(-4F, -1F, -1.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0.7F, 0.2F, 0F, 0.7F, 0.2F, 0F, 0F, -1.5F, 0F); // Box 12
		gunModel[12].setRotationPoint(-10.5F, 6F, -1.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 18
		gunModel[13].setRotationPoint(-7F, -12F, -2F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F); // Box 19
		gunModel[14].setRotationPoint(-2F, -12F, -2F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 20
		gunModel[15].setRotationPoint(2F, -12F, -2F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 29, 1, 2, 0F, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 21
		gunModel[16].setRotationPoint(-7F, -12F, 0F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 15, 2, 2, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 22
		gunModel[17].setRotationPoint(-7F, -14F, -2F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 23
		gunModel[18].setRotationPoint(18F, -14F, -2F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 29, 2, 2, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 24
		gunModel[19].setRotationPoint(-7F, -14F, 0F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 29, 2, 4, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		gunModel[20].setRotationPoint(-7F, -16F, -2F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 33
		gunModel[21].setRotationPoint(19F, -11F, -1F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 23, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, -1.5F); // Box 34
		gunModel[22].setRotationPoint(21.5F, -12F, -2.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 23, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		gunModel[23].setRotationPoint(21.5F, -14F, -2.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 23, 2, 5, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 36
		gunModel[24].setRotationPoint(21.5F, -16.5F, -2.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 37
		gunModel[25].setRotationPoint(44.5F, -16F, -2F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		gunModel[26].setRotationPoint(44.5F, -14.5F, -2F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 39
		gunModel[27].setRotationPoint(44.5F, -12.5F, -2F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 52
		gunModel[28].setRotationPoint(-0.5F, -19.3F, -1F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		gunModel[29].setRotationPoint(-2F, -17F, 0F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -1.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F); // Box 54
		gunModel[30].setRotationPoint(-2F, -19.5F, -1F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -1.5F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 56
		gunModel[31].setRotationPoint(-2F, -19.5F, 0F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 57
		gunModel[32].setRotationPoint(-2F, -17F, -1F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F); // Box 58
		gunModel[33].setRotationPoint(-0.5F, -19.85F, -1F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 59
		gunModel[34].setRotationPoint(-0.5F, -19F, -1.75F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 60
		gunModel[35].setRotationPoint(-0.5F, -19F, 0.75F);

		gunModel[36].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 67
		gunModel[36].setRotationPoint(-0.5F, -10F, -2.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -1.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		gunModel[37].setRotationPoint(-1.5F, -9F, -2.3F);


		defaultBarrelModel = new ModelRendererTurbo[17];
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 41
		defaultBarrelModel[1] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 42
		defaultBarrelModel[2] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 43
		defaultBarrelModel[3] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 44
		defaultBarrelModel[4] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 45
		defaultBarrelModel[5] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 46
		defaultBarrelModel[6] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 47
		defaultBarrelModel[7] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 48
		defaultBarrelModel[8] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 49
		defaultBarrelModel[9] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 50
		defaultBarrelModel[10] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 51
		defaultBarrelModel[11] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 61
		defaultBarrelModel[12] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 62
		defaultBarrelModel[13] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 63
		defaultBarrelModel[14] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 64
		defaultBarrelModel[15] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 65
		defaultBarrelModel[16] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 66

		defaultBarrelModel[0].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 41
		defaultBarrelModel[0].setRotationPoint(55.5F, -14F, -1F);

		defaultBarrelModel[1].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 42
		defaultBarrelModel[1].setRotationPoint(69.5F, -14F, -1F);

		defaultBarrelModel[2].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 43
		defaultBarrelModel[2].setRotationPoint(55.5F, -16F, -1F);

		defaultBarrelModel[3].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		defaultBarrelModel[3].setRotationPoint(55.5F, -14F, -1F);

		defaultBarrelModel[4].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		defaultBarrelModel[4].setRotationPoint(59F, -14F, -1F);

		defaultBarrelModel[5].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		defaultBarrelModel[5].setRotationPoint(62.5F, -14F, -1F);

		defaultBarrelModel[6].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		defaultBarrelModel[6].setRotationPoint(59F, -13F, -2F);

		defaultBarrelModel[7].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		defaultBarrelModel[7].setRotationPoint(59.5F, -12F, -2F);
		defaultBarrelModel[7].rotateAngleX = -0.43633231F;

		defaultBarrelModel[8].addShapeBox(0F, 0F, 0F, 2, 35, 2, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 49
		defaultBarrelModel[8].setRotationPoint(59.5F, -12F, -2F);
		defaultBarrelModel[8].rotateAngleX = -0.43633231F;

		defaultBarrelModel[9].addShapeBox(0F, 0F, 0F, 2, 35, 2, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 50
		defaultBarrelModel[9].setRotationPoint(59.5F, -12F, 0F);
		defaultBarrelModel[9].rotateAngleX = 0.43633231F;

		defaultBarrelModel[10].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 51
		defaultBarrelModel[10].setRotationPoint(59.5F, -12F, 0F);
		defaultBarrelModel[10].rotateAngleX = 0.43633231F;

		defaultBarrelModel[11].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 61
		defaultBarrelModel[11].setRotationPoint(55F, -18F, -0.5F);

		defaultBarrelModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 62
		defaultBarrelModel[12].setRotationPoint(54.5F, -18.5F, -0.5F);

		defaultBarrelModel[13].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F); // Box 63
		defaultBarrelModel[13].setRotationPoint(54.5F, -20.5F, -1.1F);
		defaultBarrelModel[13].rotateAngleX = 0.06981317F;

		defaultBarrelModel[14].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F); // Box 64
		defaultBarrelModel[14].setRotationPoint(54.5F, -20.5F, 0.1F);
		defaultBarrelModel[14].rotateAngleX = -0.06981317F;

		defaultBarrelModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F); // Box 65
		defaultBarrelModel[15].setRotationPoint(55F, -19F, -0.5F);

		defaultBarrelModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F); // Box 66
		defaultBarrelModel[16].setRotationPoint(55F, -20F, -0.5F);


		defaultStockModel = new ModelRendererTurbo[3];
		defaultStockModel[0] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 29
		defaultStockModel[1] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 30
		defaultStockModel[2] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 31

		defaultStockModel[0].addShapeBox(0F, 0F, 0F, 27, 16, 4, 0F, 0F, 0F, 0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -8.5F, -0.5F, 0F, -8.5F, -0.5F, 0F, 0F, 0.5F); // Box 29
		defaultStockModel[0].setRotationPoint(-41F, -14F, -2F);

		defaultStockModel[1].addShapeBox(0F, 0F, 0F, 7, 6, 3, 0F, 0F, 0F, 0F, 0F, 3.5F, -0.2F, 0F, 3.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F); // Box 30
		defaultStockModel[1].setRotationPoint(-14F, -12.5F, -1.5F);

		defaultStockModel[2].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 31
		defaultStockModel[2].setRotationPoint(-7F, -8.5F, -1.5F);


		ammoModel = new ModelRendererTurbo[5];
		ammoModel[0] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 13
		ammoModel[1] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 14
		ammoModel[2] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 15
		ammoModel[3] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 16
		ammoModel[4] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 17

		ammoModel[0].addShapeBox(0F, 0F, 0F, 8, 8, 4, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 13
		ammoModel[0].setRotationPoint(10.25F, -8F, -2F);
		ammoModel[0].rotateAngleZ = 0.05235988F;

		ammoModel[1].addShapeBox(0F, 0F, 0F, 8, 8, 4, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 14
		ammoModel[1].setRotationPoint(10.25F, -8F, -2F);
		ammoModel[1].rotateAngleZ = 0.05235988F;

		ammoModel[2].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 15
		ammoModel[2].setRotationPoint(10.65F, -0.05F, -2F);
		ammoModel[2].rotateAngleZ = 0.10471976F;

		ammoModel[3].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 16
		ammoModel[3].setRotationPoint(11.08F, 3.92F, -2F);
		ammoModel[3].rotateAngleZ = 0.20943951F;

		ammoModel[4].addShapeBox(0F, 0F, 0F, 8, 6, 4, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 17
		ammoModel[4].setRotationPoint(11.92F, 7.8F, -2F);
		ammoModel[4].rotateAngleZ = 0.34906585F;


		slideModel = new ModelRendererTurbo[4];
		slideModel[0] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 26
		slideModel[1] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 27
		slideModel[2] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 28
		slideModel[3] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 32

		slideModel[0].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 26
		slideModel[0].setRotationPoint(7F, -14F, -1.5F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		slideModel[1].setRotationPoint(17F, -14.8F, -4F);
		slideModel[1].rotateAngleX = -0.34906585F;

		slideModel[2].addShapeBox(0F, 0.5F, 1F, 1, 1, 3, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F); // Box 28
		slideModel[2].setRotationPoint(17F, -14.8F, -4F);
		slideModel[2].rotateAngleX = -0.34906585F;

		slideModel[3].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 32
		slideModel[3].setRotationPoint(4.5F, -5F, -1F);


		gunSlideDistance = 0.35F;
		animationType = EnumAnimationType.BULLPUP;
		translateAll(0F, -2F, 0F);


		flipAll();
	}
}