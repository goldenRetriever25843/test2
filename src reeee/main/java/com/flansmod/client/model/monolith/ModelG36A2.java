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

public class ModelG36A2 extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelG36A2()
	{
		gunModel = new ModelRendererTurbo[22];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 6
		gunModel[7] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 7
		gunModel[8] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 8
		gunModel[9] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 9
		gunModel[10] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 10
		gunModel[11] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 12
		gunModel[12] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 13
		gunModel[13] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 14
		gunModel[14] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 15
		gunModel[15] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 16
		gunModel[16] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 17
		gunModel[17] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 18
		gunModel[18] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 19
		gunModel[19] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 24
		gunModel[20] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 25
		gunModel[21] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 26

		gunModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 0
		gunModel[0].setRotationPoint(-2F, -4F, -1F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F); // Box 1
		gunModel[1].setRotationPoint(-1F, -4F, -1F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F); // Box 2
		gunModel[2].setRotationPoint(3.5F, -4F, -1F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.5F, 0F, 0F); // Box 3
		gunModel[3].setRotationPoint(7.5F, -4F, -1F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		gunModel[4].setRotationPoint(-2F, -5F, -1F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 5
		gunModel[5].setRotationPoint(-2.3F, -6F, -1F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 6
		gunModel[6].setRotationPoint(9F, -5.5F, -1F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, 0F, -0.1F, -1.2F, 0F, -0.1F, -1.2F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 7
		gunModel[7].setRotationPoint(14F, -5.7F, -1F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 8
		gunModel[8].setRotationPoint(3.4F, -5.8F, -1F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 16, 1, 2, 0F,0F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 9
		gunModel[9].setRotationPoint(8F, -3.7F, -1F);

		gunModel[10].addShapeBox(0F, -1.5F, 0F, 2, 5, 1, 0F,0F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 10
		gunModel[10].setRotationPoint(-0.7F, -1.8F, -0.5F);
		gunModel[10].rotateAngleZ = -0.52359878F;

		gunModel[11].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 12
		gunModel[11].setRotationPoint(12.4F, -6.2F, -1F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 13
		gunModel[12].setRotationPoint(22F, -4.6F, -0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F); // Box 14
		gunModel[13].setRotationPoint(24F, -4.6F, -0.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 15
		gunModel[14].setRotationPoint(28.4F, -4.6F, -0.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 16
		gunModel[15].setRotationPoint(-0.8F, -6.6F, -0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, -0.4F, 0.1F, 0.3F, -0.4F, 0.1F, 0.3F, -0.4F, 0.1F, 0.3F, -0.4F, 0.1F); // Box 17
		gunModel[16].setRotationPoint(-0.8F, -8.2F, -0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, -1.8F, 0.1F, 0.3F, -1.8F, 0.1F, 0.3F, -1.8F, 0.1F, 0.3F, -1.8F, 0.1F); // Box 18
		gunModel[17].setRotationPoint(3.3F, -8.2F, -0.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0F, 0F, 0.1F, -2.2F, -1.8F, 0.1F, 2.5F, -1.8F, 0.1F, 2.5F, -1.8F, 0.1F, -2.2F, -1.8F, 0.1F); // Box 19
		gunModel[18].setRotationPoint(10.3F, -8.2F, -0.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F); // Box 24
		gunModel[19].setRotationPoint(1.6F, -0.3F, -0.5F);
		gunModel[19].rotateAngleZ = 0.08726646F;

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F); // Box 25
		gunModel[20].setRotationPoint(0.6F, -0.7F, -0.5F);
		gunModel[20].rotateAngleZ = -0.36651914F;

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, -0.9F, -0.3F, 0.2F, -0.9F, -0.3F, 0.2F, -0.9F, -0.3F, 0.2F, -0.9F, -0.3F); // Box 26
		gunModel[21].setRotationPoint(1.8F, -1.9F, -0.5F);
		gunModel[21].rotateAngleZ = -1.65806279F;


		defaultStockModel = new ModelRendererTurbo[5];
		defaultStockModel[0] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 11
		defaultStockModel[1] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 27
		defaultStockModel[2] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 28
		defaultStockModel[3] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 29
		defaultStockModel[4] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 30

		defaultStockModel[0].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F); // Box 11
		defaultStockModel[0].setRotationPoint(-4F, -5.7F, -0.5F);

		defaultStockModel[1].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 27
		defaultStockModel[1].setRotationPoint(-6.7F, -4.7F, -0.5F);

		defaultStockModel[2].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F); // Box 28
		defaultStockModel[2].setRotationPoint(-12.7F, -4.7F, -0.5F);

		defaultStockModel[3].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F); // Box 29
		defaultStockModel[3].setRotationPoint(-11.7F, -0.7F, -0.5F);
		defaultStockModel[3].rotateAngleZ = 0.36651914F;

		defaultStockModel[4].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 30
		defaultStockModel[4].setRotationPoint(-12.7F, -4.7F, -0.5F);


		ammoModel = new ModelRendererTurbo[4];
		ammoModel[0] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 20
		ammoModel[1] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 21
		ammoModel[2] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 22
		ammoModel[3] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 23

		ammoModel[0].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 20
		ammoModel[0].setRotationPoint(4.2F, -1F, -1F);
		ammoModel[0].rotateAngleZ = 0.12217305F;

		ammoModel[1].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 21
		ammoModel[1].setRotationPoint(4.3F, 0F, -1F);
		ammoModel[1].rotateAngleZ = 0.19198622F;

		ammoModel[2].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 22
		ammoModel[2].setRotationPoint(4.5F, 0.95F, -1F);
		ammoModel[2].rotateAngleZ = 0.26179939F;

		ammoModel[3].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 23
		ammoModel[3].setRotationPoint(4.75F, 1.9F, -1F);
		ammoModel[3].rotateAngleZ = 0.29670597F;



		barrelAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		stockAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		scopeAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		gripAttachPoint = new Vector3f(0 /16F, 0F /16F, 0F /16F);

		gunSlideDistance = 0F;
		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}