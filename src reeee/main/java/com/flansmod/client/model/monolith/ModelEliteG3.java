//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelEliteG3 extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelEliteG3() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[73];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 6
		gunModel[7] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 7
		gunModel[8] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 10
		gunModel[9] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 11
		gunModel[10] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 12
		gunModel[11] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 13
		gunModel[12] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 14
		gunModel[13] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 15
		gunModel[14] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 16
		gunModel[15] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 17
		gunModel[16] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 18
		gunModel[17] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 19
		gunModel[18] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 20
		gunModel[19] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 21
		gunModel[20] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 22
		gunModel[21] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Box 23
		gunModel[22] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 24
		gunModel[23] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 25
		gunModel[24] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 26
		gunModel[25] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 27
		gunModel[26] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 28
		gunModel[27] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 29
		gunModel[28] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 30
		gunModel[29] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Box 31
		gunModel[30] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 32
		gunModel[31] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 33
		gunModel[32] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 34
		gunModel[33] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 35
		gunModel[34] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 36
		gunModel[35] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 37
		gunModel[36] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 38
		gunModel[37] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 39
		gunModel[38] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 40
		gunModel[39] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 41
		gunModel[40] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 42
		gunModel[41] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 43
		gunModel[42] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Box 44
		gunModel[43] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Box 45
		gunModel[44] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 46
		gunModel[45] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 47
		gunModel[46] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Box 48
		gunModel[47] = new ModelRendererTurbo(this, 409, 137, textureX, textureY); // Box 49
		gunModel[48] = new ModelRendererTurbo(this, 457, 137, textureX, textureY); // Box 50
		gunModel[49] = new ModelRendererTurbo(this, 377, 145, textureX, textureY); // Box 51
		gunModel[50] = new ModelRendererTurbo(this, 409, 161, textureX, textureY); // Box 52
		gunModel[51] = new ModelRendererTurbo(this, 209, 145, textureX, textureY); // Box 53
		gunModel[52] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 54
		gunModel[53] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 55
		gunModel[54] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 56
		gunModel[55] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 57
		gunModel[56] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 58
		gunModel[57] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 59
		gunModel[58] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 60
		gunModel[59] = new ModelRendererTurbo(this, 241, 145, textureX, textureY); // Box 62
		gunModel[60] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Box 63
		gunModel[61] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 64
		gunModel[62] = new ModelRendererTurbo(this, 457, 193, textureX, textureY); // Box 65
		gunModel[63] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 66
		gunModel[64] = new ModelRendererTurbo(this, 345, 145, textureX, textureY); // Box 67
		gunModel[65] = new ModelRendererTurbo(this, 57, 209, textureX, textureY); // Box 68
		gunModel[66] = new ModelRendererTurbo(this, 121, 209, textureX, textureY); // Box 69
		gunModel[67] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 70
		gunModel[68] = new ModelRendererTurbo(this, 441, 137, textureX, textureY); // Box 71
		gunModel[69] = new ModelRendererTurbo(this, 177, 209, textureX, textureY); // Box 72
		gunModel[70] = new ModelRendererTurbo(this, 225, 209, textureX, textureY); // Box 73
		gunModel[71] = new ModelRendererTurbo(this, 265, 209, textureX, textureY); // Box 75
		gunModel[72] = new ModelRendererTurbo(this, 305, 209, textureX, textureY); // Box 76

		gunModel[0].addBox(0F, 0F, 0F, 57, 6, 12, 0F); // Box 0
		gunModel[0].setRotationPoint(-73F, -32F, 0F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 16, 15, 12, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		gunModel[1].setRotationPoint(-16F, -32F, 0F);

		gunModel[2].addBox(0F, 0F, 0F, 24, 9, 12, 0F); // Box 2
		gunModel[2].setRotationPoint(-40F, -26F, 0F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 2, 9, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 3
		gunModel[3].setRotationPoint(-42F, -26F, 0F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 4, 3, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 4
		gunModel[4].setRotationPoint(-46F, -26F, 0F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 27, 15, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -3F, 0F, 0F); // Box 5
		gunModel[5].setRotationPoint(-3F, -32F, -0.5F);

		gunModel[6].addBox(0F, 0F, 0F, 96, 3, 14, 0F); // Box 6
		gunModel[6].setRotationPoint(-54F, -39F, -1F);

		gunModel[7].addBox(0F, 0F, 0F, 18, 2, 12, 0F); // Box 7
		gunModel[7].setRotationPoint(24F, -32F, 0F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 96, 5, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 10
		gunModel[8].setRotationPoint(-54F, -36F, -2F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 96, 5, 16, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		gunModel[9].setRotationPoint(-54F, -44F, -2F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 19, 5, 16, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		gunModel[10].setRotationPoint(-73F, -44F, -2F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 19, 5, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 13
		gunModel[11].setRotationPoint(-73F, -36F, -2F);

		gunModel[12].addBox(0F, 0F, 0F, 5, 3, 16, 0F); // Box 14
		gunModel[12].setRotationPoint(-73F, -39F, -2F);

		gunModel[13].addBox(0F, 0F, 0F, 14, 3, 14, 0F); // Box 15
		gunModel[13].setRotationPoint(-68F, -39F, -1F);

		gunModel[14].addBox(0F, 0F, 0F, 75, 13, 12, 0F); // Box 16
		gunModel[14].setRotationPoint(-148F, -39F, 0F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 75, 27, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -27F, 0F, 0F, -27F, 0F, 0F, 0F, 0F); // Box 17
		gunModel[15].setRotationPoint(-148F, -26F, 0F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 7, 17, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 18
		gunModel[16].setRotationPoint(-155F, -39F, 0F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 7, 18, 12, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		gunModel[17].setRotationPoint(-155F, -17F, 0F);

		gunModel[18].addBox(0F, 0F, 0F, 5, 5, 12, 0F); // Box 20
		gunModel[18].setRotationPoint(-153F, -22F, 0F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 84, 6, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F); // Box 21
		gunModel[19].setRotationPoint(42F, -36F, -2F);

		gunModel[20].addBox(0F, 0F, 0F, 19, 3, 16, 0F); // Box 22
		gunModel[20].setRotationPoint(23F, -39F, -2F);

		gunModel[21].addBox(0F, 0F, 0F, 84, 6, 16, 0F); // Box 23
		gunModel[21].setRotationPoint(42F, -42F, -2F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 84, 2, 16, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		gunModel[22].setRotationPoint(42F, -44F, -2F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 181, 2, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		gunModel[23].setRotationPoint(-55F, -47F, 1F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 181, 1, 12, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		gunModel[24].setRotationPoint(-55F, -45F, 0F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 181, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		gunModel[25].setRotationPoint(-55F, -48F, 2F);

		gunModel[26].addBox(0F, 0F, 0F, 19, 5, 7, 0F); // Box 28
		gunModel[26].setRotationPoint(126F, -38F, 2.5F);

		gunModel[27].addBox(0F, 0F, 0F, 14, 6, 8, 0F); // Box 29
		gunModel[27].setRotationPoint(145F, -38.5F, 2F);

		gunModel[28].addBox(0F, 0F, 0F, 1, 6, 8, 0F); // Box 30
		gunModel[28].setRotationPoint(131F, -38.5F, 2F);

		gunModel[29].addBox(0F, 0F, 0F, 2, 11, 8, 0F); // Box 31
		gunModel[29].setRotationPoint(126F, -42.5F, 2F);

		gunModel[30].addBox(0F, 0F, 0F, 4, 5, 6, 0F); // Box 32
		gunModel[30].setRotationPoint(126F, -47.5F, 3F);

		gunModel[31].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 33
		gunModel[31].setRotationPoint(121F, -50F, 4F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 34
		gunModel[32].setRotationPoint(121F, -52F, 7.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		gunModel[33].setRotationPoint(121F, -52F, 2.5F);

		gunModel[34].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 36
		gunModel[34].setRotationPoint(121F, -54F, 2.5F);

		gunModel[35].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 37
		gunModel[35].setRotationPoint(121F, -54F, 8.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		gunModel[36].setRotationPoint(121F, -56F, 7.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 39
		gunModel[37].setRotationPoint(121F, -56F, 2.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		gunModel[38].setRotationPoint(121F, -57F, 3.5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 4, 8, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 41
		gunModel[39].setRotationPoint(121F, -50F, 3.5F);

		gunModel[40].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 42
		gunModel[40].setRotationPoint(121F, -53F, 5.5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 18, 2, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		gunModel[41].setRotationPoint(-73F, -47F, 1F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 18, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		gunModel[42].setRotationPoint(-73F, -48F, 2F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 18, 1, 12, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		gunModel[43].setRotationPoint(-73F, -45F, 0F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		gunModel[44].setRotationPoint(-75F, -48F, 2F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		gunModel[45].setRotationPoint(-76F, -47F, 1F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		gunModel[46].setRotationPoint(-77F, -45F, 0F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 5, 5, 16, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 49
		gunModel[47].setRotationPoint(-78F, -44F, -2F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 5, 5, 16, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 50
		gunModel[48].setRotationPoint(-78F, -36F, -2F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 5, 3, 16, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 51
		gunModel[49].setRotationPoint(-78F, -39F, -2F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 10, 5, 12, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 52
		gunModel[50].setRotationPoint(-87F, -44F, 0F);

		gunModel[51].addBox(0F, 0F, 0F, 11, 2, 6, 0F); // Box 53
		gunModel[51].setRotationPoint(-56F, -50F, 3F);

		gunModel[52].addBox(0F, 0F, 0F, 10, 1, 2, 0F); // Box 54
		gunModel[52].setRotationPoint(-55F, -51F, 3F);

		gunModel[53].addBox(0F, 0F, 0F, 10, 1, 2, 0F); // Box 55
		gunModel[53].setRotationPoint(-55F, -51F, 7F);

		gunModel[54].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 56
		gunModel[54].setRotationPoint(-45F, -50F, 3F);

		gunModel[55].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 57
		gunModel[55].setRotationPoint(-44F, -49F, 3F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		gunModel[56].setRotationPoint(-41F, -49F, 3F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		gunModel[57].setRotationPoint(-56F, -52F, 3F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		gunModel[58].setRotationPoint(-56F, -52F, 7F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 16, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 62
		gunModel[59].setRotationPoint(-56F, -26F, 1F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 11, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 63
		gunModel[60].setRotationPoint(-51F, -21F, 1F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 17, 20, 10, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		gunModel[61].setRotationPoint(-62F, -16F, 1F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 16, 3, 10, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		gunModel[62].setRotationPoint(-64F, 4F, 1F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 14, 21, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 66
		gunModel[63].setRotationPoint(-45F, -17F, 1F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 7, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 67
		gunModel[64].setRotationPoint(-48F, 4F, 1F);

		gunModel[65].addBox(0F, 0F, 0F, 20, 3, 10, 0F); // Box 68
		gunModel[65].setRotationPoint(-64F, 7F, 1F);

		gunModel[66].addBox(0F, 0F, 0F, 19, 5, 10, 0F); // Box 69
		gunModel[66].setRotationPoint(-62F, 5F, 1F);
		gunModel[66].rotateAngleZ = -0.26179939F;

		gunModel[67].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 70
		gunModel[67].setRotationPoint(-11F, -17F, 3F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 6, 8, 6, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 71
		gunModel[68].setRotationPoint(-15F, -15F, 3F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 16, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F); // Box 72
		gunModel[69].setRotationPoint(-29F, -7F, 3F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 73
		gunModel[70].setRotationPoint(-35F, -9F, 3F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 75
		gunModel[71].setRotationPoint(-41F, -11F, 3F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 6, 10, 6, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 76
		gunModel[72].setRotationPoint(-4F, -21F, 3F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 385, 185, textureX, textureY); // Box 61

		ammoModel[0].addShapeBox(0F, 0F, 0F, 22, 40, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 61
		ammoModel[0].setRotationPoint(1F, -24F, 0.5F);
		ammoModel[0].rotateAngleZ = 0.05235988F;


		slideModel = new ModelRendererTurbo[3];
		slideModel[0] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 77
		slideModel[1] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 78
		slideModel[2] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 79

		slideModel[0].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 77
		slideModel[0].setRotationPoint(-26F, -17F, 3F);

		slideModel[1].addBox(0F, 0F, 0F, 2, 3, 6, 0F); // Box 78
		slideModel[1].setRotationPoint(-25F, -14F, 3F);

		slideModel[2].addBox(0F, 0F, 0F, 2, 4, 6, 0F); // Box 79
		slideModel[2].setRotationPoint(-25F, -11F, 3F);
		slideModel[2].rotateAngleZ = 0.43633231F;


		animationType = EnumAnimationType.PISTOL_CLIP;
		translateAll(40F, -4F, -6F);


		flipAll();
	}
}