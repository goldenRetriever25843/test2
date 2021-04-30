//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.1.9
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelGladius extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelGladius()
	{
		gunModel = new ModelRendererTurbo[5];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Hilt
		gunModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Bottom
		gunModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Hilt transition
		gunModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Blade
		gunModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 5

		gunModel[0].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Hilt
		gunModel[0].setRotationPoint(0.2F, -2F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.8F, -0.6F, -0.8F, -0.8F, -0.6F, -0.8F, -0.8F, -0.6F, -0.8F, -0.8F, -0.6F, -0.8F); // Bottom
		gunModel[1].setRotationPoint(-0.3F, 2F, -1F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Hilt transition
		gunModel[2].setRotationPoint(0.2F, -3F, -1F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F,-0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Blade
		gunModel[3].setRotationPoint(0.2F, -10.7F, -1F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.3F, -1F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, -1F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Box 5
		gunModel[4].setRotationPoint(0.2F, -12.4F, -1F);



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