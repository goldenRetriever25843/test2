//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMig15Elite extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelMig15Elite() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[54];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Box 13
		bodyModel[6] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Box 15
		bodyModel[7] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Box 16
		bodyModel[8] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 17
		bodyModel[9] = new ModelRendererTurbo(this, 905, 17, textureX, textureY); // Box 18
		bodyModel[10] = new ModelRendererTurbo(this, 513, 33, textureX, textureY); // Box 19
		bodyModel[11] = new ModelRendererTurbo(this, 601, 33, textureX, textureY); // Box 20
		bodyModel[12] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 21
		bodyModel[13] = new ModelRendererTurbo(this, 665, 33, textureX, textureY); // Box 22
		bodyModel[14] = new ModelRendererTurbo(this, 745, 33, textureX, textureY); // Box 23
		bodyModel[15] = new ModelRendererTurbo(this, 825, 33, textureX, textureY); // Box 24
		bodyModel[16] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 25
		bodyModel[17] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 26
		bodyModel[18] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 27
		bodyModel[19] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 28
		bodyModel[20] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 0
		bodyModel[21] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 1
		bodyModel[22] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 2
		bodyModel[23] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 3
		bodyModel[24] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 4
		bodyModel[25] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 5
		bodyModel[26] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 6
		bodyModel[27] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Box 16
		bodyModel[28] = new ModelRendererTurbo(this, 969, 17, textureX, textureY); // Box 18
		bodyModel[29] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 19
		bodyModel[30] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 20
		bodyModel[31] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Box 21
		bodyModel[32] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 24
		bodyModel[33] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 27
		bodyModel[34] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 29
		bodyModel[35] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Box 32
		bodyModel[36] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Box 33
		bodyModel[37] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Box 34
		bodyModel[38] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 35
		bodyModel[39] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Box 51
		bodyModel[40] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 52
		bodyModel[41] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Box 53
		bodyModel[42] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 54
		bodyModel[43] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Box 55
		bodyModel[44] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 56
		bodyModel[45] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 57
		bodyModel[46] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 59
		bodyModel[47] = new ModelRendererTurbo(this, 945, 17, textureX, textureY); // Box 60
		bodyModel[48] = new ModelRendererTurbo(this, 945, 25, textureX, textureY); // Box 61
		bodyModel[49] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 102
		bodyModel[50] = new ModelRendererTurbo(this, 721, 41, textureX, textureY); // Box 103
		bodyModel[51] = new ModelRendererTurbo(this, 889, 57, textureX, textureY); // Box 1
		bodyModel[52] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 2
		bodyModel[53] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 4

		bodyModel[0].addShapeBox(0F, 0F, 0F, 25, 8, 24, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-35F, -33F, -13F);

		bodyModel[1].addBox(0F, 0F, 0F, 25, 18, 24, 0F); // Box 1
		bodyModel[1].setRotationPoint(-35F, -25F, -13F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 25, 5, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 2
		bodyModel[2].setRotationPoint(-35F, -7F, -13F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 31, 13, 24, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 5F, -2F, 0F, 5F, -5F, 0F, 5F, -5F, 0F, 5F, -2F); // Box 5
		bodyModel[3].setRotationPoint(-10F, -25F, -13F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 46, 8, 22, 0F, 0F, -1F, -5F, 0F, -5F, -8F, 0F, -5F, -8F, 0F, -1F, -5F, 0F, 3F, -2F, 0F, 3F, -5F, 0F, 3F, -5F, 0F, 3F, -2F); // Box 6
		bodyModel[4].setRotationPoint(21F, -33F, -12F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 43, 5, 24, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, -4F); // Box 13
		bodyModel[5].setRotationPoint(-78F, -7F, -13F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 43, 4, 24, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 15
		bodyModel[6].setRotationPoint(-78F, -11F, -13F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 43, 8, 5, 0F, 0F, -4F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[7].setRotationPoint(-78F, -33F, -13F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 43, 8, 5, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -4F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 17
		bodyModel[8].setRotationPoint(-78F, -33F, 6F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 4, 14, 24, 0F, 0F, 0F, -1F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -1F); // Box 18
		bodyModel[9].setRotationPoint(-78F, -25F, -13F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 39, 14, 3, 0F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[10].setRotationPoint(-74F, -25F, -13F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 39, 14, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F); // Box 20
		bodyModel[11].setRotationPoint(-74F, -25F, 8F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 4, 4, 16, 0F, 0F, 0F, -1F, 0F, 0.4F, -1F, 0F, 0.4F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -1F); // Box 21
		bodyModel[12].setRotationPoint(-78F, -29F, -9F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 16, 4, 22, 0F, 0F, 2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -3F, 0F, -3F, -6F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, -6F); // Box 22
		bodyModel[13].setRotationPoint(-94F, -7F, -12F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 16, 18, 22, 0F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F); // Box 23
		bodyModel[14].setRotationPoint(-94F, -25F, -12F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 16, 8, 22, 0F, 0F, -3F, -7F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -3F, -7F, 0F, 0F, -3F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -3F); // Box 24
		bodyModel[15].setRotationPoint(-94F, -29F, -12F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 5, 3, 16, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -6F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, -6F); // Box 25
		bodyModel[16].setRotationPoint(-99F, -9F, -9F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 5, 13, 4, 0F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[17].setRotationPoint(-99F, -22F, -9F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 5, 13, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 27
		bodyModel[18].setRotationPoint(-99F, -22F, 3F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 5, 4, 16, 0F, 0F, -2F, -7F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, -7F, 0F, 0F, -3F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -3F); // Box 28
		bodyModel[19].setRotationPoint(-99F, -26F, -9F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 0
		bodyModel[20].setRotationPoint(-99F, -22F, -1.5F);

		bodyModel[21].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 1
		bodyModel[21].setRotationPoint(-98F, -17F, -1.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[22].setRotationPoint(-99F, -14F, -1.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[23].setRotationPoint(-99F, -22F, 2F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 4
		bodyModel[24].setRotationPoint(-99F, -22F, -5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[25].setRotationPoint(-99F, -10F, -5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[26].setRotationPoint(-99F, -10F, 2F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 9, 2, 14, 0F, 0F, -3F, -4F, -1F, 0F, -2.9F, -1F, 0F, -2.9F, 0F, -3F, -4F, 0F, 1F, -4F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 1F, -4F); // Box 16
		bodyModel[27].setRotationPoint(-74F, -32F, -8F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 9, 19, 16, 0F, 0F, -0.6F, -1F, 0F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, -0.6F, -1F, 0F, 1F, -1F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 1F, -1F); // Box 18
		bodyModel[28].setRotationPoint(-74F, -30F, -9F);

		bodyModel[29].addBox(0F, 0F, 0F, 17, 3, 13, 0F); // Box 19
		bodyModel[29].setRotationPoint(-61F, -14F, -7.5F);

		bodyModel[30].addBox(0F, 0F, 0F, 3, 22, 13, 0F); // Box 20
		bodyModel[30].setRotationPoint(-47F, -33F, -7.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 9, 3, 14, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[31].setRotationPoint(-44F, -33F, -8F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[32].setRotationPoint(-65F, -34F, 4F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 27
		bodyModel[33].setRotationPoint(-65F, -34F, -8F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[34].setRotationPoint(-63F, -37F, -5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F); // Box 32
		bodyModel[35].setRotationPoint(-64F, -36F, -7F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[36].setRotationPoint(-64F, -36F, 2F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[37].setRotationPoint(-66F, -32F, 5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 35
		bodyModel[38].setRotationPoint(-66F, -32F, -9F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 51
		bodyModel[39].setRotationPoint(-49F, -34F, -9F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 52
		bodyModel[40].setRotationPoint(-49F, -35F, -8F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 53
		bodyModel[41].setRotationPoint(-49F, -36F, -7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[42].setRotationPoint(-49F, -34F, 5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[43].setRotationPoint(-49F, -35F, 4F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[44].setRotationPoint(-49F, -36F, 3F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[45].setRotationPoint(-49F, -37F, -6F);

		bodyModel[46].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Box 59
		bodyModel[46].setRotationPoint(-108F, -6F, -1.5F);

		bodyModel[47].addBox(0F, 0F, 0F, 14, 1, 1, 0F); // Box 60
		bodyModel[47].setRotationPoint(-102F, -6F, 3.5F);

		bodyModel[48].addBox(0F, 0F, 0F, 14, 1, 1, 0F); // Box 61
		bodyModel[48].setRotationPoint(-102F, -6F, -6.5F);

		bodyModel[49].addBox(0F, 0F, 0F, 2, 9, 2, 0F); // Box 102
		bodyModel[49].setRotationPoint(-63F, -20F, -1F);

		bodyModel[50].addBox(0F, 0F, 0F, 2, 2, 8, 0F); // Box 103
		bodyModel[50].setRotationPoint(-63F, -20F, -4F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 31, 5, 18, 0F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, 0F); // Box 1
		bodyModel[51].setRotationPoint(-10F, -7F, -10F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 46, 11, 20, 0F, 0F, 0F, -1F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, -3F, -1F, 0F, 7F, -3F, 0F, -2F, -8F, 0F, -2F, -8F, 0F, 7F, -3F); // Box 2
		bodyModel[52].setRotationPoint(21F, -25F, -11F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 31, 8, 24, 0F, 0F, 0F, -5F, 0F, -1F, -6F, 0F, -1F, -6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 4
		bodyModel[53].setRotationPoint(-10F, -33F, -13F);


		tailModel = new ModelRendererTurbo[3];
		tailModel[0] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 68
		tailModel[1] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 80
		tailModel[2] = new ModelRendererTurbo(this, 513, 57, textureX, textureY); // Box 82

		tailModel[0].addShapeBox(0F, 0F, 0F, 43, 32, 2, 0F, -36F, -1F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, -36F, -1F, 0F, 2F, 0F, 0F, -8F, 4F, 0F, -8F, 4F, 0F, 2F, 0F, 0F); // Box 68
		tailModel[0].setRotationPoint(31F, -64F, -2F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 26, 1, 24, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F); // Box 80
		tailModel[1].setRotationPoint(61F, -52F, 0F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 26, 1, 24, 0F, -18F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 82
		tailModel[2].setRotationPoint(61F, -52F, -26F);


		leftWingModel = new ModelRendererTurbo[1];
		leftWingModel[0] = new ModelRendererTurbo(this, 601, 81, textureX, textureY); // Box 3

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 64, 4, 91, 0F, -65F, 0F, -2F, 25F, 0F, -8F, -25F, -2F, 0F, 0F, -2F, 0F, -65F, -2F, -2F, 25F, -2F, -8F, -25F, 0F, 0F, 0F, 0F, 0F); // Box 3
		leftWingModel[0].setRotationPoint(-48F, -21F, -103F);


		rightWingModel = new ModelRendererTurbo[1];
		rightWingModel[0] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 77

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 64, 4, 91, 0F, 0F, -2F, 0F, -25F, -2F, 0F, 25F, 0F, -8F, -65F, 0F, -2F, 0F, 0F, 0F, -25F, 0F, 0F, 25F, -2F, -8F, -65F, -2F, -2F); // Box 77
		rightWingModel[0].setRotationPoint(-48F, -21F, 10F);


		bodyWheelModel = new ModelRendererTurbo[4];
		bodyWheelModel[0] = new ModelRendererTurbo(this, 905, 17, textureX, textureY); // Box 85
		bodyWheelModel[1] = new ModelRendererTurbo(this, 721, 33, textureX, textureY); // Box 86
		bodyWheelModel[2] = new ModelRendererTurbo(this, 745, 33, textureX, textureY); // Box 87
		bodyWheelModel[3] = new ModelRendererTurbo(this, 801, 33, textureX, textureY); // Box 88

		bodyWheelModel[0].addShapeBox(0F, 0F, 0F, 7, 5, 2, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyWheelModel[0].setRotationPoint(-76F, -3F, -2F);

		bodyWheelModel[1].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyWheelModel[1].setRotationPoint(-79F, 2F, -2F);

		bodyWheelModel[2].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 87
		bodyWheelModel[2].setRotationPoint(-79F, 7F, -2F);

		bodyWheelModel[3].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // Box 88
		bodyWheelModel[3].setRotationPoint(-79F, 5F, -2F);


		leftWingWheelModel = new ModelRendererTurbo[5];
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 96
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 945, 33, textureX, textureY); // Box 97
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 98
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 99
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 100

		leftWingWheelModel[0].addBox(0F, 0F, 0F, 2, 20, 2, 0F); // Box 96
		leftWingWheelModel[0].setRotationPoint(-16F, -18F, -17F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		leftWingWheelModel[1].setRotationPoint(-19F, 2F, -17F);

		leftWingWheelModel[2].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // Box 98
		leftWingWheelModel[2].setRotationPoint(-19F, 5F, -17F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 99
		leftWingWheelModel[3].setRotationPoint(-19F, 7F, -17F);

		leftWingWheelModel[4].addBox(0F, 0F, 0F, 8, 20, 2, 0F); // Box 100
		leftWingWheelModel[4].setRotationPoint(-19F, -18F, -19F);


		rightWingWheelModel = new ModelRendererTurbo[5];
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 825, 33, textureX, textureY); // Box 89
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 881, 33, textureX, textureY); // Box 90
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 905, 33, textureX, textureY); // Box 91
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 1009, 9, textureX, textureY); // Box 95
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 593, 57, textureX, textureY); // Box 101

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		rightWingWheelModel[0].setRotationPoint(-19F, 2F, 15F);

		rightWingWheelModel[1].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // Box 90
		rightWingWheelModel[1].setRotationPoint(-19F, 5F, 15F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 91
		rightWingWheelModel[2].setRotationPoint(-19F, 7F, 15F);

		rightWingWheelModel[3].addBox(0F, 0F, 0F, 2, 20, 2, 0F); // Box 95
		rightWingWheelModel[3].setRotationPoint(-16F, -18F, 15F);

		rightWingWheelModel[4].addBox(0F, 0F, 0F, 8, 20, 2, 0F); // Box 101
		rightWingWheelModel[4].setRotationPoint(-19F, -18F, 17F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}