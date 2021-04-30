//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.1.13
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelAWM extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelAWM()
	{
		gunModel = new ModelRendererTurbo[31];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 3
		gunModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 4
		gunModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 5
		gunModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 6
		gunModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 7
		gunModel[6] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 8
		gunModel[7] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 9
		gunModel[8] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 10
		gunModel[9] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 11
		gunModel[10] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 12
		gunModel[11] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 14
		gunModel[12] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 15
		gunModel[13] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 19
		gunModel[14] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 20
		gunModel[15] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 21
		gunModel[16] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 22
		gunModel[17] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 23
		gunModel[18] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 24
		gunModel[19] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 25
		gunModel[20] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 26
		gunModel[21] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 27
		gunModel[22] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 28
		gunModel[23] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 29
		gunModel[24] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 30
		gunModel[25] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 31
		gunModel[26] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 32
		gunModel[27] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 33
		gunModel[28] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 34
		gunModel[29] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 35
		gunModel[30] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 36

		gunModel[0].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 1
		gunModel[0].setRotationPoint(-5F, -3F, -0.75F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F); // Box 3
		gunModel[1].setRotationPoint(-2F, -3F, -0.75F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 4
		gunModel[2].setRotationPoint(-2F, -1F, -0.5F);
		gunModel[2].rotateAngleZ = -0.29670597F;

		gunModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[3].setRotationPoint(0F, 0F, -0.5F);
		gunModel[3].rotateAngleZ = 1.36135682F;

		gunModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F); // Box 6
		gunModel[4].setRotationPoint(1.5F, -3.2F, -0.75F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 7
		gunModel[5].setRotationPoint(0.699999999999999F, -1F, -0.5F);
		gunModel[5].rotateAngleZ = -0.06981317F;

		gunModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 8
		gunModel[6].setRotationPoint(2.6F, -0.85F, -0.5F);
		gunModel[6].rotateAngleZ = 0.89011792F;

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F); // Box 9
		gunModel[7].setRotationPoint(3F, -3.2F, -0.75F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F); // Box 10
		gunModel[8].setRotationPoint(4F, -3.2F, -0.75F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.3F, 0.5F); // Box 11
		gunModel[9].setRotationPoint(4F, -2F, -0.75F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, -0.5F, 0.5F); // Box 12
		gunModel[10].setRotationPoint(6F, -2F, -0.75F);

		gunModel[11].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 14
		gunModel[11].setRotationPoint(3.5F, -3.7F, -0.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 15
		gunModel[12].setRotationPoint(7.5F, -3.7F, -0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 19
		gunModel[13].setRotationPoint(10.2F, -3.1F, -0.5F);
		gunModel[13].rotateAngleX = -0.40142573F;

		gunModel[14].addShapeBox(0F, 0F, -1F, 1, 7, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 20
		gunModel[14].setRotationPoint(10.2F, -3.1F, 0.5F);
		gunModel[14].rotateAngleX = 0.40142573F;

		gunModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 21
		gunModel[15].setRotationPoint(9F, -3.1F, -0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 22
		gunModel[16].setRotationPoint(20.5F, -3.7F, -0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 23
		gunModel[17].setRotationPoint(-7F, -3.1F, -0.75F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0.5F, 0F, -0.7F, 0.5F); // Box 24
		gunModel[18].setRotationPoint(-5F, -3.4F, -0.75F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 25
		gunModel[19].setRotationPoint(-5F, 0F, -0.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 26
		gunModel[20].setRotationPoint(-5F, 1F, -0.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 27
		gunModel[21].setRotationPoint(3.5F, -4.3F, -0.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 28
		gunModel[22].setRotationPoint(3.5F, -4.9F, -0.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.7F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F); // Box 29
		gunModel[23].setRotationPoint(5.5F, -4.9F, -0.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 30
		gunModel[24].setRotationPoint(3.5F, -5.1F, -0.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F); // Box 31
		gunModel[25].setRotationPoint(6.5F, -5.1F, -0.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		gunModel[26].setRotationPoint(8.5F, -5.1F, -0.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.1F); // Box 33
		gunModel[27].setRotationPoint(2.5F, -5.1F, -0.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 34
		gunModel[28].setRotationPoint(1.5F, -5.1F, -0.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F); // Box 35
		gunModel[29].setRotationPoint(4.5F, -5.1F, -1F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F); // Box 36
		gunModel[30].setRotationPoint(4.5F, -5.6F, 0.5F);
		gunModel[30].rotateAngleX = -1.57079633F;


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 13

		ammoModel[0].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, 0F, 0F, 0F); // Box 13
		ammoModel[0].setRotationPoint(3.5F, -2.3F, -0.5F);


		pumpModel = new ModelRendererTurbo[2];
		pumpModel[0] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 16
		pumpModel[1] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 18

		pumpModel[0].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 16
		pumpModel[0].setRotationPoint(3F, -3.9F, -0.5F);

		pumpModel[1].addShapeBox(0F, 0F, -1F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 18
		pumpModel[1].setRotationPoint(3F, -4F, -0.3F);
		pumpModel[1].rotateAngleX = 0.17453293F;



		barrelAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		stockAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		scopeAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		gripAttachPoint = new Vector3f(0 /16F, 0F /16F, 0F /16F);

		gunSlideDistance = 0.1F;
		pumpDelayAfterReload = 65;
		pumpDelay = 11;
		pumpTime = 9;
		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}