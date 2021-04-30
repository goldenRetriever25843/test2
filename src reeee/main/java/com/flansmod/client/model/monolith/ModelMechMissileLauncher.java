//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMechMissileLauncher extends ModelGun //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelMechMissileLauncher() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[19];
		gunModel[0] = new ModelRendererTurbo(this, 2, 29, textureX, textureY); // Gun1
		gunModel[1] = new ModelRendererTurbo(this, 17, 47, textureX, textureY); // Gun10
		gunModel[2] = new ModelRendererTurbo(this, 2, 29, textureX, textureY); // Gun11
		gunModel[3] = new ModelRendererTurbo(this, 2, 67, textureX, textureY); // Gun12
		gunModel[4] = new ModelRendererTurbo(this, 2, 29, textureX, textureY); // Gun13
		gunModel[5] = new ModelRendererTurbo(this, 2, 29, textureX, textureY); // Gun14
		gunModel[6] = new ModelRendererTurbo(this, 2, 29, textureX, textureY); // Gun15
		gunModel[7] = new ModelRendererTurbo(this, 31, 43, textureX, textureY); // Gun16
		gunModel[8] = new ModelRendererTurbo(this, 31, 43, textureX, textureY); // Gun17
		gunModel[9] = new ModelRendererTurbo(this, 2, 29, textureX, textureY); // Gun18
		gunModel[10] = new ModelRendererTurbo(this, 2, 67, textureX, textureY); // Gun2
		gunModel[11] = new ModelRendererTurbo(this, 2, 29, textureX, textureY); // Gun3
		gunModel[12] = new ModelRendererTurbo(this, 2, 29, textureX, textureY); // Gun4
		gunModel[13] = new ModelRendererTurbo(this, 2, 29, textureX, textureY); // Gun5
		gunModel[14] = new ModelRendererTurbo(this, 2, 29, textureX, textureY); // Gun6
		gunModel[15] = new ModelRendererTurbo(this, 31, 43, textureX, textureY); // Gun7
		gunModel[16] = new ModelRendererTurbo(this, 31, 43, textureX, textureY); // Gun8
		gunModel[17] = new ModelRendererTurbo(this, 17, 47, textureX, textureY); // Gun9
		gunModel[18] = new ModelRendererTurbo(this, 1, 47, textureX, textureY); // Gunhandle

		gunModel[0].addShapeBox(-23F, -15F, 3F, 35, 8, 1, 0F, -1.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun1
		gunModel[0].setRotationPoint(0F, 0F, 0F);

		gunModel[1].addShapeBox(-15F, -8F, 4F, 3, 16, 2, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun10
		gunModel[1].setRotationPoint(0F, 0F, 0F);

		gunModel[2].addShapeBox(-23F, 5F, -4F, 35, 2, 8, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun11
		gunModel[2].setRotationPoint(0F, 0F, 0F);

		gunModel[3].addShapeBox(-23F, 7F, -3F, 33, 8, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -1.5F, 0F, 0F); // Gun12
		gunModel[3].setRotationPoint(0F, 0F, 0F);

		gunModel[4].addShapeBox(-23F, 7F, 3F, 35, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -1.5F, 0F, 0F); // Gun13
		gunModel[4].setRotationPoint(0F, 0F, 0F);

		gunModel[5].addShapeBox(-23F, 7F, -4F, 35, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -1.5F, 0F, 0F); // Gun14
		gunModel[5].setRotationPoint(0F, 0F, 0F);

		gunModel[6].addShapeBox(6.5F, 14F, -3F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F); // Gun15
		gunModel[6].setRotationPoint(0F, 0F, 0F);

		gunModel[7].addShapeBox(10F, 8F, -0.5F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Gun16
		gunModel[7].setRotationPoint(0F, 0F, 0F);

		gunModel[8].addShapeBox(9F, 10F, -3F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F); // Gun17
		gunModel[8].setRotationPoint(0F, 0F, 0F);

		gunModel[9].addShapeBox(11F, 7F, -3F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F); // Gun18
		gunModel[9].setRotationPoint(0F, 0F, 0F);

		gunModel[10].addShapeBox(-23F, -15F, -3F, 33, 8, 6, 0F, -1.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun2
		gunModel[10].setRotationPoint(0F, 0F, 0F);

		gunModel[11].addShapeBox(-23F, -15F, -4F, 35, 8, 1, 0F, -1.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun3
		gunModel[11].setRotationPoint(0F, 0F, 0F);

		gunModel[12].addShapeBox(-23F, -7F, -4F, 35, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F); // Gun4
		gunModel[12].setRotationPoint(0F, 0F, 0F);

		gunModel[13].addShapeBox(11F, -8F, -3F, 1, 1, 6, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun5
		gunModel[13].setRotationPoint(0F, 0F, 0F);

		gunModel[14].addShapeBox(6F, -15F, -3F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F); // Gun6
		gunModel[14].setRotationPoint(0F, 0F, 0F);

		gunModel[15].addShapeBox(8.7F, -11.5F, -3F, 1, 1, 6, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun7
		gunModel[15].setRotationPoint(0F, 0F, 0F);

		gunModel[16].addShapeBox(10.5F, -14F, -0.5F, 1, 7, 1, 0F, 3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun8
		gunModel[16].setRotationPoint(0F, 0F, 0F);

		gunModel[17].addShapeBox(-15F, -8F, -6F, 3, 16, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Gun9
		gunModel[17].setRotationPoint(0F, 0F, 0F);

		gunModel[18].addBox(0F, -5F, -1F, 3, 10, 2, 0F); // Gunhandle
		gunModel[18].setRotationPoint(0F, 0F, 0F);


		ammoModel = new ModelRendererTurbo[16];
		ammoModel[0] = new ModelRendererTurbo(this, 17, 85, textureX, textureY); // Missile1
		ammoModel[1] = new ModelRendererTurbo(this, 6, 85, textureX, textureY); // Missile2
		ammoModel[2] = new ModelRendererTurbo(this, 17, 85, textureX, textureY); // Missile3
		ammoModel[3] = new ModelRendererTurbo(this, 6, 85, textureX, textureY); // Missile4
		ammoModel[4] = new ModelRendererTurbo(this, 17, 85, textureX, textureY); // Missile5
		ammoModel[5] = new ModelRendererTurbo(this, 6, 85, textureX, textureY); // Missile6
		ammoModel[6] = new ModelRendererTurbo(this, 6, 85, textureX, textureY); // Missile7
		ammoModel[7] = new ModelRendererTurbo(this, 17, 85, textureX, textureY); // Missile8
		ammoModel[8] = new ModelRendererTurbo(this, 6, 85, textureX, textureY); // Missile9
		ammoModel[9] = new ModelRendererTurbo(this, 6, 85, textureX, textureY); // Missile10
		ammoModel[10] = new ModelRendererTurbo(this, 17, 85, textureX, textureY); // Missile11
		ammoModel[11] = new ModelRendererTurbo(this, 17, 85, textureX, textureY); // Missile12
		ammoModel[12] = new ModelRendererTurbo(this, 17, 85, textureX, textureY); // Missile13
		ammoModel[13] = new ModelRendererTurbo(this, 17, 85, textureX, textureY); // Missile14
		ammoModel[14] = new ModelRendererTurbo(this, 6, 85, textureX, textureY); // Missile15
		ammoModel[15] = new ModelRendererTurbo(this, 6, 85, textureX, textureY); // Missile16

		ammoModel[0].addBox(-10F, -13.7F, -2.7F, 18, 2, 2, 0F); // Missile1
		ammoModel[0].setRotationPoint(0F, 0F, 0F);

		ammoModel[1].addShapeBox(8F, -13.7F, -2.7F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F); // Missile2
		ammoModel[1].setRotationPoint(0F, 0F, 0F);

		ammoModel[2].addBox(-10F, -13.7F, 0.8F, 18, 2, 2, 0F); // Missile3
		ammoModel[2].setRotationPoint(0F, 0F, 0F);

		ammoModel[3].addShapeBox(8F, -13.7F, 0.8F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F); // Missile4
		ammoModel[3].setRotationPoint(0F, 0F, 0F);

		ammoModel[4].addBox(-8.5F, -10.2F, 0.8F, 18, 2, 2, 0F); // Missile5
		ammoModel[4].setRotationPoint(0F, 0F, 0F);

		ammoModel[5].addShapeBox(9.5F, -10.2F, 0.8F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F); // Missile6
		ammoModel[5].setRotationPoint(0F, 0F, 0F);

		ammoModel[6].addShapeBox(9.5F, -10.2F, -2.7F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F); // Missile7
		ammoModel[6].setRotationPoint(0F, 0F, 0F);

		ammoModel[7].addBox(-8.5F, -10.2F, -2.7F, 18, 2, 2, 0F); // Missile8
		ammoModel[7].setRotationPoint(0F, 0F, 0F);

		ammoModel[8].addShapeBox(9.5F, 7.8F, 0.8F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F); // Missile9
		ammoModel[8].setRotationPoint(0F, 0F, 0F);

		ammoModel[9].addShapeBox(9.5F, 7.8F, -2.7F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F); // Missile10
		ammoModel[9].setRotationPoint(0F, 0F, 0F);

		ammoModel[10].addBox(-8.5F, 7.8F, -2.7F, 18, 2, 2, 0F); // Missile11
		ammoModel[10].setRotationPoint(0F, 0F, 0F);

		ammoModel[11].addBox(-8.5F, 7.8F, 0.8F, 18, 2, 2, 0F); // Missile12
		ammoModel[11].setRotationPoint(0F, 0F, 0F);

		ammoModel[12].addBox(-10F, 11.3F, -2.7F, 18, 2, 2, 0F); // Missile13
		ammoModel[12].setRotationPoint(0F, 0F, 0F);

		ammoModel[13].addBox(-10F, 11.3F, 0.8F, 18, 2, 2, 0F); // Missile14
		ammoModel[13].setRotationPoint(0F, 0F, 0F);

		ammoModel[14].addShapeBox(8F, 11.3F, 0.8F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F); // Missile15
		ammoModel[14].setRotationPoint(0F, 0F, 0F);

		ammoModel[15].addShapeBox(8F, 11.3F, -2.7F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F); // Missile16
		ammoModel[15].setRotationPoint(0F, 0F, 0F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}