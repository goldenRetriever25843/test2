//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.2.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelK12 extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelK12()
	{
		gunModel = new ModelRendererTurbo[69];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 6
		gunModel[7] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 7
		gunModel[8] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 8
		gunModel[9] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 9
		gunModel[10] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 10
		gunModel[11] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 11
		gunModel[12] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 12
		gunModel[13] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 13
		gunModel[14] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 14
		gunModel[15] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 15
		gunModel[16] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 16
		gunModel[17] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 17
		gunModel[18] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 18
		gunModel[19] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 19
		gunModel[20] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 20
		gunModel[21] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 21
		gunModel[22] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 22
		gunModel[23] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 23
		gunModel[24] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 24
		gunModel[25] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 25
		gunModel[26] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 26
		gunModel[27] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 27
		gunModel[28] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 28
		gunModel[29] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 29
		gunModel[30] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 30
		gunModel[31] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 31
		gunModel[32] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 32
		gunModel[33] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 33
		gunModel[34] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 34
		gunModel[35] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 35
		gunModel[36] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 36
		gunModel[37] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 37
		gunModel[38] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 38
		gunModel[39] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 39
		gunModel[40] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 40
		gunModel[41] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 41
		gunModel[42] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 42
		gunModel[43] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 43
		gunModel[44] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 44
		gunModel[45] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 47
		gunModel[46] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 48
		gunModel[47] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 49
		gunModel[48] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 50
		gunModel[49] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 51
		gunModel[50] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 52
		gunModel[51] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 53
		gunModel[52] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 54
		gunModel[53] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 55
		gunModel[54] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 56
		gunModel[55] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 57
		gunModel[56] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 58
		gunModel[57] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 95
		gunModel[58] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 96
		gunModel[59] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 111
		gunModel[60] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 112
		gunModel[61] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 113
		gunModel[62] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 114
		gunModel[63] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 115
		gunModel[64] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 116
		gunModel[65] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 117
		gunModel[66] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 118
		gunModel[67] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 119
		gunModel[68] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 120

		gunModel[0].addBox(0F, 0F, 0F, 48, 3, 8, 0F); // Box 0
		gunModel[0].setRotationPoint(-19F, -8F, -4F);

		gunModel[1].addBox(0F, 0F, 0F, 26, 3, 8, 0F); // Box 1
		gunModel[1].setRotationPoint(-19F, -5F, -4F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 7, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		gunModel[2].setRotationPoint(-7F, -2F, -4F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 7, 8, 8, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 4F, 0F, 0F, -5F, 3F, 0F, -5F, 3F, 0F, 4F, 0F, 0F); // Box 3
		gunModel[3].setRotationPoint(-7F, 1F, -4F);

		gunModel[4].addBox(0F, 0F, 0F, 4, 8, 8, 0F); // Box 4
		gunModel[4].setRotationPoint(-19F, -16F, -4F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 49, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[5].setRotationPoint(-19F, -15F, -3F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 22, 4, 9, 0F,0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		gunModel[6].setRotationPoint(29F, -7F, -4.5F);

		gunModel[7].addBox(0F, 0F, 0F, 41, 2, 9, 0F); // Box 7
		gunModel[7].setRotationPoint(29F, -9F, -4.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 38, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 8
		gunModel[8].setRotationPoint(29F, -13F, -4.5F);

		gunModel[9].addBox(0F, 0F, 0F, 41, 4, 4, 0F); // Box 9
		gunModel[9].setRotationPoint(43F, -10F, -2F);

		gunModel[10].addBox(0F, 0F, 0F, 72, 3, 3, 0F); // Box 10
		gunModel[10].setRotationPoint(29F, -14.5F, -1.5F);

		gunModel[11].addBox(0F, 0F, 0F, 5, 5, 2, 0F); // Box 11
		gunModel[11].setRotationPoint(76F, -14.8F, -1F);

		gunModel[12].addBox(0F, 0F, 0F, 5, 4, 4, 0F); // Box 12
		gunModel[12].setRotationPoint(101F, -15F, -2F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 6, 4, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 13
		gunModel[13].setRotationPoint(106F, -15F, -2F);

		gunModel[14].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Box 14
		gunModel[14].setRotationPoint(78F, -16.8F, -0.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 15
		gunModel[15].setRotationPoint(77F, -22.8F, -0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -1.3F, -1.3F, 0F, -1.3F, -1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 16
		gunModel[16].setRotationPoint(77F, -24.8F, 0F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1.3F, -1.3F, 0F, -1.3F, -1.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		gunModel[17].setRotationPoint(77F, -26.8F, 0F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, -1.3F, 0F, -1.3F, -1.3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		gunModel[18].setRotationPoint(77F, -24.8F, -2F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, -1.3F, 0F, -1.3F, -1.3F); // Box 19
		gunModel[19].setRotationPoint(77F, -26.8F, -2F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 39, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		gunModel[20].setRotationPoint(-15F, -18F, -3.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		gunModel[21].setRotationPoint(24F, -17.8F, -2.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 33, 2, 5, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 22
		gunModel[22].setRotationPoint(-13F, -19.2F, -2.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 23
		gunModel[23].setRotationPoint(-12.5F, -19.7F, -1.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 24
		gunModel[24].setRotationPoint(-11F, -19.7F, -1.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 25
		gunModel[25].setRotationPoint(-9.5F, -19.7F, -1.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 26
		gunModel[26].setRotationPoint(-8F, -19.7F, -1.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 27
		gunModel[27].setRotationPoint(-3.5F, -19.7F, -1.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 28
		gunModel[28].setRotationPoint(-2F, -19.7F, -1.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 29
		gunModel[29].setRotationPoint(-6.5F, -19.7F, -1.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 30
		gunModel[30].setRotationPoint(-5F, -19.7F, -1.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 31
		gunModel[31].setRotationPoint(4F, -19.7F, -1.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 32
		gunModel[32].setRotationPoint(-0.5F, -19.7F, -1.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 33
		gunModel[33].setRotationPoint(1F, -19.7F, -1.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 34
		gunModel[34].setRotationPoint(2.5F, -19.7F, -1.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 35
		gunModel[35].setRotationPoint(5.5F, -19.7F, -1.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 36
		gunModel[36].setRotationPoint(7F, -19.7F, -1.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 37
		gunModel[37].setRotationPoint(8.5F, -19.7F, -1.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 38
		gunModel[38].setRotationPoint(10F, -19.7F, -1.5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 39
		gunModel[39].setRotationPoint(16F, -19.7F, -1.5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 40
		gunModel[40].setRotationPoint(11.5F, -19.7F, -1.5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 41
		gunModel[41].setRotationPoint(13F, -19.7F, -1.5F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 42
		gunModel[42].setRotationPoint(14.5F, -19.7F, -1.5F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 43
		gunModel[43].setRotationPoint(17.5F, -19.7F, -1.5F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 44
		gunModel[44].setRotationPoint(19F, -19.7F, -1.5F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 47
		gunModel[45].setRotationPoint(21F, -21.2F, -2F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		gunModel[46].setRotationPoint(21.5F, -23.2F, -0.5F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -1.8F, -1.8F, 0F, -1.8F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 49
		gunModel[47].setRotationPoint(21.5F, -26.2F, 0F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1.8F, -1.8F, 0F, -1.8F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		gunModel[48].setRotationPoint(21.5F, -29.2F, 0F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.8F, -1.8F, 0F, -1.8F, -1.8F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		gunModel[49].setRotationPoint(21.5F, -26.2F, -3F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.8F, -1.8F, 0F, -1.8F, -1.8F); // Box 52
		gunModel[50].setRotationPoint(21.5F, -29.2F, -3F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 53
		gunModel[51].setRotationPoint(21.5F, -29.1F, -0.5F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 54
		gunModel[52].setRotationPoint(21.5F, -26.6F, -3F);

		gunModel[53].addBox(0F, 0F, 0F, 11, 1, 6, 0F); // Box 55
		gunModel[53].setRotationPoint(12F, 0F, -3F);

		gunModel[54].addBox(0F, 0F, 0F, 11, 4, 1, 0F); // Box 56
		gunModel[54].setRotationPoint(12F, -4F, -3F);

		gunModel[55].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 57
		gunModel[55].setRotationPoint(13F, -5F, -3F);

		gunModel[56].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 58
		gunModel[56].setRotationPoint(21F, -5F, -3F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 95
		gunModel[57].setRotationPoint(5.8F, -2F, -3F);
		gunModel[57].rotateAngleZ = 0.10471976F;

		gunModel[58].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 96
		gunModel[58].setRotationPoint(-0.2F, 1.5F, -3F);
		gunModel[58].rotateAngleZ = 0.01745329F;

		gunModel[59].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 111
		gunModel[59].setRotationPoint(33F, -17.2F, -1F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		gunModel[60].setRotationPoint(44F, -17.2F, -0.5F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		gunModel[61].setRotationPoint(37F, -17.2F, -0.5F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 114
		gunModel[62].setRotationPoint(66F, -7.2F, -1F);

		gunModel[63].addShapeBox(0F, 0F, -1F, 2, 6, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 115
		gunModel[63].setRotationPoint(70F, -3.2F, 0F);
		gunModel[63].rotateAngleX = 0.38397244F;
		gunModel[63].rotateAngleZ = 0.08726646F;

		gunModel[64].addShapeBox(0.5F, 6F, -1F, 2, 21, 2, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 116
		gunModel[64].setRotationPoint(70F, -3.2F, 0F);
		gunModel[64].rotateAngleX = 0.38397244F;
		gunModel[64].rotateAngleZ = 0.08726646F;

		gunModel[65].addShapeBox(-0.3F, 27F, -1F, 3, 1, 2, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 117
		gunModel[65].setRotationPoint(70F, -3.2F, 0F);
		gunModel[65].rotateAngleX = 0.38397244F;
		gunModel[65].rotateAngleZ = 0.08726646F;

		gunModel[66].addShapeBox(-0.3F, 27F, -1F, 3, 1, 2, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 118
		gunModel[66].setRotationPoint(70F, -3.2F, 0F);
		gunModel[66].rotateAngleX = -0.38397244F;
		gunModel[66].rotateAngleZ = 0.08726646F;

		gunModel[67].addShapeBox(0.5F, 6F, -1F, 2, 21, 2, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 119
		gunModel[67].setRotationPoint(70F, -3.2F, 0F);
		gunModel[67].rotateAngleX = -0.38397244F;
		gunModel[67].rotateAngleZ = 0.08726646F;

		gunModel[68].addShapeBox(0F, 0F, -1F, 2, 6, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 120
		gunModel[68].setRotationPoint(70F, -3.2F, 0F);
		gunModel[68].rotateAngleX = -0.38397244F;
		gunModel[68].rotateAngleZ = 0.08726646F;


		defaultStockModel = new ModelRendererTurbo[11];
		defaultStockModel[0] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 97
		defaultStockModel[1] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 98
		defaultStockModel[2] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 99
		defaultStockModel[3] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 103
		defaultStockModel[4] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 104
		defaultStockModel[5] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 105
		defaultStockModel[6] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 106
		defaultStockModel[7] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 107
		defaultStockModel[8] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 108
		defaultStockModel[9] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 109
		defaultStockModel[10] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 110

		defaultStockModel[0].addBox(0F, 0F, 0F, 23, 3, 3, 0F); // Box 97
		defaultStockModel[0].setRotationPoint(-23F, -8F, 3F);

		defaultStockModel[1].addBox(0F, 0F, 0F, 23, 3, 3, 0F); // Box 98
		defaultStockModel[1].setRotationPoint(-23F, -8F, -6F);

		defaultStockModel[2].addBox(0F, 0F, 0F, 13, 3, 8, 0F); // Box 99
		defaultStockModel[2].setRotationPoint(-32F, -14F, -4F);

		defaultStockModel[3].addBox(0F, 0F, 0F, 13, 3, 8, 0F); // Box 103
		defaultStockModel[3].setRotationPoint(-30F, -3F, -4F);

		defaultStockModel[4].addBox(0F, 0F, 0F, 5, 12, 8, 0F); // Box 104
		defaultStockModel[4].setRotationPoint(-32F, -14F, -4F);
		defaultStockModel[4].rotateAngleZ = 0.17453293F;

		defaultStockModel[5].addBox(-8F, 0.5F, 0F, 9, 1, 6, 0F); // Box 105
		defaultStockModel[5].setRotationPoint(-32F, -14F, -3F);
		defaultStockModel[5].rotateAngleZ = 0.17453293F;

		defaultStockModel[6].addBox(-8F, 15.5F, 0F, 15, 1, 6, 0F); // Box 106
		defaultStockModel[6].setRotationPoint(-32F, -14F, -3F);
		defaultStockModel[6].rotateAngleZ = 0.17453293F;

		defaultStockModel[7].addBox(0F, 0F, 0F, 5, 12, 8, 0F); // Box 107
		defaultStockModel[7].setRotationPoint(-32F, -14F, -4F);
		defaultStockModel[7].rotateAngleZ = 0.17453293F;

		defaultStockModel[8].addBox(-10F, 0F, 0F, 5, 17, 5, 0F); // Box 108
		defaultStockModel[8].setRotationPoint(-32F, -14F, -2.5F);
		defaultStockModel[8].rotateAngleZ = 0.17453293F;

		defaultStockModel[9].addBox(0F, 0F, 0F, 17, 1, 6, 0F); // Box 109
		defaultStockModel[9].setRotationPoint(-23F, 0F, -3F);

		defaultStockModel[10].addBox(0F, 0F, 0F, 8, 9, 10, 0F); // Box 110
		defaultStockModel[10].setRotationPoint(-27F, -10F, -5F);


		ammoModel = new ModelRendererTurbo[36];
		ammoModel[0] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 59
		ammoModel[1] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 60
		ammoModel[2] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 61
		ammoModel[3] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 62
		ammoModel[4] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 63
		ammoModel[5] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 64
		ammoModel[6] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 65
		ammoModel[7] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 66
		ammoModel[8] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 67
		ammoModel[9] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 68
		ammoModel[10] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 69
		ammoModel[11] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 70
		ammoModel[12] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 71
		ammoModel[13] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 72
		ammoModel[14] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 73
		ammoModel[15] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 75
		ammoModel[16] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 75
		ammoModel[17] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 76
		ammoModel[18] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 77
		ammoModel[19] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 78
		ammoModel[20] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 79
		ammoModel[21] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 80
		ammoModel[22] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 81
		ammoModel[23] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 82
		ammoModel[24] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 83
		ammoModel[25] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 84
		ammoModel[26] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 85
		ammoModel[27] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 86
		ammoModel[28] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 87
		ammoModel[29] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 88
		ammoModel[30] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 89
		ammoModel[31] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 75
		ammoModel[32] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 91
		ammoModel[33] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 92
		ammoModel[34] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 93
		ammoModel[35] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 94

		ammoModel[0].addBox(0F, 0F, 0F, 15, 11, 1, 0F); // Box 59
		ammoModel[0].setRotationPoint(10F, -1F, 3F);

		ammoModel[1].addBox(0F, 0F, 0F, 15, 11, 1, 0F); // Box 60
		ammoModel[1].setRotationPoint(10F, -1F, 17F);

		ammoModel[2].addBox(0F, 0F, 0F, 15, 1, 13, 0F); // Box 61
		ammoModel[2].setRotationPoint(10F, 9F, 4F);

		ammoModel[3].addBox(0F, 0F, 0F, 1, 10, 13, 0F); // Box 62
		ammoModel[3].setRotationPoint(10F, -1F, 4F);

		ammoModel[4].addBox(0F, 0F, 0F, 1, 10, 13, 0F); // Box 63
		ammoModel[4].setRotationPoint(24F, -1F, 4F);

		ammoModel[5].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 64
		ammoModel[5].setRotationPoint(13F, -16F, 3F);

		ammoModel[6].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.4F, -0.4F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.4F, -0.4F); // Box 65
		ammoModel[6].setRotationPoint(19F, -16F, 3F);

		ammoModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.4F, -0.4F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.4F, -0.4F); // Box 66
		ammoModel[7].setRotationPoint(19F, -15.5F, 5F);

		ammoModel[8].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 67
		ammoModel[8].setRotationPoint(13F, -15.5F, 5F);

		ammoModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.4F, -0.4F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.4F, -0.4F); // Box 68
		ammoModel[9].setRotationPoint(19F, -13.5F, 6F);

		ammoModel[10].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 69
		ammoModel[10].setRotationPoint(13F, -13.5F, 6F);

		ammoModel[11].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.4F, -0.4F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.4F, -0.4F); // Box 70
		ammoModel[11].setRotationPoint(19F, -11.5F, 7F);

		ammoModel[12].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 71
		ammoModel[12].setRotationPoint(13F, -11.5F, 7F);

		ammoModel[13].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.4F, -0.4F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.4F, -0.4F); // Box 72
		ammoModel[13].setRotationPoint(19F, -9.5F, 8F);

		ammoModel[14].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 73
		ammoModel[14].setRotationPoint(13F, -9.5F, 8F);

		ammoModel[15].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.4F, -0.4F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.4F, -0.4F); // Box 75
		ammoModel[15].setRotationPoint(19F, -7.5F, 8F);

		ammoModel[16].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 75
		ammoModel[16].setRotationPoint(13F, -7.5F, 8F);

		ammoModel[17].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.4F, -0.4F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.4F, -0.4F); // Box 76
		ammoModel[17].setRotationPoint(19F, -5.5F, 8F);

		ammoModel[18].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 77
		ammoModel[18].setRotationPoint(13F, -5.5F, 8F);

		ammoModel[19].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.4F, -0.4F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.4F, -0.4F); // Box 78
		ammoModel[19].setRotationPoint(19F, -3.5F, 8F);

		ammoModel[20].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 79
		ammoModel[20].setRotationPoint(13F, -3.5F, 8F);

		ammoModel[21].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.4F, -0.4F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.4F, -0.4F); // Box 80
		ammoModel[21].setRotationPoint(19F, -1.5F, 8F);

		ammoModel[22].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 81
		ammoModel[22].setRotationPoint(13F, -1.5F, 8F);

		ammoModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F); // Box 82
		ammoModel[23].setRotationPoint(11F, -1F, 4F);

		ammoModel[24].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 83
		ammoModel[24].setRotationPoint(21F, -1F, 4F);

		ammoModel[25].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		ammoModel[25].setRotationPoint(12F, -1F, 4F);

		ammoModel[26].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		ammoModel[26].setRotationPoint(12F, -1F, 10F);

		ammoModel[27].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 86
		ammoModel[27].setRotationPoint(14F, -15.5F, 4F);
		ammoModel[27].rotateAngleX = -0.29670597F;

		ammoModel[28].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 87
		ammoModel[28].setRotationPoint(14F, -14.5F, 6.5F);
		ammoModel[28].rotateAngleX = -1.01229097F;

		ammoModel[29].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 88
		ammoModel[29].setRotationPoint(14F, -12.5F, 7.8F);
		ammoModel[29].rotateAngleX = -1.13446401F;

		ammoModel[30].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 89
		ammoModel[30].setRotationPoint(14F, -10.5F, 8.8F);
		ammoModel[30].rotateAngleX = -1.22173048F;

		ammoModel[31].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 75
		ammoModel[31].setRotationPoint(14F, -8.5F, 9.5F);
		ammoModel[31].rotateAngleX = -1.57079633F;

		ammoModel[32].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 91
		ammoModel[32].setRotationPoint(14F, -6.5F, 9.5F);
		ammoModel[32].rotateAngleX = -1.57079633F;

		ammoModel[33].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 92
		ammoModel[33].setRotationPoint(14F, -4.5F, 9.5F);
		ammoModel[33].rotateAngleX = -1.57079633F;

		ammoModel[34].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 93
		ammoModel[34].setRotationPoint(14F, -2.5F, 9.5F);
		ammoModel[34].rotateAngleX = -1.57079633F;

		ammoModel[35].addBox(0F, 0F, 0F, 11, 1, 3, 0F); // Box 94
		ammoModel[35].setRotationPoint(12F, -1F, 0F);



		barrelAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		stockAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		scopeAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		gripAttachPoint = new Vector3f(0 /16F, 0F /16F, 0F /16F);

		gunSlideDistance = 0F;
		animationType = EnumAnimationType.BULLPUP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}