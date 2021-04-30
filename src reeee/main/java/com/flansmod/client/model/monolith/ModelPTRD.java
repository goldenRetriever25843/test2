//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.3.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPTRD extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelPTRD()
	{
		gunModel = new ModelRendererTurbo[19];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 12
		gunModel[4] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 13
		gunModel[5] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 14
		gunModel[6] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 15
		gunModel[7] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 18
		gunModel[8] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 19
		gunModel[9] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 20
		gunModel[10] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 21
		gunModel[11] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 22
		gunModel[12] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 23
		gunModel[13] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 24
		gunModel[14] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 25
		gunModel[15] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 26
		gunModel[16] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 27
		gunModel[17] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 28
		gunModel[18] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 29

		gunModel[0].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 0
		gunModel[0].setRotationPoint(-16.4F, -5.37F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F); // Box 1
		gunModel[1].setRotationPoint(-16.4F, -5.62F, -0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		gunModel[2].setRotationPoint(-16.4F, -5.12F, -0.5F);

		gunModel[3].addBox(0F, 0F, 0F, 11, 2, 2, 0F); // Box 12
		gunModel[3].setRotationPoint(-0.2F, -8.2F, -1F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.2F, -0.2F); // Box 13
		gunModel[4].setRotationPoint(-1.2F, -8.2F, -1F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 14
		gunModel[5].setRotationPoint(10.8F, -8.2F, -1F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, -0.5F, 0F, 0F); // Box 15
		gunModel[6].setRotationPoint(9.8F, -8.2F, -1F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 1F, -0.2F, -1F, 1F, -0.2F, -1F, 1F, -0.2F, 0F, 1F, -0.2F); // Box 18
		gunModel[7].setRotationPoint(-0.5F, -6.5F, -0.5F);

		gunModel[8].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 19
		gunModel[8].setRotationPoint(-3F, -4F, -0.5F);
		gunModel[8].rotateAngleZ = -0.2443461F;

		gunModel[9].addShapeBox(-1.8F, -1F, 0F, 4, 2, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 20
		gunModel[9].setRotationPoint(-3F, -4F, -0.5F);
		gunModel[9].rotateAngleZ = -0.2443461F;

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Box 21
		gunModel[10].setRotationPoint(-0.4F, -4.5F, -0.5F);
		gunModel[10].rotateAngleZ = 0.10471976F;

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Box 22
		gunModel[11].setRotationPoint(-1.4F, -4.3F, -0.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 23
		gunModel[12].setRotationPoint(-1F, -2.8F, -0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Box 24
		gunModel[13].setRotationPoint(1.9F, -4.3F, -0.5F);

		gunModel[14].addBox(0F, 0F, 0F, 3, 5, 1, 0F); // Box 25
		gunModel[14].setRotationPoint(-17.3F, -4F, -0.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 26
		gunModel[15].setRotationPoint(-18.3F, -9F, -0.5F);
		gunModel[15].rotateAngleZ = 0.19198622F;

		gunModel[16].addBox(-1.8F, -1F, 0F, 7, 3, 1, 0F); // Box 27
		gunModel[16].setRotationPoint(-11F, -7F, -0.5F);

		gunModel[17].addBox(-1F, 0F, 0F, 1, 4, 1, 0F); // Box 28
		gunModel[17].setRotationPoint(-4F, -8F, -0.5F);
		gunModel[17].rotateAngleZ = 0.71558499F;

		gunModel[18].addBox(-1F, 0F, 0F, 2, 1, 1, 0F); // Box 29
		gunModel[18].setRotationPoint(-5F, -8F, -0.5F);


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 16
		ammoModel[1] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 17

		ammoModel[0].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 16
		ammoModel[0].setRotationPoint(0.5F, -7.8F, -0.5F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.1F, -0.1F); // Box 17
		ammoModel[1].setRotationPoint(6.5F, -7.8F, -0.5F);


		slideModel = new ModelRendererTurbo[13];
		slideModel[0] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 3
		slideModel[1] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 4
		slideModel[2] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 5
		slideModel[3] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 6
		slideModel[4] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 7
		slideModel[5] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 8
		slideModel[6] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 9
		slideModel[7] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 10
		slideModel[8] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 30
		slideModel[9] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 31
		slideModel[10] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 32
		slideModel[11] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 33
		slideModel[12] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 34

		slideModel[0].addShapeBox(0F, 0F, 0F, 54, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 3
		slideModel[0].setRotationPoint(15F, -7.58F, -0.5F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 54, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F); // Box 4
		slideModel[1].setRotationPoint(15F, -7.83F, -0.5F);

		slideModel[2].addShapeBox(0F, 0F, 0F, 54, 1, 1, 0F,0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		slideModel[2].setRotationPoint(15F, -7.33F, -0.5F);

		slideModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 6
		slideModel[3].setRotationPoint(69F, -7.58F, -0.5F);

		slideModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.5F, 0.5F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0.5F, 0.5F); // Box 7
		slideModel[4].setRotationPoint(72F, -7.58F, -0.5F);

		slideModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F); // Box 8
		slideModel[5].setRotationPoint(68.2F, -9F, -0.5F);

		slideModel[6].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 9
		slideModel[6].setRotationPoint(30F, -7.1F, -0.5F);
		slideModel[6].rotateAngleX = -0.55850536F;

		slideModel[7].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 10
		slideModel[7].setRotationPoint(30F, -7.1F, -0.5F);
		slideModel[7].rotateAngleX = 0.55850536F;

		slideModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 30
		slideModel[8].setRotationPoint(15.7F, -9.58F, -0.5F);

		slideModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 31
		slideModel[9].setRotationPoint(16F, -10.58F, -1F);

		slideModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 32
		slideModel[10].setRotationPoint(16F, -10.58F, 0F);

		slideModel[11].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 33
		slideModel[11].setRotationPoint(28F, -7F, -0.5F);

		slideModel[12].addShapeBox(-8.5F, 0F, 0F, 9, 1, 1, 0F,0F, 0.4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.4F, 0F); // Box 34
		slideModel[12].setRotationPoint(28F, -4F, -0.5F);
		slideModel[12].rotateAngleZ = 0.13962634F;



		barrelAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		stockAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		scopeAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		gripAttachPoint = new Vector3f(0 /16F, 0F /16F, 0F /16F);

		gunSlideDistance = 0F;
		animationType = EnumAnimationType.RIFLE_TOP;


		translateAll(0F, -0.5F, 0F);


		flipAll();
	}
}