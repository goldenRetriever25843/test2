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

public class ModelZM87 extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelZM87()
	{
		gunModel = new ModelRendererTurbo[19];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 5
		gunModel[5] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 6
		gunModel[6] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 7
		gunModel[7] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 9
		gunModel[8] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 10
		gunModel[9] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 11
		gunModel[10] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 12
		gunModel[11] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 13
		gunModel[12] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 14
		gunModel[13] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 15
		gunModel[14] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 16
		gunModel[15] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 17
		gunModel[16] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 18
		gunModel[17] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 19
		gunModel[18] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 20

		gunModel[0].addBox(0F, 0F, 0F, 8, 4, 3, 0F); // Box 0
		gunModel[0].setRotationPoint(-3F, -7F, -1.5F);

		gunModel[1].addBox(0F, 0F, 0F, 6, 5, 3, 0F); // Box 1
		gunModel[1].setRotationPoint(-9F, -7F, -1.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F); // Box 2
		gunModel[2].setRotationPoint(5F, -6.5F, -1.5F);

		gunModel[3].addBox(0F, 0F, 0F, 3, 6, 4, 0F); // Box 3
		gunModel[3].setRotationPoint(-12F, -7.5F, -2F);

		gunModel[4].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 5
		gunModel[4].setRotationPoint(10F, -6F, -1F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 6
		gunModel[5].setRotationPoint(13F, -6F, -1F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 7
		gunModel[6].setRotationPoint(17F, -5.5F, -0.5F);

		gunModel[7].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 9
		gunModel[7].setRotationPoint(20F, -6F, -1F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 10
		gunModel[8].setRotationPoint(-3F, -9F, -1.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F); // Box 11
		gunModel[9].setRotationPoint(-2F, -9F, -1.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F); // Box 12
		gunModel[10].setRotationPoint(4F, -9F, -1.5F);
		gunModel[10].rotateAngleZ = -0.99483767F;

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.5F, 0F, 0F); // Box 13
		gunModel[11].setRotationPoint(4F, -3F, -0.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.8F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, 0.8F, 0F, 0.2F); // Box 14
		gunModel[12].setRotationPoint(0F, -3F, -0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.6F, -0.2F); // Box 15
		gunModel[13].setRotationPoint(0F, -2F, -0.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 16
		gunModel[14].setRotationPoint(-2F, -10F, -1F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 17
		gunModel[15].setRotationPoint(0F, -10F, -1F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F); // Box 18
		gunModel[16].setRotationPoint(-3F, -10.5F, -1.3F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.3F, 0.1F, 0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, 0.1F, 0.1F); // Box 19
		gunModel[17].setRotationPoint(-5F, -10.5F, -1.3F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.4F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 20
		gunModel[18].setRotationPoint(12F, -9F, -0.5F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 4

		ammoModel[0].addBox(0F, 0F, 0F, 5, 4, 2, 0F); // Box 4
		ammoModel[0].setRotationPoint(-8.5F, -3.5F, -1F);



		barrelAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		stockAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		scopeAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		gripAttachPoint = new Vector3f(0 /16F, 0F /16F, 0F /16F);

		gunSlideDistance = 0F;
		animationType = EnumAnimationType.NONE;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}