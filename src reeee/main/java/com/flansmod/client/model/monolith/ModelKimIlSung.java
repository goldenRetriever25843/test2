//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelKimIlSung extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelKimIlSung() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[33];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Box 0
		bodyModel[17] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Box 1
		bodyModel[18] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Box 2
		bodyModel[19] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Box 3
		bodyModel[20] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 4
		bodyModel[21] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 5
		bodyModel[22] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 6
		bodyModel[23] = new ModelRendererTurbo(this, 673, 25, textureX, textureY); // Box 7
		bodyModel[24] = new ModelRendererTurbo(this, 801, 25, textureX, textureY); // Box 8
		bodyModel[25] = new ModelRendererTurbo(this, 825, 25, textureX, textureY); // Box 10
		bodyModel[26] = new ModelRendererTurbo(this, 849, 25, textureX, textureY); // Box 11
		bodyModel[27] = new ModelRendererTurbo(this, 873, 25, textureX, textureY); // Box 12
		bodyModel[28] = new ModelRendererTurbo(this, 913, 25, textureX, textureY); // Box 13
		bodyModel[29] = new ModelRendererTurbo(this, 601, 33, textureX, textureY); // Box 14
		bodyModel[30] = new ModelRendererTurbo(this, 737, 33, textureX, textureY); // Box 15
		bodyModel[31] = new ModelRendererTurbo(this, 929, 33, textureX, textureY); // Box 16
		bodyModel[32] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 17

		bodyModel[0].addShapeBox(0F, 0F, 0F, 12, 33, 11, 0F, 2F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-6F, -59F, 3F);
		bodyModel[0].rotateAngleX = 0.08726646F;
		bodyModel[0].rotateAngleY = 0.12217305F;
		bodyModel[0].rotateAngleZ = -0.08726646F;

		bodyModel[1].addShapeBox(0F, 0F, 0F, 12, 33, 11, 0F, 0F, 0F, 0F, -1F, -2F, 1F, 1.5F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, -2F, 0F, -1F); // Box 1
		bodyModel[1].setRotationPoint(-9F, -27F, 5F);
		bodyModel[1].rotateAngleY = 0.2443461F;

		bodyModel[2].addShapeBox(0F, 0F, 0F, 12, 33, 11, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 0.5F, 0.5F, 0F, 1F, 0.5F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -2F, -1F, 0F, -1F); // Box 2
		bodyModel[2].setRotationPoint(-6F, -27F, -14F);
		bodyModel[2].rotateAngleY = -0.03490659F;

		bodyModel[3].addShapeBox(0F, 0F, 0F, 12, 31, 11, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 3F, 2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-5F, -59F, -14F);
		bodyModel[3].rotateAngleX = 0.01745329F;
		bodyModel[3].rotateAngleY = -0.01745329F;
		bodyModel[3].rotateAngleZ = -0.03490659F;

		bodyModel[4].addShapeBox(0F, 0F, 0F, 21, 30, 36, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -1F, 1.5F, 2F, -2.5F, 0F, 2F, -1F, 0F, 0F, -2F); // Box 4
		bodyModel[4].setRotationPoint(-15F, -112F, -18F);
		bodyModel[4].rotateAngleY = 0.03490659F;
		bodyModel[4].rotateAngleZ = 0.12217305F;

		bodyModel[5].addShapeBox(0F, 0F, 0F, 16, 28, 30, 0F, 1F, 0F, 1F, 4F, 0F, 1F, 4F, 0F, 1F, 1F, 0F, 1F, 2F, 4F, 0F, 2F, 2F, 1F, 3F, 2F, 1F, 1F, 5F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-9F, -83F, -15F);
		bodyModel[5].rotateAngleY = 0.08726646F;

		bodyModel[6].addShapeBox(-5F, -5F, -4F, 12, 27, 12, 0F, 3F, 0F, 8F, -6F, 0F, 6F, -6F, 6F, -7F, 8F, -5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(-1F, -105F, 19F);
		bodyModel[6].rotateAngleX = 0.66322512F;
		bodyModel[6].rotateAngleY = 0.34906585F;
		bodyModel[6].rotateAngleZ = -0.36651914F;

		bodyModel[7].addBox(-4F, -5F, -4F, 10, 28, 10, 0F); // Box 7
		bodyModel[7].setRotationPoint(-12F, -90F, 29F);
		bodyModel[7].rotateAngleX = -0.90757121F;
		bodyModel[7].rotateAngleZ = 0.33161256F;

		bodyModel[8].addShapeBox(-5F, -5F, -8F, 12, 35, 12, 0F, 4F, 5F, 0F, 0F, 3F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[8].setRotationPoint(0F, -109F, -19F);
		bodyModel[8].rotateAngleX = -0.55850536F;
		bodyModel[8].rotateAngleY = -0.26179939F;
		bodyModel[8].rotateAngleZ = 1.88495559F;

		bodyModel[9].addShapeBox(-4F, -5F, -4F, 10, 28, 10, 0F, 0F, 3F, -2F, 1F, 1F, -2F, 0F, -5F, 2F, 1F, -4F, 1F, 2F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 4F, -1F, 2F); // Box 9
		bodyModel[9].setRotationPoint(20F, -118F, -45F);
		bodyModel[9].rotateAngleY = -0.20943951F;
		bodyModel[9].rotateAngleZ = 2.07694181F;

		bodyModel[10].addShapeBox(4F, 15F, 0F, 17, 8, 18, 0F, 0F, 0F, 0.2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.2F, -5F, 0F, -2F, -2F, -1.2F, -2F, -2F, -1.2F, -2F, -5F, 0F, -2F); // Box 10
		bodyModel[10].setRotationPoint(-16F, -136F, -9F);
		bodyModel[10].rotateAngleY = -0.06981317F;
		bodyModel[10].rotateAngleZ = 0.17453293F;

		bodyModel[11].addShapeBox(0F, 0F, 0F, 22, 8, 9, 0F, -2F, 0F, -1F, 0F, -5F, 1F, 0F, -5F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 11
		bodyModel[11].setRotationPoint(-6F, 3F, 6F);
		bodyModel[11].rotateAngleY = 0.57595865F;

		bodyModel[12].addShapeBox(0F, 0F, 0F, 22, 8, 9, 0F, 0F, 0F, 0F, 0F, -5F, 2F, 0F, -5F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 12
		bodyModel[12].setRotationPoint(-6F, 3F, -13F);
		bodyModel[12].rotateAngleY = -0.06981317F;

		bodyModel[13].addShapeBox(-3F, -3F, -4F, 8, 11, 5, 0F, -1F, 0F, -2F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 13
		bodyModel[13].setRotationPoint(43F, -131F, -46F);
		bodyModel[13].rotateAngleX = 0.05235988F;
		bodyModel[13].rotateAngleY = -0.19198622F;
		bodyModel[13].rotateAngleZ = 2.19911486F;

		bodyModel[14].addShapeBox(-3F, 8F, -4F, 8, 8, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -3F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -1F, -2F, 0F, -1F); // Box 14
		bodyModel[14].setRotationPoint(43F, -131F, -46F);
		bodyModel[14].rotateAngleX = 0.05235988F;
		bodyModel[14].rotateAngleY = -0.19198622F;
		bodyModel[14].rotateAngleZ = 2.19911486F;

		bodyModel[15].addShapeBox(-3F, -3F, -4F, 3, 11, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -3F, 2F, 0F, -4F, 2F, 0F, 2F, -4F, 0F, 1F); // Box 15
		bodyModel[15].setRotationPoint(40F, -135F, -44F);
		bodyModel[15].rotateAngleX = 0.05235988F;
		bodyModel[15].rotateAngleY = -0.19198622F;
		bodyModel[15].rotateAngleZ = 2.565634F;

		bodyModel[16].addShapeBox(0F, -1F, 0F, 20, 7, 18, 0F, -4F, 0F, -2F, -5F, -1F, -1.5F, -5F, -1F, -1.5F, -4F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F); // Box 0
		bodyModel[16].setRotationPoint(-16F, -136F, -9F);
		bodyModel[16].rotateAngleY = -0.06981317F;
		bodyModel[16].rotateAngleZ = 0.17453293F;

		bodyModel[17].addShapeBox(0F, 6F, 0F, 21, 5, 18, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 1.2F, -1F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 1.2F); // Box 1
		bodyModel[17].setRotationPoint(-16F, -136F, -9F);
		bodyModel[17].rotateAngleY = -0.06981317F;
		bodyModel[17].rotateAngleZ = 0.17453293F;

		bodyModel[18].addShapeBox(0F, 11F, 0F, 21, 4, 18, 0F, 0F, 0F, 1.2F, -1F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 1.2F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F); // Box 2
		bodyModel[18].setRotationPoint(-16F, -136F, -9F);
		bodyModel[18].rotateAngleY = -0.06981317F;
		bodyModel[18].rotateAngleZ = 0.17453293F;

		bodyModel[19].addShapeBox(0F, 11F, 0F, 14, 10, 16, 0F, 0F, 1F, 0F, -2F, 2F, -2F, -2F, 2F, -2F, 0F, 1F, 0F, 1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 2F, 0F, 0F); // Box 3
		bodyModel[19].setRotationPoint(-12F, -132F, -8F);
		bodyModel[19].rotateAngleY = -0.06981317F;
		bodyModel[19].rotateAngleZ = -0.01745329F;

		bodyModel[20].addShapeBox(-5F, 0F, 6.5F, 5, 7, 2, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 2F); // Box 4
		bodyModel[20].setRotationPoint(4.4F, -132F, -9F);
		bodyModel[20].rotateAngleY = -0.06981317F;
		bodyModel[20].rotateAngleZ = 0.59341195F;

		bodyModel[21].addShapeBox(0F, 0F, 0F, 5, 7, 2, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 5
		bodyModel[21].setRotationPoint(-10.6F, -128F, 10F);
		bodyModel[21].rotateAngleX = 0.01745329F;
		bodyModel[21].rotateAngleY = -0.34906585F;
		bodyModel[21].rotateAngleZ = 0.31415927F;

		bodyModel[22].addShapeBox(0F, 0F, 0F, 5, 7, 2, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F); // Box 6
		bodyModel[22].setRotationPoint(-10.6F, -128F, -13F);
		bodyModel[22].rotateAngleX = 0.01745329F;
		bodyModel[22].rotateAngleY = 0.34906585F;
		bodyModel[22].rotateAngleZ = 0.31415927F;

		bodyModel[23].addShapeBox(0F, -1F, 0F, 14, 3, 16, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 7
		bodyModel[23].setRotationPoint(-14F, -137F, -8F);
		bodyModel[23].rotateAngleY = -0.06981317F;
		bodyModel[23].rotateAngleZ = 0.17453293F;

		bodyModel[24].addShapeBox(0F, -1F, 0F, 14, 9, 4, 0F, 0F, -4F, -1F, 0.5F, -3.5F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -2F, 0F, 0F, 5F, 0F, 1F, 7F, 0F); // Box 8
		bodyModel[24].setRotationPoint(-14F, -137F, -12F);
		bodyModel[24].rotateAngleY = -0.06981317F;
		bodyModel[24].rotateAngleZ = 0.17453293F;

		bodyModel[25].addShapeBox(0F, -1F, 0F, 1, 5, 16, 0F, -1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, -0.8F, 3F, 0.4F, -1F, 3.1F, 2F, 0F, 0F); // Box 10
		bodyModel[25].setRotationPoint(-15F, -137F, -8F);
		bodyModel[25].rotateAngleY = -0.06981317F;
		bodyModel[25].rotateAngleZ = 0.17453293F;

		bodyModel[26].addShapeBox(1.5F, -1F, 0F, 14, 9, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0.5F, -3.5F, -1F, 0F, -4F, -1F, 1F, 7F, 0F, 0F, 5F, 0F, 0F, -2F, 0F, 1F, 0F, 0F); // Box 11
		bodyModel[26].setRotationPoint(-14F, -137F, 8F);
		bodyModel[26].rotateAngleY = -0.06981317F;
		bodyModel[26].rotateAngleZ = 0.17453293F;

		bodyModel[27].addShapeBox(0F, 4F, 0F, 1, 4, 16, 0F, 2F, 0F, 0F, 0F, 0.8F, 3F, 0.4F, 1F, 3.1F, 2F, 0F, 0F, 2.5F, 0F, 0F, -0.7F, 0.2F, 4F, -0.7F, 0.2F, 4F, 2.5F, 0F, 0F); // Box 12
		bodyModel[27].setRotationPoint(-15F, -137F, -8F);
		bodyModel[27].rotateAngleY = -0.06981317F;
		bodyModel[27].rotateAngleZ = 0.17453293F;

		bodyModel[28].addShapeBox(0F, 8F, 0F, 1, 7, 16, 0F, 2.5F, 0F, 0F, -0.7F, -0.2F, 4F, -0.7F, -0.2F, 4F, 2.5F, 0F, 0F, 2F, 0F, -1F, -1F, 4F, 0F, -1F, 4F, 0F, 2F, 0F, -1F); // Box 13
		bodyModel[28].setRotationPoint(-15F, -137F, -8F);
		bodyModel[28].rotateAngleY = -0.06981317F;
		bodyModel[28].rotateAngleZ = 0.17453293F;

		bodyModel[29].addShapeBox(0F, 0F, 0F, 23, 81, 12, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 10F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 3F, 4F); // Box 14
		bodyModel[29].setRotationPoint(-15F, -112F, -18F);
		bodyModel[29].rotateAngleX = -0.12217305F;
		bodyModel[29].rotateAngleY = 0.03490659F;
		bodyModel[29].rotateAngleZ = 0.12217305F;

		bodyModel[30].addShapeBox(0F, 0F, 0F, 23, 84, 10, 0F, 0F, 3F, 0F, 0F, 3F, 2F, 0F, 2F, 0F, 0F, 0F, 0F, 5F, 2F, 0F, 1F, 0F, -3F, -2F, 0F, 3F, 0F, 1F, 1F); // Box 15
		bodyModel[30].setRotationPoint(-15F, -112F, 8F);
		bodyModel[30].rotateAngleX = 0.01745329F;
		bodyModel[30].rotateAngleY = 0.03490659F;
		bodyModel[30].rotateAngleZ = 0.05235988F;

		bodyModel[31].addShapeBox(0F, 0F, 0F, 10, 87, 20, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 0F, 2F, 0F, 0F, 5F, 0F, 0F, 3F, 0F, 0F, 2F); // Box 16
		bodyModel[31].setRotationPoint(-17F, -112F, -10F);
		bodyModel[31].rotateAngleY = 0.03490659F;
		bodyModel[31].rotateAngleZ = -0.03490659F;

		bodyModel[32].addShapeBox(0F, 0F, 0F, 40, 6, 70, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[32].setRotationPoint(-19F, 11F, -31F);
		bodyModel[32].rotateAngleY = -0.06981317F;



		translateAll(0F, -5F, 0F);


		flipAll();
	}
}