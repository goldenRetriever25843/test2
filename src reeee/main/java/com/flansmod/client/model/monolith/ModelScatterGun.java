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

public class ModelScatterGun extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelScatterGun()
	{
		gunModel = new ModelRendererTurbo[14];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2
		gunModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 3
		gunModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 6
		gunModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 7
		gunModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 8
		gunModel[6] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 9
		gunModel[7] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 10
		gunModel[8] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 11
		gunModel[9] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 12
		gunModel[10] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 13
		gunModel[11] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 14
		gunModel[12] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 15
		gunModel[13] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 17

		gunModel[0].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-2F, 0.5F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 1
		gunModel[0].setRotationPoint(-4F, -2F, -0.55F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 2F, 0F, 0F); // Box 2
		gunModel[1].setRotationPoint(1F, -3F, -0.55F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.2F, 0.25F, -0.3F, 0.2F, 0.25F, -0.3F, 0.2F, 0.25F, -0.3F, 0.2F, 0.25F, -0.3F, 0.2F, -0.5F, 0.3F, 0.2F, -0.5F, 0.3F, 0.2F, -0.5F, 0.3F, 0.2F, -0.5F, 0.3F); // Box 3
		gunModel[2].setRotationPoint(3F, -3.4F, -1.05F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F); // Box 6
		gunModel[3].setRotationPoint(3F, -2.9F, -1.05F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F); // Box 7
		gunModel[4].setRotationPoint(4F, -2.5F, -0.55F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 8
		gunModel[5].setRotationPoint(4F, -3.25F, -1F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 9
		gunModel[6].setRotationPoint(4F, -3.25F, -0.1F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.1F, -0.35F, -0.3F, -0.1F, -0.35F, -0.3F, -0.1F, -0.35F, -0.3F, -0.1F, -0.35F, -0.3F, -0.1F, -0.35F, -0.3F, -0.1F, -0.35F, -0.3F, -0.1F, -0.35F, -0.3F, -0.1F, -0.35F); // Box 10
		gunModel[7].setRotationPoint(9.85F, -3.5F, -0.55F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.1F, -0.35F, -0.3F, -0.1F, -0.35F, -0.3F, -0.1F, -0.35F, -0.3F, -0.1F, -0.35F, -0.3F, -0.1F, -0.35F, -0.3F, -0.1F, -0.35F, -0.3F, -0.1F, -0.35F, -0.3F, -0.1F, -0.35F); // Box 11
		gunModel[8].setRotationPoint(4F, -3.5F, -0.350000000000001F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.1F, -0.35F, -0.3F, -0.1F, -0.35F, -0.3F, -0.1F, -0.35F, -0.3F, -0.1F, -0.35F, -0.3F, -0.1F, -0.35F, -0.3F, -0.1F, -0.35F, -0.3F, -0.1F, -0.35F, -0.3F, -0.1F, -0.35F); // Box 12
		gunModel[9].setRotationPoint(4F, -3.5F, -0.75F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -0.15F, 0.6F, -0.1F, -0.15F, 0.6F, -0.1F, -0.15F, 0F, 0F, -0.15F, 0F, -0.1F, -0.15F, 0.6F, -0.1F, -0.15F, 0.6F, -0.1F, -0.15F, 0F, -0.1F, -0.15F); // Box 13
		gunModel[10].setRotationPoint(4F, -3.25F, -0.55F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 14
		gunModel[11].setRotationPoint(0F, -2F, -0.55F);

		gunModel[12].addShapeBox(-2F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 15
		gunModel[12].setRotationPoint(0F, -2F, -0.55F);
		gunModel[12].rotateAngleZ = 0.26179939F;

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.2F, -0.5F, 0.3F, 0.2F, -0.5F, 0.3F, 0.2F, -0.5F, 0.3F, 0.2F, -0.5F, 0.3F, 0.2F, 0.25F, -0.3F, 0.2F, 0.25F, -0.3F, 0.2F, 0.25F, -0.3F, 0.2F, 0.25F, -0.3F); // Box 17
		gunModel[13].setRotationPoint(3F, -2.4F, -1.05F);



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