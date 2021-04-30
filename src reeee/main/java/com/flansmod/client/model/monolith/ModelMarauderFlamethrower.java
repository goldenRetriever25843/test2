//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: M2A52flamethrower
// Model Creator: 
// Created on: -
// Last changed on: -

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMarauderFlamethrower extends ModelGun //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelMarauderFlamethrower() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[76];
		gunModel[0] = new ModelRendererTurbo(this, 2, 23, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 13, 23, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 20, 23, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 26, 40, textureX, textureY); // Box 8
		gunModel[4] = new ModelRendererTurbo(this, 27, 53, textureX, textureY); // Box 9
		gunModel[5] = new ModelRendererTurbo(this, 3, 40, textureX, textureY); // Box 10
		gunModel[6] = new ModelRendererTurbo(this, 4, 53, textureX, textureY); // Box 11
		gunModel[7] = new ModelRendererTurbo(this, 27, 47, textureX, textureY); // Box 12
		gunModel[8] = new ModelRendererTurbo(this, 27, 47, textureX, textureY); // Box 13
		gunModel[9] = new ModelRendererTurbo(this, 3, 40, textureX, textureY); // Box 14
		gunModel[10] = new ModelRendererTurbo(this, 4, 53, textureX, textureY); // Box 15
		gunModel[11] = new ModelRendererTurbo(this, 27, 47, textureX, textureY); // Box 16
		gunModel[12] = new ModelRendererTurbo(this, 27, 47, textureX, textureY); // Box 17
		gunModel[13] = new ModelRendererTurbo(this, 2, 16, textureX, textureY); // Box 27
		gunModel[14] = new ModelRendererTurbo(this, 38, 3, textureX, textureY); // Box 30
		gunModel[15] = new ModelRendererTurbo(this, 2, 3, textureX, textureY); // Box 31
		gunModel[16] = new ModelRendererTurbo(this, 2, 3, textureX, textureY); // Box 33
		gunModel[17] = new ModelRendererTurbo(this, 21, 3, textureX, textureY); // Box 34
		gunModel[18] = new ModelRendererTurbo(this, 38, 3, textureX, textureY); // Box 35
		gunModel[19] = new ModelRendererTurbo(this, 56, 3, textureX, textureY); // Box 37
		gunModel[20] = new ModelRendererTurbo(this, 21, 3, textureX, textureY); // Box 38
		gunModel[21] = new ModelRendererTurbo(this, 38, 18, textureX, textureY); // Box 39
		gunModel[22] = new ModelRendererTurbo(this, 38, 18, textureX, textureY); // Box 40
		gunModel[23] = new ModelRendererTurbo(this, 38, 18, textureX, textureY); // Box 41
		gunModel[24] = new ModelRendererTurbo(this, 38, 18, textureX, textureY); // Box 42
		gunModel[25] = new ModelRendererTurbo(this, 49, 63, textureX, textureY); // Box 44
		gunModel[26] = new ModelRendererTurbo(this, 35, 63, textureX, textureY); // Box 45
		gunModel[27] = new ModelRendererTurbo(this, 62, 63, textureX, textureY); // Box 46
		gunModel[28] = new ModelRendererTurbo(this, 4, 79, textureX, textureY); // Box 47
		gunModel[29] = new ModelRendererTurbo(this, 4, 68, textureX, textureY); // Box 48
		gunModel[30] = new ModelRendererTurbo(this, 4, 90, textureX, textureY); // Box 49
		gunModel[31] = new ModelRendererTurbo(this, 4, 106, textureX, textureY); // Box 50
		gunModel[32] = new ModelRendererTurbo(this, 4, 101, textureX, textureY); // Box 51
		gunModel[33] = new ModelRendererTurbo(this, 33, 106, textureX, textureY); // Box 52
		gunModel[34] = new ModelRendererTurbo(this, 33, 101, textureX, textureY); // Box 53
		gunModel[35] = new ModelRendererTurbo(this, 33, 106, textureX, textureY); // Box 54
		gunModel[36] = new ModelRendererTurbo(this, 33, 101, textureX, textureY); // Box 55
		gunModel[37] = new ModelRendererTurbo(this, 33, 101, textureX, textureY); // Box 56
		gunModel[38] = new ModelRendererTurbo(this, 33, 106, textureX, textureY); // Box 57
		gunModel[39] = new ModelRendererTurbo(this, 4, 101, textureX, textureY); // Box 58
		gunModel[40] = new ModelRendererTurbo(this, 4, 106, textureX, textureY); // Box 59
		gunModel[41] = new ModelRendererTurbo(this, 33, 101, textureX, textureY); // Box 60
		gunModel[42] = new ModelRendererTurbo(this, 33, 106, textureX, textureY); // Box 61
		gunModel[43] = new ModelRendererTurbo(this, 33, 101, textureX, textureY); // Box 62
		gunModel[44] = new ModelRendererTurbo(this, 33, 106, textureX, textureY); // Box 63
		gunModel[45] = new ModelRendererTurbo(this, 4, 101, textureX, textureY); // Box 64
		gunModel[46] = new ModelRendererTurbo(this, 4, 106, textureX, textureY); // Box 65
		gunModel[47] = new ModelRendererTurbo(this, 33, 101, textureX, textureY); // Box 66
		gunModel[48] = new ModelRendererTurbo(this, 33, 106, textureX, textureY); // Box 67
		gunModel[49] = new ModelRendererTurbo(this, 39, 80, textureX, textureY); // Box 68
		gunModel[50] = new ModelRendererTurbo(this, 56, 80, textureX, textureY); // Box 69
		gunModel[51] = new ModelRendererTurbo(this, 67, 80, textureX, textureY); // Box 71
		gunModel[52] = new ModelRendererTurbo(this, 44, 93, textureX, textureY); // Box 72
		gunModel[53] = new ModelRendererTurbo(this, 44, 101, textureX, textureY); // Box 73
		gunModel[54] = new ModelRendererTurbo(this, 44, 106, textureX, textureY); // Box 74
		gunModel[55] = new ModelRendererTurbo(this, 57, 93, textureX, textureY); // Box 75
		gunModel[56] = new ModelRendererTurbo(this, 57, 101, textureX, textureY); // Box 76
		gunModel[57] = new ModelRendererTurbo(this, 57, 107, textureX, textureY); // Box 77
		gunModel[58] = new ModelRendererTurbo(this, 57, 107, textureX, textureY); // Box 79
		gunModel[59] = new ModelRendererTurbo(this, 57, 101, textureX, textureY); // Box 80
		gunModel[60] = new ModelRendererTurbo(this, 57, 93, textureX, textureY); // Box 81
		gunModel[61] = new ModelRendererTurbo(this, 44, 93, textureX, textureY); // Box 82
		gunModel[62] = new ModelRendererTurbo(this, 44, 101, textureX, textureY); // Box 83
		gunModel[63] = new ModelRendererTurbo(this, 44, 106, textureX, textureY); // Box 84
		gunModel[64] = new ModelRendererTurbo(this, 34, 114, textureX, textureY); // Box 86
		gunModel[65] = new ModelRendererTurbo(this, 42, 114, textureX, textureY); // Box 87
		gunModel[66] = new ModelRendererTurbo(this, 52, 114, textureX, textureY); // Box 89
		gunModel[67] = new ModelRendererTurbo(this, 64, 114, textureX, textureY); // Box 90
		gunModel[68] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // Box 91
		gunModel[69] = new ModelRendererTurbo(this, 33, 126, textureX, textureY); // Box 92
		gunModel[70] = new ModelRendererTurbo(this, 10, 118, textureX, textureY); // Box 93
		gunModel[71] = new ModelRendererTurbo(this, 10, 125, textureX, textureY); // Box 94
		gunModel[72] = new ModelRendererTurbo(this, 10, 111, textureX, textureY); // Box 95
		gunModel[73] = new ModelRendererTurbo(this, 10, 111, textureX, textureY); // Box 96
		gunModel[74] = new ModelRendererTurbo(this, 10, 118, textureX, textureY); // Box 97
		gunModel[75] = new ModelRendererTurbo(this, 10, 125, textureX, textureY); // Box 98

		gunModel[0].addShapeBox(-1F, -3F, -0.5F, 2, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 0
		gunModel[0].setRotationPoint(0F, 0F, 0F);

		gunModel[1].addShapeBox(0.5F, -3F, -0.5F, 1, 2, 1, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F); // Box 1
		gunModel[1].setRotationPoint(0F, 0F, 0F);

		gunModel[2].addShapeBox(-1.5F, -3.5F, -0.5F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		gunModel[2].setRotationPoint(0F, 0F, 0F);

		gunModel[3].addShapeBox(-2.5F, -4F, -1.5F, 5, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		gunModel[3].setRotationPoint(0F, 0F, 0F);

		gunModel[4].addShapeBox(-2.5F, 4F, -1.5F, 5, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		gunModel[4].setRotationPoint(0F, 0F, 0F);

		gunModel[5].addShapeBox(-2.5F, -4F, -4.5F, 5, 7, 3, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 10
		gunModel[5].setRotationPoint(0F, 0F, 0F);

		gunModel[6].addShapeBox(-2.5F, -2F, -4.5F, 5, 7, 3, 0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		gunModel[6].setRotationPoint(0F, 0F, 0F);

		gunModel[7].addShapeBox(-2.5F, -1F, -4.5F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		gunModel[7].setRotationPoint(0F, 0F, 0F);

		gunModel[8].addShapeBox(1.5F, -1F, -4.5F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		gunModel[8].setRotationPoint(0F, 0F, 0F);

		gunModel[9].addShapeBox(-2.5F, -4F, 1.5F, 5, 7, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -4F, -1F, 0F, -4F, -1F); // Box 14
		gunModel[9].setRotationPoint(0F, 0F, 0F);

		gunModel[10].addShapeBox(-2.5F, -2F, 1.5F, 5, 7, 3, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 15
		gunModel[10].setRotationPoint(0F, 0F, 0F);

		gunModel[11].addShapeBox(1.5F, -1F, 3.5F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		gunModel[11].setRotationPoint(0F, 0F, 0F);

		gunModel[12].addShapeBox(-2.5F, -1F, 3.5F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		gunModel[12].setRotationPoint(0F, 0F, 0F);

		gunModel[13].addShapeBox(-7.5F, 5F, -1.5F, 10, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		gunModel[13].setRotationPoint(0F, 0F, 0F);

		gunModel[14].addShapeBox(-11.5F, -2.8F, -4.5F, 5, 7, 3, 0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		gunModel[14].setRotationPoint(0F, 0F, 0F);
		gunModel[14].rotateAngleZ = 0.34906585F;

		gunModel[15].addShapeBox(-11.5F, -5.6F, -4.5F, 5, 7, 3, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 31
		gunModel[15].setRotationPoint(0F, 0F, 0F);
		gunModel[15].rotateAngleZ = 0.34906585F;

		gunModel[16].addShapeBox(-11.5F, -5.6F, 1.5F, 5, 7, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -4F, -1F, 0F, -4F, -1F); // Box 33
		gunModel[16].setRotationPoint(0F, 0F, 0F);
		gunModel[16].rotateAngleZ = 0.34906585F;

		gunModel[17].addShapeBox(-11.5F, -1.8F, 3.5F, 5, 3, 1, 0F, 0F, .8F, 0F, 0F, .8F, 0F, 0F, .8F, 0F, 0F, .8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		gunModel[17].setRotationPoint(0F, 0F, 0F);
		gunModel[17].rotateAngleZ = 0.34906585F;

		gunModel[18].addShapeBox(-11.5F, -2.8F, 1.5F, 5, 7, 3, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 35
		gunModel[18].setRotationPoint(0F, 0F, 0F);
		gunModel[18].rotateAngleZ = 0.34906585F;

		gunModel[19].addShapeBox(-11.5F, 3.2F, -1.5F, 5, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		gunModel[19].setRotationPoint(0F, 0F, 0F);
		gunModel[19].rotateAngleZ = 0.34906585F;

		gunModel[20].addShapeBox(-11.5F, -1.8F, -4.5F, 5, 3, 1, 0F, 0F, .8F, 0F, 0F, .8F, 0F, 0F, .8F, 0F, 0F, .8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		gunModel[20].setRotationPoint(0F, 0F, 0F);
		gunModel[20].rotateAngleZ = 0.34906585F;

		gunModel[21].addShapeBox(-10.1F, -1.8F, 3.5F, 1, 2, 1, 0F, 0F, -.5F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, -.5F, .2F, 0F, -.5F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, -.5F, .2F); // Box 39
		gunModel[21].setRotationPoint(0F, 0F, 0F);
		gunModel[21].rotateAngleZ = 0.34906585F;

		gunModel[22].addShapeBox(-9.1F, -1.8F, 3.5F, 1, 2, 1, 0F, 0F, 0F, .2F, 0F, -.5F, .2F, 0F, -.5F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, -.5F, .2F, 0F, -.5F, .2F, 0F, 0F, .2F); // Box 40
		gunModel[22].setRotationPoint(0F, 0F, 0F);
		gunModel[22].rotateAngleZ = 0.34906585F;

		gunModel[23].addShapeBox(-9.1F, -1.8F, -4.5F, 1, 2, 1, 0F, 0F, 0F, .2F, 0F, -.5F, .2F, 0F, -.5F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, -.5F, .2F, 0F, -.5F, .2F, 0F, 0F, .2F); // Box 41
		gunModel[23].setRotationPoint(0F, 0F, 0F);
		gunModel[23].rotateAngleZ = 0.34906585F;

		gunModel[24].addShapeBox(-10.1F, -1.8F, -4.5F, 1, 2, 1, 0F, 0F, -.5F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, -.5F, .2F, 0F, -.5F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, -.5F, .2F); // Box 42
		gunModel[24].setRotationPoint(0F, 0F, 0F);
		gunModel[24].rotateAngleZ = 0.34906585F;

		gunModel[25].addShapeBox(2.5F, -4F, -1.5F, 2, 9, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 44
		gunModel[25].setRotationPoint(0F, 0F, 0F);

		gunModel[26].addShapeBox(2.5F, -4F, 1.5F, 2, 9, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, -1F, 0F, -3F, 0F); // Box 45
		gunModel[26].setRotationPoint(0F, 0F, 0F);

		gunModel[27].addShapeBox(2.5F, -4F, -4.5F, 2, 9, 3, 0F, 0F, -3F, 0F, 0F, -3F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 46
		gunModel[27].setRotationPoint(0F, 0F, 0F);

		gunModel[28].addShapeBox(4.5F, -3F, -1.5F, 12, 7, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		gunModel[28].setRotationPoint(0F, 0F, 0F);

		gunModel[29].addShapeBox(4.5F, -3F, 1.5F, 12, 7, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 48
		gunModel[29].setRotationPoint(0F, 0F, 0F);

		gunModel[30].addShapeBox(4.5F, -3F, -3.5F, 12, 7, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		gunModel[30].setRotationPoint(0F, 0F, 0F);

		gunModel[31].addShapeBox(5.5F, -4.5F, -1F, 10, 1, 2, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		gunModel[31].setRotationPoint(0F, 0F, 0F);

		gunModel[32].addShapeBox(5.5F, -3.5F, -1F, 10, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Box 51
		gunModel[32].setRotationPoint(0F, 0F, 0F);

		gunModel[33].addShapeBox(15.5F, -4.5F, -1F, 1, 1, 2, 0F, 0F, 0F, -.5F, 0F, -.5F, -.7F, 0F, -.5F, -.7F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F); // Box 52
		gunModel[33].setRotationPoint(0F, 0F, 0F);

		gunModel[34].addShapeBox(15.5F, -3.5F, -1F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, -.7F, 0F, -.5F, -.7F, 0F, 0F, -.5F); // Box 53
		gunModel[34].setRotationPoint(0F, 0F, 0F);

		gunModel[35].addShapeBox(4.5F, -4.5F, -1F, 1, 1, 2, 0F, 0F, -.5F, -.7F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.5F, -.7F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F); // Box 54
		gunModel[35].setRotationPoint(0F, 0F, 0F);

		gunModel[36].addShapeBox(4.5F, -3.5F, -1F, 1, 1, 2, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, -.7F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.5F, -.7F); // Box 55
		gunModel[36].setRotationPoint(0F, 0F, 0F);

		gunModel[37].addShapeBox(15.5F, -3.5F, -1.5F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, -.7F, 0F, -.5F, -.7F, 0F, 0F, -.5F); // Box 56
		gunModel[37].setRotationPoint(0F, 0F, 0F);
		gunModel[37].rotateAngleX = -0.78539816F;

		gunModel[38].addShapeBox(15.5F, -4.5F, -1.5F, 1, 1, 2, 0F, 0F, 0F, -.5F, 0F, -.5F, -.7F, 0F, -.5F, -.7F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F); // Box 57
		gunModel[38].setRotationPoint(0F, 0F, 0F);
		gunModel[38].rotateAngleX = -0.78539816F;

		gunModel[39].addShapeBox(5.5F, -3.5F, -1.5F, 10, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Box 58
		gunModel[39].setRotationPoint(0F, 0F, 0F);
		gunModel[39].rotateAngleX = -0.78539816F;

		gunModel[40].addShapeBox(5.5F, -4.5F, -1.5F, 10, 1, 2, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		gunModel[40].setRotationPoint(0F, 0F, 0F);
		gunModel[40].rotateAngleX = -0.78539816F;

		gunModel[41].addShapeBox(4.5F, -3.5F, -1.5F, 1, 1, 2, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, -.7F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.5F, -.7F); // Box 60
		gunModel[41].setRotationPoint(0F, 0F, 0F);
		gunModel[41].rotateAngleX = -0.78539816F;

		gunModel[42].addShapeBox(4.5F, -4.5F, -1.5F, 1, 1, 2, 0F, 0F, -.5F, -.7F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.5F, -.7F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F); // Box 61
		gunModel[42].setRotationPoint(0F, 0F, 0F);
		gunModel[42].rotateAngleX = -0.78539816F;

		gunModel[43].addShapeBox(15.5F, -3.5F, -0.5F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, -.7F, 0F, -.5F, -.7F, 0F, 0F, -.5F); // Box 62
		gunModel[43].setRotationPoint(0F, 0F, 0F);
		gunModel[43].rotateAngleX = 0.78539816F;

		gunModel[44].addShapeBox(15.5F, -4.5F, -0.5F, 1, 1, 2, 0F, 0F, 0F, -.5F, 0F, -.5F, -.7F, 0F, -.5F, -.7F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F); // Box 63
		gunModel[44].setRotationPoint(0F, 0F, 0F);
		gunModel[44].rotateAngleX = 0.78539816F;

		gunModel[45].addShapeBox(5.5F, -3.5F, -0.5F, 10, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Box 64
		gunModel[45].setRotationPoint(0F, 0F, 0F);
		gunModel[45].rotateAngleX = 0.78539816F;

		gunModel[46].addShapeBox(5.5F, -4.5F, -0.5F, 10, 1, 2, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		gunModel[46].setRotationPoint(0F, 0F, 0F);
		gunModel[46].rotateAngleX = 0.78539816F;

		gunModel[47].addShapeBox(4.5F, -3.5F, -0.5F, 1, 1, 2, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, -.7F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.5F, -.7F); // Box 66
		gunModel[47].setRotationPoint(0F, 0F, 0F);
		gunModel[47].rotateAngleX = 0.78539816F;

		gunModel[48].addShapeBox(4.5F, -4.5F, -0.5F, 1, 1, 2, 0F, 0F, -.5F, -.7F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.5F, -.7F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F); // Box 67
		gunModel[48].setRotationPoint(0F, 0F, 0F);
		gunModel[48].rotateAngleX = 0.78539816F;

		gunModel[49].addShapeBox(16.5F, -2F, -2.5F, 2, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		gunModel[49].setRotationPoint(0F, 0F, 0F);

		gunModel[50].addShapeBox(17.5F, -3F, -1.5F, 1, 7, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		gunModel[50].setRotationPoint(0F, 0F, 0F);

		gunModel[51].addShapeBox(17.5F, -1F, -3.5F, 1, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		gunModel[51].setRotationPoint(0F, 0F, 0F);

		gunModel[52].addShapeBox(17.5F, -1F, -2F, 1, 2, 4, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Box 72
		gunModel[52].setRotationPoint(0F, 0F, 0F);
		gunModel[52].rotateAngleZ = 0.19198622F;

		gunModel[53].addShapeBox(17.5F, -2F, -1F, 1, 1, 2, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Box 73
		gunModel[53].setRotationPoint(0F, 0F, 0F);
		gunModel[53].rotateAngleZ = 0.19198622F;

		gunModel[54].addShapeBox(17.5F, -3F, -1F, 1, 1, 2, 0F, -.3F, 0F, -.5F, -.3F, 0F, -.5F, -.3F, 0F, -.5F, -.3F, 0F, -.5F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Box 74
		gunModel[54].setRotationPoint(0F, 0F, 0F);
		gunModel[54].rotateAngleZ = 0.19198622F;

		gunModel[55].addShapeBox(17.5F, -1.5F, -0.5F, 1, 4, 2, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Box 75
		gunModel[55].setRotationPoint(0F, 0F, 0F);
		gunModel[55].rotateAngleY = 0.19198622F;

		gunModel[56].addShapeBox(17.5F, -0.5F, 1.5F, 1, 2, 1, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Box 76
		gunModel[56].setRotationPoint(0F, 0F, 0F);
		gunModel[56].rotateAngleY = 0.19198622F;

		gunModel[57].addShapeBox(17.5F, -0.5F, 2.5F, 1, 2, 1, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, -.5F, 0F, -.3F, -.5F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, -.5F, 0F, -.3F, -.5F, 0F); // Box 77
		gunModel[57].setRotationPoint(0F, 0F, 0F);
		gunModel[57].rotateAngleY = 0.19198622F;

		gunModel[58].addShapeBox(17.5F, -0.5F, -3.5F, 1, 2, 1, 0F, -.3F, -.5F, 0F, -.3F, -.5F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, -.5F, 0F, -.3F, -.5F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Box 79
		gunModel[58].setRotationPoint(0F, 0F, 0F);
		gunModel[58].rotateAngleY = -0.19198622F;

		gunModel[59].addShapeBox(17.5F, -0.5F, -2.5F, 1, 2, 1, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Box 80
		gunModel[59].setRotationPoint(0F, 0F, 0F);
		gunModel[59].rotateAngleY = -0.19198622F;

		gunModel[60].addShapeBox(17.5F, -1.5F, -1.5F, 1, 4, 2, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Box 81
		gunModel[60].setRotationPoint(0F, 0F, 0F);
		gunModel[60].rotateAngleY = -0.19198622F;

		gunModel[61].addShapeBox(17.5F, 0F, -2F, 1, 2, 4, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Box 82
		gunModel[61].setRotationPoint(0F, 0F, 0F);
		gunModel[61].rotateAngleZ = -0.19198622F;

		gunModel[62].addShapeBox(17.5F, 2F, -1F, 1, 1, 2, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Box 83
		gunModel[62].setRotationPoint(0F, 0F, 0F);
		gunModel[62].rotateAngleZ = -0.19198622F;

		gunModel[63].addShapeBox(17.5F, 3F, -1F, 1, 1, 2, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, -.5F, -.3F, 0F, -.5F, -.3F, 0F, -.5F, -.3F, 0F, -.5F); // Box 84
		gunModel[63].setRotationPoint(0F, 0F, 0F);
		gunModel[63].rotateAngleZ = -0.19198622F;

		gunModel[64].addShapeBox(18.5F, -1.5F, 1F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F, -.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F, -.5F, 0F, -1F, 0F); // Box 86
		gunModel[64].setRotationPoint(0F, 0F, 0F);

		gunModel[65].addShapeBox(18.5F, -1.5F, -1F, 2, 4, 2, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // Box 87
		gunModel[65].setRotationPoint(0F, 0F, 0F);

		gunModel[66].addShapeBox(18.5F, -1.5F, -2F, 2, 4, 1, 0F, 0F, -1F, 0F, 0F, -1F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F); // Box 89
		gunModel[66].setRotationPoint(0F, 0F, 0F);

		gunModel[67].addShapeBox(20.5F, -0.5F, -1F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		gunModel[67].setRotationPoint(0F, 0F, 0F);

		gunModel[68].addShapeBox(21.5F, -0.5F, -1F, 4, 1, 2, 0F, 0F, .7F, 0F, 0F, .7F, 0F, 0F, .7F, 0F, 0F, .7F, 0F, 0F, 0F, .7F, 0F, 0F, .7F, 0F, 0F, .7F, 0F, 0F, .7F); // Box 91
		gunModel[68].setRotationPoint(0F, 0F, 0F);

		gunModel[69].addShapeBox(21.5F, 0.5F, -1F, 4, 1, 2, 0F, 0F, 0F, .7F, 0F, 0F, .7F, 0F, 0F, .7F, 0F, 0F, .7F, 0F, .7F, 0F, 0F, .7F, 0F, 0F, .7F, 0F, 0F, .7F, 0F); // Box 92
		gunModel[69].setRotationPoint(0F, 0F, 0F);

		gunModel[70].addShapeBox(6.5F, 2.5F, 3F, 8, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		gunModel[70].setRotationPoint(0F, 0F, 0F);

		gunModel[71].addShapeBox(6.5F, 2.5F, 4F, 8, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 94
		gunModel[71].setRotationPoint(0F, 0F, 0F);

		gunModel[72].addShapeBox(6.5F, 2.5F, 2F, 8, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		gunModel[72].setRotationPoint(0F, 0F, 0F);

		gunModel[73].addShapeBox(6.5F, 2.5F, -5F, 8, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		gunModel[73].setRotationPoint(0F, 0F, 0F);

		gunModel[74].addShapeBox(6.5F, 2.5F, -4F, 8, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		gunModel[74].setRotationPoint(0F, 0F, 0F);

		gunModel[75].addShapeBox(6.5F, 2.5F, -3F, 8, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 98
		gunModel[75].setRotationPoint(0F, 0F, 0F);



		translateAll(0F, -2.2F, 0F);


		flipAll();
	}
}