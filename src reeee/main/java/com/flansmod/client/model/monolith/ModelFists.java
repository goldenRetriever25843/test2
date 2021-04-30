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

public class ModelFists extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelFists()
	{
		gunModel = new ModelRendererTurbo[11];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 6
		gunModel[7] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 7
		gunModel[8] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 8
		gunModel[9] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 9
		gunModel[10] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 10

		gunModel[0].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 0
		gunModel[0].setRotationPoint(-2F, -2F, -2F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 1
		gunModel[1].setRotationPoint(1F, 0F, -2F);
		gunModel[1].rotateAngleY = 0.12217305F;

		gunModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 2
		gunModel[2].setRotationPoint(1F, -1F, -2F);
		gunModel[2].rotateAngleY = 0.10471976F;

		gunModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 3
		gunModel[3].setRotationPoint(1F, -2F, -2F);
		gunModel[3].rotateAngleY = 0.08726646F;
		gunModel[3].rotateAngleZ = 0.03490659F;

		gunModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 4
		gunModel[4].setRotationPoint(1F, 1F, -2F);
		gunModel[4].rotateAngleY = 0.15707963F;

		gunModel[5].addShapeBox(-0.5F, 0F, 0F, 3, 1, 1, 0F,0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 5
		gunModel[5].setRotationPoint(3F, 1F, -1.2F);
		gunModel[5].rotateAngleY = 1.74532925F;

		gunModel[6].addShapeBox(-0.5F, 0F, 0F, 3, 1, 1, 0F,0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 6
		gunModel[6].setRotationPoint(3F, 0F, -1.26F);
		gunModel[6].rotateAngleY = 1.71042267F;

		gunModel[7].addShapeBox(-0.5F, 0F, 0F, 3, 1, 1, 0F,0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 7
		gunModel[7].setRotationPoint(3F, -1F, -1.28F);
		gunModel[7].rotateAngleY = 1.69296937F;

		gunModel[8].addShapeBox(-0.5F, 0F, 0F, 3, 1, 1, 0F,0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 8
		gunModel[8].setRotationPoint(3F, -2F, -1.3F);
		gunModel[8].rotateAngleY = 1.67551608F;
		gunModel[8].rotateAngleZ = 0.03490659F;

		gunModel[9].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 9
		gunModel[9].setRotationPoint(0F, -2.3F, 1F);
		gunModel[9].rotateAngleX = 0.10471976F;
		gunModel[9].rotateAngleY = 0.19198622F;
		gunModel[9].rotateAngleZ = -0.17453293F;

		gunModel[10].addBox(1.5F, 0F, 0F, 1, 2, 1, 0F); // Box 10
		gunModel[10].setRotationPoint(0F, -1.8F, 1F);
		gunModel[10].rotateAngleX = 0.10471976F;
		gunModel[10].rotateAngleY = 0.19198622F;
		gunModel[10].rotateAngleZ = 0.03490659F;



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