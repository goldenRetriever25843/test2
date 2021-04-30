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

public class ModelZastava76 extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelZastava76() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[48];
		gunModel[0] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 4
		gunModel[1] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 9
		gunModel[2] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 10
		gunModel[3] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 11
		gunModel[4] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 13
		gunModel[5] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 14
		gunModel[6] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 15
		gunModel[7] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 16
		gunModel[8] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 17
		gunModel[9] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 28
		gunModel[10] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 29
		gunModel[11] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 30
		gunModel[12] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 32
		gunModel[13] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 36
		gunModel[14] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 37
		gunModel[15] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 38
		gunModel[16] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 39
		gunModel[17] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 41
		gunModel[18] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 42
		gunModel[19] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 43
		gunModel[20] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 44
		gunModel[21] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 45
		gunModel[22] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 46
		gunModel[23] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 47
		gunModel[24] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 48
		gunModel[25] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 49
		gunModel[26] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 50
		gunModel[27] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 51
		gunModel[28] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 63
		gunModel[29] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 64
		gunModel[30] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 65
		gunModel[31] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 66
		gunModel[32] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 67
		gunModel[33] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 68
		gunModel[34] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 69
		gunModel[35] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 70
		gunModel[36] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 71
		gunModel[37] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 72
		gunModel[38] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 73
		gunModel[39] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 74
		gunModel[40] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 75
		gunModel[41] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 76
		gunModel[42] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 77
		gunModel[43] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 78
		gunModel[44] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 79
		gunModel[45] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 80
		gunModel[46] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 81
		gunModel[47] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 83

		gunModel[0].addShapeBox(0F, 0F, 0F, 43, 9, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 4
		gunModel[0].setRotationPoint(-12F, -11F, 0F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 9
		gunModel[1].setRotationPoint(31F, -11F, 1F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		gunModel[2].setRotationPoint(33F, -12F, -1F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 24, 6, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Box 11
		gunModel[3].setRotationPoint(33F, -11F, -1F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 20, 4, 7, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		gunModel[4].setRotationPoint(37F, -16F, -1F);

		gunModel[5].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 14
		gunModel[5].setRotationPoint(43F, -12F, -1F);

		gunModel[6].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 15
		gunModel[6].setRotationPoint(50F, -12F, -1F);

		gunModel[7].addBox(0F, 0F, 0F, 1, 1, 7, 0F); // Box 16
		gunModel[7].setRotationPoint(56F, -12F, -1F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F, 0F, 0F, 2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0F, 1F); // Box 17
		gunModel[8].setRotationPoint(57F, -11F, 1F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 4, 4, 7, 0F, 0F, -1F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -1F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F); // Box 28
		gunModel[9].setRotationPoint(33F, -16F, -1F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 2, 4, 7, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 29
		gunModel[10].setRotationPoint(57F, -16F, -1F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 30
		gunModel[11].setRotationPoint(57F, -12F, -1F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F); // Box 32
		gunModel[12].setRotationPoint(59F, -15F, 1F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		gunModel[13].setRotationPoint(61F, -13F, 2F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 37
		gunModel[14].setRotationPoint(61F, -15F, 2F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		gunModel[15].setRotationPoint(61F, -14F, 1F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		gunModel[16].setRotationPoint(61F, -14F, 3F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F); // Box 41
		gunModel[17].setRotationPoint(73F, -15F, 1F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		gunModel[18].setRotationPoint(75F, -7F, 2F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		gunModel[19].setRotationPoint(104F, -16F, 2F);

		gunModel[20].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Box 44
		gunModel[20].setRotationPoint(108F, -16F, 2F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		gunModel[21].setRotationPoint(108F, -18F, 2F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		gunModel[22].setRotationPoint(108F, -16F, 0F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 47
		gunModel[23].setRotationPoint(108F, -16F, 3F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		gunModel[24].setRotationPoint(108F, -20F, 4F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		gunModel[25].setRotationPoint(108F, -20F, 0F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		gunModel[26].setRotationPoint(108F, -20F, 1F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 51
		gunModel[27].setRotationPoint(30F, -15F, 0F);

		gunModel[28].addBox(0F, 0F, 0F, 4, 4, 5, 0F); // Box 63
		gunModel[28].setRotationPoint(26F, -15F, 0F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 34, 3, 1, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		gunModel[29].setRotationPoint(-8F, -14F, 0F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 34, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		gunModel[30].setRotationPoint(-8F, -14F, 1F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 34, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		gunModel[31].setRotationPoint(-8F, -14F, 4F);

		gunModel[32].addBox(0F, 0F, 0F, 3, 5, 3, 0F); // Box 67
		gunModel[32].setRotationPoint(7F, -4F, 1F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		gunModel[33].setRotationPoint(8F, 0F, 2F);

		gunModel[34].addBox(0F, 0F, 0F, 1, 6, 3, 0F); // Box 69
		gunModel[34].setRotationPoint(6F, -4F, 1F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 70
		gunModel[35].setRotationPoint(-1F, 2F, 1F);

		gunModel[36].addBox(0F, 0F, 0F, 1, 5, 3, 0F); // Box 71
		gunModel[36].setRotationPoint(-1F, -3F, 1F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		gunModel[37].setRotationPoint(-12F, -14F, 1F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		gunModel[38].setRotationPoint(-12F, -14F, 4F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		gunModel[39].setRotationPoint(-12F, -14F, 0F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 75
		gunModel[40].setRotationPoint(1F, -3F, 2F);

		gunModel[41].addBox(0F, 0F, 0F, 11, 3, 5, 0F); // Box 76
		gunModel[41].setRotationPoint(-12F, -3F, 0F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 77
		gunModel[42].setRotationPoint(-12F, 0F, 0F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 9, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 78
		gunModel[43].setRotationPoint(-11F, 2F, 0F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 9, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 79
		gunModel[44].setRotationPoint(-13F, 5F, 0F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 9, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 80
		gunModel[45].setRotationPoint(-15F, 8F, 0F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 7, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 81
		gunModel[46].setRotationPoint(-14F, 11F, 0F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		gunModel[47].setRotationPoint(-17F, -11F, 0F);


		defaultBarrelModel = new ModelRendererTurbo[11];
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		defaultBarrelModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 1
		defaultBarrelModel[2] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 3
		defaultBarrelModel[3] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 6
		defaultBarrelModel[4] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 7
		defaultBarrelModel[5] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 12
		defaultBarrelModel[6] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 19
		defaultBarrelModel[7] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 20
		defaultBarrelModel[8] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 24
		defaultBarrelModel[9] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 25
		defaultBarrelModel[10] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 26

		defaultBarrelModel[0].addShapeBox(0F, 0F, 0F, 36, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		defaultBarrelModel[0].setRotationPoint(77F, -11F, 1F);

		defaultBarrelModel[1].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		defaultBarrelModel[1].setRotationPoint(113F, -11F, 1F);

		defaultBarrelModel[2].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 3
		defaultBarrelModel[2].setRotationPoint(118F, -10F, 1F);

		defaultBarrelModel[3].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 6
		defaultBarrelModel[3].setRotationPoint(113F, -9F, 1F);

		defaultBarrelModel[4].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 7
		defaultBarrelModel[4].setRotationPoint(118F, -10F, 3F);

		defaultBarrelModel[5].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 12
		defaultBarrelModel[5].setRotationPoint(104F, -8F, 2F);

		defaultBarrelModel[6].addShapeBox(0F, 0F, 0F, 36, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		defaultBarrelModel[6].setRotationPoint(77F, -10F, 1F);

		defaultBarrelModel[7].addShapeBox(0F, 0F, 0F, 36, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 20
		defaultBarrelModel[7].setRotationPoint(77F, -9F, 1F);

		defaultBarrelModel[8].addShapeBox(0F, 0F, 0F, 18, 1, 3, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 24
		defaultBarrelModel[8].setRotationPoint(59F, -11F, 1F);

		defaultBarrelModel[9].addShapeBox(0F, 0F, 0F, 18, 1, 3, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 25
		defaultBarrelModel[9].setRotationPoint(59F, -10F, 1F);

		defaultBarrelModel[10].addShapeBox(0F, 0F, 0F, 18, 1, 3, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 26
		defaultBarrelModel[10].setRotationPoint(59F, -9F, 1F);


		defaultScopeModel = new ModelRendererTurbo[6];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 52
		defaultScopeModel[1] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 53
		defaultScopeModel[2] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 54
		defaultScopeModel[3] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 55
		defaultScopeModel[4] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 56
		defaultScopeModel[5] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 57

		defaultScopeModel[0].addBox(0F, 0F, 0F, 7, 2, 5, 0F); // Box 52
		defaultScopeModel[0].setRotationPoint(26F, -17F, 0F);

		defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		defaultScopeModel[1].setRotationPoint(26F, -19F, 0F);

		defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		defaultScopeModel[2].setRotationPoint(26F, -19F, 4F);

		defaultScopeModel[3].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 55
		defaultScopeModel[3].setRotationPoint(29F, -18F, 1F);

		defaultScopeModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		defaultScopeModel[4].setRotationPoint(29F, -19F, 1F);

		defaultScopeModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		defaultScopeModel[5].setRotationPoint(29F, -19F, 3F);


		defaultStockModel = new ModelRendererTurbo[4];
		defaultStockModel[0] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 82
		defaultStockModel[1] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 84
		defaultStockModel[2] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 85
		defaultStockModel[3] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 87

		defaultStockModel[0].addShapeBox(0F, 0F, 0F, 42, 7, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 82
		defaultStockModel[0].setRotationPoint(-54F, -9F, 0F);

		defaultStockModel[1].addShapeBox(0F, 0F, 0F, 36, 1, 5, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		defaultStockModel[1].setRotationPoint(-53F, -2F, 0F);

		defaultStockModel[2].addShapeBox(0F, 0F, 0F, 33, 3, 5, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 85
		defaultStockModel[2].setRotationPoint(-53F, -1F, 0F);

		defaultStockModel[3].addShapeBox(0F, 0F, 0F, 29, 7, 5, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, 0F, -25F, 0F, 0F, 0F, 0F, 0F); // Box 87
		defaultStockModel[3].setRotationPoint(-52F, 2F, 0F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 8

		ammoModel[0].addShapeBox(0F, 0F, 0F, 14, 7, 3, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 8
		ammoModel[0].setRotationPoint(10F, -3F, 1F);


		slideModel = new ModelRendererTurbo[1];
		slideModel[0] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 88

		slideModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		slideModel[0].setRotationPoint(20F, -9F, -5F);



		translateAll(0F, -4F, -2.5F);
		
		animationType = EnumAnimationType.BOTTOM_CLIP;


		flipAll();
	}
}