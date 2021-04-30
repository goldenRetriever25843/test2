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

public class ModelThompsonElite extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelThompsonElite() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[26];
		gunModel[0] = new ModelRendererTurbo(this, 340, 500, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[2] = new ModelRendererTurbo(this, 25, 800, textureX, textureY); // Box 0
		gunModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[6] = new ModelRendererTurbo(this, 56, 800, textureX, textureY); // Box 0
		gunModel[7] = new ModelRendererTurbo(this, 56, 800, textureX, textureY); // Box 0
		gunModel[8] = new ModelRendererTurbo(this, 56, 800, textureX, textureY); // Box 0
		gunModel[9] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 0
		gunModel[10] = new ModelRendererTurbo(this, 300, 0, textureX, textureY); // Box 0
		gunModel[11] = new ModelRendererTurbo(this, 300, 0, textureX, textureY); // Box 0
		gunModel[12] = new ModelRendererTurbo(this, 300, 0, textureX, textureY); // Box 0
		gunModel[13] = new ModelRendererTurbo(this, 300, 0, textureX, textureY); // Box 0
		gunModel[14] = new ModelRendererTurbo(this, 300, 0, textureX, textureY); // Box 0
		gunModel[15] = new ModelRendererTurbo(this, 300, 0, textureX, textureY); // Box 0
		gunModel[16] = new ModelRendererTurbo(this, 50, 0, textureX, textureY); // Box 0
		gunModel[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[19] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 0
		gunModel[20] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 0
		gunModel[21] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 0
		gunModel[22] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 0
		gunModel[23] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 0
		gunModel[24] = new ModelRendererTurbo(this, 0, 80, textureX, textureY); // Box 0
		gunModel[25] = new ModelRendererTurbo(this, 0, 80, textureX, textureY); // Box 0

		gunModel[0].addBox(0F, 0F, 0F, 87, 11, 14, 0F); // Box 0
		gunModel[0].setRotationPoint(19F, -51F, -19.5F);

		gunModel[1].addBox(0F, 0F, 0F, 37, 4, 14, 0F); // Box 0
		gunModel[1].setRotationPoint(45F, -40F, -19.5F);

		gunModel[2].addBox(0F, 0F, 0F, 13, 30, 13, 0F); // Box 0
		gunModel[2].setRotationPoint(57F, -41F, -19F);
		gunModel[2].rotateAngleZ = -0.40142573F;

		gunModel[3].addBox(0F, 0F, 0F, 3, 9, 14, 0F); // Box 0
		gunModel[3].setRotationPoint(65F, -36F, -19.5F);

		gunModel[4].addBox(0F, 0F, 0F, 17, 2, 13, 0F); // Box 0
		gunModel[4].setRotationPoint(65F, -29F, -19F);

		gunModel[5].addBox(0F, 0F, 0F, 3, 9, 13, 0F); // Box 0
		gunModel[5].setRotationPoint(79F, -37F, -19F);

		gunModel[6].addBox(0F, 0F, 0F, 13, 6, 13, 0F); // Box 0
		gunModel[6].setRotationPoint(48F, -17F, -19F);
		gunModel[6].rotateAngleZ = -0.66322512F;

		gunModel[7].addBox(0F, 0F, 0F, 5, 12, 13, 0F); // Box 0
		gunModel[7].setRotationPoint(53F, -16.5F, -19F);
		gunModel[7].rotateAngleZ = 0.06981317F;

		gunModel[8].addBox(0F, 0F, 0F, 5, 12, 13, 0F); // Box 0
		gunModel[8].setRotationPoint(56F, -26.5F, -19F);
		gunModel[8].rotateAngleZ = 0.06981317F;

		gunModel[9].addBox(0F, 0F, 0F, 57, 11, 14, 0F); // Box 0
		gunModel[9].setRotationPoint(105F, -47.5F, -19.5F);
		gunModel[9].rotateAngleZ = 0.01745329F;

		gunModel[10].addBox(0F, -3F, -1F, 68, 6, 2, 0F); // Box 0
		gunModel[10].setRotationPoint(106F, -48F, -12.5F);

		gunModel[11].addBox(0F, -3F, -1F, 68, 6, 2, 0F); // Box 0
		gunModel[11].setRotationPoint(106F, -48F, -12.5F);
		gunModel[11].rotateAngleX = 0.61086524F;

		gunModel[12].addBox(0F, -3F, -1F, 68, 6, 2, 0F); // Box 0
		gunModel[12].setRotationPoint(106F, -48F, -12.5F);
		gunModel[12].rotateAngleX = 1.22173048F;

		gunModel[13].addBox(0F, -3F, -1F, 68, 6, 2, 0F); // Box 0
		gunModel[13].setRotationPoint(106F, -48F, -12.5F);
		gunModel[13].rotateAngleX = 1.83259571F;

		gunModel[14].addBox(0F, -3F, -1F, 68, 6, 2, 0F); // Box 0
		gunModel[14].setRotationPoint(106F, -48F, -12.5F);
		gunModel[14].rotateAngleX = 2.44346095F;

		gunModel[15].addBox(0F, -3F, -1F, 68, 6, 2, 0F); // Box 0
		gunModel[15].setRotationPoint(106F, -48F, -12.5F);
		gunModel[15].rotateAngleX = 2.51327412F;

		gunModel[16].addBox(0F, -3F, -1F, 2, 6, 2, 0F); // Box 0
		gunModel[16].setRotationPoint(171F, -53F, -12.5F);

		gunModel[17].addBox(0F, -3F, -1F, 2, 6, 2, 0F); // Box 0
		gunModel[17].setRotationPoint(170F, -50F, -12.5F);

		gunModel[18].addBox(0F, -3F, -1F, 2, 1, 2, 0F); // Box 0
		gunModel[18].setRotationPoint(169.5F, -51F, -12.5F);
		gunModel[18].rotateAngleZ = -0.52359878F;

		gunModel[19].addBox(0F, 0F, 0F, 60, 11, 11, 0F); // Box 0
		gunModel[19].setRotationPoint(-15F, -32F, -18F);
		gunModel[19].rotateAngleZ = 0.26179939F;

		gunModel[20].addBox(0F, 0F, 0F, 39, 11, 11, 0F); // Box 0
		gunModel[20].setRotationPoint(-32F, -24F, -18F);
		gunModel[20].rotateAngleZ = 0.34906585F;

		gunModel[21].addBox(0F, 0F, 0F, 43, 14, 11, 0F); // Box 0
		gunModel[21].setRotationPoint(-35F, -38F, -18F);
		gunModel[21].rotateAngleZ = 0.06981317F;

		gunModel[22].addBox(0F, 0F, 0F, 3, 15, 11, 0F); // Box 0
		gunModel[22].setRotationPoint(8F, -40F, -18F);
		gunModel[22].rotateAngleZ = -0.62831853F;

		gunModel[23].addBox(0F, 0F, 0F, 17, 14, 11, 0F); // Box 0
		gunModel[23].setRotationPoint(-35F, -28F, -18F);
		gunModel[23].rotateAngleZ = 0.38397244F;

		gunModel[24].addBox(0F, 0F, 0F, 17, 7, 3, 0F); // Box 0
		gunModel[24].setRotationPoint(38F, -57F, -17.5F);
		gunModel[24].rotateAngleZ = -0.40142573F;

		gunModel[25].addBox(0F, 0F, 0F, 17, 7, 3, 0F); // Box 0
		gunModel[25].setRotationPoint(38F, -57F, -10.5F);
		gunModel[25].rotateAngleZ = -0.40142573F;


		defaultBarrelModel = new ModelRendererTurbo[1];
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 60, 60, textureX, textureY); // Box 0

		defaultBarrelModel[0].addBox(0F, -3F, -1F, 2, 1, 1, 0F); // Box 0
		defaultBarrelModel[0].setRotationPoint(172F, -45.5F, -12F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0

		ammoModel[0].addBox(0F, 0F, 0F, 13, 54, 10, 0F); // Box 0
		ammoModel[0].setRotationPoint(82F, -41F, -17F);


		slideModel = new ModelRendererTurbo[1];
		slideModel[0] = new ModelRendererTurbo(this, 500, 0, textureX, textureY); // Box 0

		slideModel[0].addBox(0F, 0F, 0F, 4, 4, 14, 0F); // Box 0
		slideModel[0].setRotationPoint(75F, -47F, -22.5F);

		animationType = EnumAnimationType.PISTOL_CLIP;

		translateAll(-42F, 2F, 13F);
		gunSlideDistance = 3F;


		flipAll();
	}
}