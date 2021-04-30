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

public class ModelGuntou extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelGuntou()
	{
		gunModel = new ModelRendererTurbo[5];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 4

		gunModel[0].addShapeBox(0F, 0.2F, 0F, 2, 1, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 0
		gunModel[0].setRotationPoint(-1.5F, -3F, -0.5F);
		gunModel[0].rotateAngleZ = -0.12217305F;

		gunModel[1].addShapeBox(0.5F, 0.55F, 0F, 1, 8, 1, 0F,-0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F); // Box 1
		gunModel[1].setRotationPoint(-1.5F, -3F, -0.5F);
		gunModel[1].rotateAngleZ = -0.19198622F;

		gunModel[2].addShapeBox(0.5F, -6.45F, 0F, 1, 8, 1, 0F,-0.22F, -0.3F, -0.475F, -0.22F, -0.3F, -0.475F, -0.22F, -0.3F, -0.475F, -0.22F, -0.3F, -0.475F, -0.22F, -0.8F, -0.475F, -0.22F, -0.8F, -0.475F, -0.22F, -0.8F, -0.475F, -0.22F, -0.8F, -0.475F); // Box 2
		gunModel[2].setRotationPoint(-1.5F, -3F, -0.5F);
		gunModel[2].rotateAngleZ = -0.12217305F;

		gunModel[3].addShapeBox(-0.5F, -7.45F, 0F, 1, 8, 1, 0F,-0.22F, -0.3F, -0.49F, -0.22F, -0.3F, -0.49F, -0.22F, -0.3F, -0.49F, -0.22F, -0.3F, -0.49F, -0.22F, -0.8F, -0.49F, -0.22F, -0.8F, -0.49F, -0.22F, -0.8F, -0.49F, -0.22F, -0.8F, -0.49F); // Box 3
		gunModel[3].setRotationPoint(0.2F, -8.7F, -0.5F);
		gunModel[3].rotateAngleZ = -0.05235988F;

		gunModel[4].addShapeBox(-0.5F, -13.45F, 0F, 1, 8, 1, 0F,-0.22F, -0.3F, -0.49F, -0.22F, -1.3F, -0.49F, -0.22F, -1.3F, -0.49F, -0.22F, -0.3F, -0.49F, -0.22F, -0.8F, -0.49F, -0.22F, -0.8F, -0.49F, -0.22F, -0.8F, -0.49F, -0.22F, -0.8F, -0.49F); // Box 4
		gunModel[4].setRotationPoint(0.3F, -8.7F, -0.5F);
		gunModel[4].rotateAngleZ = -0.03490659F;



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