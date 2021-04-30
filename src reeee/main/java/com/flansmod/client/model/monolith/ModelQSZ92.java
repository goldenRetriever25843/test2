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

public class ModelQSZ92 extends ModelGun
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelQSZ92()
	{
		gunModel = new ModelRendererTurbo[13];
		gunModel[0] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
		gunModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 2
		gunModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 3
		gunModel[3] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 15
		gunModel[4] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 16
		gunModel[5] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 19
		gunModel[6] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 27
		gunModel[7] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 28
		gunModel[8] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 29
		gunModel[9] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 32
		gunModel[10] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 33
		gunModel[11] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 34
		gunModel[12] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 35

		gunModel[0].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.3F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, 0F, 0.3F, 0.2F); // Box 1
		gunModel[0].setRotationPoint(1.5F, -3.5F, -1F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0.6F, -0.2F, 0F, 0.6F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 2
		gunModel[1].setRotationPoint(7F, -3.5F, -1F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F,-0.8F, 0F, -0.19F, 0F, 0F, -0.19F, 0F, 0F, -0.19F, -0.8F, 0F, -0.19F, -0.1F, -0.2F, -0.19F, -1.3F, 0F, -0.19F, -1.3F, 0F, -0.19F, -0.1F, -0.2F, -0.19F); // Box 3
		gunModel[2].setRotationPoint(-4.5F, -3.5F, -1.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0.2F, -0.19F, 0.1F, 0F, -0.19F, 0.1F, 0F, -0.19F, 0F, 0.2F, -0.19F, -0.4F, 0F, -0.21F, 0F, 0F, -0.21F, 0F, 0F, -0.21F, -0.4F, 0F, -0.21F); // Box 15
		gunModel[3].setRotationPoint(-2.9F, -1.5F, -1.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 4, 4, 3, 0F,-0.4F, 0F, -0.21F, 0F, 0F, -0.21F, 0F, 0F, -0.21F, -0.4F, 0F, -0.21F, 1.2F, -0.2F, -0.3F, -1F, -0.2F, -0.3F, -1F, -0.2F, -0.3F, 1.2F, -0.2F, -0.3F); // Box 16
		gunModel[4].setRotationPoint(-2.9F, -0.5F, -1.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.1F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		gunModel[5].setRotationPoint(-4.2F, -5F, -0.5F);
		gunModel[5].rotateAngleZ = 0.17453293F;

		gunModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.1F, -0.7F, 0F, -0.1F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		gunModel[6].setRotationPoint(2.5F, -5.2F, -1F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,1.2F, -0.2F, -0.3F, -1F, -0.2F, -0.3F, -1F, -0.2F, -0.3F, 1.2F, -0.2F, -0.3F, 1F, 0F, -0.21F, -1F, 0F, -0.21F, -1F, 0F, -0.21F, 1F, 0F, -0.21F); // Box 28
		gunModel[7].setRotationPoint(-2.9F, 3F, -1.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,1.2F, -0.2F, -0.3F, -1F, -0.2F, -0.3F, -1F, -0.2F, -0.3F, 1.2F, -0.2F, -0.3F, 0F, 0F, -0.21F, -0.4F, -0.2F, -0.21F, -0.4F, -0.2F, -0.21F, 0F, 0F, -0.21F); // Box 29
		gunModel[8].setRotationPoint(0.1F, 4F, -1.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 32
		gunModel[9].setRotationPoint(0F, -0.5F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.8F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, -0.8F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 33
		gunModel[10].setRotationPoint(4.5F, -3.5F, -0.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, -0.8F, -0.3F, -0.3F, -1F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, -1F, -0.3F, -0.3F); // Box 34
		gunModel[11].setRotationPoint(1.5F, -3F, -0.5F);
		gunModel[11].rotateAngleZ = 0.29670597F;

		gunModel[12].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		gunModel[12].setRotationPoint(3.8F, -4.7F, -0.5F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 36

		ammoModel[0].addShapeBox(0F, 0F, 0F, 3, 6, 2, 0F,-0.4F, 0F, -0.21F, 0.4F, 0F, -0.21F, 0.4F, 0F, -0.21F, -0.4F, 0F, -0.21F, 1F, -0.2F, -0.21F, -1F, -0.2F, -0.21F, -1F, -0.2F, -0.21F, 1F, -0.2F, -0.21F); // Box 36
		ammoModel[0].setRotationPoint(-2.5F, -1.5F, -1F);


		slideModel = new ModelRendererTurbo[17];
		slideModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		slideModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 6
		slideModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 7
		slideModel[3] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 8
		slideModel[4] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 9
		slideModel[5] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 10
		slideModel[6] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 12
		slideModel[7] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 14
		slideModel[8] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 17
		slideModel[9] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 18
		slideModel[10] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 21
		slideModel[11] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 23
		slideModel[12] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 24
		slideModel[13] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 25
		slideModel[14] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 26
		slideModel[15] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 30
		slideModel[16] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 31

		slideModel[0].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 0
		slideModel[0].setRotationPoint(-2.5F, -5.2F, -1.5F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 6
		slideModel[1].setRotationPoint(-2.5F, -5.2F, 0.5F);

		slideModel[2].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		slideModel[2].setRotationPoint(-2.5F, -5.35F, -0.5F);

		slideModel[3].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		slideModel[3].setRotationPoint(2.5F, -5.35F, -0.5F);

		slideModel[4].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.39F, 0.2F, 0.1F, 0.39F, 0.2F, 0.1F, 0.39F, 0F, 0.1F, 0.39F); // Box 9
		slideModel[4].setRotationPoint(4.5F, -5.35F, -0.5F);

		slideModel[5].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.5F, -0.2F, -0.9F, -0.5F, -0.2F, -0.9F, -0.3F, -0.72F, 0F, -0.3F, -0.72F); // Box 10
		slideModel[5].setRotationPoint(4.5F, -5.2F, -1.5F);

		slideModel[6].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.3F, -0.72F, -0.9F, -0.3F, -0.72F, -0.9F, -0.5F, -0.2F, 0F, -0.5F, -0.2F); // Box 12
		slideModel[6].setRotationPoint(2.5F, -5.2F, 0.5F);

		slideModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.3F, -1.72F, 0F, -0.3F, -1.72F); // Box 14
		slideModel[7].setRotationPoint(2.5F, -5.2F, -1.5F);

		slideModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.65F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, 0F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 17
		slideModel[8].setRotationPoint(-3.7F, -5.2F, 0.5F);

		slideModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.4F, -0.3F, 0.2F, -0.4F, -0.3F, 0.2F, 0.1F, 0F, -0.65F, 0.1F, 0F, 0F, -0.3F, -0.2F, 0.2F, -0.3F, -0.2F, 0.2F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 18
		slideModel[9].setRotationPoint(-3.7F, -5.2F, -1.5F);

		slideModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 21
		slideModel[10].setRotationPoint(-2.5F, -5.7F, -0.9F);

		slideModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F); // Box 23
		slideModel[11].setRotationPoint(-2.5F, -5.7F, -0.1F);

		slideModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F); // Box 24
		slideModel[12].setRotationPoint(-2.6F, -6F, -0.2F);

		slideModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F); // Box 25
		slideModel[13].setRotationPoint(-2.6F, -6F, -0.8F);

		slideModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.4F, 0F, -0.35F); // Box 26
		slideModel[14].setRotationPoint(9.7F, -6F, -0.5F);

		slideModel[15].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 30
		slideModel[15].setRotationPoint(6.7F, -5.2F, -1.5F);

		slideModel[16].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F); // Box 31
		slideModel[16].setRotationPoint(6.7F, -5.2F, 0.5F);



		barrelAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		stockAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		scopeAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		gripAttachPoint = new Vector3f(0 /16F, 0F /16F, 0F /16F);

		gunSlideDistance = 0.2F;
		animationType = EnumAnimationType.PISTOL_CLIP;


		translateAll(0F, -5F, 0F);


		flipAll();
	}
}