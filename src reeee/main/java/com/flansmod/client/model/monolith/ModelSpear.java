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

public class ModelSpear extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelSpear()
	{
		gunModel = new ModelRendererTurbo[3];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Shaft
		gunModel[1] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // SpearHead Back
		gunModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // SpearHead

		gunModel[0].addShapeBox(0F, 0F, 0F, 30, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Shaft
		gunModel[0].setRotationPoint(-5F, -2.6F, 0F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.3F, -0.3F); // SpearHead Back
		gunModel[1].setRotationPoint(25F, -2.6F, 0F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.1F, -0.1F); // SpearHead
		gunModel[2].setRotationPoint(27F, -2.6F, 0F);



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