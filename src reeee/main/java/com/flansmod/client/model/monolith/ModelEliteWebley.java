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

public class ModelEliteWebley extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelEliteWebley() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[40];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 6
		gunModel[7] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 7
		gunModel[8] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 8
		gunModel[9] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 9
		gunModel[10] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 10
		gunModel[11] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 11
		gunModel[12] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 12
		gunModel[13] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 13
		gunModel[14] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 14
		gunModel[15] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 15
		gunModel[16] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 19
		gunModel[17] = new ModelRendererTurbo(this, 393, 121, textureX, textureY); // Box 20
		gunModel[18] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 21
		gunModel[19] = new ModelRendererTurbo(this, 89, 129, textureX, textureY); // Box 22
		gunModel[20] = new ModelRendererTurbo(this, 201, 137, textureX, textureY); // Box 23
		gunModel[21] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 24
		gunModel[22] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 25
		gunModel[23] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 26
		gunModel[24] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 27
		gunModel[25] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 28
		gunModel[26] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 29
		gunModel[27] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 30
		gunModel[28] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 31
		gunModel[29] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 32
		gunModel[30] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 33
		gunModel[31] = new ModelRendererTurbo(this, 281, 137, textureX, textureY); // Box 34
		gunModel[32] = new ModelRendererTurbo(this, 337, 145, textureX, textureY); // Box 35
		gunModel[33] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 36
		gunModel[34] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Box 37
		gunModel[35] = new ModelRendererTurbo(this, 393, 153, textureX, textureY); // Box 38
		gunModel[36] = new ModelRendererTurbo(this, 457, 153, textureX, textureY); // Box 39
		gunModel[37] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 40
		gunModel[38] = new ModelRendererTurbo(this, 89, 161, textureX, textureY); // Box 41
		gunModel[39] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 42

		gunModel[0].addShapeBox(0F, 0F, 0F, 28, 11, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F); // Box 0
		gunModel[0].setRotationPoint(-32F, -54F, 0F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 21, 13, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -2F, 0F, 0F); // Box 1
		gunModel[1].setRotationPoint(-25F, -43F, 0F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 40, 11, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 2
		gunModel[2].setRotationPoint(-4F, -49F, 0F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 28, 9, 14, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		gunModel[3].setRotationPoint(-32F, -63F, 0F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 12, 8, 14, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		gunModel[4].setRotationPoint(-18F, -71F, 0F);

		gunModel[5].addBox(0F, 0F, 0F, 2, 19, 14, 0F); // Box 5
		gunModel[5].setRotationPoint(-6F, -82F, 0F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 10, 6, 14, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		gunModel[6].setRotationPoint(-6F, -88F, 0F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 32, 5, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		gunModel[7].setRotationPoint(4F, -87F, 0F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 9, 33, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		gunModel[8].setRotationPoint(27F, -82F, 0F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 101, 7, 14, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		gunModel[9].setRotationPoint(36F, -85F, 0F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 101, 8, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 10
		gunModel[10].setRotationPoint(36F, -78F, 0F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 30, 9, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 11
		gunModel[11].setRotationPoint(36F, -70F, 0F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 17, 10, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 12
		gunModel[12].setRotationPoint(36F, -61F, 0F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 7, 3, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 13
		gunModel[13].setRotationPoint(36F, -51F, 0F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 6, 3, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 14
		gunModel[14].setRotationPoint(36F, -48F, 0F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 4, 2, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 15
		gunModel[15].setRotationPoint(36F, -45F, 0F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 28, 13, 16, 0F, -4F, -2F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		gunModel[16].setRotationPoint(-53F, -56F, -1F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 38, 13, 16, 0F, -8F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		gunModel[17].setRotationPoint(-61F, -43F, -1F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 24, 40, 16, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		gunModel[18].setRotationPoint(-76F, -30F, -1F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 37, 8, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		gunModel[19].setRotationPoint(-76F, 10F, -1F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 29, 40, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F); // Box 23
		gunModel[20].setRotationPoint(-52F, -30F, -1F);

		gunModel[21].addBox(0F, 0F, 0F, 7, 21, 10, 0F); // Box 24
		gunModel[21].setRotationPoint(-13F, -89F, 2F);

		gunModel[22].addBox(0F, 0F, 0F, 11, 11, 8, 0F); // Box 25
		gunModel[22].setRotationPoint(-24F, -70F, 3F);

		gunModel[23].addBox(0F, 0F, 0F, 5, 19, 6, 0F); // Box 26
		gunModel[23].setRotationPoint(-18F, -89F, 4F);

		gunModel[24].addBox(0F, 0F, 0F, 3, 17, 8, 0F); // Box 27
		gunModel[24].setRotationPoint(-21F, -87F, 3F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 15, 10, 8, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 28
		gunModel[25].setRotationPoint(-36F, -79F, 3F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 4, 4, 8, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		gunModel[26].setRotationPoint(-25F, -77F, 3F);

		gunModel[27].addBox(0F, 0F, 0F, 7, 3, 2, 0F); // Box 30
		gunModel[27].setRotationPoint(-13F, -92F, 2F);

		gunModel[28].addBox(0F, 0F, 0F, 7, 3, 2, 0F); // Box 31
		gunModel[28].setRotationPoint(-13F, -92F, 10F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 23, 5, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		gunModel[29].setRotationPoint(112F, -90F, 6F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 19, 2, 2, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		gunModel[30].setRotationPoint(114F, -92F, 6F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 21, 5, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		gunModel[31].setRotationPoint(9F, -43F, 3F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 21, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -9F, 0F, 0F); // Box 35
		gunModel[32].setRotationPoint(9F, -38F, 3F);

		gunModel[33].addBox(0F, 0F, 0F, 4, 10, 8, 0F); // Box 36
		gunModel[33].setRotationPoint(18F, -35F, 3F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 13, 12, 8, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F); // Box 37
		gunModel[34].setRotationPoint(9F, -25F, 3F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 21, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 38
		gunModel[35].setRotationPoint(-8F, -13F, 3F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 13, 12, 8, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F); // Box 39
		gunModel[36].setRotationPoint(-17F, -25F, 3F);

		gunModel[37].addBox(0F, 0F, 0F, 4, 6, 8, 0F); // Box 40
		gunModel[37].setRotationPoint(-17F, -31F, 3F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 19, 12, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 41
		gunModel[38].setRotationPoint(-24F, -38F, 3F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 12, 7, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 42
		gunModel[39].setRotationPoint(-5F, -40F, 3F);


		ammoModel = new ModelRendererTurbo[6];
		ammoModel[0] = new ModelRendererTurbo(this, 337, 169, textureX, textureY); // Box 0
		ammoModel[1] = new ModelRendererTurbo(this, 337, 169, textureX, textureY); // Box 1
		ammoModel[2] = new ModelRendererTurbo(this, 337, 169, textureX, textureY); // Box 3
		ammoModel[3] = new ModelRendererTurbo(this, 337, 169, textureX, textureY); // Box 5
		ammoModel[4] = new ModelRendererTurbo(this, 337, 169, textureX, textureY); // Box 7
		ammoModel[5] = new ModelRendererTurbo(this, 337, 169, textureX, textureY); // Box 9

		ammoModel[0].addShapeBox(3F, -3F, 2F, 25, 7, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		ammoModel[0].setRotationPoint(-4F, -66F, -10F);

		ammoModel[1].addShapeBox(3F, 8F, 9F, 25, 7, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		ammoModel[1].setRotationPoint(-4F, -66F, -10F);

		ammoModel[2].addShapeBox(3F, 8F, 18F, 25, 7, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		ammoModel[2].setRotationPoint(-4F, -66F, -10F);

		ammoModel[3].addShapeBox(3F, -14F, 18F, 25, 7, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		ammoModel[3].setRotationPoint(-4F, -66F, -10F);

		ammoModel[4].addShapeBox(3F, -14F, 9F, 25, 7, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		ammoModel[4].setRotationPoint(-4F, -66F, -10F);

		ammoModel[5].addShapeBox(3F, -3F, 25F, 25, 7, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		ammoModel[5].setRotationPoint(-4F, -66F, -10F);


		slideModel = new ModelRendererTurbo[3];
		slideModel[0] = new ModelRendererTurbo(this, 473, 105, textureX, textureY); // Box 43
		slideModel[1] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 44
		slideModel[2] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 45

		slideModel[0].addShapeBox(0F, 0F, 0F, 13, 9, 4, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F); // Box 43
		slideModel[0].setRotationPoint(-2F, -40F, 5F);

		slideModel[1].addBox(0F, 0F, 0F, 4, 6, 4, 0F); // Box 44
		slideModel[1].setRotationPoint(-2F, -31F, 5F);

		slideModel[2].addShapeBox(0F, 0F, 0F, 7, 8, 4, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 45
		slideModel[2].setRotationPoint(-2F, -25F, 5F);


		revolverBarrelModel = new ModelRendererTurbo[3];
		revolverBarrelModel[0] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 16
		revolverBarrelModel[1] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 17
		revolverBarrelModel[2] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 18

		revolverBarrelModel[0].addShapeBox(0F, -16F, 0F, 31, 11, 34, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		revolverBarrelModel[0].setRotationPoint(-4F, -66F, -10F);

		revolverBarrelModel[1].addShapeBox(0F, 6F, 0F, 31, 11, 34, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 17
		revolverBarrelModel[1].setRotationPoint(-4F, -66F, -10F);

		revolverBarrelModel[2].addShapeBox(0F, -5F, 0F, 31, 11, 34, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		revolverBarrelModel[2].setRotationPoint(-4F, -66F, -10F);

		gunSlideDistance = 0.1F;
		animationType = EnumAnimationType.REVOLVER;

		translateAll(0F, -5F, -8F);


		flipAll();
	}
}