//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelF80 extends ModelPlane //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelF80() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[43];
		bodyModel[0] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 9
		bodyModel[1] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 10
		bodyModel[2] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 11
		bodyModel[3] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 12
		bodyModel[4] = new ModelRendererTurbo(this, 89, 129, textureX, textureY); // Box 1
		bodyModel[5] = new ModelRendererTurbo(this, 257, 129, textureX, textureY); // Box 3
		bodyModel[6] = new ModelRendererTurbo(this, 73, 153, textureX, textureY); // Box 4
		bodyModel[7] = new ModelRendererTurbo(this, 217, 153, textureX, textureY); // Box 5
		bodyModel[8] = new ModelRendererTurbo(this, 273, 225, textureX, textureY); // Box 27
		bodyModel[9] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 28
		bodyModel[10] = new ModelRendererTurbo(this, 377, 225, textureX, textureY); // Box 29
		bodyModel[11] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 40
		bodyModel[12] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 41
		bodyModel[13] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 42
		bodyModel[14] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 43
		bodyModel[15] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 44
		bodyModel[16] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 45
		bodyModel[17] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 0
		bodyModel[18] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 1
		bodyModel[19] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 2
		bodyModel[20] = new ModelRendererTurbo(this, 225, 233, textureX, textureY); // Box 3
		bodyModel[21] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 4
		bodyModel[22] = new ModelRendererTurbo(this, 129, 177, textureX, textureY); // Box 5
		bodyModel[23] = new ModelRendererTurbo(this, 49, 161, textureX, textureY); // Box 6
		bodyModel[24] = new ModelRendererTurbo(this, 185, 185, textureX, textureY); // Box 7
		bodyModel[25] = new ModelRendererTurbo(this, 33, 249, textureX, textureY); // Box 8
		bodyModel[26] = new ModelRendererTurbo(this, 81, 249, textureX, textureY); // Box 9
		bodyModel[27] = new ModelRendererTurbo(this, 105, 249, textureX, textureY); // Box 10
		bodyModel[28] = new ModelRendererTurbo(this, 361, 249, textureX, textureY); // Box 11
		bodyModel[29] = new ModelRendererTurbo(this, 129, 193, textureX, textureY); // Box 12
		bodyModel[30] = new ModelRendererTurbo(this, 185, 201, textureX, textureY); // Box 13
		bodyModel[31] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 14
		bodyModel[32] = new ModelRendererTurbo(this, 129, 225, textureX, textureY); // Box 15
		bodyModel[33] = new ModelRendererTurbo(this, 233, 177, textureX, textureY); // Box 16
		bodyModel[34] = new ModelRendererTurbo(this, 241, 217, textureX, textureY); // Box 17
		bodyModel[35] = new ModelRendererTurbo(this, 25, 225, textureX, textureY); // Box 18
		bodyModel[36] = new ModelRendererTurbo(this, 57, 249, textureX, textureY); // Box 19
		bodyModel[37] = new ModelRendererTurbo(this, 137, 249, textureX, textureY); // Box 20
		bodyModel[38] = new ModelRendererTurbo(this, 393, 249, textureX, textureY); // Box 21
		bodyModel[39] = new ModelRendererTurbo(this, 289, 257, textureX, textureY); // Box 22
		bodyModel[40] = new ModelRendererTurbo(this, 257, 265, textureX, textureY); // Box 23
		bodyModel[41] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 24
		bodyModel[42] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Box 25

		bodyModel[0].addShapeBox(0F, 0F, 0F, 76, 14, 12, 0F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[0].setRotationPoint(-49F, -32F, -12F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 76, 14, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[1].setRotationPoint(-49F, -32F, 0F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 76, 14, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -2F, 0F, -7F, -2F, 0F, -4F, 0F, 0F, -3F, 0F); // Box 11
		bodyModel[2].setRotationPoint(-49F, -18F, -12F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 76, 14, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -7F, -2F, 0F, -5F, -2F); // Box 12
		bodyModel[3].setRotationPoint(-49F, -18F, 0F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 76, 12, 7, 0F, 0F, -3F, -2F, 0F, -6F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -4F, -6F, 0F, -1F, 1F, 0F, 0F, 0F); // Box 1
		bodyModel[4].setRotationPoint(-49F, -22F, -17F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 76, 12, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -6F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -4F, -6F, 0F, -3F, -2F); // Box 3
		bodyModel[5].setRotationPoint(-49F, -22F, 10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 57, 2, 14, 0F, -8F, 0F, 5F, -8F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 5F, -8F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[6].setRotationPoint(-29F, -18F, -23F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 57, 2, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 5F, -8F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 5F, -8F, 0F, 5F); // Box 5
		bodyModel[7].setRotationPoint(-29F, -18F, 9F);

		bodyModel[8].addBox(0F, 0F, 0F, 38, 14, 12, 0F); // Box 27
		bodyModel[8].setRotationPoint(-49F, -32F, -6F);

		bodyModel[9].addFlexTrapezoid(0F, 0F, 0F, 10, 5, 12, 0F, -10.00F, 0.00F, -3.00F, -3.00F, -3.00F, -3.00F, ModelRendererTurbo.MR_TOP); // Box 28
		bodyModel[9].setRotationPoint(-49F, -37F, -6F);

		bodyModel[10].addFlexTrapezoid(0F, 0F, 0F, 28, 5, 12, 0F, 0.00F, -15.00F, -3.00F, -3.00F, -3.00F, -3.00F, ModelRendererTurbo.MR_TOP); // Box 29
		bodyModel[10].setRotationPoint(-39F, -37F, -6F);

		bodyModel[11].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 40
		bodyModel[11].setRotationPoint(-96F, -17F, -2F);

		bodyModel[12].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 41
		bodyModel[12].setRotationPoint(-96F, -17F, 1F);

		bodyModel[13].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 42
		bodyModel[13].setRotationPoint(-91F, -17F, -5F);

		bodyModel[14].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 43
		bodyModel[14].setRotationPoint(-91F, -17F, 4F);

		bodyModel[15].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 44
		bodyModel[15].setRotationPoint(-93F, -14F, -3F);

		bodyModel[16].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 45
		bodyModel[16].setRotationPoint(-93F, -14F, 2F);

		bodyModel[17].addShapeBox(0F, 0.5F, 0F, 2, 1, 19, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[17].setRotationPoint(-19F, -18F, 20F);
		bodyModel[17].rotateAngleX = 0.01745329F;
		bodyModel[17].rotateAngleY = -0.08726646F;
		bodyModel[17].rotateAngleZ = 0.01745329F;

		bodyModel[18].addShapeBox(0F, 0.5F, 0F, 2, 1, 19, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[18].setRotationPoint(12F, -18F, 20F);
		bodyModel[18].rotateAngleY = -0.08726646F;
		bodyModel[18].rotateAngleZ = -0.01745329F;

		bodyModel[19].addShapeBox(0F, 0.5F, 0F, 2, 1, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[19].setRotationPoint(5F, -18F, 20F);
		bodyModel[19].rotateAngleY = 0.03490659F;

		bodyModel[20].addShapeBox(0F, 0.5F, 0F, 3, 1, 25, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[20].setRotationPoint(-4F, -18F, 20F);
		bodyModel[20].rotateAngleX = 0.01745329F;
		bodyModel[20].rotateAngleY = -0.05235988F;
		bodyModel[20].rotateAngleZ = 0.01745329F;

		bodyModel[21].addShapeBox(0F, 0.5F, 0F, 2, 1, 23, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[21].setRotationPoint(-10F, -18F, 20F);
		bodyModel[21].rotateAngleX = 0.01745329F;
		bodyModel[21].rotateAngleY = 0.03490659F;
		bodyModel[21].rotateAngleZ = 0.01745329F;

		bodyModel[22].addShapeBox(0F, 0.5F, 0F, 5, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[22].setRotationPoint(12F, -18F, 20F);
		bodyModel[22].rotateAngleY = -0.03490659F;

		bodyModel[23].addShapeBox(0F, 0.5F, 0F, 4, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[23].setRotationPoint(1F, -18F, 20F);
		bodyModel[23].rotateAngleY = 0.05235988F;

		bodyModel[24].addShapeBox(0F, 0.5F, 0F, 5, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[24].setRotationPoint(-14F, -18F, 20F);
		bodyModel[24].rotateAngleY = 0.01745329F;
		bodyModel[24].rotateAngleZ = 0.03490659F;

		bodyModel[25].addShapeBox(0F, 0.5F, 0F, 2, 1, 19, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[25].setRotationPoint(-18.5F, -18F, -39F);
		bodyModel[25].rotateAngleX = 0.01745329F;
		bodyModel[25].rotateAngleY = -0.08726646F;
		bodyModel[25].rotateAngleZ = 0.01745329F;

		bodyModel[26].addShapeBox(0F, 0.5F, 0F, 2, 1, 19, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[26].setRotationPoint(12F, -18F, -39F);
		bodyModel[26].rotateAngleY = -0.08726646F;
		bodyModel[26].rotateAngleZ = -0.01745329F;

		bodyModel[27].addShapeBox(0F, 0.5F, 0F, 2, 1, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[27].setRotationPoint(5F, -18F, -42F);
		bodyModel[27].rotateAngleY = 0.03490659F;

		bodyModel[28].addShapeBox(0F, 0.5F, 0F, 3, 1, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[28].setRotationPoint(-4F, -18F, -45F);
		bodyModel[28].rotateAngleX = 0.01745329F;
		bodyModel[28].rotateAngleY = -0.05235988F;
		bodyModel[28].rotateAngleZ = 0.01745329F;

		bodyModel[29].addShapeBox(0F, 0.5F, 0F, 2, 1, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[29].setRotationPoint(-10F, -18F, -43F);
		bodyModel[29].rotateAngleX = 0.01745329F;
		bodyModel[29].rotateAngleY = 0.03490659F;
		bodyModel[29].rotateAngleZ = 0.01745329F;

		bodyModel[30].addShapeBox(0F, 0.5F, 0F, 5, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[30].setRotationPoint(12F, -18F, -32F);
		bodyModel[30].rotateAngleY = -0.03490659F;

		bodyModel[31].addShapeBox(0F, 0.5F, 0F, 4, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[31].setRotationPoint(1F, -18F, -34F);
		bodyModel[31].rotateAngleY = 0.05235988F;

		bodyModel[32].addShapeBox(0F, 0.5F, 0F, 5, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[32].setRotationPoint(-14F, -18F, -33F);
		bodyModel[32].rotateAngleY = 0.01745329F;
		bodyModel[32].rotateAngleZ = 0.03490659F;

		bodyModel[33].addShapeBox(0F, 0F, 0F, 13, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[33].setRotationPoint(27F, -13F, -7F);
		bodyModel[33].rotateAngleX = -0.12217305F;
		bodyModel[33].rotateAngleY = -0.10471976F;
		bodyModel[33].rotateAngleZ = 0.08726646F;

		bodyModel[34].addShapeBox(0F, 0F, 0F, 19, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[34].setRotationPoint(26F, -24F, 8F);
		bodyModel[34].rotateAngleY = -0.12217305F;
		bodyModel[34].rotateAngleZ = 0.06981317F;

		bodyModel[35].addShapeBox(0F, 0F, 0F, 19, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[35].setRotationPoint(26F, -24F, -9F);
		bodyModel[35].rotateAngleX = -0.17453293F;
		bodyModel[35].rotateAngleY = 0.10471976F;
		bodyModel[35].rotateAngleZ = 0.01745329F;

		bodyModel[36].addShapeBox(0F, 0F, 0F, 15, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[36].setRotationPoint(26F, -29F, -6F);
		bodyModel[36].rotateAngleX = 0.06981317F;
		bodyModel[36].rotateAngleY = -0.05235988F;
		bodyModel[36].rotateAngleZ = -0.13962634F;

		bodyModel[37].addShapeBox(0F, 0F, 0F, 19, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[37].setRotationPoint(26F, -29F, 2F);
		bodyModel[37].rotateAngleX = -0.12217305F;
		bodyModel[37].rotateAngleY = -0.06981317F;
		bodyModel[37].rotateAngleZ = -0.13962634F;

		bodyModel[38].addShapeBox(0F, 0F, 0F, 18, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[38].setRotationPoint(25F, -13F, 1F);
		bodyModel[38].rotateAngleX = 0.12217305F;
		bodyModel[38].rotateAngleY = -0.12217305F;
		bodyModel[38].rotateAngleZ = 0.10471976F;

		bodyModel[39].addShapeBox(0F, 0F, 0F, 28, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[39].setRotationPoint(26F, -13F, -2F);
		bodyModel[39].rotateAngleX = -0.08726646F;
		bodyModel[39].rotateAngleY = -0.10471976F;
		bodyModel[39].rotateAngleZ = 0.08726646F;

		bodyModel[40].addShapeBox(0F, 0F, 0F, 38, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[40].setRotationPoint(24F, -29F, 0F);
		bodyModel[40].rotateAngleX = -0.08726646F;
		bodyModel[40].rotateAngleY = 0.01745329F;
		bodyModel[40].rotateAngleZ = -0.08726646F;

		bodyModel[41].addShapeBox(0F, 0F, 0F, 6, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[41].setRotationPoint(25F, -18F, -11F);
		bodyModel[41].rotateAngleX = 0.17453293F;
		bodyModel[41].rotateAngleY = 0.06981317F;
		bodyModel[41].rotateAngleZ = 0.03490659F;

		bodyModel[42].addShapeBox(0F, 0F, 0F, 6, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[42].setRotationPoint(25F, -18F, 7F);
		bodyModel[42].rotateAngleX = -0.05235988F;
		bodyModel[42].rotateAngleY = -0.05235988F;
		bodyModel[42].rotateAngleZ = 0.05235988F;


		noseModel = new ModelRendererTurbo[8];
		noseModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		noseModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 2
		noseModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 3
		noseModel[3] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 4
		noseModel[4] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 5
		noseModel[5] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 6
		noseModel[6] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 7
		noseModel[7] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 8

		noseModel[0].addShapeBox(0F, 0F, 0F, 15, 9, 6, 0F, -6F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -2F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		noseModel[0].setRotationPoint(-96F, -27F, -6F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 15, 9, 6, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -3F); // Box 2
		noseModel[1].setRotationPoint(-96F, -27F, 0F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 15, 9, 6, 0F, -2F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -2F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, -7F, -1F, 0F); // Box 3
		noseModel[2].setRotationPoint(-96F, -18F, -6F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 15, 9, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -3F, -7F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -8F, -2F, -1F); // Box 4
		noseModel[3].setRotationPoint(-96F, -18F, 0F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 32, 14, 12, 0F, 0F, -5F, -6F, 0F, -3F, -4F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		noseModel[4].setRotationPoint(-81F, -32F, -12F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 32, 14, 12, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, 0F, -5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 6
		noseModel[5].setRotationPoint(-81F, -32F, 0F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 32, 14, 12, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -6F, 0F, -5F, -2F, 0F, -3F, 0F, 0F, -5F, 0F); // Box 7
		noseModel[6].setRotationPoint(-81F, -18F, -12F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 32, 14, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, -5F, -2F, 0F, -6F, -6F); // Box 8
		noseModel[7].setRotationPoint(-81F, -18F, 0F);


		tailModel = new ModelRendererTurbo[15];
		tailModel[0] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 13
		tailModel[1] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 14
		tailModel[2] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 15
		tailModel[3] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Box 16
		tailModel[4] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 17
		tailModel[5] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 18
		tailModel[6] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 15
		tailModel[7] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 16
		tailModel[8] = new ModelRendererTurbo(this, 425, 161, textureX, textureY); // Box 17
		tailModel[9] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 18
		tailModel[10] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 19
		tailModel[11] = new ModelRendererTurbo(this, 241, 177, textureX, textureY); // Box 22
		tailModel[12] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 26
		tailModel[13] = new ModelRendererTurbo(this, 161, 233, textureX, textureY); // Box 30
		tailModel[14] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 32

		tailModel[0].addShapeBox(0F, 0F, 0F, 35, 14, 12, 0F, 0F, -3F, -4F, 0F, -8F, -7F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		tailModel[0].setRotationPoint(27F, -32F, -12F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 35, 14, 12, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -8F, -7F, 0F, -3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 14
		tailModel[1].setRotationPoint(27F, -32F, 0F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 64, 14, 12, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -2F, 0F, -12F, -9F, 0F, -10F, 0F, 0F, -4F, 0F); // Box 15
		tailModel[2].setRotationPoint(27F, -18F, -12F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 64, 14, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -10F, 0F, 0F, -12F, -9F, 0F, -7F, -2F); // Box 16
		tailModel[3].setRotationPoint(27F, -18F, 0F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 29, 14, 12, 0F, 0F, -8F, -7F, 0F, -10F, -10F, 0F, -8F, 0F, 0F, -4F, 0F, 0F, 0F, -5F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		tailModel[4].setRotationPoint(62F, -32F, -12F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 29, 14, 12, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, -10F, -10F, 0F, -8F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -5F); // Box 18
		tailModel[5].setRotationPoint(62F, -32F, 0F);

		tailModel[6].addBox(0F, 0F, 0F, 27, 12, 1, 0F); // Box 15
		tailModel[6].setRotationPoint(62F, -28F, -0.5F);

		tailModel[7].addBox(0F, 0F, 0F, 19, 8, 1, 0F); // Box 16
		tailModel[7].setRotationPoint(62F, -36F, -0.5F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 35, 8, 1, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		tailModel[8].setRotationPoint(27F, -36F, -0.5F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 19, 20, 1, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		tailModel[9].setRotationPoint(62F, -56F, -0.5F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 14, 8, 1, 0F, -5F, -1F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		tailModel[10].setRotationPoint(71F, -64F, -0.5F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 13, 2, 34, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 22
		tailModel[11].setRotationPoint(63F, -21F, -38.5F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 8, 2, 4, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		tailModel[12].setRotationPoint(71F, -21F, -42.5F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 13, 2, 34, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 30
		tailModel[13].setRotationPoint(63F, -21F, 4.5F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 8, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -3F, -1F, 0F); // Box 32
		tailModel[14].setRotationPoint(71F, -21F, 38.5F);


		leftWingModel = new ModelRendererTurbo[3];
		leftWingModel[0] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Box 6
		leftWingModel[1] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 8
		leftWingModel[2] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 12

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 31, 2, 65, 0F, -12F, 0F, 5F, -4F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 5F, -4F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftWingModel[0].setRotationPoint(-21F, -18F, -93F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 10, 2, 29, 0F, 2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		leftWingModel[1].setRotationPoint(10F, -18F, -57F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 19, 2, 9, 0F, -4F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, -1F, -4F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		leftWingModel[2].setRotationPoint(-9F, -18F, -107F);


		rightWingModel = new ModelRendererTurbo[3];
		rightWingModel[0] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 7
		rightWingModel[1] = new ModelRendererTurbo(this, 425, 129, textureX, textureY); // Box 9
		rightWingModel[2] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 13

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 31, 2, 65, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 5F, -12F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 5F, -12F, 0F, 5F); // Box 7
		rightWingModel[0].setRotationPoint(-21F, -18F, 28F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 10, 2, 29, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F); // Box 9
		rightWingModel[1].setRotationPoint(10F, -18F, 28F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 19, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, -1F, -4F, -1F, -1F); // Box 13
		rightWingModel[2].setRotationPoint(-9F, -18F, 98F);


		yawFlapModel = new ModelRendererTurbo[1];
		yawFlapModel[0] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 20

		yawFlapModel[0].addShapeBox(0F, 0F, -0.5F, 8, 28, 1, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		yawFlapModel[0].setRotationPoint(81F, -56F, 0F);


		pitchFlapLeftModel = new ModelRendererTurbo[1];
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 425, 177, textureX, textureY); // Box 24

		pitchFlapLeftModel[0].addShapeBox(0F, 0F, 0F, 9, 2, 34, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 24
		pitchFlapLeftModel[0].setRotationPoint(76F, -21F, -38.5F);


		pitchFlapRightModel = new ModelRendererTurbo[1];
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 425, 225, textureX, textureY); // Box 31

		pitchFlapRightModel[0].addShapeBox(0F, 0F, 0F, 9, 2, 34, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -6F, -1F, 0F, 0F, 0F, 0F); // Box 31
		pitchFlapRightModel[0].setRotationPoint(76F, -21F, 4.5F);


		pitchFlapLeftWingModel = new ModelRendererTurbo[1];
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 129, 177, textureX, textureY); // Box 10

		pitchFlapLeftWingModel[0].addShapeBox(3F, 0F, 0F, 7, 2, 41, 0F, 3F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, -6F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, 0F); // Box 10
		pitchFlapLeftWingModel[0].setRotationPoint(6F, -18F, -98F);


		pitchFlapRightWingModel = new ModelRendererTurbo[1];
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 185, 185, textureX, textureY); // Box 14

		pitchFlapRightWingModel[0].addShapeBox(1F, 0F, 0F, 7, 2, 41, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, -6F, -1F, 0F, 3F, 0F, 0F); // Box 14
		pitchFlapRightWingModel[0].setRotationPoint(8F, -18F, 57F);


		bodyWheelModel = new ModelRendererTurbo[6];
		bodyWheelModel[0] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 33
		bodyWheelModel[1] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 34
		bodyWheelModel[2] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 36
		bodyWheelModel[3] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 37
		bodyWheelModel[4] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 38
		bodyWheelModel[5] = new ModelRendererTurbo(this, 185, 177, textureX, textureY); // Box 39

		bodyWheelModel[0].addFlexTrapezoid(0F, 0F, 0F, 10, 5, 2, 0F, -2.00F, -2.00F, 0F, 0F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 33
		bodyWheelModel[0].setRotationPoint(-69F, 0F, -1F);

		bodyWheelModel[1].addFlexTrapezoid(0F, 0F, 0F, 10, 5, 2, 0F, -2.00F, -2.00F, 0.00F, 0.00F, 0.00F, 0.00F, ModelRendererTurbo.MR_BOTTOM); // Box 34
		bodyWheelModel[1].setRotationPoint(-69F, 5F, -1F);

		bodyWheelModel[2].addBox(0F, 0F, 0F, 2, 10, 2, 0F); // Box 36
		bodyWheelModel[2].setRotationPoint(-59F, -9F, -1F);
		bodyWheelModel[2].rotateAngleZ = -0.75049158F;

		bodyWheelModel[3].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 37
		bodyWheelModel[3].setRotationPoint(-66F, -5F, -2F);

		bodyWheelModel[4].addBox(0F, 0F, 0F, 22, 5, 1, 0F); // Box 38
		bodyWheelModel[4].setRotationPoint(-71F, -9F, -4F);

		bodyWheelModel[5].addBox(0F, 0F, 0F, 22, 5, 1, 0F); // Box 39
		bodyWheelModel[5].setRotationPoint(-71F, -9F, 3F);


		tailWheelModel = new ModelRendererTurbo[1];
		tailWheelModel[0] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 35

		tailWheelModel[0].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Box 35
		tailWheelModel[0].setRotationPoint(-65F, -2F, 1F);


		leftWingWheelModel = new ModelRendererTurbo[6];
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 46
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 47
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 425, 129, textureX, textureY); // Box 48
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 49
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 305, 177, textureX, textureY); // Box 50
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 481, 145, textureX, textureY); // Box 57

		leftWingWheelModel[0].addFlexTrapezoid(0F, 0F, 0F, 10, 5, 3, 0F, -2.00F, -2.00F, 0F, 0F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 46
		leftWingWheelModel[0].setRotationPoint(-6F, -5F, -26F);

		leftWingWheelModel[1].addFlexTrapezoid(0F, 0F, 0F, 10, 5, 3, 0F, -2.00F, -2.00F, 0.00F, 0.00F, 0.00F, 0.00F, ModelRendererTurbo.MR_BOTTOM); // Box 47
		leftWingWheelModel[1].setRotationPoint(-6F, 0F, -26F);

		leftWingWheelModel[2].addBox(0F, 0F, 0F, 2, 16, 2, 0F); // Box 48
		leftWingWheelModel[2].setRotationPoint(-2F, -16F, -28F);

		leftWingWheelModel[3].addBox(0F, 0F, 0F, 11, 6, 1, 0F); // Box 49
		leftWingWheelModel[3].setRotationPoint(-6F, -6F, -29F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 26, 9, 1, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 2F, 0F, -3F, 2F, 0F, -3F, -2F, 0F, 0F, -2F); // Box 50
		leftWingWheelModel[4].setRotationPoint(-16F, -9F, -4F);

		leftWingWheelModel[5].addBox(0F, 0F, 0F, 11, 2, 3, 0F); // Box 57
		leftWingWheelModel[5].setRotationPoint(-6F, 0F, -31F);


		rightWingWheelModel = new ModelRendererTurbo[6];
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 305, 193, textureX, textureY); // Box 51
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 52
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Box 53
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 441, 129, textureX, textureY); // Box 54
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Box 55
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 481, 137, textureX, textureY); // Box 56

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 26, 9, 1, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, -3F, 2F, 0F, 0F, 2F); // Box 51
		rightWingWheelModel[0].setRotationPoint(-16F, -9F, 3F);

		rightWingWheelModel[1].addFlexTrapezoid(0F, 0F, 0F, 10, 5, 3, 0F, -2.00F, -2.00F, 0F, 0F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 52
		rightWingWheelModel[1].setRotationPoint(-6F, -5F, 23F);

		rightWingWheelModel[2].addFlexTrapezoid(0F, 0F, 0F, 10, 5, 3, 0F, -2.00F, -2.00F, 0.00F, 0.00F, 0.00F, 0.00F, ModelRendererTurbo.MR_BOTTOM); // Box 53
		rightWingWheelModel[2].setRotationPoint(-6F, 0F, 23F);

		rightWingWheelModel[3].addBox(0F, 0F, 0F, 2, 16, 2, 0F); // Box 54
		rightWingWheelModel[3].setRotationPoint(-2F, -16F, 26F);

		rightWingWheelModel[4].addBox(0F, 0F, 0F, 11, 6, 1, 0F); // Box 55
		rightWingWheelModel[4].setRotationPoint(-6F, -6F, 28F);

		rightWingWheelModel[5].addBox(0F, 0F, 0F, 11, 2, 3, 0F); // Box 56
		rightWingWheelModel[5].setRotationPoint(-6F, 0F, 28F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}