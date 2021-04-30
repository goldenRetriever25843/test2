//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: F7U Cutlass
// Model Creator: 
// Created on: 18.03.2016 - 17:19:00
// Last changed on: 18.03.2016 - 17:19:00

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelF7UCutlass extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelF7UCutlass() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[63];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 8
		bodyModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 8
		bodyModel[2] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 8
		bodyModel[3] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 8
		bodyModel[4] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 8
		bodyModel[5] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 8
		bodyModel[6] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 8
		bodyModel[7] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Box 8
		bodyModel[10] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Box 8
		bodyModel[11] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Box 8
		bodyModel[12] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Box 8
		bodyModel[13] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Box 8
		bodyModel[14] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Box 8
		bodyModel[15] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Box 8
		bodyModel[16] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Box 8
		bodyModel[17] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Box 8
		bodyModel[18] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 8
		bodyModel[19] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 8
		bodyModel[20] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Box 8
		bodyModel[21] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 8
		bodyModel[22] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 8
		bodyModel[23] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 8
		bodyModel[24] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 8
		bodyModel[25] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 8
		bodyModel[26] = new ModelRendererTurbo(this, 585, 17, textureX, textureY); // Box 8
		bodyModel[27] = new ModelRendererTurbo(this, 713, 17, textureX, textureY); // Box 8
		bodyModel[28] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 8
		bodyModel[29] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 8
		bodyModel[30] = new ModelRendererTurbo(this, 641, 25, textureX, textureY); // Box 8
		bodyModel[31] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 8
		bodyModel[32] = new ModelRendererTurbo(this, 745, 25, textureX, textureY); // Box 8
		bodyModel[33] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 8
		bodyModel[34] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 8
		bodyModel[35] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 8
		bodyModel[36] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 8
		bodyModel[37] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 8
		bodyModel[38] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 8
		bodyModel[39] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 8
		bodyModel[40] = new ModelRendererTurbo(this, 849, 25, textureX, textureY); // Box 8
		bodyModel[41] = new ModelRendererTurbo(this, 881, 25, textureX, textureY); // Box 8
		bodyModel[42] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 8
		bodyModel[43] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 8
		bodyModel[44] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Box 8
		bodyModel[45] = new ModelRendererTurbo(this, 977, 25, textureX, textureY); // Box 8
		bodyModel[46] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Box 8
		bodyModel[47] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Box 8
		bodyModel[48] = new ModelRendererTurbo(this, 1001, 9, textureX, textureY); // Box 8
		bodyModel[49] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 8
		bodyModel[50] = new ModelRendererTurbo(this, 633, 9, textureX, textureY); // Box 8
		bodyModel[51] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 8
		bodyModel[52] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 8
		bodyModel[53] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 8
		bodyModel[54] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 8
		bodyModel[55] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 8
		bodyModel[56] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 8
		bodyModel[57] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 8
		bodyModel[58] = new ModelRendererTurbo(this, 289, 89, textureX, textureY); // Box 8
		bodyModel[59] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 8
		bodyModel[60] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 8
		bodyModel[61] = new ModelRendererTurbo(this, 961, 65, textureX, textureY); // Box 8
		bodyModel[62] = new ModelRendererTurbo(this, 697, 73, textureX, textureY); // Box 8

		bodyModel[0].addShapeBox(0F, 0F, 0F, 18, 14, 18, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[0].setRotationPoint(0F, -31F, -9F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 18, 14, 6, 0F, 0F, -4F, -1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[1].setRotationPoint(0F, -31F, -15F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 18, 10, 2, 0F, 0F, -4F, -1F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, -2F, 1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 8
		bodyModel[2].setRotationPoint(0F, -29F, -17F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 20, 1, 18, 0F, 0F, 0F, -2F, -2F, 0F, -6F, -2F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 8
		bodyModel[3].setRotationPoint(4F, -32F, -9F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 18, 1, 12, 0F, 0F, 0F, -2F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1F); // Box 8
		bodyModel[4].setRotationPoint(4F, -33F, -6F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 20, 2, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 8
		bodyModel[5].setRotationPoint(-16F, -19F, -9F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 8, 2, 16, 0F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, -8F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -8F, -0.5F, -1F); // Box 8
		bodyModel[6].setRotationPoint(-48F, -19F, -8F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 20, 12, 18, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[7].setRotationPoint(-16F, -31F, -9F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 24, 12, 3, 0F, 0F, -3F, -1F, 0F, -1F, 0F, 0F, 1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 8
		bodyModel[8].setRotationPoint(-40F, -31F, -9F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 20, 1, 18, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 8
		bodyModel[9].setRotationPoint(-16F, -32F, -9F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 20, 1, 14, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[10].setRotationPoint(-16F, -33F, -7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 24, 2, 18, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -2F); // Box 8
		bodyModel[11].setRotationPoint(-40F, -19F, -9F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 24, 12, 3, 0F, 0F, -1F, -1F, 0F, 1F, -1F, 0F, -1F, 0F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 8
		bodyModel[12].setRotationPoint(-40F, -31F, 6F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 12, 13, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, -3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F); // Box 8
		bodyModel[13].setRotationPoint(-28F, -32F, -7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 8, 2, 16, 0F, -1F, -3.5F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, -3.5F, -4F, -1F, 1.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1.5F, -4F); // Box 8
		bodyModel[14].setRotationPoint(-48F, -30F, -8F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 8, 2, 16, 0F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F); // Box 8
		bodyModel[15].setRotationPoint(-48F, -21F, -8F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 8, 3, 16, 0F, -1F, -1.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.5F, -4F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F); // Box 8
		bodyModel[16].setRotationPoint(-48F, -28F, -8F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 8, 4, 16, 0F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F); // Box 8
		bodyModel[17].setRotationPoint(-48F, -25F, -8F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F, -1F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -3F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F); // Box 8
		bodyModel[18].setRotationPoint(-51F, -25F, -5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F, -1F, -3F, -3F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -1F, -3F, -3F, -1F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, -3F); // Box 8
		bodyModel[19].setRotationPoint(-51F, -27F, -5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, -1.5F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, -1.5F, -3F); // Box 8
		bodyModel[20].setRotationPoint(-51F, -21F, -5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F, -0.25F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1.5F, -1.5F, -0.25F, -0.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.25F, -0.5F, -1.5F); // Box 8
		bodyModel[21].setRotationPoint(-52F, -24F, -2F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 12, 13, 3, 0F, 0F, -1F, -3F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 8
		bodyModel[22].setRotationPoint(-28F, -32F, 4F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 44, 14, 18, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[23].setRotationPoint(26F, -31F, -9F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 44, 14, 6, 0F, 0F, -1F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[24].setRotationPoint(26F, -31F, -15F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 44, 10, 2, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 8
		bodyModel[25].setRotationPoint(26F, -29F, -17F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 8, 15, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[26].setRotationPoint(18F, -32F, -9F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 8, 14, 6, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[27].setRotationPoint(18F, -31F, -15F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 8, 10, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[28].setRotationPoint(18F, -29F, -17F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 10, 5, 12, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[29].setRotationPoint(-16F, -37F, -6F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 16, 5, 12, 0F, 0F, 0F, -1F, -1F, -2F, -2F, -1F, -2F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, -2F, 2F, 0F, -2F, 0F, 0F, 0F); // Box 8
		bodyModel[30].setRotationPoint(-6F, -37F, -6F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 10, 4, 10, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[31].setRotationPoint(-16F, -41F, -5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 15, 3, 10, 0F, 0F, 0F, -2F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, 0F); // Box 8
		bodyModel[32].setRotationPoint(-6F, -40F, -5F);

		bodyModel[33].addShapeBox(0F, -6F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[33].setRotationPoint(-32F, -30F, -7.5F);
		bodyModel[33].rotateAngleX = -0.31415927F;

		bodyModel[34].addShapeBox(0F, -6F, -1F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[34].setRotationPoint(-32F, -30F, 7.5F);
		bodyModel[34].rotateAngleX = 0.31415927F;

		bodyModel[35].addShapeBox(0F, -3F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[35].setRotationPoint(-32F, -35.7F, -5.65F);
		bodyModel[35].rotateAngleX = -0.75049158F;

		bodyModel[36].addShapeBox(0F, -3F, -1F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[36].setRotationPoint(-32F, -35.7F, 5.65F);
		bodyModel[36].rotateAngleX = 0.75049158F;

		bodyModel[37].addShapeBox(0F, -3F, -1F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[37].setRotationPoint(-32F, -37.9F, 3.6F);
		bodyModel[37].rotateAngleX = 1.04719755F;

		bodyModel[38].addShapeBox(0F, -3F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[38].setRotationPoint(-32F, -37.9F, -3.6F);
		bodyModel[38].rotateAngleX = -1.04719755F;

		bodyModel[39].addShapeBox(0F, 0F, -1F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[39].setRotationPoint(-32F, -39.4F, 0F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 8, 14, 6, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 8
		bodyModel[40].setRotationPoint(18F, -31F, 9F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 18, 14, 6, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F); // Box 8
		bodyModel[41].setRotationPoint(0F, -31F, 9F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 44, 14, 6, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F); // Box 8
		bodyModel[42].setRotationPoint(26F, -31F, 9F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 44, 10, 2, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, -1F, 0F, -2F, 0F); // Box 8
		bodyModel[43].setRotationPoint(26F, -29F, 15F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 8, 10, 2, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 8
		bodyModel[44].setRotationPoint(18F, -29F, 15F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 18, 10, 2, 0F, 0F, -2F, 1F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -4F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F); // Box 8
		bodyModel[45].setRotationPoint(0F, -29F, 15F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 4, 8, 2, 0F, 0F, -3F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -3F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 1F); // Box 8
		bodyModel[46].setRotationPoint(-4F, -27F, -16F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F); // Box 8
		bodyModel[47].setRotationPoint(-4F, -27F, -14F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F); // Box 8
		bodyModel[48].setRotationPoint(-4F, -20F, -14F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 8
		bodyModel[49].setRotationPoint(-4F, -18F, -9F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 8
		bodyModel[50].setRotationPoint(-4F, -18F, 7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, -1F); // Box 8
		bodyModel[51].setRotationPoint(-4F, -27F, 9F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -2F, -1F); // Box 8
		bodyModel[52].setRotationPoint(-4F, -20F, 9F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 4, 8, 2, 0F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, -2F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, -2F); // Box 8
		bodyModel[53].setRotationPoint(-4F, -27F, 14F);

		bodyModel[54].addShapeBox(0F, 0F, -4.5F, 10, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[54].setRotationPoint(-28F, -21F, 0F);
		bodyModel[54].rotateAngleZ = -0.05235988F;

		bodyModel[55].addShapeBox(0F, 0F, -4.5F, 2, 17, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[55].setRotationPoint(-20F, -37F, 0F);
		bodyModel[55].rotateAngleZ = -0.05235988F;

		bodyModel[56].addShapeBox(-1F, 2F, -5.5F, 5, 4, 11, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[56].setRotationPoint(-39.5F, -32F, 0F);
		bodyModel[56].rotateAngleZ = 0.17453293F;

		bodyModel[57].addShapeBox(-2F, 6F, -5.5F, 6, 4, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[57].setRotationPoint(-39.5F, -32F, 0F);
		bodyModel[57].rotateAngleZ = 0.17453293F;

		bodyModel[58].addShapeBox(-5F, 0F, -15F, 9, 0, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[58].setRotationPoint(46F, -25.3F, -46F);
		bodyModel[58].rotateAngleY = 0.2443461F;

		bodyModel[59].addShapeBox(0F, 0F, -1F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[59].setRotationPoint(-32F, -39.2F, 0F);
		bodyModel[59].rotateAngleX = -0.27925268F;
		bodyModel[59].rotateAngleZ = -0.6981317F;

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[60].setRotationPoint(-32F, -39.2F, 0F);
		bodyModel[60].rotateAngleX = 0.27925268F;
		bodyModel[60].rotateAngleZ = -0.6981317F;

		bodyModel[61].addShapeBox(0F, 6.3F, -5.1F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[61].setRotationPoint(-32F, -39.2F, 0F);
		bodyModel[61].rotateAngleX = 0.27925268F;
		bodyModel[61].rotateAngleZ = -0.6981317F;

		bodyModel[62].addShapeBox(0F, 6.3F, 4.1F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[62].setRotationPoint(-32F, -39.2F, 0F);
		bodyModel[62].rotateAngleX = -0.27925268F;
		bodyModel[62].rotateAngleZ = -0.6981317F;


		tailModel = new ModelRendererTurbo[17];
		tailModel[0] = new ModelRendererTurbo(this, 785, 25, textureX, textureY); // Box 8
		tailModel[1] = new ModelRendererTurbo(this, 937, 25, textureX, textureY); // Box 8
		tailModel[2] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Box 8
		tailModel[3] = new ModelRendererTurbo(this, 641, 49, textureX, textureY); // Box 8
		tailModel[4] = new ModelRendererTurbo(this, 921, 49, textureX, textureY); // Box 8
		tailModel[5] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 8
		tailModel[6] = new ModelRendererTurbo(this, 833, 25, textureX, textureY); // Box 8
		tailModel[7] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 8
		tailModel[8] = new ModelRendererTurbo(this, 689, 25, textureX, textureY); // Box 8
		tailModel[9] = new ModelRendererTurbo(this, 673, 49, textureX, textureY); // Box 8
		tailModel[10] = new ModelRendererTurbo(this, 625, 25, textureX, textureY); // Box 8
		tailModel[11] = new ModelRendererTurbo(this, 617, 57, textureX, textureY); // Box 8
		tailModel[12] = new ModelRendererTurbo(this, 777, 57, textureX, textureY); // Box 8
		tailModel[13] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 8
		tailModel[14] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 8
		tailModel[15] = new ModelRendererTurbo(this, 569, 41, textureX, textureY); // Box 8
		tailModel[16] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 8

		tailModel[0].addShapeBox(0F, 0F, 0F, 12, 13, 18, 0F, 0F, 1F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 8
		tailModel[0].setRotationPoint(70F, -30F, -9F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 12, 13, 5, 0F, 0F, 1F, 0F, 0F, -2F, 2F, 0F, -4F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -4F, -3F, 0F, -2F, 0F); // Box 8
		tailModel[1].setRotationPoint(70F, -30F, 9F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 12, 9, 2, 0F, 0F, 1F, 0F, 0F, -2F, 3F, 0F, -2F, -5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 3F, 0F, -2F, -5F, 0F, -2F, 0F); // Box 8
		tailModel[2].setRotationPoint(70F, -28F, 14F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 12, 9, 2, 0F, 0F, -1F, 0F, 0F, -2F, -5F, 0F, -2F, 3F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, -5F, 0F, -2F, 3F, 0F, 0F, 0F); // Box 8
		tailModel[3].setRotationPoint(70F, -28F, -16F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 12, 13, 5, 0F, 0F, -1F, 0F, 0F, -4F, -3F, 0F, -2F, 2F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -4F, -3F, 0F, -2F, 2F, 0F, 0F, 0F); // Box 8
		tailModel[4].setRotationPoint(70F, -30F, -14F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 3, 9, 3, 0F, 0F, -3F, 0F, 0F, -3F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 8
		tailModel[5].setRotationPoint(82F, -28F, 1F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 3, 9, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 8
		tailModel[6].setRotationPoint(82F, -28F, 4F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 3, 9, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, -1F, 0F, -3F, 0F); // Box 8
		tailModel[7].setRotationPoint(82F, -28F, 7F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F, 0F, 0F, 2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 8
		tailModel[8].setRotationPoint(82F, -28F, -4F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 2F); // Box 8
		tailModel[9].setRotationPoint(82F, -22F, -4F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 5, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F); // Box 8
		tailModel[10].setRotationPoint(83F, -25F, -3F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0F, 0F, 2F, 0F, -2F, -2.5F, 0F, -2F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F); // Box 8
		tailModel[11].setRotationPoint(83F, -27F, -3F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -2F, -2.5F, 0F, -2F, -2.5F, 0F, 0F, 2F); // Box 8
		tailModel[12].setRotationPoint(83F, -22F, -3F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, 0F, 0F, 0F); // Box 8
		tailModel[13].setRotationPoint(88F, -25F, -0.5F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 3, 9, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, -1F, 0F, -3F, 0F); // Box 8
		tailModel[14].setRotationPoint(82F, -28F, -4F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 3, 9, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 8
		tailModel[15].setRotationPoint(82F, -28F, -7F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 3, 9, 3, 0F, 0F, -3F, 0F, 0F, -3F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 8
		tailModel[16].setRotationPoint(82F, -28F, -10F);


		leftWingModel = new ModelRendererTurbo[20];
		leftWingModel[0] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 8
		leftWingModel[1] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 8
		leftWingModel[2] = new ModelRendererTurbo(this, 569, 65, textureX, textureY); // Box 8
		leftWingModel[3] = new ModelRendererTurbo(this, 593, 65, textureX, textureY); // Box 8
		leftWingModel[4] = new ModelRendererTurbo(this, 833, 65, textureX, textureY); // Box 8
		leftWingModel[5] = new ModelRendererTurbo(this, 481, 113, textureX, textureY); // Box 8
		leftWingModel[6] = new ModelRendererTurbo(this, 561, 113, textureX, textureY); // Box 8
		leftWingModel[7] = new ModelRendererTurbo(this, 641, 113, textureX, textureY); // Box 8
		leftWingModel[8] = new ModelRendererTurbo(this, 969, 25, textureX, textureY); // Box 8
		leftWingModel[9] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 8
		leftWingModel[10] = new ModelRendererTurbo(this, 777, 41, textureX, textureY); // Box 8
		leftWingModel[11] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 8
		leftWingModel[12] = new ModelRendererTurbo(this, 673, 49, textureX, textureY); // Box 8
		leftWingModel[13] = new ModelRendererTurbo(this, 689, 49, textureX, textureY); // Box 8
		leftWingModel[14] = new ModelRendererTurbo(this, 777, 49, textureX, textureY); // Box 8
		leftWingModel[15] = new ModelRendererTurbo(this, 953, 49, textureX, textureY); // Box 8
		leftWingModel[16] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 8
		leftWingModel[17] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 8
		leftWingModel[18] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 8
		leftWingModel[19] = new ModelRendererTurbo(this, 977, 97, textureX, textureY); // Box 8

		leftWingModel[0].addShapeBox(0F, 0F, -22F, 48, 2, 22, 0F, -12F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 8
		leftWingModel[0].setRotationPoint(10F, -25F, -16F);

		leftWingModel[1].addShapeBox(0F, 0F, -23F, 8, 2, 22, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 3F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 3F, 0F, 0F); // Box 8
		leftWingModel[1].setRotationPoint(55F, -25F, -15F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, 0F, -1.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.5F); // Box 8
		leftWingModel[2].setRotationPoint(4F, -21F, -26F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F); // Box 8
		leftWingModel[3].setRotationPoint(4F, -20F, -26F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, 0F, 0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.5F, -1.5F); // Box 8
		leftWingModel[4].setRotationPoint(4F, -19F, -26F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 36, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 8
		leftWingModel[5].setRotationPoint(10F, -19F, -26F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 36, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		leftWingModel[6].setRotationPoint(10F, -20F, -26F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 36, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		leftWingModel[7].setRotationPoint(10F, -21F, -26F);

		leftWingModel[8].addShapeBox(0F, -3F, -0.5F, 2, 3, 1, 0F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F); // Box 8
		leftWingModel[8].setRotationPoint(20F, -20.5F, -23.5F);
		leftWingModel[8].rotateAngleX = -0.78539816F;

		leftWingModel[9].addShapeBox(0F, 0F, -0.5F, 2, 3, 1, 0F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F); // Box 8
		leftWingModel[9].setRotationPoint(20F, -18.5F, -23.5F);
		leftWingModel[9].rotateAngleX = 0.78539816F;

		leftWingModel[10].addShapeBox(0F, 0F, -0.5F, 2, 3, 1, 0F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F); // Box 8
		leftWingModel[10].setRotationPoint(20F, -18.5F, -25.5F);
		leftWingModel[10].rotateAngleX = -0.78539816F;

		leftWingModel[11].addShapeBox(0F, -3F, -0.5F, 2, 3, 1, 0F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F); // Box 8
		leftWingModel[11].setRotationPoint(20F, -20.5F, -25.5F);
		leftWingModel[11].rotateAngleX = 0.78539816F;

		leftWingModel[12].addShapeBox(0F, 0F, -0.5F, 2, 3, 1, 0F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F); // Box 8
		leftWingModel[12].setRotationPoint(43F, -18.5F, -25.5F);
		leftWingModel[12].rotateAngleX = -0.78539816F;

		leftWingModel[13].addShapeBox(0F, 0F, -0.5F, 2, 3, 1, 0F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F); // Box 8
		leftWingModel[13].setRotationPoint(43F, -18.5F, -23.5F);
		leftWingModel[13].rotateAngleX = 0.78539816F;

		leftWingModel[14].addShapeBox(0F, -3F, -0.5F, 2, 3, 1, 0F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F); // Box 8
		leftWingModel[14].setRotationPoint(43F, -20.5F, -23.5F);
		leftWingModel[14].rotateAngleX = -0.78539816F;

		leftWingModel[15].addShapeBox(0F, -3F, -0.5F, 2, 3, 1, 0F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F); // Box 8
		leftWingModel[15].setRotationPoint(43F, -20.5F, -25.5F);
		leftWingModel[15].rotateAngleX = 0.78539816F;

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		leftWingModel[16].setRotationPoint(63F, -24.5F, -32F);

		leftWingModel[17].addShapeBox(0F, 0F, -12F, 2, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		leftWingModel[17].setRotationPoint(63F, -24.5F, 32F);

		leftWingModel[18].addShapeBox(0F, 0F, -2F, 20, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		leftWingModel[18].setRotationPoint(20F, -23F, -23F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 20, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		leftWingModel[19].setRotationPoint(20F, -23F, 23F);


		rightWingModel = new ModelRendererTurbo[16];
		rightWingModel[0] = new ModelRendererTurbo(this, 793, 65, textureX, textureY); // Box 8
		rightWingModel[1] = new ModelRendererTurbo(this, 833, 73, textureX, textureY); // Box 8
		rightWingModel[2] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 8
		rightWingModel[3] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 8
		rightWingModel[4] = new ModelRendererTurbo(this, 825, 105, textureX, textureY); // Box 8
		rightWingModel[5] = new ModelRendererTurbo(this, 905, 105, textureX, textureY); // Box 8
		rightWingModel[6] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 8
		rightWingModel[7] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 8
		rightWingModel[8] = new ModelRendererTurbo(this, 625, 17, textureX, textureY); // Box 8
		rightWingModel[9] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 8
		rightWingModel[10] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 8
		rightWingModel[11] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 8
		rightWingModel[12] = new ModelRendererTurbo(this, 705, 25, textureX, textureY); // Box 8
		rightWingModel[13] = new ModelRendererTurbo(this, 793, 25, textureX, textureY); // Box 8
		rightWingModel[14] = new ModelRendererTurbo(this, 873, 25, textureX, textureY); // Box 8
		rightWingModel[15] = new ModelRendererTurbo(this, 929, 25, textureX, textureY); // Box 8

		rightWingModel[0].addShapeBox(0F, 0F, -1F, 8, 2, 22, 0F, 3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F); // Box 8
		rightWingModel[0].setRotationPoint(55F, -25F, 17F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 48, 2, 22, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, -12F, 0F, 0F); // Box 8
		rightWingModel[1].setRotationPoint(10F, -25F, 16F);

		rightWingModel[2].addShapeBox(0F, 0F, -0.5F, 2, 3, 1, 0F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F); // Box 8
		rightWingModel[2].setRotationPoint(20F, -18.5F, 22.5F);
		rightWingModel[2].rotateAngleX = -0.78539816F;

		rightWingModel[3].addShapeBox(0F, 0F, -0.5F, 2, 3, 1, 0F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F); // Box 8
		rightWingModel[3].setRotationPoint(20F, -18.5F, 24.5F);
		rightWingModel[3].rotateAngleX = 0.78539816F;

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 36, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 8
		rightWingModel[4].setRotationPoint(10F, -19F, 22F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 36, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		rightWingModel[5].setRotationPoint(10F, -20F, 22F);

		rightWingModel[6].addShapeBox(0F, -3F, -0.5F, 2, 3, 1, 0F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F); // Box 8
		rightWingModel[6].setRotationPoint(20F, -20.5F, 24.5F);
		rightWingModel[6].rotateAngleX = -0.78539816F;

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 36, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		rightWingModel[7].setRotationPoint(10F, -21F, 22F);

		rightWingModel[8].addShapeBox(0F, -3F, -0.5F, 2, 3, 1, 0F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F); // Box 8
		rightWingModel[8].setRotationPoint(20F, -20.5F, 22.5F);
		rightWingModel[8].rotateAngleX = 0.78539816F;

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, 0F, -1.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.5F); // Box 8
		rightWingModel[9].setRotationPoint(4F, -21F, 22F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F); // Box 8
		rightWingModel[10].setRotationPoint(4F, -20F, 22F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, 0F, 0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.5F, -1.5F); // Box 8
		rightWingModel[11].setRotationPoint(4F, -19F, 22F);

		rightWingModel[12].addShapeBox(0F, 0F, -0.5F, 2, 3, 1, 0F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F); // Box 8
		rightWingModel[12].setRotationPoint(43F, -18.5F, 22.5F);
		rightWingModel[12].rotateAngleX = -0.78539816F;

		rightWingModel[13].addShapeBox(0F, -3F, -0.5F, 2, 3, 1, 0F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F); // Box 8
		rightWingModel[13].setRotationPoint(43F, -20.5F, 22.5F);
		rightWingModel[13].rotateAngleX = 0.78539816F;

		rightWingModel[14].addShapeBox(0F, 0F, -0.5F, 2, 3, 1, 0F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F); // Box 8
		rightWingModel[14].setRotationPoint(43F, -18.5F, 24.5F);
		rightWingModel[14].rotateAngleX = 0.78539816F;

		rightWingModel[15].addShapeBox(0F, -3F, -0.5F, 2, 3, 1, 0F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F); // Box 8
		rightWingModel[15].setRotationPoint(43F, -20.5F, 24.5F);
		rightWingModel[15].rotateAngleX = -0.78539816F;


		topWingModel = new ModelRendererTurbo[12];
		topWingModel[0] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 8
		topWingModel[1] = new ModelRendererTurbo(this, 697, 41, textureX, textureY); // Box 8
		topWingModel[2] = new ModelRendererTurbo(this, 969, 41, textureX, textureY); // Box 8
		topWingModel[3] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 8
		topWingModel[4] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Box 8
		topWingModel[5] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Box 8
		topWingModel[6] = new ModelRendererTurbo(this, 849, 49, textureX, textureY); // Box 8
		topWingModel[7] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 8
		topWingModel[8] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 8
		topWingModel[9] = new ModelRendererTurbo(this, 545, 57, textureX, textureY); // Box 8
		topWingModel[10] = new ModelRendererTurbo(this, 569, 81, textureX, textureY); // Box 8
		topWingModel[11] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 8

		topWingModel[0].addShapeBox(0F, 0F, 0F, 27, 4, 3, 0F, -10F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -10F, 0F, -0.5F, 6F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 6F, 0F, -0.5F); // Box 8
		topWingModel[0].setRotationPoint(48F, -29F, -38F);

		topWingModel[1].addShapeBox(0F, 0F, 0F, 22, 26, 3, 0F, -18F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, -18F, 0F, -0.5F, 0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 8
		topWingModel[1].setRotationPoint(58F, -55F, -38F);

		topWingModel[2].addShapeBox(0F, 0F, -3F, 22, 26, 3, 0F, -18F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, -18F, 0F, -0.5F, 0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 8
		topWingModel[2].setRotationPoint(58F, -55F, 38F);

		topWingModel[3].addShapeBox(0F, 0F, -3F, 27, 4, 3, 0F, -10F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -10F, 0F, -0.5F, 6F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 6F, 0F, -0.5F); // Box 8
		topWingModel[3].setRotationPoint(48F, -29F, 38F);

		topWingModel[4].addShapeBox(0F, 0F, -1F, 4, 4, 3, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 8
		topWingModel[4].setRotationPoint(75F, -29F, -37F);

		topWingModel[5].addShapeBox(0F, 0F, -2F, 4, 4, 3, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 8
		topWingModel[5].setRotationPoint(75F, -29F, 37F);

		topWingModel[6].addShapeBox(0F, 0F, -3F, 32, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -10F, 0F, -0.5F); // Box 8
		topWingModel[6].setRotationPoint(48F, -23F, 38F);

		topWingModel[7].addShapeBox(0F, 0F, -3F, 32, 2, 3, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // Box 8
		topWingModel[7].setRotationPoint(48F, -25F, 38F);

		topWingModel[8].addShapeBox(0F, 0F, 0F, 32, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -10F, 0F, -0.5F); // Box 8
		topWingModel[8].setRotationPoint(48F, -23F, -38F);

		topWingModel[9].addShapeBox(0F, 0F, 0F, 32, 2, 3, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // Box 8
		topWingModel[9].setRotationPoint(48F, -25F, -38F);

		topWingModel[10].addShapeBox(-8F, 0F, 0F, 28, 14, 0, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -12F, -8F, 0F, -12F, -8F, 0F, 0F, -8F, 0F); // Box 8
		topWingModel[10].setRotationPoint(68.5F, -32F, -38F);
		topWingModel[10].rotateAngleX = -0.03490659F;

		topWingModel[11].addShapeBox(-8F, 0F, 0F, 28, 14, 0, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -12F, -8F, 0F, -12F, -8F, 0F, 0F, -8F, 0F); // Box 8
		topWingModel[11].setRotationPoint(68.5F, -32F, 38F);
		topWingModel[11].rotateAngleX = 0.03490659F;


		yawFlapModel = new ModelRendererTurbo[2];
		yawFlapModel[0] = new ModelRendererTurbo(this, 753, 41, textureX, textureY); // Box 8
		yawFlapModel[1] = new ModelRendererTurbo(this, 673, 65, textureX, textureY); // Box 8

		yawFlapModel[0].addShapeBox(-3F, -13F, -1.5F, 7, 26, 3, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 8
		yawFlapModel[0].setRotationPoint(78F, -42F, -36.5F);

		yawFlapModel[1].addShapeBox(-3F, -13F, -1.5F, 7, 26, 3, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 8
		yawFlapModel[1].setRotationPoint(78F, -42F, 36.5F);


		pitchFlapRightWingModel = new ModelRendererTurbo[4];
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 8
		pitchFlapRightWingModel[1] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 8
		pitchFlapRightWingModel[2] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 8
		pitchFlapRightWingModel[3] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 8

		pitchFlapRightWingModel[0].addShapeBox(-1F, 0F, -5F, 2, 16, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		pitchFlapRightWingModel[0].setRotationPoint(39F, -23F, 38F);

		pitchFlapRightWingModel[1].addShapeBox(-1F, 0F, -1F, 4, 8, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		pitchFlapRightWingModel[1].setRotationPoint(38F, -9F, 36F);

		pitchFlapRightWingModel[2].addShapeBox(-1F, 0F, -1F, 2, 8, 2, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 8
		pitchFlapRightWingModel[2].setRotationPoint(36F, -9F, 36F);

		pitchFlapRightWingModel[3].addShapeBox(-1F, 0F, -1F, 2, 8, 2, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 8
		pitchFlapRightWingModel[3].setRotationPoint(42F, -9F, 36F);


		bodyWheelModel = new ModelRendererTurbo[14];
		bodyWheelModel[0] = new ModelRendererTurbo(this, 801, 57, textureX, textureY); // Box 8
		bodyWheelModel[1] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Box 8
		bodyWheelModel[2] = new ModelRendererTurbo(this, 593, 17, textureX, textureY); // Box 8
		bodyWheelModel[3] = new ModelRendererTurbo(this, 745, 17, textureX, textureY); // Box 8
		bodyWheelModel[4] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 8
		bodyWheelModel[5] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 8
		bodyWheelModel[6] = new ModelRendererTurbo(this, 585, 25, textureX, textureY); // Box 8
		bodyWheelModel[7] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 8
		bodyWheelModel[8] = new ModelRendererTurbo(this, 817, 57, textureX, textureY); // Box 8
		bodyWheelModel[9] = new ModelRendererTurbo(this, 793, 9, textureX, textureY); // Box 8
		bodyWheelModel[10] = new ModelRendererTurbo(this, 873, 57, textureX, textureY); // Box 8
		bodyWheelModel[11] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 8
		bodyWheelModel[12] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Box 8
		bodyWheelModel[13] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 8

		bodyWheelModel[0].addShapeBox(-1F, 0F, -1F, 2, 20, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyWheelModel[0].setRotationPoint(-34F, -17F, 0F);

		bodyWheelModel[1].addShapeBox(-1F, 0F, -1F, 2, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyWheelModel[1].setRotationPoint(-34F, 1F, -2F);

		bodyWheelModel[2].addShapeBox(-1F, 0F, -1F, 2, 6, 2, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 8
		bodyWheelModel[2].setRotationPoint(-32F, 1F, -2F);

		bodyWheelModel[3].addShapeBox(-1F, 0F, -1F, 2, 6, 2, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 8
		bodyWheelModel[3].setRotationPoint(-36F, 1F, -2F);

		bodyWheelModel[4].addShapeBox(-1F, 0F, -1F, 2, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyWheelModel[4].setRotationPoint(-34F, 1F, 2F);

		bodyWheelModel[5].addShapeBox(-1F, 0F, -1F, 2, 6, 2, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 8
		bodyWheelModel[5].setRotationPoint(-36F, 1F, 2F);

		bodyWheelModel[6].addShapeBox(-1F, 0F, -1F, 2, 6, 2, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 8
		bodyWheelModel[6].setRotationPoint(-32F, 1F, 2F);

		bodyWheelModel[7].addShapeBox(-1F, 0F, -1F, 26, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyWheelModel[7].setRotationPoint(-36F, -17F, -2F);
		bodyWheelModel[7].rotateAngleX = -0.27925268F;

		bodyWheelModel[8].addShapeBox(-1F, 0F, 0F, 26, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyWheelModel[8].setRotationPoint(-36F, -17F, 2F);
		bodyWheelModel[8].rotateAngleX = 0.27925268F;

		bodyWheelModel[9].addShapeBox(-1F, 0F, -3F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyWheelModel[9].setRotationPoint(-39F, -17F, 0F);
		bodyWheelModel[9].rotateAngleZ = -0.52359878F;

		bodyWheelModel[10].addShapeBox(-1F, 1F, -3F, 1, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 8
		bodyWheelModel[10].setRotationPoint(-39F, -17F, 0F);
		bodyWheelModel[10].rotateAngleZ = -0.52359878F;

		bodyWheelModel[11].addShapeBox(0F, 0F, -0.5F, 1, 15, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyWheelModel[11].setRotationPoint(-26F, -17F, 0F);
		bodyWheelModel[11].rotateAngleZ = -0.55850536F;

		bodyWheelModel[12].addShapeBox(0F, -8F, -0.5F, 1, 8, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8
		bodyWheelModel[12].setRotationPoint(-32F, -7F, 0F);
		bodyWheelModel[12].rotateAngleZ = 0.2443461F;

		bodyWheelModel[13].addShapeBox(-1F, 0F, -5F, 1, 10, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyWheelModel[13].setRotationPoint(36F, -23F, 36F);
		bodyWheelModel[13].rotateAngleZ = -0.27925268F;


		leftWingWheelModel = new ModelRendererTurbo[5];
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 889, 57, textureX, textureY); // Box 8
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 905, 57, textureX, textureY); // Box 8
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 8
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 8
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 8

		leftWingWheelModel[0].addShapeBox(-1F, 0F, -1F, 4, 8, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		leftWingWheelModel[0].setRotationPoint(38F, -9F, -36F);

		leftWingWheelModel[1].addShapeBox(-1F, 0F, -1F, 2, 8, 2, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 8
		leftWingWheelModel[1].setRotationPoint(36F, -9F, -36F);

		leftWingWheelModel[2].addShapeBox(-1F, 0F, -1F, 2, 8, 2, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 8
		leftWingWheelModel[2].setRotationPoint(42F, -9F, -36F);

		leftWingWheelModel[3].addShapeBox(-1F, 0F, -1F, 2, 16, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		leftWingWheelModel[3].setRotationPoint(39F, -23F, -34F);

		leftWingWheelModel[4].addShapeBox(-1F, 0F, -1F, 1, 10, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		leftWingWheelModel[4].setRotationPoint(36F, -23F, -36F);
		leftWingWheelModel[4].rotateAngleZ = -0.27925268F;


		leftWingPos1Model = new ModelRendererTurbo[20];
		leftWingPos1Model[0] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 8
		leftWingPos1Model[1] = new ModelRendererTurbo(this, 569, 73, textureX, textureY); // Box 8
		leftWingPos1Model[2] = new ModelRendererTurbo(this, 617, 65, textureX, textureY); // Box 8
		leftWingPos1Model[3] = new ModelRendererTurbo(this, 953, 73, textureX, textureY); // Box 8
		leftWingPos1Model[4] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 8
		leftWingPos1Model[5] = new ModelRendererTurbo(this, 721, 113, textureX, textureY); // Box 8
		leftWingPos1Model[6] = new ModelRendererTurbo(this, 857, 65, textureX, textureY); // Box 8
		leftWingPos1Model[7] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 8
		leftWingPos1Model[8] = new ModelRendererTurbo(this, 833, 73, textureX, textureY); // Box 8
		leftWingPos1Model[9] = new ModelRendererTurbo(this, 961, 49, textureX, textureY); // Box 8
		leftWingPos1Model[10] = new ModelRendererTurbo(this, 961, 57, textureX, textureY); // Box 8
		leftWingPos1Model[11] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 8
		leftWingPos1Model[12] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 8
		leftWingPos1Model[13] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 8
		leftWingPos1Model[14] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 8
		leftWingPos1Model[15] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 8
		leftWingPos1Model[16] = new ModelRendererTurbo(this, 641, 65, textureX, textureY); // Box 8
		leftWingPos1Model[17] = new ModelRendererTurbo(this, 801, 113, textureX, textureY); // Box 8
		leftWingPos1Model[18] = new ModelRendererTurbo(this, 881, 113, textureX, textureY); // Box 8
		leftWingPos1Model[19] = new ModelRendererTurbo(this, 953, 89, textureX, textureY); // Box 8

		leftWingPos1Model[0].addShapeBox(-20F, 0F, -31F, 44, 2, 31, 0F, -17F, 0F, 0F, -2F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -17F, 0F, 0F, -2F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 8
		leftWingPos1Model[0].setRotationPoint(42F, -25F, -38F);

		leftWingPos1Model[1].addShapeBox(-3F, 0F, -34F, 33, 2, 3, 0F, -4F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		leftWingPos1Model[1].setRotationPoint(42F, -25F, -38F);

		leftWingPos1Model[2].addShapeBox(13F, 0F, -31F, 9, 2, 31, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F); // Box 8
		leftWingPos1Model[2].setRotationPoint(50F, -25F, -38F);

		leftWingPos1Model[3].addShapeBox(-3F, 0F, -3F, 25, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, 0F); // Box 8
		leftWingPos1Model[3].setRotationPoint(42F, -25F, 38F);

		leftWingPos1Model[4].addShapeBox(-5F, 0F, -15F, 9, 0, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		leftWingPos1Model[4].setRotationPoint(46F, -25.3F, -46F);
		leftWingPos1Model[4].rotateAngleY = 0.2443461F;

		leftWingPos1Model[5].addShapeBox(0F, 0F, 0F, 36, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		leftWingPos1Model[5].setRotationPoint(20F, -20F, -49F);

		leftWingPos1Model[6].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, 0F, -1.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.5F); // Box 8
		leftWingPos1Model[6].setRotationPoint(14F, -21F, -49F);

		leftWingPos1Model[7].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F); // Box 8
		leftWingPos1Model[7].setRotationPoint(14F, -20F, -49F);

		leftWingPos1Model[8].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, 0F, 0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.5F, -1.5F); // Box 8
		leftWingPos1Model[8].setRotationPoint(14F, -19F, -49F);

		leftWingPos1Model[9].addShapeBox(0F, 0F, -0.5F, 2, 3, 1, 0F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F); // Box 8
		leftWingPos1Model[9].setRotationPoint(30F, -18.5F, -46.5F);
		leftWingPos1Model[9].rotateAngleX = 0.78539816F;

		leftWingPos1Model[10].addShapeBox(0F, -3F, -0.5F, 2, 3, 1, 0F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F); // Box 8
		leftWingPos1Model[10].setRotationPoint(30F, -20.5F, -46.5F);
		leftWingPos1Model[10].rotateAngleX = -0.78539816F;

		leftWingPos1Model[11].addShapeBox(0F, -3F, -0.5F, 2, 3, 1, 0F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F); // Box 8
		leftWingPos1Model[11].setRotationPoint(30F, -20.5F, -48.5F);
		leftWingPos1Model[11].rotateAngleX = 0.78539816F;

		leftWingPos1Model[12].addShapeBox(0F, 0F, -0.5F, 2, 3, 1, 0F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F); // Box 8
		leftWingPos1Model[12].setRotationPoint(30F, -18.5F, -48.5F);
		leftWingPos1Model[12].rotateAngleX = -0.78539816F;

		leftWingPos1Model[13].addShapeBox(0F, 0F, -0.5F, 2, 3, 1, 0F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F); // Box 8
		leftWingPos1Model[13].setRotationPoint(53F, -18.5F, -48.5F);
		leftWingPos1Model[13].rotateAngleX = -0.78539816F;

		leftWingPos1Model[14].addShapeBox(0F, -3F, -0.5F, 2, 3, 1, 0F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F); // Box 8
		leftWingPos1Model[14].setRotationPoint(53F, -20.5F, -48.5F);
		leftWingPos1Model[14].rotateAngleX = 0.78539816F;

		leftWingPos1Model[15].addShapeBox(0F, -3F, -0.5F, 2, 3, 1, 0F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F); // Box 8
		leftWingPos1Model[15].setRotationPoint(53F, -20.5F, -46.5F);
		leftWingPos1Model[15].rotateAngleX = -0.78539816F;

		leftWingPos1Model[16].addShapeBox(0F, 0F, -0.5F, 2, 3, 1, 0F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F); // Box 8
		leftWingPos1Model[16].setRotationPoint(53F, -18.5F, -46.5F);
		leftWingPos1Model[16].rotateAngleX = 0.78539816F;

		leftWingPos1Model[17].addShapeBox(0F, 0F, 0F, 36, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		leftWingPos1Model[17].setRotationPoint(20F, -21F, -49F);

		leftWingPos1Model[18].addShapeBox(0F, 0F, 0F, 36, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 8
		leftWingPos1Model[18].setRotationPoint(20F, -19F, -49F);

		leftWingPos1Model[19].addShapeBox(0F, 0F, -2F, 20, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		leftWingPos1Model[19].setRotationPoint(30F, -23F, -46F);


		leftWingPos2Model = new ModelRendererTurbo[3];
		leftWingPos2Model[0] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 8
		leftWingPos2Model[1] = new ModelRendererTurbo(this, 617, 65, textureX, textureY); // Box 8
		leftWingPos2Model[2] = new ModelRendererTurbo(this, 569, 73, textureX, textureY); // Box 8

		leftWingPos2Model[0].addShapeBox(-20F, 0F, -31F, 44, 2, 31, 0F, -17F, 0F, 0F, -2F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -17F, 0F, 0F, -2F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 8
		leftWingPos2Model[0].setRotationPoint(42F, -25F, -38F);
		leftWingPos2Model[0].rotateAngleX = -1.3962634F;

		leftWingPos2Model[1].addShapeBox(13F, 0F, -31F, 9, 2, 31, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F); // Box 8
		leftWingPos2Model[1].setRotationPoint(50F, -25F, -38F);
		leftWingPos2Model[1].rotateAngleX = -1.3962634F;

		leftWingPos2Model[2].addShapeBox(-3F, 0F, -34F, 33, 2, 3, 0F, -4F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		leftWingPos2Model[2].setRotationPoint(42F, -25F, -38F);
		leftWingPos2Model[2].rotateAngleX = -1.3962634F;


		rightWingPos1Model = new ModelRendererTurbo[22];
		rightWingPos1Model[0] = new ModelRendererTurbo(this, 673, 73, textureX, textureY); // Box 8
		rightWingPos1Model[1] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 8
		rightWingPos1Model[2] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 8
		rightWingPos1Model[3] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 8
		rightWingPos1Model[4] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 8
		rightWingPos1Model[5] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 8
		rightWingPos1Model[6] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 8
		rightWingPos1Model[7] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 8
		rightWingPos1Model[8] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 8
		rightWingPos1Model[9] = new ModelRendererTurbo(this, 561, 105, textureX, textureY); // Box 8
		rightWingPos1Model[10] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Box 8
		rightWingPos1Model[11] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 8
		rightWingPos1Model[12] = new ModelRendererTurbo(this, 969, 9, textureX, textureY); // Box 8
		rightWingPos1Model[13] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 8
		rightWingPos1Model[14] = new ModelRendererTurbo(this, 737, 17, textureX, textureY); // Box 8
		rightWingPos1Model[15] = new ModelRendererTurbo(this, 1017, 17, textureX, textureY); // Box 8
		rightWingPos1Model[16] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 8
		rightWingPos1Model[17] = new ModelRendererTurbo(this, 689, 25, textureX, textureY); // Box 8
		rightWingPos1Model[18] = new ModelRendererTurbo(this, 953, 81, textureX, textureY); // Box 8
		rightWingPos1Model[19] = new ModelRendererTurbo(this, 673, 73, textureX, textureY); // Box 8
		rightWingPos1Model[20] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 8
		rightWingPos1Model[21] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 8

		rightWingPos1Model[0].addShapeBox(-20F, 0F, 0F, 44, 2, 31, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -2F, 0F, 0F, -17F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -2F, 0F, 0F, -17F, 0F, 0F); // Box 8
		rightWingPos1Model[0].setRotationPoint(42F, -25F, 38F);

		rightWingPos1Model[1].addShapeBox(13F, 0F, 0F, 9, 2, 31, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 8
		rightWingPos1Model[1].setRotationPoint(50F, -25F, 38F);

		rightWingPos1Model[2].addShapeBox(-3F, 0F, 31F, 33, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, 0F); // Box 8
		rightWingPos1Model[2].setRotationPoint(42F, -25F, 38F);

		rightWingPos1Model[3].addShapeBox(-5F, 0F, 0F, 9, 0, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		rightWingPos1Model[3].setRotationPoint(46F, -25.3F, 46F);
		rightWingPos1Model[3].rotateAngleY = -0.2443461F;

		rightWingPos1Model[4].addShapeBox(0F, 0F, 0F, 36, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		rightWingPos1Model[4].setRotationPoint(20F, -20F, 45F);

		rightWingPos1Model[5].addShapeBox(0F, 0F, 0F, 36, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 8
		rightWingPos1Model[5].setRotationPoint(20F, -19F, 45F);

		rightWingPos1Model[6].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, 0F, -1.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.5F); // Box 8
		rightWingPos1Model[6].setRotationPoint(14F, -21F, 45F);

		rightWingPos1Model[7].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F); // Box 8
		rightWingPos1Model[7].setRotationPoint(14F, -20F, 45F);

		rightWingPos1Model[8].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, 0F, 0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.5F, -1.5F); // Box 8
		rightWingPos1Model[8].setRotationPoint(14F, -19F, 45F);

		rightWingPos1Model[9].addShapeBox(0F, 0F, 0F, 36, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		rightWingPos1Model[9].setRotationPoint(20F, -21F, 45F);

		rightWingPos1Model[10].addShapeBox(0F, -3F, -0.5F, 2, 3, 1, 0F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F); // Box 8
		rightWingPos1Model[10].setRotationPoint(30F, -20.5F, 47.5F);
		rightWingPos1Model[10].rotateAngleX = -0.78539816F;

		rightWingPos1Model[11].addShapeBox(0F, -3F, -0.5F, 2, 3, 1, 0F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F); // Box 8
		rightWingPos1Model[11].setRotationPoint(30F, -20.5F, 45.5F);
		rightWingPos1Model[11].rotateAngleX = 0.78539816F;

		rightWingPos1Model[12].addShapeBox(0F, 0F, -0.5F, 2, 3, 1, 0F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F); // Box 8
		rightWingPos1Model[12].setRotationPoint(30F, -18.5F, 45.5F);
		rightWingPos1Model[12].rotateAngleX = -0.78539816F;

		rightWingPos1Model[13].addShapeBox(0F, 0F, -0.5F, 2, 3, 1, 0F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F); // Box 8
		rightWingPos1Model[13].setRotationPoint(30F, -18.5F, 47.5F);
		rightWingPos1Model[13].rotateAngleX = 0.78539816F;

		rightWingPos1Model[14].addShapeBox(0F, -3F, -0.5F, 2, 3, 1, 0F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F); // Box 8
		rightWingPos1Model[14].setRotationPoint(53F, -20.5F, 47.5F);
		rightWingPos1Model[14].rotateAngleX = -0.78539816F;

		rightWingPos1Model[15].addShapeBox(0F, 0F, -0.5F, 2, 3, 1, 0F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F); // Box 8
		rightWingPos1Model[15].setRotationPoint(53F, -18.5F, 47.5F);
		rightWingPos1Model[15].rotateAngleX = 0.78539816F;

		rightWingPos1Model[16].addShapeBox(0F, 0F, -0.5F, 2, 3, 1, 0F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F); // Box 8
		rightWingPos1Model[16].setRotationPoint(53F, -18.5F, 45.5F);
		rightWingPos1Model[16].rotateAngleX = -0.78539816F;

		rightWingPos1Model[17].addShapeBox(0F, -3F, -0.5F, 2, 3, 1, 0F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F); // Box 8
		rightWingPos1Model[17].setRotationPoint(53F, -20.5F, 45.5F);
		rightWingPos1Model[17].rotateAngleX = 0.78539816F;

		rightWingPos1Model[18].addShapeBox(0F, 0F, 0F, 20, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		rightWingPos1Model[18].setRotationPoint(30F, -23F, 46F);

		rightWingPos1Model[19].addShapeBox(-20F, 0F, 0F, 44, 2, 31, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -2F, 0F, 0F, -17F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -2F, 0F, 0F, -17F, 0F, 0F); // Box 8
		rightWingPos1Model[19].setRotationPoint(42F, -25F, 38F);
		rightWingPos1Model[19].rotateAngleX = 1.3962634F;

		rightWingPos1Model[20].addShapeBox(13F, 0F, 0F, 9, 2, 31, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 8
		rightWingPos1Model[20].setRotationPoint(50F, -25F, 38F);
		rightWingPos1Model[20].rotateAngleX = 1.3962634F;

		rightWingPos1Model[21].addShapeBox(-3F, 0F, 31F, 33, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, 0F); // Box 8
		rightWingPos1Model[21].setRotationPoint(42F, -25F, 38F);
		rightWingPos1Model[21].rotateAngleX = 1.3962634F;



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}