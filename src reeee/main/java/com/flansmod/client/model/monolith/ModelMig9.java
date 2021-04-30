//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMig9 extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelMig9() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[62];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 849, 25, textureX, textureY); // Box 13
		bodyModel[6] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 15
		bodyModel[7] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Box 16
		bodyModel[8] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 17
		bodyModel[9] = new ModelRendererTurbo(this, 649, 33, textureX, textureY); // Box 18
		bodyModel[10] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 19
		bodyModel[11] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 20
		bodyModel[12] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 21
		bodyModel[13] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 22
		bodyModel[14] = new ModelRendererTurbo(this, 713, 41, textureX, textureY); // Box 23
		bodyModel[15] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 24
		bodyModel[16] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 25
		bodyModel[17] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 26
		bodyModel[18] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 27
		bodyModel[19] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 28
		bodyModel[20] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 0
		bodyModel[21] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 1
		bodyModel[22] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 2
		bodyModel[23] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 3
		bodyModel[24] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 4
		bodyModel[25] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 5
		bodyModel[26] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 6
		bodyModel[27] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 7
		bodyModel[28] = new ModelRendererTurbo(this, 969, 17, textureX, textureY); // Box 8
		bodyModel[29] = new ModelRendererTurbo(this, 689, 33, textureX, textureY); // Box 9
		bodyModel[30] = new ModelRendererTurbo(this, 969, 33, textureX, textureY); // Box 10
		bodyModel[31] = new ModelRendererTurbo(this, 561, 41, textureX, textureY); // Box 11
		bodyModel[32] = new ModelRendererTurbo(this, 609, 41, textureX, textureY); // Box 12
		bodyModel[33] = new ModelRendererTurbo(this, 777, 41, textureX, textureY); // Box 13
		bodyModel[34] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 14
		bodyModel[35] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 16
		bodyModel[36] = new ModelRendererTurbo(this, 561, 57, textureX, textureY); // Box 18
		bodyModel[37] = new ModelRendererTurbo(this, 913, 57, textureX, textureY); // Box 19
		bodyModel[38] = new ModelRendererTurbo(this, 985, 49, textureX, textureY); // Box 20
		bodyModel[39] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 21
		bodyModel[40] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 24
		bodyModel[41] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 27
		bodyModel[42] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 29
		bodyModel[43] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Box 32
		bodyModel[44] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // Box 33
		bodyModel[45] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 34
		bodyModel[46] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 35
		bodyModel[47] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Box 51
		bodyModel[48] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 52
		bodyModel[49] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 53
		bodyModel[50] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Box 54
		bodyModel[51] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 55
		bodyModel[52] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 56
		bodyModel[53] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 57
		bodyModel[54] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 59
		bodyModel[55] = new ModelRendererTurbo(this, 937, 17, textureX, textureY); // Box 60
		bodyModel[56] = new ModelRendererTurbo(this, 817, 41, textureX, textureY); // Box 61
		bodyModel[57] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 62
		bodyModel[58] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 64
		bodyModel[59] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 84
		bodyModel[60] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 102
		bodyModel[61] = new ModelRendererTurbo(this, 729, 89, textureX, textureY); // Box 103

		bodyModel[0].addShapeBox(0F, 0F, 0F, 25, 8, 26, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-35F, -33F, -13F);

		bodyModel[1].addBox(0F, 0F, 0F, 25, 18, 26, 0F); // Box 1
		bodyModel[1].setRotationPoint(-35F, -25F, -13F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 25, 5, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 2
		bodyModel[2].setRotationPoint(-35F, -7F, -13F);

		bodyModel[3].addBox(0F, 0F, 0F, 10, 13, 26, 0F); // Box 4
		bodyModel[3].setRotationPoint(-10F, -25F, -13F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 39, 13, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -1F, 0F, -7F, -1F, 0F, 0F, 0F); // Box 5
		bodyModel[4].setRotationPoint(0F, -25F, -13F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 43, 5, 26, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, -4F); // Box 13
		bodyModel[5].setRotationPoint(-78F, -7F, -13F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 43, 4, 26, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 15
		bodyModel[6].setRotationPoint(-78F, -11F, -13F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 43, 8, 5, 0F, 0F, -4F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[7].setRotationPoint(-78F, -33F, -13F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 43, 8, 5, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 17
		bodyModel[8].setRotationPoint(-78F, -33F, 8F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 4, 14, 26, 0F, 0F, 0F, -1F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -1F); // Box 18
		bodyModel[9].setRotationPoint(-78F, -25F, -13F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 39, 14, 5, 0F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[10].setRotationPoint(-74F, -25F, -13F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 39, 14, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F); // Box 20
		bodyModel[11].setRotationPoint(-74F, -25F, 8F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 4, 4, 18, 0F, 0F, 0F, -1F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -1F); // Box 21
		bodyModel[12].setRotationPoint(-78F, -29F, -9F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 16, 4, 24, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -6F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, -6F); // Box 22
		bodyModel[13].setRotationPoint(-94F, -7F, -12F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 16, 18, 24, 0F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 23
		bodyModel[14].setRotationPoint(-94F, -25F, -12F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 16, 8, 24, 0F, 0F, -3F, -7F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -3F, -7F, 0F, 0F, -3F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -3F); // Box 24
		bodyModel[15].setRotationPoint(-94F, -29F, -12F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 5, 3, 18, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -6F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, -6F); // Box 25
		bodyModel[16].setRotationPoint(-99F, -7F, -9F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 5, 15, 4, 0F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[17].setRotationPoint(-99F, -22F, -9F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 5, 15, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 27
		bodyModel[18].setRotationPoint(-99F, -22F, 5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 5, 4, 18, 0F, 0F, -2F, -7F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, -7F, 0F, 0F, -3F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -3F); // Box 28
		bodyModel[19].setRotationPoint(-99F, -26F, -9F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 0
		bodyModel[20].setRotationPoint(-99F, -22F, -0.5F);

		bodyModel[21].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 1
		bodyModel[21].setRotationPoint(-98F, -17F, -0.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[22].setRotationPoint(-99F, -12F, -0.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[23].setRotationPoint(-99F, -22F, 3F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 4
		bodyModel[24].setRotationPoint(-99F, -22F, -5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[25].setRotationPoint(-99F, -9F, -5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[26].setRotationPoint(-99F, -9F, 3F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 12, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 7
		bodyModel[27].setRotationPoint(-10F, -7F, -12F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 12, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 8
		bodyModel[28].setRotationPoint(-10F, -7F, 2F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 12, 4, 10, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[29].setRotationPoint(-10F, -12F, 2F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 12, 4, 10, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[30].setRotationPoint(-10F, -12F, -12F);

		bodyModel[31].addBox(0F, 0F, 0F, 12, 1, 10, 0F); // Box 11
		bodyModel[31].setRotationPoint(-10F, -8F, -12F);

		bodyModel[32].addBox(0F, 0F, 0F, 12, 1, 10, 0F); // Box 12
		bodyModel[32].setRotationPoint(-10F, -8F, 2F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 16, 11, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[33].setRotationPoint(-10F, -13F, -1F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 33, 12, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[34].setRotationPoint(6F, -19F, -1F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 9, 2, 16, 0F, 0F, -3F, -4F, -1F, 0F, -2.9F, -1F, 0F, -2.9F, 0F, -3F, -4F, 0F, 1F, -4F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 1F, -4F); // Box 16
		bodyModel[35].setRotationPoint(-74F, -32F, -8F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 9, 19, 18, 0F, 0F, -1F, -1F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -1F, -1F, 0F, 1F, -1F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 1F, -1F); // Box 18
		bodyModel[36].setRotationPoint(-74F, -30F, -9F);

		bodyModel[37].addBox(0F, 0F, 0F, 17, 3, 15, 0F); // Box 19
		bodyModel[37].setRotationPoint(-61F, -14F, -7.5F);

		bodyModel[38].addBox(0F, 0F, 0F, 3, 22, 15, 0F); // Box 20
		bodyModel[38].setRotationPoint(-47F, -33F, -7.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 9, 3, 18, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[39].setRotationPoint(-44F, -33F, -9F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[40].setRotationPoint(-65F, -34F, 5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 27
		bodyModel[41].setRotationPoint(-65F, -34F, -7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[42].setRotationPoint(-63F, -37F, -4F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F); // Box 32
		bodyModel[43].setRotationPoint(-64F, -36F, -6F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[44].setRotationPoint(-64F, -36F, 3F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[45].setRotationPoint(-66F, -32F, 6F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 35
		bodyModel[46].setRotationPoint(-66F, -32F, -8F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 51
		bodyModel[47].setRotationPoint(-49F, -34F, -9F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 52
		bodyModel[48].setRotationPoint(-49F, -35F, -8F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 53
		bodyModel[49].setRotationPoint(-49F, -36F, -7F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[50].setRotationPoint(-49F, -34F, 7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[51].setRotationPoint(-49F, -35F, 6F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[52].setRotationPoint(-49F, -36F, 5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[53].setRotationPoint(-49F, -37F, -6F);

		bodyModel[54].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Box 59
		bodyModel[54].setRotationPoint(-114F, -16.5F, -0.5F);

		bodyModel[55].addBox(0F, 0F, 0F, 14, 1, 1, 0F); // Box 60
		bodyModel[55].setRotationPoint(-108F, -8.5F, 4.5F);

		bodyModel[56].addBox(0F, 0F, 0F, 14, 1, 1, 0F); // Box 61
		bodyModel[56].setRotationPoint(-108F, -8.5F, -5.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 6, 8, 2, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[57].setRotationPoint(-44F, -38.5F, -1F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 49, 8, 26, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[58].setRotationPoint(-10F, -33F, -13F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[59].setRotationPoint(-58F, -20F, 92F);

		bodyModel[60].addBox(0F, 0F, 0F, 2, 9, 2, 0F); // Box 102
		bodyModel[60].setRotationPoint(-63F, -20F, -1F);

		bodyModel[61].addBox(0F, 0F, 0F, 2, 2, 10, 0F); // Box 103
		bodyModel[61].setRotationPoint(-63F, -20F, -5F);


		tailModel = new ModelRendererTurbo[17];
		tailModel[0] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Box 6
		tailModel[1] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Box 7
		tailModel[2] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Box 8
		tailModel[3] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Box 9
		tailModel[4] = new ModelRendererTurbo(this, 801, 57, textureX, textureY); // Box 15
		tailModel[5] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 63
		tailModel[6] = new ModelRendererTurbo(this, 689, 49, textureX, textureY); // Box 66
		tailModel[7] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 68
		tailModel[8] = new ModelRendererTurbo(this, 617, 57, textureX, textureY); // Box 69
		tailModel[9] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 70
		tailModel[10] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 71
		tailModel[11] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 72
		tailModel[12] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 73
		tailModel[13] = new ModelRendererTurbo(this, 881, 81, textureX, textureY); // Box 80
		tailModel[14] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 81
		tailModel[15] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 82
		tailModel[16] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 83

		tailModel[0].addShapeBox(0F, 0F, 0F, 46, 8, 26, 0F, 0F, 0F, -4F, 0F, -1F, -8F, 0F, -1F, -8F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 6
		tailModel[0].setRotationPoint(39F, -33F, -13F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 31, 7, 18, 0F, 0F, 0F, -4F, 0F, -3F, -8F, 0F, -3F, -8F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -3F, -8F, 0F, -3F, -8F, 0F, 0F, 0F); // Box 7
		tailModel[1].setRotationPoint(85F, -32F, -9F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 46, 6, 26, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -5F, -5F, 0F, -5F, -5F, 0F, 0F, -1F); // Box 8
		tailModel[2].setRotationPoint(39F, -25F, -13F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 23, 1, 18, 0F, 0F, 0F, 0F, 0F, 3F, -6.5F, 0F, 3F, -6.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, -6.5F, 0F, -4F, -6.5F, 0F, 0F, -1F); // Box 9
		tailModel[3].setRotationPoint(85F, -25F, -9F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 60, 9, 2, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F); // Box 15
		tailModel[4].setRotationPoint(39F, -25F, -1F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 130, 1, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		tailModel[5].setRotationPoint(-39F, -39F, -1F);
		tailModel[5].rotateAngleZ = 0.17453293F;

		tailModel[6].addShapeBox(0F, 0F, 0F, 18, 6, 2, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		tailModel[6].setRotationPoint(40F, -38F, -1F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 34, 27, 2, 0F, -34F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -34F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		tailModel[7].setRotationPoint(58F, -65F, -1F);

		tailModel[8].addBox(0F, 0F, 0F, 5, 27, 2, 0F); // Box 69
		tailModel[8].setRotationPoint(92F, -65F, -1F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 14, 19, 2, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		tailModel[9].setRotationPoint(97F, -65F, -1F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 14, 11, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		tailModel[10].setRotationPoint(97F, -46F, -1F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 14, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 72
		tailModel[11].setRotationPoint(97F, -35F, -1F);

		tailModel[12].addBox(0F, 0F, 0F, 39, 8, 2, 0F); // Box 73
		tailModel[12].setRotationPoint(58F, -38F, -1F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 27, 1, 38, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, 0F); // Box 80
		tailModel[13].setRotationPoint(70F, -40F, 1F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 9, 1, 38, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, 0F, -9F, 0F, 0F, 0F); // Box 81
		tailModel[14].setRotationPoint(97F, -40F, 1F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 27, 1, 38, 0F, -22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		tailModel[15].setRotationPoint(70F, -40F, -39F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 9, 1, 38, 0F, 0F, 0F, 0F, -4F, 0F, -9F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -9F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 83
		tailModel[16].setRotationPoint(97F, -40F, -39F);


		leftWingModel = new ModelRendererTurbo[3];
		leftWingModel[0] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 74
		leftWingModel[1] = new ModelRendererTurbo(this, 705, 73, textureX, textureY); // Box 75
		leftWingModel[2] = new ModelRendererTurbo(this, 857, 73, textureX, textureY); // Box 76

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 25, 4, 93, 0F, 0F, 0F, 0F, -21F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -21F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		leftWingModel[0].setRotationPoint(-19F, -21F, -105F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 29, 4, 93, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -9F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		leftWingModel[1].setRotationPoint(-48F, -21F, -105F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 24, 2, 5, 0F, -4F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		leftWingModel[2].setRotationPoint(-39F, -21F, -110F);


		rightWingModel = new ModelRendererTurbo[3];
		rightWingModel[0] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 77
		rightWingModel[1] = new ModelRendererTurbo(this, 561, 81, textureX, textureY); // Box 78
		rightWingModel[2] = new ModelRendererTurbo(this, 857, 81, textureX, textureY); // Box 79

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 29, 4, 93, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -9F, -2F, 0F); // Box 77
		rightWingModel[0].setRotationPoint(-48F, -21F, 12F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 25, 4, 93, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, -2F, 0F, 0F, -2F, 0F); // Box 78
		rightWingModel[1].setRotationPoint(-19F, -21F, 12F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 24, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -4F, 0F, 0F); // Box 79
		rightWingModel[2].setRotationPoint(-39F, -21F, 105F);


		bodyWheelModel = new ModelRendererTurbo[4];
		bodyWheelModel[0] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 85
		bodyWheelModel[1] = new ModelRendererTurbo(this, 649, 41, textureX, textureY); // Box 86
		bodyWheelModel[2] = new ModelRendererTurbo(this, 849, 41, textureX, textureY); // Box 87
		bodyWheelModel[3] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 88

		bodyWheelModel[0].addShapeBox(0F, 0F, 0F, 7, 5, 2, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyWheelModel[0].setRotationPoint(-76F, -3F, -1F);

		bodyWheelModel[1].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyWheelModel[1].setRotationPoint(-79F, 2F, -1F);

		bodyWheelModel[2].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 87
		bodyWheelModel[2].setRotationPoint(-79F, 7F, -1F);

		bodyWheelModel[3].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // Box 88
		bodyWheelModel[3].setRotationPoint(-79F, 5F, -1F);


		leftWingWheelModel = new ModelRendererTurbo[5];
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 96
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 969, 57, textureX, textureY); // Box 97
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 98
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 633, 81, textureX, textureY); // Box 99
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 617, 89, textureX, textureY); // Box 100

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
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 817, 49, textureX, textureY); // Box 89
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 90
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 777, 57, textureX, textureY); // Box 91
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 633, 57, textureX, textureY); // Box 95
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 705, 89, textureX, textureY); // Box 101

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