//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelTT33Elite extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelTT33Elite() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[18];
		gunModel[0] = new ModelRendererTurbo(this, 90, 155, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0

		gunModel[0].addBox(0F, 0F, 0F, 14, 38, 11, 0F); // Box 0
		gunModel[0].setRotationPoint(0F, -45F, -0.5F);
		gunModel[0].rotateAngleZ = -0.10471976F;

		gunModel[1].addBox(0F, 0F, 0F, 54, 4, 10, 0F); // Box 0
		gunModel[1].setRotationPoint(-9F, -46F, 0F);

		gunModel[2].addBox(0F, 0F, 0F, 1, 8, 7, 0F); // Box 0
		gunModel[2].setRotationPoint(26F, -44F, 1.5F);

		gunModel[3].addBox(0F, 0F, 0F, 13, 1, 7, 0F); // Box 0
		gunModel[3].setRotationPoint(11.2F, -33.8F, 1.5F);

		gunModel[4].addBox(0F, 0F, 0F, 1, 4, 7, 0F); // Box 0
		gunModel[4].setRotationPoint(26.3F, -36.55F, 1.5F);
		gunModel[4].rotateAngleZ = -0.78539816F;

		gunModel[5].addBox(0F, 0F, 0F, 1, 8, 7, 0F); // Box 0
		gunModel[5].setRotationPoint(27F, -45F, 1.5F);
		gunModel[5].rotateAngleZ = -0.12217305F;

		gunModel[6].addBox(0F, 0F, 0F, 1, 6, 7, 0F); // Box 0
		gunModel[6].setRotationPoint(29F, -45F, 1.5F);
		gunModel[6].rotateAngleZ = -0.50614548F;

		gunModel[7].addBox(0F, 0F, 0F, 1, 8, 7, 0F); // Box 0
		gunModel[7].setRotationPoint(23.2F, -45F, 1.5F);
		gunModel[7].rotateAngleZ = 0.34906585F;

		gunModel[8].addBox(0F, 0F, 0F, 1, 8, 7, 0F); // Box 0
		gunModel[8].setRotationPoint(24.2F, -46F, 1.5F);
		gunModel[8].rotateAngleZ = 0.26179939F;

		gunModel[9].addBox(0F, 0F, 0F, 7, 1, 7, 0F); // Box 0
		gunModel[9].setRotationPoint(10.2F, -35.8F, 1.5F);
		gunModel[9].rotateAngleZ = -0.33161256F;

		gunModel[10].addBox(0F, 0F, 0F, 7, 1, 7, 0F); // Box 0
		gunModel[10].setRotationPoint(10.2F, -31.5F, 1.5F);
		gunModel[10].rotateAngleZ = 0.34906585F;

		gunModel[11].addBox(0F, 0F, 0F, 7, 1, 7, 0F); // Box 0
		gunModel[11].setRotationPoint(10.2F, -33F, 1.5F);
		gunModel[11].rotateAngleZ = 0.10471976F;

		gunModel[12].addBox(0F, 0F, 0F, 4, 10, 7, 0F); // Box 0
		gunModel[12].setRotationPoint(14F, -47F, 1.5F);
		gunModel[12].rotateAngleZ = -0.64577182F;

		gunModel[13].addBox(0F, 0F, 0F, 8, 10, 2, 0F); // Box 0
		gunModel[13].setRotationPoint(11.2F, -42.8F, 4F);

		gunModel[14].addBox(0F, 0F, 0F, 3, 3, 2, 0F); // Box 0
		gunModel[14].setRotationPoint(16.2F, -35.8F, 4F);
		gunModel[14].rotateAngleZ = 0.26179939F;

		gunModel[15].addBox(0F, 0F, 0F, 11, 3, 10, 0F); // Box 0
		gunModel[15].setRotationPoint(40F, -48F, 0F);
		gunModel[15].rotateAngleZ = 0.36651914F;

		gunModel[16].addBox(0F, 0F, 0F, 7, 13, 10, 0F); // Box 0
		gunModel[16].setRotationPoint(-5F, -43F, 0F);
		gunModel[16].rotateAngleZ = 0.34906585F;

		gunModel[17].addBox(0F, 0F, 0F, 7, 13, 10, 0F); // Box 0
		gunModel[17].setRotationPoint(-9F, -42F, 0F);
		gunModel[17].rotateAngleZ = 0.85521133F;


		defaultBarrelModel = new ModelRendererTurbo[1];
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 0, 150, textureX, textureY); // Box 0

		defaultBarrelModel[0].addBox(0F, 0F, 0F, 21, 5, 5, 0F); // Box 0
		defaultBarrelModel[0].setRotationPoint(43F, -53F, 2.5F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 350, 155, textureX, textureY); // Box 0

		ammoModel[0].addBox(0F, 0F, 0F, 13, 37, 9, 0F); // Box 0
		ammoModel[0].setRotationPoint(0.5F, -45F, 0F);
		ammoModel[0].rotateAngleZ = -0.10471976F;


		slideModel = new ModelRendererTurbo[19];
		slideModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		slideModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		slideModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		slideModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		slideModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		slideModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		slideModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		slideModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		slideModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		slideModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		slideModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		slideModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		slideModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		slideModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		slideModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		slideModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		slideModel[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		slideModel[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		slideModel[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0

		slideModel[0].addBox(0F, 0F, 0F, 49, 8, 10, 0F); // Box 0
		slideModel[0].setRotationPoint(-4F, -54F, 0F);

		slideModel[1].addBox(0F, 0F, 0F, 18, 6, 10, 0F); // Box 0
		slideModel[1].setRotationPoint(45F, -54F, 0F);

		slideModel[2].addBox(0F, 0F, 0F, 18, 4, 7, 0F); // Box 0
		slideModel[2].setRotationPoint(45F, -48F, 1.5F);

		slideModel[3].addBox(0F, -0.5F, -1.5F, 18, 1, 2, 0F); // Box 0
		slideModel[3].setRotationPoint(45F, -43.3F, 3F);
		slideModel[3].rotateAngleX = -0.78539816F;

		slideModel[4].addBox(0F, -0.5F, -0.5F, 18, 1, 2, 0F); // Box 0
		slideModel[4].setRotationPoint(45F, -43.3F, 7F);
		slideModel[4].rotateAngleX = 0.78539816F;

		slideModel[5].addBox(0F, 0F, 0F, 18, 4, 4, 0F); // Box 0
		slideModel[5].setRotationPoint(45F, -46.6F, 3F);

		slideModel[6].addBox(0F, 0F, 0F, 65, 1, 8, 0F); // Box 0
		slideModel[6].setRotationPoint(-2F, -55F, 1F);

		slideModel[7].addBox(0F, -0.5F, -0.5F, 65, 1, 1, 0F); // Box 0
		slideModel[7].setRotationPoint(-2F, -54.3F, 1F);
		slideModel[7].rotateAngleX = -0.78539816F;

		slideModel[8].addBox(0F, -0.5F, -0.5F, 65, 1, 1, 0F); // Box 0
		slideModel[8].setRotationPoint(-2F, -54.3F, 9F);
		slideModel[8].rotateAngleX = -0.78539816F;

		slideModel[9].addBox(0F, -0.5F, -0.5F, 65, 1, 1, 0F); // Box 0
		slideModel[9].setRotationPoint(-2F, -54F, 9.3F);
		slideModel[9].rotateAngleX = -0.78539816F;

		slideModel[10].addBox(0F, -0.5F, -0.5F, 65, 1, 1, 0F); // Box 0
		slideModel[10].setRotationPoint(-2F, -54F, 0.7F);
		slideModel[10].rotateAngleX = -0.78539816F;

		slideModel[11].addBox(0F, 0F, 0F, 5, 3, 10, 0F); // Box 0
		slideModel[11].setRotationPoint(-6F, -53F, 0F);
		slideModel[11].rotateAngleZ = 0.45378561F;

		slideModel[12].addBox(0F, 0F, 0F, 5, 6, 10, 0F); // Box 0
		slideModel[12].setRotationPoint(-9F, -49F, 0F);
		slideModel[12].rotateAngleZ = 0.9250245F;

		slideModel[13].addBox(0F, 0F, 0F, 5, 5, 10, 0F); // Box 0
		slideModel[13].setRotationPoint(-9F, -50F, 0F);
		slideModel[13].rotateAngleZ = -0.15707963F;

		slideModel[14].addBox(0F, 0F, 0F, 5, 3, 2, 0F); // Box 0
		slideModel[14].setRotationPoint(55F, -57F, 4F);
		slideModel[14].rotateAngleZ = -0.05235988F;

		slideModel[15].addBox(0F, 0F, 0F, 1, 3, 7, 0F); // Box 0
		slideModel[15].setRotationPoint(5F, -57F, 1.5F);

		slideModel[16].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 0
		slideModel[16].setRotationPoint(5F, -58F, 1.5F);

		slideModel[17].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 0
		slideModel[17].setRotationPoint(5F, -58F, 5.5F);

		slideModel[18].addBox(0F, 0F, 0F, 3, 3, 7, 0F); // Box 0
		slideModel[18].setRotationPoint(0F, -57F, 1.5F);


		animationType = EnumAnimationType.PISTOL_CLIP;
		translateAll(0F, 0F, -5F);
		gunSlideDistance = 1F;


		flipAll();
	}
}