//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.1.1
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMedigun extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelMedigun()
	{
		gunModel = new ModelRendererTurbo[25];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 6
		gunModel[7] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 7
		gunModel[8] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 8
		gunModel[9] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 9
		gunModel[10] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 10
		gunModel[11] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 11
		gunModel[12] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 12
		gunModel[13] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 13
		gunModel[14] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 14
		gunModel[15] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 15
		gunModel[16] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 16
		gunModel[17] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 17
		gunModel[18] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 18
		gunModel[19] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 19
		gunModel[20] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 20
		gunModel[21] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 21
		gunModel[22] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 22
		gunModel[23] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 23
		gunModel[24] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 24

		gunModel[0].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F,0.2F, 0F, 0F,0.2F, 0F, 0F,0F, 0F, 0F,0.5F, -0.2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0.5F, -0.2F, 0F); // Box 0
		gunModel[0].setRotationPoint(-0.5F, -2.5F, -0.5F);

		gunModel[1].addBox(0F, 0F, 0F, 2, 4, 4, 0F); // Box 1
		gunModel[1].setRotationPoint(-0.8F, -6.5F, -2F);

		gunModel[2].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 2
		gunModel[2].setRotationPoint(1.2F, -5F, -1.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 3
		gunModel[3].setRotationPoint(1.2F, -6F, -1.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F); // Box 4
		gunModel[4].setRotationPoint(1.2F, -4F, -1.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.25F,0F, 0F, -0.25F,0F, 0F, -0.25F,0F, 0F, -0.25F,0F, 0F, -0.25F,0F, 0F, -0.25F,0F, 0F, -0.25F,0F, 0F, -0.25F); // Box 5
		gunModel[5].setRotationPoint(2.2F, -5F, -2F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0.25F, -1.25F,0F, 0.25F, -1.25F,0F, 0.25F, -1.25F,0F, 0.25F, -1.25F,0F, 0F, -0.25F,0F, 0F, -0.25F,0F, 0F, -0.25F,0F, 0F, -0.25F); // Box 6
		gunModel[6].setRotationPoint(2.2F, -6F, -2F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0.25F, -1.25F,0F, 0.25F, -1.25F,0F, 0.25F, -1.25F,0F, 0.25F, -1.25F,0F, 0F, -0.25F,0F, 0F, -0.25F,0F, 0F, -0.25F,0F, 0F, -0.25F); // Box 7
		gunModel[7].setRotationPoint(2.2F, -6F, -2F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.25F,0F, 0F, -0.25F,0F, 0F, -0.25F,0F, 0F, -0.25F,0F, 0.25F, -1.25F,0F, 0.25F, -1.25F,0F, 0.25F, -1.25F,0F, 0.25F, -1.25F); // Box 8
		gunModel[8].setRotationPoint(2.2F, -4F, -2F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F); // Box 9
		gunModel[9].setRotationPoint(3.2F, -4F, -1.5F);

		gunModel[10].addBox(0F, 0F, 0F, 7, 1, 3, 0F); // Box 10
		gunModel[10].setRotationPoint(3.2F, -5F, -1.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 11
		gunModel[11].setRotationPoint(3.2F, -6F, -1.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, -0.25F,0F, 0F, -0.25F,0F, 0F, -0.25F,0F, 0F, -0.25F,0F, 0F, -0.25F,0F, 0F, -0.25F,0F, 0F, -0.25F,0F, 0F, -0.25F); // Box 12
		gunModel[12].setRotationPoint(10.2F, -5F, -2F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, -0.25F,0F, 0F, -0.25F,0F, 0F, -0.25F,0F, 0F, -0.25F,0F, 0.25F, -1.25F,0F, 0.25F, -1.25F,0F, 0.25F, -1.25F,0F, 0.25F, -1.25F); // Box 13
		gunModel[13].setRotationPoint(10.2F, -4F, -2F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0.25F, -1.25F,0F, 0.25F, -1.25F,0F, 0.25F, -1.25F,0F, 0.25F, -1.25F,0F, 0F, -0.25F,0F, 0F, -0.25F,0F, 0F, -0.25F,0F, 0F, -0.25F); // Box 14
		gunModel[14].setRotationPoint(10.2F, -6F, -2F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, -0.2F,0F, -0.5F, -0.2F,0F, -0.5F, -0.2F,0F, 0F, -0.2F,0F, 0F, -0.2F,0F, -0.5F, -0.2F,0F, -0.5F, -0.2F,0F, 0F, -0.2F); // Box 15
		gunModel[15].setRotationPoint(-2.8F, -6.5F, -2F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, -0.5F, -0.2F,0F, 0F, -0.2F,0F, 0F, -0.2F,0F, -0.5F, -0.2F,0F, -0.5F, -0.2F,0F, 0F, -0.2F,0F, 0F, -0.2F,0F, -0.5F, -0.2F); // Box 16
		gunModel[16].setRotationPoint(-4.8F, -6.5F, -2F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 17
		gunModel[17].setRotationPoint(-6.8F, -6F, -1.5F);

		gunModel[18].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 18
		gunModel[18].setRotationPoint(-6.8F, -5F, -1.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F); // Box 19
		gunModel[19].setRotationPoint(-6.8F, -4F, -1.5F);

		gunModel[20].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 20
		gunModel[20].setRotationPoint(-3.4F, -5F, -2.5F);

		gunModel[21].addShapeBox(0F, -6F, 0F, 1, 7, 1, 0F,-0.2F, 0F, -0.3F,-0.2F, 0F, -0.3F,-0.2F, 0F, -0.3F,-0.2F, 0F, -0.3F,-0.2F, 0F, -0.3F,-0.2F, 0F, -0.3F,-0.2F, 0F, -0.3F,-0.2F, 0F, -0.3F); // Box 21
		gunModel[21].setRotationPoint(-3.6F, -4.5F, -2.7F);
		gunModel[21].rotateAngleZ = 0.78539816F;

		gunModel[22].addShapeBox(0F, -6F, 0F, 1, 7, 1, 0F,-0.2F, 0F, -0.3F,-0.2F, 0F, -0.3F,-0.2F, 0F, -0.3F,-0.2F, 0F, -0.3F,-0.2F, 0F, -0.3F,-0.2F, 0F, -0.3F,-0.2F, 0F, -0.3F,-0.2F, 0F, -0.3F); // Box 22
		gunModel[22].setRotationPoint(-3.6F, -4.5F, 1.7F);
		gunModel[22].rotateAngleZ = 0.78539816F;

		gunModel[23].addShapeBox(0F, -6F, 0F, 1, 1, 5, 0F,-0.2F, 0F, -0.3F,-0.2F, 0F, -0.3F,-0.2F, 0F, -0.3F,-0.2F, 0F, -0.3F,-0.2F, -0.2F, -0.3F,-0.2F, -0.2F, -0.3F,-0.2F, -0.2F, -0.3F,-0.2F, -0.2F, -0.3F); // Box 23
		gunModel[23].setRotationPoint(-3.6F, -4.5F, -2.7F);
		gunModel[23].rotateAngleZ = 0.78539816F;

		gunModel[24].addShapeBox(0F, -4F, 0F, 1, 1, 5, 0F,-0.2F, -0.2F, -0.3F,-0.2F, -0.2F, -0.3F,-0.2F, -0.2F, -0.3F,-0.2F, -0.2F, -0.3F,-0.2F, -0.2F, -0.3F,-0.2F, -0.2F, -0.3F,-0.2F, -0.2F, -0.3F,-0.2F, -0.2F, -0.3F); // Box 24
		gunModel[24].setRotationPoint(-3.6F, -4.5F, -2.7F);
		gunModel[24].rotateAngleZ = 0.78539816F;


		



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