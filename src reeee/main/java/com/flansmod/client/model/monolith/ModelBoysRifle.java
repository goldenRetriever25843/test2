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

public class ModelBoysRifle extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelBoysRifle()
	{
		gunModel = new ModelRendererTurbo[20];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 5
		gunModel[5] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 6
		gunModel[6] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 7
		gunModel[7] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 14
		gunModel[8] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 15
		gunModel[9] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 16
		gunModel[10] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 17
		gunModel[11] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 18
		gunModel[12] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 19
		gunModel[13] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 20
		gunModel[14] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 21
		gunModel[15] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 22
		gunModel[16] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 23
		gunModel[17] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 24
		gunModel[18] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 25
		gunModel[19] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 26

		gunModel[0].addBox(0F, 0F, 0F, 24, 2, 3, 0F); // Box 0
		gunModel[0].setRotationPoint(-11F, -6F, -1.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 1
		gunModel[1].setRotationPoint(13F, -8F, -1.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 2
		gunModel[2].setRotationPoint(-0.5F, -7.5F, -1.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,-1F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 3
		gunModel[3].setRotationPoint(-0.5F, -8.5F, -1.5F);

		gunModel[4].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 5
		gunModel[4].setRotationPoint(6.5F, -8F, -1F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 6
		gunModel[5].setRotationPoint(9.5F, -8F, -1F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 7
		gunModel[6].setRotationPoint(11.5F, -8F, -1F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		gunModel[7].setRotationPoint(-2.5F, -4F, -1F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, -1.5F, 0.5F, 0F); // Box 15
		gunModel[8].setRotationPoint(-2.5F, -2F, -1F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.5F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0.5F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F); // Box 16
		gunModel[9].setRotationPoint(-0.5F, -2.8F, -1F);

		gunModel[10].addShapeBox(0.05F, 0F, 0F, 2, 1, 2, 0F,0.5F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0.5F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F); // Box 17
		gunModel[10].setRotationPoint(1.2F, -2.8F, -1F);
		gunModel[10].rotateAngleZ = 1.36135682F;

		gunModel[11].addShapeBox(0.05F, 0F, 0F, 2, 1, 2, 0F,0F, -0.4F, -0.3F, 0.5F, -0.4F, -0.3F, 0.5F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F); // Box 18
		gunModel[11].setRotationPoint(0F, -2.5F, -1F);
		gunModel[11].rotateAngleZ = 1.81514242F;

		gunModel[12].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 19
		gunModel[12].setRotationPoint(8F, -4F, 0F);
		gunModel[12].rotateAngleX = 0.43633231F;
		gunModel[12].rotateAngleZ = 0.40142573F;

		gunModel[13].addShapeBox(0F, 0F, -0.5F, 1, 12, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 20
		gunModel[13].setRotationPoint(8F, -4F, 0F);
		gunModel[13].rotateAngleX = 0.43633231F;
		gunModel[13].rotateAngleZ = 0.40142573F;

		gunModel[14].addShapeBox(0F, 0F, -0.5F, 1, 12, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 21
		gunModel[14].setRotationPoint(8F, -4F, 0F);
		gunModel[14].rotateAngleX = -0.43633231F;
		gunModel[14].rotateAngleZ = 0.40142573F;

		gunModel[15].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 22
		gunModel[15].setRotationPoint(8F, -4F, 0F);
		gunModel[15].rotateAngleX = -0.43633231F;
		gunModel[15].rotateAngleZ = 0.40142573F;

		gunModel[16].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		gunModel[16].setRotationPoint(-14F, -6F, -1.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		gunModel[17].setRotationPoint(-14F, -8F, -1.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F); // Box 25
		gunModel[18].setRotationPoint(-14F, -4F, -1.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.8F, 2.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, -1.8F, 2.5F, 0F); // Box 26
		gunModel[19].setRotationPoint(-12.5F, -4F, -1F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 4

		ammoModel[0].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0.2F, 0F, -1F, 0.2F, 0F, -1F, 0.2F, 0F, 0F, 0.2F, 0.8F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0.8F, 0F, 0.2F); // Box 4
		ammoModel[0].setRotationPoint(2.3F, -12.4F, -0.5F);


		slideModel = new ModelRendererTurbo[3];
		slideModel[0] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 8
		slideModel[1] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 9
		slideModel[2] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 10

		slideModel[0].addShapeBox(0F, 0F, 0F, 26, 2, 2, 0F,0F, -0.4F, -0.4F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.4F, -0.4F); // Box 8
		slideModel[0].setRotationPoint(15.5F, -8F, -1F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 9
		slideModel[1].setRotationPoint(41F, -8F, -1F);

		slideModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 10
		slideModel[2].setRotationPoint(42F, -9F, -0.5F);


		pumpModel = new ModelRendererTurbo[3];
		pumpModel[0] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 11
		pumpModel[1] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 12
		pumpModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 13

		pumpModel[0].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 11
		pumpModel[0].setRotationPoint(-2.5F, -7F, -1F);

		pumpModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F); // Box 12
		pumpModel[1].setRotationPoint(-2.5F, -6.3F, -4F);
		pumpModel[1].rotateAngleX = 0.2443461F;

		pumpModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F); // Box 13
		pumpModel[2].setRotationPoint(-2.5F, -6.3F, -4F);
		pumpModel[2].rotateAngleX = 0.2443461F;



		barrelAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		stockAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		scopeAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		gripAttachPoint = new Vector3f(0 /16F, 0F /16F, 0F /16F);

		gunSlideDistance = 0.5F;
		pumpDelayAfterReload = 65;
		pumpDelay = 11;
		pumpTime = 9;
		animationType = EnumAnimationType.RIFLE_TOP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}