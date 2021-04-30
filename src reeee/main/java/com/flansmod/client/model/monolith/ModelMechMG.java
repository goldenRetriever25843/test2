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

public class ModelMechMG extends ModelGun //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelMechMG() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[33];
		gunModel[0] = new ModelRendererTurbo(this, 12, 45, textureX, textureY); // Trigger2
		gunModel[1] = new ModelRendererTurbo(this, 12, 45, textureX, textureY); // Trigger1
		gunModel[2] = new ModelRendererTurbo(this, 1, 45, textureX, textureY); // Handle
		gunModel[3] = new ModelRendererTurbo(this, 1, 19, textureX, textureY); // Gun9
		gunModel[4] = new ModelRendererTurbo(this, 1, 19, textureX, textureY); // Gun8
		gunModel[5] = new ModelRendererTurbo(this, 1, 19, textureX, textureY); // Gun7
		gunModel[6] = new ModelRendererTurbo(this, 18, 32, textureX, textureY); // Gun6
		gunModel[7] = new ModelRendererTurbo(this, 1, 32, textureX, textureY); // Gun5
		gunModel[8] = new ModelRendererTurbo(this, 1, 32, textureX, textureY); // Gun4
		gunModel[9] = new ModelRendererTurbo(this, 1, 19, textureX, textureY); // Gun3
		gunModel[10] = new ModelRendererTurbo(this, 20, 19, textureX, textureY); // Gun21
		gunModel[11] = new ModelRendererTurbo(this, 20, 19, textureX, textureY); // Gun20
		gunModel[12] = new ModelRendererTurbo(this, 1, 19, textureX, textureY); // Gun2
		gunModel[13] = new ModelRendererTurbo(this, 20, 19, textureX, textureY); // Gun19
		gunModel[14] = new ModelRendererTurbo(this, 20, 19, textureX, textureY); // Gun18
		gunModel[15] = new ModelRendererTurbo(this, 26, 43, textureX, textureY); // Gun17
		gunModel[16] = new ModelRendererTurbo(this, 26, 43, textureX, textureY); // Gun16
		gunModel[17] = new ModelRendererTurbo(this, 26, 43, textureX, textureY); // Gun15
		gunModel[18] = new ModelRendererTurbo(this, 26, 48, textureX, textureY); // Gun14
		gunModel[19] = new ModelRendererTurbo(this, 26, 48, textureX, textureY); // Gun13
		gunModel[20] = new ModelRendererTurbo(this, 26, 48, textureX, textureY); // Gun12
		gunModel[21] = new ModelRendererTurbo(this, 1, 19, textureX, textureY); // Gun11
		gunModel[22] = new ModelRendererTurbo(this, 11, 38, textureX, textureY); // Gun10
		gunModel[23] = new ModelRendererTurbo(this, 1, 19, textureX, textureY); // Gun1
		gunModel[24] = new ModelRendererTurbo(this, 23, 25, textureX, textureY); // Grenadelauncher3
		gunModel[25] = new ModelRendererTurbo(this, 23, 25, textureX, textureY); // Grenadelauncher2
		gunModel[26] = new ModelRendererTurbo(this, 23, 25, textureX, textureY); // Grenadelauncher1
		gunModel[27] = new ModelRendererTurbo(this, 1, 37, textureX, textureY); // Gun27
		gunModel[28] = new ModelRendererTurbo(this, 1, 37, textureX, textureY); // Gun26
		gunModel[29] = new ModelRendererTurbo(this, 1, 37, textureX, textureY); // Gun25
		gunModel[30] = new ModelRendererTurbo(this, 1, 37, textureX, textureY); // Gun24
		gunModel[31] = new ModelRendererTurbo(this, 29, 31, textureX, textureY); // Gun23
		gunModel[32] = new ModelRendererTurbo(this, 29, 31, textureX, textureY); // Gun22

		gunModel[0].addShapeBox(2F, -3F, -0.5F, 1, 1, 1, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F); // Trigger2
		gunModel[0].setRotationPoint(0F, 0F, 0F);

		gunModel[1].addShapeBox(2F, -4F, -0.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F); // Trigger1
		gunModel[1].setRotationPoint(0F, 0F, 0F);

		gunModel[2].addBox(-1F, -4F, -1F, 3, 7, 2, 0F); // Handle
		gunModel[2].setRotationPoint(0F, 0F, 0F);

		gunModel[3].addShapeBox(-3F, -5F, -1.5F, 2, 1, 3, 0F, 0F, -.3F, -.1F, 0F, -.3F, -.1F, 0F, -.3F, -.1F, 0F, -.3F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F); // Gun9
		gunModel[3].setRotationPoint(0F, 0F, 0F);

		gunModel[4].addBox(-6F, -11F, -1.5F, 3, 7, 3, 0F); // Gun8
		gunModel[4].setRotationPoint(0F, 0F, 0F);

		gunModel[5].addBox(-3F, -11F, -1.5F, 2, 5, 3, 0F); // Gun7
		gunModel[5].setRotationPoint(0F, 0F, 0F);

		gunModel[6].addBox(5F, -5F, -0.5F, 3, 3, 1, 0F); // Gun6
		gunModel[6].setRotationPoint(0F, 0F, 0F);

		gunModel[7].addShapeBox(8F, -5F, -1F, 1, 2, 2, 0F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun5
		gunModel[7].setRotationPoint(0F, 0F, 0F);

		gunModel[8].addShapeBox(11F, -5F, -1F, 6, 2, 2, 0F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun4
		gunModel[8].setRotationPoint(0F, 0F, 0F);

		gunModel[9].addBox(11F, -8F, -1.5F, 6, 3, 3, 0F); // Gun3
		gunModel[9].setRotationPoint(0F, 0F, 0F);

		gunModel[10].addBox(9F, -10.5F, 1F, 2, 1, 1, 0F); // Gun21
		gunModel[10].setRotationPoint(0F, 0F, 0F);

		gunModel[11].addShapeBox(5F, -11F, -1.5F, 6, 2, 3, 0F, 0F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, .2F, 0F, .5F, .2F, 0F, .5F, 0F, 0F, .5F); // Gun20
		gunModel[11].setRotationPoint(0F, 0F, 0F);

		gunModel[12].addBox(5F, -10F, -1.5F, 6, 5, 3, 0F); // Gun2
		gunModel[12].setRotationPoint(0F, 0F, 0F);

		gunModel[13].addShapeBox(0F, -9F, -1.5F, 11, 1, 3, 0F, 0F, 0F, .5F, .2F, 0F, .5F, .2F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F); // Gun19
		gunModel[13].setRotationPoint(0F, 0F, 0F);

		gunModel[14].addShapeBox(0F, -10F, -1.5F, 5, 1, 3, 0F, 0F, 0F, .25F, 0F, 0F, .25F, 0F, 0F, .25F, 0F, 0F, .25F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F); // Gun18
		gunModel[14].setRotationPoint(0F, 0F, 0F);

		gunModel[15].addShapeBox(-7.5F, -9.9F, -1.5F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Gun17
		gunModel[15].setRotationPoint(0F, 0F, 0F);

		gunModel[16].addShapeBox(-7.5F, -10.9F, -1.5F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun16
		gunModel[16].setRotationPoint(0F, 0F, 0F);

		gunModel[17].addShapeBox(-7.5F, -11.9F, -1.5F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun15
		gunModel[17].setRotationPoint(0F, 0F, 0F);

		gunModel[18].addShapeBox(-6.5F, -12.4F, -2F, 4, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun14
		gunModel[18].setRotationPoint(0F, 0F, 0F);

		gunModel[19].addShapeBox(-6.5F, -11.4F, -2F, 4, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun13
		gunModel[19].setRotationPoint(0F, 0F, 0F);

		gunModel[20].addShapeBox(-6.5F, -9.4F, -2F, 4, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Gun12
		gunModel[20].setRotationPoint(0F, 0F, 0F);

		gunModel[21].addShapeBox(0F, -13F, -1.5F, 5, 2, 3, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun11
		gunModel[21].setRotationPoint(0F, 0F, 0F);

		gunModel[22].addShapeBox(-3F, -6.5F, -1.5F, 2, 2, 3, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F); // Gun10
		gunModel[22].setRotationPoint(0F, 0F, 0F);

		gunModel[23].addBox(-1F, -11F, -1.5F, 6, 7, 3, 0F); // Gun1
		gunModel[23].setRotationPoint(0F, 0F, 0F);

		gunModel[24].addShapeBox(11F, -8.9F, -1.5F, 6, 1, 3, 0F, 0F, -.1F, -.2F, 0F, -.1F, -.2F, 0F, -.1F, -.2F, 0F, -.1F, -.2F, 0F, -.1F, -1F, 0F, -.1F, -1F, 0F, -.1F, -1F, 0F, -.1F, -1F); // Grenadelauncher3
		gunModel[24].setRotationPoint(0F, 0F, 0F);

		gunModel[25].addShapeBox(11F, -9.7F, -1.5F, 6, 1, 3, 0F, 0F, -.1F, -.2F, 0F, -.1F, -.2F, 0F, -.1F, -.2F, 0F, -.1F, -.2F, 0F, -.1F, -.2F, 0F, -.1F, -.2F, 0F, -.1F, -.2F, 0F, -.1F, -.2F); // Grenadelauncher2
		gunModel[25].setRotationPoint(0F, 0F, 0F);

		gunModel[26].addShapeBox(11F, -10.5F, -1.5F, 6, 1, 3, 0F, 0F, -.1F, -1F, 0F, -.1F, -1F, 0F, -.1F, -1F, 0F, -.1F, -1F, 0F, -.1F, -.2F, 0F, -.1F, -.2F, 0F, -.1F, -.2F, 0F, -.1F, -.2F); // Grenadelauncher1
		gunModel[26].setRotationPoint(0F, 0F, 0F);

		gunModel[27].addShapeBox(10F, 4F, -0.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun27
		gunModel[27].setRotationPoint(0F, 0F, 0F);

		gunModel[28].addBox(8F, 0F, -0.5F, 2, 5, 1, 0F); // Gun26
		gunModel[28].setRotationPoint(0F, 0F, 0F);

		gunModel[29].addShapeBox(9F, -1F, -0.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Gun25
		gunModel[29].setRotationPoint(0F, 0F, 0F);

		gunModel[30].addBox(9F, -5F, -0.5F, 2, 4, 1, 0F); // Gun24
		gunModel[30].setRotationPoint(0F, 0F, 0F);

		gunModel[31].addShapeBox(17F, -6.5F, -1F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Gun23
		gunModel[31].setRotationPoint(0F, 0F, 0F);

		gunModel[32].addShapeBox(17F, -7.5F, -1F, 2, 1, 2, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun22
		gunModel[32].setRotationPoint(0F, 0F, 0F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 18, 45, textureX, textureY); // Ammo1

		ammoModel[0].addBox(-0.5F, 3F, -0.5F, 2, 8, 1, 0F); // Ammo1
		ammoModel[0].setRotationPoint(0F, 0F, 0F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}