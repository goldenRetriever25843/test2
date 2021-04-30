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

public class ModelAUSten extends ModelGun //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelAUSten() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[35];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		gunModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 4
		gunModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 5
		gunModel[3] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 8
		gunModel[4] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 9
		gunModel[5] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 12
		gunModel[6] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 14
		gunModel[7] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 16
		gunModel[8] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 17
		gunModel[9] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 18
		gunModel[10] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 19
		gunModel[11] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 20
		gunModel[12] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 21
		gunModel[13] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 22
		gunModel[14] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 23
		gunModel[15] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 24
		gunModel[16] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 25
		gunModel[17] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 31
		gunModel[18] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 32
		gunModel[19] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 33
		gunModel[20] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 0
		gunModel[21] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 1
		gunModel[22] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 2
		gunModel[23] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 3
		gunModel[24] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 0
		gunModel[25] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 1
		gunModel[26] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 2
		gunModel[27] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 3
		gunModel[28] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 4
		gunModel[29] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 5
		gunModel[30] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 6
		gunModel[31] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 7
		gunModel[32] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 8
		gunModel[33] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 9
		gunModel[34] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 10

		gunModel[0].addShapeBox(0F, 0F, 0F, 37, 5, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		gunModel[0].setRotationPoint(-3F, -19F, -4F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 37, 2, 8, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		gunModel[1].setRotationPoint(-3F, -21F, -4F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 37, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 5
		gunModel[2].setRotationPoint(-3F, -14F, -4F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		gunModel[3].setRotationPoint(50F, -20.5F, -3F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F); // Box 9
		gunModel[4].setRotationPoint(50F, -14.5F, -3F);

		gunModel[5].addBox(0F, 0F, 0F, 10, 4, 6, 0F); // Box 12
		gunModel[5].setRotationPoint(50F, -18.5F, -3F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 24, 2, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		gunModel[6].setRotationPoint(60F, -17.7F, -1.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F, 0F, 0.3F, -2F, 0F, 0.3F, -2F, 0F, 0.3F, -2F, 0F, 0.3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		gunModel[7].setRotationPoint(-5F, -21F, -4.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 2, 5, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		gunModel[8].setRotationPoint(-5F, -19F, -4.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 18
		gunModel[9].setRotationPoint(-5F, -14F, -4.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 37, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F); // Box 19
		gunModel[10].setRotationPoint(-3F, -12F, -2F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 17, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -2F, 0F, 0F); // Box 20
		gunModel[11].setRotationPoint(9F, -7F, -2F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		gunModel[12].setRotationPoint(9F, -7F, -1F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		gunModel[13].setRotationPoint(4F, -7F, -1F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 23
		gunModel[14].setRotationPoint(4F, -3F, -1F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		gunModel[15].setRotationPoint(6F, -7F, -0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 10, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		gunModel[16].setRotationPoint(37F, -19F, 4F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		gunModel[17].setRotationPoint(-6F, -18F, -1.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		gunModel[18].setRotationPoint(48F, -22.5F, -1F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		gunModel[19].setRotationPoint(7F, -11F, -4F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[20].setRotationPoint(-4F, -24F, -2.1F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		gunModel[21].setRotationPoint(-4F, -24F, 0.9F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		gunModel[22].setRotationPoint(-4F, -22F, -1.1F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 3
		gunModel[23].setRotationPoint(-4F, -25F, -1.1F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 24, 2, 3, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[24].setRotationPoint(60F, -19.2F, -1.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 24, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 1
		gunModel[25].setRotationPoint(60F, -15.7F, -1.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 16, 5, 8, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 2
		gunModel[26].setRotationPoint(34F, -19F, -4F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 16, 2, 8, 0F, 0F, 0.2F, -1.8F, 0F, 0.2F, -1.8F, 0F, 0.2F, -1.8F, 0F, 0.2F, -1.8F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 3
		gunModel[27].setRotationPoint(34F, -21F, -4F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 16, 2, 8, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, -1.8F, 0F, 0.2F, -1.8F, 0F, 0F, -1.8F, 0F, 0.2F, -1.8F); // Box 4
		gunModel[28].setRotationPoint(34F, -14F, -4F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 7, 6, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[29].setRotationPoint(-3.5F, -7F, -2F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 7, 14, 4, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		gunModel[30].setRotationPoint(-2F, -5F, -2F);
		gunModel[30].rotateAngleZ = -0.62831853F;

		gunModel[31].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 7
		gunModel[31].setRotationPoint(-4.5F, 6F, -2F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 7, 14, 4, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		gunModel[32].setRotationPoint(36F, -10F, -2F);
		gunModel[32].rotateAngleZ = -0.62831853F;

		gunModel[33].addShapeBox(0F, 0F, 0F, 7, 6, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		gunModel[33].setRotationPoint(34.5F, -12F, -2F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 10
		gunModel[34].setRotationPoint(33.5F, 1F, -2F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 26

		ammoModel[0].addShapeBox(38F, -18F, 12F, 8, 3, 34, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		ammoModel[0].setRotationPoint(0F, 0F, -3F);


		slideModel = new ModelRendererTurbo[1];
		slideModel[0] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 11

		slideModel[0].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		slideModel[0].setRotationPoint(29F, -17F, -6.5F);



		gunSlideDistance = 1F;
		animationType = EnumAnimationType.SIDE_CLIP;

		translateAll(0F, -5F, 0F);
		
		numBulletsInReloadAnimation = 8;
		tiltGunTime = 0.25F;
		unloadClipTime = 0.25F;
		loadClipTime = 0.25F;
		untiltGunTime = 0.25F;


		flipAll();
	}
}