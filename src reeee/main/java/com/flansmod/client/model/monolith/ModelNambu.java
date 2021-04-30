//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.2.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelNambu extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelNambu()
	{
		gunModel = new ModelRendererTurbo[35];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 6
		gunModel[7] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 7
		gunModel[8] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 12
		gunModel[9] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 13
		gunModel[10] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 14
		gunModel[11] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 15
		gunModel[12] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 16
		gunModel[13] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 18
		gunModel[14] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 20
		gunModel[15] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 21
		gunModel[16] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 22
		gunModel[17] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 23
		gunModel[18] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 24
		gunModel[19] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 25
		gunModel[20] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 26
		gunModel[21] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 27
		gunModel[22] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 28
		gunModel[23] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 29
		gunModel[24] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 30
		gunModel[25] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 31
		gunModel[26] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 32
		gunModel[27] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 33
		gunModel[28] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 34
		gunModel[29] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 35
		gunModel[30] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 36
		gunModel[31] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 37
		gunModel[32] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 38
		gunModel[33] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 39
		gunModel[34] = new ModelRendererTurbo(this, 0, 22, textureX, textureY); // Box 40

		gunModel[0].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, 0F, 0.1F, 0F, 3.15F, 0.1F, 0F, 3.15F, 0.1F, 0F, 0F, 0.1F, 0F, 3F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 3F, 0.1F); // Box 0
		gunModel[0].setRotationPoint(-7F, -4F, -1.5F);
		gunModel[0].rotateAngleZ = -0.41887902F;

		gunModel[1].addBox(0F, 0F, 0F, 5, 17, 3, 0F); // Box 1
		gunModel[1].setRotationPoint(-7F, -4F, -1.5F);
		gunModel[1].rotateAngleZ = -0.41887902F;

		gunModel[2].addShapeBox(4F, 3F, 0F, 1, 11, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 2
		gunModel[2].setRotationPoint(-5.9F, -4F, -1.5F);
		gunModel[2].rotateAngleZ = -0.41887902F;

		gunModel[3].addShapeBox(0F, 17F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 3
		gunModel[3].setRotationPoint(-7F, -4F, -1.5F);
		gunModel[3].rotateAngleZ = -0.41887902F;

		gunModel[4].addShapeBox(4F, 14F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 4
		gunModel[4].setRotationPoint(-5.9F, -4F, -1.5F);
		gunModel[4].rotateAngleZ = -0.41887902F;

		gunModel[5].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.7F, 0F); // Box 5
		gunModel[5].setRotationPoint(-2F, -6.2F, -1.4F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.3F, 0F, 0F, 2.3F, 0F, 0F, 0F, 0F, 0F); // Box 6
		gunModel[6].setRotationPoint(-14F, -7.7F, -1.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -0.5F, 0.4F, 0F, -0.5F, 0.4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F); // Box 7
		gunModel[7].setRotationPoint(-14F, -8.7F, -1.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F,0F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.7F, -0.3F, 0.3F, 0.7F, -0.3F, 0.3F, 0.7F, -0.3F, 0F, 0.7F, -0.3F); // Box 12
		gunModel[8].setRotationPoint(-13.5F, -5.5F, -1.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F,0F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.7F, -0.3F, 0.3F, 0.7F, -0.3F, 0.3F, 0.7F, -0.3F, 0F, 0.7F, -0.3F); // Box 13
		gunModel[9].setRotationPoint(-12.5F, -4.5F, -1.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.7F, -0.3F, 0F, 0.7F, -0.3F, 0F, 0F, -0.3F); // Box 14
		gunModel[10].setRotationPoint(-13.5F, -3.5F, -1.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.7F, -0.3F, 0.5F, 0.7F, -0.3F, 0.5F, 0.7F, -0.3F, 0F, 0.7F, -0.3F); // Box 15
		gunModel[11].setRotationPoint(-12F, -7.7F, -1.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, 0F, -0.9F, 0.5F, 0F, -0.9F, 0.5F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.4F, -0.3F, 0.5F, -0.4F, -0.3F, 0.5F, -0.4F, -0.3F, 0F, -0.4F, -0.3F); // Box 16
		gunModel[12].setRotationPoint(-12F, -8.3F, -1.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0F, 0F, -0.3F, -2F, 0.7F, -0.3F, 0.3F, 0.7F, -0.3F, 0.3F, 0.7F, -0.3F, -2F, 0.7F, -0.3F); // Box 18
		gunModel[13].setRotationPoint(-10.55F, -2.5F, -1.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F,0F, 0F, -0.8F, 0.3F, 0F, -0.8F, 0.3F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0.7F, -0.8F, 0.3F, 0.7F, -0.8F, 0.3F, 0.7F, -0.8F, 0F, 0.7F, -0.8F); // Box 20
		gunModel[14].setRotationPoint(-2.8F, -5.2F, -1.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, -0.8F, 0.3F, 0F, -0.8F, 0.3F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 4F, -0.8F, 0.3F, 0F, -0.8F, 0.3F, 0F, -0.8F, 0F, 4F, -0.8F); // Box 21
		gunModel[15].setRotationPoint(-2.8F, -5F, -1.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 4, 4, 3, 0F,0F, 0F, -0.8F, 0.5F, 0F, -0.8F, 0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0.6F, -0.8F, 0.2F, 0.4F, -0.8F, 0.2F, 0.4F, -0.8F, 0F, 0.6F, -0.8F); // Box 22
		gunModel[16].setRotationPoint(-4.8F, -3F, -1.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -1F, -0.8F, -0.7F, 0F, -0.8F, -0.7F, 0F, -0.8F, 0F, -1F, -0.8F, -2F, 0.7F, -0.8F, 0.8F, 0.7F, -0.8F, 0.8F, 0.7F, -0.8F, -2F, 0.7F, -0.8F); // Box 23
		gunModel[17].setRotationPoint(1.8F, -3.6F, -1.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.5F, 0F, -0.8F, -1.8F, 0F, -0.8F, 1F, 0F, -0.8F, 1F, 0F, -0.8F, -1.8F, 0F, -0.8F); // Box 24
		gunModel[18].setRotationPoint(4.6F, -1.9F, -1.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F, -1.1F, 0.6F, -0.8F, 0.3F, 0.6F, -0.8F, 0.3F, 0.6F, -0.8F, -1.1F, 0.6F, -0.8F); // Box 25
		gunModel[19].setRotationPoint(5.6F, -0.9F, -1.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1.1F, 0.6F, -0.8F, 0.3F, 0.6F, -0.8F, 0.3F, 0.6F, -0.8F, -1.1F, 0.6F, -0.8F, -0.3F, -0.5F, -0.8F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F, -0.8F, -0.3F, -0.5F, -0.8F); // Box 26
		gunModel[20].setRotationPoint(5.6F, 1.3F, -1.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-0.4F, 0F, -0.8F, -0.5F, 0.2F, -0.8F, -0.5F, 0.2F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F); // Box 27
		gunModel[21].setRotationPoint(5.7F, 1.4F, -1.5F);
		gunModel[21].rotateAngleZ = -1.23918377F;

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.8F, 0.5F, 0F, -0.8F, 0.5F, 0F, -0.8F, 0F, 0F, -0.8F, -4.3F, 0.85F, -0.8F, 3.2F, 0.7F, -0.8F, 3.2F, 0.7F, -0.8F, -4.3F, 0.85F, -0.8F); // Box 28
		gunModel[22].setRotationPoint(-2.1F, 1.4F, -1.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1.2F, 1.5F, 0F, -1.2F, 1.5F, 0F, -1.2F, 0F, 0F, -1.2F, 0.8F, 1F, -1.2F, -0.4F, 1F, -1.2F, -0.4F, 1F, -1.2F, 0.8F, 1F, -1.2F); // Box 29
		gunModel[23].setRotationPoint(0.8F, -2.6F, -1.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.8F, 1F, -1.2F, -0.4F, 1F, -1.2F, -0.4F, 1F, -1.2F, 0.8F, 1F, -1.2F, 0.7F, 0F, -1.2F, -0.6F, 0F, -1.2F, -0.6F, 0F, -1.2F, 0.7F, 0F, -1.2F); // Box 30
		gunModel[24].setRotationPoint(0.8F, 0.4F, -1.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.7F, 0F, -1.2F, -0.6F, 0F, -1.2F, -0.6F, 0F, -1.2F, 0.7F, 0F, -1.2F, -0.8F, 0.1F, -1.2F, 1F, 0.2F, -1.2F, 1F, 0.2F, -1.2F, -0.8F, 0.1F, -1.2F); // Box 31
		gunModel[25].setRotationPoint(0.8F, 1.4F, -1.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 32
		gunModel[26].setRotationPoint(4F, -7.8F, -1F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 33
		gunModel[27].setRotationPoint(4F, -6.8F, -1F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		gunModel[28].setRotationPoint(4F, -7.3F, -1F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F); // Box 35
		gunModel[29].setRotationPoint(18F, -8.3F, -1F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.4F, 0F, -0.8F, -1.2F, 0F, -0.8F, -1.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F); // Box 36
		gunModel[30].setRotationPoint(18F, -9.3F, -1F);

		gunModel[31].addShapeBox(0F, 0F, 0.5F, 2, 1, 2, 0F,-0.4F, 0F, -0.8F, -0.8F, -0.2F, -0.8F, -0.8F, -0.2F, -0.8F, -0.4F, 0F, -0.8F, -0.2F, 0F, -0.8F, 0.2F, 0F, -0.8F, 0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F); // Box 37
		gunModel[31].setRotationPoint(-14F, -9.3F, -1F);

		gunModel[32].addShapeBox(0F, 0F, -0.5F, 2, 1, 2, 0F,-0.4F, 0F, -0.8F, -0.8F, -0.2F, -0.8F, -0.8F, -0.2F, -0.8F, -0.4F, 0F, -0.8F, -0.2F, 0F, -0.8F, 0.2F, 0F, -0.8F, 0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F); // Box 38
		gunModel[32].setRotationPoint(-14F, -9.3F, -1F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 18, 2, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0.5F, 0.7F, 0F, 0.5F, 0.7F, 0F, 0F, 0.7F, 0F); // Box 39
		gunModel[33].setRotationPoint(-14F, -6.7F, -1.5F);

		gunModel[34].addShapeBox(-74F, -15F, 0F, 150, 30, 1, 0F,-73F, -14.5F, 0F, -73F, -14.5F, 0F, -73F, -14.5F, 0F, -73F, -14.5F, 0F, -73F, -14.5F, 0F, -73F, -14.5F, 0F, -73F, -14.5F, 0F, -73F, -14.5F, 0F); // Box 40
		gunModel[34].setRotationPoint(-12F, -5.5F, 0.6F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 19

		ammoModel[0].addBox(0F, 0F, 0F, 4, 17, 1, 0F); // Box 19
		ammoModel[0].setRotationPoint(-6F, -4F, -1F);
		ammoModel[0].rotateAngleZ = -0.41887902F;


		slideModel = new ModelRendererTurbo[5];
		slideModel[0] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 8
		slideModel[1] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 9
		slideModel[2] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 10
		slideModel[3] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 11
		slideModel[4] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 17

		slideModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.5F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0.4F, -0.1F, 0.5F, 0.4F, -0.1F, 0.5F, 0.4F, -0.1F, 0.5F, 0.4F, -0.1F); // Box 8
		slideModel[0].setRotationPoint(-15.8F, -7.4F, -1.5F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.5F, -0.5F, -0.8F, 0.5F, -0.5F, -0.8F, 0.5F, -0.5F, -0.8F, 0.5F, -0.5F, -0.8F, 0.5F, 0.4F, -0.1F, 0.5F, 0.4F, -0.1F, 0.5F, 0.4F, -0.1F, 0.5F, 0.4F, -0.1F); // Box 9
		slideModel[1].setRotationPoint(-15.8F, -8.8F, -1.5F);

		slideModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.5F, 0.4F, -0.1F, 0.5F, 0.4F, -0.1F, 0.5F, 0.4F, -0.1F, 0.5F, 0.4F, -0.1F, 0.5F, -0.5F, -0.8F, 0.5F, -0.5F, -0.8F, 0.5F, -0.5F, -0.8F, 0.5F, -0.5F, -0.8F); // Box 10
		slideModel[2].setRotationPoint(-15.8F, -5.6F, -1.5F);

		slideModel[3].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F); // Box 11
		slideModel[3].setRotationPoint(-16.2F, -7.4F, -0.5F);

		slideModel[4].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F); // Box 17
		slideModel[4].setRotationPoint(-14.2F, -7.9F, -1F);



		barrelAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		stockAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		scopeAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		gripAttachPoint = new Vector3f(0 /16F, 0F /16F, 0F /16F);

		gunSlideDistance = 0.6F;
		animationType = EnumAnimationType.PISTOL_CLIP;


		translateAll(9F, -9.5F, 0F);


		flipAll();
	}
}